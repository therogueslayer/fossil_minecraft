
package net.mcreator.fossilminecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fossilminecraft.entity.UraptorEntity;
import net.mcreator.fossilminecraft.client.model.ModelURaptor;

public class UraptorRenderer extends MobRenderer<UraptorEntity, ModelURaptor<UraptorEntity>> {
	public UraptorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelURaptor(context.bakeLayer(ModelURaptor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UraptorEntity entity) {
		return new ResourceLocation("fossil_minecraft:textures/entities/u-raptor.png");
	}
}
