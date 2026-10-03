# FPS Test session — 2026-09-07T22:25:35.128164344+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 313.1 | 42.9 | 29.6 | 20.99 | 0.57 | 3 | 282 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 304.8 | 45.1 | 42.7 | 21.46 | 0.64 | 4 | 272 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 31.0 | 21.3 | 20.8 | 46.42 | 0.64 | 1 | 244 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 31.5 | 20.0 | 17.8 | 47.18 | 0.69 | 4 | 88 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 31.2 | 21.2 | 21.1 | 46.59 | 0.63 | 2 | 16 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 31.2 | 21.2 | 20.9 | 46.69 | 0.48 | 0 | 328 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 31.2 | 20.6 | 18.3 | 46.72 | 0.65 | 1 | 368 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 31.4 | 20.8 | 20.2 | 47.54 | 1.02 | 4 | 208 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 32.0 | 18.6 | 16.8 | 50.24 | 2.80 | 5 | 406 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 38.1 | 16.4 | 16.1 | 59.67 | 3.60 | 10 | 126 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 31.5 | 21.1 | 20.9 | 47.05 | 0.87 | 5 | 25 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 31.2 | 20.4 | 16.6 | 46.04 | 0.47 | 2 | 202 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 34.5 | 17.1 | 16.1 | 57.29 | 2.93 | 5 | 188 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 33.4 | 16.9 | 16.5 | 57.98 | 2.50 | 5 | 68 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 42.3 | 13.8 | 13.2 | 70.74 | 13.68 | 29 | 230 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 43.8 | 14.0 | 13.1 | 68.98 | 14.36 | 26 | 275 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 133.1 | 20.2 | 19.8 | 48.54 | 1.75 | 5 | 319 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 363.8 | 44.0 | 40.9 | 21.83 | 1.68 | 5 | 388 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 274.5 | 22.2 | 21.2 | 43.28 | 0.58 | 1 | 440 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 31.3 | 20.6 | 18.5 | 47.00 | 0.26 | 1 | 24 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 31.2 | 20.9 | 20.4 | 46.62 | 0.23 | 1 | 580 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 31.3 | 21.2 | 21.0 | 46.59 | 0.26 | 1 | 160 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 31.1 | 21.1 | 20.6 | 46.53 | 0.26 | 0 | 184 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 32.8 | 19.0 | 15.3 | 47.92 | 0.36 | 45 | 414 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 31.6 | 18.8 | 17.1 | 48.89 | 0.35 | 33 | 708 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 31.8 | 17.1 | 14.0 | 50.26 | 0.32 | 26 | 208 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 31.6 | 18.6 | 16.2 | 48.08 | 0.33 | 25 | 390 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 31.4 | 19.5 | 18.2 | 48.74 | 0.31 | 21 | 584 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 31.7 | 18.7 | 17.5 | 50.72 | 0.34 | 22 | 1361 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 32.0 | 18.3 | 16.5 | 49.15 | 0.32 | 21 | 1016 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 32.0 | 18.6 | 17.2 | 51.83 | 0.31 | 25 | 634 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 31.7 | 18.5 | 16.5 | 48.66 | 0.37 | 24 | 113 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 31.4 | 20.0 | 19.2 | 47.23 | 0.28 | 21 | 335 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 32.1 | 17.2 | 15.7 | 51.55 | 0.33 | 21 | 1266 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 31.7 | 19.8 | 19.0 | 49.21 | 0.33 | 21 | 93 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 10.0 | 8.7 | n/a | 112.41 | 0.26 | 3 | 56 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 10.0 | 8.0 | n/a | 121.44 | 2.52 | 1 | 1204 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 10.0 | 8.8 | n/a | 113.31 | 0.27 | 0 | 212 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 10.0 | 8.7 | n/a | 114.91 | 0.27 | 0 | 136 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 10.0 | 8.8 | n/a | 113.32 | 0.27 | 0 | 164 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 10.0 | 8.7 | n/a | 113.40 | 0.27 | 0 | 144 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 10.0 | 7.9 | 7.5 | 123.02 | 0.66 | 14 | 388 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 100.0 | 8.2 | 7.5 | 116.30 | 0.65 | 14 | 538 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 45.6 | 16.2 | 13.4 | 58.73 | 0.75 | 17 | 98 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 39.3 | 15.9 | 14.8 | 60.41 | 0.72 | 18 | 845 |

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

**FPS**  avg `313.05`, min `25.93`, p50 `118.78`, p95 `1555.34`, p99 `1868.69`, 1%low `42.94`, 0.1%low `29.60`, std `474.88`

**Frame time (ms)**  avg `9.13`, p50 `8.42`, p95 `18.06`, p99 `20.99`, p99.9 `27.65`, max `38.57`

**Client tick (ms)**  avg `0.57`, p95 `0.92`, max `8.42`

**Memory**  start `550 MB`, end `832 MB`, peak `832 MB`, GC `3 events / 14 ms`

**FPS over sampling window (ASCII):**

```
522.3 |                                                               █                
492.6 |                                                               █                
463.0 |                                     █                     █   █                
433.3 |                                     █                     █ █ █                
403.7 |                                     █  █ █ █            █ █ █ █ █    █         
374.0 |                 █      █  █   █     ██ █ █ █ █          █ █ █ ███    ██        
344.3 |           █     █    ███  █   █   █ ██ ███ █ █ ███      █ █ ██████   ██  ██ ██ 
314.7 |           █     ███  ███  ██ ██   █ ████████ █ ████  ██ █ █ ██████  ███  ██ ██ 
285.0 |    █    █ █ ██  ███  ███  █████   █ ██████████ █████ ██ ███████████████  ██ ███
255.4 |  █ █   █████████████ ████ ██████ ██ ██████████ ████████████████████████ ███████
225.7 |███████ ████████████████████████████ ██████████ ████████████████████████████████
196.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████  263
   1 ms | ███████  122
   2 ms | ████  70
   3 ms | █  20
   4 ms |   5
   5 ms |   4
   6 ms | █  12
   7 ms | ██████████  176
   8 ms | ████████████████████████████████████████  733
   9 ms | ███████  135
  10 ms | █  12
  11 ms |   2
  12 ms | █  12
  13 ms | ████  68
  14 ms | ███████  127
  15 ms | ████████  146
  16 ms | ██████  110
  17 ms | ███  59
  18 ms | ██  39
  19 ms | █  26
  20 ms | ██  28
  21 ms | █  14
  22 ms |   3
  23 ms |   1
  24 ms |   1
  28 ms |   1
  29 ms |   1
  38 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `sculk_charge_pop` | 240 | 273 | 243.4 | 20.35 |
| `smoke` | 160 | 273 | 290.5 | 21.47 |
| `flame` | 160 | 273 | 304.0 | 20.30 |
| `dripping_water` | 240 | 273 | 315.6 | 20.75 |
| `dragon_breath` | 160 | 273 | 345.6 | 20.96 |
| `end_rod` | 240 | 273 | 318.4 | 19.30 |
| `portal` | 160 | 273 | 366.0 | 20.36 |
| `ALL_TOGETHER` | 1680 | 273 | 318.4 | 21.14 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `42.94`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `52.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `109.57`
- `fps_0p1pct_low` = `29.60`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `304.76`, min `42.30`, p50 `118.36`, p95 `1350.87`, p99 `1628.21`, 1%low `45.11`, 0.1%low `42.67`, std `434.29`

**Frame time (ms)**  avg `9.21`, p50 `8.45`, p95 `18.63`, p99 `21.46`, p99.9 `22.89`, max `23.64`

**Client tick (ms)**  avg `0.64`, p95 `0.89`, max `1.24`

**Memory**  start `654 MB`, end `578 MB`, peak `926 MB`, GC `4 events / 14 ms`

**FPS over sampling window (ASCII):**

```
400.7 |                                                                             █  
383.4 |               █               █              █        █                     █  
366.1 |          █    █         █  █ ██              █        █                  █  █ █
348.8 | █        █    █    █    █  █ ██              ██       █  █               █  █ █
331.5 | █      █ █   ██ ██ █   ███ █ ███             ███      █  █            ██ ██ ███
314.2 | █ ██   █ █   ██ ██ █  ███████████ ███       ████  █ █ █  █  █  ██    ███ ██ ███
296.9 | █ ██  ██ █  ███ ██ █  ███████████ ███  █ █  █████ █ ███  █  █  ███  ████ ██████
279.6 | █ ██  ██ ██████ ██ █ ████████████ ███  █ ██ █████ █ ███ ███ █  ███ ████████████
262.3 |██████ ██████████████ ████████████ ███  █ ██ ███████████████ █  ███ ████████████
245.0 |██████████████████████████████████ ████ ████ ███████████████████████████████████
227.7 |████████████████████████████████████████████ ███████████████████████████████████
210.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████  292
   1 ms | ██████  107
   2 ms | ████  70
   3 ms | █  16
   4 ms |   3
   6 ms |   4
   7 ms | █████████  159
   8 ms | ████████████████████████████████████████  733
   9 ms | ████████  150
  10 ms |   2
  11 ms |   2
  12 ms |   7
  13 ms | ██  45
  14 ms | █████  96
  15 ms | ███████  131
  16 ms | ████████  141
  17 ms | ████  77
  18 ms | ██  45
  19 ms | ██  31
  20 ms | █  27
  21 ms | █  25
  22 ms |   7
  23 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `45.11`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `42.67`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `108.56`
- `preload_duration_ms` = `74.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23128 ms  |  Sample ticks: 400

**FPS**  avg `31.01`, min `20.82`, p50 `30.16`, p95 `44.38`, p99 `47.79`, 1%low `21.30`, 0.1%low `20.82`, std `6.11`

**Frame time (ms)**  avg `33.41`, p50 `33.16`, p95 `44.35`, p99 `46.42`, p99.9 `47.45`, max `48.04`

**Client tick (ms)**  avg `0.64`, p95 `0.93`, max `1.23`

**Memory**  start `683 MB`, end `669 MB`, peak `927 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 34.1 |                                                     █                          
 33.6 |       █                  █                  █       █                          
 33.2 |       █                  █                  █       █             █            
 32.7 |       █                  █ █                █       ██            █ █          
 32.2 |       █                  █ █   █ █          █ █     ██  █         █ █      █   
 31.8 | █   █ █ █     █      █ █ █ █ █ ███  █ █     █ █   █ ██  █  ██     █ █      █   
 31.3 | █ █ ███ █ █ █ ██   █ █ █ █ █ █ ███ ██ █   █ █ █ █ █ ██  █  ██ █   █ █      █   
 30.9 | █ █ ███ █ █ █ ████ █ █ █ █ █ █ ███ ██ █ ███ █ ███ █ ███ █  ██ ███████ ██ █ █ █ 
 30.4 | ███ █████ ███ ████ █ ███ █ █ █████ ██ █ ███ █ ███ █████ █  ██████████ ██████ █ 
 29.9 | ███ █████ ███ ██████ █████ █ █████ ██ █ ███ █ █████████ ██ ██████████ ████████ 
 29.5 |███████████████████████████████████ ████████ ███████████ ███████████████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ███  6
  21 ms | ███████  14
  22 ms | ████████  17
  23 ms | ███████  15
  24 ms | █████  11
  25 ms | █████████  18
  26 ms | ██████  12
  27 ms | ████████  16
  28 ms | ███  7
  29 ms | ██████████  21
  30 ms | ███████████████  30
  31 ms | ████████████████  33
  32 ms | ████████████████████████████████████████  81
  33 ms | ████████████████████████████████████████  82
  34 ms | ██████████████████████████████  61
  35 ms | ████████  17
  36 ms | ████████  17
  37 ms | ██████  12
  38 ms | █████  10
  39 ms | ████████  16
  40 ms | ██████  13
  41 ms | ██████████  21
  42 ms | ██████  12
  43 ms | ████████  17
  44 ms | ██████████  21
  45 ms | █████  11
  46 ms | ██  5
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.30`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.82`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.93`
- `preload_duration_ms` = `33.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `31.49`, min `17.85`, p50 `29.82`, p95 `47.29`, p99 `51.04`, 1%low `19.96`, 0.1%low `17.85`, std `7.66`

**Frame time (ms)**  avg `33.38`, p50 `33.53`, p95 `45.52`, p99 `47.18`, p99.9 `53.11`, max `56.02`

**Client tick (ms)**  avg `0.69`, p95 `0.83`, max `8.00`

**Memory**  start `852 MB`, end `783 MB`, peak `940 MB`, GC `4 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 36.5 |                                                    █                           
 35.8 |                                                    █  █                        
 35.1 |                                    █               █  █                        
 34.4 |                               █    █               █  █                        
 33.7 |  █ █  █                     █ █    █     █         █  █           █          █ 
 33.0 |█ █ █  █        █            █ █    █     █  █      █  █           █      █ █ █ 
 32.3 |█ █ █ ███       █          █ █ █    █  █  █  █      ██ █ █   █ █   █   █  █ █ █ 
 31.6 |█ █ █ █████     █ █ █ ██   █ █ █   ██  █  █ ██     ███ █ █ █ █ █ █ █ █ █  █ █ ██
 31.0 |█ █ ███████  █  █████ ██  ██ █ █ ████ ██  █ ███ █  █████████ █ █ █ █ ███ ████ ██
 30.3 |█ █ █████████████████ ██████ █ ██████████ █ ██████ █████████ █████ █████████████
 29.6 |█ ███████████████████ ███████████████████ █ ████████████████████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  11 ms | █  1
  17 ms | █  1
  18 ms | █  2
  19 ms | ███  6
  20 ms | █████████  18
  21 ms | ████████████  24
  22 ms | █████  9
  23 ms | ██████  12
  24 ms | ██████  12
  25 ms | █████████  17
  26 ms | ███████████  21
  27 ms | ██  4
  28 ms | ████████  15
  29 ms | ██████  11
  30 ms | ██████  11
  31 ms | ██████████████  28
  32 ms | ██████████████████████████████████  68
  33 ms | ████████████████████████████████████████  80
  34 ms | ███████████████████████████████████████  78
  35 ms | ████████████  23
  36 ms | █████  9
  37 ms | ███████  13
  38 ms | █████  10
  39 ms | █████████  18
  40 ms | ███  6
  41 ms | ███████  14
  42 ms | ███████  14
  43 ms | ██████  12
  44 ms | ██████████  20
  45 ms | ███████████  21
  46 ms | ██████  11
  47 ms | ██  4
  48 ms | █  2
  49 ms | █  1
  51 ms | █  1
  56 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.96`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.85`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.96`
- `preload_duration_ms` = `33.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `31.18`, min `21.08`, p50 `29.93`, p95 `46.03`, p99 `49.77`, 1%low `21.18`, 0.1%low `21.08`, std `6.64`

**Frame time (ms)**  avg `33.39`, p50 `33.41`, p95 `44.74`, p99 `46.59`, p99.9 `47.43`, max `47.45`

**Client tick (ms)**  avg `0.63`, p95 `0.90`, max `1.32`

