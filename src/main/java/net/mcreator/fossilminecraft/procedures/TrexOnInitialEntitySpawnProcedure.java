package net.mcreator.fossilminecraft.procedures;

import net.minecraft.world.entity.Entity;

public class TrexOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("maxHP", "600");
		entity.getPersistentData().putString("HP", "600");
		entity.getPersistentData().putString("maxAttack", "99");
		entity.getPersistentData().putString("Attack", "99");
		entity.getPersistentData().putString("maxDefense", "50");
		entity.getPersistentData().putString("Defense", "50");
		entity.getPersistentData().putString("maxAccuracy", "43");
		entity.getPersistentData().putString("Accuracy", "43");
		entity.getPersistentData().putString("maxSpeed", "12");
		entity.getPersistentData().putString("Speed", "12");
		entity.getPersistentData().putString("maxCrit", "15");
		entity.getPersistentData().putString("Crit", "15");
		entity.getPersistentData().putString("AppliedToOwnAZ", "true");
		entity.getPersistentData().putString("SupportAtt", "-30");
		entity.getPersistentData().putString("SupportDef", "-30");
		entity.getPersistentData().putString("SupportAcc", "-30");
		entity.getPersistentData().putString("SupportSpd", "-30");
		entity.getPersistentData().putString("Range", "1");
		entity.getPersistentData().putString("Element", "1");
	}
}
