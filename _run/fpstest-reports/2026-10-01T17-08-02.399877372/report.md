# MC Benchmark Core session — 2026-10-01T17:43:27.947696129+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1355.5 | 49.5 | 39.5 | 18.04 | 0.83 | 85 | 814 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 1036.3 | 49.6 | 42.3 | 18.43 | 0.85 | 67 | 1134 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 890.3 | 26.7 | 21.2 | 32.52 | 0.76 | 54 | 892 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 28.2 | 19.4 | 17.6 | 48.23 | 0.76 | 14 | 376 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.8 | 20.5 | 20.1 | 48.02 | 0.70 | 14 | 790 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 28.6 | 19.3 | 18.3 | 49.20 | 0.53 | 15 | 167 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 28.5 | 20.2 | 20.0 | 49.01 | 0.72 | 15 | 790 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 28.6 | 19.1 | 16.9 | 49.40 | 1.15 | 16 | 180 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 30.8 | 15.8 | 14.3 | 60.29 | 3.25 | 16 | 814 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 31.4 | 15.5 | 14.5 | 61.82 | 4.01 | 17 | 83 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 28.6 | 19.8 | 18.4 | 48.03 | 0.97 | 14 | 652 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 28.4 | 20.0 | 17.6 | 47.76 | 0.53 | 16 | 849 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 32.1 | 15.9 | 15.7 | 61.47 | 3.50 | 20 | 746 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.6 | 15.9 | 14.6 | 59.92 | 2.77 | 18 | 876 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 35.4 | 13.2 | 12.3 | 72.01 | 14.15 | 28 | 430 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 36.9 | 13.3 | 12.1 | 72.31 | 14.76 | 26 | 749 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 29.1 | 17.1 | 15.4 | 51.98 | 1.88 | 21 | 241 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 29.8 | 16.9 | 16.5 | 56.69 | 1.88 | 20 | 725 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.4 | 19.3 | 17.3 | 48.60 | 0.67 | 14 | 778 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 24.4 | 8.8 | n/a | 111.86 | 0.32 | 10 | 528 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 9.8 | 8.7 | n/a | 114.18 | 0.29 | 6 | 429 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 9.8 | 8.3 | n/a | 115.25 | 0.32 | 4 | 462 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 9.8 | 8.6 | n/a | 114.07 | 0.30 | 6 | 204 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 1768.7 | 49.3 | 36.6 | 17.54 | 0.41 | 55 | 1076 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1592.5 | 23.8 | 18.4 | 34.57 | 0.41 | 34 | 475 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 28.8 | 17.1 | 16.4 | 54.67 | 0.37 | 30 | 112 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 29.0 | 14.7 | 13.1 | 62.38 | 0.37 | 25 | 320 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 28.7 | 16.4 | 15.3 | 56.17 | 0.35 | 22 | 1552 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 28.6 | 15.7 | 13.4 | 55.25 | 0.37 | 22 | 1666 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 28.6 | 15.2 | 13.3 | 56.80 | 0.39 | 21 | 1332 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 29.1 | 15.6 | 13.9 | 59.71 | 0.36 | 24 | 1036 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 28.9 | 15.5 | 14.2 | 56.80 | 0.45 | 22 | 1178 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 28.5 | 15.0 | 11.8 | 55.32 | 0.31 | 19 | 1795 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 28.9 | 14.5 | 13.2 | 63.45 | 0.36 | 22 | 1324 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 28.3 | 16.1 | 12.8 | 56.09 | 0.38 | 19 | 286 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 28.3 | 20.6 | 20.2 | 48.03 | 0.26 | 8 | 788 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 30.8 | 16.5 | 16.3 | 58.70 | 3.11 | 8 | 676 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 28.6 | 20.2 | 19.9 | 48.74 | 0.27 | 5 | 852 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 28.4 | 20.1 | 19.1 | 48.51 | 0.28 | 5 | 1956 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 28.4 | 19.8 | 19.0 | 48.34 | 0.28 | 5 | 1868 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 28.2 | 19.9 | 19.1 | 49.12 | 0.30 | 5 | 1920 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 9.9 | 7.9 | 7.7 | 124.54 | 0.71 | 69 | 2027 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 183.3 | 8.2 | 7.7 | 115.44 | 0.73 | 113 | 106 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 70.9 | 15.3 | 12.9 | 62.04 | 0.87 | 187 | 1803 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 31.9 | 13.5 | 10.3 | 66.72 | 0.84 | 160 | 1426 |

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

Category: **Particles**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1355.48`, min `35.45`, p50 `1405.61`, p95 `2068.41`, p99 `2344.02`, 1%low `49.50`, 0.1%low `39.53`, std `496.41`

**Frame time (ms)**  avg `1.54`, p50 `0.71`, p95 `4.87`, p99 `18.04`, p99.9 `23.05`, max `28.21`

**Client tick (ms)**  avg `0.83`, p95 `1.49`, max `7.36`

**Memory**  start `524 MB`, end `1260 MB`, peak `1339 MB`, GC `85 events / 326 ms`

**FPS over sampling window (ASCII):**

```
1902.1 |                                                                       █        
1788.0 |                                                        █  █           █        
1674.0 |                                                    █  ███ █ █  ██  ████        
1559.9 |                                      ██        █ █ █ ██████ █████ █████        
1445.9 |                                   █ ████ █     ████████████████████████  ███  █
1331.8 |          █ █ ██  █ █          █ ███████████████████████████████████████████████
1217.8 |    ███  ███████  ███      █ ███████████████████████████████████████████████████
1103.7 |    █████████████████   █ ██████████████████████████████████████████████████████
989.7 |  █████████████████████ ████████████████████████████████████████████████████████
875.6 | ███████████████████████████████████████████████████████████████████████████████
761.6 | ███████████████████████████████████████████████████████████████████████████████
647.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10728
   1 ms | █████  1270
   2 ms | █  178
   3 ms |   65
   4 ms |   106
   5 ms |   47
   6 ms |   12
   7 ms |   9
   8 ms |   6
   9 ms |   3
  10 ms |   1
  12 ms |   8
  13 ms |   45
  14 ms |   67
  15 ms |   116
  16 ms |   95
  17 ms |   98
  18 ms |   51
  19 ms |   28
  20 ms |   24
  21 ms |   9
  22 ms |   7
  23 ms |   6
  24 ms |   2
  25 ms |   3
  27 ms |   3
  28 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 1623 | 1042.2 | 18.40 |
| `flame` | 160 | 1623 | 1259.7 | 16.19 |
| `dripping_water` | 240 | 1623 | 1107.0 | 20.14 |
| `dragon_breath` | 160 | 1623 | 1361.7 | 17.35 |
| `end_rod` | 240 | 1623 | 1395.9 | 17.96 |
| `portal` | 160 | 1623 | 1620.1 | 17.45 |
| `ALL_TOGETHER` | 1680 | 1623 | 1607.7 | 17.78 |
| `sculk_charge_pop` | 240 | 1623 | 1451.6 | 18.35 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `49.50`
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
- `fps_harmonic_avg` = `649.39`
- `fps_0p1pct_low` = `39.53`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `1036.27`, min `36.40`, p50 `1086.72`, p95 `1548.35`, p99 `1652.98`, 1%low `49.62`, 0.1%low `42.33`, std `368.69`

**Frame time (ms)**  avg `1.90`, p50 `0.92`, p95 `14.22`, p99 `18.43`, p99.9 `21.97`, max `27.47`

**Client tick (ms)**  avg `0.85`, p95 `1.45`, max `2.96`

**Memory**  start `534 MB`, end `1126 MB`, peak `1668 MB`, GC `67 events / 335 ms`

**FPS over sampling window (ASCII):**

```
1206.2 |                                                            █       █  █        
1155.5 |           █                 ███         █  █       █       █ ███   █  █ █      
1104.7 |        █  █     █ █        ████ █   █   ██ █       █ █  █  █ ████  █  █ ████   
1054.0 |     █  ██ ██    ███    █ █ ████ █ █ █   █████ ██ █ ███  █ ███████  █ ██ ████ █ 
1003.2 |   ███  ███████ ██████ ██ █ ████ █ █ █  ██████ ██ ██████ ████████████ ██████████
952.5 |   ███ ███████████████ ██ ██████ █ ███████████ █████████████████████████████████
901.8 |  ████ █████████████████████████████████████████████████████████████████████████
851.0 | ███████████████████████████████████████████████████████████████████████████████
800.3 | ███████████████████████████████████████████████████████████████████████████████
749.6 | ███████████████████████████████████████████████████████████████████████████████
698.8 | ███████████████████████████████████████████████████████████████████████████████
648.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6766
   1 ms | ████████████████  2698
   2 ms | █  224
   3 ms |   69
   4 ms |   81
   5 ms |   54
   6 ms |   19
   7 ms |   7
   8 ms |   5
   9 ms |   3
  10 ms |   5
  11 ms |   1
  12 ms |   6
  13 ms |   21
  14 ms | █  86
  15 ms | █  101
  16 ms | █  126
  17 ms | █  91
  18 ms |   47
  19 ms |   39
  20 ms |   18
  21 ms |   14
  22 ms |   6
  23 ms |   3
  26 ms |   1
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `49.62`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `42.33`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `525.23`
- `preload_duration_ms` = `64.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23138 ms  |  Sample ticks: 400

**FPS**  avg `890.30`, min `19.21`, p50 `927.29`, p95 `1302.77`, p99 `1375.38`, 1%low `26.72`, 0.1%low `21.21`, std `326.43`

**Frame time (ms)**  avg `2.47`, p50 `1.08`, p95 `15.24`, p99 `32.52`, p99.9 `44.81`, max `52.06`

**Client tick (ms)**  avg `0.76`, p95 `1.20`, max `1.84`

**Memory**  start `759 MB`, end `777 MB`, peak `1652 MB`, GC `54 events / 281 ms`

**FPS over sampling window (ASCII):**

```
1131.7 |                  █                                                             
1052.0 |                  █              █      █            █                          
972.3 |█ █ █     █ ██ ██ █  ██       █ ██ █   ███ ███   █   ██                   ██    
892.7 |██████  ██████ ████ ████ █████████ ███████ ███ ███  █████  ███ █   █ ███ ████ █ 
813.0 |███████████████████ ██████████████ ████████████████████████████████████████████ 
733.3 |███████████████████████████████████████████████████████████████████████████████ 
653.7 |███████████████████████████████████████████████████████████████████████████████ 
574.0 |███████████████████████████████████████████████████████████████████████████████ 
494.3 |███████████████████████████████████████████████████████████████████████████████ 
414.6 |███████████████████████████████████████████████████████████████████████████████ 
335.0 |███████████████████████████████████████████████████████████████████████████████ 
255.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████████████  3058
   1 ms | ████████████████████████████████████████  4104
   2 ms | ██  179
   3 ms | █  66
   4 ms |   44
   5 ms |   51
   6 ms |   7
   7 ms |   5
   8 ms |   3
   9 ms |   4
  10 ms |   3
  11 ms |   3
  12 ms |   4
  13 ms |   36
  14 ms | █  87
  15 ms | █  115
  16 ms | █  97
  17 ms | █  54
  18 ms |   40
  19 ms |   25
  20 ms |   11
  21 ms |   7
  23 ms |   3
  25 ms |   1
  31 ms |   2
  32 ms |   12
  33 ms |   17
  34 ms |   14
  35 ms |   5
  36 ms |   7
  37 ms |   2
  38 ms |   1
  39 ms |   6
  40 ms |   1
  41 ms |   2
  42 ms |   3
  43 ms |   4
  44 ms |   3
  45 ms |   2
  46 ms |   3
  47 ms |   2
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `26.72`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.21`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `404.99`
- `preload_duration_ms` = `63.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `28.24`, min `17.58`, p50 `28.93`, p95 `36.55`, p99 `49.43`, 1%low `19.44`, 0.1%low `17.58`, std `5.44`

**Frame time (ms)**  avg `36.51`, p50 `34.57`, p95 `46.29`, p99 `48.23`, p99.9 `53.92`, max `56.88`

**Client tick (ms)**  avg `0.76`, p95 `0.98`, max `1.63`

**Memory**  start `1102 MB`, end `1356 MB`, peak `1478 MB`, GC `14 events / 64 ms`

**FPS over sampling window (ASCII):**

```
 31.4 |               █        █                                            █          
 30.8 |     █         █        █                               █            █          
 30.2 |    ██  █   █  █     █  █                 █ █ █         █            █          
 29.5 | █  ██  █  ██  █     █  ██                █ █ █ █     █ █         █  █    █   █ 
 28.9 | █  ██  ██ ██  █   █ █  ██   █  █  █      █ █ ████ █  ███  █      █  █    █ █ █ 
 28.3 | █  ██  ██ ██  █ ███ █  ███ ██  ████    █ █ ██████ █  ███  █   █  ██ █  █ █ █ █ 
 27.7 |██  ██ █████████ ███ ██ ███ ███ ██████  ███ ██████ █  ███  ██  █  ██ ██ █ █ █ █ 
 27.1 |███ ██ ████████████████ ███ ███████████████ ████████ █████████ ██ ██ ████ ███ █ 
 26.5 |███ ███████████████████ █████████████████████████████████████████ ██ ██████████ 
 25.8 |█████████████████████████████████████████████████████████████████ ██ ███████████
 25.2 |█████████████████████████████████████████████████████████████████ ██ ███████████
 24.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  3
  19 ms | █  2
  20 ms | ██  5
  21 ms | ████  10
  22 ms | █  2
  23 ms | █  4
  24 ms |   1
  26 ms |   1
  30 ms | █  4
  31 ms | ███  9
  32 ms | ████████████████████████████  79
  33 ms | ████████████████████████████████████████  111
  34 ms | █████████████████████  57
  35 ms | ██████████  29
  36 ms | ██████████  27
  37 ms | ██████  17
  38 ms | ███████  19
  39 ms | █████  14
  40 ms | ██████  16
  41 ms | ██████  18
  42 ms | ███████  20
  43 ms | ██████  18
  44 ms | █████████  25
  45 ms | ████████  21
  46 ms | ██████  18
  47 ms | ████  11
  48 ms | █  4
  51 ms | █  2
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `19.44`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.58`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.39`
- `preload_duration_ms` = `52.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `28.81`, min `20.10`, p50 `29.14`, p95 `42.10`, p99 `49.53`, 1%low `20.49`, 0.1%low `20.10`, std `7.73`

**Frame time (ms)**  avg `36.00`, p50 `34.31`, p95 `46.13`, p99 `48.02`, p99.9 `49.71`, max `49.76`

**Client tick (ms)**  avg `0.70`, p95 `1.01`, max `4.51`

**Memory**  start `718 MB`, end `1176 MB`, peak `1509 MB`, GC `14 events / 59 ms`

**FPS over sampling window (ASCII):**

```
 50.1 |█                                                                               
 47.9 |█                                                                               
 45.6 |█                                                                               
 43.4 |█                                                                               
 41.1 |█                                                                               
 38.9 |█                                                                               
 36.6 |█                                                                               
 34.4 |█                                                                               
 32.1 |█  █                                 █                █                    █    
 29.9 |█  ██       █        █ █   █    █ █ ██  █    █    █   ███ █  █   █ ███ █   ██ ██
 27.6 |██ ██████████████████████ ████████████████████████████████████ █ █ ███████ █████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   1
  18 ms |   1
  19 ms | █  3
  20 ms | ██  7
  21 ms | ████  12
  22 ms | █  2
  23 ms | █  3
  24 ms | █  2
  25 ms |   1
  27 ms | █  3
  30 ms | █  2
  31 ms | █  2
  32 ms | █████████████████████████████  84
  33 ms | ████████████████████████████████████████  117
  34 ms | ████████████████████████████  81
  35 ms | ██████████  28
  36 ms | █████████  26
  37 ms | ████  12
  38 ms | █████  15
  39 ms | ████  13
  40 ms | ██████  18
  41 ms | █████  16
  42 ms | █████  15
  43 ms | ██████  19
  44 ms | ██████  17
  45 ms | ████████  23
  46 ms | ██████  17
  47 ms | ███  9
  48 ms | █  4
  49 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.49`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.10`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.78`
- `preload_duration_ms` = `29.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23134 ms  |  Sample ticks: 400

