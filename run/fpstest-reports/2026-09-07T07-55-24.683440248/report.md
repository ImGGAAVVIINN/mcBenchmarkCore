# FPS Test session — 2026-09-06T22:29:31.965806587+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 109.0 | 36.5 | 13.9 | 20.38 | 0.55 | 4 | 48 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 112.8 | 40.2 | 19.6 | 20.60 | 0.61 | 1 | 436 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 29.5 | 18.9 | 13.4 | 45.92 | 0.60 | 3 | 356 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.9 | 28.5 | 28.1 | 34.88 | 0.63 | 2 | 204 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 29.9 | 28.6 | 28.4 | 34.67 | 0.59 | 1 | 272 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.9 | 28.5 | 27.1 | 34.43 | 0.41 | 1 | 108 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 29.9 | 28.7 | 28.4 | 34.79 | 0.60 | 1 | 300 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 30.0 | 26.7 | 24.0 | 35.18 | 1.04 | 4 | 60 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 30.1 | 26.1 | 23.6 | 37.29 | 2.90 | 5 | 337 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 30.2 | 24.6 | 23.3 | 39.28 | 3.90 | 10 | 246 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 29.9 | 28.3 | 28.1 | 35.17 | 0.88 | 4 | 459 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 29.9 | 28.3 | 26.6 | 34.58 | 0.42 | 4 | 102 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 30.1 | 24.9 | 23.3 | 38.71 | 3.39 | 5 | 285 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.0 | 25.3 | 22.1 | 37.58 | 2.43 | 2 | 76 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 36.4 | 17.2 | 16.3 | 55.25 | 14.83 | 29 | 374 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 36.9 | 17.3 | 17.2 | 56.43 | 15.49 | 29 | 359 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 30.0 | 27.6 | 27.2 | 36.01 | 1.76 | 2 | 396 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 30.0 | 26.5 | 23.1 | 36.08 | 1.77 | 4 | 589 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.7 | 9.9 | 9.9 | 100.29 | 0.58 | 1 | 268 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 10.0 | 9.9 | n/a | 101.33 | 0.30 | 0 | 108 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 10.0 | 9.8 | n/a | 102.02 | 0.24 | 1 | 436 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 10.0 | 9.8 | n/a | 102.23 | 0.27 | 1 | 184 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 10.0 | 9.8 | n/a | 101.37 | 0.27 | 0 | 124 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 10.0 | 8.9 | n/a | 109.16 | 0.37 | 47 | 816 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 10.0 | 9.2 | n/a | 107.60 | 0.32 | 35 | 407 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 10.0 | 8.8 | n/a | 109.31 | 0.31 | 22 | 648 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 10.0 | 8.8 | n/a | 105.86 | 0.36 | 26 | 296 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 10.0 | 8.7 | n/a | 111.42 | 0.35 | 20 | 958 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 10.0 | 9.4 | n/a | 106.08 | 0.30 | 28 | 912 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 10.0 | 8.7 | n/a | 111.37 | 0.31 | 25 | 827 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 10.0 | 9.0 | n/a | 111.41 | 0.29 | 25 | 757 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 10.0 | 9.0 | n/a | 107.22 | 0.38 | 25 | 230 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 10.0 | 8.8 | n/a | 109.51 | 0.26 | 26 | 888 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 10.0 | 9.1 | n/a | 107.39 | 0.32 | 26 | 832 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 10.0 | 8.5 | n/a | 109.63 | 0.29 | 26 | 1156 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 10.0 | 9.8 | n/a | 101.62 | 0.24 | 0 | 84 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 10.0 | 9.2 | n/a | 103.77 | 2.59 | 1 | 1268 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 10.0 | 9.7 | n/a | 101.51 | 0.25 | 0 | 216 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 10.0 | 9.9 | n/a | 101.40 | 0.25 | 0 | 136 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 10.0 | 9.8 | n/a | 101.30 | 0.25 | 0 | 160 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 10.0 | 9.9 | n/a | 101.32 | 0.26 | 0 | 152 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 10.0 | 9.5 | 9.2 | 102.69 | 0.63 | 14 | 1052 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 10.0 | 9.5 | 9.1 | 103.21 | 0.60 | 14 | 649 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.0 | 9.5 | 9.0 | 102.36 | 0.61 | 12 | 280 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.0 | 9.5 | 9.4 | 103.17 | 0.61 | 13 | 782 |

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

Category: **Particles**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `108.95`, min `11.41`, p50 `118.43`, p95 `131.54`, p99 `139.26`, 1%low `36.54`, 0.1%low `13.85`, std `57.91`

**Frame time (ms)**  avg `10.30`, p50 `8.44`, p95 `17.51`, p99 `20.38`, p99.9 `29.57`, max `87.61`

**Client tick (ms)**  avg `0.55`, p95 `0.87`, max `1.13`

**Memory**  start `820 MB`, end `615 MB`, peak `868 MB`, GC `4 events / 25 ms`

**FPS over sampling window (ASCII):**

```
156.0 |            █                              █                                    
151.2 |            █                              █                                    
146.4 |            █                              █                                    
141.7 |       █    █                              █                                    
136.9 |       █    █                              █                                    
132.1 |       █    █                              █        █                          █
127.4 |       █    █                              █        █                          █
122.6 |       █    █                              █        █                          █
117.8 |       █    █                              █        █                          █
113.1 |       █    █                █             ██       █                         ██
108.3 | ██ █  █  █ ██  █  ████  █  ████ ██  █  ██ █████ ██ █  █ ██ ██ ██ ██ ██  █ ██ ██
103.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms |   2
   2 ms |   1
   3 ms |   1
   4 ms |   2
   5 ms |   1
   6 ms |   1
   7 ms | ███████████  278
   8 ms | ████████████████████████████████████████  1027
   9 ms | ███████  177
  10 ms |   1
  11 ms |   4
  12 ms |   2
  13 ms |   10
  14 ms | ██  58
  15 ms | ████  99
  16 ms | █████  127
  17 ms | ███  76
  18 ms | █  30
  19 ms | █  17
  20 ms | █  13
  21 ms |   5
  22 ms |   1
  23 ms |   1
  24 ms |   1
  25 ms |   1
  27 ms |   1
  56 ms |   1
  87 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dragon_breath` | 160 | 242 | 109.8 | 20.26 |
| `end_rod` | 240 | 242 | 111.6 | 18.97 |
| `portal` | 160 | 242 | 106.9 | 20.08 |
| `ALL_TOGETHER` | 1680 | 242 | 106.4 | 19.02 |
| `sculk_charge_pop` | 240 | 242 | 111.6 | 19.94 |
| `smoke` | 160 | 242 | 109.3 | 18.86 |
| `flame` | 160 | 242 | 106.3 | 19.10 |
| `dripping_water` | 240 | 242 | 110.0 | 25.98 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `0.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `97.08`
- `fps_0p1pct_low` = `13.85`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `36.54`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `112.84`, min `16.03`, p50 `118.21`, p95 `132.52`, p99 `141.08`, 1%low `40.23`, 0.1%low `19.57`, std `86.35`

**Frame time (ms)**  avg `10.27`, p50 `8.46`, p95 `17.80`, p99 `20.60`, p99.9 `28.19`, max `62.37`

**Client tick (ms)**  avg `0.61`, p95 `0.95`, max `1.39`

**Memory**  start `467 MB`, end `851 MB`, peak `903 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
184.8 |                                         █                                      
176.9 |                                         █                                      
168.9 |                                         █                                      
161.0 |                   █                     █                                      
153.0 |                   █  ██                 █     █      █              █          
145.1 |      █            █  ██                 █     █   █  ██             █          
137.2 | █    █            █  ██                 █     █   █  ██             █          
129.2 | █    █       █    █  ██                 █     █   █  ██             █          
121.3 | █    █       █    █  ██                 █     █   █  ██             █          
113.3 | ██   █    █  █  █ █  ██                 █     █ █ █  ██ █     █  █  █  █  █    
105.4 |████████████████████████████████████████ ███████████████████████████████████████
 97.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   10
   1 ms |   3
   5 ms |   1
   6 ms |   5
   7 ms | ████████████  296
   8 ms | ████████████████████████████████████████  986
   9 ms | ████████  206
  11 ms |   1
  13 ms |   7
  14 ms | ██  37
  15 ms | ████  97
  16 ms | █████  126
  17 ms | ███  86
  18 ms | █  35
  19 ms | █  23
  20 ms | █  17
  21 ms |   6
  22 ms |   1
  23 ms |   1
  27 ms |   1
  39 ms |   1
  62 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `97.34`
- `preload_duration_ms` = `52.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `40.23`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.57`
- `entity_count_sample_end` = `201.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: -35976745 ms  |  Sample ticks: 400

**FPS**  avg `29.53`, min `13.44`, p50 `29.86`, p95 `30.75`, p99 `42.39`, 1%low `18.89`, 0.1%low `13.44`, std `5.52`

**Frame time (ms)**  avg `34.38`, p50 `33.49`, p95 `42.63`, p99 `45.92`, p99.9 `61.55`, max `74.40`

**Client tick (ms)**  avg `0.60`, p95 `0.91`, max `1.32`

**Memory**  start `577 MB`, end `561 MB`, peak `933 MB`, GC `3 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 40.0 |                  █                                                             
 38.8 |                  █                                                             
 37.6 |                  █                                                             
 36.4 |                  █                                                             
 35.3 |                  █                                                             
 34.1 |                  █                                                             
 32.9 |                  █                                                             
 31.7 |                  ██                                                            
 30.5 |██   █            ██           █████ █ █ ██ ██ █████ ██ ██  █ █ █ ██ ██ ██ ██ ██
 29.3 |██ █ █  █   ██    ███ █  █  █ ██████████████████████████████████████████████████
 28.1 |████ ██ ██████  ███████████ ████████████████████████████████████████████████████
 26.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   1
  17 ms |   1
  21 ms |   1
  22 ms |   2
  23 ms |   2
  31 ms | █  3
  32 ms | █████████████████████████████  158
  33 ms | ████████████████████████████████████████  217
  34 ms | ██████████████████████  121
  35 ms | █  6
  36 ms |   1
  37 ms | █  3
  38 ms | █  3
  39 ms | ██  9
  40 ms | █  8
  41 ms | █  6
  42 ms | ███  14
  43 ms | ██  9
  44 ms | █  6
  45 ms | █  5
  46 ms |   1
  47 ms |   2
  49 ms |   1
  52 ms |   1
  74 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.08`
- `preload_duration_ms` = `30.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `18.89`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `13.44`
- `entity_count_sample_end` = `201.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `29.93`, min `28.14`, p50 `29.90`, p95 `30.91`, p99 `31.22`, 1%low `28.52`, 0.1%low `28.14`, std `0.63`

**Frame time (ms)**  avg `33.43`, p50 `33.44`, p95 `34.45`, p99 `34.88`, p99.9 `35.23`, max `35.53`

**Client tick (ms)**  avg `0.63`, p95 `0.81`, max `1.07`

**Memory**  start `751 MB`, end `703 MB`, peak `956 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                       █                                        
 30.1 |                          █            █                        █        █      
 30.1 |    █  █      █  █     █  █     █      █  █              █      █  █     █      
 30.0 | █  █  █ ██   █  █  █  █  █  █  █  █   █ ██              █  █   █  █  █  █  █  █
 30.0 | █  █  █ ██  ██  █ ██  █  █  █  █  █ █ █ ██  █  █     █  █  █   █  █  █  █  █  █
 30.0 | █  █  █ ██  ██ ██ ██  █  █  █  █ ██ █ █ ██ ██  █ ██ ██  █  █   █ ██ ██  █ ██  █
 29.9 |██  ██ █ ██  ██ ██ ██  █  █  █  █ ██ █ █ ██ ██ ██ ██ ██  █ ██ █ █ ██ ██  █ ██ ██
 29.9 |██ ███ █ ██ ███ ██ ██ ██ ██████ █ ██ █ █ ██ ██ ████████ ██ ██████ ██ ██ ██ ██ ██
 29.8 |██ █████ █████████ █████ ███████████ ███ █████████████████ ██████ ██ ██ ██ █████
 29.8 |████████ ███████████████████████████ ███ ███████████████████████████████████████
 29.8 |████████ ███████████████████████████ ███ ███████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | █  6
  32 ms | ████████████████████████████████  194
  33 ms | ████████████████████████████████████████  240
  34 ms | ██████████████████████████  156
  35 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.92`
- `preload_duration_ms` = `76.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `28.52`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `28.14`
- `entity_count_sample_end` = `151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.36`, p50 `29.95`, p95 `30.71`, p99 `31.07`, 1%low `28.61`, 0.1%low `28.36`, std `0.57`

