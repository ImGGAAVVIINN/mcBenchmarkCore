# MC Benchmark Core session — 2026-10-01T20:29:36.829914513+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1321.1 | 46.5 | 27.3 | 18.00 | 0.98 | 71 | 485 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 1394.5 | 56.7 | 44.6 | 15.78 | 0.82 | 66 | 764 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 1199.7 | 55.2 | 43.1 | 16.29 | 0.79 | 55 | 142 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 854.8 | 53.4 | 44.8 | 17.40 | 0.82 | 53 | 515 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 1367.6 | 56.9 | 44.3 | 15.87 | 0.75 | 57 | 710 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 1368.9 | 56.7 | 44.6 | 15.89 | 0.56 | 52 | 438 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 1212.4 | 57.0 | 47.4 | 16.03 | 0.78 | 51 | 689 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 676.2 | 52.9 | 43.0 | 17.42 | 1.20 | 41 | 73 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1606.3 | 54.1 | 38.4 | 16.13 | 3.16 | 44 | 381 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 231.4 | 30.8 | 25.2 | 24.89 | 4.06 | 27 | 454 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 769.4 | 51.3 | 35.1 | 17.08 | 1.01 | 53 | 319 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 678.6 | 53.2 | 39.2 | 16.93 | 0.53 | 45 | 686 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 710.2 | 43.2 | 27.0 | 18.95 | 3.86 | 31 | 171 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 767.9 | 42.9 | 26.6 | 19.89 | 3.12 | 29 | 966 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1215.8 | 24.4 | 19.7 | 34.89 | 14.21 | 23 | 385 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1115.6 | 23.2 | 20.0 | 38.93 | 14.46 | 20 | 365 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1670.8 | 48.5 | 31.6 | 17.69 | 2.20 | 40 | 137 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1616.4 | 52.2 | 40.0 | 17.22 | 1.99 | 45 | 873 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 915.3 | 53.3 | 41.9 | 17.11 | 0.70 | 45 | 541 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 2317.4 | 57.6 | 48.3 | 15.86 | 0.31 | 45 | 1285 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 2124.1 | 54.6 | 44.7 | 16.57 | 0.31 | 41 | 956 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 2042.4 | 55.7 | 45.9 | 16.38 | 0.38 | 41 | 744 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1979.8 | 55.6 | 47.2 | 16.40 | 0.33 | 40 | 871 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 2154.5 | 58.0 | 46.6 | 14.90 | 0.37 | 36 | 682 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1693.6 | 52.3 | 36.3 | 16.71 | 0.40 | 40 | 787 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 2118.1 | 59.0 | 41.8 | 14.34 | 0.34 | 11 | 1425 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 1948.3 | 56.1 | 41.2 | 15.15 | 0.36 | 15 | 2303 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 2007.9 | 55.7 | 39.0 | 15.40 | 0.34 | 17 | 2938 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 1916.1 | 54.3 | 38.2 | 15.94 | 0.35 | 15 | 973 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 2030.9 | 54.9 | 36.2 | 15.33 | 0.37 | 17 | 2461 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 1757.0 | 52.6 | 38.2 | 16.30 | 0.39 | 15 | 1062 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 1745.7 | 55.8 | 43.4 | 15.64 | 0.45 | 15 | 1881 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 1876.3 | 51.6 | 39.9 | 17.00 | 0.32 | 12 | 1763 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 1818.0 | 53.4 | 40.1 | 16.37 | 0.40 | 15 | 1724 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 2251.6 | 51.8 | 37.6 | 16.47 | 0.36 | 16 | 282 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1261.5 | 49.6 | 33.7 | 17.61 | 0.29 | 20 | 999 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 174.2 | 22.1 | 11.8 | 34.78 | 3.51 | 12 | 1394 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1227.8 | 53.1 | 35.5 | 16.74 | 0.31 | 21 | 75 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1242.7 | 54.9 | 44.2 | 16.79 | 0.31 | 19 | 2459 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1165.0 | 54.9 | 44.5 | 16.89 | 0.30 | 19 | 2327 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 978.1 | 49.1 | 31.9 | 17.81 | 0.33 | 16 | 2802 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 171.1 | 19.8 | 7.0 | 36.06 | 0.93 | 173 | 498 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 198.5 | 23.3 | 15.9 | 34.75 | 0.87 | 190 | 998 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 123.2 | 21.8 | 20.1 | 44.57 | 0.67 | 33 | 2568 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 97.5 | 17.9 | 14.3 | 52.61 | 0.74 | 26 | 889 |

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

Category: **Particles**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `1321.15`, min `16.32`, p50 `1370.22`, p95 `2082.70`, p99 `2407.27`, 1%low `46.53`, 0.1%low `27.29`, std `514.01`

**Frame time (ms)**  avg `1.54`, p50 `0.73`, p95 `4.14`, p99 `18.00`, p99.9 `26.68`, max `61.27`

**Client tick (ms)**  avg `0.98`, p95 `2.06`, max `8.03`

**Memory**  start `643 MB`, end `749 MB`, peak `1129 MB`, GC `71 events / 347 ms`

**FPS over sampling window (ASCII):**

```
1865.8 |                                                                      █         
1740.4 |                                                       █   ██    █   ██ █       
1615.0 |                                              █      █ █  ███ █ ██ ██████ ██    
1489.6 |                   █                          ██    ████  ██████████████████    
1364.3 |         █   █  █ ████    █     █       █  █████  █ ████████████████████████  █ 
1238.9 |         █   ██████████ █████ █ █    █████ █████  █████████████████████████████ 
1113.5 | ██     █████████████████████████    █████ █████ ███████████████████████████████
988.1 |███   █ ████████████████████████████████████████████████████████████████████████
862.7 |███  ███████████████████████████████████████████████████████████████████████████
737.3 |███  ███████████████████████████████████████████████████████████████████████████
611.9 |███ ████████████████████████████████████████████████████████████████████████████
486.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10180
   1 ms | ███████  1767
   2 ms | █  281
   3 ms |   119
   4 ms |   65
   5 ms |   32
   6 ms |   14
   7 ms |   20
   8 ms |   8
   9 ms |   4
  10 ms |   3
  11 ms |   2
  12 ms |   11
  13 ms |   47
  14 ms |   71
  15 ms |   81
  16 ms |   96
  17 ms |   78
  18 ms |   51
  19 ms |   33
  20 ms |   10
  21 ms |   12
  22 ms |   3
  23 ms |   2
  24 ms |   5
  25 ms |   1
  26 ms |   1
  27 ms |   2
  28 ms |   2
  30 ms |   1
  33 ms |   1
  34 ms |   2
  38 ms |   1
  40 ms |   1
  45 ms |   1
  46 ms |   1
  61 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 1626 | 947.1 | 19.76 |
| `portal` | 160 | 1626 | 1281.4 | 16.33 |
| `ALL_TOGETHER` | 1680 | 1626 | 1260.2 | 16.24 |
| `sculk_charge_pop` | 240 | 1626 | 1159.8 | 18.24 |
| `smoke` | 160 | 1626 | 1294.8 | 18.12 |
| `flame` | 160 | 1626 | 1514.2 | 17.45 |
| `dripping_water` | 240 | 1626 | 1644.4 | 17.67 |
| `dragon_breath` | 160 | 1626 | 1467.8 | 18.52 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `650.51`
- `fps_0p1pct_low` = `27.29`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `46.53`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `118.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1394.54`, min `26.58`, p50 `1427.03`, p95 `1967.68`, p99 `2057.13`, 1%low `56.66`, 0.1%low `44.55`, std `440.15`

**Frame time (ms)**  avg `1.32`, p50 `0.70`, p95 `2.13`, p99 `15.78`, p99.9 `19.16`, max `37.62`

**Client tick (ms)**  avg `0.82`, p95 `1.36`, max `1.92`

**Memory**  start `744 MB`, end `1065 MB`, peak `1508 MB`, GC `66 events / 324 ms`

**FPS over sampling window (ASCII):**

```
1583.1 |                            █   █                █     █                        
1534.2 |                   █        █ █ █        ██ █  █ █  ████                       █
1485.2 |       █           █   ████ █ ████ █     ██ ██ ████ ████                  █    █
1436.2 |    █  █           ██ ████████████ █ █   ██████████ ████    █  █  █    █ ██    █
1387.3 | █  █  █ █         ██ ██████████████ ██  ██████████ ████  ████ █  █  ███ ███   █
1338.3 |██ ██  ███████     █████████████████ ███ ██████████ █████ ████ █████████ █████ █
1289.3 |█████  ███████     █████████████████████ ████████████████ ████ ███████████████ █
1240.4 |██████ ████████   ███████████████████████████████████████ ████████████████████ █
1191.4 |███████████████ █ ███████████████████████████████████████ ████████████████████ █
1142.4 |███████████████ █ ██████████████████████████████████████████████████████████████
1093.5 |███████████████ ████████████████████████████████████████████████████████████████
1044.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13254
   1 ms | ███  1136
   2 ms | █  182
   3 ms |   14
   4 ms |   5
   5 ms |   3
   6 ms |   1
   7 ms |   4
   8 ms |   5
   9 ms |   4
  12 ms |   63
  13 ms |   147
  14 ms |   143
  15 ms |   97
  16 ms |   55
  17 ms |   48
  18 ms |   18
  19 ms |   9
  20 ms |   3
  21 ms |   3
  22 ms |   4
  24 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `760.15`
- `preload_duration_ms` = `48.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `56.66`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `44.55`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1199.74`, min `28.77`, p50 `1234.37`, p95 `1657.11`, p99 `1728.56`, 1%low `55.25`, 0.1%low `43.08`, std `374.14`

**Frame time (ms)**  avg `1.50`, p50 `0.81`, p95 `2.53`, p99 `16.29`, p99.9 `19.55`, max `34.76`

**Client tick (ms)**  avg `0.79`, p95 `1.27`, max `9.39`

**Memory**  start `1526 MB`, end `1486 MB`, peak `1668 MB`, GC `55 events / 321 ms`

**FPS over sampling window (ASCII):**

```
1411.8 |                               █                         █                      
1367.0 |                               █                         █                      
1322.1 |      █                        █    █ █  ██  █      █ ██ █   █     █         █  
1277.2 |    █ █             █ █     █ ███   █ █████ ██    ███ ██ █ █ █     █    █   ██  
1232.4 | █  ███    █        █ █  █  ██████  ███████ ███   ██████ █████    ██   ██   ██  
1187.5 | ██████ █  ██      ████ ██  ██████  ███████ ███   ██████ █████    ██   ███  ████
1142.7 | ██████ █ ████     ███████  ███████████████ █████ ██████ █████ ██ ██   ███ █████
1097.8 | ██████ █ ████ ██ ████████ ████████████████ ██████████████████ █████ █████ █████
1053.0 |█████████ ████████████████ █████████████████████████████████████████ █████ █████
1008.1 |██████████████████████████ ███████████████████████████████████████████████ █████
963.2 |██████████████████████████ █████████████████████████████████████████████████████
918.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10514
   1 ms | ████████  1983
   2 ms | █  196
   3 ms |   14
   4 ms |   8
   5 ms |   2
   6 ms |   2
   7 ms |   2
   8 ms |   4
   9 ms |   6
  11 ms |   1
  12 ms |   36
  13 ms |   128
  14 ms | █  149
  15 ms |   111
  16 ms |   57
  17 ms |   55
  18 ms |   27
  19 ms |   11
  21 ms |   3
  22 ms |   1
  23 ms |   3
  24 ms |   1
  25 ms |   1
  34 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `665.57`
- `preload_duration_ms` = `37.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `55.25`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `43.08`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `854.76`, min `42.83`, p50 `868.75`, p95 `1328.21`, p99 `1389.48`, 1%low `53.42`, 0.1%low `44.79`, std `321.09`

**Frame time (ms)**  avg `2.12`, p50 `1.15`, p95 `13.77`, p99 `17.40`, p99.9 `20.87`, max `23.35`

**Client tick (ms)**  avg `0.82`, p95 `1.10`, max `9.70`

**Memory**  start `1188 MB`, end `932 MB`, peak `1704 MB`, GC `53 events / 300 ms`

**FPS over sampling window (ASCII):**

```
1219.2 |        █ █                                                                     
1162.3 |█  █  █████                                                                     
1105.3 |██ █ ██████                                                                     
1048.4 |███████████                                                        █  █         
991.5 |████████████       █                               ██  █           █  █ ██    █ 
934.5 |████████████      ██                               ███ ██         ███ ████    █ 
877.6 |████████████      ███                              ██████    █  █████ ████    █ 
820.7 |██████████████ ██████           █        █  █      ██████ █████ █████ █████  ██ 
763.8 |██████████████ ██████  █  █ █  █████ █   ██ ██ ███ ████████████████████████ ███ 
706.8 |█████████████████████ ██  █ ███████████ ███ ███████████████████████████████ ████
649.9 |████████████████████████ ███████████████████████████████████████████████████████
593.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████████  3266
   1 ms | ████████████████████████████████████████  5062
   2 ms | ███  408
   3 ms | █  83
   4 ms |   5
   5 ms |   6
   8 ms |   1
   9 ms |   7
  10 ms |   4
  11 ms |   1
  12 ms |   28
  13 ms | █  108
  14 ms | █  140
  15 ms | █  110
  16 ms | █  86
  17 ms |   63
  18 ms |   30
  19 ms |   10
  20 ms |   5
  21 ms |   4
  22 ms |   4
  23 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `471.64`
- `preload_duration_ms` = `49.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `53.42`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `44.79`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `1367.60`, min `24.72`, p50 `1397.62`, p95 `1884.11`, p99 `1954.84`, 1%low `56.94`, 0.1%low `44.35`, std `416.30`