**Memory**  start `943 MB`, end `463 MB`, peak `959 MB`, GC `2 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |      █                                                                         
 33.5 |      █   █                        █                             █              
 33.0 |  █   █   █           █          █ █                             █       █ █    
 32.5 |  █   █ █ █           █          █ █                   █   █     █       █ █    
 32.1 |  █   █ █ █ █         █  █       █ █ █   ██ █    █ █ ███   █   █ █       █ █    
 31.6 |  █ █ █ █ █ █ ██      █  ██    █ █ █ █   ██ █    █ █ ███  ██ ███ ██  █   █ █    
 31.2 |█ █ █ █ █ █ █████     █████ █  █ █ █ ███ ██ █  █ █ █ ████ ██ ███ ██  █ █ █ █  █ 
 30.7 |█ █ █ █ █ █ ██████    █████ ██ █ █ █ ███████████████ ████ ██ ███ ██  █ █ █ ██ █ 
 30.3 |█ █ █ █ █ █ ███████ █ █████ ██ █ ███████████████████ ████ ██ ███████ ███ █ █████
 29.8 |███████ █ ██████████████████████ ███████████████████ ████ ██████████████ █ █████
 29.4 |█████████ ██████████████████████ ███████████████████████████████████████ █ █████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | ██  5
  20 ms | ████  8
  21 ms | █████████  19
  22 ms | ██████  13
  23 ms | ███████  14
  24 ms | ████████  17
  25 ms | ██████  13
  26 ms | ███████  14
  27 ms | ███████  14
  28 ms | ████████  17
  29 ms | █████  11
  30 ms | █████████  18
  31 ms | █████████████  26
  32 ms | ████████████████████████████████████  74
  33 ms | ████████████████████████████████████████  82
  34 ms | █████████████████████████████████████  75
  35 ms | ██████████  21
  36 ms | ███████  15
  37 ms | █████  11
  38 ms | ███████  15
  39 ms | ██████  13
  40 ms | ██████  12
  41 ms | ████████  16
  42 ms | ████████  16
  43 ms | ████████  16
  44 ms | ███████  14
  45 ms | █████  11
  46 ms | ██████  13
  47 ms | ██  5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.18`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.08`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.95`
- `preload_duration_ms` = `37.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `31.20`, min `20.91`, p50 `30.03`, p95 `46.14`, p99 `48.94`, 1%low `21.23`, 0.1%low `20.91`, std `6.72`

**Frame time (ms)**  avg `33.40`, p50 `33.30`, p95 `45.17`, p99 `46.69`, p99.9 `47.48`, max `47.82`

**Client tick (ms)**  avg `0.48`, p95 `0.61`, max `1.59`

**Memory**  start `562 MB`, end `890 MB`, peak `890 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 34.2 |          █                                       █                             
 33.7 |          █     █                               █ █                 █           
 33.3 |       █  █     █                         █     █ █                 █           
 32.8 |       █ ██     █                █ █      █ █   █ █                 █   █       
 32.3 |     █ █ ██     █    █           █ █ █    █ █   █ █   █       █     █   █ █   █ 
 31.9 |     █ █ ██     █   ██ █    █  █ █ █ █    █ █   █ █   █     ███     █  ██ █   █ 
 31.4 |█  █ █ █ ██     █   ██ █  █ █ ██ █ █ ███  █ █   █ █   █     ████   ██  ██ █   █ 
 30.9 |██ ███ █ ███ ██ █   ██ ██ █ █ ████ █ ███  █ █   █ █ █ ████  █████████ ███ █ █ █ 
 30.4 |██████ █ ██████ █  ███ ████ █ ██████████  █ █████ █ █ ███████████████████████ █ 
 30.0 |████████ ██████ ███████████ █ █████████████ █████ █ ████████████████████████████
 29.5 |███████████████████████████ █ █████████████ █████ ██████████████████████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | █████  14
  21 ms | ████████  21
  22 ms | ██████  17
  23 ms | ██████  16
  24 ms | ████  10
  25 ms | ███  8
  26 ms | █████  13
  27 ms | ████  11
  28 ms | █████  13
  29 ms | ███████  19
  30 ms | ██████  16
  31 ms | ██████████  28
  32 ms | ██████████████████████████████  83
  33 ms | ████████████████████████████████████████  110
  34 ms | ██████████████████  49
  35 ms | █████  13
  36 ms | ███  9
  37 ms | ████  11
  38 ms | ███████  20
  39 ms | █████  13
  40 ms | █████  13
  41 ms | ███  8
  42 ms | ██████  17
  43 ms | ████  12
  44 ms | ███████  20
  45 ms | ███████  19
  46 ms | ████  11
  47 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.23`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.91`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `40.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `31.23`, min `18.27`, p50 `29.93`, p95 `46.01`, p99 `49.95`, 1%low `20.60`, 0.1%low `18.27`, std `6.84`

**Frame time (ms)**  avg `33.39`, p50 `33.41`, p95 `45.03`, p99 `46.72`, p99.9 `50.56`, max `54.74`

**Client tick (ms)**  avg `0.65`, p95 `0.89`, max `1.31`

**Memory**  start `564 MB`, end `569 MB`, peak `932 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 34.4 |                                                     █                          
 33.9 |           █                             █ █         █                          
 33.5 |           █              █              █ █         █                          
 33.0 |           █              █        █     █ █        ███                         
 32.5 |           █ █            █  █ █   █     █ █   █ █  ███                    █    
 32.0 |   █ █ █   █ █          █ █ ██ █ █ █     █ █   █ ██ ███    █  █ █ █     █  █    
 31.6 |██ █ █ █   ███ █    █   █ █ ██ █ █ █     █ █  ██ ██ ████   █  █ █ █     ██ █ █  
 31.1 |██ █ █ ██ ████ █ ██ █   █ █ ██ █ █ █ ██ ██ █  ██ ██ ████  ██  █ █ ██  ████ █ ███
 30.6 |██ ███ ██ ████ █ ██ ███ █ █ ██ █ █ █ █████ █  █████ █████ ██  █ █ ███ ████ █ ███
 30.1 |██ ███ ███████ ████████ █ ████ ███ ███████ █ ██████ ███████████ █ ████████ █ ███
 29.7 |██████ ██████████████████ ████ ███ ███████ ███████████████████████████████ █████
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | █  1
  19 ms | ██  4
  20 ms | █████████  17
  21 ms | ████████  16
  22 ms | ███████  14
  23 ms | ██████  12
  24 ms | ████  7
  25 ms | █████  10
  26 ms | ████████  15
  27 ms | ████████  15
  28 ms | ███████  14
  29 ms | ███████████  22
  30 ms | ██████████  19
  31 ms | ███████████████  30
  32 ms | ██████████████████████████████████████  76
  33 ms | ████████████████████████████████████████  80
  34 ms | █████████████████████████████████  65
  35 ms | █████████  17
  36 ms | ███████████  22
  37 ms | ██████  11
  38 ms | █████  10
  39 ms | ███████████  22
  40 ms | ███████  14
  41 ms | ██████  12
  42 ms | ████  8
  43 ms | ███████  13
  44 ms | ███████████  21
  45 ms | ████████  15
  46 ms | ██████  11
  47 ms | ██  4
  54 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.60`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `18.27`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.95`
- `preload_duration_ms` = `33.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `31.38`, min `20.25`, p50 `30.02`, p95 `47.05`, p99 `50.76`, 1%low `20.80`, 0.1%low `20.25`, std `7.24`

**Frame time (ms)**  avg `33.40`, p50 `33.31`, p95 `45.47`, p99 `47.54`, p99.9 `48.64`, max `49.39`

**Client tick (ms)**  avg `1.02`, p95 `1.24`, max `2.03`

**Memory**  start `740 MB`, end `781 MB`, peak `948 MB`, GC `4 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 34.3 |   █                                                                            
 33.8 |   █             █                     █                               █        
 33.3 |   █             █                     █ █                             █     █  
 32.8 |   █     █      ██           █         █ █                 █           █ █   █  
 32.3 | █ █ █   █     ███     █   █ █    ██   █ ██   █            ██        █ █ █ █ █ █
 31.8 |██ ███   █     ███    ██ █ █ █    ██   █ ██   █        █   ██   █    █ █ █ █ ███
 31.3 |██ ███   ███ █ ████   ████ █ █ █ ████  █ ██   █ █  █ ████  ███ ██  █ █ █ █ █ ███
 30.8 |██ ███ █ ███ ████████ ████████ ███████ █ ██   █ █  █ ████  ███ ███ █ █ ███ █ ███
 30.4 |██ ███ █████ █████████████████ ██████████████ █ █ ████████████ ███ █ █████ █████
 29.9 |██ █████████ █████████████████ ███████████████████████████████ █████ █████ █████
 29.4 |██████████████████████████████████████████████████████████████████████████ █████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms | █  3
  19 ms | ███  7
  20 ms | ██████  13
  21 ms | ████████  16
  22 ms | █████████████  26
  23 ms | █████  10
  24 ms | ██████  13
  25 ms | █████  10
  26 ms | █████  10
  27 ms | ██████  13
  28 ms | ██████  13
  29 ms | █████  11
  30 ms | █████████  19
  31 ms | ███████████████  31
  32 ms | ███████████████████████████████████████  78
  33 ms | ██████████████████████████████  60
  34 ms | ████████████████████████████████████████  81
  35 ms | █████████████  27
  36 ms | █████  10
  37 ms | ███████  14
  38 ms | ██████  13
  39 ms | ████  9
  40 ms | ███████  15
  41 ms | ████  8
  42 ms | █████  11
  43 ms | █████████  18
  44 ms | █████████  18
  45 ms | ██████████  20
  46 ms | █████  10
  47 ms | ████  8
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.80`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.25`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `32.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `31.98`, min `16.80`, p50 `29.99`, p95 `49.67`, p99 `56.60`, 1%low `18.57`, 0.1%low `16.80`, std `8.83`

**Frame time (ms)**  avg `33.39`, p50 `33.34`, p95 `47.07`, p99 `50.24`, p99.9 `56.54`, max `59.54`

**Client tick (ms)**  avg `2.80`, p95 `3.43`, max `4.37`

**Memory**  start `572 MB`, end `525 MB`, peak `979 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 39.0 |             █                                                                  
 38.1 |             █                                                                  
 37.2 |             █                                                                  
 36.3 |             █                                                                  
 35.4 |             █                        █                                 █       
 34.5 |           █ █        █        █      █  █         █         █  █       █       
 33.6 |  █    ██  █ █      █ ██       █  █   █  █         █         █  █   █   █ █     
 32.7 |████   ██  █ █ █ █  █ ███ █    █  ██  ██ █   █ █  ██     █   █  █   █   █ █     
 31.8 |████  ███  █ █ █ █  ███████ █ ███ ███ █████ ██ █ ███ █ █ █ █ █  ███ █ ███ ██ █ █
 30.9 |██████████ █ █ █ ██ █████████ ████████████████ █ ███ █ █ █████ ██████ ███ ██████
 30.0 |████████████ ███ █████████████████████████████ █████████ ████████████ ███ ██████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms | █  2
  17 ms | ████  7
  18 ms | █████  8
  19 ms | ██████  10
  20 ms | ████████████  19
  21 ms | █████████  14
  22 ms | ███████████  17
  23 ms | ██████████  16
  24 ms | ██████████  15
  25 ms | ████████  12
  26 ms | ████████  12
  27 ms | ██████  9
  28 ms | ██████████  15
  29 ms | ████████████████  25
  30 ms | ████████████████████████████████████████  63
  31 ms | █████████████  21
  32 ms | ████████████████  25
  33 ms | ████████████████████  32
  34 ms | ████████████  19
  35 ms | ████████████████████  32
  36 ms | ██████████████████████████████████████  60
  37 ms | ██████████  15
  38 ms | ██████  9
  39 ms | ██████████  15
  40 ms | ████████  12
  41 ms | ██████████  15
  42 ms | █████████  14
  43 ms | ████████  12
  44 ms | ██████████  16
  45 ms | ████████  13
  46 ms | █████████  14
  47 ms | ████████  12
  48 ms | ████  6
  49 ms | ████  6
  50 ms | █  2
  52 ms | █  2
  54 ms | █  2
  59 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `18.57`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.80`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.95`
- `preload_duration_ms` = `45.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `38.12`, min `16.12`, p50 `30.28`, p95 `84.41`, p99 `145.93`, 1%low `16.36`, 0.1%low `16.12`, std `27.94`

**Frame time (ms)**  avg `33.41`, p50 `33.02`, p95 `56.66`, p99 `59.67`, p99.9 `61.86`, max `62.05`

**Client tick (ms)**  avg `3.60`, p95 `5.00`, max `6.28`

**Memory**  start `871 MB`, end `797 MB`, peak `998 MB`, GC `10 events / 20 ms`

**FPS over sampling window (ASCII):**

```
 72.6 |                                                                       █        
 68.7 |                                                                     █ █        
 64.7 | █                                                                   █ █        
 60.8 | █                   █       █                                       █ █        
 56.8 | █                   █      ██                                      ██ █        
 52.8 | █       █           █      ██                                      ██ █        
 48.9 | █       █         █ █      ██      █                  █            ██ █        
 44.9 | █       █    █    █ █      ██   █  █                  █            ██ █        
 40.9 | █       █   ██    █ █  █   ███ ██  █   █ █  ██        █ █   █      ██ █  █ █   
 37.0 | █ ███ █ █  ███    ██████   ███ ██  ███ █ █ ███ ██ █   █ █  ██ █ █ █████  ███ █ 
 33.0 |██ ███ █████████  █████████ ███ ██ ████ █████████████ ██████████████████ ████ █ 
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   3 ms | ██  1
   5 ms | █████  3
   6 ms | ███  2
   7 ms | ███  2
   8 ms | █████████  6
   9 ms | █████████  6
  10 ms | ████████  5
  11 ms | ████████  5
  12 ms | ██████  4
  13 ms | ████████  5
  14 ms | ██  1
  15 ms | ████████████  8
  16 ms | ██████████████████████  14
  17 ms | ██████████████████████  14
  18 ms | ████████████████████  13
  19 ms | ████████████████████████████  18
  20 ms | █████████████████████████  16
  21 ms | █████████████████████████████  19
  22 ms | ████████████████████████████████  21
  23 ms | █████████████████  11
  24 ms | █████████  6
  25 ms | ███████████████  10
  26 ms | ██████████████  9
  27 ms | █████████  6
  28 ms | ██████████████  9
  29 ms | █████████████████████████  16
  30 ms | ████████████████████████████████████████  26
  31 ms | ██████████████████████████████████  22
  32 ms | ███████████████████████████████  20
  33 ms | █████████████████████████████  19
  34 ms | ████████████████████████████  18
  35 ms | ████████████████████████████████  21
  36 ms | █████████████████████████████████████  24
  37 ms | ███████████████████████  15
  38 ms | ███████████████████████  15
  39 ms | ████████████████████  13
  40 ms | █████████████████  11
  41 ms | ██████████████  9
  42 ms | ████████  5
  43 ms | █████████  6
  44 ms | ████████████████████  13
  45 ms | ████████  5
  46 ms | ████████  5
  47 ms | █████████████████  11
  48 ms | █████████████████████████  16
  49 ms | ████████████████████  13
  50 ms | ████████  5
  51 ms | █████  3
  52 ms | ███████████████  10
  53 ms | ████████████  8
  54 ms | █████████  6
  55 ms | █████████████████  11
  56 ms | ██████████████  9
  57 ms | ████████████████████  13
  58 ms | ████████████  8
  59 ms | ███  2
  60 ms | ██  1
  61 ms | █████  3
  62 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `16.12`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `37.00`
- `fps_harmonic_avg` = `29.93`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `16.36`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23509 ms  |  Sample ticks: 400

**FPS**  avg `31.53`, min `20.90`, p50 `29.76`, p95 `47.68`, p99 `52.29`, 1%low `21.10`, 0.1%low `20.90`, std `7.67`

**Frame time (ms)**  avg `33.42`, p50 `33.60`, p95 `45.51`, p99 `47.05`, p99.9 `47.63`, max `47.85`

**Client tick (ms)**  avg `0.87`, p95 `1.06`, max `1.29`

