
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manjuproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.manjuproject.item.MaxToolItem;
import net.mcreator.manjuproject.item.ManjudiskItem;
import net.mcreator.manjuproject.ManjuProjectMod;

public class ManjuProjectModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ManjuProjectMod.MODID);
	public static final RegistryObject<Item> MARISHABLOCK = block(ManjuProjectModBlocks.MARISHABLOCK, null);
	public static final RegistryObject<Item> MAX_TOOL = REGISTRY.register("max_tool", () -> new MaxToolItem());
	public static final RegistryObject<Item> MANJUDISK = REGISTRY.register("manjudisk", () -> new ManjudiskItem());
	public static final RegistryObject<Item> MANJU_SPAWN_MACHINE_BLOCK = block(ManjuProjectModBlocks.MANJU_SPAWN_MACHINE_BLOCK, ManjuProjectModTabs.TAB_MANJU_PROJECT);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