**Frame time (ms)**  avg `1.30`, p50 `0.72`, p95 `1.95`, p99 `15.87`, p99.9 `19.73`, max `40.45`

**Client tick (ms)**  avg `0.75`, p95 `1.18`, max `1.88`

**Memory**  start `1048 MB`, end `1066 MB`, peak `1758 MB`, GC `57 events / 327 ms`

**FPS over sampling window (ASCII):**

```
1569.0 |       █                                                                        
1526.6 |       █           █          █        █                                        
1484.3 |       █ █      ██ █        █ █  █    ██       █              █                 
1441.9 | ███   █ █      ██ █  █  █  ███  █    ██  █   ██        █     ██ █   ██         
1399.5 |████ █████     ███ █ ██████ ███  █   ███  ██ ████   █ █ █  █  ██ ██ ███    █    
1357.2 |████ █████     ███ █ ██████ ████ █   ███  ████████ ████ █  █  ██ ██ ███   ████  
1314.8 |████████████  ██████ ██████ ██████  █████ ████████ ████ █████ ██ ██ ███ █ ████  
1272.4 |████████████  ██████ █████████████ ████████████████████ █████ ██ ████████ █████ 
1230.1 |█████████████ ████████████████████ ██████████████████████████ ███████████ █████ 
1187.7 |█████████████ ███████████████████████████████████████████████ ███████████ ██████
1145.3 |█████████████ ██████████████████████████████████████████████████████████████████
1103.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13465
   1 ms | ████  1230
   2 ms |   153
   3 ms |   17
   4 ms |   4
   5 ms |   2
   6 ms |   2
   7 ms |   6
   8 ms |   3
   9 ms |   3
  10 ms |   2
  11 ms |   5
  12 ms |   44
  13 ms |   128
  14 ms |   144
  15 ms |   99
  16 ms |   60
  17 ms |   51
  18 ms |   13
  19 ms |   5
  20 ms |   9
  21 ms |   2
  24 ms |   1
  26 ms |   1
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `772.05`
- `preload_duration_ms` = `21.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `56.94`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `44.35`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `1368.94`, min `28.54`, p50 `1393.76`, p95 `1887.52`, p99 `1964.88`, 1%low `56.72`, 0.1%low `44.58`, std `408.27`

**Frame time (ms)**  avg `1.28`, p50 `0.72`, p95 `1.71`, p99 `15.89`, p99.9 `19.60`, max `35.04`

**Client tick (ms)**  avg `0.56`, p95 `0.82`, max `1.27`

**Memory**  start `1437 MB`, end `1202 MB`, peak `1875 MB`, GC `52 events / 330 ms`

**FPS over sampling window (ASCII):**

```
1600.8 |                                  █                                             
1553.9 |                                  █          ██                   █   █         
1507.0 |      █     █                    ██ █ █    █ ██ ██       █        █   █     █   
1460.1 |      █     ███   █ █            ███████   ████ ██  ██   ████     █   █ █   █ █ 
1413.2 |      █     ███   ███            ███████   ████ ██████ ██████     █  ██ ██  ████
1366.3 |      ██    ███   ███     ██     ███████ ██████ ██████ ██████  █  █  █████  ████
1319.4 |    ████    ████  ███  █ ███ ███ ███████ ██████ █████████████  ████ ██████  ████
1272.5 |█   ████   ██████ ███  █ ███████ ███████ ██████ █████████████  ████ ███████ ████
1225.7 |█   ██████ ██████ ███  █ ████████████████████████████████████  ████ ███████ ████
1178.8 |█ ██████████████████████ ███████████████████████████████████████████████████████
1131.9 |█ ██████████████████████████████████████████████████████████████████████████████
1085.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13676
   1 ms | ████  1306
   2 ms |   115
   3 ms |   2
   4 ms |   3
   5 ms |   3
   6 ms |   1
   8 ms |   2
   9 ms |   4
  10 ms |   1
  11 ms |   3
  12 ms |   48
  13 ms |   137
  14 ms |   129
  15 ms |   92
  16 ms |   72
  17 ms |   38
  18 ms |   20
  19 ms |   8
  20 ms |   4
  21 ms |   1
  22 ms |   4
  23 ms |   1
  24 ms |   1
  25 ms |   1
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `783.64`
- `preload_duration_ms` = `52.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `56.72`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `44.58`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1212.42`, min `42.98`, p50 `1235.57`, p95 `1695.08`, p99 `1763.29`, 1%low `57.00`, 0.1%low `47.38`, std `377.19`

**Frame time (ms)**  avg `1.44`, p50 `0.81`, p95 `2.32`, p99 `16.03`, p99.9 `19.14`, max `23.27`

**Client tick (ms)**  avg `0.78`, p95 `1.15`, max `8.98`

**Memory**  start `1232 MB`, end `1028 MB`, peak `1922 MB`, GC `51 events / 309 ms`

**FPS over sampling window (ASCII):**

```
1410.3 |                                          █                                     
1373.2 |                            █             █       █                             
1336.2 |                 █          █      █ █    █ █     █              █              
1299.1 |█  █             ██      █  ██     █ ██   █ █     █       █      █    █ █       
1262.1 |█ ██ █  █        ██████  █  ██     ████  █████  █ ███     █    █ ██   █ ██  █   
1225.0 |█ ██ ████    █ █ ██████  █ ███  ███████ ██████  █ ███    ███   █ ██ █ █ ██  █   
1187.9 |████ ████ █ ██ ████████ ██ ███  ███████ █████████████    ███  █████ ███ ██  █   
1150.9 |████ ██████ ██ ████████ ██ ████ ███████ █████████████    ███  █████ ██████  █   
1113.8 |███████████████████████ ███████████████ █████████████ █ ████ ██████ ██████  █ ██
1076.8 |███████████████████████ ████████████████████████████████████ ██████ ██████ ██ ██
1039.7 |███████████████████████████████████████████████████████████████████ ██████ █████
1002.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10903
   1 ms | ████████  2173
   2 ms | █  191
   3 ms |   10
   4 ms |   3
   5 ms |   4
   6 ms |   2
   7 ms |   1
   8 ms |   1
   9 ms |   4
  10 ms |   4
  11 ms |   2
  12 ms |   32
  13 ms | █  141
  14 ms | █  150
  15 ms |   97
  16 ms |   70
  17 ms |   37
  18 ms |   19
  19 ms |   7
  20 ms |   3
  21 ms |   2
  22 ms |   4
  23 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `692.78`
- `preload_duration_ms` = `37.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `57.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `47.38`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `676.18`, min `36.00`, p50 `694.64`, p95 `1002.17`, p99 `1062.42`, 1%low `52.94`, 0.1%low `42.96`, std `243.23`

**Frame time (ms)**  avg `2.48`, p50 `1.44`, p95 `14.21`, p99 `17.42`, p99.9 `20.69`, max `27.78`

**Client tick (ms)**  avg `1.20`, p95 `1.61`, max `2.14`

**Memory**  start `1867 MB`, end `921 MB`, peak `1940 MB`, GC `41 events / 270 ms`

**FPS over sampling window (ASCII):**

```
838.9 |                                 █ █                                          █ 
807.3 |                                 █ █                    █                     ██
775.7 |                                 █ ██            ██  █  █             █       ██
744.2 |  █    █   █                     █████    █     ███  █  █  █          █ ███  ███
712.6 |  █    █ █ █        █       ██ █ ██████   █     ████ █  ████  █     ███████ ████
681.0 |  █  ███ ████       █      ████████████   █     ████ █  ████ ███    ████████████
649.4 |  █ █████████      ███    █████████████  ██     ████ █ ██████████   ████████████
617.8 | ███████████████ █ █████  █████████████ ████   █████ ████████████   ████████████
586.2 |████████████████ ████████ ██████████████████   █████ ████████████   ████████████
554.6 |█████████████████████████ ██████████████████  ██████ █████████████  ████████████
523.1 |████████████████████████████████████████████████████ ██████████████ ████████████
491.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  422
   1 ms | ████████████████████████████████████████  6305
   2 ms | ████  576
   3 ms | █  158
   4 ms |   32
   5 ms |   3
   6 ms |   3
   7 ms |   6
   9 ms |   3
  10 ms |   3
  11 ms |   7
  12 ms |   14
  13 ms | █  109
  14 ms | █  121
  15 ms | █  118
  16 ms | █  81
  17 ms |   55
  18 ms |   30
  19 ms |   10
  20 ms |   5
  21 ms |   2
  22 ms |   1
  23 ms |   2
  25 ms |   1
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `403.39`
- `preload_duration_ms` = `33.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `52.94`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `42.96`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `1606.33`, min `26.19`, p50 `1658.66`, p95 `2217.65`, p99 `2303.48`, 1%low `54.14`, 0.1%low `38.38`, std `502.62`

**Frame time (ms)**  avg `1.22`, p50 `0.60`, p95 `3.83`, p99 `16.13`, p99.9 `21.16`, max `38.18`

**Client tick (ms)**  avg `3.16`, p95 `4.23`, max `8.50`

**Memory**  start `1613 MB`, end `1013 MB`, peak `1994 MB`, GC `44 events / 300 ms`

**FPS over sampling window (ASCII):**

```
1856.9 |                                   █                                            
1806.7 |                            █     ██                                            
1756.5 |                           ███   ████     █  ██       █ █                       
1706.4 |                         █ ████  ████     █████ █     █ █                       
1656.2 |█ █    █ █ █     █ █ ██  █ ████ ██████    █████████   ███             █   █     
1606.0 |█ █    ███ █   █ █ █ ██  ██████ ████████  █████████   ███       █     ███ █  ██ 
1555.8 |████ ███████ ███████ ███ ██████ ████████ ██████████  ████   ██ ██ █ █████ ██ ███
1505.6 |████ ███████████████ ██████████ ████████ ██████████ █████  ██████ ██████████ ███
1455.4 |████████████████████████████████████████ ██████████ ██████ ██████ ██████████████
1405.2 |████████████████████████████████████████ █████████████████ █████████████████████
1355.0 |████████████████████████████████████████ ███████████████████████████████████████
1304.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14953
   1 ms | ██  585
   2 ms |   28
   3 ms |   99
   4 ms |   156
   5 ms |   30
   6 ms |   2
   7 ms |   2
   8 ms |   4
   9 ms |   5
  10 ms |   4
  12 ms |   37
  13 ms |   161
  14 ms |   114
  15 ms |   92
  16 ms |   61
  17 ms |   43
  18 ms |   26
  19 ms |   16
  20 ms |   6
  21 ms |   6
  22 ms |   4
  23 ms |   2
  26 ms |   1
  27 ms |   1
  30 ms |   1
  34 ms |   1
  37 ms |   1
  38 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `821.44`
- `preload_duration_ms` = `49.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `54.14`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `38.38`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `231.39`, min `24.77`, p50 `251.33`, p95 `392.02`, p99 `449.64`, 1%low `30.77`, 0.1%low `25.16`, std `108.74`

**Frame time (ms)**  avg `6.73`, p50 `3.98`, p95 `19.31`, p99 `24.89`, p99.9 `37.84`, max `40.37`

**Client tick (ms)**  avg `4.06`, p95 `5.82`, max `14.68`

**Memory**  start `1558 MB`, end `1565 MB`, peak `2013 MB`, GC `27 events / 159 ms`

**FPS over sampling window (ASCII):**