**FPS**  avg `28.55`, min `18.30`, p50 `29.25`, p95 `45.29`, p99 `48.42`, 1%low `19.31`, 0.1%low `18.30`, std `6.06`

**Frame time (ms)**  avg `36.30`, p50 `34.19`, p95 `47.00`, p99 `49.20`, p99.9 `54.37`, max `54.63`

**Client tick (ms)**  avg `0.53`, p95 `0.70`, max `4.43`

**Memory**  start `1315 MB`, end `953 MB`, peak `1482 MB`, GC `15 events / 69 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |                                                       █                        
 32.6 |       █                              █                █                        
 31.9 |       █               █            █ █                █                 █      
 31.2 |       █               █   █   █    ████      █        █                 █      
 30.5 |       █          █ █  █   █   █ █  ████      █        ██    █    █      █      
 29.7 |     █ █   █    █ █ ██ █   █   █ █  ████      █  █   █ ██    █  █ █      █      
 29.0 |     █ █   █ █  █ █ ██ █████   █ █  ████ █    █  █   █ ██    █  ███  █ █ █      
 28.3 |  █  █ █   █ ██ █ █ ██ █████   █ █ █████ ██  ██  ██ ██ ██  █ ██ ███ ████ █    █ 
 27.6 |████ █ █ █ ████████ ██ █████████ ███████ ██████████ ██ █████ ██ ███ ████ █   ██ 
 26.8 |████ █████████████████ █████████ ███████████████████████████ █████████████ █████
 26.1 |████████████████████████████████████████████████████████████ ███████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  16 ms |   1
  17 ms |   1
  18 ms |   1
  19 ms |   1
  20 ms | █  3
  21 ms | ██████  18
  22 ms | ██  7
  23 ms |   1
  24 ms |   1
  25 ms |   1
  26 ms |   1
  28 ms |   1
  30 ms | █  2
  31 ms | █  3
  32 ms | █████████████████████████  78
  33 ms | ████████████████████████████████████████  124
  34 ms | █████████████████████  65
  35 ms | ████████  26
  36 ms | ██████  19
  37 ms | █████  16
  38 ms | ███████  21
  39 ms | ████  12
  40 ms | ███  10
  41 ms | █████  14
  42 ms | █████  16
  43 ms | ███████  21
  44 ms | █████  16
  45 ms | ██████████  30
  46 ms | ████  13
  47 ms | █████  15
  48 ms | ██  5
  49 ms | █  4
  51 ms | █  2
  54 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `19.31`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `18.30`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.55`
- `preload_duration_ms` = `26.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `28.53`, min `19.99`, p50 `28.93`, p95 `44.68`, p99 `49.28`, 1%low `20.16`, 0.1%low `19.99`, std `5.85`

**Frame time (ms)**  avg `36.24`, p50 `34.57`, p95 `46.48`, p99 `49.01`, p99.9 `49.98`, max `50.03`

**Client tick (ms)**  avg `0.72`, p95 `1.02`, max `1.51`

**Memory**  start `725 MB`, end `838 MB`, peak `1515 MB`, GC `15 events / 63 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |█                                       █                                       
 33.2 |█                                       █                                       
 32.4 |█              █                        █                                       
 31.6 |█              █                        █                                       
 30.9 |█   █    █   █ █             █          ██  █         ██ █   █    █       █ █   
 30.1 |█   █    █ █ █ █   █ █       █  █   █   ██  █   █     ██ █   █    █       █ █   
 29.3 |█   ██   █ █ █ █ █ ████  ██  ██ █   █ █ █████   █     ██ █   █    █  █    █ █   
 28.5 |█ █ ██ █ ███ █ █ ██████  ███ ██ █   ███ █████   ██   ███ █   █    █  █   ████ █ 
 27.8 |█ █ ██ █████ █ █ ██████ ████ ██ ██  ███ █████   ███ ██████ ███ ██ ██ █   ████ █ 
 27.0 |█ █ ███████████████████ ███████ ██ ██████████  ███████████████ █████ ██ ███████ 
 26.2 |███ ██████████████████████████████ █████████████████████████████████ ███████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  18 ms |   1
  19 ms | █  2
  20 ms | ████  9
  21 ms | █████  11
  22 ms | ███  6
  23 ms | █  2
  25 ms |   1
  27 ms | █  2
  28 ms |   1
  29 ms | █  2
  30 ms | █  3
  31 ms | ██  5
  32 ms | ██████████████████████████████  73
  33 ms | ████████████████████████████████████████  96
  34 ms | ██████████████████████████████████  81
  35 ms | █████████████  30
  36 ms | ███████████  26
  37 ms | ███████  17
  38 ms | ██████████  23
  39 ms | ██████████  24
  40 ms | ████  10
  41 ms | ██████  14
  42 ms | ██████  14
  43 ms | ████████  18
  44 ms | ████████  18
  45 ms | █████████  21
  46 ms | ██████████  24
  47 ms | █  3
  48 ms | ███  7
  49 ms | ██  5
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.16`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.99`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.60`
- `preload_duration_ms` = `47.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `28.63`, min `16.90`, p50 `28.80`, p95 `44.45`, p99 `50.33`, 1%low `19.10`, 0.1%low `16.90`, std `6.27`

**Frame time (ms)**  avg `36.31`, p50 `34.72`, p95 `46.71`, p99 `49.40`, p99.9 `57.34`, max `59.18`

**Client tick (ms)**  avg `1.15`, p95 `1.39`, max `10.38`

**Memory**  start `1288 MB`, end `1397 MB`, peak `1469 MB`, GC `16 events / 64 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |                                    █                     █                     
 32.8 |                                    █                     █                     
 32.1 |                █                   █                     █              █      
 31.3 |             █  █ █      █          █ █            █      █              █      
 30.6 |             █  █ █      █     █    █ █            █      █  █           █   █  
 29.8 |   █  █    █ █  █ ███    █     █    █ █    █  █   ██      █  █           ██  █  
 29.1 |█  ██ █    █ ██ █ ███    █     ██ █ █ █   ██  █   ██ ██ █ █ ██ ██        ███ █ █
 28.3 |█ ███████  ████ █ ████   ███   ██ █ █ ██████  ██  ██ ██ █ ███████     ██ █████ █
 27.6 |█ ███████  ████ █ ████   ████████ █ █ ███████████ █████ █ ████████  ██████████ █
 26.8 |█████████ ███████ ██████ ████████ █████████████████████ █ ██████████████████████
 26.1 |█████████████████ ███████████████ ███████████████████████ ██████████████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | ████  7
  20 ms | ███  6
  21 ms | ███  6
  22 ms | █████  10
  23 ms | ████  8
  24 ms | ██  3
  25 ms | █  1
  26 ms | ██  3
  27 ms | █  2
  29 ms | ██  3
  30 ms | ███  6
  31 ms | ███████████  20
  32 ms | ████████████████████████████████████  67
  33 ms | ████████████████████████████████████████  75
  34 ms | ███████████████████████████████████  66
  35 ms | █████████████  25
  36 ms | ██████████  18
  37 ms | ██████████  18
  38 ms | █████████████  25
  39 ms | ██████████  19
  40 ms | ███████████  20
  41 ms | ██████████  18
  42 ms | ███████  14
  43 ms | ████████████  23
  44 ms | ██████████  18
  45 ms | ██████████████  26
  46 ms | ███████████  20
  47 ms | ██████  12
  48 ms | ██  3
  49 ms | ███  5
  55 ms | █  1
  59 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `19.10`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.90`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.54`
- `preload_duration_ms` = `24.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `30.76`, min `14.33`, p50 `27.75`, p95 `54.68`, p99 `62.76`, 1%low `15.76`, 0.1%low `14.33`, std `10.96`

**Frame time (ms)**  avg `36.22`, p50 `36.03`, p95 `56.41`, p99 `60.29`, p99.9 `66.73`, max `69.80`

**Client tick (ms)**  avg `3.25`, p95 `4.10`, max `8.78`

**Memory**  start `717 MB`, end `656 MB`, peak `1531 MB`, GC `16 events / 58 ms`

**FPS over sampling window (ASCII):**

```
 37.1 |   █                                    █                                       
 36.0 |█  █ █                                  █                                       
 35.0 |█  █ █   █  █       █      █            █                                       
 33.9 |█  █ █   ██ █   █   █      █ █        █ █  █                                    
 32.9 |██ █ █   ██ █ █ █   █  █  ██ █        █ █  █  █   █         █  █  █  █        █ 
 31.8 |██ █ █  ███ █ █ █   █  █ ███ █  █     █ █  █  █   █     █   █  ██ ██ █ █      █ 
 30.8 |████ █ ██████ ███ █ ████ ██████ ██ ██ █ █  ██ ██  █     ██  █  ██ ██ █ █ █  ███ 
 29.7 |████ ████████ ██████████ ████████████ █ █  █████  █     ██  █  █████ █ ███  ████
 28.7 |████ ███████████████████ ████████████ █ █ ████████████  ██  █ ████████ ███  ████
 27.6 |███████████████████████████████████████ ███████████████████ ████████████████████
 26.6 |███████████████████████████████████████████████████████████ ████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms | █  1
  15 ms | ████  6
  16 ms | ████  5
  17 ms | ██████████  14
  18 ms | ██████  8
  19 ms | ████  6
  20 ms | █████████████  18
  21 ms | ████████████████  22
  22 ms | ███████  10
  23 ms | ██████████  14
  24 ms | ███  4
  25 ms | █  2
  26 ms | █  1
  27 ms | ██  3
  28 ms | ██  3
  29 ms | ████████████  17
  30 ms | █████████████████████████████  41
  31 ms | ██████  9
  32 ms | ███████  10
  33 ms | ████████████████████████████████████████  56
  34 ms | ███████████  15
  35 ms | ███████  10
  36 ms | ██████████████████████████████████████  53
  37 ms | ████████████████████████  34
  38 ms | ███████████  15
  39 ms | ███████  10
  40 ms | ██████  8
  41 ms | █████  7
  42 ms | ███████  10
  43 ms | ████████  11
  44 ms | █████  7
  45 ms | ████████  11
  46 ms | ██████  9
  47 ms | █████  7
  48 ms | █████  7
  49 ms | ██████  9
  50 ms | ████  5
  51 ms | ████  5
  52 ms | ██████  8
  53 ms | █████████  12
  54 ms | ████  5
  55 ms | ██████  8
  56 ms | ███████  10
  57 ms | ████  5
  58 ms | ██████  8
  59 ms | ████  6
  60 ms | ██  3
  61 ms | █  1
  64 ms | █  2
  69 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `15.76`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `14.33`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.61`
- `preload_duration_ms` = `35.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `31.45`, min `14.48`, p50 `27.75`, p95 `53.36`, p99 `62.23`, 1%low `15.50`, 0.1%low `14.48`, std `17.01`

**Frame time (ms)**  avg `36.39`, p50 `36.04`, p95 `56.50`, p99 `61.82`, p99.9 `67.46`, max `69.04`

**Client tick (ms)**  avg `4.01`, p95 `6.01`, max `8.46`

**Memory**  start `1453 MB`, end `1521 MB`, peak `1536 MB`, GC `17 events / 63 ms`

**FPS over sampling window (ASCII):**

```
 70.9 |                                                        █                       
 66.8 |                                                        █                       
 62.6 |                                                        █                       
 58.4 |                                                        █                       
 54.3 |                                                        █                       
 50.1 |                                                        █                       
 46.0 |                                                        █                       
 41.8 |                                                        █                       
 37.6 |                          █                             █             █ █       
 33.5 | █  █ █  █ █    ███  █  ███ █  █     █ █ █ ██    █    █ █ █ █       █ ███   ███ 
 29.3 |█████ █ ████ ████████████████████ ████ ██████████████████████ ██████████████████
 25.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   5 ms | █  1
  10 ms | █  1
  11 ms | █  1
  14 ms | █  1
  16 ms | █████  4
  17 ms | ██████████  8
  18 ms | ███████████████████  15
  19 ms | ████████████████  13
  20 ms | ██████████████████  14
  21 ms | ██████████████████  14
  22 ms | ████████████████████████  19
  23 ms | ██████████████  11
  24 ms | ███████████  9
  25 ms | ████████████████████  16
  26 ms | █████████  7
  27 ms | ████████  6
  28 ms | ██████████████████  14
  29 ms | ████████████████  13
  30 ms | ████████████████  13
  31 ms | ███████████████  12
  32 ms | ████████████████████  16
  33 ms | ████████████████████████████████████████  32
  34 ms | ███████████████████  15
  35 ms | ███████████████████████  18
  36 ms | ███████████████████████  18
  37 ms | ███████████████████████  18
  38 ms | ███████████████████████  18
  39 ms | █████████████  10
  40 ms | ██████████████  11
  41 ms | ███████████████████  15
  42 ms | ████████████████████  16
  43 ms | ████████████████████  16
  44 ms | ███████████████  12
  45 ms | ██████████████████  14
  46 ms | █████████████████████████████  23
  47 ms | ████████████████████  16
  48 ms | ███████████████████  15
  49 ms | █████████  7
  50 ms | █████████████  10
  51 ms | █████████  7
  52 ms | █████████  7
  53 ms | ████  3
  54 ms | █████████  7
  55 ms | ████  3
  56 ms | ████  3
  57 ms | ██████████  8
  58 ms | ████  3
  59 ms | ███  2
  60 ms | ██████  5
  61 ms | █████  4
  62 ms | ███  2
  64 ms | █  1
  66 ms | █  1
  69 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `14.48`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `27.48`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `15.50`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `28.56`, min `18.43`, p50 `28.65`, p95 `44.90`, p99 `49.18`, 1%low `19.81`, 0.1%low `18.43`, std `6.37`

**Frame time (ms)**  avg `36.47`, p50 `34.90`, p95 `46.42`, p99 `48.03`, p99.9 `52.74`, max `54.26`

**Client tick (ms)**  avg `0.97`, p95 `1.19`, max `1.73`

**Memory**  start `882 MB`, end `1243 MB`, peak `1535 MB`, GC `14 events / 56 ms`

**FPS over sampling window (ASCII):**

