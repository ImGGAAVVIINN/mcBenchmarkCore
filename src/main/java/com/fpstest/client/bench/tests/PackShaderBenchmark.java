package com.fpstest.client.bench.tests;

import com.fpstest.client.bench.BenchContext;
import com.fpstest.client.bench.Benchmark;
import com.fpstest.client.bench.BenchmarkResult;
import com.fpstest.client.bench.WorldType;
import com.fpstest.client.bench.camera.CinematicState;
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
 * Optional benchmark mode that, as a SINGLE benchmark, automatically benchmarks
 * a matrix of Iris shader packs × resource-pack on/off against the same scene:
 * <ol>
 *   <li>phase 0: {@value #SHADER_PACKS[0]} with NO resource pack,</li>
 *   <li>phase 1: {@value #SHADER_PACKS[0]} with {@value #RESOURCE_PACK_NAME},</li>
 *   <li>phase 2: {@value #SHADER_PACKS[1]} with NO resource pack,</li>
 *   <li>phase 3: {@value #SHADER_PACKS[1]} with {@value #RESOURCE_PACK_NAME},</li>
 *   <li>shows the normal {@code BenchmarkResultsScreen} with ALL results, and</li>
 *   <li>restores the user's exact previous resource-pack and Iris shader configuration.</li>
 * </ol>
 *
 * <p>No user input is required between phases. Each phase produces its own
 * independent {@link BenchmarkResult} (never averaged or overwritten).</p>
 *
 * <p>Iris is optional: if it is not installed, the benchmark still runs and simply
 * records {@code iris_present=0}. Iris classes are only touched through
 * {@link IrisShaderControl} after an {@code isModLoaded} guard, so this mod never
 * hard-depends on Iris.</p>
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
    /** Shader packs (folder/zip names inside the shaderpacks directory), in run order. */
    public static final String[] SHADER_PACKS = {"lowEnd.zip", "highEnd.zip"};

    /** One measurement phase: a shader pack plus an optional resource pack (null = none). */
    private record Phase(String shaderPack, String resourcePackId) {
        String label() {
            return resourcePackId == null
                ? shaderPack + " (no pack)"
                : shaderPack + " + " + RESOURCE_PACK_NAME;
        }
    }

    /** The 4 phases, in run order: shader × resource-pack on/off. */
    private static final Phase[] PHASES = {
        new Phase("lowEnd.zip", null),
        new Phase("lowEnd.zip", RESOURCE_PACK_ID),
        new Phase("highEnd.zip", null),
        new Phase("highEnd.zip", RESOURCE_PACK_ID),
    };

    /** Max ticks to wait for a shader to actually start rendering before proceeding anyway. */
    private static final int SHADER_READY_TIMEOUT_TICKS = 600; // 30 s

    private final BaseFpsBenchmark delegate = new BaseFpsBenchmark();

    private boolean setupStarted;
    private boolean phaseReady;
    private boolean cleanedUp;
    private boolean irisPresent;
    private boolean shaderEnabled;
    private boolean shaderFailed;
    private boolean shaderInUseDuringSample;
    private int phaseIndex;
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
        return "Pack + Shader Benchmark";
    }

    @Override
    public String category() {
        return "Showcase";
    }

    @Override
    public String description() {
        return "Automatically benchmarks '" + SHADER_PACKS[0] + "' and '" + SHADER_PACKS[1]
            + "', each with and without the '" + RESOURCE_PACK_NAME + "' resource pack "
            + "(same scene, four independent results). Your previous resource-pack and "
            + "shader configuration is restored afterwards.";
    }

    @Override
    public int phaseCount() {
        return PHASES.length;
    }

    @Override
    public String phaseDisplayName(int phaseIndex) {
        return "Pack + Shader — " + PHASES[phaseIndex].label();
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
        phaseReady = false;
        cleanedUp = false;
        phaseIndex = 0;
        shaderEnabled = false;
        shaderFailed = false;
        shaderInUseDuringSample = false;
        shaderWaitTicks = 0;
        LOG.info(
            "[FPS Test] Pack + Shader Benchmark starting ({} phases: {})",
            phaseCount(),
            String.join(", ", java.util.Arrays.stream(PHASES).map(Phase::label).toList())
        );

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

        // 3. Apply phase 0's resource pack (none) and reload asynchronously.
        packReloadFuture = applyResourcePack(PHASES[0].resourcePackId());

        // 4. Build the showcase scene (delegated to the existing benchmark).
        delegate.prepare(ctx);
    }

    @Override
    public boolean isReady(BenchContext ctx) {
        if (!setupStarted) {
            return false;
        }
        if (phaseReady) {
            return true;
        }
        Phase phase = PHASES[phaseIndex];
        // Wait for the current phase's resource-pack reload to finish applying before
        // enabling the shader, so the shader compiles against the intended resource pack.
        if (packReloadFuture != null && !packReloadFuture.isDone()) {
            return false;
        }
        // Enable the current phase's shader (once).
        if (irisPresent && !shaderEnabled && !shaderFailed) {
            try {
                IrisShaderControl.enableShaderPack(phase.shaderPack());
                shaderEnabled = true;
                LOG.info("[FPS Test] Phase {}/{}: {} — shader enabled", phaseIndex + 1, phaseCount(), phase.label());
            } catch (Throwable t) {
                LOG.warn("[FPS Test] shader enable failed for '{}'; continuing without shader", phase.shaderPack(), t);
                shaderFailed = true;
            }
        }
        if (shaderFailed) {
            phaseReady = true;
            return true;
        }
        // Verify the SPECIFIC shader is actually active before measuring.
        if (irisPresent && shaderEnabled) {
            if (isShaderActive(phase.shaderPack())) {
                shaderInUseDuringSample = true;
                phaseReady = true;
                LOG.info("[FPS Test] Shader active: {}", phase.shaderPack());
                return true;
            }
            shaderWaitTicks++;
            if (shaderWaitTicks >= SHADER_READY_TIMEOUT_TICKS) {
                LOG.warn(
                    "[FPS Test] shader pack '{}' did not become active within {} ticks; continuing without it",
                    phase.shaderPack(),
                    SHADER_READY_TIMEOUT_TICKS
                );
                phaseReady = true;
                return true;
            }
            return false;
        }
        phaseReady = true;
        return true;
    }

    @Override
    public void onPhaseComplete(BenchContext ctx) {
        // Called after the previous phase's sampling completes. Advance to the next
        // phase (shader × resource pack), apply its resource pack, and replay the same
        // cinematic scene so every phase measures the same path.
        phaseIndex++;
        phaseReady = false;
        shaderEnabled = false;
        shaderFailed = false;
        shaderInUseDuringSample = false;
        shaderWaitTicks = 0;
        Phase phase = PHASES[phaseIndex];
        packReloadFuture = applyResourcePack(phase.resourcePackId());
        // Replay the camera path AND the world-side animation clock (combat arrows,
        // redstone animation, particles) so every phase measures an identical scene.
        CinematicState.pathTick = 0;
        delegate.resetAnimation();
        LOG.info("[FPS Test] Phase {}/{}: {} — switching", phaseIndex + 1, phaseCount(), phase.label());
    }

    @Override
    public void tick(BenchContext ctx) {
        delegate.tick(ctx);
    }

    @Override
    public void recordExtra(BenchContext ctx, BenchmarkResult.Builder r) {
        delegate.recordExtra(ctx, r);
        Phase phase = PHASES[phaseIndex];
        r.extra("resource_pack", phase.resourcePackId() == null ? "none" : RESOURCE_PACK_NAME);
        r.extra("shader_pack", phase.shaderPack());
        r.extra("phase", phaseIndex);
        r.extra("phase_count", phaseCount());
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

    /** True when the given shader pack is actually the one being used for rendering. */
    private boolean isShaderActive(String packName) {
        if (!irisPresent) {
            return false;
        }
        try {
            if (!IrisShaderControl.isShaderPackInUse()) {
                return false;
            }
            String current = IrisShaderControl.getCurrentPackName();
            if (current == null) {
                return false;
            }
            // Iris may report the pack name with or without the ".zip" extension.
            return current.equals(packName) || current.equals(stripZip(packName));
        } catch (Throwable t) {
            return false;
        }
    }

    /**
     * Applies the given resource pack to the selection (starting from the user's
     * original selection) and reloads asynchronously. A {@code null} id means "no
     * resource pack" (i.e. just the user's original selection).
     */
    private CompletableFuture<Void> applyResourcePack(String resourcePackId) {
        Minecraft mc = Minecraft.getInstance();
        PackRepository repo = mc.getResourcePackRepository();
        List<String> selection = new ArrayList<>(originalPackIds);
        if (resourcePackId != null && !selection.contains(resourcePackId)) {
            selection.add(resourcePackId);
        }
        try {
            if (resourcePackId != null && !repo.getAvailableIds().contains(resourcePackId)) {
                LOG.warn("[FPS Test] resource pack '{}' (id '{}') not found in resourcepacks directory", RESOURCE_PACK_NAME, resourcePackId);
            }
            repo.setSelected(selection);
            return mc.reloadResourcePacks();
        } catch (Throwable t) {
            LOG.warn("[FPS Test] resource pack apply failed for '{}'", resourcePackId, t);
            return CompletableFuture.completedFuture(null);
        }
    }

    private static String stripZip(String name) {
        return name.endsWith(".zip") ? name.substring(0, name.length() - 4) : name;
    }
}