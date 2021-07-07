package net.wax.wax.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {

    public static final FlowableFluid LIQUID_WAX_BLACK = new LiquidWaxBlack.Still();
    public static final FlowableFluid LIQUID_WAX_BLACK_FLOWING = new LiquidWaxBlack.Flowing();

    public static final FlowableFluid LIQUID_WAX_BLUE = new LiquidWaxBlue.Still();
    public static final FlowableFluid LIQUID_WAX_BLUE_FLOWING = new LiquidWaxBlue.Flowing();

    public static void RegisterFluids() {
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_black"), LIQUID_WAX_BLACK);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_black_flowing"), LIQUID_WAX_BLACK_FLOWING);

        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_blue"), LIQUID_WAX_BLUE);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_blue_flowing"), LIQUID_WAX_BLUE_FLOWING);
    }
}
