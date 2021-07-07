package net.wax.wax.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.dimension.DimensionType;

import java.awt.*;
import java.util.Random;

import static net.minecraft.block.SnowBlock.LAYERS;

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
        System.out.println("Dimension: " + world.getRegistryManager().get(Registry.DIMENSION_TYPE_KEY).get(DimensionType.THE_NETHER_ID).toString());

        if (world.getRegistryManager().get(Registry.DIMENSION_TYPE_KEY).get(DimensionType.THE_NETHER_ID) == world.getDimension()) {
            ChangeHeatValue(state, world, pos, 4);
            System.out.println("Dimension: THE NETHER");
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
        int heatInt = (Integer) state.get(HEAT);

        if (heatInt + HeatValue > 10) {
            HeatValue = heatInt - 10;
        }

        world.setBlockState(pos, state.with(HEAT, heatInt + HeatValue), Block.NO_REDRAW);

        if ((Integer) state.get(HEAT) >= HEAT.getValues().size() - 1) {
            ReplacementBlock = ModBlocks.LIQUID_WAX_BLACK_BLOCK.getDefaultState();

            replace(state, ReplacementBlock, world, pos, 3);
        }
    }
}