# FPS Test session — 2026-09-07T18:28:44.501691997+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 112.8 | 45.9 | 43.7 | 21.14 | 0.59 | 2 | 64 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 113.4 | 45.2 | 43.3 | 21.36 | 0.65 | 5 | 82 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.6 | 20.9 | 20.3 | 46.90 | 0.64 | 1 | 168 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 28.3 | 19.8 | 16.6 | 47.74 | 0.67 | 5 | 83 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.3 | 21.0 | 20.3 | 47.09 | 0.64 | 1 | 332 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 28.3 | 20.4 | 20.0 | 47.85 | 0.47 | 1 | 260 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 28.7 | 20.9 | 20.1 | 46.81 | 0.64 | 3 | 376 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 29.0 | 21.2 | 20.4 | 46.75 | 1.03 | 4 | 238 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 29.3 | 20.2 | 19.8 | 49.03 | 3.02 | 5 | 408 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 29.8 | 19.9 | 19.6 | 49.50 | 3.85 | 10 | 210 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 29.0 | 20.0 | 18.9 | 47.36 | 0.95 | 5 | 103 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 29.0 | 21.0 | 19.5 | 46.51 | 0.46 | 3 | 384 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 29.6 | 20.2 | 19.9 | 48.91 | 3.43 | 5 | 176 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 28.9 | 20.3 | 19.8 | 48.60 | 2.69 | 4 | 578 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 36.9 | 14.2 | 12.6 | 63.63 | 15.01 | 28 | 586 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 38.6 | 13.4 | 11.9 | 68.35 | 15.53 | 26 | 344 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 29.0 | 20.6 | 20.1 | 47.95 | 1.79 | 4 | 590 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 29.0 | 20.8 | 20.7 | 47.75 | 1.80 | 5 | 48 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 27.2 | 8.9 | n/a | 110.69 | 0.60 | 0 | 460 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 9.8 | 8.7 | n/a | 113.71 | 0.30 | 0 | 96 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 9.8 | 8.8 | n/a | 113.52 | 0.26 | 1 | 388 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 9.8 | 8.7 | n/a | 113.52 | 0.30 | 0 | 460 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 9.8 | 8.7 | n/a | 114.03 | 0.29 | 0 | 124 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 9.8 | 7.9 | n/a | 124.49 | 0.44 | 49 | 488 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 9.9 | 7.8 | n/a | 125.88 | 0.36 | 34 | 403 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 9.9 | 7.6 | n/a | 127.34 | 0.35 | 26 | 993 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 9.8 | 8.4 | n/a | 118.28 | 0.38 | 26 | 656 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 9.8 | 8.7 | n/a | 114.20 | 0.37 | 25 | 107 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 9.9 | 8.2 | n/a | 118.36 | 0.32 | 24 | 1004 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 9.9 | 7.7 | n/a | 120.30 | 0.32 | 23 | 364 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 9.8 | 7.9 | n/a | 122.49 | 0.39 | 25 | 1346 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 9.8 | 7.9 | n/a | 124.32 | 0.43 | 24 | 1264 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 9.8 | 8.5 | n/a | 116.56 | 0.28 | 26 | 576 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 9.8 | 8.4 | n/a | 117.51 | 0.37 | 29 | 576 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 9.8 | 7.8 | n/a | 119.96 | 0.31 | 24 | 1488 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 9.8 | 8.7 | n/a | 113.70 | 0.26 | 0 | 80 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 9.8 | 8.7 | n/a | 114.86 | 2.54 | 1 | 988 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 9.8 | 8.7 | n/a | 113.98 | 0.28 | 0 | 220 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 9.8 | 8.8 | n/a | 112.89 | 0.28 | 0 | 140 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 9.8 | 8.7 | n/a | 114.22 | 0.27 | 0 | 156 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 9.8 | 8.7 | n/a | 113.41 | 0.28 | 0 | 156 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 9.9 | 8.0 | 7.4 | 122.40 | 0.67 | 15 | 732 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 85.3 | 9.2 | 8.1 | 101.25 | 0.71 | 24 | 570 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 34.4 | 20.7 | 19.0 | 47.17 | 0.71 | 16 | 964 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 49.5 | 17.0 | 15.9 | 56.72 | 0.72 | 20 | 796 |

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

Category: **Particles**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `112.81`, min `42.70`, p50 `118.51`, p95 `132.26`, p99 `143.59`, 1%low `45.90`, 0.1%low `43.67`, std `87.73`

**Frame time (ms)**  avg `10.31`, p50 `8.44`, p95 `18.25`, p99 `21.14`, p99.9 `22.13`, max `23.42`

**Client tick (ms)**  avg `0.59`, p95 `0.88`, max `1.44`

**Memory**  start `698 MB`, end `410 MB`, peak `763 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
166.8 |                                                       █                   █    
160.9 |                                                       █                   █    
155.1 |                    █                                  █                   █    
149.3 |         █          ██        █   █    █               █                   █    
143.4 |         █ █        ██        █   █    █               █                   █    
137.6 |         █ █    █   ██        █   █    █               █                   █    
131.8 |         █ █    █   ██        █   █    █               █                   █    
125.9 |       █ █ █    █   ██  █     █   █    █               █                   █    
120.1 |       █ █ █    █   ██  █     █   █ █  █               █                   █    
114.3 |       █ █ █  █ █   ██  █     █   █ █  █               █                   █    
108.4 |██████ █ ███ ██ ███████████ █████ ███ ██ █  █ ██  ██ █████  █  █  █  █ ██ ██  █ 
102.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   8
   1 ms |   6
   3 ms |   2
   6 ms |   5
   7 ms | ████████████  289
   8 ms | ████████████████████████████████████████  987
   9 ms | █████████  210
  10 ms |   1
  13 ms |   5
  14 ms | █  19
  15 ms | ███  85
  16 ms | ████  106
  17 ms | ████  107
  18 ms | ██  43
  19 ms | █  24
  20 ms | █  20
  21 ms | █  19
  22 ms |   4
  23 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 242 | 112.3 | 19.81 |
| `smoke` | 160 | 242 | 113.9 | 21.90 |
| `sculk_charge_pop` | 240 | 242 | 118.8 | 20.96 |
| `ALL_TOGETHER` | 1680 | 242 | 121.1 | 21.06 |
| `portal` | 160 | 242 | 106.4 | 20.50 |
| `end_rod` | 240 | 242 | 112.3 | 19.96 |
| `dragon_breath` | 160 | 242 | 106.1 | 19.07 |
| `dripping_water` | 240 | 242 | 111.6 | 21.14 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `45.90`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `43.67`
- `fps_harmonic_avg` = `97.04`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `87.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `113.36`, min `42.42`, p50 `118.18`, p95 `133.20`, p99 `145.31`, 1%low `45.22`, 0.1%low `43.26`, std `87.26`

**Frame time (ms)**  avg `10.33`, p50 `8.46`, p95 `18.38`, p99 `21.36`, p99.9 `22.54`, max `23.57`

**Client tick (ms)**  avg `0.65`, p95 `0.93`, max `1.29`

**Memory**  start `703 MB`, end `476 MB`, peak `785 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
159.9 |                                                                           █    
154.7 |                      █                                █                   █  █ 
149.5 |                      █       █   █                    █                   █  █ 
144.3 |                      █       █   █                    █ █  █              █  █ 
139.1 |       █              █       █   █                    █ █  █       █      █  █ 
133.9 |       █    █         █       █   ██         █         █ █  █       █      █  █ 
128.7 |    █  █    █         █       █   ██         █         █ █  █       █      █  █ 
123.5 |    █  █    █         █       █   ██         █         █ █  █     █ █      █  █ 
118.3 |    █  █    █         █       █   ██         █         █ █ ██     █ █      █  █ 
113.1 |    █  █    █         █       █   ██        ██         █ █ ██     █ █      █  █ 
107.9 |█ ███ ██  █ ███ ██ █  ██ ██  ████ ██ ███ █  ████ ██ ████ ██████ ███ █ ████ ██ ██
102.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   8
   1 ms |   8
   2 ms |   1
   4 ms |   1
   6 ms |   5
   7 ms | █████████████  304
   8 ms | ████████████████████████████████████████  967
   9 ms | █████████  209
  10 ms |   2
  13 ms |   3
  14 ms | █  16
  15 ms | ███  64
  16 ms | █████  112
  17 ms | ████  105
  18 ms | ███  64
  19 ms | █  19
  20 ms | █  20
  21 ms | █  17
  22 ms |   10
  23 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `45.22`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `81.00`
- `fps_harmonic_avg` = `96.80`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `43.26`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `28.61`, min `20.32`, p50 `29.42`, p95 `30.98`, p99 `48.85`, 1%low `20.87`, 0.1%low `20.32`, std `4.88`

**Frame time (ms)**  avg `35.80`, p50 `33.99`, p95 `45.24`, p99 `46.90`, p99.9 `48.83`, max `49.22`

**Client tick (ms)**  avg `0.64`, p95 `0.90`, max `1.33`

**Memory**  start `609 MB`, end `700 MB`, peak `777 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 32.5 |                                                 █                              
 31.8 |                         █                       █                    █         
 31.1 |         █               █             █         ██                   █ █  █    
 30.4 |█        █  █ ██         █       █     █         ██     █          █  █ █  █    
 29.7 |█        █  █ ██   █   █ █     █ █     █   █     ██     █     █    █  █ █ ██    
 29.0 |█        █  █ ███  ██ ██ █   █ █ █     █  ███    ██     ██   ██  █ █ ██ █ ██    
 28.3 |██ ██  ████ █████  █████ █████ █ ██ █  ██ ████   ███ █ ███ █ ███ ██████ ████ █ █
 27.6 |██ ████████ █████ ██████ █████████████ ██ ████   █████████ █████ ███████████ █ █
 26.9 |████████████████████████████████████████████████ ███████████████ ███████████ ███
 26.2 |████████████████████████████████████████████████████████████████ ███████████ ███
 25.4 |████████████████████████████████████████████████████████████████ ███████████████
 24.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | █  2
  20 ms | ██  9
  21 ms | █  5
  22 ms | █  2
  29 ms |   1
  31 ms | █  2
  32 ms | ███████████████████████████████  113
  33 ms | ████████████████████████████████████████  146
  34 ms | ███████████████████████  85
  35 ms | ██  6
  36 ms | ███  10
  37 ms | ███  10
  38 ms | ████  15
  39 ms | ██████  21
  40 ms | ████  16
  41 ms | █████  20
  42 ms | █████  19
  43 ms | █████  20
  44 ms | ██████  21
  45 ms | █████  17
  46 ms | ███  11
  47 ms | █  4
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.87`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `37.00`
- `fps_harmonic_avg` = `27.93`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `20.32`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `28.27`, min `16.61`, p50 `29.46`, p95 `30.99`, p99 `48.14`, 1%low `19.84`, 0.1%low `16.61`, std `4.75`

**Frame time (ms)**  avg `36.23`, p50 `33.95`, p95 `45.07`, p99 `47.74`, p99.9 `54.53`, max `60.20`

**Client tick (ms)**  avg `0.67`, p95 `0.84`, max `1.07`

**Memory**  start `729 MB`, end `482 MB`, peak `812 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |             █                                                     █            
 32.2 |             █                       █  █                          █            
 31.5 |             █  █                    █  █                          █            
 30.9 |             █  █                    █  █      █                   █            
 30.3 |█            █  █           █        █  █  █   █     █      █      █ █  █       
 29.7 |█     █      █  █           █        █  █  █   █ █   █      █      █ █  █       
 29.1 |█  █  █      █  █           █        █  █  █   █ █   █      █ █    █ █  █       
 28.5 |█  █  █      █  █     █  █ ██   █    █  ██ █   █ ██  ██     █ █    ███  █    █  
 27.8 |████ ███████ ██ ██ ██ █ ██ ██ █ ██ █ ██ ██████ █████ ██ █ █████ ██ ██████ ████ █
 27.2 |████████████ ██ █████ █ ██ ████ ██████████████ █████ █████████████ ███████████ █
 26.6 |████████████ ███████████████████████████████████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms | █  2
  20 ms | █  4
  21 ms | █  5
  22 ms | █  5
  31 ms | █  5
  32 ms | ████████████████████████████████  117
  33 ms | ████████████████████████████████████████  145
  34 ms | ████████████████  58
  35 ms | ██  6
  36 ms | ██  6
  37 ms | ██  6
  38 ms | ███  12
  39 ms | ███████  25
  40 ms | ██████  21
  41 ms | ███████  27
  42 ms | ████████  30
  43 ms | ███████  27
  44 ms | ██████  22
  45 ms | ████  14
  46 ms | ██  6
  47 ms | █  4
  48 ms | █  3
  49 ms |   1
  60 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `19.84`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `114.00`
- `fps_harmonic_avg` = `27.60`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `16.61`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23139 ms  |  Sample ticks: 400

**FPS**  avg `28.25`, min `20.32`, p50 `29.41`, p95 `30.87`, p99 `47.78`, 1%low `20.97`, 0.1%low `20.32`, std `4.54`

**Frame time (ms)**  avg `36.20`, p50 `34.00`, p95 `45.24`, p99 `47.09`, p99.9 `48.42`, max `49.21`

**Client tick (ms)**  avg `0.64`, p95 `0.93`, max `1.28`

**Memory**  start `478 MB`, end `585 MB`, peak `810 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                                                                              █ 
 32.4 |                                                                              █ 
 31.8 |                                                                              █ 
 31.2 |                 █                                                            █ 
 30.7 |        █        █      █                 █                   █     █        ██ 
 30.1 | █      █        █   █  █                 █            █      █     █  █     ██ 
 29.5 | █      █        █   █  █         █       █            █      █     █  █     ██ 
 28.9 | █ █   ██  █     ██  ██ ██ ██     █       █            █      █     ██ ██    ██ 
 28.3 |██ █  ███ ██     ███ ██ ██ ██   ███ █ █ ███ █  █       █ █  █ ██  █ ██ ██   ████
 27.7 |█████ ████████ █ ███ ██ ██ ██   █████ █ █████ ██ ████ █████ █ ██ ██ ██ ██ █ ████
 27.1 |██████████████ ███████████ ██ ███████████████ ██ ████████████ ██ ███████████████
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  7
  21 ms | █  5
  22 ms | █  3
  31 ms | █  2
  32 ms | ███████████████████████████████  114
  33 ms | ████████████████████████████████████████  145
  34 ms | ███████████████████  68
  35 ms | ██  7
  36 ms | ██  7
  37 ms | █  4
  38 ms | ███  11
  39 ms | █████  17
  40 ms | ████████  30
  41 ms | ████████  28
  42 ms | ████████  28
  43 ms | ███████  24
  44 ms | █████  19
  45 ms | █████  19
  46 ms | ██  6
  47 ms | ██  7
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.97`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `27.62`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `20.32`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `28.29`, min `19.99`, p50 `29.52`, p95 `30.73`, p99 `48.88`, 1%low `20.43`, 0.1%low `19.99`, std `4.78`

