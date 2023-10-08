
package net.mcreator.manjuproject.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReimuIngotItem extends Item {
	public ReimuIngotItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
