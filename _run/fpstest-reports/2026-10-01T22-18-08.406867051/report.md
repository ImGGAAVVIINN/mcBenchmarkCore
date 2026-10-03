# MC Benchmark Core session — 2026-10-01T22:38:26.827341384+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1150.1 | 38.4 | 22.1 | 20.52 | 1.32 | 73 | 2024 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 769.3 | 35.7 | 22.6 | 23.65 | 1.15 | 74 | 1514 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 657.9 | 38.9 | 25.9 | 21.31 | 1.14 | 68 | 2052 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 441.9 | 33.5 | 23.0 | 24.82 | 1.11 | 69 | 1392 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 775.5 | 40.3 | 28.4 | 21.82 | 1.03 | 59 | 1513 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 746.4 | 36.6 | 24.0 | 23.04 | 0.90 | 76 | 1375 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 683.4 | 38.2 | 23.8 | 22.38 | 1.09 | 47 | 1783 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 332.4 | 31.2 | 22.2 | 26.26 | 1.77 | 46 | 2117 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 906.5 | 31.1 | 19.6 | 24.73 | 4.76 | 51 | 1331 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 221.3 | 27.6 | 20.8 | 30.16 | 4.98 | 36 | 151 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 482.2 | 31.8 | 20.9 | 25.55 | 1.46 | 91 | 1366 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 441.9 | 33.4 | 20.9 | 24.68 | 0.84 | 63 | 881 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 654.9 | 31.4 | 20.6 | 25.84 | 5.56 | 47 | 1522 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 831.3 | 32.6 | 21.6 | 24.59 | 3.98 | 39 | 2078 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1224.6 | 12.4 | 8.8 | 60.65 | 20.05 | 27 | 141 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1097.6 | 11.0 | 8.9 | 66.33 | 20.73 | 29 | 476 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1128.8 | 38.2 | 25.7 | 22.27 | 2.88 | 64 | 286 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 21 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1360.9 | 41.2 | 27.0 | 20.56 | 0.43 | 63 | 201 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 1835.8 | 58.8 | 42.3 | 14.61 | 0.38 | 26 | 1067 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1592.6 | 57.1 | 42.7 | 15.17 | 0.36 | 30 | 1265 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 1903.9 | 58.5 | 43.0 | 14.89 | 0.34 | 23 | 551 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 1834.9 | 57.4 | 40.7 | 15.34 | 0.34 | 26 | 1484 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 1973.7 | 58.6 | 42.0 | 14.98 | 0.37 | 20 | 845 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 1899.3 | 57.3 | 44.6 | 15.36 | 0.38 | 21 | 1308 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 1946.6 | 55.4 | 38.9 | 15.78 | 0.36 | 21 | 1531 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 1755.0 | 54.6 | 41.2 | 15.90 | 0.37 | 21 | 1465 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 1729.9 | 55.1 | 38.0 | 15.70 | 0.45 | 23 | 1877 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 1957.6 | 59.3 | 44.3 | 14.76 | 0.31 | 19 | 257 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 1754.3 | 54.3 | 39.4 | 16.05 | 0.35 | 19 | 2126 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 1986.0 | 55.3 | 40.2 | 15.34 | 0.32 | 19 | 464 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1472.5 | 40.7 | 27.5 | 21.06 | 0.44 | 41 | 1173 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 141.5 | 19.7 | 14.7 | 44.96 | 7.07 | 36 | 142 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1382.5 | 42.1 | 29.9 | 20.72 | 0.42 | 42 | 1091 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1349.6 | 38.6 | 23.7 | 21.86 | 0.47 | 39 | 258 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1262.7 | 40.8 | 28.7 | 21.47 | 0.42 | 41 | 2092 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1061.6 | 39.0 | 25.6 | 22.23 | 0.54 | 37 | 2690 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

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
- [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs)
- [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs)
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

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `1150.11`, min `18.02`, p50 `1246.81`, p95 `1716.62`, p99 `1880.40`, 1%low `38.43`, 0.1%low `22.12`, std `442.75`

**Frame time (ms)**  avg `1.79`, p50 `0.80`, p95 `5.23`, p99 `20.52`, p99.9 `36.74`, max `55.49`

**Client tick (ms)**  avg `1.32`, p95 `3.62`, max `23.87`

**Memory**  start `627 MB`, end `1269 MB`, peak `2652 MB`, GC `73 events / 603 ms`

**FPS over sampling window (ASCII):**

```
1548.8 |                                                        ██                      
1446.6 |                                              █      █ ████       █             
1344.4 |                                        ██  █████  ████████     █ █  ██         
1242.2 |                 █          █  ████   ███████████ ██████████ ███████████        
1140.0 |         █ ███  █████       █  █████ ████████████ ██████████ ████████████ ███   
1037.8 |   █     █████ ███████ █ █████ ██████████████████████████████████████████████ ██
935.6 |   ██    █████████████ ███████ █████████████████████████████████████████████████
833.4 |  ███ ██████████████████████████████████████████████████████████████████████████
731.2 |  ██████████████████████████████████████████████████████████████████████████████
629.0 | ███████████████████████████████████████████████████████████████████████████████
526.8 | ███████████████████████████████████████████████████████████████████████████████
424.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8070
   1 ms | █████████  1811
   2 ms | ██  396
   3 ms | █  175
   4 ms | █  134
   5 ms |   73
   6 ms |   27
   7 ms |   30
   8 ms |   12
   9 ms |   7
  10 ms |   3
  11 ms |   3
  12 ms |   3
  13 ms |   3
  14 ms |   16
  15 ms |   27
  16 ms |   44
  17 ms |   80
  18 ms |   64
  19 ms |   43
  20 ms |   47
  21 ms |   19
  22 ms |   19
  23 ms |   12
  24 ms |   7
  25 ms |   8
  26 ms |   6
  28 ms |   3
  29 ms |   2
  30 ms |   1
  31 ms |   3
  33 ms |   1
  35 ms |   1
  36 ms |   2
  38 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
  42 ms |   1
  43 ms |   1
  44 ms |   1
  47 ms |   1
  51 ms |   2
  55 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 1395 | 829.0 | 24.52 |
| `sculk_charge_pop` | 240 | 1395 | 1092.7 | 20.85 |
| `ALL_TOGETHER` | 1680 | 1395 | 1043.7 | 19.90 |
| `portal` | 160 | 1395 | 1167.0 | 19.10 |
| `end_rod` | 240 | 1395 | 1312.2 | 18.85 |
| `dragon_breath` | 160 | 1395 | 1384.7 | 18.49 |
| `dripping_water` | 240 | 1395 | 1261.6 | 20.76 |
| `flame` | 160 | 1395 | 1110.4 | 21.71 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `38.43`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `22.12`
- `fps_harmonic_avg` = `558.62`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `103.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `769.34`, min `18.69`, p50 `842.01`, p95 `1080.73`, p99 `1210.64`, 1%low `35.69`, 0.1%low `22.58`, std `278.79`

**Frame time (ms)**  avg `2.41`, p50 `1.19`, p95 `7.89`, p99 `23.65`, p99.9 `34.59`, max `53.52`

**Client tick (ms)**  avg `1.15`, p95 `2.25`, max `5.84`

**Memory**  start `1597 MB`, end `1831 MB`, peak `3111 MB`, GC `74 events / 656 ms`

**FPS over sampling window (ASCII):**

```
895.1 |          █                                                                     
865.9 |          █   █            █            █         █   █                         
836.6 |          █ ███     █      ██           █    █    █ ███         █    █         █
807.3 |█         █ ███  ██ █      ████   █     █  ███ █  █ ███         ██ █ █  █     ██
778.0 |█  █    █ █ ███  ██ ██     ██████████ █ ██ █████  █████         ██ ████ ██  ████
748.8 |█  █ █  █ ██████ █████ █  ███████████ █ █████████ ███████ █  █  ██ ███████  ████
719.5 |█  ███████████████████ █  ███████████████████████ ████████████ ███ ███████ █████
690.2 |█  ███████████████████ █ █████████████████████████████████████ █████████████████
660.9 |██ ███████████████████ █ ███████████████████████████████████████████████████████
631.7 |██ ███████████████████ █ ███████████████████████████████████████████████████████
602.4 |████████████████████████ ███████████████████████████████████████████████████████
573.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████  1489
   1 ms | ████████████████████████████████████████  5454
   2 ms | ████  540
   3 ms | █  173
   4 ms | █  98
   5 ms | █  87
   6 ms |   36
   7 ms |   20
   8 ms |   10
   9 ms |   7
  10 ms |   2
  11 ms |   2
  12 ms |   6
  14 ms |   8
  15 ms |   11
  16 ms |   20
  17 ms |   38
  18 ms |   47
  19 ms |   58
  20 ms |   42
  21 ms |   30
  22 ms |   36
  23 ms |   23
  24 ms |   24
  25 ms |   15
  26 ms |   11
  27 ms |   4
  28 ms |   2
  29 ms |   3
  30 ms |   2
  31 ms |   1
  32 ms |   2
  33 ms |   1
  34 ms |   2
  35 ms |   1
  36 ms |   1
  41 ms |   1
  43 ms |   1
  44 ms |   1
  45 ms |   1
  53 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `35.69`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `415.60`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `22.58`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `657.86`, min `22.13`, p50 `724.38`, p95 `914.37`, p99 `1099.37`, 1%low `38.92`, 0.1%low `25.92`, std `236.72`

**Frame time (ms)**  avg `2.62`, p50 `1.38`, p95 `14.97`, p99 `21.31`, p99.9 `32.62`, max `45.19`

**Client tick (ms)**  avg `1.14`, p95 `1.95`, max `12.33`

**Memory**  start `1549 MB`, end `2215 MB`, peak `3601 MB`, GC `68 events / 625 ms`

**FPS over sampling window (ASCII):**

```
831.4 |             █                                                                  
799.5 |             █                                                      █           
767.7 |             █                    █                          ██     █           
735.8 |             █               █  █ █                   █ █ ████████  █ ██        
703.9 |             █              ██  █ █ ██ █ █ █        █ █ █ ███████████████     █ 
672.1 |    █        █             ███  ███ ████ ███ ██   █ █████████████████████  █  █ 
640.2 |    ███ ███  ██   █     ██ ████ ███ ████ ███ ██   █ ██████████████████████ ██ █ 
608.3 |██ ████ ███ ███  ██████ ███████ ███ ████ ███ ██  ██ ████████████████████████████
576.4 |██ ████████ ████ ██████████████ ███ ████ ██████  ██ ████████████████████████████
544.6 |███████████ ███████████████████ ████████ ███████ ███████████████████████████████
512.7 |███████████ ███████████████████ ████████████████████████████████████████████████
480.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  168
   1 ms | ████████████████████████████████████████  5898
   2 ms | ████  655
   3 ms | █  219
   4 ms | █  92
   5 ms | █  93
   6 ms |   54
   7 ms |   17
   8 ms |   11
   9 ms |   9
  10 ms |   8
  11 ms |   1
  12 ms |   5
  13 ms |   4
  14 ms |   7
  15 ms |   20
  16 ms |   41
  17 ms |   60
  18 ms |   69
  19 ms |   61
  20 ms |   44
  21 ms |   18
  22 ms |   19
  23 ms |   14
  24 ms |   8
  25 ms |   7
  26 ms |   3
  27 ms |   5
  28 ms |   1
  29 ms |   1
  30 ms |   1
  32 ms |   1
  33 ms |   1
  35 ms |   1
  36 ms |   1
  38 ms |   2
  39 ms |   1
  40 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `38.92`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `66.00`