```
 34.9 |                                                                        █       
 34.0 |                                                                        █       
 33.1 |                                                                        █       
 32.2 |                                        █              █                █       
 31.3 |                 █   █   █              █   █          █                █       
 30.4 |  █     █     █  █   █   █              █  ███ █      ██          █     █   █   
 29.5 |█ █     █     █ ██ ███   █          █   █  █████   █  ██      ██  █  █  ██  █ █ 
 28.6 |█ █  ██ █ █ █ █ ██ ████  ███   ██████  ██  █████   █  ██    ████ ██  █ ███  █ █ 
 27.7 |█ █  ████ █ ███ ██ ██████████████████  ███ ███████ █  ██ ███████ ██  █ ████ █ ██
 26.8 |████ █████████████ ███████████████████████ ███████ █ ███ ██████████  ██████ ████
 25.9 |██████████████████████████████████████████████████ █ ███████████████ ███████████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | ██  3
  19 ms | █  1
  20 ms | ████  7
  21 ms | ██████  11
  22 ms | ████████  16
  23 ms | ████  8
  26 ms | █  1
  27 ms | █  2
  28 ms | █  1
  29 ms | █  2
  30 ms | █  1
  31 ms | ██████████  19
  32 ms | ████████████████████████████████████████  76
  33 ms | ████████████████████████████████████████  76
  34 ms | ██████████████████████████████  57
  35 ms | ███████████████  28
  36 ms | ██████████  19
  37 ms | ███████  13
  38 ms | ████████  16
  39 ms | ████████████  22
  40 ms | ██████  11
  41 ms | ████████  15
  42 ms | ██████████  19
  43 ms | ████████  15
  44 ms | ████████████████  30
  45 ms | █████████████████████  39
  46 ms | █████████████  24
  47 ms | █████  10
  48 ms | ██  4
  49 ms | █  1
  51 ms | █  1
  54 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `preload_duration_ms` = `64.00`
- `fps_1pct_low` = `19.81`
- `fps_harmonic_avg` = `27.42`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `18.43`
- `part` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `28.36`, min `17.62`, p50 `29.04`, p95 `42.10`, p99 `48.23`, 1%low `20.00`, 0.1%low `17.62`, std `5.43`

**Frame time (ms)**  avg `36.34`, p50 `34.44`, p95 `45.88`, p99 `47.76`, p99.9 `52.72`, max `56.75`

**Client tick (ms)**  avg `0.53`, p95 `0.70`, max `1.14`

**Memory**  start `705 MB`, end `930 MB`, peak `1555 MB`, GC `16 events / 73 ms`

**FPS over sampling window (ASCII):**

```
 32.0 |           █                    █                                               
 31.3 |           █                    █        █                            █         
 30.5 |     █  █  █      █         █   █        █                   █        █         
 29.8 |     █  █  █      █      █  █   █        ███            █    █        █       █ 
 29.1 |█ █  █ ███ █      ██  ██ █  █ █ █   ██   ███  █      █  ██   █ █  █  ██ █   █ █ 
 28.3 |█ █  █ █████   █████ ███ █  ███ █ █ ██  ████ ██ ██  ██  ██ █ ███ ██  ██ ███ █ █ 
 27.6 |█ █  █ █████████████████ ██ █████ █████ ███████ ██  ███ ██ █ ██████ ███████ █ █ 
 26.8 |███████████████████████████████████████ ███████ ███ ██████ █ ██████ ███████ ███ 
 26.1 |██████████████████████████████████████████████████████████ ████████████████████ 
 25.4 |██████████████████████████████████████████████████████████ ████████████████████ 
 24.6 |███████████████████████████████████████████████████████████████████████████████ 
 23.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   1
  20 ms | ███  9
  21 ms | ██  8
  22 ms | ██  6
  23 ms | █  4
  24 ms | █  2
  28 ms | █  3
  29 ms | █  2
  31 ms |   1
  32 ms | ███████████████████  66
  33 ms | ████████████████████████████████████████  141
  34 ms | ██████████████  49
  35 ms | ███████  23
  36 ms | █████████  31
  37 ms | ██████  22
  38 ms | █████  17
  39 ms | ███  12
  40 ms | █████  18
  41 ms | ███████  23
  42 ms | ███  12
  43 ms | ███████  25
  44 ms | █████  19
  45 ms | █████████  30
  46 ms | ███  12
  47 ms | ██  8
  48 ms | █  2
  49 ms | █  2
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `17.62`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `65.00`
- `fps_harmonic_avg` = `27.52`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `20.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `32.09`, min `15.68`, p50 `28.31`, p95 `54.80`, p99 `64.01`, 1%low `15.94`, 0.1%low `15.68`, std `13.24`

**Frame time (ms)**  avg `36.07`, p50 `35.32`, p95 `58.05`, p99 `61.47`, p99.9 `63.57`, max `63.77`

**Client tick (ms)**  avg `3.50`, p95 `5.21`, max `12.12`

**Memory**  start `820 MB`, end `870 MB`, peak `1566 MB`, GC `20 events / 80 ms`

**FPS over sampling window (ASCII):**

```
 43.0 |                     █                                                          
 41.5 |                     █                                                          
 39.9 |                     █                                                          
 38.4 |    █                █                                            █             
 36.9 |█   █     █ █        █                                            █             
 35.3 |██  █  █  █ █ █   █  ██   █ █                    █      █         █ █           
 33.8 |██  █  █  █ █ █   █  ██   █ ██    █ █     █      █   █  █     █   █ █       █   
 32.3 |███ █  ████ █ █   ██ ███ ██ ██ █  █ █ █ ████     █  ██  █    ███ ██ ██ █  ███ █ 
 30.7 |███ █ ███████ █ ████████████████  ███ █ ████████ ██████ █ ██ ███ █████ █  ███ █ 
 29.2 |███ █ ███████ ███████████████████████ ████████████████████████████████ █  ███ ██
 27.7 |█████ ███████████████████████████████████████████████████████████████████████ ██
 26.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | █  1
   9 ms | █  1
  14 ms | █  1
  15 ms | ██████  6
  16 ms | ████  4
  17 ms | ████████████  12
  18 ms | ████████████████████  20
  19 ms | ████████████████  16
  20 ms | █████████████  13
  21 ms | ████████████████████████████████████████  40
  22 ms | ██████████████████████  22
  23 ms | ███████████  11
  24 ms | ██████  6
  25 ms | ███████  7
  26 ms | █████  5
  27 ms | █████  5
  28 ms | █████  5
  29 ms | ██████████████  14
  30 ms | ████████████████████████  24
  31 ms | █████████  9
  32 ms | ████████  8
  33 ms | █████████████████████████████████  33
  34 ms | █████████  9
  35 ms | ████████████████  16
  36 ms | █████████████████████████████████  33
  37 ms | ██████████████████████  22
  38 ms | █████████████  13
  39 ms | ██████  6
  40 ms | ██████  6
  41 ms | ███████  7
  42 ms | ████████  8
  43 ms | ████████  8
  44 ms | ██████  6
  45 ms | ██████  6
  46 ms | ████████  8
  47 ms | ████████████  12
  48 ms | █████████████████  17
  49 ms | ███████████  11
  50 ms | █████  5
  51 ms | ████████  8
  52 ms | ██████████  10
  53 ms | ██████████  10
  54 ms | ████████  8
  55 ms | ███████████  11
  56 ms | █████████████  13
  57 ms | ██████████  10
  58 ms | ████████  8
  59 ms | ███████  7
  60 ms | █████  5
  61 ms | ███  3
  62 ms | ███  3
  63 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.14`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `15.68`
- `preset_long` = `0.00`
- `preload_duration_ms` = `92.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.72`
- `fps_1pct_low` = `15.94`
- `block_state_changes` = `0.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `30.55`, min `14.55`, p50 `28.49`, p95 `51.02`, p99 `58.06`, 1%low `15.87`, 0.1%low `14.55`, std `10.22`

**Frame time (ms)**  avg `36.02`, p50 `35.10`, p95 `55.39`, p99 `59.92`, p99.9 `67.36`, max `68.72`

**Client tick (ms)**  avg `2.77`, p95 `4.44`, max `12.45`

**Memory**  start `737 MB`, end `887 MB`, peak `1614 MB`, GC `18 events / 66 ms`

**FPS over sampling window (ASCII):**

```
 37.7 | █                                                                              
 36.6 | █        █                                                                     
 35.5 | █  █     █    █                                                                
 34.4 | ██ █ █   ██   █                        █                            █          
 33.2 | ██ █ █   ██ █ █               █        █   █ █   █       █          █ █        
 32.1 | ██ █ █   ████ █      ██ █     █        ██ ██ ██  █      ██   █  █ █ █ ██ █     
 31.0 |███ █ █ █ ████ ██████ ████ █   ██ █    ███ █████  █  █   ███  █  █████ ██ █  █  
 29.9 |███ █ ████████ ██████████████  ██ █    █████████ ██ ███  ███  █  █████ ██ █ ███ 
 28.8 |██████████████ ███████████████ ██ █   █████████████ ███ ████  █ █████████ █ ███ 
 27.6 |█████████████████████████████████ ██ ████████████████████████ █████████████ ███ 
 26.5 |█████████████████████████████████████████████████████████████ ██████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms | █  1
  14 ms | ██  2
  16 ms | █  1
  17 ms | ████████  10
  18 ms | ███████  9
  19 ms | ██████  8
  20 ms | ██████████████████  22
  21 ms | ████████████████████  25
  22 ms | ██████  8
  23 ms | ████████████  15
  24 ms | ███  4
  25 ms | ████  5
  26 ms | ██  3
  27 ms | ████  5
  28 ms | ██  2
  29 ms | ██████  7
  30 ms | ██████████████████  22
  31 ms | ████████████████████████  30
  32 ms | ███████████████  19
  33 ms | ████████████████████████████████████████  50
  34 ms | █████████████████████  26
  35 ms | ██████████████████████████  33
  36 ms | ██████████████████████  27
  37 ms | ██████████████  18
  38 ms | ██████████  12
  39 ms | ██████████  12
  40 ms | ████████████  15
  41 ms | ██████████  13
  42 ms | ██████████  13
  43 ms | ████████  10
  44 ms | ██████████  12
  45 ms | █████████  11
  46 ms | ██████████████  18
  47 ms | ███████  9
  48 ms | ██████████  12
  49 ms | ██████  8
  50 ms | ███  4
  51 ms | █████████  11
  52 ms | ██  2
  53 ms | ███  4
  54 ms | █████  6
  55 ms | ██████  8
  56 ms | ████  5
  57 ms | ████  5
  58 ms | ██  3
  59 ms | ███  4
  60 ms | ██  3
  61 ms | █  1
  66 ms | █  1
  68 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.50`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `14.55`
