# MC Benchmark Core session — 2026-10-02T16:05:36.587680576+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1775.9 | 152.4 | 51.2 | 3.50 | 1.18 | 59 | 1931 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 1276.5 | 134.0 | 48.9 | 4.01 | 1.05 | 57 | 2519 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 1075.8 | 130.7 | 50.1 | 4.07 | 0.99 | 52 | 2029 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 711.8 | 85.2 | 46.9 | 6.82 | 1.14 | 86 | 1430 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 1201.7 | 131.8 | 60.0 | 4.15 | 0.99 | 82 | 583 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 1146.0 | 118.8 | 57.5 | 4.82 | 0.81 | 83 | 1287 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 1084.3 | 133.0 | 46.5 | 3.80 | 0.99 | 44 | 515 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 573.0 | 76.4 | 36.8 | 6.87 | 1.83 | 57 | 2568 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1384.5 | 103.7 | 46.5 | 6.02 | 4.82 | 74 | 1437 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 290.9 | 67.9 | 48.3 | 12.20 | 4.99 | 39 | 364 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 625.8 | 88.2 | 57.4 | 7.61 | 1.43 | 106 | 1328 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 627.3 | 95.3 | 46.2 | 6.15 | 0.87 | 49 | 1027 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 889.1 | 77.6 | 42.4 | 8.29 | 4.79 | 34 | 413 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 993.4 | 80.3 | 46.3 | 8.52 | 4.31 | 46 | 1456 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1589.4 | 22.0 | 13.0 | 37.11 | 17.94 | 30 | 1530 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1646.0 | 19.0 | 11.4 | 41.86 | 19.07 | 29 | 1443 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1600.6 | 117.1 | 52.9 | 5.05 | 2.88 | 78 | 327 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1588.6 | 104.7 | 49.4 | 5.66 | 3.01 | 70 | 1347 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 849.4 | 104.7 | 48.0 | 5.15 | 0.92 | 70 | 1234 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 2061.8 | 164.0 | 53.7 | 3.35 | 0.46 | 57 | 910 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 2274.9 | 190.6 | 62.5 | 2.97 | 0.39 | 50 | 1424 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1951.4 | 125.5 | 39.2 | 4.34 | 0.49 | 41 | 1202 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1922.9 | 143.5 | 34.8 | 3.09 | 0.43 | 39 | 1848 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 998.9 | 155.3 | 61.6 | 3.94 | 0.46 | 26 | 1448 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 748.3 | 148.1 | 58.3 | 4.34 | 0.37 | 22 | 1221 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 875.5 | 150.2 | 56.6 | 4.13 | 0.34 | 19 | 2379 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 834.5 | 161.2 | 58.7 | 3.75 | 0.38 | 18 | 1855 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 837.3 | 147.9 | 53.9 | 4.06 | 0.41 | 16 | 726 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 817.5 | 160.4 | 55.1 | 3.89 | 0.36 | 16 | 2097 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 887.9 | 177.3 | 62.8 | 3.49 | 0.38 | 14 | 1142 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 786.5 | 156.9 | 58.3 | 4.04 | 0.33 | 15 | 520 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 791.7 | 156.9 | 52.7 | 3.86 | 0.53 | 15 | 584 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 891.6 | 176.8 | 60.3 | 3.30 | 0.27 | 15 | 574 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 802.1 | 148.9 | 53.9 | 4.05 | 0.36 | 13 | 1873 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 895.1 | 164.8 | 59.7 | 3.67 | 0.35 | 15 | 1069 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1588.2 | 196.7 | 51.4 | 2.42 | 0.39 | 28 | 2886 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 174.0 | 32.0 | 26.2 | 23.30 | 6.49 | 26 | 3830 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1533.5 | 188.2 | 47.5 | 2.51 | 0.44 | 28 | 1619 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1529.2 | 198.5 | 52.2 | 2.43 | 0.50 | 27 | 916 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1338.7 | 164.6 | 42.6 | 3.00 | 0.47 | 28 | 213 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1201.7 | 164.3 | 39.1 | 2.83 | 0.43 | 29 | 3008 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 227.7 | 34.8 | 10.7 | 15.26 | 1.06 | 160 | 3840 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 239.6 | 110.3 | 76.4 | 8.18 | 0.74 | 31 | 668 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 108.2 | 61.8 | 32.8 | 12.49 | 0.73 | 25 | 3040 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 88.5 | 43.8 | 20.8 | 16.55 | 0.72 | 25 | 1012 |

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

Category: **Particles**  |  Duration: 23134 ms  |  Sample ticks: 400

**FPS**  avg `1775.87`, min `37.82`, p50 `1783.50`, p95 `2425.34`, p99 `2748.44`, 1%low `152.39`, 0.1%low `51.18`, std `470.46`

**Frame time (ms)**  avg `0.69`, p50 `0.56`, p95 `1.27`, p99 `3.50`, p99.9 `14.74`, max `26.44`

**Client tick (ms)**  avg `1.18`, p95 `3.10`, max `17.45`

**Memory**  start `1074 MB`, end `2271 MB`, peak `3006 MB`, GC `59 events / 626 ms`

**FPS over sampling window (ASCII):**

```
2310.7 |                                                            █                   
2222.0 |                                                            █     █             
2133.2 |                                         █     █  █ ████    ██    ███           
2044.5 |                                         █  █ ██ ███████ ██████ █ ████          
1955.7 |                                         ██ ████████████ █████████████          
1867.0 |                                  █      ██ ██████████████████████████          
1778.2 |     █                           ██  █ ███████████████████████████████ █  █     
1689.5 |  █  ██  █              █  ███   █████ ███████████████████████████████ ██ █  █  
1600.7 | ██ ████ ██     ██      ██████ ███████████████████████████████████████████████  
1512.0 |███ ███████ ██████  ████████████████████████████████████████████████████████████
1423.3 |██████████████████ █████████████████████████████████████████████████████████████
1334.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19710
   1 ms | █  658
   2 ms | █  313
   3 ms |   182
   4 ms |   61
   5 ms |   21
   6 ms |   7
   7 ms |   7
   8 ms |   5
   9 ms |   3
  10 ms |   4
  11 ms |   2
  12 ms |   2
  13 ms |   1
  14 ms |   5
  16 ms |   2
  17 ms |   1
  18 ms |   5
  19 ms |   3
  20 ms |   2
  21 ms |   2
  22 ms |   1
  23 ms |   1
  24 ms |   1
  26 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 2625 | 1606.3 | 3.47 |
| `dragon_breath` | 160 | 2625 | 1504.3 | 3.99 |
| `dripping_water` | 240 | 2625 | 1616.0 | 3.48 |
| `flame` | 160 | 2625 | 1698.4 | 3.20 |
| `smoke` | 160 | 2625 | 2000.2 | 3.09 |
| `sculk_charge_pop` | 240 | 2625 | 2062.8 | 3.35 |
| `ALL_TOGETHER` | 1680 | 2625 | 2082.7 | 2.75 |
| `portal` | 160 | 2625 | 1636.3 | 3.94 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `1452.24`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `2.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `152.39`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `51.18`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `1276.48`, min `38.92`, p50 `1351.86`, p95 `1579.40`, p99 `1973.55`, 1%low `133.96`, 0.1%low `48.91`, std `305.99`

**Frame time (ms)**  avg `0.92`, p50 `0.74`, p95 `1.88`, p99 `4.01`, p99.9 `17.46`, max `25.70`

**Client tick (ms)**  avg `1.05`, p95 `1.56`, max `11.68`

**Memory**  start `754 MB`, end `2166 MB`, peak `3273 MB`, GC `57 events / 624 ms`

**FPS over sampling window (ASCII):**

```
1419.7 |                    █       █             █                                    █
1382.8 |                    █       █          █  █           █                    █   █
1345.9 |        █           ██      █   █    ██████     █   █ █    ███          █ ██ █ █
1308.9 |       ██   █    █  ██      ██████  ████████    ███ ███ ██ ███ █  █    ██ ██████
1272.0 | █     ███  █ ████  ███     ██████  ██████████  ██████████████ █  █   ██████████
1235.0 |██     ██████ ████ ██████ ████████  ██████████ ███████████████ █████ ███████████
1198.1 |██    ███████ ████ ██████ ██████████████████████████████████████████████████████
1161.1 |██ █  ███████ ████ ██████ ██████████████████████████████████████████████████████
1124.2 |██ █  ███████ ███████████ ██████████████████████████████████████████████████████
1087.2 |██ ██ ███████ ███████████ ██████████████████████████████████████████████████████
1050.3 |█████████████ ███████████ ██████████████████████████████████████████████████████
1013.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18367
   1 ms | ████  1687
   2 ms | █  459
   3 ms | █  272
   4 ms |   111
   5 ms |   36
   6 ms |   15
   7 ms |   4
   8 ms |   6
   9 ms |   1
  10 ms |   3
  11 ms |   4
  12 ms |   3
  13 ms |   1
  14 ms |   3
  15 ms |   3
  16 ms |   2
  17 ms |   3
  18 ms |   6
  19 ms |   5
  20 ms |   2
  21 ms |   1
  22 ms |   4
  24 ms |   1
  25 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `51.00`
- `fps_harmonic_avg` = `1081.29`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `48.91`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `133.96`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `1075.78`, min `42.10`, p50 `1118.93`, p95 `1479.46`, p99 `1754.20`, 1%low `130.71`, 0.1%low `50.07`, std `264.49`

**Frame time (ms)**  avg `1.07`, p50 `0.89`, p95 `2.00`, p99 `4.07`, p99.9 `18.11`, max `23.76`

**Client tick (ms)**  avg `0.99`, p95 `1.53`, max `16.64`

**Memory**  start `1351 MB`, end `1587 MB`, peak `3381 MB`, GC `52 events / 628 ms`

**FPS over sampling window (ASCII):**

```
1381.6 |█                                                                               
1327.1 |█                                                                               
1272.6 |█                                                                               
1218.0 |██                                                                              
1163.5 |██                        █                █       ██                           
1109.0 |██ █  ████ ██         █  ██  ███  ██ █  ██ ███ █ █ ████    █     █ ████ ██      
1054.5 |██ ███████ ██   █   ██████████████████████████████████████ ██████████████████   
999.9 |██████████ ██████   ██████████████████████████████████████████████████████████ █
945.4 |██████████ ██████ ██████████████████████████████████████████████████████████████
890.9 |█████████████████ ██████████████████████████████████████████████████████████████
836.4 |█████████████████ ██████████████████████████████████████████████████████████████
781.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13899
   1 ms | ███████████  3807
   2 ms | █  468
   3 ms | █  269
   4 ms |   103
   5 ms |   35
   6 ms |   10
   7 ms |   7
   8 ms |   2
   9 ms |   1
  10 ms |   3
  11 ms |   2
  13 ms |   1
  14 ms |   1
  15 ms |   2
  16 ms |   7
  17 ms |   3
  18 ms |   8
  19 ms |   3
  20 ms |   5
  21 ms |   2
  23 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `52.00`
- `fps_harmonic_avg` = `931.97`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `50.07`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `130.71`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `711.84`, min `37.67`, p50 `755.93`, p95 `929.48`, p99 `1108.30`, 1%low `85.18`, 0.1%low `46.91`, std `194.35`

**Frame time (ms)**  avg `1.67`, p50 `1.32`, p95 `3.47`, p99 `6.82`, p99.9 `17.54`, max `26.55`

**Client tick (ms)**  avg `1.14`, p95 `1.87`, max `14.69`

**Memory**  start `830 MB`, end `1175 MB`, peak `2261 MB`, GC `86 events / 712 ms`

**FPS over sampling window (ASCII):**

