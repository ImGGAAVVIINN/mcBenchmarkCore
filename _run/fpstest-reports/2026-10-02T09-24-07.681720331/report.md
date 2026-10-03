# MC Benchmark Core session — 2026-10-02T09:59:43.760287143+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1151.4 | 41.9 | 25.8 | 20.45 | 1.28 | 74 | 1815 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 915.3 | 40.6 | 25.7 | 20.41 | 1.29 | 64 | 1891 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 671.4 | 39.6 | 25.4 | 21.38 | 1.22 | 57 | 1801 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 482.2 | 37.1 | 24.0 | 22.04 | 1.19 | 48 | 1740 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 814.1 | 39.1 | 26.1 | 21.57 | 1.23 | 66 | 1646 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 886.4 | 40.6 | 22.5 | 19.86 | 0.84 | 59 | 2196 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 689.1 | 38.9 | 23.9 | 21.57 | 1.17 | 55 | 2306 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 328.2 | 33.8 | 22.6 | 23.95 | 1.70 | 54 | 1140 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1058.5 | 34.0 | 19.9 | 22.69 | 4.88 | 43 | 2157 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 221.5 | 27.9 | 18.8 | 28.47 | 4.83 | 35 | 985 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 442.9 | 32.7 | 20.9 | 24.30 | 1.68 | 87 | 554 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 532.1 | 39.9 | 25.4 | 21.22 | 0.87 | 49 | 2394 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 552.0 | 26.9 | 20.4 | 27.95 | 5.87 | 45 | 1677 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 872.9 | 37.0 | 23.2 | 21.71 | 3.91 | 25 | 1354 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1243.9 | 12.9 | 7.2 | 56.29 | 19.09 | 20 | 407 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1115.3 | 10.8 | 8.3 | 75.89 | 20.13 | 24 | 543 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1356.5 | 36.8 | 20.3 | 21.34 | 3.08 | 46 | 1871 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1360.9 | 36.4 | 22.7 | 22.07 | 3.10 | 49 | 1033 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 704.1 | 39.6 | 26.9 | 20.83 | 1.04 | 41 | 1703 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1918.8 | 44.4 | 26.6 | 19.11 | 0.51 | 38 | 1903 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1843.5 | 42.5 | 24.4 | 19.72 | 0.50 | 34 | 2361 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1666.2 | 40.8 | 26.1 | 20.38 | 0.52 | 40 | 1617 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1669.8 | 42.7 | 26.2 | 19.95 | 0.50 | 37 | 762 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 2178.8 | 55.7 | 42.0 | 15.74 | 0.41 | 21 | 355 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1833.4 | 52.5 | 36.3 | 16.45 | 0.40 | 20 | 1185 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 2108.9 | 52.6 | 35.4 | 16.03 | 0.41 | 20 | 1542 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 1977.7 | 53.9 | 37.2 | 15.74 | 0.39 | 20 | 102 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 1943.4 | 54.8 | 43.2 | 16.23 | 0.40 | 21 | 1558 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 2031.9 | 51.5 | 37.5 | 17.14 | 0.37 | 19 | 1741 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 1836.3 | 51.6 | 36.4 | 16.73 | 0.35 | 22 | 1343 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 1664.4 | 50.0 | 35.9 | 17.41 | 0.36 | 19 | 1934 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 1709.1 | 50.6 | 38.9 | 17.42 | 0.44 | 19 | 2201 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 1934.6 | 53.1 | 39.9 | 16.66 | 0.32 | 19 | 1622 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 1666.6 | 50.1 | 36.5 | 17.42 | 0.35 | 19 | 1885 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 1879.1 | 40.7 | 16.1 | 17.73 | 0.38 | 17 | 2241 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1918.9 | 44.9 | 30.9 | 19.51 | 0.48 | 37 | 1716 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 134.4 | 17.2 | 13.3 | 50.25 | 7.74 | 35 | 2185 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1774.7 | 43.0 | 25.9 | 19.86 | 0.50 | 38 | 261 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1763.8 | 43.6 | 28.0 | 20.04 | 0.56 | 35 | 2254 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1577.8 | 44.7 | 29.5 | 19.31 | 0.52 | 41 | 85 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1295.5 | 41.1 | 25.7 | 20.43 | 0.58 | 36 | 642 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 181.8 | 17.8 | 5.9 | 36.65 | 1.18 | 183 | 881 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 197.6 | 25.9 | 21.0 | 35.57 | 0.81 | 47 | 2165 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 103.2 | 18.5 | 9.1 | 47.16 | 0.91 | 30 | 2307 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 92.3 | 16.3 | 9.0 | 54.70 | 0.77 | 30 | 1206 |

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

Category: **Particles**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `1151.42`, min `21.05`, p50 `1221.40`, p95 `1819.53`, p99 `2065.66`, 1%low `41.93`, 0.1%low `25.83`, std `471.90`

**Frame time (ms)**  avg `1.85`, p50 `0.82`, p95 `5.77`, p99 `20.45`, p99.9 `28.37`, max `47.50`

**Client tick (ms)**  avg `1.28`, p95 `3.21`, max `13.47`

**Memory**  start `845 MB`, end `1179 MB`, peak `2660 MB`, GC `74 events / 654 ms`

**FPS over sampling window (ASCII):**

```
1707.6 |                                                                     █          
1611.4 |                                                                ██   ██         
1515.1 |                                                         █ █ █████  ███         
1418.9 |                                                 █   █ █ █ ███████  ███         
1322.7 | █                                   █    ██     ███████ ██████████████ █       
1226.5 | █                 █ █               █  █ ██   █ ███████ ██████████████ ██ ███ █
1130.2 | ██          █     ███ █       █  █  █  █ ████ █ ███████████████████████████████
1034.0 | ██          █ █ █ ███ ████  █ █  █ ████████████████████████████████████████████
937.8 | ██     █ █ ████ ██████████ ████████████████████████████████████████████████████
841.6 |████    ████████████████████████████████████████████████████████████████████████
745.3 |████ ███████████████████████████████████████████████████████████████████████████
649.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7506
   1 ms | ███████████  2012
   2 ms | ██  418
   3 ms | █  183
   4 ms |   92
   5 ms |   64
   6 ms |   19
   7 ms |   16
   8 ms |   14
   9 ms |   3
  10 ms |   6
  11 ms |   4
  12 ms |   3
  13 ms |   7
  14 ms |   11
  15 ms |   26
  16 ms |   41
  17 ms | █  101
  18 ms |   85
  19 ms |   66
  20 ms |   50
  21 ms |   28
  22 ms |   21
  23 ms |   6
  24 ms |   5
  25 ms |   3
  26 ms |   4
  28 ms |   3
  32 ms |   2
  34 ms |   1
  41 ms |   1
  44 ms |   2
  45 ms |   2
  47 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 1350 | 868.0 | 22.45 |
| `dripping_water` | 240 | 1350 | 980.9 | 20.32 |
| `dragon_breath` | 160 | 1350 | 1036.4 | 19.92 |
| `end_rod` | 240 | 1350 | 1028.6 | 20.86 |
| `portal` | 160 | 1350 | 1188.4 | 19.41 |
| `ALL_TOGETHER` | 1680 | 1350 | 1348.8 | 19.69 |
| `sculk_charge_pop` | 240 | 1350 | 1508.2 | 19.02 |
| `smoke` | 160 | 1350 | 1254.3 | 19.66 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `73.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `539.85`
- `fps_0p1pct_low` = `25.83`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `41.93`
- `particles_stage_smoke` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `915.31`, min `20.06`, p50 `1019.10`, p95 `1274.42`, p99 `1523.86`, 1%low `40.60`, 0.1%low `25.65`, std `343.20`

**Frame time (ms)**  avg `2.20`, p50 `0.98`, p95 `15.94`, p99 `20.41`, p99.9 `29.43`, max `49.85`

**Client tick (ms)**  avg `1.29`, p95 `2.62`, max `17.46`

**Memory**  start `919 MB`, end `2619 MB`, peak `2810 MB`, GC `64 events / 656 ms`

**FPS over sampling window (ASCII):**

```
1094.8 |                                                              █                 
1062.4 |                                       █     █                █ █           █   
1029.9 |                 █       █       █     █     █               ██ █   █      ██   
997.5 |        █        █       ██      █ █   █   ███               █████  █     ███ ██
965.0 |        █   █  █ █       ██    ███ █   █ █ ███               █████  █     ██████
932.6 |  █ █ █ █  ██  █ █       ██  █ █████  ████ ███         ████ ██████  ██ ██ ██████
900.1 |  █ █ █ █  ██  █ █  █  ████ ██ █████ █████ ███     ██ █████ ██████  ████████████
867.6 |█ █ █ █ █  ███ █ █  █  ████ ██████████████ ███ █   ██ █████ ██████  ████████████
835.2 |█ █ █ █ ██ ███ █ █  █  █████████████████████████  ████████████████ █████████████
802.7 |█████ ████ ███ ███ ███ █████████████████████████ ███████████████████████████████
770.3 |██████████████████████ █████████████████████████████████████████████████████████
737.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4745
   1 ms | █████████████████████████  3020
   2 ms | ████  425
   3 ms | ██  220
   4 ms | █  92
   5 ms |   40
   6 ms |   15
   7 ms |   10
   8 ms |   7
   9 ms |   5
  10 ms |   1
  11 ms |   4
  12 ms |   3
  13 ms |   3
  14 ms |   9
  15 ms |   29
  16 ms | █  77
  17 ms | █  105
  18 ms | █  90
  19 ms | █  71
  20 ms |   33
  21 ms |   20
  22 ms |   9
  23 ms |   8
  24 ms |   9
  25 ms |   11
  26 ms |   3
  28 ms |   4
  29 ms |   1
  30 ms |   1
  31 ms |   2
  33 ms |   1
  39 ms |   1
  43 ms |   1
  44 ms |   1
  46 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `25.65`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `453.85`
- `preload_duration_ms` = `72.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `40.60`
- `preload_chunks` = `81.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `671.37`, min `19.07`, p50 `733.88`, p95 `962.98`, p99 `1169.17`, 1%low `39.64`, 0.1%low `25.38`, std `256.87`

**Frame time (ms)**  avg `2.75`, p50 `1.36`, p95 `17.12`, p99 `21.38`, p99.9 `31.11`, max `52.43`

**Client tick (ms)**  avg `1.22`, p95 `2.09`, max `16.85`

**Memory**  start `1186 MB`, end `1731 MB`, peak `2988 MB`, GC `57 events / 632 ms`

**FPS over sampling window (ASCII):**

```
842.5 |                 █                                                              
810.5 |            █    ██                        █                                    
778.6 |        █   █    ██                        █                                    
746.7 |█   █   █   █  ████          █   █  █      ██      █                    █       
714.8 |█  ██   █  ██  █████   █ █  ██ █ █  █ █    ██      █     █   █    █ █   █  ███  
682.9 |█ ████  █ ███  █████   ████ ███████ █ ██ █ ██   █ ██ █ █ ██ ██    █ █   █ ████ █
650.9 |██████  █ ███  █████ █ ████ ███████ █ ██ █ ██ █ █ ██████ █████   ██ █  ██ ████ █
619.0 |██████ ██ ████ ████████████ █████████ ██ █ ██ █ ████████ █████   ████ ███ ██████
587.1 |██████ ███████ ████████████ ██████████████ ███████████████████ █ ████ ███ ██████
555.2 |██████████████ █████████████████████████████████████████████████████████████████
523.3 |██████████████ █████████████████████████████████████████████████████████████████
491.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  218
   1 ms | ████████████████████████████████████████  5532
   2 ms | ████  585
   3 ms | ██  243
   4 ms | █  110
   5 ms |   65
   6 ms |   29
   7 ms |   12
   8 ms |   7
   9 ms |   4
  10 ms |   4
  11 ms |   4
  12 ms |   1
  13 ms |   3
  14 ms |   6
  15 ms |   24
  16 ms |   50
  17 ms | █  111
  18 ms | █  86
  19 ms |   51
  20 ms |   47
  21 ms |   29
  22 ms |   12
  23 ms |   11
  24 ms |   7
  25 ms |   10
  26 ms |   2
  27 ms |   1
  29 ms |   2
  30 ms |   1
  31 ms |   1
  33 ms |   1
  35 ms |   1
  37 ms |   1
  38 ms |   2
  39 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `25.38`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `363.71`
- `preload_duration_ms` = `40.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `39.64`
- `preload_chunks` = `81.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `482.16`, min `22.51`, p50 `528.72`, p95 `726.90`, p99 `867.82`, 1%low `37.06`, 0.1%low `23.98`, std `202.63`

**Frame time (ms)**  avg `3.76`, p50 `1.89`, p95 `17.98`, p99 `22.04`, p99.9 `34.24`, max `44.42`

**Client tick (ms)**  avg `1.19`, p95 `1.89`, max `17.25`

**Memory**  start `1707 MB`, end `1272 MB`, peak `3447 MB`, GC `48 events / 646 ms`

**FPS over sampling window (ASCII):**

