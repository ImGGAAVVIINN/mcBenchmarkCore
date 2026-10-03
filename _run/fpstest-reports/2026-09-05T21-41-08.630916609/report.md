# FPS Test session — 2026-09-05T22:15:20.647887812+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 119.0 | 102.4 | 87.0 | 9.47 | 0.52 | 1 | 248 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 119.0 | 102.3 | 95.3 | 9.49 | 0.59 | 2 | 84 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 29.9 | 28.5 | 27.8 | 34.75 | 0.56 | 1 | 200 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.9 | 28.6 | 28.2 | 34.73 | 0.60 | 2 | 156 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 29.9 | 28.5 | 28.3 | 34.82 | 0.56 | 1 | 208 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.9 | 28.6 | 27.0 | 34.35 | 0.42 | 1 | 136 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 29.9 | 28.8 | 28.6 | 34.56 | 0.58 | 1 | 180 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 29.9 | 27.8 | 26.4 | 35.13 | 0.95 | 3 | 377 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 30.1 | 25.9 | 23.5 | 37.39 | 2.84 | 6 | 131 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 30.1 | 25.3 | 24.2 | 38.61 | 3.25 | 13 | 412 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 29.9 | 27.8 | 26.5 | 35.26 | 0.83 | 5 | 58 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 29.9 | 28.3 | 26.8 | 34.42 | 0.43 | 4 | 362 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 30.1 | 25.5 | 25.1 | 38.60 | 3.30 | 5 | 399 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.1 | 26.0 | 25.4 | 38.00 | 2.56 | 5 | 84 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 34.2 | 18.1 | 17.1 | 52.71 | 12.87 | 34 | 394 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 35.0 | 18.1 | 17.6 | 53.68 | 13.78 | 32 | 597 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 30.0 | 27.5 | 27.3 | 36.06 | 1.70 | 5 | 232 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 30.0 | 27.5 | 27.2 | 35.98 | 1.70 | 5 | 378 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.5 | 9.9 | 9.8 | 100.84 | 0.56 | 1 | 336 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 10.0 | 9.8 | n/a | 101.74 | 0.29 | 1 | 20 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 10.0 | 9.5 | n/a | 102.47 | 0.26 | 1 | 496 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 10.0 | 9.7 | n/a | 102.61 | 0.28 | 0 | 464 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 10.0 | 9.8 | n/a | 101.60 | 0.28 | 0 | 124 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 10.0 | 9.2 | n/a | 105.14 | 0.40 | 51 | 419 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 10.0 | 9.4 | n/a | 104.97 | 0.38 | 31 | 247 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 10.0 | 8.9 | n/a | 110.72 | 0.30 | 26 | 609 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 10.0 | 9.0 | n/a | 106.73 | 0.36 | 22 | 1189 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 10.0 | 9.2 | n/a | 106.92 | 0.34 | 25 | 1119 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 10.0 | 9.4 | n/a | 105.18 | 0.33 | 25 | 1281 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 10.0 | 9.2 | n/a | 104.84 | 0.40 | 21 | 1204 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 10.0 | 9.2 | n/a | 103.75 | 0.38 | 28 | 1312 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 10.0 | 8.8 | n/a | 111.31 | 0.39 | 26 | 458 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 10.0 | 9.0 | n/a | 106.26 | 0.32 | 23 | 484 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 10.0 | 8.8 | n/a | 110.10 | 0.45 | 21 | 857 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 10.0 | 9.2 | n/a | 104.98 | 0.31 | 20 | 1314 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 10.0 | 9.8 | n/a | 101.56 | 0.26 | 0 | 84 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 10.0 | 9.4 | n/a | 103.03 | 2.72 | 1 | 844 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 10.0 | 9.7 | n/a | 102.01 | 0.28 | 0 | 220 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 10.0 | 9.8 | n/a | 101.82 | 0.28 | 0 | 136 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 10.0 | 9.7 | n/a | 101.85 | 0.28 | 0 | 156 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 10.0 | 9.4 | n/a | 102.04 | 0.31 | 1 | 104 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 10.0 | 9.6 | 9.1 | 102.63 | 0.62 | 11 | 316 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 10.0 | 9.3 | 8.9 | 103.20 | 0.61 | 11 | 678 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.0 | 9.6 | 9.1 | 102.51 | 0.60 | 10 | 1096 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.0 | 9.6 | 9.3 | 102.32 | 0.59 | 10 | 986 |

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

**FPS**  avg `119.02`, min `77.26`, p50 `118.84`, p95 `129.36`, p99 `134.61`, 1%low `102.41`, 0.1%low `87.01`, std `6.33`

**Frame time (ms)**  avg `8.42`, p50 `8.41`, p95 `9.13`, p99 `9.47`, p99.9 `9.87`, max `12.94`

**Client tick (ms)**  avg `0.52`, p95 `0.80`, max `4.01`

**Memory**  start `529 MB`, end `622 MB`, peak `777 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
122.5 |                                          █                                     
122.1 |                                          █                                     
121.7 |                                          █                                     
121.3 |                                          █                                     
120.9 |                                          █                                     
120.6 |                                          █                                     
120.2 |                                          █                                     
119.8 |        █        █                        █                                     
119.4 |███████ ██ █     █     █ █        █       ██                █                 █ 
119.0 |███████ ███████  █████ █ ███████  ███████ ████████ ████ ███ ██ ████  ███████ ███
118.6 |██████████████████████████████████████████████████████████████ █████████████████
118.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   1
   7 ms | █████████  373
   8 ms | ████████████████████████████████████████  1752
   9 ms | ██████  246
  10 ms |   1
  12 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 296 | 119.3 | 9.64 |
| `dragon_breath` | 160 | 296 | 119.1 | 9.35 |
| `dripping_water` | 240 | 296 | 119.0 | 9.25 |
| `flame` | 160 | 296 | 118.9 | 9.23 |
| `smoke` | 160 | 296 | 119.3 | 9.22 |
| `sculk_charge_pop` | 240 | 296 | 118.9 | 9.51 |
| `ALL_TOGETHER` | 1680 | 296 | 118.8 | 9.22 |
| `portal` | 160 | 296 | 118.9 | 9.14 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `118.72`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `25.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `102.41`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `87.01`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `119.03`, min `93.31`, p50 `118.83`, p95 `130.58`, p99 `135.42`, 1%low `102.32`, 0.1%low `95.27`, std `6.41`

**Frame time (ms)**  avg `8.43`, p50 `8.42`, p95 `9.20`, p99 `9.49`, p99.9 `10.09`, max `10.72`

**Client tick (ms)**  avg `0.59`, p95 `0.85`, max `1.71`

**Memory**  start `718 MB`, end `772 MB`, peak `803 MB`, GC `2 events / 6 ms`

**FPS over sampling window (ASCII):**

```
120.0 |            █                                                                   
119.8 |            █                                                                   
119.7 |            █    █                                                              
119.5 |            █    █                         █                 █                  
119.4 |█  █   █    █    █                █        █        █        █                █ 
119.2 |█  █   █    █    █     ██ ██      █ ██     █     █  █        ██      ██  █    █ 
119.1 |██ █ █ █   █████ ██ ██ █████ █ █  ████     █ █ ███  █    ██ ████  ██ ██ ██    █ 
118.9 |████ █ █ ███████ ████████████████ ████████ ███████ ██ ███████████ ██ ████████ ██
118.8 |██████ █ ███████ ████████████████ ████████ ███████ ██ ███████████ ███████████ ██
118.6 |██████ █ ███████ █████████████████████████ ██████████ ██████████████████████████
118.5 |█████████████████████████████████████████████████████ ██████████████████████████
118.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   2
   7 ms | ██████████  400
   8 ms | ████████████████████████████████████████  1640
   9 ms | ████████  328
  10 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `64.00`
- `fps_harmonic_avg` = `118.69`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `95.27`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `102.32`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `27.82`, p50 `29.96`, p95 `30.67`, p99 `31.00`, 1%low `28.48`, 0.1%low `27.82`, std `0.55`

**Frame time (ms)**  avg `33.44`, p50 `33.38`, p95 `34.29`, p99 `34.75`, p99.9 `35.51`, max `35.94`

**Client tick (ms)**  avg `0.56`, p95 `0.84`, max `1.10`

**Memory**  start `575 MB`, end `653 MB`, peak `775 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |█            █                       █ █                                        
 30.0 |█   █  █  █  █         █  █          █ █  █        █     █      █        █  █   
 30.0 |██  █  █  █  █   █  █  █  █  █  █  █ █ █  █     █  █  █ ██   █  █     █  █  █ ██
 30.0 |██  █  █  █  █   █ ██  █  █ ██  █  █ █ █  █ ██  █  █ ██ ██   █ ██     █  █  █ ██
 29.9 |██ ██ ██ ██  █ █ █ ██  █  █ ██ ██ ██ █ █  █ ██ ██ ██ ██ ██  ██ ██ █  ██  █ ██ ██
 29.9 |██ ██ ██ ██ ████ █ ██ ██  █ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██  ██ ██ ██ ████████ ██
 29.8 |███████████ ████ ████████ ██████████ ██████ ████████ ██ ██  █████████████████ ██
 29.8 |████████████████ ███████████████████ ██████████████████ ███ ████████████████████
 29.8 |████████████████ ███████████████████ ██████████████████████ ████████████████████
 29.7 |████████████████ ███████████████████ ███████████████████████████████████████████
 29.7 |████████████████ ███████████████████████████████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   1
  32 ms | ██████████████████████████████  186
  33 ms | ████████████████████████████████████████  247
  34 ms | ██████████████████████████  161
  35 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `42.00`
