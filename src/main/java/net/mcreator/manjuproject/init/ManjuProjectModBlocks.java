
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manjuproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.manjuproject.block.MarishablockBlock;
import net.mcreator.manjuproject.block.ManjuSpawnMachineBlockBlock;
import net.mcreator.manjuproject.ManjuProjectMod;

public class ManjuProjectModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ManjuProjectMod.MODID);
	public static final RegistryObject<Block> MARISHABLOCK = REGISTRY.register("marishablock", () -> new MarishablockBlock());
	public static final RegistryObject<Block> MANJU_SPAWN_MACHINE_BLOCK = REGISTRY.register("manju_spawn_machine_block", () -> new ManjuSpawnMachineBlockBlock());
}
