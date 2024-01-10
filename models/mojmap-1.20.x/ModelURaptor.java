// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelURaptor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "uraptor"), "main");
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart head;
	private final ModelPart leftarm;
	private final ModelPart rightarm;

	public ModelURaptor(ModelPart root) {
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.5F, 0.0F));

		PartDefinition claw3_r1 = rightleg.addOrReplaceChild("claw3_r1",
				CubeListBuilder.create().texOffs(0, 6).addBox(-1.3044F, -0.64F, -0.5F, 2.0F, 0.49F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 11.65F, -1.75F, -1.1407F, 0.609F, -1.3141F));

		PartDefinition claw4_r1 = rightleg.addOrReplaceChild("claw4_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.75F, -0.64F, -0.5F, 2.0F, 0.49F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 11.65F, -1.75F, 1.1729F, 0.4891F, 1.3758F));

		PartDefinition claw2_r1 = rightleg.addOrReplaceChild("claw2_r1",
				CubeListBuilder.create().texOffs(33, 18)
						.addBox(0.5F, 0.005F, -2.75F, 1.0F, 0.49F, 0.5F, new CubeDeformation(0.0F)).texOffs(53, 57)
						.addBox(-1.5F, 0.0F, -3.5F, 2.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 12.0F, -0.75F, 0.0F, 1.5708F, 0.0F));

		PartDefinition claw1_r1 = rightleg.addOrReplaceChild("claw1_r1",
				CubeListBuilder.create().texOffs(21, 18).addBox(0.3241F, 0.005F, -3.2598F, 2.0F, 0.49F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 12.0F, -0.75F, 3.1416F, 1.309F, 3.1416F));

		PartDefinition calve_r1 = rightleg.addOrReplaceChild("calve_r1",
				CubeListBuilder.create().texOffs(16, 47).addBox(-1.4912F, -0.9659F, -3.55F, 2.0F, 1.0F, 2.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 12.0F, -0.75F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition half_calve_r1 = rightleg.addOrReplaceChild("half_calve_r1",
				CubeListBuilder.create().texOffs(21, 0).addBox(-2.8123F, -5.2325F, -3.625F, 2.0F, 6.0F, 2.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 12.0F, -0.75F, 1.5708F, 0.7418F, 1.5708F));

		PartDefinition thigh_r1 = rightleg.addOrReplaceChild("thigh_r1",
				CubeListBuilder.create().texOffs(31, 55).addBox(1.817F, -10.1471F, -4.0F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 12.0F, -0.75F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.5F, 0.0F));

		PartDefinition thigh_r2 = leftleg.addOrReplaceChild("thigh_r2",
				CubeListBuilder.create().texOffs(18, 55).addBox(1.817F, -10.1471F, -4.0F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 12.0F, -0.75F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition half_calve_r2 = leftleg.addOrReplaceChild("half_calve_r2",
				CubeListBuilder.create().texOffs(56, 11).addBox(-2.8123F, -5.2325F, -3.625F, 2.0F, 6.0F, 2.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 12.0F, -0.75F, 1.5708F, 0.7418F, 1.5708F));

		PartDefinition claw4_r2 = leftleg.addOrReplaceChild("claw4_r2",
				CubeListBuilder.create().texOffs(21, 9).addBox(-0.97F, 0.005F, -2.0698F, 2.0F, 0.49F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 12.0F, -0.75F, 0.0F, 1.309F, 0.0F));

		PartDefinition claw3_r2 = leftleg.addOrReplaceChild("claw3_r2",
				CubeListBuilder.create().texOffs(28, 18)
						.addBox(0.5F, 0.005F, -2.75F, 1.0F, 0.49F, 0.5F, new CubeDeformation(0.0F)).texOffs(55, 20)
						.addBox(-1.5F, 0.0F, -3.5F, 2.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 12.0F, -0.75F, 0.0F, 1.5708F, 0.0F));

		PartDefinition calve_r2 = leftleg.addOrReplaceChild("calve_r2",
				CubeListBuilder.create().texOffs(41, 18).addBox(-1.4912F, -0.9659F, -3.55F, 2.0F, 1.0F, 2.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, 12.0F, -0.75F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition claw4_r3 = leftleg.addOrReplaceChild("claw4_r3",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.2868F, -0.6336F, -0.5F, 2.0F, 0.49F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9946F, 11.66F, -1.7352F, -2.0009F, 0.609F, -1.8274F));

		PartDefinition claw5_r1 = leftleg.addOrReplaceChild("claw5_r1",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.7508F, -0.6587F, -0.5F, 2.0F, 0.49F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9946F, 11.66F, -1.7352F, 1.9687F, 0.4891F, 1.7658F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.5F, 0.5F));

		PartDefinition backandstomach_r1 = body.addOrReplaceChild("backandstomach_r1",
				CubeListBuilder.create().texOffs(21, 0).addBox(-2.0F, -2.0F, -5.5F, 6.0F, 6.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1872F, -0.1841F, 0.7681F));

		PartDefinition neck1_r1 = body.addOrReplaceChild("neck1_r1",
				CubeListBuilder.create().texOffs(45, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4142F, -6.5F, -0.2194F, 0.2143F, 0.7617F));

		PartDefinition neck2_r1 = body.addOrReplaceChild("neck2_r1",
				CubeListBuilder.create().texOffs(31, 22).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 3.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5355F, -8.9142F, -1.3867F, 0.7769F, 0.1298F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.5F, 0.5F));

		PartDefinition backfeathers_r1 = tail
				.addOrReplaceChild("backfeathers_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -14.0F, 3.5F, 0.0F, 11.0F, 20.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition segment3_r1 = tail.addOrReplaceChild("segment3_r1",
				CubeListBuilder.create().texOffs(36, 36)
						.addBox(-3.0F, -3.0F, 14.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 32)
						.addBox(-3.0F, -3.0F, 10.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 46)
						.addBox(-3.0F, -3.0F, 3.5F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 47)
						.addBox(-2.5F, -2.0F, -11.0F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-3.0F, -4.0F, -6.0F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(27, 36)
						.addBox(2.99F, -7.0F, -1.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(27, 36)
						.addBox(-2.99F, -7.0F, -1.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 37)
						.addBox(-2.25F, 2.0F, -9.999F, 4.5F, 0.99F, 7.0F, new CubeDeformation(0.0F)).texOffs(15, 67)
						.addBox(-2.25F, 1.0F, -9.999F, 4.5F, 0.99F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(-2.5F, 1.0F, -11.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, -9.0F));

		PartDefinition headfeathers3_r1 = head.addOrReplaceChild("headfeathers3_r1",
				CubeListBuilder.create().texOffs(48, 18).addBox(1.0F, -3.5F, -3.0F, 0.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.4254F, 1.6868F, -1.5708F, -0.48F, 1.5708F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(3.0F, 17.0F, -12.5F));

		PartDefinition finger3_r1 = leftarm.addOrReplaceChild("finger3_r1",
				CubeListBuilder.create().texOffs(45, 36).addBox(-0.75F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8682F, 0.3419F, 0.2766F));

		PartDefinition finger1_r1 = leftarm
				.addOrReplaceChild("finger1_r1",
						CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition finger2_r1 = leftarm.addOrReplaceChild("finger2_r1",
				CubeListBuilder.create().texOffs(44, 46).addBox(-0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, -0.8682F, -0.3419F, -0.2766F));

		PartDefinition forearm_r1 = leftarm.addOrReplaceChild("forearm_r1",
				CubeListBuilder.create().texOffs(9, 57).addBox(-0.95F, -5.0F, -1.0F, 1.9F, 5.0F, 1.9F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.317F, 0.3529F, 5.75F, 1.4835F, 0.0F, -0.5236F));

		PartDefinition bicep_r1 = leftarm.addOrReplaceChild("bicep_r1",
				CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.317F, 0.3529F, 5.75F, 0.0F, 0.0F, -0.5236F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 17.0F, -12.5F));

		PartDefinition finger2_r2 = rightarm.addOrReplaceChild("finger2_r2",
				CubeListBuilder.create().texOffs(45, 0).addBox(-0.25F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8682F, -0.3419F, -0.2766F));

		PartDefinition finger1_r2 = rightarm.addOrReplaceChild("finger1_r2",
				CubeListBuilder.create().texOffs(27, 39).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.9163F, 0.0F, 0.0F));

		PartDefinition finger3_r2 = rightarm.addOrReplaceChild("finger3_r2",
				CubeListBuilder.create().texOffs(0, 32).addBox(-0.75F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, -0.8682F, 0.3419F, 0.2766F));

		PartDefinition forearm_r2 = rightarm.addOrReplaceChild("forearm_r2",
				CubeListBuilder.create().texOffs(44, 57).addBox(-0.584F, -5.0F, -1.0F, 1.9F, 5.0F, 1.9F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.683F, 0.3529F, 5.75F, 1.4835F, 0.0F, 0.5236F));

		PartDefinition bicep_r2 = rightarm.addOrReplaceChild("bicep_r2",
				CubeListBuilder.create().texOffs(9, 0).addBox(-0.634F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.683F, 0.3529F, 5.75F, 0.0F, 0.0F, 0.5236F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}