- `fps_harmonic_avg` = `381.29`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `25.92`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `441.93`, min `22.35`, p50 `475.55`, p95 `666.13`, p99 `944.85`, 1%low `33.55`, 0.1%low `22.98`, std `183.26`

**Frame time (ms)**  avg `3.86`, p50 `2.10`, p95 `18.86`, p99 `24.82`, p99.9 `40.27`, max `44.75`

**Client tick (ms)**  avg `1.11`, p95 `1.75`, max `6.35`

**Memory**  start `1409 MB`, end `1117 MB`, peak `2801 MB`, GC `69 events / 662 ms`

**FPS over sampling window (ASCII):**

```
706.2 |   █                                                                            
670.5 |   █                                                                            
634.8 |   █                                                   █                        
599.1 |   █                                                   █                        
563.4 |  ██  █                                                █                        
527.7 |  ███ █         █                                      █                        
492.0 |  ███ ██     █  █    █                                 ██   ██       █          
456.3 |█ ███ ███   ██  ███  ██     ██    █ █  █ █     ██████  ██  ███ █     █ █ ███   █
420.6 |█ ███████ ████  ███  ████ ███████ █ █ ███████ ███████ ████ █████ █ ███ ██████ ██
384.8 |██████████████ ██████████████████████████████ ████████████████████ ██████████ ██
349.1 |█████████████████████████████████████████████ ██████████████████████████████████
313.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  38
   1 ms | ████████████████████████████████████████  2179
   2 ms | ████████████████████████████████  1758
   3 ms | ███████  387
   4 ms | ███  185
   5 ms | ██  110
   6 ms | █  46
   7 ms | █  28
   8 ms |   20
   9 ms |   13
  10 ms |   6
  11 ms |   2
  12 ms |   2
  13 ms |   2
  14 ms |   3
  15 ms |   16
  16 ms |   21
  17 ms | █  42
  18 ms | █  61
  19 ms | █  47
  20 ms | █  45
  21 ms | █  38
  22 ms | █  37
  23 ms |   17
  24 ms |   23
  25 ms |   13
  26 ms |   3
  27 ms |   7
  28 ms |   3
  29 ms |   5
  30 ms |   2
  31 ms |   4
  33 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms |   1
  40 ms |   1
  42 ms |   1
  43 ms |   3
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `33.55`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `13.00`
- `fps_harmonic_avg` = `258.75`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `22.98`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `775.50`, min `20.03`, p50 `850.54`, p95 `1066.49`, p99 `1251.86`, 1%low `40.28`, 0.1%low `28.36`, std `265.44`

**Frame time (ms)**  avg `2.26`, p50 `1.18`, p95 `6.62`, p99 `21.82`, p99.9 `28.56`, max `49.92`

**Client tick (ms)**  avg `1.03`, p95 `1.79`, max `4.48`

**Memory**  start `1485 MB`, end `1434 MB`, peak `2999 MB`, GC `59 events / 603 ms`

**FPS over sampling window (ASCII):**

```
879.3 |                             █        █          █            █ █  █            
856.0 |                          █  █   █    █          █            █ █  █  █         
832.7 |             █   █     ██ █ ███  █    █      █   █  █  █      ███  █  █ █       
809.4 |     █       █   █   █ ████████ ███   ██     ██  ██ █  █      ██████  ███  █    
786.0 |     █      ██  ██  ███████████████   ██  █████  ██ █ ██     ███████  ██████    
762.7 |   █ █      ███ ██  ███████████████  ███ ███████ ████ ██  █ ████████ ███████   █
739.4 | █ ███   ██ ███ ██ ████████████████  ███ ████████████ ██  █ ████████ ███████   █
716.0 | █ ███ █ ██████ ██ ████████████████  ███ ███████████████ ██ █████████████████ ██
692.7 | █ ███ █ █████████ ████████████████ ████ ██████████████████ █████████████████ ██
669.4 | █ ███ ███████████ █████████████████████ ██████████████████ █████████████████ ██
646.1 | ███████████████████████████████████████ ████████████████████████████████████ ██
622.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  1121
   1 ms | ████████████████████████████████████████  6408
   2 ms | ███  539
   3 ms | █  170
   4 ms | █  84
   5 ms |   67
   6 ms |   27
   7 ms |   15
   8 ms |   9
   9 ms |   4
  10 ms |   1
  11 ms |   2
  12 ms |   2
  13 ms |   1
  14 ms |   12
  15 ms |   23
  16 ms |   42
  17 ms |   64
  18 ms |   54
  19 ms |   57
  20 ms |   30
  21 ms |   39
  22 ms |   28
  23 ms |   20
  24 ms |   7
  25 ms |   7
  26 ms |   5
  27 ms |   2
  28 ms |   4
  30 ms |   2
  31 ms |   1
  32 ms |   1
  33 ms |   1
  39 ms |   2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `40.28`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `53.00`
- `fps_harmonic_avg` = `442.87`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `28.36`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `746.38`, min `17.74`, p50 `820.30`, p95 `1039.04`, p99 `1241.53`, 1%low `36.63`, 0.1%low `24.04`, std `267.64`

**Frame time (ms)**  avg `2.44`, p50 `1.22`, p95 `9.27`, p99 `23.04`, p99.9 `32.86`, max `56.36`

**Client tick (ms)**  avg `0.90`, p95 `1.55`, max `23.55`

**Memory**  start `1125 MB`, end `2330 MB`, peak `2501 MB`, GC `76 events / 672 ms`

**FPS over sampling window (ASCII):**

```
932.0 |                                    █                                           
897.4 |                                    █                                           
862.9 |              █                     █        █                                  
828.4 |  █ █         █  ██    █          █ █        █          █      █        █       
793.9 | ██ ███   █  ███ ██  █ █ █        █ █  ██ █  █     ██   ███    █        ██  █   
759.3 | ██████  ██  ███ ██ ████ █ █  ██  ███  ████ ██ █   ██  ████  █ ██   █   ██ ██  █
724.8 | ██████  ██████████ ████████  ███ ███  █████████   ████████ █████   █   ██ ██  █
690.3 | ██████  ████████████████████ ██████████████████  ███████████████ █ █  ██████  █
655.8 | ███████ ████████████████████ ███████████████████ ███████████████ ████████████ █
621.2 | ███████ ████████████████████████████████████████ ██████████████████████████████
586.7 | ███████████████████████████████████████████████████████████████████████████████
552.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  726
   1 ms | ████████████████████████████████████████  6045
   2 ms | ████  590
   3 ms | █  164
   4 ms | █  97
   5 ms | █  77
   6 ms |   49
   7 ms |   21
   8 ms |   6
   9 ms |   6
  10 ms |   3
  11 ms |   5
  12 ms |   2
  13 ms |   2
  14 ms |   5
  15 ms |   15
  16 ms |   28
  17 ms |   45
  18 ms |   54
  19 ms |   39
  20 ms |   47
  21 ms |   41
  22 ms |   35
  23 ms |   23
  24 ms |   21
  25 ms |   9
  26 ms |   6
  27 ms |   5
  28 ms |   4
  31 ms |   3
  32 ms |   5
  33 ms |   2
  38 ms |   1
  40 ms |   1
  42 ms |   2
  45 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `36.63`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `85.00`
- `fps_harmonic_avg` = `409.21`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `24.04`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `683.44`, min `16.49`, p50 `745.28`, p95 `943.54`, p99 `1122.26`, 1%low `38.17`, 0.1%low `23.80`, std `238.02`

**Frame time (ms)**  avg `2.54`, p50 `1.34`, p95 `14.97`, p99 `22.38`, p99.9 `32.41`, max `60.66`

**Client tick (ms)**  avg `1.09`, p95 `2.00`, max `11.91`

**Memory**  start `2425 MB`, end `1731 MB`, peak `4209 MB`, GC `47 events / 627 ms`

**FPS over sampling window (ASCII):**

```
844.9 |                                  █                                             
815.3 |              █                   █                                             
785.7 |              █                █  █                                             
756.1 |           █  █ █           █  █ ███  █                               █ █       
726.6 |   █     ███ ██ █          █████ ████ ██ ███   ██    ██  █     █    █████    █  
697.0 |   █████ ███ ████          ██████████ ██ ███  ███    ██  █    ███   █████  ███  
667.4 | █ █████ ███ ████    █     █████████████ ███ ████  ████  ███ █████  ███████████ 
637.8 | ███████ ███ ████  █ █ ██  █████████████ ████████  █████████ █████  ███████████ 
608.2 |█████████████████ ██ ████  ███████████████████████ █████████ █████ █████████████
578.7 |█████████████████ ██ ████  ███████████████████████████████████████ █████████████
549.1 |██████████████████████████ ███████████████████████████████████████ █████████████
519.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  224
   1 ms | ████████████████████████████████████████  6219
   2 ms | ████  598
   3 ms | █  195
   4 ms | █  95
   5 ms | █  84
   6 ms |   33
   7 ms |   10
   8 ms |   5
  12 ms |   1
  13 ms |   2
  14 ms |   9
  15 ms |   26
  16 ms |   29
  17 ms |   61
  18 ms |   61
  19 ms |   46
  20 ms |   39
  21 ms |   38
  22 ms |   41
  23 ms |   20
  24 ms |   9
  25 ms |   6
  26 ms |   1
  27 ms |   1
  28 ms |   2
  29 ms |   1
  30 ms |   1
  31 ms |   2
  32 ms |   3
  36 ms |   1
  37 ms |   1
  38 ms |   2
  46 ms |   2
  60 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `38.17`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `393.54`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `23.80`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `332.38`, min `20.43`, p50 `364.65`, p95 `483.58`, p99 `655.50`, 1%low `31.20`, 0.1%low `22.24`, std `131.08`

**Frame time (ms)**  avg `4.78`, p50 `2.74`, p95 `20.27`, p99 `26.26`, p99.9 `39.64`, max `48.95`

**Client tick (ms)**  avg `1.77`, p95 `2.55`, max `22.39`

**Memory**  start `2127 MB`, end `2194 MB`, peak `4245 MB`, GC `46 events / 607 ms`

**FPS over sampling window (ASCII):**

```
583.7 |█                                                                               
553.5 |█                                                                               
523.3 |█                                                                               
493.0 |█                                                                               
462.8 |█                                                                               
432.6 |███                                                                             
402.4 |███                                                                             
372.2 |███   █           █                            █             █           █ ██   
342.0 |███   ███  █   ████  █     ███ █      ██ ██    █ █ █ █ ██ ██ ██████ ██   ████   
311.8 |████████████ ███████ ████ ███████  █████████████████████████ ███████████████████
281.5 |█████████████████████████████████ ██████████████████████████████████████████████
251.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███  159
   2 ms | ████████████████████████████████████████  2468
   3 ms | ██████████  632
   4 ms | ████  253
   5 ms | ██  135
   6 ms | █  87
   7 ms |   26
   8 ms |   14
   9 ms |   8
  10 ms |   4
  12 ms |   2
  13 ms |   3
  14 ms |   3
  15 ms |   9
  16 ms |   26
  17 ms |   28
  18 ms | █  49
  19 ms | █  50
  20 ms | █  51
  21 ms |   23
  22 ms | █  38
  23 ms | █  34
  24 ms |   18
  25 ms |   16
  26 ms |   10
  27 ms |   7
  28 ms |   4
  29 ms |   1
  30 ms |   3
  31 ms |   3
  33 ms |   1
  34 ms |   3
  35 ms |   3
  36 ms |   2
  37 ms |   1
  38 ms |   1
  39 ms |   1
  41 ms |   1
  44 ms |   1
  45 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `31.20`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `40.00`
- `fps_harmonic_avg` = `209.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `22.24`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `906.46`, min `16.27`, p50 `993.21`, p95 `1248.23`, p99 `1481.11`, 1%low `31.11`, 0.1%low `19.58`, std `320.08`

