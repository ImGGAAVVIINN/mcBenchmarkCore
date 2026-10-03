# MC Benchmark Core session — 2026-10-02T00:18:14.76930242+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 950.3 | 37.4 | 25.6 | 23.60 | 1.22 | 63 | 976 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 714.7 | 33.6 | 20.1 | 24.39 | 1.23 | 68 | 1763 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 623.4 | 37.1 | 24.7 | 23.48 | 1.11 | 52 | 2003 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 394.7 | 28.1 | 19.5 | 27.38 | 1.24 | 94 | 1096 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 755.7 | 36.9 | 23.1 | 23.11 | 1.15 | 52 | 1249 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 735.9 | 37.2 | 25.4 | 23.54 | 0.83 | 52 | 2119 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 625.1 | 36.0 | 24.4 | 24.68 | 1.20 | 94 | 711 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 316.9 | 26.8 | 19.7 | 28.52 | 1.83 | 66 | 2342 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 894.1 | 26.8 | 19.6 | 27.38 | 4.79 | 56 | 2426 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 202.0 | 22.1 | 18.6 | 37.01 | 5.21 | 38 | 588 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 434.3 | 26.4 | 19.1 | 27.77 | 1.60 | 92 | 955 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 410.6 | 30.6 | 17.8 | 26.59 | 1.06 | 71 | 1790 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 666.3 | 29.0 | 20.3 | 26.29 | 4.57 | 30 | 1724 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 749.2 | 27.5 | 18.9 | 27.07 | 3.91 | 38 | 1087 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1115.1 | 14.4 | 9.2 | 54.00 | 17.75 | 29 | 290 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1032.9 | 10.8 | 7.5 | 72.63 | 19.04 | 26 | 511 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1069.8 | 34.5 | 23.1 | 24.38 | 2.76 | 68 | 1280 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1084.1 | 30.5 | 20.6 | 25.83 | 2.95 | 56 | 2703 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 615.9 | 33.0 | 21.3 | 25.15 | 1.04 | 45 | 1515 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1459.1 | 40.0 | 28.7 | 22.01 | 0.44 | 42 | 1719 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1429.3 | 38.9 | 25.3 | 22.51 | 0.40 | 43 | 1543 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1244.8 | 35.5 | 21.1 | 23.34 | 0.54 | 48 | 1182 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1299.2 | 38.6 | 22.9 | 22.08 | 0.56 | 39 | 1573 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 1855.8 | 51.8 | 38.6 | 16.84 | 0.38 | 20 | 1616 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 1614.8 | 50.8 | 38.2 | 17.02 | 0.37 | 20 | 354 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 1854.2 | 51.1 | 37.1 | 16.65 | 0.34 | 21 | 1869 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 1807.2 | 50.5 | 37.2 | 17.02 | 0.36 | 21 | 1229 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 1846.8 | 50.5 | 35.7 | 16.73 | 0.37 | 21 | 1345 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 1900.8 | 52.7 | 39.7 | 16.78 | 0.37 | 19 | 1458 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 1868.7 | 52.2 | 36.5 | 16.69 | 0.36 | 22 | 1795 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 1700.9 | 49.8 | 37.0 | 17.05 | 0.37 | 21 | 1812 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 1672.8 | 48.2 | 33.6 | 17.72 | 0.46 | 19 | 175 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 1994.9 | 49.2 | 26.2 | 16.63 | 0.31 | 19 | 24 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 1677.2 | 49.2 | 35.7 | 17.37 | 0.35 | 20 | 2200 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 1959.0 | 51.4 | 35.5 | 16.79 | 0.31 | 18 | 715 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1419.3 | 36.2 | 21.4 | 23.08 | 0.43 | 31 | 1236 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 124.2 | 18.8 | 16.7 | 49.33 | 7.53 | 35 | 246 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1255.7 | 35.6 | 21.5 | 24.22 | 0.46 | 37 | 792 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1375.6 | 37.6 | 22.9 | 22.48 | 0.43 | 42 | 1237 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1190.9 | 37.1 | 23.6 | 23.31 | 0.46 | 38 | 1281 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 1047.3 | 38.0 | 23.8 | 22.98 | 0.52 | 42 | 589 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 205.0 | 17.6 | 6.8 | 40.53 | 1.05 | 200 | 2436 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 225.6 | 27.8 | 25.7 | 32.99 | 0.68 | 34 | 1053 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 118.6 | 21.3 | 17.1 | 44.74 | 0.69 | 29 | 373 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 103.0 | 18.5 | 17.7 | 52.66 | 0.66 | 24 | 420 |

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

Category: **Particles**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `950.27`, min `21.09`, p50 `1019.84`, p95 `1549.08`, p99 `1739.27`, 1%low `37.43`, 0.1%low `25.59`, std `409.34`

**Frame time (ms)**  avg `2.46`, p50 `0.98`, p95 `17.80`, p99 `23.60`, p99.9 `30.80`, max `47.42`

**Client tick (ms)**  avg `1.22`, p95 `2.45`, max `18.35`

**Memory**  start `1928 MB`, end `1112 MB`, peak `2904 MB`, GC `63 events / 616 ms`

**FPS over sampling window (ASCII):**

```
1425.8 |                                                                      █         
1350.5 |                                                                   █  ██        
1275.3 |                                                                ██ █ ███        
1200.1 |                                                      █    █  ██████ ███        
1124.9 |                                                █     █ ████  ██████████   █    
1049.6 |                           █                    █     ████████████████████ █ █  
974.4 |                          ██  █     ███   █ █ █ █ █   ████████████████████████ █
899.2 |           █  ██ █ █ ███████ ██   █ ███  ███████████ ███████████████████████████
824.0 |          ██  █████████████████  ███████████████████████████████████████████████
748.7 |  █ ████  ███ ██████████████████████████████████████████████████████████████████
673.5 | ███████████████████████████████████████████████████████████████████████████████
598.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4274
   1 ms | ████████████████████████  2581
   2 ms | ███  372
   3 ms | █  148
   4 ms | █  101
   5 ms | █  90
   6 ms |   36
   7 ms |   24
   8 ms |   11
   9 ms |   7
  10 ms |   3
  11 ms |   4
  12 ms |   2
  13 ms |   1
  14 ms |   6
  15 ms |   13
  16 ms |   25
  17 ms |   41
  18 ms |   52
  19 ms | █  58
  20 ms | █  57
  21 ms | █  60
  22 ms | █  62
  23 ms |   47
  24 ms |   19
  25 ms |   18
  26 ms |   7
  27 ms |   6
  28 ms |   1
  29 ms |   3
  30 ms |   1
  31 ms |   3
  34 ms |   1
  42 ms |   1
  46 ms |   2
  47 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 1017 | 702.5 | 24.98 |
| `sculk_charge_pop` | 240 | 1017 | 834.4 | 23.58 |
| `ALL_TOGETHER` | 1680 | 1017 | 888.0 | 24.42 |
| `portal` | 160 | 1017 | 876.7 | 22.54 |
| `end_rod` | 240 | 1017 | 959.3 | 23.08 |
| `dragon_breath` | 160 | 1017 | 1052.0 | 23.30 |
| `dripping_water` | 240 | 1017 | 1232.4 | 21.91 |
| `flame` | 160 | 1017 | 1057.1 | 22.79 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `37.43`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `25.59`
- `fps_harmonic_avg` = `407.20`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `128.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23078 ms  |  Sample ticks: 400

**FPS**  avg `714.70`, min `17.56`, p50 `796.22`, p95 `1069.64`, p99 `1190.56`, 1%low `33.63`, 0.1%low `20.07`, std `302.87`

**Frame time (ms)**  avg `3.07`, p50 `1.26`, p95 `19.23`, p99 `24.39`, p99.9 `45.43`, max `56.96`

**Client tick (ms)**  avg `1.23`, p95 `2.05`, max `10.23`

**Memory**  start `1153 MB`, end `1152 MB`, peak `2916 MB`, GC `68 events / 626 ms`

**FPS over sampling window (ASCII):**

```
846.1 |                                █                                █              
813.0 |  █                             █                             █  █        ██  █ 
779.9 |  █               █     █     █ █         █ █   █  █         ███ █     █ ███████
746.8 |  █ █         █   █ █   █    ██ ██     █  ████  █  █ ███ █  ████ █  █  █████████
713.8 | ██ ██    █   ██  ███ ███    █████  █  █  ████  █ ██ ███ █  ██████  █ ██████████
680.7 |███ ██   ████ ███ ███ ████  ██████ ██ ████████  █ ██████ █  ███████ ████████████
647.6 |███ ███ █████████ ███ █████ ██████ ████████████ ██████████ ████████ ████████████
614.5 |█████████████████ ███ ████████████ ████████████ ████████████████████████████████
581.4 |█████████████████████ ██████████████████████████████████████████████████████████
548.3 |█████████████████████ ██████████████████████████████████████████████████████████
515.2 |█████████████████████ ██████████████████████████████████████████████████████████
482.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  1006
   1 ms | ████████████████████████████████████████  4047
   2 ms | █████  535
   3 ms | ██  172
   4 ms | █  107
   5 ms | █  88
   6 ms |   46
   7 ms |   18
   8 ms |   9
   9 ms |   6
  12 ms |   1
  13 ms |   3
  14 ms |   7
  15 ms |   13
  16 ms |   35
  17 ms |   45
  18 ms |   48
  19 ms |   49
  20 ms | █  67
  21 ms | █  57
  22 ms |   46
  23 ms |   45
  24 ms |   22
  25 ms |   17
  26 ms |   10
  27 ms |   7
  28 ms |   4
  29 ms |   2
  30 ms |   2
  31 ms |   1
  32 ms |   1
  36 ms |   1
  43 ms |   1
  44 ms |   1
  46 ms |   1
  47 ms |   1
  48 ms |   2
  49 ms |   1
  51 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `33.63`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `39.00`
- `fps_harmonic_avg` = `326.19`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `20.07`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `623.43`, min `21.25`, p50 `692.38`, p95 `893.47`, p99 `1076.99`, 1%low `37.08`, 0.1%low `24.69`, std `246.89`

**Frame time (ms)**  avg `3.20`, p50 `1.44`, p95 `19.10`, p99 `23.48`, p99.9 `32.26`, max `47.07`

**Client tick (ms)**  avg `1.11`, p95 `1.63`, max `17.22`

**Memory**  start `1040 MB`, end `2966 MB`, peak `3044 MB`, GC `52 events / 603 ms`

**FPS over sampling window (ASCII):**

```
758.6 |                               █                                                
731.8 |                               █                                                
705.0 |               █               █                                           █    
678.1 |  █         █ ██  █  █     █  ██  █           █            █ ██   ██ █ █   █ █  
651.3 |  █       █ ███████ ██ █   █  ██  ██          █  █         ████ █ ██████ █ ███  
624.5 |  █  █  ███████████ ██ █  ██ ███████        ████████ █   █ ████ █ ████████████  
597.6 |  █ ███ ██████████████ ██ ██ █████████   ██ ████████ █  ██ ████ ███████████████ 
570.8 |█ █ ████████████████████████ █████████  ███ ███████████████████████████████████ 
543.9 |█ █ ████████████████████████ ██████████████ ████████████████████████████████████
517.1 |█ █ ████████████████████████████████████████████████████████████████████████████
490.3 |███ ████████████████████████████████████████████████████████████████████████████
463.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  111
   1 ms | ████████████████████████████████████████  4659
   2 ms | █████  589
   3 ms | ██  180
   4 ms | █  100
   5 ms | █  64
   6 ms |   28
   7 ms |   16
   8 ms |   8
   9 ms |   1
  10 ms |   3
  11 ms |   1
  12 ms |   2
  13 ms |   1
  14 ms |   7
  15 ms |   15
  16 ms |   36
  17 ms | █  63
  18 ms | █  59
  19 ms | █  66
  20 ms | █  73
  21 ms | █  60
  22 ms |   41
  23 ms |   25
  24 ms |   20
  25 ms |   10
  26 ms |   6
  27 ms |   1
  28 ms |   3
  30 ms |   2
  31 ms |   2
  32 ms |   1
  33 ms |   1
  37 ms |   1
  41 ms |   2
  43 ms |   1
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `37.08`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `58.00`
- `fps_harmonic_avg` = `312.82`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `24.69`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `394.71`, min `17.95`, p50 `444.04`, p95 `626.47`, p99 `718.30`, 1%low `28.05`, 0.1%low `19.50`, std `181.71`

**Frame time (ms)**  avg `4.99`, p50 `2.25`, p95 `22.19`, p99 `27.38`, p99.9 `48.01`, max `55.71`

**Client tick (ms)**  avg `1.24`, p95 `2.21`, max `5.53`

**Memory**  start `1022 MB`, end `2118 MB`, peak `2118 MB`, GC `94 events / 708 ms`

**FPS over sampling window (ASCII):**

```
500.0 |                                                                           █    
479.9 |                   █                                    █                  █    
459.8 |      █        █  ███       █   █                       █  █               ██   
439.7 |█ █   ██       █  ███       █   █ █   █    █           ██  █            █  ██   
419.6 |█ █   ██      ██  ███   ██  █   █ █   █    ██  █      ███  ██      █    █  ██  █
399.5 |████  ██  ██  ██  ███   ██  █ █ █ █ █ █    ██  ███   ████  ███  █ ██    █  ███ █
379.4 |█████ ██ ███  ██ ████ █████████ ███ ███ █  ███ ████  █████ ███  █ ██    █ ████ █
359.3 |█████ ██████████ ████ █████████ ██████████████ ████ ██████ ██████████   █ ██████
339.2 |████████████████ ██████████████ ██████████████████████████ ███████████ ██ ██████
319.1 |████████████████ █████████████████████████████████████████ ███████████ █████████
299.0 |████████████████ ███████████████████████████████████████████████████████████████
278.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █████████████████████████████████████  1346
   2 ms | ████████████████████████████████████████  1442
   3 ms | █████████  342
   4 ms | ████  154
   5 ms | ███  96
   6 ms | ██  75
   7 ms | █  30
   8 ms | █  25
   9 ms |   11
  10 ms |   10
  11 ms |   6
  12 ms |   3
  13 ms |   4
  14 ms |   4
  15 ms |   5
  16 ms |   12
  17 ms | █  35
  18 ms | █  47
  19 ms | ██  55
  20 ms | █  51
  21 ms | █  50
  22 ms | █  46
  23 ms | █  48
  24 ms | █  31
  25 ms | █  26
  26 ms |   17
  27 ms |   8
  28 ms |   7
  29 ms |   6
  30 ms |   4
  31 ms |   1
  32 ms |   1
  34 ms |   1
  36 ms |   1
  38 ms |   1
  41 ms |   3
  43 ms |   3
  45 ms |   1
  46 ms |   1
  47 ms |   1
  48 ms |   2
  49 ms |   1
  51 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.05`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `27.00`