**Frame time (ms)**  avg `36.21`, p50 `33.88`, p95 `45.31`, p99 `47.85`, p99.9 `49.97`, max `50.03`

**Client tick (ms)**  avg `0.47`, p95 `0.58`, max `0.72`

**Memory**  start `561 MB`, end `507 MB`, peak `821 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
 32.1 |  █                                                                             
 31.6 |  █                                                                             
 31.0 |  █        █   █           █                                   █   █  █         
 30.4 |  █        █   ███         ██                                  █   █  █         
 29.9 |  █        █   ███         ██                                  █ █ █  █ █       
 29.3 |  █        █   ███         ██                      █     █     █ █ █  █ █       
 28.7 |█ █    ██  █ ██████        ████            █ █     █     █     ███ █  █ █   ██  
 28.2 |█ ██ █ ██ ██ ██████  █ █  █████ █  █ ██ █  █ █  █  █ █ █ █   █ ███ ██ █ █ █ ████
 27.6 |█ ██ █ ██ ██ █████████ ██ █████ ████ ██ █ ██ █ ██ ██ ███████ █ ███ ██ █████ ████
 27.0 |█ ██ █████████████████ █████████████ ██ ██████████████████████ ███ █████████████
 26.5 |█ ██████████████████████████████████████████████████████████████████████████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms | █  3
  20 ms | █  4
  21 ms | █  6
  22 ms | █  3
  30 ms |   1
  31 ms |   1
  32 ms | █████████████████████  98
  33 ms | ████████████████████████████████████████  190
  34 ms | ████████  39
  35 ms | ██  8
  36 ms | █  6
  37 ms | █  6
  38 ms | ███  13
  39 ms | ███  16
  40 ms | ████  21
  41 ms | ██████  28
  42 ms | █████  24
  43 ms | ██████  29
  44 ms | ████  21
  45 ms | ███  15
  46 ms | ██  9
  47 ms | █  4
  48 ms | █  4
  49 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.43`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `33.00`
- `fps_harmonic_avg` = `27.62`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `19.99`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `28.74`, min `20.14`, p50 `29.51`, p95 `31.25`, p99 `49.05`, 1%low `20.89`, 0.1%low `20.14`, std `5.14`

**Frame time (ms)**  avg `35.73`, p50 `33.88`, p95 `45.65`, p99 `46.81`, p99.9 `49.02`, max `49.64`

**Client tick (ms)**  avg `0.64`, p95 `0.87`, max `1.24`

**Memory**  start `455 MB`, end `550 MB`, peak `831 MB`, GC `3 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                                                          █                     
 32.6 |                                                          █                     
 31.9 |     █                                                    █                     
 31.3 |     █  █                       █           █  █          █                     
 30.6 |█    ██ █                       █ █    █    █  █          █  █      █   █       
 29.9 |█    ██ █         █  █ █     █  █ █  █ █    █  █          █  █  █ █ ██  ██      
 29.2 |█    ██ █         █ ██ █     █  ███  █ █  █ ██ █ ████ █   ████  █ █ ██  ██     █
 28.6 |██   ██ █         ██████     █  ███  █████████ █ ██████ ██████  █ █ ██████    ██
 27.9 |██  ███ █   █    ████████  ████ ████ ██████████████████ █████████ █ ██████ █  ██
 27.2 |██████████ ███████████████ ██████████████████████████████████████ ████████ █  ██
 26.5 |██████████████████████████████████████████████████████████████████████████ █  ██
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  4
  20 ms | ███  10
  21 ms | ██  7
  22 ms | █  3
  28 ms |   1
  29 ms |   1
  31 ms | █  2
  32 ms | ████████████████████████████████████  123
  33 ms | ████████████████████████████████████████  137
  34 ms | ███████████████████████  80
  35 ms | ████  15
  36 ms | ███  10
  37 ms | ██  6
  38 ms | ██  8
  39 ms | █████  16
  40 ms | ████  15
  41 ms | █████  16
  42 ms | ███████  23
  43 ms | ██████  22
  44 ms | ██████  20
  45 ms | ██████  21
  46 ms | █████  16
  47 ms | █  2
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.89`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `73.00`
- `fps_harmonic_avg` = `27.99`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `20.14`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `28.97`, min `20.45`, p50 `29.12`, p95 `46.15`, p99 `49.33`, 1%low `21.17`, 0.1%low `20.45`, std `6.23`

**Frame time (ms)**  avg `35.81`, p50 `34.34`, p95 `45.57`, p99 `46.75`, p99.9 `47.90`, max `48.91`

**Client tick (ms)**  avg `1.03`, p95 `1.21`, max `1.47`

**Memory**  start `621 MB`, end `778 MB`, peak `860 MB`, GC `4 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |             █                                                       █          
 33.2 |             █                                █                      █          
 32.5 | █           █                                █      █               █          
 31.8 | █           █       █   █                    █      █               █          
 31.1 | █  █        █       █   █     █  █       █   █      █   █       █   █       █  
 30.4 | █  █        █       █   █   █ █  █       ██  █      ██  █       █   █       █  
 29.7 | █  █        █ █     █  ██   █ █████   ██ ███ █ █    ██  █ █   █ █   █    █  █  
 29.0 | █  █        █ █ █  ██  ███  █ ██████  ██ ███ █ █    ███ █ █   ████  █    █  █ █
 28.4 | ████   ██   █ █ █ ████████ █████████████ █████ ██ █ ███ ███  █████  █   █████ █
 27.7 | █████ ████  ███ ████████████████████████ ██████████ ███ ████ █████ ██ █ ███████
 27.0 |████████████████████████████████████████████████████ ████████ ██████████████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | █  2
  20 ms | ████  10
  21 ms | ███████  18
  22 ms | ███  9
  23 ms | ██  4
  31 ms | ███  9
  32 ms | ████████████████████████████████████████  103
  33 ms | █████████████████████████████████████  95
  34 ms | ████████████████████████████████  83
  35 ms | █████  13
  36 ms | ██████  16
  37 ms | ████  11
  38 ms | █████  14
  39 ms | ████████  20
  40 ms | ████  10
  41 ms | █████  14
  42 ms | ████████  20
  43 ms | ███████  19
  44 ms | ██████████████  36
  45 ms | █████████████  34
  46 ms | █████  14
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.17`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `31.00`
- `fps_harmonic_avg` = `27.92`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `20.45`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23131 ms  |  Sample ticks: 400

**FPS**  avg `29.30`, min `19.84`, p50 `28.14`, p95 `43.63`, p99 `52.49`, 1%low `20.18`, 0.1%low `19.84`, std `6.35`

**Frame time (ms)**  avg `35.44`, p50 `35.53`, p95 `46.45`, p99 `49.03`, p99.9 `50.24`, max `50.40`

**Client tick (ms)**  avg `3.02`, p95 `3.68`, max `4.20`

**Memory**  start `481 MB`, end `636 MB`, peak `889 MB`, GC `5 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                              █              █                                  
 32.3 |                              █              █                     █            
 31.5 |  █           █        █      █            █ █                  █  █ █  █       
 30.7 |  █      █   ██ ███    █  █  ██ ██         █ █  █ █   █         █  █ █  █  █ █  
 29.8 |  █ ██  ██   ██ ████   █ ██  ██ ██ █  █ ██ █ █  █ █   █      █  █  █ █  █  █ █ █
 29.0 | ██ ██ ███ ████ ████ ███████ ██ ██ ██ █ ████ █ ██ ██ ███  █  ██ █  ███ ███ █ █ █
 28.2 |██████ ████████ ████████████ ██ █████ ██████ ████ ██████  ██ █████ ███████ █ █ █
 27.4 |██████ █████████████████████████████████████ ████ ██████████████████████████ ███
 26.5 |████████████████████████████████████████████ ███████████████████████████████████
 25.7 |████████████████████████████████████████████ ███████████████████████████████████
 24.9 |████████████████████████████████████████████ ███████████████████████████████████
 24.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  2
  18 ms | ██  4
  19 ms | ████  11
  20 ms | ███  7
  21 ms | █  2
  22 ms | █  3
  23 ms | ██  4
  24 ms | ██  4
  29 ms | █████  13
  30 ms | ██████████████████████████████████████  94
  31 ms | ███  7
  32 ms | ████████  20
  33 ms | ███████████████████████████████████████  97
  34 ms | ████  9
  35 ms | ███  8
  36 ms | ████████████████████████████████████████  100
  37 ms | ██████████  26
  38 ms | ███████  17
  39 ms | ████  9
  40 ms | ██████  15
  41 ms | ████  11
  42 ms | ███████  18
  43 ms | ██████  15
  44 ms | ████████  20
  45 ms | ██████  15
  46 ms | ██████  14
  47 ms | ██  5
  48 ms | ███  8
  49 ms | ██  5
  50 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.18`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `35.00`
- `fps_harmonic_avg` = `28.22`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `19.84`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `29.78`, min `19.61`, p50 `27.84`, p95 `49.06`, p99 `58.64`, 1%low `19.92`, 0.1%low `19.61`, std `8.12`

**Frame time (ms)**  avg `35.55`, p50 `35.92`, p95 `47.38`, p99 `49.50`, p99.9 `50.79`, max `50.99`

**Client tick (ms)**  avg `3.85`, p95 `5.41`, max `7.10`

**Memory**  start `702 MB`, end `900 MB`, peak `913 MB`, GC `10 events / 18 ms`

**FPS over sampling window (ASCII):**

```
 34.3 |                                                                               █
 33.6 |                                                               █               █
 32.8 |                                                               █               █
 32.0 |                     █         █      █    █              █  █ █ █  █       █  █
 31.3 |        ██        █  █   █  █  █ ██   █  █ █  █     █   █ ██ █ █ █  █   ██  █  █
 30.5 |  █ █   ███  █    █  ██  ██ █  █ ████ ██ █ █  █   █ █ █ █ ██ █ █ █  ██  ██  ██ █
 29.8 |  █ █   ███  █    ██ ██  ██ █  ██████ ██████  █   █ █ █ █ ██ ███ ██ ██ ███  ██ █
 29.0 | ██ █   █████████ ██ ██  ██ ██ ██████ ██████  █   █ █████ ██ ███ ██████████ ██ █
 28.2 | ██ ███ █████████ ██████ ██ ██ ██████ ██████ ███████████████████ ██████████ ████
 27.5 |███████ █████████ ██████ ████████████ ██████ ███████████████████████████████████
 26.7 |████████████████████████ ███████████████████████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms | █  1
  15 ms | █  1
  16 ms | ███  4
  17 ms | ████  5
  18 ms | ███  4
  19 ms | ███████  10
  20 ms | ████  6
  21 ms | ████  6
  22 ms | ████████  11
  23 ms | ████  6
  24 ms | ████  5
  25 ms | ████  6
  26 ms | ██  3
  27 ms | █  2
  28 ms | ███████████████  21
  29 ms | ███████████████████  26
  30 ms | █████████████████  24
  31 ms | █████████████  18
  32 ms | ████████████████████  28
  33 ms | ████████████████████████████████████████  56
  34 ms | ██████████  14
  35 ms | █████████████████████  29
  36 ms | ██████████████████████████  36
  37 ms | ██████████████████████████  36
  38 ms | ███████████████████████  32
  39 ms | ██████  9
  40 ms | █████████████  18
  41 ms | ██████████████  20
  42 ms | ███████████  16
  43 ms | ████████████████  23
  44 ms | ██████████████  19
  45 ms | ████████████████  22
  46 ms | █████████  13
  47 ms | ███████  10
  48 ms | █████████  12
  49 ms | ██████  8
  50 ms | ██  3
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
- `fps_1pct_low` = `19.92`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `28.13`
- `preload_duration_ms` = `65.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.61`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `28.96`, min `18.93`, p50 `29.45`, p95 `31.20`, p99 `49.49`, 1%low `20.03`, 0.1%low `18.93`, std `5.44`

**Frame time (ms)**  avg `35.48`, p50 `33.96`, p95 `45.31`, p99 `47.36`, p99.9 `52.59`, max `52.83`

**Client tick (ms)**  avg `0.95`, p95 `1.13`, max `7.57`

**Memory**  start `825 MB`, end `735 MB`, peak `928 MB`, GC `5 events / 22 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |      █                                          █                              
 32.7 |      █                        █                 █                              
 32.0 |      █                        █                 █                              
 31.4 |      █           █   █        █                 █      █                       
 30.7 |      █           █   █        █    █      █ █   █      █             █         
 30.1 |██    █    █  █  ██   █  █     █  █ ██ ██  █ █   ██     █  █          █       █ 
 29.4 |██    █ █  █  █  ██   █  █  █  █  █ ██ ███ █ █   ███  █ █  █    █     █      ██ 
 28.8 |██████████ █  █  ██   █ ██  █  ████ ███████████  ████ █ ████  █ █   █ ██   █ ██ 
 28.1 |████████████ ███ ██ █ █ ███ ████████████████████ ████ █ █████ █ █ █ █ ██  ██ ███
 27.5 |████████████ ██████████ ███ ███████████████████████████ █████ █████ █ ██████████
 26.8 |███████████████████████ █████████████████████████████████████ ██████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms |   1
  14 ms |   1
  19 ms | █  3
  20 ms | ██  7
  21 ms | ██  9
  22 ms | █  3
  30 ms |   1
  31 ms | █  2
  32 ms | ██████████████████████████████  114
  33 ms | ████████████████████████████████████████  150
  34 ms | ██████████████████████████  99
  35 ms | ███  12
  36 ms | ███  10
  37 ms | ███  12
  38 ms | ██  8
  39 ms | ███  12
  40 ms | █████  19
  41 ms | ████  16
  42 ms | ████  16
  43 ms | ███  10
  44 ms | ██████  22
  45 ms | █████  19
  46 ms | ███  10
  47 ms | █  3
  48 ms | █  2
  49 ms |   1
  52 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `152.00`
