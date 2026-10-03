# FPS Test session — 2026-09-05T19:40:37.446873188+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 119.1 | 100.6 | 86.2 | 9.53 | 0.54 | 1 | 184 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 119.0 | 103.4 | 97.5 | 9.50 | 0.57 | 2 | 181 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 29.9 | 28.6 | 28.4 | 34.73 | 0.58 | 1 | 116 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.9 | 28.3 | 27.0 | 34.75 | 0.61 | 2 | 95 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 29.9 | 28.5 | 28.0 | 34.74 | 0.59 | 1 | 204 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.9 | 28.9 | 28.7 | 34.38 | 0.44 | 1 | 160 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 29.9 | 28.6 | 28.4 | 34.73 | 0.62 | 1 | 184 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 29.9 | 28.3 | 27.9 | 34.88 | 1.02 | 2 | 329 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 30.1 | 26.3 | 25.3 | 37.42 | 2.89 | 6 | 297 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 30.2 | 25.3 | 24.3 | 38.76 | 3.53 | 14 | 94 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 119.3 | 98.2 | 84.9 | 9.68 | 0.85 | 10 | 231 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 115.7 | 29.4 | 29.2 | 33.74 | 0.40 | 6 | 48 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 30.1 | 25.9 | 25.3 | 38.00 | 2.84 | 5 | 69 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.0 | 25.9 | 25.6 | 38.00 | 2.55 | 5 | 5 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 36.4 | 17.4 | 17.1 | 55.61 | 14.67 | 30 | 208 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 36.8 | 16.8 | 15.7 | 56.34 | 15.31 | 31 | 569 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 30.0 | 27.2 | 26.1 | 36.16 | 1.74 | 5 | 301 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 30.0 | 26.9 | 25.1 | 36.22 | 1.74 | 5 | 290 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 29.9 | 28.8 | 28.5 | 34.52 | 0.57 | 0 | 488 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 29.9 | 28.7 | 27.0 | 34.25 | 0.26 | 0 | 172 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 29.9 | 28.5 | 28.1 | 34.85 | 0.23 | 1 | 420 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 29.9 | 28.5 | 28.1 | 34.83 | 0.25 | 1 | 296 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 29.9 | 29.0 | 28.5 | 34.25 | 0.24 | 0 | 184 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 29.9 | 25.2 | 23.4 | 38.09 | 0.32 | 49 | 880 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 29.9 | 22.7 | 22.0 | 41.18 | 0.34 | 36 | 662 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 29.9 | 24.8 | 21.9 | 37.18 | 0.33 | 22 | 568 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 29.9 | 23.3 | 20.4 | 37.81 | 0.33 | 26 | 56 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 29.9 | 24.8 | 23.4 | 38.29 | 0.32 | 24 | 372 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 19.4 | 9.4 | n/a | 103.81 | 0.32 | 22 | 1355 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 10.0 | 9.3 | n/a | 105.75 | 0.33 | 21 | 1317 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 10.0 | 9.0 | n/a | 105.22 | 0.37 | 22 | 1296 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 10.0 | 9.1 | n/a | 105.26 | 0.35 | 23 | 1437 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 10.0 | 9.1 | n/a | 105.55 | 0.30 | 22 | 652 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 10.0 | 8.8 | n/a | 108.87 | 0.37 | 25 | 303 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 10.0 | 9.2 | n/a | 107.11 | 0.32 | 26 | 864 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 10.0 | 9.8 | n/a | 102.00 | 0.26 | 0 | 80 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 10.0 | 9.4 | n/a | 103.93 | 2.80 | 1 | 732 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 10.0 | 9.7 | n/a | 101.81 | 0.27 | 0 | 220 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 10.0 | 9.8 | n/a | 101.59 | 0.27 | 0 | 132 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 10.0 | 9.8 | n/a | 101.53 | 0.27 | 0 | 160 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 10.0 | 9.7 | n/a | 101.64 | 0.27 | 0 | 156 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 10.0 | 9.6 | 8.9 | 102.72 | 0.60 | 15 | 128 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 10.0 | 9.5 | 9.0 | 102.46 | 0.59 | 10 | 1024 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.0 | 9.5 | 9.0 | 102.49 | 0.59 | 14 | 54 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 46.0 | 27.4 | 23.6 | 34.95 | 0.67 | 24 | 689 |

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

Category: **Particles**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `119.06`, min `79.86`, p50 `118.86`, p95 `130.51`, p99 `136.12`, 1%low `100.58`, 0.1%low `86.23`, std `6.46`

**Frame time (ms)**  avg `8.42`, p50 `8.41`, p95 `9.22`, p99 `9.53`, p99.9 `10.20`, max `12.52`

**Client tick (ms)**  avg `0.54`, p95 `0.89`, max `1.70`

**Memory**  start `581 MB`, end `700 MB`, peak `765 MB`, GC `1 events / 4 ms`

**FPS over sampling window (ASCII):**

```
120.1 |  ██                                                                            
119.9 |  ██                                                                            
119.7 |  ██                                                                            
119.6 |  ████  █                                           █                           
119.4 |██████  █ █                       █        █        █       █                 █ 
119.2 |██████ █████ █  ███      ██ █     █       ██        █    █  █                 █ 
119.0 |███████████████ █████  █ ██ █ ███ ███ ██  ████████ ███ ████ ██ █     █ ██  █  ██
118.9 |███████████████ ██████ █ ████████ ██████  ████████ ████████ ████████ ████████ ██
118.7 |██████████████████████ ██████████████████ ██████████████████████████████████████
118.5 |██████████████████████ ██████████████████ ██████████████████████████████████████
118.3 |██████████████████████ █████████████████████████████████████████████████████████
118.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   5
   7 ms | █████████  374
   8 ms | ████████████████████████████████████████  1691
   9 ms | ███████  298
  10 ms |   5
  12 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 296 | 119.5 | 10.03 |
| `dragon_breath` | 160 | 296 | 119.1 | 9.48 |
| `dripping_water` | 240 | 296 | 118.9 | 9.38 |
| `flame` | 160 | 296 | 119.0 | 9.32 |
| `smoke` | 160 | 296 | 119.0 | 9.36 |
| `sculk_charge_pop` | 240 | 296 | 119.0 | 9.39 |
| `ALL_TOGETHER` | 1680 | 296 | 118.9 | 9.19 |
| `portal` | 160 | 296 | 119.0 | 9.33 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `86.23`
- `fps_harmonic_avg` = `118.71`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `89.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `100.58`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23071 ms  |  Sample ticks: 400

**FPS**  avg `119.02`, min `95.15`, p50 `118.78`, p95 `130.90`, p99 `135.82`, 1%low `103.41`, 0.1%low `97.47`, std `6.29`

**Frame time (ms)**  avg `8.42`, p50 `8.42`, p95 `9.20`, p99 `9.50`, p99.9 `9.78`, max `10.51`

**Client tick (ms)**  avg `0.57`, p95 `0.88`, max `1.22`

**Memory**  start `616 MB`, end `683 MB`, peak `797 MB`, GC `2 events / 7 ms`

**FPS over sampling window (ASCII):**

```
119.7 |                                          █                                     
119.6 |            █            █        █       █                          █          
119.4 |       ██   █            █        █       █                          █          
119.3 |       ██   █   █        █        █       █        █                 █          
119.2 |       ██  ███  █        █        █       █        █       ███       █          
119.1 |█ █ ██ ██ ████  █        ██   █   █  █    █    █ █ █       ███ █     █ █ ██   █ 
119.0 |█ ████ ██ ████  ██    █  ██████   █ ███   ██ ███ █ █ ██ ██ █████  █ ████ ██  ███
118.9 |██████ ███████ ███ ██ █ ████████ ███████  ████████ ███████ ████████ ████████ ███
118.8 |██████ ███████ ███ ████ ████████ ████████ ████████ ███████ ████████ ████████ ███
118.7 |██████ ███████████ ████ ████████ ████████ ████████ ███████ ████████ ████████ ███
118.6 |██████ ███████████ █████████████ ████████ ████████████████ █████████████████ ███
118.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   2
   7 ms | █████████  394
   8 ms | ████████████████████████████████████████  1664
   9 ms | ████████  312
  10 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `83.00`
- `fps_harmonic_avg` = `118.70`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `97.47`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `103.41`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.38`, p50 `29.95`, p95 `30.65`, p99 `31.00`, 1%low `28.64`, 0.1%low `28.38`, std `0.55`

**Frame time (ms)**  avg `33.43`, p50 `33.39`, p95 `34.32`, p99 `34.73`, p99.9 `35.06`, max `35.24`

**Client tick (ms)**  avg `0.58`, p95 `0.88`, max `1.05`

**Memory**  start `638 MB`, end `700 MB`, peak `754 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
 30.1 | █   █            █        █                                                 █  
 30.0 | █   █     █      █  █     █         █           █  █         █  █     █  █  █  
 30.0 | █   █   █ █  ██  █  █  █  █  █   █  █  █     █  █  █  █   █  █  █     █  █  █  
 30.0 | ██  █   █ █  ██  █  █  █  █  █   █  █  █  █  █  █  █  █   █  █ ██     █  █  █  
 29.9 | ██  █ █ █ ██ ██  █  █  █ ██  █ █ █ ██ ██  █  █ ██  █ ██  ██ ██ ██     █ ██  █  
 29.9 | ██ ██ █ █ ██ ██  █  █ ██ ██ ██ ███ ██ ██ ██ ██ ██  █ ██ ███ ██ ██ █  ██ ██  █ █
 29.9 | ██ ██ ███ █████ ██  █ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ █  ██ ██  ███
 29.9 | ██ ██ ███ █████ ██ █████ ██ ██ ███ ██ ████████ ██ ██ ██ ███ ██ ██ ██ ██ ███████
 29.8 | ██ ██ ███ █████ ██ █████ ████████████ ████████ ████████ ███ ██ ████████ ███████
 29.8 | █████████ ██████████████ █████████████████████ ███████████████ ████████ ███████
 29.8 | ██████████████████████████████████████████████████████████████ ████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   1
  32 ms | ██████████████████████████████████  198
  33 ms | ████████████████████████████████████████  234
  34 ms | ████████████████████████████  164
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `42.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `28.38`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.64`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `29.93`, min `27.02`, p50 `29.92`, p95 `30.74`, p99 `31.21`, 1%low `28.34`, 0.1%low `27.02`, std `0.59`

**Frame time (ms)**  avg `33.43`, p50 `33.42`, p95 `34.34`, p99 `34.75`, p99.9 `35.86`, max `37.01`

**Client tick (ms)**  avg `0.61`, p95 `0.80`, max `1.18`

**Memory**  start `692 MB`, end `666 MB`, peak `787 MB`, GC `2 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                       █                                                        
 30.1 |                       █                             █                          
 30.1 |                       █                             █                          
 30.0 |                       █  █         █  █             █                      █   
 30.0 |              █        █  █      █  █  █  █  █  █    ██   █     █        █  █  █
 30.0 | █  █  █      █  █  █  █  █  █   █  █  █  █  █  █    ██   █  █  █ ██ ██  █  █  █
 30.0 |██  █ ██   █  █ ██  █  █  █  █   █ ██  █  █ ██  █ ██ ██ █ █  █  █ ██ ██  █  █  █
 29.9 |█████ ██   █ ██ ██  █  █  █ ██  ██ ██  █  █ ██  █ ██ ██ █ █ ██  █ ██ ██  █  █  █
 29.9 |█████ ███ ██ ██ ██  █  █  █ ██ ███ ██  █ ██ ██ ██ ██ ██ █ █ ██  █ ██ ██ ██  █ ██
 29.9 |████████████ ██ ███ █ ██  ████ ███ ██  █ █████ █████ ██ ███ █████ ██ ██ ██ █████
 29.8 |█████████████████████ ████████████████████████ ███████████████████████████ █████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  29 ms |   1
  31 ms |   3
  32 ms | █████████████████████████  171
  33 ms | ████████████████████████████████████████  276
  34 ms | █████████████████████  144
  35 ms |   2
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `52.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `27.02`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.34`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `27.97`, p50 `29.94`, p95 `30.74`, p99 `31.14`, 1%low `28.45`, 0.1%low `27.97`, std `0.59`