```
623.8 |                        █                                                       
595.3 |                        █                █                    █                 
566.7 |     █                █ █                █     █              █                 
538.2 |     █           ███ ████               ██     █       █  ██  █  █        █     
509.7 |     █   █       █████████  █ █    ██   ████ █ █    █ ██ ███  █  ███    █ ██  █ 
481.1 |██   █   █       ██████████ ████   ███ ███████ ██████ ██████████████   ██ ██  █ 
452.6 |██████   █    ████████████████████████ ██████████████ ███████████████  ██ ██ ██ 
424.0 |██████ █ ██   ███████████████████████████████████████████████████████  ████████ 
395.5 |██████ ████   ███████████████████████████████████████████████████████ █████████ 
367.0 |████████████  ██████████████████████████████████████████████████████████████████
338.4 |█████████████ ██████████████████████████████████████████████████████████████████
309.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   10
   1 ms | ████████████████████████████████████████  2987
   2 ms | ████████████████  1178
   3 ms | ████  336
   4 ms | ██  161
   5 ms | █  86
   6 ms |   27
   7 ms |   15
   8 ms |   5
   9 ms |   3
  10 ms |   4
  12 ms |   2
  13 ms |   2
  14 ms |   11
  15 ms | █  40
  16 ms | █  69
  17 ms | ██  121
  18 ms | █  91
  19 ms | █  69
  20 ms |   33
  21 ms |   15
  22 ms |   18
  23 ms |   9
  24 ms |   5
  25 ms |   5
  26 ms |   2
  27 ms |   3
  29 ms |   3
  30 ms |   1
  31 ms |   2
  33 ms |   2
  34 ms |   1
  37 ms |   1
  40 ms |   1
  42 ms |   1
  43 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `23.98`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `266.07`
- `preload_duration_ms` = `39.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `37.06`
- `preload_chunks` = `81.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `814.11`, min `19.56`, p50 `888.07`, p95 `1155.24`, p99 `1364.69`, 1%low `39.12`, 0.1%low `26.10`, std `306.73`

**Frame time (ms)**  avg `2.37`, p50 `1.13`, p95 `16.06`, p99 `21.57`, p99.9 `30.25`, max `51.14`

**Client tick (ms)**  avg `1.23`, p95 `2.11`, max `24.98`

**Memory**  start `1704 MB`, end `2426 MB`, peak `3351 MB`, GC `66 events / 652 ms`

**FPS over sampling window (ASCII):**

```
1017.4 |                                   █                                            
978.9 |█                                 ██                                            
940.3 |█  █             █           █    ██         █                                █ 
901.8 |█ ██   █      █  █    █   █  █   ███         █    █                    ███    ██
863.2 |█ ██   █      █  █ █  █   █  █   ███   █     █    █ ██     █ █      █ █████   ██
824.7 |█ ██   ██ █ █ █  ███  █   █  █ █ ████  ██   ███   █████  █ █ ██  █  ███████   ██
786.1 |████ █ ████ ████ ███  █  ███ ███ ████  ███  ████  █████  ██████  █ █████████ ███
747.6 |██████ ████ ████ █████████████████████████  ███████████  ██████  █ █████████ ███
709.0 |████████████████████████████████████████████████████████ ██████ ██ █████████ ███
670.5 |████████████████████████████████████████████████████████ ██████ ████████████ ███
631.9 |████████████████████████████████████████████████████████ ██████ ████████████████
593.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████  2589
   1 ms | ████████████████████████████████████████  4470
   2 ms | ████  459
   3 ms | ██  211
   4 ms | █  112
   5 ms | █  69
   6 ms |   23
   7 ms |   13
   8 ms |   10
   9 ms |   11
  10 ms |   4
  11 ms |   2
  12 ms |   4
  13 ms |   1
  14 ms |   2
  15 ms |   17
  16 ms |   52
  17 ms | █  82
  18 ms | █  83
  19 ms | █  61
  20 ms |   40
  21 ms |   35
  22 ms |   20
  23 ms |   12
  24 ms |   10
  25 ms |   6
  26 ms |   6
  27 ms |   5
  28 ms |   3
  29 ms |   2
  30 ms |   2
  31 ms |   1
  32 ms |   1
  37 ms |   1
  39 ms |   1
  41 ms |   1
  42 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `26.10`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `421.30`
- `preload_duration_ms` = `60.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `39.12`
- `preload_chunks` = `81.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `886.37`, min `18.87`, p50 `976.89`, p95 `1195.22`, p99 `1451.26`, 1%low `40.56`, 0.1%low `22.45`, std `304.83`

**Frame time (ms)**  avg `2.08`, p50 `1.02`, p95 `5.84`, p99 `19.86`, p99.9 `33.70`, max `52.99`

**Client tick (ms)**  avg `0.84`, p95 `1.57`, max `4.21`

**Memory**  start `1325 MB`, end `2471 MB`, peak `3521 MB`, GC `59 events / 650 ms`

**FPS over sampling window (ASCII):**

```
1070.8 |                        █                                                       
1035.5 |                        █                                                     █ 
1000.2 |█                       █                         █       █     █         █   █ 
964.9 |█        ██            ██    █         ███        ██     ██     ██    █ ███   █ 
929.6 |██ ███   ██   █     █  ██    █ ██      ███        ██ █   ████  ███   ██████  ██ 
894.3 |███████  ███  █  █  █ ███    ████    █████      █ ██ █   ████ ████ █ ██████  ██ 
859.1 |████████ ███  ██ ██ █ ████   ████   ███████ █   ████ █ █████████████████████ ███
823.8 |████████████  ███████ █████  ████   ███████ █   ████ ███████████████████████ ███
788.5 |█████████████ ███████ █████  ██████ █████████   ████████████████████████████████
753.2 |█████████████ █████████████ █████████████████   ████████████████████████████████
717.9 |█████████████ █████████████ ███████████████████ ████████████████████████████████
682.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4331
   1 ms | █████████████████████████████████████  4037
   2 ms | ████  435
   3 ms | ██  221
   4 ms | █  88
   5 ms |   28
   6 ms |   14
   7 ms |   6
   8 ms |   3
   9 ms |   1
  12 ms |   2
  13 ms |   1
  14 ms |   10
  15 ms |   41
  16 ms | █  69
  17 ms | █  103
  18 ms | █  85
  19 ms |   53
  20 ms |   38
  21 ms |   10
  22 ms |   15
  23 ms |   3
  24 ms |   2
  25 ms |   3
  26 ms |   3
  27 ms |   1
  28 ms |   3
  30 ms |   2
  31 ms |   1
  33 ms |   1
  34 ms |   1
  37 ms |   1
  40 ms |   1
  42 ms |   1
  44 ms |   2
  47 ms |   1
  49 ms |   1
  50 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `22.45`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `480.85`
- `preload_duration_ms` = `91.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `40.56`
- `preload_chunks` = `81.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `689.10`, min `19.27`, p50 `753.92`, p95 `1000.06`, p99 `1126.50`, 1%low `38.87`, 0.1%low `23.92`, std `274.16`

**Frame time (ms)**  avg `2.80`, p50 `1.33`, p95 `17.37`, p99 `21.57`, p99.9 `32.18`, max `51.89`

**Client tick (ms)**  avg `1.17`, p95 `1.89`, max `7.77`

**Memory**  start `1559 MB`, end `3400 MB`, peak `3865 MB`, GC `55 events / 604 ms`

**FPS over sampling window (ASCII):**

```
833.5 |   █                                                █                           
799.8 |██ █            █                                   ██              █   █       
766.2 |██ █         █  █   █                 █   █     █  ███      █       █  ███ █████
732.6 |████      ████  ███ █ ██       █      █  ██     █ ████      ███     █  █████████
698.9 |████   █  ████ ██████ ██       █      █ ████   ██ ██████    ███     ████████████
665.3 |█████  █  ███████████ ██ ██    █      █ ████   ████████████████     ████████████
631.7 |█████ ██  ███████████ █████  ███ █ █  █ ████   ████████████████ ██  ████████████
598.0 |█████████ ██████████████████████ ███  ██████  ████████████████████ █████████████
564.4 |████████████████████████████████████████████  ██████████████████████████████████
530.8 |████████████████████████████████████████████  ██████████████████████████████████
497.1 |█████████████████████████████████████████████ ██████████████████████████████████
463.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  358
   1 ms | ████████████████████████████████████████  5253
   2 ms | ████  545
   3 ms | ██  266
   4 ms | █  129
   5 ms | █  69
   6 ms |   19
   7 ms |   14
   8 ms |   6
   9 ms |   2
  10 ms |   1
  11 ms |   1
  12 ms |   2
  13 ms |   2
  14 ms |   5
  15 ms |   22
  16 ms |   61
  17 ms | █  101
  18 ms | █  90
  19 ms | █  77
  20 ms |   42
  21 ms |   21
  22 ms |   16
  23 ms |   17
  24 ms |   8
  25 ms |   2
  26 ms |   5
  27 ms |   1
  28 ms |   2
  29 ms |   1
  30 ms |   1
  32 ms |   1
  33 ms |   2
  35 ms |   1
  43 ms |   1
  47 ms |   2
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `23.92`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `357.37`
- `preload_duration_ms` = `21.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `38.87`
- `preload_chunks` = `81.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `328.16`, min `21.39`, p50 `372.38`, p95 `484.35`, p99 `555.21`, 1%low `33.82`, 0.1%low `22.63`, std `135.67`

**Frame time (ms)**  avg `5.09`, p50 `2.69`, p95 `19.82`, p99 `23.95`, p99.9 `38.36`, max `46.74`

**Client tick (ms)**  avg `1.70`, p95 `3.20`, max `9.68`

**Memory**  start `2030 MB`, end `2579 MB`, peak `3170 MB`, GC `54 events / 642 ms`

**FPS over sampling window (ASCII):**

```
408.8 |     █                                                                          
393.9 |     █         █                                                                
379.1 |     █   █     █ █            █    █                                      █     
364.3 |██   █   ██    █ █   ██  █  █ █    ██    █           █        █         █ █     
349.5 |██ ████  ██    █ █   ██  █  ███    ██    █    █  ██ ██        █ █       █ █  █  
334.7 |██ ████  ██   ██ █  ███  █ ████   ████   ██ ███  ██ ██ ███  █ █ █ ██ █  █ █  █  
319.9 |███████  ███  ██ █  ███  █ ████   ████   ██████  █████████  ███ ████ ██ █ █ ██  
305.1 |████████████  █████ ███  █ █████ █████  ███████████████████████████████ █ █████ 
290.3 |███████████████████ ███  ███████ █████ ████████████████████████████████████████ 
275.5 |███████████████████ ███  ███████ █████ ████████████████████████████████████████ 
260.7 |████████████████████████████████ █████ █████████████████████████████████████████
245.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  126
   2 ms | ████████████████████████████████████████  2314
   3 ms | █████████  504
   4 ms | █████  271
   5 ms | ██  123
   6 ms | █  59
   7 ms |   25
   8 ms |   5
   9 ms |   7
  10 ms |   4
  11 ms |   4
  12 ms |   2
  14 ms |   2
  15 ms |   10
  16 ms | █  30
  17 ms | █  81
  18 ms | ██  97
  19 ms | █  78
  20 ms | █  63
  21 ms | █  38
  22 ms |   28
  23 ms |   16
  24 ms |   11
  25 ms |   4
  26 ms |   5
  27 ms |   1
  28 ms |   2
  29 ms |   1
  30 ms |   6
  31 ms |   1
  34 ms |   2
  36 ms |   1
  38 ms |   1
  41 ms |   1
  43 ms |   1
  44 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `22.63`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `196.31`
- `preload_duration_ms` = `1.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `33.82`
- `preload_chunks` = `81.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1058.45`, min `14.97`, p50 `1165.21`, p95 `1457.56`, p99 `2004.00`, 1%low `34.05`, 0.1%low `19.94`, std `396.21`

**Frame time (ms)**  avg `2.06`, p50 `0.86`, p95 `8.12`, p99 `22.69`, p99.9 `42.45`, max `66.79`

**Client tick (ms)**  avg `4.88`, p95 `7.91`, max `23.40`

**Memory**  start `1911 MB`, end `2419 MB`, peak `4069 MB`, GC `43 events / 593 ms`

**FPS over sampling window (ASCII):**

```
1410.5 |                                            █                                   
1351.6 |                                           ██                                   
1292.7 |                                           ██                                   
1233.8 |  █                                     █  ██        █    █                     
1174.9 |  █     █            █         █  █    ██  ███       █    █                     
1116.0 |  █   █ █ █  █   █   █         ██ ███ ████████      ███  ██        █     ███  █ 
1057.1 |███  ████ █ ███ ██   █ █ █    █████████████████  █  ███████ █   █  ██ ██ ████ █ 
998.3 |███████████████ ██  ███████   ██████████████████ █  ██████████  ██ ████████████ 
939.4 |██████████████████ ████████  ███████████████████ █ ███████████ █████████████████
880.5 |██████████████████ ████████  ███████████████████████████████████████████████████
821.6 |████████████████████████████ ███████████████████████████████████████████████████
762.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6654
   1 ms | ████████████  1950
   2 ms | █  220
   3 ms | █  113
   4 ms |   58
   5 ms | █  124
   6 ms |   64
   7 ms |   30
   8 ms |   10
   9 ms |   15
  10 ms |   6
  11 ms |   4
  12 ms |   7
  13 ms |   1
  14 ms |   7
  15 ms |   25
  16 ms |   42
  17 ms |   79
  18 ms |   57
  19 ms |   43
  20 ms |   33
  21 ms |   29
  22 ms |   39
  23 ms |   24
  24 ms |   13
  25 ms |   12
  26 ms |   4
  27 ms |   7
  28 ms |   1
  29 ms |   2
  30 ms |   2
  31 ms |   1
  32 ms |   2
  35 ms |   1
  37 ms |   1
  38 ms |   3
  39 ms |   4
  40 ms |   1
  42 ms |   3
  44 ms |   1
  45 ms |   1
  46 ms |   1
  48 ms |   2
  52 ms |   1
  62 ms |   1
  66 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `495.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.94`
- `entity_count_sample_end` = `495.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `484.97`
- `preload_duration_ms` = `54.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `34.05`
- `preload_chunks` = `81.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `221.52`, min `16.83`, p50 `235.88`, p95 `387.70`, p99 `418.75`, 1%low `27.91`, 0.1%low `18.82`, std `113.18`

**Frame time (ms)**  avg `7.44`, p50 `4.24`, p95 `22.12`, p99 `28.47`, p99.9 `44.23`, max `59.42`

**Client tick (ms)**  avg `4.83`, p95 `6.42`, max `26.52`

**Memory**  start `1309 MB`, end `1235 MB`, peak `2294 MB`, GC `35 events / 215 ms`

**FPS over sampling window (ASCII):**

