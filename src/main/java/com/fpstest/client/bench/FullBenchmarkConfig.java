package com.fpstest.client.bench;

import com.fpstest.client.bench.iris.IrisShaderControl;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourcePackManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Session-level configuration guard for the FULL BENCHMARK.
 *
 * <p>Before the first part runs it saves the user's exact resource-pack selection
 * and Iris shader state, then establishes a clean baseline (shaders OFF, benchmark
 * resource packs OFF) so Part 1 — "Main Benchmark (no shaders)" — measures the
 * original workload under default rendering. When the session ends (success,
 * cancellation, or failure) it restores the user's exact previous configuration.</p>
 *
 * <p>This mirrors the save/restore philosophy already proven in
 * {@code PackShaderBenchmark}: save original state, change configuration, run,
 * then restore the original configuration. The shader parts (Parts 2-5) keep their
 * own nested save/restore; this guard wraps the whole session.</p>
 */
@Environment(EnvType.CLIENT)
public final class FullBenchmarkConfig {
    private static final Logger LOG = LoggerFactory.getLogger(FullBenchmarkConfig.class);

    /** Resource pack id of the benchmark PBR pack (see {@code PackShaderBenchmark}). */
    public static final String RESOURCE_PACK_ID = "file/pbr.zip";

    private List<String> originalPackIds = List.of();
    private String originalShaderPackName;
    private boolean originalShadersEnabled;
    private boolean irisPresent;
    private boolean saved;

    /** Saves the user's configuration and applies the clean baseline (shaders OFF, benchmark packs OFF). */
    public void saveAndDisable() {
        MinecraftClient mc = MinecraftClient.getInstance();
        ResourcePackManager repo = mc.getResourcePackManager();
        originalPackIds = List.copyOf(repo.getEnabledIds());
        irisPresent = IrisShaderControl.isPresent();
        if (irisPresent) {
            try {
                originalShadersEnabled = IrisShaderControl.areShadersEnabled();
                originalShaderPackName = IrisShaderControl.getShaderPackName().orElse(null);
            } catch (Throwable t) {
                LOG.warn("[MinecraftClient Benchmark Core] could not read Iris state; treating Iris as absent", t);
                irisPresent = false;
            }
        }
        // Clean baseline: remove the benchmark resource pack, disable shaders.
        List<String> clean = new ArrayList<>(originalPackIds);
        clean.remove(RESOURCE_PACK_ID);
        try {
            repo.setEnabledProfiles(clean);
            mc.reloadResources();
        } catch (Throwable t) {
            LOG.warn("[MinecraftClient Benchmark Core] could not disable benchmark resource packs", t);
        }
        if (irisPresent) {
            try {
                IrisShaderControl.restore(null, false);
            } catch (Throwable t) {
                LOG.warn("[MinecraftClient Benchmark Core] could not disable shaders", t);
            }
        }
        saved = true;
        LOG.info("[MinecraftClient Benchmark Core] FULL BENCHMARK baseline: shaders OFF, benchmark resource packs OFF");
    }

    /** Restores the user's exact previous configuration. */
    public void restore() {
        if (!saved) {
            return;
        }
        saved = false;
        MinecraftClient mc = MinecraftClient.getInstance();
        if (irisPresent) {
            try {
                IrisShaderControl.restore(originalShaderPackName, originalShadersEnabled);
            } catch (Throwable t) {
                LOG.warn("[MinecraftClient Benchmark Core] Iris state restore failed", t);
            }
        }
        try {
            ResourcePackManager repo = mc.getResourcePackManager();
            repo.setEnabledProfiles(originalPackIds);
            // NOTE: intentionally NOT calling mc.reloadResources() here. During
            // session cleanup the singleplayer server has just been disconnected and a
            // synchronous resource reload leaves a LoadingOverlay (the red Mojang screen)
            // that never completes, freezing the client before the results screen appears.
            // The selection above is persisted and restored by the normal vanilla flow on
            // the next world load.
            LOG.info("[MinecraftClient Benchmark Core] restored resource pack selection (hot reload deferred to next world load)");
        } catch (Throwable t) {
            LOG.warn("[MinecraftClient Benchmark Core] resource pack restore failed", t);
        }
        LOG.info(
            "[MinecraftClient Benchmark Core] FULL BENCHMARK restored user config: shaders={}, pack={}, resourcePacks={}",
            originalShadersEnabled,
            originalShaderPackName == null ? "(internal)" : originalShaderPackName,
            originalPackIds
        );
    }
}