# MC Benchmark Core session — 2026-10-02T14:19:06.356827195+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1216.8 | 118.7 | 56.0 | 4.52 | 1.19 | 102 | 1480 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 902.1 | 113.9 | 56.2 | 4.75 | 1.16 | 91 | 834 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 742.3 | 104.2 | 58.0 | 5.29 | 1.04 | 97 | 1120 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 508.4 | 75.6 | 42.0 | 6.75 | 1.20 | 66 | 1779 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 866.0 | 120.6 | 55.4 | 4.29 | 0.98 | 91 | 623 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 833.4 | 114.8 | 45.2 | 4.40 | 0.70 | 59 | 2790 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 736.3 | 102.0 | 50.1 | 4.90 | 1.14 | 82 | 1723 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 382.6 | 67.8 | 41.3 | 7.56 | 1.77 | 46 | 1213 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 997.8 | 85.5 | 38.4 | 7.05 | 5.20 | 71 | 2897 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 277.6 | 70.2 | 50.1 | 11.75 | 4.64 | 41 | 1351 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 565.2 | 86.3 | 57.4 | 7.56 | 1.47 | 101 | 1497 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 501.4 | 83.5 | 46.8 | 6.65 | 0.86 | 66 | 1067 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 790.3 | 73.7 | 37.3 | 9.16 | 4.82 | 34 | 2655 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 924.8 | 85.9 | 43.6 | 7.50 | 3.91 | 40 | 1433 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1327.5 | 21.9 | 14.8 | 38.18 | 19.17 | 28 | 1580 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1263.3 | 18.4 | 11.2 | 44.11 | 19.71 | 30 | 0 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1395.7 | 112.4 | 47.8 | 5.23 | 3.00 | 71 | 1143 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1165.3 | 101.1 | 44.4 | 5.74 | 2.77 | 67 | 351 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 698.5 | 98.6 | 45.0 | 5.31 | 1.01 | 61 | 412 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1583.0 | 183.3 | 45.3 | 2.41 | 0.41 | 44 | 2624 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1616.1 | 172.0 | 47.0 | 2.67 | 0.35 | 47 | 1483 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1393.8 | 115.4 | 39.3 | 4.63 | 0.54 | 40 | 3230 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1478.7 | 192.9 | 47.1 | 2.12 | 0.48 | 43 | 2393 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 1986.9 | 287.8 | 85.5 | 1.71 | 0.36 | 24 | 2141 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1702.1 | 246.4 | 83.5 | 1.97 | 0.35 | 25 | 869 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 1990.8 | 278.7 | 89.1 | 1.80 | 0.33 | 27 | 1645 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 1844.1 | 267.8 | 88.3 | 1.90 | 0.33 | 29 | 1211 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 1866.3 | 292.4 | 88.2 | 1.73 | 0.32 | 24 | 1948 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 1852.0 | 275.7 | 96.2 | 1.99 | 0.34 | 23 | 1087 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 1934.6 | 293.5 | 95.4 | 1.81 | 0.34 | 22 | 1447 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 1717.6 | 222.8 | 79.6 | 2.29 | 0.35 | 25 | 1979 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 1752.6 | 273.9 | 88.2 | 1.85 | 0.38 | 23 | 1886 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 2063.1 | 350.4 | 105.1 | 1.49 | 0.27 | 18 | 1547 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 1682.5 | 245.5 | 82.5 | 2.18 | 0.37 | 22 | 1472 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 2213.6 | 385.8 | 121.9 | 1.33 | 0.30 | 18 | 747 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1585.1 | 187.2 | 47.5 | 2.23 | 0.40 | 42 | 1355 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 159.3 | 30.1 | 21.0 | 26.54 | 7.94 | 39 | 571 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1510.3 | 182.3 | 46.4 | 2.42 | 0.46 | 43 | 820 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1530.0 | 183.3 | 47.6 | 2.42 | 0.40 | 43 | 200 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1376.8 | 175.2 | 43.9 | 2.54 | 0.42 | 41 | 2120 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1196.2 | 152.1 | 44.5 | 3.30 | 0.46 | 40 | 1396 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 233.1 | 35.4 | 10.5 | 14.76 | 1.01 | 197 | 1191 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 238.3 | 122.1 | 79.2 | 7.28 | 0.68 | 38 | 2024 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 110.6 | 76.7 | 48.8 | 11.78 | 0.69 | 30 | 2743 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 84.1 | 58.4 | 42.3 | 15.95 | 0.70 | 26 | 1966 |

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

Category: **Particles**  |  Duration: 23130 ms  |  Sample ticks: 400

**FPS**  avg `1216.75`, min `33.74`, p50 `1267.08`, p95 `1693.52`, p99 `1923.20`, 1%low `118.68`, 0.1%low `55.96`, std `335.59`

**Frame time (ms)**  avg `0.99`, p50 `0.79`, p95 `1.85`, p99 `4.52`, p99.9 `13.79`, max `29.64`

**Client tick (ms)**  avg `1.19`, p95 `3.13`, max `15.13`

**Memory**  start `767 MB`, end `1072 MB`, peak `2247 MB`, GC `102 events / 661 ms`

**FPS over sampling window (ASCII):**

```
1652.3 |                                                                   ██           
1573.3 |                                                                 ████           
1494.2 |                                                            ██   █████          
1415.1 |                                                            ███  ███████        
1336.1 |                                      █   ██    █  █  ███   ███ ████████   █    
1257.0 |                   ██  ███   █  ███   ██ ████ ████ █████████████████████████   █
1178.0 |          ██       ████████ ███ ████████ ███████████████████████████████████   █
1098.9 |         ████████  █████████████████████ ████████████████████████████████████ ██
1019.8 |  █      ████████ ██████████████████████████████████████████████████████████████
940.8 |  ██   █████████████████████████████████████████████████████████████████████████
861.7 | ███████████████████████████████████████████████████████████████████████████████
782.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16246
   1 ms | ████████  3214
   2 ms | █  450
   3 ms |   132
   4 ms |   99
   5 ms |   47
   6 ms |   19
   7 ms |   8
   8 ms |   14
   9 ms |   11
  10 ms |   12
  11 ms |   13
  12 ms |   11
  13 ms |   6
  14 ms |   5
  15 ms |   4
  16 ms |   2
  17 ms |   2
  19 ms |   2
  20 ms |   1
  21 ms |   2
  24 ms |   1
  29 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `sculk_charge_pop` | 240 | 2537 | 923.7 | 8.85 |
| `ALL_TOGETHER` | 1680 | 2537 | 1114.9 | 4.73 |
| `portal` | 160 | 2537 | 1212.3 | 3.56 |
| `end_rod` | 240 | 2537 | 1216.8 | 3.81 |
| `dragon_breath` | 160 | 2537 | 1250.3 | 3.61 |
| `dripping_water` | 240 | 2537 | 1296.4 | 2.86 |
| `flame` | 160 | 2537 | 1482.0 | 2.39 |
| `smoke` | 160 | 2537 | 1238.3 | 3.04 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `55.96`
- `fps_harmonic_avg` = `1014.78`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `0.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `118.68`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `902.10`, min `40.40`, p50 `950.74`, p95 `1147.25`, p99 `1409.33`, 1%low `113.91`, 0.1%low `56.17`, std `223.84`

**Frame time (ms)**  avg `1.28`, p50 `1.05`, p95 `2.35`, p99 `4.75`, p99.9 `15.04`, max `24.76`

**Client tick (ms)**  avg `1.16`, p95 `1.92`, max `21.12`

**Memory**  start `1366 MB`, end `1300 MB`, peak `2200 MB`, GC `91 events / 700 ms`

**FPS over sampling window (ASCII):**

```
1081.0 |█                                                                               
1044.8 |█                                              █                                
1008.5 |█                           █                  █                          █     
972.3 |█              ██     █    ██   █   █ █        ██      █  █ █     █   █   ██    
936.1 |█ █    █       ██ █   █   ███   ██  ████  ██   ███     █  ███  ████  ██   ████  
899.8 |█ █    ██   ██ ██ █ ███   ███   ██  ████ ████ ████   ███  █████████ ███ █ ████  
863.6 |█ ████████  ██ █████████ ██████████ ████ ████ █████  ███ ██████████ ███ ██████ █
827.3 |█ ████████  ████████████████████████████████████████████ █████████████████████ █
791.1 |█ ████████  ████████████████████████████████████████████ ███████████████████████
754.9 |███████████ ████████████████████████████████████████████████████████████████████
718.6 |███████████ ████████████████████████████████████████████████████████████████████
682.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████████  5695
   1 ms | ████████████████████████████████████████  8829
   2 ms | ███  676
   3 ms | █  217
   4 ms |   107
   5 ms |   51
   6 ms |   12
   7 ms |   14
   8 ms |   9
   9 ms |   5
  10 ms |   6
  11 ms |   4
  12 ms |   11
  13 ms |   8
  14 ms |   6
  15 ms |   4
  16 ms |   2
  17 ms |   3
  18 ms |   4
  20 ms |   2
  24 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `60.00`
- `fps_harmonic_avg` = `783.28`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `56.17`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `113.91`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `742.31`, min `43.96`, p50 `776.70`, p95 `956.54`, p99 `1169.51`, 1%low `104.20`, 0.1%low `57.98`, std `174.94`

**Frame time (ms)**  avg `1.52`, p50 `1.29`, p95 `2.55`, p99 `5.29`, p99.9 `14.45`, max `22.75`

**Client tick (ms)**  avg `1.04`, p95 `1.89`, max `9.79`

**Memory**  start `1093 MB`, end `1290 MB`, peak `2213 MB`, GC `97 events / 694 ms`

**FPS over sampling window (ASCII):**

```
855.2 |                                █                                               
824.9 |                    █           █                           █     █     █       
794.7 |              ███ █ █           █            █    ███  ███  █    ██   ███  ███  
764.4 |█   █  █   ██ █████ ██   █ █  ███ ██    █    ██  ████ ████ ██    ██ █ ███  ████ 
734.2 |██  █ ███ ███ █████ ██   ███  ███ ████████  ███ █████ ████ ████ █████ ████ ████ 
703.9 |███ █ █████████████ ██   ███ ████ █████████ ███ ███████████████ █████ ████ ████ 
673.7 |███ ███████████████████  ███ ████ █████████████████████████████ ████████████████
643.4 |███ ███████████████████ ████ ████ █████████████████████████████ ████████████████
613.2 |███████████████████████ ███████████████████████████████████████ ████████████████
582.9 |███████████████████████ ████████████████████████████████████████████████████████
552.7 |███████████████████████ ████████████████████████████████████████████████████████
522.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  500
   1 ms | ████████████████████████████████████████  11366
   2 ms | ███  888
   3 ms | █  217
   4 ms |   78
   5 ms |   44
   6 ms |   19
   7 ms |   11
   8 ms |   9
   9 ms |   9
  10 ms |   7
  11 ms |   12
  12 ms |   6
  13 ms |   8
  14 ms |   11
  15 ms |   3
  16 ms |   1
  17 ms |   1
  18 ms |   3
  20 ms |   1
  22 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `28.00`
- `fps_harmonic_avg` = `659.77`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `57.98`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `104.20`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `508.35`, min `39.74`, p50 `518.21`, p95 `695.77`, p99 `1050.37`, 1%low `75.62`, 0.1%low `41.95`, std `147.30`

**Frame time (ms)**  avg `2.25`, p50 `1.93`, p95 `4.02`, p99 `6.75`, p99.9 `22.04`, max `25.16`

**Client tick (ms)**  avg `1.20`, p95 `1.94`, max `15.29`

**Memory**  start `1418 MB`, end `2531 MB`, peak `3198 MB`, GC `66 events / 659 ms`

**FPS over sampling window (ASCII):**

