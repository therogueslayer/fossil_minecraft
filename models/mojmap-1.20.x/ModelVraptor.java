// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelVraptor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vraptor"), "main");
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart tail;
	private final ModelPart rightArm;
	private final ModelPart leftArm;

	public ModelVraptor(ModelPart root) {
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition claw4_r1 = rightLeg.addOrReplaceChild("claw4_r1",
				CubeListBuilder.create().texOffs(5, 0).addBox(-0.75F, -0.64F, -0.5F, 2.0F, 0.49F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 8.15F, -1.75F, 1.1729F, 0.4891F, 1.3758F));

		PartDefinition claw3_r1 = rightLeg.addOrReplaceChild("claw3_r1",
				CubeListBuilder.create().texOffs(5, 10).addBox(-1.3044F, -0.64F, -0.5F, 2.0F, 0.49F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 8.15F, -1.75F, -1.1407F, 0.609F, -1.3141F));

		PartDefinition claw2_r1 = rightLeg.addOrReplaceChild("claw2_r1",
				CubeListBuilder.create().texOffs(7, 4)
						.addBox(0.5F, 0.005F, -2.75F, 1.0F, 0.49F, 0.5F, new CubeDeformation(0.0F)).texOffs(17, 36)
						.addBox(-1.5F, 0.0F, -3.5F, 2.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.5F, -0.75F, 0.0F, 1.5708F, 0.0F));

		PartDefinition claw1_r1 = rightLeg.addOrReplaceChild("claw1_r1",
				CubeListBuilder.create().texOffs(20, 9).addBox(0.3241F, 0.005F, -3.2598F, 2.0F, 0.49F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.5F, -0.75F, 3.1416F, 1.309F, 3.1416F));

		PartDefinition thigh_r1 = rightLeg.addOrReplaceChild("thigh_r1",
				CubeListBuilder.create().texOffs(12, 46).addBox(1.817F, -10.1471F, -4.0F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.5F, -0.75F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition half_calve_r1 = rightLeg.addOrReplaceChild("half_calve_r1",
				CubeListBuilder.create().texOffs(46, 23).addBox(-2.8123F, -5.2325F, -3.625F, 2.0F, 6.0F, 2.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.5F, -0.75F, 1.5708F, 0.7418F, 1.5708F));

		PartDefinition calve_r1 = rightLeg.addOrReplaceChild("calve_r1",
				CubeListBuilder.create().texOffs(22, 22).addBox(-1.4912F, -0.9659F, -3.55F, 2.0F, 1.0F, 2.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 8.5F, -0.75F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition claw5_r1 = leftLeg.addOrReplaceChild("claw5_r1",
				CubeListBuilder.create().texOffs(0, 3).addBox(-0.7508F, -0.6587F, -0.5F, 2.0F, 0.49F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9946F, 8.16F, -1.7352F, 1.9687F, 0.4891F, 1.7658F));

		PartDefinition claw4_r2 = leftLeg.addOrReplaceChild("claw4_r2",
				CubeListBuilder.create().texOffs(5, 8).addBox(-1.2868F, -0.6336F, -0.5F, 2.0F, 0.49F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9946F, 8.16F, -1.7352F, -2.0009F, 0.609F, -1.8274F));

		PartDefinition claw4_r3 = leftLeg
				.addOrReplaceChild("claw4_r3",
						CubeListBuilder.create().texOffs(20, 6).addBox(-0.97F, 0.005F, -2.0698F, 2.0F, 0.49F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(6.5F, 8.5F, -0.75F, 0.0F, 1.309F, 0.0F));

		PartDefinition claw3_r2 = leftLeg.addOrReplaceChild("claw3_r2",
				CubeListBuilder.create().texOffs(7, 2)
						.addBox(0.5F, 0.005F, -2.75F, 1.0F, 0.49F, 0.5F, new CubeDeformation(0.0F)).texOffs(30, 23)
						.addBox(-1.5F, 0.0F, -3.5F, 2.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 8.5F, -0.75F, 0.0F, 1.5708F, 0.0F));

		PartDefinition thigh_r2 = leftLeg.addOrReplaceChild("thigh_r2",
				CubeListBuilder.create().texOffs(0, 45).addBox(1.817F, -10.1471F, -4.0F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 8.5F, -0.75F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition half_calve_r2 = leftLeg.addOrReplaceChild("half_calve_r2",
				CubeListBuilder.create().texOffs(55, 13).addBox(-2.8123F, -5.2325F, -3.625F, 2.0F, 6.0F, 2.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 8.5F, -0.75F, 1.5708F, 0.7418F, 1.5708F));

		PartDefinition calve_r2 = leftLeg.addOrReplaceChild("calve_r2",
				CubeListBuilder.create().texOffs(12, 0).addBox(-1.4912F, -0.9659F, -3.55F, 2.0F, 1.0F, 2.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 8.5F, -0.75F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition backfeathers_r1 = body.addOrReplaceChild(
				"backfeathers_r1", CubeListBuilder.create().texOffs(0, 5).addBox(0.0F, -11.0F, -6.5F, 0.0F, 10.0F,
						11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.5F, 0.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition neck2_r1 = body.addOrReplaceChild("neck2_r1",
				CubeListBuilder.create().texOffs(30, 26).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0355F, -8.4142F, -1.3867F, 0.7769F, 0.1298F));

		PartDefinition neck1_r1 = body.addOrReplaceChild("neck1_r1",
				CubeListBuilder.create().texOffs(16, 39).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0858F, -6.0F, -0.2194F, 0.2143F, 0.7617F));

		PartDefinition backandstomach_r1 = body.addOrReplaceChild("backandstomach_r1",
				CubeListBuilder.create().texOffs(30, 47).addBox(-2.0F, -2.0F, -5.5F, 6.0F, 6.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.5F, 0.5F, 0.1872F, -0.1841F, 0.7681F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(25, 9)
						.addBox(-3.0F, -4.0F, -6.0F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-2.995F, -2.0F, -11.0F, 5.99F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-2.5F, 1.0F, -9.999F, 5.0F, 1.99F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, -9.0F));

		PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(20, 16).addBox(1.0F, -5.0F, -5.0F, 0.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -1.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(20, 16).addBox(-1.0F, -5.0F, -5.0F, 0.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -1.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition segment3_r1 = tail.addOrReplaceChild("segment3_r1",
				CubeListBuilder.create().texOffs(44, 11)
						.addBox(-3.0F, -3.0F, 14.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 39)
						.addBox(-3.0F, -3.0F, 10.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 5)
						.addBox(-3.0F, -3.0F, 3.5F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.5F, 0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition finger3_r1 = rightArm.addOrReplaceChild("finger3_r1",
				CubeListBuilder.create().texOffs(25, 36).addBox(-0.75F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -7.0F, -12.5F, -0.8682F, 0.3419F, 0.2766F));

		PartDefinition finger2_r1 = rightArm.addOrReplaceChild("finger2_r1",
				CubeListBuilder.create().texOffs(38, 0).addBox(-0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -7.0F, -12.5F, -0.8682F, -0.3419F, -0.2766F));

		PartDefinition finger1_r1 = rightArm.addOrReplaceChild("finger1_r1",
				CubeListBuilder.create().texOffs(38, 3).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -7.0F, -12.5F, -0.9163F, 0.0F, 0.0F));

		PartDefinition forearm_r1 = rightArm.addOrReplaceChild("forearm_r1",
				CubeListBuilder.create().texOffs(9, 57).addBox(-0.95F, -5.0F, -1.0F, 1.9F, 5.0F, 1.9F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.317F, -6.6471F, -6.75F, 1.4835F, 0.0F, -0.5236F));

		PartDefinition bicep_r1 = rightArm.addOrReplaceChild("bicep_r1",
				CubeListBuilder.create().texOffs(18, 57).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.317F, -6.6471F, -6.75F, 0.0F, 0.0F, -0.5236F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition finger3_r2 = leftArm.addOrReplaceChild("finger3_r2",
				CubeListBuilder.create().texOffs(21, 0).addBox(-0.75F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -7.0F, -12.5F, -0.8682F, 0.3419F, 0.2766F));

		PartDefinition finger2_r2 = leftArm.addOrReplaceChild("finger2_r2",
				CubeListBuilder.create().texOffs(0, 36).addBox(-0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -7.0F, -12.5F, -0.8682F, -0.3419F, -0.2766F));

		PartDefinition finger1_r2 = leftArm.addOrReplaceChild("finger1_r2",
				CubeListBuilder.create().texOffs(21, 3).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -7.0F, -12.5F, -0.9163F, 0.0F, 0.0F));

		PartDefinition forearm_r2 = leftArm.addOrReplaceChild("forearm_r2",
				CubeListBuilder.create().texOffs(0, 57).addBox(-0.584F, -5.0F, -1.0F, 1.9F, 5.0F, 1.9F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.683F, -6.6471F, -6.75F, 1.4835F, 0.0F, 0.5236F));

		PartDefinition bicep_r2 = leftArm.addOrReplaceChild("bicep_r2",
				CubeListBuilder.create().texOffs(26, 49).addBox(-0.634F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.683F, -6.6471F, -6.75F, 0.0F, 0.0F, 0.5236F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}