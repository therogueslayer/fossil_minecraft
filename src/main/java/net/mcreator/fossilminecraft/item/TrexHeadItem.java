
package net.mcreator.fossilminecraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TrexHeadItem extends Item {
	public TrexHeadItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}