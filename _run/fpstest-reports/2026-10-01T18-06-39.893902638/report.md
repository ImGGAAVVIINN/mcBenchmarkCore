# MC Benchmark Core session — 2026-10-01T18:42:06.838236117+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1363.8 | 48.6 | 39.5 | 18.44 | 0.79 | 75 | 746 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 1026.0 | 47.7 | 39.8 | 18.90 | 0.92 | 54 | 375 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 883.3 | 50.3 | 39.1 | 17.86 | 0.78 | 52 | 971 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 630.9 | 49.1 | 41.6 | 18.77 | 0.83 | 56 | 290 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 989.0 | 49.8 | 41.5 | 18.52 | 0.83 | 50 | 507 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 1058.2 | 51.1 | 43.3 | 18.22 | 0.59 | 51 | 604 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 842.6 | 47.3 | 37.2 | 19.16 | 0.87 | 46 | 506 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 490.7 | 48.8 | 37.5 | 18.32 | 1.18 | 46 | 273 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1160.6 | 44.3 | 27.8 | 19.13 | 3.65 | 42 | 729 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 268.6 | 34.6 | 24.4 | 23.58 | 4.40 | 31 | 218 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 671.3 | 46.3 | 36.0 | 19.07 | 1.08 | 46 | 1106 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 655.9 | 49.7 | 41.6 | 18.53 | 0.55 | 41 | 908 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 634.4 | 41.3 | 24.5 | 19.42 | 3.87 | 22 | 263 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 847.4 | 48.0 | 32.3 | 18.07 | 2.74 | 24 | 526 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1068.8 | 21.5 | 18.6 | 41.08 | 15.70 | 17 | 942 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 926.7 | 22.6 | 19.3 | 40.22 | 16.21 | 19 | 775 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1425.2 | 48.9 | 41.5 | 18.52 | 2.01 | 44 | 418 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1351.8 | 48.6 | 38.9 | 18.55 | 2.09 | 43 | 1327 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 816.1 | 46.9 | 39.0 | 19.31 | 0.77 | 40 | 954 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1907.7 | 51.6 | 43.4 | 17.79 | 0.38 | 41 | 845 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1791.3 | 50.1 | 42.2 | 18.15 | 0.29 | 40 | 160 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1650.6 | 50.9 | 43.5 | 18.09 | 0.34 | 39 | 280 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1689.2 | 50.6 | 40.5 | 18.16 | 0.34 | 36 | 913 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 1810.3 | 50.9 | 40.8 | 17.20 | 0.38 | 33 | 208 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1541.9 | 46.1 | 30.3 | 18.42 | 0.43 | 33 | 1158 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 1802.9 | 50.4 | 39.5 | 17.22 | 0.41 | 28 | 1021 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 1723.7 | 48.4 | 35.2 | 18.16 | 0.37 | 29 | 1037 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 1756.4 | 51.9 | 38.6 | 16.75 | 0.36 | 26 | 385 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 1785.5 | 48.8 | 33.9 | 17.38 | 0.39 | 25 | 946 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 1797.5 | 49.7 | 40.2 | 17.62 | 0.37 | 25 | 1840 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 1521.2 | 47.8 | 38.2 | 18.57 | 0.41 | 27 | 697 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 1686.9 | 51.0 | 42.0 | 17.52 | 0.41 | 20 | 1141 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 1846.1 | 50.4 | 38.2 | 17.19 | 0.33 | 22 | 1936 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 1640.2 | 48.0 | 36.5 | 18.19 | 0.37 | 20 | 918 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 1883.1 | 50.1 | 36.9 | 17.31 | 0.34 | 21 | 1798 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1944.6 | 51.6 | 42.2 | 17.72 | 0.28 | 25 | 1804 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 186.5 | 26.6 | 20.3 | 32.58 | 3.87 | 18 | 351 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1802.8 | 51.8 | 44.2 | 17.67 | 0.32 | 23 | 870 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1799.2 | 50.4 | 39.6 | 18.04 | 0.31 | 22 | 938 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1669.9 | 51.5 | 43.4 | 17.74 | 0.32 | 25 | 69 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1422.5 | 49.4 | 42.1 | 18.65 | 0.32 | 22 | 2050 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 182.2 | 20.5 | 8.7 | 37.95 | 0.97 | 233 | 1596 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 184.3 | 23.2 | 19.6 | 39.43 | 0.94 | 260 | 1094 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 111.3 | 21.4 | 20.1 | 45.46 | 0.75 | 44 | 305 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 97.0 | 18.2 | 16.6 | 53.05 | 0.71 | 38 | 1125 |

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

Category: **Particles**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1363.80`, min `26.17`, p50 `1413.55`, p95 `2065.76`, p99 `2294.75`, 1%low `48.64`, 0.1%low `39.49`, std `492.22`

**Frame time (ms)**  avg `1.55`, p50 `0.71`, p95 `5.10`, p99 `18.44`, p99.9 `22.62`, max `38.21`

**Client tick (ms)**  avg `0.79`, p95 `1.24`, max `6.73`

**Memory**  start `702 MB`, end `1109 MB`, peak `1449 MB`, GC `75 events / 326 ms`

**FPS over sampling window (ASCII):**

```
1835.1 |                                                                     █          
1746.9 |                                                                   █ █          
1658.6 |                                              █       ██ █ ██ ██  ████          
1570.4 |                                  █    █      █ █ █  ███ █ █████  ██████        
1482.2 |                                 ███ █ █ ██   █ ████ ████████████ █████████     
1393.9 |               ██                ███ ██████ █ ██████████████████████████████    
1305.7 |        █   ██ ██         █ ███  ████████████ ██████████████████████████████████
1217.5 |     █  █  █████████      █ ████████████████████████████████████████████████████
1129.3 |     █  █████████████    ███████████████████████████████████████████████████████
1041.0 |   ███ █████████████████ ███████████████████████████████████████████████████████
952.8 |  ██████████████████████████████████████████████████████████████████████████████
864.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10754
   1 ms | ████  1190
   2 ms | █  159
   3 ms |   61
   4 ms |   81
   5 ms |   57
   6 ms |   17
   7 ms |   11
   8 ms |   6
   9 ms |   5
  10 ms |   2
  12 ms |   1
  13 ms |   42
  14 ms |   61
  15 ms |   94
  16 ms |   107
  17 ms |   96
  18 ms |   60
  19 ms |   41
  20 ms |   20
  21 ms |   12
  22 ms |   19
  23 ms |   3
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  38 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 1613 | 1037.4 | 18.18 |
| `sculk_charge_pop` | 240 | 1613 | 1268.9 | 17.90 |
| `ALL_TOGETHER` | 1680 | 1613 | 1134.9 | 19.81 |
| `portal` | 160 | 1613 | 1424.0 | 17.39 |
| `end_rod` | 240 | 1613 | 1445.4 | 17.51 |
| `dragon_breath` | 160 | 1613 | 1555.4 | 17.54 |
| `dripping_water` | 240 | 1613 | 1636.7 | 17.99 |
| `flame` | 160 | 1613 | 1407.8 | 19.86 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `48.64`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `39.49`
- `fps_harmonic_avg` = `645.56`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `58.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1026.04`, min `35.82`, p50 `1082.74`, p95 `1543.77`, p99 `1645.48`, 1%low `47.69`, 0.1%low `39.77`, std `368.50`

**Frame time (ms)**  avg `1.96`, p50 `0.92`, p95 `14.55`, p99 `18.90`, p99.9 `23.34`, max `27.92`

**Client tick (ms)**  avg `0.92`, p95 `1.41`, max `11.06`

**Memory**  start `1358 MB`, end `1662 MB`, peak `1734 MB`, GC `54 events / 321 ms`

**FPS over sampling window (ASCII):**

```
1183.7 |                                           █     █     █                        
1152.2 |                  █ █               █      █     █   █ ██    ██                 
1120.8 |     █            █ █          █    █    █ █     █   █ ██   ███                 
1089.3 |     █ █         ██ █         ██   ██  █ █ █   █ █   █ ██  █████  █  █          
1057.9 |     █ █  █      ██ ██   ██  ████  ██  █ ███   █ ██ ██ ██  █████  █  █ ███   █  
1026.4 |   █████  █   █  ██ ██   ██  ████████  █ ████  █ ██ █████ ███████ █  █ ████  █  
995.0 |█  █████  ███ █ ███ ██ █ ██  █████████ ██████  █ ██ █████ ██████████ █ ████  █ █
963.5 |█  ██████ ███ █ ███ ████ ██  █████████ ██████ ██ ██ █████ ████████████ █████ ███
932.1 |██ ██████ ███ █ ███ ████████ █████████ ██████ ███████████ ████████████ █████████
900.6 |█████████ ███ █ ███ ████████ ████████████████ ██████████████████████████████████
869.2 |█████████████ █ ███ ████████████████████████████████████████████████████████████
837.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6476
   1 ms | █████████████████  2687
   2 ms | ██  252
   3 ms |   67
   4 ms |   61
   5 ms |   74
   6 ms |   16
   7 ms |   2
   8 ms |   3
  10 ms |   7
  11 ms |   2
  12 ms |   3
  13 ms |   24
  14 ms |   62
  15 ms | █  119
  16 ms | █  105
  17 ms | █  96
  18 ms |   60
  19 ms |   33
  20 ms |   27
  21 ms |   11
  22 ms |   10
  23 ms |   7
  24 ms |   4
  25 ms |   1
  26 ms |   2
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `47.69`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `53.00`
- `fps_harmonic_avg` = `510.43`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `39.77`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `883.33`, min `32.56`, p50 `921.37`, p95 `1304.35`, p99 `1380.99`, 1%low `50.33`, 0.1%low `39.13`, std `319.38`

**Frame time (ms)**  avg `2.15`, p50 `1.09`, p95 `14.29`, p99 `17.86`, p99.9 `22.84`, max `30.71`

**Client tick (ms)**  avg `0.78`, p95 `1.22`, max `1.85`

**Memory**  start `844 MB`, end `1069 MB`, peak `1816 MB`, GC `52 events / 301 ms`

**FPS over sampling window (ASCII):**

```
1044.4 |            █      █                                                            
1015.3 |            █      █                                                            
986.2 |            █   █  █                  █         █                               
957.2 |       █    ██ ██  █          █   █   █       █ █         █     █            █  
928.1 |   █   ██   ██████ █    █     █ ███   █   █   █ ██        ██    █         █  █  
899.0 |  ██ █ ██  █████████    █ █  ██ ███  ██   █  █████  █ ██  ██  █ ██ █   ██ █ ██  
869.9 |  ███████  █████████    ███ ███ ███ ███   ████████  █████ ████████ █   ██ █ ████
840.9 |  ████████ █████████ █ ████ ███ ████████  ████████  █████ ████████ █   ████ ████
811.8 | ██████████████████████████ ███ ██████████████████ ██████ ███████████ █████ ████
782.7 | █████████████████████████████████████████████████ ██████ ██████████████████████
753.6 | ████████████████████████████████████████████████████████ ██████████████████████
724.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████  3305
   1 ms | ████████████████████████████████████████  4910
   2 ms | ██  260
   3 ms | █  89
   4 ms | █  83
   5 ms |   61
   6 ms |   22
   7 ms |   7
   8 ms |   6
   9 ms |   2
  10 ms |   4
  11 ms |   1
  12 ms |   3
  13 ms | █  64
  14 ms | █  100
  15 ms | █  113
  16 ms | █  117
  17 ms | █  91
  18 ms |   34
  19 ms |   16
  20 ms |   11
  21 ms |   4
  22 ms |   7
  23 ms |   1
  24 ms |   3
  25 ms |   2
  27 ms |   1
  30 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `50.33`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `61.00`
- `fps_harmonic_avg` = `466.14`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `39.13`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `630.86`, min `40.63`, p50 `665.43`, p95 `953.52`, p99 `1015.97`, 1%low `49.07`, 0.1%low `41.59`, std `247.26`

**Frame time (ms)**  avg `2.90`, p50 `1.50`, p95 `15.66`, p99 `18.77`, p99.9 `22.87`, max `24.61`

**Client tick (ms)**  avg `0.83`, p95 `1.18`, max `4.77`

**Memory**  start `1555 MB`, end `1059 MB`, peak `1846 MB`, GC `56 events / 328 ms`

**FPS over sampling window (ASCII):**

```
742.4 |                    █                            █ █      █                     
720.3 |                    █                           ██ █      █         █           
698.2 |         ██       █ ██                      █   ████    █ █         █           
676.1 |       █ ███      ████                      █   ████    █ █    █    █          █
654.0 |    █  █ ████ █ █ ████ █  █ █ █ █    ██  █  █  █████    ███    ███ ██          █
631.9 |  ███  ██████ ███ ████ █  █ █ █ █   ███ ██  ██ █████    ███  █ ██████ █        █
609.8 |  ███  █████████████████ ██ ███ ███ ██████  ██ ██████ █████ ██ ██████ █  ███  ██
587.7 |█ ███ ██████████████████ ██ ███ ██████████ ███ ████████████ ██ ██████ ██ ███  ██
565.6 |█████ ██████████████████ ██████ ██████████ ███ ███████████████ █████████ ████ ██
543.5 |██████████████████████████████████████████████ ███████████████ █████████ ████ ██
521.4 |████████████████████████████████████████████████████████████████████████ ███████
499.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  125
   1 ms | ████████████████████████████████████████  5292
   2 ms | █████  601
   3 ms | █  119
   4 ms |   54
   5 ms |   59
   6 ms |   34
   7 ms |   11
   8 ms |   1
   9 ms |   8
  10 ms |   3
  11 ms |   1
  12 ms |   3
  13 ms |   41
  14 ms | █  103
  15 ms | █  140
  16 ms | █  119
  17 ms | █  74
  18 ms |   43
  19 ms |   28
  20 ms |   18
  21 ms |   7
  22 ms |   2
  23 ms |   3
  24 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `49.07`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `59.00`
- `fps_harmonic_avg` = `344.64`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `152.00`
- `fps_0p1pct_low` = `41.59`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `152.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `988.96`, min `38.14`, p50 `1036.84`, p95 `1477.76`, p99 `1557.68`, 1%low `49.78`, 0.1%low `41.49`, std `358.92`

