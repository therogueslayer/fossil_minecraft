
package net.mcreator.fossilminecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HammerItem extends Item {
	public HammerItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
