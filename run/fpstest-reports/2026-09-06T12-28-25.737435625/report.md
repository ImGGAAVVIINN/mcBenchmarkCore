# FPS Test session — 2026-09-06T13:03:06.142386133+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 111.9 | 45.4 | 43.4 | 21.41 | 0.55 | 1 | 108 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 120.9 | 45.5 | 44.5 | 21.41 | 0.60 | 2 | 240 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.6 | 21.5 | 21.3 | 46.14 | 0.59 | 1 | 404 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 28.6 | 21.4 | 21.2 | 46.32 | 0.64 | 4 | 343 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.5 | 20.9 | 19.3 | 46.53 | 0.61 | 1 | 360 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 28.6 | 21.4 | 21.1 | 46.41 | 0.44 | 1 | 312 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 28.9 | 21.4 | 21.2 | 46.46 | 0.61 | 3 | 384 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 28.6 | 21.0 | 20.7 | 46.86 | 1.04 | 2 | 183 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 29.0 | 20.6 | 20.5 | 48.49 | 2.82 | 5 | 375 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 29.5 | 20.1 | 19.5 | 49.18 | 3.56 | 10 | 114 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 28.9 | 20.8 | 19.6 | 46.95 | 0.87 | 5 | 15 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 28.9 | 21.4 | 21.2 | 46.45 | 0.43 | 2 | 239 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 29.3 | 20.3 | 20.1 | 48.57 | 3.42 | 5 | 301 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 29.2 | 20.3 | 19.9 | 48.55 | 2.39 | 2 | 364 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 35.6 | 14.9 | 13.0 | 62.01 | 13.84 | 29 | 112 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 35.2 | 14.6 | 14.0 | 64.20 | 14.35 | 26 | 362 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 28.7 | 20.8 | 20.3 | 47.50 | 1.75 | 4 | 758 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 28.9 | 20.8 | 20.4 | 47.37 | 1.73 | 2 | 264 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 26.9 | 8.9 | n/a | 109.86 | 0.57 | 1 | 16 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 9.8 | 8.8 | n/a | 112.72 | 0.30 | 0 | 112 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 9.8 | 8.8 | n/a | 113.65 | 0.25 | 1 | 456 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 9.8 | 8.8 | n/a | 113.30 | 0.29 | 1 | 208 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 9.9 | 8.8 | n/a | 112.77 | 0.27 | 0 | 120 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 9.8 | 8.4 | n/a | 117.07 | 0.36 | 42 | 425 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 9.8 | 7.8 | n/a | 124.68 | 0.33 | 32 | 643 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 9.8 | 7.9 | n/a | 124.57 | 0.69 | 22 | 632 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 9.8 | 8.1 | n/a | 118.09 | 0.33 | 25 | 851 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 9.8 | 8.3 | n/a | 116.03 | 0.32 | 23 | 1196 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 9.8 | 8.5 | n/a | 116.02 | 0.29 | 25 | 368 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 9.8 | 8.4 | n/a | 115.46 | 0.38 | 24 | 1202 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 9.8 | 8.2 | n/a | 118.79 | 0.42 | 25 | 960 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 9.9 | 7.9 | n/a | 121.01 | 0.41 | 21 | 416 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 9.8 | 8.6 | n/a | 115.30 | 0.29 | 25 | 224 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 9.8 | 8.5 | n/a | 116.74 | 0.33 | 25 | 936 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 9.8 | 7.8 | n/a | 124.58 | 0.31 | 21 | 1056 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 9.8 | 8.7 | n/a | 112.85 | 0.26 | 0 | 76 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 9.8 | 7.5 | n/a | 121.27 | 2.64 | 3 | 432 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 9.8 | 8.9 | n/a | 112.53 | 0.27 | 1 | 164 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 9.8 | 8.7 | n/a | 113.32 | 0.27 | 0 | 136 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 9.9 | 8.8 | n/a | 113.04 | 0.27 | 0 | 156 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 9.8 | 8.8 | n/a | 112.70 | 0.28 | 0 | 140 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 9.8 | 8.5 | 8.2 | 115.43 | 0.67 | 14 | 20 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 9.9 | 8.0 | 7.8 | 124.07 | 0.63 | 11 | 678 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 9.9 | 8.4 | 7.8 | 117.04 | 0.63 | 10 | 1044 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 9.9 | 8.3 | 7.9 | 118.29 | 0.63 | 11 | 722 |

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

Category: **Particles**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `111.91`, min `43.24`, p50 `118.49`, p95 `132.87`, p99 `240.97`, 1%low `45.36`, 0.1%low `43.37`, std `83.71`

**Frame time (ms)**  avg `10.38`, p50 `8.44`, p95 `19.83`, p99 `21.41`, p99.9 `22.79`, max `23.13`

**Client tick (ms)**  avg `0.55`, p95 `0.85`, max `1.20`

**Memory**  start `638 MB`, end `718 MB`, peak `746 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
171.9 |                                                  █                             
165.7 |                  ██                              █                       █     
159.4 |                  ██                              █                       █   █ 
153.2 |                  ██                              █                       █   █ 
146.9 |            █     ██                              █                       █   █ 
140.6 |            █     ██                              █                       █   █ 
134.4 |            █     ██                        █     █                       █   █ 
128.1 |            █     ██                        █     █                       █   █ 
121.9 |            █     ██              █         █     █                       █   █ 
115.6 |     █      █     ██            █ █         █     █ █  █                  █  ███
109.3 |█ ██ ██  ██ ███ █ ██ █ █ █ █████████ ██ ███ █ █  ██ █  ██ ██ █ █ █   █ ██ ██ ███
103.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   6
   1 ms |   2
   3 ms |   11
   4 ms |   4
   6 ms |   2
   7 ms | ████████████  311
   8 ms | ████████████████████████████████████████  997
   9 ms | ██████  158
  10 ms |   1
  12 ms |   1
  13 ms | █  25
  14 ms | ██  42
  15 ms | ██  59
  16 ms | ██  62
  17 ms | ██  54
  18 ms | ██  53
  19 ms | ██  48
  20 ms | ██  52
  21 ms | █  30
  22 ms |   8
  23 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 240 | 108.1 | 20.33 |
| `smoke` | 160 | 240 | 122.2 | 21.43 |
| `sculk_charge_pop` | 240 | 240 | 106.4 | 21.06 |
| `ALL_TOGETHER` | 1680 | 240 | 109.5 | 21.20 |
| `portal` | 160 | 240 | 109.8 | 21.20 |
| `end_rod` | 240 | 240 | 113.7 | 21.52 |
| `dragon_breath` | 160 | 240 | 106.2 | 20.81 |
| `dripping_water` | 240 | 240 | 119.6 | 21.44 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `45.36`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `43.37`
- `fps_harmonic_avg` = `96.32`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `43.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `120.90`, min `44.46`, p50 `118.49`, p95 `134.73`, p99 `766.54`, 1%low `45.55`, 0.1%low `44.48`, std `120.85`

**Frame time (ms)**  avg `10.30`, p50 `8.44`, p95 `20.06`, p99 `21.41`, p99.9 `22.37`, max `22.49`

**Client tick (ms)**  avg `0.60`, p95 `0.86`, max `1.49`