```
355.5 |   █    █                                                                       
336.7 |  ██    █                                                                       
318.0 |█ ██ █  ██     █                                                                
299.2 |█ ████████    ██                                                                
280.5 |██████████   ███  █   █                                                         
261.7 |██████████ █████████ ██         █                                               
243.0 |████████████████████████  ██    █   █                      █                    
224.2 |█████████████████████████████   █  ███████              █  █     ███   █ ██ ████
205.5 |██████████████████████████████████████████      █ █   ████ █ █  ██████ █████████
186.7 |██████████████████████████████████████████ ██ ███ █   ████████████████ █████████
168.0 |█████████████████████████████████████████████████ ██████████████████████████████
149.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███████████████████  490
   3 ms | ████████████████████████████████████████  1013
   4 ms | ██████████████████████  547
   5 ms | ██████  147
   6 ms | ██  38
   7 ms | ██  50
   8 ms | ██  43
   9 ms | █  33
  10 ms | █  23
  11 ms |   12
  12 ms | █  19
  13 ms | ██  53
  14 ms | ████  91
  15 ms | ███  74
  16 ms | ██  62
  17 ms | ██  56
  18 ms | ██  52
  19 ms | ██  45
  20 ms | █  29
  21 ms | █  21
  22 ms | █  20
  23 ms | █  13
  24 ms |   11
  25 ms |   6
  26 ms |   1
  30 ms |   2
  31 ms |   2
  32 ms |   2
  33 ms |   4
  34 ms |   1
  35 ms |   3
  36 ms |   2
  37 ms |   3
  39 ms |   2
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `25.16`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `48.00`
- `fps_harmonic_avg` = `148.53`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `30.77`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `769.38`, min `25.60`, p50 `806.21`, p95 `1095.54`, p99 `1150.73`, 1%low `51.28`, 0.1%low `35.09`, std `261.03`

**Frame time (ms)**  avg `2.21`, p50 `1.24`, p95 `13.85`, p99 `17.08`, p99.9 `22.51`, max `39.07`

**Client tick (ms)**  avg `1.01`, p95 `1.32`, max `9.75`

**Memory**  start `1573 MB`, end `1238 MB`, peak `1892 MB`, GC `53 events / 337 ms`

**FPS over sampling window (ASCII):**

```
891.0 |       █                                                                        
867.3 |  █    █           █                                  █                         
843.5 |  █    █       █   █        █   █  █                █ █ █         █       █     
819.8 | ██   ██       █   █     █  █  ██  █           ████ █ █ █         █      ██     
796.1 | ██   ███      █ █ █ ██ ███ █  ███ █  █        ████ █ ███       █ █   █████   ██
772.3 | ████ ███   █  █████ ██ ███ █  █████  ██   █  █████ █████     █ ███ █ █████   ██
748.6 | ████ ███ █ █  █████ ██ ████████████  ██ █ █ ██████ █████  █  █ █████ █████   ██
724.8 |█████████ █ █ ██████ ██ ████████████  ██ ███ ██████ ████████ ██ ███████████  ███
701.1 |█████████████ ██████ ███████████████████ ███ ██████ ████████ ██ ████████████████
677.3 |████████████████████████████████████████ ██████████ ████████ ██ ████████████████
653.6 |████████████████████████████████████████ ██████████████████████ ████████████████
629.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████  1641
   1 ms | ████████████████████████████████████████  6235
   2 ms | ███  482
   3 ms | █  83
   4 ms |   7
   5 ms |   3
   6 ms |   2
   7 ms |   2
   8 ms |   4
   9 ms |   6
  10 ms |   3
  11 ms |   3
  12 ms |   7
  13 ms | █  125
  14 ms | █  149
  15 ms | █  109
  16 ms |   75
  17 ms |   44
  18 ms |   19
  19 ms |   8
  20 ms |   7
  21 ms |   4
  22 ms |   4
  24 ms |   2
  25 ms |   2
  27 ms |   1
  29 ms |   1
  37 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `21.00`
- `fps_1pct_low` = `51.28`
- `fps_harmonic_avg` = `451.51`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `35.09`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `678.57`, min `24.85`, p50 `708.04`, p95 `974.05`, p99 `1033.85`, 1%low `53.22`, 0.1%low `39.24`, std `233.07`

**Frame time (ms)**  avg `2.42`, p50 `1.41`, p95 `13.79`, p99 `16.93`, p99.9 `20.62`, max `40.25`

**Client tick (ms)**  avg `0.53`, p95 `0.74`, max `1.18`

**Memory**  start `1275 MB`, end `1594 MB`, peak `1961 MB`, GC `45 events / 282 ms`

**FPS over sampling window (ASCII):**

```
809.7 |█       █                             █                    █                    
776.7 |███     █                          █  ██ █ █           ██  ██                █  
743.8 |████ ████                         ██ ████████  ██      ███ ██ █  █ █      ██ █  
710.9 |█████████                       ████ ████████ ████    ███████ █ ██ ██ █ ████ ███
678.0 |█████████                 █    ██████████████ █████   ███████ ███████ ██████████
645.0 |██████████                █    ██████████████ █████ █████████ ██████████████████
612.1 |██████████     ███        █    ████████████████████ █████████ ██████████████████
579.2 |██████████ █  █████   ██ ███   █████████████████████████████████████████████████
546.2 |██████████ █  █████  ███████   █████████████████████████████████████████████████
513.3 |████████████ ███████████████  ██████████████████████████████████████████████████
480.4 |████████████ ████████████████ ██████████████████████████████████████████████████
447.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  224
   1 ms | ████████████████████████████████████████  6722
   2 ms | ████  683
   3 ms |   64
   4 ms |   6
   5 ms |   4
   6 ms |   1
   7 ms |   1
   8 ms |   1
   9 ms |   5
  10 ms |   2
  12 ms |   29
  13 ms | █  154
  14 ms | █  137
  15 ms | █  95
  16 ms |   69
  17 ms |   42
  18 ms |   17
  19 ms |   8
  20 ms |   5
  21 ms |   2
  22 ms |   2
  23 ms |   1
  24 ms |   1
  27 ms |   1
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `39.24`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `42.00`
- `fps_harmonic_avg` = `413.88`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `53.22`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `710.19`, min `23.20`, p50 `738.65`, p95 `1129.41`, p99 `1285.68`, 1%low `43.24`, 0.1%low `27.00`, std `300.91`

**Frame time (ms)**  avg `2.67`, p50 `1.35`, p95 `14.12`, p99 `18.95`, p99.9 `31.99`, max `43.10`

**Client tick (ms)**  avg `3.86`, p95 `6.31`, max `13.50`

**Memory**  start `1834 MB`, end `1079 MB`, peak `2006 MB`, GC `31 events / 183 ms`

**FPS over sampling window (ASCII):**

```
1135.2 |                                                                              ██
1066.0 |                                                                       █   █ ███
996.8 |                                                        ██           █ █  ██████
927.6 |                                                      ████      █    ███████████
858.4 |                                █                 ████████     ██   ████████████
789.3 |                      █        ███              ██████████     █████████████████
720.1 |                      █  █    ████          ██████████████     █████████████████
650.9 |█      █          ██████ ██ ██████ █       ██████████████████  █████████████████
581.7 |█      █     ██   ██████ ██████████████ █ ███████████████████ ██████████████████
512.5 |█     ██  ██ ███████████████████████████████████████████████████████████████████
443.4 |██   ███ ███████████████████████████████████████████████████████████████████████
374.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████  1268
   1 ms | ████████████████████████████████████████  4678
   2 ms | ██████  665
   3 ms | █  81
   4 ms |   58
   5 ms |   47
   6 ms |   36
   7 ms |   23
   8 ms |   19
   9 ms |   4
  10 ms |   6
  11 ms |   3
  12 ms |   50
  13 ms | █  150
  14 ms | █  115
  15 ms | █  75
  16 ms | █  62
  17 ms |   35
  18 ms |   28
  19 ms |   30
  20 ms |   17
  21 ms |   1
  22 ms |   5
  23 ms |   1
  24 ms |   3
  27 ms |   3
  28 ms |   1
  29 ms |   2
  30 ms |   2
  31 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   2
  35 ms |   1
  36 ms |   1
  40 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `27.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `123.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `374.09`
- `fps_1pct_low` = `43.24`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.15`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `767.94`, min `21.88`, p50 `789.47`, p95 `1334.76`, p99 `1385.26`, 1%low `42.88`, 0.1%low `26.58`, std `381.03`

**Frame time (ms)**  avg `2.86`, p50 `1.27`, p95 `15.79`, p99 `19.89`, p99.9 `27.06`, max `45.71`

**Client tick (ms)**  avg `3.12`, p95 `5.68`, max `11.61`

**Memory**  start `1074 MB`, end `1551 MB`, peak `2041 MB`, GC `29 events / 168 ms`

**FPS over sampling window (ASCII):**

```
1244.0 |                     █                                          █               
1158.2 |                    ██  █ █                                     █ █         █   
1072.3 |                   ████████                                    ████     █ ███   
986.5 |                  ███████████                                  ██████████████   
900.6 |                  ███████████     ██                          ███████████████ ██
814.8 |                  ████████████  ████           █              ██████████████████
728.9 |                █ ████████████████████    █  ███         ███████████████████████
643.1 |              ██████████████████████████████████    ███  ███████████████████████
557.2 |            █ ███████████████████████████████████  █████████████████████████████
471.4 |          ████████████████████████████████████████ █████████████████████████████
385.5 |██   █  ████████████████████████████████████████████████████████████████████████
299.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████  2116
   1 ms | ████████████████████████████████████████  3106
   2 ms | ██████████  745
   3 ms | ██  167
   4 ms | █  103
   5 ms | █  78
   6 ms |   37
   7 ms |   24
   8 ms |   10
   9 ms |   10
  10 ms |   5
  11 ms |   3
  12 ms |   12
  13 ms | █  69
  14 ms | █  76
  15 ms | █  102
  16 ms | █  91
  17 ms | █  79
  18 ms | █  57
  19 ms | █  43
  20 ms |   23
  21 ms |   12
  22 ms |   9
  23 ms |   5
  24 ms |   6
  25 ms |   2
  27 ms |   1
  28 ms |   1
  33 ms |   2
  36 ms |   1
  41 ms |   1
  44 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `26.58`
- `preset_long` = `0.00`
- `preload_duration_ms` = `46.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `349.89`
- `fps_1pct_low` = `42.88`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.51`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `1215.82`, min `19.02`, p50 `1153.55`, p95 `2495.39`, p99 `3476.78`, 1%low `24.43`, 0.1%low `19.74`, std `931.54`

**Frame time (ms)**  avg `4.43`, p50 `0.87`, p95 `22.98`, p99 `34.89`, p99.9 `49.00`, max `52.59`

**Client tick (ms)**  avg `14.21`, p95 `20.13`, max `33.67`

**Memory**  start `1662 MB`, end `1254 MB`, peak `2047 MB`, GC `23 events / 112 ms`

**FPS over sampling window (ASCII):**

```
3088.7 |                                                                              █ 
2817.2 |                                                                              ██
2545.7 |                                                                             ███
2274.2 |                                                                     ██      ███
2002.7 |                     █    ██          ███    ██            ███     ██████    ███
1731.2 |                █    ██   ███    █    ████   ███   ███    █████    ██████    ███
1459.6 |        █   █   ██   ██   ███   ███   ████   ███   ████   ██████   ███████   ███
1188.1 |        █   █   ██   ███  ████  ███  █████   ███   ████   ██████   ███████   ███
916.6 |███     ██  ██  ███  ███  ████  ███  ██████  ████  ████  ███████   ███████   ███
645.1 |███  █  ██ ███  ███  ███  ████  ████ ██████ █████ ██████ ████████ █████████  ███
373.6 |███  ██ ██ ████ ███ ███████████ ████ ███████████████████ ████████ ██████████ ███
102.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  2486
   1 ms | ████████  522
   2 ms | ███  188
   3 ms | ███  166
   4 ms | ████  255
   5 ms | ███  158
   6 ms |   17
   7 ms |   1
   8 ms |   8
   9 ms |   6
  10 ms |   5
  11 ms |   3
  12 ms |   31
  13 ms | ██  99
  14 ms | █  70
  15 ms | █  48
  16 ms | █  58
  17 ms | █  54
  18 ms | █  35
  19 ms |   23
  20 ms |   23
  21 ms |   17
  22 ms |   17
  23 ms | █  36
  24 ms |   27
  25 ms |   17
  26 ms |   14
  27 ms |   12
  28 ms |   16
  29 ms |   13
  30 ms |   7
  31 ms |   10
  32 ms |   8
  33 ms |   13
  34 ms |   7
  35 ms |   7
  36 ms |   5
  37 ms |   5
  38 ms |   6
  39 ms |   2
  40 ms |   2
  41 ms |   3
  42 ms |   1
  43 ms |   1
  44 ms |   2
  45 ms |   2
  46 ms |   2
  47 ms |   1
  48 ms |   1
  49 ms |   3
  51 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `225.75`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `19.74`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4808.46`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `24.43`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `68.00`
- `falling_blocks_landed` = `20800.00`
- `preset_quick` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1115.60`, min `19.55`, p50 `1076.26`, p95 `2539.59`, p99 `2873.05`, 1%low `23.21`, 0.1%low `19.95`, std `903.03`

**Frame time (ms)**  avg `5.75`, p50 `0.93`, p95 `28.13`, p99 `38.93`, p99.9 `48.69`, max `51.14`

**Client tick (ms)**  avg `14.46`, p95 `20.11`, max `35.96`

**Memory**  start `1657 MB`, end `1723 MB`, peak `2023 MB`, GC `20 events / 104 ms`

**FPS over sampling window (ASCII):**

```
2587.8 |                                                                    █           
2359.4 |                                                                    █  █ █     █
2131.0 |                                            █             ███      ███████    ██
1902.6 |                                            ███    ███    ████     ███████    ██
1674.2 |                                █    ██    █████   ███    █████    ███████    ██
1445.8 |  █               █        █    ██   ███   █████   ████  ██████    ████████   ██
1217.4 |  ██          █   █    █  ███   ██   ███   █████   ████  ███████   ████████   ██
989.0 |█████         ██  ██   █  ████  ███  ███  ██████   ████  ███████   ████████   ██
760.6 |█████     █   ██  ██   █  ████  ███  ███  ██████  █████  ███████   █████████  ██
532.2 |██████    █  ███  ███ ██  ████ ████  ████ ███████ ██████ ████████  █████████  ██
303.8 |██████ ██ ██ ████ ███ ███ ████ █████ ████ ███████ ██████ ████████ ██████████ ███
 75.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1793
   1 ms | █████████  411
   2 ms | ███  134
   3 ms | ██  78
   4 ms | █  56
   5 ms | █  46
   6 ms | ██  75
   7 ms | ████  158
   8 ms | █  41
   9 ms |   14
  10 ms |   12
  11 ms |   1
  12 ms |   21
  13 ms | █  55
  14 ms | █  59
  15 ms | █  42
  16 ms | █  59
  17 ms | █  43
  18 ms | █  31
  19 ms | █  36
  20 ms | █  28
  21 ms | █  23
  22 ms |   13
  23 ms |   17
  24 ms |   8
  25 ms |   11
  26 ms | █  25
  27 ms |   13
  28 ms |   18
  29 ms |   12
  30 ms |   13
  31 ms |   14
  32 ms |   15
  33 ms |   15
  34 ms |   13
  35 ms |   14
  36 ms |   9
  37 ms |   10
  38 ms |   11
  39 ms |   10
  40 ms |   4
  41 ms |   2
  42 ms |   4
  43 ms |   3
  44 ms |   1
  45 ms |   3
  46 ms |   2
  48 ms |   2
  49 ms |   3
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `174.02`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `19.95`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4802.27`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `23.21`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `6.00`
- `falling_blocks_landed` = `32678.00`
- `preset_quick` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1670.84`, min `20.37`, p50 `1820.45`, p95 `2802.31`, p99 `3017.54`, 1%low `48.52`, 0.1%low `31.64`, std `762.75`

