package extramusic.main.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import extramusic.main.CreativeTab;

public class Items {
	
	public static Item ArrakisDisk, SavaraDisk, DaggerfallDisk, TimeForwardDisk, TakeTheATrainDisk, ChattanoogaChooChooDisk, BeyondTheSeaDisk, SolidAsARockDisk, SixteenTonsDisk, CBDisk,
	bongoDisk, anythingGoesDisk, intoEachLifeDisk, gunWasLoadedDisk, setTheWorldOnFireDisk, TakeMeHomeDisk, praiseTheLordDisk, rocket69Disk, theEndOfTheWorldDisk, wouldntItBeNiceDisk;
	

	
	public static void InitializeItems() {
	ArrakisDisk = new MusicDisc(24200, 0, "arrakis", "Arrakis Anthem", "Frank Clepacki");
	SavaraDisk = new MusicDisc(24201, 1, "savara", "Savara Anthem", "Alexander Brandon");
	DaggerfallDisk = new MusicDisc(24202, 2, "daggerfall", "Daggerfall Anthem", "Ken Arnold");
	TimeForwardDisk = new MusicDisc(24203, 3, "time-forward", "Time, Forward!", "Georgy Sviridov");
	TakeTheATrainDisk = new MusicDisc(24204, 4, "take-the-a-train", "Take The 'A' Train", "Ella Fitzgerald");
	ChattanoogaChooChooDisk = new MusicDisc(24205, 5, "chattanooga-choo-choo", "Chattanooga Choo-Choo", "Glenn Miller");
	BeyondTheSeaDisk = new MusicDisc(24206, 6, "beyond-the-sea", "Beyond The Sea", "Robbie Williams");
	SolidAsARockDisk = new MusicDisc(24207, 7, "solid-as-a-rock", "Solid As A Rock", "Ella Fitzgerald");
	SixteenTonsDisk = new MusicDisc(24208, 8, "sixteen-tons", "Sixteen Tons", "Johnny Cash");
	CBDisk = new MusicDisc(24209, 9,"cb-greatest-memories", "Greatest Memories", "HMNK, BLits, TechniKen");
	bongoDisk = new MusicDisc(24210, 10, "bongo-bongo-bongo", "Bongo Bongo Bongo (Civilization)", "Andrews Sisters, Danny Kaye");
	anythingGoesDisk = new MusicDisc(24211, 11, "anything-goes", "Anything Goes", "Cole Porter");
	intoEachLifeDisk = new MusicDisc(24212, 12, "into-each-life-some-rain-must-fall", "Into Each Life", "Ella Fitzgerald");
	gunWasLoadedDisk = new MusicDisc(24213, 13, "i-didnt-know-the-gun-was-loaded", "I Didn't Know The Gun Was Loaded", "Patsy Montana");
	setTheWorldOnFireDisk = new MusicDisc(24214, 14, "i-dont-want-to-set-the-world-on-fire", "I Don't Want To Set The World On Fire", "The Ink Spots");
	TakeMeHomeDisk = new MusicDisc(24215, 15, "take-me-home", "Take Me Home Country Roads", "John Denver");
	praiseTheLordDisk = new MusicDisc(24216, 16, "praise-the-lord-and-pass-the-ammunition", "Praise the Lord and Pass the Ammunition", "Kay Kyser");
	rocket69Disk = new MusicDisc(24217, 17, "rocket-69", "Rocket 69", "Connie Allen");
	theEndOfTheWorldDisk = new MusicDisc(24218, 18, "the-end-of-the-world", "The End of The World", "Skeeter Davis");
	wouldntItBeNiceDisk = new MusicDisc(24219, 19, "wouldnt-it-be-nice", "Wouldn't It Be Nice", "The Beach Boys");
	
	GameRegistry.registerItem(ArrakisDisk, "ArrakisDisk");
	GameRegistry.registerItem(SavaraDisk, "SavaraDisk");
	GameRegistry.registerItem(TimeForwardDisk, "TimeForwardDisk");
	GameRegistry.registerItem(TakeTheATrainDisk, "TakeTheATrainDisk");
	GameRegistry.registerItem(ChattanoogaChooChooDisk, "ChattanoogaChooChooDisk");
	GameRegistry.registerItem(BeyondTheSeaDisk, "BeyondTheSeaDisk");
	GameRegistry.registerItem(SolidAsARockDisk, "SolidAsARockDisk");
	GameRegistry.registerItem(SixteenTonsDisk, "SixteenTonsDisk");
	GameRegistry.registerItem(CBDisk, "CBDisk");
	GameRegistry.registerItem(bongoDisk, "bongoDisk");
	GameRegistry.registerItem(anythingGoesDisk, "anythingGoesDisk");
	GameRegistry.registerItem(intoEachLifeDisk, "intoEachLifeDisk");
	GameRegistry.registerItem(gunWasLoadedDisk, "gunWasLoadedDisk");
	GameRegistry.registerItem(setTheWorldOnFireDisk, "setTheWorldOnFireDisk");
	GameRegistry.registerItem(TakeMeHomeDisk, "TakeMeHomeDisk");
	GameRegistry.registerItem(rocket69Disk, "rocket69Disk");
	GameRegistry.registerItem(praiseTheLordDisk, "praiseTheLordDisk");
	GameRegistry.registerItem(theEndOfTheWorldDisk, "theEndOfTheWorldDisk");
	GameRegistry.registerItem(wouldntItBeNiceDisk, "wouldntItBeNiceDisk");

	}
	
	 
	
	
	public static void RegisterLanguage() {
		LanguageRegistry.addName(ArrakisDisk, "Music Disc");
	}
}