**Memory**  start `715 MB`, end `531 MB`, peak `955 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
225.4 |                                                        █                       
214.2 |                                                        █                       
203.0 |                                                  █     █                       
191.8 |                                                  █     █                       
180.6 |                                                  █     █ █                     
169.3 |           █                             █        █     █ █                     
158.1 |           █          █                  █ ██     █     █ █                    █
146.9 |           █ █     █  █   █        █     █ ██     █     ███  █        █        █
135.7 |           █ █     █  █   ██       █     █ ██     █     ███  █  █     █        █
124.4 |  █    █   ███     █  █   ██       █ █   █ ██     █  █  ███  █  █     █        █
113.2 |██████ █ ██████  █ █  █  ███    █  █ ██  █ ██ █  ██ ██ ███████ ███ ██████  ██ ██
102.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  18
   1 ms |   8
   2 ms |   3
   3 ms |   10
   4 ms |   8
   5 ms |   5
   6 ms |   5
   7 ms | ██████████████  325
   8 ms | ████████████████████████████████████████  962
   9 ms | ███████  161
  12 ms |   2
  13 ms | ██  39
  14 ms | █  34
  15 ms | ██  46
  16 ms | ██  51
  17 ms | ██  51
  18 ms | ██  53
  19 ms | ██  60
  20 ms | ██  53
  21 ms | █  36
  22 ms |   10
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `44.48`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `45.55`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `3.00`
- `fps_harmonic_avg` = `97.07`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `28.57`, min `21.26`, p50 `29.50`, p95 `30.82`, p99 `47.23`, 1%low `21.46`, 0.1%low `21.26`, std `4.15`

**Frame time (ms)**  avg `35.66`, p50 `33.90`, p95 `45.19`, p99 `46.14`, p99.9 `46.86`, max `47.04`

**Client tick (ms)**  avg `0.59`, p95 `0.82`, max `1.26`

**Memory**  start `568 MB`, end `511 MB`, peak `972 MB`, GC `1 events / 2 ms`

**FPS over sampling window (ASCII):**

```
 31.3 |                                                                  █             
 30.9 |                                                                  █             
 30.4 | ██        █         █                        █     █        █    █             
 30.0 | ██        █    █   ██                        █ █   █        █    █             
 29.5 | ██        █    ██  ██              █       █ █ █   █        █    █       █     
 29.1 |███ ██   ███ █  ███ ███   █         █  █    █ █ █   █  █   █ █  ███       █   █ 
 28.6 |████████████ ██████ ███  ████       █  █ █  █ █ █   █████  █ ██████ ███   █   ██
 28.2 |████████████ ██████ ███  █████  █ █ █  █ █  █ ███ ████████ ████████ ███ █ █   ██
 27.7 |████████████████████████ ██████████ ██ █ █  █ ███ ████████ ████████ █████ █ █ ██
 27.3 |███████████████████████████████████ ████ ████ ████████████ ██████████████ ██████
 26.8 |████████████████████████████████████████ ████████████████████████████████ ██████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | █  6
  21 ms | █  6
  22 ms |   2
  27 ms |   1
  31 ms |   2
  32 ms | ███████████████████████████  115
  33 ms | ████████████████████████████████████████  170
  34 ms | ███████████████████  79
  35 ms | ████  16
  36 ms | ██  9
  37 ms | ██  9
  38 ms | ███  12
  39 ms | ████  18
  40 ms | ███  14
  41 ms | ███  14
  42 ms | █████  20
  43 ms | ███  13
  44 ms | █████  22
  45 ms | ██████  24
  46 ms | ██  8
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `21.26`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.46`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `46.00`
- `fps_harmonic_avg` = `28.04`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `28.60`, min `21.20`, p50 `29.48`, p95 `30.97`, p99 `48.58`, 1%low `21.37`, 0.1%low `21.20`, std `4.02`

**Frame time (ms)**  avg `35.59`, p50 `33.93`, p95 `45.01`, p99 `46.32`, p99.9 `47.06`, max `47.18`

**Client tick (ms)**  avg `0.64`, p95 `0.81`, max `1.13`

**Memory**  start `633 MB`, end `484 MB`, peak `977 MB`, GC `4 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 31.5 |                         █                                                      
 31.0 |                         █     █                                                
 30.6 |                  █      ██    █              █         █                  █    
 30.1 |         █       ██     ███    █              █         █       █  █       █    
 29.6 |         █       ██ █   ███    █           █  █         █      ██  █       █    
 29.2 |         █   █   ██████████    █           █  █ █  █  █ █ █    █████       █    
 28.7 |   █     ███ ██  ██████████    █   █   █   █ ████ █████ ████   █████   █  █████ 
 28.3 |█  █     ██████ ███████████    █   ██  █ █ █ ██████████ ████   █████  ██  ██████
 27.8 |█  █ ██ ███████ ████████████ ███ ████  █ █ █ ██████████ ████ █ █████ ████ ██████
 27.3 |████ ██████████ ████████████████████████ ███ ███████████████ ███████████████████
 26.9 |████ ██████████ ████████████████████████████████████████████████████████████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   2
  20 ms | █  6
  21 ms |   1
  22 ms |   2
  23 ms |   1
  31 ms | ██  8
  32 ms | ████████████████████████████  113
  33 ms | ████████████████████████████████████████  164
  34 ms | ██████████████████████  90
  35 ms | ██  10
  36 ms | ████  16
  37 ms | ██  10
  38 ms | ████  16
  39 ms | ████  17
  40 ms | ██  9
  41 ms | ████  16
  42 ms | ███  12
  43 ms | █████  19
  44 ms | █████  21
  45 ms | █████  19
  46 ms | ██  9
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `21.20`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.37`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `44.00`
- `fps_harmonic_avg` = `28.09`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `28.47`, min `19.27`, p50 `29.36`, p95 `31.03`, p99 `48.75`, 1%low `20.90`, 0.1%low `19.27`, std `5.04`

**Frame time (ms)**  avg `36.04`, p50 `34.06`, p95 `45.30`, p99 `46.53`, p99.9 `50.20`, max `51.88`

**Client tick (ms)**  avg `0.61`, p95 `0.90`, max `1.44`

**Memory**  start `600 MB`, end `613 MB`, peak `960 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |                                                   █                            
 32.2 |                         █  █                      █                            
 31.7 |                         █  █         █            █                   █        
 31.1 |              █          █  █         █            █ █                 █        
 30.6 |       █      █       █  █  █         █            █ █         █       █        
 30.0 |       ██ █   █       ██ █  █     █   █   ██       ███        ██       █        
 29.5 |       ██ █   █       ██ █  █     █   █   ██       ███        ██       █        
 28.9 |█      ██ █   █  █ █  ██ █  █     ███ █   ██     █ ███        ██       ██  █    
 28.4 |█   █ ███ ██  ██ ███  ██ █ ██  ████████ █ ███ █ ██ ███      █████  █ █ ███ █ █  
 27.8 |█ ███████ ██  ██ █████████ ██  ████████ █████ ████ ████  ████████  ███ █████ ██ 
 27.3 |█ ██████████ ████████████████  ██████████████ ████ ███████████████████ █████████
 26.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  20 ms | ████  12
  21 ms | ███  8
  22 ms |   1
  27 ms |   1
  31 ms | █  2
  32 ms | █████████████████████████████████  107
  33 ms | ████████████████████████████████████████  128
  34 ms | ██████████████████████████  83
  35 ms | █  4
  36 ms | ███  10
  37 ms | ██████  19
  38 ms | █████  15
  39 ms | ██████  19
  40 ms | ███████  23
  41 ms | ████████  25
  42 ms | ██████  18
  43 ms | ██████  19
  44 ms | ███████  22
  45 ms | ██████  20
  46 ms | █████  15
  48 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `19.27`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.90`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `66.00`
- `fps_harmonic_avg` = `27.75`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `28.61`, min `21.12`, p50 `29.54`, p95 `30.61`, p99 `48.63`, 1%low `21.40`, 0.1%low `21.12`, std `4.35`

**Frame time (ms)**  avg `35.66`, p50 `33.86`, p95 `45.22`, p99 `46.41`, p99.9 `47.12`, max `47.35`

**Client tick (ms)**  avg `0.44`, p95 `0.57`, max `0.74`

**Memory**  start `653 MB`, end `451 MB`, peak `965 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 31.7 |                                      █  █                                      
 31.0 |      █                               █  █     █               █            █   
 30.2 |      █  █                            █  ██  ███               █    █ █     █   
 29.5 |      █  █                   █        █  ██ ██████ ██    █     █    █ █  █  █   
 28.8 |   █  ██ ██     █████████████████   █ █  █████████ ██    █ ██  █ █ ██ █  ██ █   
 28.1 |█ ███ █████  █ ██████████████████ ███ ██ █████████ █████ █ ███ ███ ████  ██ █ █ 
 27.4 |██████████████ ███████████████████████████████████ ███████ ███ ███ ████ ███ ███ 
 26.6 |██████████████ ████████████████████████████████████████████████████████ ████████
 25.9 |███████████████████████████████████████████████████████████████████████ ████████
 25.2 |███████████████████████████████████████████████████████████████████████ ████████
 24.5 |███████████████████████████████████████████████████████████████████████ ████████
 23.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  10
  21 ms | █  4
  31 ms |   1
  32 ms | ███████████████████  98
  33 ms | ████████████████████████████████████████  208
  34 ms | ███████████  55
  35 ms | ██  8
  36 ms | ███  15
  37 ms | ███  18
  38 ms | ███  17
  39 ms | ███  14
  40 ms | ███  17
  41 ms | ██  10
  42 ms | ███  13
  43 ms | ███  18
  44 ms | ███  18
  45 ms | ████  22
  46 ms | ███  13
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `21.12`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.40`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `67.00`
- `fps_harmonic_avg` = `28.04`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `28.86`, min `21.25`, p50 `29.44`, p95 `30.88`, p99 `48.53`, 1%low `21.37`, 0.1%low `21.25`, std `4.67`

**Frame time (ms)**  avg `35.42`, p50 `33.96`, p95 `45.29`, p99 `46.46`, p99.9 `46.95`, max `47.06`

**Client tick (ms)**  avg `0.61`, p95 `0.86`, max `1.58`

**Memory**  start `563 MB`, end `597 MB`, peak `947 MB`, GC `3 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 32.2 |                █                                                               
 31.6 |                █                                █              █           █   
 31.0 |                █                 ██             █              █     █     █   
 30.4 |     █      █  ██ █             ████             █       █      █     █     ██  
 29.9 |     █      █  ██ ██     █      ████ █  █        █       █      █   █ ██    ██  
 29.3 | █   █ █    █  █████     █ █████████ █  █ █   █  █      ██      █  ██ ██ ██ ███ 
 28.7 |██  ████    █  █████   ███ █████████ ██ █ ██████ █    █████ ██  ██ ██ ██ ██ ████
 28.1 |███ ████  █ █  █████ █ ███ ████████████ ████████ █  █ █████ ███ ██ ██ ██ ██ ████
 27.6 |███ ████  ████████████████ █████████████████████ █ ██ ████████████ ██ ██ ███████
 27.0 |████████  ██████████████████████████████████████ █ ██ ██████████████████████████
 26.4 |██████████████████████████████████████████████████ █████████████████████████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ██  8
  21 ms | ███  10
  29 ms |   1
  31 ms |   1
  32 ms | ██████████████████████████████████  124
  33 ms | ████████████████████████████████████████  145
  34 ms | ███████████████████████████  99
  35 ms | ████  14
  36 ms | ███  10
  37 ms | ████  15
  38 ms | ████  13
  39 ms | █████  17
  40 ms | ████  15
  41 ms | ██  9
  42 ms | ████  14
  43 ms | ████  13
  44 ms | █████  18
  45 ms | ██████  22
  46 ms | ████  14
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `21.25`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.37`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `32.00`
- `fps_harmonic_avg` = `28.23`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `28.63`, min `20.69`, p50 `28.95`, p95 `45.99`, p99 `49.82`, 1%low `21.00`, 0.1%low `20.69`, std `6.44`

**Frame time (ms)**  avg `36.33`, p50 `34.55`, p95 `45.79`, p99 `46.86`, p99.9 `47.97`, max `48.33`

**Client tick (ms)**  avg `1.04`, p95 `1.24`, max `1.65`

**Memory**  start `790 MB`, end `860 MB`, peak `974 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |                                                      █                         
 32.9 |                                █               █     █                         
 32.2 |                                █               █     █                         
 31.5 |                                █               █     █                   █     
 30.9 |           █         █          █               █     █  █        █       █  █  
 30.2 |          ██         █   ██     █               █     ██ █        █       █  █  
 29.6 |     █  █ ██         ██  ██     █  █     ██     █     ██ █        ██      █  █  
 28.9 |    ██  █ ██         ██ ███   ████ ██    ██     ██ █  ██ █      █ ██      █ ██  
 28.2 | █ ████ ████  ██   █ ██ ███ ██████ ██ █  ██ ██ ███ █████ █  ████████  █ █ █████ 
 27.6 | █ ████ ████████   █ ██████ ██████ ██ ██ █████ █████████ ████████████ ███ █████ 
 26.9 |█████████████████ ██████████████████████████████████████████████████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | ██  4
  20 ms | ████  9
  21 ms | ████████  19
  22 ms | ████  8
  23 ms | █  3
  31 ms | ████  10
  32 ms | ████████████████████████████████████████  91
  33 ms | ██████████████████████████████████  78
  34 ms | ████████████████████████████████  72
  35 ms | ██████  13
  36 ms | ██████  13
  37 ms | ████  8
  38 ms | ███████  16
  39 ms | ██████████  23
  40 ms | ██████████████  31
  41 ms | ████████  19
  42 ms | ████████  18
  43 ms | ██████████  22
  44 ms | ███████████████  34
  45 ms | ███████████████  33
  46 ms | ████████  18
  47 ms | ██  5
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `20.69`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.00`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `29.00`
- `fps_harmonic_avg` = `27.53`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `28.96`, min `20.47`, p50 `27.72`, p95 `45.37`, p99 `52.92`, 1%low `20.57`, 0.1%low `20.47`, std `6.63`

**Frame time (ms)**  avg `35.98`, p50 `36.08`, p95 `46.07`, p99 `48.49`, p99.9 `48.71`, max `48.85`

**Client tick (ms)**  avg `2.82`, p95 `3.50`, max `8.48`

**Memory**  start `627 MB`, end `599 MB`, peak `1003 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 34.6 |                                          █                                     
 33.8 |                                          █                                     
 32.9 |                █ █                       █  █                   █     █        
 32.1 |█       █       █ █         █ █           █  █    █              █     █        
 31.2 |█ █     █       █ █         █ █           █  █ █  █              █     █        
 30.4 |█ ██    █       █ █   ██    █ █      █    ██ █ █  ██        █    █ █   █       █
 29.6 |█ ██    █   █ █ █ █   ██ █  █ █      █    ██ █ █  ███       █ █  █ █   █       █
 28.7 |█ ██ █  ██  █████ █   ██ █  █ ████ ████   ██ █ █ ████    █ ██ █  █ ██ ████ █   █
 27.9 |██████  █████████ ██████ ████ █████████ █ ██ █ █ █████ █████████ ████ ████ █ ███
 27.0 |█████████████████ ████████████████████████████ █████████████████ ███████████████
 26.2 |██████████████████████████████████████████████ █████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms | ███  6
  19 ms | ████  9
  20 ms | ███  7
  21 ms | ██  5
  22 ms | ███  6
  23 ms | ███  6
  24 ms | █  2
  25 ms |   1
  29 ms | ███  6
  30 ms | █████████████████████████████████████  78
  31 ms | █████  11
  32 ms | █████  11
  33 ms | ██████████████████████████████████████  80
  34 ms | ███████  15
  35 ms | ███████████  24
  36 ms | ████████████████████████████████████████  85
  37 ms | ██████  12
  38 ms | ████████  18
  39 ms | ██████████  21
  40 ms | ███████  14
  41 ms | ███████  14
  42 ms | ████████  17
  43 ms | █████████  20
  44 ms | ███████████████  32
  45 ms | ████████████  25
  46 ms | ██████  12
  47 ms | ████  9
  48 ms | ████  9
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `20.47`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.57`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `69.00`
- `fps_harmonic_avg` = `27.79`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `29.47`, min `19.50`, p50 `27.82`, p95 `46.83`, p99 `54.91`, 1%low `20.06`, 0.1%low `19.50`, std `7.27`

**Frame time (ms)**  avg `35.59`, p50 `35.94`, p95 `46.38`, p99 `49.18`, p99.9 `50.59`, max `51.27`

**Client tick (ms)**  avg `3.56`, p95 `4.85`, max `8.38`

**Memory**  start `898 MB`, end `816 MB`, peak `1013 MB`, GC `10 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                                 █                                        █     
 32.3 |           █                     █                     █  █ █             █   █ 
 31.7 |           █     █          █    █                     █  █ █             █  ██ 
 31.1 | █      █  █     █          █    █   █    █ █ █   █  █ █  █ █ █           █  ██ 
 30.5 | █ █    █  █     █          █    █   █ ██ █ █ █   ████ █ ██ ███   █       █  ██ 
 29.9 |██ █    █  ██    █       █  █ █  █   █ ██████ █   ██████ ██████   ██ █  █ ██ ██ 
 29.3 |██ █    █  ██    ██      █  █ █  █  ██ ████████   ██████ ██████ █ ████  █ █████ 
 28.7 |██ █ █  ██ ████ ████  █  ██ █ ████ ██████████████ ██████ █████████████  █ █████ 
 28.0 |██ █ ██ ███████ ████  ██ ██ █ ███████████████████ ██████ █████████████  ███████ 
 27.4 |██ █ ██ ███████ ████ ██████ ███████████████████████████████████████████████████ 
 26.8 |███████ ███████ ████████████████████████████████████████████████████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | ████  5
  18 ms | ████  6
  19 ms | ██████  8
  20 ms | ████  6
  21 ms | ████  5
  22 ms | ██████  8
  23 ms | ████  6
  24 ms | █████  7
  25 ms | ███  4
  26 ms | █  2
  27 ms | █  2
  28 ms | ████████████  17
  29 ms | ██████████████████████  30
  30 ms | █████████████████████  29
  31 ms | ███████████████  20
  32 ms | ██████████████  19
  33 ms | ████████████████████████████████████████  55
  34 ms | █████████████  18
  35 ms | ███████████████████████████  37
  36 ms | ████████████████████████████  39
  37 ms | ██████████████████████████████████  47
  38 ms | █████████████  18
  39 ms | ███████████████  20
  40 ms | █████████  12
  41 ms | ████████████████████  27
  42 ms | █████████████████  23
  43 ms | █████████████  18
  44 ms | █████████████████  23
  45 ms | ████████████  16
  46 ms | █████████  12
  47 ms | ████  6
  48 ms | ███████  9
  49 ms | ████  5
  50 ms | █  1
  51 ms | █  1
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
- `fps_1pct_low` = `20.06`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `28.10`
- `preload_duration_ms` = `51.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.50`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `28.92`, min `19.57`, p50 `29.53`, p95 `31.48`, p99 `49.44`, 1%low `20.83`, 0.1%low `19.57`, std `4.97`

**Frame time (ms)**  avg `35.44`, p50 `33.87`, p95 `45.51`, p99 `46.95`, p99.9 `49.20`, max `51.11`

**Client tick (ms)**  avg `0.87`, p95 `1.08`, max `1.54`