**Frame time (ms)**  avg `1.44`, p50 `0.55`, p95 `4.45`, p99 `17.69`, p99.9 `24.12`, max `49.10`

**Client tick (ms)**  avg `2.20`, p95 `3.37`, max `13.29`

**Memory**  start `1903 MB`, end `1167 MB`, peak `2040 MB`, GC `40 events / 281 ms`

**FPS over sampling window (ASCII):**

```
2453.0 |                                                                          █   ██
2272.6 |                                            █     █  █                ██ ██   ██
2092.1 |                                        ██  ██████████ ████    █     ███████ ███
1911.7 |                                       ███████████████ ██████████  █████████████
1731.3 |   ██                         █    ███████████████████ █████████████████████████
1550.9 |██ ██                 ███ █████ ████████████████████████████████████████████████
1370.5 |██████               ███████████████████████████████████████████████████████████
1190.1 |██████             █ ███████████████████████████████████████████████████████████
1009.7 |██████            ██████████████████████████████████████████████████████████████
829.3 |███████        █████████████████████████████████████████████████████████████████
648.9 |████████  ███  █████████████████████████████████████████████████████████████████
468.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10861
   1 ms | ███████  1797
   2 ms | █  360
   3 ms | █  144
   4 ms |   83
   5 ms |   42
   6 ms |   12
   7 ms |   8
   8 ms |   12
   9 ms |   3
  10 ms |   11
  11 ms |   5
  12 ms |   23
  13 ms |   62
  14 ms |   103
  15 ms |   95
  16 ms |   89
  17 ms |   63
  18 ms |   45
  19 ms |   35
  20 ms |   11
  21 ms |   12
  22 ms |   4
  23 ms |   2
  24 ms |   3
  25 ms |   5
  28 ms |   2
  29 ms |   1
  33 ms |   1
  46 ms |   1
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `694.85`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `31.64`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `620.34`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `48.52`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `29.00`
- `falling_blocks_landed` = `3185.00`
- `preset_quick` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `1616.43`, min `27.31`, p50 `1680.32`, p95 `2816.62`, p99 `3039.03`, 1%low `52.17`, 0.1%low `40.01`, std `772.55`

**Frame time (ms)**  avg `1.41`, p50 `0.60`, p95 `3.59`, p99 `17.22`, p99.9 `21.42`, max `36.62`

**Client tick (ms)**  avg `1.99`, p95 `2.93`, max `14.19`

**Memory**  start `1225 MB`, end `1645 MB`, peak `2098 MB`, GC `45 events / 301 ms`

**FPS over sampling window (ASCII):**

```
2438.1 |                                                                         █ ████ 
2265.1 | █                                                           █ ██    █  ████████
2092.1 |███   █                                  █    █  █       █  ██████████  ████████
1919.1 |████  █                                  ███████ █ █  █ ███ ███████████ ████████
1746.1 |███████                               ██ ██████████████████ ████████████████████
1573.1 |████████                            ████████████████████████████████████████████
1400.0 |████████                           █████████████████████████████████████████████
1227.0 |████████                  █ ████ █ █████████████████████████████████████████████
1054.0 |█████████             █  ███████ ███████████████████████████████████████████████
881.0 |██████████           ███████████████████████████████████████████████████████████
708.0 |█████████████   █ ██████████████████████████████████████████████████████████████
535.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10610
   1 ms | █████████  2468
   2 ms | █  283
   3 ms | █  144
   4 ms |   59
   5 ms |   18
   6 ms |   6
   7 ms |   2
   9 ms |   2
  10 ms |   1
  11 ms |   4
  12 ms |   6
  13 ms |   70
  14 ms |   115
  15 ms |   120
  16 ms |   93
  17 ms |   64
  18 ms |   46
  19 ms |   19
  20 ms |   11
  21 ms |   4
  22 ms |   6
  23 ms |   2
  24 ms |   2
  25 ms |   1
  26 ms |   1
  28 ms |   1
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `707.98`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `40.01`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `52.17`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `13.00`
- `falling_blocks_landed` = `3136.00`
- `preset_quick` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `915.27`, min `31.46`, p50 `937.46`, p95 `1377.12`, p99 `1589.23`, 1%low `53.32`, 0.1%low `41.88`, std `319.53`

**Frame time (ms)**  avg `1.90`, p50 `1.07`, p95 `13.09`, p99 `17.11`, p99.9 `20.47`, max `31.79`

**Client tick (ms)**  avg `0.70`, p95 `0.99`, max `1.60`

**Memory**  start `1623 MB`, end `1168 MB`, peak `2165 MB`, GC `45 events / 297 ms`

**FPS over sampling window (ASCII):**

```
1301.4 |█                                                                               
1241.1 |█  ██    █                                                                      
1180.7 |█  ██ █  ██                                                                    █
1120.3 |██ ██ █  ██                                                              █     █
1059.9 |██ █████████    █                                                      ███   ███
999.5 |█████████████ █ █                                                     ████  ████
939.2 |█████████████████  ██    █            █       ███          █         █████  ████
878.8 |██████████████████ ███ ███   █   █   ███ ██   ███  █ █   ███ █ ████  ██████ ████
818.4 |██████████████████ ████████  █████   ██████   ██████ ███████ ██████  ███████████
758.0 |███████████████████████████ ███████  ███████████████████████ ██████ ████████████
697.7 |███████████████████████████ ███████  ███████████████████████████████████████████
637.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████████████████  4393
   1 ms | ████████████████████████████████████████  5243
   2 ms | ██  307
   3 ms |   22
   4 ms |   7
   5 ms |   5
   6 ms |   1
   7 ms |   1
   8 ms |   2
   9 ms |   2
  10 ms |   6
  11 ms |   6
  12 ms |   18
  13 ms | █  117
  14 ms | █  143
  15 ms | █  91
  16 ms | █  72
  17 ms |   56
  18 ms |   30
  19 ms |   11
  20 ms |   7
  22 ms |   3
  23 ms |   2
  24 ms |   1
  29 ms |   1
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `53.32`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `527.36`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `41.88`
- `seed` = `5099.00`
- `preload_duration_ms` = `57.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `2317.40`, min `38.10`, p50 `2378.03`, p95 `3141.31`, p99 `3261.28`, 1%low `57.59`, 0.1%low `48.34`, std `661.00`

**Frame time (ms)**  avg `0.84`, p50 `0.42`, p95 `0.98`, p99 `15.86`, p99.9 `19.33`, max `26.25`

**Client tick (ms)**  avg `0.31`, p95 `0.45`, max `0.84`

**Memory**  start `930 MB`, end `1091 MB`, peak `2215 MB`, GC `45 events / 298 ms`

**FPS over sampling window (ASCII):**

```
2562.5 |          █ █         ██  █                                                    █
2492.5 |         ████ ██      ███ █ █       █  █            █ █ █                      █
2422.4 |█ ██     ████ ██ █   ████████  ██ ██████    █      ███████    █ █             ██
2352.4 |█ ████   ████ ██ █  █████████  █████████    ██     ███████   ██ █     █ █     ██
2282.3 |████████ ████ ████  █████████  █████████  █ █████  ███████   ██ █    ████    ███
2212.3 |████████ ██████████ █████████ ██████████ █████████ ███████   █████   █████  ████
2142.3 |████████ ██████████ █████████ ██████████ █████████ ███████  ██████  ██████ █████
2072.2 |████████ ██████████ █████████ ████████████████████ ████████ ███████ ██████ █████
2002.2 |████████ ██████████ █████████ ████████████████████ ████████ ███████ ██████ █████
1932.2 |███████████████████ █████████ ████████████████████ ███████████████████████ █████
1862.1 |██████████████████████████████████████████████████████████████████████████ █████
1792.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19982
   1 ms | █  397
   2 ms |   74
   3 ms |   26
   4 ms |   7
   5 ms |   1
   7 ms |   1
   8 ms |   3
   9 ms |   1
  10 ms |   1
  11 ms |   4
  12 ms |   6
  13 ms |   44
  14 ms |   132
  15 ms |   121
  16 ms |   108
  17 ms |   36
  18 ms |   24
  19 ms |   19
  20 ms |   8
  21 ms |   2
  22 ms |   2
  26 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `49.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `57.59`
- `fps_harmonic_avg` = `1193.27`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `48.34`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `2124.07`, min `26.32`, p50 `2171.96`, p95 `2988.40`, p99 `3139.06`, 1%low `54.64`, 0.1%low `44.73`, std `634.94`

**Frame time (ms)**  avg `0.93`, p50 `0.46`, p95 `1.26`, p99 `16.57`, p99.9 `20.19`, max `37.99`

**Client tick (ms)**  avg `0.31`, p95 `0.47`, max `1.20`

**Memory**  start `1337 MB`, end `1728 MB`, peak `2293 MB`, GC `41 events / 299 ms`

**FPS over sampling window (ASCII):**

```
2424.4 |                                                                █               
2361.9 |    █                           █ █                 █  █    ██  █               
2299.3 |    █       █             █   █ █ ██              █ █████  ███  █    █          
2236.8 |    █       █             ██  █ ████     █    ██  ███████  ███  █  ███    █     
2174.3 | █ ███     ███ █         ███  ██████     █ ██ ███ ███████  ███  █  ███    ██ █  
2111.8 | █ ███     ███ █    █  ██████ ██████     ████████ ███████  ████ █ ████  █ ██ █ █
2049.2 | █ ███  █  ███ █    █  ██████ ███████ ██ ████████ ████████ ████ █████████ ████ █
1986.7 |██████ ██ ████ █    █ ███████████████ ██ ████████ ████████ ██████████████ ████ █
1924.2 |██████ █████████ █ ██████████████████ ██ ████████ ████████ ██████████████ ████ █
1861.7 |████████████████ █ █████████████████████ ███████████████████████████████████████
1799.2 |██████████████████ █████████████████████████████████████████████████████████████
1736.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19713
   1 ms | █  513
   2 ms |   150
   3 ms |   56
   4 ms |   8
   5 ms |   5
   6 ms |   1
   7 ms |   1
   9 ms |   2
  10 ms |   3
  11 ms |   2
  12 ms |   5
  13 ms |   42
  14 ms |   92
  15 ms |   132
  16 ms |   104
  17 ms |   76
  18 ms |   48
  19 ms |   23
  20 ms |   12
  21 ms |   7
  22 ms |   2
  23 ms |   1
  28 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `1073.40`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `54.64`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2240.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `44.73`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `2042.42`, min `34.85`, p50 `2243.04`, p95 `3045.98`, p99 `3166.10`, 1%low `55.68`, 0.1%low `45.88`, std `847.25`

**Frame time (ms)**  avg `1.19`, p50 `0.45`, p95 `3.01`, p99 `16.38`, p99.9 `19.69`, max `28.69`

**Client tick (ms)**  avg `0.38`, p95 `0.51`, max `9.86`

**Memory**  start `1593 MB`, end `1205 MB`, peak `2337 MB`, GC `41 events / 283 ms`

**FPS over sampling window (ASCII):**

```
2494.6 |     █ █                                                                        
2417.5 |     █ █ █                    █  █                                    █ █       
2340.5 |     █ █ █                    █  █  █    █ █     █   █        █       █ █       
2263.4 |█    █ █ █    █     █  █    █ █  █  █    █ █     █ █ █        █    █  █ █   █   
2186.4 |█    █ █ █  █ █     █  █ █  █ █  █  █    █ █  █  █ █ █     █  █    █  █ █   █  █
2109.4 |█ █ ████ █  █ █   █ ██ █ █  █ █  █  █  █ █ █  █  █ ███     █  █   ██  █ █   █  █
2032.3 |█ █ ████ █ ██ █   █ ██ █ █  ████ █████ █ ███  █  █ ████    █  █ █ ███ █ █   █  █
1955.3 |█ ████████ ████   █ ████ █  ████ █████ █ ████ ██ █ ████ █  ██ ███ ███ ███  ██  █
1878.2 |█ ████████ ████   ████████  ██████████ ██████ ██ ██████ █  ██ ███████████  ███ █
1801.2 |█ █████████████ █ ████████ ██████████████████ ███████████████ ███████████  █████
1724.2 |██████████████████████████ ██████████████████████████████████████████████ ██████
1647.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14099
   1 ms | ███  1066
   2 ms | ██  837
   3 ms | █  253
   4 ms |   17
   5 ms |   4
   6 ms |   2
   8 ms |   1
   9 ms |   1
  10 ms |   1
  11 ms |   4
  12 ms |   6
  13 ms |   72
  14 ms |   153
  15 ms |   135
  16 ms |   92
  17 ms |   52
  18 ms |   28
  19 ms |   18
  20 ms |   2
  21 ms |   7
  22 ms |   2
  27 ms |   1
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `55.68`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `841.69`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `45.88`
- `seed` = `4027.00`
- `preload_duration_ms` = `7.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `1979.81`, min `40.91`, p50 `2016.73`, p95 `2806.34`, p99 `3049.19`, 1%low `55.65`, 0.1%low `47.18`, std `601.72`

**Frame time (ms)**  avg `0.99`, p50 `0.50`, p95 `1.30`, p99 `16.40`, p99.9 `19.65`, max `24.45`

**Client tick (ms)**  avg `0.33`, p95 `0.46`, max `0.80`

**Memory**  start `1508 MB`, end `1224 MB`, peak `2380 MB`, GC `40 events / 266 ms`

**FPS over sampling window (ASCII):**

```
2487.3 |                                                                     █          
2402.2 |                                                                    ██  █       
2317.0 |                                                                    ██████   ██ 
2231.9 | █                                                                 ███████   ██ 
2146.8 | ██                            █     ██            █  █       █ █  ███████  ████
2061.6 | ██ ██  █                      █     ██    █   █   █ ██      ████  ████████ ████
1976.5 |███████ █      ██          █  ██  █████   ██████  ██████     █████ ████████ ████
1891.3 |████████████   ██   █   ██ ██ █████████   ██████ ████████ ██ █████ █████████████
1806.2 |████████████   ███ ██  ██████ ██████████  ██████ ████████ ██ ███████████████████
1721.1 |████████████ █████ ██████████████████████████████████████ ██████████████████████
1635.9 |████████████ ███████████████████████████████████████████████████████████████████
1550.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18833
   1 ms | █  686
   2 ms |   113
   3 ms |   35
   4 ms |   6
   5 ms |   2
   6 ms |   2
   7 ms |   1
   8 ms |   3
   9 ms |   3
  10 ms |   8
  11 ms |   2
  12 ms |   3
  13 ms |   62
  14 ms |   129
  15 ms |   121
  16 ms |   105
  17 ms |   72
  18 ms |   37
  19 ms |   22
  20 ms |   8
  21 ms |   3
  22 ms |   2
  23 ms |   1
  24 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `1013.14`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `55.65`
