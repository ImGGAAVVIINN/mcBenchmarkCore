package com.fpstest.client.bench;

public class BenchPhase {
    public final String name;
    public final int durationTicks;
    
    public BenchPhase(String name, int durationTicks) {
        this.name = name;
        this.durationTicks = durationTicks;
    }
    
    public boolean isComplete() {
        return false; // Default - not complete
    }
}