**Memory**  start `973 MB`, end `616 MB`, peak `999 MB`, GC `5 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 35.1 |                                                                     █          
 34.5 |                                       █                             █          
 33.9 |   █    ██                             █    █                        █          
 33.3 |  ██    ██                         █   █    █        █               █          
 32.8 |  ██    ██ █   █   █      ██   █   █   █    █        █               █      █   
 32.2 |  ███ █ ██ █ █ ██  █ █    ███ ██ █ █   █    █  █     █       █ █   █ █   █  ██  
 31.6 | ████ █ ██ ███ ██ ██ █ █  ████████ ██ ███   ██ ██ █  █       █ █   █ █   █  ██  
 31.0 |███████ ██████ ██ ██ ████ ████████ ██ █████ ██ ████  █ █ ███ █ ███ █ █ ████ ███ 
 30.5 |███████ ██████ ███████████████████ ██ ██████████████ ███ ███ ███████ ███████████
 29.9 |███████ ██████████████████████████ █████████████████████ ███████████████████████
 29.3 |██████████████████████████████████ █████████████████████████████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | ██  4
  19 ms | ███  5
  20 ms | ████████████  23
  21 ms | ████████████  23
  22 ms | ███████  14
  23 ms | ███████  13
  24 ms | ████████  15
  25 ms | ███████  14
  26 ms | ████████  16
  27 ms | █████████  17
  28 ms | ████████  15
  29 ms | ██████  11
  30 ms | ████████  15
  31 ms | ████████  16
  32 ms | ████████████████████████████  55
  33 ms | ████████████████████████████████████████  78
  34 ms | ███████████████████████████  53
  35 ms | ███████████  22
  36 ms | ███████  13
  37 ms | ██████████  20
  38 ms | █████████  18
  39 ms | ██████  11
  40 ms | ██████████  19
  41 ms | ██████████  19
  42 ms | ████████  15
  43 ms | ███████████  21
  44 ms | ██████████  20
  45 ms | ████████  15
  46 ms | ██████  11
  47 ms | ████  8
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `20.90`
- `part` = `1.00`
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
- `preload_duration_ms` = `71.00`
- `fps_1pct_low` = `21.10`
- `fps_harmonic_avg` = `29.92`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `31.18`, min `16.62`, p50 `30.00`, p95 `45.68`, p99 `48.97`, 1%low `20.43`, 0.1%low `16.62`, std `6.64`

**Frame time (ms)**  avg `33.40`, p50 `33.33`, p95 `45.13`, p99 `46.04`, p99.9 `52.66`, max `60.16`

**Client tick (ms)**  avg `0.47`, p95 `0.62`, max `0.73`

**Memory**  start `794 MB`, end `609 MB`, peak `997 MB`, GC `2 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 36.3 |                                                                   █            
 35.6 |                                                                   █            
 34.9 |                                                                   █            
 34.3 |                                █                   █      █       █           █
 33.6 |             █     █        █   █      █        █ █ █   █  █       █           █
 32.9 |       █ █   █ █ █ █        █   █      █        █ █ █   █  █     █ █           █
 32.2 |       █ █   █ █ █ █    █   █   █ █    █        █ █ █ █ █  █ █   █ █       █   █
 31.5 |  █  █ █ █   █ ███ █ █  █ █ ██  █ █  █ ██ █     █ █ █ █ ████ █ █ █ █       █   █
 30.9 |█ █  █ █ █ █ █ ███ █ ██ █ █ ███ █ █  █ ████ █ █ ███ █ ██████ █ █ █ █ ███   ██  █
 30.2 |██████ █ █ █ █ ███ █ ██████ ███ █ ██ █ ████████ █████ ██████ █ ███ █████████████
 29.5 |██████ █ █████████ █ █████████████████ ███████████████████████████ █████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms | █  3
  20 ms | ████  12
  21 ms | █████  18
  22 ms | █████  16
  23 ms | ██████  21
  24 ms | ███  9
  25 ms | ██  8
  26 ms | ████  13
  27 ms | ██  8
  28 ms | ████  13
  29 ms | █████  16
  30 ms | ██████  20
  31 ms | ███████████  36
  32 ms | ████████████████  54
  33 ms | ████████████████████████████████████████  132
  34 ms | ██████████████  45
  35 ms | █████  16
  36 ms | ██████  19
  37 ms | █████  16
  38 ms | █████  17
  39 ms | ████  14
  40 ms | ███  11
  41 ms | ███  10
  42 ms | ██  5
  43 ms | ███  9
  44 ms | ██████  19
  45 ms | █████████  30
  46 ms | ██  6
  47 ms |   1
  60 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `16.62`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `33.00`
- `fps_harmonic_avg` = `29.94`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `20.43`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `34.46`, min `16.13`, p50 `30.03`, p95 `59.31`, p99 `112.69`, 1%low `17.09`, 0.1%low `16.13`, std `17.21`

**Frame time (ms)**  avg `33.41`, p50 `33.30`, p95 `52.80`, p99 `57.29`, p99.9 `59.95`, max `62.00`

**Client tick (ms)**  avg `2.93`, p95 `4.73`, max `6.89`

**Memory**  start `832 MB`, end `561 MB`, peak `1020 MB`, GC `5 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 49.0 |          █                                                                     
 47.2 |          █                                                   █                 
 45.4 |          █                                             █     █                 
 43.6 |          █                            █    █           █     █ █               
 41.7 |       █  █                            █    █           █   █ █ █               
 39.9 |       █  ██ █ █                       █ █  █ █         █   █ █ █               
 38.1 | █   █ █  ██ ███                      ██ █  █ █         █  ██ █ █        █      
 36.3 | █   █ █  ██████    ██  █ █ █         ██ █  █ ███      ██  ██ ███        █      
 34.5 | █   ███  ██████    █████ █ █ █ █     ██ █  █ ████   ████ ███ ████   █   █      
 32.7 | █  █████ ██████  ███████ █ █ █ █ ██  ██ █  █ ██████ ██████████████  ██  █████ █
 30.8 |██ ██████████████ ████████████████████████ ██ ██████ ███████████████ ███ ███████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   6 ms | █  1
   7 ms | ███  3
   8 ms | ██  2
   9 ms | ██  2
  11 ms | ███  3
  12 ms | █████  5
  13 ms | ██  2
  14 ms | ██  2
  15 ms | █████  5
  16 ms | █████  5
  17 ms | █████████  9
  18 ms | ███████████████  16
  19 ms | ███████████████████████  24
  20 ms | ███████  7
  21 ms | ████████████  13
  22 ms | ██████████  11
  23 ms | ██████████  11
  24 ms | ██████████  10
  25 ms | ██████████  10
  26 ms | ████████████  13
  27 ms | ████████████████  17
  28 ms | ████████  8
  29 ms | ████████████████████████  25
  30 ms | ████████████████████████████████  34
  31 ms | ██████████████████████  23
  32 ms | ███████████████████████  24
  33 ms | ████████████████████████████████████████  42
  34 ms | ████████████████████████  25
  35 ms | ███████████████████████████████████  37
  36 ms | █████████████████████████████  30
  37 ms | ██████████  10
  38 ms | █████████████  14
  39 ms | ██████████  10
  40 ms | ███  3
  41 ms | ███████  7
  42 ms | ██████████  11
  43 ms | ████████████  13
  44 ms | █████████  9
  45 ms | ███████████  12
  46 ms | ████████████  13
  47 ms | ██████████████  15
  48 ms | ████████████  13
  49 ms | ██████████  11
  50 ms | ███  3
  51 ms | ███  3
  52 ms | ██  2
  53 ms | █████████  9
  54 ms | ██  2
  55 ms | ███  3
  56 ms | █████  5
  57 ms | █████████  9
  58 ms | █  1
  62 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.93`
- `fps_1pct_low` = `17.09`
- `block_state_changes` = `0.00`
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
- `tnt_active_p95` = `145.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `16.13`
- `preset_long` = `0.00`
- `preload_duration_ms` = `1.00`
- `tnt_spawned` = `430.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23068 ms  |  Sample ticks: 400

**FPS**  avg `33.45`, min `16.53`, p50 `30.07`, p95 `53.56`, p99 `86.44`, 1%low `16.91`, 0.1%low `16.53`, std `14.21`

**Frame time (ms)**  avg `33.39`, p50 `33.26`, p95 `49.64`, p99 `57.98`, p99.9 `60.33`, max `60.49`

**Client tick (ms)**  avg `2.50`, p95 `4.19`, max `14.67`

**Memory**  start `1014 MB`, end `541 MB`, peak `1082 MB`, GC `5 events / 18 ms`

**FPS over sampling window (ASCII):**

```
 52.3 |     █          █                                                               
 50.2 |     █          █                                                               
 48.1 |     █          █                                                               
 46.0 |     █    █     █                                                               
 43.9 |     █    █     █ █                 █                                           
 41.8 |     █    █     █ █                 █                                           
 39.7 |     █ █  █     █ █                 █              █                            
 37.5 |██  ██ █  █     █ █                 █              █                            
 35.4 |██████ █  ██    █ █  █        █     █  █     █     █   █ █    █       █         
 33.3 |██████████████  ███  █ █  █   █   █ █  █     █   ███  █████  ██ █ █   █ █ █ █   
 31.2 |███████████████████ ████████  █   █ ████████ ███████ ███████ ████ █████ █ █ ████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | ██  2
   8 ms | ███  3
  10 ms | █  1
  11 ms | ██  2
  14 ms | █  1
  15 ms | ██  2
  16 ms | ████████  9
  17 ms | ████  5
  18 ms | ██████  7
  19 ms | █████████████████  19
  20 ms | █████████████████  19
  21 ms | ██████████████  16
  22 ms | ███████████████████  21
  23 ms | ████████████████  18
  24 ms | ████████████  14
  25 ms | ██████████  11
  26 ms | █████  6
  27 ms | ██████  7
  28 ms | ██████████  11
  29 ms | █████████████████  19
  30 ms | ███████████████████  21
  31 ms | ██████████████████████████████████████  43
  32 ms | ████████████████████████████  31
  33 ms | ███████████████████████████████████████  44
  34 ms | ████████████████████████████  31
  35 ms | ████████████████████████████████████████  45
  36 ms | ████████████████  18
  37 ms | █████████  10
  38 ms | █████████  10
  39 ms | ██████████  11
  40 ms | ████  4
  41 ms | █████  6
  42 ms | ████████████  13
  43 ms | ████████████  13
  44 ms | ██████████████████  20
  45 ms | █████████████  15
  46 ms | ███████████████  17
  47 ms | ████████████  13
  48 ms | ████████  9
  49 ms | ██  2
  50 ms | ████  5
  51 ms | █  1
  52 ms | ███  3
  53 ms | ███████  8
  55 ms | ██  2
  56 ms | ██  2
  57 ms | ███  3
  58 ms | ██  2
  59 ms | █  1
  60 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.95`
- `fps_1pct_low` = `16.91`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.83`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `16.53`
- `preset_long` = `0.00`
- `preload_duration_ms` = `77.00`
- `tnt_spawned` = `430.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `42.27`, min `13.20`, p50 `30.97`, p95 `85.14`, p99 `208.77`, 1%low `13.80`, 0.1%low `13.20`, std `40.03`

**Frame time (ms)**  avg `34.18`, p50 `32.29`, p95 `62.46`, p99 `70.74`, p99.9 `74.39`, max `75.76`

**Client tick (ms)**  avg `13.68`, p95 `19.31`, max `24.26`

**Memory**  start `865 MB`, end `1057 MB`, peak `1095 MB`, GC `29 events / 102 ms`

**FPS over sampling window (ASCII):**

```
 80.6 |█                                                                               
 75.9 |█                                                                               
 71.3 |█                                                                    █   █      
 66.6 |█                                   █                                █   █      
 61.9 |█                                   █                              █ █   █      
 57.3 |█           █              █        █                       █      █ █   █      
 52.6 |█      █    █    █         █    ██  █ █    █                █      █ █   █ █    
 48.0 |█      █  ███    █         █    ██  █ █    █           █    █      █ █   █ █    
 43.3 |██     █  ███ █  █  █     ███ █ ██  █ █    █        █  ██   █      █ █   █ █ █  
 38.6 |██ █ █ █ ████ ████  █   █████ ████  █ ██   ███ ██  ███ ████ ██  ██ █████ █ ███  
 34.0 |████████ ██████████ ██████████████████████ ███████████████████████ █████████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
   3 ms | ████  3
   4 ms | ███████  5
   5 ms | ███████████  8
   6 ms | ███  2
   7 ms | █  1
   8 ms | ████  3
   9 ms | █████████  6
  11 ms | ███  2
  12 ms | ██████████  7
  13 ms | ███████  5
  14 ms | ██████████████  10
  15 ms | ██████████████████████████  18
  16 ms | ████████████████████████████████████████  28
  17 ms | ████████████████████████  17
  18 ms | █████████████████████  15
  19 ms | █████████████████████  15
  20 ms | ██████████████████████████████  21
  21 ms | ███████████████████  13
  22 ms | █████████████████  12
  23 ms | ██████████████████████████  18
  24 ms | ██████████████  10
  25 ms | ████████████████████  14
  26 ms | ███████████  8
  27 ms | ████  3
  28 ms | ██████████  7
  29 ms | ████████████████████  14
  30 ms | █████████████████  12
  31 ms | █████████████████  12
  32 ms | ███████████  8
  33 ms | ████████████████████████  17
  34 ms | ██████████████  10
  35 ms | ████████████████  11
  36 ms | █████████████  9
  37 ms | █████████████████████  15
  38 ms | ██████████████  10
  39 ms | █████████████████████  15
  40 ms | ██████████  7
  41 ms | ███████████  8
  42 ms | ████████████████  11
  43 ms | ████  3
  44 ms | ███████████  8
  45 ms | █████████  6
  46 ms | █████████████  9
  47 ms | █████████████████████  15
  48 ms | █████████  6
  49 ms | █  1
  50 ms | ██████  4
  51 ms | ██████████  7
  52 ms | ██████████  7
  53 ms | ███████  5
  54 ms | ██████████  7
  55 ms | ██████████████  10
  56 ms | ██████████████  10
  57 ms | █████████████  9
  58 ms | ███████████████████  13
  59 ms | ██████████  7
  60 ms | ████  3
  61 ms | █████████████  9
  62 ms | █████████  6
  63 ms | ███████  5
  64 ms | ███████  5
  65 ms | █  1
  66 ms | █  1
  67 ms | ███████  5
  68 ms | █  1
  69 ms | ████  3
  70 ms | ███  2
  71 ms | ████  3
  72 ms | █  1
  73 ms | █  1
  75 ms | █  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.80`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `95.00`
- `falling_blocks_landed` = `25600.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.26`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.20`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4805.80`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `43.76`, min `13.05`, p50 `30.46`, p95 `115.92`, p99 `172.51`, 1%low `13.97`, 0.1%low `13.05`, std `71.68`

**Frame time (ms)**  avg `34.39`, p50 `32.83`, p95 `62.55`, p99 `68.98`, p99.9 `74.39`, max `76.60`

**Client tick (ms)**  avg `14.36`, p95 `20.12`, max `28.91`

**Memory**  start `859 MB`, end `1035 MB`, peak `1135 MB`, GC `26 events / 91 ms`

**FPS over sampling window (ASCII):**