```
881.6 |                                            █                                   
847.0 |                        █                   █                                   
812.4 |   █    █               █                 █ █                                   
777.8 |   █    ██     █   ██   ██    █       █   ████   █         █    █               
743.1 |█  ██ ████     ██ ████  ██ █  █     █ ██ ██████  ██    █   ████ █ █    █    █   
708.5 |██ ███████   █ ██ █████ ████  █ █  █████████████ ██   ██   █████████   █    ██  
673.9 |███████████ ███████████ ████ ████ ██████████████████  ███████████████  █    ██  
639.3 |█████████████████████████████████ ██████████████████ ████████████████ ██  ████  
604.6 |█████████████████████████████████ ██████████████████ ████████████████ █████████ 
570.0 |█████████████████████████████████ ██████████████████ ██████████████████████████ 
535.4 |████████████████████████████████████████████████████ ██████████████████████████ 
500.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  253
   1 ms | ████████████████████████████████████████  10121
   2 ms | ███  849
   3 ms | █  321
   4 ms | █  184
   5 ms |   109
   6 ms |   43
   7 ms |   25
   8 ms |   13
   9 ms |   11
  10 ms |   7
  11 ms |   10
  12 ms |   6
  13 ms |   10
  14 ms |   7
  15 ms |   6
  16 ms |   4
  17 ms |   3
  18 ms |   4
  19 ms |   2
  20 ms |   1
  21 ms |   1
  24 ms |   2
  25 ms |   1
  26 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `52.00`
- `fps_harmonic_avg` = `599.62`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `46.91`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `85.18`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1201.73`, min `36.29`, p50 `1259.59`, p95 `1564.31`, p99 `1877.52`, 1%low `131.80`, 0.1%low `60.01`, std `285.79`

**Frame time (ms)**  avg `0.97`, p50 `0.79`, p95 `1.87`, p99 `4.15`, p99.9 `14.00`, max `27.56`

**Client tick (ms)**  avg `0.99`, p95 `1.60`, max `6.23`

**Memory**  start `1861 MB`, end `2061 MB`, peak `2445 MB`, GC `82 events / 679 ms`

**FPS over sampling window (ASCII):**

```
1376.3 |                  █                                                             
1339.3 |          █   ██  ██         █                                   █         █    
1302.3 |        █ █  ███  ██         █                                  ██         █    
1265.3 |█  ███  ███ ████  ███    █   █ ██  █           █   █            ██     █   █    
1228.3 |█  ███  ███ ████ █████   █   █ ██  ██    █     ██  ███   ██   █ ██  ████  ██   █
1191.4 |█ ████ ████ ████████████ ██  █ ██ ███ █  █   █ ██  ███  ████  █ ██  ████  ██ █ █
1154.4 |█ █████████████████████████  ████ ███ ██ █   ██████████ ████ █████  ████ ███ ███
1117.4 |███████████████████████████ █████ ██████ ███ ███████████████ █████  ████ ███ ███
1080.4 |███████████████████████████ █████ ██████ ███ ███████████████ █████ █████ ███ ███
1043.5 |████████████████████████████████████████████ ███████████████████████████ ███████
1006.5 |████████████████████████████████████████████████████████████████████████ ███████
969.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17555
   1 ms | █████  2113
   2 ms | █  452
   3 ms | █  236
   4 ms |   98
   5 ms |   45
   6 ms |   9
   7 ms |   10
   8 ms |   4
   9 ms |   6
  10 ms |   7
  11 ms |   6
  12 ms |   7
  13 ms |   11
  14 ms |   5
  15 ms |   5
  16 ms |   7
  18 ms |   2
  20 ms |   1
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `76.00`
- `fps_harmonic_avg` = `1029.01`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `60.01`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `131.80`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1146.05`, min `44.91`, p50 `1218.19`, p95 `1437.00`, p99 `1835.18`, 1%low `118.82`, 0.1%low `57.55`, std `294.37`

**Frame time (ms)**  avg `1.05`, p50 `0.82`, p95 `2.14`, p99 `4.82`, p99.9 `14.54`, max `22.27`

**Client tick (ms)**  avg `0.81`, p95 `1.32`, max `4.91`

**Memory**  start `1032 MB`, end `1254 MB`, peak `2319 MB`, GC `83 events / 686 ms`

**FPS over sampling window (ASCII):**

```
1279.7 |  █            █                                                        █    █  
1251.4 | ██            █     █                            █              █      █    █  
1223.2 | ██    █    █  █    ██   █     █          █       ██             █      █   ██  
1195.0 | ███   █ █  █ ███  ███   █ █   █ ██ ██    █       ██  █     █    █      █   ██  
1166.7 | ███   ███  █ ███  ███   █ █  ██ ███████  ██     ███  █     █    ██     █   ██  
1138.5 | ███  █████ ██████ ███   █ █  ██████████ █████   ███  ██ █  █ █  ██  ██ █  ███  
1110.3 |████  ████████████ ███████ █  ████████████████  ████  ██ █  █ █ ███ █████  ███  
1082.1 |████  ██████████████████████ █████████████████  ████████ █  ██████████████ ████ 
1053.8 |█████ ██████████████████████ ███████████████████████████ █  ███████████████████ 
1025.6 |██████████████████████████████████████████████████████████ ████████████████████ 
997.4 |██████████████████████████████████████████████████████████ █████████████████████
969.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15385
   1 ms | ███████  2665
   2 ms | █  517
   3 ms | █  256
   4 ms |   134
   5 ms |   63
   6 ms |   28
   7 ms |   13
   8 ms |   5
   9 ms |   3
  10 ms |   9
  11 ms |   9
  12 ms |   9
  13 ms |   8
  14 ms |   7
  15 ms |   4
  16 ms |   4
  17 ms |   2
  18 ms |   4
  19 ms |   1
  20 ms |   1
  22 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `956.40`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `57.55`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `118.82`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1084.29`, min `32.54`, p50 `1131.66`, p95 `1438.61`, p99 `1695.70`, 1%low `132.95`, 0.1%low `46.49`, std `247.91`

**Frame time (ms)**  avg `1.05`, p50 `0.88`, p95 `1.90`, p99 `3.80`, p99.9 `18.43`, max `30.73`

**Client tick (ms)**  avg `0.99`, p95 `1.46`, max `19.11`

**Memory**  start `2850 MB`, end `1846 MB`, peak `3366 MB`, GC `44 events / 651 ms`

**FPS over sampling window (ASCII):**

```
1244.3 |            █                                                                   
1215.1 |            █                  █                                                
1186.0 |            █                  █                                            █   
1156.9 |            █   █          █   █        █            █ ██     ██          █ █   
1127.8 |█      █   ████ █ ███      █ █ █   █    ███          ████ ██ ███      █ █ █ █   
1098.6 |█  █   █  █████ █████ ██   █████  ██ █  ███    █  █  ████ ██ ███      ███████ █ 
1069.5 |█  █   █ ███████████████   ██████ ██ █  █████  █ ██  ████████████     ██████████
1040.4 |█████  █████████████████ █ ███████████  █████  █ ██  ████████████ █  ███████████
1011.3 |██████ █████████████████ █ ████████████ █████  █████ ████████████ █ ████████████
982.1 |███████████████████████████████████████ ████████████ ██████████████ ████████████
953.0 |███████████████████████████████████████ ████████████ ██████████████ ████████████
923.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14507
   1 ms | ██████████  3688
   2 ms | █  418
   3 ms | █  244
   4 ms |   75
   5 ms |   32
   6 ms |   7
   7 ms |   1
   8 ms |   1
  14 ms |   3
  15 ms |   2
  16 ms |   4
  17 ms |   6
  18 ms |   6
  19 ms |   6
  20 ms |   1
  21 ms |   3
  22 ms |   4
  23 ms |   2
  30 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `62.00`
- `fps_harmonic_avg` = `950.58`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `46.49`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `132.95`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `573.03`, min `30.12`, p50 `596.65`, p95 `754.90`, p99 `981.34`, 1%low `76.45`, 0.1%low `36.84`, std `159.56`

**Frame time (ms)**  avg `2.04`, p50 `1.68`, p95 `4.06`, p99 `6.87`, p99.9 `21.08`, max `33.20`

**Client tick (ms)**  avg `1.83`, p95 `2.97`, max `15.67`

**Memory**  start `1384 MB`, end `3557 MB`, peak `3952 MB`, GC `57 events / 656 ms`

**FPS over sampling window (ASCII):**

```
718.8 |             █                                                                  
690.8 |             █                                        █              █          
662.9 |   █         █ █                           █        █ █              █    █     
634.9 |   ██   █    ███   █      █     █         ██        █ █          █ ███ ██ █ █   
606.9 |   ███  ██   ███   ██     ███   █         ██      █ █ █       █  █ ██████████  █
579.0 |   ███  ██   ███   ██  █  ███  ██  █  █   ██  ██  ███ █   █ █ ██ ████████████  █
551.0 | █████ █████ ████  ██  ██ ███  ███ █  █   ██████  █████   ██████ ████████████  █
523.0 |█████████████████  █████████████████  █ █ ██████  ██████ ████████████████████ ██
495.1 |████████████████████████████████████████████████  ██████ ████████████████████ ██
467.1 |████████████████████████████████████████████████  ██████████████████████████████
439.1 |████████████████████████████████████████████████ ███████████████████████████████
411.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   88
   1 ms | ████████████████████████████████████████  7384
   2 ms | ███████  1349
   3 ms | ███  487
   4 ms | █  247
   5 ms | █  116
   6 ms |   58
   7 ms |   22
   8 ms |   17
   9 ms |   2
  10 ms |   5
  11 ms |   5
  12 ms |   2
  13 ms |   2
  14 ms |   3
  15 ms |   7
  16 ms |   7
  17 ms |   5
  18 ms |   1
  19 ms |   2
  20 ms |   3
  21 ms |   4
  25 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
  33 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `23.00`
- `fps_harmonic_avg` = `491.15`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `36.84`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `76.45`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `1384.51`, min `26.53`, p50 `1461.04`, p95 `1817.29`, p99 `2208.73`, 1%low `103.65`, 0.1%low `46.54`, std `358.75`

**Frame time (ms)**  avg `0.93`, p50 `0.68`, p95 `1.93`, p99 `6.02`, p99.9 `16.67`, max `37.69`

**Client tick (ms)**  avg `4.82`, p95 `6.74`, max `24.50`

**Memory**  start `1199 MB`, end `1808 MB`, peak `2637 MB`, GC `74 events / 684 ms`

**FPS over sampling window (ASCII):**

```
1576.2 |              █                                                                 
1537.8 |              █                                         █                       
1499.4 |        █    ██              █    █                     █    █    █   █         
1461.0 | ██     █  ████       █      █ █  █     █ █       █     ██   █    █ █ █  █     █
1422.7 |███     ██ ████  ███ ██      █ █ ██ █   ███ █    ██     ██   █ █ ██ █ █  █ ██  █
1384.3 |███     ███████ ████ ██ █ █  ███ ██ ██  ███ █   ███  █ ███  ████ ██ █ ██ █████ █
1345.9 |████    ███████ █████████ █ ████ █████  █████   ███  █████  ████ █████████████ █
1307.5 |████   ████████████████████ ██████████  █████ ██████ █████ █████ █████████████ █
1269.1 |█████  ████████████████████ █████████████████ ██████ █████ █████████████████████
1230.7 |█████████████████████████████████████████████ ██████ ███████████████████████████
1192.3 |████████████████████████████████████████████████████ ███████████████████████████
1154.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18928
   1 ms | ██  1053
   2 ms | █  304
   3 ms |   186
   4 ms |   110
   5 ms |   204
   6 ms |   88
   7 ms |   37
   8 ms |   15
   9 ms |   16
  10 ms |   9
  11 ms |   5
  12 ms |   8
  13 ms |   5
  14 ms |   5
  15 ms |   5
  16 ms |   2
  17 ms |   2
  18 ms |   4
  19 ms |   4
  20 ms |   1
  21 ms |   2
  22 ms |   3
  23 ms |   1
  25 ms |   1
  30 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `53.00`
- `fps_harmonic_avg` = `1074.72`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `46.54`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `103.65`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `290.88`, min `41.83`, p50 `296.39`, p95 `422.39`, p99 `464.78`, 1%low `67.91`, 0.1%low `48.29`, std `91.19`

**Frame time (ms)**  avg `4.00`, p50 `3.37`, p95 `8.67`, p99 `12.20`, p99.9 `18.00`, max `23.91`

**Client tick (ms)**  avg `4.99`, p95 `6.96`, max `11.02`

**Memory**  start `2052 MB`, end `1220 MB`, peak `2416 MB`, GC `39 events / 209 ms`

**FPS over sampling window (ASCII):**

```
385.1 |                                       ██ █                                     
366.1 |                                       █████ ██                                 
347.1 |                                       █████████      █               █ ██ ███  
328.1 |  █                                   ███████████    ███ █ █ ████ █████████████ 
309.2 |  █                                   ████████████ █████ █ ██████ ██████████████
290.2 |  █ █          █         █         █  ████████████████████ █████████████████████
271.2 | ████         ██   █    ███     █  █  ██████████████████████████████████████████
252.2 | ████  ██ ██████   █    ███   █ █  █ ███████████████████████████████████████████
233.2 |█████████████████  ████████  ██ █  █ ███████████████████████████████████████████
214.3 |█████████████████  █████████ ██ █  █ ███████████████████████████████████████████
195.3 |█████████████████ █████████████ ████████████████████████████████████████████████
176.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   6
   2 ms | ████████████████████████████████████████  1755
   3 ms | ███████████████████████████████████████  1704
   4 ms | ██████████████████  775
   5 ms | █████  211
   6 ms | ██  91
   7 ms | ███  117
   8 ms | ███  127
   9 ms | ██  71
  10 ms | █  50
  11 ms | █  28
  12 ms | █  26
  13 ms |   10
  14 ms |   5
  15 ms |   6
  16 ms |   3
  17 ms |   4
  18 ms |   2
  20 ms |   1
  22 ms |   1
  23 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `249.70`
