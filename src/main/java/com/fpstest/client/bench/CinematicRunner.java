package com.fpstest.client.bench;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.bench.tests.ChunkFlybyBenchmark;
import com.fpstest.client.bench.tests.PackShaderBenchmark;
import com.fpstest.client.bench.world.EphemeralWorld;
import com.fpstest.client.config.FpsTestConfig;
import com.fpstest.client.gui.BenchmarkResultsScreen;
import com.fpstest.client.gui.I18n;
import com.fpstest.client.report.ReportWriter;
import com.fpstest.client.bench.ModDetector;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.GenericMessageScreen;
import net.minecraft.client.tutorial.TutorialSteps;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.phys.Vec3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.function.Consumer;

@Environment(EnvType.CLIENT)
public final class CinematicRunner {
    private static final Logger LOG = LoggerFactory.getLogger(CinematicRunner.class);

    private final Deque<RunPlan> queue = new ArrayDeque<>();
    private Runnable onFinished;
    private Consumer<String> onProgress;
    private State state = State.IDLE;
    private RunPlan plan;
    private Benchmark current;
    private BenchContext ctx;
    private BenchmarkResult.Builder builder;
    private int phaseIndex;
    private int phaseTicks;
    private int waitTicks;
    private int preloadedChunks;
    private long preloadStartNanos;
    private long preloadDurationMs;
    private int totalQueued;
    private int completedInQueue;
    private String sessionId;
    private String sessionLabel;
    private Path lastReportDir;
    private long entityCountAtSampleStart;
    private long entityCountAtSampleEnd;
    private final java.util.List<BenchmarkResult> session = new java.util.ArrayList<>();
    private Runnable sessionSetup;
    private Runnable sessionCleanup;
    private String mainPartLabel = "";
    private int partNumber = 1;
    private String partLabel = "";
    private boolean inMultiPhasePart;
    private int originalRenderDistance = -1;
    private boolean renderDistanceSaved = false;

    // Track previous benchmark category to detect Chunks category transitions
    private String previousCategory = "";
    private boolean dhVoxyEnabledForChunks = false;

    public State state() {
        return state;
    }

    public Benchmark current() {
        return current;
    }

    public RunPlan currentPlan() {
        return plan;
    }

    public int phaseTicks() {
        return phaseTicks;
    }

    public int totalQueued() {
        return totalQueued;
    }

    public int completedInQueue() {
        return completedInQueue;
    }

    public int queuedRemaining() {
        return queue.size();
    }

    public int preloadedChunks() {
        return preloadedChunks;
    }

    public String sessionLabel() {
        return sessionLabel;
    }

    public List<BenchmarkResult> sessionResults() {
        return List.copyOf(session);
    }

    public Path lastReportDir() {
        return lastReportDir;
    }

    public boolean busy() {
        return state != State.IDLE;
    }

    public synchronized boolean startSingle(RunPlan plan, Runnable onFinished) {
        return state != State.IDLE ? false : startQueue(List.of(plan), plan.bench.displayName(), onFinished);
    }

    public synchronized boolean startQueue(List<RunPlan> plans, String label, Runnable onFinished) {
        if (state == State.IDLE && !plans.isEmpty()) {
            resetSession();
            queue.clear();
            queue.addAll(plans);
            totalQueued = plans.size();
            completedInQueue = 0;
            this.onFinished = onFinished;
            sessionLabel = label;
            sessionId = java.time.LocalDateTime.now().toString().replace(':', '-');
            partNumber = 1;
            partLabel = mainPartLabel;
            inMultiPhasePart = false;
            saveRenderDistance();
            if (sessionSetup != null) {
                try {
                    sessionSetup.run();
                } catch (Throwable t) {
                    LOG.warn("[MC Benchmark Core] session setup failed", t);
                }
            }
            return dequeueNext();
        } else {
            return false;
        }
    }

    public void setProgressListener(Consumer<String> listener) {
        this.onProgress = listener;
    }

