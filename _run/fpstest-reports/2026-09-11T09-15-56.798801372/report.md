# FPS Test session — 2026-09-11T09:50:50.881448668+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 101.6 | 45.0 | 42.1 | 21.51 | 0.62 | 1 | 320 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 95.6 | 42.3 | 32.1 | 21.82 | 0.67 | 4 | 232 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.9 | 20.3 | 20.2 | 48.55 | 0.67 | 1 | 224 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.3 | 20.6 | 20.5 | 48.18 | 0.65 | 2 | 167 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 29.7 | 20.4 | 20.0 | 48.67 | 0.63 | 2 | 4 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.5 | 20.4 | 19.9 | 48.36 | 0.48 | 1 | 284 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 29.6 | 20.5 | 20.4 | 48.26 | 0.63 | 3 | 348 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 29.4 | 19.4 | 17.2 | 48.25 | 1.04 | 4 | 252 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 30.4 | 17.6 | 16.8 | 55.10 | 2.99 | 5 | 426 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 31.7 | 16.5 | 16.2 | 59.31 | 3.75 | 10 | 250 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 28.9 | 20.8 | 20.4 | 47.64 | 0.92 | 5 | 218 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 29.0 | 20.7 | 20.2 | 47.56 | 0.49 | 4 | 386 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 32.2 | 16.1 | 15.6 | 59.09 | 3.48 | 6 | 32 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.9 | 16.9 | 16.4 | 56.87 | 2.85 | 5 | 20 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 80.5 | 12.6 | 11.4 | 72.92 | 15.24 | 29 | 578 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 185.1 | 18.1 | 15.7 | 51.09 | 15.59 | 29 | 582 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 331.6 | 22.0 | 21.3 | 43.68 | 1.73 | 5 | 116 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 32.0 | 19.7 | 17.2 | 47.78 | 1.82 | 2 | 460 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 31.3 | 21.0 | 20.3 | 46.33 | 0.65 | 1 | 48 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 31.0 | 21.4 | 20.9 | 45.82 | 0.27 | 0 | 156 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 31.0 | 21.6 | 21.1 | 45.53 | 0.23 | 3 | 612 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 31.2 | 20.9 | 19.6 | 46.00 | 0.28 | 1 | 404 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 31.1 | 21.5 | 20.7 | 45.56 | 0.28 | 0 | 184 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 31.7 | 19.4 | 16.5 | 48.18 | 0.34 | 46 | 809 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 32.2 | 17.4 | 15.6 | 49.40 | 0.36 | 34 | 516 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 32.1 | 16.8 | 14.4 | 52.58 | 0.37 | 25 | 641 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 33.7 | 16.9 | 15.2 | 50.68 | 0.34 | 25 | 640 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 31.7 | 19.3 | 17.9 | 49.76 | 0.33 | 22 | 522 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 32.9 | 17.7 | 16.2 | 49.74 | 0.37 | 21 | 648 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 31.6 | 19.2 | 17.5 | 49.47 | 0.33 | 22 | 304 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 32.7 | 17.5 | 15.1 | 50.87 | 0.30 | 22 | 1299 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 32.4 | 17.8 | 14.4 | 48.72 | 0.41 | 25 | 662 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 32.0 | 18.5 | 15.4 | 49.30 | 0.30 | 21 | 960 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 10.0 | 8.0 | n/a | 116.44 | 0.32 | 20 | 601 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 10.0 | 8.1 | n/a | 117.68 | 0.37 | 19 | 1153 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 10.0 | 8.8 | n/a | 112.16 | 0.27 | 0 | 80 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 10.0 | 8.4 | n/a | 115.13 | 2.57 | 1 | 488 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 10.0 | 8.7 | n/a | 113.78 | 0.27 | 0 | 216 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 10.0 | 8.8 | n/a | 112.94 | 0.27 | 1 | 72 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 10.0 | 9.0 | n/a | 110.89 | 0.28 | 0 | 156 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 10.0 | 8.8 | n/a | 112.91 | 0.29 | 0 | 152 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 10.1 | 8.1 | 5.4 | 113.14 | 0.67 | 11 | 964 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 10.0 | 8.5 | 8.0 | 114.66 | 0.64 | 13 | 847 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.1 | 7.8 | 7.6 | 126.45 | 0.64 | 13 | 472 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.1 | 6.2 | 2.3 | 125.09 | 0.63 | 11 | 871 |

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

Category: **Particles**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `101.55`, min `41.06`, p50 `105.94`, p95 `133.10`, p99 `738.47`, 1%low `44.97`, 0.1%low `42.14`, std `105.90`

**Frame time (ms)**  avg `12.51`, p50 `9.44`, p95 `19.76`, p99 `21.51`, p99.9 `23.01`, max `24.35`

**Client tick (ms)**  avg `0.62`, p95 `0.99`, max `1.50`

**Memory**  start `461 MB`, end `440 MB`, peak `781 MB`, GC `1 events / 4 ms`

**FPS over sampling window (ASCII):**

```
174.1 |                                      █                                         
165.7 |                                      █                                         
157.2 |                                      █                      █                  
148.7 |                                   ██ █             █        █    █             
140.2 |                     █            ███ █       █     █        █    █             
131.8 |                     █            ███ █       ██    █  █     █    █             
123.3 |    █        █       █         █  ███ █       ██    █  █     █   ██             
114.8 | █  █        █    █  █         █  ███ █ █     ██    █  █     █   ██             
106.3 | █  █        █    █  ██        █  ███ █ █     ██    █  █     █   ██             
 97.9 | ████ ██  █  █    █  ██ █     ██  ███ █ ███   ██  █ █ ██ █   ██  ██  ██  █   █  
 89.4 |████████████ █ ████████ █ █ ████████████████████████████ ██████ ████████████████
 80.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  8
   1 ms | █  13
   2 ms |   1
   4 ms |   1
   6 ms |   5
   7 ms | ████████████  156
   8 ms | ████████████████████████████████████████  535
   9 ms | ███████  95
  10 ms | █  11
  11 ms |   3
  13 ms |   4
  14 ms | █  19
  15 ms | █████████████  170
  16 ms | ██████████████████  245
  17 ms | ███████████  151
  18 ms | ██████  75
  19 ms | ███  35
  20 ms | ███  39
  21 ms | ██  25
  22 ms |   5
  23 ms |   1
  24 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 199 | 97.2 | 21.84 |
| `portal` | 160 | 199 | 94.0 | 21.62 |
| `ALL_TOGETHER` | 1680 | 199 | 94.9 | 20.41 |
| `sculk_charge_pop` | 240 | 199 | 119.9 | 21.91 |
| `smoke` | 160 | 199 | 99.4 | 21.69 |
| `flame` | 160 | 199 | 106.3 | 21.04 |
| `dripping_water` | 240 | 199 | 98.8 | 21.16 |
| `dragon_breath` | 160 | 199 | 102.0 | 20.85 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `79.91`
- `fps_0p1pct_low` = `42.14`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `44.97`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `55.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `95.64`, min `26.67`, p50 `67.15`, p95 `132.14`, p99 `556.83`, 1%low `42.29`, 0.1%low `32.07`, std `85.72`

**Frame time (ms)**  avg `12.97`, p50 `14.89`, p95 `19.83`, p99 `21.82`, p99.9 `24.25`, max `37.49`

**Client tick (ms)**  avg `0.67`, p95 `0.97`, max `6.75`

**Memory**  start `586 MB`, end `573 MB`, peak `818 MB`, GC `4 events / 12 ms`

**FPS over sampling window (ASCII):**

```
164.9 |            █                                                                   
156.6 |            █                                     █                             
148.4 |            █                    █                █                             
140.1 |            █          █         █                █                             
131.9 |            █          █ █       █              █ █                         █   
123.6 |            █          █ █       █     █        █ █       █        █        █   
115.4 |       █    ██       █ █ █       █     █        █ █       █        █  █     █   
107.1 |       █    ██       █ █ █       █     █        █ █       █        █  █ █   █   
 98.9 |   █   ██   ██       █ █ █       ██    █        █ █       █        █  █ █   █   
 90.6 |█ ███ ███   ██ █ █ █ ████████ ██ ███████     █  █ █ █ █ █████████ ██ ████  ██ ██
 82.4 |█████████████████████████████████████████████████████ ██████████████████████████
 74.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | █  15
   2 ms |   2
   5 ms |   1
   6 ms |   5
   7 ms | ████████████  135
   8 ms | ████████████████████████████████████████  453
   9 ms | ████████  88
  10 ms | ███  32
  11 ms | █  15
  12 ms |   3
  13 ms |   5
  14 ms | ██  19
  15 ms | ███████████  121
  16 ms | ███████████████████████  263
  17 ms | █████████████████  187
  18 ms | ████████  86
  19 ms | ███  39
  20 ms | ███  30
  21 ms | ██  28
  22 ms | █  11
  23 ms |   1
  24 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `38.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `42.29`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `32.07`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `77.09`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `28.87`, min `20.17`, p50 `29.01`, p95 `44.26`, p99 `49.57`, 1%low `20.35`, 0.1%low `20.17`, std `5.18`

**Frame time (ms)**  avg `35.54`, p50 `34.47`, p95 `46.29`, p99 `48.55`, p99.9 `49.38`, max `49.58`

**Client tick (ms)**  avg `0.67`, p95 `0.91`, max `1.48`

**Memory**  start `571 MB`, end `653 MB`, peak `795 MB`, GC `1 events / 1 ms`

**FPS over sampling window (ASCII):**

```
 31.6 |                                                          █                     
 31.2 |                                  █                  █    █              █  █   
 30.7 |   █             █          █     █          █  █    █    █         █    █  █   
 30.2 |  ██  █  █    █ ██        █ ██   ██   █      █  █    █    █         █    █  █   
 29.8 |  ██  █  ██   █ ██        █ ██   ██ █ ██     █  █ █  █    █  █      █    █  ██  
 29.3 | ███  █  ██   █ ███ █     █ ███  ██ █ ██   █ █ ██ █  █    █  █      █    █  ██  
 28.8 |███████  ███  █████ █     █ ███  ████ ██   █ █ ██ █  █    ██ █      █  █ █  ██  
 28.3 |███████ ███████████████  ██████  ████ ██   █ █ ██ █ ██    ██ █  ███ █ ██ ██ ███ 
 27.9 |███████████████████████ ████████ ███████ ███ █ ████ ███ █ ████ ████ █ ██ ███████
 27.4 |██████████████████████████████████████████████ ████ █████ ████ ██████ ██████████
 26.9 |███████████████████████████████████████████████████ ████████████████████████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  4
  20 ms | ██  7
  21 ms | ███  9
  22 ms | ███  9
  23 ms |   1
  31 ms | █  3
  32 ms | ███████████████████████  70
  33 ms | ████████████████████████████████████████  120
  34 ms | █████████████████████████████████  100
  35 ms | ███████████████  45
  36 ms | ███████████████  46
  37 ms | ███████████  34
  38 ms | ████  11
  39 ms | █████  14
  40 ms | █████  14
  41 ms | ███  8
  42 ms | ██  5
  43 ms | ██  7
  44 ms | ███  9
  45 ms | ████  13
  46 ms | ████  13
  47 ms | ████  12
  48 ms | █  4
  49 ms | █  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `41.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.35`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.17`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.14`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `29.29`, min `20.48`, p50 `29.26`, p95 `44.64`, p99 `47.00`, 1%low `20.64`, 0.1%low `20.48`, std `5.75`

**Frame time (ms)**  avg `35.26`, p50 `34.18`, p95 `46.59`, p99 `48.18`, p99.9 `48.75`, max `48.84`

**Client tick (ms)**  avg `0.65`, p95 `0.85`, max `1.20`

**Memory**  start `640 MB`, end `808 MB`, peak `808 MB`, GC `2 events / 3 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                                                              █                 
 33.1 |                                                              █                 
 32.4 |                        █                                     █                 
 31.7 |        █               █                     █     █    █ █  █                 
 31.1 |      █ █       █       █                     █  █  █    █ █  █                 
 30.4 | █    █ █       █       █      █           █  █  █  █    ████ █        █   ██  █
 29.7 | █ █  █ █       █ █     ██ █ █ █      █  █ █  █ ██  █    ████ █  █    ██   ██ ██
 29.1 |██ █  █ ██   ██ ███ █   ████ █ █     ██ ██ ██████████ ███████ ███████ ██   ██ ██
 28.4 |██ █ ██████████ █████ █ ████████████ █████ ██████████████████ ███████████  ██ ██
 27.7 |██ ██████████████████ ███████████████████████████████████████ ███████████████ ██
 27.1 |█████████████████████ ██████████████████████████████████████████████████████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  20 ms | █  3
  21 ms | █████  17
  22 ms | █████  17
  23 ms | ███  9
  24 ms | █  4
  30 ms |   1
  31 ms | █  5
  32 ms | ████████████████████  67
  33 ms | ████████████████████████████████████████  136
  34 ms | ████████████████████████  80
  35 ms | ████████████████  55
  36 ms | █████████  29
  37 ms | █████  17
  38 ms | ████  12
  39 ms | ███  10
  40 ms | ██  8
  41 ms | ██  7
  42 ms | ███  9
  43 ms | ████  13
  44 ms | ███  10
  45 ms | ██████  19
  46 ms | ████  13
  47 ms | █████  17
  48 ms | ██  8
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `86.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.64`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.48`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.36`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `29.72`, min `20.03`, p50 `29.24`, p95 `45.90`, p99 `48.17`, 1%low `20.36`, 0.1%low `20.03`, std `6.07`

**Frame time (ms)**  avg `34.84`, p50 `34.20`, p95 `46.97`, p99 `48.67`, p99.9 `49.70`, max `49.93`

**Client tick (ms)**  avg `0.63`, p95 `0.88`, max `1.24`

