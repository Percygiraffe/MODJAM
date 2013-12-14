package loe;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAsh extends Item
{
       public ItemAsh(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMaterials);
       }
}