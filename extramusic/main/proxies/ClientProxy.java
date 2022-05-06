package extramusic.main.proxies;

import java.util.logging.Level;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.Player;
import extramusic.main.utils.MusicFetcher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetworkManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
	public ClientProxy() {
	}



	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		//Download canzoni solo su client
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "arrakis");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "beyond-the-sea");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "chattanooga-choo-choo");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "daggerfall");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "savara");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "sixteen-tons");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "solid-as-a-rock");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "take-the-a-train");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "time-forward");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "cb-greatest-memories");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "bongo-bongo-bongo");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "anything-goes");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "into-each-life-some-rain-must-fall");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "i-didnt-know-the-gun-was-loaded");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "i-dont-want-to-set-the-world-on-fire");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "take-me-home");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "praise-the-lord-and-pass-the-ammunition");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "rocket-69");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "the-end-of-the-world");
		MusicFetcher.fetchSong(event.getModConfigurationDirectory().toString(), "wouldnt-it-be-nice");
	}

	@Init
	public void init(FMLInitializationEvent event) {
		super.init(event);
		// Preloading texture per evitare bug
		MinecraftForgeClient.preloadTexture("/extramusic/textures/discs.png");
		System.out.println("[Eyecandycraft] Preloading texture completato");
	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}