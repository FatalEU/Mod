package com.fataleu.mod.proxys;

import com.fataleu.mod.client.render.Rendering;
import com.fataleu.mod.client.render.renderPipe;
import com.fataleu.mod.tileEntities.TileEntityPipe;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
    
    public void initRenderers(){
    	Rendering.init();
    }
}
