package com.fpstest.client.bench;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;

/**
 * Runtime mod detection for the benchmark text feature.
 * Detects whether all four required mods are actually loaded in the current Minecraft process.
 */
@Environment(EnvType.CLIENT)
public final class ModDetector {
    private ModDetector() {
    }

    // Mod IDs as they appear in fabric.mod.json
    private static final String DH_API_MOD_ID = "dh-api";
    private static final String VOXY_MOD_ID = "voxy";
    private static final String SODIUM_MOD_ID = "sodium";
    private static final String IRIS_MOD_ID = "iris";

    /**
     * Checks if all four required mods are loaded at runtime.
     * @return true if DH API, Voxy, Sodium, and Iris are all loaded
     */
    public static boolean areAllFourModsLoaded() {
        FabricLoader loader = FabricLoader.getInstance();
        boolean dhApiLoaded = loader.isModLoaded(DH_API_MOD_ID);
        boolean voxyLoaded = loader.isModLoaded(VOXY_MOD_ID);
        boolean sodiumLoaded = loader.isModLoaded(SODIUM_MOD_ID);
        boolean irisLoaded = loader.isModLoaded(IRIS_MOD_ID);

        return dhApiLoaded && voxyLoaded && sodiumLoaded && irisLoaded;
    }

    /**
     * Gets the appropriate benchmark title text based on loaded mods.
     * @return "MC Benchmark" if all four mods are loaded, otherwise "MC Benchmark Core"
     */
    public static String getBenchmarkTitle() {
        return areAllFourModsLoaded() ? "MC Benchmark" : "MC Benchmark Core";
    }

    /**
     * Gets the appropriate benchmark title text with a suffix.
     * @param suffix the suffix to append (e.g., " — aborted", " — finishing ...")
     * @return the benchmark title with suffix
     */
    public static String getBenchmarkTitle(String suffix) {
        return getBenchmarkTitle() + suffix;
    }
}