**Frame time (ms)**  avg `2.03`, p50 `0.96`, p95 `14.71`, p99 `18.52`, p99.9 `22.36`, max `26.22`

**Client tick (ms)**  avg `0.83`, p95 `1.37`, max `2.29`

**Memory**  start `1410 MB`, end `1494 MB`, peak `1918 MB`, GC `50 events / 293 ms`

**FPS over sampling window (ASCII):**

```
1182.5 |                                          █                                     
1144.7 |                                  █    █ ██                          █     █    
1106.8 |                                 ██    █ ██    █        █      █     █     ██   
1068.9 |                                ███   ██ ██ █  ███  █ ████     █   █ █     ██   
1031.0 |      █           █             ███ ███████ ██████  █ ████  █  █  █████   ████ █
993.1 |      █   █       █     ██      ███ ███████ ██████ ███████ █████ ██████   ████ █
955.2 |    █ █  ██      ███    ██ █   ███████████████████ ███████ █████ ██████   ██████
917.4 |█   █ ██████  ████████ ███████ ███████████████████ ███████ ██████████████ ██████
879.5 |█  █████████  ████████ █████████████████████████████████████████████████████████
841.6 |████████████ ███████████████████████████████████████████████████████████████████
803.7 |████████████ ███████████████████████████████████████████████████████████████████
765.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5592
   1 ms | ███████████████████████  3246
   2 ms | ██  224
   3 ms |   66
   4 ms |   67
   5 ms |   63
   6 ms |   16
   7 ms |   3
   8 ms |   1
   9 ms |   3
  10 ms |   3
  11 ms |   5
  12 ms |   4
  13 ms |   28
  14 ms | █  72
  15 ms | █  100
  16 ms | █  144
  17 ms | █  87
  18 ms | █  78
  19 ms |   29
  20 ms |   16
  21 ms |   10
  22 ms |   4
  23 ms |   4
  25 ms |   3
  26 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `49.78`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `34.00`
- `fps_harmonic_avg` = `493.51`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `41.49`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `1058.20`, min `36.89`, p50 `1092.35`, p95 `1520.18`, p99 `1602.70`, 1%low `51.07`, 0.1%low `43.26`, std `361.63`

**Frame time (ms)**  avg `1.86`, p50 `0.92`, p95 `13.94`, p99 `18.22`, p99.9 `21.59`, max `27.11`

**Client tick (ms)**  avg `0.59`, p95 `0.81`, max `8.13`

**Memory**  start `1340 MB`, end `1663 MB`, peak `1945 MB`, GC `51 events / 305 ms`

**FPS over sampling window (ASCII):**

```
1210.0 |                               █            █                                   
1177.0 |                              ██        █   █  ██            █                  
1144.0 |         █ █  ██              ██ █  █ █ █   ██ ██            █                 █
1110.9 |         █ █  ██   █  ██  █ ██████  █ ███  ███ ██  █ █       █  █             ██
1077.9 |█   █    █ █  ██   █  ███ █████████ █████  ███ ██  █ █     █ ██ █  █  █ ██    ██
1044.9 |█  ██ █ ██████████ █ ████ █████████ █████ ████ ██ ██ █ █  ██ ██ █  █  ████    ██
1011.9 |█ █████ ██████████ ██████ █████████ █████ ████ ██ ████ █ ███ ██ █  █  █████  ███
978.9 |█ █████ █████████████████ █████████ ██████████ ███████ █ ███ ██ ██ █ ███████ ███
945.9 |█████████████████████████ ████████████████████ █████████ ██████ ██ █ ███████ ███
912.9 |█████████████████████████ ██████████████████████████████ ██████ ██ █████████████
879.9 |█████████████████████████ ██████████████████████████████ ███████████████████████
846.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7156
   1 ms | ███████████████  2687
   2 ms | █  158
   3 ms |   49
   4 ms |   64
   5 ms |   59
   6 ms |   15
   7 ms |   4
   8 ms |   1
   9 ms |   3
  10 ms |   8
  11 ms |   4
  12 ms |   2
  13 ms |   36
  14 ms |   68
  15 ms | █  115
  16 ms | █  147
  17 ms |   81
  18 ms |   68
  19 ms |   28
  20 ms |   14
  21 ms |   6
  22 ms |   3
  23 ms |   1
  24 ms |   1
  25 ms |   1
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `51.07`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `67.00`
- `fps_harmonic_avg` = `538.94`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `43.26`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `842.60`, min `25.28`, p50 `886.17`, p95 `1288.51`, p99 `1366.75`, 1%low `47.30`, 0.1%low `37.23`, std `318.78`

**Frame time (ms)**  avg `2.33`, p50 `1.13`, p95 `15.50`, p99 `19.16`, p99.9 `23.24`, max `39.56`

**Client tick (ms)**  avg `0.87`, p95 `1.29`, max `1.99`

**Memory**  start `1479 MB`, end `1125 MB`, peak `1986 MB`, GC `46 events / 298 ms`

**FPS over sampling window (ASCII):**

```
994.7 |          █                                     █                               
959.5 |     █  █ █                                  █  █              █                
924.4 |   █ █  ███                                 ██  █  ████    ██  █  █           █ 
889.2 |   ███  ████    █     █  █   █        █    ███  █  █████  ██████  █   ██   ██ █ 
854.0 | █████ █████    ██    ██ █   █        █ █ ███████  █████  ██████  █   ██ ████ ██
818.8 |████████████ █████    ██ █  ██ █      ███ ███████ ██████  ██████  ██████ ███████
783.6 |███████████████████ █ ██ ██ ██ █ ██   ███ ███████████████ ██████  ██████ ███████
748.4 |████████████████████████ ███████ ██  ████████████████████ ██████ ███████ ███████
713.2 |███████████████████████████████████  ███████████████████████████ ███████████████
678.0 |████████████████████████████████████ ███████████████████████████████████████████
642.8 |████████████████████████████████████ ███████████████████████████████████████████
607.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████  2504
   1 ms | ████████████████████████████████████████  4966
   2 ms | ███  314
   3 ms | █  72
   4 ms | █  67
   5 ms | █  71
   6 ms |   26
   7 ms |   2
   8 ms |   2
   9 ms |   2
  10 ms |   5
  11 ms |   3
  12 ms |   3
  13 ms |   23
  14 ms |   62
  15 ms | █  108
  16 ms | █  109
  17 ms | █  93
  18 ms | █  70
  19 ms |   42
  20 ms |   23
  21 ms |   16
  22 ms |   5
  23 ms |   3
  24 ms |   4
  25 ms |   1
  26 ms |   1
  29 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `47.30`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `39.00`
- `fps_harmonic_avg` = `430.01`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `37.23`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `490.68`, min `29.93`, p50 `512.63`, p95 `751.30`, p99 `804.49`, 1%low `48.83`, 0.1%low `37.46`, std `199.73`

**Frame time (ms)**  avg `3.46`, p50 `1.95`, p95 `15.38`, p99 `18.32`, p99.9 `22.50`, max `33.41`

**Client tick (ms)**  avg `1.18`, p95 `1.58`, max `1.97`

**Memory**  start `1756 MB`, end `1184 MB`, peak `2030 MB`, GC `46 events / 298 ms`

**FPS over sampling window (ASCII):**

```
556.7 |             █                              ██                          █       
541.4 |  █  █       █  █  █           █ █ █        ███    █       █            █       
526.0 |  █  ███   ███  █  █      █   ███████      ████ █  █  █    █            █       
510.7 |███  ███   ███  █  █   █  █   ████████     ████ █  ██ █    █ ██ █ █ █   ██      
495.4 |████ ███   ███  █  █   █ ██   ████████    █████ █  ██ ██   ████ █████   ██  ██  
480.1 |████ ███  ████  █████  █ ██  ██████████ █ █████ █ ██████   ████ █████   ██████  
464.8 |████ █████████  ██████ █ ███ ██████████ █ ███████ ██████   ████ ██████  ██████  
449.5 |████ █████████████████ █ ███ ████████████ ███████ ██████ █ ████ ██████  ██████ █
434.1 |████ █████████████████ █ ████████████████ ███████ ██████ ██████ ██████  ██████ █
418.8 |██████████████████████ █ ████████████████████████ ██████ ██████ ██████████████ █
403.5 |█████████████████████████████████████████████████ █████████████ ████████████████
388.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████████████████████████████████████████  3113
   2 ms | █████████████████████  1610
   3 ms | ███  265
   4 ms | █  90
   5 ms | █  76
   6 ms |   29
   7 ms |   16
   8 ms |   3
   9 ms |   2
  10 ms |   4
  11 ms |   5
  12 ms |   8
  13 ms | █  78
  14 ms | ██  152
  15 ms | ██  126
  16 ms | █  82
  17 ms | █  62
  18 ms |   32
  19 ms |   11
  20 ms |   12
  21 ms |   6
  22 ms |   4
  23 ms |   1
  24 ms |   1
  27 ms |   1
  28 ms |   1
  33 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `48.83`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `46.00`
- `fps_harmonic_avg` = `289.37`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `37.46`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1160.58`, min `21.25`, p50 `1215.79`, p95 `1749.84`, p99 `1858.35`, 1%low `44.31`, 0.1%low `27.76`, std `422.74`

**Frame time (ms)**  avg `1.87`, p50 `0.82`, p95 `13.63`, p99 `19.13`, p99.9 `27.48`, max `47.07`

**Client tick (ms)**  avg `3.65`, p95 `4.63`, max `18.25`

**Memory**  start `1339 MB`, end `1684 MB`, peak `2069 MB`, GC `42 events / 288 ms`

**FPS over sampling window (ASCII):**

```
1396.0 |                                                               █                
1349.0 |                                                               █                
1302.0 |                                         █  ██    █     █  █   █   ██  █   █    
1255.0 |                 █          █            █  ██    █ █   █  █   █ █ ██ ██ ███  █ 
1208.0 |    █  █       ███   ██     ████  ██    ██████   █████ ██████  ███ ██ ██████  █ 
1161.0 |    █  █       ███   ██     █████████   ██████ █ █████ ██████  ██████ ██████  ██
1114.0 |  █ ██ ████    █████ ██ █  ██████████ █ ██████ ███████ ██████ ███████ ███████ ██
1067.0 |  █████████   ██████ ██ █ █████████████ ██████ ██████████████ ███████ ███████ ██
1020.0 |███████████ █ ██████ ████ █████████████ █████████████████████████████████████ ██
973.0 |███████████ ███████████████████████████ █████████████████████████████████████ ██
926.0 |███████████████████████████████████████ ████████████████████████████████████████
879.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8297
   1 ms | ███████  1393
   2 ms |   30
   3 ms |   70
   4 ms | █  192
   5 ms |   89
   6 ms |   29
   7 ms |   17
   8 ms |   12
   9 ms |   3
  10 ms |   4
  11 ms |   3
  12 ms |   7
  13 ms |   42
  14 ms |   71
  15 ms |   87
  16 ms |   102
  17 ms |   78
  18 ms |   64
  19 ms |   34
  20 ms |   29
  21 ms |   16
  22 ms |   9
  23 ms |   7
  24 ms |   2
  26 ms |   3
  29 ms |   1
  30 ms |   3
  33 ms |   2
  35 ms |   1
  41 ms |   2
  42 ms |   1
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `44.31`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `55.00`
- `fps_harmonic_avg` = `535.07`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `500.00`
- `fps_0p1pct_low` = `27.76`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `500.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `268.63`, min `24.13`, p50 `288.48`, p95 `486.26`, p99 `586.23`, 1%low `34.57`, 0.1%low `24.39`, std `138.52`

**Frame time (ms)**  avg `6.24`, p50 `3.47`, p95 `18.82`, p99 `23.58`, p99.9 `38.45`, max `41.45`

**Client tick (ms)**  avg `4.40`, p95 `7.13`, max `10.72`

**Memory**  start `1884 MB`, end `1030 MB`, peak `2103 MB`, GC `31 events / 160 ms`

**FPS over sampling window (ASCII):**

```
452.8 |    █  █                                                                        
426.5 | █  █  █                                                                        
400.2 | █  █ ██                                                                        
373.9 | █ ██████                                                                       
347.6 |█████████      █                                                                
321.3 |██████████  ██ █      █     █                                                   
295.0 |██████████ ██████  ████ ██  █ █                                                 
268.6 |█████████████████ █████ █████ █ ██ ██     ██ ██ ██  █  ██                       
242.3 |██████████████████████████████████████ █ ████████████████ █ ███     █   █       
216.0 |██████████████████████████████████████ ███████████████████████████████ ████ █  █
189.7 |██████████████████████████████████████████████████████████████████████████████ █
163.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██████  136
   2 ms | ████████████████████████████████████████  948
   3 ms | ███████████████████████████████████████  915
   4 ms | ███████████  271
   5 ms | ████  97
   6 ms | ███  70
   7 ms | ██  43
   8 ms | ██  43
   9 ms | █  26
  10 ms | ██  40
  11 ms | █  15
  12 ms |   10
  13 ms | ██  52
  14 ms | ████  100
  15 ms | ████  99
  16 ms | ███  71
  17 ms | ███  65
  18 ms | ██  53
  19 ms | ██  50
  20 ms | █  28
  21 ms | █  16
  22 ms | █  17
  23 ms | █  14
  24 ms |   4
  25 ms |   3
  26 ms |   6
  27 ms |   1
  28 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
  33 ms |   1
  34 ms |   1
  36 ms |   1
  38 ms |   2
  40 ms |   1
  41 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_alive_p95` = `1560.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `items_alive_p50` = `1240.00`