- `preload_duration_ms` = `49.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `48.29`
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
- `fps_1pct_low` = `67.91`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `625.76`, min `46.71`, p50 `665.14`, p95 `835.84`, p99 `1012.62`, 1%low `88.17`, 0.1%low `57.44`, std `175.76`

**Frame time (ms)**  avg `1.89`, p50 `1.50`, p95 `4.00`, p99 `7.61`, p99.9 `15.46`, max `21.41`

**Client tick (ms)**  avg `1.43`, p95 `2.25`, max `11.41`

**Memory**  start `1043 MB`, end `1742 MB`, peak `2372 MB`, GC `106 events / 704 ms`

**FPS over sampling window (ASCII):**

```
749.9 | █                                                                              
722.8 | █                     █   █                          ██                        
695.7 |██  █              █   █  ██                 █   █    ██        ███             
668.6 |██  █    █    ██   █   ██ ██        ██       █   ██  ███      █████  ██    ██   
641.6 |███ █    █    ██   █   ██ ███  █    ██ █ █   ██  ██  ███  ██  █████  ███   ███ █
614.5 |███████  █    ██  ███████ ███ ██    ██████  ███ ███  ███ ███  ██████ ███  ██████
587.4 |███████  █ █  ███ ███████ ███ ██  █████████ ███████  ███ ███████████████  ██████
560.3 |██████████ █  ███ ███████████████ ██████████████████ ███████████████████  ██████
533.3 |████████████ ████████████████████ ██████████████████ ███████████████████████████
506.2 |████████████ ████████████████████ ██████████████████ ███████████████████████████
479.1 |████████████ ███████████████████████████████████████████████████████████████████
452.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  124
   1 ms | ████████████████████████████████████████  8509
   2 ms | █████  1005
   3 ms | ██  440
   4 ms | █  216
   5 ms | █  134
   6 ms |   61
   7 ms |   17
   8 ms |   18
   9 ms |   20
  10 ms |   14
  11 ms |   17
  12 ms |   11
  13 ms |   8
  14 ms |   2
  15 ms |   4
  16 ms |   4
  17 ms |   2
  18 ms |   2
  21 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `50.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `152.00`
- `entity_count_sample_end` = `152.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `57.44`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `530.45`
- `fps_1pct_low` = `88.17`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `627.25`, min `34.75`, p50 `595.69`, p95 `1141.73`, p99 `1212.67`, 1%low `95.29`, 0.1%low `46.21`, std `230.19`

**Frame time (ms)**  avg `1.90`, p50 `1.68`, p95 `3.81`, p99 `6.15`, p99.9 `18.47`, max `28.78`

**Client tick (ms)**  avg `0.87`, p95 `1.99`, max `4.61`

**Memory**  start `2022 MB`, end `2072 MB`, peak `3049 MB`, GC `49 events / 474 ms`

**FPS over sampling window (ASCII):**

```
1079.2 |                                                                      █         
1017.7 |                                                      █               █ █       
956.2 |                                                      █               ████      
894.7 |                                              █      ██    █         █████      
833.2 |                                █             █      ██    ██      ███████      
771.7 |                                █             █  █   ██    ██      ███████      
710.2 |                                █   █ █       ██ █   ████  ██      ███████      
648.7 |                            █   █ █ █ ██      █████ ██████ ██   ████████████  █ 
587.2 |         █    █ █  ██    ██ █████████████    ██████ ██████ ██   █████████████ ██
525.7 |███  █   ██ █ ███████ █████████████████████████████ ██████████  █████████████ ██
464.2 |███ ███ ███████████████████████████████████████████████████████ ████████████████
402.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████  1087
   1 ms | ████████████████████████████████████████  6787
   2 ms | ███████████  1811
   3 ms | ██  361
   4 ms | █  233
   5 ms | █  113
   6 ms |   43
   7 ms |   21
   8 ms |   11
   9 ms |   8
  10 ms |   7
  11 ms |   3
  12 ms |   1
  14 ms |   2
  15 ms |   3
  16 ms |   3
  17 ms |   4
  18 ms |   4
  19 ms |   2
  20 ms |   2
  21 ms |   1
  23 ms |   3
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `525.58`
- `preload_duration_ms` = `54.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `46.21`
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
- `fps_1pct_low` = `95.29`
- `neighbour_updates` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `889.13`, min `31.07`, p50 `955.30`, p95 `1315.55`, p99 `1496.12`, 1%low `77.61`, 0.1%low `42.37`, std `304.55`

**Frame time (ms)**  avg `1.46`, p50 `1.05`, p95 `3.14`, p99 `8.29`, p99.9 `18.77`, max `32.19`

**Client tick (ms)**  avg `4.79`, p95 `11.69`, max `22.60`

**Memory**  start `2323 MB`, end `1255 MB`, peak `2737 MB`, GC `34 events / 296 ms`

**FPS over sampling window (ASCII):**

```
1462.0 |                                                                               █
1358.3 |                                                         █                    ██
1254.7 |                                                        ███                  ███
1151.0 |                                                       ████          ███  ██████
1047.4 |                      ███ █████   ██               ████████    █████████████████
943.8 |               ██     ██████████ ████            ██████████    █████████████████
840.1 |        ██████████    ██████████ ████        ██ ███████████   ██████████████████
736.5 |       ███████████    ███████████████        ███████████████  ██████████████████
632.9 |     █████████████████████████████████ █    ████████████████  ██████████████████
529.2 |   ██████████████████████████████████████ ██████████████████████████████████████
425.6 |█  █████████████████████████████████████████████████████████████████████████████
321.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6156
   1 ms | ██████████████████████████████████████  5845
   2 ms | ██████  916
   3 ms | ██  285
   4 ms | █  162
   5 ms | █  83
   6 ms |   41
   7 ms |   38
   8 ms |   33
   9 ms |   31
  10 ms |   15
  11 ms |   14
  12 ms |   3
  13 ms |   9
  14 ms |   6
  15 ms |   6
  16 ms |   5
  17 ms |   11
  18 ms |   2
  19 ms |   1
  20 ms |   2
  21 ms |   1
  22 ms |   2
  23 ms |   1
  24 ms |   2
  25 ms |   1
  26 ms |   1
  27 ms |   1
  32 ms |   1
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
- `tnt_active_avg` = `36.27`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `77.61`
- `fps_harmonic_avg` = `683.72`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `86.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `42.37`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `993.41`, min `38.85`, p50 `1006.83`, p95 `1599.26`, p99 `1717.33`, 1%low `80.28`, 0.1%low `46.25`, std `418.75`

**Frame time (ms)**  avg `1.42`, p50 `0.99`, p95 `3.34`, p99 `8.52`, p99.9 `19.28`, max `25.74`

**Client tick (ms)**  avg `4.31`, p95 `9.11`, max `22.80`

**Memory**  start `1199 MB`, end `2516 MB`, peak `2655 MB`, GC `46 events / 395 ms`

**FPS over sampling window (ASCII):**

```
1622.5 |                                                                             ██ 
1504.6 |                        ██████                                              ███ 
1386.8 |                       ██████████                             ██       █████████
1269.0 |                       ███████████                           ████ ██████████████
1151.2 |                       █████████████                        ████████████████████
1033.3 |        ███    █       █████████████  ██                    ████████████████████
915.5 |       █████████       █████████████████                   █████████████████████
797.7 |      ██████████  ██████████████████████  ██               █████████████████████
679.9 |     █████████████████████████████████████████        ███  █████████████████████
562.0 |█    ██████████████████████████████████████████ █  █████████████████████████████
444.2 |█    ███████████████████████████████████████████████████████████████████████████
326.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7107
   1 ms | ████████████████████████████  4983
   2 ms | ██████  1077
   3 ms | ██  343
   4 ms | █  144
   5 ms | █  123
   6 ms |   59
   7 ms |   43
   8 ms |   48
   9 ms |   22
  10 ms |   29
  11 ms |   14
  12 ms |   4
  13 ms |   5
  14 ms |   7
  15 ms |   4
  16 ms |   7
  17 ms |   4
  18 ms |   2
  19 ms |   4
  20 ms |   5
  21 ms |   2
  22 ms |   2
  23 ms |   1
  25 ms |   2
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
- `tnt_active_avg` = `37.00`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `80.28`
- `fps_harmonic_avg` = `702.03`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `49.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `46.25`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `1589.41`, min `11.04`, p50 `1660.24`, p95 `3610.22`, p99 `3923.58`, 1%low `21.99`, 0.1%low `13.01`, std `1106.32`

**Frame time (ms)**  avg `2.81`, p50 `0.60`, p95 `12.79`, p99 `37.11`, p99.9 `62.64`, max `90.61`

**Client tick (ms)**  avg `17.94`, p95 `31.66`, max `68.59`

**Memory**  start `992 MB`, end `1417 MB`, peak `2523 MB`, GC `30 events / 140 ms`

**FPS over sampling window (ASCII):**

