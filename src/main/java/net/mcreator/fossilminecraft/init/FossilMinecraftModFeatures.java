
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fossilminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.fossilminecraft.world.features.FossilGenerationFeature;
import net.mcreator.fossilminecraft.FossilMinecraftMod;

@Mod.EventBusSubscriber
public class FossilMinecraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FossilMinecraftMod.MODID);
	public static final RegistryObject<Feature<?>> FOSSIL_GENERATION = REGISTRY.register("fossil_generation", FossilGenerationFeature::new);
}
