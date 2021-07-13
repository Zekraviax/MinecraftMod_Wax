package net.wax.wax.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {

    public static final FlowableFluid LIQUID_WAX_BLACK = new LiquidWaxBlack.Still();
    public static final FlowableFluid LIQUID_WAX_BLUE = new LiquidWaxBlue.Still();
    public static final FlowableFluid LIQUID_WAX_BROWN = new LiquidWaxBrown.Still();
    public static final FlowableFluid LIQUID_WAX_CYAN = new LiquidWaxCyan.Still();
    public static final FlowableFluid LIQUID_WAX_GRAY = new LiquidWaxGray.Still();
    public static final FlowableFluid LIQUID_WAX_GREEN = new LiquidWaxGreen.Still();
    public static final FlowableFluid LIQUID_WAX_LIGHT_BLUE = new LiquidWaxLightBlue.Still();
    public static final FlowableFluid LIQUID_WAX_LIGHT_GRAY = new LiquidWaxLightGray.Still();
    public static final FlowableFluid LIQUID_WAX_LIME = new LiquidWaxLime.Still();
    public static final FlowableFluid LIQUID_WAX_MAGENTA = new LiquidWaxMagenta.Still();

    public static final FlowableFluid LIQUID_WAX_BLACK_FLOWING = new LiquidWaxBlack.Flowing();
    public static final FlowableFluid LIQUID_WAX_BLUE_FLOWING = new LiquidWaxBlue.Flowing();
    public static final FlowableFluid LIQUID_WAX_BROWN_FLOWING = new LiquidWaxBrown.Flowing();
    public static final FlowableFluid LIQUID_WAX_CYAN_FLOWING = new LiquidWaxCyan.Flowing();
    public static final FlowableFluid LIQUID_WAX_GRAY_FLOWING = new LiquidWaxGray.Flowing();
    public static final FlowableFluid LIQUID_WAX_GREEN_FLOWING = new LiquidWaxGreen.Flowing();
    public static final FlowableFluid LIQUID_WAX_LIGHT_BLUE_FLOWING = new LiquidWaxLightBlue.Flowing();
    public static final FlowableFluid LIQUID_WAX_LIGHT_GRAY_FLOWING = new LiquidWaxLightGray.Flowing();
    public static final FlowableFluid LIQUID_WAX_LIME_FLOWING = new LiquidWaxLime.Flowing();
    public static final FlowableFluid LIQUID_WAX_MAGENTA_FLOWING = new LiquidWaxMagenta.Flowing();

    public static void RegisterFluids() {
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_black"), LIQUID_WAX_BLACK);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_blue"), LIQUID_WAX_BLUE);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_brown"), LIQUID_WAX_BROWN);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_cyan"), LIQUID_WAX_CYAN);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_gray"), LIQUID_WAX_GRAY);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_green"), LIQUID_WAX_GREEN);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_light_blue"), LIQUID_WAX_LIGHT_BLUE);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_light_gray"), LIQUID_WAX_LIGHT_GRAY);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_lime"), LIQUID_WAX_LIME);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_magenta"), LIQUID_WAX_MAGENTA);

        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_black_flowing"), LIQUID_WAX_BLACK_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_blue_flowing"), LIQUID_WAX_BLUE_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_brown_flowing"), LIQUID_WAX_BROWN_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_cyan_flowing"), LIQUID_WAX_CYAN_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_gray_flowing"), LIQUID_WAX_GRAY_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_green_flowing"), LIQUID_WAX_GREEN_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_light_blue_flowing"), LIQUID_WAX_LIGHT_BLUE_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_light_gray_flowing"), LIQUID_WAX_LIGHT_GRAY_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_lime_flowing"), LIQUID_WAX_LIME_FLOWING);
        Registry.register(Registry.FLUID, new Identifier("wax", "liquid_wax_magenta_flowing"), LIQUID_WAX_MAGENTA_FLOWING);
    }
}