- `preset_long` = `0.00`
- `preload_duration_ms` = `37.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.76`
- `fps_1pct_low` = `15.87`
- `block_state_changes` = `0.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `35.36`, min `12.32`, p50 `26.99`, p95 `76.51`, p99 `161.38`, 1%low `13.25`, 0.1%low `12.32`, std `26.06`

**Frame time (ms)**  avg `36.84`, p50 `37.05`, p95 `61.53`, p99 `72.01`, p99.9 `79.17`, max `81.16`

**Client tick (ms)**  avg `14.15`, p95 `20.02`, max `26.83`

**Memory**  start `1202 MB`, end `1311 MB`, peak `1632 MB`, GC `28 events / 118 ms`

**FPS over sampling window (ASCII):**

```
 65.1 |                      █                                                         
 61.5 |                      █                                            █            
 57.9 |                      █                                            █            
 54.2 |                      █                  █      █                  █   █        
 50.6 |        █    █        █    █             █      █    █             █   █        
 47.0 |        █    █        █    █             █      █    █      █      █   █        
 43.4 |        █    █   █    █    █             █      █    ██    ██   █  █ █ █        
 39.8 |        █    █   █    █    █     █  █    █      █    ███   ██   █  █ █ █        
 36.2 |██   █  ██  ██ ███    █  █ ███   ██ █    █     █████ ███ █ ██   █  █ ████       
 32.6 |██ █ ██████████████   █  █ ████ ███ █ █  ███  ██████ █████ ██   █  █ ████ █ █   
 28.9 |█████████████████████ ██ █ █████████████ ███████████ ███████████████ ███████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | ███████████  6
   6 ms | █████  3
   7 ms | ███████  4
   8 ms | ███████  4
   9 ms | █████  3
  10 ms | ████  2
  11 ms | █████  3
  12 ms | ████  2
  13 ms | █████████████  7
  14 ms | █████████████  7
  15 ms | ██  1
  16 ms | ███████████████████████████  15
  17 ms | ██████████████████  10
  18 ms | █████████████  7
  19 ms | ██████████████████  10
  20 ms | ██████████████████████  12
  21 ms | █████████████  7
  22 ms | ███████████████  8
  23 ms | ████████████████  9
  24 ms | ████████████████  9
  25 ms | ████████████████████  11
  26 ms | ████████████████  9
  27 ms | █████████  5
  28 ms | ███████████  6
  29 ms | █████████████████████████████████  18
  30 ms | █████████████████████████  14
  31 ms | ████████████████████  11
  32 ms | █████████████████████████  14
  33 ms | ████████████████████████  13
  34 ms | ████████████████████  11
  35 ms | ████████████████████████████████████████  22
  36 ms | █████████████  7
  37 ms | █████████████████████████  14
  38 ms | ███████████████████████████████  17
  39 ms | ███████████████████████████  15
  40 ms | █████████████████████████  14
  41 ms | ███████████████  8
  42 ms | ██████████████████████  12
  43 ms | ███████████████████████████████████  19
  44 ms | ██████████████████  10
  45 ms | ███████████████████████████  15
  46 ms | ████████████████████  11
  47 ms | ███████████████████████████████  17
  48 ms | █████████████  7
  49 ms | ████████████████  9
  50 ms | █████  3
  51 ms | █████████████████████████  14
  52 ms | █████████████  7
  53 ms | █████████████  7
  54 ms | ████████████████████  11
  55 ms | █████████  5
  56 ms | ███████████  6
  57 ms | ███████  4
  58 ms | █████████████  7
  59 ms | ███████████  6
  60 ms | █████████  5
  61 ms | █████  3
  62 ms | ██  1
  63 ms | ████  2
  64 ms | ██  1
  65 ms | ███████  4
  66 ms | ████  2
  67 ms | ████  2
  68 ms | ████  2
  69 ms | ███████  4
  70 ms | ██  1
  71 ms | ██  1
  72 ms | █████  3
  73 ms | ██  1
  77 ms | ██  1
  81 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.25`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `59.00`
- `falling_blocks_landed` = `25009.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.14`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.32`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4810.90`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `36.88`, min `12.14`, p50 `28.65`, p95 `94.33`, p99 `136.00`, 1%low `13.27`, 0.1%low `12.14`, std `28.99`

**Frame time (ms)**  avg `36.24`, p50 `34.91`, p95 `61.40`, p99 `72.31`, p99.9 `78.46`, max `82.36`

**Client tick (ms)**  avg `14.76`, p95 `20.80`, max `26.38`

**Memory**  start `881 MB`, end `1485 MB`, peak `1630 MB`, GC `26 events / 106 ms`

**FPS over sampling window (ASCII):**

```
 72.7 |                                                           █                    
 68.3 |                                                           █                    
 64.0 |                                                           █                    
 59.7 |█                    █                              █      █                    
 55.4 |█   █             █  █               █              █      █                    
 51.0 |█   █             █  █      █        █      █       █    █ █           █        
 46.7 |█   █  █      █   █  █  █   █        █      █       █    █ █           █        
 42.4 |█   █  █ █    █   █  █  █   █     █  █  █ ███ █     ██  ██ █   █ █   █ █        
 38.1 |█   ██ █ █ █  █   █  ██ █ █ █ █ █ █  █  █ ███ █   █ ██  ██ ██ ██ ██  ███        
 33.8 |█ ████ █ █ █  █ █ ██ ████████ ███████████████ █ ██████ ████████████  ███    █ ██
 29.4 |████████████ ████ ██ ██████████████████████████ ██████ ████████████████████ ████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ██  1
   4 ms | ████  2
   7 ms | ██████████████████  10
   8 ms | ███████████  6
   9 ms | █████████  5
  10 ms | ███████████  6
  11 ms | ███████████  6
  12 ms | █████████  5
  13 ms | ████  2
  14 ms | ████████████████████  11
  15 ms | █████████  5
  16 ms | ███████████████  8
  17 ms | ███████████  6
  18 ms | ██████████████████  10
  19 ms | ██████████████████  10
  20 ms | ███████████████  8
  21 ms | █████████  5
  22 ms | ███████████████  8
  23 ms | ████████████████████  11
  24 ms | ████████████████  9
  25 ms | ████████████████████  11
  26 ms | █████████████████████████  14
  27 ms | █████████████████████████████████  18
  28 ms | ████████████████████  11
  29 ms | ████████████████  9
  30 ms | ████████████████████  11
  31 ms | █████████████████████████████  16
  32 ms | ███████████████████████████████████  19
  33 ms | ██████████████████████  12
  34 ms | ████████████████████████████████████████  22
  35 ms | ██████████████████████  12
  36 ms | ███████████████████████████  15
  37 ms | ████████████████████  11
  38 ms | ███████████████████████████████  17
  39 ms | ███████████████  8
  40 ms | █████████████████████████  14
  41 ms | █████████  5
  42 ms | ████████████████████  11
  43 ms | █████████  5
  44 ms | ███████████████  8
  45 ms | █████████████  7
  46 ms | ████████████████  9
  47 ms | ██████████████████  10
  48 ms | ████████████████  9
  49 ms | ███████████████████████████  15
  50 ms | ███████████████  8
  51 ms | ██████████████████  10
  52 ms | ████████████████  9
  53 ms | █████████████  7
  54 ms | ███████████████  8
  55 ms | █████████████████████████████  16
  56 ms | ███████████████  8
  57 ms | ███████  4
  58 ms | █████████████  7
  59 ms | ███████████  6
  60 ms | ███████  4
  61 ms | █████████████  7
  62 ms | ███████  4
  63 ms | ███████████  6
  64 ms | ██  1
  66 ms | ██  1
  67 ms | █████  3
  68 ms | ██  1
  70 ms | ████  2
  71 ms | ██  1
  72 ms | ██  1
  73 ms | ██  1
  74 ms | ████  2
  75 ms | ██  1
  82 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.27`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `74.00`
- `falling_blocks_landed` = `25988.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.59`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.14`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4810.13`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `29.12`, min `15.39`, p50 `28.19`, p95 `47.20`, p99 `54.51`, 1%low `17.12`, 0.1%low `15.39`, std `7.71`

**Frame time (ms)**  avg `36.24`, p50 `35.48`, p95 `47.43`, p99 `51.98`, p99.9 `62.88`, max `64.97`

**Client tick (ms)**  avg `1.88`, p95 `2.58`, max `11.78`

**Memory**  start `1414 MB`, end `878 MB`, peak `1655 MB`, GC `21 events / 87 ms`

**FPS over sampling window (ASCII):**

```
 35.9 |                                               █                                
 35.0 |                                               █                                
 34.0 |                                               █                    █           
 33.1 |                  █                     █      █        █           █           
 32.1 |       █         ██           █      █  █      █        █           █           
 31.2 | █     █ █ █     ██   █ █ █ █ █      █  █   █  █  █     █           █  █    █   
 30.2 | █  █  █ █ █  ██ ██ █ █ █ █ █ █    █ █  █ █ █  █ ██ █   █  █   █    █  █  █ █ █ 
 29.3 | █  █  █ ███  ██ ██ █████ █ ████  ████  █ █ ██ ████ █   ██ █   █    █  █  █ ████
 28.4 | █  █████████ ██ ██ █████ █ ████  ████ ██ █ ██ ██████ █ ██ ██  █   ██  ██ █ ████
 27.4 | █  ████████████ ██ █████ █ ███████████████ ███████████ ██ ██ ███████  ██ ██████
 26.5 |███████████████████ █████ ████████████████████████████████ █████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms | █  1
  16 ms | █  1
  17 ms | █  2
  18 ms | ███  6
  19 ms | ████  7
  20 ms | █████  9
  21 ms | ███████  13
  22 ms | █████  8
  23 ms | █████  8
  24 ms | ███  5
  25 ms | ██  3
  27 ms | █  1
  28 ms | █  1
  29 ms | █  2
  30 ms | ███████  12
  31 ms | ███████████████████████  40
  32 ms | ████████████  21
  33 ms | ████████████████████████████████████████  70
  34 ms | ██████████████████████  39
  35 ms | ████████████████████████████  49
  36 ms | ███████████████  26
  37 ms | ██████████████  25
  38 ms | ███████████  19
  39 ms | █████████████  22
  40 ms | ████████  14
  41 ms | ████████  14
  42 ms | ██████████  18
  43 ms | ███████████  20
  44 ms | ███████████  20
  45 ms | █████████  16
  46 ms | ███████████  20
  47 ms | ██████████  18
  48 ms | ██████  10
  49 ms | █  2
  50 ms | ██  3
  51 ms | █  1
  52 ms | █  1
  54 ms | █  1
  57 ms | █  1
  59 ms | █  1
  61 ms | █  1
  64 ms | █  1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `17.12`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `46.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.59`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `15.39`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.48`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `29.77`, min `16.49`, p50 `28.46`, p95 `48.72`, p99 `56.51`, 1%low `16.86`, 0.1%low `16.49`, std `10.38`

**Frame time (ms)**  avg `36.19`, p50 `35.13`, p95 `51.69`, p99 `56.69`, p99.9 `60.37`, max `60.65`

**Client tick (ms)**  avg `1.88`, p95 `2.63`, max `8.52`

**Memory**  start `928 MB`, end `962 MB`, peak `1654 MB`, GC `20 events / 81 ms`

**FPS over sampling window (ASCII):**

```
 51.1 |                    █                                                           
 48.8 |                    █                                                           
 46.5 |                    █                                                           
 44.1 |                    █                                                           
 41.8 |                    █                                                           
 39.5 |                    █                                                           
 37.2 |                    █     █                                                     
 34.8 |             █      █     █  █                                                  
 32.5 |         █   ████████ ██ ██  █ █  █  █                    ██       █   █        
 30.2 |   █   █ ███ ███████████ ██  ███  ████ ██  █ █  █ █ █████ ██     ███   ███  ████
 27.9 |██ ███████████████████████████████████ ████████████ █████ ████ ██████ ██████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
  13 ms | █  1
  16 ms | █  2
  17 ms | ███  5
  18 ms | ███  5
  19 ms | ██████  9
  20 ms | ███████  12
  21 ms | █████████  15
  22 ms | ████████  13
  23 ms | ████  7
  24 ms | ███  5
  25 ms | █  1
  26 ms | █  2
  28 ms | █  1
  30 ms | ███████  12
  31 ms | ██████████████████████████████  49
  32 ms | █████████████████  28
  33 ms | ████████████████████████████████████████  65
  34 ms | ███████████████████████  37
  35 ms | ████████████████████████████  45
  36 ms | █████████████  21
  37 ms | ██████████  17
  38 ms | ████████  13
  39 ms | ██████████  17
  40 ms | ██████  10
  41 ms | ████████████  19
  42 ms | ██████████  17
  43 ms | ████████  13
  44 ms | ██████████  16
  45 ms | ██████████  16
  46 ms | ██████████  17
  47 ms | ██████████  17
  48 ms | ████  6
  49 ms | ███  5
  50 ms | ██  3
  51 ms | ████  6
  52 ms | ██  3
  53 ms | █  2
  54 ms | ████  7
  55 ms | ██  4
  56 ms | ██  4
  59 ms | ██  3
  60 ms | █  2
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `16.86`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `36.00`
- `falling_blocks_landed` = `3920.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.63`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `16.49`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `618.33`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `28.40`, min `17.27`, p50 `29.12`, p95 `35.56`, p99 `48.55`, 1%low `19.29`, 0.1%low `17.27`, std `6.24`

**Frame time (ms)**  avg `36.38`, p50 `34.34`, p95 `46.21`, p99 `48.60`, p99.9 `55.54`, max `57.90`

**Client tick (ms)**  avg `0.67`, p95 `0.88`, max `1.08`

**Memory**  start `863 MB`, end `1523 MB`, peak `1642 MB`, GC `14 events / 60 ms`

**FPS over sampling window (ASCII):**

```
 41.0 |               █                                                                
 39.6 |               █                                                                
 38.2 |               █                                                                
 36.7 |               █                                                                
 35.3 |               █                                                                
 33.9 |               █                                                                
 32.5 |               █                                                                
 31.0 |               █   █                                █         ██  █      █  ██  
 29.6 | █             █   █ █ █  ███      ██  █  ███     █ █       █ ██  █ ██ █ █  ███ 
 28.2 | █    ██  █ ██ ██  █████ ████ ██ ████ ██ ██████ ███ ██ ██ ██████  █ ██████  ███ 
 26.8 |██████████████ ███ ████████████████████████████████████████████████████████ ████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms |   1
  17 ms |   1
  19 ms |   1
  20 ms | ██  6
  21 ms | ████  12
  22 ms | █  4
  23 ms | █  2
  27 ms |   1
  28 ms |   1
  29 ms | █  2
  30 ms | █  2
  31 ms | █  4
  32 ms | ███████████████████  66
  33 ms | ████████████████████████████████████████  137
  34 ms | ████████████████  55
  35 ms | █████████  32
  36 ms | ██████  21
  37 ms | ██████  20
  38 ms | ████  13
  39 ms | ██████  19
  40 ms | ██████  22
  41 ms | ██████  21
  42 ms | █████  16
  43 ms | █████  17
  44 ms | ██████  22
  45 ms | █████  18
  46 ms | █████  16
  47 ms | ███  9
  48 ms | █  4
  49 ms |   1
  50 ms |   1
  51 ms |   1
  53 ms |   1
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `27.49`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `17.27`
- `seed` = `5099.00`
- `preload_duration_ms` = `44.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `19.29`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `24.44`, min `8.76`, p50 `26.13`, p95 `43.05`, p99 `49.71`, 1%low `8.81`, 0.1%low `n/a`, std `9.36`

**Frame time (ms)**  avg `50.58`, p50 `38.27`, p95 `104.63`, p99 `111.86`, p99.9 `114.11`, max `114.18`

**Client tick (ms)**  avg `0.32`, p95 `0.40`, max `2.11`

**Memory**  start `1103 MB`, end `1531 MB`, peak `1631 MB`, GC `10 events / 50 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |    █                          █                                                
 31.7 |    ██     █                   ██          █            █      ██ █ █   █       
 29.5 |  █ ██     ██  ████ █ █ █   ██ ███ █  ██  ██  █         ██     ████ ██ ██   █   
 27.3 | ███████████████████████████████████████ ███ ███ ██████ ███  ████████████   █   
 25.1 |████████████████████████████████████████████ ████████████████████████████ ███   
 22.9 |█████████████████████████████████████████████████████████████████████████████   
 20.7 |██████████████████████████████████████████████████████████████████████████████  
 18.5 |██████████████████████████████████████████████████████████████████████████████  
 16.3 |██████████████████████████████████████████████████████████████████████████████  
 14.1 |██████████████████████████████████████████████████████████████████████████████  
 11.9 |██████████████████████████████████████████████████████████████████████████████  
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  3
  20 ms | ██  4
  21 ms | ███  8
  22 ms | ██  4
  23 ms |   1
  25 ms |   1
  26 ms |   1
  32 ms | ███████  18
  33 ms | ████████████████████████████████████████  106
  34 ms | ██████  17
  35 ms | █████  13
  36 ms | █████  12
  37 ms | ██  5
  38 ms | ███  9
  39 ms | ████  10
  40 ms | █████  14
  41 ms | █████  12
  42 ms | ███  9
  43 ms | █████  14
  44 ms | █████  12
  45 ms | ███  9
  46 ms | ██████  16
  47 ms | ███  8
  48 ms |   1
  49 ms | █  2
  86 ms |   1
  98 ms | ██  4
  99 ms | ██████  15
 100 ms | █████████████  35
 101 ms | ██  6
 103 ms | █  2
 104 ms |   1
 105 ms | █  2
 107 ms | █  3
 108 ms |   1
 109 ms |   1
 110 ms | █  3
 111 ms | ███  7
 113 ms |   1
 114 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `8.81`
- `fps_harmonic_avg` = `19.77`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `n/a`
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
- `preset_quick` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.64`, p50 `9.95`, p95 `10.38`, p99 `11.24`, 1%low `8.68`, 0.1%low `n/a`, std `0.48`

**Frame time (ms)**  avg `101.78`, p50 `100.55`, p95 `112.64`, p99 `114.18`, p99.9 `115.53`, max `115.75`

**Client tick (ms)**  avg `0.29`, p95 `0.60`, max `1.71`

**Memory**  start `1255 MB`, end `1630 MB`, peak `1684 MB`, GC `6 events / 29 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                                 █              
 10.6 |                                                      █          █              
 10.4 |                                                      █          █        █     
 10.2 |            █                                         █          █        █     
 10.1 |██ █ ██  █ ██ ██    █    ████ █    █ ██ █ ██      █ █ █       ██ █    █   █ █ █ 
  9.9 |██ █ █████ ██ ██ ████ █ █████ █  ███ ██ ███████ █████ █  ███  ██ ██  ██ █ ██████
  9.7 |████ █████ ██ ██ ██████ █████ ██ ██████ ███████ █████ ██ ███ ███ ██  ██ █ ██████
  9.6 |████ ████████ ██ ████████████ ██ ██████ ███████ █████ ██ ███████ ██ ███ █ ██████
  9.4 |█████████████ █████████████████████████ ███████ █████████████████████████ ██████
  9.2 |███████████████████████████████████████████████ █████████████████████████ ██████
  9.1 |█████████████████████████████████████████████████████████████████████████ ██████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  87 ms | █  1
  89 ms | ██  2
  91 ms | ███  3
  93 ms | █  1
  94 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | ███  3
  98 ms | █████████████████  19
  99 ms | ████████████████████████████████  35
 100 ms | ████████████████████████████████████████  44
 101 ms | ███████████████████████████████  34
 102 ms | ████████  9
 103 ms | █████  6
 104 ms | █  1
 105 ms | █  1
 106 ms | ████  4
 108 ms | ██  2
 109 ms | ███  3
 110 ms | ███  3
 111 ms | ████  4
 112 ms | █████████  10
 113 ms | ██  2
 114 ms | ████  4
 115 ms | █  1
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
- `fps_0p1pct_low` = `n/a`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `9.83`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.68`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `7.94`, p50 `9.91`, p95 `10.61`, p99 `11.16`, 1%low `8.27`, 0.1%low `n/a`, std `0.51`

**Frame time (ms)**  avg `102.12`, p50 `100.95`, p95 `112.72`, p99 `115.25`, p99.9 `124.00`, max `125.99`

**Client tick (ms)**  avg `0.32`, p95 `0.63`, max `1.84`

**Memory**  start `1194 MB`, end `1080 MB`, peak `1656 MB`, GC `4 events / 23 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                                                    █           
 10.3 |                                                                    █           
 10.2 |                 █            █                                     █      █    
 10.1 | █   █ █      █  █ █ ██ █   █ █   █         █   █   █ █     █ █     █      █ █ █
  9.9 |██  ██ █ █  ████ █ █ ██ █  ██ █████ ██    █ ██  █   █ █ █  ████ █   █      █ ███
  9.8 |██  ████ █  ████ █ ████ █  ███████████ █  ████ ██  ██ █ █ █████ █   ███    █████
  9.7 |██  ████ █  ████ █ ████ █  █████████████  ████ ██  ██ █ █ █████ ██  ███    █████
  9.6 |██ ███████  ████ █ ████ █ ███████████████ ████ ██  ████ ███████ ███ ██████ █████
  9.5 |██████████ ███████ ████ █ ███████████████ ███████ █████████████████ ██████ █████
  9.4 |██████████████████ ██████ ███████████████ ████████████████████████████████ █████
  9.3 |██████████████████ █████████████████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  88 ms | █  1
  89 ms | █  1
  90 ms | █  1
  91 ms | ██  2
  92 ms | █  1
  93 ms | ████  3
  94 ms | █  1
  95 ms | ██  2
  96 ms | █  1
  97 ms | ██████  5
  98 ms | ██████████████████  15
  99 ms | ███████████████████████████████████████  33
 100 ms | ████████████████████████████████████████  34
 101 ms | ████████████████████████████████████████  34
 102 ms | ███████████████  13
 103 ms | ████  3
 104 ms | █████  4
 105 ms | ██  2
 106 ms | █████  4
 107 ms | █████  4
 108 ms | ████  3
 109 ms | █  1
 110 ms | █████  4
 111 ms | ████████████  10
 112 ms | █████  4
 113 ms | ████  3
 114 ms | ██  2
 115 ms | ████  3
 125 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.79`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `4027.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `8.27`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.38`, p50 `9.97`, p95 `10.33`, p99 `11.23`, 1%low `8.56`, 0.1%low `n/a`, std `0.48`