**Frame time (ms)**  avg `33.43`, p50 `33.40`, p95 `34.35`, p99 `34.74`, p99.9 `35.46`, max `35.75`

**Client tick (ms)**  avg `0.59`, p95 `0.92`, max `1.22`

**Memory**  start `557 MB`, end `701 MB`, peak `761 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                           █                                 █  
 30.1 |                          █                █                    █            █  
 30.0 |              █         █ █   █  █         █                 █  █   █        █  
 30.0 |  █  █  █ █  ██      █  █ ██  █  █  █    █ █     █  █  █     █  █   █    ██  █  
 30.0 |  █  █  █ ██ ██  ██  █  █ ██  █  █  █ ██ █ █ ██ ██ ██  █  █  █  █   █    ██  █  
 29.9 |  █  █ ██ ██ ██  ██  █ ██ ██ ██  █ ██ ██ █ █ ██ ██ ██ ██ ██ ██  █  ██ ██ ██  █ █
 29.9 | ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ █ █ ██ ██ ██ █████ ██  █ ███ ██ ██  █ █
 29.8 |██████ ██ ██ ████████████ ██ ████████ ██ █ █ █████ █████████████████████ ███ ███
 29.8 |█████████████████████████ ██████████████████████████████████████████████ ███████
 29.8 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | █  3
  32 ms | ██████████████████████████████████  194
  33 ms | ████████████████████████████████████████  227
  34 ms | ██████████████████████████████  171
  35 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `31.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `27.97`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.45`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23079 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.66`, p50 `29.95`, p95 `30.55`, p99 `30.95`, 1%low `28.86`, 0.1%low `28.66`, std `0.45`

**Frame time (ms)**  avg `33.43`, p50 `33.39`, p95 `34.16`, p99 `34.38`, p99.9 `34.89`, max `34.90`

**Client tick (ms)**  avg `0.44`, p95 `0.59`, max `0.92`

**Memory**  start `616 MB`, end `542 MB`, peak `776 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |              █                                                                 
 30.1 |              █                                                                 
 30.0 |              █                                              █               █  
 30.0 |           █  █  █            █     █                     █  █  █     █      █  
 30.0 |  █ █   █  █  █  █      █  █  █     █  █  █         █  █  █  █  █     █   █  █  
 30.0 |█ █ ██  █  █  █  █  █ █ █ ██  █ ██  █ ██  █  █ █ █  █  █  █  █  █  █  █   █  █  
 29.9 |███ ██  █  █  █ ██ ██ ███ ██  █ ██  █ ██  █ ██ ███ ██  █  █  █  █  █ ██ █ █  █  
 29.9 |███ ██  █  █  █ ██ ██ ███ ██ ██ ██  █ ██  █ ██ ███ ██  █  █  █  █ ██ ██ ███  █ █
 29.9 |███ ██ ██ ██  █ ██ ██ ███ ██ ██ ██ ██ ██ █████ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ █
 29.9 |███ ██ █████  ███████ ███ ██ ██ █████ ██ █████████ ██ █████ ████████ ██ ███ ████
 29.8 |███ █████████████████████ ██████████████████████████████████████████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   1
  32 ms | █████████████████  151
  33 ms | ████████████████████████████████████████  362
  34 ms | █████████  84
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `77.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `28.66`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.86`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.41`, p50 `29.97`, p95 `30.75`, p99 `31.17`, 1%low `28.61`, 0.1%low `28.41`, std `0.58`

**Frame time (ms)**  avg `33.43`, p50 `33.36`, p95 `34.39`, p99 `34.73`, p99.9 `35.12`, max `35.20`

**Client tick (ms)**  avg `0.62`, p95 `0.89`, max `1.09`

**Memory**  start `589 MB`, end `709 MB`, peak `773 MB`, GC `1 events / 2 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                               █     █                                          
 30.1 |      █        █        █      █     █                                          
 30.1 |      █  █  █  █        █   █  █     █        █  █     █                        
 30.0 |   █  █  █  █  █     █  █   █  █     █  █  █  █  █  ██ █   █     █         █  █ 
 30.0 |   █  █  █  █  █  █  █  █   █  █  █  █ ██  █  █  █  ██ ██  █ ██ ██     █   █  █ 
 29.9 |  ██  █  █  █  █  █ ██  ██  █  █ ██  █ ██ ██  █  ██ ██ ██ ██ ██ ██  █ ██ █ █ ██ 
 29.9 | ███  █  █ ██  █ ██ ██  ██ ██  █ ██  █ ██ ██  █  ██ ██ ██ ██ ██ ██ ██ ██ ███ ██ 
 29.9 | ███  ████ ██  ████ ███ ██ ███ █ ██  █ ██ ██ ██ ███ ██ ██ ██ ██ ██ █████ ███ ██ 
 29.8 |█████ ███████ █████ ██████████ █ ███ █ ██ ██ ██████ ██ █████ ██ ██ █████████ ███
 29.8 |███████████████████████████████████████████████████ ██ █████ ███████████████████
 29.8 |███████████████████████████████████████████████████ ██ █████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | █  5
  32 ms | ██████████████████████████████████  187
  33 ms | ████████████████████████████████████████  221
  34 ms | █████████████████████████████████  182
  35 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `66.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `28.41`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.61`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `29.94`, min `27.86`, p50 `29.97`, p95 `31.07`, p99 `31.32`, 1%low `28.33`, 0.1%low `27.86`, std `0.82`

**Frame time (ms)**  avg `33.43`, p50 `33.37`, p95 `34.72`, p99 `34.88`, p99.9 `35.64`, max `35.89`

**Client tick (ms)**  avg `1.02`, p95 `1.18`, max `1.62`

**Memory**  start `473 MB`, end `546 MB`, peak `803 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                  █           █               █               █ 
 30.1 |            █     █         █     █  █     █  █      █  █  █  █           █   █ 
 30.0 |   █     █  █  █  █     █   █  █  █  █  █  █  █    █ █  █  █  █     █  █  █   █ 
 30.0 |   █ ██  █  █  █  █  █  █   █  █  █  █  █  █  █  █ █ █  █  █  █ ██  █  █  █   █ 
 30.0 |  ██ ██  █  █  █  █ ██  █   █  █  █  █  █ ██  █ ██ █ █ ██  █  █ ██  █  █  █ █ █ 
 29.9 | ███ ██ ██ ██ ██  █ ██  █ █ █  █ ██ ██ ██ ██  █ ██ █ █ ██ ██ ██ ██ ██ ██ ██ █ █ 
 29.9 |████ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ 
 29.9 |████ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ 
 29.8 |████ ██ ██ ██ ██ ██ █████ ██████ ██ █████ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ 
 29.8 |█████████████ █████████████████████ █████ ████████ ███ █████ ██████████████ ████
 29.8 |██████████████████████████████████████████████████ █████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | ██  9
  32 ms | ███████████████████████████████████████  193
  33 ms | ████████████████████████████████████████  199
  34 ms | ███████████████████████████████████████  193
  35 ms | █  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `60.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `27.86`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `28.33`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `30.08`, min `25.35`, p50 `30.00`, p95 `33.12`, p99 `33.88`, 1%low `26.27`, 0.1%low `25.35`, std `2.23`

**Frame time (ms)**  avg `33.43`, p50 `33.33`, p95 `36.75`, p99 `37.42`, p99.9 `38.70`, max `39.45`

**Client tick (ms)**  avg `2.89`, p95 `3.40`, max `4.44`

**Memory**  start `524 MB`, end `466 MB`, peak `821 MB`, GC `6 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 30.7 |                                                                █               
 30.6 |                     █     █       █       █  █                 █   █  █     █  
 30.4 |  █  █  █  █  █   █  █  █  █     █ ██  █   █  █     █  █  █     █   █  █  █  █  
 30.3 |  █  █  █  █  █   █  █  █  █ ██  █ ██  █   █  █  █  █  █  █  █  █   █  █  █  █  
 30.2 |  █  █  █  █ ██   █  █  █ ██ ██  █ ██  █   █  █  █ ██  █  █  █  █   █ ██  █  █  
 30.1 | ██ ██  █ ██ ██ ███ ██ ██ ██ ██ ██ ██  █  ██  █ ██ ██ ██ ██ ██  █ ███ ██ ██  █  
 30.0 | ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ █
 29.8 | ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ █
 29.7 |████████████ ██ █████████ ██ ██ ██ █████ █████████ ███████████ ██████ ██████████
 29.6 |████████████████████████████ █████ █████████████████████████████████████████████
 29.5 |██████████████████████████████████ █████████████████████████████████████████████
 29.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  28 ms |   1
  29 ms | ███  13
  30 ms | ████████████████████████████████████████  174
  31 ms | ███  12
  32 ms | ██████  26
  33 ms | ██████████████████████████████████████  164
  34 ms | ██  8
  35 ms | ███  14
  36 ms | ███████████████████████████████████████  169
  37 ms | ███  15
  38 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `35.00`
- `fps_harmonic_avg` = `29.91`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `25.35`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `26.27`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `30.15`, min `24.30`, p50 `30.17`, p95 `34.53`, p99 `35.45`, 1%low `25.25`, 0.1%low `24.30`, std `2.69`

**Frame time (ms)**  avg `33.43`, p50 `33.14`, p95 `38.16`, p99 `38.76`, p99.9 `40.31`, max `41.16`

**Client tick (ms)**  avg `3.53`, p95 `5.03`, max `5.94`

**Memory**  start `744 MB`, end `546 MB`, peak `839 MB`, GC `14 events / 23 ms`

**FPS over sampling window (ASCII):**