**Frame time (ms)**  avg `33.43`, p50 `33.39`, p95 `34.37`, p99 `34.67`, p99.9 `35.20`, max `35.26`

**Client tick (ms)**  avg `0.59`, p95 `0.87`, max `1.44`

**Memory**  start `647 MB`, end `699 MB`, peak `919 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                                                █            █  
 30.1 |           █              █                                     █            █  
 30.0 |     █     █  █  █  █   █ █                            █        █            █  
 30.0 | █   █  █  █  █  █  █   █ ██  █  █  █  █ █   █   █ ██ ██  █  █  █  █  █      █  
 30.0 | █   █  █  █ ██  █  █   █ ██  █ ██  █ ██ █   █   █ ██ ██ ██ ██  █ ██  █ ███  █  
 29.9 | ██ ██ ██  █ ██ ██ ██ ███ ██ ██ ██ ██ ██ █████ ███ ██ ██ ██ ██  █ ██ ██ ███  █ █
 29.9 | ██ ██ ██  █ ██ ██ ██ ███ ██ ██ ██ ██ ██ █████ ███ ██ ██ ██ ███ █ ██ ██ ███  █ █
 29.9 | █████ █████ ██ ██ ██ ███ ███████████ ██ █████████ ██ ██ ████████ █████ ██████ █
 29.8 |██████ ██████████████████ ██████████████ █████████ ██ ██ ███████████████████████
 29.8 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   2
  32 ms | ██████████████████████████████████  192
  33 ms | ████████████████████████████████████████  224
  34 ms | ████████████████████████████████  177
  35 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `32.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `28.61`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `28.36`
- `entity_count_sample_end` = `251.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `27.08`, p50 `29.96`, p95 `30.48`, p99 `30.70`, 1%low `28.51`, 0.1%low `27.08`, std `0.43`

**Frame time (ms)**  avg `33.43`, p50 `33.38`, p95 `34.11`, p99 `34.43`, p99.9 `35.69`, max `36.93`

**Client tick (ms)**  avg `0.41`, p95 `0.53`, max `0.69`

**Memory**  start `853 MB`, end `675 MB`, peak `961 MB`, GC `1 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                          █                                                     
 30.0 |            █             █          █                              █        █  
 30.0 |  █  █  █   █     █ █   █ █    █  █  █  █  █  █     █  █   █  █  █  █  █  █  █  
 29.9 | ██ ██  █   █  █ ██ █  ██ █   ██ ██  █  █  █  █ ██ ██  █   █ ██ ██  █  █ ██  █  
 29.9 | ██ ██ ██ █ █ ██ ██ ██ ██ █  ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ █
 29.9 | ██ ██ ██ █████████ ██ ██ █  ███ ██ ███████████ ██ ██ ███ ██ ██ ██ █████ ██ ████
 29.8 |███████████████████ █████ █ ████████████████████████████████████████████ ███████
 29.8 |███████████████████ █████ █ ████████████████████████████████████████████████████
 29.8 |███████████████████████████ ████████████████████████████████████████████████████
 29.7 |███████████████████████████ ████████████████████████████████████████████████████
 29.7 |███████████████████████████ ████████████████████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  32 ms | ███████████████  143
  33 ms | ████████████████████████████████████████  381
  34 ms | ████████  73
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `67.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `28.51`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `27.08`
- `entity_count_sample_end` = `101.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.42`, p50 `29.98`, p95 `30.70`, p99 `31.02`, 1%low `28.66`, 0.1%low `28.42`, std `0.57`

**Frame time (ms)**  avg `33.43`, p50 `33.36`, p95 `34.39`, p99 `34.79`, p99.9 `35.00`, max `35.18`

**Client tick (ms)**  avg `0.60`, p95 `0.83`, max `1.44`

**Memory**  start `615 MB`, end `704 MB`, peak `915 MB`, GC `1 events / 2 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                     █                                       █  
 30.1 |      █                 █            █  █                                    █  
 30.0 |      █  █  █           █ ██         █  █  █     █  █  ██        █  █     █  █  
 30.0 |  █   █  █  █     █  █  █ ██   █ ██  █  █  █     █  █  ██  █  █ ██  █  █  █  █  
 30.0 | ██   █  █  █     █ ██  █ ██ █ █ ██  █ ██  █     █  █  ██  █  █ ██  █  █  █  █  
 29.9 | ██ █ █ ██  █ ██ ██ ██  █ ██ ███ ██  █ ██ ██     █  ██ ██ ██  █ ██  █ ██ ██  █  
 29.9 | ██ ███ ██ ██ █████ ██  █ ██ ███ ██  █ ██ ██ █  ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ 
 29.9 | ██ ███ ██ ██ █████ ██ ██ ██ ███ ██ ██ ██ ██ █████ ███ ████████ ██ ██ ██ ██ ████
 29.8 |███ ███ █████████████████ ██ ███ █████ █████ █████████ ████████ ███████████ ████
 29.8 |███████ █████████████████ ██████ █████ ███████████████ █████████████████████████
 29.8 |██████████████████████████████████████████████████████ █████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   1
  32 ms | ██████████████████████████████████  195
  33 ms | ████████████████████████████████████████  229
  34 ms | ██████████████████████████████  172
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `66.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `28.66`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `28.42`
- `entity_count_sample_end` = `301.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `29.95`, min `23.95`, p50 `29.96`, p95 `31.06`, p99 `31.51`, 1%low `26.72`, 0.1%low `23.95`, std `1.03`

**Frame time (ms)**  avg `33.43`, p50 `33.38`, p95 `34.71`, p99 `35.18`, p99.9 `41.47`, max `41.75`

**Client tick (ms)**  avg `1.04`, p95 `1.19`, max `9.32`

**Memory**  start `896 MB`, end `900 MB`, peak `956 MB`, GC `4 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 30.8 |     █                                                                          
 30.7 |     █                                                                          
 30.6 |     █                                                                          
 30.5 |     █                                                                          
 30.4 |     █                                        █                                 
 30.3 |     █                                        █                                 
 30.2 |     █                                        █                                 
 30.1 |  █  █                  █            █  █     █        █   █  █  █     █     █  
 30.0 |  █  █   █  █  █  █  █  █ ██  █   █  █  █  █  █  █  █  █ █ █  █  █  █  █     █  
 29.9 |███ ██ ███ ██ ██ ██ ██  █ ██ ██ ███  █ ██ ██ ██ ██ ██ ██ ███ ██  █ ██  █ █████ █
 29.8 |█████████████████████████ ██████████████████████████████ ███ █████████████████ █
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  23 ms |   1
  28 ms |   1
  31 ms | ███  14
  32 ms | ███████████████████████████████████████  192
  33 ms | ████████████████████████████████████████  197
  34 ms | █████████████████████████████████████  182
  35 ms | ██  9
  41 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.92`
- `preload_duration_ms` = `62.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `26.72`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `23.95`
- `entity_count_sample_end` = `501.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `30.08`, min `23.58`, p50 `29.98`, p95 `33.06`, p99 `33.86`, 1%low `26.10`, 0.1%low `23.58`, std `2.23`

**Frame time (ms)**  avg `33.43`, p50 `33.36`, p95 `36.72`, p99 `37.29`, p99.9 `39.63`, max `42.41`

**Client tick (ms)**  avg `2.90`, p95 `3.54`, max `8.91`

**Memory**  start `653 MB`, end `573 MB`, peak `990 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 30.7 |                                              █                 █               
 30.6 |                                              █              █  █               
 30.5 |        █      █ █   █  █  █  █  █      █     █  █  █  █     █  █   █  █  █  █  
 30.4 |  █  █  █  █   █ ██  █  █  █  █  █  █   █  █  █  █  █  █  █  █  █   █  █  █  █  
 30.3 |  █  █  █  █  ██ ██  █  █  █  █  █  █   █  █  █  █  █  █  █  █  █   █  █  █  █  
 30.2 |  █  █  █ ██  ██ ██  █  █  █  █  █  █   █  █  █  █  █  █  █  █  █   █  █  █  █  
 30.1 | ██  █ ██ ██  ██ ██ ██ ██ ██  █ ██ ██ █ █ ██  █ ██ ██  █ ██  █  ██  █  █ ██  █  
 30.0 | ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██  █ ██ ██ ██ ██ ██  ██ ██ ██ ██  █ █
 29.9 | ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ █
 29.8 | ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ █████ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ █
 29.7 |██████ ██ ███████████████ ████████ ███████████████████████████ █████████████████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  26 ms |   1
  28 ms |   1
  29 ms | ████  17
  30 ms | ████████████████████████████████████████  175
  31 ms | █  6
  32 ms | █████  23
  33 ms | █████████████████████████████████████  164
  34 ms | ███  11
  35 ms | ███  12
  36 ms | ███████████████████████████████████████  172
  37 ms | ███  15
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `35.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `26.10`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `23.58`
- `entity_count_sample_end` = `501.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `30.21`, min `23.27`, p50 `29.94`, p95 `35.30`, p99 `37.01`, 1%low `24.64`, 0.1%low `23.27`, std `3.08`

**Frame time (ms)**  avg `33.44`, p50 `33.40`, p95 `38.53`, p99 `39.28`, p99.9 `42.73`, max `42.97`

**Client tick (ms)**  avg `3.90`, p95 `5.52`, max `8.61`

**Memory**  start `772 MB`, end `456 MB`, peak `1018 MB`, GC `10 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 31.5 |                                                                   █            
 31.3 |                                                                █  █     █      
 31.1 |                                                       █  █     █  █     █      
 30.9 |                                                █   █  █  █  █  █  █  █  █   █  
 30.8 |                                 █     █  █  █  █   █  █  █  █  █  █  █  █   █  
 30.6 |                           █  █  █  █  █  █  █  █   █  █  █  █  █  █  █  █   █  
 30.4 |█       █     █  █  █  █   █  █  █  █  █ ██  █  █   █  █  █  █  █  █  █  █ █ █  
 30.2 |█ █  █  █ ██  █  █  █  █   █ ██  █  █  █ ██  █  █   █ ██  █ ██  █  █ ███ █ ███  
 30.1 |███ ██ ██ ██ ██ ██ ██ ██ ███ ██  █ ██  █ ██  █ ██ █ █ ██ ██ ██ █████ █████ ███ █
 29.9 |███ ██ ██ ██ ██ ██ ██ ██ ███ ██ █████ ██ ██ █████ ███ ██ ██ ██ █████████████████
 29.7 |█████████ █████████████████████████████████ ████████████████████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  25 ms |   1
  26 ms | ██  5
  27 ms | █████  14
  28 ms | ████████████████  49
  29 ms | ████████████████  50
  30 ms | ███████████████████  58
  31 ms | ████████  25
  32 ms | ██████████████  43
  33 ms | ████████████████████████████████████████  123
  34 ms | ████████  24
  35 ms | ███████████  34
  36 ms | ███████████████████  57
  37 ms | ███████████████████  59
  38 ms | ██████████████  42
  39 ms | ████  12
  42 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `23.27`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `32.00`
