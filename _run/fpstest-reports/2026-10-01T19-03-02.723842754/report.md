# MC Benchmark Core session — 2026-10-01T19:38:30.415139413+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1364.6 | 47.1 | 34.0 | 18.87 | 0.82 | 75 | 1187 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 1001.4 | 48.0 | 39.8 | 19.02 | 0.83 | 54 | 591 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 887.8 | 49.1 | 36.7 | 18.42 | 0.78 | 55 | 148 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 593.8 | 46.7 | 36.8 | 19.20 | 0.78 | 55 | 263 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 1027.2 | 49.9 | 41.6 | 18.27 | 0.77 | 56 | 903 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 975.7 | 48.8 | 40.4 | 18.73 | 0.60 | 50 | 451 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 894.1 | 49.0 | 36.8 | 18.27 | 0.81 | 51 | 1115 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 429.1 | 44.7 | 35.1 | 19.66 | 1.27 | 46 | 738 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1211.0 | 46.3 | 30.2 | 18.60 | 3.39 | 47 | 394 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 226.8 | 32.0 | 25.5 | 25.50 | 4.21 | 27 | 1169 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 649.6 | 48.5 | 40.8 | 18.77 | 1.07 | 52 | 1078 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 597.4 | 47.9 | 34.8 | 18.82 | 0.56 | 40 | 1054 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 664.1 | 44.0 | 27.5 | 19.29 | 3.66 | 26 | 791 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 815.0 | 47.3 | 30.3 | 18.06 | 2.75 | 23 | 471 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1000.4 | 23.6 | 20.2 | 37.04 | 14.60 | 23 | 608 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 958.1 | 22.0 | 18.7 | 40.50 | 15.12 | 20 | 96 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1393.1 | 48.8 | 33.8 | 18.10 | 1.98 | 46 | 906 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1333.6 | 46.0 | 29.4 | 18.92 | 2.13 | 45 | 596 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 828.5 | 49.3 | 37.0 | 18.21 | 0.68 | 49 | 1178 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1799.8 | 50.2 | 43.3 | 18.20 | 0.33 | 41 | 910 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1846.3 | 52.3 | 42.6 | 17.27 | 0.32 | 45 | 292 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1554.7 | 47.6 | 39.4 | 19.23 | 0.38 | 39 | 1087 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1724.8 | 51.1 | 41.7 | 17.76 | 0.34 | 46 | 209 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 1720.4 | 46.9 | 36.0 | 18.24 | 0.42 | 40 | 411 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1510.2 | 47.0 | 36.4 | 18.68 | 0.43 | 35 | 396 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 1852.8 | 51.1 | 38.8 | 16.89 | 0.36 | 30 | 1414 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 1694.5 | 49.1 | 35.1 | 17.35 | 0.36 | 30 | 374 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 1787.9 | 50.3 | 40.3 | 17.34 | 0.36 | 27 | 1158 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 1730.5 | 49.5 | 39.5 | 17.84 | 0.37 | 27 | 1145 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 1865.1 | 50.5 | 39.8 | 17.47 | 0.39 | 23 | 673 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 1587.2 | 44.5 | 23.6 | 18.36 | 0.36 | 25 | 1205 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 1631.5 | 49.0 | 35.0 | 17.52 | 0.41 | 20 | 1745 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 1920.1 | 50.8 | 39.4 | 16.99 | 0.34 | 21 | 244 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 1596.1 | 48.1 | 35.6 | 18.06 | 0.43 | 21 | 766 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 1887.7 | 50.2 | 40.9 | 17.33 | 0.36 | 21 | 943 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1910.4 | 51.5 | 41.5 | 17.69 | 0.28 | 22 | 854 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 189.8 | 25.7 | 21.7 | 32.29 | 4.01 | 20 | 1215 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1766.3 | 49.3 | 38.8 | 18.37 | 0.31 | 22 | 627 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1827.4 | 51.4 | 44.2 | 17.87 | 0.34 | 24 | 1778 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1562.4 | 49.8 | 40.6 | 18.31 | 0.33 | 21 | 1964 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1440.6 | 51.1 | 44.3 | 18.21 | 0.32 | 25 | 440 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 180.4 | 18.9 | 6.6 | 37.51 | 0.97 | 233 | 883 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 187.0 | 21.1 | 11.5 | 39.48 | 0.90 | 235 | 2710 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 112.2 | 21.1 | 17.1 | 45.35 | 0.73 | 27 | 2276 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 95.2 | 17.9 | 14.0 | 52.90 | 0.71 | 26 | 1450 |

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

Category: **Particles**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `1364.58`, min `25.33`, p50 `1423.04`, p95 `2092.73`, p99 `2388.41`, 1%low `47.08`, 0.1%low `34.05`, std `509.45`

**Frame time (ms)**  avg `1.61`, p50 `0.70`, p95 `5.55`, p99 `18.87`, p99.9 `23.49`, max `39.48`

**Client tick (ms)**  avg `0.82`, p95 `1.44`, max `7.83`

**Memory**  start `604 MB`, end `663 MB`, peak `1791 MB`, GC `75 events / 305 ms`

**FPS over sampling window (ASCII):**

```
1902.0 |                                                                   █            
1804.3 |                                                                █  █            
1706.7 |                                                      ███  ███  █ ██  █         
1609.0 |                                     █           ██   ███ █████ █████ █         
1511.4 |                                  █  █ ██        ████ █████████ ███████    █    
1413.8 |                                 ██████████████ ███████████████████████    █  ██
1316.1 |            █ █ ██   █      ███  ███████████████████████████████████████ ███████
1218.5 |    █  ██████ █████  █    ██████ ███████████████████████████████████████████████
1120.9 |    █ █████████████ ███ ████████████████████████████████████████████████████████
1023.2 |   ████████████████████ ████████████████████████████████████████████████████████
925.6 |███████████████████████ ████████████████████████████████████████████████████████
827.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10304
   1 ms | ████  1100
   2 ms | █  184
   3 ms |   65
   4 ms |   91
   5 ms |   65
   6 ms |   19
   7 ms |   10
   8 ms |   5
  11 ms |   1
  12 ms |   1
  13 ms |   16
  14 ms |   56
  15 ms |   96
  16 ms | █  130
  17 ms |   89
  18 ms |   62
  19 ms |   50
  20 ms |   27
  21 ms |   18
  22 ms |   9
  23 ms |   5
  24 ms |   4
  26 ms |   1
  27 ms |   1
  29 ms |   1
  30 ms |   1
  38 ms |   1
  39 ms |   2
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 1551 | 1066.0 | 18.51 |
| `flame` | 160 | 1551 | 1221.5 | 17.88 |
| `dripping_water` | 240 | 1551 | 1159.8 | 21.01 |
| `dragon_breath` | 160 | 1551 | 1393.6 | 18.50 |
| `end_rod` | 240 | 1551 | 1442.3 | 19.47 |
| `portal` | 160 | 1551 | 1586.3 | 17.70 |
| `ALL_TOGETHER` | 1680 | 1551 | 1644.7 | 19.05 |
| `sculk_charge_pop` | 240 | 1551 | 1401.9 | 17.81 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `47.08`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `0.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `620.69`
- `fps_0p1pct_low` = `34.05`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1001.36`, min `32.25`, p50 `1056.62`, p95 `1533.36`, p99 `1639.44`, 1%low `48.03`, 0.1%low `39.82`, std `370.62`

**Frame time (ms)**  avg `2.02`, p50 `0.95`, p95 `14.69`, p99 `19.02`, p99.9 `22.92`, max `31.01`

**Client tick (ms)**  avg `0.83`, p95 `1.39`, max `1.96`

**Memory**  start `985 MB`, end `1461 MB`, peak `1577 MB`, GC `54 events / 295 ms`

**FPS over sampling window (ASCII):**

```
1197.5 |                                                           █ █           █      
1154.2 |         █                                      ██         █ █     █   █ █  █   
1110.9 |        ██             █                        ██   █     ███ █ ████  █ █  █   
1067.6 |        ██        █    █       █     █   █  █ ████  ██     ██████████  ███  █   
1024.4 |    █ █ ██ █      █    █       █ █   ███ ██ █ ████  ███   ████████████ ████ █  █
981.1 |    ███ ████      █ █  █       ████  ██████ █ █████ ███ █ ███████████████████ ██
937.8 |  ██████████  ██ ██ █ ██   █ ██████  ██████ ███████ ███ █████████████████████ ██
894.5 |█ ██████████ ███ █████████ █ ██████  ██████████████ █████████████████████████ ██
851.2 |█ ██████████ █████████████ █ ██████ ████████████████████████████████████████████
807.9 |█ ██████████ ███████████████████████████████████████████████████████████████████
764.6 |█ ██████████████████████████████████████████████████████████████████████████████
721.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5883
   1 ms | ████████████████████  2902
   2 ms | ██  263
   3 ms | █  90
   4 ms | █  80
   5 ms |   68
   6 ms |   21
   7 ms |   9
   8 ms |   3
   9 ms |   3
  10 ms |   5
  11 ms |   3
  12 ms |   1
  13 ms |   18
  14 ms |   55
  15 ms | █  101
  16 ms | █  94
  17 ms | █  115
  18 ms |   72
  19 ms |   43
  20 ms |   24
  21 ms |   14
  22 ms |   10
  23 ms |   3
  24 ms |   3
  26 ms |   1
  27 ms |   1
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `48.03`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `39.82`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `494.31`
- `preload_duration_ms` = `35.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `887.76`, min `24.16`, p50 `921.09`, p95 `1309.73`, p99 `1377.68`, 1%low `49.06`, 0.1%low `36.67`, std `326.16`

**Frame time (ms)**  avg `2.18`, p50 `1.09`, p95 `15.03`, p99 `18.42`, p99.9 `22.12`, max `41.40`

**Client tick (ms)**  avg `0.78`, p95 `1.23`, max `2.37`

**Memory**  start `1499 MB`, end `1304 MB`, peak `1647 MB`, GC `55 events / 296 ms`

**FPS over sampling window (ASCII):**

```
1089.7 |                    █                                                           
1049.4 |     █              █                                                           
1009.1 | ██  ██             ██       █ █ █                   █                          
968.7 | ███ ██  █     █    ██       █ ███    █       █    █ █                          
928.4 | ██████  █    ██    ██       █████ ██ █ █████ ███  █████                        
888.1 | ███████ █    ███ ████   █  █████████ ███████████  █████ ██    █ ██     █   █  █
847.8 | █████████    ████████ ███ ███████████████████████ █████ █████ █████  █████ ██ █
807.5 | █████████    ████████████ ███████████████████████████████████ █████  █████ ██ █
767.1 | █████████   ███████████████████████████████████████████████████████ ███████████
726.8 |██████████  ████████████████████████████████████████████████████████████████████
686.5 |██████████  ████████████████████████████████████████████████████████████████████
646.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████████  3549
   1 ms | ████████████████████████████████████████  4515
   2 ms | ███  301
   3 ms | █  87
   4 ms | █  75
   5 ms |   36
   6 ms |   22
   7 ms |   2
   8 ms |   6
   9 ms |   7
  10 ms |   6
  11 ms |   2
  12 ms |   1
  13 ms |   23
  14 ms | █  79
  15 ms | █  120
  16 ms | █  145
  17 ms | █  78
  18 ms | █  57
  19 ms |   30
  20 ms |   17
  21 ms |   7
  22 ms |   4
  23 ms |   2
  26 ms |   2
  36 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `49.06`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `36.67`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `458.76`
- `preload_duration_ms` = `64.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `593.80`, min `25.11`, p50 `609.33`, p95 `975.20`, p99 `1058.35`, 1%low `46.67`, 0.1%low `36.76`, std `251.48`

**Frame time (ms)**  avg `3.11`, p50 `1.64`, p95 `16.19`, p99 `19.20`, p99.9 `23.32`, max `39.82`

**Client tick (ms)**  avg `0.78`, p95 `1.13`, max `1.79`

**Memory**  start `1372 MB`, end `830 MB`, peak `1636 MB`, GC `55 events / 294 ms`

**FPS over sampling window (ASCII):**

```
864.1 |█  █   █                                                                        
825.2 |█  ██ ███ █                                                                     
786.3 |█  ██████ ██                                                                    
747.4 |██ █████████                                                                    
708.4 |██ █████████                                                                    
669.5 |████████████                               █     █     █     █ █        █       
630.6 |████████████       █                       █    ███   ██  █  ███   ███  ██      
591.7 |████████████  █    ███  █                ███ █  ████ ██████  ███  █████ ████ ██ 
552.8 |████████████  █   ████ ██             █ ██████ ████████████  ████ █████ ████ ██ 
513.9 |██████████████████████ ██ █     █    ██ ████████████████████ ███████████████ ███
475.0 |██████████████████████ ███████ ███ █ ███████████████████████████████████████████
436.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  223
   1 ms | ████████████████████████████████████████  4379
   2 ms | ████████  905
   3 ms | ██  180
   4 ms | █  61
   5 ms |   37
   6 ms |   36
   7 ms |   11
   8 ms |   7
   9 ms |   2
  10 ms |   5
  11 ms |   1
  12 ms |   2
  13 ms |   23
  14 ms | █  88
  15 ms | █  117
  16 ms | █  142
  17 ms | █  95
  18 ms |   40
  19 ms |   20
  20 ms |   24
  21 ms |   14
  22 ms |   2
  23 ms |   7
  24 ms |   1
  25 ms |   1
  26 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.67`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `152.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `36.76`
