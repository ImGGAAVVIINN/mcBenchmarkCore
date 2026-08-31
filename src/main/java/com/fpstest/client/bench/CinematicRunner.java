package com.fpstest.client.bench;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.camera.CinematicState;
import com.fpstest.client.bench.world.EphemeralWorld;
import com.fpstest.client.gui.I18n;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

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
    private int phaseTicks;
    private int waitTicks;
    private int preloadedChunks;
    private long preloadStartNanos;
    private long preloadDurationMs;
    private int totalQueued;
    private int completedInQueue;
    private String sessionId;
    private String sessionLabel;
    private long entityCountAtSampleStart;
    private long entityCountAtSampleEnd;
    private final java.util.List<BenchmarkResult> session = new java.util.ArrayList<>();

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
            return dequeueNext();
        } else {
            return false;
        }
    }

    public void setProgressListener(Consumer<String> listener) {
        this.onProgress = listener;
    }

    private boolean dequeueNext() {
        RunPlan next = queue.pollFirst();
        if (next == null) {
            finishSession();
            return false;
        } else {
            plan = next;
            current = plan.bench;
            phaseTicks = 0;
            waitTicks = 0;
            preloadedChunks = 0;
            LOG.info("[FPS Test] starting benchmark: {} (preset={})", current.id(), plan.presetName);
            if (onProgress != null) {
                onProgress.accept("Loading " + current.displayName());
            }

            EphemeralWorld.deleteSaveBlocking();

            try {
                EphemeralWorld.create(current.seed(), current.worldType());
            } catch (Throwable var3) {
                LOG.error("[FPS Test] world creation failed", var3);
                abortCurrent("world creation failed: " + var3.getMessage());
                return false;
            }

            state = State.WORLD_LOADING;
            return true;
        }
    }

    public synchronized void abortAll(String reason) {
        LOG.warn("[FPS Test] abort all: {}", reason);
        queue.clear();
        abortCurrent(reason);
    }

    public synchronized void abortCurrentRequested(String reason) {
        if (state != State.IDLE) {
            abortCurrent(reason);
        }
    }

    private void abortCurrent(String reason) {
        LOG.warn("[FPS Test] abort current: {}", reason);
        CinematicState.reset();
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null) {
            try {
                mc.level.disconnect(Component.literal("FPS Test — aborted: " + reason));
            } catch (Throwable ignored) {
            }
            try {
                mc.setScreen(new net.minecraft.client.gui.screens.Screen(Component.literal("FPS Test — aborted")) {
                    @Override
                    protected void init() {
                        this.addRenderableWidget(Button.builder(Component.literal("Back to Title"), b -> {
                            if (this.minecraft != null) {
                                this.minecraft.setScreen(null);
                            }
                        }).bounds(this.width / 2 - 100, this.height / 2, 200, 20).build());
                    }
                });
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
            LOG.error("[FPS Test] runner tick failed — aborting current benchmark", var5);
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
                    state = State.CHUNK_PRELOAD;
                    phaseTicks = 0;
                    preloadStartNanos = System.nanoTime();
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
                        state = State.COOLDOWN;
                        phaseTicks = 0;
                        CinematicState.holdPose = true;
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
            for (Entity ignored : mc.level.entitiesForRendering()) {
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
            LOG.warn("[FPS Test] tick failed for {}", current.id(), var2);
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

        try {
            current.recordExtra(ctx, builder);
        } catch (Throwable var13) {
            LOG.warn("[FPS Test] recordExtra failed for {}", current.id(), var13);
        }

        BenchmarkResult r = builder.build();
        session.add(r);
        LOG.info(
            "[FPS Test] {} done — avg {} fps, 1%low {} fps, tick {} ms",
            current.id(), (int) r.fps().avg(), (int) com.fpstest.client.metrics.Stats.lowPercentFps(r.frameTimesMs(), 0.01), (int) r.tickTimeMs().avg()
        );
    }

    private void disconnectWorld(Minecraft mc) {
        mc.setScreen(new net.minecraft.client.gui.screens.Screen(Component.literal("FPS Test — finishing " + current.displayName() + "…")) {
            @Override
            protected void init() {
                this.addRenderableWidget(Button.builder(Component.literal("Back to Title"), b -> {
                    if (this.minecraft != null) {
                        this.minecraft.setScreen(null);
                    }
                }).bounds(this.width / 2 - 100, this.height / 2, 200, 20).build());
            }
        });
        CinematicState.holdPose = false;
        CinematicState.active = false;
        CinematicState.path = null;
        try {
            if (mc.level != null) {
                mc.level.disconnect(Component.literal("FPS Test — finished"));
            }
            mc.setScreen(new net.minecraft.client.gui.screens.Screen(Component.literal("FPS Test")) {
                @Override
                protected void init() {
                    this.addRenderableWidget(Button.builder(Component.literal("Back to Title"), b -> {
                        if (this.minecraft != null) {
                            this.minecraft.setScreen(null);
                        }
                    }).bounds(this.width / 2 - 100, this.height / 2, 200, 20).build());
                }
            });
        } catch (Throwable var3) {
            LOG.warn("[FPS Test] disconnect failed", var3);
        }
        state = State.DISCONNECTING;
        waitTicks = 0;
    }

    private void finishSession() {
        Minecraft mc = Minecraft.getInstance();
        state = State.IDLE;
        current = null;
        plan = null;
        phaseTicks = 0;
        waitTicks = 0;
        Runnable cb = onFinished;
        onFinished = null;
        mc.execute(() -> {
            if (cb != null) {
                cb.run();
            } else {
                mc.setScreen(null);
            }
        });
    }

    private void beginPrepare(Minecraft mc) {
        ctx = new BenchContext(mc);
        ctx.setPlan(plan);
        builder = new BenchmarkResult.Builder(current.id(), current.displayName(), current.category());
        CinematicState.reset();
        CinematicState.active = true;
        CinematicState.holdPose = false;
        try {
            mc.options.setCameraType(CameraType.FIRST_PERSON);
        } catch (Throwable ignored) {
        }
        try {
            current.prepare(ctx);
        } catch (Throwable t) {
            LOG.error("[FPS Test] prepare failed for {}", current.id(), t);
            abortCurrent("prepare failed: " + t.getMessage());
            return;
        }
        state = State.PREPARING;
    }

    private void resetSession() {
        sessionId = null;
        sessionLabel = null;
        totalQueued = 0;
        completedInQueue = 0;
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
        COOLDOWN,
        DISCONNECTING,
        POST_RUN
    }
}