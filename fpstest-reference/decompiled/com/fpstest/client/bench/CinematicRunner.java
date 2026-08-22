package com.fpstest.client.bench;

import com.fpstest.client.FpsTestClient;
import com.fpstest.client.bench.camera.Pose;
import com.fpstest.client.bench.world.EphemeralWorld;
import com.fpstest.client.config.FpsTestConfig;
import com.fpstest.client.control.CinematicState;
import com.fpstest.client.gui.BenchmarkResultsScreen;
import com.fpstest.client.gui.I18n;
import com.fpstest.client.metrics.Stats;
import com.fpstest.client.report.ReportWriter;
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
import net.minecraft.class_1109;
import net.minecraft.class_1157;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3417;
import net.minecraft.class_424;
import net.minecraft.class_442;
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
   private CinematicRunner.State state = CinematicRunner.State.IDLE;
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

   public CinematicRunner.State state() {
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
      return this.state != CinematicRunner.State.IDLE;
   }

   public List<BenchmarkResult> sessionResults() {
      return List.copyOf(this.session);
   }

   public Path lastReportDir() {
      return this.lastReportDir;
   }

   public synchronized boolean startSingle(RunPlan plan, Runnable onFinished) {
      return this.state != CinematicRunner.State.IDLE ? false : this.startQueue(List.of(plan), plan.bench.displayName(), onFinished);
   }

   public synchronized boolean startQueue(List<RunPlan> plans, String label, Runnable onFinished) {
      if (this.state == CinematicRunner.State.IDLE && !plans.isEmpty()) {
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

         this.state = CinematicRunner.State.WORLD_LOADING;
         return true;
      }
   }

   public synchronized void abortAll(String reason) {
      LOG.warn("[FPS Test] abort all: {}", reason);
      this.queue.clear();
      this.abortCurrent(reason);
   }

   public synchronized void abortCurrentRequested(String reason) {
      if (this.state != CinematicRunner.State.IDLE) {
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
      class_310 mc = class_310.method_1551();
      if (mc.field_1687 != null) {
         try {
            mc.field_1687.method_8525();
         } catch (Throwable var5) {
         }

         try {
            mc.method_56134(new class_424(class_2561.method_43470("FPS Test — aborted")));
         } catch (Throwable var4) {
         }
      }

      this.state = CinematicRunner.State.POST_RUN;
      this.waitTicks = 0;
   }

   public static String stateLabel(CinematicRunner.State s) {
      return I18n.tr("fpstest.state." + s.name().toLowerCase(Locale.ROOT));
   }

   public synchronized void onClientTick(class_310 mc) {
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

   private void tickInternal(class_310 mc) {
      if (this.state != CinematicRunner.State.IDLE) {
         switch (this.state) {
            case WORLD_LOADING:
               if (mc.field_1687 != null && mc.field_1724 != null) {
                  this.state = CinematicRunner.State.READY_WAIT;
                  this.waitTicks = 0;
               }
               break;
            case READY_WAIT:
               this.waitTicks++;
               if (mc.field_1687 == null || mc.field_1724 == null) {
                  return;
               }

               if (mc.field_1724.field_6012 > 20 && this.waitTicks > 20 && mc.method_1576() != null) {
                  this.beginPrepare(mc);
               }
               break;
            case PREPARING:
               this.state = CinematicRunner.State.CHUNK_PRELOAD;
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
                  this.state = CinematicRunner.State.WARMUP;
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
                  this.state = CinematicRunner.State.SAMPLING;
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
                  this.state = CinematicRunner.State.COOLDOWN;
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
               if (mc.field_1687 == null || this.waitTicks > 100) {
                  this.state = CinematicRunner.State.POST_RUN;
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

   private int countLoadedChunksAroundCamera(class_310 mc) {
      if (mc.field_1687 == null) {
         return 0;
      } else {
         class_243 pos = this.cameraPos(mc);
         int cx = (int)Math.floor(pos.field_1352) >> 4;
         int cz = (int)Math.floor(pos.field_1350) >> 4;
         int loaded = 0;

         for (int dx = -4; dx <= 4; dx++) {
            for (int dz = -4; dz <= 4; dz++) {
               if (mc.field_1687.method_8393(cx + dx, cz + dz)) {
                  loaded++;
               }
            }
         }

         return loaded;
      }
   }

   private class_243 cameraPos(class_310 mc) {
      Pose pose = CinematicState.currentPose(0.0F);
      if (pose != null) {
         return pose.pos();
      } else {
         return mc.field_1724 != null ? mc.field_1724.method_19538() : class_243.field_1353;
      }
   }

   public int preloadedChunks() {
      return this.preloadedChunks;
   }

   private int countLevelEntities(class_310 mc) {
      if (mc.field_1687 == null) {
         return 0;
      } else {
         int n = 0;

         try {
            for (class_1297 ignored : mc.field_1687.method_18112()) {
               n++;
            }

            return n;
         } catch (Throwable var5) {
            return 0;
         }
      }
   }

   private void beginPrepare(class_310 mc) {
      this.ctx = new BenchContext(mc);
      this.ctx.setPlan(this.plan);
      this.builder = new BenchmarkResult.Builder(this.current.id(), this.current.displayName(), this.current.category());
      CinematicState.reset();
      CinematicState.active = true;
      CinematicState.holdPose = false;

      try {
         mc.method_1577().method_4910(class_1157.field_5653);
      } catch (Throwable var4) {
      }

      try {
         this.current.prepare(this.ctx);
      } catch (Throwable var3) {
         LOG.error("[FPS Test] prepare failed for {}", this.current.id(), var3);
         this.abortCurrent("prepare failed: " + var3.getMessage());
         return;
      }

      this.state = CinematicRunner.State.PREPARING;
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
      this.builder
         .sampleTicks(this.plan.sampleTicks)
         .frameTimes(frames)
         .tickTimes(ticks)
         .fps(Stats.of(fpsSamples))
         .frameTimeMs(Stats.of(frames))
         .tickTimeMs(Stats.of(ticks))
         .heap(FpsTestClient.MEMORY.snapshotHeap(), FpsTestClient.MEMORY.usedBytes(), FpsTestClient.MEMORY.peakBytesSinceSnapshot())
         .gc(FpsTestClient.MEMORY.gcEventsSinceSnapshot(), FpsTestClient.MEMORY.gcTimeMsSinceSnapshot())
         .extra("fps_1pct_low", Stats.lowPercentFps(frames, 0.01))
         .extra("fps_0p1pct_low", Stats.lowPercentFps(frames, 0.001))
         .extra("fps_harmonic_avg", harmonicFps)
         .extra("seed", (double)this.current.seed())
         .extra("preload_chunks", (double)this.preloadedChunks)
         .extra("preload_duration_ms", (double)this.preloadDurationMs)
         .extra("entity_count_sample_start", (double)this.entityCountAtSampleStart)
         .extra("entity_count_sample_end", (double)this.entityCountAtSampleEnd)
         .extra("entity_count_delta", (double)(this.entityCountAtSampleEnd - this.entityCountAtSampleStart))
         .extra("preset_quick", "quick".equals(this.plan.presetName) ? 1.0 : 0.0)
         .extra("preset_full", "full".equals(this.plan.presetName) ? 1.0 : 0.0)
         .extra("preset_long", "long".equals(this.plan.presetName) ? 1.0 : 0.0);

      try {
         this.current.recordExtra(this.ctx, this.builder);
      } catch (Throwable var13) {
         LOG.warn("[FPS Test] recordExtra failed for {}", this.current.id(), var13);
      }

      BenchmarkResult r = this.builder.build();
      this.session.add(r);
      LOG.info(
         "[FPS Test] {} done — avg {} fps, 1%low {} fps, tick {} ms",
         new Object[]{this.current.id(), (int)r.fps().avg(), (int)Stats.lowPercentFps(r.frameTimesMs(), 0.01), (int)r.tickTimeMs().avg()}
      );
   }

   private void disconnectWorld(class_310 mc) {
      mc.method_1507(new class_424(class_2561.method_43470("FPS Test — finishing " + this.current.displayName() + "…")));
      CinematicState.holdPose = false;
      CinematicState.active = false;
      CinematicState.path = null;

      try {
         if (mc.field_1687 != null) {
            mc.field_1687.method_8525();
         }

         mc.method_56134(new class_424(class_2561.method_43470("FPS Test")));
      } catch (Throwable var3) {
         LOG.warn("[FPS Test] disconnect failed", var3);
      }

      this.state = CinematicRunner.State.DISCONNECTING;
      this.waitTicks = 0;
   }

   private void finishSession() {
      class_310 mc = class_310.method_1551();
      List<BenchmarkResult> sessionCopy = List.copyOf(this.session);
      String sid = this.sessionId;
      String label = this.sessionLabel;
      String presetName = this.plan != null ? this.plan.presetName : "";
      mc.execute(() -> {
         try {
            Path dir = ReportWriter.write(sessionCopy, sid);
            this.lastReportDir = dir;
            LOG.info("[FPS Test] session report written to {}", dir);
         } catch (Throwable var4x) {
            LOG.error("[FPS Test] report export failed", var4x);
         }
      });
      if (FpsTestConfig.get().completionSound) {
         try {
            mc.method_1483().method_4873(class_1109.method_4757(class_3417.field_14627, 1.0F, 0.7F));
         } catch (Throwable var8) {
         }
      }

      this.state = CinematicRunner.State.IDLE;
      this.current = null;
      this.plan = null;
      this.ctx = null;
      this.builder = null;
      this.phaseTicks = 0;
      this.waitTicks = 0;
      Runnable cb = this.onFinished;
      this.onFinished = null;
      mc.execute(() -> {
         if (sessionCopy.isEmpty()) {
            if (cb != null) {
               cb.run();
            } else {
               mc.method_1507(new class_442());
            }
         } else {
            mc.method_1507(new BenchmarkResultsScreen(sessionCopy, this.lastReportDir, label, presetName, cb));
         }
      });
   }

   public void resetSession() {
      this.session.clear();
      this.sessionId = null;
      this.sessionLabel = null;
      this.lastReportDir = null;
      this.totalQueued = 0;
      this.completedInQueue = 0;
   }

   @Environment(EnvType.CLIENT)
   public static enum State {
      IDLE,
      WORLD_LOADING,
      READY_WAIT,
      PREPARING,
      CHUNK_PRELOAD,
      WARMUP,
      SAMPLING,
      COOLDOWN,
      DISCONNECTING,
      POST_RUN;
   }
}