```
3663.5 |                                                                            ██ █
3342.6 |                                                                            ████
3021.7 |                                                                           █████
2700.8 |                                                               ███████     █████
2379.8 |                          ███     ██      ███     ██████      █████████    █████
2058.9 |                    █     ████    ████    ████    ███████     █████████    █████
1738.0 |              ██    ██    ████    ████   ██████   ████████    ██████████   █████
1417.1 | █            ███   ███   █████   █████  ██████   ████████    ██████████   █████
1096.1 |███  █    █   ███  ████   █████  ██████  ███████  █████████   ██████████   █████
775.2 |███  ██   █ █ ███  █████  ██████ ██████  ███████  █████████  ████████████  █████
454.3 |████ ██ █ █ █ ████ █████ ███████ ███████ ████████ ██████████ █████████████ █████
133.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4527
   1 ms | ██████  686
   2 ms | ███  296
   3 ms | ██  239
   4 ms | █████  572
   5 ms | ██  209
   6 ms |   49
   7 ms |   39
   8 ms |   38
   9 ms |   54
  10 ms |   35
  11 ms |   11
  12 ms |   10
  13 ms |   15
  14 ms |   20
  15 ms |   15
  16 ms |   23
  17 ms |   15
  18 ms |   23
  19 ms |   15
  20 ms |   3
  21 ms |   7
  22 ms |   28
  23 ms |   22
  24 ms |   15
  25 ms |   7
  26 ms |   11
  27 ms |   7
  28 ms |   10
  29 ms |   6
  30 ms |   8
  31 ms |   7
  32 ms |   4
  33 ms |   8
  34 ms |   4
  35 ms |   1
  36 ms |   7
  37 ms |   5
  38 ms |   13
  39 ms |   13
  40 ms |   6
  41 ms |   9
  42 ms |   2
  43 ms |   6
  44 ms |   2
  46 ms |   2
  47 ms |   1
  48 ms |   1
  50 ms |   1
  53 ms |   1
  56 ms |   1
  60 ms |   1
  62 ms |   1
  65 ms |   1
  69 ms |   1
  70 ms |   1
  71 ms |   1
  84 ms |   1
  85 ms |   1
  90 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `355.90`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `25139.00`
- `preload_duration_ms` = `153.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `21.99`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4816.10`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `13.01`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `1646.01`, min `7.71`, p50 `1831.51`, p95 `3020.87`, p99 `3908.40`, 1%low `18.98`, 0.1%low `11.40`, std `1081.35`

**Frame time (ms)**  avg `3.23`, p50 `0.55`, p95 `17.33`, p99 `41.86`, p99.9 `69.23`, max `129.78`

**Client tick (ms)**  avg `19.07`, p95 `33.41`, max `67.31`

**Memory**  start `1044 MB`, end `1064 MB`, peak `2487 MB`, GC `29 events / 151 ms`

**FPS over sampling window (ASCII):**

```
3546.5 |                                                                            █ ██
3231.6 |                                                                            ████
2916.7 |                                                                     █      ████
2601.8 |                                                  ███        ██████ ███     ████
2286.8 |             █          █       █████    ████    ███████     ██████████     ████
1971.9 |             ███    █   ████    ██████   ████    ████████    ███████████    ████
1657.0 |             ████   █   █████   ██████   █████   ████████    ███████████   █████
1342.1 | ██          ████   █   █████  ███████   █████   █████████   ███████████   █████
1027.2 |████      █  ████  ███  █████  ████████ ███████  █████████   ████████████  █████
712.3 |████   █ ██ ██████ ███  ██████ ████████ ███████  ██████████ █████████████  █████
397.4 |█████ ██ ██ ██████ ████ ██████ █████████████████ ██████████ ██████████████ █████
 82.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4113
   1 ms | █████  512
   2 ms | ███  263
   3 ms | █  146
   4 ms | █  101
   5 ms | █  133
   6 ms | ███  329
   7 ms | █  92
   8 ms |   41
   9 ms |   23
  10 ms |   23
  11 ms |   12
  12 ms |   19
  13 ms |   16
  14 ms |   21
  15 ms |   17
  16 ms |   16
  17 ms |   12
  18 ms |   16
  19 ms |   11
  20 ms |   30
  21 ms |   13
  22 ms |   5
  23 ms |   7
  24 ms |   5
  25 ms |   25
  26 ms |   22
  27 ms |   15
  28 ms |   15
  29 ms |   9
  30 ms |   4
  31 ms |   7
  32 ms |   9
  33 ms |   3
  34 ms |   8
  35 ms |   4
  36 ms |   14
  37 ms |   4
  38 ms |   3
  39 ms |   4
  40 ms |   4
  41 ms |   3
  42 ms |   2
  43 ms |   4
  44 ms |   7
  45 ms |   8
  46 ms |   8
  47 ms |   3
  48 ms |   3
  49 ms |   3
  51 ms |   2
  52 ms |   2
  53 ms |   4
  54 ms |   2
  55 ms |   4
  56 ms |   1
  57 ms |   2
  71 ms |   1
  75 ms |   2
  77 ms |   1
  80 ms |   1
  86 ms |   1
 129 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `309.55`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `23844.00`
- `preload_duration_ms` = `9.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `18.98`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4802.05`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `11.40`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1600.62`, min `32.47`, p50 `1747.28`, p95 `2477.91`, p99 `3179.13`, 1%low `117.13`, 0.1%low `52.89`, std `674.00`

**Frame time (ms)**  avg `0.90`, p50 `0.57`, p95 `2.05`, p99 `5.05`, p99.9 `15.47`, max `30.80`

**Client tick (ms)**  avg `2.88`, p95 `4.19`, max `27.75`

**Memory**  start `2331 MB`, end `2308 MB`, peak `2658 MB`, GC `78 events / 672 ms`

**FPS over sampling window (ASCII):**

```
2498.8 |                                                          █        █            
2323.5 |                                                          █        ██ █      ███
2148.2 |                                                 █        ██ ███   ██ ██   █ ███
1973.0 |█                                   █   █████    ██      ████████████████  █████
1797.7 |█                               █████   █████ ██ ███████████████████████████████
1622.4 |█                           █   ████████████████████████████████████████████████
1447.2 |██                          ████████████████████████████████████████████████████
1271.9 |██                  ██    ██████████████████████████████████████████████████████
1096.6 |███                 ████████████████████████████████████████████████████████████
921.4 |███             ████████████████████████████████████████████████████████████████
746.1 |████ ██ ████████████████████████████████████████████████████████████████████████
570.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15928
   1 ms | ██████████  3986
   2 ms | █  393
   3 ms | █  301
   4 ms |   177
   5 ms |   95
   6 ms |   31
   7 ms |   21
   8 ms |   12
   9 ms |   6
  10 ms |   5
  11 ms |   3
  12 ms |   2
  13 ms |   5
  14 ms |   8
  15 ms |   11
  16 ms |   5
  17 ms |   3
  18 ms |   1
  19 ms |   2
  20 ms |   1
  23 ms |   1
  24 ms |   1
  28 ms |   1
  30 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `1113.38`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3136.00`
- `preload_duration_ms` = `57.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `117.13`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.86`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `52.89`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1588.56`, min `37.41`, p50 `1814.58`, p95 `2384.48`, p99 `3038.21`, 1%low `104.75`, 0.1%low `49.35`, std `686.49`

**Frame time (ms)**  avg `0.97`, p50 `0.55`, p95 `2.62`, p99 `5.66`, p99.9 `18.08`, max `26.73`

**Client tick (ms)**  avg `3.01`, p95 `5.01`, max `20.82`

**Memory**  start `1427 MB`, end `2277 MB`, peak `2775 MB`, GC `70 events / 669 ms`

**FPS over sampling window (ASCII):**

```
2201.0 | █                                                                   █  █   ████
2039.9 |██  ████                               █        ██       █  █    ████████  █████
1878.8 |███ ████                               ██     ███████ ██████████████████████████
1717.7 |████████                         █  █████ ██████████████████████████████████████
1556.6 |█████████                       ████████████████████████████████████████████████
1395.5 |█████████                     ██████████████████████████████████████████████████
1234.4 |█████████                     ██████████████████████████████████████████████████
1073.3 |█████████              █ █ █████████████████████████████████████████████████████
912.2 |██████████             █████████████████████████████████████████████████████████
751.1 |██████████          ██ █████████████████████████████████████████████████████████
590.0 |███████████   █ ████████████████████████████████████████████████████████████████
429.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15549
   1 ms | ████████  3214
   2 ms | ███  989
   3 ms | █  319
   4 ms |   172
   5 ms |   145
   6 ms |   67
   7 ms |   27
   8 ms |   13
   9 ms |   8
  10 ms |   1
  11 ms |   7
  12 ms |   5
  13 ms |   4
  14 ms |   7
  15 ms |   2
  16 ms |   4
  17 ms |   7
  18 ms |   9
  19 ms |   3
  20 ms |   5
  21 ms |   1
  22 ms |   2
  24 ms |   1
  26 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `1028.09`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3136.00`
- `preload_duration_ms` = `78.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `104.75`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `620.88`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `49.35`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `849.37`, min `35.10`, p50 `844.91`, p95 `1255.68`, p99 `1533.39`, 1%low `104.66`, 0.1%low `48.04`, std `247.77`

**Frame time (ms)**  avg `1.38`, p50 `1.18`, p95 `2.60`, p99 `5.15`, p99.9 `17.16`, max `28.49`

**Client tick (ms)**  avg `0.92`, p95 `1.32`, max `5.52`

**Memory**  start `1716 MB`, end `1815 MB`, peak `2951 MB`, GC `70 events / 652 ms`

**FPS over sampling window (ASCII):**

```
1203.6 |██                                                                              
1155.2 |██                                                                              
1106.8 |██   ██ █     █                                                                 
1058.4 |██ ████ █  ██ █                                                                 
1010.0 |█████████  ██████                            █                          █       
961.6 |█████████  ██████   █                        █                          █       
913.2 |█████████ ████████  █             █          █                          ██   █ █
864.8 |██████████████████ ██ ██          ██      █  █                         ███   ███
816.4 |█████████████████████████  █  █  ███   █████ █ █     █    █ █    █    ██████ ███
768.0 |█████████████████████████ ███ ███████  █████ ███     ██  ██ █   ██    ██████████
719.6 |██████████████████████████████████████ █████ █████  ████ █████████  ████████████
671.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████  3138
   1 ms | ████████████████████████████████████████  10136
   2 ms | ██  603
   3 ms | █  269
   4 ms | █  147
   5 ms |   79
   6 ms |   17
   7 ms |   10
   8 ms |   6
   9 ms |   1
  10 ms |   4
  11 ms |   4
  12 ms |   1
  13 ms |   5
  14 ms |   8
  15 ms |   8
  16 ms |   5
  17 ms |   4
  18 ms |   2
  19 ms |   3
  20 ms |   3
  21 ms |   1
  23 ms |   1
  24 ms |   1
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_1pct_low` = `104.66`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `0.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `48.04`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `722.87`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `2061.79`, min `42.72`, p50 `2168.15`, p95 `2572.53`, p99 `3308.70`, 1%low `164.00`, 0.1%low `53.69`, std `512.06`

**Frame time (ms)**  avg `0.60`, p50 `0.46`, p95 `1.04`, p99 `3.35`, p99.9 `15.33`, max `23.41`

**Client tick (ms)**  avg `0.46`, p95 `0.78`, max `1.48`

**Memory**  start `2312 MB`, end `2081 MB`, peak `3223 MB`, GC `57 events / 643 ms`

**FPS over sampling window (ASCII):**

```
2344.9 |                                                █         █                     
2279.9 |                      █         █   █           █      █  ████           █      
2215.0 | █                    █████    ███  █        █  █      ███████           ██     
2150.0 | █       █  █       █ █████    ███████       █  █      ███████ █     █   ███    
2085.0 | █   █████  █  █    ███████  █ ███████       █  ██     ██████████   ███████████ 
2020.0 |███  ████████ ███   ███████  ██████████      █████    ███████████   ████████████
1955.0 |███ █████████ ████  ███████ █████████████    █████    ███████████ █ ████████████
1890.1 |███ ██████████████  █████████████████████    █████    █████████████ ████████████
1825.1 |███████████████████ ███████████████████████  ██████  ███████████████████████████
1760.1 |███████████████████████████████████████████ ████████ ███████████████████████████
1695.1 |███████████████████████████████████████████ ████████████████████████████████████
1630.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19892
   1 ms | █  584
   2 ms |   223
   3 ms |   167
   4 ms |   68
   5 ms |   21
   6 ms |   9
   7 ms |   7
   8 ms |   2
   9 ms |   2
  11 ms |   1
  12 ms |   1
  14 ms |   1
  15 ms |   4
  16 ms |   2
  17 ms |   4
  18 ms |   1
  19 ms |   5
  20 ms |   5
  23 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `52.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `53.69`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `1677.62`
