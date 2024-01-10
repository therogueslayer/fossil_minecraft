
package net.mcreator.fossilminecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fossilminecraft.entity.TrexEntity;
import net.mcreator.fossilminecraft.client.model.ModelTrex;

public class TrexRenderer extends MobRenderer<TrexEntity, ModelTrex<TrexEntity>> {
	public TrexRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTrex(context.bakeLayer(ModelTrex.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TrexEntity entity) {
		return new ResourceLocation("fossil_minecraft:textures/entities/001-trex.png");
	}
}
