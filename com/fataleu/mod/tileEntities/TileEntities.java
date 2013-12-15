package com.fataleu.mod.tileEntities;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities {
	
	public static void init(){
		GameRegistry.registerTileEntity(TileEntityPipe.class, "TileEntityPipe");
	}

}
