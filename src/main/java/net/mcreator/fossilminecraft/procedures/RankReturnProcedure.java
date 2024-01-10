package net.mcreator.fossilminecraft.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class RankReturnProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return Math.round((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("Rank")) + "";
	}
}