- `entity_count_sample_end` = `1561.00`
- `entity_count_sample_start` = `681.00`
- `items_alive_max` = `1560.00`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `34.57`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `160.18`
- `preload_duration_ms` = `50.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `24.39`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `671.35`, min `27.74`, p50 `711.24`, p95 `1037.06`, p99 `1101.18`, 1%low `46.27`, 0.1%low `36.01`, std `266.57`

**Frame time (ms)**  avg `2.77`, p50 `1.41`, p95 `15.51`, p99 `19.07`, p99.9 `24.69`, max `36.05`

**Client tick (ms)**  avg `1.08`, p95 `1.36`, max `13.92`

**Memory**  start `985 MB`, end `1594 MB`, peak `2092 MB`, GC `46 events / 327 ms`

**FPS over sampling window (ASCII):**

```
819.5 |                         █ █                                                    
788.4 |                   █ █   █ █                        █    █          █           
757.3 |                █  █ █   ███        █   █           ███  █          █           
726.2 |                █  ████  █████    █ █   █  █      ██████ ██       █ █           
695.2 |              █ ██ ████  █████    ████  █ ██ ████ ██████████ █    ████     █    
664.1 |  █   █       ████ ████ ███████   ███████ ██ █████████████████  █ ████ ███ █ ███
633.0 | ██   █    █  █████████ ████████ ████████ ██ █████████████████  ██████ █████ ███
601.9 |███  ██    █  █████████ ████████ █████████████████████████████████████ █████ ███
570.8 |████ █████ █  █████████ ████████ █████████████████████████████████████ █████ ███
539.7 |████ ███████  ██████████████████████████████████████████████████████████████████
508.7 |████████████ ███████████████████████████████████████████████████████████████████
477.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  632
   1 ms | ████████████████████████████████████████  5181
   2 ms | ████  484
   3 ms | █  152
   4 ms |   64
   5 ms | █  69
   6 ms |   31
   7 ms |   17
   8 ms |   2
   9 ms |   2
  10 ms |   6
  11 ms |   1
  12 ms |   2
  13 ms |   55
  14 ms | █  84
  15 ms | █  128
  16 ms | █  103
  17 ms | █  74
  18 ms |   48
  19 ms |   26
  20 ms |   17
  21 ms |   8
  22 ms |   6
  23 ms |   3
  24 ms |   8
  25 ms |   3
  26 ms |   1
  30 ms |   1
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.01`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `360.61`
- `fps_1pct_low` = `46.27`
- `preload_duration_ms` = `50.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `655.93`, min `36.61`, p50 `687.87`, p95 `956.08`, p99 `1015.51`, 1%low `49.71`, 0.1%low `41.65`, std `244.41`

**Frame time (ms)**  avg `2.72`, p50 `1.45`, p95 `15.29`, p99 `18.53`, p99.9 `22.17`, max `27.32`

**Client tick (ms)**  avg `0.55`, p95 `0.77`, max `1.38`

**Memory**  start `1224 MB`, end `2004 MB`, peak `2132 MB`, GC `41 events / 264 ms`

**FPS over sampling window (ASCII):**

```
817.7 |  ██ █                                                                          
782.3 |█████████                                                                       
746.8 |█████████                                      █                                
711.4 |█████████ █                              █ █   ███ █   █        ██    █        █
676.0 |█████████ █              █   ████  █     ███   ███ ██ ███  ██   ████ ████  █   █
640.5 |███████████           █████  █████ █   █████  ███████ ███████   ████ ███████ ███
605.1 |███████████    █      ██████ ████████  ██████████████ ███████ ██████████████ ███
569.7 |████████████ ███ ███ ████████████████████████████████ ███████ ██████████████ ███
534.3 |████████████████████ ███████████████████████████████████████████████████████████
498.8 |████████████████████ ███████████████████████████████████████████████████████████
463.4 |████████████████████ ███████████████████████████████████████████████████████████
428.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  133
   1 ms | ████████████████████████████████████████  5873
   2 ms | ████  534
   3 ms | █  78
   4 ms |   43
   5 ms |   69
   6 ms |   27
   7 ms |   4
   8 ms |   1
   9 ms |   1
  10 ms |   2
  11 ms |   1
  12 ms |   6
  13 ms |   53
  14 ms | █  104
  15 ms | █  123
  16 ms | █  118
  17 ms | █  79
  18 ms |   43
  19 ms |   20
  20 ms |   13
  21 ms |   9
  22 ms |   4
  23 ms |   1
  24 ms |   2
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `49.71`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `367.12`
- `preload_duration_ms` = `23.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `41.65`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`
- `doors_placed` = `16.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `634.40`, min `21.66`, p50 `664.51`, p95 `1029.94`, p99 `1080.40`, 1%low `41.29`, 0.1%low `24.45`, std `291.49`

**Frame time (ms)**  avg `3.19`, p50 `1.50`, p95 `15.95`, p99 `19.42`, p99.9 `35.47`, max `46.17`

**Client tick (ms)**  avg `3.87`, p95 `6.19`, max `19.45`

**Memory**  start `1893 MB`, end `1472 MB`, peak `2156 MB`, GC `22 events / 133 ms`

**FPS over sampling window (ASCII):**

```
926.0 |                                                                      █ ██ ██   
868.6 |                        ██                                            ███████   
811.2 |                        ██  ██ ███ ██ █                          ███ ████████  █
753.9 |                        ███████████████                          ████████████  █
696.5 |                ██  █   ███████████████                    █     ████████████ ██
639.1 |       █       ██████   ███████████████         █        █ █ █   ████████████ ██
581.8 |      ██  █ █████████   ████████████████  █    ███       █████   ███████████████
524.4 |      ██ ████████████   ████████████████████   ████    ███████ █████████████████
467.0 |     ████████████████ ████████████████████████ █████  ████████ █████████████████
409.7 |     ███████████████████████████████████████████████████████████████████████████
352.3 |█  █ ███████████████████████████████████████████████████████████████████████████
294.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  493
   1 ms | ████████████████████████████████████████  3977
   2 ms | ████████  760
   3 ms | ██  163
   4 ms | █  84
   5 ms | █  76
   6 ms |   45
   7 ms |   23
   8 ms |   25
   9 ms |   10
  10 ms |   6
  11 ms |   9
  12 ms |   7
  13 ms | █  65
  14 ms | █  100
  15 ms | █  118
  16 ms | █  104
  17 ms | █  72
  18 ms | █  50
  19 ms |   32
  20 ms |   13
  21 ms |   9
  22 ms |   5
  23 ms |   5
  24 ms |   2
  25 ms |   1
  28 ms |   1
  29 ms |   1
  31 ms |   3
  35 ms |   2
  36 ms |   2
  39 ms |   1
  41 ms |   1
  44 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `41.29`
- `fps_harmonic_avg` = `313.35`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `171.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `24.45`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.13`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `847.38`, min `25.36`, p50 `900.09`, p95 `1348.06`, p99 `1388.25`, 1%low `47.99`, 0.1%low `32.26`, std `377.60`

**Frame time (ms)**  avg `2.44`, p50 `1.11`, p95 `14.52`, p99 `18.07`, p99.9 `23.58`, max `39.43`

**Client tick (ms)**  avg `2.74`, p95 `4.73`, max `10.18`

**Memory**  start `1630 MB`, end `1671 MB`, peak `2157 MB`, GC `24 events / 140 ms`

**FPS over sampling window (ASCII):**

```
1261.2 |                        █                                                       
1179.3 |                    ████████                                █     ██       ██   
1097.4 |                    ███████████                      █    ███     ████ ███ ██   
1015.6 |                    ████████████                     █  █ ████    ███████████   
933.7 |                   █████████████                    ██████████   ████████████   
851.8 |                   ██████████████              █   ███████████   ██████████████ 
770.0 |                ██ ██████████████  ████  █   █████████████████   ███████████████
688.1 |              ████████████████████ █████████████████████████████████████████████
606.2 |          █  ███████████████████████████████████████████████████████████████████
524.4 |█       ████████████████████████████████████████████████████████████████████████
442.5 |███  ██ ████████████████████████████████████████████████████████████████████████
360.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  3327
   1 ms | ████████████████████████████████████████  3338
   2 ms | ██████  521
   3 ms | ██  162
   4 ms | █  112
   5 ms | █  70
   6 ms |   35
   7 ms |   21
   8 ms |   14
   9 ms |   10
  10 ms |   3
  12 ms |   25
  13 ms | █  88
  14 ms | ██  139
  15 ms | █  118
  16 ms | █  83
  17 ms | █  53
  18 ms |   31
  19 ms |   24
  20 ms |   11
  21 ms |   8
  22 ms |   4
  23 ms |   2
  25 ms |   3
  27 ms |   1
  31 ms |   1
  34 ms |   1
  39 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `47.99`
- `fps_harmonic_avg` = `410.36`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `39.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `32.26`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.78`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `1068.82`, min `17.78`, p50 `934.60`, p95 `2537.89`, p99 `3094.89`, 1%low `21.54`, 0.1%low `18.58`, std `910.14`

**Frame time (ms)**  avg `5.51`, p50 `1.07`, p95 `25.82`, p99 `41.08`, p99.9 `51.59`, max `56.25`

**Client tick (ms)**  avg `15.70`, p95 `22.15`, max `38.86`

**Memory**  start `1242 MB`, end `1581 MB`, peak `2184 MB`, GC `17 events / 99 ms`

**FPS over sampling window (ASCII):**

```
2878.0 |                                                                            ██  
2624.6 |                                                                            ████
2371.3 |                                                                   █        ████
2117.9 |                                                        █        ███ █      ████
1864.5 |                                            █     ██    ████     █████     █████
1611.2 |                 █        ██   ██    ███   ████   ██    ████     ██████    █████
1357.8 |         █   █   ██       ██   ███   ███   ████   ███   █████    ██████    █████
1104.5 |█        █   █   ██   █   ██   ███   ███   ████   ███   ██████   ███████   █████
851.1 |███      █   ██  ██   ██  ███  ███   ████  ████   ████  ██████   ███████   █████
597.8 |███  ██ ███ ███  ███  ██  ███  ████  ████  █████ █████  ██████   ████████  █████
344.4 |███  ██ ███ ████ ███  ███ ████ ████ ██████ █████ █████ ████████ ██████████ █████
 91.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1761
   1 ms | ████████  369
   2 ms | ████  196
   3 ms | ███  142
   4 ms | ████  196
   5 ms | █████  215
   6 ms | █  42
   7 ms |   10
   8 ms |   5
   9 ms |   7
  10 ms |   9
  11 ms |   1
  12 ms |   8
  13 ms | █  49
  14 ms | █  66
  15 ms | █  63
  16 ms | ██  83
  17 ms | █  45
  18 ms | █  40
  19 ms | █  27
  20 ms | █  33
  21 ms | █  30
  22 ms |   16
  23 ms |   7
  24 ms |   16
  25 ms |   11
  26 ms |   18
  27 ms |   17
  28 ms |   14
  29 ms |   11
  30 ms |   7
  31 ms |   11
  32 ms |   13
  33 ms |   10
  34 ms |   2
  35 ms |   6
  36 ms |   6
  37 ms |   6
  38 ms |   14
  39 ms |   4
  40 ms |   3
  41 ms |   3
  42 ms |   2
  43 ms |   8
  44 ms |   3
  45 ms |   6
  46 ms |   2
  47 ms |   2
  48 ms |   3
  49 ms |   1
  50 ms |   1
  51 ms |   3
  53 ms |   2
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `fps_1pct_low` = `21.54`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4803.02`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `18.58`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `181.42`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `27409.00`
- `preload_duration_ms` = `59.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `926.75`, min `18.67`, p50 `747.00`, p95 `2330.51`, p99 `2997.46`, 1%low `22.55`, 0.1%low `19.35`, std `843.29`

**Frame time (ms)**  avg `6.95`, p50 `1.34`, p95 `30.66`, p99 `40.22`, p99.9 `50.07`, max `53.57`

**Client tick (ms)**  avg `16.21`, p95 `23.39`, max `28.88`

**Memory**  start `1405 MB`, end `1742 MB`, peak `2180 MB`, GC `19 events / 97 ms`

**FPS over sampling window (ASCII):**

```
2688.1 |                                                                               █
2450.1 |                                                                               █
2212.0 |                                                                      ██       █
1974.0 |                                                                  █ ████ █     █
1735.9 |                         █   █                           █  █     ████████     █
1497.9 |                         █   ██        ██           █    ████    █████████     █
1259.8 | ███                █    █   ██    █   ███   ██    ██    ████    ██████████    █
1021.8 |█████    █          █    █   ██    █   ███   ███   ███   █████   ██████████    █
783.7 |█████    █      █   ██  ███  ███  ██   ███   ███   ███  ███████  ██████████   ██
545.7 |██████  ██   █  ██  ██  ███  ███  ███  ████  ████ ████  ███████  ███████████  ██
307.6 |███████ ███ ██  ██ ████ ███  ████ ████ ████ █████ █████ ████████ ████████████ ██
 69.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1258
   1 ms | ███████████  344
   2 ms | ████  122
   3 ms | ███  106
   4 ms | ██  64
   5 ms | █  39
   6 ms | ███  82
   7 ms | ████  131
   8 ms | █  22
   9 ms |   13
  10 ms |   13
  11 ms |   10
  12 ms | █  24
  13 ms | ██  61
  14 ms | ██  56
  15 ms | ██  48
  16 ms | █  41
  17 ms | █  32
  18 ms | █  31
  19 ms | █  31
  20 ms | █  33
  21 ms |   14
  22 ms | █  21
  23 ms | █  19
  24 ms | █  17
  25 ms |   11
  26 ms |   5
  27 ms | █  20
  28 ms | █  29
  29 ms | █  26
  30 ms |   15
  31 ms | █  16
  32 ms |   15
  33 ms |   10
  34 ms |   15
  35 ms |   9
  36 ms |   12
  37 ms |   12
  38 ms |   8
  39 ms |   6
  40 ms |   11
  41 ms |   4
  42 ms |   3
  43 ms |   2
  44 ms |   3
  45 ms |   3
  46 ms |   3
  48 ms |   1
  50 ms |   2
  51 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `fps_1pct_low` = `22.55`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4806.52`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.35`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `143.85`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `20800.00`