**Memory**  start `1009 MB`, end `571 MB`, peak `1025 MB`, GC `5 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 32.2 |                             █                                       █          
 31.6 |                             █                                       █          
 31.1 |          █     █ █          █                                 █     █        █ 
 30.6 |    █     █     █ ██         █        █                        █ █   █      █ █ 
 30.1 |    █   █ █   █ █ ██         █        █                  █     █ █  ██   █  █ █ 
 29.6 |    █ █ █ █   █ █ ██       █ █        ██      █          █  █  █ █  ██ █ █  ███ 
 29.1 | ████████ █ ███ ████       █ █   █    ██     █████    ██ █  █  █ █ ███ ████████ 
 28.6 | ████████ █ ███ █████ █  ███ █   █   ████  █ █████ █  ██ ██ █ ██ ██████████████ 
 28.0 |█████████ █████ █████ █ ████ █  ██ █ ████  █ █████ █ ██████ █ ██ ███████████████
 27.5 |█████████ ███████████ █████████ ████ ████ ██ █████ █████████████████████████████
 27.0 |█████████████████████ █████████ ████ █████████████ █████████████████████████████
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  3
  20 ms | ███  12
  21 ms | ██  8
  28 ms |   1
  31 ms | ██  7
  32 ms | ███████████████████████████  117
  33 ms | ████████████████████████████████████████  176
  34 ms | ███████████████  67
  35 ms | ███  11
  36 ms | ██  8
  37 ms | ███  12
  38 ms | ███  13
  39 ms | ███  13
  40 ms | ███  15
  41 ms | ███  12
  42 ms | ███  14
  43 ms | ███  14
  44 ms | █████  20
  45 ms | ██████  27
  46 ms | ██  8
  47 ms | █  5
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.57`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `28.22`
- `fps_1pct_low` = `20.83`
- `preload_duration_ms` = `35.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `28.93`, min `21.19`, p50 `29.69`, p95 `30.81`, p99 `47.72`, 1%low `21.43`, 0.1%low `21.19`, std `4.74`

**Frame time (ms)**  avg `35.37`, p50 `33.69`, p95 `45.43`, p99 `46.45`, p99.9 `46.89`, max `47.19`

**Client tick (ms)**  avg `0.43`, p95 `0.55`, max `0.64`

**Memory**  start `767 MB`, end `544 MB`, peak `1006 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 31.7 |                                          █                                     
 31.2 |                                        █ █                                     
 30.8 |      █                                 █ █                 █                 █ 
 30.3 |  █   █        █                        █ █    ██ █      ██ █             █   ██
 29.9 |  ██ ██     █  █          █          █  █ █   ███ █      ██ █         █   █   ██
 29.4 |  ██ ██     █  █     █    █    █ █ █ █  █ █   ███ █   █  █████        █   █   ██
 28.9 |  ██ ███  ███ ██    ███   █    █████ █ ██ ██████████  █ ██████ █ █ █  ██  █   ██
 28.5 |█ ██ ████████████   ████ ██    █████ █ ██ █████████████ ████████ █ █ ███  █   ██
 28.0 |█ ██ ████████████  █████ ███ █ ████████████████████████ ████████ █ ██████ █ █ ██
 27.6 |█ ███████████████ ██████ ███ ████████████████████████████████████████████████ ██
 27.1 |█ ██████████████████████ ███████████████████████████████████████████████████████
 26.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  7
  21 ms | ██  11
  22 ms | █  4
  27 ms |   2
  31 ms |   1
  32 ms | ██████████████  84
  33 ms | ████████████████████████████████████████  238
  34 ms | █████████  52
  35 ms | ██  9
  36 ms | █  8
  37 ms | ██  13
  38 ms | ██  13
  39 ms | ██  12
  40 ms | ██  9
  41 ms | ███  16
  42 ms | ██  12
  43 ms | ███  15
  44 ms | ████  21
  45 ms | ████  24
  46 ms | ██  12
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `doors_placed` = `16.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `21.43`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `28.27`
- `preload_duration_ms` = `109.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `21.19`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `29.28`, min `20.07`, p50 `27.73`, p95 `48.96`, p99 `53.69`, 1%low `20.35`, 0.1%low `20.07`, std `7.52`

**Frame time (ms)**  avg `35.95`, p50 `36.07`, p95 `46.54`, p99 `48.57`, p99.9 `49.50`, max `49.84`

**Client tick (ms)**  avg `3.42`, p95 `5.35`, max `8.32`

**Memory**  start `769 MB`, end `643 MB`, peak `1070 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                                           █                         █ █  █     
 33.2 | █              █                          █                         █ █  █     
 32.4 | █              █                          █                         █ █  █     
 31.6 | █              █   █             █        █       █ █               █ █  █   █ 
 30.9 | █ █    ██   ██ █ █ █     █       █     █  █       █ █  █         █  █ █  █   █ 
 30.1 | █ ██   ██  ███ █ █ ██ █ ██       ██    █  █ █     █ ██ █      █  █  █ █  █   █ 
 29.3 | ████  ███  ███ █ █ ██ █ ██     █ ██    ██ █ █     ██████      ██ ████ ██ █   █ 
 28.5 | █████ ███ ████ █ ████ █ ██ █ █ █ ██    ████ ██    ██████ █  ████ ███████ █  ██ 
 27.7 |██████████ ██████ ████ ██████████ ███ ██████ ██ ███████████  ████ ███████ ██ ███
 26.9 |█████████████████ ████ █████████████████████████████████████████████████████████
 26.2 |█████████████████ ██████████████████████████████████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | █  2
  18 ms | ██████  10
  19 ms | ████  7
  20 ms | ███████  12
  21 ms | ███  5
  22 ms | ███  5
  23 ms | ██  3
  24 ms | ██████  9
  25 ms | █  2
  26 ms | █  2
  27 ms | █  1
  28 ms | █████  8
  29 ms | ████████████  19
  30 ms | ███████████████████████████  44
  31 ms | ███████████████  25
  32 ms | ████████  13
  33 ms | ████████████████████████████████████████  65
  34 ms | ██████  10
  35 ms | ██████████████████  30
  36 ms | ████████████████████████████████  52
  37 ms | ████████████  19
  38 ms | ███████  12
  39 ms | ██████████████  22
  40 ms | ███████████  18
  41 ms | ██████████████  23
  42 ms | ███████████████  24
  43 ms | ██████████████  22
  44 ms | ██████████████████  29
  45 ms | ████████████████  26
  46 ms | ██████████  16
  47 ms | ██████  10
  48 ms | ████  7
  49 ms | ██  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.10`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.35`
- `fps_harmonic_avg` = `27.82`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `94.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `20.07`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `29.20`, min `19.92`, p50 `28.61`, p95 `46.23`, p99 `53.60`, 1%low `20.27`, 0.1%low `19.92`, std `6.54`

**Frame time (ms)**  avg `35.64`, p50 `34.95`, p95 `46.44`, p99 `48.55`, p99.9 `50.16`, max `50.20`

**Client tick (ms)**  avg `2.39`, p95 `4.27`, max `5.51`

**Memory**  start `797 MB`, end `739 MB`, peak `1162 MB`, GC `2 events / 5 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |                                                                   █        █   
 32.3 |    ██                                                █          █ █        █   
 31.5 |   ███ █            █              █    █     █       █          █ █        █   
 30.8 |   ███ █  █     █   █ █    ██      ██   █     █     █ █ █ █  █   █ █        █   
 30.0 | █ ███ ██ █  █  █   ████ █ ███     ██ █ █     █  █  █ ███ █  ██  █ █        █   
 29.2 |██ ███ ██ █  █  █   ██████ ███     ██ █ █ █  ███ █ ██ ███ █  ██  █ ██   █   ██  
 28.4 |███████████  █  █ █ ██████ ███ ███ ██ █ ██████████ ██ ███ █████  █ ██   █   ████
 27.6 |███████████ █████ ████████████ ████████████████████████████████  ██████ ████████
 26.8 |████████████████████████████████████████████████████████████████ ██████ ████████
 26.0 |███████████████████████████████████████████████████████████████████████ ████████
 25.2 |███████████████████████████████████████████████████████████████████████ ████████
 24.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | █  1
  18 ms | ███  5
  19 ms | ███  6
  20 ms | ████  8
  21 ms | █████  10
  22 ms | ██  3
  23 ms | ████  7
  27 ms | █  2
  28 ms | ███  6
  29 ms | ████  7
  30 ms | ██████████  19
  31 ms | ██████████████████████████████████  65
  32 ms | ███████████████████  36
  33 ms | ████████████████████████████████████████  76
  34 ms | █████████████████  32
  35 ms | ██████████████████████████████████  64
  36 ms | ███████████████  28
  37 ms | ██████  11
  38 ms | ██████  12
  39 ms | █████████  18
  40 ms | ████████  16
  41 ms | █████  10
  42 ms | ██████████  19
  43 ms | █████████████  24
  44 ms | ███████████  21
  45 ms | █████████  18
  46 ms | ███████  14
  47 ms | ███████  13
  48 ms | ███  5
  49 ms | █  2
  50 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.98`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.27`
- `fps_harmonic_avg` = `28.06`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `33.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.92`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `148.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `35.57`, min `13.02`, p50 `26.34`, p95 `86.67`, p99 `130.57`, 1%low `14.88`, 0.1%low `13.02`, std `24.66`

**Frame time (ms)**  avg `35.95`, p50 `37.96`, p95 `57.55`, p99 `62.01`, p99.9 `72.55`, max `76.79`

**Client tick (ms)**  avg `13.84`, p95 `19.40`, max `26.11`

**Memory**  start `1087 MB`, end `426 MB`, peak `1199 MB`, GC `29 events / 98 ms`

**FPS over sampling window (ASCII):**

```
 62.8 |                       █                                                        
 59.5 |                     █ █   █                                                    
 56.1 |          █          █ █   █                                                    
 52.8 |█         █          █ █   █                      █                             
 49.5 |█         █     █    █ █   █                      █                             
 46.1 |█       █ █     █    █ █   █                      █                             
 42.8 |█       █ █     █    █ █   █           █          █  █  █       █  █    █    █  
 39.4 |█ ██ █  █ █  █  █    █ █   █ █ █     █ ██  █   █  █  █  █     █ █  █ █  █    █  
 36.1 |█ ████  █ █  █  █    ████  ██████ █  ████ ██   █ ██  █  █    ██ █  █ █  █ █  █  
 32.7 |█ ████  █ █  █  ██   ████  █████████ ████ ███ ██ █████  █ ██ ██ ███████ ████ █  
 29.4 |██████ ████████ █████████████████████████████████████████ █████████████ ████████
 26.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | ████  3
   6 ms | ███  2
   7 ms | ███  2
   8 ms | █████████  6
   9 ms | ██████  4
  10 ms | ████████████  8
  11 ms | ██████████  7
  12 ms | ███████  5
  13 ms | ████████████  8
  14 ms | ██████████  7
  15 ms | ██████  4
  16 ms | ████████████  8
  17 ms | ███████  5
  18 ms | ██████  4
  19 ms | ███████████████  10
  20 ms | ████████████████  11
  21 ms | ██████████████████  12
  22 ms | ███████████████  10
  23 ms | ███████████████  10
  24 ms | ███████████████████  13
  25 ms | █████████████  9
  26 ms | ███████  5
  27 ms | █████████████  9
  28 ms | ██████████████████  12
  29 ms | ███████████████████  13
  30 ms | ██████████  7
  31 ms | ██████████████████████  15
  32 ms | ██████  4
  33 ms | ███████████████  10
  34 ms | ███████████████  10
  35 ms | ████████████████████████████  19
  36 ms | ██████████████████  12
  37 ms | ██████████████████████  15
  38 ms | █████████████████████████████████  22
  39 ms | ████████████████████████████████████████  27
  40 ms | ██████████████████████  15
  41 ms | █████████████████████  14
  42 ms | ██████████████████  12
  43 ms | ████████████████████████████  19
  44 ms | ████████████████  11
  45 ms | ████████████████████████  16
  46 ms | ███████████████████████████  18
  47 ms | █████████████████████████  17
  48 ms | █████████████  9
  49 ms | ████████████  8
  50 ms | ██████  4
  51 ms | ██████████████████████  15
  52 ms | ██████████  7
  53 ms | ████████████  8
  54 ms | █████████████  9
  55 ms | ███████████████  10
  56 ms | ██████  4
  57 ms | ██████████  7
  58 ms | ██████████  7
  59 ms | ██████████  7
  60 ms | ████  3
  61 ms | ███  2
  62 ms | █  1
  64 ms | ███  2
  66 ms | █  1
  69 ms | █  1
  76 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `14.88`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4823.07`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `13.02`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.82`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `22654.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23072 ms  |  Sample ticks: 400

**FPS**  avg `35.19`, min `13.97`, p50 `25.89`, p95 `94.09`, p99 `128.79`, 1%low `14.64`, 0.1%low `13.97`, std `24.27`

**Frame time (ms)**  avg `36.46`, p50 `38.62`, p95 `58.10`, p99 `64.20`, p99.9 `70.07`, max `71.57`

**Client tick (ms)**  avg `14.35`, p95 `19.80`, max `25.30`

**Memory**  start `843 MB`, end `993 MB`, peak `1205 MB`, GC `26 events / 91 ms`

**FPS over sampling window (ASCII):**

```
 58.4 |                                                  █                             
 55.2 |                                                  █                             
 51.9 |            █          █                          █                             
 48.7 |       █    █ █        █                          █                             
 45.4 |       ███  █ █  █     █      █  █              █ █      ██             █    █  
 42.2 |       ███  █ ██ █     █      █  █        █     █ █      ███  █    █ █  █ █  █  
 39.0 | ██    ███  █ ██ █  █  █ █    █  █    █ █ █     █ █   █ ████  █ █  █ █  █ █  █  
 35.7 | ██ ██ ███  █ ██ █  ██ █ █    █  █ █  █ █ █   █ █ ██ ██ ████  ████ █ ██ █ █  █  
 32.5 | █████ ██████ ██ █  ███████ █ ██ █ ██ █ █ ███ █ █ ██ ██ ████  ████ █ ████ █  █  
 29.2 |█████████████████████████████ █████████ █ ███ █ █ ██ ███████  ███████████ ████ █
 26.0 |█████████████████████████████ █████████████████ ████████████████████████████████
 22.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | ██  1
   6 ms | ██  1
   7 ms | ██████████  5
   8 ms | ██████████████████  9
   9 ms | ████████████  6
  10 ms | ██████████████████████████  13
  11 ms | ██  1
  12 ms | ██████████████  7
  13 ms | ██  1
  14 ms | ████████  4
  15 ms | ██████████████  7
  16 ms | ██████  3
  17 ms | ████  2
  18 ms | ██████████████████████  11
  19 ms | ██████████████████████  11
  20 ms | ██████████████████  9
  21 ms | ██████████  5
  22 ms | ██████████████████  9
  23 ms | ██████████████████  9
  24 ms | ████████████████████  10
  25 ms | ████████████████████████████  14
  26 ms | ██████████████████  9
  27 ms | ██████████████  7
  28 ms | ██████████████████  9
  29 ms | ██████████████████  9
  30 ms | ████████████████████  10
  31 ms | ████████████████████  10
  32 ms | ████████████████████████  12
  33 ms | ████████████████████████████████████████  20
  34 ms | ██████████████████████  11
  35 ms | ████████████  6
  36 ms | ████████████████████  10
  37 ms | ██████████████████████████████  15
  38 ms | ██████████████████████████████████  17
  39 ms | ████████████████████████████████████████  20
  40 ms | ██████████████████████████████████  17
  41 ms | ████████████████████████████████████  18
  42 ms | ██████████████████████████████████  17
  43 ms | ████████████████████████████████████████  20
  44 ms | ████████████████████████████████████████  20
  45 ms | ████████████████████████  12
  46 ms | ████████████████████████  12
  47 ms | ██████████████████████████████████  17
  48 ms | ██████████████████████████  13
  49 ms | ██████████████████████████  13
  50 ms | ████████████  6
  51 ms | ██████████████████  9
  52 ms | ██████████████████  9
  53 ms | ████████  4
  54 ms | ████████  4
  55 ms | ██████████████  7
  56 ms | ████████████████  8
  57 ms | ██████████████████  9
  58 ms | ████████████████████████  12
  59 ms | ████  2
  60 ms | ██████████████  7
  62 ms | ██████  3
  65 ms | ████  2
  66 ms | ██  1
  68 ms | ████  2
  71 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `14.64`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4798.03`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `13.97`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.43`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `28176.00`
- `preload_duration_ms` = `61.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `28.66`, min `20.32`, p50 `28.45`, p95 `43.98`, p99 `50.50`, 1%low `20.78`, 0.1%low `20.32`, std `5.97`