```
777.3 |█                                                                               
738.1 |█    █                                                                          
698.8 |█  █ █                                                                          
659.6 |█ ██ █                                                                          
620.4 |█ █████   █                                                                     
581.1 |█ █████   █                          █          █                            █  
541.9 |█ ██████ ██   █     ██  █ █   █ █    █  ██   ██ █   █       █  ████     █    █  
502.6 |████████████  ██   ███  █ ██ ████    █  ██  █████   █ █  ██ ██ █████  ████   ██ 
463.4 |█████████████ ██  ████ ███████████ █ █  ███████████████  ███████████  ████ ████ 
424.1 |████████████████  ██████████████████ ███████████████████ ███████████████████████
384.9 |████████████████ ███████████████████████████████████████████████████████████████
345.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  113
   1 ms | ████████████████████████████████████████  4932
   2 ms | ███████████████████████  2820
   3 ms | █████  562
   4 ms | ██  214
   5 ms | █  111
   6 ms |   46
   7 ms |   17
   8 ms |   11
   9 ms |   4
  10 ms |   4
  11 ms |   1
  12 ms |   4
  13 ms |   2
  14 ms |   3
  15 ms |   5
  16 ms |   2
  17 ms |   5
  18 ms |   3
  19 ms |   4
  20 ms |   3
  21 ms |   4
  22 ms |   3
  23 ms |   2
  24 ms |   3
  25 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `34.00`
- `fps_harmonic_avg` = `443.94`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `41.95`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `75.62`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `865.96`, min `48.80`, p50 `896.14`, p95 `1154.11`, p99 `1375.70`, 1%low `120.57`, 0.1%low `55.41`, std `202.78`

**Frame time (ms)**  avg `1.30`, p50 `1.12`, p95 `2.17`, p99 `4.29`, p99.9 `15.08`, max `20.49`

**Client tick (ms)**  avg `0.98`, p95 `1.50`, max `12.53`

**Memory**  start `1765 MB`, end `1482 MB`, peak `2389 MB`, GC `91 events / 678 ms`

**FPS over sampling window (ASCII):**

```
1068.2 |█                                                                               
1031.9 |█                               █                                               
995.6 |█              █                ██                                              
959.4 |█    █    █    █             █  ████                                 █          
923.1 |█ █ ██    █  █ █       █    ██  ████         █    █  █ █       ██   ███  █      
886.8 |███ ██    ██ ███    █  ██   ██  ████  ███  █ █    █ ████   ██  ███  ███  ██ █  █
850.5 |██████   ████████ ███  ██   ███ █████ ████ ███    █ ████   ██  ███  ███  ████  █
814.3 |███████  ████████ ████ ███ ████ ███████████████ ███ ████ █████████  ███ █████ ██
778.0 |███████ ██████████████████ ████████████████████ ███████████████████ ████████████
741.7 |██████████████████████████ ████████████████████ ███████████████████ ████████████
705.4 |███████████████████████████████████████████████ ████████████████████████████████
669.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  2678
   1 ms | ████████████████████████████████████████  11787
   2 ms | ██  642
   3 ms | █  159
   4 ms |   66
   5 ms |   29
   6 ms |   15
   7 ms |   8
   8 ms |   7
   9 ms |   5
  10 ms |   7
  11 ms |   8
  12 ms |   4
  13 ms |   7
  14 ms |   4
  15 ms |   1
  16 ms |   3
  17 ms |   6
  18 ms |   2
  19 ms |   1
  20 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `49.00`
- `fps_harmonic_avg` = `772.12`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `55.41`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `120.57`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `833.36`, min `38.56`, p50 `864.55`, p95 `1073.03`, p99 `1388.72`, 1%low `114.79`, 0.1%low `45.17`, std `199.72`

**Frame time (ms)**  avg `1.35`, p50 `1.16`, p95 `2.21`, p99 `4.40`, p99.9 `17.94`, max `25.93`

**Client tick (ms)**  avg `0.70`, p95 `1.21`, max `2.70`

**Memory**  start `1212 MB`, end `3748 MB`, peak `4002 MB`, GC `59 events / 630 ms`

**FPS over sampling window (ASCII):**

```
1201.4 |█                                                                               
1153.8 |█                                                                               
1106.1 |██                                                                              
1058.5 |██                                                                              
1010.9 |██                                                                              
963.2 |██              █                                                               
915.6 |██    █         █     ██                                   █ █         █        
868.0 |█████ ███   ███ ███   ██  █              ██       █ ███    █ ████ █ ██████      
820.3 |██████████ ████ ███  ███  ███  ███ ██   ███ ██   ████████  ███████████████████  
772.7 |███████████████████ ████ █████ ██████   ███ ███ ██████████ ███████████████████  
725.0 |██████████████████████████████████████ ███████████████████ ███████████████████ █
677.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  1580
   1 ms | ████████████████████████████████████████  12258
   2 ms | ██  663
   3 ms |   148
   4 ms |   71
   5 ms |   51
   6 ms |   14
   7 ms |   2
   8 ms |   4
   9 ms |   2
  10 ms |   5
  11 ms |   5
  13 ms |   5
  14 ms |   2
  15 ms |   6
  17 ms |   4
  18 ms |   3
  19 ms |   2
  20 ms |   2
  21 ms |   2
  24 ms |   2
  25 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `71.00`
- `fps_harmonic_avg` = `741.74`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `45.17`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `114.79`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `736.33`, min `22.98`, p50 `767.37`, p95 `966.09`, p99 `1128.94`, 1%low `101.96`, 0.1%low `50.12`, std `172.71`

**Frame time (ms)**  avg `1.53`, p50 `1.30`, p95 `2.54`, p99 `4.90`, p99.9 `15.70`, max `43.52`

**Client tick (ms)**  avg `1.14`, p95 `1.76`, max `15.55`

**Memory**  start `852 MB`, end `1358 MB`, peak `2575 MB`, GC `82 events / 706 ms`

**FPS over sampling window (ASCII):**

```
854.2 |               █                                                                
828.6 |             █ █  █                                         █ █         █       
803.0 |█    █      ████  █                 ███    █                █ █  ███    ██      
777.5 |██ ███      ████  ████    █     █   ███  █ ██   █     ██   ████  ███    ██  █   
751.9 |██ ███  █   █████ ████  ███     █ █ ███  █████ ███    ██   ████  ███    ██  ██  
726.3 |██ ███  █  ██████ ████  ███     █ █ ████ █████ ███   █████ ████  ███   ███ ████ 
700.7 |██ ██████  ██████ █████ ████    ███ ████ █████ ███  ██████ ████  ████  ███ ████ 
675.1 |██████████ ██████ ██████████ █  ███ ████ █████ ███  █████████████████  ████████ 
649.6 |██████████████████████████████ ████ ███████████████ █████████████████ ██████████
624.0 |██████████████████████████████ ████ ███████████████ ████████████████████████████
598.4 |███████████████████████████████████████████████████ ████████████████████████████
572.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  512
   1 ms | ████████████████████████████████████████  11275
   2 ms | ███  928
   3 ms | █  191
   4 ms |   79
   5 ms |   43
   6 ms |   21
   7 ms |   3
   8 ms |   2
   9 ms |   4
  10 ms |   1
  11 ms |   6
  12 ms |   7
  13 ms |   7
  14 ms |   15
  15 ms |   6
  16 ms |   3
  17 ms |   5
  18 ms |   1
  19 ms |   1
  23 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `21.00`
- `fps_harmonic_avg` = `655.51`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `50.12`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `101.96`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `382.65`, min `35.52`, p50 `394.41`, p95 `499.37`, p99 `582.75`, 1%low `67.84`, 0.1%low `41.30`, std `88.17`

**Frame time (ms)**  avg `2.87`, p50 `2.54`, p95 `4.67`, p99 `7.56`, p99.9 `22.02`, max `28.16`

**Client tick (ms)**  avg `1.77`, p95 `2.43`, max `18.78`

**Memory**  start `2175 MB`, end `1510 MB`, peak `3388 MB`, GC `46 events / 602 ms`

**FPS over sampling window (ASCII):**

```
473.7 |               █                                                                
459.1 |               █                                                                
444.5 |           █   █                                                                
429.9 |  █        █   █ █               █   █                                          
415.4 |  ██       █ ███ █ █     █ █     █   █               █                       █  
400.8 |  ██      ██████ █ █     ███   █ ██  █         ██    ██    █     █ ██ █     ███ 
386.2 |  ██  ██ ███████████    ████   █ ███ ██       ████  ████ ███   ████████   █ ████
371.6 |  ██ ███████████████   ███████ ████████  █    █████ ████ ███   ████████   ██████
357.1 |  ██ ███████████████ █ ███████ ███████████ █ ███████████████   ████████ ████████
342.5 |████ █████████████████ ███████ █████████████████████████████ ███████████████████
327.9 |████ █████████████████ █████████████████████████████████████████████████████████
313.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███  341
   2 ms | ████████████████████████████████████████  5050
   3 ms | ███████  928
   4 ms | ███  379
   5 ms | █  126
   6 ms |   52
   7 ms |   22
   8 ms |   8
   9 ms |   10
  10 ms |   3
  11 ms |   2
  12 ms |   1
  13 ms |   1
  14 ms |   1
  15 ms |   1
  16 ms |   1
  17 ms |   4
  18 ms |   3
  19 ms |   5
  20 ms |   8
  21 ms |   5
  22 ms |   2
  23 ms |   2
  24 ms |   2
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `27.00`
- `fps_harmonic_avg` = `347.89`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `41.30`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `67.84`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `997.84`, min `18.21`, p50 `1047.43`, p95 `1305.76`, p99 `1572.64`, 1%low `85.47`, 0.1%low `38.36`, std `254.95`

**Frame time (ms)**  avg `1.24`, p50 `0.95`, p95 `2.12`, p99 `7.05`, p99.9 `18.19`, max `54.93`

**Client tick (ms)**  avg `5.20`, p95 `7.97`, max `23.71`

**Memory**  start `941 MB`, end `2861 MB`, peak `3838 MB`, GC `71 events / 725 ms`

**FPS over sampling window (ASCII):**

```
1117.9 |                                       █       █                              █ 
1088.1 |     █             █      █        █   █       █                 ██           █ 
1058.4 |   ███        ███  █      █       ██  ███ █   ██    █            ██  ███  █   ██
1028.6 |██ ███  █     ███  ███    ███ █   ██  ███ █  ████   █  █  █      ██  ███  █  ███
998.8 |██ ████ ██ █  ████ █████  ███ █   ██  █████  ████  ██  █  ██   █ ██  ███  █  ███
969.1 |██ █████████  ████ █████  ███████ ██  █████  █████ ███ █  ████ ████ ████  █  ███
939.3 |█████████████ ██████████ ████████ █████████  █████ ███████████ ████ ████  █  ███
909.6 |████████████████████████████████████████████ ██████████████████████ █████ █  ███
879.8 |█████████████████████████████████████████████████████████████████████████ ██ ███
850.1 |█████████████████████████████████████████████████████████████████████████ ██ ███
820.3 |████████████████████████████████████████████████████████████████████████████ ███
790.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9768
   1 ms | ██████████████████████  5439
   2 ms | █  307
   3 ms |   75
   4 ms |   51
   5 ms |   121
   6 ms | █  162
   7 ms |   61
   8 ms |   23
   9 ms |   8
  10 ms |   9
  11 ms |   10
  12 ms |   8
  13 ms |   5
  14 ms |   7
  15 ms |   9
  16 ms |   5
  17 ms |   3
  18 ms |   3
  19 ms |   2
  20 ms |   4
  21 ms |   1
  22 ms |   1
  25 ms |   2
  26 ms |   1
  28 ms |   1
  52 ms |   1
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `804.41`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `499.00`
- `fps_0p1pct_low` = `38.36`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `499.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `85.47`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `277.56`, min `47.11`, p50 `278.24`, p95 `413.32`, p99 `467.41`, 1%low `70.18`, 0.1%low `50.10`, std `87.29`

**Frame time (ms)**  avg `4.15`, p50 `3.59`, p95 `8.54`, p99 `11.75`, p99.9 `18.72`, max `21.23`

**Client tick (ms)**  avg `4.64`, p95 `6.45`, max `11.33`

**Memory**  start `1087 MB`, end `1767 MB`, peak `2439 MB`, GC `41 events / 207 ms`

**FPS over sampling window (ASCII):**

```
425.1 |                                         █                                      
402.6 |                                         █                                      
380.2 |                                       █ █                                      
357.7 |                                       ███████  █                               
335.2 |                             █         ███████  █   ██  █                       
312.7 |                             █        ████████████ ██████ ███  █ █ █  █   █ █  █
290.2 | ██             █         █  █        ███████████████████████  █████████ ███████
267.8 | ██             █  █      █  ██       ██████████████████████████████████████████
245.3 |█████  █ █      █  ██   █ █  ██  █    ██████████████████████████████████████████
222.8 |██████████████ ██████ █ ████ ██ ██   ███████████████████████████████████████████
200.3 |████████████████████████████ ██ ██ █ ███████████████████████████████████████████
177.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   9
   2 ms | ████████████████████████████  1295
   3 ms | ████████████████████████████████████████  1823
   4 ms | ██████████████████  836
   5 ms | ███████  304
   6 ms | ██  104
   7 ms | ███  144
   8 ms | ███  123
   9 ms | ██  85
  10 ms | █  32
  11 ms | █  24
  12 ms |   18
  13 ms |   8
  14 ms |   4
  15 ms |   5
  16 ms |   1
  17 ms |   1
  18 ms |   4
  20 ms |   2
  21 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `items_alive_p50` = `1240.00`
