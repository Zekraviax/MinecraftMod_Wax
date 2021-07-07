package net.wax.wax.block;

import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;

public class AbstractFluidBlock extends FluidBlock {
    protected AbstractFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }
}