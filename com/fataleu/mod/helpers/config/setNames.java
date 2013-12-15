package com.fataleu.mod.helpers.config;

public class setNames {
	String loc;
	String unloc;
	
	public setNames(String _loc, String _unloc){
		this.loc = _loc;
		this.unloc = _unloc;
	}
	
	public String getLocalizedName(){
		return loc;
	}
	
	public String getUnLocalizedName(){
		return unloc;
	}
}