```
316.0 |                                             █                                  
298.1 |                                             █  █                 █  █ █        
280.3 |     █                                       ██████████           █  █ ██ █ █ █ 
262.4 |█    █                                      ███████████    ███  ████ █ ██ █████ 
244.6 |█  █ █    █                                ███████████████ ███ █████████████████
226.7 |█  █ █   ██                               ██████████████████████████████████████
208.9 |██ ███  ███  █   ██                      ███████████████████████████████████████
191.1 |██ ████ ████ ███ ██    ███               ███████████████████████████████████████
173.2 |███████████████████  █████              ████████████████████████████████████████
155.4 |████████████████████ ██████ ████ █ █    ████████████████████████████████████████
137.5 |██████████████████████████████████ ██ ██████████████████████████████████████████
119.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   2 ms | ██████████████████████████  483
   3 ms | ████████████████████████████████████████  756
   4 ms | ████████████████████  385
   5 ms | ████████████  220
   6 ms | ███  57
   7 ms | ████  70
   8 ms | ████  77
   9 ms | ███  50
  10 ms | █  23
  11 ms | █  19
  12 ms | █  10
  13 ms | ███  51
  14 ms | ████  68
  15 ms | ██  44
  16 ms | █  26
  17 ms | ██  33
  18 ms | ██  39
  19 ms | ██  44
  20 ms | ███  52
  21 ms | ██  37
  22 ms | █  25
  23 ms | █  18
  24 ms | █  25
  25 ms | █  18
  26 ms | █  11
  27 ms | █  11
  28 ms |   9
  29 ms |   8
  30 ms |   2
  34 ms |   1
  35 ms |   4
  40 ms |   3
  41 ms |   1
  42 ms |   1
  43 ms |   1
  46 ms |   1
  53 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `18.82`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `18.00`
- `fps_harmonic_avg` = `134.35`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `27.91`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `442.92`, min `18.61`, p50 `493.32`, p95 `723.74`, p99 `803.74`, 1%low `32.68`, 0.1%low `20.89`, std `207.80`

**Frame time (ms)**  avg `4.31`, p50 `2.03`, p95 `19.24`, p99 `24.30`, p99.9 `42.20`, max `53.73`

**Client tick (ms)**  avg `1.68`, p95 `3.51`, max `12.97`

**Memory**  start `1567 MB`, end `1769 MB`, peak `2122 MB`, GC `87 events / 710 ms`

**FPS over sampling window (ASCII):**

```
640.7 |                    █                                                           
606.0 |                    █                                                           
571.3 |                    █   █         █      █      █                               
536.6 |             █      █   █ █   █   █      █    █ ██       ██                █    
501.9 |             █     ██   █ █   █   █      █    █ ██       ███   ████ █      ███  
467.1 |       █     █     ██   ████  █   ████   █ █ █████       ███ ██████ ████   ███  
432.4 | █   █ █     ██   ███   ████  █   █████  ███ █████ █   █████ ████████████ ██████
397.7 |███  █ █  █ ████  ███  ██████ █  ███████████ ███████ ███████████████████████████
363.0 |███ █████████████████ ███████ ██████████████ ███████████████████████████████████
328.2 |█████████████████████████████ ██████████████████████████████████████████████████
293.5 |█████████████████████████████ ██████████████████████████████████████████████████
258.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   9
   1 ms | ████████████████████████████████████████  2246
   2 ms | ███████████████████  1042
   3 ms | ██████  350
   4 ms | ████  232
   5 ms | ██  121
   6 ms | █  83
   7 ms | █  34
   8 ms |   18
   9 ms |   11
  10 ms |   13
  11 ms |   7
  12 ms |   8
  13 ms |   2
  14 ms |   8
  15 ms |   11
  16 ms | █  29
  17 ms | █  69
  18 ms | ██  89
  19 ms | █  74
  20 ms | █  58
  21 ms | █  35
  22 ms |   25
  23 ms |   17
  24 ms |   16
  25 ms |   4
  26 ms |   10
  27 ms |   2
  28 ms |   4
  29 ms |   2
  30 ms |   2
  31 ms |   1
  32 ms |   2
  35 ms |   1
  36 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
  42 ms |   1
  45 ms |   2
  51 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `71.00`
- `fps_1pct_low` = `32.68`
- `fps_harmonic_avg` = `232.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `20.89`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `532.06`, min `21.75`, p50 `526.53`, p95 `1070.13`, p99 `1134.22`, 1%low `39.85`, 0.1%low `25.37`, std `253.15`

**Frame time (ms)**  avg `3.37`, p50 `1.90`, p95 `17.49`, p99 `21.22`, p99.9 `28.11`, max `45.98`

**Client tick (ms)**  avg `0.87`, p95 `1.33`, max `6.73`

**Memory**  start `999 MB`, end `2349 MB`, peak `3393 MB`, GC `49 events / 468 ms`

**FPS over sampling window (ASCII):**

```
1006.4 |                                                                               █
943.4 |                                                                         █ █████
880.3 |                                                                         ███████
817.2 |                                                                         ███████
754.1 |                                                                      █  ███████
691.1 |                                       █                      █   █  ██ ████████
628.0 |                                       ██                     █ █ ██ ██ ████████
564.9 |                             ██ ████  ███              █    ███ ████ ███████████
501.8 |                   ███  ███████ ████ ████   ██████ ██  █    ███ ████████████████
438.8 | ███  █ █  ████████████████████ █████████████████████ ████  ████████████████████
375.7 |█████████ ████████████████████████████████████████████████ █████████████████████
312.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  480
   1 ms | ████████████████████████████████████████  2941
   2 ms | ████████████████████  1491
   3 ms | ████  304
   4 ms | █  105
   5 ms | █  66
   6 ms |   21
   7 ms |   14
   8 ms |   4
   9 ms |   4
  10 ms |   4
  12 ms |   22
  13 ms |   25
  14 ms |   17
  15 ms |   24
  16 ms | █  52
  17 ms | █  109
  18 ms | █  94
  19 ms | █  56
  20 ms |   31
  21 ms |   23
  22 ms |   8
  23 ms |   7
  24 ms |   5
  25 ms |   6
  26 ms |   3
  27 ms |   4
  31 ms |   2
  39 ms |   1
  42 ms |   1
  45 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `25.37`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `15.00`
- `fps_harmonic_avg` = `296.32`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `39.85`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `551.97`, min `19.59`, p50 `522.99`, p95 `1088.95`, p99 `1344.57`, 1%low `26.90`, 0.1%low `20.42`, std `313.76`

**Frame time (ms)**  avg `4.14`, p50 `1.91`, p95 `18.92`, p99 `27.95`, p99.9 `47.22`, max `51.04`

**Client tick (ms)**  avg `5.87`, p95 `10.59`, max `23.88`

**Memory**  start `1106 MB`, end `1222 MB`, peak `2783 MB`, GC `45 events / 433 ms`

**FPS over sampling window (ASCII):**

```
1154.7 |                                                                               █
1070.7 |                                                                             █ █
986.8 |                                                                            ████
902.8 |                                                                     ██   ██████
818.9 |                                                           █        ███ ████████
734.9 |              █  ████                                      █ █ █ ██████ ████████
651.0 |█          █ ████████                                      █████████████████████
567.0 |█        █████████████      █                        ██    █████████████████████
483.1 |█        █████████████  █  ██  █   █        █        ████  █████████████████████
399.2 |█     █ █████████████████████ ██ █ █████   ███    █ ████████████████████████████
315.2 |██   ███████████████████████████████████ ███████████████████████████████████████
231.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  380
   1 ms | ████████████████████████████████████████  2225
   2 ms | ████████████████████  1100
   3 ms | ████  248
   4 ms | ██  127
   5 ms | █  67
   6 ms | █  48
   7 ms |   25
   8 ms | █  36
   9 ms |   20
  10 ms |   25
  11 ms |   8
  12 ms |   8
  13 ms | █  54
  14 ms | █  51
  15 ms | █  29
  16 ms | █  32
  17 ms | █  57
  18 ms | █  57
  19 ms | █  31
  20 ms | █  39
  21 ms |   18
  22 ms |   19
  23 ms |   10
  24 ms |   20
  25 ms |   22
  26 ms |   14
  27 ms |   14
  28 ms |   7
  29 ms |   2
  30 ms |   4
  31 ms |   5
  32 ms |   2
  33 ms |   3
  34 ms |   3
  35 ms |   1
  36 ms |   2
  38 ms |   2
  39 ms |   1
  40 ms |   1
  41 ms |   1
  43 ms |   2
  44 ms |   2
  45 ms |   2
  46 ms |   2
  47 ms |   4
  48 ms |   1
  50 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_avg` = `36.18`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `20.42`
- `preset_long` = `0.00`
- `preload_duration_ms` = `2.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `241.65`
- `fps_1pct_low` = `26.90`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `872.87`, min `19.49`, p50 `863.55`, p95 `1524.30`, p99 `1756.79`, 1%low `36.98`, 0.1%low `23.21`, std `451.69`

**Frame time (ms)**  avg `2.59`, p50 `1.16`, p95 `13.87`, p99 `21.71`, p99.9 `36.91`, max `51.30`

**Client tick (ms)**  avg `3.91`, p95 `7.81`, max `24.07`

**Memory**  start `1829 MB`, end `1359 MB`, peak `3184 MB`, GC `25 events / 310 ms`

**FPS over sampling window (ASCII):**

```
1591.9 |                                                                              ██
1469.4 |                                                                              ██
1346.9 |                       ████                                                 ████
1224.4 |                  ██████████                                  ██       █████████
1101.9 |                  ███████████                          █     █████ █████████████
979.4 |                 █████████████                      ████     ███████████████████
856.9 |                 ██████████████████         █    █ ██████   ████████████████████
734.3 |                 ██████████████████         █  ██████████   ████████████████████
611.8 |           ███████████████████████████     ███████████████  ████████████████████
489.3 |      ███████████████████████████████████ ██████████████████████████████████████
366.8 |█   ████████████████████████████████████████████████████████████████████████████
244.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  3306
   1 ms | █████████████████████████████████  2695
   2 ms | ████████  643
   3 ms | ███  252
   4 ms | █  94
   5 ms | █  63
   6 ms | █  43
   7 ms |   33
   8 ms |   18
   9 ms |   14
  10 ms |   6
  11 ms |   9
  12 ms | █  65
  13 ms | █  110
  14 ms | █  54
  15 ms |   36
  16 ms | █  53
  17 ms | █  63
  18 ms |   41
  19 ms |   13
  20 ms |   23
  21 ms |   17
  22 ms |   14
  23 ms |   15
  24 ms |   5
  25 ms |   8
  26 ms |   9
  27 ms |   6
  28 ms |   4
  29 ms |   1
  31 ms |   1
  32 ms |   2
  36 ms |   1
  37 ms |   2
  41 ms |   2
  43 ms |   1
  44 ms |   1
  48 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_avg` = `36.49`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `147.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `23.21`
- `preset_long` = `0.00`
- `preload_duration_ms` = `49.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `386.27`
- `fps_1pct_low` = `36.98`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `1243.89`, min `6.56`, p50 `1110.84`, p95 `2813.95`, p99 `3675.47`, 1%low `12.85`, 0.1%low `7.18`, std `1053.58`

**Frame time (ms)**  avg `6.67`, p50 `0.90`, p95 `33.85`, p99 `56.29`, p99.9 `112.51`, max `152.42`

**Client tick (ms)**  avg `19.09`, p95 `32.14`, max `61.44`

**Memory**  start `2296 MB`, end `1595 MB`, peak `2704 MB`, GC `20 events / 143 ms`

**FPS over sampling window (ASCII):**

```
3323.7 |                                                                               █
3025.6 |                                                                              ██
2727.5 |                                                                █ █           ██
2429.4 |                                                  █ █          ██ █ ██ █      ██
2131.3 |                        █         █       █       █ ████       ████ ████      ██
1833.3 |                      ███      ████     █████     ██████       ██████████     ██
1535.2 |                      █████   █████     █████     ████████     ██████████     ██
1237.1 |█              ███    █████   ██████    ██████    ████████     ██████████     ██
939.0 |██             ███   ██████   ███████  ████████  ██████████    ███████████   ███
640.9 |██             ████  ███████  ███████  ████████  ███████████  ████████████   ███
342.9 |███ █  █  ███ ██████ ███████  ████████ █████████ ████████████ ██████████████ ███
 44.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1561
   1 ms | ███████  281
   2 ms | ███  119
   3 ms | ██  85
   4 ms | ████  168
   5 ms | ███  127
   6 ms | █  20
   7 ms |   12
   8 ms |   14
   9 ms |   11
  10 ms |   9
  11 ms |   4
  12 ms |   8
  13 ms | ██  60
  14 ms | █  32
  15 ms | █  40
  16 ms | █  38
  17 ms | █  41
  18 ms | █  32
  19 ms | █  26
  20 ms |   12
  21 ms |   17
  22 ms |   14
  23 ms |   13
  24 ms |   15
  25 ms |   9
  26 ms |   13
  27 ms |   11
  28 ms |   6
  29 ms |   10
  30 ms |   9
  31 ms |   15
  32 ms |   9
  33 ms |   10
  34 ms |   10
  35 ms |   14
  36 ms |   8
  37 ms |   8
  38 ms |   1
  39 ms |   5
  40 ms |   7
  41 ms |   9
  42 ms |   6
  43 ms |   5
  44 ms |   6
  45 ms |   4
  46 ms |   4
  47 ms |   4
  48 ms |   5
  49 ms |   3
  50 ms |   2
  51 ms |   6
  52 ms |   5
  53 ms |   3
  54 ms |   4
  56 ms |   4
  57 ms |   1
  59 ms |   4
  60 ms |   1
  61 ms |   3
  65 ms |   1
  66 ms |   5
  72 ms |   1
  73 ms |   1
  75 ms |   1
  78 ms |   1
  92 ms |   1
  98 ms |   1
  99 ms |   1
 106 ms |   1
 112 ms |   1
 128 ms |   1
 136 ms |   1
 152 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `99.00`
