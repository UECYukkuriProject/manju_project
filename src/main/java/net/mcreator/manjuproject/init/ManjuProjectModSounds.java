
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manjuproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.manjuproject.ManjuProjectMod;

public class ManjuProjectModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ManjuProjectMod.MODID);
	public static final RegistryObject<SoundEvent> REIMUDISKMUSIC = REGISTRY.register("reimudiskmusic", () -> new SoundEvent(new ResourceLocation("manju_project", "reimudiskmusic")));
}
