
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fossilminecraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fossilminecraft.block.ReviverBlock;
import net.mcreator.fossilminecraft.block.FossilBlock;
import net.mcreator.fossilminecraft.block.CleanerBlock;
import net.mcreator.fossilminecraft.FossilMinecraftMod;

public class FossilMinecraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FossilMinecraftMod.MODID);
	public static final RegistryObject<Block> CLEANER = REGISTRY.register("cleaner", () -> new CleanerBlock());
	public static final RegistryObject<Block> REVIVER = REGISTRY.register("reviver", () -> new ReviverBlock());
	public static final RegistryObject<Block> FOSSIL = REGISTRY.register("fossil", () -> new FossilBlock());
}