- `entity_count_sample_end` = `152.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `321.24`
- `preload_duration_ms` = `64.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1027.19`, min `37.46`, p50 `1059.29`, p95 `1512.11`, p99 `1594.21`, 1%low `49.93`, 0.1%low `41.64`, std `360.08`

**Frame time (ms)**  avg `1.89`, p50 `0.94`, p95 `14.03`, p99 `18.27`, p99.9 `22.00`, max `26.70`

**Client tick (ms)**  avg `0.77`, p95 `1.19`, max `1.85`

**Memory**  start `812 MB`, end `927 MB`, peak `1715 MB`, GC `56 events / 314 ms`

**FPS over sampling window (ASCII):**

```
1261.8 |                     █                                                          
1224.8 |                   █ █                                                          
1187.8 |                 █ ███                   █                                      
1150.8 |                 █ ███                   █ █                                    
1113.8 |   █     █       █████                █  ███      █  █                        █ 
1076.8 |█  █    ██       █████ █    █         ███████   ███  █            █   █  █    █ 
1039.8 |█ ██   ████      █████ █ ████  █      ███████ █ ███  █ ██ ██ █  █ ██  █  ██ █ █ 
1002.8 |█████ █████  █   █████ █ ████ ██   █ ████████ █████ ██ ██ █████ █ ███ █  ██ ███ 
965.7 |█████ ████████  ████████ ████ ███  █ ██████████████ █████ ███████████ █  ██ ████
928.7 |█████ ████████  ████████ ████ ██████ ██████████████ █████████████████ █████ ████
891.7 |███████████████████████████████████████████████████ ████████████████████████████
854.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6534
   1 ms | ██████████████████  3016
   2 ms | ██  287
   3 ms |   78
   4 ms |   48
   5 ms |   40
   6 ms |   8
   7 ms |   2
   8 ms |   4
   9 ms |   3
  10 ms |   2
  11 ms |   2
  12 ms |   5
  13 ms |   30
  14 ms |   78
  15 ms | █  129
  16 ms | █  119
  17 ms |   77
  18 ms |   58
  19 ms |   28
  20 ms |   24
  21 ms |   8
  22 ms |   5
  23 ms |   1
  25 ms |   3
  26 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `49.93`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `41.64`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `529.51`
- `preload_duration_ms` = `23.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `975.74`, min `37.04`, p50 `1018.68`, p95 `1476.29`, p99 `1560.17`, 1%low `48.77`, 0.1%low `40.37`, std `356.52`

**Frame time (ms)**  avg `2.06`, p50 `0.98`, p95 `15.09`, p99 `18.73`, p99.9 `22.91`, max `27.00`

**Client tick (ms)**  avg `0.60`, p95 `0.90`, max `6.03`

**Memory**  start `1321 MB`, end `1664 MB`, peak `1773 MB`, GC `50 events / 303 ms`

**FPS over sampling window (ASCII):**

```
1239.9 |                                               █                                
1198.1 |                                               █ █     █                        
1156.4 |                                              ██ █     █                        
1114.7 |                                              ████   █ █                   █ █ █
1073.0 |             █    █                          ██████ ██ █        █     █    ███ █
1031.3 |             █   ██     █   █   █            ██████ ██ █    █ █ █ █   █   ████ █
989.6 |      █      █  ███ █   █   █   █  █ █ █     ██████ ███████ ███ █ ██ ██   ████ █
947.9 |██ █  ██   █ █ ████ █  ██ █ █ █ ████ █ ██  █ ██████ ███████ ███ █ █████ ██████ █
906.2 |██ █████ █ ████████ ███████ ███ ████ ██████████████████████ █████ ████████████ █
864.5 |██ ████████████████ ███████ ███ ████ ████████████████████████████ ██████████████
822.8 |███████████████████████████ ████████ ████████████████████████████ ██████████████
781.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5209
   1 ms | ███████████████████████████  3476
   2 ms | ██  242
   3 ms |   53
   4 ms | █  68
   5 ms | █  70
   6 ms |   15
   7 ms |   2
   8 ms |   4
   9 ms |   5
  10 ms |   3
  11 ms |   2
  12 ms |   1
  13 ms |   17
  14 ms |   56
  15 ms | █  99
  16 ms | █  132
  17 ms | █  113
  18 ms | █  69
  19 ms |   39
  20 ms |   19
  21 ms |   8
  22 ms |   10
  23 ms |   2
  24 ms |   1
  25 ms |   2
  26 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `48.77`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `40.37`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `486.00`
- `preload_duration_ms` = `60.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `894.13`, min `21.94`, p50 `929.09`, p95 `1323.43`, p99 `1378.30`, 1%low `48.97`, 0.1%low `36.77`, std `327.17`

**Frame time (ms)**  avg `2.15`, p50 `1.08`, p95 `14.88`, p99 `18.27`, p99.9 `22.41`, max `45.57`

**Client tick (ms)**  avg `0.81`, p95 `1.26`, max `9.10`

**Memory**  start `720 MB`, end `1426 MB`, peak `1835 MB`, GC `51 events / 298 ms`

**FPS over sampling window (ASCII):**

```
1039.8 |                              ██            █                    █              
1006.8 |      █                      ███ █    █     █     █              █              
973.8 |      █                 █   ████ █    ██  █ █     █       █      █              
940.8 | █   ██     ██      █   █ █ ████ █ ██ ██  ███   ███ ██    █   █  █           █ █
907.8 | █  ████  █ ██  █ ███ █ █ ██████ █ ██████ ███   ██████  █ ███ █  █ █ █  █    █ █
874.7 |██  ████  █ ██  █ ███ █ ████████ █ ████████████ ██████  █████ ██ ███ █  █    █ █
841.7 |████████ ████████ ███ █ ███████████████████████ ██████  █████ ██ ███ ██ ██ █████
808.7 |████████ ████████████ █ ██████████████████████████████  █████ ██████ █████ █████
775.7 |████████ ██████████████ ██████████████████████████████  █████ ████████████ █████
742.7 |███████████████████████████████████████████████████████ █████ ████████████ █████
709.7 |█████████████████████████████████████████████████████████████ ████████████ █████
676.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████████████  3482
   1 ms | ████████████████████████████████████████  4717
   2 ms | ███  305
   3 ms | █  79
   4 ms | █  65
   5 ms |   34
   6 ms |   14
   7 ms |   6
   8 ms |   3
   9 ms |   6
  10 ms |   5
  11 ms |   2
  12 ms |   2
  13 ms |   33
  14 ms | █  91
  15 ms | █  140
  16 ms | █  109
  17 ms | █  88
  18 ms |   44
  19 ms |   29
  20 ms |   14
  21 ms |   11
  22 ms |   3
  23 ms |   3
  24 ms |   2
  25 ms |   1
  26 ms |   2
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `48.97`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `36.77`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `464.53`
- `preload_duration_ms` = `49.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `429.08`, min `29.78`, p50 `452.61`, p95 `676.94`, p99 `724.16`, 1%low `44.72`, 0.1%low `35.06`, std `179.74`

**Frame time (ms)**  avg `3.98`, p50 `2.21`, p95 `16.64`, p99 `19.66`, p99.9 `25.62`, max `33.58`

**Client tick (ms)**  avg `1.27`, p95 `1.63`, max `10.29`

**Memory**  start `1168 MB`, end `1303 MB`, peak `1907 MB`, GC `46 events / 287 ms`

**FPS over sampling window (ASCII):**

```
533.4 |                                       █                                        
514.9 |                                       █     █   █                              
496.4 |                                       ████  █   ███         █                █ 
477.9 |                                       ████  ██ ██████   ███ █  █      █    █ ██
459.4 |          █     █    ██        █       █████ ██ ██████   ███ █  █  █   █  ███ ██
440.8 |          █    ██    ██        █    █  █████ ██ ██████   ███ █  █  █   ██████ ██
422.3 |█ █    █  █  █ ███   ███   █   █   ██  █████ ██████████ ████ █ █████   ██████ ██
403.8 |█ ██  ██  █  ███████ ███   █   █   ███ █████████████████████████████  ███████ ██
385.3 |█████ █████  ███████ ███ ████████  █████████████████████████████████  ██████████
366.8 |███████████ ████████ ███ ███████████████████████████████████████████████████████
348.3 |███████████ ████████ ███ ███████████████████████████████████████████████████████
329.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██████████████████████████████████  1809
   2 ms | ████████████████████████████████████████  2102
   3 ms | █████  281
   4 ms | ███  142
   5 ms | █  60
   6 ms | █  33
   7 ms |   9
   8 ms |   4
   9 ms |   2
  10 ms |   2
  11 ms |   2
  12 ms |   2
  13 ms |   23
  14 ms | ██  106
  15 ms | ██  130
  16 ms | ██  111
  17 ms | ██  81
  18 ms | █  50
  19 ms | █  36
  20 ms |   10
  21 ms |   9
  22 ms |   10
  23 ms |   1
  24 ms |   4
  25 ms |   2
  26 ms |   2
  27 ms |   1
  29 ms |   1
  33 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `44.72`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `35.06`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `251.23`
- `preload_duration_ms` = `30.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `1211.00`, min `25.30`, p50 `1250.19`, p95 `1781.43`, p99 `1875.05`, 1%low `46.32`, 0.1%low `30.22`, std `431.84`

**Frame time (ms)**  avg `1.78`, p50 `0.80`, p95 `13.13`, p99 `18.60`, p99.9 `26.37`, max `39.53`

**Client tick (ms)**  avg `3.39`, p95 `4.47`, max `10.10`

**Memory**  start `1543 MB`, end `1259 MB`, peak `1938 MB`, GC `47 events / 298 ms`

**FPS over sampling window (ASCII):**

```
1453.6 |                                █                                               
1407.8 |               █             █  █  █                                            
1362.0 |               █          █  █ ██ ██               █                  █         
1316.2 |   █       █  ███     █   █  ████ ██              ██                  █     █   
1270.4 | █ █  █    ██████     ██  █  ████ ██       ██     ███  █    █ ██      █     █   
1224.6 | ███ ██ █ ███████  █  ██ ██  ████ ██  █    ██ ██  ███  █    █ ███     █     █   
1178.8 | ██████ █████████  █  ██████ ██████████ █  ██ ██  ███  ███  █ █████   █ ██  █ ██
1133.0 |███████ █████████  █ ████████████████████████ ██  ███  ████ █ ██████ ██████ ████
1087.1 |█████████████████ ██ ██████████████████████████████████████ █ ██████ ███████████
1041.3 |████████████████████ ████████████████████████████████████████ ██████ ███████████
995.5 |█████████████████████████████████████████████████████████████ ██████████████████
949.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9150
   1 ms | █████  1076
   2 ms |   25
   3 ms |   76
   4 ms | █  201
   5 ms |   91
   6 ms |   18
   7 ms |   11
   8 ms |   13
   9 ms |   4
  10 ms |   5
  11 ms |   5
  12 ms |   5
  13 ms |   59
  14 ms |   89
  15 ms |   91
  16 ms |   103
  17 ms |   77
  18 ms |   57
  19 ms |   34
  20 ms |   17
  21 ms |   10
  22 ms |   10
  23 ms |   5
  24 ms |   1
  25 ms |   1
  26 ms |   2
  29 ms |   1
  30 ms |   2
  32 ms |   1
  33 ms |   2
  34 ms |   1
  36 ms |   1
  37 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.32`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `30.22`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `562.26`
- `preload_duration_ms` = `52.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `226.81`, min `23.49`, p50 `249.99`, p95 `388.25`, p99 `453.90`, 1%low `32.05`, 0.1%low `25.54`, std `111.02`

**Frame time (ms)**  avg `6.99`, p50 `4.00`, p95 `19.68`, p99 `25.50`, p99.9 `36.29`, max `42.57`

**Client tick (ms)**  avg `4.21`, p95 `6.57`, max `8.38`

**Memory**  start `771 MB`, end `1224 MB`, peak `1940 MB`, GC `27 events / 131 ms`

**FPS over sampling window (ASCII):**

