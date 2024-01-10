package net.mcreator.fossilminecraft.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fossilminecraft.entity.CarcharEntity;

public class CarcharModel extends GeoModel<CarcharEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarcharEntity entity) {
		return new ResourceLocation("fossil_minecraft", "animations/carchar-geckolib.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarcharEntity entity) {
		return new ResourceLocation("fossil_minecraft", "geo/carchar-geckolib.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarcharEntity entity) {
		return new ResourceLocation("fossil_minecraft", "textures/entities/" + entity.getTexture() + ".png");
	}

}
