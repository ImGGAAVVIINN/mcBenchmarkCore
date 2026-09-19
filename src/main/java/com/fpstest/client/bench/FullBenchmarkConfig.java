package com.fpstest.client.bench;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.iris.IrisShaderControl;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.repository.PackRepository;
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
 *
 * <p>Additionally, this class manages Distant Horizons and Voxy rendering state:
 * <ol>
 *   <li>At session start: capture original DH/Voxy config, disable both</li>
 *   <li>Before chunk-loading benchmarks (Part 1 "Chunks" category): enable DH at 4096 chunks, Voxy at 1024</li>
 *   <li>After chunk-loading benchmarks: disable both</li>
 *   <li>At session end: restore original DH/Voxy config</li>
 * </ol>
 * </p>
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

    // DH/Voxy controller for managing rendering state during chunk-loading tests
    private final DistantHorizonsVoxyController dhVoxyController = new DistantHorizonsVoxyController();

    /** Saves the user's configuration and applies the clean baseline (shaders OFF, benchmark packs OFF). */
    public void saveAndDisable() {
        Minecraft mc = Minecraft.getInstance();
        PackRepository repo = mc.getResourcePackRepository();
        originalPackIds = List.copyOf(repo.getSelectedIds());
        irisPresent = IrisShaderControl.isPresent();
        if (irisPresent) {
            try {
                originalShadersEnabled = IrisShaderControl.areShadersEnabled();
                originalShaderPackName = IrisShaderControl.getShaderPackName().orElse(null);
            } catch (Throwable t) {
                LOG.warn("[Minecraft Benchmark Core] could not read Iris state; treating Iris as absent", t);
                irisPresent = false;
            }
        }
        // Clean baseline: remove the benchmark resource pack, disable shaders.
        List<String> clean = new ArrayList<>(originalPackIds);
        clean.remove(RESOURCE_PACK_ID);
        try {
            repo.setSelected(clean);
            mc.reloadResourcePacks();
        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] could not disable benchmark resource packs", t);
        }
        if (irisPresent) {
            try {
                IrisShaderControl.restore(null, false);
            } catch (Throwable t) {
                LOG.warn("[Minecraft Benchmark Core] could not disable shaders", t);
            }
        }

        // Capture and disable DH/Voxy at session start
        dhVoxyController.captureAndDisable();

        // Set DH/Voxy callbacks on the runner for category transitions
        FpsTestClient.RUNNER.setDhVoxyCallbacks(
            dhVoxyController::enableForChunkLoading,
            dhVoxyController::disableAfterChunkLoading
        );

        saved = true;
        LOG.info("[Minecraft Benchmark Core] FULL BENCHMARK baseline: shaders OFF, benchmark resource packs OFF, DH/Voxy disabled");
    }

    /** Enables DH and Voxy for chunk-loading benchmarks (called before Chunks category runs). */
    public void enableDhVoxyForChunkLoading() {
        dhVoxyController.enableForChunkLoading();
    }

    /** Disables DH and Voxy after chunk-loading benchmarks (called after Chunks category completes). */
    public void disableDhVoxyAfterChunkLoading() {
        dhVoxyController.disableAfterChunkLoading();
    }

    /** Restores the user's exact previous configuration. */
    public void restore() {
        if (!saved) {
            return;
        }
        saved = false;
        Minecraft mc = Minecraft.getInstance();
        if (irisPresent) {
            try {
                IrisShaderControl.restore(originalShaderPackName, originalShadersEnabled);
            } catch (Throwable t) {
                LOG.warn("[Minecraft Benchmark Core] Iris state restore failed", t);
            }
        }
        try {
            // Reload resources to ensure the benchmark resource pack is fully unloaded.
            // Log diagnostics to verify state. The reload happens on worker threads and is
            // safe even after world disconnect; the overlay will tick normally.
            try {
                final PackRepository repo = mc.getResourcePackRepository();
                final List<String> before = List.copyOf(repo.getSelectedIds());
                repo.setSelected(originalPackIds);
                final CompletableFuture<Void> reloadFuture = mc.reloadResourcePacks();
                // Optional: await completion for extra safety in testing (non-blocking in prod)
                reloadFuture.whenComplete((unused, throwable) -> {
                    if (throwable != null) {
                        LOG.warn("[Minecraft Benchmark Core] resource pack restore reload failed", throwable);
                    } else {
                        final List<String> after = List.copyOf(repo.getSelectedIds());
                        LOG.info("[Minecraft Benchmark Core] restored resource pack selection and reloaded: before={}, after={}, pbr.zip present={}",
                                 before, after, after.contains(RESOURCE_PACK_ID));
                    }
                });
            } catch (Throwable t) {
                LOG.warn("[Minecraft Benchmark Core] resource pack restore failed", t);
            }
        } catch (Throwable t) {
            LOG.warn("[Minecraft Benchmark Core] resource pack restore failed", t);
        }
        // Restore DH/Voxy configuration
        dhVoxyController.restore();

        LOG.info(
            "[Minecraft Benchmark Core] FULL BENCHMARK restored user config: shaders={}, pack={}, resourcePacks={}",
            originalShadersEnabled,
            originalShaderPackName == null ? "(internal)" : originalShaderPackName,
            originalPackIds
        );
    }
}