- `falling_blocks_landed` = `27586.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `150.00`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `7.18`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4794.84`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.85`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `1115.35`, min `8.12`, p50 `836.64`, p95 `2862.48`, p99 `3526.42`, 1%low `10.84`, 0.1%low `8.32`, std `1050.07`

**Frame time (ms)**  avg `9.08`, p50 `1.20`, p95 `43.89`, p99 `75.89`, p99.9 `109.64`, max `123.19`

**Client tick (ms)**  avg `20.13`, p95 `34.85`, max `67.80`

**Memory**  start `2202 MB`, end `1330 MB`, peak `2746 MB`, GC `24 events / 152 ms`

**FPS over sampling window (ASCII):**

```
3005.2 |                                                                            ████
2734.0 |                                                             █              ████
2462.7 |                                                          █  ██  ██         ████
2191.5 |                                       █        █         █  ███████        ████
1920.3 |                             ██      █ █      █ ██       ███████████        ████
1649.1 |                            ███      █ █      █ ██       ███████████        ████
1377.9 |                    ██     █████     ████    █████       ██████████████    █████
1106.7 |              █     ███    ██████   █████    ███████     ██████████████    █████
835.5 |██            ██   █████   ██████   ██████   ████████    ██████████████    █████
564.2 |██            ███  █████   ███████  ██████   █████████   ███████████████   █████
293.0 |███        █  ███  ██████  ███████  ███████  ██████████ █████████████████  █████
 21.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1016
   1 ms | ██████████  248
   2 ms | ████  95
   3 ms | ██  39
   4 ms | ██  39
   5 ms | █  34
   6 ms | ███  70
   7 ms | ███  85
   8 ms | █  20
   9 ms |   6
  10 ms |   9
  11 ms |   9
  12 ms | █  15
  13 ms | █  35
  14 ms | █  30
  15 ms | █  17
  16 ms | █  31
  17 ms | █  38
  18 ms | █  25
  19 ms | █  15
  20 ms |   11
  21 ms |   7
  22 ms |   11
  23 ms |   6
  24 ms |   11
  25 ms |   6
  26 ms |   10
  27 ms | █  13
  28 ms |   9
  29 ms |   11
  30 ms |   12
  31 ms |   10
  32 ms |   12
  33 ms |   10
  34 ms |   10
  35 ms |   10
  36 ms |   3
  37 ms |   8
  38 ms |   12
  39 ms |   11
  40 ms |   5
  41 ms |   5
  42 ms |   3
  43 ms |   8
  44 ms |   4
  45 ms |   7
  46 ms |   4
  47 ms |   3
  48 ms |   9
  49 ms |   5
  50 ms |   6
  51 ms |   6
  52 ms |   2
  53 ms |   4
  54 ms |   6
  56 ms |   3
  58 ms |   3
  60 ms |   3
  61 ms |   2
  62 ms |   2
  64 ms |   1
  65 ms |   5
  66 ms |   3
  67 ms |   2
  69 ms |   1
  72 ms |   2
  73 ms |   2
  74 ms |   2
  75 ms |   1
  76 ms |   1
  77 ms |   1
  78 ms |   2
  79 ms |   1
  80 ms |   1
  81 ms |   1
  82 ms |   1
  83 ms |   1
  87 ms |   1
  89 ms |   2
  92 ms |   1
  95 ms |   1
  96 ms |   1
 100 ms |   1
 101 ms |   1
 103 ms |   2
 111 ms |   1
 117 ms |   1
 123 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `5.00`
- `falling_blocks_landed` = `25377.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `110.08`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `8.32`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4808.37`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `10.84`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `1356.47`, min `16.13`, p50 `1451.80`, p95 `2277.18`, p99 `2542.09`, 1%low `36.76`, 0.1%low `20.27`, std `703.87`

**Frame time (ms)**  avg `1.98`, p50 `0.69`, p95 `8.19`, p99 `21.34`, p99.9 `41.45`, max `62.01`

**Client tick (ms)**  avg `3.08`, p95 `5.51`, max `23.03`

**Memory**  start `1785 MB`, end `3251 MB`, peak `3657 MB`, GC `46 events / 628 ms`

**FPS over sampling window (ASCII):**

```
1949.8 |                                                                       █ ██ ███ 
1813.2 |                                       █         █    █   █     █  █  █████ ████
1676.7 |█ █  █                                 ███  █ ██ █  █ █ ███  █ ████████████ ████
1540.2 |████ █                           █  ██ ███ █████████████████████████████████████
1403.6 |████ ██                          █ █████████████████████████████████████████████
1267.1 |███████                          ███████████████████████████████████████████████
1130.6 |███████                        █████████████████████████████████████████████████
994.0 |████████                 ████ ██████████████████████████████████████████████████
857.5 |████████                ████████████████████████████████████████████████████████
721.0 |████████            ████████████████████████████████████████████████████████████
584.4 |█████████   ██  ██ █████████████████████████████████████████████████████████████
447.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6577
   1 ms | █████████████  2096
   2 ms | ██  401
   3 ms | █  202
   4 ms | █  144
   5 ms | █  89
   6 ms |   40
   7 ms |   23
   8 ms |   10
   9 ms |   6
  10 ms |   3
  11 ms |   4
  12 ms |   3
  14 ms |   7
  15 ms |   19
  16 ms |   63
  17 ms | █  83
  18 ms |   81
  19 ms |   64
  20 ms |   48
  21 ms |   33
  22 ms |   23
  23 ms |   11
  24 ms |   7
  25 ms |   8
  26 ms |   10
  27 ms |   5
  28 ms |   1
  29 ms |   2
  31 ms |   1
  33 ms |   3
  34 ms |   1
  39 ms |   1
  41 ms |   2
  43 ms |   1
  44 ms |   1
  46 ms |   1
  49 ms |   2
  50 ms |   1
  51 ms |   1
  54 ms |   1
  62 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `74.00`
- `falling_blocks_landed` = `3185.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `503.94`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `20.27`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.24`
- `falling_blocks_alive_max` = `833.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `36.76`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1360.89`, min `19.37`, p50 `1495.47`, p95 `2297.82`, p99 `2795.29`, 1%low `36.36`, 0.1%low `22.75`, std `727.11`

**Frame time (ms)**  avg `1.97`, p50 `0.67`, p95 `6.64`, p99 `22.07`, p99.9 `37.60`, max `51.62`

**Client tick (ms)**  avg `3.10`, p95 `5.40`, max `34.15`

**Memory**  start `2517 MB`, end `2058 MB`, peak `3550 MB`, GC `49 events / 613 ms`

**FPS over sampling window (ASCII):**

```
2333.1 |█                                                                               
2152.5 |█                                                                          ██   
1972.0 |█                                                                      █   ███ █
1791.4 |███ █ █                              █        █ █ ███   ██ █  █ █    █ █  ██████
1610.9 |███████                              █ ██ ██ ████ █████ ███████████  ███ ███████
1430.3 |████████                             ████ ██████████████████████████████████████
1249.8 |████████                          ██████████████████████████████████████████████
1069.2 |█████████                  █ ███████████████████████████████████████████████████
888.6 |█████████                 ██████████████████████████████████████████████████████
708.1 |██████████              ████████████████████████████████████████████████████████
527.5 |██████████    ██████████████████████████████████████████████████████████████████
347.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6646
   1 ms | ███████████  1841
   2 ms | ████  633
   3 ms | █  225
   4 ms | █  137
   5 ms | █  105
   6 ms |   64
   7 ms |   24
   8 ms |   9
   9 ms |   10
  10 ms |   4
  11 ms |   1
  12 ms |   2
  13 ms |   3
  14 ms |   2
  15 ms |   11
  16 ms |   22
  17 ms |   78
  18 ms | █  97
  19 ms |   49
  20 ms |   50
  21 ms |   27
  22 ms |   24
  23 ms |   18
  24 ms |   14
  25 ms |   7
  26 ms |   8
  27 ms |   8
  28 ms |   3
  29 ms |   1
  31 ms |   2
  32 ms |   3
  34 ms |   4
  35 ms |   1
  38 ms |   2
  39 ms |   2
  40 ms |   1
  41 ms |   1
  43 ms |   1
  46 ms |   1
  47 ms |   1
  49 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `4.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `507.20`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `22.75`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.53`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `36.36`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `704.06`, min `22.82`, p50 `737.88`, p95 `1120.54`, p99 `1440.74`, 1%low `39.62`, 0.1%low `26.88`, std `296.93`

**Frame time (ms)**  avg `2.70`, p50 `1.36`, p95 `16.90`, p99 `20.83`, p99.9 `32.29`, max `43.83`

**Client tick (ms)**  avg `1.04`, p95 `1.58`, max `19.16`

**Memory**  start `2356 MB`, end `3536 MB`, peak `4060 MB`, GC `41 events / 592 ms`

**FPS over sampling window (ASCII):**

```
1073.6 |█                                                                               
1014.2 |█   █                                                                           
954.7 |██  █   █                                                                       
895.3 |███ █   █ █ ███ █                                                         █    █
835.9 |███ ███ █ ███████       █                                                 █ ████
776.5 |███████████████████     ██                                            ██  ██████
717.1 |███████████████████  █ ███ ██                         █             █ ██████████
657.7 |█████████████████████████████   ███  █ ██             ██    █      █████████████
598.3 |█████████████████████████████  ████ ██████ █  █   █ █ ███████  █ ███████████████
538.9 |███████████████████████████████████ ████████████ ██ ████████████████████████████
479.4 |███████████████████████████████████ ████████████ ███████████████████████████████
420.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  959
   1 ms | ████████████████████████████████████████  4917
   2 ms | █████  622
   3 ms | ██  237
   4 ms | █  104
   5 ms |   43
   6 ms |   21
   7 ms |   11
   8 ms |   3
   9 ms |   4
  10 ms |   1
  11 ms |   1
  12 ms |   2
  13 ms |   2
  14 ms |   8
  15 ms |   35
  16 ms | █  79
  17 ms | █  98
  18 ms | █  94
  19 ms |   61
  20 ms |   31
  21 ms |   20
  22 ms |   8
  23 ms |   10
  24 ms |   5
  25 ms |   9
  26 ms |   6
  27 ms |   2
  28 ms |   2
  29 ms |   1
  32 ms |   4
  33 ms |   1
  35 ms |   1
  37 ms |   2
  39 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `39.62`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `370.11`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `26.88`
- `seed` = `5099.00`
- `preload_duration_ms` = `24.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1918.79`, min `20.00`, p50 `2083.38`, p95 `2595.18`, p99 `3145.93`, 1%low `44.36`, 0.1%low `26.59`, std `634.33`

**Frame time (ms)**  avg `1.12`, p50 `0.48`, p95 `2.55`, p99 `19.11`, p99.9 `30.02`, max `49.99`

**Client tick (ms)**  avg `0.51`, p95 `0.74`, max `7.44`

**Memory**  start `2308 MB`, end `3334 MB`, peak `4211 MB`, GC `38 events / 589 ms`

**FPS over sampling window (ASCII):**

```
2372.7 | █                                                                              
2300.9 | █                                                                              
2229.2 | █                                                                              
2157.4 | █                            █                                                 
2085.6 | █   █    █         ██  █  █ ██                                                 
2013.9 |██   █ ████  ██  █  ██  █  █ ██ █          █   █  █   █     █   █    █    █     
1942.1 |███  ██████  █████ ███ ██ ███████    █     █ █ █  █  ██   ███████ ████ █  ██  ██
1870.4 |███████████  █████ ███ ███████████ █ █   █ ████████████   ████████████ █  ███ ██
1798.6 |████████████ █████ ███████████████ █ █  ██ ████████████  █████████████ █████████
1726.8 |████████████ █████ █████████████████ █ ████████████████ ████████████████████████
1655.1 |██████████████████ ███████████████████ █████████████████████████████████████████
1583.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15911
   1 ms | ██  813
   2 ms | █  295
   3 ms |   192
   4 ms |   61
   5 ms |   14
   6 ms |   4
   7 ms |   2
   8 ms |   1
   9 ms |   2
  13 ms |   1
  14 ms |   3
  15 ms |   19
  16 ms |   63
  17 ms |   101
  18 ms |   93
  19 ms |   78
  20 ms |   41
  21 ms |   23
  22 ms |   9
  23 ms |   9
  24 ms |   5
  25 ms |   3
  26 ms |   2
  29 ms |   1
  30 ms |   2
  31 ms |   2
  32 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   2
  36 ms |   1
  39 ms |   1
  40 ms |   3
  42 ms |   1
  44 ms |   1
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `889.13`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `26.59`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `45.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `44.36`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1843.49`, min `17.79`, p50 `2005.12`, p95 `2557.66`, p99 `3372.55`, 1%low `42.51`, 0.1%low `24.41`, std `652.95`

**Frame time (ms)**  avg `1.21`, p50 `0.50`, p95 `2.89`, p99 `19.72`, p99.9 `29.14`, max `56.21`

**Client tick (ms)**  avg `0.50`, p95 `0.94`, max `21.36`

**Memory**  start `1627 MB`, end `2625 MB`, peak `3989 MB`, GC `34 events / 494 ms`

**FPS over sampling window (ASCII):**

```
2446.1 |                                                                               █
2354.1 |                                                                               █
2262.0 |                                                                               █
2169.9 |█                                                                              █
2077.8 |█                              █             █            █               █   ██
1985.8 |█  █ ██             ████       █   █      █  █          ████         █    █   ██
1893.7 |████ ██     ████  ██████       █  ████    █ ██    ██    ████         █   ████ ██
1801.6 |████ ████  █████  ██████  █  ███  ██████  █████ █████   ██████ ███  ████████████
1709.5 |████ ████ ██████ ███████  █ █████ ███████ ████████████ ███████████ █████████████
1617.4 |████████████████████████  ███████████████ ████████████████████████ █████████████
1525.4 |████████████████████████  ███████████████ ██████████████████████████████████████
1433.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14597
   1 ms | ██  822
   2 ms | █  352
   3 ms | █  206
   4 ms |   75
   5 ms |   27
   6 ms |   15
   7 ms |   7
   8 ms |   4
   9 ms |   4
  12 ms |   3
  13 ms |   4
  14 ms |   5
  15 ms |   18
  16 ms |   39
  17 ms |   82
  18 ms |   85
  19 ms |   77
  20 ms |   56
  21 ms |   32
  22 ms |   17
  23 ms |   7
  24 ms |   5
  25 ms |   6
  26 ms |   1
  27 ms |   3
  28 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
  33 ms |   2
  36 ms |   1
  38 ms |   1
  40 ms |   1
  41 ms |   1
  43 ms |   2
  45 ms |   2
  48 ms |   2
  51 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `24.41`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `828.38`
- `preload_duration_ms` = `116.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `42.51`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1666.18`, min `20.78`, p50 `1964.93`, p95 `2451.28`, p99 `2895.08`, 1%low `40.83`, 0.1%low `26.12`, std `768.86`

**Frame time (ms)**  avg `1.70`, p50 `0.51`, p95 `4.92`, p99 `20.38`, p99.9 `31.44`, max `48.12`

**Client tick (ms)**  avg `0.52`, p95 `1.00`, max `3.69`

**Memory**  start `2290 MB`, end `3569 MB`, peak `3908 MB`, GC `40 events / 580 ms`

**FPS over sampling window (ASCII):**

```
2084.1 |     █ █                                          █ █               █           
2002.3 |█ █  █ █               █                     █ █  █ █               █   █       
1920.5 |█ █  █ █  █            █   █ █               █ █  █ █  █            █   █  ██   
1838.7 |█ █  █ █  █     █   █  █ █ █ █      █        █ █  █ █  █ █          █ █ █  ██   
1756.9 |█ █  █ █  ███   █   █  █ █ █ █  █   █        █ █  █ █  █ █  █ █     █ █ █  ██   
1675.1 |█ █  █ █  ███   █   █  █ █ █ █  █   ██    █  █ █  █ ██ ████ ███     █ ████████ █
1593.3 |█ █  █ ██ ███   █   ██████ █ ██ ███ ██  █ ██ ███ ██ ███████ █████████ ████████ █
1511.5 |█ █ ██ ██████ █ █   ██████ █ ██ ███ ███ ████ ██████████████ ██████████████████ █
1429.7 |█ ████████████████  ███████████████ ████████████████████████████████████████████
1347.9 |█ █████████████████ ███████████████ ████████████████████████████████████████████
1266.1 |███████████████████ ███████████████ ████████████████████████████████████████████
1184.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9199
   1 ms | ███  589
   2 ms | ███  744
   3 ms | ██  544
   4 ms | █  127
   5 ms |   45
   6 ms |   28
   7 ms |   10
   8 ms |   9
   9 ms |   9
  10 ms |   3
  12 ms |   2
  14 ms |   1
  15 ms |   18
  16 ms |   57
  17 ms |   82
  18 ms |   87
  19 ms |   88
  20 ms |   57
  21 ms |   18
  22 ms |   23
  23 ms |   10
  24 ms |   4
  25 ms |   6
  26 ms |   3
  27 ms |   1
  28 ms |   3
  29 ms |   2
  30 ms |   3
  31 ms |   1
  32 ms |   1
  33 ms |   1
  36 ms |   2
  37 ms |   3
  38 ms |   2
  39 ms |   1
  43 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `40.83`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `589.21`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `26.12`