**Memory**  start `832 MB`, end `522 MB`, peak `836 MB`, GC `2 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 34.9 |                               █                                                
 34.2 |                               █                                                
 33.5 |                               █          █                                     
 32.8 |              █    █           █    █     █  █                                  
 32.1 |          █   █  █ █     █     █    █     █  █     █                            
 31.5 |          █   █  █ █ █   █     █    █   █ █  █     █     █  █                   
 30.8 |          █   █  █ ███   █     █  █ ██  █ █  ██    ██    █  █   █          █ █  
 30.1 |█ ██  █   █ █ █ ██ ███   █ █ █ █  █ ██  █ █  ███ █ ██    █  █   █      █   ███  
 29.4 |█ ██  █ █ ███ ████ ████  ███ ████ █ ██  █ █ ████ █ ██    █  ██ ███  ██ █   ███  
 28.7 |█ ███ ███████ ████ ██████████████████████ ██████ ███████ █  ███████ ███████████ 
 28.0 |█████ ███████ ████ ██████████████████████ ██████████████ ███████████████████████
 27.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ███  10
  21 ms | ████████  24
  22 ms | ██████  18
  23 ms | ██  6
  31 ms | █  4
  32 ms | ████████████████████████  71
  33 ms | ████████████████████████████████████████  117
  34 ms | ██████████████████████████████████████  110
  35 ms | ██████████████████  52
  36 ms | ██████████████  42
  37 ms | █████  14
  38 ms | █████  16
  39 ms | ██  6
  40 ms | ███  10
  41 ms | █  4
  42 ms | █  2
  43 ms | █  4
  44 ms | ██  5
  45 ms | ████  13
  46 ms | ██████  19
  47 ms | ████  13
  48 ms | ████  12
  49 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `31.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.36`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.03`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.71`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `29.53`, min `19.93`, p50 `29.21`, p95 `46.17`, p99 `47.73`, 1%low `20.39`, 0.1%low `19.93`, std `7.17`

**Frame time (ms)**  avg `35.57`, p50 `34.24`, p95 `47.20`, p99 `48.36`, p99.9 `49.67`, max `50.18`

**Client tick (ms)**  avg `0.48`, p95 `0.60`, max `0.84`

**Memory**  start `536 MB`, end `482 MB`, peak `820 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 32.1 |              ██                           █                            █       
 31.5 |        █     ██   █                       █            █               █       
 30.9 |        █     ██   █   ██      █ █    █    █   █  █  █  █      █ ██     ██      
 30.3 |██      █     ██   █  ████ █   █ █  █ █  █ █   █ ██  █  █    █ █ ████   ██      
 29.7 |██   █  █ █   ██ █ █  ████ █ █ █ █  █ █  █ █████ ██  █  █  █ ███ █████  ██  ██  
 29.0 |███ ██ ████  █████ ██ ████ █ ████████ █ ██ █████ ██  █████ █████ █████  ██ ███  
 28.4 |██████ ████  █████ ██ █████████████████ ████████ ██ ██████ █████ █████████████ █
 27.8 |████████████████████████████████████████████████ ██ ████████████ █████████████ █
 27.2 |████████████████████████████████████████████████ ███████████████████████████████
 26.6 |████████████████████████████████████████████████ ███████████████████████████████
 25.9 |████████████████████████████████████████████████ ███████████████████████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  3
  20 ms | █  3
  21 ms | ████████████  37
  22 ms | ███████  21
  23 ms | ███  9
  30 ms | █  4
  31 ms | ██  7
  32 ms | ██████████████████  54
  33 ms | ████████████████████████████████████████  121
  34 ms | ████████████████████  61
  35 ms | █████████████  38
  36 ms | ██████████  30
  37 ms | ████  11
  38 ms | ███  9
  39 ms | ███  10
  40 ms | ████  12
  41 ms | ██  6
  42 ms | ██  5
  43 ms | ███  8
  44 ms | █████  14
  45 ms | ███████████  33
  46 ms | ███████████  34
  47 ms | ██████  17
  48 ms | ████  13
  49 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `47.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.39`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.93`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.11`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `29.60`, min `20.42`, p50 `29.32`, p95 `45.78`, p99 `48.22`, 1%low `20.52`, 0.1%low `20.42`, std `6.21`

**Frame time (ms)**  avg `35.05`, p50 `34.10`, p95 `47.16`, p99 `48.26`, p99.9 `48.98`, max `48.98`

**Client tick (ms)**  avg `0.63`, p95 `0.93`, max `1.28`

**Memory**  start `487 MB`, end `582 MB`, peak `835 MB`, GC `3 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |                     █                                                          
 32.8 |          █          █                              █                           
 32.1 |█         █    █   █ █        █                     █        █                  
 31.5 |█         █  █ █   █ █        █  █                  █        █ █  ██            
 30.9 |█    █    █  █ ███ █ █  ███   ██ █  █    █     █    █        ███  ██   █        
 30.3 |█    ██   █  █████ █ █  ███ █ ██ █  ██  ██  █  █    █        ████ ███  █        
 29.7 |█    ██   █  █████ █ █  ███ █ ██ ██ ██  ██  █  █    █  █     ████ ███  █   ██   
 29.1 |█  █ ███  ██ ██████████ ███ ████ ██ ███ ███ ████    █  █     ████ ███ ████████  
 28.4 |████ ████ ██ ██████████ ███████████████ █████████   █ ██     █████████████████  
 27.8 |████ █████████████████████████████████████████████  ████  █████████████████████ 
 27.2 |██████████████████████████████████████████████████ ██████ ██████████████████████
 26.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ███  8
  21 ms | ███████  22
  22 ms | ███████  22
  23 ms | █  3
  31 ms |   1
  32 ms | ████████████████████████████  85
  33 ms | ████████████████████████████████████████  120
  34 ms | █████████████████████████████████  98
  35 ms | ████████████████  47
  36 ms | █████████  28
  37 ms | ███  10
  38 ms | █████  14
  39 ms | ███  8
  40 ms | ████  12
  41 ms | ██  5
  42 ms | ████  12
  43 ms | ██  6
  44 ms | █  4
  45 ms | ████  12
  46 ms | ███████  22
  47 ms | █████  16
  48 ms | █████  14
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `31.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.52`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.42`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.53`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `29.43`, min `17.23`, p50 `29.09`, p95 `45.25`, p99 `48.68`, 1%low `19.43`, 0.1%low `17.23`, std `5.95`

**Frame time (ms)**  avg `35.16`, p50 `34.37`, p95 `46.48`, p99 `48.25`, p99.9 `57.03`, max `58.03`

**Client tick (ms)**  avg `1.04`, p95 `1.24`, max `2.42`

**Memory**  start `609 MB`, end `789 MB`, peak `862 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                              █                                                 
 32.3 |                              ██      █                                █        
 31.6 |              █          █    ██      █ █                        █  █  █  █     
 30.9 | █    █  █    █          █    ██      █ █         ██     █ █     █  █  █  █   █ 
 30.2 |██    █  █    █   █ ██   █    ██      █ █ █    █  ██     █ ██    █  ██ █  █  ███
 29.5 |██  █ █ █████ ██  █ ██   █    ██ █    █ █ ██   █  █████  █ ██ █ ██ ███ █  █  ███
 28.8 |██  █ █ ████████  █ ██ █ ██████████████ █ ██ ████ █████ ██████████████ ██ █  ███
 28.1 |███ ███ █████████████████████████████████ ██ █████████████████████████ ██ ██████
 27.4 |███ █████████████████████████████████████ ██ ████████████████████████████ ██████
 26.7 |█████████████████████████████████████████ ██████████████████████████████████████
 26.0 |█████████████████████████████████████████ ██████████████████████████████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  6
  21 ms | ███████  18
  22 ms | ███████  19
  23 ms | █  2
  24 ms | ███  7
  26 ms |   1
  31 ms | ███  7
  32 ms | ███████████████████████████  73
  33 ms | ████████████████████████████████████████  109
  34 ms | ████████████████████████████████████████  108
  35 ms | ██████████████████  49
  36 ms | █████████  25
  37 ms | ███████  20
  38 ms | ██████  17
  39 ms | ████  11
  40 ms | ███  7
  41 ms | ██  6
  42 ms | ██  5
  43 ms | █████  13
  44 ms | ██  5
  45 ms | ███████  19
  46 ms | ███████  20
  47 ms | ███  9
  48 ms | ███  9
  49 ms |   1
  56 ms |   1
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `69.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.43`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.23`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.44`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `30.41`, min `16.82`, p50 `29.30`, p95 `47.76`, p99 `54.66`, 1%low `17.57`, 0.1%low `16.82`, std `8.44`

**Frame time (ms)**  avg `35.20`, p50 `34.13`, p95 `49.46`, p99 `55.10`, p99.9 `58.63`, max `59.44`

**Client tick (ms)**  avg `2.99`, p95 `3.66`, max `4.33`

**Memory**  start `461 MB`, end `608 MB`, peak `887 MB`, GC `5 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 35.7 |                                                               █                
 34.9 |                                                               █                
 34.1 |              █                                     █          █             █  
 33.3 |              █         █           █               █          █  █          █  
 32.5 | █ █        █ █ █       █     █     █    █          █   █ █    ██ █  █       █  
 31.6 | █ █      █ █ █ █       █ █   █     █    █    █     █ █ █ █    ██ █ ██ █  ██ █ █
 30.8 | █ █     ██ █ █ ███    ██ █ █ █ █ █ █    ███  █ █ █ █ ███ █   ███ █ ██ █████ █ █
 30.0 | █ █   █ ██ █ █ █████  ██ █ █ █ ███ ██   ███  █ █ ███ ███ █   ███ ████ █████ ███
 29.2 | █ █ ███ ██ █ ████████ ████ █ █ ███ ██   ████ ███ ███████ █ █ ████████ █████ ███
 28.4 |██ ██████████ █████████████████ █████████████████████████ █ ████████████████ ███
 27.6 |███████████████████████████████ ████████████████████████████████████████████████
 26.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | ██  3
  18 ms | █████  7
  19 ms | █████  8
  20 ms | ██████████  16
  21 ms | ██████████  15
  22 ms | ██████  9
  23 ms | ███████  11
  24 ms | █████████████████  26
  25 ms | ████  6
  29 ms | ███████  10
  30 ms | ████████████████████████████████████████  61
  31 ms | ████████████  19
  32 ms | ██████████████████  28
  33 ms | ███████████████████████████████████████  60
  34 ms | ███████████████████  29
  35 ms | ███████████████  23
  36 ms | ████████████████████████████████  49
  37 ms | █████████████  20
  38 ms | █████████  14
  39 ms | ████  6
  40 ms | ████  6
  41 ms | ████  6
  42 ms | ██  3
  43 ms | ███████  10
  44 ms | ████████████  18
  45 ms | ██████████  16
  46 ms | █████████  14
  47 ms | █████████████  20
  48 ms | ████████████  18
  49 ms | ████████  12
  50 ms | ███  4
  51 ms | ███  5
  52 ms | ███  5
  53 ms | █  1
  54 ms | ██  3
  55 ms | ██  3
  56 ms | █  1
  58 ms | █  1
  59 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `73.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.57`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.82`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.41`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `31.74`, min `16.16`, p50 `28.60`, p95 `53.08`, p99 `57.79`, 1%low `16.46`, 0.1%low `16.16`, std `11.12`

**Frame time (ms)**  avg `35.32`, p50 `34.96`, p95 `53.91`, p99 `59.31`, p99.9 `61.49`, max `61.87`

**Client tick (ms)**  avg `3.75`, p95 `5.26`, max `6.35`

**Memory**  start `659 MB`, end `898 MB`, peak `910 MB`, GC `10 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |                                                                  █             
 34.1 |                                  █      █        █    █          █       █     
 33.4 |   █       █  █     █      █      ██     █ █   █  █    █ █  █     █  █  █ ███   
 32.8 |   █   █   █  █     █    █ ███    ██  █  █ █   ██ █    ███ ███    ██ █ ██ ███ █ 
 32.1 | █ █   █   █  █    ███   █ ██████ ██  ████ █   ██ █ █  ███ ████ █ ██ █ ██ ███ █ 
 31.4 | █ █   █ █ █ ██  █ ███   █ ██████ ██  ████ █ █ ██ ███  ███ ████ █ ████ ██ ███ ██
 30.8 | █ █   █████ ███ █ █████ ████████ ██  ████ █ █ ██ ████████ ██████ ███████ ███ ██
 30.1 | █████ █████ ███ █████████████████████████ █ █ ██ ████████ ██████ ███████ ██████
 29.4 |██████ ███████████████████████████████████████ ███████████ ██████ ██████████████
 28.8 |██████████████████████████████████████████████ ██████████████████ ██████████████
 28.1 |█████████████████████████████████████████████████████████████████ ██████████████
 27.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | █████████████████  15
  18 ms | ████████████████  14
  19 ms | ██████████████  12
  20 ms | ████████████████████████  21
  21 ms | ████████████████████████████████████████  35
  22 ms | █████████████████████████████  25
  23 ms | ███████████████  13
  24 ms | ███████████████  13
  25 ms | █████████████  11
  26 ms | ███████  6
  27 ms | ████████  7
  28 ms | █████████████████  15
  29 ms | █████████  8
  30 ms | ████████████████  14
  31 ms | ██████████████  12
  32 ms | ████████████████████████  21
  33 ms | ████████████████████████████████  28
  34 ms | ███████████████  13
  35 ms | ████████████████████████  21
  36 ms | █████████████████████████  22
  37 ms | ██████████████████████████  23
  38 ms | █████████████████████████████  25
  39 ms | █████████  8
  40 ms | ██████████  9
  41 ms | ██████████  9
  42 ms | ███████  6
  43 ms | █████  4
  44 ms | █████████████████  15
  45 ms | ██████████  9
  46 ms | ██████████  9
  47 ms | ███████████████████  17
  48 ms | ████████████████  14
  49 ms | ███████████████  13
  50 ms | █████████████████  15
  51 ms | █████████████  11
  52 ms | ██████████████  12
  53 ms | ██████████████  12
  54 ms | ██████  5
  55 ms | ████████  7
  56 ms | ██████  5
  57 ms | ███  3
  58 ms | █  1
  59 ms | ██  2
  60 ms | ███  3
  61 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `16.16`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `35.00`
- `fps_harmonic_avg` = `28.32`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `16.46`
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
- `preset_quick` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `28.89`, min `20.43`, p50 `28.99`, p95 `31.61`, p99 `47.03`, 1%low `20.81`, 0.1%low `20.43`, std `4.38`

**Frame time (ms)**  avg `35.29`, p50 `34.50`, p95 `45.72`, p99 `47.64`, p99.9 `48.59`, max `48.94`

**Client tick (ms)**  avg `0.92`, p95 `1.13`, max `2.79`