- `fps_0p1pct_low` = `47.18`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `21.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `2154.48`, min `41.06`, p50 `2261.28`, p95 `3066.92`, p99 `3193.04`, 1%low `58.04`, 0.1%low `46.63`, std `724.18`

**Frame time (ms)**  avg `0.92`, p50 `0.44`, p95 `1.35`, p99 `14.90`, p99.9 `19.18`, max `24.35`

**Client tick (ms)**  avg `0.37`, p95 `0.59`, max `2.89`

**Memory**  start `1735 MB`, end `1880 MB`, peak `2417 MB`, GC `36 events / 233 ms`

**FPS over sampling window (ASCII):**

```
2707.8 |           █                                                                    
2593.3 | █         █    █                                                               
2478.9 | ██        ██ █ ██ ██   ██    █                                                 
2364.4 | ███     █ ████ ██ ██   ███   █   ██   █                                        
2250.0 |████  █ █████████████  ████ █ ██ ████  ██        ███   ██   █   █       █     █ 
2135.5 |████  █ ███████████████████ █████████ ████  █ ██ ███   ██  ██   █ ████  █    ██ 
2021.1 |████  ████████████████████████████████████ █████████  ███ ███  ███████  ██  ███ 
1906.7 |████  ██████████████████████████████████████████████ ████ ███  ███████  ███ ████
1792.2 |████  ███████████████████████████████████████████████████ ███  ████████████ ████
1677.8 |████ ████████████████████████████████████████████████████ ███ █████████████ ████
1563.3 |█████████████████████████████████████████████████████████████ █████████████ ████
1448.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19415
   1 ms | ██  820
   2 ms |   142
   3 ms |   19
   4 ms |   12
   5 ms |   2
   6 ms |   2
   7 ms |   1
   8 ms |   3
   9 ms |   5
  10 ms |   2
  11 ms |   2
  12 ms |   50
  13 ms |   196
  14 ms |   127
  15 ms |   58
  16 ms |   44
  17 ms |   38
  18 ms |   37
  19 ms |   8
  20 ms |   6
  21 ms |   4
  22 ms |   2
  23 ms |   4
  24 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `fps_1pct_low` = `58.04`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `58.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `1083.24`
- `part` = `1.00`
- `fps_0p1pct_low` = `46.63`
- `seed` = `7411.00`
- `preload_duration_ms` = `57.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23659 ms  |  Sample ticks: 400

**FPS**  avg `1693.63`, min `19.16`, p50 `1727.81`, p95 `2702.89`, p99 `2988.04`, 1%low `52.28`, 0.1%low `36.31`, std `635.63`

**Frame time (ms)**  avg `1.21`, p50 `0.58`, p95 `2.23`, p99 `16.71`, p99.9 `21.59`, max `52.18`

**Client tick (ms)**  avg `0.40`, p95 `0.61`, max `3.01`

**Memory**  start `1948 MB`, end `2691 MB`, peak `2735 MB`, GC `40 events / 335 ms`

**FPS over sampling window (ASCII):**

```
2329.6 |      █                                                                         
2231.3 |█ █   █                                                                         
2133.1 |████████  █    █                                                                
2034.8 |████████  █ █████                                                               
1936.5 |████████  █ █████  █    █ █ █      █                                            
1838.2 |███████████ █████  █ █ ██████    █ █                                            
1739.9 |███████████ █████ ██ ██████████  ███    █   █        █                          
1641.6 |█████████████████ ███████████████████ ████ ██      ███                          
1543.3 |███████████████████████████████████████████████  ███████ ███   ██     █         
1445.0 |███████████████████████████████████████████████ ███████████████████ █ ██████  █ 
1346.8 |███████████████████████████████████████████████ ████████████████████████████████
1248.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14375
   1 ms | ███  1186
   2 ms | █  211
   3 ms |   58
   4 ms |   32
   5 ms |   6
   6 ms |   3
   7 ms |   6
   8 ms |   5
   9 ms |   3
  10 ms |   9
  11 ms |   2
  12 ms |   14
  13 ms |   133
  14 ms |   131
  15 ms |   89
  16 ms |   57
  17 ms |   58
  18 ms |   39
  19 ms |   24
  20 ms |   9
  21 ms |   7
  22 ms |   1
  23 ms |   2
  24 ms |   3
  26 ms |   2
  28 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   1
  52 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `fps_1pct_low` = `52.28`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `823.14`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.31`
- `seed` = `7417.00`
- `preload_duration_ms` = `599.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.03`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `2118.10`, min `23.70`, p50 `2216.27`, p95 `3084.07`, p99 `3251.54`, 1%low `59.04`, 0.1%low `41.77`, std `748.64`

**Frame time (ms)**  avg `0.93`, p50 `0.45`, p95 `1.43`, p99 `14.34`, p99.9 `19.31`, max `42.19`

**Client tick (ms)**  avg `0.34`, p95 `0.54`, max `2.41`

**Memory**  start `3113 MB`, end `3971 MB`, peak `4538 MB`, GC `11 events / 169 ms`

**FPS over sampling window (ASCII):**

```
2761.4 | █ █                                                                            
2636.1 |████ █   █                                                                      
2510.8 |████ ██  ████           █                                                       
2385.5 |█████████████ █ █ █     ██ █  █ █                                               
2260.2 |██████████████████████ █████ ████   █                                           
2134.8 |██████████████████████ █████ ████ ███ ████   █ █  █     █  █                    
2009.5 |████████████████████████████ ███████████████████ ██   ███ ██        ██ █     █  
1884.2 |█████████████████████████████████████████████████████ ███████  ███  ██ ██   ██  
1758.9 |█████████████████████████████████████████████████████████████ ████  ██ ███ ███ █
1633.5 |█████████████████████████████████████████████████████████████ ████  ██████ █████
1508.2 |█████████████████████████████████████████████████████████████ ████  ████████████
1382.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19179
   1 ms | ██  1033
   2 ms |   147
   3 ms |   40
   4 ms |   8
   5 ms |   1
   6 ms |   2
   7 ms |   1
   8 ms |   1
  12 ms |   144
  13 ms |   202
  14 ms |   75
  15 ms |   53
  16 ms |   46
  17 ms |   31
  18 ms |   11
  19 ms |   11
  20 ms |   3
  21 ms |   4
  22 ms |   3
  24 ms |   1
  33 ms |   1
  35 ms |   1
  36 ms |   1
  42 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `fps_1pct_low` = `59.04`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `61.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `1072.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `41.77`
- `seed` = `7433.00`
- `preload_duration_ms` = `43.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `1948.27`, min `24.52`, p50 `1999.44`, p95 `2923.19`, p99 `3132.35`, 1%low `56.14`, 0.1%low `41.24`, std `693.01`

**Frame time (ms)**  avg `1.02`, p50 `0.50`, p95 `1.55`, p99 `15.15`, p99.9 `20.39`, max `40.79`

**Client tick (ms)**  avg `0.36`, p95 `0.49`, max `4.32`

**Memory**  start `2332 MB`, end `2580 MB`, peak `4635 MB`, GC `15 events / 189 ms`

**FPS over sampling window (ASCII):**

```
2483.3 |     █                                                                          
2386.0 |  █ ███  ████                                                                   
2288.7 |███ ███  ████            ███                                                    
2191.5 |███████  ████            ████                                                   
2094.2 |███████  █████ █  █      ████                                      █            
1996.9 |███████ ██████ ████    ██████          █               █  ██   ██  █ █  █    █  
1899.6 |███████ ███████████    ██████       ██ ███  ███   ██ ███ ████  ██  ███ ██   ███ 
1802.3 |███████████████████ █  ██████ ███   ███████████ █ ██ ███ ████ ████ ███ ████ ███ 
1705.0 |█████████████████████████████████  ████████████ █████████████ ████ ███ ████ ████
1607.7 |█████████████████████████████████████████████████████████████ ██████████████████
1510.4 |█████████████████████████████████████████████████████████████ ██████████████████
1413.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17785
   1 ms | ██  949
   2 ms |   138
   3 ms |   35
   4 ms |   15
   5 ms |   10
   6 ms |   3
   8 ms |   2
  12 ms |   34
  13 ms | █  223
  14 ms |   130
  15 ms |   67
  16 ms |   37
  17 ms |   34
  18 ms |   33
  19 ms |   16
  20 ms |   11
  21 ms |   3
  23 ms |   3
  24 ms |   1
  30 ms |   2
  37 ms |   1
  40 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `fps_1pct_low` = `56.14`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `55.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `976.64`
- `part` = `1.00`
- `fps_0p1pct_low` = `41.24`
- `seed` = `7451.00`
- `preload_duration_ms` = `47.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-9.00`
- `entity_count_sample_start` = `10.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `2007.89`, min `18.52`, p50 `2030.38`, p95 `3056.09`, p99 `3234.12`, 1%low `55.67`, 0.1%low `39.04`, std `757.74`

**Frame time (ms)**  avg `1.03`, p50 `0.49`, p95 `1.62`, p99 `15.40`, p99.9 `20.65`, max `53.99`

**Client tick (ms)**  avg `0.34`, p95 `0.50`, max `3.00`

**Memory**  start `1806 MB`, end `2806 MB`, peak `4745 MB`, GC `17 events / 230 ms`

**FPS over sampling window (ASCII):**

```
2727.9 |   ██                                                                           
2581.9 |  ███      █                                                                    
2435.9 |  ████  ████ ██    █     ██ ██                                                  
2289.9 |  ██████████ ██ █  █ ██  █████    ██                                            
2143.8 |█ ████████████████ ███████████ █  ██████    █                                   
1997.8 |██████████████████████████████ █ ███████  █ ███ █   █                           
1851.8 |███████████████████████████████████████████████ █ █ ██  █  █           █   ██   
1705.8 |█████████████████████████████████████████████████████████  ██  ██  ███ ███████ █
1559.7 |██████████████████████████████████████████████████████████████████ ███████████ █
1413.7 |██████████████████████████████████████████████████████████████████████████████ █
1267.7 |██████████████████████████████████████████████████████████████████████████████ █
1121.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17583
   1 ms | ██  1046
   2 ms |   146
   3 ms |   43
   4 ms |   16
   5 ms |   10
   7 ms |   3
  12 ms |   27
  13 ms |   188
  14 ms |   162
  15 ms |   72
  16 ms |   51
  17 ms |   36
  18 ms |   25
  19 ms |   13
  20 ms |   8
  21 ms |   5
  22 ms |   4
  23 ms |   1
  24 ms |   2
  27 ms |   1
  29 ms |   1
  32 ms |   2
  53 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `fps_1pct_low` = `55.67`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `63.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `971.99`
- `part` = `1.00`
- `fps_0p1pct_low` = `39.04`
- `seed` = `7457.00`
- `preload_duration_ms` = `50.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-17.00`
- `entity_count_sample_start` = `18.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24701 ms  |  Sample ticks: 400

**FPS**  avg `1916.11`, min `20.70`, p50 `1920.39`, p95 `3026.69`, p99 `3170.40`, 1%low `54.34`, 0.1%low `38.17`, std `721.40`

**Frame time (ms)**  avg `1.07`, p50 `0.52`, p95 `1.65`, p99 `15.94`, p99.9 `21.25`, max `48.30`

**Client tick (ms)**  avg `0.35`, p95 `0.47`, max `3.94`

