# MC Benchmark Core session — 2026-10-02T13:29:53.579590749+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1358.0 | 44.2 | 26.8 | 18.76 | 1.24 | 60 | 1570 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 927.9 | 39.8 | 24.5 | 20.29 | 1.28 | 84 | 893 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 758.2 | 42.0 | 28.4 | 20.01 | 1.12 | 100 | 963 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 514.4 | 38.4 | 28.6 | 22.31 | 1.21 | 91 | 223 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 923.6 | 44.4 | 27.7 | 18.93 | 1.14 | 61 | 1905 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 933.7 | 45.2 | 30.4 | 19.14 | 0.76 | 52 | 1217 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 778.2 | 42.7 | 27.5 | 20.07 | 1.32 | 83 | 417 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 381.4 | 37.0 | 25.3 | 22.66 | 1.62 | 49 | 2769 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1159.3 | 38.7 | 24.4 | 20.83 | 4.99 | 53 | 1670 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 248.6 | 32.4 | 20.2 | 25.80 | 5.02 | 29 | 682 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 558.2 | 35.1 | 22.0 | 22.75 | 1.53 | 86 | 342 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 598.7 | 40.5 | 26.7 | 20.88 | 0.80 | 46 | 1009 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 746.0 | 35.5 | 23.5 | 21.98 | 5.41 | 45 | 1354 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 829.6 | 35.4 | 19.5 | 20.89 | 4.37 | 37 | 1343 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1310.1 | 13.4 | 8.9 | 52.13 | 19.95 | 13 | 792 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1389.6 | 10.2 | 7.5 | 72.80 | 20.30 | 24 | 1409 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1426.7 | 41.4 | 25.1 | 19.79 | 3.00 | 45 | 2434 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1422.1 | 40.4 | 27.0 | 20.92 | 3.02 | 47 | 2033 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 739.4 | 38.1 | 22.2 | 20.36 | 1.07 | 42 | 1046 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 2039.4 | 47.6 | 31.3 | 17.99 | 0.43 | 43 | 1402 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1957.8 | 49.5 | 34.3 | 17.57 | 0.40 | 35 | 1917 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1707.6 | 41.7 | 24.3 | 19.91 | 0.58 | 36 | 2459 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1735.4 | 46.2 | 28.8 | 18.37 | 0.54 | 41 | 1399 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 720.5 | 45.2 | 30.1 | 18.99 | 0.45 | 16 | 1265 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 714.3 | 47.0 | 30.5 | 18.20 | 0.49 | 16 | 564 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 828.1 | 49.1 | 32.4 | 17.31 | 0.35 | 15 | 2247 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 755.6 | 47.3 | 36.2 | 18.69 | 0.42 | 15 | 645 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 778.4 | 48.1 | 36.3 | 17.92 | 0.48 | 14 | 2817 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 713.1 | 45.9 | 31.5 | 18.87 | 0.50 | 13 | 1825 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 781.6 | 49.2 | 33.6 | 17.74 | 0.41 | 11 | 1550 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 710.5 | 46.8 | 33.1 | 18.90 | 0.37 | 10 | 2712 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 713.3 | 45.9 | 31.4 | 19.07 | 0.49 | 11 | 1896 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 792.4 | 50.1 | 35.9 | 17.76 | 0.32 | 10 | 2004 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 741.5 | 46.7 | 28.7 | 18.36 | 0.40 | 14 | 1866 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 789.7 | 47.8 | 32.3 | 18.12 | 0.40 | 14 | 945 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 2135.3 | 39.8 | 20.2 | 18.83 | 0.55 | 23 | 1020 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 187.6 | 2.1 | 0.9 | 308.27 | 9.36 | 10 | 1330 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 2014.3 | 30.7 | 8.7 | 19.52 | 0.59 | 21 | 3402 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1498.6 | 154.6 | 44.4 | 3.65 | 0.42 | 26 | 1260 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1414.9 | 172.8 | 45.9 | 2.75 | 0.41 | 28 | 654 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1239.5 | 172.0 | 40.5 | 2.52 | 0.39 | 29 | 2747 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 242.5 | 29.2 | 6.6 | 14.02 | 0.96 | 160 | 3429 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 246.5 | 120.3 | 49.2 | 6.64 | 0.65 | 30 | 1714 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 114.5 | 65.9 | 22.6 | 11.48 | 0.66 | 25 | 1648 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 86.4 | 56.8 | 30.8 | 15.50 | 0.65 | 20 | 3513 |

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

Category: **Particles**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `1357.99`, min `19.69`, p50 `1421.96`, p95 `2155.41`, p99 `2421.27`, 1%low `44.23`, 0.1%low `26.76`, std `533.77`

**Frame time (ms)**  avg `1.43`, p50 `0.70`, p95 `3.44`, p99 `18.76`, p99.9 `29.80`, max `50.79`

**Client tick (ms)**  avg `1.24`, p95 `3.12`, max `14.60`

**Memory**  start `1261 MB`, end `1195 MB`, peak `2831 MB`, GC `60 events / 628 ms`

**FPS over sampling window (ASCII):**

```
2044.3 |                                                                  ██            
1924.9 |                                                               ██ ██ ██         
1805.5 |                                                           █  ██████████        
1686.1 |                                              █       ███████ ██████████        
1566.7 |                                           ████ █ █   ███████████████████       
1447.3 |                                    █   █ ███████ ██  ███████████████████       
1327.9 |                 █     █   █  █ ██ █████████████████ ███████████████████████ █ █
1208.5 |              █ ██    ███ ███ ██████████████████████████████████████████████████
1089.1 |      █   █ ████████████████████████████████████████████████████████████████████
969.7 | █ ██ █ ████████████████████████████████████████████████████████████████████████
850.2 | █ ██ ██████████████████████████████████████████████████████████████████████████
730.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11128
   1 ms | ██████  1596
   2 ms | ██  455
   3 ms | █  246
   4 ms |   117
   5 ms |   42
   6 ms |   22
   7 ms |   17
   8 ms |   4
   9 ms |   6
  10 ms |   2
  11 ms |   2
  12 ms |   2
  13 ms |   3
  14 ms |   7
  15 ms |   26
  16 ms |   70
  17 ms |   82
  18 ms |   67
  19 ms |   41
  20 ms |   26
  21 ms |   27
  22 ms |   7
  23 ms |   3
  24 ms |   3
  25 ms |   3
  26 ms |   1
  28 ms |   2
  29 ms |   2
  30 ms |   4
  31 ms |   1
  32 ms |   2
  35 ms |   1
  38 ms |   1
  40 ms |   1
  42 ms |   1
  48 ms |   2
  50 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 1752 | 888.8 | 20.02 |
| `smoke` | 160 | 1752 | 1139.3 | 17.92 |
| `sculk_charge_pop` | 240 | 1752 | 1188.7 | 18.66 |
| `ALL_TOGETHER` | 1680 | 1752 | 1338.1 | 18.76 |
| `portal` | 160 | 1752 | 1477.5 | 18.74 |
| `end_rod` | 240 | 1752 | 1561.9 | 18.23 |
| `dragon_breath` | 160 | 1752 | 1836.4 | 18.03 |
| `dripping_water` | 240 | 1752 | 1432.7 | 17.99 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `44.23`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `26.76`
- `fps_harmonic_avg` = `701.23`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `35.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `927.93`, min `20.91`, p50 `1013.95`, p95 `1276.83`, p99 `1520.49`, 1%low `39.78`, 0.1%low `24.50`, std `325.26`

**Frame time (ms)**  avg `1.94`, p50 `0.99`, p95 `4.85`, p99 `20.29`, p99.9 `33.53`, max `47.84`

**Client tick (ms)**  avg `1.28`, p95 `2.63`, max `11.32`

**Memory**  start `1253 MB`, end `1136 MB`, peak `2147 MB`, GC `84 events / 744 ms`

**FPS over sampling window (ASCII):**

```
1106.2 |                                        █    █                              █   
1061.6 |           █              █  █          █    █         █                    ██  
1017.0 |         █ █    █         █ ██  █ █   ███    █         ██ █        █        ███ 
972.4 |      █  █ ██ █ █         ████  █ █   ███   ██    █  ████ █    █ █ █   █   █████
927.8 |      █ ██ ██████  █   ███████ ████   ███   █████ █  ████ ████ █████ ███████████
883.2 |     ████████████  ██ ████████ █████ ████ ██████████ ████ ████ █████████████████
838.6 |     █████████████ ██ ██████████████ ████ ████████████████████ █████████████████
794.0 |███  █████████████ ██████████████████████ ████████████████████ █████████████████
749.4 |████ █████████████ ███████████████████████████████████████████ █████████████████
704.8 |████ ███████████████████████████████████████████████████████████████████████████
660.2 |████ ███████████████████████████████████████████████████████████████████████████
615.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5359
   1 ms | ███████████████████████████  3643
   2 ms | ████  476
   3 ms | ██  216
   4 ms | █  131
   5 ms |   56
   6 ms |   25
   7 ms |   12
   8 ms |   6
   9 ms |   5
  10 ms |   5
  11 ms |   6
  12 ms |   2
  13 ms |   5
  14 ms |   6
  15 ms |   16
  16 ms |   34
  17 ms | █  88
  18 ms |   63
  19 ms |   54
  20 ms |   29
  21 ms |   23
  22 ms |   16
  23 ms |   9
  24 ms |   8
  25 ms |   6
  26 ms |   2
  27 ms |   2
  28 ms |   2
  29 ms |   4
  30 ms |   1
  31 ms |   1
  33 ms |   4
  35 ms |   1
  39 ms |   2
  41 ms |   1
  42 ms |   1
  46 ms |   1
  47 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `39.78`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `54.00`
- `fps_harmonic_avg` = `516.23`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `24.50`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `758.23`, min `18.59`, p50 `833.50`, p95 `1012.24`, p99 `1218.51`, 1%low `41.97`, 0.1%low `28.38`, std `253.81`

**Frame time (ms)**  avg `2.25`, p50 `1.20`, p95 `6.57`, p99 `20.01`, p99.9 `29.25`, max `53.80`

**Client tick (ms)**  avg `1.12`, p95 `1.75`, max `7.76`

**Memory**  start `1115 MB`, end `1722 MB`, peak `2078 MB`, GC `100 events / 724 ms`

**FPS over sampling window (ASCII):**

```
874.2 |                                 █                                         █    
845.2 | █       ██           ██    █  █ █   █          █             █     █      ████ 
816.3 | █ █     ███          ██  █ █  ███   █          █            ██     █ █ █  ████ 
787.3 | █ █     ███     █    ██  █ █  ███   █        █ ██           ███ █ ██ ███  ████ 
758.4 | █ █ █   ███     ███  ████████ ████  █ █ ██   █ ██ █    █    ███ █ ██ ███  █████
729.4 |████ ██  ████   ████ ██████████████  ███ ███ █████ ██   █  ██████████████  █████
700.5 |███████ █████  ████████████████████  ███ ███ ████████  ███ ███████████████ █████
671.5 |██████████████ ██████████████████████████████████████  █████████████████████████
642.5 |█████████████████████████████████████████████████████  █████████████████████████
613.6 |██████████████████████████████████████████████████████ █████████████████████████
584.6 |██████████████████████████████████████████████████████ █████████████████████████
555.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  556
   1 ms | ████████████████████████████████████████  6992
   2 ms | ███  486
   3 ms | █  234
   4 ms | █  101
   5 ms |   54
   6 ms |   27
   7 ms |   12
   8 ms |   8
   9 ms |   6
  10 ms |   8
  11 ms |   5
  12 ms |   2
  13 ms |   7
  14 ms |   3
  15 ms |   19
  16 ms |   53
  17 ms |   84
  18 ms |   78
  19 ms |   61
  20 ms |   21
  21 ms |   22
  22 ms |   17
  23 ms |   5
  24 ms |   7
  25 ms |   2
  26 ms |   3
  27 ms |   1
  28 ms |   3
  29 ms |   2
  30 ms |   4
  31 ms |   1
  38 ms |   1
  42 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `41.97`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `444.34`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `28.38`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `514.44`, min `20.33`, p50 `563.84`, p95 `744.35`, p99 `804.18`, 1%low `38.39`, 0.1%low `28.55`, std `195.13`

**Frame time (ms)**  avg `3.25`, p50 `1.77`, p95 `17.37`, p99 `22.31`, p99.9 `29.68`, max `49.19`

**Client tick (ms)**  avg `1.21`, p95 `2.06`, max `12.74`

**Memory**  start `1960 MB`, end `1684 MB`, peak `2184 MB`, GC `91 events / 693 ms`

**FPS over sampling window (ASCII):**

