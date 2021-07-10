package net.wax.wax.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wax.wax.Wax;
import net.wax.wax.fluid.ModFluids;

public class ModBlocks {
    public static Block WAX_BLOCK_BLACK = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.5f));
    public static Block WAX_BLOCK_BLUE = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.5f));
    public static Block WAX_BLOCK_BROWN = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.5f));

    public static Block LIQUID_WAX_BLACK_BLOCK = new LiquidWaxBlackBlock(ModFluids.LIQUID_WAX_BLACK, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_BLUE_BLOCK = new LiquidWaxBlueBlock(ModFluids.LIQUID_WAX_BLUE, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_BROWN_BLOCK = new LiquidWaxBlueBlock(ModFluids.LIQUID_WAX_BROWN, FabricBlockSettings.copy(Blocks.WATER));

    public static Block WAX_SHEET_BLACK = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_BLUE = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));
    public static Block WAX_SHEET_BROWN = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));

    public static void RegisterBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_black"), WAX_BLOCK_BLACK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_blue"), WAX_BLOCK_BLUE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_brown"), WAX_BLOCK_BROWN);

        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_black"), LIQUID_WAX_BLACK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_blue"), LIQUID_WAX_BLUE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_brown"), LIQUID_WAX_BROWN_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_black"), WAX_SHEET_BLACK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_blue"), WAX_SHEET_BLUE);
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_brown"), WAX_SHEET_BROWN);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_black"),
                new BlockItem(WAX_BLOCK_BLACK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_blue"),
                new BlockItem(WAX_BLOCK_BLUE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_brown"),
                new BlockItem(WAX_BLOCK_BROWN, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_black"),
                new BlockItem(WAX_SHEET_BLACK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_blue"),
                new BlockItem(WAX_SHEET_BLUE, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_brown"),
                new BlockItem(WAX_SHEET_BROWN, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
    }
}
