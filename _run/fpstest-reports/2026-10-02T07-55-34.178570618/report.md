# MC Benchmark Core session — 2026-10-02T08:31:20.882656874+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1251.8 | 39.6 | 22.1 | 19.91 | 1.23 | 57 | 1853 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 884.1 | 40.8 | 25.6 | 20.69 | 1.31 | 63 | 1794 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 726.8 | 42.6 | 30.4 | 20.35 | 1.12 | 46 | 2686 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 450.8 | 32.9 | 21.1 | 24.68 | 1.30 | 91 | 943 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 895.5 | 42.4 | 28.8 | 20.28 | 1.22 | 54 | 1415 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 879.7 | 41.4 | 28.1 | 20.11 | 0.95 | 53 | 1241 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 751.4 | 41.5 | 29.6 | 20.68 | 1.14 | 54 | 1427 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 331.3 | 31.1 | 21.5 | 24.36 | 1.74 | 46 | 1737 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1063.4 | 33.9 | 20.0 | 23.05 | 4.67 | 90 | 1184 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 189.3 | 26.2 | 18.9 | 30.98 | 5.27 | 30 | 479 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 546.6 | 36.2 | 24.4 | 23.04 | 1.36 | 89 | 966 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 504.8 | 37.5 | 24.7 | 22.25 | 0.91 | 63 | 1016 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 765.5 | 33.9 | 22.0 | 24.03 | 4.71 | 36 | 1875 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 806.8 | 30.9 | 21.5 | 23.94 | 4.52 | 43 | 2456 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1343.2 | 14.5 | 10.5 | 56.01 | 18.28 | 33 | 855 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1265.6 | 10.7 | 7.9 | 73.12 | 19.28 | 30 | 1183 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1378.3 | 41.0 | 30.2 | 21.23 | 2.90 | 80 | 294 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1701.8 | 40.7 | 25.2 | 20.41 | 2.61 | 64 | 1502 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 752.9 | 40.3 | 24.4 | 20.58 | 1.02 | 68 | 1168 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1861.0 | 45.4 | 31.6 | 19.45 | 0.56 | 55 | 1345 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1888.8 | 46.7 | 33.3 | 18.82 | 0.45 | 41 | 2705 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1406.8 | 34.5 | 20.9 | 23.49 | 0.61 | 39 | 1650 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1304.1 | 39.6 | 26.5 | 22.32 | 0.46 | 42 | 2509 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 648.6 | 37.4 | 16.4 | 20.67 | 0.40 | 20 | 1137 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 631.8 | 41.4 | 26.8 | 20.81 | 0.45 | 18 | 1236 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 671.9 | 39.3 | 28.4 | 21.81 | 0.42 | 18 | 1352 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 688.2 | 40.6 | 26.2 | 20.85 | 0.38 | 15 | 984 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 689.1 | 41.2 | 30.1 | 21.06 | 0.40 | 15 | 1089 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 680.4 | 43.7 | 30.4 | 19.61 | 0.40 | 14 | 1100 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 685.9 | 36.5 | 16.1 | 21.27 | 0.42 | 14 | 1126 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 618.3 | 40.4 | 24.1 | 20.55 | 0.38 | 13 | 2210 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 655.7 | 37.8 | 17.1 | 20.50 | 0.49 | 12 | 2040 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 726.1 | 43.4 | 29.3 | 19.62 | 0.34 | 14 | 2960 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 620.3 | 38.9 | 23.0 | 21.09 | 0.41 | 11 | 2727 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 734.6 | 41.2 | 27.5 | 20.38 | 0.36 | 11 | 2414 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1435.5 | 38.0 | 22.2 | 22.51 | 0.43 | 27 | 1185 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 126.9 | 15.0 | 8.4 | 54.11 | 6.85 | 23 | 1202 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1315.9 | 36.3 | 18.8 | 22.85 | 0.41 | 27 | 187 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1354.8 | 38.7 | 25.9 | 22.66 | 0.46 | 27 | 1233 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1207.4 | 39.1 | 25.5 | 22.54 | 0.44 | 27 | 1707 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1030.1 | 35.8 | 21.5 | 23.91 | 0.54 | 25 | 3432 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 193.2 | 16.6 | 6.1 | 43.00 | 1.07 | 153 | 1672 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 217.0 | 27.7 | 25.6 | 32.94 | 0.67 | 21 | 3496 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 115.4 | 21.7 | 20.6 | 45.09 | 0.71 | 21 | 2650 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 98.6 | 18.5 | 17.6 | 52.52 | 0.73 | 20 | 460 |

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

**FPS**  avg `1251.80`, min `15.69`, p50 `1305.38`, p95 `2134.08`, p99 `2383.20`, 1%low `39.57`, 0.1%low `22.05`, std `550.05`

**Frame time (ms)**  avg `1.81`, p50 `0.77`, p95 `5.83`, p99 `19.91`, p99.9 `35.02`, max `63.74`

**Client tick (ms)**  avg `1.23`, p95 `3.05`, max `13.45`

**Memory**  start `1440 MB`, end `1579 MB`, peak `3294 MB`, GC `57 events / 591 ms`

**FPS over sampling window (ASCII):**

```
1987.4 |                                                                     ██         
1848.0 |                                                                 █  ███         
1708.6 |                                                          █  ███████████        
1569.3 |                                                     ██  ███ ███████████ █      
1429.9 |                                                 █   █████████████████████      
1290.6 |                               █         █ ██  ███  █████████████████████████ █ 
1151.2 |    █      ███    █    ██ ██ █ ███  ██████ █████████████████████████████████████
1011.9 |   ███ █ █ ███ █████████████████████████████████████████████████████████████████
872.5 |  ██████ █████ █████████████████████████████████████████████████████████████████
733.2 |  ██████████████████████████████████████████████████████████████████████████████
593.8 | ███████████████████████████████████████████████████████████████████████████████
454.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8075
   1 ms | ████████  1579
   2 ms | ██  427
   3 ms | █  222
   4 ms | █  116
   5 ms |   48
   6 ms |   24
   7 ms |   26
   8 ms |   5
   9 ms |   6
  10 ms |   7
  11 ms |   5
  12 ms |   1
  13 ms |   5
  14 ms |   7
  15 ms |   41
  16 ms |   65
  17 ms |   100
  18 ms |   82
  19 ms |   67
  20 ms |   31
  21 ms |   13
  22 ms |   13
  23 ms |   11
  24 ms |   7
  25 ms |   3
  26 ms |   3
  27 ms |   5
  28 ms |   3
  29 ms |   2
  31 ms |   2
  32 ms |   1
  35 ms |   1
  39 ms |   2
  40 ms |   1
  41 ms |   1
  43 ms |   2
  44 ms |   1
  45 ms |   1
  46 ms |   1
  50 ms |   1
  63 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 1376 | 879.5 | 22.55 |
| `flame` | 160 | 1376 | 1034.9 | 20.90 |
| `dripping_water` | 240 | 1376 | 1100.1 | 19.42 |
| `dragon_breath` | 160 | 1376 | 1133.9 | 19.37 |
| `end_rod` | 240 | 1376 | 1255.1 | 19.93 |
| `portal` | 160 | 1376 | 1462.5 | 19.11 |
| `ALL_TOGETHER` | 1680 | 1376 | 1763.4 | 18.94 |
| `sculk_charge_pop` | 240 | 1376 | 1385.3 | 19.70 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `39.57`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `85.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `551.27`
- `fps_0p1pct_low` = `22.05`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `884.11`, min `21.70`, p50 `972.09`, p95 `1251.03`, p99 `1404.19`, 1%low `40.84`, 0.1%low `25.62`, std `336.52`

**Frame time (ms)**  avg `2.24`, p50 `1.03`, p95 `15.58`, p99 `20.69`, p99.9 `32.55`, max `46.08`

**Client tick (ms)**  avg `1.31`, p95 `2.55`, max `17.03`

**Memory**  start `788 MB`, end `1149 MB`, peak `2582 MB`, GC `63 events / 607 ms`

**FPS over sampling window (ASCII):**

```
1100.3 |                █       █       █                                               
1054.9 |                █       █       █                        █                     █
1009.5 |                █ █     █       ██                       ███   █               █
964.1 |              ███ █     ███   █ ███  █     █      █    █ ███   ████           ██
918.7 |    █    █ █ ████ █     ███   ██████ █     █  █  ██  █ █████  ███████     █   ██
873.3 |    █    █ █ ████ █ ███████   ██████ ██    █ ██  ██  ███████ ████████ █ █ ███ ██
827.9 |  ████   ██████████ ███████  ███████ ██    ████████ █████████████████████████ ██
782.5 |  █████  ██████████ ███████  ███████████   █████████████████████████████████████
737.1 | ██████  ██████████ ████████████████████ ███████████████████████████████████████
691.7 |███████  ███████████████████████████████████████████████████████████████████████
646.4 |███████ ████████████████████████████████████████████████████████████████████████
601.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4096
   1 ms | █████████████████████████████████  3421
   2 ms | █████  482
   3 ms | ██  219
   4 ms | █  105
   5 ms | █  64
   6 ms |   17
   7 ms |   8
   8 ms |   10
   9 ms |   3
  10 ms |   1
  12 ms |   1
  13 ms |   6
  14 ms |   6
  15 ms |   35
  16 ms | █  62
  17 ms | █  105
  18 ms | █  73
  19 ms | █  70
  20 ms |   41
  21 ms |   31
  22 ms |   14
  23 ms |   8
  24 ms |   5
  25 ms |   4
  26 ms |   2
  27 ms |   1
  28 ms |   3
  31 ms |   1
  32 ms |   2
  33 ms |   2
  38 ms |   1
  40 ms |   2
  42 ms |   1
  43 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `40.84`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `25.62`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `445.49`
- `preload_duration_ms` = `45.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `726.76`, min `25.05`, p50 `794.43`, p95 `996.96`, p99 `1210.19`, 1%low `42.60`, 0.1%low `30.45`, std `262.05`

**Frame time (ms)**  avg `2.53`, p50 `1.26`, p95 `16.53`, p99 `20.35`, p99.9 `27.92`, max `39.93`

**Client tick (ms)**  avg `1.12`, p95 `2.03`, max `8.75`

**Memory**  start `920 MB`, end `1522 MB`, peak `3606 MB`, GC `46 events / 615 ms`

**FPS over sampling window (ASCII):**

```
884.2 |                                █                                               
850.7 |                                █                                    █    █    █
817.2 |           █                    █             █    █    █        █   █  ███    █
783.7 |           █      █      █      █    █    ██ ██    █    █    ██  ██ ██  ███   ██
750.1 |        █  █ █    █  ██  █  █   ██   █    ██ ██    ██  ██ █  ██  ██ ███████   ██
716.6 |       █████ █ █  ██ █████████████ ███ █████████   ███ █████ ██  ██ ███████ ████
683.1 |   █   ███████ █  ██ ██████████████████████████████████████████ ███ ████████████
649.6 |  ███ ██████████  █████████████████████████████████████████████ ████████████████
616.0 |█ ███ ██████████  ██████████████████████████████████████████████████████████████
582.5 |█ ██████████████  ██████████████████████████████████████████████████████████████
549.0 |█████████████████ ██████████████████████████████████████████████████████████████
515.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  370
   1 ms | ████████████████████████████████████████  6163
   2 ms | ███  494
   3 ms | ██  233
   4 ms |   72
   5 ms |   53
   6 ms |   18
   7 ms |   6
   8 ms |   2
   9 ms |   2
  10 ms |   2
  11 ms |   2
  13 ms |   2
  14 ms |   12
  15 ms |   46
  16 ms |   62
  17 ms | █  117
  18 ms | █  91
  19 ms |   56
  20 ms |   36
  21 ms |   28
  22 ms |   8
  23 ms |   8
  24 ms |   3
  25 ms |   2
  26 ms |   2
  27 ms |   5
  28 ms |   1
  29 ms |   2
  31 ms |   2
  35 ms |   1
  38 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `42.60`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `30.45`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `395.50`
- `preload_duration_ms` = `64.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `450.81`, min `19.67`, p50 `497.95`, p95 `679.86`, p99 `799.69`, 1%low `32.94`, 0.1%low `21.06`, std `187.41`

**Frame time (ms)**  avg `4.02`, p50 `2.01`, p95 `19.32`, p99 `24.68`, p99.9 `42.87`, max `50.84`

**Client tick (ms)**  avg `1.30`, p95 `2.36`, max `16.36`

**Memory**  start `1133 MB`, end `1387 MB`, peak `2076 MB`, GC `91 events / 689 ms`

**FPS over sampling window (ASCII):**

```
583.2 |                                                                             █  
559.1 |                                                                             █  
535.1 | █        █                                                  █    █          █  
511.0 | █      █ █         ██    █          ██         █  █   █ █   ██   █   █      █  
487.0 | █     ██ █    ██   ██ ██ ██         ██ █ █     █  █ █ █ █   ███  █   █      █  
462.9 | █ █ █ ██ █ █  ██ █ ██ ██ ██   ██    ██ █ █   ███  █ █ █ ██  ███  ██  █   █  ██ 
438.8 | ███ ████ ███ ███ ████ ██ ██ █ ██    ██ ███  █████ █ █ ████  ███  █████   ██ ███
414.8 |████ ████ ███ ███████████ ██ █ ██   ███████  █████ ███ █████ ████ █████ █ ██ ███
390.7 |████ █████████████████████████ ███ ███████████████ ███ █████████████████████████
366.7 |██████████████████████████████ ███ █████████████████████████████████████████████
342.6 |██████████████████████████████ █████████████████████████████████████████████████
318.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   7
   1 ms | ████████████████████████████████████████  2446
   2 ms | ██████████████████████  1365
   3 ms | ██████  348
   4 ms | ███  163
   5 ms | █  88
   6 ms | █  54
   7 ms |   21
   8 ms |   9
   9 ms |   6
  10 ms |   7
  11 ms |   5
  13 ms |   4
  14 ms |   3
  15 ms |   10
  16 ms |   21
  17 ms | █  53
  18 ms | █  89
  19 ms | █  87
  20 ms | █  64
  21 ms |   29
  22 ms |   23
  23 ms |   19
  24 ms |   15
  25 ms |   11
  26 ms |   6
  27 ms |   2
  28 ms |   3
  29 ms |   3
  30 ms |   1
  31 ms |   3
  32 ms |   2
  33 ms |   3
  34 ms |   2
  36 ms |   1
  42 ms |   1
  44 ms |   1
  46 ms |   1
  47 ms |   1
  48 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `32.94`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.06`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `248.94`
