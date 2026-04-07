package net.mcreator.createcomputational.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelTreadRobo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("create_computational", "model_tread_robo"), "main");
	public final ModelPart Treads;
	public final ModelPart LeftTread;
	public final ModelPart RightTread;
	public final ModelPart TreadRollers;
	public final ModelPart MainBody;
	public final ModelPart Battery;
	public final ModelPart Chest;
	public final ModelPart ChestTop;

	public ModelTreadRobo(ModelPart root) {
		this.Treads = root.getChild("Treads");
		this.LeftTread = this.Treads.getChild("LeftTread");
		this.RightTread = this.Treads.getChild("RightTread");
		this.TreadRollers = this.Treads.getChild("TreadRollers");
		this.MainBody = root.getChild("MainBody");
		this.Battery = root.getChild("Battery");
		this.Chest = root.getChild("Chest");
		this.ChestTop = root.getChild("ChestTop");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Treads = partdefinition.addOrReplaceChild("Treads", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition LeftTread = Treads.addOrReplaceChild("LeftTread",
				CubeListBuilder.create().texOffs(32, 33).addBox(-10.0F, -4.0F, 7.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 6).addBox(8.0F, -3.0F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 13)
						.addBox(-10.0F, -1.0F, 7.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 10).addBox(-11.0F, -3.0F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 0.0F, -14.0F));
		PartDefinition RightTread = Treads.addOrReplaceChild("RightTread",
				CubeListBuilder.create().texOffs(32, 30).addBox(-10.0F, -4.0F, 7.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 21).addBox(8.0F, -3.0F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 27)
						.addBox(-10.0F, -1.0F, 7.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 36).addBox(-11.0F, -3.0F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 0.0F, -2.0F));
		PartDefinition TreadRollers = Treads.addOrReplaceChild("TreadRollers",
				CubeListBuilder.create().texOffs(0, 42).addBox(2.0F, -2.0F, -1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(28, 47).addBox(-14.0F, -2.0F, -1.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-10.0F, -1.0F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(56, 47).addBox(-7.0F, -1.0F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(56, 60)
						.addBox(-4.0F, -1.0F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(28, 61).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -1.0F, -5.0F));
		PartDefinition MainBody = partdefinition.addOrReplaceChild("MainBody",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -5.0F, -5.0F, 14.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-4.0F, -9.0F, -5.0F, 7.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(54, 73)
						.addBox(-5.0F, -7.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(64, 40).addBox(-4.0F, -11.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 43)
						.addBox(-4.0F, -11.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 70)
						.addBox(7.0F, -5.0F, -5.0F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(72, 16).addBox(-10.0F, -5.0F, -5.0F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r1 = MainBody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 36).addBox(-1.0F, -1.0F, 0.0F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -5.0F, -5.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition cube_r2 = MainBody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(34, 16).addBox(-5.0F, -1.0F, 0.0F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -5.0F, 0.0F, 0.0F, 1.3963F));
		PartDefinition cube_r3 = MainBody.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(74, 3).addBox(-12.0F, -1.0F, -2.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 0).addBox(-12.0F, -1.0F, -11.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -10.0F, 6.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition Battery = partdefinition.addOrReplaceChild("Battery",
				CubeListBuilder.create().texOffs(72, 28).addBox(5.0F, -9.0F, -4.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 42).addBox(6.0F, -10.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 74)
						.addBox(6.0F, -10.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 46).addBox(3.0F, -10.0F, 2.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 46)
						.addBox(3.0F, -10.0F, -3.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Chest = partdefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 58).addBox(-12.0F, -9.0F, -4.0F, 6.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition ChestTop = partdefinition.addOrReplaceChild("ChestTop",
				CubeListBuilder.create().texOffs(66, 16).addBox(-13.0F, -10.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 80).addBox(-12.0F, -11.0F, -4.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Treads.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		MainBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Battery.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ChestTop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}