**Frame time (ms)**  avg `36.12`, p50 `35.15`, p95 `45.91`, p99 `47.50`, p99.9 `48.74`, max `49.21`

**Client tick (ms)**  avg `1.75`, p95 `2.41`, max `3.25`

**Memory**  start `445 MB`, end `634 MB`, peak `1204 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                   █                                                            
 32.5 |                   █                                       █                    
 31.9 |                   █                                       █                    
 31.3 |     █     █  █    █       █              █           █    █                    
 30.7 |     █   █ █  ██   █       █    █         █ █         █    █       █            
 30.1 |   █ █  ██ ██ ██   █       █    █ █     █ █ ██        █    █    █  █  █         
 29.5 |   █ █  ██ ██ ██   █       █  █ █ █  █  █ █ ██        █    █    █  ████         
 28.9 |   █ █  ██ ██ ██   █  █    █  █ ███████ ███ ██        █ █  █    █  █████       █
 28.3 |  ██ █  ██ █████  ███ ███  █ ██ ██████████████   ██   █ █████ █ █  █████    ████
 27.7 | ██████ ██ █████  ███ ███  ████ ███████████████ ███   █ █████ ███  █████   █████
 27.1 |███████ ████████  ███ ████ ██████████████████████████ ████████████ ██████ ██████
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | ██  5
  20 ms | ████  9
  21 ms | ███  8
  22 ms | ██  6
  23 ms | ██  6
  27 ms |   1
  30 ms | ███  8
  31 ms | ███████████████████████████  66
  32 ms | █████████████  31
  33 ms | ████████████████████████████████████████  98
  34 ms | ████████████  29
  35 ms | ███████████████████████████  65
  36 ms | █████  12
  37 ms | █████  12
  38 ms | ██████  15
  39 ms | ██████  14
  40 ms | █████████  22
  41 ms | █████████  22
  42 ms | █████████  23
  43 ms | ███████████  27
  44 ms | ███████████  27
  45 ms | ███████  18
  46 ms | ███████  17
  47 ms | ███  8
  48 ms | █  2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `part` = `1.00`
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
- `fps_0p1pct_low` = `20.32`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.68`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3087.00`
- `preload_duration_ms` = `52.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `28.93`, min `20.35`, p50 `28.72`, p95 `43.66`, p99 `50.65`, 1%low `20.79`, 0.1%low `20.35`, std `5.70`

**Frame time (ms)**  avg `35.67`, p50 `34.82`, p95 `45.73`, p99 `47.37`, p99.9 `48.98`, max `49.13`

**Client tick (ms)**  avg `1.73`, p95 `2.37`, max `5.02`

**Memory**  start `942 MB`, end `1116 MB`, peak `1206 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 32.9 |                                          █                                     
 32.3 |                                          █ █                 █                 
 31.7 |                                    █     █ █                 █                 
 31.1 |             █   █        ██  █     █     █ █  █             ██  █              
 30.4 |    █ █      █   █    █   ██  █ █   █     █ █  █       █    ███  █              
 29.8 |    █ █ █    █   █    █ █ ██  █ ██  █   █ █ █  █       █   ████  █         █    
 29.2 |   ██ █ █  █ █   █  ███ █ ██ ██ ██  █   █ █ █ ██     ███████████ █ █       █    
 28.6 |  ███ █ █  █ ██  ██ █████ ██ █████  █ █ █ █ █ ██ █ ██████████████████  ██  █  █ 
 28.0 |█████ █ ██ █████ ██ █████ ███████████ █████ ████ ████████████████████  ███ █ ███
 27.4 |██████████ █████ ██ █████████████████ █████ ████ ████████████████████  █████ ███
 26.8 |██████████ █████ ████████████████████████████████████████████████████  █████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | ██  4
  20 ms | ███  8
  21 ms | ███  8
  22 ms | ███  8
  23 ms | █  2
  24 ms | █  2
  29 ms |   1
  30 ms | ████  9
  31 ms | ████████████████████████████████  77
  32 ms | ███████████████  35
  33 ms | ████████████████████████████████████████  95
  34 ms | ██████████████  33
  35 ms | ████████████████████████████████████  86
  36 ms | █████  12
  37 ms | ████  10
  38 ms | █████████  21
  39 ms | ███████  17
  40 ms | ██████  14
  41 ms | █████  13
  42 ms | █████  13
  43 ms | ██████  14
  44 ms | █████████████  32
  45 ms | ███████████  25
  46 ms | ████  9
  47 ms | ███  7
  48 ms | █  2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.79`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.12`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.35`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `28.03`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3234.00`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `26.90`, min `8.74`, p50 `29.38`, p95 `30.74`, p99 `48.43`, 1%low `8.89`, 0.1%low `n/a`, std `7.06`

**Frame time (ms)**  avg `41.66`, p50 `34.04`, p95 `100.08`, p99 `109.86`, p99.9 `114.05`, max `114.46`

**Client tick (ms)**  avg `0.57`, p95 `0.71`, max `1.67`

**Memory**  start `1178 MB`, end `907 MB`, peak `1194 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 35.4 |                                           █                                    
 34.3 |                                           █                                    
 33.3 |                                           █                                    
 32.2 |     █       █            █   █            █                                    
 31.1 |     █       █     █      █   █            █         ██        █  █    █        
 30.1 |     █       █     ██  █  █   █            █         ██        █  █    █  █     
 29.0 |  ██ ██     ███    ██  █  █   █     ███ ██ ██  ██    ███       █  ██  ██  █    █
 28.0 | ███ ██ ███████ █ ████ █  ███ ██ ██ ██████ ███ █████████████ █ █  ███ ██████████
 26.9 |██████████████████████ ██ ███ ████████████ ███████████████████ ██ ███ ██████████
 25.8 |██████████████████████████████████████████████████████████████ ██████ ██████████
 24.8 |█████████████████████████████████████████████████████████████████████ ██████████
 23.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ██  6
  21 ms | ███  9
  22 ms |   1
  32 ms | ████████████████████  71
  33 ms | ████████████████████████████████████████  142
  34 ms | ████████████  43
  35 ms | █  5
  36 ms | ██  8
  37 ms | ███  10
  38 ms | █████  17
  39 ms | ████  15
  40 ms | ████  15
  41 ms | ████  14
  42 ms | █████  19
  43 ms | ████  13
  44 ms | ████  15
  45 ms | ███████  26
  46 ms | █  5
  47 ms |   1
  48 ms |   1
  97 ms |   1
  98 ms |   1
  99 ms | ███  11
 100 ms | █████  18
 101 ms |   1
 107 ms |   1
 108 ms |   1
 109 ms | █  2
 110 ms |   1
 111 ms |   1
 112 ms |   1
 113 ms |   1
 114 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `45.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `n/a`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `24.00`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.89`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.84`, p50 `9.98`, p95 `10.14`, p99 `10.91`, 1%low `8.84`, 0.1%low `n/a`, std `0.37`

**Frame time (ms)**  avg `101.79`, p50 `100.23`, p95 `110.35`, p99 `112.72`, p99.9 `113.09`, max `113.10`

**Client tick (ms)**  avg `0.30`, p95 `0.54`, max `1.76`

**Memory**  start `965 MB`, end `1077 MB`, peak `1077 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                                     █          
 10.4 |                                                                     █          
 10.3 |                                                                     █          
 10.2 |                                                                     █          
 10.1 |                                                                     █          
 10.0 |██ █ ██ █ ██ █ █   ██   ██  ███   ██  ██ █ ██   █  █  █ █   ██ █ ██  ███  ██  ██
  9.9 |██ ████ █ ██ █ █ █ ██ ████  ███ █ ██  ██ █ ██  ██ ███ █ ██  ██ █ ██  ███  ██  ██
  9.8 |██ ████ █ ██ █ █ █ ██ ████  ███ █ ██  ██ █ ███ ██ ███ █ ██  ██ █ ██  ███  ██  ██
  9.7 |█████████ ██ █ ███ ██ ████  ███ ████  ████ ███ ██ █████ ██ ███ █ ███ ███ ███  ██
  9.6 |██████████████████ ██ ███████████████ ████ ███ ██ ████████ █████████ ███ ████ ██
  9.5 |████████████████████████████████████████████████████████████████████████ ████ ██
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms |   1
  91 ms | █  2
  98 ms | █████  12
  99 ms | █████████████████  37
 100 ms | ████████████████████████████████████████  89
 101 ms | ██████  13
 102 ms |   1
 103 ms |   1
 105 ms | ███  6
 106 ms | █  2
 107 ms | ███  7
 108 ms | ███  6
 109 ms | ███  6
 110 ms | ██  5
 111 ms | ██  4
 112 ms | █  2
 113 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.82`
- `fps_1pct_low` = `8.84`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.78`, p50 `9.98`, p95 `10.42`, p99 `11.00`, 1%low `8.79`, 0.1%low `n/a`, std `0.45`

**Frame time (ms)**  avg `101.76`, p50 `100.22`, p95 `112.14`, p99 `113.65`, p99.9 `113.87`, max `113.92`

**Client tick (ms)**  avg `0.25`, p95 `0.30`, max `1.63`

