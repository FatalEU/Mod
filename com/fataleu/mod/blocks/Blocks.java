package com.fataleu.mod.blocks;

import com.fataleu.mod.helpers.config.Names;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class Blocks {
	public static Block pipe;
	
	public static void init(){
		pipe = new blockPipe();
		
        register();
        addNames();
	}
	
	public static void register(){
		GameRegistry.registerBlock(pipe, Names.pipe.getUnLocalizedName());
	}
	
	public static void addNames(){
		LanguageRegistry.addName(pipe, Names.pipe.getLocalizedName());
	}
}