**Frame time (ms)**  avg `2.19`, p50 `1.01`, p95 `7.01`, p99 `24.73`, p99.9 `42.31`, max `61.45`

**Client tick (ms)**  avg `4.76`, p95 `6.73`, max `21.66`

**Memory**  start `2245 MB`, end `1950 MB`, peak `3576 MB`, GC `51 events / 613 ms`

**FPS over sampling window (ASCII):**

```
1018.6 |                                █                                               
988.0 |█         █             █    █  █  █ █  █            █ █ █           █          
957.4 |█        ██    █  ███   █  ███  █  █ █  █   █        ███ █  ███      █     █  █ 
926.8 |█     █  █████ █  ███   █  ███████████  ██  █ █  ██  ███ ██ ███      ███ █ █  █ 
896.3 |█     █ █████████ ███   █  ████████████████ ███  ██  ██████ ███  █   █████ ████ 
865.7 |█   ███ █████████ ███  ██  ████████████████████ ███ ███████ ████ ██  ██████████ 
835.1 |█   ███ █████████ ████ ██ █████████████████████ ███ ████████████████████████████
804.5 |█   █████████████████████ ██████████████████████████████████████████████████████
774.0 |██  █████████████████████ ██████████████████████████████████████████████████████
743.4 |██ █████████████████████████████████████████████████████████████████████████████
712.8 |██ █████████████████████████████████████████████████████████████████████████████
682.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4444
   1 ms | █████████████████████████████████  3611
   2 ms | ██  247
   3 ms | █  82
   4 ms | █  70
   5 ms | █  124
   6 ms | █  105
   7 ms |   42
   8 ms |   5
   9 ms |   12
  10 ms |   7
  11 ms |   3
  12 ms |   3
  13 ms |   5
  14 ms |   9
  15 ms |   22
  16 ms |   37
  17 ms | █  62
  18 ms |   44
  19 ms |   26
  20 ms |   18
  21 ms |   26
  22 ms |   25
  23 ms |   15
  24 ms |   6
  25 ms |   20
  26 ms |   15
  27 ms |   9
  28 ms |   5
  29 ms |   2
  30 ms |   3
  31 ms |   4
  32 ms |   6
  34 ms |   2
  35 ms |   2
  36 ms |   1
  37 ms |   1
  38 ms |   3
  39 ms |   2
  40 ms |   3
  41 ms |   3
  42 ms |   1
  43 ms |   1
  45 ms |   1
  46 ms |   1
  48 ms |   1
  50 ms |   2
  54 ms |   1
  57 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `31.11`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `18.00`
- `fps_harmonic_avg` = `456.76`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `500.00`
- `fps_0p1pct_low` = `19.58`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `500.00`
- `preload_chunks` = `81.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `221.31`, min `20.23`, p50 `246.12`, p95 `352.46`, p99 `385.68`, 1%low `27.57`, 0.1%low `20.81`, std `97.33`

**Frame time (ms)**  avg `6.85`, p50 `4.06`, p95 `21.72`, p99 `30.16`, p99.9 `45.58`, max `49.44`

**Client tick (ms)**  avg `4.98`, p95 `6.80`, max `23.28`

**Memory**  start `2388 MB`, end `1764 MB`, peak `2539 MB`, GC `36 events / 215 ms`

**FPS over sampling window (ASCII):**

```
290.4 | █                                            █                                 
277.4 | █                                      █     ██   ██    █   ██        █     █  
264.5 | █                                      █     ██   ██    ███ ███ ██    █   ███  
251.5 | ██                 █                   █████ ██   ██    ███████ ██   ██   ███  
238.6 | ███                █                  █████████  ██████ ██████████ █ ███ █████ 
225.6 |█████  █            █                  ██████████████████████████████████ ██████
212.6 |█████ ██        █   █   █              █████████████████████████████████████████
199.7 |█████ ██ █  █   █  ██   █  █           █████████████████████████████████████████
186.7 |█████████████   █  ██   █ ██  █        █████████████████████████████████████████
173.8 |█████████████  ██████ █ ████  █       ██████████████████████████████████████████
160.8 |████████████████████████████ ███ ███  ██████████████████████████████████████████
147.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   5
   2 ms | █████████  249
   3 ms | ████████████████████████████████████████  1163
   4 ms | █████████████████  480
   5 ms | ████████  246
   6 ms | ███  73
   7 ms | ██  63
   8 ms | ███  94
   9 ms | ██  62
  10 ms | █  34
  11 ms | █  21
  12 ms |   12
  13 ms | █  39
  14 ms | ██  44
  15 ms | █  31
  16 ms | █  23
  17 ms | █  25
  18 ms | █  23
  19 ms | █  26
  20 ms | █  31
  21 ms | █  39
  22 ms | █  29
  23 ms | █  16
  24 ms |   11
  25 ms | █  15
  26 ms |   11
  27 ms |   11
  28 ms |   12
  29 ms |   4
  30 ms |   9
  31 ms |   4
  32 ms |   3
  34 ms |   4
  35 ms |   2
  41 ms |   2
  42 ms |   1
  44 ms |   1
  45 ms |   2
  46 ms |   1
  48 ms |   1
  49 ms |   1
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
- `fps_1pct_low` = `27.57`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `146.05`
- `preload_duration_ms` = `46.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.81`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `482.18`, min `20.43`, p50 `526.73`, p95 `712.75`, p99 `835.32`, 1%low `31.76`, 0.1%low `20.90`, std `190.02`

**Frame time (ms)**  avg `3.64`, p50 `1.90`, p95 `18.70`, p99 `25.55`, p99.9 `41.84`, max `48.95`

**Client tick (ms)**  avg `1.46`, p95 `2.31`, max `15.94`

**Memory**  start `953 MB`, end `2302 MB`, peak `2320 MB`, GC `91 events / 687 ms`

**FPS over sampling window (ASCII):**

```
613.0 |                                                         █                      
588.3 |                                                   █   █ █                      
563.6 |                                                   █   █ █    ██    █   ██      
538.9 |█               █     █        █         ██    ██  ███ █ ██   ██    █   ██      
514.2 |█       █     █ █     ██       ██       ███    ██  ███ █ ██   ██    ██ ████ ██  
489.5 |█ ██    █  █ ██ █  █ ███       ██    █  ████   ██ ██████ ██ █ ███   ██ ████ ███ 
464.8 |████ █  █  █ ███████ ███   █   ██   ██  █████ █████████████ █████ █ ██ ████ ████
440.1 |████ █  █  █████████ ███  ████ ██  ███████████████████████████████████ █████████
415.4 |████ ████  █████████████  ███████  ███████████████████████████████████ █████████
390.7 |█████████ ████████████████████████ ███████████████████████████████████ █████████
366.0 |█████████ ██████████████████████████████████████████████████████████████████████
341.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms | ████████████████████████████████████████  3132
   2 ms | ████████████████  1260
   3 ms | ████  315
   4 ms | ██  147
   5 ms | █  97
   6 ms | █  65
   7 ms |   32
   8 ms |   12
   9 ms |   14
  10 ms |   10
  11 ms |   4
  12 ms |   3
  13 ms |   1
  14 ms |   7
  15 ms |   11
  16 ms |   14
  17 ms | █  46
  18 ms | █  51
  19 ms | █  47
  20 ms | █  40
  21 ms |   32
  22 ms |   28
  23 ms |   26
  24 ms |   22
  25 ms |   21
  26 ms |   9
  27 ms |   10
  28 ms |   5
  29 ms |   2
  30 ms |   1
  31 ms |   1
  32 ms |   3
  33 ms |   1
  34 ms |   1
  37 ms |   1
  38 ms |   1
  39 ms |   3
  40 ms |   1
  41 ms |   1
  42 ms |   1
  46 ms |   1
  47 ms |   1
  48 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.90`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `274.58`
- `fps_1pct_low` = `31.76`
- `preload_duration_ms` = `74.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `441.92`, min `19.46`, p50 `468.00`, p95 `709.88`, p99 `1024.86`, 1%low `33.40`, 0.1%low `20.92`, std `189.31`

**Frame time (ms)**  avg `3.83`, p50 `2.14`, p95 `18.88`, p99 `24.68`, p99.9 `41.15`, max `51.39`

**Client tick (ms)**  avg `0.84`, p95 `1.77`, max `4.95`

**Memory**  start `2279 MB`, end `1942 MB`, peak `3160 MB`, GC `63 events / 603 ms`

**FPS over sampling window (ASCII):**

```
739.3 |                                                    █ █              █          
701.6 |                                                    █ █              █          
663.8 |                                                    █ █         █    █          
626.1 |                                                    █ █         █    █          
588.4 |                   █                                █ █         █    █          
550.7 |      █            █                                █ █         █    █          
512.9 |      █            █                            █   █ █         █   ███      █  
475.2 | █    █            █     █  ██    █    ███    ████  █ █       ███ █ █████ █  ██ 
437.5 | █    █          █ █    ██ ██████ ██  █████ █ ████  ██████   ██████ ███████ ████
399.7 |██ █ ████        █████████ █████████ ██████████████ ███████ ███████ ███████ ████
362.0 |████ ███████ █ █ ███████████████████████████████████████████████████████████████
324.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  67
   1 ms | █████████████████████████████████████  1927
   2 ms | ████████████████████████████████████████  2071
   3 ms | ███████  363
   4 ms | ███  165
   5 ms | ██  102
   6 ms | █  68
   7 ms | █  35
   8 ms |   18
   9 ms |   8
  10 ms |   3
  11 ms |   1
  12 ms |   1
  13 ms |   6
  14 ms |   5
  15 ms |   12
  16 ms |   20
  17 ms | █  40
  18 ms | █  48
  19 ms | █  55
  20 ms | █  43
  21 ms | █  30
  22 ms | █  34
  23 ms | █  27
  24 ms |   22
  25 ms |   12
  26 ms |   9
  27 ms |   5
  28 ms |   4
  29 ms |   6
  30 ms |   1
  31 ms |   2
  32 ms |   1
  34 ms |   1
  40 ms |   1
  41 ms |   2
  45 ms |   1
  49 ms |   1
  50 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `33.40`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `260.93`
- `preload_duration_ms` = `48.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.92`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`
- `doors_placed` = `16.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `654.86`, min `18.98`, p50 `720.91`, p95 `1094.81`, p99 `1282.02`, 1%low `31.38`, 0.1%low `20.57`, std `336.92`

**Frame time (ms)**  avg `3.19`, p50 `1.39`, p95 `14.82`, p99 `25.84`, p99.9 `41.81`, max `52.69`

**Client tick (ms)**  avg `5.56`, p95 `11.29`, max `28.72`

**Memory**  start `1537 MB`, end `1995 MB`, peak `3059 MB`, GC `47 events / 423 ms`

**FPS over sampling window (ASCII):**

```
1195.2 |                                                                               █
1107.3 |                                                                              ██
1019.4 |                                                                    █     ██████
931.6 |                        █ ██          █                           ██████ ███████
843.7 |                   █████████████████████                    ██   ███████████████
755.8 |                  ██████████████████████                  ██████████████████████
668.0 |                  ██████████████████████                  ██████████████████████
580.1 |         █        ██████████████████████                  ██████████████████████
492.2 |         ██       ██████████████████████             █   ███████████████████████
404.4 |        ████████████████████████████████████      ██████████████████████████████
316.5 |    ██ █████████████████████████████████████████████████████████████████████████
228.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████  923
   1 ms | ████████████████████████████████████████  2811
   2 ms | ██████████████████  1268
   3 ms | ███████  461
   4 ms | ██  126
   5 ms | █  66
   6 ms | █  47
   7 ms | █  46
   8 ms | █  36
   9 ms |   22
  10 ms |   19
  11 ms |   19
  12 ms |   23
  13 ms | █  59
  14 ms | █  36
  15 ms |   20
  16 ms |   23
  17 ms |   33
  18 ms | █  39
  19 ms |   32
  20 ms |   26
  21 ms |   17
  22 ms |   25
  23 ms |   12
  24 ms |   14
  25 ms |   9
  26 ms |   11
  27 ms |   10
  28 ms |   6
  29 ms |   5
  30 ms |   7
  31 ms |   4
  32 ms |   2
  33 ms |   3
  34 ms |   2
  35 ms |   2
  38 ms |   1
  40 ms |   2
  42 ms |   1
  43 ms |   1
  44 ms |   1
  47 ms |   1
  50 ms |   1
  52 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `31.38`
