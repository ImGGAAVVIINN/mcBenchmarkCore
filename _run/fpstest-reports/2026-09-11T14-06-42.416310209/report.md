# FPS Test session — 2026-09-11T14:41:08.153835562+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 124.0 | 71.5 | 61.3 | 13.27 | 0.62 | 3 | 301 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 123.4 | 73.0 | 64.0 | 13.24 | 0.65 | 4 | 242 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 30.1 | 25.2 | 24.7 | 38.86 | 0.67 | 1 | 296 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 127.6 | 65.8 | 54.4 | 13.84 | 0.70 | 8 | 453 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 127.2 | 62.1 | 39.3 | 13.59 | 0.65 | 4 | 144 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 329.8 | 28.8 | 19.0 | 24.70 | 0.46 | 2 | 96 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 286.1 | 46.7 | 45.2 | 20.80 | 0.65 | 2 | 251 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 85.9 | 21.5 | 20.9 | 46.05 | 1.06 | 5 | 112 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 35.5 | 14.5 | 12.8 | 60.63 | 3.01 | 5 | 274 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 35.6 | 16.9 | 16.2 | 55.78 | 3.82 | 10 | 54 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 31.3 | 21.2 | 21.0 | 46.60 | 0.91 | 5 | 25 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 31.2 | 21.4 | 21.1 | 46.21 | 0.44 | 2 | 278 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 34.7 | 18.5 | 18.3 | 52.63 | 3.43 | 5 | 375 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 33.4 | 19.1 | 17.6 | 50.12 | 2.52 | 4 | 408 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 45.8 | 13.1 | 12.0 | 72.41 | 15.15 | 28 | 631 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 45.2 | 12.9 | 12.4 | 74.03 | 15.76 | 26 | 468 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 31.5 | 20.4 | 19.6 | 47.39 | 1.79 | 4 | 216 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 31.7 | 20.4 | 19.7 | 47.51 | 1.84 | 2 | 434 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 31.1 | 21.1 | 20.1 | 46.45 | 0.62 | 1 | 100 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 31.0 | 21.2 | 20.7 | 46.25 | 0.26 | 1 | 132 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 31.1 | 20.9 | 18.7 | 46.51 | 0.22 | 4 | 148 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 31.1 | 21.3 | 20.8 | 46.04 | 0.27 | 1 | 368 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 30.9 | 21.5 | 20.8 | 45.78 | 0.28 | 1 | 92 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 31.5 | 19.0 | 16.5 | 49.61 | 0.35 | 45 | 699 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 10.1 | 7.8 | n/a | 124.75 | 0.34 | 31 | 880 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 10.1 | 7.9 | n/a | 122.55 | 0.31 | 21 | 503 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 10.1 | 7.9 | n/a | 126.11 | 0.35 | 23 | 201 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 10.0 | 7.9 | n/a | 124.53 | 0.33 | 24 | 1095 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 10.0 | 8.7 | n/a | 115.16 | 0.31 | 25 | 408 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 10.1 | 8.0 | n/a | 123.70 | 0.39 | 21 | 1012 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 10.0 | 7.4 | n/a | 130.70 | 0.35 | 26 | 112 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 10.0 | 7.7 | n/a | 121.65 | 0.39 | 21 | 345 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 10.0 | 8.5 | n/a | 115.71 | 0.30 | 22 | 542 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 10.1 | 7.9 | n/a | 125.06 | 0.37 | 24 | 1011 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 10.0 | 8.7 | n/a | 113.90 | 0.30 | 23 | 75 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 10.0 | 8.8 | n/a | 113.34 | 0.26 | 0 | 80 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 10.0 | 8.1 | n/a | 122.44 | 2.58 | 1 | 1212 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 10.0 | 8.5 | n/a | 111.66 | 0.27 | 0 | 208 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 10.0 | 8.7 | n/a | 112.80 | 0.28 | 0 | 144 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 10.0 | 8.8 | n/a | 112.88 | 0.27 | 0 | 152 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 10.0 | 8.8 | n/a | 111.84 | 0.28 | 0 | 156 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 10.0 | 7.9 | 7.7 | 124.65 | 0.67 | 15 | 372 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 10.0 | 8.0 | 7.8 | 122.69 | 0.62 | 14 | 382 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.0 | 7.7 | 7.1 | 125.42 | 0.63 | 12 | 479 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.0 | 7.8 | 7.4 | 125.02 | 0.61 | 14 | 507 |

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

Category: **Particles**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `123.97`, min `57.90`, p50 `119.25`, p95 `162.75`, p99 `249.56`, 1%low `71.54`, 0.1%low `61.32`, std `34.24`

**Frame time (ms)**  avg `8.40`, p50 `8.39`, p95 `11.92`, p99 `13.27`, p99.9 `14.76`, max `17.27`

**Client tick (ms)**  avg `0.62`, p95 `1.05`, max `1.85`

**Memory**  start `559 MB`, end `861 MB`, peak `861 MB`, GC `3 events / 14 ms`

**FPS over sampling window (ASCII):**

```
149.1 |  █                                                                             
146.4 |  █                                                                             
143.7 |  █                                                                             
141.0 |  █  █                                                                          
138.3 | ██  █                                                                          
135.7 | ██  █                                                                          
133.0 | ██  █  █                                                                       
130.3 | ██  █  █                                                                       
127.6 |███  █  █           █           █                      █               █        
124.9 |███  ██ █     █ ██  █ █     █   █  ██  █  █ ██ █       █ ███  █  ███  ██      █ 
122.2 |███ ███ ████ █████ ████████████ ██████ █████████████████ ███ ███████████ ██ █ ██
119.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   3
   2 ms |   3
   3 ms | █  18
   4 ms | █  35
   5 ms | █  44
   6 ms | █████  172
   7 ms | ███████████  362
   8 ms | ████████████████████████████████████████  1286
   9 ms | ████████  254
  10 ms | █  37
  11 ms | ██  53
  12 ms | ██  78
  13 ms | █  28
  14 ms |   4
  15 ms |   2
  17 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `portal` | 160 | 297 | 129.6 | 13.96 |
| `end_rod` | 240 | 297 | 122.9 | 12.35 |
| `dragon_breath` | 160 | 297 | 123.2 | 13.35 |
| `dripping_water` | 240 | 297 | 123.1 | 13.37 |
| `flame` | 160 | 297 | 123.6 | 13.69 |
| `smoke` | 160 | 297 | 123.5 | 13.03 |
| `sculk_charge_pop` | 240 | 297 | 123.7 | 13.20 |
| `ALL_TOGETHER` | 1680 | 297 | 122.2 | 12.50 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `61.32`
- `fps_harmonic_avg` = `119.04`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `69.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `71.54`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `123.36`, min `58.95`, p50 `119.24`, p95 `158.68`, p99 `239.37`, 1%low `72.95`, 0.1%low `63.96`, std `30.76`

**Frame time (ms)**  avg `8.40`, p50 `8.39`, p95 `11.86`, p99 `13.24`, p99.9 `13.93`, max `16.96`

**Client tick (ms)**  avg `0.65`, p95 `0.93`, max `1.26`

**Memory**  start `686 MB`, end `574 MB`, peak `928 MB`, GC `4 events / 14 ms`

**FPS over sampling window (ASCII):**

```
146.3 |    █                                                                           
143.8 |    █                                                                           
141.2 |    █                                                                           
138.7 |    █                                                                           
136.1 |    █                                                               █           
133.5 |    █                                                               █           
131.0 |    █                                                               █           
128.4 |    █    █   █                    █                 █       █       █           
125.8 | ██ █    ██  █ █         █        █ █       █       █     █ █   █   █       █   
123.3 | ██ █ █ ██████ ███  ████ █  ███  ████  ████ ██ █  █ █ ██ █████ ██ █ ██ ██   █ █ 
120.7 |███ ███████████████ ████████████████████████████████████ ███████████████████████
118.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   2
   2 ms |   1
   3 ms |   14
   4 ms | █  32
   5 ms | ██  49
   6 ms | █████  144
   7 ms | ██████████████  426
   8 ms | ████████████████████████████████████████  1240
   9 ms | █████████  289
  10 ms | █  32
  11 ms | █  38
  12 ms | ███  82
  13 ms | █  31
  14 ms |   1
  16 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `55.00`
- `fps_harmonic_avg` = `119.07`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `63.96`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `72.95`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `30.07`, min `24.72`, p50 `29.97`, p95 `34.12`, p99 `35.96`, 1%low `25.24`, 0.1%low `24.72`, std `1.99`

**Frame time (ms)**  avg `33.40`, p50 `33.36`, p95 `37.44`, p99 `38.86`, p99.9 `40.42`, max `40.46`

**Client tick (ms)**  avg `0.67`, p95 `0.92`, max `1.22`

**Memory**  start `634 MB`, end `600 MB`, peak `930 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 31.1 |                                                       █                        
 30.9 |                                                       █                        
 30.8 |             █                      █                  █                        
 30.6 |           █ █                      █              █   █ █                      
 30.5 |           █ █                  █ █ █              █   █ █               █  █   
 30.3 |██     █   █ █ █     █        █ █ █ █        █   █ █ █ █ █               █  █   
 30.1 |███    █   █ █ █  █ ██ █      █ █ █ █ █████  ██  █ █ █ █ █ ███  █     ██ █  ███ 
 30.0 |███ ██████ █ ██████ █████ ██ ██ █ █ █ █████ ██████ █ █ █ █████ ██ ██████ ██████ 
 29.8 |██████████ █ ██████████████████ █ █ █ ████████████ █ █ █ ███████████████ ██████ 
 29.7 |██████████ █ ██████████████████ ██████████████████ ███ █ ██████████████████████ 
 29.5 |████████████ ██████████████████ ██████████████████████ █████████████████████████
 29.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  25 ms | █  2
  26 ms |   1
  27 ms | ██  6
  28 ms | ████  15
  29 ms | █████  20
  30 ms | ██████  23
  31 ms | █████  21
  32 ms | ███████████████████████████████████  140
  33 ms | ████████████████████████████████████████  160
  34 ms | ███████████████████████████████  123
  35 ms | ██████  23
  36 ms | ██████  25
  37 ms | █████  21
  38 ms | ████  14
  39 ms | █  2
  40 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `45.00`
- `fps_harmonic_avg` = `29.94`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `24.72`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `25.24`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `127.62`, min `54.24`, p50 `119.15`, p95 `174.67`, p99 `348.58`, 1%low `65.75`, 0.1%low `54.37`, std `56.67`

**Frame time (ms)**  avg `8.41`, p50 `8.39`, p95 `12.24`, p99 `13.84`, p99.9 `17.39`, max `18.44`

**Client tick (ms)**  avg `0.70`, p95 `0.89`, max `2.63`

**Memory**  start `503 MB`, end `949 MB`, peak `956 MB`, GC `8 events / 19 ms`

**FPS over sampling window (ASCII):**

```
154.2 |                                  █                                             
150.9 |                                  █                                             
147.7 |                                  █                                             
144.4 |█   █        █              █     █                                            █
141.2 |█ █ █    █  ██              █     █       █                                    █
137.9 |█ █ █    ██ ██              █     █       █         █ █        █               █
134.7 |███ █   ███ ██              █     █  █    █         █ █        █               █
131.5 |███ █   ███ ██ █    █  █    █   █ █  █   ██         █ ██       █    █          █
128.2 |███ █ █ ███ ██ █    █  █    █   █ █ ██   ██         █ ███      █    █ █      █ █
125.0 |███ █ █ ███ ██ █ █  █ █████ █   ████████ ██ ████ ██ █ ███   █  █ █  █ ██   █████
121.7 |█████ █████████████ █ █████████ █████████████████████████████ ████████████ █████
118.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  15
   2 ms |   13
   3 ms | █  25
   4 ms | █  37
   5 ms | █  41
   6 ms | ████  127
   7 ms | ██████████████  420
   8 ms | ████████████████████████████████████████  1200
   9 ms | █████████  284
  10 ms | █  27
  11 ms | ██  50
  12 ms | ███  83
  13 ms | █  35
  14 ms |   11
  15 ms |   3
  16 ms |   3
  17 ms |   1
  18 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `66.00`
- `fps_harmonic_avg` = `118.86`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `54.37`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `65.75`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `127.20`, min `38.67`, p50 `119.15`, p95 `175.12`, p99 `272.46`, 1%low `62.15`, 0.1%low `39.33`, std `68.75`

**Frame time (ms)**  avg `8.45`, p50 `8.39`, p95 `12.47`, p99 `13.59`, p99.9 `20.62`, max `25.86`

**Client tick (ms)**  avg `0.65`, p95 `0.93`, max `1.27`

**Memory**  start `804 MB`, end `696 MB`, peak `948 MB`, GC `4 events / 14 ms`

**FPS over sampling window (ASCII):**

```
201.2 |                                        █                                       
193.6 |                                        █                                       
186.0 |                                        █                                       
178.5 |                                        █                                       
170.9 |          █                           █ █                                       
163.3 |          █                           █ █                                  █    
155.7 |          █                           █ █                                  █    
148.2 |          █                           ███                                  █    
140.6 |          █             █             ███                                  █    
133.0 |          █             █             ███    █    ███        █             █    
125.4 |███     █ ████████ ████ ██ ██ █ ████████████ █████████ ██████████████████████ █ 
117.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms |   4
   2 ms |   4
   3 ms | █  27
   4 ms | █  39
   5 ms | ██  71
   6 ms | █████  142
   7 ms | █████████████  383
   8 ms | ████████████████████████████████████████  1203
   9 ms | ████████  239
  10 ms | █  42
  11 ms | █  45
  12 ms | ███  102
  13 ms | ██  46
  14 ms |   5
  15 ms |   3
  16 ms |   1
  17 ms |   3
  18 ms |   1
  21 ms |   1
  24 ms |   1
  25 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `118.39`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `39.33`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `62.15`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `329.83`, min `18.10`, p50 `118.29`, p95 `1375.11`, p99 `1636.67`, 1%low `28.81`, 0.1%low `18.95`, std `459.04`

**Frame time (ms)**  avg `9.42`, p50 `8.45`, p95 `19.03`, p99 `24.70`, p99.9 `47.03`, max `55.25`

**Client tick (ms)**  avg `0.46`, p95 `0.59`, max `0.83`

**Memory**  start `871 MB`, end `663 MB`, peak `967 MB`, GC `2 events / 18 ms`

**FPS over sampling window (ASCII):**

