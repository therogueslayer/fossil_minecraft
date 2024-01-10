package net.mcreator.fossilminecraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.fossilminecraft.init.FossilMinecraftModEntities;
import net.mcreator.fossilminecraft.entity.TrexEntity;

public class TrexMedalGUIReturnProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new TrexEntity(FossilMinecraftModEntities.TREX.get(), _level) : null;
	}
}