- `entity_count_sample_end` = `1561.00`
- `entity_count_sample_start` = `681.00`
- `items_alive_max` = `1560.00`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `70.18`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `241.15`
- `preload_duration_ms` = `35.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `50.10`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`
- `items_alive_p95` = `1560.00`
- `preset_full` = `0.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `565.22`, min `51.88`, p50 `591.61`, p95 `758.40`, p99 `907.45`, 1%low `86.27`, 0.1%low `57.44`, std `154.77`

**Frame time (ms)**  avg `2.04`, p50 `1.69`, p95 `3.93`, p99 `7.56`, p99.9 `15.81`, max `19.28`

**Client tick (ms)**  avg `1.47`, p95 `2.18`, max `4.98`

**Memory**  start `945 MB`, end `1958 MB`, peak `2443 MB`, GC `101 events / 701 ms`

**FPS over sampling window (ASCII):**

```
696.9 |                          █                                                     
675.9 |                          █                          █                          
655.0 |                          █            █            ███   █                     
634.1 |                          █            █    █    █  ███   █     █    █    █     
613.2 |█      █          ██  █   ██           ██   █  ███  ███   ██    █  ███    ██   █
592.3 |█  █   █     █    ██  █   ██   █      ███   █  ███  ████  ███  ██  ████  ███   █
571.3 |█  █   █ █  ██    ██ ███ ███   █      ███  ██  ███  ████  ███ ███  ████ ████  ██
550.4 |█ ███ ████  ██ █  ██ ███████  ███ █   ███  ██  ████ ████  ███ ████ ████ ████  ██
529.5 |█ ███ ████  ██ █ ███ ███████  ███ ██  ████ ███ █████████ ████ ████ ████ ████  ██
508.6 |█████ ████ █████ ███████████  ███ ██  ████ █████████████ ████ ████ ████ ████  ██
487.7 |█████ ███████████████████████ ███ ██████████████████████ ███████████████████  ██
466.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   24
   1 ms | ████████████████████████████████████████  7184
   2 ms | █████████  1613
   3 ms | ███  507
   4 ms | █  192
   5 ms | █  106
   6 ms |   48
   7 ms |   28
   8 ms |   11
   9 ms |   17
  10 ms |   10
  11 ms |   10
  12 ms |   12
  13 ms |   5
  14 ms |   9
  15 ms |   5
  16 ms |   4
  17 ms |   2
  18 ms |   2
  19 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `fps_0p1pct_low` = `57.44`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `489.62`
- `fps_1pct_low` = `86.27`
- `preload_duration_ms` = `15.00`
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

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `501.44`, min `40.46`, p50 `499.16`, p95 `802.71`, p99 `963.46`, 1%low `83.53`, 0.1%low `46.84`, std `150.85`

**Frame time (ms)**  avg `2.27`, p50 `2.00`, p95 `3.89`, p99 `6.65`, p99.9 `18.94`, max `24.72`

**Client tick (ms)**  avg `0.86`, p95 `1.82`, max `4.85`

**Memory**  start `2000 MB`, end `2654 MB`, peak `3068 MB`, GC `66 events / 601 ms`

**FPS over sampling window (ASCII):**

```
823.7 |                                                    █                           
782.0 |                                                    █                           
740.3 |                                                    █                           
698.6 |                                                    █                           
656.9 |               █                             █     ██                           
615.2 |      █        █  █         █                █     ██                           
573.5 |      █        █  █ █       █       █   █   ██   ████            █      █ █     
531.8 |    █ █        █ ██ █       ███     █   █   ███ ███████ █  ██   ███     █ ██ █  
490.1 |  █ ████       ██████   █   ████  ███ █ █ █ ███ ███████████████████  ███████████
448.4 |█ ██████   █  ███████ ████  ████ ███████████████████████████████████████████████
406.7 |████████ █████████████████  ████████████████████████████████████████████████████
365.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  55
   1 ms | ████████████████████████████████████████  4329
   2 ms | ████████████████████████████████  3506
   3 ms | █████  526
   4 ms | ██  188
   5 ms | █  100
   6 ms |   47
   7 ms |   16
   8 ms |   15
   9 ms |   6
  10 ms |   3
  11 ms |   1
  12 ms |   1
  13 ms |   3
  14 ms |   4
  15 ms |   2
  16 ms |   4
  17 ms |   7
  18 ms |   6
  19 ms |   3
  20 ms |   2
  21 ms |   1
  22 ms |   1
  23 ms |   1
  24 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `83.53`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `441.44`
- `preload_duration_ms` = `14.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `46.84`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`
- `doors_placed` = `16.00`
- `preset_full` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `790.31`, min `19.87`, p50 `890.49`, p95 `1182.69`, p99 `1326.21`, 1%low `73.72`, 0.1%low `37.32`, std `296.53`

**Frame time (ms)**  avg `1.69`, p50 `1.12`, p95 `3.53`, p99 `9.16`, p99.9 `19.63`, max `50.32`

**Client tick (ms)**  avg `4.82`, p95 `8.58`, max `22.52`

**Memory**  start `1002 MB`, end `1794 MB`, peak `3658 MB`, GC `34 events / 314 ms`

**FPS over sampling window (ASCII):**

```
1303.6 |                                                                               █
1211.9 |                                                                             ███
1120.3 |                                                        ██                 █████
1028.6 |                   ██   ████                          ████          ███ ████████
937.0 |                   ████████████████               █  █████   ████ ██████████████
845.4 |                  █████████████████            ███████████   ███████████████████
753.7 |                  █████████████████        ███████████████   ███████████████████
662.1 |                  █████████████████       ████████████████   ███████████████████
570.4 |         ██ ██ ██ ██████████████████      ████████████████   ███████████████████
478.8 |     █████████████████████████████████    █████████████████ ████████████████████
387.2 |██ █████████████████████████████████████████████████████████████████████████████
295.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████  3266
   1 ms | ████████████████████████████████████████  5739
   2 ms | █████████████  1914
   3 ms | ███  501
   4 ms | █  119
   5 ms |   53
   6 ms |   38
   7 ms |   39
   8 ms |   59
   9 ms |   29
  10 ms |   28
  11 ms |   17
  12 ms |   12
  13 ms |   6
  14 ms |   5
  15 ms |   5
  16 ms |   2
  17 ms |   3
  19 ms |   8
  21 ms |   1
  22 ms |   1
  24 ms |   1
  25 ms |   2
  26 ms |   2
  27 ms |   1
  32 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `73.72`
- `fps_harmonic_avg` = `592.80`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `119.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `37.32`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.13`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `924.77`, min `35.23`, p50 `983.34`, p95 `1399.85`, p99 `1513.26`, 1%low `85.94`, 0.1%low `43.55`, std `355.60`

**Frame time (ms)**  avg `1.44`, p50 `1.02`, p95 `3.06`, p99 `7.50`, p99.9 `17.05`, max `28.39`

**Client tick (ms)**  avg `3.91`, p95 `8.40`, max `24.66`

**Memory**  start `1940 MB`, end `2490 MB`, peak `3373 MB`, GC `40 events / 341 ms`

**FPS over sampling window (ASCII):**

```
1447.1 |                                                                              ██
1347.3 |                     █  █  █                                   ██        █ █████
1247.5 |                    █████████                                ████      █████████
1147.7 |                   ███████████                              ██████  ████████████
1047.9 |                   ████████████                  ███ ███    ██████ █████████████
948.1 |                 █████████████████              █████████   ████████████████████
848.2 |                 █████████████████         ███ ██████████   ████████████████████
748.4 |       █     ██  █████████████████         ██████████████   ████████████████████
648.6 |       █  █████████████████████████ █    █ ████████████████ ████████████████████
548.8 |       ██ ██████████████████████████████ ██████████████████ ████████████████████
449.0 |█   █ ██████████████████████████████████████████████████████████████████████████
349.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6769
   1 ms | ██████████████████████████████  5093
   2 ms | ████████  1282
   3 ms | ██  315
   4 ms | █  137
   5 ms | █  98
   6 ms |   38
   7 ms |   38
   8 ms |   32
   9 ms |   22
  10 ms |   14
  11 ms |   10
  12 ms |   7
  13 ms |   4
  14 ms |   2
  15 ms |   6
  16 ms |   9
  17 ms |   1
  18 ms |   1
  19 ms |   1
  21 ms |   5
  24 ms |   3
  27 ms |   2
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `85.94`
- `fps_harmonic_avg` = `694.48`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `50.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `43.55`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.70`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1327.47`, min `8.81`, p50 `1400.27`, p95 `2972.12`, p99 `3245.83`, 1%low `21.89`, 0.1%low `14.82`, std `909.87`

**Frame time (ms)**  avg `3.06`, p50 `0.71`, p95 `15.75`, p99 `38.18`, p99.9 `51.94`, max `113.57`

**Client tick (ms)**  avg `19.17`, p95 `33.04`, max `67.14`

**Memory**  start `1139 MB`, end `2339 MB`, peak `2720 MB`, GC `28 events / 136 ms`

**FPS over sampling window (ASCII):**

```
3081.9 |                                                                            ██ █
2818.9 |                                                                            ████
2555.9 |                                                                            ████
2292.8 |                                                       █       █ ████       ████
2029.8 |                         ████     █████    ██       █████      ███████      ████
1766.8 |                   ██    █████    █████    ████     ██████     ████████     ████
1503.8 |                   ███   █████    ██████   █████   ████████    ████████    █████
1240.8 |                  ████   ██████  ███████   █████   ████████    █████████   █████
977.7 |███           ██  ████   ██████  ███████   ██████  █████████   █████████   █████
714.7 |███     █ █   ██  █████  ██████  ████████  ██████  █████████  ███████████  █████
451.7 |███ ███████  ████ █████  ███████ ████████ ████████ ██████████ ███████████  █████
188.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  3873
   1 ms | ████████  800
   2 ms | ███  292
   3 ms | ███  289
   4 ms | ██████  602
   5 ms | █  111
   6 ms |   42
   7 ms |   43
   8 ms |   36
   9 ms |   48
  10 ms |   27
  11 ms |   7
  12 ms |   6
  13 ms |   7
  14 ms |   15
  15 ms |   21
  16 ms |   16
  17 ms |   21
  18 ms |   25
  19 ms |   17
  20 ms |   10
  21 ms |   7
  22 ms |   10
  23 ms |   10
  24 ms |   32
  25 ms |   16
  26 ms |   15
  27 ms |   6
  28 ms |   14
  29 ms |   9
  30 ms |   11
  31 ms |   2
  32 ms |   15
  33 ms |   7
  34 ms |   2
  35 ms |   2
  36 ms |   6
  37 ms |   4
  38 ms |   8
  39 ms |   3
  40 ms |   8
  41 ms |   9
  42 ms |   7
  43 ms |   5
  44 ms |   6
  45 ms |   6
  46 ms |   2
  48 ms |   2
  50 ms |   1
  51 ms |   3
  52 ms |   2
  53 ms |   1
  55 ms |   1
  66 ms |   1
  79 ms |   1
 113 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4799.04`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `14.82`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `327.16`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `22401.00`