- `seed` = `4027.00`
- `preload_duration_ms` = `57.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `1669.84`, min `21.50`, p50 `1835.07`, p95 `2294.68`, p99 `2720.48`, 1%low `42.68`, 0.1%low `26.25`, std `577.24`

**Frame time (ms)**  avg `1.31`, p50 `0.54`, p95 `3.21`, p99 `19.95`, p99.9 `32.43`, max `46.51`

**Client tick (ms)**  avg `0.50`, p95 `0.88`, max `6.00`

**Memory**  start `3098 MB`, end `2350 MB`, peak `3860 MB`, GC `37 events / 583 ms`

**FPS over sampling window (ASCII):**

```
1934.9 | █                                                                              
1878.4 |██        █           █  █                                                    █ 
1821.9 |██        █ █         █  █    █          █      █                            ██ 
1765.4 |██     █  ████        █  █    ██         █      █                █   █      ███ 
1708.9 |██  █  ████████   ██  ████    ██  ███  █ █ ██   █    ████ █  ██  █ ███    █ ███ 
1652.3 |██  ██ ████████   █████████  ███ ████  █ █ ██   ██  █████ ██ ██  █ ████  ███████
1595.8 |██ ████████████   ██████████ ███ █████ █ ████ █ ███ █████ █████  █ █████ ███████
1539.3 |██████████████████████████████████████ █ ████ █ ███ █████ ██████ ███████████████
1482.8 |██████████████████████████████████████ █ ████ ██████████████████ ███████████████
1426.3 |████████████████████████████████████████ ███████████████████████ ███████████████
1369.7 |████████████████████████████████████████████████████████████████ ███████████████
1313.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13234
   1 ms | ███  840
   2 ms | █  332
   3 ms | █  221
   4 ms |   76
   5 ms |   31
   6 ms |   14
   7 ms |   7
   8 ms |   5
   9 ms |   1
  10 ms |   1
  12 ms |   2
  13 ms |   3
  14 ms |   3
  15 ms |   7
  16 ms |   35
  17 ms |   71
  18 ms |   111
  19 ms |   80
  20 ms |   61
  21 ms |   35
  22 ms |   17
  23 ms |   10
  24 ms |   4
  25 ms |   2
  26 ms |   1
  27 ms |   1
  31 ms |   2
  32 ms |   2
  33 ms |   1
  34 ms |   2
  35 ms |   3
  36 ms |   2
  37 ms |   2
  41 ms |   3
  42 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `761.08`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `42.68`
- `fps_0p1pct_low` = `26.25`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `28.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23840 ms  |  Sample ticks: 400

**FPS**  avg `2178.79`, min `23.20`, p50 `2252.65`, p95 `3299.20`, p99 `3458.60`, 1%low `55.65`, 0.1%low `42.02`, std `832.86`

**Frame time (ms)**  avg `0.99`, p50 `0.44`, p95 `1.81`, p99 `15.74`, p99.9 `20.49`, max `43.11`

**Client tick (ms)**  avg `0.41`, p95 `0.65`, max `4.19`

**Memory**  start `3139 MB`, end `2460 MB`, peak `3494 MB`, GC `21 events / 230 ms`

**FPS over sampling window (ASCII):**

```
2855.5 |  ██                                                                            
2741.4 |  ███                                                                           
2627.2 | █████       █    █                                                             
2513.1 | █████       ████ █ █   █ █ █    █  █                                           
2399.0 |██████       ████ ███ █████ █  █ █  █                                           
2284.8 |██████      █████████████████  ███  █  ██  █ █ █                                
2170.7 |██████   █  ██████████████████ ███  ██ ██ ████ ██  █   ██ █                     
2056.5 |███████  █  ██████████████████████████████████ ██  █   ██ ██ █ █ ██      █  ████
1942.4 |███████  █ ███████████████████████████████████ ██  ██ █████████████  ███ ███████
1828.2 |███████  █████████████████████████████████████████ ██ ██████████████ ███ ███████
1714.1 |███████ ████████████████████████████████████████████████████████████████ ███████
1600.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18328
   1 ms | ██  981
   2 ms | █  291
   3 ms |   58
   4 ms |   9
   5 ms |   4
   6 ms |   2
   7 ms |   1
   8 ms |   2
   9 ms |   1
  12 ms |   5
  13 ms |   144
  14 ms |   164
  15 ms |   92
  16 ms |   72
  17 ms |   43
  18 ms |   27
  19 ms |   19
  20 ms |   7
  21 ms |   10
  22 ms |   2
  23 ms |   1
  26 ms |   1
  28 ms |   1
  32 ms |   1
  43 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `55.65`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `50.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `1013.43`
- `part` = `1.00`
- `fps_0p1pct_low` = `42.02`
- `seed` = `7411.00`
- `preload_duration_ms` = `780.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24303 ms  |  Sample ticks: 400

**FPS**  avg `1833.38`, min `21.87`, p50 `1875.43`, p95 `2987.65`, p99 `3260.04`, 1%low `52.49`, 0.1%low `36.28`, std `742.08`

**Frame time (ms)**  avg `1.19`, p50 `0.53`, p95 `2.44`, p99 `16.45`, p99.9 `21.63`, max `45.72`

**Client tick (ms)**  avg `0.40`, p95 `0.60`, max `3.05`

**Memory**  start `2536 MB`, end `2457 MB`, peak `3722 MB`, GC `20 events / 229 ms`

**FPS over sampling window (ASCII):**

```
2382.3 |        █   █                                                                   
2281.2 |  █    ████ █                                                                   
2180.1 |███████████ █         █                                                         
2079.0 |█████████████    █  ██████   █  █                                               
1977.9 |██████████████ ████ ██████ █ █████ █                                            
1876.7 |██████████████ █████████████████████    █  █                                    
1775.6 |██████████████ ██████████████████████ ███ ███     ███                           
1674.5 |██████████████ ██████████████████████ ███████████████████  ███  ███             
1573.4 |█████████████████████████████████████████████████████████ ████████████  █       
1472.2 |█████████████████████████████████████████████████████████ █████████████████ ██ █
1371.1 |███████████████████████████████████████████████████████████████████████████ ████
1270.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14570
   1 ms | ████  1294
   2 ms | █  284
   3 ms |   83
   4 ms |   27
   5 ms |   12
   6 ms |   4
   7 ms |   1
   8 ms |   1
   9 ms |   3
  11 ms |   1
  12 ms |   2
  13 ms |   87
  14 ms |   165
  15 ms |   114
  16 ms |   83
  17 ms |   46
  18 ms |   32
  19 ms |   24
  20 ms |   9
  21 ms |   6
  22 ms |   6
  23 ms |   2
  24 ms |   1
  27 ms |   1
  30 ms |   1
  32 ms |   1
  37 ms |   1
  45 ms |   2
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `52.49`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `843.14`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.28`
- `seed` = `7417.00`
- `preload_duration_ms` = `1230.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `2108.92`, min `23.19`, p50 `2194.50`, p95 `3245.80`, p99 `3522.72`, 1%low `52.60`, 0.1%low `35.40`, std `830.50`

**Frame time (ms)**  avg `1.04`, p50 `0.46`, p95 `2.12`, p99 `16.03`, p99.9 `22.94`, max `43.12`

**Client tick (ms)**  avg `0.41`, p95 `0.62`, max `5.20`

**Memory**  start `2400 MB`, end `3878 MB`, peak `3942 MB`, GC `20 events / 239 ms`

**FPS over sampling window (ASCII):**

```
2808.4 |      █     █                                                                   
2691.1 |      █     █                                                                   
2573.9 |      ██  █ ███  █ █                                                            
2456.7 |█   █████ ██████████                                                            
2339.4 |█ ██████████████████          █                                                 
2222.2 |███████████████████████      ██   ███              █  █                         
2104.9 |████████████████████████    █████ ████   █ █   ██  █ ██ ██ █  █      █         █
1987.7 |████████████████████████    ██████████████ ██  █████ ███████  █  ██  ██  █     █
1870.5 |████████████████████████   ██████████████████  █████████████  █  ██████████   ██
1753.2 |███████████████████████████████████████████████████████████████  ██████████   ██
1636.0 |████████████████████████████████████████████████████████████████████████████ ███
1518.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17269
   1 ms | ██  1033
   2 ms | █  309
   3 ms |   80
   4 ms |   24
   5 ms |   6
   6 ms |   4
   7 ms |   1
   9 ms |   2
  11 ms |   1
  12 ms |   25
  13 ms |   130
  14 ms |   140
  15 ms |   88
  16 ms |   57
  17 ms |   45
  18 ms |   38
  19 ms |   17
  20 ms |   9
  21 ms |   7
  22 ms |   4
  23 ms |   5
  24 ms |   1
  26 ms |   3
  27 ms |   3
  28 ms |   2
  30 ms |   1
  31 ms |   1
  35 ms |   2
  43 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `52.60`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `965.32`
- `part` = `1.00`
- `fps_0p1pct_low` = `35.40`
- `seed` = `7433.00`
- `preload_duration_ms` = `50.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1977.66`, min `20.09`, p50 `2055.31`, p95 `3085.18`, p99 `3384.68`, 1%low `53.94`, 0.1%low `37.23`, std `793.77`

**Frame time (ms)**  avg `1.10`, p50 `0.49`, p95 `2.28`, p99 `15.74`, p99.9 `21.27`, max `49.77`

**Client tick (ms)**  avg `0.39`, p95 `0.56`, max `3.63`

**Memory**  start `3933 MB`, end `3105 MB`, peak `4036 MB`, GC `20 events / 239 ms`

**FPS over sampling window (ASCII):**

```
2502.6 |   █    █                                                                       
2407.6 |  ██ █ ██                                                                       
2312.5 |  ██ █████    █                                                                 
2217.5 | █████████  ████  █    ██  ██                                                   
2122.4 | █████████ █████  ██   ██  ███                            █                    █
2027.4 | ███████████████████   ███████   █  █ █     █      █ █    █   █ █              █
1932.3 |████████████████████   ███████   █  ████ █ ███  █  █ ████ █   █ █    █ ██  █████
1837.3 |█████████████████████  ████████  █  ██████████  █  ████████ ███ █    ███████████
1742.2 |█████████████████████ █████████  █████████████  ██ ████████████████ ████████████
1647.2 |█████████████████████ ████████████████████████ ████████████████████ ████████████
1552.1 |█████████████████████ ████████████████████████ ████████████████████ ████████████
1457.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16049
   1 ms | ███  1131
   2 ms | █  329
   3 ms |   63
   4 ms |   24
   5 ms |   10
   6 ms |   4
   7 ms |   2
   8 ms |   3
   9 ms |   1
  12 ms |   8
  13 ms |   132
  14 ms |   173
  15 ms |   108
  16 ms |   57
  17 ms |   36
  18 ms |   24
  19 ms |   14
  20 ms |   15
  21 ms |   8
  22 ms |   5
  23 ms |   2
  25 ms |   1
  27 ms |   1
  29 ms |   1
  34 ms |   1
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `53.94`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `910.20`
- `part` = `1.00`
- `fps_0p1pct_low` = `37.23`
- `seed` = `7451.00`
- `preload_duration_ms` = `40.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23733 ms  |  Sample ticks: 400

**FPS**  avg `1943.41`, min `36.95`, p50 `2008.56`, p95 `3016.15`, p99 `3198.47`, 1%low `54.78`, 0.1%low `43.17`, std `742.90`

**Frame time (ms)**  avg `1.10`, p50 `0.50`, p95 `2.32`, p99 `16.23`, p99.9 `20.84`, max `27.06`

**Client tick (ms)**  avg `0.40`, p95 `0.65`, max `1.24`

**Memory**  start `2576 MB`, end `3222 MB`, peak `4134 MB`, GC `21 events / 218 ms`

**FPS over sampling window (ASCII):**

