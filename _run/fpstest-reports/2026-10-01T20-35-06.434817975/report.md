# MC Benchmark Core session — 2026-10-01T20:55:52.137377889+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1703.7 | 52.9 | 36.1 | 16.52 | 0.91 | 59 | 868 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 1193.2 | 53.7 | 42.7 | 17.04 | 0.85 | 56 | 876 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 794.4 | 41.0 | 26.3 | 20.56 | 1.08 | 39 | 752 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 534.3 | 37.9 | 20.3 | 20.39 | 1.01 | 44 | 931 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 1041.2 | 48.3 | 34.1 | 18.49 | 0.77 | 64 | 437 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 987.3 | 48.3 | 40.3 | 18.79 | 0.57 | 55 | 576 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 910.1 | 49.2 | 37.6 | 18.16 | 0.77 | 55 | 682 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 435.5 | 46.1 | 36.3 | 19.55 | 1.28 | 47 | 470 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1187.2 | 47.3 | 34.1 | 18.78 | 3.48 | 42 | 1222 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 250.8 | 34.1 | 23.5 | 24.50 | 4.21 | 36 | 845 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 640.2 | 46.3 | 32.0 | 19.16 | 1.03 | 49 | 867 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 628.2 | 48.1 | 39.7 | 19.07 | 0.58 | 43 | 872 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 754.5 | 43.3 | 25.7 | 19.34 | 3.43 | 22 | 376 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 777.6 | 47.1 | 31.5 | 18.07 | 2.87 | 26 | 824 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1102.5 | 24.2 | 20.1 | 35.51 | 14.07 | 20 | 181 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 976.4 | 21.9 | 14.8 | 39.41 | 14.76 | 20 | 124 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1346.0 | 47.3 | 37.7 | 18.88 | 2.08 | 41 | 1208 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1348.4 | 46.5 | 32.6 | 18.95 | 2.16 | 42 | 1133 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 772.1 | 47.0 | 39.0 | 19.41 | 0.73 | 46 | 897 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1889.4 | 51.9 | 41.7 | 17.60 | 0.31 | 39 | 988 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1854.4 | 50.6 | 42.4 | 17.90 | 0.28 | 40 | 1320 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1616.5 | 50.3 | 42.0 | 18.08 | 0.34 | 36 | 624 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1683.6 | 49.8 | 40.3 | 18.17 | 0.36 | 36 | 902 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 1721.8 | 48.2 | 33.9 | 17.99 | 0.45 | 33 | 1018 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1596.4 | 46.2 | 36.9 | 19.09 | 0.43 | 31 | 1072 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 1722.1 | 48.5 | 34.6 | 17.84 | 0.40 | 29 | 690 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 1866.2 | 45.5 | 24.8 | 17.97 | 0.56 | 21 | 809 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 1996.7 | 51.3 | 34.0 | 16.90 | 0.41 | 25 | 1526 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 1492.3 | 38.1 | 19.1 | 20.76 | 0.73 | 18 | 1595 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 1599.4 | 37.3 | 20.3 | 20.93 | 0.68 | 15 | 1393 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 1442.3 | 38.6 | 22.7 | 21.07 | 0.62 | 19 | 1422 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 1467.1 | 49.7 | 40.1 | 18.28 | 0.46 | 24 | 1064 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 1579.7 | 42.1 | 26.3 | 19.29 | 0.47 | 20 | 1644 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 1428.0 | 42.0 | 26.6 | 19.80 | 0.66 | 18 | 1565 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 2024.2 | 49.9 | 33.4 | 17.38 | 0.39 | 22 | 1020 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1821.9 | 44.0 | 30.4 | 19.57 | 0.47 | 14 | 752 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 176.2 | 24.1 | 17.1 | 35.10 | 4.33 | 16 | 1421 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 2315.4 | 47.2 | 28.0 | 16.77 | 0.46 | 7 | 1824 |
| 39 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 2315.4 | 47.2 | 28.0 | 16.77 | 0.46 | 7 | 1824 |

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
- [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `1703.74`, min `20.00`, p50 `1732.59`, p95 `2682.63`, p99 `2967.02`, 1%low `52.87`, 0.1%low `36.11`, std `652.51`

**Frame time (ms)**  avg `1.22`, p50 `0.58`, p95 `2.62`, p99 `16.52`, p99.9 `21.57`, max `50.00`

**Client tick (ms)**  avg `0.91`, p95 `1.80`, max `10.38`

**Memory**  start `720 MB`, end `1398 MB`, peak `1588 MB`, GC `59 events / 308 ms`

**FPS over sampling window (ASCII):**

```
2381.5 |                                                              █   █             
2246.6 |                                                          █  ██   █             
2111.6 |                                             █ █     ███  ██ ███  ███ ██        
1976.7 |                               █     █    █  ██████  ███████ ███  ███████       
1841.8 |                               █ ██  ███ ███ ███████ ██████████████████████     
1706.8 |                            █ ██████ ███ ███████████████████████████████████    
1571.9 |          █  █           █ ██████████████████████████████████████████████████ █ 
1436.9 |        ██████████  █ ███████████████████████████████████████████████████████ ██
1302.0 |        █████████████ ██████████████████████████████████████████████████████████
1167.0 |  █ ██ █████████████████████████████████████████████████████████████████████████
1032.1 |█ ██████████████████████████████████████████████████████████████████████████████
897.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14288
   1 ms | ███  996
   2 ms | █  340
   3 ms |   88
   4 ms |   14
   5 ms |   9
   6 ms |   3
   7 ms |   9
   8 ms |   7
  10 ms |   3
  11 ms |   3
  12 ms |   19
  13 ms |   99
  14 ms |   129
  15 ms |   113
  16 ms |   83
  17 ms |   61
  18 ms |   24
  19 ms |   17
  20 ms |   7
  21 ms |   7
  22 ms |   3
  24 ms |   4
  25 ms |   2
  26 ms |   1
  41 ms |   1
  45 ms |   1
  50 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 2041 | 1151.1 | 17.81 |
| `dragon_breath` | 160 | 2041 | 1437.2 | 16.18 |
| `dripping_water` | 240 | 2041 | 1478.9 | 17.73 |
| `flame` | 160 | 2041 | 1794.8 | 15.79 |
| `smoke` | 160 | 2041 | 1915.6 | 15.84 |
| `sculk_charge_pop` | 240 | 2041 | 2031.6 | 15.61 |
| `ALL_TOGETHER` | 1680 | 2041 | 2075.6 | 16.31 |
| `portal` | 160 | 2041 | 1745.7 | 16.40 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `36.11`
- `fps_harmonic_avg` = `817.01`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `109.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `52.87`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1193.18`, min `29.16`, p50 `1230.45`, p95 `1774.35`, p99 `1868.78`, 1%low `53.71`, 0.1%low `42.71`, std `424.22`

**Frame time (ms)**  avg `1.62`, p50 `0.81`, p95 `4.79`, p99 `17.04`, p99.9 `20.19`, max `34.29`

**Client tick (ms)**  avg `0.85`, p95 `1.33`, max `6.53`

**Memory**  start `682 MB`, end `901 MB`, peak `1559 MB`, GC `56 events / 331 ms`

**FPS over sampling window (ASCII):**

```
1435.4 |                                                            █                █  
1384.4 |                                                           ██                █  
1333.4 |                               █       █            █      ██  █   █  █   █  ███
1282.4 |       █   ███                 █       ███ ██ █     █    ████  ██ ██ ██ █ █  ███
1231.4 |       █   ███ █            █  ██   ██ ███ ██████  ████  ███████████ ████ ██ ███
1180.4 |       ███ █████      █    ██ ███  ███████ ██████  ████ ████████████ ████ ██████
1129.4 |    █  █████████  █ █ █ ██ ██████  ███████ ██████ █████ █████████████████ ██████
1078.4 |    █ ██████████ ████ █ ██ ██████  ██████████████ █████ ████████████████████████
1027.4 |█████ ██████████ ████ █ ███████████████████████████████ ████████████████████████
976.4 |█████████████████████ █ ███████████████████████████████ ████████████████████████
925.4 |█████████████████████ ██████████████████████████████████████████████████████████
874.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9511
   1 ms | ████████  1788
   2 ms | █  330
   3 ms |   102
   4 ms |   13
   5 ms |   6
   6 ms |   5
   7 ms |   3
   8 ms |   6
   9 ms |   6
  10 ms |   2
  11 ms |   5
  12 ms |   17
  13 ms |   111
  14 ms | █  131
  15 ms | █  124
  16 ms |   75
  17 ms |   63
  18 ms |   35
  19 ms |   14
  20 ms |   4
  21 ms |   3
  22 ms |   3
  23 ms |   1
  24 ms |   2
  34 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `42.00`
- `fps_harmonic_avg` = `618.04`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `42.71`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `53.71`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `794.37`, min `21.83`, p50 `803.51`, p95 `1374.71`, p99 `1482.83`, 1%low `40.97`, 0.1%low `26.33`, std `354.44`

**Frame time (ms)**  avg `2.51`, p50 `1.24`, p95 `15.07`, p99 `20.56`, p99.9 `31.59`, max `45.80`

**Client tick (ms)**  avg `1.08`, p95 `2.43`, max `5.73`

**Memory**  start `754 MB`, end `1180 MB`, peak `1506 MB`, GC `39 events / 300 ms`

**FPS over sampling window (ASCII):**

```
1201.9 |        █  █                                                                    
1125.0 |█    █  █  ██                 █                                                 
1048.1 |█   ██  █████ █    ███  █ █  ██                                                 
971.2 |█ ██████████████  ████ ██ ██ ███                                                
894.3 |████████████████ ███████████████                                                
817.4 |████████████████████████████████             ██     █                           
740.5 |█████████████████████████████████ ██  ███ █ ███   █ █  ██       █         █    █
663.6 |█████████████████████████████████ ███ █████████████ ██████   █  █        ██ █  █
586.7 |█████████████████████████████████████ █████████████████████████ █ ██   ████ ████
509.7 |█████████████████████████████████████████████████████████████████████  █████████
432.8 |██████████████████████████████████████████████████████████████████████ █████████
355.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████  2038
   1 ms | ████████████████████████████████████████  4424
   2 ms | █████  521
   3 ms | ██  235
   4 ms | █  96
   5 ms | █  70
   6 ms |   28
   7 ms |   13
   8 ms |   9
   9 ms |   10
  10 ms |   3
  11 ms |   3
  12 ms |   8
  13 ms |   43
  14 ms | █  59
  15 ms | █  58
  16 ms | █  61
  17 ms | █  73
  18 ms | █  69
  19 ms |   40
  20 ms |   32
  21 ms |   23
  22 ms |   14
  23 ms |   8
  24 ms |   2
  26 ms |   4
  27 ms |   4
  28 ms |   2
  30 ms |   1
  31 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   1
  37 ms |   1
  39 ms |   1
  44 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `42.00`
- `fps_harmonic_avg` = `397.76`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `26.33`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `40.97`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `534.30`, min `14.22`, p50 `543.95`, p95 `932.88`, p99 `1047.96`, 1%low `37.94`, 0.1%low `20.33`, std `242.47`

**Frame time (ms)**  avg `3.45`, p50 `1.84`, p95 `16.33`, p99 `20.39`, p99.9 `41.86`, max `70.31`

**Client tick (ms)**  avg `1.01`, p95 `1.38`, max `26.08`

**Memory**  start `610 MB`, end `788 MB`, peak `1542 MB`, GC `44 events / 331 ms`

**FPS over sampling window (ASCII):**

```
773.8 |                                                               █ █              
728.4 |      █                                           █            █ ██             
682.9 |  █   ██                                          █        █   █ ███ █  ███  █  
637.4 |  █   ███                                         █        █ █ ████████ ███  █ █
592.0 |  █ █████                   █ █             █  █████ █   █████ █████████████ █ █
546.5 |  █ █████                   █ █          █████ ███████  ████████████████████ █ █
501.1 |  █ █████                   █ █      █ ███████ █████████████████████████████ ███
455.6 |███ █████   ██          █  ████  ██ ██████████ █████████████████████████████████
410.2 |██████████ ███   ███ ██ █ ██████████████████████████████████████████████████████
364.7 |██████████ █████ ███ ███████████████████████████████████████████████████████████
319.2 |██████████ █████ ███████████████████████████████████████████████████████████████
273.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  126
   1 ms | ████████████████████████████████████████  3350
   2 ms | ███████████████  1241
   3 ms | ███  293
   4 ms | █  121
   5 ms | █  53
   6 ms |   28
   7 ms |   10
   8 ms |   7
   9 ms |   9
  10 ms |   5
  11 ms |   4
  12 ms |   3
  13 ms |   37
  14 ms | █  87
  15 ms | █  91
  16 ms | █  95
  17 ms | █  68
  18 ms | █  56
  19 ms |   37
  20 ms |   26
  21 ms |   12
  22 ms |   8
  23 ms |   6
  24 ms |   5
  25 ms |   2
  26 ms |   2
  27 ms |   1
  28 ms |   1
  39 ms |   1
  41 ms |   2
  43 ms |   2
  44 ms |   1
  45 ms |   1
  47 ms |   1
  70 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `36.00`
- `fps_harmonic_avg` = `289.56`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `20.33`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `37.94`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1041.15`, min `22.39`, p50 `1077.24`, p95 `1529.98`, p99 `1628.94`, 1%low `48.35`, 0.1%low `34.09`, std `371.08`

**Frame time (ms)**  avg `1.90`, p50 `0.93`, p95 `14.09`, p99 `18.49`, p99.9 `22.89`, max `44.66`

**Client tick (ms)**  avg `0.77`, p95 `1.25`, max `4.55`

**Memory**  start `1182 MB`, end `1404 MB`, peak `1620 MB`, GC `64 events / 329 ms`

**FPS over sampling window (ASCII):**

```
1301.2 |    █                                                                           
1259.1 |    █                                                                           
1217.0 |  █ █                                                                           
1174.9 |█ █ █   █                      █   █           █                                
1132.8 |█ █ █   █                     ██ █ ███         █    █                           
1090.7 |█ █ █ ███  █ █   █      █    ███ █ █████  ██   █  █ ██ █          █             
1048.6 |█ ███████ ████  ████ █████  ████████████  ███  █ ██ ██ █  █    █ ██  ███ ██     
1006.5 |█ ████████████████████████ █████████████ ████ ██ ██ █████ ██   █ ██  ███ ██     
964.4 |█ ███████████████████████████████████████████ ██ ██ ████████ █ ████  ███ ███  █ 
922.3 |████████████████████████████████████████████████████████████ ██████ █████████ ██
880.2 |███████████████████████████████████████████████████████████████████ ████████████
838.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6547
   1 ms | ██████████████████  2951
   2 ms | █  236
   3 ms |   62
   4 ms |   62
   5 ms |   41
   6 ms |   13
   7 ms |   4
   8 ms |   7
   9 ms |   4
  10 ms |   5
  12 ms |   2
  13 ms |   37
  14 ms |   75
  15 ms | █  128
  16 ms | █  102
  17 ms | █  93
  18 ms |   59
  19 ms |   36
  20 ms |   15
  21 ms |   9
  22 ms |   3
  23 ms |   3
  24 ms |   2
  25 ms |   1
  28 ms |   1
  30 ms |   1
  32 ms |   1
  41 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `70.00`
- `fps_harmonic_avg` = `525.15`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `34.09`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `48.35`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `987.32`, min `35.75`, p50 `1025.69`, p95 `1468.11`, p99 `1557.34`, 1%low `48.33`, 0.1%low `40.31`, std `346.27`

**Frame time (ms)**  avg `1.98`, p50 `0.97`, p95 `14.50`, p99 `18.79`, p99.9 `23.43`, max `27.97`

**Client tick (ms)**  avg `0.57`, p95 `0.89`, max `1.34`

**Memory**  start `1109 MB`, end `1535 MB`, peak `1686 MB`, GC `55 events / 305 ms`

**FPS over sampling window (ASCII):**

```
1179.0 |                                         █                                      
1144.5 |                                        ██    █ █                               
1110.1 |        █                               ██  ███ █                               
1075.7 |     ██ █                              ███ ████ ██ ██                    █      
1041.2 |     ██ ██            ██      █  █     ███ ███████████ █ █      █  █     █  █  █
1006.8 |  ██ ██ ███           ██      ██ █   █ ███ ███████████ █ █ ██  █████ █ █ █  ██ █
972.4 |  ██ ██ ███       ██  ██      ██ █ █ █ ███ █████████████ ████  █████ ███ █  ██ █
937.9 |  ███████████ █   ██████ ██ ████ █ █ █ ███ █████████████ █████ █████ █████  ██ █
903.5 |███████████████   █████████ ██████ █ █████ ███████████████████ ███████████████ █
869.0 |██████████████████████████████████ ███████████████████████████████████████████ █
834.6 |██████████████████████████████████████████████████████████████████████████████ █
800.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5550
   1 ms | ██████████████████████████  3580
   2 ms | █  187
   3 ms |   44
   4 ms |   65
   5 ms |   56
   6 ms |   20
   7 ms |   4
   8 ms |   4
   9 ms |   6
  10 ms |   3
  12 ms |   1
  13 ms |   26
  14 ms |   53
  15 ms | █  78
  16 ms | █  137
  17 ms | █  111
  18 ms |   65
  19 ms |   28
  20 ms |   27
  21 ms |   14
  22 ms |   7
  23 ms |   5
  24 ms |   5
  27 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `56.00`
- `fps_harmonic_avg` = `503.80`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `40.31`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `48.33`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `910.06`, min `24.47`, p50 `944.29`, p95 `1337.10`, p99 `1403.28`, 1%low `49.24`, 0.1%low `37.64`, std `328.40`

**Frame time (ms)**  avg `2.12`, p50 `1.06`, p95 `14.84`, p99 `18.16`, p99.9 `22.63`, max `40.87`

**Client tick (ms)**  avg `0.77`, p95 `1.19`, max `1.63`

**Memory**  start `1094 MB`, end `1596 MB`, peak `1777 MB`, GC `55 events / 314 ms`

**FPS over sampling window (ASCII):**

```
1073.9 |    █              ██   █                                                       
1041.4 |    █          █   ██   █             ██                                        
1008.8 |    █          █ █ ██  ██             ██  █     █       █                       
976.2 |   ██          ███ ██ ███      █ █    █████     █    █  █ █                █    
943.7 |██ ███ █       ██████ ███     ██ ███  █████     █    █  █ ██    ██         █    
911.1 |██ █████      ███████ ███     ██████ ██████ █   █ █  █  █ ██  █ ███     ██ █ █ █
878.5 |██ ██████  ██ ███████ ████   ███████ ██████ ███ █ ██ █  █████ ████████  ██ █████
846.0 |██ ██████  ██ ███████ ████ █ ███████ ██████ ███ █ ██ ██ █████ █████████ ██ █████
813.4 |██████████ █████████████████ ████████████████████ █████ █████ █████████ ████████
780.8 |████████████████████████████ ████████████████████████████████ ██████████████████
748.3 |█████████████████████████████████████████████████████████████ ██████████████████
715.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████████████████  3840
   1 ms | ████████████████████████████████████████  4557
   2 ms | ██  254
   3 ms | █  71
   4 ms | █  84
   5 ms |   39
   6 ms |   9
   7 ms |   3
   8 ms |   1
   9 ms |   4
  10 ms |   3
  11 ms |   4
  12 ms |   1
  13 ms |   39
  14 ms | █  73
  15 ms | █  121
  16 ms | █  130
  17 ms | █  97
  18 ms |   54
  19 ms |   22
  20 ms |   13
  21 ms |   10
  22 ms |   4
  23 ms |   3
  24 ms |   2
  25 ms |   2
  28 ms |   1
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `11.00`
- `fps_harmonic_avg` = `471.82`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `37.64`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `49.24`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `435.54`, min `32.77`, p50 `458.24`, p95 `682.48`, p99 `724.68`, 1%low `46.10`, 0.1%low `36.32`, std `182.95`

**Frame time (ms)**  avg `3.94`, p50 `2.18`, p95 `16.59`, p99 `19.55`, p99.9 `25.16`, max `30.52`

**Client tick (ms)**  avg `1.28`, p95 `1.63`, max `12.05`

**Memory**  start `1419 MB`, end `1679 MB`, peak `1890 MB`, GC `47 events / 287 ms`

**FPS over sampling window (ASCII):**

```
559.4 |                                █                                               
536.2 |                 █             ██                                               
513.1 |              █  ██           ████              █                               
489.9 |       ██    ██ ███ █ █       ████    █         ██                              
466.8 |       ██   ███████ ███     ███████  ██    █  █ ██    ██           █            
443.6 |     ████   ███████ ███  █ ████████  ███   █  █████ █ ██          ██ ██         
420.5 |█ █ █████   ███████ ████ █ ████████  ███   █ ██████ ████ █ █   █  ██████   ███  
397.3 |███████████████████ ███████████████  █████ █ █████████████ █   █████████ █████ █
374.2 |███████████████████████████████████ ██████ █ ███████████████ █████████████████ █
351.0 |████████████████████████████████████████████ ███████████████████████████████████
327.9 |████████████████████████████████████████████ ███████████████████████████████████
304.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████████████████████████████████████████  2000
   2 ms | ███████████████████████████████████████  1962
   3 ms | ██████  288
   4 ms | ███  134
   5 ms | █  54
   6 ms | █  41
   7 ms |   11
   8 ms |   4
   9 ms |   3
  10 ms |   3
  11 ms |   2
  12 ms |   3
  13 ms | █  35
  14 ms | ██  98
  15 ms | ██  119
  16 ms | ██  109
  17 ms | ██  88
  18 ms | █  58
  19 ms | █  33
  20 ms |   18
  21 ms |   5
  22 ms |   5
  24 ms |   4
  25 ms |   3
  27 ms |   1
  28 ms |   1
  30 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `35.00`
- `fps_harmonic_avg` = `253.97`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `36.32`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `46.10`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1187.25`, min `20.45`, p50 `1232.50`, p95 `1777.58`, p99 `1876.95`, 1%low `47.26`, 0.1%low `34.13`, std `436.60`

**Frame time (ms)**  avg `1.83`, p50 `0.81`, p95 `13.58`, p99 `18.78`, p99.9 `22.82`, max `48.91`

**Client tick (ms)**  avg `3.48`, p95 `4.55`, max `12.25`

**Memory**  start `700 MB`, end `1756 MB`, peak `1922 MB`, GC `42 events / 273 ms`

**FPS over sampling window (ASCII):**

```
1423.5 |                                                  ██    █         █             
1372.2 |                                  █              ███    █         █             
1321.0 |      █ █                        ██       █     ████    █         █             
1269.8 |     ██ █                     █  ██     █ █     ████   ████   █ █ █    ██    █ █
1218.5 |█ █  ██ █ █         █   ██    █  ██   █ ███ █  █████ █ █████  ██████ █ ██    ███
1167.3 |█ █████ ███     █  ███  ██   ███████  ███████  █████ ███████ ███████ ███████ ███
1116.0 |███████ █████   █  ███  ██   ████████ ███████  █████████████████████ ███████████
1064.8 |███████ █████   █ ███████████████████ ██████████████████████████████ ███████████
1013.6 |███████ █████ ███ ███████████████████ ██████████████████████████████ ███████████
962.3 |███████ █████████████████████████████ ██████████████████████████████ ███████████
911.1 |█████████████████████████████████████ ██████████████████████████████ ███████████
859.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8546
   1 ms | ██████  1345
   2 ms |   17
   3 ms |   73
   4 ms | █  198
   5 ms | █  116
   6 ms |   18
   7 ms |   16
   8 ms |   8
   9 ms |   5
  10 ms |   4
  11 ms |   2
  12 ms |   4
  13 ms |   35
  14 ms |   69
  15 ms |   89
  16 ms | █  116
  17 ms |   91
  18 ms |   63
  19 ms |   42
  20 ms |   21
  21 ms |   21
  22 ms |   5
  23 ms |   2
  24 ms |   1
  25 ms |   1
  26 ms |   3
  27 ms |   1
  30 ms |   1
  37 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `43.00`
- `fps_harmonic_avg` = `545.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `34.13`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `47.26`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `250.81`, min `19.38`, p50 `270.47`, p95 `426.83`, p99 `496.46`, 1%low `34.11`, 0.1%low `23.53`, std `119.29`

**Frame time (ms)**  avg `6.34`, p50 `3.70`, p95 `18.83`, p99 `24.50`, p99.9 `37.39`, max `51.60`

**Client tick (ms)**  avg `4.21`, p95 `6.76`, max `11.02`

**Memory**  start `1101 MB`, end `835 MB`, peak `1947 MB`, GC `36 events / 169 ms`

**FPS over sampling window (ASCII):**

```
400.9 |  █                                                                             
380.5 |  █                                                                             
360.2 |  ██                                                                            
339.9 |█████    ██      █                                                              
319.6 |█████   ████████ ███  █                                                         
299.2 |█████   ████████ ███  █ █                                                       
278.9 |██████  █████████████ █ █  ██ █   ██                                            
258.6 |█████████████████████ ███████ █ █████            █                         █    
238.2 |█████████████████████████████ █ ██████ █ █ █     █     █   █ █             █   █
217.9 |████████████████████████████████████████████   █ █ ██  █ █ █████   █    ████   █
197.6 |██████████████████████████████████████████████████████ ███ █████████ █ █████████
177.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  25
   2 ms | ███████████████████████████████  779
   3 ms | ████████████████████████████████████████  1006
   4 ms | ██████████████████  455
   5 ms | █████  114
   6 ms | ██  53
   7 ms | ██  40
   8 ms | ██  38
   9 ms | █  33
  10 ms | █  18
  11 ms |   9
  12 ms | █  19
  13 ms | ██  58
  14 ms | ███  86
  15 ms | ████  91
  16 ms | ███  69
  17 ms | ███  67
  18 ms | ██  42
  19 ms | ██  43
  20 ms | █  21
  21 ms | █  14
  22 ms | █  24
  23 ms | █  16
  24 ms |   8
  25 ms |   9
  26 ms |   3
  27 ms |   3
  28 ms |   1
  29 ms |   2
  30 ms |   1
  32 ms |   1
  33 ms |   1
  36 ms |   1
  37 ms |   3
  38 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `34.11`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `157.82`
- `preload_duration_ms` = `49.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `23.53`
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

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `640.24`, min `22.23`, p50 `678.46`, p95 `1002.76`, p99 `1064.34`, 1%low `46.27`, 0.1%low `32.04`, std `261.65`

**Frame time (ms)**  avg `2.92`, p50 `1.47`, p95 `15.95`, p99 `19.16`, p99.9 `23.82`, max `44.98`

**Client tick (ms)**  avg `1.03`, p95 `1.36`, max `1.90`

**Memory**  start `1040 MB`, end `1285 MB`, peak `1907 MB`, GC `49 events / 298 ms`

**FPS over sampling window (ASCII):**

```
761.5 |                           █ ██         █               █   █                   
728.9 |                         ██████   ███   ██       █     ██   █ █     █           
696.4 |                       █ ██████   ███ █████    ████ ██ ██  ██ █     █ █         
663.8 |    █ █              █ █ ███████ ██████████  █ ████ █████  ██ █    ████ █ ███   
631.2 |█   █ ███ █         ████ ███████ ██████████████████ █████  ████  ██████ █ ████ █
598.7 |█  ██████ █   █     ████ ███████ ██████████████████ █████  █████ ██████ ██████ █
566.1 |█████████ █   █   ██████████████ ██████████████████ ██████ █████ ██████ ██████ █
533.6 |█████████ █ █ ██  ██████████████ █████████████████████████ ███████████████████ █
501.0 |████████████████ █████████████████████████████████████████████████████████████ █
468.4 |████████████████ ███████████████████████████████████████████████████████████████
435.9 |████████████████ ███████████████████████████████████████████████████████████████
403.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  357
   1 ms | ████████████████████████████████████████  4903
   2 ms | █████  649
   3 ms | █  181
   4 ms | █  73
   5 ms |   61
   6 ms |   26
   7 ms |   6
   8 ms |   2
   9 ms |   4
  10 ms |   5
  11 ms |   5
  12 ms |   1
  13 ms |   18
  14 ms | █  80
  15 ms | █  131
  16 ms | █  122
  17 ms | █  95
  18 ms |   47
  19 ms |   33
  20 ms |   17
  21 ms |   11
  22 ms |   4
  23 ms |   2
  24 ms |   2
  28 ms |   2
  32 ms |   1
  35 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `342.03`
- `fps_1pct_low` = `46.27`
- `preload_duration_ms` = `18.00`
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
- `fps_0p1pct_low` = `32.04`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `628.17`, min `36.31`, p50 `662.89`, p95 `929.71`, p99 `1000.74`, 1%low `48.08`, 0.1%low `39.70`, std `239.08`

**Frame time (ms)**  avg `2.88`, p50 `1.51`, p95 `15.85`, p99 `19.07`, p99.9 `22.88`, max `27.54`

**Client tick (ms)**  avg `0.58`, p95 `0.78`, max `8.63`

**Memory**  start `1107 MB`, end `1935 MB`, peak `1980 MB`, GC `43 events / 274 ms`

**FPS over sampling window (ASCII):**

```
790.2 |█    ██                                                                         
759.4 |██  ████ █                              █                 █                     
728.6 |██ █████ █                              █               ███                █ █  
697.8 |██████████                             ███         █    ███           █    █ ███
666.9 |██████████                           █ █████    █  █   ████    █    █ █    █████
636.1 |███████████         ██          █  █ ███████  █ █  █   ████    █    █ █ █ ██████
605.3 |███████████         ███ █  █    █  █ ████████ ███  █  ██████  ██ █ ██████ ██████
574.5 |███████████  █    █ █████ ███   ████ ████████████████ ██████  ██ █ ██████ ██████
543.7 |███████████ ██ ████ ██████████  ████████████████████████████ ███ █ ██████ ██████
512.9 |███████████ ██████████████████████████████████████████████████████ █████████████
482.0 |███████████ ██████████████████████████████████████████████████████ █████████████
451.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  72
   1 ms | ████████████████████████████████████████  5426
   2 ms | █████  640
   3 ms | █  80
   4 ms |   60
   5 ms |   62
   6 ms |   18
   7 ms |   4
   8 ms |   5
   9 ms |   2
  10 ms |   2
  11 ms |   5
  12 ms |   7
  13 ms |   43
  14 ms | █  86
  15 ms | █  113
  16 ms | █  101
  17 ms | █  87
  18 ms |   60
  19 ms |   35
  20 ms |   21
  21 ms |   8
  22 ms |   5
  23 ms |   2
  24 ms |   1
  25 ms |   2
  26 ms |   1
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `48.08`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `347.45`
- `preload_duration_ms` = `53.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `39.70`
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

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `754.49`, min `21.67`, p50 `845.92`, p95 `1213.24`, p99 `1408.49`, 1%low `43.29`, 0.1%low `25.68`, std `350.55`

**Frame time (ms)**  avg `2.76`, p50 `1.18`, p95 `15.05`, p99 `19.34`, p99.9 `30.99`, max `46.14`

**Client tick (ms)**  avg `3.43`, p95 `6.37`, max `28.51`

**Memory**  start `1617 MB`, end `1687 MB`, peak `1993 MB`, GC `22 events / 150 ms`

**FPS over sampling window (ASCII):**

```
1244.1 |                                                                              ██
1159.5 |                                                                             ███
1074.9 |                                                        █              █ ███████
990.3 |                       █                               ████           ██ ███████
905.7 |                  ████████                         █  █████    ████ ████████████
821.1 |                  ██████████ ███            █  ████████████    █████████████████
736.5 |                 ████████████████        █ █████████████████   █████████████████
651.9 |                █████████████████ █     ██ █████████████████ ███████████████████
567.3 |                ████████████████████  ██████████████████████████████████████████
482.7 |          ████ █████████████████████████████████████████████████████████████████
398.1 |    ██ █████████████████████████████████████████████████████████████████████████
313.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████  2035
   1 ms | ████████████████████████████████████████  3407
   2 ms | █████████  765
   3 ms | ███  214
   4 ms | █  93
   5 ms | █  65
   6 ms |   30
   7 ms |   19
   8 ms |   11
   9 ms |   13
  10 ms |   6
  12 ms | █  45
  13 ms | █  71
  14 ms | █  107
  15 ms | █  117
  16 ms | █  75
  17 ms | █  51
  18 ms | █  43
  19 ms |   33
  20 ms |   15
  21 ms |   13
  22 ms |   9
  23 ms |   1
  24 ms |   4
  25 ms |   2
  28 ms |   1
  31 ms |   1
  32 ms |   1
  34 ms |   2
  37 ms |   1
  42 ms |   1
  45 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `25.68`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.26`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `43.29`
- `fps_harmonic_avg` = `362.66`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `112.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `777.60`, min `24.18`, p50 `831.68`, p95 `1292.73`, p99 `1370.41`, 1%low `47.07`, 0.1%low `31.52`, std `337.03`

**Frame time (ms)**  avg `2.52`, p50 `1.20`, p95 `14.38`, p99 `18.07`, p99.9 `25.86`, max `41.36`

**Client tick (ms)**  avg `2.87`, p95 `5.10`, max `15.27`

**Memory**  start `1197 MB`, end `1274 MB`, peak `2022 MB`, GC `26 events / 142 ms`

**FPS over sampling window (ASCII):**

```
1221.7 |                               █ ██                                             
1140.9 |                           ██  ████                                             
1060.2 |                   ██      █████████                                           █
979.4 |                  ███     ███████████                                        █ █
898.7 |          ██     █████  █ ████████████                   █████               ███
817.9 |          ███  ███████  █ █████████████             █    ██████      ██    █████
737.1 |        █████ █████████████████████████   █ ██      ███████████     ████   █████
656.4 |        ███████████████████████████████ ███████   ███████████████  █████  ██████
575.6 |█       ███████████████████████████████ ███████  ███████████████████████████████
494.8 |█      █████████████████████████████████████████████████████████████████████████
414.1 |███  ███████████████████████████████████████████████████████████████████████████
333.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████  2132
   1 ms | ████████████████████████████████████████  4269
   2 ms | █████  511
   3 ms | ██  227
   4 ms | █  94
   5 ms | █  55
   6 ms |   37
   7 ms |   18
   8 ms |   8
   9 ms |   4
  10 ms |   6
  11 ms |   2
  12 ms |   32
  13 ms | █  109
  14 ms | █  127
  15 ms | █  97
  16 ms | █  79
  17 ms | █  57
  18 ms |   22
  19 ms |   24
  20 ms |   15
  21 ms |   4
  22 ms |   4
  23 ms |   2
  24 ms |   1
  25 ms |   2
  26 ms |   1
  27 ms |   1
  28 ms |   1
  31 ms |   3
  34 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `31.52`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.48`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `47.07`
- `fps_harmonic_avg` = `397.32`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `51.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `1102.46`, min `19.73`, p50 `1037.83`, p95 `2466.68`, p99 `3072.06`, 1%low `24.18`, 0.1%low `20.05`, std `887.63`

**Frame time (ms)**  avg `4.82`, p50 `0.96`, p95 `22.57`, p99 `35.51`, p99.9 `47.16`, max `50.69`

**Client tick (ms)**  avg `14.07`, p95 `19.80`, max `30.20`

**Memory**  start `1895 MB`, end `1897 MB`, peak `2077 MB`, GC `20 events / 106 ms`

**FPS over sampling window (ASCII):**

```
2734.6 |                                                                             ███
2497.0 |                                                                             ███
2259.4 |                                                          █         ██ █     ███
2021.8 |                                                         ██        ███ █     ███
1784.2 |                                       █    █     ███    █████    ██████     ███
1546.6 |                 ██   █    █   ███   ███    ███   ███    █████    ███████    ███
1309.1 |                 ██   ██   █   ███   ████   ███   ████   ██████   ███████    ███
1071.5 |  █      █  ██   ██   ██  ███  ████  ████  ████   ████   ██████   ████████   ███
833.9 |███     ██  ██   ███  ██  ███  ████  ████  █████  ████   ███████  ████████   ███
596.3 |███     ██  ███  ███  ██  ███  ████  █████ █████  █████  ███████  ████████   ███
358.7 |████ ██ ██  ███ ████  ███ ████ █████ █████ █████ ██████ █████████ █████████ ████
121.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  2119
   1 ms | ████████  423
   2 ms | ████  200
   3 ms | ███  182
   4 ms | ████  229
   5 ms | ████  231
   6 ms | █  37
   7 ms |   7
   8 ms |   6
   9 ms |   8
  10 ms |   3
  11 ms |   1
  12 ms | █  28
  13 ms | █  64
  14 ms | █  70
  15 ms | ██  82
  16 ms | ██  99
  17 ms | █  56
  18 ms |   24
  19 ms | █  33
  20 ms |   17
  21 ms |   11
  22 ms |   19
  23 ms |   18
  24 ms |   25
  25 ms |   20
  26 ms |   6
  27 ms |   15
  28 ms |   12
  29 ms |   8
  30 ms |   3
  31 ms |   10
  32 ms |   16
  33 ms |   9
  34 ms |   11
  35 ms |   7
  36 ms |   4
  37 ms |   1
  38 ms |   9
  39 ms |   3
  40 ms |   3
  41 ms |   1
  43 ms |   2
  44 ms |   4
  45 ms |   3
  46 ms |   1
  47 ms |   2
  48 ms |   1
  49 ms |   1
  50 ms |   2
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `20.05`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `207.29`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `20800.00`
- `preload_duration_ms` = `62.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `24.18`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4803.03`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `976.37`, min `10.43`, p50 `844.39`, p95 `2368.50`, p99 `3065.24`, 1%low `21.87`, 0.1%low `14.82`, std `847.86`

**Frame time (ms)**  avg `6.11`, p50 `1.18`, p95 `27.67`, p99 `39.41`, p99.9 `50.28`, max `95.86`

**Client tick (ms)**  avg `14.76`, p95 `20.65`, max `27.30`

**Memory**  start `1947 MB`, end `1256 MB`, peak `2072 MB`, GC `20 events / 103 ms`

**FPS over sampling window (ASCII):**

```
2711.5 |                                                                              █ 
2472.1 |                                                                              █ 
2232.8 |                                                                     █ █      ██
1993.5 |                                                         █         █ ████     ██
1754.1 |                                             ██          █ █      ███████     ██
1514.8 |                             █    █    ██    ████   █    █████    ████████    ██
1275.5 | █                           ██   ██   ███   ████   █    █████   █████████    ██
1036.2 |██████      ██      █   ██   ██   ██   ███   ████   ██   █████   ██████████   ██
796.8 |██████   █  ██   █  ██  ██   ██   ███  ███   ████  ███  ███████  ██████████   ██
557.5 |███████  █  ██  ██  ██  ███  ██  ████  ████ ██████ ████ ███████  ██████████   ██
318.2 |███████ ███ ███ ███ ███ ███ ████ █████ ████ ██████ ████ ████████ ███████████ ███
 78.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1534
   1 ms | ██████████  390
   2 ms | ████  147
   3 ms | ██  95
   4 ms | ██  71
   5 ms | ██  60
   6 ms | ███  106
   7 ms | ████  138
   8 ms | █  30
   9 ms |   9
  10 ms |   9
  11 ms |   7
  12 ms | █  21
  13 ms | █  41
  14 ms | █  50
  15 ms | ██  82
  16 ms | ██  77
  17 ms | █  49
  18 ms | █  34
  19 ms | █  30
  20 ms |   12
  21 ms | █  26
  22 ms |   11
  23 ms | █  21
  24 ms |   8
  25 ms |   9
  26 ms | █  22
  27 ms | █  26
  28 ms |   16
  29 ms |   13
  30 ms |   12
  31 ms |   10
  32 ms |   19
  33 ms |   18
  34 ms |   9
  35 ms |   12
  36 ms |   6
  37 ms |   4
  38 ms |   2
  39 ms |   6
  40 ms |   5
  41 ms |   3
  42 ms |   6
  43 ms |   1
  45 ms |   1
  46 ms |   5
  47 ms |   1
  48 ms |   1
  49 ms |   2
  50 ms |   1
  52 ms |   1
  54 ms |   1
  95 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `14.82`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `163.64`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `20800.00`
- `preload_duration_ms` = `77.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `21.87`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4804.84`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1346.00`, min `26.70`, p50 `1409.75`, p95 `2360.27`, p99 `2632.87`, 1%low `47.31`, 0.1%low `37.72`, std `631.01`

**Frame time (ms)**  avg `1.74`, p50 `0.71`, p95 `7.86`, p99 `18.88`, p99.9 `23.66`, max `37.46`

**Client tick (ms)**  avg `2.08`, p95 `3.02`, max `4.69`

**Memory**  start `884 MB`, end `1102 MB`, peak `2092 MB`, GC `41 events / 285 ms`

**FPS over sampling window (ASCII):**

```
2163.4 |                                                                             █  
2013.1 |                                                                       █  ████  
1862.8 |                                           █                      █   ██████████
1712.4 |                                       █   ██     ██ █         █ ███████████████
1562.1 |███                                    ██████ ██ █████ ██  ██  █████████████████
1411.8 |████                            █      ██████████████████ ██████████████████████
1261.5 |██████                        ███████ ██████████████████████████████████████████
1111.2 |███████                   █ ████████████████████████████████████████████████████
960.9 |███████              █ █████████████████████████████████████████████████████████
810.6 |███████    █         ███████████████████████████████████████████████████████████
660.3 |█████████  █████████████████████████████████████████████████████████████████████
510.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8035
   1 ms | ████████████  2324
   2 ms | █  180
   3 ms | █  146
   4 ms | █  126
   5 ms |   66
   6 ms |   18
   7 ms |   9
   8 ms |   7
   9 ms |   2
  10 ms |   2
  11 ms |   4
  12 ms |   3
  13 ms |   52
  14 ms |   51
  15 ms |   87
  16 ms |   93
  17 ms | █  106
  18 ms |   54
  19 ms |   45
  20 ms |   18
  21 ms |   19
  22 ms |   15
  23 ms |   6
  24 ms |   3
  25 ms |   1
  26 ms |   2
  27 ms |   2
  37 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `37.72`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `573.73`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3528.00`
- `preload_duration_ms` = `39.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `47.31`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `618.63`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1348.39`, min `24.20`, p50 `1472.72`, p95 `2342.29`, p99 `2590.22`, 1%low `46.46`, 0.1%low `32.60`, std `652.28`

**Frame time (ms)**  avg `1.82`, p50 `0.68`, p95 `13.66`, p99 `18.95`, p99.9 `23.14`, max `41.32`

**Client tick (ms)**  avg `2.16`, p95 `3.12`, max `12.75`

**Memory**  start `982 MB`, end `1113 MB`, peak `2115 MB`, GC `42 events / 288 ms`

**FPS over sampling window (ASCII):**

```
1983.5 |                                                                           █  █ 
1840.7 |                                          ██  █                ███    █ █ ██  █ 
1697.9 |  █  █                                 █ ███ ██      ████    █ █████ ██ ███████ 
1555.1 |███████                            █  ██████████ █████████  ████████ ███████████
1412.3 |███████                        █  ██ ███████████████████████████████████████████
1269.4 |███████                        █  ██████████████████████████████████████████████
1126.6 |████████                      ██████████████████████████████████████████████████
983.8 |████████                 ██ █ ██████████████████████████████████████████████████
841.0 |████████              ██████████████████████████████████████████████████████████
698.2 |█████████        ██ █ ██████████████████████████████████████████████████████████
555.4 |█████████  █ █  ████████████████████████████████████████████████████████████████
412.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7528
   1 ms | ███████████  2070
   2 ms | ██  413
   3 ms | █  130
   4 ms | █  159
   5 ms |   60
   6 ms |   15
   7 ms |   13
   8 ms |   2
   9 ms |   4
  10 ms |   2
  11 ms |   3
  12 ms |   6
  13 ms |   20
  14 ms |   65
  15 ms |   90
  16 ms | █  116
  17 ms | █  96
  18 ms |   64
  19 ms |   37
  20 ms |   26
  21 ms |   22
  22 ms |   9
  23 ms |   4
  25 ms |   3
  26 ms |   1
  27 ms |   1
  39 ms |   3
  41 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `32.60`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `548.21`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `4105.00`
- `preload_duration_ms` = `53.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `46.46`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.30`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `772.07`, min `33.01`, p50 `802.66`, p95 `1186.97`, p99 `1363.54`, 1%low `47.00`, 0.1%low `39.01`, std `302.34`

**Frame time (ms)**  avg `2.53`, p50 `1.25`, p95 `16.12`, p99 `19.41`, p99.9 `23.54`, max `30.30`

**Client tick (ms)**  avg `0.73`, p95 `1.01`, max `1.70`

**Memory**  start `1248 MB`, end `1139 MB`, peak `2146 MB`, GC `46 events / 294 ms`

**FPS over sampling window (ASCII):**

```
1045.7 | █   █                                                                          
1001.1 |███  █ █                                                                        
956.5 |███ ████                                                                       █
911.9 |█████████                                                   █                ███
867.2 |█████████  ██  ██                                           █    █       █   ███
822.6 |██████████ ██  ████ █                                       █    █   █ █ ██ ████
778.0 |██████████ ███ ██████  █ █ █ █ █  █  █  █    █      █    █ ███ █ █   █ ████ ████
733.4 |██████████████ ██████ ██ █ █ █ ██ █  █  █    █      ██   █ ███ ████  ██████ ████
688.8 |██████████████ ██████ ████ ███ ██ █████ █    █ ██ █ ██████████ █████████████████
644.2 |█████████████████████████████████ █████ ██████ ██ █ ████████████████████████████
599.6 |███████████████████████████████████████ █████████ ██████████████████████████████
555.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████  1702
   1 ms | ████████████████████████████████████████  5054
   2 ms | ███  347
   3 ms |   63
   4 ms |   58
   5 ms | █  82
   6 ms |   22
   7 ms |   3
   8 ms |   2
   9 ms |   4
  10 ms |   1
  11 ms |   2
  12 ms |   5
  13 ms |   13
  14 ms |   49
  15 ms | █  99
  16 ms | █  113
  17 ms | █  109
  18 ms | █  67
  19 ms |   57
  20 ms |   23
  21 ms |   13
  22 ms |   10
  23 ms |   4
  24 ms |   2
  25 ms |   3
  26 ms |   1
  30 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.00`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `26.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `39.01`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `395.27`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1889.44`, min `25.33`, p50 `1958.08`, p95 `2657.75`, p99 `2825.00`, 1%low `51.95`, 0.1%low `41.68`, std `556.90`

**Frame time (ms)**  avg `1.10`, p50 `0.51`, p95 `1.31`, p99 `17.60`, p99.9 `20.99`, max `39.48`

**Client tick (ms)**  avg `0.31`, p95 `0.42`, max `0.92`

**Memory**  start `1405 MB`, end `2320 MB`, peak `2394 MB`, GC `39 events / 280 ms`

**FPS over sampling window (ASCII):**

```
2150.9 |                                                                            █   
2098.2 |                                                     █     █                █   
2045.4 |     █                         ██                    █     █                █  █
1992.7 |    ██  █   █            ██ ██████   █        █   █  █     █      █         █  █
1939.9 |█  ███ ███  █ ███  █     ██ ██████   █  █     █   █  ███   █     ██  ██     ████
1887.2 |██ ███ ████ █ ███  ██    ██ ██████████  ███ █ █   █  ███  ██     ██  ██ █  █████
1834.5 |██ ██████████ ███ █████████ ██████████ ████ ███   ██████  █████  ████████  █████
1781.7 |██ ██████████ ███ █████████ ██████████ ██████████ ███████ █████  █████████ █████
1729.0 |██ ████████████████████████ ██████████ ██████████████████ █████  █████████ █████
1676.3 |██████████████████████████████████████ █████████████████████████ █████████ █████
1623.5 |██████████████████████████████████████████████████████████████████████████ █████
1570.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16956
   1 ms | █  413
   2 ms |   14
   3 ms |   56
   4 ms |   97
   5 ms |   31
   8 ms |   2
  10 ms |   2
  11 ms |   2
  12 ms |   4
  13 ms |   46
  14 ms |   56
  15 ms |   71
  16 ms |   139
  17 ms |   127
  18 ms |   61
  19 ms |   32
  20 ms |   24
  21 ms |   9
  22 ms |   3
  23 ms |   4
  38 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `42.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `41.68`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `907.55`
- `fps_1pct_low` = `51.95`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `1854.40`, min `35.70`, p50 `1922.99`, p95 `2608.95`, p99 `2774.54`, 1%low `50.64`, 0.1%low `42.39`, std `545.21`

**Frame time (ms)**  avg `1.12`, p50 `0.52`, p95 `1.36`, p99 `17.90`, p99.9 `21.81`, max `28.01`

**Client tick (ms)**  avg `0.28`, p95 `0.37`, max `0.79`

**Memory**  start `1127 MB`, end `1168 MB`, peak `2448 MB`, GC `40 events / 283 ms`

**FPS over sampling window (ASCII):**

```
2134.1 |       █  █                                                                     
2071.7 |     █ █  █                 █   █                                               
2009.2 |     █ █ ██      █   █      █   ██ █  ██        █                 █             
1946.7 |     ██████     ███  ███    █   ████  ██     ████               █ █    █        
1884.3 |  █  ██████ █ █ ███  ███  ████  █████ ███   █████   █  █  █  █ ██ █    █     █  
1821.8 |█ █  ████████ █████  ████ █████ █████ ███   █████   █ ██████ █ ████  ████   ████
1759.3 |███████████████████ ███████████ █████ ███   █████   ████████ █ ████ ███████ ████
1696.9 |███████████████████████████████ █████ ███ ████████ █████████ ██████ ███████ ████
1634.4 |█████████████████████████████████████████ ████████ ████████████████ ███████ ████
1572.0 |███████████████████████████████████████████████████████████████████████████ ████
1509.5 |███████████████████████████████████████████████████████████████████████████ ████
1447.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16692
   1 ms | █  389
   2 ms |   39
   3 ms |   53
   4 ms |   98
   5 ms |   29
   6 ms |   2
   7 ms |   3
   9 ms |   2
  10 ms |   1
  11 ms |   4
  12 ms |   4
  13 ms |   32
  14 ms |   63
  15 ms |   75
  16 ms |   111
  17 ms |   112
  18 ms |   67
  19 ms |   34
  20 ms |   32
  21 ms |   20
  22 ms |   7
  23 ms |   2
  25 ms |   1
  26 ms |   3
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `lamps_placed` = `128.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.64`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `fps_harmonic_avg` = `893.89`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `42.39`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `1616.52`, min `27.34`, p50 `1816.50`, p95 `2567.25`, p99 `2773.24`, 1%low `50.32`, 0.1%low `42.02`, std `719.22`

**Frame time (ms)**  avg `1.58`, p50 `0.55`, p95 `4.90`, p99 `18.08`, p99.9 `21.40`, max `36.58`

**Client tick (ms)**  avg `0.34`, p95 `0.52`, max `0.73`

**Memory**  start `1833 MB`, end `1986 MB`, peak `2458 MB`, GC `36 events / 270 ms`

**FPS over sampling window (ASCII):**

```
2251.2 |                  █                                                             
2156.3 |                  █                                                             
2061.3 |         █        █ █                                                           
1966.4 |  █      █   █    █ █   █     █                                                 
1871.4 |  █      █ █ █  █ █ █   █     █         █        █     █  █ █     █          █  
1776.5 |█ █ █    █ █ █  █ █ █   █     █  █      █ █      ██ █  █  █ █   █ █ █        █  
1681.5 |█ █ █    █ █ █  █ ███   █  █  ██ █ ████ █ █      ██ █  █  █ █   ███ ███   █  █  
1586.6 |███ █  █ █ ███  █ ███   █ ███ ██ ██████ █ █ ██   ██ █  █  █ █   ███ ████  █  █  
1491.6 |██████ ███ ███  █ ███   █ ███ ██ ██████ ███████  █████ ███████  ███ ████ ██  █  
1396.7 |███████████████ █████  ████████████████████████ ██████ ████████ ████████ ███████
1301.7 |██████████████████████ ████████████████████████████████████████ ████████████████
1206.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10072
   1 ms | ███  656
   2 ms | ███  811
   3 ms | █  372
   4 ms |   100
   5 ms |   37
   6 ms |   17
   7 ms |   6
   9 ms |   2
  11 ms |   2
  12 ms |   7
  13 ms |   50
  14 ms |   61
  15 ms |   103
  16 ms |   111
  17 ms |   101
  18 ms |   51
  19 ms |   33
  20 ms |   31
  21 ms |   8
  22 ms |   4
  23 ms |   2
  24 ms |   1
  25 ms |   1
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `50.32`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `52.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `42.02`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `632.16`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `1683.60`, min `27.13`, p50 `1752.97`, p95 `2395.88`, p99 `2568.44`, 1%low `49.84`, 0.1%low `40.28`, std `512.31`

**Frame time (ms)**  avg `1.24`, p50 `0.57`, p95 `1.68`, p99 `18.17`, p99.9 `22.33`, max `36.86`

**Client tick (ms)**  avg `0.36`, p95 `0.46`, max `12.19`

**Memory**  start `1562 MB`, end `2326 MB`, peak `2465 MB`, GC `36 events / 249 ms`

**FPS over sampling window (ASCII):**

```
1974.1 |                                                              █        █        
1915.9 |                                                              █  █     █     █  
1857.8 |                                       █         █            █  ███   █ ██ ██ █
1799.7 |    █     ██  █          █            ██      ██ █ █        █ █  ████ ██ ██ ██ █
1741.5 |    █    ███ ██         ██ █       █ ███    █ █████████     ███  ████ ██ ██ ████
1683.4 |    █    ███████        ██ █ █ █   █ ███  ███ █████████ █ █ ████ ████ ██ ███████
1625.3 |    ██   ████████  ██   ██ █████   █████  ███ █████████ █ ██████ ███████ ███████
1567.1 |██ ████ █████████  ███  █████████  ██████████ █████████ █ ██████ ███████ ███████
1509.0 |██ ████ █████████  ███ ██████████ ███████████ ██████████████████████████ ███████
1450.9 |██████████████████ ███ ██████████ ███████████ ██████████████████████████████████
1392.7 |██████████████████ ██████████████ ██████████████████████████████████████████████
1334.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14816
   1 ms | ██  568
   2 ms |   18
   3 ms |   36
   4 ms |   89
   5 ms |   55
   6 ms |   4
   8 ms |   2
  10 ms |   1
  11 ms |   3
  12 ms |   4
  13 ms |   16
  14 ms |   54
  15 ms |   84
  16 ms |   135
  17 ms |   97
  18 ms |   74
  19 ms |   45
  20 ms |   25
  21 ms |   12
  22 ms |   11
  23 ms |   3
  24 ms |   1
  25 ms |   1
  26 ms |   2
  29 ms |   1
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `40.28`
- `fps_1pct_low` = `49.84`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `807.72`
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
- `preload_duration_ms` = `51.00`
- `preload_chunks` = `81.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `1721.82`, min `20.26`, p50 `1782.01`, p95 `2628.22`, p99 `2767.28`, 1%low `48.21`, 0.1%low `33.88`, std `658.13`

**Frame time (ms)**  avg `1.30`, p50 `0.56`, p95 `3.40`, p99 `17.99`, p99.9 `23.55`, max `49.37`

**Client tick (ms)**  avg `0.45`, p95 `0.71`, max `12.84`

**Memory**  start `1601 MB`, end `2282 MB`, peak `2620 MB`, GC `33 events / 259 ms`

**FPS over sampling window (ASCII):**

```
2215.8 |                █    █                                                          
2112.8 |              █ █    █     █  █ ██            █                                 
2009.8 |          █   ████  ██   ███  █ ██            █                                 
1906.8 |█   █     ████████  ███  ███  █ ██ █████      █    █    ██  █ █                 
1803.8 |███ ██    ████████  ███  ████ ████ █████      █    █    ██  █ █                 
1700.8 |███ ██    █████████ ███ ██████████ █████      ██  ████  ██  ███   █ ███ ██      
1597.8 |███ ██    █████████ ███ ██████████ █████ ████ ██ █████  ██  ███   █ ███ ████   █
1494.8 |██████   ██████████ ███ ████████████████ ████ ██ █████ ████████  ██████ ████ ███
1391.8 |███████████████████ ███ ████████████████████████ █████ █████████ ███████████ ███
1288.8 |██████████████████████████████████████████████████████ █████████ ███████████████
1185.8 |████████████████████████████████████████████████████████████████ ███████████████
1082.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13480
   1 ms | ███  899
   2 ms | █  182
   3 ms |   117
   4 ms |   65
   5 ms |   32
   6 ms |   16
   7 ms |   5
   8 ms |   3
   9 ms |   1
  11 ms |   1
  12 ms |   20
  13 ms |   50
  14 ms |   59
  15 ms |   124
  16 ms |   94
  17 ms |   73
  18 ms |   50
  19 ms |   40
  20 ms |   24
  21 ms |   14
  22 ms |   6
  23 ms |   5
  24 ms |   6
  25 ms |   2
  26 ms |   1
  28 ms |   1
  29 ms |   1
  30 ms |   1
  39 ms |   1
  40 ms |   1
  49 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.21`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `40.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `33.88`
- `part` = `1.00`
- `fps_harmonic_avg` = `769.07`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23552 ms  |  Sample ticks: 400

**FPS**  avg `1596.36`, min `24.15`, p50 `1626.74`, p95 `2564.59`, p99 `2752.02`, 1%low `46.24`, 0.1%low `36.87`, std `627.64`

**Frame time (ms)**  avg `1.42`, p50 `0.61`, p95 `4.20`, p99 `19.09`, p99.9 `23.73`, max `41.40`

**Client tick (ms)**  avg `0.43`, p95 `0.64`, max `4.42`

**Memory**  start `1755 MB`, end `2179 MB`, peak `2828 MB`, GC `31 events / 274 ms`

**FPS over sampling window (ASCII):**

```
2102.0 |   █                                                                            
2017.0 |   █           █                                                                
1932.0 |   █          ██    █    █           █                                          
1847.0 |██ ███       ███   ██   ██           █      █                                   
1762.0 |██████   █   ████ ███  █████   █   ███   █  █ █                                 
1677.0 |████████ ██  ████ ██████████   ███████  ███ █ █   █   ██    █                   
1591.9 |████████ ███ ███████████████ █ ███████  ███ ███   █   ███  ██                   
1506.9 |████████ ███ ███████████████ █ ███████  ███ ████  ██  ███  ██         ██ █      
1421.9 |████████ ███ ███████████████ ████████████████████ ██ ████  ███     ████████     
1336.9 |████████████ ███████████████████████████████████████ █████ ████  ███████████ ███
1251.9 |████████████████████████████████████████████████████████████████████████████ ███
1166.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11977
   1 ms | ████  1055
   2 ms | █  180
   3 ms |   96
   4 ms |   100
   5 ms |   47
   6 ms |   12
   7 ms |   4
   8 ms |   3
   9 ms |   1
  10 ms |   1
  11 ms |   2
  12 ms |   3
  13 ms |   42
  14 ms |   59
  15 ms |   94
  16 ms |   98
  17 ms |   70
  18 ms |   53
  19 ms |   36
  20 ms |   36
  21 ms |   29
  22 ms |   18
  23 ms |   12
  24 ms |   3
  25 ms |   5
  26 ms |   1
  27 ms |   3
  28 ms |   1
  41 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `55.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.24`
- `surface_water_ratio` = `0.03`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `508.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `36.87`
- `part` = `1.00`
- `fps_harmonic_avg` = `702.44`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `1722.13`, min `20.58`, p50 `1806.28`, p95 `2671.95`, p99 `2836.46`, 1%low `48.47`, 0.1%low `34.57`, std `692.36`

**Frame time (ms)**  avg `1.34`, p50 `0.55`, p95 `4.06`, p99 `17.84`, p99.9 `22.70`, max `48.59`

**Client tick (ms)**  avg `0.40`, p95 `0.66`, max `2.61`

**Memory**  start `2386 MB`, end `2681 MB`, peak `3076 MB`, GC `29 events / 252 ms`

**FPS over sampling window (ASCII):**

```
2342.4 |       █   █                                                                    
2222.5 | █    ██   █                                                                    
2102.6 | █   █████ █ █  █        █          █                                           
1982.7 |███ ██████████  █ ██     █   █  █   ██        █                                 
1862.8 |███ ██████████ █████    ██   █  ██ ███     █  █   █                             
1742.9 |███ █████████████████  █████ █ ███████     █  █  ██     ██   █      ███   █  █  
1623.0 |█████████████████████  ███████████████    █████ ███  █ ████  █ █    ███   █  ██ 
1503.0 |███████████████████████████████████████  ███████████ ██████  █ █  █ ████ ██  ███
1383.1 |████████████████████████████████████████ ███████████ ██████ ████  ██████ ██  ███
1263.2 |████████████████████████████████████████████████████████████████████████ ██  ███
1143.3 |████████████████████████████████████████████████████████████████████████ ██ ████
1023.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12824
   1 ms | ███  1067
   2 ms | █  182
   3 ms |   109
   4 ms |   108
   5 ms |   39
   6 ms |   12
   7 ms |   7
   8 ms |   4
   9 ms |   2
  11 ms |   2
  12 ms |   21
  13 ms |   50
  14 ms |   65
  15 ms |   118
  16 ms |   124
  17 ms |   57
  18 ms |   42
  19 ms |   30
  20 ms |   35
  21 ms |   18
  22 ms |   4
  23 ms |   5
  24 ms |   1
  26 ms |   2
  27 ms |   1
  33 ms |   1
  40 ms |   1
  43 ms |   1
  48 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `55.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.47`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `34.57`
- `part` = `1.00`
- `fps_harmonic_avg` = `746.65`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `1866.22`, min `13.24`, p50 `1906.64`, p95 `3063.99`, p99 `3399.93`, 1%low `45.46`, 0.1%low `24.76`, std `772.21`

**Frame time (ms)**  avg `1.25`, p50 `0.52`, p95 `2.99`, p99 `17.97`, p99.9 `26.24`, max `75.52`

**Client tick (ms)**  avg `0.56`, p95 `0.90`, max `11.95`

**Memory**  start `2449 MB`, end `2863 MB`, peak `3258 MB`, GC `21 events / 278 ms`

**FPS over sampling window (ASCII):**

```
2787.0 |                                 █                                              
2621.4 |               █                 █                                              
2455.9 |      █    █   ███           ██ ██   █                                          
2290.3 |     ██    █  ████   █ █     ██ ██ █ █                                          
2124.8 |     ██ ████  ████  ████     ██ ██ ████                                 █       
1959.3 | █   ██ ████  ████  █████  ██████████████      █  █          █       █ ██       
1793.7 |██ ████████████████ ██████ ███████████████     █ ██ █ █ █    ██ ██   █ ████     
1628.2 |██████████████████████████████████████████ █   ██████ █ ██  ██████   ███████    
1462.6 |██████████████████████████████████████████ █ ██████████ ██ ███████ █████████   █
1297.1 |███████████████████████████████████████████████████████ ████████████████████  ██
1131.6 |████████████████████████████████████████████████████████████████████████████ ███
966.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13936
   1 ms | ███  972
   2 ms | █  349
   3 ms |   145
   4 ms |   48
   5 ms |   38
   6 ms |   13
   7 ms |   8
   8 ms |   4
   9 ms |   3
  12 ms |   29
  13 ms |   54
  14 ms |   70
  15 ms |   77
  16 ms |   83
  17 ms |   74
  18 ms |   52
  19 ms |   35
  20 ms |   23
  21 ms |   11
  22 ms |   5
  23 ms |   9
  24 ms |   2
  25 ms |   2
  26 ms |   3
  27 ms |   2
  29 ms |   3
  30 ms |   2
  35 ms |   1
  38 ms |   1
  43 ms |   1
  44 ms |   1
  53 ms |   1
  55 ms |   1
  69 ms |   1
  75 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `57.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `45.46`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `14.00`
- `entity_count_delta` = `-13.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `56.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `24.76`
- `part` = `1.00`
- `fps_harmonic_avg` = `802.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `1996.66`, min `21.11`, p50 `2038.60`, p95 `3208.17`, p99 `3394.54`, 1%low `51.26`, 0.1%low `34.05`, std `836.31`

**Frame time (ms)**  avg `1.15`, p50 `0.49`, p95 `2.49`, p99 `16.90`, p99.9 `21.90`, max `47.37`

**Client tick (ms)**  avg `0.41`, p95 `0.65`, max `4.50`

**Memory**  start `1849 MB`, end `3333 MB`, peak `3375 MB`, GC `25 events / 249 ms`

**FPS over sampling window (ASCII):**

```
2691.5 |                █                                                               
2559.6 |     █     █   ██    ██                                                         
2427.8 |█   ██   █████ ██    ███            ██                                          
2295.9 |██████   █████ ██   ████      ████  ██                                          
2164.1 |██████████████ ███  ████  █  ██████ ██ █                                        
2032.2 |███████████████████████████  ██████ ████       █   █                            
1900.4 |███████████████████████████████████ ██████    ██  ██   █  █        █    ██ ██   
1768.5 |███████████████████████████████████ ███████  ████ ███  █  ███ ████ ██  ███ ███  
1636.7 |███████████████████████████████████ ████████ ████ ███████ ███ ████ █████████████
1504.8 |█████████████████████████████████████████████████████████ ███ ██████████████████
1373.0 |█████████████████████████████████████████████████████████ ██████████████████████
1241.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15222
   1 ms | ███  1154
   2 ms | █  355
   3 ms |   86
   4 ms |   25
   5 ms |   8
   6 ms |   1
   7 ms |   3
   9 ms |   2
  12 ms |   53
  13 ms |   150
  14 ms |   110
  15 ms |   66
  16 ms |   61
  17 ms |   63
  18 ms |   37
  19 ms |   28
  20 ms |   15
  21 ms |   5
  22 ms |   5
  23 ms |   5
  26 ms |   2
  27 ms |   1
  36 ms |   1
  37 ms |   1
  43 ms |   1
  46 ms |   1
  47 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `51.26`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `14.00`
- `entity_count_delta` = `-13.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `52.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `34.05`
- `part` = `1.00`
- `fps_harmonic_avg` = `872.33`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 25642 ms  |  Sample ticks: 400

**FPS**  avg `1492.30`, min `12.90`, p50 `1584.74`, p95 `2783.50`, p99 `3224.81`, 1%low `38.10`, 0.1%low `19.12`, std `751.03`

**Frame time (ms)**  avg `1.72`, p50 `0.63`, p95 `5.43`, p99 `20.76`, p99.9 `33.15`, max `77.54`

**Client tick (ms)**  avg `0.73`, p95 `1.68`, max `26.05`

**Memory**  start `1914 MB`, end `3119 MB`, peak `3509 MB`, GC `18 events / 290 ms`

**FPS over sampling window (ASCII):**

```
2252.5 |        █          █                                                            
2129.3 |        █         ██                                                            
2006.2 |      █ █         ██                                                            
1883.1 |  ██ ██████ █ █   ███          █          █                                     
1759.9 |  █████████ ███   ███          █      █   █ █                       █           
1636.8 |  █████████ ████  ███         ███   █ █   █ █   █           █       ██          
1513.6 | ██████████████████████   █ █ █████ ████ ██ █  ██           ██      ██ █        
1390.5 |███████████████████████ ███ █ █████ ████ █████████  █       ██  ██  ██ █       █
1267.4 |███████████████████████ █████ ████████████████████████      ██ ███  ██ █  ██████
1144.2 |██████████████████████████████████████████████████████████  ███████ ██ █  ██████
1021.1 |██████████████████████████████████████████████████████████  ███████ ████████████
898.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8456
   1 ms | █████████  1799
   2 ms | ██  435
   3 ms | █  207
   4 ms | █  122
   5 ms |   51
   6 ms |   26
   7 ms |   15
   8 ms |   11
   9 ms |   8
  10 ms |   10
  11 ms |   5
  12 ms |   7
  13 ms |   14
  14 ms |   32
  15 ms |   48
  16 ms |   48
  17 ms |   70
  18 ms |   60
  19 ms |   58
  20 ms |   41
  21 ms |   29
  22 ms |   24
  23 ms |   11
  24 ms |   11
  25 ms |   5
  26 ms |   5
  28 ms |   2
  29 ms |   3
  30 ms |   1
  31 ms |   2
  35 ms |   1
  43 ms |   1
  44 ms |   1
  45 ms |   1
  49 ms |   1
  51 ms |   1
  54 ms |   1
  55 ms |   2
  57 ms |   2
  77 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `38.10`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `41.00`
- `entity_count_delta` = `-39.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `2596.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `19.12`
- `part` = `1.00`
- `fps_harmonic_avg` = `581.44`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `1599.41`, min `15.00`, p50 `1771.65`, p95 `2755.86`, p99 `3213.61`, 1%low `37.33`, 0.1%low `20.28`, std `752.22`

**Frame time (ms)**  avg `1.63`, p50 `0.56`, p95 `5.16`, p99 `20.93`, p99.9 `38.14`, max `66.68`

**Client tick (ms)**  avg `0.68`, p95 `2.02`, max `8.21`

**Memory**  start `2164 MB`, end `2104 MB`, peak `3557 MB`, GC `15 events / 292 ms`

**FPS over sampling window (ASCII):**

```
2286.4 |                                                                            █   
2156.6 | █                                                                          ██ █
2026.9 |██                                                                  █   █   ████
1897.1 |██ █    █  █                                                      █ █ ███ █ ████
1767.4 |██████ ███ █  █                                █                 ██ █ ███ █ ████
1637.7 |██████████ ██ ███ ███   █       ███ █      █   █    ██     ███   ██ █████ █ ████
1507.9 |██████████ ██████ ███  ██  █ █  ███ █  █ █ █ ████   ██  ███████  ███████████████
1378.2 |█████████████████████ ████ █ █ ██████  ███ ███████  ██  ███████  ███████████████
1248.4 |██████████████████████████████████████████ ███████ ████ ███████ ████████████████
1118.7 |██████████████████████████████████████████ █████████████████████████████████████
989.0 |██████████████████████████████████████████ █████████████████████████████████████
859.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9415
   1 ms | ██████  1457
   2 ms | ██  442
   3 ms | █  210
   4 ms | █  136
   5 ms |   67
   6 ms |   30
   7 ms |   29
   8 ms |   18
   9 ms |   8
  10 ms |   2
  11 ms |   6
  12 ms |   11
  13 ms |   20
  14 ms |   25
  15 ms |   42
  16 ms |   47
  17 ms |   55
  18 ms |   50
  19 ms |   61
  20 ms |   40
  21 ms |   31
  22 ms |   21
  23 ms |   18
  24 ms |   10
  25 ms |   4
  26 ms |   3
  27 ms |   6
  28 ms |   2
  29 ms |   4
  31 ms |   2
  32 ms |   1
  33 ms |   1
  35 ms |   1
  36 ms |   2
  37 ms |   1
  38 ms |   1
  39 ms |   1
  41 ms |   1
  42 ms |   1
  43 ms |   2
  45 ms |   1
  46 ms |   1
  54 ms |   2
  55 ms |   1
  58 ms |   1
  66 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `63.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `37.33`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `24.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `25.00`
- `preload_duration_ms` = `48.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `20.28`
- `part` = `1.00`
- `fps_harmonic_avg` = `614.61`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 27015 ms  |  Sample ticks: 400

**FPS**  avg `1442.27`, min `15.68`, p50 `1534.62`, p95 `2433.84`, p99 `2925.22`, 1%low `38.59`, 0.1%low `22.74`, std `694.75`

**Frame time (ms)**  avg `1.75`, p50 `0.65`, p95 `5.72`, p99 `21.07`, p99.9 `31.06`, max `63.78`

**Client tick (ms)**  avg `0.62`, p95 `1.32`, max `8.64`

**Memory**  start `2182 MB`, end `2535 MB`, peak `3605 MB`, GC `19 events / 292 ms`

**FPS over sampling window (ASCII):**

```
1910.4 |  █       █                                    █                                
1824.1 |  █  █  ███                              █     █                                
1737.9 | ███ █  ███  █                           █  ████                                
1651.7 | █████ ████  █  █        █       ██     ██ ██████                               
1565.4 | ██████████████ ███    ████      ██   ████ ██████                  █            
1479.2 |███████████████ ███ ███████  █   ████ ███████████                 ██            
1393.0 |███████████████ ████████████ ██  ████ ████████████     █         ███            
1306.7 |███████████████ ████████████ ███ ████ █████████████ █  █  █    █ ███    █  █    
1220.5 |█████████████████████████████████████████████████████ ███ ██  ███████   █  ███ █
1134.3 |█████████████████████████████████████████████████████ ████████████████ ███████ █
1048.0 |█████████████████████████████████████████████████████ ████████████████ ███████ █
961.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8287
   1 ms | █████████  1840
   2 ms | ██  437
   3 ms | █  189
   4 ms |   73
   5 ms |   41
   6 ms |   27
   7 ms |   15
   8 ms |   12
   9 ms |   6
  10 ms |   3
  11 ms |   1
  12 ms |   2
  13 ms |   7
  14 ms |   36
  15 ms |   41
  16 ms |   54
  17 ms |   74
  18 ms |   79
  19 ms |   46
  20 ms |   45
  21 ms |   20
  22 ms |   30
  23 ms |   14
  24 ms |   6
  25 ms |   16
  26 ms |   7
  27 ms |   4
  28 ms |   4
  29 ms |   2
  30 ms |   1
  31 ms |   1
  32 ms |   1
  34 ms |   1
  38 ms |   1
  39 ms |   1
  41 ms |   2
  45 ms |   1
  46 ms |   1
  48 ms |   1
  53 ms |   1
  63 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `24.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `38.59`
- `surface_water_ratio` = `0.01`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `14.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `19.00`
- `preload_duration_ms` = `4000.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `22.74`
- `part` = `1.00`
- `fps_harmonic_avg` = `571.45`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `1467.12`, min `34.62`, p50 `1421.66`, p95 `2984.72`, p99 `3259.28`, 1%low `49.75`, 0.1%low `40.11`, std `882.51`

**Frame time (ms)**  avg `1.87`, p50 `0.70`, p95 `14.37`, p99 `18.28`, p99.9 `22.55`, max `28.89`

**Client tick (ms)**  avg `0.46`, p95 `0.70`, max `1.55`

**Memory**  start `2571 MB`, end `2980 MB`, peak `3635 MB`, GC `24 events / 233 ms`

**FPS over sampling window (ASCII):**

```
1980.4 |      █   ██                                                                    
1894.3 |     ██   ██                                                                    
1808.1 |     ██ █ ██    █ █                                                  █          
1722.0 |     ██ █ ██    █ ██                                                 █          
1635.9 |█ █ █████████ █ █████   █ █                                  █       █      ██  
1549.8 |█ █ █████████ █ █████ ████████                       █      ██      ███   ████  
1463.7 |███████████████ █████ ████████        █ █            █     ███   █  ███   ████  
1377.5 |█████████████████████ █████████   █ █ █ █  █ █    ██ ████  ███ █ █████████████  
1291.4 |█████████████████████ ██████████  █ ███ ███████   ███████  ███ ███████████████  
1205.3 |█████████████████████ ██████████ ██ ████████████  ████████ █████████████████████
1119.2 |████████████████████████████████████████████████  ██████████████████████████████
1033.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6635
   1 ms | █████████████████  2742
   2 ms | ███  521
   3 ms | █  112
   4 ms |   40
   5 ms |   9
   6 ms |   2
   7 ms |   2
   9 ms |   1
  10 ms |   1
  12 ms |   1
  13 ms |   53
  14 ms | █  154
  15 ms | █  131
  16 ms | █  103
  17 ms |   71
  18 ms |   55
  19 ms |   36
  20 ms |   18
  21 ms |   7
  22 ms |   6
  23 ms |   1
  24 ms |   1
  25 ms |   1
  26 ms |   2
  28 ms |   2
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.75`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `40.11`
- `part` = `1.00`
- `fps_harmonic_avg` = `534.96`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23603 ms  |  Sample ticks: 400

**FPS**  avg `1579.66`, min `18.89`, p50 `1572.07`, p95 `3133.24`, p99 `3410.77`, 1%low `42.14`, 0.1%low `26.28`, std `884.04`

**Frame time (ms)**  avg `1.67`, p50 `0.64`, p95 `6.13`, p99 `19.29`, p99.9 `28.83`, max `52.94`

**Client tick (ms)**  avg `0.47`, p95 `1.11`, max `8.21`

**Memory**  start `2268 MB`, end `2503 MB`, peak `3912 MB`, GC `20 events / 249 ms`

**FPS over sampling window (ASCII):**

```
2371.5 |                                                          █                     
2220.3 |                                                          █             ██      
2069.2 |                                                          █        ██   ███     
1918.1 |   █ █   ███  ██████                              █       ██      ███   ████    
1767.0 | █ ████ ████████████   █ █ █         █            █       ██      ███ ██████    
1615.9 |███████ ████████████  ███████       ██            █     █████     ███ ███████ █ 
1464.7 |████████████████████  █████████  █  ███     ███   █  █ ██████     ███████████ ██
1313.6 |███████████████████████████████████████     ███  ██  ████████  █  ███████████ ██
1162.5 |███████████████████████████████████████   █ ███ ███ ██████████ █  ██████████████
1011.4 |████████████████████████████████████████ ██████ ███ ██████████ █████████████████
860.3 |██████████████████████████████████████████████████████████████ █████████████████
709.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8314
   1 ms | ███████████  2316
   2 ms | ██  479
   3 ms | █  131
   4 ms |   68
   5 ms |   39
   6 ms |   15
   7 ms |   14
   8 ms |   8
   9 ms |   4
  10 ms |   6
  11 ms |   4
  12 ms |   6
  13 ms |   60
  14 ms |   100
  15 ms |   66
  16 ms |   73
  17 ms |   50
  18 ms |   58
  19 ms |   41
  20 ms |   21
  21 ms |   18
  22 ms |   10
  23 ms |   10
  24 ms |   9
  25 ms |   6
  26 ms |   4
  27 ms |   2
  28 ms |   3
  29 ms |   3
  30 ms |   1
  32 ms |   2
  38 ms |   1
  42 ms |   1
  44 ms |   1
  46 ms |   1
  48 ms |   1
  52 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `42.14`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `550.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `26.28`
- `part` = `1.00`
- `fps_harmonic_avg` = `597.71`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `1428.01`, min `15.57`, p50 `1497.76`, p95 `2646.19`, p99 `3000.50`, 1%low `42.05`, 0.1%low `26.61`, std `727.24`

**Frame time (ms)**  avg `1.78`, p50 `0.67`, p95 `8.31`, p99 `19.80`, p99.9 `27.38`, max `64.21`

**Client tick (ms)**  avg `0.66`, p95 `1.53`, max `7.09`

**Memory**  start `2395 MB`, end `3629 MB`, peak `3961 MB`, GC `18 events / 219 ms`

**FPS over sampling window (ASCII):**

```
1996.5 |           █                                     █                        █     
1890.0 |           █                                █  █ █           █       █    █     
1783.6 |  █        █                                █  ███       ██  █       █   ██     
1677.1 |  █        ██ █              ██            ███████  █    ██  █ █     █ █ ██     
1570.7 | ██        █████    █        ███           ████████ ██  ███ ██ █     █ ████     
1464.2 | ██ █     ████████  █        ███           ████████ ███ ███ ██ █     █ ███████  
1357.8 |██████  █ ████████  █  ███  ████           ████████████ ███ █████    █████████  
1251.4 |██████████████████████████ ██████       █  ████████████ █████████    ██████████ 
1144.9 |█████████████████████████████████ █ █ ███  ████████████ ██████████   ██████████ 
1038.5 |█████████████████████████████████████ ████ ███████████████████████   ██████████ 
932.0 |███████████████████████████████████████████████████████████████████ ████████████
825.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7947
   1 ms | ██████████  1950
   2 ms | ██  460
   3 ms | █  183
   4 ms |   96
   5 ms |   38
   6 ms |   15
   7 ms |   16
   8 ms |   7
   9 ms |   4
  10 ms |   4
  11 ms |   4
  12 ms |   10
  13 ms |   47
  14 ms |   70
  15 ms |   62
  16 ms |   70
  17 ms |   67
  18 ms |   65
  19 ms |   51
  20 ms |   23
  21 ms |   23
  22 ms |   13
  23 ms |   14
  24 ms |   9
  25 ms |   3
  26 ms |   4
  27 ms |   6
  28 ms |   3
  29 ms |   1
  35 ms |   1
  41 ms |   1
  48 ms |   1
  53 ms |   1
  64 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `42.05`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `52.00`
- `entity_count_delta` = `-48.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preload_duration_ms` = `53.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `26.61`
- `part` = `1.00`
- `fps_harmonic_avg` = `563.14`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23072 ms  |  Sample ticks: 400

**FPS**  avg `2024.17`, min `18.77`, p50 `2043.62`, p95 `3468.95`, p99 `3630.53`, 1%low `49.86`, 0.1%low `33.37`, std `945.86`

**Frame time (ms)**  avg `1.22`, p50 `0.49`, p95 `2.71`, p99 `17.38`, p99.9 `22.41`, max `53.28`

**Client tick (ms)**  avg `0.39`, p95 `0.56`, max `1.80`

**Memory**  start `2993 MB`, end `2653 MB`, peak `4013 MB`, GC `22 events / 247 ms`

**FPS over sampling window (ASCII):**

```
3133.8 |      █  █                                                                      
2947.8 | ██ ████ ███      █                                                             
2761.8 |███████████████  ██                                                             
2575.9 |████████████████ ███  █                                                         
2389.9 |████████████████████  █ █                        █  █        █                  
2203.9 |████████████████████  ████                     ████ ██       █                  
2018.0 |████████████████████ █████ ██     █   █        ████ ███      █                  
1832.0 |██████████████████████████ ███    ██ ███ █ █   ████ ███      █     ██        ██ 
1646.0 |█████████████████████████████████ ████████ ██ █████████      ██  █ ███ ██  █ ██ 
1460.1 |███████████████████████████████████████████████████████  ██ ███ ██████████ █ ███
1274.1 |███████████████████████████████████████████████████████████ ███ ████████████████
1088.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13685
   1 ms | █████  1592
   2 ms | █  402
   3 ms |   88
   4 ms |   51
   5 ms |   10
   6 ms |   1
   7 ms |   5
   8 ms |   1
   9 ms |   1
  11 ms |   3
  12 ms |   53
  13 ms |   96
  14 ms |   79
  15 ms |   92
  16 ms |   75
  17 ms |   71
  18 ms |   45
  19 ms |   32
  20 ms |   20
  21 ms |   5
  22 ms |   7
  23 ms |   3
  24 ms |   4
  25 ms |   2
  26 ms |   1
  40 ms |   1
  44 ms |   1
  50 ms |   1
  53 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preload_chunks` = `61.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.86`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-2.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `45.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `33.37`
- `part` = `1.00`
- `fps_harmonic_avg` = `822.49`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1821.87`, min `19.96`, p50 `2049.48`, p95 `3049.45`, p99 `3448.95`, 1%low `43.98`, 0.1%low `30.39`, std `830.31`

**Frame time (ms)**  avg `1.43`, p50 `0.49`, p95 `4.40`, p99 `19.57`, p99.9 `24.73`, max `50.09`

**Client tick (ms)**  avg `0.47`, p95 `1.13`, max `6.90`

**Memory**  start `3523 MB`, end `3996 MB`, peak `4276 MB`, GC `14 events / 170 ms`

**FPS over sampling window (ASCII):**

```
2514.7 |                                              █                                 
2408.2 |                                   █ █ ██     █                                 
2301.7 |                                ██ █ █ ██     ██      █                         
2195.1 |                                ██ ███ ██  █  ██      █                         
2088.6 |                             █ ███ ███ ███ █  ██      █             █ █   ███   
1982.1 |                             █ ███████████ █  ██  █ ████            █ █   ███   
1875.6 |                           █ █ █████████████  ██  █ ████      █ █ ██████  ███   
1769.1 | ███         ██            ███ ██████████████ ███ ██████ █  ██████████████████ █
1662.6 | ███ █       ██    █ ██ ██ ███ █████████████████████████ █  ████████████████████
1556.1 | ███ █  ██ █ ███  ██ █████ ███ █████████████████████████ ██ ████████████████████
1449.6 |██████ ███████████████████ █████████████████████████████ ███████████████████████
1343.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11033
   1 ms | ██████  1550
   2 ms | █  392
   3 ms | █  239
   4 ms | █  139
   5 ms |   61
   6 ms |   23
   7 ms |   19
   8 ms |   15
   9 ms |   7
  10 ms |   7
  11 ms |   1
  12 ms |   3
  13 ms |   17
  14 ms |   36
  15 ms |   57
  16 ms |   67
  17 ms |   62
  18 ms |   80
  19 ms |   38
  20 ms |   40
  21 ms |   37
  22 ms |   27
  23 ms |   12
  24 ms |   4
  25 ms |   1
  26 ms |   1
  27 ms |   3
  28 ms |   1
  29 ms |   2
  31 ms |   1
  33 ms |   1
  35 ms |   1
  43 ms |   2
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `699.39`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `30.39`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `58.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `43.98`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `176.17`, min `15.11`, p50 `201.03`, p95 `290.65`, p99 `315.43`, 1%low `24.07`, 0.1%low `17.08`, std `85.96`

**Frame time (ms)**  avg `8.85`, p50 `4.97`, p95 `22.18`, p99 `35.10`, p99.9 `48.11`, max `66.19`

**Client tick (ms)**  avg `4.33`, p95 `12.01`, max `19.77`

**Memory**  start `2869 MB`, end `3919 MB`, peak `4291 MB`, GC `16 events / 131 ms`

**FPS over sampling window (ASCII):**

```
242.2 |                                            █                                   
230.2 |                                            █     █                             
218.3 |                       █                 █  █     █               █  █          
206.4 |                       █  █              █ ██  █  █               █ ██          
194.5 |     █             █   █ ██         █ █  ████████ █        █    ██████  █ █     
182.6 |  █  ███     █    ██ ██████  █  █ ███ █████████████       ██  █ ██████ ██ ██    
170.6 |████ ███ ██  █    █████████  █  █ ██████████████████    █ ████████████ █████    
158.7 |███████████████ ███████████ ██  █ ██████████████████    █ ████████████ █████    
146.8 |██████████████████████████████  █ ██████████████████    ████████████████████   █
134.9 |██████████████████████████████ ██ ████████████████████  █████████████████████ ██
123.0 |█████████████████████████████████ ██████████████████████████████████████████████
111.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   4
   3 ms | █████████████████████████████████  514
   4 ms | ████████████████████████████████████████  627
   5 ms | ████████████████  258
   6 ms | ██████  89
   7 ms | █████  73
   8 ms | ███  45
   9 ms | ██  37
  10 ms | █  16
  11 ms | █  14
  12 ms |   5
  13 ms | █  12
  14 ms | ███  42
  15 ms | ███  50
  16 ms | ███  51
  17 ms | █████  72
  18 ms | █████  76
  19 ms | █████  71
  20 ms | ███  45
  21 ms | ███  40
  22 ms | █  21
  23 ms | █  19
  24 ms | █  12
  25 ms |   6
  26 ms | █  8
  27 ms |   6
  28 ms |   3
  29 ms |   4
  30 ms |   1
  32 ms |   3
  33 ms |   6
  34 ms |   5
  35 ms |   6
  36 ms |   2
  37 ms |   2
  38 ms |   1
  39 ms |   2
  40 ms |   4
  41 ms |   1
  43 ms |   2
  45 ms |   2
  48 ms |   1
  50 ms |   1
  66 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `113.01`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `17.08`
- `fps_1pct_low` = `24.07`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `64.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `2315.37`, min `14.48`, p50 `2410.33`, p95 `3670.95`, p99 `3801.30`, 1%low `47.20`, 0.1%low `28.03`, std `1070.52`

**Frame time (ms)**  avg `1.17`, p50 `0.41`, p95 `2.86`, p99 `16.77`, p99.9 `25.42`, max `69.07`

**Client tick (ms)**  avg `0.46`, p95 `0.95`, max `13.75`

**Memory**  start `2452 MB`, end `2992 MB`, peak `4277 MB`, GC `7 events / 73 ms`

**FPS over sampling window (ASCII):**

```
3475.1 |                                                                █ █  █ ███      
3265.3 |                                                                ███████████     
3055.5 |                                                               ████████████ ████
2845.6 |             █           █                                     █████████████████
2635.8 |            ███    █  █  ███   ██                             ██████████████████
2426.0 |            ███   ██  ██ ████████ █                       █   ██████████████████
2216.2 |            ████  █████████████████         █ █     █  █  ██ ███████████████████
2006.4 |       ██ ███████ █████████████████         ███  ██ ████████████████████████████
1796.6 |███ █ ███ █████████████████████████         ████████████████████████████████████
1586.8 |███ █ █████████████████████████████ ██    ██████████████████████████████████████
1377.0 |███████████████████████████████████ ████ ███████████████████████████████████████
1167.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14192
   1 ms | █████  1813
   2 ms | █  315
   3 ms |   117
   4 ms |   75
   5 ms |   13
   6 ms |   13
   7 ms |   11
   8 ms |   13
   9 ms |   2
  11 ms |   2
  12 ms |   53
  13 ms |   118
  14 ms |   120
  15 ms |   82
  16 ms |   62
  17 ms |   28
  18 ms |   29
  19 ms |   35
  20 ms |   19
  21 ms |   12
  22 ms |   8
  23 ms |   6
  24 ms |   5
  25 ms |   4
  26 ms |   2
  27 ms |   2
  29 ms |   1
  30 ms |   1
  31 ms |   3
  32 ms |   1
  45 ms |   1
  46 ms |   1
  48 ms |   1
  51 ms |   1
  69 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `47.20`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `47.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `28.03`
- `part` = `1.00`
- `fps_harmonic_avg` = `858.17`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 24700 ms  |  Sample ticks: 400

**FPS**  avg `2315.37`, min `14.48`, p50 `2410.33`, p95 `3670.95`, p99 `3801.30`, 1%low `47.20`, 0.1%low `28.03`, std `1070.52`

**Frame time (ms)**  avg `1.17`, p50 `0.41`, p95 `2.86`, p99 `16.77`, p99.9 `25.42`, max `69.07`

**Client tick (ms)**  avg `0.46`, p95 `0.95`, max `13.75`

**Memory**  start `2452 MB`, end `2992 MB`, peak `4277 MB`, GC `7 events / 73 ms`

**FPS over sampling window (ASCII):**

```
3475.1 |                                                                █ █  █ ███      
3265.3 |                                                                ███████████     
3055.5 |                                                               ████████████ ████
2845.6 |             █           █                                     █████████████████
2635.8 |            ███    █  █  ███   ██                             ██████████████████
2426.0 |            ███   ██  ██ ████████ █                       █   ██████████████████
2216.2 |            ████  █████████████████         █ █     █  █  ██ ███████████████████
2006.4 |       ██ ███████ █████████████████         ███  ██ ████████████████████████████
1796.6 |███ █ ███ █████████████████████████         ████████████████████████████████████
1586.8 |███ █ █████████████████████████████ ██    ██████████████████████████████████████
1377.0 |███████████████████████████████████ ████ ███████████████████████████████████████
1167.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14192
   1 ms | █████  1813
   2 ms | █  315
   3 ms |   117
   4 ms |   75
   5 ms |   13
   6 ms |   13
   7 ms |   11
   8 ms |   13
   9 ms |   2
  11 ms |   2
  12 ms |   53
  13 ms |   118
  14 ms |   120
  15 ms |   82
  16 ms |   62
  17 ms |   28
  18 ms |   29
  19 ms |   35
  20 ms |   19
  21 ms |   12
  22 ms |   8
  23 ms |   6
  24 ms |   5
  25 ms |   4
  26 ms |   2
  27 ms |   2
  29 ms |   1
  30 ms |   1
  31 ms |   3
  32 ms |   1
  45 ms |   1
  46 ms |   1
  48 ms |   1
  51 ms |   1
  69 ms |   1
```

**Extras:**

- `fail_reason` = `user pressed Shift+ESC`
- `status` = `failed`
- `aborted_state` = `DISCONNECTING`
- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `47.20`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `47.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `28.03`
- `part` = `1.00`
- `fps_harmonic_avg` = `858.17`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`