- `preload_duration_ms` = `7.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `21.89`
- `falling_blocks_alive_p50` = `4800.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `1263.26`, min `9.66`, p50 `1396.72`, p95 `2626.29`, p99 `3128.27`, 1%low `18.35`, 0.1%low `11.25`, std `871.00`

**Frame time (ms)**  avg `3.90`, p50 `0.72`, p95 `21.51`, p99 `44.11`, p99.9 `63.50`, max `103.52`

**Client tick (ms)**  avg `19.71`, p95 `35.05`, max `47.64`

**Memory**  start `2589 MB`, end `1159 MB`, peak `2589 MB`, GC `30 events / 156 ms`

**FPS over sampling window (ASCII):**

```
2808.8 |                                                                            █ ██
2559.7 |                                                                           █████
2310.6 |                                                                           █████
2061.5 |                                   █              █████       ██████       █████
1812.3 |             ██     █            ████    █████    ██████      ████████     █████
1563.2 |             ██    ██     ███    █████   █████    ███████     ████████     █████
1314.1 | █           ███   ███    ████   █████   ██████   ████████    █████████   ██████
1065.0 |███         ████   ████  █████   █████   ██████   ████████   ██████████   ██████
815.9 |████        █████  ████  █████  ███████  ███████  █████████  ███████████  ██████
566.7 |████        █████  ████  ██████ ███████  ███████  █████████  ███████████  ██████
317.6 |█████   █  ███████ █████ ██████ ████████ ████████ ██████████ ████████████ ██████
 68.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  3088
   1 ms | ███████  507
   2 ms | ███  246
   3 ms | ██  118
   4 ms | ██  123
   5 ms | █  113
   6 ms | ████  337
   7 ms | █  94
   8 ms |   31
   9 ms |   19
  10 ms |   25
  11 ms |   20
  12 ms |   22
  13 ms |   15
  14 ms |   6
  15 ms |   8
  16 ms |   28
  17 ms |   18
  18 ms |   17
  19 ms |   7
  20 ms |   23
  21 ms |   21
  22 ms |   16
  23 ms |   9
  24 ms |   4
  25 ms |   13
  26 ms |   14
  27 ms |   34
  28 ms |   10
  29 ms |   20
  30 ms |   8
  31 ms |   5
  32 ms |   5
  33 ms |   5
  34 ms |   5
  35 ms |   13
  36 ms |   5
  37 ms |   6
  38 ms |   8
  39 ms |   2
  40 ms |   1
  41 ms |   4
  42 ms |   3
  43 ms |   4
  44 ms |   5
  45 ms |   6
  46 ms |   7
  47 ms |   5
  48 ms |   2
  49 ms |   3
  50 ms |   1
  51 ms |   1
  52 ms |   3
  53 ms |   4
  54 ms |   2
  55 ms |   1
  56 ms |   2
  58 ms |   1
  59 ms |   1
  60 ms |   1
  62 ms |   2
  63 ms |   1
  80 ms |   1
  83 ms |   1
  87 ms |   1
  89 ms |   1
 103 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4815.39`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `11.25`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `256.65`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `29227.00`
- `preload_duration_ms` = `5.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `18.35`
- `falling_blocks_alive_p50` = `4800.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1395.68`, min `36.98`, p50 `1380.95`, p95 `3001.31`, p99 `3224.19`, 1%low `112.43`, 0.1%low `47.82`, std `693.25`

**Frame time (ms)**  avg `1.02`, p50 `0.72`, p95 `2.12`, p99 `5.23`, p99.9 `17.07`, max `27.04`

**Client tick (ms)**  avg `3.00`, p95 `4.87`, max `18.79`

**Memory**  start `1705 MB`, end `2190 MB`, peak `2849 MB`, GC `71 events / 646 ms`

**FPS over sampling window (ASCII):**

```
3026.8 |                                                                            ████
2799.0 |                                                                    ██      ████
2571.3 |                                                                    ██    ██████
2343.6 |                                                                   ███    ██████
2115.8 |                                                                   ███    ██████
1888.1 |                                                                   ████  ███████
1660.4 |████                                           █  █              ███████████████
1432.6 |██████                             █  ██████ ███████████ ███████████████████████
1204.9 |███████                         █ ██████████████████████████████████████████████
977.2 |████████                █ ██████████████████████████████████████████████████████
749.4 |█████████  ██ ██  ██████████████████████████████████████████████████████████████
521.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13541
   1 ms | ███████████████  4986
   2 ms | ██  578
   3 ms | █  188
   4 ms |   150
   5 ms |   112
   6 ms |   30
   7 ms |   16
   8 ms |   8
   9 ms |   4
  10 ms |   4
  11 ms |   10
  12 ms |   6
  13 ms |   4
  14 ms |   7
  15 ms |   3
  16 ms |   1
  17 ms |   5
  18 ms |   1
  19 ms |   3
  20 ms |   3
  21 ms |   2
  22 ms |   2
  24 ms |   2
  26 ms |   1
  27 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.88`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `47.82`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `983.40`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3136.00`
- `preload_duration_ms` = `52.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `112.43`
- `falling_blocks_alive_p50` = `686.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1165.27`, min `28.86`, p50 `1276.79`, p95 `1805.16`, p99 `2416.65`, 1%low `101.13`, 0.1%low `44.38`, std `509.24`

**Frame time (ms)**  avg `1.22`, p50 `0.78`, p95 `2.87`, p99 `5.74`, p99.9 `17.81`, max `34.66`

**Client tick (ms)**  avg `2.77`, p95 `4.13`, max `10.27`

**Memory**  start `2644 MB`, end `2136 MB`, peak `2996 MB`, GC `67 events / 658 ms`

**FPS over sampling window (ASCII):**

```
1822.9 |   █                                                                  █         
1693.8 |   █                                                               █  █         
1564.7 |   █                                       █            █     █ █  █  ███ █     
1435.6 |█  ████                                 █ ██       █ █  █   █████████████████ ██
1306.5 |███████                            ███ █████████  ██████████████████████████████
1177.4 |███████                        █ █ █████████████████████████████████████████████
1048.2 |████████                       █████████████████████████████████████████████████
919.1 |████████                     █ █████████████████████████████████████████████████
790.0 |████████          █  ██    █████████████████████████████████████████████████████
660.9 |█████████         █ ████████████████████████████████████████████████████████████
531.8 |█████████       ████████████████████████████████████████████████████████████████
402.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10136
   1 ms | ████████████████  4086
   2 ms | █████  1377
   3 ms | █  312
   4 ms | █  186
   5 ms | █  128
   6 ms |   54
   7 ms |   18
   8 ms |   12
   9 ms |   4
  10 ms |   3
  11 ms |   1
  12 ms |   3
  13 ms |   4
  14 ms |   4
  15 ms |   6
  16 ms |   4
  17 ms |   7
  18 ms |   3
  19 ms |   3
  20 ms |   2
  21 ms |   2
  22 ms |   1
  24 ms |   2
  27 ms |   1
  30 ms |   1
  34 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `618.99`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `44.38`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `818.05`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3087.00`
- `preload_duration_ms` = `11.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `101.13`
- `falling_blocks_alive_p50` = `686.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `698.54`, min `39.10`, p50 `699.31`, p95 `1019.38`, p99 `1258.22`, 1%low `98.61`, 0.1%low `44.96`, std `197.07`

**Frame time (ms)**  avg `1.64`, p50 `1.43`, p95 `2.79`, p99 `5.31`, p99.9 `20.27`, max `25.57`

**Client tick (ms)**  avg `1.01`, p95 `1.45`, max `16.09`

**Memory**  start `2870 MB`, end `3013 MB`, peak `3283 MB`, GC `61 events / 633 ms`

**FPS over sampling window (ASCII):**

```
1031.8 |     █                                                                          
987.1 |     █                                                                          
942.3 |     █ █                                                                        
897.6 |█  █████                                                                        
852.8 |████████          █                                                            █
808.0 |████████    █     █                                                     ██     █
763.3 |██████████  █ ███ ███    █                                     █        ██   ███
718.5 |██████████ ██████ ████   █  ██            █                    █ █ █    ██   ███
673.8 |███████████████████████  █ ███  █  █ ██ ████   ███             █████  ██████████
629.0 |███████████████████████  █████  ██ █ ████████  ███        █   ███████ ██████████
584.3 |███████████████████████████████ █████████████████████████████ ███████ ██████████
539.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  765
   1 ms | ████████████████████████████████████████  9877
   2 ms | ████  1082
   3 ms | █  260
   4 ms |   94
   5 ms |   68
   6 ms |   20
   7 ms |   7
   8 ms |   5
   9 ms |   3
  11 ms |   1
  12 ms |   3
  13 ms |   3
  14 ms |   2
  15 ms |   6
  17 ms |   5
  18 ms |   1
  19 ms |   6
  20 ms |   4
  21 ms |   3
  22 ms |   4
  24 ms |   1
  25 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `98.61`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `58.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `44.96`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `611.02`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1582.98`, min `31.81`, p50 `1629.79`, p95 `2166.58`, p99 `2861.38`, 1%low `183.26`, 0.1%low `45.28`, std `404.77`

**Frame time (ms)**  avg `0.72`, p50 `0.61`, p95 `1.25`, p99 `2.41`, p99.9 `15.12`, max `31.44`

**Client tick (ms)**  avg `0.41`, p95 `0.67`, max `2.51`

**Memory**  start `1930 MB`, end `4243 MB`, peak `4554 MB`, GC `44 events / 585 ms`

**FPS over sampling window (ASCII):**

```
2264.6 |                                             █                                  
2182.7 |                                             █                                  
2100.8 |                                             █                                  
2018.9 |                                             █                                  
1937.0 |                                            ██                                  
1855.1 |            █                               ██                  █               
1773.3 |           ██                               ██ ██         █     █    █          
1691.4 |         █████    █                    █    ██ ██         █     █    █      █   
1609.5 |███ █   ██████    ███          █       █ ██ ██ ███   █  ████ █ ███████ ██ ██████
1527.6 |███ █   ███████  ██████   █  ████   ███████ ██████  ██  ████████████████████████
1445.7 |███ █ ███████████████████ █ ████████████████████████████████████████████████████
1363.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19273
   1 ms | ███  1420
   2 ms |   173
   3 ms |   58
   4 ms |   43
   5 ms |   6
   6 ms |   2
   7 ms |   1
   8 ms |   2
  15 ms |   1
  16 ms |   1
  17 ms |   1
  18 ms |   1
  19 ms |   4
  20 ms |   3
  21 ms |   1
  22 ms |   3
  23 ms |   1
  24 ms |   1
  25 ms |   3
  26 ms |   1
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `34.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `45.28`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `1379.62`
- `fps_1pct_low` = `183.26`
- `entity_count_sample_end` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1616.11`, min `40.00`, p50 `1629.02`, p95 `2621.02`, p99 `2981.81`, 1%low `172.02`, 0.1%low `47.04`, std `460.37`

**Frame time (ms)**  avg `0.72`, p50 `0.61`, p95 `1.23`, p99 `2.67`, p99.9 `15.55`, max `25.00`

**Client tick (ms)**  avg `0.35`, p95 `0.50`, max `2.92`

**Memory**  start `2191 MB`, end `2661 MB`, peak `3674 MB`, GC `47 events / 605 ms`

**FPS over sampling window (ASCII):**

```
2738.8 |                                    █                                           
2611.5 |                                    █ █                                         
2484.1 |                                    █ █ █                                       
2356.8 |                                    █ █ █                                       
2229.4 |                        █           █ █ █                                       
2102.1 |           █            █           █ █ █ █                                     
1974.7 |          ██         █  █           █ █ █ █                                     
1847.4 |     █    ██         █  █          ████ █ ██                                    
1720.0 |     █    ██         █  █          █████████ █                                  
1592.7 |██   ████████  █  █████████  █    █████████████     █   █    ███████      █████ 
1465.3 |████ ████████████ ████████████████████████████████ ████████████████████████████ 
1338.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19323
   1 ms | ███  1316
   2 ms |   191
   3 ms |   80
   4 ms |   43
   5 ms |   15
   6 ms |   3
   7 ms |   1
   8 ms |   2
  11 ms |   1
  13 ms |   1
  15 ms |   3
  16 ms |   1
  17 ms |   2
  18 ms |   4
  19 ms |   1
  20 ms |   1
  21 ms |   2
  22 ms |   3
  23 ms |   3
  24 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pulses_issued` = `45.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `172.02`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `fps_harmonic_avg` = `1383.78`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `47.04`