- `preload_duration_ms` = `60.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `895.47`, min `20.41`, p50 `1002.19`, p95 `1194.96`, p99 `1446.00`, 1%low `42.45`, 0.1%low `28.82`, std `314.05`

**Frame time (ms)**  avg `2.15`, p50 `1.00`, p95 `15.38`, p99 `20.28`, p99.9 `27.73`, max `49.00`

**Client tick (ms)**  avg `1.22`, p95 `2.46`, max `22.20`

**Memory**  start `1735 MB`, end `2246 MB`, peak `3150 MB`, GC `54 events / 610 ms`

**FPS over sampling window (ASCII):**

```
1059.9 | █                                                                              
1018.0 | █             █                 █                                              
976.1 | █             █      █   █  █   █    ███ █             █             █         
934.2 |██  █   █    █ █      █   █████  ███ ████ ██        █   ████      ██  ██  █  ██ 
892.2 |██  ████████████  ███ ██ ███████ ████████ ██   █   ██████████ ███ ██  ███ █  ██ 
850.3 |██ █████████████ ███████ ████████████████████ ██  ██████████████████  █████  ███
808.4 |████████████████████████ ████████████████████ ██  ██████████████████ ███████████
766.5 |████████████████████████ ███████████████████████████████████████████ ███████████
724.6 |████████████████████████ ███████████████████████████████████████████████████████
682.7 |████████████████████████ ███████████████████████████████████████████████████████
640.8 |████████████████████████ ███████████████████████████████████████████████████████
598.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4685
   1 ms | █████████████████████████████  3357
   2 ms | ████  411
   3 ms | ██  211
   4 ms | █  79
   5 ms |   39
   6 ms |   12
   7 ms |   4
   8 ms |   3
  11 ms |   2
  12 ms |   1
  13 ms |   3
  14 ms |   15
  15 ms |   51
  16 ms | █  84
  17 ms | █  121
  18 ms | █  65
  19 ms |   52
  20 ms |   36
  21 ms |   19
  22 ms |   12
  23 ms |   19
  24 ms |   3
  25 ms |   4
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   2
  31 ms |   1
  33 ms |   1
  34 ms |   1
  36 ms |   1
  40 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `42.45`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `28.82`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `465.23`
- `preload_duration_ms` = `73.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `879.70`, min `19.07`, p50 `980.94`, p95 `1169.88`, p99 `1432.99`, 1%low `41.36`, 0.1%low `28.05`, std `305.48`

**Frame time (ms)**  avg `2.14`, p50 `1.02`, p95 `14.05`, p99 `20.11`, p99.9 `31.48`, max `52.43`

**Client tick (ms)**  avg `0.95`, p95 `2.01`, max `14.11`

**Memory**  start `1799 MB`, end `1247 MB`, peak `3041 MB`, GC `53 events / 620 ms`

**FPS over sampling window (ASCII):**

```
1002.9 |                                                             █                  
974.9 |   █        █                   █               ██        █  ██                 
947.0 |   █    █ █ █                   █      █  █     ██        █  ██      █ █ █    ██
919.0 |  ██ ██ █ █ ██       █████   █  █   ████  █     ██       ██  ██   ██ █ █ █   ███
891.1 |█ █████ █ █ ██   █   █████ ███  █   ███████   ████  ██  ███████   ██ █ █ █  ████
863.1 |█ █████ ███ ██  ██   █████ ███ ██ █ ███████   ████████  ███████ █ ██████ █  ████
835.2 |███████ ███ ██ ███   █████ ███ ████ ███████   ████████  ███████ ████████ █ █████
807.2 |███████████ ██ ███   ██████████████ █████████ █████████████████ ████████ █ █████
779.3 |███████████ ██████   ██████████████ █████████ █████████████████ ██████████ █████
751.3 |██████████████████   ██████████████ ████████████████████████████████████████████
723.4 |██████████████████ █████████████████████████████████████████████████████████████
695.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4309
   1 ms | ███████████████████████████████████  3777
   2 ms | ████  440
   3 ms | ██  172
   4 ms | █  86
   5 ms |   49
   6 ms |   12
   7 ms |   7
   8 ms |   5
   9 ms |   5
  10 ms |   2
  11 ms |   1
  12 ms |   1
  13 ms |   2
  14 ms |   7
  15 ms |   39
  16 ms | █  63
  17 ms | █  105
  18 ms | █  99
  19 ms | █  55
  20 ms |   32
  21 ms |   17
  22 ms |   6
  23 ms |   13
  24 ms |   7
  25 ms |   2
  26 ms |   4
  27 ms |   2
  28 ms |   1
  29 ms |   2
  30 ms |   2
  31 ms |   4
  32 ms |   1
  33 ms |   3
  35 ms |   1
  36 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `41.36`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `28.05`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `466.40`
- `preload_duration_ms` = `60.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `751.37`, min `21.87`, p50 `843.17`, p95 `1017.29`, p99 `1198.67`, 1%low `41.55`, 0.1%low `29.63`, std `277.13`

**Frame time (ms)**  avg `2.56`, p50 `1.19`, p95 `16.77`, p99 `20.68`, p99.9 `29.22`, max `45.73`

**Client tick (ms)**  avg `1.14`, p95 `1.94`, max `4.46`

**Memory**  start `1757 MB`, end `2277 MB`, peak `3185 MB`, GC `54 events / 612 ms`

**FPS over sampling window (ASCII):**

```
871.5 |           █                                                    █               
839.6 |           █        █          █               █  █        █    █               
807.6 |           █  ██    █          █ █   ██    █   █  █     ██ █    █     █  █      
775.7 | ██      █ █  ██    █  ██    █████   ██ ████   ████ ██████ █   ███  ███  ██ ██  
743.8 | ███     █ ██████  ██  ██ ████████ ████ ████  █████ ████████  ████  ███████ ██ █
711.8 |████  █ █████████ ███ ███ █████████████████████████ ████████  ████  ██████████ █
679.9 |████  ███████████ ███ █████████████████████████████████████████████ ████████████
648.0 |████  ███████████████ ██████████████████████████████████████████████████████████
616.1 |████ ████████████████ ██████████████████████████████████████████████████████████
584.1 |████ ████████████████ ██████████████████████████████████████████████████████████
552.2 |█████████████████████ ██████████████████████████████████████████████████████████
520.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████  574
   1 ms | ████████████████████████████████████████  5884
   2 ms | ███  480
   3 ms | █  216
   4 ms | █  78
   5 ms |   48
   6 ms |   21
   7 ms |   9
   8 ms |   1
   9 ms |   5
  10 ms |   3
  11 ms |   5
  12 ms |   3
  13 ms |   2
  14 ms |   14
  15 ms |   43
  16 ms |   73
  17 ms | █  117
  18 ms | █  90
  19 ms |   58
  20 ms |   41
  21 ms |   20
  22 ms |   11
  23 ms |   6
  24 ms |   6
  25 ms |   2
  26 ms |   4
  27 ms |   5
  28 ms |   1
  29 ms |   3
  30 ms |   1
  32 ms |   1
  33 ms |   2
  35 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `41.55`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `29.63`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `391.23`
- `preload_duration_ms` = `37.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `331.30`, min `21.40`, p50 `377.30`, p95 `489.69`, p99 `529.64`, 1%low `31.15`, 0.1%low `21.51`, std `136.71`

**Frame time (ms)**  avg `5.09`, p50 `2.65`, p95 `19.93`, p99 `24.36`, p99.9 `45.61`, max `46.73`

**Client tick (ms)**  avg `1.74`, p95 `2.84`, max `5.51`

**Memory**  start `1293 MB`, end `2079 MB`, peak `3030 MB`, GC `46 events / 614 ms`

**FPS over sampling window (ASCII):**

```
404.9 | █                                                                              
388.1 | █   █                                                █                         
371.2 | █   ██   ███                █                        █                   ██    
354.4 |███████ █ ███           ██   █  █       █ █  █   █    █ █   █     █     █ ██    
337.6 |███████ ██████    █     ██████ ██ █ █   █ ██ █   █ ██ █ █   █   ███ █ ███ ██ █ █
320.7 |████████████████ ███   ███████ ████ █ █████████ █████ █ ██ ██   █████████ ██ █ █
303.9 |████████████████████   ████████████ ███████████ ███████ █████ ██████████████████
287.1 |████████████████████ ██████████████ ███████████████████ █████ ██████████████████
270.2 |████████████████████ ██████████████ ███████████████████ ████████████████████████
253.4 |███████████████████████████████████ ████████████████████████████████████████████
236.5 |███████████████████████████████████ ████████████████████████████████████████████
219.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  131
   2 ms | ████████████████████████████████████████  2377
   3 ms | ███████  416
   4 ms | █████  278
   5 ms | ██  130
   6 ms | █  64
   7 ms |   29
   8 ms |   14
   9 ms |   6
  10 ms |   2
  11 ms |   5
  12 ms |   3
  13 ms |   1
  14 ms |   1
  15 ms |   8
  16 ms | █  40
  17 ms | █  67
  18 ms | ██  92
  19 ms | █  74
  20 ms | █  53
  21 ms | █  34
  22 ms | █  39
  23 ms |   18
  24 ms |   15
  25 ms |   4
  26 ms |   4
  28 ms |   4
  29 ms |   1
  31 ms |   1
  32 ms |   1
  33 ms |   4
  34 ms |   1
  37 ms |   1
  38 ms |   1
  39 ms |   1
  40 ms |   1
  42 ms |   2
  45 ms |   1
  46 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `31.15`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.51`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `196.40`
- `preload_duration_ms` = `37.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `1063.39`, min `16.20`, p50 `1189.45`, p95 `1442.35`, p99 `1828.79`, 1%low `33.88`, 0.1%low `20.03`, std `398.96`

**Frame time (ms)**  avg `2.19`, p50 `0.84`, p95 `15.53`, p99 `23.05`, p99.9 `43.68`, max `61.71`

**Client tick (ms)**  avg `4.67`, p95 `7.32`, max `17.84`

**Memory**  start `1012 MB`, end `2152 MB`, peak `2197 MB`, GC `90 events / 665 ms`

**FPS over sampling window (ASCII):**

```
1203.3 |█  █              █     █                                                       
1169.3 |█  ██             █     ██        █  █                        ██                
1135.3 |█  ██         █   █     ██        █ ██  █      █              ██   █   █     █  
1101.3 |█  ██         █   ███   ██        ████  ███  █ ██            ███  ██   ██    █  
1067.3 |█  █████ █ ████ █████ █████  ███  ████ ████  ████   █  ███ █ ███  ███  ████  █ █
1033.2 |█  █████ █ ████ █████ ██████████  ████ ████  █████████ ███ █████  ████ ████  █ █
999.2 |██ ██████████████████ ██████████ █████ █████ █████████ ███ ███████████ ████  ███
965.2 |██ █████████████████████████████ █████ ███████████████████ ███████████ █████ ███
931.2 |██████████████████████████████████████ ███████████████████████████████ █████ ███
897.2 |██████████████████████████████████████ ███████████████████████████████ █████ ███
863.1 |████████████████████████████████████████████████████████████████████████████ ███
829.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6574
   1 ms | █████████  1424
   2 ms | █  207
   3 ms | █  103
   4 ms |   62
   5 ms | █  120
   6 ms |   71
   7 ms |   29
   8 ms |   18
   9 ms |   9
  10 ms |   9
  11 ms |   11
  12 ms |   6
  13 ms |   6
  14 ms |   12
  15 ms |   24
  16 ms |   33
  17 ms | █  85
  18 ms | █  99
  19 ms |   48
  20 ms |   30
  21 ms |   25
  22 ms |   27
  23 ms |   27
  24 ms |   13
  25 ms |   12
  26 ms |   10
  27 ms |   2
  28 ms |   3
  29 ms |   2
  30 ms |   3
  31 ms |   1
  32 ms |   1
  34 ms |   1
  35 ms |   1
  36 ms |   1
  37 ms |   3
  39 ms |   1
  41 ms |   1
  42 ms |   1
  43 ms |   4
  44 ms |   1
  47 ms |   1
  48 ms |   1
  51 ms |   2
  57 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `33.88`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `495.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.03`
- `entity_count_sample_end` = `495.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `456.37`
- `preload_duration_ms` = `53.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `189.28`, min `17.68`, p50 `203.41`, p95 `325.89`, p99 `375.93`, 1%low `26.24`, 0.1%low `18.91`, std `95.68`

**Frame time (ms)**  avg `8.44`, p50 `4.92`, p95 `23.84`, p99 `30.98`, p99.9 `45.86`, max `56.56`

**Client tick (ms)**  avg `5.27`, p95 `8.20`, max `19.28`

**Memory**  start `1905 MB`, end `2208 MB`, peak `2384 MB`, GC `30 events / 216 ms`

**FPS over sampling window (ASCII):**

```
276.0 |      █                                                                         
261.6 |    █ █                                              █                          
247.3 |   ██ █                                           █ ██ █  █    ██               
232.9 |   ████                                           ███████ █    ██   █    █      
218.6 |██ █████                                     █   ██████████   ███   █    ██ █ ██
204.3 |████████ ███                                 █   ███████████  ████ ███   ██ █ ██
189.9 |████████████   █                             █  ██████████████████ ███ █████████
175.6 |█████████████  █  █ █  █                     █  ██████████████████ █████████████
161.3 |████████████████ ██ ████  ██             █   █  ████████████████████████████████
146.9 |████████████████ ██ ████████████  █ ██ █ ███ █  ████████████████████████████████
132.6 |███████████████████████████████████████████████ ████████████████████████████████
118.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █████  89
   3 ms | ████████████████████████████████████████  680
   4 ms | ███████████████████████████  461
   5 ms | █████████████████  291
   6 ms | █████  80
   7 ms | ███  51
   8 ms | ███  56
   9 ms | ███  45
  10 ms | ██  36
  11 ms | █  25
  12 ms | █  21
  13 ms | ███  58
  14 ms | ██  41
  15 ms | █  14
  16 ms | ██  41
  17 ms | ██  39
  18 ms | ██  42
  19 ms | ███  47
  20 ms | ███  48
  21 ms | ███  43
  22 ms | █  24
  23 ms | █  24
  24 ms | █  21
  25 ms | █  13
  26 ms | █  18
  27 ms | █  12
  28 ms | █  14
  29 ms |   7
  30 ms |   5
  31 ms |   2
  32 ms |   2
  33 ms |   4
  34 ms |   1
  35 ms |   3
  36 ms |   1
  37 ms |   2
  38 ms |   1
  40 ms |   1
  41 ms |   2
  42 ms |   1
  45 ms |   1
  46 ms |   1
  49 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `18.91`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `31.00`