```
339.1 | █          █                                                                   
322.5 | █          █                                                                   
306.0 |███  ██  █  █ █                                                                 
289.5 |████ ██  █  █ █                                                                 
273.0 |████████ ██ ████ █   █                                                          
256.5 |███████████ ██████  ███                                                         
239.9 |██████████████████  ███     █       █              █       ██    ██            █
223.4 |███████████████████ ███████ █████  ██            █ █    █ ███  █ ██   █      █ █
206.9 |█████████████████████████████████████ █       █ █████ ████████ █ ██  ██      █ █
190.4 |████████████████████████████████████████      █ █████ ██████████████████    ████
173.9 |█████████████████████████████████████████████████████████████████████████  █████
157.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   9
   2 ms | ██████████████████  441
   3 ms | ████████████████████████████████████████  981
   4 ms | ███████████████████  469
   5 ms | ██████  144
   6 ms | ██  47
   7 ms | ██  52
   8 ms | ██  58
   9 ms | ██  39
  10 ms | █  16
  11 ms | █  18
  12 ms | █  16
  13 ms | ██  42
  14 ms | ███  77
  15 ms | ███  77
  16 ms | ███  74
  17 ms | ███  73
  18 ms | ██  58
  19 ms | ██  39
  20 ms | ██  37
  21 ms | █  25
  22 ms | █  21
  23 ms |   10
  24 ms |   8
  25 ms |   9
  26 ms |   3
  27 ms |   1
  28 ms |   1
  30 ms |   1
  31 ms |   6
  32 ms |   1
  33 ms |   1
  34 ms |   2
  35 ms |   3
  36 ms |   2
  38 ms |   1
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `25.54`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `143.14`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `32.05`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `649.62`, min `38.19`, p50 `689.67`, p95 `996.67`, p99 `1063.48`, 1%low `48.46`, 0.1%low `40.81`, std `256.33`

**Frame time (ms)**  avg `2.84`, p50 `1.45`, p95 `15.62`, p99 `18.77`, p99.9 `23.17`, max `26.18`

**Client tick (ms)**  avg `1.07`, p95 `1.41`, max `11.51`

**Memory**  start `852 MB`, end `1098 MB`, peak `1930 MB`, GC `52 events / 328 ms`

**FPS over sampling window (ASCII):**

```
801.6 |                            █                                                   
774.7 |                            █                              █                    
747.8 |                 █          █               █              █           █        
720.8 |                 █        ███              ██      █ ███ █ █          ███ █     
693.9 |    ██          ███       ███        █     ██  ██ ██ ███ █ █          ███ █     
667.0 | █  ████      █████      ████ █ █   ██     ██████ ██████ ███ █  █  █ ████ █     
640.0 | ███████      █████ ██ █ ██████ █ █████    ██████ ██████ ███ █ ██ ██ ██████    █
613.1 | █████████  █ █████ ██ █ ████████ ███████ ███████ ██████ ███ █ ██ ██ ██████  █ █
586.2 |██████████ ████████ █████████████ ███████ ██████████████ ███ ██████████████ ██ █
559.2 |██████████ ████████ ███████████████████████████████████████████████████████ ████
532.3 |██████████ ████████████████████████████████████████████████████████████████ ████
505.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  334
   1 ms | ████████████████████████████████████████  5233
   2 ms | ████  576
   3 ms | █  165
   4 ms | █  67
   5 ms |   43
   6 ms |   21
   7 ms |   13
   8 ms |   3
   9 ms |   1
  10 ms |   7
  11 ms |   1
  12 ms |   3
  13 ms |   37
  14 ms | █  104
  15 ms | █  131
  16 ms | █  99
  17 ms | █  100
  18 ms |   40
  19 ms |   26
  20 ms |   21
  21 ms |   8
  22 ms |   2
  23 ms |   5
  24 ms |   1
  25 ms |   2
  26 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `40.81`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `34.00`
- `fps_1pct_low` = `48.46`
- `fps_harmonic_avg` = `352.31`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `597.39`, min `23.80`, p50 `625.13`, p95 `899.80`, p99 `957.05`, 1%low `47.87`, 0.1%low `34.78`, std `234.56`

**Frame time (ms)**  avg `3.01`, p50 `1.60`, p95 `15.70`, p99 `18.82`, p99.9 `23.33`, max `42.02`

**Client tick (ms)**  avg `0.56`, p95 `0.74`, max `1.09`

**Memory**  start `925 MB`, end `1205 MB`, peak `1979 MB`, GC `40 events / 244 ms`

**FPS over sampling window (ASCII):**

```
778.8 |            ██                                                                  
745.2 |  █  █ █   ███                                                                  
711.6 |  ███████ ████                                                                  
678.0 |██████████████                                                ███   █    █ █    
644.4 |███████████████                              ████  █  ████  █ ████ ██    ███  █ 
610.8 |████████████████                         ██ ████████  ████ ██ ███████    ███  ██
577.2 |████████████████              █         ███ ████████  ███████ ███████ █ ████ ███
543.7 |████████████████  █           █     ██ ████ ████████ ███████████████████████ ███
510.1 |█████████████████ █  ████     █   █ ████████████████ ███████████████████████████
476.5 |█████████████████ ██ ███████  ██████████████████████████████████████████████████
442.9 |█████████████████ ██████████ ███████████████████████████████████████████████████
409.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   10
   1 ms | ████████████████████████████████████████  4948
   2 ms | ███████  845
   3 ms | █  120
   4 ms |   52
   5 ms |   60
   6 ms |   30
   7 ms |   8
   8 ms |   1
   9 ms |   1
  10 ms |   3
  11 ms |   5
  12 ms |   5
  13 ms |   34
  14 ms | █  99
  15 ms | █  142
  16 ms | █  89
  17 ms | █  79
  18 ms | █  69
  19 ms |   28
  20 ms |   14
  21 ms |   4
  22 ms |   3
  23 ms |   3
  24 ms |   1
  25 ms |   1
  26 ms |   1
  35 ms |   1
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `34.78`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `30.00`
- `fps_harmonic_avg` = `332.59`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `47.87`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `664.05`, min `22.92`, p50 `706.15`, p95 `1065.11`, p99 `1253.51`, 1%low `43.98`, 0.1%low `27.45`, std `299.57`

**Frame time (ms)**  avg `2.98`, p50 `1.42`, p95 `15.23`, p99 `19.29`, p99.9 `29.34`, max `43.62`

**Client tick (ms)**  avg `3.66`, p95 `6.39`, max `13.47`

**Memory**  start `1200 MB`, end `1067 MB`, peak `1992 MB`, GC `26 events / 137 ms`

**FPS over sampling window (ASCII):**

```
1119.1 |                                                                               █
1045.1 |                                                                             █ █
971.1 |                                                                             ███
897.1 |                           █   █                                       █████████
823.2 |                          ██ █████ █ █                           ██  ███████████
749.2 |             █ ████      █████████████                    █     ████████████████
675.2 |          █ ██████████  ██████████████                 █████    ████████████████
601.2 |          ████████████  ██████████████          █     ██████  ██████████████████
527.3 |█        ██████████████████████████████        ██  █ ████████ ██████████████████
453.3 |██   █████████████████████████████████████ █████████████████████████████████████
379.3 |██   ███████████████████████████████████████████████████████████████████████████
305.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████  653
   1 ms | ████████████████████████████████████████  4277
   2 ms | ███████  778
   3 ms | ██  162
   4 ms | █  88
   5 ms | █  80
   6 ms |   31
   7 ms |   23
   8 ms |   10
   9 ms |   11
  10 ms |   8
  11 ms |   1
  12 ms |   18
  13 ms | █  81
  14 ms | █  131
  15 ms | █  112
  16 ms | █  78
  17 ms | █  60
  18 ms |   35
  19 ms |   37
  20 ms |   18
  21 ms |   5
  22 ms |   4
  23 ms |   5
  24 ms |   1
  25 ms |   1
  26 ms |   1
  27 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
  34 ms |   1
  35 ms |   1
  37 ms |   1
  41 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `43.98`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.13`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `27.45`
- `preset_long` = `0.00`
- `preload_duration_ms` = `127.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `336.12`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `815.02`, min `24.46`, p50 `868.33`, p95 `1319.66`, p99 `1392.39`, 1%low `47.35`, 0.1%low `30.35`, std `352.88`

**Frame time (ms)**  avg `2.45`, p50 `1.15`, p95 `14.40`, p99 `18.06`, p99.9 `25.53`, max `40.88`

**Client tick (ms)**  avg `2.75`, p95 `4.55`, max `9.06`

**Memory**  start `1515 MB`, end `1691 MB`, peak `1987 MB`, GC `23 events / 122 ms`

**FPS over sampling window (ASCII):**

```
1253.9 |                            ███                                                 
1176.8 |                           █████                                   ██           
1099.8 |                          ████████                           █     ██           
1022.7 |                   █     █████████                         ███     ███     ██   
945.6 |                ████     ██████████                   ████████    ████████ ██   
868.6 |               ██████   ███████████                  █████████    ███████████  █
791.5 |          ██ ████████ ██████████████             █   █████████    ███████████  █
714.4 |        ████████████████████████████             █  ███████████ ████████████████
637.4 |        █████████████████████████████  ██     ██████████████████████████████████
560.3 |       ██████████████████████████████ ████ █████████████████████████████████████
483.2 |█   █ ███████████████████████████████ ██████████████████████████████████████████
406.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████████████████  2835
   1 ms | ████████████████████████████████████████  3864
   2 ms | █████  491
   3 ms | ██  157
   4 ms | █  95
   5 ms | █  53
   6 ms |   38
   7 ms |   11
   8 ms |   7
   9 ms |   5
  10 ms |   3
  11 ms |   5
  12 ms |   34
  13 ms | █  101
  14 ms | █  140
  15 ms | █  107
  16 ms | █  73
  17 ms | █  57
  18 ms |   30
  19 ms |   23
  20 ms |   14
  21 ms |   2
  22 ms |   3
  23 ms |   2
  25 ms |   4
  29 ms |   2
  31 ms |   2
  37 ms |   2
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `47.35`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.58`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `30.35`
- `preset_long` = `0.00`
- `preload_duration_ms` = `72.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `408.05`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1000.37`, min `19.38`, p50 `859.30`, p95 `2273.47`, p99 `2811.40`, 1%low `23.55`, 0.1%low `20.16`, std `822.62`

**Frame time (ms)**  avg `5.19`, p50 `1.16`, p95 `23.38`, p99 `37.04`, p99.9 `48.57`, max `51.60`

**Client tick (ms)**  avg `14.60`, p95 `20.62`, max `27.00`

**Memory**  start `1415 MB`, end `822 MB`, peak `2023 MB`, GC `23 events / 108 ms`

**FPS over sampling window (ASCII):**

```
2483.2 |                                                                              ██
2268.2 |                                                                    █         ██
2053.2 |                                         █                          █ █       ██
1838.2 |                                        ██       █          ███     █ ██ █    ██
1623.2 |           █             █        █     ███    ███    ██    ████    ██████    ██
1408.1 |  ██       █             ██       ███   ████   ████   ██    ████    ██████    ██
1193.1 |  ██   █   █    █   █   ███   █   ███   ████   ████   ██    █████   ██████   ███
978.1 |████   █   ██  ██   █   ███   █   ███   ████   ████  ████   █████   ██████   ███
763.1 |████   █   ██  ██   ██  ███  ███  ████  █████  ████  ████  ██████   ███████  ███
548.1 |████   ██ ███  ███ ███  ███  ███  ████  █████ █████  █████ ███████  ███████  ███
333.0 |█████  ██ ████ ███ ████ ████ ████ ████ ██████ ██████ █████ ███████  ████████ ███
118.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1829
   1 ms | ██████████  451
   2 ms | ████  204
   3 ms | ███  158
   4 ms | █████  226
   5 ms | █████  234
   6 ms | █  34
   7 ms |   7
   8 ms |   4
   9 ms |   8
  10 ms |   11
  11 ms |   1
  12 ms |   21
  13 ms | █  41
  14 ms | ██  73
  15 ms | ██  71
  16 ms | ██  89
  17 ms | █  66
  18 ms | █  38
  19 ms | █  37
  20 ms | █  29
  21 ms |   16
  22 ms |   10
  23 ms |   14
  24 ms |   20
  25 ms |   17
  26 ms |   11
  27 ms |   3
  28 ms |   11
  29 ms |   10
  30 ms |   6
  31 ms |   7
  32 ms |   13
  33 ms |   19
  34 ms |   9
  35 ms |   8
  36 ms |   7
  37 ms |   9
  38 ms |   1
  39 ms |   7
  40 ms |   2
  41 ms |   4
  42 ms |   1
  43 ms |   1
  44 ms |   2
  45 ms |   3
  46 ms |   3
  47 ms |   2
  48 ms |   3
  49 ms |   1
  51 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `23.55`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `66.00`
- `falling_blocks_landed` = `22244.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `192.65`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `20.16`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4803.02`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `958.07`, min `17.84`, p50 `815.79`, p95 `2363.93`, p99 `3013.19`, 1%low `21.97`, 0.1%low `18.70`, std `843.45`

**Frame time (ms)**  avg `6.32`, p50 `1.23`, p95 `29.05`, p99 `40.50`, p99.9 `50.37`, max `56.05`

**Client tick (ms)**  avg `15.12`, p95 `20.56`, max `30.53`

**Memory**  start `1931 MB`, end `2018 MB`, peak `2028 MB`, GC `20 events / 94 ms`

**FPS over sampling window (ASCII):**

```
2606.4 |                                                                              █ 
2376.2 |                                                                              █ 
2145.9 |                                                                   █  █       ██
1915.7 |                          █                 █     █     █          █████     ███
1685.4 |                          █     █          ██     █     █  █     ████████    ███
1455.1 |          █               █     █    ██    ██    ████   █████    ████████    ███
1224.9 |  █       █           █   ███   █    ██    ███   ████   █████    █████████   ███
994.6 | ███      ██   █      █   ███   ██   ███   ███   ████   ██████   █████████   ███
764.4 | ███      ██   █     ██   ███  ███   ███  █████  ████   ██████   █████████   ███
534.1 |█████     ███  █  █  ██  █████ ████ ████  █████  █████ ███████   ██████████  ███
303.9 |█████  ██ ███ ███ ██ ███ █████ ████ █████ █████  █████ ████████ ███████████  ███
 73.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1439
   1 ms | ██████████  372
   2 ms | ████  148
   3 ms | ███  107
   4 ms | ██  65
   5 ms | █  46
   6 ms | ███  108
   7 ms | █████  174
   8 ms | █  21
   9 ms |   9
  10 ms |   4
  11 ms |   7
  12 ms | █  32
  13 ms | █  49
  14 ms | █  42
  15 ms | ██  63
  16 ms | ██  69
  17 ms | █  47
  18 ms | █  32
  19 ms | █  30
  20 ms |   15
  21 ms | █  23
  22 ms | █  24
  23 ms |   13
  24 ms |   8
  25 ms |   2
  26 ms |   10
  27 ms | █  23
  28 ms | █  23
  29 ms |   17
  30 ms |   14
  31 ms |   16
  32 ms |   14
  33 ms | █  18
  34 ms |   15
  35 ms |   10
  36 ms |   4
  37 ms |   5
  38 ms |   5
  39 ms |   7
  40 ms |   5
  41 ms |   4
  42 ms |   4
  43 ms |   1
  44 ms |   4
  45 ms |   3
  46 ms |   3
  47 ms |   2
  48 ms |   1
  49 ms |   2
  50 ms |   2
  51 ms |   1
  53 ms |   1
  56 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `21.97`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `4.00`
