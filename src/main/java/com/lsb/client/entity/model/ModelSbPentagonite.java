package com.lsb.client.entity.model;

import com.gempire.client.entity.model.ModelGem;
import com.gempire.entities.bases.EntityGem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;

public class ModelSbPentagonite<T extends EntityGem> extends ModelGem<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("lsb", "sbpentagonite"), "main");
	private final ModelPart head;
	private final ModelPart neck;
	private final ModelPart shawl;
	private final ModelPart chest;
	private final ModelPart pelbis;
	private final ModelPart legl;
	private final ModelPart legr;
	private final ModelPart arml;
	private final ModelPart armr;

	public ModelSbPentagonite(ModelPart root) {
		this.head = root.getChild("head");
		this.neck = root.getChild("neck");
		this.shawl = root.getChild("shawl");
		this.chest = root.getChild("chest");
		this.pelbis = root.getChild("pelbis");
		this.legl = root.getChild("legl");
		this.legr = root.getChild("legr");
		this.arml = root.getChild("arml");
		this.armr = root.getChild("armr");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition hair = head.addOrReplaceChild("hair", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ponytail = head.addOrReplaceChild("ponytail", CubeListBuilder.create().texOffs(36, 17).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.5F, 5.5F));

		PartDefinition bun = head.addOrReplaceChild("bun", CubeListBuilder.create().texOffs(48, 29).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, 5.5F));

		PartDefinition neck = partdefinition.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, -3.3F, 0.0F));

		PartDefinition shawl = partdefinition.addOrReplaceChild("shawl", CubeListBuilder.create().texOffs(3, 49).addBox(-5.0F, 0.0F, -2.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, -0.5F));

		PartDefinition chest = partdefinition.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(8, 17).addBox(-4.5F, 0.0F, -1.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, -1.5F, -1.0F));

		PartDefinition pelbis = partdefinition.addOrReplaceChild("pelbis", CubeListBuilder.create().texOffs(8, 26).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F, -0.3F, 0.0F)), PartPose.offset(-0.5F, 3.2F, 0.0F));

		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(0, 32).addBox(-4.4F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.2F, 0.0F, 0.2F)), PartPose.offset(1.7F, 7.0F, 0.0F));

		PartDefinition calfl = legl.addOrReplaceChild("calfl", CubeListBuilder.create().texOffs(0, 43).addBox(-4.4F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)), PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition legr = partdefinition.addOrReplaceChild("legr", CubeListBuilder.create().texOffs(28, 32).addBox(2.4F, 0.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.2F, 0.0F, 0.2F)), PartPose.offset(-1.7F, 7.0F, 0.0F));

		PartDefinition calfr = legr.addOrReplaceChild("calfr", CubeListBuilder.create().texOffs(28, 43).addBox(2.4F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)), PartPose.offset(0.0F, 9.0F, 0.0F));

		PartDefinition arml = partdefinition.addOrReplaceChild("arml", CubeListBuilder.create().texOffs(0, 17).addBox(-7.4F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)), PartPose.offset(2.7F, -0.5F, 0.0F));

		PartDefinition armr = partdefinition.addOrReplaceChild("armr", CubeListBuilder.create().texOffs(28, 17).addBox(5.4F, -1.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(-0.3F, 0.0F, -0.3F)), PartPose.offset(-2.7F, -0.5F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shawl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pelbis.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arml.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armr.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netheadYaw, float headPitch) {
		this.setRotateAngle(this.head, headPitch * 0.9F * 0.017453292F, netheadYaw * 0.017453292F, 0.0F);
		this.setRotateAngle(this.arml, Mth.cos(limbSwing * 0.5F + 3.1415927F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
		this.setRotateAngle(this.armr, Mth.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
		this.setRotateAngle(this.legl, Mth.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
		this.setRotateAngle(this.legr, Mth.cos(limbSwing * 0.5F + 3.1415927F) * 1.5F * limbSwingAmount * 0.8F, 0.0F, 0.0F);
	}

	public void setRotateAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public ModelPart getArm(HumanoidArm p_102852_) {
		return p_102852_ == HumanoidArm.LEFT ? this.arml : this.armr;
	}
}