```
256.9 |                                                                            █   
236.1 |                                                                            █   
215.3 |                                                                            █   
194.5 |                                                                            █   
173.7 |                                                                            █   
152.9 |                                                                            █   
132.1 |                                                                            █   
111.3 |                                                                            █   
 90.5 |                                                                            █   
 69.7 |                     █ █                        █      █                    █   
 48.9 | █ ██ █  ██ ██   ███ █ █    ███ █ ██ █ █ █    █ █ ███ ██ █  ██  █ █  ████  ██  █
 28.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  1
   3 ms | ██  1
   4 ms | ██  1
   5 ms | ████████  4
   6 ms | ███████████████████████  12
   7 ms | ███████████████  8
   8 ms | ██████  3
   9 ms | █████████████  7
  10 ms | ██████  3
  11 ms | ███████████████  8
  12 ms | ████  2
  13 ms | █████████████████████  11
  14 ms | ███████████████  8
  15 ms | █████████████████████████████  15
  16 ms | ████████████████████████████████████████  21
  17 ms | █████████████████████  11
  18 ms | ███████████████████████████  14
  19 ms | █████████████████████████  13
  20 ms | █████████████████████████████  15
  21 ms | ███████████████████  10
  22 ms | ███████████  6
  23 ms | █████████████  7
  24 ms | ███████████  6
  25 ms | ███████████████████████████  14
  26 ms | ██████████████████████████████  16
  27 ms | █████████████████████  11
  28 ms | ███████████████████████  12
  29 ms | ███████████████  8
  30 ms | █████████████████████████████  15
  31 ms | █████████████████████████  13
  32 ms | ████████████████████████████████  17
  33 ms | █████████████████████████  13
  34 ms | █████████████  7
  35 ms | ██████████████████████████████████  18
  36 ms | █████████████████████  11
  37 ms | █████████████████████  11
  38 ms | ███████████████████  10
  39 ms | █████████████████████████  13
  40 ms | █████████████  7
  41 ms | █████████████████████  11
  42 ms | ██████████  5
  43 ms | ███████████████████████  12
  44 ms | ██████████  5
  45 ms | ███████████████████  10
  46 ms | ███████████████  8
  47 ms | ███████████████████  10
  48 ms | █████████████████████  11
  49 ms | ███████████  6
  50 ms | ███████████  6
  51 ms | █████████████  7
  52 ms | █████████████████████  11
  53 ms | ██████████  5
  54 ms | ████████  4
  55 ms | █████████████████████  11
  56 ms | █████████████  7
  57 ms | ██████████  5
  58 ms | █████████████  7
  59 ms | █████████████  7
  60 ms | █████████████████  9
  61 ms | █████████████  7
  62 ms | ███████████████████  10
  63 ms | ██████  3
  64 ms | ██  1
  65 ms | ████  2
  66 ms | ██████████  5
  67 ms | ██  1
  68 ms | █████████████  7
  69 ms | ██████  3
  72 ms | ████  2
  76 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.97`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `34.00`
- `falling_blocks_landed` = `20800.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.08`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.05`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4804.89`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `133.05`, min `19.80`, p50 `32.35`, p95 `367.32`, p99 `2655.15`, 1%low `20.24`, 0.1%low `19.80`, std `415.44`

**Frame time (ms)**  avg `26.74`, p50 `30.92`, p95 `44.98`, p99 `48.54`, p99.9 `50.10`, max `50.51`

**Client tick (ms)**  avg `1.75`, p95 `2.44`, max `3.06`

**Memory**  start `705 MB`, end `542 MB`, peak `1024 MB`, GC `5 events / 8 ms`

**FPS over sampling window (ASCII):**

```
876.6 |                                                                 █              
799.7 |                                                                 █              
722.7 |                                                                 █   █          
645.7 |                                                                 █   █        █ 
568.7 |                                                                 █ █ █   █    █ 
491.7 |                                                            █    █ ███ █ █    █ 
414.7 |                                                            █   ██ ███ ███  █ █ 
337.7 |                                                            █  ███ ███ ███  █ █ 
260.7 |                                                            █  ███ ███████ ██ █ 
183.8 |                                                            ██ ██████████████ ██
106.8 |                                                            ████████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████  26
   1 ms | ████  8
   2 ms | ██  5
   3 ms | ███  6
   4 ms | █  2
   5 ms | █  2
   6 ms |   1
   7 ms | ███  7
   8 ms | ████████████████████████████████████████  81
   9 ms | ██  4
  10 ms |   1
  12 ms | █  2
  13 ms | ████  9
  14 ms | ███  7
  15 ms | ███████  15
  16 ms | ██████  13
  17 ms | ██  5
  18 ms | ███  7
  19 ms | ███████  14
  20 ms | ██████████  21
  21 ms | ███████  14
  22 ms | █████  11
  23 ms | ███████  14
  24 ms | ██████  13
  25 ms | █████████  18
  26 ms | ██████  12
  27 ms | ██  5
  28 ms | ████  9
  29 ms | ████████  16
  30 ms | █████████████  27
  31 ms | ████████████████████████  49
  32 ms | ████████████████  33
  33 ms | ████████████████████████  49
  34 ms | ███████████████  31
  35 ms | ███████████████████████  46
  36 ms | ████████████  24
  37 ms | ███████  14
  38 ms | █████  11
  39 ms | ██████  12
  40 ms | ██████  12
  41 ms | █████  11
  42 ms | █████  10
  43 ms | █████████  19
  44 ms | ███████  14
  45 ms | ██████  13
  46 ms | ███  7
  47 ms | ███  7
  48 ms | ███  6
  49 ms | ██  4
  50 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `20.24`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `69.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `37.40`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `19.80`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.24`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `363.79`, min `39.81`, p50 `118.75`, p95 `2002.76`, p99 `2796.15`, 1%low `44.02`, 0.1%low `40.86`, std `624.27`

**Frame time (ms)**  avg `9.43`, p50 `8.42`, p95 `19.32`, p99 `21.83`, p99.9 `23.38`, max `25.12`

**Client tick (ms)**  avg `1.68`, p95 `2.29`, max `3.11`

**Memory**  start `720 MB`, end `580 MB`, peak `1109 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
668.6 |                                                                      █         
622.6 |                                                               █      █        █
576.7 | █                                                             █     ██ █   ██ █
530.7 |██                                                         █   █     ██ █   ██ █
484.8 |██ ██                                    █           █ █   █ █ █  ███████   ██ █
438.8 |██ ██                                    █   █       █ █  ██ █ █ ████████   ██ █
392.9 |██ ███                                   █ █ █ ███████ ██ ██ █ █ █████████  ██ █
346.9 |██ ███                     █    █   ██ █ █████████████████████ ███████████ █████
300.9 |██ ███ █    █     ██    █  █  ████████████████████████████████████████████ █████
255.0 |█████████ ██████  ███  ███ ██ ██████████████████████████████████████████████████
209.0 |█████████████████ ███  █████████████████████████████████████████████████████████
163.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████  273
   1 ms | ██████  114
   2 ms | ██  43
   3 ms | █  9
   4 ms |   3
   5 ms | █  10
   6 ms | ███████  120
   7 ms | ██  35
   8 ms | ████████████████████████████████████████  705
   9 ms | ██  35
  10 ms | ███████  130
  11 ms |   7
  12 ms | █  13
  13 ms | ███  56
  14 ms | █████  91
  15 ms | ██████  108
  16 ms | ██████  101
  17 ms | █████  81
  18 ms | ████  69
  19 ms | ██  37
  20 ms | ██  37
  21 ms | █  25
  22 ms | █  15
  23 ms |   4
  25 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `44.02`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `72.00`
- `falling_blocks_landed` = `3871.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `106.09`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `40.86`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.66`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `274.53`, min `20.97`, p50 `117.96`, p95 `1350.04`, p99 `1579.26`, 1%low `22.22`, 0.1%low `21.17`, std `418.31`

**Frame time (ms)**  avg `11.79`, p50 `8.48`, p95 `33.66`, p99 `43.28`, p99.9 `46.19`, max `47.70`

**Client tick (ms)**  avg `0.58`, p95 `0.71`, max `6.63`

**Memory**  start `677 MB`, end `866 MB`, peak `1117 MB`, GC `1 events / 5 ms`

**FPS over sampling window (ASCII):**

```
426.4 |                     █                                                          
390.4 |             █      ██                                   █                      
354.4 | █    █   █  █      ██      █     █         █  ██    ██  █    █   █             
318.3 | ██ █ ███ █ █████   █████   ██ █ ███  █  █  █  ████████  █ █  █   ██   █        
282.3 |███████████ █████  ███████████ █ ██████ ██  █ ███████████████ █  ███  ██        
246.3 |███████████████████████████████████████ ██  ████████████████████████ ███        
210.3 |████████████████████████████████████████████████████████████████████████        
174.2 |████████████████████████████████████████████████████████████████████████        
138.2 |████████████████████████████████████████████████████████████████████████        
102.2 |████████████████████████████████████████████████████████████████████████        
 66.1 |█████████████████████████████████████████████████████████████████████████       
 30.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████  195
   1 ms | ███████  98
   2 ms | ██  26
   3 ms |   6
   4 ms |   1
   6 ms |   2
   7 ms | █████████  116
   8 ms | ████████████████████████████████████████  545
   9 ms | ██████  78
  10 ms |   1
  12 ms |   5
  13 ms | █  20
  14 ms | ██████  75
  15 ms | █████████  120
  16 ms | ██████  87
  17 ms | ████  55
  18 ms | ██  25
  19 ms | ██  30
  20 ms | ██  23
  21 ms | █  15
  22 ms |   6
  23 ms | █  8
  24 ms |   3
  25 ms |   2
  26 ms |   3
  27 ms |   5
  28 ms |   3
  29 ms |   5
  30 ms | █  7
  31 ms | █  7
  32 ms | █  20
  33 ms | ██  28
  34 ms | ██  24
  35 ms |   6
  36 ms | █  7
  37 ms |   6
  38 ms |   1
  39 ms |   3
  40 ms |   4
  41 ms |   3
  42 ms |   3
  43 ms |   5
  44 ms |   6
  45 ms |   6
  46 ms |   1
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `84.80`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `21.17`
- `seed` = `5099.00`
- `preload_duration_ms` = `54.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `22.22`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `31.34`, min `18.47`, p50 `29.89`, p95 `47.57`, p99 `51.33`, 1%low `20.59`, 0.1%low `18.47`, std `7.19`

**Frame time (ms)**  avg `33.39`, p50 `33.45`, p95 `45.41`, p99 `47.00`, p99.9 `50.32`, max `54.15`

**Client tick (ms)**  avg `0.26`, p95 `0.31`, max `0.38`

**Memory**  start `1103 MB`, end `641 MB`, peak `1127 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 34.2 |                                             █                                  
 33.7 |               █                             █     █                    █  █    
 33.2 |               █  █   █                      █ █   █     █    █         █  █    
 32.7 |               █  █ █ █  █ █ █               █ █   █ █   █    █         █  █    
 32.3 |        █      █  █ █ █  █ █ █   ██        █ █ █   █ █   █    █      █  █ ██ ██ 
 31.8 |      █ █      ██ ███ █  █ █ █   ██   ██   █ █ █ █ █ █   █    █ █    ██ ███████ 
 31.3 |     █████     ██ █████  █ █ █ ████  ███ █ ███ █ █ █ █   █ █  █ ██  ███ ███████ 
 30.8 |███ ██████ █ █ ██ █████  █ █ ███████████ █████ █ █ █ █ ███ █  █ ███████ ████████
 30.3 |███ ████████ ████ █████  █ █ █████████████████ █ █ ███ █████ ██ ████████████████
 29.8 |███ █████████████ ████████ █ █████████████████ █████████████████████████████████
 29.3 |█████████████████ ██████████ █████████████████ █████████████████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  3
  19 ms | ██  10
  20 ms | ████  15
  21 ms | █████  21
  22 ms | ███  13
  23 ms | ██  10
  24 ms | ███  12
  25 ms | ██  10
  26 ms | ███  11
  27 ms | ███  13
  28 ms | ██  8
  29 ms | ███  14
  30 ms | ████  15
  31 ms | █████  22
  32 ms | ████████████  48
  33 ms | ████████████████████████████████████████  163
  34 ms | █████████  38
  35 ms | ████  17
  36 ms | █████  20
  37 ms | ███  13
  38 ms | ███  13
  39 ms | ███  11
  40 ms | ██  9
  41 ms | ██  10
  42 ms | ███  13
  43 ms | ███  11
  44 ms | ███  11
  45 ms | ██████  24
  46 ms | ████  15
  47 ms | █  5
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.59`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `18.47`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `57.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `31.21`, min `20.45`, p50 `29.80`, p95 `45.99`, p99 `50.50`, 1%low `20.86`, 0.1%low `20.45`, std `6.81`

**Frame time (ms)**  avg `33.39`, p50 `33.56`, p95 `44.89`, p99 `46.62`, p99.9 `48.75`, max `48.91`

**Client tick (ms)**  avg `0.23`, p95 `0.28`, max `0.34`

**Memory**  start `511 MB`, end `566 MB`, peak `1091 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                    █                                                           
 34.2 |                    █                                                           
 33.7 |        █       █   █                                         █      █       █  
 33.2 | █      █       █   █           █        █                    ██     █       █  
 32.6 |██      █     █ █   █       █   █   █    █                    ██   █ █    █  █  
 32.1 |██  █ █ █   █ █ █ █ █       █ █ █   █   ██           █ █   █ ███   █ █    █ ██  
 31.6 |██  █ █ █   █ █ █ █ █  ██ █ █ █ █   █   ██ █    █  █ █ █   █ ███ █ █ █ █  ████  
 31.1 |██ ██ █ ██  █ █ █ █ █ █████ █ █ ███ █   ████ █  █  █ █ █ █ █ ███ █ █ █ █  ████  
 30.5 |█████ █████ █ █ ███ ███████ ███ ███ ██  ████ ██ ██ ███ █ █ █████ █ █ █ ██ █████ 
 30.0 |█████ █████ █ █████ ███████ ███ ███ ██ ███████████ ███ ███ ███████ ███ ████████ 
 29.5 |█████ ████████████████████████████████████████████ ███ ███ █████████████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  4
  19 ms | ██  8
  20 ms | ███  13
  21 ms | ██  7
  22 ms | ████  16
  23 ms | ████  15
  24 ms | ████  14
  25 ms | ████  16
  26 ms | ██  9
  27 ms | ████  15
  28 ms | ████  15
  29 ms | ███  10
  30 ms | ███  11
  31 ms | █████  21
  32 ms | ██████████  40
  33 ms | ████████████████████████████████████████  157
  34 ms | ██████████████  54
  35 ms | ███████  27
  36 ms | ██  9
  37 ms | ███  12
  38 ms | █████  19
  39 ms | ██  9
  40 ms | ███  10
  41 ms | ████  15
  42 ms | █████  20
  43 ms | ████  14
  44 ms | ███  12
  45 ms | ███  12
  46 ms | ███  11
  47 ms |   1
  48 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2240.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `20.45`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `29.95`
- `preload_duration_ms` = `61.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.86`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `31.27`, min `21.00`, p50 `29.94`, p95 `46.00`, p99 `49.43`, 1%low `21.19`, 0.1%low `21.00`, std `6.88`

**Frame time (ms)**  avg `33.38`, p50 `33.40`, p95 `45.26`, p99 `46.59`, p99.9 `47.56`, max `47.62`

**Client tick (ms)**  avg `0.26`, p95 `0.36`, max `0.47`