- `entity_count_sample_end` = `152.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.93`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `28.19`
- `fps_1pct_low` = `20.03`
- `preload_duration_ms` = `69.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `29.03`, min `19.54`, p50 `29.67`, p95 `31.13`, p99 `48.91`, 1%low `21.03`, 0.1%low `19.54`, std `5.03`

**Frame time (ms)**  avg `35.30`, p50 `33.70`, p95 `45.39`, p99 `46.51`, p99.9 `48.86`, max `51.18`

**Client tick (ms)**  avg `0.46`, p95 `0.60`, max `0.75`

**Memory**  start `563 MB`, end `929 MB`, peak `947 MB`, GC `3 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                                                                          █     
 33.2 |                                                                          █     
 32.5 |                                                                          █     
 31.8 |                                                                          █     
 31.1 |       █                  █                                █              █    █
 30.4 |   █   █     █            █ ██    █ ██      █ █     █      ██    █        █ █ ██
 29.6 |█  █ █ █     ██    ██     █ ███  ██ ██   ██ ████  █ █     ████  ███       █ █ ██
 28.9 |█  █ █ █    ███  █████ ████ ███ ███ ███████ ████  ███     ██████████      █ ████
 28.2 |█ ████ █ █  ███ ███████████████████████████ ████  ██████ ███████████  █ █ ██████
 27.5 |█ ██████ ██████ ███████████████████████████ ████████████ ██████████████ █ ██████
 26.7 |████████████████████████████████████████████████████████ ██████████████ ████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  19 ms |   2
  20 ms | █  6
  21 ms | ██  15
  22 ms |   1
  23 ms |   1
  31 ms |   2
  32 ms | █████████████  79
  33 ms | ████████████████████████████████████████  243
  34 ms | ███████  44
  35 ms | █  9
  36 ms | ██  12
  37 ms | ██  12
  38 ms | ███  20
  39 ms | ███  18
  40 ms | ██  12
  41 ms | █  8
  42 ms | ██  14
  43 ms | ██  12
  44 ms | ███  18
  45 ms | █████  28
  46 ms | █  8
  47 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `doors_placed` = `16.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `21.03`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `28.33`
- `preload_duration_ms` = `37.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.54`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `29.57`, min `19.89`, p50 `27.72`, p95 `48.35`, p99 `56.03`, 1%low `20.17`, 0.1%low `19.89`, std `7.76`

**Frame time (ms)**  avg `35.60`, p50 `36.08`, p95 `46.25`, p99 `48.91`, p99.9 `50.23`, max `50.28`

**Client tick (ms)**  avg `3.43`, p95 `5.05`, max `13.49`

**Memory**  start `813 MB`, end `747 MB`, peak `989 MB`, GC `5 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 34.4 |    █                                                                           
 33.6 |    █      █                 █                        █                         
 32.7 |    █ █    █                 █           ██           █                         
 31.8 |    █ █    █ █  ██   █       █  █   █    ██   █  █ █  █                         
 30.9 |█   █ █ █  █ █  ██   █ █ █   ██ █   █    ██   ██ █ █  █      █        █ █ █     
 30.1 |█   ██████ █ █████  ██ █ █   ██ █ █ █  █ ██   ██ ████ █  █   ██     █ █ █ █ █   
 29.2 |█ █ ██████ ███████ █████ █  ███ ███ █  █ ██   ██ ███████ ██  ██     █ █ ███ ███ 
 28.3 |███ ██████████████ █████ █  ███ ███ █  █ ██ █ ██ ███████ ███ ██ █   █ █████ ████
 27.4 |███ ██████████████████████  ██████████ ████ ███████████████████ █████ ██████████
 26.5 |██████████████████████████ ███████████ █████████████████████████████████████████
 25.7 |██████████████████████████████████████ █████████████████████████████████████████
 24.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms | █  1
  17 ms | █████  9
  18 ms | ██████  11
  19 ms | ███  6
  20 ms | ████  7
  21 ms | ███  5
  22 ms | ██  4
  23 ms | ██  4
  24 ms | ██  4
  25 ms | █  1
  27 ms | █  1
  28 ms | █████  9
  29 ms | ██████████████  25
  30 ms | █████████████████████████  45
  31 ms | ██████████  18
  32 ms | ███████████  20
  33 ms | ████████████████████████████████████████  72
  34 ms | ████████  14
  35 ms | ████████████  21
  36 ms | █████████████████████████████████  59
  37 ms | ██████████████████  33
  38 ms | ███████████████  27
  39 ms | ████████  14
  40 ms | ████████  14
  41 ms | ████████  14
  42 ms | ████████████  22
  43 ms | █████████  17
  44 ms | ███████████████  27
  45 ms | █████████████  24
  46 ms | ████████  14
  47 ms | ████  7
  48 ms | ████  7
  49 ms | ██  4
  50 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_avg` = `36.10`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.17`
- `fps_harmonic_avg` = `28.09`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `119.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.89`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `28.94`, min `19.79`, p50 `28.28`, p95 `46.23`, p99 `53.70`, 1%low `20.31`, 0.1%low `19.79`, std `6.76`

**Frame time (ms)**  avg `36.04`, p50 `35.37`, p95 `46.24`, p99 `48.60`, p99.9 `50.09`, max `50.53`

**Client tick (ms)**  avg `2.69`, p95 `4.48`, max `5.80`

**Memory**  start `492 MB`, end `613 MB`, peak `1071 MB`, GC `4 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |      █                  █                                                      
 32.7 |   █  █           █      █                                                      
 31.6 |   █  █  █        █      █                █ █         █                █        
 30.5 |  ██ ██  ██       █ █    █   █          █ █ █   █  █  █     █  █  ███  █      █ 
 29.4 | ███ ███ ██ ███ █ █ █ █  █   ██         █ █ █   █  ████   ████ █  ███  █  █ █ █ 
 28.4 | ███ ██████ █████ ███ █ ██   ██ █ ███  ██ ███ █ █  █████  ████ ██ ███ ██ ████ ██
 27.3 |█████████████████ █████ ███  ██ █████████████████ ████████████ ██████ ██████████
 26.2 |███████████████████████ ██████████████████████████████████████ █████████████████
 25.1 |███████████████████████ ██████████████████████████████████████ █████████████████
 24.1 |███████████████████████ ████████████████████████████████████████████████████████
 23.0 |███████████████████████ ████████████████████████████████████████████████████████
 21.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | █  2
  18 ms | ███  5
  19 ms | ███  6
  20 ms | █████  8
  21 ms | █████  9
  22 ms | ███  5
  23 ms | ██  3
  24 ms | █  1
  25 ms | █  2
  27 ms | █  2
  28 ms | █  2
  29 ms | █████  9
  30 ms | ██████████████████  32
  31 ms | ██████████████████████████  46
  32 ms | ████████████  21
  33 ms | ████████████████████████████████████████  71
  34 ms | █████████████████  30
  35 ms | ████████████████████████████  50
  36 ms | ███████████████████████  40
  37 ms | ████████████  22
  38 ms | ████████  15
  39 ms | ███████  12
  40 ms | ████████████  21
  41 ms | ███████  12
  42 ms | ████████  15
  43 ms | ███████████████  27
  44 ms | ██████████████  24
  45 ms | ████████████████  29
  46 ms | ██████████  18
  47 ms | ████  7
  48 ms | ███  6
  49 ms | █  1
  50 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_avg` = `36.57`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.31`
- `fps_harmonic_avg` = `27.75`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `72.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.79`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23075 ms  |  Sample ticks: 400

**FPS**  avg `36.87`, min `12.57`, p50 `27.39`, p95 `90.04`, p99 `171.00`, 1%low `14.16`, 0.1%low `12.57`, std `27.98`

**Frame time (ms)**  avg `35.87`, p50 `36.51`, p95 `58.70`, p99 `63.63`, p99.9 `76.88`, max `79.56`

**Client tick (ms)**  avg `15.01`, p95 `20.76`, max `28.18`

**Memory**  start `500 MB`, end `990 MB`, peak `1087 MB`, GC `28 events / 94 ms`

**FPS over sampling window (ASCII):**

```
 63.6 |           █                                                                    
 59.9 |           █   █       █                    █                                   
 56.3 |           █   █       █                    ██                                  
 52.7 | █         █   █       █              █     ██                                  
 49.0 | █ █       █   █       █   █  █       █     ██  █          █                    
 45.4 | █ █      ██   █ █     █   █  █       █     ██  █          █         █          
 41.7 | █ █ █  ████  ██ ██    █   █  █       █   ████  █ █  █     █       █ █  █       
 38.1 | █ █ ██ ████  ██ ██  ███ █ █  ██  █   █   ████  █ █  █     █    █  ███ ██ █ ██  
 34.4 | █ █ ██ ████ ███ ██  █████ █  █████  ██   ████  █ █ ██  █████ █ █████████ █ ███ 
 30.8 |██ ████ ████████████ ███████ ████████████ ███████ ████ ██████ █ ███████████████ 
 27.2 |█████████████████████████████████████████████████████████████ ██████████████████
 23.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ████  2
   5 ms | ██████████  5
   6 ms | ████  2
   7 ms | ██████████  5
   8 ms | ████████  4
   9 ms | ██████████████  7
  10 ms | ██████  3
  11 ms | ██████  3
  12 ms | ████████  4
  13 ms | ██████████████████████████  13
  14 ms | ██████████████  7
  15 ms | ████████  4
  16 ms | ████████████████  8
  17 ms | ██████████  5
  18 ms | ██████████████████████████████████████  19
  19 ms | ████████████████████████████  14
  20 ms | ████████████  6
  21 ms | ██████████████  7
  22 ms | ████████████  6
  23 ms | ██████████████████  9
  24 ms | ████████████  6
  25 ms | ████████████████████████  12
  26 ms | ████████████  6
  27 ms | ██████████████████████████  13
  28 ms | ██████████████████  9
  29 ms | ████████████████████████████████  16
  30 ms | ██████████████  7
  31 ms | ████████████████████  10
  32 ms | ████████████████████  10
  33 ms | ████████████████████████████████████████  20
  34 ms | ██████████████████████████████████  17
  35 ms | ████████████████████████  12
  36 ms | ████████████████████████  12
  37 ms | ████████████████████  10
  38 ms | ████████████████████████████████  16
  39 ms | ██████████████████████████████  15
  40 ms | ████████████████████████████  14
  41 ms | ██████████████████████████████████████  19
  42 ms | ████████████████████████  12
  43 ms | ████████████████████████████████  16
  44 ms | ████████████████████████  12
  45 ms | ██████████████████████  11
  46 ms | ████████████████████  10
  47 ms | ██████████████████████  11
  48 ms | ████████████████████████████████  16
  49 ms | ████████████████████████████  14
  50 ms | ████████████████  8
  51 ms | ██████████  5
  52 ms | ██████████████████████  11
  53 ms | ██████████████████  9
  54 ms | ████████████████████  10
  55 ms | ████████████  6
  56 ms | ████████  4
  57 ms | ████████████████████████  12
  58 ms | ██████████████████  9
  59 ms | ████████████  6
  60 ms | ████████████  6
  61 ms | ████  2
  62 ms | ██████  3
  63 ms | ██  1
  64 ms | ██  1
  65 ms | ██  1
  66 ms | ██  1
  73 ms | ██  1
  74 ms | ██  1
  79 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `14.16`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4809.35`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `12.57`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.88`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `22043.00`
- `preload_duration_ms` = `87.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23072 ms  |  Sample ticks: 400

**FPS**  avg `38.64`, min `11.93`, p50 `27.03`, p95 `106.22`, p99 `155.73`, 1%low `13.40`, 0.1%low `11.93`, std `33.35`

**Frame time (ms)**  avg `35.90`, p50 `37.00`, p95 `59.82`, p99 `68.35`, p99.9 `79.10`, max `83.85`

**Client tick (ms)**  avg `15.53`, p95 `21.38`, max `25.96`

**Memory**  start `775 MB`, end `845 MB`, peak `1119 MB`, GC `26 events / 88 ms`

**FPS over sampling window (ASCII):**

```
 93.6 |                        █                                                       
 87.5 |                        █                                                       
 81.4 |                        █                                                       
 75.4 |                        █                                                       
 69.3 |                        █                                 █                     
 63.2 |           █            █                                 █                     
 57.1 |           █            █                                 █          █          
 51.1 |     █   ███   █   █    █         █                █      █ █     █  █  █       
 45.0 |     ██  ███   █   █    ██        █ ██ █      █  █ █  █  ██ █  ████  ████       
 38.9 |██ █ ███ ████  █  ███  ████  █ █  █ ██ █      █  █ █  █  ████  ████  ████ ██    
 32.8 |██ ███████████ ██████████████████ ████████  █ ███████ ██ ████ █████  ████ ██████
 26.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   4 ms | ██  1
   5 ms | ████  2
   6 ms | █████████████  7
   7 ms | █████████████  7
   8 ms | ███████████  6
   9 ms | █████████████  7
  10 ms | █████████  5
  11 ms | ███████████████  8
  12 ms | ████████████████████  11
  13 ms | █████████████  7
  14 ms | █████████  5
  15 ms | ████████████████  9
  16 ms | █████  3
  17 ms | █████████████████████████  14
  18 ms | ███████████████  8
  19 ms | ████  2
  20 ms | ███████████████  8
  21 ms | ███████████████  8
  22 ms | ██████████████████████  12
  23 ms | ███████  4
  24 ms | ████████████████  9
  25 ms | ███████████████  8
  26 ms | ████████████████  9
  27 ms | ██████████████████████  12
  28 ms | ██████████████████████  12
  29 ms | ███████████████  8
  30 ms | ██████████████████  10
  31 ms | █████████████  7
  32 ms | █████████████████████████  14
  33 ms | ███████████████████████████████████  19
  34 ms | ████████████████  9
  35 ms | █████████████████████████████  16
  36 ms | ████████████████████  11
  37 ms | ████████████████████████  13
  38 ms | ██████████████████████  12
  39 ms | █████████████████████████████████  18
  40 ms | ██████████████████  10
  41 ms | █████████████████████████████  16
  42 ms | ███████████████████████████████  17
  43 ms | ███████████████████████████████  17
  44 ms | ███████████████  8
  45 ms | ███████████  6
  46 ms | ████████████████████  11
  47 ms | ██████████████████████  12
  48 ms | ████████████████████████████████████████  22
  49 ms | ███████████████████████████  15
  50 ms | █████████████  7
  51 ms | ███████████████  8
  52 ms | ██████████████████  10
  53 ms | █████████  5
  54 ms | █████████████  7
  55 ms | ██████████████████  10
  56 ms | ███████████  6
  57 ms | ███████████████  8
  58 ms | ███████████  6
  59 ms | ███████████  6
  60 ms | ███████████████  8
  61 ms | █████████████  7
  62 ms | ████  2
  64 ms | ████  2
  65 ms | ██  1
  67 ms | ████  2
  68 ms | ██  1
  72 ms | ██  1
  73 ms | ██  1
  74 ms | ██  1
  75 ms | ██  1
  83 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `13.40`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4808.64`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `11.93`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.85`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `26991.00`
