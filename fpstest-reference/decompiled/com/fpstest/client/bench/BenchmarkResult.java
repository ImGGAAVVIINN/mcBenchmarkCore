package com.fpstest.client.bench;

import java.util.LinkedHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record BenchmarkResult(
   String id,
   String displayName,
   String category,
   long timestampMillis,
   long durationMillis,
   int sampleTicks,
   BenchmarkResult.FrameStats fps,
   BenchmarkResult.FrameStats frameTimeMs,
   BenchmarkResult.FrameStats tickTimeMs,
   long heapUsedStart,
   long heapUsedEnd,
   long heapPeak,
   int gcEvents,
   long gcTimeMs,
   double[] frameTimesMs,
   double[] tickTimesMs,
   Map<String, Double> extras,
   Map<String, String> stringExtras
) {
   @Environment(EnvType.CLIENT)
   public static final class Builder {
      private final String id;
      private final String displayName;
      private final String category;
      private final long startMillis;
      private int sampleTicks;
      private BenchmarkResult.FrameStats fps = BenchmarkResult.FrameStats.EMPTY;
      private BenchmarkResult.FrameStats frameTimeMs = BenchmarkResult.FrameStats.EMPTY;
      private BenchmarkResult.FrameStats tickTimeMs = BenchmarkResult.FrameStats.EMPTY;
      private long heapStart;
      private long heapEnd;
      private long heapPeak;
      private int gcEvents;
      private long gcTimeMs;
      private double[] frameTimesMs = new double[0];
      private double[] tickTimesMs = new double[0];
      private final Map<String, Double> extras = new LinkedHashMap<>();
      private final Map<String, String> stringExtras = new LinkedHashMap<>();

      public Builder(String id, String name, String cat) {
         this.id = id;
         this.displayName = name;
         this.category = cat;
         this.startMillis = System.currentTimeMillis();
      }

      public BenchmarkResult.Builder sampleTicks(int n) {
         this.sampleTicks = n;
         return this;
      }

      public BenchmarkResult.Builder fps(BenchmarkResult.FrameStats s) {
         this.fps = s;
         return this;
      }

      public BenchmarkResult.Builder frameTimeMs(BenchmarkResult.FrameStats s) {
         this.frameTimeMs = s;
         return this;
      }

      public BenchmarkResult.Builder tickTimeMs(BenchmarkResult.FrameStats s) {
         this.tickTimeMs = s;
         return this;
      }

      public BenchmarkResult.Builder heap(long start, long end, long peak) {
         this.heapStart = start;
         this.heapEnd = end;
         this.heapPeak = peak;
         return this;
      }

      public BenchmarkResult.Builder gc(int events, long timeMs) {
         this.gcEvents = events;
         this.gcTimeMs = timeMs;
         return this;
      }

      public BenchmarkResult.Builder frameTimes(double[] samples) {
         this.frameTimesMs = samples;
         return this;
      }

      public BenchmarkResult.Builder tickTimes(double[] samples) {
         this.tickTimesMs = samples;
         return this;
      }

      public BenchmarkResult.Builder extra(String key, double value) {
         this.extras.put(key, value);
         return this;
      }

      public BenchmarkResult.Builder extra(String key, int value) {
         this.extras.put(key, (double)value);
         return this;
      }

      public BenchmarkResult.Builder extra(String key, String value) {
         this.stringExtras.put(key, value);
         return this;
      }

      public BenchmarkResult build() {
         return new BenchmarkResult(
            this.id,
            this.displayName,
            this.category,
            this.startMillis,
            System.currentTimeMillis() - this.startMillis,
            this.sampleTicks,
            this.fps,
            this.frameTimeMs,
            this.tickTimeMs,
            this.heapStart,
            this.heapEnd,
            this.heapPeak,
            this.gcEvents,
            this.gcTimeMs,
            this.frameTimesMs,
            this.tickTimesMs,
            Map.copyOf(this.extras),
            Map.copyOf(this.stringExtras)
         );
      }
   }

   @Environment(EnvType.CLIENT)
   public record FrameStats(double avg, double min, double max, double p50, double p95, double p99, double p999, double stdDev, int samples) {
      public static final BenchmarkResult.FrameStats EMPTY = new BenchmarkResult.FrameStats(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
   }
}