- `fps_harmonic_avg` = `118.52`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `26.24`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `546.65`, min `19.45`, p50 `606.90`, p95 `822.00`, p99 `1016.56`, 1%low `36.24`, 0.1%low `24.39`, std `234.47`

**Frame time (ms)**  avg `3.51`, p50 `1.65`, p95 `18.28`, p99 `23.04`, p99.9 `34.57`, max `51.41`

**Client tick (ms)**  avg `1.36`, p95 `1.93`, max `11.75`

**Memory**  start `1433 MB`, end `1764 MB`, peak `2399 MB`, GC `89 events / 671 ms`

**FPS over sampling window (ASCII):**

```
794.1 |                          █                                                     
755.5 |                          █                            █                        
717.0 |                          █            █               ██                       
678.4 |                          █            █     █         ██                       
639.8 |                █   █     █       █    █     █    █    ███         █            
601.2 | █            █ ██  ██    █  █    █    ██  █ ██   █    ███   ███   ████ █      █
562.6 | ██    ██     ████  ██  ███  █    █  ████  ████  ███   ███  █████  ████ █   █  █
524.0 | ██  ████     ████ ███ ████  ███  █  ████ █████  ███   ███████████ ████ ████████
485.4 |█████████ ██  ██████████████████ ██ █████ █████ ██████ ████████████████ ████████
446.8 |█████████ ██  █████████████████████ ██████████████████ ████████████████ ████████
408.2 |████████████ ███████████████████████████████████████████████████████████████████
369.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  70
   1 ms | ████████████████████████████████████████  3766
   2 ms | ████████  740
   3 ms | ███  317
   4 ms | ██  148
   5 ms | █  74
   6 ms |   39
   7 ms |   15
   8 ms |   9
   9 ms |   8
  10 ms |   7
  11 ms |   6
  12 ms |   4
  13 ms |   6
  14 ms |   11
  15 ms |   26
  16 ms | █  48
  17 ms | █  85
  18 ms | █  103
  19 ms | █  68
  20 ms | █  48
  21 ms |   27
  22 ms |   14
  23 ms |   13
  24 ms |   13
  25 ms |   8
  26 ms |   5
  27 ms |   3
  28 ms |   2
  29 ms |   2
  30 ms |   2
  31 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   2
  36 ms |   1
  42 ms |   1
  44 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `71.00`
- `fps_1pct_low` = `36.24`
- `fps_harmonic_avg` = `284.79`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `24.39`
- `part` = `1.00`
- `preset_long` = `0.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `504.83`, min `19.22`, p50 `531.91`, p95 `855.12`, p99 `1086.54`, 1%low `37.52`, 0.1%low `24.74`, std `211.79`

**Frame time (ms)**  avg `3.49`, p50 `1.88`, p95 `18.32`, p99 `22.25`, p99.9 `32.26`, max `52.02`

**Client tick (ms)**  avg `0.91`, p95 `1.87`, max `10.89`

**Memory**  start `2138 MB`, end `1467 MB`, peak `3155 MB`, GC `63 events / 588 ms`

**FPS over sampling window (ASCII):**

```
822.8 |                                                                              █ 
779.6 |                                                                              █ 
736.5 |                                                         █                    █ 
693.3 |                                          █              █                   ███
650.1 |                                      █   █              █                  ████
607.0 |                                      █   █             ██    █           █ ████
563.8 |         █                ██      █   █████     ██     ███    █     █   █ ██████
520.6 |   █     █           █    ███ █  ██   ██████    ██████ ████  ████   █   █ ██████
477.5 | ███   ███         █ ██  ██████████ ████████ ██████████████  ██████ ██ █████████
434.3 |████   ███     █████████ ███████████████████ █████████████████████████ █████████
391.1 |███████████ █  █████████ ███████████████████████████████████████████████████████
348.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  141
   1 ms | ████████████████████████████████████████  3249
   2 ms | █████████████████  1347
   3 ms | ███  271
   4 ms | █  121
   5 ms | █  76
   6 ms |   37
   7 ms |   13
   8 ms |   5
   9 ms |   2
  10 ms |   1
  11 ms |   1
  12 ms |   9
  13 ms |   13
  14 ms |   9
  15 ms |   19
  16 ms |   24
  17 ms | █  63
  18 ms | █  105
  19 ms | █  83
  20 ms | █  61
  21 ms |   18
  22 ms |   17
  23 ms |   14
  24 ms |   5
  25 ms |   10
  26 ms |   4
  28 ms |   3
  29 ms |   2
  31 ms |   3
  34 ms |   1
  35 ms |   1
  37 ms |   1
  40 ms |   1
  42 ms |   1
  52 ms |   1
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
- `fps_0p1pct_low` = `24.74`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `20.00`
- `fps_harmonic_avg` = `286.58`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `37.52`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `765.49`, min `19.02`, p50 `852.43`, p95 `1233.47`, p99 `1429.30`, 1%low `33.95`, 0.1%low `22.04`, std `355.93`

**Frame time (ms)**  avg `2.80`, p50 `1.17`, p95 `13.73`, p99 `24.03`, p99.9 `39.86`, max `52.56`

**Client tick (ms)**  avg `4.71`, p95 `10.55`, max `32.07`

**Memory**  start `1419 MB`, end `3141 MB`, peak `3295 MB`, GC `36 events / 323 ms`

**FPS over sampling window (ASCII):**

```
1312.4 |                                                                               █
1221.6 |                                                                              ██
1130.7 |                                                        ██                   ███
1039.9 |                   ██   ███                            ███            █ █  █████
949.0 |                  ██████████     █                   █████           ███████████
858.2 |                  ████████████████             █ █████████     ███ █████████████
767.4 |             █    █████████████████        ███████████████    ██████████████████
676.5 |            ███   █████████████████        ████████████████   ██████████████████
585.7 |           ████   █████████████████       ██████████████████  ██████████████████
494.9 |     █  █ █████████████████████████  █ █ ███████████████████████████████████████
404.0 |█   ████████████████████████████████████████████████████████████████████████████
313.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████  2245
   1 ms | ████████████████████████████████████████  3195
   2 ms | █████████  713
   3 ms | ██  187
   4 ms | █  83
   5 ms |   33
   6 ms |   27
   7 ms |   35
   8 ms |   23
   9 ms |   13
  10 ms |   15
  11 ms |   11
  12 ms | █  111
  13 ms | █  104
  14 ms |   25
  15 ms |   26
  16 ms |   33
  17 ms | █  58
  18 ms |   35
  19 ms |   33
  20 ms |   20
  21 ms |   15
  22 ms |   13
  23 ms |   8
  24 ms |   13
  25 ms |   14
  26 ms |   7
  27 ms |   9
  28 ms |   9
  30 ms |   6
  33 ms |   1
  34 ms |   1
  35 ms |   1
  36 ms |   2
  39 ms |   2
  41 ms |   1
  42 ms |   1
  43 ms |   2
  47 ms |   2
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.36`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `22.04`
- `preset_long` = `0.00`
- `preload_duration_ms` = `118.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `356.83`
- `fps_1pct_low` = `33.95`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `806.80`, min `18.90`, p50 `731.29`, p95 `1447.79`, p99 `1643.67`, 1%low `30.95`, 0.1%low `21.48`, std `436.15`

**Frame time (ms)**  avg `2.90`, p50 `1.37`, p95 `15.39`, p99 `23.94`, p99.9 `43.37`, max `52.91`

**Client tick (ms)**  avg `4.52`, p95 `9.34`, max `26.03`

**Memory**  start `1098 MB`, end `1497 MB`, peak `3555 MB`, GC `43 events / 463 ms`

**FPS over sampling window (ASCII):**

```
1498.2 |                                                                             ██ 
1385.5 |                                                                            ███ 
1272.8 |                      ██ ██                                             ██ ████ 
1160.0 |                   ██████████                               ██ █ █ ██ █████████ 
1047.3 |                   ███████████ █                           █████████████████████
934.6 |                   ██████████████                          █████████████████████
821.9 |                   █████████████████                       █████████████████████
709.2 |                  ██████████████████                  █   ██████████████████████
596.5 |         █ █████████████████████████ ██ █        ███ ██   ██████████████████████
483.7 |      ████ ████████████████████████████ ████ █  ████████████████████████████████
371.0 |█   ████████████████████████████████████████████████████████████████████████████
258.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████████████████  2547
   1 ms | ████████████████████████████████████████  2614
   2 ms | ███████████  709
   3 ms | ████  229
   4 ms | ██  101
   5 ms | █  68
   6 ms | █  47
   7 ms | █  34
   8 ms |   13
   9 ms |   18
  10 ms |   14
  11 ms |   7
  12 ms |   30
  13 ms | █  79
  14 ms | █  43
  15 ms |   21
  16 ms |   21
  17 ms | █  52
  18 ms | █  54
  19 ms | █  39
  20 ms | █  37
  21 ms |   22
  22 ms |   20
  23 ms |   19
  24 ms |   10
  25 ms |   4
  26 ms |   7
  27 ms |   5
  28 ms |   6
  29 ms |   5
  30 ms |   3
  31 ms |   1
  32 ms |   3
  33 ms |   2
  36 ms |   2
  37 ms |   2
  38 ms |   2
  41 ms |   3
  42 ms |   4
  43 ms |   5
  46 ms |   2
  48 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.51`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `148.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `21.48`
- `preset_long` = `0.00`
- `preload_duration_ms` = `50.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `345.36`
- `fps_1pct_low` = `30.95`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1343.21`, min `9.83`, p50 `1241.83`, p95 `3377.86`, p99 `3787.96`, 1%low `14.51`, 0.1%low `10.50`, std `1124.07`

**Frame time (ms)**  avg `6.01`, p50 `0.81`, p95 `32.98`, p99 `56.01`, p99.9 `83.91`, max `101.73`

**Client tick (ms)**  avg `18.28`, p95 `32.13`, max `38.29`

**Memory**  start `1518 MB`, end `1374 MB`, peak `2374 MB`, GC `33 events / 163 ms`

**FPS over sampling window (ASCII):**

```
3522.4 |                                                                            █  █
3209.4 |                                                                            ████
2896.4 |                                                                            ████
2583.4 |                                                  █ █       ██ ██ █ ██      ████
2270.4 |                                      █        █ ██ █       ██████████      ████
1957.4 |                               ██     ██ █     ██████ █     ███████████     ████
1644.4 |                 ██     ███   ███     ████     ████████     ████████████   █████
1331.4 |                 ███    ███   ████    █████    █████████    ████████████   █████
1018.3 |███          █   ████   ███   █████   ██████   ██████████   ████████████   █████
705.3 |███       █ ██   ████   ███   █████  ███████   ██████████   ████████████   █████
392.3 |███    █ ██████ ██████ █████  ██████ ████████ ████████████ ███████████████ █████
 79.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1793
   1 ms | ███████  315
   2 ms | ████  168
   3 ms | ██  91
   4 ms | ███  155
   5 ms | ███  138
   6 ms | █  34
   7 ms |   12
   8 ms |   12
   9 ms |   10
  10 ms |   9
  11 ms |   7
  12 ms |   21
  13 ms | █  56
  14 ms | █  34
  15 ms | █  36
  16 ms | █  46
  17 ms | █  31
  18 ms | █  25
  19 ms |   21
  20 ms |   16
  21 ms |   9
  22 ms |   20
  23 ms |   19
  24 ms |   11
  25 ms |   8
  26 ms |   11
  27 ms |   14
  28 ms |   7
  29 ms |   7
  30 ms |   10
  31 ms |   8
  32 ms |   7
  33 ms |   21
  34 ms |   10
  35 ms |   5
  36 ms |   6
  37 ms |   6
  38 ms |   6
  39 ms |   5
  40 ms |   9
  41 ms |   5
  42 ms |   9
  43 ms |   6
  44 ms |   3
  45 ms |   5
  46 ms |   9
  47 ms |   7
  48 ms |   1
  49 ms |   5
  50 ms |   5
  51 ms |   4
  52 ms |   2
  53 ms |   3
  55 ms |   1
  56 ms |   2
  57 ms |   4
  58 ms |   3
  60 ms |   2
  61 ms |   1
  63 ms |   1
  64 ms |   2
  66 ms |   3
  67 ms |   1
  68 ms |   2
  69 ms |   2
  70 ms |   1
  71 ms |   1
  72 ms |   1
  74 ms |   1
  75 ms |   1
  79 ms |   1
  81 ms |   1
  84 ms |   1
  85 ms |   1
  98 ms |   1
 101 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `14.51`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `72.00`
- `falling_blocks_landed` = `26129.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `166.53`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `10.50`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4824.15`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `1265.56`, min `6.76`, p50 `1189.75`, p95 `2868.38`, p99 `3512.67`, 1%low `10.67`, 0.1%low `7.86`, std `1040.54`

**Frame time (ms)**  avg `7.07`, p50 `0.84`, p95 `34.96`, p99 `73.12`, p99.9 `110.95`, max `147.89`

**Client tick (ms)**  avg `19.28`, p95 `34.02`, max `48.40`

**Memory**  start `1232 MB`, end `1660 MB`, peak `2415 MB`, GC `30 events / 145 ms`

**FPS over sampling window (ASCII):**

