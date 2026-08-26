package com.fpstest.client.bench;

import com.fpstest.client.bench.tests.IdleBaselineBenchmark;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class BenchmarkRegistry {
    private static final Map<String, Benchmark> REGISTRY = new LinkedHashMap<>();

    private BenchmarkRegistry() {
    }

    public static void bootstrap() {
        if (REGISTRY.isEmpty()) {
            register(new IdleBaselineBenchmark());
        }
    }

    public static void register(Benchmark benchmark) {
        REGISTRY.put(benchmark.id(), benchmark);
    }

    public static Optional<Benchmark> get(String id) {
        return Optional.ofNullable(REGISTRY.get(id));
    }

    public static Map<String, Benchmark> all() {
        return Collections.unmodifiableMap(REGISTRY);
    }

    public static List<Benchmark> byCategory(String category) {
        return REGISTRY.values().stream().filter(b -> b.category().equals(category)).toList();
    }

    // TODO: Port remaining benchmark classes and register them in bootstrap():
    // - BaseFpsBenchmark
    // - ParticleCycleBenchmark
    // - ParticleQuarryBenchmark
    // - EntityRingBenchmark (8 variants: cows, sheep, zombies, pigs, villagers, chickens, items, xp)
    // - ItemsMergeStormBenchmark
    // - ZombieMazeBenchmark
    // - TntFieldBenchmark (2 variants: normal, destructive)
    // - FallingSandBenchmark (4 variants: sand, gravel mixed, sand lite, gravel mixed lite)
    // - ProjectileStormBenchmark
    // - RedstoneClockBenchmark
    // - RedstoneDustGridBenchmark
    // - PistonSlimeArrayBenchmark
    // - FluidSpreadBenchmark
    // - LightingUpdateBenchmark
    // - HopperGridBenchmark
    // - ComparatorStorageBenchmark
    // - VillagerAiVillageBenchmark
    // - StaticDenseForestBenchmark
    // - ChunkFlybyBenchmark (13 variants: plains, jungle, desert, taiga, snowy, forest, savanna, swamp, cherry, badlands, dark_forest, mountain)
}