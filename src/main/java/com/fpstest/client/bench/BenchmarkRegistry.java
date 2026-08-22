package com.fpstest.client.bench;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BenchmarkRegistry {
    // Will be populated with benchmarks during initialization
    // public static final Map<String, Benchmark> BENCHMARKS = ...
    
    public static void bootstrap() {
        // Initialize the benchmark registry
        // This will be called from FpsTestClient.onInitializeClient()
        var logger = LoggerFactory.getLogger(BenchmarkRegistry.class);
        logger.info("Benchmark registry bootstrap initiated");
    }
}
