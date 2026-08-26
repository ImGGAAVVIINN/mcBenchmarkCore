package com.fpstest.client.metrics;

public class FpsTracker {
    private long lastSampleTime = 0;
    private int framesSinceLastSample = 0;
    private double currentFPS = 0.0;
    private double minFPS = Double.MAX_VALUE;
    private double maxFPS = 0.0;
    private final java.util.ArrayList<Double> frameTimes = new java.util.ArrayList<>();
    private static final long SAMPLE_INTERVAL_NANOS = 1_000_000_000L; // 1 second

    public void onFrame() {
        framesSinceLastSample++;
        long now = System.nanoTime();

        if (lastSampleTime == 0) {
            lastSampleTime = now;
        }

        // Calculate FPS every second (or on first frame)
        if (now - lastSampleTime >= SAMPLE_INTERVAL_NANOS) {
            currentFPS = framesSinceLastSample * 1_000_000_000.0 / (now - lastSampleTime);
            minFPS = Math.min(minFPS, currentFPS);
            maxFPS = Math.max(maxFPS, currentFPS);

            // Store frame time sample in milliseconds
            frameTimes.add((now - lastSampleTime) / 1_000_000.0); // convert to ms
            
            // Keep only recent samples (last 100 seconds of data)
            while (frameTimes.size() > 100) {
                frameTimes.remove(0);
            }

            framesSinceLastSample = 0;
            lastSampleTime = now;
        }
    }

    public double getCurrentFPS() {
        return currentFPS;
    }

    public double getMinFPS() {
        return minFPS == Double.MAX_VALUE ? 0.0 : minFPS;
    }

    public double getMaxFPS() {
        return maxFPS;
    }

    public java.util.List<Double> getFrameTimes() {
        return java.util.Collections.unmodifiableList(frameTimes);
    }
    
    public int getFrameSampleCount() {
        return framesSinceLastSample;
    }
}
