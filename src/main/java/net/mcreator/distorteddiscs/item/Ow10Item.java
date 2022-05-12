
package net.mcreator.distorteddiscs.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.distorteddiscs.init.DistortedDiscsModTabs;
import net.mcreator.distorteddiscs.init.DistortedDiscsModSounds;

public class Ow10Item extends RecordItem {
	public Ow10Item() {
		super(0, DistortedDiscsModSounds.REGISTRY.get(new ResourceLocation("distorted_discs:ow_10")),
				new Item.Properties().tab(DistortedDiscsModTabs.TAB_DISTORTEDDISCS).stacksTo(1).rarity(Rarity.RARE));
	}
}
