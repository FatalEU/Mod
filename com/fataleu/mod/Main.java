package com.fataleu.mod;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

import com.fataleu.mod.blocks.Blocks;
import com.fataleu.mod.client.render.Rendering;
import com.fataleu.mod.client.render.renderPipe;
import com.fataleu.mod.helpers.Log;
import com.fataleu.mod.helpers.config.ModInfo;
import com.fataleu.mod.proxys.CommonProxy;
import com.fataleu.mod.tileEntities.TileEntities;
import com.fataleu.mod.tileEntities.TileEntityPipe;

@Mod(
    modid = ModInfo.ID,
    name = ModInfo.NAME,
	version = ModInfo.VERSION
)

@NetworkMod (
    channels = {ModInfo.CHANNEL},
    clientSideRequired = true,
    serverSideRequired = true
)


public class Main {

	@Instance(value=ModInfo.ID)
    public static Main instance;
    
    @SidedProxy(
            clientSide = ModInfo.PROXY + ".ClientProxy",
            serverSide = ModInfo.PROXY + ".CommonProxy"
    )
    public static CommonProxy proxy;

    public Log Log = new Log();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	Log.init();
    	proxy.initRender();
    }
	
	@EventHandler
    public void load(FMLInitializationEvent event){
		Blocks.init();
		TileEntities.init();
    }
	
	@EventHandler 
    public void postInit(FMLPostInitializationEvent event){
    	Log.info("FatalEU Craft ready.");
    }

}