**Memory**  start `676 MB`, end `630 MB`, peak `894 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 31.7 |               █                                                                
 31.2 |               █   █          █                                                 
 30.7 |               █   █       █  █            █                                    
 30.2 | █   █   █     ██  █       █ ███           █        █       █                   
 29.7 | █   █   █     ███ █       █ ███       █   █     █  █       █                   
 29.2 | ██  █  ██ █   █████      ██ ███ █     ██  █   ███ ██      ███ ██      ██      █
 28.7 |███ ██ ███ ██ ███████  ██ ██ ███ █   █ ███ █ █ ████████ ██████ ██ ██ ██████   ██
 28.2 |██████████ ███████████ █████ ███ █   █████████████████████████ ████████████   ██
 27.7 |████████████████████████████████ ███ ████████████████████████████████████████ ██
 27.2 |████████████████████████████████ ███ ███████████████████████████████████████████
 26.7 |████████████████████████████████████ ███████████████████████████████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  20 ms | █  3
  21 ms | ██  6
  22 ms | ███  8
  23 ms | ██  6
  25 ms |   1
  31 ms | ███  9
  32 ms | █████████████████████████  74
  33 ms | ████████████████████████████████████████  117
  34 ms | ████████████████████████████████████████  116
  35 ms | ████████████████████  59
  36 ms | █████████████████  50
  37 ms | ███████  20
  38 ms | ████  11
  39 ms | ███  10
  40 ms | ████  13
  41 ms | ██  6
  42 ms | ███  8
  43 ms | ██  7
  44 ms | ██  6
  45 ms | █████  14
  46 ms | ███  9
  47 ms | ████  11
  48 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `41.00`
- `fps_1pct_low` = `20.81`
- `fps_harmonic_avg` = `28.34`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `20.43`
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

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23078 ms  |  Sample ticks: 400

**FPS**  avg `28.98`, min `20.18`, p50 `29.40`, p95 `41.27`, p99 `46.35`, 1%low `20.73`, 0.1%low `20.18`, std `4.68`

**Frame time (ms)**  avg `35.27`, p50 `34.01`, p95 `45.48`, p99 `47.56`, p99.9 `48.80`, max `49.55`

**Client tick (ms)**  avg `0.49`, p95 `0.63`, max `0.76`

**Memory**  start `530 MB`, end `453 MB`, peak `916 MB`, GC `4 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 32.0 |  █                              █                                              
 31.5 |  █                              █                     █                  █ █   
 31.0 |  █                        █  █  █                     █                  █ █   
 30.5 |  █ █  █                   █  ██ █  █      █           █       ██ █   █   █ █   
 30.0 |  █ █  █                 █ █  ██ █  █      █ ██        █       ██ █   █   █ █   
 29.4 |  █ █  █  █              █ █  ██ ██ █ █    █ ██        █      ███ ██  █   █ █   
 28.9 |  █ █  █  █ ██ █         █ ██ █████ █ █████████      █ █ █  ████████  █   █ █   
 28.4 |█ █ ██ █ █████ ██████ ████ ██████████ ██████████    ███████ █████████████ █ █ ██
 27.9 |█ █ ██████████████████████ ██████████████████████   █████████████████████████ ██
 27.4 |█ ████████████████████████████████████████████████ ██████████████████████████ ██
 26.9 |█ ████████████████████████████████████████████████ █████████████████████████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms |   2
  21 ms | ███  13
  22 ms | ██  10
  23 ms | █  3
  26 ms |   1
  31 ms |   1
  32 ms | ██████████████  65
  33 ms | ████████████████████████████████████████  186
  34 ms | ██████████████  65
  35 ms | ████████████  54
  36 ms | ███████  32
  37 ms | █████  21
  38 ms | ████  19
  39 ms | ██  9
  40 ms | ██  10
  41 ms | ███  12
  42 ms | ███  12
  43 ms | ██  8
  44 ms | █  6
  45 ms | ████  18
  46 ms | ██  8
  47 ms | ██  7
  48 ms | █  3
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `20.18`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `60.00`
- `fps_harmonic_avg` = `28.35`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `20.73`
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
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `32.18`, min `15.56`, p50 `29.66`, p95 `53.48`, p99 `59.79`, 1%low `16.12`, 0.1%low `15.56`, std `13.03`

**Frame time (ms)**  avg `34.99`, p50 `33.71`, p95 `53.13`, p99 `59.09`, p99.9 `63.63`, max `64.26`

**Client tick (ms)**  avg `3.48`, p95 `5.50`, max `7.12`

**Memory**  start `913 MB`, end `424 MB`, peak `945 MB`, GC `6 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 45.9 |                               █  █                                             
 44.2 |                               █  █                                             
 42.6 | █                             █  █                                             
 40.9 | █                             █  █                                             
 39.3 | █                             █  █                                             
 37.7 | █        █                    █  █                                             
 36.0 | █ █      █  █    █            █  █             █                               
 34.4 | █ █  █ █ █  █ █  █    █  █    █  █  █          █    █              █ █       █ 
 32.7 | █ ████ █ █  █ █  █ ██ █ ███ █ █  █  █   █  ██  ██  ██   █  █ █     █ █    █  ██
 31.1 |██ ████████ █████ █ ██ █ █████ ██ ████████████ ███ ████ ██ █████  ███ ██ ███ ███
 29.5 |███████████████████ ████ ███████████████████████████████████████ ███████████ ███
 27.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
   7 ms | █  1
   9 ms | █  1
  13 ms | █  1
  16 ms | █████  5
  17 ms | ███████████  10
  18 ms | ████████████████  15
  19 ms | ███████████  10
  20 ms | ████████████████  15
  21 ms | ████████████████████████████████████  34
  22 ms | ███████████████████  18
  23 ms | ██████████████  13
  24 ms | ██████████████████████  21
  25 ms | ███████  7
  26 ms | ██████  6
  27 ms | █████  5
  28 ms | ████  4
  29 ms | ████  4
  30 ms | ██████████████████████████████████  32
  31 ms | ███████████████████████████████  29
  32 ms | ██████████████████████████  25
  33 ms | ████████████████████████████████████████  38
  34 ms | ███████████████████  18
  35 ms | ████████████  11
  36 ms | ████████████████████████████████████  34
  37 ms | █████████████████████  20
  38 ms | █████████████  12
  39 ms | ████████  8
  40 ms | █████  5
  41 ms | ███  3
  42 ms | █████  5
  43 ms | █████  5
  44 ms | ███████  7
  45 ms | █████████████  12
  46 ms | ████████████████  15
  47 ms | ███████████████████████████  26
  48 ms | ███████████████████████████████  29
  49 ms | ██████████████  13
  50 ms | █████████  9
  51 ms | ████  4
  52 ms | ███████████  10
  53 ms | ██████  6
  54 ms | █████  5
  55 ms | ██████  6
  56 ms | ███  3
  57 ms | █  1
  58 ms | ███  3
  60 ms | ██  2
  61 ms | █  1
  62 ms | █  1
  63 ms | █  1
  64 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `15.56`
- `preset_long` = `0.00`
- `preload_duration_ms` = `141.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.58`
- `fps_1pct_low` = `16.12`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.06`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `147.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `30.91`, min `16.36`, p50 `29.21`, p95 `53.09`, p99 `57.07`, 1%low `16.92`, 0.1%low `16.36`, std `9.53`

**Frame time (ms)**  avg `35.09`, p50 `34.24`, p95 `51.04`, p99 `56.87`, p99.9 `60.16`, max `61.11`

**Client tick (ms)**  avg `2.85`, p95 `4.55`, max `11.91`

**Memory**  start `1006 MB`, end `589 MB`, peak `1027 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 38.1 |    █                                                                           
 37.0 |    █                                                                           
 36.0 |    █                                                                           
 35.0 | ██ █   █ █           █                                █                        
 34.0 | ██ ██  █ █ █ █       █              █                 █                        
 32.9 | ██ ███ █ ███ █ █  ██ █             ██       █   █  █  █  █ █                   
 31.9 | ██ ███ █ ███ █ ██ ██ █           █ ██  █    ██  █  ██ ██ █ █       █          █
 30.9 | ████████████ █ ██ ████         █ █ ███ ██   ███ █  ██ ██ █ █       █    ██  █ █
 29.8 |█████████████ █████████ █ █  █ ██ ████████ █ █████  ██ ████ ███     █ █  █████ █
 28.8 |█████████████ █████████ ██████████████████ ███████████ ████ ████ █  ███  ███████
 27.8 |████████████████████████████████████████████████████████████████████████ ███████
 26.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █████████  15
  18 ms | ██████████  17
  19 ms | █████  8
  20 ms | ██████  9
  21 ms | █████████  15
  22 ms | ██████  9
  23 ms | ████████  13
  24 ms | ██████████████  22
  25 ms | █████  8
  26 ms | █  1
  27 ms | █  1
  29 ms | ██  3
  30 ms | ██████████████  22
  31 ms | ██████████████████████  36
  32 ms | █████████████████████  34
  33 ms | ████████████████████████████████████████  65
  34 ms | █████████████████  28
  35 ms | █████████████████████████  40
  36 ms | ████████████████████  33
  37 ms | █████████████  21
  38 ms | ████████████  20
  39 ms | ██████  10
  40 ms | █████  8
  41 ms | ██  4
  42 ms | ███  5
  43 ms | ██  3
  44 ms | ██████  9
  45 ms | █████████  15
  46 ms | █████  8
  47 ms | █████████  15
  48 ms | ████████████  20
  49 ms | █████████  15
  50 ms | ██████  9
  51 ms | █████  8
  52 ms | ████  7
  53 ms | █  2
  54 ms | ██  3
  55 ms | █  1
  56 ms | █  2
  57 ms | █  1
  58 ms | █  1
  59 ms | ██  3
  61 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `16.36`
- `preset_long` = `0.00`
- `preload_duration_ms` = `37.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.50`
- `fps_1pct_low` = `16.92`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.57`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `80.46`, min `11.39`, p50 `31.31`, p95 `226.52`, p99 `1295.41`, 1%low `12.64`, 0.1%low `11.39`, std `200.37`

**Frame time (ms)**  avg `31.61`, p50 `31.94`, p95 `66.47`, p99 `72.92`, p99.9 `83.72`, max `87.77`

**Client tick (ms)**  avg `15.24`, p95 `20.97`, max `26.31`

**Memory**  start `514 MB`, end `506 MB`, peak `1093 MB`, GC `29 events / 99 ms`

**FPS over sampling window (ASCII):**

```
584.6 |                                                                            █   
533.7 |                                                                            █   
482.8 |                                                                            █   
432.0 |                                                                            █   
381.1 |                                                                            █   
330.2 |                                                                         █  ██  
279.3 |                                                                         ██ ███ 
228.5 |                                                                         ███████
177.6 |                                                                         ███████
126.7 |                                                  █                      ███████
 75.9 |     █             █           ██ ██           █  █    █     █           ███████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████  10
   1 ms | ████████  7
   2 ms | ███████  6
   3 ms | ██████  5
   4 ms | ███████████████  12
   5 ms | ████████████  10
   6 ms | ██  2
   7 ms | █████  4
   8 ms | ████████████████████████████████  26
   9 ms | ██████  5
  10 ms | █  1
  11 ms | █  1
  12 ms | █  1
  13 ms | ████████  7
  14 ms | ██████████████████  15
  15 ms | ████████████  10
  16 ms | ████████████████████████████████  26
  17 ms | ██████████████████████████████  25
  18 ms | ████████████████████████  20
  19 ms | ████████████  10
  20 ms | █████████████████  14
  21 ms | ███████████  9
  22 ms | ██████████  8
  23 ms | ████████  7
  24 ms | ████████████  10
  25 ms | ███████████  9
  26 ms | ███████  6
  27 ms | ██████  5
  28 ms | █████  4
  29 ms | ███████████████  12
  30 ms | █████████████████  14
  31 ms | ███████████████████████  19
  32 ms | █████████████████████████████  24
  33 ms | ████████████████████████████████████████  33
  34 ms | █████████████████████████  21
  35 ms | ██████████████████████  18
  36 ms | ███████  6
  37 ms | ███████  6
  38 ms | ████████  7
  39 ms | ████████  7
  40 ms | █████  4
  41 ms | █████  4
  42 ms | █████████████  11
  43 ms | ████████████  10
  44 ms | ███████████  9
  45 ms | █████████████  11
  46 ms | █████████████  11
  47 ms | ██████████  8
  48 ms | ████████  7
  49 ms | ██████████████████████  18
  50 ms | ███████████  9
  51 ms | ███████  6
  52 ms | ██████  5
  53 ms | █████  4
  54 ms | ███████  6
  55 ms | ███████  6
  56 ms | ██████  5
  57 ms | ████  3
  58 ms | █  1
  59 ms | █████  4
  61 ms | ██  2
  62 ms | █████  4
  63 ms | ████████  7
  64 ms | ████  3
  66 ms | ██  2
  67 ms | ██  2
  68 ms | █████  4
  69 ms | ████████  7
  70 ms | ████  3
  71 ms | ████  3
  72 ms | ██████  5
  73 ms | █  1
  74 ms | ██  2
  75 ms | █  1
  79 ms | █  1
  81 ms | █  1
  87 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `31.64`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `11.39`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4784.91`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.64`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `37.00`
- `falling_blocks_landed` = `24568.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `185.11`, min `15.73`, p50 `62.04`, p95 `1016.71`, p99 `1570.32`, 1%low `18.12`, 0.1%low `15.73`, std `331.47`

**Frame time (ms)**  avg `17.74`, p50 `16.12`, p95 `40.37`, p99 `51.09`, p99.9 `60.89`, max `63.59`

**Client tick (ms)**  avg `15.59`, p95 `21.58`, max `26.45`

**Memory**  start `518 MB`, end `478 MB`, peak `1100 MB`, GC `29 events / 99 ms`

**FPS over sampling window (ASCII):**

```
563.1 |                                                           █      █             
515.8 |█ █                                                        █      █             
468.5 |█ █                                █           █     █     █     ██      █      
421.2 |█ ██                               █           █     █     █     ██      █     █
373.9 |████                               █     █     █     ██    █     ██      █     █
326.6 |████                    █    █     █     █     █     ██    █     ██      █     █
279.3 |████                    █    █     █     █     ██    ██    █     ██     ██     █
231.9 |████     █    █    █    █    ██    ██    █     ██   ███   ███    ███    ███    █
184.6 |████     █    █    █    █    ██    ██    ██    ██   ███   ███    ███    ███    █
137.3 |████ █   █    ██   ██   ██   ██   ████   ██    ██   ████  ████  ████    ████   █
 90.0 |███████ ████  ██ █████ █████ ███ ███████████████████████████████████████████████
 42.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████  58
   1 ms | ██████████████  55
   2 ms | ██████  24
   3 ms | ██████  22
   4 ms | █████  18
   5 ms | ██████  21
   6 ms | █████████████████  64
   7 ms | █████████████  48
   8 ms | ████████████████████████████████████████  152
   9 ms | ███  12
  10 ms | █  3
  11 ms |   1
  12 ms |   1
  13 ms | █████  19
  14 ms | █████  18
  15 ms | █████████  36
  16 ms | ████████████████████  77
  17 ms | ██████████████  54
  18 ms | ████████  31
  19 ms | ████  14
  20 ms | ████  17
  21 ms | ████  15
  22 ms | ████  16
  23 ms | ██████  24
  24 ms | ███  13
  25 ms | ██  7
  26 ms | ██  9
  27 ms | ███  11
  28 ms | ███  10
  29 ms | ██  9
  30 ms | ████  16
  31 ms | ███████  27
  32 ms | ████████  30
  33 ms | ███████████  40
  34 ms | ██████  24
  35 ms | █████  19
  36 ms | ███  11
  37 ms | ███  13
  38 ms | ███  13
  39 ms | ███  11
  40 ms | ███  10
  41 ms | █  5
  42 ms | █  3
  43 ms | █  5
  44 ms |   1
  45 ms |   1
  46 ms | █  4
  47 ms | ██  7
  48 ms | █  5
  49 ms | ██  6
  50 ms | █  4
  51 ms | █  4
  52 ms |   1
  53 ms | █  2
  54 ms | █  4
  61 ms |   1
  63 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `56.36`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `15.73`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4796.63`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `18.12`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `8.00`
- `falling_blocks_landed` = `25288.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `331.63`, min `21.27`, p50 `95.94`, p95 `1510.11`, p99 `2060.74`, 1%low `22.04`, 0.1%low `21.28`, std `513.20`

