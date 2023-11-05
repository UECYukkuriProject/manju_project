
package net.mcreator.manjuproject.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class MarishablockBlock extends Block {
	public MarishablockBlock() {
		super(BlockBehaviour.Properties.of(Material.EXPLOSIVE, MaterialColor.FIRE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.basalt_deltas.loop")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.hanging_roots.fall")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.nether_wastes.loop")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.place"))))
				.strength(-1, 3600000).lightLevel(s -> 13).friction(1f).speedFactor(130.7f).jumpFactor(111f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u3086\u3063\u304F\u308A\u970A\u5922\u3060\u305C\uFF08\u307E\u308A\u3057\u3083\uFF09"));
	}

	@Override
	public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return new float[]{0.8f, 0.2f, 1f};
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
		return 15f;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 10;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 50;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
		return true;
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(Blocks.DIAMOND_ORE, 3));
	}
}