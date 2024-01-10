package net.mcreator.fossilminecraft.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.fossilminecraft.world.inventory.SonarUpgradeGUIMenu;
import net.mcreator.fossilminecraft.init.FossilMinecraftModBlocks;

import io.netty.buffer.Unpooled;

public class SonarRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (!entity.isShiftKeyDown()) {
			sx = -20;
			found = false;
			for (int index0 = 0; index0 < 40; index0++) {
				sy = -20;
				for (int index1 = 0; index1 < 40; index1++) {
					sz = -20;
					for (int index2 = 0; index2 < 40; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == FossilMinecraftModBlocks.FOSSIL.get()) {
							world.addParticle(ParticleTypes.DRAGON_BREATH, (x + sx), (y + sy), (z + sz), 0, 0.5, 0);
							world.addParticle(ParticleTypes.DRAGON_BREATH, (x + sx), (y + sy), (z + sz), 0, (-0.5), 0);
							world.addParticle(ParticleTypes.DRAGON_BREATH, (x + sx), (y + sy), (z + sz), 0, 0.5, 0);
							world.addParticle(ParticleTypes.DRAGON_BREATH, (x + sx), (y + sy), (z + sz), 0, (-0.5), 0);
							world.addParticle(ParticleTypes.DRAGON_BREATH, (x + sx), (y + sy), (z + sz), 0, 0.5, 0);
							world.addParticle(ParticleTypes.DRAGON_BREATH, (x + sx), (y + sy), (z + sz), 0, (-0.5), 0);
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
		if (entity.isShiftKeyDown()) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("SonarUpgradeGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new SonarUpgradeGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
	}
}
