
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fossilminecraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fossilminecraft.client.model.ModelVraptor;
import net.mcreator.fossilminecraft.client.model.ModelURaptor;
import net.mcreator.fossilminecraft.client.model.ModelTrex;
import net.mcreator.fossilminecraft.client.model.ModelShanShan;
import net.mcreator.fossilminecraft.client.model.ModelSeidon;
import net.mcreator.fossilminecraft.client.model.ModelCarchar;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FossilMinecraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelTrex.LAYER_LOCATION, ModelTrex::createBodyLayer);
		event.registerLayerDefinition(ModelURaptor.LAYER_LOCATION, ModelURaptor::createBodyLayer);
		event.registerLayerDefinition(ModelSeidon.LAYER_LOCATION, ModelSeidon::createBodyLayer);
		event.registerLayerDefinition(ModelVraptor.LAYER_LOCATION, ModelVraptor::createBodyLayer);
		event.registerLayerDefinition(ModelCarchar.LAYER_LOCATION, ModelCarchar::createBodyLayer);
		event.registerLayerDefinition(ModelShanShan.LAYER_LOCATION, ModelShanShan::createBodyLayer);
	}
}
