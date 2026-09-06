# FPS Test session — 2026-09-05T23:09:03.029510293+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 119.2 | 100.4 | 78.8 | 9.53 | 0.59 | 1 | 308 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 119.0 | 101.4 | 87.8 | 9.51 | 0.61 | 5 | 72 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 29.9 | 28.5 | 28.4 | 35.01 | 0.71 | 1 | 208 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.9 | 27.7 | 25.7 | 35.03 | 0.74 | 5 | 143 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 29.9 | 28.5 | 28.2 | 34.91 | 0.69 | 4 | 68 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.9 | 27.0 | 23.7 | 34.52 | 0.51 | 1 | 164 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 15 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 16 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 17 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 18 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 21 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 22 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 23 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 25 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 30 | [Forest flyby](#forest-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 34 | [Badlands flyby](#badlands-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 123.8 | 70.4 | 52.8 | 12.14 | 2.68 | 5 | 264 |
| 38 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 123.8 | 70.4 | 52.8 | 12.14 | 2.68 | 5 | 264 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 41 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 42 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

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
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Desert flyby (single-biome world)](#desert-flyby-single-biome-world)
- [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Forest flyby](#forest-flyby)
- [Forest flyby](#forest-flyby)
- [Swamp flyby](#swamp-flyby)
- [Cherry grove flyby](#cherry-grove-flyby)
- [Badlands flyby](#badlands-flyby)
- [Badlands flyby](#badlands-flyby)
- [Windswept hills flyby](#windswept-hills-flyby)
- [Idle Baseline](#idle-baseline)
- [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously)
- [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously)
- [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide)
- [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm)
- [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm)
- [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `119.23`, min `65.57`, p50 `118.70`, p95 `130.95`, p99 `136.80`, 1%low `100.39`, 0.1%low `78.81`, std `13.03`

**Frame time (ms)**  avg `8.43`, p50 `8.42`, p95 `9.21`, p99 `9.53`, p99.9 `9.97`, max `15.25`

**Client tick (ms)**  avg `0.59`, p95 `0.91`, max `6.44`

**Memory**  start `480 MB`, end `607 MB`, peak `788 MB`, GC `1 events / 5 ms`

**FPS over sampling window (ASCII):**

```
136.1 |                                                  █                             
134.5 |                                                  █                             
132.9 |                                                  █                             
131.3 |                                                  █                             
129.7 |                                                  █                             
128.1 |                                                  █                             
126.5 |                                                  █                             
124.8 |                                                  █                             
123.2 |                                                  █                             
121.6 |                                                  █                             
120.0 |████ ██ ██   █   █        █        █        █     █          █                 █
118.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   6 ms |   5
   7 ms | █████████  374
   8 ms | ████████████████████████████████████████  1682
   9 ms | ███████  309
  10 ms |   1
  15 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 296 | 119.4 | 9.88 |
| `sculk_charge_pop` | 240 | 296 | 119.1 | 9.43 |
| `ALL_TOGETHER` | 1680 | 296 | 119.0 | 9.31 |
| `portal` | 160 | 296 | 119.0 | 9.34 |
| `end_rod` | 240 | 296 | 120.6 | 9.43 |
| `dragon_breath` | 160 | 296 | 119.0 | 9.29 |
| `dripping_water` | 240 | 296 | 118.8 | 9.22 |
| `flame` | 160 | 296 | 118.9 | 9.19 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `100.39`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `78.81`
- `fps_harmonic_avg` = `118.68`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `7.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `118.99`, min `87.19`, p50 `118.61`, p95 `131.52`, p99 `135.90`, 1%low `101.38`, 0.1%low `87.82`, std `6.70`

**Frame time (ms)**  avg `8.43`, p50 `8.43`, p95 `9.23`, p99 `9.51`, p99.9 `10.17`, max `11.47`

**Client tick (ms)**  avg `0.61`, p95 `0.89`, max `1.30`

**Memory**  start `729 MB`, end `622 MB`, peak `802 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
119.6 |█                                                                               
119.5 |█       █               █                                     █                 
119.3 |█       █               █          █ ██     █        █     █  █                 
119.2 |█ █  █  █ █ █  █ ██ █   █ █     █  █ ██     █    █   █ █ █ █  █  █     █ ██     
119.0 |███  █  ████████ ██ █████ ████  ██ █ ██ ███ ██ ████  █████ ██ █  █ ███ █ ██ ██  
118.8 |███████ ████████ ████████ █████ ██ ████████ ████████ ██████████  █████ ████████ 
118.7 |███████████████████████████████ ██ ████████ ████████████████████ ██████████████ 
118.5 |███████████████████████████████ ███████████ ████████████████████ ███████████████
118.4 |███████████████████████████████ ████████████████████████████████ ███████████████
118.2 |███████████████████████████████ ████████████████████████████████████████████████
118.1 |███████████████████████████████ ████████████████████████████████████████████████
117.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   5
   7 ms | ██████████  398
   8 ms | ████████████████████████████████████████  1629
   9 ms | ████████  334
  10 ms |   4
  11 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `101.38`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `48.00`
- `fps_harmonic_avg` = `118.62`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `87.82`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `28.42`, p50 `29.86`, p95 `30.92`, p99 `31.20`, 1%low `28.47`, 0.1%low `28.42`, std `0.67`

**Frame time (ms)**  avg `33.46`, p50 `33.49`, p95 `34.61`, p99 `35.01`, p99.9 `35.17`, max `35.19`

**Client tick (ms)**  avg `0.71`, p95 `0.97`, max `1.47`

**Memory**  start `589 MB`, end `698 MB`, peak `797 MB`, GC `1 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                     █   █        █                                             
 30.1 |      █        █     █   █  █     █     █         █                  █  █    █  
 30.0 |  █   █     █  █     █   █  █  █  █     █   █  █  █  █  █    █ █  █  █  █  █ █  
 30.0 |  ██  █     █  █  █  █   █  █  █  █  █  █   █  █  █  █  █  █ █ █  █  █  █  █ ██ 
 29.9 | ███  █  █  █ ██  █  █   █  █  █  █  █  █   █  █  █  █  █  █ ███ ██  █  █  █ ██ 
 29.9 | ███ ██ █████ ██ ██  █ █ █ ██ ██  █ ██ ██   █ ██  █ ██ ██ ██ ███ ██ ██  █  █ ██ 
 29.9 | ███ ██ █████ ██ ██  █ ███ ██ ██ ██ ██ ██████ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ 
 29.8 | ███ ██ █████ ██ █████ ███ ██ ██ ██ ██ █████████ ██ ████████ ██████ █████ ██ ███
 29.8 |███████ █████ ████████████████████████ █████████████████████ ███████████████ ███
 29.8 |████████████████████████████████████████████████████████████████████████████ ███
 29.7 |████████████████████████████████████████████████████████████████████████████ ███
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | █  5
  32 ms | ██████████████████████████████████████  202
  33 ms | ████████████████████████████████████████  213
  34 ms | ████████████████████████████████  170
  35 ms | █  7
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `28.47`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `64.00`
- `fps_harmonic_avg` = `29.89`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `28.42`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `25.69`, p50 `29.99`, p95 `30.92`, p99 `31.29`, 1%low `27.66`, 0.1%low `25.69`, std `0.76`

**Frame time (ms)**  avg `33.45`, p50 `33.34`, p95 `34.60`, p99 `35.03`, p99.9 `37.69`, max `38.93`

**Client tick (ms)**  avg `0.74`, p95 `0.94`, max `6.49`

**Memory**  start `627 MB`, end `575 MB`, peak `770 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 30.4 |          █                                                                     
 30.3 |          █                                                                     
 30.3 |          █                                                                     
 30.2 |          █                                                                     
 30.1 |          █                                                              █      
 30.1 |█         █     █         █                                              █      
 30.0 |██     █  █  █  █      █  █  █  █  █  ██     █     █ █       █  █ █   █  █  █   
 30.0 |██  █  █ ██ ██  █   █  █  █  █  █ ██  ██ ██ ██ ██  █ ██  ██ ██ ██ ██ ██  █ ██  █
 29.9 |██ █████ ██ ██ ██ █ █ ██  █  ██ █ ███ ██ ██ ██ ██ ██ ██  ██ ██ ██ ██ ██ ██ ███ █
 29.8 |████████ ██ █████████ ██ ███ ████ ███ ██ ██ ██ ██ ██ █████████ ██ █████ ██ █████
 29.8 |█████████████████████████████████████ ██████████████ ████████████ ██████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  26 ms |   1
  31 ms | █  8
  32 ms | ██████████████████████████████  177
  33 ms | ████████████████████████████████████████  235
  34 ms | █████████████████████████████  170
  35 ms | █  5
  36 ms |   1
  38 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `27.66`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `65.00`
- `fps_harmonic_avg` = `29.90`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `25.69`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `28.20`, p50 `29.90`, p95 `30.90`, p99 `31.13`, 1%low `28.49`, 0.1%low `28.20`, std `0.64`

**Frame time (ms)**  avg `33.44`, p50 `33.44`, p95 `34.50`, p99 `34.91`, p99.9 `35.35`, max `35.46`

**Client tick (ms)**  avg `0.69`, p95 `0.97`, max `1.48`

**Memory**  start `727 MB`, end `534 MB`, peak `796 MB`, GC `4 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                           █                                    
 30.1 |               █          █                █               █                    
 30.0 |  █     █      █          ██  █         █  █  █            █  █           █     
 30.0 |  █  █  █    █ █  █     █ ██ ██      █  █  █  █    ██  █   █  █ ██  █  █  █  █  
 30.0 |  █ ██ ██ ██ █ █  █  █  █ ██ ██  █   █  █  █ ██  █ ██  ██  █  █ ██  █  █  █ ██  
 29.9 | ██ ██ ██ ██ █ █  █  █ ██ ██ ██ ██ █ █  █ ██ ██ ██ ██  ██  █ ██ ██ ██ ██ ██ ██ █
 29.9 | ██ ██ ██ ██ █ █ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ███  █ ██ █████ ██ ██ ██ █
 29.8 | ██ ██ ██ ██ ███ █████ ██ ██ █████ ██████ ██ ████████ █████████ ███████████ ██ █
 29.8 | █████ █████ █████████ ██ ██ ████████████ ██ ██████████████████ ██████████████ █
 29.8 |█████████████████████████ ███████████████ █████████████████████ ████████████████
 29.7 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  30 ms |   2
  31 ms |   2
  32 ms | ███████████████████████████████████  198
  33 ms | ████████████████████████████████████████  229
  34 ms | █████████████████████████████  165
  35 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `28.49`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `34.00`
- `fps_harmonic_avg` = `29.90`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `28.20`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `23.66`, p50 `29.94`, p95 `30.57`, p99 `30.84`, 1%low `26.98`, 0.1%low `23.66`, std `0.75`

**Frame time (ms)**  avg `33.46`, p50 `33.40`, p95 `34.22`, p99 `34.52`, p99.9 `41.78`, max `42.26`

**Client tick (ms)**  avg `0.51`, p95 `0.62`, max `9.07`

**Memory**  start `634 MB`, end `635 MB`, peak `798 MB`, GC `1 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 30.7 |                                  █                                             
 30.6 |                                  █                                             
 30.4 |                                  █                                             
 30.3 |                                  █                                             
 30.1 |            █                     █         █                  █                
 30.0 | ██ ███ ██  █ ██ ██ ██ ██ ███ ██ ██ ██ ███  █ ██  █ ██ ██ ███ ██ ██ ██ ██ ██ ██ 
 29.8 |████████████████████████████████ ███████████████████████████████████████████████
 29.6 |████████████████████████████████ ███████████████████████████████████████████████
 29.5 |████████████████████████████████ ███████████████████████████████████████████████
 29.3 |████████████████████████████████ ███████████████████████████████████████████████
 29.2 |████████████████████████████████ ███████████████████████████████████████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  24 ms |   1
  32 ms | ████████████████████  162
  33 ms | ████████████████████████████████████████  318
  34 ms | ██████████████  114
  41 ms |   1
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `26.98`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `22.00`
- `fps_harmonic_avg` = `29.89`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `23.66`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 151 ms  |  Sample ticks: 0

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

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 5454 ms  |  Sample ticks: 0

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

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 705 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 312 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 2498 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 4689 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 7087 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 9179 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 11434 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 13791 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 16082 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 18333 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 20536 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 22735 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 24935 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 27230 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 29524 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 147 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 3849 ms  |  Sample ticks: 0

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

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 802 ms  |  Sample ticks: 0

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

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 18802 ms  |  Sample ticks: 0

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

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 1703 ms  |  Sample ticks: 0

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

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 1549 ms  |  Sample ticks: 0

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

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 5450 ms  |  Sample ticks: 0

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

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 497 ms  |  Sample ticks: 0

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

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 1796 ms  |  Sample ticks: 0

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

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 349 ms  |  Sample ticks: 0

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

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 3541 ms  |  Sample ticks: 0

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

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 42 ms  |  Sample ticks: 0

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

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 1 ms  |  Sample ticks: 0

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

- `aborted_state` = `PREPARING`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `123.78`, min `51.22`, p50 `118.99`, p95 `181.03`, p99 `202.32`, 1%low `70.36`, 0.1%low `52.84`, std `28.29`

**Frame time (ms)**  avg `8.45`, p50 `8.40`, p95 `11.42`, p99 `12.14`, p99.9 `17.42`, max `19.52`

**Client tick (ms)**  avg `2.68`, p95 `3.04`, max `11.11`

**Memory**  start `1120 MB`, end `885 MB`, peak `1384 MB`, GC `5 events / 20 ms`

**FPS over sampling window (ASCII):**

```
132.4 |                                     █                                          
131.3 |                                     █                              █           
130.2 |             ██                      █                              █           
129.1 |             ██                      █                              █           
128.0 |            ████                     █                              █           
126.9 |         █  ████ █ █            █    █                              █           
125.7 |         █  ████ ███  █         █    █                              █           
124.6 | █   █  ████████████ ██  █   █  ██ █ ██ █                           █   █       
123.5 | █   █  ████████████ █████████ █████ █████ █  █        █    █  █ █  ███ ██  ██ █
122.4 |██████ █████████████ █████████ ███████████ ██ ██ ███ ██████ ██ ████████ ████████
121.3 |███████████████████████████████████████████████████████████ ██ ████████ ████████
120.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms |   4
   4 ms | █  22
   5 ms | ████████  262
   6 ms | ████  132
   7 ms | ███  114
   8 ms | ████████████████████████████████████████  1343
   9 ms | ██  64
  10 ms | █████  158
  11 ms | ███████  234
  12 ms | █  21
  13 ms |   1
  15 ms |   5
  16 ms |   2
  18 ms |   2
  19 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `52.84`
- `fps_1pct_low` = `70.36`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `50.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `118.29`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 31954 ms  |  Sample ticks: 400

**FPS**  avg `123.78`, min `51.22`, p50 `118.99`, p95 `181.03`, p99 `202.32`, 1%low `70.36`, 0.1%low `52.84`, std `28.29`

**Frame time (ms)**  avg `8.45`, p50 `8.40`, p95 `11.42`, p99 `12.14`, p99.9 `17.42`, max `19.52`

**Client tick (ms)**  avg `2.68`, p95 `3.04`, max `11.11`

**Memory**  start `1120 MB`, end `885 MB`, peak `1384 MB`, GC `5 events / 20 ms`

**FPS over sampling window (ASCII):**

```
132.4 |                                     █                                          
131.3 |                                     █                              █           
130.2 |             ██                      █                              █           
129.1 |             ██                      █                              █           
128.0 |            ████                     █                              █           
126.9 |         █  ████ █ █            █    █                              █           
125.7 |         █  ████ ███  █         █    █                              █           
124.6 | █   █  ████████████ ██  █   █  ██ █ ██ █                           █   █       
123.5 | █   █  ████████████ █████████ █████ █████ █  █        █    █  █ █  ███ ██  ██ █
122.4 |██████ █████████████ █████████ ███████████ ██ ██ ███ ██████ ██ ████████ ████████
121.3 |███████████████████████████████████████████████████████████ ██ ████████ ████████
120.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms |   4
   4 ms | █  22
   5 ms | ████████  262
   6 ms | ████  132
   7 ms | ███  114
   8 ms | ████████████████████████████████████████  1343
   9 ms | ██  64
  10 ms | █████  158
  11 ms | ███████  234
  12 ms | █  21
  13 ms |   1
  15 ms |   5
  16 ms |   2
  18 ms |   2
  19 ms |   1
```

**Extras:**

- `aborted_state` = `READY_WAIT`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `fps_0p1pct_low` = `52.84`
- `fps_1pct_low` = `70.36`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `50.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `118.29`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 1 ms  |  Sample ticks: 0

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

- `aborted_state` = `PREPARING`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 254 ms  |  Sample ticks: 0

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

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 2604 ms  |  Sample ticks: 0

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

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 4970 ms  |  Sample ticks: 0

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
- `part_label` = `LowEnd Shader`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `2.00`

