package net.wax.wax.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wax.wax.Wax;
import net.wax.wax.fluid.ModFluids;

public class ModItems {

    public static final Item WAX_FLAKE_BLACK = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_BLUE = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_BROWN = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));

    public static final Item LIQUID_WAX_BLACK_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_BLACK, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_BLUE_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_BLUE, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_BROWN_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_BROWN, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_black"), WAX_FLAKE_BLACK);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_blue"), WAX_FLAKE_BLUE);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_brown"), WAX_FLAKE_BROWN);

        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_black_bucket"), LIQUID_WAX_BLACK_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_blue_bucket"), LIQUID_WAX_BLUE_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_brown_bucket"), LIQUID_WAX_BROWN_BUCKET);
    }
}
