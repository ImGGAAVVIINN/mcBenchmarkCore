# MC Benchmark Core session — 2026-10-02T11:47:38.707373406+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1320.1 | 41.7 | 23.5 | 19.70 | 1.20 | 74 | 2043 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 948.5 | 41.7 | 26.9 | 20.23 | 1.10 | 47 | 3144 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 747.5 | 42.2 | 28.3 | 20.52 | 1.13 | 67 | 1626 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 486.5 | 35.4 | 20.9 | 22.90 | 1.19 | 57 | 1928 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 902.4 | 42.4 | 28.4 | 20.26 | 1.12 | 86 | 320 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 909.1 | 42.2 | 27.5 | 19.91 | 0.79 | 54 | 1541 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 792.8 | 42.4 | 28.8 | 19.87 | 1.13 | 60 | 1802 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 316.2 | 32.3 | 19.2 | 25.04 | 1.89 | 76 | 1018 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 1101.1 | 33.8 | 22.8 | 22.84 | 4.61 | 50 | 1515 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 198.1 | 27.1 | 22.7 | 30.01 | 4.91 | 26 | 1058 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 507.0 | 36.5 | 23.1 | 23.18 | 1.47 | 82 | 810 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 459.8 | 37.0 | 26.2 | 23.41 | 1.03 | 63 | 1554 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 748.8 | 32.2 | 20.2 | 23.67 | 4.68 | 36 | 1334 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 842.7 | 33.3 | 20.0 | 23.68 | 3.98 | 36 | 1920 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1261.2 | 13.4 | 8.7 | 55.84 | 19.46 | 25 | 247 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1206.0 | 10.5 | 8.3 | 72.66 | 20.30 | 25 | 780 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1348.5 | 30.7 | 11.0 | 21.65 | 3.13 | 40 | 1946 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1557.8 | 39.0 | 23.5 | 20.84 | 2.78 | 45 | 2139 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 734.9 | 42.3 | 28.0 | 19.97 | 1.01 | 44 | 1883 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1919.9 | 46.1 | 30.3 | 18.71 | 0.47 | 42 | 2462 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1918.0 | 47.6 | 34.0 | 18.40 | 0.44 | 41 | 1895 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1713.6 | 42.3 | 27.0 | 19.93 | 0.50 | 37 | 1190 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1693.6 | 47.9 | 31.6 | 18.10 | 0.45 | 44 | 1590 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 775.3 | 46.6 | 30.3 | 18.36 | 0.44 | 23 | 435 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 686.4 | 47.0 | 33.0 | 18.47 | 0.37 | 19 | 2157 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 769.5 | 27.7 | 6.0 | 18.96 | 0.36 | 18 | 1694 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 755.6 | 47.7 | 34.5 | 18.33 | 0.40 | 18 | 1816 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 766.6 | 47.0 | 29.4 | 18.27 | 0.41 | 15 | 718 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 753.5 | 47.3 | 31.2 | 18.23 | 0.43 | 15 | 1606 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 775.7 | 48.3 | 34.1 | 17.63 | 0.39 | 15 | 501 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 705.4 | 44.7 | 28.9 | 18.91 | 0.40 | 14 | 796 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 747.4 | 47.9 | 32.3 | 17.99 | 0.50 | 12 | 1576 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 799.0 | 49.1 | 34.8 | 18.01 | 0.33 | 14 | 3179 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 747.9 | 48.3 | 31.2 | 17.88 | 0.33 | 11 | 1926 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 811.7 | 48.8 | 31.6 | 17.63 | 0.34 | 14 | 1207 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1922.3 | 47.5 | 33.7 | 18.73 | 0.45 | 26 | 741 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 143.8 | 22.2 | 17.7 | 38.54 | 6.38 | 26 | 406 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1695.2 | 46.6 | 31.8 | 18.99 | 0.44 | 25 | 3203 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1752.7 | 48.4 | 31.7 | 18.29 | 0.44 | 26 | 1662 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1536.9 | 46.0 | 28.9 | 18.75 | 0.49 | 26 | 410 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1316.8 | 46.2 | 24.6 | 18.47 | 0.45 | 27 | 2155 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 208.0 | 21.7 | 8.1 | 30.71 | 1.05 | 156 | 3563 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 234.3 | 40.7 | 36.8 | 23.50 | 0.69 | 25 | 2519 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 132.1 | 24.1 | 20.4 | 33.57 | 0.72 | 22 | 1255 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 110.6 | 11.0 | 3.3 | 55.05 | 0.86 | 20 | 108 |

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

Category: **Particles**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `1320.07`, min `18.34`, p50 `1402.25`, p95 `2092.16`, p99 `2341.90`, 1%low `41.75`, 0.1%low `23.48`, std `524.21`

**Frame time (ms)**  avg `1.60`, p50 `0.71`, p95 `4.15`, p99 `19.70`, p99.9 `32.12`, max `54.52`

**Client tick (ms)**  avg `1.20`, p95 `3.33`, max `12.90`

**Memory**  start `729 MB`, end `1508 MB`, peak `2772 MB`, GC `74 events / 620 ms`

**FPS over sampling window (ASCII):**

```
1914.9 |                                                                ██ ██  █        
1799.8 |                                                           █    ██ ███ █        
1684.7 |                                                          █████ ████████        
1569.5 |                                                      █   ██████████████        
1454.4 |                     █                      █       ████  ████████████████ █    
1339.3 |              █    ███   █ ██    ███ ██ ██████ ███  ████ ███████████████████    
1224.2 |    █         █  █ █████ █████   ██████████████████ ████████████████████████████
1109.0 |    ██     █████ ██████████████ ████████████████████████████████████████████████
993.9 |  █ ███  ███████████████████████████████████████████████████████████████████████
878.8 | ███████████████████████████████████████████████████████████████████████████████
763.7 | ███████████████████████████████████████████████████████████████████████████████
648.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9828
   1 ms | ██████  1366
   2 ms | ██  406
   3 ms | █  220
   4 ms |   104
   5 ms |   37
   6 ms |   17
   7 ms |   12
   8 ms |   4
   9 ms |   7
  10 ms |   6
  11 ms |   1
  12 ms |   4
  13 ms |   3
  14 ms |   11
  15 ms |   35
  16 ms |   58
  17 ms |   111
  18 ms |   79
  19 ms |   44
  20 ms |   37
  21 ms |   31
  22 ms |   8
  23 ms |   5
  24 ms |   4
  25 ms |   2
  26 ms |   6
  27 ms |   3
  30 ms |   1
  31 ms |   1
  33 ms |   2
  36 ms |   2
  41 ms |   2
  42 ms |   2
  43 ms |   1
  44 ms |   1
  45 ms |   1
  47 ms |   1
  54 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dragon_breath` | 160 | 1558 | 956.1 | 21.60 |
| `dripping_water` | 240 | 1558 | 1155.8 | 19.09 |
| `flame` | 160 | 1558 | 1252.6 | 19.41 |
| `smoke` | 160 | 1558 | 1250.8 | 19.41 |
| `sculk_charge_pop` | 240 | 1558 | 1333.1 | 19.46 |
| `ALL_TOGETHER` | 1680 | 1558 | 1437.7 | 18.96 |
| `portal` | 160 | 1558 | 1768.0 | 18.55 |
| `end_rod` | 240 | 1558 | 1406.5 | 19.19 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `41.75`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `23.48`
- `fps_harmonic_avg` = `623.19`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `114.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `948.55`, min `20.75`, p50 `1057.86`, p95 `1266.13`, p99 `1506.21`, 1%low `41.73`, 0.1%low `26.93`, std `332.25`

**Frame time (ms)**  avg `2.00`, p50 `0.95`, p95 `5.56`, p99 `20.23`, p99.9 `28.84`, max `48.19`

**Client tick (ms)**  avg `1.10`, p95 `1.97`, max `4.46`

**Memory**  start `730 MB`, end `2473 MB`, peak `3875 MB`, GC `47 events / 552 ms`

**FPS over sampling window (ASCII):**

```
1136.3 |          █                                                         █           
1098.0 |          █                                                         █         █ 
1059.8 |      █   █    █                      █                    ██    █ ██ █    █  ██
1021.5 |      █   █  █ █ █ █                  █      █ ████ █    █ ██    ████ ██   ██ ██
983.2 |      █   ██ █ █ █ █ █     █       █  █      █ ██████  ██████ █  ███████ ███████
944.9 |      █  ███ █ █ █ █ █   █ █       ██ ███   ██ ██████ █████████  ███████ ███████
906.6 |     ██ ██████ ████████  ███       ███████  ███████████████████ ████████ ███████
868.4 | █  ███ ████████████████ ███ █   █ ███████  ███████████████████ ████████ ███████
830.1 | ██████ ████████████████ ██████  ███████████████████████████████████████████████
791.8 | ██████ ████████████████ ██████  ███████████████████████████████████████████████
753.5 |████████████████████████ ███████ ███████████████████████████████████████████████
715.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5872
   1 ms | ███████████████████  2809
   2 ms | ███  464
   3 ms | █  189
   4 ms | █  110
   5 ms |   63
   6 ms |   20
   7 ms |   12
   8 ms |   2
   9 ms |   4
  10 ms |   1
  11 ms |   3
  12 ms |   2
  13 ms |   1
  14 ms |   9
  15 ms |   36
  16 ms |   60
  17 ms | █  100
  18 ms | █  76
  19 ms |   55
  20 ms |   33
  21 ms |   24
  22 ms |   14
  23 ms |   9
  24 ms |   8
  25 ms |   7
  26 ms |   2
  27 ms |   2
  28 ms |   1
  29 ms |   2
  30 ms |   1
  31 ms |   1
  32 ms |   1
  39 ms |   1
  40 ms |   1
  43 ms |   1
  46 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `26.93`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `41.73`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `57.00`
- `fps_harmonic_avg` = `499.61`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `747.54`, min `20.13`, p50 `824.57`, p95 `1005.97`, p99 `1240.78`, 1%low `42.24`, 0.1%low `28.34`, std `262.04`

**Frame time (ms)**  avg `2.44`, p50 `1.21`, p95 `16.18`, p99 `20.52`, p99.9 `28.64`, max `49.69`

**Client tick (ms)**  avg `1.13`, p95 `1.97`, max `14.82`

**Memory**  start `1389 MB`, end `1192 MB`, peak `3015 MB`, GC `67 events / 637 ms`

**FPS over sampling window (ASCII):**

```
881.6 |                      █                                                         
849.7 |  █      █   █   █    █        █                              █        █      █ 
817.8 |  █      █   █   ██   █     █  █           █       █          █ █     ███     █ 
785.9 |███      █ █ █   ██   █ █   █  ██          ██    █ ███    █   █ ██ █ █████ █ ███
754.0 |███  ██  ███ █   ██   █ █   █ ████    █  █ ███ █ █ ████   █ █ ████ █ █████ █ ███
722.1 |███  ███ ███ ██  ███  █ █  ██ ██████  █  █████ ███ ████  ██ ████████████████████
690.1 |████ ███ ███ ██  ███ ███████████████  █  █████████ ████  ██ ████████████████████
658.2 |████████████████ ████████████████████ ██ ██████████████ ███ ████████████████████
626.3 |█████████████████████████████████████ ██████████████████████████████████████████
594.4 |█████████████████████████████████████ ██████████████████████████████████████████
562.5 |█████████████████████████████████████ ██████████████████████████████████████████
530.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  450
   1 ms | ████████████████████████████████████████  6428
   2 ms | ███  493
   3 ms | █  205
   4 ms |   77
   5 ms |   41
   6 ms |   8
   7 ms |   7
   8 ms |   5
   9 ms |   6
  10 ms |   4
  11 ms |   1
  12 ms |   4
  13 ms |   6
  14 ms |   12
  15 ms |   36
  16 ms |   68
  17 ms | █  91
  18 ms | █  99
  19 ms |   61
  20 ms |   35
  21 ms |   27
  22 ms |   13
  23 ms |   2
  24 ms |   6
  25 ms |   2
  26 ms |   4
  28 ms |   3
  29 ms |   1
  30 ms |   1
  31 ms |   1
  32 ms |   1
  34 ms |   1
  36 ms |   2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `28.34`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `42.24`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `87.00`
- `fps_harmonic_avg` = `410.28`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `486.52`, min `14.28`, p50 `527.81`, p95 `727.04`, p99 `958.25`, 1%low `35.45`, 0.1%low `20.86`, std `204.30`

**Frame time (ms)**  avg `3.70`, p50 `1.89`, p95 `18.22`, p99 `22.90`, p99.9 `34.21`, max `70.05`

**Client tick (ms)**  avg `1.19`, p95 `2.25`, max `5.02`

**Memory**  start `1058 MB`, end `1528 MB`, peak `2987 MB`, GC `57 events / 628 ms`

**FPS over sampling window (ASCII):**

```
808.0 |      █                                                                         
768.0 |      █                                                                         
728.0 |      █                                                                         
688.1 |  █   █                                                                         
648.1 |  █   █                                                                         
608.2 |█ █   █                                                                         
568.2 |█ █   █      █    █   █ █                        █    █      █   ██  █          
528.3 |█ █   ██  █  █   ██  ██ █ █       █       █      ██   █  █   █   ██  █  █ █ ██  
488.3 |████ ███  █ ███  ██  ████ █      ███      █ █    ██ █ █ ███████  ██  ██ █ █████ 
448.4 |█████████ █████ ███ █████ █  █   ███ ██████ ██   ████ ██████████ ██████ ███████ 
408.4 |███████████████ ███████████████ ███████████████ ████████████████████████████████
368.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  49
   1 ms | ████████████████████████████████████████  3075
   2 ms | ███████████████  1136
   3 ms | ████  345
   4 ms | ██  141
   5 ms | █  100
   6 ms | █  45
   7 ms |   18
   8 ms |   11
   9 ms |   4
  10 ms |   2
  11 ms |   3
  12 ms |   1
  13 ms |   1
  14 ms |   8
  15 ms |   15
  16 ms | █  44
  17 ms | ██  117
  18 ms | █  86
  19 ms | █  61
  20 ms | █  42
  21 ms |   25
  22 ms |   19
  23 ms |   11
  24 ms |   9
  25 ms |   9
  26 ms |   5
  27 ms |   4
  28 ms |   1
  29 ms |   3
  30 ms |   3
  32 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   1
  37 ms |   1
  46 ms |   1
  50 ms |   1
  70 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `20.86`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `35.45`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `2.00`