```
2417.0 |                        █                                                       
2337.4 |                        █ █                                                     
2257.8 |        █               ███ █    █           █                                  
2178.2 |      █ █               ███ █    █     █     █                                  
2098.6 |   █  ███             █████ █   ██    ██    ██ █         █                      
2019.0 |   █  ███ █ ██   ██   ███████   ████  ███  ██████  █    ██        ██ █ █        
1939.4 | █ █ █████████ █████  ███████   ████  ███  ██████ █████ ████      ████████      
1859.8 |██ █ █████████ █████ █████████ █████  ███  █████████████████   █  █████████ █   
1780.2 |██████████████ █████████████████████  ███  █████████████████  ███ █████████ █ █ 
1700.6 |████████████████████████████████████ █████ █████████████████  █████████████ ████
1620.9 |████████████████████████████████████████████████████████████  ██████████████████
1541.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16208
   1 ms | ██  884
   2 ms | █  263
   3 ms |   79
   4 ms |   38
   5 ms |   19
   6 ms |   6
   7 ms |   5
   8 ms |   7
   9 ms |   1
  11 ms |   1
  12 ms |   54
  13 ms |   151
  14 ms |   110
  15 ms |   85
  16 ms |   71
  17 ms |   60
  18 ms |   19
  19 ms |   23
  20 ms |   7
  21 ms |   5
  22 ms |   5
  23 ms |   2
  24 ms |   4
  26 ms |   1
  27 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-15.00`
- `entity_count_sample_start` = `16.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `54.78`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `57.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `905.43`
- `part` = `1.00`
- `fps_0p1pct_low` = `43.17`
- `seed` = `7457.00`
- `preload_duration_ms` = `704.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24801 ms  |  Sample ticks: 400

**FPS**  avg `2031.95`, min `16.12`, p50 `2062.69`, p95 `3376.37`, p99 `3561.99`, 1%low `51.51`, 0.1%low `37.45`, std `857.71`

**Frame time (ms)**  avg `1.17`, p50 `0.48`, p95 `2.57`, p99 `17.14`, p99.9 `22.56`, max `62.02`

**Client tick (ms)**  avg `0.37`, p95 `0.53`, max `3.34`

**Memory**  start `2460 MB`, end `3382 MB`, peak `4201 MB`, GC `19 events / 204 ms`

**FPS over sampling window (ASCII):**

```
3026.2 |     █                                                                          
2875.8 |██   █   █ █ ██                                                                 
2725.5 |██   █ █ █ █ ██              █                                                  
2575.1 |██ █████ ███ █████ █    ███ ██                                                  
2424.7 |██ █████ █████████ █   ███████    █                                             
2274.3 |████████████████████   ███████  ███                                             
2123.9 |████████████████████  █████████████ █                                           
1973.5 |████████████████████  █████████████████                                         
1823.1 |████████████████████  ████████████████████        ███                 █         
1672.7 |█████████████████████████████████████████████   ████████ ██ ███ ███ █ ███ █     
1522.3 |██████████████████████████████████████████████ ████████████████████████████ ████
1371.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15104
   1 ms | ███  1022
   2 ms | █  207
   3 ms |   88
   4 ms |   59
   5 ms |   31
   6 ms |   12
   7 ms |   4
   8 ms |   4
   9 ms |   3
  10 ms |   2
  12 ms |   16
  13 ms |   72
  14 ms |   101
  15 ms |   132
  16 ms |   97
  17 ms |   77
  18 ms |   45
  19 ms |   23
  20 ms |   9
  21 ms |   3
  22 ms |   10
  23 ms |   6
  24 ms |   2
  25 ms |   4
  27 ms |   2
  62 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-38.00`
- `entity_count_sample_start` = `39.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `51.51`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `50.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `856.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `37.45`
- `seed` = `7477.00`
- `preload_duration_ms` = `1752.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1836.27`, min `20.01`, p50 `1961.60`, p95 `2729.42`, p99 `2875.09`, 1%low `51.62`, 0.1%low `36.40`, std `692.73`

**Frame time (ms)**  avg `1.25`, p50 `0.51`, p95 `3.44`, p99 `16.73`, p99.9 `22.63`, max `49.97`

**Client tick (ms)**  avg `0.35`, p95 `0.59`, max `1.25`

**Memory**  start `2894 MB`, end `3236 MB`, peak `4237 MB`, GC `22 events / 230 ms`

**FPS over sampling window (ASCII):**

```
2298.7 |      ███   █                                                                   
2211.0 |     ████ █ █                █                                                  
2123.3 | █  █████ ███  █        █   ██ █                                                
2035.6 |██ ███████████ █ █      █   ██ █                                                
1947.8 |████████████████████   ███ ███ █                █       █                       
1860.1 |█████████████████████ ████████ █ ██ █████       █    █  █                       
1772.4 |█████████████████████ ███████████████████      █████ █ ██    ██     █   █       
1684.7 |█████████████████████████████████████████  ███████████ ████  ██   ███   ███     
1597.0 |█████████████████████████████████████████ ██████████████████████ ██████ ████  ██
1509.3 |███████████████████████████████████████████████████████████████████████ ████ ███
1421.5 |███████████████████████████████████████████████████████████████████████ ████ ███
1333.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14073
   1 ms | ███  967
   2 ms |   171
   3 ms |   125
   4 ms |   78
   5 ms |   26
   6 ms |   9
   7 ms |   4
  12 ms |   5
  13 ms |   81
  14 ms |   70
  15 ms | █  190
  16 ms |   131
  17 ms |   42
  18 ms |   29
  19 ms |   21
  20 ms |   9
  21 ms |   6
  22 ms |   9
  23 ms |   6
  24 ms |   2
  25 ms |   3
  26 ms |   1
  27 ms |   1
  28 ms |   1
  40 ms |   1
  49 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-2.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `51.62`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `803.09`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.40`
- `seed` = `7481.00`
- `preload_duration_ms` = `47.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24873 ms  |  Sample ticks: 400

**FPS**  avg `1664.43`, min `24.59`, p50 `1761.13`, p95 `2615.01`, p99 `2813.33`, 1%low `49.97`, 0.1%low `35.91`, std `690.63`

**Frame time (ms)**  avg `1.40`, p50 `0.57`, p95 `4.39`, p99 `17.41`, p99.9 `24.01`, max `40.66`

**Client tick (ms)**  avg `0.36`, p95 `0.60`, max `1.25`

**Memory**  start `2737 MB`, end `4518 MB`, peak `4672 MB`, GC `19 events / 212 ms`

**FPS over sampling window (ASCII):**

```
2238.0 | █     █                                                                        
2144.8 |███    █                                                                        
2051.6 |███   ██ █                                                                      
1958.4 |████ ███ ██  ██ █     █                                                         
1865.2 |████ ███ ██████ █   ████  ███ █           █ █   █                               
1772.0 |████ ███ ████████   ████  ██████       █  █ █ █ █ █                             
1678.8 |██████████████████  ████  ██████ ████ ██  ███ █ █ █ █    █            ██        
1585.6 |██████████████████ ██████ ██████ ███████  ███ █ ███ ██ █ █   █      █ ██  █   █ 
1492.4 |█████████████████████████ ██████████████  ███ █ ██████████ ███ ██   █ █████   █ 
1399.2 |█████████████████████████ ██████████████ ████ ████████████ ███ ██ █ ███████ █ █ 
1306.0 |█████████████████████████████████████████████████████████████████████████████ ██
1212.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11847
   1 ms | ████  1317
   2 ms | █  204
   3 ms |   116
   4 ms |   106
   5 ms |   39
   6 ms |   16
   7 ms |   3
   8 ms |   5
  10 ms |   1
  12 ms |   4
  13 ms |   66
  14 ms |   80
  15 ms |   122
  16 ms | █  151
  17 ms |   67
  18 ms |   36
  19 ms |   24
  20 ms |   12
  21 ms |   11
  22 ms |   2
  23 ms |   4
  24 ms |   5
  25 ms |   2
  26 ms |   3
  28 ms |   2
  30 ms |   1
  33 ms |   1
  40 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `49.97`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `712.39`
- `part` = `1.00`
- `fps_0p1pct_low` = `35.91`
- `seed` = `7487.00`
- `preload_duration_ms` = `1788.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1709.11`, min `24.38`, p50 `1791.81`, p95 `2679.42`, p99 `2885.45`, 1%low `50.64`, 0.1%low `38.95`, std `683.87`

**Frame time (ms)**  avg `1.35`, p50 `0.56`, p95 `3.86`, p99 `17.42`, p99.9 `22.11`, max `41.01`

**Client tick (ms)**  avg `0.44`, p95 `0.64`, max `4.42`

**Memory**  start `2676 MB`, end `3048 MB`, peak `4878 MB`, GC `19 events / 215 ms`

**FPS over sampling window (ASCII):**

```
2262.4 |  █ █  █                                                                        
2175.7 |  ███  █      █                                                                 
2089.1 |  ███ █████ █ ██                                                                
2002.4 |  █████████ ████                                                                
1915.8 |  ██████████████                                                 █        █     
1829.2 |  ██████████████   ██                                 █   █     ██      ███  █ █
1742.5 |  ██████████████  ███  █                              █████ █ █ ███    ████  █ █
1655.9 |  ██████████████ █████ █           █ █            █ ███████████████    ███████ █
1569.3 |█████████████████████████  ██ █  █ ████ ██       ██ ████████████████  ██████████
1482.6 |█████████████████████████ ██████ █████████ ███   ████████████████████ ██████████
1396.0 |███████████████████████████████████████████████ █████████████████████ ██████████
1309.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12573
   1 ms | ████  1243
   2 ms |   147
   3 ms |   123
   4 ms |   82
   5 ms |   27
   6 ms |   8
   7 ms |   2
   8 ms |   4
   9 ms |   4
  10 ms |   1
  12 ms |   3
  13 ms |   58
  14 ms |   79
  15 ms |   151
  16 ms |   137
  17 ms |   68
  18 ms |   35
  19 ms |   24
  20 ms |   12
  21 ms |   18
  22 ms |   5
  23 ms |   5
  24 ms |   2
  25 ms |   3
  27 ms |   1
  28 ms |   1
  41 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-25.00`
- `entity_count_sample_start` = `27.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `50.64`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `741.02`
- `part` = `1.00`
- `fps_0p1pct_low` = `38.95`
- `seed` = `7499.00`
- `preload_duration_ms` = `45.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23802 ms  |  Sample ticks: 400

**FPS**  avg `1934.61`, min `26.40`, p50 `2062.22`, p95 `2793.01`, p99 `2942.94`, 1%low `53.11`, 0.1%low `39.88`, std `697.10`

**Frame time (ms)**  avg `1.17`, p50 `0.48`, p95 `2.90`, p99 `16.66`, p99.9 `21.50`, max `37.87`

**Client tick (ms)**  avg `0.32`, p95 `0.43`, max `2.50`

**Memory**  start `3364 MB`, end `3590 MB`, peak `4986 MB`, GC `19 events / 212 ms`

**FPS over sampling window (ASCII):**

```
2348.7 |  ███     █                                                                     
2267.2 |  ███ █   ██         █                                                          
2185.8 |  ███ █ ████       █ █ █                                                        
2104.3 | ████████████   ██ █ ███    █  ██ ██         █         █                        
2022.9 |███████████████ ██ █████    █  ██ ██    █   ██      █ ██    █                   
1941.4 |███████████████ ████████   █████████ █  █  ███    █ █ ██    █                   
1860.0 |████████████████████████  ████████████  ███████ ████████ ██ █ █   █    █      █ 
1778.5 |████████████████████████  ████████████  ███████ ███████████████ ████   █  █   █ 
1697.1 |████████████████████████ ██████████████ ███████ ███████████████ ████  ██ ████ ██
1615.6 |████████████████████████ ███████████████████████████████████████████  ██████████
1534.2 |████████████████████████ ███████████████████████████████████████████ ███████████
1452.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15345
   1 ms | ██  775
   2 ms |   130
   3 ms |   109
   4 ms |   80
   5 ms |   23
   6 ms |   7
   7 ms |   5
   8 ms |   2
  12 ms |   17
  13 ms |   81
  14 ms |   93
  15 ms |   170
  16 ms |   114
  17 ms |   61
  18 ms |   33
  19 ms |   16
  20 ms |   10
  21 ms |   7
  22 ms |   5
  23 ms |   2
  24 ms |   2
  25 ms |   3
  26 ms |   1
  27 ms |   1
  30 ms |   1
  37 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `53.11`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `58.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `854.70`
- `part` = `1.00`
- `fps_0p1pct_low` = `39.88`
- `seed` = `7507.00`
- `preload_duration_ms` = `768.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `1666.58`, min `23.96`, p50 `1725.38`, p95 `2621.38`, p99 `2814.83`, 1%low `50.15`, 0.1%low `36.51`, std `668.64`

**Frame time (ms)**  avg `1.38`, p50 `0.58`, p95 `4.05`, p99 `17.42`, p99.9 `23.54`, max `41.73`

**Client tick (ms)**  avg `0.35`, p95 `0.50`, max `2.53`

**Memory**  start `3302 MB`, end `4571 MB`, peak `5187 MB`, GC `19 events / 212 ms`

**FPS over sampling window (ASCII):**

```
2225.8 |  █ █ █                                                                         
2118.8 | ██ █ █                                                                         
2011.9 | ████ █     █     ███                                                           
1905.0 | ██████  █  ███████████      ██ █ █                                             
1798.1 | █████████ ███████████████   ██████  █  ██                                      
1691.1 |██████████████████████████  ████████ █ ████        █                            
1584.2 |██████████████████████████  ██████████████████    ████    ███  █ █   ███   ██   
1477.3 |██████████████████████████  ████████████████████ █████   █████ ███  ████ █ ██   
1370.3 |███████████████████████████ ████████████████████ ███████ █████████  ██████ ██ ██
1263.4 |██████████████████████████████████████████████████████████████████  ████████████
1156.5 |██████████████████████████████████████████████████████████████████ █████████████
1049.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12405
   1 ms | ███  1076
   2 ms | █  159
   3 ms | █  165
   4 ms |   74
   5 ms |   41
   6 ms |   13
   7 ms |   3
   8 ms |   3
   9 ms |   2
  11 ms |   1
  12 ms |   13
  13 ms |   81
  14 ms |   79
  15 ms |   139
  16 ms |   113
  17 ms |   64
  18 ms |   44
  19 ms |   20
  20 ms |   18
  21 ms |   8
  22 ms |   4
  23 ms |   5
  24 ms |   2
  25 ms |   4
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   1
  30 ms |   1
  41 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `50.15`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `726.69`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.51`
- `seed` = `7517.00`
- `preload_duration_ms` = `49.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `1879.06`, min `4.83`, p50 `1996.31`, p95 `2813.13`, p99 `3020.38`, 1%low `40.74`, 0.1%low `16.15`, std `711.36`

