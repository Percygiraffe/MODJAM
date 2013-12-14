package loe;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTutorial extends WorldProvider
{
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.plains, 0.8F, 0.1F);
		this.dimensionId = LandOfEvarBeta.dimensionId;
	}
	
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProvider();
	}
	
	@Override
	public String getDimensionName()
	{
		return "Land Of Evar";
	}
}