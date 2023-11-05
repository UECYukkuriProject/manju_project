
package net.mcreator.manjuproject.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ReeeeeeeeeimuItem extends PickaxeItem {
	public ReeeeeeeeeimuItem() {
		super(new Tier() {
			public int getUses() {
				return 1;
			}

			public float getSpeed() {
				return 10100f;
			}

			public float getAttackDamageBonus() {
				return 99998f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.EXPERIENCE_BOTTLE));
			}
		}, 1, 96f, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		ReeeeeeeeeimuburotukugaturudePoHuaisaretatokiProcedure.execute();
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("subarasiiiiii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