- `fps_harmonic_avg` = `313.72`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `72.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `20.57`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.20`
- `entity_count_delta` = `-187.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `831.31`, min `18.77`, p50 `872.95`, p95 `1382.12`, p99 `1500.77`, 1%low `32.63`, 0.1%low `21.56`, std `394.08`

**Frame time (ms)**  avg `2.49`, p50 `1.15`, p95 `12.98`, p99 `24.59`, p99.9 `38.89`, max `53.27`

**Client tick (ms)**  avg `3.98`, p95 `8.84`, max `23.41`

**Memory**  start `1697 MB`, end `2939 MB`, peak `3776 MB`, GC `39 events / 374 ms`

**FPS over sampling window (ASCII):**

```
1369.7 |                                                                               █
1267.9 |                         ██ ██                               █                ██
1166.2 |                       ██████████                           ████        █ █ █ ██
1064.5 |                       ███████████                         ██████ ██████████████
962.8 |                      ██████████████                      ██████████████████████
861.1 |        ████   █      ████████████████                    ██████████████████████
759.3 |       █████████   █  █████████████████                   ██████████████████████
657.6 |     ███████████   ████████████████████           █   █   ██████████████████████
555.9 |     ███████████ ██████████████████████   █   █   ███ ██ ███████████████████████
454.2 |    ████████████████████████████████████████████████████████████████████████████
352.5 |   █████████████████████████████████████████████████████████████████████████████
250.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████████████████  3112
   1 ms | ████████████████████████████████████████  3174
   2 ms | ████████  657
   3 ms | ████  290
   4 ms | ██  143
   5 ms | █  78
   6 ms | █  65
   7 ms |   32
   8 ms |   15
   9 ms |   17
  10 ms |   14
  11 ms |   7
  12 ms |   15
  13 ms | █  44
  14 ms | █  46
  15 ms | █  49
  16 ms |   31
  17 ms |   26
  18 ms |   27
  19 ms |   19
  20 ms |   24
  21 ms |   19
  22 ms |   15
  23 ms |   14
  24 ms |   15
  25 ms |   8
  26 ms |   12
  27 ms |   8
  28 ms |   8
  29 ms |   7
  30 ms |   1
  31 ms |   6
  32 ms |   3
  33 ms |   5
  34 ms |   1
  35 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms |   2
  41 ms |   2
  42 ms |   1
  45 ms |   2
  48 ms |   1
  52 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `32.63`
- `fps_harmonic_avg` = `400.99`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `61.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `21.56`
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

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1224.64`, min `8.56`, p50 `1241.53`, p95 `2857.14`, p99 `3194.90`, 1%low `12.37`, 0.1%low `8.78`, std `934.06`

**Frame time (ms)**  avg `5.41`, p50 `0.81`, p95 `28.18`, p99 `60.65`, p99.9 `107.66`, max `116.82`

**Client tick (ms)**  avg `20.05`, p95 `35.17`, max `50.34`

**Memory**  start `2622 MB`, end `2200 MB`, peak `2764 MB`, GC `27 events / 158 ms`

**FPS over sampling window (ASCII):**

```
2993.2 |                                                                             ██ 
2725.9 |                                                                            ████
2458.5 |                                                                 █          ████
2191.1 |                                                    █        ██ ██ ██       ████
1923.8 |                          █                      █████       ████████      █████
1656.4 |          ████     █     ██    ████    ████     ███████     ██████████     █████
1389.1 |          █████    ██    ██    ████    █████    ████████    ███████████    █████
1121.7 |██        █████   ███    ███   █████   ██████   █████████   ███████████    █████
854.4 |███       █████   ████   ███   █████   ██████   █████████   ████████████   █████
587.0 |████      ██████  ████  ████   ██████  ███████  ██████████  ████████████   █████
319.6 |████  █   ███████ █████ █████ ████████ ███████ ████████████ ██████████████ █████
 52.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  2077
   1 ms | ██████  332
   2 ms | ███  157
   3 ms | ███  148
   4 ms | ██████  324
   5 ms | █  75
   6 ms |   19
   7 ms |   13
   8 ms |   11
   9 ms |   9
  10 ms |   9
  11 ms |   5
  12 ms |   9
  13 ms | █  41
  14 ms | █  42
  15 ms | █  27
  16 ms | █  38
  17 ms | █  27
  18 ms |   20
  19 ms | █  30
  20 ms |   13
  21 ms |   12
  22 ms |   9
  23 ms |   8
  24 ms |   19
  25 ms |   18
  26 ms |   9
  27 ms |   10
  28 ms |   8
  29 ms |   11
  30 ms |   11
  31 ms |   12
  32 ms |   8
  33 ms |   5
  34 ms |   10
  35 ms |   4
  36 ms |   2
  37 ms |   4
  38 ms |   4
  39 ms |   3
  40 ms |   1
  41 ms |   5
  42 ms |   5
  43 ms |   8
  44 ms |   6
  45 ms |   7
  46 ms |   3
  47 ms |   1
  48 ms |   5
  49 ms |   5
  50 ms |   7
  51 ms |   1
  52 ms |   3
  53 ms |   3
  54 ms |   2
  55 ms |   2
  56 ms |   1
  58 ms |   1
  59 ms |   2
  60 ms |   1
  61 ms |   1
  63 ms |   3
  64 ms |   2
  65 ms |   2
  67 ms |   2
  68 ms |   1
  69 ms |   3
  71 ms |   2
  72 ms |   2
  74 ms |   2
  76 ms |   2
  83 ms |   1
  84 ms |   1
  85 ms |   1
  91 ms |   1
  93 ms |   2
  94 ms |   2
  98 ms |   2
 106 ms |   1
 110 ms |   1
 112 ms |   1
 115 ms |   1
 116 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `fps_1pct_low` = `12.37`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4787.18`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `8.78`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `184.94`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `27044.00`
- `preload_duration_ms` = `6.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `1097.60`, min `8.68`, p50 `1017.43`, p95 `2491.84`, p99 `3006.09`, 1%low `10.99`, 0.1%low `8.94`, std `902.53`

**Frame time (ms)**  avg `6.99`, p50 `0.98`, p95 `35.45`, p99 `66.33`, p99.9 `108.16`, max `115.26`

**Client tick (ms)**  avg `20.73`, p95 `34.54`, max `57.05`

**Memory**  start `2281 MB`, end `2672 MB`, peak `2758 MB`, GC `29 events / 150 ms`

**FPS over sampling window (ASCII):**

```
2664.6 |                                                                             ███
2425.2 |                                                                  ███        ███
2185.7 |                                                               ██ ███ █      ███
1946.3 |                      █         █                █ █         ████████ █      ███
1706.8 |                      ████      ████      ██     ███ █       ████████ █      ███
1467.4 |               █      █████    ██████     ██     ██████      ████████ ██     ███
1227.9 |              ████    █████    ██████     ███    ███████     ███████████     ███
988.5 |  █           ████    █████    ██████   █████    ███████    ████████████     ███
749.0 | ██           █████   ██████   ███████  ██████   ████████   █████████████    ███
509.6 |███           █████   ███████  ███████  ██████   ████████   ██████████████  ████
270.1 |███      ███  ██████ ██████████████████ ███████ ██████████  ███████████████ ████
 30.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1440
   1 ms | █████████  321
   2 ms | ████  126
   3 ms | ██  65
   4 ms | ██  65
   5 ms | ██  77
   6 ms | ████  161
   7 ms | ██  57
   8 ms |   8
   9 ms |   5
  10 ms |   11
  11 ms |   5
  12 ms | █  29
  13 ms | █  26
  14 ms | █  24
  15 ms | █  28
  16 ms | █  36
  17 ms | █  22
  18 ms |   17
  19 ms | █  19
  20 ms |   12
  21 ms | █  19
  22 ms |   15
  23 ms | █  18
  24 ms |   10
  25 ms |   4
  26 ms |   5
  27 ms | █  19
  28 ms |   16
  29 ms |   8
  30 ms |   12
  31 ms |   7
  32 ms |   4
  33 ms |   8
  34 ms |   12
  35 ms |   9
  36 ms |   6
  37 ms |   8
  38 ms |   11
  39 ms |   5
  40 ms |   9
  41 ms |   5
  42 ms |   5
  43 ms |   3
  44 ms |   5
  45 ms |   3
  46 ms |   5
  47 ms |   9
  48 ms |   8
  49 ms |   2
  50 ms |   2
  51 ms |   1
  52 ms |   1
  53 ms |   2
  54 ms |   3
  55 ms |   2
  56 ms |   2
  57 ms |   1
  58 ms |   4
  59 ms |   1
  60 ms |   3
  61 ms |   1
  62 ms |   1
  64 ms |   2
  66 ms |   2
  70 ms |   1
  71 ms |   1
  75 ms |   1
  77 ms |   1
  79 ms |   2
  80 ms |   1
  81 ms |   1
  82 ms |   1
  84 ms |   1
  87 ms |   1
  89 ms |   3
  90 ms |   1
  91 ms |   1
  95 ms |   1
  96 ms |   1
  97 ms |   1
 102 ms |   1
 103 ms |   3
 105 ms |   1
 107 ms |   1
 109 ms |   1
 110 ms |   1
 115 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `fps_1pct_low` = `10.99`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4794.56`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `8.94`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `143.00`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `27092.00`
- `preload_duration_ms` = `5.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1128.83`, min `20.68`, p50 `1174.84`, p95 `1884.13`, p99 `2371.11`, 1%low `38.16`, 0.1%low `25.70`, std `543.41`

**Frame time (ms)**  avg `1.97`, p50 `0.85`, p95 `6.11`, p99 `22.27`, p99.9 `31.31`, max `48.36`

**Client tick (ms)**  avg `2.88`, p95 `4.85`, max `15.80`

**Memory**  start `2703 MB`, end `1748 MB`, peak `2989 MB`, GC `64 events / 647 ms`

**FPS over sampling window (ASCII):**

```
1873.4 |                                                                 █              
1741.6 |                                                                 █            █ 
1609.9 | ██ █                                                   █       ██          ████
1478.1 | █████                                       █          █    █ ████    █████████
1346.4 |███████                                    █ █   █ █ ████    ███████████████████
1214.6 |████████                              █    █████ █████████  ████████████████████
1082.8 |█████████                           ███ ████████████████████████████████████████
951.1 |█████████                     █ █  █████████████████████████████████████████████
819.3 |██████████                ███ ██████████████████████████████████████████████████
687.6 |██████████          █ ██ ███████████████████████████████████████████████████████
555.8 |████████████ █  ████████████████████████████████████████████████████████████████
424.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6006
   1 ms | ███████████████████  2791
   2 ms | ███  425
   3 ms | █  135
   4 ms | █  152
   5 ms | █  105
   6 ms |   49
   7 ms |   24
   8 ms |   10
   9 ms |   16
  10 ms |   4
  11 ms |   4
  12 ms |   2
  13 ms |   3
  14 ms |   9
  15 ms |   18
  16 ms |   29
  17 ms |   51
  18 ms |   61
  19 ms |   41
  20 ms |   43
  21 ms |   41
  22 ms |   28
  23 ms |   24
  24 ms |   12
  25 ms |   16
  26 ms |   9
  27 ms |   4
  28 ms |   4
  29 ms |   2
  30 ms |   1
  31 ms |   3
  32 ms |   2
  38 ms |   2
  39 ms |   1
  42 ms |   3
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `fps_1pct_low` = `38.16`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.72`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `25.70`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `506.44`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3747.00`
- `preload_duration_ms` = `79.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 502 ms  |  Sample ticks: 0

**FPS**  avg `0.00`, min `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, 1%low `0.00`, 0.1%low `0.00`, std `0.00`