**Frame time (ms)**  avg `12.35`, p50 `10.42`, p95 `32.99`, p99 `43.68`, p99.9 `46.97`, max `47.01`

**Client tick (ms)**  avg `1.73`, p95 `2.33`, max `9.24`

**Memory**  start `1003 MB`, end `739 MB`, peak `1119 MB`, GC `5 events / 23 ms`

**FPS over sampling window (ASCII):**

```
679.9 |                                                                    █           
620.9 |                                                                    █           
561.9 |                                                         █          █  █        
502.9 |██ █                                                     █     ████ █  █        
443.8 |█████  ██                        █                █   █  █   █ ████ █  █        
384.8 |█████████               █  █ █   █  █ █ ███ █     █  ██  ██ ███████ █  █        
325.8 |█████████ ███  █████  █ █ ██ █ █ █████████████ █████ ██████████████ █████       
266.8 |████████████████████ ████████████████████████████████████████████████████       
207.8 |████████████████████ ████████████████████████████████████████████████████       
148.8 |█████████████████████████████████████████████████████████████████████████       
 89.8 |█████████████████████████████████████████████████████████████████████████       
 30.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████████████████████  265
   1 ms | ████████  68
   2 ms | ███  23
   3 ms |   4
   4 ms |   1
   5 ms | █  12
   6 ms | ██████████  78
   7 ms | █  6
   8 ms | ████████████████████████████████████████  321
   9 ms | █  8
  10 ms | ████████  61
  11 ms | █  7
  12 ms | █  7
  13 ms | ███████  60
  14 ms | ███████████  87
  15 ms | ███████████  91
  16 ms | ███████████████  117
  17 ms | ██████████  78
  18 ms | █████████  72
  19 ms | ████  34
  20 ms | ███  23
  21 ms | ███  28
  22 ms | █  12
  23 ms | █  10
  24 ms | █  5
  25 ms |   1
  26 ms | █  5
  27 ms |   2
  28 ms | █  5
  29 ms | █  5
  30 ms | █  9
  31 ms | ██  13
  32 ms | ██  20
  33 ms | ██  16
  34 ms | ██  13
  35 ms | █  6
  36 ms |   2
  37 ms |   4
  38 ms | █  5
  39 ms | █  6
  40 ms |   2
  41 ms |   2
  42 ms | █  6
  43 ms |   4
  44 ms | █  7
  45 ms |   3
  46 ms |   4
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `80.95`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `21.28`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `22.04`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `54.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `31.96`, min `17.23`, p50 `29.03`, p95 `49.07`, p99 `54.08`, 1%low `19.74`, 0.1%low `17.23`, std `10.11`

**Frame time (ms)**  avg `33.40`, p50 `34.45`, p95 `44.90`, p99 `47.78`, p99.9 `53.31`, max `58.04`

**Client tick (ms)**  avg `1.82`, p95 `2.44`, max `2.92`

**Memory**  start `673 MB`, end `901 MB`, peak `1133 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 41.5 |          █              █                                                      
 40.4 |        █ █              █                                                      
 39.2 |        █ █              █                                                      
 38.1 |        █ ███            █                                                      
 36.9 |        █ ███            █                                                      
 35.7 |        █ ███   █        █                                                      
 34.6 |        █ ███   █        █              █      █                 █     █        
 33.4 |    █   █ ███   █  █ █   █           █ ██      █          █      █    ██       █
 32.3 |  █ █ █ █████ █ █  █ █   █ ████   ████ ██    █ ██  █ █    █      █    ██ ███   █
 31.1 |█ █████ ██████████ █ ██  ██████ █ ██████████ █ ███ █ ███  █ ███  ███  ██ ████  █
 30.0 |█ ██████████████████ ███ ███████████████████████████████████████ ███████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | █  1
   9 ms | █  1
  10 ms | █  1
  11 ms | █  2
  18 ms | ███  5
  19 ms | ██████████  15
  20 ms | ████████████  18
  21 ms | ████████████  18
  22 ms | █████████  14
  23 ms | ████████  13
  24 ms | ████████  12
  25 ms | ██████████  15
  26 ms | █████  8
  27 ms | ██████████  16
  28 ms | ██████████  15
  29 ms | ███████  11
  30 ms | █████████████  20
  31 ms | █████████████████  26
  32 ms | █████████████████████  33
  33 ms | ███████████████████████████  42
  34 ms | ██████████████████████████  41
  35 ms | ████████████████████████████████████████  62
  36 ms | ███████████████████  30
  37 ms | ███████████████████  29
  38 ms | ███████████████  24
  39 ms | ██████████████  22
  40 ms | ████████████  18
  41 ms | ███████  11
  42 ms | █████████  14
  43 ms | ████████████  18
  44 ms | ███████████  17
  45 ms | █████  8
  46 ms | █████  8
  47 ms | ████  6
  48 ms | ██  3
  50 ms | █  2
  58 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `17.23`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.04`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `19.74`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `64.00`
- `falling_blocks_landed` = `3381.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `31.30`, min `20.26`, p50 `29.48`, p95 `45.83`, p99 `49.90`, 1%low `20.95`, 0.1%low `20.26`, std `7.08`

**Frame time (ms)**  avg `33.40`, p50 `33.93`, p95 `44.79`, p99 `46.33`, p99.9 `48.53`, max `49.35`

**Client tick (ms)**  avg `0.65`, p95 `0.83`, max `0.92`

**Memory**  start `1100 MB`, end `906 MB`, peak `1148 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                                                                    █   █       
 33.6 |     █     █       █                                                █   █       
 33.1 |     █     █       █              █          █                    █ █   █  █    
 32.7 |     ██    █       █            █ █          █    █             █ █ █  ██  █  █ 
 32.2 |     ██  █ █  █    █     █      █ █ █  █     ██  ██   █   █   █ █ █ █  ██  █  █ 
 31.8 |  █  ██  █ █ ██ ██ █     █      █ █ █  █     ███ ██   █   █   █ █ █ █ ███  █  █ 
 31.3 | ██  ██  ██████ ██ █     █      █ █ █  ██ █  ███ ██ █ █   █   █ █ █ █ ███  █  ██
 30.9 |████ ██  █████████ ███   █ █ ██ ██████ ██ █  ███ ██████   █████ █ █ █ ███ ██  ██
 30.5 |████████ █████████ ████ ██ ██████████████ █  ███ ████████ ███████ █ █████ ██ ███
 30.0 |████████ █████████ ███████ █████████████████ ████████████████████ █ █████ ██████
 29.6 |████████ █████████ █████████████████████████ ████████████████████ ██████████████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  19 ms | ███  4
  20 ms | ████████  11
  21 ms | ██████████████████  24
  22 ms | ██████████████████  24
  23 ms | █████████████  17
  24 ms | ████  5
  25 ms | ████████████  16
  26 ms | ███████  10
  27 ms | ██████████████  19
  28 ms | ███████████  15
  29 ms | ████████████  16
  30 ms | █████████████  17
  31 ms | ████████████████  22
  32 ms | ████████████████████████████████████  49
  33 ms | ████████████████████████████████████████  54
  34 ms | ████████████████████████████████████████  54
  35 ms | ██████████████████████████████  40
  36 ms | ████████████████████  27
  37 ms | █████████████████████████  34
  38 ms | █████████████████████  28
  39 ms | ██████████████  19
  40 ms | ██████████████  19
  41 ms | ██████████  13
  42 ms | ██████████  13
  43 ms | ███████  9
  44 ms | █████████  12
  45 ms | ████████████  16
  46 ms | ████  5
  47 ms | ███  4
  49 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.95`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `20.26`
- `seed` = `5099.00`
- `preload_duration_ms` = `49.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `30.95`, min `20.89`, p50 `30.11`, p95 `44.58`, p99 `49.00`, 1%low `21.44`, 0.1%low `20.89`, std `5.97`

**Frame time (ms)**  avg `33.38`, p50 `33.21`, p95 `44.30`, p99 `45.82`, p99.9 `47.83`, max `47.86`

**Client tick (ms)**  avg `0.27`, p95 `0.32`, max `0.37`

**Memory**  start `528 MB`, end `684 MB`, peak `684 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 35.5 |                         █                                                      
 34.9 |                         █                                                      
 34.3 |█                        █                                                      
 33.7 |█                        █ █                                  █   █             
 33.0 |█         █              █ █       █             █            █   █       █     
 32.4 |█  █     ██   █   █      █ █       █      █    █ █   █     █  █   █       █     
 31.8 |█  █     ███ ██   █      █ █     █ █ █    █    █ █ █ █     █  █   █ █     █    █
 31.2 |█  █    ████ ██   █      █ █ █   █ █ █  █ ███  █ █ █ █ ██ ██ ██   █ █     █ █ ██
 30.6 |█  █ ███████ ██  ██ █ █  ███████ █ █ █ ██ ███  █ ███ ███████ ████ █ ███ █ █ █ ██
 30.0 |████████████ ███████████ ███████ █ █ ████ ███ ██ ███ ███████ ████ ██████████████
 29.4 |██████████████████████████████████ ██████ ██████ ███ ███████ ████ ██████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  3
  20 ms | ██  8
  21 ms | ███  11
  22 ms | ████  13
  23 ms | ████  13
  24 ms | ████  14
  25 ms | ██  9
  26 ms | ██  7
  27 ms | ██  9
  28 ms | █████  20
  29 ms | ██  8
  30 ms | ███████  26
  31 ms | ███████████  39
  32 ms | █████████████████████  78
  33 ms | ████████████████████████████████████████  148
  34 ms | ██████  22
  35 ms | ██████  22
  36 ms | ████  13
  37 ms | ██████  23
  38 ms | ███  12
  39 ms | ████  13
  40 ms | █████  20
  41 ms | ███  11
  42 ms | ██  7
  43 ms | ████  16
  44 ms | ████  16
  45 ms | ███  12
  46 ms | █  3
  47 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `65.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `21.44`
- `fps_harmonic_avg` = `29.96`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `20.89`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `30.95`, min `21.08`, p50 `30.16`, p95 `44.54`, p99 `47.15`, 1%low `21.65`, 0.1%low `21.08`, std `5.92`

**Frame time (ms)**  avg `33.39`, p50 `33.15`, p95 `44.78`, p99 `45.53`, p99.9 `47.19`, max `47.43`

**Client tick (ms)**  avg `0.23`, p95 `0.28`, max `0.40`

**Memory**  start `516 MB`, end `554 MB`, peak `1128 MB`, GC `3 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 33.6 |      █                        █                                                
 33.2 |      █                        █                              █                 
 32.8 |      █                  █     █                     █   █    █                 
 32.4 | █    █        █   █     █   █ █        █ █      █   █   █    █        █        
 32.0 |███ █ █        █   █     █   █ █        █ █      █   █   █    █        █  █ █   
 31.6 |█████ █   █  █ █   █    ██ █ █ █   █  █ █ █   █  ██  █   ██   █  █  █  █  █ █   
 31.2 |█████ █   █  █ █   █    ██ █ █ █   █  █ █ █   ██ ███ █   ███  █  █  ██ █  █ █   
 30.8 |█████ █ █ █  █ █   █ █ ███ █████ ███  █ █ █ █ ██ ███ ██  ████ █ ██  ██ █ ████  █
 30.4 |█████ █ █ ██ ███  ████████ ██████████ █ █ █ █ ██ ███ ██  ████ █ ██ █████ █████ █
 29.9 |█████ █████████████████████████████████ █████ ██ ███ ███ ███████████████████████
 29.5 |█████ █████████████████████████████████ ████████████ ███ ███████████████████████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  4
  21 ms | █████  17
  22 ms | █████  15
  23 ms | █████  17
  24 ms | ███  9
  25 ms | █  4
  26 ms | ████  12
  27 ms | █████  15
  28 ms | ████  14
  29 ms | █████  17
  30 ms | █████████  29
  31 ms | ███████████████████  58
  32 ms | ████████████████████  63
  33 ms | ████████████████████████████████████████  125
  34 ms | ████████  26
  35 ms | ██████  18
  36 ms | ██████  20
  37 ms | ████  12
  38 ms | █████  17
  39 ms | █████  17
  40 ms | ████  14
  41 ms | █████  17
  42 ms | ██  5
  43 ms | ███  10
  44 ms | ███████  21
  45 ms | ██████  20
  47 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `29.95`
- `preload_duration_ms` = `68.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.65`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2240.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `21.08`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `31.23`, min `19.64`, p50 `29.60`, p95 `46.39`, p99 `50.59`, 1%low `20.90`, 0.1%low `19.64`, std `6.96`

**Frame time (ms)**  avg `33.41`, p50 `33.79`, p95 `44.09`, p99 `46.00`, p99.9 `48.90`, max `50.91`

**Client tick (ms)**  avg `0.28`, p95 `0.37`, max `0.49`

**Memory**  start `681 MB`, end `655 MB`, peak `1085 MB`, GC `1 events / 5 ms`

**FPS over sampling window (ASCII):**

```
 34.6 |                                                             █                  
 34.1 |                 █              █                            █                  
 33.6 |                 █              █                        █   █          █    █  
 33.0 |                 █              █                        █   █    █     █    █  
 32.5 |             █   █     █   █    █ █      █ █     █       █   █    █ █   █   ██  
 31.9 |          ██ █   █  █  █   █    █ █     ██ █     █  █    █   █    █ █ █ █   ██ █
 31.4 | █  ██ █ ██████  █  █  ██ ██  █ █ ██  █ ██ █  █  █ ██  █ ██  █ ████ █ █ █   ██ █
 30.9 |███ ████ ███████ █  ██ ██ ██ ██ █ ████████ ████ ██ ██  █ █████ ████ █ █ █  ███ █
 30.3 |███ ████████████ ██ ██ █████ ██ █ ████████ ███████ ██  ████████████ ███ ██ ███ █
 29.8 |████████████████ ███████████ ████ ████████████████ ████████████████████ ██████ █
 29.3 |█████████████████████████████████ ██████████████████████████████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms | ███  7
  20 ms | █████  12
  21 ms | █████████  20
  22 ms | ███████  17
  23 ms | ████████  18
  24 ms | ██████  13
  25 ms | ████  10
  26 ms | ████  10
  27 ms | █████  11
  28 ms | ███████  17
  29 ms | ██████  14
  30 ms | ███████████  25
  31 ms | ██████████  23
  32 ms | ████████████  29
  33 ms | ████████████████████████████████████████  94
  34 ms | ████████████████████  47
  35 ms | █████████████  30
  36 ms | ██████████████  34
  37 ms | ██████████████  33
  38 ms | ███████████  25
  39 ms | ██████████  24
  40 ms | ██████  15
  41 ms | █████  12
  42 ms | ██████  15
  43 ms | █████  11
  44 ms | ██████  14
  45 ms | █████  12
  46 ms |   1
  47 ms | ██  4
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.90`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `29.93`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `19.64`
- `seed` = `4027.00`
- `preload_duration_ms` = `61.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `31.13`, min `20.74`, p50 `29.66`, p95 `45.77`, p99 `48.91`, 1%low `21.47`, 0.1%low `20.74`, std `6.57`