```
 31.0 |                                                                  █         █   
 30.8 |                                                      █     █     █  █   █  █   
 30.6 |                                   █         █  █  █  █     █  █  █  █   █  █  █
 30.5 |                    █  █  █  █  █  █     █   █  █  █  █  █  █  █  █  █  ██  █  █
 30.3 | █     █  █  █   █  █  █  █  █  █  █  █  █   █  █ ██  █  █ ██ ██  █ ██  ██  █ ██
 30.2 | █ ██  █  █  █  ██  █  █  █ ██  █ ██ ██ ██ █ █ ██ ██ ██ ██ ██ ██ ██ ███ ██  █ ██
 30.0 |██ ██ ██ ██ ██ ███  █ ██  █ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██
 29.8 |██ ██ █████ ██ ███ ██ ██ ██ ██ ██ ██ ██ ██████ █████ ██ ██ █████ ██████ ██ █████
 29.7 |██ █████████████████████████████████████████████████████████████████████████████
 29.5 |██ █████████████████████████████████████████████████████████████████████████████
 29.4 |██ █████████████████████████████████████████████████████████████████████████████
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  27 ms | █  4
  28 ms | █████████  28
  29 ms | ████████████████████  63
  30 ms | ███████████████████  59
  31 ms | ███████████████  45
  32 ms | █████████████████████  66
  33 ms | ████████████████████████████████████████  124
  34 ms | ████  12
  35 ms | ████████████  37
  36 ms | ███████████████████  58
  37 ms | ████████████████████  61
  38 ms | ████████████  37
  39 ms | █  4
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `25.25`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `63.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `24.30`
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

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `119.34`, min `83.27`, p50 `118.70`, p95 `134.32`, p99 `138.81`, 1%low `98.16`, 0.1%low `84.94`, std `8.81`

**Frame time (ms)**  avg `8.42`, p50 `8.42`, p95 `9.39`, p99 `9.68`, p99.9 `11.46`, max `12.01`

**Client tick (ms)**  avg `0.85`, p95 `1.07`, max `2.08`

**Memory**  start `648 MB`, end `685 MB`, peak `879 MB`, GC `10 events / 17 ms`

**FPS over sampling window (ASCII):**

```
121.9 |                                               █                                
121.6 |                                               █                                
121.3 |                                               █                                
121.0 |                                               █                                
120.7 |         █                                     █                                
120.4 |         █                                     █                                
120.1 |         █                                     █                                
119.9 |         █                       █             █    █        █                  
119.6 |    █ █  █   █   █ █   █  ██  █  ██    █   █   ██  ███  ██   █ █  █  █    █   █ 
119.3 |██  ███ ████ ██ ██ ██ ██ █████████████████ ███ ██  ████████ ███████  ████████ █ 
119.0 |███████████████ ██████████████████████████ ████████████████ █████████████████ ██
118.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   4
   6 ms |   8
   7 ms | █████████████  483
   8 ms | ████████████████████████████████████████  1462
   9 ms | ███████████  410
  10 ms |   3
  11 ms |   3
  12 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `118.72`
- `fps_1pct_low` = `98.16`
- `preload_duration_ms` = `36.00`
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
- `fps_0p1pct_low` = `84.94`
- `preset_quick` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `115.68`, min `29.07`, p50 `118.77`, p95 `127.01`, p99 `131.00`, 1%low `29.43`, 0.1%low `29.17`, std `17.37`

**Frame time (ms)**  avg `9.34`, p50 `8.42`, p95 `9.20`, p99 `33.74`, p99.9 `34.15`, max `34.41`

**Client tick (ms)**  avg `0.40`, p95 `0.53`, max `0.71`

**Memory**  start `846 MB`, end `627 MB`, peak `894 MB`, GC `6 events / 14 ms`

**FPS over sampling window (ASCII):**

```
119.4 |███████████████████████████████████████████████████████████████████████████████ 
113.7 |███████████████████████████████████████████████████████████████████████████████ 
108.1 |███████████████████████████████████████████████████████████████████████████████ 
102.4 |███████████████████████████████████████████████████████████████████████████████ 
 96.8 |███████████████████████████████████████████████████████████████████████████████ 
 91.1 |███████████████████████████████████████████████████████████████████████████████ 
 85.5 |███████████████████████████████████████████████████████████████████████████████ 
 79.8 |███████████████████████████████████████████████████████████████████████████████ 
 74.2 |███████████████████████████████████████████████████████████████████████████████ 
 68.5 |███████████████████████████████████████████████████████████████████████████████ 
 62.9 |███████████████████████████████████████████████████████████████████████████████ 
 57.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   2
   7 ms | █████  220
   8 ms | ████████████████████████████████████████  1747
   9 ms | ██  89
  10 ms |   3
  13 ms |   1
  32 ms |   13
  33 ms | █  55
  34 ms |   10
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `29.43`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `107.12`
- `preload_duration_ms` = `82.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `29.17`
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

Category: **Physics**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `30.07`, min `25.29`, p50 `30.01`, p95 `33.22`, p99 `34.08`, 1%low `25.89`, 0.1%low `25.29`, std `2.13`

**Frame time (ms)**  avg `33.43`, p50 `33.33`, p95 `36.87`, p99 `38.00`, p99.9 `39.04`, max `39.54`

**Client tick (ms)**  avg `2.84`, p95 `4.14`, max `5.23`

**Memory**  start `848 MB`, end `851 MB`, peak `917 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 30.8 |       █                                                                        
 30.7 |    █  █  █                                                                     
 30.6 | █  █  █  █   █  █  █                  █     █  █  █                            
 30.4 | █  █  █  █   █  █  █     █     █      █  █  █  █  █     █  █                   
 30.3 | █ ██  █  █  ██  █  █  █  █  █  █      █  █  █  █  █  █  █  █   █     █  █  █  █
 30.2 | █ ██ ██  █  ██  █ ██  █  █ ██  █  █   █  █  █  █  █  █  █  █   █  █  █  █  █  █
 30.1 |██ ██ ██ ██  ██ ██ ██ ██ ██ ██  █ ██   █ ██ ██ ██  █ ██  █ ██ █ █ ██  █ ██ ██  █
 30.0 |██ ██ ██ ██  ██ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██
 29.8 |██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██
 29.7 |██ ███████████████ █████████████████████████████████████████████████████████████
 29.6 |██ █████████████████████████████████████████████████████████████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  28 ms | █  4
  29 ms | █████  21
  30 ms | ████████████████████████████  114
  31 ms | ███████████████  62
  32 ms | ███████  28
  33 ms | ████████████████████████████████████████  164
  34 ms | ██  8
  35 ms | ██████████████████  73
  36 ms | █████████████████████████  103
  37 ms | ████  16
  38 ms | █  5
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `25.29`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.48`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `25.89`
- `fps_harmonic_avg` = `29.92`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `140.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `30.05`, min `25.59`, p50 `29.97`, p95 `33.23`, p99 `34.90`, 1%low `25.87`, 0.1%low `25.59`, std `1.97`

**Frame time (ms)**  avg `33.42`, p50 `33.37`, p95 `36.76`, p99 `38.00`, p99.9 `38.92`, max `39.08`

**Client tick (ms)**  avg `2.55`, p95 `4.39`, max `5.96`

**Memory**  start `986 MB`, end `745 MB`, peak `992 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 31.0 |        █                                                                       
 30.8 |        █                                                                       
 30.7 | █  █   █                                                                       
 30.6 | █  █   █     █                                    █                            
 30.4 | █  █   █  █  █     █                  █  █        █      █  █        █         
 30.3 | █ ███ ██ ██ ██  █  █                  █  █  █  █  █  █   █  █  █     █  █      
 30.2 | █ ███ ██ ██ ██  █  █  █  █  █   █  █  █  █  █  █  █  █   █  █  █  █  █  █  █  █
 30.0 |██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██  █  █ ██ ██  █  █ ██ █ █ ██ ██ ██  █ ██  █ ██
 29.9 |██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██
 29.8 |██ ███ ██ ██ █████ █████ ██ ████████████ ██████████████ █████████ █████ █████ ██
 29.7 |████████████ ███████████████████████████████████████████████████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  28 ms | ██  8
  29 ms | █████  18
  30 ms | ██████████████  57
  31 ms | ██████████████████████████  105
  32 ms | ██████████  38
  33 ms | ████████████████████████████████████████  160
  34 ms | █████████  37
  35 ms | ██████████████████████████  104
  36 ms | ███████████  45
  37 ms | █████  20
  38 ms | █  5
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `25.59`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `145.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.45`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `25.87`
- `fps_harmonic_avg` = `29.92`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `33.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `36.36`, min `17.12`, p50 `29.87`, p95 `72.92`, p99 `89.63`, 1%low `17.44`, 0.1%low `17.12`, std `18.70`

**Frame time (ms)**  avg `33.42`, p50 `33.48`, p95 `53.07`, p99 `55.61`, p99.9 `58.41`, max `58.42`

**Client tick (ms)**  avg `14.67`, p95 `20.70`, max `26.45`

**Memory**  start `855 MB`, end `872 MB`, peak `1064 MB`, GC `30 events / 100 ms`

**FPS over sampling window (ASCII):**

