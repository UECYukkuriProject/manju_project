
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manjuproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.manjuproject.item.ReeeeeeeeeimuItem;
import net.mcreator.manjuproject.item.MaxToolItem;
import net.mcreator.manjuproject.ManjuProjectMod;

public class ManjuProjectModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ManjuProjectMod.MODID);
	public static final RegistryObject<Item> MAX_TOOL = REGISTRY.register("max_tool", () -> new MaxToolItem());
	public static final RegistryObject<Item> REEEEEEEEEIMU = REGISTRY.register("reeeeeeeeeimu", () -> new ReeeeeeeeeimuItem());
	public static final RegistryObject<Item> MARIRREI_SPAWN_EGG = REGISTRY.register("marirrei_spawn_egg", () -> new ForgeSpawnEggItem(ManjuProjectModEntities.MARIRREI, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MARISSHABLOCCCCCCCCCCCCK = block(ManjuProjectModBlocks.MARISSHABLOCCCCCCCCCCCCK, CreativeModeTab.TAB_MISC);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
