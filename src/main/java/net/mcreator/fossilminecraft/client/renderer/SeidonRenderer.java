
package net.mcreator.fossilminecraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fossilminecraft.entity.SeidonEntity;
import net.mcreator.fossilminecraft.client.model.ModelSeidon;

public class SeidonRenderer extends MobRenderer<SeidonEntity, ModelSeidon<SeidonEntity>> {
	public SeidonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSeidon(context.bakeLayer(ModelSeidon.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeidonEntity entity) {
		return new ResourceLocation("fossil_minecraft:textures/entities/113-seidon.png");
	}
}