```
 52.3 |              █           █                                                     
 50.3 |              █           █                                                     
 48.3 |              █           █                                       █             
 46.3 |             ██           █                                       █             
 44.3 |       █ █   ██           █                                       █             
 42.4 |       █ █   ███     █    █     █            █                    █             
 40.4 |       █ █   ███   █ ██   █     █ █   █      █  █  █ █            █             
 38.4 |  █ █  ███   ████  ████   ███   █ ██  █ ██   █ ██  ███     ██    ██             
 36.4 | ██ █  ████  ████  █████  ████  ████  ████   ████  ████  ████  █ ██   █         
 34.5 | ████  ████  ████ ██████  ██████████  ████  █████ █████ █████  ████  ██ █       
 32.5 |██████████████████████████████████████████████████████████████████████████  █ ██
 30.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   1
   8 ms | █  2
   9 ms |   1
  10 ms | █  2
  11 ms | ███  6
  12 ms | ████  9
  13 ms | ████████  17
  14 ms | ██████  13
  15 ms | █████  10
  16 ms | █  3
  17 ms | ████  9
  18 ms | ██████████████████  37
  19 ms | ███████████████████████  48
  20 ms | ████  9
  22 ms | █  3
  23 ms | ███  7
  24 ms | ████  9
  25 ms |   1
  26 ms | ███  6
  27 ms | █  3
  28 ms | ███████  14
  29 ms | █  2
  30 ms | ███  7
  31 ms | ██  4
  32 ms | █████████████████  35
  33 ms | ████████████████████████████████████████  84
  34 ms | ██████████████████  38
  35 ms | █████  10
  36 ms |   1
  37 ms | ███  7
  38 ms | ████  9
  39 ms | █  3
  40 ms | █  3
  41 ms | █  3
  42 ms | ███  7
  43 ms | ███  7
  44 ms | █  2
  45 ms | █  2
  46 ms | ███  6
  47 ms | ████████████████████████  50
  48 ms | █████████████████  36
  49 ms | ████  8
  50 ms | █  2
  51 ms | █████  10
  52 ms | █████████  18
  53 ms | ██████████  22
  54 ms | ███  6
  55 ms |   1
  56 ms | █  3
  57 ms |   1
  58 ms | █  2
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `17.12`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.93`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `23044.00`
- `preload_duration_ms` = `44.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `17.44`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4804.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `36.85`, min `15.75`, p50 `30.23`, p95 `75.91`, p99 `113.43`, 1%low `16.81`, 0.1%low `15.75`, std `19.72`

**Frame time (ms)**  avg `33.42`, p50 `33.08`, p95 `53.89`, p99 `56.34`, p99.9 `62.00`, max `63.51`

**Client tick (ms)**  avg `15.31`, p95 `21.66`, max `26.75`

**Memory**  start `487 MB`, end `401 MB`, peak `1057 MB`, GC `31 events / 101 ms`

**FPS over sampling window (ASCII):**

```
 59.6 |                          █                                                     
 57.0 |                          █                                                     
 54.3 |                          █                                                     
 51.7 |       █                  █                                                     
 49.0 |       █                  █     █                                               
 46.4 |       █            █ █   █     █     █                                         
 43.7 |       █ █   █      █ █   █     █     █            █                            
 41.1 |       █ █   █ █   ██ █   █ █   █  █  ██     █ █   █      █     ██              
 38.4 | █  █  █ ██  ████  ████   ███   ████  █████  █ █   ████  ███ █  ███   █         
 35.7 | █  █  ████  ████  █████  ████  ████ ██████  ████  ████ ██████  ████ ██ █       
 33.1 |█████████████████████████████████████████████████ ████████████████████████  █ ██
 30.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | ██  3
   8 ms | ██  4
   9 ms | █  1
  10 ms | ██  3
  11 ms | █  2
  12 ms | ███████  12
  13 ms | ████████████  21
  14 ms | ███████  12
  15 ms | ██  3
  16 ms | █  2
  17 ms | █████████  15
  18 ms | █████████████████████████  44
  19 ms | ███████████████████████  40
  20 ms | ███  6
  23 ms | █████  9
  24 ms | ████  7
  25 ms | █  2
  27 ms | ██  3
  28 ms | ██████████  17
  29 ms | █████  9
  30 ms | ██  4
  31 ms | █████████  15
  32 ms | ███████████████████████████████  55
  33 ms | ████████████████████████████████████████  70
  34 ms | █████████████  22
  35 ms | ███  5
  36 ms | █  1
  37 ms | █████  9
  38 ms | █████  8
  39 ms | ███  5
  41 ms | ██  3
  42 ms | ██  4
  43 ms | ████████  14
  44 ms | ██  3
  45 ms | █  1
  46 ms | █  1
  47 ms | ██████  10
  48 ms | █████████████████████████████████████  64
  49 ms | ██████████████  24
  50 ms | █████  8
  51 ms | █  2
  52 ms | ██████  11
  53 ms | █████████  16
  54 ms | ████████  14
  55 ms | ███  6
  56 ms | █  2
  57 ms | █  2
  58 ms | █  1
  59 ms | █  1
  60 ms | █  1
  63 ms | █  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `15.75`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.92`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `26576.00`
- `preload_duration_ms` = `55.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `16.81`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4803.65`
- `preset_full` = `0.00`
- `preset_long` = `0.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `29.98`, min `26.09`, p50 `29.95`, p95 `31.99`, p99 `32.62`, 1%low `27.22`, 0.1%low `26.09`, std `1.40`

**Frame time (ms)**  avg `33.43`, p50 `33.39`, p95 `35.76`, p99 `36.16`, p99.9 `37.25`, max `38.32`

**Client tick (ms)**  avg `1.74`, p95 `2.40`, max `5.01`

**Memory**  start `670 MB`, end `673 MB`, peak `971 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 30.4 |                                   █                                            
 30.3 |        █  █  █     █              █                █     █  █                  
 30.2 |  █  █  █  █  █  █  █   █  █  █  █ ██  █  █  █   █  █  █  █  █                  
 30.1 |  █  █  █  █  █  █  █   █  █  █  █ ██  █  █  █   █  █  █  █  █  █  █  █   █  █  
 30.0 |  █  █  █ ██  █ ██  █ █ █  █ ██  █ ██  █ ██ ██   █  █  █  █  █ ██  █ ██   █  █  
 30.0 | ██  █ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███  █ ██ ██ ██ ██ ██ ██ ███  █ █
 29.9 | ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ████
 29.8 |██████ ██ ██ ██ █████ ██████ █████ ██ █████ ████████████████████████ ███████████
 29.7 |██████████████████████████████████ █████████████████████████████████████████████
 29.6 |██████████████████████████████████ █████████████████████████████████████████████
 29.5 |██████████████████████████████████ █████████████████████████████████████████████
 29.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  30 ms | ███  14
  31 ms | ███████████████████████████████  151
  32 ms | █████████  43
  33 ms | ████████████████████████████████████████  194
  34 ms | ██████████  49
  35 ms | ████████████████████████████  135
  36 ms | ██  11
  38 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `26.09`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3087.00`
- `preload_duration_ms` = `49.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `27.22`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `618.84`
- `preset_full` = `0.00`
- `preset_long` = `0.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `29.99`, min `25.09`, p50 `29.93`, p95 `32.13`, p99 `32.42`, 1%low `26.88`, 0.1%low `25.09`, std `1.51`

**Frame time (ms)**  avg `33.43`, p50 `33.41`, p95 `35.86`, p99 `36.22`, p99.9 `38.24`, max `39.86`

**Client tick (ms)**  avg `1.74`, p95 `2.30`, max `4.09`

**Memory**  start `743 MB`, end `580 MB`, peak `1034 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 30.6 |              █                                                                 
 30.5 |              █                                                                 
 30.4 |              █                                                                 
 30.3 |        █   █ ██  █     █  █     █   █           █  █     █                     
 30.2 |     █  █   █ ██  █  █  █  █  █  █   █  █  █  █  █  █     █   █  █              
 30.2 |     █  █   █ ██  █  █  █  █  █  █   █  █  █  █  █  █  █  █   █  █  █  █  █     
 30.1 |  █  █  █  ██ ██  █  █  █  █ ██  █ █ █  █  █  █  █  █  █  █  ██ ██  █  █  █  █  
 30.0 | ██ ██  █ ███ ██ ██ ██ ██ ██ ██ ██ █ █ ██ ██ ██ ██  █ ██ ██  ██ ██ █████ ██  █  
 29.9 | ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ███ ██ █████ ██ ██ █
 29.8 | █████ ██ ███ ██ ██ ██ ██ ██ ██ ██ ██████ █████ ██ █████ ██████ ██ █████ ███████
 29.7 |██████████████████████████████████ ██████ █████████████████████ ████████████████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  24 ms |   1
  29 ms |   2
  30 ms | ███  14
  31 ms | ██████████████████████████████  143
  32 ms | ██████████  49
  33 ms | ████████████████████████████████████████  190
  34 ms | █████████  45
  35 ms | █████████████████████████████  138
  36 ms | ███  14
  37 ms |   1
  39 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `25.09`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3528.00`
- `preload_duration_ms` = `48.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `26.88`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.25`
- `preset_full` = `0.00`
- `preset_long` = `0.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.52`, p50 `29.95`, p95 `30.58`, p99 `30.81`, 1%low `28.79`, 0.1%low `28.52`, std `0.46`

**Frame time (ms)**  avg `33.43`, p50 `33.39`, p95 `34.23`, p99 `34.52`, p99.9 `34.87`, max `35.06`

**Client tick (ms)**  avg `0.57`, p95 `0.73`, max `1.13`

**Memory**  start `551 MB`, end `1039 MB`, peak `1039 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                                      █                         
 30.1 |                                                      █                         
 30.0 |                             █                  █     █  █   █                  
 30.0 | █  █      █  █           █  █         █     █  █  █  █  █   █     █  █  █      
 30.0 | █  █      █  █  █  █     █  █  █     ██     █  █  █  █  █   █  █  █  █  █  █   
 30.0 | █  █  █ █ █ ██  █  █ █   █  █ ██   █ ██ ██  █  █  █  █  ██  █  █  █  █ ██  █ ██
 29.9 | █ ██ ██ █ █ ██ ██  █ ██  █  █ ██  ██ ██ ██ ██  █  █  █  ██  █ ██  █ ██ ██  █ ██
 29.9 |██ ██ ██ █ █ ██ ██ ██ ██  █  █ ██  ██ ██ ██ ██ ██ ██  █  ██ ██ ███ █ ██ ██ ██ ██
 29.9 |██ ██ ██ ███ ██ █████ █████ ██ ██ ███ ██ ██ ██ ██ ██  █ ███ ██ █████ ██ ████████
 29.9 |██ █████ ███ ██ ██████████████ █████████ ██ █████ █████ ███ ██ █████ ███████████
 29.8 |██████████████████████████████ ████████████████████████ ████████████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   1
  32 ms | ███████████████████  160
  33 ms | ████████████████████████████████████████  331
  34 ms | █████████████  105
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `28.79`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `76.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `28.52`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.91`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `27.05`, p50 `29.94`, p95 `30.29`, p99 `30.58`, 1%low `28.69`, 0.1%low `27.05`, std `0.34`

**Frame time (ms)**  avg `33.43`, p50 `33.40`, p95 `33.85`, p99 `34.25`, p99.9 `35.59`, max `36.97`

**Client tick (ms)**  avg `0.26`, p95 `0.32`, max `0.40`

**Memory**  start `853 MB`, end `1025 MB`, peak `1025 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 30.0 |    █                             █                   █                         
 30.0 |    █                             █                   █                         
 30.0 |    █                             █                   █                         
 30.0 |  █ █             █  █  █  █      █  █                █ █        █  █  █     █  
 29.9 |  █ █    █  █  █  █  █  █  █  ██  █  █ ██ ██    ██  █ █ █  █     █  █  █  █  █  
 29.9 |  █ ███  █  ████ ██ ██ ██ ██  ██  █ ██ ██ ██ █  ██  █ █ █  █ ██  █  █ ██ ██  █  
 29.9 | ██ ███  █  ████ ██ ██ ██ ██  ██  █ ██ ██ ████████ ██ ███ ████████ ██ ██ ██ ██ █
 29.9 | ██ ██████ ████████ █████ ██████  ████ ██ ███████████ ██████████████████ ███████
 29.9 |███ █████████████████████████████ ███████████████████ ██████████████████████████
 29.8 |█████████████████████████████████ ███████████████████ ██████████████████████████
 29.8 |█████████████████████████████████████████████████████ ██████████████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  29 ms |   1
  32 ms | ██  28
  33 ms | ████████████████████████████████████████  559
  34 ms | █  9
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `65.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `27.05`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `fps_1pct_low` = `28.69`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `28.07`, p50 `29.91`, p95 `30.80`, p99 `31.34`, 1%low `28.45`, 0.1%low `28.07`, std `0.47`

**Frame time (ms)**  avg `33.43`, p50 `33.44`, p95 `34.49`, p99 `34.85`, p99.9 `35.59`, max `35.63`

**Client tick (ms)**  avg `0.23`, p95 `0.28`, max `0.33`

**Memory**  start `583 MB`, end `834 MB`, peak `1003 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 30.1 |                                 █                            █                 
 30.1 |        █   █  █                 █                            █        █        
 30.1 |        █   █  █                 █                            █        █        
 30.0 |        █   █  █                 █                       █    █        █        
 30.0 |     █  █   █  █           █     █         █             █    █        █        
 30.0 |  █  █  ██  █  █  █  █  █  █  █  █   █  █  █ █  █   █ █  █ █  █  █     █ ██    █
 29.9 | ██ ██  ██  ██ ████ █████  ████  ██ ██ ██ ██ ██ ██ ██ ██ █ ██ █ ██ ███ █ ██ ████
 29.9 |███████ ██  ██ █████████████████ ███████████ ███████████ ████ ████████ █ ███████
 29.8 |███████ ███ ██ █████████████████ ███████████████████████ ████ ████████ █████████
 29.8 |███████ ███ ██ █████████████████ ████████████████████████████ ██████████████████
 29.8 |███████ ██████ ██████████████████████████████████████████████ ██████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | █  15
  32 ms | ███  42
  33 ms | ████████████████████████████████████████  495
  34 ms | ███  43
  35 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `lamps_placed` = `128.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `28.45`
- `preset_long` = `0.00`
- `preload_duration_ms` = `53.00`
- `fps_harmonic_avg` = `29.91`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `28.07`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `29.93`, min `28.06`, p50 `29.88`, p95 `31.71`, p99 `32.15`, 1%low `28.46`, 0.1%low `28.06`, std `0.71`

**Frame time (ms)**  avg `33.43`, p50 `33.46`, p95 `34.54`, p99 `34.83`, p99.9 `35.57`, max `35.63`

**Client tick (ms)**  avg `0.25`, p95 `0.34`, max `0.82`

**Memory**  start `718 MB`, end `719 MB`, peak `1014 MB`, GC `1 events / 1 ms`

**FPS over sampling window (ASCII):**

```
 30.3 |            █                                                    █              
 30.2 |            █  █        █                               █        █           █  
 30.2 |     █      █  █        █              █                █        █  █      █ █  
 30.1 |█  █ █      █  █ █    █ █  █ █      ██ █ █  █    █      █ █    █ █  █ █  █ █ █  
 30.0 |█  █ █  █ █ █  █ █    █ █  █ █  █ █ ██ █ █  █ █ ██ █    █ █  █ █ █  █ █  █ █ █  
 30.0 |█  █ ██ █ █ ██ █ ██ █ █ █  █ █  █ █ ██ █ █  █ █ ██ █  █ █ ██ █ █ █  █ ██ █ █ ██ 
 29.9 |██ █ ██ █ █ ██ █ ██ █ █ ██ █ ████ █ ██ █ ██ █ █ ██ ████ █ ██ █ █ ██ █ ██ █ █ ██ 
 29.8 |████ ██ ███ ██ █ ████ █ ██ █ ████ █ ██ █ ██ █ █ ██ ████ █ ████ █ ██ █ ██ █ █ ██ 
 29.8 |████ ██████ ██ █ ██████ ███████████ ██ ██████ █ ███████ █ ██████ ██ █ ████ █ ██ 
 29.7 |████ ██████ ███████████ ███████████ ██ █████████████████████████ ███████████ ███
 29.7 |████████████████████████████████████████████████████████████████████████████ ███
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  30 ms |   2
  31 ms | █████  45
  32 ms | ██████  54
  33 ms | ████████████████████████████████████████  373
  34 ms | █████████████  121
  35 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `28.46`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `42.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `28.06`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.91`
