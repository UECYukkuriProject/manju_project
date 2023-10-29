
package net.mcreator.manjuproject.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.manjuproject.init.ManjuProjectModTabs;

public class ManjudiskItem extends RecordItem {
	public ManjudiskItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("manju_project:reimudiskmusic")), new Item.Properties().tab(ManjuProjectModTabs.TAB_MANJU_PROJECT).stacksTo(1).rarity(Rarity.RARE), 100);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