- `fps_harmonic_avg` = `200.59`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `19.50`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `755.70`, min `20.53`, p50 `838.91`, p95 `1076.49`, p99 `1296.45`, 1%low `36.86`, 0.1%low `23.13`, std `293.50`

**Frame time (ms)**  avg `2.75`, p50 `1.19`, p95 `17.84`, p99 `23.11`, p99.9 `39.14`, max `48.70`

**Client tick (ms)**  avg `1.15`, p95 `1.93`, max `16.28`

**Memory**  start `2033 MB`, end `2413 MB`, peak `3283 MB`, GC `52 events / 621 ms`

**FPS over sampling window (ASCII):**

```
900.1 |               █    █                                                           
869.9 |             █ █    █        █                                                  
839.6 |             █ █    █     █  █                 █                                
809.3 |    █    █   ███ █  █     █  ██ █  █     █     █           █           ██   █   
779.1 |██  ██   █   ███ ██ █     █ █████ ██ ███ █  █  █  █ ██ █ █ █    █   █  ██ █████ 
748.8 |███ ████ ██  ███ ██ █     █ █████ ████████  ██ ██ █ ██ █████ █ ██   █ ██████████
718.5 |███████████  ███ █████ █  ████████████████  ██ █████████████ ████  ██ ██████████
688.3 |████████████████ █████ █  ████████████████  ████████████████████████████████████
658.0 |████████████████████████  ████████████████ █████████████████████████████████████
627.7 |█████████████████████████ ████████████████ █████████████████████████████████████
597.5 |█████████████████████████ ████████████████ █████████████████████████████████████
567.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  1012
   1 ms | ████████████████████████████████████████  4946
   2 ms | ████  463
   3 ms | █  120
   4 ms | █  93
   5 ms | █  77
   6 ms |   33
   7 ms |   8
   8 ms |   3
   9 ms |   2
  12 ms |   1
  13 ms |   5
  14 ms |   9
  15 ms |   22
  16 ms |   54
  17 ms |   59
  18 ms | █  64
  19 ms | █  68
  20 ms |   61
  21 ms |   50
  22 ms |   37
  23 ms |   31
  24 ms |   19
  25 ms |   9
  26 ms |   2
  27 ms |   2
  29 ms |   1
  30 ms |   1
  33 ms |   2
  36 ms |   1
  38 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   2
  42 ms |   1
  43 ms |   1
  44 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `36.86`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `46.00`
- `fps_harmonic_avg` = `363.60`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `23.13`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `735.88`, min `21.39`, p50 `823.96`, p95 `1036.56`, p99 `1232.54`, 1%low `37.17`, 0.1%low `25.44`, std `284.76`

**Frame time (ms)**  avg `2.82`, p50 `1.21`, p95 `18.69`, p99 `23.54`, p99.9 `31.99`, max `46.75`

**Client tick (ms)**  avg `0.83`, p95 `1.43`, max `3.95`

**Memory**  start `1154 MB`, end `1246 MB`, peak `3273 MB`, GC `52 events / 608 ms`

**FPS over sampling window (ASCII):**

```
887.8 |                                                                     █          
859.8 |                                    █                                █          
831.8 |█                                   █        █                       █ █ █      
803.8 |█           ██    █  █     █    █   █        █  █                    ███ █      
775.8 |█ ██ █     ███    █  ██    ██  ███  █  ██    █  █   ██              ████ █      
747.8 |█ ██ ███   ███   ██  ███   ██  ███  █ ███ ██ █ ██ █ ██    █   ███ █ ████ █   █  
719.8 |█ ██ ███   ███  ███  ████████ ████ ██ ██████ ████ ████ █  ███████ █ ███████  ██ 
691.8 |█ ████████ ███  ███  ████████ ██████████████████████████ ████████ ██████████████
663.9 |██████████ ██████████████████ ██████████████████████████ ███████████████████████
635.9 |█████████████████████████████ ██████████████████████████████████████████████████
607.9 |█████████████████████████████ ██████████████████████████████████████████████████
579.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████  681
   1 ms | ████████████████████████████████████████  5085
   2 ms | ████  470
   3 ms | █  148
   4 ms | █  77
   5 ms | █  76
   6 ms |   38
   7 ms |   10
   8 ms |   5
   9 ms |   4
  10 ms |   2
  11 ms |   1
  12 ms |   1
  13 ms |   1
  14 ms |   6
  15 ms |   12
  16 ms |   32
  17 ms |   46
  18 ms |   58
  19 ms | █  64
  20 ms |   62
  21 ms |   61
  22 ms |   55
  23 ms |   37
  24 ms |   19
  25 ms |   6
  26 ms |   9
  27 ms |   8
  28 ms |   2
  29 ms |   1
  30 ms |   1
  31 ms |   1
  32 ms |   2
  34 ms |   1
  35 ms |   1
  38 ms |   1
  40 ms |   1
  45 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `37.17`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `92.00`
- `fps_harmonic_avg` = `354.37`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `25.44`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `625.11`, min `20.81`, p50 `690.07`, p95 `929.26`, p99 `1114.27`, 1%low `36.00`, 0.1%low `24.43`, std `260.60`

**Frame time (ms)**  avg `3.35`, p50 `1.45`, p95 `20.02`, p99 `24.68`, p99.9 `29.34`, max `48.06`

**Client tick (ms)**  avg `1.20`, p95 `2.03`, max `13.19`

**Memory**  start `1372 MB`, end `2045 MB`, peak `2083 MB`, GC `94 events / 656 ms`

**FPS over sampling window (ASCII):**

```
754.8 |██       █            █                                          █              
730.7 |██       █       █    █                                         ██   ██         
706.5 |██       █       █    █                   █    █       █    █   ██   ██         
682.4 |██  █    █  █ █ ██    █       █          ██    █      ██    ██  ██   ███        
658.3 |███ █  █ █ ██ █ ██    █       █   ██     ██  █ █  ██  ██   ███  ██   ███   █    
634.1 |███ █  █ █ ██ ████  █ █  █    █   ██   █ ██  ███  ███ ███  ███  ██ █ ███   █    
610.0 |███ ██ █ ████ ████ ████  █   ██ █ ██   ████  ███  ███ ███  ████ ██ █ ███   █    
585.9 |██████ █ ████ █████████  █   ████████  █████████  ███████  ████ ██ █ ████  ██  █
561.7 |██████ █ ██████████████████  █████████ █████████ ████████ ████████ █ ████  ███ █
537.6 |████████████████████████████ ████████████████████████████ ████████ █ █████ █████
513.4 |████████████████████████████████████████████████████████████████████ █████ █████
489.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  174
   1 ms | ████████████████████████████████████████  4310
   2 ms | █████  540
   3 ms | ██  195
   4 ms | █  91
   5 ms | █  72
   6 ms |   44
   7 ms |   14
   8 ms |   12
   9 ms |   8
  10 ms |   7
  11 ms |   5
  12 ms |   2
  13 ms |   2
  14 ms |   6
  15 ms |   3
  16 ms |   16
  17 ms |   40
  18 ms | █  70
  19 ms | █  54
  20 ms | █  82
  21 ms |   53
  22 ms |   50
  23 ms |   37
  24 ms |   28
  25 ms |   16
  26 ms |   15
  27 ms |   6
  28 ms |   6
  29 ms |   1
  31 ms |   1
  32 ms |   1
  42 ms |   1
  43 ms |   1
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `36.00`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `69.00`
- `fps_harmonic_avg` = `298.39`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `24.43`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `316.92`, min `17.85`, p50 `363.06`, p95 `474.27`, p99 `564.56`, 1%low `26.79`, 0.1%low `19.68`, std `138.38`

**Frame time (ms)**  avg `5.65`, p50 `2.75`, p95 `22.37`, p99 `28.52`, p99.9 `46.75`, max `56.03`

**Client tick (ms)**  avg `1.83`, p95 `2.94`, max `15.52`

**Memory**  start `945 MB`, end `1160 MB`, peak `3287 MB`, GC `66 events / 638 ms`

**FPS over sampling window (ASCII):**

```
418.3 |                                 █                                              
402.5 |                                 █                                              
386.8 |      █        █                 █                                              
371.0 |      █        █                 █                                              
355.3 |    █ █        ██                █  █   █             █                         
339.5 |█  ██ █  ███   ███         █  █  ██ █   █     █       █     █                █  
323.8 |█  ████ █████ ███████ █ █ █████  ████ █ ████ ██    ████ ██  █ █    █ █    █  █  
308.0 |██ ████ █████ ███████ ███████████████ █ ███████    ████ ██  █ ███  █ ███ ██ ██ █
292.3 |██ ████ ███████████████████████████████████████  ██████ ███ █ ███ ██████ ██ ██ █
276.5 |███████ ███████████████████████████████████████████████ ████████████████████████
260.8 |███████████████████████████████████████████████████████ ████████████████████████
245.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  96
   2 ms | ████████████████████████████████████████  2024
   3 ms | █████████  466
   4 ms | ████  223
   5 ms | ██  111
   6 ms | █  70
   7 ms | █  40
   8 ms |   21
   9 ms |   14
  10 ms |   6
  11 ms |   4
  13 ms |   2
  14 ms |   4
  15 ms |   6
  16 ms |   19
  17 ms | █  32
  18 ms | █  46
  19 ms | █  52
  20 ms | █  60
  21 ms | █  44
  22 ms | █  55
  23 ms |   24
  24 ms | █  30
  25 ms | █  26
  26 ms |   17
  27 ms |   8
  28 ms |   9
  29 ms |   4
  30 ms |   3
  32 ms |   3
  33 ms |   2
  34 ms |   3
  36 ms |   3
  37 ms |   1
  39 ms |   2
  40 ms |   1
  41 ms |   2
  42 ms |   3
  45 ms |   2
  47 ms |   1
  49 ms |   2
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `26.79`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `48.00`
- `fps_harmonic_avg` = `176.87`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `19.68`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `894.11`, min `14.85`, p50 `989.08`, p95 `1294.48`, p99 `1664.75`, 1%low `26.79`, 0.1%low `19.59`, std `365.83`

**Frame time (ms)**  avg `2.75`, p50 `1.01`, p95 `17.91`, p99 `27.38`, p99.9 `45.41`, max `67.32`

**Client tick (ms)**  avg `4.79`, p95 `6.30`, max `41.26`

**Memory**  start `841 MB`, end `1512 MB`, peak `3268 MB`, GC `56 events / 616 ms`

**FPS over sampling window (ASCII):**