- `neighbour_updates` = `11200.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `28.46`, p50 `29.93`, p95 `30.28`, p99 `30.57`, 1%low `28.95`, 0.1%low `28.46`, std `0.27`

**Frame time (ms)**  avg `33.43`, p50 `33.42`, p95 `33.86`, p99 `34.25`, p99.9 `34.82`, max `35.14`

**Client tick (ms)**  avg `0.24`, p95 `0.30`, max `0.38`

**Memory**  start `623 MB`, end `807 MB`, peak `807 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 30.0 |        █                         █                                             
 30.0 |        █            █         █  █        █ █ █        █ ██  █     █      █  █ 
 29.9 |      █ ██ ██  █  █  █ █    █ ██  █ █   █  █ █ █     █  █ ██  █  █  █  █   █ ██ 
 29.9 |  ██ ██ ██ ██ █████  █ ██  ██ ██  █ ██  ████ █ █ ██ ██ ██ █████ ███ █  ██ ██ ██ 
 29.9 |█ █████ ██████████████ ██ ███ ██ █████ █████ █ ███████ ██ █████ ████████████ ██ 
 29.9 |███████ █████████████████ ███████████████████████████████ ██████████████████████
 29.8 |███████ █████████████████ ███████████████████████████████ ██████████████████████
 29.8 |███████ █████████████████ ███████████████████████████████ ██████████████████████
 29.8 |█████████████████████████ ███████████████████████████████ ██████████████████████
 29.8 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |█████████████████████████ ██████████████████████████████████████████████████████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  32 ms | █  21
  33 ms | ████████████████████████████████████████  562
  34 ms | █  14
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `70.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `28.46`
- `fps_1pct_low` = `28.95`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `29.91`
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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `29.90`, min `23.42`, p50 `29.86`, p95 `31.54`, p99 `32.38`, 1%low `25.16`, 0.1%low `23.42`, std `1.19`

**Frame time (ms)**  avg `33.50`, p50 `33.49`, p95 `35.26`, p99 `38.09`, p99.9 `41.02`, max `42.69`

**Client tick (ms)**  avg `0.32`, p95 `0.55`, max `2.65`

**Memory**  start `580 MB`, end `976 MB`, peak `1460 MB`, GC `49 events / 225 ms`

**FPS over sampling window (ASCII):**

```
 30.7 |                                                            █                   
 30.6 |                                                            █                   
 30.5 |                                                            █                   
 30.4 |                                                            █                   
 30.3 |                               █                            █                   
 30.2 |            █                  █     █                      █                   
 30.1 |            █  █    █    █  █  █     █   █     █         █  █  █             █  
 30.0 | █  █ █     █  █ █  █    ██ █  █  ██ █  ██    ██ ██  █  ██  █  ██ █ █  █ █   █ █
 29.9 |█████ ███  ██ ██ █ ███████████ █ ███ ██ ███  █████████ ███ ██  ███████ ████ ████
 29.8 |█████████ ███ ██ █████████████ ████████ ███  █████████████ ██ █████████████ ████
 29.6 |█████████ ███ █████████████████████████████ ██████████████ █████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  25 ms |   1
  27 ms |   2
  30 ms | █  4
  31 ms | ███████  43
  32 ms | █████████████████████  129
  33 ms | ████████████████████████████████████████  244
  34 ms | ██████████████████████  132
  35 ms | ████  26
  36 ms | █  6
  37 ms |   3
  38 ms |   3
  39 ms |   3
  42 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `64.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `25.16`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `11.00`
- `entity_count_delta` = `-8.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `32.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `23.42`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.85`
- `stamped_blocks` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23382 ms  |  Sample ticks: 400

**FPS**  avg `29.89`, min `21.98`, p50 `29.88`, p95 `31.76`, p99 `32.83`, 1%low `22.69`, 0.1%low `21.98`, std `1.82`

**Frame time (ms)**  avg `33.57`, p50 `33.47`, p95 `35.91`, p99 `41.18`, p99.9 `45.31`, max `45.50`

**Client tick (ms)**  avg `0.34`, p95 `0.50`, max `0.81`

**Memory**  start `1318 MB`, end `927 MB`, peak `1980 MB`, GC `36 events / 236 ms`

**FPS over sampling window (ASCII):**

```
 32.1 |                                                          █                     
 31.8 |                                              █           █                     
 31.5 |                                              █           █                     
 31.3 |                                              █           █                     
 31.0 |                                              █           █                     
 30.7 |                                              █           █                     
 30.4 |                        █        █            █           █                     
 30.1 |█   █   ███ █ ██  █ ██  █   █    █ █  ██ █ ██ ██  █   █   █ █ ███ █ █  █  █ █   
 29.8 |█ ███ ██████████████████████████ ████████████ ███ ███ ██  ███████ ████ ██████ ██
 29.5 |█ ██████████████████████████████ ████████████████ ███ ███ ███████ ███████████ ██
 29.2 |█████████████████████████████████████████████████ ███████ ██████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  22 ms |   1
  26 ms |   1
  28 ms |   1
  29 ms |   1
  30 ms | █  6
  31 ms | ███████████  55
  32 ms | ██████████████████████████████  149
  33 ms | ████████████████████████████████████████  197
  34 ms | ███████████████████████  112
  35 ms | █████████  43
  36 ms | ██  11
  37 ms | █  4
  38 ms |   2
  39 ms | █  3
  40 ms |   2
  41 ms |   1
  42 ms |   2
  43 ms |   1
  44 ms |   1
  45 ms |   2
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `22.69`
- `surface_water_ratio` = `0.04`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `7.00`
- `entity_count_delta` = `18.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `25.00`
- `preload_duration_ms` = `369.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `21.98`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.79`
- `stamped_blocks` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `29.92`, min `21.94`, p50 `29.96`, p95 `31.08`, p99 `31.95`, 1%low `24.76`, 0.1%low `21.94`, std `1.28`

**Frame time (ms)**  avg `33.48`, p50 `33.38`, p95 `35.33`, p99 `37.18`, p99.9 `44.88`, max `45.59`

**Client tick (ms)**  avg `0.33`, p95 `0.49`, max `1.76`

**Memory**  start `1616 MB`, end `1877 MB`, peak `2184 MB`, GC `22 events / 165 ms`

**FPS over sampling window (ASCII):**

```
 31.7 |                                                           █                    
 31.4 |                                                           █                    
 31.1 |                             █                             █                    
 30.8 |                             █                             █                    
 30.5 |                             █                             █                    
 30.2 |                █            █     █       █          █    ██                   
 29.9 |██   █████████  █████████ ██████████ ██ ██ ███████████████ ███████████████████ █
 29.6 |██████████████████████████████████████████████████████████ ███████████████████ █
 29.3 |██████████████████████████████████████████████████████████ █████████████████████
 29.0 |██████████████████████████████████████████████████████████ █████████████████████
 28.7 |██████████████████████████████████████████████████████████ █████████████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  21 ms |   1
  23 ms |   1
  29 ms |   1
  30 ms |   2
  31 ms | ███  18
  32 ms | ██████████████████████  157
  33 ms | ████████████████████████████████████████  281
  34 ms | ██████████████  99
  35 ms | ███  24
  36 ms | █  7
  37 ms |   3
  38 ms |   2
  44 ms |   1
  45 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `67.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `24.76`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-5.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `66.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `21.94`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.87`
- `stamped_blocks` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `20.43`, p50 `29.82`, p95 `31.65`, p99 `32.76`, 1%low `23.28`, 0.1%low `20.43`, std `1.60`

**Frame time (ms)**  avg `33.52`, p50 `33.54`, p95 `35.34`, p99 `37.81`, p99.9 `45.97`, max `48.95`

**Client tick (ms)**  avg `0.33`, p95 `0.45`, max `0.78`

**Memory**  start `2213 MB`, end `1590 MB`, peak `2269 MB`, GC `26 events / 204 ms`

**FPS over sampling window (ASCII):**

