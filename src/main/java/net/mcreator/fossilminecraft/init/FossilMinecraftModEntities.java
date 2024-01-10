
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fossilminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.fossilminecraft.entity.VraptorMedalEntity;
import net.mcreator.fossilminecraft.entity.VraptorEntity;
import net.mcreator.fossilminecraft.entity.UraptorMedalEntity;
import net.mcreator.fossilminecraft.entity.UraptorEntity;
import net.mcreator.fossilminecraft.entity.TrexMedalEntity;
import net.mcreator.fossilminecraft.entity.TrexEntity;
import net.mcreator.fossilminecraft.entity.ShanshanMedalEntity;
import net.mcreator.fossilminecraft.entity.ShanShanEntity;
import net.mcreator.fossilminecraft.entity.SeidonMedalEntity;
import net.mcreator.fossilminecraft.entity.SeidonEntity;
import net.mcreator.fossilminecraft.entity.CarcharEntity;
import net.mcreator.fossilminecraft.FossilMinecraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FossilMinecraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FossilMinecraftMod.MODID);
	public static final RegistryObject<EntityType<TrexEntity>> TREX = register("trex",
			EntityType.Builder.<TrexEntity>of(TrexEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrexEntity::new).fireImmune().sized(2f, 3f));
	public static final RegistryObject<EntityType<ShanShanEntity>> SHAN_SHAN = register("shan_shan",
			EntityType.Builder.<ShanShanEntity>of(ShanShanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShanShanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VraptorEntity>> VRAPTOR = register("vraptor",
			EntityType.Builder.<VraptorEntity>of(VraptorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VraptorEntity::new)

					.sized(1f, 1.8f));
	public static final RegistryObject<EntityType<TrexMedalEntity>> TREX_MEDAL = register("projectile_trex_medal",
			EntityType.Builder.<TrexMedalEntity>of(TrexMedalEntity::new, MobCategory.MISC).setCustomClientFactory(TrexMedalEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShanshanMedalEntity>> SHANSHAN_MEDAL = register("projectile_shanshan_medal",
			EntityType.Builder.<ShanshanMedalEntity>of(ShanshanMedalEntity::new, MobCategory.MISC).setCustomClientFactory(ShanshanMedalEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VraptorMedalEntity>> VRAPTOR_MEDAL = register("projectile_vraptor_medal",
			EntityType.Builder.<VraptorMedalEntity>of(VraptorMedalEntity::new, MobCategory.MISC).setCustomClientFactory(VraptorMedalEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SeidonEntity>> SEIDON = register("seidon",
			EntityType.Builder.<SeidonEntity>of(SeidonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeidonEntity::new)

					.sized(2.5f, 2.5f));
	public static final RegistryObject<EntityType<SeidonMedalEntity>> SEIDON_MEDAL = register("projectile_seidon_medal",
			EntityType.Builder.<SeidonMedalEntity>of(SeidonMedalEntity::new, MobCategory.MISC).setCustomClientFactory(SeidonMedalEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UraptorEntity>> URAPTOR = register("uraptor",
			EntityType.Builder.<UraptorEntity>of(UraptorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UraptorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UraptorMedalEntity>> URAPTOR_MEDAL = register("projectile_uraptor_medal",
			EntityType.Builder.<UraptorMedalEntity>of(UraptorMedalEntity::new, MobCategory.MISC).setCustomClientFactory(UraptorMedalEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CarcharEntity>> CARCHAR = register("carchar",
			EntityType.Builder.<CarcharEntity>of(CarcharEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarcharEntity::new)

					.sized(2.5f, 2.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TrexEntity.init();
			ShanShanEntity.init();
			VraptorEntity.init();
			SeidonEntity.init();
			UraptorEntity.init();
			CarcharEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TREX.get(), TrexEntity.createAttributes().build());
		event.put(SHAN_SHAN.get(), ShanShanEntity.createAttributes().build());
		event.put(VRAPTOR.get(), VraptorEntity.createAttributes().build());
		event.put(SEIDON.get(), SeidonEntity.createAttributes().build());
		event.put(URAPTOR.get(), UraptorEntity.createAttributes().build());
		event.put(CARCHAR.get(), CarcharEntity.createAttributes().build());
	}
}
