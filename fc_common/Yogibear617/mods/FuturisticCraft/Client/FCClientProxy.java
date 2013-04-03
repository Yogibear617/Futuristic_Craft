package Yogibear617.mods.FuturisticCraft.Client;

import net.minecraftforge.client.MinecraftForgeClient;
import Yogibear617.mods.FuturisticCraft.FCCommonProxy;

public class FCClientProxy extends FCCommonProxy{
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(FCBLOCK_PNG);
		MinecraftForgeClient.preloadTexture(FCITEM_PNG);
		MinecraftForgeClient.preloadTexture(FCSTONEBLOCK_PNG);
	}
}
