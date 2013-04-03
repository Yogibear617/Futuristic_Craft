package Yogibear617.mods.FuturisticCraft.CreativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FCModCreativeTab extends CreativeTabs {
	public FCModCreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return Item.appleGold.itemID;
	}
}
