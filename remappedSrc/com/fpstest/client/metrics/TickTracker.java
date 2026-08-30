package com.fpstest.client.metrics;

public class TickTracker {
    private int ticksSinceStart = 0;
    private long lastTickTime = 0;
    private long totalTicksNanos = 0;
    private long tickStartNanos = 0;
    
    // Recording support (reference API compatibility)
    private RingBuffer recordingBuffer;
    private boolean isRecording = false;
    private long lastTickDurationNanos = 0;
    
    public void onTickStart() {
        tickStartNanos = System.nanoTime();
        ticksSinceStart++;
    }
    
    public void onTickEnd() {
        lastTickDurationNanos = System.nanoTime() - tickStartNanos;
        totalTicksNanos += lastTickDurationNanos;
        
        if (isRecording && recordingBuffer != null) {
            recordingBuffer.add(lastTickDurationNanos);
        }
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

    // Reference API compatibility methods
    public void startRecording(int capacity) {
        recordingBuffer = new RingBuffer(capacity);
        isRecording = true;
    }

    public double[] stopAndGetSamples() {
        isRecording = false;
        if (recordingBuffer == null) return new double[0];
        double[] samples = new double[recordingBuffer.size()];
        return samples;
    }

    public double smoothedTickMs() {
        if (recordingBuffer == null || recordingBuffer.size() == 0) return 0.0;
        double avgTickTimeNanos = recordingBuffer.getAverage();
        return avgTickTimeNanos / 1_000_000.0;
    }

    public double lastTickMs() {
        if (lastTickDurationNanos <= 0) return 0.0;
        return lastTickDurationNanos / 1_000_000.0;
    }
}
