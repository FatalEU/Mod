package com.fataleu.mod.client.render.items;

import com.fataleu.mod.models.modelPipe;
import com.fataleu.mod.tileEntities.TileEntityPipe;

import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderPipe implements IItemRenderer {

	private modelPipe model;
	
	public ItemRenderPipe(){
		model = new modelPipe();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntityPipe(), 0.0D,0.0D,0.0D,0.0F);
	}

}