```
482.0 |█           █                                                                   
456.7 |█      █    █                                             █                     
431.4 |█   █  █  █ ██                                            █                     
406.1 |█   █  ████ ██    █  █  █              █                  █                     
380.8 |█ █ █  ████ ███   █  █  █  █         █ █                  █    █      █      █  
355.5 |███ █ █████ ███  ██  ██ █ ██         ███      █      █  █ █    █ ██   █ █    █ █
330.2 |█████ █████ ███  ██ ███ █ ███      █████   ██ █ █    █  █ █    ████ ███ █    █ █
304.9 |███████████ ████ ██ ███ █ ███   █  █████  ███████ █████ ███ ███████ ███ ████ █ █
279.6 |███████████ ████ ██████ █ ███   █  █████ ██████████████ ███ ███████████ ██████ █
254.4 |███████████ ████ ██████ █████   ██ █████ ███████████████████████████████████████
229.1 |████████████████ ████████████ ██████████ ███████████████████████████████████████
203.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████  329
   1 ms | ███████  118
   2 ms | ███  45
   3 ms | █  22
   4 ms | █  9
   5 ms |   4
   6 ms |   1
   7 ms | ████████  137
   8 ms | ████████████████████████████████████████  705
   9 ms | █████  84
  12 ms |   6
  13 ms | ██  31
  14 ms | ████  68
  15 ms | ██████████  172
  16 ms | █████████  160
  17 ms | █████  82
  18 ms | ██  43
  19 ms | ██  30
  20 ms | ██  31
  21 ms | █  19
  22 ms |   2
  23 ms |   2
  24 ms |   3
  25 ms |   3
  27 ms |   1
  28 ms |   1
  29 ms |   2
  31 ms |   1
  32 ms |   3
  33 ms |   1
  34 ms |   1
  36 ms |   1
  37 ms |   1
  43 ms |   1
  46 ms |   1
  47 ms |   1
  50 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `106.16`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `18.95`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.81`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `286.12`, min `45.13`, p50 `118.01`, p95 `1206.38`, p99 `1297.75`, 1%low `46.68`, 0.1%low `45.22`, std `385.71`

**Frame time (ms)**  avg `9.34`, p50 `8.47`, p95 `18.11`, p99 `20.80`, p99.9 `21.86`, max `22.16`

**Client tick (ms)**  avg `0.65`, p95 `0.95`, max `1.41`

**Memory**  start `727 MB`, end `887 MB`, peak `978 MB`, GC `2 events / 13 ms`

**FPS over sampling window (ASCII):**

```
356.6 |           █                    █     █     █                                   
341.8 |    █      █                    █     █     █              █                    
327.1 |    █ █  █ █   █        █ ██    ██    █  █  █        █     █                 █  
312.3 |    █ █  █ █   █        ████ █ ███    █  █ ██        █  █  █ ██      █     █ █  
297.5 |    █ █  █ █   ██    █  ████ █████    ██ ███████ ██  █ ██  █ ██  █  ██     █ ██ 
282.7 | █ ████  █ █ █ ████  ██ ████ ███████████ ███████ ██  █ ██  █ ███ █  ████   █ ██ 
267.9 | █████████ █ ██████  ██ ████████████████ ███████ █████ ███ █████ █ ███████ ████ 
253.1 | █████████ █ ██████  ██ ████████████████ ███████ █████████ █████ ██████████████ 
238.3 | █████████ █ ██████ ████████████████████████████ █████████ █████████████████████
223.5 | █████████ █ ██████ ████████████████████████████ █████████ █████████████████████
208.7 | █████████ █████████████████████████████████████ ███████████████████████████████
194.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████  274
   1 ms | ████████  144
   2 ms | ██  36
   3 ms |   8
   6 ms |   4
   7 ms | █████████  157
   8 ms | ████████████████████████████████████████  717
   9 ms | ████████  152
  10 ms |   1
  12 ms |   2
  13 ms | █  20
  14 ms | ████  74
  15 ms | ██████████  174
  16 ms | █████████  164
  17 ms | █████  96
  18 ms | ██  41
  19 ms | ██  31
  20 ms | █  26
  21 ms | █  17
  22 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `38.00`
- `fps_harmonic_avg` = `107.03`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `45.22`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `46.68`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `85.93`, min `20.93`, p50 `32.26`, p95 `587.17`, p99 `682.01`, 1%low `21.48`, 0.1%low `20.93`, std `147.72`

**Frame time (ms)**  avg `26.33`, p50 `30.99`, p95 `43.67`, p99 `46.05`, p99.9 `47.11`, max `47.78`

**Client tick (ms)**  avg `1.06`, p95 `1.29`, max `1.72`

**Memory**  start `883 MB`, end `479 MB`, peak `996 MB`, GC `5 events / 12 ms`

**FPS over sampling window (ASCII):**

```
254.0 |         █  █      █                                                            
233.6 |         █  ██     █    █                                                       
213.1 |  █ ██   ████████████ ███                                                       
192.7 |████████ ████████████ ███                                                       
172.2 |█████████████████████ ███                                                       
151.8 |█████████████████████████                                                       
131.4 |█████████████████████████                                                       
110.9 |█████████████████████████                                                       
 90.5 |██████████████████████████                                                      
 70.0 |██████████████████████████                                                      
 49.6 |██████████████████████████                                                      
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███████████████████████  44
   2 ms | █████  9
   3 ms | █  1
   6 ms | █  2
   7 ms | ██████████  18
   8 ms | ██████████████████████████████████  63
   9 ms | ██████████  18
  12 ms | █  2
  13 ms | ██  3
  14 ms | ██  4
  15 ms | ██████  11
  16 ms | ████  8
  17 ms | ██████  11
  18 ms | ████  7
  19 ms | ████████  15
  20 ms | ██████████████████  33
  21 ms | ███████████  20
  22 ms | ███████████  20
  23 ms | ██████  12
  24 ms | █████  9
  25 ms | ████  7
  26 ms | ██████  11
  27 ms | ███████  13
  28 ms | █████  10
  29 ms | █████████  16
  30 ms | ███████  13
  31 ms | ███████████  20
  32 ms | ████████████████████████  45
  33 ms | █████████████████████████  46
  34 ms | ████████████████████████████████████████  75
  35 ms | █████████████  24
  36 ms | ███████████  21
  37 ms | ███████████████  28
  38 ms | ████████  15
  39 ms | ███████  13
  40 ms | ████████  15
  41 ms | ████████  15
  42 ms | █████████  16
  43 ms | ███████  14
  44 ms | ██████  11
  45 ms | ██████  11
  46 ms | █████  9
  47 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `35.00`
- `fps_harmonic_avg` = `37.97`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `20.93`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.48`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `35.50`, min `12.83`, p50 `30.14`, p95 `52.12`, p99 `98.48`, 1%low `14.51`, 0.1%low `12.83`, std `58.98`

**Frame time (ms)**  avg `33.55`, p50 `33.18`, p95 `48.19`, p99 `60.63`, p99.9 `75.16`, max `77.95`

**Client tick (ms)**  avg `3.01`, p95 `3.62`, max `5.22`

**Memory**  start `737 MB`, end `673 MB`, peak `1012 MB`, GC `5 events / 12 ms`

**FPS over sampling window (ASCII):**

```
258.1 |                                    █                                           
237.2 |                                    █                                           
216.4 |                                    █                                           
195.5 |                                    █                                           
174.7 |                                    █                                           
153.8 |                                    █                                           
133.0 |                                    █                                           
112.1 |                                    █                                           
 91.3 |                                    █                                           
 70.4 |                                    █ █                                         
 49.5 |             █         █            █ █                                         
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  1
   3 ms | █  1
   4 ms | █  1
   7 ms | █  1
   8 ms | ██  2
  10 ms | █  1
  12 ms | █  1
  16 ms | ██  2
  17 ms | ███████  8
  18 ms | ████████  10
  19 ms | ███████████  13
  20 ms | ██████████████  17
  21 ms | ███████████████  18
  22 ms | ████████  10
  23 ms | ███████████  13
  24 ms | ████████████  15
  25 ms | ███████████  13
  26 ms | ███████████  14
  27 ms | █████████████  16
  28 ms | █████████████  16
  29 ms | ████████████████████  25
  30 ms | █████████████████████████████████  41
  31 ms | █████████████████  21
  32 ms | █████████████████████████  31
  33 ms | ████████████████████████  30
  34 ms | ████████████████████  24
  35 ms | ███████████  13
  36 ms | ████████████████████████████████████████  49
  37 ms | ████████████████████  25
  38 ms | ████████  10
  39 ms | █████████████  16
  40 ms | ███████  8
  41 ms | ████████████████  19
  42 ms | ███████████  13
  43 ms | ████████  10
  44 ms | ███████████  14
  45 ms | ███████████  14
  46 ms | ████████████████  19
  47 ms | ███████  8
  48 ms | ████████  10
  49 ms | ███████  8
  50 ms | █  1
  51 ms | ██  2
  53 ms | ██  2
  55 ms | █  1
  56 ms | █  1
  57 ms | █  1
  60 ms | █  1
  61 ms | █  1
  63 ms | █  1
  64 ms | █  1
  72 ms | █  1
  73 ms | █  1
  77 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `36.00`
- `fps_harmonic_avg` = `29.81`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `12.83`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `14.51`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `35.59`, min `16.18`, p50 `29.21`, p95 `69.74`, p99 `121.85`, 1%low `16.89`, 0.1%low `16.18`, std `20.23`

**Frame time (ms)**  avg `33.41`, p50 `34.23`, p95 `50.15`, p99 `55.78`, p99.9 `60.52`, max `61.80`

**Client tick (ms)**  avg `3.82`, p95 `5.37`, max `6.77`

**Memory**  start `958 MB`, end `836 MB`, peak `1012 MB`, GC `10 events / 23 ms`

**FPS over sampling window (ASCII):**

```
 66.3 |                                             █                                  
 62.8 |                                             █                                  
 59.4 |                                             █                                  
 55.9 |                                             █                                  
 52.4 |                                             █                                  
 48.9 |                                 █           █                █                 
 45.4 |                     █     █     █     █     █              █ █                 
 42.0 |                 █   ███   █ █   █     █     █     █   █  █ █ █ █               
 38.5 |       █   █ █   █  ████   █ █   █ █   █     █     █ ███  █ █ █ █     █    ██   
 35.0 | ██  █ ██  ███  ██  ████ █ ███ █ █ ██  █ ██  █ ██  █ ███  █████ ███ █ █   ███   
 31.5 |██████████ █████████████████████ ███████████ █████ ████████████ ████████████████
 28.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   6 ms | ██  2
   7 ms | ████  3
   8 ms | ████████  7
   9 ms | ██  2
  10 ms | ██  2
  11 ms | ████  3
  12 ms | ████  3
  13 ms | ███████  6
  14 ms | ███████  6
  15 ms | ██████  5
  16 ms | █████████  8
  17 ms | ███████████████  13
  18 ms | █████████████  11
  19 ms | ███████████████████████████  23
  20 ms | ███████████████  13
  21 ms | █████████████  11
  22 ms | ███████████  9
  23 ms | █████████████  11
  24 ms | ██████████████  12
  25 ms | ██████  5
  26 ms | ███████████  9
  27 ms | ████████████  10
  28 ms | ██████████████████  15
  29 ms | ███████████████████  16
  30 ms | ████████████████████████  20
  31 ms | █████████████████████  18
  32 ms | ████████████████████████  20
  33 ms | ███████████████████████████████████  30
  34 ms | ████████████████████  17
  35 ms | ███████████████████████████  23
  36 ms | ██████████████████████████  22
  37 ms | ███████████████████  16
  38 ms | ████████████████████████████████████████  34
  39 ms | █████████████████████  18
  40 ms | █████████████████████████  21
  41 ms | ██████████████  12
  42 ms | ████████████████  14
  43 ms | ███████████████████  16
  44 ms | ██████████████████████  19
  45 ms | ████████████████  14
  46 ms | ████████████████████  17
  47 ms | ███████████  9
  48 ms | ███████████████████  16
  49 ms | ███████  6
  50 ms | ████████████  10
  51 ms | █████  4
  53 ms | ████  3
  54 ms | ██████  5
  55 ms | ████  3
  57 ms | ██  2
  58 ms | █  1
  59 ms | ██  2
  61 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_alive_max` = `1560.00`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `16.89`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `29.93`
- `preload_duration_ms` = `55.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `16.18`
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

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `31.28`, min `21.02`, p50 `29.55`, p95 `46.62`, p99 `50.56`, 1%low `21.22`, 0.1%low `21.02`, std `7.10`

**Frame time (ms)**  avg `33.41`, p50 `33.85`, p95 `44.31`, p99 `46.60`, p99.9 `47.56`, max `47.57`

**Client tick (ms)**  avg `0.91`, p95 `1.11`, max `1.30`

**Memory**  start `998 MB`, end `557 MB`, peak `1023 MB`, GC `5 events / 20 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                                                   █                            
 34.2 | █                                 █            █  █                            
 33.6 | █   █                           █ █     █      █  █                 █   █      
 33.1 | █ █ █                 █         █ █     █      █  █       █         █   █      
 32.6 | █ █ █   █             █   █     █ █     █      █  █ █  █  ██ █      █   █  █  █
 32.0 | █ █ █   █             █   █     █ █     █ █ █  █  █ █  █  ██ █ █    █   █  █  █
 31.5 | █ █ █ █ ██ █  █ █   █ ███ █     █ █ ██  ███ █  █  █ █  ██ ██ █ ███  █ █ █  █  █
 31.0 |██ █ ███████████ ██  █ ███ █ ███ █ █ ██  ███ █  ██ █ █ ███ ██ █ ████ █ █ █  ██ █
 30.5 |██ █ ███████████████ █ ███ █ ███ █ █████ ███ █  ██ █ █ ███ ██ ████████ █ ██ ██ █
 29.9 |████ █████████████████ ███ █ ███ █ █████████ █ ███ █ █ ███ █████████████ █████ █
 29.4 |██████████████████████████████████ ███████████ █████████████████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  1
  18 ms | █  2
  19 ms | ███  5
  20 ms | ███████  14
  21 ms | ██████████  18
  22 ms | █████████████  25
  23 ms | █████  10
  24 ms | ███████  14
  25 ms | █████  10
  26 ms | ███████  13
  27 ms | ███████  13
  28 ms | ██████  11
  29 ms | ████████  15
  30 ms | ███████  14
  31 ms | ██████████  19
  32 ms | ████████████████████████████████  60
  33 ms | ████████████████████████████████████████  75
  34 ms | █████████████████████████████████████  69
  35 ms | ████████████  23
  36 ms | ███████████  21
  37 ms | ███████████████  28
  38 ms | ████████████  23
  39 ms | ███████████  20
  40 ms | █████████  16
  41 ms | ████████  15
  42 ms | ████████  15
  43 ms | ███████  14
  44 ms | ████████  15
  45 ms | █████  9
  46 ms | █████  9
  47 ms | ██  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `29.93`