- `fps_harmonic_avg` = `270.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `902.40`, min `22.35`, p50 `996.53`, p95 `1235.07`, p99 `1546.22`, 1%low `42.44`, 0.1%low `28.45`, std `319.14`

**Frame time (ms)**  avg `2.11`, p50 `1.00`, p95 `12.58`, p99 `20.26`, p99.9 `27.10`, max `44.75`

**Client tick (ms)**  avg `1.12`, p95 `2.08`, max `17.94`

**Memory**  start `2014 MB`, end `1898 MB`, peak `2334 MB`, GC `86 events / 653 ms`

**FPS over sampling window (ASCII):**

```
1073.6 |             █                                                                  
1038.4 |   █       █ ██  █       █     █                                                
1003.1 |  ██   █   ████  █      ██   █ █  █           █                             █   
967.9 |  ██   ██  ████  ██   ████   ███ ██        █  █     █                █      █   
932.6 | ███   ██  ████  ██  █████   ███ ██  █   █ █ ███  █ ██    █       ██ █    █ █   
897.3 | ████████ █████ ███ ██████  ████ ██ ██   █ █ ███  ██████ ██      ███ █ █ █████  
862.1 | ██████████████ ███ ████████████ ██ ██  ██ █ ███ ███████ ██     ████ ███ █████  
826.8 | ██████████████ ███ ██████████████████ █████ █████████████████  ████ ███ █████  
791.6 |███████████████ ███ ████████████████████████████████████████████████ ███ █████ █
756.3 |████████████████████████████████████████████████████████████████████ ███ ███████
721.1 |████████████████████████████████████████████████████████████████████ ███████████
685.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4685
   1 ms | ██████████████████████████████  3545
   2 ms | ████  431
   3 ms | ██  179
   4 ms | █  78
   5 ms |   43
   6 ms |   22
   7 ms |   6
   8 ms |   2
   9 ms |   3
  10 ms |   3
  11 ms |   3
  12 ms |   5
  13 ms |   5
  14 ms |   5
  15 ms |   38
  16 ms | █  59
  17 ms | █  109
  18 ms | █  95
  19 ms |   54
  20 ms |   31
  21 ms |   25
  22 ms |   18
  23 ms |   9
  24 ms |   6
  25 ms |   3
  26 ms |   4
  27 ms |   1
  28 ms |   1
  29 ms |   2
  30 ms |   1
  31 ms |   1
  34 ms |   1
  43 ms |   2
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `28.45`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `42.44`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `6.00`
- `fps_harmonic_avg` = `473.52`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `909.14`, min `21.41`, p50 `1002.40`, p95 `1201.01`, p99 `1490.68`, 1%low `42.20`, 0.1%low `27.46`, std `302.54`

**Frame time (ms)**  avg `2.03`, p50 `1.00`, p95 `5.76`, p99 `19.91`, p99.9 `30.27`, max `46.71`

**Client tick (ms)**  avg `0.79`, p95 `1.35`, max `4.13`

**Memory**  start `1759 MB`, end `2331 MB`, peak `3301 MB`, GC `54 events / 610 ms`

**FPS over sampling window (ASCII):**

```
1046.7 |    █      █                                                                    
1017.5 |    ██     █   █                         █    █                                 
988.2 |    ██     ██  █    █ █    █             █    █ █              █           █    
959.0 | █  ███    ███ █ █  █ █    █      █      █    █ █   █          █ █  █   █ ██   █
929.8 | █  ███    ███ █ █  █████  █      █ █    █    ███  ████     █  █ █ ██   ████  ██
900.6 |██  ████   ███ █ █  ██████████ █  █ █  ████  █████ ██████   ██ ██████ ██████  ██
871.4 |██ █████ █████████  ██████████ █  ████ █████ █████ ███████  █████████ ██████ ███
842.2 |██ ███████████████  ██████████ █  ████████████████ ███████ █████████████████████
813.0 |██████████████████  ██████████ █  ██████████████████████████████████████████████
783.7 |███████████████████ ████████████ ███████████████████████████████████████████████
754.5 |███████████████████ ████████████ ███████████████████████████████████████████████
725.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4968
   1 ms | ██████████████████████████████  3700
   2 ms | ███  407
   3 ms | █  176
   4 ms | █  69
   5 ms |   44
   6 ms |   11
   7 ms |   2
   8 ms |   3
   9 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   2
  14 ms |   6
  15 ms |   38
  16 ms |   58
  17 ms | █  110
  18 ms | █  92
  19 ms |   61
  20 ms |   31
  21 ms |   24
  22 ms |   8
  23 ms |   5
  24 ms |   4
  25 ms |   8
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   1
  30 ms |   3
  31 ms |   1
  32 ms |   2
  33 ms |   1
  35 ms |   1
  43 ms |   1
  46 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `27.46`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `42.20`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `49.00`
- `fps_harmonic_avg` = `492.34`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `792.78`, min `22.54`, p50 `879.48`, p95 `1056.15`, p99 `1298.63`, 1%low `42.43`, 0.1%low `28.80`, std `270.71`

**Frame time (ms)**  avg `2.29`, p50 `1.14`, p95 `15.67`, p99 `19.87`, p99.9 `28.35`, max `44.36`

**Client tick (ms)**  avg `1.13`, p95 `1.76`, max `22.12`

**Memory**  start `1244 MB`, end `1765 MB`, peak `3046 MB`, GC `60 events / 620 ms`

**FPS over sampling window (ASCII):**

```
936.0 |              █                                                                 
912.2 |              █                                                                 
888.3 |              █                                                                 
864.5 |    █         █                   █   █                                     █   
840.7 |    █ █   █   ██       ██ █   █  ██  ██    █        ██           █    █ ██  █   
816.9 |██  █ █  ███  ██  █   ███ ██  █  ██ ████   ██  █    ██   ███     █ ██ █ ██  █ █ 
793.0 |██  █ █  ███ ███  ██  ███████ ██ ██ ████   █████    ██  ████ █ ███ ██ ████  ███ 
769.2 |███ ███  ███████ ████ ███████ ███████████  █████  █ ██  ██████ ████████████ ███ 
745.4 |███████ ████████ ████████████ ███████████ ██████ ██████ ██████ ████████████ ████
721.6 |███████ ████████ ████████████ ███████████ ██████ █████████████ ████████████ ████
697.7 |███████ ████████████████████████████████████████ █████████████ █████████████████
673.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████  1020
   1 ms | ████████████████████████████████████████  6425
   2 ms | ███  452
   3 ms | █  216
   4 ms |   80
   5 ms |   32
   6 ms |   15
   7 ms |   11
   8 ms |   1
  11 ms |   1
  12 ms |   2
  13 ms |   2
  14 ms |   13
  15 ms |   39
  16 ms | █  89
  17 ms | █  123
  18 ms | █  84
  19 ms |   42
  20 ms |   25
  21 ms |   14
  22 ms |   12
  23 ms |   8
  24 ms |   7
  25 ms |   2
  26 ms |   4
  27 ms |   2
  28 ms |   1
  29 ms |   2
  30 ms |   1
  31 ms |   1
  33 ms |   2
  34 ms |   1
  44 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `28.80`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `42.43`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `56.00`
- `fps_harmonic_avg` = `436.56`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `316.18`, min `14.72`, p50 `361.00`, p95 `454.89`, p99 `512.98`, 1%low `32.34`, 0.1%low `19.16`, std `125.74`

**Frame time (ms)**  avg `5.15`, p50 `2.77`, p95 `20.18`, p99 `25.04`, p99.9 `41.17`, max `67.94`

**Client tick (ms)**  avg `1.89`, p95 `3.32`, max `21.47`

**Memory**  start `1373 MB`, end `1634 MB`, peak `2391 MB`, GC `76 events / 654 ms`

**FPS over sampling window (ASCII):**

```
430.1 |                █                                                               
412.5 |                █                                                               
394.9 |                █                                                               
377.2 |                █    █                                              █           
359.6 |                █    █      █      █                     █          █           
342.0 |█ ██ ███  █     █    █    █ ██  ██ █    █ █         ██  ██ █        █ █         
324.4 |█ ███████ █ ██ ███   ██   ████  ██ █    █ ██ █ █    ███ ██ █ ██     █ █  █  █   
306.8 |█████████ █ ███████ ███  █████  ██ ██  ██ ██ █ ██ █ ████████ ██ ██ ████  ████ █ 
289.2 |███████████ ███████ ████ ████████████ ███ ██████████████████ █████ ██████████ ██
271.6 |███████████████████ ████ ████████████ ███ ████████████████████████ █████████████
254.0 |███████████████████ ████ ███████████████████████████████████████████████████████
236.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  46
   2 ms | ████████████████████████████████████████  2363
   3 ms | ████████  494
   4 ms | ████  259
   5 ms | ██  137
   6 ms | █  63
   7 ms |   29
   8 ms |   15
   9 ms |   17
  10 ms |   6
  11 ms |   6
  12 ms |   2
  13 ms |   2
  14 ms |   5
  15 ms |   7
  16 ms | █  32
  17 ms | █  38
  18 ms | █  80
  19 ms | █  82
  20 ms | █  57
  21 ms | █  41
  22 ms | █  33
  23 ms |   16
  24 ms |   14
  25 ms |   9
  26 ms |   9
  27 ms |   4
  28 ms |   2
  29 ms |   5
  30 ms |   2
  32 ms |   3
  39 ms |   1
  40 ms |   1
  43 ms |   1
  46 ms |   1
  50 ms |   1
  67 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `19.16`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `32.34`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `32.00`
- `fps_harmonic_avg` = `194.31`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `1101.11`, min `20.64`, p50 `1245.78`, p95 `1509.34`, p99 `1901.93`, 1%low `33.80`, 0.1%low `22.79`, std `418.40`

**Frame time (ms)**  avg `2.24`, p50 `0.80`, p95 `16.42`, p99 `22.84`, p99.9 `40.18`, max `48.44`

**Client tick (ms)**  avg `4.61`, p95 `6.77`, max `23.56`

**Memory**  start `1758 MB`, end `3232 MB`, peak `3273 MB`, GC `50 events / 603 ms`

**FPS over sampling window (ASCII):**

```
1329.0 |█                                                                               
1290.9 |█           █        █                                                  █       
1252.8 |█           █        █         █                                        █       
1214.7 |█   █       █  █     █  █      █   █ █                                █ █       
1176.6 |█   █      ██  █     █  █    ████  █ █        █        █    █  █      ███  █    
1138.6 |█   █      ██  ██  █ █  █ ████████ █ █      █ █        █    █  █   ██████  █ █ █
1100.5 |██  █ ███ ███ ███  █ █  █ ████████ ████    ██ ██       █ ██ █████  ██████  █ █ █
1062.4 |██ ██ ███ ███ ███ ██ █ ███████████ ████   ██████   █   █ ██ █████  ██████  ███ █
1024.3 |█████████ ████████████████████████ ████   ███████ ██ ███ ████████  ██████  █████
986.2 |██████████████████████████████████ █████████████████ ████████████ ██████████████
948.2 |████████████████████████████████████████████████████ ████████████ ██████████████
910.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6749
   1 ms | ██████  1064
   2 ms | █  200
   3 ms | █  100
   4 ms |   51
   5 ms | █  94
   6 ms | █  87
   7 ms |   21
   8 ms |   12
   9 ms |   5
  10 ms |   1
  11 ms |   4
  13 ms |   4
  14 ms |   26
  15 ms |   43
  16 ms | █  88
  17 ms | █  98
  18 ms |   68
  19 ms |   47
  20 ms |   36
  21 ms |   25
  22 ms |   26
  23 ms |   26
  24 ms |   11
  25 ms |   4
  26 ms |   3
  27 ms |   1
  28 ms |   5
  29 ms |   3
  30 ms |   3
  31 ms |   2
  32 ms |   3
  34 ms |   6
  35 ms |   3
  36 ms |   2
  37 ms |   2
  38 ms |   1
  39 ms |   2
  40 ms |   1
  41 ms |   2
  42 ms |   2
  43 ms |   2
  45 ms |   2
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `22.79`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `33.80`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `31.00`
- `fps_harmonic_avg` = `446.58`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `198.06`, min `22.57`, p50 `217.47`, p95 `345.69`, p99 `376.09`, 1%low `27.14`, 0.1%low `22.68`, std `99.93`

**Frame time (ms)**  avg `8.18`, p50 `4.60`, p95 `22.93`, p99 `30.01`, p99.9 `43.29`, max `44.32`

**Client tick (ms)**  avg `4.91`, p95 `7.31`, max `16.14`

**Memory**  start `1576 MB`, end `1506 MB`, peak `2635 MB`, GC `26 events / 199 ms`

**FPS over sampling window (ASCII):**

```
271.2 |  █                                                   █    █                    
258.7 |  █                                                   ██   █ █    █             
246.1 |  █ ██ █                                              ██ █ █ ██   █   █   █   ██
233.6 |█ ████ █                                             ███ █ █ ███  █   █   █   ██
221.0 |█ ████ █    █                                        ███████████ ██ █ █ ███   ██
208.5 |██████ █    █                                  █     ███████████ ██ ███████  ███
196.0 |████████ ████    █ █ █                         █ ███ ███████████████████████████
183.4 |████████ ████   ██ █ █   █                    ██████████████████████████████████
170.9 |█████████████   ████ ██  █ ██ █  █           ███████████████████████████████████
158.3 |█████████████ ██████ ████████ ██ ████    █ █ ███████████████████████████████████
145.8 |████████████████████████████████ ████ █  ███ ███████████████████████████████████
133.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██████████  176
   3 ms | ████████████████████████████████████████  730
   4 ms | ████████████████████████████  507
   5 ms | ████████████  212
   6 ms | ███  49
   7 ms | ██  44
   8 ms | ████  65
   9 ms | ██  38
  10 ms | ██  30
  11 ms | █  25
  12 ms | █  11
  13 ms | ████  75
  14 ms | ██  44
  15 ms | █  25
  16 ms | █  22
  17 ms | ██  37
  18 ms | ███  47
  19 ms | ██  42
  20 ms | ███  55
  21 ms | ███  52
  22 ms | ██  38
  23 ms | █  19
  24 ms | █  15
  25 ms | █  24
  26 ms | █  18
  27 ms | █  12
  28 ms |   5
  29 ms |   3
  30 ms |   2
  31 ms |   1
  32 ms |   3
  33 ms |   5
  34 ms |   1
  35 ms |   2
  36 ms |   2
  38 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
  42 ms |   1
  43 ms |   3
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `27.14`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `122.26`
- `preload_duration_ms` = `44.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `22.68`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `507.00`, min `21.93`, p50 `565.91`, p95 `785.06`, p99 `881.71`, 1%low `36.51`, 0.1%low `23.14`, std `224.83`