- `fps_harmonic_avg` = `29.91`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `24.64`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `29.94`, min `28.13`, p50 `29.89`, p95 `31.13`, p99 `31.64`, 1%low `28.28`, 0.1%low `28.13`, std `0.81`

**Frame time (ms)**  avg `33.43`, p50 `33.45`, p95 `34.80`, p99 `35.17`, p99.9 `35.50`, max `35.55`

**Client tick (ms)**  avg `0.88`, p95 `1.04`, max `2.04`

**Memory**  start `567 MB`, end `736 MB`, peak `1027 MB`, GC `4 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 30.2 |          █                                                                     
 30.2 |          █   █        █                                                        
 30.1 |          █   █  █     █                     █  █               █  █            
 30.1 |          █   █  █  █  █  █  █            █  █  █  █        █   █  █  █  █  █   
 30.0 |       █  █   █  █  █  █  █  █  █  █   █  █  █  █  █  █  █  █   █  █  █  █  █  █
 30.0 |██  █  █  █ █ █  █  █  █ ██  █  █  █   █ ██  █  █  █  █  █ ██   █  █ ██  █  █  █
 30.0 |██  █  █  █ █ █ ██ ██  █ ██ ██  █  █  ██ ██ ██  █  █  █  █ ██   █ ██ ██ ██  █  █
 29.9 |██  ██ █  █ █ █ ██ ██  █ ██ ██ ██ ██  ██ ██ ██ ██ ██ ██ ██ ██ █ █ ██ ██ ██ ██ ██
 29.9 |████████  █ █ █ ██ ██  █ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██
 29.8 |█████████ █ ███ ██ █████ ██ ███████████████ ██ ███████████ ██████ ██ █████ █████
 29.8 |███████████████████████████ ███████████████ ██████████████ █████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | ███  18
  32 ms | ██████████████████████████████████  184
  33 ms | ████████████████████████████████████████  219
  34 ms | ██████████████████████████████  163
  35 ms | ███  15
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `66.00`
- `fps_1pct_low` = `28.28`
- `fps_harmonic_avg` = `29.92`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `28.13`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `26.61`, p50 `29.96`, p95 `30.50`, p99 `30.87`, 1%low `28.32`, 0.1%low `26.61`, std `0.45`

**Frame time (ms)**  avg `33.43`, p50 `33.38`, p95 `34.09`, p99 `34.58`, p99.9 `36.06`, max `37.58`

**Client tick (ms)**  avg `0.42`, p95 `0.57`, max `3.35`

**Memory**  start `913 MB`, end `637 MB`, peak `1016 MB`, GC `4 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |           █                                                                    
 30.1 |           █                                                                    
 30.0 |           █                                                                    
 30.0 |           █               █                                   █                
 30.0 |     █     █        █      █     █     █  █   █        █       ██  █      █  █  
 30.0 |  █  █     █  █ █   █  ██  █  █  █     █  █   █ ██  █  █  █    ██  █  ██  █  █  
 29.9 | ██ ██ ██  █  █ █   █  ██  █ ██  █ ██  █  █ █ █ ██ ██ ██  █ ██ ██ ██  ██  █ ██ █
 29.9 | ██ ██ ██  █ ██ ██ ███ ██ ██ ██ ██ ██ ██  █ ███ ██ ██ ██ █████ ██ ██ ███ ██ ██ █
 29.9 | ██ ██ █████ ██ ██ ███ ██ ██ ██ ██ ██ █████ ███ ██ ██ ████████ █████ ██████ ████
 29.9 | █████ ████████████████████████████████████████ ███████████████████████████ ████
 29.8 | █████ ████████████████████████████████████████ ████████████████████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  29 ms |   1
  32 ms | ██████████  105
  33 ms | ████████████████████████████████████████  435
  34 ms | █████  55
  35 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `26.61`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `63.00`
- `fps_harmonic_avg` = `29.91`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `28.32`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `30.15`, min `23.30`, p50 `29.95`, p95 `34.24`, p99 `35.71`, 1%low `24.93`, 0.1%low `23.30`, std `2.71`

**Frame time (ms)**  avg `33.43`, p50 `33.39`, p95 `37.65`, p99 `38.71`, p99.9 `41.42`, max `42.92`

**Client tick (ms)**  avg `3.39`, p95 `4.95`, max `14.39`

**Memory**  start `769 MB`, end `642 MB`, peak `1055 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 31.3 |       █                                                                        
 31.1 |      ██                                                                        
 31.0 |  █   ██                █                                                       
 30.8 |  █   ██                █                     █                                 
 30.7 |  █   ██ █  █  █  █     █                     █  █      █                       
 30.5 |  █ █ ██ █  █  █  █  █  █  █         █     █  █  █  █   █  █                    
 30.4 |  █ █ ████  █  █  █  █  █  █   █  █  █  █  █  █  █  █   █  █  █  █  █  █  █  █  
 30.2 | ██ ██████ ██ ██  █  █  █  █   █  █  █  █  █  █ ██ ██   █  █  █ ██  █ ██  █  █  
 30.1 | ██ ██████ ██ ██ ██ ██  █  █  ██ ██  █ ██ ██ ██ ██ ██  ██ ██ ██ ██ ██ ██ ██ ██ █
 29.9 | ██ ██████ ██ ██ ██ ██  █ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ █
 29.8 | ██ ██████████████████████████████████ ██ ██ █████ ████████████ ██ ██ ██████████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  27 ms | █  5
  28 ms | █████  18
  29 ms | ████████████  46
  30 ms | ██████████████████████████████  110
  31 ms | ██████  21
  32 ms | █████████  33
  33 ms | ████████████████████████████████████████  148
  34 ms | ███  12
  35 ms | ██████████  37
  36 ms | ████████████████████████████  105
  37 ms | ████████████  44
  38 ms | ████  13
  39 ms | █  3
  40 ms |   1
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `23.30`
- `preset_long` = `0.00`
- `preload_duration_ms` = `123.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.92`
- `fps_1pct_low` = `24.93`
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

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `30.04`, min `22.08`, p50 `30.02`, p95 `33.23`, p99 `34.17`, 1%low `25.33`, 0.1%low `22.08`, std `1.93`

**Frame time (ms)**  avg `33.43`, p50 `33.31`, p95 `36.84`, p99 `37.58`, p99.9 `42.09`, max `45.28`

**Client tick (ms)**  avg `2.43`, p95 `3.89`, max `11.74`

**Memory**  start `1038 MB`, end `1064 MB`, peak `1114 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 31.4 |  █                                                                             
 31.2 |  █                                                                             
 31.1 |  █                                                                             
 30.9 |  █                                                                             
 30.7 |  █     █                                                                       
 30.6 |  █  █  █                                           █     █                     
 30.4 |  █  █  █   █                           █        █  █     █                  █  
 30.3 |  █ ██  █   █  █  █  █  █  █  █      █  █  █  █  █  █  █  █   █  █     █     █  
 30.1 | ██ ██ ███ ██ ██  █ ██ ██  █  █  █ █ █  █ ██  █  █  █ ██  █ ███  █  █  █  █  █  
 29.9 | ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ █
 29.8 | █████ ████████████ █████ ███████████████ ██ █████ █████████████████████████████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  26 ms |   1
  28 ms | █  2
  29 ms | ██████  24
  30 ms | ████████████  48
  31 ms | ██████████████████████████████  115
  32 ms | ████████████  45
  33 ms | ████████████████████████████████████████  154
  34 ms | ███████  28
  35 ms | █████████████████████████████  112
  36 ms | ███████████  42
  37 ms | ██████  23
  38 ms | █  2
  39 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `explosions_count` = `397.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `22.08`
- `preset_long` = `0.00`
- `preload_duration_ms` = `33.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.92`
- `fps_1pct_low` = `25.33`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `199.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.16`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `140.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `36.44`, min `16.27`, p50 `29.84`, p95 `73.09`, p99 `98.47`, 1%low `17.18`, 0.1%low `16.27`, std `19.51`

**Frame time (ms)**  avg `33.42`, p50 `33.51`, p95 `52.90`, p99 `55.25`, p99.9 `60.43`, max `61.47`

**Client tick (ms)**  avg `14.83`, p95 `20.93`, max `29.59`

**Memory**  start `748 MB`, end `436 MB`, peak `1122 MB`, GC `29 events / 97 ms`

**FPS over sampling window (ASCII):**