```
2971.3 |                                                                             ██ 
2705.3 |                                                                  ██         ███
2439.3 |                                                      █       ███ ██        ████
2173.2 |                               █ █         █     ████ █       ██████ ██     ████
1907.2 |                  █           ██ ███    ████     ███████      █████████     ████
1641.2 |             █    █      █    ██████    ████     ███████     ██████████     ████
1375.2 |           ███    ███    █    ██████    █████    ████████    ███████████    ████
1109.2 |           ████   ███    █    ██████   ███████   ████████    ███████████    ████
843.2 | ██        ████   ████  ███   ███████  ███████   █████████   ████████████   ████
577.1 |███        █████  ████  ███   ███████  ███████   █████████   ████████████   ████
311.1 |█████      █████  █████ ████ █████████ ████████ ███████████  █████████████  ████
 45.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1490
   1 ms | █████████  318
   2 ms | ███  122
   3 ms | ██  67
   4 ms | █  44
   5 ms | █  36
   6 ms | ██  76
   7 ms | ██  83
   8 ms | █  24
   9 ms |   6
  10 ms |   9
  11 ms |   6
  12 ms | █  33
  13 ms | █  38
  14 ms | █  27
  15 ms | █  35
  16 ms | █  46
  17 ms | █  34
  18 ms |   15
  19 ms |   9
  20 ms |   14
  21 ms |   12
  22 ms |   15
  23 ms |   10
  24 ms |   2
  25 ms |   8
  26 ms |   11
  27 ms |   14
  28 ms |   12
  29 ms |   12
  30 ms |   9
  31 ms |   8
  32 ms |   13
  33 ms |   18
  34 ms |   12
  35 ms |   4
  36 ms |   9
  37 ms |   7
  38 ms |   6
  39 ms |   5
  40 ms |   9
  41 ms |   4
  42 ms |   5
  43 ms |   6
  44 ms |   7
  45 ms |   3
  46 ms |   4
  47 ms |   2
  48 ms |   3
  49 ms |   6
  50 ms |   5
  52 ms |   4
  53 ms |   4
  55 ms |   1
  56 ms |   1
  57 ms |   1
  58 ms |   1
  59 ms |   1
  60 ms |   1
  61 ms |   1
  62 ms |   1
  64 ms |   3
  65 ms |   1
  67 ms |   2
  68 ms |   3
  69 ms |   3
  74 ms |   1
  76 ms |   1
  77 ms |   1
  78 ms |   1
  79 ms |   4
  82 ms |   1
  86 ms |   1
  87 ms |   2
  89 ms |   3
  91 ms |   1
  94 ms |   3
  95 ms |   2
  97 ms |   1
  98 ms |   1
 100 ms |   1
 104 ms |   1
 110 ms |   1
 113 ms |   1
 120 ms |   1
 147 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `10.67`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `7.00`
- `falling_blocks_landed` = `24829.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `141.51`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `7.86`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4784.31`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1378.26`, min `19.85`, p50 `1447.28`, p95 `2268.34`, p99 `2641.37`, 1%low `41.04`, 0.1%low `30.23`, std `684.28`

**Frame time (ms)**  avg `1.83`, p50 `0.69`, p95 `6.13`, p99 `21.23`, p99.9 `27.56`, max `50.37`

**Client tick (ms)**  avg `2.90`, p95 `5.05`, max `14.40`

**Memory**  start `2165 MB`, end `1431 MB`, peak `2460 MB`, GC `80 events / 677 ms`

**FPS over sampling window (ASCII):**

```
2110.7 |                                                                          █ █   
1965.1 |                                                                        █ ████  
1819.6 |█  █                                    █  ██   ██       ██    ████ █  ████████ 
1674.1 |█████                                   █  ██   █████  ███████ █████████████████
1528.5 |███████                              █  █ ████ ██████  █████████████████████████
1383.0 |███████                            ████ ████████████████████████████████████████
1237.5 |███████                            █████████████████████████████████████████████
1091.9 |████████                        █  █████████████████████████████████████████████
946.4 |█████████               ████ █ █████████████████████████████████████████████████
800.9 |█████████            ███████████████████████████████████████████████████████████
655.3 |██████████ █ ██ ████████████████████████████████████████████████████████████████
509.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7175
   1 ms | ██████████████  2461
   2 ms | ██  310
   3 ms | █  185
   4 ms | █  138
   5 ms |   74
   6 ms |   39
   7 ms |   17
   8 ms |   7
   9 ms |   3
  10 ms |   3
  11 ms |   5
  12 ms |   3
  13 ms |   4
  14 ms |   7
  15 ms |   23
  16 ms |   33
  17 ms | █  94
  18 ms |   79
  19 ms |   74
  20 ms |   48
  21 ms |   30
  22 ms |   22
  23 ms |   29
  24 ms |   14
  25 ms |   3
  26 ms |   7
  27 ms |   5
  30 ms |   2
  31 ms |   3
  32 ms |   1
  33 ms |   1
  36 ms |   1
  50 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `41.04`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `27.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `545.06`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `30.23`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `1701.80`, min `20.38`, p50 `1861.57`, p95 `3379.91`, p99 `3515.67`, 1%low `40.71`, 0.1%low `25.16`, std `938.84`

**Frame time (ms)**  avg `1.65`, p50 `0.54`, p95 `5.44`, p99 `20.41`, p99.9 `29.42`, max `49.08`

**Client tick (ms)**  avg `2.61`, p95 `4.05`, max `7.63`

**Memory**  start `1205 MB`, end `2635 MB`, peak `2708 MB`, GC `64 events / 582 ms`

**FPS over sampling window (ASCII):**

```
3146.9 |                                                       ████ ███                 
2895.5 |                                                    ███████████                 
2644.1 |█                                                   ███████████                 
2392.7 |█                                                   ███████████                 
2141.3 |█                                    ████ █        █████████████  █    █     █  
1889.9 |████                          █     ███████    █ █ ██████████████ ██ █ ██   ████
1638.5 |███████                       █ ███ ████████████████████████████████████████████
1387.1 |████████                     ███████████████████████████████████████████████████
1135.7 |████████                 ███ ███████████████████████████████████████████████████
884.3 |████████             ███████████████████████████████████████████████████████████
632.9 |█████████       ████████████████████████████████████████████████████████████████
381.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8807
   1 ms | ████████  1748
   2 ms | ███  637
   3 ms | █  193
   4 ms | █  121
   5 ms |   80
   6 ms |   37
   7 ms |   8
   8 ms |   10
   9 ms |   8
  10 ms |   2
  11 ms |   1
  12 ms |   28
  13 ms |   30
  14 ms |   24
  15 ms |   26
  16 ms |   50
  17 ms |   72
  18 ms |   89
  19 ms |   46
  20 ms |   30
  21 ms |   31
  22 ms |   16
  23 ms |   21
  24 ms |   4
  25 ms |   8
  26 ms |   7
  27 ms |   1
  28 ms |   2
  29 ms |   2
  31 ms |   2
  32 ms |   1
  34 ms |   1
  35 ms |   1
  39 ms |   1
  40 ms |   1
  44 ms |   3
  49 ms |   2
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `40.71`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `117.00`
- `falling_blocks_landed` = `6664.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `607.61`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `25.16`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `622.23`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `752.89`, min `19.38`, p50 `773.64`, p95 `1266.48`, p99 `1765.13`, 1%low `40.32`, 0.1%low `24.45`, std `330.60`

**Frame time (ms)**  avg `2.60`, p50 `1.29`, p95 `16.90`, p99 `20.58`, p99.9 `28.42`, max `51.61`

**Client tick (ms)**  avg `1.02`, p95 `1.69`, max `14.72`

**Memory**  start `1612 MB`, end `1396 MB`, peak `2780 MB`, GC `68 events / 653 ms`

**FPS over sampling window (ASCII):**

```
1523.9 |     ██                                                                         
1430.0 |     ██                                                                         
1336.1 |  █  ██                                                                         
1242.2 |  █  ██                                                                         
1148.3 |  █ ███                                                                         
1054.4 |████████                                                                        
960.5 |████████ █ █                                                                    
866.5 |████████████   ███                                                              
772.6 |████████████████████████ █                                   █      █ ██ ██████ 
678.7 |███████████████████████████    ████ ██ ███ █    █ █   █ ██ █ ███   █████████████
584.8 |███████████████████████████████████████████████ ████████████████████████████████
490.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  1213
   1 ms | ████████████████████████████████████████  5105
   2 ms | ████  489
   3 ms | ██  240
   4 ms | █  78
   5 ms |   41
   6 ms |   9
   7 ms |   7
   8 ms |   6
   9 ms |   6
  10 ms |   2
  11 ms |   1
  12 ms |   2
  13 ms |   6
  14 ms |   20
  15 ms |   39
  16 ms |   54
  17 ms | █  94
  18 ms | █  111
  19 ms | █  64
  20 ms |   46
  21 ms |   14
  22 ms |   12
  23 ms |   10
  24 ms |   7
  25 ms |   6
  26 ms |   4
  27 ms |   2
  30 ms |   1
  32 ms |   1
  33 ms |   2
  46 ms |   1
  48 ms |   1
  50 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `24.45`
- `seed` = `5099.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `40.32`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `384.77`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `1860.96`, min `19.66`, p50 `2022.57`, p95 `2512.83`, p99 `3298.80`, 1%low `45.41`, 0.1%low `31.57`, std `635.21`

**Frame time (ms)**  avg `1.16`, p50 `0.49`, p95 `2.73`, p99 `19.45`, p99.9 `24.58`, max `50.87`

**Client tick (ms)**  avg `0.56`, p95 `1.02`, max `18.58`

**Memory**  start `2581 MB`, end `3516 MB`, peak `3926 MB`, GC `55 events / 595 ms`

**FPS over sampling window (ASCII):**

```
2454.3 |                                       █                                        
2363.8 |                                      ██                                        
2273.4 |                                      ██             █                          
2182.9 |                                      ██             █       █            █     
2092.4 | █            █            █          ██             █       █            █     
2001.9 | █  █  █      █      █   ████         ██           █ █       █            █    █
1911.4 | ██ ████    █ █  █ █ █ █ ██████ ███   ██       █   ███       █   █      █ ██   █
1820.9 |███ █████ █████ ████████████████████  ██   █████   █████  ████ ████     ████  ██
1730.4 |█████████ █████ ████████████████████  ████████████ █████ ██████████   ██████████
1639.9 |███████████████ █████████████████████ ████████████ █████████████████████████████
1549.4 |███████████████ ████████████████████████████████████████████████████████████████
1459.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15304
   1 ms | ██  838
   2 ms | █  296
   3 ms |   159
   4 ms |   105
   5 ms |   24
   6 ms |   12
   7 ms |   6
   8 ms |   4
  10 ms |   2
  11 ms |   1
  12 ms |   2
  13 ms |   8
  14 ms |   9
  15 ms |   19
  16 ms |   42
  17 ms |   94
  18 ms |   81
  19 ms |   78
  20 ms |   56
  21 ms |   28
  22 ms |   18
  23 ms |   8
  24 ms |   7
  25 ms |   3
  26 ms |   3
  27 ms |   1
  28 ms |   2
  29 ms |   2
  39 ms |   1
  40 ms |   1
  41 ms |   1
  43 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `45.41`
- `fps_harmonic_avg` = `860.86`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `31.57`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `23.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1888.80`, min `25.35`, p50 `2065.47`, p95 `2471.54`, p99 `2996.25`, 1%low `46.69`, 0.1%low `33.34`, std `603.95`

**Frame time (ms)**  avg `1.14`, p50 `0.48`, p95 `2.65`, p99 `18.82`, p99.9 `25.04`, max `39.45`

**Client tick (ms)**  avg `0.45`, p95 `0.64`, max `19.59`

**Memory**  start `1797 MB`, end `3207 MB`, peak `4503 MB`, GC `41 events / 535 ms`

**FPS over sampling window (ASCII):**

```
2127.0 |            █  █                                                                
2076.1 |  █         █  █   █                  █                                         
2025.1 |  ██     ██ █  █   █                  █    █         █   █ ██         █  █   █  
1974.2 | ███ █   ██ ██ █   █ █ █              █   ██ ██      █ █ █ ██  █ █    █ ███  █  
1923.2 |████ █  ███ ██ ██  ███ █     █    █  ██   █████      ████████ ██ █   ██ ███  █  
1872.3 |████ █ ██████████ ████ █     █ █  ██ ██ ███████      ████████ ████  ███ ███  ██ 
1821.4 |██████ ██████████ ██████████ ████ █████████████  ██  ████████ ████  ███████  ██ 
1770.4 |█████████████████ ███████████████ █████████████  ██  ████████ █████████████  ██ 
1719.5 |█████████████████████████████████ █████████████  ██  ████████ █████████████  ███
1668.5 |█████████████████████████████████ █████████████  ██████████████████████████ ████
1617.6 |███████████████████████████████████████████████████████████████████████████ ████
1566.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15686
   1 ms | ██  735
   2 ms | █  327
   3 ms |   153
   4 ms |   58
   5 ms |   24
   6 ms |   7
   7 ms |   3
   8 ms |   5
   9 ms |   3
  10 ms |   2
  12 ms |   2
  13 ms |   2
  14 ms |   16
  15 ms |   32
  16 ms |   71
  17 ms |   107
  18 ms |   96
  19 ms |   62
  20 ms |   49
  21 ms |   12
  22 ms |   17
  23 ms |   6
  24 ms |   3
  25 ms |   6
  26 ms |   4
  29 ms |   1
  30 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   2
  38 ms |   1
  39 ms |   1
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
- `fps_0p1pct_low` = `33.34`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `874.76`
- `preload_duration_ms` = `93.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.69`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `1406.76`, min `16.09`, p50 `1567.01`, p95 `2377.69`, p99 `2906.14`, 1%low `34.49`, 0.1%low `20.90`, std `720.95`

**Frame time (ms)**  avg `2.13`, p50 `0.64`, p95 `14.74`, p99 `23.49`, p99.9 `37.62`, max `62.15`

**Client tick (ms)**  avg `0.61`, p95 `0.92`, max `25.31`

**Memory**  start `2526 MB`, end `2806 MB`, peak `4177 MB`, GC `39 events / 607 ms`

**FPS over sampling window (ASCII):**

