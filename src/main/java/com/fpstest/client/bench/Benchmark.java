package com.fpstest.client.bench;

public class Benchmark {
    public final String name;
    public final int id;
    
    public Benchmark(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void run() {
        // Default empty implementation
    }
    
    public boolean shouldRun() {
        return true;
    }
}