**Frame time (ms)**  avg `3.75`, p50 `1.77`, p95 `18.09`, p99 `23.18`, p99.9 `38.75`, max `45.60`

**Client tick (ms)**  avg `1.47`, p95 `2.52`, max `6.02`

**Memory**  start `1721 MB`, end `1946 MB`, peak `2531 MB`, GC `82 events / 672 ms`

**FPS over sampling window (ASCII):**

```
663.8 |                                                                      █      █  
633.8 |                                                 █                    █    █ █  
603.8 |                            █      █  █         ██     █         █    █  █ █ █  
573.8 |    █                       ████   █ ██  █      ██     █  █  █  ██  █ █  █ █ █  
543.8 |    █                     █ ████   █ ██  █ ██   ██  ██ █  █████ ██  ████ █ ███  
513.8 |█   █           █       █ █ ████   █ ██  █ ██   ███ ████  ████████ █████ █████ █
483.8 |██ ██    █ █  ████     ████ ████   ████ █████  █████████  ████████ █████ ███████
453.8 |██ ██    ███ ██████ █ █████ ███████████ ██████ █████████ ███████████████████████
423.8 |██ ███  ████ ██████ ███████ ███████████ ████████████████████████████████████████
393.7 |██ ███  ███████████████████ ████████████████████████████████████████████████████
363.7 |███████████████████████████ ████████████████████████████████████████████████████
333.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   15
   1 ms | ████████████████████████████████████████  3291
   2 ms | █████████  765
   3 ms | █████  380
   4 ms | ██  168
   5 ms | █  96
   6 ms | █  50
   7 ms |   31
   8 ms |   11
   9 ms |   10
  10 ms |   15
  11 ms |   8
  12 ms |   4
  13 ms |   4
  14 ms |   7
  15 ms |   34
  16 ms | █  65
  17 ms | █  96
  18 ms | █  91
  19 ms | █  44
  20 ms | █  49
  21 ms |   27
  22 ms |   16
  23 ms |   19
  24 ms |   14
  25 ms |   2
  26 ms |   6
  27 ms |   1
  28 ms |   2
  29 ms |   2
  30 ms |   1
  31 ms |   1
  36 ms |   1
  39 ms |   1
  41 ms |   2
  42 ms |   1
  45 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `23.14`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `266.62`
- `fps_1pct_low` = `36.51`
- `preload_duration_ms` = `68.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `459.77`, min `18.93`, p50 `502.53`, p95 `676.26`, p99 `903.85`, 1%low `36.95`, 0.1%low `26.24`, std `185.50`

**Frame time (ms)**  avg `3.78`, p50 `1.99`, p95 `18.38`, p99 `23.41`, p99.9 `31.78`, max `52.83`

**Client tick (ms)**  avg `1.03`, p95 `2.32`, max `18.68`

**Memory**  start `1244 MB`, end `2154 MB`, peak `2798 MB`, GC `63 events / 628 ms`

**FPS over sampling window (ASCII):**

```
641.2 |      █                                                                         
612.8 |      █                                                       ██                
584.5 |      █                       █                               ██            █   
556.1 |      █                       █                              ███            █   
527.7 |      █                       ███   █    █       █           ███   █        █   
499.4 |      █  █                    ███   █   ███   █ ███    ██  █ ███ ███      ███   
471.0 | ██   █  █  █       ██ █    █████  ████ ███   █ █████ ███  █ ███ ████ █ █ ████  
442.6 | ██   ████  ██ ██   ██ █  ███████  ████ ███   ███████████ ██ ███ ████████ █████ 
414.3 | ██  █████  ██ ████ ████ ████████  █████████████████████████ ████████████ ██████
385.9 | █████████  ██ ████ █████████████  █████████████████████████ ███████████████████
357.5 | ██████████ ████████████████████████████████████████████████████████████████████
329.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   27
   1 ms | ████████████████████████████████████████  2658
   2 ms | ███████████████████████  1513
   3 ms | █████  316
   4 ms | ██  139
   5 ms | █  93
   6 ms | █  40
   7 ms |   20
   8 ms |   10
   9 ms |   1
  10 ms |   6
  11 ms |   1
  12 ms |   3
  13 ms |   5
  14 ms |   7
  15 ms |   15
  16 ms | █  43
  17 ms | █  84
  18 ms | █  90
  19 ms | █  66
  20 ms | █  47
  21 ms |   22
  22 ms |   25
  23 ms |   16
  24 ms |   13
  25 ms |   8
  26 ms |   5
  27 ms |   3
  29 ms |   1
  30 ms |   4
  31 ms |   2
  32 ms |   2
  34 ms |   1
  35 ms |   2
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `36.95`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `264.46`
- `preload_duration_ms` = `3.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `26.24`
- `beds_placed` = `40.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `748.76`, min `16.37`, p50 `776.18`, p95 `1257.41`, p99 `1491.88`, 1%low `32.18`, 0.1%low `20.21`, std `371.58`

**Frame time (ms)**  avg `2.95`, p50 `1.29`, p95 `13.79`, p99 `23.67`, p99.9 `43.43`, max `61.10`

**Client tick (ms)**  avg `4.68`, p95 `10.25`, max `26.70`

**Memory**  start `1894 MB`, end `1897 MB`, peak `3229 MB`, GC `36 events / 342 ms`

**FPS over sampling window (ASCII):**

```
1320.5 |                                                                               █
1221.8 |                                                         █                    ██
1123.1 |                                                       █ █                   ███
1024.5 |                   █     █      █                     ████            ███ ██████
925.8 |                   ███  █████   ██                 ███████          ████████████
827.1 |                   ███████████████             ████████████     ██ █████████████
728.4 |                  █████████████████         ███████████████    ███ █████████████
629.7 |        █         █████████████████         █████████████████  █████████████████
531.0 |    █   █ ██ █ █████████████████████ █   ███████████████████████████████████████
432.3 |█   █  █████████████████████████████████████████████████████████████████████████
333.6 |█  █████████████████████████████████████████████████████████████████████████████
235.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████████████  2187
   1 ms | ████████████████████████████████████████  2817
   2 ms | ██████████  723
   3 ms | ███  243
   4 ms | █  63
   5 ms | █  44
   6 ms |   29
   7 ms |   31
   8 ms |   19
   9 ms |   16
  10 ms |   14
  11 ms |   8
  12 ms | ██  174
  13 ms | █  77
  14 ms |   31
  15 ms | █  42
  16 ms |   31
  17 ms |   35
  18 ms | █  38
  19 ms |   23
  20 ms |   23
  21 ms |   12
  22 ms |   23
  23 ms |   11
  24 ms |   8
  25 ms |   14
  26 ms |   5
  27 ms |   5
  28 ms |   7
  29 ms |   5
  34 ms |   2
  35 ms |   1
  36 ms |   2
  39 ms |   2
  40 ms |   2
  41 ms |   3
  43 ms |   1
  44 ms |   1
  45 ms |   1
  46 ms |   3
  55 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.32`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `32.18`
- `fps_harmonic_avg` = `338.98`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `159.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `20.21`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `842.75`, min `17.53`, p50 `821.64`, p95 `1492.09`, p99 `1699.84`, 1%low `33.29`, 0.1%low `19.98`, std `446.14`

**Frame time (ms)**  avg `2.77`, p50 `1.22`, p95 `13.96`, p99 `23.68`, p99.9 `42.82`, max `57.06`

**Client tick (ms)**  avg `3.98`, p95 `8.33`, max `30.28`

**Memory**  start `1567 MB`, end `1731 MB`, peak `3487 MB`, GC `36 events / 350 ms`

**FPS over sampling window (ASCII):**

```
1583.7 |                                                                               █
1465.8 |                                                                              ██
1347.9 |                          █                                                █████
1230.0 |                    ████████                                 ████  █      ██████
1112.1 |                   ██████████                                █████ ██ ███ ██████
994.3 |                  ████████████                      █ ██     ███████████████████
876.4 |                  █████████████                  ███████    ████████████████████
758.5 |                  ███████████████          ██   █████████   ████████████████████
640.6 |               ██████████████████   █  █   ████████████████ ████████████████████
522.7 |       ███ ██ ███████████████████ ███████  █████████████████████████████████████
404.8 |█   ████████████████████████████████████████████████████████████████████████████
286.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  2885
   1 ms | ███████████████████████████████████  2523
   2 ms | ███████████  799
   3 ms | ███  206
   4 ms | █  86
   5 ms | █  45
   6 ms | █  37
   7 ms |   26
   8 ms |   23
   9 ms |   16
  10 ms |   7
  11 ms |   3
  12 ms | █  94
  13 ms | ██  115
  14 ms | █  52
  15 ms |   28
  16 ms |   34
  17 ms |   29
  18 ms |   34
  19 ms | █  46
  20 ms |   27
  21 ms |   17
  22 ms |   9
  23 ms |   12
  24 ms |   12
  25 ms |   14
  26 ms |   8
  27 ms |   12
  28 ms |   6
  29 ms |   3
  30 ms |   1
  32 ms |   3
  34 ms |   1
  35 ms |   1
  37 ms |   1
  39 ms |   1
  41 ms |   1
  43 ms |   1
  45 ms |   1
  46 ms |   1
  48 ms |   1
  49 ms |   1
  50 ms |   1
  52 ms |   1
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.67`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `33.29`
- `fps_harmonic_avg` = `361.27`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `37.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.98`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23065 ms  |  Sample ticks: 400

**FPS**  avg `1261.22`, min `7.62`, p50 `1172.35`, p95 `2778.67`, p99 `3576.75`, 1%low `13.43`, 0.1%low `8.65`, std `1039.06`

**Frame time (ms)**  avg `6.45`, p50 `0.85`, p95 `33.57`, p99 `55.84`, p99.9 `93.92`, max `131.23`

**Client tick (ms)**  avg `19.46`, p95 `33.52`, max `51.40`

**Memory**  start `2581 MB`, end `1584 MB`, peak `2829 MB`, GC `25 events / 143 ms`

**FPS over sampling window (ASCII):**

```
3329.9 |                                                                              █ 
3033.0 |                                                                              █ 
2736.1 |                                                                              ██
2439.2 |                                                  █ ██           █ █ ███      ██
2142.3 |                                ███      ██       █ ███        █ ███ ███      ██
1845.4 |                           █    █████    ███ █    ███████      ██████████     ██
1548.5 |                    █     ██    █████    ███ █    █████████    ██████████    ███
1251.6 |  █           ██   ███    ██   ██████    █████    █████████    ██████████    ███
954.8 |███        █ ███   ████   ███  ███████  ███████   █████████   ████████████   ███
657.9 |████       █ ████  ████  ████  ███████  ███████   ██████████  █████████████  ███
361.0 |████     █ █ █████ █████ █████ ████████ ████████  ███████████ ██████████████ ███
 64.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1679
   1 ms | ███████  287
   2 ms | ███  133
   3 ms | ██  98
   4 ms | █████  197
   5 ms | █  44
   6 ms |   20
   7 ms |   11
   8 ms |   6
   9 ms |   14
  10 ms |   5
  11 ms |   3
  12 ms | █  42
  13 ms | █  56
  14 ms | █  32
  15 ms | █  38
  16 ms | █  44
  17 ms | █  34
  18 ms | █  26
  19 ms | █  25
  20 ms |   13
  21 ms |   8
  22 ms |   3
  23 ms |   4
  24 ms |   9
  25 ms |   15
  26 ms |   10
  27 ms |   12
  28 ms |   11
  29 ms |   7
  30 ms |   11
  31 ms |   13
  32 ms |   20
  33 ms |   19
  34 ms |   11
  35 ms |   5
  36 ms |   7
  37 ms |   3
  38 ms |   6
  39 ms |   7
  40 ms |   9
  41 ms |   8
  42 ms |   11
  43 ms |   4
  44 ms |   2
  45 ms |   8
  46 ms |   7
  47 ms |   2
  48 ms |   7
  49 ms |   3
  50 ms |   4
  51 ms |   1
  52 ms |   3
  53 ms |   6
  54 ms |   3
  55 ms |   2
  56 ms |   3
  57 ms |   1
  58 ms |   1
  62 ms |   2
  63 ms |   2
  64 ms |   2
  65 ms |   1
  66 ms |   1
  67 ms |   1
  69 ms |   2
  70 ms |   2
  72 ms |   1
  74 ms |   2
  78 ms |   1
  80 ms |   2
  84 ms |   1
  85 ms |   1
  88 ms |   1
  94 ms |   1
 102 ms |   1
 113 ms |   1
 131 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `13.43`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4802.99`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `8.65`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `154.96`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `23912.00`
- `preload_duration_ms` = `105.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1205.98`, min `7.60`, p50 `980.47`, p95 `2917.34`, p99 `3485.21`, 1%low `10.50`, 0.1%low `8.34`, std `1059.66`

**Frame time (ms)**  avg `7.94`, p50 `1.02`, p95 `39.60`, p99 `72.66`, p99.9 `111.50`, max `131.56`

**Client tick (ms)**  avg `20.30`, p95 `35.81`, max `54.95`

**Memory**  start `1900 MB`, end `2271 MB`, peak `2680 MB`, GC `25 events / 140 ms`

**FPS over sampling window (ASCII):**