- `fps_1pct_low` = `21.22`
- `preload_duration_ms` = `42.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `21.02`
- `preset_quick` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `31.21`, min `21.07`, p50 `29.70`, p95 `46.57`, p99 `49.06`, 1%low `21.40`, 0.1%low `21.07`, std `6.81`

**Frame time (ms)**  avg `33.40`, p50 `33.67`, p95 `44.74`, p99 `46.21`, p99.9 `47.13`, max `47.46`

**Client tick (ms)**  avg `0.44`, p95 `0.57`, max `0.78`

**Memory**  start `741 MB`, end `521 MB`, peak `1020 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 34.5 |                                                                      █         
 33.9 |  █        █                                          █               █         
 33.4 |  █        █       █           █                      █               █     █   
 32.9 |  █      █ █ █     █           █                      █   █     █ █ █ █     █   
 32.4 |  █  █   █ █ █   █ █           █                      █ █ █   █ █ █ █ █ █   █   
 31.9 |  ██ █ █ █ █ █ █ █ █       █   █        █   █      █  █ █ █   █ █ █ █ █ █   █   
 31.4 |  ██ █ █ █ █ █ █ █ █   █   █ ███ █ █  █ █   ██ ██ ██  █ █ █ █ █ █ █ █ █ █   █ █ 
 30.9 |  ██ █ ███ █ █ █ █ █  ███ ██████ ████ █████ █████ ███ █ █ █ █ █ █ █ █ █ ███ █ █ 
 30.4 |█ ████ █████ █ ███ ██████ ██████ ████████████████████ █ █ █ ███ █ █ █ ██████████
 29.9 |████████████ ████████████ ███████████████████████████ █████████ █ ███ ██████████
 29.3 |████████████ ████████████████████████████████████████ █████████ █ ██████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  2
  20 ms | ████  11
  21 ms | █████████  27
  22 ms | ██████  18
  23 ms | ███  9
  24 ms | ████  11
  25 ms | ██████  18
  26 ms | ███  10
  27 ms | █████  15
  28 ms | █████  15
  29 ms | ██████  19
  30 ms | ████  11
  31 ms | ████  14
  32 ms | ████████████  38
  33 ms | ████████████████████████████████████████  125
  34 ms | ███████████████  47
  35 ms | █████████  29
  36 ms | ███████  23
  37 ms | ████████  26
  38 ms | ███████  21
  39 ms | █████  15
  40 ms | █████  15
  41 ms | █████  15
  42 ms | ████  11
  43 ms | ████  14
  44 ms | ████  13
  45 ms | ██████  18
  46 ms | ██  7
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `21.40`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `75.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `21.07`
- `beds_placed` = `40.00`
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

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `34.70`, min `18.26`, p50 `28.26`, p95 `58.39`, p99 `123.05`, 1%low `18.50`, 0.1%low `18.26`, std `23.49`

**Frame time (ms)**  avg `33.41`, p50 `35.39`, p95 `48.26`, p99 `52.63`, p99.9 `54.48`, max `54.76`

**Client tick (ms)**  avg `3.43`, p95 `5.24`, max `7.92`

**Memory**  start `700 MB`, end `537 MB`, peak `1076 MB`, GC `5 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 82.8 |     █                                                                          
 77.8 |     █                                                                          
 72.9 |     █                                                                          
 67.9 |     █                                                                          
 63.0 |     █                                                                          
 58.0 |     █                                                                          
 53.1 |     █                                           █                              
 48.1 | ██  █           █       █                   █   █                              
 43.2 | ██  █           █ █     █                   █   █                              
 38.2 | █████  █     ██ █ █     █   █     █   █     █   ███        █           █       
 33.3 | █████ ███████████ ████ ██ █ ████████ ██████████████████ █████████ ██ █ █ ██ ██ 
 28.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
   5 ms | █  2
   6 ms | █  2
   8 ms | █  2
   9 ms | █  2
  10 ms | ██  3
  11 ms | █  2
  12 ms | ███  4
  13 ms | ███  4
  14 ms | █  1
  15 ms | ████  6
  16 ms | █  1
  17 ms | ███████  9
  18 ms | ████████  11
  19 ms | █████████████  17
  20 ms | ██████████  14
  21 ms | ██████  8
  22 ms | ██████████  13
  23 ms | ███████  10
  24 ms | ██████████  13
  25 ms | ███████  10
  26 ms | ███████  10
  27 ms | ███████  9
  28 ms | ██████████  13
  29 ms | █████████████  18
  30 ms | █████████████████████████  34
  31 ms | ███████████  15
  32 ms | ████████████████  21
  33 ms | █████████████████████  28
  34 ms | ███████  10
  35 ms | ███████████████████████  31
  36 ms | ████████████████████████████████████████  54
  37 ms | ████████████████████████  32
  38 ms | ███████████████████  25
  39 ms | ████████████  16
  40 ms | ███████████████  20
  41 ms | █████████████████  23
  42 ms | ███████  9
  43 ms | ██████████  13
  44 ms | █████████  12
  45 ms | ███████████  15
  46 ms | ██████████  14
  47 ms | ████████  11
  48 ms | ██████████  13
  49 ms | ████  5
  50 ms | ██  3
  51 ms | █  1
  52 ms | ██  3
  53 ms | ███  4
  54 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `18.26`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.07`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `18.50`
- `fps_harmonic_avg` = `29.93`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `138.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `33.40`, min `17.63`, p50 `29.27`, p95 `52.76`, p99 `103.61`, 1%low `19.10`, 0.1%low `17.63`, std `16.26`

**Frame time (ms)**  avg `33.39`, p50 `34.16`, p95 `46.69`, p99 `50.12`, p99.9 `55.63`, max `56.71`

**Client tick (ms)**  avg `2.52`, p95 `4.20`, max `5.62`

**Memory**  start `710 MB`, end `815 MB`, peak `1118 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 56.0 |      █                                                                         
 53.5 |      █                                                                         
 51.1 |      █           █                                                             
 48.6 |   █  █ █         █                                █                            
 46.1 |   █  █ █     █   █                                █                            
 43.6 |   █  █ █     █   █ █                              █                            
 41.1 |   █  █ █   █ █   █ █                              █                            
 38.6 |   █ ██ █   █ █   █ █                              █      █                     
 36.1 |   █ ██ █ █ █ █ █ █ █                      █       █      █    █                
 33.7 | █ ████ █ █ █ ███ █ █   █     █ ██  █ █   ███     ██ █   ██ █  █ █       █ █  ██
 31.2 |███████████ █ ███ █ ███████████ ██████████████ ██████████████████████████████ ██
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   6 ms | █  1
   7 ms | █  1
   8 ms | ███  3
   9 ms | █  1
  10 ms | ███  3
  11 ms | █  1
  12 ms | ████  4
  13 ms | ███  3
  15 ms | ██  2
  16 ms | ██  2
  17 ms | ████  4
  18 ms | █████  5
  19 ms | ████████████  13
  20 ms | ███████████  12
  21 ms | ███████████  12
  22 ms | ███████████████  16
  23 ms | █████████████  14
  24 ms | █████████  10
  25 ms | ██████████  11
  26 ms | ████████████████████  21
  27 ms | ██████████████  15
  28 ms | █████████  10
  29 ms | ███████████████  16
  30 ms | ███████████████████  20
  31 ms | ███████████████████████████████████████  42
  32 ms | █████████████████████  23
  33 ms | ████████████████████████████  30
  34 ms | ████████████████████████  26
  35 ms | ████████████████████████████████████████  43
  36 ms | ███████████████████████████████████  38
  37 ms | ███████████████████  20
  38 ms | ████████████████████  21
  39 ms | █████████████  14
  40 ms | ████████████████  17
  41 ms | ██████████████  15
  42 ms | █████████████████  18
  43 ms | █████████████████  18
  44 ms | ███████████████  16
  45 ms | █████████████  14
  46 ms | ████████████████  17
  47 ms | ███████  7
  48 ms | ██████████  11
  49 ms | █  1
  50 ms | █████  5
  54 ms | █  1
  56 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `17.63`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.53`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `19.10`
- `fps_harmonic_avg` = `29.95`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `33.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `45.85`, min `11.98`, p50 `29.72`, p95 `157.14`, p99 `230.21`, 1%low `13.07`, 0.1%low `11.98`, std `44.69`

**Frame time (ms)**  avg `34.26`, p50 `33.65`, p95 `61.31`, p99 `72.41`, p99.9 `80.75`, max `83.45`

**Client tick (ms)**  avg `15.15`, p95 `20.79`, max `28.52`

**Memory**  start `516 MB`, end `410 MB`, peak `1147 MB`, GC `28 events / 92 ms`

**FPS over sampling window (ASCII):**

```
 77.2 |                       █                                                █       
 72.9 |                   █   █                                                █       
 68.6 |               █   █   █                         █    █   █             █       
 64.3 |    █          █   █   █                      █  █    █   █             █       
 60.0 |    █        █ █   █   █  █               █ █ █  ██   █   █         █   █       
 55.7 |    █        █ █   ██  █  █  █        █   █ █ █  ███  █   █    █    █   █  █    
 51.4 |    ██ █    ██ █   ███ █  █  █        █   █ █ █  ███  █   █   ██    █   ██ █    
 47.1 |    ██ ██ █ ██ █   ███ ██ █ ███ █  █  █   █ █ ██ ███  █   █   ██    █   ██ █    
 42.9 |    ██ ████ ██ ██ ████ ██ █ ███ █  █  █ █████ ██ ███  █ ███ █ ██   ███  ██ █   █
 38.6 |███ ██ ███████ ██ ████ ████████ ██ ██ ███████ ██ ██████ ███ █████  ████ ██ ███ █
 34.3 |██████████████ ██ ████ ████████ ██ ████████████████████████ ████████████████████
 30.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ████████  4
   4 ms | ████████████████████  10
   5 ms | ██████████████████  9
   6 ms | ████████████████████████  12
   7 ms | ████████████████  8
   8 ms | ████████  4
   9 ms | ████████████████  8
  10 ms | ██████  3
  11 ms | ██████████████  7
  12 ms | ██████  3
  13 ms | ████████████████████  10
  14 ms | ██████████  5
  15 ms | ██████████████████████████  13
  16 ms | ████████████████████████████  14
  17 ms | ████████████████████  10
  18 ms | ████████████████████████  12
  19 ms | ██████████████████████████  13
  20 ms | ████████████████████████  12
  21 ms | ████████████  6
  22 ms | ████████████████████  10
  23 ms | ██████████████  7
  24 ms | ████████████████████████████████  16
  25 ms | ██████████████████████  11
  26 ms | ██████████████████████████████████  17
  27 ms | ████████████  6
  28 ms | ████████  4
  29 ms | ██████████  5
  30 ms | ██████████████████████████████  15
  31 ms | ██████████████████████████  13
  32 ms | ████████████████████████████  14
  33 ms | ████████████████████████████████████████  20
  34 ms | ████████████████████████████████  16
  35 ms | ████████████████  8
  36 ms | ██████████████  7
  37 ms | ██████████████████████  11
  38 ms | ████████████████████████  12
  39 ms | ████████████  6
  40 ms | ████████████████  8
  41 ms | ████████████  6
  42 ms | ████████████████  8
  43 ms | ████████████████████████  12
  44 ms | ██████████████████████████████  15
  45 ms | ██████████████████  9
  46 ms | ██████████████████████  11
  47 ms | ██████████████  7
  48 ms | ██████████████████████████  13
  49 ms | ██████████████████  9
  50 ms | ████████████████████████████  14
  51 ms | ████████████████████████████  14
  52 ms | ██████████████████  9
  53 ms | ████████████████████  10
  54 ms | ████████████████  8
  55 ms | ██████  3
  56 ms | ████████████████  8
  57 ms | ██████████  5
  58 ms | ██████████████  7
  59 ms | ████████████  6
  60 ms | ████████████████  8
  61 ms | ████████████  6
  63 ms | ██████  3
  64 ms | ████  2
  65 ms | ██████  3
  67 ms | ██████  3
  68 ms | ██  1
  69 ms | ████████  4
  70 ms | ██  1
  71 ms | ██████  3
  72 ms | ██  1
  73 ms | ██████  3
  76 ms | ██  1
  78 ms | ██  1
  83 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `falling_blocks_alive_avg` = `4808.76`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `11.98`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.19`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `25132.00`
- `preload_duration_ms` = `34.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `13.07`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `45.21`, min `12.39`, p50 `28.36`, p95 `143.05`, p99 `180.90`, 1%low `12.94`, 0.1%low `12.39`, std `52.19`

**Frame time (ms)**  avg `34.78`, p50 `35.26`, p95 `63.52`, p99 `74.03`, p99.9 `79.93`, max `80.72`

**Client tick (ms)**  avg `15.76`, p95 `21.60`, max `26.95`

**Memory**  start `675 MB`, end `599 MB`, peak `1143 MB`, GC `26 events / 90 ms`

**FPS over sampling window (ASCII):**

```
156.9 | █                                                                              
145.5 | █                                                                              
134.1 | █                                                                              
122.7 | █                                                                              
111.3 | █                                                                              
 99.9 | █                                                                              
 88.5 | █                                                                              
 77.1 | █                                                              █               
 65.6 | █ █ █                 █           █                            █               
 54.2 | █ █ █  █  ██    █   ███     █ █  ███  ██      ██      ██   █  ███              
 42.8 | █ ███████ ██ █████  ███ ██  █ █ ████████  ██  ███ ██ ███ █ ██████████ █  ██ █  
 31.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  1
   4 ms | ██  1
   5 ms | █████████████  7
   6 ms | ████████████████████████████████████████  21
   7 ms | █████████████████████████████  15
   8 ms | ███████████████  8
   9 ms | █████████████  7
  10 ms | ████  2
  11 ms | ███████████████  8
  12 ms | ███████████  6
  13 ms | ███████████████  8
  14 ms | ████  2
  15 ms | █████████████████  9
  16 ms | ███████████████████████  12
  17 ms | █████████████████████  11
  18 ms | ██████████████████████████████████  18
  19 ms | ████████  4
  20 ms | █████████████  7
  21 ms | █████████████████  9
  22 ms | █████████████████████████  13
  23 ms | ███████████████████████  12
  24 ms | ███████████████  8
  25 ms | ████████  4
  26 ms | █████████████████  9
  27 ms | ███████████████████████████  14
  28 ms | ███████████████████  10
  29 ms | █████████████  7
  30 ms | █████████████  7
  31 ms | ███████████████████  10
  32 ms | █████████████████  9
  33 ms | █████████████████████████████  15
  34 ms | █████████████████████  11
  35 ms | ███████████████████████  12
  36 ms | ███████████████████  10
  37 ms | ███████████████████  10
  38 ms | ████████████████████████████████  17
  39 ms | ███████████████████████████  14
  40 ms | █████████████████████████  13
  41 ms | ████████████████████████████████  17
  42 ms | █████████████████████████████  15
  43 ms | █████████████████████████  13
  44 ms | ███████████  6
  45 ms | ███████████  6
  46 ms | ███████████████████  10
  47 ms | ███████████  6
  48 ms | █████████████  7
  49 ms | ███████████████████████████  14
  50 ms | ███████████████  8
  51 ms | █████████████████  9
  52 ms | █████████████████  9
  53 ms | ██████████  5
  54 ms | █████████████  7
  55 ms | █████████████████  9
  56 ms | █████████████  7
  57 ms | █████████████  7
  58 ms | ███████████████████  10
  59 ms | ████████  4
  60 ms | ██████████  5
  61 ms | ██████  3
  62 ms | ████████  4
  63 ms | ██████████  5
  64 ms | ██  1
  65 ms | ██████  3
  66 ms | ██████  3
  67 ms | ████  2
  68 ms | ██████  3
  69 ms | ██  1
  70 ms | ████  2
  71 ms | ██  1
  72 ms | ██████  3
  73 ms | ████  2
  74 ms | ██████  3
  76 ms | ██  1
  78 ms | ██  1
  79 ms | ██  1
  80 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `falling_blocks_alive_avg` = `4798.68`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `12.39`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `28.75`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `25343.00`
- `preload_duration_ms` = `42.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `12.94`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `31.49`, min `19.56`, p50 `29.51`, p95 `47.75`, p99 `52.29`, 1%low `20.40`, 0.1%low `19.56`, std `7.61`