- `fps_1pct_low` = `164.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `2274.95`, min `40.25`, p50 `2242.40`, p95 `3632.83`, p99 `3805.51`, 1%low `190.64`, 0.1%low `62.53`, std `673.63`

**Frame time (ms)**  avg `0.54`, p50 `0.45`, p95 `0.93`, p99 `2.97`, p99.9 `8.25`, max `24.85`

**Client tick (ms)**  avg `0.39`, p95 `0.64`, max `4.98`

**Memory**  start `1936 MB`, end `1864 MB`, peak `3360 MB`, GC `50 events / 518 ms`

**FPS over sampling window (ASCII):**

```
3476.3 |                                 █      █                                       
3303.3 |                                 █      █                                       
3130.2 |                                 █      █          █                            
2957.2 |                                 █ █  █ █ █ ██ █   █                            
2784.2 |        █                        █ █  █ █ █ ██ █   █                            
2611.1 |        █                        ██████ █ ████ █ █ █ █                          
2438.1 |█   █  ██       █ █             █████████ ████ ███ █ █          █   █           
2265.0 |███ █ ████      █ █             ███████████████████████  █  ██  █   ██          
2092.0 |█████████████ █████ █    ██   ████████████████████████████ ████ █  ███ █    ██  
1919.0 |█████████████ ████████ █ █████████████████████████████████████████████ █████████
1745.9 |█████████████ ██████████████████████████████████████████████████████████████████
1572.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  20052
   1 ms | █  481
   2 ms | █  262
   3 ms |   113
   4 ms |   42
   5 ms |   14
   6 ms |   11
   7 ms |   2
   8 ms |   5
  10 ms |   1
  12 ms |   3
  13 ms |   1
  14 ms |   2
  16 ms |   2
  17 ms |   1
  18 ms |   1
  19 ms |   2
  20 ms |   1
  21 ms |   1
  22 ms |   2
  24 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `fps_harmonic_avg` = `1841.03`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `62.53`
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
- `fps_1pct_low` = `190.64`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1951.35`, min `24.31`, p50 `2130.70`, p95 `3139.87`, p99 `3919.13`, 1%low `125.49`, 0.1%low `39.24`, std `777.41`

**Frame time (ms)**  avg `0.83`, p50 `0.47`, p95 `2.97`, p99 `4.34`, p99.9 `19.27`, max `41.14`

**Client tick (ms)**  avg `0.49`, p95 `0.69`, max `6.68`

**Memory**  start `3167 MB`, end `1952 MB`, peak `4369 MB`, GC `41 events / 605 ms`

**FPS over sampling window (ASCII):**

```
3730.2 |                                                     ██                         
3517.2 |                                                     ██                         
3304.2 |                                                     ██                         
3091.2 |                                                     ██                         
2878.2 |                                                     ██                         
2665.2 |                                                     ██                         
2452.2 |                                                     ██            █            
2239.2 |     █            ██                       █   █ █  ███      █ █ █ █ █        █ 
2026.2 | █ █ █  █  ███  █ ███    █ █    █ █ █ █  █ ███ █ █ ██████  █ ███ █ █ █ █ █  █ █ 
1813.2 |██ ████ █  ███  ██████████ █ ██████ ███ ██ ██████████████  ███████████ █████████
1600.3 |███████ ████████████████████████████████████████████████████████████████████████
1387.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17937
   1 ms | ██  706
   2 ms | ███  1355
   3 ms | ██  736
   4 ms |   119
   5 ms |   53
   6 ms |   40
   7 ms |   17
   8 ms |   7
   9 ms |   1
  10 ms |   2
  11 ms |   1
  12 ms |   2
  15 ms |   1
  16 ms |   1
  19 ms |   2
  20 ms |   1
  21 ms |   4
  23 ms |   2
  24 ms |   2
  25 ms |   3
  26 ms |   1
  27 ms |   4
  28 ms |   1
  30 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `125.49`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `13.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `39.24`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `1204.96`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1922.87`, min `10.62`, p50 `2002.03`, p95 `2481.53`, p99 `2939.31`, 1%low `143.54`, 0.1%low `34.78`, std `435.01`

**Frame time (ms)**  avg `0.63`, p50 `0.50`, p95 `0.96`, p99 `3.09`, p99.9 `15.83`, max `94.20`

**Client tick (ms)**  avg `0.43`, p95 `0.66`, max `3.63`

**Memory**  start `3060 MB`, end `3860 MB`, peak `4909 MB`, GC `39 events / 598 ms`

**FPS over sampling window (ASCII):**

```
2276.4 |                             █                                                  
2213.1 |                             █                                                  
2149.8 |                            ██                                              █   
2086.5 |                            ██                 █  █                        ██ █ 
2023.2 |   ██           █        █  ██            █    █  ██        ██             ████ 
1959.9 |  █████       █ █   ██ ██████████ ██   █ ██  █ █  ███   █  ███  ████  ██   █████
1896.6 |█ █████ ██    ███   ██ █████████████ █ █████ ███ █████ ███ █████████████ ███████
1833.4 |██████████    ███   ████████████████████████ ███ ███████████████████████████████
1770.1 |████████████ ████   ████████████████████████████████████████████████████████████
1706.8 |████████████ █████  ████████████████████████████████████████████████████████████
1643.5 |████████████ █████  ████████████████████████████████████████████████████████████
1580.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  20023
   1 ms | █  506
   2 ms |   235
   3 ms |   139
   4 ms |   45
   5 ms |   10
   6 ms |   4
   7 ms |   5
   8 ms |   1
   9 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   2
  14 ms |   4
  15 ms |   2
  18 ms |   1
  20 ms |   1
  21 ms |   1
  22 ms |   4
  24 ms |   2
  25 ms |   1
  26 ms |   6
  27 ms |   1
  28 ms |   2
  41 ms |   1
  94 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `1594.80`
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
- `preload_duration_ms` = `43.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `34.78`
- `fps_1pct_low` = `143.54`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `998.91`, min `40.42`, p50 `1064.88`, p95 `1343.53`, p99 `1393.67`, 1%low `155.32`, 0.1%low `61.56`, std `290.40`

**Frame time (ms)**  avg `1.17`, p50 `0.94`, p95 `2.34`, p99 `3.94`, p99.9 `13.30`, max `24.74`

**Client tick (ms)**  avg `0.46`, p95 `0.87`, max `2.94`

**Memory**  start `2345 MB`, end `3287 MB`, peak `3793 MB`, GC `26 events / 236 ms`

**FPS over sampling window (ASCII):**

```
1198.1 |                          █      █                                              
1141.9 |               █       █  ██ █████      █           ██    █     █               
1085.7 |   █          ████ ██  ██ █████████  █  ███ ████  ████    ███  ███              
1029.5 |  ██ █     █ ████████  ███████████████  ████████  ████  █ ████████              
973.3 |  ████  ██ ██████████ ████████████████  █████████ ████████████████              
917.1 | █████  ███████████████████████████████ ███████████████████████████             
860.9 | █████  ███████████████████████████████████████████████████████████   ███ █     
804.7 | ██████ ████████████████████████████████████████████████████████████████████    
748.5 |██████████████████████████████████████████████████████████████████████████████  
692.3 |██████████████████████████████████████████████████████████████████████████████  
636.1 |██████████████████████████████████████████████████████████████████████████████ █
579.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9693
   1 ms | █████████████████████████  6137
   2 ms | ███  833
   3 ms | █  250
   4 ms |   83
   5 ms |   29
   6 ms |   18
   7 ms |   11
   8 ms |   3
  12 ms |   2
  13 ms |   6
  14 ms |   4
  15 ms |   4
  16 ms |   1
  18 ms |   2
  22 ms |   1
  24 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `155.32`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `39.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `61.56`
- `part` = `1.00`
- `fps_harmonic_avg` = `853.90`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24400 ms  |  Sample ticks: 400

**FPS**  avg `748.30`, min `52.29`, p50 `757.35`, p95 `1052.76`, p99 `1146.73`, 1%low `148.10`, 0.1%low `58.25`, std `193.62`

**Frame time (ms)**  avg `1.48`, p50 `1.32`, p95 `2.41`, p99 `4.34`, p99.9 `11.36`, max `19.12`

**Client tick (ms)**  avg `0.37`, p95 `0.60`, max `3.02`

**Memory**  start `3133 MB`, end `3538 MB`, peak `4354 MB`, GC `22 events / 224 ms`

**FPS over sampling window (ASCII):**

```
904.2 |█      █                                                                        
872.2 |█ ████ █                                                                        
840.2 |█████████ █████   █   ██                                                        
808.2 |█████████ ██████  █  ███      ██ █                                              
776.2 |█████████ ██████ █████████ █  ████     █  █                                     
744.2 |███████████████████████████████████ █ ██████  █   ██ █                          
712.2 |█████████████████████████████████████ ███████ ███ ██ █ █   ███   █      █  █ █  
680.3 |██████████████████████████████████████████████████████ █████████ ███  █ █ ██ ██ 
648.3 |█████████████████████████████████████████████████████████████████████ ██████ ███
616.3 |████████████████████████████████████████████████████████████████████████████ ███
584.3 |████████████████████████████████████████████████████████████████████████████ ███
552.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  1278
   1 ms | ████████████████████████████████████████  10861
   2 ms | ████  953
   3 ms | █  206
   4 ms |   85
   5 ms |   45
   6 ms |   13
   7 ms |   4
   8 ms |   9
   9 ms |   2
  13 ms |   1
  15 ms |   3
  16 ms |   4
  17 ms |   3
  18 ms |   2
  19 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `148.10`
- `surface_water_ratio` = `0.04`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1343.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `58.25`
- `part` = `1.00`
- `fps_harmonic_avg` = `673.49`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `875.50`, min `37.73`, p50 `935.54`, p95 `1162.42`, p99 `1229.48`, 1%low `150.21`, 0.1%low `56.59`, std `229.77`

**Frame time (ms)**  avg `1.29`, p50 `1.07`, p95 `2.26`, p99 `4.13`, p99.9 `10.92`, max `26.50`

**Client tick (ms)**  avg `0.34`, p95 `0.53`, max `2.85`

**Memory**  start `2498 MB`, end `3564 MB`, peak `4877 MB`, GC `19 events / 198 ms`

**FPS over sampling window (ASCII):**

```
999.4 |   ███     █                                                                    
975.1 |   ████   ██     █                                                              
950.8 |█ ███████ ██  ██ █  ██      █                                                   
926.4 |████████████████ █ ███     ██                    █                              
902.1 |██████████████████ █████   █████      █  █       █     █ █                      
877.8 |██████████████████ ███████ █████  █   █  █    █ ██ ██  █ █         █ █          
853.4 |██████████████████████████ █████  █ ███ ██    ███████  ████ ██  ██ █ █ █    █ █ 
829.1 |████████████████████████████████  ███████████████████  ████████ ██ ███ █  █ █ █ 
804.8 |█████████████████████████████████ ███████████████████  ████████ ██ ███ █  █████ 
780.4 |█████████████████████████████████████████████████████  ████████ ████████████████
756.1 |██████████████████████████████████████████████████████ █████████████████████████
731.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████  5747
   1 ms | ████████████████████████████████████████  8553
   2 ms | ████  829
   3 ms | █  178
   4 ms |   73
   5 ms |   43
   6 ms |   17
   7 ms |   6
   8 ms |   3
   9 ms |   1
  10 ms |   4
  11 ms |   3
  12 ms |   1
  13 ms |   1
  14 ms |   1
  16 ms |   1
  17 ms |   1
  18 ms |   1
  19 ms |   1
  20 ms |   4
  22 ms |   1
  26 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `150.21`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `46.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `56.59`
- `part` = `1.00`
- `fps_harmonic_avg` = `773.50`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `834.55`, min `42.63`, p50 `876.95`, p95 `1105.71`, p99 `1185.45`, 1%low `161.22`, 0.1%low `58.69`, std `208.91`

**Frame time (ms)**  avg `1.33`, p50 `1.14`, p95 `2.30`, p99 `3.75`, p99.9 `9.86`, max `23.46`

**Client tick (ms)**  avg `0.38`, p95 `0.59`, max `3.79`

**Memory**  start `3378 MB`, end `4908 MB`, peak `5234 MB`, GC `18 events / 192 ms`

**FPS over sampling window (ASCII):**

```
950.0 |    ██   █                                                                      
924.0 |███ ██   ███                                                                    
898.1 |███████  ████  █           █                                                    
872.2 |███████  █████ ██ █   █ ██ █         █                      █    █       █     █
846.2 |███████  ████████ █  ██ ████  █    █ ██    █ █    █      █  ███ ██      ██   ███
820.3 |███████ ████████████ ██ ████ ██  █ ██████ █████  ████   ████████████  █ ███  ███
794.4 |███████ ████████████ ███████ ██  ██████████████  ████ ███████████████ █████  ███
768.4 |███████ ████████████████████ ███ ██████████████ ███████████████████████████ ████
742.5 |███████ ████████████████████████ ██████████████ ███████████████████████████ ████
716.5 |███████████████████████████████████████████████████████████████████████████ ████
690.6 |███████████████████████████████████████████████████████████████████████████ ████
664.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████  3563
   1 ms | ████████████████████████████████████████  10235
   2 ms | ████  905
   3 ms | █  168
   4 ms |   58
   5 ms |   32
   6 ms |   12
   7 ms |   3
   8 ms |   2
   9 ms |   4
  10 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   1
  14 ms |   1
  16 ms |   2
  20 ms |   3
  21 ms |   2
  23 ms |   2
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `161.22`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `44.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `58.69`
- `part` = `1.00`
- `fps_harmonic_avg` = `749.79`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23351 ms  |  Sample ticks: 400

**FPS**  avg `837.29`, min `33.73`, p50 `879.63`, p95 `1141.56`, p99 `1200.88`, 1%low `147.86`, 0.1%low `53.91`, std `225.36`

**Frame time (ms)**  avg `1.35`, p50 `1.14`, p95 `2.38`, p99 `4.06`, p99.9 `10.97`, max `29.64`

**Client tick (ms)**  avg `0.41`, p95 `0.63`, max `3.58`

**Memory**  start `4881 MB`, end `4225 MB`, peak `5608 MB`, GC `16 events / 215 ms`

**FPS over sampling window (ASCII):**

```
970.4 |  ██  ██        █            █                                                  
943.1 | ███ ████       ██        █  █                                                  
915.9 | ███ ████ █  █ ███ █ ██████ ██ ██   █                                           
888.6 |████ ██████  █████████████████ ██  ██            █                              
861.3 |███████████  █████████████████████ ███           █                              
834.0 |████████████ █████████████████████ ███ █    █ ██ ███       █       █       █  █ 
806.8 |████████████ ███████████████████████████  ███ ██████   █  ██       █    █  █  █ 
779.5 |████████████ ███████████████████████████  ███████████  █  ███ █    ██   █████ █ 
752.2 |████████████ ███████████████████████████  ███████████████ ███ ██  ███   █████ █ 
724.9 |████████████ ████████████████████████████ ███████████████████████████ █ █████ ██
697.6 |█████████████████████████████████████████████████████████████████████ █ ████████
670.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████  4131
   1 ms | ████████████████████████████████████████  9377
   2 ms | ████  922
   3 ms | █  207
   4 ms |   71
   5 ms |   37
   6 ms |   15
   7 ms |   6
   8 ms |   4
   9 ms |   1
  10 ms |   4
  11 ms |   2
  12 ms |   1
  13 ms |   2
  14 ms |   1
  17 ms |   1
  20 ms |   2
  21 ms |   2
  23 ms |   2
  24 ms |   1
  29 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `147.86`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `18.00`