- `seed` = `4019.00`
- `preset_quick` = `1.00`
- `repeaters_placed` = `48.00`
- `dust_placed` = `464.00`
- `block_state_changes` = `0.00`
- `neighbour_updates` = `0.00`
- `scheduled_block_ticks` = `2240.00`
- `preload_chunks` = `81.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1393.78`, min `32.21`, p50 `1538.00`, p95 `2009.65`, p99 `2938.56`, 1%low `115.42`, 0.1%low `39.30`, std `552.42`

**Frame time (ms)**  avg `1.06`, p50 `0.65`, p95 `3.32`, p99 `4.63`, p99.9 `21.09`, max `31.04`

**Client tick (ms)**  avg `0.54`, p95 `0.83`, max `24.61`

**Memory**  start `1364 MB`, end `2724 MB`, peak `4594 MB`, GC `40 events / 573 ms`

**FPS over sampling window (ASCII):**

```
2563.9 |      █                                                                         
2425.7 |      █                                                                         
2287.6 |      ██                                                                        
2149.5 |      ██                                                                        
2011.3 |      ██                                                                        
1873.2 |      ██                                                             █          
1735.1 |      ██         █                                                   █          
1596.9 |      ██ █  █    █    █                 █             █ █  █         █       █  
1458.8 |███   ██ █ ██ █  █    █  █  █  █     █  █  █ █  █  █  █ █  █ █  █ ██ █ █  █  █  
1320.6 |████ ██████████████████  █ ███ ████ ██████ ████ █  █████████ ██████████████  ███
1182.5 |██████████████████████████ █████████████████████████████████████████████████████
1044.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15037
   1 ms | ████  1393
   2 ms | ██  901
   3 ms | ███  1133
   4 ms | █  207
   5 ms |   59
   6 ms |   32
   7 ms |   10
   8 ms |   9
   9 ms |   4
  10 ms |   3
  12 ms |   2
  15 ms |   3
  16 ms |   1
  18 ms |   1
  19 ms |   3
  20 ms |   1
  21 ms |   2
  22 ms |   2
  23 ms |   2
  24 ms |   3
  25 ms |   3
  26 ms |   3
  27 ms |   4
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `115.42`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `7.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `39.30`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `940.51`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1478.66`, min `37.15`, p50 `1533.74`, p95 `1876.89`, p99 `2177.29`, 1%low `192.92`, 0.1%low `47.10`, std `311.71`

**Frame time (ms)**  avg `0.75`, p50 `0.65`, p95 `1.20`, p99 `2.12`, p99.9 `15.88`, max `26.92`

**Client tick (ms)**  avg `0.48`, p95 `0.89`, max `2.46`

**Memory**  start `1933 MB`, end `2126 MB`, peak `4327 MB`, GC `43 events / 570 ms`

**FPS over sampling window (ASCII):**

```
1681.1 |                      █                                                         
1642.9 |                 █  ████                                                        
1604.7 |           █     █  ████            ██                                          
1566.5 |          ██   █ █  ████      █     ██                     ███                  
1528.3 |          ███ ████ █████      █     ███        █           ████ ██      █     █ 
1490.1 |   █      ███ ███████████  █  ███   ███  █ █   ███   █   █ ███████   ██ ██    ██
1451.9 | █ ██ █  █████████████████ █  ███ ██████ ██████████  █   ██████████  ██████   ██
1413.6 | ███████ ███████████████████  ███ ████████████████████   ██████████  ███████████
1375.4 | ███████████████████████████  ███ ██████████████████████ ███████████████████████
1337.2 | ███████████████████████████████████████████████████████████████████████████████
1299.0 | ███████████████████████████████████████████████████████████████████████████████
1260.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19337
   1 ms | ███  1417
   2 ms |   135
   3 ms |   54
   4 ms |   23
   5 ms |   5
   6 ms |   2
   7 ms |   3
  15 ms |   3
  18 ms |   4
  19 ms |   4
  20 ms |   6
  21 ms |   1
  22 ms |   1
  23 ms |   1
  24 ms |   2
  25 ms |   1
  26 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `30.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `47.10`
- `fps_1pct_low` = `192.92`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `1328.22`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1986.89`, min `36.28`, p50 `2080.49`, p95 `2630.45`, p99 `2719.23`, 1%low `287.80`, 0.1%low `85.53`, std `503.96`

**Frame time (ms)**  avg `0.57`, p50 `0.48`, p95 `0.96`, p99 `1.71`, p99.9 `4.70`, max `27.56`

**Client tick (ms)**  avg `0.36`, p95 `0.55`, max `4.99`

**Memory**  start `1465 MB`, end `2694 MB`, peak `3607 MB`, GC `24 events / 241 ms`

**FPS over sampling window (ASCII):**

```
2379.0 |█   █   █                                                                       
2313.9 |█   █   █   █                                                                   
2248.7 |█   █   █ █ █                                                                   
2183.6 |█  ██   █ █ █            █ █               █                                    
2118.5 |██ ██   █ █ ██    █      █ █ █         █   ███ █          █        █   █   █    
2053.3 |██ ██   █ █ ██    ██   █ █ ███ █     ████  ███ █          █    █  ██ █ █   █ █ █
1988.2 |█████   █ ████    ██  ████ █████    █████ ███████   █  █ ███   █  ██ ███   █ █ █
1923.1 |█████ █ █ ████   ████ ███████████   █████ ███████   █ ██████   █ ███ ████ ██ █ █
1857.9 |███████ ██████ ██████ ███████████  ██████████████ ███████████ ██ █████████████ █
1792.8 |█████████████████████ ███████████  ██████████████████████████ ████████████████ █
1727.7 |█████████████████████████████████████████████████████████████ ████████████████ █
1662.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  20115
   1 ms | █  733
   2 ms |   86
   3 ms |   26
   4 ms |   20
   5 ms |   5
   6 ms |   2
   7 ms |   2
   8 ms |   1
  14 ms |   1
  15 ms |   2
  16 ms |   3
  17 ms |   2
  20 ms |   1
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:plains`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `287.80`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `47.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `85.53`
- `part` = `1.00`
- `fps_harmonic_avg` = `1753.90`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24103 ms  |  Sample ticks: 400

**FPS**  avg `1702.13`, min `46.25`, p50 `1731.45`, p95 `2410.89`, p99 `2606.87`, 1%low `246.35`, 0.1%low `83.49`, std `467.33`

**Frame time (ms)**  avg `0.67`, p50 `0.58`, p95 `1.13`, p99 `1.97`, p99.9 `6.77`, max `21.62`

**Client tick (ms)**  avg `0.35`, p95 `0.55`, max `3.97`

**Memory**  start `2809 MB`, end `3023 MB`, peak `3678 MB`, GC `25 events / 235 ms`

**FPS over sampling window (ASCII):**

```
2039.8 |       █                                                                        
1978.9 |   ██  █ █      █   █    █                                                      
1918.0 |   ██  █ █  █   █   ███ ███                                                     
1857.1 |██ ███████  █ ███ █████ ████                                                    
1796.2 |██ █████████████████████████   █    █   ██  █                                   
1735.3 |████████████████████████████   █   ██ █ ██ █████ █                              
1674.4 |█████████████████████████████  █   ███████████████ █                            
1613.5 |██████████████████████████████ ██████████████████████ ██ █        █  █          
1552.6 |██████████████████████████████ █████████████████████████ █ ██  ████  █ █ █  █   
1491.7 |██████████████████████████████ ██████████████████████████████  ████████████ ██ █
1430.8 |██████████████████████████████ ████████████████████████████████████████████ ████
1369.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19343
   1 ms | ███  1452
   2 ms |   102
   3 ms |   38
   4 ms |   29
   5 ms |   12
   6 ms |   4
   7 ms |   4
   8 ms |   4
   9 ms |   1
  13 ms |   3
  14 ms |   2
  15 ms |   2
  16 ms |   2
  17 ms |   1
  21 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:jungle`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `246.35`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1049.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `83.49`
- `part` = `1.00`
- `fps_harmonic_avg` = `1494.22`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `1990.80`, min `60.22`, p50 `2075.15`, p95 `2617.21`, p99 `2698.57`, 1%low `278.69`, 0.1%low `89.06`, std `501.74`

**Frame time (ms)**  avg `0.57`, p50 `0.48`, p95 `0.98`, p99 `1.80`, p99.9 `5.79`, max `16.61`

**Client tick (ms)**  avg `0.33`, p95 `0.52`, max `2.95`

**Memory**  start `2169 MB`, end `2389 MB`, peak `3814 MB`, GC `27 events / 250 ms`

**FPS over sampling window (ASCII):**

```
2279.9 |█   █     █  █                                                                  
2201.4 |█  ██ █   █  █               █ ██       █                  █                    
2122.9 |█  ██ █ █ █████        █ █  ██ ███  █   █        █        ██                    
2044.5 |██ ████ █ ███████ █    █ █ ███████ ██   █    ███ ████ █   ██               █    
1966.0 |██ ██████ ███████ ███  ███████████ ███████   ███ ████████ ██   █    █  █ █ █ █ █
1887.5 |█████████████████ ███ ████████████████████ █ ███ ████████ ██   ███ ███████ ███ █
1809.0 |██████████████████████████████████████████ ██████████████ ██ ███████████████████
1730.5 |██████████████████████████████████████████ ██████████████ ██████████████████████
1652.0 |██████████████████████████████████████████ ██████████████ ██████████████████████
1573.5 |█████████████████████████████████████████████████████████ ██████████████████████
1495.0 |█████████████████████████████████████████████████████████ ██████████████████████
1416.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  20007
   1 ms | ██  816
   2 ms |   102
   3 ms |   30
   4 ms |   20
   5 ms |   5
   6 ms |   3
   7 ms |   3
   8 ms |   2
   9 ms |   1
  12 ms |   2
  14 ms |   4
  15 ms |   2
  16 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:desert`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `278.69`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `89.06`
- `part` = `1.00`
- `fps_harmonic_avg` = `1750.80`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1844.08`, min `53.72`, p50 `1900.55`, p95 `2556.59`, p99 `2641.84`, 1%low `267.81`, 0.1%low `88.29`, std `501.39`

**Frame time (ms)**  avg `0.62`, p50 `0.53`, p95 `1.04`, p99 `1.90`, p99.9 `6.58`, max `18.61`

**Client tick (ms)**  avg `0.33`, p95 `0.45`, max `2.18`

**Memory**  start `2678 MB`, end `3644 MB`, peak `3889 MB`, GC `29 events / 244 ms`

**FPS over sampling window (ASCII):**

