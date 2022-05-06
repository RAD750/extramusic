package extramusic.main;

import java.util.logging.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;

import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import extramusic.main.items.Items;
import extramusic.main.proxies.CommonProxy;
import extramusic.main.utils.MusicFetcher;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.src.BaseMod;
import net.minecraftforge.common.MinecraftForge;



@Mod(name="ExtraMusic", version="1.0", modid="ExtraMusic")
public class Main extends BaseMod{
	
	public static Logger extraMusicLogger = Logger.getLogger("ExtraMusic");
	
	@Override
	public String getVersion() {
		return "1.0";
	}
	
	@SidedProxy(clientSide="extramusic.main.proxies.ClientProxy", serverSide="extramusic.main.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	@Override
	public void load() {

	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	
	@Init
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		Items.InitializeItems();
		Items.RegisterLanguage();
	}
	
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
	
	
	
}