- `falling_blocks_landed` = `30373.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `158.28`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `18.70`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4803.03`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `1393.10`, min `21.24`, p50 `1460.40`, p95 `2427.27`, p99 `2700.06`, 1%low `48.79`, 0.1%low `33.82`, std `642.12`

**Frame time (ms)**  avg `1.69`, p50 `0.68`, p95 `7.30`, p99 `18.10`, p99.9 `23.29`, max `47.08`

**Client tick (ms)**  avg `1.98`, p95 `2.84`, max `3.85`

**Memory**  start `1167 MB`, end `1249 MB`, peak `2073 MB`, GC `46 events / 303 ms`

**FPS over sampling window (ASCII):**

```
2117.0 |                                                                       █ █  █ █ 
1976.6 |  █                                                                   ███████ █ 
1836.2 | ██                                                           ███     ███████ █ 
1695.9 |███  ██                                    █  ██         █    ██████ ███████████
1555.5 |███████                                █  ██ ███ █ ████████ ████████████████████
1415.1 |███████                            ██  ██ ████████ █████████████████████████████
1274.7 |███████                       █ ██ █████████████████████████████████████████████
1134.4 |████████                   █████████████████████████████████████████████████████
994.0 |█████████                 ██████████████████████████████████████████████████████
853.6 |█████████        █  ████████████████████████████████████████████████████████████
713.2 |██████████  █  █████████████████████████████████████████████████████████████████
572.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8517
   1 ms | ██████████  2234
   2 ms | █  167
   3 ms | █  173
   4 ms | █  117
   5 ms |   49
   6 ms |   17
   7 ms |   7
   8 ms |   4
  10 ms |   4
  11 ms |   3
  12 ms |   3
  13 ms |   47
  14 ms |   87
  15 ms |   94
  16 ms |   104
  17 ms | █  118
  18 ms |   54
  19 ms |   33
  20 ms |   14
  21 ms |   7
  22 ms |   3
  23 ms |   5
  24 ms |   2
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   1
  32 ms |   1
  40 ms |   1
  47 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `48.79`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `19.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `593.37`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `33.82`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1333.58`, min `22.16`, p50 `1447.15`, p95 `2406.24`, p99 `2672.76`, 1%low `45.98`, 0.1%low `29.38`, std `692.22`

**Frame time (ms)**  avg `1.91`, p50 `0.69`, p95 `14.19`, p99 `18.92`, p99.9 `23.41`, max `45.14`

**Client tick (ms)**  avg `2.13`, p95 `3.17`, max `8.06`

**Memory**  start `1512 MB`, end `1819 MB`, peak `2109 MB`, GC `45 events / 281 ms`

**FPS over sampling window (ASCII):**

```
2087.5 |                                                                         █  ███ 
1934.7 |                                                              █          ███████
1782.0 |                                                ██      ███ █████  ███ █████████
1629.2 |█ █  █                              ██   █ █  █ ██  █ █ ███ ████████████████████
1476.4 |███  █                              ███  ██████████████████ ████████████████████
1323.6 |██████                            █ ███ ████████████████████████████████████████
1170.9 |███████                         ████████████████████████████████████████████████
1018.1 |███████                   █  █  ████████████████████████████████████████████████
865.3 |████████                ████████████████████████████████████████████████████████
712.5 |████████           █████████████████████████████████████████████████████████████
559.7 |██████████ ██  █████████████████████████████████████████████████████████████████
407.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6786
   1 ms | █████████████  2215
   2 ms | ███  470
   3 ms | █  149
   4 ms | █  150
   5 ms |   74
   6 ms |   20
   7 ms |   4
   8 ms |   8
   9 ms |   4
  10 ms |   6
  11 ms |   1
  12 ms |   3
  13 ms |   31
  14 ms |   73
  15 ms | █  88
  16 ms | █  117
  17 ms |   81
  18 ms |   74
  19 ms |   44
  20 ms |   19
  21 ms |   15
  22 ms |   9
  23 ms |   4
  24 ms |   3
  28 ms |   1
  37 ms |   1
  38 ms |   2
  39 ms |   1
  41 ms |   1
  45 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `45.98`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `18.00`
- `falling_blocks_landed` = `3136.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `522.73`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `29.38`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.36`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `828.52`, min `28.17`, p50 `848.60`, p95 `1317.57`, p99 `1524.42`, 1%low `49.32`, 0.1%low `36.97`, std `328.03`

**Frame time (ms)**  avg `2.33`, p50 `1.18`, p95 `15.19`, p99 `18.21`, p99.9 `21.89`, max `35.50`

**Client tick (ms)**  avg `0.68`, p95 `0.92`, max `1.77`

**Memory**  start `946 MB`, end `1897 MB`, peak `2124 MB`, GC `49 events / 292 ms`

**FPS over sampling window (ASCII):**

```
1222.6 |       ██                                                                       
1163.0 |       ██ █                                                                     
1103.5 |   ██ ███ █        █                                                            
1043.9 |   █████████       █                                                            
984.4 | ████████████     ██                                                            
924.8 |█████████████  █  ██                                                    █       
865.2 |██████████████ █  █████   █           █                                 █   ████
805.7 |█████████████████ ████████████   ██  ███ █ ██        █     █   █      ████  ████
746.1 |█████████████████ ██████████████████ ███ ███████ █████  █████  ████   ████ █████
686.6 |███████████████████████████████████████████████████████ █████ █████ ██████ █████
627.0 |███████████████████████████████████████████████████████████████████ ████████████
567.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████████  2585
   1 ms | ████████████████████████████████████████  4880
   2 ms | ███  337
   3 ms | █  80
   4 ms |   51
   5 ms |   45
   6 ms |   13
   7 ms |   4
   8 ms |   2
   9 ms |   1
  10 ms |   6
  11 ms |   3
  12 ms |   9
  13 ms |   41
  14 ms | █  78
  15 ms | █  121
  16 ms | █  129
  17 ms | █  104
  18 ms |   41
  19 ms |   27
  20 ms |   14
  21 ms |   9
  22 ms |   3
  23 ms |   2
  25 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `429.54`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `36.97`
- `seed` = `5099.00`
- `preload_duration_ms` = `37.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `49.32`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `1799.79`, min `31.29`, p50 `1877.90`, p95 `2623.62`, p99 `2826.82`, 1%low `50.23`, 0.1%low `43.30`, std `572.33`

**Frame time (ms)**  avg `1.20`, p50 `0.53`, p95 `1.87`, p99 `18.20`, p99.9 `21.61`, max `31.96`

**Client tick (ms)**  avg `0.33`, p95 `0.43`, max `0.67`

**Memory**  start `1273 MB`, end `1333 MB`, peak `2184 MB`, GC `41 events / 279 ms`

**FPS over sampling window (ASCII):**

```
2140.5 |                                                             █                  
2077.8 |                                                  █          █                  
2015.1 |                                                 ██ █ █  █   █     █          █ 
1952.4 |                               █                 ██ ███  ██  █     ██ █     █ █ 
1889.7 |         █            ██      ██ █    █         ███████ ██████   ██████  █ ████ 
1826.9 |█      ███          █ ██     ██████   █   █    ████████ ███████  ███████ ██████ 
1764.2 |██     ███  █ ██   ██ ███   ███████   █ ███ █  ████████ ███████ ███████████████ 
1701.5 |██ ███ ██████ ██   ██████ ██████████  ███████  ████████████████ ███████████████ 
1638.8 |██ █████████████ ████████ ██████████ ████████  ████████████████ ████████████████
1576.1 |██ █████████████ ████████ ██████████ ███████████████████████████████████████████
1513.3 |████████████████ ████████ ██████████████████████████████████████████████████████
1450.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15232
   1 ms | ██  584
   2 ms |   29
   3 ms |   48
   4 ms |   98
   5 ms |   59
   6 ms |   5
   8 ms |   3
   9 ms |   3
  10 ms |   3
  11 ms |   1
  12 ms |   2
  13 ms |   28
  14 ms |   65
  15 ms |   70
  16 ms |   116
  17 ms |   109
  18 ms |   74
  19 ms |   51
  20 ms |   24
  21 ms |   22
  22 ms |   9
  23 ms |   3
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `50.23`
- `fps_harmonic_avg` = `831.65`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `43.30`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `46.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `1846.31`, min `34.52`, p50 `1917.53`, p95 `2632.28`, p99 `2799.51`, 1%low `52.34`, 0.1%low `42.56`, std `562.05`

**Frame time (ms)**  avg `1.12`, p50 `0.52`, p95 `1.65`, p99 `17.27`, p99.9 `21.03`, max `28.96`

**Client tick (ms)**  avg `0.32`, p95 `0.39`, max `9.60`

**Memory**  start `1969 MB`, end `2117 MB`, peak `2262 MB`, GC `45 events / 295 ms`

**FPS over sampling window (ASCII):**

```
2149.7 |                █                                                               
2096.6 |                █                                                               
2043.6 |         █      ██            █                                █                
1990.5 |         █      ██          █ █   ██  █     █ █                █                
1937.5 |       ███   █  ██     █   █████  ██  █ █   █ █       █      █ █ █  █           
1884.4 |  █   ██████ █  ██  █  █   █████  ██  ████ ████ ██   ███ █  ██ █ █ ████     █   
1831.4 |  █  █████████  ███ █  █   █████ ███ █████ ███████  ██████  ██ ███ █████   ██   
1778.3 |  ████████████████████ █████████ █████████ ███████  ██████  ██████ ██████ ███   
1725.3 |  ████████████████████ █████████ █████████ ████████ ██████  ██████ ██████ ███ ██
1672.2 |████████████████████████████████ █████████████████████████  ██████ ██████ ███ ██
1619.2 |██████████████████████████████████████████████████████████  ██████ ██████ ██████
1566.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16506
   1 ms | █  441
   2 ms |   52
   3 ms |   87
   4 ms |   107
   5 ms |   28
   6 ms |   2
   8 ms |   3
   9 ms |   2
  10 ms |   4
  11 ms |   3
  12 ms |   6
  13 ms |   62
  14 ms |   62
  15 ms |   98
  16 ms |   136
  17 ms |   87
  18 ms |   51
  19 ms |   32
  20 ms |   21
  21 ms |   7
  22 ms |   3
  23 ms |   2
  24 ms |   2
  26 ms |   2
  28 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2240.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `42.56`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `890.36`
- `preload_duration_ms` = `85.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `52.34`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1554.68`, min `27.40`, p50 `1747.95`, p95 `2506.44`, p99 `2727.15`, 1%low `47.57`, 0.1%low `39.43`, std `708.16`

**Frame time (ms)**  avg `1.73`, p50 `0.57`, p95 `8.62`, p99 `19.23`, p99.9 `22.63`, max `36.50`

**Client tick (ms)**  avg `0.38`, p95 `0.55`, max `0.79`

**Memory**  start `1183 MB`, end `1444 MB`, peak `2271 MB`, GC `39 events / 273 ms`

**FPS over sampling window (ASCII):**

```
2176.9 |                                                                   █            
2080.7 |                                                             █     █            
1984.5 |                                                             █ █   █    █       
1888.3 |█                                               █       █ █  █ █ █ █    █       
1792.0 |█          █                      █    █     █  █  █ █  █ █  █ █ █ █    █ █     
1695.8 |█     █    █   █      █ █  █      █    █  █  █  █  █ █  █ █  █ ███ █  █ █ █   █ 
1599.6 |█     █  █ █ ███  █   █ █  █   █ ██ ██ █  █  █  █  ███  █ █  ███████  █ █ █   █ 
1503.3 |█     ████ █ ███  █   █ █  █   █ ███████  ██ █  █  ██████ █  ███████ ███████████
1407.1 |█  █ █████ ██████ ███ ███  █   █████████ █████ ██  █████████████████ ███████████
1310.9 |█ ████████ ██████████ ███████  █████████ ███████████████████████████ ███████████
1214.7 |████████████████████████████████████████ ███████████████████████████ ███████████
1118.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9084
   1 ms | ███  623
   2 ms | ███  725
   3 ms | ██  356
   4 ms |   95
   5 ms |   65
   6 ms |   18
   7 ms |   8
   9 ms |   1
  10 ms |   3
  11 ms |   1
  12 ms |   3
  13 ms |   21
  14 ms |   62
  15 ms |   88
  16 ms |   97
  17 ms |   94
  18 ms |   75
  19 ms |   55
  20 ms |   36
  21 ms |   19
  22 ms |   14
  23 ms |   2
  24 ms |   3
  25 ms |   2
  26 ms |   1
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `577.96`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `39.43`
- `seed` = `4027.00`
- `preload_duration_ms` = `12.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `47.57`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1724.82`, min `24.15`, p50 `1777.81`, p95 `2500.05`, p99 `2741.96`, 1%low `51.13`, 0.1%low `41.71`, std `543.08`

**Frame time (ms)**  avg `1.20`, p50 `0.56`, p95 `1.69`, p99 `17.76`, p99.9 `21.45`, max `41.41`

**Client tick (ms)**  avg `0.34`, p95 `0.49`, max `0.94`

**Memory**  start `2091 MB`, end `1515 MB`, peak `2300 MB`, GC `46 events / 303 ms`

**FPS over sampling window (ASCII):**

