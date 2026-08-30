package com.dgm.mcbc.bench;

import com.dgm.mcbc.bench.tests.BaseFpsBenchmark;
import com.dgm.mcbc.bench.tests.ChunkFlybyBenchmark;
import com.dgm.mcbc.bench.tests.ComparatorStorageBenchmark;
import com.dgm.mcbc.bench.tests.EntityRingBenchmark;
import com.dgm.mcbc.bench.tests.FallingSandBenchmark;
import com.dgm.mcbc.bench.tests.FluidSpreadBenchmark;
import com.dgm.mcbc.bench.tests.HopperGridBenchmark;
import com.dgm.mcbc.bench.tests.IdleBaselineBenchmark;
import com.dgm.mcbc.bench.tests.ItemsMergeStormBenchmark;
import com.dgm.mcbc.bench.tests.LightingUpdateBenchmark;
import com.dgm.mcbc.bench.tests.ParticleCycleBenchmark;
import com.dgm.mcbc.bench.tests.ParticleQuarryBenchmark;
import com.dgm.mcbc.bench.tests.PistonSlimeArrayBenchmark;
import com.dgm.mcbc.bench.tests.ProjectileStormBenchmark;
import com.dgm.mcbc.bench.tests.RedstoneClockBenchmark;
import com.dgm.mcbc.bench.tests.RedstoneDustGridBenchmark;
import com.dgm.mcbc.bench.tests.StaticDenseForestBenchmark;
import com.dgm.mcbc.bench.tests.TntFieldBenchmark;
import com.dgm.mcbc.bench.tests.ZombieMazeBenchmark;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.world.biome.Biome;

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
            register(new EntityRingBenchmark("entity_cows", "Cows ×200 ring", net.minecraft.entity.EntityType.COW, 200, 18.0, 6121L));
            register(new EntityRingBenchmark("entity_sheep", "Sheep ×200 ring", net.minecraft.entity.EntityType.SHEEP, 200, 18.0, 6133L));
            register(new EntityRingBenchmark("entity_zombies", "Zombies ×150 ring (AI on)", net.minecraft.entity.EntityType.ZOMBIE, 150, 18.0, 6151L, true));
            register(new EntityRingBenchmark("entity_pigs", "Pigs ×250 ring", net.minecraft.entity.EntityType.PIG, 250, 20.0, 6163L));
            register(new EntityRingBenchmark("entity_villagers", "Villagers ×100 ring", net.minecraft.entity.EntityType.VILLAGER, 100, 16.0, 6173L));
            register(new EntityRingBenchmark("entity_chickens", "Chickens ×300 ring", net.minecraft.entity.EntityType.CHICKEN, 300, 22.0, 6197L));
            register(new EntityRingBenchmark("entity_items", "Item entities ×500", net.minecraft.entity.EntityType.ITEM, 500, 10.0, 6203L));
            register(new EntityRingBenchmark("entity_xp", "XP orbs ×500 ring", net.minecraft.entity.EntityType.EXPERIENCE_ORB, 500, 12.0, 6217L));
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
            register(new StaticDenseForestBenchmark());
            register(new ChunkFlybyBenchmark("chunk_plains", "Plains flyby (single-biome world)", Biome.PLAINS_KEY, 7411L));
            register(new ChunkFlybyBenchmark("chunk_jungle", "Jungle flyby (single-biome world)", Biome.JUNGLE_KEY, 7417L));
            register(new ChunkFlybyBenchmark("chunk_desert", "Desert flyby (single-biome world)", Biome.DESERT_KEY, 7433L));
            register(new ChunkFlybyBenchmark("chunk_taiga", "Taiga flyby (single-biome world)", Biome.TAIGA_KEY, 7451L));
            register(new ChunkFlybyBenchmark("chunk_snowy", "Snowy plains flyby", Biome.SNOWY_PLAINS_KEY, 7457L));
            register(new ChunkFlybyBenchmark("chunk_forest", "Forest flyby", Biome.FOREST_KEY, 7477L));
            register(new ChunkFlybyBenchmark("chunk_savanna", "Savanna flyby", Biome.SAVANNA_KEY, 7481L));
            register(new ChunkFlybyBenchmark("chunk_swamp", "Swamp flyby", Biome.SWAMP_KEY, 7487L));
            register(new ChunkFlybyBenchmark("chunk_cherry", "Cherry grove flyby", Biome.CHERRY_GROVE_KEY, 7499L));
            register(new ChunkFlybyBenchmark("chunk_badlands", "Badlands flyby", Biome.BADLANDS_KEY, 7507L));
            register(new ChunkFlybyBenchmark("chunk_dark_forest", "Dark forest flyby (dense canopy)", Biome.DARK_FOREST_KEY, 7517L));
            register(new ChunkFlybyBenchmark("chunk_mountain", "Windswept hills flyby", Biome.WINDSWEPT_HILLS_KEY, 7523L));
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