package loe;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSoul extends Item
{
       public ItemSoul(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMaterials);
       }
}