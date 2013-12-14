package loe;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = LandOfEvarBeta.modid, name = "LOEBeta", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class LandOfEvarBeta
{
 public static final String modid = "Percy_Land Of Evar";
 
 //Items
 public static Item ColourShard;
 
 public static Item Evar;
 
 public static Item Soul;
 
 public static Item SuperColourShard;
 
 public static Item Ash;
 
 public static Item Ashpile;
 
 public static Item Fireleaf;
 
 public static Item Waterleaf;
 
 public static Item colourleaf;
 
 public static Item FireyAshPile;
 
 public static Item Deathsjournal;
 
 public static Item PhilophersShard;
 
 //Blocks
 public static Block CourruptedGrass;
 
 public static Block LifeWood;
 
 public static Block EquilaOre;
 
 public static Block CourruptedWood;
 
 public static Block PureEvarGrass;
 
private Object itemIcon;
 


      
@EventHandler
public void load(FMLInitializationEvent event)
  {
 //Items
ColourShard = new ItemCoulourShard (3080).setUnlocalizedName("CS").setTextureName("percy:Colourshard"); //Texture 

Evar = new ItemEvar(3081).setUnlocalizedName("ES").setTextureName("percy:Colourshard");//Texture

Soul = new ItemSoul(3082).setUnlocalizedName("S").setTextureName("percy:Colourshard");

SuperColourShard = new ItemSuperColourShard(3083).setUnlocalizedName("SCS").setTextureName("percy:Colourshard");

Ash = new ItemAsh(3084).setUnlocalizedName("A").setTextureName("percy:Colourshard");

Ashpile = new ItemAshPile(3085).setUnlocalizedName("AP").setTextureName("percy:Colourshard");

Fireleaf = new ItemFireleaf(3086).setUnlocalizedName("FL").setTextureName("percy:Colourshard");

Waterleaf = new ItemWaterleaf(3087).setUnlocalizedName("WL").setTextureName("percy:Colourshard");

colourleaf = new Itemcolourleaf(3088).setUnlocalizedName("CL").setTextureName("percy:Colourshard");

Deathsjournal = new ItemDeathsjournal(3089).setUnlocalizedName("DJ").setTextureName("percy:Colourshard"); 

PhilophersShard = new ItemPhilophersShard(3093).setUnlocalizedName("PS").setTextureName("Percy:LandOfEvar");





//Blocks
CourruptedGrass = new BlockCourruptedGrass(3090,Material.grass).setUnlocalizedName("CG").setTextureName("percy:Colourshard");
GameRegistry.registerBlock(CourruptedGrass, modid + CourruptedGrass.getUnlocalizedName().substring(5));

LifeWood = new BlockLifeWood(3091,Material.wood).setUnlocalizedName("LW").setTextureName("percy:Colourshard");        
GameRegistry.registerBlock(LifeWood, modid + LifeWood.getUnlocalizedName().substring(5));

EquilaOre = new BlockEquilaOre(3092,Material.iron).setUnlocalizedName("EO").setTextureName("percy:Colourshard");
GameRegistry.registerBlock(EquilaOre, modid + EquilaOre.getUnlocalizedName().substring(5));

CourruptedWood = new BlockCourruptedWood(3094,Material.wood).setUnlocalizedName("CW").setTextureName("percy:Colourshard");
GameRegistry.registerBlock(CourruptedWood, modid + CourruptedWood.getUnlocalizedName().substring(5));

PureEvarGrass =  new BlockPureEvarGrass(3095,Material.grass).setUnlocalizedName("PEG").setTextureName("percy:Colourshard");
GameRegistry.registerBlock(PureEvarGrass, modid + PureEvarGrass.getUnlocalizedName().substring(5));

//Diemension

//ItemsNames
LanguageRegistry.addName(ColourShard, "Colour Shard");

LanguageRegistry.addName(Evar, "Evar Shard");

LanguageRegistry.addName(Soul, "Soul");

LanguageRegistry.addName(SuperColourShard, "Super Colour Shard");

LanguageRegistry.addName(Ash, "Ash");

LanguageRegistry.addName(Ashpile, "Ash Pile");

LanguageRegistry.addName(Fireleaf, "Fire Leaf");

LanguageRegistry.addName(Waterleaf, "Water Leaf");

LanguageRegistry.addName(colourleaf, "Colour Leaf");

LanguageRegistry.addName(Deathsjournal,"Deaths Journal");

//Block Names
LanguageRegistry.addName(CourruptedGrass,"Courrupted Grass");

LanguageRegistry.addName(LifeWood,"Life Wood");	

LanguageRegistry.addName(EquilaOre,"Equila Ore");

LanguageRegistry.addName(CourruptedWood,"Courrupted Wood");

LanguageRegistry.addName(PureEvarGrass,"Pure Evar Grass"); 
	
	
	
	
	
	
	
       }
}