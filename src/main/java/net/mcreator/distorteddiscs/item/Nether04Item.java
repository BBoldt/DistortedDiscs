
package net.mcreator.distorteddiscs.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.distorteddiscs.init.DistortedDiscsModTabs;
import net.mcreator.distorteddiscs.init.DistortedDiscsModSounds;

public class Nether04Item extends RecordItem {
	public Nether04Item() {
		super(0, DistortedDiscsModSounds.REGISTRY.get(new ResourceLocation("distorted_discs:nether_04")),
				new Item.Properties().tab(DistortedDiscsModTabs.TAB_DISTORTEDDISCS).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
