
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fossilminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.fossilminecraft.world.inventory.TrexMedalGUIMenu;
import net.mcreator.fossilminecraft.world.inventory.SonarUpgradeGUIMenu;
import net.mcreator.fossilminecraft.world.inventory.ShanshanMedalGUIMenu;
import net.mcreator.fossilminecraft.world.inventory.ReviverGUIMenu;
import net.mcreator.fossilminecraft.world.inventory.CleanerGUIMenu;
import net.mcreator.fossilminecraft.FossilMinecraftMod;

public class FossilMinecraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FossilMinecraftMod.MODID);
	public static final RegistryObject<MenuType<CleanerGUIMenu>> CLEANER_GUI = REGISTRY.register("cleaner_gui", () -> IForgeMenuType.create(CleanerGUIMenu::new));
	public static final RegistryObject<MenuType<ReviverGUIMenu>> REVIVER_GUI = REGISTRY.register("reviver_gui", () -> IForgeMenuType.create(ReviverGUIMenu::new));
	public static final RegistryObject<MenuType<SonarUpgradeGUIMenu>> SONAR_UPGRADE_GUI = REGISTRY.register("sonar_upgrade_gui", () -> IForgeMenuType.create(SonarUpgradeGUIMenu::new));
	public static final RegistryObject<MenuType<TrexMedalGUIMenu>> TREX_MEDAL_GUI = REGISTRY.register("trex_medal_gui", () -> IForgeMenuType.create(TrexMedalGUIMenu::new));
	public static final RegistryObject<MenuType<ShanshanMedalGUIMenu>> SHANSHAN_MEDAL_GUI = REGISTRY.register("shanshan_medal_gui", () -> IForgeMenuType.create(ShanshanMedalGUIMenu::new));
}