- `fps_harmonic_avg` = `29.90`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `27.82`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.48`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `28.20`, p50 `29.92`, p95 `30.72`, p99 `31.00`, 1%low `28.63`, 0.1%low `28.20`, std `0.52`

**Frame time (ms)**  avg `33.44`, p50 `33.43`, p95 `34.30`, p99 `34.73`, p99.9 `35.15`, max `35.46`

**Client tick (ms)**  avg `0.60`, p95 `0.76`, max `0.95`

**Memory**  start `610 MB`, end `674 MB`, peak `767 MB`, GC `2 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                              █ █                               
 30.0 |     █        █            █     █     █      █ █           █             █  █  
 30.0 |     █     █  █   █     █  █  █  █  █  █   █  █ █   █  █  █ ██   █  █     █  █  
 30.0 | ██  █ ██ ██  █ █ █ ██  █  █  █  █ ██  █   █  █ ██  █  █  █ ██ █ █  █     █  █  
 29.9 | ██  █ ██ ██ ██ █ █ ██ ██  ████ ██ ██ ██ █ █  █ ██  █ ██ ██ ██ █ █ ██    ██  █ █
 29.9 |████ █ ██ ██ ██ █ █ ██ ██  ████ ██ ██ ██ ███  █ █████ ██ ██ ██ ███ ██ █  ██ ██ █
 29.8 |██████ █████ ██ █ █ ██ ███████████ █████ ████ █ ████████ ██ ██ █████████ ██ ██ █
 29.8 |████████████ ████ █ ██████████████ ████████████ ███████████ ██████████████████ █
 29.8 |█████████████████ █████████████████████████████ ████████████████████████████████
 29.7 |█████████████████ █████████████████████████████ ████████████████████████████████
 29.7 |███████████████████████████████████████████████ ████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   3
  32 ms | ██████████████████████  165
  33 ms | ████████████████████████████████████████  302
  34 ms | █████████████████  127
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `77.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `28.20`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.63`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.34`, p50 `29.97`, p95 `30.60`, p99 `31.04`, 1%low `28.54`, 0.1%low `28.34`, std `0.52`

**Frame time (ms)**  avg `33.43`, p50 `33.37`, p95 `34.27`, p99 `34.82`, p99.9 `35.22`, max `35.29`

**Client tick (ms)**  avg `0.56`, p95 `0.84`, max `1.03`

**Memory**  start `585 MB`, end `685 MB`, peak `793 MB`, GC `1 events / 5 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                           █                                    
 30.0 |               █          █                █                                  █ 
 30.0 |     █      █  █          █    █     █     █  █   █  █     █  █  █  █  █      █ 
 30.0 |     ██  █  █  █  █    ██ █    █  █  █  █  █  █   █  █  █  █  █ ██  █  █   █  █ 
 29.9 | ███ ██  █  █  █  █  █ ██ ██   █ ██ ██ ██  █  █ █ █ ██ ██  █ ██ ██ ██ ██ ███ ██ 
 29.9 |████ ██  █ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██  █ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ 
 29.9 |████ ████████ ████████ ██ ███ ██ ██ ██ ███ █ ██ ███ ██ █████ ██ ██ ██ ██ ███ ██ 
 29.8 |████ ████████ ███████████ ██████ █████ ████████████ ██ █████ ██ ██ █████ ███ ██ 
 29.8 |█████████████████████████ ██████████████████████████████████████████████ ███████
 29.8 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   2
  32 ms | ██████████████████████████  177
  33 ms | ████████████████████████████████████████  268
  34 ms | ██████████████████████  148
  35 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `65.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `28.34`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.54`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `27.00`, p50 `29.95`, p95 `30.48`, p99 `30.70`, 1%low `28.62`, 0.1%low `27.00`, std `0.45`

**Frame time (ms)**  avg `33.44`, p50 `33.39`, p95 `34.13`, p99 `34.35`, p99.9 `35.85`, max `37.04`

**Client tick (ms)**  avg `0.42`, p95 `0.54`, max `0.77`

**Memory**  start `638 MB`, end `579 MB`, peak `774 MB`, GC `1 events / 4 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                         █                                      
 30.1 |                                         █                                      
 30.0 |                       █                 █                                  █   
 30.0 |       █           █   █                 █      █  █  █  █                  █   
 30.0 | █     █  █    █   ██  █  █  █  █  █  █  ██  █  █  █  █  █  █  █  ██  █     █  █
 29.9 |██ ██  █ ██   ████ ██  █  █  █ ██  █  █  ██ ██  █  █  █  █ ██ ██  ██  █ ██  █ ██
 29.9 |██ ██ ██ ██  █████ ██  █ ██ ██ ██  █  ██ ██ ██ ██ ██ ██  █ ██ ███ ██ ██ ██  █ ██
 29.9 |██ ██ ██ █████████ █████ █████ ██████ ██ █████ █████ ██ ██ ██ ███ ██ ██ █████ ██
 29.8 |██ █████ █████████ ██████████████████ ██ ███████████ █████ ██████ ██████████████
 29.8 |████████ ████████████████████████████ ██ ███████████████████████████████████████
 29.8 |█████████████████████████████████████ ██████████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  29 ms |   1
  32 ms | █████████████  131
  33 ms | ████████████████████████████████████████  396
  34 ms | ███████  69
  35 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `32.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `27.00`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.62`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.60`, p50 `29.95`, p95 `30.70`, p99 `31.03`, 1%low `28.80`, 0.1%low `28.60`, std `0.53`

**Frame time (ms)**  avg `33.44`, p50 `33.39`, p95 `34.31`, p99 `34.56`, p99.9 `34.84`, max `34.96`

**Client tick (ms)**  avg `0.58`, p95 `0.84`, max `1.16`

**Memory**  start `605 MB`, end `696 MB`, peak `785 MB`, GC `1 events / 2 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                        █                                                       
 30.1 |                     █  █                              █                        
 30.1 |                     █  █                        █     █                     █  
 30.0 |        █     █      █  █  █                     █     █        █  █      █  █  
 30.0 |  █  █  █ ██  █    █ █  █  █     █        █  ██  █  █  █ ██  █  █  █      █  █  
 30.0 |  █ ██  █ ██  █  █ █ █  █  █  █  █     █ ██  ██  █  █  █ ██  █  █  █      █  █ █
 29.9 |  █ ██ ██ ██ ██ ██ █ █  █ ██ ██  █ █ ███ ██  ██  █ ██  █ ██ ██  █  █ ██  ██  █ █
 29.9 | ██ ██ ██ ██ ██ ██ █ █  █ ██ █████ █████ ██ ███ ██ ██  █ ██ ██ ██  █ ██  ██  █ █
 29.9 | ██ ██ ██ ██ ██ ██ █ █  █ ██ █████ █████ ██ ███ ██ ███ █ ██ ██ ██ ██ ██  ██  █ █
 29.8 |███ ██ ██ ██ ███████ ████ ████████ ███████████████ █████ █████ ████████ ████████
 29.8 |█████████████████████████ ██████████████████████████████ ███████████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   1
  32 ms | ████████████████████████████  183
  33 ms | ████████████████████████████████████████  258
  34 ms | ████████████████████████  156
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `33.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `28.60`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.80`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `29.93`, min `26.43`, p50 `29.96`, p95 `31.00`, p99 `31.26`, 1%low `27.80`, 0.1%low `26.43`, std `0.83`

**Frame time (ms)**  avg `33.43`, p50 `33.38`, p95 `34.69`, p99 `35.13`, p99.9 `36.91`, max `37.83`

**Client tick (ms)**  avg `0.95`, p95 `1.10`, max `1.53`

**Memory**  start `452 MB`, end `472 MB`, peak `829 MB`, GC `3 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 30.6 |                                      █                                         
 30.5 |                                      █                                         
 30.4 |                                      █                                         
 30.3 |                                      █                                         
 30.2 |                                      █                                         
 30.1 |  █  █  █   █  █     █     █  █   █   █ █  █  █     █  █      █  █ █   █  █  █  
 30.0 |  █ ██ ██   █  █  █ ██  █ ██  █  ██   █ █  █  █ ██  █ ██  ██ ██ ██ ██ ██  █  █ █
 29.9 | ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ███ █ ███ ██ ██ ██ ██ ██████ ██ ██ ██ ██ ██ ██ █
 29.8 | ██████████████████ █████████████████ ████████████████████████████ █████████████
 29.7 |█████████████████████████████████████ ██████████████████████████████████████████
 29.6 |█████████████████████████████████████ ██████████████████████████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  29 ms |   1
  31 ms | █  6
  32 ms | ████████████████████████████████████████  197
  33 ms | ███████████████████████████████████████  191
  34 ms | ███████████████████████████████████████  194
  35 ms | █  6
  36 ms |   2
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `27.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `26.43`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `27.80`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `30.08`, min `23.54`, p50 `29.97`, p95 `33.08`, p99 `33.66`, 1%low `25.90`, 0.1%low `23.54`, std `2.22`

**Frame time (ms)**  avg `33.43`, p50 `33.37`, p95 `36.56`, p99 `37.39`, p99.9 `40.26`, max `42.48`

**Client tick (ms)**  avg `2.84`, p95 `3.55`, max `8.85`

**Memory**  start `702 MB`, end `614 MB`, peak `834 MB`, GC `6 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 30.7 |                   █                                                            
 30.6 |    █        █     █      █                                                     
 30.5 |    █ ██     █  █  █   █  █        █  █      █  █  █        █  █      █        █
 30.4 | █  █ ██     █  █  █   █  █        █  █  █   █  █ ██  █  █  █  █  █   █  █  █  █
 30.3 | █  █ ██  █  █  █  █   █  █     █  █  █  █   █  █ ██  █  █  █  █  █   █  █  █  █
 30.2 |██  █ ██  █  █  █  █  ██  █ █   █  █  █  █   █  █ ██  █  █  █  █  █   █  █  █  █
 30.0 |██ ██ ██ ██  █ ██  █  ██  █ █  ██  █ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██
 29.9 |██ ██ ██ ██ ██ ██ ██ ███  █ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██
 29.8 |██ ██ ██ ██ ██ ██ ██ ███ ████████ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ █████
 29.7 |██ ██████████████ ██████████████████ ████████████ █████ ██ █████████████████████
 29.6 |█████████████████████████████████████████████████ ██████████████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  26 ms |   1
  28 ms |   1
  29 ms | ████  18
  30 ms | ███████████████████████████████████████  165
  31 ms | ████  16
  32 ms | █████  20
  33 ms | ████████████████████████████████████████  169
  34 ms | ██  10
  35 ms | ███  14
  36 ms | ████████████████████████████████████████  171
  37 ms | ███  12
  38 ms |   1
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `69.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `23.54`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `25.90`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `30.13`, min `24.23`, p50 `29.95`, p95 `34.31`, p99 `35.67`, 1%low `25.32`, 0.1%low `24.23`, std `2.57`

**Frame time (ms)**  avg `33.43`, p50 `33.39`, p95 `37.72`, p99 `38.61`, p99.9 `40.53`, max `41.27`

**Client tick (ms)**  avg `3.25`, p95 `4.56`, max `6.87`

**Memory**  start `450 MB`, end `565 MB`, peak `863 MB`, GC `13 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 31.0 |                                                                       █        
 30.9 |                           █                        █         █  █     █        
 30.8 |                           █                        █  █   █  █  █  █  █        
 30.6 |                           █            █     █  █  █  █   █  █  █  █  █  █  █  
 30.5 |                           █  █   █     █  █  █  █  █  █  ██  █  █  █  █  █  █  
 30.4 |     █         █        █  █  █   █  █  █  █  █  █  █  █  ██ ██  █ ██  █  █ ██  
 30.2 |  █  █   █     █  █  █  █  █  █   █ ██ ██  █  █  █  █ ██  ██ ██  █ ██  █  █ ██ █
 30.1 | ██  █   █ ██  █ ██ ██  █  █  █  ██ ██ ██ ██ ██ ██  █ ██  ██ ██ ██ ██ ██ ██ ██ █
 29.9 | ██ ██ ███ ██ ██ ██ ██ ██  █ ██ ███ ██ ██ ██ ██ ██  █ ██████ ██ ██ ██ ██ ██ ██ █
 29.8 |██████ ███ █████ ██ █████ ██ ██████ ██ ██ ██ ██ ████████████ ██ ██ ██ ██ █████ █
 29.7 |█████████████████████████ ██████████████████████████████████ █████████████████ █
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  27 ms | ██  5
  28 ms | ██████  19
  29 ms | ███████████████████  63
  30 ms | ████████████████████  66
  31 ms | ██████████████  47
  32 ms | █████████████  43
  33 ms | ████████████████████████████████████████  133
  34 ms | ██████  20
  35 ms | ███████████████████  62
  36 ms | ██████████████████  59
  37 ms | ███████████████████  64
  38 ms | ████  14
  39 ms |   1
  40 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `64.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `24.23`
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
- `fps_1pct_low` = `25.32`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `29.93`, min `26.52`, p50 `30.04`, p95 `31.12`, p99 `31.54`, 1%low `27.81`, 0.1%low `26.52`, std `0.85`

**Frame time (ms)**  avg `33.43`, p50 `33.29`, p95 `34.80`, p99 `35.26`, p99.9 `36.96`, max `37.71`

**Client tick (ms)**  avg `0.83`, p95 `1.02`, max `1.45`

**Memory**  start `805 MB`, end `783 MB`, peak `864 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 30.2 |           █                                                                    
 30.1 |           █                                                                    
 30.1 |           █                                 █  █     █                         
 30.1 | █  █  █   █        █  █  █  █  █            █  █  █  █            █  █  █  █   
 30.0 | █  █ ██   █     █  █  █  █  █  █   █        █  █  █  █      █ █   █ ██  █  █  █
 30.0 |██  █ ██ █ █  █  █ ██  █ ██  █  █  ██  █  █ ██  █ ██  █ ███  █ █   █ ██  █ ██  █
 29.9 |██ ██ ██ █ █ ██ ██ ██ ██ ██ ██████ ██ ██  █ ██ ██ ██ ██ ███ ██ █  ██ ██ ██ ██ ██
 29.9 |██ ██ ██ █ █ ██ ██ ██ ██ ██ ██████ ██ ██  █ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██
 29.9 |██ ██ ██ █ █ ██ ██ ██ ██ ██ ██████ █████ █████ ██ ██ ██ ██████ █████ ██ ██ ██ ██
 29.8 |██ ██ ██ █ █ ██ █████ ██ █████████████████████ ██ █████ ██████ █████ ██ ██ █████
 29.8 |████████ ███████████████ █████████████████████ █████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  28 ms |   1
  31 ms | ███  14
  32 ms | █████████████████████████████████████  186
  33 ms | ████████████████████████████████████████  199
  34 ms | ██████████████████████████████████████  187
  35 ms | ██  9
  36 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `57.00`
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
- `fps_0p1pct_low` = `26.52`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `fps_1pct_low` = `27.81`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `26.81`, p50 `29.94`, p95 `30.49`, p99 `30.71`, 1%low `28.34`, 0.1%low `26.81`, std `0.42`

