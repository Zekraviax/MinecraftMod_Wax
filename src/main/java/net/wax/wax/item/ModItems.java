package net.wax.wax.item;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wax.wax.Wax;
import net.wax.wax.fluid.ModFluids;

public class ModItems {

    public static final Item WAX_FLAKE_BLACK = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_BLUE = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_BROWN = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_CYAN = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_GRAY = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_GREEN = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_LIGHT_BLUE = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_LIGHT_GRAY = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_LIME = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));
    public static final Item WAX_FLAKE_MAGENTA = new Item(new Item.Settings().group(Wax.WAX_ITEM_GROUP));

    public static final Item LIQUID_WAX_BLACK_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_BLACK, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_BLUE_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_BLUE, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_BROWN_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_BROWN, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_CYAN_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_CYAN, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_GRAY_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_GRAY, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_GREEN_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_GREEN, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_LIGHT_BLUE_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_LIGHT_BLUE, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_LIGHT_GRAY_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_LIGHT_GRAY, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_LIME_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_LIME, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));
    public static final Item LIQUID_WAX_MAGENTA_BUCKET = new BucketItem(ModFluids.LIQUID_WAX_MAGENTA, new Item.Settings().group(Wax.WAX_ITEM_GROUP).
            recipeRemainder(Items.BUCKET).maxCount(1));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_black"), WAX_FLAKE_BLACK);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_blue"), WAX_FLAKE_BLUE);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_brown"), WAX_FLAKE_BROWN);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_cyan"), WAX_FLAKE_CYAN);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_gray"), WAX_FLAKE_GRAY);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_green"), WAX_FLAKE_GREEN);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_light_blue"), WAX_FLAKE_LIGHT_BLUE);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_light_gray"), WAX_FLAKE_LIGHT_GRAY);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_lime"), WAX_FLAKE_LIME);
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_flake_magenta"), WAX_FLAKE_MAGENTA);

        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_black_bucket"), LIQUID_WAX_BLACK_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_blue_bucket"), LIQUID_WAX_BLUE_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_brown_bucket"), LIQUID_WAX_BROWN_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_cyan_bucket"), LIQUID_WAX_CYAN_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_gray_bucket"), LIQUID_WAX_GRAY_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_green_bucket"), LIQUID_WAX_GREEN_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_light_blue_bucket"), LIQUID_WAX_LIGHT_BLUE_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_light_gray_bucket"), LIQUID_WAX_LIGHT_GRAY_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_lime_bucket"), LIQUID_WAX_LIME_BUCKET);
        Registry.register(Registry.ITEM, new Identifier("wax", "liquid_wax_magenta_bucket"), LIQUID_WAX_MAGENTA_BUCKET);
    }
}
