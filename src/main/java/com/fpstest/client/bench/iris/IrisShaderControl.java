package com.fpstest.client.bench.iris;

import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.api.v0.IrisApi;
import net.irisshaders.iris.config.IrisConfig;

/**
 * Thin, isolated wrapper around Iris's internal Java API.
 *
 * <p>This class directly references Iris classes, so it must ONLY be loaded and
 * called after {@link #isPresent()} returns {@code true}. Every call site must
 * guard with {@link #isPresent()} first — otherwise a {@link NoClassDefFoundError}
 * would be thrown when Iris is not installed.</p>
 *
 * <p>Iris's public API ({@code net.irisshaders.iris.api.v0}) exposes whether
 * shaders are enabled and whether a pack is in use, but it does NOT expose
 * selecting a specific shader pack by name. That is why this wrapper uses
 * Iris's internal {@link Iris} / {@link IrisConfig} classes for pack selection,
 * mirroring exactly what Iris's own {@code ShaderPackScreen} does on "Apply":
 * {@code setShaderPackName(name)} followed by {@code setShadersEnabledAndApply(enabled)}.</p>
 */
@Environment(EnvType.CLIENT)
public final class IrisShaderControl {
    private IrisShaderControl() {
    }

    /** True when the Iris mod is loaded at runtime. Safe to call unconditionally. */
    public static boolean isPresent() {
        return FabricLoader.getInstance().isModLoaded("iris");
    }

    /** Whether shaders are currently enabled in Iris's config. */
    public static boolean areShadersEnabled() {
        return IrisApi.getInstance().getConfig().areShadersEnabled();
    }

    /** The currently selected shader pack name, if any. */
    public static Optional<String> getShaderPackName() {
        return Iris.getIrisConfig().getShaderPackName();
    }

    /** Whether a shader pack is actually being used for rendering right now. */
    public static boolean isShaderPackInUse() {
        return IrisApi.getInstance().isShaderPackInUse();
    }

    /**
     * The name of the shader pack currently being used for rendering, or
     * {@code "(internal)"} when Iris's fallback pack is in use.
     */
    public static String getCurrentPackName() {
        return Iris.getCurrentPackName();
    }

    /**
     * Selects the given shader pack and enables shaders, applying immediately.
     * This mirrors what Iris's own shader-pack screen does on "Apply".
     */
    public static void enableShaderPack(String packName) {
        IrisConfig config = Iris.getIrisConfig();
        config.setShaderPackName(packName);
        IrisApi.getInstance().getConfig().setShadersEnabledAndApply(true);
    }

    /**
     * Restores a previously-saved Iris state: the exact shader pack name and
     * whether shaders were enabled. A {@code null} pack name selects Iris's
     * internal fallback pack.
     */
    public static void restore(String packName, boolean shadersEnabled) {
        IrisConfig config = Iris.getIrisConfig();
        config.setShaderPackName(packName);
        IrisApi.getInstance().getConfig().setShadersEnabledAndApply(shadersEnabled);
    }
}