**Frame time (ms)**  avg `33.44`, p50 `33.40`, p95 `34.08`, p99 `34.42`, p99.9 `36.46`, max `37.30`

**Client tick (ms)**  avg `0.43`, p95 `0.59`, max `0.88`

**Memory**  start `500 MB`, end `522 MB`, peak `862 MB`, GC `4 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 30.3 |                                                                            █   
 30.2 |                                                                            █   
 30.2 |                                                                            █   
 30.1 |           █                                                                █   
 30.0 |     █     █  █  █  █   █      █ █ █   █       █    █           █  █        ██ █
 29.9 |███ ██ ██  █ ██ ██  █   █ ██ █ █ █ ██  █ ██ █ ██ █  █ ██  █ ██  █  ██  █ ██ ██ █
 29.9 |███████████████████████ ████ █████ ███████████████████████████████ ████████ ████
 29.8 |██████████████████████████████████████████████████████████████████ ████████ ████
 29.7 |██████████████████████████████████████████████████████████████████ ████████ ████
 29.6 |███████████████████████████████████████████████████████████████████████████ ████
 29.6 |███████████████████████████████████████████████████████████████████████████ ████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  30 ms |   1
  31 ms |   1
  32 ms | ████████  89
  33 ms | ████████████████████████████████████████  465
  34 ms | ███  40
  35 ms |   1
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `58.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `26.81`
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
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `28.34`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `30.12`, min `25.15`, p50 `29.95`, p95 `34.11`, p99 `34.99`, 1%low `25.51`, 0.1%low `25.15`, std `2.53`

**Frame time (ms)**  avg `33.43`, p50 `33.38`, p95 `37.51`, p99 `38.60`, p99.9 `39.56`, max `39.77`

**Client tick (ms)**  avg `3.30`, p95 `4.88`, max `6.59`

**Memory**  start `540 MB`, end `678 MB`, peak `939 MB`, GC `5 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 31.1 |     █                                                                          
 31.0 |     █   █                                                                      
 30.8 |  █  █   █                                                                      
 30.7 |  █  █   █  █  █              █               █                                 
 30.5 |  █  █   █  █  █  █  █  █  █  █   █        █  █  █  █   █  █  █  █     █     █  
 30.4 |  █ ██   █  █  █  █  █  █  █  █   █  █  █  █  █  █  █   █  █  █  █  █  █  █  █  
 30.3 |  █ ██ ███ ██ ██  █  █  █ ██  █   █  █ ██  █  █ ██ ██   █  █  █  █  █  █  █  █  
 30.1 |  █ ██ ███ ██ ██ ██  █  █ ██  █ █ █  █ ██  █ ██ ██ ██   █  █  █ ██  █ ██ ██ ███ 
 30.0 | ██ ██ ███ ██ ██ ██ ██ ██ ██  █ ███  █ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ 
 29.8 | ██ ██ ██████ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ███ █████ ██ ██ ██ ██ ██ ███ 
 29.7 |██████████████████████████████████████ █████ █████ ████████████ ████████████████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  25 ms |   1
  28 ms | ████  15
  29 ms | ████████████  49
  30 ms | ███████████████████████████  109
  31 ms | ███████  27
  32 ms | ██████  24
  33 ms | ████████████████████████████████████████  163
  34 ms | ██  9
  35 ms | ██████  25
  36 ms | ████████████████████████████  116
  37 ms | ███████████  46
  38 ms | ███  11
  39 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.17`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `25.51`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `1.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `25.15`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `30.06`, min `25.44`, p50 `29.99`, p95 `33.54`, p99 `34.55`, 1%low `25.97`, 0.1%low `25.44`, std `2.07`

**Frame time (ms)**  avg `33.43`, p50 `33.34`, p95 `36.91`, p99 `38.00`, p99.9 `38.95`, max `39.30`

**Client tick (ms)**  avg `2.56`, p95 `4.18`, max `5.32`

**Memory**  start `908 MB`, end `774 MB`, peak `992 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 30.9 |       █                                                 █                      
 30.7 | █  █  █     █                                           █                      
 30.6 | █  █  █  █  █                                           █  █                   
 30.4 | █  █  █  █  █     █                  █            █  █  █  █         █         
 30.3 | █  █  █ ██  █  █  █  ██  █        █  █  █ ██   █  █  █ ██  █  █  █   █  █  █   
 30.2 |██ ██  █ ██  █ ██  █  ██  █  █     █  █  █ ██   █  █  █ ██  █  █  █   █  █  █  █
 30.0 |██ ██ ██ ██  █ ██ ███ ██  █ ██ ██ ██ ██ ██ ███ ██  █ ██ ██ ██ ██ ██  ██ ██  █ ██
 29.9 |██ ██ ██ ██ ██ ██ ███ ██ ██ █████ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██
 29.7 |████████ ███████████████████████████ █████ ████████████ ████████████████████████
 29.6 |███████████████████████████████████████████████████████ ████████████████████████
 29.5 |███████████████████████████████████████████████████████ ████████████████████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  27 ms |   1
  28 ms | ██  7
  29 ms | ███████  28
  30 ms | ████████████████  69
  31 ms | ████████████████████  87
  32 ms | ███████  30
  33 ms | ████████████████████████████████████████  171
  34 ms | ████  16
  35 ms | ██████████████████████  95
  36 ms | ████████████████  68
  37 ms | █████  20
  38 ms | █  6
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
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
- `fps_1pct_low` = `25.97`
- `fps_harmonic_avg` = `29.92`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `33.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `25.44`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `34.20`, min `17.10`, p50 `30.20`, p95 `61.37`, p99 `70.32`, 1%low `18.13`, 0.1%low `17.10`, std `13.81`

**Frame time (ms)**  avg `33.44`, p50 `33.11`, p95 `50.62`, p99 `52.71`, p99.9 `58.08`, max `58.49`

**Client tick (ms)**  avg `12.87`, p95 `17.92`, max `22.78`

**Memory**  start `621 MB`, end `941 MB`, peak `1015 MB`, GC `34 events / 107 ms`

**FPS over sampling window (ASCII):**

```
 44.2 |                                                           █                    
 42.9 |        █                  █                  █            █                    
 41.6 |        █                  █                  █            █                    
 40.4 |  █     █      █     █     █     █            █            █     █              
 39.1 |  █     █      █     █     █     █      █     █     █      █     █              
 37.9 |  █   █ █     ██     █     █     █      █     █     █      █     █              
 36.6 |  █   █ █     ██     █     █     █      █    ██     █      █     █              
 35.3 |  █  ████  █ ███  █ ██  █ ██     █   █ ██  █ ██  █ ██  █  ██  █  █  █  █        
 34.1 |  █  █████ █ ███  █ ██  █ ███ █ ████ ████  █ ███ █ ███ █  ██  █ ██  █  █        
 32.8 | █████████ █████ ████████ ███████████████  █ █████ █████  ██ ██ █████ ██     █  
 31.6 |██████████████████████████████████████████████████ ████████████████████████  █  
 30.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms | █  1
  10 ms | █  2
  11 ms | █  1
  12 ms | █  1
  13 ms | █  1
  14 ms | ██  4
  15 ms | ████████  15
  16 ms | ████████  16
  17 ms | █████████  18
  18 ms | █  2
  19 ms | ████  8
  20 ms | ████████████████  31
  21 ms | ██████████████████████████████  57
  22 ms | █████  10
  23 ms | ███  5
  24 ms | █  2
  25 ms | ████  7
  26 ms | ███  5
  27 ms | ███  6
  28 ms | ███  6
  29 ms | ██████  12
  30 ms | ████  7
  31 ms | ███████  14
  32 ms | ██████████████████████████████  57
  33 ms | ████████████████████████████████████████  76
  34 ms | ███████████  21
  35 ms | ██  4
  36 ms | █  1
  37 ms | █████  10
  38 ms | █████  10
  39 ms | █  1
  40 ms | ██  4
  41 ms | ██  3
  42 ms | ██████  11
  43 ms | ██  3
  44 ms | ██  4
  45 ms | ████████████████  30
  46 ms | ███████████████████████████████  58
  47 ms | ███████  13
  48 ms | ██  3
  49 ms | █████  10
  50 ms | ██████████████  27
  51 ms | ██████  11
  52 ms | ██  4
  53 ms | ██  3
  54 ms | █  1
  57 ms | █  1
  58 ms | █  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `23688.00`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `18.13`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4794.38`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `17.10`
- `falling_blocks_alive_p95` = `6400.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `34.98`, min `17.64`, p50 `30.21`, p95 `64.25`, p99 `75.86`, 1%low `18.08`, 0.1%low `17.64`, std `15.49`