```
1390.5 |█                                                                               
1329.8 |█                                                                               
1269.0 |█                                                                               
1208.3 |█                                                                               
1147.5 |█                                                                               
1086.8 |██                              █                                               
1026.0 |██                              █                   █        █                  
965.3 |██ █ █ █   █       █           ██ █               █ █   █  █ █  █   █ █   █     
904.5 |██ █ ███  ██  ██  ████     █ █ █████ ██  █ █ ██ █ █ ████████ █  ████████ ███    
843.8 |████ ████ ███ ██  ████ █ ███████████████████ █████████████████ █████████████   █
783.0 |█████████████ ████████████████████████████████████████████████ █████████████  ██
722.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  3495
   1 ms | ███████████████████████████████  2701
   2 ms | ██  199
   3 ms | █  54
   4 ms | █  72
   5 ms | █  91
   6 ms | █  105
   7 ms |   27
   8 ms |   19
   9 ms |   9
  10 ms |   5
  11 ms |   8
  12 ms |   2
  13 ms |   1
  14 ms |   8
  15 ms |   20
  16 ms |   35
  17 ms | █  55
  18 ms | █  48
  19 ms | █  46
  20 ms | █  44
  21 ms | █  45
  22 ms |   25
  23 ms |   21
  24 ms |   19
  25 ms |   18
  26 ms |   14
  27 ms |   10
  28 ms |   6
  29 ms |   7
  30 ms |   3
  32 ms |   2
  33 ms |   3
  34 ms |   3
  35 ms |   2
  36 ms |   8
  37 ms |   3
  38 ms |   4
  39 ms |   4
  40 ms |   2
  42 ms |   1
  43 ms |   2
  44 ms |   6
  45 ms |   6
  46 ms |   1
  47 ms |   1
  48 ms |   1
  50 ms |   1
  51 ms |   1
  67 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `26.79`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `363.20`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `19.59`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `201.99`, min `18.43`, p50 `227.93`, p95 `342.68`, p99 `391.64`, 1%low `22.09`, 0.1%low `18.64`, std `101.39`

**Frame time (ms)**  avg `8.23`, p50 `4.39`, p95 `23.99`, p99 `37.01`, p99.9 `50.83`, max `54.24`

**Client tick (ms)**  avg `5.21`, p95 `7.81`, max `12.60`

**Memory**  start `1670 MB`, end `1761 MB`, peak `2259 MB`, GC `38 events / 195 ms`

**FPS over sampling window (ASCII):**

```
276.4 |                                           █                                █   
262.5 |                                           █     █     █                    █   
248.7 |    █                                   █  █  █  ██ █  ██     █             █   
234.8 |    █    █                             █████ ██ ███ █  ██  █  █      █      █   
220.9 |  █ █    █                             ████████ ██████ ██  ██ █ █  ███ ██ █ █  █
207.1 |  █ █  █ █      █        █   █  █      ███████████████ ██  ██████████████ █ █ ██
193.2 | ████  █ ██ █████        █   █  █      ████████████████████████████████████ ████
179.4 |█████  █ ████████   ██  ██   █  █      █████████████████████████████████████████
165.5 |██████ ██████████   ████████ █ ██     ██████████████████████████████████████████
151.6 |███████████████████ ██████████████   ███████████████████████████████████████████
137.8 |███████████████████████████████████  ███████████████████████████████████████████
123.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   2 ms | ████████  166
   3 ms | ████████████████████████████████████████  827
   4 ms | █████████████████████  441
   5 ms | █████████  177
   6 ms | ███  68
   7 ms | ███  53
   8 ms | ██  50
   9 ms | ███  54
  10 ms | █  29
  11 ms | █  18
  12 ms | █  18
  13 ms | ███  53
  14 ms | ███  70
  15 ms | ██  33
  16 ms | █  24
  17 ms | ██  40
  18 ms | █  22
  19 ms | █  29
  20 ms | ██  45
  21 ms | ██  36
  22 ms | █  31
  23 ms | █  25
  24 ms | █  12
  25 ms | █  12
  26 ms | █  12
  27 ms |   7
  28 ms |   9
  29 ms |   9
  30 ms |   6
  31 ms |   6
  32 ms |   4
  33 ms |   4
  34 ms |   6
  35 ms |   6
  36 ms |   3
  37 ms |   1
  38 ms |   2
  39 ms |   1
  40 ms |   2
  41 ms |   1
  42 ms |   4
  44 ms |   2
  45 ms |   2
  46 ms |   2
  47 ms |   1
  48 ms |   1
  49 ms |   3
  51 ms |   1
  53 ms |   1
  54 ms |   1
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
- `fps_1pct_low` = `22.09`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `121.47`
- `preload_duration_ms` = `47.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `18.64`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `434.27`, min `15.64`, p50 `489.18`, p95 `680.85`, p99 `769.52`, 1%low `26.36`, 0.1%low `19.12`, std `199.46`

**Frame time (ms)**  avg `4.68`, p50 `2.04`, p95 `21.30`, p99 `27.77`, p99.9 `47.20`, max `63.92`

**Client tick (ms)**  avg `1.60`, p95 `2.36`, max `17.53`

**Memory**  start `1356 MB`, end `2000 MB`, peak `2311 MB`, GC `92 events / 683 ms`

**FPS over sampling window (ASCII):**

```
552.3 |█                                                                               
529.2 |█                       █          █                 █   █                      
506.1 |█                       ██         █        █        █  ██                      
483.0 |█    █            █     ██         ██       █    █   █  ████  █                 
459.9 |█    ██        ██ █     ██        ███ █ █  ███   █   █ █████  █ █    ██   █   ██
436.8 |███  ██   █   ███ █ █   ███  ██   ███ ███  ███   █ ███ █████  ████  ████  █ █ ██
413.7 |███ ███   █   ███ ████ ████  ██  ████ ███  ███ ███████ ██████ ████  █████████ ██
390.6 |███ ████ ██ █ ██████████████ ████████ ███ ██████████████████████████████████████
367.6 |███ ███████ █████████████████████████████ ██████████████████████████████████████
344.5 |███ ███████ █████████████████████████████ ██████████████████████████████████████
321.4 |███ ███████ ████████████████████████████████████████████████████████████████████
298.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   9
   1 ms | ████████████████████████████████████████  2006
   2 ms | ██████████████████████  1084
   3 ms | ██████  304
   4 ms | ███  150
   5 ms | ██  87
   6 ms | █  69
   7 ms | █  36
   8 ms |   23
   9 ms |   12
  10 ms |   11
  11 ms |   7
  12 ms |   4
  13 ms |   3
  14 ms |   2
  15 ms |   6
  16 ms |   20
  17 ms | █  40
  18 ms | █  48
  19 ms | █  64
  20 ms | █  53
  21 ms | █  53
  22 ms | █  38
  23 ms |   24
  24 ms | █  32
  25 ms |   23
  26 ms |   17
  27 ms |   9
  28 ms |   2
  29 ms |   3
  30 ms |   4
  31 ms |   4
  32 ms |   2
  33 ms |   1
  34 ms |   1
  35 ms |   1
  37 ms |   2
  39 ms |   2
  40 ms |   2
  41 ms |   2
  42 ms |   1
  44 ms |   1
  45 ms |   3
  46 ms |   4
  47 ms |   2
  48 ms |   1
  49 ms |   1
  63 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.12`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `213.83`
- `fps_1pct_low` = `26.36`
- `preload_duration_ms` = `72.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `410.59`, min `16.87`, p50 `451.03`, p95 `642.17`, p99 `904.21`, 1%low `30.63`, 0.1%low `17.78`, std `189.67`

**Frame time (ms)**  avg `4.72`, p50 `2.22`, p95 `21.93`, p99 `26.59`, p99.9 `46.90`, max `59.27`

**Client tick (ms)**  avg `1.06`, p95 `2.55`, max `19.33`

**Memory**  start `1061 MB`, end `2129 MB`, peak `2851 MB`, GC `71 events / 645 ms`

**FPS over sampling window (ASCII):**

```
626.4 |                                                     █                          
594.3 |                                                     █                          
562.2 |                            █                        █                          
530.1 |                            █         █              █     █   █              █ 
498.0 |                            █     █ █ █  █           ██    █   █              █ 
465.9 |                        █   █ █   █ █ █ ██        █  ██    █  ██   █      █   ██
433.8 |  █                 █   █ █ █ ██ ██████ ██  ██   ██  ███   █████   █   █ ██ █ ██
401.7 | ██     █      █   ██   ███████████████████ ███ ███ █████ ███████ ██   ████ ████
369.6 | ██  █  █     ██ █████ ████████████████████████ █████████████████ ██ ██████ ████
337.5 |████ █████ █  ████████ █████████████████████████████████████████████████████████
305.4 |████ █████ █ █████████ █████████████████████████████████████████████████████████
273.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  21
   1 ms | █████████████████████████████████████  1470
   2 ms | ████████████████████████████████████████  1573
   3 ms | ████████  324
   4 ms | ███  137
   5 ms | ███  99
   6 ms | ██  75
   7 ms | █  35
   8 ms |   19
   9 ms |   9
  10 ms |   6
  11 ms |   5
  12 ms |   3
  13 ms |   2
  14 ms |   4
  15 ms |   10
  16 ms |   10
  17 ms | █  30
  18 ms | █  44
  19 ms | ██  59
  20 ms | █  49
  21 ms | █  48
  22 ms | █  58
  23 ms | █  41
  24 ms | █  34
  25 ms | █  26
  26 ms |   13
  27 ms |   10
  28 ms |   5
  29 ms |   7
  30 ms |   4
  31 ms |   4
  37 ms |   1
  38 ms |   1
  41 ms |   1
  48 ms |   1
  53 ms |   1
  54 ms |   1
  57 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `30.63`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `212.08`
- `preload_duration_ms` = `65.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `17.78`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`
- `doors_placed` = `16.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `666.25`, min `17.78`, p50 `750.89`, p95 `1052.80`, p99 `1229.24`, 1%low `28.96`, 0.1%low `20.34`, std `311.89`

**Frame time (ms)**  avg `3.24`, p50 `1.33`, p95 `15.17`, p99 `26.29`, p99.9 `45.94`, max `56.24`

**Client tick (ms)**  avg `4.57`, p95 `9.16`, max `29.24`

**Memory**  start `1535 MB`, end `1721 MB`, peak `3260 MB`, GC `30 events / 253 ms`

**FPS over sampling window (ASCII):**

```
1123.0 |                                                                              █ 
1040.7 |                                                         █                    ██
958.4 |                                                         █            █     ████
876.1 |                       █                            █  ███     █   █ ██   █ ████
793.8 |                      ████ ████ █ █                ███████    ██████████████████
711.5 |             ████     █████████████             █ ████████    ██████████████████
629.2 |       ██████████  █  █████████████         ██ ███████████    ██████████████████
546.9 |      ███████████  █  █████████████        ████████████████   ██████████████████
464.6 |    █ ██████████████ ███████████████       ████████████████  ███████████████████
382.2 |█   ███████████████████████████████████  ███████████████████████████████████████
299.9 |█  █████████████████████████████████████████████████████████████████████████████
217.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████  594
   1 ms | ████████████████████████████████████████  3769
   2 ms | ███████  704
   3 ms | ███  265
   4 ms | █  116
   5 ms | █  59
   6 ms |   33
   7 ms |   28
   8 ms |   18
   9 ms |   10
  10 ms |   11
  11 ms |   9
  12 ms | █  50
  13 ms | █  74
  14 ms | █  111
  15 ms | █  67
  16 ms |   41
  17 ms |   36
  18 ms |   16
  19 ms |   23
  20 ms |   17
  21 ms |   13
  22 ms |   18
  23 ms |   12
  24 ms |   10
  25 ms |   5
  26 ms |   8
  27 ms |   7
  28 ms |   10
  29 ms |   7
  30 ms |   3
  31 ms |   2
  32 ms |   3
  33 ms |   2
  34 ms |   1
  35 ms |   2
  36 ms |   2
  38 ms |   1
  39 ms |   1
  41 ms |   2
  42 ms |   2
  43 ms |   3
  44 ms |   1
  45 ms |   3
  46 ms |   3
  48 ms |   1
  51 ms |   1
  56 ms |   1
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
- `fps_1pct_low` = `28.96`
- `fps_harmonic_avg` = `308.86`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `166.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `20.34`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.27`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `749.23`, min `14.05`, p50 `797.90`, p95 `1318.31`, p99 `1385.05`, 1%low `27.48`, 0.1%low `18.95`, std `385.73`

**Frame time (ms)**  avg `3.19`, p50 `1.25`, p95 `15.78`, p99 `27.07`, p99.9 `47.67`, max `71.16`

**Client tick (ms)**  avg `3.91`, p95 `8.74`, max `23.01`

**Memory**  start `1796 MB`, end `1717 MB`, peak `2883 MB`, GC `38 events / 357 ms`

**FPS over sampling window (ASCII):**

```
1188.0 |                            █                                 ██             █  
1103.3 |                           ████  █                            ██             ██ 
1018.5 |                         ███████████                          ███    █ █ █ █████
933.7 |                   █     ███████████     █                   ██████ ████████████
849.0 |                █████   █████████████   ██                   ███████████████████
764.2 |         ██   ███████   █████████████  ███                   ███████████████████
679.4 |        █████████████ █ ██████████████████                   ███████████████████
594.7 |      █████████████████ ███████████████████                 ████████████████████
509.9 |      █████████████████ ███████████████████ █    █      ██  ████████████████████
425.1 |     ██████████████████████████████████████ ███  █ █████████████████████████████
340.4 |█   ████████████████████████████████████████████████████████████████████████████
255.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████████████  1954
   1 ms | ████████████████████████████████████████  2574
   2 ms | ██████████  642
   3 ms | ████  242
   4 ms | ██  115
   5 ms | █  63
   6 ms | █  48
   7 ms | █  37
   8 ms |   21
   9 ms |   15
  10 ms |   5
  11 ms |   11
  12 ms |   16
  13 ms | █  70
  14 ms | █  63
  15 ms | █  93
  16 ms | █  46
  17 ms |   32
  18 ms |   26
  19 ms |   25
  20 ms |   18
  21 ms |   19
  22 ms |   15
  23 ms |   14
  24 ms |   13
  25 ms |   12
  26 ms |   11
  27 ms |   9
  28 ms |   7
  29 ms |   6
  30 ms |   3
  31 ms |   3
  32 ms |   3
  33 ms |   4
  34 ms |   1
  35 ms |   2
  36 ms |   2
  38 ms |   1
  40 ms |   1
  42 ms |   1
  43 ms |   3
  44 ms |   3
  45 ms |   3
  46 ms |   2
  47 ms |   4
  48 ms |   3
  52 ms |   1
  71 ms |   1
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
- `fps_1pct_low` = `27.48`
- `fps_harmonic_avg` = `313.63`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `58.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `18.95`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.67`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `1115.15`, min `8.65`, p50 `1017.40`, p95 `2779.14`, p99 `3109.41`, 1%low `14.39`, 0.1%low `9.25`, std `944.07`

**Frame time (ms)**  avg `6.47`, p50 `0.98`, p95 `33.11`, p99 `54.00`, p99.9 `81.93`, max `115.56`

**Client tick (ms)**  avg `17.75`, p95 `32.20`, max `47.53`

**Memory**  start `2309 MB`, end `1771 MB`, peak `2599 MB`, GC `29 events / 167 ms`

**FPS over sampling window (ASCII):**

```
2824.6 |                                                                           █  ██
2574.3 |                                                                           █████
2323.9 |                                                             █    █        █████
2073.6 |                                            █                █  █ █ █      █████
1823.2 |                   █             ████     █ █       █ █      ████████      █████
1572.9 |                   █      ██     █████    ████     ████      ████████     ██████
1322.5 |           █ █     █     ███     █████    █████    █████     █████████    ██████
1072.2 | █         █ █     ███   ████   ██████    █████    ██████    █████████    ██████
821.8 | █         █ ██    ███   ████   ███████   ██████   ███████   ██████████   ██████
571.5 |██   █  █  █ ███  █████  █████  ███████   ██████   ███████  ███████████   ██████
321.2 |███  █  █ ██ ████ █████  ██████ ████████  ███████  ████████ █████████████ ██████
 70.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1559
   1 ms | ████████  313
   2 ms | ███  120
   3 ms | ███  124
   4 ms | █████  195
   5 ms | ███  106
   6 ms |   15
   7 ms |   18
   8 ms |   11
   9 ms |   18
  10 ms |   5
  11 ms |   3
  12 ms | █  22
  13 ms | █  38
  14 ms | ██  62
  15 ms | █  38
  16 ms | █  51
  17 ms | █  35
  18 ms | █  31
  19 ms |   15
  20 ms |   16
  21 ms |   11
  22 ms | █  30
  23 ms |   14
  24 ms |   9
  25 ms |   7
  26 ms |   8
  27 ms |   13
  28 ms |   10
  29 ms |   10
  30 ms |   5
  31 ms |   12
  32 ms |   8
  33 ms |   18
  34 ms |   11
  35 ms |   6
  36 ms |   1
  37 ms |   7
  38 ms |   8
  39 ms |   2
  40 ms |   12
  41 ms |   6
  42 ms |   3
  43 ms |   8
  44 ms |   4
  45 ms |   6
  46 ms |   8
  47 ms |   4
  48 ms |   10
  49 ms |   8
  50 ms |   1
  51 ms |   1
  52 ms |   2
  53 ms |   1
  54 ms |   1
  55 ms |   1
  56 ms |   1
  57 ms |   1
  58 ms |   1
  59 ms |   3
  60 ms |   3
  61 ms |   1
  62 ms |   2
  63 ms |   3
  64 ms |   1
  66 ms |   2
  68 ms |   1
  70 ms |   1
  75 ms |   1
  76 ms |   1
  79 ms |   1
  81 ms |   3
  99 ms |   1
 109 ms |   1
 115 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `fps_1pct_low` = `14.39`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4804.04`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `9.25`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `154.44`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `28488.00`
