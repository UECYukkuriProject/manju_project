
package net.mcreator.manjuproject.item;

import net.minecraft.network.chat.Component;

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