```
605.1 |                      █     █               █                         █         
584.8 |           █       █  █    ██   █           █     █     █   ██        █         
564.6 | █         █ █ █   █  █    ██   ███    █    █     █     █   ███  █    █         
544.4 | █         █ █ ██ ██  █ █  ██   ███   ███   █    ██     █   ███  █    ███       
524.2 |██         █ █ ██ ███ ███  ████ ███ █ ████  █    ██  ██ █  ████  █  █ ████  ██  
504.0 |███    ███ ███ ██ ███ ███  ████████ █ ████ ██    ██  ████  █████ █  █ ████  ██  
483.8 |████   ██████████ ███████████████████ ████ ██   ███  ███████████ █ ██ ████  ███ 
463.5 |████   ██████████ ███████████████████ ████ ██  ████  ██████████████████████████ 
443.3 |█████  ██████████████████████████████████████  █████████████████████████████████
423.1 |█████  ███████████████████████████████████████ █████████████████████████████████
402.9 |█████ ██████████████████████████████████████████████████████████████████████████
382.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | ████████████████████████████████████████  4006
   2 ms | ██████████  996
   3 ms | ████  368
   4 ms | ██  186
   5 ms | █  111
   6 ms |   45
   7 ms |   26
   8 ms |   9
   9 ms |   12
  10 ms |   2
  11 ms |   3
  12 ms |   4
  13 ms |   4
  14 ms |   4
  15 ms |   16
  16 ms |   41
  17 ms | █  55
  18 ms | █  82
  19 ms | █  68
  20 ms |   38
  21 ms |   21
  22 ms |   17
  23 ms |   8
  24 ms |   15
  25 ms |   2
  26 ms |   5
  27 ms |   4
  28 ms |   5
  29 ms |   5
  30 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `38.39`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `17.00`
- `fps_harmonic_avg` = `308.15`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `28.55`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `923.61`, min `23.26`, p50 `1014.71`, p95 `1229.06`, p99 `1507.70`, 1%low `44.37`, 0.1%low `27.74`, std `299.49`

**Frame time (ms)**  avg `1.85`, p50 `0.99`, p95 `4.30`, p99 `18.93`, p99.9 `28.84`, max `42.99`

**Client tick (ms)**  avg `1.14`, p95 `1.99`, max `18.25`

**Memory**  start `1270 MB`, end `1846 MB`, peak `3175 MB`, GC `61 events / 639 ms`

**FPS over sampling window (ASCII):**

```
1052.7 |     █        █           █  █                 █                                
1009.4 |   █ █     █  ██       ██ █  █ █    █       █ ██ ██  ██ █                 ██    
966.0 |   ████   ██  ██       ████ ████ ████      ██ █████ ███ █     █  ██       ███   
922.6 |████████████████    ██ ████ ████ ████      ███████████████   ██  ██ █ █   ███   
879.2 |█████████████████ █ ███████ █████████   █  ███████████████   ██  ████ █   ██████
835.8 |███████████████████████████ █████████   █ ██████████████████ ██  ███████ ███████
792.4 |█████████████████████████████████████  ██ ██████████████████████████████████████
749.0 |██████████████████████████████████████ █████████████████████████████████████████
705.6 |██████████████████████████████████████ █████████████████████████████████████████
662.2 |██████████████████████████████████████ █████████████████████████████████████████
618.8 |██████████████████████████████████████ █████████████████████████████████████████
575.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5698
   1 ms | ███████████████████████████  3892
   2 ms | ███  415
   3 ms | ██  217
   4 ms | █  92
   5 ms |   47
   6 ms |   13
   7 ms |   4
   8 ms |   3
   9 ms |   2
  10 ms |   4
  11 ms |   2
  12 ms |   2
  13 ms |   3
  14 ms |   22
  15 ms |   41
  16 ms |   71
  17 ms | █  97
  18 ms |   66
  19 ms |   37
  20 ms |   29
  21 ms |   10
  22 ms |   3
  23 ms |   6
  25 ms |   2
  26 ms |   3
  27 ms |   1
  28 ms |   4
  30 ms |   1
  32 ms |   3
  36 ms |   1
  37 ms |   1
  39 ms |   1
  41 ms |   1
  42 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `44.37`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `49.00`
- `fps_harmonic_avg` = `540.25`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `27.74`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `933.74`, min `26.72`, p50 `1021.80`, p95 `1198.83`, p99 `1481.58`, 1%low `45.24`, 0.1%low `30.38`, std `284.24`

**Frame time (ms)**  avg `1.79`, p50 `0.98`, p95 `3.83`, p99 `19.14`, p99.9 `28.19`, max `37.42`

**Client tick (ms)**  avg `0.76`, p95 `1.21`, max `4.00`

**Memory**  start `2129 MB`, end `1526 MB`, peak `3346 MB`, GC `52 events / 616 ms`

**FPS over sampling window (ASCII):**

```
1046.6 |                     █                   ██                                     
1019.6 |           █   █     █              █    ██                 ███         █       
992.7 |██   █     █ █ █     ██          █  █  █ ██         █ █   █ ███ █ █     ██      
965.8 |██  ███    █ █ ██  █ ██       █  █ ██  █ ██         █ █   █ ███ █ █ █  ████    █
938.8 |██  ███    ███ ███ █ ██       ███████ █████ █ ██    █ ███ █████ █ █ █  █████████
911.9 |███████    ███████ ████  █    █████████████ ████ █  █ ███████████ █ ██ █████████
884.9 |████████  ████████ ████ ██ █  █████████████ ████ █ ██ █████████████ ████████████
858.0 |████████  ████████ ████ ██ █  █████████████ ████ █ ██ █████████████ ████████████
831.1 |████████ █████████ ███████ ██ ██████████████████ █ ████████████████ ████████████
804.1 |████████ █████████ ███████ █████████████████████████████████████████████████████
777.2 |████████ ███████████████████████████████████████████████████████████████████████
750.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6158
   1 ms | █████████████████████████  3913
   2 ms | ███  387
   3 ms | █  182
   4 ms | █  90
   5 ms |   46
   6 ms |   5
   7 ms |   2
   9 ms |   4
  12 ms |   2
  13 ms |   2
  14 ms |   8
  15 ms |   25
  16 ms |   51
  17 ms | █  102
  18 ms | █  82
  19 ms |   58
  20 ms |   25
  21 ms |   13
  22 ms |   2
  23 ms |   6
  24 ms |   1
  25 ms |   2
  26 ms |   3
  27 ms |   1
  28 ms |   3
  29 ms |   2
  30 ms |   1
  32 ms |   1
  33 ms |   2
  35 ms |   2
  36 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `45.24`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `62.00`
- `fps_harmonic_avg` = `559.14`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `30.38`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23128 ms  |  Sample ticks: 400

**FPS**  avg `778.24`, min `21.93`, p50 `861.02`, p95 `1026.42`, p99 `1284.21`, 1%low `42.66`, 0.1%low `27.53`, std `261.43`

**Frame time (ms)**  avg `2.19`, p50 `1.16`, p95 `5.94`, p99 `20.07`, p99.9 `27.48`, max `45.61`

**Client tick (ms)**  avg `1.32`, p95 `2.96`, max `13.90`

**Memory**  start `1941 MB`, end `1396 MB`, peak `2359 MB`, GC `83 events / 674 ms`

**FPS over sampling window (ASCII):**

```
946.0 |                                                                        █       
917.5 |                █                                                       █       
889.0 |             █  █                                                       █       
860.5 |      █   █  █  █     █   █   █  █               ██           █         █       
832.0 |      █  ███ ████     █  ██   ██ █     █      █  ██ █         █      █  █ ██    
803.6 |   █ ██ ████ ████     █  ███████ ██  █ █    ███  ████    █    ██   ███  █ ██   █
775.1 | █ ███████████████ ██ █  ██████████  ████   ███ █████   ██    ██   ███  █ ██   █
746.6 |██ ████████████████████  ██████████  ████   ███ █████ █ ███   ██  ████ ██ ██████
718.1 |██ ████████████████████  ██████████  ████ ███████████ █ ███   ███ ████ █████████
689.7 |██ ████████████████████  ███████████ ████ ███████████ █████   ███ ████ █████████
661.2 |█████████████████████████████████████████ ███████████ ██████████████████████████
632.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████  756
   1 ms | ████████████████████████████████████████  7017
   2 ms | ███  505
   3 ms | █  237
   4 ms | █  111
   5 ms |   55
   6 ms |   27
   7 ms |   12
   8 ms |   5
   9 ms |   2
  10 ms |   4
  11 ms |   3
  12 ms |   4
  13 ms |   4
  14 ms |   13
  15 ms |   28
  16 ms |   40
  17 ms | █  103
  18 ms |   65
  19 ms |   52
  20 ms |   36
  21 ms |   19
  22 ms |   14
  23 ms |   6
  24 ms |   2
  25 ms |   4
  26 ms |   2
  27 ms |   4
  29 ms |   1
  31 ms |   1
  33 ms |   2
  37 ms |   1
  42 ms |   1
  44 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `42.66`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `8.00`
- `fps_harmonic_avg` = `456.49`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `27.53`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `381.35`, min `20.49`, p50 `422.90`, p95 `532.18`, p99 `619.00`, 1%low `36.98`, 0.1%low `25.31`, std `138.42`

**Frame time (ms)**  avg `4.06`, p50 `2.36`, p95 `18.12`, p99 `22.66`, p99.9 `35.23`, max `48.80`

**Client tick (ms)**  avg `1.62`, p95 `2.42`, max `4.84`

**Memory**  start `1319 MB`, end `1991 MB`, peak `4089 MB`, GC `49 events / 619 ms`

**FPS over sampling window (ASCII):**

```
444.4 |                                                               █            █   
430.5 |    █             █                                            █            █   
416.6 |    █             █          █                   █    █     █ ██ █          █   
402.8 | █ ██   █         ██ ███     █     █    █    ██ ██    ██   █████ █ █        █  █
388.9 | █ ███  █ █    █  ██ ███    ██  ██████  ████ █████    ██ █ █████ ███  ██    ██ █
375.1 |██ ███  ███    █  ██████ █  ███ ██████ ████████████   ██████████████  ██  ██████
361.2 |██ ███  ████ █ █ ███████ ██ ███ ██████ ████████████   ██████████████  ██  ██████
347.3 |███████ ████ ██████████████████ ███████████████████ █ ███████████████████ ██████
333.5 |████████████ ██████████████████ █████████████████████ ███████████████████ ██████
319.6 |████████████ ██████████████████ █████████████████████████████████████████ ██████
305.8 |████████████ ██████████████████ ████████████████████████████████████████████████
291.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █████████  672
   2 ms | ████████████████████████████████████████  3014
   3 ms | █████  352
   4 ms | ████  276
   5 ms | ██  125
   6 ms | █  54
   7 ms |   24
   8 ms |   10
   9 ms |   5
  10 ms |   4
  11 ms |   1
  13 ms |   2
  14 ms |   4
  15 ms |   17
  16 ms | █  42
  17 ms | █  75
  18 ms | █  64
  19 ms | █  60
  20 ms | █  41
  21 ms |   31
  22 ms |   15
  23 ms |   14
  24 ms |   10
  25 ms |   5
  26 ms |   5
  27 ms |   3
  28 ms |   1
  29 ms |   1
  31 ms |   1
  32 ms |   1
  33 ms |   1
  35 ms |   2
  36 ms |   1
  37 ms |   1
  38 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `36.98`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `1.00`
- `fps_harmonic_avg` = `246.59`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `25.31`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `1159.32`, min `19.13`, p50 `1266.34`, p95 `1521.23`, p99 `1890.91`, 1%low `38.73`, 0.1%low `24.37`, std `369.34`

**Frame time (ms)**  avg `1.66`, p50 `0.79`, p95 `5.72`, p99 `20.83`, p99.9 `33.90`, max `52.27`

**Client tick (ms)**  avg `4.99`, p95 `7.17`, max `26.56`

**Memory**  start `1917 MB`, end `1805 MB`, peak `3587 MB`, GC `53 events / 637 ms`

**FPS over sampling window (ASCII):**

```
1267.7 |██                                    ██ █         █                            
1236.6 |██               ██            █      ██ █        ██ █ █     ██   ██      █     
1205.5 |███    █     █   ██         ██ █  █   ████   ██ ████ ███   ████   ██     ██  ██ 
1174.3 |███    █    ███  ████    █  ██ █  ██  ████   ██ ████████  █████  ███    ███  ██ 
1143.2 |███   ███   ███ █████   ██  ██ ██ ██  █████  ███████████████████ ███ ██████  ██ 
1112.1 |███ █ ████ ████ █████   ██  █████ ██  █████ ████████████████████████ ██████ ████
1080.9 |███ ██████ ████ ██████ ███  ████████  ██████████████████████████████ ██████ ████
1049.8 |███ ███████████ ███████████ ████████  ██████████████████████████████ ███████████
1018.7 |███████████████ ███████████ ████████████████████████████████████████████████████
987.5 |███████████████ ███████████ ████████████████████████████████████████████████████
956.4 |███████████████████████████ ████████████████████████████████████████████████████
925.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9765
   1 ms | █████  1217
   2 ms | █  197
   3 ms | █  129
   4 ms |   54
   5 ms |   118
   6 ms |   87
   7 ms |   31
   8 ms |   21
   9 ms |   4
  10 ms |   1
  12 ms |   2
  13 ms |   3
  14 ms |   16
  15 ms |   34
  16 ms |   63
  17 ms |   77
  18 ms |   55
  19 ms |   25
  20 ms |   16
  21 ms |   17
  22 ms |   25
  23 ms |   23
  24 ms |   12
  25 ms |   6
  26 ms |   4
  27 ms |   5
  28 ms |   2
  29 ms |   1
  31 ms |   3
  32 ms |   3
  33 ms |   2
  34 ms |   1
  36 ms |   1
  37 ms |   2
  38 ms |   3
  40 ms |   1
  42 ms |   1
  46 ms |   1
  48 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `497.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `38.73`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `52.00`
- `fps_harmonic_avg` = `601.57`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `497.00`
- `fps_0p1pct_low` = `24.37`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `248.65`, min `17.85`, p50 `273.04`, p95 `394.61`, p99 `434.75`, 1%low `32.38`, 0.1%low `20.20`, std `108.39`

**Frame time (ms)**  avg `6.07`, p50 `3.66`, p95 `19.97`, p99 `25.80`, p99.9 `36.21`, max `56.03`

**Client tick (ms)**  avg `5.02`, p95 `7.00`, max `15.63`

**Memory**  start `1955 MB`, end `2519 MB`, peak `2638 MB`, GC `29 events / 182 ms`

**FPS over sampling window (ASCII):**

```
347.8 |                                             █                                  
330.1 |                                          █  █  █                               
312.5 |                                        ███ ██ ██     █       █    █  █         
294.9 |                                        ██████ ██  █ ███      █   ██  ██   █  █ 
277.2 | █ ██                                   ██████ ██  █████   █ █████████████ █████
259.6 |█████             █                     █████████████████ ████████████████ █████
241.9 |█████  █          █    █                ████████████████████████████████████████
224.3 |████████ █        █   ████             █████████████████████████████████████████
206.7 |██████████████ █  ███ ████  █      █   █████████████████████████████████████████
189.0 |█████████████████ ████████  █  █   ██  █████████████████████████████████████████
171.4 |██████████████████████████ ███████████ █████████████████████████████████████████
153.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   2 ms | ██████████████████████████████  798
   3 ms | ████████████████████████████████████████  1061
   4 ms | ███████████████████  493
   5 ms | ███████  174
   6 ms | ██  50
   7 ms | ███  81
   8 ms | ████  98
   9 ms | ██  50
  10 ms | ██  41
  11 ms | █  19
  12 ms | █  16
  13 ms | █  22
  14 ms | ██  47
  15 ms | ██  47
  16 ms | █  37
  17 ms | █  18
  18 ms | █  35
  19 ms | ██  41
  20 ms | ██  42
  21 ms | █  29
  22 ms | █  20
  23 ms | █  15
  24 ms |   13
  25 ms |   12
  26 ms |   10
  27 ms |   4
  28 ms |   3
  29 ms |   3
  30 ms |   5
  32 ms |   2
  33 ms |   1
  35 ms |   1
  36 ms |   1
  43 ms |   1
  48 ms |   1
  56 ms |   1
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
- `fps_1pct_low` = `32.38`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `164.64`
- `preload_duration_ms` = `22.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.20`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `558.20`, min `19.66`, p50 `620.50`, p95 `804.39`, p99 `918.27`, 1%low `35.11`, 0.1%low `21.97`, std `219.73`

