package net.wax.wax.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wax.wax.Wax;
import net.wax.wax.fluid.ModFluids;

public class ModItems {

    public static final Item LIQUID_WAX_BLACK_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_BLACK, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_BLUE_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_BLUE, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_black_bucket"), LIQUID_WAX_BLACK_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_blue_bucket"), LIQUID_WAX_BLUE_BUCKET);
    }
}