```
3025.1 |                                                                            █   
2752.9 |                                                                            █ ██
2480.7 |                               █                            ███   ███       ████
2208.5 |                              ███        █       █ ██       █████████       ████
1936.3 |                              ███      ███       █ ██       ██████████      ████
1664.1 |                         █    █████    ████      ██████     ██████████      ████
1391.9 |                  ██    ██    ██████   █████     ██████     ███████████    █████
1119.7 |█ █          █   ███    ██    ██████   ██████   ███████     ███████████    █████
847.4 |████         █   ████   ███   ██████   ██████   ████████    ████████████   █████
575.2 |████         ██  ████   ███  ███████   ███████  █████████  █████████████   █████
303.0 |█████      █ ██  █████ █████ ████████  ████████ ██████████ ██████████████  █████
 30.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1256
   1 ms | █████████  267
   2 ms | ████  118
   3 ms | ██  68
   4 ms | █  39
   5 ms | ██  55
   6 ms | ███  97
   7 ms | █  35
   8 ms |   11
   9 ms |   3
  10 ms |   6
  11 ms |   9
  12 ms | █  36
  13 ms | █  40
  14 ms | █  16
  15 ms | █  29
  16 ms | ██  51
  17 ms | █  35
  18 ms |   13
  19 ms |   11
  20 ms |   15
  21 ms | █  18
  22 ms |   8
  23 ms |   9
  24 ms |   5
  25 ms |   5
  26 ms | █  21
  27 ms |   6
  28 ms |   14
  29 ms |   8
  30 ms |   10
  31 ms |   11
  32 ms |   15
  33 ms |   11
  34 ms |   9
  35 ms |   9
  36 ms |   7
  37 ms |   7
  38 ms |   6
  39 ms |   5
  40 ms |   2
  41 ms |   8
  42 ms |   9
  43 ms |   7
  44 ms |   6
  45 ms |   9
  46 ms |   3
  47 ms |   8
  48 ms |   7
  49 ms |   3
  50 ms |   8
  51 ms |   3
  52 ms |   2
  53 ms |   2
  56 ms |   3
  57 ms |   2
  59 ms |   2
  61 ms |   2
  62 ms |   1
  63 ms |   2
  64 ms |   2
  65 ms |   1
  66 ms |   1
  67 ms |   1
  68 ms |   1
  69 ms |   2
  70 ms |   3
  73 ms |   2
  76 ms |   1
  78 ms |   1
  82 ms |   1
  83 ms |   1
  85 ms |   3
  87 ms |   1
  90 ms |   1
  91 ms |   1
  93 ms |   2
  94 ms |   2
  95 ms |   1
  98 ms |   1
  99 ms |   1
 105 ms |   1
 106 ms |   1
 108 ms |   1
 111 ms |   1
 112 ms |   1
 116 ms |   1
 131 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `10.50`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4791.01`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `8.34`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `126.00`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `30063.00`
- `preload_duration_ms` = `7.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1348.50`, min `3.87`, p50 `1425.51`, p95 `2241.93`, p99 `2539.30`, 1%low `30.66`, 0.1%low `10.98`, std `682.81`

**Frame time (ms)**  avg `1.98`, p50 `0.70`, p95 `7.06`, p99 `21.65`, p99.9 `49.74`, max `258.58`

**Client tick (ms)**  avg `3.13`, p95 `5.95`, max `38.04`

**Memory**  start `2254 MB`, end `2747 MB`, peak `4200 MB`, GC `40 events / 590 ms`

**FPS over sampling window (ASCII):**

```
2107.3 |                                                                               █
1954.7 |█  █                                                 █   █               ██  █ █
1802.2 |█  ███                                  █  █  ██     █  ███       █ ██   ███████
1649.7 |█ █████                                 ██ █  ██   ████ ████  █ █ ██████████████
1497.2 |███████                           █    ██████████████████████████ ██████████████
1344.6 |████████                          █    ██████████████████████████ ██████████████
1192.1 |█████████                         █ █ ██████████████████████████████████████████
1039.6 |█████████                    █  █ █ █ ██████████████████████████████████████████
887.1 |██████████              ████████████████████████████████████████████████████████
734.5 |██████████         █   █████████████████████████████████████████████████████████
582.0 |████████████   █ ███████████████████████████████████████████████████████████████
429.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6573
   1 ms | ██████████████  2226
   2 ms | ██  348
   3 ms | █  185
   4 ms | █  130
   5 ms | █  97
   6 ms |   29
   7 ms |   19
   8 ms |   11
   9 ms |   7
  10 ms |   8
  11 ms |   2
  12 ms |   6
  13 ms |   5
  14 ms |   8
  15 ms |   18
  16 ms |   44
  17 ms | █  84
  18 ms |   67
  19 ms |   41
  20 ms |   50
  21 ms |   47
  22 ms |   22
  23 ms |   8
  24 ms |   20
  25 ms |   4
  26 ms |   7
  27 ms |   3
  28 ms |   1
  32 ms |   2
  33 ms |   1
  34 ms |   1
  35 ms |   2
  38 ms |   1
  39 ms |   1
  41 ms |   1
  42 ms |   2
  43 ms |   1
  48 ms |   1
  49 ms |   1
  53 ms |   1
  59 ms |   2
  64 ms |   1
  65 ms |   1
  66 ms |   1
  68 ms |   1
  74 ms |   1
 140 ms |   1
 258 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `30.66`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.11`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `10.98`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `504.81`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3283.00`
- `preload_duration_ms` = `23.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `1557.79`, min `18.09`, p50 `1795.12`, p95 `2734.05`, p99 `3270.26`, 1%low `38.97`, 0.1%low `23.49`, std `773.64`

**Frame time (ms)**  avg `1.59`, p50 `0.56`, p95 `4.75`, p99 `20.84`, p99.9 `32.61`, max `55.27`

**Client tick (ms)**  avg `2.78`, p95 `4.44`, max `19.80`

**Memory**  start `1252 MB`, end `2938 MB`, peak `3392 MB`, GC `45 events / 575 ms`

**FPS over sampling window (ASCII):**

```
2970.5 |                                 █     █                                        
2735.3 |                                 █     █                                        
2500.2 |                                 ██   ███                                       
2265.1 |                                 ██   ███                                       
2029.9 |                             █   ██ █ ███  ██  █                      █    ████ 
1794.8 |█████                    ██  ██  ████ ████ ████████   ████ █    ██ ████  ███████
1559.6 |██████                   ███ ████████ ██████████████████████████████████████████
1324.5 |███████                 ████ ████████ ██████████████████████████████████████████
1089.3 |███████                 ████████████████████████████████████████████████████████
854.2 |████████           █████████████████████████████████████████████████████████████
619.0 |████████    █  ██ ██████████████████████████████████████████████████████████████
383.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9104
   1 ms | ████████  1851
   2 ms | ███  645
   3 ms | █  222
   4 ms | █  141
   5 ms |   100
   6 ms |   47
   7 ms |   16
   8 ms |   11
   9 ms |   5
  10 ms |   4
  11 ms |   3
  12 ms |   10
  13 ms |   13
  14 ms |   14
  15 ms |   10
  16 ms |   36
  17 ms |   46
  18 ms |   55
  19 ms |   62
  20 ms |   43
  21 ms |   29
  22 ms |   25
  23 ms |   13
  24 ms |   13
  25 ms |   8
  26 ms |   7
  27 ms |   3
  28 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   3
  32 ms |   4
  33 ms |   1
  34 ms |   2
  35 ms |   1
  38 ms |   1
  46 ms |   2
  47 ms |   1
  49 ms |   3
  55 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `38.97`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `620.03`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `23.49`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `627.91`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3430.00`
- `preload_duration_ms` = `0.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `734.91`, min `19.72`, p50 `762.81`, p95 `1142.17`, p99 `1282.11`, 1%low `42.30`, 0.1%low `28.03`, std `274.56`

**Frame time (ms)**  avg `2.31`, p50 `1.31`, p95 `6.21`, p99 `19.97`, p99.9 `28.08`, max `50.71`

**Client tick (ms)**  avg `1.01`, p95 `1.66`, max `23.36`

**Memory**  start `2228 MB`, end `3104 MB`, peak `4111 MB`, GC `44 events / 583 ms`

**FPS over sampling window (ASCII):**

```
1105.4 |       █                                                                        
1047.1 |█  █ █ █                                                                        
988.8 |█  ███ ████                                                                     
930.6 |█ █████████ █                                                                  █
872.3 |████████████████   █ █                                                        ██
814.1 |██████████████████ ████                                                  ███  ██
755.8 |██████████████████ ████                 █                             ██████████
697.5 |██████████████████████████ █████   █    ██    ██     ███      █      ███████████
639.3 |████████████████████████████████████ █  ██    ███    ████████ ███  █████████████
581.0 |██████████████████████████████████████ ████   ███  █ █████████████ █████████████
522.8 |████████████████████████████████████████████  ██████████████████████████████████
464.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  1333
   1 ms | ████████████████████████████████████████  5911
   2 ms | ████  609
   3 ms | █  208
   4 ms | █  117
   5 ms |   46
   6 ms |   20
   7 ms |   11
   8 ms |   4
   9 ms |   4
  10 ms |   4
  12 ms |   1
  13 ms |   1
  14 ms |   8
  15 ms |   33
  16 ms |   47
  17 ms | █  92
  18 ms | █  78
  19 ms |   52
  20 ms |   28
  21 ms |   13
  22 ms |   12
  23 ms |   7
  24 ms |   6
  25 ms |   4
  26 ms |   3
  27 ms |   2
  28 ms |   2
  29 ms |   1
  30 ms |   1
  32 ms |   1
  33 ms |   1
  35 ms |   1
  39 ms |   1
  40 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `78.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `28.03`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `433.20`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `42.30`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `1919.90`, min `18.49`, p50 `2060.49`, p95 `2509.80`, p99 `3193.61`, 1%low `46.10`, 0.1%low `30.35`, std `587.50`

**Frame time (ms)**  avg `0.99`, p50 `0.49`, p95 `2.07`, p99 `18.71`, p99.9 `25.14`, max `54.09`

**Client tick (ms)**  avg `0.47`, p95 `0.92`, max `4.41`

**Memory**  start `1349 MB`, end `2669 MB`, peak `3812 MB`, GC `42 events / 593 ms`

**FPS over sampling window (ASCII):**

```
2429.6 |                          █                                                     
2355.5 |                          █                                                     
2281.5 |                          █                                                     
2207.5 |                          █                                      █              
2133.5 |           █       █    █ █                            █         █              
2059.4 |           █    ████    █ ██                         ████     █  ██          █  
1985.4 | ██      ███   █████  ██████ █     █        █       ██████ █  █  ███         ██ 
1911.4 | ██  ████████ ███████ ██████ ██  ███      ███   █  █████████  ████████     █ ███
1837.4 | ██  ████████ █████████████████ ██████ ██ ███████  ██████████ █████████   ██████
1763.3 |███ █████████████████████████████████████████████████████████ ██████████  ██████
1689.3 |███ █████████████████████████████████████████████████████████ ██████████████████
1615.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18454
   1 ms | ██  796
   2 ms | █  307
   3 ms |   222
   4 ms |   76
   5 ms |   26
   6 ms |   10
   7 ms |   6
   8 ms |   5
  10 ms |   1
  13 ms |   2
  14 ms |   5
  15 ms |   17
  16 ms |   32
  17 ms |   71
  18 ms |   73
  19 ms |   66
  20 ms |   40
  21 ms |   26
  22 ms |   16
  23 ms |   6
  24 ms |   6
  25 ms |   1
  26 ms |   4
  27 ms |   4
  28 ms |   2
  31 ms |   1
  32 ms |   3
  35 ms |   2
  36 ms |   1
  46 ms |   1
  47 ms |   1
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `30.35`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `1014.20`
- `fps_1pct_low` = `46.10`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `68.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `1918.03`, min `22.69`, p50 `2068.20`, p95 `2454.16`, p99 `3001.04`, 1%low `47.60`, 0.1%low `34.05`, std `562.75`

**Frame time (ms)**  avg `0.97`, p50 `0.48`, p95 `2.07`, p99 `18.40`, p99.9 `24.71`, max `44.08`

**Client tick (ms)**  avg `0.44`, p95 `0.88`, max `3.21`

**Memory**  start `2277 MB`, end `3791 MB`, peak `4173 MB`, GC `41 events / 578 ms`

**FPS over sampling window (ASCII):**

```
2180.6 |                                                   █                            
2118.1 |                                                   █     ██  █       █          
2055.6 |█       █                                    ██    █   █ ██  █  █   ███    █    
1993.1 |█      ███   ██    █  █     █        █     ████  ███  █████████ ██ ████    █  ██
1930.6 |█      ███   ██   ███ █    ██████  █ █    █████ ████  ████████████ ████ █ ██ ███
1868.1 |██  █ █████████  ████ █   ██████████ ██   ██████████  █████████████████ █ ██ ███
1805.6 |███████████████  ██████   ██████████ ██   ███████████ █████████████████ ████████
1743.1 |████████████████ ████████ █████████████  ████████████ ██████████████████████████
1680.6 |████████████████ ████████ ██████████████████████████████████████████████████████
1618.1 |█████████████████████████ ██████████████████████████████████████████████████████
1555.6 |█████████████████████████ ██████████████████████████████████████████████████████
1493.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18748
   1 ms | ██  718
   2 ms | █  392
   3 ms |   164
   4 ms |   71
   5 ms |   15
   6 ms |   8
   7 ms |   5
   8 ms |   2
   9 ms |   2
  10 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   1
  14 ms |   7
  15 ms |   28
  16 ms |   43
  17 ms |   74
  18 ms |   79
  19 ms |   66
  20 ms |   39
  21 ms |   13
  22 ms |   10
  23 ms |   5
  24 ms |   8
  25 ms |   4
  26 ms |   2
  27 ms |   3
  28 ms |   3
  29 ms |   2
  31 ms |   1
  32 ms |   1
  35 ms |   1
  42 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `47.60`
