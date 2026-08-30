package com.dgm.mcbc.bench.metrics;

public final class FpsTracker {
    private final RingBuffer<Long> frameTimes = new RingBuffer<>(1000);
    private long lastFrameTime = 0;
    private int frameCount = 0;
    private double currentFps = 0;

    public void onFrame(long currentTimeNanos) {
        if (lastFrameTime > 0) {
            long delta = currentTimeNanos - lastFrameTime;
            frameTimes.add(delta);
        }
        lastFrameTime = currentTimeNanos;
        frameCount++;

        if (frameTimes.isFull()) {
            long sum = 0;
            for (int i = 0; i < frameTimes.size(); i++) {
                sum += frameTimes.get(i);
            }
            currentFps = 1_000_000_000.0 / (sum / frameTimes.size());
        }
    }

    public double getCurrentFps() {
        return currentFps;
    }

    public double getAverageFps() {
        if (frameTimes.size() == 0) return 0;
        long sum = 0;
        for (int i = 0; i < frameTimes.size(); i++) {
            sum += frameTimes.get(i);
        }
        return 1_000_000_000.0 / (sum / frameTimes.size());
    }

    public double getMinFps() {
        if (frameTimes.size() == 0) return 0;
        long maxFrameTime = 0;
        for (int i = 0; i < frameTimes.size(); i++) {
            long ft = frameTimes.get(i);
            if (ft > maxFrameTime) maxFrameTime = ft;
        }
        return 1_000_000_000.0 / maxFrameTime;
    }

    public double getMaxFps() {
        if (frameTimes.size() == 0) return 0;
        long minFrameTime = Long.MAX_VALUE;
        for (int i = 0; i < frameTimes.size(); i++) {
            long ft = frameTimes.get(i);
            if (ft < minFrameTime) minFrameTime = ft;
        }
        return 1_000_000_000.0 / minFrameTime;
    }

    public double getPercentileFps(double p) {
        if (frameTimes.size() == 0) return 0;
        long[] times = new long[frameTimes.size()];
        for (int i = 0; i < frameTimes.size(); i++) {
            times[i] = frameTimes.get(i);
        }
        java.util.Arrays.sort(times);
        int idx = (int) Math.ceil(p / 100.0 * times.length) - 1;
        idx = Math.max(0, Math.min(idx, times.length - 1));
        return 1_000_000_000.0 / times[idx];
    }

    public int getFrameCount() {
        return frameCount;
    }

    public void reset() {
        frameTimes.clear();
        lastFrameTime = 0;
        frameCount = 0;
        currentFps = 0;
    }
}