**Frame time (ms)**  avg `33.39`, p50 `33.89`, p95 `45.12`, p99 `47.39`, p99.9 `50.37`, max `51.14`

**Client tick (ms)**  avg `1.79`, p95 `2.45`, max `9.88`

**Memory**  start `924 MB`, end `1092 MB`, peak `1140 MB`, GC `4 events / 17 ms`

**FPS over sampling window (ASCII):**

```
 34.1 |                                                                  █             
 33.7 |        █                     █       █                           █  █          
 33.2 |        █                    ██       █       █                   █  █          
 32.8 |█    █  █  █  █              ██       █       █                 █ ██ █          
 32.4 |█    ██ █  █  █     █ █   █  ██       ██ █    █   █          █  █ ██ █        █ 
 31.9 |█    ██ █ ██  █   █ █ ██  █  ██  █  █ ████    █   █      █   █  █ ██ █    █   █ 
 31.5 |██   ██ ████  █ ████████  █  ██  █ ██ ██████  █  ██      █ █ █ ██ ██ █ █ ██   █ 
 31.0 |██  ████████ ██ █████████ █ ███ █████ ██████████████ █ █ █ █ █ ██ ██ █ █ ███ ██ 
 30.6 |███ ████████ ██ █████████████████████ ██████████████████████ ████ ██ ██████████ 
 30.1 |███ ████████ ████████████████████████ ██████████████████████ ████ █████████████ 
 29.7 |███ ████████████████████████████████████████████████████████████████████████████
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | ██  3
  18 ms | █  1
  19 ms | ███████  11
  20 ms | ██████████  15
  21 ms | ███████████  17
  22 ms | ████████  13
  23 ms | █████████  14
  24 ms | ██████████  16
  25 ms | ███████████  18
  26 ms | ████████  12
  27 ms | ███████  11
  28 ms | ████████  13
  29 ms | █████████  14
  30 ms | ██████████  15
  31 ms | █████████████████████████████████  52
  32 ms | █████████████████  26
  33 ms | █████████████████████████████████  52
  34 ms | ████████████████████████████  44
  35 ms | ████████████████████████████████████████  63
  36 ms | █████████████████  27
  37 ms | ██████████████████  29
  38 ms | ███████  11
  39 ms | ██████████  16
  40 ms | ███████  11
  41 ms | ███████████  18
  42 ms | ███████████  18
  43 ms | ████████  12
  44 ms | █████████  14
  45 ms | ███████████  17
  46 ms | █████  8
  47 ms | ██  3
  48 ms | █  1
  49 ms | █  2
  51 ms | █  1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `falling_blocks_alive_avg` = `619.24`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.56`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.95`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3087.00`
- `preload_duration_ms` = `59.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.40`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `31.75`, min `19.66`, p50 `29.76`, p95 `47.90`, p99 `52.87`, 1%low `20.44`, 0.1%low `19.66`, std `9.82`

**Frame time (ms)**  avg `33.40`, p50 `33.60`, p95 `45.01`, p99 `47.51`, p99.9 `50.57`, max `50.86`

**Client tick (ms)**  avg `1.84`, p95 `2.51`, max `9.51`

**Memory**  start `722 MB`, end `921 MB`, peak `1157 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 49.2 |                  █                                                             
 47.4 |                  █                                                             
 45.6 |                  █                                                             
 43.8 |                  █                                                             
 42.0 |                  █                                                             
 40.1 |                  █                                                             
 38.3 |                  █                                                             
 36.5 |             █    █                                                             
 34.7 |             █    █                                             █               
 32.8 | █   █ █   █ █ ██ █   ██  █  █  █  ██  █  █    ██  █ █ █ █  █   █   █ █ █ █ █  █
 31.0 |███ ████████████████████ ███████████████████ █████ █ ██████ █████████ ███ █ ████
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
  12 ms | █  1
  17 ms | █  1
  18 ms | ███  4
  19 ms | ███████  9
  20 ms | ███████████████  20
  21 ms | ███████  9
  22 ms | ██████████████  19
  23 ms | █████████████  18
  24 ms | ██████████████  19
  25 ms | █████████  13
  26 ms | ████████  11
  27 ms | █████████  12
  28 ms | ███████  9
  29 ms | ████████████  17
  30 ms | █████████████████████  29
  31 ms | ███████████████████████████  37
  32 ms | █████████████████████  29
  33 ms | ████████████████████████████████████████  55
  34 ms | █████████████████████████  35
  35 ms | █████████████████████████████████████  51
  36 ms | ████████████████████  28
  37 ms | ████████████  17
  38 ms | ███████████  15
  39 ms | ███████████████  20
  40 ms | ███████████████  20
  41 ms | ████████████  17
  42 ms | ██████████████  19
  43 ms | ███████████████  20
  44 ms | █████████  12
  45 ms | ██████████  14
  46 ms | █████  7
  47 ms | ████  6
  48 ms | █  2
  50 ms | █  2
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `falling_blocks_alive_avg` = `619.46`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.66`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3430.00`
- `preload_duration_ms` = `55.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.44`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `31.07`, min `20.14`, p50 `30.16`, p95 `44.56`, p99 `49.03`, 1%low `21.08`, 0.1%low `20.14`, std `6.29`

**Frame time (ms)**  avg `33.39`, p50 `33.15`, p95 `44.88`, p99 `46.45`, p99.9 `48.44`, max `49.64`

**Client tick (ms)**  avg `0.62`, p95 `0.79`, max `0.90`

**Memory**  start `1069 MB`, end `869 MB`, peak `1169 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 34.9 |                                                            █                   
 34.4 |                                                            █                   
 33.9 |                                                            █                   
 33.4 |                     █                                      █                   
 32.9 |█ █                  ██                   █     █           █                   
 32.4 |█ █    █     █       ██    █   █ █        █     █        █  █   █ █             
 31.8 |█ █ █  █     █     █ ███ █ █ █ █ █  █     ███   █ █ █    █  ██  █ █         █   
 31.3 |█ █ ██ █ █   █     █ ███ █ █ █ █ █  █     ███   █ █ ██   █  ███ █ █ █       █ █ 
 30.8 |█ █ ████ █   █ █ █ █ ███ █████ ███  █     ████  █ █ ████ █  ███ █ █ ██ ████ ████
 30.3 |█ ████████ █████ █ █ ███ █████ █████████  █████ ███████████ ████████████████████
 29.8 |█ ██████████████ █ █████ █████ █████████████████████████████████████████████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | █  2
  20 ms | ███  8
  21 ms | █████  12
  22 ms | ███████  19
  23 ms | ██████  16
  24 ms | █████  12
  25 ms | ████  10
  26 ms | ████  10
  27 ms | ██████  16
  28 ms | █████  12
  29 ms | ██████  15
  30 ms | ███████  19
  31 ms | ██████████████████  47
  32 ms | █████████████████████████████████  85
  33 ms | ████████████████████████████████████████  102
  34 ms | ██████████████████  47
  35 ms | █████  14
  36 ms | █████  13
  37 ms | ███████  17
  38 ms | █████  13
  39 ms | ████  11
  40 ms | ████  11
  41 ms | ████  10
  42 ms | █████  13
  43 ms | ███████  18
  44 ms | ███████  19
  45 ms | ██████  16
  46 ms | ███  7
  47 ms | █  2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `21.08`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `41.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `20.14`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.95`
- `neighbour_updates` = `0.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `31.02`, min `20.73`, p50 `30.03`, p95 `45.00`, p99 `48.22`, 1%low `21.19`, 0.1%low `20.73`, std `6.17`

**Frame time (ms)**  avg `33.40`, p50 `33.31`, p95 `44.74`, p99 `46.25`, p99.9 `47.95`, max `48.24`

**Client tick (ms)**  avg `0.26`, p95 `0.31`, max `0.37`

**Memory**  start `1041 MB`, end `530 MB`, peak `1173 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 35.2 |                   █                                                            
 34.7 |                   █                                                            
 34.1 |                   █                                                            
 33.5 |                 █ █                                                   █        
 32.9 |      █          █ █ █                      █     █                    █   █   █
 32.3 |      █ █        █ █ █         █          █ █ █   █    █       █   █   █   █   █
 31.8 |  █   █ █  █   █ █ █ █ █ █  █  █        █ █ █ █   █    █ █ █ █ █ █ █   █   █   █
 31.2 |█ █   █ █  █ █ █ █ █ █ ███  █  █    █   █ █ █ █ █ █ █  █ █ █ █ █ █ █ █ █ █ ██  █
 30.6 |███ █ █ ██ █████ █ █ █ ████ █ ███   ███ █ █ █ ███ ████████████ █ █████ ███ ██  █
 30.0 |█████ ██████████ █ ███ ████████████ ███████ █ ██████████████████ █████████ █████
 29.4 |██████████████████ ███████████████████████████████████████████████████████ █████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   1
  20 ms | █  6
  21 ms | ████  18
  22 ms | ███  14
  23 ms | ██  10
  24 ms | ████  16
  25 ms | ████  15
  26 ms | ████  15
  27 ms | █  5
  28 ms | ████  15
  29 ms | ████  18
  30 ms | ██████  25
  31 ms | ████████  34
  32 ms | ████████████  49
  33 ms | ████████████████████████████████████████  167
  34 ms | █████  21
  35 ms | █████  21
  36 ms | ███  11
  37 ms | ███  14
  38 ms | ████  16
  39 ms | ███  11
  40 ms | ███  13
  41 ms | ███  14
  42 ms | ██  10
  43 ms | ███  14
  44 ms | █████  19
  45 ms | ████  18
  46 ms | █  4
  47 ms | █  3
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `59.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.73`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `fps_1pct_low` = `21.19`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `31.10`, min `18.72`, p50 `29.86`, p95 `46.19`, p99 `49.47`, 1%low `20.86`, 0.1%low `18.72`, std `6.56`

**Frame time (ms)**  avg `33.43`, p50 `33.49`, p95 `44.24`, p99 `46.51`, p99.9 `49.71`, max `53.41`

**Client tick (ms)**  avg `0.22`, p95 `0.28`, max `0.53`