- `entity_count_delta` = `-17.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `293.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `53.91`
- `part` = `1.00`
- `fps_harmonic_avg` = `739.48`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 25742 ms  |  Sample ticks: 400

**FPS**  avg `817.49`, min `28.30`, p50 `846.60`, p95 `1116.75`, p99 `1182.77`, 1%low `160.41`, 0.1%low `55.12`, std `209.53`

**Frame time (ms)**  avg `1.36`, p50 `1.18`, p95 `2.25`, p99 `3.89`, p99.9 `7.83`, max `35.34`

**Client tick (ms)**  avg `0.36`, p95 `0.53`, max `2.41`

**Memory**  start `3767 MB`, end `4101 MB`, peak `5865 MB`, GC `16 events / 197 ms`

**FPS over sampling window (ASCII):**

```
958.7 |        █                                                                       
932.5 |███████ █ █  █                                                                  
906.4 |███████ ███  ███ █ █   █ █                                                      
880.3 |████████████████ █████████                                                      
854.1 |████████████████████████████                                                    
828.0 |████████████████████████████   ███     █           █                            
801.9 |█████████████████████████████  ███████ ████ █████ ███ █    █ █   █ █            
775.7 |█████████████████████████████  ███████ ██████████ ███ ██ ██████ ████            
749.6 |█████████████████████████████ █████████████████████████████████ ████  ██   ███  
723.5 |█████████████████████████████ ██████████████████████████████████████  ██   ███ █
697.3 |█████████████████████████████ ██████████████████████████████████████  ██████████
671.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████  2949
   1 ms | ████████████████████████████████████████  10625
   2 ms | ███  795
   3 ms | █  196
   4 ms |   60
   5 ms |   34
   6 ms |   11
   7 ms |   7
   8 ms |   1
   9 ms |   2
  11 ms |   1
  15 ms |   1
  18 ms |   1
  19 ms |   3
  21 ms |   2
  22 ms |   1
  30 ms |   1
  35 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `160.41`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `41.00`
- `entity_count_delta` = `-39.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `2697.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `55.12`
- `part` = `1.00`
- `fps_harmonic_avg` = `734.52`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `887.88`, min `30.67`, p50 `930.56`, p95 `1174.20`, p99 `1233.15`, 1%low `177.31`, 0.1%low `62.84`, std `215.86`

**Frame time (ms)**  avg `1.25`, p50 `1.07`, p95 `2.07`, p99 `3.49`, p99.9 `8.28`, max `32.61`

**Client tick (ms)**  avg `0.38`, p95 `0.62`, max `0.91`

**Memory**  start `4983 MB`, end `5629 MB`, peak `6126 MB`, GC `14 events / 171 ms`

**FPS over sampling window (ASCII):**

```
1019.2 |        █                                                                       
994.0 |█ █  █ ██                                                                       
968.9 |██████ ████ █    █    █                                                         
943.7 |██████ ██████    █ ██ ██  █                                                     
918.6 |███████████████  ████ █████ █ ██     █ █ █     █ █        █                     
893.4 |███████████████ █████████████ ██   ███ █ ██    █ █   ██ ███  █   █              
868.3 |███████████████ █████████████ ██ █ ███ █ ██  █ ████  ██████████  █    █      █  
843.1 |███████████████ █████████████ ████████ ████  ███████ ██████████ ███ ███ █   ███ 
818.0 |██████████████████████████████████████ █████ ██████████████████████ ███ █   ███ 
792.8 |██████████████████████████████████████ ████████████████████████████████ █   ████
767.7 |██████████████████████████████████████ ████████████████████████████████ ████████
742.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████  5732
   1 ms | ████████████████████████████████████████  9417
   2 ms | ███  642
   3 ms | █  170
   4 ms |   43
   5 ms |   20
   6 ms |   12
   7 ms |   2
   8 ms |   4
   9 ms |   3
  10 ms |   1
  12 ms |   1
  13 ms |   2
  18 ms |   2
  20 ms |   1
  22 ms |   2
  23 ms |   1
  32 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `177.31`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `2.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `49.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `62.84`
- `part` = `1.00`
- `fps_harmonic_avg` = `802.80`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25299 ms  |  Sample ticks: 400

**FPS**  avg `786.55`, min `39.03`, p50 `824.82`, p95 `1056.40`, p99 `1109.85`, 1%low `156.90`, 0.1%low `58.34`, std `206.04`

**Frame time (ms)**  avg `1.42`, p50 `1.21`, p95 `2.48`, p99 `4.04`, p99.9 `8.79`, max `25.62`

**Client tick (ms)**  avg `0.33`, p95 `0.53`, max `2.92`

**Memory**  start `5884 MB`, end `5279 MB`, peak `6404 MB`, GC `15 events / 182 ms`

**FPS over sampling window (ASCII):**

```
896.8 |    █                                                                           
873.6 |█   █    █    █                                                                 
850.4 |█ █ █  ███  ███     ██                                                          
827.1 |█ █ █ ██████████    ███       █          █            █       █                 
803.9 |█ ██████████████████████████ ██     █ █  █ ███   █ █  █       █ █            █  
780.7 |█ ██████████████████████████ ███   ████  █ ███   ███  █  █    █ ██ █ █   █ █ █ █
757.5 |█████████████████████████████████  ████████████ █████ █████   █ ██ ████ ████████
734.3 |██████████████████████████████████ ██████████████████ █████   ████ █████████████
711.1 |█████████████████████████████████████████████████████ █████   ██████████████████
687.9 |████████████████████████████████████████████████████████████  ██████████████████
664.6 |████████████████████████████████████████████████████████████  ██████████████████
641.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  2074
   1 ms | ████████████████████████████████████████  10531
   2 ms | ████  1069
   3 ms | █  233
   4 ms |   76
   5 ms |   33
   6 ms |   11
   7 ms |   6
   8 ms |   6
   9 ms |   2
  10 ms |   1
  13 ms |   1
  14 ms |   1
  18 ms |   1
  20 ms |   2
  21 ms |   2
  22 ms |   2
  25 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `156.90`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `43.00`
- `entity_count_delta` = `-42.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `2295.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `58.34`
- `part` = `1.00`
- `fps_harmonic_avg` = `702.58`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `791.66`, min `28.36`, p50 `819.93`, p95 `1073.08`, p99 `1146.04`, 1%low `156.90`, 0.1%low `52.75`, std `199.00`

**Frame time (ms)**  avg `1.40`, p50 `1.22`, p95 `2.35`, p99 `3.86`, p99.9 `8.58`, max `35.26`

**Client tick (ms)**  avg `0.53`, p95 `0.81`, max `5.52`

**Memory**  start `5995 MB`, end `5018 MB`, peak `6580 MB`, GC `15 events / 206 ms`

**FPS over sampling window (ASCII):**

```
925.5 |  █    █                                                                        
902.7 |  ███  ██                                                                       
879.8 |█ ████ ███                                                                      
857.0 |█ █████████     █                                            █    █           █ 
834.1 |████████████   ██ █                                      █   █    ██   █  █   █ 
811.3 |████████████   ██ █                                     ██   ███████   █  ███ █ 
788.5 |█████████████  ██ █  ██ █ █                        █ █████ █████████ █ ██ █████ 
765.6 |██████████████ ████████████ ██  █  ████     █ █  ███ ████████████████████ ██████
742.8 |██████████████ ████████████ ██  ██ █████   ██ █  ███████████████████████████████
719.9 |██████████████ ████████████████ █████████  █████████████████████████████████████
697.1 |█████████████████████████████████████████  █████████████████████████████████████
674.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  2012
   1 ms | ████████████████████████████████████████  11048
   2 ms | ███  884
   3 ms | █  199
   4 ms |   62
   5 ms |   30
   6 ms |   12
   7 ms |   8
   8 ms |   3
   9 ms |   1
  10 ms |   1
  12 ms |   1
  15 ms |   1
  17 ms |   1
  19 ms |   1
  22 ms |   4
  23 ms |   1
  24 ms |   1
  35 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `156.90`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `11.00`
- `entity_count_delta` = `-5.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `6.00`
- `preload_duration_ms` = `46.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `52.75`
- `part` = `1.00`
- `fps_harmonic_avg` = `713.59`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 24054 ms  |  Sample ticks: 400

**FPS**  avg `891.57`, min `30.17`, p50 `940.18`, p95 `1177.97`, p99 `1237.58`, 1%low `176.77`, 0.1%low `60.26`, std `219.50`

**Frame time (ms)**  avg `1.24`, p50 `1.06`, p95 `2.12`, p99 `3.30`, p99.9 `7.42`, max `33.15`

**Client tick (ms)**  avg `0.27`, p95 `0.38`, max `1.03`

**Memory**  start `6276 MB`, end `4043 MB`, peak `6850 MB`, GC `15 events / 205 ms`

**FPS over sampling window (ASCII):**

```
1026.6 |█  █                                                                            
997.6 |██ ███  █                █                                                      
968.6 |████████████       █  █  █                                                      
939.5 |████████████    █ ██  █  ██  ██  █              ██  █                           
910.5 |████████████    ████████ ███ ███ █ █         █  ██ ███     █        █           
881.4 |█████████████ ██████████████████████    ██████  ████████ █ ████     █          █
852.4 |███████████████████████████████████████ ██████  ██████████ █████  ███       ██ █
823.3 |███████████████████████████████████████ ███████ ████████████████  ████    █ ████
794.3 |███████████████████████████████████████████████ ███████████████████████ █ ██████
765.3 |███████████████████████████████████████████████████████████████████████ ████████
736.2 |███████████████████████████████████████████████████████████████████████ ████████
707.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████  6110
   1 ms | ████████████████████████████████████████  8990
   2 ms | ███  755
   3 ms | █  126
   4 ms |   48
   5 ms |   31
   6 ms |   6
   7 ms |   4
   8 ms |   2
   9 ms |   3
  14 ms |   1
  18 ms |   1
  20 ms |   1
  22 ms |   3
  23 ms |   1
  27 ms |   1
  33 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `176.77`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `999.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `60.26`
- `part` = `1.00`
- `fps_harmonic_avg` = `804.16`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `802.12`, min `28.06`, p50 `827.66`, p95 `1103.30`, p99 `1176.46`, 1%low `148.86`, 0.1%low `53.89`, std `210.63`

**Frame time (ms)**  avg `1.40`, p50 `1.21`, p95 `2.36`, p99 `4.05`, p99.9 `9.50`, max `35.64`

**Client tick (ms)**  avg `0.36`, p95 `0.52`, max `4.29`

**Memory**  start `5323 MB`, end `5324 MB`, peak `7197 MB`, GC `13 events / 192 ms`