- `preload_duration_ms` = `10.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `1425.19`, min `33.04`, p50 `1515.30`, p95 `2416.02`, p99 `2631.34`, 1%low `48.90`, 0.1%low `41.51`, std `635.65`

**Frame time (ms)**  avg `1.64`, p50 `0.66`, p95 `6.34`, p99 `18.52`, p99.9 `22.14`, max `30.27`

**Client tick (ms)**  avg `2.01`, p95 `2.96`, max `4.07`

**Memory**  start `1800 MB`, end `1612 MB`, peak `2219 MB`, GC `44 events / 301 ms`

**FPS over sampling window (ASCII):**

```
2070.4 |                                                            █    █              
1939.9 |                                                            ████ █  █      ███  
1809.3 |█ ██                                     █  █      █ █  █  ███████  █  █  ████ █
1678.8 |████ █                                █  █████     ██████ █████████ █████ ██████
1548.2 |██████                                ██ █████   ████████ ██████████████████████
1417.7 |██████                            █ █ █████████ ████████████████████████████████
1287.1 |███████                        ██ ██████████████████████████████████████████████
1156.6 |███████                    ███ █████████████████████████████████████████████████
1026.0 |███████                █  ████ █████████████████████████████████████████████████
895.5 |████████           ███ █████████████████████████████████████████████████████████
764.9 |█████████  ████  ███████████████████████████████████████████████████████████████
634.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8969
   1 ms | ██████████  2153
   2 ms | █  148
   3 ms | █  142
   4 ms |   100
   5 ms |   54
   6 ms |   25
   7 ms |   19
   8 ms |   4
   9 ms |   2
  10 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   26
  14 ms |   68
  15 ms |   92
  16 ms | █  120
  17 ms |   103
  18 ms |   55
  19 ms |   43
  20 ms |   22
  21 ms |   24
  22 ms |   8
  23 ms |   2
  24 ms |   1
  26 ms |   1
  27 ms |   1
  30 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `fps_1pct_low` = `48.90`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.12`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `41.51`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `609.57`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3087.00`
- `preload_duration_ms` = `25.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1351.77`, min `24.54`, p50 `1448.45`, p95 `2381.72`, p99 `2593.08`, 1%low `48.57`, 0.1%low `38.94`, std `666.27`

**Frame time (ms)**  avg `1.83`, p50 `0.69`, p95 `13.92`, p99 `18.55`, p99.9 `22.99`, max `40.74`

**Client tick (ms)**  avg `2.09`, p95 `3.07`, max `7.49`

**Memory**  start `957 MB`, end `1444 MB`, peak `2285 MB`, GC `43 events / 287 ms`

**FPS over sampling window (ASCII):**

```
1934.4 |   █                                                             █   █       █  
1801.8 |█ ██                                        █   ████ █ █   █  ██ ██  █ ███████  
1669.3 |█████                                    █ ██  █████████   █  █████  ██████████ 
1536.7 |███████                               ███████  ██████████ ██████████████████████
1404.1 |███████                              ███████████████████████████████████████████
1271.6 |███████                              ███████████████████████████████████████████
1139.0 |████████                      █ ███  ███████████████████████████████████████████
1006.5 |████████                █ █   ██████████████████████████████████████████████████
873.9 |████████               ██ ██████████████████████████████████████████████████████
741.3 |██████████           ███████████████████████████████████████████████████████████
608.8 |██████████   █  ████ ███████████████████████████████████████████████████████████
476.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7388
   1 ms | ████████████  2282
   2 ms | ██  283
   3 ms | █  143
   4 ms | █  140
   5 ms |   58
   6 ms |   13
   7 ms |   13
   8 ms |   9
   9 ms |   2
  10 ms |   2
  11 ms |   4
  12 ms |   2
  13 ms |   44
  14 ms |   80
  15 ms |   89
  16 ms | █  120
  17 ms | █  97
  18 ms |   65
  19 ms |   34
  20 ms |   24
  21 ms |   12
  22 ms |   7
  23 ms |   5
  24 ms |   4
  25 ms |   1
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `fps_1pct_low` = `48.57`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.12`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `38.94`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `546.10`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3136.00`
- `preload_duration_ms` = `57.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `816.09`, min `35.48`, p50 `853.09`, p95 `1267.98`, p99 `1442.48`, 1%low `46.89`, 0.1%low `39.04`, std `324.58`

**Frame time (ms)**  avg `2.43`, p50 `1.17`, p95 `15.56`, p99 `19.31`, p99.9 `23.66`, max `28.19`

**Client tick (ms)**  avg `0.77`, p95 `1.05`, max `1.65`

**Memory**  start `1373 MB`, end `2287 MB`, peak `2327 MB`, GC `40 events / 286 ms`

**FPS over sampling window (ASCII):**

```
1068.1 |            █                                                                   
1019.5 |█ █   █   █ █                                                                   
970.8 |███   ██ ██ ██ █  █                                                             
922.2 |████  ██████████  ██                                                     ████  █
873.5 |████ ███████████████  ██       ██                      █       █   ██ ██ ████ ██
824.9 |████████████████████  ████     ██      █             ███       ██  ██ ██ ████ ██
776.3 |████████████████████  ████  █  ██ ██ █ █      █    █ ████ █  ████ ███ ██ ████ ██
727.6 |████████████████████  █████ █  █████████   █  ██  ███████ ██████████████ ████ ██
679.0 |████████████████████ ███████████████████  ██ ███ ████████ ██████████████████████
630.4 |████████████████████████████████████████  ██████ ████████ ██████████████████████
581.7 |████████████████████████████████████████  ███████████████ ██████████████████████
533.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████  2489
   1 ms | ████████████████████████████████████████  4577
   2 ms | ███  367
   3 ms |   56
   4 ms | █  62
   5 ms | █  80
   6 ms |   27
   7 ms |   4
   8 ms |   1
   9 ms |   1
  10 ms |   1
  11 ms |   1
  12 ms |   8
  13 ms |   22
  14 ms | █  76
  15 ms | █  100
  16 ms | █  106
  17 ms | █  100
  18 ms | █  64
  19 ms |   37
  20 ms |   27
  21 ms |   19
  22 ms |   4
  23 ms |   8
  24 ms |   1
  25 ms |   3
  27 ms |   1
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `39.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `39.04`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `412.00`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.89`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1907.73`, min `34.03`, p50 `1971.82`, p95 `2698.83`, p99 `2849.11`, 1%low `51.65`, 0.1%low `43.43`, std `565.89`

**Frame time (ms)**  avg `1.09`, p50 `0.51`, p95 `1.35`, p99 `17.79`, p99.9 `21.32`, max `29.38`

**Client tick (ms)**  avg `0.38`, p95 `0.42`, max `12.31`

**Memory**  start `1531 MB`, end `1420 MB`, peak `2376 MB`, GC `41 events / 293 ms`

**FPS over sampling window (ASCII):**

```
2162.2 |               █          █                                                     
2096.2 | █       █     █          █     █  █                          █                 
2030.2 | █       █     ███      ███ █   ████ █    █   █     █   ██  ████                
1964.2 |█████   ██   █ ████  █████████  ████████  ███ █  █  ██ ███  ████        ██      
1898.3 |███████ ██   █ ████ ██████████  █████████ ███ ████  ██ ███  ████ █   █  ██      
1832.3 |███████ ██   █ ███████████████  █████████ ████████  ███████ ██████ █ █████      
1766.3 |███████ ██ ███████████████████ ██████████ █████████ ███████ ██████ ████████ ██  
1700.3 |███████ ██████████████████████ ██████████ █████████ ██████████████ █████████████
1634.3 |█████████████████████████████████████████ █████████ ██████████████ █████████████
1568.3 |███████████████████████████████████████████████████ ██████████████ █████████████
1502.3 |███████████████████████████████████████████████████ ████████████████████████████
1436.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17175
   1 ms | █  390
   2 ms |   32
   3 ms |   54
   4 ms |   103
   5 ms |   26
   6 ms |   2
   8 ms |   1
   9 ms |   2
  10 ms |   1
  11 ms |   2
  12 ms |   5
  13 ms |   40
  14 ms |   70
  15 ms |   82
  16 ms |   118
  17 ms |   93
  18 ms |   78
  19 ms |   39
  20 ms |   25
  21 ms |   14
  22 ms |   3
  23 ms |   1
  24 ms |   1
  25 ms |   1
  26 ms |   1
  29 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `51.65`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `36.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `43.43`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `918.04`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1791.26`, min `35.93`, p50 `1875.43`, p95 `2558.31`, p99 `2724.40`, 1%low `50.07`, 0.1%low `42.22`, std `548.04`

**Frame time (ms)**  avg `1.20`, p50 `0.53`, p95 `1.87`, p99 `18.15`, p99.9 `22.16`, max `27.84`

**Client tick (ms)**  avg `0.29`, p95 `0.42`, max `0.78`

**Memory**  start `2291 MB`, end `1762 MB`, peak `2451 MB`, GC `40 events / 289 ms`

**FPS over sampling window (ASCII):**

```
2058.1 |                                                                  █             
1991.4 |                                                              █  ██      █      
1924.8 |               █                     █       █        █     █ █████      ███  ██
1858.1 |    █  █ ██    ███   █       █  █ █ ██    ██ █ ███   █████  █ ██████     ███  ██
1791.4 |█   █  ████ ██ ████  █ █   ███ ████ ████  ██ █████ ████████ ████████ █  ████  ██
1724.7 |█  ██ █████████████  ███   ███ █████████  ████████ ████████ ████████ █ █████████
1658.0 |█████ ██████████████ ████  ███ █████████  ████████ ████████ ████████████████████
1591.4 |█████ ██████████████ █████████ █████████  ██████████████████████████████████████
1524.7 |█████ ██████████████ ███████████████████  ██████████████████████████████████████
1458.0 |████████████████████ ████████████████████ ██████████████████████████████████████
1391.3 |█████████████████████████████████████████ ██████████████████████████████████████
1324.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15375
   1 ms | █  521
   2 ms |   52
   3 ms |   40
   4 ms |   102
   5 ms |   46
   6 ms |   4
   8 ms |   1
   9 ms |   1
  10 ms |   2
  11 ms |   5
  12 ms |   4
  13 ms |   24
  14 ms |   44
  15 ms |   74
  16 ms |   112
  17 ms |   134
  18 ms |   68
  19 ms |   48
  20 ms |   27
  21 ms |   13
  22 ms |   14
  23 ms |   3
  24 ms |   2
  26 ms |   1
  27 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `50.07`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `fps_harmonic_avg` = `835.95`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `42.22`
- `seed` = `4019.00`
- `preset_quick` = `1.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1650.62`, min `37.48`, p50 `1854.85`, p95 `2624.80`, p99 `2797.10`, 1%low `50.87`, 0.1%low `43.53`, std `741.46`

**Frame time (ms)**  avg `1.57`, p50 `0.54`, p95 `5.16`, p99 `18.09`, p99.9 `21.83`, max `26.68`

**Client tick (ms)**  avg `0.34`, p95 `0.48`, max `0.72`

**Memory**  start `2197 MB`, end `1833 MB`, peak `2477 MB`, GC `39 events / 281 ms`

**FPS over sampling window (ASCII):**

