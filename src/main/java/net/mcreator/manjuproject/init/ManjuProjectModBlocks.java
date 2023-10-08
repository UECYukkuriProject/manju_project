
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manjuproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.manjuproject.block.ReimuOreBlock;
import net.mcreator.manjuproject.block.ReimuBlockBlock;
import net.mcreator.manjuproject.ManjuProjectMod;

public class ManjuProjectModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ManjuProjectMod.MODID);
	public static final RegistryObject<Block> REIMU_ORE = REGISTRY.register("reimu_ore", () -> new ReimuOreBlock());
	public static final RegistryObject<Block> REIMU_BLOCK = REGISTRY.register("reimu_block", () -> new ReimuBlockBlock());
}