- `preload_duration_ms` = `59.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `28.98`, min `20.07`, p50 `29.06`, p95 `32.53`, p99 `51.78`, 1%low `20.58`, 0.1%low `20.07`, std `5.62`

**Frame time (ms)**  avg `35.55`, p50 `34.42`, p95 `46.31`, p99 `47.95`, p99.9 `49.31`, max `49.81`

**Client tick (ms)**  avg `1.79`, p95 `2.42`, max `3.22`

**Memory**  start `538 MB`, end `733 MB`, peak `1129 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 33.6 |                                       █                                        
 32.9 |                                       █                                        
 32.2 |                    █  █       █       █                                        
 31.5 |                    █ ██       █ ██    █           █             █            █ 
 30.8 |                    █ ██    █  █ ██    █ █         █       █     █            █ 
 30.1 |  █        █    █   █ ██    █  ████    █ █     █   █ █     █ █   █       █  █ █ 
 29.3 |  █     █ ██    ██  █ ██  █ ██ ████    █ █     █   █ █   █ █ ██  █  █   ██ ██ █ 
 28.6 |█ ██ ██ █ ██████████████ █████ ████    ██████  █ █ ███   █ ███████████████ ██ ██
 27.9 |████ ██ █ ██████████████ █████ ████ █  ███████ █ ██████  ████████████████████ ██
 27.2 |███████████████████████████████████ ██ ███████ ████████ █████████████████████ ██
 26.5 |██████████████████████████████████████ ████████████████ ████████████████████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  18 ms | █  3
  19 ms | ███  8
  20 ms | ██  6
  21 ms | █  4
  22 ms | █  2
  23 ms |   1
  28 ms |   1
  30 ms | ██████  16
  31 ms | █████████████████████████  73
  32 ms | ████████████  36
  33 ms | ████████████████████████████████████████  116
  34 ms | ████████████  34
  35 ms | ██████████████████████████████  87
  36 ms | ██████  18
  37 ms | █████  14
  38 ms | ███  9
  39 ms | ████  13
  40 ms | ███  10
  41 ms | ███████  19
  42 ms | ████  13
  43 ms | ████  13
  44 ms | ██████  16
  45 ms | ██████  17
  46 ms | ███████  20
  47 ms | ██  7
  48 ms | █  4
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.58`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.12`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.07`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `28.13`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3234.00`
- `preload_duration_ms` = `43.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `29.03`, min `20.67`, p50 `29.19`, p95 `41.53`, p99 `50.73`, 1%low `20.78`, 0.1%low `20.67`, std `5.57`

**Frame time (ms)**  avg `35.49`, p50 `34.26`, p95 `45.88`, p99 `47.75`, p99.9 `48.29`, max `48.38`

**Client tick (ms)**  avg `1.80`, p95 `2.51`, max `3.68`

**Memory**  start `1102 MB`, end `548 MB`, peak `1150 MB`, GC `5 events / 18 ms`

**FPS over sampling window (ASCII):**

```
 32.5 |                                         █      █                               
 31.9 |                      █                  █      █           █                   
 31.3 |            █  █      █  █      █        █      █        █  █                   
 30.7 |            █  █   █  █  █   ██ █        ██     █        █  ██                  
 30.1 | █     █    █  █   ████ ██   ██ █ █   █  ██     █        █  ██       █          
 29.5 | █     ██   █  ██  ████ ██ ████ █ █   █  ██     █    ██  █  ███  █  ██          
 28.8 | █     ███  ██ ████████████████ █ ██  █  ██ █ █ █    ███ ██ ███████ ██  ████    
 28.2 | █  █ ████  ██ ██████████████████ ██  ██ ████ █ █  █ █████████████████  █████ █ 
 27.6 | █  █ ██████████████████████████████ ███ ████ █ ████████████████████████████████
 27.0 | ██████████████████████████████████████████████ ████████████████████████████████
 26.4 | ███████████████████████████████████████████████████████████████████████████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | ██  7
  20 ms | ███  8
  21 ms | ██  5
  22 ms | ██  5
  23 ms | █  2
  30 ms | █████  15
  31 ms | ████████████████████████████  81
  32 ms | ███████████  32
  33 ms | ████████████████████████████████████████  117
  34 ms | ██████████  30
  35 ms | █████████████████████████  74
  36 ms | ████████  22
  37 ms | █████  14
  38 ms | ██████  17
  39 ms | ███  10
  40 ms | ████  13
  41 ms | █████  14
  42 ms | ████  13
  43 ms | ██████  19
  44 ms | ███████  21
  45 ms | █████  15
  46 ms | █████  14
  47 ms | ███  10
  48 ms | █  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.78`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.12`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.67`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `28.17`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3087.00`
- `preload_duration_ms` = `84.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23166 ms  |  Sample ticks: 400

**FPS**  avg `27.16`, min `8.79`, p50 `29.44`, p95 `30.70`, p99 `48.43`, 1%low `8.93`, 0.1%low `n/a`, std `6.70`

**Frame time (ms)**  avg `40.92`, p50 `33.97`, p95 `99.97`, p99 `110.69`, p99.9 `112.76`, max `113.75`

**Client tick (ms)**  avg `0.60`, p95 `0.78`, max `1.63`

**Memory**  start `601 MB`, end `1061 MB`, peak `1061 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 32.2 |                          █       █                                 ██          
 30.2 |  █ █    ██      █    █ █ █ █ █ █ █ █  █  █     █  █ █   ███ █      ███  ██     
 28.1 |██████ █████████████  █ ████████████████ ██  █  ████ ██████████ ███████████     
 26.1 |███████████████████████ ███████████████████████████████████████████████████     
 24.0 |███████████████████████████████████████████████████████████████████████████     
 22.0 |███████████████████████████████████████████████████████████████████████████     
 20.0 |███████████████████████████████████████████████████████████████████████████     
 17.9 |███████████████████████████████████████████████████████████████████████████     
 15.9 |███████████████████████████████████████████████████████████████████████████     
 13.8 |███████████████████████████████████████████████████████████████████████████     
 11.8 |███████████████████████████████████████████████████████████████████████████     
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  6
  21 ms | ██  7
  32 ms | █████████████████████  82
  33 ms | ████████████████████████████████████████  153
  34 ms | ███████████████  59
  35 ms | █  5
  36 ms | ███  11
  37 ms | ███  11
  38 ms | ███  10
  39 ms | ███  12
  40 ms | ███  10
  41 ms | ████  14
  42 ms | ████  16
  43 ms | █  5
  44 ms | ████  17
  45 ms | ████  16
  46 ms | ███  11
  47 ms | █  3
  48 ms |   1
  92 ms |   1
  93 ms |   1
  95 ms |   1
  98 ms | █  3
  99 ms | ███  10
 100 ms | ███  11
 101 ms | █  4
 106 ms |   1
 107 ms |   1
 110 ms |   1
 111 ms | █  4
 113 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `47.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `n/a`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `24.44`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.93`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.70`, p50 `9.98`, p95 `10.12`, p99 `10.92`, 1%low `8.72`, 0.1%low `n/a`, std `0.40`

**Frame time (ms)**  avg `101.84`, p50 `100.23`, p95 `112.17`, p99 `113.71`, p99.9 `114.78`, max `114.88`

**Client tick (ms)**  avg `0.30`, p95 `0.49`, max `1.85`

**Memory**  start `687 MB`, end `783 MB`, peak `783 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                              █                 
 10.5 |                                                              █             █   
 10.3 |    █                                              █          █             █   
 10.2 |    █                                              █          █             █   
 10.1 |    █                               █              █          █             █   
 10.0 |  █ █  █ █  █ █ ██   ██   ██ █  █   ██ █ █ ██ █ ██ █ ██ █ ██  ███   ██   ██ ███ 
  9.9 |█ █ ██ █ ██ █ █ ██ █ ██ ████ ██ █ █ ██ █ █ ██ █ ██ █ ██ █ ██  ███  ████  ██ ███ 
  9.8 |█ █ ██ █ ██ █ █ ██ █ ██ ████ ██ █ █ ██ █ █ ██ █ ██ █ ██ █ ██  ███  ████ ███ ████
  9.7 |███ ██ █ ██ █ █ ██ █ ███████ ██ ███ ██ █ █ ██ ████ █ ██ █ ██  ███ █████████ ████
  9.6 |███ ██ ██████ █ ██ █ ██████████████ ██ ███ ███████ █ ████ ██  ███ █████████ ████
  9.5 |███████████████ ██████████████████████████████████ ██████████████ █████████ ████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  2
  91 ms |   1
  93 ms |   1
  94 ms |   1
  95 ms |   1
  98 ms | ████  9
  99 ms | ███████████  26
 100 ms | ████████████████████████████████████████  97
 101 ms | ███████  18
 102 ms | ██  4
 103 ms |   1
 104 ms | █  2
 105 ms |   1
 106 ms | █  2
 107 ms | █  3
 108 ms | ██  5
 109 ms | ██  4
 110 ms | █  2
 111 ms | ██  5
 112 ms | ████  9
 113 ms |   1
 114 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.72`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `99.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.82`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.74`, p50 `9.98`, p95 `10.17`, p99 `10.73`, 1%low `8.77`, 0.1%low `n/a`, std `0.41`

**Frame time (ms)**  avg `101.78`, p50 `100.19`, p95 `112.56`, p99 `113.52`, p99.9 `114.22`, max `114.35`

**Client tick (ms)**  avg `0.26`, p95 `0.31`, max `2.08`

**Memory**  start `716 MB`, end `828 MB`, peak `1104 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                          █                                                     
 10.4 | █                        █                                                     
 10.3 | █                        █           █                                         
 10.2 | █                        █           █                                         
 10.1 | █   █    █               █   █    █  █ █    █    █    █    █  █              █ 
 10.0 | █ █ █   ██ █ █ ██ █    █ ██ ██ █ ██  █ █ ██ █ █  █    █ █  █  █  █    █    █ ██
  9.9 | █ ███ █ ██ █ █ ██ █ ████ ██ ██ █ ██  ███ ██ ███ ███  ██ █ ██  ██ ██ █ ██ █ █ ██
  9.8 | █ ███ ████ █ █ ██ █ ████ ██ ██ █ ██  ███ ██ ███ ███  ██ █ ███ ██ ██ █ ██ █ █ ██
  9.7 | ██████████ █ █ ██ █ ████ ██ ████ ██  ███ ██ ███ ███  ██ █ ███ ██ ███████ ███ ██
  9.6 | ████████████ █ ██ ██████ ██ ███████  ███ ██ ███ ████ ██ █ ███ ██ ███████████ ██
  9.5 |█████████████ ██████████████ ████████████ ███████████ ████████ █████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms | ██  2
  93 ms | ██  2
  95 ms | █  1
  96 ms | █  1
  97 ms | ██  2
  98 ms | █████████████████████  23
  99 ms | ██████████████████████████████████████  42
 100 ms | ████████████████████████████████████████  44
 101 ms | ██████████████████████████████████  37
 102 ms | ████  4
 105 ms | ███  3
 106 ms | ████  4
 107 ms | █████  5
 108 ms | ████  4
 109 ms | ███  3
 110 ms | ██  2
 111 ms | ████  4
 112 ms | ██████  7
 113 ms | █████  5
 114 ms | █  1
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
- `fps_1pct_low` = `8.77`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `4019.00`
- `preset_quick` = `1.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23130 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.68`, p50 `9.94`, p95 `10.26`, p99 `10.60`, 1%low `8.71`, 0.1%low `n/a`, std `0.42`

**Frame time (ms)**  avg `101.84`, p50 `100.61`, p95 `112.25`, p99 `113.52`, p99.9 `115.03`, max `115.17`

**Client tick (ms)**  avg `0.30`, p95 `0.61`, max `1.85`

**Memory**  start `506 MB`, end `966 MB`, peak `966 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |              █                                                                 
 10.3 |              █                                         █      █                
 10.2 |              █             █                      █    █      █         █      
 10.1 |          █   █   █ █     █ █ █        █           █    █      █     █ █ █ █    
 10.0 |█   ██    █ █ █   █ █ ██  █ █ █ █ █ █  ██ ██  █    █  █ █  █ █ █   █ █ █ █ █ ██ 
  9.9 |█ █ ██   ██ █ ██  █ █ ██ ██ █ ███ █ ██ █████  ██ █ ██ █ ██ █ █ ██ ██ █ █ █ █ ██ 
  9.8 |█ █ ██ █ ██ █ ██ ██ █ ██ ██ █ ███ █ ██ █████  ██ █ ██ █ ██ █ █ ██ ████ ███ █ ██ 
  9.7 |█ ████ ████ █ ██ ██ █ ██ ██ █ ████████ █████  ████ ████ ██ ███ ███████ ███ █ ██ 
  9.6 |█ ████ ████ █ █████ █ ███████ ██████████████  ████ ████ ██ ███ ███████ ███ █████
  9.5 |██████ ██████ ███████████████ ███████████████ █████████ ██ ███ ███████████ █████
  9.4 |█████████████████████████████ ████████████████████████████████ █████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  93 ms | ██  2
  94 ms | ███  3
  95 ms | ██  2
  96 ms | █  1
  97 ms | ███████  8
  98 ms | ██████████████████████  25
  99 ms | ████████████████████████████████  37
 100 ms | ████████████████████████████████████████  46
 101 ms | ██████████████████████  25
 102 ms | ████████  9
 103 ms | █  1
 106 ms | ██  2
 107 ms | ████  5
 108 ms | ██████  7
 109 ms | ██  2
 110 ms | ██  2
 111 ms | █████  6
 112 ms | ███████  8
 113 ms | ███  3
 114 ms | █  1
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `n/a`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.82`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `8.71`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23138 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.61`, p50 `9.98`, p95 `10.15`, p99 `10.92`, 1%low `8.68`, 0.1%low `n/a`, std `0.42`