**Frame time (ms)**  avg `33.44`, p50 `33.10`, p95 `51.96`, p99 `53.68`, p99.9 `56.46`, max `56.68`

**Client tick (ms)**  avg `13.78`, p95 `18.84`, max `25.01`

**Memory**  start `457 MB`, end `997 MB`, peak `1054 MB`, GC `32 events / 98 ms`

**FPS over sampling window (ASCII):**

```
 47.2 |                                        █                                       
 45.6 |               █                █       █                                       
 44.0 |               █                █       █                                       
 42.4 |         █     █     █          █       █     █            █                    
 40.8 |         █     █     █          █ █     █    ██            █     █              
 39.3 |         █     █     █          █ █     █    ██      █     █     █              
 37.7 |   █  █ ██     █     █  █ ███   █ █    ██    ██     ██     █     █  █           
 36.1 |   █  ████  ████  █ ██  █ ███  ████  █ ██    ██   █ ██  █ ██  █  █  █  █        
 34.5 |██ █  ████  ████  █ ███ █ ███  ████ █████  █ ████ ████  █ ██  █ ███ █ ██        
 32.9 |██████████ ██████████████ ███ █████ █████ ██ █████████ ██ ███████████ ██   █  █ 
 31.3 |█████████████████████████████████████████████████████████ ██████████████████ ██ 
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   1
   9 ms |   1
  10 ms |   1
  12 ms |   1
  13 ms | ██  5
  14 ms | ███  7
  15 ms | ████████████  24
  16 ms | ███████████  22
  17 ms | █  2
  18 ms | █████  11
  19 ms | ██████████████  28
  20 ms | ██████████████████████████  53
  21 ms | █████  10
  24 ms | ███████  14
  25 ms | █  2
  26 ms | █  2
  27 ms | ██  4
  28 ms | █████████  19
  29 ms | ███  7
  30 ms | ████  8
  31 ms | ██████  13
  32 ms | █████████████████████████  51
  33 ms | ████████████████████████████████████████  82
  34 ms | ██████████  21
  35 ms | ██  4
  36 ms | █  3
  37 ms | ██  5
  38 ms | ██████  12
  40 ms |   1
  41 ms | █  3
  42 ms | ████  9
  43 ms | ██  4
  45 ms | ██  4
  46 ms | ██████████████  28
  47 ms | ███████████████████████████  55
  48 ms | ███████  15
  49 ms | █  3
  50 ms | ████  8
  51 ms | ████████████  25
  52 ms | ████████  17
  53 ms | ████  8
  54 ms |   1
  55 ms | █  2
  56 ms | █  2
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `20956.00`
- `preload_duration_ms` = `31.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `18.08`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4797.57`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `17.64`
- `falling_blocks_alive_p95` = `6400.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `29.97`, min `27.32`, p50 `29.94`, p95 `32.05`, p99 `32.36`, 1%low `27.55`, 0.1%low `27.32`, std `1.38`

**Frame time (ms)**  avg `33.43`, p50 `33.40`, p95 `35.67`, p99 `36.06`, p99.9 `36.49`, max `36.60`

**Client tick (ms)**  avg `1.70`, p95 `2.24`, max `3.15`

**Memory**  start `857 MB`, end `619 MB`, peak `1089 MB`, GC `5 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 30.4 |                                          █                                     
 30.3 |          █  █         █  █     █  █  █   █                                     
 30.2 |          █  █  █      █  █  █  █  █  █   █  █     █     █  █                   
 30.2 | █  █  █  █  █  █   █  █  █  █  █  █  █   █  █  █  █  █  █  █  █   █            
 30.1 | █  █  █  █  █  █   █  █  █  █  █  █  █   █  █  █  █  █  █  █  █   █ ██  █      
 30.0 | █  █  █  █  █  █   █  █ ██ ██  █  █  █   █  █  █  █ ██  █  █  █   █ ██  █     █
 30.0 | █ ██  █ ██ ██  █ ███ ██ ██ ██ ██  █ ██   █ ██ ██ ██ ██ ██  █ ██ ███ ██ ██ ██  █
 29.9 |██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██  █ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ █████
 29.9 |██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ █████
 29.8 |██ ██ ██ ██ ████████████ ██ ██ ██ ██ ██ ███ ██ ██ ██ ████████ ██████ ██ ████████
 29.7 |████████ ███████████████ ████████ ██████████████████████████████████ ███████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  29 ms |   2
  30 ms | ██  8
  31 ms | █████████████████████████████  148
  32 ms | ████████  43
  33 ms | ████████████████████████████████████████  207
  34 ms | ███████  36
  35 ms | █████████████████████████████  148
  36 ms | █  7
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3577.00`
- `preload_duration_ms` = `74.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `27.55`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.68`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `27.32`
- `falling_blocks_alive_p95` = `833.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `29.97`, min `27.19`, p50 `29.95`, p95 `32.07`, p99 `32.53`, 1%low `27.50`, 0.1%low `27.19`, std `1.39`

**Frame time (ms)**  avg `33.43`, p50 `33.39`, p95 `35.73`, p99 `35.98`, p99.9 `36.78`, max `36.78`

**Client tick (ms)**  avg `1.70`, p95 `2.31`, max `4.22`

**Memory**  start `723 MB`, end `453 MB`, peak `1102 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 30.4 |            █                                                                   
 30.3 |         █  █        █               █                                          
 30.2 |         █  █  █  █  █  █  █   █  █  █  █  █  █  █         █     █              
 30.2 |      █  █  █  █  █  █  █  █   █  █  █  █  █  █  █   █     █  █  █  █  █        
 30.1 |      █  █  █  █  █  █  █  █   █  █  █  █ ██  █  █   █  █  █  █  █  █  █  █     
 30.0 |  █   █  █  █  █ ██  █ ██  █  ██ ██  █  █ ██  █  █ █ █  █  █  █ ██  █  █  █   █ 
 30.0 | ██ █ █ ██ ██ ██ ██ ██ ██  █ ███ ██  █ ██ ██ ██  █ █ █ ██  █ ██ ██ ██ ██ ██  ██ 
 29.9 | ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ █ █ ██ ██ ██ ██ ██ ██ ███ ██ 
 29.8 | ██████ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ █ █ ██ ██ ██ ██ ██ ██ ███ ███
 29.8 |███████ ██ █████ ██ ██ █████ ███ ████████ ██████████████████ ██ ██ █████████████
 29.7 |███████ █████████████████████████████████ █████████████████████ ████████████████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  28 ms |   1
  30 ms | ███  17
  31 ms | ████████████████████████████  141
  32 ms | █████████  45
  33 ms | ████████████████████████████████████████  200
  34 ms | ████████  40
  35 ms | ██████████████████████████████  148
  36 ms | █  6
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3136.00`
- `preload_duration_ms` = `47.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `27.50`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.12`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `27.19`
- `falling_blocks_alive_p95` = `833.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `28.46`, min `9.79`, p50 `29.88`, p95 `30.60`, p99 `30.76`, 1%low `9.87`, 0.1%low `9.79`, std `5.20`

**Frame time (ms)**  avg `38.30`, p50 `33.47`, p95 `99.98`, p99 `100.84`, p99.9 `101.73`, max `102.19`

**Client tick (ms)**  avg `0.56`, p95 `0.73`, max `1.76`

**Memory**  start `647 MB`, end `591 MB`, peak `983 MB`, GC `1 events / 2 ms`

**FPS over sampling window (ASCII):**

```
 30.0 |                                                                            █   
 30.0 |█                                                       █                   █   
 30.0 |█                                █                      █                   █   
 30.0 |█                   █          █ █       █ ██   █       █        █          █   
 29.9 |█  ██    █    █  █  █   █ █    █ █       █ ██ █ █  █  █ █  █    ██  ██    █ █   
 29.9 |██ ███  ██  █ █ ██  █  ██ █  █ █ ██ ██ █ █ ████ ██ █ ██ █  █    ███ ███  ██ █ ██
 29.9 |██████  ███ ███████ █  ████ ██ █ █████████ ████ █████████████  ████ ████████████
 29.9 |██████ ████ ███████ █ ██████████ █████████ ████ █████████████ ██████████████████
 29.9 |██████ ██████████████ █████████████████████████ █████████████ ██████████████████
 29.8 |█████████████████████████████████████████████████████████████ ██████████████████
 29.8 |█████████████████████████████████████████████████████████████ ██████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   1
  32 ms | ██████████████████████  137
  33 ms | ████████████████████████████████████████  245
  34 ms | ████████████████  100
  98 ms |   1
  99 ms | ██  11
 100 ms | ████  22
 101 ms |   3
 102 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.87`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `41.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `9.79`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.11`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23136 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `9.81`, p50 `9.99`, p95 `10.10`, p99 `10.14`, 1%low `9.81`, 0.1%low `n/a`, std `0.06`

**Frame time (ms)**  avg `100.16`, p50 `100.14`, p95 `101.44`, p99 `101.74`, p99.9 `101.92`, max `101.92`

**Client tick (ms)**  avg `0.29`, p95 `0.42`, max `1.75`

**Memory**  start `998 MB`, end `565 MB`, peak `1018 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                              █                                                 
 10.0 |                    █         █                                              █  
 10.0 |                    █         █         █                                    █  
 10.0 |                    █         █         █                                    █  
 10.0 |  █    █  █  █  ██  █    █    █   █   █ ██   █   █     █       █    █    █   ███
 10.0 | █████ ██ ████ ███  ███████ █ █████████ █████████████████████ ███ ███  █ ███ ███
 10.0 |███████████████████ █████████ █████████ █████████████████████████ ████ █████ ███
 10.0 |███████████████████ █████████ █████████ █████████████████████████ ██████████ ███
 10.0 |█████████████████████████████ █████████ █████████████████████████ ██████████ ███
  9.9 |█████████████████████████████████████████████████████████████████ ██████████████
  9.9 |█████████████████████████████████████████████████████████████████ ██████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | ████  12
  99 ms | █████████  30
 100 ms | ████████████████████████████████████████  134
 101 ms | ███████  24
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `9540.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.98`
- `fps_1pct_low` = `9.81`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23139 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.37`, p50 `9.99`, p95 `10.12`, p99 `10.21`, 1%low `9.55`, 0.1%low `n/a`, std `0.12`

**Frame time (ms)**  avg `100.15`, p50 `100.09`, p95 `101.57`, p99 `102.47`, p99.9 `105.93`, max `106.70`

**Client tick (ms)**  avg `0.26`, p95 `0.43`, max `1.53`