**Frame time (ms)**  avg `3.16`, p50 `1.61`, p95 `17.33`, p99 `22.75`, p99.9 `38.48`, max `50.85`

**Client tick (ms)**  avg `1.53`, p95 `2.71`, max `8.40`

**Memory**  start `2067 MB`, end `2333 MB`, peak `2410 MB`, GC `86 events / 670 ms`

**FPS over sampling window (ASCII):**

```
690.1 |                                           █               █                    
659.3 |                  █     █                  █             █ █  █ ██              
628.5 |█   █        █    ██    █ █ █        █     █        ███  █ ██ █ ██             █
597.7 |██  █        █ █ ███    ███ █  █   ███     █  █     ███  ████ ████        █    █
566.8 |██ ██        █ █ ███  █████ █ ███  ████    █  █    █████ ████ ████   █    ██  ██
536.0 |██ ██   ██  ████████ ██████ █████  ████ ████  ███  ████████████████  █   ███  ██
505.2 |██ ███  ██  ███████████████ ██████ ████ ████ █████ ████████████████  ██  ███████
474.4 |██ ███  ██ ████████████████ ████████████████ █████ ████████████████  ███████████
443.6 |███████ ██ █████████████████████████████████████████████████████████ ███████████
412.7 |███████ ██ █████████████████████████████████████████████████████████████████████
381.9 |██████████ █████████████████████████████████████████████████████████████████████
351.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   24
   1 ms | ████████████████████████████████████████  4460
   2 ms | ██████  722
   3 ms | ███  290
   4 ms | ██  178
   5 ms | █  128
   6 ms |   53
   7 ms |   29
   8 ms |   20
   9 ms |   15
  10 ms |   6
  11 ms |   7
  12 ms |   4
  13 ms |   6
  14 ms |   7
  15 ms |   17
  16 ms |   33
  17 ms |   52
  18 ms | █  70
  19 ms | █  65
  20 ms |   42
  21 ms |   24
  22 ms |   21
  23 ms |   7
  24 ms |   8
  25 ms |   13
  26 ms |   5
  27 ms |   5
  28 ms |   3
  29 ms |   1
  30 ms |   2
  31 ms |   2
  32 ms |   3
  34 ms |   1
  36 ms |   1
  39 ms |   1
  41 ms |   1
  42 ms |   1
  44 ms |   1
  45 ms |   1
  47 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `21.97`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `316.35`
- `fps_1pct_low` = `35.11`
- `preload_duration_ms` = `60.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `598.73`, min `24.10`, p50 `582.55`, p95 `1139.60`, p99 `1187.63`, 1%low `40.47`, 0.1%low `26.68`, std `257.64`

**Frame time (ms)**  avg `2.75`, p50 `1.72`, p95 `13.99`, p99 `20.88`, p99.9 `30.31`, max `41.50`

**Client tick (ms)**  avg `0.80`, p95 `1.35`, max `7.17`

**Memory**  start `2382 MB`, end `2767 MB`, peak `3391 MB`, GC `46 events / 477 ms`

**FPS over sampling window (ASCII):**

```
1085.8 |                                                                        █ ███   
1021.1 |                                                                        █████   
956.5 |                                                                      █ ██████  
891.8 |                                                                      █ ██████  
827.2 |                                              █                     █ █ ██████  
762.5 |                                              █          █   █     ███████████  
697.9 |                                   ██         █          █  ██  █  ███████████  
633.2 |                                   ███  ██    █     ██   ██ ██  █  ████████████ 
568.6 |    ██        █      █ █████       ███ ███ ████ ███████ ███████ ██ █████████████
503.9 |    ███   █  ██ ████ ███████   ███████ █████████████████████████████████████████
439.3 | ████████ ███████████████████ ██████████████████████████████████████████████████
374.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  832
   1 ms | ████████████████████████████████████████  4387
   2 ms | ███████████  1213
   3 ms | ██  231
   4 ms | █  115
   5 ms | █  59
   6 ms |   25
   7 ms |   5
   8 ms |   7
   9 ms |   4
  10 ms |   4
  11 ms |   4
  12 ms |   7
  13 ms |   18
  14 ms |   14
  15 ms |   25
  16 ms |   39
  17 ms | █  58
  18 ms | █  79
  19 ms |   47
  20 ms |   30
  21 ms |   28
  22 ms |   7
  23 ms |   12
  24 ms |   2
  25 ms |   2
  26 ms |   4
  27 ms |   5
  28 ms |   1
  29 ms |   2
  30 ms |   2
  36 ms |   1
  37 ms |   2
  39 ms |   1
  40 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `doors_placed` = `16.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `40.47`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `363.67`
- `preload_duration_ms` = `7.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `26.68`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `746.01`, min `20.87`, p50 `711.71`, p95 `1254.12`, p99 `1483.96`, 1%low `35.50`, 0.1%low `23.52`, std `366.97`

**Frame time (ms)**  avg `2.69`, p50 `1.41`, p95 `13.49`, p99 `21.98`, p99.9 `36.99`, max `47.92`

**Client tick (ms)**  avg `5.41`, p95 `11.05`, max `31.50`

**Memory**  start `1809 MB`, end `2773 MB`, peak `3164 MB`, GC `45 events / 452 ms`

**FPS over sampling window (ASCII):**

```
1407.5 |                                                                              █ 
1306.2 |                                                                            ███ 
1205.0 |                                                                          █ ███ 
1103.7 |                    ███     █       ██                                 █  █████ 
1002.5 |                    ███  █████████ ███                           █ ██████ ██████
901.2 |                   ███████████████████                      █  █████████████████
800.0 |                   ███████████████████                     █████████████████████
698.7 |                   █████████████████████                   █████████████████████
597.5 |         █ ████    █████████████████████             █  █ ██████████████████████
496.2 |         ██████████████████████████████████  █    █ ████████████████████████████
395.0 |██  ██ █████████████████████████████████████ ███████████████████████████████████
293.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████████████████████████  2617
   1 ms | ████████████████████████████████████████  2819
   2 ms | ██████████████  1000
   3 ms | ███  244
   4 ms | █  82
   5 ms | █  61
   6 ms | █  53
   7 ms |   35
   8 ms | █  40
   9 ms |   24
  10 ms |   25
  11 ms |   12
  12 ms |   24
  13 ms | █  69
  14 ms |   30
  15 ms |   30
  16 ms |   33
  17 ms | █  54
  18 ms | █  51
  19 ms |   28
  20 ms |   23
  21 ms |   14
  22 ms |   16
  23 ms |   7
  24 ms |   8
  25 ms |   5
  26 ms |   8
  27 ms |   5
  28 ms |   5
  29 ms |   2
  31 ms |   3
  32 ms |   2
  33 ms |   1
  34 ms |   1
  35 ms |   2
  36 ms |   2
  37 ms |   3
  40 ms |   1
  42 ms |   1
  45 ms |   1
  46 ms |   1
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.23`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `35.50`
- `fps_harmonic_avg` = `372.17`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `128.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `23.52`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `829.61`, min `16.04`, p50 `873.05`, p95 `1371.71`, p99 `1454.61`, 1%low `35.42`, 0.1%low `19.54`, std `367.28`

**Frame time (ms)**  avg `2.36`, p50 `1.15`, p95 `11.75`, p99 `20.89`, p99.9 `40.78`, max `62.33`

**Client tick (ms)**  avg `4.37`, p95 `9.97`, max `36.15`

**Memory**  start `1498 MB`, end `2815 MB`, peak `2842 MB`, GC `37 events / 374 ms`

**FPS over sampling window (ASCII):**

```
1342.7 |                               ██                                               
1243.2 |                         █ ██████          █                                    
1143.7 |                      █████████████        █                                    
1044.2 |                      ███████████████   ████             ███████ █              
944.8 |         █            ████████████████ █████            ███████████            █
845.3 |       █████ ███      ██████████████████████            ███████████           ██
745.8 |      ███████████     ██████████████████████       ████████████████    ██     ██
646.3 |     ████████████  █████████████████████████      █████████████████ █ █████  ███
546.8 |     ████████████████████████████████████████ ██ ████████████████████ █████ ████
447.3 |    █████████████████████████████████████████ ██████████████████████████████████
347.8 |    ████████████████████████████████████████████████████████████████████████████
248.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████████  3004
   1 ms | ████████████████████████████████████████  3832
   2 ms | ██████  549
   3 ms | ███  328
   4 ms | █  132
   5 ms | █  82
   6 ms |   34
   7 ms |   26
   8 ms |   17
   9 ms |   12
  10 ms |   17
  11 ms |   14
  12 ms |   11
  13 ms | █  65
  14 ms | █  62
  15 ms |   38
  16 ms |   27
  17 ms |   34
  18 ms |   40
  19 ms |   38
  20 ms |   24
  21 ms |   13
  22 ms |   6
  23 ms |   11
  24 ms |   12
  25 ms |   8
  26 ms |   2
  27 ms |   6
  28 ms |   5
  29 ms |   1
  30 ms |   3
  32 ms |   1
  33 ms |   1
  34 ms |   2
  37 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   2
  47 ms |   1
  50 ms |   3
  52 ms |   1
  54 ms |   1
  62 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.72`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `35.42`
