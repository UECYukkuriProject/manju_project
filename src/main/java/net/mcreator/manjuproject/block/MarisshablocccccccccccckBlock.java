
package net.mcreator.manjuproject.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class MarisshablocccccccccccckBlock extends Block {
	public MarisshablocccccccccccckBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.FIRE).sound(SoundType.GLASS).strength(10000f).lightLevel(s -> 15).friction(5f).speedFactor(1000f).jumpFactor(1000f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u9B54\u7406\u6C99\u306B\u3088\u308B\u970A\u5922\u306E\u305F\u3081\u306E\u30C1\u30EB\u30CE"));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
		return context.getItemInHand().getItem() != this.asItem();
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 64));
	}
}