**FPS over sampling window (ASCII):**

```
988.6 |  █                                                                             
957.1 |█████                                                                           
925.5 |█████   █    █                                                                  
894.0 |██████  █  █ ████                                                               
862.4 |███████ ████ █████  ██      █    █  █                                           
830.9 |██████████████████ ████████ ███████ ██  █                        █              
799.3 |███████████████████████████ ███████ ██████                  █    █ █            
767.8 |██████████████████████████████████████████  █  ██ █  █  █   █    ██████         
736.3 |███████████████████████████████████████████ ██ ██ █ █████████ ██ ████████ ███   
704.7 |███████████████████████████████████████████ █████████████████████████████ ███ █ 
673.2 |█████████████████████████████████████████████████████████████████████████████ ██
641.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  2534
   1 ms | ████████████████████████████████████████  10453
   2 ms | ████  975
   3 ms | █  205
   4 ms |   67
   5 ms |   31
   6 ms |   17
   7 ms |   10
   8 ms |   3
   9 ms |   6
  10 ms |   1
  11 ms |   2
  12 ms |   1
  16 ms |   1
  19 ms |   1
  22 ms |   1
  23 ms |   1
  24 ms |   2
  27 ms |   1
  35 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `148.86`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `53.89`
- `part` = `1.00`
- `fps_harmonic_avg` = `715.66`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `895.14`, min `31.15`, p50 `951.29`, p95 `1177.69`, p99 `1241.02`, 1%low `164.84`, 0.1%low `59.74`, std `225.40`

**Frame time (ms)**  avg `1.25`, p50 `1.05`, p95 `2.14`, p99 `3.67`, p99.9 `8.18`, max `32.11`

**Client tick (ms)**  avg `0.35`, p95 `0.60`, max `1.71`

**Memory**  start `6309 MB`, end `5750 MB`, peak `7378 MB`, GC `15 events / 195 ms`

**FPS over sampling window (ASCII):**

```
1005.6 |  █  █     █                                                                    
979.7 |██████     ██    █                                                              
953.7 |█████████████    ███  █   █          █            █                             
927.7 |█████████████    ███ ██   █   ██  █ ██     ██     ██  ██      █ █               
901.7 |█████████████   ████ ███████ ███  █ ███    ██  █  ██  ██ █   ████ █       █    █
875.8 |███████████████ ████ ████████████ █████  █ ██ ██ ███████ █  █████ █     ███ █  █
849.8 |███████████████ ███████████████████████  █ ███████████████  █████ █    ███████ █
823.8 |██████████████████████████████████████████ ███████████████ ██████ █  █ ███████ █
797.8 |██████████████████████████████████████████ ███████████████ █████████ █ ███████ █
771.9 |██████████████████████████████████████████ ███████████████ █████████ ███████████
745.9 |████████████████████████████████████████████████████████████████████ ███████████
719.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████████  6505
   1 ms | ████████████████████████████████████████  8529
   2 ms | ███  693
   3 ms | █  168
   4 ms |   53
   5 ms |   31
   6 ms |   9
   7 ms |   10
   8 ms |   3
   9 ms |   3
  10 ms |   1
  12 ms |   2
  15 ms |   1
  16 ms |   1
  18 ms |   1
  20 ms |   2
  21 ms |   1
  24 ms |   1
  27 ms |   1
  32 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `164.84`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `12.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `17.00`
- `preload_duration_ms` = `62.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `59.74`
- `part` = `1.00`
- `fps_harmonic_avg` = `800.77`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1588.19`, min `33.39`, p50 `1644.90`, p95 `2127.15`, p99 `2819.11`, 1%low `196.71`, 0.1%low `51.35`, std `402.65`

**Frame time (ms)**  avg `0.72`, p50 `0.61`, p95 `1.20`, p99 `2.42`, p99.9 `5.47`, max `29.95`

**Client tick (ms)**  avg `0.39`, p95 `0.54`, max `3.61`

**Memory**  start `4498 MB`, end `4537 MB`, peak `7384 MB`, GC `28 events / 460 ms`

**FPS over sampling window (ASCII):**

```
1890.6 |  █                                                                             
1844.1 |█ █                                  █  █                                       
1797.6 |█ █               █                  █  █                     █       █         
1751.0 |█ █          █    █       █          █  █           █         █       █         
1704.5 |███          █    █    ██ █  █       █  █           █         █      ██        █
1657.9 |███          █    █    ██ ██ █       █ ██ █  █      █         █  █ █ ██        █
1611.4 |███ ██       █  ███    █████ █       █████████      █  █      ████ █ ██        █
1564.9 |███ ██     █ ███████ █ █████ █       █████████     █████ █  █ ██████████ █   █ █
1518.3 |██████ █  ████████████████████ █     ███████████  ██████ █  █ ██████████ ██ ████
1471.8 |████████  ██████████████████████ ███████████████ ███████ ███████████████████████
1425.3 |████████  ██████████████████████ ███████████████████████████████████████████████
1378.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19302
   1 ms | ███  1398
   2 ms |   161
   3 ms |   65
   4 ms |   44
   5 ms |   12
   6 ms |   4
  20 ms |   1
  23 ms |   2
  24 ms |   2
  25 ms |   3
  27 ms |   2
  28 ms |   2
  29 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `51.35`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `49.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `196.71`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `1393.23`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `174.00`, min `25.47`, p50 `179.82`, p95 `251.57`, p99 `401.80`, 1%low `32.01`, 0.1%low `26.20`, std `61.23`

**Frame time (ms)**  avg `6.78`, p50 `5.56`, p95 `12.66`, p99 `23.30`, p99.9 `37.27`, max `39.26`

**Client tick (ms)**  avg `6.49`, p95 `15.26`, max `28.49`

**Memory**  start `3543 MB`, end `6979 MB`, peak `7373 MB`, GC `26 events / 422 ms`

**FPS over sampling window (ASCII):**

```
379.8 |                                  ██                                            
355.9 |                                  ██                                            
332.1 |                                  ██                                            
308.2 |                                  ███                                           
284.4 |                                  ███                                           
260.5 |                                 ████                                           
236.7 |                                 ████                                           
212.8 |                                 ████                                           
189.0 |██ █ ███ █                     █ █████     █ █     █        ████ ███     ██   █ 
165.1 |███████████     ██ ████   █████████████ ██ ███████████ █████████████  ██████████
141.3 |████████████ ███████████████████████████████████████████████████████████████████
117.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███  101
   3 ms | █  49
   4 ms | ████████████  424
   5 ms | ████████████████████████████████████████  1369
   6 ms | █████████  297
   7 ms | █████  156
   8 ms | ███  88
   9 ms | ████  143
  10 ms | ███  114
  11 ms | █  41
  12 ms | █  26
  13 ms |   13
  14 ms |   12
  15 ms |   9
  16 ms |   7
  17 ms |   6
  18 ms | █  18
  19 ms | █  23
  20 ms |   10
  21 ms |   3
  22 ms |   9
  23 ms |   7
  24 ms |   1
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   2
  29 ms |   3
  30 ms |   2
  31 ms |   3
  32 ms |   3
  34 ms |   2
  35 ms |   1
  36 ms |   3
  37 ms |   3
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `147.60`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `26.20`
- `fps_1pct_low` = `32.01`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `46.00`
- `seed` = `2521.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `1533.54`, min `28.57`, p50 `1576.07`, p95 `2089.60`, p99 `3001.64`, 1%low `188.23`, 0.1%low `47.49`, std `413.41`

**Frame time (ms)**  avg `0.75`, p50 `0.63`, p95 `1.31`, p99 `2.51`, p99.9 `6.75`, max `35.00`

**Client tick (ms)**  avg `0.44`, p95 `0.77`, max `3.79`

**Memory**  start `5770 MB`, end `3788 MB`, peak `7390 MB`, GC `28 events / 460 ms`

**FPS over sampling window (ASCII):**

```
2693.7 |                                                               █                
2563.5 |                                                               █                
2433.4 |                                                              ██                
2303.2 |                                                              ██                
2173.1 |                                                              ██                
2042.9 |                                                              ██                
1912.8 |                                                              ██                
1782.7 |                                                       █      ███  █            
1652.5 |            █ █ █████ ██ █       █      █ █            █    ██████ █            
1522.4 |███  █ ██ ████████████████    █ ███████████████  █ █ █ ██████████████        █  
1392.2 |███ █████ ███████████████████ ██████████████████████ ██████████████████ ████████
1262.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19144
   1 ms | ███  1471
   2 ms | █  245
   3 ms |   60
   4 ms |   39
   5 ms |   17
   6 ms |   4
   7 ms |   1
   8 ms |   4
   9 ms |   1
  22 ms |   2
  24 ms |   1
  25 ms |   3
  26 ms |   2
  28 ms |   1
  29 ms |   1
  30 ms |   2
  32 ms |   1
  34 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `scheduled_fluid_ticks` = `3166.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `188.23`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `49.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `47.49`
- `part` = `1.00`
- `fps_harmonic_avg` = `1334.57`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1529.17`, min `32.09`, p50 `1600.80`, p95 `1936.87`, p99 `2251.95`, 1%low `198.49`, 0.1%low `52.16`, std `338.59`

**Frame time (ms)**  avg `0.74`, p50 `0.62`, p95 `1.23`, p99 `2.43`, p99.9 `5.85`, max `31.16`

**Client tick (ms)**  avg `0.50`, p95 `1.10`, max `4.03`

**Memory**  start `6476 MB`, end `6661 MB`, peak `7392 MB`, GC `27 events / 446 ms`

**FPS over sampling window (ASCII):**

```
1716.3 |                                                                █               
1680.0 |█                         █           █       █  █              █               
1643.8 |█    █                    █           █       █  ██           █ ██     █        
1607.6 |█    ██                   █ █        ██     █ █████         ███████   ██ █      
1571.3 |██ █ ██          █     ████ ██       ███   ██ █████         ████████  █████     
1535.1 |██ █ ██  █  █ █  ██  ██████████      ███   ██████████       █████████ █████     
1498.9 |██ █ ██  █  █ ██ ██ ███████████   ██ ███   ██████████       █████████ █████     
1462.6 |██ █ ██  █  █ ██ ██ █████████████ ██ ████ ███████████ ███  ████████████████ █  █
1426.4 |████████ █ ██████████████████████ ███████████████████ ███ █████████████████ █  █
1390.1 |██████████ █████████████████████████████████████████████████████████████████████
1353.9 |██████████ █████████████████████████████████████████████████████████████████████
1317.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19314
   1 ms | ███  1337
   2 ms |   210
   3 ms |   65
   4 ms |   40
   5 ms |   15
   6 ms |   3
   7 ms |   1
  12 ms |   1
  21 ms |   2
  23 ms |   1
  24 ms |   5
  25 ms |   2
  26 ms |   2
  28 ms |   1
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `toggles` = `22.00`
- `preload_duration_ms` = `46.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `52.16`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `1358.85`
- `fps_1pct_low` = `198.49`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1338.74`, min `24.49`, p50 `1407.92`, p95 `1713.83`, p99 `2105.20`, 1%low `164.62`, 0.1%low `42.59`, std `329.50`

**Frame time (ms)**  avg `0.86`, p50 `0.71`, p95 `1.54`, p99 `3.00`, p99.9 `7.53`, max `40.84`

**Client tick (ms)**  avg `0.47`, p95 `0.88`, max `3.86`

**Memory**  start `7179 MB`, end `7111 MB`, peak `7392 MB`, GC `28 events / 470 ms`

**FPS over sampling window (ASCII):**

