package Yogibear617.mods.FuturisticCraft;

import java.util.logging.Logger;
import Yogibear617.mods.FuturisticCraft.CreativeTabs.FCSBModCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid = "FuturisticCraftStoneBrick", name = "Futuristic Craft Stone Brick", version = "v1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class FCModStoneBrick
{
	public static CreativeTabs tabsFCBlock = new FCSBModCreativeTab(CreativeTabs.getNextID(), "Futuristic Craft Stone Blocks");
	@Instance("FuturisticCraftStoneBricks")
	public static FCModStoneBrick instance;
	
	@SidedProxy(clientSide = "Yogibear617.mods.FuturisticCraft.Client.FCClientProxy", serverSide = "Yogibear617.mods.FuturisticCraft.FCCommonProxy")
	public static FCCommonProxy proxy;
	
	@PreInit
	public void PreLoad(FMLPreInitializationEvent event)
	{
		Logger fcLog = Logger.getLogger("FCSB");
		fcLog.setParent(FMLLog.getLogger());
		fcLog.info("Starting Up Futuristic Craft Stone Bricks");
	}
	@Init
	public void load(FMLInitializationEvent event)
	{
		
	}
	
//GameRegistry.addShapelessRecipe(new ItemStack(stoneBlue,1), new Object[] {Block.stone, new ItemStack(Item.dyePowder, 1, 4)});
}			