```
2365.5 |       █                               █                                        
2229.6 |       █                               █                                        
2093.7 |       █                   █           █                                        
1957.8 |  █ ██ █   █   █  █   █    █           █                                        
1821.9 |  ████ █ █ █   █ ██ █ █    █           █                                        
1686.0 |█ ████ █ █ █  ██ ██ █ █    ██ █       ██                                        
1550.1 |█ ████ █ ███████ ████ ███ ███ █       ██   █                                    
1414.2 |█ ██████ ████████████ ███████ █      ███   █             █    █  ███  █  █ █   █
1278.3 |█ ███████████████████ █████████  █   ███ █ ███ █  █ ██   █    █  ████ ██ █ ██  █
1142.4 |████████████████████████████████ ███████ █ ████████ ███  █ ██ █  █████████ ██ ██
1006.5 |██████████████████████████████████████████ ██████████████████████████████████ ██
870.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6885
   1 ms | ████  732
   2 ms | ███  490
   3 ms | ███  483
   4 ms | █  158
   5 ms |   63
   6 ms |   37
   7 ms |   30
   8 ms |   15
   9 ms |   11
  10 ms |   1
  11 ms |   2
  12 ms |   5
  13 ms |   5
  14 ms |   7
  15 ms |   21
  16 ms |   33
  17 ms |   42
  18 ms |   55
  19 ms |   65
  20 ms |   59
  21 ms |   42
  22 ms |   39
  23 ms |   28
  24 ms |   22
  25 ms |   15
  26 ms |   5
  27 ms |   9
  28 ms |   4
  29 ms |   6
  30 ms |   4
  31 ms |   2
  32 ms |   2
  33 ms |   1
  34 ms |   1
  35 ms |   1
  36 ms |   1
  37 ms |   2
  38 ms |   1
  40 ms |   1
  44 ms |   2
  48 ms |   2
  51 ms |   1
  52 ms |   1
  62 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `20.90`
- `seed` = `4027.00`
- `preload_duration_ms` = `16.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `34.49`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `469.60`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1304.05`, min `20.06`, p50 `1423.75`, p95 `1816.13`, p99 `2096.36`, 1%low `39.60`, 0.1%low `26.48`, std `455.00`

**Frame time (ms)**  avg `1.76`, p50 `0.70`, p95 `5.70`, p99 `22.32`, p99.9 `28.74`, max `49.86`

**Client tick (ms)**  avg `0.46`, p95 `0.75`, max `7.77`

**Memory**  start `1532 MB`, end `1794 MB`, peak `4041 MB`, GC `42 events / 558 ms`

**FPS over sampling window (ASCII):**

```
1538.1 |               █                                                                
1494.2 |█  █           █    █ █                                                       █ 
1450.3 |█  █          ██    ████                                                      █ 
1406.4 |█  █   █      ███  ███████                                           █        ██
1362.5 |█ ███  █      ███  ███████           ██ █          █      █   █      █       ███
1318.6 |█ ██████    █████ ████████  ███ █   █████     █ █  ██ █   █ █ █   ████  █   ████
1274.7 |███████████ ██████████████  ███ █  ███████ █ ██ █  ████   █ █ █   ████  █   ████
1230.8 |███████████ ██████████████ ████ █  ███████ █ █████ █████ ████ █ █████████   ████
1186.9 |█████████████████████████████████  ███████████████ ██████████ ███████████  █████
1143.0 |█████████████████████████████████████████████████████████████████████████  █████
1099.1 |█████████████████████████████████████████████████████████████████████████ ██████
1055.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9286
   1 ms | █████  1187
   2 ms | █  151
   3 ms |   49
   4 ms |   68
   5 ms |   85
   6 ms |   31
   7 ms |   14
   8 ms |   1
   9 ms |   1
  14 ms |   2
  15 ms |   11
  16 ms |   28
  17 ms |   49
  18 ms |   67
  19 ms |   71
  20 ms |   60
  21 ms |   69
  22 ms |   56
  23 ms |   41
  24 ms |   18
  25 ms |   5
  26 ms |   4
  27 ms |   3
  28 ms |   4
  29 ms |   1
  30 ms |   2
  32 ms |   1
  35 ms |   1
  37 ms |   2
  41 ms |   1
  45 ms |   1
  47 ms |   1
  49 ms |   1
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
- `fps_harmonic_avg` = `568.93`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `39.60`
- `fps_0p1pct_low` = `26.48`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `82.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23078 ms  |  Sample ticks: 400

**FPS**  avg `648.60`, min `6.56`, p50 `682.29`, p95 `1062.23`, p99 `1126.14`, 1%low `37.37`, 0.1%low `16.43`, std `309.74`

**Frame time (ms)**  avg `3.23`, p50 `1.47`, p95 `16.45`, p99 `20.67`, p99.9 `28.79`, max `152.36`

**Client tick (ms)**  avg `0.40`, p95 `0.62`, max `3.10`

**Memory**  start `2689 MB`, end `2459 MB`, peak `3826 MB`, GC `20 events / 224 ms`

**FPS over sampling window (ASCII):**

```
847.8 |                            ██                                                  
812.2 |  █                       █ ██                                                  
776.7 | ██ █       █             █ ██               █      █                           
741.1 |███ ██     ██            ██ ██  ██           █   █  █                           
705.6 |███ ██    ███   ██       ██████ ██           ██ ██  █        ██          █     █
670.1 |███ ██    ███ █ ██  █ █ ███████ ██  █     ██ ██████ ██       ██   ███    █  █  █
634.5 |███ ██    ███ █████ ███ ███████ ██  █  █ ███ ██████ ██   ██  ██   ████   █ ███ █
599.0 |███ ██ █ ████ █████ ███████████████ █  █ ██████████████  ██  █████████  ██ ███ █
563.4 |██████ ████████████ ███████████████ █  ████████████████  ███ █████████ ███ ███ █
527.9 |███████████████████ █████████████████ █████████████████  ███ █████████ ███ ███ █
492.3 |█████████████████████████████████████ ██████████████████████ ███████████████████
456.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  823
   1 ms | ████████████████████████████████████████  3410
   2 ms | ███████████  909
   3 ms | ██  203
   4 ms | █  127
   5 ms | █  82
   6 ms |   34
   7 ms |   20
   8 ms |   1
   9 ms |   3
  10 ms |   4
  11 ms |   3
  13 ms |   24
  14 ms | █  76
  15 ms | █  122
  16 ms | █  120
  17 ms | █  79
  18 ms | █  54
  19 ms |   31
  20 ms |   19
  21 ms |   16
  22 ms |   11
  23 ms |   9
  24 ms |   6
  25 ms |   4
  26 ms |   2
  28 ms |   3
  39 ms |   1
  40 ms |   1
  43 ms |   2
  45 ms |   1
 152 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.43`
- `seed` = `7411.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `37.37`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `310.06`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24502 ms  |  Sample ticks: 400

**FPS**  avg `631.76`, min `21.96`, p50 `682.36`, p95 `1033.82`, p99 `1125.39`, 1%low `41.44`, 0.1%low `26.80`, std `286.45`

**Frame time (ms)**  avg `3.20`, p50 `1.47`, p95 `16.49`, p99 `20.81`, p99.9 `28.23`, max `45.53`

**Client tick (ms)**  avg `0.45`, p95 `0.72`, max `3.16`

**Memory**  start `3107 MB`, end `3232 MB`, peak `4343 MB`, GC `18 events / 209 ms`

**FPS over sampling window (ASCII):**

```
782.3 |███                                                                             
747.4 |████████    █    █            █           █                                     
712.5 |████████ █  █  █ █ █        █ ██ █     █  █                                     
677.6 |██████████ █████ █ █       ██ ████     █  ██      █    █                        
642.7 |██████████████████ ██  ███ ██ ████ █ █ █████  █ █ ██  ██ ██             █       
607.8 |██████████████████████ ███ █████████ █ █████  █ █ ██  ██ ███   ██       █       
572.9 |████████████████████████████████████ ███████  █ ████████ ████ █████ ███ █  █  █ 
537.9 |████████████████████████████████████ ███████ ████████████████ █████ ███████████ 
503.0 |█████████████████████████████████████████████████████████████ █████████████████ 
468.1 |███████████████████████████████████████████████████████████████████████████████ 
433.2 |███████████████████████████████████████████████████████████████████████████████ 
398.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  459
   1 ms | ████████████████████████████████████████  3996
   2 ms | ███████  740
   3 ms | ██  237
   4 ms | █  112
   5 ms | █  71
   6 ms |   27
   7 ms |   19
   8 ms |   4
   9 ms |   3
  10 ms |   2
  13 ms |   9
  14 ms | █  75
  15 ms | █  126
  16 ms | █  119
  17 ms | █  83
  18 ms | █  56
  19 ms |   25
  20 ms |   32
  21 ms |   22
  22 ms |   16
  23 ms |   3
  24 ms |   4
  25 ms |   1
  26 ms |   5
  27 ms |   1
  28 ms |   2
  29 ms |   1
  37 ms |   1
  40 ms |   1
  43 ms |   1
  45 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `part` = `1.00`
- `fps_0p1pct_low` = `26.80`
- `seed` = `7417.00`
- `preload_duration_ms` = `1227.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `41.44`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `55.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `312.69`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `671.87`, min `20.33`, p50 `710.57`, p95 `1107.79`, p99 `1195.39`, 1%low `39.30`, 0.1%low `28.38`, std `318.78`

**Frame time (ms)**  avg `3.18`, p50 `1.41`, p95 `16.82`, p99 `21.81`, p99.9 `30.56`, max `49.20`

**Client tick (ms)**  avg `0.42`, p95 `0.66`, max `3.34`

**Memory**  start `3498 MB`, end `4582 MB`, peak `4851 MB`, GC `18 events / 188 ms`

**FPS over sampling window (ASCII):**

```
851.5 | █  █      █      █           █                                                 
813.9 |██ ██   █ ███ █  ██           █                                                 
776.3 |█████  ██████ █ ███      █ █  ██          █                                     
738.6 |██████ ██████ █ █████    █ █  ██          █  █      █                           
701.0 |██████ ██████████████ ████ ██ ███         █  ██  █  ███    █       █     █      
663.4 |█████████████████████ ████ ██████    █    █ ██████  ███  █ █   █ █ █     █      
625.8 |██████████████████████████ ██████  █ ██   ████████ ████  █ █  ██ █ █     █      
588.2 |██████████████████████████████████ █████  ████████ █████ █ █  ████ ███ █ ██    █
550.6 |█████████████████████████████████████████ ██████████████████ ██████████████  █ █
513.0 |████████████████████████████████████████████████████████████ ██████████████ ██ █
475.4 |████████████████████████████████████████████████████████████ ███████████████████
437.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████  1058
   1 ms | ████████████████████████████████████████  3426
   2 ms | █████████  751
   3 ms | ██  209
   4 ms | █  118
   5 ms | █  67
   6 ms |   33
   7 ms |   26
   8 ms |   7
   9 ms |   6
  10 ms |   4
  11 ms |   1
  13 ms |   2
  14 ms | █  54
  15 ms | █  97
  16 ms | █  124
  17 ms | █  103
  18 ms | █  61
  19 ms |   33
  20 ms |   30
  21 ms |   14
  22 ms |   19
  23 ms |   7
  24 ms |   9
  25 ms |   7
  26 ms |   4
  27 ms |   4
  28 ms |   3
  29 ms |   1
  31 ms |   4
  32 ms |   1
  35 ms |   1
  49 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `part` = `1.00`
- `fps_0p1pct_low` = `28.38`
- `seed` = `7433.00`
- `preload_duration_ms` = `51.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `39.30`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `314.14`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `688.24`, min `18.82`, p50 `738.10`, p95 `1094.51`, p99 `1184.27`, 1%low `40.62`, 0.1%low `26.15`, std `315.23`

**Frame time (ms)**  avg `3.04`, p50 `1.35`, p95 `16.33`, p99 `20.85`, p99.9 `28.32`, max `53.14`

**Client tick (ms)**  avg `0.38`, p95 `0.57`, max `1.48`

**Memory**  start `4271 MB`, end `4602 MB`, peak `5255 MB`, GC `15 events / 189 ms`

**FPS over sampling window (ASCII):**

```
889.8 |         █ █                                                                    
857.9 |█        █ █                                                                    
826.0 |█     █ ██ █                                                                    
794.1 |█   ███ ██ █             █                        █  █  █                       
762.1 |██ ███████ ██            █         █   █          █  █  █ █          █      █   
730.2 |██ ███████ ██   █        ███  █    █   █          ████ ████      █   █    █ █   
698.3 |██████████ ███  ████     ███ ██  ███   █    ██    ████ ████  █  ██   █ █  █ █ █ 
666.4 |██████████████  █████    ███ ██  ████ ██    ██ █ █████ ████ ██ ███   █ █  █ █ █ 
634.5 |██████████████  █████  █ ██████  ███████    ███████████████ ██████   █ █ ██ ████
602.5 |█████████████████████ ██ ██████  ███████    ███████████████ ████████ █ █ ███████
570.6 |████████████████████████████████ ███████ ██ ████████████████████████████████████
538.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████  1145
   1 ms | ████████████████████████████████████████  3655
   2 ms | ████████  772
   3 ms | ██  204
   4 ms | █  95
   5 ms | █  53
   6 ms |   34
   7 ms |   14
   8 ms |   8
   9 ms |   4
  10 ms |   3
  12 ms |   1
  13 ms |   16
  14 ms | █  69
  15 ms | █  130
  16 ms | █  100
  17 ms | █  91
  18 ms | █  51
  19 ms |   41
  20 ms |   24
  21 ms |   21
  22 ms |   15
  23 ms |   6
  24 ms |   6
  25 ms |   3
  26 ms |   4
  27 ms |   1
  28 ms |   2
  29 ms |   1
  32 ms |   1
  35 ms |   1
  41 ms |   1
  47 ms |   1
  53 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `part` = `1.00`
- `fps_0p1pct_low` = `26.15`
- `seed` = `7451.00`
- `preload_duration_ms` = `51.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-9.00`
- `entity_count_sample_start` = `10.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `40.62`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `328.83`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23547 ms  |  Sample ticks: 400

**FPS**  avg `689.06`, min `22.29`, p50 `732.13`, p95 `1115.48`, p99 `1184.95`, 1%low `41.20`, 0.1%low `30.09`, std `318.86`

**Frame time (ms)**  avg `3.07`, p50 `1.37`, p95 `16.84`, p99 `21.06`, p99.9 `28.70`, max `44.85`

**Client tick (ms)**  avg `0.40`, p95 `0.62`, max `4.51`

**Memory**  start `4531 MB`, end `3397 MB`, peak `5620 MB`, GC `15 events / 198 ms`

**FPS over sampling window (ASCII):**

```
861.6 |     █                                                                          
827.8 | █   █                    █   █                                                 
793.9 | ███ █   █      ██   █  ███   ██                      █                         
760.1 | █████ █ ██     ███ ███ ████ ███                █     █                  █ █    
726.2 | █████ ████ █   ███████ ████ ███  █             █     █                  █ █   █
692.4 | █████ ██████ █ ████████████ ███  █ █ █       ████  █ █ █  █ █ █ █  █   ██ █   █
658.5 |███████████████ █████████████████ █ █ ██ ██  ████████ █ █ ██ █ █ ██ █   ████   █
624.6 |█████████████████████████████████ ███ ██ ███ ████████ ██████ █ ██████ █ ████ █ █
590.8 |█████████████████████████████████████ ██ ███ ████████ █████████████████ ████████
556.9 |█████████████████████████████████████ ██ ███ ████████ █████████████████ ████████
523.1 |█████████████████████████████████████ ███████████████ █████████████████ ████████
489.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████  1249
   1 ms | ████████████████████████████████████████  3518
   2 ms | ████████  746
   3 ms | ██  193
   4 ms | █  96
   5 ms | █  74
   6 ms |   23
   7 ms |   21
   8 ms |   9
   9 ms |   3
  10 ms |   1
  12 ms |   1
  13 ms |   3
  14 ms | █  65
  15 ms | █  104
  16 ms | █  99
  17 ms | █  96
  18 ms | █  77
  19 ms |   38
  20 ms |   33
  21 ms |   17
  22 ms |   14
  23 ms |   12
  24 ms |   8
  25 ms |   5
  26 ms |   2
  28 ms |   1
  29 ms |   1
  30 ms |   2
  31 ms |   1
  32 ms |   1
  33 ms |   1
  44 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `part` = `1.00`