- `preset_long` = `0.00`
- `preload_duration_ms` = `101.00`
- `fps_harmonic_avg` = `1026.13`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `34.05`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1713.56`, min `19.55`, p50 `1989.03`, p95 `2524.16`, p99 `3222.94`, 1%low `42.28`, 0.1%low `26.95`, std `766.97`

**Frame time (ms)**  avg `1.47`, p50 `0.50`, p95 `3.97`, p99 `19.93`, p99.9 `28.95`, max `51.16`

**Client tick (ms)**  avg `0.50`, p95 `1.04`, max `3.01`

**Memory**  start `2875 MB`, end `3766 MB`, peak `4066 MB`, GC `37 events / 590 ms`

**FPS over sampling window (ASCII):**

```
2579.7 |                                                                      █         
2456.8 |                                                                      █         
2333.8 |      █                                                               █         
2210.9 |      █    █                                                      █   █         
2087.9 |     ██    █                                                █     █   ██     █  
1964.9 |█    ██    █    █  █     █     █ █  █    █  █       █       █     █   ███  █ █  
1842.0 |█  █ ██  █ █    █  █     █     █ █  █    █  █   █ █ █     █ █     █  ████  █ █ █
1719.0 |█  █████ █ █    █  █  █  █  █  █ █  ██   ██ █   █████  █  █ █   █ ███████  █ ███
1596.1 |████████████ █ ██  █ ██ █████  ███  ███ ██████ ██████ █████ ██  ████████████ ███
1473.1 |████████████ ████ █████ ██████ ████████ ███████████████████████ ████████████ ███
1350.2 |██████████████████████████████ ████████████████████████████████ ████████████████
1227.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10776
   1 ms | ██  652
   2 ms | ███  838
   3 ms | ██  635
   4 ms |   129
   5 ms |   71
   6 ms |   35
   7 ms |   17
   8 ms |   16
   9 ms |   3
  10 ms |   3
  11 ms |   4
  12 ms |   3
  13 ms |   7
  14 ms |   5
  15 ms |   11
  16 ms |   38
  17 ms |   63
  18 ms |   74
  19 ms |   57
  20 ms |   48
  21 ms |   25
  22 ms |   15
  23 ms |   9
  24 ms |   5
  25 ms |   11
  26 ms |   1
  27 ms |   2
  28 ms |   3
  29 ms |   1
  30 ms |   1
  31 ms |   2
  34 ms |   2
  35 ms |   2
  36 ms |   1
  38 ms |   1
  39 ms |   2
  49 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `26.95`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `678.47`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `42.28`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `1693.60`, min `22.58`, p50 `1829.10`, p95 `2286.55`, p99 `2721.73`, 1%low `47.91`, 0.1%low `31.65`, std `537.62`

**Frame time (ms)**  avg `1.10`, p50 `0.55`, p95 `2.38`, p99 `18.10`, p99.9 `24.00`, max `44.30`

**Client tick (ms)**  avg `0.45`, p95 `0.78`, max `6.11`

**Memory**  start `2365 MB`, end `3435 MB`, peak `3955 MB`, GC `44 events / 566 ms`

**FPS over sampling window (ASCII):**

```
2153.1 |                                  █                                             
2077.0 |                                  █  █                                          
2000.9 |                                █ █ ██                                          
1924.8 | █                              ███ ██                  █ █                     
1848.6 |██               █     █      ████████                  █ █                     
1772.5 |██      █    █   ███   █   ██ ████████    █ █       █ ██████   █  █    █        
1696.4 |██ ██   █ █ ██ █ ████  ███ ██ ████████  █ ███     █ █████████ ███ █ █  █ ███ █  
1620.2 |██ ██ █ █ █ █████████  ███ ███████████  █████   █████████████ ██████████ ██████ 
1544.1 |██ ████ ███ █████████  ████████████████ ██████  ████████████████████████████████
1468.0 |██ ████ ███ ███████████████████████████ ████████████████████████████████████████
1391.9 |███████████ ████████████████████████████████████████████████████████████████████
1315.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  16113
   1 ms | ███  1026
   2 ms | █  337
   3 ms |   201
   4 ms |   70
   5 ms |   14
   6 ms |   7
   7 ms |   6
   8 ms |   11
   9 ms |   3
  10 ms |   2
  11 ms |   3
  12 ms |   1
  13 ms |   2
  14 ms |   6
  15 ms |   39
  16 ms |   65
  17 ms |   97
  18 ms |   76
  19 ms |   44
  20 ms |   21
  21 ms |   13
  22 ms |   9
  23 ms |   7
  24 ms |   5
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   2
  32 ms |   1
  33 ms |   2
  34 ms |   1
  39 ms |   1
  41 ms |   1
  42 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `79.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `31.65`
- `fps_1pct_low` = `47.91`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `909.59`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `775.28`, min `21.69`, p50 `835.89`, p95 `1131.24`, p99 `1197.69`, 1%low `46.63`, 0.1%low `30.33`, std `287.04`

**Frame time (ms)**  avg `2.17`, p50 `1.20`, p95 `7.38`, p99 `18.36`, p99.9 `24.36`, max `46.11`

**Client tick (ms)**  avg `0.44`, p95 `0.66`, max `7.57`

**Memory**  start `3331 MB`, end `3745 MB`, peak `3767 MB`, GC `23 events / 246 ms`

**FPS over sampling window (ASCII):**

```
913.2 | █            █          █                                                      
879.4 | █         █  █  █   █  ███    █                       █   █                    
845.7 |██  █      █  █  █ █ █ ████ █  █  █  █          █      █   █      █            █
811.9 |██  █      █████████ █ ██████  █  █ ██   █      █     ██   █      █  █ █       █
778.1 |███ █  █  ███████████████████  ██ █ ██ █ ██     █ ███ ████ █ █ ██ █  █ █     █ █
744.3 |█████  █  ███████████████████ ███ █ ██ ██████ █ █ ████████ ███ ███████ █   █ █ █
710.5 |█████ ██ ████████████████████ ████████ ██████████ ████████ █████████████ █ █ █ █
676.7 |█████ ██ █████████████████████████████ ██████████ ██████████████████████ ███ ███
642.9 |█████ ██ █████████████████████████████ ██████████ ██████████████████████ ███ ███
609.1 |█████ ████████████████████████████████ █████████████████████████████████████████
575.4 |██████████████████████████████████████ █████████████████████████████████████████
541.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████  2402
   1 ms | ████████████████████████████████████████  5257
   2 ms | ██████  766
   3 ms | ██  213
   4 ms |   61
   5 ms |   41
   6 ms |   13
   7 ms |   8
   8 ms |   6
   9 ms |   1
  10 ms |   2
  11 ms |   3
  12 ms |   1
  13 ms |   30
  14 ms | █  104
  15 ms | █  91
  16 ms | █  70
  17 ms |   46
  18 ms |   34
  19 ms |   27
  20 ms |   15
  21 ms |   8
  22 ms |   5
  23 ms |   4
  24 ms |   3
  25 ms |   1
  27 ms |   2
  30 ms |   1
  31 ms |   2
  38 ms |   1
  39 ms |   1
  46 ms |   1
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `48.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `30.33`
- `part` = `1.00`
- `fps_harmonic_avg` = `460.96`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `66.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.63`
- `surface_water_ratio` = `0.02`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24533 ms  |  Sample ticks: 400

**FPS**  avg `686.41`, min `21.61`, p50 `726.72`, p95 `1044.36`, p99 `1119.00`, 1%low `47.01`, 0.1%low `33.05`, std `255.82`

**Frame time (ms)**  avg `2.39`, p50 `1.38`, p95 `13.77`, p99 `18.47`, p99.9 `23.98`, max `46.27`

**Client tick (ms)**  avg `0.37`, p95 `0.57`, max `0.93`

**Memory**  start `2309 MB`, end `3400 MB`, peak `4467 MB`, GC `19 events / 200 ms`

**FPS over sampling window (ASCII):**

```
831.9 |  █                   █                                                         
808.4 |  █               █   █                                                         
784.8 |  █ █        █ █  █   █     █                                                   
761.3 |  ███ ██     █ █  █  ██     █  █  █ █    █                                      
737.8 |  ██████ █   ███  █████     █  █  █ █    █  █    █                              
714.3 |  ████████ █ ████ ██████    █  █ ██ █  █ █  █ █  █    █                         
690.8 | █████████ ██████ ██████ █  █  █ ██ █  █ █  █ █ ██ █  ██         █              
667.2 | █████████████████████████  █ ████████████ ██ █ ██ █ ████     ████       █      
643.7 |█████████████████████████████ ████████████ ██ █ ████ █████    ████   █   █ █ █  
620.2 |███████████████████████████████████████████████ ██████████████████ ████ ██ █ █ █
596.7 |██████████████████████████████████████████████████████████████████ ████ ████ █ █
573.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  726
   1 ms | ████████████████████████████████████████  5964
   2 ms | ██████  829
   3 ms | █  197
   4 ms | █  97
   5 ms |   74
   6 ms |   39
   7 ms |   16
   8 ms |   6
   9 ms |   3
  10 ms |   3
  13 ms |   14
  14 ms | █  85
  15 ms | █  114
  16 ms |   65
  17 ms |   48
  18 ms |   36
  19 ms |   17
  20 ms |   18
  21 ms |   10
  22 ms |   4
  23 ms |   6
  24 ms |   2
  25 ms |   2
  26 ms |   1
  27 ms |   1
  31 ms |   1
  34 ms |   1
  46 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1497.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `33.05`
- `part` = `1.00`
- `fps_harmonic_avg` = `419.24`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.01`
- `surface_water_ratio` = `0.03`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `769.48`, min `2.21`, p50 `817.71`, p95 `1148.40`, p99 `1213.44`, 1%low `27.70`, 0.1%low `5.98`, std `302.72`

**Frame time (ms)**  avg `2.40`, p50 `1.22`, p95 `10.49`, p99 `18.96`, p99.9 `35.16`, max `452.80`

**Client tick (ms)**  avg `0.36`, p95 `0.52`, max `1.63`

**Memory**  start `3241 MB`, end `3594 MB`, peak `4936 MB`, GC `18 events / 196 ms`

**FPS over sampling window (ASCII):**

```
913.6 |█         █ ███                                                  █              
872.8 |█ █      ██ ███              █                █                  █              
832.0 |████ █   ██████  █  █      █ ██            █  █ ██  █ █ █        █  █  █   █    
791.3 |██████  ███████ ██  ███ █  █ ██            █  █ ██  █ ███     ██ ████ ██   █   █
750.5 |███████████████ █████████ █████ ██      █ ██  ████ ██ ███  ██ ██ ███████  ██   █
709.7 |███████████████████████████████ ███    █████  ███████████  █████ ███████ ███ ███
669.0 |███████████████████████████████ ███  ███████████████████████████████████████████
628.2 |███████████████████████████████ ███  ███████████████████████████████████████████
587.4 |███████████████████████████████ ███  ███████████████████████████████████████████
546.6 |████████████████████████████████████ ███████████████████████████████████████████
505.9 |████████████████████████████████████ ███████████████████████████████████████████
465.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████  2391
   1 ms | ████████████████████████████████████████  4382
   2 ms | ███████  726
   3 ms | ██  176
   4 ms | █  111
   5 ms |   52
   6 ms |   38
   7 ms |   8
   8 ms |   12
   9 ms |   7
  10 ms |   5
  11 ms |   1
  12 ms |   1
  13 ms |   27
  14 ms | █  71
  15 ms | █  92
  16 ms | █  69
  17 ms |   39
  18 ms |   32
  19 ms |   19
  20 ms |   15
  21 ms |   11
  22 ms |   11
  23 ms |   6
  24 ms |   4
  25 ms |   1
  26 ms |   2
  28 ms |   2
  31 ms |   1
  34 ms |   1
  35 ms |   1
  47 ms |   1
  80 ms |   1
  90 ms |   1
 131 ms |   1
 158 ms |   1
 163 ms |   1
 211 ms |   1
 452 ms |   1
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `43.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `5.98`
- `part` = `1.00`
- `fps_harmonic_avg` = `416.20`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `27.70`
- `surface_water_ratio` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `755.62`, min `30.41`, p50 `798.45`, p95 `1122.04`, p99 `1201.98`, 1%low `47.69`, 0.1%low `34.53`, std `275.87`

**Frame time (ms)**  avg `2.16`, p50 `1.25`, p95 `5.50`, p99 `18.33`, p99.9 `25.36`, max `32.88`

**Client tick (ms)**  avg `0.40`, p95 `0.55`, max `4.44`

**Memory**  start `3326 MB`, end `3978 MB`, peak `5143 MB`, GC `18 events / 206 ms`

**FPS over sampling window (ASCII):**

```
924.1 |  █       █                                                                     
890.2 | ██  █   ██  █                                                                  
856.2 | ██  █   █████ █         █                                                      
822.2 |███████  █████ █ █       ██                                       █             
788.2 |███████ ████████ █ █  █  ████       █ ██     █   █   █   █    ██  █     █   █   
754.3 |████████████████████  █  ██████     ██████  ███  █████   ███  ██  ██ ██████ █   
720.3 |█████████████████████ █████████   ██████████████ ██████  ███ ███ ████████████   
686.3 |█████████████████████ █████████  ██████████████████████  ███ ████████████████   
652.4 |█████████████████████ █████████  ██████████████████████ ████ ████████████████   
618.4 |█████████████████████ ██████████ ██████████████████████ ██████████████████████  
584.4 |█████████████████████ █████████████████████████████████ ████████████████████████
550.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████  1873
   1 ms | ████████████████████████████████████████  5785
   2 ms | ██████  836
   3 ms | ██  217
   4 ms |   54
   5 ms |   22
   6 ms |   11
   7 ms |   4
   8 ms |   6
   9 ms |   3
  11 ms |   1
  13 ms |   19
  14 ms | █  104
  15 ms | █  92
  16 ms |   64
  17 ms |   48
  18 ms |   34
  19 ms |   28
  20 ms |   18
  21 ms |   6
  22 ms |   7
  23 ms |   2
  24 ms |   1
  25 ms |   2
  26 ms |   1
  27 ms |   3
  30 ms |   2
  31 ms |   1
  32 ms |   1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `43.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `34.53`
- `part` = `1.00`
- `fps_harmonic_avg` = `462.24`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.69`
- `surface_water_ratio` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23152 ms  |  Sample ticks: 400

**FPS**  avg `766.64`, min `17.49`, p50 `797.32`, p95 `1156.45`, p99 `1214.47`, 1%low `46.99`, 0.1%low `29.42`, std `280.98`

**Frame time (ms)**  avg `2.13`, p50 `1.25`, p95 `4.93`, p99 `18.27`, p99.9 `23.23`, max `57.19`

**Client tick (ms)**  avg `0.41`, p95 `0.64`, max `6.43`

**Memory**  start `4675 MB`, end `5393 MB`, peak `5393 MB`, GC `15 events / 202 ms`

**FPS over sampling window (ASCII):**

```
913.3 |       █                                                                        
880.4 |██     ████       █    ██     █    █                                            
847.5 |████   ████  █ █████   ██ █  ██ ██ ██        █                                  
814.5 |████  ██████ ███████  ███ ████████ ████      █                     █            
781.6 |████████████ ████████ █████████████████ █   ███                    █      █     
748.7 |████████████ ████████ ███████████████████  ████   █  █     █       █      █    █
715.7 |█████████████████████████████████████████  ████   █ ██     █  █    █ █   ██ ████
682.8 |█████████████████████████████████████████  ████ ███ ██   █ ████ █  ████  ██ ████
649.9 |█████████████████████████████████████████ ████████████  █████████  ████████ ████
616.9 |█████████████████████████████████████████ ███████████████████████ ██████████████
584.0 |█████████████████████████████████████████ ███████████████████████ ██████████████
551.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████  2174
   1 ms | ████████████████████████████████████████  5675
   2 ms | ██████  838
   3 ms | █  187
   4 ms |   55
   5 ms |   20
   6 ms |   4
   7 ms |   4
   8 ms |   1
   9 ms |   3
  10 ms |   3
  13 ms |   32
  14 ms | █  106
  15 ms | █  100
  16 ms |   49
  17 ms |   42
  18 ms |   29
  19 ms |   33
  20 ms |   19
  21 ms |   9
  22 ms |   4
  23 ms |   3
  24 ms |   3
  25 ms |   1
  36 ms |   1
  42 ms |   1
  48 ms |   1
  57 ms |   1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `15.00`
