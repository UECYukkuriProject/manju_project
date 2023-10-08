
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manjuproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.manjuproject.world.features.ores.MarishablockFeature;
import net.mcreator.manjuproject.ManjuProjectMod;

@Mod.EventBusSubscriber
public class ManjuProjectModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ManjuProjectMod.MODID);
	public static final RegistryObject<Feature<?>> MARISHABLOCK = REGISTRY.register("marishablock", MarishablockFeature::feature);
}
