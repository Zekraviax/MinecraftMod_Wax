package net.wax.wax;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.wax.wax.block.ModBlocks;
import net.wax.wax.fluid.ModFluids;
import net.wax.wax.item.ModItems;

public class Wax implements ModInitializer {

	// Item Groups
	public static final ItemGroup WAX_ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("wax", "wax_item_group"), () -> new ItemStack(ModBlocks.WAX_BLOCK_BLACK));

	@Override
	public void onInitialize() {
		ModBlocks.RegisterBlocks();
		ModItems.RegisterItems();
		ModFluids.RegisterFluids();
	}
}