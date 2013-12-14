package loe;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPureEvarGrass extends Block
{
	public BlockPureEvarGrass(int id, Material material) 
	{
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}