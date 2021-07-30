package net.wax.wax.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.dimension.DimensionType;

import java.util.Random;

public class WaxFence extends FenceBlock {
    public WaxFence(Settings settings) {
        super(settings);
    }

    public static final IntProperty HEAT = IntProperty.of("dryness", 0, 10);
    public int neighbouringHeatValues = 0;

    public BlockState ReplacementBlock;


    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(HEAT);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (neighbouringHeatValues > 0) {
            int heatInt = state.get(HEAT);
            ChangeHeatValue(state, world, pos, neighbouringHeatValues);

            world.getBlockTickScheduler().schedule(pos, this, 30);
        }

        super.scheduledTick(state, world, pos, random);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        neighbouringHeatValues = 0;

        if (neighborState.getBlock() == Blocks.LAVA || neighborState.getFluidState().getFluid() == Fluids.LAVA ||
                neighborState.getFluidState().getFluid() == Fluids.FLOWING_LAVA) {
            neighbouringHeatValues += 4;
        } else if (neighborState.getBlock() == Blocks.CAMPFIRE ||
                neighborState.getBlock() == Blocks.FIRE) {
            neighbouringHeatValues += 2;
        } else if (neighborState.getBlock() == Blocks.TORCH ||
                neighborState.getBlock() == Blocks.LANTERN) {
            neighbouringHeatValues++;
        }

        if (world.getRegistryManager().get(Registry.DIMENSION_TYPE_KEY).get(DimensionType.THE_NETHER_ID) == world.getDimension()) {
            neighbouringHeatValues += 3;
        }

        world.getBlockTickScheduler().schedule(pos, this, 1);

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public void ChangeHeatValue(BlockState state, WorldAccess world, BlockPos pos, int HeatValue) {
        int heatInt = state.get(HEAT);

        if (heatInt + HeatValue > 10) {
            HeatValue = heatInt - 10;
        }

        world.setBlockState(pos, state.with(HEAT, heatInt + HeatValue), Block.NO_REDRAW);

        if (state.get(HEAT) >= HEAT.getValues().size() - 1) {
            if (this.getDefaultState() == ModBlocks.WAX_FENCE_BLACK.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_BLACK_BLOCK.getDefaultState();
            /*} else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_BLUE.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_BLUE_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_BROWN.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_BROWN_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_CYAN.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_CYAN_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_GRAY.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_GRAY_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_GREEN.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_GREEN_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_LIGHT_BLUE.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_LIGHT_BLUE_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_LIGHT_GRAY.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_LIGHT_GRAY_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_LIME.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_LIME_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_MAGENTA.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_MAGENTA_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_ORANGE.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_ORANGE_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_PINK.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_PINK_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_PURPLE.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_PURPLE_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_RED.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_RED_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_WHITE.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_WHITE_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_YELLOW.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_YELLOW_BLOCK.getDefaultState();
            */
            } else {
                ReplacementBlock = ModBlocks.LIQUID_WAX_UNCOLOURED_BLOCK.getDefaultState();
            }
            replace(state, ReplacementBlock, world, pos, 3);
        }
    }
}