```
2153.2 |                                       █                                        
2068.6 |█ █                       █     █      █                                        
1984.1 |█ █          █ █ █        █     █ █  █ █    █ █                                 
1899.6 |█ █  █  █  █ █ █ █   █  █ █     █ █  █ █    █ █  █ █     █ █     █  █           
1815.0 |█ █  █  █  █ █ █ █   █  █ █     █ █ ██ █ █  █ █  █ █     █ █     █  █           
1730.5 |█ █  █  █  █████ █  ██  █ █     █ █ ████ █  █ █  █ █  █  █ █   █ █  █   █   █   
1646.0 |█ █  █  █  ████████ ██  █ █ ██  █ ██████ █  █ █  ███  █ ████   █ ██ █   ██  █   
1561.4 |███ ██  █ █████████ ██  ███ ██  █ ████████ ████  ███  █ ████   █ ██ ███ ██ ██   
1476.9 |███ ██  ███████████ ██ ███████████████████ ████ ████  █ ████   ████████ ██ ██  █
1392.4 |██████  ███████████ ███████████████████████████ █████ ███████  █████████████████
1307.8 |███████ ███████████ █████████████████████████████████ ███████ ██████████████████
1223.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10073
   1 ms | ████  902
   2 ms | ███  845
   3 ms | █  208
   4 ms |   79
   5 ms |   33
   6 ms |   18
   7 ms |   10
   8 ms |   1
   9 ms |   1
  11 ms |   4
  12 ms |   4
  13 ms |   34
  14 ms |   80
  15 ms |   97
  16 ms | █  138
  17 ms |   92
  18 ms |   62
  19 ms |   38
  20 ms |   16
  21 ms |   8
  22 ms |   7
  23 ms |   2
  24 ms |   1
  26 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `20.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `43.53`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `638.17`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `50.87`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1689.20`, min `25.98`, p50 `1756.81`, p95 `2420.36`, p99 `2572.45`, 1%low `50.56`, 0.1%low `40.50`, std `524.51`

**Frame time (ms)**  avg `1.24`, p50 `0.57`, p95 `1.92`, p99 `18.16`, p99.9 `21.55`, max `38.49`

**Client tick (ms)**  avg `0.34`, p95 `0.44`, max `9.38`

**Memory**  start `1589 MB`, end `2403 MB`, peak `2503 MB`, GC `36 events / 259 ms`

**FPS over sampling window (ASCII):**

```
1970.7 |                                                                             █  
1915.6 |                                                                     █       ███
1860.4 |                            █            █      █    █        █      ██   █ ████
1805.3 |                            █      █   █ █ █    ██   █       ██     ███   ██████
1750.2 |   ███           █          █ █    ██  █ █ █    ██████  █    ██    ████   ██████
1695.0 |█ ████ ██    █  ██  ██      █ █ █  ██  ███ █   ███████  ██ █████ ███████ ███████
1639.9 |█████████    █  ██ ███    ███████  ███ █████  ████████  ██ █████ ███████ ███████
1584.7 |█████████    █  ██████   ████████  ██████████ ████████  ██ █████████████ ███████
1529.6 |███████████████ ██████  ██████████ ███████████████████ █████████████████ ███████
1474.4 |████████████████████████████████████████████████████████████████████████ ███████
1419.3 |████████████████████████████████████████████████████████████████████████ ███████
1364.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14759
   1 ms | ██  562
   2 ms |   31
   3 ms |   38
   4 ms |   112
   5 ms |   39
   6 ms |   4
   7 ms |   1
   8 ms |   1
   9 ms |   1
  10 ms |   1
  11 ms |   2
  12 ms |   5
  13 ms |   31
  14 ms |   46
  15 ms |   81
  16 ms |   109
  17 ms |   123
  18 ms |   88
  19 ms |   43
  20 ms |   19
  21 ms |   10
  22 ms |   5
  23 ms |   4
  24 ms |   2
  25 ms |   2
  28 ms |   1
  38 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `62.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `40.50`
- `fps_1pct_low` = `50.56`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `805.76`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `1810.32`, min `33.97`, p50 `1913.17`, p95 `2699.27`, p99 `2806.93`, 1%low `50.95`, 0.1%low `40.82`, std `690.83`

**Frame time (ms)**  avg `1.24`, p50 `0.52`, p95 `3.38`, p99 `17.20`, p99.9 `22.36`, max `29.44`

**Client tick (ms)**  avg `0.38`, p95 `0.64`, max `1.89`

**Memory**  start `2422 MB`, end `2154 MB`, peak `2631 MB`, GC `33 events / 247 ms`

**FPS over sampling window (ASCII):**

```
2312.7 |   █            █                                                               
2201.5 |  ██        ██ ██        ██                                                     
2090.3 |█ ██      ███████  █     ███ ████             █                                 
1979.1 |█ ███     ███████ ██     ███ ████    █  █    ███        █                       
1867.9 |█████    ████████ ██ █ █████ █████  ██ ██ █  ███   █  ███    █  ███ █    █      
1756.7 |█████  █ ████████ ██ ███████ ██████ █████ █  ███ █ █  ███ █ ██  ██████   ██  █  
1645.5 |█████  ██████████ ██████████████████████████ ███ ███  █████ ██ ███████   ██ ███ 
1534.3 |█████  █████████████████████████████████████ ███ ████ ████████ ████████ ███ ███ 
1423.1 |████████████████████████████████████████████ ███ ████ ████████ ████████ ███ ███ 
1311.9 |████████████████████████████████████████████ ███ ████ ████████ ████████████ ███ 
1200.7 |███████████████████████████████████████████████████████████████████████████████ 
1089.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14186
   1 ms | ██  867
   2 ms | █  181
   3 ms |   152
   4 ms |   80
   5 ms |   27
   6 ms |   8
   7 ms |   1
   8 ms |   3
  10 ms |   1
  11 ms |   4
  12 ms |   35
  13 ms |   83
  14 ms |   92
  15 ms |   130
  16 ms |   87
  17 ms |   59
  18 ms |   29
  19 ms |   24
  20 ms |   16
  21 ms |   21
  22 ms |   7
  23 ms |   5
  24 ms |   1
  25 ms |   3
  26 ms |   1
  28 ms |   1
  29 ms |   1
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `37.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `40.82`
- `part` = `1.00`
- `fps_harmonic_avg` = `805.25`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `56.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.95`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24052 ms  |  Sample ticks: 400

**FPS**  avg `1541.88`, min `18.47`, p50 `1590.28`, p95 `2501.26`, p99 `2709.09`, 1%low `46.06`, 0.1%low `30.31`, std `631.08`

**Frame time (ms)**  avg `1.51`, p50 `0.63`, p95 `4.83`, p99 `18.42`, p99.9 `24.38`, max `54.14`

**Client tick (ms)**  avg `0.43`, p95 `0.68`, max `6.71`

**Memory**  start `1686 MB`, end `1961 MB`, peak `2844 MB`, GC `33 events / 273 ms`

**FPS over sampling window (ASCII):**

```
2036.2 |         █   █                                                                  
1947.1 |███   █  █   █                                                                  
1858.0 |████ ███ █  ████   █    █                                                       
1769.0 |████████ █ █████   ██████                                                       
1679.9 |████████████████   █████████   █ ██ █            █                              
1590.8 |████████████████   █████████  ██ █████  █     █  ██                             
1501.8 |████████████████████████████  █████████ ██  ███  ███   ████                     
1412.7 |████████████████████████████ ██████████ ██  ███ ████  ███████   █ █ █    █      
1323.6 |███████████████████████████████████████ ███ █████████ ███████ █ █ ████  ██ ██   
1234.6 |███████████████████████████████████████████ █████████ ████████████████████ ████ 
1145.5 |███████████████████████████████████████████ ██████████████████████████████ ████ 
1056.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10983
   1 ms | ████  1235
   2 ms | █  205
   3 ms |   104
   4 ms |   107
   5 ms |   47
   6 ms |   13
   7 ms |   3
   8 ms |   5
   9 ms |   1
  11 ms |   1
  12 ms |   2
  13 ms |   50
  14 ms |   63
  15 ms | █  144
  16 ms |   100
  17 ms |   67
  18 ms |   46
  19 ms |   29
  20 ms |   29
  21 ms |   19
  22 ms |   12
  23 ms |   8
  24 ms |   3
  25 ms |   1
  26 ms |   1
  27 ms |   1
  29 ms |   3
  31 ms |   1
  35 ms |   1
  43 ms |   1
  46 ms |   1
  54 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1001.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `30.31`
- `part` = `1.00`
- `fps_harmonic_avg` = `664.36`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `53.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.06`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1802.94`, min `36.14`, p50 `1935.80`, p95 `2702.67`, p99 `2872.18`, 1%low `50.45`, 0.1%low `39.50`, std `709.13`

**Frame time (ms)**  avg `1.29`, p50 `0.52`, p95 `3.76`, p99 `17.22`, p99.9 `22.93`, max `27.67`

**Client tick (ms)**  avg `0.41`, p95 `0.62`, max `8.38`

**Memory**  start `2246 MB`, end `2648 MB`, peak `3268 MB`, GC `28 events / 242 ms`

**FPS over sampling window (ASCII):**

```
2286.6 |█  █   █ █ █              █                                                     
2164.1 |█  █ ███ ████     █       █                                                     
2041.7 |████ ████████ █ ███  █    █  █████   █         █                                
1919.2 |█████████████ █ ████ █ █  ██ █████  ██         █    █     ██                █   
1796.7 |████████████████████████  █████████ ████   █ ███   ███   ████ █  ██         █ █ 
1674.2 |████████████████████████ ██████████ ████  ███████ ████   ██████  ██  ██   █ ███ 
1551.7 |████████████████████████ ██████████ █████ █████████████  ██████  ███ ██  ██ ███ 
1429.2 |███████████████████████████████████████████████████████  ███████ ███ ███ ██ ███ 
1306.7 |████████████████████████████████████████████████████████████████ ███ ███ ██████ 
1184.2 |████████████████████████████████████████████████████████████████████ ██████████ 
1061.7 |███████████████████████████████████████████████████████████████████████████████ 
939.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13437
   1 ms | ███  997
   2 ms | █  179
   3 ms |   133
   4 ms |   83
   5 ms |   25
   6 ms |   14
   7 ms |   5
   8 ms |   4
   9 ms |   2
  11 ms |   1
  12 ms |   27
  13 ms |   72
  14 ms |   103
  15 ms |   154
  16 ms |   85
  17 ms |   48
  18 ms |   31
  19 ms |   34
  20 ms |   23
  21 ms |   11
  22 ms |   6
  23 ms |   3
  24 ms |   4
  25 ms |   4
  26 ms |   1
  27 ms |   3
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `51.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `39.50`
- `part` = `1.00`
- `fps_harmonic_avg` = `774.44`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.45`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `1723.71`, min `18.94`, p50 `1827.71`, p95 `2672.52`, p99 `2876.10`, 1%low `48.35`, 0.1%low `35.22`, std `690.65`

**Frame time (ms)**  avg `1.37`, p50 `0.55`, p95 `4.03`, p99 `18.16`, p99.9 `22.91`, max `52.80`

**Client tick (ms)**  avg `0.37`, p95 `0.53`, max `2.57`

**Memory**  start `2308 MB`, end `2163 MB`, peak `3346 MB`, GC `29 events / 265 ms`

**FPS over sampling window (ASCII):**

```
2386.6 |      █  █                                                                      
2259.9 | █    ██ ███                                                                    
2133.2 |██    ██ ███ █            ██                                                    
2006.5 |████  ██ █████  ██ █      ████ █                                                
1879.8 |███████████████ ████      ████ █      █    █         █       █           █      
1753.1 |███████████████ █████     ████ █ █   ██  █ █  ███ ████   █ ████ █ █     ██      
1626.5 |███████████████ ██████    ████ ████  ██ ████ ████ ████  ██ ████████     ████    
1499.8 |████████████████████████ ██████████  ████████████ ████  ██ ████████    █████  █ 
1373.1 |███████████████████████████████████ █████████████ ████████ █████████   █████  █ 
1246.4 |█████████████████████████████████████████████████████████████████████████████ ██
1119.7 |█████████████████████████████████████████████████████████████████████████████ ██
993.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12543
   1 ms | ███  1061
   2 ms | █  173
   3 ms |   114
   4 ms |   73
   5 ms |   36
   6 ms |   12
   7 ms |   4
   8 ms |   1
   9 ms |   3
  12 ms |   16
  13 ms |   47
  14 ms |   86
  15 ms |   131
  16 ms |   106
  17 ms |   66
  18 ms |   46
  19 ms |   48
  20 ms |   20
  21 ms |   15
  22 ms |   9
  23 ms |   3
  24 ms |   5
  25 ms |   1
  26 ms |   1
  27 ms |   2
  30 ms |   1
  43 ms |   1
  52 ms |   1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `62.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `35.22`
- `part` = `1.00`
- `fps_harmonic_avg` = `731.25`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.35`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `1756.38`, min `25.81`, p50 `1830.66`, p95 `2701.37`, p99 `2875.79`, 1%low `51.86`, 0.1%low `38.65`, std `702.98`

**Frame time (ms)**  avg `1.30`, p50 `0.55`, p95 `3.85`, p99 `16.75`, p99.9 `22.18`, max `38.75`

**Client tick (ms)**  avg `0.36`, p95 `0.59`, max `1.44`

**Memory**  start `3173 MB`, end `3233 MB`, peak `3558 MB`, GC `26 events / 231 ms`

**FPS over sampling window (ASCII):**

```
2391.3 |█           █                                                                   
2273.6 |██   █     ███                                                                  
2156.0 |██   ███   ███            █                                                     
2038.4 |███  ████ █████  ████   █ █         █   █                                       
1920.7 |█████████ █████ █████   ████   █ █  ██  █                                       
1803.1 |█████████ █████████████ █████ ██ █████ ███  ██  █                               
1685.4 |█████████ ██████████████████████ █████ ███  ██  █  █ ██  ██    █ █     █  █   ██
1567.8 |██████████████████████████████████████ ████ ██  █ ██ ███ ██    █ ███   █  ██  ██
1450.1 |███████████████████████████████████████████ ███ ████ ██████  ████████ ██  ██ ███
1332.5 |████████████████████████████████████████████████████████████ ███████████████████
1214.8 |████████████████████████████████████████████████████████████ ███████████████████
1097.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13254
   1 ms | ███  1022
   2 ms |   152
   3 ms |   149
   4 ms |   79
   5 ms |   39
   6 ms |   14
   7 ms |   7
   8 ms |   1
   9 ms |   1
  10 ms |   2
  12 ms |   17
  13 ms |   88
  14 ms |   82
  15 ms | █  168
  16 ms |   115
  17 ms |   43
  18 ms |   29
  19 ms |   21
  20 ms |   14
  21 ms |   9
  22 ms |   10
  23 ms |   3
  25 ms |   1
  28 ms |   1
  32 ms |   1
  35 ms |   1
  38 ms |   1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `38.65`