```
2053.2 |          ██                                                                    
2003.1 |  █       ███ █                              █         █               █        
1953.0 |  █  █  █ ███ █   █        █              █  █ █ █  ██ ██    █   █ █ █ █        
1903.0 |  █  █ ████████   █ █  ██ ██ █ █  █    ██ █  ███ █  ██████   █   █ █ █████      
1852.9 | ███ █ ████████   ███  ██ ██ █ ████    ████  ███ █  ██████   ██ ██ █ █████     █
1802.8 | ███ ██████████   ███ ██████ ██████ █  ████████████ ██████  ███ ████ █████     █
1752.8 | ███████████████  ███ ██████ ██████ ███████████████ ██████  ███ ████ █████     █
1702.7 |█████████████████████ ██████ ██████ ███████████████ ███████████ ██████████     █
1652.7 |███████████████████████████████████████████████████ ███████████████████████ █  █
1602.6 |███████████████████████████████████████████████████████████████████████████ █  █
1552.5 |███████████████████████████████████████████████████████████████████████████ ████
1502.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19767
   1 ms | ██  1046
   2 ms |   98
   3 ms |   40
   4 ms |   23
   5 ms |   3
   6 ms |   4
   7 ms |   4
   8 ms |   3
  12 ms |   3
  13 ms |   5
  14 ms |   1
  15 ms |   2
  18 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:taiga`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `267.81`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `49.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `88.29`
- `part` = `1.00`
- `fps_harmonic_avg` = `1616.35`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23703 ms  |  Sample ticks: 400

**FPS**  avg `1866.28`, min `55.80`, p50 `1910.68`, p95 `2603.19`, p99 `2723.52`, 1%low `292.40`, 0.1%low `88.25`, std `529.39`

**Frame time (ms)**  avg `0.61`, p50 `0.52`, p95 `1.04`, p99 `1.73`, p99.9 `4.95`, max `17.92`

**Client tick (ms)**  avg `0.32`, p95 `0.51`, max `1.12`

**Memory**  start `2305 MB`, end `3833 MB`, peak `4254 MB`, GC `24 events / 237 ms`

**FPS over sampling window (ASCII):**

```
2274.6 |         █                                                                      
2201.6 |    ██ █ █                                                                      
2128.5 |    ████ █ ██   █ ██                                                            
2055.4 |█   ████ █ ██ █ █ ██     █ █                                                    
1982.3 |█ █ ██████ ██ ███ ███    █ █    █      █                                        
1909.2 |█ █ █████████ ████████ █ █ █    ██ █   █   █ ██ █              █    ██          
1836.2 |███ ██████████████████████ ██  ██████  ██  ██████   █   █   ██ ██  ████ ███     
1763.1 |███ ██████████████████████ ██  ██████ ███ ████████ ████ ███ █████ █████████ █   
1690.0 |██████████████████████████████ ████████████████████████ ███████████████████ █   
1616.9 |███████████████████████████████████████████████████████ █████████████████████   
1543.8 |██████████████████████████████████████████████████████████████████████████████  
1470.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19694
   1 ms | ██  1144
   2 ms |   103
   3 ms |   22
   4 ms |   16
   5 ms |   5
   6 ms |   2
   7 ms |   3
   9 ms |   1
  14 ms |   1
  15 ms |   2
  16 ms |   3
  17 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:snowy_plains`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `50.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `292.40`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `14.00`
- `entity_count_delta` = `-13.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `649.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `88.25`
- `part` = `1.00`
- `fps_harmonic_avg` = `1632.58`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24754 ms  |  Sample ticks: 400

**FPS**  avg `1851.97`, min `62.14`, p50 `1897.33`, p95 `2583.11`, p99 `2677.74`, 1%low `275.67`, 0.1%low `96.22`, std `516.49`

**Frame time (ms)**  avg `0.62`, p50 `0.53`, p95 `1.13`, p99 `1.99`, p99.9 `5.55`, max `16.09`

**Client tick (ms)**  avg `0.34`, p95 `0.47`, max `1.54`

**Memory**  start `3328 MB`, end `3329 MB`, peak `4416 MB`, GC `23 events / 226 ms`

**FPS over sampling window (ASCII):**

```
2139.1 |   █ █                                                                          
2082.9 |   █ █  █  █   █                                                                
2026.7 |   █ ████  ██  █           █   ██                                               
1970.6 | █████████ ███ ██      █   █   ██            █  █ █  █        █                 
1914.4 | █████████ ███ ██ █ █  █  ███  ██  ████ █ █  █  ████ ██       █                 
1858.2 |███████████████████ ████ ████  ██  ████████  █ █████ ██    █  ██                
1802.1 |████████████████████████ ████  ██  ████████  ██████████    ██ ██ █  █  █  █     
1745.9 |████████████████████████ █████ ██████████████████████████  ██ ██ ███████ ██     
1689.8 |████████████████████████ █████ █████████████████████████████████████████ ██     
1633.6 |████████████████████████ █████ ████████████████████████████████████████████    █
1577.4 |████████████████████████ █████ █████████████████████████████████████████████ ███
1521.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19659
   1 ms | ██  1132
   2 ms |   126
   3 ms |   35
   4 ms |   24
   5 ms |   7
   6 ms |   3
   7 ms |   3
   8 ms |   2
  14 ms |   4
  15 ms |   4
  16 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:forest`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `55.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `275.67`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `39.00`
- `entity_count_delta` = `-37.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `1699.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `96.22`
- `part` = `1.00`
- `fps_harmonic_avg` = `1613.91`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1934.64`, min `58.54`, p50 `2009.49`, p95 `2609.89`, p99 `2688.55`, 1%low `293.52`, 0.1%low `95.41`, std `510.13`

**Frame time (ms)**  avg `0.59`, p50 `0.50`, p95 `1.00`, p99 `1.81`, p99.9 `4.68`, max `17.08`

**Client tick (ms)**  avg `0.34`, p95 `0.57`, max `1.48`

**Memory**  start `3218 MB`, end `4221 MB`, peak `4666 MB`, GC `22 events / 229 ms`

**FPS over sampling window (ASCII):**

```
2245.1 |    █       █       █                                                           
2172.6 |    █ █     █  █    █        █                                                  
2100.1 |  ███ █     █  █ ██ █   █    █ █ █                                              
2027.6 |  ███ █    ██ █████ ███████  █ █ █ █              █    █       █                
1955.1 |███████ ███████████████████  █ ██████  ██   ██ █  ███  █ █     █         █   █  
1882.6 |███████ ███████████████████ █████████ ████ ███ ██ ████████     ████     ██  ██ █
1810.1 |█████████████████████████████████████ ████████████████████ ███ ████ ███ ████████
1737.6 |█████████████████████████████████████ ████████████████████ ███ ████████ ████████
1665.1 |█████████████████████████████████████ ████████████████████ █████████████████████
1592.6 |█████████████████████████████████████ ██████████████████████████████████████████
1520.1 |█████████████████████████████████████ ██████████████████████████████████████████
1447.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19939
   1 ms | ██  883
   2 ms |   115
   3 ms |   26
   4 ms |   18
   5 ms |   3
   6 ms |   2
   7 ms |   4
   8 ms |   1
  14 ms |   1
  15 ms |   4
  16 ms |   3
  17 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:savanna`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `293.52`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `4.00`
- `entity_count_delta` = `1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `5.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `95.41`
- `part` = `1.00`
- `fps_harmonic_avg` = `1704.04`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25005 ms  |  Sample ticks: 400

**FPS**  avg `1717.63`, min `51.73`, p50 `1740.43`, p95 `2495.40`, p99 `2600.87`, 1%low `222.77`, 0.1%low `79.60`, std `523.28`

**Frame time (ms)**  avg `0.68`, p50 `0.57`, p95 `1.15`, p99 `2.29`, p99.9 `7.34`, max `19.33`

**Client tick (ms)**  avg `0.35`, p95 `0.59`, max `2.98`

**Memory**  start `2960 MB`, end `3320 MB`, peak `4939 MB`, GC `25 events / 247 ms`

**FPS over sampling window (ASCII):**

```
2100.1 |█    █                                                                          
2023.3 |█    █   █   █                                                                  
1946.5 |█ █  █ █ ███ █         █                                                        
1869.7 |█ █ ██ █ █████ █     ███                                                        
1792.9 |█ █ ████████████ █ ███████   ██   █    █    █ █     █      █  █ █               
1716.1 |███ ██████████████ ███████ █ ████ █   ██ █ ████  █  ██ █████  ███ █  █    ████  
1639.3 |███ ████████████████████████ ██████ ████████████ █ ███ ██████ █████  █  ███████ 
1562.5 |███████████████████████████████████ ████████████ █ ██████████ ██████ █  ███████ 
1485.7 |███████████████████████████████████ ██████████████ █████████████████ █ █████████
1408.9 |██████████████████████████████████████████████████ ███████████████████ █████████
1332.2 |██████████████████████████████████████████████████ ███████████████████ █████████
1255.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19137
   1 ms | ███  1582
   2 ms |   148
   3 ms |   55
   4 ms |   37
   5 ms |   8
   6 ms |   9
   7 ms |   8
   8 ms |   1
   9 ms |   1
  10 ms |   2
  13 ms |   1
  14 ms |   5
  15 ms |   2
  16 ms |   2
  18 ms |   1
  19 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:swamp`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `222.77`
- `surface_water_ratio` = `0.10`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1948.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `79.60`
- `part` = `1.00`
- `fps_harmonic_avg` = `1464.73`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1752.56`, min `51.60`, p50 `1780.24`, p95 `2546.64`, p99 `2656.16`, 1%low `273.94`, 0.1%low `88.23`, std `497.53`

**Frame time (ms)**  avg `0.65`, p50 `0.56`, p95 `1.16`, p99 `1.85`, p99.9 `5.03`, max `19.38`

**Client tick (ms)**  avg `0.38`, p95 `0.59`, max `0.79`

**Memory**  start `3366 MB`, end `4880 MB`, peak `5252 MB`, GC `23 events / 237 ms`

**FPS over sampling window (ASCII):**

```
2079.8 |                                                            █                   
2010.9 |                                                      ██ ██ █   █     █   █ ██ █
1942.0 |                                             █ █  █   █████████ █     █████ ██ █
1873.1 |                                       █ ██  █ █ ██ █ ███████████   ██████████ █
1804.2 |                                     █ █████ █ ████ █████████████   ████████████
1735.3 |    █                               ████████ ██████ ███████████████ ████████████
1666.4 | █  ███ █     █             █  █ █ █████████ ███████████████████████████████████
1597.6 |██ ████████ █████   █   ████████████████████ ███████████████████████████████████
1528.7 |████████████████████████████████████████████ ███████████████████████████████████
1459.8 |████████████████████████████████████████████ ███████████████████████████████████
1390.9 |████████████████████████████████████████████ ███████████████████████████████████
1322.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19503
   1 ms | ███  1315
   2 ms |   105
   3 ms |   29
   4 ms |   24
   5 ms |   4
   6 ms |   4
   7 ms |   4
   8 ms |   3
  14 ms |   2
  15 ms |   1
  16 ms |   1
  17 ms |   4
  19 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:cherry_grove`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `273.94`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `26.00`
- `entity_count_delta` = `-23.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `49.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `88.23`
- `part` = `1.00`
- `fps_harmonic_avg` = `1534.05`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23754 ms  |  Sample ticks: 400

**FPS**  avg `2063.14`, min `57.08`, p50 `2139.37`, p95 `2729.38`, p99 `2807.55`, 1%low `350.41`, 0.1%low `105.06`, std `509.39`

**Frame time (ms)**  avg `0.54`, p50 `0.47`, p95 `0.90`, p99 `1.49`, p99.9 `4.06`, max `17.52`

**Client tick (ms)**  avg `0.27`, p95 `0.38`, max `0.94`

**Memory**  start `3870 MB`, end `3882 MB`, peak `5417 MB`, GC `18 events / 205 ms`

**FPS over sampling window (ASCII):**

```
2355.3 |              █     █                                                           
2279.8 | ██ █ █      ███  █ ██  █     █       █                                         
2204.3 |███ ███      ███  █ ██  █  █ ██ █ ██  █ █                                       
2128.8 |████████     ███  ████████ ██████ █████ ██  █        █    █                     
2053.3 |████████ █████████████████ ██████ ████████  ██    █ ██    █ █     █      █ ██   
1977.8 |████████ █████████████████ ███████████████████  ████████  █ █ ██  █ █ ████ ███  
1902.3 |████████ █████████████████ ███████████████████  ████████  █████████ █ ████████  
1826.8 |██████████████████████████ █████████████████████████████ ██████████ ██████████  
1751.3 |██████████████████████████████████████████████████████████████████████████████  
1675.8 |███████████████████████████████████████████████████████████████████████████████ 
1600.4 |███████████████████████████████████████████████████████████████████████████████ 
1524.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  20349
   1 ms | █  550
   2 ms |   61
   3 ms |   16
   4 ms |   10
   5 ms |   3
   7 ms |   2
   8 ms |   1
   9 ms |   1
  16 ms |   4
  17 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:badlands`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `53.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `350.41`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `698.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `105.06`
- `part` = `1.00`
- `fps_harmonic_avg` = `1849.27`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1682.50`, min `56.91`, p50 `1687.01`, p95 `2437.07`, p99 `2613.62`, 1%low `245.55`, 0.1%low `82.54`, std `489.05`

