# FPS Test session — 2026-09-07T13:35:26.873583886+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Idle Baseline](#idle-baseline) | Baseline | 112.7 | 46.3 | 43.9 | 20.57 | 0.47 | 0 | 320 |
| 2 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 68.7 | 21.4 | 21.2 | 46.22 | 0.49 | 3 | 32 |
| 3 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 29.5 | 19.9 | 19.1 | 48.75 | 2.83 | 4 | 349 |
| 4 | [Cows ×200 ring](#cows-200-ring) | Entities | 28.5 | 21.2 | 20.9 | 46.72 | 0.68 | 1 | 224 |
| 5 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.6 | 21.2 | 21.1 | 46.90 | 0.67 | 1 | 416 |
| 6 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 28.8 | 20.6 | 19.6 | 47.13 | 0.66 | 1 | 524 |
| 7 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.3 | 21.3 | 21.0 | 46.54 | 0.63 | 1 | 304 |
| 8 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 28.6 | 21.3 | 20.9 | 46.67 | 0.45 | 0 | 336 |
| 9 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 28.6 | 20.9 | 20.2 | 47.21 | 0.60 | 0 | 512 |
| 10 | [Item entities ×500](#item-entities-500) | Entities | 29.0 | 21.0 | 20.5 | 46.86 | 1.00 | 3 | 756 |
| 11 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 29.3 | 20.5 | 20.3 | 48.17 | 2.84 | 2 | 166 |
| 12 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 29.3 | 19.8 | 19.3 | 49.14 | 3.53 | 8 | 537 |
| 13 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 28.7 | 21.5 | 21.4 | 46.21 | 0.87 | 1 | 490 |
| 14 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 28.5 | 21.1 | 20.7 | 46.72 | 0.42 | 1 | 520 |
| 15 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 29.3 | 20.0 | 19.3 | 49.09 | 3.19 | 4 | 152 |
| 16 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 29.0 | 20.4 | 19.9 | 48.22 | 2.61 | 2 | 380 |
| 17 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 37.3 | 15.2 | 13.8 | 62.97 | 13.65 | 25 | 391 |
| 18 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 36.7 | 15.0 | 13.8 | 63.09 | 14.22 | 25 | 431 |
| 19 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 9.9 | 8.7 | n/a | 114.37 | 1.64 | 4 | 414 |
| 20 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 9.9 | 8.9 | n/a | 112.89 | 1.62 | 2 | 476 |
| 21 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 9.9 | 8.7 | n/a | 113.18 | 0.55 | 1 | 292 |
| 22 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 9.8 | 8.8 | n/a | 112.69 | 0.27 | 0 | 116 |
| 23 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 9.9 | 8.7 | n/a | 113.83 | 0.24 | 1 | 548 |
| 24 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 9.8 | 8.6 | n/a | 113.84 | 0.28 | 1 | 264 |
| 25 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 9.8 | 8.7 | n/a | 113.40 | 0.27 | 0 | 220 |
| 26 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 9.8 | 8.6 | n/a | 112.72 | 0.26 | 0 | 144 |
| 27 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 9.8 | 8.7 | n/a | 113.15 | 0.26 | 0 | 156 |
| 28 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 9.8 | 8.7 | n/a | 114.66 | 0.26 | 0 | 160 |
| 29 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 9.8 | 8.8 | n/a | 113.36 | 0.27 | 0 | 120 |
| 30 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 9.9 | 7.7 | n/a | 121.40 | 0.37 | 44 | 745 |
| 31 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 9.9 | 8.3 | n/a | 118.30 | 0.32 | 30 | 948 |
| 32 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 9.8 | 7.7 | n/a | 124.26 | 0.32 | 24 | 421 |
| 33 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 9.9 | 7.8 | n/a | 120.47 | 0.31 | 24 | 912 |
| 34 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 9.8 | 7.8 | n/a | 124.26 | 0.33 | 21 | 1244 |
| 35 | [Forest flyby](#forest-flyby) | Chunks | 9.9 | 7.6 | n/a | 129.70 | 0.33 | 25 | 382 |
| 36 | [Savanna flyby](#savanna-flyby) | Chunks | 9.8 | 7.9 | n/a | 122.66 | 0.33 | 24 | 702 |
| 37 | [Swamp flyby](#swamp-flyby) | Chunks | 9.9 | 7.4 | n/a | 119.04 | 0.33 | 25 | 324 |
| 38 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 9.9 | 7.4 | n/a | 124.04 | 0.34 | 27 | 1300 |
| 39 | [Badlands flyby](#badlands-flyby) | Chunks | 9.9 | 7.8 | n/a | 118.79 | 0.30 | 26 | 1091 |
| 40 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 9.9 | 7.9 | n/a | 124.15 | 0.31 | 25 | 579 |
| 41 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 9.8 | 8.2 | n/a | 117.69 | 0.30 | 21 | 780 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 9.9 | 7.9 | 7.7 | 123.42 | 0.65 | 14 | 860 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 9.9 | 7.9 | 7.3 | 122.33 | 0.63 | 11 | 1020 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 9.9 | 8.3 | 7.5 | 118.09 | 0.64 | 11 | 695 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 9.9 | 8.1 | 7.5 | 119.82 | 0.64 | 11 | 685 |

## Table of contents

- [Idle Baseline](#idle-baseline)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously)
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
- [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset)
- [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide)
- [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm)
- [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators)
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
- [LowEnd Shader](#lowend-shader)
- [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures)
- [HighEnd Shader](#highend-shader)
- [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures)

## Details

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `112.73`, min `43.62`, p50 `118.09`, p95 `130.53`, p99 `138.64`, 1%low `46.31`, 0.1%low `43.85`, std `81.40`

**Frame time (ms)**  avg `10.22`, p50 `8.47`, p95 `18.27`, p99 `20.57`, p99.9 `22.55`, max `22.93`

**Client tick (ms)**  avg `0.47`, p95 `0.64`, max `0.93`

**Memory**  start `658 MB`, end `978 MB`, peak `978 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
180.1 |                                                            █                   
173.1 |                                                            █                   
166.1 |                                                            █                   
159.1 |                                     █ █         █          █                   
152.1 |                                     █ █         █          █                   
145.1 |                              █      █ █         █  █       █                   
138.1 |     █                  █     █      █ █         █  █       ██                  
131.1 |     █  █         █   █ █     █      █ █         █  █       ██                  
124.1 |   █ █  █    █    █   █ █     █      █ █         █  █       ██                  
117.1 |   █ █  █    █    █   █ █     █      █ █         █  █       ██                  
110.1 |█ ██ █  ██  ██ █  █  ██ █ █  ██ █ █  █ ██ ██ █  ██████ █   ████ █  █  █ █   █  █
103.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   6
   1 ms |   9
   6 ms |   2
   7 ms | ██████████  272
   8 ms | ████████████████████████████████████████  1096
   9 ms | █████  139
  10 ms |   1
  12 ms |   2
  13 ms | █  15
  14 ms | █  36
  15 ms | ███  93
  16 ms | ████  111
  17 ms | ██  66
  18 ms | █  39
  19 ms | █  26
  20 ms | █  26
  21 ms |   12
  22 ms |   5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `46.31`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `55.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `43.85`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `97.87`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `68.65`, min `21.19`, p50 `45.30`, p95 `132.53`, p99 `191.28`, 1%low `21.44`, 0.1%low `21.19`, std `56.95`

**Frame time (ms)**  avg `23.39`, p50 `22.08`, p95 `43.49`, p99 `46.22`, p99.9 `47.06`, max `47.19`

**Client tick (ms)**  avg `0.49`, p95 `0.72`, max `1.29`

**Memory**  start `1168 MB`, end `634 MB`, peak `1200 MB`, GC `3 events / 20 ms`

**FPS over sampling window (ASCII):**

```
190.9 |                             █                                                  
176.0 |                             █                                                  
161.2 |                             █                                                  
146.3 |            █                █                                                  
131.4 |            █                █                                                  
116.6 | █   █  █  ██   ██    █   █  █    █  █  █                                       
101.7 |█████████████████████████████████████████                                       
 86.9 |██████████████████████████████████████████                                      
 72.0 |██████████████████████████████████████████                                      
 57.1 |██████████████████████████████████████████                                      
 42.3 |██████████████████████████████████████████                                      
 27.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   2 ms |   1
   3 ms |   2
   4 ms | █  3
   5 ms | █  4
   7 ms | ██████████████  72
   8 ms | ████████████████████████████████████████  205
   9 ms | ███████  34
  12 ms |   1
  13 ms |   2
  14 ms | ██  11
  15 ms | █  6
  16 ms | ██  10
  17 ms | █  7
  18 ms | ██  10
  19 ms | ██  10
  20 ms | █████  27
  21 ms | ████  19
  22 ms | █  5
  23 ms |   1
  25 ms |   1
  32 ms | ███████████████  75
  33 ms | ██████████████████████████████  155
  34 ms | █████████  46
  35 ms | ██  8
  36 ms | ██  11
  37 ms | ██  12
  38 ms | ██  11
  39 ms | ██  8
  40 ms | ██  12
  41 ms | ████  20
  42 ms | ███  15
  43 ms | ██  9
  44 ms | ██  10
  45 ms | ███  17
  46 ms | ██  11
  47 ms |   2
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 106 | 107.4 | 21.35 |
| `flame` | 160 | 106 | 112.3 | 22.19 |
| `dripping_water` | 240 | 106 | 115.3 | 21.16 |
| `dragon_breath` | 160 | 106 | 101.8 | 33.49 |
| `end_rod` | 240 | 106 | 28.6 | 45.83 |
| `portal` | 160 | 106 | 28.6 | 45.68 |
| `ALL_TOGETHER` | 1680 | 106 | 28.9 | 46.43 |
| `sculk_charge_pop` | 240 | 106 | 28.7 | 46.18 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `56.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `42.75`
- `fps_0p1pct_low` = `21.19`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `21.44`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `29.53`, min `19.06`, p50 `27.76`, p95 `49.51`, p99 `54.51`, 1%low `19.94`, 0.1%low `19.06`, std `8.34`

**Frame time (ms)**  avg `36.03`, p50 `36.03`, p95 `46.81`, p99 `48.75`, p99.9 `51.33`, max `52.46`

**Client tick (ms)**  avg `2.83`, p95 `3.39`, max `14.00`

**Memory**  start `900 MB`, end `1030 MB`, peak `1250 MB`, GC `4 events / 17 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                                                                    █        █  
 32.8 |     █     █                             █        █                 █ █      █  
 31.9 |     █   █ █  █ █   █          █         █        █         █       █ █    █ █  
 30.9 |  █  █   █ █  █ █ █ █ █        █  █   █  ███      █      █  ██      █ █    █ █  
 30.0 |  █  █   ███  ███ █ █ █    ███ █  █   █  ███ █    █ ██   █  ██ ██   █ █ █  ███  
 29.1 |█ █  █  █████ ███ █ █ █ ██ ███ █ ██   ██ ███ █    ████████  ██ ███  █ █ ██████  
 28.2 |█ ██ ████████ █████ ██████████ ████  ███ █████    ████████ ███████ ████ ████████
 27.3 |███████████████████ ███████████████  ██████████ ████████████████████████████████
 26.4 |███████████████████ ████████████████████████████████████████████████████████████
 25.5 |███████████████████ ████████████████████████████████████████████████████████████
 24.6 |███████████████████ ████████████████████████████████████████████████████████████
 23.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | █  1
  16 ms | █  1
  17 ms | █  2
  18 ms | ████  6
  19 ms | ███████████  16
  20 ms | ████████  11
  21 ms | ███████  10
  22 ms | █████████  12
  23 ms | █████  7
  24 ms | ███  4
  25 ms | ███████  10
  26 ms | █  1
  27 ms | █  2
  28 ms | ███  4
  29 ms | ████  6
  30 ms | █████████████████████████████  40
  31 ms | ██████████████  20
  32 ms | █████████  12
  33 ms | ████████████████████████████████████████  56
  34 ms | ███████  10
  35 ms | ██████████████████████████████  42
  36 ms | █████████████████████████████  41
  37 ms | ██████  9
  38 ms | ███████████  15
  39 ms | ███████████  15
  40 ms | ██████████████  19
  41 ms | ███████████████  21
  42 ms | █████████████████  24
  43 ms | █████████████████████  29
  44 ms | █████████████████████  30
  45 ms | ███████████████████  26
  46 ms | █████████████████████  29
  47 ms | █████████  13
  48 ms | ████  6
  49 ms | █  2
  50 ms | █  2
  52 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.76`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `67.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `19.94`
- `fps_0p1pct_low` = `19.06`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `28.49`, min `20.93`, p50 `29.34`, p95 `30.86`, p99 `48.39`, 1%low `21.22`, 0.1%low `20.93`, std `4.60`

**Frame time (ms)**  avg `35.89`, p50 `34.09`, p95 `45.19`, p99 `46.72`, p99.9 `47.53`, max `47.78`

**Client tick (ms)**  avg `0.68`, p95 `1.00`, max `1.39`

**Memory**  start `1022 MB`, end `692 MB`, peak `1246 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 32.4 |          █                                                                     
 31.7 |          █        █                                                         █ █
 31.0 |          █        █                          █ ██                           █ █
 30.3 |          █        █             █            ████  █           █            █ █
 29.6 |          █      █ █     █       █      █   █ █████ ██   █    █ █            █ █
 29.0 |█  █     ██  ███ █ █    ██       █ █   ██  ██ ████████   █    █ █   ██       █ █
 28.3 |█  ██ ██████ █████ █   ███ ██ ██ █ █  ███████ ██████████████ █████  ███  █   █ █
 27.6 |██ ██ ████████████████████ █████████  ███████ ████████████████████ ███████   ███
 26.9 |█████ ████████████████████████████████████████████████████████████████████ █████
 26.2 |██████████████████████████████████████████████████████████████████████████ █████
 25.6 |██████████████████████████████████████████████████████████████████████████ █████
 24.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  20 ms | ██  7
  21 ms | ██  6
  22 ms | █  4
  31 ms | █  4
  32 ms | ████████████████████████████████  108
  33 ms | ████████████████████████████████████████  136
  34 ms | ████████████████████████████  94
  35 ms | ████  12
  36 ms | ████  14
  37 ms | ████  15
  38 ms | ████  14
  39 ms | ███  11
  40 ms | ████  14
  41 ms | ███████  24
  42 ms | █████  17
  43 ms | ██████  22
  44 ms | ████████  26
  45 ms | ████  13
  46 ms | ████  14
  47 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `21.22`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.93`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.86`
- `preload_duration_ms` = `31.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `28.63`, min `21.10`, p50 `29.34`, p95 `44.35`, p99 `49.28`, 1%low `21.19`, 0.1%low `21.10`, std `5.50`

**Frame time (ms)**  avg `35.98`, p50 `34.08`, p95 `45.48`, p99 `46.90`, p99.9 `47.39`, max `47.39`

**Client tick (ms)**  avg `0.67`, p95 `0.96`, max `1.37`

**Memory**  start `830 MB`, end `519 MB`, peak `1246 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |                                                            █                   
 32.2 |                                                            █                   
 31.6 |                                                            █     █             
 30.9 |    █        █               █                              █     █      █      
 30.3 |    █  █     █    █    █  █  █                        █     █ █   █      █   █  
 29.7 |█   █  ██    ██   ███  █  █  █   █                    ██    █ █ █ █      █   █  
 29.1 |██  ██ ██ █  ██   ███ ███ █  █   ██   █   █  █   █ █ ███    ███ █ █     ██  ██  
 28.4 |██  ██ ██ ██ ███  ███ ███ █  ███ ███  █   █ ██   █ ██████ █ ███ █ █    ███  ██ █
 27.8 |██████ ██ ██ ████ ███████ ███████████ ██ ██ ██████ ██████ █ ███ █ █  █ ███  ████
 27.2 |██████ █████ ████ ██████████████████████ ██ █████████████ █ ███ █ █ ██ █████████
 26.6 |███████████████████████████████████████████████████████████ ██████████ █████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  4
  20 ms | ███  9
  21 ms | ████  13
  22 ms | █  4
  31 ms | █  2
  32 ms | ███████████████████████████████  102
  33 ms | ████████████████████████████████████████  130
  34 ms | █████████████████████████  81
  35 ms | ███  10
  36 ms | ████  14
  37 ms | ████  14
  38 ms | ████  12
  39 ms | ███  10
  40 ms | █████  17
  41 ms | ██████  19
  42 ms | ██████  20
  43 ms | ██████  21
  44 ms | ███████  24
  45 ms | ██████████  33
  46 ms | ████  12
  47 ms | ██  5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `21.19`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.10`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.79`
- `preload_duration_ms` = `67.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `28.79`, min `19.63`, p50 `29.35`, p95 `45.22`, p99 `49.59`, 1%low `20.56`, 0.1%low `19.63`, std `5.84`

**Frame time (ms)**  avg `35.89`, p50 `34.07`, p95 `45.78`, p99 `47.13`, p99.9 `50.80`, max `50.95`

**Client tick (ms)**  avg `0.66`, p95 `0.83`, max `6.88`

**Memory**  start `698 MB`, end `865 MB`, peak `1222 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |                                                          █                     
 32.7 |       █ █                                                █                     
 32.0 | █     █ █        █   █                   █    █          █      █              
 31.2 | █     █ █        █   ██  █    █          █    █       █  █      █              
 30.5 | █ █   █ █        █   ██  █    █          █    █       █  █      ██           █ 
 29.8 | █ █   █ █   ██   █ █ ██  ██   █      █   █    █     █ █  █ █    ██    █      █ 
 29.1 | █ █   █ █   ██ █ █ ████  ██   ███  █ █   █    █ █   █ █  █ █    ███   ██   █ █ 
 28.3 | █ █ ███ ██  ██████ ████  ███  ███ ██ ██ ████  █ █  ██ ██ █ █    ███  ███  █████
 27.6 | █ █████ ███ ████████████ ███ ███████ ██ █████ ████ ██ ██████   █████ ██████████
 26.9 |████████ ███ █████████████████████████████████ ███████████████ █████████████████
 26.1 |████████ ███ ███████████████████████████████████████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  19 ms | █  4
  20 ms | ███  9
  21 ms | ████  14
  22 ms | █  4
  23 ms |   1
  26 ms |   1
  31 ms |   1
  32 ms | █████████████████████████████████  106
  33 ms | ████████████████████████████████████████  127
  34 ms | ██████████████████████████  83
  35 ms | ████  12
  36 ms | ███  10
  37 ms | ███  8
  38 ms | ██  7
  39 ms | ████████  25
  40 ms | █████  17
  41 ms | █████  17
  42 ms | █████  15
  43 ms | ██████  19
  44 ms | ████████  24
  45 ms | █████████  29
  46 ms | █████  16
  47 ms | ██  5
  48 ms |   1
  50 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.56`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.63`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.86`
- `preload_duration_ms` = `77.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `28.32`, min `20.98`, p50 `29.34`, p95 `30.84`, p99 `49.22`, 1%low `21.26`, 0.1%low `20.98`, std `4.87`

**Frame time (ms)**  avg `36.20`, p50 `34.08`, p95 `45.47`, p99 `46.54`, p99.9 `47.58`, max `47.67`

**Client tick (ms)**  avg `0.63`, p95 `0.90`, max `1.19`

**Memory**  start `954 MB`, end `698 MB`, peak `1258 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |                                                                          █     
 32.8 |                                                                          █     
 32.1 |                                    █                                     █     
 31.4 |   █        █                       █                                     █     
 30.7 |   █        █                     █ ██     █                        █     █     
 30.1 |   █        █          █   █      █ ██     █   █          █   █     █     █     
 29.4 |   █    █   █  █   █   █   █ █ █  █ ██   █ █   █          █   █     █     █     
 28.7 |█  █  █ █   █  ███ █   ██  █ █ █  ██████ █ ██  █ █   █    █ █ █  █  █     █ █   
 28.0 |█  █ ██ ███ █  ███ ██  █████████  ██████ █████ █ ███████ ████ █  █  ████  █ ███ 
 27.4 |█  █ █████████ ██████  █████████  ██████ █████ ████████████████ ███ █████ ██████
 26.7 |█  █ █████████████████ █████████ ███████████████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  3
  20 ms | ██  6
  21 ms | ███  9
  22 ms |   1
  27 ms |   1
  31 ms | █  3
  32 ms | ███████████████████████████████  103
  33 ms | ████████████████████████████████████████  135
  34 ms | █████████████████████████  84
  35 ms | ███  9
  36 ms | ██  7
  37 ms | ████  12
  38 ms | ███  9
  39 ms | ██████  21
  40 ms | ██████  19
  41 ms | ██████  21
  42 ms | █████  18
  43 ms | █████  18
  44 ms | █████████  32
  45 ms | ████████  27
  46 ms | ████  12
  47 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `21.26`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.98`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.63`
- `preload_duration_ms` = `32.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `28.64`, min `20.93`, p50 `29.49`, p95 `30.80`, p99 `49.19`, 1%low `21.28`, 0.1%low `20.93`, std `5.05`

**Frame time (ms)**  avg `35.82`, p50 `33.92`, p95 `45.44`, p99 `46.67`, p99.9 `47.41`, max `47.77`

**Client tick (ms)**  avg `0.45`, p95 `0.60`, max `0.82`

**Memory**  start `820 MB`, end `1156 MB`, peak `1156 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 32.5 |                                            █                                   
 31.9 | █                         █                █                                   
 31.2 | █             █   █       █                █                     █     █       
 30.6 | █   █  █      █   █       █              █ █     █             █ █     █       
 29.9 | █ █ █ ██      █ █ █      ██    █         █ █     █          █  █ █     █     █ 
 29.3 | █ ███ ████ █  █ █ █  █   ██  █ █ █       █ █     █         ██  █ █ █   █  █  █ 
 28.6 | █ ███ ██████ ██ █ █  █   ██  █████  █    █ █  ██ ███ █ █   ██  █ ███   █  █ ██ 
 28.0 | █████ █████████ █ ██ ██  █████████ ██ ███████ ██ █████ ██ ███  █ ████  ██ ████ 
 27.4 | █████ ██████████████ ███ █████████ ██ ███████ ██ █████ ██ ███ ███████  ██ █████
 26.7 |██████ ███████████████████████████████████████ ███████████ █████████████████████
 26.1 |██████████████████████████████████████████████ █████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  3
  20 ms | ██  12
  21 ms | █  7
  22 ms |   1
  31 ms |   1
  32 ms | █████████████████  82
  33 ms | ████████████████████████████████████████  198
  34 ms | ███████████  54
  35 ms | ██  12
  36 ms | ██  12
  37 ms | ██  11
  38 ms | ███  14
  39 ms | ███  17
  40 ms | █████  26
  41 ms | ███  17
  42 ms | ████  18
  43 ms | ███  15
  44 ms | ███  15
  45 ms | █████  26
  46 ms | ███  16
  47 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `21.28`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.93`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.92`
- `preload_duration_ms` = `67.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `28.57`, min `20.23`, p50 `29.44`, p95 `30.93`, p99 `48.99`, 1%low `20.87`, 0.1%low `20.23`, std `4.87`

**Frame time (ms)**  avg `35.87`, p50 `33.97`, p95 `45.64`, p99 `47.21`, p99.9 `48.61`, max `49.43`

**Client tick (ms)**  avg `0.60`, p95 `0.81`, max `1.24`

**Memory**  start `618 MB`, end `1130 MB`, peak `1130 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 32.6 |                                         █                                █     
 32.0 |                                         █                                █     
 31.5 |                                         █    █                █ █        █     
 30.9 |     █                         █    █    █    █              █ █ █        █  █  
 30.3 |     █                 █       █ █  █    █    █              █ █ █        █  █  
 29.8 |     █       █  █  █ █ █    █  █ █  █    █    █        █     █ █ █        █  █  
 29.2 |   █ ██   █  █  █  █ █ █    █  █ ██ █    █    █        █     █ █ █ █  █   █  █  
 28.6 |   █ ███  ████  █  █ ███ █ ██  █ ██ █    ██ █ █  █     ██    █ █ █ █  ███ █  █  
 28.1 |█  █████  ████  █  █████ █ ██  ██████ ██ ████ █  ██  █ ███ ███ █ ████████ █ ███ 
 27.5 |██ ███████████  ██████████████ █████████ ████ █████  ████████████████████ █ ███ 
 27.0 |████████████████████████████████████████ ██████████  ████████████████████ █████ 
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   1
  20 ms | ██  9
  21 ms | ██  7
  22 ms | █  2
  31 ms | █  2
  32 ms | ██████████████████████████████  112
  33 ms | ████████████████████████████████████████  149
  34 ms | ██████████████████████  82
  35 ms | ███  12
  36 ms | ████  14
  37 ms | ██  8
  38 ms | █████  17
  39 ms | █  4
  40 ms | █████  18
  41 ms | █████  18
  42 ms | █████  19
  43 ms | █████  17
  44 ms | ███████  27
  45 ms | █████  19
  46 ms | ███  13
  47 ms | ██  6
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.87`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.23`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.88`
- `preload_duration_ms` = `34.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `28.98`, min `20.53`, p50 `29.13`, p95 `46.35`, p99 `49.31`, 1%low `20.98`, 0.1%low `20.53`, std `6.16`

**Frame time (ms)**  avg `35.78`, p50 `34.33`, p95 `45.45`, p99 `46.86`, p99.9 `48.23`, max `48.71`

**Client tick (ms)**  avg `1.00`, p95 `1.18`, max `1.47`

**Memory**  start `502 MB`, end `760 MB`, peak `1258 MB`, GC `3 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 33.8 |       █                                                                        
 33.0 |       █                                                                        
 32.2 |       █ █             █                               █                        
 31.4 |       █ █           █ █ █        ██                   █                        
 30.6 |       █ █           █ █ ██       ██    █ █     █      █ ██  █      █  █        
 29.8 | █  █  █ █  █ ██   █████ ██       ██    █ █    ███     █ ██  █   █ ██  █    █   
 29.0 | █  ██ █ █  ████   █████ ██ █ █  ███   ████ █  ███   █ █ ██ ███  █ ██  █ █  █ █ 
 28.2 |███ ███████ █████████████████ █ ██████████████ ███  ████ ██ ██████ ██ ██████████
 27.4 |███████████ ███████████████████ ██████████████████  ██████████████ ██ ██████████
 26.5 |███████████████████████████████████████████████████ ████████████████████████████
 25.7 |███████████████████████████████████████████████████ ████████████████████████████
 24.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | █████  13
  21 ms | ██████  16
  22 ms | █████  12
  23 ms |   1
  31 ms | █  3
  32 ms | ███████████████████████████████████████  103
  33 ms | ████████████████████████████████████████  106
  34 ms | ████████████████████████████████  85
  35 ms | █████  14
  36 ms | ███  9
  37 ms | █████  13
  38 ms | █████  14
  39 ms | █████  13
  40 ms | ██████  15
  41 ms | ████████  21
  42 ms | ███████  19
  43 ms | ████████  21
  44 ms | ████████████  33
  45 ms | ███████████  28
  46 ms | █████  13
  47 ms | ██  4
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.98`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.53`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.95`
- `preload_duration_ms` = `60.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `29.28`, min `20.30`, p50 `27.77`, p95 `46.96`, p99 `54.48`, 1%low `20.51`, 0.1%low `20.30`, std `7.21`

**Frame time (ms)**  avg `35.80`, p50 `36.01`, p95 `46.64`, p99 `48.17`, p99.9 `49.21`, max `49.26`

**Client tick (ms)**  avg `2.84`, p95 `3.50`, max `10.08`

**Memory**  start `1100 MB`, end `1111 MB`, peak `1266 MB`, GC `2 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 35.4 | █                                                                              
 34.3 | █                                                             █                
 33.3 | █                                       █              █      █                
 32.2 | █ █              █                      █              █      █  █      █     █
 31.2 | █ █   █          █     ██ █    █  █     █ █   █        █      █  █      █  █  █
 30.1 | █ █   █ █  █ █ █ █  █  ██ █    █  █ ██ ██ ██  █  █  █  █      █  █      █  █  █
 29.0 | █ ███ █ ██ █ ███ █  █  ██████ ██ ████████ ██  █  █  ██ █ ███  ██ ██ █ ███  █ ██
 28.0 | ████████████ █████ ██ ███████████████████ ██ ██████ ██████████████████████ █ ██
 26.9 |██████████████████████████████████████████ █████████████████████████████████████
 25.9 |██████████████████████████████████████████ █████████████████████████████████████
 24.8 |██████████████████████████████████████████ █████████████████████████████████████
 23.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | ██  4
  18 ms | ███  6
  19 ms | ███  7
  20 ms | ██  5
  21 ms | ████████  17
  22 ms | ███  6
  23 ms | ██  4
  24 ms | █  2
  25 ms |   1
  29 ms | ██  5
  30 ms | ████████████████████████████████████████  81
  31 ms | ███████  15
  32 ms | ████████  16
  33 ms | ███████████████████████████████████  71
  34 ms | ██████  12
  35 ms | █████████████  27
  36 ms | █████████████████████████████████████  74
  37 ms | ██████  13
  38 ms | ██████  12
  39 ms | █████  10
  40 ms | ███████████  23
  41 ms | ████████  17
  42 ms | ██████████  20
  43 ms | ██████████████  29
  44 ms | ████████  17
  45 ms | █████████████  27
  46 ms | ██████  12
  47 ms | ███████  14
  48 ms | ████  9
  49 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.51`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.30`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.93`
- `preload_duration_ms` = `35.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `29.27`, min `19.34`, p50 `27.44`, p95 `48.04`, p99 `54.00`, 1%low `19.80`, 0.1%low `19.34`, std `7.75`

**Frame time (ms)**  avg `36.08`, p50 `36.44`, p95 `46.31`, p99 `49.14`, p99.9 `51.56`, max `51.71`

**Client tick (ms)**  avg `3.53`, p95 `4.85`, max `6.24`

**Memory**  start `718 MB`, end `599 MB`, peak `1255 MB`, GC `8 events / 17 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                                                █                               
 33.1 |             █      █                           █                █              
 32.2 |             █      █  █                        █                █     █        
 31.3 |   █    █    █      █  █        █   █  █ █      █  █             █     █     █  
 30.5 |  ██    █ █  █      █  █  █  █  █   █  █ ██  █  █  █             █  █ ██ █ █ █  
 29.6 | ███ ██ ███  █ ██ █ █  ████  █  █ ███  █ ███ █  █  █  █  █   █   █ ██ ██ █ ███ █
 28.7 | ███ ██ ███ ██ ██ █ █  █████ █ ██ ███  ███████  █  █  █████  █   ███████ ███████
 27.8 | ██████ ██████████████ █████ ████ ████ ███████  ██ █  █████  █ █ ███████ ███████
 26.9 |████████████████████████████ ████ ████████████████████████████ █████████████████
 26.0 |████████████████████████████ █████████████████████████████████ █████████████████
 25.1 |████████████████████████████ █████████████████████████████████ █████████████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | ███  4
  18 ms | █████  6
  19 ms | ████████  10
  20 ms | ██████  8
  21 ms | ████  5
  22 ms | ███████  9
  23 ms | ██████  7
  24 ms | ███████  9
  25 ms | ████  5
  26 ms | ██  3
  27 ms | ██  2
  28 ms | ██████████  12
  29 ms | ████████████████████  25
  30 ms | ██████████████████  22
  31 ms | ███████████████  19
  32 ms | █████████████████  21
  33 ms | ████████████████████████████████████████  50
  34 ms | ███████████  14
  35 ms | █████████████████████  26
  36 ms | ██████████████████████████  33
  37 ms | ██████████████████████████████  37
  38 ms | ██████████████████  23
  39 ms | ███████████  14
  40 ms | ███████████████  19
  41 ms | ████████████████  20
  42 ms | ████████████████  20
  43 ms | ███████████████████████████  34
  44 ms | ████████████████████████████  35
  45 ms | ██████████████████  22
  46 ms | ██████████████  17
  47 ms | ██████  8
  48 ms | ██████  7
  49 ms | ██  3
  50 ms | ██  2
  51 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `19.34`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `32.00`
- `fps_harmonic_avg` = `27.71`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `19.80`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `28.72`, min `21.39`, p50 `29.41`, p95 `45.26`, p99 `48.22`, 1%low `21.50`, 0.1%low `21.39`, std `5.73`

**Frame time (ms)**  avg `35.96`, p50 `34.00`, p95 `45.41`, p99 `46.21`, p99.9 `46.73`, max `46.76`

**Client tick (ms)**  avg `0.87`, p95 `1.04`, max `1.25`

**Memory**  start `761 MB`, end `1252 MB`, peak `1252 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |      █                                                                         
 32.5 |      █                                         █                               
 31.7 |      █              █       █                  █                █      █       
 31.0 |      █     █        █       █ █       █  █  █  █                █    █ █       
 30.2 |   █  █    ██        █  █    █ █ █   █ █  █  █  █ █           █  █    █ █   █   
 29.5 |   █  █   ███        █  █    █ █ █ █ █ █  ██ █  █ █    █      █  █    █ █ █ █   
 28.7 |   █  █ █████ █  ███ █ ██    ███ █ ███ █  ██ █  ███   ██  █   █ ████ ██ ███ █   
 27.9 |█████ █ █████ █ ████ ████ █  █████████ ██ ██ ██ ███  ███ ███  █████████ ███ ████
 27.2 |████████████████████ ████ ██████████████████ ██ ████ ███ ███ ███████████████████
 26.4 |████████████████████ ████ ██████████████████████████████████████████████████████
 25.6 |████████████████████ ████ ██████████████████████████████████████████████████████
 24.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ███  9
  21 ms | █████  17
  22 ms | ███  10
  23 ms |   1
  31 ms | █  3
  32 ms | ██████████████████████████████  101
  33 ms | ████████████████████████████████████████  136
  34 ms | ████████████████  53
  35 ms | ███  11
  36 ms | ████  12
  37 ms | ████  13
  38 ms | ██████  19
  39 ms | ██████  21
  40 ms | ███  11
  41 ms | ████  14
  42 ms | ████████  28
  43 ms | ██████  19
  44 ms | ███████████  36
  45 ms | ██████████  33
  46 ms | ██  8
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `84.00`
- `fps_1pct_low` = `21.50`
- `fps_harmonic_avg` = `27.81`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `21.39`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `28.50`, min `20.66`, p50 `29.60`, p95 `30.87`, p99 `47.71`, 1%low `21.12`, 0.1%low `20.66`, std `5.02`

**Frame time (ms)**  avg `36.01`, p50 `33.79`, p95 `45.38`, p99 `46.72`, p99.9 `48.03`, max `48.40`

**Client tick (ms)**  avg `0.42`, p95 `0.58`, max `0.77`

**Memory**  start `730 MB`, end `810 MB`, peak `1250 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 32.4 |    █                                             █                             
 31.8 |    █                                             █                             
 31.2 |█   █            █      █     █                █  █                             
 30.6 |█   █           ██   █  █     █       ██   █   █  █    █          ██  █        █
 30.0 |██  █           ██   █  █     █  █    ███  █   █  █    █          ██  █        █
 29.4 |██  █      █ █  ██   █  █     █  █  █ ███  █ █ █  █  █ █         ███  █  █     █
 28.8 |██  █      █ █  ███  █  █    ██  █  █ ███  █ █ █  █  █ █  █  ██  ███ ███ █ █   █
 28.2 |██  █      █ ██ ████ ██ ███ ███  █ ██ ███ ██ █ █  █  █ █  █████ ████████ ████ ██
 27.7 |██  █      █ ██ ████ ██ ████████ ████ ██████ █ █  █  ████ █████ ████████ ███████
 27.1 |██  █      █████████ ████████████████ ████████ █  █  ████ █████ ████████ ███████
 26.5 |██ ███  ██ █████████████████████████████████████████████████████████████ ███████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  6
  21 ms | ███  14
  22 ms | █  3
  32 ms | █████████████  69
  33 ms | ████████████████████████████████████████  214
  34 ms | ████████  44
  35 ms | ██  10
  36 ms | ██  12
  37 ms | █  7
  38 ms | ██  12
  39 ms | ███  17
  40 ms | ███  16
  41 ms | █████  26
  42 ms | ███  16
  43 ms | ████  19
  44 ms | █████  26
  45 ms | █████  28
  46 ms | ██  11
  47 ms | █  3
  48 ms |   1
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
- `fps_0p1pct_low` = `20.66`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `62.00`
- `fps_harmonic_avg` = `27.77`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `21.12`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `29.32`, min `19.28`, p50 `27.85`, p95 `46.63`, p99 `53.71`, 1%low `19.96`, 0.1%low `19.28`, std `7.23`

**Frame time (ms)**  avg `35.76`, p50 `35.91`, p95 `46.37`, p99 `49.09`, p99.9 `51.29`, max `51.87`

**Client tick (ms)**  avg `3.19`, p95 `5.17`, max `9.52`

**Memory**  start `1140 MB`, end `1123 MB`, peak `1292 MB`, GC `4 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 35.0 | █          █                                                                   
 34.2 | █          █                                                         █         
 33.4 | █       █  █            █                                            █         
 32.6 | █       █  █            █                                            █         
 31.9 | █       █  █    █    █  █  █                █                █       █         
 31.1 | █  █    █  █    █  █ █  █  █ █           █ ██    █      █    █ █     █         
 30.3 | █  ██   █  █ ██ █  █ █  █  █ ██ ██   █   █ ██    █  █   █    █ █   █ █ ██     █
 29.5 | █ ███   ██ █ ██ ████ █  █  █ ██ ███  █   █ ██    █  █   █ █  █ █   █ █ ██  █  █
 28.8 | █ ███ █ ██ █████████ █  ██ █ ██ ███  █   ████ █  ██ █ █ █ ██ █ █   █ █ ██  ████
 28.0 | █ ███ █ ████████████ ██ ██ ███████████ █ ███████ ████████ ██ ████  █ █ ██ █████
 27.2 |██████████████████████████████████████████████████████████ ██████████ ██████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  2
  17 ms | █  2
  18 ms | ███  5
  19 ms | ██████  11
  20 ms | ██  4
  21 ms | ███████  12
  22 ms | ██  4
  23 ms | ███  6
  24 ms | ████  7
  25 ms | █  1
  26 ms | █  2
  28 ms | ███  5
  29 ms | ███████  12
  30 ms | █████████████████████████████  52
  31 ms | ████████████  21
  32 ms | ████████████  21
  33 ms | ████████████████████████████████████████  71
  34 ms | ███████  13
  35 ms | ███████████████████  33
  36 ms | ████████████████████████████  50
  37 ms | █████████████  23
  38 ms | ████████████████  28
  39 ms | ███████████  19
  40 ms | ███████  13
  41 ms | ██████████  18
  42 ms | ████████████████  29
  43 ms | ██████████  18
  44 ms | ████████████  22
  45 ms | ██████████████  25
  46 ms | ███  6
  47 ms | ██████  11
  48 ms | ███  6
  49 ms | ███  5
  50 ms | █  1
  51 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.03`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `19.28`
- `preset_long` = `0.00`
- `preload_duration_ms` = `93.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.97`
- `fps_1pct_low` = `19.96`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `29.01`, min `19.86`, p50 `28.35`, p95 `44.72`, p99 `52.68`, 1%low `20.38`, 0.1%low `19.86`, std `6.63`

**Frame time (ms)**  avg `35.92`, p50 `35.27`, p95 `46.17`, p99 `48.22`, p99.9 `50.06`, max `50.36`

**Client tick (ms)**  avg `2.61`, p95 `4.51`, max `11.15`

**Memory**  start `936 MB`, end `719 MB`, peak `1316 MB`, GC `2 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 34.1 |       █                                                                        
 33.4 |       █                   █          █                                         
 32.7 |       █                   █          █                                         
 32.0 |    █  █           █       █          █    █       ██        █              █   
 31.3 |    █  █  █        █    █  █          █    █     █ ██        █              █   
 30.6 |    █  █  █       ██    ██ █ █        █    █     █ ██        █              █   
 29.9 |    █  █  █   █ █ ██  █ ██ █ ██ █     █  █ █  ██ █ ██     █  █  █       █   █   
 29.2 |   ██ ██  ██ ██ █ ██  █ ██ █ ██ █ █   █  █ █ ███ █ ███    █  █ ██     █ ██  █  █
 28.5 |█  █████  █████ ████ ██ ████ ██ █ █  ███ █ █████ ██████ ███  █ ██  █  ████  █  █
 27.8 |███████████████████████ ████ ████ ██ ███ █ ██████████████████████  ███████  █ ██
 27.1 |████████████████████████████ ███████████ █████████████████████████████████  █ ██
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | ██  3
  18 ms | ██  3
  19 ms | ████  7
  20 ms | ███  5
  21 ms | ██  4
  22 ms | █████  10
  23 ms | ████  7
  24 ms | ███  5
  26 ms | █  1
  28 ms | ████  8
  29 ms | █████  9
  30 ms | ██████████████  26
  31 ms | ███████████████████████████  49
  32 ms | ████████████████  30
  33 ms | ████████████████████████████████████████  73
  34 ms | █████████████  24
  35 ms | ██████████████████████████████  55
  36 ms | ███████████████  27
  37 ms | █████████  16
  38 ms | ██████  11
  39 ms | ███████  12
  40 ms | ████████████  21
  41 ms | ████████████  22
  42 ms | █████████████  23
  43 ms | ████████████████████  37
  44 ms | ██████████  19
  45 ms | ███████████  20
  46 ms | ███████  12
  47 ms | █████  10
  48 ms | ███  5
  49 ms | █  2
  50 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.60`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `19.86`
- `preset_long` = `0.00`
- `preload_duration_ms` = `68.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.84`
- `fps_1pct_low` = `20.38`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `37.28`, min `13.80`, p50 `25.70`, p95 `96.09`, p99 `193.85`, 1%low `15.17`, 0.1%low `13.80`, std `32.56`

**Frame time (ms)**  avg `36.30`, p50 `38.91`, p95 `58.19`, p99 `62.97`, p99.9 `69.49`, max `72.48`

**Client tick (ms)**  avg `13.65`, p95 `19.30`, max `25.03`

**Memory**  start `892 MB`, end `727 MB`, peak `1283 MB`, GC `25 events / 93 ms`

**FPS over sampling window (ASCII):**

```
 92.9 |                        █                                                       
 86.7 |   █                    █                                                       
 80.4 |   █                    █                                                       
 74.2 |   █                    █                                      █      █         
 67.9 |   █                    █                                      █      █         
 61.7 |   █                    █                     █          █     █      █         
 55.4 |   █    █      █        █   █        █  █     █          █     █      █         
 49.2 |   █  █ █   █  █     █  █   █      █ █  █  █  █          █     █      █         
 43.0 |   █  ████  █ ██  █  █  █   █    █ █ █  █  █  █   █      █     █      █     █   
 36.7 | █ █  █████ █ ██ ██  █████  █ ██ █ █ ██ █  █  ██  ██     █  ██ █ █ ██ █  █ ██  █
 30.5 |██ ██████████████████████████ ██████████████████ ███████ ███████████████████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ████  3
   4 ms | ████  3
   5 ms | ███  2
   6 ms | ██████  4
   7 ms | ████████  6
   8 ms | ████████  6
   9 ms | ████  3
  10 ms | ████████  6
  11 ms | ████  3
  12 ms | ███  2
  13 ms | ███████  5
  14 ms | ████████████  9
  15 ms | ████████████  9
  16 ms | ██████████  7
  17 ms | ████████  6
  18 ms | ███████████  8
  19 ms | ██████  4
  20 ms | ██████████████████  13
  21 ms | ██████████████████  13
  22 ms | ████████████  9
  23 ms | ████████  6
  24 ms | ███████  5
  25 ms | ██████████████  10
  26 ms | ██████████  7
  27 ms | ██████████  7
  28 ms | ███████████  8
  29 ms | ███████████████  11
  30 ms | ███████████  8
  31 ms | ███████████  8
  32 ms | ██████████  7
  33 ms | █████████████████████  15
  34 ms | ███████  5
  35 ms | █████████████████████  15
  36 ms | ███████████  8
  37 ms | ███████████████  11
  38 ms | █████████████████████████████████  24
  39 ms | ███████████  8
  40 ms | █████████████████████████  18
  41 ms | ███████████████████████████████████████  28
  42 ms | █████████████████████████  18
  43 ms | █████████████████████████  18
  44 ms | █████████████████████████  18
  45 ms | ██████████████████████████████  22
  46 ms | ████████████████████████████████████████  29
  47 ms | ███████████████████████  17
  48 ms | ██████████████  10
  49 ms | ███████████  8
  50 ms | ██████████████  10
  51 ms | ███████████  8
  52 ms | ██████████  7
  53 ms | ██████  4
  54 ms | ███████  5
  55 ms | ██████████  7
  56 ms | ███████  5
  57 ms | ████  3
  58 ms | ███████████████████  14
  59 ms | ███  2
  60 ms | ██████  4
  61 ms | ███  2
  62 ms | ██████  4
  63 ms | ███  2
  64 ms | ███  2
  67 ms | █  1
  72 ms | █  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `34.00`
- `falling_blocks_landed` = `25969.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.55`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.80`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4810.51`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `15.17`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `36.73`, min `13.77`, p50 `25.97`, p95 `97.01`, p99 `158.77`, 1%low `15.00`, 0.1%low `13.77`, std `32.64`

**Frame time (ms)**  avg `36.35`, p50 `38.50`, p95 `59.73`, p99 `63.09`, p99.9 `71.41`, max `72.65`

**Client tick (ms)**  avg `14.22`, p95 `19.52`, max `25.81`

**Memory**  start `832 MB`, end `508 MB`, peak `1263 MB`, GC `25 events / 90 ms`

**FPS over sampling window (ASCII):**

```
104.7 |   █                                                                            
 97.5 |   █                                                                            
 90.3 |   █                                                                            
 83.2 |   █                                                                            
 76.0 |   █                                                                            
 68.8 |   █                                                                            
 61.7 |   █                                                      █                     
 54.5 |   █      █                               █               █     █      █        
 47.3 |   █   █  █  █        █  █        █   ██  █            █ ██     █     ██        
 40.2 |  ██  ██  █  █ ██ █  ███ █  █ ██  ██████  █  ██  █  █  █ ██     █    ███        
 33.0 |████ ████ ████ █████████ ██ ████████████ █████████████ █████ █  ████████  █ ████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   4 ms | ██  1
   5 ms | ██  1
   6 ms | █████████████  7
   7 ms | ████  2
   8 ms | ███████████  6
   9 ms | ███████████  6
  10 ms | █████████████  7
  11 ms | ████  2
  12 ms | █████████████  7
  13 ms | █████████████  7
  14 ms | ███████████████  8
  15 ms | █████████████  7
  16 ms | ██████████  5
  17 ms | ██████  3
  18 ms | █████████████████████████████  15
  19 ms | █████████████  7
  20 ms | ██████████  5
  21 ms | ███████████████  8
  22 ms | ██████████  5
  23 ms | █████████████  7
  24 ms | ███████████████████████  12
  25 ms | ███████████  6
  26 ms | ███████████  6
  27 ms | ███████████████  8
  28 ms | ████████████████████████████████  17
  29 ms | █████████████  7
  30 ms | ███████████████  8
  31 ms | █████████████████████  11
  32 ms | ███████████████████████  12
  33 ms | ██████████████████████████████████  18
  34 ms | █████████████████████████████  15
  35 ms | ███████████████  8
  36 ms | ███████████████████████  12
  37 ms | █████████████  7
  38 ms | ████████████████████████████████████████  21
  39 ms | ██████████████████████████████████  18
  40 ms | ████████████████████████████████████████  21
  41 ms | ████████████████████████████████████  19
  42 ms | █████████████████████████  13
  43 ms | ██████████████████████████████████████  20
  44 ms | ██████████████████████████████  16
  45 ms | █████████████████████████████  15
  46 ms | █████████████████████████  13
  47 ms | ████████████████████████████████  17
  48 ms | █████████████████████████████  15
  49 ms | █████████████████  9
  50 ms | ███████████  6
  51 ms | ███████████████  8
  52 ms | █████████████████████████  13
  53 ms | ██████████  5
  54 ms | █████████████  7
  55 ms | █████████████  7
  56 ms | ██  1
  57 ms | ████████  4
  58 ms | █████████████████  9
  59 ms | ████████  4
  60 ms | █████████████  7
  61 ms | ████████  4
  62 ms | ███████████████  8
  63 ms | ████  2
  64 ms | ██  1
  65 ms | ██  1
  70 ms | ██  1
  72 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `45.00`
- `falling_blocks_landed` = `26576.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.51`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.77`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4798.12`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `15.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `9.87`, min `8.60`, p50 `9.99`, p95 `10.46`, p99 `10.91`, 1%low `8.65`, 0.1%low `n/a`, std `0.46`

**Frame time (ms)**  avg `101.57`, p50 `100.11`, p95 `112.36`, p99 `114.37`, p99.9 `115.98`, max `116.25`

**Client tick (ms)**  avg `1.64`, p95 `2.36`, max `8.66`

**Memory**  start `756 MB`, end `851 MB`, peak `1171 MB`, GC `4 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                                                           █    
 10.4 |                                                                           █    
 10.3 |               █  █                                                        █    
 10.2 |            █  █  █                                    █     █    █  █     █    
 10.1 |█           ██ ██ █         █               █        █ █ █   █  █ █  ██    █  █ 
 10.0 |█ ██ ██ █ █ ██ ██ ██ █  █ █ ██ █ ██ ██ ██ █ ██ ██ ██ █ ███ █ ██ █ ██ ██ ██ ██ ██
  9.9 |████ ██ █ █ ██ ██ ██ █ ██ █ ██ █ ██ ██ ██ █ ██ █████ █ ███ █ ██ █ ██ ██ ██ ██ ██
  9.7 |████ ████ █ ██ ██ ██ ██████ ███████ ██ ██ █ ██ █████ █ ███ █ ██ █ ██ ██ ██ ██ ██
  9.6 |████ ████ █ ██ ██ █████████ ███████ ███████ ████████ █ ███ █ ████ ██ ██ ██ █████
  9.5 |█████████ █ ███████████████ ████████████████████████████████ ███████████████████
  9.4 |███████████ ████████████████████████████████████████████████ ███████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms | █  1
  90 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | █  2
  94 ms | █  1
  95 ms | ███  5
  96 ms | ███  5
  97 ms | ██  3
  98 ms | ████  7
  99 ms | █████████████████████████████████  55
 100 ms | ████████████████████████████████████████  67
 101 ms | █████  8
 102 ms | █  2
 103 ms | ██  3
 106 ms | █  1
 108 ms | ███  5
 109 ms | ██  3
 110 ms | ████  6
 111 ms | ████  7
 112 ms | █████  8
 113 ms | █  2
 114 ms | █  2
 116 ms | █  1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `36.00`
- `falling_blocks_landed` = `4508.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `9.85`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `617.89`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `8.65`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23074 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `8.86`, p50 `9.98`, p95 `10.28`, p99 `10.96`, 1%low `8.86`, 0.1%low `n/a`, std `0.43`

**Frame time (ms)**  avg `101.67`, p50 `100.16`, p95 `112.09`, p99 `112.89`, p99.9 `112.92`, max `112.92`

**Client tick (ms)**  avg `1.62`, p95 `2.37`, max `7.05`

**Memory**  start `703 MB`, end `829 MB`, peak `1179 MB`, GC `2 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                          █                                                     
 10.4 |                          █                                                     
 10.3 |                          █                 █                                   
 10.2 |                    █  █  █     █           █                                   
 10.1 |       █            █  █  █     █ ██   █    █          █  █  █   ██ █          █
 10.0 |█ █  █ █ █ █ █ ██ █ ██ ██ ██ █  █ ██ █ ██ █ ██ ██ █ ██ █ ██ ██ █ ██ ███ █ █  █ █
  9.9 |█ █ ██ █ ███ █ ██ █ ██ ██ ██ ██ █ ██ █ ██ █ ██ ██ █ ██ █ ██ ██ █ ██ ███ █ █ ██ █
  9.8 |█ █ ██ █ ███ █ ██ █ ██ ██ ██ ██ █ ██ █ ██ █ ██ ████ ████ ██ ██ █ ██ ███ █ █ ██ █
  9.7 |█ █ ██ █ ███ █ ██ █ ██ ██ ██ ██ █ ██ █ ██ █ ██ █████████ ██ ████ ██ ███ █ █ ██ █
  9.6 |██████ █████ ████ █ ██ ██ █████ █ ██ ███████████████████ ██ ████ ██ █████ ████ █
  9.5 |████████████ ██████ ████████████████ ██████████████████████████████ ████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  1
  91 ms | █  2
  93 ms | █  1
  94 ms | █  1
  95 ms | █  1
  96 ms | █  2
  97 ms | ██████  10
  98 ms | ███████  11
  99 ms | ██████████████████████████████████  53
 100 ms | ████████████████████████████████████████  63
 101 ms | ████████  12
 102 ms | █  2
 105 ms | █  1
 106 ms | █  2
 107 ms | █  1
 108 ms | ███  5
 109 ms | ████  6
 110 ms | ██  3
 111 ms | █████  8
 112 ms | ███████  11
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `0.00`
- `falling_blocks_landed` = `4606.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `9.84`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.61`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `8.86`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23158 ms  |  Sample ticks: 400

**FPS**  avg `9.88`, min `8.62`, p50 `9.98`, p95 `10.16`, p99 `10.95`, 1%low `8.72`, 0.1%low `n/a`, std `0.41`

**Frame time (ms)**  avg `101.44`, p50 `100.20`, p95 `111.49`, p99 `113.18`, p99.9 `115.51`, max `116.02`

**Client tick (ms)**  avg `0.55`, p95 `0.95`, max `1.44`

**Memory**  start `885 MB`, end `526 MB`, peak `1177 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                      █                                                         
 10.6 |                      █                                                         
 10.5 |                      █                  █       █      █          █    █       
 10.3 |                      █                  █       █      █          █    █  █    
 10.2 |                      █            █     █       █      █          █    █  █    
 10.1 |      █    █          █            ██    █       █ █    █  █       █    █  ██   
 10.0 |███ █ ██ █ ██ █ ██  █ ██ ██ █ ███  ███ █ ███ █ █ ███ ██ ██ ██ █ ██ ██ █ ██ ██ ██
  9.8 |███ █ ██ █ ██ █ ██ ██ ██ ██ █ ████ ███ █ ███ █ █ ███ ██ ██ ██ █ ██ ██ █ ██ ██ ██
  9.7 |███ █ ██ █ ██ █ █████ ██ ██ ██████ ███ █ █████ █ ███ ██ ██ ████ ██ ██ █ ██ ██ ██
  9.6 |█████ ███████ ███████ ████████████ █████ ███████ ██████ ██ ████ ██ ██ ████ █████
  9.5 |█████████████ ████████████████████████████████████████████ █████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms |   1
  91 ms | █  3
  92 ms |   1
  93 ms | █  2
  94 ms |   1
  95 ms |   1
  96 ms |   1
  98 ms | █  3
  99 ms | ██████████████████████████  53
 100 ms | ████████████████████████████████████████  83
 101 ms | ██████  12
 102 ms | █  2
 103 ms |   1
 104 ms | █  2
 106 ms | ██  4
 107 ms | ██  5
 108 ms | ██  4
 109 ms | █  2
 110 ms | █  2
 111 ms | ███  7
 112 ms | ██  4
 113 ms | █  3
 116 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `5099.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `8.72`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.86`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `n/a`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.71`, p50 `9.98`, p95 `10.12`, p99 `10.92`, 1%low `8.75`, 0.1%low `n/a`, std `0.41`

**Frame time (ms)**  avg `101.76`, p50 `100.18`, p95 `111.85`, p99 `112.69`, p99.9 `114.59`, max `114.81`

**Client tick (ms)**  avg `0.27`, p95 `0.37`, max `1.75`

**Memory**  start `730 MB`, end `846 MB`, peak `846 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |        █    █                                                                  
 10.3 |        █    █                                          █                       
 10.2 |        █    █                                          █                       
 10.2 |        █    █                                          █                       
 10.1 |   █    ██   █                        █    █    █       █      █    █         █ 
 10.0 |██ ██ █ ██ █ ███ █ ██ █ ██   █ ██ ██  █ █  █ ██ ██ █  █ █  ██ ██ █  █ █    █  █ 
  9.9 |██ ██ █ ██ █ ███ ████ █ ██ █ █ █████ ██ █ ██ ██ ██ ██ █ ██ ██ ██ █ ██ █ ████ ██ 
  9.8 |██ ██ █ ██ █ ███ ████ █ ██ █ █ █████ ██ █ ██ █████ ██ █ ██ ██ ██ █ ██ █ ████ ██ 
  9.7 |██ ██ █ ██ █ ███ ████ █ ████ █ █████ ██ ████ █████ ██ █ ██ ██ ██ █ ██ █ ████ ██ 
  9.6 |██ ██ █ ████ ███ ████ █ ██████ █████ ██ ████ ████████ █ █████ ██ ████ █ ████████
  9.5 |███████ ████ ███ ████ ████████ ██████████████████████ █ █████ █████████ ████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms | ██  4
  92 ms |   1
  94 ms |   1
  98 ms | ████  9
  99 ms | ███████████████  35
 100 ms | ████████████████████████████████████████  96
 101 ms | █████  13
 102 ms |   1
 103 ms |   1
 104 ms |   1
 105 ms |   1
 106 ms |   1
 107 ms | █  2
 108 ms | █  3
 109 ms | █  2
 110 ms | ████  9
 111 ms | ███  7
 112 ms | ███  7
 113 ms |   1
 114 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.75`
- `fps_harmonic_avg` = `9.83`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `8.73`, p50 `9.98`, p95 `10.22`, p99 `10.93`, 1%low `8.75`, 0.1%low `n/a`, std `0.40`

**Frame time (ms)**  avg `101.64`, p50 `100.20`, p95 `111.92`, p99 `113.83`, p99.9 `114.43`, max `114.49`

**Client tick (ms)**  avg `0.24`, p95 `0.35`, max `1.72`

**Memory**  start `591 MB`, end `664 MB`, peak `1139 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                               █                                                
 10.2 |                               █                                                
 10.1 |                               █                     █                          
 10.1 |    █    █    █    █    █   ██ █       █             █   █         █     █     █
 10.0 |█ █ ██   ███  ███ ██ █ ██ █ ██ ███ ██ ██ █ ██ █ ██ █ ██  █ ███ █ █ ██ █ ██ ██ ██
  9.9 |█ █ ██  ████  ███ ██ █ ██ █ ██ ███ ██ ██ █ ██ █ ██ █ ██ ██ ███ █ █ ██ █ ██ ██ ██
  9.8 |█ █ ██ ██████ ██████ █ ██ █ ██ ██████ ██ █ ██ █ ██ █ ██ ██ ███ █ █ ██ █ ██ ██ ██
  9.7 |█ █ █████████ ██████ █ ██ █ ██ ██████ ██ █ ██ █ ████ ██ ██████ ███ ████ ██ ██ ██
  9.6 |█ █ ██████████████████ ████ ██ ██████ ████ ██ ██████ ██ ██████ ███ ████ ██ ██ ██
  9.6 |█ █ ██████████████████ ████ ██ █████████████████████ ██████████████████ █████ ██
  9.5 |███████████████████████████ ██ █████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms | ██  3
  94 ms | ██  3
  96 ms | █  1
  97 ms | ██  4
  98 ms | █████  9
  99 ms | █████████████████████  39
 100 ms | ████████████████████████████████████████  75
 101 ms | ███████████  21
 102 ms | ███  5
 103 ms | █  1
 104 ms | █  1
 105 ms | █  1
 106 ms | ██  4
 107 ms | ███  5
 108 ms | █  2
 109 ms | ██  4
 110 ms | █  1
 111 ms | ████  8
 112 ms | ██  4
 113 ms | ██  3
 114 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `n/a`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `9.84`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.75`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2240.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.61`, p50 `9.93`, p95 `10.19`, p99 `11.42`, 1%low `8.65`, 0.1%low `n/a`, std `0.45`

**Frame time (ms)**  avg `101.76`, p50 `100.68`, p95 `112.33`, p99 `113.84`, p99.9 `115.92`, max `116.09`

**Client tick (ms)**  avg `0.28`, p95 `0.74`, max `1.75`

**Memory**  start `920 MB`, end `655 MB`, peak `1184 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |            █                      █                █                           
 10.3 |            █                      █  █             █                           
 10.2 |            █                   █  █  █             █                           
 10.1 |     █      █   █ █   █       █ █  ██ █             █       █          █     █  
 10.0 |█  █ ██  ██ ██  █ █   █ █     █ █  ██ █  ██  █  █ █ █  █ ██ █ █   █ █  █     █ █
  9.9 |█ ██ ██ ███ ██  █ ██  █ ██ █ █████ ██ █  ██ ██ ██ █ ██ █ ██ █ ███ █ ██ ██   ██ █
  9.8 |█ ██ ██ ███ ██ ██ ██ ██ ██ █ █████ ██ ██ ██ ██ ██ █ ██ █ ██ █ ███ █ ██ ██ █ ██ █
  9.7 |█ ██ ██ ███ ██ ██ █████ ██ █ █████ ██ █████ ██ ████ ██ █ ██ █ ███ █ ██ ██ █ ██ █
  9.6 |█ ██ ██ ███ ██ ██ █████ ████ █████ ██ ████████ ████ ██ █ ██ █ ███ █ ██ ██ █ ██ █
  9.5 |████ ██████ █████ █████ ████ █████ ██ █████████████ ████ ██ █ █████ ████████████
  9.4 |█████████████████ ███████████████████ █████████████ ████ ███████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  87 ms | ██  2
  92 ms | ██  2
  93 ms | █  1
  95 ms | █  1
  97 ms | █  1
  98 ms | ██████████████████  24
  99 ms | █████████████████████████████████  43
 100 ms | ████████████████████████████████████████  52
 101 ms | █████████████████████  27
 102 ms | ██  3
 103 ms | ██  3
 105 ms | █  1
 106 ms | ██  2
 107 ms | ██  2
 108 ms | █████  7
 109 ms | ██  3
 110 ms | ████  5
 111 ms | ████  5
 112 ms | █████  6
 113 ms | ██  3
 115 ms | █  1
 116 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `4027.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `8.65`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `9.83`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `n/a`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.71`, p50 `9.98`, p95 `10.11`, p99 `10.43`, 1%low `8.73`, 0.1%low `n/a`, std `0.36`

**Frame time (ms)**  avg `101.74`, p50 `100.19`, p95 `111.48`, p99 `113.40`, p99.9 `114.70`, max `114.80`

**Client tick (ms)**  avg `0.27`, p95 `1.01`, max `2.07`

**Memory**  start `796 MB`, end `1016 MB`, peak `1016 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |    █                                                                           
 10.2 |    █                                                                           
 10.2 |    █                                                                           
 10.1 |    █                                  █       ██              █  █             
 10.0 | ██ ██ █ ███ █ ██ █ ██ ██ ██ █ ██ ██ █ ██ █ █  █████ █ ██ ██ █ █ ██ ██ █ ██ █ ██
  9.9 | ██ ██ █ ███ ████ █ ██ ██ ██ █ ██ ██ █ ██ █ █  █████ █ █████ █ █ █████ █ ██ █ ██
  9.8 | ██ ██ █ ███ ████ █ ██ ██ ██ █ ██ ██ █ ████ ██ █████ █ █████ █ █ █████ █ ██ █ ██
  9.7 |███ ██ █ ███ ██████ █████ ████████████ ████ ██ █████ ███████ █ █ ██████████ █ ██
  9.6 |███ ██ ████████████ ██████████████████ ████ ██ █████ ███████ █ █████████████████
  9.5 |███ ██ ███████████████████████████████ █████████████ ███████ ███████████████████
  9.4 |██████████████████████████████████████ █████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  92 ms |   1
  93 ms |   1
  95 ms |   1
  96 ms |   1
  98 ms | ████  10
  99 ms | █████████████████  39
 100 ms | ████████████████████████████████████████  92
 101 ms | ████  10
 102 ms | ██  4
 103 ms |   1
 104 ms |   1
 105 ms | █  2
 106 ms | ██  4
 107 ms | ███  7
 108 ms | █  3
 109 ms | ███  7
 110 ms |   1
 111 ms | █  3
 112 ms | ██  4
 113 ms | █  2
 114 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `9043.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `8.73`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3145.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.51`, p50 `9.98`, p95 `10.12`, p99 `10.42`, 1%low `8.63`, 0.1%low `n/a`, std `0.36`

**Frame time (ms)**  avg `101.77`, p50 `100.19`, p95 `110.26`, p99 `112.72`, p99.9 `116.89`, max `117.51`

**Client tick (ms)**  avg `0.26`, p95 `0.34`, max `1.50`

**Memory**  start `517 MB`, end `661 MB`, peak `661 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                                       █                        
 10.3 |                                                       █                        
 10.2 |                                                       █                        
 10.1 |                                   █         █         █                        
 10.0 | ██   ██   ██   ██  █ ██ █ ██ ██ █ ██ █  █ █ ████  █ █ ███   █ █  █ █  ██  █ █  
  9.9 | ██ █ ██ █ ██ █ ██ ██ ██ █ ██ ██ █ ██ ██ █ █ █████ █ █ ███   █ ██ █ ██ █████ █ █
  9.8 | ██ █ ██ █ ██ █ ██ ██ ██ █ ██ ██ █ ██ ██ █ █ █████ █ █ ███ ███ ██ █ ██ █████ █ █
  9.7 | ███████ █ ████ █████████████ ████ ██ ██ █ █ ███████ █ ███ ███ ██ █ ██████████ █
  9.6 |██████████ █████████████████████████████████ █████████ ███ ██████ █ ██████████ █
  9.5 |████████████████████████████████████████████ █████████ █████████████████████████
  9.4 |██████████████████████████████████████████████████████ █████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms |   1
  92 ms |   1
  96 ms |   1
  97 ms | █  2
  98 ms | ████  9
  99 ms | ████████████  28
 100 ms | ████████████████████████████████████████  97
 101 ms | ██████  15
 102 ms | ██  5
 103 ms | █  2
 105 ms | █  2
 106 ms | █  2
 107 ms | ██  6
 108 ms | ██  6
 109 ms | ███  8
 110 ms | ██  4
 111 ms |   1
 112 ms | ██  4
 114 ms |   1
 117 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.63`
- `fps_harmonic_avg` = `9.83`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `n/a`
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
- `blocks_per_toggle` = `256.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.69`, p50 `9.98`, p95 `10.12`, p99 `10.70`, 1%low `8.73`, 0.1%low `n/a`, std `0.39`

**Frame time (ms)**  avg `101.75`, p50 `100.19`, p95 `111.96`, p99 `113.15`, p99.9 `114.87`, max `115.09`

**Client tick (ms)**  avg `0.26`, p95 `0.41`, max `1.48`

**Memory**  start `848 MB`, end `1004 MB`, peak `1004 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                              █                                                 
 10.6 |                              █                                                 
 10.4 |                         █    █                                                 
 10.3 |         █               █    █                                                 
 10.2 |         █               █    █                                                 
 10.1 |   █     █   █    █    █ █  █ █        █   █         █    █    █    █         █ 
  9.9 |█ ██ █ █ ██ ██ ██ █ ██ █ ██ █ ███ ██ █ ██ ██ █ █ ██  █ ██ ████ █ █ ██ █ █ ██ ██ 
  9.8 |█ ████ █ ██ ██ ██ █ ██ █ ██ █ ██████ █ ██ ██ █ █ ██ ██ ██ ████ █ █ ██ ███ ██ ██ 
  9.7 |██████ █ ██ ██ ████ ██ █ ██ █ ██████ █ ██ ████ █ ██ ██ ██ ████ █ █ ██ ███ █████ 
  9.6 |████████ ██ ███████ ██ █ ██ █ ███████████████████████████ ████ █ ███████████████
  9.5 |███████████████████████████ █████████████████████████████ ██████ ███████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   1
  91 ms |   1
  93 ms |   1
  94 ms |   1
  96 ms |   1
  98 ms | ████  9
  99 ms | ███████████  28
 100 ms | ████████████████████████████████████████  99
 101 ms | ██████  16
 102 ms | ██  4
 104 ms |   1
 105 ms |   1
 106 ms | ██  4
 107 ms | █  3
 108 ms | ██  4
 109 ms | █  3
 110 ms | ██  5
 111 ms | ██  4
 112 ms | ███  7
 113 ms | █  2
 115 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.73`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `9.83`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.63`, p50 `9.98`, p95 `10.12`, p99 `10.93`, 1%low `8.67`, 0.1%low `n/a`, std `0.42`

**Frame time (ms)**  avg `101.78`, p50 `100.16`, p95 `112.30`, p99 `114.66`, p99.9 `115.68`, max `115.88`

**Client tick (ms)**  avg `0.26`, p95 `0.50`, max `1.57`

**Memory**  start `609 MB`, end `769 MB`, peak `769 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                           █                                    
 10.3 |                                           █                                    
 10.2 |                                           █                                    
 10.1 |                                           █                                    
 10.0 | ██ ██████ █ ██ ██ ███  ██ █  █ █  ██ ██ █ ██ ██ █ ██   ██ █ ██ ██ ██ █ ██ ██ ██
  9.9 | ██ ██████ ████ ██ ███  ██ █ ████ ███ ██ █ ██ ██ █ ██  ███ █ ██ ██ ██ █ ██ ██ ██
  9.8 | ██ ██████ ███████ ████ ██ █ ████ ███ ██ █ ██ ██ █ ██  ███ █ ██ ██ ████ ██ ██ ██
  9.7 | ██ ██████ ███████ ████ ██ ██████ ███ ██ █ ██ ██ █ ██  ███ ████ ██ ███████ ██ ██
  9.6 | █████████ ███████ ████ ██ ███████████████ ██ ██ █ ██  ███ ████ ██ ██████████ ██
  9.5 | ██████████████████████ ██ ███████████████ ██ ████ ██  ████████ ████████████████
  9.5 | ████████████████████████████████████████████ ██████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  2
  91 ms |   1
  92 ms | █  2
  98 ms | █████  11
  99 ms | ███████████████  35
 100 ms | ████████████████████████████████████████  94
 101 ms | ██████  13
 102 ms | █  2
 103 ms |   1
 104 ms |   1
 105 ms | █  2
 106 ms |   1
 107 ms | ██  4
 108 ms |   1
 109 ms | ██  5
 110 ms | ██  5
 111 ms | ██  4
 112 ms | ██  4
 113 ms | ██  4
 114 ms | █  3
 115 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `8053.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `8.67`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `n/a`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.78`, p50 `9.98`, p95 `10.10`, p99 `10.80`, 1%low `8.78`, 0.1%low `n/a`, std `0.40`

**Frame time (ms)**  avg `101.80`, p50 `100.18`, p95 `111.65`, p99 `113.36`, p99.9 `113.89`, max `113.92`

**Client tick (ms)**  avg `0.27`, p95 `0.59`, max `1.52`

**Memory**  start `643 MB`, end `763 MB`, peak `763 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                           █                                    
 10.3 |                                           █                               █    
 10.2 |                                           █                               █    
 10.1 |                                           █                               █    
 10.0 |█ █ ██ ██ ██ █ ██ █ ██ ██ █ ██ █ ██   ██ █ ███ █ ██ █ ██ █ ██ █ ██ ██ ██ █ ███ █
  9.9 |█ █ ██ ██ ██ █ ██ █ ██ ██ █ ██ █ ██ █ ██ █ ███ ████ █ ██ █ ██ █ ██ ██ ██ █ ███ █
  9.8 |█ █ ██ ██ ██ █ ██ █ ██ ██ █ ██ █ ██ █ ██ █ ███ ████ █ ██ █ ██ █ ██ ██ ██ █ ███ █
  9.7 |█ ███████ ██ █ ██ █ █████ █ ██ █ ██ █ ██ █ ███ ████ █ ██ ████ ███████ ██ █ ███ █
  9.6 |████████████ ████ █ ███████ ██ █ ██ █ ████ ███ ██████ ███████ ███████ ████ █████
  9.5 |█████████████████ █████████ ██ ████ ██████ ██████████ ███████ ████████████ █████
  9.4 |█████████████████████████████████████████████████████ ██████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms |   1
  91 ms |   1
  92 ms |   1
  95 ms | █  2
  98 ms | ███  7
  99 ms | ████████████  31
 100 ms | ████████████████████████████████████████  101
 101 ms | █████  13
 102 ms |   1
 105 ms | █  3
 106 ms | ██  4
 107 ms | █  2
 108 ms | ███  8
 109 ms | ██  4
 110 ms | █  3
 111 ms | ███  7
 112 ms | █  2
 113 ms | ██  5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `9.82`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `8.78`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `9.87`, min `7.72`, p50 `9.95`, p95 `10.78`, p99 `11.98`, 1%low `7.74`, 0.1%low `n/a`, std `0.64`

**Frame time (ms)**  avg `101.78`, p50 `100.45`, p95 `114.90`, p99 `121.40`, p99.9 `129.48`, max `129.60`

**Client tick (ms)**  avg `0.37`, p95 `1.07`, max `6.53`

**Memory**  start `794 MB`, end `1478 MB`, peak `1540 MB`, GC `44 events / 225 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                    █                                                           
 10.8 |                    █                                                           
 10.6 |                    █               █   █                                       
 10.4 |          █         █               █   █              █                  █     
 10.2 |█         █         █               █   █    █         █               █  █     
 10.1 |█      █  █   █ █   █ █    ██     █ █ █ █ █  █     ██  █  █ ██   ██  █ ██ █   ██
  9.9 |██ ██ ███ █ ███ ██  ████ █ ██  █ ██ █ █ ███ ██ ███████ ████ ██ █ ██  █ ██ ██ ███
  9.7 |██ ██████ █ ███ ██  █████████ ██ ██ ███ ███ ██ ███████ ████ ████████ █ ██ ██ ███
  9.5 |█████████ █ ███ ██  ███████████████████ ███ ██ ███████ ████ ██████████ ██ ██ ███
  9.4 |██████████████████  ███████████████████████ ████████████████████████████████████
  9.2 |███████████████████ ████████████████████████████████████████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  76 ms | █  1
  83 ms | ██  2
  85 ms | █  1
  87 ms | █  1
  89 ms | █  1
  92 ms | █████  5
  94 ms | █  1
  95 ms | █  1
  96 ms | ██████  6
  97 ms | ████████████  13
  98 ms | ██████████  11
  99 ms | ████████████████████████████████████████  43
 100 ms | ████████████████████████████  30
 101 ms | ████████████████████████  26
 102 ms | ███████  8
 103 ms | ███  3
 104 ms | ███████  7
 105 ms | █████  5
 106 ms | █  1
 108 ms | ████  4
 109 ms | ██  2
 110 ms | █  1
 111 ms | ███  3
 112 ms | ████  4
 113 ms | ████  4
 114 ms | ██  2
 115 ms | ███  3
 116 ms | ██  2
 117 ms | █  1
 118 ms | █  1
 121 ms | █  1
 128 ms | █  1
 129 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `seed` = `7411.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-14.00`
- `entity_count_sample_start` = `15.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `7.74`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23695 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `8.26`, p50 `9.96`, p95 `10.61`, p99 `11.76`, 1%low `8.35`, 0.1%low `n/a`, std `0.57`

**Frame time (ms)**  avg `101.73`, p50 `100.40`, p95 `113.80`, p99 `118.30`, p99.9 `120.54`, max `121.05`

**Client tick (ms)**  avg `0.32`, p95 `1.03`, max `1.63`

**Memory**  start `958 MB`, end `1718 MB`, peak `1907 MB`, GC `30 events / 209 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                    █                                        █                  
 10.5 |  █                 █                                        █                  
 10.4 |  █                 █                                  █     █                  
 10.3 |  █   █             █                 █                █     █                  
 10.1 |█ █   █   █  █      █  █         █  █ █   █   █  █  █  █     █     ██      █   █
 10.0 |█ █ █ █████ ██ █ ██ █  █████   █ █  █ █   ██ ██ ██  █  ████  ███ █ ███ ██ ██ █ █
  9.8 |█ ███ █████ ██ █ ██ ██ █████ ███ █  █ █  ███ █████ ██  ████  ███ █ ███ ██ ██ █ █
  9.7 |█ ███ █████ ████ ██ ██ █████████ ██ █ ██ █████████ ██  ████  █████ ███ ██ ██ █ █
  9.6 |█ ███ █████████████ ██ █████████ ████ ██ █████████ ███ ████  █████ ███ ██ ████ █
  9.4 |█ ███ █████████████ █████████████████ ████████████████ ████  ███████████████████
  9.3 |████████████████████████████████████████████████████████████ ███████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | ██  2
  85 ms | █  1
  87 ms | █  1
  88 ms | ██  2
  89 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | █  1
  94 ms | ███  3
  95 ms | ██  2
  96 ms | ███  3
  97 ms | ███  3
  98 ms | █████████████████████  23
  99 ms | ███████████████████████████████████  38
 100 ms | ████████████████████████████████████████  44
 101 ms | ███████████████  16
 102 ms | ████████  9
 103 ms | █████  6
 104 ms | ███  3
 105 ms | ██  2
 106 ms | ████  4
 107 ms | █  1
 108 ms | ██  2
 109 ms | █  1
 110 ms | ██  2
 111 ms | █████  5
 112 ms | ████  4
 113 ms | ██████  7
 114 ms | ████  4
 116 ms | ██  2
 118 ms | ██  2
 121 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `seed` = `7417.00`
- `preload_duration_ms` = `601.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-10.00`
- `entity_count_sample_start` = `11.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `8.35`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `62.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `7.65`, p50 `9.96`, p95 `10.43`, p99 `11.16`, 1%low `7.66`, 0.1%low `n/a`, std `0.52`

**Frame time (ms)**  avg `101.92`, p50 `100.45`, p95 `113.72`, p99 `124.26`, p99.9 `130.63`, max `130.64`

**Client tick (ms)**  avg `0.32`, p95 `0.59`, max `1.53`

**Memory**  start `1744 MB`, end `1066 MB`, peak `2166 MB`, GC `24 events / 188 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                             █                         █               █        
 10.5 |               █             █                         █               █        
 10.3 |               █             █                         █               █        
 10.1 |               █   █  █  █   █                      █  █      █        ██ █   ██
 10.0 | ████ █████    ██  ████  ███ █ ████  ████ ██████    ██ █████ ███  ████ █████  ██
  9.8 | ████ ███████  ██  ████  ███ █ ████  ████ ██████ █ ███ █████ ███ █████ █████ ███
  9.6 | ████ ███████████  █████ ███ █ ████ █████ ██████ █████ █████ ███ █████ █████ ███
  9.4 | ███████████████████████████ ██████ ██████████████████ █████ ███ █████ █████ ███
  9.3 | █████████████████████████████████████████████████████ █████ █████████ █████████
  9.1 |██████████████████████████████████████████████████████ ███████████████ █████████
  8.9 |██████████████████████████████████████████████████████ ███████████████ █████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | ██  2
  89 ms | █  1
  91 ms | █  1
  92 ms | █  1
  94 ms | ██  2
  95 ms | ████  4
  96 ms | ███  3
  97 ms | █████  5
  98 ms | ██████████████████████████  27
  99 ms | ████████████████████████████████████████  41
 100 ms | ████████████████████████  25
 101 ms | ███████████████████████████████  32
 102 ms | ███████████  11
 103 ms | ███  3
 104 ms | ███  3
 105 ms | ███  3
 106 ms | ████  4
 107 ms | █  1
 108 ms | ███  3
 109 ms | █████  5
 110 ms | █  1
 111 ms | ███  3
 112 ms | ███  3
 113 ms | █████  5
 115 ms | ███  3
 118 ms | █  1
 123 ms | █  1
 130 ms | ██  2
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `seed` = `7433.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `7.66`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.81`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `7.75`, p50 `9.95`, p95 `10.28`, p99 `11.37`, 1%low `7.84`, 0.1%low `n/a`, std `0.50`

**Frame time (ms)**  avg `101.73`, p50 `100.48`, p95 `113.19`, p99 `120.47`, p99.9 `128.50`, max `129.09`

**Client tick (ms)**  avg `0.31`, p95 `0.69`, max `1.50`

**Memory**  start `1350 MB`, end `2138 MB`, peak `2263 MB`, GC `24 events / 186 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                       █                     █     █                            
 10.4 |           █           █                     █     █                            
 10.2 |           █    █      █                     █     █          █                 
 10.1 |  █    █   █  █ █   █  █  █ █  ██  ██ █ █ █  █  █  █     ██ █ █       ██  █   █ 
  9.9 |████   ███ █  █ █ ████ ████ ██████ ████ ████ █ ██  ████  ████ ████   ████ █████ 
  9.8 |█████ ███████ ███ ████ ████ ██████ ████ ████ █ ██  █████ ████ █████  ████ █████ 
  9.6 |█████ ███████ ███ ████ ████ ██████ ████ ████ ████ ███████████ █████ █████ █████ 
  9.5 |█████████████ ███ ████ ████ ██████ ████ ████ ████ ███████████████████████ █████ 
  9.3 |█████████████████ ████ ████ ██████ ████ ████ ████████████████████████████ ██████
  9.1 |█████████████████ ████ ████ ████████████████████████████████████████████████████
  9.0 |█████████████████ ████ █████████████████████████████████████████████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  87 ms | ██  2
  90 ms | █  1
  91 ms | ██  2
  92 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | ██████  7
  98 ms | ███████████████████████  26
  99 ms | ██████████████████████████████  34
 100 ms | ████████████████████████████████████████  45
 101 ms | █████████████████████████  28
 102 ms | ████  5
 103 ms | ██████  7
 104 ms | █  1
 105 ms | ████  5
 106 ms | ██  2
 107 ms | █  1
 108 ms | ██████  7
 109 ms | ███  3
 111 ms | ██  2
 112 ms | ██  2
 113 ms | █████  6
 114 ms | █  1
 118 ms | ██  2
 120 ms | █  1
 126 ms | █  1
 129 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `seed` = `7451.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.84`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `9.80`, min `7.81`, p50 `9.96`, p95 `10.25`, p99 `10.83`, 1%low `7.83`, 0.1%low `n/a`, std `0.51`

**Frame time (ms)**  avg `102.33`, p50 `100.41`, p95 `113.03`, p99 `124.26`, p99.9 `127.95`, max `128.12`

**Client tick (ms)**  avg `0.33`, p95 `0.70`, max `1.79`

**Memory**  start `1086 MB`, end `1959 MB`, peak `2330 MB`, GC `21 events / 166 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                      █               █                                █  █     
 10.0 |█ ██     █     █   █  █ ██ █ █   █ █  █   █ █   █   ██   █  █   █  ██  ██ ██ █  
  9.9 |█████ ████  ████ ███  ████ ████  ███  ███ ███  ███ ████  █ ██  ███ ██████ █████ 
  9.8 |█████ ████  ████ ███  ████ ████  ███  ███ ███  ███ ████  █ ██  ███ ██████ █████ 
  9.7 |█████ ████ █████ ███ █████ ████  ███  ███ ███  ███ ████  █████ ███ ██████ █████ 
  9.5 |█████ ████ █████ ███ █████ ████ ████  ███ ████████ █████ █████████ ██████ █████ 
  9.4 |█████ ████ █████ ███ █████ ██████████ ███ ████████ █████ █████████ ██████ █████ 
  9.3 |█████ ██████████ ███ █████ ██████████████ ████████ ███████████████ ██████ ██████
  9.2 |█████ ██████████ ███ █████ ██████████████ ████████████████████████ ██████ ██████
  9.0 |█████ ██████████ █████████ ██████████████████████████████████████████████ ██████
  8.9 |████████████████ █████████ █████████████████████████████████████████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | █  1
  94 ms | ██  2
  96 ms | ███  3
  97 ms | ██████  6
  98 ms | █████████████████████  22
  99 ms | ████████████████████████████████████████  41
 100 ms | ████████████████████████████████████████  41
 101 ms | ████████████████████  20
 102 ms | ███████████  11
 103 ms | █  1
 104 ms | █████  5
 105 ms | ██  2
 106 ms | ██  2
 107 ms | ███  3
 108 ms | █  1
 109 ms | ██████  6
 110 ms | █  1
 111 ms | █████  5
 112 ms | █████████  9
 113 ms | ██  2
 114 ms | ██  2
 115 ms | ██  2
 117 ms | █  1
 124 ms | █  1
 127 ms | █  1
 128 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `seed` = `7457.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `17.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-13.00`
- `entity_count_sample_start` = `30.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.83`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.77`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24225 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `7.53`, p50 `9.96`, p95 `10.68`, p99 `11.46`, 1%low `7.56`, 0.1%low `n/a`, std `0.59`

**Frame time (ms)**  avg `101.80`, p50 `100.43`, p95 `113.13`, p99 `129.70`, p99.9 `132.54`, max `132.71`

**Client tick (ms)**  avg `0.33`, p95 `1.05`, max `4.12`

**Memory**  start `1818 MB`, end `2029 MB`, peak `2201 MB`, GC `25 events / 190 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                             █                                                  
 10.6 |                             █               █                                  
 10.4 |█                            █               █                   █              
 10.2 |█                  █         █            █  █      █     █      █              
 10.0 |█ ██    ██ ██ █ ██ ██ █  ██  █ ██ █ █ █   ██ ██ ██  █   ████ ███ █ ██  ██  ████ 
  9.8 |█ ████ ██████ ████ ██ █  ██ █████ █████  ███ █████ ████ ████ ███ ████  ███ ████ 
  9.6 |█████████████ ████ ████  ██ █████ █████ ████ █████ ████ ████ ███ █████ ███ ████ 
  9.4 |█████████████ ████ ████████ ████████████████ █████ █████████████ ███████████████
  9.2 |████████████████████████████████████████████ ███████████████████ ███████████████
  9.0 |████████████████████████████████████████████ ███████████████████ ███████████████
  8.8 |████████████████████████████████████████████████████████████████ ███████████████
  8.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  87 ms | ██  2
  88 ms | ███  3
  89 ms | ██  2
  90 ms | █  1
  92 ms | █  1
  93 ms | █  1
  94 ms | █  1
  95 ms | █  1
  96 ms | █████  5
  97 ms | █████  5
  98 ms | ██████████████████████  23
  99 ms | ██████████████████████████████  31
 100 ms | ████████████████████████████████████████  41
 101 ms | ████████████████████  20
 102 ms | ██████████████  14
 103 ms | ███████  7
 104 ms | ██  2
 105 ms | ███  3
 106 ms | ███  3
 107 ms | ██████  6
 108 ms | ██  2
 109 ms | █  1
 110 ms | █  1
 111 ms | █████  5
 112 ms | ████  4
 113 ms | ██  2
 115 ms | ██  2
 116 ms | ██  2
 118 ms | █  1
 123 ms | █  1
 129 ms | █  1
 131 ms | █  1
 132 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `seed` = `7477.00`
- `preload_duration_ms` = `1220.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `1.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.56`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23137 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `7.85`, p50 `9.96`, p95 `10.56`, p99 `11.00`, 1%low `7.92`, 0.1%low `n/a`, std `0.54`

**Frame time (ms)**  avg `101.87`, p50 `100.40`, p95 `114.49`, p99 `122.66`, p99.9 `126.92`, max `127.31`

**Client tick (ms)**  avg `0.33`, p95 `0.70`, max `2.64`

**Memory**  start `1518 MB`, end `1587 MB`, peak `2221 MB`, GC `24 events / 181 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                █                                                               
 10.4 |                █                                                         █     
 10.2 |                █                               █             █   █       █     
 10.1 | █           █  █  █         █  █  █  ██  █   █ █      █   █  █ █ █ █     ██    
  9.9 | █  ████ █████  ████  ███  █ █  ████  ███ █████ ██  ████  ██  ███ █ ███   █████ 
  9.8 |████████ █████ █████  ██████ █  █████ ███ █████ ███ ████  ██  █████ ███ █ █████ 
  9.6 |████████ █████ █████  ████████ ██████ ███ █████ ███ ████ ████ █████ ███ ███████ 
  9.5 |████████ █████ ███████████████ ██████ ███ █████ ███ ████ ████ █████ ███████████ 
  9.3 |██████████████ ██████████████████████████ █████ ████████ ████ █████ ████████████
  9.2 |█████████████████████████████████████████ █████ █████████████ █████ ████████████
  9.1 |███████████████████████████████████████████████████████████████████ ████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  90 ms | ██  2
  91 ms | █  1
  92 ms | ███  4
  94 ms | ████  5
  95 ms | ███  4
  97 ms | ███████  9
  98 ms | ███████████  15
  99 ms | ██████████████████████████  34
 100 ms | ████████████████████████████████████████  53
 101 ms | ███████████████  20
 102 ms | █████  7
 103 ms | ███  4
 104 ms | █  1
 105 ms | ███  4
 106 ms | ██  2
 107 ms | ██  3
 109 ms | ██  3
 110 ms | ██  2
 111 ms | ██  2
 112 ms | ██  3
 113 ms | ████  5
 114 ms | ███  4
 115 ms | ██  3
 118 ms | █  1
 121 ms | █  1
 122 ms | █  1
 125 ms | █  1
 127 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `seed` = `7481.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.92`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `67.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24647 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `7.14`, p50 `9.95`, p95 `10.92`, p99 `11.50`, 1%low `7.44`, 0.1%low `n/a`, std `0.61`

**Frame time (ms)**  avg `101.86`, p50 `100.46`, p95 `114.45`, p99 `119.04`, p99.9 `137.91`, max `140.12`

**Client tick (ms)**  avg `0.33`, p95 `1.07`, max `5.31`

**Memory**  start `1990 MB`, end `1260 MB`, peak `2314 MB`, GC `25 events / 193 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                                          █                                     
 10.7 |                                          █                                     
 10.5 |                                          █                                     
 10.3 |                                          █     █                               
 10.1 |  ██  █   █   █ █  █            █     ██  ██    █ █    █       █ █        ██    
  9.9 |  ███ ██████ ██ ██ ██  ██   ██ ██ ███ ███ ████  ████ ███ █████ █████ ███  █████ 
  9.7 |█████ ██████ ██ ██████ ███  ██ ██████ ███ ████  ████ ███ █████ █████ ███  █████ 
  9.5 |█████ ██████ ██ ██████████ ██████████████ █████ ████ ███ ███████████ ███████████
  9.3 |█████ ███████████████████████████████████ ██████████ ███████████████████████████
  9.2 |█████████████████████████████████████████ ██████████ ███████████████████████████
  9.0 |█████████████████████████████████████████ ██████████████████████████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  80 ms | █  1
  85 ms | █  1
  87 ms | ██  2
  89 ms | ██  3
  90 ms | ██  2
  91 ms | ██  2
  94 ms | █  1
  95 ms | ██  2
  96 ms | █  1
  97 ms | █████  6
  98 ms | ████████████  16
  99 ms | ███████████████████████  31
 100 ms | ████████████████████████████████████████  53
 101 ms | ████████████████  21
 102 ms | ██████████  13
 103 ms | ███  4
 104 ms | ██  2
 105 ms | ██  2
 106 ms | ██  3
 107 ms | ██  2
 108 ms | ███  4
 109 ms | ██  3
 110 ms | █  1
 111 ms | ██  2
 112 ms | ████  5
 113 ms | ██  3
 114 ms | █  1
 115 ms | ███  4
 116 ms | █  1
 117 ms | █  1
 118 ms | ██  2
 128 ms | █  1
 140 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `seed` = `7487.00`
- `preload_duration_ms` = `1539.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-30.00`
- `entity_count_sample_start` = `31.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `7.44`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `9.87`, min `7.27`, p50 `9.96`, p95 `10.80`, p99 `11.91`, 1%low `7.42`, 0.1%low `n/a`, std `0.71`

**Frame time (ms)**  avg `101.81`, p50 `100.35`, p95 `115.21`, p99 `124.04`, p99.9 `136.45`, max `137.54`

**Client tick (ms)**  avg `0.34`, p95 `1.01`, max `6.70`

**Memory**  start `1000 MB`, end `1325 MB`, peak `2300 MB`, GC `27 events / 211 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                █                                                               
 10.5 |     █          █                                             █                 
 10.3 |     █     █    █                                             ██                
 10.1 |     █    ██    █          █ █   █            █ █ █  █        ██            █   
 10.0 |████ ████ █████ █ ███   ██ ████  ███   ███  █ █ █ ██ ██  █ ██ ██████ ███    ███ 
  9.8 |████ ████ █████ █ ███   ██ ████  ███ █████ ██████ ██████ ████ ██████ ████ █████ 
  9.6 |████ ████ █████ █████ ████ ████  ███ █████ ██████ ███████████ ██████ ██████████ 
  9.4 |████ ████ ████████████████ ████ ████ ████████████ ███████████ ██████ ███████████
  9.3 |████ █████████████████████ ██████████████████████████████████ ██████ ███████████
  9.1 |████ ████████████████████████████████████████████████████████ ██████████████████
  8.9 |████ ████████████████████████████████████████████████████████ ██████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  68 ms | █  1
  81 ms | █  1
  84 ms | ██  2
  85 ms | █  1
  90 ms | █  1
  91 ms | █  1
  92 ms | █████  5
  93 ms | ██  2
  94 ms | ██  2
  95 ms | ███  3
  96 ms | ██  2
  97 ms | ███  3
  98 ms | ███████████████  16
  99 ms | █████████████████████████████████████  40
 100 ms | ████████████████████████████████████████  43
 101 ms | ████████████████  17
 102 ms | ████████  9
 103 ms | ███████  7
 104 ms | ████  4
 105 ms | ███  3
 106 ms | █  1
 107 ms | ██  2
 108 ms | ████  4
 109 ms | ████  4
 110 ms | ███  3
 111 ms | █  1
 112 ms | ████  4
 113 ms | ███  3
 114 ms | █  1
 115 ms | ██  2
 116 ms | ████  4
 121 ms | █  1
 122 ms | █  1
 123 ms | █  1
 131 ms | █  1
 137 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `seed` = `7499.00`
- `preload_duration_ms` = `99.00`
- `entity_count_sample_end` = `18.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-6.00`
- `entity_count_sample_start` = `24.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.42`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23372 ms  |  Sample ticks: 400

**FPS**  avg `9.87`, min `7.42`, p50 `9.97`, p95 `10.39`, p99 `11.32`, 1%low `7.83`, 0.1%low `n/a`, std `0.55`

**Frame time (ms)**  avg `101.69`, p50 `100.27`, p95 `113.07`, p99 `118.79`, p99.9 `132.01`, max `134.77`

**Client tick (ms)**  avg `0.30`, p95 `0.51`, max `1.91`

**Memory**  start `1054 MB`, end `1086 MB`, peak `2146 MB`, GC `26 events / 194 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                             █                                                  
 10.4 |                        █    █                                █                 
 10.3 |            █           █    █                                █  █ █            
 10.1 |   █   █ █  ██     ██   █ █  █   █  █  █ █ █    ██  ██ █   █  ██ ███ █     █    
  9.9 | ███  ████  █████  ███  ████ █████ █████ ████ █████ ████  ██  ██ ███████  ███  █
  9.7 | ███ ██████ ██████ ███ █████ █████ █████ ████ █████ ████  ███ ███████████████ ██
  9.6 | ██████████ ████████████████ █████ █████ ████████████████████ ██████████████████
  9.4 |███████████ ████████████████ █████ ██████████████████████████ ██████████████████
  9.2 |███████████ ████████████████ █████ ██████████████████████████ ██████████████████
  9.0 |██████████████████████████████████ ██████████████████████████ ██████████████████
  8.9 |██████████████████████████████████ █████████████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  75 ms | █  1
  88 ms | ██  2
  89 ms | █  1
  90 ms | █  1
  91 ms | █  1
  92 ms | █  1
  94 ms | █  1
  95 ms | █  1
  96 ms | ██  2
  97 ms | ██████  8
  98 ms | ███████████  14
  99 ms | ████████████████████████████████████████  50
 100 ms | █████████████████████████████████████  46
 101 ms | ███████████████  19
 102 ms | █████████  11
 103 ms | ██  2
 104 ms | ██  3
 105 ms | ██  2
 106 ms | ██  3
 107 ms | █  1
 108 ms | ███  4
 109 ms | █  1
 110 ms | █████  6
 111 ms | █  1
 112 ms | ███  4
 113 ms | ██  3
 114 ms | ██  2
 115 ms | █  1
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
 120 ms | █  1
 134 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `seed` = `7507.00`
- `preload_duration_ms` = `309.00`
- `entity_count_sample_end` = `32.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `30.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `7.83`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23162 ms  |  Sample ticks: 400

**FPS**  avg `9.87`, min `7.79`, p50 `9.96`, p95 `10.70`, p99 `11.48`, 1%low `7.91`, 0.1%low `n/a`, std `0.58`

**Frame time (ms)**  avg `101.64`, p50 `100.36`, p95 `113.79`, p99 `124.15`, p99.9 `127.62`, max `128.41`

**Client tick (ms)**  avg `0.31`, p95 `1.05`, max `2.93`

**Memory**  start `1637 MB`, end `980 MB`, peak `2216 MB`, GC `25 events / 198 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |      █                                                                         
 10.6 |      █                                             █                           
 10.5 |      █                          █                  █                           
 10.3 |      █              █           █      █           █     █          █          
 10.1 |   █  █   █ █ █    █ ██   █  █   █  █   █  ██ █ ██ ██  █  ███    █   ██ █ █     
  9.9 | ████ █████ █ ██ ███ ██████ ██   █████  █████ ████ ██████ ████  ████ ██ ███  ███
  9.7 | ████ █████ ████ ███ ██████ ████ █████ ██████ ████ ██████ ████ █████ ███████ ███
  9.6 | ████ █████ ████ ███ ██████ ████ █████ ██████ ████ ██████ ████ █████ ███████████
  9.4 | ████ █████ ████ ██████████ ████ █████ ███████████ ██████ ██████████ ███████████
  9.2 |█████ █████ ████████████████████ █████████████████ ██████ ██████████████████████
  9.0 |█████ ████████████████████████████████████████████ █████████████████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  85 ms | █  1
  87 ms | ████  4
  89 ms | █  1
  91 ms | █  1
  93 ms | ████  4
  94 ms | █  1
  95 ms | █  1
  96 ms | █████  5
  97 ms | ██████  6
  98 ms | ██████████████████  19
  99 ms | ██████████████████████████████████  37
 100 ms | ████████████████████████████████████████  43
 101 ms | ███████████████████████  25
 102 ms | ██████  6
 103 ms | ████  4
 104 ms | ████  4
 105 ms | █  1
 106 ms | ██  2
 107 ms | ██  2
 108 ms | █  1
 109 ms | ████  4
 110 ms | ██████  6
 111 ms | ███  3
 112 ms | ██  2
 113 ms | █████  5
 114 ms | ███  3
 116 ms | █  1
 122 ms | █  1
 124 ms | ██  2
 128 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `seed` = `7517.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `9.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `10.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.91`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.84`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `7.97`, p50 `9.94`, p95 `10.45`, p99 `11.05`, 1%low `8.19`, 0.1%low `n/a`, std `0.48`

**Frame time (ms)**  avg `101.84`, p50 `100.64`, p95 `112.61`, p99 `117.69`, p99.9 `124.17`, max `125.48`

**Client tick (ms)**  avg `0.30`, p95 `0.72`, max `4.48`

**Memory**  start `1481 MB`, end `2036 MB`, peak `2261 MB`, GC `21 events / 171 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |               █                                                                
 10.3 |               █                  █                                             
 10.2 |               █                  ██                          █                 
 10.0 |  ██  ██  █ █  ███    █      █ █  ███    ███  █ █ █ █    ███  █  █ █████  ██  ██
  9.9 | ███  ██  █ █  ██████ ████  ████  ████ █████  ███ █████  ███  ████ █████ ███ ███
  9.8 | ███  ██  █ ██ ██████ ████  ████  ██████████  ███ ██████ ███  ████ █████ ███ ███
  9.7 |████  ██  ████ ██████ ████  ████  ██████████  ███ ██████ ███  ████ █████ ███ ███
  9.5 |████████ █████ ███████████ ██████ ███████████████ ██████████  ████ █████ ███ ███
  9.4 |████████ █████ ███████████████████████████████████████████████████ █████ ███████
  9.3 |████████ █████████████████████████████████████████████████████████ █████████████
  9.2 |██████████████████████████████████████████████████████████████████ █████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms | █  1
  90 ms | ██  2
  91 ms | ██  3
  92 ms | █  1
  93 ms | █  1
  94 ms | █  1
  95 ms | ██  2
  96 ms | ██  2
  97 ms | █████████  11
  98 ms | ████████████  15
  99 ms | ████████████████████████████  34
 100 ms | ████████████████████████████████████████  49
 101 ms | ████████████████  19
 102 ms | █████████  11
 103 ms | ███  4
 104 ms | ██  3
 105 ms | ███  4
 106 ms | █  1
 107 ms | ██  3
 108 ms | ██  3
 109 ms | ██  3
 110 ms | █████  6
 111 ms | ██  3
 112 ms | ██████  7
 113 ms | ███  4
 117 ms | █  1
 118 ms | █  1
 125 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `seed` = `7523.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-35.00`
- `entity_count_sample_start` = `36.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `8.19`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194920 ms  |  Sample ticks: 3600

**FPS**  avg `9.87`, min `7.61`, p50 `9.98`, p95 `10.45`, p99 `11.07`, 1%low `7.94`, 0.1%low `7.70`, std `0.51`

**Frame time (ms)**  avg `101.62`, p50 `100.17`, p95 `113.00`, p99 `123.42`, p99.9 `128.35`, max `131.40`

**Client tick (ms)**  avg `0.65`, p95 `1.09`, max `9.66`

**Memory**  start `1104 MB`, end `984 MB`, peak `1964 MB`, GC `14 events / 80 ms`

**FPS over sampling window (ASCII):**

```
  9.9 |                       █                                                        
  9.9 |                  █    ██                       █                               
  9.9 |             █    █    ██      █    █           █           █  █ █    █     █  █
  9.9 |   █         █    █    ██      █    █   █       █  █   █  █ █ ██ ██  ██     █  █
  9.9 |   ██    █ █ █  █ ██   ██ █    ███ ██   █     ███  █  ██  █ █ ██ ██ ███ ██  █  █
  9.9 |██ ██   ██ █ █ ██ ██  ███ ████ ███████  █████ ██████ ███  ██████ ██ ███ ██ ██ ██
  9.8 |██████ ███ ██████████ ████████ ████████ █████ ██████ ████ ██████ ██ ███ ██ ██ ██
  9.8 |██████████ ██████████ ████████ ████████ █████ ██████ ████ ██████ ██ ██████ █████
  9.8 |██████████████████████████████ ██████████████ ██████ ████ ██████ █████████ █████
  9.8 |██████████████████████████████ ██████████████ ███████████ ██████████████████████
  9.8 |█████████████████████████████████████████████ ███████████ ██████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  75 ms |   1
  85 ms |   1
  86 ms |   2
  87 ms |   1
  88 ms |   5
  89 ms |   6
  90 ms | █  8
  91 ms |   6
  92 ms | █  11
  93 ms | █  13
  94 ms | █  18
  95 ms | ██  26
  96 ms | ██  26
  97 ms | ██  34
  98 ms | █████████  123
  99 ms | █████████████████████████████████  459
 100 ms | ████████████████████████████████████████  561
 101 ms | ███████████  150
 102 ms | ██  30
 103 ms | █  16
 104 ms |   4
 105 ms | █  11
 106 ms | █  20
 107 ms | █  16
 108 ms | ██  22
 109 ms | ██  23
 110 ms | ██  25
 111 ms | ███  36
 112 ms | ██  28
 113 ms | █  15
 114 ms | █  8
 115 ms |   1
 116 ms |   3
 117 ms |   4
 118 ms |   4
 119 ms |   4
 120 ms | █  12
 121 ms | █  8
 122 ms |   6
 123 ms | █  10
 124 ms |   4
 125 ms |   2
 126 ms |   2
 127 ms |   1
 128 ms |   4
 131 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `23.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `67.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.70`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.84`
- `fps_1pct_low` = `7.94`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194296 ms  |  Sample ticks: 3600

**FPS**  avg `9.88`, min `7.08`, p50 `9.98`, p95 `10.45`, p99 `11.05`, 1%low `7.92`, 0.1%low `7.33`, std `0.50`

**Frame time (ms)**  avg `101.54`, p50 `100.18`, p95 `112.73`, p99 `122.33`, p99.9 `131.05`, max `141.26`

**Client tick (ms)**  avg `0.63`, p95 `1.06`, max `1.63`

**Memory**  start `887 MB`, end `730 MB`, peak `1907 MB`, GC `11 events / 54 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                     █                                                          
 10.0 |                     █                                             █            
  9.9 |              █      █                                             █            
  9.9 |            █ █      █  █      █  █                 █ ██       █   █       █    
  9.9 |     █      █ █    █ █  █      █  █ █          █    █ ██       █   █    █  █    
  9.9 | █ ███      ███    █ █  █     ███ █ ██         ██   █ ███ █ █  ██  █    █  █    
  9.9 |██ ████ █   ███    █ █████ ██ ███ █ ██ █ █     ██   █ ███ ███████ ███ █ █████ █ 
  9.9 |█████████  ███████ █ ████████████ ████ █ ██   █████ █ ███ ███████████ ███████ ██
  9.8 |█████████  ███████ ██████████████ ███████████ █████ █████████████████████████ ██
  9.8 |█████████ ███████████████████████████████████ ███████████████████████████████ ██
  9.8 |█████████ ██████████████████████████████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  73 ms |   1
  83 ms |   2
  86 ms |   1
  87 ms |   2
  88 ms |   3
  89 ms |   5
  90 ms |   7
  91 ms | █  11
  92 ms |   5
  93 ms | █  20
  94 ms | █  11
  95 ms | ██  26
  96 ms | ██  30
  97 ms | ██  30
  98 ms | ████████  112
  99 ms | █████████████████████████████████  477
 100 ms | ████████████████████████████████████████  574
 101 ms | █████████  133
 102 ms | ██  34
 103 ms | █  13
 104 ms | █  19
 105 ms | █  9
 106 ms | █  9
 107 ms | █  16
 108 ms | ██  25
 109 ms | █  16
 110 ms | ██  32
 111 ms | ███  36
 112 ms | ██  35
 113 ms | █  11
 114 ms |   4
 115 ms |   7
 116 ms |   3
 117 ms |   4
 118 ms |   5
 119 ms | █  8
 120 ms | █  8
 121 ms | █  9
 122 ms |   3
 123 ms |   5
 124 ms |   3
 125 ms |   4
 126 ms |   1
 127 ms |   1
 130 ms |   1
 131 ms |   1
 141 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
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
- `fps_0p1pct_low` = `7.33`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.85`
- `fps_1pct_low` = `7.92`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193723 ms  |  Sample ticks: 3600

**FPS**  avg `9.89`, min `7.29`, p50 `9.99`, p95 `10.76`, p99 `11.20`, 1%low `8.30`, 0.1%low `7.50`, std `0.54`

**Frame time (ms)**  avg `101.41`, p50 `100.14`, p95 `112.82`, p99 `118.09`, p99.9 `122.82`, max `137.25`

**Client tick (ms)**  avg `0.64`, p95 `1.07`, max `7.30`

**Memory**  start `1180 MB`, end `1066 MB`, peak `1876 MB`, GC `11 events / 56 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                                      █                                         
 10.0 |                                   █  █                                         
 10.0 |                                   █  █                                         
 10.0 |       █                           █  █         █         ██                    
  9.9 |   ███ █                  █   █    █  █  █      █     █   ██                    
  9.9 |   ███ █           █  █   █   █ ██ █  ██ █    █ █   █ █ █ ██ █     ██ ██ █     █
  9.9 |  ████ █    ██     █  █   ██  ████ ██ ██ █  █ █ █████ █ ████ █    ███ ██ █ ███ █
  9.9 | ████████ █ ███   ██████ ████ ████ ██ ████ ████ ███████ ███████  ███████ █ █████
  9.8 | ██████████ ███ ██████████████████ ██ █████████ ████████████████ ███████ ███████
  9.8 |███████████ ██████████████████████ █████████████████████████████████████ ███████
  9.8 |██████████████████████████████████ █████████████████████████████████████ ███████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  71 ms |   1
  81 ms |   1
  83 ms |   1
  85 ms |   2
  86 ms |   2
  87 ms |   1
  88 ms | █  7
  89 ms | █  11
  90 ms | ██  24
  91 ms | █  18
  92 ms | ██  24
  93 ms | █  18
  94 ms | █  20
  95 ms | ███  35
  96 ms | █  17
  97 ms | ███  39
  98 ms | ███████  103
  99 ms | ███████████████████████████████  436
 100 ms | ████████████████████████████████████████  555
 101 ms | ████████  116
 102 ms | ██  29
 103 ms | █  7
 104 ms |   5
 105 ms |   4
 106 ms | █  7
 107 ms |   6
 108 ms | █  14
 109 ms | ██  23
 110 ms | ███  45
 111 ms | ██████  79
 112 ms | ███  45
 113 ms | █  20
 114 ms |   6
 115 ms | █  11
 116 ms | █  13
 117 ms | █  12
 118 ms | █  12
 119 ms |   3
 120 ms |   2
 129 ms |   1
 137 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
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
- `fps_0p1pct_low` = `7.50`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.86`
- `fps_1pct_low` = `8.30`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194778 ms  |  Sample ticks: 3600

**FPS**  avg `9.88`, min `7.35`, p50 `9.99`, p95 `10.59`, p99 `11.23`, 1%low `8.06`, 0.1%low `7.48`, std `0.55`

**Frame time (ms)**  avg `101.51`, p50 `100.13`, p95 `112.96`, p99 `119.82`, p99.9 `130.35`, max `136.13`

**Client tick (ms)**  avg `0.64`, p95 `1.06`, max `12.20`

**Memory**  start `1257 MB`, end `1518 MB`, peak `1943 MB`, GC `11 events / 54 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                            █                                            █    █ 
 10.0 |          █                ██                                          █ █    █ 
  9.9 | █        █                ███ █       █    █     █                    █ █ █  █ 
  9.9 | █        █            █   ███ █       █    █     █      █        █    █ █ █  █ 
  9.9 | █    █   █   █       ██   ███ █ █ █   █ █  █  █  █     ███  ██ █ █  █ █ █ █  █ 
  9.9 | ███ ██   ██  █     █ ██ █ ███ █ █ █ █████  █ ██  ██  █ ███  ██ █ █ ████ █ █  █ 
  9.9 | ███ ███  ██  █     █ ████████ █ █ █ █████  █████ ██  █████ ███ █ █ ██████ ██ █ 
  9.9 | ████████ ███ ██   ███████████ ███ █ ██████ █████████ ███████████ █ █████████ █ 
  9.8 | █████████████████ ███████████ ███ █ ██████ ███████████████████████ ███████████ 
  9.8 | █████████████████ ███████████ ████████████████████████████████████ ████████████
  9.8 | ███████████████████████████████████████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  73 ms |   1
  76 ms |   1
  78 ms |   1
  81 ms |   3
  84 ms |   1
  85 ms |   1
  87 ms |   2
  88 ms | █  7
  89 ms | █  16
  90 ms | █  9
  91 ms | █  10
  92 ms | █  18
  93 ms | █  14
  94 ms | ██  22
  95 ms | ███  33
  96 ms | ████  46
  97 ms | ███  43
  98 ms | █████████  110
  99 ms | ████████████████████████████████████  446
 100 ms | ████████████████████████████████████████  495
 101 ms | ███████████  133
 102 ms | ███  38
 103 ms | █  11
 104 ms |   2
 105 ms |   3
 106 ms | █  8
 107 ms |   5
 108 ms | █  16
 109 ms | ███  34
 110 ms | █████  61
 111 ms | ████  55
 112 ms | ███  41
 113 ms | ██  25
 114 ms | █  14
 115 ms | █  9
 116 ms |   5
 117 ms |   4
 118 ms |   4
 119 ms | █  8
 120 ms | █  7
 121 ms |   3
 122 ms |   1
 124 ms |   2
 129 ms |   2
 130 ms |   1
 131 ms |   1
 136 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.48`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.85`
- `fps_1pct_low` = `8.06`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`