- `fps_0p1pct_low` = `30.09`
- `seed` = `7457.00`
- `preload_duration_ms` = `510.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-17.00`
- `entity_count_sample_start` = `18.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `41.20`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `325.73`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 25606 ms  |  Sample ticks: 400

**FPS**  avg `680.35`, min `20.76`, p50 `712.72`, p95 `1088.81`, p99 `1172.21`, 1%low `43.71`, 0.1%low `30.43`, std `302.33`

**Frame time (ms)**  avg `2.95`, p50 `1.40`, p95 `16.04`, p99 `19.61`, p99.9 `26.73`, max `48.16`

**Client tick (ms)**  avg `0.40`, p95 `0.56`, max `2.45`

**Memory**  start `4862 MB`, end `4631 MB`, peak `5962 MB`, GC `14 events / 180 ms`

**FPS over sampling window (ASCII):**

```
839.8 | █        █  █       █                                                          
805.8 |██ █   ██ █  █    █  █                                                          
771.7 |██ █   ██ █  █    █  █  ██ █  ██                                                
737.7 |██ █   ███████ ████  █  ██ █  ██ █       █ █ █    █ █  █        █  █            
703.7 |██ █   █████████████ █ ███ █  █████      █ █ █ █  █ ████      █ █  █            
669.6 |████ █ █████████████ █ █████  ███████    ███████  █ ████ ███  █ █ ███   █       
635.6 |████ █ █████████████ ████████ ████████ █ ███████  █████████████ █████   █       
601.6 |█████████████████████████████ ██████████ ████████ ███████████████████   █ ██    
567.5 |█████████████████████████████████████████████████████████████████████ ███ ██ █  
533.5 |████████████████████████████████████████████████████████████████████████████ ██ 
499.5 |████████████████████████████████████████████████████████████████████████████ ███
465.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  1041
   1 ms | ████████████████████████████████████████  4054
   2 ms | ███████  705
   3 ms | ██  189
   4 ms | █  120
   5 ms |   45
   6 ms |   27
   7 ms |   10
   8 ms |   8
   9 ms |   1
  11 ms |   1
  13 ms |   11
  14 ms | █  80
  15 ms | █  150
  16 ms | █  123
  17 ms | █  75
  18 ms | █  56
  19 ms |   35
  20 ms |   18
  21 ms |   10
  22 ms |   10
  23 ms |   3
  24 ms |   4
  25 ms |   1
  26 ms |   5
  27 ms |   3
  32 ms |   1
  39 ms |   1
  48 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `part` = `1.00`
- `fps_0p1pct_low` = `30.43`
- `seed` = `7477.00`
- `preload_duration_ms` = `2550.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `43.71`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `339.41`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `685.92`, min `6.44`, p50 `732.97`, p95 `1122.14`, p99 `1198.99`, 1%low `36.52`, 0.1%low `16.11`, std `321.16`

**Frame time (ms)**  avg `3.10`, p50 `1.36`, p95 `16.39`, p99 `21.27`, p99.9 `29.29`, max `155.31`

**Client tick (ms)**  avg `0.42`, p95 `0.76`, max `2.38`

**Memory**  start `5207 MB`, end `4510 MB`, peak `6333 MB`, GC `14 events / 193 ms`

**FPS over sampling window (ASCII):**

```
918.9 |        █                                                                       
876.0 |█       █                                                                       
833.1 |██████  ██  █ █                █                                                
790.3 |██████ ███ ██ ███             ██      █         █                   █           
747.4 |█████████████ ████   █ █  ██  ██ █ █  █   ██    █          █       ██    █      
704.5 |█████████████ ████  █████ ██  ████ █  █   ██ █  █ ██       █       ██   ██   █  
661.7 |██████████████████  █████ █████████████████████ █ ██       █       ██ █ ██   █  
618.8 |█████████████████████████ ██████████████████████████      ██    ██ ██ █ ███  █  
575.9 |████████████████████████████████████████████████████  █  ███  ████ ███████████  
533.1 |████████████████████████████████████████████████████  ████████████ ███████████  
490.2 |█████████████████████████████████████████████████████ █████████████████████████ 
447.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████  1191
   1 ms | ████████████████████████████████████████  3444
   2 ms | █████████  796
   3 ms | ██  195
   4 ms | █  115
   5 ms | █  69
   6 ms |   30
   7 ms |   21
   8 ms |   4
   9 ms |   6
  10 ms |   1
  11 ms |   2
  13 ms |   16
  14 ms | █  72
  15 ms | █  115
  16 ms | █  117
  17 ms | █  69
  18 ms | █  56
  19 ms |   37
  20 ms |   23
  21 ms |   14
  22 ms |   22
  23 ms |   7
  24 ms |   8
  25 ms |   4
  26 ms |   3
  27 ms |   3
  28 ms |   3
  29 ms |   1
  33 ms |   1
  35 ms |   1
  44 ms |   1
  46 ms |   1
  57 ms |   1
 155 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.11`
- `seed` = `7481.00`
- `preload_duration_ms` = `35.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `1.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `36.52`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `322.73`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25646 ms  |  Sample ticks: 400

**FPS**  avg `618.31`, min `19.16`, p50 `648.91`, p95 `1012.22`, p99 `1085.34`, 1%low `40.38`, 0.1%low `24.09`, std `286.38`

**Frame time (ms)**  avg `3.27`, p50 `1.54`, p95 `16.48`, p99 `20.55`, p99.9 `29.04`, max `52.18`

**Client tick (ms)**  avg `0.38`, p95 `0.60`, max `3.49`

**Memory**  start `4446 MB`, end `6462 MB`, peak `6656 MB`, GC `13 events / 163 ms`

**FPS over sampling window (ASCII):**

```
776.4 |      █                                                                         
749.8 | ██  ███                                                                        
723.2 | ███ ███     █ █      █  █        █                                             
696.6 | ███ ███    ██ █     ██ ██ ██     █                   █                         
670.0 |████ █████  ████    ███ ██ ██ █ █ █      █            █                        █
643.4 |████ █████  █████  ████ ██ ██ █████   ██ █ █         ██  █   ██       █      █ █
616.8 |██████████  ██████ ██████████ █████   ██ ████        ██  █   ██       █      █ █
590.2 |███████████ ██████ ██████████ █████   ██ ████     █  ██ ██   ██   ██  ██   ███ █
563.6 |██████████████████ ████████████████  ███ █████    █████ ██   ██ █ ██ ███   ███ █
537.0 |██████████████████ █████████████████████ █████ █ █████████  ███ █ ██ █████ ███ █
510.4 |██████████████████ █████████████████████ ██████████████████ ████████ ███████████
483.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████  373
   1 ms | ████████████████████████████████████████  3832
   2 ms | █████████  859
   3 ms | ██  227
   4 ms | █  119
   5 ms | █  63
   6 ms |   31
   7 ms |   22
   8 ms |   7
   9 ms |   7
  11 ms |   2
  13 ms |   13
  14 ms | █  71
  15 ms | █  137
  16 ms | █  103
  17 ms | █  95
  18 ms | █  53
  19 ms |   37
  20 ms |   22
  21 ms |   13
  22 ms |   12
  23 ms |   7
  24 ms |   5
  25 ms |   5
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   2
  30 ms |   1
  35 ms |   1
  48 ms |   1
  51 ms |   1
  52 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `part` = `1.00`
- `fps_0p1pct_low` = `24.09`
- `seed` = `7487.00`
- `preload_duration_ms` = `2602.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `40.38`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `306.09`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `655.69`, min `7.87`, p50 `692.41`, p95 `1056.28`, p99 `1151.71`, 1%low `37.77`, 0.1%low `17.11`, std `294.57`

**Frame time (ms)**  avg `3.09`, p50 `1.44`, p95 `16.38`, p99 `20.50`, p99.9 `32.59`, max `127.02`

**Client tick (ms)**  avg `0.49`, p95 `0.72`, max `4.98`

**Memory**  start `4749 MB`, end `3930 MB`, peak `6790 MB`, GC `12 events / 197 ms`

**FPS over sampling window (ASCII):**

```
785.4 |      █  █                                                   █                  
757.0 |      █  █    █            █                                 █                  
728.5 |█    ██████  ██            █                                 █ █                
700.0 |███████████████            █    █    █     █             █████ █         █ █    
671.6 |██████████████████         █ █  ███ ██ ██  █      █ █    █████ █   █     █ ██ ██
643.1 |████████████████████    ████ ██ ███ █████  █   █ ████   ██████ ██  █  █ ██ ██ ██
614.7 |████████████████████   ████████ █████████  ██ ███████  ███████████ █ ████████ ██
586.2 |████████████████████   ██████████████████  █████████████████████████ ████████ ██
557.8 |████████████████████  ████████████████████ █████████████████████████████████████
529.3 |█████████████████████ ████████████████████ █████████████████████████████████████
500.9 |██████████████████████████████████████████ █████████████████████████████████████
472.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  701
   1 ms | ████████████████████████████████████████  4001
   2 ms | ████████  765
   3 ms | ██  213
   4 ms | █  98
   5 ms | █  63
   6 ms |   27
   7 ms |   18
   8 ms |   6
   9 ms |   3
  10 ms |   1
  11 ms |   1
  13 ms |   7
  14 ms | █  82
  15 ms | █  123
  16 ms | █  91
  17 ms | █  92
  18 ms | █  63
  19 ms |   36
  20 ms |   20
  21 ms |   18
  22 ms |   9
  23 ms |   6
  24 ms |   8
  25 ms |   4
  26 ms |   2
  30 ms |   3
  34 ms |   1
  37 ms |   1
  42 ms |   1
  46 ms |   1
  47 ms |   2
 127 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.11`
- `seed` = `7499.00`
- `preload_duration_ms` = `27.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `7.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `37.77`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `323.51`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23988 ms  |  Sample ticks: 400

**FPS**  avg `726.09`, min `21.94`, p50 `797.15`, p95 `1115.01`, p99 `1189.72`, 1%low `43.35`, 0.1%low `29.34`, std `313.16`

**Frame time (ms)**  avg `2.81`, p50 `1.25`, p95 `15.64`, p99 `19.62`, p99.9 `27.50`, max `45.57`

**Client tick (ms)**  avg `0.34`, p95 `0.46`, max `2.18`

**Memory**  start `3788 MB`, end `4358 MB`, peak `6749 MB`, GC `14 events / 177 ms`

**FPS over sampling window (ASCII):**

```
875.7 | ██                                                                             
843.7 | ███  █ █          █         █                                                  
811.7 | ███  █ █        ███ █       █         █       █              █                 
779.7 | ████ ███ █     ████████ ██  █  █ █    █      ██       █     ██                 
747.7 |█████████ █    █████████ █████  ███ ██ █ █    ██    █  █     ██                 
715.7 |███████████   ██████████ ████████████████████ ██    █ ██ █   ████    █   ██     
683.7 |████████████ ████████████████████████████████ ██   ██ ██ █   █████ █ █  ███  █ █
651.7 |████████████ ████████████████████████████████████ ████████ ███████ █ █  ███ ██ █
619.8 |██████████████████████████████████████████████████████████████████ ███  ██████ █
587.8 |██████████████████████████████████████████████████████████████████ ████ ████████
555.8 |██████████████████████████████████████████████████████████████████ █████████████
523.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████  1514
   1 ms | ████████████████████████████████████████  4050
   2 ms | ██████  576
   3 ms | ██  178
   4 ms | █  102
   5 ms | █  52
   6 ms |   35
   7 ms |   19
   8 ms |   4
   9 ms |   3
  13 ms |   17
  14 ms | █  115
  15 ms | ██  154
  16 ms | █  95
  17 ms | █  66
  18 ms | █  55
  19 ms |   26
  20 ms |   23
  21 ms |   10
  22 ms |   9
  23 ms |   5
  24 ms |   5
  25 ms |   3
  26 ms |   1
  27 ms |   2
  28 ms |   3
  29 ms |   1
  39 ms |   2
  45 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `part` = `1.00`
- `fps_0p1pct_low` = `29.34`
- `seed` = `7507.00`
- `preload_duration_ms` = `960.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `43.35`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `50.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `356.45`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `620.33`, min `21.19`, p50 `643.22`, p95 `1042.36`, p99 `1126.98`, 1%low `38.91`, 0.1%low `23.03`, std `293.13`

**Frame time (ms)**  avg `3.33`, p50 `1.55`, p95 `16.99`, p99 `21.09`, p99.9 `32.87`, max `47.19`

**Client tick (ms)**  avg `0.41`, p95 `0.65`, max `7.14`

**Memory**  start `4189 MB`, end `4262 MB`, peak `6917 MB`, GC `11 events / 192 ms`

**FPS over sampling window (ASCII):**

```
789.2 |   █          █  █                                                              
749.8 | █ ██  █      █  █  █           █                    █                          
710.3 |██████ █   █  █  █ ██          ██          █         █             █            
670.8 |██████ ██ █████ █████  █   ██  ██      █ █ █   █    ███ █     █    █   █        
631.3 |█████████ ███████████ ██   ██  ███  ████ █ █   █ █  ███ █     ██   █   █  █     
591.8 |█████████ ██████████████   ███████ ███████ █ █ █ ██████████   ███ ██   ████ █   
552.3 |█████████ ██████████████ █ █████████████████ ███ ██████████   ███ ███  ██████ █ 
512.8 |█████████ ██████████████ █ █████████████████████████████████  ███████  ██████ █ 
473.4 |████████████████████████████████████████████████████████████  ███████████████ █ 
433.9 |█████████████████████████████████████████████████████████████ ██████████████████
394.4 |█████████████████████████████████████████████████████████████ ██████████████████
354.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  495
   1 ms | ████████████████████████████████████████  3618
   2 ms | █████████  842
   3 ms | ██  211
   4 ms | █  115
   5 ms | █  86
   6 ms |   26
   7 ms |   15
   8 ms |   9
   9 ms |   7
  10 ms |   5
  11 ms |   1
  12 ms |   2
  13 ms |   6
  14 ms |   39
  15 ms | █  123
  16 ms | █  108
  17 ms | █  96
  18 ms | █  70
  19 ms |   42
  20 ms |   28
  21 ms |   17
  22 ms |   8
  23 ms |   15
  24 ms |   4
  25 ms |   3
  26 ms |   4
  27 ms |   1
  28 ms |   2
  31 ms |   1
  32 ms |   1
  36 ms |   1
  43 ms |   2
  44 ms |   1
  45 ms |   1
  47 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `part` = `1.00`
- `fps_0p1pct_low` = `23.03`
- `seed` = `7517.00`
- `preload_duration_ms` = `64.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-53.00`
- `entity_count_sample_start` = `54.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `38.91`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `300.28`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23067 ms  |  Sample ticks: 400

