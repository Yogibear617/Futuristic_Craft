package Yogibear617.mods.FuturisticCraft.Items;

import Yogibear617.mods.FuturisticCraft.mod_FuturisticCraft;
import net.minecraft.item.Item;

public class ItemsFC extends Item {

	public ItemsFC(int par1) {
		super(par1);
		this.setCreativeTab(mod_FuturisticCraft.tabsFC);
	}
	public String getTextureFile() {
		return "/FuturisticCraft/FCModItems.png";
	}
	public Object getIconIndex(int i) {
		return null;
	}

}