**Frame time (ms)**  avg `33.39`, p50 `33.71`, p95 `44.22`, p99 `45.56`, p99.9 `47.30`, max `48.21`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `0.43`

**Memory**  start `889 MB`, end `1073 MB`, peak `1073 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 34.1 |                                   █    █                                       
 33.6 |   █         █                     █  █ █                                       
 33.2 |   █         █                     █  █ █                                       
 32.8 |   █         █      █              █  █ █     █                             █   
 32.3 |   █     █   █      █             ██  █ █     █   █ █                     █ █ █ 
 31.9 |   ██    █   █    █ █     █ ███   ██  █ █     █   █ █     █ █             █ █ █ 
 31.5 |█  ██  █ █   █    █ █     █████ █ ██  █ █ █   ██  █ █ █   █ █ █   ██      █ █ █ 
 31.1 |█ ███ ██ █  ██ ████ █  █  ███████ ██  █ █ █  ███  █ █ █   ███ █   ██  █   █ █ █ 
 30.6 |█ ███ ██ █  ███████ ██ █  ███████ ██  █ ███  ████ █ ████  ███ ██ ████ ██  █ █ █ 
 30.2 |█████ ████  ███████ ███████████████████████████████ ████  ███████████ ██  █ █ █ 
 29.8 |████████████████████████████████████████████████████████ ██████████████████ ████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  2
  20 ms | ████  11
  21 ms | ███████  20
  22 ms | █████  15
  23 ms | ████  11
  24 ms | ██████  18
  25 ms | █████  15
  26 ms | █████  16
  27 ms | ███  10
  28 ms | ████  13
  29 ms | █████  14
  30 ms | ██████  19
  31 ms | ███████  23
  32 ms | ████████  25
  33 ms | ████████████████████████████████████████  123
  34 ms | ██████████████  43
  35 ms | █████████████  41
  36 ms | ████████████  38
  37 ms | ████████  25
  38 ms | ██████  17
  39 ms | █████  14
  40 ms | █████  14
  41 ms | ███  10
  42 ms | ████  13
  43 ms | ████  12
  44 ms | ██████  19
  45 ms | ████  13
  46 ms | █  3
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.95`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `21.47`
- `fps_0p1pct_low` = `20.74`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `34.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `31.73`, min `16.53`, p50 `29.27`, p95 `47.59`, p99 `51.92`, 1%low `19.39`, 0.1%low `16.53`, std `9.38`

**Frame time (ms)**  avg `33.49`, p50 `34.16`, p95 `45.12`, p99 `48.18`, p99.9 `54.58`, max `60.48`

**Client tick (ms)**  avg `0.34`, p95 `0.60`, max `0.95`

**Memory**  start `627 MB`, end `1226 MB`, peak `1437 MB`, GC `46 events / 231 ms`

**FPS over sampling window (ASCII):**

```
 48.0 |                                                                █               
 46.2 |                                                                █               
 44.4 |                                                                █               
 42.6 |                                                                █               
 40.8 |                                                                █               
 39.0 |                                                                █               
 37.2 |                                                                █               
 35.4 |                 █                           █                  █         █     
 33.6 |      █   █ █    █ █      █     █        █  ██                  █   █ █   █   █ 
 31.8 | ██   ██  █ ██ ███ █ ██ █ █████ █ ███   ██  ███  █ ██  ██ ███████ █ █ ██  ███ ██
 30.0 |███████████ ██████ ██████████████████████████████████████████████████████ ██████
 28.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
  16 ms | █  1
  17 ms | █  2
  18 ms | █  2
  19 ms | █████  7
  20 ms | ████████████  17
  21 ms | ██████████████  20
  22 ms | ██████████████  20
  23 ms | ███████████  16
  24 ms | ███████████████  21
  25 ms | ██████████████  20
  26 ms | █████████  13
  27 ms | █████████  12
  28 ms | ██████████████  19
  29 ms | █████████  13
  30 ms | ███████████  16
  31 ms | █████████  12
  32 ms | ██████████████████████████  36
  33 ms | ███████████████████████████  38
  34 ms | ████████████████████████████████████████  56
  35 ms | ██████████████████████████  37
  36 ms | █████████████████  24
  37 ms | █████████████████████  29
  38 ms | ███████████  16
  39 ms | █████████████████  24
  40 ms | ███████████████████  27
  41 ms | ██████████  14
  42 ms | ██████████  14
  43 ms | ██████████████  20
  44 ms | ████████████  17
  45 ms | ██████████  14
  46 ms | █████  7
  47 ms | ███  4
  48 ms | ██  3
  49 ms | █  2
  50 ms | █  2
  60 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `fps_1pct_low` = `19.39`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.53`
- `seed` = `7411.00`
- `preload_duration_ms` = `23.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23451 ms  |  Sample ticks: 400

**FPS**  avg `32.18`, min `15.55`, p50 `29.23`, p95 `48.62`, p99 `56.81`, 1%low `17.40`, 0.1%low `15.55`, std `14.97`

**Frame time (ms)**  avg `33.56`, p50 `34.21`, p95 `45.41`, p99 `49.40`, p99.9 `63.06`, max `64.31`

**Client tick (ms)**  avg `0.36`, p95 `0.52`, max `4.55`

**Memory**  start `1327 MB`, end `1147 MB`, peak `1844 MB`, GC `34 events / 227 ms`

**FPS over sampling window (ASCII):**

```
 63.1 |                                                                       █        
 60.0 |                                                                       █        
 56.9 |                                        █                              █        
 53.8 |                                        █                              █        
 50.7 |                                        █                              █        
 47.6 |                                        █                              █        
 44.5 |                                        █                              █        
 41.4 |                                        █                              █        
 38.2 |                                        █                              █        
 35.1 |   █     █          █  █   █        █   █       █              █    █  █        
 32.0 |  ██ ██████ █████ ███ ██ █████ ██████ █████████ ██ █  ██ ██ ██ █ █████ █ ██ ███ 
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   4 ms | █  1
  17 ms | ████  6
  18 ms | ██  4
  19 ms | ██████  11
  20 ms | ████████████  21
  21 ms | ███████████  19
  22 ms | ████████  14
  23 ms | ██████  10
  24 ms | ██████  10
  25 ms | █████████  16
  26 ms | ███████  12
  27 ms | █████  9
  28 ms | ██████  11
  29 ms | ██████  11
  30 ms | █████████  15
  31 ms | ████████████████  27
  32 ms | ████████████████████  34
  33 ms | ████████████████████████████████  54
  34 ms | ████████████████████████████████████████  68
  35 ms | ██████████████████████  38
  36 ms | ██████████████████  31
  37 ms | █████████████  22
  38 ms | ████████████  21
  39 ms | ████████████  20
  40 ms | ████████  13
  41 ms | ████████████  20
  42 ms | ███████████  18
  43 ms | ██████  11
  44 ms | ████████  13
  45 ms | ██████  11
  46 ms | █████  8
  47 ms | ██  3
  48 ms | ███  5
  49 ms | ██  3
  52 ms | █  1
  56 ms | █  1
  59 ms | █  1
  62 ms | █  1
  64 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `fps_1pct_low` = `17.40`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.55`
- `seed` = `7417.00`
- `preload_duration_ms` = `374.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `32.13`, min `14.42`, p50 `29.55`, p95 `49.89`, p99 `54.99`, 1%low `16.83`, 0.1%low `14.42`, std `12.18`

**Frame time (ms)**  avg `33.47`, p50 `33.84`, p95 `45.88`, p99 `52.58`, p99.9 `64.17`, max `69.36`

**Client tick (ms)**  avg `0.37`, p95 `0.56`, max `3.93`

**Memory**  start `1435 MB`, end `2043 MB`, peak `2076 MB`, GC `25 events / 184 ms`

**FPS over sampling window (ASCII):**

```
 57.9 |                                                                          █     
 55.2 |                                                                          █     
 52.6 |                                                                          █     
 49.9 |                                                                          █     
 47.2 |                                                                          █     
 44.5 |                                                                          █     
 41.9 |                                                                          █     
 39.2 |                                                                          █     
 36.5 |                                                █           ██          █ █ █   
 33.8 |     █ █ █              █      █ █    █   ███  ██      █    ██  █  █   ██ █ ██  
 31.2 |██████████ █████████████████ ███ ██████████████████ ██ ████ ███████████████████ 
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
  14 ms | █  1
  16 ms | █  1
  17 ms | ██  3
  18 ms | █████  7
  19 ms | ███████████  17
  20 ms | ██████████████  22
  21 ms | ██████████  16
  22 ms | █████████████  20
  23 ms | ███████  11
  24 ms | █████████  14
  25 ms | ███████  11
  26 ms | ██████  9
  27 ms | █████  7
  28 ms | █████████  13
  29 ms | ████████  12
  30 ms | ███████  10
  31 ms | █████████████  20
  32 ms | █████████████████████████████████████  57
  33 ms | ████████████████████████████████████████  61
  34 ms | █████████████████████████████████  51
  35 ms | █████████████████████  32
  36 ms | █████████████████  26
  37 ms | ██████████████  22
  38 ms | ███████  11
  39 ms | ████████████████  24
  40 ms | ██████████  16
  41 ms | ████████████  18
  42 ms | ████████████  19
  43 ms | ███████  11
  44 ms | █████  8
  45 ms | ███████████  17
  46 ms | ███████  11
  47 ms | ███  5
  48 ms | █  2
  49 ms | █  2
  50 ms | █  2
  52 ms | █  1
  53 ms | █  1
  56 ms | █  1
  57 ms | █  1
  59 ms | █  1
  60 ms | █  1
  69 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `fps_1pct_low` = `16.83`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.87`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.42`
- `seed` = `7433.00`
- `preload_duration_ms` = `20.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `33.66`, min `15.18`, p50 `29.50`, p95 `48.96`, p99 `56.16`, 1%low `16.91`, 0.1%low `15.18`, std `34.91`

**Frame time (ms)**  avg `33.51`, p50 `33.90`, p95 `46.14`, p99 `50.68`, p99.9 `65.42`, max `65.87`

**Client tick (ms)**  avg `0.34`, p95 `0.46`, max `0.90`

**Memory**  start `1565 MB`, end `1639 MB`, peak `2205 MB`, GC `25 events / 201 ms`

**FPS over sampling window (ASCII):**

```
133.7 |               █                                                                
124.2 |               █                                                                
114.6 |               █                                                                
105.1 |               █                                                                
 95.5 |               █                                                                
 86.0 |               █                                                                
 76.4 |               ██                                                               
 66.9 |               ██                                                               
 57.3 |               ██          █                                                    
 47.7 |               ██          █                                                    
 38.2 |  █   █        ██          █ █    █     ██   █    █              █   █    █     
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   2 ms | █  1
   3 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | ██  3
  18 ms | █  2
  19 ms | ███████  13
  20 ms | ████████████  22
  21 ms | ███████████  20
  22 ms | ███████  12
  23 ms | ████████  14
  24 ms | █████████  16
  25 ms | ███████  13
  26 ms | ████  8
  27 ms | █████  9
  28 ms | ████████  14
  29 ms | ███████  13
  30 ms | ██████  10
  31 ms | ███████  13
  32 ms | ███████████████████████████  48
  33 ms | ████████████████████████████████████████  72
  34 ms | ████████████████████████████████  57
  35 ms | ██████████████████  32
  36 ms | ████████████████  28
  37 ms | ███████████████  27
  38 ms | ██████████  18
  39 ms | █████████  16
  40 ms | ████████████  21
  41 ms | █████  9
  42 ms | ████████  14
  43 ms | ████  8
  44 ms | ████  8
  45 ms | ████████  14
  46 ms | ███████████  19
  47 ms | ████  8
  48 ms | █  2
  49 ms | █  1
  50 ms | █  2
  53 ms | █  2
  55 ms | █  1
  61 ms | █  1
  65 ms | █  2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `fps_1pct_low` = `16.91`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.84`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.18`
- `seed` = `7451.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `31.72`, min `17.91`, p50 `29.54`, p95 `47.68`, p99 `51.75`, 1%low `19.32`, 0.1%low `17.91`, std `11.34`

**Frame time (ms)**  avg `33.48`, p50 `33.85`, p95 `44.97`, p99 `49.76`, p99.9 `54.55`, max `55.84`

**Client tick (ms)**  avg `0.33`, p95 `0.44`, max `1.01`

**Memory**  start `1815 MB`, end `1124 MB`, peak `2338 MB`, GC `22 events / 184 ms`

**FPS over sampling window (ASCII):**

```
 58.6 |        █                                                                       
 55.9 |        █                                                                       
 53.2 |        █                                                                       
 50.5 |        █                                                                       
 47.8 |        █                                                                       
 45.1 |        █                                                                       
 42.4 |        █                                                                       
 39.7 |        █                                                                       
 37.0 |        █                                █                                      
 34.3 | █      █  █        █  █ █            █  █              █   █     █  █          
 31.6 |███ █████  ████ ███ ████ ████ ██ ███ ███████ ███ ████████ █ ███████ █████ ██████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
  18 ms | ██  4
  19 ms | ██████  10
  20 ms | ██████████  16
  21 ms | █████████  15
  22 ms | █████████████  22
  23 ms | ██████████  17
  24 ms | ████████  13
  25 ms | █████  9
  26 ms | ████████  14
  27 ms | ████  7
  28 ms | ██████  10
  29 ms | ███████████  19
  30 ms | █████████████  22
  31 ms | ██████████████  23
  32 ms | ██████████████████████████  43
  33 ms | ████████████████████████████████████████  67
  34 ms | ████████████████████████████████  53
  35 ms | █████████████████████  35
  36 ms | █████████████████  29
  37 ms | ██████████████████  30
  38 ms | ███████████  19
  39 ms | ██████  10
  40 ms | ████████  14
  41 ms | ████████  13
  42 ms | █████████  15
  43 ms | ██████████████  24
  44 ms | █████████  15
  45 ms | █████  9
  46 ms | ███████  12
  48 ms | █  1
  49 ms | ██  3
  50 ms | █  1
  51 ms | █  1
  53 ms | █  1
  55 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `fps_1pct_low` = `19.32`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `63.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.87`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.91`
- `seed` = `7457.00`
- `preload_duration_ms` = `68.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-54.00`
- `entity_count_sample_start` = `55.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24300 ms  |  Sample ticks: 400