```
 31.1 |                                                            █                   
 30.9 |                                                            █                   
 30.7 |                                                            █                   
 30.4 |                                                            █                   
 30.2 |          █    █ █                 █    █                   ██  █               
 30.0 |█ █ █ █ █ █ █  █ ██ █ █  ██  █ ██ ██ ██ ██ ██ ███  █  ██  █ ███ █  ██ ██ ██  ██ 
 29.8 |█████ ███ █ ████ ████ █ ████ ███████ ██ ██████████ █ ██████ ███ ████████████████
 29.6 |███████████ ███████████ ████████████ ██████████████████████ ███ ████████████████
 29.4 |███████████ ███████████ ███████████████████████████████████ ████████████████████
 29.1 |███████████ ███████████████████████████████████████████████ ████████████████████
 28.9 |███████████████████████████████████████████████████████████ ████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  25 ms |   1
  29 ms |   2
  30 ms | █  4
  31 ms | ██████████  53
  32 ms | ██████████████████████████  137
  33 ms | ████████████████████████████████████████  209
  34 ms | ████████████████████████████  144
  35 ms | ██████  30
  36 ms | █  6
  37 ms | █  4
  38 ms |   1
  40 ms |   1
  42 ms |   1
  43 ms |   2
  48 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `62.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `23.28`
- `surface_water_ratio` = `0.01`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-4.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `67.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `20.43`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.83`
- `stamped_blocks` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `29.87`, min `23.39`, p50 `29.89`, p95 `31.19`, p99 `32.05`, 1%low `24.82`, 0.1%low `23.39`, std `0.95`

**Frame time (ms)**  avg `33.52`, p50 `33.45`, p95 `35.03`, p99 `38.29`, p99.9 `42.42`, max `42.76`

**Client tick (ms)**  avg `0.32`, p95 `0.55`, max `0.77`

**Memory**  start `1933 MB`, end `1380 MB`, peak `2305 MB`, GC `24 events / 178 ms`

**FPS over sampling window (ASCII):**

```
 30.3 |                                                                          █     
 30.2 |          █                               █                        █      █     
 30.1 |   █      █ █ █        █        █  █ █    █  █ █   ██              █ █    ██ ██ 
 29.9 |█  ██████ █ █ █   ███ ██ ████ ███  █ █ █  ██ █ ███ ██  ███████████ █ ███  ██ ███
 29.8 |█ ███████ █ ████ ███████ ████████ ██ █████████ ███████ ███████████ █████  ██ ███
 29.7 |█ ███████ █ ████████████████████████ █████████████████ ███████████ ██████ ██████
 29.6 |█████████ █ ████████████████████████ █████████████████ ███████████ ██████ ██████
 29.4 |█████████ █ ████████████████████████ █████████████████ ███████████ ██████ ██████
 29.3 |█████████ █ ████████████████████████ █████████████████ ██████████████████ ██████
 29.2 |█████████ ██████████████████████████ █████████████████ █████████████████████████
 29.1 |██████████████████████████████████████████████████████ █████████████████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  29 ms |   1
  30 ms |   2
  31 ms | ████  26
  32 ms | ███████████████████  136
  33 ms | ████████████████████████████████████████  288
  34 ms | ████████████████  112
  35 ms | ███  21
  36 ms |   2
  37 ms |   1
  38 ms |   3
  39 ms |   1
  40 ms |   1
  42 ms |   2
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `56.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `24.82`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `52.00`
- `entity_count_delta` = `-51.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `33.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `23.39`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.83`
- `stamped_blocks` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24338 ms  |  Sample ticks: 400

**FPS**  avg `19.40`, min `8.98`, p50 `10.17`, p95 `30.75`, p99 `31.12`, 1%low `9.38`, 0.1%low `n/a`, std `9.93`

**Frame time (ms)**  avg `68.61`, p50 `98.30`, p95 `101.85`, p99 `103.81`, p99.9 `109.32`, max `111.35`

**Client tick (ms)**  avg `0.32`, p95 `0.62`, max `1.79`

**Memory**  start `906 MB`, end `2190 MB`, peak `2261 MB`, GC `22 events / 158 ms`

**FPS over sampling window (ASCII):**

```
 30.3 |████████████████████████ ███████ ██████ ██████                                  
 28.5 |██████████████████████████████████████████████                                  
 26.6 |██████████████████████████████████████████████                                  
 24.7 |██████████████████████████████████████████████                                  
 22.9 |██████████████████████████████████████████████                                  
 21.0 |██████████████████████████████████████████████                                  
 19.2 |██████████████████████████████████████████████                                  
 17.3 |██████████████████████████████████████████████                                  
 15.4 |██████████████████████████████████████████████                                  
 13.6 |██████████████████████████████████████████████                                  
 11.7 |██████████████████████████████████████████████                                  
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | █  1
  32 ms | █████████████████  31
  33 ms | ████████████████████████████████████████  73
  34 ms | ████████████████  29
  35 ms | █  1
  36 ms | █  1
  38 ms | █  1
  40 ms | █  1
  94 ms | █  1
  96 ms | █  1
  97 ms | ███  5
  98 ms | ██████████  19
  99 ms | ████████████████████████  44
 100 ms | ██████████████████████████  48
 101 ms | ████████████  21
 102 ms | █████  9
 103 ms | █  2
 104 ms | █  2
 111 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.38`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `13.00`
- `entity_count_delta` = `-11.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `1253.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `14.57`
- `stamped_blocks` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23143 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `9.20`, p50 `9.98`, p95 `10.21`, p99 `10.38`, 1%low `9.31`, 0.1%low `n/a`, std `0.16`

**Frame time (ms)**  avg `100.20`, p50 `100.16`, p95 `102.32`, p99 `105.75`, p99.9 `108.17`, max `108.66`

**Client tick (ms)**  avg `0.33`, p95 `1.21`, max `7.09`

**Memory**  start `1004 MB`, end `1862 MB`, peak `2321 MB`, GC `21 events / 166 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                                                           █    
 10.3 |                                                                           █    
 10.2 |                                                                           █    
 10.2 |          █                                                                █    
 10.1 |█         █                         █                   █                  █    
 10.0 |█ █  █    █  █ █ █  █  █  █ █ █ █   █  ██    ██   █ ██  ██  █     █ █ █  █ ██ █ 
 10.0 |████ ███ ██ ██ ███ ██ ███ █ ███ ██████ ██  █ ████ ████ ██████ █████ ██████ ████ 
  9.9 |██████████████████████████████████████████ █ █████████ ███████████████████ █████
  9.8 |██████████████████████████████████████████ ███████████████████████████████ █████
  9.8 |██████████████████████████████████████████ ███████████████████████████████ █████
  9.7 |██████████████████████████████████████████████████████████████████████████ █████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  93 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | █████  8
  98 ms | ███████████████  23
  99 ms | ███████████████████████████████████████  61
 100 ms | ████████████████████████████████████████  62
 101 ms | ██████████████████  28
 102 ms | ██████  9
 103 ms | █  1
 104 ms | █  1
 105 ms | █  2
 106 ms | █  1
 108 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.31`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-4.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24746 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `8.90`, p50 `9.98`, p95 `10.24`, p99 `10.55`, 1%low `9.01`, 0.1%low `n/a`, std `0.20`

**Frame time (ms)**  avg `100.18`, p50 `100.23`, p95 `102.35`, p99 `105.22`, p99.9 `111.81`, max `112.37`

**Client tick (ms)**  avg `0.37`, p95 `1.17`, max `12.35`

**Memory**  start `1009 MB`, end `1956 MB`, peak `2306 MB`, GC `22 events / 178 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                              █                                 
 10.2 |                                              █                                 
 10.2 |                                              █         █                       
 10.2 |                                              █         █                       
 10.1 |                                    █         █ █       █                       
 10.1 |            █                       ██        █ █       █  █   █                
 10.0 |  █    █    █  ██  █      █  ██  █  ██ █  █   █ █  ███  █  ██  █  █   █  █  █ █ 
 10.0 |█ ████ ████ █ ███  ██ ██ ██  ██  ██ ██ █ ███  █ █  ███  █  ██  █  ██ █████  █ ██
  9.9 |███████████ █ ████ ████████████████ ████████  █ ██ ████ █ ███  ██ ████████  █ ██
  9.9 |█████████████ █████████████████████ █████████ █ ███████ █████ ██████████████████
  9.9 |█████████████████████████████████████████████ █████████ ████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  93 ms | █  1
  94 ms | █  1
  96 ms | ██  3
  97 ms | █████  8
  98 ms | ███████████  18
  99 ms | ███████████████████████████████████  56
 100 ms | ████████████████████████████████████████  64
 101 ms | ███████████████████  30
 102 ms | ████████  13
 103 ms | █  1
 105 ms | █  1
 109 ms | █  1
 112 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.01`
- `surface_water_ratio` = `0.14`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `56.00`
- `entity_count_delta` = `-55.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1706.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23160 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.90`, p50 `10.00`, p95 `10.18`, p99 `10.31`, 1%low `9.10`, 0.1%low `n/a`, std `0.18`

**Frame time (ms)**  avg `100.23`, p50 `100.00`, p95 `102.74`, p99 `105.26`, p99.9 `111.36`, max `112.34`

**Client tick (ms)**  avg `0.35`, p95 `0.65`, max `5.61`

**Memory**  start `937 MB`, end `2057 MB`, peak `2374 MB`, GC `23 events / 183 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                                                           █    
 10.4 |                                                                           █    
 10.4 |                                                                           █    
 10.3 |                                                                           █    
 10.2 |                █                                                     █    █    
 10.1 | █ █ ██   █     ██  █  █ ██  ██ █ ██  █ █ █    █   █   ██ █ █  █ █ ██ █    ██  █
 10.0 | ███ ████ █ ███ ██ ██ ██ ███ ████ ██ ██ ███ █████ ████ ████ ████ █ ██ ████ █████
  9.9 | ██████████████ █████████████████ ███████████████████████████████████ ████ █████
  9.8 |██████████████████████████████████████████████████████████████████████████ █████
  9.7 |██████████████████████████████████████████████████████████████████████████ █████
  9.6 |██████████████████████████████████████████████████████████████████████████ █████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  1
  96 ms | █  1
  97 ms | █████  7
  98 ms | ██████████████████████  32
  99 ms | ████████████████████████████████████████  59
 100 ms | ████████████████████████████████  47
 101 ms | ████████████████  24
 102 ms | ██████████████  21
 103 ms | ██  3
 104 ms | █  2
 105 ms | █  1
 107 ms | █  1
 112 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.10`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `12.00`
- `entity_count_delta` = `25.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `37.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23156 ms  |  Sample ticks: 400

**FPS**  avg `9.98`, min `8.91`, p50 `9.98`, p95 `10.19`, p99 `10.36`, 1%low `9.08`, 0.1%low `n/a`, std `0.17`

**Frame time (ms)**  avg `100.25`, p50 `100.18`, p95 `102.31`, p99 `105.55`, p99.9 `111.44`, max `112.29`

**Client tick (ms)**  avg `0.30`, p95 `0.55`, max `4.73`

**Memory**  start `1705 MB`, end `2154 MB`, peak `2357 MB`, GC `22 events / 171 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                           █                                                    
 10.2 |           █               █                     █                              
 10.1 |      █    █               █        █            █                █             
 10.1 |      █    ██   ██     █   █ █ █  █ █  █      █  █  █    █ █ ██   █  █ █ █  █  █
 10.0 |████  ████ ████ ██ █ ████  █ █ ██ █ █  █ ███ ███ █ ███  ██ █ ███  █ ██ █ ██ █ ██
  9.9 |█████ ████ ████ █████████  ███ ██████  █████ ███ █ ████ ████ ████ ████ █████████
  9.9 |█████ ████ ██████████████████████████ ██████████ █████████████████████ █████████
  9.8 |██████████ ██████████████████████████ ██████████ ███████████████████████████████
  9.7 |█████████████████████████████████████ ██████████████████████████████████████████
  9.7 |█████████████████████████████████████ ██████████████████████████████████████████
  9.6 |█████████████████████████████████████ ██████████████████████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  94 ms | █  1
  95 ms | █  1
  96 ms | █  2
  97 ms | ███  4
  98 ms | ████████████████████  29
  99 ms | ██████████████████████████████████  50
 100 ms | ████████████████████████████████████████  59
 101 ms | ███████████████████████████  40
 102 ms | ████  6
 103 ms | █  2
 104 ms | █  2
 105 ms | █  2
 108 ms | █  1
 112 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.08`
- `surface_water_ratio` = `0.10`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23154 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `8.81`, p50 `9.99`, p95 `10.28`, p99 `11.13`, 1%low `8.85`, 0.1%low `n/a`, std `0.28`

**Frame time (ms)**  avg `100.22`, p50 `100.11`, p95 `103.39`, p99 `108.87`, p99.9 `113.27`, max `113.45`

**Client tick (ms)**  avg `0.37`, p95 `0.70`, max `12.37`

**Memory**  start `1884 MB`, end `1172 MB`, peak `2187 MB`, GC `25 events / 191 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                                              █                 
 10.3 |                                                        █     █                 
 10.2 |                                       █                █    ██                 
 10.1 |         █                          █  █         █      █    ██  █             █
 10.0 |█ ██ ██  █   █  █  █████  ██ █ █ ██ █  █  ██  █  █   █  █    ██ ███  █   █ █   █
  9.9 |████████ ██ ██████████████████ ███████████████████████ █████ ██ ███████ ██ ███ █
  9.9 |██████████████████████████████████████████████████████ █████ ██ ████████████████
  9.8 |██████████████████████████████████████████████████████ █████ ███████████████████
  9.7 |██████████████████████████████████████████████████████ █████ ███████████████████
  9.6 |██████████████████████████████████████████████████████ █████ ███████████████████
  9.6 |██████████████████████████████████████████████████████ █████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  88 ms | █  1
  89 ms | █  1
  93 ms | █  2
  94 ms | █  2
  95 ms | █  1
  97 ms | █████  8
  98 ms | ██████████  15
  99 ms | ████████████████████████████████████████  62
 100 ms | ███████████████████████████████████████  60
 101 ms | ███████████████  24
 102 ms | ███████  11
 103 ms | ██  3
 104 ms | █  1
 106 ms | █  2
 107 ms | █  1
 108 ms | ██  3
 112 ms | █  1
 113 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.85`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `7.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23171 ms  |  Sample ticks: 400