- `preload_duration_ms` = `5.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1032.90`, min `6.52`, p50 `956.93`, p95 `2437.95`, p99 `3018.86`, 1%low `10.83`, 0.1%low `7.46`, std `886.74`

**Frame time (ms)**  avg `8.05`, p50 `1.05`, p95 `37.20`, p99 `72.63`, p99.9 `111.46`, max `153.49`

**Client tick (ms)**  avg `19.04`, p95 `34.09`, max `45.39`

**Memory**  start `2103 MB`, end `1800 MB`, peak `2615 MB`, GC `26 events / 146 ms`

**FPS over sampling window (ASCII):**

```
2738.1 |                                                                             ██ 
2493.1 |                                                                             ███
2248.1 |                                                               █ ██          ███
2003.1 |                                                 █          █  █ ████       ████
1758.1 |                               █   █             █ █ █      ██████████      ████
1513.1 |                         ██    █████    ██       █████      ██████████      ████
1268.0 |            █    ███    ███    █████    ████     ██████     ███████████     ████
1023.0 |  █         █    ███    ████   ██████   █████   ████████    ████████████   █████
778.0 |███         ██   ████   ████   ██████  ██████   ████████   █████████████   █████
533.0 |███        ████  ████  █████   ██████  ███████  █████████  ██████████████  █████
288.0 |████    █  ████  █████ ██████ ████████ ███████  ██████████ ██████████████  █████
 43.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1222
   1 ms | █████████  274
   2 ms | ███  85
   3 ms | ██  60
   4 ms | ██  59
   5 ms | ██  59
   6 ms | ███  93
   7 ms | █  28
   8 ms |   9
   9 ms |   4
  10 ms |   11
  11 ms |   10
  12 ms |   10
  13 ms | █  33
  14 ms | █  39
  15 ms | █  38
  16 ms | █  42
  17 ms | █  43
  18 ms | █  21
  19 ms |   13
  20 ms | █  22
  21 ms | █  19
  22 ms | █  23
  23 ms |   14
  24 ms |   12
  25 ms |   13
  26 ms |   9
  27 ms |   8
  28 ms |   8
  29 ms |   11
  30 ms |   15
  31 ms |   9
  32 ms |   5
  33 ms |   9
  34 ms |   14
  35 ms |   6
  36 ms |   10
  37 ms |   4
  38 ms |   5
  39 ms |   4
  40 ms |   9
  41 ms |   6
  42 ms |   2
  43 ms |   6
  44 ms |   6
  45 ms |   2
  46 ms |   5
  47 ms |   4
  48 ms |   4
  49 ms |   4
  50 ms |   1
  51 ms |   5
  52 ms |   3
  53 ms |   1
  54 ms |   2
  55 ms |   2
  57 ms |   3
  59 ms |   3
  60 ms |   2
  61 ms |   2
  62 ms |   4
  63 ms |   1
  64 ms |   1
  65 ms |   3
  66 ms |   1
  67 ms |   3
  68 ms |   2
  72 ms |   1
  75 ms |   2
  76 ms |   1
  77 ms |   1
  78 ms |   1
  80 ms |   2
  81 ms |   1
  83 ms |   1
  84 ms |   1
  86 ms |   3
  87 ms |   1
  88 ms |   1
  89 ms |   1
  90 ms |   1
  96 ms |   1
  98 ms |   1
 102 ms |   1
 109 ms |   1
 110 ms |   1
 112 ms |   1
 114 ms |   1
 153 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `fps_1pct_low` = `10.83`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4803.55`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `7.46`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `124.26`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `23020.00`
- `preload_duration_ms` = `19.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `1069.84`, min `19.57`, p50 `1109.88`, p95 `1800.50`, p99 `2263.11`, 1%low `34.55`, 0.1%low `23.13`, std `548.79`

**Frame time (ms)**  avg `2.44`, p50 `0.90`, p95 `17.58`, p99 `24.38`, p99.9 `38.04`, max `51.10`

**Client tick (ms)**  avg `2.76`, p95 `4.41`, max `16.58`

**Memory**  start `1540 MB`, end `1823 MB`, peak `2821 MB`, GC `68 events / 662 ms`

**FPS over sampling window (ASCII):**

```
1694.4 |                                                                      █         
1575.8 |                                                                   █  ██    █ ██
1457.2 |█  █                                                    █          █ ███   █████
1338.6 |██ ██                                       █    █  █   █  ███  ██ ██████  █████
1220.1 |███████                               █ ███ █   ██████  █ ████ █████████████████
1101.5 |███████                              █████████ █████████████████████████████████
982.9 |████████                            ████████████████████████████████████████████
864.3 |████████                   ██  █████████████████████████████████████████████████
745.8 |█████████             █   ██████████████████████████████████████████████████████
627.2 |██████████     █    ████████████████████████████████████████████████████████████
508.6 |██████████   █ ██ ██████████████████████████████████████████████████████████████
390.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4539
   1 ms | ████████████████████  2321
   2 ms | ███  382
   3 ms | █  150
   4 ms | █  134
   5 ms | █  122
   6 ms |   30
   7 ms |   21
   8 ms |   14
   9 ms |   4
  10 ms |   1
  11 ms |   4
  12 ms |   2
  13 ms |   2
  14 ms |   6
  15 ms |   16
  16 ms |   26
  17 ms |   55
  18 ms | █  58
  19 ms |   56
  20 ms | █  62
  21 ms |   38
  22 ms |   44
  23 ms |   30
  24 ms |   17
  25 ms |   22
  26 ms |   18
  27 ms |   11
  28 ms |   4
  29 ms |   1
  30 ms |   2
  31 ms |   2
  32 ms |   1
  33 ms |   2
  34 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms |   2
  39 ms |   1
  40 ms |   1
  42 ms |   1
  43 ms |   1
  44 ms |   1
  46 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `fps_1pct_low` = `34.55`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.15`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `23.13`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `410.67`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3185.00`
- `preload_duration_ms` = `4.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `1084.11`, min `19.26`, p50 `1173.09`, p95 `1863.42`, p99 `2311.31`, 1%low `30.46`, 0.1%low `20.59`, std `588.46`

**Frame time (ms)**  avg `2.58`, p50 `0.85`, p95 `17.88`, p99 `25.83`, p99.9 `45.40`, max `51.93`

**Client tick (ms)**  avg `2.95`, p95 `4.97`, max `21.28`

**Memory**  start `1480 MB`, end `2208 MB`, peak `4184 MB`, GC `56 events / 607 ms`

**FPS over sampling window (ASCII):**

```
1722.3 |                                       █                                █       
1595.8 |                                       █                                █  █ █ █
1469.3 | ██                                   ██    █  █           ██  █  ██ ██ ████████
1342.8 | ████                                 ██    █  ██   ██   ███████████████████████
1216.3 |██████                              █ ████ ███████████  ████████████████████████
1089.8 |███████                         █   ████████████████████████████████████████████
963.3 |███████                         █  █████████████████████████████████████████████
836.8 |████████                     ███████████████████████████████████████████████████
710.3 |████████                  ██████████████████████████████████████████████████████
583.8 |█████████            ██ ████████████████████████████████████████████████████████
457.3 |█████████     █ ████████████████████████████████████████████████████████████████
330.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  4406
   1 ms | ███████████████  1664
   2 ms | ██████  675
   3 ms | ██  177
   4 ms | █  119
   5 ms | █  101
   6 ms | █  66
   7 ms |   27
   8 ms |   16
   9 ms |   11
  10 ms |   6
  11 ms |   1
  13 ms |   2
  14 ms |   9
  15 ms |   15
  16 ms |   22
  17 ms |   40
  18 ms |   52
  19 ms |   55
  20 ms | █  60
  21 ms |   50
  22 ms |   37
  23 ms |   20
  24 ms |   17
  25 ms |   20
  26 ms |   16
  27 ms |   12
  28 ms |   5
  29 ms |   4
  30 ms |   4
  31 ms |   5
  32 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   2
  36 ms |   2
  39 ms |   1
  41 ms |   2
  42 ms |   3
  43 ms |   2
  45 ms |   4
  46 ms |   1
  47 ms |   2
  49 ms |   2
  51 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `fps_1pct_low` = `30.46`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `620.47`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.59`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `387.01`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3332.00`
- `preload_duration_ms` = `78.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `615.94`, min `16.82`, p50 `619.40`, p95 `1234.59`, p99 `1492.09`, 1%low `33.04`, 0.1%low `21.30`, std `317.31`

**Frame time (ms)**  avg `3.53`, p50 `1.61`, p95 `19.97`, p99 `25.15`, p99.9 `39.16`, max `59.46`

**Client tick (ms)**  avg `1.04`, p95 `1.98`, max `6.33`

**Memory**  start `2367 MB`, end `3065 MB`, peak `3882 MB`, GC `45 events / 621 ms`

**FPS over sampling window (ASCII):**

```
1301.8 |                                                                              █ 
1219.8 |                 █                                                            █ 
1137.7 |                 █                                                            ██
1055.7 |                 █                                                            ██
973.7 | █        █     ██                                                            ██
891.7 |██        █     ██                                                           ███
809.6 |███ ███   █ █   ██                                                           ███
727.6 |███████  ████   ██ ██      █                                              █  ███
645.6 |████████ █████████████     ██                        █                 █ ██  ███
563.6 |███████████████████████  ████    █     ████          █ █    █ █ █    ███████████
481.5 |██████████████████████████████████████ ████  ██ █████████████████  █████████████
399.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████  538
   1 ms | ████████████████████████████████████████  3411
   2 ms | █████████  743
   3 ms | ███  227
   4 ms | █  108
   5 ms | █  81
   6 ms | █  45
   7 ms |   21
   8 ms |   5
   9 ms |   3
  10 ms |   1
  11 ms |   4
  12 ms |   1
  13 ms |   4
  14 ms |   10
  15 ms |   14
  16 ms |   21
  17 ms |   41
  18 ms | █  59
  19 ms | █  55
  20 ms | █  45
  21 ms | █  61
  22 ms | █  44
  23 ms |   37
  24 ms |   35
  25 ms |   18
  26 ms |   8
  27 ms |   8
  28 ms |   7
  29 ms |   3
  30 ms |   5
  31 ms |   3
  32 ms |   1
  34 ms |   1
  37 ms |   1
  39 ms |   2
  42 ms |   1
  46 ms |   1
  47 ms |   2
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `22.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `21.30`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `283.65`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `33.04`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `1459.15`, min `23.59`, p50 `1602.69`, p95 `1999.36`, p99 `2455.02`, 1%low `40.01`, 0.1%low `28.74`, std `504.38`

**Frame time (ms)**  avg `1.57`, p50 `0.62`, p95 `4.41`, p99 `22.01`, p99.9 `28.62`, max `42.39`

**Client tick (ms)**  avg `0.44`, p95 `0.77`, max `5.35`

**Memory**  start `2300 MB`, end `3825 MB`, peak `4020 MB`, GC `42 events / 585 ms`

**FPS over sampling window (ASCII):**

```
1729.5 |   █ █                                                                          
1684.8 |   █ █                                                                          
1640.1 | █ █ █                                                               █          
1595.4 | █ █ █                             █                                 █          
1550.7 | █ █ █    ██ █       █             █            █    █          █    █          
1506.0 |██ █ ███  ██ █    █  █   █         █   █    █   █ ██ ██      █  ██   ██    █    
1461.3 |████████ ██████   █  █   ██       ██   █   ██████ █████    ████ ████ ██ ██ █   █
1416.6 |████████████████  ████ █ ██ █  ██ ██ █ █████████████████  ██████████████████   █
1371.9 |████████████████ ███████ ██ ██ █████ █ ██████████████████ ██████████████████   █
1327.2 |███████████████████████████ ████████ █ ██████████████████ ██████████████████ ███
1282.5 |████████████████████████████████████ ███████████████████████████████████████████
1237.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10753
   1 ms | ████  1101
   2 ms | █  143
   3 ms |   66
   4 ms |   90
   5 ms |   58
   6 ms |   31
   7 ms |   2
   8 ms |   2
   9 ms |   1
  12 ms |   2
  14 ms |   6
  15 ms |   26
  16 ms |   30
  17 ms |   45
  18 ms |   56
  19 ms |   75
  20 ms |   68
  21 ms |   63
  22 ms |   38
  23 ms |   37
  24 ms |   17
  25 ms |   11
  26 ms |   6
  27 ms |   5
  28 ms |   1
  29 ms |   4
  32 ms |   2
  34 ms |   1
  36 ms |   1
  38 ms |   2
  39 ms |   2
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `40.01`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `33.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `28.74`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `636.84`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1429.35`, min `20.61`, p50 `1548.17`, p95 `2071.19`, p99 `2923.89`, 1%low `38.90`, 0.1%low `25.33`, std `538.67`

**Frame time (ms)**  avg `1.63`, p50 `0.65`, p95 `4.78`, p99 `22.51`, p99.9 `29.69`, max `48.53`

**Client tick (ms)**  avg `0.40`, p95 `0.71`, max `3.79`

**Memory**  start `2574 MB`, end `3997 MB`, peak `4117 MB`, GC `43 events / 546 ms`

**FPS over sampling window (ASCII):**

```
2666.2 |                                                                  █             
2533.8 |                                                                  █             
2401.4 |                                                                  █             
2269.0 |                                                                  █             
2136.6 |█                                                                 █             
2004.1 |█                                                                 █             
1871.7 |█                                                                 █             
1739.3 |█                                                                ██             
1606.9 |█           █                █                                   ██           █ 
1474.5 |█  █ ████ █ █ ███   █ ██     ████ █ █  ███ ██ █          ███ ██  ██ █ ███   ████
1342.1 |██████████████████ ██ ███ ████████████████ ████████ ██ █████████ ███████████████
1209.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10161
   1 ms | ████  1081
   2 ms | █  219
   3 ms |   89
   4 ms |   83
   5 ms |   67
   6 ms |   29
   7 ms |   14
   8 ms |   3
   9 ms |   1
  11 ms |   1
  12 ms |   3
  13 ms |   4
  14 ms |   5
  15 ms |   8
  16 ms |   18
  17 ms |   43
  18 ms |   67
  19 ms |   63
  20 ms |   61
  21 ms |   57
  22 ms |   59
  23 ms |   37
  24 ms |   17
  25 ms |   15
  26 ms |   5
  27 ms |   4
  28 ms |   1
  29 ms |   3
  31 ms |   3
  33 ms |   2
  36 ms |   1
  40 ms |   1
  46 ms |   1
  47 ms |   3
  48 ms |   1
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
- `fps_1pct_low` = `38.90`
- `preset_long` = `0.00`
- `preload_duration_ms` = `100.00`
- `fps_harmonic_avg` = `611.96`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `25.33`
- `seed` = `4019.00`
- `preset_quick` = `1.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `1244.84`, min `18.88`, p50 `1482.34`, p95 `1890.10`, p99 `2129.06`, 1%low `35.49`, 0.1%low `21.11`, std `600.99`