**Memory**  start `550 MB`, end `695 MB`, peak `1046 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                                              █                 
 10.2 |                                                              █                 
 10.2 |                                                              █                 
 10.1 |                                                              █                 
 10.1 |                                         █         █          █                 
 10.0 | █ █  █ █  █ █  █ █  █ █  █ █  █ █  █  █ █ █  █ █  █ █  █ █   ██    █  █ █  █ █ 
 10.0 | █ ██ █ █  █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██ █ ██  ███ ████ █ ██ █ ██
  9.9 |███████████████ ████ ███████████████████ █████████ ██████████ ██████████████████
  9.9 |█████████████████████████████████████████████████████████████ ██████████████████
  9.8 |█████████████████████████████████████████████████████████████ ██████████████████
  9.8 |█████████████████████████████████████████████████████████████ ██████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  93 ms | █  1
  97 ms | █  2
  98 ms | █████████████████  25
  99 ms | ████████████████████████████████████  53
 100 ms | ████████████████████████████████████████  59
 101 ms | █████████████████████████████████████  55
 102 ms | ███  4
 106 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `9.55`
- `preset_long` = `0.00`
- `preload_duration_ms` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `n/a`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.60`, p50 `10.00`, p95 `10.16`, p99 `10.22`, 1%low `9.66`, 0.1%low `n/a`, std `0.11`

**Frame time (ms)**  avg `100.14`, p50 `100.03`, p95 `101.98`, p99 `102.61`, p99.9 `103.90`, max `104.16`

**Client tick (ms)**  avg `0.28`, p95 `0.62`, max `1.93`

**Memory**  start `474 MB`, end `938 MB`, peak `938 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                   █                                            
 10.1 |           █                       █                   █                        
 10.0 |       █   █                       █                   █               █     █  
 10.0 | █     █   █ █  █      █       █   █ █ █ █             █   █       █   █     █ █
 10.0 | █   █ █ █ █ █  █  █   █ █ █   █   █ █ █ █   █ █ █ █ █ █ █ █   █   █ █ █ █ █ █ █
 10.0 | █ █ █ █ █ █ █ ███ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █ █   █ █ █ █ █ █ █
 10.0 | █ █ █ █ █ ███ █████ █ █ █ ███ █ █ █ █ █ ███ █ █ █ █ █ █ █ █ █ █  ██ █ █ █ █ █ █
 10.0 | ███ █ █ █ ███ █████████ █████ ███ █ █ █ █████████ ███ █ █ █ █████████ ███ █ █ █
 10.0 |██████████ ███ ███████████████████ ███ █ █████████████ ███████████████ █████ ███
  9.9 |██████████ ███ ███████████████████ █████ █████████████ █████████████████████████
  9.9 |██████████ █████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  96 ms | █  1
  97 ms | ███  4
  98 ms | █████████████████████  32
  99 ms | ████████████████████████████████████████  60
 100 ms | ███████████████████████████████████  52
 101 ms | ███████████████████████████  41
 102 ms | ██████  9
 104 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `9.66`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `n/a`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.77`, p50 `9.99`, p95 `10.12`, p99 `10.13`, 1%low `9.79`, 0.1%low `n/a`, std `0.06`

**Frame time (ms)**  avg `100.15`, p50 `100.14`, p95 `101.40`, p99 `101.60`, p99.9 `102.25`, max `102.33`

**Client tick (ms)**  avg `0.28`, p95 `0.44`, max `1.61`

**Memory**  start `670 MB`, end `794 MB`, peak `794 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                                     █                          
 10.1 |                                                     █              █           
 10.1 |   █              █         █         █    █    █    █         █    █    █    █ 
 10.0 |   █  █ █ █  █    █    █    █    █    █    █    █    █    █    █    █    █    █ 
 10.0 |   █  █ █ █  █    █    █    █    █    █    █    █    █ █  █    █    █    █    █ 
 10.0 |█  ██ █ █ ██ ████ ██   █  █ ████ ██ █ ███  ████ ██ █ █ ██ ████ █  █ █    ██ █ ██
 10.0 |██ ██ █ █ ██ ████ ████ ████ ████ ████ ████ ████ ████ █ ██ ████ ████ ████ ████ ██
 10.0 |██ ██ █ █ ██ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ██
  9.9 |██ ██████████████ █████████ █████████ ████ ████ ████ ████ ████ ████ █████████ ██
  9.9 |████████████████████████████████████████████████████ ██████████████ ████████████
  9.9 |████████████████████████████████████████████████████ ███████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  97 ms |   1
  98 ms | ████  14
  99 ms | █████  18
 100 ms | ████████████████████████████████████████  146
 101 ms | █████  20
 102 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `9.79`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23141 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.11`, p50 `9.99`, p95 `10.22`, p99 `10.44`, 1%low `9.21`, 0.1%low `n/a`, std `0.17`

**Frame time (ms)**  avg `100.17`, p50 `100.10`, p95 `102.62`, p99 `105.14`, p99.9 `109.25`, max `109.72`

**Client tick (ms)**  avg `0.40`, p95 `1.10`, max `6.91`

**Memory**  start `1067 MB`, end `913 MB`, peak `1486 MB`, GC `51 events / 240 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                                                                  █             
 10.2 |                                                                  █             
 10.1 |                                                     █            █      █      
 10.1 |                      █                █      █     ██            █      █      
 10.1 |            █   █     █    █     ██ █  ██  █  █     ██  █   █     █  █  ██      
 10.0 |  ██   █ █  █   ████  ██   ████  ██ █  ██  █  ██ █  ██  ██  █   █ █  ██ ██  ██  
 10.0 |  ██ █████ ██ █ █████ ██ █ ████  ██ ██ ██  ██ ██ █  ███ ██  █  ██ █ ███ ██  ████
  9.9 |  ████████ ████ █████ ██ █ ████  ██ ██ ███████████  ███ █████████ █ ███ ███ ████
  9.9 |█████████████████████ █████████ ██████ ████████████ █████████████ █████ ████████
  9.9 |██████████████████████████████████████ ████████████ █████████████ █████ ████████
  9.8 |███████████████████████████████████████████████████ ███████████████████ ████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  93 ms | █  1
  95 ms | █  2
  96 ms | █  2
  97 ms | █████  7
  98 ms | █████████████████  26
  99 ms | ███████████████████████████████████  54
 100 ms | ████████████████████████████████████████  61
 101 ms | ██████████████████  28
 102 ms | ███████  11
 103 ms | ███  4
 104 ms | █  1
 105 ms | █  1
 107 ms | █  1
 109 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.21`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `13.00`
- `entity_count_delta` = `-6.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `7.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23143 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.44`, p50 `9.99`, p95 `10.21`, p99 `10.44`, 1%low `9.44`, 0.1%low `n/a`, std `0.17`

**Frame time (ms)**  avg `100.18`, p50 `100.09`, p95 `103.01`, p99 `104.97`, p99.9 `105.92`, max `105.93`

**Client tick (ms)**  avg `0.38`, p95 `1.16`, max `1.94`

**Memory**  start `1600 MB`, end `1810 MB`, peak `1847 MB`, GC `31 events / 210 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |  █            █                                                                
 10.1 |  █            █                           █ █                   █              
 10.1 |  █          █ █         █         █       █ █       █ █  █    █ █      █       
 10.1 |█ █  █      ██ █    █    █    █  █ █       █ █       █ █  █ █ ██ █    █ █  █    
 10.0 |█ █  ███    ██ █    █ █  ██   █  █ ███ █ █ █ █ █ ██  █ █  █ █ ██ █   ██ █  ██  █
 10.0 |█ █  ███  █ ██ ███  █ █  ██   ████ ███ ███ █ █ █ ██ ██ █  █ █ ██ ██ ███ █  ███ █
 10.0 |█ █  ███  █ ██ █████████ ██ ██████ ███ ███ █ █ ███████ ██ █ █ ██ ██ ███ █  ███ █
  9.9 |████ ██████ ██ ███████████████████ ███████ █ █████████ ██████ ██ ██████ █ ████ █
  9.9 |████ ██████ ██ ███████████████████ █████████ █████████ ██████ ██ ██████ █ ██████
  9.8 |██████████████ ███████████████████ █████████ ████████████████████████████ ██████
  9.8 |████████████████████████████████████████████ ███████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  94 ms | █  1
  95 ms | ██  2
  96 ms | █  1
  97 ms | █████  7
  98 ms | ████████████████████████  32
  99 ms | ████████████████████████████████████████  53
 100 ms | ██████████████████████████████████████  50
 101 ms | ██████████████████  24
 102 ms | ██████████████  19
 103 ms | █████  6
 104 ms | ██  2
 105 ms | ██  2
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.44`
- `surface_water_ratio` = `0.06`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `99.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23161 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.93`, p50 `9.98`, p95 `10.25`, p99 `10.56`, 1%low `8.95`, 0.1%low `n/a`, std `0.23`

**Frame time (ms)**  avg `100.26`, p50 `100.19`, p95 `102.79`, p99 `110.72`, p99.9 `111.93`, max `112.03`

**Client tick (ms)**  avg `0.30`, p95 `0.48`, max `2.09`

**Memory**  start `1646 MB`, end `1086 MB`, peak `2255 MB`, GC `26 events / 197 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                          █                                     
 10.2 |                                          █                                     
 10.2 |                                          █                     █               
 10.1 |  █       █ █   █ ██  █  █   █  █  █ █ █  █   █   █ █      █    █        █      
 10.0 |█ ██ ████ █ ██  █ ███ █  ███ █  █  █ █ ██ ██ ███ █████ ██ ███ █ █ ███ ██████ █ █
  9.9 |█████████ ███████ ██████████████████ ████ ███████████████████████████ ████████ █
  9.8 |█████████ ███████████████████████████████ ██████████████████████████████████████
  9.8 |█████████ ███████████████████████████████ ██████████████████████████████████████
  9.7 |█████████ ██████████████████████████████████████████████████████████████████████
  9.6 |█████████ ██████████████████████████████████████████████████████████████████████
  9.5 |█████████ ██████████████████████████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | ██  2
  94 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | █████████  11
  98 ms | █████████████████████████  30
  99 ms | ████████████████████████████████████████  48
 100 ms | ████████████████████████████████████  43
 101 ms | ██████████████████████████████████  41
 102 ms | ███████████  13
 103 ms | ███  3
 104 ms | ██  2
 108 ms | █  1
 110 ms | █  1
 111 ms | █  1
 112 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.95`
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
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23173 ms  |  Sample ticks: 400

**FPS**  avg `9.97`, min `8.94`, p50 `9.98`, p95 `10.24`, p99 `10.39`, 1%low `8.97`, 0.1%low `n/a`, std `0.19`

**Frame time (ms)**  avg `100.30`, p50 `100.19`, p95 `103.40`, p99 `106.73`, p99.9 `111.70`, max `111.88`

**Client tick (ms)**  avg `0.36`, p95 `0.73`, max `3.81`

**Memory**  start `1044 MB`, end `1376 MB`, peak `2233 MB`, GC `22 events / 175 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                      █  █                █      █                              
 10.1 |            █         █  █          █  █  █      █      █                    █  
 10.0 | █  █ ██ ██ ██  ██ ██ █  ██ ███ █  ██  █  █ ███  █ ███  █  █  ██  █  █   ██  ███
 10.0 |██ ██ ██ ██ ██████ ██ ██ ██ ██████ ███ █  █ ████ ██████ ██ ████████████████  ███
  9.9 |███████████ █████████ █████ ███████████████ ████ ███████████████████████████████
  9.8 |███████████ ████████████████████████████████████████████████████████████████████
  9.8 |███████████ ████████████████████████████████████████████████████████████████████
  9.7 |███████████ ████████████████████████████████████████████████████████████████████
  9.6 |███████████ ████████████████████████████████████████████████████████████████████
  9.6 |███████████ ████████████████████████████████████████████████████████████████████
  9.5 |███████████ ████████████████████████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  92 ms | █  1
  95 ms | █  1
  96 ms | ██  2
  97 ms | █████████  11
  98 ms | ██████████████████████  27
  99 ms | ████████████████████████████████████████  50
 100 ms | ████████████████████████████████████████  50
 101 ms | ██████████████████████████████  37
 102 ms | ███████  9
 103 ms | █████  6
 104 ms | ██  3
 106 ms | █  1
 110 ms | █  1
 111 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.97`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `8.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `14.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23176 ms  |  Sample ticks: 400

**FPS**  avg `9.97`, min `9.12`, p50 `9.98`, p95 `10.18`, p99 `10.31`, 1%low `9.23`, 0.1%low `n/a`, std `0.16`

**Frame time (ms)**  avg `100.28`, p50 `100.17`, p95 `102.33`, p99 `106.92`, p99.9 `109.13`, max `109.68`

**Client tick (ms)**  avg `0.34`, p95 `1.12`, max `1.69`

**Memory**  start `1111 MB`, end `2065 MB`, peak `2230 MB`, GC `25 events / 183 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                   █                                            
 10.2 |                                   █                                            
 10.2 |       █              █            █                                    █       
 10.1 |       █     █        █            █                                    █       
 10.0 |  █    █ █   █  █  █  █    █  █ █  █ █ █   █  █      █  █      █  █ █ █ ██  █  █
 10.0 |█ █   ██ █   █  █████ ██ ██████ ██ ███ ██ ███ ██ ██████ ███  █ ██ █ █ █ ██  █ ██
  9.9 |█████████████████████ ██ █████████ ████████████████████████████████████ ██  ████
  9.9 |█████████████████████ ████████████ ████████████████████████████████████ ██ █████
  9.8 |██████████████████████████████████ ████████████████████████████████████ ██ █████
  9.8 |██████████████████████████████████ ████████████████████████████████████ ██ █████
  9.7 |███████████████████████████████████████████████████████████████████████ ██ █████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  94 ms | █  1
  96 ms | █  2
  97 ms | ███  5
  98 ms | ██████████████  24
  99 ms | ████████████████████████████████  53
 100 ms | ████████████████████████████████████████  67
 101 ms | █████████████████  29
 102 ms | ███████  11
 103 ms | █  2
 104 ms | █  2
 105 ms | █  1
 106 ms | █  2
 109 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.23`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `62.00`
- `entity_count_delta` = `-58.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24461 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `9.37`, p50 `9.98`, p95 `10.23`, p99 `10.38`, 1%low `9.42`, 0.1%low `n/a`, std `0.17`