    /**
     * Registers session-level hooks for a multi-part run (e.g. the FULL BENCHMARK).
     * {@code setup} runs once before the first benchmark (to save the user's config
     * and establish a clean baseline); {@code cleanup} runs once after the last
     * benchmark finishes — including on cancellation/failure — to restore the user's
     * original configuration. Hooks are cleared automatically when the session ends.
     */
    public void setSessionHooks(Runnable setup, Runnable cleanup) {
        this.sessionSetup = setup;
        this.sessionCleanup = cleanup;
    }

    /**
     * Sets the label used for the "main" part (Part 1) of a multi-part session.
     * When set, the HUD shows "Part N - &lt;label&gt;" and each result records its
     * part number/label. Cleared automatically when the session ends.
     */
    public void setMainPartLabel(String label) {
        this.mainPartLabel = label == null ? "" : label;
    }

    /** True when the current session is a labelled multi-part run (e.g. FULL BENCHMARK). */
    public boolean hasParts() {
        return !mainPartLabel.isEmpty();
    }

    /** 1-based number of the part currently running (1 = main part). */
    public int currentPartNumber() {
        return partNumber;
    }

    /** Human-readable label of the part currently running. */
    public String currentPartLabel() {
        return partLabel;
    }

    private boolean dequeueNext() {
        RunPlan next = queue.pollFirst();
        if (next == null) {
            finishSession();
            return false;
        } else {
            // Check for category transition to/from "Chunks" to manage DH/Voxy
            String newCategory = next.bench.category();
            if (!previousCategory.isEmpty() && !newCategory.equals(previousCategory)) {
                // Category changed
                if ("Chunks".equals(previousCategory)) {
                    // Leaving Chunks category - disable DH/Voxy
                    LOG.info("[MC Benchmark Core] leaving Chunks category, disabling DH/Voxy");
                    if (dhVoxyEnabledForChunks) {
                        // Access FullBenchmarkConfig via the session hooks - we need a reference
                        // The sessionCleanup is FullBenchmarkConfig.restore, but we need the intermediate methods
                        // We'll handle this via a callback mechanism
                        disableDhVoxyForChunks.run();
                        dhVoxyEnabledForChunks = false;
                    }
                }
                if ("Chunks".equals(newCategory)) {
                    // Entering Chunks category - enable DH/Voxy
                    LOG.info("[MC Benchmark Core] entering Chunks category, enabling DH/Voxy");
                    enableDhVoxyForChunks.run();
                    dhVoxyEnabledForChunks = true;
                }
            } else if (previousCategory.isEmpty() && "Chunks".equals(newCategory)) {
                // First benchmark is in Chunks category
                LOG.info("[MC Benchmark Core] first benchmark is Chunks category, enabling DH/Voxy");
                enableDhVoxyForChunks.run();
                dhVoxyEnabledForChunks = true;
            }
            previousCategory = newCategory;

            plan = next;
            current = plan.bench;
            phaseTicks = 0;
            waitTicks = 0;
            preloadedChunks = 0;
            // Part tracking: a multi-phase benchmark begins a new part (Parts 2-5 of the
            // FULL BENCHMARK); single-phase benchmarks stay in the current part (Part 1).
            if (current.phaseCount() > 1) {
                inMultiPhasePart = true;
                if (completedInQueue > 0) {
                    partNumber++;
                }
                partLabel = current.phaseDisplayName(0);
            } else {
                inMultiPhasePart = false;
                partLabel = mainPartLabel;
            }
            applyRenderDistanceFor(current);
            LOG.info("[MC Benchmark Core] starting benchmark: {} (preset={})", current.id(), plan.presetName);
            if (onProgress != null) {
                onProgress.accept("Loading " + current.displayName());
            }

            EphemeralWorld.deleteSaveBlocking();

            try {
                EphemeralWorld.create(current.seed(), current.worldType());
            } catch (Throwable var3) {
                LOG.error("[MC Benchmark Core] world creation failed", var3);
                abortCurrent("world creation failed: " + var3.getMessage());
                return false;
            }

            state = State.WORLD_LOADING;
            return true;
        }
    }

