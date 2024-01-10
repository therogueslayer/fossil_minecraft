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
public class ModelShanShan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("fossil_minecraft", "model_shan_shan"), "main");
	public final ModelPart leftLeg;
	public final ModelPart rightLeg;
	public final ModelPart Tail;
	public final ModelPart Body;
	public final ModelPart head;
	public final ModelPart leftArm;
	public final ModelPart rightArm;

	public ModelShanShan(ModelPart root) {
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
		this.Tail = root.getChild("Tail");
		this.Body = root.getChild("Body");
		this.head = root.getChild("head");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition half_calve_r1 = leftLeg.addOrReplaceChild("half_calve_r1", CubeListBuilder.create().texOffs(94, 70).addBox(-5.6247F, -6.4651F, 4.75F, 4.0F, 8.0F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, 1.5708F, 0.7418F, 1.5708F));
		PartDefinition claw1_r1 = leftLeg.addOrReplaceChild("claw1_r1", CubeListBuilder.create().texOffs(0, 29).addBox(-2.4576F, 0.01F, 5.0714F, 4.0F, 0.98F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, 3.1416F, 1.309F, 3.1416F));
		PartDefinition claw2_r1 = leftLeg.addOrReplaceChild("claw2_r1",
				CubeListBuilder.create().texOffs(2, 29).addBox(1.0F, 0.01F, 6.5F, 2.0F, 0.98F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 53).addBox(-3.0F, 0.0F, 5.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition claw3_r1 = leftLeg.addOrReplaceChild("claw3_r1", CubeListBuilder.create().texOffs(0, 29).addBox(1.1659F, 0.01F, 7.4516F, 4.0F, 0.98F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, 0.0F, 1.309F, 0.0F));
		PartDefinition thighfeathers_r1 = leftLeg.addOrReplaceChild("thighfeathers_r1", CubeListBuilder.create().texOffs(77, 104).addBox(-5.98F, -8.0F, 0.0F, 14.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.98F, 3.3038F, 6.8301F, -2.4435F, 1.0472F, -2.618F));
		PartDefinition thigh_r1 = leftLeg.addOrReplaceChild("thigh_r1", CubeListBuilder.create().texOffs(86, 35).addBox(-0.366F, -16.2942F, 4.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, -1.5708F, 1.0472F, -1.5708F));
		PartDefinition calve_r1 = leftLeg.addOrReplaceChild("calve_r1", CubeListBuilder.create().texOffs(24, 52).addBox(-2.9824F, -1.9319F, 4.9F, 4.0F, 2.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));
		PartDefinition claw3_r2 = rightLeg.addOrReplaceChild("claw3_r2", CubeListBuilder.create().texOffs(0, 29).addBox(-1.9399F, 0.01F, -4.1396F, 4.0F, 0.98F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, 0.0F, 1.309F, 0.0F));
		PartDefinition claw2_r2 = rightLeg.addOrReplaceChild("claw2_r2",
				CubeListBuilder.create().texOffs(2, 29).addBox(1.0F, 0.01F, -5.5F, 2.0F, 0.98F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 96).addBox(-3.0F, 0.0F, -7.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition claw1_r2 = rightLeg.addOrReplaceChild("claw1_r2", CubeListBuilder.create().texOffs(0, 29).addBox(0.6482F, 0.01F, -6.5197F, 4.0F, 0.98F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, 3.1416F, 1.309F, 3.1416F));
		PartDefinition thighfeathers_r2 = rightLeg.addOrReplaceChild("thighfeathers_r2", CubeListBuilder.create().texOffs(77, 104).addBox(-6.02F, -8.0F, 0.0F, 14.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.98F, 3.3038F, 6.8301F, -0.6981F, 1.0472F, -0.5236F));
		PartDefinition thigh_r2 = rightLeg.addOrReplaceChild("thigh_r2", CubeListBuilder.create().texOffs(88, 84).addBox(-0.366F, -16.2942F, -8.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, -1.5708F, 1.0472F, -1.5708F));
		PartDefinition half_calve_r2 = rightLeg.addOrReplaceChild("half_calve_r2", CubeListBuilder.create().texOffs(0, 96).addBox(-5.6247F, -6.4651F, -7.25F, 4.0F, 8.0F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, 1.5708F, 0.7418F, 1.5708F));
		PartDefinition calve_r2 = rightLeg.addOrReplaceChild("calve_r2", CubeListBuilder.create().texOffs(96, 12).addBox(-2.9824F, -1.9319F, -7.1F, 4.0F, 2.0F, 4.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 17.0F, -1.5F, -1.5708F, 1.309F, -1.5708F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-1.0F, 23.0F, -1.5F));
		PartDefinition tailfeathers_r1 = Tail.addOrReplaceChild("tailfeathers_r1", CubeListBuilder.create().texOffs(36, 58).addBox(-9.0F, -20.0F, -0.4F, 18.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.634F, -14.2942F, 36.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition tailsegment5_r1 = Tail.addOrReplaceChild("tailsegment5_r1",
				CubeListBuilder.create().texOffs(46, 10).addBox(-37.0F, -19.0208F, -17.6066F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 19).addBox(-31.0F, -19.0208F, -17.6066F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(60, 90).addBox(-25.0F, -19.0208F, -17.6066F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(82, 19).addBox(-19.0F, -19.0208F, -17.6066F, 6.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-13.0F, -19.0208F, -17.6066F, 6.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.7854F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(-1.0F, 23.0F, -1.5F));
		PartDefinition chest2_r1 = Body.addOrReplaceChild("chest2_r1", CubeListBuilder.create().texOffs(62, 70).addBox(14.8286F, -13.5417F, -12.1275F, 6.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 1.1345F, -1.5708F));
		PartDefinition chest1_r1 = Body.addOrReplaceChild("chest1_r1", CubeListBuilder.create().texOffs(0, 52).addBox(7.097F, -17.0163F, -15.6021F, 6.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 1.4399F, -1.5708F));
		PartDefinition Backandstomach_r1 = Body.addOrReplaceChild("Backandstomach_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-10.3907F, -18.9161F, -17.5019F, 16.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 1.4835F, 1.5708F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 4.57F, -13.0617F));
		PartDefinition teeth2_r1 = head.addOrReplaceChild("teeth2_r1",
				CubeListBuilder.create().texOffs(40, 28).addBox(21.0F, -19.0F, -4.0F, 16.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(21.0F, -19.0F, -3.0F, 14.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(15, 111)
						.addBox(21.0F, -17.0F, -3.0F, 14.0F, 1.98F, 8.0F, new CubeDeformation(0.0F)).texOffs(42, 42).addBox(25.0F, -25.0F, -4.0F, 12.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(11.0F, -27.0F, -5.0F, 14.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 18.43F, 11.5617F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Headfeather2_r1 = head.addOrReplaceChild("Headfeather2_r1", CubeListBuilder.create().texOffs(72, 58).addBox(5.0F, -37.0F, 7.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 18.43F, 11.5617F, 0.0F, 1.6581F, 0.0F));
		PartDefinition Headfeather1_r1 = head.addOrReplaceChild("Headfeather1_r1", CubeListBuilder.create().texOffs(72, 58).addBox(5.0F, -37.0F, -5.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 18.43F, 11.5617F, 0.0F, 1.4835F, 0.0F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(-1.0F, 23.0F, -1.5F));
		PartDefinition claw2_r3 = leftArm.addOrReplaceChild("claw2_r3", CubeListBuilder.create().texOffs(4, 28).addBox(12.0F, -9.0F, 7.5F, 1.0F, 2.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(4, 28)
				.addBox(12.0F, -9.0F, 5.0F, 1.0F, 2.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(96, 4).addBox(7.0F, -15.0F, 5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition forearm_r1 = leftArm.addOrReplaceChild("forearm_r1", CubeListBuilder.create().texOffs(0, 7).addBox(12.7942F, -5.2942F, 5.25F, 3.0F, 4.0F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.0472F, -1.5708F));
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(-1.0F, 23.0F, -1.5F));
		PartDefinition biceps_r1 = rightArm.addOrReplaceChild("biceps_r1", CubeListBuilder.create().texOffs(82, 0).addBox(7.0F, -15.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 28)
				.addBox(12.0F, -9.0F, -4.5F, 1.0F, 2.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(4, 28).addBox(12.0F, -9.0F, -7.0F, 1.0F, 2.0F, 1.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition forearm_r2 = rightArm.addOrReplaceChild("forearm_r2", CubeListBuilder.create().texOffs(0, 0).addBox(12.7942F, -5.2942F, -6.75F, 3.0F, 4.0F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.0472F, -1.5708F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