- `fps_harmonic_avg` = `423.62`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `50.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.54`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1310.12`, min `8.41`, p50 `1195.51`, p95 `3428.10`, p99 `3820.39`, 1%low `13.44`, 0.1%low `8.86`, std `1075.41`

**Frame time (ms)**  avg `5.41`, p50 `0.84`, p95 `28.10`, p99 `52.13`, p99.9 `105.65`, max `118.88`

**Client tick (ms)**  avg `19.95`, p95 `34.12`, max `47.75`

**Memory**  start `2318 MB`, end `2421 MB`, peak `3110 MB`, GC `13 events / 108 ms`

**FPS over sampling window (ASCII):**

```
3391.4 |                                                                          █ ███ 
3090.1 |                                                                          ██████
2788.8 |                                                                          ██████
2487.4 |                                                           ██  █ █        ██████
2186.1 |                █                              ████        █████ ████     ██████
1884.8 |                ██      █        █     █       ███████     ██████████     ██████
1583.5 |                ███    ███     ███    ████     ███████     ██████████     ██████
1282.2 | ██            ████    ████   ████    █████    ███████     ███████████    ██████
980.8 |███            █████   ████   █████   █████   █████████    ███████████    ██████
679.5 |███            ██████  █████  █████  ███████  █████████   █████████████   ██████
378.2 |████   ██ █ ██ ██████  ██████ ██████ ████████ ███████████ ██████████████ ███████
 76.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  2045
   1 ms | ███████  357
   2 ms | ███  142
   3 ms | ███  140
   4 ms | █████  248
   5 ms | ███  152
   6 ms | █  30
   7 ms |   9
   8 ms |   14
   9 ms |   16
  10 ms |   6
  11 ms |   8
  12 ms |   10
  13 ms | █  29
  14 ms | █  39
  15 ms | █  29
  16 ms | █  39
  17 ms | █  34
  18 ms |   18
  19 ms |   18
  20 ms |   24
  21 ms |   17
  22 ms |   17
  23 ms |   5
  24 ms |   11
  25 ms |   17
  26 ms |   21
  27 ms |   13
  28 ms |   10
  29 ms |   8
  30 ms |   10
  31 ms |   6
  32 ms |   8
  33 ms |   8
  34 ms |   12
  35 ms |   2
  36 ms |   5
  37 ms |   5
  38 ms |   4
  39 ms |   7
  40 ms |   10
  41 ms |   7
  42 ms |   8
  43 ms |   5
  44 ms |   6
  45 ms |   6
  47 ms |   4
  48 ms |   2
  49 ms |   6
  50 ms |   5
  51 ms |   5
  52 ms |   1
  53 ms |   2
  55 ms |   3
  56 ms |   2
  57 ms |   3
  59 ms |   1
  60 ms |   1
  61 ms |   3
  62 ms |   2
  64 ms |   2
  67 ms |   1
  69 ms |   1
  70 ms |   1
  72 ms |   1
  77 ms |   1
  81 ms |   1
  85 ms |   2
  87 ms |   1
  88 ms |   1
  95 ms |   1
  97 ms |   1
 101 ms |   1
 104 ms |   1
 108 ms |   2
 115 ms |   1
 118 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `13.44`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4797.42`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `8.86`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `184.75`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `26357.00`
- `preload_duration_ms` = `7.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1389.57`, min `6.48`, p50 `1527.84`, p95 `3027.51`, p99 `3582.33`, 1%low `10.21`, 0.1%low `7.45`, std `1030.89`

**Frame time (ms)**  avg `5.96`, p50 `0.65`, p95 `31.31`, p99 `72.80`, p99.9 `111.10`, max `154.31`

**Client tick (ms)**  avg `20.30`, p95 `35.50`, max `62.70`

**Memory**  start `1447 MB`, end `2394 MB`, peak `2856 MB`, GC `24 events / 139 ms`

**FPS over sampling window (ASCII):**

```
2961.4 |                                                                            ██ █
2694.6 |                                                               ██ ██        ████
2427.7 |                                                            ██ ███████      ████
2160.9 |                                       █         ███        ██ ███████      ████
1894.0 |              ██     ████     ███ █    █████     ████ █     ██████████     █████
1627.2 |        █     ███   ██████    █████    ██████    ██████     ███████████    █████
1360.4 |        ██   ████   ███████   █████    ██████    ██████     ███████████    █████
1093.5 |        ██   ████   ███████   ██████   ███████   ███████    ████████████   █████
826.7 | █      ██   █████  ███████   ██████  ████████  █████████   ████████████   █████
559.8 |██      ███  █████  ████████  ██████  █████████ █████████   █████████████  █████
293.0 |███    █████ ██████ █████████████████ █████████ ██████████ ███████████████ █████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  2016
   1 ms | ██████  309
   2 ms | ██  121
   3 ms | █  63
   4 ms | █  49
   5 ms | █  44
   6 ms | ███  143
   7 ms | ██  77
   8 ms |   21
   9 ms |   7
  10 ms |   11
  11 ms |   10
  12 ms |   11
  13 ms | █  33
  14 ms |   24
  15 ms |   21
  16 ms | █  36
  17 ms | █  35
  18 ms |   14
  19 ms |   14
  20 ms |   14
  21 ms |   15
  22 ms |   12
  23 ms |   18
  24 ms |   11
  25 ms |   5
  26 ms |   12
  27 ms |   17
  28 ms |   8
  29 ms |   9
  30 ms |   7
  31 ms |   6
  32 ms |   11
  33 ms |   6
  34 ms |   8
  35 ms |   6
  36 ms |   6
  37 ms |   3
  38 ms |   6
  39 ms |   3
  40 ms |   5
  41 ms |   6
  42 ms |   4
  43 ms |   6
  44 ms |   5
  45 ms |   5
  46 ms |   4
  47 ms |   3
  48 ms |   3
  49 ms |   2
  50 ms |   4
  51 ms |   3
  52 ms |   5
  53 ms |   2
  55 ms |   4
  56 ms |   3
  57 ms |   2
  58 ms |   1
  59 ms |   1
  60 ms |   2
  61 ms |   3
  62 ms |   1
  63 ms |   2
  65 ms |   1
  66 ms |   2
  67 ms |   1
  68 ms |   1
  71 ms |   1
  74 ms |   1
  75 ms |   1
  76 ms |   1
  79 ms |   2
  80 ms |   1
  82 ms |   1
  84 ms |   1
  89 ms |   1
  90 ms |   2
  92 ms |   2
  93 ms |   1
  94 ms |   1
  95 ms |   2
  97 ms |   1
  98 ms |   1
  99 ms |   2
 101 ms |   1
 102 ms |   1
 104 ms |   1
 105 ms |   2
 106 ms |   1
 107 ms |   1
 109 ms |   2
 111 ms |   1
 119 ms |   1
 128 ms |   1
 154 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `10.21`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4789.41`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `7.45`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `167.90`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `27142.00`
- `preload_duration_ms` = `8.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1426.67`, min `20.48`, p50 `1556.31`, p95 `2332.48`, p99 `2921.99`, 1%low `41.38`, 0.1%low `25.10`, std `693.77`

**Frame time (ms)**  avg `1.57`, p50 `0.64`, p95 `4.54`, p99 `19.79`, p99.9 `31.02`, max `48.84`

**Client tick (ms)**  avg `3.00`, p95 `5.21`, max `30.76`

**Memory**  start `1451 MB`, end `2112 MB`, peak `3886 MB`, GC `45 events / 619 ms`

**FPS over sampling window (ASCII):**

```
2098.4 |                                                            █               █  █
1954.4 |                                              █      █   █  █       █  ███ ███ █
1810.3 | ███ ██                                █      ██     █ █ █  █   ██  ████████████
1666.3 | ██████                           █   ████ ███████████ ██████ █████ ████████████
1522.2 |███████                           █   ██████████████████████████████████████████
1378.2 |███████                           ██  ██████████████████████████████████████████
1234.1 |███████                       █ █ ██████████████████████████████████████████████
1090.1 |████████                      ██████████████████████████████████████████████████
946.1 |████████                ██ █ ███████████████████████████████████████████████████
802.0 |████████            ███ ████████████████████████████████████████████████████████
658.0 |█████████  ██ █ ████████████████████████████████████████████████████████████████
513.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8609
   1 ms | █████████████  2773
   2 ms | ██  397
   3 ms | █  221
   4 ms | █  156
   5 ms |   97
   6 ms |   38
   7 ms |   12
   8 ms |   12
  10 ms |   2
  12 ms |   1
  13 ms |   6
  14 ms |   14
  15 ms |   25
  16 ms |   57
  17 ms |   64
  18 ms |   66
  19 ms |   49
  20 ms |   32
  21 ms |   26
  22 ms |   11
  23 ms |   14
  24 ms |   4
  25 ms |   7
  26 ms |   4
  27 ms |   2
  28 ms |   1
  29 ms |   2
  30 ms |   2
  32 ms |   2
  34 ms |   2
  36 ms |   1
  38 ms |   1
  40 ms |   1
  41 ms |   1
  42 ms |   1
  43 ms |   1
  44 ms |   1
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `41.38`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `833.00`
- `falling_blocks_alive_avg` = `621.03`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `25.10`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `635.86`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3675.00`
- `preload_duration_ms` = `65.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1422.13`, min `19.55`, p50 `1594.54`, p95 `2366.83`, p99 `3041.18`, 1%low `40.42`, 0.1%low `27.03`, std `730.65`

**Frame time (ms)**  avg `1.70`, p50 `0.63`, p95 `5.05`, p99 `20.92`, p99.9 `29.45`, max `51.16`

**Client tick (ms)**  avg `3.02`, p95 `5.46`, max `27.57`

**Memory**  start `2125 MB`, end `2074 MB`, peak `4158 MB`, GC `47 events / 627 ms`

**FPS over sampling window (ASCII):**

```
2349.2 |                                                                          █   █ 
2167.1 |                                                                          █   █ 
1985.0 |██   █                                         █                 ██ █  █████████
1802.8 |██ █ █                                      █  ██ ████   █  █    ████ ██████████
1620.7 |████████                              ███  ██████████████████  █████████████████
1438.6 |████████                     █       ████████████████████████ ██████████████████
1256.4 |████████                     █ █████████████████████████████████████████████████
1074.3 |████████              █     ████████████████████████████████████████████████████
892.2 |█████████             █████ ████████████████████████████████████████████████████
710.0 |█████████            ███████████████████████████████████████████████████████████
527.9 |██████████ █    ████████████████████████████████████████████████████████████████
345.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8018
   1 ms | ██████████  2013
   2 ms | ████  706
   3 ms | █  255
   4 ms | █  157
   5 ms |   82
   6 ms |   51
   7 ms |   31
   8 ms |   20
   9 ms |   9
  10 ms |   6
  12 ms |   2
  13 ms |   4
  14 ms |   9
  15 ms |   13
  16 ms |   34
  17 ms |   64
  18 ms |   62
  19 ms |   53
  20 ms |   41
  21 ms |   30
  22 ms |   24
  23 ms |   13
  24 ms |   10
  25 ms |   9
  26 ms |   8
  27 ms |   4
  28 ms |   2
  29 ms |   3
  30 ms |   3
  36 ms |   1
  37 ms |   1
  38 ms |   1
  39 ms |   1
  42 ms |   1
  49 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `40.42`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.24`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `27.03`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `587.15`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3234.00`
- `preload_duration_ms` = `16.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `739.36`, min `19.83`, p50 `767.07`, p95 `1162.67`, p99 `1338.70`, 1%low `38.12`, 0.1%low `22.17`, std `277.44`

**Frame time (ms)**  avg `2.32`, p50 `1.30`, p95 `5.83`, p99 `20.36`, p99.9 `38.84`, max `50.43`

**Client tick (ms)**  avg `1.07`, p95 `2.06`, max `25.95`

**Memory**  start `2854 MB`, end `2063 MB`, peak `3900 MB`, GC `42 events / 621 ms`

**FPS over sampling window (ASCII):**

```
1065.2 |                                          █                                     
1017.2 |█   █                                     █                                     
969.2 |██  ██    █   █                           █                                     
921.2 |███████   ██  ██                          █                                     
873.2 |███████ ████████ █                        █                                     
825.2 |██████████████████ ██                     █                                █ ██ 
777.2 |██████████████████ ██                     █          █              █ █ ███████ 
729.2 |██████████████████ ███    █        █      █   █      ███      █    █████████████
681.2 |█████████████████████████ ██    ████      █   ██     ███ ██   ███ ██████████████
633.2 |███████████████████████████████ ████  █ ███ ████    ███████  ███████████████████
585.2 |█████████████████████████████████████ █ ███████████████████ ████████████████████
537.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  1279
   1 ms | ████████████████████████████████████████  5951
   2 ms | ████  595
   3 ms | █  219
   4 ms | █  115
   5 ms |   57
   6 ms |   17
   7 ms |   10
   8 ms |   5
   9 ms |   7
  13 ms |   4
  14 ms |   10
  15 ms |   26
  16 ms |   54
  17 ms | █  76
  18 ms |   74
  19 ms |   43
  20 ms |   33
  21 ms |   18
  22 ms |   12
  23 ms |   5
  24 ms |   6
  25 ms |   3
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   2
  30 ms |   1
  31 ms |   1
  33 ms |   1
  34 ms |   2
  35 ms |   1
  37 ms |   1
  38 ms |   2
  39 ms |   2
  42 ms |   1
  45 ms |   2
  46 ms |   1
  47 ms |   1
  49 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `64.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `22.17`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `431.85`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `38.12`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `2039.38`, min `21.99`, p50 `2151.20`, p95 `2992.42`, p99 `3759.48`, 1%low `47.59`, 0.1%low `31.26`, std `640.82`

**Frame time (ms)**  avg `0.92`, p50 `0.46`, p95 `1.76`, p99 `17.99`, p99.9 `24.88`, max `45.47`

**Client tick (ms)**  avg `0.43`, p95 `0.62`, max `3.81`

**Memory**  start `2415 MB`, end `1675 MB`, peak `3817 MB`, GC `43 events / 610 ms`

**FPS over sampling window (ASCII):**

```
3343.6 |  █                                                                             
3193.4 |  ██                                                                            
3043.1 |  ██                                                                            
2892.9 |  ██                                                                            
2742.6 | ███                                                                            
2592.4 | ███                                                                            
2442.1 | ███                                                                        █   
2291.9 | ███                                       █             ██                 █   
2141.6 | ████  █   ██ █          █   █           █ █      █ ████ ██       █  ██   █ █  █
1991.4 |███████████████  ███ █  ████ ██  ██   ██████ ██ █ █████████████████ ████ ████  █
1841.1 |████████████████████████████████ ██████████████ ████████████████████████ ████ ██
1690.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19370
   1 ms | █  683
   2 ms | █  307
   3 ms |   169
   4 ms |   54
   5 ms |   16
   6 ms |   16
   7 ms |   2
   8 ms |   2
  12 ms |   3
  13 ms |   6
  14 ms |   10
  15 ms |   24
  16 ms |   41
  17 ms |   87
  18 ms |   79
  19 ms |   46
  20 ms |   28
  21 ms |   16
  22 ms |   9
  23 ms |   7
  24 ms |   4
  25 ms |   3
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   2
  30 ms |   4
  31 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   1
  36 ms |   1
  37 ms |   2
  44 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `1087.00`
- `fps_1pct_low` = `47.59`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `22.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `31.26`
- `neighbour_updates` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1957.75`, min `18.60`, p50 `2091.19`, p95 `2621.11`, p99 `3424.78`, 1%low `49.48`, 0.1%low `34.28`, std `596.52`

**Frame time (ms)**  avg `0.94`, p50 `0.48`, p95 `1.82`, p99 `17.57`, p99.9 `23.00`, max `53.77`

**Client tick (ms)**  avg `0.40`, p95 `0.72`, max `2.92`

**Memory**  start `2289 MB`, end `2525 MB`, peak `4207 MB`, GC `35 events / 499 ms`

**FPS over sampling window (ASCII):**