```
2096.4 |                                                              █                 
2037.5 |                                                             ██    █      █     
1978.5 |  ███         █                                              ██    █ ██   █     
1919.6 |  ████        ██                                             ██    ████   █   █ 
1860.7 |  ████       ███                                             ███  █████  ███ ██ 
1801.7 |  █████      ███                    ██                      ████ ██████  ██████ 
1742.8 |  █████      ███  ██      █   ██   ███         █  █  █   █  ████ ██████  ██████ 
1683.9 |  █████  ██ ████  █████ ███ ████  ██████   █ █ █  █ ███  █  ████ ███████ ██████ 
1624.9 |  ██████ ███████ ██████ ████████ ███████   █████  █████  █  ████ ███████ ███████
1566.0 |████████ ███████ ██████ ████████ ███████  ██████  ██████ ██ ████████████████████
1507.0 |████████████████ ██████ ████████████████████████████████████████████████████████
1448.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15285
   1 ms | █  560
   2 ms |   30
   3 ms |   63
   4 ms |   100
   5 ms |   31
   6 ms |   2
   8 ms |   1
   9 ms |   3
  10 ms |   3
  11 ms |   2
  12 ms |   9
  13 ms |   35
  14 ms |   76
  15 ms |   93
  16 ms |   119
  17 ms |   95
  18 ms |   63
  19 ms |   35
  20 ms |   17
  21 ms |   19
  22 ms |   4
  23 ms |   2
  24 ms |   1
  25 ms |   1
  28 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `832.53`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `51.13`
- `fps_0p1pct_low` = `41.71`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `37.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `1720.42`, min `25.18`, p50 `1804.02`, p95 `2641.78`, p99 `2752.14`, 1%low `46.91`, 0.1%low `36.03`, std `675.20`

**Frame time (ms)**  avg `1.36`, p50 `0.55`, p95 `4.09`, p99 `18.24`, p99.9 `24.78`, max `39.71`

**Client tick (ms)**  avg `0.42`, p95 `0.73`, max `1.53`

**Memory**  start `1999 MB`, end `1974 MB`, peak `2411 MB`, GC `40 events / 278 ms`

**FPS over sampling window (ASCII):**

```
2210.8 |█                                █                                              
2101.7 |█   ██           █      █        █                           █                  
1992.7 |█  ███           █ ██  ███ █     █                   █     █ █                  
1883.6 |█  ███      █  ██████  ███ █     █     █   ██      █ █    ██ █     ██ █ ██   █  
1774.6 |█ ████     ██████████  ███ █████ ████  █   ███   █ █ ██   ██ ████  ██ ████   █  
1665.5 |██████  █  ██████████ ██████████ ████  ██ ████  ██ ████  ███ ████  ██ ████  ██  
1556.5 |██████  █████████████ ███████████████  ██ ████  ██ █████████ ████  ██ ████  ███ 
1447.4 |██████  █████████████ ████████████████ ████████ █████████████████  ██ ████  ███ 
1338.4 |███████ ██████████████████████████████ ████████ ██████████████████ ████████ ████
1229.3 |███████ ███████████████████████████████████████ ██████████████████ █████████████
1120.3 |███████████████████████████████████████████████ ██████████████████ █████████████
1011.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12720
   1 ms | ███  965
   2 ms | █  178
   3 ms |   90
   4 ms |   97
   5 ms |   34
   6 ms |   19
   7 ms |   7
   8 ms |   4
   9 ms |   3
  10 ms |   3
  11 ms |   3
  12 ms |   10
  13 ms |   41
  14 ms |   59
  15 ms |   108
  16 ms |   120
  17 ms |   83
  18 ms |   42
  19 ms |   26
  20 ms |   27
  21 ms |   16
  22 ms |   13
  23 ms |   12
  24 ms |   6
  25 ms |   7
  26 ms |   5
  29 ms |   1
  36 ms |   1
  39 ms |   1
```

**Extras:**

- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `734.84`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.03`
- `seed` = `7411.00`
- `preload_duration_ms` = `55.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `46.91`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23995 ms  |  Sample ticks: 400

**FPS**  avg `1510.20`, min `19.73`, p50 `1542.88`, p95 `2499.67`, p99 `2745.43`, 1%low `47.01`, 0.1%low `36.35`, std `625.75`

**Frame time (ms)**  avg `1.52`, p50 `0.65`, p95 `4.83`, p99 `18.68`, p99.9 `23.98`, max `50.69`

**Client tick (ms)**  avg `0.43`, p95 `0.67`, max `3.05`

**Memory**  start `2436 MB`, end `2653 MB`, peak `2833 MB`, GC `35 events / 285 ms`

**FPS over sampling window (ASCII):**

```
2184.6 |  █                                                                             
2078.8 |█ █    █                                                                        
1972.9 |█ ████ █  █                                                                     
1867.0 |████████  █       █  ██                                                         
1761.2 |████████  █      ███ ██  █                                                      
1655.3 |█████████ █████  █████████    █ ██                                              
1549.4 |█████████ █████ ███████████ ███ ███ █ █ █  ███ █ █                              
1443.6 |███████████████████████████████ █████ ███ ████ ███  █  █     █████              
1337.7 |█████████████████████████████████████████ ████ ███  ████████ ███████   █  ██    
1231.9 |█████████████████████████████████████████ ████████  ████████ ████████  ██████   
1126.0 |█████████████████████████████████████████████████████████████████████████████ ██
1020.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10817
   1 ms | █████  1262
   2 ms | █  236
   3 ms |   118
   4 ms |   87
   5 ms |   35
   6 ms |   12
   7 ms |   3
   8 ms |   6
   9 ms |   1
  11 ms |   2
  12 ms |   7
  13 ms |   42
  14 ms |   88
  15 ms |   109
  16 ms |   109
  17 ms |   64
  18 ms |   50
  19 ms |   35
  20 ms |   24
  21 ms |   23
  22 ms |   12
  23 ms |   8
  24 ms |   8
  25 ms |   1
  27 ms |   2
  30 ms |   1
  50 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `657.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.35`
- `seed` = `7417.00`
- `preload_duration_ms` = `939.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.03`
- `fps_1pct_low` = `47.01`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `53.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `1852.79`, min `26.66`, p50 `1979.76`, p95 `2758.05`, p99 `2908.98`, 1%low `51.09`, 0.1%low `38.75`, std `706.70`

**Frame time (ms)**  avg `1.23`, p50 `0.51`, p95 `3.34`, p99 `16.89`, p99.9 `23.08`, max `37.51`

**Client tick (ms)**  avg `0.36`, p95 `0.60`, max `2.68`

**Memory**  start `1668 MB`, end `2320 MB`, peak `3083 MB`, GC `30 events / 245 ms`

**FPS over sampling window (ASCII):**

```
2417.7 |         █  █                                                                   
2285.8 |█  ████  █ ██ █ █                                                               
2153.9 |█ █████ ██ ████████  ██                                                         
2022.0 |███████ ████████████ ██      ████             █   █       █                     
1890.1 |████████████████████████  █  ████  ███   █    █  ██      ██  ██ █               
1758.2 |████████████████████████ ███████████████ █ ████  ███  ██ ████████ █ █  █    ██  
1626.3 |████████████████████████████████████████ ██████ ████  ██ ████████ ███ ███  ███ █
1494.4 |████████████████████████████████████████ ███████████ ███ ████████ ███████  ███ █
1362.5 |█████████████████████████████████████████████████████████████████ ████████ ███ █
1230.6 |██████████████████████████████████████████████████████████████████████████ █████
1098.7 |██████████████████████████████████████████████████████████████████████████ █████
966.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14279
   1 ms | ███  920
   2 ms |   163
   3 ms |   141
   4 ms |   57
   5 ms |   26
   6 ms |   9
   7 ms |   7
   8 ms |   3
   9 ms |   2
  11 ms |   2
  12 ms |   20
  13 ms |   68
  14 ms |   89
  15 ms |   165
  16 ms |   102
  17 ms |   64
  18 ms |   23
  19 ms |   16
  20 ms |   19
  21 ms |   10
  22 ms |   8
  23 ms |   7
  24 ms |   6
  25 ms |   1
  26 ms |   3
  30 ms |   1
  37 ms |   1
```

**Extras:**

- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `810.58`
- `part` = `1.00`
- `fps_0p1pct_low` = `38.75`
- `seed` = `7433.00`
- `preload_duration_ms` = `53.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `51.09`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1694.50`, min `25.34`, p50 `1771.54`, p95 `2636.43`, p99 `2833.60`, 1%low `49.12`, 0.1%low `35.06`, std `668.52`

**Frame time (ms)**  avg `1.35`, p50 `0.56`, p95 `3.84`, p99 `17.35`, p99.9 `23.71`, max `39.46`

**Client tick (ms)**  avg `0.36`, p95 `0.51`, max `1.11`

**Memory**  start `2829 MB`, end `2919 MB`, peak `3203 MB`, GC `30 events / 254 ms`

**FPS over sampling window (ASCII):**

```
2309.7 |    █                                                                           
2207.8 |  ███                                                                           
2106.0 |█████ █                 █                                                       
2004.1 |███████  █ █            █   █                                                   
1902.3 |████████████   ██       ██ ██                          █                        
1800.4 |██████████████ ███     ██████         █ █    █       █ ██ ██   █      █ █       
1698.6 |██████████████████     ███████    ██  ███    █ █ █   █ ██ ██  ██    █ ███     ██
1596.8 |██████████████████ █   ███████ █ ███ ████  ███████   ███████  ██   ██ ███     ██
1494.9 |██████████████████ █████████████ ████████  ███████   ███████  ██  ███ ███  ██ ██
1393.1 |█████████████████████████████████████████ █████████  ████████████ ███ ████ ██ ██
1291.2 |█████████████████████████████████████████████████████████████████ ██████████████
1189.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12769
   1 ms | ███  1033
   2 ms | █  187
   3 ms |   135
   4 ms |   83
   5 ms |   29
   6 ms |   11
   7 ms |   1
   8 ms |   2
   9 ms |   1
  11 ms |   1
  12 ms |   16
  13 ms |   82
  14 ms |   61
  15 ms |   152
  16 ms |   115
  17 ms |   55
  18 ms |   30
  19 ms |   32
  20 ms |   15
  21 ms |   11
  22 ms |   8
  23 ms |   6
  24 ms |   3
  25 ms |   3
  26 ms |   2
  28 ms |   2
  29 ms |   1
  35 ms |   1
  38 ms |   1
  39 ms |   1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `742.34`
- `part` = `1.00`
- `fps_0p1pct_low` = `35.06`
- `seed` = `7451.00`
- `preload_duration_ms` = `46.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `49.12`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23308 ms  |  Sample ticks: 400

**FPS**  avg `1787.86`, min `26.50`, p50 `1882.81`, p95 `2725.43`, p99 `2879.45`, 1%low `50.31`, 0.1%low `40.29`, std `700.91`

**Frame time (ms)**  avg `1.29`, p50 `0.53`, p95 `3.55`, p99 `17.34`, p99.9 `22.42`, max `37.74`

**Client tick (ms)**  avg `0.36`, p95 `0.61`, max `1.13`

**Memory**  start `2212 MB`, end `2303 MB`, peak `3370 MB`, GC `27 events / 232 ms`

**FPS over sampling window (ASCII):**

```
2322.3 |      █  █                  █                                                   
2207.8 |█   █ █  █         ███      █                                                   
2093.4 |█ █ ████ █ █ █  ██ ███      █                                                   
1978.9 |███ ████████ █████ █████ █████  █    █                                          
1864.4 |██████████████████ ████████████ ███  ██  █ █        █                       █   
1750.0 |██████████████████ ████████████████ ███ ██ █   ██ ███  ██      █ █  █   ██  █   
1635.5 |███████████████████████████████████ ██████ █  ███ ███ ███  ██  █ █  ██ ███  ██  
1521.0 |████████████████████████████████████████████ █████████████ ███ ███  ██ ███ ███  
1406.6 |██████████████████████████████████████████████████████████ ███████ ███ ███ ███ █
1292.1 |██████████████████████████████████████████████████████████ ███████ ███ ███ █████
1177.6 |██████████████████████████████████████████████████████████ ███████ █████████████
1063.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13451
   1 ms | ███  1003
   2 ms | █  180
   3 ms |   128
   4 ms |   62
   5 ms |   35
   6 ms |   12
   7 ms |   2
   8 ms |   1
  11 ms |   3
  12 ms |   14
  13 ms |   75
  14 ms |   85
  15 ms |   149
  16 ms |   102
  17 ms |   50
  18 ms |   44
  19 ms |   29
  20 ms |   21
  21 ms |   14
  22 ms |   12
  23 ms |   3
  24 ms |   3
  25 ms |   2
  26 ms |   1
  37 ms |   1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `774.40`
- `part` = `1.00`
- `fps_0p1pct_low` = `40.29`
- `seed` = `7457.00`
- `preload_duration_ms` = `247.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-17.00`
- `entity_count_sample_start` = `18.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `50.31`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24561 ms  |  Sample ticks: 400

**FPS**  avg `1730.51`, min `31.03`, p50 `1783.83`, p95 `2758.54`, p99 `2908.20`, 1%low `49.45`, 0.1%low `39.53`, std `717.10`

**Frame time (ms)**  avg `1.35`, p50 `0.56`, p95 `4.03`, p99 `17.84`, p99.9 `22.84`, max `32.23`

**Client tick (ms)**  avg `0.37`, p95 `0.53`, max `2.46`

**Memory**  start `2405 MB`, end `2809 MB`, peak `3551 MB`, GC `27 events / 243 ms`

