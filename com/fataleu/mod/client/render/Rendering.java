package com.fataleu.mod.client.render;

import com.fataleu.mod.client.render.items.ItemRenderPipe;
import com.fataleu.mod.helpers.config.IDs;
import com.fataleu.mod.tileEntities.TileEntityPipe;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;

public class Rendering {
	public static void init() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class,
				new renderPipe());
		MinecraftForgeClient.registerItemRenderer(IDs.pipe,
				new ItemRenderPipe());
	}
}