**Frame time (ms)**  avg `102.22`, p50 `100.25`, p95 `112.18`, p99 `114.07`, p99.9 `118.33`, max `119.29`

**Client tick (ms)**  avg `0.30`, p95 `0.44`, max `1.80`

**Memory**  start `1464 MB`, end `1286 MB`, peak `1669 MB`, GC `6 events / 25 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                                    █           
 10.4 |        █                                                           █           
 10.3 |        █                       █                                   █           
 10.1 |       ██          █            █                            █      █           
 10.0 |   ██  █████  ███  █████  ████  █████  ███  ███ ██  █ ██  ██ ███ █  ████  █ ██ █
  9.8 |   ██  █████ ████  █████  ████  █████  ███ ████ ██  ████  ██ ███ █  ████ ██ ██ █
  9.7 |  ███  █████ ████  █████  ████  █████  ███ ████ ██ ██████ ██ ███ █  ████ ██ ██ █
  9.5 |█ ████ ██████████ ███████ █████ █████ ████ █████████████████ █████ ████████ ████
  9.4 |█ █████████████████████████████ █████ ████ █████████████████ ██████████████ ████
  9.2 |███████████████████████████████ █████ ██████████████████████ ██████████████ ████
  9.1 |█████████████████████████████████████ ██████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  89 ms | █  2
  92 ms | ██  4
  93 ms | █  1
  94 ms | █  1
  96 ms | █  2
  97 ms | █  2
  98 ms | ███  5
  99 ms | ███████████████████████  39
 100 ms | ████████████████████████████████████████  68
 101 ms | ███████████  18
 102 ms | ██  3
 103 ms | █  1
 104 ms | █  2
 105 ms | ██  4
 106 ms | █  1
 107 ms | ██  3
 108 ms | ████  7
 109 ms | ███  5
 110 ms | ████  7
 111 ms | ████  7
 112 ms | ██  4
 113 ms | ███  5
 114 ms | █  2
 119 ms | █  1
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
- `fps_harmonic_avg` = `9.78`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `8.56`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `2.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `1768.74`, min `24.63`, p50 `1881.59`, p95 `2670.78`, p99 `2788.40`, 1%low `49.28`, 0.1%low `36.62`, std `692.74`

**Frame time (ms)**  avg `1.31`, p50 `0.53`, p95 `3.82`, p99 `17.54`, p99.9 `23.02`, max `40.60`

**Client tick (ms)**  avg `0.41`, p95 `0.73`, max `4.51`

**Memory**  start `1245 MB`, end `1829 MB`, peak `2322 MB`, GC `55 events / 289 ms`

**FPS over sampling window (ASCII):**

```
2252.4 | █ █       █    █                                                               
2135.6 | █ █       █    █       █    █  █       █                                       
2018.8 | ███      ██   ███ █ █ ██  █ █  ███   ███             █        █                
1902.0 |█████  █  ██ █ ███ █ ███████ ██ ███  ████   █  ███  █ █ █      █   ██ ██    █   
1785.3 |█████  █  ██ ███████ ███████ ██ ███  ████   ██████  █ █ █  █ ████  ██ ██    █   
1668.5 |██████ ██ ██████████ ██████████ ████ █████  ██████  ████████ ████  ██ ██   ███  
1551.7 |██████ ███████████████████████████████████  ██████  ████████ ████  ██ ███  ███  
1434.9 |██████ ████████████████████████████████████ ██████  ████████ ████ ███████ ████  
1318.1 |██████ ████████████████████████████████████ ██████  █████████████ ████████████  
1201.4 |██████ ████████████████████████████████████████████ █████████████ ██████████████
1084.6 |█████████████████████████████████████████████████████████████████ ██████████████
967.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13309
   1 ms | ███  936
   2 ms | █  168
   3 ms |   125
   4 ms |   80
   5 ms |   29
   6 ms |   18
   7 ms |   11
   8 ms |   2
   9 ms |   5
  10 ms |   2
  11 ms |   1
  12 ms |   21
  13 ms |   62
  14 ms |   76
  15 ms |   145
  16 ms |   107
  17 ms |   49
  18 ms |   39
  19 ms |   28
  20 ms |   31
  21 ms |   9
  22 ms |   9
  23 ms |   4
  24 ms |   5
  25 ms |   2
  27 ms |   2
  28 ms |   1
  29 ms |   1
  36 ms |   1
  40 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `fps_harmonic_avg` = `764.33`
- `part` = `1.00`
- `fps_0p1pct_low` = `36.62`
- `seed` = `7411.00`
- `preload_duration_ms` = `48.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `49.28`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24074 ms  |  Sample ticks: 400

**FPS**  avg `1592.46`, min `14.54`, p50 `1653.15`, p95 `2516.53`, p99 `2706.10`, 1%low `23.83`, 0.1%low `18.42`, std `654.10`

**Frame time (ms)**  avg `2.07`, p50 `0.60`, p95 `14.97`, p99 `34.57`, p99.9 `49.39`, max `68.78`

**Client tick (ms)**  avg `0.41`, p95 `0.63`, max `1.49`

**Memory**  start `2297 MB`, end `2271 MB`, peak `2772 MB`, GC `34 events / 280 ms`

**FPS over sampling window (ASCII):**

```
2082.2 |█  █   █  █ █                                                                   
1895.5 |██ ██  ████ █       ██ ██    █  █ █              █                              
1708.9 |██████ ██████ ████ ██████    ████ ██ █      ███  █ █ █  █ █            █        
1522.2 |██████████████████ ███████ ██████████████ ████████████  ████   ██    ████    █  
1335.6 |███████████████████████████████████████████████████████ ██████████████████████  
1148.9 |██████████████████████████████████████████████████████████████████████████████  
962.3 |███████████████████████████████████████████████████████████████████████████████ 
775.7 |███████████████████████████████████████████████████████████████████████████████ 
589.0 |███████████████████████████████████████████████████████████████████████████████ 
402.4 |███████████████████████████████████████████████████████████████████████████████ 
215.7 |███████████████████████████████████████████████████████████████████████████████ 
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8189
   1 ms | ███  637
   2 ms | █  113
   3 ms |   71
   4 ms |   56
   5 ms |   23
   6 ms |   8
   7 ms |   5
   8 ms |   3
   9 ms |   1
  12 ms |   8
  13 ms |   30
  14 ms |   62
  15 ms | █  103
  16 ms |   71
  17 ms |   38
  18 ms |   23
  19 ms |   28
  20 ms |   17
  21 ms |   12
  22 ms |   8
  23 ms |   3
  24 ms |   2
  25 ms |   2
  26 ms |   2
  27 ms |   1
  28 ms |   1
  29 ms |   3
  30 ms |   3
  31 ms |   11
  32 ms |   11
  33 ms |   35
  34 ms |   19
  35 ms |   11
  36 ms |   5
  37 ms |   12
  38 ms |   1
  39 ms |   5
  40 ms |   7
  41 ms |   5
  42 ms |   4
  43 ms |   4
  44 ms |   6
  45 ms |   3
  46 ms |   5
  47 ms |   5
  48 ms |   3
  49 ms |   4
  50 ms |   3
  51 ms |   1
  52 ms |   1
  59 ms |   1
  60 ms |   1
  68 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `fps_harmonic_avg` = `484.18`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.42`
- `seed` = `7417.00`
- `preload_duration_ms` = `999.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `23.83`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `56.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `28.79`, min `16.38`, p50 `28.61`, p95 `46.22`, p99 `54.71`, 1%low `17.06`, 0.1%low `16.38`, std `9.30`

**Frame time (ms)**  avg `36.75`, p50 `34.95`, p95 `48.30`, p99 `54.67`, p99.9 `60.82`, max `61.07`

**Client tick (ms)**  avg `0.37`, p95 `0.59`, max `2.63`

**Memory**  start `2904 MB`, end `2567 MB`, peak `3016 MB`, GC `30 events / 245 ms`

**FPS over sampling window (ASCII):**

```
 48.2 |                                    █                                           
 46.1 |                                    █                                           
 44.0 |                                    █                                           
 41.9 |                                    █                                           
 39.9 |                                    █                                           
 37.8 |                                    █                                           
 35.7 |       █                            █                █                      █   
 33.6 |       █              █             █                █             █        █   
 31.5 |       █         ██   █         █   █         █  █   █     █ █   █ █ █ █   ██   
 29.4 |     █ █ █    █  ██   █   █    ██ █ █ ██  ███ █  █  ██   ███ █  ██ █ █ █   ███ █
 27.4 |█████████████████████ █████████████████████████████████████████ ██ ███ ███ █████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   1
  13 ms | █  2
  15 ms |   1
  16 ms |   1
  18 ms | ██  5
  19 ms | ███  7
  20 ms | ███  6
  21 ms | ████  8
  22 ms | ██  4
  23 ms | ██  4
  24 ms | █  2
  25 ms | █  2
  26 ms | █  2
  27 ms |   1
  28 ms |   1
  30 ms | ██  4
  31 ms | ██████████  22
  32 ms | ████████████████████████  53
  33 ms | ████████████████████████████████████████  87
  34 ms | ████████████████████████████  60
  35 ms | ██████████  22
  36 ms | ███████████████  32
  37 ms | █████████  19
  38 ms | ██████  12
  39 ms | ███████  15
  40 ms | ████████  17
  41 ms | █████████  19
  42 ms | █████  11
  43 ms | ████████  17
  44 ms | ███████████  23
  45 ms | █████████  20
  46 ms | █████████  19
  47 ms | ██████  13
  48 ms | ████  8
  49 ms | ███  7
  50 ms | ██  5
  51 ms | ██  4
  52 ms |   1
  53 ms |   1
  54 ms |   1
  55 ms | █  2
  57 ms |   1
  58 ms |   1
  60 ms |   1
  61 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `fps_harmonic_avg` = `27.21`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.38`
- `seed` = `7433.00`
- `preload_duration_ms` = `73.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `17.06`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `29.05`, min `13.09`, p50 `28.85`, p95 `45.90`, p99 `61.39`, 1%low `14.68`, 0.1%low `13.09`, std `8.82`

**Frame time (ms)**  avg `36.58`, p50 `34.66`, p95 `51.25`, p99 `62.38`, p99.9 `73.81`, max `76.38`

**Client tick (ms)**  avg `0.37`, p95 `0.53`, max `3.00`

**Memory**  start `2956 MB`, end `3222 MB`, peak `3277 MB`, GC `25 events / 240 ms`

**FPS over sampling window (ASCII):**

```
 46.1 |               █                                                                
 44.2 |               █                                                                
 42.3 |               █                                                                
 40.4 |               █                                                                
 38.5 |               █                                                                
 36.7 |               █                                                                
 34.8 |               █     █          █                                   █           
 32.9 |               █     █ █        █             █  █                  █        █  
 31.0 |           █   █     ███ █ ██   █ █    █    █ █  █  █     █  █      █    █ █ ██ 
 29.1 |       █ █ █ █ ██ ██ █████ ██  █████ ███  █ ████ █ ██   █ █  █   █  ███ ████████
 27.2 |██████████ █████████████████████████ ███████████ ████████ ██████████████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms |   1
  11 ms |   1
  15 ms | ██  4
  16 ms |   1
  17 ms | █  3
  18 ms |   1
  19 ms | ██  5
  20 ms | ███  7
  21 ms | ████  9
  22 ms | ███  7
  23 ms | ██  4
  24 ms | █  3
  26 ms |   1
  27 ms | ██  4
  29 ms | ██  4
  30 ms | ███  7
  31 ms | ████████  18
  32 ms | █████████████████████████████  63
  33 ms | ████████████████████████████████████████  87
  34 ms | ███████████████████████  51
  35 ms | ████████████████  35
  36 ms | ███████████  24
  37 ms | ██████  13
  38 ms | ████████  17
  39 ms | ███████████  23
  40 ms | █████████████  29
  41 ms | ██████  13
  42 ms | ████████  17
  43 ms | ████  8
  44 ms | ██████  12
  45 ms | ███████  15
  46 ms | ████  8
  47 ms | ████  9
  48 ms | ██  4
  49 ms | ███  7
  50 ms |   1
  51 ms | ███  7
  52 ms | █  2
  53 ms | ███  6
  55 ms |   1
  56 ms | █  2
  57 ms |   1
  59 ms |   1
  60 ms | █  2
  61 ms |   1
  62 ms | █  3
  63 ms |   1
  66 ms |   1
  71 ms |   1
  76 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `fps_harmonic_avg` = `27.33`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.09`
- `seed` = `7451.00`
- `preload_duration_ms` = `71.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.01`
- `fps_1pct_low` = `14.68`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `80.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `28.70`, min `15.28`, p50 `28.83`, p95 `45.93`, p99 `51.56`, 1%low `16.38`, 0.1%low `15.28`, std `6.73`

**Frame time (ms)**  avg `36.45`, p50 `34.69`, p95 `48.52`, p99 `56.17`, p99.9 `63.98`, max `65.43`

**Client tick (ms)**  avg `0.35`, p95 `0.57`, max `1.04`

**Memory**  start `1981 MB`, end `2400 MB`, peak `3533 MB`, GC `22 events / 208 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                 █                 █                                            
 32.3 |                 █                 █                                            
 31.6 |                 ██                ██                     █     █               
 30.8 |              █  ██                ██ █               █   █     █     ██       █
 30.1 |       █   █  ██ ███    █      █   ██ ██ █        ██ ████ █  █  █ █   ██       █
 29.3 |       █   █  ██ ███   ██      █   ██ ██ ███      ██ ████ █  █  ███   ███ █    █
 28.6 | █    ███ ██  ██ ███ █ ███ █   █   █████ ███   █  ██ ████ █  █  ███   ██████  ██
 27.8 |███ █ ███ ██████ ███ █████ ██  █ █ █████ █████ █  ███████ ██ █  ████ ████████ ██
 27.1 |████████████████ ███ ████████  ███ █████████████ ███████████ ██ ████ ███████████
 26.4 |██████████████████████████████ █████████████████ ███████████ ███████ ███████████
 25.6 |████████████████████████████████████████████████████████████ ███████ ███████████
 24.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  3
  18 ms |   1
  19 ms | ████  9
  20 ms | ████  10
  21 ms | ███  8
  22 ms | ███  6
  23 ms | █  3
  24 ms | █  3
  26 ms | ██  4
  27 ms | ██  4
  31 ms | ████  10
  32 ms | ████████████████████████████  67
  33 ms | ████████████████████████████████████████  96
  34 ms | ██████████████████████████████  72
  35 ms | ██████████  24
  36 ms | ██████████  23
  37 ms | ██████████  23
  38 ms | █████  13
  39 ms | ████████  19
  40 ms | ███████  17
  41 ms | ██████  15
  42 ms | ███████  16
  43 ms | █████  12
  44 ms | ████████  19
  45 ms | ███████  16
  46 ms | ██████  15
  47 ms | ███  8
  48 ms | ████  9
  49 ms | ██  4
  50 ms | ███  7
  51 ms | █  2
  52 ms | █  2
  54 ms |   1
  55 ms |   1
  56 ms | █  2
  57 ms |   1
  58 ms |   1
  61 ms |   1
  62 ms |   1
  65 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `fps_harmonic_avg` = `27.44`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.28`