**FPS over sampling window (ASCII):**

```
2357.7 | █  █                                                                           
2235.4 | ████ █                                                                         
2113.0 |███████ █ ██  ████     █    █                                                   
1990.7 |███████████████████  ███ ██ ██  █                                               
1868.4 |███████████████████  █████████  ███                                             
1746.0 |███████████████████  █████████  ███  ██ █ █  █    ███  ██    █          █       
1623.7 |███████████████████  █████████ ████ ███ ███  ███ █████ ██   ██   █  █  ██     █ 
1501.4 |███████████████████  █████████ ████ ███████  ███ █████████████  ██ ███ ██   █ ██
1379.0 |███████████████████████████████████ ████████ █████████████████  ██ ███ ██   █ ██
1256.7 |███████████████████████████████████████████████████████████████ ██ ███████  ████
1134.3 |██████████████████████████████████████████████████████████████████████████ █████
1012.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12574
   1 ms | ████  1189
   2 ms | █  189
   3 ms |   131
   4 ms |   80
   5 ms |   45
   6 ms |   11
   7 ms |   5
   8 ms |   4
  11 ms |   1
  12 ms |   31
  13 ms |   67
  14 ms |   82
  15 ms |   124
  16 ms |   90
  17 ms |   70
  18 ms |   44
  19 ms |   30
  20 ms |   20
  21 ms |   10
  22 ms |   17
  23 ms |   4
  24 ms |   3
  25 ms |   3
  28 ms |   2
  32 ms |   1
```

**Extras:**

- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `740.89`
- `part` = `1.00`
- `fps_0p1pct_low` = `39.53`
- `seed` = `7477.00`
- `preload_duration_ms` = `1499.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `49.45`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1865.08`, min `26.65`, p50 `1975.61`, p95 `2785.00`, p99 `2961.72`, 1%low `50.47`, 0.1%low `39.85`, std `709.62`

**Frame time (ms)**  avg `1.23`, p50 `0.51`, p95 `3.42`, p99 `17.47`, p99.9 `22.30`, max `37.53`

**Client tick (ms)**  avg `0.39`, p95 `0.67`, max `3.73`

**Memory**  start `3113 MB`, end `2822 MB`, peak `3787 MB`, GC `23 events / 220 ms`

**FPS over sampling window (ASCII):**

```
2347.3 |     █ █      █                                                                 
2232.3 |  █ █████    ███   █ █     █                                                    
2117.3 |  ████████ ██████  █████  ██  █                                                 
2002.3 |█ ██████████████████████ ███  ██     █   ███                                    
1887.3 |█ ██████████████████████ ████ ███    ███████   ██  ██ ██  ███           █   ██  
1772.3 |████████████████████████ █████████ ██████████████  ██ ███ ████       █  ██  ██  
1657.4 |████████████████████████ █████████ ██████████████ ███ ███ ████   █   █ ███ ████ 
1542.4 |██████████████████████████████████ ██████████████ ████████████   █  ██ ████████ 
1427.4 |█████████████████████████████████████████████████ █████████████ ██ ███ ████████ 
1312.4 |█████████████████████████████████████████████████ ████████████████ ████████████ 
1197.4 |███████████████████████████████████████████████████████████████████████████████ 
1082.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14391
   1 ms | ██  844
   2 ms |   152
   3 ms |   137
   4 ms |   72
   5 ms |   28
   6 ms |   10
   7 ms |   1
   8 ms |   1
   9 ms |   1
  10 ms |   1
  12 ms |   18
  13 ms |   75
  14 ms |   95
  15 ms |   146
  16 ms |   90
  17 ms |   46
  18 ms |   46
  19 ms |   33
  20 ms |   21
  21 ms |   15
  22 ms |   7
  23 ms |   4
  24 ms |   4
  25 ms |   3
  26 ms |   1
  37 ms |   1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `812.25`
- `part` = `1.00`
- `fps_0p1pct_low` = `39.85`
- `seed` = `7481.00`
- `preload_duration_ms` = `46.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `3.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `50.47`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `58.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25062 ms  |  Sample ticks: 400

**FPS**  avg `1587.24`, min `7.20`, p50 `1632.69`, p95 `2556.56`, p99 `2699.38`, 1%low `44.48`, 0.1%low `23.64`, std `669.72`

**Frame time (ms)**  avg `1.48`, p50 `0.61`, p95 `4.54`, p99 `18.36`, p99.9 `24.51`, max `138.94`

**Client tick (ms)**  avg `0.36`, p95 `0.56`, max `1.23`

**Memory**  start `2673 MB`, end `2938 MB`, peak `3878 MB`, GC `25 events / 233 ms`

**FPS over sampling window (ASCII):**

```
2196.7 |  █       █                                                                     
2093.0 |  ██      █                                                                     
1989.3 | ████   █ ███                                                                   
1885.6 | ████   █ ███  █         ██          █                                          
1781.9 |█████ ███ ███  ██   ███ ███        █ ██                                         
1678.2 |█████ ███████  █████████████  ███  █████ █  █ █      █    █                     
1574.5 |█████████████ ██████████████  ███  ███████  ████     ██   █       █  █       ███
1470.9 |█████████████████████████████ ███  ███████  ████  █ ███   █      ███ ███     ███
1367.2 |█████████████████████████████████  ███████ █████ ███████████  █  ███████  █  ███
1263.5 |██████████████████████████████████ ███████ ██████████████████ █ ████████████ ███
1159.8 |███████████████████████████████████████████████████████████████ ████████████ ███
1056.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11017
   1 ms | █████  1427
   2 ms | █  188
   3 ms |   124
   4 ms |   80
   5 ms |   39
   6 ms |   10
   7 ms |   5
   8 ms |   2
   9 ms |   1
  12 ms |   6
  13 ms |   46
  14 ms |   80
  15 ms |   132
  16 ms |   108
  17 ms |   63
  18 ms |   46
  19 ms |   30
  20 ms |   21
  21 ms |   22
  22 ms |   8
  23 ms |   8
  24 ms |   2
  25 ms |   3
  27 ms |   2
  29 ms |   1
  36 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
  45 ms |   1
  46 ms |   1
 138 ms |   1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `673.55`
- `part` = `1.00`
- `fps_0p1pct_low` = `23.64`
- `seed` = `7487.00`
- `preload_duration_ms` = `2005.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `44.48`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1631.49`, min `23.77`, p50 `1680.61`, p95 `2600.62`, p99 `2769.28`, 1%low `48.99`, 0.1%low `35.00`, std `652.06`

**Frame time (ms)**  avg `1.38`, p50 `0.60`, p95 `4.06`, p99 `17.52`, p99.9 `22.91`, max `42.07`

**Client tick (ms)**  avg `0.41`, p95 `0.60`, max `1.50`

**Memory**  start `2432 MB`, end `2929 MB`, peak `4178 MB`, GC `20 events / 202 ms`

**FPS over sampling window (ASCII):**

```
2115.5 |  █                                                                             
2032.4 | ██ █  ██                                                                       
1949.2 | █████ ██     █        █                                      █ █               
1866.0 | ████████    ██    █   █                                      ███             █ 
1782.9 | ████████ █████    █   █                                █   █████            ██ 
1699.7 | ██████████████   ██  ███   █                      ██   █  ██████     █    █ ███
1616.6 |███████████████   ███ ████ ██        █   ██  ██    ██   █ ███████ ██  █   ██ ███
1533.4 |███████████████ ██████████████ █    ███ ████ ███  ███   █ ███████ ██  █   ██ ███
1450.2 |██████████████████████████████ ██ █ ████████ ███ ████ █ ████████████ ███  ██ ███
1367.1 |███████████████████████████████████ █████████████████ █ ████████████ ███  ██ ███
1283.9 |███████████████████████████████████████████████████████ ████████████████ ███████
1200.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12322
   1 ms | ████  1081
   2 ms | █  203
   3 ms |   137
   4 ms |   96
   5 ms |   29
   6 ms |   12
   7 ms |   3
   8 ms |   1
   9 ms |   1
  12 ms |   9
  13 ms |   84
  14 ms |   89
  15 ms |   133
  16 ms |   93
  17 ms |   59
  18 ms |   38
  19 ms |   30
  20 ms |   19
  21 ms |   13
  22 ms |   11
  23 ms |   5
  24 ms |   2
  25 ms |   1
  27 ms |   1
  30 ms |   1
  33 ms |   1
  35 ms |   1
  39 ms |   1
  42 ms |   1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `723.10`
- `part` = `1.00`
- `fps_0p1pct_low` = `35.00`
- `seed` = `7499.00`
- `preload_duration_ms` = `55.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-41.00`
- `entity_count_sample_start` = `43.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `48.99`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `61.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23154 ms  |  Sample ticks: 400

**FPS**  avg `1920.10`, min `30.76`, p50 `2023.83`, p95 `2857.43`, p99 `3017.55`, 1%low `50.84`, 0.1%low `39.44`, std `716.34`

**Frame time (ms)**  avg `1.19`, p50 `0.49`, p95 `2.73`, p99 `16.99`, p99.9 `22.68`, max `32.51`

**Client tick (ms)**  avg `0.34`, p95 `0.44`, max `14.12`

**Memory**  start `4009 MB`, end `4096 MB`, peak `4254 MB`, GC `21 events / 201 ms`

**FPS over sampling window (ASCII):**

```
2487.3 |   █  █                                                                         
2369.0 |█  ████   █          █                                                          
2250.6 |█ ██████  ███ █      █      █                                                   
2132.2 |████████ ████████    █ ██ █ ██   █   ██   █    █         █                      
2013.9 |██████████████████   █████████  ███ ███   █  █ █  █ █   ██      █               
1895.5 |███████████████████  █████████ ████ ███   █ █████ ████ ███    █ █        █      
1777.2 |██████████████████████████████ █████████ ████████ ████ ████   █ █    █   ██     
1658.8 |██████████████████████████████ ███████████████████████ ████  ██████  ██ ███  █  
1540.4 |███████████████████████████████████████████████████████████  ███████ ██ ███ ███ 
1422.1 |███████████████████████████████████████████████████████████  ███████ ██ ███████ 
1303.7 |███████████████████████████████████████████████████████████  ███████████████████
1185.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15072
   1 ms | ██  821
   2 ms |   149
   3 ms |   121
   4 ms |   55
   5 ms |   24
   6 ms |   13
   7 ms |   2
   8 ms |   2
   9 ms |   1
  10 ms |   1
  11 ms |   1
  12 ms |   8
  13 ms |   78
  14 ms |   61
  15 ms |   158
  16 ms |   125
  17 ms |   53
  18 ms |   31
  19 ms |   28
  20 ms |   20
  21 ms |   10
  22 ms |   11
  23 ms |   7
  24 ms |   2
  25 ms |   1
  26 ms |   1
  27 ms |   3
  28 ms |   1
  32 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `843.57`
- `part` = `1.00`
- `fps_0p1pct_low` = `39.44`
- `seed` = `7507.00`
- `preload_duration_ms` = `97.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `50.84`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1596.05`, min `24.84`, p50 `1608.48`, p95 `2583.50`, p99 `2808.48`, 1%low `48.09`, 0.1%low `35.56`, std `650.63`

**Frame time (ms)**  avg `1.42`, p50 `0.62`, p95 `4.04`, p99 `18.06`, p99.9 `24.06`, max `40.26`

**Client tick (ms)**  avg `0.43`, p95 `0.63`, max `16.02`

**Memory**  start `3509 MB`, end `4199 MB`, peak `4276 MB`, GC `21 events / 219 ms`

**FPS over sampling window (ASCII):**

```
2324.0 |    █                                                                           
2210.4 |    █ █                                                                         
2096.8 | █ ████                                                                         
1983.3 | ██████   █    █ █   █                                                          
1869.7 | ██████  ████  ███   ██ █                                                       
1756.1 |████████ ████  ███   ████    ██ ███                                 █           
1642.5 |████████ ██████████  ████  █ ███████  ██  ███     ███        █      █           
1529.0 |████████ ███████████ ████ ██████████ ████████    █████     █ █  ██  ███         
1415.4 |████████████████████ █████████████████████████  ██████  █  ███ ███  ███  ██   █ 
1301.8 |██████████████████████████████████████████████ ████████████████████ ███████ ███ 
1188.3 |███████████████████████████████████████████████████████████████████ ███████ ████
1074.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11857
   1 ms | ████  1229
   2 ms | █  186
   3 ms |   120
   4 ms |   75
   5 ms |   31
   6 ms |   14
   7 ms |   2
   8 ms |   3
   9 ms |   1
  12 ms |   7
  13 ms |   46
  14 ms |   76
  15 ms |   137
  16 ms |   106
  17 ms |   66
  18 ms |   44
  19 ms |   26
  20 ms |   34
  21 ms |   14
  22 ms |   6
  23 ms |   5
  24 ms |   6
  26 ms |   5
  28 ms |   1
  29 ms |   1
  39 ms |   1
  40 ms |   1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `705.09`
- `part` = `1.00`
- `fps_0p1pct_low` = `35.56`
- `seed` = `7517.00`
- `preload_duration_ms` = `49.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-53.00`
- `entity_count_sample_start` = `54.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `48.09`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1887.74`, min `35.83`, p50 `2031.33`, p95 `2778.89`, p99 `2916.68`, 1%low `50.17`, 0.1%low `40.91`, std `718.35`

**Frame time (ms)**  avg `1.24`, p50 `0.49`, p95 `3.44`, p99 `17.33`, p99.9 `23.07`, max `27.91`

**Client tick (ms)**  avg `0.36`, p95 `0.53`, max `6.76`