**Memory**  start `1032 MB`, end `508 MB`, peak `1180 MB`, GC `4 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |                        █                                                       
 33.4 |                        █                 █         █                           
 32.9 |                        █                 █         █       █              █    
 32.5 |   █          █ █       █        █  █ █   █ █     █ █ █     █              █ █  
 32.0 |  ██    █     █ ██    █ █      █ █  █ █   █ █     █ █ █ █   █   █          █ █  
 31.5 |  ██    ██ █  █ ██    █ █ ██ █ █ █  █ █  ██ █     █ █ █ ██  █ ███  ███ ██  █ █ █
 31.0 |█ ██    ████  █ ███   █ █ ██ █ █ █  █ █  ████     █ ██████  █████ ████ ██  █ ███
 30.6 |████ █  █████ █ ███ █ █ █ ████ ███  █ █████████ ███ ███████ █████ ████████ █ ███
 30.1 |███████████████ █████ █ █ █████████ █ █████████████████████ ██████████████ █ ███
 29.6 |███████████████ ███████ ███████████ ████████████████████████████████████████████
 29.2 |███████████████████████ ████████████████████████████████████████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  3
  20 ms | ███  13
  21 ms | ████  17
  22 ms | ███  14
  23 ms | ███  12
  24 ms | ████  15
  25 ms | ████  17
  26 ms | ███  12
  27 ms | ███  11
  28 ms | ███  13
  29 ms | ████  16
  30 ms | ████  16
  31 ms | ████  16
  32 ms | ██████████  40
  33 ms | ████████████████████████████████████████  164
  34 ms | ██████  24
  35 ms | ███████  28
  36 ms | ██████  23
  37 ms | █████  19
  38 ms | ██  9
  39 ms | ████  15
  40 ms | █████  22
  41 ms | ███  11
  42 ms | █████  22
  43 ms | ███  13
  44 ms | ███  13
  45 ms | ██  9
  46 ms | ██  8
  47 ms |   2
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `20.86`
- `preset_long` = `0.00`
- `preload_duration_ms` = `96.00`
- `fps_harmonic_avg` = `29.91`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `18.72`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `31.09`, min `20.80`, p50 `29.99`, p95 `44.48`, p99 `48.42`, 1%low `21.32`, 0.1%low `20.80`, std `6.29`

**Frame time (ms)**  avg `33.38`, p50 `33.35`, p95 `44.94`, p99 `46.04`, p99.9 `47.46`, max `48.08`

**Client tick (ms)**  avg `0.27`, p95 `0.35`, max `0.48`

**Memory**  start `671 MB`, end `656 MB`, peak `1039 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 34.1 |                                  █                                   █         
 33.6 |                          █       █                                █  █         
 33.2 |  █                       █       █ █                              █  █         
 32.7 |█ █        █          █   █ █     █ █                █ █      █    █  █         
 32.2 |█ █    █   █       █  █   █ █     █ █                █ █ █    █    █  █       █ 
 31.7 |█ █ █  █   █       █  █   █ █   █ █ █   ██    ██   █ █ █ █   ██    █  █  █    █ 
 31.3 |█ █ █ ████ █ █   █ █  █ █ █ █ █ █ █ █   ██  █ ██   █ █ █ █ █ ██    ██ █  █   ███
 30.8 |█ ███ ██████ █ ███ ██ █ ███ ███ █ █ ███ ██ ██ ████ █ █ █ ███████ █ ██ █  █ █ ███
 30.3 |█ ███ ████████ ███ ██ █ ███ █████ █ ███ █████ ████ ███ █ █████████ ████  █ █ ███
 29.9 |██████████████ ███ ██ █ ███ █████ █ ██████████████████ █ █████████ ███████ █████
 29.4 |███████████████████████████ ██████████████████████████ █████████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  3
  20 ms | ██  6
  21 ms | ████  12
  22 ms | █████  16
  23 ms | █████  16
  24 ms | █████  16
  25 ms | █████  16
  26 ms | ████  13
  27 ms | ████  13
  28 ms | ████  14
  29 ms | █████  17
  30 ms | ██████████  31
  31 ms | ███████████  36
  32 ms | ███████████████  46
  33 ms | ████████████████████████████████████████  126
  34 ms | ███████████████  46
  35 ms | █████  17
  36 ms | ████  14
  37 ms | ████  13
  38 ms | ███  10
  39 ms | █████  15
  40 ms | █████  15
  41 ms | █████  15
  42 ms | █████  16
  43 ms | █████  17
  44 ms | ███  11
  45 ms | ██████  20
  46 ms | ██  6
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `21.32`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `43.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `20.80`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.96`
- `neighbour_updates` = `11200.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `30.92`, min `20.83`, p50 `30.00`, p95 `43.79`, p99 `47.06`, 1%low `21.48`, 0.1%low `20.83`, std `5.81`

**Frame time (ms)**  avg `33.40`, p50 `33.33`, p95 `44.42`, p99 `45.78`, p99.9 `47.41`, max `48.00`

**Client tick (ms)**  avg `0.28`, p95 `0.31`, max `7.90`

**Memory**  start `1018 MB`, end `555 MB`, peak `1110 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 34.2 |                                █                                               
 33.8 |                                █                █                              
 33.3 |                                █    █           █ █                            
 32.8 |                        █ █     █  █ █           █ █         █                  
 32.3 |             █          █ █ █   █  █ █ █         █ █         █                  
 31.8 | █ █     █   █ ██       █ █ █   █  █ █ █     █ █ █ █ █ █     █    █           █ 
 31.3 | █ ██    █ █ ████ █ █ █ █ █ ██  █ ██ █ █   █ █ █ █ █ █ █ █   █   ██ █   █ █ █ █ 
 30.8 | █ ██  █ █ █ ████ █ █ █ █ █ ███ █ ██ █ █   █ █ █ █ █ █ █ █ █ █ █ ████ █ █████ █ 
 30.3 | █████ █ █ █ ██████████ █ █ ███ ████ █ ███ █ █ █ █ █ █████ ███ ████████ █████ █ 
 29.8 | ███████████ ██████████ █ █████ ████ █████ █████ █ ███████ ██████████████████ █ 
 29.4 |█████████████████████████ █████ ████ ███████████ ██████████████████████████████ 
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   2
  20 ms | █  3
  21 ms | ██  12
  22 ms | ███  14
  23 ms | ████  21
  24 ms | ██  10
  25 ms | █  6
  26 ms | ███  14
  27 ms | ███  14
  28 ms | ██  9
  29 ms | ████  21
  30 ms | ███████  32
  31 ms | ██████  30
  32 ms | ████████  39
  33 ms | ████████████████████████████████████████  196
  34 ms | ████  19
  35 ms | ████  20
  36 ms | ██  12
  37 ms | ██  11
  38 ms | ██  9
  39 ms | ███  14
  40 ms | ██  10
  41 ms | ██  12
  42 ms | ██  10
  43 ms | ████  19
  44 ms | ████  18
  45 ms | ███  17
  46 ms |   2
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preload_duration_ms` = `38.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.83`
- `fps_1pct_low` = `21.48`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `31.52`, min `16.55`, p50 `29.91`, p95 `46.62`, p99 `55.22`, 1%low `19.03`, 0.1%low `16.55`, std `8.39`

**Frame time (ms)**  avg `33.53`, p50 `33.44`, p95 `45.53`, p99 `49.61`, p99.9 `56.78`, max `60.43`

**Client tick (ms)**  avg `0.35`, p95 `0.54`, max `6.91`

**Memory**  start `769 MB`, end `1233 MB`, peak `1469 MB`, GC `45 events / 225 ms`

**FPS over sampling window (ASCII):**

```
 40.9 |                                                                   █            
 39.8 |                                                                   █            
 38.7 |                                                                   █            
 37.6 |                          █                                        █            
 36.5 |                          █                                        █            
 35.4 |                          █             █                  █       █            
 34.3 |                          █             █     █            █       █            
 33.1 | █        █               █   █         █ █   ██   █   █   █       █ █ █        
 32.0 | █  █ ███ █ █    ███   ██ █████ █   █   █ █   ██   ██  █ █ █ █   █ █ █ █  █ █ █ 
 30.9 |██  █████ █ █████████████ ███████   █ █ ███ █ ██ █ ███████ █ ███████████ ████ ██
 29.8 |██ ██████████████████████ █████████████ ████████ ███████████████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms | █  1
  13 ms | █  1
  14 ms | █  2
  17 ms | █  2
  18 ms | ███  6
  19 ms | ███  5
  20 ms | ████  7
  21 ms | █████████  17
  22 ms | █████████  16
  23 ms | █████████  16
  24 ms | █████████  17
  25 ms | ███████  13
  26 ms | ███████  12
  27 ms | █████████  16
  28 ms | █████  9
  29 ms | ██████  10
  30 ms | ████████████  22
  31 ms | ██████████████████████  39
  32 ms | ██████████████████████████████████  61
  33 ms | ████████████████████████████████████████  72
  34 ms | █████████████████████████████  52
  35 ms | ████████████  22
  36 ms | ███████  12
  37 ms | ███████████  19
  38 ms | █████  9
  39 ms | ███████████  20
  40 ms | ███████  12
  41 ms | ████████  14
  42 ms | ███████████  19
  43 ms | ███████████  19
  44 ms | ███████  12
  45 ms | ██████████  18
  46 ms | ██████  10
  47 ms | █  2
  48 ms | ██  4
  49 ms | ██  3
  50 ms | ██  3
  54 ms | █  1
  60 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `19.03`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `11.00`
- `entity_count_delta` = `-10.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `33.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `16.55`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.83`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23560 ms  |  Sample ticks: 400

**FPS**  avg `10.07`, min `7.75`, p50 `10.00`, p95 `11.94`, p99 `12.90`, 1%low `7.82`, 0.1%low `n/a`, std `0.96`

**Frame time (ms)**  avg `100.20`, p50 `100.00`, p95 `116.32`, p99 `124.75`, p99.9 `128.56`, max `129.02`

**Client tick (ms)**  avg `0.34`, p95 `0.65`, max `6.36`

**Memory**  start `961 MB`, end `1841 MB`, peak `1842 MB`, GC `31 events / 212 ms`

**FPS over sampling window (ASCII):**

```
 11.2 |                    █                                                          █
 11.0 |       █            █                         █       █                        █
 10.8 |       █    █       █            █        █   ██ █    █                        █
 10.6 |       █ █  █ █     █            █        █   ██ █    █         █    █         █
 10.4 |    █  █ █  █ █     █    █       █ █    █ █   ██ █    █   █     █    █         █
 10.2 | █  █  ███  █ █     ██   █   █  ██ ██   █ █   ██ █    █   ███   █ █  ███ █     █
 10.0 | ██ █  ████ █ ████  ███████████ ██ ████ █ ███ ██ ████ █████████ ███  ████████  █
  9.8 |█████  ████ █ █████ ███████████ ██ ████ █████ ██ ████ █████████ ███  ████████  █
  9.6 |███████████ ███████ ███████████ █████████████ ██ ████ █████████ ██████████████ █
  9.4 |███████████ ███████ █████████████████████████ ███████ ████████████████████████ █
  9.2 |█████████████████████████████████████████████ ██████████████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  73 ms | ██  1
  76 ms | ██  1
  77 ms | ██  1
  78 ms | ███  2
  79 ms | ███  2
  81 ms | ██  1
  82 ms | ██  1
  83 ms | ███  2
  84 ms | ██  1
  85 ms | ███████  4
  87 ms | ███  2
  89 ms | █████████  5
  90 ms | █████████  5
  91 ms | ███████  4
  92 ms | █████  3
  93 ms | ███████  4
  94 ms | █████████  5
  95 ms | ██  1
  96 ms | █████████  5
  97 ms | ██████████████  8
  98 ms | ███████████████████████████████████  20
  99 ms | ██████████████████████████████████████  22
 100 ms | ████████████████████████████████████████  23
 101 ms | ████████████████████████  14
 102 ms | █████████████████  10
 103 ms | █████████  5
 104 ms | █████████  5
 105 ms | ███  2
 106 ms | █████  3
 107 ms | ████████████████  9
 108 ms | ██  1
 109 ms | ███████  4
 110 ms | █████  3
 111 ms | ██  1
 112 ms | ██  1
 113 ms | ███████  4
 114 ms | ███  2
 115 ms | ███  2
 116 ms | ██  1
 117 ms | ██  1
 118 ms | ██  1
 119 ms | ██  1
 120 ms | ██  1
 122 ms | ██  1
 124 ms | █████  3
 126 ms | ██  1
 129 ms | ██  1
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `50.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.82`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `3.00`
- `entity_count_delta` = `-2.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `401.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23149 ms  |  Sample ticks: 400

**FPS**  avg `10.05`, min `7.86`, p50 `10.02`, p95 `11.28`, p99 `12.71`, 1%low `7.89`, 0.1%low `n/a`, std `0.82`

**Frame time (ms)**  avg `100.11`, p50 `99.83`, p95 `114.38`, p99 `122.55`, p99.9 `127.07`, max `127.30`

**Client tick (ms)**  avg `0.31`, p95 `1.06`, max `1.87`

**Memory**  start `1691 MB`, end `1582 MB`, peak `2195 MB`, GC `21 events / 165 ms`

**FPS over sampling window (ASCII):**

```
 11.1 |█                                     ██                        █               
 10.9 |█                              █      ██                        █               
 10.7 |█                              █      ██      █                 █ █             
 10.5 |█     █          █  █       █  █      ██      █     ██    █ █   █ █             
 10.3 |█     █      █   █  █    █ ██  █  █   ██      █     ██    █ █   █ █     █       
 10.2 |█     █      █   █  █ █  █ ██  █  █   ██  █ █ █  █  ██  █ █ █   █ █     ██  █ ██
 10.0 |████  ██████ ███ █  ███  █████ ██ ██  ███ █ ████ █ ████ █ █████ █ ███ █ ██ ██ ██
  9.8 |███████████████████ ███  █████ █████  █████ ██████ ██████ █████ █████████████ ██
  9.6 |███████████████████████ ██████ █████ █████████████ ████████████ █████████████ ██
  9.4 |██████████████████████████████ ████████████████████████████████ █████████████ ██
  9.3 |███████████████████████████████████████████████████████████████ ████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  73 ms | █  1
  76 ms | █  1
  78 ms | █  1
  81 ms | █  1
  83 ms | █  1
  86 ms | ███  2
  87 ms | █  1
  88 ms | ██████  4
  89 ms | ██████████  7
  90 ms | ██████  4
  91 ms | ███████  5
  92 ms | ███████  5
  93 ms | ██████  4
  94 ms | ████████████  8
  95 ms | ████████████  8
  96 ms | ██████  4
  97 ms | ████████████  8
  98 ms | ████████████████  11
  99 ms | ████████████████████████████████████████  27
 100 ms | ████████████████████████████████████  24
 101 ms | ████████████████████████  16
 102 ms | ████████████  8
 103 ms | ███████  5
 104 ms | ████  3
 105 ms | ██████  4
 106 ms | ██████  4
 107 ms | ████  3
 108 ms | ████  3
 109 ms | ██████  4
 110 ms | ████  3
 111 ms | ███  2
 112 ms | ██████  4
 113 ms | ████  3
 114 ms | ███  2
 115 ms | █  1
 116 ms | ███  2
 117 ms | █  1
 118 ms | █  1
 121 ms | █  1
 122 ms | █  1
 126 ms | █  1
 127 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `74.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.89`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-5.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `10.05`, min `7.84`, p50 `10.04`, p95 `11.27`, p99 `12.04`, 1%low `7.86`, 0.1%low `n/a`, std `0.79`

**Frame time (ms)**  avg `100.11`, p50 `99.64`, p95 `115.16`, p99 `126.11`, p99.9 `127.42`, max `127.60`

**Client tick (ms)**  avg `0.35`, p95 `0.54`, max `10.11`

**Memory**  start `2016 MB`, end `2059 MB`, peak `2218 MB`, GC `23 events / 188 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |     █                          █                                               
 10.7 |     █                          █       █               █           █           
 10.6 |     ██    █ █             █    █       █               █           ██       █  
 10.4 |     ██    █ ██            █    █      ██       ██      █    █      ██ █     ██ 
 10.2 |     ██   ██ ██    █ █     ██   █ █    ██       ██   █  █    ███  █ ██ █    ███ 
 10.0 |███  ████ ██ █████ █████ █ ████ █████  ████████ ██████  ████ ███  █ ██ ███  ████
  9.8 |███  ███████ █████ █████ ██████ ██████ ████████ ██████ █████ ██████ ███████ ████
  9.7 |████ ███████ ███████████ ██████ ███████████████ ████████████ ██████ ███████ ████
  9.5 |████ ███████ ███████████ ██████ ███████████████ ███████████████████ ███████ ████
  9.3 |████ ███████ ██████████████████████████████████████████████████████ ████████████
  9.1 |████ ██████████████████████████████████████████████████████████████ ████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  75 ms | ██  1
  78 ms | ██  1
  83 ms | ███  2
  84 ms | ███  2
  85 ms | ███  2
  86 ms | ██  1
  87 ms | ██  1
  88 ms | ██  1
  89 ms | ████████  5
  90 ms | █████  3
  91 ms | ██████  4
  92 ms | ███████████  7
  93 ms | ██████████  6
  94 ms | ██████████  6
  95 ms | ██████████  6
  96 ms | ██████████  6
  97 ms | ███████████  7
  98 ms | ██████████████████████████████████  21
  99 ms | ████████████████████████████████████████  25
 100 ms | ██████████████████████████████████████  24
 101 ms | █████████████████████████████  18
 102 ms | ██████████████  9
 104 ms | ██████  4
 105 ms | ██  1
 106 ms | █████  3
 107 ms | ██████████  6
 108 ms | ██████████  6
 109 ms | █████  3
 110 ms | ███  2
 111 ms | ██  1
 112 ms | █████  3
 113 ms | ███  2
 115 ms | ███  2
 116 ms | ██████  4
 123 ms | ██  1
 124 ms | ██  1
 126 ms | ███  2
 127 ms | ██  1
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.86`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `4.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23170 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `7.89`, p50 `10.01`, p95 `11.14`, p99 `12.48`, 1%low `7.91`, 0.1%low `n/a`, std `0.72`

**Frame time (ms)**  avg `100.27`, p50 `99.92`, p95 `112.12`, p99 `124.53`, p99.9 `126.63`, max `126.75`

**Client tick (ms)**  avg `0.33`, p95 `0.76`, max `1.60`

**Memory**  start `1085 MB`, end `2103 MB`, peak `2181 MB`, GC `24 events / 176 ms`

**FPS over sampling window (ASCII):**