- `seed` = `7457.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-23.00`
- `entity_count_sample_start` = `24.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `16.38`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24302 ms  |  Sample ticks: 400

**FPS**  avg `28.60`, min `13.43`, p50 `28.40`, p95 `45.38`, p99 `53.64`, 1%low `15.71`, 0.1%low `13.43`, std `7.72`

**Frame time (ms)**  avg `36.82`, p50 `35.21`, p95 `49.00`, p99 `55.25`, p99.9 `70.22`, max `74.47`

**Client tick (ms)**  avg `0.37`, p95 `0.50`, max `1.81`

**Memory**  start `1931 MB`, end `2730 MB`, peak `3597 MB`, GC `22 events / 215 ms`

**FPS over sampling window (ASCII):**

```
 39.0 |                                                █                               
 37.7 |                                                █                               
 36.5 |                                                █                               
 35.2 |                                                █                               
 34.0 |              █                                 █                               
 32.7 |              █                        ██       █        █                      
 31.4 |         █    █                        ██     █ █        █                   █  
 30.2 |    █  █ █ █  █   █       █    █ █  █  ██ █   █ █       ███  █ █       █ █   █  
 28.9 |    █  █ █ █  █ █ █   █   ██ ███ █  █  ██ █  ██ █     █ ████ █ ██ █    ███  ██ █
 27.7 |██ ███ █████  █ █ ██████████ ███ ████  ██████████   ███ ████ ███████ █ ███ █████
 26.4 |███████████████ ████████████████ ████████████████ █ ███ ████ ███████████████████
 25.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | █  1
  17 ms | █  2
  18 ms | ███  5
  19 ms | █  2
  20 ms | █████  8
  21 ms | ██████  9
  22 ms | ███████  10
  23 ms | ██  3
  25 ms | ███  4
  26 ms | █  2
  27 ms | █  2
  28 ms | █  2
  29 ms | ███████  10
  30 ms | ██████  9
  31 ms | ████████████  18
  32 ms | █████████████████████████████████████  56
  33 ms | ███████████████████████████████████████  59
  34 ms | ████████████████████████████████████████  60
  35 ms | █████████████████████  31
  36 ms | ███████████████  23
  37 ms | ███████████  17
  38 ms | ███████████████  22
  39 ms | █████████████  20
  40 ms | ███████  11
  41 ms | █████████████████  26
  42 ms | ███████  10
  43 ms | ███████████████  22
  44 ms | ███████████  17
  45 ms | █████████  14
  46 ms | ██████████████  21
  47 ms | ███████  11
  48 ms | ██████  9
  49 ms | █████  7
  50 ms | █████  7
  51 ms | ██  3
  52 ms | █  2
  53 ms | █  1
  54 ms | █  1
  55 ms | █  2
  57 ms | █  1
  58 ms | █  1
  60 ms | █  1
  66 ms | █  1
  74 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `fps_harmonic_avg` = `27.16`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.43`
- `seed` = `7477.00`
- `preload_duration_ms` = `1241.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `15.71`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `28.57`, min `13.27`, p50 `28.62`, p95 `45.33`, p99 `55.52`, 1%low `15.23`, 0.1%low `13.27`, std `7.25`

**Frame time (ms)**  avg `36.80`, p50 `34.94`, p95 `49.43`, p99 `56.80`, p99.9 `70.34`, max `75.35`

**Client tick (ms)**  avg `0.39`, p95 `0.62`, max `8.16`

**Memory**  start `2425 MB`, end `2554 MB`, peak `3758 MB`, GC `21 events / 198 ms`

**FPS over sampling window (ASCII):**

```
 34.6 |                                          █                                     
 33.8 |                                          █                                     
 33.0 |                                          █             █                       
 32.2 |                                     █    █             █              █       █
 31.4 |     █                   █ █       █ █    ██            █     █        █       █
 30.6 |     █            █      █ █       █ █    ███         █ █     █        █       █
 29.8 |     █      █     █      █ █       █ █   █████  █ ███ █ █    ██    █   ██      █
 29.0 | █ █ █      █ █   █  █   █ █      ██ █   █████  ███████ █ █  ██    █ █ ██      █
 28.3 | ███ █   ██ █ █   █  █   █ ██  █  ██ ██  █████  █████████ █ ███  █ █ █ ███ █ █ █
 27.5 | ███ █ ████ █ ██ ██  █ ███████ ██ ██ ██████████████████████ ████ █████ █████ █ █
 26.7 | ███████████████████ ██████████████████████████████████████ ████ █████████████ █
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  12 ms |   1
  14 ms |   1
  17 ms | ██  4
  18 ms | █  3
  19 ms | ██  4
  20 ms | ███  6
  21 ms | ████  9
  22 ms | ███  6
  23 ms | ██  5
  24 ms | █  3
  26 ms |   1
  27 ms |   1
  28 ms | █  2
  29 ms | █  3
  30 ms | █  3
  31 ms | ███████  16
  32 ms | ██████████████████████████████  67
  33 ms | ████████████████████████████████████████  88
  34 ms | █████████████████████████  54
  35 ms | ███████████████  33
  36 ms | ████████████  26
  37 ms | ███████  15
  38 ms | ███████  16
  39 ms | █████  12
  40 ms | █████  12
  41 ms | ██████████  23
  42 ms | ████████  17
  43 ms | ███████  16
  44 ms | ████████  18
  45 ms | ████  9
  46 ms | ██████████  21
  47 ms | ███████  15
  48 ms | █  2
  49 ms | █████  10
  50 ms |   1
  51 ms | ███  6
  52 ms | ██  4
  54 ms | █  2
  56 ms | ██  4
  58 ms |   1
  61 ms |   1
  65 ms |   1
  66 ms |   1
  75 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `fps_harmonic_avg` = `27.18`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.27`
- `seed` = `7481.00`
- `preload_duration_ms` = `36.00`
- `entity_count_sample_end` = `6.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `2.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `15.23`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24795 ms  |  Sample ticks: 400

**FPS**  avg `29.14`, min `13.90`, p50 `28.26`, p95 `47.22`, p99 `59.52`, 1%low `15.57`, 0.1%low `13.90`, std `13.65`

**Frame time (ms)**  avg `36.96`, p50 `35.39`, p95 `50.29`, p99 `59.71`, p99.9 `68.73`, max `71.94`

**Client tick (ms)**  avg `0.36`, p95 `0.53`, max `3.48`

**Memory**  start `2817 MB`, end `3043 MB`, peak `3853 MB`, GC `24 events / 223 ms`

**FPS over sampling window (ASCII):**

```
 69.2 |                                        █                                       
 65.1 |                                        █                                       
 61.0 |                                        █                                       
 56.9 |                                        █                                       
 52.8 |                                        █                                       
 48.7 |                                        █                                       
 44.6 |                                        █                                       
 40.5 |                                        █                                       
 36.4 |                                        █                           █           
 32.3 |     █    █    █   █         █          █  █ ███  █  ██  █  █ █ █ █ █     █     
 28.3 |████████████ ████████  █████████████ ███████ ██████████ ███ ███████ ████████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
  13 ms | █  2
  15 ms | █  1
  16 ms | ██  3
  17 ms | ██  3
  18 ms | ██  4
  19 ms | ███  6
  20 ms | ███  6
  21 ms | ███  5
  22 ms | ██████  10
  23 ms | ██  4
  24 ms | ██  3
  25 ms | ██  4
  26 ms | █  1
  27 ms | █  1
  29 ms | ██  4
  30 ms | ████  7
  31 ms | ████████████████  28
  32 ms | ██████████████████████  39
  33 ms | ████████████████████████████████████████  70
  34 ms | █████████████████████████████████  57
  35 ms | █████████████████████  36
  36 ms | ████████████  21
  37 ms | █████████████  23
  38 ms | █████████  15
  39 ms | █████████  15
  40 ms | ██████  11
  41 ms | ██████████  17
  42 ms | ████████  14
  43 ms | ███████████  20
  44 ms | ██████████  17
  45 ms | ███████████  19
  46 ms | ████████  14
  47 ms | ██████  10
  48 ms | ██████  11
  49 ms | █████  9
  50 ms | ███  5
  51 ms | ███  6
  52 ms | █  1
  53 ms | ██  4
  54 ms | █  1
  55 ms | █  2
  56 ms | ██  3
  59 ms | ██  3
  60 ms | █  1
  61 ms | █  2
  65 ms | █  1
  71 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `fps_harmonic_avg` = `27.06`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.90`
- `seed` = `7487.00`
- `preload_duration_ms` = `1759.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-55.00`
- `entity_count_sample_start` = `56.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `15.57`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `28.95`, min `14.21`, p50 `28.37`, p95 `44.78`, p99 `51.15`, 1%low `15.47`, 0.1%low `14.21`, std `17.93`

**Frame time (ms)**  avg `36.93`, p50 `35.25`, p95 `48.16`, p99 `56.80`, p99.9 `69.54`, max `70.39`

**Client tick (ms)**  avg `0.45`, p95 `0.66`, max `5.66`

**Memory**  start `2734 MB`, end `2739 MB`, peak `3912 MB`, GC `22 events / 213 ms`

**FPS over sampling window (ASCII):**

```
 91.0 |                                                                               █
 85.0 |                                                                               █
 79.1 |                                                                               █
 73.1 |                                                                               █
 67.1 |                                                                               █
 61.1 |                                                                               █
 55.2 |                                                                               █
 49.2 |                                                                               █
 43.2 |                                                                               █
 37.3 |                                                                               █
 31.3 |█  █   ██    █ ██  ███ ██  █   ██   ███   ███  █ ██   ██  █    █ ██ █ ██    ████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
  14 ms |   1
  19 ms | ████  9
  20 ms | █████  10
  21 ms | ██  5
  22 ms | ██  4
  23 ms | █  2
  24 ms |   1
  25 ms | ██  5
  26 ms | █  2
  29 ms | ██  4
  30 ms | █  2
  31 ms | ███████████  22
  32 ms | ████████████████████████████  58
  33 ms | ████████████████████████████████████████  83
  34 ms | █████████████████████████  51
  35 ms | ████████████████  33
  36 ms | █████████████  27
  37 ms | █████████  19
  38 ms | ██████  13
  39 ms | ████████████  24
  40 ms | ███████  15
  41 ms | █████████  18
  42 ms | ███████████  22
  43 ms | ███████  15
  44 ms | ██████████  20
  45 ms | ██████  12
  46 ms | ████████  16
  47 ms | █████████  19
  48 ms | ██  5
  49 ms | ██  5
  50 ms | ███  6
  51 ms |   1
  53 ms | █  2
  54 ms |   1
  55 ms |   1
  56 ms | █  2
  57 ms |   1
  62 ms |   1
  64 ms |   1
  68 ms |   1
  70 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `fps_harmonic_avg` = `27.08`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.21`
- `seed` = `7499.00`
- `preload_duration_ms` = `36.00`
- `entity_count_sample_end` = `6.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-17.00`
- `entity_count_sample_start` = `23.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `15.47`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `28.53`, min `11.79`, p50 `28.68`, p95 `42.46`, p99 `53.89`, 1%low `14.96`, 0.1%low `11.79`, std `10.27`

**Frame time (ms)**  avg `36.90`, p50 `34.86`, p95 `48.05`, p99 `55.32`, p99.9 `75.92`, max `84.79`

**Client tick (ms)**  avg `0.31`, p95 `0.41`, max `1.45`

**Memory**  start `2262 MB`, end `3794 MB`, peak `4057 MB`, GC `19 events / 181 ms`

**FPS over sampling window (ASCII):**

```
 37.1 |                                █                                               
 36.0 |                █               █                                               
 34.8 |                █               █                                               
 33.7 |                █               █                █                              
 32.6 |                █               █     █          █                  █           
 31.4 |                █         █     █     ██         █                  █           
 30.3 |                █  █      ██    █     ██   ████  █        █         █ ██        
 29.1 | █     █        ██ █  █   ██    █  █  ██   ████ ███       █ █      ██ ██        
 28.0 |███   ███ █   █ ██ ██ █   ██ █ ██  ████████████ █████ ██ █████    ███ ███      █
 26.9 |███████████████ ██████████████ ██  ████████████████████████████ █ ████████ █ █ █
 25.7 |██████████████████████████████████████████████████████████████████████████ █ ███
 24.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   1
  10 ms |   1
  16 ms |   1
  18 ms | ██  5
  19 ms | █  2
  20 ms |   1
  21 ms | ██  6
  22 ms | ████  10
  23 ms | ██  5
  25 ms |   1
  26 ms |   1
  28 ms | █  2
  31 ms | ████  10
  32 ms | ██████████████████████  62
  33 ms | ████████████████████████████████████████  114
  34 ms | ████████████████████  57
  35 ms | ████████  23
  36 ms | █████████  25
  37 ms | █████  15
  38 ms | ███████  21
  39 ms | █████  13
  40 ms | ███████  20
  41 ms | ███████  21
  42 ms | ████████  23
  43 ms | ██████  17
  44 ms | █████  15
  45 ms | █████  14
  46 ms | █████  15
  47 ms | █████  13
  48 ms | ██  7
  49 ms | ██  7
  50 ms | ██  5
  51 ms | █  2
  54 ms |   1
  56 ms | █  3
  67 ms |   1
  68 ms |   1
  84 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `fps_harmonic_avg` = `27.10`
- `part` = `1.00`
- `fps_0p1pct_low` = `11.79`
- `seed` = `7507.00`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `14.96`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23064 ms  |  Sample ticks: 400

**FPS**  avg `28.87`, min `13.19`, p50 `28.20`, p95 `47.08`, p99 `54.12`, 1%low `14.52`, 0.1%low `13.19`, std `10.64`

**Frame time (ms)**  avg `37.11`, p50 `35.46`, p95 `49.82`, p99 `63.45`, p99.9 `72.59`, max `75.79`

**Client tick (ms)**  avg `0.36`, p95 `0.52`, max `1.05`

**Memory**  start `2783 MB`, end `3551 MB`, peak `4107 MB`, GC `22 events / 209 ms`

**FPS over sampling window (ASCII):**

```
 51.6 |                                                      █                         
 49.2 |                                                      █                         
 46.8 |                                                      █                         
 44.4 |                                           █          █                         
 42.0 |                                           █          █                         
 39.6 |                                           █          █                         
 37.2 |                                           █          █                         
 34.8 |                                         █ █          █                         
 32.4 |             █        █              █   █ █      █   █                        █
 30.0 | ██   █  ██  █ █   █ ██           █ ██ █ █ █ █ █ ██ █ █   █ ██ ████      █    ██
 27.6 |███  ███ ██ ███████████████ ███ █ ██████████ ██████ ███████████████ ██  █████ ██
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   7 ms | █  1
  14 ms | █  1
  15 ms | █  1
  16 ms | █  1
  18 ms | █████  7
  19 ms | ███  4
  20 ms | ██████  9
  21 ms | █████  8
  22 ms | ████  6
  23 ms | █  1
  24 ms | █  1
  25 ms | █████  7
  26 ms | ██  3
  27 ms | █  2
  28 ms | █████  7
  29 ms | ███  4
  30 ms | █████  7
  31 ms | ███████████  17
  32 ms | ████████████████████████████████████████  62
  33 ms | █████████████████████████████████████  58
  34 ms | ██████████████████████████████  47
  35 ms | ████████████████  25
  36 ms | ██████████████  22
  37 ms | ██████████████  21
  38 ms | ██████████  16
  39 ms | ████████████  19
  40 ms | ███████████  17
  41 ms | █████████  14
  42 ms | ████████████████  25
  43 ms | ████████████  18
  44 ms | ██████  9
  45 ms | ███████████  17
  46 ms | ████████████  18
  47 ms | ███████████  17
  48 ms | ███████  11
  49 ms | █████  8
  50 ms | ██████  10
  51 ms | ███  4
  52 ms | █  1
  54 ms | █  1
  55 ms | █  1
  57 ms | █  1
  58 ms | █  1
  62 ms | █  2
  64 ms | ██  3
  69 ms | █  2
  75 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `fps_harmonic_avg` = `26.95`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.19`
- `seed` = `7517.00`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-42.00`
- `entity_count_sample_start` = `43.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `14.52`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `28.31`, min `12.84`, p50 `28.77`, p95 `42.84`, p99 `50.01`, 1%low `16.14`, 0.1%low `12.84`, std `6.23`

**Frame time (ms)**  avg `36.81`, p50 `34.76`, p95 `48.16`, p99 `56.09`, p99.9 `67.52`, max `77.89`

**Client tick (ms)**  avg `0.38`, p95 `0.58`, max `3.14`

**Memory**  start `4294 MB`, end `3922 MB`, peak `4580 MB`, GC `19 events / 197 ms`

**FPS over sampling window (ASCII):**

```
 32.4 |          █                                                                     
 31.7 |          █   █         █                                            █          
 31.1 |          █ █ █   █     █           █ █                   █          █          
 30.4 |          █ █ █ ███     ██          █ █            █     ██        ███     █  █ 
 29.7 |          █ █ █ ███     ██        █ █ █       █    █  █  ███       ███     █  █ 
 29.0 |          █ █ █ ███  █ ███        ███ █    █ ██    █  █  ███       ███ █   █  █ 
 28.4 |   █ █ █ ██████ ███ ██████       ██████    █ ███   █  █ ████  █ ██ █████   ██ █ 
 27.7 | ███ █ █ ██████ ███ ██████    █  ██████ █  █████  ██ ██ ██████████ █████ █ ██ █ 
 27.0 |████ ██████████ ██████████ █  █  ████████████████ ████████████████ █████ ████ █ 
 26.3 |███████████████ ████████████  ████████████████████████████████████ ████████████ 
 25.7 |████████████████████████████  ██████████████████████████████████████████████████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms | ██  5
  20 ms | ████  9
  21 ms | ███  6
  22 ms | ██  5
  23 ms | ███  6
  24 ms | ███  6
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   1
  30 ms | █  3
  31 ms | ████████  19
  32 ms | ████████████████████████████  64
  33 ms | ████████████████████████████████████████  93
  34 ms | ██████████████████████████  60
  35 ms | ██████████  23
  36 ms | ██████████  23
  37 ms | █████████  20
  38 ms | ██████████  23
  39 ms | ████  9
  40 ms | ████████  19
  41 ms | ██████  13
  42 ms | ██████  15
  43 ms | █████████  20
  44 ms | ██████  14
  45 ms | █████████  20
  46 ms | ███████████  25
  47 ms | ████  9
  48 ms | ██  5
  49 ms | ███  7
  50 ms | ██  4
  52 ms | █  2
  53 ms | █  2
  54 ms |   1
  55 ms |   1
  56 ms |   1
  57 ms | █  2
  58 ms | █  2
  77 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `fps_harmonic_avg` = `27.17`