**Memory**  start `966 MB`, end `854 MB`, peak `1126 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 34.2 |                                                                        █       
 33.8 |█             █              █                                          █       
 33.3 |█             █              █   █                                      █       
 32.8 |█   █         █ █   ██   █ █ █   █     █ █        █   █     █ █   █     █       
 32.3 |█   █ █   █   █ █   ██   █ █ █  ██     █ █  █    ██   █   █ █ █   █     █  █ █  
 31.8 |██  █ █   █   █ █   ██ █ █ █ █  ██     █ ██ █    ███  █   █ █ █   █     █ ██ █  
 31.4 |███ █ █ █ █   █ ██  ██ █ █ █ █  ██ █ █ █ ██ █   ████  █ █ █ █ █   █     █ ██ █  
 30.9 |███████ █ █ █ █ ██ ███ █ █ █ █  ████ █ ████ █   ████  █ █ █ █ █   █   █ █ ██ ██ 
 30.4 |███████ █ ███ █ ██████ █ █ █████████ ████████ █ █████ ███ █ █ ███ █   █ █ ██████
 29.9 |█████████████ █ ██████ ███ █████████ ████████ █ █████████ █████████████ ████████
 29.4 |█████████████ █ ██████████ ████████████████████████████████████████████ ████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | ██  6
  20 ms | ████  13
  21 ms | ██████  19
  22 ms | ███████  22
  23 ms | ███  10
  24 ms | █████  18
  25 ms | ████  14
  26 ms | █  4
  27 ms | ████  12
  28 ms | ███  11
  29 ms | ██  8
  30 ms | ███████  24
  31 ms | ███████  24
  32 ms | ████████████████  53
  33 ms | ████████████████████████████████████████  134
  34 ms | ████████████████  55
  35 ms | ██████  20
  36 ms | ████  12
  37 ms | ████  14
  38 ms | ██  8
  39 ms | ████  13
  40 ms | ████  12
  41 ms | ████  12
  42 ms | █████  17
  43 ms | ████  14
  44 ms | ████  14
  45 ms | ██████  19
  46 ms | ████  12
  47 ms | █  5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `29.96`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `21.00`
- `seed` = `4027.00`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `21.19`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `31.05`, min `20.65`, p50 `30.01`, p95 `45.75`, p99 `49.10`, 1%low `21.06`, 0.1%low `20.65`, std `6.29`

**Frame time (ms)**  avg `33.39`, p50 `33.32`, p95 `45.29`, p99 `46.53`, p99.9 `48.29`, max `48.43`

**Client tick (ms)**  avg `0.26`, p95 `0.33`, max `0.39`

**Memory**  start `573 MB`, end `757 MB`, peak `757 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 34.3 |                                                  █                             
 33.8 |      █             █                             █           █                 
 33.3 |      █       █     █   █                         █           █      █          
 32.8 |      █       █     █   █ █   █                   █           █      █       █  
 32.3 |    █ █       █  █  █   █ █   █     █             █           █      █    █  █  
 31.8 |█ █ █ █     █ █  █  █ █ █ █ █ █   █ █   █  ██     █ █     █   █     ██    █  █ █
 31.4 |█ █ █ █     █ █  █  █ █ █ █ █ █   █ █ █ ██ ███ █  █ █   █ █   █ █  ████ █ █  █ █
 30.9 |█████ █   █ █ █  █  ███ █ █ █ ██  ████████ ███ █  █ █ █ █ █   █ █  ████ █ █  █ █
 30.4 |█████ █ █ █ █ █ ███ ███ █ ███ ███ ████████████ █  █ █████ █ ███ █  ████ ███  █ █
 29.9 |█████ █████ █ █████ ███ █ ███████████████████████ █ █████ ████████ ███████████ █
 29.4 |█████ █████████████ █████████████████████████████ ████████████████ █████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   2
  19 ms |   2
  20 ms | ██  11
  21 ms | ███  16
  22 ms | ███  16
  23 ms | ██  8
  24 ms | ██  11
  25 ms | ██  10
  26 ms | ███  16
  27 ms | ███  14
  28 ms | █  7
  29 ms | ██  8
  30 ms | ████  17
  31 ms | ██████  28
  32 ms | █████████████  61
  33 ms | ████████████████████████████████████████  190
  34 ms | ██████  29
  35 ms | ████  19
  36 ms | ███  14
  37 ms | █  5
  38 ms | ███  14
  39 ms | ███  15
  40 ms | ██  11
  41 ms | ██  10
  42 ms | ██  10
  43 ms | ██  8
  44 ms | ███  12
  45 ms | ████  19
  46 ms | ███  12
  47 ms |   2
  48 ms |   2
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
- `fps_harmonic_avg` = `29.95`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `21.06`
- `fps_0p1pct_low` = `20.65`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `93.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `32.75`, min `15.30`, p50 `29.65`, p95 `49.16`, p99 `53.85`, 1%low `18.97`, 0.1%low `15.30`, std `23.73`

**Frame time (ms)**  avg `33.46`, p50 `33.72`, p95 `46.03`, p99 `47.92`, p99.9 `56.49`, max `65.38`

**Client tick (ms)**  avg `0.36`, p95 `0.55`, max `8.40`

**Memory**  start `1021 MB`, end `888 MB`, peak `1436 MB`, GC `45 events / 216 ms`

**FPS over sampling window (ASCII):**

```
103.8 |                               █                                                
 97.0 |                               █                                                
 90.2 |                               █                                                
 83.3 |                               █                                                
 76.5 |                               █                                                
 69.7 |                               █                                                
 62.9 |                               █                                                
 56.0 |                               █                                                
 49.2 |                               █                                         █      
 42.4 |                               █                                         █      
 35.5 | █  ██  █      █  █ █      █ ████ █ █              █ █     █  █ █ █  █   █ █   █
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   5 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | █  1
  18 ms | █████  8
  19 ms | ████████  15
  20 ms | ██████████  17
  21 ms | ███████████  20
  22 ms | ██████████  17
  23 ms | ████████  14
  24 ms | █████  9
  25 ms | ████████  15
  26 ms | ███████  12
  27 ms | ██████  11
  28 ms | ██████████  17
  29 ms | █████  8
  30 ms | ███████  12
  31 ms | ████████  14
  32 ms | █████████████████████████████  51
  33 ms | ████████████████████████████████████████  71
  34 ms | █████████████████████████  44
  35 ms | ███████████████████████  40
  36 ms | ████████████  22
  37 ms | ████████████  21
  38 ms | ███████████  19
  39 ms | ███████  12
  40 ms | ████████████  22
  41 ms | ██████  11
  42 ms | █████  9
  43 ms | ██████  10
  44 ms | ████████████  21
  45 ms | ███████████  19
  46 ms | ████████  14
  47 ms | ███████  12
  49 ms | █  1
  50 ms | ██  4
  65 ms | █  1
```

**Extras:**

- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.89`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.30`
- `seed` = `7411.00`
- `preload_duration_ms` = `48.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `15.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `18.97`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23442 ms  |  Sample ticks: 400

**FPS**  avg `31.62`, min `17.08`, p50 `29.97`, p95 `47.62`, p99 `52.66`, 1%low `18.77`, 0.1%low `17.08`, std `9.14`

**Frame time (ms)**  avg `33.48`, p50 `33.36`, p95 `46.00`, p99 `48.89`, p99.9 `57.04`, max `58.54`

**Client tick (ms)**  avg `0.35`, p95 `0.52`, max `3.21`

**Memory**  start `1115 MB`, end `1334 MB`, peak `1824 MB`, GC `33 events / 206 ms`

**FPS over sampling window (ASCII):**

```
 45.6 |                                        █                                       
 44.1 |                                        █                                       
 42.6 |                                        █                                       
 41.0 |               █                        █                                       
 39.5 |               █                        █                                       
 38.0 |               █                        █                                       
 36.5 |               █                        █      █                                
 35.0 | █             █                        █      █ █                              
 33.5 | █    █        █          █   █         █  █   ███              █    █     █    
 32.0 | █    █████  █ █ ██       █ █ █    █ █ ███ █ █ ████  ██ █   █ █ █ █ ████ ███   █
 30.5 |███████████ ████████████ ██ ████████ █████████ ████████████████████ ████ █████ █
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms |   1
   9 ms |   1
  16 ms | █  2
  17 ms |   1
  18 ms |   1
  19 ms | ███  7
  20 ms | ████████  17
  21 ms | ███████  15
  22 ms | █████  10
  23 ms | █████████  18
  24 ms | ███████  14
  25 ms | ████████  16
  26 ms | █████████  18
  27 ms | ████  8
  28 ms | █████  10
  29 ms | ██████████  20
  30 ms | ███████████  22
  31 ms | █████████████  28
  32 ms | ████████████████████████████  59
  33 ms | ████████████████████████████████████████  83
  34 ms | ███████████████████████  48
  35 ms | ███████████  22
  36 ms | ████████  16
  37 ms | █████████  19
  38 ms | █████  10
  39 ms | █████  10
  40 ms | █████████  19
  41 ms | ██████  13
  42 ms | ███████  15
  43 ms | ██████  13
  44 ms | ████████  17
  45 ms | ███████  14
  46 ms | ████████  17
  47 ms | █  3
  48 ms | ██  4
  50 ms | █  2
  51 ms |   1
  52 ms |   1
  56 ms |   1
  58 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.87`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.08`
- `seed` = `7417.00`
- `preload_duration_ms` = `401.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `18.77`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `31.78`, min `13.96`, p50 `29.62`, p95 `49.33`, p99 `55.51`, 1%low `17.14`, 0.1%low `13.96`, std `8.67`

**Frame time (ms)**  avg `33.55`, p50 `33.76`, p95 `46.29`, p99 `50.26`, p99.9 `69.41`, max `71.62`

**Client tick (ms)**  avg `0.32`, p95 `0.50`, max `0.81`

**Memory**  start `1917 MB`, end `967 MB`, peak `2126 MB`, GC `26 events / 197 ms`

**FPS over sampling window (ASCII):**

```
 36.0 |      █                                                                         
 35.3 |   █  █            █        █                                                █  
 34.6 |   █  █       █    █ █      █   █ █                          ██   █       █  █  
 33.9 |   █  █       █ █  █ █      █   █ █                          ██   █     █ █ ██  
 33.2 |   █  █       █ █  █ █     ██   █ █      █                █  ██   █ █   █ █ ███ 
 32.6 |   █  ██      █ ██ █ █     ██   █ █      █             █  ██ ██   █ █ █ █ █ ███ 
 31.9 | ███  ██      █ ██ █ ██    ██ █ █ █ █ █  █    █   █    █████ ████ █ █ ███ █ ███ 
 31.2 | ███  ████ █  █ ██ █ ████  ██ █ █ █ ██████ █ ██ █ █  █ █████ ████ █ █ ███ █ ███ 
 30.5 |████  ████ ██ ████ ██████  ██ ████████████ ████ █ ██████████ ████ █ █ ███ ██████
 29.8 |█████ ████████████████████████████████████ ████ ████████████ ████ █ ████████████
 29.1 |█████████████████████████████████████████████████████████████████ ██████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms | █  2
  15 ms | █  1
  16 ms | █  1
  17 ms | █  2
  18 ms | ██████  9
  19 ms | ███████  11
  20 ms | █████████████  20
  21 ms | ████████  13
  22 ms | ██████████████  22
  23 ms | ████████  12
  24 ms | ██████████  16
  25 ms | ███████  11
  26 ms | ████████  13
  27 ms | █████████  14
  28 ms | ███████  11
  29 ms | ████████  12
  30 ms | █████████  14
  31 ms | █████████  14
  32 ms | ██████████████████████████████████  53
  33 ms | ████████████████████████████████████████  63
  34 ms | ███████████████████████████████████████  62
  35 ms | █████████████  21
  36 ms | █████████████████  27
  37 ms | ████████  13
  38 ms | ██████████  15
  39 ms | █████████████  20
  40 ms | ██████████  16
  41 ms | ██████  9
  42 ms | ███████████  17
  43 ms | ██████████  15
  44 ms | ██████████  16
  45 ms | ██████████  15
  46 ms | ██████████  16
  47 ms | ██████  9
  48 ms | █  1
  49 ms | ██  3
  50 ms | █  1
  51 ms | █  1
  52 ms | █  2
  54 ms | █  1
  67 ms | █  1
  71 ms | █  1
```

**Extras:**

- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.96`
- `seed` = `7433.00`
- `preload_duration_ms` = `63.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `17.14`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23066 ms  |  Sample ticks: 400

**FPS**  avg `31.57`, min `16.22`, p50 `29.85`, p95 `48.07`, p99 `52.28`, 1%low `18.62`, 0.1%low `16.22`, std `8.01`

**Frame time (ms)**  avg `33.49`, p50 `33.50`, p95 `45.70`, p99 `48.08`, p99.9 `59.13`, max `61.65`

**Client tick (ms)**  avg `0.33`, p95 `0.46`, max `3.03`

**Memory**  start `1834 MB`, end `1757 MB`, peak `2224 MB`, GC `25 events / 194 ms`

**FPS over sampling window (ASCII):**

```
 35.0 |                                                                       █        
 34.5 |         █                               █                             █        
 34.0 |         █             █       █         █                             █        
 33.5 |         █       █     █     █ █  █      █  █               █  █       █    █   
 33.0 |         █       █     █   █ █ █  █     ███ █         ██    █  █       █    ██  
 32.5 |  ██     █ █     █     █   █ █ █  ██    ███ █       █ ██    █  █       █    ██  
 32.0 |  ███    █ █   ███   █ █ █ ███ █  ███ █ ███ █   █   █ ██    █  █    ██ █    ██  
 31.5 |██████   █ █ █ ████  █ █ █ ███ █  ███ █ ███ █   █  ██ ██    █  █ █  ██ █    ██  
 31.0 |██████  ██ █ █ ████ ████ █ ███ █ ████ █████ █ ███ ███ ██  ███ ██ █████ █ ██ ████
 30.5 |██████████ █ █ █████████ ███████ ████ █████ █████████ ███ ██████ ███████ ██ ████
 30.0 |██████████ █ ███████████████████ ████ █████ ████████████████████████████ ███████
 29.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms | █  1
  17 ms | █  2
  18 ms | ██  3
  19 ms | ███  6
  20 ms | ████████████  21
  21 ms | ████████████  21
  22 ms | ██████████  18
  23 ms | ████████  14
  24 ms | ██████████  18
  25 ms | █████  9
  26 ms | ████████  15
  27 ms | █████  9
  28 ms | █████████  16
  29 ms | ██████  10
  30 ms | █████████  16
  31 ms | ████████████████  28
  32 ms | ██████████████████████████████  53
  33 ms | ████████████████████████████████████████  71
  34 ms | ██████████████████████████  47
  35 ms | █████████████████  31
  36 ms | ███████████  19
  37 ms | ██████████  17
  38 ms | █████████  16
  39 ms | ████████████  21
  40 ms | ███████  13
  41 ms | █████  8
  42 ms | ██████████  17
  43 ms | █████████  16
  44 ms | ████████  15
  45 ms | ████████████  22
  46 ms | ██████  10
  47 ms | ████  7
  48 ms | █  2
  50 ms | █  1
  51 ms | █  1
  52 ms | █  1
  57 ms | █  1
  61 ms | █  1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.22`
- `seed` = `7451.00`
- `preload_duration_ms` = `69.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `18.62`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `31.44`, min `18.22`, p50 `29.61`, p95 `47.78`, p99 `53.18`, 1%low `19.52`, 0.1%low `18.22`, std `7.79`

**Frame time (ms)**  avg `33.56`, p50 `33.77`, p95 `46.02`, p99 `48.74`, p99.9 `53.95`, max `54.90`

**Client tick (ms)**  avg `0.31`, p95 `0.47`, max `0.69`

**Memory**  start `1768 MB`, end `1124 MB`, peak `2352 MB`, GC `21 events / 167 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                                                          █                   █ 
 34.2 |                               █            █ █       █   █                   █ 
 33.7 |                    █ █    █   █            █ █    █  █   █                   █ 
 33.2 |                    █ █    █ █ █            █ █    █  █   █                   █ 
 32.6 |     █   █ █ █      █ █    █ █ █ █  █     █ █ █  █ █  █   █     █             █ 
 32.1 | █   █ █ █ █ █    █ █ █ █  █ █ █ █  █   █ ███ █  █ █  █   █ █  ██ ██      █ █ █ 
 31.6 | █   █ █ ███ █  █ ███ █ █ ██ █ █ █  █ █ █ ███ █  █ █████  █ █  ██ ██      █ █ █ 
 31.0 | █ █ █ █ █████ ██ ███ █ █ ██ █ █ ██ █ █ █ ███ █ ██ █████  ███  █████      █ █ █ 
 30.5 | █████████████ ██ ███ █ █ ██ █ ████ █ █ █████ ████ ██████████  ██████  █  █ ████
 30.0 |███████████████████████ █ ██ ██████████ █████ ████████████████ ██████ █████ ████
 29.4 |█████████████████████████ █████████████████████████████████████████████████ ████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | ██  3
  18 ms | ██  4
  19 ms | ████  8
  20 ms | ██████████  18
  21 ms | ████████  15
  22 ms | ████████████  22
  23 ms | ███████  13
  24 ms | ██████  12
  25 ms | ██████  11
  26 ms | ███████  13
  27 ms | █████  10
  28 ms | ██████████  19
  29 ms | █████████  17
  30 ms | ████████  15
  31 ms | █████████████  24
  32 ms | ███████████████████████  42
  33 ms | ████████████████████████████████████████  74
  34 ms | ███████████████████████████████████  64
  35 ms | ████████████  22
  36 ms | ████████████  22
  37 ms | ████████  15
  38 ms | ███████████  21
  39 ms | ██████████  19
  40 ms | ███████  13
  41 ms | ████████  14
  42 ms | ███████  13
  43 ms | ████████  14
  44 ms | ████████  14
  45 ms | ████████  14
  46 ms | ██████  11
  47 ms | ███████  13
  48 ms | ██  3
  49 ms | █  1
  52 ms | █  1
  53 ms | █  1
  54 ms | █  1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.22`