**FPS**  avg `734.60`, min `21.45`, p50 `805.75`, p95 `1142.77`, p99 `1205.49`, 1%low `41.15`, 0.1%low `27.49`, std `331.90`

**Frame time (ms)**  avg `2.90`, p50 `1.24`, p95 `16.17`, p99 `20.38`, p99.9 `27.43`, max `46.61`

**Client tick (ms)**  avg `0.36`, p95 `0.54`, max `1.36`

**Memory**  start `4716 MB`, end `4425 MB`, peak `7131 MB`, GC `11 events / 176 ms`

**FPS over sampling window (ASCII):**

```
886.1 |   █  █                                                                         
852.5 |  ██ ██         █  █                     ██                        █            
818.9 |  ██████   ██   █  █ █                   ██       █                █    █       
785.3 |█ ████████ ██   █  █ █     ██  █ █      ███  █   ██ █        █  █  █    █       
751.7 |██████████ ██   ██████     ██  █ █   ██ ██████   ████        █ ██ ██   ██ ██    
718.1 |███████████████ ██████  ██ ███ █ ██ ███ ███████  ████        █ ██ ██   █████    
684.5 |██████████████████████  ████████ ██ ███████████  ████  ██    █ █████ ██████████ 
650.9 |██████████████████████  ████████ ██ █████████████████ ███    █ █████████████████
617.3 |██████████████████████  ███████████ █████████████████ ███  █████████████████████
583.7 |██████████████████████ ████████████ ██████████████████████ █████████████████████
550.1 |███████████████████████████████████ ████████████████████████████████████████████
516.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████  1873
   1 ms | ████████████████████████████████████████  3399
   2 ms | ███████  616
   3 ms | ██  171
   4 ms | █  118
   5 ms | █  67
   6 ms |   29
   7 ms |   21
   8 ms |   12
   9 ms |   4
  10 ms |   3
  13 ms |   11
  14 ms | █  76
  15 ms | ██  131
  16 ms | █  113
  17 ms | █  86
  18 ms | █  48
  19 ms |   39
  20 ms |   25
  21 ms |   12
  22 ms |   13
  23 ms |   9
  24 ms |   4
  25 ms |   6
  26 ms |   4
  27 ms |   3
  28 ms |   2
  38 ms |   1
  42 ms |   2
  46 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `part` = `1.00`
- `fps_0p1pct_low` = `27.49`
- `seed` = `7523.00`
- `preload_duration_ms` = `31.00`
- `entity_count_sample_end` = `12.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `7.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `41.15`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `344.81`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1435.45`, min `7.82`, p50 `1577.04`, p95 `1986.58`, p99 `2678.30`, 1%low `38.04`, 0.1%low `22.17`, std `518.65`

**Frame time (ms)**  avg `1.61`, p50 `0.63`, p95 `4.70`, p99 `22.51`, p99.9 `30.14`, max `127.84`

**Client tick (ms)**  avg `0.43`, p95 `0.89`, max `4.49`

**Memory**  start `5948 MB`, end `5117 MB`, peak `7133 MB`, GC `27 events / 570 ms`

**FPS over sampling window (ASCII):**

```
1918.8 |                                                                    █           
1854.4 |                                                                    █           
1790.1 |                                                                    █           
1725.8 |         █     █                                                    █           
1661.5 |         █     █                                                    █           
1597.2 |         █     █ █ █                █               █               █           
1532.9 | █ █     █  █  █ ███           █   ██      █        █             █ █           
1468.6 |██ ██  ███  ██ ██████     █   ██  ████ █   █        ██  █     █  ██ █████     ██
1404.3 |█████  ███  ████████████  █ ████████████ ███ █     ████ ██ █  ████████████   ███
1339.9 |██████████ █████████████ █████████████████████ ███████████ ██ ████████████ █ ███
1275.6 |██████████ ██████████████████████████████████████████████████ ████████████ █ ███
1211.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10318
   1 ms | ████  1142
   2 ms | █  178
   3 ms |   86
   4 ms |   91
   5 ms |   72
   6 ms |   33
   7 ms |   11
   8 ms |   1
   9 ms |   2
  10 ms |   1
  12 ms |   1
  13 ms |   4
  14 ms |   4
  15 ms |   12
  16 ms |   18
  17 ms |   37
  18 ms |   63
  19 ms |   66
  20 ms |   60
  21 ms |   53
  22 ms |   51
  23 ms |   44
  24 ms |   22
  25 ms |   16
  26 ms |   3
  27 ms |   1
  28 ms |   3
  29 ms |   3
  30 ms |   1
  31 ms |   2
  32 ms |   2
  33 ms |   2
  36 ms |   1
  39 ms |   2
  48 ms |   1
  54 ms |   1
 127 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_1pct_low` = `38.04`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `49.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `22.17`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `620.45`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `126.92`, min `6.68`, p50 `146.63`, p95 `207.27`, p99 `307.34`, 1%low `15.01`, 0.1%low `8.44`, std `68.32`

**Frame time (ms)**  avg `12.97`, p50 `6.82`, p95 `36.68`, p99 `54.11`, p99.9 `78.44`, max `149.78`

**Client tick (ms)**  avg `6.85`, p95 `15.30`, max `135.90`

**Memory**  start `6006 MB`, end `5442 MB`, peak `7209 MB`, GC `23 events / 501 ms`

**FPS over sampling window (ASCII):**

```
223.3 |                                                    █                           
209.3 |                                                    █                           
195.2 |                                                    █                           
181.2 |                                                    █                           
167.1 |                                     █              █                           
153.0 | █                    █              █              █ █    █                    
139.0 |██   ██ ███         █ ████       █  █████ ████     ████  █ █ █    █    █    █   
124.9 |███████████        ███████     ███ ███████████ █████████████ ██  ████ █████████ 
110.9 |█████████████     ██████████  ████████████████ █████████████████ ██████████████ 
 96.8 |█████████████ ██████████████████████████████████████████████████████████████████
 82.8 |█████████████ ██████████████████████████████████████████████████████████████████
 68.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  7
   3 ms | ██  27
   4 ms | ███████  86
   5 ms | ████████████████████████████████████████  479
   6 ms | ████████████████  192
   7 ms | █████  65
   8 ms | ████  44
   9 ms | █████  61
  10 ms | █████  60
  11 ms | ███  32
  12 ms | ██  20
  13 ms | █  10
  14 ms | █  8
  15 ms | █  10
  16 ms | █  8
  17 ms | █  11
  18 ms | ██  25
  19 ms | ██  23
  20 ms | ███  33
  21 ms | ███  38
  22 ms | ███  35
  23 ms | ███  35
  24 ms | ██  27
  25 ms | ██  28
  26 ms | █  13
  27 ms | █  13
  28 ms | █  13
  29 ms | █  12
  30 ms | █  8
  31 ms |   5
  32 ms | █  11
  33 ms | █  10
  34 ms | █  6
  35 ms | █  6
  36 ms |   5
  37 ms |   4
  38 ms |   5
  39 ms | █  6
  40 ms | █  6
  41 ms |   5
  42 ms |   2
  43 ms | █  7
  44 ms | █  6
  45 ms |   3
  46 ms |   2
  48 ms |   1
  49 ms |   4
  50 ms |   3
  51 ms |   2
  52 ms |   2
  53 ms |   2
  54 ms |   5
  55 ms |   1
  56 ms |   1
  57 ms |   1
  58 ms |   1
  59 ms |   1
  60 ms |   1
  62 ms |   2
  71 ms |   1
  87 ms |   1
 149 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `8.44`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `255360.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `77.09`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `48.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `15.01`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1315.92`, min `6.12`, p50 `1444.42`, p95 `1846.70`, p99 `2113.59`, 1%low `36.34`, 0.1%low `18.79`, std `469.35`

**Frame time (ms)**  avg `1.78`, p50 `0.69`, p95 `5.64`, p99 `22.85`, p99.9 `30.49`, max `163.37`

**Client tick (ms)**  avg `0.41`, p95 `0.74`, max `2.77`

**Memory**  start `7040 MB`, end `7108 MB`, peak `7228 MB`, GC `27 events / 564 ms`

**FPS over sampling window (ASCII):**

```
1522.5 |                █               ██                                              
1481.4 |    █           █      █        ██            █                         █       
1440.2 |  █ █           ██    ██     █ ███            █                         █      █
1399.1 |  █ ███        ██████ ██     █ ███        █ █ ██                        █   █  █
1357.9 |███████   █    █████████     █ ███        █ █ ██              █ ██   █  █ █ █ ██
1316.8 |█████████ █  █ █████████  █  █ ████ █     █ ████ █ █    █     █ ██   █ ██ █ ████
1275.6 |███████████  ████████████ ██ ██████ █     █ █████████  ██     ████  ███████ ████
1234.5 |████████████ ███████████████ █████████    █ █████████ ███  █  ████  ████████████
1193.4 |████████████████████████████ █████████ ████ █████████████ ██ ███████████████████
1152.2 |████████████████████████████ ████████████████████████████ ██████████████████████
1111.1 |████████████████████████████ ███████████████████████████████████████████████████
1069.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9036
   1 ms | ██████  1285
   2 ms | █  196
   3 ms |   61
   4 ms |   60
   5 ms |   66
   6 ms |   31
   7 ms |   12
   8 ms |   6
  11 ms |   1
  12 ms |   1
  13 ms |   1
  14 ms |   3
  15 ms |   7
  16 ms |   21
  17 ms |   37
  18 ms |   61
  19 ms |   62
  20 ms |   51
  21 ms |   61
  22 ms |   78
  23 ms |   34
  24 ms |   22
  25 ms |   18
  26 ms |   7
  27 ms |   3
  28 ms |   4
  29 ms |   1
  30 ms |   2
  31 ms |   1
  33 ms |   1
  34 ms |   1
  39 ms |   1
  40 ms |   1
  42 ms |   1
  44 ms |   1
  49 ms |   1
  51 ms |   1
  54 ms |   1
 163 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.79`
- `seed` = `9043.00`
- `preload_duration_ms` = `37.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `36.34`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `561.95`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1354.75`, min `17.43`, p50 `1463.21`, p95 `1957.77`, p99 `2833.88`, 1%low `38.74`, 0.1%low `25.88`, std `512.57`

**Frame time (ms)**  avg `1.70`, p50 `0.68`, p95 `5.15`, p99 `22.66`, p99.9 `27.96`, max `57.38`

**Client tick (ms)**  avg `0.46`, p95 `0.97`, max `3.89`

**Memory**  start `6010 MB`, end `3661 MB`, peak `7243 MB`, GC `27 events / 438 ms`

**FPS over sampling window (ASCII):**

```
2407.1 |                     █                                                          
2289.3 |                     █                                                          
2171.6 |                     █                                                          
2053.8 |                     ██                                                         
1936.0 |                     ██                                                         
1818.2 |                     ██                                                         
1700.5 |                     ██                 █                                       
1582.7 |                     ██                 █                                       
1464.9 |██ █            █    ██         ██    █ █             █  █     █ █              
1347.1 |████████ ██    ███████████    █████████ █ █ █  █████████ █  █ ████████  ██   █ █
1229.4 |███████████████████████████████████████████ ██ ███████████████████████  ███ ████
1111.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9538
   1 ms | █████  1243
   2 ms | █  190
   3 ms |   80
   4 ms |   89
   5 ms |   69
   6 ms |   30
   7 ms |   10
   8 ms |   8
  10 ms |   1
  11 ms |   1
  12 ms |   2
  13 ms |   2
  14 ms |   2
  15 ms |   9
  16 ms |   23
  17 ms |   41
  18 ms |   56
  19 ms |   60
  20 ms |   74
  21 ms |   53
  22 ms |   54
  23 ms |   36
  24 ms |   29
  25 ms |   8
  26 ms |   10
  27 ms |   8
  28 ms |   3
  29 ms |   1
  30 ms |   1
  35 ms |   1
  37 ms |   1
  41 ms |   1
  44 ms |   1
  45 ms |   1
  55 ms |   1
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `38.74`
- `fps_harmonic_avg` = `587.09`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `25.88`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `0.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1207.41`, min `19.27`, p50 `1333.60`, p95 `1660.13`, p99 `1880.91`, 1%low `39.05`, 0.1%low `25.46`, std `425.32`

**Frame time (ms)**  avg `1.86`, p50 `0.75`, p95 `6.03`, p99 `22.54`, p99.9 `29.74`, max `51.90`

**Client tick (ms)**  avg `0.44`, p95 `0.80`, max `4.01`

**Memory**  start `5565 MB`, end `6710 MB`, peak `7273 MB`, GC `27 events / 432 ms`

**FPS over sampling window (ASCII):**