```
2550.2 |                                                                           █    
2467.2 |                                                                           █    
2384.1 |                                                                          ██  █ 
2301.0 |                                                                    █     ███ █ 
2217.9 |                                                                    █   █ ███ ██
2134.8 | █                                                                  █   █ ███ ██
2051.7 |██   █████   █                                                  █  ██  ██████ ██
1968.6 |██ ███████ ████ ███ █   █ █████    ████    █ █    ██    █ ███   ██ █████████████
1885.6 |██████████████████████  ████████  █████  █ ███   ███ █  █████  ███ █████████████
1802.5 |██████████████████████  ███████████████  ███████ ████████████ ██████████████████
1719.4 |███████████████████████ ███████████████ █████████████████████ ██████████████████
1636.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19250
   1 ms | ██  756
   2 ms | █  343
   3 ms |   170
   4 ms |   59
   5 ms |   18
   6 ms |   9
   7 ms |   4
   8 ms |   3
   9 ms |   2
  13 ms |   1
  14 ms |   13
  15 ms |   28
  16 ms |   80
  17 ms |   90
  18 ms |   70
  19 ms |   33
  20 ms |   29
  21 ms |   10
  22 ms |   10
  23 ms |   6
  24 ms |   5
  25 ms |   3
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   1
  36 ms |   1
  45 ms |   1
  48 ms |   1
  53 ms |   1
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
- `fps_1pct_low` = `49.48`
- `preset_long` = `0.00`
- `preload_duration_ms` = `124.00`
- `fps_harmonic_avg` = `1067.72`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `34.28`
- `seed` = `4019.00`
- `preset_quick` = `1.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1707.58`, min `17.80`, p50 `1977.64`, p95 `2507.25`, p99 `3322.13`, 1%low `41.70`, 0.1%low `24.26`, std `779.67`

**Frame time (ms)**  avg `1.49`, p50 `0.51`, p95 `4.10`, p99 `19.91`, p99.9 `30.47`, max `56.18`

**Client tick (ms)**  avg `0.58`, p95 `0.95`, max `19.48`

**Memory**  start `1637 MB`, end `3360 MB`, peak `4096 MB`, GC `36 events / 602 ms`

**FPS over sampling window (ASCII):**

```
2170.0 |█                                                                 █             
2087.7 |█           █                                                     █             
2005.3 |█           █     █       █                     █   █       █     █     █       
1922.9 |█      █ █  █     █    █  █     █       █  █  █ █   █  █    █ █  ███    █       
1840.6 |█    █ █ █  █  █  ██  ██ ██ █   █  █    █  █  █ █   █  █  █ █ █  ███  ███ █     
1758.2 |█ █  █ ███  █  █ ███ ███ ██ █   █  █    █  █  █ █   █  █  █ █ █  ███  ███ █  █ █
1675.8 |█ █  █ ████ █  █████ ████████   █  █  ███  █ ██ █   █  ██ █████  ███ ██████  █ █
1593.5 |███████████ ██ █████ ████████ █ ██ █  ███  ████ ██  █ ███ ██████████ ██████  ███
1511.1 |██████████████ █████ ████████ ██████  ███  ███████  █ ██████████████ ██████ ████
1428.8 |██████████████ █████ ████████ ██████ █████████████  █ █████████████████████ ████
1346.4 |████████████████████ ███████████████████████████████████████████████████████████
1264.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10589
   1 ms | ███  694
   2 ms | ███  683
   3 ms | ███  731
   4 ms | █  166
   5 ms |   70
   6 ms |   35
   7 ms |   21
   8 ms |   9
   9 ms |   6
  10 ms |   7
  11 ms |   4
  12 ms |   3
  13 ms |   2
  14 ms |   2
  15 ms |   14
  16 ms |   27
  17 ms |   55
  18 ms |   81
  19 ms |   68
  20 ms |   39
  21 ms |   34
  22 ms |   13
  23 ms |   9
  24 ms |   5
  25 ms |   5
  26 ms |   2
  27 ms |   4
  29 ms |   3
  31 ms |   1
  32 ms |   1
  34 ms |   1
  35 ms |   2
  37 ms |   1
  39 ms |   2
  40 ms |   1
  42 ms |   1
  43 ms |   1
  47 ms |   1
  50 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `24.26`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `669.80`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `41.70`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `1735.40`, min `20.56`, p50 `1875.68`, p95 `2254.64`, p99 `2752.61`, 1%low `46.18`, 0.1%low `28.79`, std `521.22`

**Frame time (ms)**  avg `1.06`, p50 `0.53`, p95 `2.16`, p99 `18.37`, p99.9 `26.15`, max `48.63`

**Client tick (ms)**  avg `0.54`, p95 `0.75`, max `26.79`

**Memory**  start `2615 MB`, end `3153 MB`, peak `4014 MB`, GC `41 events / 588 ms`

**FPS over sampling window (ASCII):**

```
1937.9 |█                                                                          █    
1894.0 |█    █     ██            █               █                                 █    
1850.1 |█ █  █     ██            █          █    █            █                    █    
1806.2 |█ ████ ██ ███   █      ███         ██    ██  █        █      ██   █        █    
1762.3 |██████ ██ ███████ █ █  ███  █ █    ██    ██  █    █  ██      ███ ████  ███ █ █  
1718.4 |██████ ██ ███████ ███ █████ █ █  █ ██ ██ ███ █   ██ ████  █  ████████  ███ ████ 
1674.5 |█████████████████ █████████ █ █  ████ ██████ █   ██ █████████████████ █████████ 
1630.6 |█████████████████ ███████████ █  █████████████   ████████████████████ █████████ 
1586.6 |███████████████████████████████ ██████████████   ████████████████████ █████████ 
1542.7 |█████████████████████████████████████████████████████████████████████ █████████ 
1498.8 |███████████████████████████████████████████████████████████████████████████████ 
1454.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16926
   1 ms | ██  900
   2 ms | █  313
   3 ms |   183
   4 ms |   74
   5 ms |   25
   6 ms |   11
   7 ms |   4
   8 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   1
  14 ms |   3
  15 ms |   16
  16 ms |   42
  17 ms |   96
  18 ms |   76
  19 ms |   62
  20 ms |   25
  21 ms |   23
  22 ms |   6
  23 ms |   10
  24 ms |   4
  26 ms |   3
  28 ms |   2
  29 ms |   2
  31 ms |   3
  32 ms |   1
  34 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms |   2
  41 ms |   1
  43 ms |   1
  44 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `46.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `28.79`
- `fps_1pct_low` = `46.18`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `941.72`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `720.46`, min `24.71`, p50 `735.41`, p95 `1144.90`, p99 `1218.52`, 1%low `45.20`, 0.1%low `30.06`, std `293.58`

**Frame time (ms)**  avg `2.36`, p50 `1.36`, p95 `13.79`, p99 `18.99`, p99.9 `26.36`, max `40.48`

**Client tick (ms)**  avg `0.45`, p95 `0.71`, max `3.39`

**Memory**  start `3293 MB`, end `2412 MB`, peak `4558 MB`, GC `16 events / 213 ms`

**FPS over sampling window (ASCII):**

```
871.0 |                           █                                                    
839.4 |          █       ██       █                          █                         
807.7 |██        ██  █   ███  █  ██       █  █              ██    █      █             
776.1 |████      ██  █   ███  ██ ██ █   █ █  █             ███  █ █  █   █             
744.4 |████ █    ██  █  █████ ██ ██ █  ████  ██ █   █      ████ █ █  ██  █ █       ██  
712.8 |███████   ██  █ █████████ ████ █████  ██ ██  █    █ ██████ █  ██  ███       ██  
681.1 |███████   ██ ███████████████████████  ██████ █ █  █ █████████ ███████  ██   ███ 
649.5 |████████  ██ ████████████████████████ ████████ █  ███████████████████ ███ ██████
617.8 |████████  ███████████████████████████ ████████ ██████████████████████████ ██████
586.2 |█████████ ███████████████████████████ ███████████████████████████████████ ██████
554.5 |█████████ ██████████████████████████████████████████████████████████████████████
522.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████  1697
   1 ms | ████████████████████████████████████████  4858
   2 ms | █████████  1051
   3 ms | ██  264
   4 ms | █  105
   5 ms |   36
   6 ms |   13
   7 ms |   10
   8 ms |   9
   9 ms |   5
  10 ms |   2
  13 ms |   9
  14 ms | █  73
  15 ms | █  98
  16 ms | █  70
  17 ms |   50
  18 ms |   43
  19 ms |   30
  20 ms |   17
  21 ms |   12
  22 ms |   9
  23 ms |   3
  24 ms |   2
  25 ms |   3
  26 ms |   1
  28 ms |   1
  30 ms |   1
  31 ms |   1
  32 ms |   1
  33 ms |   2
  35 ms |   1
  40 ms |   1
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `66.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `30.06`
- `part` = `1.00`
- `fps_harmonic_avg` = `423.91`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `56.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `45.20`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23541 ms  |  Sample ticks: 400

**FPS**  avg `714.26`, min `20.98`, p50 `751.43`, p95 `1098.39`, p99 `1207.72`, 1%low `47.01`, 0.1%low `30.55`, std `260.50`

**Frame time (ms)**  avg `2.27`, p50 `1.33`, p95 `7.31`, p99 `18.20`, p99.9 `23.85`, max `47.65`

**Client tick (ms)**  avg `0.49`, p95 `0.75`, max `5.69`

**Memory**  start `4165 MB`, end `3750 MB`, peak `4730 MB`, GC `16 events / 206 ms`

**FPS over sampling window (ASCII):**

```
860.1 |     █                                                                          
831.6 | █ █ █                                                                          
803.2 | █ █ █   █      █        █ █                                                    
774.8 |██ ███ ███   █ ██  █    ██ █  █         █   █                                   
746.3 |██████ █████ █ ██ ██ █████ █ ███ █ █    █   █ █ █  █ █  █                    █  
717.9 |██████ █████ █ █████ █████ █ █████ █ ████ █ █ █ █ ██ █ ██ ███        █  █    █  
689.5 |████████████ ███████ █████████████ ██████ █ █ ████████ ██ ██████ ███ █  █    █ █
661.1 |████████████ █████████████████████ ████████ █ ███████████ ██████████ █ ███ █ █ █
632.6 |████████████ █████████████████████ ████████ ████████████████████████████████ █ █
604.2 |███████████████████████████████████████████ ████████████████████████████████ █ █
575.8 |███████████████████████████████████████████ ██████████████████████████████████ █
547.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████  1005
   1 ms | ████████████████████████████████████████  6292
   2 ms | ████  673
   3 ms | ██  261
   4 ms | █  95
   5 ms |   36
   6 ms |   13
   7 ms |   10
   8 ms |   3
   9 ms |   3
  10 ms |   2
  11 ms |   1
  13 ms |   22
  14 ms |   77
  15 ms | █  92
  16 ms | █  82
  17 ms |   49
  18 ms |   36
  19 ms |   27
  20 ms |   14
  21 ms |   5
  22 ms |   8
  23 ms |   3
  24 ms |   1
  26 ms |   1
  28 ms |   2
  29 ms |   1
  32 ms |   1
  33 ms |   1
  42 ms |   1
  47 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `499.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `30.55`
- `part` = `1.00`
- `fps_harmonic_avg` = `440.72`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.01`
- `surface_water_ratio` = `0.04`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `828.11`, min `21.93`, p50 `870.97`, p95 `1241.88`, p99 `1313.12`, 1%low `49.12`, 0.1%low `32.44`, std `304.73`

**Frame time (ms)**  avg `1.97`, p50 `1.15`, p95 `4.43`, p99 `17.31`, p99.9 `24.92`, max `45.60`

**Client tick (ms)**  avg `0.35`, p95 `0.58`, max `0.90`

**Memory**  start `2902 MB`, end `3772 MB`, peak `5149 MB`, GC `15 events / 179 ms`

**FPS over sampling window (ASCII):**

```
987.2 |█         █ ██                                                                  
951.9 |██    ██  ████              █                                                   
916.6 |███   ██  ██████   █  █ █   ██                   █                              
881.3 |█████████ ██████   █ ████  ████  █               █ █  █ █          █       █    
845.9 |█████████ ██████████ ████ ██████ █ █     █    ██ ███  █ █          █   █   █    
810.6 |█████████ ███████████████ ██████ ███     █ █ ███████ █████  █    █ █   █   █   █
775.3 |█████████████████████████ ██████████     ███ ███████ ██████ █    ███ █ ██  ██  █
740.0 |█████████████████████████ ███████████    ███ ███████ ████████ █ █████████████  █
704.7 |█████████████████████████████████████  █████ ████████████████████████████████  █
669.3 |█████████████████████████████████████████████████████████████████████████████  █
634.0 |█████████████████████████████████████████████████████████████████████████████ ██
598.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████  3496
   1 ms | ████████████████████████████████████████  5213
   2 ms | █████  712
   3 ms | ██  196
   4 ms | █  69
   5 ms |   32
   6 ms |   6
   7 ms |   8
   8 ms |   3
   9 ms |   1
  10 ms |   4
  12 ms |   2
  13 ms |   63
  14 ms | █  115
  15 ms | █  71
  16 ms |   52
  17 ms |   51
  18 ms |   20
  19 ms |   18
  20 ms |   7
  21 ms |   5
  22 ms |   4
  23 ms |   4
  24 ms |   2
  25 ms |   1
  26 ms |   2
  27 ms |   2
  28 ms |   2
  34 ms |   1
  38 ms |   1
  45 ms |   1
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `32.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `32.44`
- `part` = `1.00`
- `fps_harmonic_avg` = `508.20`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `57.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.12`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `755.57`, min `31.17`, p50 `796.19`, p95 `1142.15`, p99 `1234.53`, 1%low `47.35`, 0.1%low `36.20`, std `286.30`

**Frame time (ms)**  avg `2.20`, p50 `1.26`, p95 `6.22`, p99 `18.69`, p99.9 `23.72`, max `32.08`

**Client tick (ms)**  avg `0.42`, p95 `0.59`, max `12.07`

**Memory**  start `4729 MB`, end `4773 MB`, peak `5374 MB`, GC `15 events / 210 ms`

**FPS over sampling window (ASCII):**

```
909.1 |        █                                                                       
876.5 |      █ ██                                                                      
843.9 | ██ ██████       █  █ █  █          █                                           
811.3 |██████████ ██ █ ██ ██ █  █  █       █  █              █ █                       
778.7 |██████████ ██ █ ██ ██ █  ██ █    █  ████  █  ██     ███████          ██       █ 
746.0 |█████████████ ███████ █  █████  ██ █████  █  ██  █  ████████ █  █    ██ █     █ 
713.4 |█████████████████████ ██ ███████████████  █  ██  ███████████ █  █  █ ██ ██   ██ 
680.8 |████████████████████████████████████████████ ██████████████████ ████ ██ ████ ███
648.2 |███████████████████████████████████████████████████████████████ ████ ███████████
615.5 |███████████████████████████████████████████████████████████████ ████ ███████████
582.9 |████████████████████████████████████████████████████████████████████ ███████████
550.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████  1978
   1 ms | ████████████████████████████████████████  5420
   2 ms | ██████  860
   3 ms | ██  259
   4 ms | █  74
   5 ms |   30
   6 ms |   15
   7 ms |   8
   8 ms |   4
   9 ms |   2
  10 ms |   2
  11 ms |   2
  12 ms |   2
  13 ms |   15
  14 ms |   65
  15 ms | █  108
  16 ms | █  71
  17 ms |   50
  18 ms |   36
  19 ms |   27
  20 ms |   19
  21 ms |   15
  22 ms |   4
  23 ms |   6
  24 ms |   2
  25 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   2
  32 ms |   1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `54.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `36.20`