**Memory**  start `3470 MB`, end `4170 MB`, peak `4413 MB`, GC `21 events / 215 ms`

**FPS over sampling window (ASCII):**

```
2396.8 |█ ██  ██                                                                        
2276.8 |████  ██   █                                                                    
2156.8 |█████ ███ ██      █ █   ██  ██ █             █ █                                
2036.8 |████████████ █  ███ █ █ ██████ █ █    ██   █ █ ████      ██                     
1916.8 |███████████████████ █ ██████████ █    ██  ████ █████     ███              ███   
1796.9 |███████████████████████████████████   ██ ███████████     ████ █ █  █   █ ████   
1676.9 |████████████████████████████████████ ███████████████    █████ █ █████  █ ████   
1556.9 |████████████████████████████████████ ███████████████ ████████ ███████  ██████  █
1436.9 |████████████████████████████████████████████████████ ████████ ███████  ██████  █
1316.9 |█████████████████████████████████████████████████████████████ ███████  ██████ ██
1196.9 |██████████████████████████████████████████████████████████████████████ █████████
1076.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14263
   1 ms | ██  873
   2 ms |   140
   3 ms |   118
   4 ms |   81
   5 ms |   30
   6 ms |   13
   7 ms |   5
   8 ms |   2
  10 ms |   1
  12 ms |   9
  13 ms |   66
  14 ms |   75
  15 ms |   154
  16 ms |   114
  17 ms |   57
  18 ms |   31
  19 ms |   33
  20 ms |   30
  21 ms |   13
  22 ms |   6
  23 ms |   10
  24 ms |   4
  25 ms |   2
  26 ms |   1
  27 ms |   1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `806.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `40.91`
- `seed` = `7523.00`
- `preload_duration_ms` = `37.00`
- `entity_count_sample_end` = `12.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-12.00`
- `entity_count_sample_start` = `24.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `50.17`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `1910.38`, min `23.16`, p50 `1991.58`, p95 `2705.02`, p99 `2918.65`, 1%low `51.54`, 0.1%low `41.46`, std `562.34`

**Frame time (ms)**  avg `1.07`, p50 `0.50`, p95 `1.29`, p99 `17.69`, p99.9 `21.20`, max `43.18`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `0.85`

**Memory**  start `3623 MB`, end `3653 MB`, peak `4477 MB`, GC `22 events / 187 ms`

**FPS over sampling window (ASCII):**

```
2249.8 |                                           █                                    
2179.9 |                                           █      █                             
2110.1 |                                    █   ██ █  ██  ███     █   █            █    
2040.2 |                        █           █   █████ ██ █████   ██  ██ █        █ █  ██
1970.3 |                        █    █   ██ █   ██████████████   ██████ █      ███ █████
1900.4 |█ ██ ██    █ █  ███   ███ █ ██ █ ████   ██████████████  ███████ █      █████████
1830.6 |████ █████████ ████   ███ █ █████████ █ ██████████████  █████████      █████████
1760.7 |████ ██████████████   ███ █████████████████████████████ ████████████   █████████
1690.8 |███████████████████  ███████████████████████████████████████████████  ██████████
1620.9 |████████████████████ ███████████████████████████████████████████████ ███████████
1551.1 |████████████████████████████████████████████████████████████████████ ███████████
1481.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17438
   1 ms | █  433
   2 ms |   31
   3 ms |   66
   4 ms |   103
   5 ms |   23
   6 ms |   1
   7 ms |   1
   8 ms |   1
  11 ms |   1
  12 ms |   5
  13 ms |   29
  14 ms |   75
  15 ms |   85
  16 ms |   103
  17 ms |   107
  18 ms |   80
  19 ms |   31
  20 ms |   25
  21 ms |   12
  22 ms |   4
  23 ms |   2
  24 ms |   1
  27 ms |   1
  30 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `51.54`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `42.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `41.46`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `932.99`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `189.82`, min `20.51`, p50 `215.27`, p95 `293.41`, p99 `310.72`, 1%low `25.73`, 0.1%low `21.68`, std `85.26`

**Frame time (ms)**  avg `7.88`, p50 `4.65`, p95 `20.39`, p99 `32.29`, p99.9 `44.21`, max `48.76`

**Client tick (ms)**  avg `4.01`, p95 `10.34`, max `17.36`

**Memory**  start `3252 MB`, end `3705 MB`, peak `4467 MB`, GC `20 events / 177 ms`

**FPS over sampling window (ASCII):**

```
222.6 |                               █                       █               █        
214.2 |   █                █          █      █  █    ██    █ ██    █       █  █        
205.8 |  ██    ██          ███       ████    ██ █    ██  ████████  █    █████ █        
197.4 | ███ █  ███ █      ████    ██ ████    ████    ████████████  ██   ██████████ █   
189.0 | ███ ████████      ████    ███████ █  █████   ████████████  ██   ████████████   
180.6 | ████████████     ██████  ████████ ██ █████  █████████████ ███   █████████████  
172.2 | ████████████     ██████  ███████████ █████ ██████████████ ███   █████████████  
163.8 |█████████████     ██████  █████████████████████████████████████ ███████████████ 
155.4 |█████████████    ███████  █████████████████████████████████████████████████████ 
147.0 |███████████████  ██████████████████████████████████████████████████████████████ 
138.6 |███████████████████████████████████████████████████████████████████████████████ 
130.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   2
   3 ms | ████████████████████████████████████████  803
   4 ms | ████████████████████████████████  652
   5 ms | ████████████  233
   6 ms | ██████  120
   7 ms | ████  72
   8 ms | ██  35
   9 ms | ██  31
  10 ms | █  13
  11 ms |   8
  12 ms |   5
  13 ms | █  29
  14 ms | ███  59
  15 ms | ███  58
  16 ms | ███  65
  17 ms | ████  89
  18 ms | ███  59
  19 ms | ███  62
  20 ms | ██  35
  21 ms | █  29
  22 ms | █  17
  23 ms | █  15
  24 ms |   5
  25 ms |   3
  26 ms |   4
  27 ms |   1
  29 ms |   1
  30 ms |   3
  31 ms |   3
  32 ms |   3
  33 ms |   1
  34 ms |   2
  35 ms |   4
  36 ms |   1
  38 ms |   2
  39 ms |   4
  40 ms |   3
  42 ms |   1
  43 ms |   1
  44 ms |   2
  45 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `25.73`
- `fps_0p1pct_low` = `21.68`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `126.84`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `39.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1766.34`, min `22.62`, p50 `1840.66`, p95 `2566.97`, p99 `2757.94`, 1%low `49.32`, 0.1%low `38.81`, std `550.49`

**Frame time (ms)**  avg `1.21`, p50 `0.54`, p95 `1.76`, p99 `18.37`, p99.9 `22.04`, max `44.22`

**Client tick (ms)**  avg `0.31`, p95 `0.40`, max `1.07`

**Memory**  start `3853 MB`, end `3848 MB`, peak `4481 MB`, GC `22 events / 195 ms`

**FPS over sampling window (ASCII):**

```
2040.6 |                               ██  █                           █                
1971.7 |                           ██ ██████          █             ██ █ █ █            
1902.7 |                         █ ██ ██████    █ █   █         █ █ ████ ███            
1833.8 |██    █                  █ █████████    ███   █ ██ ██   ████████████     ████   
1764.9 |███████  █      ██       █ █████████   ████   ████ ██   ████████████   ██████   
1695.9 |████████ █      ██       █ █████████ ████████████████   █████████████  ██████   
1627.0 |██████████ ███ ███  █   ██████████████████████████████ ██████████████ ██████████
1558.1 |██████████████ ███  ██ █████████████████████████████████████████████████████████
1489.1 |██████████████████  ████████████████████████████████████████████████████████████
1420.2 |██████████████████  ████████████████████████████████████████████████████████████
1351.3 |███████████████████ ████████████████████████████████████████████████████████████
1282.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15236
   1 ms | █  559
   2 ms |   31
   3 ms |   49
   4 ms |   97
   5 ms |   45
   6 ms |   4
   9 ms |   1
  13 ms |   23
  14 ms |   69
  15 ms |   68
  16 ms |   105
  17 ms |   109
  18 ms |   82
  19 ms |   47
  20 ms |   25
  21 ms |   22
  22 ms |   10
  23 ms |   1
  24 ms |   3
  25 ms |   1
  27 ms |   1
  29 ms |   1
  35 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `829.53`
- `part` = `1.00`
- `fps_0p1pct_low` = `38.81`
- `seed` = `9043.00`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `49.32`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1827.40`, min `38.04`, p50 `1900.52`, p95 `2590.28`, p99 `2762.85`, 1%low `51.36`, 0.1%low `44.15`, std `543.84`

**Frame time (ms)**  avg `1.15`, p50 `0.53`, p95 `1.49`, p99 `17.87`, p99.9 `21.47`, max `26.29`

**Client tick (ms)**  avg `0.34`, p95 `0.39`, max `12.53`

**Memory**  start `2703 MB`, end `4237 MB`, peak `4481 MB`, GC `24 events / 197 ms`

**FPS over sampling window (ASCII):**

```
2041.9 |     █                                                               █          
1990.7 |     ██                            ██ █             █              █ █          
1939.4 |     ████     █           █        ████             █  █ █ █ █    ██ █          
1888.2 |█ ██ ████    ██   █  ██   ██   █   ██████   █      █████ █ █ ██   ██ █ █ ██     
1837.0 |████ ██████ ███   █  ██  ████ ██   ██████ █ █     ██████ ███ ██   ██████ ███    
1785.8 |███████████████   █  ██ ████████  ████████████ █  █████████████  ███████ ███   █
1734.6 |███████████████  ███ ██ ████████  ██████████████  █████████████  ███████████   █
1683.4 |███████████████  ███████████████ ███████████████  █████████████  ███████████   █
1632.2 |███████████████  ███████████████████████████████  █████████████  ████████████ ██
1581.0 |███████████████ ███████████████████████████████████████████████  ████████████ ██
1529.7 |███████████████ ███████████████████████████████████████████████ ████████████████
1478.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16183
   1 ms | █  470
   2 ms |   34
   3 ms |   58
   4 ms |   97
   5 ms |   36
  11 ms |   1
  12 ms |   3
  13 ms |   29
  14 ms |   68
  15 ms |   79
  16 ms |   101
  17 ms |   132
  18 ms |   72
  19 ms |   42
  20 ms |   27
  21 ms |   13
  22 ms |   6
  23 ms |   2
  26 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `51.36`
- `fps_harmonic_avg` = `872.91`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `44.15`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `33.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `1562.40`, min `24.14`, p50 `1645.60`, p95 `2253.76`, p99 `2424.23`, 1%low `49.82`, 0.1%low `40.62`, std `493.95`

**Frame time (ms)**  avg `1.36`, p50 `0.61`, p95 `4.19`, p99 `18.31`, p99.9 `21.86`, max `41.42`

**Client tick (ms)**  avg `0.33`, p95 `0.40`, max `0.91`

**Memory**  start `2516 MB`, end `4200 MB`, peak `4481 MB`, GC `21 events / 170 ms`

**FPS over sampling window (ASCII):**

```
1811.9 |                                                         █                      
1757.6 |                                                         █                    █ 
1703.2 |    █                                              █    ███   █   █          ███
1648.9 | █  ██        █      █   █                  █      █    ███  ███ ██   █   █  ███
1594.6 |█████████  █  █      █   ██    ██ █         ██    ██   ████████████   ██ ███████
1540.2 |██████████ ██ ██     █ █ ██████████   ███ ████ ██ ██ █ ████████████   ██ ███████
1485.9 |█████████████ ███ █  ███████████████  ███ ██████████ █ █████████████ ███ ███████
1431.5 |███████████████████ ████████████████  ██████████████ █ █████████████ ███████████
1377.2 |███████████████████ ████████████████  ██████████████████████████████████████████
1322.9 |███████████████████ ████████████████  ██████████████████████████████████████████
1268.5 |████████████████████████████████████ ███████████████████████████████████████████
1214.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13168
   1 ms | ██  685
   2 ms |   35
   3 ms |   38
   4 ms |   101
   5 ms |   63
   6 ms |   7
  11 ms |   1
  12 ms |   1
  13 ms |   26
  14 ms |   52
  15 ms |   76
  16 ms |   122
  17 ms |   129
  18 ms |   72
  19 ms |   48
  20 ms |   26
  21 ms |   14
  22 ms |   8
  23 ms |   2
  24 ms |   2
  31 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `49.82`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `733.49`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `40.62`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `72.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1440.62`, min `39.16`, p50 `1482.84`, p95 `2081.58`, p99 `2214.26`, 1%low `51.05`, 0.1%low `44.28`, std `458.29`

**Frame time (ms)**  avg `1.42`, p50 `0.67`, p95 `3.87`, p99 `18.21`, p99.9 `21.40`, max `25.53`

**Client tick (ms)**  avg `0.32`, p95 `0.40`, max `0.70`

**Memory**  start `4036 MB`, end `4059 MB`, peak `4476 MB`, GC `25 events / 199 ms`

**FPS over sampling window (ASCII):**

```
1671.1 |                               █                                    █           
1618.9 |        ██    ██             ███                        █           ██          
1566.7 |        ████ ███    █       ████   ██  █              █ █           ███ █       
1514.5 |██      ████████    █       █████  ██ ███      █    ███ █ █   █     ██████      
1462.3 |██     ██████████   █     ███████  ██ ████     █    █████ ██ ███   ███████      
1410.1 |███ ██ ██████████   ██   ████████  ███████ █  ███   ████████████   ██████████   
1357.9 |██████ ██████████  ███   ████████  █████████ ████   ████████████   ██████████   
1305.6 |█████████████████  █████ ████████  ██████████████  █████████████   ██████████  █
1253.4 |█████████████████  █████ ████████████████████████ ██████████████ █████████████ █
1201.2 |██████████████████ ██████████████████████████████ ██████████████ █████████████ █
1149.0 |██████████████████████████████████████████████████████████████████████████████ █
1096.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12577
   1 ms | ██  740
   2 ms |   41
   3 ms |   68
   4 ms |   83
   5 ms |   29
   6 ms |   6
  11 ms |   1
  12 ms |   7
  13 ms |   36
  14 ms |   58
  15 ms |   79
  16 ms |   127
  17 ms |   108
  18 ms |   90
  19 ms |   31
  20 ms |   21
  21 ms |   14
  22 ms |   1
  23 ms |   5
  25 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `706.34`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `44.28`