**Frame time (ms)**  avg `101.96`, p50 `100.18`, p95 `112.64`, p99 `114.03`, p99.9 `115.77`, max `116.09`

**Client tick (ms)**  avg `0.29`, p95 `1.21`, max `3.31`

**Memory**  start `520 MB`, end `644 MB`, peak `644 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                    █   █                           █ █                       █ 
 10.0 | ██ ████ █ ██ █ █ ███ █ ██  ██ █ ███ ████ █ ██ █ ██ █ ██  ███ █ █ ██ █ █ ██ █ ██
  9.9 | ██ ████ █ ██ █ █ ███ █ ██  ██ █ ███ ████ ████ █ ██ █ ██  ███ █ █ ██ █ █ ██ █ ██
  9.8 |███ ████ █ ██ █ █ ███ █ ██  ██ █ ███ ████ ████ █ ██ █ ██  ███ █ █ ████ █ ██ █ ██
  9.8 |███ ████ █ ██ █ █ █████ ██  ██ █ ███ ████ ████ █ ██ █ ██  ███ █ █ ████ █ ██ █ ██
  9.7 |███ ████ █ ████ █ █████ ██  ██ █ ███ ████ ████ █ ██ █ ██  ███ █ █ ████ █ ████ ██
  9.7 |████████ █ ████ █ █████ ██  ██ █ ███ ████ ████ █ ██ █ ██ ██████ █ ████ █ ████ ██
  9.6 |████████ █ ████ █ █████ ██ ███ █████ ████ ████ █ ██ ████ ██████ █ ████ █████████
  9.5 |████████ █ ████ ███████ ██ ███ ██████████ ████ █ ██ ████ ██████ █ ████ █████████
  9.5 |██████████████████████████ ███ ███████████████ █ ██ ████ ██████ █ ████ █████████
  9.4 |██████████████████████████████████████████████████████████████████████ █████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   1
  91 ms | █  2
  93 ms |   1
  97 ms | █  2
  98 ms | █████  12
  99 ms | ███████████  26
 100 ms | ████████████████████████████████████████  99
 101 ms | █████  13
 103 ms | █  3
 105 ms |   1
 106 ms | █  3
 107 ms | █  2
 108 ms | ██  6
 109 ms | █  3
 110 ms | █  3
 111 ms | ██  4
 112 ms | ███  7
 113 ms | ██  5
 114 ms | █  2
 116 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `8.68`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23048 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `7.73`, p50 `9.93`, p95 `10.90`, p99 `11.46`, 1%low `7.88`, 0.1%low `n/a`, std `0.61`

**Frame time (ms)**  avg `102.10`, p50 `100.66`, p95 `114.12`, p99 `124.49`, p99.9 `128.38`, max `129.28`

**Client tick (ms)**  avg `0.44`, p95 `1.56`, max `6.47`

**Memory**  start `1008 MB`, end `980 MB`, peak `1496 MB`, GC `49 events / 237 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                                       █                  █     
 10.2 |  █                                          █         █               █  █     
 10.1 |█ █      █            █         █  █         █   █     █     █   █ █   █  █     
  9.9 |█ ███   ██ ███  ██  ███ ██ █    █ ███  ███   ███ ███   ██ ████  ████   █  █ ███ 
  9.8 |█ ███   ██ ████ ██  ███ ██ ████ █ ███  ███   ███ ███   ██ █████ █████  ██ █████ 
  9.7 |█ ███  ███ ████ ██  ███ ██ ████ █ ███ ████  ████ ████ ███ ███████████████ █████ 
  9.6 |█ ████ ███ ████ ██ ████ ██ ██████ ███ █████ ████ ████████ ███████████████ █████ 
  9.4 |█ ████████ ███████ ████ ██ ██████████████████████████████████████████████ ██████
  9.3 |█████████████████████████████████████████████████████████████████████████ ██████
  9.2 |█████████████████████████████████████████████████████████████████████████ ██████
  9.0 |█████████████████████████████████████████████████████████████████████████ ██████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  87 ms | ███  2
  88 ms | ███  2
  90 ms | ███  2
  91 ms | █████  4
  92 ms | █  1
  93 ms | ███  2
  94 ms | ███  2
  95 ms | ███  2
  96 ms | ████  3
  97 ms | ████████  6
  98 ms | ███████████████████████████████  24
  99 ms | ████████████████████████████████████████  31
 100 ms | ████████████████████████████████  25
 101 ms | ██████████████████████████  20
 102 ms | ███████████████████  15
 103 ms | ███  2
 104 ms | ██████  5
 105 ms | █████  4
 106 ms | ██████  5
 107 ms | ██████  5
 108 ms | █  1
 109 ms | ██████  5
 110 ms | █████  4
 111 ms | █████  4
 112 ms | ███  2
 113 ms | ████████  6
 114 ms | █  1
 115 ms | █████  4
 117 ms | ███  2
 124 ms | ███  2
 129 ms | █  1
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `-11.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `98.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.79`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `75.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.88`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `12.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23340 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `7.83`, p50 `9.98`, p95 `10.95`, p99 `11.42`, 1%low `7.85`, 0.1%low `n/a`, std `0.66`

**Frame time (ms)**  avg `101.94`, p50 `100.24`, p95 `117.55`, p99 `125.88`, p99.9 `127.59`, max `127.69`

**Client tick (ms)**  avg `0.36`, p95 `1.10`, max `5.87`

**Memory**  start `1365 MB`, end `1745 MB`, peak `1769 MB`, GC `34 events / 212 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |               █   █                                                 █          
 10.6 |       █       █   █                                                 █          
 10.4 |       █       █   █                                         █       █ █      █ 
 10.2 | █     █       █   █                  █      █      █     █  █       █ █      █ 
 10.1 | ██    █ █     ██  ██ █    ██ █ ██  █ █  ███ ██ █   ██  █ █  ██ ██   █ █ ████ ██
  9.9 | ████  ████  █ ███ █████ ████ ████  █ ██ ███ ████  ███ ██ ██ █████ █ █ █ ████ ██
  9.7 | ████ █████  █ ███ █████ ████ ████ █████ ███ ████  ███ █████ █████ █ █ █ ████ ██
  9.6 | ████ █████ ██ ███ █████ ████ ████ █████ ███ █████ ███ █████ █████ ███ █ ████ ██
  9.4 |██████████████████ █████ ███████████████████ █████████ █████ ████████████████ ██
  9.2 |██████████████████ █████████████████████████ █████████ █████ ████████████████ ██
  9.1 |████████████████████████████████████████████ ███████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  85 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | ██  2
  90 ms | █  1
  91 ms | █████  5
  92 ms | ███  3
  94 ms | ██  2
  95 ms | █  1
  96 ms | ██  2
  97 ms | ███████████████  14
  98 ms | ██████████████████████████  25
  99 ms | ███████████████████████████  26
 100 ms | ████████████████████████████████████████  38
 101 ms | ██████████████  13
 102 ms | ███████████████  14
 103 ms | ██████  6
 104 ms | ███  3
 105 ms | ███  3
 106 ms | █  1
 108 ms | ███  3
 109 ms | ████  4
 110 ms | █  1
 111 ms | ███  3
 112 ms | ██  2
 113 ms | ██████  6
 114 ms | █  1
 115 ms | █  1
 116 ms | █  1
 117 ms | █  1
 118 ms | ███  3
 121 ms | █  1
 122 ms | █  1
 123 ms | █  1
 124 ms | █  1
 125 ms | █  1
 127 ms | ██  2
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `5.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `8.00`
- `preload_duration_ms` = `317.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.85`
- `surface_water_ratio` = `0.06`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `3.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `9.87`, min `7.34`, p50 `9.95`, p95 `10.70`, p99 `11.70`, 1%low `7.57`, 0.1%low `n/a`, std `0.71`

**Frame time (ms)**  avg `101.80`, p50 `100.49`, p95 `113.10`, p99 `127.34`, p99.9 `134.59`, max `136.21`

**Client tick (ms)**  avg `0.35`, p95 `1.24`, max `4.83`

**Memory**  start `991 MB`, end `1221 MB`, peak `1984 MB`, GC `26 events / 185 ms`

**FPS over sampling window (ASCII):**

```
 11.4 |                                      █                                         
 11.2 |                                      █                                         
 10.9 |                                      █                                   █     
 10.6 |            █                         █      █     █                      █     
 10.4 |            █                  █      █      █     █                      █     
 10.1 | █ █  █ █ █ █ ███   ███ █ ██ █ ██   █ █  ███ █  ██ ███ █ ███ █  ███ █  ██ ███   
  9.8 |██ ████ ███ ██████ ████ ████ █ ██   ███ ████ █████ █████ ██████ ███ █████ ████ █
  9.5 |██ ████ ███████████████ ████ ███████████████ █████ █████ ████████████████ ██████
  9.3 |██ ████ ████████████████████████████████████ █████ █████ ████████████████ ██████
  9.0 |█████████████████████████████████████████████████████████████████████████ ██████
  8.7 |█████████████████████████████████████████████████████████████████████████ ██████
  8.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  64 ms | █  1
  85 ms | ██  2
  86 ms | █  1
  90 ms | █  1
  91 ms | ██  2
  92 ms | █  1
  93 ms | ███  3
  94 ms | ██  2
  96 ms | █  1
  97 ms | ████  5
  98 ms | ████████████████████  24
  99 ms | ████████████████████████████████████████  47
 100 ms | █████████████████████████  29
 101 ms | ███████████████████  22
 102 ms | ███████  8
 103 ms | ████████  9
 104 ms | ██  2
 105 ms | █████  6
 106 ms | █  1
 107 ms | █  1
 108 ms | █████  6
 109 ms | ███  4
 110 ms | ███  3
 112 ms | ████  5
 113 ms | ███  3
 114 ms | █  1
 117 ms | █  1
 122 ms | █  1
 124 ms | ██  2
 127 ms | ██  2
 136 ms | █  1
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `68.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `74.00`
- `preload_duration_ms` = `104.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.82`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.57`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23145 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.30`, p50 `9.95`, p95 `10.58`, p99 `11.11`, 1%low `8.36`, 0.1%low `n/a`, std `0.51`

**Frame time (ms)**  avg `101.95`, p50 `100.53`, p95 `113.00`, p99 `118.28`, p99.9 `120.17`, max `120.53`

**Client tick (ms)**  avg `0.38`, p95 `1.24`, max `13.93`

**Memory**  start `1540 MB`, end `1886 MB`, peak `2196 MB`, GC `26 events / 204 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                          █                                                     
 10.8 |                          █                                                     
 10.6 |                          █                                                     
 10.4 |                          █             █         █                             
 10.3 |                          █           █ █         █                  █          
 10.1 |  █    █ █  █   █ ██   █  █  █  ██ █  █ █ █  ██ █ ██     █  █ █   █  ██    █  █ 
  9.9 | ████  ███  █████ ██ ████ █████ ██ █  █ █ ██ ██ █ ███ █  ████████ ██ ██ ██ █ ██ 
  9.7 | █████████  █████ ██ ████ █████ ██ ████ ████ ██ █ █████  ████████ ██ ██ ██ ████ 
  9.5 |███████████ █████████████ █████ ███████ ████ ████ ██████████████████ █████ █████
  9.3 |█████████████████████████ █████████████ ████████████████████████████████████████
  9.1 |███████████████████████████████████████ ████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | █  1
  86 ms | █  1
  90 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | ████  5
  94 ms | █  1
  95 ms | ██  2
  96 ms | ████  4
  97 ms | ████  4
  98 ms | ██████  7
  99 ms | ███████████████████████████████████████  44
 100 ms | ████████████████████████████████████████  45
 101 ms | ██████████████████  20
 102 ms | ██████████  11
 103 ms | ████  4
 104 ms | ██████  7
 105 ms | ███  3
 106 ms | ██  2
 107 ms | █  1
 108 ms | █████  6
 109 ms | ██  2
 110 ms | ███  3
 111 ms | ███  3
 112 ms | ██████  7
 113 ms | ██  2
 114 ms | █  1
 115 ms | ████  4
 118 ms | ██  2
 120 ms | █  1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `-2.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.36`
- `surface_water_ratio` = `0.01`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `3.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23158 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.66`, p50 `9.94`, p95 `10.27`, p99 `10.85`, 1%low `8.67`, 0.1%low `n/a`, std `0.45`

**Frame time (ms)**  avg `101.92`, p50 `100.61`, p95 `111.71`, p99 `114.20`, p99.9 `115.38`, max `115.43`

**Client tick (ms)**  avg `0.37`, p95 `0.61`, max `4.47`

**Memory**  start `2096 MB`, end `1257 MB`, peak `2203 MB`, GC `25 events / 198 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |            █                                                                   
 10.3 |       █    █                                                                   
 10.2 |       █    █                                                                   
 10.1 |       █ █  ██ █   █            █            █      █   █   █       █           
 10.0 |█ ██   ███  ██ ██  █   ██ ██    █  █   █ █ █ █ ██  ██   █   █ ██ ██ ██ ██ █ █ ██
  9.9 |█ ██ █ ███  ██ ██ ██   ██ ██ █  ██ █ █ ███ █ █ ██ ███ █ ██ ██ ██ ██ ██ ██ █ █ ██
  9.8 |█ ██ █ ███  ██ ██ ██ █ ██ ██ █  ██ █ █ ███ █ █ ██ ███ █ ██ ██ ██ █████ ██ █ █ ██
  9.7 |█ ██ █████  ██ ██ ███████ ████ ███ ███ ███ █ █ ██ █████ █████ ██ █████ ██████ ██
  9.6 |█ ████████  ██ ██ ███████ ████ ██████████████████████████████ ██ █████ █████████
  9.5 |█ █████████ ██ ██ ██████████████████████████████████████████████ █████ █████████
  9.3 |███████████ ████████████████████████████████████████████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  88 ms | █  1
  92 ms | █  1
  93 ms | ██  2
  94 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | ███████████  12
  98 ms | ██████████  11
  99 ms | ████████████████████████████████████████  45
 100 ms | ████████████████████████████████████  41
 101 ms | ████████████████████  22
 102 ms | █████████  10
 103 ms | ██████  7
 104 ms | ████  4
 105 ms | █  1
 106 ms | ███  3
 107 ms | ███  3
 108 ms | ██  2
 109 ms | █████  6
 110 ms | ████  5
 111 ms | ████████  9
 112 ms | ███  3
 113 ms | ██  2
 114 ms | █  1
 115 ms | ██  2
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `-38.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `58.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.67`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `39.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24245 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.13`, p50 `9.96`, p95 `10.42`, p99 `11.37`, 1%low `8.23`, 0.1%low `n/a`, std `0.55`