```
 56.4 |                                                          █                     
 54.0 |                     █                                    █                     
 51.6 |             █       █                                    █                     
 49.2 |             █       █                 █                  █                     
 46.9 |             ██     ██                 █            █     █                     
 44.5 |             ██     ██           █     █            █     █                     
 42.1 |       █     ███    ██    █      ██    █     █ █    █     █     █               
 39.8 |       ██    ███    ██    █      ██    █     █ █    █     ██    █               
 37.4 | █  █  ███ █ ███   ████   ██ █   ██ █  █  █  ████   ██ █  ██ █  ████  █         
 35.0 | ████  █████ █████ █████  █████ █████  ████  ████  █████  ██ █ █████  █ ██   █  
 32.7 |██████████████████████████████████████████████████████████████████████████  ██  
 30.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   6 ms | █  1
   7 ms | █  1
   8 ms | █  1
   9 ms | █  1
  10 ms | █  2
  11 ms | ██  3
  12 ms | ██████  11
  13 ms | ███████  14
  14 ms | ██████████  19
  15 ms | ██  4
  16 ms | ██  3
  17 ms | █████  10
  18 ms | █████████████████  32
  19 ms | ████████████████████████████  54
  20 ms | ███████  13
  21 ms | ██  3
  22 ms | █  2
  23 ms | ██  3
  24 ms | ███  5
  25 ms | ██  4
  26 ms | █  1
  27 ms | ███  6
  28 ms | ████  7
  29 ms | ██  3
  30 ms | ████  8
  31 ms | █████  9
  32 ms | ██████████████████  34
  33 ms | ████████████████████████████████████████  76
  34 ms | ████████████████████  38
  35 ms | █████████  17
  36 ms | ████  7
  37 ms | ███  5
  38 ms | ████  7
  39 ms | ████  8
  40 ms | █  1
  41 ms | █  1
  42 ms | ████  7
  43 ms | ████  8
  44 ms | █  2
  45 ms | █  2
  46 ms | ████  7
  47 ms | ████████████████████████████  54
  48 ms | █████████████████  33
  49 ms | ████  8
  50 ms | ██  4
  51 ms | █████  9
  52 ms | ███████████  21
  53 ms | █████████  17
  54 ms | ██  4
  55 ms | █  2
  56 ms | █  1
  57 ms | █  2
  59 ms | █  1
  61 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `preload_duration_ms` = `61.00`
- `falling_blocks_landed` = `26888.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.92`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `16.27`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4806.99`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `17.18`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `36.92`, min `17.15`, p50 `30.04`, p95 `75.36`, p99 `105.64`, 1%low `17.31`, 0.1%low `17.15`, std `19.65`

**Frame time (ms)**  avg `33.45`, p50 `33.29`, p95 `54.13`, p99 `56.43`, p99.9 `58.29`, max `58.30`

**Client tick (ms)**  avg `15.49`, p95 `21.63`, max `26.96`

**Memory**  start `760 MB`, end `435 MB`, peak `1120 MB`, GC `29 events / 94 ms`

**FPS over sampling window (ASCII):**

```
 53.7 |         █                                                                      
 51.5 |         █                                                                      
 49.3 |         █               █                           █                          
 47.2 |         █     █         █                     █     █                          
 45.0 |        ██     █         █  █            █     █     █                          
 42.8 |        ██     █     █   █  █     █      █    ██     █     █    █               
 40.7 |      █ ██  ████     ██  █ ██   █ █      █    ██    ██     █    ███             
 38.5 |  █   █ ██  ████    ███  █ ██  █████  ████  ████  █ ██  █ ██   ████  █          
 36.3 |  █   █ ██  ████  █████  ████  █████  ████  █████ ████  █ ██   ████ ██  █       
 34.2 |████ █████ █████ ██████ █████ ██████ █████████████████ ██ ███ █████ █████     █ 
 32.0 |█████████████████████████████████████████████████████████████████████████ ██ ██ 
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | █  1
   8 ms | ██  4
   9 ms | ██  3
  10 ms | ██  3
  11 ms | ██  4
  12 ms | █████  10
  13 ms | ████████████  21
  14 ms | █████████  16
  15 ms | ██  4
  16 ms | █  2
  17 ms | ██████████  19
  18 ms | ██████████████████████████  47
  19 ms | ████████████████  29
  20 ms | ██  3
  21 ms | █  1
  22 ms | █  1
  23 ms | █████  9
  24 ms | ████  7
  25 ms | █  1
  26 ms | ██  4
  27 ms | ████  7
  28 ms | ███████  12
  29 ms | ████  8
  30 ms | ████  7
  31 ms | █████  10
  32 ms | ████████████████████████  43
  33 ms | ████████████████████████████████████████  73
  34 ms | █████████████████  31
  35 ms | ███  6
  36 ms | ██  3
  37 ms | █████  9
  38 ms | ████  7
  39 ms | ███  5
  41 ms | █  1
  42 ms | ████  7
  43 ms | █████  10
  44 ms | ██  4
  45 ms | █  1
  46 ms | █  1
  47 ms | █████████  17
  48 ms | █████████████████████  39
  49 ms | ███████████████████  35
  50 ms | ███████  12
  51 ms | ██  3
  52 ms | ████  8
  53 ms | █████████  16
  54 ms | ██████████  19
  55 ms | ████  8
  56 ms | █  2
  57 ms | █  1
  58 ms | ██  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `preload_duration_ms` = `33.00`
- `falling_blocks_landed` = `23688.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.90`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `17.15`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4798.58`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `17.31`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `29.98`, min `27.20`, p50 `29.94`, p95 `32.07`, p99 `32.52`, 1%low `27.58`, 0.1%low `27.20`, std `1.38`

**Frame time (ms)**  avg `33.42`, p50 `33.40`, p95 `35.68`, p99 `36.01`, p99.9 `36.53`, max `36.76`

**Client tick (ms)**  avg `1.76`, p95 `2.41`, max `2.99`

**Memory**  start `766 MB`, end `919 MB`, peak `1162 MB`, GC `2 events / 5 ms`

**FPS over sampling window (ASCII):**

```
 30.4 |             █                                                                  
 30.3 |          █  █     █      █  █     █                                            
 30.2 |    █  █  █  █  █  █   █  █  █  █  █  █     █   █  █  █  █     █     █          
 30.2 |    █  █  █  █  █  █   █  █  █  █  █  █     █   █  █  █  █  █  █  █  █   █      
 30.1 | █  █  █  █ ██  █  █   █  █  █  █  █  █  █  █   █  █  █  █  █  █  █  █   █      
 30.0 | █ ██ ██ ██ ██  █ ██ ███  █ ██ ██  █ ██ ██ ██   █ ██ ██  █  █  █  █  █ █ █     █
 30.0 |██ ██ ██ ██ ██ ██ ██ ███  █ ██ ██  █ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██  █ ███ █████
 29.9 |██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ █████ ███ ██ ██ ██ ██ ██ ██ ██ ███ █████
 29.8 |██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ █████ ███ ██ ██ ██ ██ ██ ██ ██ ███ █████
 29.8 |██ ██ █████ ██████████████████ ████████ ████████████ ████████ ████████ █████████
 29.7 |█████ █████ ████████████████████████████████████████████████████████████████████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  28 ms |   1
  30 ms | ████  18
  31 ms | ███████████████████████████  137
  32 ms | █████████  46
  33 ms | ████████████████████████████████████████  203
  34 ms | ████████  40
  35 ms | █████████████████████████████  147
  36 ms | █  7
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `preload_duration_ms` = `33.00`
- `falling_blocks_landed` = `3234.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.92`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `27.20`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.35`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `27.58`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `29.99`, min `23.10`, p50 `29.94`, p95 `32.09`, p99 `32.44`, 1%low `26.53`, 0.1%low `23.10`, std `1.46`

**Frame time (ms)**  avg `33.43`, p50 `33.40`, p95 `35.76`, p99 `36.08`, p99.9 `39.43`, max `43.30`

**Client tick (ms)**  avg `1.77`, p95 `2.41`, max `8.76`

**Memory**  start `565 MB`, end `790 MB`, peak `1155 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 30.5 |                          █                                                     
 30.5 |                          █                                                     
 30.4 |                          █          █                                          
 30.3 |         █  █  █  █  █    █          █           █            █                 
 30.2 |     █   █  █  █  █  █  █ ██  █   █  █  █  █  █  █  █  █   █  █     █  █        
 30.1 |     █   █  █  █  █  █  █ ██  █   █  █  █  █  █  █  █  █   █  █  █  █  █  █  █  
 30.1 |  █  █   █ ██ ██ ██ ██  █ ██  █  ██  █  █ ██ ██  █  █  █  ██  █ ██  █  █  █  █  
 30.0 | ██ ██  ██ ██ ██ ██ ██ ██ ██ ██  ██  █ ██ ██ ██ ██ ██ ██ ███  █ ██ ██  █ ██  █ █
 29.9 | ██ ███ ██ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██  █ █
 29.8 | ██████ ██ ██ ██ ██ ██ ██ ████████████ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ███████
 29.7 |███████████████████ █████████████████████ ██████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  25 ms |   1
  30 ms | ███  15
  31 ms | █████████████████████████████  142
  32 ms | ██████████  50
  33 ms | ████████████████████████████████████████  194
  34 ms | ██████████  48
  35 ms | ████████████████████████████  137
  36 ms | ██  10
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `preload_duration_ms` = `40.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.92`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `23.10`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `26.53`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23195 ms  |  Sample ticks: 400

**FPS**  avg `28.74`, min `9.87`, p50 `29.91`, p95 `30.64`, p99 `30.87`, 1%low `9.91`, 0.1%low `9.87`, std `4.77`

**Frame time (ms)**  avg `37.42`, p50 `33.43`, p95 `99.91`, p99 `100.29`, p99.9 `101.26`, max `101.32`

**Client tick (ms)**  avg `0.58`, p95 `0.71`, max `7.00`

**Memory**  start `888 MB`, end `676 MB`, peak `1156 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 30.4 |                                                   █                            
 30.4 |                                                   █                            
 30.3 |                                                   █                            
 30.3 |                                                   █                            
 30.2 |                                                   █                            
 30.2 |                                                   █                            
 30.1 |                                                   █                            
 30.0 |                                                   █                            
 30.0 |    █  █                                 █  █    █ █             ██    █   █    
 29.9 |██ █████ ████ █ █ ████ ████ █ ███ █  ██  ██ ███ ██ █ ███████ █ █ ███   ███ █████
 29.9 |███████████████████████████████████ ████████████████ ███████████████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  26 ms |   1
  31 ms |   1
  32 ms | █████████████████████████  150
  33 ms | ████████████████████████████████████████  237
  34 ms | ███████████████████  113
  40 ms |   1
  99 ms | █  8
 100 ms | ████  21
 101 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `9.91`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `26.73`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `9.87`
- `seed` = `5099.00`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.85`, p50 `9.99`, p95 `10.08`, p99 `10.09`, 1%low `9.86`, 0.1%low `n/a`, std `0.05`

**Frame time (ms)**  avg `100.14`, p50 `100.15`, p95 `101.07`, p99 `101.33`, p99.9 `101.46`, max `101.49`

**Client tick (ms)**  avg `0.30`, p95 `0.52`, max `1.26`

**Memory**  start `798 MB`, end `906 MB`, peak `906 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                                        █                                       
 10.0 |            █       █         █         █                                    █  
 10.0 |            █       █         █         █                                    █  
 10.0 |            █       █         █         █                                    █  
 10.0 |  █ █       █       █       █ █         █      █            █   █            █  
 10.0 |  █ █  █ █  █   ██  █ █ ██  █ █ █ █     █   █  █ █ █    █ █ █ █ █     █ ███  ██ 
 10.0 |███ █  ████ ███████ ███ ██  █ █████████ ██ █████ ████████ █ ███████████ ████ ███
 10.0 |███████████ ███████ ███████ █ █████████ ████████████████████████████████████ ███
 10.0 |███████████ ███████ █████████ █████████ ████████████████████████████████████ ███
 10.0 |███████████████████ █████████ █████████ ████████████████████████████████████ ███
 10.0 |███████████████████ ████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms |   1
  99 ms | ███████████████  50
 100 ms | ████████████████████████████████████████  136
 101 ms | ████  13
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9540.00`
- `preload_duration_ms` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `9.86`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23135 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.78`, p50 `9.99`, p95 `10.11`, p99 `10.17`, 1%low `9.79`, 0.1%low `n/a`, std `0.09`