**Memory**  start `3900 MB`, end `4494 MB`, peak `4873 MB`, GC `15 events / 190 ms`

**FPS over sampling window (ASCII):**

```
2558.8 |██ █                                                                            
2437.8 |██ █  █ ██   ███    █                                                           
2316.9 |████  █████ ████ ████   ██                                                      
2196.0 |████ ███████████ ████   ███                                                     
2075.1 |███████████████████████ ████ ██                                                 
1954.2 |████████████████████████████ ████    ██                                         
1833.3 |█████████████████████████████████  █ █████      ████       █                    
1712.3 |██████████████████████████████████ ████████ ████████ ███ ███   ██████     █     
1591.4 |███████████████████████████████████████████ █████████████████ ███████   █████ ██
1470.5 |█████████████████████████████████████████████████████████████ █████████ █████ ██
1349.6 |█████████████████████████████████████████████████████████████ ██████████████████
1228.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16895
   1 ms | ███  1079
   2 ms |   150
   3 ms |   36
   4 ms |   18
   5 ms |   10
   6 ms |   1
   7 ms |   2
   8 ms |   1
   9 ms |   1
  12 ms |   27
  13 ms |   146
  14 ms |   144
  15 ms |   85
  16 ms |   63
  17 ms |   48
  18 ms |   35
  19 ms |   9
  20 ms |   7
  21 ms |   7
  22 ms |   4
  23 ms |   2
  24 ms |   3
  25 ms |   1
  26 ms |   1
  28 ms |   1
  29 ms |   1
  43 ms |   1
  48 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `fps_1pct_low` = `54.34`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `938.95`
- `part` = `1.00`
- `fps_0p1pct_low` = `38.17`
- `seed` = `7477.00`
- `preload_duration_ms` = `1659.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `2030.93`, min `16.10`, p50 `2077.87`, p95 `3074.09`, p99 `3242.66`, 1%low `54.93`, 0.1%low `36.19`, std `753.62`

**Frame time (ms)**  avg `1.01`, p50 `0.48`, p95 `1.55`, p99 `15.33`, p99.9 `20.55`, max `62.10`

**Client tick (ms)**  avg `0.37`, p95 `0.62`, max `3.08`

**Memory**  start `2495 MB`, end `2473 MB`, peak `4956 MB`, GC `17 events / 206 ms`

**FPS over sampling window (ASCII):**

```
2615.1 | ████                                                                           
2502.2 |█████ ██       █                                                                
2389.4 |█████ ████████ ██  █    █                                                       
2276.6 |█████ ███████████  █ ██ ████              █                                     
2163.8 |█████ █████████████████ ████ ██     █  █  █   █                                 
2051.0 |███████████████████████ █████████  ███ ████ ████ ███       █                    
1938.2 |█████████████████████████████████  ███ █████████ ███  █   ██      █ █           
1825.4 |█████████████████████████████████  █████████████ ███  ██  ███  ██ ███      ██ ██
1712.6 |████████████████████████████████████████████████ ███  ██ ████  ███████     ██ ██
1599.7 |█████████████████████████████████████████████████████ ██ ████  ███████ ██  ██ ██
1486.9 |██████████████████████████████████████████████████████████████ ███████ ██  █████
1374.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17934
   1 ms | ███  1163
   2 ms |   154
   3 ms |   30
   4 ms |   13
   5 ms |   6
   6 ms |   1
   8 ms |   1
   9 ms |   2
  10 ms |   1
  12 ms |   72
  13 ms |   177
  14 ms |   123
  15 ms |   57
  16 ms |   58
  17 ms |   40
  18 ms |   29
  19 ms |   14
  20 ms |   3
  21 ms |   8
  22 ms |   2
  23 ms |   1
  25 ms |   1
  27 ms |   1
  29 ms |   1
  31 ms |   1
  34 ms |   1
  37 ms |   1
  44 ms |   1
  62 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `fps_1pct_low` = `54.93`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `61.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `994.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.19`
- `seed` = `7481.00`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25094 ms  |  Sample ticks: 400

**FPS**  avg `1757.04`, min `29.46`, p50 `1768.11`, p95 `2889.45`, p99 `3151.24`, 1%low `52.60`, 0.1%low `38.23`, std `723.59`

**Frame time (ms)**  avg `1.20`, p50 `0.57`, p95 `2.26`, p99 `16.30`, p99.9 `21.80`, max `33.95`

**Client tick (ms)**  avg `0.39`, p95 `0.58`, max `2.96`

**Memory**  start `4059 MB`, end `4589 MB`, peak `5121 MB`, GC `15 events / 202 ms`

**FPS over sampling window (ASCII):**

```
2674.9 |█ █                                                                             
2539.9 |█ ██ █                                                                          
2404.9 |█ ██ █                                                                          
2270.0 |█ ████  ███  █                                                                  
2135.0 |██████ ████  ██                                                                 
2000.0 |██████ ████████    ██                                                           
1865.0 |████████████████  █████ ███    █   ██  █                                        
1730.0 |█████████████████ ██████████ ███  ████ ████     █ █  █                █  █ █   █
1595.1 |█████████████████ █████████████████████████ ██ █████ ██   █   █  ██  ███████ ███
1460.1 |████████████████████████████████████████████████████ ███████  █  ██  ███████ ███
1325.1 |█████████████████████████████████████████████████████████████ ██████████████████
1190.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14355
   1 ms | ████  1466
   2 ms | █  189
   3 ms |   67
   4 ms |   37
   5 ms |   20
   6 ms |   4
   7 ms |   3
   8 ms |   3
   9 ms |   2
  10 ms |   1
  12 ms |   43
  13 ms |   158
  14 ms |   116
  15 ms |   75
  16 ms |   53
  17 ms |   46
  18 ms |   36
  19 ms |   12
  20 ms |   11
  21 ms |   11
  22 ms |   4
  23 ms |   3
  24 ms |   2
  25 ms |   3
  27 ms |   1
  30 ms |   1
  32 ms |   1
  33 ms |   2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `fps_1pct_low` = `52.60`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `836.61`
- `part` = `1.00`
- `fps_0p1pct_low` = `38.23`
- `seed` = `7487.00`
- `preload_duration_ms` = `2044.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1745.73`, min `34.66`, p50 `1783.69`, p95 `2724.63`, p99 `2897.04`, 1%low `55.83`, 0.1%low `43.43`, std `640.74`

**Frame time (ms)**  avg `1.14`, p50 `0.56`, p95 `1.91`, p99 `15.64`, p99.9 `20.38`, max `28.85`

**Client tick (ms)**  avg `0.45`, p95 `0.71`, max `5.05`

**Memory**  start `3303 MB`, end `4763 MB`, peak `5184 MB`, GC `15 events / 187 ms`

**FPS over sampling window (ASCII):**

```
2370.7 |  █                                                                             
2249.5 |  █                                                                             
2128.2 |█ ██ █   ██                                                                     
2007.0 |████ ████████    ██                                              █ █            
1885.8 |██████████████   ██                                       ██    ██ ███      ██  
1764.5 |████████████████ ████  ██                              ██████  ███ ████  ██ ████
1643.3 |█████████████████████ ████████ █ █████  ██  █     █   ███████ ████ ████████ ████
1522.1 |██████████████████████████████ █████████████████████ ███████████████████████████
1400.9 |██████████████████████████████ █████████████████████ ███████████████████████████
1279.6 |████████████████████████████████████████████████████ ███████████████████████████
1158.4 |████████████████████████████████████████████████████ ███████████████████████████
1037.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15447
   1 ms | ███  1199
   2 ms |   179
   3 ms |   39
   4 ms |   21
   5 ms |   3
   6 ms |   1
   7 ms |   2
   8 ms |   1
   9 ms |   3
  10 ms |   1
  11 ms |   1
  12 ms |   39
  13 ms | █  201
  14 ms |   130
  15 ms |   81
  16 ms |   45
  17 ms |   38
  18 ms |   28
  19 ms |   16
  20 ms |   5
  21 ms |   3
  22 ms |   5
  23 ms |   3
  24 ms |   2
  25 ms |   1
  28 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `fps_1pct_low` = `55.83`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `874.22`
- `part` = `1.00`
- `fps_0p1pct_low` = `43.43`
- `seed` = `7499.00`
- `preload_duration_ms` = `62.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-45.00`
- `entity_count_sample_start` = `47.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23515 ms  |  Sample ticks: 400

**FPS**  avg `1876.25`, min `24.72`, p50 `1972.47`, p95 `2790.86`, p99 `2926.09`, 1%low `51.57`, 0.1%low `39.89`, std `705.86`

**Frame time (ms)**  avg `1.20`, p50 `0.51`, p95 `2.83`, p99 `17.00`, p99.9 `22.28`, max `40.46`

**Client tick (ms)**  avg `0.32`, p95 `0.44`, max `1.41`

**Memory**  start `3489 MB`, end `5177 MB`, peak `5253 MB`, GC `12 events / 155 ms`

**FPS over sampling window (ASCII):**

```
2372.0 |█ █                                                                             
2258.0 |███  ██              █     █                                                    
2144.0 |███  ███████ █  ██   ██    █    ██               █                              
2030.0 |████ █████████  ███  █████ █  █ ██ █ ███     ██  █ █   █    █                   
1915.9 |████ █████████ ████  █████ █  █ ██ █████  █  ██ █████ ██   ██  █                
1801.9 |████ █████████ ████  ███████  ████ █████████ ██ █████ ██   ██  █    ████ █   █  
1687.9 |███████████████████ █████████ ███████████████████████ ███  ██ ████  ███████  ██ 
1573.9 |█████████████████████████████ ███████████████████████ ███  ███████  ███████ ███ 
1459.9 |█████████████████████████████ ███████████████████████ ████ ████████ ███████ ███ 
1345.9 |███████████████████████████████████████████████████████████████████ ███████████ 
1231.9 |███████████████████████████████████████████████████████████████████████████████ 
1117.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14886
   1 ms | ██  817
   2 ms |   129
   3 ms |   115
   4 ms |   59
   5 ms |   22
   6 ms |   9
   7 ms |   3
   8 ms |   4
   9 ms |   1
  12 ms |   2
  13 ms |   60
  14 ms |   84
  15 ms |   159
  16 ms |   128
  17 ms |   67
  18 ms |   32
  19 ms |   16
  20 ms |   10
  21 ms |   15
  22 ms |   16
  23 ms |   5
  25 ms |   2
  28 ms |   1
  29 ms |   1
  40 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `fps_1pct_low` = `51.57`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `58.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `831.66`
- `part` = `1.00`
- `fps_0p1pct_low` = `39.89`
- `seed` = `7507.00`
- `preload_duration_ms` = `454.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.08`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `1817.97`, min `25.32`, p50 `1817.54`, p95 `2986.96`, p99 `3342.86`, 1%low `53.40`, 0.1%low `40.12`, std `730.49`

**Frame time (ms)**  avg `1.16`, p50 `0.55`, p95 `2.39`, p99 `16.37`, p99.9 `21.06`, max `39.50`

**Client tick (ms)**  avg `0.40`, p95 `0.64`, max `2.70`

**Memory**  start `3530 MB`, end `4688 MB`, peak `5255 MB`, GC `15 events / 191 ms`

**FPS over sampling window (ASCII):**

```
2759.7 |   █                                                                            
2619.1 |█  █                                                                            
2478.5 |████                                                                            
2337.9 |████ █   █                                                                      
2197.3 |███████  █ █  ███ ██                                                            
2056.7 |███████  █ ██████████ █ █     █  █ █                                            
1916.1 |███████ ██ ███████████████    █  ███  ███                                       
1775.5 |██████████ ████████████████   █  ████ ███  ██   █       █     ██ ██  █ █        
1634.9 |███████████████████████████ █ ████████████████████████  ████ ████████████     ██
1494.3 |███████████████████████████ ███████████████████████████ █████████████████ █   ██
1353.7 |███████████████████████████ ███████████████████████████ ███████████████████ █ ██
1213.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15042
   1 ms | ███  1181
   2 ms | █  305
   3 ms |   70
   4 ms |   25
   5 ms |   13
   6 ms |   4
   7 ms |   2
   8 ms |   2
   9 ms |   4
  12 ms |   26
  13 ms |   163
  14 ms |   131
  15 ms |   63
  16 ms |   67
  17 ms |   43
  18 ms |   40
  19 ms |   27
  20 ms |   6
  21 ms |   4
  22 ms |   4
  23 ms |   4
  25 ms |   1
  26 ms |   2
  28 ms |   1
  30 ms |   1
  39 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `fps_1pct_low` = `53.40`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `61.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `861.60`
- `part` = `1.00`
- `fps_0p1pct_low` = `40.12`
- `seed` = `7517.00`
- `preload_duration_ms` = `49.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-53.00`
- `entity_count_sample_start` = `54.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `2251.64`, min `28.10`, p50 `2364.28`, p95 `3418.00`, p99 `3570.16`, 1%low `51.79`, 0.1%low `37.59`, std `906.60`

**Frame time (ms)**  avg `1.04`, p50 `0.42`, p95 `2.13`, p99 `16.47`, p99.9 `22.91`, max `35.59`

**Client tick (ms)**  avg `0.36`, p95 `0.51`, max `3.68`

**Memory**  start `5121 MB`, end `3088 MB`, peak `5404 MB`, GC `16 events / 200 ms`

**FPS over sampling window (ASCII):**

