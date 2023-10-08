
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

import net.mcreator.manjuproject.item.ReimuSwordItem;
import net.mcreator.manjuproject.item.ReimuShovelItem;
import net.mcreator.manjuproject.item.ReimuPickaxeItem;
import net.mcreator.manjuproject.item.ReimuIngotItem;
import net.mcreator.manjuproject.item.ReimuHoeItem;
import net.mcreator.manjuproject.item.ReimuAxeItem;
import net.mcreator.manjuproject.item.ReimuArmorItem;
import net.mcreator.manjuproject.item.MaxToolItem;
import net.mcreator.manjuproject.ManjuProjectMod;

public class ManjuProjectModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ManjuProjectMod.MODID);
	public static final RegistryObject<Item> MAX_TOOL = REGISTRY.register("max_tool", () -> new MaxToolItem());
	public static final RegistryObject<Item> REIMU_INGOT = REGISTRY.register("reimu_ingot", () -> new ReimuIngotItem());
	public static final RegistryObject<Item> REIMU_ORE = block(ManjuProjectModBlocks.REIMU_ORE, null);
	public static final RegistryObject<Item> REIMU_BLOCK = block(ManjuProjectModBlocks.REIMU_BLOCK, null);
	public static final RegistryObject<Item> REIMU_PICKAXE = REGISTRY.register("reimu_pickaxe", () -> new ReimuPickaxeItem());
	public static final RegistryObject<Item> REIMU_AXE = REGISTRY.register("reimu_axe", () -> new ReimuAxeItem());
	public static final RegistryObject<Item> REIMU_SWORD = REGISTRY.register("reimu_sword", () -> new ReimuSwordItem());
	public static final RegistryObject<Item> REIMU_SHOVEL = REGISTRY.register("reimu_shovel", () -> new ReimuShovelItem());
	public static final RegistryObject<Item> REIMU_HOE = REGISTRY.register("reimu_hoe", () -> new ReimuHoeItem());
	public static final RegistryObject<Item> REIMU_ARMOR_HELMET = REGISTRY.register("reimu_armor_helmet", () -> new ReimuArmorItem.Helmet());
	public static final RegistryObject<Item> REIMU_ARMOR_CHESTPLATE = REGISTRY.register("reimu_armor_chestplate", () -> new ReimuArmorItem.Chestplate());
	public static final RegistryObject<Item> REIMU_ARMOR_LEGGINGS = REGISTRY.register("reimu_armor_leggings", () -> new ReimuArmorItem.Leggings());
	public static final RegistryObject<Item> REIMU_ARMOR_BOOTS = REGISTRY.register("reimu_armor_boots", () -> new ReimuArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