**Frame time (ms)**  avg `2.36`, p50 `0.67`, p95 `18.02`, p99 `23.34`, p99.9 `39.16`, max `52.98`

**Client tick (ms)**  avg `0.54`, p95 `0.97`, max `27.00`

**Memory**  start `2619 MB`, end `2073 MB`, peak `3801 MB`, GC `48 events / 615 ms`

**FPS over sampling window (ASCII):**

```
1638.7 |                                █                                 █ █           
1566.6 |                                █      █       █                  █ █           
1494.5 |               █     █        █ █  █   █       █               █  █ █          █
1422.4 |     █ █       █  █  █  █   █ █ █  █   █  █    █    █     █    █  █ █  █ █  █  █
1350.3 | ██  █ █  █  ███  █  █  █   █ █ █  █   █  █    █ ██ █  █  ███  ██ █ █  █ █  █  █
1278.2 |███  █ █  █  ████ █  █  █   █ █ █  █ █ █  █  █ █ ██ █  ██ ███  ██ █ █  █ ██ █ ██
1206.1 |███  █ ████  ████ █ ██  █  ██ █ █  █ ███ ██  █ █ ██ █  ██ ███  ██ █ █  █ ██ █ ██
1134.0 |███████████  ████ █ ██ ██ ███ █ ████████ █████ ████ █  ██████  ██ █ █  █ ████ ██
1061.9 |████████████ ██████ ██ ██ ███ ██████████ █████ ████ ██████████ ██ ███ ██ ████ ██
989.8 |███████████████████ ██ ██ ██████████████ ██████████ █████████████████ ██████████
917.7 |███████████████████ ████████████████████████████████████████████████████████████
845.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6018
   1 ms | █████  735
   2 ms | ███  467
   3 ms | ███  420
   4 ms | █  145
   5 ms | █  76
   6 ms |   52
   7 ms |   37
   8 ms |   10
   9 ms |   3
  10 ms |   2
  13 ms |   1
  15 ms |   13
  16 ms |   24
  17 ms |   34
  18 ms |   49
  19 ms |   65
  20 ms | █  83
  21 ms |   63
  22 ms |   61
  23 ms |   42
  24 ms |   18
  25 ms |   10
  26 ms |   5
  27 ms |   4
  28 ms |   6
  29 ms |   3
  30 ms |   3
  31 ms |   1
  32 ms |   2
  35 ms |   1
  37 ms |   1
  40 ms |   2
  44 ms |   1
  45 ms |   2
  48 ms |   1
  49 ms |   1
  52 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `56.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `21.11`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `423.52`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `35.49`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1299.16`, min `15.20`, p50 `1414.25`, p95 `1863.69`, p99 `2464.32`, 1%low `38.62`, 0.1%low `22.88`, std `486.58`

**Frame time (ms)**  avg `1.79`, p50 `0.71`, p95 `5.81`, p99 `22.08`, p99.9 `28.46`, max `65.80`

**Client tick (ms)**  avg `0.56`, p95 `0.86`, max `22.59`

**Memory**  start `2687 MB`, end `1750 MB`, peak `4261 MB`, GC `39 events / 598 ms`

**FPS over sampling window (ASCII):**

```
1889.4 |                                                   █                            
1811.2 |                                                   █                            
1733.0 |                                                   █                            
1654.8 |                                                   █                            
1576.7 |█                                                  █                            
1498.5 |█ ███ ██                                         █ █   █                        
1420.3 |█ ███████  ██                █                   █ █   █       █                
1342.2 |██████████████ █ █         █ █               █   █ ███ █      ███ ███   █   ██ █
1264.0 |█████████████████████████  ███   ██ █    ██ ██ █████████   █  ███████████   ██ █
1185.8 |██████████████████████████████  █████ █████ ████████████ ██████████████████ ████
1107.7 |███████████████████████████████████████████ ████████████████████████████████████
1029.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8896
   1 ms | ██████  1291
   2 ms | █  209
   3 ms |   76
   4 ms |   80
   5 ms |   78
   6 ms |   32
   7 ms |   12
   8 ms |   5
   9 ms |   3
  13 ms |   1
  14 ms |   5
  15 ms |   17
  16 ms |   39
  17 ms |   42
  18 ms |   73
  19 ms |   60
  20 ms |   64
  21 ms |   73
  22 ms |   44
  23 ms |   28
  24 ms |   17
  25 ms |   11
  26 ms |   7
  27 ms |   3
  28 ms |   4
  31 ms |   1
  38 ms |   1
  39 ms |   1
  46 ms |   2
  50 ms |   1
  52 ms |   2
  65 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `48.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `22.88`
- `fps_1pct_low` = `38.62`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `558.95`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23155 ms  |  Sample ticks: 400

**FPS**  avg `1855.78`, min `28.26`, p50 `2001.48`, p95 `2711.25`, p99 `2838.49`, 1%low `51.82`, 0.1%low `38.57`, std `688.74`

**Frame time (ms)**  avg `1.23`, p50 `0.50`, p95 `3.40`, p99 `16.84`, p99.9 `23.01`, max `35.39`

**Client tick (ms)**  avg `0.38`, p95 `0.60`, max `3.22`

**Memory**  start `2119 MB`, end `2755 MB`, peak `3735 MB`, GC `20 events / 209 ms`

**FPS over sampling window (ASCII):**

```
2337.6 |   █ █                                                                          
2243.0 |   ███                  ██ █                                                    
2148.4 |  ████         ███      ██ █ █  █                                               
2053.8 | █████      █  ███   ███████ ████ ██             ██                             
1959.3 | █████      █ ████ █████████ ███████    █ ██     ██    █                        
1864.7 | █████    ███ ████ ██████████████████  ██ ██   ██████  █    █       ███       █ 
1770.1 | █████    ████████ ██████████████████  █████   ███████ █  ████     █████   ██ █ 
1675.5 |███████  ████████████████████████████  ███████ ███████ ██ ████ █ █ █████  █████ 
1581.0 |███████ █████████████████████████████ ████████████████████████ █ ███████  █████ 
1486.4 |█████████████████████████████████████ ████████████████████████ █ ███████ ███████
1391.8 |████████████████████████████████████████████████████████████████████████ ███████
1297.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14341
   1 ms | ██  893
   2 ms |   153
   3 ms |   96
   4 ms |   99
   5 ms |   30
   6 ms |   12
   9 ms |   1
  10 ms |   1
  12 ms |   7
  13 ms |   82
  14 ms |   86
  15 ms |   168
  16 ms |   116
  17 ms |   65
  18 ms |   21
  19 ms |   23
  20 ms |   12
  21 ms |   5
  22 ms |   8
  23 ms |   4
  24 ms |   6
  25 ms |   2
  26 ms |   1
  28 ms |   2
  29 ms |   1
  35 ms |   1
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `103.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `38.57`
- `part` = `1.00`
- `fps_harmonic_avg` = `812.23`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `51.82`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24452 ms  |  Sample ticks: 400

**FPS**  avg `1614.77`, min `27.31`, p50 `1654.51`, p95 `2606.69`, p99 `2818.60`, 1%low `50.78`, 0.1%low `38.16`, std `648.71`

**Frame time (ms)**  avg `1.40`, p50 `0.60`, p95 `4.14`, p99 `17.02`, p99.9 `23.13`, max `36.62`

**Client tick (ms)**  avg `0.37`, p95 `0.60`, max `1.95`

**Memory**  start `3605 MB`, end `3098 MB`, peak `3960 MB`, GC `20 events / 215 ms`

**FPS over sampling window (ASCII):**

```
2205.9 |      █      █                                                                  
2110.8 |██  █ █      █  █                                                               
2015.7 |██████████   █  █                                                               
1920.5 |███████████  ██████                                                             
1825.4 |███████████ ███████     █                                                       
1730.3 |███████████████████   ███  █   █ ███                                            
1635.2 |████████████████████  ██████   █ ██████     █      █                            
1540.1 |████████████████████ █████████████████████  ██ █ ████ █                         
1445.0 |██████████████████████████████████████████████ ████████ █ ██    █ ██  █         
1349.9 |██████████████████████████████████████████████████████████████████████████      
1254.8 |█████████████████████████████████████████████████████████████████████████████ █ 
1159.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12162
   1 ms | ████  1083
   2 ms |   150
   3 ms | █  163
   4 ms |   74
   5 ms |   30
   6 ms |   16
   7 ms |   3
  11 ms |   1
  12 ms |   2
  13 ms |   73
  14 ms |   89
  15 ms | █  173
  16 ms |   122
  17 ms |   54
  18 ms |   26
  19 ms |   18
  20 ms |   14
  21 ms |   13
  22 ms |   6
  23 ms |   3
  24 ms |   7
  26 ms |   2
  27 ms |   1
  31 ms |   1
  36 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `1412.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `38.16`
- `part` = `1.00`
- `fps_harmonic_avg` = `714.26`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `50.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.78`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1854.21`, min `23.87`, p50 `2013.71`, p95 `2763.99`, p99 `2910.19`, 1%low `51.10`, 0.1%low `37.12`, std `723.21`

**Frame time (ms)**  avg `1.25`, p50 `0.50`, p95 `3.65`, p99 `16.65`, p99.9 `22.62`, max `41.89`

**Client tick (ms)**  avg `0.34`, p95 `0.58`, max `1.37`

**Memory**  start `2189 MB`, end `3236 MB`, peak `4058 MB`, GC `21 events / 207 ms`

**FPS over sampling window (ASCII):**

```
2506.6 |   █                                                                            
2379.9 |  ██  █             █                                                           
2253.2 | ████ ███    █     ██                                                           
2126.5 |██████████████ ██  ██  █   █  █  █                                              
1999.8 |██████████████████ ███ █  ██ ██  █         █             █                      
1873.1 |█████████████████████████ █████ ██ ██    ███   ██        ███                    
1746.4 |█████████████████████████████████████████████  ███  ████ ██████        █ █      
1619.7 |█████████████████████████████████████████████ █████████████████ █ ████ █ ██     
1493.0 |█████████████████████████████████████████████ █████████████████ ████████ ████   
1366.3 |█████████████████████████████████████████████████████████████████████████████   
1239.6 |██████████████████████████████████████████████████████████████████████████████ █
1112.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13838
   1 ms | ███  1064
   2 ms |   163
   3 ms |   114
   4 ms |   86
   5 ms |   42
   6 ms |   10
   7 ms |   6
   8 ms |   3
   9 ms |   1
  12 ms |   14
  13 ms |   85
  14 ms |   92
  15 ms |   162
  16 ms |   122
  17 ms |   32
  18 ms |   26
  19 ms |   19
  20 ms |   22
  21 ms |   10
  22 ms |   8
  23 ms |   2
  24 ms |   5
  25 ms |   4
  27 ms |   1
  29 ms |   1
  35 ms |   1
  41 ms |   1
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `55.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `37.12`
- `part` = `1.00`
- `fps_harmonic_avg` = `796.88`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `51.10`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `1807.17`, min `24.66`, p50 `1947.45`, p95 `2682.92`, p99 `2876.95`, 1%low `50.51`, 0.1%low `37.16`, std `687.55`

**Frame time (ms)**  avg `1.27`, p50 `0.51`, p95 `3.45`, p99 `17.02`, p99.9 `22.77`, max `40.55`

**Client tick (ms)**  avg `0.36`, p95 `0.51`, max `5.23`

**Memory**  start `2856 MB`, end `3145 MB`, peak `4085 MB`, GC `21 events / 217 ms`

**FPS over sampling window (ASCII):**

```
2354.4 |        █ █                                                                     
2233.7 |   █ █  ███               █                                                     
2113.1 |█ ████  ███ ██            ██                                                    
1992.4 |███████████████           ███                                                   
1871.8 |█████████████████      █  ███ █           ███       █  █      ██    █  █     █  
1751.1 |████████████████████  █████████   █████  ████  ████ █ ██   ██████████ ███    █ █
1630.5 |████████████████████  █████████ ███████ █████████████████ ███████████████  █████
1509.8 |████████████████████  ███████████████████████████████████ ████████████████ █████
1389.2 |█████████████████████ ██████████████████████████████████████████████████████████
1268.5 |█████████████████████ ██████████████████████████████████████████████████████████
1147.9 |█████████████████████ ██████████████████████████████████████████████████████████
1027.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13761
   1 ms | ███  973
   2 ms | █  186
   3 ms |   140
   4 ms |   50
   5 ms |   33
   6 ms |   12
   7 ms |   5
   8 ms |   3
   9 ms |   1
  10 ms |   1
  12 ms |   15
  13 ms |   85
  14 ms |   92
  15 ms |   150
  16 ms |   104
  17 ms |   56
  18 ms |   32
  19 ms |   24
  20 ms |   8
  21 ms |   14
  22 ms |   12
  23 ms |   3
  24 ms |   4
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  30 ms |   1
  37 ms |   1
  40 ms |   1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `49.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `37.16`
