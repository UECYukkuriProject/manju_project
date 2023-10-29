
package net.mcreator.manjuproject.world.features.ores;

public class MarishablockFeature extends OreFeature {

	public static MarishablockFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new MarishablockFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("manju_project:marishablock", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), ManjuProjectModBlocks.MARISHABLOCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRANITE.defaultBlockState()), ManjuProjectModBlocks.MARISHABLOCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.DIORITE.defaultBlockState()), ManjuProjectModBlocks.MARISHABLOCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.ANDESITE.defaultBlockState()), ManjuProjectModBlocks.MARISHABLOCK.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(Blocks.GRASS_BLOCK.defaultBlockState()), ManjuProjectModBlocks.MARISHABLOCK.get().defaultBlockState())), 33));
		PLACED_FEATURE = PlacementUtils.register("manju_project:marishablock", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public MarishablockFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

}