- `seed` = `7457.00`
- `preload_duration_ms` = `66.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-47.00`
- `entity_count_sample_start` = `48.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `19.52`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24282 ms  |  Sample ticks: 400

**FPS**  avg `31.66`, min `17.51`, p50 `29.72`, p95 `48.41`, p99 `53.86`, 1%low `18.74`, 0.1%low `17.51`, std `8.27`

**Frame time (ms)**  avg `33.48`, p50 `33.65`, p95 `46.18`, p99 `50.72`, p99.9 `55.39`, max `57.11`

**Client tick (ms)**  avg `0.34`, p95 `0.45`, max `2.10`

**Memory**  start `955 MB`, end `1130 MB`, peak `2316 MB`, GC `22 events / 160 ms`

**FPS over sampling window (ASCII):**

```
 36.0 |                                                         █                 █    
 35.3 |                      █                                  █          █      █    
 34.7 |                 █    █            █       █             █        █ █      █    
 34.0 |                 █    █            █      ██         █   █        █ █      █    
 33.3 |          █      █    █       █    █ █    ██         █ █ █    █ █ █ █    █ █    
 32.6 |        █ █    █ █    █ █     █  █ █ █ █  ██       █ █ █ █    █ █ █ █    █ █    
 31.9 | █  █   ███    █ ███  █ █     █ ██ █ ███  ██  █  █ █ █ █ █    █ █ █ █    █ █    
 31.2 | ██ █   ███   ██ ████ █ ██ █  ████ █ ████ ███ █ ██ ███ █ █  █ █ █ █ ███  ███  █ 
 30.6 |███ ██  █████████████ ██████ █████ █ █████████████ █████ ████ █ ███ ███  ███ ███
 29.9 |███ ███ █████████████ ████████████ █████████████████████ ██████ ███ ████████████
 29.2 |█████████████████████ █████████████████████████████████████████████ ████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  12 ms | █  1
  18 ms | █████  9
  19 ms | ██████  11
  20 ms | ██████████  17
  21 ms | ████████  15
  22 ms | ████████████  22
  23 ms | ███████  12
  24 ms | ███████  13
  25 ms | ██████████  18
  26 ms | █████  8
  27 ms | ████████  14
  28 ms | ████████  14
  29 ms | ███████  12
  30 ms | █████████  16
  31 ms | ███████████  20
  32 ms | ████████████████████████████  49
  33 ms | ████████████████████████████████████████  71
  34 ms | ████████████████████████████  50
  35 ms | ██████████████████████  39
  36 ms | ██████████████  24
  37 ms | ████████  15
  38 ms | ████████  14
  39 ms | ████████████  21
  40 ms | ██████  11
  41 ms | ████████  14
  42 ms | █████  9
  43 ms | ████████  15
  44 ms | ███████  13
  45 ms | ██████████  17
  46 ms | ███████  13
  47 ms | ██  4
  48 ms | ████  7
  49 ms | █  2
  50 ms | █  1
  51 ms | █  2
  52 ms | █  1
  53 ms | █  1
  54 ms | █  1
  57 ms | █  1
```

**Extras:**

- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.87`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.51`
- `seed` = `7477.00`
- `preload_duration_ms` = `1238.00`
- `entity_count_sample_end` = `3.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `18.74`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `31.98`, min `16.49`, p50 `29.80`, p95 `49.77`, p99 `55.18`, 1%low `18.29`, 0.1%low `16.49`, std `11.32`

**Frame time (ms)**  avg `33.56`, p50 `33.55`, p95 `46.00`, p99 `49.15`, p99.9 `60.30`, max `60.63`

**Client tick (ms)**  avg `0.32`, p95 `0.53`, max `1.25`

**Memory**  start `1283 MB`, end `1362 MB`, peak `2299 MB`, GC `21 events / 158 ms`

**FPS over sampling window (ASCII):**

```
 48.7 |            █                                 █                                 
 46.8 |            █                                 █                                 
 45.0 |            █                                 █                                 
 43.1 |            █                                 █                                 
 41.2 |            █                                 █                                 
 39.4 |            █                                 █                                 
 37.5 |            █                                 █                                 
 35.6 |        █   █                         █       █             █                   
 33.7 |   ██ █ █ █ █ ██ █ █ █ █     █     █  █   █ █ █  █          █       █       █   
 31.9 |██ ██ █ ███ █ ██ █ █ █ █████ █ █  ███ █ █████ █  █ █  ███ █ █ █ █ █ █ █ █ ████ █
 30.0 |███████ █████ ██████████████ ███████████████████ ███████████████████████████████
 28.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   1
   6 ms |   1
  16 ms |   1
  17 ms | █  3
  18 ms | ██  5
  19 ms | ███████  17
  20 ms | ███████  17
  21 ms | ████████  19
  22 ms | ████  10
  23 ms | ██████  15
  24 ms | ██████  13
  25 ms | █████  11
  26 ms | ████  10
  27 ms | ██████  13
  28 ms | █████  11
  29 ms | ████  10
  30 ms | ███  6
  31 ms | █████████  21
  32 ms | █████████████████████████  59
  33 ms | ████████████████████████████████████████  94
  34 ms | █████████████████████  50
  35 ms | ████████████  29
  36 ms | ██████  13
  37 ms | ██████  13
  38 ms | █████  11
  39 ms | █████████  20
  40 ms | █████  12
  41 ms | █████  11
  42 ms | ██████  15
  43 ms | ██████  13
  44 ms | ██████████  23
  45 ms | ████████  19
  46 ms | ██████  13
  47 ms | ███  6
  48 ms | █  3
  49 ms | ██  4
  50 ms |   1
  57 ms |   1
  60 ms | █  2
```

**Extras:**

- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.49`
- `seed` = `7481.00`
- `preload_duration_ms` = `70.00`
- `entity_count_sample_end` = `7.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-15.00`
- `entity_count_sample_start` = `22.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `18.29`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24743 ms  |  Sample ticks: 400

**FPS**  avg `31.99`, min `17.22`, p50 `29.66`, p95 `49.76`, p99 `57.22`, 1%low `18.59`, 0.1%low `17.22`, std `9.45`

**Frame time (ms)**  avg `33.48`, p50 `33.71`, p95 `46.28`, p99 `51.83`, p99.9 `55.72`, max `58.07`

**Client tick (ms)**  avg `0.31`, p95 `0.47`, max `0.85`

**Memory**  start `1584 MB`, end `1941 MB`, peak `2218 MB`, GC `25 events / 184 ms`

**FPS over sampling window (ASCII):**

```
 40.8 |                            █                                                   
 39.7 |                            █                                                   
 38.6 |                            █                                     █             
 37.5 |                            █                                     █             
 36.4 |                            █                                     █       █     
 35.3 |       █                  █ █                                     █       █     
 34.2 |       █                █ █ █   █                █            █   █       █     
 33.1 |       ██               █ █ █   █ █  █ ████  █   ██   █   █ █ █ █ ██   █  █   █ 
 32.0 |█    █████ ███ █ █ █ █  █ █ ██  █ ██ ██████ ██ █ ██ ████  █ █ █ █ ████ █  █ █ ██
 30.8 |█ █ ██████████ █████ █ ██ █ █████ ██████████████ ████████ █ █ ███████████ ███ ██
 29.7 |██████████████ ████████████ ████████████████████████████████████████████████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms | █  1
  11 ms | █  1
  16 ms | ██  3
  17 ms | ███  5
  18 ms | ████  6
  19 ms | ████████  12
  20 ms | ██████████████  21
  21 ms | ███████████  16
  22 ms | █████████  13
  23 ms | ██████████████  21
  24 ms | █████████  13
  25 ms | █████████  13
  26 ms | ██████  9
  27 ms | ██████████  15
  28 ms | ████████████  18
  29 ms | █████  7
  30 ms | █████  7
  31 ms | ██████████████████  27
  32 ms | █████████████████████████████████  50
  33 ms | ████████████████████████████████████  54
  34 ms | ████████████████████████████████████████  60
  35 ms | ███████████████████  28
  36 ms | ████████████  18
  37 ms | ████████████  18
  38 ms | █████████  14
  39 ms | ███████████  17
  40 ms | █████████  14
  41 ms | █████████  14
  42 ms | ███████████████  22
  43 ms | █████████  13
  44 ms | ████████████  18
  45 ms | ██████████  15
  46 ms | ████████  12
  47 ms | ████  6
  48 ms | ███  5
  49 ms | █  2
  50 ms | ██  3
  51 ms | █  1
  52 ms | ██  3
  53 ms | █  1
  54 ms | █  1
  58 ms | █  1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.22`
- `seed` = `7487.00`
- `preload_duration_ms` = `1717.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-55.00`
- `entity_count_sample_start` = `56.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `18.59`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `31.66`, min `16.48`, p50 `29.64`, p95 `48.58`, p99 `54.24`, 1%low `18.52`, 0.1%low `16.48`, std `8.39`

**Frame time (ms)**  avg `33.49`, p50 `33.74`, p95 `45.60`, p99 `48.66`, p99.9 `57.69`, max `60.68`

**Client tick (ms)**  avg `0.37`, p95 `0.54`, max `1.09`

**Memory**  start `2148 MB`, end `1927 MB`, peak `2261 MB`, GC `24 events / 164 ms`

**FPS over sampling window (ASCII):**

```
 37.7 |                                                               █                
 36.9 |                                           █                   █                
 36.0 |               █                           █                   █                
 35.2 | █             █      █                    █                   █                
 34.3 | █             █      █          █         █   █               █     █          
 33.5 | █             █      █   █      ██    ███ █   █      █        █     █  █       
 32.6 | █         █   █     ██ █ █ █    ██  █ ███ █   █  █ █ █   █ █  █     █  █       
 31.8 | █ ██ █ █  █   ██ ██ ██ ███ █ █  ███ █ ███ █   █  █ █ █ █ █ █  █ █   █  █ █ █  █
 31.0 | █ ██ █ ██ ███ █████ ██ █████ ████████ ███ ██ ███ █████ █ ███ ██ █   ██ █ █ ████
 30.1 | ███████████████████ █████████████████ ███ ██████████████ ██████ ███████████████
 29.3 |██████████████████████████████████████████ ██████████████ ██████████████████████
 28.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  11 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | █  2
  18 ms | █  2
  19 ms | ███████████  17
  20 ms | ████████  12
  21 ms | ████████████  18
  22 ms | ██████████  15
  23 ms | ███████████  17
  24 ms | ██████████  15
  25 ms | ███████  10
  26 ms | █████████  14
  27 ms | █████████  14
  28 ms | █████████  14
  29 ms | ██████████  15
  30 ms | █████████████  19
  31 ms | ██████████████████  27
  32 ms | ███████████████████████████  40
  33 ms | ██████████████████████████████████████  57
  34 ms | ████████████████████████████████████████  60
  35 ms | ████████████████████  30
  36 ms | ███████████  17
  37 ms | ████████████████  24
  38 ms | ████████████  18
  39 ms | █████████████  19
  40 ms | █████████  13
  41 ms | █████████  14
  42 ms | ████████████  18
  43 ms | █████████  14
  44 ms | ███████████  17
  45 ms | █████████████  20
  46 ms | ██████  9
  47 ms | ████  6
  48 ms | █  1
  49 ms | █  1
  51 ms | █  2
  54 ms | █  1
  55 ms | █  1
  60 ms | █  1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.48`
- `seed` = `7499.00`
- `preload_duration_ms` = `24.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-21.00`
- `entity_count_sample_start` = `23.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `18.52`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23359 ms  |  Sample ticks: 400

**FPS**  avg `31.39`, min `19.18`, p50 `29.66`, p95 `47.38`, p99 `51.88`, 1%low `20.04`, 0.1%low `19.18`, std `7.58`

**Frame time (ms)**  avg `33.49`, p50 `33.71`, p95 `45.63`, p99 `47.23`, p99.9 `51.39`, max `52.12`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `0.66`

**Memory**  start `1924 MB`, end `1712 MB`, peak `2260 MB`, GC `21 events / 153 ms`

**FPS over sampling window (ASCII):**

```
 37.1 |                   █                                                            
 36.4 |                   █                                                            
 35.6 |                   █                                                            
 34.8 |                   █                                                █           
 34.0 |                   █                    █                    █      █           
 33.2 |        █   ██     █           █        █ █            █     █  █   █        █  
 32.4 |█     █ █   ██    ██    █    █ █    █   █ █       █    █     ██ █   █ █    █ █  
 31.6 |█   ███ ███ ██ █ ███ █ ██  █ █ █ █ ████ █ ██████ ███ █ █  ██ ██████ █ █   ██ █  
 30.8 |███████████ ██ █ ████████  █ █ █ █ ████ ████████ ███ █ █ ███ ███████████ ███ █ █
 30.0 |███████████ ██ █ ███████████ ███ ███████████████ █████ █████ ███████████████ ███
 29.3 |████████████████ ███████████ ███████████████████████████████████████████████ ███
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms |   1
  16 ms |   1
  18 ms | ██  4
  19 ms | ███  7
  20 ms | ███████  14
  21 ms | ████████  16
  22 ms | ████████  16
  23 ms | █████████  18
  24 ms | ███████  14
  25 ms | ████████  17
  26 ms | █████  11
  27 ms | █████  10
  28 ms | ████  9
  29 ms | ██████████  21
  30 ms | ██████  12
  31 ms | ██████████████  29
  32 ms | ██████████████████████  46
  33 ms | ████████████████████████████████████████  83
  34 ms | ███████████████████████████████  64
  35 ms | ███████████████  31
  36 ms | █████████  19
  37 ms | ████████  16
  38 ms | █████  10
  39 ms | ██████  13
  40 ms | ██████  13
  41 ms | ██████████  20
  42 ms | ████████  16
  43 ms | █████  10
  44 ms | █████████  18
  45 ms | ███████████  22
  46 ms | ████  9
  47 ms | █  3
  48 ms |   1
  49 ms |   1
  50 ms | █  2
  52 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.18`
- `seed` = `7507.00`
- `preload_duration_ms` = `302.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `20.04`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `50.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `32.05`, min `15.69`, p50 `29.80`, p95 `49.13`, p99 `55.66`, 1%low `17.18`, 0.1%low `15.69`, std `12.88`

**Frame time (ms)**  avg `33.49`, p50 `33.56`, p95 `46.11`, p99 `51.55`, p99.9 `63.37`, max `63.72`

**Client tick (ms)**  avg `0.33`, p95 `0.44`, max `11.04`

**Memory**  start `989 MB`, end `1580 MB`, peak `2256 MB`, GC `21 events / 162 ms`

**FPS over sampling window (ASCII):**