**Frame time (ms)**  avg `100.14`, p50 `100.07`, p95 `101.46`, p99 `102.02`, p99.9 `102.20`, max `102.25`

**Client tick (ms)**  avg `0.24`, p95 `0.40`, max `1.29`

**Memory**  start `690 MB`, end `770 MB`, peak `1126 MB`, GC `1 events / 5 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                                   █                            
 10.1 |                  █                                █                            
 10.1 |   █         █  █ █                                █                            
 10.0 | █ █  █    █ █  █ █  █ █  █ █  █    █    █ █  █ █  █ █  █ █  █      █  █ █  █ █ 
 10.0 | █ █  █ █  █ █  █ █  █ █  █ █  █ █  █  █ █ █  █ █  █ █  █ █  █ █    █  █ █  █ █ 
 10.0 | █ █  █ █  █ █  █ ██ █ █  █ █  █ █  █ ██ █ █  █ █  █ █  █ ██ █ ██ █ █  █ █  █ █ 
 10.0 | █ ██ █ █  █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ ████ █ ██ █ ██
 10.0 | █ ██ █ ████ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ ████ █ ██ █ ██
  9.9 | █ █████████ ██ █ █████████ █████████ █████████ ██ ██████ ██ █████████ █████████
  9.9 |████████████ ████ ████████████████████████████████ █████████████████████████████
  9.9 |█████████████████ ████████████████████████████████ █████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  96 ms | █  1
  98 ms | ████████  14
  99 ms | ████████████████████████████████████████  68
 100 ms | ███████████████████████████████████  60
 101 ms | ████████████████████████████████  54
 102 ms | ██  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `9.99`
- `preload_duration_ms` = `1.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `9.79`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2224.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.75`, p50 `9.99`, p95 `10.13`, p99 `10.16`, 1%low `9.76`, 0.1%low `n/a`, std `0.10`

**Frame time (ms)**  avg `100.14`, p50 `100.08`, p95 `101.64`, p99 `102.23`, p99.9 `102.49`, max `102.55`

**Client tick (ms)**  avg `0.27`, p95 `0.47`, max `1.37`

**Memory**  start `970 MB`, end `729 MB`, peak `1154 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                             █                                  
 10.1 |                                             █                                  
 10.0 |                           █   █             █ █                                
 10.0 | █                 █   █   █ █ █   █       █ █ █   █   █   █ █ █   █ █ █ █     █
 10.0 | █ █ █     █ █  █  █   █ █ █ █ █ █ █ █ █ █ █ █ █ █ █   █ █ █ █ █ █ █ █ █ █ █   █
 10.0 | █ █ ████ ██ █  ██ █  ██ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ ███
 10.0 | █ ███████████ █████ █████ █ █ █ █ █ ███████ █ █ ███ █████ █ █ ███ █ █ █ █ █████
 10.0 |██████████████████████████ █ █ ███ █████████ █ █ █████████████ █████ ███ ███████
  9.9 |██████████████████████████ █████████████████ ███████████████████████████ ███████
  9.9 |████████████████████████████████████████████ ███████████████████████████████████
  9.9 |████████████████████████████████████████████ ███████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  97 ms | █  1
  98 ms | ██████████████████  31
  99 ms | ████████████████████████████████████  62
 100 ms | ████████████████████████████████████████  68
 101 ms | ██████████████████  31
 102 ms | ████  7
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `9.76`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `9.99`
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

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.83`, p50 `9.98`, p95 `10.09`, p99 `10.12`, 1%low `9.83`, 0.1%low `n/a`, std `0.06`

**Frame time (ms)**  avg `100.14`, p50 `100.16`, p95 `101.18`, p99 `101.37`, p99.9 `101.75`, max `101.77`

**Client tick (ms)**  avg `0.27`, p95 `0.57`, max `1.45`

**Memory**  start `901 MB`, end `1025 MB`, peak `1025 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |      █                                                                         
 10.1 |      █                                                                         
 10.0 |      █    █                   █    █    █    █    █              █    █    █   
 10.0 | █    █    █    █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █    █    █    █    █    █    █    █ █  █    █    █    █    █    █    █    █   
 10.0 | █    █    █    █ █  █   ███   █ █  █ █  █  █ █    █ █  █    █    █  █ █  █ █   
 10.0 | ████ ███  ███  ████ ███ █████ █ ██ █ ██ ████ ████ █ █  ████ ████ ████ ████ ███ 
 10.0 | ████ ███ █████ ████ ███ █████ ████ █ ██ ████ ████ ████ ████ ████ ████ ████ ███ 
  9.9 | ████ ██████████████████ █████ ████ ████ ████ ████ ██████████████ █████████ ████
  9.9 |█████ ██████████████████████████████████████████████████████████████████████████
  9.9 |█████ ██████████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | ██  8
  99 ms | ████████████  38
 100 ms | ████████████████████████████████████████  132
 101 ms | ███████  22
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `9.99`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `9.83`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `1.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23152 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.80`, p50 `9.98`, p95 `10.23`, p99 `11.03`, 1%low `8.91`, 0.1%low `n/a`, std `0.26`

**Frame time (ms)**  avg `100.22`, p50 `100.20`, p95 `103.05`, p99 `109.16`, p99.9 `113.12`, max `113.67`

**Client tick (ms)**  avg `0.37`, p95 `1.07`, max `11.82`

**Memory**  start `683 MB`, end `1500 MB`, peak `1500 MB`, GC `47 events / 229 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                                            █   
 10.6 |                                                                            █   
 10.5 |                       █                                   █                █   
 10.4 |                       █                                   █                █   
 10.2 |                       █     █                       █    ██                █   
 10.1 |█  █        ██     █   █     █         █   █  █ █    █  █ ██   █     █   █  █   
 10.0 |█  ██ █████ ██ ███ ██  █ █   ██ ██████ ██ ███ █ ████ █  █ ██ █ ██ █ ███  █  █ ██
  9.9 |██████████████████████ █████ ███████████████████████ ████ █████████████████ ████
  9.8 |██████████████████████ ██████████████████████████████████ █████████████████ ████
  9.6 |█████████████████████████████████████████████████████████ █████████████████ ████
  9.5 |█████████████████████████████████████████████████████████ ██████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  2
  90 ms | █  1
  91 ms | █  1
  92 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | ████  6
  98 ms | ███████████████  23
  99 ms | ██████████████████████████████████  51
 100 ms | ████████████████████████████████████████  60
 101 ms | █████████████████████  31
 102 ms | ███████  11
 103 ms | ███  5
 104 ms | █  1
 107 ms | █  1
 108 ms | █  1
 109 ms | █  1
 110 ms | █  1
 113 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `8.91`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.98`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7411.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23351 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `9.16`, p50 `10.00`, p95 `10.25`, p99 `10.70`, 1%low `9.21`, 0.1%low `n/a`, std `0.22`

**Frame time (ms)**  avg `100.24`, p50 `100.01`, p95 `103.19`, p99 `107.60`, p99.9 `108.93`, max `109.15`

**Client tick (ms)**  avg `0.32`, p95 `0.76`, max `6.74`

**Memory**  start `1530 MB`, end `1757 MB`, peak `1938 MB`, GC `35 events / 237 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                              █                                                 
 10.4 |                              █                                                 
 10.3 |                              █                                 █               
 10.3 |                              █                                 █  █            
 10.2 |                              █                                 █  █            
 10.1 |      █  █      █             █   █    █                   █    █  █ █          
 10.0 |  █  ██  █  █ █ █   █ █ ██ █  █ █ █    █ ██ █ ██  █ █ ██   █    ██ █ ██  ███ █ █
 10.0 |███████ ██  █ █ █████ ██████  █ ███ █ ██ ██ ████ ████████ █████ ██ █████████████
  9.9 |██████████ █████████████████  █ ███ ███████████████████████████ ██ █████████████
  9.8 |██████████ ████████████████████████████████████████████████████ ██ █████████████
  9.7 |██████████ ████████████████████████████████████████████████████ ████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  1
  93 ms | █  2
  94 ms | █  1
  95 ms | █  1
  96 ms | █  2
  97 ms | ███████  10
  98 ms | ███████████████████  26
  99 ms | ████████████████████████████████████████  54
 100 ms | ███████████████████████████  37
 101 ms | ███████████████████████████  36
 102 ms | █████████████  17
 103 ms | ████  5
 104 ms | █  2
 106 ms | █  1
 107 ms | █  2
 108 ms | █  1
 109 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.06`
