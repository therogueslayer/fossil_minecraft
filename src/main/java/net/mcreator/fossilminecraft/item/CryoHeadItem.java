
package net.mcreator.fossilminecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CryoHeadItem extends Item {
	public CryoHeadItem() {
		super(new Item.Properties().stacksTo(4).rarity(Rarity.COMMON));
	}
}
