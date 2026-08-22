package com.fpstest.client.bench;

import java.util.LinkedHashMap;
import java.util.Map;

public record BenchmarkResult(
        String id,
        String displayName,
        String category,
        long timestampMillis,
        long durationMillis,
        int sampleTicks,
        FrameStats fps,
        FrameStats frameTimeMs,
        FrameStats tickTimeMs,
        long heapUsedStart,
        long heapUsedEnd,
        long heapPeak,
        int gcEvents,
        long gcTimeMs,
        double[] frameTimesMs,
        double[] tickTimesMs,
        Map<String, Double> extras,
        Map<String, String> stringExtras) {

    public record FrameStats(
            double avg,
            double min,
            double max,
            double p50,
            double p95,
            double p99,
            double p999,
            double stdDev,
            int samples) {
        public static final FrameStats EMPTY = new FrameStats(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public static final class Builder {
        private final String id;
        private final String displayName;
        private final String category;
        private final long startMillis;
        private int sampleTicks;
        private FrameStats fps = FrameStats.EMPTY;
        private FrameStats frameTimeMs = FrameStats.EMPTY;
        private FrameStats tickTimeMs = FrameStats.EMPTY;
        private long heapStart;
        private long heapEnd;
        private long heapPeak;
        private int gcEvents;
        private long gcTimeMs;
        private double[] frameTimesMs = new double[0];
        private double[] tickTimesMs = new double[0];
        private final Map<String, Double> extras = new LinkedHashMap<>();
        private final Map<String, String> stringExtras = new LinkedHashMap<>();

        public Builder(String id, String displayName, String category) {
            this.id = id;
            this.displayName = displayName;
            this.category = category;
            this.startMillis = System.currentTimeMillis();
        }

        public Builder sampleTicks(int sampleTicks) {
            this.sampleTicks = sampleTicks;
            return this;
        }

        public Builder fps(FrameStats fps) {
            this.fps = fps;
            return this;
        }

        public Builder frameTimeMs(FrameStats frameTimeMs) {
            this.frameTimeMs = frameTimeMs;
            return this;
        }

        public Builder tickTimeMs(FrameStats tickTimeMs) {
            this.tickTimeMs = tickTimeMs;
            return this;
        }

        public Builder heap(long heapStart, long heapEnd, long heapPeak) {
            this.heapStart = heapStart;
            this.heapEnd = heapEnd;
            this.heapPeak = heapPeak;
            return this;
        }

        public Builder gc(int gcEvents, long gcTimeMs) {
            this.gcEvents = gcEvents;
            this.gcTimeMs = gcTimeMs;
            return this;
        }

        public Builder frameTimes(double[] frameTimesMs) {
            this.frameTimesMs = frameTimesMs;
            return this;
        }

        public Builder tickTimes(double[] tickTimesMs) {
            this.tickTimesMs = tickTimesMs;
            return this;
        }

        public Builder extra(String key, double value) {
            extras.put(key, value);
            return this;
        }

        public Builder extra(String key, int value) {
            extras.put(key, (double) value);
            return this;
        }

        public Builder extra(String key, String value) {
            stringExtras.put(key, value);
            return this;
        }

        public BenchmarkResult build() {
            return new BenchmarkResult(
                    id,
                    displayName,
                    category,
                    startMillis,
                    System.currentTimeMillis() - startMillis,
                    sampleTicks,
                    fps,
                    frameTimeMs,
                    tickTimeMs,
                    heapStart,
                    heapEnd,
                    heapPeak,
                    gcEvents,
                    gcTimeMs,
                    frameTimesMs,
                    tickTimesMs,
                    Map.copyOf(extras),
                    Map.copyOf(stringExtras));
        }
    }
}
