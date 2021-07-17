package net.wax.wax.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

import static net.minecraft.block.SnowBlock.LAYERS;

public class LiquidWaxBlueBlock extends LiquidWaxBlock {

    protected LiquidWaxBlueBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        super.scheduledTick(state, world, pos, random);
        int drynessInt = state.get(DRYNESS);

        if (state.get(DRYNESS) >= DRYNESS.getValues().size() - 1) {
            int fluidLevel = state.get(LEVEL);

            if (fluidLevel > 8)
                ReplacementBlock = ModBlocks.WAX_SHEET_BLUE.getDefaultState().with(LAYERS, 0);
            else if (fluidLevel == 0)
                ReplacementBlock = ModBlocks.WAX_SHEET_BLUE.getDefaultState().with(LAYERS, 8);
            else
                ReplacementBlock = ModBlocks.WAX_SHEET_BLUE.getDefaultState().with(LAYERS, 8 - fluidLevel);

            replace(state, ReplacementBlock, world, pos, 3);
        } else {
            world.setBlockState(pos, state.with(DRYNESS, drynessInt + 1), Block.NO_REDRAW);
        }
    }
}
