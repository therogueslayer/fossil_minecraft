
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fossilminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.fossilminecraft.block.entity.ReviverBlockEntity;
import net.mcreator.fossilminecraft.block.entity.CleanerBlockEntity;
import net.mcreator.fossilminecraft.FossilMinecraftMod;

public class FossilMinecraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FossilMinecraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CLEANER = register("cleaner", FossilMinecraftModBlocks.CLEANER, CleanerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REVIVER = register("reviver", FossilMinecraftModBlocks.REVIVER, ReviverBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