**FPS**  avg `32.92`, min `16.18`, p50 `28.94`, p95 `49.06`, p99 `54.26`, 1%low `17.74`, 0.1%low `16.18`, std `29.25`

**Frame time (ms)**  avg `33.52`, p50 `34.56`, p95 `45.45`, p99 `49.74`, p99.9 `61.73`, max `61.79`

**Client tick (ms)**  avg `0.37`, p95 `0.45`, max `11.22`

**Memory**  start `1700 MB`, end `1735 MB`, peak `2348 MB`, GC `21 events / 173 ms`

**FPS over sampling window (ASCII):**

```
128.2 |                                                                      █         
119.1 |                                                                      █         
109.9 |                                                                      █         
100.8 |                                                                      █         
 91.7 |                                                                      █         
 82.5 |                                                                      █         
 73.4 |                                                                      █         
 64.3 |                                                                      █         
 55.2 |                                                                      █         
 46.0 |                                                                      █         
 36.9 |      █    ██ █ █  █ █    █  ██ █   █  █  █  █ █ █ █ █     ██ █  █ █  █ █ █ ██ █
 27.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | █  1
  18 ms | ███  3
  19 ms | ███████████████  16
  20 ms | █████████████████████  23
  21 ms | █████████████████████████  28
  22 ms | ███████████████  16
  23 ms | ██████████████████  20
  24 ms | ██████████  11
  25 ms | ██████████████  15
  26 ms | ███████  8
  27 ms | ███████████████  17
  28 ms | ████████████  13
  29 ms | ██████████  11
  30 ms | ███████████████  17
  31 ms | ███████████████  16
  32 ms | ███████████████████  21
  33 ms | ████████████████████████████████  35
  34 ms | ████████████████████████████████████████  44
  35 ms | ████████████████████████████████████  40
  36 ms | ████████████████████████  26
  37 ms | █████████████████████████  27
  38 ms | ██████████████████████  24
  39 ms | █████████████████████████████  32
  40 ms | ██████████████████████████████  33
  41 ms | ███████████████  17
  42 ms | ██████████  11
  43 ms | ███████████████  17
  44 ms | █████████████  14
  45 ms | ████████████  13
  46 ms | ██████████  11
  47 ms | ████  4
  48 ms | ██  2
  49 ms | █  1
  50 ms | █  1
  51 ms | █  1
  53 ms | █  1
  58 ms | █  1
  61 ms | ██  2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `fps_1pct_low` = `17.74`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.84`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.18`
- `seed` = `7477.00`
- `preload_duration_ms` = `1240.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-2.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `31.55`, min `17.53`, p50 `29.54`, p95 `48.21`, p99 `55.74`, 1%low `19.24`, 0.1%low `17.53`, std `8.17`

**Frame time (ms)**  avg `33.52`, p50 `33.86`, p95 `45.91`, p99 `49.47`, p99.9 `54.55`, max `57.05`

**Client tick (ms)**  avg `0.33`, p95 `0.57`, max `0.92`

**Memory**  start `2028 MB`, end `1822 MB`, peak `2332 MB`, GC `22 events / 177 ms`

**FPS over sampling window (ASCII):**

```
 35.1 |                         █  █                                                  █
 34.5 |                █        █  █    █    █                                █       █
 34.0 |               ██        █  █    █    █                             █  ██ █  █ █
 33.4 |      █        ██  █ █   █  █    █    █          █             █    █  ██ █  █ █
 32.9 |   █  █        ██  █ █   █  █ █  █    █ █        █  █     █    █    █  ██ █  █ █
 32.3 |   █  ██    █  ██  █ █   █  █ █  █ █  █ █  █     █  █     █    ███  █  ██ █  █ █
 31.7 | █ █  ████  █  ██  █ ██  █  █ █ ██ ██ █ █  █     █ ██   █ █    ███  █  ██ █  █ █
 31.2 | █ █  ████ ██  ███ █ ██  █  █ ████ ██████████    █ ██   █ █    ███  █  ████  █ █
 30.6 |█████ ████ ██ ████ █ ██ ███ █ ████ ██████████  █ ████  ██ ██  █████ ██ ████  ███
 30.1 |██████████████████ █ ██████ ██████████████████ █ ████ ███████ █████ ██ █████████
 29.5 |████████████████████ ████████████████████████████████████████ █████ ████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | █  1
  16 ms | █  2
  17 ms | ██  4
  18 ms | ██  4
  19 ms | ███████  12
  20 ms | ██████████  17
  21 ms | ███████████  19
  22 ms | ████████  13
  23 ms | ████████  14
  24 ms | █████████  15
  25 ms | █████  8
  26 ms | █████████  15
  27 ms | ████  6
  28 ms | ████  6
  29 ms | ███████  11
  30 ms | ███████  12
  31 ms | █████████████████████  35
  32 ms | █████████████████████████████  49
  33 ms | ███████████████████████████████████████  65
  34 ms | ████████████████████████████████████████  67
  35 ms | ██████████████████████  37
  36 ms | ████████████████  26
  37 ms | ███████  12
  38 ms | █████████████  21
  39 ms | ████████  14
  40 ms | ███████  11
  41 ms | ███████  11
  42 ms | █████████████  21
  43 ms | ██████████  16
  44 ms | ████████  14
  45 ms | ███████  11
  46 ms | █████████  15
  47 ms | ███  5
  48 ms | █  1
  49 ms | ██  3
  51 ms | █  2
  52 ms | █  1
  57 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `fps_1pct_low` = `19.24`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.53`
- `seed` = `7481.00`
- `preload_duration_ms` = `35.00`
- `entity_count_sample_end` = `5.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-17.00`
- `entity_count_sample_start` = `22.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24870 ms  |  Sample ticks: 400

**FPS**  avg `32.73`, min `15.12`, p50 `29.45`, p95 `48.85`, p99 `57.31`, 1%low `17.49`, 0.1%low `15.12`, std `23.54`

**Frame time (ms)**  avg `33.49`, p50 `33.96`, p95 `45.73`, p99 `50.87`, p99.9 `62.61`, max `66.14`

**Client tick (ms)**  avg `0.30`, p95 `0.45`, max `0.61`

**Memory**  start `886 MB`, end `1368 MB`, peak `2186 MB`, GC `22 events / 183 ms`

**FPS over sampling window (ASCII):**

```
102.3 |                                                                    █           
 95.6 |                                                                    █           
 88.9 |                                                                    █           
 82.2 |                                                                    █           
 75.5 |                                                                    █           
 68.9 |                                                                    █           
 62.2 |                                                                    █           
 55.5 |                                                                    █         █ 
 48.8 |                                                                    █         █ 
 42.1 |                                                                    █         █ 
 35.4 |█   █   █ █    █  █ █ ██     ███      █   ██ █      ██  ██    █ █ █ █   ██ █ ██ 
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   4 ms | █  1
  15 ms | █  1
  17 ms | ███  6
  18 ms | ████  7
  19 ms | ████  8
  20 ms | ███████████  20
  21 ms | ██████████  19
  22 ms | █████████  17
  23 ms | ██████  12
  24 ms | ██████  11
  25 ms | █████████  17
  26 ms | █████  9
  27 ms | ████  8
  28 ms | ███  5
  29 ms | ██████  12
  30 ms | ████  7
  31 ms | ███████████  21
  32 ms | █████████████████████████  47
  33 ms | ████████████████████████████████████████  75
  34 ms | ████████████████████████████████  60
  35 ms | ████████████████████████  45
  36 ms | ███████████████  29
  37 ms | ████████  15
  38 ms | ████████  15
  39 ms | ███████████  21
  40 ms | █████████  17
  41 ms | ██████  11
  42 ms | █████████  16
  43 ms | ███████  14
  44 ms | ███████  14
  45 ms | █████  9
  46 ms | ████  7
  47 ms | █████  9
  48 ms | █  2
  49 ms | █  2
  50 ms | █  2
  51 ms | █  1
  53 ms | █  1
  55 ms | █  1
  56 ms | █  1
  60 ms | █  1
  66 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `fps_1pct_low` = `17.49`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.12`
- `seed` = `7487.00`
- `preload_duration_ms` = `1784.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-55.00`
- `entity_count_sample_start` = `56.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `32.38`, min `14.42`, p50 `29.45`, p95 `48.74`, p99 `55.35`, 1%low `17.75`, 0.1%low `14.42`, std `15.90`

**Frame time (ms)**  avg `33.45`, p50 `33.95`, p95 `45.91`, p99 `48.72`, p99.9 `63.73`, max `69.36`

**Client tick (ms)**  avg `0.41`, p95 `0.57`, max `3.97`

**Memory**  start `1499 MB`, end `1299 MB`, peak `2162 MB`, GC `25 events / 186 ms`

**FPS over sampling window (ASCII):**

```
 75.1 |                                                         █                      
 70.9 |                                                         █                      
 66.7 |                                                         █                      
 62.5 |                                                         █                      
 58.2 |                                                         █                      
 54.0 |                                                         █                      
 49.8 |                                                         █               █      
 45.6 |                                                         █               █      
 41.3 |                                                         █               █      
 37.1 |                                           █             █               █      
 32.9 |█ █ █ █ █████ ████ ██████ ███████ ████  ██ ███ ████ ██████ █  █ █████ ███████  █
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   5 ms | █  1
  16 ms | █  1
  17 ms | ██  3
  18 ms | ██████  10
  19 ms | ██████  10
  20 ms | ███████████  19
  21 ms | ██████████  16
  22 ms | ████████████████  26
  23 ms | ████████  14
  24 ms | █████  9
  25 ms | ██████  10
  26 ms | ███████  11
  27 ms | ████  7
  28 ms | █████  8
  29 ms | ███████  11
  30 ms | ████████  13
  31 ms | █████████████  22
  32 ms | ██████████████████████████  44
  33 ms | ████████████████████████████████████████  67
  34 ms | ██████████████████████████████████████  63
  35 ms | ██████████████████████████  43
  36 ms | ██████████████  24
  37 ms | ████████  13
  38 ms | █████████████  22
  39 ms | ████████████  20
  40 ms | ███████  11
  41 ms | ██████████  17
  42 ms | █████  8
  43 ms | ███████████  18
  44 ms | ███████  12
  45 ms | █████████  15
  46 ms | ████████  14
  47 ms | ████  7
  48 ms | █  2
  49 ms | █  1
  51 ms | █  2
  55 ms | █  1
  59 ms | █  1
  69 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `fps_1pct_low` = `17.75`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.89`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.42`
- `seed` = `7499.00`
- `preload_duration_ms` = `66.00`
- `entity_count_sample_end` = `7.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-23.00`
- `entity_count_sample_start` = `30.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23314 ms  |  Sample ticks: 400

**FPS**  avg `31.99`, min `15.39`, p50 `29.56`, p95 `48.86`, p99 `53.10`, 1%low `18.54`, 0.1%low `15.39`, std `12.72`

**Frame time (ms)**  avg `33.47`, p50 `33.83`, p95 `45.52`, p99 `49.30`, p99.9 `59.29`, max `65.00`

**Client tick (ms)**  avg `0.30`, p95 `0.37`, max `3.74`

**Memory**  start `1227 MB`, end `1799 MB`, peak `2187 MB`, GC `21 events / 162 ms`

**FPS over sampling window (ASCII):**

```
 39.9 |                                      █                                         
 38.9 |                                      █                                         
 38.0 |                                      █                                         
 37.0 |                                      █                                         
 36.0 |                              █       █                                         
 35.0 |                              █       █                                 █       
 34.0 |  █                     █ █   █       █     █   █  █            █     █ █       
 33.0 | ██     █   █           █ █   █      ██     █   █  █      █     █   █ █ █     ██
 32.0 |███   ███ █ █        █  █ █ █ █  ██ ████    █   █  █ ███  ██    ██ ██ █ ███ █ ██
 31.0 |█████ ███ ████ █  █  ████ █ █ █████ ██████ ██ █ ████ ████ ██ ████████ ███████ ██
 30.0 |█████████████████████████████ ██████████████████████ ████████████████ ███████ ██
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
   8 ms |   1
  17 ms |   1
  18 ms | ████  8
  19 ms | ███  7
  20 ms | ██████████  22
  21 ms | ████████  18
  22 ms | ██████  14
  23 ms | ██████  13
  24 ms | ███████  15
  25 ms | ███████  16
  26 ms | ████████  18
  27 ms | █████  10
  28 ms | ████  8
  29 ms | █████  10
  30 ms | ████  9
  31 ms | ████████  17
  32 ms | ████████████████  36
  33 ms | ████████████████████████████████████████  88
  34 ms | █████████████████████████  56
  35 ms | ████████████████  36
  36 ms | ████████  17
  37 ms | ████████  17
  38 ms | ██████████  22
  39 ms | █████████  20
  40 ms | ████████████  26
  41 ms | ████████  17
  42 ms | ███████  15
  43 ms | █████  11
  44 ms | ██████  13
  45 ms | ███████  15
  46 ms | ██  5
  47 ms | ███  6
  48 ms |   1
  49 ms | █  3
  50 ms | █  2
  52 ms |   1
  55 ms |   1
  64 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `fps_1pct_low` = `18.54`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `50.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.88`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.39`
