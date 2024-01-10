// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTrex<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "trex"), "main");
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	private final ModelPart body;
	private final ModelPart Head;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart tail;

	public ModelTrex(ModelPart root) {
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
		this.body = root.getChild("body");
		this.Head = root.getChild("Head");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, -3.0F));

		PartDefinition claw1_r1 = leftLeg.addOrReplaceChild("claw1_r1",
				CubeListBuilder.create().texOffs(241, 0).addBox(-3.6864F, 0.015F, 7.6071F, 6.0F, 1.47F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, 0.75F, 3.1416F, 1.309F, 3.1416F));

		PartDefinition claw2_r1 = leftLeg.addOrReplaceChild("claw2_r1",
				CubeListBuilder.create().texOffs(247, 0)
						.addBox(1.5F, 0.015F, 9.75F, 3.0F, 1.47F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 147)
						.addBox(-4.5F, 0.0F, 7.5F, 6.0F, 1.5F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, 0.75F, 0.0F, 1.5708F, 0.0F));

		PartDefinition claw3_r1 = leftLeg.addOrReplaceChild("claw3_r1",
				CubeListBuilder.create().texOffs(241, 0).addBox(1.7488F, 0.015F, 11.1773F, 6.0F, 1.47F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, 0.75F, 0.0F, 1.309F, 0.0F));

		PartDefinition thigh_r1 = leftLeg.addOrReplaceChild("thigh_r1",
				CubeListBuilder.create().texOffs(123, 30).addBox(-0.549F, -24.4413F, 6.0F, 9.0F, 18.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, 0.75F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition half_calve_r1 = leftLeg.addOrReplaceChild("half_calve_r1",
				CubeListBuilder.create().texOffs(36, 81).addBox(-8.437F, -9.6976F, 7.125F, 6.0F, 12.0F, 6.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, 0.75F, 1.5708F, 0.7418F, 1.5708F));

		PartDefinition calve_r1 = leftLeg.addOrReplaceChild("calve_r1",
				CubeListBuilder.create().texOffs(129, 81).addBox(-4.4735F, -2.8978F, 7.35F, 6.0F, 3.0F, 6.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, 0.75F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition claw1_r2 = rightLeg.addOrReplaceChild("claw1_r2",
				CubeListBuilder.create().texOffs(241, 0).addBox(0.9724F, 0.015F, -9.7795F, 6.0F, 1.47F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, -2.25F, 3.1416F, 1.309F, 3.1416F));

		PartDefinition claw2_r2 = rightLeg.addOrReplaceChild("claw2_r2",
				CubeListBuilder.create().texOffs(247, 0)
						.addBox(1.5F, 0.015F, -8.25F, 3.0F, 1.47F, 1.5F, new CubeDeformation(0.0F)).texOffs(24, 147)
						.addBox(-4.5F, 0.0F, -10.5F, 6.0F, 1.5F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, -2.25F, 0.0F, 1.5708F, 0.0F));

		PartDefinition claw3_r2 = rightLeg.addOrReplaceChild("claw3_r2",
				CubeListBuilder.create().texOffs(241, 0).addBox(-2.9099F, 0.015F, -6.2093F, 6.0F, 1.47F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, -2.25F, 0.0F, 1.309F, 0.0F));

		PartDefinition thigh_r2 = rightLeg.addOrReplaceChild("thigh_r2",
				CubeListBuilder.create().texOffs(126, 126).addBox(-0.549F, -24.4413F, -12.0F, 9.0F, 18.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, -2.25F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition half_calve_r2 = rightLeg.addOrReplaceChild("half_calve_r2",
				CubeListBuilder.create().texOffs(144, 0).addBox(-8.437F, -9.6976F, -10.875F, 6.0F, 12.0F, 6.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, -2.25F, 1.5708F, 0.7418F, 1.5708F));

		PartDefinition calve_r2 = rightLeg.addOrReplaceChild("calve_r2",
				CubeListBuilder.create().texOffs(144, 18).addBox(-4.4735F, -2.8978F, -10.65F, 6.0F, 3.0F, 6.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.5F, -2.25F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(69, 0).addBox(-22.5F, -49.5F, 1.5F, 36.0F, 15.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -1.5F, -2.25F, 0.0F, 1.5708F, 0.0F));

		PartDefinition chest2_r1 = body.addOrReplaceChild("chest2_r1",
				CubeListBuilder.create().texOffs(39, 105).addBox(22.243F, -20.3126F, -18.1913F, 9.0F, 15.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -1.5F, -2.25F, -2.3562F, 1.1345F, -1.5708F));

		PartDefinition chest1_r1 = body.addOrReplaceChild("chest1_r1",
				CubeListBuilder.create().texOffs(0, 81).addBox(10.6455F, -25.5245F, -23.4032F, 9.0F, 18.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -1.5F, -2.25F, -2.3562F, 1.4399F, -1.5708F));

		PartDefinition Backandstomach_r1 = body.addOrReplaceChild("Backandstomach_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-15.586F, -28.3742F, -26.2529F, 24.0F, 21.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -1.5F, -2.25F, 0.7854F, 1.4835F, 1.5708F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.375F, -19.3059F));

		PartDefinition Flame2_r1 = Head.addOrReplaceChild("Flame2_r1",
				CubeListBuilder.create().texOffs(114, 60).addBox(5.0873F, -58.5F, 12.1832F, 24.0F, 21.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.875F, 17.0559F, 3.1416F, 1.2217F, 3.1416F));

		PartDefinition Flame1_r1 = Head.addOrReplaceChild("Flame1_r1",
				CubeListBuilder.create().texOffs(114, 60).addBox(6.1133F, -58.5F, -9.3641F, 24.0F, 21.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.875F, 17.0559F, 0.0F, 1.2217F, 0.0F));

		PartDefinition teeth2_r1 = Head.addOrReplaceChild("teeth2_r1",
				CubeListBuilder.create().texOffs(60, 42)
						.addBox(31.5F, -28.5F, -6.0F, 24.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(90, 15)
						.addBox(31.5F, -28.5F, -4.5F, 21.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(54, 90)
						.addBox(31.5F, -25.5F, -4.5F, 21.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(42, 135)
						.addBox(37.5F, -40.5F, -3.0F, 15.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(63, 66)
						.addBox(37.5F, -37.5F, -6.0F, 18.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(16.5F, -43.5F, -7.5F, 21.0F, 21.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 25.875F, 17.0559F, 0.0F, 1.5708F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(),
				PartPose.offset(12.0F, 3.0F, 12.0F));

		PartDefinition claw2_r3 = leftArm.addOrReplaceChild("claw2_r3",
				CubeListBuilder.create().texOffs(249, 0)
						.addBox(18.0F, -13.5F, 11.25F, 1.5F, 3.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(249, 0)
						.addBox(18.0F, -13.5F, 7.5F, 1.5F, 3.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(135, 111)
						.addBox(10.5F, -22.5F, 7.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, 19.5F, -14.25F, 0.0F, 1.5708F, 0.0F));

		PartDefinition forearm_r1 = leftArm.addOrReplaceChild("forearm_r1",
				CubeListBuilder.create().texOffs(0, 42).addBox(19.1913F, -7.9413F, 7.875F, 4.5F, 6.0F, 5.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, 19.5F, -14.25F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(),
				PartPose.offset(12.0F, 3.0F, -12.0F));

		PartDefinition claw2_r4 = rightArm.addOrReplaceChild("claw2_r4",
				CubeListBuilder.create().texOffs(249, 0)
						.addBox(18.0F, -13.5F, -6.75F, 1.5F, 3.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(249, 0)
						.addBox(18.0F, -13.5F, -10.5F, 1.5F, 3.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(72, 105)
						.addBox(10.5F, -22.5F, -10.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, 19.5F, 9.75F, 0.0F, 1.5708F, 0.0F));

		PartDefinition forearm_r2 = rightArm.addOrReplaceChild("forearm_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(19.1913F, -7.9413F, -10.125F, 4.5F, 6.0F, 5.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, 19.5F, 9.75F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tailsegment5_r1 = tail.addOrReplaceChild("tailsegment5_r1", CubeListBuilder.create()
				.texOffs(69, 15).addBox(-55.5F, -28.5312F, -26.4099F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(90, 30).addBox(-46.5F, -28.5312F, -26.4099F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(90, 135).addBox(-37.5F, -28.5312F, -26.4099F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 123).addBox(-28.5F, -28.5312F, -26.4099F, 9.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(87, 105).addBox(-19.5F, -28.5312F, -26.4099F, 9.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -1.5F, -2.25F, 0.0F, 1.5708F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}