**Frame time (ms)**  avg `1.26`, p50 `0.50`, p95 `2.98`, p99 `17.73`, p99.9 `26.72`, max `207.06`

**Client tick (ms)**  avg `0.38`, p95 `0.62`, max `1.76`

**Memory**  start `3213 MB`, end `5088 MB`, peak `5454 MB`, GC `17 events / 202 ms`

**FPS over sampling window (ASCII):**

```
2404.4 |                █                                                 █             
2291.6 |    █   █       █          █                                      █             
2178.8 |    ██ ██     █ ██  █      █                                      █             
2066.0 |  █ ███████ ███ █████     ██        █ █    █           █          ██    █       
1953.2 |█ █████████ ███ █████   ████        ███ █  ██ █        ████     █ ██   ██       
1840.4 |█ ████████████████████ █████     █  ███ █ ███ ██      █████  █  █████  ███     █
1727.7 |████████████████████████████     ██ ███ ███████████  ███████ █  ██████████    ██
1614.9 |█████████████████████████████   ████████████████████ █████████████████████   ███
1502.1 |████████████████████████████████████████████████████ █████████████████████ █ ███
1389.3 |████████████████████████████████████████████████████ ███████████████████████████
1276.5 |████████████████████████████████████████████████████ ███████████████████████████
1163.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14015
   1 ms | ██  841
   2 ms | █  184
   3 ms |   126
   4 ms |   51
   5 ms |   23
   6 ms |   6
   7 ms |   8
   8 ms |   3
   9 ms |   1
  10 ms |   2
  11 ms |   1
  12 ms |   22
  13 ms |   57
  14 ms |   75
  15 ms |   126
  16 ms |   86
  17 ms |   70
  18 ms |   34
  19 ms |   23
  20 ms |   15
  21 ms |   11
  22 ms |   11
  23 ms |   9
  24 ms |   5
  25 ms |   7
  26 ms |   4
  27 ms |   3
  28 ms |   1
  34 ms |   1
  37 ms |   1
  47 ms |   3
  49 ms |   1
  58 ms |   1
  72 ms |   1
 119 ms |   1
 131 ms |   1
 207 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `entity_count_sample_end` = `17.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `11.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `40.74`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `791.53`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.15`
- `seed` = `7523.00`
- `preload_duration_ms` = `69.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `1918.91`, min `17.05`, p50 `2088.05`, p95 `2623.72`, p99 `3458.32`, 1%low `44.94`, 0.1%low `30.91`, std `672.02`

**Frame time (ms)**  avg `1.15`, p50 `0.48`, p95 `2.77`, p99 `19.51`, p99.9 `25.44`, max `58.67`

**Client tick (ms)**  avg `0.48`, p95 `0.74`, max `12.27`

**Memory**  start `3758 MB`, end `4917 MB`, peak `5475 MB`, GC `37 events / 540 ms`

**FPS over sampling window (ASCII):**

```
2946.3 |                      █                                                         
2807.9 |                      █                                                         
2669.5 |                   █  █                                                         
2531.2 |                   █  █                                                         
2392.8 |                   █  █                                                         
2254.4 |                   █ ██                                                         
2116.0 |       █   █ █ █ ███ ██     █        ██                       █                 
1977.7 |█    █ ███████ █████ ██  █████ █  ██████        ██ █ █        ████ █   ███ █ █  
1839.3 |██ █ ███████████████████████████ █████████    ███████████ ████████████████ █ ███
1700.9 |████ █████████████████████████████████████    ██████████████████████████████████
1562.6 |████ ███████████████████████████████████████  ██████████████████████████████████
1424.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15506
   1 ms | ██  772
   2 ms | █  324
   3 ms | █  205
   4 ms |   83
   5 ms |   29
   6 ms |   12
   7 ms |   6
   8 ms |   2
   9 ms |   1
  10 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   1
  14 ms |   6
  15 ms |   13
  16 ms |   43
  17 ms |   83
  18 ms |   97
  19 ms |   80
  20 ms |   56
  21 ms |   24
  22 ms |   21
  23 ms |   10
  24 ms |   8
  25 ms |   2
  26 ms |   5
  27 ms |   1
  28 ms |   1
  29 ms |   2
  31 ms |   1
  32 ms |   1
  37 ms |   2
  40 ms |   2
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preload_duration_ms` = `50.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `30.91`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `870.18`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `44.94`
- `seed` = `1923.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `134.37`, min `13.16`, p50 `156.54`, p95 `219.11`, p99 `321.23`, 1%low `17.24`, 0.1%low `13.30`, std `73.28`

**Frame time (ms)**  avg `12.36`, p50 `6.39`, p95 `32.42`, p99 `50.25`, p99.9 `69.16`, max `75.96`

**Client tick (ms)**  avg `7.74`, p95 `17.40`, max `40.37`

**Memory**  start `3288 MB`, end `3700 MB`, peak `5474 MB`, GC `35 events / 525 ms`

**FPS over sampling window (ASCII):**

```
296.4 |                                                           █                    
274.5 |                                                           █                    
252.7 |                                                           █                    
230.9 |                                                           █                    
209.0 |                                                           █                    
187.2 |     █                                                     ██                   
165.4 |     ██   █                     █           █    ██        ██   █ █             
143.5 |  ██ ████ █      █ █ ██      ██ ███ ██   ██ ███████    ███ ████████   ████ █████
121.7 |█ ██ ███████     █████████ ███████████  ██████████████ █████████████████████████
 99.9 |█ ██████████    ██████████████████████ ███████████████ █████████████████████████
 78.0 |████████████ ███████████████████████████████████████████████████████████████████
 56.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  15
   3 ms | █  17
   4 ms | ████████████████████  238
   5 ms | ████████████████████████████████████████  484
   6 ms | █████████  110
   7 ms | █████  65
   8 ms | ████  47
   9 ms | ████  48
  10 ms | █████  63
  11 ms | ██  20
  12 ms | █  14
  13 ms | █  13
  14 ms | █  14
  15 ms |   3
  16 ms | █  10
  17 ms | █  18
  18 ms | ███  38
  19 ms | ██  25
  20 ms | ████  43
  21 ms | ██  25
  22 ms | ██  28
  23 ms | ███  33
  24 ms | ██  20
  25 ms | ███  31
  26 ms | ██  29
  27 ms | ██  24
  28 ms | █  16
  29 ms | █  18
  30 ms | █  10
  31 ms | █  13
  32 ms | █  8
  33 ms | █  8
  34 ms |   1
  35 ms |   4
  36 ms | █  7
  37 ms |   3
  38 ms |   3
  39 ms |   4
  40 ms |   1
  41 ms |   3
  42 ms |   5
  43 ms | █  7
  44 ms |   4
  45 ms |   3
  46 ms |   1
  47 ms |   2
  48 ms |   1
  49 ms |   4
  50 ms |   4
  51 ms |   1
  52 ms |   2
  53 ms |   1
  54 ms |   1
  57 ms |   5
  58 ms |   1
  65 ms |   1
  74 ms |   1
  75 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `80.93`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `44.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `17.24`
- `fps_0p1pct_low` = `13.30`
- `preload_chunks` = `81.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1774.66`, min `19.90`, p50 `1955.75`, p95 `2417.03`, p99 `2757.91`, 1%low `43.04`, 0.1%low `25.94`, std `615.41`

**Frame time (ms)**  avg `1.27`, p50 `0.51`, p95 `3.16`, p99 `19.86`, p99.9 `27.46`, max `50.25`

**Client tick (ms)**  avg `0.50`, p95 `0.93`, max `3.69`

**Memory**  start `5256 MB`, end `5198 MB`, peak `5518 MB`, GC `38 events / 564 ms`

**FPS over sampling window (ASCII):**

```
2026.5 |                          █                                                     
1966.1 |  █     █                 █                               █ █   █          █    
1905.8 |  █    ██ █ ██ █          █          █         █ ██       ███   █       █  █    
1845.4 |███    ██ ████ ██         ██ █     █ ██ █      █████ █    ███ █ ██    █ ██ █    
1785.1 |███  █ ███████ ███ ██  █ ███ █    ███████  █  ████████    ███ █ ██    █ ██ █    
1724.8 |████ █ ███████ ███ ██  █████████ ███████████  ████████ ██ ███ ████    ████████  
1664.4 |████ ████████████████ ██████████ ███████████  ████████ ██ ███ ████    ██████████
1604.1 |█████████████████████ ██████████████████████ ████████████ ████████    ██████████
1543.7 |█████████████████████████████████████████████████████████ █████████ █ ██████████
1483.4 |█████████████████████████████████████████████████████████████████████ ██████████
1423.1 |█████████████████████████████████████████████████████████████████████ ██████████
1362.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13740
   1 ms | ██  829
   2 ms | █  329
   3 ms | █  229
   4 ms |   91
   5 ms |   27
   6 ms |   9
   7 ms |   8
   8 ms |   7
   9 ms |   1
  10 ms |   1
  11 ms |   1
  14 ms |   1
  15 ms |   17
  16 ms |   26
  17 ms |   83
  18 ms |   109
  19 ms |   86
  20 ms |   58
  21 ms |   30
  22 ms |   26
  23 ms |   5
  24 ms |   3
  25 ms |   4
  26 ms |   2
  27 ms |   1
  28 ms |   1
  30 ms |   1
  32 ms |   2
  33 ms |   1
  34 ms |   2
  37 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
  43 ms |   1
  44 ms |   1
  45 ms |   1
  47 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `43.04`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `787.43`
- `part` = `1.00`
- `fps_0p1pct_low` = `25.94`
- `seed` = `9043.00`
- `preload_duration_ms` = `55.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1763.78`, min `19.41`, p50 `1941.25`, p95 `2387.58`, p99 `3225.32`, 1%low `43.64`, 0.1%low `28.03`, std `628.54`

**Frame time (ms)**  avg `1.26`, p50 `0.52`, p95 `3.12`, p99 `20.04`, p99.9 `25.34`, max `51.53`

**Client tick (ms)**  avg `0.56`, p95 `1.09`, max `4.16`

**Memory**  start `3295 MB`, end `5072 MB`, peak `5549 MB`, GC `35 events / 492 ms`

**FPS over sampling window (ASCII):**

```
2778.5 |                                                           █                    
2642.0 |                                                           █                    
2505.6 |                                                           █                    
2369.1 |                                                           █                    
2232.7 |                                                           █          █         
2096.2 |                                                           █          █ █       
1959.8 |       █                   █ ██ █    █                █    █        ███ ██    █ 
1823.3 |█ ███████       ███       ███████ █  ██   █  ███  █  ███  ███     █████ ███   █ 
1686.9 |█████████   ██ ██████ █   ███████ █ ███  ████████ █ █████████ ███ █████████ ███ 
1550.4 |█████████ ██████████████  ██████████████████████████████████████████████████████
1413.9 |█████████ ██████████████████████████████████████████████████████████████████████
1277.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13823
   1 ms | ███  933
   2 ms | █  339
   3 ms | █  221
   4 ms |   93
   5 ms |   30
   6 ms |   16
   7 ms |   9
   8 ms |   5
   9 ms |   1
  11 ms |   2
  12 ms |   3
  13 ms |   1
  14 ms |   3
  15 ms |   9
  16 ms |   29
  17 ms |   56
  18 ms |   92
  19 ms |   95
  20 ms |   71
  21 ms |   36
  22 ms |   21
  23 ms |   11
  24 ms |   5
  25 ms |   3
  26 ms |   1
  27 ms |   3
  28 ms |   1
  29 ms |   1
  30 ms |   1
  32 ms |   1
  33 ms |   1
  38 ms |   1
  40 ms |   1
  42 ms |   1
  43 ms |   1
  46 ms |   2
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `795.71`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `28.03`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `67.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `43.64`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `1577.82`, min `21.49`, p50 `1720.57`, p95 `2079.10`, p99 `2428.15`, 1%low `44.72`, 0.1%low `29.51`, std `500.01`

**Frame time (ms)**  avg `1.28`, p50 `0.58`, p95 `2.84`, p99 `19.31`, p99.9 `26.42`, max `46.53`

**Client tick (ms)**  avg `0.52`, p95 `0.91`, max `2.79`

**Memory**  start `5481 MB`, end `4394 MB`, peak `5567 MB`, GC `41 events / 551 ms`

**FPS over sampling window (ASCII):**

```
1799.9 |                                  █                                             
1755.0 |          █         █    ██       █          █    █                             
1710.1 |███ █     ██   █    █ █  ██   █   █          ██   █                             
1665.2 |███ █   ████ █ █    ████████  █  ██  █       ██   █                   ██        
1620.3 |███ █   ████████ ██ ████████ ██  ██  █   █  ███ █ █     █  █ ██     █ ██ █      
1575.4 |███ ██  ████████ ██ ███████████ ████ ██  █  █████ ██   ██  █ ██     █ ██ █     █
1530.5 |██████ ████████████████████████ ███████  ██ ████████   ██  ████     █ ████     █
1485.7 |██████ ████████████████████████ ████████ ███████████   ██  ████    ██ ████ █ █ █
1440.8 |███████████████████████████████ ████████████████████ █ ██  ████    ██ ██████ ███
1395.9 |████████████████████████████████████████████████████ █ ██ ██████ █ █████████ ███
1351.0 |█████████████████████████████████████████████████████████ ██████████████████████
1306.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13660
   1 ms | ███  919
   2 ms | █  278
   3 ms | █  172
   4 ms |   60
   5 ms |   18
   6 ms |   14
   7 ms |   6
   8 ms |   2
  12 ms |   1
  14 ms |   3
  15 ms |   13
  16 ms |   49
  17 ms |   110
  18 ms |   105
  19 ms |   67
  20 ms |   43
  21 ms |   21
  22 ms |   15
  23 ms |   9
  24 ms |   4
  25 ms |   1
  26 ms |   6
  27 ms |   1
  28 ms |   1
  29 ms |   3
  31 ms |   2
  34 ms |   1
  41 ms |   2
  45 ms |   1
  46 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `779.42`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `29.51`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `100.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `44.72`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `1295.49`, min `13.08`, p50 `1408.57`, p95 `1853.15`, p99 `2558.30`, 1%low `41.09`, 0.1%low `25.75`, std `494.29`