- `seed` = `7507.00`
- `preload_duration_ms` = `261.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `10.05`, min `7.60`, p50 `9.98`, p95 `11.39`, p99 `12.88`, 1%low `7.97`, 0.1%low `n/a`, std `0.80`

**Frame time (ms)**  avg `100.13`, p50 `100.20`, p95 `111.75`, p99 `116.44`, p99.9 `129.08`, max `131.51`

**Client tick (ms)**  avg `0.32`, p95 `0.46`, max `8.26`

**Memory**  start `1641 MB`, end `1027 MB`, peak `2243 MB`, GC `20 events / 186 ms`

**FPS over sampling window (ASCII):**

```
 11.2 |                                 █            █                                 
 11.0 |                                 █            █                                 
 10.8 |                                 █            █                   █   █        █
 10.6 |       █    █           █        █  █         █           █       █   █ █      █
 10.4 |       █    █    █      █        █ ██     █ █ █ █ █       █   █  ███  █ █     ██
 10.1 |█ █    █    ██ █ █ ████ █ █ ██ █ █ ██ █  ██ █ █ █ ███ ███ █   ██ ███  █ ██  █ ██
  9.9 |█ ████ ██ ████ █ █ ████ ████████ ████ ██ ████ █ █ ███████ ███ ██ ███  █ █████ ██
  9.7 |██████ ██ ████████ ████ ████████ ████████████ █ █ ███████ ███ ██ ██████ █████ ██
  9.5 |████████████████████████████████ ████████████ ██████████████████ ████████████ ██
  9.3 |████████████████████████████████ ███████████████████████████████ ████████████ ██
  9.1 |████████████████████████████████ ███████████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  70 ms | ██  1
  75 ms | ██  1
  77 ms | ██  1
  81 ms | ██  1
  82 ms | ██  1
  83 ms | ██  1
  84 ms | ██  1
  86 ms | ███████  3
  87 ms | ██  1
  88 ms | ██  1
  89 ms | ████  2
  90 ms | ███████████  5
  91 ms | ██  1
  92 ms | ████████████████  7
  93 ms | ████████████████████  9
  94 ms | █████████████  6
  95 ms | ███████  3
  96 ms | █████████████  6
  97 ms | █████████████████████████████████  15
  98 ms | ███████████████████████████  12
  99 ms | ████████████████████████████████████████  18
 100 ms | ████████████████████████████████████████  18
 101 ms | ████████████████████████████████████  16
 102 ms | ███████████████████████████  12
 103 ms | ██████████████████████  10
 104 ms | ███████  3
 105 ms | ████████████████  7
 106 ms | █████████████  6
 107 ms | █████████  4
 108 ms | ███████████  5
 109 ms | ███████  3
 110 ms | ███████████  5
 111 ms | ████████████████  7
 112 ms | ██  1
 113 ms | ███████  3
 115 ms | ██  1
 116 ms | ██  1
 119 ms | ██  1
 131 ms | ██  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `fps_1pct_low` = `7.97`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7517.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-31.00`
- `entity_count_sample_start` = `33.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23131 ms  |  Sample ticks: 400

**FPS**  avg `10.05`, min `7.88`, p50 `9.99`, p95 `11.39`, p99 `12.07`, 1%low `8.11`, 0.1%low `n/a`, std `0.79`

**Frame time (ms)**  avg `100.12`, p50 `100.08`, p95 `112.61`, p99 `117.68`, p99.9 `125.41`, max `126.85`

**Client tick (ms)**  avg `0.37`, p95 `0.73`, max `1.59`

**Memory**  start `1230 MB`, end `1287 MB`, peak `2383 MB`, GC `19 events / 165 ms`

**FPS over sampling window (ASCII):**

```
 12.0 |                                                 █                              
 11.7 |                                                 █                              
 11.4 |     █                                           █ █                            
 11.1 |     █                               █           █ █                            
 10.8 |     █                  █    █       █           █ █                   █        
 10.5 |  █  █        █         █    █ █     █  █        █ █ █  █              █        
 10.2 |  █  █  █  █ ██    █ ██ █    █ █  █ ██  █  ██ ██ █ █ █ ██           █  █ █      
  9.9 |█ ██ ████████████ ██ ██ ███ ██ █ ██ ██ ███ ██ ██ █ █ ████████████████  ████████ 
  9.6 |███████████████████████ ██████ █████████████████ █ █ ███████████████████████████
  9.3 |████████████████████████████████████████████████ ███████████████████████████████
  9.0 |████████████████████████████████████████████████ ███████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  68 ms | ██  1
  77 ms | ██  1
  82 ms | ██  1
  83 ms | ██  1
  86 ms | ███  2
  87 ms | ████████  5
  88 ms | ██████  4
  89 ms | ██████  4
  90 ms | ██████  4
  91 ms | ██████  4
  92 ms | ██████  4
  93 ms | █████  3
  94 ms | ████████  5
  95 ms | █████  3
  96 ms | ██████████████  9
  97 ms | ███████████  7
  98 ms | ████████████████████████████  18
  99 ms | ████████████████████████████████  21
 100 ms | ████████████████████████████████████████  26
 101 ms | ██████████████████████  14
 102 ms | ████████████  8
 103 ms | ██████████████  9
 104 ms | █████  3
 105 ms | █████████  6
 106 ms | ███████████  7
 107 ms | ██████  4
 108 ms | ███  2
 109 ms | ████████  5
 110 ms | ██  1
 111 ms | ██████  4
 112 ms | ████████  5
 114 ms | ██████  4
 115 ms | ██  1
 117 ms | ███  2
 119 ms | ██  1
 126 ms | ██  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `fps_1pct_low` = `8.11`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7523.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-62.00`
- `entity_count_sample_start` = `63.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23129 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.73`, p50 `10.00`, p95 `10.86`, p99 `11.22`, 1%low `8.79`, 0.1%low `n/a`, std `0.51`

**Frame time (ms)**  avg `100.11`, p50 `100.05`, p95 `109.91`, p99 `112.16`, p99.9 `114.26`, max `114.54`

**Client tick (ms)**  avg `0.27`, p95 `0.47`, max `1.71`

**Memory**  start `1645 MB`, end `1725 MB`, peak `1725 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                                               █
 10.6 |               █                               █                               █
 10.5 |               █                     █         █                       █       █
 10.4 |      █        █                 █   █         █                   █   █       █
 10.3 |     ██   █    █          █      █   █       █ █   █   █       █   █   █       █
 10.1 |     ███  █    █ ██    ██ █ ██   █ █ ███     █ █   █   █    █  █   █   █  █  █ █
 10.0 | ██  ████ █ █ ██ ████  ██ █████  █ █████████ █ ███ █  ███ █ █  █   ███ █ ███ █ █
  9.9 |███ █████ ███ ████████ ██ █████  █ █████████ █ ███ ██ ████████████████ █████ █ █
  9.8 |███ █████ ███ ████████ ██ ██████ █ █████████ █ ███████████████████████ █████ █ █
  9.7 |███ █████████ ████████████████████ ███████████████████████████████████ ███████ █
  9.6 |███ ████████████████████████████████████████████████████████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  89 ms | ███  3
  90 ms | ██  2
  91 ms | ███  3
  92 ms | ██████████  10
  93 ms | █████████  9
  94 ms | █████  5
  95 ms | ███████  7
  96 ms | ███████  7
  97 ms | █████  5
  98 ms | ██████████████████  18
  99 ms | █████████████████████████  26
 100 ms | ████████████████████████████████████████  41
 101 ms | ███████████  11
 102 ms | ████  4
 103 ms | ███████  7
 104 ms | ██████  6
 105 ms | ██████  6
 106 ms | █████  5
 107 ms | ████████  8
 108 ms | ████  4
 109 ms | ██  2
 110 ms | ███  3
 111 ms | ███  3
 112 ms | ██  2
 113 ms | █  1
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.79`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_start` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.37`, p50 `10.00`, p95 `11.20`, p99 `11.50`, 1%low `8.37`, 0.1%low `n/a`, std `0.66`

**Frame time (ms)**  avg `100.13`, p50 `99.98`, p95 `111.79`, p99 `115.13`, p99.9 `119.50`, max `119.52`

**Client tick (ms)**  avg `2.57`, p95 `3.04`, max `3.55`

**Memory**  start `1918 MB`, end `1674 MB`, peak `2406 MB`, GC `1 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |         █                                                   █                  
 10.6 |         █      █         █        █        █                █     █     █      
 10.5 |         █     ███      █ █   █    █        █          █     █     █  █  █      
 10.3 |       █ █     ███      █ █   █  █ █     █  █ █   █   ██  ██ █     █ ██  █      
 10.1 |       █ █   █ ████   █████   ██ █ ████  ██ ████  ██  ██  ██ ██    █ ██  █    ██
 10.0 |████ █ █ ███ █ █████ ████████ ██ █ █████ ██ █████ ███████ ██ █████ █ █████ ██ ██
  9.8 |████ █ █████ █ █████ ████████ ██ █ █████ ████████ ███████ ██ █████ █ ████████ ██
  9.6 |████████████ █ █████ ████████ ██████████ ████████ ███████ ██ █████ █ ████████ ██
  9.5 |████████████ █ █████ ████████ ██████████ ████████ ███████ ██████████ ████████ ██
  9.3 |████████████ ████████████████ ██████████ ████████ ██████████████████ ███████████
  9.1 |█████████████████████████████ ██████████ ███████████████████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms | █  1
  84 ms | █  1
  86 ms | █  1
  87 ms | █  1
  88 ms | ███████  5
  89 ms | ███████  5
  90 ms | ██████  4
  91 ms | ██████  4
  92 ms | ██████████████  10
  93 ms | ████████  6
  94 ms | ████  3
  95 ms | ███████  5
  96 ms | ██████  4
  97 ms | ██████████████  10
  98 ms | ███████████████████  14
  99 ms | ████████████████████████████████████████  29
 100 ms | ████████████████████████████████████  26
 101 ms | █████████████████████  15
 102 ms | ██████████████  10
 103 ms | ███  2
 104 ms | ███  2
 105 ms | ████  3
 106 ms | ██████████  7
 107 ms | ████████  6
 108 ms | ████  3
 109 ms | ██████  4
 110 ms | ███████  5
 111 ms | ██████  4
 112 ms | ██████  4
 113 ms | ███  2
 114 ms | █  1
 115 ms | █  1
 119 ms | ███  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.99`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `0.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `8.37`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.71`, p50 `10.00`, p95 `11.00`, p99 `11.28`, 1%low `8.73`, 0.1%low `n/a`, std `0.57`

**Frame time (ms)**  avg `100.07`, p50 `100.01`, p95 `111.27`, p99 `113.78`, p99.9 `114.72`, max `114.86`

**Client tick (ms)**  avg `0.27`, p95 `0.36`, max `1.57`

**Memory**  start `1862 MB`, end `2078 MB`, peak `2078 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                                 █                              
 10.7 |                            █                    █                              
 10.5 |             █              █          █         █                              
 10.4 |          █  █   █    █     █   █      █         █ █       █    █ █       █     
 10.3 |   █      █  █   █ █  █     █   █   █  █         █ █       █    █ █    █  █     
 10.1 | █ ██     █  █   █ █ ████   █   ██  █ ███    █  ██ █   ███ █   ██ █    █ ██     
 10.0 |██████ █  █  ███ █ ████████ ██ ████ █ ██████ █  ██ ██  ███ ███ ██ ███ ██ ██████ 
  9.9 |████████ ██ ████ █ ████████ ██ ████ █ ████████  ██ ███ ███ ███ ██ ███ ██ ██████ 
  9.8 |████████ ███████ █ ████████ ███████ █ █████████ ██████ ███ ███ █████████ ██████ 
  9.6 |████████████████ █ ████████ ██████████████████████████████████ ████████████████ 
  9.5 |███████████████████████████ ███████████████████████████████████████████████████ 
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  81 ms | █  1
  86 ms | █  1
  88 ms | █  1
  89 ms | ███  3
  90 ms | ████  5
  91 ms | █████  6
  92 ms | ███  4
  93 ms | ███████  8
  94 ms | ███  4
  95 ms | ██████  7
  96 ms | █████████  10
  97 ms | ██████████  12
  98 ms | ██████████  12
  99 ms | ██████████████████████  25
 100 ms | ████████████████████████████████████████  46
 101 ms | ██████  7
 102 ms | ██  2
 103 ms | ███  4
 104 ms | █████  6
 105 ms | ███  3
 106 ms | ████  5
 107 ms | ████  5
 108 ms | ██  2
 109 ms | ████  5
 110 ms | ███  4
 111 ms | ████  5
 112 ms | ███  3
 113 ms | ██  2
 114 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.73`
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