- `fps_1pct_low` = `9.21`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.98`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7417.00`
- `preload_duration_ms` = `300.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-6.00`
- `entity_count_sample_start` = `7.00`
- `x_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23170 ms  |  Sample ticks: 400

**FPS**  avg `9.97`, min `8.72`, p50 `9.98`, p95 `10.22`, p99 `10.35`, 1%low `8.83`, 0.1%low `n/a`, std `0.23`

**Frame time (ms)**  avg `100.32`, p50 `100.16`, p95 `102.80`, p99 `109.31`, p99.9 `114.12`, max `114.65`

**Client tick (ms)**  avg `0.31`, p95 `1.04`, max `11.54`

**Memory**  start `1557 MB`, end `1418 MB`, peak `2206 MB`, GC `22 events / 176 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                                        █                       
 10.3 |                                                        █                       
 10.3 |                                                        █                       
 10.2 |                                                 █   █  █                       
 10.1 |              █  █ █   █   █        █  █         █   █  █      █    █    █      
 10.0 |█ ██ ██████ ███  █ █  ██  ██ ██  ██ ██ ██  ████  █   █  ███   ██  █ ██ █ ██ ███ 
  9.9 |███████████ ████ █ ████████████████ ██ █████████ █ █ ██ █████ █████ ████████████
  9.9 |██████████████████████████████████████████████████ ████ ███████████ ████████████
  9.8 |██████████████████████████████████████████████████ ████ ███████████ ████████████
  9.7 |██████████████████████████████████████████████████ ████ ████████████████████████
  9.6 |██████████████████████████████████████████████████ ████ ████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  91 ms | █  1
  96 ms | █  1
  97 ms | ███████  10
  98 ms | ████████████████  23
  99 ms | ████████████████████████████████████  53
 100 ms | ████████████████████████████████████████  59
 101 ms | ██████████████████████  32
 102 ms | ███████  11
 103 ms | █  2
 104 ms | █  2
 106 ms | █  1
 107 ms | █  1
 109 ms | █  1
 111 ms | █  1
 114 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `8.83`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7433.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23067 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.28`, p50 `9.98`, p95 `10.22`, p99 `10.59`, 1%low `8.77`, 0.1%low `n/a`, std `0.21`

**Frame time (ms)**  avg `100.27`, p50 `100.20`, p95 `102.41`, p99 `105.86`, p99.9 `118.09`, max `120.73`

**Client tick (ms)**  avg `0.36`, p95 `1.06`, max `5.63`

**Memory**  start `1896 MB`, end `1382 MB`, peak `2192 MB`, GC `26 events / 210 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                                                  █             
 10.2 |                                                                  █             
 10.1 |                                                        █         █             
 10.1 | █       █  █ █ █   █     █     █   █        █  █   █   █      █  █   █    █    
 10.0 | ██  ███ ██ █ █ █ ███ █ █ █   ███  ██ ████ █ █  █  ███  ███ █  █  █  █████ ██  █
 10.0 |███  ███ ████ █ █████ █████ ██████ ██ ██████ █████ ████ ██████ ██ █ ██████ █████
  9.9 |███ ████ ████ █ ███████████ █████████ ████████████ ████ █████████ ██████████████
  9.8 |███████████████ ███████████████████████████████████████ █████████ ██████████████
  9.8 |███████████████ ███████████████████████████████████████ █████████ ██████████████
  9.7 |███████████████ █████████████████████████████████████████████████ ██████████████
  9.6 |███████████████ ████████████████████████████████████████████████████████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  92 ms | █  1
  94 ms | █  2
  96 ms | █  2
  97 ms | █████  8
  98 ms | █████████████████  26
  99 ms | ███████████████████████████  42
 100 ms | ████████████████████████████████████████  63
 101 ms | ██████████████████████  35
 102 ms | █████████  14
 103 ms | █  1
 104 ms | █  1
 105 ms | █  2
 107 ms | █  1
 120 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.77`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7451.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `8.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `7.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23168 ms  |  Sample ticks: 400

**FPS**  avg `9.97`, min `8.66`, p50 `9.98`, p95 `10.21`, p99 `10.51`, 1%low `8.73`, 0.1%low `n/a`, std `0.26`

**Frame time (ms)**  avg `100.32`, p50 `100.24`, p95 `102.98`, p99 `111.42`, p99.9 `115.13`, max `115.49`

**Client tick (ms)**  avg `0.35`, p95 `0.97`, max `13.12`

**Memory**  start `1361 MB`, end `2137 MB`, peak `2320 MB`, GC `20 events / 161 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                              █                                 
 10.7 |                                              █                                 
 10.6 |                                              █                                 
 10.4 |                                              █                                 
 10.3 |                                              █                   █             
 10.2 |      █   █                   █         █     █         █         █             
 10.0 |████  █ █ █  █ ███ ██ █   ██  ██ █ █ █ ██  ██ ██ ██ ██  ██ █  █   █ █ █  █ ██ █ 
  9.9 |█████████ ███████████████ ███████████████████ ██ █████ ████████ █ ███ ███████ ██
  9.8 |█████████████████████████████████████████████ ████████ ██████████████████████ ██
  9.6 |█████████████████████████████████████████████ ████████ ██████████████████████ ██
  9.5 |█████████████████████████████████████████████ ██████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  2
  95 ms | █  1
  96 ms | █  2
  97 ms | █████  8
  98 ms | ███████████████  23
  99 ms | ██████████████████████████████████  52
 100 ms | ████████████████████████████████████████  61
 101 ms | ████████████████████  30
 102 ms | ███████  11
 103 ms | ███  4
 104 ms | █  1
 105 ms | █  1
 110 ms | █  1
 111 ms | █  1
 113 ms | █  1
 115 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.73`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `57.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7457.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `9.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-30.00`
- `entity_count_sample_start` = `39.00`
- `x_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24166 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `9.30`, p50 `9.99`, p95 `10.19`, p99 `10.45`, 1%low `9.36`, 0.1%low `n/a`, std `0.18`

**Frame time (ms)**  avg `100.24`, p50 `100.12`, p95 `103.16`, p99 `106.08`, p99.9 `107.22`, max `107.50`

**Client tick (ms)**  avg `0.30`, p95 `1.01`, max `1.45`

**Memory**  start `1336 MB`, end `1528 MB`, peak `2248 MB`, GC `28 events / 210 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                                                     █                          
 10.2 |                                                     █         █         █      
 10.1 |                                    █ █              █         █         █      
 10.1 |  █     █         █         █       █ █         █    █      █  █    █    █      
 10.0 |█ █  █  █     █ █ ██   █ █  ██ █ █  █ █  █ █    █    █  █ █ █  █    █ █  █ █  █ 
 10.0 |█ ██ ██ █ ██  █ █ ██ █ █ █  ██ █ █  █ ██ █ █ █  ████ █  █ █ ██ █  █ █ █  █ ██ █ 
  9.9 |█ ██████████ ████ ██ █████ ███ ████ █ ████████ █████ ██ ███ ██ █ ███████ █ ██ █ 
  9.9 |█ ███████████████ ███████████████████ ████████ █████ █████████ █████████ █ █████
  9.9 |█████████████████ ███████████████████ ████████ ███████████████ █████████████████
  9.8 |██████████████████████████████████████████████ █████████████████████████████████
  9.8 |██████████████████████████████████████████████ █████████████████████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  93 ms | █  1
  94 ms | █  1
  95 ms | █  1
  96 ms | █  2
  97 ms | ██  3
  98 ms | ██████████████████████  32
  99 ms | █████████████████████████████████  48
 100 ms | ████████████████████████████████████████  58
 101 ms | █████████████████████  31
 102 ms | ████████  11
 103 ms | ███  4
 104 ms | ██  3
 105 ms | █  1
 106 ms | █  2
 107 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `9.36`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.98`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7477.00`
- `preload_duration_ms` = `1103.00`
- `entity_count_sample_end` = `8.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `6.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23149 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `8.66`, p50 `9.99`, p95 `10.27`, p99 `11.31`, 1%low `8.70`, 0.1%low `n/a`, std `0.29`

**Frame time (ms)**  avg `100.21`, p50 `100.07`, p95 `103.68`, p99 `111.37`, p99.9 `115.25`, max `115.44`

**Client tick (ms)**  avg `0.31`, p95 `0.57`, max `12.99`

**Memory**  start `1527 MB`, end `2276 MB`, peak `2355 MB`, GC `25 events / 188 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                  █                                                    █        
 10.6 |                  █                                                    █        
 10.4 |                  █                                                    █        
 10.3 |                  ██                                                   █        
 10.2 |                  ██                                                   █        
 10.1 |█ ██ ██ █ █  █    ██  █    █  █ █  ██   █  █ █ █   █  █  █   ██ ██  █  █  █   █ 
 10.0 |█ ██ ██████ █████ ███ ██████ ████████████████████████ █████████ █████  ██████ █ 
  9.8 |█████████████████ ███████████████████████████████████ ████████████████ ████████ 
  9.7 |█████████████████ ████████████████████████████████████████████████████ █████████
  9.6 |█████████████████ ██████████████████████████████████████████████████████████████
  9.5 |█████████████████ ██████████████████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  86 ms | █  1
  88 ms | █  1
  95 ms | █  2
  96 ms | ████  5
  97 ms | ████  5
  98 ms | ███████████████  21
  99 ms | ████████████████████████████████████████  57
 100 ms | ████████████████████████████████████████  57
 101 ms | ██████████████████  25
 102 ms | █████████  13
 103 ms | ██  3
 104 ms | ██  3
 105 ms | █  2
 106 ms | █  1
 111 ms | █  1
 114 ms | █  1
 115 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.70`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.98`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24581 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.94`, p50 `9.98`, p95 `10.24`, p99 `10.74`, 1%low `8.95`, 0.1%low `n/a`, std `0.24`

**Frame time (ms)**  avg `100.29`, p50 `100.25`, p95 `103.04`, p99 `111.41`, p99.9 `111.79`, max `111.87`

**Client tick (ms)**  avg `0.29`, p95 `0.58`, max `1.47`

**Memory**  start `1457 MB`, end `1976 MB`, peak `2214 MB`, GC `25 events / 189 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                 █                              
 10.6 |                                                 █                              
 10.5 |                                                 █                              
 10.4 |                                                 █                              
 10.3 |                                                 █                              
 10.2 | █                    █                   █   █  █                              
 10.1 | ██   █ █ █   █ █  █  ██ ██  █   █  █ █   █ █ █  █   █  █ ██   █  █   █  █ █   █
 10.0 | ██████ ███ █ ███ ███ █████  █ ███ ██████████ █  ████████ ███ ██████████████████
  9.8 | ████████████ ███████ ██████████████████████████ ███████████████████████████████
  9.7 |█████████████ ██████████████████████████████████ ███████████████████████████████
  9.6 |████████████████████████████████████████████████ ███████████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  2
  93 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | ████████  12
  98 ms | ███████████████  21
  99 ms | ████████████████████████████████  45
 100 ms | ████████████████████████████████████████  57
 101 ms | █████████████████████████████  41
 102 ms | ██████  8
 103 ms | █  2
 104 ms | ██  3
 105 ms | █  1
 106 ms | █  1
 111 ms | ██  3
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `8.95`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `1519.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-67.00`
- `entity_count_sample_start` = `68.00`
- `x_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23159 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.84`, p50 `10.00`, p95 `10.23`, p99 `10.48`, 1%low `8.96`, 0.1%low `n/a`, std `0.22`

**Frame time (ms)**  avg `100.26`, p50 `100.05`, p95 `102.89`, p99 `107.22`, p99.9 `112.54`, max `113.16`

**Client tick (ms)**  avg `0.38`, p95 `0.99`, max `11.62`

**Memory**  start `2028 MB`, end `2162 MB`, peak `2258 MB`, GC `25 events / 187 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                      █                              █  █                       
 10.2 |                      █                              █  █                       
 10.1 |      █    █        █ █             █      █         █  █        █   █   █      
 10.0 | █ █  █  █ █  █ █ █ █ █  █ █ ██     █   █  █  █   █  █  █  █     █   █   █  █  █
 10.0 |████ ███ █ ██ █ █ █ █ ██ ███ ██████ ██ ███ █ ██████ ██  ██ █████ █ █ ██ ██ ██  █
  9.9 |████ ███ ████████████ ██████ █████████████ ████████████ ████████ ███ ██ ██ █████
  9.8 |████████ ████████████ ██████████████████████████████████████████████████████████
  9.8 |████████ ████████████ ██████████████████████████████████████████████████████████
  9.7 |████████ ████████████ ██████████████████████████████████████████████████████████
  9.6 |████████ ████████████ ██████████████████████████████████████████████████████████
  9.6 |████████ ███████████████████████████████████████████████████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  95 ms | █  2
  96 ms | █  2
  97 ms | ████  6
  98 ms | ████████████  20
  99 ms | ████████████████████████████████████████  66
 100 ms | ██████████████████████████████  50
 101 ms | █████████████████  28
 102 ms | █████████  15
 103 ms | ██  3
 104 ms | ██  3
 105 ms | █  1
 107 ms | █  1
 110 ms | █  1
 113 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.96`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7499.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-25.00`
