
package net.mcreator.fossilminecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fossilminecraft.entity.ShanShanEntity;
import net.mcreator.fossilminecraft.client.model.ModelShanShan;

public class ShanShanRenderer extends MobRenderer<ShanShanEntity, ModelShanShan<ShanShanEntity>> {
	public ShanShanRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelShanShan(context.bakeLayer(ModelShanShan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShanShanEntity entity) {
		return new ResourceLocation("fossil_minecraft:textures/entities/009-shanshan.png");
	}
}