**Memory**  start `715 MB`, end `772 MB`, peak `1171 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                         █                                             █ █      
 10.4 |█                        █                                             █ █      
 10.3 |█                        █          █                                  █ █      
 10.2 |█                        █          █                                  █ █      
 10.1 |█                        █          █             █                    █ █      
 10.0 |█  █ █ █ █ ██   █   █  █ ██   █ ██  ██     █ █  █ █  █ █ █  █    █     █ █  █ ██
  9.9 |█ ██ █ █ █ ██ █ █ █ █ ██ ██ █ █ ██  ██ █ █ █ ██ ████ █ █ █ ██ █ ██ █ █ █ ██ █ ██
  9.8 |█ ██ █ █ █ ██ █ █ █ █ ██ ██ █ █ ██  ██ █ █ █ ███████ █ █ █ ██ ████ █ █ █ ██ █ ██
  9.7 |█ ██ █ █ ████ ███ ██████ ██████ ██  ██ █ █ █ ███████ █ █ █ ███████ █ █ █ ██ █ ██
  9.6 |████ ███████████████████ ██████ ██  ████ █ █ ███████ █ █ █████████ ███ █ ██ ████
  9.5 |████ ███████████████████ ███████████████████ █████████ █████████████████ ███████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms | █  1
  90 ms | ██  2
  91 ms | ██  2
  92 ms | █  1
  93 ms | ███  3
  95 ms | █  1
  96 ms | ██  2
  98 ms | ██████████████████  20
  99 ms | █████████████████████████████████████  42
 100 ms | ████████████████████████████████████████  45
 101 ms | ████████████████████████████████  36
 106 ms | ████  5
 107 ms | ███  3
 108 ms | ████  5
 109 ms | ████  4
 110 ms | ███████  8
 111 ms | ████  5
 112 ms | █████  6
 113 ms | ████  5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `8.79`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `4019.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.76`, p50 `9.93`, p95 `10.40`, p99 `10.79`, 1%low `8.79`, 0.1%low `n/a`, std `0.44`

**Frame time (ms)**  avg `101.73`, p50 `100.68`, p95 `111.83`, p99 `113.30`, p99.9 `113.95`, max `114.11`

**Client tick (ms)**  avg `0.29`, p95 `0.60`, max `1.88`

**Memory**  start `1007 MB`, end `715 MB`, peak `1215 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                █                               
 10.6 |                                                █                               
 10.4 |                                                █                               
 10.3 |   █    █        █                              █                               
 10.2 |   █    █        █                              █                               
 10.1 |   █    ██ █  █  ██ █ █         █ █    ██     █ █                 █  █ █ █      
 10.0 |█  ██ █ ██ █  █  ██ █ ██ █ █ █ ██ █ █  ███ █ ██ ██ █ █ ██ █ █ █ █ █ ██ █ ██   █ 
  9.8 |█  ██ █ ██ █ ██  ██ █ ██ █ █ ████ █ █  ███ ████ ██ ███ ██ █ ███ █ █ ██ █ ██ █ █ 
  9.7 |██ ██ █ ████ ██  ██ █ ████ █ ████ █ █ ████ ████ ██ ███ ████ ███ █ █ ██ █████████
  9.6 |██ ████ ████ ██ ███ █████████████ █████████████ ███████████████ █ █ ██ █████████
  9.5 |███████ ███████████ █████████████ ████████████████████████████████████ █████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  91 ms | █  1
  92 ms | █  2
  93 ms | ██  3
  94 ms | ██  3
  96 ms | █  1
  97 ms | ████  5
  98 ms | ████████████████  21
  99 ms | ███████████████████████████  36
 100 ms | ████████████████████████████████████████  54
 101 ms | ████████████████  21
 102 ms | ████  5
 103 ms | █  2
 104 ms | █  1
 105 ms | ██  3
 106 ms | ███  4
 107 ms | ████  5
 108 ms | █  2
 109 ms | ███████  9
 110 ms | ██  3
 111 ms | ████  5
 112 ms | ███  4
 113 ms | ███  4
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `n/a`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.83`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `8.79`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `8.84`, p50 `9.98`, p95 `10.15`, p99 `10.87`, 1%low `8.85`, 0.1%low `n/a`, std `0.41`

**Frame time (ms)**  avg `101.64`, p50 `100.16`, p95 `112.02`, p99 `112.77`, p99.9 `113.06`, max `113.07`

**Client tick (ms)**  avg `0.27`, p95 `0.36`, max `1.67`

**Memory**  start `918 MB`, end `1038 MB`, peak `1038 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                        █                                       
 10.3 |         █                              █                                       
 10.2 |         █                              █                                       
 10.2 |         █                              █                                       
 10.1 |█    █   ██    █         █    █      █  █    █    █    █    █    █ █  █         
 10.0 |██ █ ██  ██ █ ██  ██  ██ █ ██ ████  ██  ███  ██ █ ██ ████ █ ██ █ █ █ ██ █ █ █ █ 
  9.9 |██ █ ██  ██ █ ██  ██  ██ █ ██ ████ ███  ███ ███ █ ██ ████ █ ██ █ █ █ ██ █ █ █ █ 
  9.8 |████ ███ ██ █ ███ ██  ██ █ ██ ████ ███  ███ ███ █ ███████ ████ █ █ █ ██ █ █ ███ 
  9.7 |████████ ██ █ ███ ██  ██ █ ██ ████████  ███ ███ █ ███████ ██████ ███ ████ █ ███ 
  9.6 |████████ ██ █████ ███ ███████ █████████ ███ █████ ██████████████ ████████ █████ 
  9.5 |████████ ████████████ █████████████████ █████████ ██████████████ ████████ █████ 
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   1
  91 ms | █  2
  92 ms | █  2
  93 ms | █  3
  95 ms |   1
  98 ms | ████  10
  99 ms | ████████████  28
 100 ms | ████████████████████████████████████████  96
 101 ms | █████  13
 104 ms | ██  4
 105 ms | ██  5
 106 ms |   1
 107 ms | █  2
 108 ms | ██  4
 109 ms | ███  6
 110 ms | █  3
 111 ms | ██  4
 112 ms | ████  10
 113 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `8.85`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `9.84`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.21`, p50 `9.94`, p95 `10.70`, p99 `11.16`, 1%low `8.37`, 0.1%low `n/a`, std `0.55`

**Frame time (ms)**  avg `102.31`, p50 `100.60`, p95 `114.04`, p99 `117.07`, p99.9 `120.87`, max `121.79`

**Client tick (ms)**  avg `0.36`, p95 `1.08`, max `3.53`

**Memory**  start `1109 MB`, end `1082 MB`, peak `1535 MB`, GC `42 events / 230 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                                 █                              
 10.4 |                                          █      █                              
 10.3 |                                █         █      █                              
 10.2 |         █         █            █ █       █      █          █        █          
 10.0 |   █  █  █   ██  █ █  █  ██     █ █    █  ██ ██  █  █    █  █    █   █    █   █ 
  9.9 | █ █ ██  ██  ███ █ █ ██  ██ ██  █ ███  ██ ██ ██  ██ ██  ██  █  █ ██  ██  ██ █ █ 
  9.8 | █ █ ██  ██  █████ █ ██  ██ ██  █ ███ ███ ██ ██  █████  ██  ██ █ ██  ██  ██ █ █ 
  9.7 |██ █ ██  ██  █████ ████  █████  █ ███ ███ █████  █████ ███  ██ █ ██ ████ ██ █ █ 
  9.5 |██ █████ ██  █████ ████ ██████ ██ ███ ███ ██████ █████████ ███ ████ █████████ █ 
  9.4 |███████████ ██████████████████ ██ ████████████████████████████ ████ ███████████ 
  9.3 |██████████████████████████████ █████████████████████████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | ██  2
  89 ms | ██  2
  90 ms | █  1
  91 ms | ██  2
  92 ms | █  1
  93 ms | ████  4
  94 ms | ██  2
  95 ms | ██  2
  96 ms | ███  3
  97 ms | ██████  6
  98 ms | ████████████████  17
  99 ms | █████████████████████████  26
 100 ms | ████████████████████████████████████████  42
 101 ms | █████████████████████  22
 102 ms | ██████████  10
 103 ms | ████  4
 104 ms | ███  3
 105 ms | ████  4
 106 ms | █  1
 107 ms | █████  5
 108 ms | █  1
 109 ms | ███  3
 110 ms | ████████  8
 111 ms | ██████  6
 112 ms | █████  5
 113 ms | ████  4
 114 ms | ███  3
 115 ms | ██  2
 116 ms | ██  2
 117 ms | ██  2
 121 ms | █  1
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `11.00`
- `entity_count_delta` = `-10.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.77`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `64.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.37`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23661 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `7.83`, p50 `9.95`, p95 `10.81`, p99 `11.55`, 1%low `7.83`, 0.1%low `n/a`, std `0.65`

**Frame time (ms)**  avg `102.02`, p50 `100.47`, p95 `114.96`, p99 `124.68`, p99.9 `127.77`, max `127.79`

**Client tick (ms)**  avg `0.33`, p95 `0.88`, max `1.70`

**Memory**  start `1297 MB`, end `1106 MB`, peak `1940 MB`, GC `32 events / 230 ms`

**FPS over sampling window (ASCII):**

```
 11.2 |                                                                    █           
 11.0 |                                                                    █           
 10.8 | █                                                                  █           
 10.5 | █                                                                  █           
 10.3 | █         █             █                                          █           
 10.1 | █ █ █  ██ ██    █    █  ██  █  █   █   █  █  █ ██   █  █ █  ██     █   █  █ █  
  9.9 | ███ █████ ███ ████ ████ ███ ████  ██  ███ ████ ███  █ █████ ████ █ █ ████ █ █ █
  9.7 | ███ █████ ███ ████ ████ ███ █████ ████████████ ███ ██ █████ ████ █ █ ████ ███ █
  9.5 | █████████ ███ █████████ ███ ██████████████████ ██████ █████ ████ █ █ ██████████
  9.2 | █████████ █████████████ ██████████████████████ ████████████ ████ ███ ██████████
  9.0 | ███████████████████████ ███████████████████████████████████████████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  81 ms | █  1
  83 ms | █  1
  86 ms | █  1
  87 ms | █  1
  90 ms | █  1
  91 ms | ██████  4
  92 ms | ██████  4
  93 ms | █  1
  95 ms | ███████  5
  96 ms | ████  3
  97 ms | ██████████████████  13
  98 ms | █████████████████████████████  21
  99 ms | ████████████████████████████████████████  29
 100 ms | ████████████████████████████████████████  29
 101 ms | █████████████████████████████  21
 102 ms | ████████████  9
 103 ms | ███████████  8
 104 ms | ████  3
 105 ms | █  1
 106 ms | ███████  5
 107 ms | ███  2
 108 ms | ███  2
 109 ms | ████  3
 110 ms | ███████  5
 111 ms | ██████████  7
 112 ms | ███  2
 113 ms | ████  3
 114 ms | ███  2
 115 ms | ███  2
 116 ms | ███  2
 123 ms | █  1
 124 ms | ████  3
 127 ms | ███  2
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `12.00`
- `entity_count_delta` = `8.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `20.00`
- `preload_duration_ms` = `503.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.80`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `54.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.83`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23145 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `7.81`, p50 `9.94`, p95 `10.58`, p99 `11.08`, 1%low `7.91`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `101.99`, p50 `100.64`, p95 `113.16`, p99 `124.57`, p99.9 `127.45`, max `128.09`

**Client tick (ms)**  avg `0.69`, p95 `1.62`, max `2.61`

**Memory**  start `1520 MB`, end `2152 MB`, peak `2152 MB`, GC `22 events / 184 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                          █                                                     
 10.4 |                          █            █                   █                    
 10.3 |                          █            █         █         █   █       █     █  
 10.1 |       █ █  █     ██    █ █ █  ███  █  ████  █ █ █ █  ██   ██  ███   █ █ ██  ██ 
  9.9 |█ ███  ████ ███  ███  ███ ███  ███ ███ █████ █ █ ███  ██   ███ ████  ███ ███ ███
  9.7 |█ ███  ████ ████████ ████ ███  ███ ███ █████ █ █ ███  ███ ████ ████  ███ ███ ███
  9.6 |█ ███  ████ █████████████ ███ ████ ███ █████ ███ ███ ████ ████ ████ ████ ███ ███
  9.4 |█ ████ ██████████████████ ███ ████ ███ █████ █████████████████ █████████ ███ ███
  9.2 |█ ███████████████████████ ████████ ███████████████████████████ █████████ ███ ███
  9.0 |█████████████████████████ ██████████████████████████████████████████████████████
  8.9 |█████████████████████████ ██████████████████████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms | ██  2
  90 ms | █  1
  92 ms | █  1
  93 ms | █████  4
  94 ms | ██████  5
  95 ms | █████  4
  97 ms | ██████  5
  98 ms | ████████████████████████████  24
  99 ms | ████████████████████████████████████████  34
 100 ms | ███████████████████████████████████  30
 101 ms | █████████████████████████████  25
 102 ms | ███████████  9
 103 ms | ██████████████  12
 104 ms | ██████  5
 105 ms | █████  4
 106 ms | ██  2
 107 ms | ████  3
 108 ms | ████  3
 109 ms | ██  2
 110 ms | ██████  5
 111 ms | █  1
 112 ms | ██████  5
 113 ms | █  1
 114 ms | ██  2
 117 ms | █  1
 118 ms | █  1
 119 ms | █  1
 123 ms | █  1
 124 ms | ██  2
 128 ms | █  1
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-4.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `1.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.80`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.91`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23075 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `7.83`, p50 `9.95`, p95 `10.71`, p99 `11.33`, 1%low `8.11`, 0.1%low `n/a`, std `0.58`

**Frame time (ms)**  avg `102.22`, p50 `100.51`, p95 `114.88`, p99 `118.09`, p99.9 `125.96`, max `127.69`

**Client tick (ms)**  avg `0.33`, p95 `0.77`, max `1.81`

**Memory**  start `1459 MB`, end `1599 MB`, peak `2311 MB`, GC `25 events / 201 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                     █                    █                     
 10.4 |                                     █    █             █ █  █                  
 10.3 |                                █    █    █             █ █  █        █      █  
 10.1 |  █   █       █     █       █   █    █    █         █   █ █  █        █      █  
 10.0 |  ██  ████ █  ███ █ █ █ █ █ █   ███  ██   ████ █ █  █ █ █ █  █  █   █ █  ██  █  
  9.8 |  ███ ████ █ ████ █ █ █ █ █ ██ ████  ██ █ ████ █ ██ █ █ █ ██ █  █ █ █ ██ ██  ██ 
  9.7 |  ██████████ ████ █ █ █ █ █ ███████  ████ ████ ████████ █ ██ ████ ███ ██████ ███
  9.5 |  ███████████████████ █ ███ ████████ ██████████████████ █ ██ ████████ ██████ ███
  9.3 |█████████████████████████████████████████████████████████ ██ ███████████████ ███
  9.2 |█████████████████████████████████████████████████████████ ██████████████████████
  9.0 |█████████████████████████████████████████████████████████ ██████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  88 ms | ██  2
  90 ms | ███  3
  91 ms | ███  3
  93 ms | ███  3
  94 ms | ██  2
  95 ms | ██  2
  96 ms | ███████  7
  97 ms | ███  3
  98 ms | █████████████████  17
  99 ms | ████████████████████████████████████████  40
 100 ms | ███████████████████████████████  31
 101 ms | ████████████████████  20
 102 ms | ████████  8
 103 ms | ██████  6
 104 ms | ██  2
 105 ms | ████  4
 106 ms | ███  3
 107 ms | ██  2
 108 ms | ████  4
 109 ms | ████  4
 110 ms | ███  3
 111 ms | █  1
 112 ms | ██████  6
 113 ms | ████████  8
 114 ms | █  1
 115 ms | ██  2
 116 ms | ███  3
 117 ms | ██  2
 118 ms | ██  2
 127 ms | █  1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `4.00`
- `entity_count_delta` = `6.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `10.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.78`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `67.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.11`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23149 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.15`, p50 `9.95`, p95 `10.47`, p99 `11.22`, 1%low `8.33`, 0.1%low `n/a`, std `0.49`

**Frame time (ms)**  avg `101.93`, p50 `100.47`, p95 `112.77`, p99 `116.03`, p99.9 `121.70`, max `122.76`

**Client tick (ms)**  avg `0.32`, p95 `0.58`, max `2.01`

**Memory**  start `1140 MB`, end `1452 MB`, peak `2336 MB`, GC `23 events / 182 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                █                                                               
 10.6 |                █                                                               
 10.4 |                █    █              █                                           
 10.3 |                █    █    █         █  █     █                                  
 10.1 |     █ █ █  █   █  █ ██ █ █     █   █  █     █      █  █   █ ██  █ █ █    █     
 10.0 |█ █ ██ █ ██ █   ██ █ ██ █ █ █ █ ██  ██ ██ ██ █ ██ █ ██ █ ███ ██  █ █ ██ █ █ █   
  9.8 |█ █ ████ ██ ███ ██ █ ██ █ █ █ █ ██  ██ ██ ██ ██████ ██ █ ███ ██ ██ ████ █ ███ █ 
  9.6 |█ ██████ ██ ███ ██ █ ████ █ ███████ ██ ███████████████ █ ███ █████ ██████ ███ █ 
  9.5 |████████ ██████ ████ ████ █ ████████████████████████████████ ████████████ ███ ██
  9.3 |████████████████████ ██████ █████████████████████████████████████████████ ██████
  9.2 |████████████████████ ████████████████████████████████████████████████████ ██████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | ██  2
  89 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | █  1
  94 ms | ██  2
  95 ms | ██  3
  96 ms | ████  5
  97 ms | █████  6
  98 ms | ███████████████  19
  99 ms | ██████████████████████  27
 100 ms | ████████████████████████████████████████  50
 101 ms | ██████████████████  22
 102 ms | ██████  8
 103 ms | ███  4
 104 ms | ████  5
 105 ms | ████  5
 106 ms | ██  3
 107 ms | ██  2
 108 ms | ██  3
 109 ms | ██  3
 110 ms | ███  4
 111 ms | █████  6
 112 ms | ██  3
 113 ms | ███  4
 115 ms | ███  4
 117 ms | █  1
 122 ms | █  1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `39.00`