```
2907.1 |     █                                                                          
2721.0 |    ████ █████    █  █       █                                                  
2534.9 |█  ████████████ █ █████ ██ █ █ ███        █  █     ██     ██    █               
2348.7 |█  ██████████████ ██████████ █████      ████ ███ █ ████  ███  ████              
2162.6 |█ ████████████████████████████████ █ █ ███████████ ███████████████     █        
1976.5 |██████████████████████████████████████ ███████████ ████████████████  █ ███      
1790.4 |███████████████████████████████████████████████████████████████████  █████      
1604.3 |███████████████████████████████████████████████████████████████████ ██████      
1418.2 |██████████████████████████████████████████████████████████████████████████      
1232.1 |███████████████████████████████████████████████████████████████████████████     
1046.0 |████████████████████████████████████████████████████████████████████████████ █ █
859.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17184
   1 ms | ███  1076
   2 ms | █  326
   3 ms |   50
   4 ms |   23
   5 ms |   7
   6 ms |   12
   7 ms |   6
   8 ms |   3
   9 ms |   2
  10 ms |   1
  11 ms |   1
  12 ms |   9
  13 ms |   93
  14 ms |   159
  15 ms |   107
  16 ms |   71
  17 ms |   43
  18 ms |   33
  19 ms |   22
  20 ms |   21
  21 ms |   12
  22 ms |   4
  23 ms |   6
  24 ms |   3
  25 ms |   3
  26 ms |   3
  27 ms |   1
  29 ms |   1
  31 ms |   1
  35 ms |   2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `fps_1pct_low` = `51.79`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `964.38`
- `part` = `1.00`
- `fps_0p1pct_low` = `37.59`
- `seed` = `7523.00`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_end` = `14.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `13.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1261.45`, min `18.39`, p50 `1262.10`, p95 `1840.08`, p99 `1931.38`, 1%low `49.62`, 0.1%low `33.72`, std `424.31`

**Frame time (ms)**  avg `1.56`, p50 `0.79`, p95 `4.55`, p99 `17.61`, p99.9 `22.47`, max `54.39`

**Client tick (ms)**  avg `0.29`, p95 `0.38`, max `1.00`

**Memory**  start `4402 MB`, end `5197 MB`, peak `5401 MB`, GC `20 events / 204 ms`

**FPS over sampling window (ASCII):**

```
1521.5 |                                 █  █  █             █ █                        
1467.1 |                                 ████ ██             ███████ █                  
1412.7 |                              ███████ ███ █ █ █ █    █████████           ██     
1358.3 |█                █            █████████████ █ ███   ████████████ █      ███   █ 
1303.9 |█                █ █          ███████████████ ███   ██████████████      ███   █ 
1249.5 |██           ██  █ █          ███████████████████   ███████████████ █   ███ █ █ 
1195.1 |██         ████  ████    █    ███████████████████  ████████████████ █   ███████ 
1140.7 |██     █   ████ █████    ██   ███████████████████ █████████████████ █  █████████
1086.3 |███ █ ██   ██████████    ██ ████████████████████████████████████████████████████
1031.9 |███ █ ███ ███████████ █ ████████████████████████████████████████████████████████
977.5 |█████ █████████████████ ████████████████████████████████████████████████████████
923.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10433
   1 ms | ██████  1586
   2 ms |   88
   3 ms |   49
   4 ms |   69
   5 ms |   20
   6 ms |   1
   9 ms |   5
  10 ms |   3
  11 ms |   2
  12 ms |   9
  13 ms |   63
  14 ms |   127
  15 ms |   106
  16 ms |   110
  17 ms |   64
  18 ms |   45
  19 ms |   22
  20 ms |   13
  21 ms |   7
  22 ms |   4
  23 ms |   1
  24 ms |   1
  25 ms |   4
  26 ms |   1
  27 ms |   2
  29 ms |   1
  30 ms |   1
  39 ms |   1
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `33.72`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `641.94`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.62`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `62.00`
- `entity_count_sample_start` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `174.17`, min `11.31`, p50 `199.77`, p95 `274.34`, p99 `290.98`, 1%low `22.08`, 0.1%low `11.80`, std `80.13`

**Frame time (ms)**  avg `8.73`, p50 `5.01`, p95 `21.47`, p99 `34.78`, p99.9 `60.53`, max `88.38`

**Client tick (ms)**  avg `3.51`, p95 `7.77`, max `16.01`

**Memory**  start `4011 MB`, end `4264 MB`, peak `5405 MB`, GC `12 events / 132 ms`

**FPS over sampling window (ASCII):**

```
217.1 |█  █     █                                                         ██           
205.2 |██ ██  █ █  █                                              █    ██ ██           
193.2 |██ ██ ██ ██ █               █                   █    █  █  ██   ██████ █████    
181.2 |██ ██ ███████      ██       █    ██   █      █ ██    █  █  ██   ████████████ ██ 
169.3 |█████████████     ████  ██ ████  ██   ████████████  ███ █████  █████████████████
157.3 |█████████████     ████ ████████  ████ █████████████ ███ █████ ██████████████████
145.3 |█████████████     █████████████ ████████████████████████████████████████████████
133.3 |███████████████  ██████████████ ████████████████████████████████████████████████
121.4 |███████████████  ███████████████████████████████████████████████████████████████
109.4 |████████████████ ███████████████████████████████████████████████████████████████
 97.4 |████████████████ ███████████████████████████████████████████████████████████████
 85.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █████████████████████  391
   4 ms | ████████████████████████████████████████  753
   5 ms | ████████████████  308
   6 ms | █████  100
   7 ms | █████  94
   8 ms | ██  41
   9 ms | █  25
  10 ms |   9
  11 ms |   6
  12 ms |   7
  13 ms | █  10
  14 ms | ██  36
  15 ms | ██  42
  16 ms | ███  56
  17 ms | ████  68
  18 ms | ████  84
  19 ms | ████  71
  20 ms | ███  49
  21 ms | ██  41
  22 ms | █  17
  23 ms | █  14
  24 ms |   7
  25 ms |   6
  26 ms |   8
  27 ms |   1
  28 ms |   4
  29 ms |   2
  30 ms |   2
  31 ms |   3
  32 ms |   4
  33 ms |   5
  34 ms |   5
  35 ms |   8
  37 ms |   3
  38 ms |   2
  42 ms |   2
  45 ms |   1
  47 ms |   2
  54 ms |   1
  57 ms |   1
  61 ms |   1
  81 ms |   1
  88 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `114.59`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `58.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `22.08`
- `fps_0p1pct_low` = `11.80`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `1227.79`, min `13.88`, p50 `1274.38`, p95 `1731.49`, p99 `1821.20`, 1%low `53.06`, 0.1%low `35.46`, std `403.10`

**Frame time (ms)**  avg `1.56`, p50 `0.78`, p95 `3.86`, p99 `16.74`, p99.9 `20.06`, max `72.02`

**Client tick (ms)**  avg `0.31`, p95 `0.41`, max `1.83`

**Memory**  start `5336 MB`, end `3260 MB`, peak `5411 MB`, GC `21 events / 250 ms`

**FPS over sampling window (ASCII):**

```
1401.3 |         █            █    ██                  ██      █                        
1357.2 |  █    ███          █ █ █  ██                 ███    █ █                      █ 
1313.1 | ███ █ ███          █ ███  ██   █            ████   ██ █     █               ██ 
1269.0 |████ █ ███          ██████ ████ ██          █████  █████     █          █  █████
1224.9 |████ █ ███          ███████████ █████  █  █ █████████████    █  █    █  █  █████
1180.8 |██████ █████ █ █    █████████████████  ██ ███████████████   ███ ██ █ ████  █████
1136.6 |████████████ █ ██  ██████████████████  ██████████████████  ████ █████████  █████
1092.5 |████████████ █ ██  ██████████████████  ███████████████████ ████ █████████  █████
1048.4 |██████████████████ ██████████████████ ████████████████████████████████████ █████
1004.3 |██████████████████ ██████████████████ ██████████████████████████████████████████
960.2 |██████████████████ █████████████████████████████████████████████████████████████
916.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10047
   1 ms | ████████  1971
   2 ms | █  128
   3 ms |   63
   4 ms |   13
   5 ms |   2
   6 ms |   5
   7 ms |   4
   8 ms |   9
   9 ms |   7
  10 ms |   4
  11 ms |   7
  12 ms |   5
  13 ms |   63
  14 ms | █  188
  15 ms | █  141
  16 ms |   93
  17 ms |   47
  18 ms |   27
  19 ms |   10
  20 ms |   7
  21 ms |   2
  25 ms |   2
  26 ms |   1
  27 ms |   1
  44 ms |   1
  72 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `53.06`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3190.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `642.31`
- `part` = `1.00`
- `fps_0p1pct_low` = `35.46`
- `seed` = `9043.00`
- `preload_duration_ms` = `49.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1242.66`, min `23.32`, p50 `1268.17`, p95 `1766.02`, p99 `1855.35`, 1%low `54.90`, 0.1%low `44.23`, std `409.80`

**Frame time (ms)**  avg `1.56`, p50 `0.79`, p95 `3.51`, p99 `16.79`, p99.9 `19.34`, max `42.88`

**Client tick (ms)**  avg `0.31`, p95 `0.40`, max `0.78`

**Memory**  start `2954 MB`, end `5307 MB`, peak `5413 MB`, GC `19 events / 187 ms`

**FPS over sampling window (ASCII):**

```
1438.8 |                             █                                  █  █            
1395.8 |                            ██   █ █ █           ██             ████ █         █
1352.7 |          █                 ██   █ █ █           ████  █        ██████        ██
1309.6 |    █ ███ ██                ██ ███ █ █    ██    ██████ ██       ████████ █    ██
1266.6 |   ██████ ██    █           ██ ███ ███    ███ █ █████████     █ ██████████   ███
1223.5 |  ███████ ███   █           ██ ███████   ████ █ ██████████   █████████████   ███
1180.5 |█ ███████ ███ █ █     █ █   ███████████  ████ ████████████  ███████████████  ███
1137.4 |█ ███████████ ███   █ ███  ████████████  ████ ████████████  ███████████████  ███
1094.3 |██████████████████  █████ █████████████  █████████████████ ████████████████  ███
1051.3 |██████████████████  ███████████████████  ███████████████████████████████████ ███
1008.2 |████████████████████████████████████████ ███████████████████████████████████████
965.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10286
   1 ms | ███████  1754
   2 ms |   100
   3 ms |   67
   4 ms |   6
   5 ms |   1
  12 ms |   2
  13 ms |   89
  14 ms | █  187
  15 ms | █  147
  16 ms |   93
  17 ms |   65
  18 ms |   24
  19 ms |   11
  20 ms |   5
  21 ms |   1
  22 ms |   2
  24 ms |   1
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `61.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `54.90`
- `fps_harmonic_avg` = `641.93`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `44.23`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1165.04`, min `28.90`, p50 `1187.65`, p95 `1663.42`, p99 `1728.85`, 1%low `54.90`, 0.1%low `44.48`, std `391.71`

**Frame time (ms)**  avg `1.65`, p50 `0.84`, p95 `13.48`, p99 `16.89`, p99.9 `19.70`, max `34.60`

**Client tick (ms)**  avg `0.30`, p95 `0.39`, max `0.74`

**Memory**  start `3089 MB`, end `5417 MB`, peak `5417 MB`, GC `19 events / 182 ms`

**FPS over sampling window (ASCII):**

```
1395.5 |           █                                                                    
1341.4 |    █    ███ █        █       █                             ██                  
1287.2 | █ ██ ████████      █ █       █         █           █       ██   █              
1233.1 |██████████████      █████ ███ ██        ██ █  █ █ ████      ██   █   █       █  
1178.9 |███████████████     █████ ███████       █████████ ████     ████ ██   █       ███
1124.7 |███████████████ █   ██████████████  █   ███████████████ █  ███████ █ █       ███
1070.6 |███████████████ █   ███████████████ █   ██████████████████ ███████████   █   ███
1016.4 |███████████████ █  ████████████████ █ ████████████████████ ███████████ ███   ███
962.3 |██████████████████ ██████████████████ ████████████████████████████████ ███ █ ███
908.1 |██████████████████ ███████████████████████████████████████████████████ ███ █████
854.0 |██████████████████████████████████████████████████████████████████████ █████████
799.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8777
   1 ms | ████████████  2550
   2 ms |   79
   3 ms |   62
   4 ms |   5
   5 ms |   3
   6 ms |   1
   7 ms |   2
  12 ms |   3
  13 ms |   109
  14 ms | █  191
  15 ms | █  140
  16 ms |   79
  17 ms |   68
  18 ms |   23
  19 ms |   9
  20 ms |   6
  21 ms |   2
  24 ms |   1
  25 ms |   1
  34 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `54.90`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `605.31`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `44.48`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `978.11`, min `18.00`, p50 `1003.26`, p95 `1462.96`, p99 `1543.71`, 1%low `49.14`, 0.1%low `31.91`, std `357.26`

**Frame time (ms)**  avg `2.01`, p50 `1.00`, p95 `14.29`, p99 `17.81`, p99.9 `26.03`, max `55.57`

**Client tick (ms)**  avg `0.33`, p95 `0.43`, max `1.83`

**Memory**  start `2616 MB`, end `4951 MB`, peak `5418 MB`, GC `16 events / 179 ms`

**FPS over sampling window (ASCII):**