```
1370.8 | █                                                                              
1336.6 | █                                 █                                            
1302.4 | █    █          ██             █  █              █      █                      
1268.3 | ███  █         ███            ██  █     █  ██    ███    ███    █       ██  ██ █
1234.1 |████████        ████  ██       ██  ███   █  ██    ███  █ ███  █ ██      ███ ████
1199.9 |████████   ██   ████ ███   █   ██ ████   █  █████ ███ ██████ ██████    █████████
1165.7 |██████████ ███  ████ ████  █  ███ █████  █  ███████████████████████    █████████
1131.5 |██████████ ███████████████ █ ██████████  █  ████████████████████████   █████████
1097.3 |████████████████████████████ ██████████ ██ ███████████████████████████ █████████
1063.2 |██████████████████████████████████████████ █████████████████████████████████████
1029.0 |██████████████████████████████████████████ █████████████████████████████████████
994.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8349
   1 ms | ███████  1440
   2 ms | █  191
   3 ms |   66
   4 ms |   73
   5 ms |   78
   6 ms |   37
   7 ms |   10
   8 ms |   2
   9 ms |   1
  10 ms |   1
  14 ms |   2
  15 ms |   16
  16 ms |   22
  17 ms |   40
  18 ms |   74
  19 ms |   59
  20 ms |   61
  21 ms |   70
  22 ms |   66
  23 ms |   29
  24 ms |   22
  25 ms |   9
  26 ms |   3
  27 ms |   1
  28 ms |   2
  29 ms |   2
  30 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   1
  37 ms |   1
  38 ms |   1
  41 ms |   1
  43 ms |   1
  44 ms |   2
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `39.05`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `537.15`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `25.46`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `74.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1030.12`, min `15.02`, p50 `1128.27`, p95 `1450.74`, p99 `1770.20`, 1%low `35.76`, 0.1%low `21.52`, std `381.61`

**Frame time (ms)**  avg `2.14`, p50 `0.89`, p95 `7.89`, p99 `23.91`, p99.9 `37.97`, max `66.59`

**Client tick (ms)**  avg `0.54`, p95 `0.79`, max `21.54`

**Memory**  start `3908 MB`, end `6835 MB`, peak `7341 MB`, GC `25 events / 403 ms`

**FPS over sampling window (ASCII):**

```
1235.2 |                █                                                               
1200.1 |       █        █                █             █                                
1164.9 |       █        █                █ █          ██      █                         
1129.8 |       █        █                █ █          ██    █ █                      ██ 
1094.6 |  ██   ██      █████          █ ██ ██         ██   ██ █        █   ███     █ ██ 
1059.5 |  ██  ████     ██████ █       █ ██ ██         ██  █████     █ ██   ███ █   █ ██ 
1024.3 |█ ██  ████ █   ████████       █ █████         ██  █████     █ ██ █████ █ █ █ ██ 
989.2 |████  ██████ ███████████ █   ██ ███████       ██████████  █ ██████████ █████ ███
954.0 |████████████ █████████████ ████ ███████ █ █ ████████████  ██████████████████████
918.8 |████████████ ██████████████████ █████████ ███████████████ ██████████████████████
883.7 |█████████████████████████████████████████ ███████████████ ██████████████████████
848.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6157
   1 ms | ██████████████  2128
   2 ms | ██  258
   3 ms | █  115
   4 ms | █  84
   5 ms |   73
   6 ms |   40
   7 ms |   16
   8 ms |   4
   9 ms |   2
  12 ms |   1
  14 ms |   1
  15 ms |   8
  16 ms |   20
  17 ms |   37
  18 ms |   41
  19 ms |   59
  20 ms |   56
  21 ms |   48
  22 ms |   54
  23 ms |   45
  24 ms |   39
  25 ms |   16
  26 ms |   14
  27 ms |   4
  28 ms |   1
  29 ms |   2
  30 ms |   1
  32 ms |   1
  33 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms |   2
  39 ms |   2
  40 ms |   1
  45 ms |   1
  47 ms |   1
  48 ms |   1
  50 ms |   1
  66 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `21.52`
- `seed` = `8053.00`
- `preload_duration_ms` = `77.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `35.76`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `467.26`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195648 ms  |  Sample ticks: 3600

**FPS**  avg `193.17`, min `0.64`, p50 `197.98`, p95 `391.07`, p99 `506.41`, 1%low `16.65`, 0.1%low `6.14`, std `116.22`

**Frame time (ms)**  avg `9.41`, p50 `5.05`, p95 `26.15`, p99 `43.00`, p99.9 `61.85`, max `1569.75`

**Client tick (ms)**  avg `1.07`, p95 `2.02`, max `24.92`

**Memory**  start `6061 MB`, end `6790 MB`, peak `7733 MB`, GC `153 events / 2522 ms`

**FPS over sampling window (ASCII):**

```
271.4 |█                                                ██                  █          
255.6 |████                                       █     ███        ████ ██████         
239.9 |████                                █     ███    ████ █   ██████ ███████        
224.1 |████        █                       ██   ████    ████ █  ███████ ███████████████
208.3 |████        █                      ███   ████  █ ███████ ███████████████████████
192.6 |████        ██                    ████   ████  █████████████████████████████████
176.8 |████ █      ██                  █ ████   ████ ██████████████████████████████████
161.0 |████ ██     ██              █ █ █ ████   ████ ██████████████████████████████████
145.3 |███████   █████     █      ███████████   ███████████████████████████████████████
129.5 |████████  █████     █     ████████████ █████████████████████████████████████████
113.7 |███████████████ █ █ ████ ███████████████████████████████████████████████████████
 97.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  207
   2 ms | ████████████████  1734
   3 ms | ████████████████████████████████████████  4395
   4 ms | █████████████████████████████  3174
   5 ms | ███████████████  1618
   6 ms | █████████  988
   7 ms | ████████  843
   8 ms | ██████  659
   9 ms | ████  439
  10 ms | ██  225
  11 ms | █  154
  12 ms | █  87
  13 ms | █  70
  14 ms | █  67
  15 ms | ███  295
  16 ms | ███  309
  17 ms | ███  372
  18 ms | ████  473
  19 ms | ████  427
  20 ms | ████  481
  21 ms | ███  364
  22 ms | ███  281
  23 ms | ██  236
  24 ms | ██  175
  25 ms | ██  175
  26 ms | █  161
  27 ms | █  108
  28 ms | █  93
  29 ms | █  64
  30 ms |   48
  31 ms |   36
  32 ms |   31
  33 ms |   26
  34 ms |   34
  35 ms |   28
  36 ms |   27
  37 ms |   27
  38 ms |   19
  39 ms |   33
  40 ms |   14
  41 ms |   21
  42 ms |   28
  43 ms |   18
  44 ms |   25
  45 ms |   9
  46 ms |   18
  47 ms |   14
  48 ms |   14
  49 ms |   23
  50 ms |   10
  51 ms |   10
  52 ms |   2
  53 ms |   11
  54 ms |   4
  55 ms |   2
  56 ms |   5
  57 ms |   4
  58 ms |   1
  59 ms |   2
  61 ms |   1
  62 ms |   3
  63 ms |   1
  65 ms |   1
  66 ms |   1
  70 ms |   1
  71 ms |   1
  72 ms |   1
  74 ms |   2
  75 ms |   2
  78 ms |   1
  83 ms |   1
  85 ms |   1
  90 ms |   1
 136 ms |   1
 216 ms |   1
1569 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
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
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `6.14`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `194.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `106.26`
- `fps_1pct_low` = `16.65`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `87.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195157 ms  |  Sample ticks: 3600

**FPS**  avg `216.98`, min `21.96`, p50 `222.39`, p95 `446.20`, p99 `571.48`, 1%low `27.68`, 0.1%low `25.60`, std `124.47`

**Frame time (ms)**  avg `7.88`, p50 `4.50`, p95 `21.31`, p99 `32.94`, p99.9 `37.97`, max `45.54`

**Client tick (ms)**  avg `0.67`, p95 `0.88`, max `1.28`

**Memory**  start `3902 MB`, end `7273 MB`, peak `7398 MB`, GC `21 events / 186 ms`

**FPS over sampling window (ASCII):**

```
287.4 |                                        █                                       
274.6 |                                       ██           █████ █   █ █   █ ██        
261.9 |█                                     ███     ██   ███████████████  ████        
249.1 |█                                     ███    ███   ████████████████ █████       
236.4 |█                                   █████   ████   ████████████████ ██████      
223.6 |█           █                   █████████   ████   █████████████████████████████
210.9 |█   ██      █                ████████████   █████  █████████████████████████████
198.1 |█   ██      ██               █████████████  █████ ██████████████████████████████
185.3 |█   ██     ███    █    █     █████████████  █████ ██████████████████████████████
172.6 |█   ███    ███   ██    ██ █  █████████████ █████████████████████████████████████
159.8 |██ ████████████ █████ ██████████████████████████████████████████████████████████
147.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █████  664
   2 ms | ██████████████████  2466
   3 ms | ████████████████████████████████████████  5461
   4 ms | ███████████████████████████████████  4769
   5 ms | █████████████████  2339
   6 ms | ████████  1063
   7 ms | ████  510
   8 ms | █  188
   9 ms |   65
  10 ms |   15
  11 ms |   3
  12 ms |   2
  14 ms |   29
  15 ms | ██  316
  16 ms | ██  336
  17 ms | █████  717
  18 ms | ██████  812
  19 ms | ███████  899
  20 ms | ██████  826
  21 ms | ████  577
  22 ms | ██  288
  23 ms | █  142
  24 ms | █  75
  25 ms |   16
  26 ms |   4
  27 ms |   1
  28 ms |   1
  29 ms |   3
  30 ms |   1
  31 ms |   2
  32 ms |   10
  33 ms |   19
  34 ms |   33
  35 ms |   58
  36 ms |   57
  37 ms |   41
  38 ms |   12
  39 ms |   5
  40 ms |   1
  41 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
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
- `entity_count_sample_start` = `73.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `25.60`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `194.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `126.82`
- `fps_1pct_low` = `27.68`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194152 ms  |  Sample ticks: 3600

**FPS**  avg `115.45`, min `19.79`, p50 `107.18`, p95 `282.60`, p99 `370.50`, 1%low `21.65`, 0.1%low `20.62`, std `82.59`

**Frame time (ms)**  avg `14.97`, p50 `9.33`, p95 `41.61`, p99 `45.09`, p99.9 `47.89`, max `50.54`

**Client tick (ms)**  avg `0.71`, p95 `0.93`, max `1.49`

**Memory**  start `4748 MB`, end `3832 MB`, peak `7398 MB`, GC `21 events / 188 ms`

**FPS over sampling window (ASCII):**

```
146.4 |                                                            █   █    █          
141.3 |                                                            █ ████   █          
136.3 |                                                       ███  ██████  ███         
131.2 |                                                       ███████████ ████         
126.1 |                                                 █   █ █████████████████        
121.0 |    █                            ████          █ █  ██ █████████████████████  █ 
115.9 |█   █                            █████ █ ██   ████  ████████████████████████████
110.9 |█  █████                 ██     ███████████   █████ ████████████████████████████
105.8 |█████████    ██   ██   ████     ███████████   ██████████████████████████████████
100.7 |█████████████████ ████ ████     ███████████  ███████████████████████████████████
 95.6 |████████████████████████████████████████████ ███████████████████████████████████
 90.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███████  220
   3 ms | ██████████████████████████  865
   4 ms | ███████████████████████  778
   5 ms | ████████████████  536
   6 ms | ███████████████████████  783
   7 ms | ██████████████████████████████████  1121
   8 ms | ████████████████████████████████████████  1333
   9 ms | ███████████████████████████████  1034
  10 ms | ███████████████████  630
  11 ms | █████  182
  12 ms | █  30
  13 ms |   3
  14 ms |   1
  15 ms |   1
  16 ms |   2
  17 ms |   10
  18 ms | ██  82
  19 ms | ████████  264
  20 ms | ████████████  389
  21 ms | ██████████████  457
  22 ms | ██████████  321
  23 ms | ██████  205
  24 ms | ██████  209
  25 ms | ███████  229
  26 ms | ████████  263
  27 ms | ██████████  332
  28 ms | ███████████  358
  29 ms | ████████  281
  30 ms | █████  160
  31 ms | ██  69
  32 ms | █  27
  33 ms |   9
  34 ms |   3
  35 ms | █  24
  36 ms | █  27
  37 ms | █  30
  38 ms | █  27
  39 ms | █  33
  40 ms | █  42
  41 ms | ███  91
  42 ms | ████  138
  43 ms | █████  167
  44 ms | ████  124
  45 ms | ███  86
  46 ms | █  20
  47 ms | █  18
  48 ms |   8
  50 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `20.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `20.62`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `194.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `66.79`
- `fps_1pct_low` = `21.65`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195043 ms  |  Sample ticks: 3600

**FPS**  avg `98.59`, min `17.09`, p50 `77.26`, p95 `282.05`, p99 `378.63`, 1%low `18.48`, 0.1%low `17.58`, std `85.32`

**Frame time (ms)**  avg `19.28`, p50 `12.94`, p95 `48.57`, p99 `52.52`, p99.9 `56.19`, max `58.53`

**Client tick (ms)**  avg `0.73`, p95 `0.94`, max `1.42`

**Memory**  start `6952 MB`, end `5104 MB`, peak `7412 MB`, GC `20 events / 167 ms`

**FPS over sampling window (ASCII):**

```
150.2 |                                                                  █             
143.5 |                                                              ███ █             
136.8 |                                                           ████████             
130.1 |                                                           ████████             
123.4 |                                                        █ █████████ █           
116.8 |                                                    █   █████████████ ██        
110.1 |█                                                   █ ███████████████████       
103.4 |█     █                                             ██████████████████████ █   █
 96.7 |█   ████                                █ █     █  █████████████████████████ ███
 90.0 |███████████ ███     █           ███ █  ████  █████ █████████████████████████████
 83.3 |█████████████████ ██████████    ████████████████████████████████████████████████
 76.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ████████████████  226
   3 ms | █████████████████████████████████████  522
   4 ms | ██████████████████████████████████████  534
   5 ms | █████████████████████████████  411
   6 ms | ███████████████████████████  382
   7 ms | █████████████████████████  350
   8 ms | ███████████████████  274
   9 ms | █████████████████████████████  408
  10 ms | ███████████████████████████████████████  552
  11 ms | ████████████████████████████████████████  565
  12 ms | █████████████████████████████████  470
  13 ms | ████████████████████  289
  14 ms | ███████████  151
  15 ms | ███  46
  16 ms |   7
  17 ms |   2
  18 ms |   7
  19 ms | █  16
  20 ms | █████  77
  21 ms | █████████████  177
  22 ms | █████████████████  247
  23 ms | ███████████████████████  324
  24 ms | ████████████████████████  343
  25 ms | ██████████████████  251
  26 ms | █████████████  190
  27 ms | ██████████  141
  28 ms | ███████  104
  29 ms | █████████  131
  30 ms | ██████████  145
  31 ms | ███████████  149
  32 ms | █████████████  183
  33 ms | ████████████  166
  34 ms | ██████████  142
  35 ms | ██████  87
  36 ms | ███████  97
  37 ms | █████  66
  38 ms | ███  36
  39 ms | ███  38
  40 ms | ███  43
  41 ms | ██  25
  42 ms | ██  27
  43 ms | ███  47
  44 ms | █████  71
  45 ms | ██████  87
  46 ms | ██████  79
  47 ms | ████████  108
  48 ms | █████████  132
  49 ms | ███████  99
  50 ms | ███████  105
  51 ms | ██████  83
  52 ms | ████  53
  53 ms | ██  33
  54 ms | █  17
  55 ms | █  8
  56 ms | █  11
  57 ms |   1
  58 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `17.58`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `194.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `51.86`
- `fps_1pct_low` = `18.48`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`

