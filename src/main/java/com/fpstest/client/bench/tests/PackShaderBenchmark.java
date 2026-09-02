package com.fpstest.client.bench.tests;

import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.iris.IrisShaderControl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.repository.PackRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Optional benchmark mode that:
 * <ol>
 *   <li>temporarily enables a specific resource pack ({@value #RESOURCE_PACK_NAME}),</li>
 *   <li>temporarily selects and enables a specific Iris shader pack ({@value #SHADER_PACK_NAME}),</li>
 *   <li>runs the existing Base FPS Benchmark (showcase),</li>
 *   <li>shows the normal {@code BenchmarkResultsScreen} afterwards, and</li>
 *   <li>restores the user's exact previous resource-pack and Iris shader configuration.</li>
 * </ol>
 *
 * <p>Iris is optional: if it is not installed, the benchmark still runs with the
 * resource pack enabled and simply records {@code iris_present=0}. Iris classes
 * are only touched through {@link IrisShaderControl} after an {@code isModLoaded}
 * guard, so this mod never hard-depends on Iris.</p>
 */
@Environment(EnvType.CLIENT)
public final class PackShaderBenchmark implements Benchmark {
    private static final Logger LOG = LoggerFactory.getLogger(PackShaderBenchmark.class);

    /**
     * Resource pack ID as used by {@link PackRepository}. Minecraft derives the
     * ID of a zip pack in the resourcepacks directory as {@code "file/" + filename},
     * so {@code pbr.zip} has the ID {@code "file/pbr.zip"}.
     */
    public static final String RESOURCE_PACK_ID = "file/pbr.zip";
    /** Human-readable resource pack file name (for display / reports). */
    public static final String RESOURCE_PACK_NAME = "pbr.zip";
    /** Shader pack (folder/zip name inside the shaderpacks directory) to select + enable. */
    public static final String SHADER_PACK_NAME = "highEnd.zip";

    /** Max ticks to wait for the shader to actually start rendering before proceeding anyway. */
    private static final int SHADER_READY_TIMEOUT_TICKS = 600; // 30 s

    private final BaseFpsBenchmark delegate = new BaseFpsBenchmark();

    private boolean setupStarted;
    private boolean setupComplete;
    private boolean cleanedUp;
    private boolean irisPresent;
    private boolean shaderEnabled;
    private boolean shaderFailed;
    private boolean shaderInUseDuringSample;
    private List<String> originalPackIds = List.of();
    private String originalShaderPackName;
    private boolean originalShadersEnabled;
    private CompletableFuture<Void> packReloadFuture;
    private int shaderWaitTicks;

    // --- identity / metadata (delegated to the showcase) ---

    @Override
    public String id() {
        return "pack_shader_showcase";
    }

    @Override
    public String displayName() {
        return "PBR + Shader Showcase";
    }

    @Override
    public String category() {
        return "Showcase";
    }

    @Override
    public String description() {
        return "Runs the Base FPS Benchmark (showcase) with the '" + RESOURCE_PACK_NAME
            + "' resource pack and the '" + SHADER_PACK_NAME + "' Iris shader pack temporarily enabled. "
            + "Your previous resource-pack and shader configuration is restored afterwards.";
    }

    @Override
    public long seed() {
        return delegate.seed();
    }

    @Override
    public WorldType worldType() {
        return delegate.worldType();
    }

    @Override
    public int warmupTicks() {
        return delegate.warmupTicks();
    }

    @Override
    public int sampleTicks() {
        return delegate.sampleTicks();
    }

    @Override
    public int cooldownTicks() {
        return delegate.cooldownTicks();
    }

    @Override
    public int preloadTicks() {
        return delegate.preloadTicks();
    }

    @Override
    public boolean heavy() {
        return delegate.heavy();
    }

    @Override
    public boolean fixedDuration() {
        return delegate.fixedDuration();
    }

    @Override
    public void prepare(BenchContext ctx) {
        Minecraft mc = ctx.client;
        setupStarted = true;
        setupComplete = false;
        cleanedUp = false;
        shaderEnabled = false;
        shaderFailed = false;
        shaderInUseDuringSample = false;
        shaderWaitTicks = 0;

        // 1. Save the user's exact current resource-pack selection.
        PackRepository repo = mc.getResourcePackRepository();
        originalPackIds = List.copyOf(repo.getSelectedIds());

        // 2. Save the user's exact current Iris state (only if Iris is present).
        irisPresent = IrisShaderControl.isPresent();
        if (irisPresent) {
            try {
                originalShadersEnabled = IrisShaderControl.areShadersEnabled();
                originalShaderPackName = IrisShaderControl.getShaderPackName().orElse(null);
                LOG.info(
                    "[FPS Test] saved Iris state: enabled={}, pack={}",
                    originalShadersEnabled,
                    originalShaderPackName == null ? "(internal)" : originalShaderPackName
                );
            } catch (Throwable t) {
                LOG.warn("[FPS Test] could not read Iris state; treating Iris as absent", t);
                irisPresent = false;
            }
        }

        // 3. Temporarily enable the fixed resource pack (async reload).
        List<String> newSelection = new ArrayList<>(originalPackIds);
        if (!newSelection.contains(RESOURCE_PACK_ID)) {
            newSelection.add(RESOURCE_PACK_ID);
        }
        try {
            if (!repo.getAvailableIds().contains(RESOURCE_PACK_ID)) {
                LOG.warn("[FPS Test] resource pack '{}' (id '{}') not found in resourcepacks directory", RESOURCE_PACK_NAME, RESOURCE_PACK_ID);
            }
            repo.setSelected(newSelection);
            packReloadFuture = mc.reloadResourcePacks();
        } catch (Throwable t) {
            LOG.warn("[FPS Test] resource pack enable failed", t);
            packReloadFuture = CompletableFuture.completedFuture(null);
        }

        // 4. Build the showcase scene (delegated to the existing benchmark).
        delegate.prepare(ctx);
    }

    @Override
    public boolean isReady(BenchContext ctx) {
        if (!setupStarted) {
            return false;
        }
        if (setupComplete) {
            return true;
        }
        // Wait for the resource-pack reload to finish applying before enabling the shader,
        // so the shader compiles against the intended resource pack.
        if (packReloadFuture != null && !packReloadFuture.isDone()) {
            return false;
        }
        // Enable the shader only after the resource pack is applied.
        if (irisPresent && !shaderEnabled && !shaderFailed) {
            try {
                IrisShaderControl.enableShaderPack(SHADER_PACK_NAME);
                shaderEnabled = true;
                LOG.info("[FPS Test] enabled shader pack '{}'", SHADER_PACK_NAME);
            } catch (Throwable t) {
                LOG.warn("[FPS Test] shader enable failed; continuing without shader", t);
                shaderFailed = true;
            }
        }
        // Wait for the shader to actually be in use (compiled + rendering).
        if (irisPresent && shaderEnabled && !shaderFailed) {
            if (IrisShaderControl.isShaderPackInUse()) {
                shaderInUseDuringSample = true;
                setupComplete = true;
                return true;
            }
            shaderWaitTicks++;
            if (shaderWaitTicks >= SHADER_READY_TIMEOUT_TICKS) {
                LOG.warn(
                    "[FPS Test] shader pack '{}' did not become active within {} ticks; continuing without it",
                    SHADER_PACK_NAME,
                    SHADER_READY_TIMEOUT_TICKS
                );
                setupComplete = true;
                return true;
            }
            return false;
        }
        setupComplete = true;
        return true;
    }

    @Override
    public void tick(BenchContext ctx) {
        delegate.tick(ctx);
    }

    @Override
    public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
        delegate.recordExtra(ctx, r);
        r.extra("resource_pack", RESOURCE_PACK_NAME);
        r.extra("shader_pack", SHADER_PACK_NAME);
        r.extra("iris_present", irisPresent ? 1.0 : 0.0);
        r.extra("shader_in_use", shaderInUseDuringSample ? 1.0 : 0.0);
    }

    @Override
    public void cleanup(BenchContext ctx) {
        if (cleanedUp) {
            return;
        }
        cleanedUp = true;
        Minecraft mc = ctx.client;

        // 1. Restore the user's exact Iris state (shader pack name + enabled flag).
        if (irisPresent) {
            try {
                IrisShaderControl.restore(originalShaderPackName, originalShadersEnabled);
                LOG.info(
                    "[FPS Test] restored Iris state: enabled={}, pack={}",
                    originalShadersEnabled,
                    originalShaderPackName == null ? "(internal)" : originalShaderPackName
                );
            } catch (Throwable t) {
                LOG.warn("[FPS Test] Iris state restore failed", t);
            }
        }

        // 2. Restore the user's exact resource-pack selection.
        try {
            PackRepository repo = mc.getResourcePackRepository();
            repo.setSelected(originalPackIds);
            if (packReloadFuture != null && !packReloadFuture.isDone()) {
                // The enable-reload is still in flight; apply the restore after it finishes.
                packReloadFuture.thenRun(() -> {
                    try {
                        mc.reloadResourcePacks();
                    } catch (Throwable t) {
                        LOG.warn("[FPS Test] resource pack restore reload failed", t);
                    }
                });
            } else {
                mc.reloadResourcePacks();
            }
        } catch (Throwable t) {
            LOG.warn("[FPS Test] resource pack restore failed", t);
        }

        // 3. Delegate cleanup (removes spawned entities, resets camera, etc.).
        try {
            delegate.cleanup(ctx);
        } catch (Throwable t) {
            LOG.warn("[FPS Test] delegate cleanup failed", t);
        }
    }
}