- `part` = `1.00`
- `fps_harmonic_avg` = `788.87`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.51`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23708 ms  |  Sample ticks: 400

**FPS**  avg `1846.78`, min `23.85`, p50 `1970.26`, p95 `2770.14`, p99 `2927.13`, 1%low `50.53`, 0.1%low `35.69`, std `721.50`

**Frame time (ms)**  avg `1.26`, p50 `0.51`, p95 `3.57`, p99 `16.73`, p99.9 `24.32`, max `41.93`

**Client tick (ms)**  avg `0.37`, p95 `0.57`, max `6.83`

**Memory**  start `3006 MB`, end `3136 MB`, peak `4352 MB`, GC `21 events / 229 ms`

**FPS over sampling window (ASCII):**

```
2472.8 |           █                                                                    
2375.3 |  █    ██  █  █                                                                 
2277.8 |█ ██   ██  ██ █ █                                                               
2180.3 |█ ██ ████████ █ █   █     █                                                     
2082.8 |█ ███████████ █ █ ███    ███  █ █   █                                           
1985.4 |█████████████ ███ ███    ███  █ █ ██████    █                                   
1887.9 |█████████████ ███ ███   █████████████████   ██   █ █                            
1790.4 |█████████████████████ █ █████████████████   ███  █ █         █        █        █
1692.9 |█████████████████████ ████████████████████  ███  ████ █      █        ██  █    █
1595.4 |█████████████████████ ██████████████████████████ ████ ██ █   █ ██ █   █████ █ ██
1497.9 |███████████████████████████████████████████████████████████  █ ████████████ ████
1400.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13862
   1 ms | ███  1003
   2 ms | █  184
   3 ms |   154
   4 ms |   77
   5 ms |   21
   6 ms |   11
   7 ms |   5
   8 ms |   5
  12 ms |   15
  13 ms |   95
  14 ms |   108
  15 ms |   165
  16 ms |   87
  17 ms |   44
  18 ms |   26
  19 ms |   14
  20 ms |   12
  21 ms |   12
  22 ms |   5
  23 ms |   7
  24 ms |   7
  25 ms |   4
  26 ms |   1
  28 ms |   1
  29 ms |   2
  31 ms |   1
  36 ms |   1
  41 ms |   1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `647.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `35.69`
- `part` = `1.00`
- `fps_harmonic_avg` = `796.42`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `57.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `50.53`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `14.00`
- `entity_count_delta` = `-13.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 25008 ms  |  Sample ticks: 400

**FPS**  avg `1900.83`, min `25.34`, p50 `2023.71`, p95 `2830.34`, p99 `2972.10`, 1%low `52.65`, 0.1%low `39.67`, std `715.63`

**Frame time (ms)**  avg `1.21`, p50 `0.49`, p95 `3.28`, p99 `16.78`, p99.9 `21.55`, max `39.46`

**Client tick (ms)**  avg `0.37`, p95 `0.51`, max `1.21`

**Memory**  start `3072 MB`, end `4293 MB`, peak `4531 MB`, GC `19 events / 198 ms`

**FPS over sampling window (ASCII):**

```
2497.9 |       █                                                                        
2396.5 |   █   █     █                                                                  
2295.1 | ███  ████  ███    █  █                                                         
2193.7 | ███  ████  ███   ██  █ █  █ █                                                  
2092.4 |████ ███████████  ██ ██ ██ █████                                                
1991.0 |█████████████████ ███████████████  ██                                           
1889.6 |██████████████████████████████████████ █        ██ █         █                  
1788.2 |██████████████████████████████████████ █   ███████ █   █  █  ██     █           
1686.8 |████████████████████████████████████████ ████████████ ██ ███ ███ ████████ █     
1585.4 |████████████████████████████████████████████████████████████ ████████████ ███ █ 
1484.0 |████████████████████████████████████████████████████████████ ███████████████████
1382.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14642
   1 ms | ██  909
   2 ms |   126
   3 ms |   145
   4 ms |   51
   5 ms |   32
   6 ms |   16
   7 ms |   2
   8 ms |   4
   9 ms |   4
  11 ms |   1
  12 ms |   15
  13 ms |   80
  14 ms |   89
  15 ms |   171
  16 ms |   108
  17 ms |   62
  18 ms |   33
  19 ms |   22
  20 ms |   12
  21 ms |   7
  22 ms |   3
  23 ms |   3
  24 ms |   3
  25 ms |   2
  26 ms |   1
  28 ms |   1
  29 ms |   1
  39 ms |   1
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `1953.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `39.67`
- `part` = `1.00`
- `fps_harmonic_avg` = `827.18`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `52.65`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `39.00`
- `entity_count_delta` = `-36.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1868.73`, min `19.83`, p50 `2009.07`, p95 `2763.12`, p99 `2906.33`, 1%low `52.21`, 0.1%low `36.52`, std `708.22`

**Frame time (ms)**  avg `1.22`, p50 `0.50`, p95 `3.34`, p99 `16.69`, p99.9 `22.23`, max `50.42`

**Client tick (ms)**  avg `0.36`, p95 `0.61`, max `2.32`

**Memory**  start `2894 MB`, end `4688 MB`, peak `4689 MB`, GC `22 events / 216 ms`

**FPS over sampling window (ASCII):**

```
2368.2 |  █              █                                                              
2277.1 |  █ █   █       ██                                                              
2186.1 |  █ ██ ██ █   █ ██   █       ██                                                 
2095.0 | █████ █████ ██ ██   ███     ██     ██  █                                       
2003.9 | ██████████████ ███  ███   ████     ██  ███      █                              
1912.9 | ██████████████████ ████  █████     ██ █████     █     ██                       
1821.8 |████████████████████████  ████████  █████████  ████ ██ ██ █  █                 █
1730.8 |████████████████████████  ███████████████████  ████ █████ ██ ██               ██
1639.7 |████████████████████████  ███████████████████ █████ ███████████   █  █ █ ██   ██
1548.6 |███████████████████████████████████████████████████████████████  ███ ██████   ██
1457.6 |███████████████████████████████████████████████████████████████  ███ ███████████
1366.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  14409
   1 ms | ███  978
   2 ms |   155
   3 ms |   123
   4 ms |   90
   5 ms |   31
   6 ms |   7
   7 ms |   3
   8 ms |   4
  11 ms |   1
  12 ms |   23
  13 ms |   74
  14 ms |   115
  15 ms |   163
  16 ms |   96
  17 ms |   52
  18 ms |   32
  19 ms |   15
  20 ms |   12
  21 ms |   8
  22 ms |   6
  23 ms |   3
  24 ms |   1
  25 ms |   1
  26 ms |   1
  27 ms |   2
  30 ms |   2
  35 ms |   1
  50 ms |   1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `42.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `36.52`
- `part` = `1.00`
- `fps_harmonic_avg` = `820.50`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `52.21`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24902 ms  |  Sample ticks: 400

**FPS**  avg `1700.86`, min `26.87`, p50 `1784.82`, p95 `2678.01`, p99 `2895.10`, 1%low `49.81`, 0.1%low `37.03`, std `695.23`

**Frame time (ms)**  avg `1.37`, p50 `0.56`, p95 `4.04`, p99 `17.05`, p99.9 `24.79`, max `37.21`

**Client tick (ms)**  avg `0.37`, p95 `0.55`, max `4.45`

**Memory**  start `3108 MB`, end `3335 MB`, peak `4921 MB`, GC `21 events / 238 ms`

**FPS over sampling window (ASCII):**

```
2395.2 | █  ██ █                                                                        
2284.0 | ██ ████                                                                        
2172.8 | ████████     █                                                                 
2061.7 |█████████ █  ██                                                                 
1950.5 |████████████ ██ ██         █                                                    
1839.4 |████████████ █████     █  ████ █                                                
1728.2 |███████████████████  ████████████ ██    █    █ █    █              █            
1617.1 |███████████████████ █████████████████████   ██ ██ ███           █  █          █ 
1505.9 |█████████████████████████████████████████  ███ ██ █████ ██ █    █ ████   ████ █ 
1394.8 |███████████████████████████████████████████████████████ ████  █████████  ██████ 
1283.6 |████████████████████████████████████████████████████████████ ██████████  ███████
1172.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12402
   1 ms | ████  1190
   2 ms | █  190
   3 ms |   116
   4 ms |   76
   5 ms |   32
   6 ms |   13
   7 ms |   7
   8 ms |   2
   9 ms |   1
  12 ms |   11
  13 ms |   71
  14 ms |   81
  15 ms | █  159
  16 ms |   133
  17 ms |   50
  18 ms |   28
  19 ms |   20
  20 ms |   13
  21 ms |   8
  22 ms |   7
  23 ms |   6
  24 ms |   5
  25 ms |   8
  26 ms |   2
  27 ms |   1
  29 ms |   1
  30 ms |   1
  37 ms |   1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `1846.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `37.03`
- `part` = `1.00`
- `fps_harmonic_avg` = `731.75`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.81`
- `surface_water_ratio` = `0.10`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-4.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `1672.82`, min `23.90`, p50 `1762.83`, p95 `2610.16`, p99 `2808.19`, 1%low `48.20`, 0.1%low `33.63`, std `667.45`

**Frame time (ms)**  avg `1.39`, p50 `0.57`, p95 `4.04`, p99 `17.72`, p99.9 `24.41`, max `41.84`

**Client tick (ms)**  avg `0.46`, p95 `0.67`, max `9.11`

**Memory**  start `5084 MB`, end `4952 MB`, peak `5259 MB`, GC `19 events / 241 ms`

**FPS over sampling window (ASCII):**

```
2228.3 |       █                                                                        
2136.6 |      ██                                                                        
2044.9 |   ██ ██    █                                                                   
1953.1 |   ███████  ██                                                            █     
1861.4 |   ████████ ██ █  █                                           █ ██        █ ██ █
1769.7 |  ███████████████ ███                                █  █  █  ████    ███ █ ████
1678.0 | ████████████████ █████                          █  █████ ██ ██████   ██████████
1586.3 | ████████████████████████    █      ██   █ ██   ██  ███████████████   ██████████
1494.5 | ████████████████████████  ███ █   ████ █████  █████████████████████ ███████████
1402.8 | █████████████████████████ ███████ ███████████ █████████████████████ ███████████
1311.1 |██████████████████████████ █████████████████████████████████████████ ███████████
1219.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12150
   1 ms | ████  1222
   2 ms | █  182
   3 ms |   112
   4 ms |   83
   5 ms |   25
   6 ms |   8
   7 ms |   2
  12 ms |   9
  13 ms |   61
  14 ms |   88
  15 ms |   139
  16 ms |   116
  17 ms |   64
  18 ms |   46
  19 ms |   21
  20 ms |   22
  21 ms |   9
  22 ms |   7
  23 ms |   8
  24 ms |   5
  25 ms |   4
  26 ms |   2
  27 ms |   2
  34 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `63.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `33.63`
- `part` = `1.00`
- `fps_harmonic_avg` = `719.35`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `48.20`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `21.00`
- `entity_count_delta` = `-20.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23702 ms  |  Sample ticks: 400

**FPS**  avg `1994.94`, min `6.18`, p50 `2134.72`, p95 `2843.15`, p99 `2984.38`, 1%low `49.22`, 0.1%low `26.22`, std `702.32`

**Frame time (ms)**  avg `1.15`, p50 `0.47`, p95 `2.59`, p99 `16.63`, p99.9 `22.24`, max `161.88`

**Client tick (ms)**  avg `0.31`, p95 `0.41`, max `7.54`

**Memory**  start `5311 MB`, end `3935 MB`, peak `5335 MB`, GC `19 events / 221 ms`

**FPS over sampling window (ASCII):**

```
2520.9 |     █                                                                          
2411.6 |     █  █ █                                                                     
2302.4 |     ██ █ ████  █ █                                                             
2193.2 | █████████████ █████  ██ █  █   ███                                             
2084.0 |████████████████████ █████ ██   ████  ██       █   █     █   █                  
1974.8 |████████████████████ █████ ██   ████████ █    ████ █    ██   █      █         █ 
1865.6 |█████████████████████████████  ███████████   ███████  █ ██   █  ██████     █████
1756.4 |█████████████████████████████ ██████████████ ████████ ████████████████ █  ██████
1647.2 |█████████████████████████████████████████████████████ ███████████████████ ██████
1538.0 |█████████████████████████████████████████████████████ ███████████████████ ██████
1428.7 |█████████████████████████████████████████████████████████████████████████ ██████
1319.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15679
   1 ms | ██  714
   2 ms |   121
   3 ms |   117
   4 ms |   58
   5 ms |   22
   6 ms |   8
   7 ms |   7
   8 ms |   2
  11 ms |   1
  12 ms |   22
  13 ms |   77
  14 ms |   77
  15 ms |   175
  16 ms |   125
  17 ms |   48
  18 ms |   24
  19 ms |   19
  20 ms |   14
  21 ms |   11
  22 ms |   10
  23 ms |   1
  24 ms |   2
  25 ms |   1
  26 ms |   2
  41 ms |   1
  48 ms |   1
  52 ms |   1
  58 ms |   1
 161 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `634.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `26.22`
- `part` = `1.00`
- `fps_harmonic_avg` = `867.10`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `57.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.22`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `1677.20`, min `28.02`, p50 `1743.69`, p95 `2642.75`, p99 `2834.46`, 1%low `49.22`, 0.1%low `35.66`, std `671.38`

**Frame time (ms)**  avg `1.38`, p50 `0.57`, p95 `4.19`, p99 `17.37`, p99.9 `25.00`, max `35.69`

**Client tick (ms)**  avg `0.35`, p95 `0.56`, max `1.38`

**Memory**  start `3294 MB`, end `3871 MB`, peak `5495 MB`, GC `20 events / 222 ms`

**FPS over sampling window (ASCII):**

```
2252.2 |  █   █                                                                         
2164.2 |  █ █ █            █                                                            
2076.3 |  █████     █ █   ███ █                                                         
1988.3 |████████    █ █   ███ ██       █                                                
1900.4 |████████ █  █████ ███ ██ █    ██ █                                              
1812.4 |████████ ██ █████████ █████   ████       █                                      
1724.4 |███████████████████████████   ████  █    ██                                     
1636.5 |███████████████████████████  ██████ █ █ ████                                    
1548.5 |███████████████████████████  ██████ ██████████  ██  █ █  █ ███  ██       █ █    
1460.6 |██████████████████████████████████████████████ ███  █ █████████ ██   █ █ █ ██ █ 
1372.6 |███████████████████████████████████████████████████████████████████ ██ █████████
1284.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12363
   1 ms | ███  1024
   2 ms | █  179
   3 ms |   150
   4 ms |   80
   5 ms |   33
   6 ms |   14
   7 ms |   8
   8 ms |   2
   9 ms |   2
  10 ms |   2
  12 ms |   7
  13 ms |   79
  14 ms |   88
  15 ms |   137
  16 ms |   111
  17 ms |   72
  18 ms |   29
  19 ms |   27
  20 ms |   7
  21 ms |   11
  22 ms |   9
  23 ms |   6
  24 ms |   3
  25 ms |   6
  26 ms |   2
  27 ms |   3
  30 ms |   1
  31 ms |   2
  35 ms |   1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `51.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `35.66`
- `part` = `1.00`
- `fps_harmonic_avg` = `722.86`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `49.22`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `12.00`
- `entity_count_delta` = `-11.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `1959.01`, min `19.89`, p50 `2127.36`, p95 `2792.04`, p99 `2925.83`, 1%low `51.44`, 0.1%low `35.50`, std `696.67`

