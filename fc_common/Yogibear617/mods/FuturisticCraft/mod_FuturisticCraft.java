package Yogibear617.mods.FuturisticCraft;
import java.util.logging.Logger;

import Yogibear617.mods.FuturisticCraft.CreativeTabs.FCModCreativeTab;
import Yogibear617.mods.FuturisticCraft.Items.FCModItems;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
@Mod(modid = "FuturisticCraft", name = "Futuristic Craft", version = "v1.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class mod_FuturisticCraft
{
	public static CreativeTabs tabsFC = new FCModCreativeTab(CreativeTabs.getNextID(), "FuturisticCraft");
	@Instance("FuturisticCraft")
	public static mod_FuturisticCraft instance;
	@SidedProxy(clientSide = "Yogibear617.mods.FuturisticCraft.Client.FCClientProxy", serverSide = "Yogibear617.mods.FuturisticCraft.FCCommonProxy")
	public static FCCommonProxy proxy;
	@PreInit
	public void PreLoad(FMLPreInitializationEvent event)
	{
		Logger fcLog = Logger.getLogger("FC");
		fcLog.setParent(FMLLog.getLogger());
		fcLog.info("Starting Up Futuristic Craft");
	}
	@Init
	public void load(FMLInitializationEvent event)
	{
		FCModItems.init();
	}
}
