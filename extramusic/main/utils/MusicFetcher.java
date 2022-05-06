package extramusic.main.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

import net.minecraftforge.event.Event;

public class MusicFetcher {
	public static Logger extraMusicLogger = Logger.getLogger("ExtraMusic");

	public static void fetchSong(String baseDir, String songFileName) {
		File f = new File(baseDir + "/../resources/mod/streaming/" + songFileName + ".ogg");
		if(!f.exists() && !f.isDirectory()) {
			extraMusicLogger.info("Song " + songFileName + " missing, downloading from CDN");	
			try (BufferedInputStream in = new BufferedInputStream(new URL("https://cdn.rgbcraft.com/utilities/extramusic/" + songFileName + ".ogg").openStream());
					FileOutputStream fileOutputStream = new FileOutputStream(baseDir + "/../resources/mod/streaming/" + songFileName + ".ogg")) {
				byte dataBuffer[] = new byte[1024];
				int bytesRead;
				while ((bytesRead = in.read(dataBuffer, 0, 1024)) >=  0) {
					fileOutputStream.write(dataBuffer, 0, bytesRead);
				}
				extraMusicLogger.info("Song " + songFileName + " successufully downloaded from CDN");	
			} catch (IOException e) {
				extraMusicLogger.severe("Error downloading " + songFileName + " from CDN: " + e);
			}
		} else {
			extraMusicLogger.info("Song " + songFileName + " already downloaded");	
		}
	}
}
