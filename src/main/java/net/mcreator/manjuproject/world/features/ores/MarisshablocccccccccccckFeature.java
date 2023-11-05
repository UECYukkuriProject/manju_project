
package net.mcreator.manjuproject.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.mcreator.manjuproject.init.ManjuProjectModBlocks;

import java.util.Set;
import java.util.List;

public class MarisshablocccccccccccckFeature extends OreFeature {
	public static MarisshablocccccccccccckFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new MarisshablocccccccccccckFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("manju_project:marisshablocccccccccccck", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), ManjuProjectModBlocks.MARISSHABLOCCCCCCCCCCCCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRANITE.defaultBlockState()), ManjuProjectModBlocks.MARISSHABLOCCCCCCCCCCCCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIORITE.defaultBlockState()), ManjuProjectModBlocks.MARISSHABLOCCCCCCCCCCCCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.ANDESITE.defaultBlockState()), ManjuProjectModBlocks.MARISSHABLOCCCCCCCCCCCCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.OAK_LOG.defaultBlockState()), ManjuProjectModBlocks.MARISSHABLOCCCCCCCCCCCCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.IRON_ORE.defaultBlockState()), ManjuProjectModBlocks.MARISSHABLOCCCCCCCCCCCCK.get().defaultBlockState())), 64));
		PLACED_FEATURE = PlacementUtils.register("manju_project:marisshablocccccccccccck", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(64), InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public MarisshablocccccccccccckFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
