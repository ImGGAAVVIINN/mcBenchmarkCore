package com.dgm.mcbc.bench.metrics;

public final class TickTracker {
    private final RingBuffer<Long> tickTimes = new RingBuffer<>(1000);
    private long lastTickTime = 0;
    private int tickCount = 0;
    private double currentTps = 20.0;

    public void onTick(long currentTimeNanos) {
        if (lastTickTime > 0) {
            long delta = currentTimeNanos - lastTickTime;
            tickTimes.add(delta);
        }
        lastTickTime = currentTimeNanos;
        tickCount++;

        if (tickTimes.isFull()) {
            long sum = 0;
            for (int i = 0; i < tickTimes.size(); i++) {
                sum += tickTimes.get(i);
            }
            currentTps = 1_000_000_000.0 / (sum / tickTimes.size());
        }
    }

    public double getCurrentTps() {
        return currentTps;
    }

    public double getAverageTps() {
        if (tickTimes.size() == 0) return 20.0;
        long sum = 0;
        for (int i = 0; i < tickTimes.size(); i++) {
            sum += tickTimes.get(i);
        }
        return 1_000_000_000.0 / (sum / tickTimes.size());
    }

    public double getMinTps() {
        if (tickTimes.size() == 0) return 20.0;
        long maxTickTime = 0;
        for (int i = 0; i < tickTimes.size(); i++) {
            long tt = tickTimes.get(i);
            if (tt > maxTickTime) maxTickTime = tt;
        }
        return 1_000_000_000.0 / maxTickTime;
    }

    public double getMaxTps() {
        if (tickTimes.size() == 0) return 20.0;
        long minTickTime = Long.MAX_VALUE;
        for (int i = 0; i < tickTimes.size(); i++) {
            long tt = tickTimes.get(i);
            if (tt < minTickTime) minTickTime = tt;
        }
        return 1_000_000_000.0 / minTickTime;
    }

    public double getPercentileTps(double p) {
        if (tickTimes.size() == 0) return 20.0;
        long[] times = new long[tickTimes.size()];
        for (int i = 0; i < tickTimes.size(); i++) {
            times[i] = tickTimes.get(i);
        }
        java.util.Arrays.sort(times);
        int idx = (int) Math.ceil(p / 100.0 * times.length) - 1;
        idx = Math.max(0, Math.min(idx, times.length - 1));
        return 1_000_000_000.0 / times[idx];
    }

    public int getTickCount() {
        return tickCount;
    }

    public void reset() {
        tickTimes.clear();
        lastTickTime = 0;
        tickCount = 0;
        currentTps = 20.0;
    }
}