- `part` = `1.00`
- `fps_harmonic_avg` = `766.58`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `51.86`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `15.00`
- `entity_count_delta` = `-14.00`
- `preset_long` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24598 ms  |  Sample ticks: 400

**FPS**  avg `1785.46`, min `22.38`, p50 `1867.13`, p95 `2718.43`, p99 `2877.23`, 1%low `48.84`, 0.1%low `33.87`, std `696.33`

**Frame time (ms)**  avg `1.30`, p50 `0.54`, p95 `3.73`, p99 `17.38`, p99.9 `23.74`, max `44.69`

**Client tick (ms)**  avg `0.39`, p95 `0.53`, max `2.10`

**Memory**  start `2667 MB`, end `3151 MB`, peak `3614 MB`, GC `25 events / 225 ms`

**FPS over sampling window (ASCII):**

```
2304.1 |      █ █              █                                                        
2196.3 | █   ██ ███  █████     █    █                                                   
2088.6 |██   ██████████████   ██  █ █ █                                                 
1980.8 |██ █████████████████  ███ ███ █     █                                           
1873.0 |████████████████████ ██████████   █ █ █     █  █ █  █                    █      
1765.3 |████████████████████ ███████████ ██████     █  ███  █       █     █      █      
1657.5 |████████████████████ ███████████████████   ███████  ██  ███ ███  ██      ██     
1549.7 |█████████████████████████████████████████  ████████ ███ ████████ ██  ██████     
1442.0 |█████████████████████████████████████████ █████████ ███ ████████ ██  ██████    █
1334.2 |███████████████████████████████████████████████████ ███ ████████ ██  ███████████
1226.4 |████████████████████████████████████████████████████████████████ ███ ███████████
1118.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13412
   1 ms | ███  917
   2 ms | █  173
   3 ms |   122
   4 ms |   78
   5 ms |   39
   6 ms |   10
   7 ms |   1
   8 ms |   4
   9 ms |   3
  12 ms |   14
  13 ms |   69
  14 ms |   83
  15 ms |   155
  16 ms |   97
  17 ms |   54
  18 ms |   42
  19 ms |   29
  20 ms |   18
  21 ms |   11
  22 ms |   7
  23 ms |   7
  24 ms |   1
  25 ms |   5
  26 ms |   4
  27 ms |   2
  39 ms |   1
  43 ms |   1
  44 ms |   1
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `1550.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `33.87`
- `part` = `1.00`
- `fps_harmonic_avg` = `768.40`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.84`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1797.55`, min `33.75`, p50 `1893.59`, p95 `2721.20`, p99 `2863.09`, 1%low `49.72`, 0.1%low `40.24`, std `697.38`

**Frame time (ms)**  avg `1.29`, p50 `0.53`, p95 `3.56`, p99 `17.62`, p99.9 `22.69`, max `29.63`

**Client tick (ms)**  avg `0.37`, p95 `0.60`, max `1.38`

**Memory**  start `1866 MB`, end `2515 MB`, peak `3706 MB`, GC `25 events / 236 ms`

**FPS over sampling window (ASCII):**

```
2453.2 |█           █                                                                   
2328.5 |█ ██ █     ██                                                                   
2203.7 |█ █████   ███  █                                                                
2078.9 |███████   ███ ██  █   █ █                                                       
1954.1 |███████   ███████ ██  █ ██   ██   █   ██ █    █ █    ██                         
1829.3 |███████ █ █████████████ ████ ███  █ █ ████ █ ██ ████ ██                █  █ █  █
1704.5 |████████████████████████████ ████ ███ █████████ ████ ██  ██        █   █  ███  █
1579.7 |████████████████████████████ ████████ ██████████████ ███ ███   ██████  █  ███ ██
1454.9 |████████████████████████████████████████████████████ ███ ███   ██████  ██████ ██
1330.2 |████████████████████████████████████████████████████████████   ███████ █████████
1205.4 |██████████████████████████████████████████████████████████████████████ █████████
1080.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13541
   1 ms | ███  953
   2 ms | █  172
   3 ms |   108
   4 ms |   79
   5 ms |   34
   6 ms |   10
   7 ms |   2
   8 ms |   2
   9 ms |   1
  10 ms |   2
  12 ms |   7
  13 ms |   81
  14 ms |   71
  15 ms |   135
  16 ms |   112
  17 ms |   59
  18 ms |   44
  19 ms |   30
  20 ms |   21
  21 ms |   20
  22 ms |   9
  23 ms |   5
  24 ms |   4
  25 ms |   3
  26 ms |   2
  29 ms |   1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `4.00`
- `preload_duration_ms` = `66.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `40.24`
- `part` = `1.00`
- `fps_harmonic_avg` = `774.77`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `68.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.72`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `18.00`
- `entity_count_delta` = `-14.00`
- `preset_long` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25094 ms  |  Sample ticks: 400

**FPS**  avg `1521.19`, min `27.08`, p50 `1504.18`, p95 `2574.84`, p99 `2846.23`, 1%low `47.75`, 0.1%low `38.24`, std `684.94`

**Frame time (ms)**  avg `1.56`, p50 `0.66`, p95 `5.55`, p99 `18.57`, p99.9 `23.10`, max `36.92`

**Client tick (ms)**  avg `0.41`, p95 `0.60`, max `4.68`

**Memory**  start `3217 MB`, end `3310 MB`, peak `3915 MB`, GC `27 events / 247 ms`

**FPS over sampling window (ASCII):**

```
2420.0 |      █                                                                         
2268.6 |█     █                                                                         
2117.1 |█ █████                                                                         
1965.6 |████████ █   ██                                                                 
1814.1 |██████████  ███   ██   █          █                                             
1662.6 |██████████  ████ ████  █ ██    █  █     ██   █ █ █                █     █ █     
1511.1 |███████████ █████████ █████ ████  ███  ███   █ ███   ██   █    █ ███    ███     
1359.7 |█████████████████████████████████ ███ ████  ██████   ██  ██  ███ ███  █ ████    
1208.2 |█████████████████████████████████ █████████ ████████ ███ ██ ████████  ███████   
1056.7 |████████████████████████████████████████████████████████████████████  ██████████
905.2 |████████████████████████████████████████████████████████████████████ ███████████
753.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10135
   1 ms | ██████  1613
   2 ms | █  193
   3 ms |   116
   4 ms |   92
   5 ms |   60
   6 ms |   12
   7 ms |   9
   8 ms |   2
  10 ms |   1
  12 ms |   9
  13 ms |   58
  14 ms |   74
  15 ms | █  140
  16 ms |   105
  17 ms |   58
  18 ms |   43
  19 ms |   32
  20 ms |   24
  21 ms |   20
  22 ms |   15
  23 ms |   6
  24 ms |   4
  25 ms |   2
  26 ms |   1
  27 ms |   1
  28 ms |   1
  36 ms |   1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `2044.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `38.24`
- `part` = `1.00`
- `fps_harmonic_avg` = `641.34`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.75`
- `surface_water_ratio` = `0.08`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `1686.89`, min `35.74`, p50 `1758.99`, p95 `2620.01`, p99 `2777.10`, 1%low `50.97`, 0.1%low `42.02`, std `662.92`

**Frame time (ms)**  avg `1.37`, p50 `0.57`, p95 `4.14`, p99 `17.52`, p99.9 `22.16`, max `27.98`

**Client tick (ms)**  avg `0.41`, p95 `0.62`, max `1.06`

**Memory**  start `3068 MB`, end `3553 MB`, peak `4210 MB`, GC `20 events / 201 ms`

**FPS over sampling window (ASCII):**

```
2230.5 |  ██                                                                            
2136.2 |  ███                                                                           
2041.9 |  ███  █        █                                                               
1947.7 | █████ ██  █  █ █                                           ██     █       █    
1853.4 | ████████ ██  ███ ███  ██                                   ████   █  ██   ██   
1759.1 | ████████████ ████████ ██ █                         █     █ ████  ██  ███  ███  
1664.9 |█████████████ ████████ ████           ██ ████   █ ███   ████████  ██  ███  ███ █
1570.6 |███████████████████████████  ██       ███████ █ █ ████ █████████  ██  ███  ███ █
1476.3 |███████████████████████████  ██  ███ ████████ ███ ████ █████████  ██ ████  ███ █
1382.1 |████████████████████████████████ ████████████ ████████ ██████████ ████████ █████
1287.8 |██████████████████████████████████████████████████████ █████████████████████████
1193.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12547
   1 ms | ███  977
   2 ms | █  161
   3 ms |   125
   4 ms |   70
   5 ms |   34
   6 ms |   18
   7 ms |   4
   8 ms |   5
   9 ms |   2
  12 ms |   8
  13 ms |   55
  14 ms |   69
  15 ms | █  167
  16 ms |   118
  17 ms |   73
  18 ms |   39
  19 ms |   36
  20 ms |   16
  21 ms |   10
  22 ms |   10
  23 ms |   3
  24 ms |   4
  25 ms |   1
  27 ms |   1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `65.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `42.02`
- `part` = `1.00`
- `fps_harmonic_avg` = `727.99`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `68.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.97`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `48.00`
- `entity_count_delta` = `-46.00`
- `preset_long` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23638 ms  |  Sample ticks: 400

**FPS**  avg `1846.14`, min `29.74`, p50 `1955.18`, p95 `2751.49`, p99 `2890.05`, 1%low `50.44`, 0.1%low `38.21`, std `693.61`

**Frame time (ms)**  avg `1.23`, p50 `0.51`, p95 `3.04`, p99 `17.19`, p99.9 `22.81`, max `33.62`

**Client tick (ms)**  avg `0.33`, p95 `0.45`, max `1.08`

**Memory**  start `2347 MB`, end `4229 MB`, peak `4284 MB`, GC `22 events / 204 ms`

**FPS over sampling window (ASCII):**

```
2331.6 |                  █                                                             
2236.7 |           ██ █   ███                                                           
2141.8 |   █ █ ███ ██ █ █ ███       █        █           █                              
2046.9 |   ████████████ █ ███      ██ █      █    █     ██                              
1952.0 |  █████████████ █████ █    ██ ██  ██ ███ ███    ██   █     █                    
1857.2 |███████████████ █████ █   ██████  ███████████   ██   █    ██   █   ██           
1762.3 |█████████████████████ ██ ███████  ███████████ █ ██   ███  ███  ██  ██ █         
1667.4 |████████████████████████████████  █████████████ ████ ████████  ██  ██ ██ █ ██   
1572.5 |████████████████████████████████ ████████████████████████████ ███  ██ ████ ██  █
1477.6 |████████████████████████████████ ████████████████████████████ ███  ███████ ██ ██
1382.7 |██████████████████████████████████████████████████████████████████ ███████ ██ ██
1287.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14442
   1 ms | ██  856
   2 ms |   139
   3 ms |   97
   4 ms |   76
   5 ms |   31
   6 ms |   10
   9 ms |   1
  12 ms |   24
  13 ms |   69
  14 ms |   72
  15 ms |   146
  16 ms |   114
  17 ms |   54
  18 ms |   37
  19 ms |   35
  20 ms |   22
  21 ms |   11
  22 ms |   6
  23 ms |   4
  24 ms |   4
  25 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   1
  32 ms |   1
  33 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `609.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `38.21`
- `part` = `1.00`
- `fps_harmonic_avg` = `813.13`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `56.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.44`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1640.17`, min `23.51`, p50 `1680.56`, p95 `2593.81`, p99 `2800.23`, 1%low `48.03`, 0.1%low `36.49`, std `657.83`

**Frame time (ms)**  avg `1.41`, p50 `0.60`, p95 `4.32`, p99 `18.19`, p99.9 `23.70`, max `42.54`

**Client tick (ms)**  avg `0.37`, p95 `0.57`, max `2.33`

**Memory**  start `3435 MB`, end `4245 MB`, peak `4354 MB`, GC `20 events / 207 ms`

**FPS over sampling window (ASCII):**

```
2327.2 |  █ █                                                                           
2214.5 |  █ █                                                                           
2101.7 |█ █ ██                                                                          
1989.0 |█ █████       █    █           █                                                
1876.3 |████████     ████ ██ █  ██     █  █                                             
1763.5 |████████  ██ ████ ████  ███  ███ █████ █ █   █                  █               
1650.8 |█████████████████ ████  ███  █████████ ███  ███  ██        █    █ ██   ██       
1538.1 |█████████████████ ████ ████  █████████ ███  ███  ███  ██  ███   █ ███  ███      
1425.3 |████████████████████████████ █████████████  ████ ████████████   █ ███  ███  █   
1312.6 |█████████████████████████████████████████████████████████████  ████████████ █  █
1199.9 |█████████████████████████████████████████████████████████████ ████████████████ █
1087.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12047
   1 ms | ████  1088
   2 ms | █  169
   3 ms |   115
   4 ms |   72
   5 ms |   41
   6 ms |   11
   7 ms |   4
   9 ms |   5
  11 ms |   1
  12 ms |   8
  13 ms |   65
  14 ms |   64
  15 ms | █  152
  16 ms |   90
  17 ms |   66
  18 ms |   44
  19 ms |   34
  20 ms |   31
  21 ms |   19
  22 ms |   7
  23 ms |   6
  24 ms |   5
  25 ms |   1
  26 ms |   3
  28 ms |   1
  37 ms |   1
  42 ms |   1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `41.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `36.49`