    // Callbacks for DH/Voxy management - will be set by FullBenchmarkConfig
    private Runnable enableDhVoxyForChunks = () -> {};
    private Runnable disableDhVoxyForChunks = () -> {};

    public void setDhVoxyCallbacks(Runnable enable, Runnable disable) {
        this.enableDhVoxyForChunks = enable;
        this.disableDhVoxyForChunks = disable;
    }

    public synchronized void abortAll(String reason) {
        LOG.warn("[MC Benchmark Core] abort all: {}", reason);
        queue.clear();
        abortCurrent(reason);
    }

    public synchronized void abortCurrentRequested(String reason) {
        if (state != State.IDLE) {
            abortCurrent(reason);
        }
    }

    private void abortCurrent(String reason) {
        LOG.warn("[MC Benchmark Core] abort current: {}", reason);
        // If we're in the Chunks category and DH/Voxy was enabled, disable it first
        if (dhVoxyEnabledForChunks) {
            LOG.info("[MC Benchmark Core] aborting while in Chunks category, disabling DH/Voxy");
            disableDhVoxyForChunks.run();
            dhVoxyEnabledForChunks = false;
        }
        if (current != null) {
            // Restore any temporary environment changes (resource packs, shaders, etc.)
            // even when a benchmark is aborted mid-run.
            try {
                if (ctx != null) {
                    current.cleanup(ctx);
                }
            } catch (Throwable var7) {
                LOG.warn("[MC Benchmark Core] cleanup during abort failed for {}", current.id(), var7);
            }
            try {
                BenchmarkResult.Builder b = builder != null
                    ? builder
                    : new BenchmarkResult.Builder(current.id(), current.displayName(), current.category());
                b.extra("status", "failed");
                b.extra("fail_reason", reason != null ? reason : "unknown");
                b.extra("aborted_state", state != null ? state.name() : "UNKNOWN");
                if (hasParts()) {
                    b.extra("part", currentPartNumber());
                    b.extra("part_label", currentPartLabel());
                }
                session.add(b.build());
            } catch (Throwable var6) {
                LOG.warn("[MC Benchmark Core] could not record failed-bench placeholder", var6);
            }
        }
        CinematicState.reset();
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            try {
                mc.level.disconnect(Component.literal(ModDetector.getBenchmarkTitle(" — aborted")));
            } catch (Throwable ignored) {
            }
            try {
                mc.setScreen(new GenericMessageScreen(Component.literal(ModDetector.getBenchmarkTitle(" — aborted"))));
            } catch (Throwable ignored) {
            }
        }
        state = State.POST_RUN;
        waitTicks = 0;
    }

    public void onClientTick(Minecraft mc) {
        try {
            tickInternal(mc);
        } catch (Throwable var5) {
            LOG.error("[MC Benchmark Core] runner tick failed — aborting current benchmark", var5);
            try {
                abortCurrent("runner tick threw: " + var5.getMessage());
            } catch (Throwable ignored) {
            }
        }
    }

    private void tickInternal(Minecraft mc) {
        if (state != State.IDLE) {
            switch (state) {
                case WORLD_LOADING:
                    if (mc.level != null && mc.player != null) {
                        state = State.READY_WAIT;
                        waitTicks = 0;
                    }
                    break;
                case READY_WAIT:
                    waitTicks++;
                    if (mc.level == null || mc.player == null) {
                        return;
                    }
                    if (mc.player.tickCount > 20 && waitTicks > 20 && mc.getSingleplayerServer() != null) {
                        beginPrepare(mc);
                    }
                    break;
                case PREPARING:
                    phaseTicks++;
                    if (current.isReady(ctx)) {
                        state = State.CHUNK_PRELOAD;
                        phaseTicks = 0;
                        preloadStartNanos = System.nanoTime();
                    }
                    break;
                case CHUNK_PRELOAD:
                    phaseTicks++;
                    CinematicState.pathTick = 0;
                    int ready = countLoadedChunksAroundCamera(mc);
                    preloadedChunks = ready;
                    int target = desiredLoadedChunks();
                    if (ready >= target || phaseTicks >= plan.preloadTicks) {
                        preloadDurationMs = (System.nanoTime() - preloadStartNanos) / 1000000L;
                        state = State.WARMUP;
                        phaseTicks = 0;
                        FpsTestClient.FPS.startRecording(plan.warmupTicks * 50 + 1000);
                        FpsTestClient.TICKS.startRecording(plan.warmupTicks + 20);
                    }
                    break;
                case WARMUP:
                    phaseTicks++;
                    CinematicState.pathTick++;
                    safeTick();
                    if (phaseTicks >= plan.warmupTicks) {
                        FpsTestClient.FPS.stopAndGetSamples();
                        FpsTestClient.TICKS.stopAndGetSamples();
                        FpsTestClient.FPS.startRecording(plan.sampleTicks * 50 + 1000);
                        FpsTestClient.TICKS.startRecording(plan.sampleTicks + 20);
                        FpsTestClient.MEMORY.snapshot();
                        entityCountAtSampleStart = countLevelEntities(mc);
                        state = State.SAMPLING;
                        phaseTicks = 0;
                    }
                    break;
                case SAMPLING:
                    phaseTicks++;
                    CinematicState.pathTick++;
                    safeTick();
                    if (phaseTicks >= plan.sampleTicks) {
                        entityCountAtSampleEnd = countLevelEntities(mc);
                        finishSampling();
                        if (phaseIndex < current.phaseCount() - 1) {
                            // More measurement phases remain: set up the next phase and
                            // wait for it to be ready before warming up + sampling again.
                            phaseIndex++;
                            try {
                                current.onPhaseComplete(ctx);
                            } catch (Throwable t) {
                                LOG.warn("[MC Benchmark Core] onPhaseComplete failed for {}", current.id(), t);
                            }
                            builder = newBuilder(phaseIndex);
                            state = State.PHASE_TRANSITION;
                            phaseTicks = 0;
                            CinematicState.holdPose = false;
                            // Part tracking: each new phase of a multi-phase benchmark is a new part.
                            if (inMultiPhasePart) {
                                partNumber++;
                                partLabel = current.phaseDisplayName(phaseIndex);
                            }
                        } else {
                            state = State.COOLDOWN;
                            phaseTicks = 0;
                            CinematicState.holdPose = true;
                        }
                    }
                    break;
                case PHASE_TRANSITION:
                    phaseTicks++;
                    if (current.isReady(ctx)) {
                        state = State.WARMUP;
                        phaseTicks = 0;
                        FpsTestClient.FPS.startRecording(plan.warmupTicks * 50 + 1000);
                        FpsTestClient.TICKS.startRecording(plan.warmupTicks + 20);
                    }
                    break;
                case COOLDOWN:
                    phaseTicks++;
                    if (phaseTicks >= plan.cooldownTicks) {
                        try {
                            current.cleanup(ctx);
                        } catch (Throwable ignored) {
                        }
                        ctx.removeTracked();
                        disconnectWorld(mc);
                    }
                    break;
                case DISCONNECTING:
                    waitTicks++;
                    if (mc.level == null || waitTicks > 100) {
                        state = State.POST_RUN;
                        waitTicks = 0;
                    }
                    break;
                case POST_RUN:
                    waitTicks++;
                    if (waitTicks > 8) {
                        completedInQueue++;
                        EphemeralWorld.deleteSaveQuietly();
                        if (queue.isEmpty()) {
                            finishSession();
                        } else {
                            dequeueNext();
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private int desiredLoadedChunks() {
        return 48;
    }

    private int countLoadedChunksAroundCamera(Minecraft mc) {
        if (mc.level == null) {
            return 0;
        }
        com.fpstest.client.bench.camera.Pose pose = CinematicState.currentPose(0.0F);
        Vec3 pos = pose != null ? pose.pos() : (mc.player != null ? mc.player.position() : Vec3.ZERO);
        int cx = (int) Math.floor(pos.x) >> 4;
        int cz = (int) Math.floor(pos.z) >> 4;
        int loaded = 0;
        for (int dx = -4; dx <= 4; dx++) {
            for (int dz = -4; dz <= 4; dz++) {
                if (mc.level.isLoaded(new net.minecraft.core.BlockPos((cx + dx) << 4, 0, (cz + dz) << 4))) {
                    loaded++;
                }
            }
        }
        return loaded;
    }

    private int countLevelEntities(Minecraft mc) {
        if (mc.level == null) {
            return 0;
        }
        int n = 0;
        try {
            var it = mc.level.entitiesForRendering().iterator();
            while (it.hasNext()) {
                it.next();
                n++;
            }
            return n;
        } catch (Throwable t) {
            return 0;
        }
    }

    private void safeTick() {
        try {
            current.tick(ctx);
        } catch (Throwable var2) {
            LOG.warn("[MC Benchmark Core] tick failed for {}", current.id(), var2);
        }
    }

    private void finishSampling() {
        double[] frames = FpsTestClient.FPS.stopAndGetSamples();
        double[] ticks = FpsTestClient.TICKS.stopAndGetSamples();
        double[] fpsSamples = new double[frames.length];
        for (int i = 0; i < frames.length; i++) {
            fpsSamples[i] = frames[i] > 0.0 ? 1000.0 / frames[i] : 0.0;
        }
        double meanFrameMs = 0.0;
        if (frames.length > 0) {
            double sum = 0.0;
            for (double f : frames) {
                sum += f;
            }
            meanFrameMs = sum / frames.length;
        }
        double harmonicFps = meanFrameMs > 0.0 ? 1000.0 / meanFrameMs : 0.0;
        builder
            .sampleTicks(plan.sampleTicks)
            .frameTimes(frames)
            .tickTimes(ticks)
            .fps(com.fpstest.client.metrics.Stats.of(fpsSamples))
            .frameTimeMs(com.fpstest.client.metrics.Stats.of(frames))
            .tickTimeMs(com.fpstest.client.metrics.Stats.of(ticks))
            .heap(FpsTestClient.MEMORY.snapshotHeap(), FpsTestClient.MEMORY.usedBytes(), FpsTestClient.MEMORY.peakBytesSinceSnapshot())
            .gc(FpsTestClient.MEMORY.gcEventsSinceSnapshot(), FpsTestClient.MEMORY.gcTimeMsSinceSnapshot())
            .extra("fps_1pct_low", com.fpstest.client.metrics.Stats.lowPercentFps(frames, 0.01))
            .extra("fps_0p1pct_low", com.fpstest.client.metrics.Stats.lowPercentFps(frames, 0.001))
            .extra("fps_harmonic_avg", harmonicFps)
            .extra("seed", (double) current.seed())
            .extra("preload_chunks", (double) preloadedChunks)
            .extra("preload_duration_ms", (double) preloadDurationMs)
            .extra("entity_count_sample_start", (double) entityCountAtSampleStart)
            .extra("entity_count_sample_end", (double) entityCountAtSampleEnd)
            .extra("entity_count_delta", (double) (entityCountAtSampleEnd - entityCountAtSampleStart))
            .extra("preset_quick", "quick".equals(plan.presetName) ? 1.0 : 0.0)
            .extra("preset_full", "full".equals(plan.presetName) ? 1.0 : 0.0)
            .extra("preset_long", "long".equals(plan.presetName) ? 1.0 : 0.0);

        if (hasParts()) {
            builder.extra("part", currentPartNumber());
            builder.extra("part_label", currentPartLabel());
        }

        try {
            current.recordExtra(ctx, builder);
        } catch (Throwable var13) {
            LOG.warn("[MC Benchmark Core] recordExtra failed for {}", current.id(), var13);
        }

        BenchmarkResult r = builder.build();
        session.add(r);
        LOG.info(
            "[MC Benchmark Core] {} done — avg {} fps, 1%low {} fps, tick {} ms",
            current.id(), (int) r.fps().avg(), (int) com.fpstest.client.metrics.Stats.lowPercentFps(r.frameTimesMs(), 0.01), (int) r.tickTimeMs().avg()
        );
    }

    private void disconnectWorld(Minecraft mc) {
        mc.setScreen(new GenericMessageScreen(Component.literal(ModDetector.getBenchmarkTitle(" — finishing " + current.displayName() + "…"))));
        CinematicState.holdPose = false;
        CinematicState.active = false;
        CinematicState.path = null;
        try {
            if (mc.level != null) {
                mc.level.disconnect(Component.literal(ModDetector.getBenchmarkTitle(" — finished")));
            }
            mc.setScreen(new GenericMessageScreen(Component.literal(ModDetector.getBenchmarkTitle())));
        } catch (Throwable var3) {
            LOG.warn("[MC Benchmark Core] disconnect failed", var3);
        }
        state = State.DISCONNECTING;
        waitTicks = 0;
    }

    private void finishSession() {
        Minecraft mc = Minecraft.getInstance();
        List<BenchmarkResult> sessionCopy = List.copyOf(session);
        String sid = sessionId;
        String label = sessionLabel;
        String presetName = plan != null ? plan.presetName : "";
        mc.execute(() -> {
            try {
                Path dir = ReportWriter.write(sessionCopy, sid);
                lastReportDir = dir;
                LOG.info("[MC Benchmark Core] session report written to {}", dir);
            } catch (Throwable var4x) {
                LOG.error("[MC Benchmark Core] report export failed", var4x);
            }
        });
        if (FpsTestConfig.get().completionSound) {
            try {
                mc.getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.EXPERIENCE_ORB_PICKUP, 1.0F, 0.7F));
            } catch (Throwable var8) {
            }
        }
        // If we're still in the Chunks category when session ends, disable DH/Voxy
        // before the final restore (which will restore original config)
        if (dhVoxyEnabledForChunks) {
            LOG.info("[MC Benchmark Core] session ending while in Chunks category, disabling DH/Voxy");
            disableDhVoxyForChunks.run();
            dhVoxyEnabledForChunks = false;
        }
        // Session-level cleanup (restore the user's original config) before showing results.
        if (sessionCleanup != null) {
            try {
                sessionCleanup.run();
            } catch (Throwable t) {
                LOG.warn("[Minecraft Benchmark Core] session cleanup failed", t);
            }
        }
        restoreRenderDistance();
        sessionSetup = null;
        sessionCleanup = null;
        mainPartLabel = "";
        state = State.IDLE;
        current = null;
        plan = null;
        ctx = null;
        builder = null;
        phaseTicks = 0;
        waitTicks = 0;
        previousCategory = "";
        dhVoxyEnabledForChunks = false;
        Runnable cb = onFinished;
        onFinished = null;
        mc.execute(() -> {
            // Defensive: clear any lingering resource-reload overlay (e.g. a stuck
            // LoadingOverlay from the last benchmark's cleanup) so the results screen is
            // never hidden behind the red Mojang loading screen.
            try {
                mc.setOverlay(null);
            } catch (Throwable ignored) {
            }
            if (sessionCopy.isEmpty()) {
                if (cb != null) {
                    cb.run();
                } else {
                    mc.setScreen(new TitleScreen());
                }
            } else {
                mc.setScreen(new BenchmarkResultsScreen(sessionCopy, lastReportDir, label, presetName, cb));
            }
        });
    }

    private BenchmarkResult.Builder newBuilder(int phaseIndex) {
        return new BenchmarkResult.Builder(current.id(), current.phaseDisplayName(phaseIndex), current.category());
    }

    private void beginPrepare(Minecraft mc) {
        ctx = new BenchContext(mc);
        ctx.setPlan(plan);
        phaseIndex = 0;
        builder = newBuilder(0);
        CinematicState.reset();
        CinematicState.active = true;
        CinematicState.holdPose = false;
        try {
            mc.getTutorial().setStep(TutorialSteps.NONE);
        } catch (Throwable ignored) {
        }
        try {
            current.prepare(ctx);
        } catch (Throwable t) {
            LOG.error("[MC Benchmark Core] prepare failed for {}", current.id(), t);
            abortCurrent("prepare failed: " + t.getMessage());
            return;
        }
        state = State.PREPARING;
    }

    private void resetSession() {
        session.clear();
        sessionId = null;
        sessionLabel = null;
        lastReportDir = null;
        totalQueued = 0;
        completedInQueue = 0;
    }

    /**
     * Saves the user's current render distance so it can be restored when the
     * session ends. The benchmark temporarily changes render distance per test
     * (see {@link #applyRenderDistanceFor(Benchmark)}).
     */
    private void saveRenderDistance() {
        try {
            Minecraft mc = Minecraft.getInstance();
            originalRenderDistance = mc.options.renderDistance().get();
            renderDistanceSaved = true;
            LOG.info("[MC Benchmark Core] saved original render distance: {} chunks", originalRenderDistance);
        } catch (Throwable t) {
            LOG.warn("[MC Benchmark Core] could not save render distance", t);
            originalRenderDistance = -1;
            renderDistanceSaved = false;
        }
    }

    /**
     * Sets the render distance appropriate for the given benchmark as part of the
     * existing part/test sequencing:
     * <ul>
     *   <li>front half of Part 1 (non-flyby tests): 6 chunks so the superflat
     *       arena terrain does not visually dominate the test,</li>
     *   <li>terrain-heavy flyby tests (back half of Part 1): 32 chunks so the
     *       single-biome world is actually visible,</li>
     *   <li>shader benchmark section (Parts 2-5): 16 chunks.</li>
     * </ul>
     */
    private void applyRenderDistanceFor(Benchmark bench) {
        int rd;
        if (bench instanceof ChunkFlybyBenchmark) {
            rd = 32;
        } else if (bench instanceof PackShaderBenchmark) {
            rd = 16;
        } else {
            rd = 6;
        }
        try {
            Minecraft mc = Minecraft.getInstance();
            mc.options.renderDistance().set(rd);
            LOG.info("[MC Benchmark Core] render distance set to {} chunks for benchmark {}", rd, bench.id());
        } catch (Throwable t) {
            LOG.warn("[MC Benchmark Core] could not set render distance to {} for {}", rd, bench.id(), t);
        }
    }

    /** Restores the user's original render distance saved at session start. */
    private void restoreRenderDistance() {
        if (!renderDistanceSaved || originalRenderDistance < 0) {
            return;
        }
        try {
            Minecraft mc = Minecraft.getInstance();
            mc.options.renderDistance().set(originalRenderDistance);
            LOG.info("[MC Benchmark Core] restored render distance to {} chunks", originalRenderDistance);
        } catch (Throwable t) {
            LOG.warn("[MC Benchmark Core] could not restore render distance", t);
        }
        originalRenderDistance = -1;
        renderDistanceSaved = false;
    }

    public static String stateLabel(State s) {
        return I18n.tr("fpstest.state." + s.name().toLowerCase(java.util.Locale.ROOT));
    }

    @Environment(EnvType.CLIENT)
    public enum State {
        IDLE,
        WORLD_LOADING,
        READY_WAIT,
        PREPARING,
        CHUNK_PRELOAD,
        WARMUP,
        SAMPLING,
        PHASE_TRANSITION,
        COOLDOWN,
        DISCONNECTING,
        POST_RUN
    }
}