**Frame time (ms)**  avg `101.81`, p50 `100.37`, p95 `114.12`, p99 `118.36`, p99.9 `122.40`, max `122.99`

**Client tick (ms)**  avg `0.32`, p95 `0.85`, max `1.91`

**Memory**  start `1224 MB`, end `1773 MB`, peak `2228 MB`, GC `24 events / 188 ms`

**FPS over sampling window (ASCII):**

```
 11.4 |                   █                                                            
 11.1 |                   █                                                            
 10.9 |                   █                                                            
 10.6 |                   █                                                            
 10.4 |                   █                              █                          █  
 10.2 |    █    █    █ █  █     █   █      ██        █ █ ███   █     █  █     █  █  ██ 
  9.9 |███ ██  ███ █████  █████ ███ █ ███  ███  ███ ████ █████ ████  ██ █ █████ ██  ███
  9.7 |███ ██ ████ █████  █████████ █ █████████ ███ ████ █████ ████ █████ ████████ ████
  9.4 |███ █████████████████████████████████████████████ █████ ██████████ █████████████
  9.2 |███ ██████████████████████████████████████████████████████████████ █████████████
  8.9 |███ ████████████████████████████████████████████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  78 ms | █  1
  87 ms | ██  2
  89 ms | █  1
  90 ms | █  1
  91 ms | ██  2
  92 ms | █  1
  93 ms | █  1
  94 ms | █  1
  96 ms | ███████  6
  97 ms | █████  4
  98 ms | ██████████████████████████████  26
  99 ms | ██████████████████████████████████████  33
 100 ms | ████████████████████████████████████████  35
 101 ms | █████████████████████████████  25
 102 ms | █████████████  11
 103 ms | ██████████  9
 104 ms | ██  2
 105 ms | ██  2
 106 ms | █  1
 107 ms | ██  2
 108 ms | ███  3
 109 ms | █████  4
 110 ms | ██████  5
 111 ms | ██████  5
 112 ms | █  1
 113 ms | ██  2
 114 ms | ███████  6
 115 ms | █  1
 116 ms | █  1
 118 ms | █  1
 119 ms | █  1
 122 ms | █  1
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `1126.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.82`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `54.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.23`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23140 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `7.70`, p50 `9.95`, p95 `10.65`, p99 `11.34`, 1%low `7.70`, 0.1%low `n/a`, std `0.58`

**Frame time (ms)**  avg `101.84`, p50 `100.47`, p95 `113.84`, p99 `120.30`, p99.9 `129.90`, max `129.91`

**Client tick (ms)**  avg `0.32`, p95 `1.13`, max `2.25`

**Memory**  start `1899 MB`, end `1383 MB`, peak `2263 MB`, GC `23 events / 194 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                █                               
 10.4 |                                █               █                               
 10.3 |          █                  █  █         █     █                               
 10.1 | █     █  █ ██   █ █  █    █ █  █      █  █     █             █    █    █    █ █
 10.0 | ██  ███ ██ ███ ████  ███  █ █  █████ ██  █ ██  █ ██   ████ █ █ █ ██  ███  ███ █
  9.8 |███  ███ ██████ ████ ████  ███ ██████ ███ █████ █████  ████ ███ ████  ████ ███ █
  9.6 |████ ███ ██████ ████ ████  ███ ██████ ███ █████ ██████ ████ ███ ████ █████████ █
  9.5 |████████ ██████ ██████████████ ██████ █████████ ███████████ ██████████████████ █
  9.3 |█████████████████████████████████████ █████████ ██████████████████████████████ █
  9.2 |██████████████████████████████████████████████████████████████████████████████ █
  9.0 |██████████████████████████████████████████████████████████████████████████████ █
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  81 ms | █  1
  86 ms | █  1
  88 ms | ██  2
  89 ms | ██  2
  91 ms | █  1
  92 ms | █  1
  93 ms | ███  3
  95 ms | █  1
  96 ms | ███  3
  97 ms | ███████████  10
  98 ms | █████████████████  16
  99 ms | ████████████████████████████████████████  38
 100 ms | ██████████████████████████████████████  36
 101 ms | █████████████████████████████  28
 102 ms | ███████████  10
 103 ms | ████████  8
 104 ms | ████  4
 107 ms | █  1
 108 ms | ████  4
 109 ms | ███  3
 110 ms | ████  4
 111 ms | ██  2
 112 ms | ██  2
 113 ms | ██████  6
 114 ms | ██  2
 115 ms | ███  3
 116 ms | █  1
 118 ms | █  1
 119 ms | █  1
 129 ms | ██  2
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `31.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `35.00`
- `preload_duration_ms` = `98.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.82`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.70`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `4.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24662 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `7.89`, p50 `9.95`, p95 `10.68`, p99 `11.49`, 1%low `7.95`, 0.1%low `n/a`, std `0.61`

**Frame time (ms)**  avg `102.02`, p50 `100.52`, p95 `114.63`, p99 `122.49`, p99.9 `126.39`, max `126.77`

**Client tick (ms)**  avg `0.39`, p95 `0.95`, max `13.94`

**Memory**  start `900 MB`, end `1660 MB`, peak `2246 MB`, GC `25 events / 189 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                              █    █                            
 10.5 |                                              █    █         █                  
 10.4 |                                              █    █         █          █       
 10.2 |                          █                █  █ █  ██        █          █ █   █ 
 10.0 |███ ███    ██  ██   █ █   █    ██  ██ █  █ █  █ █  ███   ███ █     ████ █ █   ██
  9.8 |███ ████  ███  ███ █████ ███  ███ ██████ ███  ███  ████  ███ ████  ████ ████  ██
  9.7 |███ █████ ███ ████ ██████████████ ██████ ███  ███ █████  ███ ████ █████ ████████
  9.5 |██████████████████ ██████████████████████████████ ██████ ███ ██████████ ████████
  9.3 |██████████████████ █████████████████████████████████████████ ██████████ ████████
  9.1 |████████████████████████████████████████████████████████████ ██████████ ████████
  9.0 |████████████████████████████████████████████████████████████ ███████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | █  1
  85 ms | █  1
  87 ms | ███  3
  88 ms | █  1
  89 ms | █  1
  92 ms | █  1
  93 ms | █████  5
  94 ms | █  1
  95 ms | █  1
  96 ms | ██  2
  97 ms | ████  4
  98 ms | ████████████████████████  25
  99 ms | ██████████████████████████████  31
 100 ms | ████████████████████████████████████████  41
 101 ms | ██████████████████████  23
 102 ms | ██████████  10
 103 ms | █████  5
 104 ms | █  1
 105 ms | █  1
 106 ms | ██  2
 107 ms | ██  2
 108 ms | ████  4
 109 ms | █  1
 110 ms | █████  5
 111 ms | ██  2
 112 ms | ████  4
 113 ms | █████  5
 114 ms | ███  3
 115 ms | ███  3
 116 ms | ██  2
 117 ms | █  1
 118 ms | █  1
 122 ms | █  1
 124 ms | █  1
 126 ms | █  1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `-25.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `6.00`
- `preload_duration_ms` = `1617.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.80`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.95`
- `surface_water_ratio` = `0.14`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `31.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23055 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `7.82`, p50 `9.94`, p95 `10.84`, p99 `11.22`, 1%low `7.92`, 0.1%low `n/a`, std `0.61`

**Frame time (ms)**  avg `101.97`, p50 `100.57`, p95 `114.70`, p99 `124.32`, p99.9 `127.20`, max `127.84`

**Client tick (ms)**  avg `0.43`, p95 `1.51`, max `4.87`

**Memory**  start `899 MB`, end `1637 MB`, peak `2163 MB`, GC `24 events / 175 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |            █                       █                                           
 10.4 |            █                       █                                      █    
 10.3 |            █         █             █                                      █    
 10.1 |     █  ██  █ ██ █ █  █     ██   █  █      █ █  ██ █   █         █     █   █    
  9.9 |█ ████  ███ █ ██ ████ █████ ███  ██ █████  ████ ████  ██ █████  ███   ██ █ █████
  9.8 |███████ ███ █ ██ ████ █████ ███  ██ █████ █████ ████  ██ █████ ████ █ ██ █ █████
  9.6 |███████ ███ ████ ████ █████ ███  ██ █████ █████ █████ ██ █████ ████ ████ █ █████
  9.5 |███████ ███ ████ ████ █████████████ ███████████ ██████████████████████████ █████
  9.3 |███████████ █████████ █████████████ ████████████████████████████████████████████
  9.2 |███████████ █████████ █████████████ ████████████████████████████████████████████
  9.0 |███████████████████████████████████ ████████████████████████████████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  89 ms | ████  4
  90 ms | ███  3
  91 ms | ██  2
  92 ms | ███  3
  93 ms | ███  3
  95 ms | █  1
  96 ms | ███  3
  97 ms | █████████  9
  98 ms | ████████████  12
  99 ms | ██████████████████████████████████  35
 100 ms | ████████████████████████████████████████  41
 101 ms | █████████████████████████  26
 102 ms | █████████  9
 103 ms | ████  4
 104 ms | ██  2
 105 ms | ██  2
 106 ms | █████  5
 107 ms | █  1
 108 ms | ██  2
 110 ms | ████  4
 111 ms | █  1
 112 ms | █████  5
 113 ms | ████  4
 114 ms | ████  4
 115 ms | ███  3
 116 ms | █  1
 118 ms | █  1
 119 ms | █  1
 123 ms | █  1
 124 ms | ██  2
 127 ms | █  1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `-13.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `9.00`
- `preload_duration_ms` = `110.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.92`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `22.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23305 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.53`, p50 `9.94`, p95 `10.22`, p99 `10.65`, 1%low `8.53`, 0.1%low `n/a`, std `0.46`

**Frame time (ms)**  avg `102.22`, p50 `100.58`, p95 `112.87`, p99 `116.56`, p99.9 `117.25`, max `117.26`

**Client tick (ms)**  avg `0.28`, p95 `0.86`, max `2.38`

**Memory**  start `1665 MB`, end `2014 MB`, peak `2241 MB`, GC `26 events / 211 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                █                                                               
 10.3 |                █                                 █                             
 10.2 |                █                                 █                             
 10.1 |     █      █   █           █                     █              █         █    
 10.0 |█  █ ██ █   █   █  █   █    █  █ █  █ █  █   █  █ █     ██  █ █  █ █  █ █  █    
  9.9 |██ █ ██ █  ██ █ ██ █   ██   █ ██ ██ █ ██ █████ ██ ██ █ ███ ██ █  █ █ ██ █ ██ █ █
  9.8 |██ █ ██ ██ ██ █ ████ █ ██   ████ ██ █ ██ █████ ██ ██ █ ███ ██ █ ██ █ ██ █ ██ █ █
  9.7 |██ █ ██ ██ ████ ████ █ ██ █ ███████ █ ██ █████ ██ ██ █ ███ ██ █ ██ █ ██ █ ██ █ █
  9.6 |██ █ ██ ██ ████ ████ ██████ ███████ █ ████████ ██ ████ ███ ██ █ ██ ██████ ██ █ █
  9.5 |██████████ ████ ███████████ █████████ ███████████ ████ ███████████ ██████ ████ █
  9.4 |█████████████████████████████████████████████████ ████ ██████████████████ ████ █
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  91 ms | █  1
  94 ms | █  1
  95 ms | ██  2
  96 ms | ███  3
  97 ms | ███  3
  98 ms | ███████████████  17
  99 ms | ████████████████████████████████████████  45
 100 ms | ████████████████████████████████████  41
 101 ms | █████████████████████████  28
 102 ms | ███████████  12
 103 ms | ████  4
 104 ms | █  1
 105 ms | █  1
 106 ms | ██  2
 107 ms | ██  2
 108 ms | ██  2
 109 ms | ███  3
 110 ms | █████  6
 111 ms | ███  3
 112 ms | ███████  8
 113 ms | ██  2
 114 ms | ███  3
 115 ms | ██  2
 116 ms | █  1
 117 ms | ██  2
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `207.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.78`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.53`
- `surface_water_ratio` = `0.09`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `4.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `8.41`, p50 `9.95`, p95 `10.91`, p99 `11.42`, 1%low `8.45`, 0.1%low `n/a`, std `0.64`

**Frame time (ms)**  avg `102.29`, p50 `100.50`, p95 `115.01`, p99 `117.51`, p99.9 `118.74`, max `118.96`

**Client tick (ms)**  avg `0.37`, p95 `1.16`, max `3.73`