**Frame time (ms)**  avg `1.15`, p50 `0.47`, p95 `2.82`, p99 `16.79`, p99.9 `22.44`, max `50.27`

**Client tick (ms)**  avg `0.31`, p95 `0.47`, max `0.75`

**Memory**  start `5108 MB`, end `5214 MB`, peak `5824 MB`, GC `18 events / 206 ms`

**FPS over sampling window (ASCII):**

```
2392.1 |█          █                                                                    
2309.8 |██    █  █ █    █                                                               
2227.4 |██   █████ ███  ███       █                  █                                  
2145.0 |███  █████ ███  ███     █ █             █    █                                  
2062.6 |███  █████████ ████ ███ ███        █    ██   █     █             █              
1980.2 |███████████████████ █████████      ██ █ ████ █     █ █ █    █    ██             
1897.9 |███████████████████ ██████████     ██ ████████    ██ ████   ████ ██ █    █     █
1815.5 |███████████████████ ████████████   ██████████████████████  ████████ ██   █    ██
1733.1 |███████████████████ ████████████ ████████████████████████ █████████████ ███   ██
1650.7 |████████████████████████████████ ████████████████████████ █████████████████  ███
1568.3 |███████████████████████████████████████████████████████████████████████████ ████
1486.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  15601
   1 ms | ██  756
   2 ms |   113
   3 ms |   124
   4 ms |   76
   5 ms |   25
   6 ms |   10
   7 ms |   4
   9 ms |   4
  12 ms |   15
  13 ms |   65
  14 ms |   89
  15 ms |   159
  16 ms |   121
  17 ms |   55
  18 ms |   30
  19 ms |   27
  20 ms |   14
  21 ms |   6
  22 ms |   7
  23 ms |   4
  24 ms |   1
  25 ms |   2
  27 ms |   2
  29 ms |   3
  31 ms |   1
  39 ms |   1
  50 ms |   1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `preload_duration_ms` = `66.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `35.50`
- `part` = `1.00`
- `fps_harmonic_avg` = `866.12`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `51.44`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `3.00`
- `entity_count_delta` = `14.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `17.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `1419.29`, min `18.10`, p50 `1533.40`, p95 `2152.44`, p99 `2876.86`, 1%low `36.24`, 0.1%low `21.36`, std `564.66`

**Frame time (ms)**  avg `1.67`, p50 `0.65`, p95 `5.17`, p99 `23.08`, p99.9 `38.94`, max `55.25`

**Client tick (ms)**  avg `0.43`, p95 `0.98`, max `4.14`

**Memory**  start `4608 MB`, end `4783 MB`, peak `5844 MB`, GC `31 events / 533 ms`

**FPS over sampling window (ASCII):**

```
1988.5 |                █                                                               
1906.3 |               ██                     █                                         
1824.1 |     █         ██                    ██                                         
1741.9 |█    █         ██  █        █        ██                                         
1659.7 |█    █         ██  █        █        ██                                         
1577.5 |█ ██ █      █  ██  █ █   █  ██      ███                █                        
1495.3 |███████     █ ███  █ █ ████ ██      ███   ██     █     █ █                  █   
1413.1 |████████  █ █ ███ ██ ██████ ██  █ █████ ████    ██ █   ███           █     ███  
1330.9 |███████████████████████████ █████ ██████████ █ █████   ████   █ ████ █    █████ 
1248.7 |███████████████████████████ █████████████████████████  ████ █ █ ██████ ██ ██████
1166.4 |███████████████████████████ █████████████████████████ █████ ████████████████████
1084.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9707
   1 ms | █████  1181
   2 ms | █  260
   3 ms |   111
   4 ms |   97
   5 ms |   83
   6 ms |   32
   7 ms |   23
   8 ms |   9
   9 ms |   5
  10 ms |   5
  11 ms |   1
  12 ms |   3
  13 ms |   4
  14 ms |   3
  15 ms |   11
  16 ms |   19
  17 ms |   40
  18 ms |   52
  19 ms |   43
  20 ms |   61
  21 ms |   52
  22 ms |   39
  23 ms |   49
  24 ms |   21
  25 ms |   15
  26 ms |   9
  27 ms |   3
  28 ms |   2
  29 ms |   2
  30 ms |   2
  31 ms |   1
  33 ms |   3
  34 ms |   1
  37 ms |   2
  38 ms |   1
  42 ms |   1
  43 ms |   3
  44 ms |   1
  46 ms |   2
  47 ms |   1
  48 ms |   1
  49 ms |   1
  50 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `36.24`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `598.46`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `21.36`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `68.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `124.18`, min `15.51`, p50 `149.43`, p95 `201.62`, p99 `224.30`, 1%low `18.82`, 0.1%low `16.71`, std `64.25`

**Frame time (ms)**  avg `13.02`, p50 `6.69`, p95 `35.15`, p99 `49.33`, p99.9 `54.93`, max `64.46`

**Client tick (ms)**  avg `7.53`, p95 `16.61`, max `40.98`

**Memory**  start `5587 MB`, end `3916 MB`, peak `5833 MB`, GC `35 events / 513 ms`

**FPS over sampling window (ASCII):**

```
156.9 |  █                                                       █                     
150.0 |  █ █ █                                               █   █ █  █        █       
143.1 |  █ ████                █     █ █              █     ██   █ █  █        █       
136.2 | ██ ████               ██  █ ██ █  █  ██ █    ███    ██   ███ ██ █   █ ██  █    
129.4 | ██ ████               ██  █ █████ █  ████    ███    ███  ███ ██ █   ████ ██ █ █
122.5 | ██ ████  █        █  ███  ███████ ███████   ████   █████ ██████ █   ████ ████ █
115.6 | ██ ████ ██ █      ██ ███ ████████ ██████████████   ████████████ █  ██████████ █
108.7 | ███████ ██ █   █████ ███ ██████████████████████████████████████ █ ███████████ █
101.8 | █████████████ ██████ ██████████████████████████████████████████ █ █████████████
 95.0 |██████████████ ██████ ██████████████████████████████████████████████████████████
 88.1 |██████████████ ██████ ██████████████████████████████████████████████████████████
 81.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
   4 ms | ███████  91
   5 ms | ████████████████████████████████████████  519
   6 ms | ██████████████  181
   7 ms | █████  68
   8 ms | ███  37
   9 ms | ████  49
  10 ms | ████  58
  11 ms | ██  28
  12 ms | ██  20
  13 ms | █  8
  14 ms | █  11
  15 ms |   6
  16 ms |   5
  17 ms | █  13
  18 ms | █  17
  19 ms | ███  34
  20 ms | ██  32
  21 ms | ██  29
  22 ms | ██  32
  23 ms | ██  28
  24 ms | ███  40
  25 ms | ██  23
  26 ms | █  16
  27 ms | ██  31
  28 ms | ██  23
  29 ms | █  15
  30 ms | █  14
  31 ms | █  8
  32 ms |   6
  33 ms | █  7
  34 ms | █  8
  35 ms |   5
  36 ms |   6
  38 ms |   3
  39 ms |   5
  40 ms |   4
  41 ms | █  7
  42 ms |   2
  43 ms |   6
  44 ms |   4
  45 ms |   6
  46 ms |   6
  47 ms |   2
  48 ms |   2
  49 ms | █  8
  50 ms |   2
  51 ms |   1
  52 ms |   1
  53 ms |   4
  54 ms |   2
  55 ms |   1
  64 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `16.71`
- `fps_1pct_low` = `18.82`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `49.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `76.80`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `1255.72`, min `16.88`, p50 `1390.45`, p95 `1785.28`, p99 `1936.28`, 1%low `35.63`, 0.1%low `21.50`, std `472.46`

**Frame time (ms)**  avg `1.91`, p50 `0.72`, p95 `6.22`, p99 `24.22`, p99.9 `34.28`, max `59.22`

**Client tick (ms)**  avg `0.46`, p95 `0.94`, max `4.35`

**Memory**  start `4993 MB`, end `3735 MB`, peak `5786 MB`, GC `37 events / 556 ms`

**FPS over sampling window (ASCII):**

```
1547.4 |                     █                                                          
1499.8 |                     █                                                          
1452.2 |              █      █                          █                               
1404.7 |      █    █ ██   █  █              █      █    █                               
1357.1 |█     ██  ██ ██   █  █   █ █   ██   █      █    █       █                       
1309.5 |█     ██████ ██  █████   ████  ██   █      █ ██ █  █    █         █       █ █   
1261.9 |█     ██████ ██████████  ████ ███   ██   █ ████ █  █    ██ █      █     █████  █
1214.3 |█   ████████ ██████████ █████████  █████ ██████ █████  ███ █   █████ █ ██████  █
1166.7 |███ ███████████████████ █████████  ██████████████████  █████  ██████ █ █████████
1119.1 |███ █████████████████████████████  ██████████████████ ██████ █████████ █████████
1071.5 |█████████████████████████████████  █████████████████████████████████████████████
1024.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8060
   1 ms | ███████  1374
   2 ms | █  255
   3 ms |   79
   4 ms |   79
   5 ms |   90
   6 ms |   55
   7 ms |   13
   8 ms |   5
   9 ms |   1
  10 ms |   1
  12 ms |   3
  15 ms |   1
  16 ms |   15
  17 ms |   25
  18 ms |   50
  19 ms |   57
  20 ms |   49
  21 ms |   49
  22 ms |   59
  23 ms |   49
  24 ms |   35
  25 ms |   30
  26 ms |   13
  27 ms |   8
  28 ms |   4
  29 ms |   1
  30 ms |   2
  31 ms |   2
  33 ms |   2
  34 ms |   1
  38 ms |   1
  40 ms |   2
  42 ms |   2
  48 ms |   1
  49 ms |   2
  52 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `61.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `21.50`
- `part` = `1.00`
- `fps_harmonic_avg` = `523.62`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3177.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `35.63`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `1375.60`, min `20.45`, p50 `1520.94`, p95 `1875.63`, p99 `2119.94`, 1%low `37.64`, 0.1%low `22.90`, std `472.97`

**Frame time (ms)**  avg `1.67`, p50 `0.66`, p95 `5.06`, p99 `22.48`, p99.9 `37.95`, max `48.91`

**Client tick (ms)**  avg `0.43`, p95 `0.67`, max `2.74`

**Memory**  start `4578 MB`, end `4846 MB`, peak `5815 MB`, GC `42 events / 550 ms`

**FPS over sampling window (ASCII):**

```
1530.0 |             █                       ██                                         
1488.4 |█            ██ █                    ██                                        █
1446.7 |█  ██        ████          █      █ ███     ████ █      █    █      █ ███   █  █
1405.0 |█ ███     █ █████   █  █████      ██████    ██████      █ ██ █     ██████ █ █  █
1363.4 |███████  ██ █████   █  ██████    ███████   ███████   █ ██ ████    █████████ ██ █
1321.7 |██████████████████  ██ ████████ ████████   █████████ █████████    ██████████████
1280.1 |████████████████████████████████████████ █ █████████ █████████  █ ██████████████
1238.4 |████████████████████████████████████████ ██████████████████████ █ ██████████████
1196.7 |█████████████████████████████████████████████████████████████████ ██████████████
1155.1 |█████████████████████████████████████████████████████████████████ ██████████████
1113.4 |█████████████████████████████████████████████████████████████████ ██████████████
1071.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9930
   1 ms | █████  1136
   2 ms | █  167
   3 ms |   85
   4 ms |   80
   5 ms |   77
   6 ms |   39
   7 ms |   10
   8 ms |   5
   9 ms |   2
  13 ms |   1
  14 ms |   1
  15 ms |   12
  16 ms |   21
  17 ms |   35
  18 ms |   50
  19 ms |   73
  20 ms |   56
  21 ms |   78
  22 ms |   49
  23 ms |   31
  24 ms |   27
  25 ms |   8
  26 ms |   4
  27 ms |   3
  28 ms |   2
  30 ms |   5
  32 ms |   1
  33 ms |   1
  37 ms |   1
  38 ms |   1
  40 ms |   2
  41 ms |   1
  42 ms |   1
  43 ms |   3
  44 ms |   1
  47 ms |   1
  48 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `37.64`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `53.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `22.90`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `600.48`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `1190.89`, min `18.62`, p50 `1320.61`, p95 `1635.47`, p99 `1850.19`, 1%low `37.06`, 0.1%low `23.60`, std `424.45`

**Frame time (ms)**  avg `1.91`, p50 `0.76`, p95 `6.08`, p99 `23.31`, p99.9 `32.25`, max `53.71`

**Client tick (ms)**  avg `0.46`, p95 `0.95`, max `6.54`

**Memory**  start `4605 MB`, end `5068 MB`, peak `5886 MB`, GC `38 events / 537 ms`

**FPS over sampling window (ASCII):**

```
1371.1 |                             █                                                  
1339.7 |             █         █     █   █                                              
1308.3 |█    █      ██         █     █   █                                              
1277.0 |█    ██     ██         ██   ███  █      █         █  ██                 █ █     
1245.6 |█    ██  █  ████    █  ██   ███  █  █ █ ██        █ ███               █ █ █     
1214.2 |█ █ ███  ██ █████   █  ██   ███  █ ██ █ ██        █ ███    ███        █ █ █   █ 
1182.9 |█ █████  ██ █████ █ █  ██ █ ███  █ ██ █ ██ █     ██ ███    ████ ██    ███ ██  █ 
1151.5 |███████ █████████ █ ██ ██ ███████████ █ ██ █   █ ███████   █████████  ███ ███ █ 
1120.1 |███████ ██████████████ ██████████████ ██████ █ █████████  ██████████ ████████ █ 
1088.8 |██████████████████████ ██████████████ ██████████████████████████████████████████
1057.4 |██████████████████████ ██████████████ ██████████████████████████████████████████
1026.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8029
   1 ms | ███████  1481
   2 ms | █  215
   3 ms |   69
   4 ms |   91
   5 ms |   71
   6 ms |   42
   7 ms |   5
   8 ms |   4
   9 ms |   3
  11 ms |   1
  14 ms |   1
  15 ms |   11
  16 ms |   12
  17 ms |   42
  18 ms |   59
  19 ms |   55
  20 ms |   61
  21 ms |   57
  22 ms |   61
  23 ms |   44
  24 ms |   17
  25 ms |   20
  26 ms |   9
  27 ms |   7
  28 ms |   2
  29 ms |   3
  30 ms |   1
  31 ms |   1
  32 ms |   2
  33 ms |   1
  34 ms |   1
  37 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
  43 ms |   1
  49 ms |   1
  50 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `37.06`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `42.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `23.60`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `524.08`