- `part` = `1.00`
- `fps_harmonic_avg` = `454.04`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.35`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23999 ms  |  Sample ticks: 400

**FPS**  avg `778.41`, min `28.89`, p50 `817.10`, p95 `1191.05`, p99 `1259.19`, 1%low `48.15`, 0.1%low `36.28`, std `292.03`

**Frame time (ms)**  avg `2.10`, p50 `1.22`, p95 `4.91`, p99 `17.92`, p99.9 `24.00`, max `34.62`

**Client tick (ms)**  avg `0.48`, p95 `0.65`, max `27.21`

**Memory**  start `2867 MB`, end `4767 MB`, peak `5684 MB`, GC `14 events / 173 ms`

**FPS over sampling window (ASCII):**

```
959.2 |      █                                                                         
921.3 |█ ██ ██                █  █   █                                                 
883.4 |█ ██ █████   ██████   ██ ██  ██ ██                                              
845.4 |███████████  ██████  ███████ ██ ███ ██                                          
807.5 |███████████████████████████████████ ███                                 █       
769.6 |██████████████████████████████████████████    █    █   █     █        █ █       
731.6 |██████████████████████████████████████████  █ ████████ ██    ██  █    █ █       
693.7 |██████████████████████████████████████████  █ ████████ ██    ███ █    █ █ █  ██ 
655.8 |██████████████████████████████████████████  ████████████████ █████  █ ███ ██████
617.8 |████████████████████████████████████████████████████████████ ██████ ████████████
579.9 |███████████████████████████████████████████████████████████████████ ████████████
542.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████  2377
   1 ms | ████████████████████████████████████████  5515
   2 ms | ██████  835
   3 ms | ██  236
   4 ms | █  76
   5 ms |   26
   6 ms |   11
   7 ms |   3
   8 ms |   3
   9 ms |   3
  10 ms |   1
  12 ms |   1
  13 ms |   11
  14 ms | █  105
  15 ms | █  106
  16 ms | █  72
  17 ms |   35
  18 ms |   29
  19 ms |   21
  20 ms |   11
  21 ms |   9
  22 ms |   7
  23 ms |   6
  24 ms |   2
  25 ms |   3
  27 ms |   1
  28 ms |   1
  29 ms |   1
  31 ms |   1
  34 ms |   1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `11.00`
- `entity_count_delta` = `-10.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `951.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `36.28`
- `part` = `1.00`
- `fps_harmonic_avg` = `475.51`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `57.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.15`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 25679 ms  |  Sample ticks: 400

**FPS**  avg `713.05`, min `22.43`, p50 `739.04`, p95 `1113.63`, p99 `1212.99`, 1%low `45.94`, 0.1%low `31.53`, std `272.75`

**Frame time (ms)**  avg `2.31`, p50 `1.35`, p95 `6.77`, p99 `18.87`, p99.9 `24.85`, max `44.59`

**Client tick (ms)**  avg `0.50`, p95 `0.78`, max `3.97`

**Memory**  start `4174 MB`, end `5839 MB`, peak `6000 MB`, GC `13 events / 163 ms`

**FPS over sampling window (ASCII):**

```
888.5 |          █                                                                     
855.9 |   █      █              █                                                      
823.2 | ███ █    ██  █ █     █  █  █                     █                             
790.6 | ███ █ ██ ███ ███  █  █ ██ ██  █                  █                             
758.0 |██████ ██ ███ ████ █ ██ ██ ██  █  █           █   █ █        █        █         
725.3 |██████ ██ ████████ ███████ ██ ██ ██ █ █       ██  █ █ █ █  █ █ █  █   █         
692.7 |██████ ██ ████████ ███████ ████████ ███  █    ███ █ ███ █  █ ███  █  ██    █ █ █
660.1 |██████████████████ ████████████████████  █ █ ██████████ ██ █ ████ ██████   █ ███
627.4 |██████████████████ ████████████████████  ███ ███████████████████████████   █ ███
594.8 |██████████████████ ██████████████████████████████████████████████████████  █████
562.2 |██████████████████ ██████████████████████████████████████████████████████ ██████
529.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  1254
   1 ms | ████████████████████████████████████████  5645
   2 ms | ███████  962
   3 ms | ██  226
   4 ms | █  88
   5 ms |   38
   6 ms |   21
   7 ms |   4
   8 ms |   4
   9 ms |   1
  11 ms |   2
  13 ms |   18
  14 ms |   69
  15 ms | █  80
  16 ms |   64
  17 ms |   61
  18 ms |   45
  19 ms |   29
  20 ms |   22
  21 ms |   9
  22 ms |   8
  23 ms |   3
  24 ms |   3
  25 ms |   1
  26 ms |   2
  27 ms |   1
  30 ms |   1
  32 ms |   1
  34 ms |   1
  38 ms |   1
  44 ms |   1
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `39.00`
- `entity_count_delta` = `-35.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preload_duration_ms` = `2652.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `31.53`
- `part` = `1.00`
- `fps_harmonic_avg` = `433.24`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `45.94`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `781.59`, min `18.86`, p50 `819.08`, p95 `1181.80`, p99 `1273.24`, 1%low `49.24`, 0.1%low `33.65`, std `290.75`

**Frame time (ms)**  avg `2.08`, p50 `1.22`, p95 `4.71`, p99 `17.74`, p99.9 `22.31`, max `53.02`

**Client tick (ms)**  avg `0.41`, p95 `0.65`, max `3.47`

**Memory**  start `4701 MB`, end `5967 MB`, peak `6252 MB`, GC `11 events / 176 ms`

**FPS over sampling window (ASCII):**

```
984.8 |   █                                                                            
951.4 |   █       █                                                                    
918.1 |   ███     █                                                                    
884.7 |██ ██████ ██     █          █                                                   
851.4 |██ ██████████    █    █ ███ ██ █    █                                           
818.0 |█████████████ ██ █    █ ██████ █   ██          █ █         █                    
784.7 |██████████████████   █████████████ ██  █    ███████    █   █    █               
751.3 |██████████████████   ████████████████████ ██████████  ███  █    █ ███████  █    
718.0 |███████████████████  ████████████████████ ███████████ ██████    █ ████████ █   █
684.6 |█████████████████████████████████████████ ███████████ ██████ ████ ████████ ███ █
651.3 |█████████████████████████████████████████████████████ ████████████████████████ █
617.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████  2444
   1 ms | ████████████████████████████████████████  5606
   2 ms | ██████  794
   3 ms | ██  215
   4 ms | █  82
   5 ms |   25
   6 ms |   6
   7 ms |   5
   8 ms |   5
   9 ms |   2
  10 ms |   2
  11 ms |   1
  13 ms |   20
  14 ms | █  99
  15 ms | █  111
  16 ms |   53
  17 ms |   51
  18 ms |   37
  19 ms |   20
  20 ms |   11
  21 ms |   8
  22 ms |   5
  23 ms |   1
  26 ms |   2
  28 ms |   1
  34 ms |   1
  36 ms |   1
  53 ms |   1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `33.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `33.65`
- `part` = `1.00`
- `fps_harmonic_avg` = `480.30`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.24`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25696 ms  |  Sample ticks: 400

**FPS**  avg `710.50`, min `24.92`, p50 `743.23`, p95 `1092.87`, p99 `1185.68`, 1%low `46.78`, 0.1%low `33.07`, std `272.53`

**Frame time (ms)**  avg `2.33`, p50 `1.35`, p95 `10.80`, p99 `18.90`, p99.9 `23.75`, max `40.14`

**Client tick (ms)**  avg `0.37`, p95 `0.56`, max `3.13`

**Memory**  start `3845 MB`, end `5775 MB`, peak `6558 MB`, GC `10 events / 143 ms`

**FPS over sampling window (ASCII):**

```
859.6 |██      █                                                                       
831.2 |██  █ ███   █                             █                                     
802.8 |██ ██████ ███        █                    █                                  █  
774.4 |██ ██████████        █ ███               ██    █                             █  
746.1 |██ ██████████   ██   █ ███ ███ █ █   █   ██    █             █   ██    █     █ █
717.7 |█████████████   ██   █ ███████████   █ █ ██   ██  █        █ █ █ ███ ███ █ █ █ █
689.3 |█████████████   ██ █ █████████████ █ █ ████   ██ ██        █ █ █ ███ ███ █ █ █ █
660.9 |█████████████   ██ █████████████████ ██████ ███████ █ █    █ █ █ █████████ █ █ █
632.6 |██████████████  ████████████████████ ██████ █████████ █  ███ █████████████ ███ █
604.2 |██████████████ ████████████████████████████████████████  ███ █████████████ ███ █
575.8 |████████████████████████████████████████████████████████ ███ ███████████████████
547.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  1231
   1 ms | ████████████████████████████████████████  5538
   2 ms | ███████  971
   3 ms | ██  245
   4 ms | █  90
   5 ms |   37
   6 ms |   13
   7 ms |   8
   8 ms |   4
   9 ms |   2
  10 ms |   3
  13 ms |   7
  14 ms |   65
  15 ms | █  99
  16 ms | █  73
  17 ms |   56
  18 ms |   44
  19 ms |   33
  20 ms |   23
  21 ms |   11
  22 ms |   6
  23 ms |   3
  24 ms |   2
  25 ms |   1
  29 ms |   1
  30 ms |   1
  37 ms |   1
  38 ms |   1
  40 ms |   1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-4.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `2641.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `33.07`
- `part` = `1.00`
- `fps_harmonic_avg` = `428.47`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.78`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `713.34`, min `21.91`, p50 `733.54`, p95 `1108.51`, p99 `1196.58`, 1%low `45.93`, 0.1%low `31.35`, std `272.44`

**Frame time (ms)**  avg `2.31`, p50 `1.36`, p95 `7.17`, p99 `19.07`, p99.9 `25.16`, max `45.63`

**Client tick (ms)**  avg `0.49`, p95 `0.77`, max `11.00`

**Memory**  start `4878 MB`, end `4992 MB`, peak `6774 MB`, GC `11 events / 197 ms`

**FPS over sampling window (ASCII):**

```
892.9 |    █                                                                           
861.7 |  █ █                                                                           
830.5 |  █ ██                                                    █          █          
799.4 |███ ██       █                                            █   █      █          
768.2 |██████       █ █           █                              ██ ███  ████ █        
737.0 |████████  ██████      █   ██   █    █  █    █    █  █     ██████ ███████       █
705.9 |████████  ███████     ██████  ██    █████   ████ ████    ███████ ████████      █
674.7 |█████████████████ █   ██████ ███ ██ █████  ██████████ █ ███████████████████   ██
643.5 |█████████████████ ██ ███████████ ██ █████████████████ █ ███████████████████   ██
612.4 |█████████████████ ██ ███████████████████████████████████████████████████████ ███
581.2 |████████████████████ ███████████████████████████████████████████████████████████
550.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  1313
   1 ms | ████████████████████████████████████████  5650
   2 ms | ██████  886
   3 ms | ██  230
   4 ms |   69
   5 ms |   50
   6 ms |   14
   7 ms |   7
   8 ms |   2
   9 ms |   2
  10 ms |   3
  12 ms |   1
  13 ms |   2
  14 ms |   57
  15 ms | █  99
  16 ms | █  77
  17 ms |   60
  18 ms |   36
  19 ms |   42
  20 ms |   12
  21 ms |   14
  22 ms |   6
  23 ms |   2
  24 ms |   4
  25 ms |   2
  26 ms |   1
  27 ms |   1
  28 ms |   1
  31 ms |   2
  44 ms |   1
  45 ms |   1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `15.00`
- `entity_count_delta` = `-13.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `46.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `31.35`
- `part` = `1.00`
- `fps_harmonic_avg` = `432.60`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `45.93`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 24239 ms  |  Sample ticks: 400

**FPS**  avg `792.40`, min `26.54`, p50 `814.54`, p95 `1225.92`, p99 `1320.61`, 1%low `50.08`, 0.1%low `35.90`, std `304.25`

**Frame time (ms)**  avg `2.07`, p50 `1.23`, p95 `4.72`, p99 `17.76`, p99.9 `22.10`, max `37.68`

**Client tick (ms)**  avg `0.32`, p95 `0.44`, max `8.86`

**Memory**  start `5127 MB`, end `5154 MB`, peak `7132 MB`, GC `10 events / 160 ms`

**FPS over sampling window (ASCII):**

```
1031.7 | ██                                                                             
989.1 | ██      █                                                                      
946.4 |███████  █  █  █                                                                
903.8 |████████ ██ ██ █                       █                                        
861.2 |███████████ ██ ██ ██  ██       █  █    █             █  █ █                     
818.6 |███████████ ██ █████  ██       █ ██ █  █    █  █  █  ██ █ █     █          █    
776.0 |██████████████ ███████████ ██ ██ ███████  █ ██ █ ████████ █ █  ██          █ █  
733.3 |██████████████████████████ █████████████  ██████ ████████████  ██     ██   ███  
690.7 |█████████████████████████████████████████████████████████████  ██   ████   █████
648.1 |██████████████████████████████████████████████████████████████████  ████  ██████
605.5 |████████████████████████████████████████████████████████████████████████  ██████
562.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████████  2811
   1 ms | ████████████████████████████████████████  5278
   2 ms | ██████  814
   3 ms | ██  206
   4 ms | █  66
   5 ms |   28
   6 ms |   14
   7 ms |   5
   8 ms |   4
   9 ms |   4
  10 ms |   2
  12 ms |   1
  13 ms |   13
  14 ms | █  73
  15 ms | █  112
  16 ms | █  80
  17 ms |   54
  18 ms |   37
  19 ms |   24
  20 ms |   8
  21 ms |   5
  22 ms |   3
  23 ms |   3
  24 ms |   1
  31 ms |   2
  37 ms |   2
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1211.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `35.90`
- `part` = `1.00`
- `fps_harmonic_avg` = `482.51`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `56.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.08`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `741.53`, min `22.33`, p50 `778.09`, p95 `1108.46`, p99 `1204.99`, 1%low `46.66`, 0.1%low `28.69`, std `264.91`

**Frame time (ms)**  avg `2.18`, p50 `1.29`, p95 `5.80`, p99 `18.36`, p99.9 `25.57`, max `44.78`

