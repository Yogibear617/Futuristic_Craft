package Yogibear617.mods.FuturisticCraft.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class FCModItems {
	public static Item powerCrystalCore;
	public static Item powerCrystalRed;
	public static Item powerCrystalGreen;
	public static Item powerSabreRed;
	public static Item powerSabreGreen;
	public static Item powerSabreBlade;
	public static Item powerSabreHandleRed;
	public static Item powerSabreHandleGreen;
	
	public static void init() {
		//[[Items Declaration]]\\
		powerCrystalCore = new ItemsFC(10000).setIconIndex(0).setItemName("powerCrystalCore");
		powerCrystalRed = new ItemsFC(10001).setIconIndex(1).setItemName("powerCrystalRed");
		powerCrystalGreen = new ItemsFC(10002).setIconIndex(2).setItemName("powerCrystal");
		//[Item Recipes]]\\
		
		//[[Item Names]]\\
		LanguageRegistry.addName(powerCrystalCore, "Power Crystal <Core>");
		LanguageRegistry.addName(powerCrystalRed, "Power Crystal <Red>");
		LanguageRegistry.addName(powerCrystalGreen, "Power Crystal <Green>");
	}
}