- `part` = `1.00`
- `fps_harmonic_avg` = `707.54`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `63.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.03`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `54.00`
- `entity_count_delta` = `-53.00`
- `preset_long` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `1883.09`, min `22.31`, p50 `2019.66`, p95 `2763.65`, p99 `2899.44`, 1%low `50.05`, 0.1%low `36.90`, std `708.88`

**Frame time (ms)**  avg `1.22`, p50 `0.50`, p95 `3.30`, p99 `17.31`, p99.9 `22.42`, max `44.82`

**Client tick (ms)**  avg `0.34`, p95 `0.52`, max `1.75`

**Memory**  start `2722 MB`, end `3050 MB`, peak `4520 MB`, GC `21 events / 214 ms`

**FPS over sampling window (ASCII):**

```
2466.1 |  ██                                                                            
2337.3 |  ██     █ █            █                                                       
2208.5 |█ ███    █ ██ █         ██                                                      
2079.7 |███████  ██████       █ ██ █ █ █   █     █  █ █    █      ██   █                
1950.9 |█████████████████  █████████ ████  █    ██  ███  █ █      ███  █  ███       ██  
1822.1 |█████████████████ ██████████ ████ ██   ███ ████  ███     ████  █  ███       ██  
1693.3 |█████████████████████████████████████  █████████ █████   ████  ██ ████   █ ███ █
1564.4 |██████████████████████████████████████ █████████ ████████████  ███████  ██████ █
1435.6 |██████████████████████████████████████ ███████████████████████ ████████ ████████
1306.8 |██████████████████████████████████████████████████████████████ ████████ ████████
1178.0 |███████████████████████████████████████████████████████████████████████ ████████
1049.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14444
   1 ms | ██  899
   2 ms |   146
   3 ms |   114
   4 ms |   75
   5 ms |   34
   6 ms |   15
   7 ms |   4
   8 ms |   1
  12 ms |   19
  13 ms |   70
  14 ms |   102
  15 ms |   146
  16 ms |   89
  17 ms |   47
  18 ms |   44
  19 ms |   33
  20 ms |   20
  21 ms |   16
  22 ms |   9
  23 ms |   3
  25 ms |   2
  26 ms |   1
  27 ms |   1
  33 ms |   1
  43 ms |   1
  44 ms |   1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_end` = `14.00`
- `preload_duration_ms` = `49.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `36.90`
- `part` = `1.00`
- `fps_harmonic_avg` = `816.85`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.05`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `13.00`
- `preset_long` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23079 ms  |  Sample ticks: 400

**FPS**  avg `1944.58`, min `25.81`, p50 `2019.37`, p95 `2736.02`, p99 `2917.88`, 1%low `51.56`, 0.1%low `42.24`, std `562.98`

**Frame time (ms)**  avg `1.06`, p50 `0.50`, p95 `1.21`, p99 `17.72`, p99.9 `21.17`, max `38.74`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `0.80`

**Memory**  start `2816 MB`, end `2960 MB`, peak `4620 MB`, GC `25 events / 210 ms`

**FPS over sampling window (ASCII):**

```
2392.5 |                █                                                               
2316.4 |              █ █                                                               
2240.3 |              █ █                   █    █                                      
2164.2 |              █ ██                  █ █  █                                      
2088.1 | █            ████    █        █    █ █ ██          █               █      █    
2012.0 |████ █      █ ████  █ █    ███ █  ████████   █ █ ██ ██     █   ██ █ ██   ████  █
1935.9 |██████   █  ██████  ███   ████ ███████████   ██████ ██ █   █   ██ ████  ██████ █
1859.8 |██████  ██ ███████  ████  ████████████████ █ ███████████   ███████████  ████████
1783.7 |██████ █████████████████  ██████████████████████████████   ███████████  ████████
1707.6 |██████ █████████████████████████████████████████████████   ███████████  ████████
1631.5 |█████████████████████████████████████████████████████████ ████████████ █████████
1555.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17780
   1 ms | █  347
   2 ms |   15
   3 ms |   58
   4 ms |   109
   5 ms |   20
   6 ms |   1
   8 ms |   1
  10 ms |   1
  11 ms |   3
  12 ms |   6
  13 ms |   40
  14 ms |   62
  15 ms |   71
  16 ms |   128
  17 ms |   99
  18 ms |   76
  19 ms |   38
  20 ms |   25
  21 ms |   10
  22 ms |   3
  23 ms |   3
  24 ms |   2
  25 ms |   1
  26 ms |   1
  38 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `1923.00`
- `fps_1pct_low` = `51.56`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `945.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `42.24`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `50.00`
- `preset_long` = `0.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `186.49`, min `19.63`, p50 `212.23`, p95 `293.16`, p99 `319.15`, 1%low `26.60`, 0.1%low `20.32`, std `85.73`

**Frame time (ms)**  avg `8.06`, p50 `4.71`, p95 `20.56`, p99 `32.58`, p99.9 `43.98`, max `50.95`

**Client tick (ms)**  avg `3.87`, p95 `9.26`, max `14.94`

**Memory**  start `4263 MB`, end `2798 MB`, peak `4614 MB`, GC `18 events / 175 ms`

**FPS over sampling window (ASCII):**

```
226.7 |                                                            █                   
217.5 |     █  ███                       █       █            █    █      █    █       
208.2 |     █  ███                       █       ██       ██  █    █    █ █  █ █     █ 
199.0 |█ ██ ██████                     █ ██    █ ██    █ ███ ███   █    █ ██ █ █  ██ █ 
189.8 |████ ████████       █    ██     █████  ██ ██    █ ███████████   █████ ███  ██ █ 
180.6 |█████████████       ██   ████  ██████████ ██  ███ ███████████   ███████████████ 
171.4 |█████████████       ██  █████ ██████████████  ███ ████████████  ████████████████
162.1 |█████████████  █   ███  ████████████████████  ████████████████ █████████████████
152.9 |████████████████ ██████ █████████████████████ ██████████████████████████████████
143.7 |███████████████████████ ████████████████████████████████████████████████████████
134.5 |███████████████████████ ████████████████████████████████████████████████████████
125.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   8
   3 ms | ████████████████████████████████████████  719
   4 ms | █████████████████████████████████████  670
   5 ms | ████████████  209
   6 ms | █████  96
   7 ms | █████  98
   8 ms | ███  52
   9 ms | ██  28
  10 ms | █  26
  11 ms | █  9
  12 ms | █  10
  13 ms | █  14
  14 ms | ███  52
  15 ms | ████  68
  16 ms | ████  73
  17 ms | █████  85
  18 ms | ████  65
  19 ms | ███  57
  20 ms | ██  38
  21 ms | ██  29
  22 ms | █  16
  23 ms | █  11
  24 ms |   7
  25 ms |   3
  26 ms |   2
  28 ms |   1
  29 ms |   1
  30 ms |   3
  31 ms |   3
  32 ms |   8
  33 ms |   5
  34 ms |   4
  35 ms |   2
  36 ms |   2
  37 ms |   1
  38 ms |   4
  39 ms |   1
  40 ms |   1
  42 ms |   1
  45 ms |   1
  47 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.32`
- `fps_1pct_low` = `26.60`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `43.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `124.14`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `1802.80`, min `37.08`, p50 `1869.67`, p95 `2548.45`, p99 `2733.38`, 1%low `51.79`, 0.1%low `44.16`, std `542.38`

**Frame time (ms)**  avg `1.15`, p50 `0.53`, p95 `1.58`, p99 `17.67`, p99.9 `21.33`, max `26.97`

**Client tick (ms)**  avg `0.32`, p95 `0.44`, max `0.65`

**Memory**  start `3744 MB`, end `3350 MB`, peak `4614 MB`, GC `23 events / 211 ms`

**FPS over sampling window (ASCII):**

```
2150.2 |                              █                                                 
2081.2 |█                             █                               █                 
2012.2 |█                             █ █          ███                █            ██   
1943.2 |█ ██                          ████         ████            ██ █    ██   █  ██   
1874.2 |█ ███   ██      ██   █        ████   ██   ███████          ████   █████ █  ███  
1805.2 |█████ █ ██ ██  ███  ██ █ ██ ██████   ███  ███████     █    ████   ███████ ████  
1736.2 |█████ ████ ███████  ████ █████████   ████████████     █    ████   ███████ █████ 
1667.2 |███████████████████ ████ █████████   █████████████  ████ ████████ █████████████ 
1598.2 |██████████████████████████████████   ██████████████████████████████████████████ 
1529.2 |██████████████████████████████████ ████████████████████████████████████████████ 
1460.2 |███████████████████████████████████████████████████████████████████████████████ 
1391.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16075
   1 ms | █  500
   2 ms |   31
   3 ms |   49
   4 ms |   121
   5 ms |   24
  11 ms |   1
  12 ms |   8
  13 ms |   44
  14 ms |   67
  15 ms |   91
  16 ms |   119
  17 ms |   109
  18 ms |   60
  19 ms |   40
  20 ms |   21
  21 ms |   15
  22 ms |   2
  23 ms |   1
  26 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `56.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `44.16`
- `part` = `1.00`
- `fps_harmonic_avg` = `869.07`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `51.79`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1799.24`, min `23.44`, p50 `1889.60`, p95 `2550.22`, p99 `2718.07`, 1%low `50.41`, 0.1%low `39.62`, std `544.10`

**Frame time (ms)**  avg `1.17`, p50 `0.53`, p95 `1.74`, p99 `18.04`, p99.9 `21.35`, max `42.67`

**Client tick (ms)**  avg `0.31`, p95 `0.39`, max `0.71`

**Memory**  start `3676 MB`, end `3288 MB`, peak `4614 MB`, GC `22 events / 190 ms`

**FPS over sampling window (ASCII):**

```
2024.3 |                                         █                                      
1970.3 |                                        ██    ██    █       █   █ ███           
1916.3 |   ██                        █   █ █    ███   ██  █ █       █ █ █ ███           
1862.3 | █ ██ ████  █               ██ ███ █    ████ ███ ██ █     █ ███ █████    ██  ███
1808.3 | ████ █████ █  █        █   █████████   ████ ████████     ███████████   ███ ████
1754.3 |█████ █████ █ ██       ██  ██████████   ████ ██████████   ████████████  ████████
1700.3 |████████████████████  ███ ███████████  █████ ██████████   ████████████  ████████
1646.3 |████████████████████  ███ ███████████  █████ ██████████  ███████████████████████
1592.3 |████████████████████  ███ ██████████████████████████████████████████████████████
1538.3 |████████████████████  ██████████████████████████████████████████████████████████
1484.3 |████████████████████ ███████████████████████████████████████████████████████████
1430.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15685
   1 ms | █  494
   2 ms |   32
   3 ms |   48
   4 ms |   131
   5 ms |   41
   6 ms |   5
  11 ms |   3
  12 ms |   2
  13 ms |   23
  14 ms |   74
  15 ms |   88
  16 ms |   104
  17 ms |   105
  18 ms |   78
  19 ms |   42
  20 ms |   21
  21 ms |   21
  22 ms |   7
  25 ms |   1
  32 ms |   1
  41 ms |   1
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `50.41`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `21.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `39.62`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `851.12`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1669.91`, min `37.77`, p50 `1733.57`, p95 `2353.30`, p99 `2482.58`, 1%low `51.50`, 0.1%low `43.39`, std `506.67`

**Frame time (ms)**  avg `1.24`, p50 `0.58`, p95 `2.08`, p99 `17.74`, p99.9 `21.52`, max `26.48`

**Client tick (ms)**  avg `0.32`, p95 `0.40`, max `0.76`

**Memory**  start `4551 MB`, end `3936 MB`, peak `4620 MB`, GC `25 events / 202 ms`

**FPS over sampling window (ASCII):**

```
1895.1 |                        █                                                       
1835.7 |█ ██     ██            ██   ███      █                                          
1776.3 |█ ███    ██   █    █   ███  ████     █  █   █  █       █   ██      █   █ █      
1716.8 |█ ███ █████ █ ██   ███████ █████   █ █ ███████ █    █  █   ██      █ █ █ ██     
1657.4 |████████████████   █████████████   ███ ███████ ██   █  ███ ███    █████████     
1597.9 |████████████████   ███████████████ ███ ██████████   ██████ ████   ███████████   
1538.5 |████████████████   ███████████████ ███ ██████████   ███████████   ███████████   
1479.1 |████████████████ █████████████████ ████████████████ ███████████ █ ███████████  █
1419.6 |█████████████████████████████████████████████████████████████████ ███████████  █
1360.2 |██████████████████████████████████████████████████████████████████████████████ █
1300.8 |██████████████████████████████████████████████████████████████████████████████ █
1241.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14805
   1 ms | █  518
   2 ms |   34
   3 ms |   43
   4 ms |   106
   5 ms |   45
   6 ms |   5
   7 ms |   1
  11 ms |   2
  12 ms |   1
  13 ms |   41
  14 ms |   68
  15 ms |   94
  16 ms |   114
  17 ms |   113
  18 ms |   77
  19 ms |   22
  20 ms |   27
  21 ms |   10
  22 ms |   6
  23 ms |   1
  24 ms |   1
  25 ms |   1
  26 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `51.50`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `50.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `43.39`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `807.11`
- `restocks` = `20.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1422.51`, min `35.17`, p50 `1477.29`, p95 `2041.38`, p99 `2180.22`, 1%low `49.37`, 0.1%low `42.10`, std `439.66`

**Frame time (ms)**  avg `1.44`, p50 `0.68`, p95 `4.39`, p99 `18.65`, p99.9 `21.75`, max `28.43`

