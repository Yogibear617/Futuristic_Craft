package Yogibear617.mods.FuturisticCraft.Blocks.Liquid;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class FCLiquidMaterial extends Material
{
	public FCLiquidMaterial(MapColor par1MapColor) 
	{
		super(par1MapColor);
	}
	public Material setNoPushMobility()
    {
        return this;
    }
}
