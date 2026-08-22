package com.fpstest.client.metrics;

import com.fpstest.client.bench.BenchmarkResult;
import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class Stats {
   private Stats() {
   }

   public static BenchmarkResult.FrameStats of(double[] samples) {
      if (samples.length == 0) {
         return BenchmarkResult.FrameStats.EMPTY;
      } else {
         double[] sorted = (double[])samples.clone();
         Arrays.sort(sorted);
         double sum = 0.0;
         double min = sorted[0];
         double max = sorted[sorted.length - 1];

         for (double s : sorted) {
            sum += s;
         }

         double avg = sum / sorted.length;
         double variance = 0.0;

         for (double s : sorted) {
            double d = s - avg;
            variance += d * d;
         }

         variance /= sorted.length;
         double stdDev = Math.sqrt(variance);
         return new BenchmarkResult.FrameStats(
            avg, min, max, percentile(sorted, 0.5), percentile(sorted, 0.95), percentile(sorted, 0.99), percentile(sorted, 0.999), stdDev, sorted.length
         );
      }
   }

   public static double percentile(double[] sorted, double p) {
      if (sorted.length == 0) {
         return 0.0;
      } else {
         double rank = p * (sorted.length - 1);
         int lo = (int)Math.floor(rank);
         int hi = (int)Math.ceil(rank);
         if (lo == hi) {
            return sorted[lo];
         } else {
            double frac = rank - lo;
            return sorted[lo] + frac * (sorted[hi] - sorted[lo]);
         }
      }
   }

   public static double lowPercentFps(double[] frameTimesMs, double worstFraction) {
      if (frameTimesMs.length == 0) {
         return 0.0;
      } else {
         double rawCount = frameTimesMs.length * worstFraction;
         if (rawCount < 0.5) {
            return Double.NaN;
         } else {
            double[] sorted = (double[])frameTimesMs.clone();
            Arrays.sort(sorted);
            int count = Math.max(1, (int)Math.round(rawCount));
            double sum = 0.0;

            for (int i = sorted.length - count; i < sorted.length; i++) {
               sum += sorted[i];
            }

            double avgMs = sum / count;
            return avgMs > 0.0 ? 1000.0 / avgMs : 0.0;
         }
      }
   }
}
