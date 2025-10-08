package dev.everrynn.compressit;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main mod class for Forge 1.12.2
 */
@Mod(
		modid = CompressIt.MOD_ID,
		name = CompressIt.NAME,
		version = CompressIt.VERSION
)
public class CompressIt {

	public static final String MOD_ID = "compressit";
	public static final String NAME = "Compress It";
	public static final String VERSION = "1.0.0";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static void info(String text) {
		LOGGER.info("[" + MOD_ID + "]: " + text);
	}
}
