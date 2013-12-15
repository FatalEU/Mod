package com.fataleu.mod.blocks;

import com.fataleu.mod.helpers.config.IDs;
import com.fataleu.mod.tileEntities.TileEntityPipe;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class blockPipe extends BlockContainer {

	public blockPipe() {
		super(IDs.pipe, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityPipe();
    }

	@Override
    public int getRenderType(){
    	return -1;
    }
    
	@Override
    public boolean isOpaqueCube(){
    	return false;
    }

	@Override
    public boolean renderAsNormalBlock(){
    	return false;
    }


}
