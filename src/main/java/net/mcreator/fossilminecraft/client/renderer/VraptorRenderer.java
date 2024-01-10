
package net.mcreator.fossilminecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fossilminecraft.entity.VraptorEntity;
import net.mcreator.fossilminecraft.client.model.ModelVraptor;

public class VraptorRenderer extends MobRenderer<VraptorEntity, ModelVraptor<VraptorEntity>> {
	public VraptorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVraptor(context.bakeLayer(ModelVraptor.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VraptorEntity entity) {
		return new ResourceLocation("fossil_minecraft:textures/entities/029-v-raptor.png");
	}
}
