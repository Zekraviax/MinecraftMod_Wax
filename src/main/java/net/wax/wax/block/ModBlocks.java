package net.wax.wax.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.TallBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wax.wax.Wax;
import net.wax.wax.fluid.ModFluids;

public class ModBlocks {
    public static Block WAX_BLOCK_BLACK = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_BLUE = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_BROWN = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_CYAN = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_GRAY = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_GREEN = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_LIGHT_BLUE = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_LIGHT_GRAY = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_LIME = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_MAGENTA = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_ORANGE = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_PINK = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_PURPLE = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_RED = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_UNCOLOURED = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_WHITE = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));
    public static Block WAX_BLOCK_YELLOW = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));

    public static Block LIQUID_WAX_BLACK_BLOCK = new LiquidWaxBlackBlock(ModFluids.LIQUID_WAX_BLACK, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_BLUE_BLOCK = new LiquidWaxBlueBlock(ModFluids.LIQUID_WAX_BLUE, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_BROWN_BLOCK = new LiquidWaxBrownBlock(ModFluids.LIQUID_WAX_BROWN, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_CYAN_BLOCK = new LiquidWaxCyanBlock(ModFluids.LIQUID_WAX_CYAN, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_GRAY_BLOCK = new LiquidWaxGrayBlock(ModFluids.LIQUID_WAX_GRAY, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_GREEN_BLOCK = new LiquidWaxGreenBlock(ModFluids.LIQUID_WAX_GREEN, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_LIGHT_BLUE_BLOCK = new LiquidWaxLightBlueBlock(ModFluids.LIQUID_WAX_LIGHT_BLUE, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_LIGHT_GRAY_BLOCK = new LiquidWaxLightGrayBlock(ModFluids.LIQUID_WAX_LIGHT_GRAY, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_LIME_BLOCK = new LiquidWaxLimeBlock(ModFluids.LIQUID_WAX_LIME, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_MAGENTA_BLOCK = new LiquidWaxMagentaBlock(ModFluids.LIQUID_WAX_MAGENTA, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_ORANGE_BLOCK = new LiquidWaxOrangeBlock(ModFluids.LIQUID_WAX_ORANGE, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_PINK_BLOCK = new LiquidWaxPinkBlock(ModFluids.LIQUID_WAX_PINK, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_PURPLE_BLOCK = new LiquidWaxPurpleBlock(ModFluids.LIQUID_WAX_PURPLE, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_RED_BLOCK = new LiquidWaxRedBlock(ModFluids.LIQUID_WAX_RED, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_UNCOLOURED_BLOCK = new LiquidWaxUncolouredBlock(ModFluids.LIQUID_WAX_UNCOLOURED, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_WHITE_BLOCK = new LiquidWaxWhiteBlock(ModFluids.LIQUID_WAX_WHITE, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_YELLOW_BLOCK = new LiquidWaxYellowBlock(ModFluids.LIQUID_WAX_YELLOW, FabricBlockSettings.copy(Blocks.WATER));

    public static Block WAX_SHEET_BLACK = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_BLUE = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_BROWN = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_CYAN = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_GRAY = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_GREEN = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_LIGHT_BLUE = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_LIGHT_GRAY = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_LIME = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_MAGENTA = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_ORANGE = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_PINK = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_PURPLE = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_RED = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_UNCOLOURED = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_WHITE = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_YELLOW = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));

    public static Block WAX_STAIRS_BLACK = new WaxStairs(WAX_BLOCK_BLACK.getDefaultState(), FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f));

    public static Block WAX_DOOR_BLACK = new WaxDoor(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.1f).nonOpaque());

    public static void RegisterBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_black"), WAX_BLOCK_BLACK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_blue"), WAX_BLOCK_BLUE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_brown"), WAX_BLOCK_BROWN);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_cyan"), WAX_BLOCK_CYAN);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_gray"), WAX_BLOCK_GRAY);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_green"), WAX_BLOCK_GREEN);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_light_blue"), WAX_BLOCK_LIGHT_BLUE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_light_gray"), WAX_BLOCK_LIGHT_GRAY);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_lime"), WAX_BLOCK_LIME);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_magenta"), WAX_BLOCK_MAGENTA);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_orange"), WAX_BLOCK_ORANGE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_pink"), WAX_BLOCK_PINK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_purple"), WAX_BLOCK_PURPLE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_red"), WAX_BLOCK_RED);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_uncoloured"), WAX_BLOCK_UNCOLOURED);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_white"), WAX_BLOCK_WHITE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_yellow"), WAX_BLOCK_YELLOW);

        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_black"), LIQUID_WAX_BLACK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_blue"), LIQUID_WAX_BLUE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_brown"), LIQUID_WAX_BROWN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_cyan"), LIQUID_WAX_CYAN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_gray"), LIQUID_WAX_GRAY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_green"), LIQUID_WAX_GREEN_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_light_blue"), LIQUID_WAX_LIGHT_BLUE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_light_gray"), LIQUID_WAX_LIGHT_GRAY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_lime"), LIQUID_WAX_LIME_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_magenta"), LIQUID_WAX_MAGENTA_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_orange"), LIQUID_WAX_ORANGE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_pink"), LIQUID_WAX_PINK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_purple"), LIQUID_WAX_PURPLE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_red"), LIQUID_WAX_RED_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_uncoloured"), LIQUID_WAX_UNCOLOURED_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_white"), LIQUID_WAX_WHITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_yellow"), LIQUID_WAX_YELLOW_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_black"), WAX_SHEET_BLACK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_blue"), WAX_SHEET_BLUE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_brown"), WAX_SHEET_BROWN);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_cyan"), WAX_SHEET_CYAN);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_gray"), WAX_SHEET_GRAY);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_green"), WAX_SHEET_GREEN);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_light_blue"), WAX_SHEET_LIGHT_BLUE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_light_gray"), WAX_SHEET_LIGHT_GRAY);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_lime"), WAX_SHEET_LIME);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_magenta"), WAX_SHEET_MAGENTA);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_orange"), WAX_SHEET_ORANGE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_pink"), WAX_SHEET_PINK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_purple"), WAX_SHEET_PURPLE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_red"), WAX_SHEET_RED);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_uncoloured"), WAX_SHEET_UNCOLOURED);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_white"), WAX_SHEET_WHITE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_yellow"), WAX_SHEET_YELLOW);

        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_stairs_black"), WAX_STAIRS_BLACK);

        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_door_black"), WAX_DOOR_BLACK);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_black"),
                new BlockItem(WAX_BLOCK_BLACK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_blue"),
                new BlockItem(WAX_BLOCK_BLUE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_brown"),
                new BlockItem(WAX_BLOCK_BROWN, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_cyan"),
                new BlockItem(WAX_BLOCK_CYAN, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_gray"),
                new BlockItem(WAX_BLOCK_GRAY, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_green"),
                new BlockItem(WAX_BLOCK_GREEN, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_light_blue"),
                new BlockItem(WAX_BLOCK_LIGHT_BLUE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_light_gray"),
                new BlockItem(WAX_BLOCK_LIGHT_GRAY, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_lime"),
                new BlockItem(WAX_BLOCK_LIME, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_magenta"),
                new BlockItem(WAX_BLOCK_MAGENTA, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_orange"),
                new BlockItem(WAX_BLOCK_ORANGE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_pink"),
                new BlockItem(WAX_BLOCK_PINK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_purple"),
                new BlockItem(WAX_BLOCK_PURPLE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_red"),
                new BlockItem(WAX_BLOCK_RED, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_uncoloured"),
                new BlockItem(WAX_BLOCK_UNCOLOURED, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_white"),
                new BlockItem(WAX_BLOCK_WHITE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_yellow"),
                new BlockItem(WAX_BLOCK_YELLOW, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_black"),
                new BlockItem(WAX_SHEET_BLACK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_blue"),
                new BlockItem(WAX_SHEET_BLUE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_brown"),
                new BlockItem(WAX_SHEET_BROWN, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_cyan"),
                new BlockItem(WAX_SHEET_CYAN, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_gray"),
                new BlockItem(WAX_SHEET_GRAY, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_green"),
                new BlockItem(WAX_SHEET_GREEN, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_light_blue"),
                new BlockItem(WAX_SHEET_LIGHT_BLUE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_light_gray"),
                new BlockItem(WAX_SHEET_LIGHT_GRAY, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_lime"),
                new BlockItem(WAX_SHEET_LIME, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_magenta"),
                new BlockItem(WAX_SHEET_MAGENTA, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_orange"),
                new BlockItem(WAX_SHEET_ORANGE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_pink"),
                new BlockItem(WAX_SHEET_PINK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_purple"),
                new BlockItem(WAX_SHEET_PURPLE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_red"),
                new BlockItem(WAX_SHEET_RED, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_uncoloured"),
                new BlockItem(WAX_SHEET_UNCOLOURED, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_white"),
                new BlockItem(WAX_SHEET_WHITE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_yellow"),
                new BlockItem(WAX_SHEET_YELLOW, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier("wax", "wax_stairs_black"),
                new BlockItem(WAX_STAIRS_BLACK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier("wax", "wax_door_black"),
                new TallBlockItem(WAX_DOOR_BLACK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
    }
}