**Frame time (ms)**  avg `1.64`, p50 `0.71`, p95 `4.27`, p99 `20.43`, p99.9 `29.05`, max `76.44`

**Client tick (ms)**  avg `0.58`, p95 `1.42`, max `7.93`

**Memory**  start `4927 MB`, end `5006 MB`, peak `5570 MB`, GC `36 events / 532 ms`

**FPS over sampling window (ASCII):**

```
2048.3 |                                                                         █      
1949.1 |                                                                        ███     
1849.8 |                                                                        ███     
1750.6 |                                                                        ███     
1651.3 |                                                                        ███     
1552.1 |    █                                                                   ███ █   
1452.8 |    █ ██                   █                            █        █  █ █ ███ █   
1353.6 |█ ███ ██       █          ██   ██   █ █ █    █        █ ████     ████████████   
1254.3 |████████    ████ ███    █ ███ ████ ████ █  ███ ██ ██████████    ████████████████
1155.1 |███████████ ████████ ██████████████████ ██ █████████████████  ██████████████████
1055.8 |███████████████████████████████████████ ████████████████████████████████████████
956.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9689
   1 ms | █████  1305
   2 ms | █  347
   3 ms | █  185
   4 ms |   111
   5 ms |   39
   6 ms |   16
   7 ms |   10
   8 ms |   8
   9 ms |   2
  10 ms |   3
  12 ms |   3
  13 ms |   6
  14 ms |   9
  15 ms |   9
  16 ms |   25
  17 ms |   60
  18 ms |   98
  19 ms |   99
  20 ms |   52
  21 ms |   28
  22 ms |   16
  23 ms |   12
  24 ms |   13
  25 ms |   1
  26 ms |   5
  27 ms |   4
  28 ms |   3
  29 ms |   2
  30 ms |   3
  32 ms |   1
  33 ms |   1
  34 ms |   1
  39 ms |   1
  40 ms |   2
  47 ms |   1
  76 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `41.09`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `608.59`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `25.75`
- `seed` = `8053.00`
- `preload_duration_ms` = `94.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 196498 ms  |  Sample ticks: 3600

**FPS**  avg `181.82`, min `0.52`, p50 `186.31`, p95 `354.79`, p99 `455.73`, 1%low `17.82`, 0.1%low `5.95`, std `105.08`

**Frame time (ms)**  avg `9.49`, p50 `5.37`, p95 `25.21`, p99 `36.65`, p99.9 `55.47`, max `1911.32`

**Client tick (ms)**  avg `1.18`, p95 `2.53`, max `26.55`

**Memory**  start `5206 MB`, end `5950 MB`, peak `6088 MB`, GC `183 events / 2426 ms`

**FPS over sampling window (ASCII):**

```
268.9 | █                                                                              
254.1 | █ ███                                                              █           
239.2 | █████                                                 █  █  █  ██  █  █        
224.3 | █████                                   █    █     █ ██ ██  █  ██  █████       
209.4 |███████      █                        ██ █   ███    █ ██ █████ ███ ██████       
194.5 |███████      █                █       ████   ███   █████ █████████ ██████ █  █  
179.7 |███████      ██               █ ██   █████   ███   ████████████████████████  ██ 
164.8 |███████      ███    █         █ ██ ███████   ████  █████████████████████████ ██ 
149.9 |███████    █ ███   ██ █ █ █   ████ ███████ █ █████ █████████████████████████████
135.0 |███████   ██████  ███ █████   ████████████ ███████ █████████████████████████████
120.1 |███████  ████████████ ██████████████████████████████████████████████████████████
105.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  87
   2 ms | ██████████████  1284
   3 ms | ███████████████████████████████████████  3472
   4 ms | ████████████████████████████████████████  3568
   5 ms | ████████████████████████████  2503
   6 ms | ████████████████  1402
   7 ms | █████████  806
   8 ms | ██████  552
   9 ms | ███  309
  10 ms | ██  182
  11 ms | █  124
  12 ms | █  92
  13 ms | █  63
  14 ms | █  52
  15 ms | █  52
  16 ms | ██  185
  17 ms | ████  339
  18 ms | ███████  588
  19 ms | ██████  499
  20 ms | ██████  505
  21 ms | ██████  540
  22 ms | █████  418
  23 ms | ███  284
  24 ms | ██  210
  25 ms | ██  191
  26 ms | ██  167
  27 ms | █  111
  28 ms | █  74
  29 ms | █  62
  30 ms | █  58
  31 ms |   29
  32 ms |   24
  33 ms |   23
  34 ms |   21
  35 ms |   27
  36 ms |   24
  37 ms |   25
  38 ms |   18
  39 ms |   14
  40 ms |   13
  41 ms |   14
  42 ms |   7
  43 ms |   6
  44 ms |   6
  45 ms |   3
  46 ms |   8
  47 ms |   9
  48 ms |   7
  49 ms |   6
  50 ms |   13
  51 ms |   4
  52 ms |   3
  53 ms |   5
  54 ms |   5
  55 ms |   4
  56 ms |   1
  57 ms |   2
  58 ms |   2
  59 ms |   1
  60 ms |   2
  62 ms |   2
  65 ms |   1
  66 ms |   1
  73 ms |   1
  88 ms |   1
  98 ms |   1
 100 ms |   1
 141 ms |   1
1911 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `1.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `5.95`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `105.38`
- `fps_1pct_low` = `17.82`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `89.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 197136 ms  |  Sample ticks: 3600

**FPS**  avg `197.58`, min `12.26`, p50 `205.30`, p95 `388.54`, p99 `527.62`, 1%low `25.87`, 0.1%low `20.96`, std `110.64`

**Frame time (ms)**  avg `8.48`, p50 `4.87`, p95 `22.04`, p99 `35.57`, p99.9 `40.91`, max `81.56`

**Client tick (ms)**  avg `0.81`, p95 `1.13`, max `4.90`

**Memory**  start `3859 MB`, end `4575 MB`, peak `6025 MB`, GC `47 events / 339 ms`

**FPS over sampling window (ASCII):**

```
258.8 |                                       ██           █     ████         █        
244.9 |                                      ███     ██   ███████████████  █ ██        
230.9 |█                                     ███   ████   ███████████████  █████       
217.0 |█                                  ██████   ████   ████████████████ █████       
203.1 |█          █                  ███████████   ████   █████████████████████████████
189.1 |█   █      ██                ████████████   ████   █████████████████████████████
175.2 |█   █      ██               █████████████   █████ ██████████████████████████████
161.2 |█   █     ███    ███  ██    ████████████████████████████████████████████████████
147.3 |█   █ █ █ ████ █████████████████████████████████████████████████████████████████
133.4 |█ █ ████████████████████████████████████████████████████████████████████████████
119.4 |█ █ ████████████████████████████████████████████████████████████████████████████
105.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  296
   2 ms | █████████████  1653
   3 ms | ██████████████████████████████  3937
   4 ms | ████████████████████████████████████████  5246
   5 ms | ██████████████████████  2936
   6 ms | ██████████  1352
   7 ms | ███  410
   8 ms | █  153
   9 ms |   48
  10 ms |   36
  11 ms |   22
  12 ms |   12
  13 ms |   8
  14 ms |   16
  15 ms | █  135
  16 ms | ██  315
  17 ms | ████  471
  18 ms | ██████  767
  19 ms | ███████  859
  20 ms | ██████  799
  21 ms | █████  671
  22 ms | ███  390
  23 ms | █  180
  24 ms | █  81
  25 ms |   48
  26 ms |   29
  27 ms |   18
  28 ms |   10
  29 ms |   11
  30 ms |   8
  31 ms |   7
  32 ms |   6
  33 ms |   17
  34 ms |   42
  35 ms |   43
  36 ms |   52
  37 ms |   55
  38 ms |   34
  39 ms |   21
  40 ms |   13
  41 ms |   6
  42 ms |   3
  43 ms |   3
  45 ms |   1
  48 ms |   3
  53 ms |   1
  55 ms |   2
  60 ms |   1
  81 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `74.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `20.96`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `117.93`
- `fps_1pct_low` = `25.87`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `14.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194229 ms  |  Sample ticks: 3600

**FPS**  avg `103.25`, min `2.59`, p50 `94.60`, p95 `252.90`, p99 `339.70`, 1%low `18.49`, 0.1%low `9.08`, std `74.08`

**Frame time (ms)**  avg `16.27`, p50 `10.57`, p95 `43.91`, p99 `47.16`, p99.9 `49.41`, max `386.27`

**Client tick (ms)**  avg `0.91`, p95 `1.13`, max `379.70`

**Memory**  start `3718 MB`, end `5643 MB`, peak `6026 MB`, GC `30 events / 412 ms`

**FPS over sampling window (ASCII):**

```
138.3 |                                                                ██              
133.4 |                                                          █     ██              
128.6 |                                                          ████████  █           
123.8 |                                                        ███████████ █ ██        
118.9 |                                                        ███████████ █ ██        
114.1 |                                                      █ ██████████████████     █
109.3 |█     ██                                             █████████████████████████ █
104.4 |█     ██                            █   █ █    ███   ███████████████████████████
 99.6 |█    ███      █     █              ███  █ ██   ███  ████████████████████████████
 94.8 |████████  ██ ███  ███           ███████ ████  ████  ████████████████████████████
 89.9 |████████████████████████  ██   █████████████  ██████████████████████████████████
 85.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   2 ms | █████  120
   3 ms | ███████████████████  474
   4 ms | ███████████████████████████  678
   5 ms | ███████████████████████████  660
   6 ms | █████████████████████  518
   7 ms | ██████████████████████████  648
   8 ms | ████████████████████████████████████  886
   9 ms | ████████████████████████████████████████  989
  10 ms | █████████████████████████████████████  914
  11 ms | ██████████████████████  547
  12 ms | ██████  160
  13 ms | █  25
  14 ms |   5
  15 ms |   3
  16 ms |   1
  17 ms |   1
  18 ms |   8
  19 ms | ███  66
  20 ms | █████████  226
  21 ms | ████████████████████  505
  22 ms | ███████████████████████████████  756
  23 ms | ███████████████████  474
  24 ms | ███████  180
  25 ms | ████  98
  26 ms | ██████  138
  27 ms | ████████  194
  28 ms | ██████████  252
  29 ms | ███████████  283
  30 ms | ████████  197
  31 ms | █████  126
  32 ms | ██  49
  33 ms | █  22
  34 ms |   5
  35 ms |   3
  36 ms |   7
  37 ms | █  14
  38 ms | █  15
  39 ms | █  19
  40 ms | █  17
  41 ms | █  36
  42 ms | ███  71
  43 ms | █████  134
  44 ms | ██████  142
  45 ms | ██████  141
  46 ms | █████  130
  47 ms | ███  81
  48 ms | █  27
  49 ms | █  14
  50 ms |   1
  51 ms |   2
 185 ms |   1
 239 ms |   1
 386 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `72.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `9.08`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `61.48`
- `fps_1pct_low` = `18.49`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `16.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195585 ms  |  Sample ticks: 3600

**FPS**  avg `92.34`, min `2.56`, p50 `68.13`, p95 `265.67`, p99 `338.42`, 1%low `16.26`, 0.1%low `8.97`, std `79.88`

**Frame time (ms)**  avg `20.22`, p50 `14.68`, p95 `50.41`, p99 `54.70`, p99.9 `57.88`, max `390.34`

**Client tick (ms)**  avg `0.77`, p95 `1.06`, max `7.64`

**Memory**  start `4820 MB`, end `3457 MB`, peak `6027 MB`, GC `30 events / 224 ms`

**FPS over sampling window (ASCII):**

```
126.2 |                                                              █ ██ █            
121.3 |█                                                       ██  █ █ ██ █            
116.3 |█                                                       ███ █ ███████           
111.4 |█                                                       ████████████████        
106.4 |█                                                       ████████████████        
101.5 |█     █                                              █  ████████████████  █     
 96.5 |█     █                                         █    ██ █████████████████ █████ 
 91.5 |█     ███     █                         ███    ███  ████████████████████████████
 86.6 |█ █ █████     █                   █ █ █ ███   ████  ████████████████████████████
 81.6 |█████████████████ ███    █      ███████ ████████████████████████████████████████
 76.7 |████████████████████████ ██    █████████████████████████████████████████████████
 71.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███████  101
   3 ms | ███████████████████████████████  467
   4 ms | ████████████████████████████████████████  612
   5 ms | █████████████████████████████  438
   6 ms | ████████████████████████  374
   7 ms | ███████████  173
   8 ms | ██████████  149
   9 ms | █████████████  202
  10 ms | ███████████████████████  350
  11 ms | ████████████████████████████████  493
  12 ms | ███████████████████████████████  471
  13 ms | ███████████████████████████  408
  14 ms | ███████████████████  285
  15 ms | ███████████  175
  16 ms | ████  65
  17 ms | ██  25
  18 ms |   6
  19 ms | █  15
  20 ms | ██  31
  21 ms | ███████  106
  22 ms | ███████████████  222
  23 ms | █████████████████████  316
  24 ms | █████████████████████████████  440
  25 ms | █████████████████████████  382
  26 ms | ████████████████████  300
  27 ms | ███████████  172
  28 ms | █████  84
  29 ms | ████  57
  30 ms | █████  77
  31 ms | ███████  110
  32 ms | ███████  111
  33 ms | ██████████  156
  34 ms | ██████████  150
  35 ms | ████████  115
  36 ms | ███████  113
  37 ms | █████  74
  38 ms | ███  52
  39 ms | ███  44
  40 ms | ██  34
  41 ms | █  17
  42 ms | ██  23
  43 ms | █  15
  44 ms | █  19
  45 ms | ███  39
  46 ms | █████  70
  47 ms | █████  73
  48 ms | ██████  91
  49 ms | ███████  106
  50 ms | ████████  116
  51 ms | █████  84
  52 ms | █████  84
  53 ms | █████  76
  54 ms | ████  57
  55 ms | ███  41
  56 ms | █  17
  57 ms | █  12
  58 ms |   3
  61 ms |   1
  70 ms |   1
  73 ms |   2
 159 ms |   1
 390 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `72.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `8.97`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `49.46`
- `fps_1pct_low` = `16.26`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`