**Frame time (ms)**  avg `0.68`, p50 `0.59`, p95 `1.14`, p99 `2.18`, p99.9 `5.67`, max `17.57`

**Client tick (ms)**  avg `0.37`, p95 `0.53`, max `7.64`

**Memory**  start `3997 MB`, end `4005 MB`, peak `5470 MB`, GC `22 events / 234 ms`

**FPS over sampling window (ASCII):**

```
2055.0 |   ██ █   █                                                                     
1985.3 |   ████ █ █   █                                                                 
1915.5 | █ ████ █ ███ ██                                                                
1845.8 |████████████████ ███ █    █   █                                                 
1776.1 |████████████████ ███ ██   █ █ █                                                 
1706.4 |████████████████████ ██   █ ███ █    ██      █             █ █    █             
1636.6 |█████████████████████████ █████ ███ ████████████       █ █ ████ █████           
1566.9 |█████████████████████████ ██████████████████████  █ ██████ ██████████        ██ 
1497.2 |█████████████████████████ ██████████████████████  █ ██████ ██████████████ █ ███ 
1427.5 |██████████████████████████████████████████████████████████ ██████████████ █ ███ 
1357.8 |█████████████████████████████████████████████████████████████████████████ █ ████
1288.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19277
   1 ms | ███  1464
   2 ms |   152
   3 ms |   50
   4 ms |   30
   5 ms |   6
   6 ms |   4
   7 ms |   2
   8 ms |   2
   9 ms |   2
  10 ms |   1
  15 ms |   1
  16 ms |   4
  17 ms |   5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:dark_forest`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `245.55`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `43.00`
- `entity_count_delta` = `-42.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `49.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `82.54`
- `part` = `1.00`
- `fps_harmonic_avg` = `1462.39`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `2213.64`, min `54.62`, p50 `2337.91`, p95 `2771.78`, p99 `2836.25`, 1%low `385.76`, 0.1%low `121.94`, std `488.42`

**Frame time (ms)**  avg `0.50`, p50 `0.43`, p95 `0.82`, p99 `1.33`, p99.9 `3.53`, max `18.31`

**Client tick (ms)**  avg `0.30`, p95 `0.44`, max `0.76`

**Memory**  start `5269 MB`, end `4624 MB`, peak `6016 MB`, GC `18 events / 184 ms`

**FPS over sampling window (ASCII):**

```
2488.4 |         █   █                                                                  
2416.3 |█        █   █  █ █ ██                █                                         
2344.2 |█ █ █    ███ ██ █ █ ██ ██          █  ██  █ ██   █       █   █                  
2272.1 |█ █ ██   ███ ████ ████ ██ █       ██  █████ ████ ████  ███ ███  ██     █ █      
2200.0 |███ ██ ███████████████ ██ █      ███  █████ ██████████ ███ ████ █████  █ █      
2127.9 |███████████████████████████     ███████████ ██████████ ██████████████ ████     █
2055.8 |███████████████████████████    ███████████████████████████████████████████     █
1983.7 |███████████████████████████  █ ███████████████████████████████████████████   █ █
1911.6 |████████████████████████████ █████████████████████████████████████████████ ███ █
1839.5 |██████████████████████████████████████████████████████████████████████████ ███ █
1767.4 |██████████████████████████████████████████████████████████████████████████████ █
1695.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  20581
   1 ms | █  328
   2 ms |   58
   3 ms |   17
   4 ms |   5
   5 ms |   2
   7 ms |   2
   8 ms |   1
   9 ms |   1
  17 ms |   4
  18 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:windswept_hills`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `385.76`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `11.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `121.94`
- `part` = `1.00`
- `fps_harmonic_avg` = `2012.25`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1585.06`, min `36.98`, p50 `1661.86`, p95 `1978.55`, p99 `2349.23`, 1%low `187.21`, 0.1%low `47.47`, std `347.82`

**Frame time (ms)**  avg `0.71`, p50 `0.60`, p95 `1.18`, p99 `2.23`, p99.9 `16.79`, max `27.04`

**Client tick (ms)**  avg `0.40`, p95 `0.68`, max `2.47`

**Memory**  start `4639 MB`, end `4335 MB`, peak `5994 MB`, GC `42 events / 569 ms`

**FPS over sampling window (ASCII):**

```
1753.7 |                                                                  █             
1723.2 |                                                     █            █             
1692.7 |    █                               █ ██             ██        █ ██  █          
1662.2 | █  █  ██               █          ██ ██ █        █  ██        █ ██  ██         
1631.6 | █ ██  ██  █   █ █      █  █       ██ ████       ███████       █ ██ ███      █ █
1601.1 | █ ██ ██████   █ █  ██  █ ██     █ ██ ████     █ ███████ █     █ ██████      █ █
1570.6 | █ ██ ██████   █ █ █████████     █ ███████    ██ ███████ █    █████████ ███  ███
1540.1 |████████████  ██ ███████████  █ ██ ███████  █ ██████████ █    █████████████  ███
1509.6 |█████████████ ██ ███████████  █ ██████████  ████████████ ██   █████████████  ███
1479.1 |████████████████████████████  █ ██████████ ████████████████ █ ██████████████ ███
1448.6 |█████████████████████████████ ████████████ █████████████████████████████████████
1418.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19424
   1 ms | ███  1300
   2 ms |   158
   3 ms |   53
   4 ms |   27
   5 ms |   4
   6 ms |   2
   7 ms |   4
   8 ms |   2
   9 ms |   2
  10 ms |   1
  16 ms |   2
  17 ms |   4
  18 ms |   3
  19 ms |   4
  21 ms |   2
  22 ms |   1
  23 ms |   2
  24 ms |   4
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `1402.03`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `47.47`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `50.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `187.21`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `159.27`, min `20.07`, p50 `170.51`, p95 `222.52`, p99 `326.27`, 1%low `30.08`, 0.1%low `21.04`, std `51.92`

**Frame time (ms)**  avg `7.51`, p50 `5.86`, p95 `18.80`, p99 `26.54`, p99.9 `42.82`, max `49.82`

**Client tick (ms)**  avg `7.94`, p95 `16.78`, max `37.03`

**Memory**  start `5450 MB`, end `3860 MB`, peak `6021 MB`, GC `39 events / 536 ms`

**FPS over sampling window (ASCII):**

```
220.5 |                                  █                                             
210.4 |                                  █                                             
200.3 |                                  █   █                  █              █       
190.2 |                   █   █ █        █   █                  █              █       
180.1 |█    █ █           █   █ █     █  █   █       █          █              ██      
170.0 |█    █ █████       █   █ █     ██ █ ███      ███  █      ███  ███     █ ██ █    
159.9 |██   ███████       █  ████ █  █████████    █████  █      ████████  █  ████ █    
149.8 |███ █████████      █████████  ███████████████████████  ███████████ █ █████████  
139.7 |██████████████   ███████████ █████████████████████████ █████████████████████████
129.6 |██████████████   ███████████████████████████████████████████████████████████████
119.5 |███████████████  ███████████████████████████████████████████████████████████████
109.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  24
   3 ms | ██  50
   4 ms | ███████  213
   5 ms | ████████████████████████████████████████  1188
   6 ms | ██████████████  420
   7 ms | ██████  175
   8 ms | ███  93
   9 ms | ███  100
  10 ms | ████  114
  11 ms | ██  60
  12 ms | █  35
  13 ms |   14
  14 ms |   7
  15 ms |   9
  16 ms |   11
  17 ms |   9
  18 ms |   11
  19 ms | █  17
  20 ms | █  22
  21 ms | █  21
  22 ms |   12
  23 ms |   12
  24 ms |   10
  25 ms |   8
  26 ms |   5
  27 ms |   4
  28 ms |   4
  29 ms |   1
  30 ms |   4
  33 ms |   4
  35 ms |   2
  36 ms |   1
  40 ms |   1
  42 ms |   1
  43 ms |   1
  49 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `45.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `133.24`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `21.04`
- `fps_1pct_low` = `30.08`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1510.27`, min `34.31`, p50 `1574.02`, p95 `1923.92`, p99 `2215.38`, 1%low `182.29`, 0.1%low `46.43`, std `334.95`

**Frame time (ms)**  avg `0.75`, p50 `0.64`, p95 `1.27`, p99 `2.42`, p99.9 `16.32`, max `29.15`

**Client tick (ms)**  avg `0.46`, p95 `0.75`, max `3.38`

**Memory**  start `5202 MB`, end `4262 MB`, peak `6023 MB`, GC `43 events / 571 ms`

**FPS over sampling window (ASCII):**

```
1731.7 |                 ██                                                             
1672.2 |                ███               █            █              █                 
1612.7 |    ██  █       ███             ███ █      ██  █           ██ █ █           █   
1553.2 |   ██████ █     ████ █        ███████      █████████     ████████        ██ ███ 
1493.7 |███████████ ███████████       █████████   ██████████    ███████████   █  ██████ 
1434.2 |████████████████████████      ███████████ ██████████    ███████████ ████████████
1374.7 |█████████████████████████ █   █████████████████████████ ████████████████████████
1315.2 |███████████████████████████  ███████████████████████████████████████████████████
1255.7 |████████████████████████████ ███████████████████████████████████████████████████
1196.2 |████████████████████████████ ███████████████████████████████████████████████████
1136.8 |████████████████████████████ ███████████████████████████████████████████████████
1077.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19275
   1 ms | ███  1380
   2 ms |   205
   3 ms |   63
   4 ms |   40
   5 ms |   6
   6 ms |   4
   7 ms |   2
   8 ms |   1
  10 ms |   1
  15 ms |   1
  16 ms |   1
  17 ms |   1
  18 ms |   3
  19 ms |   3
  20 ms |   5
  21 ms |   4
  22 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `182.29`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `50.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `46.43`
- `part` = `1.00`
- `fps_harmonic_avg` = `1335.20`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1530.01`, min `36.82`, p50 `1579.88`, p95 `2020.04`, p99 `2696.57`, 1%low `183.34`, 0.1%low `47.63`, std `375.81`

**Frame time (ms)**  avg `0.74`, p50 `0.63`, p95 `1.24`, p99 `2.42`, p99.9 `16.74`, max `27.16`

**Client tick (ms)**  avg `0.40`, p95 `0.60`, max `3.32`

**Memory**  start `5817 MB`, end `4236 MB`, peak `6017 MB`, GC `43 events / 537 ms`

**FPS over sampling window (ASCII):**

