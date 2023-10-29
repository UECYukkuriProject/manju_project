
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manjuproject.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ManjuProjectModTabs {
	public static CreativeModeTab TAB_MANJU_PROJECT;

	public static void load() {
		TAB_MANJU_PROJECT = new CreativeModeTab("tabmanju_project") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ManjuProjectModBlocks.MARISHABLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