**Client tick (ms)**  avg `0.40`, p95 `0.53`, max `14.48`

**Memory**  start `5511 MB`, end `6565 MB`, peak `7378 MB`, GC `14 events / 183 ms`

**FPS over sampling window (ASCII):**

```
942.4 | █                                                                              
907.1 |██  ███                                                                         
871.8 |██  ████           █                                                            
836.5 |███ ████      █ ████   █       ██                                               
801.2 |████████   █  ███████ ██  █    ██ █    █                                        
765.9 |████████ █ █ ████████ ██  ██ ████████  ██          █                            
730.6 |██████████ █████████████████ ████████ ████ █       █   █  ██ █ █    █ █         
695.3 |██████████ █████████████████████████████████ █   ████ ████████ █   ███████ █    
660.0 |████████████████████████████████████████████ █ █████████████████ █ ████████████ 
624.7 |████████████████████████████████████████████ █ █████████████████████████████████
589.4 |████████████████████████████████████████████ █ █████████████████████████████████
554.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  1404
   1 ms | ████████████████████████████████████████  6233
   2 ms | █████  824
   3 ms | █  178
   4 ms |   63
   5 ms |   32
   6 ms |   17
   7 ms |   3
   8 ms |   5
   9 ms |   3
  10 ms |   2
  11 ms |   1
  13 ms |   21
  14 ms | █  92
  15 ms | █  104
  16 ms |   60
  17 ms |   39
  18 ms |   44
  19 ms |   24
  20 ms |   16
  21 ms |   4
  22 ms |   6
  23 ms |   1
  24 ms |   3
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   1
  31 ms |   1
  39 ms |   1
  42 ms |   1
  43 ms |   1
  44 ms |   1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `48.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `28.69`
- `part` = `1.00`
- `fps_harmonic_avg` = `459.59`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.66`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `789.72`, min `23.54`, p50 `819.93`, p95 `1172.42`, p99 `1245.54`, 1%low `47.84`, 0.1%low `32.34`, std `285.99`

**Frame time (ms)**  avg `2.07`, p50 `1.22`, p95 `4.92`, p99 `18.12`, p99.9 `23.36`, max `42.49`

**Client tick (ms)**  avg `0.40`, p95 `0.56`, max `3.87`

**Memory**  start `6432 MB`, end `5335 MB`, peak `7377 MB`, GC `14 events / 209 ms`

**FPS over sampling window (ASCII):**

```
941.3 |  █    █   █                 █                                                  
904.5 |█ ██████  ██        █   █  █ █                                                  
867.6 |█████████████ █  ██ █   ████ █        █  █       █                              
830.8 |████████████████ ██ ██  ████ ██ ██    █  █ █   ███             █                
793.9 |████████████████ ██ ███████████ ██████████ ██ ██████   █       ███   █          
757.0 |████████████████ ██████████████ ████████████████████  ██   ██  ███  ██   ██  █  
720.2 |████████████████████████████████████████████████████  ██   ██  ███ ███ █ ███ █  
683.3 |████████████████████████████████████████████████████  ███  ███ ███████ █ █████  
646.4 |█████████████████████████████████████████████████████ ████ ███ ███████ ███████  
609.6 |██████████████████████████████████████████████████████████████████████████████  
572.7 |███████████████████████████████████████████████████████████████████████████████ 
535.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████  2609
   1 ms | ████████████████████████████████████████  5593
   2 ms | █████  763
   3 ms | █  168
   4 ms |   56
   5 ms |   24
   6 ms |   17
   7 ms |   10
   8 ms |   2
   9 ms |   4
  10 ms |   4
  11 ms |   1
  13 ms |   9
  14 ms | █  83
  15 ms | █  104
  16 ms |   68
  17 ms |   52
  18 ms |   35
  19 ms |   23
  20 ms |   21
  21 ms |   10
  22 ms |   3
  23 ms |   2
  24 ms |   1
  25 ms |   1
  27 ms |   2
  30 ms |   1
  33 ms |   1
  35 ms |   1
  37 ms |   1
  42 ms |   1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `12.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `17.00`
- `preload_duration_ms` = `50.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `32.34`
- `part` = `1.00`
- `fps_harmonic_avg` = `483.53`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.84`
- `surface_water_ratio` = `0.01`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `2135.27`, min `9.09`, p50 `2171.93`, p95 `3214.39`, p99 `3474.22`, 1%low `39.77`, 0.1%low `20.21`, std `660.76`

**Frame time (ms)**  avg `0.87`, p50 `0.46`, p95 `1.13`, p99 `18.83`, p99.9 `30.74`, max `109.96`

**Client tick (ms)**  avg `0.55`, p95 `0.56`, max `28.13`

**Memory**  start `6371 MB`, end `5141 MB`, peak `7391 MB`, GC `23 events / 589 ms`

**FPS over sampling window (ASCII):**

```
2950.8 |                                                      █                         
2832.6 |                    █                                 █                  █      
2714.5 |            █       █                                 █                █ █      
2596.3 |            █    █  █                                 █                █ █ █    
2478.1 |            █    █  █                                 █       █ █    █ █ ████   
2359.9 |          █ ██ █ █  ███          █                    █       █ ████ █ █ ████   
2241.7 |        █ █ ██ ███  ███    ██ ██ █ ██                 █       █ ████ ████████   
2123.6 |██      ███████████████   ████████ ██ █ █            ███      █ ██████████████  
2005.4 |██   █  ███████████████   ███████████ █ █     █      ███     ██████████████████ 
1887.2 |████ █ ██████████████████████████████████     ████████████  ████████████████████
1769.0 |██████████████████████████████████████████  █ ████████████  ████████████████████
1650.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19699
   1 ms | █  649
   2 ms |   150
   3 ms |   96
   4 ms |   48
   5 ms |   12
   6 ms |   14
   7 ms |   11
   8 ms |   5
   9 ms |   1
  10 ms |   4
  11 ms |   1
  12 ms |   9
  13 ms |   5
  14 ms |   7
  15 ms |   8
  16 ms |   18
  17 ms |   24
  18 ms |   36
  19 ms |   34
  20 ms |   24
  21 ms |   32
  22 ms |   26
  23 ms |   21
  24 ms |   9
  25 ms |   11
  26 ms |   9
  27 ms |   7
  28 ms |   4
  29 ms |   2
  30 ms |   3
  31 ms |   1
  32 ms |   1
  33 ms |   2
  34 ms |   1
  35 ms |   2
  36 ms |   1
  39 ms |   1
  44 ms |   1
  45 ms |   1
  47 ms |   2
  48 ms |   1
  49 ms |   1
  53 ms |   1
  54 ms |   1
  55 ms |   1
  63 ms |   1
 109 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `1923.00`
- `fps_1pct_low` = `39.77`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `1144.15`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `20.21`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `58.00`
- `preset_long` = `0.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23973 ms  |  Sample ticks: 400

**FPS**  avg `187.55`, min `0.91`, p50 `193.54`, p95 `382.18`, p99 `406.04`, 1%low `2.12`, 0.1%low `0.91`, std `106.81`

**Frame time (ms)**  avg `17.82`, p50 `5.17`, p95 `41.02`, p99 `308.27`, p99.9 `771.89`, max `1095.88`

**Client tick (ms)**  avg `9.36`, p95 `22.81`, max `329.45`

**Memory**  start `6042 MB`, end `6065 MB`, peak `7372 MB`, GC `10 events / 509 ms`

**FPS over sampling window (ASCII):**

```
376.5 |     █                                                                          
346.6 |    ██ █                         █  █                                           
316.7 |████████                         █  ██                                          
286.7 |█████████                   █    █  ██                                          
256.8 |█████████                   ██  ██  ██                                          
226.9 |█████████                   ██  ██  ██                             ███   █      
197.0 |██████████           ███  █ ██  ███ ██   █               █  █ █    ███ █ █    ██
167.0 |██████████ █    █  █ ████ █████████ ███  █     ██       █████████ ████ █████ ███
137.1 |██████████ █    █████████ ████████████████ ██ ████ ███  ████████████████████████
107.2 |██████████ █    ████████████████████████████████████████████████████████████████
 77.3 |██████████████ █████████████████████████████████████████████████████████████████
 47.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ████████████████████████  150
   3 ms | ██████████████████████  137
   4 ms | ████████████████████████████████████████  253
   5 ms | ██████████████████████████████  188
   6 ms | ████████  53
   7 ms | ██████  37
   8 ms | ██████  36
   9 ms | ██████  41
  10 ms | ███  17
  11 ms | ██  11
  12 ms | ██  14
  13 ms | █  5
  14 ms | █  5
  15 ms | █  5
  16 ms | ██  12
  17 ms | ██  10
  18 ms | ███  19
  19 ms | ██  15
  20 ms | ███  17
  21 ms | ██  10
  22 ms | ███  19
  23 ms | █  8
  24 ms | ██  15
  25 ms | █  4
  26 ms | █  4
  27 ms | █  7
  28 ms |   2
  29 ms |   3
  30 ms |   3
  31 ms |   3
  32 ms |   3
  33 ms |   2
  36 ms |   2
  37 ms |   2
  39 ms |   1
  40 ms |   1
  41 ms |   1
  42 ms |   1
  44 ms |   3
  45 ms |   1
  47 ms |   2
  48 ms |   2
  49 ms |   1
  51 ms |   2
  70 ms |   1
  74 ms |   1
  77 ms |   1
  82 ms |   1
  83 ms |   1
  84 ms |   1
  99 ms |   1
 104 ms |   1
 106 ms |   1
 107 ms |   2
 114 ms |   1
 118 ms |   1
 121 ms |   1
 132 ms |   1
 155 ms |   1
 158 ms |   1
 190 ms |   1
 193 ms |   1
 202 ms |   1
 207 ms |   1
 213 ms |   1
 215 ms |   1
 218 ms |   1
 239 ms |   1
 241 ms |   1
 244 ms |   1
 246 ms |   2
 249 ms |   1
 260 ms |   1
 298 ms |   1
 302 ms |   1
 307 ms |   1
 310 ms |   1
 321 ms |   1
 327 ms |   1
 345 ms |   1
 357 ms |   1
 368 ms |   1
 371 ms |   1
 382 ms |   1
 443 ms |   1
 506 ms |   1
 826 ms |   1
1095 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `0.91`
- `fps_1pct_low` = `2.12`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `0.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `56.12`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23997 ms  |  Sample ticks: 400

**FPS**  avg `2014.29`, min `0.74`, p50 `2010.77`, p95 `3059.23`, p99 `3278.47`, 1%low `30.72`, 0.1%low `8.67`, std `668.48`

**Frame time (ms)**  avg `1.01`, p50 `0.50`, p95 `1.38`, p99 `19.52`, p99.9 `33.15`, max `1355.54`

**Client tick (ms)**  avg `0.59`, p95 `1.05`, max `37.91`

**Memory**  start `3975 MB`, end `4681 MB`, peak `7377 MB`, GC `21 events / 560 ms`

**FPS over sampling window (ASCII):**

```
2844.4 |                                                                           █    
2705.2 | █                         █             ██  █                             █    
2566.0 | █                         █             █████ ██                          █    
2426.8 |███               █        █         █   █████ ██                       █ ██    
2287.5 |███    █          █    █   █      █  █  ██████ ███                   █  █ ██    
2148.3 |███    █          █    ██ ███ █   █  █ ███████ ███  ██               █  █ ██    
2009.1 |███ █  █         ██ █ ███ ███ ██ ███ █████████████  ██ ███        ██ █ █████    
1869.9 |██████ █    █   █████████████ ██ ███ ██████████████████████       ██████████ ███
1730.7 |████████    █   █████████████ █████████████████████████████       ██████████████
1591.5 |█████████   █   ███████████████████████████████████████████████ ████████████████
1452.3 |█████████████ █████████████████████████████████████████████████ ████████████████
1313.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  19109
   1 ms | ██  795
   2 ms |   187
   3 ms |   87
   4 ms |   40
   5 ms |   22
   6 ms |   22
   7 ms |   17
   8 ms |   6
   9 ms |   9
  10 ms |   7
  11 ms |   5
  12 ms |   7
  13 ms |   6
  14 ms |   6
  15 ms |   14
  16 ms |   23
  17 ms |   31
  18 ms |   21
  19 ms |   24
  20 ms |   42
  21 ms |   30
  22 ms |   20
  23 ms |   21
  24 ms |   12
  25 ms |   9
  26 ms |   12
  27 ms |   11
  28 ms |   7
  29 ms |   5
  30 ms |   2
  31 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms |   1
  40 ms |   1
  43 ms |   1
  44 ms |   1
  45 ms |   2
  47 ms |   2
  49 ms |   1
  52 ms |   1
  54 ms |   1
  55 ms |   1
  57 ms |   1
  59 ms |   1
  62 ms |   1
  73 ms |   1
  84 ms |   1
  91 ms |   1
1355 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `66.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `8.67`
- `part` = `1.00`
- `fps_harmonic_avg` = `987.04`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3968.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `30.72`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1498.57`, min `25.94`, p50 `1538.34`, p95 `2261.08`, p99 `2928.22`, 1%low `154.61`, 0.1%low `44.43`, std `458.25`

**Frame time (ms)**  avg `0.80`, p50 `0.65`, p95 `1.55`, p99 `3.65`, p99.9 `8.47`, max `38.55`

**Client tick (ms)**  avg `0.42`, p95 `0.60`, max `2.08`

**Memory**  start `6116 MB`, end `3996 MB`, peak `7377 MB`, GC `26 events / 434 ms`

**FPS over sampling window (ASCII):**