```
2414.4 |                                      █                                         
2314.6 |                                     ██                                         
2214.8 |                                     ██                                         
2115.1 |                                     ██                                         
2015.3 |                                     ██                                         
1915.5 |                                     ██                                         
1815.8 |                                     ██                                         
1716.0 |                    ██  █         █  ███                      ██ █              
1616.2 |          █        ███████        █ ████ █       █ ██  █      ████   █       ██ 
1516.5 |█  ██████████    █ ████████      █████████       ███████  █   ████████  █  █████
1416.7 |███████████████ ████████████████ ██████████  ██████████████████████████ █ ██████
1316.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19222
   1 ms | ███  1480
   2 ms |   161
   3 ms |   63
   4 ms |   33
   5 ms |   12
   6 ms |   3
   7 ms |   1
  10 ms |   2
  15 ms |   1
  16 ms |   1
  17 ms |   2
  18 ms |   3
  19 ms |   2
  20 ms |   5
  21 ms |   2
  22 ms |   4
  23 ms |   1
  24 ms |   1
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `50.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `47.63`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `1345.24`
- `fps_1pct_low` = `183.34`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1376.80`, min `27.94`, p50 `1422.54`, p95 `1799.12`, p99 `2270.53`, 1%low `175.18`, 0.1%low `43.89`, std `317.87`

**Frame time (ms)**  avg `0.82`, p50 `0.70`, p95 `1.34`, p99 `2.54`, p99.9 `16.48`, max `35.79`

**Client tick (ms)**  avg `0.42`, p95 `0.77`, max `3.38`

**Memory**  start `3909 MB`, end `5604 MB`, peak `6030 MB`, GC `41 events / 533 ms`

**FPS over sampling window (ASCII):**

```
1872.3 |                                █                                               
1807.1 |                                █                                               
1741.9 |                                █                                               
1676.6 |                               ██                                               
1611.4 |                               ██        █              █                     █ 
1546.2 |             █                 ██        ██         ██  █                     █ 
1481.0 |             █ ██              ██        ██        ████ █      █              █ 
1415.8 |███    █  █ █████  █    █ █  █ ██     ██ ███     ████████ █    █  █ █       ████
1350.6 |██████ █ ██ ████████   ██ ████████  ████ ████  █ ████████ █    ████████  █  ████
1285.4 |████████ ██ ██████████ ████████████ ███████████████████████  █ █████████ ██ ████
1220.1 |███████████████████████████████████ ███████████████████████ ████████████████████
1154.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18826
   1 ms | ████  1830
   2 ms |   195
   3 ms |   72
   4 ms |   37
   5 ms |   13
   6 ms |   2
   8 ms |   1
  14 ms |   1
  16 ms |   3
  19 ms |   3
  20 ms |   3
  21 ms |   3
  22 ms |   6
  23 ms |   2
  27 ms |   1
  32 ms |   1
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `49.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `43.89`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `1224.51`
- `restocks` = `20.00`
- `fps_1pct_low` = `175.18`
- `entity_count_sample_end` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `1196.19`, min `37.18`, p50 `1209.65`, p95 `1852.61`, p99 `2346.42`, 1%low `152.15`, 0.1%low `44.46`, std `340.79`

**Frame time (ms)**  avg `0.96`, p50 `0.83`, p95 `1.63`, p99 `3.30`, p99.9 `18.57`, max `26.89`

**Client tick (ms)**  avg `0.46`, p95 `0.60`, max `18.10`

**Memory**  start `4625 MB`, end `5205 MB`, peak `6022 MB`, GC `40 events / 533 ms`

**FPS over sampling window (ASCII):**

```
2203.4 | █                                                                              
2092.6 |██                                                                              
1981.7 |██                                                                              
1870.8 |██                                                              █               
1760.0 |███                                                             █               
1649.1 |███                                                             █               
1538.2 |███                                                             ██              
1427.4 |███                                                             ██              
1316.5 |███                         █                   █               ██   ███ █      
1205.7 |███████    ██  ████   █  █████ ██    ███ █      ██        █████████ ███████     
1094.8 |████████ ██████████ ██████████████████████ ██ ███████ ██████████████████████ ███
983.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16571
   1 ms | █████████  3619
   2 ms | █  377
   3 ms |   124
   4 ms |   62
   5 ms |   32
   6 ms |   5
   7 ms |   4
   8 ms |   2
  12 ms |   1
  14 ms |   2
  16 ms |   1
  17 ms |   1
  18 ms |   1
  19 ms |   2
  20 ms |   5
  21 ms |   5
  22 ms |   1
  23 ms |   3
  24 ms |   2
  25 ms |   1
  26 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `152.15`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `100.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `44.46`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `1041.10`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 196054 ms  |  Sample ticks: 3600

**FPS**  avg `233.11`, min `0.58`, p50 `238.62`, p95 `346.13`, p99 `432.77`, 1%low `35.43`, 0.1%low `10.45`, std `76.45`

**Frame time (ms)**  avg `5.05`, p50 `4.19`, p95 `9.40`, p99 `14.76`, p99.9 `34.85`, max `1714.31`

**Client tick (ms)**  avg `1.01`, p95 `1.85`, max `27.37`

**Memory**  start `5526 MB`, end `3790 MB`, peak `6718 MB`, GC `197 events / 2564 ms`

**FPS over sampling window (ASCII):**

```
318.2 | █                                                                              
299.7 |███                                  █                 ████                     
281.3 |████                                 █    █      █ █   █████████  ██████        
262.8 |█████                               ███   ██    █████████████████ ███████       
244.3 |█████                        █    █████   ████  ████████████████████████████████
225.8 |█████        █              ██    █████  █████  ████████████████████████████████
207.4 |█████ █     ██             ███ ██ █████  ██████ ████████████████████████████████
188.9 |████████  █ ██ █    █     █████████████  ██████ ████████████████████████████████
170.4 |█████████ ███████   █     █████████████ ████████████████████████████████████████
151.9 |█████████████████ ███ █ ████████████████████████████████████████████████████████
133.5 |█████████████████ ██████████████████████████████████████████████████████████████
115.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   95
   2 ms | ███████  2367
   3 ms | ████████████████████████████████████████  13243
   4 ms | ██████████████████████████  8483
   5 ms | ██████████████  4626
   6 ms | ██████  1981
   7 ms | █████  1667
   8 ms | ████  1253
   9 ms | ██  816
  10 ms | █  417
  11 ms | █  252
  12 ms |   152
  13 ms |   102
  14 ms |   83
  15 ms |   60
  16 ms |   36
  17 ms |   28
  18 ms |   33
  19 ms |   20
  20 ms |   17
  21 ms |   13
  22 ms |   8
  23 ms |   13
  24 ms |   6
  25 ms |   10
  26 ms |   6
  27 ms |   9
  28 ms |   7
  29 ms |   8
  30 ms |   9
  31 ms |   8
  32 ms |   10
  33 ms |   3
  34 ms |   4
  35 ms |   8
  36 ms |   4
  37 ms |   5
  38 ms |   2
  39 ms |   2
  40 ms |   1
  41 ms |   1
  42 ms |   1
  44 ms |   1
  45 ms |   1
  46 ms |   2
  48 ms |   1
  49 ms |   1
  51 ms |   1
  58 ms |   1
  94 ms |   1
 121 ms |   1
 228 ms |   1
1714 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `35.43`
- `fps_harmonic_avg` = `197.96`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `312.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `10.45`
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
- `entity_count_delta` = `87.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194677 ms  |  Sample ticks: 3600

**FPS**  avg `238.26`, min `50.46`, p50 `230.10`, p95 `332.90`, p99 `488.79`, 1%low `122.14`, 0.1%low `79.23`, std `64.20`

**Frame time (ms)**  avg `4.46`, p50 `4.35`, p95 `6.27`, p99 `7.28`, p99.9 `8.84`, max `19.82`

**Client tick (ms)**  avg `0.68`, p95 `0.87`, max `1.39`

**Memory**  start `4616 MB`, end `4315 MB`, peak `6640 MB`, GC `38 events / 234 ms`

**FPS over sampling window (ASCII):**

```
314.1 |                                        █                                       
301.7 |                                       ██           ██                          
289.3 |                                      ███     ██    ██████████  ██              
276.9 |                                      ███    ███    ██████████████  █████       
264.5 |█                                     ███   █████  ████████████████ █████       
252.0 |█                                    █████  █████  ████████████████ ██████      
239.6 |█                               ██ ███████  █████  █████████████████████████████
227.2 |█           █                █████████████  █████ ██████████████████████████████
214.8 |█   ██      ██               █████████████  ████████████████████████████████████
202.4 |█   ██     ███   ██ █  ██    ███████████████████████████████████████████████████
190.0 |█   ███  ██████ █████  █████████████████████████████████████████████████████████
177.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  348
   2 ms | █████  1647
   3 ms | ██████████████████████████████████████  12843
   4 ms | ████████████████████████████████████████  13490
   5 ms | ███████████████████████████  9059
   6 ms | ███████  2384
   7 ms | █  480
   8 ms |   76
   9 ms |   13
  10 ms |   4
  11 ms |   3
  12 ms |   1
  15 ms |   1
  16 ms |   2
  17 ms |   4
  18 ms |   5
  19 ms |   2
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader + PBR Textures`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `122.14`
- `fps_harmonic_avg` = `224.24`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `312.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `79.23`
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
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193928 ms  |  Sample ticks: 3600

**FPS**  avg `110.59`, min `42.60`, p50 `110.07`, p95 `132.51`, p99 `142.01`, 1%low `76.66`, 0.1%low `48.83`, std `14.08`

**Frame time (ms)**  avg `9.18`, p50 `9.09`, p95 `11.09`, p99 `11.78`, p99.9 `15.85`, max `23.48`

**Client tick (ms)**  avg `0.69`, p95 `0.88`, max `7.72`

**Memory**  start `3891 MB`, end `5917 MB`, peak `6634 MB`, GC `30 events / 210 ms`

**FPS over sampling window (ASCII):**

```
128.5 |                                                                   █████        
125.5 |                                                                   ███████  █   
122.5 |                                                                   █████████████
119.5 |                                                       ████        █████████████
116.5 |                                                       ███████████ █████████████
113.5 |    █                                     █   ████   ███████████████████████████
110.5 |█████              █             █       ██   ████  ████████████████████████████
107.5 |█████     ██      ███           ██████   ███  ████ █████████████████████████████
104.5 |██████   █████    ███     █     ██████  ████  ██████████████████████████████████
101.5 |██████   █████████████████████████████  ████ ███████████████████████████████████
 98.5 |████████ ███████████████████████████████████ ███████████████████████████████████
 95.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   2
   3 ms |   6
   4 ms |   12
   5 ms |   18
   6 ms | █  135
   7 ms | ████████████████  2564
   8 ms | ████████████████████████████████████████  6516
   9 ms | ████████████████████████████████████  5872
  10 ms | █████████████████████  3340
  11 ms | ██████  1018
  12 ms | █  88
  13 ms |   9
  14 ms |   2
  15 ms |   1
  16 ms |   2
  17 ms |   3
  19 ms |   1
  20 ms |   3
  21 ms |   5
  22 ms |   5
  23 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `76.66`
- `fps_harmonic_avg` = `108.90`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `312.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `48.83`
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

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194449 ms  |  Sample ticks: 3600

**FPS**  avg `84.10`, min `36.54`, p50 `83.26`, p95 `103.11`, p99 `111.73`, 1%low `58.41`, 0.1%low `42.31`, std `12.49`

**Frame time (ms)**  avg `12.12`, p50 `12.01`, p95 `14.93`, p99 `15.95`, p99.9 `18.66`, max `27.37`

**Client tick (ms)**  avg `0.70`, p95 `0.91`, max `1.81`

**Memory**  start `4670 MB`, end `3657 MB`, peak `6636 MB`, GC `26 events / 195 ms`

**FPS over sampling window (ASCII):**

```
 99.3 |                                                                      ████      
 96.6 |                                                      █             ██████      
 93.9 |                                               █     ███           █████████████
 91.2 |                                         ██  █████   ███ ██        █████████████
 88.5 |                                         ██  █████ █████████ ██    █████████████
 85.8 | ████                                   ███  █████████████████████ █████████████
 83.1 |██████                              █   ████████████████████████████████████████
 80.3 |██████    ███     ███           █  ██   ████████████████████████████████████████
 77.6 |██████   █████ █  ███           ██████  ████████████████████████████████████████
 74.9 |████████ ████████ ███    █     █████████████████████████████████████████████████
 72.2 |█████████████████████ ███████  █████████████████████████████████████████████████
 69.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms |   5
   4 ms |   4
   5 ms |   5
   6 ms |   5
   7 ms |   16
   8 ms | ██  132
   9 ms | █████████████  1109
  10 ms | ████████████████████████████████  2711
  11 ms | ████████████████████████████████████████  3399
  12 ms | ████████████████████████████████████  3060
  13 ms | ████████████████████████████  2389
  14 ms | ████████████████  1334
  15 ms | ██████  551
  16 ms | █  97
  17 ms |   14
  18 ms |   2
  20 ms |   1
  21 ms |   1
  22 ms |   4
  24 ms |   3
  25 ms |   2
  26 ms |   2
  27 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader + PBR Textures`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `58.41`
- `fps_harmonic_avg` = `82.49`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `312.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `42.31`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `73.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `15.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`

