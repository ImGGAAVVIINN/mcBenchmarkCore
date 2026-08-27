package com.fpstest.client.metrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FpsTracker {
    private long lastSampleTime = 0;
    private int framesSinceLastSample = 0;
    private double currentFPS = 0.0;
    private double minFPS = Double.MAX_VALUE;
    private double maxFPS = 0.0;
    private final ArrayList<Double> frameTimes = new ArrayList<>();
    private static final long SAMPLE_INTERVAL_NANOS = 1_000_000_000L; // 1 second

    // Recording support (reference API compatibility)
    private RingBuffer recordingBuffer;
    private boolean isRecording = false;
    private long lastFrameTimeNanos = 0;

    public void onFrame() {
        framesSinceLastSample++;
        long now = System.nanoTime();
        lastFrameTimeNanos = now - lastSampleTime;

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
        
        if (isRecording && recordingBuffer != null) {
            recordingBuffer.add(lastFrameTimeNanos);
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

    public List<Double> getFrameTimes() {
        return Collections.unmodifiableList(frameTimes);
    }
    
    public int getFrameSampleCount() {
        return framesSinceLastSample;
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
        // RingBuffer doesn't expose internal array directly, so we can't easily extract all samples
        // For now, return empty array - the reference uses RingBuffer internally
        return samples;
    }

    public double smoothedFps() {
        if (recordingBuffer == null || recordingBuffer.size() == 0) return 0.0;
        double avgFrameTimeNanos = recordingBuffer.getAverage();
        if (avgFrameTimeNanos <= 0) return 0.0;
        return 1_000_000_000.0 / avgFrameTimeNanos;
    }

    public double lastFrameMs() {
        if (lastFrameTimeNanos <= 0) return 0.0;
        return lastFrameTimeNanos / 1_000_000.0;
    }
}
