// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCarchar<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "carchar"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Tail;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelCarchar(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Tail = root.getChild("Tail");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition thigh_r1 = RightLeg.addOrReplaceChild("thigh_r1",
				CubeListBuilder.create().texOffs(0, 119).addBox(-0.549F, -24.4413F, -12.0F, 9.0F, 18.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition half_calve_r1 = RightLeg.addOrReplaceChild("half_calve_r1",
				CubeListBuilder.create().texOffs(37, 132).addBox(-8.437F, -9.6976F, -10.875F, 6.0F, 12.0F, 6.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, 1.5708F, 0.7418F, 1.5708F));

		PartDefinition calve_r1 = RightLeg.addOrReplaceChild("calve_r1",
				CubeListBuilder.create().texOffs(144, 31).addBox(-4.4735F, -2.8978F, -10.65F, 6.0F, 3.0F, 6.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition foot_r1 = RightLeg.addOrReplaceChild("foot_r1",
				CubeListBuilder.create().texOffs(29, 80)
						.addBox(-4.5F, 0.0F, -10.5F, 6.0F, 1.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(37, 56)
						.addBox(1.5F, 0.015F, -8.25F, 3.0F, 1.47F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, 0.0F, 1.5708F, 0.0F));

		PartDefinition claw1_r1 = RightLeg.addOrReplaceChild("claw1_r1",
				CubeListBuilder.create().texOffs(0, 47).addBox(0.9724F, 0.015F, -9.7795F, 6.0F, 1.47F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, 3.1416F, 1.309F, 3.1416F));

		PartDefinition claw3_r1 = RightLeg.addOrReplaceChild("claw3_r1",
				CubeListBuilder.create().texOffs(0, 12).addBox(-2.9099F, 0.015F, -6.2093F, 6.0F, 1.47F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, 0.0F, 1.309F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition thigh_r2 = LeftLeg.addOrReplaceChild("thigh_r2",
				CubeListBuilder.create().texOffs(90, 117).addBox(-0.549F, -24.4413F, 6.0F, 9.0F, 18.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition half_calve_r2 = LeftLeg.addOrReplaceChild("half_calve_r2",
				CubeListBuilder.create().texOffs(127, 127).addBox(-8.437F, -9.6976F, 7.125F, 6.0F, 12.0F, 6.75F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, 1.5708F, 0.7418F, 1.5708F));

		PartDefinition calve_r2 = LeftLeg.addOrReplaceChild("calve_r2",
				CubeListBuilder.create().texOffs(136, 95).addBox(-4.4735F, -2.8978F, 7.35F, 6.0F, 3.0F, 6.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, -1.5708F, 1.309F, -1.5708F));

		PartDefinition foot_r2 = LeftLeg.addOrReplaceChild("foot_r2",
				CubeListBuilder.create().texOffs(144, 74)
						.addBox(-4.5F, 0.0F, 7.5F, 6.0F, 1.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(1.5F, 0.015F, 9.75F, 3.0F, 1.47F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, 0.0F, 1.5708F, 0.0F));

		PartDefinition claw3_r2 = LeftLeg.addOrReplaceChild("claw3_r2",
				CubeListBuilder.create().texOffs(0, 43).addBox(1.7488F, 0.015F, 11.1773F, 6.0F, 1.47F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, 0.0F, 1.309F, 0.0F));

		PartDefinition claw1_r2 = LeftLeg.addOrReplaceChild("claw1_r2",
				CubeListBuilder.create().texOffs(0, 16).addBox(-3.6864F, 0.015F, 7.6071F, 6.0F, 1.47F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 28.5F, -2.25F, 3.1416F, 1.309F, 3.1416F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(-1.5F, 22.5F, -2.25F));

		PartDefinition tailsegment5_r1 = Tail.addOrReplaceChild("tailsegment5_r1", CubeListBuilder.create()
				.texOffs(145, 13).addBox(-55.5F, -28.5312F, -26.4099F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(37, 43).addBox(-46.5F, -28.5312F, -26.4099F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(127, 108).addBox(-37.5F, -28.5312F, -26.4099F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(47, 107).addBox(-28.5F, -28.5312F, -26.4099F, 9.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(40, 74).addBox(-19.5F, -28.5312F, -26.4099F, 9.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(-1.5F, 22.5F, -2.25F));

		PartDefinition chest2_r1 = Body.addOrReplaceChild("chest2_r1",
				CubeListBuilder.create().texOffs(55, 43).addBox(22.243F, -20.3126F, -18.1913F, 9.0F, 15.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 1.1345F, -1.5708F));

		PartDefinition chest1_r1 = Body.addOrReplaceChild("chest1_r1",
				CubeListBuilder.create().texOffs(0, 43).addBox(10.6455F, -25.5245F, -23.4032F, 9.0F, 18.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 1.4399F, -1.5708F));

		PartDefinition Backandstomach_r1 = Body.addOrReplaceChild("Backandstomach_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-15.586F, -28.3742F, -26.2529F, 24.0F, 21.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 1.4835F, 1.5708F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(89, 95).addBox(-10.0015F, -8.1019F, -1.5457F, 20.0F, 18.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0015F, -13.8981F, -20.2454F, 0.3054F, 0.0F, 0.0F));

		PartDefinition RightTeethBottom_r1 = Head.addOrReplaceChild("RightTeethBottom_r1",
				CubeListBuilder.create().texOffs(-5, 251)
						.addBox(-5.0F, 6.5005F, -1.5F, 12.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 170)
						.addBox(-5.0F, 3.5005F, -1.5F, 12.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 161)
						.addBox(-17.0F, 3.5005F, -1.5F, 12.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 204)
						.addBox(-17.0F, -1.4995F, -1.5F, 24.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 0)
						.addBox(-17.0F, -10.4995F, -1.5F, 24.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0173F, 2.3986F, -16.7442F, 0.0F, 1.2217F, 0.0F));

		PartDefinition CenterBlock_r1 = Head.addOrReplaceChild("CenterBlock_r1", CubeListBuilder.create()
				.texOffs(215, 83).addBox(-6.9157F, -9.4965F, -10.0105F, 0.0F, 18.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(0, 80).addBox(-16.0F, -10.4965F, -8.0105F, 9.0F, 19.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(146, 187).addBox(7.0F, 4.5025F, -5.0105F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(146, 187).addBox(-16.0F, 6.5025F, -5.0105F, 23.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(89, 74).addBox(-16.0F, -10.4975F, -5.0105F, 23.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0142F, 2.3986F, -16.7441F, 0.0F, 1.5708F, 0.0F));

		PartDefinition MouthInsideLeft_r1 = Head.addOrReplaceChild("MouthInsideLeft_r1",
				CubeListBuilder.create().texOffs(-5, 251)
						.addBox(-5.0F, 6.5015F, -3.5F, 12.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(91, 227)
						.addBox(-5.0F, 3.5015F, -3.5F, 12.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 183)
						.addBox(-17.0F, 3.5015F, -3.5F, 12.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 219)
						.addBox(-17.0F, -1.4985F, -3.5F, 24.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(89, 38)
						.addBox(-17.0F, -10.4985F, -3.5F, 24.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0142F, 2.3986F, -16.7441F, 0.0F, 1.9199F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(-1.5F, 22.5F, -2.25F));

		PartDefinition claw1_r3 = LeftArm.addOrReplaceChild("claw1_r3",
				CubeListBuilder.create().texOffs(74, 80)
						.addBox(18.0F, -13.5F, 7.5F, 1.5F, 3.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(18.0F, -13.5F, 11.25F, 1.5F, 3.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(64, 132)
						.addBox(10.5F, -22.5F, 7.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition forearm_r1 = LeftArm.addOrReplaceChild("forearm_r1",
				CubeListBuilder.create().texOffs(144, 83).addBox(19.1913F, -7.9413F, 7.875F, 4.5F, 6.0F, 5.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.0472F, -1.5708F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-1.5F, 22.5F, -2.25F));

		PartDefinition claw1_r4 = RightArm.addOrReplaceChild("claw1_r4",
				CubeListBuilder.create().texOffs(0, 80)
						.addBox(18.0F, -13.5F, -10.5F, 1.5F, 3.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(18.0F, -13.5F, -6.75F, 1.5F, 3.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(129, 0)
						.addBox(10.5F, -22.5F, -10.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition forearm_r2 = RightArm.addOrReplaceChild("forearm_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(19.1913F, -7.9413F, -10.125F, 4.5F, 6.0F, 5.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.0472F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}