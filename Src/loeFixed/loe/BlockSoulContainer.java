package tutorial;

import cpw.mods.fml.common.network.Player;
import net.minecraft.block.BlockPortal;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
importnet.minecraft.block.BlockPortal;
importnet.minecraft.creativetab.CreativeTabs;
importnet.minecraft.entity.Entity;
importnet.minecraft.entity.player.EntityPlayerMP;
importnet.minecraft.server.MinecraftServer;
importnet.minecraft.src.ModLoader;
importnet.minecraft.world.World;
public class BlockPortalTutorial extends BlockPortal
{
       public BlockPortalTutorial(int id)
       {
              super(id);
              this.setCreativeTab(CreativeTabs.tabBlock);
       }
      
       void publicvoidonEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
       {
              if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
              {
                     EntityPlayerMP player = (EntityPlayerMP) par5Entity;
                     ModLoader.getMinecraftServerInstance();
                     MinecraftServer mServer = MinecraftServer.getServer();
                     if (player.timeUntilPortal > 0)
                     {
                           player.timeUntilPortal = 10;
                     }
                     elseif (player.dimension != LandOfEvarBeta.dimensionId);
                     {
                           player.timeUntilPortal = 10;
                           player.mcServer.getConfigurationManager().transferPlayerToDimension(player, LandOfEvarBeta.dimensionId, new TeleporterTutorial(mServer.worldServerForDimension(Tutorial.dimensionId)));
                     }
                     else
                     {
                           Player.timeUntilPortal = 10;
                           Player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterTutorial(mServer.worldServerForDimension(1)));
                     }
              }
       
}

	private void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}
		
	
       