**FPS**  avg `9.97`, min `9.18`, p50 `9.99`, p95 `10.25`, p99 `10.43`, 1%low `9.24`, 0.1%low `n/a`, std `0.20`

**Frame time (ms)**  avg `100.33`, p50 `100.11`, p95 `103.51`, p99 `107.11`, p99.9 `108.61`, max `108.87`

**Client tick (ms)**  avg `0.32`, p95 `0.66`, max `7.39`

**Memory**  start `1437 MB`, end `1756 MB`, peak `2301 MB`, GC `26 events / 188 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                    █         █                █                
 10.1 |        █       █            █      █         █           █    █                
 10.1 |█     █ █   ██  █         █  █      █  ██   █ █       █   █    █      █         
 10.0 |█ █   █ ███ ██  ██ █  ██ ███ █ █    █  ██   █ █  █ █ ██ █ █ ██ █ █  █ █    █ █  
 10.0 |█ ██ ██ ███ ██  ██ █ ███████ ███ ██ ██ ██   █ ██ ███ ██ ███ ██ ██████ ██  ████  
  9.9 |████ ██ ███ ███ ████ ███████ ███ ██ ██ ███ ██ ██ ██████ ███ ██ ██████ ███ ████  
  9.9 |███████ ███ ████████████████████ ██ ██████ ████████████ ██████ ███████████████  
  9.9 |███████ ███ ███████████████████████ ██████ ████████████████████████████████████ 
  9.8 |███████████████████████████████████ ███████████████████████████████████████████ 
  9.8 |███████████████████████████████████████████████████████████████████████████████ 
  9.7 |███████████████████████████████████████████████████████████████████████████████ 
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms | █  1
  94 ms | █  1
  95 ms | █  2
  96 ms | ██  3
  97 ms | ████  6
  98 ms | ██████████████████  25
  99 ms | ███████████████████████████████████████  54
 100 ms | ████████████████████████████████████████  56
 101 ms | █████████████████  24
 102 ms | █████████  13
 103 ms | █████  7
 104 ms | █  2
 106 ms | ██  3
 107 ms | █  2
 108 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.24`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `56.00`
- `entity_count_delta` = `-55.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23134 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.78`, p50 `9.98`, p95 `10.11`, p99 `10.17`, 1%low `9.79`, 0.1%low `n/a`, std `0.07`

**Frame time (ms)**  avg `100.15`, p50 `100.16`, p95 `101.32`, p99 `102.00`, p99.9 `102.21`, max `102.22`

**Client tick (ms)**  avg `0.26`, p95 `0.38`, max `1.59`

**Memory**  start `1216 MB`, end `1296 MB`, peak `1296 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |  █                                                                             
 10.0 |  █                                              █                █             
 10.0 |  █         █                    █  █            █                █             
 10.0 |  █         █                    █  █            █                █             
 10.0 |  █         █                    █  █            █                █             
 10.0 |  █ █  █  █ █  █  █ █   █   ██ █ █  █ █ █ ██ █   █  ███ █ ██  █ █ █      █  █ █ 
 10.0 |█ █████████ ████████████████████ ██ ████████████ ██████ █ ███████ ██████████████
 10.0 |█ █████████ ████████████████████ ██ ████████████ ████████████████ ██████████████
 10.0 |█ █████████ ████████████████████ ██ ████████████ ████████████████ ██████████████
 10.0 |█ ██████████████████████████████ ███████████████ ████████████████ ██████████████
  9.9 |█ ██████████████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | █████  16
  99 ms | ██████████  31
 100 ms | ████████████████████████████████████████  129
 101 ms | ███████  22
 102 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `9.79`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23138 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.19`, p50 `9.99`, p95 `10.09`, p99 `10.22`, 1%low `9.38`, 0.1%low `n/a`, std `0.12`

**Frame time (ms)**  avg `100.14`, p50 `100.12`, p95 `101.26`, p99 `103.93`, p99.9 `107.93`, max `108.80`

**Client tick (ms)**  avg `2.80`, p95 `3.34`, max `11.95`

**Memory**  start `1540 MB`, end `1646 MB`, peak `2272 MB`, GC `1 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                                    █    █                                      
 10.1 |                                    █    █                                      
 10.1 |                                    █    █      █                               
 10.1 |                              █     █    █      █                               
 10.0 | █ █  █    █   ██   █ █  █ █  █     ██ █ █      █      █     █         █        
 10.0 | █ █ ███   ████████ ███  █ █████ ██ ██ █ ██████ ██ ██ ███  █ ███ ███ █ █ █ █████
 10.0 | ███████████████████████ ██████████ ████ ███████████████████████████████████████
  9.9 | ██████████████████████████████████ ████ ███████████████████████████████████████
  9.9 |███████████████████████████████████ ████ ███████████████████████████████████████
  9.8 |███████████████████████████████████ ████ ███████████████████████████████████████
  9.8 |███████████████████████████████████ ████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   1
  97 ms | █  2
  98 ms | ██  7
  99 ms | █████████████████████  60
 100 ms | ████████████████████████████████████████  114
 101 ms | ████  12
 102 ms |   1
 103 ms |   1
 104 ms |   1
 108 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `1.00`
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
- `fps_1pct_low` = `9.38`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23134 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.58`, p50 `9.99`, p95 `10.12`, p99 `10.16`, 1%low `9.67`, 0.1%low `n/a`, std `0.08`

**Frame time (ms)**  avg `100.14`, p50 `100.14`, p95 `101.44`, p99 `101.81`, p99.9 `103.97`, max `104.35`

**Client tick (ms)**  avg `0.27`, p95 `0.36`, max `1.76`

**Memory**  start `1735 MB`, end `1955 MB`, peak `1955 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                       █                        █                               
 10.0 |█            █         █                █       █                               
 10.0 |█            █         █                █       █                               
 10.0 |█            █         █                █       █                      █        
 10.0 |█       █    █         █         █    █ █   █   █              █  █  █ █ █    █ 
 10.0 |█  ██ █ █    █ █   ██  █  ███ ██ █    █ █   █ █ █ ██    █ █    █  ██ █ █ █ █  █ 
 10.0 |█████ █ █ ██ █████████ █ ███████ ██████ ███ █ █ ███████████ █████ ██ ███ ████ ██
 10.0 |████████████ █████████ █ ██████████████ ███ ███ ████████████████████████████████
 10.0 |████████████ █████████ ████████████████ ███████ ████████████████████████████████
 10.0 |██████████████████████ ████████████████ ████████████████████████████████████████
  9.9 |██████████████████████ █████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  95 ms |   1
  97 ms |   1
  98 ms | ████  13
  99 ms | █████████████  39
 100 ms | ████████████████████████████████████████  124
 101 ms | ██████  20
 102 ms |   1
 104 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `9.67`
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

Category: **Lighting**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.71`, p50 `9.99`, p95 `10.12`, p99 `10.15`, 1%low `9.77`, 0.1%low `n/a`, std `0.07`

**Frame time (ms)**  avg `100.15`, p50 `100.15`, p95 `101.46`, p99 `101.59`, p99.9 `102.73`, max `103.00`

**Client tick (ms)**  avg `0.27`, p95 `0.38`, max `1.70`

**Memory**  start `780 MB`, end `912 MB`, peak `912 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                █         █                                                     
 10.1 | █              █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █         █    █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █    █    █    █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █    ██   █    █    █    █    █    █    █    █    █    █    █    █    █    █   
 10.0 | █    ██ █ █ █  █    █ █  █ █  █  █ ██   █    █    █    █    █ ██ ██   █    ██ █
 10.0 | ████ ████ ████ ████ ████ █ ██ ████ ████ ████ ████ ████ ████ █ ██ ████ ████ ████
 10.0 | ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 | ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 | ██████████████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 |███████████████ █████████ ███████████████████████████████████████ ██████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  95 ms |   1
  98 ms | █████  17
  99 ms | ████████  26
 100 ms | ████████████████████████████████████████  135
 101 ms | ██████  20
 102 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `9.77`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23133 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.74`, p50 `9.99`, p95 `10.11`, p99 `10.13`, 1%low `9.80`, 0.1%low `n/a`, std `0.06`

