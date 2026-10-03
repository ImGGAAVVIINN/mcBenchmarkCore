# MC Benchmark Core session — 2026-10-02T12:31:01.810521203+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1390.4 | 45.0 | 28.3 | 18.72 | 1.13 | 65 | 1506 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 947.9 | 42.8 | 29.1 | 19.80 | 1.15 | 59 | 2555 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 736.7 | 43.5 | 29.0 | 19.71 | 1.08 | 54 | 1579 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 468.2 | 37.3 | 22.8 | 22.56 | 1.33 | 61 | 1245 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 863.8 | 44.3 | 32.2 | 19.67 | 1.14 | 88 | 847 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 884.7 | 43.3 | 27.2 | 19.43 | 0.82 | 47 | 2279 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 746.0 | 43.6 | 29.1 | 20.04 | 1.20 | 60 | 2118 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 356.0 | 34.6 | 21.2 | 22.96 | 1.74 | 43 | 1193 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1110.7 | 36.0 | 21.2 | 21.22 | 4.82 | 54 | 956 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 230.2 | 32.0 | 22.6 | 25.48 | 5.07 | 28 | 469 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 501.0 | 36.4 | 22.5 | 22.47 | 1.69 | 79 | 458 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 673.2 | 41.7 | 31.1 | 20.69 | 0.84 | 42 | 558 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 650.0 | 32.4 | 21.4 | 23.48 | 5.58 | 45 | 2078 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 918.7 | 39.2 | 24.4 | 20.46 | 3.74 | 28 | 274 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1286.2 | 13.8 | 9.4 | 50.93 | 19.35 | 15 | 1328 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1272.3 | 10.1 | 7.2 | 76.46 | 21.29 | 26 | 283 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1378.0 | 41.5 | 27.6 | 20.53 | 3.01 | 64 | 382 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1360.5 | 40.4 | 24.5 | 20.62 | 2.88 | 48 | 1932 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 713.5 | 41.5 | 26.7 | 20.23 | 1.04 | 41 | 1998 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1990.3 | 44.4 | 25.5 | 18.51 | 0.49 | 41 | 665 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1939.5 | 48.2 | 35.8 | 18.18 | 0.45 | 40 | 2281 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1758.0 | 43.5 | 28.6 | 19.80 | 0.60 | 42 | 1185 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1822.3 | 46.1 | 26.3 | 18.22 | 0.48 | 41 | 1624 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 751.8 | 46.0 | 29.5 | 18.74 | 0.47 | 19 | 1769 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 683.4 | 47.5 | 33.8 | 18.21 | 0.46 | 19 | 1074 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 774.8 | 46.1 | 28.0 | 18.00 | 0.45 | 19 | 601 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 771.1 | 50.4 | 38.9 | 17.73 | 0.44 | 15 | 2541 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 741.2 | 45.3 | 32.6 | 18.53 | 0.45 | 14 | 2516 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 708.8 | 45.1 | 32.4 | 19.30 | 0.44 | 14 | 1249 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 795.7 | 49.3 | 36.9 | 17.78 | 0.42 | 13 | 884 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 656.1 | 44.6 | 30.8 | 19.53 | 0.40 | 13 | 1956 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 691.4 | 45.7 | 29.8 | 18.54 | 0.49 | 11 | 1462 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 767.5 | 47.9 | 30.6 | 18.19 | 0.34 | 13 | 3193 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 714.3 | 47.0 | 35.4 | 18.42 | 0.37 | 11 | 1493 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 767.5 | 44.8 | 23.4 | 18.54 | 0.38 | 10 | 2974 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1924.7 | 46.1 | 30.4 | 18.81 | 0.49 | 23 | 1144 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 144.9 | 20.2 | 15.9 | 40.96 | 6.73 | 21 | 2391 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1586.8 | 44.1 | 27.8 | 19.62 | 0.50 | 23 | 266 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1676.0 | 44.7 | 30.2 | 19.81 | 0.54 | 22 | 2647 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1552.5 | 42.7 | 22.7 | 19.52 | 0.54 | 23 | 1173 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1324.5 | 43.5 | 26.1 | 19.68 | 0.49 | 22 | 2171 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 189.1 | 18.8 | 6.4 | 34.03 | 1.15 | 138 | 2691 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 221.8 | 35.2 | 22.7 | 25.36 | 0.84 | 25 | 21 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 130.3 | 26.1 | 14.6 | 33.38 | 0.78 | 20 | 2304 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 122.3 | 14.8 | 4.0 | 40.92 | 0.74 | 18 | 1484 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Pigs ×250 ring](#pigs-250-ring)
- [Villagers ×100 ring](#villagers-100-ring)
- [Chickens ×300 ring](#chickens-300-ring)
- [Item entities ×500](#item-entities-500)
- [XP orbs ×500 ring](#xp-orbs-500-ring)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze)
- [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on)
- [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses)
- [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete)
- [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered)
- [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered)
- [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs)
- [Redstone clocks (6×6)](#redstone-clocks-66)
- [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps)
- [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t)
- [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world)
- [Desert flyby (single-biome world)](#desert-flyby-single-biome-world)
- [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Forest flyby](#forest-flyby)
- [Savanna flyby](#savanna-flyby)
- [Swamp flyby](#swamp-flyby)
- [Cherry grove flyby](#cherry-grove-flyby)
- [Badlands flyby](#badlands-flyby)
- [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy)
- [Windswept hills flyby](#windswept-hills-flyby)
- [Idle Baseline](#idle-baseline)
- [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously)
- [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset)
- [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide)
- [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm)
- [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators)
- [LowEnd Shader](#lowend-shader)
- [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures)
- [HighEnd Shader](#highend-shader)
- [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `1390.36`, min `20.81`, p50 `1461.68`, p95 `2169.23`, p99 `2474.17`, 1%low `45.03`, 0.1%low `28.32`, std `530.29`

**Frame time (ms)**  avg `1.38`, p50 `0.68`, p95 `3.27`, p99 `18.72`, p99.9 `26.96`, max `48.06`

**Client tick (ms)**  avg `1.13`, p95 `2.33`, max `8.58`

**Memory**  start `1188 MB`, end `1854 MB`, peak `2695 MB`, GC `65 events / 618 ms`

**FPS over sampling window (ASCII):**

```
1960.8 |                                                               █   ██           
1847.0 |                                                               ██  ████         
1733.1 |                         █             █    ██            █ █  ██  ████         
1619.3 |        █                █             █   ███     █ █  █████  █████████        
1505.4 |        █           █    █        █    ██  █████████ ███████████████████ █      
1391.6 |        █        █  █    █  █    █████ ███████████████████████████████████   ███
1277.7 |        ██    ██ █  █ █  ██ █ ████████ █████████████████████████████████████████
1163.9 |        ██ █  █████████  ███████████████████████████████████████████████████████
1050.0 |   █    ████████████████████████████████████████████████████████████████████████
936.2 | █ █  ██████████████████████████████████████████████████████████████████████████
822.4 | ████ ██████████████████████████████████████████████████████████████████████████
708.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11706
   1 ms | █████  1580
   2 ms | █  393
   3 ms | █  209
   4 ms |   110
   5 ms |   46
   6 ms |   22
   7 ms |   5
   8 ms |   6
   9 ms |   5
  10 ms |   2
  11 ms |   5
  12 ms |   3
  13 ms |   5
  14 ms |   11
  15 ms |   29
  16 ms |   64
  17 ms |   76
  18 ms |   84
  19 ms |   28
  20 ms |   35
  21 ms |   18
  22 ms |   8
  23 ms |   7
  24 ms |   6
  25 ms |   2
  26 ms |   3
  27 ms |   2
  29 ms |   2
  30 ms |   2
  31 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   1
  36 ms |   1
  37 ms |   1
  42 ms |   1
  47 ms |   1
  48 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 1810 | 984.4 | 19.53 |
| `dragon_breath` | 160 | 1810 | 1173.4 | 18.79 |
| `dripping_water` | 240 | 1810 | 1287.7 | 18.36 |
| `flame` | 160 | 1810 | 1388.9 | 18.54 |
| `smoke` | 160 | 1810 | 1530.4 | 18.92 |
| `sculk_charge_pop` | 240 | 1810 | 1587.1 | 18.23 |
| `ALL_TOGETHER` | 1680 | 1810 | 1751.7 | 18.31 |
| `portal` | 160 | 1810 | 1420.0 | 17.84 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `723.64`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `14.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `45.03`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `28.32`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `947.86`, min `20.89`, p50 `1038.96`, p95 `1279.90`, p99 `1568.81`, 1%low `42.77`, 0.1%low `29.11`, std `325.12`

**Frame time (ms)**  avg `1.87`, p50 `0.96`, p95 `4.58`, p99 `19.80`, p99.9 `28.41`, max `47.87`

**Client tick (ms)**  avg `1.15`, p95 `2.03`, max `8.82`

**Memory**  start `780 MB`, end `2494 MB`, peak `3336 MB`, GC `59 events / 623 ms`

**FPS over sampling window (ASCII):**

```
1133.9 |                                █                                               
1097.8 |                               ██                    █       █    █             
1061.8 |                               ██               █   ██       █    █     █       
1025.7 |           ██  █       █    █ ███           █   █ █ ███     ██  ████ █  █       
989.7 |        ██ ██  █   █ █ █ █ ██ ████         ████████ █████   ██ █████ █  ████    
953.6 |█       ██ ██  █   █ ███ █ ███████ █      █████████ █████   ██ ███████ ██████   
917.6 |█       ████████   █ ███ █ ███████ █     █████████████████  ██ ███████ ███████  
881.5 |█     ███████████  █ ███ █████████ ██   ██████████████████████████████ ███████  
845.5 |██ ██ ███████████ ██████ █████████ ██   ██████████████████████████████████████ █
809.4 |█████ ███████████ ███████████████████  █████████████████████████████████████████
773.4 |█████ ███████████████████████████████ ██████████████████████████████████████████
737.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5977
   1 ms | ███████████████████████  3434
   2 ms | ███  443
   3 ms | ██  237
   4 ms | █  110
   5 ms |   50
   6 ms |   23
   7 ms |   8
   8 ms |   8
   9 ms |   11
  10 ms |   5
  11 ms |   1
  13 ms |   2
  14 ms |   4
  15 ms |   23
  16 ms |   51
  17 ms | █  82
  18 ms |   70
  19 ms |   62
  20 ms |   26
  21 ms |   17
  22 ms |   18
  23 ms |   7
  24 ms |   7
  25 ms |   4
  26 ms |   3
  27 ms |   1
  28 ms |   4
  29 ms |   2
  31 ms |   1
  33 ms |   2
  35 ms |   1
  37 ms |   1
  42 ms |   1
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `79.00`
- `fps_harmonic_avg` = `534.38`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `29.11`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `42.77`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `736.70`, min `19.65`, p50 `798.80`, p95 `1014.61`, p99 `1261.37`, 1%low `43.46`, 0.1%low `29.01`, std `257.49`

**Frame time (ms)**  avg `2.28`, p50 `1.25`, p95 `5.81`, p99 `19.71`, p99.9 `28.23`, max `50.89`

**Client tick (ms)**  avg `1.08`, p95 `1.84`, max `4.64`

**Memory**  start `1356 MB`, end `2445 MB`, peak `2936 MB`, GC `54 events / 613 ms`

**FPS over sampling window (ASCII):**

```
850.9 |                                     █                     █                    
824.5 |    █               █              █ █                     █ █  █            ██ 
798.1 |  █ █               █     █   █    ███  █ █ ██            ██ ██ █       █    ██ 
771.7 |  █ █  █      █     ██  █ █   ██ █ ████ █ █ ██ █   ██    ██████ █      ██   ████
745.3 |  █ ████    █ █     ██  █ █  ███ █ ████ █ ████ █  ███ ██ ████████   █  █████████
718.9 |  ██████    █ █ ██  ██  ███  █████ ████ ████████  ███████████████ ████ █████████
692.5 |  ██████   ██ █ ██  ██  ███  ███████████████████  ███████████████ ████ █████████
666.1 | ███████   ████████ ██  ████ ███████████████████  ██████████████████████████████
639.7 |████████   ████████ ███ ████ ███████████████████  ██████████████████████████████
613.3 |█████████  ████████████ ████ ███████████████████ ███████████████████████████████
586.9 |██████████ █████████████████████████████████████████████████████████████████████
560.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  527
   1 ms | ████████████████████████████████████████  6793
   2 ms | ███  570
   3 ms | ██  265
   4 ms | █  133
   5 ms |   55
   6 ms |   15
   7 ms |   3
   8 ms |   5
   9 ms |   2
  10 ms |   2
  11 ms |   3
  12 ms |   2
  13 ms |   1
  14 ms |   11
  15 ms |   44
  16 ms |   66
  17 ms | █  85
  18 ms |   74
  19 ms |   49
  20 ms |   23
  21 ms |   14
  22 ms |   8
  23 ms |   8
  24 ms |   3
  25 ms |   1
  26 ms |   4
  27 ms |   1
  28 ms |   2
  29 ms |   1
  30 ms |   2
  32 ms |   2
  36 ms |   1
  38 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `30.00`
- `fps_harmonic_avg` = `438.59`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `29.01`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `43.46`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `468.20`, min `17.22`, p50 `491.86`, p95 `731.83`, p99 `1181.20`, 1%low `37.28`, 0.1%low `22.83`, std `210.16`

**Frame time (ms)**  avg `3.62`, p50 `2.03`, p95 `18.41`, p99 `22.56`, p99.9 `33.79`, max `58.08`

**Client tick (ms)**  avg `1.33`, p95 `2.94`, max `19.10`

**Memory**  start `1297 MB`, end `1814 MB`, peak `2543 MB`, GC `61 events / 626 ms`

**FPS over sampling window (ASCII):**

```
1044.5 |                            ██                                                  
975.6 |                            ██                                                  
906.8 |                           ███                                                  
837.9 |                           ████                                                 
769.1 |                           ████                                                 
700.2 |                           ████                                                 
631.4 |                           ████                                                 
562.5 |      █                    ████                        █ █                      
493.6 |   ██████        ███   ███ █████    ██ █ █   █  █  █ █████ ███  █ ██         █  
424.8 |█ ███████ █████  █████████████████████ ███ █ █ ████████████████ ████ ████  █ ██ 
355.9 |███████████████ ████████████████████████████████████████████████████████████████
287.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  165
   1 ms | ████████████████████████████████████████  2439
   2 ms | █████████████████████████████  1744
   3 ms | ██████  371
   4 ms | ███  187
   5 ms | ██  92
   6 ms | █  60
   7 ms |   28
   8 ms |   12
   9 ms |   10
  10 ms |   6
  11 ms |   3
  12 ms |   4
  13 ms |   7
  14 ms |   6
  15 ms |   8
  16 ms |   20
  17 ms | █  55
  18 ms | █  85
  19 ms | █  79
  20 ms | █  42
  21 ms | █  31
  22 ms |   24
  23 ms |   15
  24 ms |   9
  25 ms |   7
  26 ms |   3
  27 ms |   1
  28 ms |   1
  29 ms |   2
  31 ms |   1
  32 ms |   1
  34 ms |   1
  39 ms |   1
  40 ms |   1
  43 ms |   1
  46 ms |   1
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `69.00`
- `fps_harmonic_avg` = `276.16`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `22.83`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `37.28`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `863.83`, min `23.74`, p50 `937.12`, p95 `1201.82`, p99 `1463.55`, 1%low `44.26`, 0.1%low `32.25`, std `301.79`

**Frame time (ms)**  avg `2.01`, p50 `1.07`, p95 `5.11`, p99 `19.67`, p99.9 `26.92`, max `42.12`

**Client tick (ms)**  avg `1.14`, p95 `1.84`, max `5.36`

**Memory**  start `1466 MB`, end `1728 MB`, peak `2313 MB`, GC `88 events / 671 ms`

**FPS over sampling window (ASCII):**

```
1063.9 |                     █                                                          
1027.7 |                     █                                                          
991.4 | █     █             █      █                 ██                   █            
955.1 | ██    █       █   █ ██   █ █                 ██  █      ██       ███           
918.9 | ██   ██ █     █   █ ██   ███  █             ███  █      ██  █    ███   ██      
882.6 | ██   █████   ██  ██ ██   ███  █      █  █ █ ███ ██ █  █ ██ ██    ███  ███      
846.3 | ███ ███████ ███  ██ ██ █ ████ ██ ██  ██ █ █ ███ ████  █ ██ ██    █████████    █
810.1 | ███ ███████ ████ ███████████████████ ██ ███████ ████  ████ ███████████████   ██
773.8 | ███████████████████████████████████████████████ █████ ████ ████████████████  ██
737.5 |██████████████████████████████████████████████████████ █████████████████████ ███
701.3 |████████████████████████████████████████████████████████████████████████████ ███
665.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████████  3776
   1 ms | ████████████████████████████████████████  4821
   2 ms | ████  496
   3 ms | ██  245
   4 ms | █  98
   5 ms |   51
   6 ms |   19
   7 ms |   13
   8 ms |   10
   9 ms |   4
  10 ms |   7
  11 ms |   6
  12 ms |   2
  13 ms |   6
  14 ms |   8
  15 ms |   21
  16 ms | █  62
  17 ms | █  94
  18 ms | █  68
  19 ms |   49
  20 ms |   27
  21 ms |   18
  22 ms |   17
  23 ms |   7
  24 ms |   3
  25 ms |   4
  26 ms |   3
  27 ms |   2
  28 ms |   3
  30 ms |   1
  42 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `38.00`
- `fps_harmonic_avg` = `497.20`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `32.25`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `44.26`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `884.72`, min `20.30`, p50 `945.83`, p95 `1225.04`, p99 `1782.57`, 1%low `43.34`, 0.1%low `27.24`, std `314.74`

**Frame time (ms)**  avg `1.95`, p50 `1.06`, p95 `4.70`, p99 `19.43`, p99.9 `27.78`, max `49.25`

**Client tick (ms)**  avg `0.82`, p95 `1.44`, max `3.96`

**Memory**  start `1017 MB`, end `2305 MB`, peak `3296 MB`, GC `47 events / 595 ms`

**FPS over sampling window (ASCII):**

```
1617.8 |                                                   █                            
1528.4 |                                                   █                            
1439.0 |                                                   █                            
1349.6 |                                                   █                            
1260.2 |                                                   █                            
1170.8 |                                                   █                            
1081.4 |               █                     █      █      █                            
992.0 |         ██  █ █         █   █   █   █      █      █     ██          █   ██  █  
902.6 |  ██  █  ███ ██████     ████ ██ ██  ██████ ██    ███    ████████   █ █ █ ██  ██ 
813.2 |███████ █████████████ █ █████████████████████ ███████ ██████████  ██████████████
723.8 |█████████████████████████████████████████████████████████████████ ██████████████
634.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████  4029
   1 ms | ████████████████████████████████████████  4967
   2 ms | ████  454
   3 ms | ██  218
   4 ms | █  120
   5 ms |   58
   6 ms |   23
   7 ms |   7
   8 ms |   3
   9 ms |   3
  10 ms |   1
  11 ms |   1
  12 ms |   2
  13 ms |   8
  14 ms |   12
  15 ms |   24
  16 ms |   46
  17 ms | █  86
  18 ms | █  85
  19 ms |   46
  20 ms |   27
  21 ms |   15
  22 ms |   11
  23 ms |   5
  24 ms |   5
  25 ms |   4
  26 ms |   2
  27 ms |   3
  28 ms |   1
  29 ms |   3
  34 ms |   1
  35 ms |   1
  38 ms |   1
  44 ms |   1
  47 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `103.00`
- `fps_harmonic_avg` = `513.74`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `27.24`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `43.34`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `746.01`, min `18.40`, p50 `798.18`, p95 `1025.06`, p99 `1250.13`, 1%low `43.55`, 0.1%low `29.08`, std `251.44`

**Frame time (ms)**  avg `2.23`, p50 `1.25`, p95 `5.41`, p99 `20.04`, p99.9 `27.32`, max `54.36`

**Client tick (ms)**  avg `1.20`, p95 `1.79`, max `18.46`

**Memory**  start `1331 MB`, end `2504 MB`, peak `3450 MB`, GC `60 events / 637 ms`

**FPS over sampling window (ASCII):**

```
910.0 |                                              █                                 
880.1 |                                              █                                 
850.2 |                          █     █             █    █                     █      
820.4 | █ █    █                 ██    █     ██  █   █   ██    █    █ █         █      
790.5 | ████   ██   █  █    █    ██   ███   ███  █  ██   ██    █    █ ██  █████ █    █ 
760.6 | ████  ███   █  █ █  ██   ███  ███   ███  █  ██  ███    █    █████ ████████   ██
730.7 |█████  ████ ██  █ █  ██ █ ███  ███   ███  █████  ███    █   ███████████████   ██
700.8 |█████  ████ ███ █ ███████ ███  ███  █████ ██████ █████  █ █████████████████  ███
670.9 |███████████████ █████████████ █████ █████ ████████████ ██ ██████████████████ ███
641.1 |███████████████████████████████████ ██████████████████ █████████████████████ ███
611.2 |███████████████████████████████████ ████████████████████████████████████████████
581.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████  683
   1 ms | ████████████████████████████████████████  6935
   2 ms | ███  530
   3 ms | █  238
   4 ms | █  93
   5 ms |   38
   6 ms |   17
   7 ms |   9
   8 ms |   3
   9 ms |   2
  10 ms |   2
  12 ms |   1
  13 ms |   1
  14 ms |   8
  15 ms |   25
  16 ms |   61
  17 ms | █  101
  18 ms |   79
  19 ms |   36
  20 ms |   43
  21 ms |   18
  22 ms |   10
  23 ms |   2
  24 ms |   2
  25 ms |   2
  26 ms |   4
  27 ms |   3
  28 ms |   3
  30 ms |   1
  31 ms |   1
  39 ms |   1
  40 ms |   1
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `54.00`
- `fps_harmonic_avg` = `448.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `29.08`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `43.55`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `355.96`, min `19.02`, p50 `390.23`, p95 `518.37`, p99 `685.94`, 1%low `34.63`, 0.1%low `21.19`, std `137.25`

**Frame time (ms)**  avg `4.36`, p50 `2.56`, p95 `18.70`, p99 `22.96`, p99.9 `39.85`, max `52.57`

**Client tick (ms)**  avg `1.74`, p95 `2.73`, max `8.49`

**Memory**  start `2460 MB`, end `1658 MB`, peak `3653 MB`, GC `43 events / 603 ms`

**FPS over sampling window (ASCII):**

```
442.5 |              █                   █                        █                    
427.5 |   █          █                   █                        █                    
412.6 |   █       █  █                   █        █               █                   █
397.7 | █ █       ████                   █        █               █    █    █ █       █
382.8 | █ █     █ ████   █          █ █  █      ███               █    █  █ █ █ ██    █
367.8 |████     ██████ █ █ █   █    ███  █ █    ███      ██  █    █   ██  █ █ ████    █
352.9 |█████  █ ██████████ ██ ██   ████  █ ██ █████    █ ███ █   ██   ██  █ ██████    █
338.0 |██████ █ ██████████ █████   ████  ██████████ █  █████ █ █ ███████  █████████   █
323.1 |██████ ████████████ ████████████  ██████████ █  █████████ ████████ ███████████ █
308.2 |███████████████████ ████████████  ██████████████████████████████████████████████
293.2 |███████████████████ ████████████████████████████████████████████████████████████
278.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████  318
   2 ms | ████████████████████████████████████████  2863
   3 ms | ███████  468
   4 ms | ████  271
   5 ms | ██  136
   6 ms | █  65
   7 ms |   33
   8 ms |   19
   9 ms |   6
  10 ms |   7
  11 ms |   2
  12 ms |   2
  13 ms |   2
  14 ms |   2
  15 ms |   4
  16 ms |   27
  17 ms | █  59
  18 ms | █  95
  19 ms | █  73
  20 ms | █  37
  21 ms |   24
  22 ms |   23
  23 ms |   12
  24 ms |   6
  25 ms |   7
  26 ms |   4
  27 ms |   1
  28 ms |   1
  29 ms |   2
  30 ms |   1
  31 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   2
  38 ms |   1
  41 ms |   1
  42 ms |   1
  46 ms |   1
  52 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `27.00`
- `fps_harmonic_avg` = `229.16`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `21.19`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `34.63`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1110.71`, min `17.88`, p50 `1209.96`, p95 `1513.74`, p99 `1884.41`, 1%low `36.05`, 0.1%low `21.17`, std `380.85`

**Frame time (ms)**  avg `1.77`, p50 `0.83`, p95 `5.90`, p99 `21.22`, p99.9 `40.44`, max `55.93`

**Client tick (ms)**  avg `4.82`, p95 `8.03`, max `24.23`

**Memory**  start `2265 MB`, end `1471 MB`, peak `3222 MB`, GC `54 events / 615 ms`

**FPS over sampling window (ASCII):**

```
1288.8 |               █                                                                
1235.8 |██             █             █         █                   █                █   
1182.7 |███     █ ██  ██         █   ██  ███   ████   █     ███    ██            ██ █   
1129.7 |████  █ █ ██ ███   ████ ██ █████████   ████████ █  ████   █████  ███ ███ ██ █   
1076.7 |████  ██████ ███  █████ ██ █████████ ████████████  ████   █████ ███████████ █  █
1023.7 |█████████████████ █████ ██ █████████ ████████████  █████  █████████████████ ██ █
970.7 |█████████████████ █████ ████████████ ████████████ ██████████████████████████████
917.6 |█████████████████ █████ ████████████████████████████████████████████████████████
864.6 |█████████████████ █████ ████████████████████████████████████████████████████████
811.6 |███████████████████████ ████████████████████████████████████████████████████████
758.6 |███████████████████████ ████████████████████████████████████████████████████████
705.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8415
   1 ms | █████████  1803
   2 ms | █  215
   3 ms | █  149
   4 ms |   54
   5 ms | █  132
   6 ms |   90
   7 ms |   38
   8 ms |   13
   9 ms |   4
  10 ms |   4
  11 ms |   4
  12 ms |   3
  13 ms |   4
  14 ms |   13
  15 ms |   31
  16 ms |   56
  17 ms |   64
  18 ms |   55
  19 ms |   26
  20 ms |   21
  21 ms |   24
  22 ms |   28
  23 ms |   20
  24 ms |   5
  25 ms |   7
  26 ms |   1
  27 ms |   1
  28 ms |   2
  29 ms |   3
  30 ms |   1
  31 ms |   1
  33 ms |   3
  34 ms |   1
  35 ms |   3
  36 ms |   3
  37 ms |   1
  38 ms |   2
  39 ms |   1
  40 ms |   2
  41 ms |   3
  43 ms |   1
  45 ms |   3
  51 ms |   1
  52 ms |   1
  54 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `55.00`
- `fps_harmonic_avg` = `565.70`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `21.17`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `36.05`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `230.18`, min `22.08`, p50 `246.55`, p95 `370.74`, p99 `489.51`, 1%low `32.05`, 0.1%low `22.58`, std `107.46`

**Frame time (ms)**  avg `6.50`, p50 `4.06`, p95 `20.45`, p99 `25.48`, p99.9 `42.49`, max `45.29`

**Client tick (ms)**  avg `5.07`, p95 `7.06`, max `14.19`

**Memory**  start `2194 MB`, end `1879 MB`, peak `2664 MB`, GC `28 events / 172 ms`

**FPS over sampling window (ASCII):**

```
523.2 |█                                                                               
488.5 |█                                                                               
453.7 |█                                                                               
418.9 |█                                                                               
384.2 |█                                                                               
349.4 |█                                                                               
314.6 |█                           █               █   █                               
279.9 |█                           █              ███ █████ ███      ██    ██ █     █  
245.1 |█████                       █             ██████████████  ██ ████ ██████████████
210.3 |██████████ ██ ███ ██ ██  ██ ██  █         ██████████████████████████████████████
175.6 |██████████████████████████████████ ██  █ ███████████████████████████████████████
140.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  30
   2 ms | ██████████████  377
   3 ms | ████████████████████████████████████████  1096
   4 ms | █████████████████████  571
   5 ms | ████████  213
   6 ms | ██  54
   7 ms | ███  72
   8 ms | ███  91
   9 ms | ███  80
  10 ms | █  29
  11 ms | █  25
  12 ms | █  15
  13 ms | █  34
  14 ms | ██  57
  15 ms | █  28
  16 ms | █  21
  17 ms | █  35
  18 ms | █  41
  19 ms | █  35
  20 ms | ██  42
  21 ms | █  33
  22 ms | █  18
  23 ms | █  25
  24 ms | █  15
  25 ms | █  14
  26 ms |   4
  27 ms |   4
  28 ms |   2
  29 ms |   1
  30 ms |   2
  31 ms |   1
  32 ms |   1
  34 ms |   1
  35 ms |   1
  36 ms |   1
  37 ms |   1
  42 ms |   2
  43 ms |   1
  44 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `153.75`
- `preload_duration_ms` = `40.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `22.58`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`
- `items_alive_p95` = `1560.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `items_alive_p50` = `1240.00`
- `entity_count_sample_end` = `1561.00`
- `entity_count_sample_start` = `681.00`
- `items_alive_max` = `1560.00`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `32.05`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `500.96`, min `19.40`, p50 `550.18`, p95 `754.37`, p99 `839.68`, 1%low `36.44`, 0.1%low `22.49`, std `198.99`

**Frame time (ms)**  avg `3.34`, p50 `1.82`, p95 `17.24`, p99 `22.47`, p99.9 `34.05`, max `51.53`

**Client tick (ms)**  avg `1.69`, p95 `3.12`, max `11.68`

**Memory**  start `2046 MB`, end `2108 MB`, peak `2505 MB`, GC `79 events / 662 ms`

**FPS over sampling window (ASCII):**

```
653.1 |                                                        █                       
628.8 |                                                        ██           █          
604.6 |                                                        ███          █          
580.4 |              █   █                               █    ████          █          
556.1 |    █         █  ██         █  █          █  █    ██  █████          █          
531.9 |    ██        █  ██   ██    █ ███   █     █ ██  ████  █████          █     █ █ █
507.6 |  █ ██  █   ████ ██   ██ ██ █ ████  █ █  █████  █████ █████     █ ██ ██    █ ███
483.4 |  █ ██  ██  ████ ██ █ ██ ██ █ ████ ████  █████  ███████████   █ ███████  █ █ ███
459.1 |  ████████  ████ ████ █████ ███████████  ██████ ████████████ ██████████ ██ █████
434.9 |  ████████ ██████████ █████ ████████████████████████████████ ██████████ ████████
410.6 |  ███████████████████ █████ ███████████████████████████████████████████ ████████
386.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   15
   1 ms | ████████████████████████████████████████  3706
   2 ms | ███████████  989
   3 ms | ████  392
   4 ms | ███  245
   5 ms | █  108
   6 ms | █  65
   7 ms |   28
   8 ms |   13
   9 ms |   12
  10 ms |   8
  11 ms |   8
  12 ms |   5
  13 ms |   3
  14 ms |   4
  15 ms |   19
  16 ms |   40
  17 ms | █  75
  18 ms | █  81
  19 ms | █  51
  20 ms |   26
  21 ms |   15
  22 ms |   18
  23 ms |   15
  24 ms |   4
  25 ms |   7
  26 ms |   4
  27 ms |   4
  28 ms |   2
  29 ms |   4
  32 ms |   1
  33 ms |   3
  38 ms |   1
  40 ms |   1
  42 ms |   1
  44 ms |   1
  48 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `22.49`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `299.00`
- `fps_1pct_low` = `36.44`
- `preload_duration_ms` = `56.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `673.20`, min `25.25`, p50 `600.61`, p95 `1173.05`, p99 `1217.34`, 1%low `41.70`, 0.1%low `31.15`, std `320.80`

**Frame time (ms)**  avg `2.64`, p50 `1.66`, p95 `13.83`, p99 `20.69`, p99.9 `28.00`, max `39.61`

**Client tick (ms)**  avg `0.84`, p95 `1.62`, max `8.06`

**Memory**  start `2036 MB`, end `2307 MB`, peak `2594 MB`, GC `42 events / 346 ms`

**FPS over sampling window (ASCII):**

```
1055.9 |                                                     █ ███ █                    
987.7 |                                                   ███████████                  
919.6 |                                        █     █ ███████████████   █ ██     █ █  
851.4 |                                     ██ █    ██ ███████████████   ████     █████
783.2 |                                   ████ █ █  ██ ███████████████   █████    █████
715.1 |                                   ██████ █ ███ ████████████████  ██████   █████
646.9 |             █                     ██████ █ ████████████████████  ██████   █████
578.8 |      █      █        ██       ██  ████████ ████████████████████  ██████   █████
510.6 |   █  █      █   ██  ███   ██████  ████████ █████████████████████ ████████ █████
442.4 |████ ███   ████████  █████████████ █████████████████████████████████████████████
374.3 |████ ███████████████████████████████████████████████████████████████████████████
306.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████  1802
   1 ms | ████████████████████████████████████████  3319
   2 ms | ██████████████████  1494
   3 ms | ███  287
   4 ms | ██  131
   5 ms | █  70
   6 ms |   28
   7 ms |   19
   8 ms |   11
   9 ms |   5
  10 ms |   7
  11 ms |   1
  12 ms |   3
  13 ms |   28
  14 ms | █  56
  15 ms |   32
  16 ms |   18
  17 ms |   34
  18 ms | █  72
  19 ms | █  58
  20 ms |   31
  21 ms |   19
  22 ms |   11
  23 ms |   10
  24 ms |   10
  25 ms |   3
  26 ms |   5
  27 ms |   2
  28 ms |   1
  29 ms |   2
  30 ms |   2
  33 ms |   1
  36 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `378.75`
- `preload_duration_ms` = `25.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `31.15`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`
- `doors_placed` = `16.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `41.70`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `649.99`, min `18.87`, p50 `642.47`, p95 `1082.37`, p99 `1145.78`, 1%low `32.35`, 0.1%low `21.38`, std `307.98`

**Frame time (ms)**  avg `3.04`, p50 `1.56`, p95 `14.91`, p99 `23.48`, p99.9 `41.26`, max `53.00`

**Client tick (ms)**  avg `5.58`, p95 `12.15`, max `32.44`

**Memory**  start `1446 MB`, end `2628 MB`, peak `3525 MB`, GC `45 events / 432 ms`

**FPS over sampling window (ASCII):**

```
1011.1 |                              █ ██                                              
939.4 |                          █ ██████ █                       █ █ ██               
867.8 |                     ██ ████████████                █████████████               
796.1 |                    ████████████████           █ ████████████████               
724.4 |                    ████████████████           ██████████████████               
652.7 |                    █████████████████         ███████████████████ █       █ █   
581.1 |           █ █    ███████████████████         ███████████████████ █      ██ ████
509.4 |          ██ █ ████████████████████████ █   █ ███████████████████████  █████████
437.7 |     █  ███████████████████████████████ ██  █ ██████████████████████████████████
366.1 |     ████████████████████████████████████████ ██████████████████████████████████
294.4 |█  █████████████████████████████████████████████████████████████████████████████
222.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████  1029
   1 ms | ████████████████████████████████████████  3542
   2 ms | ██████████  912
   3 ms | ███  255
   4 ms | ██  133
   5 ms | █  88
   6 ms | █  54
   7 ms |   40
   8 ms |   29
   9 ms |   21
  10 ms |   17
  11 ms |   19
  12 ms |   22
  13 ms | █  51
  14 ms |   36
  15 ms |   23
  16 ms |   41
  17 ms | █  56
  18 ms |   40
  19 ms |   38
  20 ms |   25
  21 ms |   22
  22 ms |   16
  23 ms |   7
  24 ms |   6
  25 ms |   8
  26 ms |   6
  27 ms |   5
  28 ms |   5
  29 ms |   4
  30 ms |   3
  31 ms |   5
  32 ms |   1
  33 ms |   1
  35 ms |   3
  36 ms |   3
  37 ms |   2
  39 ms |   1
  40 ms |   1
  41 ms |   1
  43 ms |   1
  44 ms |   1
  45 ms |   1
  48 ms |   1
  49 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.40`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `32.35`
- `fps_harmonic_avg` = `328.73`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `87.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `21.38`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `918.67`, min `20.15`, p50 `988.55`, p95 `1472.42`, p99 `1613.03`, 1%low `39.17`, 0.1%low `24.44`, std `410.20`

**Frame time (ms)**  avg `2.13`, p50 `1.01`, p95 `8.03`, p99 `20.46`, p99.9 `33.31`, max `49.62`

**Client tick (ms)**  avg `3.74`, p95 `7.52`, max `16.75`

**Memory**  start `2874 MB`, end `2451 MB`, peak `3148 MB`, GC `28 events / 281 ms`

**FPS over sampling window (ASCII):**

```
1538.5 |                                                                               █
1422.7 |                                                                              ██
1306.8 |                  ███  █ █                                     ██            ███
1190.9 |                 █████████ ███                     █    █      ███     ████ ████
1075.0 |                 █████████████ ██                 ██   ██    ████████ ██████████
959.1 |                ██████████████████         █    █████████    ███████████████████
843.2 |                ██████████████████    █    ██ ████████████   ███████████████████
727.3 |           ██ ████████████████████    ██  ████████████████  ████████████████████
611.4 |         █ █████████████████████████████ ██████████████████ ████████████████████
495.6 |    █ ██ ███████████████████████████████████████████████████████████████████████
379.7 |█ ██████████████████████████████████████████████████████████████████████████████
263.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4628
   1 ms | ███████████████████████████  3073
   2 ms | ██████  708
   3 ms | ██  248
   4 ms | █  107
   5 ms | █  76
   6 ms |   35
   7 ms |   38
   8 ms |   13
   9 ms |   14
  10 ms |   16
  11 ms |   11
  12 ms |   21
  13 ms | █  71
  14 ms | █  64
  15 ms |   29
  16 ms |   23
  17 ms |   26
  18 ms |   42
  19 ms |   36
  20 ms |   24
  21 ms |   16
  22 ms |   12
  23 ms |   8
  24 ms |   12
  25 ms |   5
  26 ms |   5
  27 ms |   8
  28 ms |   1
  30 ms |   1
  31 ms |   1
  32 ms |   1
  33 ms |   3
  34 ms |   1
  36 ms |   2
  40 ms |   1
  43 ms |   1
  44 ms |   1
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `37.01`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `39.17`
- `fps_harmonic_avg` = `469.40`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `50.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `24.44`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1286.23`, min `8.81`, p50 `1228.96`, p95 `2893.30`, p99 `3772.46`, 1%low `13.83`, 0.1%low `9.41`, std `1030.10`

**Frame time (ms)**  avg `5.27`, p50 `0.81`, p95 `28.13`, p99 `50.93`, p99.9 `101.61`, max `113.47`

**Client tick (ms)**  avg `19.35`, p95 `32.87`, max `47.26`

**Memory**  start `1737 MB`, end `1362 MB`, peak `3065 MB`, GC `15 events / 103 ms`

**FPS over sampling window (ASCII):**

```
3171.2 |                                                                              ██
2891.0 |                                                                             ███
2610.8 |                                                              █████          ███
2330.6 |                                                ██           █████████       ███
2050.4 |                                        █       ███████      ██████████     ████
1770.2 |               █                 ███    ███     ███████      ██████████     ████
1490.0 |              ██     ██    ███   ███    ███     ████████     ███████████    ████
1209.8 |  ██          ███   ███    ███   ████   █████   █████████    ███████████    ████
929.6 |████       █  ███   ████   ███   ████   █████   ██████████   ████████████   ████
649.4 |████  █ █  █ █████  █████  ████ ██████  █████  ███████████  █████████████   ████
369.2 |████  █ █  █ ██████ █████  ████ ██████  ██████ ████████████ ██████████████  ████
 89.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  2144
   1 ms | ███████  352
   2 ms | ███  149
   3 ms | ██  125
   4 ms | ████  204
   5 ms | ████  193
   6 ms | █  30
   7 ms |   19
   8 ms |   13
   9 ms |   16
  10 ms |   18
  11 ms |   3
  12 ms |   9
  13 ms | █  33
  14 ms | █  36
  15 ms | █  33
  16 ms | █  36
  17 ms | █  39
  18 ms |   18
  19 ms |   22
  20 ms |   20
  21 ms |   14
  22 ms |   11
  23 ms |   7
  24 ms |   18
  25 ms |   18
  26 ms |   12
  27 ms |   11
  28 ms |   12
  29 ms |   11
  30 ms |   6
  31 ms |   13
  32 ms |   6
  33 ms |   10
  34 ms |   14
  35 ms |   7
  36 ms |   3
  37 ms |   9
  38 ms |   3
  39 ms |   7
  40 ms |   3
  41 ms |   5
  42 ms |   7
  43 ms |   7
  44 ms |   9
  45 ms |   1
  46 ms |   4
  47 ms |   1
  48 ms |   4
  49 ms |   9
  50 ms |   3
  51 ms |   1
  52 ms |   3
  54 ms |   1
  55 ms |   1
  58 ms |   3
  59 ms |   1
  60 ms |   3
  61 ms |   2
  62 ms |   3
  65 ms |   1
  67 ms |   1
  68 ms |   1
  69 ms |   1
  71 ms |   1
  74 ms |   2
  75 ms |   1
  76 ms |   1
  79 ms |   1
  86 ms |   1
  88 ms |   1
  90 ms |   1
  91 ms |   1
  97 ms |   1
 101 ms |   1
 102 ms |   1
 103 ms |   1
 105 ms |   1
 113 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `189.73`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `30806.00`
- `preload_duration_ms` = `6.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `13.83`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4810.89`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `9.41`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1272.31`, min `6.55`, p50 `1265.05`, p95 `2830.27`, p99 `3534.74`, 1%low `10.08`, 0.1%low `7.22`, std `999.19`

**Frame time (ms)**  avg `6.78`, p50 `0.79`, p95 `36.65`, p99 `76.46`, p99.9 `123.62`, max `152.66`

**Client tick (ms)**  avg `21.29`, p95 `36.81`, max `65.80`

**Memory**  start `2507 MB`, end `1916 MB`, peak `2791 MB`, GC `26 events / 178 ms`

**FPS over sampling window (ASCII):**

```
3052.3 |                                                                              ██
2776.7 |                                                                             ███
2501.2 |                                                               █ █           ███
2225.6 |                                                █ ██         ███ █  ██      ████
1950.0 |                     █ █     █ █       ██ █     █ ██ █       █████ ████     ████
1674.4 |             █     █████     █████     ████    █████ ██      ██████████     ████
1398.9 |            ███    ██████    ███████   ████    █████████    ███████████     ████
1123.3 |            ████   ███████   ███████   █████   █████████    ████████████    ████
847.7 |██          ████   ███████   ███████   █████   ██████████   █████████████   ████
572.1 |██   █      █████  ████████  ███████  ███████  ███████████  █████████████   ████
296.5 |███  ███ █  █████  ████████  ████████ ███████  ███████████  ██████████████  ████
 21.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1650
   1 ms | ████████  321
   2 ms | ███  125
   3 ms | █  50
   4 ms | █  38
   5 ms | █  47
   6 ms | ██  75
   7 ms | ███  108
   8 ms | █  26
   9 ms |   9
  10 ms |   8
  11 ms |   12
  12 ms | █  22
  13 ms | █  29
  14 ms | █  21
  15 ms |   15
  16 ms | █  27
  17 ms | █  30
  18 ms | █  25
  19 ms |   16
  20 ms |   8
  21 ms |   10
  22 ms |   13
  23 ms |   12
  24 ms |   14
  25 ms |   9
  26 ms |   3
  27 ms |   10
  28 ms |   12
  29 ms |   7
  30 ms |   7
  31 ms |   11
  32 ms |   9
  33 ms |   9
  34 ms |   4
  35 ms |   5
  36 ms |   8
  37 ms |   10
  38 ms |   5
  39 ms |   4
  40 ms |   5
  41 ms |   4
  42 ms |   3
  43 ms |   9
  44 ms |   3
  45 ms |   5
  46 ms |   5
  47 ms |   4
  48 ms |   4
  49 ms |   4
  50 ms |   1
  51 ms |   2
  52 ms |   6
  53 ms |   2
  54 ms |   1
  55 ms |   4
  56 ms |   2
  57 ms |   4
  58 ms |   3
  59 ms |   1
  60 ms |   3
  61 ms |   1
  62 ms |   2
  63 ms |   3
  64 ms |   1
  65 ms |   3
  69 ms |   1
  70 ms |   3
  71 ms |   2
  73 ms |   2
  74 ms |   1
  75 ms |   2
  76 ms |   1
  78 ms |   1
  79 ms |   1
  81 ms |   1
  84 ms |   1
  85 ms |   1
  87 ms |   3
  89 ms |   1
  90 ms |   1
  92 ms |   1
  93 ms |   1
  94 ms |   3
  95 ms |   1
  96 ms |   1
 101 ms |   2
 103 ms |   1
 105 ms |   1
 106 ms |   1
 107 ms |   1
 110 ms |   1
 111 ms |   1
 123 ms |   1
 128 ms |   1
 134 ms |   1
 152 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `147.50`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `31031.00`
- `preload_duration_ms` = `23.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `10.08`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4789.35`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `7.22`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `1377.97`, min `20.70`, p50 `1401.75`, p95 `2369.80`, p99 `3221.93`, 1%low `41.55`, 0.1%low `27.60`, std `714.05`

**Frame time (ms)**  avg `1.67`, p50 `0.71`, p95 `4.79`, p99 `20.53`, p99.9 `29.50`, max `48.31`

**Client tick (ms)**  avg `3.01`, p95 `5.55`, max `24.22`

**Memory**  start `2470 MB`, end `1751 MB`, peak `2853 MB`, GC `64 events / 630 ms`

**FPS over sampling window (ASCII):**

```
2942.1 |                                                 █                              
2718.1 |                                                 █                              
2494.1 |                                                 █                              
2270.2 |                                                 █   █                          
2046.2 |                                                 █   █                ███       
1822.2 | █  █ █                                   █     ███  ██      █ █ █    ██████████
1598.3 |███████                            █   ██████   █████████ ██████████████████████
1374.3 |███████                          █ █  ██████████████████████████████████████████
1150.3 |███████                    ██   █████ ██████████████████████████████████████████
926.4 |█████████               ████████████████████████████████████████████████████████
702.4 |█████████    █ ███ █████████████████████████████████████████████████████████████
478.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7884
   1 ms | ██████████████  2690
   2 ms | ██  451
   3 ms | █  230
   4 ms | █  157
   5 ms | █  104
   6 ms |   39
   7 ms |   10
   8 ms |   10
   9 ms |   5
  10 ms |   3
  11 ms |   2
  12 ms |   5
  13 ms |   2
  14 ms |   10
  15 ms |   20
  16 ms |   36
  17 ms |   56
  18 ms |   60
  19 ms |   66
  20 ms |   47
  21 ms |   33
  22 ms |   18
  23 ms |   13
  24 ms |   6
  25 ms |   4
  26 ms |   6
  27 ms |   3
  28 ms |   2
  29 ms |   1
  31 ms |   3
  32 ms |   2
  34 ms |   2
  35 ms |   1
  37 ms |   1
  38 ms |   1
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `599.02`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3185.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `41.55`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.24`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `27.60`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `1360.47`, min `18.74`, p50 `1476.99`, p95 `2333.61`, p99 `2915.74`, 1%low `40.37`, 0.1%low `24.55`, std `719.68`

**Frame time (ms)**  avg `1.75`, p50 `0.68`, p95 `5.29`, p99 `20.62`, p99.9 `30.77`, max `53.36`

**Client tick (ms)**  avg `2.88`, p95 `4.83`, max `20.61`

**Memory**  start `2510 MB`, end `4442 MB`, peak `4442 MB`, GC `48 events / 585 ms`

**FPS over sampling window (ASCII):**

```
2106.4 |                                                                 █   █  █       
1944.4 | █                                                          █    █  █████     ██
1782.3 |██ █                                               ██   █  ███  ████████████ ███
1620.3 |██████                            █   ██    ██ ██████ ████ █████████████████████
1458.2 |███████                          ████████ ██████████████████████████████████████
1296.2 |███████                        █████████████████████████████████████████████████
1134.1 |███████                        █████████████████████████████████████████████████
972.1 |████████                   █  ██████████████████████████████████████████████████
810.0 |████████              █ ██ █████████████████████████████████████████████████████
648.0 |█████████     █      ███████████████████████████████████████████████████████████
485.9 |█████████  █████████████████████████████████████████████████████████████████████
323.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7412
   1 ms | ████████████  2224
   2 ms | ████  815
   3 ms | █  233
   4 ms | █  144
   5 ms | █  107
   6 ms |   53
   7 ms |   26
   8 ms |   16
   9 ms |   5
  10 ms |   2
  11 ms |   2
  12 ms |   2
  13 ms |   6
  14 ms |   8
  15 ms |   16
  16 ms |   38
  17 ms |   73
  18 ms |   71
  19 ms |   43
  20 ms |   33
  21 ms |   30
  22 ms |   18
  23 ms |   15
  24 ms |   5
  25 ms |   6
  26 ms |   8
  27 ms |   2
  28 ms |   3
  32 ms |   3
  33 ms |   1
  34 ms |   1
  40 ms |   2
  41 ms |   1
  42 ms |   1
  44 ms |   1
  51 ms |   1
  53 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `571.92`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3136.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `40.37`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.48`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `24.55`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `713.49`, min `21.70`, p50 `728.84`, p95 `1148.43`, p99 `1339.39`, 1%low `41.46`, 0.1%low `26.71`, std `278.15`

**Frame time (ms)**  avg `2.39`, p50 `1.37`, p95 `7.08`, p99 `20.23`, p99.9 `31.18`, max `46.08`

**Client tick (ms)**  avg `1.04`, p95 `1.68`, max `16.75`

**Memory**  start `2094 MB`, end `2128 MB`, peak `4093 MB`, GC `41 events / 574 ms`

**FPS over sampling window (ASCII):**

```
1134.7 |  █                                                                             
1077.4 | ██ █                                                                           
1020.1 | ██ █                                                                           
962.8 |███ █ ██                                   █                                    
905.6 |███ ████ ███  █     █                      █                                    
848.3 |███████████████  ████                      █                                    
791.0 |███████████████  █████    █                █                                  ██
733.7 |██████████████████████   ███             ███                               ██ ██
676.4 |██████████████████████  █████   ███    ██████           █         █    ██  █████
619.1 |█████████████████████████████ ██████ █ ██████  ███ █    █ ███    ██ ████████████
561.8 |██████████████████████████████████████████████████████  ███████████ ████████████
504.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  1069
   1 ms | ████████████████████████████████████████  5818
   2 ms | ████  627
   3 ms | ██  251
   4 ms | █  106
   5 ms |   53
   6 ms |   18
   7 ms |   8
   8 ms |   2
   9 ms |   2
  10 ms |   1
  11 ms |   4
  12 ms |   1
  13 ms |   1
  14 ms |   12
  15 ms |   29
  16 ms |   50
  17 ms | █  80
  18 ms | █  92
  19 ms |   50
  20 ms |   21
  21 ms |   20
  22 ms |   13
  23 ms |   12
  24 ms |   4
  25 ms |   3
  26 ms |   1
  28 ms |   2
  29 ms |   1
  31 ms |   2
  32 ms |   2
  34 ms |   1
  35 ms |   1
  38 ms |   2
  41 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_1pct_low` = `41.46`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `43.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `26.71`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `418.05`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1990.34`, min `9.15`, p50 `2055.94`, p95 `3500.57`, p99 `3909.80`, 1%low `44.41`, 0.1%low `25.53`, std `738.20`

**Frame time (ms)**  avg `0.98`, p50 `0.49`, p95 `1.98`, p99 `18.51`, p99.9 `27.75`, max `109.30`

**Client tick (ms)**  avg `0.49`, p95 `0.89`, max `3.42`

**Memory**  start `3026 MB`, end `2604 MB`, peak `3691 MB`, GC `41 events / 685 ms`

**FPS over sampling window (ASCII):**

```
3369.0 |          ████                                                                  
3200.7 |          █████                                                                 
3032.4 |          █████                                                                 
2864.1 |          ██████                                                                
2695.7 |          ██████                                                                
2527.4 |          ██████    █                                                           
2359.1 |          ██████    █                                                           
2190.7 |         ███████   ██              █                                       █    
2022.4 | ██  ██ ██████████ ███   █         █ ██    █   █   █ █     █   █    █ █ █  ███ █
1854.1 |██████████████████ ███  ██████████ ██████ ███████ ██████   █████   ██ ███  ███ █
1685.8 |█████████████████████████████████████████ ███████ ██████  ███████ ███████  █████
1517.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18420
   1 ms | ██  966
   2 ms | █  340
   3 ms |   180
   4 ms |   73
   5 ms |   24
   6 ms |   10
   7 ms |   6
   8 ms |   3
   9 ms |   2
  11 ms |   1
  12 ms |   3
  13 ms |   8
  14 ms |   8
  15 ms |   14
  16 ms |   17
  17 ms |   73
  18 ms |   80
  19 ms |   56
  20 ms |   34
  21 ms |   18
  22 ms |   17
  23 ms |   8
  24 ms |   3
  25 ms |   4
  26 ms |   4
  27 ms |   4
  28 ms |   4
  29 ms |   2
  31 ms |   1
  32 ms |   1
  33 ms |   2
  34 ms |   2
  35 ms |   1
  37 ms |   1
  40 ms |   1
  41 ms |   1
  45 ms |   1
  47 ms |   1
  54 ms |   1
 109 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `35.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `25.53`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `1020.67`
- `fps_1pct_low` = `44.41`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1939.47`, min `25.92`, p50 `2051.30`, p95 `2826.14`, p99 `3725.29`, 1%low `48.24`, 0.1%low `35.77`, std `648.92`

**Frame time (ms)**  avg `0.97`, p50 `0.49`, p95 `2.01`, p99 `18.18`, p99.9 `23.85`, max `38.58`

**Client tick (ms)**  avg `0.45`, p95 `0.60`, max `22.05`

**Memory**  start `1363 MB`, end `1523 MB`, peak `3645 MB`, GC `40 events / 529 ms`

**FPS over sampling window (ASCII):**

```
3192.1 |                              █                                                 
3039.8 |                             ██                                                 
2887.5 |                             ██                                                 
2735.2 |                             ███                                                
2582.8 |                          █  ███                                                
2430.5 |                          █  ███                                                
2278.2 |                          ██ ███                                                
2125.9 |   █                      ██ ████         █         █                       ██  
1973.6 |██ ██    ██   █    ██  █  ███████ ██ ████ ██ █████ ██  █    █   █  ██   █   ████
1821.3 |██ ██████████████████  ██ ██████████ █████████████ ██ ███████████████  ████ ████
1669.0 |█████████████████████████ ██████████████████████████████████████████████████████
1516.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18712
   1 ms | ██  835
   2 ms | █  348
   3 ms |   185
   4 ms |   69
   5 ms |   18
   6 ms |   12
   7 ms |   4
   8 ms |   2
   9 ms |   1
  10 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   3
  14 ms |   13
  15 ms |   20
  16 ms |   47
  17 ms |   83
  18 ms |   78
  19 ms |   57
  20 ms |   23
  21 ms |   24
  22 ms |   16
  23 ms |   5
  24 ms |   2
  25 ms |   6
  26 ms |   4
  27 ms |   1
  28 ms |   3
  30 ms |   1
  35 ms |   1
  38 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `77.00`
- `fps_harmonic_avg` = `1028.89`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `35.77`
- `seed` = `4019.00`
- `preset_quick` = `1.00`
- `repeaters_placed` = `48.00`
- `dust_placed` = `464.00`
- `block_state_changes` = `0.00`
- `neighbour_updates` = `0.00`
- `scheduled_block_ticks` = `2240.00`
- `preload_chunks` = `81.00`
- `pulses_issued` = `45.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.24`
- `preset_long` = `0.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1758.00`, min `21.35`, p50 `1975.60`, p95 `3000.53`, p99 `3563.23`, 1%low `43.55`, 0.1%low `28.63`, std `805.89`

**Frame time (ms)**  avg `1.41`, p50 `0.51`, p95 `3.80`, p99 `19.80`, p99.9 `27.06`, max `46.83`

**Client tick (ms)**  avg `0.60`, p95 `0.99`, max `21.15`

**Memory**  start `2546 MB`, end `3325 MB`, peak `3731 MB`, GC `42 events / 566 ms`

**FPS over sampling window (ASCII):**

```
3046.1 |       █                                                                        
2881.0 |   █   █                                                                        
2716.0 |   █   █                                                                        
2550.9 |   █   █                                                                        
2385.8 |   █   █ █                                                                      
2220.8 |   █   █ █                                  █                        █          
2055.7 |   ██ ██ ██             ██        █   █     █   █     █        █     █   █     █
1890.6 |█  ██ ██ ██     █     █ ██ █  █   █ █ █ █   █ █ █     █      █ █  █ ██  ███  █ █
1725.6 |█ ███ ██ █████ ██ █   █ ██ █  █  ██████ ██  █████  █  █ ██  ████  █ ██ ████ ██ █
1560.5 |█ ███████████████ █ ███ ██ ████  ██████ ██ ████████████ ██ ████████ ███████ ████
1395.5 |██████████████████████████ █████████████████████████████████████████████████████
1230.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11419
   1 ms | ███  803
   2 ms | ██  700
   3 ms | ██  664
   4 ms |   130
   5 ms |   53
   6 ms |   36
   7 ms |   20
   8 ms |   9
   9 ms |   5
  10 ms |   4
  11 ms |   1
  12 ms |   5
  13 ms |   11
  14 ms |   3
  15 ms |   16
  16 ms |   44
  17 ms |   54
  18 ms |   64
  19 ms |   66
  20 ms |   43
  21 ms |   32
  22 ms |   12
  23 ms |   15
  24 ms |   4
  25 ms |   3
  26 ms |   4
  27 ms |   3
  28 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
  32 ms |   1
  34 ms |   1
  35 ms |   1
  36 ms |   1
  38 ms |   1
  43 ms |   1
  45 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `43.55`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `58.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `28.63`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `711.73`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1822.34`, min `8.48`, p50 `1960.61`, p95 `2430.99`, p99 `2935.31`, 1%low `46.12`, 0.1%low `26.30`, std `557.74`

**Frame time (ms)**  avg `1.02`, p50 `0.51`, p95 `1.97`, p99 `18.22`, p99.9 `24.44`, max `117.94`

**Client tick (ms)**  avg `0.48`, p95 `0.79`, max `3.69`

**Memory**  start `2450 MB`, end `1727 MB`, peak `4075 MB`, GC `41 events / 698 ms`

**FPS over sampling window (ASCII):**

```
2117.5 |                              █                                █                
2067.0 |                            █ █                   ██   █       █          █     
2016.5 |                           ████                   ██ █ █      ██  █  █    █     
1965.9 |                           █████                  ██ ███      ██  █  ██   ██    
1915.4 |                      █    █████ █                ██ ███      ███ █  ██  ███    
1864.9 |           █          █    █████ ██               ███████    ████ █  ██ █████ ██
1814.3 |        █ ██ █ █  █ ███    ████████ █       █  █ █████████   ██████  ████████ ██
1763.8 |██     █████ ███  █████ █ ███████████  █ █  █  █ ██████████████████  ████████ ██
1713.3 |███    █████████  ███████ ███████████  █ ███████ ██████████████████ ████████████
1662.7 |████ █ █████████ ████████ ███████████ ██ ███████ ██████████████████ ████████████
1612.2 |████████████████ ████████████████████ ██ ███████████████████████████████████████
1561.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17654
   1 ms | ██  912
   2 ms | █  305
   3 ms |   162
   4 ms |   65
   5 ms |   21
   6 ms |   9
   7 ms |   7
   8 ms |   3
   9 ms |   2
  12 ms |   1
  14 ms |   8
  15 ms |   37
  16 ms |   60
  17 ms |   72
  18 ms |   83
  19 ms |   51
  20 ms |   31
  21 ms |   16
  22 ms |   8
  23 ms |   4
  24 ms |   4
  26 ms |   1
  27 ms |   1
  29 ms |   2
  30 ms |   1
  32 ms |   1
  33 ms |   2
  34 ms |   2
  35 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms |   1
  41 ms |   1
  45 ms |   1
  46 ms |   1
 117 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `976.66`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `48.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `26.30`
- `fps_1pct_low` = `46.12`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23074 ms  |  Sample ticks: 400

**FPS**  avg `751.83`, min `22.68`, p50 `775.96`, p95 `1176.75`, p99 `1246.30`, 1%low `46.02`, 0.1%low `29.49`, std `304.44`

**Frame time (ms)**  avg `2.26`, p50 `1.29`, p95 `7.69`, p99 `18.74`, p99.9 `25.46`, max `44.10`

**Client tick (ms)**  avg `0.47`, p95 `0.70`, max `8.17`

**Memory**  start `2082 MB`, end `2434 MB`, peak `3852 MB`, GC `19 events / 226 ms`

**FPS over sampling window (ASCII):**

```
936.7 |   █                 █                                                          
899.3 |   █        █   █    █                                                          
861.9 |   █ █      █   ██   ███         ██                                             
824.6 |█  ███      ████████████    ██ █ ██              █     █             █    █     
787.2 |██ ███    █ ████████████   ███ ████  █ █      █  █    ██    █      █ █    █     
749.8 |██ ███    █ ██████████████ ████████  ███      ██ ███  ███ █ █ █   ████   ██   █ 
712.4 |██ ███   ██████████████████████████  ███  █   ██ ███  █████████ █ ████   ███████
675.0 |███████  ██████████████████████████ ████ ██   ██ ██████████████ ███████ ████████
637.7 |████████ ██████████████████████████ ███████  ███ ██████████████████████ ████████
600.3 |███████████████████████████████████ ███████ ███████████████████████████ ████████
562.9 |███████████████████████████████████ ███████████████████████████████████ ████████
525.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████  2287
   1 ms | ████████████████████████████████████████  4699
   2 ms | █████████  1068
   3 ms | ██  237
   4 ms | █  72
   5 ms |   35
   6 ms |   19
   7 ms |   6
   8 ms |   7
   9 ms |   3
  10 ms |   7
  12 ms |   1
  13 ms |   17
  14 ms | █  71
  15 ms | █  98
  16 ms | █  73
  17 ms |   49
  18 ms |   35
  19 ms |   36
  20 ms |   13
  21 ms |   12
  22 ms |   3
  23 ms |   3
  24 ms |   2
  25 ms |   4
  28 ms |   1
  29 ms |   1
  34 ms |   1
  35 ms |   1
  39 ms |   1
  42 ms |   1
  44 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.02`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `51.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `29.49`
- `part` = `1.00`
- `fps_harmonic_avg` = `443.44`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `58.00`
- `z_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24383 ms  |  Sample ticks: 400

**FPS**  avg `683.36`, min `21.31`, p50 `719.53`, p95 `1052.30`, p99 `1181.75`, 1%low `47.47`, 0.1%low `33.76`, std `253.58`

**Frame time (ms)**  avg `2.36`, p50 `1.39`, p95 `13.36`, p99 `18.21`, p99.9 `24.58`, max `46.93`

**Client tick (ms)**  avg `0.46`, p95 `0.73`, max `3.97`

**Memory**  start `3386 MB`, end `3719 MB`, peak `4460 MB`, GC `19 events / 198 ms`

**FPS over sampling window (ASCII):**

```
832.3 |█                                                                               
801.4 |███   █ █   █ █                                                                 
770.5 |████ ██ ██ ██ █   █    █          █                                             
739.7 |████ ██ ██ █████ ██ █ ██       █  █  ██                                         
708.8 |████ ███████████ ██ █ ███ █   ██ ██  █████     █ █  █  █     █             █    
678.0 |████ ████████████████ ███ ███ █████ ███████ ██ █ ██ █ ██ █   █ █    █ █    █    
647.1 |█████████████████████████ ███ ████████████████ ████ ████████ █ █ ████ █    █    
616.3 |██████████████████████████████████████████████ ████ ██████████ █ ████ █  █ ██   
585.4 |██████████████████████████████████████████████ ████ ██████████ █ ██████ █████   
554.5 |███████████████████████████████████████████████████ ████████████ ███████████████
523.7 |████████████████████████████████████████████████████████████████ ███████████████
492.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  713
   1 ms | ████████████████████████████████████████  6059
   2 ms | ██████  883
   3 ms | █  223
   4 ms | █  92
   5 ms |   39
   6 ms |   19
   7 ms |   11
   8 ms |   5
   9 ms |   3
  11 ms |   3
  12 ms |   1
  13 ms |   31
  14 ms | █  87
  15 ms | █  98
  16 ms |   60
  17 ms |   53
  18 ms |   35
  19 ms |   21
  20 ms |   13
  21 ms |   9
  22 ms |   5
  23 ms |   6
  25 ms |   2
  26 ms |   3
  27 ms |   2
  30 ms |   1
  46 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.47`
- `surface_water_ratio` = `0.04`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1340.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `33.76`
- `part` = `1.00`
- `fps_harmonic_avg` = `424.16`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `774.84`, min `18.61`, p50 `806.66`, p95 `1187.95`, p99 `1262.86`, 1%low `46.10`, 0.1%low `28.05`, std `303.45`

**Frame time (ms)**  avg `2.16`, p50 `1.24`, p95 `5.92`, p99 `18.00`, p99.9 `26.24`, max `53.74`

**Client tick (ms)**  avg `0.45`, p95 `0.67`, max `14.05`

**Memory**  start `4178 MB`, end `4369 MB`, peak `4779 MB`, GC `19 events / 212 ms`

**FPS over sampling window (ASCII):**

```
946.9 |     █             █                                                            
904.9 |  █ ███     █ █  ████                                                           
862.9 |  ████████  ████ ████      █                 █     █ ██                         
820.8 | █████████  ████ ████      ███               █  █  █ ███      █ █        █   █  
778.8 |██████████  █████████    █ ███   █      █ █ ██ ██  █ ████   █ █ ██  █ █  █   █ █
736.8 |██████████  ███████████ ██ ███  ██   ██ ██████████ ██████ █ ███████████  ███ ███
694.8 |███████████ ███████████████████ ██  ███ ███████████████████ ███████████  ███ ███
652.8 |██████████████████████████████████ ████ ███████████████████ ███████████ ████ ███
610.8 |███████████████████████████████████████████████████████████ ████████████████ ███
568.7 |████████████████████████████████████████████████████████████████████████████ ███
526.7 |████████████████████████████████████████████████████████████████████████████ ███
484.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████████  2607
   1 ms | ████████████████████████████████████████  4916
   2 ms | ████████  929
   3 ms | ██  199
   4 ms | █  98
   5 ms |   44
   6 ms |   14
   7 ms |   10
   8 ms |   4
   9 ms |   3
  10 ms |   1
  11 ms |   1
  12 ms |   2
  13 ms |   49
  14 ms | █  95
  15 ms | █  80
  16 ms | █  63
  17 ms |   46
  18 ms |   26
  19 ms |   29
  20 ms |   10
  21 ms |   7
  23 ms |   4
  24 ms |   5
  25 ms |   2
  26 ms |   1
  27 ms |   2
  28 ms |   1
  33 ms |   1
  36 ms |   3
  38 ms |   1
  53 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.10`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `28.05`
- `part` = `1.00`
- `fps_harmonic_avg` = `462.32`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `63.00`
- `z_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23053 ms  |  Sample ticks: 400

**FPS**  avg `771.14`, min `27.45`, p50 `813.34`, p95 `1162.64`, p99 `1255.11`, 1%low `50.40`, 0.1%low `38.89`, std `289.98`

**Frame time (ms)**  avg `2.11`, p50 `1.23`, p95 `5.58`, p99 `17.73`, p99.9 `22.65`, max `36.43`

**Client tick (ms)**  avg `0.44`, p95 `0.59`, max `6.24`

**Memory**  start `2612 MB`, end `3873 MB`, peak `5153 MB`, GC `15 events / 186 ms`

**FPS over sampling window (ASCII):**

```
927.4 |     █                                                                          
899.3 |  █  █                                                                          
871.2 |  ██ ██ █                     █                                                 
843.1 |████ ██ █  ██         █    ██ █                                █       █        
814.9 |█████████  ████   █   █ █████ █                    █           █ █     █ █     █
786.8 |█████████ █████  ████ ███████ ██ ██   █ █  █  █ █  ██          █████   █ █     █
758.7 |█████████ █████  ███████████████ ██   ███ ██ ████  ████      █ ██████  ███   █ █
730.6 |████████████████ ███████████████ ██   ███████████  ████ ███  █ ███████ ███   ███
702.4 |████████████████ ███████████████████  █████████████████ ███  █ ████████████ ████
674.3 |████████████████████████████████████  █████████████████ ██████ █████████████████
646.2 |████████████████████████████████████ ███████████████████████████████████████████
618.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████  2317
   1 ms | ████████████████████████████████████████  5556
   2 ms | ██████  779
   3 ms | ██  245
   4 ms | █  76
   5 ms |   31
   6 ms |   21
   7 ms |   10
   8 ms |   3
   9 ms |   6
  11 ms |   1
  12 ms |   1
  13 ms |   18
  14 ms | █  123
  15 ms | █  102
  16 ms |   49
  17 ms |   42
  18 ms |   38
  19 ms |   23
  20 ms |   10
  21 ms |   1
  22 ms |   6
  23 ms |   5
  24 ms |   1
  25 ms |   1
  27 ms |   1
  36 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.40`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `51.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `38.89`
- `part` = `1.00`
- `fps_harmonic_avg` = `473.63`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `741.22`, min `26.52`, p50 `762.84`, p95 `1171.33`, p99 `1263.12`, 1%low `45.25`, 0.1%low `32.64`, std `295.15`

**Frame time (ms)**  avg `2.26`, p50 `1.31`, p95 `6.71`, p99 `18.53`, p99.9 `26.48`, max `37.71`

**Client tick (ms)**  avg `0.45`, p95 `0.78`, max `3.56`

**Memory**  start `2983 MB`, end `5044 MB`, peak `5499 MB`, GC `14 events / 172 ms`

**FPS over sampling window (ASCII):**

```
895.3 |█ █             █             █                                                 
854.5 |█ ███  ███   ██ █  █  █      ██ █                                               
813.8 |█████ ████   ████ █████████ ███ █                                             █ 
773.0 |█████ ████   ██████████████ ███ █               ██              █   █ █  █  █ █ 
732.3 |███████████ ███████████████████ █  ██     █ ███ ██    █   █     █   █ █  ██ █ ██
691.5 |███████████ ███████████████████ █ █████   █████████  ██ ███  ████ █ ███████ ████
650.8 |███████████ █████████████████████ ██████  █████████ ███ ████ ████ █ ████████████
610.0 |█████████████████████████████████ ██████  ███████████████████████ ██████████████
569.3 |█████████████████████████████████ ██████ ███████████████████████████████████████
528.5 |████████████████████████████████████████ ███████████████████████████████████████
487.8 |████████████████████████████████████████ ███████████████████████████████████████
447.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████  1919
   1 ms | ████████████████████████████████████████  5151
   2 ms | ███████  924
   3 ms | ██  273
   4 ms | █  91
   5 ms |   31
   6 ms |   16
   7 ms |   4
   8 ms |   7
   9 ms |   3
  10 ms |   4
  11 ms |   1
  13 ms |   20
  14 ms | █  82
  15 ms | █  101
  16 ms |   55
  17 ms |   52
  18 ms |   34
  19 ms |   15
  20 ms |   18
  21 ms |   11
  22 ms |   11
  23 ms |   5
  24 ms |   4
  25 ms |   2
  26 ms |   3
  27 ms |   3
  28 ms |   1
  30 ms |   1
  33 ms |   1
  36 ms |   1
  37 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `45.25`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `15.00`
- `entity_count_delta` = `-14.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `51.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `32.64`
- `part` = `1.00`
- `fps_harmonic_avg` = `442.22`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `56.00`
- `z_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 25641 ms  |  Sample ticks: 400

**FPS**  avg `708.76`, min `27.30`, p50 `729.66`, p95 `1124.83`, p99 `1207.45`, 1%low `45.15`, 0.1%low `32.38`, std `279.54`

**Frame time (ms)**  avg `2.37`, p50 `1.37`, p95 `9.76`, p99 `19.30`, p99.9 `26.22`, max `36.62`

**Client tick (ms)**  avg `0.44`, p95 `0.65`, max `3.75`

**Memory**  start `4630 MB`, end `4348 MB`, peak `5879 MB`, GC `14 events / 182 ms`

**FPS over sampling window (ASCII):**

```
945.2 | █                                                                              
906.6 | █                                                                              
868.0 | ███               █       █                                                    
829.5 |████               ██      █                                █                   
790.9 |████              ██████ █ █   █             █              █                   
752.3 |█████     ██ ██ █ ██████ █ ██  ███   ██      █       █   █  █                   
713.8 |█████   ████ ██ ████████ █ █████████ ███   █ █ █ █ ███ █ ██ █  █ █  █   █      █
675.2 |█████   ██████████████████ █████████████  ████ █ █ ███ █ ████  █ █  █   █   ██ █
636.6 |█████ █ ██████████████████ █████████████ █████ █ █████████████████████  ████████
598.0 |██████████████████████████████████████████████████████████████████████  ████████
559.5 |██████████████████████████████████████████████████████████████████████  ████████
520.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  1318
   1 ms | ████████████████████████████████████████  5305
   2 ms | ███████  983
   3 ms | ██  248
   4 ms | █  94
   5 ms |   28
   6 ms |   22
   7 ms |   11
   8 ms |   7
   9 ms |   6
  11 ms |   3
  12 ms |   2
  13 ms |   2
  14 ms |   50
  15 ms | █  90
  16 ms | █  73
  17 ms |   62
  18 ms |   40
  19 ms |   31
  20 ms |   25
  21 ms |   20
  22 ms |   7
  23 ms |   3
  24 ms |   4
  25 ms |   1
  26 ms |   3
  28 ms |   1
  29 ms |   1
  32 ms |   2
  34 ms |   1
  36 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `45.15`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-2.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preload_duration_ms` = `2598.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `32.38`
- `part` = `1.00`
- `fps_harmonic_avg` = `422.34`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `54.00`
- `z_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `795.75`, min `29.91`, p50 `841.35`, p95 `1185.14`, p99 `1265.23`, 1%low `49.28`, 0.1%low `36.94`, std `287.98`

**Frame time (ms)**  avg `2.03`, p50 `1.19`, p95 `4.58`, p99 `17.78`, p99.9 `23.89`, max `33.44`

**Client tick (ms)**  avg `0.42`, p95 `0.66`, max `4.67`

**Memory**  start `5319 MB`, end `3622 MB`, peak `6204 MB`, GC `13 events / 191 ms`

**FPS over sampling window (ASCII):**

```
945.2 |  █     █                                                                       
911.0 |  █ ██ ██ █           █                                                         
876.7 |██████ ██ █  █   ██   █          █                  █                           
842.5 |██████ ████████  ██████████    █ █  █ █    █        █  █         █              
808.3 |████████████████ ██████████ █  ███  █ ███ ██ ███    ██ ██    ██  █              
774.0 |████████████████ █████████████████  ████████ ███  █ █████   ████████ █          
739.8 |████████████████ ███████████████████████████████ █████████  ████████ █  █       
705.5 |██████████████████████████████████████████████████████████  ████████ ████ █ ███ 
671.3 |███████████████████████████████████████████████████████████ █████████████ █ ███ 
637.0 |███████████████████████████████████████████████████████████ █████████████ █████ 
602.8 |███████████████████████████████████████████████████████████ █████████████ ██████
568.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████  2628
   1 ms | ████████████████████████████████████████  5715
   2 ms | █████  747
   3 ms | █  201
   4 ms | █  85
   5 ms |   28
   6 ms |   6
   7 ms |   2
   8 ms |   4
   9 ms |   2
  10 ms |   1
  13 ms |   23
  14 ms | █  114
  15 ms | █  117
  16 ms |   49
  17 ms |   36
  18 ms |   30
  19 ms |   21
  20 ms |   12
  21 ms |   5
  22 ms |   6
  23 ms |   4
  24 ms |   4
  26 ms |   1
  32 ms |   2
  33 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.28`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `73.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `36.94`
- `part` = `1.00`
- `fps_harmonic_avg` = `491.91`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `61.00`
- `z_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25665 ms  |  Sample ticks: 400

**FPS**  avg `656.06`, min `19.37`, p50 `665.40`, p95 `1081.21`, p99 `1167.38`, 1%low `44.60`, 0.1%low `30.75`, std `280.53`

**Frame time (ms)**  avg `2.59`, p50 `1.50`, p95 `14.57`, p99 `19.53`, p99.9 `26.77`, max `51.64`

**Client tick (ms)**  avg `0.40`, p95 `0.64`, max `3.98`

**Memory**  start `4421 MB`, end `4451 MB`, peak `6377 MB`, GC `13 events / 182 ms`

**FPS over sampling window (ASCII):**

```
829.7 |       █                                                                        
792.6 | █ ███ █   █  █               █ █        █                                      
755.6 |██ ███ █ █ ████      █   █  █ █ ██       █ █                                    
718.5 |██ ███████ █████    ██   █  █ █ ██       █ █                     █              
681.5 |██████████ █████  ██████ ██ ███ ███ █    █ █      █      █     █ █  ███ █       
644.4 |███████████████████████████████ █████ █  █ █ ██  ██  █   ██    █ █████████      
607.4 |███████████████████████████████ ███████  █ ████  ██  █   ██ ██ █ █████████      
570.3 |███████████████████████████████████████████████ ██████ ███████ ███████████      
533.3 |███████████████████████████████████████████████ ████████████████████████████    
496.2 |███████████████████████████████████████████████ ████████████████████████████    
459.2 |█████████████████████████████████████████████████████████████████████████████  █
422.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  895
   1 ms | ████████████████████████████████████████  4558
   2 ms | ███████████  1262
   3 ms | ███  335
   4 ms | █  128
   5 ms | █  61
   6 ms |   22
   7 ms |   13
   8 ms |   13
   9 ms |   7
  10 ms |   5
  11 ms |   4
  13 ms |   6
  14 ms |   48
  15 ms | █  90
  16 ms | █  71
  17 ms | █  60
  18 ms |   48
  19 ms |   31
  20 ms |   24
  21 ms |   8
  22 ms |   5
  23 ms |   8
  24 ms |   3
  25 ms |   1
  26 ms |   2
  27 ms |   3
  29 ms |   1
  31 ms |   2
  33 ms |   1
  51 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `44.60`
- `surface_water_ratio` = `0.10`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `43.00`
- `entity_count_delta` = `-42.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `2596.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `30.75`
- `part` = `1.00`
- `fps_harmonic_avg` = `385.52`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `691.40`, min `22.84`, p50 `727.06`, p95 `1086.36`, p99 `1166.36`, 1%low `45.68`, 0.1%low `29.83`, std `283.35`

**Frame time (ms)**  avg `2.48`, p50 `1.38`, p95 `14.30`, p99 `18.54`, p99.9 `25.73`, max `43.78`

**Client tick (ms)**  avg `0.49`, p95 `0.82`, max `5.51`

**Memory**  start `5159 MB`, end `5511 MB`, peak `6622 MB`, GC `11 events / 176 ms`

**FPS over sampling window (ASCII):**

```
826.2 |███          █                                                                  
791.9 |████   █ ███ ███                                                 █              
757.6 |████   █████ ████      █     █       █     █ █                   █              
723.3 |████ █████████████    █████  █   ██ ███    █ █   █           █  ██     █    █  █
689.0 |███████████████████  ██████████  ██ ██████████   █  █        ██ ███ █ ██    █  █
654.7 |███████████████████  █████████████████████████   █  █  ████████████ █ ██    █  █
620.5 |████████████████████ ██████████████████████████  █ ██  ██████████████ ████ █████
586.2 |████████████████████ ██████████████████████████  █ ███ ██████████████ ████ █████
551.9 |███████████████████████████████████████████████ ██████ ██████████████ ████ █████
517.6 |███████████████████████████████████████████████ ██████ ██████████████ ████ █████
483.3 |███████████████████████████████████████████████ ████████████████████████████████
449.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  1123
   1 ms | ████████████████████████████████████████  4997
   2 ms | ████████  986
   3 ms | ██  251
   4 ms | █  121
   5 ms | █  75
   6 ms |   46
   7 ms |   24
   8 ms |   12
   9 ms |   3
  10 ms |   4
  11 ms |   4
  12 ms |   1
  13 ms |   8
  14 ms | █  78
  15 ms | █  88
  16 ms | █  75
  17 ms | █  70
  18 ms |   32
  19 ms |   23
  20 ms |   22
  21 ms |   10
  22 ms |   2
  23 ms |   2
  24 ms |   3
  25 ms |   3
  26 ms |   2
  27 ms |   2
  36 ms |   1
  37 ms |   1
  41 ms |   1
  43 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `45.68`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `9.00`
- `entity_count_delta` = `-8.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `53.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `29.83`
- `part` = `1.00`
- `fps_harmonic_avg` = `403.55`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 24292 ms  |  Sample ticks: 400

**FPS**  avg `767.46`, min `21.90`, p50 `790.24`, p95 `1201.18`, p99 `1280.83`, 1%low `47.90`, 0.1%low `30.55`, std `299.17`

**Frame time (ms)**  avg `2.16`, p50 `1.27`, p95 `5.67`, p99 `18.19`, p99.9 `23.83`, max `45.67`

**Client tick (ms)**  avg `0.34`, p95 `0.49`, max `0.75`

**Memory**  start `3574 MB`, end `5002 MB`, peak `6768 MB`, GC `13 events / 179 ms`

**FPS over sampling window (ASCII):**

```
970.5 |  █     █                                                                       
919.2 |  ███   █              █ ██     █                                               
867.9 |█ █████ █         █ ██ █ ██     █ █ █    █             █               █  █     
816.6 |█ █████ █    █  ███████████ █   █ █ ██  ██   █    █    █  █            █  █     
765.3 |█ █████ ██  ███ ██████████████  ███████ █████████ ██   ████ █       █ ██ ██     
713.9 |███████ █████████████████████████████████████████ ██  █████ ██   █ ██ ██ ███    
662.6 |████████████████████████████████████████████████████  █████████  ███████ ███    
611.3 |████████████████████████████████████████████████████ ██████████  ████████████ ██
560.0 |█████████████████████████████████████████████████████████████████████████████ ██
508.7 |█████████████████████████████████████████████████████████████████████████████ ██
457.4 |█████████████████████████████████████████████████████████████████████████████ ██
406.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████  2342
   1 ms | ████████████████████████████████████████  5223
   2 ms | ███████  905
   3 ms | ██  225
   4 ms | █  81
   5 ms |   30
   6 ms |   14
   7 ms |   8
   8 ms |   5
   9 ms |   4
  10 ms |   2
  11 ms |   1
  13 ms |   10
  14 ms | █  77
  15 ms | █  108
  16 ms | █  74
  17 ms |   42
  18 ms |   46
  19 ms |   27
  20 ms |   15
  21 ms |   5
  22 ms |   4
  23 ms |   1
  24 ms |   1
  25 ms |   1
  26 ms |   1
  30 ms |   1
  31 ms |   1
  32 ms |   2
  34 ms |   1
  36 ms |   1
  45 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.90`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1245.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `30.55`
- `part` = `1.00`
- `fps_harmonic_avg` = `462.95`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `714.30`, min `26.88`, p50 `731.70`, p95 `1133.87`, p99 `1254.75`, 1%low `46.98`, 0.1%low `35.36`, std `280.77`

**Frame time (ms)**  avg `2.32`, p50 `1.37`, p95 `9.83`, p99 `18.42`, p99.9 `25.15`, max `37.20`

**Client tick (ms)**  avg `0.37`, p95 `0.56`, max `2.17`

**Memory**  start `5389 MB`, end `5563 MB`, peak `6882 MB`, GC `11 events / 172 ms`

**FPS over sampling window (ASCII):**

```
901.5 |   ██                                                                           
865.1 |   ███ ██     █   █                █                                            
828.6 |█████████     █   █     █          █                                            
792.1 |█████████ ███ █   █     █ █  █     █                                            
755.6 |█████████████ ███ █  █  █ █  █ █   █ █                            █  █          
719.2 |█████████████ ██████ ████████████  █ █ █      █   █       █ ██    ██ █   █ █    
682.7 |██████████████████████████████████ █ █ █ █  █ █  ███  █  ██ ███   ██ ███ █ █ █ █
646.2 |██████████████████████████████████ █ ███ ██████████████  ████████ ██████ █ █ ███
609.8 |██████████████████████████████████ █ ██████████████████  █████████████████ █ ███
573.3 |██████████████████████████████████ ████████████████████ ████████████████████ ███
536.8 |███████████████████████████████████████████████████████ ████████████████████ ███
500.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  1367
   1 ms | ████████████████████████████████████████  5496
   2 ms | ███████  932
   3 ms | ██  240
   4 ms | █  74
   5 ms |   41
   6 ms |   19
   7 ms |   10
   8 ms |   10
   9 ms |   4
  10 ms |   5
  11 ms |   1
  13 ms |   17
  14 ms | █  78
  15 ms | █  107
  16 ms |   62
  17 ms |   59
  18 ms |   38
  19 ms |   14
  20 ms |   15
  21 ms |   10
  22 ms |   7
  23 ms |   7
  24 ms |   1
  25 ms |   6
  26 ms |   1
  27 ms |   1
  34 ms |   1
  37 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.98`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `12.00`
- `entity_count_delta` = `-11.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `35.36`
- `part` = `1.00`
- `fps_harmonic_avg` = `431.19`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `767.52`, min `8.60`, p50 `786.56`, p95 `1209.75`, p99 `1297.12`, 1%low `44.75`, 0.1%low `23.39`, std `304.99`

**Frame time (ms)**  avg `2.20`, p50 `1.27`, p95 `6.00`, p99 `18.54`, p99.9 `24.82`, max `116.29`

**Client tick (ms)**  avg `0.38`, p95 `0.55`, max `4.02`

**Memory**  start `4256 MB`, end `5748 MB`, peak `7231 MB`, GC `10 events / 170 ms`

**FPS over sampling window (ASCII):**

```
965.6 |  █                                                                             
923.3 |  █  █ █                                                                        
881.0 |  █████████ █        █                █   █                                     
838.7 | ████████████████  ███ ██     █  █ █  █ █ █ █                                   
796.5 | ████████████████  ███████    █ ██ ████ █ █ █ ██   █  █ █       █          █    
754.2 |██████████████████ ███████   ████████████ █ █ ████ █  ███       █   ██     █    
711.9 |██████████████████ ████████  ████████████████████████ ███  █ ██ █   ██   █ █    
669.6 |████████████████████████████ ████████████████████████████████████   ████ █ █  ██
627.3 |█████████████████████████████████████████████████████████████████  █████████████
585.0 |█████████████████████████████████████████████████████████████████ ██████████████
542.7 |█████████████████████████████████████████████████████████████████ ██████████████
500.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████  2387
   1 ms | ████████████████████████████████████████  5033
   2 ms | ███████  887
   3 ms | ██  230
   4 ms | █  80
   5 ms |   41
   6 ms |   20
   7 ms |   7
   8 ms |   7
   9 ms |   1
  11 ms |   1
  12 ms |   3
  13 ms |   13
  14 ms | █  78
  15 ms | █  96
  16 ms | █  79
  17 ms |   42
  18 ms |   34
  19 ms |   29
  20 ms |   22
  21 ms |   9
  23 ms |   4
  24 ms |   3
  25 ms |   2
  32 ms |   1
  33 ms |   1
  38 ms |   1
  42 ms |   1
  46 ms |   1
 116 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `44.75`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `4.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `9.00`
- `preload_duration_ms` = `84.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `23.39`
- `part` = `1.00`
- `fps_harmonic_avg` = `455.53`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1924.70`, min `18.96`, p50 `2082.79`, p95 `2564.08`, p99 `3087.74`, 1%low `46.10`, 0.1%low `30.37`, std `608.86`

**Frame time (ms)**  avg `1.00`, p50 `0.48`, p95 `2.22`, p99 `18.81`, p99.9 `23.77`, max `52.75`

**Client tick (ms)**  avg `0.49`, p95 `0.74`, max `25.24`

**Memory**  start `6082 MB`, end `4753 MB`, peak `7227 MB`, GC `23 events / 402 ms`

**FPS over sampling window (ASCII):**

```
2186.4 |                   █                                                            
2117.9 |       █           ██   ██       █                      █ █               █     
2049.5 |█  █  ██ █         ██   ██    █ ██ █ █            ██ █  ███          █    ██ █  
1981.1 |█ ██  ████       █ ██   ██   █████████  █         █████ █████     ██ █  █ ██ █  
1912.7 |█ ██  ████ █ █   █ ████ ███  ██████████████    █ ██████ █████     ██ ██ █ ██ █  
1844.2 |█████ ██████ █   ███████████ ██████████████    ███████████████  █ █████████████ 
1775.8 |█████ █████████ ███████████████████████████    ███████████████  ███████████████ 
1707.4 |███████████████████████████████████████████  █████████████████ █████████████████
1639.0 |███████████████████████████████████████████  ███████████████████████████████████
1570.5 |████████████████████████████████████████████ ███████████████████████████████████
1502.1 |████████████████████████████████████████████ ███████████████████████████████████
1433.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18124
   1 ms | ██  772
   2 ms | █  310
   3 ms | █  237
   4 ms |   97
   5 ms |   28
   6 ms |   6
   7 ms |   5
   8 ms |   3
   9 ms |   1
  10 ms |   2
  14 ms |   3
  15 ms |   7
  16 ms |   22
  17 ms |   71
  18 ms |   90
  19 ms |   72
  20 ms |   41
  21 ms |   31
  22 ms |   15
  23 ms |   9
  24 ms |   4
  25 ms |   3
  26 ms |   1
  27 ms |   2
  28 ms |   1
  32 ms |   1
  33 ms |   1
  41 ms |   1
  44 ms |   1
  48 ms |   1
  49 ms |   2
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `30.37`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `43.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `46.10`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `998.27`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `144.91`, min `14.28`, p50 `168.80`, p95 `230.71`, p99 `350.72`, 1%low `20.18`, 0.1%low `15.92`, std `72.65`

**Frame time (ms)**  avg `10.58`, p50 `5.92`, p95 `28.22`, p99 `40.96`, p99.9 `55.26`, max `70.03`

**Client tick (ms)**  avg `6.73`, p95 `16.18`, max `51.03`

**Memory**  start `4886 MB`, end `5900 MB`, peak `7277 MB`, GC `21 events / 358 ms`

**FPS over sampling window (ASCII):**

```
252.5 |                                              █                                 
236.3 |                                      ██     ██                                 
220.2 |                                      ██     ██                                 
204.1 |                                      ██    ███                                 
187.9 |                                      ██    ███                                 
171.8 |  █  █                                ███   ████    █       ██                  
155.6 |█ █ ██     █       █ █   █          █ ███ █ ███████ ██    █ ███   █         █   
139.5 |█ ██████████       █ ███████████    ███████████████████   ███████████████   ████
123.4 |██████████████    ██████████████  ███████████████████████ ████████████████ █████
107.2 |███████████████   ██████████████████████████████████████████████████████████████
 91.1 |█████████████████ ██████████████████████████████████████████████████████████████
 74.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  34
   3 ms | ██  40
   4 ms | ███████████████  248
   5 ms | ████████████████████████████████████████  648
   6 ms | ████████  135
   7 ms | █████  86
   8 ms | ███  46
   9 ms | ████  58
  10 ms | █████  89
  11 ms | ██  37
  12 ms | █  19
  13 ms | █  14
  14 ms | █  16
  15 ms |   3
  16 ms |   6
  17 ms | █  15
  18 ms | ██  30
  19 ms | ██  34
  20 ms | ██  37
  21 ms | ██  33
  22 ms | ██  39
  23 ms | ██  31
  24 ms | ██  31
  25 ms | █  18
  26 ms | ██  25
  27 ms | █  17
  28 ms | █  10
  29 ms | █  15
  30 ms | █  10
  31 ms |   7
  32 ms | █  13
  33 ms |   4
  34 ms |   2
  35 ms |   5
  36 ms |   4
  37 ms |   1
  38 ms |   1
  39 ms |   5
  40 ms |   4
  41 ms |   1
  42 ms |   2
  44 ms |   1
  45 ms |   4
  47 ms |   1
  48 ms |   1
  50 ms |   1
  51 ms |   2
  52 ms |   2
  54 ms |   1
  55 ms |   2
  70 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `94.48`
- `part` = `1.00`
- `particles_spawned` = `255360.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `15.92`
- `fps_1pct_low` = `20.18`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `52.00`
- `seed` = `2521.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `1586.76`, min `17.05`, p50 `1700.72`, p95 `2205.43`, p99 `2581.53`, 1%low `44.15`, 0.1%low `27.81`, std `520.44`

**Frame time (ms)**  avg `1.18`, p50 `0.59`, p95 `2.16`, p99 `19.62`, p99.9 `25.99`, max `58.66`

**Client tick (ms)**  avg `0.50`, p95 `1.19`, max `4.30`

**Memory**  start `7003 MB`, end `4339 MB`, peak `7270 MB`, GC `23 events / 409 ms`

**FPS over sampling window (ASCII):**

```
1890.8 |                                                                     █          
1832.8 |                  █                        █          █    █         █          
1774.8 |             █    █        █           █   █          █    █         █          
1716.9 | █          ██  ███        ██         ██ █ ██      █  █ ██ ██        ███      █ 
1658.9 | █          ██ █████     █ ██         ████ ██      █ ████████ █      ███     ██ 
1600.9 | █         ███ █████     █ ██    █    ███████ █    ██████████ ███ █ ████     ██ 
1542.9 |███  █   █ ███████████ ███ ██ █  █  █████████ █   ███████████ ███ ██████ █   ███
1484.9 |████ █   █ ████████████████████ ███ █████████ █ █████████████████ ████████   ███
1427.0 |████ █ ████████████████████████████ █████████ █ ███████████████████████████ ████
1369.0 |███████████████████████████████████ █████████ █ ████████████████████████████████
1311.0 |███████████████████████████████████████████████ ████████████████████████████████
1253.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14739
   1 ms | ████  1304
   2 ms | █  312
   3 ms |   127
   4 ms |   68
   5 ms |   21
   6 ms |   10
   7 ms |   8
   8 ms |   2
  10 ms |   1
  14 ms |   1
  15 ms |   4
  16 ms |   18
  17 ms |   48
  18 ms |   90
  19 ms |   73
  20 ms |   70
  21 ms |   26
  22 ms |   22
  23 ms |   8
  24 ms |   3
  25 ms |   3
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   3
  32 ms |   2
  34 ms |   2
  38 ms |   1
  39 ms |   1
  41 ms |   1
  46 ms |   1
  53 ms |   1
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `44.15`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `34.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `27.81`
- `part` = `1.00`
- `fps_harmonic_avg` = `848.13`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `1676.04`, min `19.60`, p50 `1793.13`, p95 `2293.48`, p99 `3127.84`, 1%low `44.75`, 0.1%low `30.15`, std `560.04`

**Frame time (ms)**  avg `1.13`, p50 `0.56`, p95 `2.14`, p99 `19.81`, p99.9 `24.69`, max `51.01`

**Client tick (ms)**  avg `0.54`, p95 `0.91`, max `27.86`

**Memory**  start `4631 MB`, end `3978 MB`, peak `7278 MB`, GC `22 events / 394 ms`

**FPS over sampling window (ASCII):**

```
2795.0 |                                         █                                      
2658.7 |                                         █                                      
2522.4 |                                         █                                      
2386.1 |                                         █                                      
2249.8 |                                         █                                      
2113.5 |                                        ██                                      
1977.2 |                                        ███                                    █
1840.9 |           █           █       █        ████   █ █     █         █             █
1704.6 |████████ ██████    ██  ██  █████ █   █ ███████████     █    █ ██ ███ █    █ █ ██
1568.4 |██████████████████ █████████████ ███████████████████   █ ██ ██████████ █  ███ ██
1432.1 |██████████████████ █████████████████████████████████ ███████████████████████████
1295.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15743
   1 ms | ███  1083
   2 ms | █  315
   3 ms |   132
   4 ms |   85
   5 ms |   15
   6 ms |   15
   7 ms |   8
   8 ms |   3
   9 ms |   2
  10 ms |   2
  11 ms |   1
  14 ms |   8
  15 ms |   3
  16 ms |   17
  17 ms |   37
  18 ms |   72
  19 ms |   81
  20 ms |   75
  21 ms |   32
  22 ms |   26
  23 ms |   8
  24 ms |   1
  25 ms |   1
  26 ms |   4
  27 ms |   3
  28 ms |   1
  29 ms |   1
  30 ms |   1
  33 ms |   1
  36 ms |   2
  39 ms |   1
  47 ms |   1
  50 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `toggles` = `22.00`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `30.15`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `888.81`
- `fps_1pct_low` = `44.75`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1552.48`, min `6.83`, p50 `1675.65`, p95 `2083.04`, p99 `2460.64`, 1%low `42.71`, 0.1%low `22.68`, std `490.70`

**Frame time (ms)**  avg `1.19`, p50 `0.60`, p95 `2.56`, p99 `19.52`, p99.9 `25.51`, max `146.39`

**Client tick (ms)**  avg `0.54`, p95 `1.31`, max `5.63`

**Memory**  start `6101 MB`, end `4648 MB`, peak `7274 MB`, GC `23 events / 564 ms`

**FPS over sampling window (ASCII):**

```
1881.6 |                                                                             █  
1823.8 |                                                                             █  
1766.0 |   ██           █                                                            █  
1708.2 |   ██           █         █        █                  █                    █ █  
1650.5 |   ██ █         ██  █  █ ██      █ █                 ██              █ █   █ █  
1592.7 |  ███████ ███   ████████████  █  █ ██   ██        ██ ██   █ ██     █ █ █  ██ █  
1534.9 | █████████████  █████████████ █  █ ████ ███   █ ██████████████     █████ ███ █  
1477.1 |██████████████  ████████████████ ██████ ████  █ ██████████████    ██████ █████ █
1419.3 |██████████████ ████████████████████████████████ ██████████████  █ ████████████ █
1361.5 |██████████████ ████████████████████████████████ ██████████████ ██ ████████████ █
1303.7 |███████████████████████████████████████████████ █████████████████ ██████████████
1245.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14752
   1 ms | ███  1034
   2 ms | █  288
   3 ms | █  228
   4 ms |   104
   5 ms |   31
   6 ms |   7
   7 ms |   5
   8 ms |   1
   9 ms |   2
  10 ms |   1
  13 ms |   1
  14 ms |   1
  15 ms |   9
  16 ms |   19
  17 ms |   54
  18 ms |   73
  19 ms |   82
  20 ms |   37
  21 ms |   30
  22 ms |   21
  23 ms |   11
  24 ms |   2
  25 ms |   5
  26 ms |   2
  27 ms |   1
  28 ms |   1
  31 ms |   1
  32 ms |   2
  34 ms |   1
  38 ms |   1
  42 ms |   1
  45 ms |   1
  49 ms |   1
  52 ms |   1
  53 ms |   1
  55 ms |   1
 146 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `56.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `22.68`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `840.67`
- `restocks` = `20.00`
- `fps_1pct_low` = `42.71`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1324.49`, min `16.85`, p50 `1403.40`, p95 `1959.53`, p99 `2662.06`, 1%low `43.47`, 0.1%low `26.13`, std `480.50`

**Frame time (ms)**  avg `1.39`, p50 `0.71`, p95 `3.17`, p99 `19.68`, p99.9 `26.07`, max `59.35`

**Client tick (ms)**  avg `0.49`, p95 `0.76`, max `9.05`

**Memory**  start `5099 MB`, end `3516 MB`, peak `7271 MB`, GC `22 events / 399 ms`

**FPS over sampling window (ASCII):**

```
2396.5 |                                                      █                         
2267.0 |                                                      █                         
2137.5 |                                                      █                         
2008.1 |                                                      █                         
1878.6 |                                                      █                         
1749.2 |                                                      ██  █                     
1619.7 |                                                      ██ ██                     
1490.2 | ██       █ █                                   █     ██ ██ █     █           █ 
1360.8 | ████    ████       █ █   ████        █████ ██  █    ██████████████  █  ███ ████
1231.3 |███████████████ ███████  █████ ██  ██ ███████████ █ ███████████████ ███████ ████
1101.8 |███████████████ ██████████████████ ████████████████ ████████████████████████████
972.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11689
   1 ms | █████  1566
   2 ms | █  368
   3 ms | █  227
   4 ms |   103
   5 ms |   34
   6 ms |   15
   7 ms |   8
   8 ms |   6
   9 ms |   2
  10 ms |   1
  11 ms |   1
  13 ms |   8
  14 ms |   1
  15 ms |   5
  16 ms |   23
  17 ms |   46
  18 ms |   81
  19 ms |   79
  20 ms |   49
  21 ms |   27
  22 ms |   11
  23 ms |   8
  24 ms |   6
  25 ms |   5
  26 ms |   5
  28 ms |   1
  30 ms |   1
  33 ms |   1
  36 ms |   1
  39 ms |   3
  43 ms |   1
  49 ms |   1
  54 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `43.47`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `26.13`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `719.30`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 196862 ms  |  Sample ticks: 3600

**FPS**  avg `189.14`, min `0.53`, p50 `192.96`, p95 `344.57`, p99 `431.35`, 1%low `18.76`, 0.1%low `6.40`, std `97.03`

**Frame time (ms)**  avg `8.42`, p50 `5.18`, p95 `24.15`, p99 `34.03`, p99.9 `54.71`, max `1901.93`

**Client tick (ms)**  avg `1.15`, p95 `2.27`, max `32.22`

**Memory**  start `4913 MB`, end `5708 MB`, peak `7604 MB`, GC `138 events / 2029 ms`

**FPS over sampling window (ASCII):**

```
266.2 |                                            █  █   █  █              █ █        
250.7 |███                                         █  █   ██ █     █  █   ███ ██       
235.3 |███                                  █      █  █  ███ █  █ ██  █   ██████       
219.9 |███         ██                    █ ██     ██  █  ███████████████  ███████      
204.5 |███         ██                 █  █ ███    ██ ██  ████████████████ █████████    
189.0 |███         ██                 ██ █ █████  ██ ██  ████████████████ █████████  █ 
173.6 |████        ██    █            ██ █ ██████ ██ ██  ███████████████████████████ █ 
158.2 |████  ██   ████   █      █   █ ███████████ █████  ██████████████████████████████
142.8 |████████ █ ████  ██  █ ███   ███████████████████ ███████████████████████████████
127.3 |███████████████  █████ ████  ███████████████████ ███████████████████████████████
111.9 |████████████████████████████████████████████████ ███████████████████████████████
 96.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  62
   2 ms | ███████████  1263
   3 ms | ████████████████████████████████████████  4373
   4 ms | ████████████████████████████████████████  4418
   5 ms | ███████████████████████████  2980
   6 ms | ███████████████  1609
   7 ms | ██████████  1098
   8 ms | ███████  804
   9 ms | █████  509
  10 ms | ███  295
  11 ms | ██  198
  12 ms | █  151
  13 ms | █  97
  14 ms | █  65
  15 ms |   45
  16 ms | █  117
  17 ms | ██  202
  18 ms | ███  315
  19 ms | ████  421
  20 ms | ████  390
  21 ms | ████  401
  22 ms | ███  349
  23 ms | ██  275
  24 ms | ██  225
  25 ms | ██  175
  26 ms | █  146
  27 ms | █  112
  28 ms | █  74
  29 ms | █  56
  30 ms |   44
  31 ms |   21
  32 ms |   18
  33 ms |   23
  34 ms |   22
  35 ms |   15
  36 ms |   11
  37 ms |   21
  38 ms |   19
  39 ms |   10
  40 ms |   8
  41 ms |   9
  42 ms |   6
  43 ms |   10
  44 ms |   8
  45 ms |   8
  46 ms |   13
  47 ms |   5
  48 ms |   4
  49 ms |   5
  50 ms |   8
  51 ms |   3
  52 ms |   4
  53 ms |   1
  54 ms |   7
  55 ms |   1
  57 ms |   1
  58 ms |   2
  60 ms |   1
  62 ms |   3
  64 ms |   1
  65 ms |   1
  67 ms |   1
  68 ms |   1
  72 ms |   2
  76 ms |   1
  78 ms |   1
  80 ms |   1
 130 ms |   1
 170 ms |   1
1901 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `1.00`
- `trees_built` = `173.00`
- `phase` = `0.00`
- `segment_count` = `19.00`
- `part` = `2.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `86.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `18.76`
- `fps_harmonic_avg` = `118.79`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `578.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `6.40`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 197311 ms  |  Sample ticks: 3600

**FPS**  avg `221.84`, min `12.69`, p50 `223.79`, p95 `399.30`, p99 `532.02`, 1%low `35.15`, 0.1%low `22.68`, std `105.12`

**Frame time (ms)**  avg `6.81`, p50 `4.47`, p95 `22.02`, p99 `25.36`, p99.9 `35.32`, max `78.82`

**Client tick (ms)**  avg `0.84`, p95 `1.13`, max `19.24`

**Memory**  start `7376 MB`, end `4247 MB`, peak `7397 MB`, GC `25 events / 162 ms`

**FPS over sampling window (ASCII):**

```
298.0 |                                                   █                            
284.6 |                                       █          ███████   █       ████        
271.2 |                                      ██          █████████ ██████ █████        
257.9 |                                      ██    █ █   ████████████████ ██████       
244.5 |                                     ███    ███   ████████████████ ███████      
231.1 |█                              █     ███   ████   ██████████████████████████ ███
217.8 |█   █      ██               █████████████  ████   ██████████████████████████████
204.4 |█   █      ██               █████████████  ████  ███████████████████████████████
191.0 |█   ██     ██               █████████████  █████ ███████████████████████████████
177.7 |█   ███    ███   ███  ██    █████████████  █████ ███████████████████████████████
164.3 |█  ████████████ ████████████████████████████████████████████████████████████████
150.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  414
   2 ms | █████████████  2327
   3 ms | ████████████████████████████████████████  6850
   4 ms | ████████████████████████████████████████  6896
   5 ms | ████████████████████  3532
   6 ms | █████████  1546
   7 ms | ████  726
   8 ms | ██  264
   9 ms |   72
  10 ms |   31
  11 ms |   14
  12 ms |   17
  13 ms |   12
  14 ms |   7
  15 ms |   23
  16 ms |   61
  17 ms | █  217
  18 ms | ██  396
  19 ms | ███  482
  20 ms | ███  601
  21 ms | ████  612
  22 ms | ███  444
  23 ms | ██  318
  24 ms | █  242
  25 ms | █  148
  26 ms | █  90
  27 ms |   35
  28 ms |   8
  29 ms |   9
  30 ms |   5
  31 ms |   3
  32 ms |   1
  34 ms |   1
  35 ms |   3
  36 ms |   3
  38 ms |   2
  39 ms |   1
  40 ms |   4
  41 ms |   3
  42 ms |   4
  44 ms |   3
  46 ms |   1
  49 ms |   1
  54 ms |   1
  64 ms |   1
  78 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `71.00`
- `trees_built` = `173.00`
- `phase` = `1.00`
- `segment_count` = `19.00`
- `part` = `3.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `16.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `35.15`
- `fps_harmonic_avg` = `146.86`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `578.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `22.68`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194266 ms  |  Sample ticks: 3600

**FPS**  avg `130.33`, min `3.83`, p50 `117.08`, p95 `291.12`, p99 `402.23`, 1%low `26.07`, 0.1%low `14.58`, std `86.80`

**Frame time (ms)**  avg `13.18`, p50 `8.54`, p95 `31.33`, p99 `33.38`, p99.9 `44.81`, max `261.35`

**Client tick (ms)**  avg `0.78`, p95 `1.01`, max `13.56`

**Memory**  start `5091 MB`, end `5490 MB`, peak `7396 MB`, GC `20 events / 182 ms`

**FPS over sampling window (ASCII):**

```
164.5 |                                                             ██  ██             
159.7 |                                                            ███████             
154.9 |                                                          ██████████            
150.1 |                                                        █████████████           
145.3 |                                                        █████████████ ███       
140.5 |                                                       ██████████████████   █   
135.8 |█      █                                               ███████████████████████  
131.0 |█    ███                           █ █         ███    ██████████████████████████
126.2 |█    ███     ███    █            █ █████ ███   ███   ███████████████████████████
121.4 |█  ████████  ███  ████    █     ████████ ███  █████ ████████████████████████████
116.6 |████████████ ████ █████  ████  █████████████ ███████████████████████████████████
111.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   15
   2 ms | █████████  356
   3 ms | ███████████████████████  978
   4 ms | ███████████████████████████████████  1445
   5 ms | ███████████████████████  965
   6 ms | ███████████████████  782
   7 ms | █████████████████████████████████  1381
   8 ms | ████████████████████████████████████████  1670
   9 ms | ███████████████████████████████  1280
  10 ms | ████████████████  676
  11 ms | ██████  239
  12 ms | █  50
  13 ms |   7
  14 ms |   3
  19 ms |   2
  20 ms |   7
  21 ms |   11
  22 ms |   18
  23 ms | █  35
  24 ms | ██  87
  25 ms | ████  171
  26 ms | ████████  348
  27 ms | ████████████  518
  28 ms | ███████████████  622
  29 ms | ██████████████  595
  30 ms | ██████████████  579
  31 ms | █████████  374
  32 ms | ██████  245
  33 ms | ███  114
  34 ms | █  39
  35 ms |   13
  36 ms |   6
  39 ms |   1
  43 ms |   5
  44 ms |   3
  45 ms |   7
  46 ms |   1
  47 ms |   1
  48 ms |   1
  49 ms |   1
  62 ms |   1
 125 ms |   1
 261 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `71.00`
- `trees_built` = `173.00`
- `phase` = `2.00`
- `segment_count` = `19.00`
- `part` = `4.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `26.07`
- `fps_harmonic_avg` = `75.85`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `578.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `14.58`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195544 ms  |  Sample ticks: 3600

**FPS**  avg `122.25`, min `1.21`, p50 `88.54`, p95 `309.03`, p99 `407.63`, 1%low `14.77`, 0.1%low `4.01`, std `100.63`

**Frame time (ms)**  avg `17.31`, p50 `11.29`, p95 `37.86`, p99 `40.92`, p99.9 `56.69`, max `824.57`

**Client tick (ms)**  avg `0.74`, p95 `0.97`, max `14.14`

**Memory**  start `5917 MB`, end `7066 MB`, peak `7401 MB`, GC `18 events / 418 ms`

**FPS over sampling window (ASCII):**

```
177.1 |                                                                █               
169.3 |                                                                ██              
161.6 |                                                             █ ███              
153.8 |                                                          ████████ █            
146.1 |                                                          ██████████            
138.3 |█                                                        ███████████████        
130.6 |█     ██                                █             ██████████████████  █ █ █ 
122.8 |█    ███      █                      █████    █ █    ███████████████████████████
115.1 |█    ████    ████   █    █     ███████████   █████ █████████████████████████████
107.3 |███ ███████ ███████ █   ███████████████████ ████████████████████████████████████
 99.6 |██████████████████████ █████████████████████████████████████████████████████████
 91.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   8
   2 ms | ████████████  359
   3 ms | █████████████████████████████████████  1073
   4 ms | ████████████████████████████████████████  1171
   5 ms | ██████████████████████  657
   6 ms | ███████████  325
   7 ms | █████  152
   8 ms | ███████  217
   9 ms | ███████████████  436
  10 ms | █████████████████████  628
  11 ms | █████████████████████  629
  12 ms | ██████████████████  517
  13 ms | ███████████  325
  14 ms | █████  139
  15 ms | ██  61
  16 ms |   14
  17 ms |   8
  18 ms |   1
  19 ms |   2
  21 ms |   3
  22 ms | █  23
  23 ms | █  16
  24 ms | █  22
  25 ms | █  24
  26 ms |   14
  27 ms | █  30
  28 ms | ██  70
  29 ms | █████  142
  30 ms | ███████  206
  31 ms | ███████████  309
  32 ms | ██████████████  398
  33 ms | ███████████████  441
  34 ms | ███████████████  450
  35 ms | ██████████████  409
  36 ms | █████████████  379
  37 ms | ██████████  284
  38 ms | ███████  204
  39 ms | ████  110
  40 ms | ██  65
  41 ms | █  22
  42 ms |   7
  43 ms |   3
  44 ms |   3
  45 ms |   2
  46 ms |   2
  47 ms |   1
  48 ms |   3
  49 ms |   8
  50 ms |   1
  51 ms |   6
  52 ms |   9
  53 ms |   6
  54 ms |   10
  55 ms |   6
  56 ms |   5
  57 ms |   2
  58 ms |   2
  63 ms |   1
  90 ms |   1
 501 ms |   1
 728 ms |   1
 824 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `70.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `14.77`
- `fps_harmonic_avg` = `57.76`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `578.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `4.01`

