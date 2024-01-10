package net.mcreator.fossilminecraft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSeidon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fossil_minecraft", "model_seidon"), "main");
	public final ModelPart frontleftleg;
	public final ModelPart frontrightleg;
	public final ModelPart backleftleg;
	public final ModelPart backrightleg;
	public final ModelPart Body;
	public final ModelPart head;
	public final ModelPart Tail;

	public ModelSeidon(ModelPart root) {
		this.frontleftleg = root.getChild("frontleftleg");
		this.frontrightleg = root.getChild("frontrightleg");
		this.backleftleg = root.getChild("backleftleg");
		this.backrightleg = root.getChild("backrightleg");
		this.Body = root.getChild("Body");
		this.head = root.getChild("head");
		this.Tail = root.getChild("Tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition frontleftleg = partdefinition.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(108, 0).addBox(9.0F, 23.0F, -5.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -21.0F));
		PartDefinition thigh_r1 = frontleftleg.addOrReplaceChild("thigh_r1", CubeListBuilder.create().texOffs(132, 146).addBox(-5.0F, -2.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, 2.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition calve_r1 = frontleftleg.addOrReplaceChild("calve_r1", CubeListBuilder.create().texOffs(0, 154).addBox(-4.995F, -13.0F, -3.0F, 7.99F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, 24.0F, -2.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition frontrightleg = partdefinition.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(50, 94).addBox(-17.0F, 23.0F, -5.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -21.0F));
		PartDefinition thigh_r2 = frontrightleg.addOrReplaceChild("thigh_r2", CubeListBuilder.create().texOffs(140, 126).addBox(-3.0F, -2.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 2.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition calve_r2 = frontrightleg.addOrReplaceChild("calve_r2", CubeListBuilder.create().texOffs(82, 151).addBox(-2.995F, -13.0F, -3.0F, 7.99F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.0F, 24.0F, -2.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition backleftleg = partdefinition.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(156, 29).addBox(8.0F, 19.0F, -3.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 20.0F));
		PartDefinition thigh_r3 = backleftleg.addOrReplaceChild("thigh_r3", CubeListBuilder.create().texOffs(146, 84).addBox(-5.0F, -7.0F, -3.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 9.0F, -1.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition calve_r3 = backleftleg.addOrReplaceChild("calve_r3", CubeListBuilder.create().texOffs(156, 0).addBox(-4.995F, -3.0F, -4.0F, 7.99F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 16.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition backrightleg = partdefinition.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(156, 15).addBox(-16.0F, 19.0F, -3.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 20.0F));
		PartDefinition thigh_r4 = backrightleg.addOrReplaceChild("thigh_r4", CubeListBuilder.create().texOffs(26, 30).addBox(-3.0F, -7.0F, -3.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, 9.0F, -1.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition calve_r4 = backrightleg.addOrReplaceChild("calve_r4", CubeListBuilder.create().texOffs(102, 84).addBox(-2.995F, -3.0F, -4.0F, 7.99F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, 16.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition chest2_r1 = Body.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(0, 129).addBox(-4.0F, -11.0F, -18.0F, 15.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-9.0F, -11.0F, -8.0F, 20.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(58, 10).addBox(-13.0F, -11.0F, 2.0F, 24.0F, 24.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -29.0F, -28.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition BackHair_r1 = Body.addOrReplaceChild("BackHair_r1", CubeListBuilder.create().texOffs(0, 0).addBox(15.0F, 0.0F, -30.0F, 24.0F, 0.0F, 60.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -29.0F, -1.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -12.6014F, -47.875F));
		PartDefinition Beard_r1 = head.addOrReplaceChild("Beard_r1",
				CubeListBuilder.create().texOffs(0, 53).addBox(-4.0F, -11.0F, -67.0F, 15.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 53).addBox(1.0F, -11.0F, -49.0F, 10.0F, 10.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(55, 144)
						.addBox(1.0F, -11.0F, -69.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(107, 99).addBox(0.0F, -12.0F, -64.0F, 12.0F, 12.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.6014F, 19.875F, 0.0F, 0.0F, -0.7854F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition seg5_r1 = Tail.addOrReplaceChild("seg5_r1",
				CubeListBuilder.create().texOffs(0, 30).addBox(8.0F, -11.0F, 85.0F, 3.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(40, 114).addBox(6.0F, -11.0F, 65.0F, 5.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(62, 84)
						.addBox(1.0F, -11.0F, 45.0F, 10.0F, 10.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(90, 126).addBox(-4.0F, -11.0F, 35.0F, 15.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 94)
						.addBox(-9.0F, -11.0F, 25.0F, 20.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -29.0F, -1.0F, 0.0F, 0.0F, -0.7854F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		frontleftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		frontrightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backleftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		backrightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.backleftleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.backrightleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.frontrightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.frontleftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
