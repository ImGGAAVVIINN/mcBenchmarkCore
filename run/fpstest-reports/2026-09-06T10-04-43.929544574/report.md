# FPS Test session — 2026-09-06T10:11:43.613978986+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 120.6 | 56.9 | 25.6 | 10.03 | 0.61 | 3 | 222 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 119.8 | 88.7 | 47.2 | 9.79 | 0.64 | 4 | 278 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 30.0 | 27.9 | 25.6 | 34.72 | 0.67 | 1 | 260 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 30.0 | 26.5 | 22.5 | 34.96 | 0.70 | 5 | 180 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 30.0 | 27.0 | 22.6 | 34.85 | 0.68 | 2 | 44 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 31.2 | 17.5 | 15.7 | 48.50 | 0.51 | 1 | 180 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 30.9 | 17.5 | 12.7 | 41.69 | 0.69 | 1 | 292 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 30.7 | 16.9 | 12.5 | 46.32 | 1.08 | 5 | 63 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 32.0 | 11.7 | 8.5 | 49.53 | 3.12 | 8 | 127 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 15 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 16 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 17 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 18 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 21 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 22 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 23 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 24 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 25 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 26 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 27 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 28 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 29 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 30 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 31 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 32 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 33 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 34 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 35 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 36 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 37 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 38 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 39 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 40 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 41 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 42 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 43 | [LowEnd Shader](#lowend-shader) | Showcase | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

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
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze)
- [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on)
- [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses)
- [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete)
- [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered)
- [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered)
- [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered)
- [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered)
- [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps)
- [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t)
- [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen)
- [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen)
- [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen)
- [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen)
- [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Savanna flyby](#savanna-flyby)
- [Savanna flyby](#savanna-flyby)
- [Savanna flyby](#savanna-flyby)
- [Savanna flyby](#savanna-flyby)
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

Category: **Particles**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `120.55`, min `22.74`, p50 `119.09`, p95 `132.56`, p99 `146.37`, 1%low `56.90`, 0.1%low `25.61`, std `30.14`

**Frame time (ms)**  avg `8.46`, p50 `8.40`, p95 `9.26`, p99 `10.03`, p99.9 `29.70`, max `43.98`

**Client tick (ms)**  avg `0.61`, p95 `0.95`, max `1.46`

**Memory**  start `520 MB`, end `742 MB`, peak `742 MB`, GC `3 events / 15 ms`

**FPS over sampling window (ASCII):**

```
164.9 |                                                          █                     
160.5 |                                                          █                     
156.1 |                                                          █                     
151.7 |                                                         ██                     
147.3 |                                                         ██                     
143.0 |                                                         ██                     
138.6 |                                                         ██                     
134.2 |                                                         ██                     
129.8 |      █                                                  ██                     
125.4 |      █                                                  ██                     
121.1 |███████████████████████ ███████████████████████████████████████████████████ ████
116.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms |   2
   2 ms |   1
   3 ms |   3
   4 ms |   2
   5 ms |   3
   6 ms |   17
   7 ms | ██████████  395
   8 ms | ████████████████████████████████████████  1652
   9 ms | ██████  265
  10 ms |   10
  11 ms |   2
  12 ms |   1
  13 ms |   1
  14 ms |   1
  17 ms |   2
  21 ms |   2
  24 ms |   2
  29 ms |   2
  34 ms |   1
  43 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 295 | 120.7 | 10.15 |
| `dragon_breath` | 160 | 295 | 119.6 | 9.71 |
| `end_rod` | 240 | 295 | 119.5 | 9.96 |
| `portal` | 160 | 295 | 119.5 | 9.30 |
| `ALL_TOGETHER` | 1680 | 295 | 119.5 | 9.40 |
| `sculk_charge_pop` | 240 | 295 | 127.0 | 24.16 |
| `smoke` | 160 | 295 | 119.3 | 9.32 |
| `flame` | 160 | 295 | 119.3 | 11.27 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_harmonic_avg` = `118.26`
- `fps_0p1pct_low` = `25.61`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `56.90`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `119.84`, min `41.58`, p50 `119.00`, p95 `134.55`, p99 `143.70`, 1%low `88.74`, 0.1%low `47.22`, std `10.92`

**Frame time (ms)**  avg `8.40`, p50 `8.40`, p95 `9.31`, p99 `9.79`, p99.9 `13.02`, max `24.05`

**Client tick (ms)**  avg `0.64`, p95 `0.95`, max `1.40`

**Memory**  start `548 MB`, end `796 MB`, peak `827 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
130.3 |                                    █                                           
129.2 |                                    █                                           
128.2 |                                    █                                           
127.1 |                                    █                                           
126.1 |                                    █                                           
125.1 |                                    █                                        █  
124.0 |                                    █                                        █  
123.0 |                                    █                                        █  
122.0 |                                    █                                        █  
120.9 |   █   █              █      █      █                                        █  
119.9 |██ ███ ██████ ███████ ██████ █████ ███ ██████ ███████ ██████ ███████ ███████████
118.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms |   2
   4 ms |   1
   5 ms |   2
   6 ms | █  21
   7 ms | ██████████  400
   8 ms | ████████████████████████████████████████  1598
   9 ms | ████████  338
  10 ms |   13
  11 ms |   1
  12 ms |   1
  13 ms |   1
  18 ms |   1
  24 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `47.22`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `119.04`
- `preload_duration_ms` = `55.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `88.74`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `29.96`, min `25.64`, p50 `29.94`, p95 `30.86`, p99 `31.32`, 1%low `27.86`, 0.1%low `25.64`, std `0.68`

**Frame time (ms)**  avg `33.40`, p50 `33.40`, p95 `34.38`, p99 `34.72`, p99.9 `37.14`, max `39.00`

**Client tick (ms)**  avg `0.67`, p95 `0.94`, max `1.20`

**Memory**  start `563 MB`, end `648 MB`, peak `823 MB`, GC `1 events / 5 ms`

**FPS over sampling window (ASCII):**

```
 30.8 |                                              █                                 
 30.6 |                                              █                                 
 30.5 |                                              █                                 
 30.4 |                                              █                                 
 30.3 |                                              █                                 
 30.1 | █   █  █  █      █        █     █        █   █          ██     █     █  █      
 30.0 | ██ ██  █  █ ███ ██ ██ ██ ██ ██  █ █████ ██ █ ███ ███ ██ ██ ██  █ ██ ██ ██ ██  █
 29.9 | ████████████████████████ ███████████████████ ██████████ ███████████████████████
 29.7 |█████████████████████████████████████████████ ██████████████████████████████████
 29.6 |█████████████████████████████████████████████ ██████████████████████████████████
 29.5 |█████████████████████████████████████████████ ██████████████████████████████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  28 ms |   1
  30 ms |   1
  31 ms | █  6
  32 ms | █████████████████████████████████  192
  33 ms | ████████████████████████████████████████  236
  34 ms | ███████████████████████████  159
  35 ms | █  3
  38 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `25.64`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `32.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `27.86`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `29.97`, min `22.53`, p50 `29.93`, p95 `31.03`, p99 `31.69`, 1%low `26.49`, 0.1%low `22.53`, std `1.06`

**Frame time (ms)**  avg `33.40`, p50 `33.41`, p95 `34.58`, p99 `34.96`, p99.9 `40.39`, max `44.39`

**Client tick (ms)**  avg `0.70`, p95 `0.87`, max `1.16`

**Memory**  start `647 MB`, end `442 MB`, peak `827 MB`, GC `5 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 31.1 |                              █                                                 
 31.0 |                              █                                                 
 30.8 |                              █                                                 
 30.7 |                              █                                                 
 30.6 |                              █                                                 
 30.5 |                              █                                                 
 30.4 |                              █                                                 
 30.2 |                         █    █                                                 
 30.1 |       █  █  █  █  █  █  █   ██    █ ██  █    ██  █            █  █  █          
 30.0 |██ ██  █  ██ █ ██ ██ ██  █  █████ ██ ██ ██ ██ ██  █ ██   ███ ███ ██ ██ █████ ██ 
 29.9 |████████████████████████ ███████████ ████████ ██████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  21 ms |   1
  29 ms |   2
  31 ms | ██  12
  32 ms | ██████████████████████████████████  193
  33 ms | ████████████████████████████████████████  227
  34 ms | ████████████████████████████  158
  35 ms |   2
  36 ms |   1
  37 ms |   2
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `22.53`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `75.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `26.49`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `29.97`, min `22.58`, p50 `29.98`, p95 `30.84`, p99 `31.42`, 1%low `26.98`, 0.1%low `22.58`, std `0.96`

**Frame time (ms)**  avg `33.40`, p50 `33.36`, p95 `34.47`, p99 `34.85`, p99.9 `40.49`, max `44.28`

**Client tick (ms)**  avg `0.68`, p95 `0.92`, max `1.31`

**Memory**  start `807 MB`, end `499 MB`, peak `851 MB`, GC `2 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 31.0 |                                                              █                 
 30.9 |                                                              █                 
 30.8 |                                                              █                 
 30.7 |                                                              █                 
 30.6 |                                                              █                 
 30.4 |                                                              █                 
 30.3 |                                                              █                 
 30.2 |                                                              █             █   
 30.1 |     █  █     █           █   █                    █          █ █           █   
 30.0 |  █  █  █  █  █  █  █ ██  ██  █  █  █ ██ ██ ██ ██  █  █ ██  █ █ █ ██  █ ██ ██ ██
 29.9 |█████████ ██ ████████████ █████ ██ █████ ██ ██ ████████ █████████ ██ ██ █████ ██
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  22 ms |   1
  27 ms |   1
  31 ms | █  6
  32 ms | ███████████████████████████████████  202
  33 ms | ████████████████████████████████████████  229
  34 ms | ███████████████████████████  155
  35 ms | █  3
  37 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `22.58`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `34.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `26.98`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23069 ms  |  Sample ticks: 400

**FPS**  avg `31.19`, min `15.72`, p50 `29.97`, p95 `30.92`, p99 `60.47`, 1%low `17.47`, 0.1%low `15.72`, std `13.95`

**Frame time (ms)**  avg `33.41`, p50 `33.37`, p95 `34.43`, p99 `48.50`, p99.9 `62.92`, max `63.63`

**Client tick (ms)**  avg `0.51`, p95 `0.63`, max `0.82`

**Memory**  start `636 MB`, end `624 MB`, peak `816 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 62.0 |                                                                  █             
 59.0 |                                                                  █             
 56.1 |                                                                  █             
 53.2 |                                                                  █        █    
 50.3 |                                                                  █        █    
 47.4 |                                                                  █        █    
 44.4 |                                  █                               █        █    
 41.5 |                                  █                               █        █    
 38.6 |    █                             █                   █           █        █    
 35.7 |    █                        █    █                   █           █        █    
 32.8 |    █               ██       █    ██                  █           █        █ █  
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
   4 ms |   1
   6 ms |   1
   9 ms |   2
  15 ms |   1
  16 ms |   1
  17 ms |   1
  19 ms |   1
  20 ms |   1
  22 ms |   3
  23 ms |   3
  24 ms |   1
  26 ms |   1
  28 ms |   1
  31 ms |   1
  32 ms | ███████████████████████  164
  33 ms | ████████████████████████████████████████  285
  34 ms | ███████████████  106
  35 ms |   1
  37 ms |   1
  39 ms |   1
  40 ms |   1
  42 ms | █  4
  43 ms |   3
  44 ms | █  4
  48 ms |   2
  49 ms |   1
  53 ms |   1
  57 ms |   2
  62 ms |   1
  63 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `15.72`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.93`
- `preload_duration_ms` = `82.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.47`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `30.93`, min `12.68`, p50 `29.97`, p95 `30.94`, p99 `38.00`, 1%low `17.50`, 0.1%low `12.68`, std `13.98`

**Frame time (ms)**  avg `33.42`, p50 `33.36`, p95 `34.61`, p99 `41.69`, p99.9 `68.30`, max `78.84`

**Client tick (ms)**  avg `0.69`, p95 `0.96`, max `1.40`

**Memory**  start `544 MB`, end `688 MB`, peak `836 MB`, GC `1 events / 2 ms`

**FPS over sampling window (ASCII):**

```
 64.2 |                                                       █                        
 61.1 |                                                       █                        
 58.0 |                                                       █                        
 54.8 |                                                       █                        
 51.7 |                                                       ██                       
 48.6 |                            █                          ██                       
 45.4 |                            █                          ██                       
 42.3 |                            █                          ██                       
 39.2 |                            █                          ██       █               
 36.0 |                            █                          ██       █               
 32.9 |                            █                          ██       █               
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
   5 ms |   2
  10 ms |   1
  23 ms |   1
  24 ms |   1
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms | ██  9
  32 ms | ███████████████████████████████████  190
  33 ms | ████████████████████████████████████████  219
  34 ms | ████████████████████████████  151
  35 ms | █  7
  37 ms |   2
  40 ms |   1
  41 ms |   2
  45 ms |   1
  55 ms |   1
  60 ms |   1
  61 ms |   1
  78 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `12.68`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.92`
- `preload_duration_ms` = `37.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.50`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `30.73`, min `12.53`, p50 `29.89`, p95 `31.46`, p99 `47.80`, 1%low `16.93`, 0.1%low `12.53`, std `15.27`

**Frame time (ms)**  avg `33.50`, p50 `33.46`, p95 `34.97`, p99 `46.32`, p99.9 `70.45`, max `79.80`

**Client tick (ms)**  avg `1.08`, p95 `1.35`, max `8.17`

**Memory**  start `797 MB`, end `619 MB`, peak `860 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 79.6 |                                                                          █     
 74.8 |                                                                          █     
 69.9 |                                                                          █     
 65.1 |                                                                          █     
 60.2 |                                                                          █     
 55.4 |                                                                          █     
 50.5 |                                                                          █     
 45.6 |                                                                          █     
 40.8 |                                                                     █    █     
 35.9 |                                                            █        █    █     
 31.1 |████████████████████████████████████████████████████████████████████ ███████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
  13 ms |   1
  16 ms |   2
  18 ms |   2
  21 ms |   1
  23 ms |   2
  24 ms |   1
  26 ms |   1
  28 ms |   2
  30 ms |   1
  31 ms | ███████  31
  32 ms | █████████████████████████████████████  167
  33 ms | ████████████████████████████████████████  180
  34 ms | ███████████████████████████████████████  175
  35 ms | ███  14
  36 ms |   2
  37 ms |   2
  40 ms |   1
  41 ms |   2
  44 ms |   1
  45 ms |   1
  46 ms |   1
  48 ms |   1
  49 ms |   1
  54 ms |   1
  58 ms |   1
  64 ms |   1
  79 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `12.53`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.85`
- `preload_duration_ms` = `31.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `16.93`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `31.95`, min `8.53`, p50 `29.97`, p95 `33.71`, p99 `73.54`, 1%low `11.74`, 0.1%low `8.53`, std `19.02`

**Frame time (ms)**  avg `33.64`, p50 `33.37`, p95 `37.21`, p99 `49.53`, p99.9 `112.47`, max `117.20`

**Client tick (ms)**  avg `3.12`, p95 `3.74`, max `4.76`

**Memory**  start `749 MB`, end `577 MB`, peak `876 MB`, GC `8 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 62.1 |                                                 █                              
 58.9 |                   █                             █                              
 55.7 |                   █        █                    █                          █   
 52.6 |           █       █        █                    █                          █   
 49.4 |           █       █        █                    █                          █   
 46.2 |           █       █        █                    █                          █   
 43.0 |           █       █        █                    █                          █   
 39.8 |  █        █       █        █                    █                          █   
 36.7 |  █        █       █        █                    █                          █   
 33.5 |  █   █    ██      █        █   █                █                          ██  
 30.3 |██████████████████ █████████████████████████████████████████████████████████████
 27.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
   4 ms | █  4
   9 ms |   1
  13 ms |   1
  15 ms |   1
  16 ms |   1
  17 ms |   1
  18 ms |   1
  20 ms | █  2
  28 ms | ██  6
  29 ms | ████████  32
  30 ms | █████████████████████████████████████  139
  31 ms | ██  9
  32 ms | █████████  35
  33 ms | █████████████████████████████████████  142
  34 ms | ████  16
  35 ms | ██  9
  36 ms | ████████████████████████████████████████  152
  37 ms | ███████  26
  38 ms |   1
  40 ms | █  2
  41 ms |   1
  44 ms |   1
  45 ms | █  2
  46 ms |   1
  48 ms |   1
  49 ms |   1
  54 ms |   1
  59 ms |   1
  62 ms |   1
 109 ms | █  2
 117 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `8.53`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.73`
- `preload_duration_ms` = `72.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `11.74`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 13636 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 13777 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `POST_RUN`
- `status` = `failed`
- `part` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 1052 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 56 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `part` = `1.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 3 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `PREPARING`
- `status` = `failed`
- `part` = `1.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 1597 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 457 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 803 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 297 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 348 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 2601 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 4794 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 115 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `part` = `1.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 402 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 0 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `PREPARING`
- `status` = `failed`
- `part` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 3961 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 6960 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 9902 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 13106 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 51 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `part` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 3459 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 496 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 3645 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 6896 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 9942 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 3396 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `part` = `1.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 397 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 251 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 195 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 154 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 2902 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 6549 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `part` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 1905 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 4632 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `LowEnd Shader`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `2.00`