- `part` = `1.00`
- `fps_0p1pct_low` = `12.84`
- `seed` = `7523.00`
- `preload_duration_ms` = `21.00`
- `entity_count_sample_end` = `14.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-19.00`
- `entity_count_sample_start` = `33.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `16.14`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `28.32`, min `20.19`, p50 `29.49`, p95 `30.75`, p99 `47.94`, 1%low `20.60`, 0.1%low `20.19`, std `4.96`

**Frame time (ms)**  avg `36.24`, p50 `33.91`, p95 `46.16`, p99 `48.03`, p99.9 `49.32`, max `49.54`

**Client tick (ms)**  avg `0.26`, p95 `0.32`, max `0.63`

**Memory**  start `3748 MB`, end `3133 MB`, peak `4536 MB`, GC `8 events / 53 ms`

**FPS over sampling window (ASCII):**

```
 31.5 |               █                                                        █       
 30.9 |               █                                                        █       
 30.4 |  █  █        ██   █                                                    █       
 29.9 |  █  █        ██   █         █    █    █        █     █     █ ██   █  █ █       
 29.4 |  █  █        ██   ██  █     █  █ █    ███      ███ ███     █ ███ ██  █ █ █     
 28.8 |  ██ █  █ █   ███ ███  █   █ █  █ █  █ ███ █   ████ ███ █ ███ ███ ██  █ █ █     
 28.3 |  ██ █  █ █  ████ ███  █   █ ██ █ █  █ ███ █  █████ ███ █ ███ ███ ██  █ █ █     
 27.8 |  ██ █  █ █  ████████  █   ████ ███  █ ███ █ ██████████ █████████ ██  █ ████  █ 
 27.3 |  ██ █ ██ █ █████████  ██  ████████  █ █████████████████████████████ ██ ████ ██ 
 26.7 |████ █ ██ █ █████████  ██ ██████████ █ ████████████████████████████████ ███████ 
 26.2 |███████████████████████████████████████████████████████████████████████████████ 
 25.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | █  8
  21 ms | ██  10
  22 ms | █  3
  23 ms |   1
  24 ms | █  3
  29 ms |   1
  31 ms |   1
  32 ms | ████  24
  33 ms | ████████████████████████████████████████  234
  34 ms | █████  31
  35 ms | ██████  35
  36 ms | ███  17
  37 ms | ███  17
  38 ms | █  8
  39 ms | ███  18
  40 ms | ███  18
  41 ms | ███  20
  42 ms | ███  19
  43 ms | ███  17
  44 ms | ███  15
  45 ms | ████  22
  46 ms | ██  12
  47 ms | ██  11
  48 ms | █  5
  49 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_1pct_low` = `20.60`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `66.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `20.19`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.59`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `30.82`, min `16.30`, p50 `27.88`, p95 `50.29`, p99 `58.02`, 1%low `16.52`, 0.1%low `16.30`, std `12.16`

**Frame time (ms)**  avg `36.22`, p50 `35.86`, p95 `53.89`, p99 `58.70`, p99.9 `61.28`, max `61.36`

**Client tick (ms)**  avg `3.11`, p95 `4.11`, max `11.38`

**Memory**  start `3897 MB`, end `3242 MB`, peak `4573 MB`, GC `8 events / 52 ms`

**FPS over sampling window (ASCII):**

```
 35.1 |                                     █                             █            
 34.2 |█     █                   █          █                 █    █      █    █       
 33.3 |█     █                   █          █         █       ██   █   █  █  █ █ █     
 32.4 |█     █    █              █          █         █       ███  █  ██ ███ █ █ ███   
 31.5 |█     █    █    ██     █ ██  █  █    █         ██  ██  ███ ██  ██ ███ █ █ ███  █
 30.7 |█     █ ████ █  ██  █  █ ██  ██ █ █  █ █ █     ██  ██  ███ ██  ██ ███ █ █ ████ █
 29.8 |█ █ █ █ ████ █  ███ ███████ ███ ███  █ █ █   █ ███████ ███ ██████████ █ ██████ █
 28.9 |██████████████  ███ ███████ ███ ████ █ ███  ██ ██████████████████████ █ ██████ █
 28.0 |██████████████  ███████████████ ██████████████ ██████████████████████ █ ████████
 27.1 |██████████████████████████████████████████████ ████████████████████████ ████████
 26.3 |███████████████████████████████████████████████████████████████████████ ████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
   9 ms | █  1
  16 ms | ██  2
  17 ms | ██████  5
  18 ms | ████████  7
  19 ms | ███████████████████  16
  20 ms | █████████████████████████████  25
  21 ms | ████████████████████  17
  22 ms | ████████████████████████████  24
  23 ms | ███████████████  13
  24 ms | ██████████████  12
  25 ms | ██████  5
  26 ms | ████████  7
  27 ms | ███████  6
  28 ms | █████  4
  29 ms | ██████  5
  30 ms | ████████████████████████████████  27
  31 ms | ███████████████████  16
  32 ms | █████████████  11
  33 ms | ████████████████████████████████████████  34
  34 ms | ██████████████████  15
  35 ms | █████████████████████████████████  28
  36 ms | ████████████████████████  20
  37 ms | ████████████████  14
  38 ms | ████████████████  14
  39 ms | ███████████████  13
  40 ms | ██████████████  12
  41 ms | █████████  8
  42 ms | ███████████████████  16
  43 ms | ██████████████████████  19
  44 ms | █████████████████████████  21
  45 ms | █████████████████████  18
  46 ms | ███████████████████  16
  47 ms | ███████████████████  16
  48 ms | ██████████████████  15
  49 ms | ███████████  9
  50 ms | ████████  7
  51 ms | ████████████  10
  52 ms | ████████  7
  53 ms | ███████████  9
  54 ms | ██████  5
  55 ms | ████████  7
  56 ms | █████  4
  57 ms | █  1
  58 ms | ██████  5
  60 ms | ████  3
  61 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `16.52`
- `fps_0p1pct_low` = `16.30`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.61`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `79.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `28.59`, min `19.87`, p50 `29.40`, p95 `46.34`, p99 `49.92`, 1%low `20.18`, 0.1%low `19.87`, std `6.41`

**Frame time (ms)**  avg `36.39`, p50 `34.02`, p95 `46.84`, p99 `48.74`, p99.9 `50.31`, max `50.33`

**Client tick (ms)**  avg `0.27`, p95 `0.33`, max `0.48`

**Memory**  start `3725 MB`, end `3860 MB`, peak `4577 MB`, GC `5 events / 33 ms`

**FPS over sampling window (ASCII):**

```
 32.2 |                                        █        █                              
 31.5 |    █                                   █        █          █                   
 30.9 |    █  █ ██ █            █    █ █      ██  █     ██         █   █               
 30.3 |    █  █ ████            █    █ ███    ██  █     ██ █     █ █   █       █       
 29.6 |    █  █ ████      █    ███ █ █ ███    ██  █     ██ █   █ █ █   ██    █ █   █   
 29.0 |    ██ █ ████      █ █  █████ █ ███    ██  █     ██ █   █ █ █   ██  ███ █   █   
 28.4 |    █████████  █ █ █ █  █████ █ ███ █  ██ ██ ██  ██ █  ██ █ █   ██  ███ █   █   
 27.7 |█  ██████████  █████ ██ ███████ ███ █  ██ ██████ █████ ██████   ███ █████  ██  █
 27.1 |█  ██████████ ██████ ██████████ █████  ██ ██████ █████ ███████  ███ █████ ████ █
 26.4 |█████████████ █████████████████ █████████ ████████████ ████████ ███ ████████████
 25.8 |███████████████████████████████ ███████████████████████████████ ████████████████
 25.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  18 ms |   1
  19 ms | █  4
  20 ms | ██  9
  21 ms | █████  23
  22 ms | █  3
  29 ms |   2
  31 ms |   2
  32 ms | ███████████  49
  33 ms | ████████████████████████████████████████  177
  34 ms | █████  23
  35 ms | █████  21
  36 ms | █████  24
  37 ms | ████  18
  38 ms | ████  16
  39 ms | ███  12
  40 ms | ███  13
  41 ms | █████  23
  42 ms | █████  20
  43 ms | ████  17
  44 ms | █████  22
  45 ms | █████  24
  46 ms | █████  20
  47 ms | ███  12
  48 ms | ██  11
  50 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `27.48`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.87`
- `seed` = `9043.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.18`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3166.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `28.36`, min `19.05`, p50 `29.14`, p95 `44.75`, p99 `49.82`, 1%low `20.12`, 0.1%low `19.05`, std `5.69`

**Frame time (ms)**  avg `36.41`, p50 `34.31`, p95 `46.39`, p99 `48.51`, p99.9 `50.98`, max `52.49`

**Client tick (ms)**  avg `0.28`, p95 `0.34`, max `0.79`

**Memory**  start `2609 MB`, end `2947 MB`, peak `4565 MB`, GC `5 events / 32 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                                                                         █      
 32.3 |                                                                         █      
 31.6 |                                                           █           █ █      
 31.0 |    █            █              █                          █           █ █    █ 
 30.3 |    █  █         █   █          █         █               ███   █   █  █ █    █ 
 29.6 |    █  █     █   █   █          █   █   ███             █ ████  █   █  █ █   ██ 
 28.9 |    ██ █   █ █   █   █       █  ██  █ █ ███  █        ███ ████  █  ██  ███   ██ 
 28.3 |  █ ██ ██ ██ ██  ██  █       █  ███ ███████  █  █     ████████ ██  ██ ████ █████
 27.6 | █████ ████████  ██  ██ █    █  ███ ████████ ████ ██  ████████ ██  ██ ██████████
 26.9 |████████████████ ████████ █ ███████ █████████████ ██████████████████████████████
 26.2 |███████████████████████████████████ █████████████ ██████████████████████████████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  3
  20 ms | ███  12
  21 ms | ██  10
  22 ms | █  4
  24 ms |   1
  28 ms |   1
  30 ms |   1
  31 ms | █  4
  32 ms | ███████  33
  33 ms | ████████████████████████████████████████  192
  34 ms | ██████  31
  35 ms | ███████  35
  36 ms | ████  21
  37 ms | ████  20
  38 ms | ██  10
  39 ms | ███  13
  40 ms | ███  13
  41 ms | ██████  28
  42 ms | █████  25
  43 ms | ████  19
  44 ms | ████  18
  45 ms | ████  19
  46 ms | ███  13
  47 ms | ██  10
  48 ms | ██  10
  49 ms |   2
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `20.12`
- `fps_harmonic_avg` = `27.47`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `19.05`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `74.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23070 ms  |  Sample ticks: 400

**FPS**  avg `28.40`, min `18.99`, p50 `29.41`, p95 `32.05`, p99 `48.34`, 1%low `19.83`, 0.1%low `18.99`, std `5.18`

**Frame time (ms)**  avg `36.19`, p50 `34.00`, p95 `45.87`, p99 `48.34`, p99.9 `52.49`, max `52.66`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `0.62`

**Memory**  start `2672 MB`, end `3152 MB`, peak `4540 MB`, GC `5 events / 31 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                                     █                                          
 32.6 |                                     █                                  █       
 31.9 |                                     █                          █       █       
 31.2 |                       █             █                       █  █   █   █       
 30.5 | █      █              █             █    █   █ █            █  █ █ █   █       
 29.9 | █  █  ██              █     █   █   ██   █   ███          █ █  █ █ █   █       
 29.2 | █  █  ██              █    ███  █ █ ██   █   ████         █ █  █ █ ██  █  █    
 28.5 | █  ██ ██    █  █ █    █    ███ ██ █ ███  █ █ ████  ██     █ ██ █ █ ██  █  █    
 27.8 | █████ ████  ████ █  ████ █ ████████ ███ ██ ██████  ████ ██████ ██████  █ ████ █
 27.2 |████████████ ████████████ ██████████ ███ ██ ███████████████████ ██████ █████████
 26.5 |████████████ ███████████████████████ ███████████████████████████████████████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   2
  20 ms | █  5
  21 ms | ██  11
  22 ms | █  7
  23 ms |   1
  30 ms |   1
  32 ms | ███████  39
  33 ms | ████████████████████████████████████████  209
  34 ms | ███████  34
  35 ms | ██████  31
  36 ms | █████  26
  37 ms | ██  11
  38 ms | ███  14
  39 ms | ████  19
  40 ms | ████  20
  41 ms | ████  22
  42 ms | ████  23
  43 ms | ███  18
  44 ms | ███  14
  45 ms | ███  17
  46 ms | ██  11
  47 ms | ██  9
  48 ms | █  3
  49 ms |   1
  51 ms |   1
  52 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `19.83`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `27.63`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `18.99`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `85.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `28.24`, min `19.10`, p50 `29.37`, p95 `30.76`, p99 `47.90`, 1%low `19.94`, 0.1%low `19.10`, std `5.13`

**Frame time (ms)**  avg `36.39`, p50 `34.05`, p95 `46.57`, p99 `49.12`, p99.9 `51.20`, max `52.36`

**Client tick (ms)**  avg `0.30`, p95 `0.38`, max `0.81`