```
1217.9 |                                                                      █         
1161.0 |         █        █                █    █           █      █     █    █         
1104.1 |         █        █            ██████ █ █           █      █ █ ███    █         
1047.2 |  ███ ██ ██   █   █        ██  ████████ █      ██  ██     ████ ███   ███ █      
990.3 |█ █████████████  ██        ██████████████ █    ██  ███   █████████  ██████      
933.4 |█ █████████████ ███        ██████████████ █    ███████████████████  ██████      
876.5 |███████████████ ███      ███████████████████   ███████████████████  █████████ █ 
819.6 |███████████████████ █  █ ███████████████████   █████████████████████████████████
762.7 |███████████████████ █  █████████████████████  ██████████████████████████████████
705.8 |███████████████████ █ ███████████████████████ ██████████████████████████████████
648.9 |█████████████████████ ██████████████████████████████████████████████████████████
592.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5028
   1 ms | ████████████████████████████████  4031
   2 ms | █  130
   3 ms | █  79
   4 ms |   36
   5 ms |   20
   6 ms |   6
   7 ms |   5
   8 ms |   8
   9 ms |   7
  10 ms |   1
  11 ms |   7
  12 ms |   2
  13 ms |   55
  14 ms | █  158
  15 ms | █  136
  16 ms | █  89
  17 ms | █  74
  18 ms |   47
  19 ms |   13
  20 ms |   9
  21 ms |   4
  22 ms |   2
  23 ms |   1
  25 ms |   1
  26 ms |   3
  27 ms |   3
  28 ms |   1
  29 ms |   1
  30 ms |   1
  34 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `49.14`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `498.25`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `31.91`
- `seed` = `8053.00`
- `preload_duration_ms` = `62.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195188 ms  |  Sample ticks: 3600

**FPS**  avg `171.08`, min `0.61`, p50 `173.47`, p95 `318.20`, p99 `377.67`, 1%low `19.79`, 0.1%low `7.01`, std `93.31`

**Frame time (ms)**  avg `9.51`, p50 `5.76`, p95 `22.94`, p99 `36.06`, p99.9 `48.73`, max `1637.02`

**Client tick (ms)**  avg `0.93`, p95 `1.30`, max `15.88`

**Memory**  start `5182 MB`, end `5319 MB`, peak `5680 MB`, GC `173 events / 1849 ms`

**FPS over sampling window (ASCII):**

```
245.4 |                                                    █          █   █            
231.8 |                                                    ████ ███████   █████        
218.1 |                                                  ███████████████  █████        
204.5 |                                    ███    ███   ████████████████████████       
190.8 |█   █                              ████    ███   ████████████████████████    █  
177.2 |█   █      █                   ████████   ████   █████████████████████████████ █
163.5 |█   █     ██               ███ ████████   ████  ████████████████████████████████
149.9 |█   █     ██               ████████████   ████  ████████████████████████████████
136.2 |█  ██     ███              █████████████  █████ ████████████████████████████████
122.6 |█  ████   ███   ███  █    ██████████████ ███████████████████████████████████████
109.0 |█  ████   █████ ████ ███ ███████████████████████████████████████████████████████
 95.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   8
   2 ms | ███████  650
   3 ms | ████████████████████████████████████████  3609
   4 ms | ████████████████████████████████████████  3571
   5 ms | ███████████████████████  2101
   6 ms | ███████████████████  1712
   7 ms | ███████████████  1346
   8 ms | ████████  732
   9 ms | ███  248
  10 ms | █  108
  11 ms |   30
  12 ms |   21
  13 ms |   16
  14 ms |   11
  15 ms |   32
  16 ms | ██  166
  17 ms | ████  318
  18 ms | ██████  531
  19 ms | █████████  837
  20 ms | ██████████  892
  21 ms | ████████  687
  22 ms | ██████  502
  23 ms | ███  303
  24 ms | ██  183
  25 ms | █  97
  26 ms | █  47
  27 ms |   29
  28 ms |   13
  29 ms |   8
  30 ms |   4
  31 ms |   7
  32 ms |   2
  33 ms |   6
  34 ms |   13
  35 ms |   16
  36 ms |   31
  37 ms |   19
  38 ms |   24
  39 ms |   20
  40 ms |   17
  41 ms |   16
  42 ms |   12
  43 ms |   8
  44 ms |   9
  45 ms |   3
  46 ms |   7
  47 ms |   4
  48 ms |   4
  49 ms |   2
  50 ms |   1
  51 ms |   3
  53 ms |   1
  54 ms |   1
  55 ms |   1
  56 ms |   1
  60 ms |   1
  64 ms |   1
  68 ms |   1
  70 ms |   1
  72 ms |   2
  90 ms |   1
1637 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.01`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `113.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `105.14`
- `fps_1pct_low` = `19.79`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `86.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `1.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195312 ms  |  Sample ticks: 3600

**FPS**  avg `198.55`, min `8.43`, p50 `193.13`, p95 `426.46`, p99 `638.92`, 1%low `23.30`, 0.1%low `15.93`, std `128.56`

**Frame time (ms)**  avg `8.92`, p50 `5.18`, p95 `23.28`, p99 `34.75`, p99.9 `49.51`, max `118.63`

**Client tick (ms)**  avg `0.87`, p95 `1.27`, max `24.48`

**Memory**  start `4613 MB`, end `3557 MB`, peak `5612 MB`, GC `190 events / 2494 ms`

**FPS over sampling window (ASCII):**

```
298.3 |                                                     ███  ██      ███ █         
279.7 |                                                  ██████████████ ██████         
261.1 |                                                 ███████████████ ███████        
242.5 |                                                 ████████████████████████    █  
224.0 |                                   ██   ██     █████████████████████████████████
205.4 |█                                ████   ███   ██████████████████████████████████
186.8 |█   █      █                  ███████   ████  ██████████████████████████████████
168.2 |█   █      ██             ███████████   ████ ███████████████████████████████████
149.6 |█   ██     ██            ████████████  █████ ███████████████████████████████████
131.1 |█   ███   ███            █████████████ █████ ███████████████████████████████████
112.5 |██████████████ ████ ███ ████████████████████████████████████████████████████████
 93.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █████  610
   2 ms | ████████████  1346
   3 ms | ████████████████████████████████████████  4604
   4 ms | ████████████████████████████  3177
   5 ms | ███████████████  1712
   6 ms | ██████████████  1563
   7 ms | ██████████  1192
   8 ms | █████  562
   9 ms | ██  248
  10 ms | █  112
  11 ms |   47
  12 ms |   17
  13 ms |   13
  14 ms | █  66
  15 ms | ██  196
  16 ms | ██  211
  17 ms | ███  300
  18 ms | ████  498
  19 ms | ██████  658
  20 ms | ███████  768
  21 ms | ██████  647
  22 ms | ████  501
  23 ms | ███  367
  24 ms | ██  201
  25 ms | █  137
  26 ms | █  75
  27 ms |   44
  28 ms |   19
  29 ms |   19
  30 ms |   11
  31 ms |   8
  32 ms |   14
  33 ms |   12
  34 ms |   17
  35 ms |   17
  36 ms |   18
  37 ms |   18
  38 ms |   12
  39 ms |   18
  40 ms |   15
  41 ms |   18
  42 ms |   15
  43 ms |   11
  44 ms |   8
  45 ms |   8
  46 ms |   10
  47 ms |   5
  48 ms |   6
  49 ms |   1
  50 ms |   3
  51 ms |   4
  54 ms |   3
  55 ms |   1
  56 ms |   1
  58 ms |   1
  59 ms |   1
  63 ms |   2
  72 ms |   1
  88 ms |   1
  99 ms |   1
 118 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `15.93`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `113.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `112.06`
- `fps_1pct_low` = `23.30`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `85.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `14.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194187 ms  |  Sample ticks: 3600

**FPS**  avg `123.23`, min `14.60`, p50 `108.76`, p95 `309.87`, p99 `435.93`, 1%low `21.79`, 0.1%low `20.09`, std `93.58`

**Frame time (ms)**  avg `14.37`, p50 `9.19`, p95 `40.81`, p99 `44.57`, p99.9 `47.06`, max `68.49`

**Client tick (ms)**  avg `0.67`, p95 `0.89`, max `3.05`

**Memory**  start `3044 MB`, end `3126 MB`, peak `5612 MB`, GC `33 events / 228 ms`

**FPS over sampling window (ASCII):**

```
167.6 |                                                             ██   █             
160.6 |                                                             ██████ █           
153.6 |                                                        ████ ████████           
146.6 |█                                                       █████████████           
139.7 |█     █                                                 ███████████████      █  
132.7 |█    ███      █                                         ████████████████████ ██ 
125.7 |█████████ ██ ███                                      ██████████████████████████
118.7 |████████████████                               ███  ████████████████████████████
111.8 |████████████████    █            ████   ████   ███  ████████████████████████████
104.8 |██████████████████████ ██ ███    ███████████  ██████████████████████████████████
 97.8 |████████████████████████████████████████████ ███████████████████████████████████
 90.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  22
   2 ms | ████████████  430
   3 ms | ███████████████████████████  1005
   4 ms | ██████████████████████  821
   5 ms | ███████████████  549
   6 ms | █████████████████  614
   7 ms | █████████████████████████████  1094
   8 ms | ████████████████████████████████████████  1488
   9 ms | ██████████████████████████████  1119
  10 ms | ████████████████  589
  11 ms | ████  156
  12 ms | █  27
  13 ms |   7
  14 ms |   3
  15 ms |   2
  16 ms |   4
  17 ms | █  21
  18 ms | ████  147
  19 ms | ████████████  458
  20 ms | ████████████████  578
  21 ms | ████████████  460
  22 ms | ██████  211
  23 ms | ████  136
  24 ms | ████  138
  25 ms | ██████  217
  26 ms | █████████  324
  27 ms | ██████████  388
  28 ms | ████████  302
  29 ms | ██████  224
  30 ms | ████  140
  31 ms | █  55
  32 ms |   14
  33 ms |   5
  34 ms |   4
  35 ms | █  19
  36 ms | █  20
  37 ms |   10
  38 ms | █  23
  39 ms | █  31
  40 ms | ██  65
  41 ms | ███  116
  42 ms | ████  151
  43 ms | ████  151
  44 ms | ███  96
  45 ms | █  52
  46 ms | █  27
  47 ms |   6
  48 ms |   3
  49 ms |   3
  68 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `20.09`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `113.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `69.57`
- `fps_1pct_low` = `21.79`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194805 ms  |  Sample ticks: 3600

**FPS**  avg `97.54`, min `7.40`, p50 `76.29`, p95 `269.18`, p99 `365.90`, 1%low `17.92`, 0.1%low `14.26`, std `82.47`

**Frame time (ms)**  avg `18.83`, p50 `13.11`, p95 `48.34`, p99 `52.61`, p99.9 `58.43`, max `135.11`

**Client tick (ms)**  avg `0.74`, p95 `0.98`, max `1.65`

**Memory**  start `4722 MB`, end `4509 MB`, peak `5612 MB`, GC `26 events / 312 ms`

**FPS over sampling window (ASCII):**

```
148.1 |                                                             █                  
141.5 |                                                             █ █                
134.8 |█                                                            ███                
128.2 |█                                                           ████  █             
121.5 |█                                                       ██  ███████ ██          
114.9 |█                                                       ███████████████         
108.2 |█     █                                               ████████████████████      
101.5 |█ █   ██                                  █           ████████████████████ █████
 94.9 |████████      ██                         ██   ████   ███████████████████████████
 88.2 |█████████ ██████    █           ███████ ███  ███████████████████████████████████
 81.6 |███████████████████████ ██████ █████████████████████████████████████████████████
 74.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███████████  173
   3 ms | ███████████████████████████████  499
   4 ms | ████████████████████████████████████████  648
   5 ms | ██████████████████████████████████  547
   6 ms | ███████████████████  306
   7 ms | ███████████  171
   8 ms | █████████████  211
   9 ms | ██████████████████████  363
  10 ms | █████████████████████████████████████  597
  11 ms | ████████████████████████████████████████  646
  12 ms | ███████████████████████████████████  564
  13 ms | █████████████████████  345
  14 ms | ███████████  180
  15 ms | ████  72
  16 ms | █  21
  17 ms |   8
  18 ms |   5
  19 ms | ██  37
  20 ms | █████  85
  21 ms | ████████████████  265
  22 ms | █████████████████████████  409
  23 ms | ████████████████████████████  454
  24 ms | ██████████████████████████  414
  25 ms | ██████████████  232
  26 ms | ██████  104
  27 ms | ████  69
  28 ms | ████  67
  29 ms | ███████  112
  30 ms | ████████  133
  31 ms | █████████  141
  32 ms | █████████  153
  33 ms | ██████████  169
  34 ms | █████████  146
  35 ms | ██████  98
  36 ms | ████  72
  37 ms | ███  42
  38 ms | ███  41
  39 ms | ██  29
  40 ms | █  22
  41 ms | █  11
  42 ms | █  15
  43 ms | ██  31
  44 ms | ███  46
  45 ms | ██████  96
  46 ms | █████  88
  47 ms | ███████  106
  48 ms | ██████  103
  49 ms | ██████  104
  50 ms | ██████  93
  51 ms | █████  75
  52 ms | ███  56
  53 ms | ██  35
  54 ms | █  19
  55 ms | █  10
  56 ms |   3
  57 ms |   3
  58 ms |   3
  61 ms |   1
  62 ms |   3
  63 ms |   1
  64 ms |   1
  65 ms |   2
 135 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `14.26`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `113.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `53.09`
- `fps_1pct_low` = `17.92`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`

