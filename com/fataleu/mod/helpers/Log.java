package com.fataleu.mod.helpers;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.fataleu.mod.helpers.config.ModInfo;

import cpw.mods.fml.common.FMLLog;

public class Log {
    private static Logger logger = Logger.getLogger(ModInfo.ID);

    public static void init(){
    	logger.setParent(FMLLog.getLogger());
    	logger.log(Level.INFO, ModInfo.NAME + " Starting!");
    }

    public static void info(String message){
    	logger.log(Level.INFO, message);
    }
    

    public static void error(String message){
    	logger.log(Level.SEVERE, message);
    }
    

    public static void warning(String message){
    	logger.log(Level.WARNING, message);
    }
}