**Client tick (ms)**  avg `0.32`, p95 `0.43`, max `0.73`

**Memory**  start `2566 MB`, end `2801 MB`, peak `4616 MB`, GC `22 events / 207 ms`

**FPS over sampling window (ASCII):**

```
1630.5 |                                                                       █     █  
1585.1 |                                 █                         █  █        █     ██ 
1539.7 |█                            █   █               █      █ ██  ███    █████  ███ 
1494.3 |█           █               ███  █   ███         █    █ ████  ███   ██████  ███ 
1448.9 |██ █   █ █ ██       █     ████████   ███  █    █ █   ██ ████ ████   ███████████ 
1403.5 |██ █  ██ ████ █     ███   ████████   ████ █   ████   ██ ████ █████  ████████████
1358.1 |█████ ███████ ███   ███   ████████   ████████ ████   █████████████  ████████████
1312.7 |█████████████████   ████ ███████████ ████████ █████ ██████████████  ████████████
1267.3 |██████████████████ █████████████████ █████████████████████████████  ████████████
1221.9 |████████████████████████████████████ ██████████████████████████████ ████████████
1176.4 |███████████████████████████████████████████████████████████████████ ████████████
1131.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12471
   1 ms | ██  666
   2 ms |   34
   3 ms |   35
   4 ms |   87
   5 ms |   64
   6 ms |   8
  11 ms |   1
  12 ms |   4
  13 ms |   22
  14 ms |   48
  15 ms |   65
  16 ms |   116
  17 ms |   97
  18 ms |   91
  19 ms |   55
  20 ms |   32
  21 ms |   18
  22 ms |   6
  23 ms |   2
  24 ms |   3
  26 ms |   1
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `30.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `42.10`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `696.35`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `49.37`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195100 ms  |  Sample ticks: 3600

**FPS**  avg `182.17`, min `0.84`, p50 `182.16`, p95 `343.48`, p99 `418.77`, 1%low `20.54`, 0.1%low `8.67`, std `101.79`

**Frame time (ms)**  avg `9.21`, p50 `5.49`, p95 `23.12`, p99 `37.95`, p99.9 `46.96`, max `1196.68`

**Client tick (ms)**  avg `0.97`, p95 `1.33`, max `27.77`

**Memory**  start `3239 MB`, end `4305 MB`, peak `4835 MB`, GC `233 events / 2056 ms`

**FPS over sampling window (ASCII):**

```
282.2 |█                                                                               
266.1 |█                                                                               
250.1 |█                                                 █  █    █  ██    █ █          
234.0 |█                                     █          ████████████████  █████        
218.0 |█                                    ███         █████████████████ █████        
201.9 |█   █       █                       ████   ███   █████████████████ ███████      
185.9 |██  █      ██                   █ █ ████   ████  ██████████████████████████ ████
169.8 |██  ██     ███              ████████████   ████  ███████████████████████████████
153.8 |██  ██     ███              ████████████  █████ ████████████████████████████████
137.7 |██  ███    ███   █     █   █████████████  █████ ████████████████████████████████
121.7 |███ ████   ████ ████  ██   █████████████ ███████████████████████████████████████
105.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   42
   2 ms | ███████████  1205
   3 ms | ████████████████████████████████████████  4289
   4 ms | ██████████████████████████████  3220
   5 ms | ███████████████████  1992
   6 ms | ████████████████  1709
   7 ms | ███████████  1233
   8 ms | ██████  643
   9 ms | ███  301
  10 ms | █  131
  11 ms | █  59
  12 ms |   23
  13 ms |   13
  14 ms |   10
  15 ms | █  61
  16 ms | ██  196
  17 ms | ████  378
  18 ms | ██████  597
  19 ms | ███████  757
  20 ms | ███████  740
  21 ms | █████  576
  22 ms | ████  426
  23 ms | ███  275
  24 ms | ██  162
  25 ms | █  80
  26 ms | █  57
  27 ms |   25
  28 ms |   10
  29 ms |   7
  30 ms |   8
  31 ms |   7
  32 ms |   5
  33 ms |   18
  34 ms |   39
  35 ms |   47
  36 ms |   47
  37 ms |   42
  38 ms |   45
  39 ms |   25
  40 ms |   24
  41 ms |   20
  42 ms |   18
  43 ms |   13
  44 ms |   12
  45 ms |   8
  46 ms |   9
  47 ms |   4
  48 ms |   3
  49 ms |   2
  50 ms |   1
  51 ms |   1
  53 ms |   1
  58 ms |   1
  64 ms |   1
  65 ms |   1
  74 ms |   1
 100 ms |   1
 109 ms |   1
1196 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `86.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `20.54`
- `fps_harmonic_avg` = `108.59`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `139.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `8.67`
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

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195572 ms  |  Sample ticks: 3600

**FPS**  avg `184.32`, min `15.15`, p50 `180.71`, p95 `357.05`, p99 `492.50`, 1%low `23.24`, 0.1%low `19.62`, std `108.92`

**Frame time (ms)**  avg `9.34`, p50 `5.53`, p95 `24.18`, p99 `39.43`, p99.9 `47.15`, max `66.02`

**Client tick (ms)**  avg `0.94`, p95 `1.38`, max `20.32`

**Memory**  start `3667 MB`, end `3656 MB`, peak `4762 MB`, GC `260 events / 2706 ms`

**FPS over sampling window (ASCII):**

```
261.5 |                                                   █       █      ████          
246.8 |                                                  ██     ███████  █████         
232.1 |                                          █      ██████ ████████████████        
217.3 |█                                   ██   ██ █   ████████████████████████████████
202.6 |█                                   ██   ████   ████████████████████████████████
187.9 |█   █      █                       ████  ████  █████████████████████████████████
173.1 |█   █      ██                ██████████  ████  █████████████████████████████████
158.4 |█   █      ██              ████████████  ████  █████████████████████████████████
143.7 |█   ██     ██         █    ████████████  █████ █████████████████████████████████
128.9 |█   ██   █████  ████ ███   ████████████  █████ █████████████████████████████████
114.2 |█  ████ ████████████ ██████████████████ ████████████████████████████████████████
 99.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  180
   2 ms | ███████████  1200
   3 ms | ████████████████████████████████████████  4237
   4 ms | ███████████████████████████  2841
   5 ms | ███████████████████  2064
   6 ms | ████████████████  1743
   7 ms | ██████████  1110
   8 ms | █████  553
   9 ms | ███  270
  10 ms | ██  169
  11 ms | █  85
  12 ms |   33
  13 ms |   17
  14 ms |   29
  15 ms | ██  159
  16 ms | ██  181
  17 ms | ███  274
  18 ms | █████  499
  19 ms | ██████  647
  20 ms | ██████  677
  21 ms | █████  554
  22 ms | ████  431
  23 ms | ███  321
  24 ms | ██  233
  25 ms | █  123
  26 ms | █  87
  27 ms |   48
  28 ms |   39
  29 ms |   25
  30 ms |   12
  31 ms |   9
  32 ms |   11
  33 ms |   23
  34 ms |   17
  35 ms |   38
  36 ms |   47
  37 ms |   49
  38 ms |   43
  39 ms |   29
  40 ms |   47
  41 ms |   31
  42 ms |   24
  43 ms |   18
  44 ms |   18
  45 ms |   8
  46 ms |   6
  47 ms |   9
  48 ms |   3
  49 ms |   2
  51 ms |   2
  52 ms |   1
  53 ms |   2
  54 ms |   1
  56 ms |   1
  66 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `20.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `90.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `23.24`
- `fps_harmonic_avg` = `107.11`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `139.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.62`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `70.00`
- `trees_built` = `173.00`
- `phase` = `1.00`
- `segment_count` = `19.00`
- `part` = `3.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194208 ms  |  Sample ticks: 3600

**FPS**  avg `111.26`, min `19.09`, p50 `104.70`, p95 `277.44`, p99 `376.95`, 1%low `21.36`, 0.1%low `20.06`, std `80.16`

**Frame time (ms)**  avg `15.28`, p50 `9.55`, p95 `42.30`, p99 `45.46`, p99.9 `48.84`, max `52.37`

**Client tick (ms)**  avg `0.75`, p95 `0.96`, max `12.85`

**Memory**  start `4458 MB`, end `3049 MB`, peak `4764 MB`, GC `44 events / 251 ms`

**FPS over sampling window (ASCII):**

```
150.9 |                                                               █                
145.4 |                                                              ██ █              
140.0 |                                                             ███████            
134.5 |                                                          █ ████████            
129.0 |                                                        ██████████████          
123.6 |                                                      █ █████████████████   █   
118.1 |                                               █     ███████████████████████████
112.6 |█   █  █                                 █     ██    ███████████████████████████
107.2 |█ █ █ ██           ██            █    █  ██   ████  ████████████████████████████
101.7 |█████████ █ ████ ████ ██ ███    ████████████  ████  ████████████████████████████
 96.2 |████████████████████████████████████████████ ███████████████████████████████████
 90.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   2
   2 ms | ██████  231
   3 ms | ███████████████████  703
   4 ms | ██████████████████  659
   5 ms | █████████████  464
   6 ms | ██████████████████  640
   7 ms | ████████████████████████████  1027
   8 ms | ████████████████████████████████████████  1444
   9 ms | █████████████████████████████████  1204
  10 ms | ██████████████████  667
  11 ms | ██████  234
  12 ms | █  48
  13 ms |   8
  14 ms |   2
  15 ms |   1
  16 ms |   1
  17 ms |   8
  18 ms | ██  65
  19 ms | ███████  260
  20 ms | ████████████  417
  21 ms | ███████████████  526
  22 ms | ███████████  386
  23 ms | ██████  201
  24 ms | ██████  217
  25 ms | █████  182
  26 ms | ███████  236
  27 ms | █████████  309
  28 ms | ████████  289
  29 ms | ██████  210
  30 ms | ███  97
  31 ms | █  40
  32 ms |   14
  33 ms |   11
  34 ms |   7
  35 ms | █  26
  36 ms | █  45
  37 ms | █  43
  38 ms | █  34
  39 ms | █  27
  40 ms | ██  58
  41 ms | ███  96
  42 ms | ████  160
  43 ms | █████  178
  44 ms | ████  138
  45 ms | ██  87
  46 ms | █  41
  47 ms | █  21
  48 ms |   8
  49 ms |   4
  50 ms |   3
  51 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `21.36`
- `fps_harmonic_avg` = `65.45`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `139.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `20.06`
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

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194948 ms  |  Sample ticks: 3600

**FPS**  avg `97.03`, min `12.80`, p50 `74.99`, p95 `278.55`, p99 `363.62`, 1%low `18.25`, 0.1%low `16.59`, std `84.17`

**Frame time (ms)**  avg `19.65`, p50 `13.33`, p95 `49.17`, p99 `53.05`, p99.9 `56.21`, max `78.15`

**Client tick (ms)**  avg `0.71`, p95 `0.92`, max `1.38`

**Memory**  start `3644 MB`, end `4737 MB`, peak `4769 MB`, GC `38 events / 228 ms`

**FPS over sampling window (ASCII):**

```
146.8 |                                                                    █           
140.4 |                                                                    █           
134.0 |                                                          █ █       █           
127.6 |                                                          █ █   ██  █           
121.2 |                                                        █ █ ██  █████           
114.7 |█                                                       ██████████████ █      █ 
108.3 |█                                                      █████████████████████████
101.9 |█                                                    ███████████████████████████
 95.5 |█  █████      █                          █    ████  ████████████████████████████
 89.1 |████████  ██ ██   ███           ██████ ████  ███████████████████████████████████
 82.7 |█████████████████ ███ █   █ █   ████████████████████████████████████████████████
 76.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   2 ms | ████████████  174
   3 ms | ████████████████████████████████████████  557
   4 ms | ██████████████████████████████████████  530
   5 ms | █████████████████████████████  404
   6 ms | █████████████████████████  349
   7 ms | █████████████████████  293
   8 ms | ████████████████████  275
   9 ms | ██████████████████████████  371
  10 ms | ████████████████████████████████████  501
  11 ms | ████████████████████████████████████████  563
  12 ms | ████████████████████████████████  449
  13 ms | ██████████████████████  305
  14 ms | █████████████  181
  15 ms | ████  63
  16 ms | █  16
  17 ms |   6
  18 ms |   7
  19 ms | █  10
  20 ms | ███  46
  21 ms | █████████  129
  22 ms | ████████████████████  284
  23 ms | ███████████████████████  319
  24 ms | ██████████████████████  312
  25 ms | ███████████████████████  321
  26 ms | ███████████████  214
  27 ms | ███████████  161
  28 ms | █████████  130
  29 ms | ███████  94
  30 ms | █████████  122
  31 ms | ██████████  139
  32 ms | ███████████  160
  33 ms | █████████  121
  34 ms | ███████████  148
  35 ms | ███████  94
  36 ms | ██████  85
  37 ms | ████  50
  38 ms | ███  41
  39 ms | ██  32
  40 ms | ██  33
  41 ms | ██  28
  42 ms | ██  29
  43 ms | ███  42
  44 ms | ██████  80
  45 ms | █████  75
  46 ms | ███████  92
  47 ms | ████████  118
  48 ms | █████████  131
  49 ms | █████████  125
  50 ms | ████████  111
  51 ms | ██████  85
  52 ms | ████  55
  53 ms | ███  49
  54 ms | ██  23
  55 ms | █  14
  56 ms | █  8
  57 ms |   2
  58 ms |   1
  64 ms |   1
  78 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `13.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `86.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `18.25`
- `fps_harmonic_avg` = `50.89`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `139.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `16.59`
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