- `entity_count_delta` = `-14.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `98.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `29.42`
- `part` = `1.00`
- `fps_harmonic_avg` = `469.87`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `46.99`
- `surface_water_ratio` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 25459 ms  |  Sample ticks: 400

**FPS**  avg `753.49`, min `27.44`, p50 `799.03`, p95 `1137.21`, p99 `1211.02`, 1%low `47.26`, 0.1%low `31.16`, std `279.00`

**Frame time (ms)**  avg `2.17`, p50 `1.25`, p95 `5.24`, p99 `18.23`, p99.9 `26.49`, max `36.45`

**Client tick (ms)**  avg `0.43`, p95 `0.61`, max `5.81`

**Memory**  start `4131 MB`, end `3816 MB`, peak `5737 MB`, GC `15 events / 199 ms`

**FPS over sampling window (ASCII):**

```
928.7 |     █        █                                                                 
894.0 | █ ███     █  █  █                                                              
859.3 |██ ███   ████ █  ██  █ ██               █                                       
824.7 |██████   ███████ ██ ██ ██      █  █     █                                       
790.0 |███████ ████████ █████ ██      █ ██ █   █   █  █ █         █                    
755.3 |███████ █████████████████ █ █ ██ ██ ██ ██   █ ██ ███  █  ███ █    █             
720.7 |███████ █████████████████ █ █ ████████ ██   ████████ ███ ███████  █         █   
686.0 |███████ ██████████████████████████████ ███ █████████████ ████████ ██    █  █████
651.4 |███████ ██████████████████████████████ ███ ███████████████████████████  █ ██████
616.7 |███████ ██████████████████████████████ ███ ███████████████████████████ █████████
582.0 |██████████████████████████████████████ █████████████████████████████████████████
547.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████  1894
   1 ms | ████████████████████████████████████████  5673
   2 ms | ███████  933
   3 ms | █  186
   4 ms | █  73
   5 ms |   18
   6 ms |   7
   7 ms |   3
   8 ms |   4
   9 ms |   2
  10 ms |   2
  12 ms |   2
  13 ms |   23
  14 ms | █  101
  15 ms | █  94
  16 ms |   65
  17 ms |   48
  18 ms |   42
  19 ms |   22
  20 ms |   8
  21 ms |   7
  22 ms |   5
  23 ms |   1
  24 ms |   1
  25 ms |   3
  26 ms |   1
  27 ms |   3
  31 ms |   2
  34 ms |   1
  35 ms |   1
  36 ms |   2
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `2391.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `31.16`
- `part` = `1.00`
- `fps_harmonic_avg` = `461.19`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.26`
- `surface_water_ratio` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `775.72`, min `24.53`, p50 `819.80`, p95 `1145.44`, p99 `1216.71`, 1%low `48.29`, 0.1%low `34.06`, std `276.48`

**Frame time (ms)**  avg `2.09`, p50 `1.22`, p95 `5.25`, p99 `17.63`, p99.9 `24.06`, max `40.77`

**Client tick (ms)**  avg `0.39`, p95 `0.64`, max `3.51`

**Memory**  start `5589 MB`, end `4176 MB`, peak `6090 MB`, GC `15 events / 202 ms`

**FPS over sampling window (ASCII):**

```
951.5 |          █                                                                     
921.0 |          █                  █                                                  
890.5 |       ██ ██   █             █                    █                             
860.0 |██  ██ ██ ██   █ ███         █           █    █   █                             
829.6 |██████ █████  ██ ███ █   █   █   █    █  █   ██ █ █                             
799.1 |██████ █████ ███ ███ ██ ███  █   ████ ██ █   ██ █ █ █            █              
768.6 |████████████ ██████████████  ████████ ██ █   ██ █ ██████ █   ██  ██          █ █
738.1 |████████████ ██████████████ █████████ ████   ██ ██████████ ████ ███          ███
707.7 |██████████████████████████████████████████  ███ ██████████ ████████ █        ███
677.2 |██████████████████████████████████████████ ████ ███████████████████ ███  ███ ███
646.7 |██████████████████████████████████████████ ████████████████████████ ███ ████ ███
616.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████  2232
   1 ms | ████████████████████████████████████████  5944
   2 ms | █████  692
   3 ms | █  169
   4 ms |   48
   5 ms |   29
   6 ms |   11
   7 ms |   6
   8 ms |   2
   9 ms |   1
  10 ms |   2
  11 ms |   1
  13 ms |   26
  14 ms | █  103
  15 ms | █  110
  16 ms | █  75
  17 ms |   32
  18 ms |   26
  19 ms |   24
  20 ms |   13
  21 ms |   11
  23 ms |   4
  24 ms |   2
  26 ms |   2
  27 ms |   2
  28 ms |   2
  29 ms |   1
  33 ms |   1
  40 ms |   1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `54.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `34.06`
- `part` = `1.00`
- `fps_harmonic_avg` = `479.03`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `55.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.29`
- `surface_water_ratio` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25782 ms  |  Sample ticks: 400

**FPS**  avg `705.37`, min `23.42`, p50 `752.83`, p95 `1043.19`, p99 `1113.78`, 1%low `44.74`, 0.1%low `28.91`, std `256.97`

**Frame time (ms)**  avg `2.33`, p50 `1.33`, p95 `10.72`, p99 `18.91`, p99.9 `26.64`, max `42.70`

**Client tick (ms)**  avg `0.40`, p95 `0.59`, max `4.07`

**Memory**  start `5640 MB`, end `3831 MB`, peak `6437 MB`, GC `14 events / 197 ms`

**FPS over sampling window (ASCII):**

```
803.2 |██     ██                                                                       
782.4 |██   █ ██      █     █              █                                           
761.6 |███  ██████    █ █   █    █         █ █    █          █         █               
740.8 |████ ██████    █ █   █  ███   █     █ █    █  █  █    █         █  █      █    █
720.1 |███████████  ███ █  ██  ████ ██   █ █ █    █ ██ ███ █ █  █      █  █    █ █ █ ██
699.3 |███████████  █████████ ████████  ██ █ █    █ ██████ ████ █ █    █  █ █  ███ █ ██
678.5 |███████████  █████████ ████████  ██████    █ ███████████ █ ██   ██ █ █  ███ ████
657.7 |██████████████████████ ████████  ███████  ██████████████ █ ██ █ ████ █  ███ ████
636.9 |██████████████████████ ████████ █████████ ███████████████████ █ ████ ██ ███ ████
616.1 |██████████████████████ ████████ █████████ ███████████████████ █████████ ███ ████
595.4 |█████████████████████████████████████████ ███████████████████ ██████████████████
574.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████  861
   1 ms | ████████████████████████████████████████  6023
   2 ms | ██████  925
   3 ms | █  202
   4 ms | █  76
   5 ms |   24
   6 ms |   16
   7 ms |   6
   8 ms |   7
   9 ms |   7
  10 ms |   2
  13 ms |   2
  14 ms | █  76
  15 ms | █  105
  16 ms |   70
  17 ms |   48
  18 ms |   44
  19 ms |   33
  20 ms |   17
  21 ms |   7
  22 ms |   4
  23 ms |   6
  24 ms |   5
  25 ms |   2
  26 ms |   2
  27 ms |   1
  31 ms |   1
  32 ms |   1
  33 ms |   1
  36 ms |   1
  38 ms |   1
  41 ms |   1
  42 ms |   1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-4.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `2753.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `28.91`
- `part` = `1.00`
- `fps_harmonic_avg` = `428.88`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `44.74`
- `surface_water_ratio` = `0.08`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `747.43`, min `27.73`, p50 `787.97`, p95 `1096.63`, p99 `1179.87`, 1%low `47.90`, 0.1%low `32.34`, std `259.84`

**Frame time (ms)**  avg `2.15`, p50 `1.27`, p95 `5.32`, p99 `17.99`, p99.9 `25.60`, max `36.07`

**Client tick (ms)**  avg `0.50`, p95 `0.82`, max `3.49`

**Memory**  start `5135 MB`, end `4346 MB`, peak `6711 MB`, GC `12 events / 185 ms`

**FPS over sampling window (ASCII):**

```
902.0 |  █     █                                                                       
873.9 |█ █   █ █                                                                       
845.9 |█ █  ████  █  █                                                                 
817.8 |█████████  ██ █                                                       █   █     
789.8 |███████████████                                           █  █    █  ██ ███     
761.7 |███████████████ █    █               █              ██████████   ███ ███████    
733.7 |███████████████ █  █ ██   █  █ █    ██ █  █   █  ██ ██████████ █ ███ █████████  
705.6 |███████████████ ██ █ ████ ████ ██ █ ██ ██ █  ███ ██ ██████████ █████████████████
677.6 |███████████████ █████████ ███████ █ ███████ ████ ███████████████████████████████
649.5 |███████████████ ████████████████████████████████ ███████████████████████████████
621.5 |████████████████████████████████████████████████ ███████████████████████████████
593.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  1453
   1 ms | ████████████████████████████████████████  6422
   2 ms | █████  731
   3 ms | █  189
   4 ms |   46
   5 ms |   16
   6 ms |   15
   7 ms |   3
   8 ms |   4
   9 ms |   1
  10 ms |   1
  11 ms |   2
  12 ms |   1
  13 ms |   2
  14 ms | █  102
  15 ms | █  125
  16 ms |   63
  17 ms |   46
  18 ms |   32
  19 ms |   27
  20 ms |   10
  21 ms |   6
  22 ms |   3
  23 ms |   2
  24 ms |   1
  25 ms |   3
  26 ms |   1
  27 ms |   1
  29 ms |   1
  30 ms |   2
  31 ms |   2
  35 ms |   1
  36 ms |   1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `21.00`
- `entity_count_delta` = `-17.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preload_duration_ms` = `54.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `32.34`
- `part` = `1.00`
- `fps_harmonic_avg` = `465.88`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `47.90`
- `surface_water_ratio` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 24085 ms  |  Sample ticks: 400

**FPS**  avg `799.01`, min `26.55`, p50 `851.58`, p95 `1163.60`, p99 `1235.76`, 1%low `49.13`, 0.1%low `34.80`, std `279.49`

**Frame time (ms)**  avg `2.02`, p50 `1.17`, p95 `4.06`, p99 `18.01`, p99.9 `24.19`, max `37.67`

**Client tick (ms)**  avg `0.33`, p95 `0.47`, max `1.73`

**Memory**  start `3635 MB`, end `4090 MB`, peak `6815 MB`, GC `14 events / 188 ms`

**FPS over sampling window (ASCII):**

```
977.8 |   ██     █                                                                     
940.8 |  ███     █     █         █                                                     
903.7 |██████   ██ █   █  █      █                                                     
866.7 |████████ ██ █   ████  █ █ █       █                     █    █         █        
829.6 |█████████████ ██████ ████████  █  █ █  ██ █    █     █ ██    █         █        
792.6 |█████████████ ███████████████████ ███████ █  ████  █ █ ██ █  █ █       █   █    
755.5 |████████████████████████████████████████████ ████  █ ██████ ██ █ █     █   █    
718.5 |█████████████████████████████████████████████████  █████████████████ █ █   █ █  
681.4 |██████████████████████████████████████████████████ ███████████████████ █ █ ███  
644.3 |██████████████████████████████████████████████████████████████████████████ ████ 
607.3 |██████████████████████████████████████████████████████████████████████████ █████
570.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████  2714
   1 ms | ████████████████████████████████████████  5800
   2 ms | █████  735
   3 ms | █  158
   4 ms |   37
   5 ms |   15
   6 ms |   11
   7 ms |   4
   8 ms |   1
   9 ms |   2
  13 ms |   13
  14 ms | █  117
  15 ms | █  115
  16 ms |   54
  17 ms |   34
  18 ms |   46
  19 ms |   19
  20 ms |   17
  21 ms |   5
  22 ms |   3
  24 ms |   3
  25 ms |   2
  26 ms |   2
  29 ms |   1
  32 ms |   1
  35 ms |   1
  37 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1047.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `34.80`
- `part` = `1.00`
- `fps_harmonic_avg` = `495.61`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `57.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.13`
- `surface_water_ratio` = `0.07`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `747.86`, min `21.35`, p50 `785.88`, p95 `1099.42`, p99 `1185.88`, 1%low `48.32`, 0.1%low `31.18`, std `256.22`

**Frame time (ms)**  avg `2.12`, p50 `1.27`, p95 `5.05`, p99 `17.88`, p99.9 `24.02`, max `46.83`

**Client tick (ms)**  avg `0.33`, p95 `0.45`, max `2.89`

**Memory**  start `5056 MB`, end `6983 MB`, peak `6983 MB`, GC `11 events / 165 ms`

**FPS over sampling window (ASCII):**

