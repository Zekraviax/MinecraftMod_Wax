package net.wax.wax.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wax.wax.Wax;
import net.wax.wax.fluid.ModFluids;

public class ModBlocks {
    public static Block WAX_BLOCK_BLACK = new WaxBlock(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(0.5f));

    public static Block LIQUID_WAX_BLACK_BLOCK = new LiquidWaxBlackBlock(ModFluids.LIQUID_WAX_BLACK, FabricBlockSettings.copy(Blocks.WATER));
    public static Block LIQUID_WAX_BLUE_BLOCK = new LiquidWaxBlueBlock(ModFluids.LIQUID_WAX_BLUE, FabricBlockSettings.copy(Blocks.WATER));

    public static Block WAX_SHEET_BLACK = new WaxSheet(FabricBlockSettings.copy(Blocks.SNOW));

    public static void RegisterBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_block_black"), WAX_BLOCK_BLACK);

        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_black"), LIQUID_WAX_BLACK_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("wax", "liquid_wax_blue"), LIQUID_WAX_BLUE_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier("wax", "wax_sheet_black"), WAX_SHEET_BLACK);

        // Block Items
        Registry.register(Registry.ITEM, new Identifier("wax", "wax_block_black"),
                new BlockItem(WAX_BLOCK_BLACK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier("wax", "wax_sheet_black"),
                new BlockItem(WAX_SHEET_BLACK, new FabricItemSettings().group(Wax.WAX_ITEM_GROUP)));
    }
}