**Frame time (ms)**  avg `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, p99.9 `0.00`, max `0.00`

**Client tick (ms)**  avg `0.00`, p95 `0.00`, max `0.00`

**Memory**  start `0 MB`, end `0 MB`, peak `0 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
(no frames)
```

**Frame-time histogram (ms bucket → count):**

```
(no frames)
```

**Extras:**

- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 54 ms  |  Sample ticks: 0

**FPS**  avg `0.00`, min `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, 1%low `0.00`, 0.1%low `0.00`, std `0.00`

**Frame time (ms)**  avg `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, p99.9 `0.00`, max `0.00`

**Client tick (ms)**  avg `0.00`, p95 `0.00`, max `0.00`

**Memory**  start `0 MB`, end `0 MB`, peak `0 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
(no frames)
```

**Frame-time histogram (ms bucket → count):**

```
(no frames)
```

**Extras:**

- `aborted_state` = `CHUNK_PRELOAD`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 2493 ms  |  Sample ticks: 0

**FPS**  avg `0.00`, min `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, 1%low `0.00`, 0.1%low `0.00`, std `0.00`

**Frame time (ms)**  avg `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, p99.9 `0.00`, max `0.00`

**Client tick (ms)**  avg `0.00`, p95 `0.00`, max `0.00`

**Memory**  start `0 MB`, end `0 MB`, peak `0 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
(no frames)
```

**Frame-time histogram (ms bucket → count):**

```
(no frames)
```

**Extras:**

- `aborted_state` = `READY_WAIT`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 5361 ms  |  Sample ticks: 0

**FPS**  avg `0.00`, min `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, 1%low `0.00`, 0.1%low `0.00`, std `0.00`

**Frame time (ms)**  avg `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, p99.9 `0.00`, max `0.00`

**Client tick (ms)**  avg `0.00`, p95 `0.00`, max `0.00`

**Memory**  start `0 MB`, end `0 MB`, peak `0 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
(no frames)
```

**Frame-time histogram (ms bucket → count):**

```
(no frames)
```

**Extras:**

- `aborted_state` = `READY_WAIT`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `1.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 6307 ms  |  Sample ticks: 0

**FPS**  avg `0.00`, min `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, 1%low `0.00`, 0.1%low `0.00`, std `0.00`

**Frame time (ms)**  avg `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, p99.9 `0.00`, max `0.00`

**Client tick (ms)**  avg `0.00`, p95 `0.00`, max `0.00`

**Memory**  start `0 MB`, end `0 MB`, peak `0 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
(no frames)
```

**Frame-time histogram (ms bucket → count):**

```
(no frames)
```

**Extras:**

- `aborted_state` = `SAMPLING`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `1360.95`, min `21.31`, p50 `1471.03`, p95 `1859.63`, p99 `2126.99`, 1%low `41.22`, 0.1%low `26.97`, std `432.72`

**Frame time (ms)**  avg `1.39`, p50 `0.68`, p95 `2.96`, p99 `20.56`, p99.9 `29.43`, max `46.93`

**Client tick (ms)**  avg `0.43`, p95 `0.76`, max `3.73`

**Memory**  start `2915 MB`, end `1684 MB`, peak `3116 MB`, GC `63 events / 637 ms`

**FPS over sampling window (ASCII):**

```
1753.5 |                                 █                                              
1702.1 |                                 █                                              
1650.7 |                                 ██                                             
1599.3 |                       █         ███                                            
1547.9 |   █                   █        ████                                            
1496.4 |██ █              █    ███      ████                                            
1445.0 |██ █             ██    ███    ██████                          █      █  █      █
1393.6 |████    █ ██   █ ████ █████  ███████    █  █                  █      █  █    █ █
1342.2 |█████  ██ ██   ██████ ██████████████   █████    █ █   █  █   ████   ███ █   ████
1290.8 |██████ █████   ███████████████████████ ██████   ███  ███ ███ ██████████████ ████
1239.4 |██████ ███████████████████████████████████████ ████████████████████████████ ████
1187.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12136
   1 ms | █████  1367
   2 ms | █  180
   3 ms |   89
   4 ms |   105
   5 ms |   87
   6 ms |   31
   7 ms |   5
   8 ms |   1
   9 ms |   2
  11 ms |   1
  12 ms |   4
  13 ms |   2
  14 ms |   6
  15 ms |   23
  16 ms |   43
  17 ms |   56
  18 ms |   54
  19 ms |   51
  20 ms |   34
  21 ms |   33
  22 ms |   25
  23 ms |   28
  24 ms |   7
  25 ms |   9
  26 ms |   4
  27 ms |   1
  28 ms |   1
  29 ms |   4
  30 ms |   1
  31 ms |   3
  34 ms |   1
  36 ms |   1
  37 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
  42 ms |   1
  45 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `66.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `26.97`
- `fps_1pct_low` = `41.22`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `720.23`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `1835.85`, min `30.45`, p50 `1931.11`, p95 `2683.04`, p99 `2810.51`, 1%low `58.84`, 0.1%low `42.31`, std `640.02`

**Frame time (ms)**  avg `0.97`, p50 `0.52`, p95 `1.91`, p99 `14.61`, p99.9 `20.18`, max `32.84`

**Client tick (ms)**  avg `0.38`, p95 `0.57`, max `1.54`

**Memory**  start `2165 MB`, end `2433 MB`, peak `3232 MB`, GC `26 events / 237 ms`

**FPS over sampling window (ASCII):**

```
2240.9 |  █            █                    █                                           
2156.6 |  █ ██       █ █ ██                 █                                           
2072.3 |  █ ██     ███ █ ███   █ ██         ██ █                                        
1988.0 |  ████     █████████  █████  █      ████  █         █                           
1903.7 |█ ████     █████████  █████ ██ ██  █████  █  █ ██  ██            █ █         █  
1819.4 |██████     ████████████████ ██ ██ ██████ ██  █ ██  ██    █  █ ████ █ █   █ ███ █
1735.1 |██████     ████████████████ █████ █████████  ████████ ████  █ ████ ███   █ ███ █
1650.8 |██████    ███████████████████████ █████████  ████████ ████  █ █████████ ██ █████
1566.5 |██████  █ ██████████████████████████████████ ████████ ████  █ █████████ ████████
1482.2 |███████████████████████████████████████████████████████████ █ █████████ ████████
1397.9 |███████████████████████████████████████████████████████████████████████ ████████
1313.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18574
   1 ms | ██  1023
   2 ms |   191
   3 ms |   210
   4 ms |   89
   5 ms |   49
   6 ms |   18
   7 ms |   7
   8 ms |   4
   9 ms |   2
  10 ms |   2
  12 ms |   29
  13 ms |   112
  14 ms |   127
  15 ms |   53
  16 ms |   37
  17 ms |   22
  18 ms |   18
  19 ms |   7
  20 ms |   5
  21 ms |   5
  22 ms |   6
  23 ms |   2
  26 ms |   2
  29 ms |   1
  31 ms |   1
  32 ms |   1
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `42.31`
- `part` = `1.00`
- `fps_harmonic_avg` = `1029.67`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `58.84`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `44.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24157 ms  |  Sample ticks: 400

**FPS**  avg `1592.62`, min `33.74`, p50 `1601.69`, p95 `2544.75`, p99 `2762.06`, 1%low `57.13`, 0.1%low `42.67`, std `601.39`

**Frame time (ms)**  avg `1.12`, p50 `0.62`, p95 `2.55`, p99 `15.17`, p99.9 `20.00`, max `29.64`

**Client tick (ms)**  avg `0.36`, p95 `0.56`, max `1.06`

**Memory**  start `2091 MB`, end `2472 MB`, peak `3356 MB`, GC `30 events / 265 ms`

**FPS over sampling window (ASCII):**

```
2313.7 |   █                                                                            
2195.3 | █ █                                                                            
2076.9 | ████  █ █                                                                      
1958.5 |█████  █ █ ███ ██  █                                                            
1840.0 |█████ ██ ██████████████                                                         
1721.6 |███████████████████████  ██ █ █ █ █                                             
1603.2 |███████████████████████████ ███████      █████                                  
1484.7 |█████████████████████████████████████████████████ █ █ █████  █                  
1366.3 |████████████████████████████████████████████████████████████████ █   █ █ █      
1247.9 |██████████████████████████████████████████████████████████████████████████  ████
1129.4 |███████████████████████████████████████████████████████████████████████████ ████
1011.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15371
   1 ms | ████  1512
   2 ms | █  235
   3 ms | █  231
   4 ms |   89
   5 ms |   29
   6 ms |   12
   7 ms |   1
   8 ms |   5
  11 ms |   1
  12 ms |   9
  13 ms |   105
  14 ms |   127
  15 ms |   72
  16 ms |   38
  17 ms |   23
  18 ms |   24
  19 ms |   16
  20 ms |   5
  21 ms |   2
  22 ms |   3
  23 ms |   2
  24 ms |   1
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `42.67`
- `part` = `1.00`
- `fps_harmonic_avg` = `896.28`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `57.13`
- `surface_water_ratio` = `0.06`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1082.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1903.92`, min `29.69`, p50 `2012.92`, p95 `2713.36`, p99 `2858.23`, 1%low `58.50`, 0.1%low `43.03`, std `640.90`

**Frame time (ms)**  avg `0.93`, p50 `0.50`, p95 `1.61`, p99 `14.89`, p99.9 `19.31`, max `33.68`

**Client tick (ms)**  avg `0.34`, p95 `0.54`, max `1.48`

**Memory**  start `3137 MB`, end `2537 MB`, peak `3689 MB`, GC `23 events / 234 ms`

**FPS over sampling window (ASCII):**

```
2380.2 |   █                                                                            
2297.6 |   █  █  █                                                                      
2215.0 |   █ ██  █                                                                      
2132.4 |█ ██ ███ ██  █   █ ██     █  ██ ██                                              
2049.8 |████████████ █  █████     █████ ██      █ █       █                             
1967.2 |████████████ █  █████   █ ████████      ███    █ ██    █ █  ██                  
1884.6 |███████████████████████ █ ████████      ███    █ ██    █ █  ███         █       
1802.0 |███████████████████████ ██████████  ██ ████  █ ████  ███████████     ██ ██ ██   
1719.4 |██████████████████████████████████  ███████████████  ███████████ █   ██ ███████ 
1636.8 |███████████████████████████████████ ███████████████ ████████████ ██ ███████████ 
1554.2 |███████████████████████████████████████████████████████████████████ ███████████ 
1471.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19105
   1 ms | ██  978
   2 ms |   202
   3 ms |   185
   4 ms |   63
   5 ms |   30
   6 ms |   7
   7 ms |   3
   8 ms |   1
   9 ms |   1
  11 ms |   1
  12 ms |   21
  13 ms |   109
  14 ms |   92
  15 ms |   79
  16 ms |   54
  17 ms |   24
  18 ms |   17
  19 ms |   10
  20 ms |   5
  21 ms |   3
  22 ms |   1
  23 ms |   1
  24 ms |   1
  25 ms |   3
  26 ms |   2
  29 ms |   1
  33 ms |   1
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `43.03`
- `part` = `1.00`
- `fps_harmonic_avg` = `1078.21`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `58.50`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `42.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `1834.95`, min `24.34`, p50 `1910.87`, p95 `2696.30`, p99 `2918.38`, 1%low `57.42`, 0.1%low `40.72`, std `631.83`

