
package net.mcreator.manjuproject.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.manjuproject.procedures.ReeeeeeeeeimuburotukugaturudePoHuaisaretatokiProcedure;

import java.util.List;

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
		ReeeeeeeeeimuburotukugaturudePoHuaisaretatokiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
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
