
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manjuproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.manjuproject.item.MaxToolItem;
import net.mcreator.manjuproject.ManjuProjectMod;

public class ManjuProjectModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ManjuProjectMod.MODID);
	public static final RegistryObject<Item> MAX_TOOL = REGISTRY.register("max_tool", () -> new MaxToolItem());
}