**Frame time (ms)**  avg `100.14`, p50 `100.15`, p95 `101.33`, p99 `101.53`, p99.9 `102.41`, max `102.63`

**Client tick (ms)**  avg `0.27`, p95 `0.40`, max `1.62`

**Memory**  start `1163 MB`, end `1323 MB`, peak `1323 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |           █                                                                    
 10.1 |           █                                                                    
 10.1 |           █                                                                    
 10.0 | █    █    █    █    █    █    █         █    █    █    █    █         █        
 10.0 | █    █    █    █    █    █    █  █ █    █    █  █ █    █    █     █   █     █  
 10.0 | █    █ █  █    █  █ █ █  █    █  █ █  █ █    █  █ █    █    █  █ ██ █ █    ███ 
 10.0 | ████ ████ ████ ████ ████ ████ ██ █ ████ ████ ██ █ ████ ████ ████ ████ ████ ████
 10.0 | ████ ████ ████ ████ ████ ████ ██ ██████ ████ ████ ████ ████ ████ ████ ████ ████
  9.9 |██████████ ███████████████████ ████████████████████████ ████████████████████████
  9.9 |██████████ █████████████████████████████████████████████████████████████████████
  9.9 |██████████ █████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  97 ms |   1
  98 ms | ████  15
  99 ms | ███████  26
 100 ms | ████████████████████████████████████████  140
 101 ms | █████  17
 102 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `restocks` = `20.00`
- `fps_1pct_low` = `9.80`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23134 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `9.65`, p50 `9.98`, p95 `10.11`, p99 `10.14`, 1%low `9.73`, 0.1%low `n/a`, std `0.07`

**Frame time (ms)**  avg `100.15`, p50 `100.15`, p95 `101.29`, p99 `101.64`, p99.9 `103.31`, max `103.67`

**Client tick (ms)**  avg `0.27`, p95 `0.54`, max `1.55`

**Memory**  start `724 MB`, end `880 MB`, peak `880 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |      █                                                                         
 10.0 |      █                                                                   █     
 10.0 |      █                        █                                   █      █     
 10.0 | █    █    █                   █                                   █      █     
 10.0 | ██   █    █ █        ██  █  █ █ █    █   █         █   █     █ █  █    █ █     
 10.0 | ████ ██   █ █   █    ██  ██ █ █ ██  ██ ███   ██  █ █   ██  █ █ █  █  █ █ █ █   
 10.0 | ████ ███  █ ████████████ ██ █ ████████ █████████████████████ █ █  ██████ ██████
 10.0 | ████ ██████████████████████ █ ████████████████████████████████ █████████ ██████
 10.0 | ████████████████████████████████████████████████████████████████████████ ██████
 10.0 |█████████████████████████████████████████████████████████████████████████ ██████
 10.0 |█████████████████████████████████████████████████████████████████████████ ██████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  96 ms |   1
  98 ms | ████  15
  99 ms | ███████  23
 100 ms | ████████████████████████████████████████  140
 101 ms | ██████  20
 103 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1088.00`
- `fps_1pct_low` = `9.73`
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

Category: **Showcase**  |  Duration: 194803 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `8.70`, p50 `9.99`, p95 `10.12`, p99 `10.25`, 1%low `9.56`, 0.1%low `8.92`, std `0.10`

**Frame time (ms)**  avg `100.14`, p50 `100.15`, p95 `101.52`, p99 `102.72`, p99.9 `107.17`, max `115.00`

**Client tick (ms)**  avg `0.60`, p95 `1.07`, max `9.28`

**Memory**  start `2088 MB`, end `961 MB`, peak `2216 MB`, GC `15 events / 87 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                                                                              █ 
 10.0 |                                                                              █ 
 10.0 | █                             █                                    █         █ 
 10.0 | █              █          █   █               █  █                 █         █ 
 10.0 | █    █   █   █ █    █     █   █ █ █  █    █   ██ █    █  ██   █    █ █  █ █  █ 
 10.0 | █ ██ █ █ ███ █ █ ██ █ █   █   █ ████ ██ █ █ █ █████  ███ ████ ███  █ ██ █ █  ██
 10.0 |███████ █ █████ █ ████ ██ ███  █ ████ ████ ███ ███████████████ ████ ████ █ ██ ██
 10.0 |███████ ███████ ██████ ██████ ████████████████ ███████████████ █████████ █ █████
 10.0 |███████████████ ██████████████████████████████ █████████████████████████████████
 10.0 |██████████████████████████████████████████████ █████████████████████████████████
 10.0 |██████████████████████████████████████████████ █████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms |   1
  91 ms |   1
  93 ms |   1
  94 ms |   1
  95 ms |   1
  96 ms |   4
  97 ms | █  24
  98 ms | ████  99
  99 ms | ████████████████████████  554
 100 ms | ████████████████████████████████████████  915
 101 ms | ███████  161
 102 ms | █  22
 103 ms |   7
 104 ms |   4
 106 ms |   1
 109 ms |   1
 115 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `8.92`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `70.00`
- `trees_built` = `173.00`
- `phase` = `0.00`
- `segment_count` = `19.00`
- `part` = `2.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `9.56`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194224 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `8.95`, p50 `9.99`, p95 `10.11`, p99 `10.23`, 1%low `9.47`, 0.1%low `9.01`, std `0.11`

**Frame time (ms)**  avg `100.14`, p50 `100.13`, p95 `101.35`, p99 `102.46`, p99.9 `109.04`, max `111.69`

**Client tick (ms)**  avg `0.59`, p95 `1.06`, max `1.62`

**Memory**  start `857 MB`, end `1594 MB`, peak `1882 MB`, GC `10 events / 44 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                                                                              █ 
 10.0 |                                                                              █ 
 10.0 |                                                                              █ 
 10.0 |                                                                              █ 
 10.0 |              █                                                               █ 
 10.0 | █            █    █           █                                              █ 
 10.0 | ████ █ ████ ███ █ █ ████ █ █ ██ █ ███ ██████ ███████ ██████ ███  ████ ███  █ █ 
 10.0 | ████████████████████████████████████████████████████████████████████████████ ██
 10.0 |█████████████████████████████████████████████████████████████████████████████ ██
 10.0 |█████████████████████████████████████████████████████████████████████████████ ██
  9.9 |█████████████████████████████████████████████████████████████████████████████ ██
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   1
  90 ms |   2
  92 ms |   1
  93 ms |   1
  94 ms |   1
  95 ms |   1
  96 ms |   2
  97 ms | █  12
  98 ms | ████  86
  99 ms | ███████████████████████████  616
 100 ms | ████████████████████████████████████████  898
 101 ms | ██████  142
 102 ms | █  17
 103 ms |   5
 104 ms |   3
 105 ms |   4
 106 ms |   1
 108 ms |   2
 110 ms |   1
 111 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `9.01`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `68.00`
- `trees_built` = `173.00`
- `phase` = `1.00`
- `segment_count` = `19.00`
- `part` = `3.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `21.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `9.47`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193676 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `8.87`, p50 `9.99`, p95 `10.10`, p99 `10.24`, 1%low `9.51`, 0.1%low `9.00`, std `0.10`

**Frame time (ms)**  avg `100.15`, p50 `100.12`, p95 `101.33`, p99 `102.49`, p99.9 `109.54`, max `112.72`

**Client tick (ms)**  avg `0.59`, p95 `1.03`, max `6.07`

**Memory**  start `1807 MB`, end `938 MB`, peak `1861 MB`, GC `14 events / 72 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                    █                                                           
 10.0 |                    █                        █                                  
 10.0 |                    █                        █                                  
 10.0 |                    █                        █                                  
 10.0 |                    █                        █     █                            
 10.0 |██    ██    █    █  █      █       █  █      █     ██  █   █  █  █ █    █  █ ██ 
 10.0 |████████████████ ██ ████████████████████████ █ ███ ██ ██ ██████████████ ██ █ ██ 
 10.0 |███████████████████ ████████████████████████ ███████████████████████████████████
 10.0 |███████████████████ ████████████████████████ ███████████████████████████████████
 10.0 |███████████████████ ████████████████████████ ███████████████████████████████████
 10.0 |███████████████████ ████████████████████████████████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   1
  91 ms |   1
  92 ms |   2
  94 ms |   2
  95 ms |   5
  96 ms |   2
  97 ms | █  18
  98 ms | ███  63
  99 ms | ██████████████████████████████  648
 100 ms | ████████████████████████████████████████  856
 101 ms | ████████  165
 102 ms | █  22
 103 ms |   5
 104 ms |   1
 105 ms |   2
 106 ms |   1
 108 ms |   1
 109 ms |   2
 112 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `9.00`
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
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `9.51`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194462 ms  |  Sample ticks: 3600

**FPS**  avg `45.97`, min `22.97`, p50 `31.45`, p95 `65.31`, p99 `85.23`, 1%low `27.38`, 0.1%low `23.57`, std `18.47`

**Frame time (ms)**  avg `24.97`, p50 `31.79`, p95 `34.41`, p99 `34.95`, p99.9 `41.05`, max `43.54`

**Client tick (ms)**  avg `0.67`, p95 `0.86`, max `9.33`

**Memory**  start `1192 MB`, end `1080 MB`, peak `1882 MB`, GC `24 events / 114 ms`

**FPS over sampling window (ASCII):**

```
 79.0 |       █                                                                        
 74.5 |█      █                                                                        
 70.1 |█     ███                                                                       
 65.6 |█████ ███                                                                       
 61.2 |███████████████████████████████████████                                         
 56.7 |███████████████████████████████████████                                         
 52.2 |████████████████████████████████████████                                        
 47.8 |████████████████████████████████████████                                        
 43.3 |████████████████████████████████████████                                        
 38.8 |████████████████████████████████████████                                        
 34.4 |████████████████████████████████████████                                        
 29.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms |   1
   4 ms |   4
   5 ms |   4
   6 ms |   6
   7 ms |   5
   8 ms |   4
   9 ms |   10
  10 ms |   6
  11 ms | ██  76
  12 ms | ███  105
  13 ms | ██  65
  14 ms | █  32
  15 ms | ██████████████  555
  16 ms | ████████████████████████████████████████  1565
  17 ms | ████████████████████████  953
  18 ms | ███  125
  19 ms |   10
  20 ms |   4
  21 ms |   6
  22 ms |   8
  23 ms |   5
  24 ms |   7
  25 ms |   4
  26 ms |   1
  27 ms |   2
  28 ms |   2
  29 ms |   4
  30 ms |   6
  31 ms | ██  67
  32 ms | ████████████████████████████  1092
  33 ms | ████████████████████████████████████████  1568
  34 ms | █████████████████████  841
  35 ms | █  40
  36 ms |   6
  37 ms |   3
  38 ms |   1
  39 ms |   4
  40 ms |   1
  41 ms |   4
  42 ms |   2
  43 ms |   2
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `23.57`
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
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `27.38`
- `fps_harmonic_avg` = `40.04`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`

