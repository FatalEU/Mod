package com.fataleu.mod.client.render;

import org.lwjgl.opengl.GL11;

import com.fataleu.mod.Main;
import com.fataleu.mod.helpers.config.ModInfo;
import com.fataleu.mod.models.modelPipe;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class renderPipe extends TileEntitySpecialRenderer {

	private modelPipe pipe = new modelPipe();
	private static final ResourceLocation textures = new ResourceLocation("fataleu:textures/models/Pipe.png"); 
	
	public void renderTileEntityAt(TileEntity tileentity, double x, double y,
			double z, float f) {
		//Open the GL Matrix
        GL11.glPushMatrix();
        
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float)z + 0.5F);

        GL11.glRotatef(180, 0F, 0F, 1F);
        
        this.bindTexture(textures);
        
        GL11.glPushMatrix();
        
        pipe.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        
        GL11.glPopMatrix();
        GL11.glPopMatrix();
	}

}