**Frame time (ms)**  avg `0.95`, p50 `0.52`, p95 `1.56`, p99 `15.34`, p99.9 `20.29`, max `41.08`

**Client tick (ms)**  avg `0.34`, p95 `0.48`, max `1.24`

**Memory**  start `2320 MB`, end `2786 MB`, peak `3805 MB`, GC `26 events / 245 ms`

**FPS over sampling window (ASCII):**

```
2420.2 | █                                                                              
2331.5 | ███ ██                                                                         
2242.8 | ████████ ██                                                                    
2154.1 |████████████      █                                                             
2065.4 |█████████████     █      █ █                                                    
1976.7 |█████████████    ██    █ █ █                                                    
1888.0 |█████████████ ██ ███   █████         █  █                          █            
1799.3 |█████████████████████  ██████  █   ███████     █ █    █ ███   █   ███     █  █ █
1710.6 |█████████████████████  ███████ █   ███████ █  ██████ ██████ █ █████████   █ ██ █
1621.9 |█████████████████████  ███████ █  ██████████  █████████████ ████████████████████
1533.2 |█████████████████████ ████████ █████████████ ██████████████ ████████████████████
1444.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18917
   1 ms | ███  1209
   2 ms |   180
   3 ms |   134
   4 ms |   62
   5 ms |   23
   6 ms |   6
   7 ms |   3
   8 ms |   1
  11 ms |   1
  12 ms |   34
  13 ms |   78
  14 ms |   68
  15 ms |   117
  16 ms |   64
  17 ms |   27
  18 ms |   13
  19 ms |   9
  20 ms |   5
  21 ms |   4
  22 ms |   5
  23 ms |   3
  24 ms |   1
  25 ms |   2
  28 ms |   1
  29 ms |   1
  35 ms |   1
  41 ms |   1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `40.72`
- `part` = `1.00`
- `fps_harmonic_avg` = `1048.66`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `57.42`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `56.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23661 ms  |  Sample ticks: 400

**FPS**  avg `1973.66`, min `27.47`, p50 `2089.27`, p95 `2786.24`, p99 `2896.30`, 1%low `58.58`, 0.1%low `41.99`, std `647.58`

**Frame time (ms)**  avg `0.88`, p50 `0.48`, p95 `1.37`, p99 `14.98`, p99.9 `20.06`, max `36.41`

**Client tick (ms)**  avg `0.37`, p95 `0.57`, max `8.27`

**Memory**  start `3329 MB`, end `4099 MB`, peak `4175 MB`, GC `20 events / 203 ms`

**FPS over sampling window (ASCII):**

```
2396.9 |        █             █                                                         
2306.3 | █     ████        █ ███                                                        
2215.6 | █████ ████ █  █ ███ ████ █ ██  █        █                                      
2124.9 | █████ ████ █  ██████████ ████ ██        █ █                                    
2034.2 |█████████████  ███████████████ ██████   ██ ██                                   
1943.6 |██████████████ ███████████████ ██████   ███████ █     █            █ █    █     
1852.9 |██████████████ ██████████████████████  ████████ ███  ███   █     █ ████ ███   █ 
1762.2 |█████████████████████████████████████  ██████████████████  ██  ███ █████████  ██
1671.5 |█████████████████████████████████████  ██████████████████ ██████████████████  ██
1580.9 |██████████████████████████████████████ ██████████████████ ██████████████████  ██
1490.2 |██████████████████████████████████████ ██████████████████ ██████████████████████
1399.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19241
   1 ms | ██  992
   2 ms |   152
   3 ms |   129
   4 ms |   44
   5 ms |   18
   6 ms |   8
   7 ms |   6
   8 ms |   5
   9 ms |   2
  12 ms |   37
  13 ms |   81
  14 ms |   78
  15 ms |   99
  16 ms |   37
  17 ms |   28
  18 ms |   12
  19 ms |   8
  20 ms |   6
  21 ms |   4
  22 ms |   3
  23 ms |   2
  24 ms |   4
  25 ms |   1
  28 ms |   1
  31 ms |   1
  36 ms |   1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `41.99`
- `part` = `1.00`
- `fps_harmonic_avg` = `1132.34`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `57.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `58.58`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `16.00`
- `entity_count_delta` = `-15.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `597.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24833 ms  |  Sample ticks: 400

**FPS**  avg `1899.33`, min `32.09`, p50 `1965.10`, p95 `2830.00`, p99 `2980.30`, 1%low `57.29`, 0.1%low `44.59`, std `676.78`

**Frame time (ms)**  avg `0.95`, p50 `0.51`, p95 `1.65`, p99 `15.36`, p99.9 `20.05`, max `31.16`

**Client tick (ms)**  avg `0.38`, p95 `0.54`, max `1.31`

**Memory**  start `2955 MB`, end `4047 MB`, peak `4264 MB`, GC `21 events / 215 ms`

**FPS over sampling window (ASCII):**

```
2470.4 |  ██     █ █                                                                    
2374.7 |█ ██    ████                                                                    
2279.0 |█████ █ █████       █     █  █                                                  
2183.3 |███████ █████  ███  █ ██ ██  █ █                                                
2087.6 |██████████████████  ███████  █ █  █                                             
1991.9 |██████████████████  █████████████ █   █                                         
1896.2 |██████████████████ ████████████████   █     █      █                            
1800.4 |██████████████████ ████████████████  ██ ██  █ ████ █  █ ██ ██    █              
1704.7 |███████████████████████████████████ ████████████████  ████ ████ ██ █            
1609.0 |███████████████████████████████████ ████████████████  ██████████████  █ █       
1513.3 |███████████████████████████████████ ███████████████████████████████████████████ 
1417.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18902
   1 ms | ███  1202
   2 ms |   192
   3 ms |   157
   4 ms |   70
   5 ms |   26
   6 ms |   8
   7 ms |   7
   8 ms |   3
  12 ms |   19
  13 ms |   96
  14 ms |   68
  15 ms |   97
  16 ms |   54
  17 ms |   36
  18 ms |   27
  19 ms |   14
  20 ms |   6
  21 ms |   9
  22 ms |   2
  23 ms |   2
  25 ms |   1
  26 ms |   1
  31 ms |   1
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `44.59`
- `part` = `1.00`
- `fps_harmonic_avg` = `1055.64`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `57.29`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `39.00`
- `entity_count_delta` = `-34.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `5.00`
- `preload_duration_ms` = `1797.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `1946.60`, min `26.06`, p50 `2047.77`, p95 `2751.58`, p99 `2900.68`, 1%low `55.37`, 0.1%low `38.95`, std `633.48`

**Frame time (ms)**  avg `0.91`, p50 `0.49`, p95 `1.40`, p99 `15.78`, p99.9 `20.91`, max `38.38`

**Client tick (ms)**  avg `0.36`, p95 `0.64`, max `3.30`

**Memory**  start `3152 MB`, end `2976 MB`, peak `4684 MB`, GC `21 events / 235 ms`

**FPS over sampling window (ASCII):**

```
2421.3 |        █                                                                       
2333.0 | █ █  █ █                                                                       
2244.6 | ████ █ ██             █                                                        
2156.3 | ██████████   █  █     ██████      █                                            
2068.0 | ███████████ ██ ██    ████████    ██   █          █                             
1979.7 |████████████ █████    ████████    ██  ███    ███ ██   ██ ██                     
1891.3 |███████████████████  ██████████ █ ███████   ████████████████  █   █  █ █        
1803.0 |███████████████████  ████████████████████   ████████████████  ███ █  ███ █   ███
1714.7 |█████████████████████████████████████████ █ ████████████████  ███ ██ ███ █  ████
1626.4 |█████████████████████████████████████████ ██████████████████ █████████████ █████
1538.0 |██████████████████████████████████████████████████████████████████████████ █████
1449.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19274
   1 ms | ██  922
   2 ms |   166
   3 ms |   134
   4 ms |   57
   5 ms |   17
   6 ms |   9
   7 ms |   2
   8 ms |   2
   9 ms |   1
  10 ms |   1
  11 ms |   1
  12 ms |   8
  13 ms |   75
  14 ms |   59
  15 ms |   90
  16 ms |   74
  17 ms |   42
  18 ms |   21
  19 ms |   17
  20 ms |   7
  21 ms |   4
  22 ms |   5
  23 ms |   1
  24 ms |   2
  25 ms |   1
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   2
  36 ms |   1
  38 ms |   1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `38.95`
- `part` = `1.00`
- `fps_harmonic_avg` = `1097.85`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `55.37`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `30.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24950 ms  |  Sample ticks: 400

**FPS**  avg `1754.96`, min `33.49`, p50 `1798.14`, p95 `2733.55`, p99 `2949.03`, 1%low `54.56`, 0.1%low `41.23`, std `672.64`

**Frame time (ms)**  avg `1.05`, p50 `0.56`, p95 `1.86`, p99 `15.90`, p99.9 `21.84`, max `29.86`

**Client tick (ms)**  avg `0.37`, p95 `0.57`, max `1.77`

**Memory**  start `3394 MB`, end `4187 MB`, peak `4860 MB`, GC `21 events / 233 ms`

**FPS over sampling window (ASCII):**

```
2532.7 |     █                                                                          
2414.2 |███  █                                                                          
2295.7 |███████ █                                                                       
2177.2 |███████████ █ █                                                                 
2058.7 |███████████████    █                                                            
1940.2 |███████████████    █   ███ █    █    █                                          
1821.7 |██████████████████ █████████ ██ █  █ █    █                                     
1703.2 |██████████████████ ████████████ ██ ███    █   █ █  █          █ █ █    █   █    
1584.7 |███████████████████████████████████████   ██████████ ██   ███████ ██   █ █ █ ██ 
1466.2 |███████████████████████████████████████ ███████████████  ████████████ ██████ ███
1347.7 |████████████████████████████████████████████████████████ ████████████ ██████ ███
1229.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16543
   1 ms | ████  1618
   2 ms |   197
   3 ms |   133
   4 ms |   72
   5 ms |   27
   6 ms |   4
   7 ms |   5
   8 ms |   4
   9 ms |   3
  10 ms |   2
  11 ms |   1
  12 ms |   6
  13 ms |   68
  14 ms |   74
  15 ms |   110
  16 ms |   67
  17 ms |   34
  18 ms |   20
  19 ms |   21
  20 ms |   9
  21 ms |   9
  22 ms |   7
  23 ms |   3
  24 ms |   4
  25 ms |   2
  26 ms |   1
  27 ms |   1
  29 ms |   1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `41.23`
- `part` = `1.00`
- `fps_harmonic_avg` = `952.30`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `54.56`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-4.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1909.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `1729.90`, min `24.97`, p50 `1769.38`, p95 `2630.61`, p99 `2848.07`, 1%low `55.05`, 0.1%low `38.03`, std `618.81`

