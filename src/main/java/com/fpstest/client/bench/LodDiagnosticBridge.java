package com.fpstest.client.bench;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Thin bridge that defers loading {@link LodRuntimeDiagnostic} until it is actually needed.
 *
 * <p>{@link LodRuntimeDiagnostic} contains inner classes whose field declarations reference
 * Distant Horizons and Voxy types (e.g. {@code EDhApiRendererMode}). The JVM will resolve
 * those type references when the outer class is loaded — which happens on the first call to
 * any static method on {@code LodRuntimeDiagnostic}. If DH/Voxy are not installed, this
 * triggers a {@link NoClassDefFoundError} before the mod-presence check in
 * {@link DistantHorizonsVoxyController} can prevent further use of those APIs.</p>
 *
 * <p>This class acts as a class-loading boundary: it only loads and delegates to
 * {@link LodRuntimeDiagnostic} after confirming at least one of DH or Voxy is present.
 * When both are absent, all bridge methods are no-ops and the diagnostic class is never
 * loaded, so no DH/Voxy types are resolved.</p>
 */
public final class LodDiagnosticBridge {
    private static final Logger LOG = LoggerFactory.getLogger(LodDiagnosticBridge.class);

    private static final String DH_MOD_ID = "distanthorizons";
    private static final String DH_API_MOD_ID = "dh-api";
    private static final String VOXY_MOD_ID = "voxy";

    private static boolean initialized;
    private static boolean modPresent;

    private LodDiagnosticBridge() {}

    /** Returns true when at least one of DH or Voxy is installed at runtime. */
    public static boolean isModPresent() {
        FabricLoader loader = FabricLoader.getInstance();
        return (loader.isModLoaded(DH_MOD_ID) && loader.isModLoaded(DH_API_MOD_ID))
                || loader.isModLoaded(VOXY_MOD_ID);
    }

    /** Ensures {@link LodRuntimeDiagnostic} is loaded and delegates to its static methods. */
    private static void ensureInitialized() {
        if (initialized) {
            return;
        }
        modPresent = isModPresent();
        initialized = true;
        if (!modPresent) {
            LOG.debug("[LOX DIAG] Skipped — neither Distant Horizons nor Voxy is installed");
        }
    }

    // ========== Delegating methods ==========

    public static void resetObservations() {
        ensureInitialized();
        if (modPresent) {
            LodRuntimeDiagnostic.resetObservations();
        }
    }

    public static void takeObservation(String phase, int tickCount) {
        ensureInitialized();
        if (modPresent) {
            LodRuntimeDiagnostic.takeObservation(phase, tickCount);
        }
    }

    public static void printFinalResult() {
        ensureInitialized();
        if (modPresent) {
            LodRuntimeDiagnostic.printFinalResult();
        }
    }

    public static int getDhRenderCallbackCount() {
        ensureInitialized();
        return modPresent ? LodRuntimeDiagnostic.getDhRenderCallbackCount() : 0;
    }

    public static boolean isDhRenderObserved() {
        ensureInitialized();
        return modPresent && LodRuntimeDiagnostic.isDhRenderObserved();
    }

    public static boolean isVoxyRenderObserved() {
        ensureInitialized();
        return modPresent && LodRuntimeDiagnostic.isVoxyRenderObserved();
    }
}