- `entity_count_delta` = `-30.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `9.00`
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
- `fps_1pct_low` = `8.33`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24381 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.40`, p50 `9.96`, p95 `10.67`, p99 `10.94`, 1%low `8.50`, 0.1%low `n/a`, std `0.52`

**Frame time (ms)**  avg `101.97`, p50 `100.41`, p95 `113.15`, p99 `116.02`, p99.9 `118.49`, max `119.00`

**Client tick (ms)**  avg `0.29`, p95 `0.55`, max `1.69`

**Memory**  start `2039 MB`, end `2407 MB`, peak `2407 MB`, GC `25 events / 207 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |               █                  █                                             
 10.4 |               █        █         █                                             
 10.3 |  █            █  █     █         █                                             
 10.1 |  █            █  █     █         █    █         █         █    █         █     
 10.0 |  ██████       ██ █     ██ █ █  █ ██   ██ █   █  ██ █  █ █ █   ██ █   █ █ ███   
  9.9 |  ██████   █   ██ █   █ ██ █ ██ █ ██ █ ██ █ ████ ████ ██ █ █ █ ██ █ █ █ █████ █ 
  9.8 |  ██████ █ ███ ██ ██  █ ████ ██ █ ██ █ ██ ███████████ ██ █ █ █ ██ █ █████████ ██
  9.6 |  ██████ █ ███ ██ █████ ███████ █ ██ ████ ████████████████ █ ████ █ ████████████
  9.5 |█ ██████ ████████ ███████████████████████ ████████████████ ██████ ██████████████
  9.4 |█████████████████ ██████████████████████████████████████████████████████████████
  9.3 |█████████████████ ██████████████████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  89 ms | █  1
  91 ms | ██  2
  92 ms | ███  3
  93 ms | ████  5
  94 ms | █  1
  95 ms | ███  3
  96 ms | ███  3
  97 ms | ███  4
  98 ms | ███████████  13
  99 ms | ████████████████████████████████████████  46
 100 ms | ██████████████████████████████  34
 101 ms | ████████████████████  23
 102 ms | ████████  9
 103 ms | ██  2
 104 ms | ███  4
 105 ms | ██  2
 106 ms | ███  3
 107 ms | █  1
 108 ms | █████  6
 109 ms | ███  4
 110 ms | ██  2
 111 ms | ████████  9
 112 ms | ████  5
 113 ms | ██  2
 114 ms | ███  3
 115 ms | ██  2
 116 ms | ██  2
 119 ms | █  1
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `3.00`
- `entity_count_delta` = `-2.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1332.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `54.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.50`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23156 ms  |  Sample ticks: 400

**FPS**  avg `9.78`, min `8.25`, p50 `9.94`, p95 `10.33`, p99 `11.07`, 1%low `8.44`, 0.1%low `n/a`, std `0.52`

**Frame time (ms)**  avg `102.51`, p50 `100.61`, p95 `113.81`, p99 `115.46`, p99.9 `120.13`, max `121.15`

**Client tick (ms)**  avg `0.38`, p95 `0.73`, max `5.91`

**Memory**  start `1162 MB`, end `2244 MB`, peak `2364 MB`, GC `24 events / 184 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                             █               █                                  
 10.5 |                             █               █                            █     
 10.4 |                             █          █    █                            █     
 10.2 |                             █          █    █                            █     
 10.1 |            █ █    █ █       ██         █    █        █ █      █ █  █  ██ █     
  9.9 |  ███     █ █ █  █ █ █ █ █ █ ██  ██  ██ █  █ ██ ██ █ ██ █   █  █ █  █  ██ █  █  
  9.8 |  ███ ███ █ █ █ ██ █ █ █ █ █ ██  ██  ██ ██ █ ██ ██ █ ██ █ ███ ██ █ ██  ██ █ ███ 
  9.6 | ██████████ █ ████ █ ███ █ █ ██  ██  ██ ████ ██ ███████ █ ██████ █ ███ ██ █ ███ 
  9.5 |███████████ █ ██████ ███ ███ ███████ ██ ████ ████████████ ██████ ████████ █ ████
  9.4 |████████████████████████████ ████████████████████████████████████████████ ██████
  9.2 |████████████████████████████ ███████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  90 ms | ███  3
  93 ms | ███  3
  94 ms | █  1
  96 ms | ██  2
  97 ms | ████████  8
  98 ms | ████████████████████  19
  99 ms | ████████████████████████████████████████  38
 100 ms | ████████████████████████████████████████  38
 101 ms | ███████████████████  18
 102 ms | ████████████  11
 103 ms | ██  2
 104 ms | ████  4
 105 ms | ██  2
 106 ms | ██  2
 108 ms | ███████  7
 109 ms | ███  3
 110 ms | ████████████  11
 111 ms | ███  3
 112 ms | █████  5
 113 ms | ████  4
 114 ms | █████  5
 115 ms | ████  4
 121 ms | █  1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.75`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.44`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24878 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.09`, p50 `9.95`, p95 `10.89`, p99 `11.31`, 1%low `8.25`, 0.1%low `n/a`, std `0.61`

**Frame time (ms)**  avg `102.38`, p50 `100.55`, p95 `114.01`, p99 `118.79`, p99.9 `122.66`, max `123.57`

**Client tick (ms)**  avg `0.42`, p95 `1.18`, max `7.38`

**Memory**  start `1427 MB`, end `1086 MB`, peak `2388 MB`, GC `25 events / 205 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                   █                                            
 10.6 |                   █               █                                            
 10.4 |                   █               █      █                      █              
 10.2 |                   █               █      █        █             █ █            
 10.1 |█ █  █ █ ██  █ ██  █  █  █       █ █    █ █  █   █ ██    █   █   █ ██    ██ █  █
  9.9 |█ ██ █ █ ██  █ ██  ██ ██ █ █ █ ███ ██ █ █ ████ █ █ ██ █ ██ █ █ █ █ ██ █ █████  █
  9.7 |█ ██ █ █ ██  █ ███ ██ ████ █ █ ███ ████ █ ████ █ █ ██ ████ █ █ █ █ ██ █ █████  █
  9.5 |██████ █ ███ █████ ██ ██████ █████ ██████ ████ ███ ██ ██████████ █ ████ ██████ █
  9.4 |████████████ █████ ███████████████ █████████████████████████████████████████████
  9.2 |████████████ ███████████████████████████████████████████████████████████████████
  9.0 |████████████ ███████████████████████████████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
  90 ms | ██  3
  91 ms | ███  4
  93 ms | ██  3
  94 ms | █  1
  95 ms | ██  3
  96 ms | ██  2
  97 ms | ██  3
  98 ms | █████████████  16
  99 ms | ███████████████████████████  33
 100 ms | ████████████████████████████████████████  49
 101 ms | ████████████████  20
 102 ms | ██  3
 103 ms | ██  2
 104 ms | █  1
 105 ms | ██  3
 106 ms | ██  2
 108 ms | ██  2
 109 ms | ██  2
 110 ms | █████  6
 111 ms | ███████  9
 112 ms | ████████  10
 113 ms | ████  5
 114 ms | ██  2
 115 ms | ██  3
 117 ms | █  1
 118 ms | ██  3
 123 ms | █  1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `56.00`
- `entity_count_delta` = `-47.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `9.00`
- `preload_duration_ms` = `1730.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.77`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.25`
- `surface_water_ratio` = `0.14`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23158 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `7.94`, p50 `9.96`, p95 `10.73`, p99 `11.75`, 1%low `7.95`, 0.1%low `n/a`, std `0.64`

**Frame time (ms)**  avg `101.94`, p50 `100.36`, p95 `114.33`, p99 `121.01`, p99.9 `125.90`, max `125.93`

**Client tick (ms)**  avg `0.41`, p95 `1.21`, max `11.46`

**Memory**  start `1970 MB`, end `2013 MB`, peak `2386 MB`, GC `21 events / 173 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                                                          █     
 10.6 |                                                                          █     
 10.5 |                                               █       █                  █     
 10.3 |            █                                  █  █    █                  █     
 10.2 |            █      █            █        █     █  █    █        █         █     
 10.0 |█  █  █     █ ██ █ █      █     ██  █ █  ███   ██ ██ █ ██ █ █ █ ██   ████ █ █  █
  9.9 |██ █ ██ █ █ █ ██ █ ██  █ ███   ███ ████ █████  ██ ██ █ ██ █ █ █ ██ █ ████ █ ██ █
  9.7 |██ █ ██ ███ █ ████ ██  █ ███ ██████████ ██████ ██ ██ █ ██ █ █ █ ██ ██████ █ ██ █
  9.6 |██ ████████ ██████ ██  █ █████████████████████ ██ ████ ██ █ ███ █████████ █ ██ █
  9.5 |███████████ ██████ ██ ████████████████████████ ██ ████ ██████████████████ ██████
  9.3 |██████████████████ ██████████████████████████████████████████████████████ ██████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms | ██  2
  85 ms | ██  2
  87 ms | █  1
  90 ms | ██  2
  91 ms | █  1
  92 ms | █  1
  93 ms | ██████  6
  94 ms | ██  2
  95 ms | ████  4
  96 ms | █  1
  97 ms | ███████  7
  98 ms | ██████████████████████████  25
  99 ms | █████████████████████████████  28
 100 ms | ████████████████████████████████████████  38
 101 ms | ██████████████████████  21
 102 ms | █████  5
 103 ms | ████  4
 104 ms | █████  5
 106 ms | ███  3
 107 ms | ███  3
 108 ms | ███  3
 109 ms | █████  5
 110 ms | █  1
 111 ms | ██  2
 112 ms | █████████  9
 113 ms | ██  2
 114 ms | █████  5
 115 ms | ███  3
 116 ms | █  1
 118 ms | █  1
 119 ms | █  1
 120 ms | █  1
 125 ms | ██  2
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `14.00`
- `entity_count_delta` = `-12.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `2.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.95`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23179 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `8.61`, p50 `9.95`, p95 `10.35`, p99 `11.27`, 1%low `8.63`, 0.1%low `n/a`, std `0.50`

**Frame time (ms)**  avg `102.12`, p50 `100.53`, p95 `113.50`, p99 `115.30`, p99.9 `116.01`, max `116.12`

**Client tick (ms)**  avg `0.29`, p95 `0.53`, max `1.87`

**Memory**  start `2083 MB`, end `1720 MB`, peak `2307 MB`, GC `25 events / 197 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                                █                               
 10.6 |                                                █                               
 10.5 |                                                █                       █       
 10.3 |                                                █                       █       
 10.2 |               █                            █   █ █                   █ █  █    
 10.0 | █ █  █  █   █ █ █ █  █     █ █ █   █ █ ██  ██  █ █    █ █  █   █  ██ █ ██ █ ██ 
  9.9 | █ ██ █ ██ █ ███ █ █  █ █ █ █ █ ██ ██ █ ██  ██  █ █ █ ██ █ ███ ██  ██ █ ██ █ ██ 
  9.7 | █ ██ █ ██ █████ █ █ ██ █ █ █ █████████ ██  ██  █ █ █ ██ █ ███ ███ ██ █ ██ █ ███
  9.6 |██████████ █████ █ ██████ █ █ ████████████  ███ █ ████████ ███ ███ ██ █ ██ █████
  9.4 |█████████████████████████████████████████████████ ███████████████████ █ ██ █████
  9.3 |███████████████████████████████████████████████████████████████████████ ████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  87 ms | █  1
  88 ms | █  1
  90 ms | █  1
  91 ms | █  1
  92 ms | █  1
  94 ms | ██  2
  95 ms | █  1
  96 ms | ██  2
  97 ms | █████  6
  98 ms | █████████████  15
  99 ms | ██████████████████████████████  36
 100 ms | ████████████████████████████████████████  48
 101 ms | ███████████████████████  28
 102 ms | ███  4
 103 ms | ████  5
 104 ms | ███  3
 106 ms | ███  4
 107 ms | █  1
 108 ms | ██████  7
 109 ms | █  1
 110 ms | ███  3
 111 ms | █████  6
 112 ms | ████  5
 113 ms | ███  4
 114 ms | ████  5
 115 ms | ███  3
 116 ms | █  1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `4.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `100.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.79`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.63`