**Frame time (ms)**  avg `1.03`, p50 `0.57`, p95 `1.86`, p99 `15.70`, p99.9 `21.07`, max `40.05`

**Client tick (ms)**  avg `0.45`, p95 `0.62`, max `5.81`

**Memory**  start `3112 MB`, end `4218 MB`, peak `4989 MB`, GC `23 events / 230 ms`

**FPS over sampling window (ASCII):**

```
2248.3 |   █    █                                                                       
2162.5 |  ██  █ █  █                                                                    
2076.6 | ████████ ██                                                                    
1990.7 | ███████████                                                               █    
1904.9 | ████████████ █  ██                                           █       █    █    
1819.0 | ███████████████ ████                                    █    █ █ █ ████   █   █
1733.2 | █████████████████████   █                          █ █████   █ █ ██████   ██ ██
1647.3 |██████████████████████ █ ██    █                  █ ███████████ █████████  ██ ██
1561.4 |████████████████████████ █████ █ ████████  ███ ██████████████████████████ ██████
1475.6 |██████████████████████████████████████████ ██████████████████████████████ ██████
1389.7 |██████████████████████████████████████████ █████████████████████████████████████
1303.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17144
   1 ms | ███  1262
   2 ms | █  221
   3 ms |   135
   4 ms |   80
   5 ms |   32
   6 ms |   10
   7 ms |   9
   8 ms |   4
   9 ms |   2
  12 ms |   12
  13 ms |   68
  14 ms |   91
  15 ms |   89
  16 ms |   62
  17 ms |   50
  18 ms |   19
  19 ms |   10
  20 ms |   8
  21 ms |   4
  22 ms |   2
  23 ms |   4
  24 ms |   1
  26 ms |   3
  28 ms |   2
  29 ms |   1
  30 ms |   1
  36 ms |   1
  40 ms |   1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `38.03`
- `part` = `1.00`
- `fps_harmonic_avg` = `966.74`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `55.05`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `28.00`
- `entity_count_delta` = `-25.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `50.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1957.63`, min `31.03`, p50 `2049.96`, p95 `2811.94`, p99 `2940.95`, 1%low `59.29`, 0.1%low `44.29`, std `662.45`

**Frame time (ms)**  avg `0.90`, p50 `0.49`, p95 `1.54`, p99 `14.76`, p99.9 `19.36`, max `32.23`

**Client tick (ms)**  avg `0.31`, p95 `0.42`, max `2.52`

**Memory**  start `5073 MB`, end `4257 MB`, peak `5331 MB`, GC `19 events / 209 ms`

**FPS over sampling window (ASCII):**

```
2448.9 |            █  █                                                                
2350.2 |█   █      ██  █       █                                                        
2251.5 |██ ███  █  ██  █   ██  █                                                        
2152.7 |██████ ██████  █   ███ ██     █  █                                              
2054.0 |██████████████ ██████████    █████ ███      █ █                                 
1955.3 |█████████████████████████    █████ █████  █████████  █   ███                    
1856.6 |█████████████████████████   ███████████████████████  █████████ █ █ █ ██     █   
1757.8 |███████████████████████████ ███████████████████████  ███████████████████   ██   
1659.1 |███████████████████████████████████████████████████  ███████████████████   ██  █
1560.4 |█████████████████████████████████████████████████████████████████████████ ██████
1461.7 |█████████████████████████████████████████████████████████████████████████ ██████
1362.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19189
   1 ms | ██  905
   2 ms |   179
   3 ms |   218
   4 ms |   58
   5 ms |   29
   6 ms |   9
   7 ms |   1
   8 ms |   2
   9 ms |   2
  12 ms |   2
  13 ms |   82
  14 ms |   149
  15 ms |   64
  16 ms |   43
  17 ms |   23
  18 ms |   19
  19 ms |   11
  20 ms |   2
  21 ms |   4
  22 ms |   2
  23 ms |   3
  24 ms |   1
  28 ms |   1
  30 ms |   1
  32 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `44.29`
- `part` = `1.00`
- `fps_harmonic_avg` = `1105.60`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `59.29`
- `surface_water_ratio` = `0.10`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `43.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1754.31`, min `24.83`, p50 `1775.74`, p95 `2680.64`, p99 `2871.69`, 1%low `54.34`, 0.1%low `39.36`, std `623.12`

**Frame time (ms)**  avg `1.02`, p50 `0.56`, p95 `1.65`, p99 `16.05`, p99.9 `21.46`, max `40.28`

**Client tick (ms)**  avg `0.35`, p95 `0.55`, max `4.50`

**Memory**  start `3319 MB`, end `4529 MB`, peak `5445 MB`, GC `19 events / 204 ms`

**FPS over sampling window (ASCII):**

```
2434.9 |  █                                                                             
2337.2 |  █ █                                                                           
2239.5 |  █████                                                                         
2141.9 | ██████      █    █  █                                                          
2044.2 | ██████  █  ███████████                                                         
1946.5 | ██████ ███████████████  █    ██ █                                              
1848.8 | ██████████████████████  █    ██████ ██                                         
1751.1 | ██████████████████████ ██    ████████████                                      
1653.4 |███████████████████████████ ██████████████  █ █             █  █      █ █    █  
1555.8 |███████████████████████████ ███████████████████  ███████████████     █████ █ █ █
1458.1 |███████████████████████████████████████████████ ███████████████████  █████ █ ███
1360.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17552
   1 ms | ███  1219
   2 ms |   193
   3 ms |   131
   4 ms |   42
   5 ms |   27
   6 ms |   12
   7 ms |   5
   8 ms |   1
   9 ms |   1
  10 ms |   1
  12 ms |   1
  13 ms |   60
  14 ms |   70
  15 ms |   104
  16 ms |   74
  17 ms |   47
  18 ms |   29
  19 ms |   22
  20 ms |   5
  21 ms |   5
  22 ms |   6
  23 ms |   2
  24 ms |   3
  25 ms |   2
  26 ms |   1
  29 ms |   1
  31 ms |   1
  32 ms |   1
  40 ms |   1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `39.36`
- `part` = `1.00`
- `fps_harmonic_avg` = `980.93`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `54.34`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `43.00`
- `entity_count_delta` = `-42.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `63.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `1986.00`, min `28.02`, p50 `2121.63`, p95 `2762.69`, p99 `2865.29`, 1%low `55.33`, 0.1%low `40.17`, std `643.46`

**Frame time (ms)**  avg `0.90`, p50 `0.47`, p95 `1.41`, p99 `15.34`, p99.9 `20.94`, max `35.69`

**Client tick (ms)**  avg `0.32`, p95 `0.47`, max `0.67`

**Memory**  start `5192 MB`, end `4323 MB`, peak `5657 MB`, GC `19 events / 212 ms`

**FPS over sampling window (ASCII):**

```
2334.2 |     █                                                                          
2256.6 |██  ██ █      █     █       █        █                                          
2178.9 |██  ████   █  █    ██  █    █        █   █                 █                    
2101.3 |████████ ███  ██   ██ ███   █████  █ █ █ ██ █   █          █                    
2023.6 |████████████ █████ ██ ███   █████  █████ ████   █     █  █ █   █    █           
1946.0 |████████████ ████████ ███   █████ █████████████ ██    █ █████  █ █  █ ██        
1868.3 |█████████████████████ █████ ███████████████████████   █ █████ ██ ██ █ ██    █   
1790.7 |███████████████████████████ ███████████████████████  ██ █████████████ ██   ███ █
1713.0 |███████████████████████████████████████████████████ █████████████████ ███  ███ █
1635.4 |███████████████████████████████████████████████████ ██████████████████████ ███ █
1557.7 |██████████████████████████████████████████████████████████████████████████ ███ █
1480.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19315
   1 ms | ██  849
   2 ms |   167
   3 ms |   164
   4 ms |   68
   5 ms |   20
   6 ms |   5
   7 ms |   4
   8 ms |   2
  10 ms |   2
  13 ms |   65
  14 ms |   110
  15 ms |   47
  16 ms |   72
  17 ms |   39
  18 ms |   25
  19 ms |   15
  20 ms |   10
  21 ms |   7
  22 ms |   5
  23 ms |   3
  26 ms |   1
  29 ms |   2
  34 ms |   2
  35 ms |   1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `40.17`
- `part` = `1.00`
- `fps_harmonic_avg` = `1112.81`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `55.33`
- `surface_water_ratio` = `0.01`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `7.00`
- `entity_count_delta` = `8.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `15.00`
- `preload_duration_ms` = `63.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1472.50`, min `19.77`, p50 `1605.35`, p95 `1966.20`, p99 `2360.02`, 1%low `40.67`, 0.1%low `27.49`, std `477.50`

**Frame time (ms)**  avg `1.35`, p50 `0.62`, p95 `3.06`, p99 `21.06`, p99.9 `27.98`, max `50.59`

**Client tick (ms)**  avg `0.44`, p95 `1.04`, max `3.58`

**Memory**  start `4719 MB`, end `5121 MB`, peak `5893 MB`, GC `41 events / 557 ms`

**FPS over sampling window (ASCII):**

```
1733.6 |                    █                                                           
1690.5 |                    █                                                           
1647.3 |                    █             █        █                                    
1604.1 |                    █   █        ██        █ █  █        █ █            █       
1560.9 |           █ █      █ █ █        ██        █ █  ██       █ █        ██  █       
1517.7 |       ███████  █   █ ███       ███ █      █ █  ██     ███ ██      ██████     ██
1474.5 |  █  █ ███████  █   █████    █  ███ ██     ███  ██     ███████   █ ██████   █ ██
1431.3 |████ █ ███████████ ███████ █ █ ███████ ██  ███████ █ █ ████████  ████████   █ ██
1388.1 |████ █████████████ █████████ ████████████ ████████ ███ █████████ ████████ ███ ██
1344.9 |████ █████████████████████████████████████████████ █████████████ ███████████████
1301.7 |████ █████████████████████████████████████████████ █████████████████████████████
1258.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12743
   1 ms | ████  1202
   2 ms | █  174
   3 ms |   82
   4 ms |   101
   5 ms |   98
   6 ms |   53
   7 ms |   13
   8 ms |   7
   9 ms |   4
  11 ms |   1
  13 ms |   1
  14 ms |   3
  15 ms |   11
  16 ms |   30
  17 ms |   47
  18 ms |   61
  19 ms |   42
  20 ms |   42
  21 ms |   39
  22 ms |   30
  23 ms |   28
  24 ms |   21
  25 ms |   13
  26 ms |   4
  27 ms |   3
  28 ms |   2
  29 ms |   2
  30 ms |   1
  31 ms |   1
  34 ms |   1
  35 ms |   1
  36 ms |   1
  38 ms |   1
  41 ms |   1
  42 ms |   1
  44 ms |   1
  45 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `743.40`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `27.49`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `51.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `40.67`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `141.45`, min `13.72`, p50 `168.77`, p95 `218.60`, p99 `255.63`, 1%low `19.66`, 0.1%low `14.74`, std `67.70`

**Frame time (ms)**  avg `11.04`, p50 `5.93`, p95 `30.12`, p99 `44.96`, p99.9 `58.27`, max `72.90`

**Client tick (ms)**  avg `7.07`, p95 `15.87`, max `37.61`

**Memory**  start `5762 MB`, end `5489 MB`, peak `5905 MB`, GC `36 events / 525 ms`

**FPS over sampling window (ASCII):**