**Frame time (ms)**  avg `100.24`, p50 `100.24`, p95 `102.68`, p99 `105.18`, p99.9 `106.49`, max `106.71`

**Client tick (ms)**  avg `0.33`, p95 `0.61`, max `4.46`

**Memory**  start `913 MB`, end `1783 MB`, peak `2195 MB`, GC `25 events / 187 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |  █                        █                                █                   
 10.1 |  █ █                      █                                █                   
 10.1 |  █ █       █      █  █    █              █          █   █  █      █  █         
 10.1 |  █ █  █ █  █ █  █ █  █    █    ██   █ █  █      █   █   █  █ ██   █  █ ██ █ █  
 10.0 |  █ █  █ █  █ █  █ █  █ █  ███  ██   █ █  ██ █ ███  ███  █  █ ██   █  █ ██ ███  
 10.0 |█ █ ██ ████ █ █ ██ █ ██ ██ ███ ███  ████  ██ █ ███  ████ █  █ ███  █ ██ ██ ███ █
  9.9 |█ █ ███████ ████████ █████ ███ ████████████████████ ████ █  █ █████████ ██ █████
  9.9 |█ █ ███████ ██████████████ █████████████████████████████ ██ ██████████████ █████
  9.8 |█ █ ██████████████████████ ███████████████████████████████████████████████ █████
  9.8 |█ ████████████████████████ █████████████████████████████████████████████████████
  9.7 |█ ████████████████████████ █████████████████████████████████████████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  94 ms | █  1
  96 ms | ██  3
  97 ms | ████████  10
  98 ms | ███████████████████████  29
  99 ms | ██████████████████████████████████████  47
 100 ms | ████████████████████████████████████████  50
 101 ms | ████████████████████████████  35
 102 ms | ████████████  15
 103 ms | ███  4
 104 ms | ██  2
 105 ms | ██  2
 106 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.42`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `16.00`
- `entity_count_delta` = `-15.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1403.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `58.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23154 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `9.09`, p50 `9.97`, p95 `10.26`, p99 `10.29`, 1%low `9.20`, 0.1%low `n/a`, std `0.17`

**Frame time (ms)**  avg `100.24`, p50 `100.25`, p95 `102.74`, p99 `104.84`, p99.9 `109.53`, max `110.05`

**Client tick (ms)**  avg `0.40`, p95 `0.96`, max `7.42`

**Memory**  start `1063 MB`, end `2086 MB`, peak `2267 MB`, GC `21 events / 163 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |          █                                                                     
 10.3 |          █                                                                     
 10.2 |          █                   █                                                 
 10.1 |          █                   █    █                                            
 10.1 |█ █  ██   █    █   █   █ █    █ █  █ █ █ ██  ██  ██    ██  ██  █  █  ██    █    
 10.0 |█ ██ ███  █ █ ████ ██ ██ ███  █ ██ ███ ████ ████ █████ ███ ███ █ ███ █████ ███ █
  9.9 |████████  ████████████████████████████ █████████ █████████ █████████████████████
  9.8 |█████████ ████████████████████████████ ███████████████████ █████████████████████
  9.7 |██████████████████████████████████████████████████████████ █████████████████████
  9.6 |██████████████████████████████████████████████████████████ █████████████████████
  9.5 |██████████████████████████████████████████████████████████ █████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  92 ms | █  1
  96 ms | █  1
  97 ms | ███████████  14
  98 ms | ██████████████████  24
  99 ms | ███████████████████████████████████████  52
 100 ms | ████████████████████████████████████████  53
 101 ms | █████████████████████████  33
 102 ms | █████████  12
 103 ms | █████  7
 104 ms | █  1
 107 ms | █  1
 110 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.20`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `74.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24753 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.84`, p50 `9.98`, p95 `10.20`, p99 `10.29`, 1%low `9.20`, 0.1%low `n/a`, std `0.16`

**Frame time (ms)**  avg `100.19`, p50 `100.16`, p95 `102.11`, p99 `103.75`, p99.9 `111.34`, max `113.08`

**Client tick (ms)**  avg `0.38`, p95 `0.75`, max `4.66`

**Memory**  start `823 MB`, end `1384 MB`, peak `2136 MB`, GC `28 events / 186 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                                               █               █
 10.1 |                                                               █               █
 10.1 |        █                 █         █      █         █     █   █     █   █ █   █
 10.0 |      █ ██   █ █   █      █      █  █  █   █  █      █     █   █     █   █ █   █
 10.0 |  █   █ ██ █ █ █   █ █   ██ █    █  █  █   █  █ ██   █     █   █  █  █   █ █   █
 10.0 | ███  █ ██ █ █ ██  █ █ █ ██ █ █  █ ██ ██   █  █ ███  █  █ ██   ██ █  █ █ █ ██ ██
 10.0 | ██████ ██ █ █ ██ ████ ████ ██████ ██ ██ █ ██ █ ████ ██ █ ██ █ ██ █  ███ █ ██ ██
  9.9 |███████ ██ ███ ██ █████████ ██████ ██ ████ ████ ████ ████ ████ ████ ████ █ ██ ██
  9.9 |███████ ████████████████████████████████████████████ █████████████████████ ██ ██
  9.9 |███████ ██████████████████████████████████████████████████████████████████ ██ ██
  9.9 |█████████████████████████████████████████████████████████████████████████████ ██
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  93 ms | █  1
  97 ms | ██████  8
  98 ms | █████████████████  24
  99 ms | ████████████████████████████████████████  58
 100 ms | ███████████████████████████████████████  57
 101 ms | ███████████████████████████  39
 102 ms | ███  5
 103 ms | ███  5
 104 ms | █  1
 113 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.20`
- `surface_water_ratio` = `0.14`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `43.00`
- `entity_count_delta` = `-42.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1702.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23176 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.78`, p50 `9.97`, p95 `10.29`, p99 `10.98`, 1%low `8.81`, 0.1%low `n/a`, std `0.28`

**Frame time (ms)**  avg `100.30`, p50 `100.29`, p95 `103.88`, p99 `111.31`, p99.9 `113.78`, max `113.94`

**Client tick (ms)**  avg `0.39`, p95 `0.78`, max `8.02`