- `entity_count_sample_start` = `28.00`
- `x_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23068 ms  |  Sample ticks: 400

**FPS**  avg `9.97`, min `8.54`, p50 `9.98`, p95 `10.16`, p99 `10.37`, 1%low `8.81`, 0.1%low `n/a`, std `0.23`

**Frame time (ms)**  avg `100.31`, p50 `100.22`, p95 `102.30`, p99 `109.51`, p99.9 `115.70`, max `117.14`

**Client tick (ms)**  avg `0.26`, p95 `0.55`, max `3.23`

**Memory**  start `1430 MB`, end `1650 MB`, peak `2318 MB`, GC `26 events / 195 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                 █                                                              
 10.4 |                 █                                                              
 10.3 |                 █                                                              
 10.2 |                 █                █                                             
 10.1 |      █     █    █ █              █    █      █         █           █     █     
 10.0 | ███  ██    ██   █ █ ███  █ ██ █  █ █  █ ███  █  █ ██ █ ██   ███   ██ █ █ █ █   
  9.9 | ███████████████ ███ █████████ ██ ███████████ ████ ████████ █████████ ██████████
  9.8 |████████████████ ████████████████ █████████████████████████ ████████████████████
  9.7 |████████████████ ██████████████████████████████████████████ ████████████████████
  9.7 |███████████████████████████████████████████████████████████ ████████████████████
  9.6 |███████████████████████████████████████████████████████████ ████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  91 ms | █  1
  96 ms | █  1
  97 ms | █  2
  98 ms | █████████████  22
  99 ms | ███████████████████████████████  54
 100 ms | ████████████████████████████████████████  70
 101 ms | ██████████████████  32
 102 ms | █████  9
 103 ms | █  1
 104 ms | ██  3
 109 ms | █  2
 117 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `8.81`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7507.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23073 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.99`, p50 `9.98`, p95 `10.26`, p99 `10.59`, 1%low `9.09`, 0.1%low `n/a`, std `0.22`

**Frame time (ms)**  avg `100.27`, p50 `100.20`, p95 `103.88`, p99 `107.39`, p99.9 `110.77`, max `111.28`

**Client tick (ms)**  avg `0.32`, p95 `0.72`, max `1.63`

**Memory**  start `1449 MB`, end `1099 MB`, peak `2282 MB`, GC `26 events / 213 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                                                        █       
 10.4 |                                                                        █       
 10.3 |                                                              █         █       
 10.2 |                                       █                      █         █       
 10.1 |                             █  █  █   █  █    █              █      █  █  █    
 10.0 |█ █  ███ █  █  ██  ██ █ █ █  █  █  ██  ██ █ ██ █  █    ██ ███ █  █ █ ██ ██ ██   
 10.0 |████ █████ ███ ████████ ████ █ ███ ███ ██ █ ████ ██ █████ ███ ██████ ██ ██ ██ ██
  9.9 |██████████ ███████████████████ ███████ ████ █████████████ ███ ██████ ██ ██ █████
  9.8 |██████████ ███████████████████ ███████ ██████████████████████ ██████ ██ ████████
  9.7 |██████████ ███████████████████ ██████████████████████████████ ██████ ██ ████████
  9.6 |███████████████████████████████████████████████████████████████████████ ████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  1
  94 ms | ██  2
  95 ms | ██  2
  96 ms | ██  3
  97 ms | ████████  10
  98 ms | ███████████████████████  28
  99 ms | ██████████████████████████████████████  47
 100 ms | ████████████████████████████████████████  49
 101 ms | █████████████████████████  31
 102 ms | ███████████  13
 103 ms | ███  4
 104 ms | █  1
 105 ms | ██  2
 106 ms | ██  3
 107 ms | █  1
 108 ms | █  1
 111 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `9.09`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `68.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7517.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `6.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `11.00`
- `x_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23175 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `7.93`, p50 `9.98`, p95 `10.26`, p99 `10.80`, 1%low `8.48`, 0.1%low `n/a`, std `0.30`

**Frame time (ms)**  avg `100.30`, p50 `100.19`, p95 `103.42`, p99 `109.63`, p99.9 `122.88`, max `126.12`

**Client tick (ms)**  avg `0.29`, p95 `0.78`, max `4.04`

**Memory**  start `1086 MB`, end `1069 MB`, peak `2243 MB`, GC `26 events / 197 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |              █                                                                 
 10.1 |              █                                                                 
 10.1 |              █           █                                    █             █  
 10.1 |        █   █ █ █      █  █  █      █  █  █  ██         ██     █   █    █    ██ 
 10.0 |   █ █  ███ █████  ██  █  █  ████  ██  ██ ██ ██ ██ ███  ██ ██  █ █ ██ █ ██   ███
 10.0 | █ ████ ███ █████████ ██  █ █████ ███ ███ ██ █████ ████ ██ ███████ ████ ██   ███
  9.9 | ████████████████████ ██  ██████████████████ ██████████ ██████████████████   ███
  9.9 |█████████████████████████ ██████████████████████████████████████████████████████
  9.8 |█████████████████████████ ██████████████████████████████████████████████████████
  9.8 |█████████████████████████ ██████████████████████████████████████████████████████
  9.7 |█████████████████████████ ██████████████████████████████████████████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  80 ms | █  1
  91 ms | █  1
  92 ms | █  1
  95 ms | █  1
  96 ms | ████  5
  97 ms | ██████  9
  98 ms | █████████████  19
  99 ms | █████████████████████████████████████  53
 100 ms | ████████████████████████████████████████  57
 101 ms | ██████████████████████  31
 102 ms | ██████  8
 103 ms | ████  6
 104 ms | █  2
 105 ms | █  2
 107 ms | █  1
 109 ms | █  2
 126 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `8.48`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7523.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-55.00`
- `entity_count_sample_start` = `56.00`
- `x_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.80`, p50 `9.99`, p95 `10.09`, p99 `10.12`, 1%low `9.81`, 0.1%low `n/a`, std `0.06`

**Frame time (ms)**  avg `100.14`, p50 `100.14`, p95 `101.20`, p99 `101.62`, p99.9 `101.97`, max `102.01`

**Client tick (ms)**  avg `0.24`, p95 `0.30`, max `1.51`

**Memory**  start `2066 MB`, end `2150 MB`, peak `2150 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |  █                              █               █                      █       
 10.0 |  █         █            █       █               █                      █       
 10.0 |  █         █            █       █               █                █     █       
 10.0 |  █         █            █       █               █                █     █       
 10.0 |  █   █     █   █        █       █ █             █          █     █     █       
 10.0 |█ ██  ██ █  ██  ██  █ ██ █ █  ██ █ ██ █  █ ██    ███  ██ █ ██   █ ███ █ █   ███ 
 10.0 |█ █████████ ███ ████████ ███████ ███████████████ ████████████████ █████ ████████
 10.0 |█ █████████ ████████████ ███████ ███████████████ ████████████████ █████ ████████
 10.0 |█ █████████ ████████████ ███████ ███████████████ ████████████████ █████ ████████
 10.0 |█ █████████ ████████████ ███████ ███████████████ ████████████████ █████ ████████
  9.9 |████████████████████████████████ ███████████████ ██████████████████████ ████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | ██  7
  99 ms | ████████████  40
 100 ms | ████████████████████████████████████████  129
 101 ms | ███████  23
 102 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.81`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23134 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `8.92`, p50 `9.99`, p95 `10.18`, p99 `10.34`, 1%low `9.22`, 0.1%low `n/a`, std `0.16`

**Frame time (ms)**  avg `100.13`, p50 `100.14`, p95 `101.38`, p99 `103.77`, p99.9 `110.65`, max `112.08`

**Client tick (ms)**  avg `2.59`, p95 `3.10`, max `13.13`

**Memory**  start `1046 MB`, end `1030 MB`, peak `2314 MB`, GC `1 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                        █                                  █                    
 10.1 |                        █                                  █                 █  
 10.1 |                        █                                  █                 █  
 10.1 |                       ██           █                      █                 █  
 10.0 |  █             █   █  ██         █ █         █            █                 ██ 
 10.0 |  ██  ██ █  █   █  ██  ██  █ █  █ █ ██ ███ █  ██    █ █  █ █  ██  ███    █ █ ██ 
 10.0 |██████████████  ██ ███ ███ ██████ █ ██ ███ ██ █████ ██████ ██ ██ ███████ ███ ███
  9.9 |██████████████ ███████ ████████████ ██████████████████████ █████████████████ ███
  9.9 |██████████████ ████████████████████ ██████████████████████ █████████████████ ███
  9.9 |██████████████ ███████████████████████████████████████████ █████████████████ ███
  9.8 |██████████████ ███████████████████████████████████████████ █████████████████ ███
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   1
  96 ms | █  3
  97 ms | ██  4
  98 ms | █████  11
  99 ms | █████████████████████████  61
 100 ms | ████████████████████████████████████████  96
 101 ms | ███████  16
 102 ms |   1
 103 ms | ██  5
 104 ms |   1
 112 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `1.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `9.22`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.71`, p50 `9.99`, p95 `10.10`, p99 `10.12`, 1%low `9.75`, 0.1%low `n/a`, std `0.06`

**Frame time (ms)**  avg `100.14`, p50 `100.14`, p95 `101.29`, p99 `101.51`, p99.9 `102.84`, max `103.01`

**Client tick (ms)**  avg `0.25`, p95 `0.32`, max `1.48`

**Memory**  start `1131 MB`, end `1347 MB`, peak `1347 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |█                                       █     █                                 
 10.0 |█            █                          █     █ █                               
 10.0 |█            █         █                █     █ █                               
 10.0 |█            █         █   █       █    █     █ █    █                          
 10.0 |█   █   █  █ █    █    █ █ █       █    █     █ ██ █ █         █  █      █  █   
 10.0 |█ █ █ ████ █ █  █ █ █  █ █ ██ ████ █  █ █  █  █ ██ █ █ █ ██ ██ █  ███  █ █  █ █ 
 10.0 |█████ ██████ █████████ █ █ ███████ ██ █ █ ██  █ ████ █ ██████████ ██████████████
 10.0 |████████████ █████████ ████████████████ ███████ ████████████████████████████████
 10.0 |████████████ █████████ ████████████████ ███████ ████████████████████████████████
 10.0 |████████████ ██████████████████████████ ███████ ████████████████████████████████
  9.9 |████████████ ███████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  96 ms |   1
  98 ms | ███  8
  99 ms | █████████████████  50
 100 ms | ████████████████████████████████████████  120
 101 ms | ██████  19
 102 ms |   1
 103 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `9.75`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `9043.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.86`, p50 `9.98`, p95 `10.13`, p99 `10.15`, 1%low `9.86`, 0.1%low `n/a`, std `0.06`

**Frame time (ms)**  avg `100.14`, p50 `100.16`, p95 `101.24`, p99 `101.40`, p99.9 `101.46`, max `101.47`

**Client tick (ms)**  avg `0.25`, p95 `0.35`, max `1.46`

**Memory**  start `1525 MB`, end `1661 MB`, peak `1661 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                █                             █              █         █        
 10.1 | █    █         █         █         █    █    █    █    █    █    █    █    █   
 10.0 | █    █    █    █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █    ██   █    █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █    ██   █    █    █    █    █    █    █    █    █    ██   █    █    █    █   
 10.0 | ████ ████ ███  ███  █ ██ ████ ███  ███  ████ ██ █ ████ ████ ██ █ ████ ██ █ █ ██
 10.0 | ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
 10.0 | ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 | ████ █████████ █████████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 |█████ █████████ █████████ ███████████████████ █████████ ████ █████████ █████████
  9.9 |█████ ██████████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | █████  16
  99 ms | ███████  24
 100 ms | ████████████████████████████████████████  141
 101 ms | █████  19
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `1.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `9.86`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.82`, p50 `9.99`, p95 `10.09`, p99 `10.11`, 1%low `9.84`, 0.1%low `n/a`, std `0.05`