```
 58.7 |                                                                █               
 55.9 |                                                                █               
 53.2 |                                                                █               
 50.4 |    █                                                           █               
 47.6 |    █                                                           █               
 44.8 |    █                                                           █               
 42.0 |    █                                                           █               
 39.2 |    █                                                           █               
 36.4 |    █                     █                  █                  █               
 33.6 |██ ██ █ █     █  █ █   █  █         █ █ █ █ ██ ██ █  █   █    █ █ █      █ █ █ █
 30.9 |██ ████ █████████████████ ███████ ███ █ ███ ██████████████ ████ ████████████████
 28.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   5 ms | █  1
  16 ms | █  2
  17 ms | ██  3
  18 ms | █  2
  19 ms | ██████████  16
  20 ms | ████████  14
  21 ms | ████████  14
  22 ms | ████████  14
  23 ms | █████  8
  24 ms | ███████████  18
  25 ms | ████████  14
  26 ms | ███  5
  27 ms | ██████████████  23
  28 ms | ████████  14
  29 ms | ██████████  16
  30 ms | ██████████  16
  31 ms | █████████████  22
  32 ms | ████████████████████████████████████  59
  33 ms | ████████████████████████████████████████  66
  34 ms | █████████████████████████████████  54
  35 ms | ████████████████  26
  36 ms | ███████████████████  31
  37 ms | ████████████  20
  38 ms | ████████  13
  39 ms | ████████████  19
  40 ms | █████  8
  41 ms | ████████  14
  42 ms | ████████  14
  43 ms | █████  9
  44 ms | ████  6
  45 ms | █████████████  22
  46 ms | █████  8
  47 ms | ████████  14
  48 ms | ██  3
  50 ms | █  1
  51 ms | █  2
  53 ms | █  1
  58 ms | █  2
  63 ms | █  2
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.69`
- `seed` = `7517.00`
- `preload_duration_ms` = `68.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-27.00`
- `entity_count_sample_start` = `28.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `17.18`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `68.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23059 ms  |  Sample ticks: 400

**FPS**  avg `31.65`, min `19.03`, p50 `29.79`, p95 `49.22`, p99 `54.74`, 1%low `19.78`, 0.1%low `19.03`, std `8.43`

**Frame time (ms)**  avg `33.50`, p50 `33.57`, p95 `46.34`, p99 `49.21`, p99.9 `52.08`, max `52.54`

**Client tick (ms)**  avg `0.33`, p95 `0.45`, max `2.71`

**Memory**  start `2321 MB`, end `1149 MB`, peak `2414 MB`, GC `21 events / 162 ms`

**FPS over sampling window (ASCII):**

```
 38.7 |                                         █                                      
 37.8 |                                         █                                      
 36.9 |                                         █                                      
 36.0 |                      █                  █                                      
 35.1 |                      █         █  █     █                                      
 34.2 | █                    █   █     █  █ █   █                   █        █       █ 
 33.3 | █             █      █   █     █  █ █   █                   █ █      █ █     █ 
 32.4 |██       █    ██ █    █   █  █  █  █ █   █   █ █   █   █     █ █  ██ ██ ██    █ 
 31.5 |█████ ██ █  █████████ ██  █  █ ██  █ █   █ █ ███ █ █ ███     █ ██ ██ ██ ██ ██ █ 
 30.6 |█████ ██ ████████████ ███ █ ██ ██ ████ ███ █████ █ █ ████ ██████████████████████
 29.7 |█████████████████████████ ██████████████████████████████████████████████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  11 ms | █  1
  14 ms | █  1
  16 ms | █  2
  17 ms | █  2
  18 ms | ██  4
  19 ms | █████████  16
  20 ms | █████████  16
  21 ms | ████████  15
  22 ms | █████████  16
  23 ms | █████  9
  24 ms | ████████  15
  25 ms | ████  8
  26 ms | ████████  15
  27 ms | ██████  11
  28 ms | ████████  14
  29 ms | ███████  13
  30 ms | █████████  16
  31 ms | ██████████████  25
  32 ms | ███████████████████████████████  56
  33 ms | ████████████████████████████████████████  72
  34 ms | ███████████████████████████████  56
  35 ms | ██████████████████  32
  36 ms | █████████████  24
  37 ms | ███████████  19
  38 ms | ███████  12
  39 ms | ██████  11
  40 ms | ███████  13
  41 ms | ████████  15
  42 ms | ████  8
  43 ms | █████  9
  44 ms | ███████  13
  45 ms | ██████████  18
  46 ms | █████████  17
  47 ms | ██████  10
  48 ms | ██  4
  49 ms | ███  5
  50 ms | █  1
  51 ms | █  1
  52 ms | █  1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.85`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.03`
- `seed` = `7523.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `13.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-20.00`
- `entity_count_sample_start` = `33.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `19.78`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.71`, p50 `9.99`, p95 `11.02`, p99 `11.33`, 1%low `8.74`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `100.08`, p50 `100.06`, p95 `110.95`, p99 `112.41`, p99.9 `114.62`, max `114.78`

**Client tick (ms)**  avg `0.26`, p95 `0.33`, max `1.95`

**Memory**  start `2301 MB`, end `967 MB`, peak `2357 MB`, GC `3 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                                 █ █            
 10.5 |                           █              █                █     █ █      █     
 10.4 |  █              █         █              █                █     █ █      █     
 10.3 |  █              █       █ █     █        █                █     █ █      █     
 10.2 |  █     █        █       █ █     █  █    ██     █ █ █      █     █ █ █    █     
 10.1 |█ ██    ███   █  █  █  █ █ █     █ ██    ███    █ █ █      █  █  █ █ █   ██     
 10.0 |█ █████ ████████ ████ ██████████ █ █████ ████████████████ ██████ █ █████ ██████ 
  9.9 |███████ ████████ ████ ██████████ ███████ ████████████████ ██████ █ █████ ██████ 
  9.8 |████████████████ ████ ██████████ ███████ ███████████████████████ █ ████████████ 
  9.6 |█████████████████████ ██████████████████ ███████████████████████ █ ████████████ 
  9.5 |████████████████████████████████████████ ███████████████████████ █ ████████████ 
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  87 ms | █  1
  88 ms | ██  3
  89 ms | ██  3
  90 ms | ██  3
  91 ms | ██  2
  92 ms | █████  7
  93 ms | ████  5
  94 ms | ███  4
  95 ms | ████████  10
  96 ms | ██  3
  97 ms | █████████  11
  98 ms | ████████  10
  99 ms | ██████████████████████  28
 100 ms | ████████████████████████████████████████  51
 101 ms | █████████  12
 102 ms | █████  7
 103 ms | █████  6
 104 ms | █  1
 105 ms | █  1
 106 ms | ███  4
 107 ms | █████  7
 108 ms | ███  4
 109 ms | ███  4
 110 ms | ██  3
 111 ms | ████  5
 112 ms | ██  2
 113 ms | █  1
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.74`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.03`, p50 `10.02`, p95 `11.09`, p99 `11.72`, 1%low `8.05`, 0.1%low `n/a`, std `0.67`

**Frame time (ms)**  avg `100.24`, p50 `99.82`, p95 `112.56`, p99 `121.44`, p99.9 `124.42`, max `124.51`

**Client tick (ms)**  avg `2.52`, p95 `2.94`, max `12.83`

**Memory**  start `1171 MB`, end `963 MB`, peak `2375 MB`, GC `1 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 11.1 |                        █                                                       
 10.9 |                  █     █              █                                        
 10.7 |                  █     █              ██             █               █       █ 
 10.5 |    █     █       █   █ ██     █ █     ██      █      ██     █        █       █ 
 10.3 | ██ █     ██     ██   █ ██     █ █     ██      ██     ██     ██ █     █ █     ██
 10.1 | ██████ █ ███    ██ █ █ ████   ███ █ █ ███ █  █████ █ ███    ██ █     ████ █  ██
  9.9 | ██████ █ ████ █ ████ █ █████  █████ █ ██████ █████ █ █████  ███████  ██████ ███
  9.7 | ██████ ██████ ██████ ███████  █████ ████████ █████ █ █████ ████████ ███████ ███
  9.5 | █████████████ ██████ ██████████████ ████████ ███████ ██████████████ ███████ ███
  9.3 | ████████████████████ ██████████████ ████████ ██████████████████████████████ ███
  9.1 | ████████████████████ ██████████████████████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  81 ms | █  1
  82 ms | █  1
  85 ms | ███  2
  87 ms | █████  4
  88 ms | ███  2
  90 ms | ████  3
  91 ms | ███  2
  92 ms | ██████████  8
  93 ms | █████████  7
  94 ms | ██████████  8
  95 ms | ████████  6
  96 ms | ███████████  9
  97 ms | ██████  5
  98 ms | ███████████████████████  18
  99 ms | ████████████████████████████████████████  32
 100 ms | ████████████████████████████████████████  32
 101 ms | ███████████  9
 102 ms | █████  4
 103 ms | ██████  5
 104 ms | █████  4
 105 ms | ███  2
 106 ms | ████████  6
 107 ms | █  1
 108 ms | ██████████  8
 109 ms | █  1
 110 ms | ███  2
 111 ms | █████  4
 112 ms | ████████  6
 113 ms | ███  2
 114 ms | █  1
 115 ms | ███  2
 121 ms | █  1
 124 ms | ███  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.05`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `0.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.75`, p50 `9.99`, p95 `11.02`, p99 `11.19`, 1%low `8.78`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `100.07`, p50 `100.09`, p95 `110.19`, p99 `113.31`, p99.9 `114.10`, max `114.23`

**Client tick (ms)**  avg `0.27`, p95 `0.35`, max `1.63`

**Memory**  start `1075 MB`, end `1287 MB`, peak `1287 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                █                                               
 10.5 |  █                             █                    █                          
 10.4 |  █    █ █        █       █     █             █      █                          
 10.3 |  █    █ █        █    █ ██     █             █      █                  ██     █
 10.2 |  █ █  █ █       ██    █ ██     █   █ █       █    █ █                  ██   █ █
 10.1 | ██ █  █ █   ███ ██ █  █ ██     █   ███ █  █  █    █ █      █ ██  █     ██ █ █ █
 10.0 |███ ██ █████████ █████ █ ████ ██████████████ █████ █ ████████████████  █████ █ █
  9.9 |██████ █████████ █████ █ ████ ██████████████ ███████ █████████████████████████ █
  9.7 |██████ █████████ █████ █ ████ ██████████████ ███████ █████████████████████████ █
  9.6 |██████ █████████ ███████ ████ ████████████████████████████████████████████████ █
  9.5 |██████ ███████████████████████████████████████████████████████████████████████ █
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  89 ms | ███  4
  90 ms | █████  7
  91 ms | █████  7
  92 ms | ████  5
  93 ms | ████  6
  94 ms | ████  6
  95 ms | ██  3
  96 ms | ███  4
  97 ms | ███  4
  98 ms | █████████  12
  99 ms | ██████████████████████  31
 100 ms | ████████████████████████████████████████  56
 101 ms | █████████  12
 102 ms | ████  5
 103 ms | █  2
 104 ms | ██  3
 105 ms | █  2
 106 ms | █  2
 107 ms | ██████  8
 108 ms | ████  6
 109 ms | █  1
 110 ms | ██  3
 111 ms | █  2
 112 ms | ███  4
 113 ms | ██  3
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `9043.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `8.78`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.68`, p50 `9.99`, p95 `11.05`, p99 `11.34`, 1%low `8.69`, 0.1%low `n/a`, std `0.57`

**Frame time (ms)**  avg `100.07`, p50 `100.08`, p95 `112.01`, p99 `114.91`, p99.9 `115.19`, max `115.22`

**Client tick (ms)**  avg `0.27`, p95 `0.32`, max `1.68`

**Memory**  start `1366 MB`, end `1502 MB`, peak `1502 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |  █                                   █                                         
 10.6 |  █    █                       █      █                                         
 10.5 |  █    █      █       █        █      █       █                                 
 10.3 |  █    █      █      ██        █      █ █ █   █ █      █              █         
 10.2 |█ █    █      █      ██        █      █ █ █   ███   █  █      ██     ███     █  
 10.1 |█ █   ████ █ ██ █    ██   █  ███      █ █ █   ███   █  █ █    ██  █  ███     █  
 10.0 |█ ███ ████ █ ██████  ███████ ██████   █ ████  ████  █ ██████  ███ ██ ██████  ██ 
  9.9 |█ ███ ██████ ██████  ███████ ███████ ██ ████ ██████ ████████  ██████ ███████████
  9.7 |█ ███ ██████ ███████████████ ███████ ██ ████ ██████ ████████████████ ███████████
  9.6 |█████ ██████████████████████ ██████████ ████████████████████████████ ███████████
  9.5 |█████ ██████████████████████ ██████████ ████████████████████████████ ███████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  87 ms | █  1
  88 ms | ██  3
  89 ms | ███  4
  90 ms | ███  4
  91 ms | ██  3
  92 ms | ███  4
  93 ms | ███████  9
  94 ms | ██  3
  95 ms | ██████  8
  96 ms | █████  7
  97 ms | ██████  8
  98 ms | ███████████████  20
  99 ms | ████████  11
 100 ms | ████████████████████████████████████████  55
 101 ms | ████████████  17
 102 ms | █  2
 103 ms | ██  3
 104 ms | █████  7
 105 ms | █  2
 106 ms | █  1
 107 ms | ████  6
 108 ms | █  1
 109 ms | ████  5
 110 ms | ██  3
 111 ms | █  2
 112 ms | █  2
 113 ms | ███  4
 114 ms | █  2
 115 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `8.69`
- `fps_harmonic_avg` = `9.99`
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

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.73`, p50 `9.99`, p95 `10.96`, p99 `11.16`, 1%low `8.76`, 0.1%low `n/a`, std `0.49`

**Frame time (ms)**  avg `100.14`, p50 `100.10`, p95 `109.63`, p99 `113.32`, p99.9 `114.39`, max `114.55`

**Client tick (ms)**  avg `0.27`, p95 `0.33`, max `1.71`

**Memory**  start `1679 MB`, end `1843 MB`, peak `1843 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                             █                                  
 10.6 |                                             █                                  
 10.5 |                         █  █                █               █ █             █  
 10.3 |     █              █    █  █    █   █       █               █ █             ██ 
 10.2 |    ██       █      █    █  █    █   █       █     █ █       █ █   █   █     ██ 
 10.1 |    ██     █ ██  █  █    █  ██  ███  █       █     ███ █     █ █ █ ██  █     ██ 
 10.0 |██  ████████ █████  ████ ██ ███ ███ ██████  ██████ █████████ █ ██████ ██████ ███
  9.8 |███ ████████████████████ ██ ███ ██████████  ██████ █████████ █ █████████████ ███
  9.7 |████████████████████████ ██████ ████████████████████████████ ███████████████ ███
  9.6 |███████████████████████████████ ████████████████████████████ ███████████████ ███
  9.5 |████████████████████████████████████████████████████████████████████████████ ███
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  88 ms | █  1
  89 ms | ███  4
  90 ms | ███  4
  91 ms | ███  4
  92 ms | ██  3
  93 ms | ███  5
  94 ms | ███  4
  95 ms | █████  7
  96 ms | ██████  9
  97 ms | ███  5
  98 ms | ███████████  16
  99 ms | ██████████████  21
 100 ms | ████████████████████████████████████████  58
 101 ms | ████████  12
 102 ms | █████  7
 103 ms | ████  6
 104 ms | █  2
 105 ms | ████  6
 106 ms | ███  4
 107 ms | ███  5
 108 ms | ██  3
 109 ms | ███  5
 110 ms | █  2
 111 ms | █  1
 112 ms | █  1
 113 ms | ██  3
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `8.76`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `9.99`
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

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.63`, p50 `9.99`, p95 `11.05`, p99 `11.34`, 1%low `8.71`, 0.1%low `n/a`, std `0.55`