```
 11.5 |      █                                                                         
 11.2 |      █     █                                                                   
 11.0 |      █     █                                    █                              
 10.7 |      █     █                                    █                         █    
 10.5 |      ██    █                                    █     █      █      █     █    
 10.2 |      ██ █  ██     █ ███  █  ██    ███     █     █     █      █  █  ██     ███  
 10.0 |█████ ████  ██████ █ ████ █ ████ █ ████████████  ███ ███████ ███ █  █████  █████
  9.7 |█████ ████  ████████ █████████████ █████████████ ███ ███████████ █ ███████ █████
  9.5 |█████ ██████████████████████████████████████████ ███████████████████████████████
  9.2 |█████ ██████████████████████████████████████████████████████████████████████████
  9.0 |█████ ██████████████████████████████████████████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  76 ms | █  1
  79 ms | █  1
  80 ms | ███  2
  81 ms | █  1
  89 ms | ████████  6
  90 ms | ████  3
  91 ms | ████  3
  92 ms | █████  4
  93 ms | █████████  7
  94 ms | ████████  6
  95 ms | ████████  6
  96 ms | █████████████  10
  97 ms | ████████████  9
  98 ms | ███████████████  12
  99 ms | ████████████████████████████████████████  31
 100 ms | ████████████████████████████████████████  31
 101 ms | ███████████████  12
 102 ms | ████████████  9
 103 ms | ██████  5
 104 ms | █████  4
 105 ms | ████  3
 106 ms | ██████  5
 107 ms | ████████████  9
 109 ms | █████  4
 110 ms | ███  2
 111 ms | ████  3
 112 ms | ████  3
 113 ms | ███  2
 114 ms | █  1
 116 ms | █  1
 123 ms | █  1
 124 ms | █  1
 126 ms | ███  2
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.91`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `20.00`
- `entity_count_delta` = `-8.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `12.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24143 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.63`, p50 `9.99`, p95 `11.01`, p99 `11.46`, 1%low `8.65`, 0.1%low `n/a`, std `0.58`

**Frame time (ms)**  avg `100.21`, p50 `100.06`, p95 `111.97`, p99 `115.16`, p99.9 `115.71`, max `115.81`

**Client tick (ms)**  avg `0.31`, p95 `0.54`, max `3.61`

**Memory**  start `1805 MB`, end `1272 MB`, peak `2214 MB`, GC `25 events / 195 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                          █                                                     
 10.6 |          █      █  █     █      █            █            █            █       
 10.5 |          █      █  █     █      █            █         █  █      █     █       
 10.4 |  █ █     █      █  █     █      █      █     █         █  █      █     ██      
 10.2 | ██ █     █      █  █     █     ██      █     █     █   ██ █     ██     ██    █ 
 10.1 | ██ █ ██  ███  █ █  █    ██  █  ██  █  ██ █   █   █ █   ██ █ █ █ ██     ██ █  █ 
 10.0 | ██ ████  ███ ██ █  ████ █████  █████ ███ █ █ ███ █ ███ ██ ███ █ █████  █████ █ 
  9.8 | ██ █████ ██████ ██ ████ ██████ █████ █████ ███████████ ██ ███ █ █████  █████ █ 
  9.7 | ██ █████ ██████ ███████ ██████████████████████████████ ██████ ████████ ███████ 
  9.6 | ███████████████████████ ██████████████████████████████ ██████ ████████ ████████
  9.4 |███████████████████████████████████████████████████████ ██████ █████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | ██  2
  87 ms | ██  2
  88 ms | █  1
  89 ms | ██  2
  90 ms | █████  4
  91 ms | █  1
  92 ms | ██████████  8
  93 ms | ███████  6
  94 ms | ███████████  9
  95 ms | ███████  6
  96 ms | ████████████  10
  97 ms | ██████  5
  98 ms | ██████████████████████  18
  99 ms | ███████████████████████████  22
 100 ms | ████████████████████████████████████████  33
 101 ms | ██████████████████████  18
 102 ms | ███████████  9
 103 ms | ███████████  9
 104 ms | ██  2
 105 ms | ██  2
 106 ms | ██████  5
 107 ms | ██  2
 108 ms | █  1
 109 ms | ██████████  8
 110 ms | ████  3
 111 ms | █  1
 112 ms | ██  2
 113 ms | ████  3
 114 ms | ██  2
 115 ms | ████  3
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `54.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.65`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1107.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23134 ms  |  Sample ticks: 400

**FPS**  avg `10.05`, min `8.01`, p50 `9.99`, p95 `11.71`, p99 `12.60`, 1%low `8.03`, 0.1%low `n/a`, std `0.85`

**Frame time (ms)**  avg `100.16`, p50 `100.12`, p95 `114.45`, p99 `123.70`, p99.9 `124.73`, max `124.92`

**Client tick (ms)**  avg `0.39`, p95 `0.76`, max `7.00`

**Memory**  start `1330 MB`, end `2096 MB`, peak `2342 MB`, GC `21 events / 168 ms`

**FPS over sampling window (ASCII):**

```
 11.6 |                             █                                                  
 11.4 |                             █                   █                              
 11.1 |                             █      █            █                   █          
 10.9 |                             █      █          █ █                   █          
 10.6 |            █ █       █      █      █          █ █      █            █      ██  
 10.4 |  █    █    █ █       █      █      █      █   █ █      ██     █     █      ██  
 10.2 | ██  █ ███  █ █ █  █  ██    ██      █  ███ █   █ ███ █  ██ █   ████  █  ██  ████
  9.9 | █████ ████ █ ██████ ██████ ████  ████████████ █ ██████ ████ ███████ ██████ ████
  9.7 |███████████ ████████ ██████ ██████████████████ █ ██████ ████ ███████ ██████ ████
  9.4 |███████████████████████████ ████████████████████ ██████ ████████████ ██████ ████
  9.2 |███████████████████████████ ████████████████████ ███████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  74 ms | █  1
  79 ms | ███  2
  81 ms | █  1
  82 ms | █  1
  83 ms | ███  2
  84 ms | ████  3
  85 ms | ███  2
  86 ms | █  1
  87 ms | █  1
  88 ms | ███  2
  89 ms | ███  2
  90 ms | ████  3
  91 ms | █████  4
  92 ms | ███████  5
  93 ms | ████████████  9
  94 ms | ████████████  9
  95 ms | ████  3
  96 ms | ███████  5
  97 ms | ████████  6
  98 ms | ███████████████████████  17
  99 ms | ███████████████████████  17
 100 ms | ████████████████████████████████████████  30
 101 ms | ███████████████████████  17
 102 ms | ████████████  9
 103 ms | ███████  5
 104 ms | █  1
 105 ms | ███  2
 106 ms | █████  4
 107 ms | ████  3
 108 ms | ███████  5
 109 ms | ████  3
 110 ms | ███████  5
 111 ms | █████  4
 112 ms | ████  3
 113 ms | █  1
 114 ms | ████  3
 115 ms | █  1
 118 ms | █  1
 119 ms | █  1
 120 ms | ███  2
 123 ms | ███  2
 124 ms | ███  2
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.03`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `20.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `25.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24637 ms  |  Sample ticks: 400

**FPS**  avg `10.05`, min `7.40`, p50 `9.98`, p95 `11.50`, p99 `12.27`, 1%low `7.43`, 0.1%low `n/a`, std `0.86`

**Frame time (ms)**  avg `100.23`, p50 `100.19`, p95 `112.03`, p99 `130.70`, p99.9 `134.89`, max `135.10`

**Client tick (ms)**  avg `0.35`, p95 `0.66`, max `10.34`

**Memory**  start `2005 MB`, end `1823 MB`, peak `2117 MB`, GC `26 events / 208 ms`

**FPS over sampling window (ASCII):**

```
 11.9 |                                                                  █             
 11.6 |                                                                  █             
 11.3 |                                                  █               █             
 11.0 |                                      █           █  █            █             
 10.7 |      █          █           █        █  █        █  █            █ █           
 10.4 |    █ █     ██ █ █ █       █ █        ██ █ █      █  █  █       █ █ █           
 10.1 |   ██ ██ ██ ██ █ █ █ █ █  ██ █   █  █ ██ █ █  █ █ ██ █ ██ ██    █ █ ██  █  █    
  9.9 |██ ██ █████ ██ █ █ ██████ ██ ████████ ██ ███████████ █ ██████████ █ █████████ ██
  9.6 |███████████ ████████████████ ████████ ██████████████ ████████████ ██████████████
  9.3 |█████████████████████████████████████ ███████████████████████████ ██████████████
  9.0 |█████████████████████████████████████ ███████████████████████████ ██████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  66 ms | █  1
  73 ms | █  1
  81 ms | █  1
  84 ms | █  1
  85 ms | ███  3
  86 ms | █████  4
  87 ms | ██  2
  88 ms | ███  3
  89 ms | ███████  6
  90 ms | ██  2
  91 ms | ██████  5
  92 ms | ███  3
  93 ms | ██████  5
  94 ms | █  1
  95 ms | ██  2
  96 ms | █████  4
  97 ms | ██████  5
  98 ms | █████████████  11
  99 ms | ████████████████████████████████████████  35
 100 ms | ██████████████████████████████████████  33
 101 ms | █████████████████████  18
 102 ms | ██████  5
 103 ms | ███  3
 104 ms | █████████  8
 105 ms | ███  3
 107 ms | █████  4
 108 ms | ███████  6
 109 ms | ████████  7
 110 ms | ██████  5
 111 ms | ██  2
 112 ms | █████  4
 113 ms | ██  2
 127 ms | █  1
 130 ms | █  1
 134 ms | █  1
 135 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.43`
- `surface_water_ratio` = `0.14`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `43.00`
- `entity_count_delta` = `-42.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1600.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23160 ms  |  Sample ticks: 400

**FPS**  avg `10.04`, min `7.34`, p50 `9.99`, p95 `11.41`, p99 `12.32`, 1%low `7.72`, 0.1%low `n/a`, std `0.81`

**Frame time (ms)**  avg `100.23`, p50 `100.12`, p95 `111.41`, p99 `121.65`, p99.9 `133.57`, max `136.23`

**Client tick (ms)**  avg `0.39`, p95 `0.77`, max `4.89`

**Memory**  start `1935 MB`, end `1329 MB`, peak `2280 MB`, GC `21 events / 178 ms`

**FPS over sampling window (ASCII):**

```
 11.4 |                                                    █                           
 11.3 |                                                    █                           
 11.1 |                                                    █                           
 10.9 |     █                                              █  █                        
 10.7 |     █   █        █  █                              █  █                        
 10.5 |     ██  █      █ █  █           █      █ █        ██  █          █            █
 10.3 |     ██  █   █  █ █  █           █      █ █     █  ██  █          █ █   █      █
 10.1 |     ██  █   █  █ ██ █ █   █ █   █      █ ██  ███  ██  ███ █ ██   █ █   █  █   █
  9.9 |███  ███ ██ ███ █ ██ ███████ ███ ██████ █ ████████ ██  █████████  █ ██████ █████
  9.8 |███ ████ ██ █████ ██ ███████████ ████████ ████████ ██  ██████████ █ ██████ █████
  9.6 |███ ████████████████ █████████████████████████████████████████████████████ █████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  64 ms | █  1
  79 ms | █  1
  81 ms | ███  2
  82 ms | █  1
  83 ms | ███  2
  84 ms | ███  2
  87 ms | ███  2
  88 ms | ███  2
  89 ms | ███  2
  90 ms | ████  3
  91 ms | █  1
  92 ms | ███  2
  93 ms | █  1
  94 ms | █████  4
  95 ms | ████████████  9
  96 ms | ████████  6
  97 ms | █████████  7
  98 ms | █████████████████████████  19
  99 ms | ████████████████████████████████████████  31
 100 ms | ██████████████████████████████████  26
 101 ms | ██████████████████████████  20
 102 ms | ██████████  8
 103 ms | █████████  7
 104 ms | ████████  6
 105 ms | ██████  5
 106 ms | ████████  6
 108 ms | ████████  6
 109 ms | █  1
 110 ms | ██████  5
 111 ms | ████  3
 112 ms | █  1
 113 ms | ████  3
 114 ms | █  1
 115 ms | █  1
 121 ms | █  1
 122 ms | █  1
 136 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `64.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.72`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `34.00`
- `entity_count_delta` = `-24.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `10.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23444 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.53`, p50 `10.00`, p95 `11.38`, p99 `11.78`, 1%low `8.53`, 0.1%low `n/a`, std `0.71`

**Frame time (ms)**  avg `100.17`, p50 `99.99`, p95 `112.78`, p99 `115.71`, p99.9 `117.21`, max `117.23`

**Client tick (ms)**  avg `0.30`, p95 `0.62`, max `2.13`

**Memory**  start `1754 MB`, end `1836 MB`, peak `2297 MB`, GC `22 events / 179 ms`

**FPS over sampling window (ASCII):**

```
 11.3 |                                         █                                      
 11.1 |                                         █                                      
 10.9 |                             █           █          █                           
 10.7 |             █     █       █ █           █   █      █   █  █                    
 10.5 |             █     █       █ █      █  █ █ █ █  ██  █   █ ██        █   █       
 10.3 |         █ █ █    ██    █  █ █      █  █ █ █ █  ██  █ █ █ ██      █ █   █       
 10.1 |████ █████ █ ████ ██ ██ █ ██ ██ █ █ █  █ █ █ ██ ███ █ █ █ ███ ██  █ █ ████  █ █ 
  9.9 |██████████ █ ████ ███████ ██ ████ █ ████ █ █ ██ ███ ███ █ ███████ █ █ ██████████
  9.7 |█████████████████ ███████ ██ ███████████ ███ ██ ███ ███ █ ███████ ██████████████
  9.5 |████████████████████████████ ███████████ ██████████ █████ ██████████████████████
  9.3 |█████████████████████████████████████████████████████████ ██████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  81 ms | █  1
  84 ms | ████  3
  85 ms | ██  2
  86 ms | ██  2
  87 ms | ███████  6
  88 ms | ████  3
  89 ms | ██  2
  90 ms | ████  3
  91 ms | █████  4
  92 ms | ██████  5
  93 ms | ███████  6
  95 ms | █████  4
  96 ms | █████  4
  97 ms | ███████  6
  98 ms | ███████████████████  16
  99 ms | ████████████████████████████████████████  34
 100 ms | █████████████████████████████████  28
 101 ms | ████████████████████  17
 102 ms | █████████████  11
 103 ms | █  1
 104 ms | ████  3
 105 ms | ████  3
 106 ms | █████  4
 107 ms | ████  3
 108 ms | █  1
 109 ms | ████  3
 110 ms | █████  4
 111 ms | ████  3
 112 ms | ███████████  9
 113 ms | █████  4
 114 ms | █  1
 115 ms | ██  2
 117 ms | ██  2
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.53`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `303.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23140 ms  |  Sample ticks: 400

**FPS**  avg `10.06`, min `7.93`, p50 `10.00`, p95 `11.62`, p99 `13.12`, 1%low `7.95`, 0.1%low `n/a`, std `0.92`

**Frame time (ms)**  avg `100.18`, p50 `99.96`, p95 `114.77`, p99 `125.06`, p99.9 `126.02`, max `126.15`

**Client tick (ms)**  avg `0.37`, p95 `0.63`, max `12.18`

**Memory**  start `1171 MB`, end `1241 MB`, peak `2182 MB`, GC `24 events / 192 ms`

**FPS over sampling window (ASCII):**

