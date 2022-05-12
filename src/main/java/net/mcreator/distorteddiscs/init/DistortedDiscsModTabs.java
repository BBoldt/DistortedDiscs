
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.distorteddiscs.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DistortedDiscsModTabs {
	public static CreativeModeTab TAB_DISTORTEDDISCS;

	public static void load() {
		TAB_DISTORTEDDISCS = new CreativeModeTab("tabdistorteddiscs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DistortedDiscsModItems.NETHER_05.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
