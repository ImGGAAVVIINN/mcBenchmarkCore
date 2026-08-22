package com.fpstest.client.metrics;

public class TickTracker {
    private int ticksSinceStart = 0;
    private long lastTickTime = 0;
    private long totalTicksNanos = 0;
    private long tickStartNanos = 0;
    
    public void onTickStart() {
        tickStartNanos = System.nanoTime();
        ticksSinceStart++;
    }
    
    public void onTickEnd() {
        long tickDuration = System.nanoTime() - tickStartNanos;
        totalTicksNanos += tickDuration;
    }
    
    public long getTicksSinceStart() {
        return ticksSinceStart;
    }
    
    public long getTotalTicksNanos() {
        return totalTicksNanos;
    }
    
    public double getAverageTickTimeNanos() {
        if (ticksSinceStart > 0) {
            return (double) totalTicksNanos / ticksSinceStart;
        }
        return 0.0;
    }
    
    public double getAverageTickTimeMillis() {
        return getAverageTickTimeNanos() / 1_000_000.0;
    }
    
    public boolean hasStarted() {
        return ticksSinceStart > 0;
    }
}
