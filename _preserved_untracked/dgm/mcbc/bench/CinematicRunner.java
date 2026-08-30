package com.dgm.mcbc.bench;

import com.dgm.mcbc.FpsTestClient;
import com.dgm.mcbc.bench.camera.Pose;
import com.dgm.mcbc.bench.world.EphemeralWorld;
import com.dgm.mcbc.config.FpsTestConfig;
import com.dgm.mcbc.control.CinematicState;
import com.dgm.mcbc.metrics.Stats;
import com.dgm.mcbc.report.ReportWriter;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.util.math.Vec3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class CinematicRunner {
    private static final Logger LOG = LoggerFactory.getLogger(CinematicRunner.class);
    private final List<BenchmarkResult> session = new ArrayList<>();
    private final Deque<RunPlan> queue = new ArrayDeque<>();
    private Path lastReportDir;
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
    private int entityCountAtSampleStart;
    private int entityCountAtSampleEnd;
    private int totalQueued;
    private int completedInQueue;
    private String sessionId;
    private String sessionLabel;

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

    public State state() {
        return this.state;
    }

    public Benchmark current() {
        return this.current;
    }

    public RunPlan currentPlan() {
        return this.plan;
    }

    public int phaseTicks() {
        return this.phaseTicks;
    }

    public int totalQueued() {
        return this.totalQueued;
    }

    public int completedInQueue() {
        return this.completedInQueue;
    }

    public int queuedRemaining() {
        return this.queue.size();
    }

    public String sessionLabel() {
        return this.sessionLabel;
    }

    public boolean busy() {
        return this.state != State.IDLE;
    }

    public List<BenchmarkResult> sessionResults() {
        return List.copyOf(this.session);
    }

    public Path lastReportDir() {
        return this.lastReportDir;
    }

    public synchronized boolean startSingle(RunPlan plan, Runnable onFinished) {
        return this.state != State.IDLE ? false : this.startQueue(List.of(plan), plan.bench.displayName(), onFinished);
    }

    public synchronized boolean startQueue(List<RunPlan> plans, String label, Runnable onFinished) {
        if (this.state == State.IDLE && !plans.isEmpty()) {
            this.resetSession();
            this.queue.clear();
            this.queue.addAll(plans);
            this.totalQueued = plans.size();
            this.completedInQueue = 0;
            this.onFinished = onFinished;
            this.sessionLabel = label;
            this.sessionId = LocalDateTime.now().toString().replace(':', '-');
            return this.dequeueNext();
        } else {
            return false;
        }
    }

    public void setProgressListener(Consumer<String> listener) {
        this.onProgress = listener;
    }

    private boolean dequeueNext() {
        RunPlan next = this.queue.pollFirst();
        if (next == null) {
            this.finishSession();
            return false;
        } else {
            this.plan = next;
            this.current = this.plan.bench;
            this.phaseTicks = 0;
            this.waitTicks = 0;
            this.preloadedChunks = 0;
            LOG.info("[FPS Test] starting benchmark: {} (preset={})", this.current.id(), this.plan.presetName);
            if (this.onProgress != null) {
                this.onProgress.accept("Loading " + this.current.displayName());
            }

            EphemeralWorld.deleteSaveBlocking();

            try {
                EphemeralWorld.create(this.current.seed(), this.current.worldType());
            } catch (Throwable var3) {
                LOG.error("[FPS Test] world creation failed", var3);
                this.abortCurrent("world creation failed: " + var3.getMessage());
                return false;
            }

            this.state = State.WORLD_LOADING;
            return true;
        }
    }

    public synchronized void abortAll(String reason) {
        LOG.warn("[FPS Test] abort all: {}", reason);
        this.queue.clear();
        this.abortCurrent(reason);
    }

    public synchronized void abortCurrentRequested(String reason) {
        if (this.state != State.IDLE) {
            this.abortCurrent(reason);
        }
    }

    private void abortCurrent(String reason) {
        LOG.warn("[FPS Test] abort current: {}", reason);
        if (this.current != null) {
            try {
                BenchmarkResult.Builder b = this.builder != null
                    ? this.builder
                    : new BenchmarkResult.Builder(this.current.id(), this.current.displayName(), this.current.category());
                b.extra("status", "failed");
                b.extra("fail_reason", reason != null ? reason : "unknown");
                b.extra("aborted_state", this.state != null ? this.state.name() : "UNKNOWN");
                this.session.add(b.build());
            } catch (Throwable var6) {
                LOG.warn("[FPS Test] could not record failed-bench placeholder", var6);
            }
        }

        CinematicState.reset();
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.level != null) {
            try {
                mc.level.disconnect();
            } catch (Throwable var5) {
            }

            try {
                mc.setScreen(new net.minecraft.client.gui.screens.Screen(Component.literal("FPS Test — aborted")));
            } catch (Throwable var4) {
            }
        }

        this.state = State.POST_RUN;
        this.waitTicks = 0;
    }

    public static String stateLabel(State s) {
        return s.name().toLowerCase(Locale.ROOT);
    }

    public synchronized void onClientTick(MinecraftClient mc) {
        try {
            this.tickInternal(mc);
        } catch (Throwable var5) {
            Throwable t = var5;
            LOG.error("[FPS Test] runner tick failed — aborting current benchmark", var5);

            try {
                this.abortCurrent("runner tick threw: " + t.getMessage());
            } catch (Throwable var4) {
            }
        }
    }

    private void tickInternal(MinecraftClient mc) {
        if (this.state != State.IDLE) {
            switch (this.state) {
                case WORLD_LOADING:
                    if (mc.level != null && mc.player != null) {
                        this.state = State.READY_WAIT;
                        this.waitTicks = 0;
                    }
                    break;
                case READY_WAIT:
                    this.waitTicks++;
                    if (mc.level == null || mc.player == null) {
                        return;
                    }

                    if (mc.player.tickCount > 20 && this.waitTicks > 20 && mc.getServer() != null) {
                        this.beginPrepare(mc);
                    }
                    break;
                case PREPARING:
                    this.state = State.CHUNK_PRELOAD;
                    this.phaseTicks = 0;
                    this.preloadStartNanos = System.nanoTime();
                    break;
                case CHUNK_PRELOAD:
                    this.phaseTicks++;
                    CinematicState.pathTick = 0;
                    int ready = this.countLoadedChunksAroundCamera(mc);
                    this.preloadedChunks = ready;
                    int target = this.desiredLoadedChunks();
                    if (ready >= target || this.phaseTicks >= this.plan.preloadTicks) {
                        this.preloadDurationMs = (System.nanoTime() - this.preloadStartNanos) / 1000000L;
                        this.state = State.WARMUP;
                        this.phaseTicks = 0;
                        FpsTestClient.FPS.startRecording(this.plan.warmupTicks * 50 + 1000);
                        FpsTestClient.TICKS.startRecording(this.plan.warmupTicks + 20);
                    }
                    break;
                case WARMUP:
                    this.phaseTicks++;
                    CinematicState.pathTick++;
                    this.safeTick();
                    if (this.phaseTicks >= this.plan.warmupTicks) {
                        FpsTestClient.FPS.stopAndGetSamples();
                        FpsTestClient.TICKS.stopAndGetSamples();
                        FpsTestClient.FPS.startRecording(this.plan.sampleTicks * 50 + 1000);
                        FpsTestClient.TICKS.startRecording(this.plan.sampleTicks + 20);
                        FpsTestClient.MEMORY.snapshot();
                        this.entityCountAtSampleStart = this.countLevelEntities(mc);
                        this.state = State.SAMPLING;
                        this.phaseTicks = 0;
                    }
                    break;
                case SAMPLING:
                    this.phaseTicks++;
                    CinematicState.pathTick++;
                    this.safeTick();
                    if (this.phaseTicks >= this.plan.sampleTicks) {
                        this.entityCountAtSampleEnd = this.countLevelEntities(mc);
                        this.finishSampling();
                        this.state = State.COOLDOWN;
                        this.phaseTicks = 0;
                        CinematicState.holdPose = true;
                    }
                    break;
                case COOLDOWN:
                    this.phaseTicks++;
                    if (this.phaseTicks >= this.plan.cooldownTicks) {
                        try {
                            this.current.cleanup(this.ctx);
                        } catch (Throwable var4) {
                            LOG.warn("cleanup failed", var4);
                        }

                        this.ctx.removeTracked();
                        this.disconnectWorld(mc);
                    }
                    break;
                case DISCONNECTING:
                    this.waitTicks++;
                    if (mc.level == null || this.waitTicks > 100) {
                        this.state = State.POST_RUN;
                        this.waitTicks = 0;
                    }
                    break;
                case POST_RUN:
                    this.waitTicks++;
                    if (this.waitTicks > 8) {
                        this.completedInQueue++;
                        EphemeralWorld.deleteSaveQuietly();
                        if (this.queue.isEmpty()) {
                            this.finishSession();
                        } else {
                            this.dequeueNext();
                        }
                    }
            }
        }
    }

    private int desiredLoadedChunks() {
        return 48;
    }

    private int countLoadedChunksAroundCamera(MinecraftClient mc) {
        if (mc.level == null) {
            return 0;
        } else {
            Vec3 pos = this.cameraPos(mc);
            int cx = (int)Math.floor(pos.x) >> 4;
            int cz = (int)Math.floor(pos.z) >> 4;
            int loaded = 0;

            for (int dx = -4; dx <= 4; dx++) {
                for (int dz = -4; dz <= 4; dz++) {
                    if (mc.level.getChunk(cx + dx, cz + dz) != null) {
                        loaded++;
                    }
                }
            }

            return loaded;
        }
    }

    private Vec3 cameraPos(MinecraftClient mc) {
        Pose pose = CinematicState.currentPose(0.0F);
        if (pose != null) {
            return pose.pos();
        } else {
            return mc.player != null ? mc.player.position() : Vec3.ZERO;
        }
    }

    public int preloadedChunks() {
        return this.preloadedChunks;
    }

    private int countLevelEntities(MinecraftClient mc) {
        if (mc.level == null) {
            return 0;
        } else {
            int n = 0;

            try {
                for (net.minecraft.entity.Entity ignored : mc.level.getEntities()) {
                    n++;
                }

                return n;
            } catch (Throwable var5) {
                return 0;
            }
        }
    }

    private void beginPrepare(MinecraftClient mc) {
        this.ctx = new BenchContext(mc);
        this.ctx.setPlan(this.plan);
        this.builder = new BenchmarkResult.Builder(this.current.id(), this.current.displayName(), this.current.category());
        CinematicState.reset();
        CinematicState.active = true;
        CinematicState.holdPose = false;

        try {
            mc.getSoundManager().stop();
        } catch (Throwable var4) {
        }

        try {
            this.current.prepare(this.ctx);
        } catch (Throwable var3) {
            LOG.error("[FPS Test] prepare failed for {}", this.current.id(), var3);
            this.abortCurrent("prepare failed: " + var3.getMessage());
            return;
        }

        this.state = State.PREPARING;
    }

    private void safeTick() {
        try {
            this.current.tick(this.ctx);
        } catch (Throwable var2) {
            LOG.warn("[FPS Test] tick failed for {}", this.current.id(), var2);
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

        BenchmarkResult.FrameStats fpsStats = Stats.compute(fpsSamples);
        BenchmarkResult.FrameStats frameTimeStats = Stats.compute(frames);
        BenchmarkResult.FrameStats tickTimeStats = Stats.compute(ticks);

        this.builder.fps(fpsStats);
        this.builder.frameTimeMs(frameTimeStats);
        this.builder.tickTimeMs(tickTimeStats);
        this.builder.frameTimes(frames);
        this.builder.tickTimes(ticks);
        this.builder.sampleTicks(this.plan.sampleTicks);
    }

    private void disconnectWorld(MinecraftClient mc) {
        if (mc.level != null) {
            mc.level.disconnect();
        }
        mc.setLevel(null);
    }

    private void finishSession() {
        this.state = State.IDLE;
        if (this.onFinished != null) {
            this.onFinished.run();
        }
    }

    private void resetSession() {
        this.session.clear();
        this.lastReportDir = null;
    }
}