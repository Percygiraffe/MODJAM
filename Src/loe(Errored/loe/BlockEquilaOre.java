package loe;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEquilaOre extends Block
{
	public BlockEquilaOre(int id, Material material) 
	{
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
}