**Memory**  start `1780 MB`, end `1201 MB`, peak `2238 MB`, GC `26 events / 196 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                        █                                       
 10.2 |                                        █                █       █              
 10.1 |                     ██             █   █        █       █ █     █  █           
 10.0 | █    ██  █  █       ██  █ █ █   █  █   █  █  █  █       █ █ █ █ ██ ███  █  █ █ 
 10.0 |████ ███████ ███████ ███ ██████ ██████ ████████ ██  ██ █ ███████ ██ ███ ██ ██ ██
  9.9 |████████████ ███████ ██████████████████████████ ██ █████ ███████ ██ ████████████
  9.8 |███████████████████████████████████████████████ ████████████████ ██ ████████████
  9.7 |███████████████████████████████████████████████ ████████████████████████████████
  9.7 |███████████████████████████████████████████████ ████████████████████████████████
  9.6 |███████████████████████████████████████████████ ████████████████████████████████
  9.5 |███████████████████████████████████████████████ ████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  90 ms | █  1
  91 ms | █  1
  94 ms | █  1
  95 ms | █  1
  96 ms | ███  4
  97 ms | ██████  8
  98 ms | ████████████████████  26
  99 ms | █████████████████████████████████  43
 100 ms | ████████████████████████████████████████  52
 101 ms | █████████████████████████████  38
 102 ms | ████████  10
 103 ms | ███  4
 104 ms | ██  3
 105 ms | ██  3
 110 ms | █  1
 111 ms | █  1
 113 ms | ██  2
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.81`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `22.00`
- `entity_count_delta` = `6.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `28.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23351 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.80`, p50 `10.00`, p95 `10.21`, p99 `10.58`, 1%low `8.96`, 0.1%low `n/a`, std `0.22`

**Frame time (ms)**  avg `100.22`, p50 `100.02`, p95 `102.49`, p99 `106.26`, p99.9 `112.86`, max `113.68`

**Client tick (ms)**  avg `0.32`, p95 `0.58`, max `6.18`

**Memory**  start `1755 MB`, end `990 MB`, peak `2239 MB`, GC `23 events / 186 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                   █                                            
 10.7 |                                   █                                            
 10.5 |                                   █                                            
 10.4 |                                   █                                            
 10.3 |                                   █          █                                 
 10.1 |█    █    █ █  █    █ █  █    █  █ █      █   █  █  █                 █ █  █    
 10.0 |████ ██████ ██ ██████ ██ ███ █████ ██████ █ █ ██ ██ ███████████████████ ██ █████
  9.8 |██████████████████████████████████ ████████████████████████████████████ ████████
  9.7 |██████████████████████████████████ █████████████████████████████████████████████
  9.6 |██████████████████████████████████ █████████████████████████████████████████████
  9.4 |██████████████████████████████████ █████████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  93 ms | █  1
  94 ms | █  1
  96 ms | █  2
  97 ms | ████  7
  98 ms | █████████████  21
  99 ms | ████████████████████████████████████████  63
 100 ms | ███████████████████████████████████  55
 101 ms | █████████████████  26
 102 ms | ██████████  15
 103 ms | █  1
 105 ms | ██  3
 106 ms | █  1
 109 ms | █  1
 113 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.96`
- `surface_water_ratio` = `0.10`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `300.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `54.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23150 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `8.60`, p50 `9.98`, p95 `10.21`, p99 `10.78`, 1%low `8.82`, 0.1%low `n/a`, std `0.27`

**Frame time (ms)**  avg `100.21`, p50 `100.17`, p95 `102.59`, p99 `110.10`, p99.9 `115.10`, max `116.23`

**Client tick (ms)**  avg `0.45`, p95 `1.21`, max `15.04`

**Memory**  start `1485 MB`, end `2056 MB`, peak `2342 MB`, GC `21 events / 171 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                  █                                                             
 10.8 |                  █                 █                                           
 10.6 |                  █                 █                                           
 10.5 |                  █                 █                                           
 10.3 |                  █                 █                               █           
 10.2 |                  █                 █  █      █                   █ █           
 10.1 |██ █ ██  █  ██  █ ██  █  █ █ ██  ██ █  █  ██  █ █   ██  █    █ █  █ █ █  █  █ █ 
  9.9 |████ ██████████ █ █████████████████ ██ ████████████████████████████ ████████████
  9.8 |█████████████████ █████████████████ ███████████████████████████████ ████████████
  9.6 |█████████████████ █████████████████ ███████████████████████████████ ████████████
  9.5 |█████████████████ ██████████████████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  87 ms | █  1
  92 ms | █  1
  95 ms | █  2
  96 ms | ██  3
  97 ms | ███  4
  98 ms | █████████████████  26
  99 ms | █████████████████████████████████  50
 100 ms | ████████████████████████████████████████  60
 101 ms | █████████████████████  32
 102 ms | ████████  12
 103 ms | █  2
 104 ms | █  2
 109 ms | █  1
 110 ms | █  2
 116 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.82`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-7.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `74.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23063 ms  |  Sample ticks: 400

**FPS**  avg `9.97`, min `8.92`, p50 `9.99`, p95 `10.18`, p99 `10.30`, 1%low `9.18`, 0.1%low `n/a`, std `0.16`

**Frame time (ms)**  avg `100.28`, p50 `100.12`, p95 `102.67`, p99 `104.98`, p99.9 `110.85`, max `112.10`

**Client tick (ms)**  avg `0.31`, p95 `1.16`, max `4.31`

**Memory**  start `1104 MB`, end `1119 MB`, peak `2418 MB`, GC `20 events / 176 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                         █                                      
 10.2 |                      █                  █                               █      
 10.1 |     █   █  █         █    █             █   ██  █                █      █  █   
 10.0 |█ ██ █ █ █ ██ █ ██ █  █ █ ██ █  █   █  █ █   ██  █  ██  █ ██  ██  █ ██   █  █  █
  9.9 |████ ████████ ███████ ██████ ███████████ ██  ██  █  ███████████████ ███ ████████
  9.9 |█████████████ ██████████████ ███████████ ███ ██████████████████████████ ████████
  9.8 |████████████████████████████ ███████████ ███████████████████████████████████████
  9.7 |████████████████████████████ ███████████████████████████████████████████████████
  9.6 |████████████████████████████ ███████████████████████████████████████████████████
  9.6 |████████████████████████████ ███████████████████████████████████████████████████
  9.5 |████████████████████████████ ███████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  94 ms | █  1
  95 ms | █  1
  97 ms | █████  7
  98 ms | ██████████████████  25
  99 ms | ████████████████████████████████████████  56
 100 ms | ███████████████████████████████████████  54
 101 ms | ██████████████████████████  37
 102 ms | ████████  11
 103 ms | █  2
 104 ms | ██  3
 105 ms | █  1
 112 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.18`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `31.00`
- `entity_count_delta` = `-30.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.77`, p50 `9.99`, p95 `10.10`, p99 `10.12`, 1%low `9.80`, 0.1%low `n/a`, std `0.06`

**Frame time (ms)**  avg `100.15`, p50 `100.15`, p95 `101.24`, p99 `101.56`, p99.9 `102.25`, max `102.37`

**Client tick (ms)**  avg `0.26`, p95 `0.40`, max `1.66`

**Memory**  start `1425 MB`, end `1509 MB`, peak `1509 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                 █                                              
 10.1 |                                 █                                              
 10.1 |                       █         █    █    █                             █    █ 
 10.0 |   █    █    █    █    █    █    █    █    █         █    █    █    █    █    █ 
 10.0 |   █    █    █    █    █ █  █    █    █    █    ██   █    █    █  █ █    █    █ 
 10.0 |   ██ █ ██   █    █    █ █  █ █  █    █ █  █    ██   ██   █  █ █  █ ██   █    █ 
 10.0 |█  ████ ███  ████ ████ █ ██ ████ ████ ████ ████ ████ ████ ████ ██ █ ███  ████ ██
 10.0 |█ █████ █████████ ████ █ ██ ████ ████ ████ ████ ████ ████ ████ ████ █████████ ██
  9.9 |███████ █████████ ████ █████████ ████ ████ ████ ██████████████ ██████████████ ██
  9.9 |██████████████████████ █████████ ███████████████████████████████████████████████
  9.9 |████████████████████████████████ ███████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  97 ms |   1
  98 ms | ███  10
  99 ms | █████████  31
 100 ms | ████████████████████████████████████████  143
 101 ms | ████  14
 102 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `9.80`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.99`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23136 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.13`, p50 `9.99`, p95 `10.10`, p99 `10.24`, 1%low `9.36`, 0.1%low `n/a`, std `0.13`

**Frame time (ms)**  avg `100.15`, p50 `100.10`, p95 `101.38`, p99 `103.03`, p99.9 `108.43`, max `109.49`

**Client tick (ms)**  avg `2.72`, p95 `3.05`, max `4.24`

**Memory**  start `1614 MB`, end `1593 MB`, peak `2458 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                                        █                       
 10.4 |                                                        █                       
 10.3 |                                                        █                       
 10.3 |                                                        █                       
 10.2 |                                    █  █                █                       
 10.1 | ██  █        █       █    █        █  █                █       █               
 10.0 | ███ █████ █ ██████ █ ████ ███ ██ █ ██ ██ ███████████ █ ██ ████ ████████████████
  9.9 |████ ████████████████ █████████████ ███████████████████ ████████████████████████
  9.8 |███████████████████████████████████████████████████████ ████████████████████████
  9.7 |███████████████████████████████████████████████████████ ████████████████████████
  9.6 |███████████████████████████████████████████████████████ ████████████████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   1
  97 ms | █  3
  98 ms | ██  5
  99 ms | █████████████████████████  65
 100 ms | ████████████████████████████████████████  105
 101 ms | █████  14
 102 ms | ██  4
 103 ms |   1
 104 ms |   1
 109 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `9.36`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `0.00`
- `seed` = `2521.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23135 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.58`, p50 `9.99`, p95 `10.11`, p99 `10.17`, 1%low `9.69`, 0.1%low `n/a`, std `0.08`

**Frame time (ms)**  avg `100.15`, p50 `100.14`, p95 `101.42`, p99 `102.01`, p99.9 `103.91`, max `104.36`

**Client tick (ms)**  avg `0.28`, p95 `0.44`, max `1.56`

**Memory**  start `1405 MB`, end `1625 MB`, peak `1625 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                                                    █           
 10.1 |             █         █    █              █              █         █         █ 
 10.0 |        █    █         █    █    █    █    █    █    █    █    █    █    █    █ 
 10.0 |█  █    █    █    █    █    █    █    █    █    █    █    █    █    █    █    █ 
 10.0 |█  █    █    █    █    █    █    █    █ █  █    █    █    █    █    █    █ █  █ 
 10.0 |██ ██ █ █  █ ██   █ █  █  █ █ ██ █  █ █ ██ █  █ █  █ █ █  █  █ █  █ █  █ █ ██ █ 
 10.0 |██ ████ ████ ████ ████ ████ ████ ████ █ ██ ████ ████ ████ ████ ████ ████ █ ██ ██
 10.0 |██ ████ ████ ████ ████ ████ ████ ████ █ ██ ████ ████ ████ ████ ████ ████ █ ██ ██
  9.9 |██ ████ ████ █████████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ██
  9.9 |██ █████████ █████████ ████ ████ █████████ ███████████████████ ████ █████████ ██
  9.9 |████████████ ██████████████████████████████████████████████████████ ████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  95 ms |   1
  98 ms | ████  12
  99 ms | █████████████  41
 100 ms | ████████████████████████████████████████  124
 101 ms | ██████  19
 102 ms | █  2
 104 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `9.69`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23139 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `9.75`, p50 `9.98`, p95 `10.13`, p99 `10.14`, 1%low `9.76`, 0.1%low `n/a`, std `0.09`

**Frame time (ms)**  avg `100.17`, p50 `100.16`, p95 `101.55`, p99 `101.82`, p99.9 `102.53`, max `102.60`

**Client tick (ms)**  avg `0.28`, p95 `0.44`, max `1.54`

**Memory**  start `1647 MB`, end `1783 MB`, peak `1783 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 | █                                                                              
 10.1 | █              █         █         █    █    █         █    █    █         █   
 10.0 | █         █    █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █    █    █    █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █    ██   █    █    █    █    █    █    █ █  █    █    █    █    █    █    █   
 10.0 | █  █ ██   █  █ █ ██ ████ ███  █ █  █ ██ █ █  ████ ██ █ ███  █  █ █ ██ ████ ██ █
 10.0 | ████ ████ █ ██ █ ██ ████ ███  ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
 10.0 | ████ ████ █ ██ █ ██ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 | ████ ██████ ██ ████ ████ █████████ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 | ███████████ ██ ███████████████████████████████████████ ████████████████████████
  9.9 | ███████████ ███████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  96 ms |   1
  98 ms | ██████████  27
  99 ms | ██████████  26
 100 ms | ████████████████████████████████████████  103
 101 ms | ████████████████  41
 102 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `toggles` = `22.00`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.98`
- `fps_1pct_low` = `9.76`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23137 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `9.64`, p50 `9.98`, p95 `10.11`, p99 `10.14`, 1%low `9.73`, 0.1%low `n/a`, std `0.07`

**Frame time (ms)**  avg `100.16`, p50 `100.15`, p95 `101.43`, p99 `101.85`, p99.9 `103.33`, max `103.68`

**Client tick (ms)**  avg `0.28`, p95 `0.58`, max `1.53`

**Memory**  start `1944 MB`, end `2100 MB`, peak `2100 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |           █                                  █                                 
 10.1 | █         █              █         █    █    █    █                   █        
 10.0 | █         █    █    █    █    █    █    █    █    █    █    █         █        
 10.0 | █         █    █    █    █    █  █ █    █    █    █    █    █    ██   █     █  
 10.0 | █  █  █   █ █  █    █ █  █    █  █ █ █  █ █  █    █    █    █    ██   █    ██  
 10.0 | ████  ██ █████ ████ ████ ████ ██ █ █ ██ ████ ████ ████ ████ ████ ████ ████ ████
 10.0 | ████  ██ █████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 | ████  ██ █████ █████████ █████████ ████ ████ ████ ████ █████████ ████ ████ ████
  9.9 |██████ ██████████████████████████████████████ ██████████████████████████████████
  9.9 |██████ █████████████████████████████████████████████████████████████████████████
  9.9 |██████ █████████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | █████  16
  99 ms | ██████  21
 100 ms | ████████████████████████████████████████  141
 101 ms | ██████  21
 103 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.98`
- `restocks` = `20.00`
- `fps_1pct_low` = `9.73`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23135 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.15`, p50 `9.99`, p95 `10.11`, p99 `10.19`, 1%low `9.42`, 0.1%low `n/a`, std `0.12`

