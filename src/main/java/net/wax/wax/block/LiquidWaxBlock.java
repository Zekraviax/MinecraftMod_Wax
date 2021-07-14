package net.wax.wax.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

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
        world.getBlockTickScheduler().schedule(pos, this, 30);

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
}