- `surface_water_ratio` = `0.09`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23139 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.41`, p50 `9.94`, p95 `10.61`, p99 `11.54`, 1%low `8.46`, 0.1%low `n/a`, std `0.56`

**Frame time (ms)**  avg `101.92`, p50 `100.60`, p95 `113.82`, p99 `116.74`, p99.9 `118.67`, max `118.95`

**Client tick (ms)**  avg `0.33`, p95 `0.64`, max `1.74`

**Memory**  start `1336 MB`, end `2222 MB`, peak `2273 MB`, GC `25 events / 203 ms`

**FPS over sampling window (ASCII):**

```
 10.8 | █                    █                                                         
 10.6 | █                    █                                                         
 10.5 | █                    █      █         █                                        
 10.3 | █                    █      █         █                      █        █        
 10.1 | █ █        █   █  █  █      █         █  █                █  █     █  █       █
 10.0 | █████ █ █ ██ █ █ ██  █████  ███ █ █ █ ██ █ █  ████ █ █ █  ██ █ █ █ ██ █ ███ █ █
  9.8 | █████ █ █ ██ █ █ ███ █████  █████ █ █ ██ █████████ █ █ ██ ██ █ █ █ ██ █ ███ █ █
  9.7 | ███████ █ ████ █ █████████  █████ █ █ ██ ███████████ █ ██ ██ █ █ ████ █████ ███
  9.5 | ███████████████████████████ ██████████████████████████ █████ █ ██████ █████████
  9.3 | ██████████████████████████████████████████████████████████████ ████████████████
  9.2 |███████████████████████████████████████████████████████████████ ████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | ███  3
  87 ms | █  1
  89 ms | ██  2
  90 ms | ██  2
  92 ms | ██  2
  94 ms | ██  2
  95 ms | █████  5
  96 ms | ██  2
  97 ms | ██████████  11
  98 ms | ███████████████  17
  99 ms | █████████████████████████  27
 100 ms | ████████████████████████████████████████  44
 101 ms | ███████████████████  21
 102 ms | █████  5
 103 ms | █████  5
 104 ms | ███  3
 105 ms | ███  3
 106 ms | ███  3
 107 ms | █████  5
 108 ms | ████  4
 109 ms | █████  5
 110 ms | █  1
 111 ms | █████  5
 112 ms | █████  5
 113 ms | █████  5
 114 ms | ████  4
 115 ms | ██  2
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `37.00`
- `entity_count_delta` = `-36.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `64.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.46`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23050 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `7.60`, p50 `9.94`, p95 `10.56`, p99 `11.11`, 1%low `7.76`, 0.1%low `n/a`, std `0.62`

**Frame time (ms)**  avg `102.11`, p50 `100.60`, p95 `113.39`, p99 `124.58`, p99.9 `130.54`, max `131.64`

**Client tick (ms)**  avg `0.31`, p95 `1.15`, max `1.81`

**Memory**  start `1291 MB`, end `1510 MB`, peak `2347 MB`, GC `21 events / 174 ms`

**FPS over sampling window (ASCII):**

```
 12.0 |                                                                          █     
 11.6 |                                                                          █     
 11.3 |                                                                          █     
 10.9 |                                                                          █     
 10.6 |                                                                █         █     
 10.3 |                         █     █    █                           █         █     
  9.9 | ███  ██ █████ ███ ██  █ ██ ██ ███ ████  ██ █████ ████ ███  ███ ████ ████ ████ █
  9.6 | ███████ █████ ███ ████████ ██ ███ ████████ ██████████ ████████ ████ ████ ██████
  9.2 | █████████████████████████████ ████████████████████████████████ █████████ ██████
  8.9 |█████████████████████████████████████████████████████████████████████████ ██████
  8.6 |█████████████████████████████████████████████████████████████████████████ ██████
  8.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  72 ms | █  1
  83 ms | █  1
  90 ms | ██  2
  91 ms | ██  2
  93 ms | █  1
  94 ms | ████  4
  95 ms | ██  2
  96 ms | ██  2
  97 ms | ███████████  10
  98 ms | ███████████████████  17
  99 ms | █████████████████████████████████████  33
 100 ms | ████████████████████████████████████████  36
 101 ms | ██████████████████████████████  27
 102 ms | ███████████  10
 103 ms | ████  4
 104 ms | ██  2
 105 ms | ██  2
 106 ms | ██████  5
 107 ms | ███████  6
 108 ms | ███  3
 109 ms | ██  2
 110 ms | ███  3
 111 ms | ████  4
 112 ms | ███  3
 113 ms | ███████  6
 114 ms | ██  2
 117 ms | █  1
 118 ms | █  1
 122 ms | █  1
 124 ms | █  1
 125 ms | █  1
 131 ms | █  1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `entity_count_sample_start` = `35.00`
- `entity_count_delta` = `-34.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `99.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.79`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `7.76`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.68`, p50 `9.98`, p95 `10.12`, p99 `10.85`, 1%low `8.75`, 0.1%low `n/a`, std `0.38`

**Frame time (ms)**  avg `101.81`, p50 `100.20`, p95 `111.40`, p99 `112.85`, p99.9 `114.82`, max `115.15`

**Client tick (ms)**  avg `0.26`, p95 `0.31`, max `1.70`

**Memory**  start `1708 MB`, end `1784 MB`, peak `1784 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                                                                       █        
 10.1 |    █    █    █         █    █                   █    █         █    █ █  █    █
 10.0 |██  ███  ██   ██   ██ █ █  █ █ ██   ██  ███  ███ ███  ███  ██   ██ █ █ ██ █  █ █
  9.9 |██  ███ ███  ███  ███ ███  ███ ███  ██  ███  ███ ███  ███ ███  ███ ███ ████  ███
  9.8 |██  ███ ████ ███  ███ ███  ███ ███  ██  ███  ███ ███  ███ ███  ███ ███ ████ ████
  9.7 |███ ███ ████ ███ ████ ███ ████ ███  ██ ████ ████ ████ ███ ███ ████ ███ ████ ████
  9.6 |███████ ████ ███ ████ ███ ████ ████ ██ █████████ ████ ███ ███ ████ ███ ████ ████
  9.5 |███████ █████████████ ███ ████ ███████ █████████ ████ ███ ████████ ███ █████████
  9.4 |███████ █████████████ ████████ ██████████████████████████ ████████ █████████████
  9.3 |███████ █████████████ ████████ ██████████████████████████ ██████████████████████
  9.2 |███████ ████████████████████████████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms |   1
  90 ms |   1
  92 ms |   1
  97 ms | █  2
  98 ms | █████  13
  99 ms | █████████  21
 100 ms | ████████████████████████████████████████  98
 101 ms | ██████  15
 102 ms | █  3
 103 ms |   1
 104 ms | █  2
 105 ms | █  3
 106 ms | ████  10
 107 ms | ██  5
 108 ms | █  2
 109 ms | █  2
 110 ms | ██  4
 111 ms | ██  4
 112 ms | ██  6
 113 ms |   1
 115 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `1923.00`
- `fps_1pct_low` = `8.75`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `7.08`, p50 `9.98`, p95 `10.42`, p99 `10.83`, 1%low `7.54`, 0.1%low `n/a`, std `0.54`

**Frame time (ms)**  avg `101.91`, p50 `100.23`, p95 `112.13`, p99 `121.27`, p99.9 `137.91`, max `141.32`

**Client tick (ms)**  avg `2.64`, p95 `3.14`, max `19.10`

**Memory**  start `1931 MB`, end `2046 MB`, peak `2363 MB`, GC `3 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 11.9 |                             █                                                  
 11.6 |                             █                                                  
 11.2 |                             █                                                  
 10.9 |                             █                                                  
 10.6 |                             █                                                  
 10.3 |       █        █   ██       █                                                  
 10.0 |█  ███ ███  ██  █ █ ██ █  ██ █ ███ ███  ███ ███  ███ ███  ██ ███  ███  ███ ███ █
  9.7 |█ ████ ███  ███ ███ ████████ █████ ███ ████ ███ ████ ███ ███ ███ ████ ████ ███ █
  9.4 |██████ ████████ ███ ████████ █████ ████████ ██████████████████████████████ █████
  9.1 |████████████████████████████ ███████████████████████████████████████████████████
  8.8 |████████████████████████████ ███████████████████████████████████████████████████
  8.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  78 ms | █  1
  91 ms | █  1
  92 ms | ██  3
  94 ms | ███  4
  95 ms | █  1
  96 ms | █████  8
  97 ms | ███  5
  98 ms | █████  8
  99 ms | ████████████████████████████  45
 100 ms | ████████████████████████████████████████  64
 101 ms | █████  8
 102 ms | ██  3
 103 ms | ██  3
 104 ms | ██  3
 105 ms | █  1
 106 ms | ██  3
 107 ms | ███  4
 108 ms | ████  6
 109 ms | ██  3
 110 ms | ████  6
 111 ms | ████  6
 112 ms | ███  5
 113 ms | █  1
 114 ms | █  1
 118 ms | █  1
 121 ms | █  1
 123 ms | █  1
 141 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `7.54`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `100.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.81`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23075 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.86`, p50 `9.98`, p95 `10.13`, p99 `10.24`, 1%low `8.87`, 0.1%low `n/a`, std `0.37`

**Frame time (ms)**  avg `102.09`, p50 `100.19`, p95 `111.32`, p99 `112.53`, p99.9 `112.81`, max `112.82`

**Client tick (ms)**  avg `0.27`, p95 `0.36`, max `1.82`

**Memory**  start `2212 MB`, end `781 MB`, peak `2376 MB`, GC `1 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                                              █                                 
 10.1 |     █         █    █         █         █     █   █              █    █         
 10.0 |██   ██   █ █  █  █ █     █ █ █ ██ █ █  █ █   █ █ █ ██ █ █   █ █ ██   █ █   █   
  9.9 |██ █ ██  ██ █ ██  ███  ██ █ █ █ ██ █ █ ██ █ █ █ █ █ ██ █ █ █ █ █ ██  ██ █ █ █  █
  9.9 |██ █ ██  ██ █ ██  ███  ██ █ █ █ ██ █ █ ██ █ █ █ █ █ ██ █ █ █ █ █ ██  ██ █ █ █  █
  9.8 |██ █ ██  ██ █ ██  ███  ██ █ █ █ ██ █ █ ██ █ █ █ █ █ ██ ███ █ █ █ ██  ██ █ ███  █
  9.7 |██ █ ██ ███ █ ██  ███  ██ ███ █ ████ █ ██ █ █ █ █ █ ██ ███ █ █ █ ██  ██ █ ████ █
  9.6 |██ █ ██ █████ ███ ████ ██ ██████████ █ ████ █ ███ █ ██ ███████ █ ██  ██ ████████
  9.6 |██ ████ █████ ███ ████ ██ ██████████ █ ██████ ███ █ ██ ███████ █ ██  ██ ████████
  9.5 |███████ █████████ ████ ███████████████ ██████ ████████████████ █ ███████████████
  9.4 |█████████████████████████████████████████████ ██████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  94 ms |   1
  96 ms |   1
  97 ms |   1
  98 ms | ██████  12
  99 ms | ███████████████  32
 100 ms | ████████████████████████████████████████  85
 101 ms | ████████  18
 104 ms | █  3
 105 ms | ██  4
 106 ms | ██  4
 107 ms | ████  8
 108 ms | █  3
 109 ms | ███  6
 110 ms | ██  4
 111 ms | ███  7
 112 ms | ███  6
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.80`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3165.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `8.87`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23147 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.69`, p50 `9.98`, p95 `10.14`, p99 `10.89`, 1%low `8.74`, 0.1%low `n/a`, std `0.41`

**Frame time (ms)**  avg `101.93`, p50 `100.19`, p95 `111.85`, p99 `113.32`, p99.9 `114.83`, max `115.06`

**Client tick (ms)**  avg `0.27`, p95 `0.39`, max `2.16`

**Memory**  start `856 MB`, end `992 MB`, peak `992 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                                     █                          
 10.3 |                                                     █                          
 10.2 |                                                     █                          
 10.1 |      █      █                   █    █ █    █       █                          
 10.0 |    █ █   ██ █ █   ██   █ █ ██ █ █  █ █ ██ █ █    █  █  █ █ ██  ██   ██   ██   █
  9.9 |█ █ █ ██  ██ █ █ █ ██ █ █ █ ██ █ ██ ███ ██ █ █ █ ██  ██ █ █ ██  ██ █ ██ █ ██  ██
  9.8 |█ █ █ ██  ██ █ █ ██████ █ ████ █ ██ ███ ██ █ █ █ ██  ██ █ █ ██  ██ █ ██ █ ██  ██
  9.7 |█ █ █ ██  ██ ███ ██████ █ ████ ████████ ██ █ █ ████  ████ █ ██  ██ ██████ ██  ██
  9.6 |█ ███ ███ ██ ███ ██████ █ █████████████ ██ █ ██████  ████ ████ ███ ██████ ██████
  9.5 |█████████ ██ ███ ████████ █████████████ ███████████  ███████████████████████████
  9.4 |███████████████████████████████████████ ████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms | ██  3
  92 ms | █  2
  93 ms | █  1
  98 ms | ████████████  22
  99 ms | ████████████  21
 100 ms | ████████████████████████████████████████  73
 101 ms | █████████████████  31
 104 ms | █  1
 105 ms | ██  3
 106 ms | ████  7
 107 ms | ███  5
 108 ms | ██  3
 109 ms | ████  7
 110 ms | █  2
 111 ms | ███  5
 112 ms | ███  6
 113 ms | ██  3
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.81`
- `fps_1pct_low` = `8.74`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
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

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `8.78`, p50 `9.98`, p95 `10.56`, p99 `11.27`, 1%low `8.80`, 0.1%low `n/a`, std `0.46`

**Frame time (ms)**  avg `101.62`, p50 `100.20`, p95 `112.12`, p99 `113.04`, p99.9 `113.77`, max `113.86`

**Client tick (ms)**  avg `0.27`, p95 `0.35`, max `1.68`

**Memory**  start `1208 MB`, end `1364 MB`, peak `1364 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |     █                                                                          
 10.5 |     █                                                                          
 10.4 |     █      █                       █                                         █ 
 10.3 |  █  █      █                       █                                   █     █ 
 10.2 |  █  █      █                       █     █                         █   █     █ 
 10.1 |  █  █    █ █  █    █    █    █     █     █     █ █    █    █    █  █ █ █  █  █ 
 10.0 |  ██ ██ █ █ ██ █ ██ ███ ██ █ ██ █ █ █ ██ ████ █ █ ████ ██  ███  ███ ███ █ ██  ██
  9.8 |  ██ ██ █ █ ██ █ ██ ███ ██ █ ██ █ █ █ ██ ████ █ █ ████ ██ ████  ███ ███ █ ██  ██
  9.7 |  ██ ██ █ █ ██ █ ██ ███ ██ ████ █ █ █ ██ ████ █ █ ████ ██ ████  ███ ███ █ ██  ██
  9.6 |  ██ ██ ███ ██ ████ ███ ███████████ █ ██ ██████ █ █████████████ ███ ███ █ ███ ██
  9.5 |█ ██ ██████ ████████████████████████████ ██████████████████████████████ █ ███ ██
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms |   1
  88 ms | █  2
  89 ms |   1
  90 ms |   1
  91 ms | █  2
  92 ms | █  2
  93 ms |   1
  95 ms |   1
  98 ms | ████  9
  99 ms | ████████████████  33
 100 ms | ████████████████████████████████████████  84
 101 ms | ████████  16
 102 ms |   1
 103 ms |   1
 104 ms | █  3
 105 ms | █  3
 106 ms | █  2
 107 ms | ██  4
 108 ms | ███  6
 109 ms | ██  4
 110 ms | ██  5
 111 ms | █  2
 112 ms | ████  9
 113 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.84`
