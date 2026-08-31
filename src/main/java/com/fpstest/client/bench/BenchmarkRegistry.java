package com.fpstest.client.bench;

import com.fpstest.client.bench.tests.BaseFpsBenchmark;
import com.fpstest.client.bench.tests.ChunkFlybyBenchmark;
import com.fpstest.client.bench.tests.ComparatorStorageBenchmark;
import com.fpstest.client.bench.tests.EntityRingBenchmark;
import com.fpstest.client.bench.tests.FallingSandBenchmark;
import com.fpstest.client.bench.tests.FluidSpreadBenchmark;
import com.fpstest.client.bench.tests.HopperGridBenchmark;
import com.fpstest.client.bench.tests.IdleBaselineBenchmark;
import com.fpstest.client.bench.tests.ItemsMergeStormBenchmark;
import com.fpstest.client.bench.tests.LightingUpdateBenchmark;
import com.fpstest.client.bench.tests.ParticleCycleBenchmark;
import com.fpstest.client.bench.tests.ParticleQuarryBenchmark;
import com.fpstest.client.bench.tests.PistonSlimeArrayBenchmark;
import com.fpstest.client.bench.tests.ProjectileStormBenchmark;
import com.fpstest.client.bench.tests.RedstoneClockBenchmark;
import com.fpstest.client.bench.tests.RedstoneDustGridBenchmark;
import com.fpstest.client.bench.tests.StaticDenseForestBenchmark;
import com.fpstest.client.bench.tests.TntFieldBenchmark;
import com.fpstest.client.bench.tests.VillagerAiVillageBenchmark;
import com.fpstest.client.bench.tests.ZombieMazeBenchmark;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biomes;

@Environment(EnvType.CLIENT)
public final class BenchmarkRegistry {
    private static final Map<String, Benchmark> REGISTRY = new LinkedHashMap<>();

    private BenchmarkRegistry() {
    }

    public static void bootstrap() {
        if (REGISTRY.isEmpty()) {
            register(new BaseFpsBenchmark());
            register(new IdleBaselineBenchmark());
            register(new ParticleCycleBenchmark());
            register(new ParticleQuarryBenchmark());
            register(new EntityRingBenchmark("entity_cows", "Cows ×200 ring", EntityType.COW, 200, 18.0, 6121L));
            register(new EntityRingBenchmark("entity_sheep", "Sheep ×200 ring", EntityType.SHEEP, 200, 18.0, 6133L));
            register(new EntityRingBenchmark("entity_zombies", "Zombies ×150 ring (AI on)", EntityType.ZOMBIE, 150, 18.0, 6151L, true));
            register(new EntityRingBenchmark("entity_pigs", "Pigs ×250 ring", EntityType.PIG, 250, 20.0, 6163L));
            register(new EntityRingBenchmark("entity_villagers", "Villagers ×100 ring", EntityType.VILLAGER, 100, 16.0, 6173L));
            register(new EntityRingBenchmark("entity_chickens", "Chickens ×300 ring", EntityType.CHICKEN, 300, 22.0, 6197L));
            register(new EntityRingBenchmark("entity_items", "Item entities ×500", EntityType.ITEM, 500, 10.0, 6203L));
            register(new EntityRingBenchmark("entity_xp", "XP orbs ×500 ring", EntityType.EXPERIENCE_ORB, 500, 12.0, 6217L));
            register(new ItemsMergeStormBenchmark());
            register(new ZombieMazeBenchmark());
            register(new TntFieldBenchmark());
            register(new TntFieldBenchmark("tnt_field_destructive", "TNT field destructive (breaks terrain)", 3541L, true));
            register(new FallingSandBenchmark());
            register(new FallingSandBenchmark("falling_gravel_mixed", "Falling gravel mixed heavy (sand+gravel+concrete)", 5081L, true));
            register(new FallingSandBenchmark("falling_sand_lite", "Falling sand wall (lite, staggered)", 5101L, false, true));
            register(new FallingSandBenchmark("falling_gravel_mixed_lite", "Falling gravel mixed (lite, staggered)", 5113L, true, true));
            register(new ProjectileStormBenchmark());
            register(new RedstoneClockBenchmark());
            register(new RedstoneDustGridBenchmark());
            register(new PistonSlimeArrayBenchmark());
            register(new FluidSpreadBenchmark());
            register(new LightingUpdateBenchmark());
            register(new HopperGridBenchmark());
            register(new ComparatorStorageBenchmark());
            register(new VillagerAiVillageBenchmark());
            register(new StaticDenseForestBenchmark());
            register(new ChunkFlybyBenchmark("chunk_plains", "Plains flyby (single-biome world)", Biomes.PLAINS, 7411L));
            register(new ChunkFlybyBenchmark("chunk_jungle", "Jungle flyby (single-biome world)", Biomes.JUNGLE, 7417L));
            register(new ChunkFlybyBenchmark("chunk_desert", "Desert flyby (single-biome world)", Biomes.DESERT, 7433L));
            register(new ChunkFlybyBenchmark("chunk_taiga", "Taiga flyby (single-biome world)", Biomes.TAIGA, 7451L));
            register(new ChunkFlybyBenchmark("chunk_snowy", "Snowy plains flyby", Biomes.SNOWY_PLAINS, 7457L));
            register(new ChunkFlybyBenchmark("chunk_forest", "Forest flyby", Biomes.FOREST, 7477L));
            register(new ChunkFlybyBenchmark("chunk_savanna", "Savanna flyby", Biomes.SAVANNA, 7481L));
            register(new ChunkFlybyBenchmark("chunk_swamp", "Swamp flyby", Biomes.SWAMP, 7487L));
            register(new ChunkFlybyBenchmark("chunk_cherry", "Cherry grove flyby", Biomes.CHERRY_GROVE, 7499L));
            register(new ChunkFlybyBenchmark("chunk_badlands", "Badlands flyby", Biomes.BADLANDS, 7507L));
            register(new ChunkFlybyBenchmark("chunk_dark_forest", "Dark forest flyby (dense canopy)", Biomes.DARK_FOREST, 7517L));
            register(new ChunkFlybyBenchmark("chunk_mountain", "Windswept hills flyby", Biomes.WINDSWEPT_HILLS, 7523L));
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

    public static List<String> categories() {
        return REGISTRY.values().stream().map(Benchmark::category).distinct().toList();
    }
}