
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fossilminecraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.fossilminecraft.client.gui.TrexMedalGUIScreen;
import net.mcreator.fossilminecraft.client.gui.SonarUpgradeGUIScreen;
import net.mcreator.fossilminecraft.client.gui.ShanshanMedalGUIScreen;
import net.mcreator.fossilminecraft.client.gui.ReviverGUIScreen;
import net.mcreator.fossilminecraft.client.gui.CleanerGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FossilMinecraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FossilMinecraftModMenus.CLEANER_GUI.get(), CleanerGUIScreen::new);
			MenuScreens.register(FossilMinecraftModMenus.REVIVER_GUI.get(), ReviverGUIScreen::new);
			MenuScreens.register(FossilMinecraftModMenus.SONAR_UPGRADE_GUI.get(), SonarUpgradeGUIScreen::new);
			MenuScreens.register(FossilMinecraftModMenus.TREX_MEDAL_GUI.get(), TrexMedalGUIScreen::new);
			MenuScreens.register(FossilMinecraftModMenus.SHANSHAN_MEDAL_GUI.get(), ShanshanMedalGUIScreen::new);
		});
	}
}
