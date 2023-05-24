package extramusic.main.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

import net.minecraftforge.event.Event;

public class SoundFetcher {
	public static Logger extraMusicLogger = Logger.getLogger("ExtraMusic");

	public static void fetchSound(String baseDir, String soundFileName) {
		File f = new File(baseDir + "/../resources/" + soundFileName);
		if(!f.exists() && !f.isDirectory()) {
			extraMusicLogger.info("Sound " + soundFileName + " missing, downloading from CDN");	
			try (BufferedInputStream in = new BufferedInputStream(new URL("http://cdn.rgbcraft.com/utilities/resources/" + soundFileName).openStream());
					FileOutputStream fileOutputStream = new FileOutputStream(baseDir + "/../resources/" + soundFileName)) {
				byte dataBuffer[] = new byte[1024];
				int bytesRead;
				while ((bytesRead = in.read(dataBuffer, 0, 1024)) >=  0) {
					fileOutputStream.write(dataBuffer, 0, bytesRead);
				}
				extraMusicLogger.info("Sound " + soundFileName + " successufully downloaded from CDN");	
			} catch (IOException e) {
				extraMusicLogger.severe("Error downloading " + soundFileName + " from CDN: " + e);
			}
		} else {
			extraMusicLogger.info("Sound " + soundFileName + " already downloaded");	
		}
	}
}