```
2742.6 |                                        █                                       
2605.3 |                                        █                                       
2468.1 |                                        █                                       
2330.9 |                                        █                                       
2193.6 |                                        ███                                     
2056.4 |                                        ███                                     
1919.2 |                                  █     ███                                     
1781.9 |       █            █             █   █ ███                                     
1644.7 | █ █   ██      █  █ █ █           █  ██ ███                            █        
1507.5 | ███ ██████    █ █████████ █      ████████████       █████████ ███     █ █      
1370.2 |████ ███████  █████████████████ ███████████████████ █████████████████ ████████  
1233.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18509
   1 ms | ████  1881
   2 ms | █  319
   3 ms |   126
   4 ms |   99
   5 ms |   26
   6 ms |   12
   7 ms |   3
   8 ms |   5
   9 ms |   3
  10 ms |   1
  15 ms |   1
  17 ms |   1
  18 ms |   1
  22 ms |   1
  23 ms |   1
  24 ms |   2
  25 ms |   2
  28 ms |   2
  30 ms |   1
  32 ms |   2
  33 ms |   1
  38 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `1243.83`
- `fps_1pct_low` = `154.61`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `49.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `44.43`
- `neighbour_updates` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1414.91`, min `28.92`, p50 `1452.67`, p95 `1895.41`, p99 `2586.78`, 1%low `172.80`, 0.1%low `45.90`, std `350.67`

**Frame time (ms)**  avg `0.80`, p50 `0.69`, p95 `1.32`, p99 `2.75`, p99.9 `7.66`, max `34.58`

**Client tick (ms)**  avg `0.41`, p95 `0.54`, max `3.54`

**Memory**  start `6699 MB`, end `5369 MB`, peak `7354 MB`, GC `28 events / 452 ms`

**FPS over sampling window (ASCII):**

```
2273.2 |                                                                        █       
2166.9 |                                                                        █       
2060.6 |                                                                        █       
1954.3 |                                                                        █       
1848.0 |                                                                        ██      
1741.7 |                     █                                                  ██      
1635.4 |      █              █                   █                              ██     █
1529.2 |      █  █          ██              █    █ █        █ █ █               ██  █ ██
1422.9 | █ ██ ██ █ █       ███████ █      ███ ██ ███      █████ ██████ ██ ███   ████████
1316.6 |█████████████    █████████████ █████████████████ ███████████████████████████████
1210.3 |███████████████ ████████████████████████████████████████████████████████████████
1104.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18997
   1 ms | ███  1595
   2 ms |   224
   3 ms |   79
   4 ms |   57
   5 ms |   14
   6 ms |   9
   7 ms |   6
   8 ms |   3
   9 ms |   1
  23 ms |   1
  24 ms |   5
  25 ms |   3
  27 ms |   2
  30 ms |   1
  31 ms |   1
  34 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `1245.31`
- `restocks` = `20.00`
- `fps_1pct_low` = `172.80`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `45.90`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1239.55`, min `29.65`, p50 `1279.44`, p95 `1590.49`, p99 `1885.86`, 1%low `172.05`, 0.1%low `40.45`, std `262.14`

**Frame time (ms)**  avg `0.89`, p50 `0.78`, p95 `1.42`, p99 `2.52`, p99.9 `7.96`, max `33.72`

**Client tick (ms)**  avg `0.39`, p95 `0.49`, max `1.34`

**Memory**  start `4646 MB`, end `3897 MB`, peak `7394 MB`, GC `29 events / 492 ms`

**FPS over sampling window (ASCII):**

```
1377.2 |         █              █                                            █          
1346.9 |       █ █             ████                       █      █  █   █    █          
1316.6 |█      █ █          █  ████   ██        █       █ █      █ ███  █ ██ █          
1286.2 |█      █ ██   █     █ █████ █ ██        █    █  ███      █████ ██ █████       █ 
1255.9 |█    █ ████   █     ███████ █ ██       ███   █  ████     █████ ████████       █ 
1225.6 |██  ██ █████  █     █████████████     ████  ██ █████     ██████████████       █ 
1195.3 |██  ██ █████████    █████████████  █ █████ █████████     ██████████████ █  ██ ██
1164.9 |██  █████████████ █ ██████████████ █ ████████████████ █  ████████████████████ ██
1134.6 |███ ███████████████ ██████████████ ██████████████████ █ █████████████████████ ██
1104.3 |█████████████████████████████████████████████████████ █ ████████████████████████
1074.0 |█████████████████████████████████████████████████████ ██████████████████████████
1043.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18240
   1 ms | █████  2399
   2 ms |   203
   3 ms |   70
   4 ms |   50
   5 ms |   13
   6 ms |   1
   7 ms |   3
   8 ms |   1
   9 ms |   1
  10 ms |   1
  22 ms |   1
  24 ms |   2
  25 ms |   5
  26 ms |   2
  27 ms |   2
  28 ms |   2
  30 ms |   2
  32 ms |   1
  33 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `24.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `40.45`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `1119.96`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `172.05`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195870 ms  |  Sample ticks: 3600

**FPS**  avg `242.51`, min `0.57`, p50 `250.82`, p95 `358.43`, p99 `460.13`, 1%low `29.19`, 0.1%low `6.63`, std `80.35`

**Frame time (ms)**  avg `4.94`, p50 `3.99`, p95 `9.12`, p99 `14.02`, p99.9 `39.79`, max `1752.90`

**Client tick (ms)**  avg `0.96`, p95 `1.72`, max `44.89`

**Memory**  start `4289 MB`, end `7018 MB`, peak `7718 MB`, GC `160 events / 4894 ms`

**FPS over sampling window (ASCII):**

```
320.1 | █                                             ███                              
302.6 |████                                      █    ████████████████                 
285.2 |█████                            █  █     █   ██████████████████  █████         
267.7 |█████                            █ ██   █ █   ████████████████████████████      
250.2 |█████                         ████ ██   █ █   ██████████████████████████████████
232.7 |█████                       █ ████ ██   █ █  ███████████████████████████████████
215.3 |█████ █     █               █ ███████   ████████████████████████████████████████
197.8 |█████ █     ██        █   ███████████ █ ████████████████████████████████████████
180.3 |████████   ████       ██  ██████████████████████████████████████████████████████
162.9 |████████ ███████      ██ ███████████████████████████████████████████████████████
145.4 |█████████████████ █ ████ ███████████████████████████████████████████████████████
127.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   173
   2 ms | ████████  2913
   3 ms | ████████████████████████████████████████  15432
   4 ms | ████████████████████  7699
   5 ms | █████████  3573
   6 ms | █████  1919
   7 ms | ████  1691
   8 ms | ███  1335
   9 ms | ██  743
  10 ms | █  408
  11 ms | █  199
  12 ms |   151
  13 ms |   87
  14 ms |   65
  15 ms |   54
  16 ms |   30
  17 ms |   22
  18 ms |   24
  19 ms |   17
  20 ms |   12
  21 ms |   4
  22 ms |   6
  23 ms |   8
  25 ms |   3
  26 ms |   3
  27 ms |   5
  28 ms |   4
  29 ms |   3
  30 ms |   7
  31 ms |   10
  32 ms |   8
  33 ms |   11
  34 ms |   8
  35 ms |   9
  36 ms |   8
  37 ms |   4
  38 ms |   3
  39 ms |   4
  41 ms |   2
  42 ms |   2
  43 ms |   1
  44 ms |   1
  46 ms |   2
  47 ms |   1
  48 ms |   1
  49 ms |   1
  52 ms |   1
  55 ms |   1
  57 ms |   1
  60 ms |   1
  62 ms |   1
  63 ms |   1
  64 ms |   1
  83 ms |   1
 166 ms |   1
 167 ms |   2
 168 ms |   2
 169 ms |   1
 171 ms |   1
 172 ms |   2
 173 ms |   1
 174 ms |   1
 175 ms |   1
 177 ms |   1
 178 ms |   1
 190 ms |   1
 193 ms |   1
1752 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `90.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `91.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `29.19`
- `fps_harmonic_avg` = `202.43`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `407.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `6.63`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `1.00`
- `trees_built` = `173.00`
- `phase` = `0.00`
- `segment_count` = `19.00`
- `part` = `2.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194757 ms  |  Sample ticks: 3600

**FPS**  avg `246.50`, min `5.66`, p50 `240.64`, p95 `343.30`, p99 `487.35`, 1%low `120.32`, 0.1%low `49.19`, std `64.63`

**Frame time (ms)**  avg `4.31`, p50 `4.16`, p95 `6.03`, p99 `6.64`, p99.9 `8.04`, max `176.57`

**Client tick (ms)**  avg `0.65`, p95 `0.82`, max `1.75`

**Memory**  start `5682 MB`, end `3956 MB`, peak `7397 MB`, GC `30 events / 544 ms`

**FPS over sampling window (ASCII):**

```
322.2 |                                       ██                                       
309.2 |                                       ██      █    ██                          
296.2 |                                      ███    ███    ██████████  █               
283.2 |                                      ███   ████   ███████████████  █████       
270.2 |█                                    ████   █████  ████████████████ ██████      
257.3 |█                               █████████   █████  █████████████████████████ ██ 
244.3 |█                             ████████████  █████  █████████████████████████████
231.3 |█           █                █████████████  █████  █████████████████████████████
218.3 |█   ██     ██                █████████████  █████ ██████████████████████████████
205.3 |█   ██     ███  ███    ██   ████████████████████████████████████████████████████
192.4 |█  ████  █████  █████ ██████████████████████████████████████████████████████████
179.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  343
   2 ms | █████  2120
   3 ms | ████████████████████████████████████████  16032
   4 ms | ███████████████████████████████  12592
   5 ms | █████████████████████  8405
   6 ms | █████  2077
   7 ms |   126
   8 ms |   17
   9 ms |   2
  10 ms |   3
  11 ms |   3
  13 ms |   1
  14 ms |   2
  15 ms |   1
  17 ms |   4
  18 ms |   3
  19 ms |   2
  20 ms |   2
  21 ms |   1
 176 ms |   2
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `91.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `120.32`
- `fps_harmonic_avg` = `231.88`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `407.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `49.19`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `74.00`
- `trees_built` = `173.00`
- `phase` = `1.00`
- `segment_count` = `19.00`
- `part` = `3.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193904 ms  |  Sample ticks: 3600

**FPS**  avg `114.48`, min `5.53`, p50 `113.09`, p95 `138.69`, p99 `151.25`, 1%low `65.85`, 0.1%low `22.56`, std `15.12`

**Frame time (ms)**  avg `8.90`, p50 `8.84`, p95 `10.66`, p99 `11.48`, p99.9 `14.63`, max `180.80`

**Client tick (ms)**  avg `0.66`, p95 `0.84`, max `4.45`

**Memory**  start `5748 MB`, end `3784 MB`, peak `7397 MB`, GC `25 events / 692 ms`

**FPS over sampling window (ASCII):**

```
134.9 |                                                                   █████        
131.5 |                                                                   █████████   █
128.0 |                                                                   █████████████
124.6 |                                                       ████        █████████████
121.2 |                                                       ███████████ █████████████
117.8 |                                          █    ███   ███████████████████████████
114.4 |   ██              █             █  █    ██   ████  ████████████████████████████
111.0 |█████     ██      ███           ██████   ███  ████ █████████████████████████████
107.6 |██████   ████     ███    ██     ██████  ████ ███████████████████████████████████
104.1 |██████   █████████████████████████████ █████ ███████████████████████████████████
100.7 |████████ ███████████████████████████████████ ███████████████████████████████████
 97.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   3
   3 ms |   11
   4 ms |   9
   5 ms |   45
   6 ms | ███  519
   7 ms | █████████████████████  3682
   8 ms | ████████████████████████████████████████  6994
   9 ms | ███████████████████████████████████  6082
  10 ms | █████████████  2359
  11 ms | ███  448
  12 ms |   47
  13 ms |   6
  14 ms |   3
  16 ms |   1
  17 ms |   2
  18 ms |   1
  19 ms |   2
  20 ms |   3
  21 ms |   4
  22 ms |   1
  23 ms |   1
  24 ms |   1
  25 ms |   1
 175 ms |   1
 178 ms |   1
 180 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `18.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `91.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `65.85`
- `fps_harmonic_avg` = `112.38`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `407.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `22.56`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `73.00`
- `trees_built` = `173.00`
- `phase` = `2.00`
- `segment_count` = `19.00`
- `part` = `4.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195035 ms  |  Sample ticks: 3600

**FPS**  avg `86.40`, min `5.67`, p50 `84.91`, p95 `109.08`, p99 `119.32`, 1%low `56.82`, 0.1%low `30.78`, std `13.55`

**Frame time (ms)**  avg `11.83`, p50 `11.78`, p95 `14.56`, p99 `15.50`, p99.9 `17.55`, max `176.52`

**Client tick (ms)**  avg `0.65`, p95 `0.84`, max `2.84`

**Memory**  start `3885 MB`, end `6738 MB`, peak `7398 MB`, GC `20 events / 316 ms`

**FPS over sampling window (ASCII):**

```
102.7 |                                                                      ███       
 99.9 |                                                     ██            █████████████
 97.0 |                                              ██ █   ███           █████████████
 94.1 |                                         █   █████  ████  █        █████████████
 91.2 |                                         ██  █████ █████ ██        █████████████
 88.3 |  █ █                                   ███  ███████████████████   █████████████
 85.4 | ████                              ██   ███ ████████████████████████████████████
 82.6 |██████    ███     ██              ███   ████████████████████████████████████████
 79.7 |███████  █████ █  ███           █████   ████████████████████████████████████████
 76.8 |████████ ███████ ████    █     █████████████████████████████████████████████████
 73.9 |█████████████████████   ████   █████████████████████████████████████████████████
 71.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   3
   3 ms |   2
   4 ms |   6
   5 ms |   4
   6 ms |   3
   7 ms |   30
   8 ms | ██████  549
   9 ms | ██████████████████  1622
  10 ms | ██████████████████████████████  2617
  11 ms | ████████████████████████████████████████  3530
  12 ms | ███████████████████████████████████  3097
  13 ms | ██████████████████████████  2279
  14 ms | ████████████  1069
  15 ms | ████  340
  16 ms |   39
  17 ms |   9
  18 ms |   2
  21 ms |   3
  22 ms |   2
  23 ms |   1
  24 ms |   1
  25 ms |   1
  26 ms |   1
  28 ms |   1
 176 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `16.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `90.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `56.82`
- `fps_harmonic_avg` = `84.51`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `407.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `30.78`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `74.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`