- `restocks` = `20.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `1047.27`, min `20.24`, p50 `1155.20`, p95 `1445.17`, p99 `1686.25`, 1%low `38.01`, 0.1%low `23.82`, std `378.35`

**Frame time (ms)**  avg `2.13`, p50 `0.87`, p95 `16.62`, p99 `22.98`, p99.9 `30.20`, max `49.42`

**Client tick (ms)**  avg `0.52`, p95 `0.63`, max `18.97`

**Memory**  start `5333 MB`, end `5430 MB`, peak `5922 MB`, GC `42 events / 543 ms`

**FPS over sampling window (ASCII):**

```
1213.7 | █                                                       █                    █ 
1179.7 | █                                                     ███            █       █ 
1145.6 | █       █  █       █   ██                     █   █   █████          ██      █ 
1111.5 | █  █    █  █ █    ██   ██                 █   █   █   ███████        ██      █ 
1077.4 | █  █   ███ ███    ███  ██           █     █  ██   █   ███████       ███      ██
1043.3 | ██ █   ████████   ███████   █    █  ██    █  ██████   ███████    █  ████ █   ██
1009.2 | ████   █████████ ██████████ █  █ █████ ██ █████████ ██████████   █ ███████   ██
975.1 |██████  ███████████████████████████████ ██ ████████████████████   █ ████████████
941.0 |██████  ███████████████████████████████ ██ ████████████████████████ ████████████
906.9 |██████ ████████████████████████████████ ██ █████████████████████████████████████
872.9 |███████████████████████████████████████ ████████████████████████████████████████
838.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  6499
   1 ms | ████████████  1885
   2 ms | ██  257
   3 ms |   77
   4 ms | █  82
   5 ms |   75
   6 ms |   31
   7 ms |   9
   8 ms |   7
   9 ms |   1
  10 ms |   1
  14 ms |   1
  15 ms |   7
  16 ms |   21
  17 ms |   42
  18 ms |   60
  19 ms |   79
  20 ms |   66
  21 ms |   69
  22 ms |   53
  23 ms |   35
  24 ms |   20
  25 ms |   17
  26 ms |   3
  27 ms |   3
  28 ms |   3
  29 ms |   1
  30 ms |   1
  31 ms |   1
  33 ms |   1
  35 ms |   1
  42 ms |   1
  43 ms |   1
  45 ms |   1
  47 ms |   1
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `55.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `23.82`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `470.56`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `38.01`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195493 ms  |  Sample ticks: 3600

**FPS**  avg `205.01`, min `0.64`, p50 `206.60`, p95 `428.40`, p99 `569.58`, 1%low `17.62`, 0.1%low `6.82`, std `126.13`

**Frame time (ms)**  avg `8.92`, p50 `4.84`, p95 `25.48`, p99 `40.53`, p99.9 `55.88`, max `1572.45`

**Client tick (ms)**  avg `1.05`, p95 `2.11`, max `47.67`

**Memory**  start `4059 MB`, end `6077 MB`, peak `6495 MB`, GC `200 events / 2565 ms`

**FPS over sampling window (ASCII):**

```
286.0 |                                                █   █        ███ ███ ██         
267.6 |█████                               █           █  ██     ██████ ██████         
249.2 |█████                               █    ██    ███ ███    ██████ ████████ █    █
230.8 |█████        █                     ███   ██    ███ ███ ██ ██████████████████████
212.5 |█████        █                     ███   ███   ███████ █████████████████████████
194.1 |█████       ██                    ████   ███   █████████████████████████████████
175.7 |█████       ██                 █ █████ █ █████ █████████████████████████████████
157.3 |█████ ██    ███   ██         █ █ █████ ███████ █████████████████████████████████
138.9 |█████████  █████  ███    █ ███████████ █████████████████████████████████████████
120.6 |█████████████████████    █ █████████████████████████████████████████████████████
102.2 |████████████████████████ █ █████████████████████████████████████████████████████
 83.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████  442
   2 ms | █████████████████  2079
   3 ms | ████████████████████████████████████████  4916
   4 ms | █████████████████████████  3127
   5 ms | ██████████████  1688
   6 ms | ████████  974
   7 ms | ███████  806
   8 ms | ██████  714
   9 ms | ███  364
  10 ms | ██  212
  11 ms | █  128
  12 ms | █  85
  13 ms | █  62
  14 ms | █  103
  15 ms | ██  306
  16 ms | ██  285
  17 ms | ████  525
  18 ms | ████  552
  19 ms | ████  500
  20 ms | ████  449
  21 ms | ██  305
  22 ms | ██  189
  23 ms | ██  193
  24 ms | ██  189
  25 ms | █  175
  26 ms | █  149
  27 ms | █  118
  28 ms | █  87
  29 ms | █  69
  30 ms |   41
  31 ms |   28
  32 ms |   35
  33 ms |   33
  34 ms |   37
  35 ms |   35
  36 ms |   33
  37 ms |   15
  38 ms |   20
  39 ms |   11
  40 ms |   16
  41 ms |   9
  42 ms |   16
  43 ms |   16
  44 ms |   11
  45 ms |   26
  46 ms |   20
  47 ms |   14
  48 ms |   14
  49 ms |   15
  50 ms |   7
  51 ms |   9
  52 ms |   9
  53 ms |   3
  54 ms |   4
  55 ms |   5
  56 ms |   2
  57 ms |   1
  58 ms |   2
  59 ms |   1
  60 ms |   2
  62 ms |   2
  63 ms |   2
  67 ms |   1
  68 ms |   1
  71 ms |   1
  76 ms |   1
  81 ms |   1
 113 ms |   1
 159 ms |   1
1572 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `entity_count_delta` = `88.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `17.62`
- `fps_harmonic_avg` = `112.06`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `137.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `6.82`
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

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194856 ms  |  Sample ticks: 3600

**FPS**  avg `225.64`, min `22.77`, p50 `231.33`, p95 `471.87`, p99 `627.88`, 1%low `27.81`, 0.1%low `25.73`, std `131.66`

**Frame time (ms)**  avg `7.65`, p50 `4.32`, p95 `21.01`, p99 `32.99`, p99.9 `37.80`, max `43.93`

**Client tick (ms)**  avg `0.68`, p95 `0.89`, max `11.62`

**Memory**  start `5365 MB`, end `4256 MB`, peak `6419 MB`, GC `34 events / 229 ms`

**FPS over sampling window (ASCII):**

```
289.6 |                                        █           █████  █          █         
277.2 |                                      ███          ███████████████  ████        
264.9 |█                                     ███   ███    ███████████████  █████       
252.5 |█                                    ████   ████   ██████████████████████       
240.1 |█                                 ███████   ████   █████████████████████████ █  
227.8 |█           █                ████████████   ████   █████████████████████████████
215.4 |█   ██      █                ████████████   ████  ██████████████████████████████
203.0 |█   ██     ███               ████████████   █████ ██████████████████████████████
190.7 |█   ██     ███               █████████████  █████ ██████████████████████████████
178.3 |█   ██     ███   ██    ██   ██████████████ █████████████████████████████████████
165.9 |█   ████ ██████ █████ ██████████████████████████████████████████████████████████
153.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██████  919
   2 ms | ████████████████  2499
   3 ms | ████████████████████████████████████████  6409
   4 ms | ████████████████████████████  4491
   5 ms | ██████████████  2312
   6 ms | ██████  1001
   7 ms | ██  371
   8 ms | █  145
   9 ms |   57
  10 ms |   11
  12 ms |   4
  14 ms |   70
  15 ms | ██  336
  16 ms | ███  405
  17 ms | █████  846
  18 ms | █████  784
  19 ms | █████  864
  20 ms | █████  829
  21 ms | ███  521
  22 ms | █  232
  23 ms | █  105
  24 ms |   45
  25 ms |   16
  26 ms |   10
  27 ms |   1
  31 ms |   3
  32 ms |   16
  33 ms |   22
  34 ms |   35
  35 ms |   67
  36 ms |   61
  37 ms |   28
  38 ms |   17
  40 ms |   2
  41 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `entity_count_delta` = `18.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `27.81`
- `fps_harmonic_avg` = `130.75`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `137.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `25.73`
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

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194078 ms  |  Sample ticks: 3600

**FPS**  avg `118.57`, min `9.74`, p50 `108.19`, p95 `299.58`, p99 `400.04`, 1%low `21.32`, 0.1%low `17.05`, std `87.94`

**Frame time (ms)**  avg `14.74`, p50 `9.24`, p95 `41.54`, p99 `44.74`, p99.9 `47.60`, max `102.67`

**Client tick (ms)**  avg `0.69`, p95 `0.90`, max `1.51`

**Memory**  start `6047 MB`, end `4450 MB`, peak `6420 MB`, GC `29 events / 225 ms`

**FPS over sampling window (ASCII):**

```
160.5 |                                                              █  █              
154.8 |                                                              █ ███             
149.0 |                                                             ██ ███             
143.2 |                                                          █ █████████           
137.4 |                                                          ████████████       ██ 
131.6 |                                                         █████████████████   ███
125.9 |                                          █     █     ██████████████████████████
120.1 |█            █ █                 █        █    ███   ███████████████████████████
114.3 |█ ███ ██  █  ███                ███ █    ███  ████   ███████████████████████████
108.5 |█████████ █  ███   ██     █     ████████████  ████ █████████████████████████████
102.7 |███████████████████████████████ ████████████  ██████████████████████████████████
 97.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   12
   2 ms | █████████  335
   3 ms | ██████████████████████████  947
   4 ms | ██████████████████  659
   5 ms | ██████████████  489
   6 ms | ███████████████████  699
   7 ms | █████████████████████████████████  1195
   8 ms | ████████████████████████████████████████  1437
   9 ms | ████████████████████████████████  1150
  10 ms | ████████████████  579
  11 ms | ████  132
  12 ms | █  19
  13 ms |   2
  16 ms |   3
  17 ms |   11
  18 ms | ███  103
  19 ms | ███████████  393
  20 ms | ████████████████  565
  21 ms | █████████████  462
  22 ms | ███████  257
  23 ms | ██████  199
  24 ms | ████  158
  25 ms | █████  185
  26 ms | ████████  273
  27 ms | ██████████  376
  28 ms | █████████  313
  29 ms | ██████  198
  30 ms | ███  95
  31 ms | █  39
  32 ms |   7
  33 ms |   4
  34 ms | █  22
  35 ms | █  39
  36 ms | ██  58
  37 ms | █  28
  38 ms | █  22
  39 ms | █  26
  40 ms | ██  57
  41 ms | ███  119
  42 ms | █████  167
  43 ms | █████  175
  44 ms | ███  102
  45 ms | ██  58
  46 ms | █  27
  47 ms |   4
  48 ms |   2
  49 ms |   3
  50 ms |   1
  58 ms |   2
  61 ms |   1
  62 ms |   1
  63 ms |   1
 102 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `21.32`
- `fps_harmonic_avg` = `67.85`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `137.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `17.05`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `70.00`
- `trees_built` = `173.00`
- `phase` = `2.00`
- `segment_count` = `19.00`
- `part` = `4.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194724 ms  |  Sample ticks: 3600

**FPS**  avg `103.00`, min `16.90`, p50 `79.12`, p95 `300.51`, p99 `400.49`, 1%low `18.53`, 0.1%low `17.65`, std `91.57`

**Frame time (ms)**  avg `18.94`, p50 `12.64`, p95 `48.76`, p99 `52.66`, p99.9 `55.70`, max `59.16`

**Client tick (ms)**  avg `0.66`, p95 `0.85`, max `1.13`

**Memory**  start `5998 MB`, end `5671 MB`, peak `6418 MB`, GC `24 events / 185 ms`

**FPS over sampling window (ASCII):**

```
153.3 |                                                                █               
146.4 |                                                               ██               
139.5 |                                                             █ ████             
132.6 |                                                           █████████   █        
125.7 |                                                          ██████████   █        
118.8 |       █                                              █  ███████████████  █     
112.0 |█      █                                              █ ████████████████  █ █ █ 
105.1 |█    ███                                 █      █   ███ ████████████████████████
 98.2 |███ █████  █ ██                  ███████ ██   ████  ████████████████████████████
 91.3 |████████████████  ███           ███████████  █████ █████████████████████████████
 84.4 |████████████████████████████  █ ████████████████████████████████████████████████
 77.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  10
   2 ms | ██████████████  253
   3 ms | ████████████████████████████████████████  722
   4 ms | ███████████████████████████  491
   5 ms | ████████████████████  361
   6 ms | ███████████████████  346
   7 ms | ████████████████  293
   8 ms | █████████████████  306
   9 ms | ███████████████████████████  481
  10 ms | █████████████████████████████████  593
  11 ms | ████████████████████████████████  581
  12 ms | █████████████████████████  453
  13 ms | █████████████  228
  14 ms | ██████  113
  15 ms | ██  30
  16 ms | █  13
  17 ms |   7
  18 ms | █  10
  19 ms | █  20
  20 ms | █████  99
  21 ms | ███████████████  270
  22 ms | ██████████████████  333
  23 ms | ██████████████████████  389
  24 ms | ████████████████████  355
  25 ms | █████████████  237
  26 ms | █████████  168
  27 ms | ███████  120
  28 ms | ████  79
  29 ms | ██████  109
  30 ms | ███████  121
  31 ms | ████████  150
  32 ms | █████████  160
  33 ms | ████████  148
  34 ms | █████████  156
  35 ms | █████  83
  36 ms | ████  67
  37 ms | ██  38
  38 ms | ██  36
  39 ms | ██  28
  40 ms | █  17
  41 ms | █  24
  42 ms | █  19
  43 ms | ███  52
  44 ms | ███  53
  45 ms | ████  71
  46 ms | ██████  109
  47 ms | ██████  116
  48 ms | ████████  143
  49 ms | ██████  115
  50 ms | ██████  105
  51 ms | █████  87
  52 ms | ████  70
  53 ms | ██  31
  54 ms | █  18
  55 ms | █  12
  56 ms |   4
  57 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `entity_count_delta` = `18.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `18.53`
- `fps_harmonic_avg` = `52.81`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `137.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `17.65`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `69.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`