```
912.7 |█  ███                                                                          
874.1 |███████    █     █                                                              
835.4 |█████████  ███ █ ██ █  █  █                                                     
796.8 |█████████ ████ █ ████  ██ █    █     █                                          
758.1 |██████████████████████ ██ █ ██ ████  █ ███   █           █       █ █            
719.4 |███████████████████████████████████████████ ██ ██ ███    ██████  █ ████ █      █
680.8 |██████████████████████████████████████████████ ██████  ███████████ ██████ █  █ █
642.1 |██████████████████████████████████████████████████████ ██████████████████ ████ █
603.5 |██████████████████████████████████████████████████████ █████████████████████████
564.8 |██████████████████████████████████████████████████████ █████████████████████████
526.1 |██████████████████████████████████████████████████████ █████████████████████████
487.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  1371
   1 ms | ████████████████████████████████████████  6676
   2 ms | ████  725
   3 ms | █  149
   4 ms |   55
   5 ms |   27
   6 ms |   13
   7 ms |   2
   8 ms |   4
  11 ms |   1
  13 ms |   23
  14 ms | █  114
  15 ms | █  109
  16 ms |   60
  17 ms |   32
  18 ms |   37
  19 ms |   26
  20 ms |   6
  21 ms |   6
  22 ms |   4
  23 ms |   3
  24 ms |   2
  25 ms |   2
  26 ms |   1
  30 ms |   1
  31 ms |   1
  33 ms |   1
  44 ms |   1
  46 ms |   1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `12.00`
- `entity_count_delta` = `-11.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `49.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `31.18`
- `part` = `1.00`
- `fps_harmonic_avg` = `472.63`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.32`
- `surface_water_ratio` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `811.71`, min `22.77`, p50 `866.28`, p95 `1183.47`, p99 `1248.34`, 1%low `48.79`, 0.1%low `31.57`, std `287.66`

**Frame time (ms)**  avg `2.00`, p50 `1.15`, p95 `4.56`, p99 `17.63`, p99.9 `22.64`, max `43.92`

**Client tick (ms)**  avg `0.34`, p95 `0.52`, max `2.01`

**Memory**  start `5977 MB`, end `6203 MB`, peak `7185 MB`, GC `14 events / 202 ms`

**FPS over sampling window (ASCII):**

```
971.8 |█    █                 █                                                        
932.7 |████ ███ █ ██          █                                                        
893.5 |████████ █ ███ █       ██    █                                                  
854.4 |██████████████ █     █ ██ ████ █ ██ █ █ █    █  █      █         █ █    █    █  
815.2 |███████████████████  █████████ ████ ███ █ █ ███ █      ██    █ ███ █    █    █  
776.1 |███████████████████ █████████████████████ █████ ██     ███ █ █████ █    █  █ █  
736.9 |███████████████████████████████████████████████████  █ █████ █████████████ █ █  
697.8 |████████████████████████████████████████████████████ █ █████ █████████████ █ ███
658.7 |██████████████████████████████████████████████████████████████████████████ █ ███
619.5 |██████████████████████████████████████████████████████████████████████████ █ ███
580.4 |██████████████████████████████████████████████████████████████████████████ █████
541.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████  3063
   1 ms | ████████████████████████████████████████  5549
   2 ms | █████  689
   3 ms | █  147
   4 ms |   63
   5 ms |   24
   6 ms |   10
   7 ms |   3
   8 ms |   8
   9 ms |   1
  10 ms |   1
  11 ms |   1
  13 ms |   31
  14 ms | █  102
  15 ms | █  110
  16 ms |   63
  17 ms |   41
  18 ms |   29
  19 ms |   24
  20 ms |   13
  21 ms |   5
  22 ms |   4
  23 ms |   2
  24 ms |   1
  25 ms |   1
  26 ms |   1
  28 ms |   1
  34 ms |   1
  43 ms |   3
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `14.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `19.00`
- `preload_duration_ms` = `55.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `31.57`
- `part` = `1.00`
- `fps_harmonic_avg` = `499.28`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.79`
- `surface_water_ratio` = `0.01`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `1922.32`, min `18.13`, p50 `2026.92`, p95 `2634.36`, p99 `3430.71`, 1%low `47.53`, 0.1%low `33.73`, std `579.27`

**Frame time (ms)**  avg `0.98`, p50 `0.49`, p95 `1.63`, p99 `18.73`, p99.9 `23.81`, max `55.15`

**Client tick (ms)**  avg `0.45`, p95 `0.63`, max `21.66`

**Memory**  start `6453 MB`, end `6920 MB`, peak `7195 MB`, GC `26 events / 394 ms`

**FPS over sampling window (ASCII):**

```
3201.7 |                                                                █               
3055.2 |                                                                █               
2908.7 |                                                               ██               
2762.2 |                                                               ██               
2615.6 |                                                               ██               
2469.1 |                                                               ███              
2322.6 |                                                               ███              
2176.1 |    █            █                                             ███              
2029.5 |█   ██   █     ███ █ ███         █  █       █           █    █ ████             
1883.0 |███████ ███  █████ ███████ █  █████████     ██████████ █████████████ █    ██████
1736.5 |████████████ ███████████████████████████████████████████████████████████████████
1590.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  18917
   1 ms | ██  734
   2 ms |   220
   3 ms |   129
   4 ms |   49
   5 ms |   16
   6 ms |   5
   7 ms |   3
   8 ms |   2
   9 ms |   1
  12 ms |   1
  13 ms |   4
  14 ms |   6
  15 ms |   23
  16 ms |   36
  17 ms |   78
  18 ms |   91
  19 ms |   85
  20 ms |   38
  21 ms |   16
  22 ms |   12
  23 ms |   9
  24 ms |   6
  25 ms |   3
  26 ms |   3
  29 ms |   2
  32 ms |   1
  35 ms |   1
  40 ms |   1
  43 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `38.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `47.53`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `1024.72`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `33.73`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `143.83`, min `17.54`, p50 `170.94`, p95 `227.43`, p99 `278.22`, 1%low `22.15`, 0.1%low `17.75`, std `68.28`

**Frame time (ms)**  avg `10.47`, p50 `5.85`, p95 `27.31`, p99 `38.54`, p99.9 `53.41`, max `57.01`

**Client tick (ms)**  avg `6.38`, p95 `14.60`, max `33.09`

**Memory**  start `6850 MB`, end `4112 MB`, peak `7256 MB`, GC `26 events / 404 ms`

**FPS over sampling window (ASCII):**

```
202.9 |█                                                                               
192.4 |█        █               █                                                      
181.9 |█       ██               █                                                      
171.4 |█       ██               █                 █                                    
160.9 |█    ██ ██          █ █  █ ███    █  █     ██ █       █ █ █  █ █          █     
150.5 |██ █ ██ ███         █ █  █████ █ ██ ██  █████ ████    █ ██████████    █ █ █   █ 
140.0 |████ ███████        ███ ████████ ██ ██████████████ █ █████████████  ███ ███ █ ██
129.5 |████████████  █    █████████████ █████████████████ █ █████████████ █████████████
119.0 |████████████ ██    █████████████ ███████████████████ ███████████████████████████
108.5 |████████████████   █████████████ ███████████████████████████████████████████████
 98.0 |████████████████ █ █████████████████████████████████████████████████████████████
 87.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   3
   3 ms | ███  37
   4 ms | ██████████████████████████  374
   5 ms | ████████████████████████████████████████  582
   6 ms | ███████  106
   7 ms | █████  78
   8 ms | ████  58
   9 ms | ███████  99
  10 ms | ████  60
  11 ms | ██  23
  12 ms | █  20
  13 ms | █  13
  14 ms | █  8
  15 ms |   6
  16 ms | █  13
  17 ms | ██  26
  18 ms | ██  32
  19 ms | ████  54
  20 ms | ███  43
  21 ms | ███  37
  22 ms | ███  43
  23 ms | ██  30
  24 ms | █  20
  25 ms | ██  25
  26 ms | █  20
  27 ms | █  16
  28 ms |   6
  29 ms | █  10
  30 ms |   5
  31 ms |   1
  32 ms | █  11
  33 ms |   6
  34 ms | █  8
  35 ms | █  11
  36 ms |   2
  37 ms |   4
  38 ms |   2
  39 ms |   4
  41 ms |   3
  42 ms |   1
  43 ms |   2
  44 ms |   1
  46 ms |   1
  48 ms |   1
  49 ms |   1
  52 ms |   1
  53 ms |   1
  55 ms |   1
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `17.75`
- `fps_1pct_low` = `22.15`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `44.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `95.53`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1695.21`, min `18.85`, p50 `1795.03`, p95 `2387.91`, p99 `3388.41`, 1%low `46.60`, 0.1%low `31.81`, std `591.91`

**Frame time (ms)**  avg `1.15`, p50 `0.56`, p95 `2.23`, p99 `18.99`, p99.9 `23.51`, max `53.05`

**Client tick (ms)**  avg `0.44`, p95 `0.67`, max `5.00`

**Memory**  start `4057 MB`, end `5710 MB`, peak `7261 MB`, GC `25 events / 407 ms`

**FPS over sampling window (ASCII):**

```
3100.8 |                                                    ██                          
2938.5 |                                                    ██                          
2776.3 |                                                    ██                          
2614.0 |                                                   ███                          
2451.8 |                                                   ███                          
2289.5 |                                                   ███                          
2127.3 |                                                   ████                         
1965.0 |      █ █                                  █       ████                         
1802.8 |███ █████       ███          █            ██ ███   █████ █                   ██ 
1640.5 |██████████ █  ███████     ████ █ █████    ████████ ████████ ████ ██████  █ █████
1478.3 |████████████████████████ ████████████████ ██████████████████████████████ ███████
1316.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15391
   1 ms | ███  1063
   2 ms | █  326
   3 ms |   126
   4 ms |   82
   5 ms |   29
   6 ms |   10
   7 ms |   11
   8 ms |   2
   9 ms |   3
  10 ms |   1
  12 ms |   3
  13 ms |   5
  14 ms |   4
  15 ms |   16
  16 ms |   34
  17 ms |   82
  18 ms |   96
  19 ms |   79
  20 ms |   37
  21 ms |   24
  22 ms |   7
  23 ms |   12
  24 ms |   3
  25 ms |   2
  26 ms |   3
  27 ms |   1
  30 ms |   1
  31 ms |   1
  36 ms |   2
  46 ms |   2
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `47.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `31.81`
- `part` = `1.00`
- `fps_harmonic_avg` = `872.93`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `46.60`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1752.67`, min `22.27`, p50 `1883.19`, p95 `2264.09`, p99 `2735.54`, 1%low `48.35`, 0.1%low `31.67`, std `508.19`

**Frame time (ms)**  avg `1.05`, p50 `0.53`, p95 `1.92`, p99 `18.29`, p99.9 `23.72`, max `44.89`

**Client tick (ms)**  avg `0.44`, p95 `0.67`, max `4.15`

**Memory**  start `5610 MB`, end `6870 MB`, peak `7273 MB`, GC `26 events / 419 ms`

**FPS over sampling window (ASCII):**

```
1976.9 |         █                        █                                             
1929.1 |         █ █                      ██                                            
1881.3 |█      █ █ █     █                ███              █                █         █ 
1833.6 |█ ██ █ █ █ █    ██              █ ███ █        █ ███      █      █  █ █     █ █ 
1785.8 |█ ████ █ █ █    ███  █ █ ██    ██████ ███    █ █ ███████  █    █ █ ██ █     ███ 
1738.0 |█ ████ █████    ████ ██████   ████████████ █ ███ ███████  ██   █ █ ████    █████
1690.2 |█ ██████████   █████ ██████ ██████████████ █ ███████████ ████  █ ██████  █ █████
1642.4 |████████████   █████ ██████ ██████████████ █ ██████████████████████████  ███████
1594.6 |████████████  ██████ █████████████████████ ████████████████████████████  ███████
1546.8 |████████████ █████████████████████████████ ████████████████████████████  ███████
1499.1 |████████████ ███████████████████████████████████████████████████████████████████
1451.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  17297
   1 ms | ██  862
   2 ms | █  307
   3 ms |   101
   4 ms |   56
   5 ms |   16
   6 ms |   11
   7 ms |   7
   8 ms |   3
  11 ms |   2
  12 ms |   2
  13 ms |   3
  14 ms |   6
  15 ms |   30
  16 ms |   46
  17 ms |   107
  18 ms |   110
  19 ms |   54
  20 ms |   17
  21 ms |   11
  22 ms |   3
  23 ms |   7
  24 ms |   2
  25 ms |   2
  26 ms |   1
  27 ms |   2
  28 ms |   2
  30 ms |   1
  31 ms |   2
  32 ms |   2
  34 ms |   1
  38 ms |   1
  42 ms |   1
  43 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `31.67`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `954.44`
- `fps_1pct_low` = `48.35`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `52.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `1536.91`, min `19.44`, p50 `1656.84`, p95 `1967.64`, p99 `2473.28`, 1%low `46.03`, 0.1%low `28.88`, std `451.40`

**Frame time (ms)**  avg `1.18`, p50 `0.60`, p95 `2.09`, p99 `18.75`, p99.9 `25.78`, max `51.45`

**Client tick (ms)**  avg `0.49`, p95 `0.81`, max `4.00`

**Memory**  start `6888 MB`, end `5659 MB`, peak `7299 MB`, GC `26 events / 417 ms`

**FPS over sampling window (ASCII):**

```
1800.9 |                                                                    █           
1756.7 |                                                              █     █           
1712.4 |                     █  █                                     █     █           
1668.2 |                     █  █              █         █            █     █ █        █
1624.0 |  █    █ █     █    ██  █      █       █         ██    █      █     █ █      ███
1579.8 |█ █    █ █     ████ ██  █  █  ██ ███ ████     █ ███   ██      ███   ███    █████
1535.6 |████ █████     ███████  █  █ ████████████     ██████  ██     ████  ████    █████
1491.3 |██████████   █ ███████ ██████████████████   ████████ ███    █████ █████   ██████
1447.1 |██████████ █ ████████████████████████████   ████████████   ██████ █████   ██████
1402.9 |████████████ ████████████████████████████ ███████████████ ███████ ██████  ██████
1358.7 |█████████████████████████████████████████ ███████████████████████████████ ██████
1314.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15019
   1 ms | ███  1051
   2 ms | █  289
   3 ms |   92
   4 ms |   68
   5 ms |   15
   6 ms |   9
   7 ms |   7
   8 ms |   1
   9 ms |   1
  11 ms |   2
  14 ms |   8
  15 ms |   20
  16 ms |   39
  17 ms |   87
  18 ms |   110
  19 ms |   62
  20 ms |   25
  21 ms |   17
  22 ms |   7
  23 ms |   7
  24 ms |   3
  25 ms |   4
  26 ms |   2
  27 ms |   3
  29 ms |   2
  30 ms |   1
  34 ms |   4
  35 ms |   1
  41 ms |   1
  46 ms |   1
  50 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `28.88`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `848.13`
- `restocks` = `20.00`
- `fps_1pct_low` = `46.03`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `44.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `1316.75`, min `15.77`, p50 `1409.83`, p95 `1697.71`, p99 `2008.39`, 1%low `46.23`, 0.1%low `24.65`, std `369.36`

