package net.mcreator.fossilminecraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.fossilminecraft.world.inventory.TrexMedalGUIMenu;
import net.mcreator.fossilminecraft.procedures.TrexMedalGUIReturnProcedure;
import net.mcreator.fossilminecraft.procedures.RankReturnProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TrexMedalGUIScreen extends AbstractContainerScreen<TrexMedalGUIMenu> {
	private final static HashMap<String, Object> guistate = TrexMedalGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TrexMedalGUIScreen(TrexMedalGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fossil_minecraft:textures/screens/trex_medal_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (TrexMedalGUIReturnProcedure.execute(world) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 125, this.topPos + 64, 10, 2.25f + (float) Math.atan((this.leftPos + 125 - mouseX) / 40.0), (float) Math.atan((this.topPos + 14 - mouseY) / 40.0),
					livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_health"), 6, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_attack"), 6, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_defense"), 6, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_accuracy"), 6, 43, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_speed"), 6, 52, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_support_attack"), 6, 79, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_support_defense"), 6, 88, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_support_accuracy"), 6, 97, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_supportspeed"), 6, 106, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fossil_minecraft.trex_medal_gui.label_rank"), 6, 7, -12829636, false);
		guiGraphics.drawString(this.font,

				RankReturnProcedure.execute(entity), 51, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