- `seed` = `8053.00`
- `preload_duration_ms` = `5.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `51.05`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195501 ms  |  Sample ticks: 3600

**FPS**  avg `180.39`, min `0.70`, p50 `181.11`, p95 `337.52`, p99 `417.49`, 1%low `18.85`, 0.1%low `6.62`, std `99.54`

**Frame time (ms)**  avg `9.22`, p50 `5.52`, p95 `23.03`, p99 `37.51`, p99.9 `68.31`, max `1435.05`

**Client tick (ms)**  avg `0.97`, p95 `1.34`, max `14.64`

**Memory**  start `3849 MB`, end `3901 MB`, peak `4732 MB`, GC `233 events / 3073 ms`

**FPS over sampling window (ASCII):**

```
276.5 |█                                                                               
260.3 |█                                                   █                           
244.1 |█                                                   ████ █ █████   █████        
227.8 |█                                    ██           █ █████████████  █████        
211.6 |█   █                                ██      █   █████████████████ ██████       
195.3 |█   █      ██                      █ ███   ███   ████████████████████████ █ ██ █
179.1 |█   █      ███              █  █ ███████   ███   ███████████████████████████████
162.8 |█   ██     ███              ████████████  ████  ████████████████████████████████
146.6 |█   ██     ███             █████████████  █████ ████████████████████████████████
130.3 |██  ███    ███  ██ █       █████████████  █████ ████████████████████████████████
114.1 |██ ████████████ █████ ██ ███████████████████████████████████████████████████████
 97.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   36
   2 ms | ██████████  1051
   3 ms | ████████████████████████████████████████  4092
   4 ms | ██████████████████████████████████  3515
   5 ms | ████████████████████  2070
   6 ms | █████████████████  1755
   7 ms | ████████████  1261
   8 ms | ██████  601
   9 ms | ███  266
  10 ms | █  130
  11 ms | █  56
  12 ms |   22
  13 ms |   16
  14 ms |   16
  15 ms | █  68
  16 ms | ██  208
  17 ms | ████  423
  18 ms | ██████  612
  19 ms | ████████  779
  20 ms | ███████  706
  21 ms | █████  540
  22 ms | ████  399
  23 ms | ███  268
  24 ms | █  147
  25 ms | █  98
  26 ms |   39
  27 ms |   28
  28 ms |   16
  29 ms |   14
  30 ms |   4
  31 ms |   6
  32 ms |   10
  33 ms |   22
  34 ms |   39
  35 ms |   39
  36 ms |   45
  37 ms |   40
  38 ms |   30
  39 ms |   30
  40 ms |   15
  41 ms |   20
  42 ms |   13
  43 ms |   13
  44 ms |   7
  45 ms |   8
  46 ms |   4
  47 ms |   5
  48 ms |   4
  49 ms |   1
  50 ms |   1
  51 ms |   1
  52 ms |   1
  53 ms |   1
  54 ms |   1
  63 ms |   1
  64 ms |   1
  67 ms |   1
  69 ms |   1
  71 ms |   2
  74 ms |   1
  75 ms |   1
  76 ms |   2
  78 ms |   1
  79 ms |   2
  82 ms |   1
  85 ms |   1
  86 ms |   1
  88 ms |   2
  91 ms |   1
 101 ms |   1
 102 ms |   1
 106 ms |   1
1435 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `fps_1pct_low` = `18.85`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `86.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `85.00`
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
- `fps_0p1pct_low` = `6.62`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `127.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `108.42`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195404 ms  |  Sample ticks: 3600

**FPS**  avg `187.00`, min `8.37`, p50 `186.69`, p95 `369.58`, p99 `498.19`, 1%low `21.09`, 0.1%low `11.50`, std `109.19`

**Frame time (ms)**  avg `9.15`, p50 `5.36`, p95 `23.54`, p99 `39.48`, p99.9 `50.82`, max `119.43`

**Client tick (ms)**  avg `0.90`, p95 `1.29`, max `21.65`

**Memory**  start `2812 MB`, end `4348 MB`, peak `5522 MB`, GC `235 events / 3621 ms`

**FPS over sampling window (ASCII):**

```
260.8 |                                                   ██   █  █ ██     ███         
246.3 |                                    ███            ██   ████████  ██████        
231.8 |                                    ███         █ ███████████████ ███████       
217.3 |█                                  ████         █████████████████ ███████████ ██
202.8 |█                                 █████   ███   ████████████████████████████████
188.3 |█   █      ██                    ██████   ████  ████████████████████████████████
173.8 |█   █      ██                ██████████   ████  ████████████████████████████████
159.3 |█   ██     ██              ████████████   ████ █████████████████████████████████
144.8 |█   ██     ██              ████████████  █████ █████████████████████████████████
130.3 |█   ███    ███   █   ██   ██████████████ █████ █████████████████████████████████
115.8 |██ █████  ██████████ ███ █████████████████████ █████████████████████████████████
101.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  191
   2 ms | ██████████████  1364
   3 ms | ████████████████████████████████████████  4023
   4 ms | ██████████████████████████████████  3450
   5 ms | ████████████████████  2039
   6 ms | ████████████████  1620
   7 ms | ███████████  1146
   8 ms | ██████  563
   9 ms | ███  259
  10 ms | ██  168
  11 ms | █  70
  12 ms |   36
  13 ms |   12
  14 ms |   31
  15 ms | ██  217
  16 ms | ██  234
  17 ms | ███  301
  18 ms | █████  480
  19 ms | ██████  644
  20 ms | ███████  731
  21 ms | ██████  563
  22 ms | ████  371
  23 ms | ███  289
  24 ms | ██  174
  25 ms | █  100
  26 ms | █  66
  27 ms |   47
  28 ms |   11
  29 ms |   12
  30 ms |   7
  31 ms |   8
  32 ms |   13
  33 ms |   23
  34 ms |   36
  35 ms |   36
  36 ms |   42
  37 ms |   39
  38 ms |   42
  39 ms |   34
  40 ms |   34
  41 ms |   24
  42 ms |   25
  43 ms |   19
  44 ms |   24
  45 ms |   10
  46 ms |   11
  47 ms |   3
  48 ms |   5
  49 ms |   3
  50 ms |   2
  51 ms |   2
  52 ms |   1
  55 ms |   1
  56 ms |   1
  71 ms |   1
  85 ms |   1
  86 ms |   1
  89 ms |   2
  92 ms |   1
  94 ms |   1
  95 ms |   1
  96 ms |   1
 101 ms |   1
 109 ms |   1
 112 ms |   2
 115 ms |   1
 119 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `fps_1pct_low` = `21.09`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `86.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `15.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `11.50`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `127.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `109.28`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194196 ms  |  Sample ticks: 3600

**FPS**  avg `112.16`, min `10.53`, p50 `106.63`, p95 `271.72`, p99 `361.65`, 1%low `21.12`, 0.1%low `17.06`, std `78.31`

**Frame time (ms)**  avg `15.09`, p50 `9.38`, p95 `42.08`, p99 `45.35`, p99.9 `47.94`, max `94.99`

**Client tick (ms)**  avg `0.73`, p95 `0.95`, max `1.91`

**Memory**  start `3247 MB`, end `5383 MB`, peak `5523 MB`, GC `27 events / 301 ms`

**FPS over sampling window (ASCII):**

```
144.4 |                                                               ██               
139.6 |                                                            █ ████              
134.9 |                                                           ████████             
130.1 |                                                          ██████████   █        
125.3 |                                                     █  █ ███████████ ███    ███
120.5 |                                                     █  █████████████████ █ ████
115.8 |█   ██                            ███                █  ████████████████████████
111.0 |█ █ ██        █                 ████████ ██     ██  ██ █████████████████████████
106.2 |█████████    ██    █           █████████ ███  ████  ████████████████████████████
101.4 |████████████████  ███  █ █    ██████████████  ████  ████████████████████████████
 96.7 |█████████████████████████████ ██████████████ ███████████████████████████████████
 91.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   3
   2 ms | █████  176
   3 ms | ███████████████████  710
   4 ms | ████████████████████  743
   5 ms | ███████████████  558
   6 ms | ████████████████████  723
   7 ms | ██████████████████████████████  1112
   8 ms | ████████████████████████████████████████  1459
   9 ms | ███████████████████████████████  1132
  10 ms | ███████████████████  681
  11 ms | █████  171
  12 ms | █  24
  13 ms |   7
  14 ms |   2
  16 ms |   1
  17 ms |   7
  18 ms | ██  72
  19 ms | ███████  265
  20 ms | ████████████  436
  21 ms | █████████████  459
  22 ms | ██████████  349
  23 ms | ██████  206
  24 ms | ██████  203
  25 ms | ████  152
  26 ms | ██████  227
  27 ms | █████████  313
  28 ms | █████████  334
  29 ms | ███████  242
  30 ms | ████  131
  31 ms | ██  65
  32 ms | █  23
  33 ms |   12
  34 ms |   12
  35 ms | █  24
  36 ms | █  37
  37 ms | █  48
  38 ms | █  29
  39 ms | █  38
  40 ms | █  45
  41 ms | ██  91
  42 ms | ████  144
  43 ms | █████  171
  44 ms | ███  124
  45 ms | ███  105
  46 ms | █  37
  47 ms |   12
  48 ms |   5
  51 ms |   2
  52 ms |   1
  69 ms |   1
  93 ms |   1
  94 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `fps_1pct_low` = `21.12`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `15.00`
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
- `fps_0p1pct_low` = `17.06`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `127.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `66.25`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194979 ms  |  Sample ticks: 3600

**FPS**  avg `95.20`, min `9.67`, p50 `75.36`, p95 `273.25`, p99 `370.21`, 1%low `17.90`, 0.1%low `14.02`, std `81.83`

**Frame time (ms)**  avg `19.56`, p50 `13.27`, p95 `48.85`, p99 `52.90`, p99.9 `56.63`, max `103.37`

**Client tick (ms)**  avg `0.71`, p95 `0.91`, max `2.88`

**Memory**  start `4076 MB`, end `4945 MB`, peak `5527 MB`, GC `26 events / 366 ms`

**FPS over sampling window (ASCII):**

```
136.7 |                                                                ██              
131.2 |                                                                ██              
125.6 |                                                            ██████              
120.1 |                                                         █  ████████            
114.6 |█                                                       ████████████  █         
109.0 |█                                                       ███████████████         
103.5 |█                                                     ███████████████████       
 97.9 |█     █                                        ██    █████████████████████ █  █ 
 92.4 |█  █████     ██                 ███      ██   ████  ████████████████████████████
 86.8 |████████████ ███   █            ████ ███████ █████ █████████████████████████████
 81.3 |████████████████████████████   █████████████████████████████████████████████████
 75.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███████████  168
   3 ms | ███████████████████████████████  488
   4 ms | ████████████████████████████████  505
   5 ms | ████████████████████████  383
   6 ms | █████████████████████████  391
   7 ms | ████████████████  247
   8 ms | █████████████████  264
   9 ms | ████████████████████████  377
  10 ms | ████████████████████████████████████  561
  11 ms | ████████████████████████████████████████  629
  12 ms | ██████████████████████████████  472
  13 ms | ███████████████████████  366
  14 ms | ███████████  176
  15 ms | ████  58
  16 ms | █  19
  17 ms |   6
  18 ms | █  11
  19 ms | █  15
  20 ms | ██████  92
  21 ms | █████████████  202
  22 ms | ████████████████████  311
  23 ms | █████████████████████  330
  24 ms | ██████████████████████  347
  25 ms | ████████████████  256
  26 ms | ██████████  157
  27 ms | ████████  126
  28 ms | ███████  107
  29 ms | █████  81
  30 ms | ███████  108
  31 ms | ███████  109
  32 ms | ████████  127
  33 ms | █████████  144
  34 ms | ████████  128
  35 ms | ██████  92
  36 ms | █████  81
  37 ms | ███  55
  38 ms | ███  46
  39 ms | ███  48
  40 ms | ██  32
  41 ms | ██  37
  42 ms | ██  34
  43 ms | ███  40
  44 ms | ████  63
  45 ms | ███████  103
  46 ms | ████████  126
  47 ms | ████████  121
  48 ms | ███████  117
  49 ms | ███████  116
  50 ms | ███████  111
  51 ms | █████  77
  52 ms | ███  55
  53 ms | ██  36
  54 ms | ██  26
  55 ms | █  11
  56 ms |   4
  57 ms |   3
  58 ms |   1
  63 ms |   1
  67 ms |   1
  75 ms |   1
 100 ms |   1
 103 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `fps_1pct_low` = `17.90`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `16.00`
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
- `fps_0p1pct_low` = `14.02`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `127.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `51.13`

