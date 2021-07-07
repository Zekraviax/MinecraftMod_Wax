package net.wax.wax.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

import java.util.Random;

import static net.minecraft.block.SnowBlock.LAYERS;

public class LiquidWaxBlock extends AbstractFluidBlock {

    // Counter that tracks how long a fluid has been 'drying'
    // Once the counter reaches the maximum, the fluid will solidify.
    public static final IntProperty DRYNESS = IntProperty.of("dryness", 0, 50);
    // The block to replace wax with when it dries up.
    public BlockState ReplacementBlock;

    protected LiquidWaxBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(DRYNESS, 1));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(DRYNESS);
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.getBlockTickScheduler().schedule(pos, this, 1);

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);
        int drynessInt = (Integer) state.get(DRYNESS);

        if ((Integer) state.get(DRYNESS) >= DRYNESS.getValues().size() - 1) {
            int fluidLevel = state.get(LEVEL);

            //System.out.println(this.toString() + " Dried up: (fluidLevel:" + fluidLevel + ")");

            if (fluidLevel > 8)
                ReplacementBlock = ModBlocks.WAX_SHEET_BLACK.getDefaultState().with(LAYERS, 0);
            else if (fluidLevel == 0)
                ReplacementBlock = ModBlocks.WAX_SHEET_BLACK.getDefaultState().with(LAYERS, 8);
            else
                ReplacementBlock = ModBlocks.WAX_SHEET_BLACK.getDefaultState().with(LAYERS, 8 - fluidLevel);


            replace(state, ReplacementBlock, world, pos, 3);
        } else {
            world.setBlockState(pos, state.with(DRYNESS, drynessInt + 1), Block.NO_REDRAW);
        }
    }
}