Category: **Lighting**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.77`, p50 `10.00`, p95 `10.93`, p99 `11.32`, 1%low `8.80`, 0.1%low `n/a`, std `0.56`

**Frame time (ms)**  avg `100.15`, p50 `100.01`, p95 `110.38`, p99 `112.94`, p99.9 `113.88`, max `114.04`

**Client tick (ms)**  avg `0.27`, p95 `0.36`, max `1.56`

**Memory**  start `2185 MB`, end `832 MB`, peak `2257 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                █                                            █                  
 10.6 |     █          █      █               █                     █                  
 10.5 |  █  █        █ █    █ █      █        █                     █          █       
 10.4 |  █  █        █ █    █ █   █  █        █        █     █ █    █  █       █       
 10.2 |  █  █      █ █ █    █ █  ██  █     █  █      █ █    ██ █    █  █       █       
 10.1 |  █  █    ███ █ █    █ █  ██  █  █  █  █      █ █    ██ ██   █  █      ██ ██    
 10.0 |█ █  ███  ███ █ ███  █ █  ███ ████ ███ █ ███  █ ██ █ ██ ███  █ ██ ██  ███ █████ 
  9.9 |█ ██ ████ ███ █ ███  █ ██ ███ ████ █████████  ██████ ██ ███  █ ██████ ███ █████ 
  9.8 |█ ██ ████ ███ █ ███  █ ██ ███ ████ █████████████████ ██ ████ ████████ ███ █████ 
  9.7 |█ ██ ████ █████ █████████ ███ ████ █████████████████ ██ ████ ████████ █████████ 
  9.6 |██████████████████████████████████ ████████████████████ ████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
  90 ms | ████  4
  91 ms | █████████  8
  92 ms | ███████  6
  93 ms | █████████  8
  94 ms | ████  4
  95 ms | █████████  8
  96 ms | █████████████  12
  97 ms | ██████████  9
  98 ms | █████████████████████  19
  99 ms | ███████████████████  17
 100 ms | ████████████████████████████████████████  36
 101 ms | █████████████  12
 102 ms | ████  4
 103 ms | ███  3
 104 ms | ████████  7
 105 ms | ████  4
 106 ms | ███  3
 107 ms | ███████  6
 108 ms | █████████  8
 109 ms | ██████  5
 110 ms | ███  3
 111 ms | ████████  7
 112 ms | █  1
 113 ms | █  1
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `8.80`
- `fps_harmonic_avg` = `9.98`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.94`, p50 `9.99`, p95 `10.90`, p99 `11.21`, 1%low `8.95`, 0.1%low `n/a`, std `0.47`

**Frame time (ms)**  avg `100.14`, p50 `100.11`, p95 `109.26`, p99 `110.89`, p99.9 `111.78`, max `111.81`

**Client tick (ms)**  avg `0.28`, p95 `0.43`, max `1.63`

**Memory**  start `894 MB`, end `1050 MB`, peak `1050 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                          █                            █        
 10.4 |    █       █ █                           █     █                      █        
 10.3 |    █       █ █               ██          █     █ █     █              █       █
 10.2 |  ███       █ █               ██          █   █ █ █     █    █         █       █
 10.1 |  ███       █ █         █    ███          █   █ █ █     ██   █         █     ███
 10.0 |  ███████ █ █ ████ ███  ███ █████ █ ███ █ ██  █ █ █ ███ ██  █████ ████ ████ ████
  9.9 | ████████ ███ █████████████ ███████████ ███████ █ █████ ██████████████ ████ ████
  9.8 | ████████ ███ █████████████ ███████████ ███████ █ █████ ██████████████ ████ ████
  9.7 | ████████████ █████████████ ███████████ ███████ ███████ ██████████████ ████ ████
  9.6 | ██████████████████████████ ███████████████████ ███████ ██████████████ ████ ████
  9.5 | ██████████████████████████ ███████████████████████████ ████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  89 ms | ██  3
  90 ms | █  2
  91 ms | ███  5
  92 ms | ███  5
  93 ms | ██  4
  94 ms | ████  7
  95 ms | ████  7
  96 ms | █  2
  97 ms | █████  8
  98 ms | ███████  12
  99 ms | ███████████  20
 100 ms | ████████████████████████████████████████  70
 101 ms | ██████  10
 102 ms | ████  7
 103 ms | ███  6
 104 ms | █  2
 105 ms | ██  4
 106 ms | ██  4
 107 ms | █  2
 108 ms | █████  8
 109 ms | ███  5
 110 ms | ██  4
 111 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `8.95`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23130 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.84`, p50 `9.99`, p95 `10.87`, p99 `11.34`, 1%low `8.85`, 0.1%low `n/a`, std `0.51`

**Frame time (ms)**  avg `100.15`, p50 `100.06`, p95 `111.62`, p99 `112.91`, p99.9 `113.07`, max `113.08`

**Client tick (ms)**  avg `0.29`, p95 `0.38`, max `1.84`

**Memory**  start `1276 MB`, end `1428 MB`, peak `1428 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                         █        █                             
 10.6 |                    █                    █        █         █                   
 10.5 |              █ █   █                █   █        █         █  █             █ █
 10.3 |     █ █      █ █   █                █   █        █   █     █  █             █ █
 10.2 |     █ █      █ █   █   █            █   █        █ █ █     █  █     █  █  █ █ █
 10.1 |     █ ██    ██ █   █ █ █ █          █   █ █      █ █ █     █ ██   ████ █  █ █ █
 10.0 |██ █ █ ████  ██ ███ █ ███████████   ████ █ ██████ █ █ ████  █ ███ █████ ██ █ █ █
  9.9 |██████ ████ ███████ ███████████████ ████ ████████ █ ███████ █ ███ ████████ █ █ █
  9.8 |██████ ████ ███████ ████████████████████ ████████ █ ███████ █ ███ ██████████ █ █
  9.6 |██████ ████████████ ████████████████████ ████████ █ █████████ ███ ██████████ ███
  9.5 |████████████████████████████████████████ ████████ ███████████████ ██████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  88 ms | ██  3
  90 ms | ██  3
  91 ms | ██  3
  92 ms | ███████  9
  93 ms | ███  4
  94 ms | █████  6
  95 ms | █████  7
  96 ms | █████  6
  97 ms | ███████████  14
  98 ms | ████████████  15
  99 ms | ██████████████████  23
 100 ms | ████████████████████████████████████████  52
 101 ms | ██████  8
 102 ms | ███  4
 103 ms | ███  4
 104 ms | ███  4
 105 ms | █████  6
 106 ms | ██  3
 107 ms | ███  4
 108 ms | ███  4
 109 ms | ███  4
 110 ms | █  1
 111 ms | █████  6
 112 ms | ███  4
 113 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.85`
- `scheduled_block_ticks` = `1088.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.98`
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

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195306 ms  |  Sample ticks: 3600

**FPS**  avg `10.06`, min `4.08`, p50 `9.99`, p95 `10.67`, p99 `11.56`, 1%low `8.15`, 0.1%low `5.44`, std `2.46`

**Frame time (ms)**  avg `100.12`, p50 `100.14`, p95 `106.25`, p99 `113.14`, p99.9 `121.85`, max `245.32`

**Client tick (ms)**  avg `0.67`, p95 `1.14`, max `2.97`

**Memory**  start `872 MB`, end `1501 MB`, peak `1836 MB`, GC `11 events / 64 ms`

**FPS over sampling window (ASCII):**

```
 14.4 |                             █                                                  
 14.0 |                             █                                                  
 13.6 |                             █                                                  
 13.2 |                             █                                                  
 12.8 |                             █                                                  
 12.4 |                             █                                                  
 11.9 |                             █                                                  
 11.5 |                             █                                                  
 11.1 |                             █                                                  
 10.7 |                             █                                                  
 10.3 |              █             ██                    █                             
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms |   1
  69 ms |   1
  72 ms |   1
  79 ms |   2
  82 ms |   1
  83 ms |   2
  84 ms |   4
  85 ms |   4
  86 ms |   4
  87 ms | █  6
  88 ms | ██  18
  89 ms | █  7
  90 ms |   5
  91 ms | █  6
  92 ms | █  12
  93 ms | ██  20
  94 ms | ██  22
  95 ms | ████  40
  96 ms | █████  61
  97 ms | ███████  76
  98 ms | ████████████  139
  99 ms | ███████████████████████████████████  397
 100 ms | ████████████████████████████████████████  450
 101 ms | ██████████████████  205
 102 ms | ████████  92
 103 ms | ██████  62
 104 ms | ████  42
 105 ms | ██  25
 106 ms | ██  23
 107 ms | █  7
 108 ms | █  6
 109 ms |   3
 110 ms | █  9
 111 ms | █  13
 112 ms | █  12
 113 ms | █  8
 114 ms |   5
 115 ms |   1
 116 ms |   1
 117 ms |   1
 118 ms |   1
 121 ms |   1
 122 ms |   1
 245 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `5.44`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `8.15`
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

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194616 ms  |  Sample ticks: 3600

**FPS**  avg `10.01`, min `7.95`, p50 `9.99`, p95 `11.01`, p99 `11.75`, 1%low `8.47`, 0.1%low `8.00`, std `0.49`

**Frame time (ms)**  avg `100.10`, p50 `100.12`, p95 `108.49`, p99 `114.66`, p99.9 `122.01`, max `125.82`

**Client tick (ms)**  avg `0.64`, p95 `1.07`, max `1.92`

**Memory**  start `1050 MB`, end `906 MB`, peak `1897 MB`, GC `13 events / 56 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |      █       █                                                                 
 10.1 |      █       █                   █                                             
 10.1 |█     █   ██  █            █      █                                             
 10.1 |██    █   ██  █            █      █  █                                          
 10.1 |██    █   ██  █            █    █ █  █     █            █                       
 10.0 |██  █ ██  ██  █ █          █    █ ██ █ █ █ █      █     █                       
 10.0 |███ █ ██████ ██ █ ██  █ █  █    ████ █ █ █ ██ █   █     █           ██  █   ██  
 10.0 |█████ ██████ ██ █ ██  █ █ ███ █ ████ █ █ █ █████████ █  █      █    ███ █  ███  
 10.0 |████████████ ██ █ ███ █ █ █████ ████ █ █ █ ████████████ ██████████████████ ████ 
 10.0 |███████████████ ███████████████ ████ █ █ █ ████████████ ███████████████████████ 
 10.0 |████████████████████████████████████████ █ █████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  74 ms |   1
  81 ms |   3
  82 ms |   4
  83 ms |   2
  84 ms | █  8
  85 ms | █  9
  86 ms | █  12
  87 ms | █  15
  88 ms | █  19
  89 ms | █  15
  90 ms |   3
  91 ms | █  7
  92 ms |   5
  93 ms | █  7
  94 ms | ██  26
  95 ms | ███  36
  96 ms | ███  46
  97 ms | ████  48
  98 ms | █████████  127
  99 ms | ██████████████████████████████  408
 100 ms | ████████████████████████████████████████  539
 101 ms | █████████████  178
 102 ms | █████  70
 103 ms | ███  38
 104 ms | ███  34
 105 ms | ██  24
 106 ms | █  14
 107 ms | █  7
 108 ms |   6
 109 ms |   6
 110 ms |   4
 111 ms | █  16
 112 ms | ██  22
 113 ms | █  15
 114 ms | █  9
 115 ms |   5
 117 ms |   1
 118 ms |   3
 119 ms |   1
 120 ms |   1
 121 ms |   2
 124 ms |   1
 125 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `8.00`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `8.47`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193723 ms  |  Sample ticks: 3600

**FPS**  avg `10.13`, min `7.53`, p50 `9.98`, p95 `12.96`, p99 `13.70`, 1%low `7.78`, 0.1%low `7.56`, std `1.24`

**Frame time (ms)**  avg `100.10`, p50 `100.17`, p95 `122.45`, p99 `126.45`, p99.9 `130.60`, max `132.73`

**Client tick (ms)**  avg `0.64`, p95 `1.06`, max `1.79`

**Memory**  start `1354 MB`, end `1126 MB`, peak `1826 MB`, GC `13 events / 68 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                    █                                                           
 10.3 |      █             █                                                           
 10.3 |      █  █   █      █                                                           
 10.3 |      █  █   █ █    █ ██                    █                                █  
 10.2 |      █  █ █ █ █    █ ██                 █  █  █          █   █              █  
 10.2 |      █  █ █ █ █    █ ██   █  █ █    █   █  █ ██ █    ██ ██ █ █     █       ██  
 10.2 |█  ██ █ ██ █ ███   ██ ██   █ ██ ██   ██  █  █ ██ █  █ ██ ██ ███   █ █     ████ █
 10.1 |█████ █ ████ ███ █ ██ ███ ██ ██ ██   ███ ██ █ ██ █  █ ██ ██████ ███ █  ██ ████ █
 10.1 |█████ █ ████ ███ █ ██ ██████ ██ ████ ██████ █ ██ ██ ████ ██████ ███ █ ██████████
 10.0 |█████ ██████████ ███████████████████ ██████ ███████ ████ ██████ ███ █ ██████████
 10.0 |█████ █████████████████████████████████████████████ ███████████████ ████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  68 ms |   1
  69 ms |   1
  70 ms |   1
  71 ms | █  8
  72 ms | █  8
  73 ms | █  9
  74 ms | █  14
  75 ms | ██  21
  76 ms | ██  25
  77 ms | █  12
  78 ms | ██  18
  79 ms | █  7
  80 ms | █  11
  81 ms |   5
  82 ms | █  7
  83 ms | █  7
  84 ms | █  12
  85 ms | ███  27
  86 ms | ███  26
  87 ms | ███  28
  88 ms | █████  54
  89 ms | █████  50
  90 ms | ███  27
  91 ms | ███  26
  92 ms | █  10
  93 ms | █  8
  94 ms | █  12
  95 ms |   3
  96 ms | █  10
  97 ms | ██  16
  98 ms | █████  48
  99 ms | ██████████████████████████████  301
 100 ms | ████████████████████████████████████████  401
 101 ms | █████████  93
 102 ms | ████  42
 103 ms | ███  29
 104 ms | ███  27
 105 ms | ██  25
 106 ms | ██  20
 107 ms | ██  16
 108 ms | █  10
 109 ms | ██  16
 110 ms | ██  18
 111 ms | ██  23
 112 ms | █  15
 113 ms | █  11
 114 ms | ██  16
 115 ms | █  6
 116 ms | █  10
 117 ms | ██  17
 118 ms | ██  21
 119 ms | ██  25
 120 ms | ██  18
 121 ms | ██  23
 122 ms | ███  29
 123 ms | ██  21
 124 ms | ██  18
 125 ms | █  13
 126 ms | █  7
 127 ms | █  6
 128 ms |   5
 129 ms |   2
 130 ms |   1
 131 ms |   1
 132 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.56`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `7.78`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `21.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195217 ms  |  Sample ticks: 3600

**FPS**  avg `10.09`, min `1.35`, p50 `9.98`, p95 `12.17`, p99 `13.40`, 1%low `6.22`, 0.1%low `2.29`, std `1.19`

**Frame time (ms)**  avg `100.41`, p50 `100.18`, p95 `119.90`, p99 `125.09`, p99.9 `129.18`, max `743.29`

**Client tick (ms)**  avg `0.63`, p95 `1.07`, max `7.73`

**Memory**  start `1033 MB`, end `1280 MB`, peak `1905 MB`, GC `11 events / 49 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                                              █                                 
 10.9 |                                              █                                 
 10.8 |                                              █                                 
 10.7 |                                              █                                 
 10.6 |                                              █                                 
 10.5 |                                              █                                 
 10.4 |                                              █                                 
 10.3 |                                              █ █                               
 10.2 | █ █                                 █ █      █ █             ██         █ █    
 10.2 | █ ██                            █   █ █ █ ██ █ ██ ███ █    ████         █ ██  █
 10.1 |██ ██████ ██████ █ ███ █ ████████████████████ ██████████ █ ██████████████████ ██
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  27 ms |   1
  70 ms |   2
  71 ms |   2
  72 ms |   4
  73 ms |   4
  74 ms | █  7
  75 ms | █  13
  76 ms | ██  15
  77 ms | █  7
  78 ms | █  10
  79 ms | █  8
  80 ms | █  7
  81 ms | █  9
  82 ms | █  7
  83 ms |   4
  84 ms | █  7
  85 ms | ██  15
  86 ms | ██  17
  87 ms | ███  30
  88 ms | ███  29
  89 ms | ████  42
  90 ms | ████  39
  91 ms | ███  27
  92 ms | ██  18
  93 ms | █  6
  94 ms | ██  15
  95 ms | ██  22
  96 ms | █  14
  97 ms | ██  23
  98 ms | █████████  88
  99 ms | ███████████████████████████████  311
 100 ms | ████████████████████████████████████████  395
 101 ms | ████████████  117
 102 ms | ██████  63
 103 ms | █████  45
 104 ms | ███  33
 105 ms | ███  29
 106 ms | ████  37
 107 ms | ███  27
 108 ms | ██  16
 109 ms | ███  25
 110 ms | ██  18
 111 ms | ███  28
 112 ms | ██  19
 113 ms | █  9
 114 ms | █  11
 116 ms | █  6
 117 ms | █  8
 118 ms | █  7
 119 ms | █  12
 120 ms | █  11
 121 ms | ██  20
 122 ms | █  10
 123 ms | ██  16
 124 ms | █  11
 125 ms | █  7
 126 ms | █  7
 127 ms |   2
 128 ms |   1
 130 ms |   1
 743 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `2.29`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.96`
- `fps_1pct_low` = `6.22`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `20.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`

