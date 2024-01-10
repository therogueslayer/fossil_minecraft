
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fossilminecraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.fossilminecraft.client.renderer.VraptorRenderer;
import net.mcreator.fossilminecraft.client.renderer.UraptorRenderer;
import net.mcreator.fossilminecraft.client.renderer.TrexRenderer;
import net.mcreator.fossilminecraft.client.renderer.ShanShanRenderer;
import net.mcreator.fossilminecraft.client.renderer.SeidonRenderer;
import net.mcreator.fossilminecraft.client.renderer.CarcharRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FossilMinecraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FossilMinecraftModEntities.TREX.get(), TrexRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.SHAN_SHAN.get(), ShanShanRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.VRAPTOR.get(), VraptorRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.TREX_MEDAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.SHANSHAN_MEDAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.VRAPTOR_MEDAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.SEIDON.get(), SeidonRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.SEIDON_MEDAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.URAPTOR.get(), UraptorRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.URAPTOR_MEDAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FossilMinecraftModEntities.CARCHAR.get(), CarcharRenderer::new);
	}
}