**Frame time (ms)**  avg `100.15`, p50 `100.14`, p95 `101.43`, p99 `102.04`, p99.9 `108.03`, max `109.30`

**Client tick (ms)**  avg `0.31`, p95 `1.13`, max `9.30`

**Memory**  start `2131 MB`, end `755 MB`, peak `2235 MB`, GC `1 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                                               █                
 10.4 |                                                               █                
 10.3 |                                                               █                
 10.2 |                                                               █                
 10.2 |                                                               █                
 10.1 | █    █    █    █    █    █    █    █    █    █    █    █    █ █  █    █    █   
 10.0 | ████ ████ ████ ████ ████ ████ ████ ████ ████ █████████ ██████ ██ ████ ████ ████
  9.9 |██████████████████████████████████████████████████████████████ █████████████████
  9.8 |██████████████████████████████████████████████████████████████ █████████████████
  9.7 |██████████████████████████████████████████████████████████████ █████████████████
  9.6 |██████████████████████████████████████████████████████████████ █████████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   1
  96 ms |   1
  98 ms | ███  12
  99 ms | ██████  22
 100 ms | ████████████████████████████████████████  141
 101 ms | ██████  20
 102 ms | █  2
 109 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1088.00`
- `fps_1pct_low` = `9.42`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `n/a`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194698 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `8.92`, p50 `9.99`, p95 `10.11`, p99 `10.25`, 1%low `9.56`, 0.1%low `9.08`, std `0.10`

**Frame time (ms)**  avg `100.15`, p50 `100.13`, p95 `101.45`, p99 `102.63`, p99.9 `107.99`, max `112.12`

**Client tick (ms)**  avg `0.62`, p95 `1.08`, max `9.25`

**Memory**  start `2179 MB`, end `894 MB`, peak `2495 MB`, GC `11 events / 71 ms`

**FPS over sampling window (ASCII):**

```
 10.0 | █                                                                              
 10.0 | █                 █                              █                        █    
 10.0 | █         █  █    █      █ █ █                   █                █       █    
 10.0 | █       █ █  █    █ █    █ █ █    █            █ █ █  █           █       █    
 10.0 | █  █    █ █  █    █ █    █ █ █    █     █      █ █ █ ██       █   █  █ █  █    
 10.0 | █  █ █  █ █  ██ █ █ █ ██ ███ ██ █ █████ █ ██  ██ █ █ ███ ███ ██ █ █  █ █  █ ███
 10.0 | ██ ███  ████ ██ █ █ █ ██ ███ ██████████ █████ ██ ███ ███ ██████ ████ ████ █████
 10.0 | ██████  ████ ██ █ ██████ ████████████████████ ██████ ████████████████████ █████
 10.0 |████████████████ ████████████████████████████████████ ████████████████████ █████
 10.0 |██████████████████████████████████████████████████████████████████████████ █████
 10.0 |██████████████████████████████████████████████████████████████████████████ █████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  93 ms |   4
  95 ms |   4
  96 ms |   5
  97 ms | █  16
  98 ms | ███  73
  99 ms | ████████████████████████████  614
 100 ms | ████████████████████████████████████████  885
 101 ms | ███████  163
 102 ms | █  21
 103 ms |   4
 104 ms |   4
 107 ms |   2
 108 ms |   1
 112 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
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
- `entity_count_delta` = `22.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `9.56`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `9.08`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194156 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `8.88`, p50 `9.99`, p95 `10.11`, p99 `10.28`, 1%low `9.34`, 0.1%low `8.92`, std `0.13`

**Frame time (ms)**  avg `100.15`, p50 `100.14`, p95 `101.40`, p99 `103.20`, p99.9 `111.39`, max `112.58`

**Client tick (ms)**  avg `0.61`, p95 `1.08`, max `11.97`

**Memory**  start `1289 MB`, end `1413 MB`, peak `1968 MB`, GC `11 events / 65 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                                               █                                
 10.0 | ██           ██               █      █        █  █    █                     █  
 10.0 | ██           ██       █   █   █      █        █  █    █                     █  
 10.0 | ██        █  ██       █   ██  █ █  █ █ █      █  █ █  █ █ █  █    █    █ █  ██ 
 10.0 | ███  █    ██ ██ ███ █ █   ██  █ █ ██ █ ████ █ ████ █ ██ █ █  █  █ █ ██ █ █  ███
 10.0 | ████ █ ██ █████ ████████ ███ ██ █ █████████ █ ██████ ████ ███████ ████████  ███
 10.0 |███████ ████████ ████████ ████████ ███████████ ██████ ██████████████████████ ███
 10.0 |███████ ████████ █████████████████████████████ ██████ ██████████████████████████
 10.0 |███████ ██████████████████████████████████████ █████████████████████████████████
 10.0 |██████████████████████████████████████████████ █████████████████████████████████
 10.0 |██████████████████████████████████████████████ █████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   3
  89 ms |   2
  92 ms |   1
  93 ms |   2
  94 ms |   2
  95 ms |   2
  96 ms |   4
  97 ms | █  17
  98 ms | ████  84
  99 ms | ██████████████████████████  587
 100 ms | ████████████████████████████████████████  904
 101 ms | ███████  150
 102 ms | █  19
 103 ms |   8
 105 ms |   2
 106 ms |   1
 107 ms |   2
 108 ms |   1
 109 ms |   1
 110 ms |   2
 111 ms |   2
 112 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
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
- `entity_count_delta` = `19.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `9.34`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `8.92`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193571 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `9.05`, p50 `9.99`, p95 `10.11`, p99 `10.22`, 1%low `9.56`, 0.1%low `9.13`, std `0.10`

**Frame time (ms)**  avg `100.15`, p50 `100.12`, p95 `101.44`, p99 `102.51`, p99.9 `108.28`, max `110.48`

**Client tick (ms)**  avg `0.60`, p95 `1.05`, max `7.52`

**Memory**  start `834 MB`, end `1468 MB`, peak `1930 MB`, GC `10 events / 48 ms`

**FPS over sampling window (ASCII):**

```
 10.0 | █                                 █                                            
 10.0 | █         █                       █                                            
 10.0 | █         █         █  █   █      █              █                             
 10.0 | █ █ ██  █ █   ██  █ █  ███ █ █  █ ███ █ █ █ █  ████  █ █ ███ ███  ██ █  █ ██ █ 
 10.0 | █ ███████████████████████████████ ████████████ ████ ███████████████████ █ ██ ██
 10.0 | ███████████████████████████████████████████████████████████████████████ ███████
 10.0 |████████████████████████████████████████████████████████████████████████ ███████
 10.0 |████████████████████████████████████████████████████████████████████████ ███████
 10.0 |████████████████████████████████████████████████████████████████████████ ███████
 10.0 |████████████████████████████████████████████████████████████████████████ ███████
 10.0 |████████████████████████████████████████████████████████████████████████ ███████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   2
  92 ms |   1
  94 ms |   3
  95 ms |   1
  96 ms |   1
  97 ms | █  15
  98 ms | ████  92
  99 ms | ████████████████████████████  605
 100 ms | ████████████████████████████████████████  859
 101 ms | █████████  185
 102 ms | █  23
 103 ms |   4
 104 ms |   1
 105 ms |   2
 107 ms |   1
 108 ms |   2
 110 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `69.00`
- `trees_built` = `173.00`
- `phase` = `2.00`
- `segment_count` = `19.00`
- `part` = `4.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `21.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `90.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `9.56`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `9.13`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194542 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `9.23`, p50 `9.99`, p95 `10.12`, p99 `10.21`, 1%low `9.59`, 0.1%low `9.27`, std `0.10`

**Frame time (ms)**  avg `100.15`, p50 `100.13`, p95 `101.40`, p99 `102.32`, p99.9 `106.22`, max `108.40`

**Client tick (ms)**  avg `0.59`, p95 `1.05`, max `1.83`

**Memory**  start `982 MB`, end `1522 MB`, peak `1969 MB`, GC `10 events / 43 ms`

**FPS over sampling window (ASCII):**

```
 10.0 | █                                                                              
 10.0 | █                   █      █       █              █         █                  
 10.0 | █    █    █         █    █ █       █              █    █    █         █    █   
 10.0 | █    █    █    █    █    █ █    █  █    █         █    █    █    █    █    █   
 10.0 | █    █ █  █    █    █ █  █ █ ██ █  █    ██ █ █ █ ██    ██ █ ██   █    █    ██  
 10.0 | █   ██ █  █ █  █    ███  █ █ ██ █ ██ █  ██ █ █ █ ██    ██ █ ██   ██   █    ███ 
 10.0 | ███ ██████████ █ █ ████  ███ ████ ██ ██ ██████ █ ███ ████ █ ███ █████ ████ ███ 
 10.0 | ████████████████████████ ███ ████ ████████████ █ ██████████████ ██████████ ████
 10.0 | ████████████████████████████ ████ ██████████████ █████████████████████████ ████
 10.0 | ████████████████████████████ ██████████████████████████████████████████████████
 10.0 |█████████████████████████████ ██████████████████████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms |   1
  92 ms |   1
  93 ms |   2
  94 ms |   1
  95 ms |   2
  96 ms |   3
  97 ms |   10
  98 ms | ████  93
  99 ms | █████████████████████████  568
 100 ms | ████████████████████████████████████████  926
 101 ms | ███████  158
 102 ms | █  18
 103 ms |   6
 104 ms |   4
 105 ms |   2
 107 ms |   1
 108 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `70.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `18.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `9.59`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `9.27`