```
 11.9 |                 █                                                              
 11.6 |          █      █                                                              
 11.3 |     █    █      █                            █                                 
 11.0 |     █    █      █                         █  █                                 
 10.7 |     █    █  █   █                         █  █   █               █   █         
 10.4 |     █    ██ █   █  █        █       █     █  █  ██ █     █       ██  █  █ █    
 10.1 |██ █ ██   ██ ██  █  ████  ██ █ ████  █ ██ ██  █  ██ ██  █ ██ ██ █ ███ █  █████  
  9.8 |████ ████ ██ ██  ██ ████████ █ ██████████ ██  █ █████████ ███████ ███ █  ███████
  9.5 |████ ████ ███████████████████████████████ ███████████████████████████ ██████████
  9.2 |████ ████ ██████████████████████████████████████████████████████████████████████
  8.9 |█████████ ██████████████████████████████████████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  71 ms | ██  1
  75 ms | ██  1
  76 ms | ██  1
  78 ms | ██  1
  80 ms | ██  1
  81 ms | ██  1
  83 ms | █████  3
  85 ms | ██  1
  86 ms | ███  2
  87 ms | █████  3
  88 ms | █████  3
  89 ms | ███  2
  90 ms | ████████████  7
  91 ms | ███████  4
  92 ms | ███████  4
  93 ms | █████  3
  94 ms | ████████████  7
  95 ms | ███████  4
  96 ms | ██████████  6
  97 ms | ████████  5
  98 ms | ████████████████████████████  17
  99 ms | ████████████████████████████████████████  24
 100 ms | █████████████████████████████████████  22
 101 ms | ██████████████████████████████  18
 102 ms | ███████████████  9
 103 ms | ██████████  6
 104 ms | ████████  5
 105 ms | ███  2
 106 ms | █████  3
 107 ms | ███  2
 108 ms | ███████  4
 109 ms | ███  2
 110 ms | █████  3
 111 ms | █████  3
 112 ms | ███████  4
 113 ms | ███████  4
 114 ms | ███  2
 117 ms | ██  1
 121 ms | ██  1
 122 ms | ███████  4
 123 ms | ██  1
 125 ms | ███  2
 126 ms | ██  1
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `64.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.95`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `33.00`
- `entity_count_delta` = `-28.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `5.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23144 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.62`, p50 `10.00`, p95 `11.16`, p99 `11.68`, 1%low `8.66`, 0.1%low `n/a`, std `0.60`

**Frame time (ms)**  avg `100.21`, p50 `100.00`, p95 `110.72`, p99 `113.90`, p99.9 `115.79`, max `116.04`

**Client tick (ms)**  avg `0.30`, p95 `0.55`, max `3.12`

**Memory**  start `2250 MB`, end `1920 MB`, peak `2325 MB`, GC `23 events / 192 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                         █                                               █      
 10.7 | █               █       █                      █                        █      
 10.6 | █               █       █              █       █   █              █     █   █  
 10.4 | █         █     █       █    █         █     █ █   █         █    █     █   █  
 10.3 | █ █ █     █ █ █ █       █    █         █     █ █   █ █       █   ██     █ █ █  
 10.1 | █ █ █ █   █ █ █ █    █  ██  ██  █     ██     █ █   █ █ █    ██   ██     █ █ █  
 10.0 | █ █ █ ██  █ █ █ ████ ██ ██  ███ ███  ██████  █ ██  █ █████  ██   ██ ██ ██ █ ███
  9.8 | █ █ ████ ██ █ █ ███████ ███ ████████ ██████ ██ ███ █ █████ ███████████ ██ █ ███
  9.7 |█████████ ████ █████████ ███████████████████ ██ ███ █ █████████████████ ████ ███
  9.6 |█████████ ██████████████ ██████████████████████ ███████████████████████ ████████
  9.4 |█████████ ██████████████ ██████████████████████ ████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  77 ms | ██  1
  84 ms | ██  1
  85 ms | ██  1
  86 ms | ███  2
  88 ms | █████  3
  89 ms | ██████  4
  90 ms | ██  1
  91 ms | ██  1
  92 ms | ████████  5
  93 ms | █████████  6
  94 ms | ██████  4
  95 ms | ███████████  7
  96 ms | ██████████████  9
  97 ms | ███████████████████████  15
  98 ms | ██████████████████████  14
  99 ms | ████████████████████████████████████████  26
 100 ms | ██████████████████████████████████  22
 101 ms | █████████████████████████████  19
 102 ms | ███████████  7
 103 ms | █████████████████  11
 104 ms | █████  3
 105 ms | ███████████  7
 106 ms | █████████  6
 107 ms | █████  3
 108 ms | ████████  5
 109 ms | ███  2
 110 ms | ████████████  8
 111 ms | █████  3
 113 ms | ███  2
 114 ms | ██  1
 116 ms | ██  1
```

**Extras:**

- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.66`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `40.00`
- `entity_count_delta` = `-38.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.74`, p50 `9.99`, p95 `10.88`, p99 `11.16`, 1%low `8.77`, 0.1%low `n/a`, std `0.52`

**Frame time (ms)**  avg `100.11`, p50 `100.08`, p95 `110.94`, p99 `113.34`, p99.9 `114.26`, max `114.45`

**Client tick (ms)**  avg `0.26`, p95 `0.33`, max `1.87`

**Memory**  start `2009 MB`, end `2089 MB`, peak `2089 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                 █                                              
 10.5 |                        █        █       █              █           █           
 10.4 |                        █        █       █              █   █       █           
 10.3 |             █     █    █ █      █       █     █        █   █       █        █  
 10.2 |            ██     █    █ ██     █       █     ██     █ █   ██ █    █        █  
 10.1 |   ███      ██     █  █ █ ██     █     ███     ██     █ █   ██ ██  ██ █  █  ███ 
 10.0 |██ ██████ ███████ █████ █ ████  ██████ ██████  ██████ █ ███ ██████ ███████ █████
  9.9 |██ ██████ ███████ █████ █ ████  ██████ ██████ █████████ ███ ██████ ███████ █████
  9.8 |█████████ █████████████ █ █████ ██████ ██████ █████████████ ██████ ███████ █████
  9.6 |███████████████████████ █ ████████████ ████████████████████ ██████ █████████████
  9.5 |██████████████████████████████████████ ████████████████████ ████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  89 ms | ██  3
  90 ms | ██  3
  91 ms | ███  4
  92 ms | ████  6
  93 ms | ███████  10
  94 ms | ████  6
  95 ms | █████  7
  96 ms | ███  5
  97 ms | ██  3
  98 ms | ████████████  18
  99 ms | ███████████████  22
 100 ms | ████████████████████████████████████████  60
 101 ms | █████████  14
 102 ms | █  1
 103 ms | ███  4
 104 ms | ██  3
 105 ms | ███  4
 107 ms | ███  4
 108 ms | █  1
 109 ms | ███  5
 110 ms | ████  6
 111 ms | ██  3
 112 ms | ██  3
 113 ms | ██  3
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `1.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `8.77`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23130 ms  |  Sample ticks: 400

**FPS**  avg `10.04`, min `7.98`, p50 `10.01`, p95 `11.33`, p99 `11.55`, 1%low `8.07`, 0.1%low `n/a`, std `0.67`

**Frame time (ms)**  avg `100.08`, p50 `99.87`, p95 `111.50`, p99 `122.44`, p99.9 `124.81`, max `125.38`

**Client tick (ms)**  avg `2.58`, p95 `2.98`, max `11.77`

**Memory**  start `1088 MB`, end `993 MB`, peak `2300 MB`, GC `1 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                                       █                                        
 10.7 |         █                             █    █ █                      █          
 10.5 |  █      ██    ███      █              █    █ █       █        █     ██      █  
 10.3 |  █      ██    ███     ██   ██ █    █  █    █ ██    █ █      █ █     ██    █ █  
 10.1 |█ ██ █   ██ ██ ████  ██████ █████ █ ██ ███  █ ███ █ █ █  █ █ ███ █ █ ███   █ ██ 
  9.9 |██████ █ █████ █████ ██████ ███████ ███████ █ █████ ██████ █ █████ █ ████ ██ ███
  9.7 |██████ █ █████ █████ ██████ ███████ ███████ █ ██████████████████████ ████ ██ ███
  9.5 |██████████████ ████████████ ███████ ███████ █ ██████████████████████████████████
  9.3 |██████████████ ████████████ ███████ ████████████████████████████████████████████
  9.0 |██████████████ █████████████████████████████████████████████████████████████████
  8.8 |██████████████ █████████████████████████████████████████████████████████████████
  8.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms | █  1
  86 ms | █████  4
  87 ms | ██  2
  88 ms | ██████  5
  89 ms | █████  4
  90 ms | ███████  6
  91 ms | ████  3
  92 ms | ██████  5
  93 ms | ██  2
  94 ms | █████  4
  95 ms | ████  3
  96 ms | ████████  7
  97 ms | █████████████  11
  98 ms | ████████████████████  17
  99 ms | ██████████████████████████████████████  32
 100 ms | ████████████████████████████████████████  34
 101 ms | ███████  6
 102 ms | █████████  8
 103 ms | ███████  6
 104 ms | █████  4
 105 ms | ██████  5
 106 ms | █  1
 107 ms | █████  4
 108 ms | █████  4
 109 ms | █████  4
 110 ms | ██████  5
 111 ms | █████  4
 112 ms | █████  4
 114 ms | █  1
 119 ms | █  1
 122 ms | ██  2
 125 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particle_types` = `16.00`
- `preload_duration_ms` = `0.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `8.07`
- `entity_count_sample_start` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.10`, p50 `9.99`, p95 `10.86`, p99 `11.36`, 1%low `8.49`, 0.1%low `n/a`, std `0.54`

**Frame time (ms)**  avg `100.11`, p50 `100.08`, p95 `110.21`, p99 `111.66`, p99.9 `121.19`, max `123.43`

**Client tick (ms)**  avg `0.27`, p95 `0.39`, max `1.72`

**Memory**  start `1070 MB`, end `1278 MB`, peak `1278 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                            █      █                            
 10.5 |                   █                        █      █                    █       
 10.4 |       █  █        █                        █   █  █            █       █       
 10.3 |    █  █  █        █       █                █   █  █            █       █       
 10.2 |    █  ██ █        █       █ █   █ ██       █   █  █      ██    █       █  █    
 10.1 | ████  ██ █     █  █    █ ██ █   █ ███      █   █  █ █    ███   █ █     █  █    
 10.0 | █████ ██ ███████  ██ █ █ ██ ███ █ ████████ ███ █ ███████ █████ ███████ ██ ███ █
  9.9 | █████ ██ ███████ █████ ████ ███ ██████████ █████ ███████ █████ ███████ ██████ █
  9.8 | █████ ██ ███████ █████ ████████ ██████████ █████ ███████ █████ ███████ ██████ █
  9.7 |██████ █████████████████████████ ██████████ ███████████████████ ███████ ████████
  9.6 |██████ ████████████████████████████████████ ███████████████████████████ ████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  78 ms | █  1
  86 ms | █  1
  88 ms | ██  2
  91 ms | ████  5
  92 ms | ████████  9
  93 ms | ███████  8
  94 ms | █████  6
  95 ms | ██████  7
  96 ms | ███████  8
  97 ms | ████  5
  98 ms | █████████  10
  99 ms | ██████████████████████████  30
 100 ms | ████████████████████████████████████████  47
 101 ms | ██████████████  17
 102 ms | ████  5
 103 ms | ███  4
 104 ms | ███  4
 105 ms | ███  3
 106 ms | ████  5
 107 ms | █  1
 108 ms | ████  5
 109 ms | █████  6
 110 ms | ███  4
 111 ms | ████  5
 112 ms | █  1
 123 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `8.49`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23129 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.65`, p50 `9.99`, p95 `11.00`, p99 `11.26`, 1%low `8.71`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `100.08`, p50 `100.10`, p95 `111.72`, p99 `112.80`, p99.9 `115.24`, max `115.56`

**Client tick (ms)**  avg `0.28`, p95 `0.38`, max `2.18`

**Memory**  start `1369 MB`, end `1513 MB`, peak `1513 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |       █                                                                        
 10.6 | █     █                       █               █                  █      █      
 10.5 | █     █  █                    █               █                  █ █    █      
 10.4 | █     █  █       █            █               █      █       █   █ █    █      
 10.3 | █     █  █    █  █      █     █       █       █      █       █   █ █    █ █    
 10.1 | █     █  █   ██  █      █     ██   █ ██     █ █   ██ █       █   █ ██   █ █    
 10.0 | ████  █  ███ ██ ██ ████ ████  ████ ████ ███ █ ███ ████████ █ ███ █ ██ █ █ █████
  9.9 | █████ █ ████ ██████████ ████ █████ ████████ █ ███ ██████████ ███ █ ████ █ █████
  9.8 | █████ █ ████ ███████████████ █████ ████████ █████ ██████████ ███ █ ████ ███████
  9.6 |██████ ████████████████████████████ ██████████████ ██████████████ █ ████ ███████
  9.5 |██████ ███████████████████████████████████████████ ██████████████ ██████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  88 ms | ██  2
  89 ms | ███  4
  90 ms | ███  4
  91 ms | ███  3
  92 ms | █████  6
  93 ms | ████  5
  94 ms | ██████  7
  95 ms | ██████  7
  96 ms | █████████  11
  97 ms | ███  4
  98 ms | █████████████  16
  99 ms | ██████████████████  21
 100 ms | ████████████████████████████████████████  48
 101 ms | █████████████  16
 102 ms | ███  4
 103 ms | ████  5
 104 ms | ████  5
 105 ms | ███████  8
 106 ms | ██  2
 107 ms | ██  2
 108 ms | █  1
 109 ms | █  1
 110 ms | ████  5
 111 ms | ███  3
 112 ms | ██████  7
 113 ms | █  1
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `8.71`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.83`, p50 `9.99`, p95 `10.90`, p99 `11.21`, 1%low `8.84`, 0.1%low `n/a`, std `0.49`

**Frame time (ms)**  avg `100.05`, p50 `100.06`, p95 `110.22`, p99 `112.88`, p99.9 `113.15`, max `113.20`

**Client tick (ms)**  avg `0.27`, p95 `0.34`, max `1.84`

**Memory**  start `1841 MB`, end `1993 MB`, peak `1993 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |  █                                                                             
 10.5 |  █                     █       █                    █ █                    █   
 10.4 |  █                     █       █             █ █    █ █                  █ █   
 10.3 |  █                     █     █ █      █      █ █    █ █      █   █       █ █   
 10.2 |█ █     █    █   █      █     █ █      ██     █ █   ██ █     ██   ██      █ █   
 10.1 |█ █   █ █    ██ ██      ██    █ █  █  ███    ██ █   ██ █     ██   ███     █ █   
 10.0 |█ ███ █ ████ ██ ██████  █████ █ ████  █████ ███ ███ ██ ████  ████ ███████ █ ███ 
  9.9 |████████████ ██ ██████  █████ █ ████  █████ ███ ███ ██ ████ █████ ███████ █ ███ 
  9.8 |████████████ ██ █████████████ █ ████ ██████ ███ ███ ██ ████ █████ ███████ █ ███ 
  9.7 |█████████████████████████████ ██████ ██████ ███ ███ ██ ██████████ █████████ ███ 
  9.6 |███████████████████████████████████████████████████ █████████████ █████████ ███ 
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  2
  89 ms | █  2
  90 ms | █  1
  91 ms | ██████  8
  92 ms | ███  4
  93 ms | █████  7
  94 ms | ██  3
  95 ms | ██████  8
  96 ms | ██████  8
  97 ms | █████  7
  98 ms | ██████████  14
  99 ms | █████████████████  25
 100 ms | ████████████████████████████████████████  58
 101 ms | ████████  11
 102 ms | █████  7
 103 ms | ██  3
 104 ms | ████  6
 105 ms | ███  4
 106 ms | █  1
 107 ms | ██  3
 108 ms | ███  4
 109 ms | ██  3
 110 ms | ██  3
 111 ms | █  2
 112 ms | ███  5
 113 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_0p1pct_low` = `n/a`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `10.00`
- `restocks` = `20.00`
- `fps_1pct_low` = `8.84`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.76`, p50 `9.99`, p95 `10.82`, p99 `11.22`, 1%low `8.77`, 0.1%low `n/a`, std `0.49`

