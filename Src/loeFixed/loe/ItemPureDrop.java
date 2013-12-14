package loe;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPureDrop extends Item
{
       public ItemPureDrop(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMaterials);
       }
}