```
175.9 |                                                     █                          
169.2 |                                            █        █            █             
162.6 |                         █            █   ███        █        █   █             
156.0 | ██    █                ██           ████ ███  █     █  █     █ ████            
149.3 |████   █   █            ██ ███    █  █████████ █  █  ██ ██    █ ████ ███  █    █
142.7 |████   █████       █   ███ ███    ██ █████████ █  ██ ██ ███ █ █ ████ ████ █ █  █
136.0 |█████  █████       █   ███████ ██ ██ █████████ █ ██████ ███ █ ██████ ████ █ █ ██
129.4 |██████ █████       █ █████████ ██ ████████████ █ ██████████ █████████████ █ █ ██
122.7 |██████ ███████     █ █████████ █████████████████ ███████████████████████████████
116.1 |██████ ███████  █  █████████████████████████████ ███████████████████████████████
109.5 |████████████████████████████████████████████████ ███████████████████████████████
102.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   4
   3 ms | █  18
   4 ms | ████████████████████████  339
   5 ms | ████████████████████████████████████████  563
   6 ms | ██████████  139
   7 ms | █████  76
   8 ms | ████  56
   9 ms | █████  70
  10 ms | ████  50
  11 ms | ██  24
  12 ms | ██  22
  13 ms | █  9
  14 ms | █  8
  15 ms |   6
  16 ms | █  10
  17 ms | █  11
  18 ms | ██  26
  19 ms | ██  29
  20 ms | ███  38
  21 ms | ██  29
  22 ms | ███  36
  23 ms | ███  36
  24 ms | ██  26
  25 ms | █  15
  26 ms | ██  29
  27 ms | ██  22
  28 ms | █  13
  29 ms | █  14
  30 ms | █  11
  31 ms | █  14
  32 ms |   3
  33 ms |   3
  34 ms |   7
  35 ms |   3
  36 ms |   4
  37 ms |   6
  38 ms |   2
  39 ms |   5
  40 ms |   2
  41 ms |   5
  42 ms |   2
  43 ms |   3
  44 ms |   5
  45 ms |   4
  46 ms |   2
  47 ms |   3
  48 ms |   3
  49 ms |   1
  54 ms |   1
  55 ms |   1
  57 ms |   1
  62 ms |   1
  72 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `14.74`
- `fps_1pct_low` = `19.66`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `26.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `90.59`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `1382.55`, min `21.88`, p50 `1490.34`, p95 `1866.47`, p99 `2146.38`, 1%low `42.09`, 0.1%low `29.93`, std `436.21`

**Frame time (ms)**  avg `1.38`, p50 `0.67`, p95 `2.64`, p99 `20.72`, p99.9 `27.75`, max `45.69`

**Client tick (ms)**  avg `0.42`, p95 `0.77`, max `3.96`

**Memory**  start `4813 MB`, end `3684 MB`, peak `5905 MB`, GC `42 events / 572 ms`

**FPS over sampling window (ASCII):**

```
1720.6 |                                  █                                             
1669.7 |                                  █                                             
1618.8 |                                █ █ █                                           
1567.8 |                                █ █ █         █                                 
1516.9 |                                █ ███         █  █                              
1466.0 |   █  █  ███        ██   █      █████        ██  █       ██ ██                  
1415.1 |█ ██  █  █████ ███████████    ███████        ██  █    █ ██████    █       █   ██
1364.2 |████ ██████████████████████   ███████      ████ ██ █ █████████    █  ██   ██ ███
1313.3 |████ ███████████████████████ ████████      ███████ █████████████  █  ███  ██████
1262.4 |████████████████████████████ ███████████ █ █████████████████████ ███ ███ ███████
1211.5 |██████████████████████████████████████████ █████████████████████████ ███████████
1160.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12244
   1 ms | ████  1332
   2 ms | █  178
   3 ms |   64
   4 ms |   81
   5 ms |   92
   6 ms |   36
   7 ms |   7
   8 ms |   1
   9 ms |   2
  12 ms |   1
  13 ms |   1
  14 ms |   2
  15 ms |   8
  16 ms |   20
  17 ms |   59
  18 ms |   72
  19 ms |   58
  20 ms |   44
  21 ms |   45
  22 ms |   34
  23 ms |   21
  24 ms |   13
  25 ms |   2
  26 ms |   6
  27 ms |   3
  28 ms |   4
  29 ms |   3
  31 ms |   1
  33 ms |   1
  35 ms |   1
  37 ms |   2
  45 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `29.93`
- `part` = `1.00`
- `fps_harmonic_avg` = `722.55`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `42.09`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `43.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `1349.62`, min `19.49`, p50 `1459.55`, p95 `1855.24`, p99 `2234.27`, 1%low `38.63`, 0.1%low `23.68`, std `456.67`

**Frame time (ms)**  avg `1.47`, p50 `0.69`, p95 `3.52`, p99 `21.86`, p99.9 `30.16`, max `51.32`

**Client tick (ms)**  avg `0.47`, p95 `0.63`, max `6.22`

**Memory**  start `5646 MB`, end `3775 MB`, peak `5905 MB`, GC `39 events / 591 ms`

**FPS over sampling window (ASCII):**

```
1570.4 |                                      █                                         
1529.1 |  █                           █       █            █                            
1487.7 |  ██          █               █       █            █                            
1446.4 |████   █     ██   █      █    █      ██    █      ██            ██ █            
1405.0 |████   █     ██ ███    █ █    ███    ██  ███      ███ █         ████      ██    
1363.7 |████ ███    ███████    █ █ ██████   ████ ████     ███ ██        █████     ██ █  
1322.3 |████████   ████████   ██ █ ██████   ████ █████ █  ███ ███    █ ██████ ███ ██ ██ 
1281.0 |██████████ █████████ █████████████  █████████████ ███████    ████████ █████████ 
1239.6 |████████████████████ █████████████  █████████████ ███████ █  ██████████████████ 
1198.3 |████████████████████ █████████████ ██████████████ █████████ ████████████████████
1156.9 |████████████████████ ██████████████████████████████████████ ████████████████████
1115.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11212
   1 ms | █████  1408
   2 ms | █  246
   3 ms |   98
   4 ms |   100
   5 ms |   81
   6 ms |   48
   7 ms |   14
   8 ms |   4
   9 ms |   3
  10 ms |   1
  12 ms |   1
  13 ms |   1
  14 ms |   1
  15 ms |   5
  16 ms |   20
  17 ms |   46
  18 ms |   56
  19 ms |   54
  20 ms |   34
  21 ms |   37
  22 ms |   36
  23 ms |   32
  24 ms |   17
  25 ms |   14
  26 ms |   11
  27 ms |   3
  29 ms |   3
  30 ms |   2
  33 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms |   1
  42 ms |   1
  43 ms |   3
  45 ms |   1
  47 ms |   1
  48 ms |   2
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `43.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `23.68`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `680.06`
- `fps_1pct_low` = `38.63`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `1262.70`, min `21.12`, p50 `1369.47`, p95 `1686.00`, p99 `1963.73`, 1%low `40.76`, 0.1%low `28.74`, std `397.38`

**Frame time (ms)**  avg `1.49`, p50 `0.73`, p95 `3.27`, p99 `21.47`, p99.9 `27.38`, max `47.36`

**Client tick (ms)**  avg `0.42`, p95 `0.65`, max `5.46`

**Memory**  start `3807 MB`, end `5163 MB`, peak `5899 MB`, GC `41 events / 559 ms`

**FPS over sampling window (ASCII):**

```
1576.3 |   █                                                                            
1529.9 |   █                                                                            
1483.4 |   █                                                                            
1437.0 |   █ █                                                                   █      
1390.5 |   █ █                             █ ██                      ██          █      
1344.1 | █ ███     █  ███      ██  █       █ ████       █   █    ██  ██          ██     
1297.6 |██ ███     █ ████      ██  █       ██████      ██ ███    ███████       █ ██     
1251.2 |██ ███     ██████     ██████    ██ ███████  █████ ████   ███████    ██ █████    
1204.7 |██████ █  ████████   ████████  █████████████████████████ ████████  ███ ██████   
1158.3 |█████████ █████████ ██████████ ██████████████████████████████████  █████████████
1111.8 |██████████████████████████████████████████████████████████████████ █████████████
1065.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10981
   1 ms | █████  1503
   2 ms | █  211
   3 ms |   78
   4 ms |   91
   5 ms |   65
   6 ms |   41
   7 ms |   9
   8 ms |   6
  10 ms |   2
  12 ms |   1
  13 ms |   1
  14 ms |   4
  15 ms |   10
  16 ms |   28
  17 ms |   40
  18 ms |   59
  19 ms |   57
  20 ms |   41
  21 ms |   44
  22 ms |   33
  23 ms |   29
  24 ms |   18
  25 ms |   8
  26 ms |   8
  27 ms |   2
  28 ms |   1
  30 ms |   3
  31 ms |   1
  32 ms |   4
  35 ms |   1
  41 ms |   1
  46 ms |   1
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `58.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `28.74`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `668.99`
- `restocks` = `20.00`
- `fps_1pct_low` = `40.76`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `1061.63`, min `16.88`, p50 `1146.87`, p95 `1481.82`, p99 `1950.75`, 1%low `39.00`, 0.1%low `25.64`, std `375.10`

**Frame time (ms)**  avg `1.79`, p50 `0.87`, p95 `4.82`, p99 `22.23`, p99.9 `28.65`, max `59.23`

**Client tick (ms)**  avg `0.54`, p95 `1.20`, max `4.07`

**Memory**  start `3274 MB`, end `4915 MB`, peak `5965 MB`, GC `37 events / 537 ms`

**FPS over sampling window (ASCII):**

```
1558.5 |                                 █                                              
1497.2 |                                 █                                              
1435.8 |                                 █                                              
1374.5 |                                 █                                              
1313.1 |                                 █                                              
1251.8 |     █                    █   ██ █                                          █   
1190.4 |     █                    ██  ██ █             █       █ █                  █   
1129.0 |    ██        ██          ██ ██████   ██       █   █   ███        █         █   
1067.7 |  ██████    ████      █ █ ██ ██████   ███████  ██████ ████ █  █   ██ █      ████
1006.3 |████████ █  ████ ██ █ █ ████████████  ████████████████████ █  ████████   █ █████
945.0 |████████ ███████████████████████████████████████████████████████████████ ███████
883.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7662
   1 ms | █████████████  2440
   2 ms | ██  333
   3 ms | █  98
   4 ms | █  117
   5 ms |   87
   6 ms |   47
   7 ms |   14
   8 ms |   7
   9 ms |   3
  10 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   1
  14 ms |   2
  15 ms |   7
  16 ms |   29
  17 ms |   44
  18 ms |   59
  19 ms |   57
  20 ms |   41
  21 ms |   26
  22 ms |   36
  23 ms |   27
  24 ms |   15
  25 ms |   17
  26 ms |   9
  27 ms |   2
  28 ms |   4
  29 ms |   1
  31 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   2
  39 ms |   1
  49 ms |   1
  56 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `25.64`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `559.84`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1088.00`
- `fps_1pct_low` = `39.00`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `51.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 6059 ms  |  Sample ticks: 0

**FPS**  avg `0.00`, min `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, 1%low `0.00`, 0.1%low `0.00`, std `0.00`

**Frame time (ms)**  avg `0.00`, p50 `0.00`, p95 `0.00`, p99 `0.00`, p99.9 `0.00`, max `0.00`

**Client tick (ms)**  avg `0.00`, p95 `0.00`, max `0.00`

**Memory**  start `0 MB`, end `0 MB`, peak `0 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
(no frames)
```

**Frame-time histogram (ms bucket → count):**

```
(no frames)
```

**Extras:**

- `aborted_state` = `WARMUP`
- `part_label` = `LowEnd Shader`
- `fail_reason` = `user pressed Shift+ESC`
- `status` = `failed`
- `part` = `2.00`