**Frame time (ms)**  avg `1.31`, p50 `0.71`, p95 `2.14`, p99 `18.47`, p99.9 `25.27`, max `63.43`

**Client tick (ms)**  avg `0.45`, p95 `0.75`, max `3.01`

**Memory**  start `5166 MB`, end `4267 MB`, peak `7322 MB`, GC `27 events / 447 ms`

**FPS over sampling window (ASCII):**

```
1467.5 |     █                                                                          
1438.8 |     █                         █     █               █                          
1410.1 |█   ██              ██         █     ██ ██           ██               ██ █      
1381.5 |██  ███   █         ██ █       ██    ██ ████         ██            ██ ██ █     █
1352.8 |██ ████   █         ██ █       ███   ███████         ██  █   ██  █ ██ ██ █     █
1324.1 |██ █████ ███    █ █ ████ █     ████ ████████      █  ██ ███  ██  █ ██ ██ █     █
1295.5 |██ █████████   ██ ██████ █     █████████████    █ █████ ███████  ████ ████    ██
1266.8 |██ █████████   █████████ █    ███████████████  ██ █████████████  ██████████   ██
1238.1 |██████████████████████████    ████████████████ ████████████████ ███████████   ██
1209.5 |██████████████████████████   ██████████████████████████████████ ███████████  ███
1180.8 |██████████████████████████  ███████████████████████████████████ ████████████ ███
1152.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13209
   1 ms | ████  1204
   2 ms | █  252
   3 ms |   73
   4 ms |   58
   5 ms |   14
   6 ms |   5
   7 ms |   4
   8 ms |   3
  12 ms |   1
  14 ms |   11
  15 ms |   38
  16 ms |   48
  17 ms |   104
  18 ms |   119
  19 ms |   48
  20 ms |   13
  21 ms |   8
  22 ms |   5
  24 ms |   2
  25 ms |   2
  30 ms |   1
  32 ms |   2
  33 ms |   1
  38 ms |   2
  39 ms |   2
  41 ms |   1
  45 ms |   1
  48 ms |   1
  49 ms |   2
  63 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `74.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `24.65`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `761.92`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `46.23`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195638 ms  |  Sample ticks: 3600

**FPS**  avg `207.98`, min `0.68`, p50 `216.37`, p95 `371.28`, p99 `484.22`, 1%low `21.67`, 0.1%low `8.11`, std `105.76`

**Frame time (ms)**  avg `7.82`, p50 `4.62`, p95 `23.54`, p99 `30.71`, p99.9 `53.98`, max `1461.50`

**Client tick (ms)**  avg `1.05`, p95 `2.00`, max `21.96`

**Memory**  start `4154 MB`, end `6361 MB`, peak `7717 MB`, GC `156 events / 2228 ms`

**FPS over sampling window (ASCII):**

```
290.6 |                                                        █                       
272.6 |████                                 ██          █   █ ██  █ █ █   █            
254.6 |████                                 ██      █   █  ██ ███ █████  ███ █         
236.6 |████                              █  ███   █ ██  ███████████████  ███ █  ██ ████
218.6 |████         █              ██    ██ ███   █ ██ ███████████████████████████ ████
200.6 |████         █              ██   ███████   █ ██ ████████████████████████████████
182.6 |████ █     ███   ██ █       ██ █ ███████   █ ██ ████████████████████████████████
164.6 |████ ██ █ ████   ██ █  █   ███ █ ████████ █████ ████████████████████████████████
146.5 |████ ██ █ █████ ███ ██ █   ████████████████████ ████████████████████████████████
128.5 |████ ███████████████████   █████████████████████████████████████████████████████
110.5 |████████████████████████ █ █████████████████████████████████████████████████████
 92.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  178
   2 ms | ████████████  1944
   3 ms | ████████████████████████████████████████  6245
   4 ms | ███████████████████████████████  4762
   5 ms | ████████████████  2525
   6 ms | ████████  1194
   7 ms | ██████  862
   8 ms | ████  608
   9 ms | ███  394
  10 ms | ██  252
  11 ms | █  154
  12 ms | █  84
  13 ms |   56
  14 ms |   47
  15 ms |   64
  16 ms | █  139
  17 ms | ██  264
  18 ms | ██  390
  19 ms | ███  436
  20 ms | ███  464
  21 ms | ███  428
  22 ms | ██  368
  23 ms | ██  247
  24 ms | █  227
  25 ms | █  196
  26 ms | █  139
  27 ms | █  101
  28 ms |   69
  29 ms |   63
  30 ms |   38
  31 ms |   22
  32 ms |   14
  33 ms |   21
  34 ms |   13
  35 ms |   25
  36 ms |   12
  37 ms |   15
  38 ms |   9
  39 ms |   5
  40 ms |   4
  41 ms |   5
  42 ms |   11
  43 ms |   10
  44 ms |   2
  45 ms |   3
  46 ms |   2
  47 ms |   7
  48 ms |   2
  49 ms |   5
  50 ms |   2
  52 ms |   1
  53 ms |   5
  54 ms |   5
  55 ms |   7
  56 ms |   2
  58 ms |   3
  60 ms |   1
  61 ms |   2
  68 ms |   1
 103 ms |   1
 122 ms |   1
1461 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `part` = `2.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `86.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `21.67`
- `fps_harmonic_avg` = `127.94`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `410.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `8.11`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `1.00`
- `trees_built` = `173.00`
- `phase` = `0.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195012 ms  |  Sample ticks: 3600

**FPS**  avg `234.29`, min `27.74`, p50 `236.79`, p95 `424.06`, p99 `567.81`, 1%low `40.74`, 0.1%low `36.81`, std `106.34`

**Frame time (ms)**  avg `6.34`, p50 `4.22`, p95 `20.90`, p99 `23.50`, p99.9 `25.54`, max `36.05`

**Client tick (ms)**  avg `0.69`, p95 `0.89`, max `2.48`

**Memory**  start `4879 MB`, end `4946 MB`, peak `7399 MB`, GC `25 events / 201 ms`

**FPS over sampling window (ASCII):**

```
303.8 |                                        █                                       
291.6 |                                       ██            ███ ███                    
279.4 |                                       ██    ███    ██████████████  ████        
267.2 |█                                     ███    ███    ███████████████ █████       
255.1 |█                                    █████   ████  ████████████████ ██████      
242.9 |█                                █ ███████  █████  ████████████████████████ █  █
230.7 |█           █                █████████████  █████  █████████████████████████████
218.5 |█   ██      █                █████████████  █████  █████████████████████████████
206.3 |█   ██     ███               █████████████  █████ ██████████████████████████████
194.2 |█   ██     ███  ███    ██    █████████████ █████████████████████████████████████
182.0 |█  ████  █████  █████ ██████████████████████████████████████████████████████████
169.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███  673
   2 ms | ███████████  2444
   3 ms | ████████████████████████████████████████  8751
   4 ms | ██████████████████████████████████████  8242
   5 ms | ████████████████  3395
   6 ms | ████  902
   7 ms |   81
   8 ms |   8
   9 ms |   3
  11 ms |   1
  13 ms |   1
  15 ms |   3
  16 ms |   73
  17 ms | █  326
  18 ms | ██  541
  19 ms | ████  776
  20 ms | ████  848
  21 ms | ███  575
  22 ms | ██  350
  23 ms | █  238
  24 ms | █  117
  25 ms |   43
  26 ms |   14
  27 ms |   4
  28 ms |   2
  29 ms |   1
  30 ms |   1
  36 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
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
- `fps_1pct_low` = `40.74`
- `fps_harmonic_avg` = `157.85`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `410.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `36.81`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `71.00`
- `trees_built` = `173.00`
- `phase` = `1.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194344 ms  |  Sample ticks: 3600

**FPS**  avg `132.14`, min `16.54`, p50 `113.14`, p95 `303.19`, p99 `402.71`, 1%low `24.10`, 0.1%low `20.41`, std `90.66`

**Frame time (ms)**  avg `13.09`, p50 `8.84`, p95 `30.97`, p99 `33.57`, p99.9 `45.94`, max `60.44`

**Client tick (ms)**  avg `0.72`, p95 `0.97`, max `1.33`

**Memory**  start `6143 MB`, end `4532 MB`, peak `7398 MB`, GC `22 events / 203 ms`

**FPS over sampling window (ASCII):**

```
162.5 |                                                             █ █ ██             
157.0 |                                                          ██████████            
151.5 |█                                                         ███████████           
146.0 |█                                                       █████████████ █ █       
140.6 |█     ██                                              █ ██████████████████  ██  
135.1 |█    ███      █                           █          ███████████████████████████
129.6 |█████████    ███                 ███ ███ ███   ████  ███████████████████████████
124.1 |█████████████████         ██     ███████████   ████ ████████████████████████████
118.6 |███████████████████       ██████████████████  ██████████████████████████████████
113.2 |███████████████████      ████████████████████ ██████████████████████████████████
107.7 |█████████████████████    ███████████████████████████████████████████████████████
102.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   10
   2 ms | █████████  426
   3 ms | ██████████████████████████████  1362
   4 ms | ████████████████████████████  1269
   5 ms | ██████████████  652
   6 ms | ████████████  557
   7 ms | █████████████████████████  1113
   8 ms | ████████████████████████████████████████  1802
   9 ms | █████████████████████████████████████  1680
  10 ms | ███████████████████  844
  11 ms | █████  225
  12 ms | █  36
  13 ms |   3
  14 ms |   1
  15 ms |   1
  16 ms |   2
  17 ms |   3
  18 ms |   4
  19 ms |   11
  20 ms | █  27
  21 ms | █  31
  22 ms | █  28
  23 ms | █  34
  24 ms | ██  80
  25 ms | █████  213
  26 ms | ████████  353
  27 ms | ████████████  556
  28 ms | ██████████████  651
  29 ms | ██████████████  610
  30 ms | ███████████  497
  31 ms | ███████  321
  32 ms | ████  170
  33 ms | █  60
  34 ms |   18
  35 ms |   2
  36 ms |   2
  37 ms |   1
  38 ms |   3
  39 ms |   2
  40 ms |   2
  41 ms |   11
  42 ms |   13
  43 ms |   16
  44 ms | █  26
  45 ms |   14
  46 ms |   5
  47 ms |   3
  48 ms |   1
  49 ms |   1
  53 ms |   1
  54 ms |   1
  60 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `part` = `4.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `18.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `24.10`
- `fps_harmonic_avg` = `76.41`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `410.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `20.41`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `71.00`
- `trees_built` = `173.00`
- `phase` = `2.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195417 ms  |  Sample ticks: 3600

**FPS**  avg `110.64`, min `1.49`, p50 `83.95`, p95 `285.36`, p99 `379.52`, 1%low `10.99`, 0.1%low `3.29`, std `89.30`

**Frame time (ms)**  avg `17.82`, p50 `11.91`, p95 `40.44`, p99 `55.05`, p99.9 `144.84`, max `669.47`

**Client tick (ms)**  avg `0.86`, p95 `1.01`, max `101.36`

**Memory**  start `7315 MB`, end `5392 MB`, peak `7423 MB`, GC `20 events / 200 ms`

**FPS over sampling window (ASCII):**

```
159.9 |                                                               █                
152.7 |                                                               ███              
145.5 |                                                               ███              
138.3 |                                                               ████             
131.1 |█     █                                   █                   █████            █
123.9 |█    ████                           ██ ████    ████  █ █     ██████            █
116.7 |███  ████ █                     █ █████████   █████  ███ ██  ██████            █
109.5 |████████████  █                 ████████████  █████████████  ████████        ███
102.3 |█████████████ █                 ███████████████████████████ ██████████ ███ █████
 95.1 |█████████████████           █  █████████████████████████████████████████████████
 87.9 |█████████████████████████ ███  █████████████████████████████████████████████████
 80.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   3
   2 ms | ████████  172
   3 ms | ███████████████████████████████████████  861
   4 ms | ████████████████████████████████████████  884
   5 ms | ██████████████████████████  576
   6 ms | ████████████████  351
   7 ms | █████████  199
   8 ms | ███████████  247
   9 ms | ███████████████████  428
  10 ms | ██████████████████████████████  659
  11 ms | ██████████████████████████████████  752
  12 ms | ████████████████████████████  612
  13 ms | █████████████████████  470
  14 ms | ██████████████  303
  15 ms | ████████  187
  16 ms | ███  64
  17 ms | █  19
  18 ms |   11
  19 ms |   8
  20 ms |   3
  21 ms | ██  36
  22 ms | ███  62
  23 ms | ██  49
  24 ms | ███  67
  25 ms | █████  100
  26 ms | ███  70
  27 ms | ██  40
  28 ms | ███  65
  29 ms | ███  71
  30 ms | █████  117
  31 ms | █████████  190
  32 ms | ███████████  251
  33 ms | ██████████████  309
  34 ms | ███████████████  321
  35 ms | ██████████████  310
  36 ms | ████████████  263
  37 ms | ██████████  211
  38 ms | ███████  146
  39 ms | ████  95
  40 ms | ███  56
  41 ms | █  25
  42 ms | █  20
  43 ms | █  23
  44 ms | █  29
  45 ms | █  27
  46 ms | █  17
  47 ms | █  19
  48 ms | █  17
  49 ms | █  22
  50 ms | ██  35
  51 ms | █  31
  52 ms | ██  36
  53 ms | ██  38
  54 ms | █  30
  55 ms | █  25
  56 ms |   9
  57 ms |   9
  58 ms |   9
  59 ms |   1
  60 ms |   4
  61 ms |   5
  62 ms |   2
  63 ms |   2
  64 ms |   2
  65 ms |   1
  66 ms |   2
  69 ms |   1
  73 ms |   1
  75 ms |   3
  76 ms |   1
  77 ms |   1
  79 ms |   1
  80 ms |   1
  83 ms |   1
  84 ms |   1
  86 ms |   1
  88 ms |   1
  97 ms |   2
 102 ms |   2
 112 ms |   1
 115 ms |   1
 116 ms |   1
 132 ms |   1
 139 ms |   1
 145 ms |   1
 149 ms |   1
 208 ms |   1
 211 ms |   1
 225 ms |   1
 239 ms |   1
 254 ms |   1
 261 ms |   1
 350 ms |   1
 471 ms |   1
 669 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `16.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `10.99`
- `fps_harmonic_avg` = `56.11`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `410.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `3.29`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `71.00`
- `trees_built` = `173.00`
- `phase` = `3.00`

