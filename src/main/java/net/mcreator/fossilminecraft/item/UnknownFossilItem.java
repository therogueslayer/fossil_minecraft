
package net.mcreator.fossilminecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UnknownFossilItem extends Item {
	public UnknownFossilItem() {
		super(new Item.Properties().stacksTo(4).rarity(Rarity.COMMON));
	}
}