```
1522.0 |      █      █                                                                  
1487.9 |      █   █  █                  █                                               
1453.7 |      █   █  █        █  █    █ █            █  █                               
1419.5 |      ██  ██ █        █ ██    █ █        █ ███  ██                           █  
1385.4 |  █  ███  ██ █       ██████████ ██       █ ███ ███        █       █   █     ████
1351.2 |  █  ████ ██ ██    █ ███████████████     ██████████    █ ██     ███████     ████
1317.0 |  █  ███████ ██  █ █ ███████████████    ███████████  █ █ ███   ████████     ████
1282.9 | ███ ███████ ██  █ █████████████████    ███████████  ███████  █████████  █ █████
1248.7 |████ ███████████ █ ██████████████████   ████████████████████  █████████  █ █████
1214.6 |████████████████ █████████████████████  ████████████████████████████████████████
1180.4 |████████████████ █████████████████████ █████████████████████████████████████████
1146.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18246
   1 ms | █████  2207
   2 ms | █  336
   3 ms |   102
   4 ms |   60
   5 ms |   21
   6 ms |   4
   7 ms |   4
   8 ms |   4
  22 ms |   2
  23 ms |   2
  24 ms |   2
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  30 ms |   1
  31 ms |   3
  35 ms |   1
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `50.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `42.59`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `1167.65`
- `restocks` = `20.00`
- `fps_1pct_low` = `164.62`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `1201.74`, min `23.17`, p50 `1248.36`, p95 `1538.26`, p99 `1809.60`, 1%low `164.27`, 0.1%low `39.14`, std `264.58`

**Frame time (ms)**  avg `0.93`, p50 `0.80`, p95 `1.50`, p99 `2.83`, p99.9 `7.15`, max `43.17`

**Client tick (ms)**  avg `0.43`, p95 `0.64`, max `3.68`

**Memory**  start `4367 MB`, end `4743 MB`, peak `7375 MB`, GC `29 events / 490 ms`

**FPS over sampling window (ASCII):**

```
1362.7 |                                                                 █              
1328.0 |                                                                ██ ██           
1293.3 |             ███             ██     ███      ███  █            ███ ██ ██ █      
1258.7 |█ █          ███           ████   █ ███      ███████           ███████████      
1224.0 |███          ████          ████ █ ██████     ███████ █ ██     ████████████      
1189.3 |███ █   ██  █████   ██   ████████ ██████  █  ████████████  █  ████████████      
1154.6 |███ █   ███ ██████████   ███████████████  ██ ████████████████ ████████████      
1119.9 |█████  ███████████████   ████████████████ ████████████████████████████████      
1085.2 |██████ ████████████████ ██████████████████████████████████████████████████   █  
1050.5 |██████ ████████████████ ███████████████████████████████████████████████████  █ █
1015.9 |███████████████████████ ████████████████████████████████████████████████████ ███
981.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17455
   1 ms | ███████  3100
   2 ms | █  260
   3 ms |   89
   4 ms |   50
   5 ms |   19
   6 ms |   4
   7 ms |   3
   9 ms |   1
  21 ms |   1
  23 ms |   3
  24 ms |   1
  25 ms |   4
  26 ms |   2
  27 ms |   3
  28 ms |   2
  30 ms |   1
  35 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `164.27`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `66.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `39.14`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `1077.99`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195504 ms  |  Sample ticks: 3600

**FPS**  avg `227.69`, min `0.62`, p50 `222.80`, p95 `363.03`, p99 `481.10`, 1%low `34.82`, 0.1%low `10.65`, std `80.85`

**Frame time (ms)**  avg `5.19`, p50 `4.49`, p95 `9.38`, p99 `15.26`, p99.9 `35.18`, max `1602.68`

**Client tick (ms)**  avg `1.06`, p95 `2.17`, max `25.76`

**Memory**  start `3954 MB`, end `6300 MB`, peak `7794 MB`, GC `160 events / 2208 ms`

**FPS over sampling window (ASCII):**

```
311.1 |█   █                                                                           
295.0 |█████                                      █        ██ ███      █               
279.0 |█████                                 █    █  █     ██ ███  ██ ███ ██           
263.0 |█████                                 █    ██ █     ██████  ██████ ██           
246.9 |█████                           █  █  ██   ██ █  █  ███████ ██████ ██ ██  ██████
230.9 |█████         █              █  █  █ ███   ██ █  ███████████████████████ ███████
214.9 |██████       ██              ██ █  ██████  ██ █ ████████████████████████ ███████
198.8 |██████      ███   █    ██    ██ ██ ██████  ████ ████████████████████████████████
182.8 |████████ █ ████   █    ██   ██████████████ █████████████████████████████████████
166.7 |████████ █ ██████ ███  ██   ████████████████████████████████████████████████████
150.7 |█████████████████ ███████   ████████████████████████████████████████████████████
134.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  251
   2 ms | ███████████  2565
   3 ms | ████████████████████████████████████████  9590
   4 ms | ████████████████████████████████████████  9551
   5 ms | ███████████████████████  5562
   6 ms | ███████████  2576
   7 ms | ███████  1728
   8 ms | █████  1080
   9 ms | ███  627
  10 ms | ██  381
  11 ms | █  277
  12 ms | █  174
  13 ms |   107
  14 ms |   89
  15 ms |   62
  16 ms |   35
  17 ms |   33
  18 ms |   20
  19 ms |   24
  20 ms |   20
  21 ms |   30
  22 ms |   8
  23 ms |   11
  24 ms |   11
  25 ms |   8
  26 ms |   11
  27 ms |   9
  28 ms |   8
  29 ms |   13
  30 ms |   6
  31 ms |   4
  32 ms |   5
  33 ms |   7
  34 ms |   4
  35 ms |   7
  36 ms |   3
  37 ms |   2
  38 ms |   3
  39 ms |   4
  40 ms |   2
  41 ms |   1
  43 ms |   1
  45 ms |   1
  48 ms |   2
  49 ms |   1
  56 ms |   1
  67 ms |   1
  70 ms |   1
  73 ms |   1
  74 ms |   2
  82 ms |   1
  83 ms |   1
 106 ms |   1
1602 ms |   1
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
- `entity_count_delta` = `87.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `34.82`
- `fps_harmonic_avg` = `192.85`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `350.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `10.65`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194784 ms  |  Sample ticks: 3600

**FPS**  avg `239.56`, min `47.21`, p50 `232.78`, p95 `343.47`, p99 `459.52`, 1%low `110.28`, 0.1%low `76.38`, std `68.58`

**Frame time (ms)**  avg `4.51`, p50 `4.30`, p95 `6.94`, p99 `8.18`, p99.9 `9.71`, max `21.18`

**Client tick (ms)**  avg `0.74`, p95 `1.04`, max `2.08`

**Memory**  start `6732 MB`, end `6102 MB`, peak `7400 MB`, GC `31 events / 218 ms`

**FPS over sampling window (ASCII):**

```
310.1 |                                        █            █                          
297.8 |                                       ██    ███    ███                         
285.5 |                                      ███   ████   ████████████                 
273.2 |                                     ████   ████   ███████████████  █████       
260.9 |                                    █████   ████   ████████████████ █████       
248.5 |█                               █████████   █████  ████████████████████████     
236.2 |█           █                ████████████   █████  █████████████████████████████
223.9 |█   █       █                █████████████  █████ ██████████████████████████████
211.6 |█   ██     ███               █████████████ █████████████████████████████████████
199.3 |█   ██     ███  ███    ██   ████████████████████████████████████████████████████
186.9 |█   ███ ███████ █████ ██████████████████████████████████████████████████████████
174.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  264
   2 ms | ███████  2338
   3 ms | ████████████████████████████████████████  13727
   4 ms | ██████████████████████████████████  11700
   5 ms | ███████████████████  6449
   6 ms | ██████████  3534
   7 ms | ████  1339
   8 ms | █  429
   9 ms |   74
  10 ms |   8
  11 ms |   1
  12 ms |   4
  13 ms |   1
  14 ms |   1
  15 ms |   2
  16 ms |   3
  17 ms |   3
  18 ms |   1
  19 ms |   2
  20 ms |   1
  21 ms |   1
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
- `entity_count_delta` = `18.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `110.28`
- `fps_harmonic_avg` = `221.57`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `350.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `76.38`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194199 ms  |  Sample ticks: 3600

**FPS**  avg `108.22`, min `22.25`, p50 `106.09`, p95 `135.75`, p99 `155.76`, 1%low `61.84`, 0.1%low `32.77`, std `16.60`

**Frame time (ms)**  avg `9.45`, p50 `9.43`, p95 `11.43`, p99 `12.49`, p99.9 `24.06`, max `44.94`

**Client tick (ms)**  avg `0.73`, p95 `0.95`, max `7.50`

**Memory**  start `4356 MB`, end `5085 MB`, peak `7397 MB`, GC `25 events / 204 ms`

**FPS over sampling window (ASCII):**

```
129.6 |                                                                   █            
126.3 |                                                                   ██████ █     
123.0 |                                                                   █████████████
119.7 |                                                        ███        █████████████
116.4 |                                                       ████     █  █████████████
113.1 |                                               ██    ███████ █████ █████████████
109.8 |    █                                     █   ████  ████████████████████████████
106.5 |█████     █        █            ██  █    ██   ████  ████████████████████████████
103.2 |██████    ███     ███     █     ██████  ███  ███████████████████████████████████
 99.8 |██████   ██████   ███   ████ █████████  ████ ███████████████████████████████████
 96.5 |████████ ███████████████████████████████████ ███████████████████████████████████
 93.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms |   8
   4 ms |   35
   5 ms |   64
   6 ms | ██  371
   7 ms | █████████████  1925
   8 ms | ██████████████████████████████  4580
   9 ms | ████████████████████████████████████████  6058
  10 ms | ████████████████████████████  4191
  11 ms | █████████  1437
  12 ms | ██  277
  13 ms |   46
  14 ms |   5
  15 ms |   6
  16 ms |   6
  17 ms |   3
  18 ms |   3
  19 ms |   3
  20 ms |   2
  21 ms |   7
  22 ms |   3
  23 ms |   7
  24 ms |   5
  25 ms |   2
  26 ms |   1
  27 ms |   2
  28 ms |   2
  30 ms |   1
  31 ms |   1
  33 ms |   1
  35 ms |   2
  39 ms |   1
  41 ms |   1
  44 ms |   1
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
- `entity_count_sample_start` = `72.00`
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
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `61.84`
- `fps_harmonic_avg` = `105.87`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `350.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `32.77`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195505 ms  |  Sample ticks: 3600

**FPS**  avg `88.51`, min `13.01`, p50 `85.46`, p95 `122.77`, p99 `146.74`, 1%low `43.82`, 0.1%low `20.79`, std `18.61`

**Frame time (ms)**  avg `11.75`, p50 `11.70`, p95 `15.07`, p99 `16.55`, p99.9 `34.97`, max `76.84`

**Client tick (ms)**  avg `0.72`, p95 `0.93`, max `2.91`

**Memory**  start `6385 MB`, end `7387 MB`, peak `7398 MB`, GC `25 events / 201 ms`

**FPS over sampling window (ASCII):**

```
129.6 |      █                                                                         
124.0 |    ████                                                                        
118.4 |   ██████                                                                       
112.8 |   █████████                                                                    
107.2 |   █████████                                                                    
101.6 |   █████████                                                            █       
 96.0 |   █████████                                    █     ██            ████████████
 90.4 |   ██████████                             ██  █████  ████ ██        ████████████
 84.9 | ████████████                        █    ███ ██████████████████████████████████
 79.3 |███████████████████ ███           █████  ███████████████████████████████████████
 73.7 |█████████████████████████████    ███████████████████████████████████████████████
 68.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms |   5
   4 ms |   19
   5 ms | █  42
   6 ms | ██  129
   7 ms | ██████  480
   8 ms | ██████████  742
   9 ms | ████████████████████  1526
  10 ms | ███████████████████████████████████  2642
  11 ms | ████████████████████████████████████████  3032
  12 ms | ████████████████████████████████████  2708
  13 ms | ██████████████████████████  1978
  14 ms | ████████████████  1198
  15 ms | ███████  555
  16 ms | ██  162
  17 ms |   32
  18 ms |   7
  19 ms |   3
  20 ms |   4
  21 ms |   3
  22 ms |   8
  23 ms |   5
  24 ms |   7
  25 ms |   5
  26 ms |   2
  27 ms |   3
  28 ms |   1
  29 ms |   4
  31 ms |   1
  32 ms |   1
  33 ms |   2
  34 ms |   1
  35 ms |   3
  36 ms |   1
  37 ms |   2
  39 ms |   1
  40 ms |   1
  41 ms |   1
  47 ms |   1
  51 ms |   1
  53 ms |   1
  54 ms |   1
  64 ms |   1
  70 ms |   1
  76 ms |   1
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
- `entity_count_sample_start` = `71.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `18.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `43.82`
- `fps_harmonic_avg` = `85.13`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `350.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `20.79`