**Memory**  start `2624 MB`, end `3727 MB`, peak `4544 MB`, GC `5 events / 38 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |                                                                              █ 
 33.0 |                                                                              █ 
 32.2 |    █                                                                         █ 
 31.4 |    █           █       █                                     █       █       █ 
 30.6 |  █ █           █      ██         █                           ██      ██  █   █ 
 29.7 |  █ █      █    █      ██ █     █ █            █             ███ █ █ ███  █   █ 
 28.9 |  █ █     ██    █      ██ █ █  ██ █      █ █   ██            ███ █ █ ███  █   █ 
 28.1 |  █ █     ██  █ ████  ███████ ███████   ██ █   ██  █ █   █ █ █████ █ ████████ ██
 27.3 |███ █████ █████ ████ █████████████████████ ██ ████████████ █████████ ████████ ██
 26.4 |█████████ ███████████████████████████████████████████████████████████████████ ██
 25.6 |█████████ ███████████████████████████████████████████████████████████████████ ██
 24.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   1
  20 ms | █  4
  21 ms | ███  14
  22 ms | █  3
  23 ms |   1
  29 ms |   1
  31 ms |   2
  32 ms | ████████  41
  33 ms | ████████████████████████████████████████  202
  34 ms | ████████  39
  35 ms | ███  15
  36 ms | ██████  32
  37 ms | ███  14
  38 ms | ████  19
  39 ms | █████  23
  40 ms | ███  17
  41 ms | ███  17
  42 ms | ███  14
  43 ms | █████  25
  44 ms | ███  14
  45 ms | ███  17
  46 ms | ███  13
  47 ms | █  5
  48 ms | ██  9
  49 ms | █  5
  50 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `27.48`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `19.10`
- `seed` = `8053.00`
- `preload_duration_ms` = `39.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `19.94`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195389 ms  |  Sample ticks: 3600

**FPS**  avg `9.85`, min `7.67`, p50 `9.96`, p95 `10.77`, p99 `11.64`, 1%low `7.90`, 0.1%low `7.70`, std `0.64`

**Frame time (ms)**  avg `101.96`, p50 `100.36`, p95 `114.72`, p99 `124.54`, p99.9 `128.36`, max `130.39`

**Client tick (ms)**  avg `0.71`, p95 `1.27`, max `14.17`

**Memory**  start `2726 MB`, end `4071 MB`, peak `4753 MB`, GC `69 events / 504 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                                                █                               
 10.0 |               █                                █                               
 10.0 |               █       █         █ █     █      █ █     █                       
  9.9 |               █  ██   ███       █ █     █      █ █     █                       
  9.9 |█           ██ █  ██   ████     ████     █ ██   ███ █   █               █     █ 
  9.9 |█         █ ████  ██ █ █████ █  ████   █ ██████ ███ █   █    █  ███    ██  █  █ 
  9.8 |█ █      ██ ████  ██ █ █████ █████████ ████████ ███ █   █  ███  ████ █ ██ ██  █ 
  9.8 |████     ██ ████  ████ ███████████████ ████████ ███████ █  ███ █████ ████████ █ 
  9.8 |██████ █████████ █████ ████████████████████████ ███████ █ ████ █████ ██████████ 
  9.7 |██████████████████████ █████████████████████████████████████████████ ██████████ 
  9.7 |████████████████████████████████████████████████████████████████████ ███████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  70 ms |   1
  77 ms |   1
  79 ms |   1
  80 ms |   1
  81 ms |   1
  82 ms |   1
  83 ms | █  6
  84 ms |   1
  85 ms |   5
  86 ms | █  12
  87 ms | █  11
  88 ms | █  6
  89 ms | █  14
  90 ms | █  8
  91 ms | █  11
  92 ms | █  12
  93 ms | ██  16
  94 ms | ██  23
  95 ms | ██  21
  96 ms | ███  32
  97 ms | █████  55
  98 ms | ███████████  112
  99 ms | ███████████████████████████████████  356
 100 ms | ████████████████████████████████████████  409
 101 ms | █████████████████  178
 102 ms | ██████  61
 103 ms | ███  34
 104 ms | ███  28
 105 ms | ██  24
 106 ms | █  14
 107 ms | ██  16
 108 ms | ██  21
 109 ms | ██  18
 110 ms | ███  30
 111 ms | ███  34
 112 ms | █████  50
 113 ms | ███  28
 114 ms | ███  30
 115 ms | █  15
 116 ms | █  11
 117 ms |   1
 118 ms | █  7
 119 ms |   4
 120 ms |   4
 121 ms |   1
 122 ms | █  9
 123 ms | █  11
 124 ms | █  6
 125 ms |   5
 126 ms |   3
 127 ms |   4
 128 ms |   1
 129 ms |   1
 130 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.70`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.81`
- `fps_1pct_low` = `7.90`
- `blocks_placed` = `3096347.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194984 ms  |  Sample ticks: 3600

**FPS**  avg `183.32`, min `7.47`, p50 `216.16`, p95 `357.23`, p99 `443.77`, 1%low `8.25`, 0.1%low `7.71`, std `123.47`

**Frame time (ms)**  avg `22.85`, p50 `4.63`, p95 `101.56`, p99 `115.44`, p99.9 `127.24`, max `133.81`

**Client tick (ms)**  avg `0.73`, p95 `1.13`, max `2.58`

**Memory**  start `4646 MB`, end `3102 MB`, peak `4752 MB`, GC `113 events / 920 ms`

**FPS over sampling window (ASCII):**

```
262.1 |                                                  █                             
239.1 |              █ █████████   █ ██ ████ █████ █   ████ █ ██████                   
216.2 |              ███████████████████████████████   █████████████                   
193.2 |             ██████████████████████████████████ █████████████████  ████  ███ ███
170.3 |             ██████████████████████████████████ ████████████████████████████████
147.4 |             ███████████████████████████████████████████████████████████████████
124.4 |             ███████████████████████████████████████████████████████████████████
101.5 |             ███████████████████████████████████████████████████████████████████
 78.6 |             ███████████████████████████████████████████████████████████████████
 55.6 |             ███████████████████████████████████████████████████████████████████
 32.7 |             ███████████████████████████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   21
   2 ms | ████████████  653
   3 ms | ████████████████████████████████████████  2220
   4 ms | ██████████████████████████  1428
   5 ms | ████████  444
   6 ms | ████  216
   7 ms | ██  132
   8 ms | █  59
   9 ms |   21
  10 ms |   10
  11 ms |   1
  13 ms |   2
  14 ms |   2
  15 ms |   25
  16 ms | ██  87
  17 ms | ████  205
  18 ms | ████  226
  19 ms | ████  232
  20 ms | ████  235
  21 ms | ███  140
  22 ms | █  78
  23 ms | █  49
  24 ms | █  30
  25 ms |   23
  26 ms |   7
  27 ms |   5
  28 ms |   4
  29 ms |   4
  30 ms |   1
  31 ms |   1
  33 ms |   4
  34 ms |   3
  35 ms |   5
  36 ms |   7
  38 ms |   6
  39 ms |   6
  40 ms |   1
  41 ms |   1
  42 ms |   4
  43 ms |   2
  44 ms |   2
  45 ms |   2
  54 ms |   1
  68 ms |   1
  69 ms |   2
  75 ms |   2
  78 ms |   1
  79 ms |   1
  80 ms |   2
  81 ms |   2
  82 ms |   3
  83 ms |   3
  84 ms |   4
  85 ms |   6
  86 ms |   3
  87 ms |   4
  88 ms |   9
  89 ms |   4
  90 ms |   13
  91 ms |   12
  92 ms |   7
  93 ms |   17
  94 ms |   15
  95 ms |   18
  96 ms |   19
  97 ms | █  38
  98 ms | ██  101
  99 ms | ████  239
 100 ms | █████  267
 101 ms | ██  128
 102 ms | █  51
 103 ms | █  29
 104 ms |   20
 105 ms |   10
 106 ms |   16
 107 ms |   12
 108 ms |   11
 109 ms |   13
 110 ms |   19
 111 ms |   23
 112 ms |   23
 113 ms | █  30
 114 ms |   10
 115 ms |   19
 116 ms |   12
 117 ms |   6
 118 ms |   6
 119 ms |   3
 120 ms |   3
 121 ms |   4
 122 ms |   3
 123 ms |   4
 124 ms |   5
 125 ms |   6
 126 ms |   7
 127 ms |   2
 128 ms |   4
 131 ms |   2
 133 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `68.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.71`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `43.77`
- `fps_1pct_low` = `8.25`
- `blocks_placed` = `3096347.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194317 ms  |  Sample ticks: 3600

**FPS**  avg `70.95`, min `11.73`, p50 `41.62`, p95 `184.97`, p99 `259.29`, 1%low `15.29`, 0.1%low `12.94`, std `58.39`

**Frame time (ms)**  avg `25.25`, p50 `24.02`, p95 `56.71`, p99 `62.04`, p99.9 `68.47`, max `85.23`

**Client tick (ms)**  avg `0.87`, p95 `1.26`, max `4.44`

**Memory**  start `2949 MB`, end `2954 MB`, peak `4753 MB`, GC `187 events / 1820 ms`

**FPS over sampling window (ASCII):**

```
122.0 |                                                          █       █  █          
113.6 |                                                      ██████ ████ █████         
105.2 |                               █         █        █  ███████████████████        
 96.8 |                             █ ████    █████    ████████████████████████        
 88.4 |                             ██████   ██████████████████████████████████        
 79.9 |                            █████████████████████████████████████████████       
 71.5 |                            █████████████████████████████████████████████       
 63.1 |                            █████████████████████████████████████████████       
 54.7 |                            █████████████████████████████████████████████       
 46.2 |                            █████████████████████████████████████████████       
 37.8 |          █                ██████████████████████████████████████████████       
 29.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   3
   3 ms | ███████  91
   4 ms | ███████████████  182
   5 ms | ██████████████████  228
   6 ms | ██████████████████████████  319
   7 ms | ███████████████████████████████████  440
   8 ms | ████████████████████████████████████████  498
   9 ms | ███████████████████████████████████████  490
  10 ms | ███████████████████  237
  11 ms | █████████  113
  12 ms | ██  31
  13 ms | █  18
  14 ms | █  11
  15 ms | █  9
  16 ms | ██  25
  17 ms | ███  39
  18 ms | ██████  76
  19 ms | ████████████  149
  20 ms | █████████████  166
  21 ms | ██████████████  179
  22 ms | ██████████  127
  23 ms | ███████████  133
  24 ms | ███████████  132
  25 ms | █████████████████  215
  26 ms | ███████████████████  231
  27 ms | ███████████████  185
  28 ms | █████████████  162
  29 ms | █████████  116
  30 ms | ████████  100
  31 ms | █████████  106
  32 ms | ████████████████  193
  33 ms | █████████████████  209
  34 ms | ███████████  133
  35 ms | ███  43
  36 ms | ██  27
  37 ms | ███  39
  38 ms | ███  41
  39 ms | █████  58
  40 ms | ██████  70
  41 ms | ██████  79
  42 ms | ██████  78
  43 ms | ██████  80
  44 ms | ███████  92
  45 ms | ████████  96
  46 ms | ████████  105
  47 ms | ██████  71
  48 ms | ██████  72
  49 ms | ████  47
  50 ms | ████  55
  51 ms | ████  56
  52 ms | ████  47
  53 ms | ████  45
  54 ms | ███████  83
  55 ms | ███████  82
  56 ms | ███████  87
  57 ms | █████  66
  58 ms | ██████  73
  59 ms | ████  55
  60 ms | ███  34
  61 ms | ██  30
  62 ms | ██  21
  63 ms | █  12
  64 ms | █  15
  65 ms | █  8
  66 ms |   5
  67 ms |   3
  68 ms |   1
  69 ms |   1
  71 ms |   2
  77 ms |   1
  80 ms |   1
  84 ms |   1
  85 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
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
- `fps_0p1pct_low` = `12.94`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `39.60`
- `fps_1pct_low` = `15.29`
- `blocks_placed` = `3096347.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195103 ms  |  Sample ticks: 3600

**FPS**  avg `31.93`, min `9.37`, p50 `28.29`, p95 `62.65`, p99 `117.67`, 1%low `13.51`, 0.1%low `10.33`, std `19.15`

**Frame time (ms)**  avg `37.92`, p50 `35.34`, p95 `60.59`, p99 `66.72`, p99.9 `80.27`, max `106.72`

**Client tick (ms)**  avg `0.84`, p95 `1.22`, max `5.36`

**Memory**  start `3324 MB`, end `3985 MB`, peak `4750 MB`, GC `160 events / 1736 ms`

**FPS over sampling window (ASCII):**

```
 40.2 |                      █                                                         
 39.1 |                      █                                                         
 37.9 |                  █   █                                                         
 36.8 |                  █  ██                                                         
 35.7 | █      █         █  ██            █  █      █    █                             
 34.6 | █      █   █  █ ███ ██  █     █  ██  ██     █    █                             
 33.5 |██   █ ██  ███ █ ██████  █  █  █  ██  ██     █  █ ██  █                         
 32.3 |███ ██ ██  ████████████  ██ █ ██  ███ ███    ████ ███ █                         
 31.2 |███ █████ █████████████ █████████ ███ ███  █ ████ ███ █ █  ██               █   
 30.1 |█████████████████████████████████ ████████ ██████████ ████ ███        █  ██ █ █ 
 29.0 |█████████████████████████████████████████████████████ █████████████████████████ 
 27.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   1
   5 ms |   3
   6 ms | ██  15
   7 ms | ██  17
   8 ms | ████  26
   9 ms | █████  36
  10 ms | █████  38
  11 ms | ███  24
  12 ms | ███  22
  13 ms | ██  13
  14 ms | ██  18
  15 ms | ████  27
  16 ms | █████  35
  17 ms | █████  40
  18 ms | ████████  61
  19 ms | ██████████████  101
  20 ms | ███████████████████  140
  21 ms | ███████████████  113
  22 ms | ████████  62
  23 ms | ████  26
  24 ms | █████  36
  25 ms | ██████  42
  26 ms | ███████  48
  27 ms | ████████  58
  28 ms | ███████████  81
  29 ms | ██████████████  105
  30 ms | ██████████████████████  161
  31 ms | ███████████████████████████  196
  32 ms | ████████████████████████████████████████  295
  33 ms | ████████████████████████████████████  268
  34 ms | ██████████████████████████████  221
  35 ms | ██████████████  106
  36 ms | ████████  59
  37 ms | ██████  42
  38 ms | █████  39
  39 ms | █████  36
  40 ms | █████████  67
  41 ms | ████████████  89
  42 ms | ██████████████████  132
  43 ms | ████████████████████  150
  44 ms | ███████████████████████  166
  45 ms | ██████████████████████  165
  46 ms | ██████████████████████  163
  47 ms | ██████████████  105
  48 ms | ████████████  87
  49 ms | █████████████  93
  50 ms | ████████████  86
  51 ms | ███████████  79
  52 ms | ████████  57
  53 ms | ████████  57
  54 ms | ████████  59
  55 ms | █████████  66
  56 ms | ████████  60
  57 ms | ████████  57
  58 ms | ██████████  74
  59 ms | █████████  63
  60 ms | ███████  49
  61 ms | ███████  53
  62 ms | █████  38
  63 ms | ████  31
  64 ms | ███  19
  65 ms | ██  14
  66 ms | █  10
  67 ms | █  11
  68 ms | █  5
  69 ms | █  4
  70 ms | █  5
  71 ms | █  4
  72 ms |   2
  73 ms |   1
  74 ms |   1
  75 ms |   1
  76 ms |   3
  77 ms |   2
  78 ms |   1
  79 ms |   2
  81 ms |   1
  88 ms |   1
 103 ms |   1
 104 ms |   1
 106 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `13.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `74.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `10.33`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `26.37`
- `fps_1pct_low` = `13.51`
- `blocks_placed` = `3096347.00`

