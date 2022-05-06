package extramusic.main.proxies;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy {
	public ServerProxy() {
	}



	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Init
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}