**Frame time (ms)**  avg `100.06`, p50 `100.10`, p95 `111.33`, p99 `113.40`, p99.9 `115.45`, max `115.87`

**Client tick (ms)**  avg `0.27`, p95 `0.34`, max `1.65`

**Memory**  start `802 MB`, end `946 MB`, peak `946 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |█                                                                               
 10.5 |█                                                                               
 10.4 |█ █               █                           █             █ █                 
 10.3 |█ █       █   ███ █        █     █      █     █        ██   █ █        █        
 10.2 |█ █     █ █   ███ █    █ █ █    ██ █    █     █ █      ██   █ ██       █ █     █
 10.1 |█ █   █ █ █   ███ █    █ ███  █ ██ █    ███   █ █    █ ██   █ ██      ██ █     █
 10.0 |█ ███ █ █████ ███ ████ █ ██████ ██ ███  █████ ██████ █ ████ █ ███████ ██ █████ █
  9.8 |█ ███ ███████ ███ ████ ████████ ██████ ██████ ██████ █ ██████ ███████ ████████ █
  9.7 |█████████████ ███ ████ ████████ █████████████ ██████ ████████ ███████ ████████ █
  9.6 |█████████████ ███████████████████████████████ ███████████████ ██████████████████
  9.5 |█████████████ ██████████████████████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  2
  88 ms | █  2
  89 ms | ███  4
  90 ms | ███  5
  91 ms | ███  4
  92 ms | ████  6
  93 ms | ███  5
  94 ms | ████  7
  95 ms | █████  8
  96 ms | █████  8
  97 ms | █  2
  98 ms | ████████  12
  99 ms | ██████████  16
 100 ms | ████████████████████████████████████████  63
 101 ms | ████████  13
 102 ms | █  2
 103 ms | ███  5
 104 ms | ██  3
 105 ms | █  2
 106 ms | ██  3
 107 ms | ████  7
 108 ms | ███  4
 109 ms | █  1
 110 ms | ███  4
 111 ms | ███  4
 112 ms | ███  5
 113 ms | █  2
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `8053.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `8.71`
- `scheduled_block_ticks` = `1088.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194948 ms  |  Sample ticks: 3600

**FPS**  avg `10.04`, min `7.42`, p50 `10.01`, p95 `11.15`, p99 `11.87`, 1%low `7.92`, 0.1%low `7.46`, std `0.69`

**Frame time (ms)**  avg `100.09`, p50 `99.92`, p95 `112.89`, p99 `123.02`, p99.9 `132.44`, max `134.69`

**Client tick (ms)**  avg `0.66`, p95 `1.14`, max `12.56`

**Memory**  start `1517 MB`, end `1040 MB`, peak `1905 MB`, GC `14 events / 76 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                             █                                        █        █
 10.2 |                             █                        █               █        █
 10.1 |                       █   █ █         █  █           █              ██        █
 10.1 |       █        █ ██ █ █ █ █ █         █  █   █       █ █          █ ██    █   █
 10.1 |  █   ██     █  █ ██ █ █ █ █ █    █  █ █  █   █  █ █  █ █     █    █ ██    █   █
 10.1 |  █ █ ██ █   ██ █ ██ █ █ █ █ █   ██  █ █  █   █  █ █ ██ █ █  ██  ███ ██ ██ █ █ █
 10.0 |  ███ ██ ███ ██ █ ██ █ █ █ ███  ███ ██ █  ██  ██ █ █ ██ ████ ███ ███ ██ ██ █ █ █
 10.0 |█████ ███████████ ██ █ █ █ ████ ███ ██ ██ ███ ██ ███ ██ ████ ██████████ ██ ███ █
 10.0 |█████ ███████████ ████ ███ ████ ███ ██ ██ █████████████ ██████████████████ ███ █
  9.9 |█████████████████ ████████ ██████████████ █████████████ ████████████████████████
  9.9 |█████████████████ ██████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  65 ms |   1
  66 ms |   1
  72 ms |   1
  74 ms |   1
  75 ms |   1
  76 ms |   1
  77 ms |   1
  79 ms |   2
  80 ms |   2
  81 ms |   2
  82 ms |   3
  83 ms |   1
  84 ms | █  6
  85 ms | █  8
  86 ms | █  5
  87 ms | ██  15
  88 ms | ██  14
  89 ms | ████  33
  90 ms | ████  33
  91 ms | ████  38
  92 ms | ████  37
  93 ms | ██████  54
  94 ms | ██████  55
  95 ms | ███████  67
  96 ms | ██████  59
  97 ms | ███████  64
  98 ms | ██████████████  129
  99 ms | ██████████████████████████████████  311
 100 ms | ████████████████████████████████████████  368
 101 ms | ████████████  112
 102 ms | ███  32
 103 ms | ████  34
 104 ms | ███  31
 105 ms | ███  26
 106 ms | ██  16
 107 ms | ██  22
 108 ms | ██  19
 109 ms | ███  25
 110 ms | ███  25
 111 ms | ███  31
 112 ms | ███  23
 113 ms | ██  16
 114 ms | █  9
 115 ms | █  10
 116 ms |   4
 117 ms | █  6
 118 ms |   4
 119 ms |   4
 120 ms |   2
 121 ms |   4
 122 ms | █  11
 123 ms | █  6
 124 ms | █  6
 125 ms |   2
 128 ms |   2
 132 ms |   1
 133 ms |   1
 134 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `7.92`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
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
- `fps_0p1pct_low` = `7.46`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194400 ms  |  Sample ticks: 3600

**FPS**  avg `100.04`, min `6.71`, p50 `58.78`, p95 `405.68`, p99 `662.64`, 1%low `8.25`, 0.1%low `7.47`, std `132.28`

**Frame time (ms)**  avg `40.67`, p50 `17.01`, p95 `104.67`, p99 `116.30`, p99.9 `123.35`, max `149.12`

**Client tick (ms)**  avg `0.65`, p95 `0.99`, max `2.16`

**Memory**  start `1392 MB`, end `1712 MB`, peak `1930 MB`, GC `14 events / 71 ms`

**FPS over sampling window (ASCII):**

```
201.8 |                               █                █ █                             
184.4 |                            ██ ███ ██       █  █████                            
167.0 |                           ██████████    ██████████████                         
149.5 |                           ███████████   ███████████████                        
132.1 |                           █████████████ ███████████████  █                     
114.6 |                           █████████████████████████████████████████████████████
 97.2 |                           █████████████████████████████████████████████████████
 79.7 |                           █████████████████████████████████████████████████████
 62.3 |                          ██████████████████████████████████████████████████████
 44.9 |                          ██████████████████████████████████████████████████████
 27.4 |                          ██████████████████████████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████████  187
   2 ms | ███  70
   3 ms | ████  84
   4 ms | ████  88
   5 ms | ██  36
   6 ms | █  33
   7 ms | █████████████  304
   8 ms | ████████████████████████████████████████  959
   9 ms | █████████  207
  10 ms | █  15
  11 ms |   1
  12 ms |   1
  14 ms | █  24
  15 ms | ███  76
  16 ms | █████  125
  17 ms | ███████  158
  18 ms | ███████  165
  19 ms | ██████  150
  20 ms | ████  84
  21 ms | ███  63
  22 ms | █  23
  23 ms |   9
  24 ms |   6
  25 ms |   3
  28 ms |   1
  29 ms |   3
  30 ms |   2
  31 ms | █  13
  32 ms | █  20
  33 ms | █  15
  34 ms | █  15
  35 ms | █  13
  36 ms |   6
  37 ms |   2
  38 ms |   3
  51 ms |   1
  75 ms |   1
  77 ms |   1
  78 ms |   2
  79 ms |   2
  80 ms |   3
  81 ms |   2
  82 ms |   3
  83 ms |   3
  84 ms |   3
  86 ms |   3
  87 ms |   5
  88 ms | █  16
  89 ms | █  17
  90 ms | █  23
  91 ms | █  31
  92 ms | ██  38
  93 ms | ██  41
  94 ms | ██  46
  95 ms | ██  48
  96 ms | ██  51
  97 ms | ███  61
  98 ms | ████  88
  99 ms | ███████████  274
 100 ms | ██████████████  325
 101 ms | ████  89
 102 ms | █  34
 103 ms | █  25
 104 ms | █  13
 105 ms | █  15
 106 ms | █  12
 107 ms | █  18
 108 ms | █  18
 109 ms | █  28
 110 ms | █  15
 111 ms | █  28
 112 ms | █  18
 113 ms |   7
 114 ms |   4
 115 ms |   4
 116 ms |   6
 117 ms |   6
 118 ms |   6
 119 ms |   5
 120 ms |   6
 121 ms |   4
 122 ms |   7
 123 ms |   3
 124 ms |   1
 128 ms |   1
 133 ms |   1
 149 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `24.59`
- `fps_1pct_low` = `8.25`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
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
- `entity_count_sample_start` = `74.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.47`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193711 ms  |  Sample ticks: 3600

**FPS**  avg `45.59`, min `8.72`, p50 `34.23`, p95 `112.16`, p99 `257.07`, 1%low `16.24`, 0.1%low `13.41`, std `41.08`

**Frame time (ms)**  avg `31.36`, p50 `29.22`, p95 `55.93`, p99 `58.73`, p99.9 `63.42`, max `114.69`

**Client tick (ms)**  avg `0.75`, p95 `0.97`, max `7.01`

**Memory**  start `1779 MB`, end `781 MB`, peak `1877 MB`, GC `17 events / 97 ms`

**FPS over sampling window (ASCII):**

```
121.6 |█                                                                               
113.5 |█                                                                               
105.4 |██       █                                                                      
 97.3 |███ ██████                                                                      
 89.2 |██████████                                                                      
 81.1 |██████████                                                                      
 73.0 |██████████                                                                      
 64.9 |███████████                                                                     
 56.9 |███████████                                                                     
 48.8 |███████████                                                                     
 40.7 |█████████████████ ███████████████████████████ ██ █ █ ██ ███     █          █ █ █
 32.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  10
   3 ms | ███████  55
   4 ms | ███████  51
   5 ms | ███  24
   6 ms | ██  16
   7 ms | ███████  56
   8 ms | ███████████  82
   9 ms | █████████  69
  10 ms | ████████████  90
  11 ms | ███████████████  115
  12 ms | █████████████████████  161
  13 ms | ███████████████  110
  14 ms | ██████████  79
  15 ms | █████████  69
  16 ms | ███████  50
  17 ms | ████████  60
  18 ms | █████████  66
  19 ms | ███████████  80
  20 ms | █████████████████████  158
  21 ms | ████████████████████  153
  22 ms | ███████████████████████████  205
  23 ms | ████████████████████████████████████████  303
  24 ms | ██████████████████████████████████████  287
  25 ms | ██████████████████████  169
  26 ms | █████████████████  126
  27 ms | █████████████████  129
  28 ms | ███████████  80
  29 ms | █████████  66
  30 ms | ███████████  83
  31 ms | ████████████  90
  32 ms | ████████████████████  155
  33 ms | █████████████████████████  191
  34 ms | ███████████████████████  174
  35 ms | ██████████  73
  36 ms | ███████████  83
  37 ms | ████████████  88
  38 ms | ██████████████  106
  39 ms | ███████████  85
  40 ms | ████████  58
  41 ms | ██████  43
  42 ms | █████████  67
  43 ms | █████████████  99
  44 ms | █████████████████  131
  45 ms | ███████████████  114
  46 ms | █████████████  101
  47 ms | ██████████  78
  48 ms | ███████  53
  49 ms | ██████  43
  50 ms | ████████  63
  51 ms | █████████  67
  52 ms | █████████████████  127
  53 ms | ██████████████████  140
  54 ms | ████████████████  121
  55 ms | ███████████████  110
  56 ms | ██████████████  104
  57 ms | ██████████  78
  58 ms | ██████  46
  59 ms | ███  21
  60 ms | ██  14
  61 ms |   3
  62 ms | █  5
  63 ms |   2
  64 ms |   2
  66 ms |   1
  73 ms |   1
 114 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `31.89`
- `fps_1pct_low` = `16.24`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `16.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `73.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `13.41`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194814 ms  |  Sample ticks: 3600

**FPS**  avg `39.27`, min `14.26`, p50 `33.13`, p95 `91.94`, p99 `146.92`, 1%low `15.93`, 0.1%low `14.82`, std `27.52`

**Frame time (ms)**  avg `33.45`, p50 `30.19`, p95 `56.88`, p99 `60.41`, p99.9 `65.98`, max `70.11`

**Client tick (ms)**  avg `0.72`, p95 `0.93`, max `6.16`

**Memory**  start `1095 MB`, end `1738 MB`, peak `1941 MB`, GC `18 events / 75 ms`

**FPS over sampling window (ASCII):**

```
 49.0 |                                                               █                
 47.6 |                                                               █                
 46.2 |                                                      █       ██                
 44.8 |   █                                                  █       ██ █   █          
 43.5 |  ██    █            █                █               █       ██ █   █          
 42.1 |  ██ █ ██    █       █                █               █       ██ █   █ ██       
 40.7 |  ██ ████    █  █    █      █       █ █     ██   █    ██     ███ █  ██ ██       
 39.3 | █████████  ██  █   ██      ██  █  ████ █   ██   █  █ ██  █████████ ██ ████    █
 37.9 | █████████  ███ ███ ██ █    ███ █  ████ ██ ███ ███ ████████████████ ███████ █ ██
 36.5 |█████████████████████████  ████ █ █████ ██████ ████████████████████ ███████ ████
 35.2 |███████████████████████████████ ██████████████ █████████████████████████████████
 33.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  7
   4 ms | ██  11
   5 ms | ██  15
   6 ms | ████  27
   7 ms | █████  31
   8 ms | █████  34
   9 ms | ██████████  68
  10 ms | █████████████  85
  11 ms | █████████████████  117
  12 ms | ████████████  81
  13 ms | █████████████  90
  14 ms | ███████████  74
  15 ms | █████████████  88
  16 ms | ███████████  75
  17 ms | ███████████████  99
  18 ms | ████████████  80
  19 ms | ███████████  75
  20 ms | ███████████  76
  21 ms | ████████████  79
  22 ms | ███████████████  99
  23 ms | █████████████  87
  24 ms | ████████████  78
  25 ms | ██████████████████████  146
  26 ms | █████████████████████████████████████  249
  27 ms | ████████████████████████████████████████  270
  28 ms | ███████████████████████████████████████  265
  29 ms | ███████████████████████████████████  239
  30 ms | ████████████████████████████  190
  31 ms | ███████████  74
  32 ms | ███████████████  104
  33 ms | ██████████  70
  34 ms | ██████████████████  122
  35 ms | ████  25
  36 ms | ███  20
  37 ms | ██████  41
  38 ms | █████████  64
  39 ms | ███████  46
  40 ms | █████████  63
  41 ms | ██████████████████  124
  42 ms | ███████████████████  131
  43 ms | █████████████████████████  166
  44 ms | ███████████████████  128
  45 ms | ███████████████████  128
  46 ms | ███████████████  98
  47 ms | ███████████  72
  48 ms | ████████████  82
  49 ms | ██████████  69
  50 ms | ██████████  65
  51 ms | █████████  61
  52 ms | ██████████  70
  53 ms | █████████████  89
  54 ms | ███████████████████  129
  55 ms | ███████████████████  128
  56 ms | ██████████████████  120
  57 ms | ██████████████  93
  58 ms | ████████  56
  59 ms | ██████  43
  60 ms | ████  24
  61 ms | ██  13
  62 ms | █  7
  63 ms | █  10
  64 ms |   3
  65 ms |   2
  66 ms | █  4
  67 ms |   1
  70 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.90`
- `fps_1pct_low` = `15.93`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
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
- `entity_count_sample_start` = `69.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `14.82`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`

