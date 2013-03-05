package Yogibear617.mods.FuturisticCraft.Blocks.Liquid;

import Yogibear617.mods.FuturisticCraft.Blocks.Liquid.FCLiquidMaterial;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class FCModBlocksLiquid
{
	//[[Materials]]\\
	public static Material LiquidDyeBlack;
	public static Material LiquidDyeBlue;
	//[[Liquids]]\\
	public static Block liquidDyeBlackStill;
	public static Block liquidDyeBlackFlowing;
	
	public static void init()
	{
		 LiquidDyeBlack = (new FCLiquidMaterial(MapColor.waterColor)).setNoPushMobility();
		 LiquidDyeBlue = (new FCLiquidMaterial(MapColor.waterColor)).setNoPushMobility();
	}
}