**Memory**  start `1580 MB`, end `1207 MB`, peak `2156 MB`, GC `29 events / 222 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                                   █            
 10.5 |    █                                                  █        █  █            
 10.3 |  █ █ █                               █                █        █  █            
 10.2 |  █ █ █    █       █    █             █        █       ██       █  █        █   
 10.0 |  █ █ ██  ██ ██ █  █    █ █  █      █ █  ██  █ ██ ██   ███ █    █  ███ █ ██ ██  
  9.9 |███ █ ███ ██ ██ █  █  ███ ██ ██ █   █ ██ ██ ██ ██ ██ █ ███ █ ██ █  ███ █ ██ ███ 
  9.7 |███ █ ███ ███████ ██  ███ ██ ██ █   █ ██ ██ █████ ██ █ █████ ██ ██ ███ █ ██ ████
  9.6 |███ █ ███ ██████████  █████████ █ █ █ ██ ██ ████████ █ █████ ██ ██ ███ █ ██ ████
  9.4 |███ █████ ███████████ ███████████ ███ ██ █████████████ █████████████████ ███████
  9.3 |██████████████████████████████████████████████████████ █████████████████████████
  9.1 |██████████████████████████████████████████████████████ █████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  85 ms | █  1
  87 ms | ███  2
  88 ms | ███  2
  89 ms | ████  3
  91 ms | ████  3
  92 ms | █  1
  93 ms | █  1
  94 ms | ███  2
  95 ms | █  1
  96 ms | ████████  6
  97 ms | █████████████  10
  98 ms | ████████████████████████  19
  99 ms | ███████████████████████████████████  28
 100 ms | ████████████████████████████████████████  32
 101 ms | ███████████████████  15
 102 ms | ██████████████  11
 103 ms | █████  4
 104 ms | █████████  7
 106 ms | █  1
 107 ms | ███  2
 108 ms | █  1
 109 ms | ██████  5
 110 ms | █████  4
 111 ms | ████████  6
 112 ms | ████████  6
 113 ms | █  1
 114 ms | ███████████  9
 115 ms | █████████  7
 117 ms | ████  3
 118 ms | █  1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `-22.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `22.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.78`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `69.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.45`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `44.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23070 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `7.83`, p50 `9.96`, p95 `10.51`, p99 `11.35`, 1%low `7.84`, 0.1%low `n/a`, std `0.56`

**Frame time (ms)**  avg `102.07`, p50 `100.42`, p95 `113.57`, p99 `119.96`, p99.9 `127.67`, max `127.74`

**Client tick (ms)**  avg `0.31`, p95 `0.84`, max `2.80`

**Memory**  start `822 MB`, end `1195 MB`, peak `2310 MB`, GC `24 events / 184 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                                  █            █
 10.5 |                                          █                       █            █
 10.4 |                                      █   █                       █            █
 10.2 |                                      █   █                       █            █
 10.1 |█  █  █  █      █  █      █    █      ██  █  ██ █  █    ██   ██   █  █ ██   █  █
  9.9 |██ █  █  ██  █ ██ ██ █ ██ █ █  █ ███  ███ █  ██ █  █ █ ███ █ ██ █ ██ █ ██ █ ██ █
  9.7 |█████ ████████ █████ █ ██ █ █ ██ ███  ███ █ ███ █ ██ █ ███ █ ██ █ ████ ███████ █
  9.6 |█████ ██████████████ █ ████ █████████ █████ ██████████ ███ █ ██ █ ████ ███████ █
  9.4 |█████████████████████████████████████ ███████████████████████████ ████ ███████ █
  9.3 |█████████████████████████████████████████████████████████████████ ██████████████
  9.1 |█████████████████████████████████████████████████████████████████ ██████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  86 ms | █  1
  88 ms | ███  3
  89 ms | █  1
  92 ms | █  1
  93 ms | ██  2
  94 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | ███████████  10
  98 ms | ███████████████████████  21
  99 ms | ████████████████████████████████████████  37
 100 ms | ███████████████████████████████████  32
 101 ms | ███████████████████  18
 102 ms | █████████████████  16
 103 ms | ████  4
 104 ms | ████████  7
 105 ms | ████  4
 106 ms | █  1
 107 ms | ████  4
 108 ms | █  1
 109 ms | ██  2
 110 ms | ████  4
 111 ms | █████  5
 112 ms | █████  5
 113 ms | ████  4
 114 ms | ████  4
 115 ms | █  1
 117 ms | █  1
 119 ms | █  1
 127 ms | ██  2
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_delta` = `-33.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `9.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.80`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.84`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `42.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.73`, p50 `9.98`, p95 `10.17`, p99 `10.94`, 1%low `8.73`, 0.1%low `n/a`, std `0.44`

**Frame time (ms)**  avg `101.74`, p50 `100.18`, p95 `112.82`, p99 `113.70`, p99.9 `114.52`, max `114.53`

**Client tick (ms)**  avg `0.26`, p95 `0.29`, max `1.70`

**Memory**  start `1171 MB`, end `1251 MB`, peak `1251 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                   █                                            
 10.3 |                                   █                                            
 10.2 |             █                     █                                █           
 10.1 |             █          █          █                          █     █           
 10.1 |         █   ██    █    █  █ █     █    █   █    █    █  █ █ ██ █   ██    █ █  █
 10.0 |██ █ █ █ ██  ██ █  █ █  █ ██ █ █ █ ███  ███ █ ██ █ ██ █ ██ █ █████  ██ █  █ ██ █
  9.9 |██ █ █ █ ██  ██ █ ██ █ ██ ████ █ █ ███  ███ █ ██ █ ██ █ ██ █ █████  ██ █ ██ ██ █
  9.8 |██ █ █ █ ██  ██ █ ██ █ ██ ████ █ █ ███  ███ █ ██ █ ██ █ ██ █ ██████ ██ █ ██ ████
  9.7 |████ █ █ ██  ██ █ ██ █ █████████ █ ███  █████ ████ ██ ████ █ ██████ ██ █ ██ ████
  9.6 |████ ███ ██  ██ ██████ ███████████ ███  ██████████ ███████ █ ██████ ██ █████████
  9.5 |████████ ███ ██ ██████ ████████████████ ███████████████████████████ ██ █████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  2
  91 ms |   1
  92 ms |   1
  93 ms | █  3
  95 ms |   1
  97 ms |   1
  98 ms | ███████  14
  99 ms | ████████████████  33
 100 ms | ████████████████████████████████████████  84
 101 ms | ███████  14
 102 ms | ██  4
 103 ms |   1
 104 ms | █  3
 105 ms |   1
 106 ms | █  3
 107 ms | █  2
 108 ms | ██  4
 109 ms | █  3
 110 ms | █  3
 111 ms | █  2
 112 ms | ████  8
 113 ms | ███  6
 114 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `1923.00`
- `fps_1pct_low` = `8.73`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23148 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.66`, p50 `9.98`, p95 `10.53`, p99 `10.92`, 1%low `8.66`, 0.1%low `n/a`, std `0.50`

**Frame time (ms)**  avg `101.91`, p50 `100.18`, p95 `112.95`, p99 `114.86`, p99.9 `115.49`, max `115.52`

**Client tick (ms)**  avg `2.54`, p95 `2.96`, max `13.18`

**Memory**  start `1403 MB`, end `1214 MB`, peak `2391 MB`, GC `1 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                █                                          █                    
 10.3 |                █            █                         █   █                 █  
 10.2 |                █         █  █    █               █    █   █           █     █  
 10.1 |   █        █   ██        █  █    ██              █    █   █  ██      ██  █  █  
 10.0 |  ██ █  █ █ ██  ██  █ ██  ██ ██   ██ ██ ██ █ ██ █ █ ██ █ █ ██ ██ █ █  ██  █  ██ 
  9.9 |█ ██ █ ██ █ ██  ███ █ ██  ██ ██ █ ██ ██ ██ █ ██ █ █ ██ █ █ ██ ██ █ █ ███  ██ ██ 
  9.8 |█ ██ ████ █ ██  ███ █ ██  ██ ██ █ ██ ██ ██ █ ██ █ ████ █ █ ██ ██ █ █ ████ ██ ██ 
  9.7 |████ ██████ ██  ███ █ ██  ██ ██ █ ██ ██ ███████ █ ████ █ █ ██ ██ ███ ████ ██ ██ 
  9.6 |███████████ ██  ███ ████  ██ ██ ████ ██ ███████ ████████ ████ ███████████ ██ ███
  9.5 |███████████ ███ ███ ███████████ █████████████████████████████ ███████████ ██████
  9.4 |███████████ ███████████████████ ████████████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  90 ms | █  1
  91 ms | █  1
  93 ms | █  2
  94 ms | ████  6
  95 ms | ███  5
  96 ms | █  1
  97 ms | ████  7
  98 ms | ███████  11
  99 ms | █████████████████████████████  45
 100 ms | ████████████████████████████████████████  63
 101 ms | ████  6
 102 ms | ███  4
 103 ms | ███  4
 108 ms | █  2
 109 ms | ████  6
 110 ms | ████  6
 111 ms | ████  6
 112 ms | ██████  10
 113 ms | ████  7
 114 ms | █  1
 115 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `8.66`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `0.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.81`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23135 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.66`, p50 `9.98`, p95 `10.13`, p99 `10.90`, 1%low `8.68`, 0.1%low `n/a`, std `0.40`

**Frame time (ms)**  avg `101.87`, p50 `100.22`, p95 `112.29`, p99 `113.98`, p99.9 `115.38`, max `115.46`

**Client tick (ms)**  avg `0.28`, p95 `0.40`, max `1.78`

**Memory**  start `1357 MB`, end `1577 MB`, peak `1577 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                 █                                              
 10.3 |                                 █                                              
 10.2 |                                 █                                              
 10.1 |     █                           █                                              
 10.0 |    ██        █      █ ██ █ █    █     █   █              █ █  █ █  ██   ██     
  9.9 | ██ ████ ██ █ ██ █ █ █ ██ █ ██ █ ██ ██ ██ ██ █ █ █ ██ █ ███ █ ██ █ ███ █ ███ █ █
  9.8 | ██ ████ ██ █ ██ █ █ █ ██ █ ██ █ ██ █████ ████ █ █ ██ █ ███ █ ██ █████ █ ███ █ █
  9.7 | ██ ████ ██ █ ██ █ █ █ ████ ██ █ ████████ ████ █ █ ████ ███ █ ██ █████ █ ███ ███
  9.6 | ██ ████████████ █ ███ ████ ██ █ ████████ ████ █ █ ████████ █ ██ █████ █ ███ ███
  9.6 |███ ████████████ █ ███ ████ ████ ████████ ████████ ██████████ ██████████████████
  9.5 |███ ██████████████████ ████ ████████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms |   1
  91 ms | █  2
  96 ms |   1
  98 ms | ██████  13
  99 ms | █████████████████  36
 100 ms | ████████████████████████████████████████  83
 101 ms | █████████  19
 102 ms | █  3
 103 ms | █  2
 105 ms | ██  5
 106 ms |   1
 107 ms | █  2
 108 ms | ███  6
 109 ms | ██  5
 110 ms | █  2
 111 ms | █  3
 112 ms | ██  5
 113 ms | ██  5
 115 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.82`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3190.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `8.68`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23144 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.75`, p50 `9.98`, p95 `10.20`, p99 `10.75`, 1%low `8.79`, 0.1%low `n/a`, std `0.40`

**Frame time (ms)**  avg `101.94`, p50 `100.19`, p95 `112.30`, p99 `112.89`, p99.9 `114.14`, max `114.34`

**Client tick (ms)**  avg `0.28`, p95 `0.40`, max `1.88`

**Memory**  start `1695 MB`, end `1835 MB`, peak `1835 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                             █  █                                               
 10.3 |                             █  █                                               
 10.2 |                             █  █                                               
 10.1 |██         █    █            █  █                       █                       
 10.0 |███ █ █ █  █ █  █  █  ██   █ █  █   █     █ █  █ █ ██   ██   ██   █ █  █ █ ██   
  9.9 |███ █ █ █  █ █  █  █  ██ █ █ ██ ██ ████ █ █ ██ █ █ ██ █ ██ █ ██ █ █ ██ █ █ ██ ██
  9.9 |███ █ █ █ ██ █ ██  ██ ██ █ █ ██ ██ ████ █ █ ██ █ █ ████ ██ █ ██ █ █ ██ █ █ █████
  9.8 |███ █ █ █ ██ ████  ██ ██ █ █ ██ ██ ██████ █ ██ █ █ ████ ██ █ ██ █ █ ██ █ █ █████
  9.7 |███ █ █ █ ██ ████  █████ █ █ ██ ██ ████████ ██████ ████ ██ █ ████ █ ██ █ █ █████
  9.6 |█████ █ █ ██ █████ █████ █ █ ██ ██ ████████ ██████ █████████ ██████ ██ ███ █████
  9.5 |█████ ████████████ █████ ███ █████ ████████ ████████████████ █████████ ███ █████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  92 ms |   1
  93 ms | █  2
  94 ms |   1
  96 ms |   1
  97 ms | ██  5
  98 ms | █████████  20
  99 ms | ██████  12
 100 ms | ████████████████████████████████████████  87
 101 ms | ██████████  22
 102 ms | ███  6
 103 ms | █  2
 105 ms | █  3
 106 ms |   1
 107 ms | ███  6
 108 ms | ██  4
 109 ms | ██  4
 110 ms | █  2
 111 ms | ███  6
 112 ms | █████  10
 113 ms |   1
 114 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.79`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
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
- `fps_harmonic_avg` = `9.81`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23184 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.61`, p50 `9.98`, p95 `10.14`, p99 `10.78`, 1%low `8.67`, 0.1%low `n/a`, std `0.45`

**Frame time (ms)**  avg `102.16`, p50 `100.19`, p95 `112.96`, p99 `114.22`, p99.9 `115.80`, max `116.12`

**Client tick (ms)**  avg `0.27`, p95 `0.31`, max `1.76`

**Memory**  start `2028 MB`, end `2184 MB`, peak `2184 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                 █                                              
 10.4 |    █                            █                                              
 10.3 |    █                            █    █                                         
 10.1 |    █                            █    █                                         
 10.0 |    █          █      █ █    █ █ ██   ██          █   █    █    █ █  █    █    █
  9.9 |█ █ ██ ██ █ ██ █ ██ █ █ ██ █ █ █ ██ █ ██ █ █  █ █ █ █ ██ █ ██  ██ █  █ █ ██ █ ██
  9.8 |█ █ ██ ██ ████ █ ██ █ █ ██ █ █ █ ██ █ ██ █ █ ██ █ █ █ ██ █ ██  ██ █ ██ █ ██ █ ██
  9.7 |█ █ ██ ██ ██████ ██ █ █ ██ █ ███ ██ █ ██ █ █ ██ █ █ █ ██ █ ██  ██ █ ██ █ ████ ██
  9.6 |███ ████████████ ██ ██████ █ ███ ██ █ ██ █ █ ████ ███ ██ █ ███ ██ █ ████ ███████
  9.5 |███ ████████████ ██ ████████ ███ ██ █ ██ ████████ ██████████████████████████████
  9.4 |███ ████████████████████████ ███████████████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  2
  92 ms |   1
  93 ms | █  2
  94 ms | █  2
  98 ms | ████  9
  99 ms | ███████████  26
 100 ms | ████████████████████████████████████████  94
 101 ms | ████████  18
 102 ms |   1
 106 ms | █  3
 107 ms | █  3
 108 ms | ██  5
 109 ms | ██  4
 110 ms | █  3
 111 ms | ███  6
 112 ms | ███  7
 113 ms | ███  7
 114 ms | █  2
 116 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `restocks` = `20.00`
- `fps_1pct_low` = `8.67`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
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
- `fps_harmonic_avg` = `9.79`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23174 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `8.72`, p50 `9.98`, p95 `10.14`, p99 `10.76`, 1%low `8.73`, 0.1%low `n/a`, std `0.42`

**Frame time (ms)**  avg `102.01`, p50 `100.18`, p95 `112.25`, p99 `113.41`, p99.9 `114.68`, max `114.73`

