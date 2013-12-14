package loe;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAshPile extends Item
{
       public ItemAshPile(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMaterials);
       }
}