**Frame time (ms)**  avg `100.14`, p50 `100.06`, p95 `109.92`, p99 `111.84`, p99.9 `114.12`, max `114.15`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `1.72`

**Memory**  start `802 MB`, end `958 MB`, peak `958 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |         █     █                                             █                  
 10.5 |         █     █  █                                          █                  
 10.4 |         █     █  █   █        █        █    █ █             █                  
 10.3 |         █     █  █   █ █      █       ██    █ █   █  ██     █                  
 10.2 |         █     █  █   █ ██     █       ██    █ █   █  ██     █                  
 10.1 | █  █    █     █  ██  █ ███    █       ██    █ ██  █  ██     █    █  █   █ ███  
 10.0 |███ ███  ████  █ ████ █ ████  ███████  █████ █ ███ ██ ████   ███████ █████ █████
  9.9 |███████ ██████ █ ████ █ █████ ████████ █████ █ ███ ██ ██████ █████████████ █████
  9.8 |███████ ██████ █ ████ █ █████ ████████ █████ █ ███ ██ ██████████████████████████
  9.7 |██████████████ ██████ █ █████ ████████ █████ █ ███ ██ ██████████████████████████
  9.6 |██████████████ ███████████████████████████████████ █████████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  2
  89 ms | █  1
  91 ms | ███  5
  92 ms | ██████  9
  93 ms | █████  7
  94 ms | ███  4
  95 ms | ████  6
  96 ms | ███████  10
  97 ms | ███████  10
  98 ms | ███████████  16
  99 ms | ██████████████  20
 100 ms | ████████████████████████████████████████  59
 101 ms | ███████  11
 102 ms | █  1
 103 ms | ████  6
 104 ms | ██  3
 105 ms | █  1
 106 ms | █  2
 107 ms | ███  4
 108 ms | ███  5
 109 ms | █████  8
 110 ms | █  2
 111 ms | ████  6
 114 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `8.77`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `n/a`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195250 ms  |  Sample ticks: 3600

**FPS**  avg `10.04`, min `7.67`, p50 `10.02`, p95 `11.20`, p99 `12.11`, 1%low `7.86`, 0.1%low `7.68`, std `0.72`

**Frame time (ms)**  avg `100.11`, p50 `99.83`, p95 `113.20`, p99 `124.65`, p99.9 `129.74`, max `130.44`

**Client tick (ms)**  avg `0.67`, p95 `1.17`, max `8.71`

**Memory**  start `1479 MB`, end `724 MB`, peak `1851 MB`, GC `15 events / 84 ms`

**FPS over sampling window (ASCII):**

```
 10.2 | █                                                                              
 10.2 | █                                                                              
 10.2 | █        █       █     █          █                      █                     
 10.1 | █        █  █    █     █          █   █   █              █          █          
 10.1 | █ █ █    █  █    █ █   █    █  █  █   █ █ █ █   █      █ █ █  █     █          
 10.1 | █ █ █ █  ██ ███  █ █   ██ █ █  █  █   █ █ █ ██  █   █  █ █ ██ █  █  █ █ ██   █ 
 10.0 | ███ █ ██ ██ ███  █ █ █ █████████  █ █ █ ███ ██ ████ ██ █ █ ██ █  ██ ███ ██████ 
 10.0 | ████████ ██ ████ █ ███ ██████████ ███ █ ███ ██ █████████ ████ ██ █████████████ 
 10.0 | ████████ ████████████████████████████ █████ ████████████ ██████████████████████
  9.9 | ███████████████████████████████████████████████████████████████████████████████
  9.9 | ███████████████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  70 ms |   1
  75 ms |   2
  77 ms |   1
  78 ms |   1
  79 ms |   2
  80 ms | █  5
  81 ms | █  6
  82 ms |   2
  83 ms | █  7
  84 ms | █  5
  85 ms | █  12
  86 ms | █  8
  87 ms | █  8
  88 ms | ██  20
  89 ms | ████  32
  90 ms | ████  36
  91 ms | ████  34
  92 ms | ███████  56
  93 ms | ███████  56
  94 ms | ██████  52
  95 ms | ██████  54
  96 ms | █████████  74
  97 ms | ██████████  83
  98 ms | ██████████████  115
  99 ms | ███████████████████████████████████  292
 100 ms | ████████████████████████████████████████  334
 101 ms | ████████████  101
 102 ms | ████  37
 103 ms | ███  26
 104 ms | ███  26
 105 ms | ██  16
 106 ms | ██  16
 107 ms | ████  32
 108 ms | ███  24
 109 ms | ████  34
 110 ms | ████  35
 111 ms | ████  32
 112 ms | ███  27
 113 ms | ██  15
 114 ms | █  11
 115 ms | █  8
 116 ms | █  7
 117 ms | █  5
 118 ms | █  5
 119 ms |   2
 120 ms |   4
 121 ms | █  5
 122 ms | █  5
 123 ms | █  7
 124 ms |   4
 125 ms |   4
 126 ms |   4
 127 ms |   2
 128 ms |   1
 129 ms |   4
 130 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.68`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `67.00`
- `trees_built` = `173.00`
- `phase` = `0.00`
- `segment_count` = `19.00`
- `part` = `2.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `21.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `7.86`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194672 ms  |  Sample ticks: 3600

**FPS**  avg `10.04`, min `7.67`, p50 `10.02`, p95 `11.12`, p99 `11.87`, 1%low `8.00`, 0.1%low `7.75`, std `0.68`

**Frame time (ms)**  avg `100.10`, p50 `99.82`, p95 `113.35`, p99 `122.69`, p99.9 `127.14`, max `130.37`

**Client tick (ms)**  avg `0.62`, p95 `1.03`, max `2.38`

**Memory**  start `1433 MB`, end `786 MB`, peak `1815 MB`, GC `14 events / 65 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                █ █  █                                          
 10.1 |       █ █                      █ █  █               █    █                     
 10.1 |    █  █ █           █       █  █ █  █     █         █    █              █      
 10.1 |    █  █ █  █ █      █       █  █ █  █   █ █    █ █  █    █           ██ █  █   
 10.1 |   ██  █ █  █ █ █    █  █    █  █ █  █   █ █    █ █  █    █  █   █ █  ██ █  █ █ 
 10.0 |█  ███ █ █  █ █ ███  █  █    █  █ █  ██ ██ ██   █ ██ ██   ██ █  ██ █ █████  ███ 
 10.0 |█ ████ █ ██ █ █ ████ ████ ████  █ █  ██ ██ ██   ████ ██   ████████ █ ██████ ███ 
 10.0 |██████ █ ████ █ ████ ████ █████ █ ██ ██ ██ ████ ████ ██ ████████████ ██████ ████
 10.0 |████████ ████ █ ████ ████████████ ██ ██ ██ █████████ ██ ████████████████████████
 10.0 |████████ ████████████████████████ ████████ █████████ ██ ████████████████████████
 10.0 |██████████████████████████████████████████ █████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  76 ms |   1
  77 ms |   3
  78 ms |   1
  79 ms |   2
  80 ms |   3
  81 ms |   1
  82 ms |   2
  83 ms |   3
  84 ms | █  9
  85 ms | █  8
  86 ms | █  8
  87 ms | █  12
  88 ms | ███  22
  89 ms | ██  17
  90 ms | ██  17
  91 ms | ██████  50
  92 ms | ██████  49
  93 ms | ██████  51
  94 ms | ███████  61
  95 ms | ████████  68
  96 ms | █████████  78
  97 ms | ██████████  86
  98 ms | █████████████  112
  99 ms | ██████████████████████████████████████  318
 100 ms | ████████████████████████████████████████  333
 101 ms | ██████████████  113
 102 ms | █████  45
 103 ms | ███  24
 104 ms | ██  18
 105 ms | ██  13
 106 ms | █  12
 107 ms | ██  16
 108 ms | ██  20
 109 ms | ███  25
 110 ms | ███  26
 111 ms | ████  33
 112 ms | ████  36
 113 ms | ███  25
 114 ms | ██  17
 115 ms | █  10
 116 ms | █  5
 117 ms | █  5
 118 ms | █  6
 119 ms |   3
 120 ms | █  5
 121 ms |   4
 122 ms | █  7
 123 ms |   4
 124 ms |   2
 125 ms |   4
 126 ms |   3
 127 ms |   1
 130 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.75`
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
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `16.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `86.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `8.00`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194268 ms  |  Sample ticks: 3600

**FPS**  avg `10.04`, min `7.13`, p50 `10.01`, p95 `11.14`, p99 `11.99`, 1%low `7.73`, 0.1%low `7.14`, std `0.71`

**Frame time (ms)**  avg `100.10`, p50 `99.88`, p95 `113.43`, p99 `125.42`, p99.9 `137.18`, max `140.27`

**Client tick (ms)**  avg `0.63`, p95 `1.03`, max `7.45`

**Memory**  start `1308 MB`, end `787 MB`, peak `1788 MB`, GC `12 events / 64 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                                █                               
 10.2 |                                                █                               
 10.2 |                                                █                               
 10.2 |                                                █      █                        
 10.1 |  █               █                   █         █      █   █         █   █ █   █
 10.1 |  █ █             █  █   █            █    █    █      █  ██         █  ██ █   █
 10.1 |  █ █ ██     █    █  ███ █ █  ██      █    █    █ █  █ ██ ██    █    █  ██ ██  █
 10.0 |█ █ ████ ██ ██ █  ██ ███ ███ ████  ██ ███  █ █ █████ ████ ██  █████ ███ ██ ███ █
 10.0 |█ █ ███████ ██ ██ ██ ███ ███ █████ ██ ████ █████████ ████ █████████████ ██ ███ █
 10.0 |█ █ ████████████████ ████████████████ ████ █████████ ████ █████████████ ██ ███ █
  9.9 |████████████████████ ████████████████ ██████████████ ████ ████████████████ █████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  61 ms |   1
  73 ms |   1
  74 ms |   1
  75 ms |   2
  77 ms |   1
  78 ms |   1
  79 ms |   1
  81 ms |   3
  82 ms | █  5
  83 ms | █  6
  84 ms | █  6
  85 ms | █  9
  86 ms | █  8
  87 ms | ██  15
  88 ms | █  12
  89 ms | ███  23
  90 ms | ███  30
  91 ms | ████  33
  92 ms | █████  46
  93 ms | ███████  63
  94 ms | ████████  65
  95 ms | ███████  62
  96 ms | █████████  81
  97 ms | █████████  78
  98 ms | ████████████  105
  99 ms | ███████████████████████████████████  305
 100 ms | ████████████████████████████████████████  346
 101 ms | █████████████  114
 102 ms | █████  44
 103 ms | ██  21
 104 ms | ███  25
 105 ms | ██  20
 106 ms | ██  13
 107 ms | ███  25
 108 ms | ██  20
 109 ms | ███  22
 110 ms | ███  27
 111 ms | ████  37
 112 ms | ███  27
 113 ms | ██  14
 114 ms | █  12
 115 ms | ██  13
 116 ms | █  12
 117 ms | █  5
 118 ms |   3
 119 ms |   4
 120 ms |   2
 122 ms |   2
 123 ms |   4
 124 ms |   2
 125 ms | █  10
 126 ms |   3
 128 ms |   2
 129 ms |   1
 132 ms |   2
 136 ms |   1
 140 ms |   2
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.14`
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
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `14.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `86.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `7.73`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195331 ms  |  Sample ticks: 3600

**FPS**  avg `10.04`, min `7.38`, p50 `10.03`, p95 `11.13`, p99 `11.86`, 1%low `7.84`, 0.1%low `7.42`, std `0.69`

**Frame time (ms)**  avg `100.10`, p50 `99.75`, p95 `114.03`, p99 `125.02`, p99.9 `129.89`, max `135.49`

**Client tick (ms)**  avg `0.61`, p95 `0.98`, max `1.89`

**Memory**  start `1333 MB`, end `1207 MB`, peak `1840 MB`, GC `14 events / 59 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |  █                                                                             
 10.2 |  █                                                                             
 10.2 |  █   █                                                       █                 
 10.1 |  █   █  █  █             █                                   █      █   █      
 10.1 |  █   █  █ ██ █ █    █    █  █    █     █           █  ██  █  █ █    █ █ █      
 10.1 |  ███ █  █ ████ █   ██    █  █    ██   ██   ██     ██  ██ ███ █ █  █ ███ █ █ ██ 
 10.0 |█ ███ █ ██ ████ ██ ████ ██████ █ ███  ███ █████ ██ ██  ██ ███ █ ██ █ ███ █ █ ███
 10.0 |█ ███ █ ██ ████ ███████ █████████████████ ████████ ███ ██ ███ ████ █ ███████ ███
 10.0 |█ ████████████████████████████████████████████████████ █████████████ ███████████
  9.9 |█ ██████████████████████████████████████████████████████████████████████████████
  9.9 |█ ██████████████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  72 ms |   2
  75 ms |   1
  76 ms |   1
  77 ms |   2
  79 ms |   1
  80 ms |   1
  81 ms |   2
  82 ms | █  5
  83 ms |   3
  84 ms | █  6
  85 ms | █  9
  86 ms | █  8
  87 ms | ██  15
  88 ms | ██  19
  89 ms | ███  23
  90 ms | ███  26
  91 ms | █████  36
  92 ms | ███████  54
  93 ms | ██████  44
  94 ms | ███████  57
  95 ms | ██████████  79
  96 ms | ██████████  78
  97 ms | ███████████  85
  98 ms | ██████████████████  142
  99 ms | █████████████████████████████████████  295
 100 ms | ████████████████████████████████████████  317
 101 ms | ██████████████  110
 102 ms | ██████  45
 103 ms | ███  24
 104 ms | ███  21
 105 ms | ███  20
 106 ms | ███  20
 107 ms | ██  19
 108 ms | ██  19
 109 ms | ████  28
 110 ms | ███  24
 111 ms | ████  35
 112 ms | ██  17
 113 ms | ██  15
 114 ms | ██  13
 115 ms | ██  15
 116 ms | █  7
 117 ms | █  10
 118 ms | █  5
 119 ms |   3
 120 ms | █  7
 122 ms | █  5
 123 ms | █  4
 124 ms |   2
 125 ms | █  6
 126 ms | █  5
 127 ms | █  5
 128 ms |   1
 134 ms |   1
 135 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.42`
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
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `13.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `86.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `7.84`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`