**Client tick (ms)**  avg `0.28`, p95 `0.61`, max `3.13`

**Memory**  start `659 MB`, end `815 MB`, peak `815 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                                          █                     
 10.2 |                                                          █                     
 10.1 |   █   █                                                  █                     
 10.1 |   █   ██    █ █  █    █  █ █    █    █    █    █         █    █    █    █    █ 
 10.0 |█  ██  ██ █  █ █ ███  ██ ██ █ █  █ █  █ █  █ █ ██  ██ █ █ ██ █ ██ █ ██ █ ██ █ █ 
  9.9 |█ ███  ██ █ ██ █ ███  ██ ████ █ ██ █ ██ █ ██ █ ██  ██ █ █ ██ █ ██ █ ██ █ ██ █ █ 
  9.8 |█ ███  ██ █ ██ ██████ ██ ████ █ ████ ████ ██ █ ██  ██ █ █ ██ █ ██ █ ██ █ ██ █ █ 
  9.7 |█ ███  ██ █ ██ ██████ ██ ████ █ ████ ███████ █ ██  ██ █ █ ██ █ ██ █ ██ ████ █ █ 
  9.6 |█████  ██ █ ██ █████████ ████ ██████ ███████ █ ██ ███ ███ ████ ██ █ ██ ██████ █ 
  9.5 |██████ ████ ██ █████████ █████████████████████ ██ ███ ███ ████ ████ ██ ██████ ██
  9.4 |██████████████ ████████████████████████████████████████████████████ ████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms |   1
  92 ms | █  2
  94 ms | █  2
  95 ms |   1
  97 ms |   1
  98 ms | ██████  13
  99 ms | ████████████  27
 100 ms | ████████████████████████████████████████  93
 101 ms | ██████  14
 102 ms |   1
 103 ms |   1
 104 ms |   1
 105 ms | ██  4
 107 ms | █  3
 108 ms | ██  4
 109 ms | █  3
 110 ms | ██  4
 111 ms | ████  9
 112 ms | ███  7
 113 ms | █  3
 114 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `n/a`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.80`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `8.73`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195139 ms  |  Sample ticks: 3600

**FPS**  avg `9.87`, min `7.19`, p50 `9.98`, p95 `10.56`, p99 `11.13`, 1%low `7.96`, 0.1%low `7.43`, std `0.53`

**Frame time (ms)**  avg `101.63`, p50 `100.18`, p95 `113.20`, p99 `122.40`, p99.9 `127.97`, max `139.09`

**Client tick (ms)**  avg `0.67`, p95 `1.25`, max `3.06`

**Memory**  start `982 MB`, end `648 MB`, peak `1714 MB`, GC `15 events / 78 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                    █                                                           
 10.0 |     █              █  █                                                  █     
  9.9 |     █      █       █  █                           █                      █     
  9.9 |     █      █    █ ██  █         ███    ██    █    █        █   █   █ █   █     
  9.9 |     █  █   █    █ ██  ██  █     ███    ██    █    █ █ █    █   ██  █ █ █ █     
  9.9 | █   █ ██   ███  █ ███ ██  ████  ████   ██    █    █ ███    █ ████  █ █ ███     
  9.9 | █ █ █ ██ █ ██████ ███ ███ ████ ██████ ███ ██ █    █ ███    █ █████ █ ████████ █
  9.8 | ██████████ ██████ ███ ███ ████ ██████ ███ ██ █   ██████  ███████████ ██████████
  9.8 |██████████████████████ ███████████████ ██████ ██████████████████████████████████
  9.8 |██████████████████████ ███████████████ ██████ ██████████████████████████████████
  9.8 |██████████████████████ ██████████████████████ ██████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  69 ms |   1
  83 ms |   1
  84 ms |   1
  85 ms |   1
  87 ms |   3
  88 ms |   5
  89 ms | █  7
  90 ms | █  10
  91 ms | █  8
  92 ms | █  17
  93 ms | █  17
  94 ms | ██  22
  95 ms | ██  32
  96 ms | ██  23
  97 ms | ███  36
  98 ms | █████████  114
  99 ms | ██████████████████████████████████  458
 100 ms | ████████████████████████████████████████  535
 101 ms | ██████████  134
 102 ms | ███  35
 103 ms | █  16
 104 ms |   6
 105 ms | █  7
 106 ms | █  11
 107 ms | █  9
 108 ms | █  19
 109 ms | ██  25
 110 ms | ██  28
 111 ms | ████  56
 112 ms | ███  40
 113 ms | ██  26
 114 ms | █  11
 115 ms |   5
 116 ms |   5
 117 ms |   5
 118 ms |   4
 119 ms |   5
 120 ms |   6
 121 ms |   6
 122 ms |   6
 123 ms |   3
 124 ms |   6
 125 ms |   3
 127 ms |   2
 130 ms |   1
 139 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `19.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `7.96`
- `fps_harmonic_avg` = `9.84`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.43`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `68.00`
- `trees_built` = `173.00`
- `phase` = `0.00`
- `segment_count` = `19.00`
- `part` = `2.00`
- `preload_chunks` = `81.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194396 ms  |  Sample ticks: 3600

**FPS**  avg `85.33`, min `7.96`, p50 `100.55`, p95 `182.18`, p99 `250.03`, 1%low `9.16`, 0.1%low `8.12`, std `57.35`

**Frame time (ms)**  avg `21.58`, p50 `9.95`, p95 `45.52`, p99 `101.25`, p99.9 `121.32`, max `125.58`

**Client tick (ms)**  avg `0.71`, p95 `0.96`, max `1.72`

**Memory**  start `1278 MB`, end `801 MB`, peak `1849 MB`, GC `24 events / 127 ms`

**FPS over sampling window (ASCII):**

```
129.3 |                                               █  █████                         
118.4 |    █          ██████             █ ████████████████████                        
107.5 |    ████████████████████████████████████████████████████                        
 96.7 |    ████████████████████████████████████████████████████                        
 85.8 |   █████████████████████████████████████████████████████                        
 75.0 |   █████████████████████████████████████████████████████                        
 64.1 |   █████████████████████████████████████████████████████                        
 53.3 |   █████████████████████████████████████████████████████                        
 42.4 |   █████████████████████████████████████████████████████                        
 31.6 |   █████████████████████████████████████████████████████████████████████████████
 20.7 |   █████████████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   4
   3 ms | ██  80
   4 ms | ██████  234
   5 ms | █████  216
   6 ms | █████████  393
   7 ms | ███████████████████████  955
   8 ms | ████████████████████████████████████████  1696
   9 ms | ██████████████  603
  10 ms | █  57
  11 ms |   8
  12 ms |   4
  13 ms |   2
  14 ms |   3
  15 ms |   2
  16 ms |   12
  17 ms | █  53
  18 ms | ███  108
  19 ms | ████  170
  20 ms | ██████  246
  21 ms | ███████  281
  22 ms | █████  228
  23 ms | ████  184
  24 ms | ███  133
  25 ms | ██  67
  26 ms | █  37
  27 ms | █  39
  28 ms | █  50
  29 ms | █  33
  30 ms | █  34
  31 ms | ██  70
  32 ms | ████████  336
  33 ms | ███████████  473
  34 ms | ██████████  408
  35 ms | ██  98
  36 ms | ██  83
  37 ms | ██  87
  38 ms | ██  64
  39 ms | ██  64
  40 ms | █  56
  41 ms | █  56
  42 ms | ██  70
  43 ms | █  53
  44 ms | █  48
  45 ms | █  51
  46 ms | █  31
  47 ms |   14
  48 ms |   2
  50 ms |   1
  89 ms |   1
  90 ms |   1
  91 ms |   5
  92 ms |   7
  93 ms |   2
  94 ms |   5
  95 ms |   5
  96 ms |   4
  97 ms |   6
  98 ms | █  31
  99 ms | ██  74
 100 ms | ██  104
 101 ms | █  34
 102 ms |   3
 103 ms |   2
 104 ms |   6
 105 ms |   2
 106 ms |   4
 107 ms |   5
 108 ms |   4
 109 ms |   2
 110 ms |   9
 111 ms |   10
 112 ms |   5
 114 ms |   2
 116 ms |   1
 120 ms |   1
 121 ms |   3
 122 ms |   3
 123 ms |   2
 124 ms |   1
 125 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `14.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `9.16`
- `fps_harmonic_avg` = `46.34`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `8.12`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `73.00`
- `trees_built` = `173.00`
- `phase` = `1.00`
- `segment_count` = `19.00`
- `part` = `3.00`
- `preload_chunks` = `81.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194085 ms  |  Sample ticks: 3600

**FPS**  avg `34.37`, min `18.44`, p50 `29.56`, p95 `52.53`, p99 `132.99`, 1%low `20.70`, 0.1%low `19.02`, std `25.26`

**Frame time (ms)**  avg `33.55`, p50 `33.83`, p95 `45.50`, p99 `47.17`, p99.9 `50.32`, max `54.22`

**Client tick (ms)**  avg `0.71`, p95 `0.92`, max `4.65`

**Memory**  start `859 MB`, end `1039 MB`, peak `1824 MB`, GC `16 events / 57 ms`

**FPS over sampling window (ASCII):**

```
107.6 |                                                                              ██
100.4 |                                                                            ████
 93.2 |                                                                            ████
 86.0 |                                                                            ████
 78.9 |                                                                           █████
 71.7 |                                                                           █████
 64.5 |                                                                           █████
 57.3 |                                                                           █████
 50.2 |                                                                           █████
 43.0 |                                                                           █████
 35.8 |     █                                                                     █████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  25
   4 ms | █  15
   5 ms |   2
   6 ms |   2
   7 ms | █  20
   8 ms | ██  37
   9 ms | █  17
  10 ms | █  13
  11 ms | █  21
  12 ms | ██  59
  13 ms | █  21
  14 ms |   3
  15 ms |   1
  16 ms |   2
  17 ms |   2
  18 ms | █  25
  19 ms | ███  70
  20 ms | █████  123
  21 ms | ███████  158
  22 ms | █████  118
  23 ms | ███  75
  24 ms | █  28
  25 ms | █  24
  26 ms | █  24
  27 ms | █  23
  28 ms | █  26
  29 ms | █  34
  30 ms | █  35
  31 ms | █████  114
  32 ms | ████████████████████████████████  768
  33 ms | ████████████████████████████████████████  972
  34 ms | ██████████████████████████████  735
  35 ms | ███████  173
  36 ms | █████  112
  37 ms | ████  105
  38 ms | █████  126
  39 ms | █████  125
  40 ms | █████  112
  41 ms | █████  133
  42 ms | ██████  155
  43 ms | ██████  154
  44 ms | █████████  211
  45 ms | ███████  181
  46 ms | █████  120
  47 ms | ██  45
  48 ms |   11
  49 ms |   4
  50 ms |   1
  51 ms |   2
  52 ms |   2
  54 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `15.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `87.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `20.70`
- `fps_harmonic_avg` = `29.81`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.02`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `72.00`
- `trees_built` = `173.00`
- `phase` = `2.00`
- `segment_count` = `19.00`
- `part` = `4.00`
- `preload_chunks` = `81.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194735 ms  |  Sample ticks: 3600

**FPS**  avg `49.49`, min `15.22`, p50 `31.43`, p95 `161.75`, p99 `222.88`, 1%low `16.98`, 0.1%low `15.92`, std `44.59`

**Frame time (ms)**  avg `29.92`, p50 `31.82`, p95 `50.75`, p99 `56.72`, p99.9 `61.02`, max `65.70`

**Client tick (ms)**  avg `0.72`, p95 `0.96`, max `1.31`

**Memory**  start `1066 MB`, end `1055 MB`, peak `1862 MB`, GC `20 events / 97 ms`

**FPS over sampling window (ASCII):**

```
 95.9 |█                                                                               
 90.1 |█          █                                                                    
 84.3 |███       ██                                                                    
 78.5 |██████████████ █ █                                                              
 72.8 |████████████████████████                                                        
 67.0 |████████████████████████                                                        
 61.2 |████████████████████████                                                        
 55.4 |█████████████████████████                                                       
 49.6 |█████████████████████████                                                       
 43.9 |█████████████████████████                                                       
 38.1 |███████████████████████████████████████████  ██ █████ █ ████ █ ██    █ ██ ██   █
 32.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █████  34
   4 ms | ████████████  84
   5 ms | ███████████████████████  158
   6 ms | █████████████████  118
   7 ms | ██████████  67
   8 ms | ████████  56
   9 ms | █████████  65
  10 ms | █████████  61
  11 ms | ███████████████  105
  12 ms | ███████████████  101
  13 ms | ██████████████  100
  14 ms | ███████████████  103
  15 ms | ███████████████████  135
  16 ms | █████████████████████████  175
  17 ms | ██████████████████████  154
  18 ms | ████████████  80
  19 ms | █████████  65
  20 ms | ██████████  71
  21 ms | ███████████████  104
  22 ms | ███████████████  104
  23 ms | █████████████████████  148
  24 ms | █████████████████████  144
  25 ms | ████████████████  110
  26 ms | ████████████  83
  27 ms | ██████████████  96
  28 ms | ██████████████████  124
  29 ms | ███████████████  105
  30 ms | ██████████████████  123
  31 ms | █████████████████████████  171
  32 ms | ████████████████████████████████████████  278
  33 ms | ██████████████████████████████████  234
  34 ms | ███████████████████████████████████  242
  35 ms | ██████████████████████  151
  36 ms | ███████████████████  130
  37 ms | ████████████  85
  38 ms | █████████████  89
  39 ms | ██████████  67
  40 ms | ███████████████  103
  41 ms | ████████████████  112
  42 ms | ██████████████████████  155
  43 ms | ████████████████████████████  197
  44 ms | ████████████████████████████████  223
  45 ms | ██████████████████████████  179
  46 ms | ██████████████████  126
  47 ms | ██████████████  97
  48 ms | █████████████  91
  49 ms | ████████  58
  50 ms | ███████████  76
  51 ms | ████████  58
  52 ms | ███████  52
  53 ms | █████  38
  54 ms | ████  31
  55 ms | ███  23
  56 ms | ██  17
  57 ms | ███  22
  58 ms | ██  15
  59 ms | █  8
  60 ms | █  6
  61 ms | █  4
  62 ms |   2
  63 ms |   1
  65 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `17.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `16.98`
- `fps_harmonic_avg` = `33.43`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `15.92`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `71.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`