**Frame time (ms)**  avg `100.14`, p50 `100.14`, p95 `101.15`, p99 `101.30`, p99.9 `101.76`, max `101.86`

**Client tick (ms)**  avg `0.25`, p95 `0.35`, max `1.24`

**Memory**  start `676 MB`, end `836 MB`, peak `836 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |           █                                                                    
 10.1 |           █                                                                    
 10.0 | █    █    █                                            █    █         █        
 10.0 | █    █    █    █    █    █    █  █ █    █    █    █    █    █     █   █     █  
 10.0 | █    █    █    █    █    █    █  █ █    █    █    █    █    █     █   █     █  
 10.0 | █    █    █    █    █    █    ██ █ ██ █ █  █ █    █ █  █  █ █    ███  ██ █ ██ █
 10.0 | ████ ████ ████ ████ ████ ████ ██ █ ████ ████ ████ ████ ████ ████ ████ ████ ████
 10.0 | ████ ████ ████ ████ ████ ████ ██ █ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 | ████ ████ ████ ████ █████████ ██ █ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 |██████████ ██████████████████████ ██████████████████████████████████████████████
  9.9 |██████████ █████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | █  5
  99 ms | ██████████  36
 100 ms | ████████████████████████████████████████  140
 101 ms | █████  19
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `9.84`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.86`, p50 `9.99`, p95 `10.09`, p99 `10.11`, 1%low `9.86`, 0.1%low `n/a`, std `0.05`

**Frame time (ms)**  avg `100.14`, p50 `100.13`, p95 `101.17`, p99 `101.32`, p99.9 `101.39`, max `101.40`

**Client tick (ms)**  avg `0.26`, p95 `0.37`, max `1.29`

**Memory**  start `1269 MB`, end `1421 MB`, peak `1421 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                     █              █                                           
 10.0 | █                   █       █      █            █                              
 10.0 | █         █         █       █      █            █       █                   █  
 10.0 | █         █         █  █  █ █   █  █    █       █  █    ██            █  █  █  
 10.0 | █         █ █    █  █  █  █ █ █ █  █ █  █    █  █  ██   ██   █   █    █  █ ███ 
 10.0 | █   ██   ██ █  ████ █  █  █ █ █ █  █ ██ █ ██ █  █  ██ █ ██  ███  █  █ ██ █ ███ 
 10.0 | ██ ████████ ███████ █  █  █ █ ███  █ ██ █ ██ █  █  ██ █ ██  ███  ████ ██ █ ███ 
 10.0 | ███████████████████ ████ ██ █ ███  █ ██ ████ █ ██ ███ █ ██  ████ ████ ████ ████
 10.0 | ███████████████████ █████████ ███ ██ ██ █████████████ █ ███ █████████ ████ ████
 10.0 | ████████████████████████████████████ ██ █████████████████████████████ ████ ████
 10.0 |████████████████████████████████████████ ██████████████████████████████████ ████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | █  4
  99 ms | ██████████  35
 100 ms | ████████████████████████████████████████  141
 101 ms | ██████  20
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `9.86`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `8053.00`
- `preload_duration_ms` = `102.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194888 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `9.15`, p50 `9.99`, p95 `10.11`, p99 `10.26`, 1%low `9.50`, 0.1%low `9.17`, std `0.10`

**Frame time (ms)**  avg `100.14`, p50 `100.13`, p95 `101.47`, p99 `102.69`, p99.9 `108.42`, max `109.34`

**Client tick (ms)**  avg `0.63`, p95 `1.03`, max `6.67`

**Memory**  start `610 MB`, end `1040 MB`, peak `1663 MB`, GC `14 events / 67 ms`

**FPS over sampling window (ASCII):**

```
 10.0 | █                                                                              
 10.0 | █                                                                              
 10.0 | █                                                                              
 10.0 | █                                                                              
 10.0 | ███ █ █  ██ ██  █  █ █     █    █  █ █ █    █  █ █    ██  █       █  ██   ██   
 10.0 | █████ █████ █████ ██████ ███ █████ █ █ ██████  █████ ██████████████ █████ █████
 10.0 | █████ ██████████████████ █████████ ██████████████████████████████████████ █████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   1
  91 ms |   1
  92 ms |   1
  94 ms |   2
  95 ms |   3
  96 ms |   6
  97 ms | █  15
  98 ms | ████  86
  99 ms | █████████████████████████████  619
 100 ms | ████████████████████████████████████████  868
 101 ms | ███████  156
 102 ms | █  25
 103 ms |   4
 104 ms |   2
 105 ms |   2
 106 ms |   3
 107 ms |   1
 108 ms |   2
 109 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `67.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `9.17`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `9.50`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `22.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194231 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `9.11`, p50 `9.99`, p95 `10.12`, p99 `10.29`, 1%low `9.46`, 0.1%low `9.14`, std `0.11`

**Frame time (ms)**  avg `100.14`, p50 `100.13`, p95 `101.47`, p99 `103.21`, p99.9 `108.66`, max `109.82`

**Client tick (ms)**  avg `0.60`, p95 `1.01`, max `9.95`

**Memory**  start `1142 MB`, end `1087 MB`, peak `1791 MB`, GC `14 events / 69 ms`

**FPS over sampling window (ASCII):**

```
 10.0 | █                                                                              
 10.0 | █   █        █                  █                █              █              
 10.0 | █   █        █       █    █    ██              █ █    █   █     █    █         
 10.0 | █  ██ █  █ ███  █ █  █   ██    ██ ██ ██   █ █ ██ █ █  █ █ █  █  █    █ █    ██ 
 10.0 | █████ █ ██ ███  █ ██████ ████  ██████████████ ██ █ █  ██████ ██ █ ██ █ █  █ ██ 
 10.0 | █████ ██████████████████ █████ ██████████████ ██ ███ ███████████████ ████ ████ 
 10.0 | █████ ███████████████████████████████████████ ████████████████████████████████ 
 10.0 | █████████████████████████████████████████████ █████████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   1
  91 ms |   1
  92 ms |   3
  94 ms |   2
  95 ms |   2
  96 ms |   8
  97 ms | █  15
  98 ms | ████  83
  99 ms | ██████████████████████████████  636
 100 ms | ████████████████████████████████████████  845
 101 ms | ████████  160
 102 ms | █  22
 103 ms |   6
 104 ms |   5
 105 ms |   2
 106 ms |   3
 107 ms |   1
 108 ms |   2
 109 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `72.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `9.14`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `9.46`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `16.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194021 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `9.00`, p50 `9.99`, p95 `10.12`, p99 `10.22`, 1%low `9.52`, 0.1%low `9.04`, std `0.10`

**Frame time (ms)**  avg `100.14`, p50 `100.13`, p95 `101.44`, p99 `102.36`, p99.9 `108.99`, max `111.08`

**Client tick (ms)**  avg `0.61`, p95 `1.03`, max `7.67`

**Memory**  start `1494 MB`, end `1104 MB`, peak `1774 MB`, GC `12 events / 65 ms`

**FPS over sampling window (ASCII):**

```
 10.0 | █                                                █                             
 10.0 | █                      █                         █                             
 10.0 | █    █                 █    █ █                  █                             
 10.0 | ██  ██              █  █    █ █   █   █  █     █ █    ██  █     █           █  
 10.0 | ███ ██  ██ ██ ██ ██ █ ██ ██ █ █ █ ██ ██ ███ █ ██ ██   ██  ████  ██   ████   █  
 10.0 | ██████ █████████ ████ ██ ██ ███ ███████ █████ ██ ███ ███████████████ ██████ ███
 10.0 | █████████████████████ █████ ████████████████████ ███ ██████████████████████████
 10.0 | █████████████████████ ██████████████████████████ ██████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 | ███████████████████████████████████████████████████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms |   1
  92 ms |   1
  93 ms |   2
  94 ms |   2
  95 ms |   2
  96 ms |   3
  97 ms | █  13
  98 ms | █████  108
  99 ms | ████████████████████████████  596
 100 ms | ████████████████████████████████████████  858
 101 ms | ████████  178
 102 ms | █  20
 103 ms |   5
 105 ms |   3
 106 ms |   1
 107 ms |   1
 108 ms |   1
 110 ms |   1
 111 ms |   1
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `9.04`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `9.52`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `20.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194542 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `9.33`, p50 `9.99`, p95 `10.13`, p99 `10.27`, 1%low `9.54`, 0.1%low `9.35`, std `0.11`

**Frame time (ms)**  avg `100.14`, p50 `100.13`, p95 `101.69`, p99 `103.17`, p99.9 `106.45`, max `107.16`

**Client tick (ms)**  avg `0.61`, p95 `1.04`, max `7.66`

**Memory**  start `1051 MB`, end `1450 MB`, peak `1834 MB`, GC `13 events / 49 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                        █                                                       
 10.0 |                        █                                                       
 10.0 |                        █                                                       
 10.0 | █                      █                               █                       
 10.0 | █    █            █    █                               █                      █
 10.0 | █ █  ██     ██    █    █    █  ██  █ █  ██   █ █ ██    █  ████   █   █ █    █ █
 10.0 | ██████████ ██████ ████ █████████████ ██ ████ ███ ████ ██████████████ ███ █ ██ █
 10.0 | ██████████████████████ ████████████████████████████████████████████████████████
 10.0 | ██████████████████████ ████████████████████████████████████████████████████████
 10.0 | ██████████████████████ ████████████████████████████████████████████████████████
 10.0 |███████████████████████ ████████████████████████████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms |   1
  93 ms |   3
  94 ms |   2
  95 ms |   4
  96 ms |   2
  97 ms | █  28
  98 ms | ██████  112
  99 ms | ████████████████████████████████  617
 100 ms | ████████████████████████████████████████  776
 101 ms | ██████████  200
 102 ms | ██  32
 103 ms |   8
 104 ms |   5
 105 ms |   1
 106 ms |   5
 107 ms |   1
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `9.35`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `9.54`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`

