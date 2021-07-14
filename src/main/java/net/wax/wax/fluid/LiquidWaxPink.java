package net.wax.wax.fluid;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.wax.wax.block.ModBlocks;
import net.wax.wax.item.ModItems;

public abstract class LiquidWaxPink extends AbstractFluid {

    @Override
    public Fluid getStill() { return ModFluids.LIQUID_WAX_PINK; }

    @Override
    public Fluid getFlowing() {
        return ModFluids.LIQUID_WAX_PINK_FLOWING;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.LIQUID_WAX_PINK_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return ModBlocks.LIQUID_WAX_PINK_BLOCK.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    public static class Flowing extends LiquidWaxPink {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends LiquidWaxPink {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}