- `restocks` = `20.00`
- `fps_1pct_low` = `8.80`
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

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23156 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `8.79`, p50 `9.98`, p95 `10.12`, p99 `10.60`, 1%low `8.83`, 0.1%low `n/a`, std `0.38`

**Frame time (ms)**  avg `102.01`, p50 `100.18`, p95 `111.71`, p99 `112.70`, p99.9 `113.59`, max `113.79`

**Client tick (ms)**  avg `0.28`, p95 `0.41`, max `1.70`

**Memory**  start `871 MB`, end `1011 MB`, peak `1011 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                 █    █                                                         
 10.4 |                 █    █                                                         
 10.3 |                 █    █                                                         
 10.2 |                 █    █                                                         
 10.1 |                 █    █                                    █                    
 10.0 |█ ██  ██  ██ █ █ ██ █ ██ █ ██ █ █ █ ██ █ ██  ██  ██ █ ██ █ █ ██ █ █ █ █ █ ██  ██
  9.9 |█ ██  ██  ██ █ █ ██ █ ██ █ ██ █ █ █ ██ █ ██  ██  ██ █ ██ █ █ ██ █ █ █ █ █ ██  ██
  9.8 |█ ███ ██  ██ █ █ ██ █ ████ ██ █ █ █ ██ █ ███ ██  ██ █ ██ █ █ ██ █ ███ █ █ ██  ██
  9.7 |█████ ██  ██ ███ ██ █ ████ ██ █████ ██ ████████  ██ █ ██ █ ████ █ ███ █ █ ███ ██
  9.6 |█████ ██  ██ ███ ██ █ ████ ███████████ ████████  ██ █████████████ ███ █ █ ███ ██
  9.5 |█████████ ██████████████████████████████████████ ██████████████████████ ████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  92 ms | █  2
  94 ms |   1
  98 ms | █████  12
  99 ms | ██████████  24
 100 ms | ████████████████████████████████████████  101
 101 ms | ██████  14
 103 ms | █  2
 104 ms | █  2
 105 ms | █  2
 106 ms | ██  4
 107 ms | ██  4
 108 ms | █  3
 109 ms | ██  6
 110 ms | ██  5
 111 ms | ██  6
 112 ms | ███  8
 113 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `104.00`
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
- `scheduled_block_ticks` = `1088.00`
- `fps_1pct_low` = `8.83`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195075 ms  |  Sample ticks: 3600

**FPS**  avg `9.85`, min `8.14`, p50 `9.98`, p95 `10.65`, p99 `10.98`, 1%low `8.51`, 0.1%low `8.17`, std `0.52`

**Frame time (ms)**  avg `101.83`, p50 `100.20`, p95 `112.48`, p99 `115.43`, p99.9 `119.72`, max `122.79`

**Client tick (ms)**  avg `0.67`, p95 `1.22`, max `6.77`

**Memory**  start `2269 MB`, end `1379 MB`, peak `2289 MB`, GC `14 events / 85 ms`

**FPS over sampling window (ASCII):**

```
 10.0 | █                                                                              
 10.0 | █             █             █                                                  
  9.9 | █             █            ██ █     █          █       █   █                   
  9.9 | █             █            ██ █     █          █  █    █   █              █ █  
  9.9 | █             ██    █   ██ ██ █     █ █  █   █ ██ █    █   █            █ █ █  
  9.9 | ██  █ ██  █ █ ██  ███   ██ ████     █ █  █ █ ████ █    █ ████ █  █ █ █  ███ █  
  9.8 | ███ ████ ██ █████ ████ ███ ████ █ ██████ █ █ ████████  █ ████ █ ████ █ ████ ██ 
  9.8 | ███ ████ ██ ██████████████ ███████████████ █ █████████ ███████████████ ████████
  9.8 | ██████████████████████████ █████████████████ ██████████████████████████████████
  9.8 | ████████████████████████████████████████████ ██████████████████████████████████
  9.7 | ███████████████████████████████████████████████████████████████████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms |   1
  87 ms |   2
  88 ms |   1
  89 ms |   6
  90 ms |   5
  91 ms | ██  20
  92 ms | ██  22
  93 ms | ███  37
  94 ms | ███  40
  95 ms | ██  22
  96 ms | ███  31
  97 ms | ███  40
  98 ms | ████████  103
  99 ms | ██████████████████████████████████  408
 100 ms | ████████████████████████████████████████  486
 101 ms | ███████████  133
 102 ms | ██  23
 103 ms |   6
 104 ms |   5
 105 ms |   2
 106 ms |   4
 107 ms | █  9
 108 ms | ██  24
 109 ms | ████  43
 110 ms | ██████  71
 111 ms | ███████  87
 112 ms | ███████  79
 113 ms | ██  21
 114 ms | █  17
 115 ms |   6
 116 ms |   5
 117 ms |   5
 118 ms |   1
 119 ms |   1
 121 ms |   1
 122 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `21.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `8.51`
- `fps_harmonic_avg` = `9.82`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `8.17`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `67.00`
- `trees_built` = `173.00`
- `phase` = `0.00`
- `segment_count` = `19.00`
- `part` = `2.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194415 ms  |  Sample ticks: 3600

**FPS**  avg `9.86`, min `7.75`, p50 `9.98`, p95 `10.53`, p99 `10.96`, 1%low `7.96`, 0.1%low `7.75`, std `0.53`

**Frame time (ms)**  avg `101.75`, p50 `100.19`, p95 `113.53`, p99 `124.07`, p99.9 `128.41`, max `129.06`

**Client tick (ms)**  avg `0.63`, p95 `1.10`, max `2.18`

**Memory**  start `1268 MB`, end `1568 MB`, peak `1946 MB`, GC `11 events / 66 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                          █                                                     
  9.9 |                          █                                                     
  9.9 |             █         █  █              █                                      
  9.9 | █           █         █  ███          █ █       █  █             █       █     
  9.9 | █   █  █    █     ██  █  ████       █ █ ██     ███ █   █ █       █   █   █  █  
  9.9 | █   █  ██ █ ██  █ ██ ██  █████ █  ███ █ ██ █   ███ █   █ █     ███   █  ██  █  
  9.9 | ██ ███ ██ █ ██ ██ ██ ██  █████ ██ ███ █ ████  ████ █████ █    ████   ██ ██  █  
  9.8 | ██ ███ ██ █ ███████████  ████████████ █ ████  ██████████ ██   ██████ ██ ██  ██ 
  9.8 |███████ ████████████████  ████████████ ██████ ███████████████  ████████████ ████
  9.8 |████████████████████████  ████████████ ████████████████████████████████████ ████
  9.8 |████████████████████████ ██████████████████████████████████████████████████ ████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms |   1
  84 ms |   1
  86 ms |   1
  87 ms |   2
  88 ms |   4
  89 ms |   5
  90 ms |   3
  91 ms | █  14
  92 ms | █  10
  93 ms | ██  24
  94 ms | ██  28
  95 ms | ██  32
  96 ms | ██  32
  97 ms | ███  38
  98 ms | ██████████  130
  99 ms | ████████████████████████████████  422
 100 ms | ████████████████████████████████████████  532
 101 ms | ██████████  137
 102 ms | ██  24
 103 ms |   6
 104 ms | █  14
 105 ms | █  15
 106 ms | █  14
 107 ms | ██  22
 108 ms | ██  29
 109 ms | ██  21
 110 ms | ███  39
 111 ms | ███  43
 112 ms | ██  30
 113 ms | █  16
 114 ms | █  12
 115 ms |   1
 116 ms |   3
 117 ms |   2
 118 ms |   3
 119 ms | █  8
 120 ms | █  8
 121 ms | █  10
 122 ms |   6
 123 ms | █  8
 124 ms | █  11
 125 ms |   4
 126 ms |   1
 128 ms |   2
 129 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `21.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `7.96`
- `fps_harmonic_avg` = `9.83`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.75`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `68.00`
- `trees_built` = `173.00`
- `phase` = `1.00`
- `segment_count` = `19.00`
- `part` = `3.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193810 ms  |  Sample ticks: 3600

**FPS**  avg `9.85`, min `7.73`, p50 `9.98`, p95 `10.67`, p99 `11.04`, 1%low `8.37`, 0.1%low `7.84`, std `0.56`

**Frame time (ms)**  avg `101.84`, p50 `100.18`, p95 `112.95`, p99 `117.04`, p99.9 `125.03`, max `129.30`

**Client tick (ms)**  avg `0.63`, p95 `1.11`, max `1.93`

**Memory**  start `858 MB`, end `1581 MB`, peak `1902 MB`, GC `10 events / 44 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                         █          █                                           
 10.0 |                         █        █ █                                           
  9.9 |                         █        █ █                                      █    
  9.9 |                    █    █        █ █  █                █                  █ █  
  9.9 |             █      █ █  █    █   █ █  █            █   ██            █    █ █  
  9.9 |█            █   █  █ █  █    █  ██ █  █    █      ███  ██      █   █ █    █ █  
  9.9 |█    █ █     █   █  █ ██ ██   █ ███ █  █    █ █    ███ ███ ██  ██   █ █ █  █ █  
  9.8 |█    █ ███   █  ████████ ██ █ █ ███ █ ██ ██ █████  ███ ███████ ███  █ █ █  ███  
  9.8 |██ █ █ █████ █ ████████████████████ █ █████ █████  ███████████ ████████ █  █████
  9.8 |██████ ████████████████████████████████████ ██████████████████ ████████ ████████
  9.8 |███████████████████████████████████████████████████████████████████████ ████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  79 ms |   1
  81 ms |   2
  83 ms |   1
  85 ms |   2
  87 ms |   1
  88 ms |   1
  89 ms | █  7
  90 ms |   6
  91 ms | ██  21
  92 ms | ██  25
  93 ms | ██  30
  94 ms | ████  53
  95 ms | ███  39
  96 ms | ██  25
  97 ms | ██  28
  98 ms | ████████  101
  99 ms | █████████████████████████████████  404
 100 ms | ████████████████████████████████████████  491
 101 ms | ██████████  127
 102 ms | █  15
 103 ms |   6
 104 ms |   2
 105 ms |   2
 106 ms |   3
 107 ms |   4
 108 ms | █  16
 109 ms | ███  40
 110 ms | ██████  70
 111 ms | ████████  95
 112 ms | █████  62
 113 ms | ██  23
 114 ms | █  16
 115 ms | █  17
 116 ms | █  13
 117 ms | █  10
 118 ms |   4
 119 ms |   1
 122 ms |   1
 124 ms |   1
 125 ms |   1
 129 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `18.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `8.37`
- `fps_harmonic_avg` = `9.82`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.84`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `70.00`
- `trees_built` = `173.00`
- `phase` = `2.00`
- `segment_count` = `19.00`
- `part` = `4.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194736 ms  |  Sample ticks: 3600

**FPS**  avg `9.86`, min `7.90`, p50 `9.99`, p95 `10.65`, p99 `11.00`, 1%low `8.34`, 0.1%low `7.91`, std `0.54`

**Frame time (ms)**  avg `101.74`, p50 `100.09`, p95 `112.95`, p99 `118.29`, p99.9 `121.92`, max `126.53`

**Client tick (ms)**  avg `0.63`, p95 `1.11`, max `1.99`

**Memory**  start `1240 MB`, end `1875 MB`, peak `1962 MB`, GC `11 events / 60 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                                                                            █   
  9.9 |           █                                      ██                        █   
  9.9 |           █            █            █            ██              █         █   
  9.9 |           █         █  █     █ █    █            ██       █      █         █   
  9.9 |      █    █ █     █ █  █ █  ██ █    █  █     █   ██  █ █  █ █    █ █   █  ████ 
  9.9 |  █   █    █ █   █ █ █  █ █  ██ █ █  █  █   █ █   ██  █ ██ █ █  █ █ █   █  ████ 
  9.9 |  █   █   ██ ██  █ █ █  █ █  ████ █  █  █   ███   ██  █ ████ █ ██ █ █   █  ████ 
  9.8 |  ██  █   █████  █ █ ██ █ ██ ████ ██ ██ ██  ████ ████ █ ████ █ ██ █ ██  █ ██████
  9.8 |█ ███ █  ███████ █ ██████ ██ ████ ██ ██ ███████████████ █████████ ███████ ██████
  9.8 |███████ ████████ ████████████████ █████ ████████████████████████████████████████
  9.8 |████████████████ ███████████████████████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms |   1
  87 ms |   2
  88 ms |   5
  89 ms |   3
  90 ms | █  10
  91 ms | █  11
  92 ms | ██  25
  93 ms | ███  33
  94 ms | ████  44
  95 ms | █████  53
  96 ms | █████  48
  97 ms | █████  51
  98 ms | ████████████  127
  99 ms | ████████████████████████████████████████  420
 100 ms | ███████████████████████████████████████  405
 101 ms | ████████████  121
 102 ms | ██  23
 103 ms | █  6
 104 ms |   2
 105 ms |   3
 106 ms |   1
 107 ms | █  9
 108 ms | ██  24
 109 ms | █████  48
 110 ms | ████████  85
 111 ms | ███████  69
 112 ms | █████  54
 113 ms | ██  23
 114 ms | ██  16
 115 ms | █  10
 116 ms |   5
 117 ms | █  11
 118 ms | █  13
 119 ms |   3
 120 ms |   3
 126 ms |   2
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `21.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `8.34`
- `fps_harmonic_avg` = `9.83`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.91`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `67.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`

