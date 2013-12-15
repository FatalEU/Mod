package com.fataleu.mod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class modelPipe extends ModelBase {
	// fields
	ModelRenderer Left;
	ModelRenderer Back;
	ModelRenderer Center;
	ModelRenderer Top;
	ModelRenderer Front;
	ModelRenderer Right;
	ModelRenderer Bottom;

	public modelPipe() {
		textureWidth = 32;
		textureHeight = 32;

		Left = new ModelRenderer(this, 0, 0);
		Left.addBox(0F, 0F, 0F, 5, 6, 6);
		Left.setRotationPoint(3F, 13F, -3F);
		Left.setTextureSize(32, 32);
		Left.mirror = true;
		setRotation(Left, 0F, 0F, 0F);
		Back = new ModelRenderer(this, 2, 0);
		Back.addBox(0F, 0F, 0F, 6, 6, 5);
		Back.setRotationPoint(-3F, 13F, 3F);
		Back.setTextureSize(32, 32);
		Back.mirror = true;
		setRotation(Back, 0F, 0F, 0F);
		Center = new ModelRenderer(this, 0, 12);
		Center.addBox(0F, 0F, 0F, 6, 6, 6);
		Center.setRotationPoint(-3F, 13F, -3F);
		Center.setTextureSize(32, 32);
		Center.mirror = true;
		setRotation(Center, 0F, 0F, 0F);
		Top = new ModelRenderer(this, 0, 0);
		Top.addBox(0F, 0F, 0F, 6, 5, 6);
		Top.setRotationPoint(-3F, 8F, -3F);
		Top.setTextureSize(32, 32);
		Top.mirror = true;
		setRotation(Top, 0F, 0F, 0F);
		Front = new ModelRenderer(this, 0, 0);
		Front.addBox(0F, 0F, 0F, 6, 6, 5);
		Front.setRotationPoint(-3F, 13F, -8F);
		Front.setTextureSize(32, 32);
		Front.mirror = true;
		setRotation(Front, 0F, 0F, 0F);
		Right = new ModelRenderer(this, 0, 0);
		Right.addBox(0F, 0F, 0F, 5, 6, 6);
		Right.setRotationPoint(-8F, 13F, -3F);
		Right.setTextureSize(32, 32);
		Right.mirror = true;
		setRotation(Right, 0F, 0F, 0F);
		Bottom = new ModelRenderer(this, 0, 1);
		Bottom.addBox(0F, 0F, 0F, 6, 5, 6);
		Bottom.setRotationPoint(-3F, 19F, -3F);
		Bottom.setTextureSize(32, 32);
		Bottom.mirror = true;
		setRotation(Bottom, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Left.render(f5);
		Back.render(f5);
		Center.render(f5);
		Top.render(f5);
		Front.render(f5);
		Right.render(f5);
		Bottom.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}

	public void renderModel(float f5) {
		Left.render(f5);
		Back.render(f5);
		Center.render(f5);
		Top.render(f5);
		Front.render(f5);
		Right.render(f5);
		Bottom.render(f5);
	}

}
