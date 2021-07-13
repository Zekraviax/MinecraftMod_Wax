package net.wax.wax.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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

public class WaxBlock extends Block {

    // Wax blocks melt into liquid when exposed to 'heat'.
    public static final IntProperty HEAT = IntProperty.of("dryness", 0, 10);

    public BlockState ReplacementBlock;

    public WaxBlock(Settings settings) {
        super(settings);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(HEAT);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        //System.out.println("Dimension: " + world.getRegistryManager().get(Registry.DIMENSION_TYPE_KEY).get(DimensionType.THE_NETHER_ID).toString());

        if (world.getRegistryManager().get(Registry.DIMENSION_TYPE_KEY).get(DimensionType.THE_NETHER_ID) == world.getDimension()) {
            ChangeHeatValue(state, world, pos, 4);
            //System.out.println("Dimension: THE NETHER");
        }

        super.scheduledTick(state, world, pos, random);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (neighborState.getBlock() == Blocks.LAVA ||
            neighborState.getFluidState().getFluid() == Fluids.LAVA ||
            neighborState.getFluidState().getFluid() == Fluids.FLOWING_LAVA) {
            ChangeHeatValue(state, world, pos, 5);
        } else if (neighborState.getBlock() == Blocks.CAMPFIRE ||
            neighborState.getBlock() == Blocks.FIRE) {
            ChangeHeatValue(state, world, pos, 3);
        } else if (neighborState.getBlock() == Blocks.TORCH ||
            neighborState.getBlock() == Blocks.LANTERN) {
            ChangeHeatValue(state, world, pos, 1);
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

            if (this.getDefaultState() == ModBlocks.WAX_BLOCK_BLACK.getDefaultState()) {
                ReplacementBlock = ModBlocks.LIQUID_WAX_BLACK_BLOCK.getDefaultState();
            } else if (this.getDefaultState() == ModBlocks.WAX_BLOCK_BLUE.getDefaultState()) {
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
            } else {
                ReplacementBlock = ModBlocks.LIQUID_WAX_BLACK_BLOCK.getDefaultState();
            }

            System.out.println(this.getDefaultState().toString());

            replace(state, ReplacementBlock, world, pos, 3);
        }
    }
}