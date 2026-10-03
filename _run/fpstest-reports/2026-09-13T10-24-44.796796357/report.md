# FPS Test session — 2026-09-13T10:59:16.39104624+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 99.5 | 46.6 | 43.1 | 20.39 | 0.56 | 3 | 76 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 99.7 | 47.5 | 45.7 | 20.60 | 0.64 | 4 | 320 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 29.4 | 20.6 | 19.7 | 47.72 | 0.65 | 3 | 300 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.5 | 20.8 | 20.4 | 47.82 | 0.69 | 4 | 214 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 29.2 | 20.7 | 20.4 | 47.46 | 0.66 | 1 | 268 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.0 | 20.7 | 20.5 | 47.81 | 0.49 | 0 | 356 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 29.5 | 20.7 | 20.0 | 47.80 | 0.68 | 2 | 113 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 29.6 | 20.0 | 18.1 | 48.30 | 1.07 | 5 | 100 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 31.2 | 16.7 | 16.3 | 58.97 | 2.95 | 8 | 24 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 31.9 | 16.4 | 16.2 | 58.61 | 3.83 | 10 | 379 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 29.3 | 19.7 | 17.1 | 48.29 | 0.90 | 5 | 258 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 29.2 | 20.8 | 20.4 | 47.58 | 0.48 | 2 | 52 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 31.8 | 16.3 | 16.1 | 59.20 | 3.17 | 5 | 164 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.7 | 17.5 | 17.0 | 55.27 | 2.64 | 5 | 222 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 39.6 | 13.4 | 12.8 | 71.39 | 14.99 | 30 | 528 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 37.4 | 13.5 | 13.4 | 72.61 | 15.56 | 29 | 148 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 29.5 | 18.9 | 17.5 | 50.20 | 1.84 | 4 | 490 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 30.1 | 19.0 | 16.9 | 49.70 | 1.85 | 2 | 388 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.1 | 9.8 | 9.7 | 101.18 | 0.63 | 0 | 484 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 9.8 | 8.9 | n/a | 110.23 | 0.29 | 0 | 112 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 9.8 | 9.0 | n/a | 109.41 | 0.26 | 3 | 568 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 9.7 | 8.4 | n/a | 117.01 | 0.28 | 0 | 436 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 9.7 | 8.7 | n/a | 114.07 | 0.27 | 0 | 104 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 9.7 | 8.0 | n/a | 120.13 | 0.33 | 48 | 974 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 9.8 | 7.7 | n/a | 124.74 | 0.34 | 31 | 637 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 9.7 | 7.8 | n/a | 125.72 | 0.34 | 22 | 1059 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 9.7 | 7.6 | n/a | 122.85 | 0.37 | 25 | 563 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 9.7 | 7.6 | n/a | 121.81 | 0.31 | 25 | 395 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 9.7 | 8.0 | n/a | 120.78 | 0.30 | 22 | 360 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 9.7 | 8.1 | n/a | 119.72 | 0.34 | 24 | 842 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 9.7 | 7.8 | n/a | 124.45 | 0.32 | 25 | 1040 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 9.7 | 7.3 | n/a | 131.97 | 0.38 | 23 | 912 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 9.6 | 7.8 | n/a | 126.18 | 0.29 | 24 | 420 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 9.7 | 7.8 | n/a | 127.06 | 0.32 | 22 | 221 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 9.7 | 7.9 | n/a | 124.74 | 0.31 | 21 | 1220 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 9.9 | 8.7 | n/a | 113.65 | 0.25 | 0 | 60 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 9.7 | 8.2 | n/a | 117.64 | 2.59 | 3 | 404 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 9.9 | 9.3 | n/a | 106.43 | 0.26 | 1 | 68 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 9.9 | 8.8 | n/a | 112.39 | 0.27 | 0 | 124 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 9.9 | 9.1 | n/a | 109.08 | 0.26 | 0 | 140 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 9.9 | 9.4 | n/a | 105.92 | 0.27 | 0 | 140 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 9.8 | 8.1 | 7.7 | 121.01 | 0.66 | 14 | 1064 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 9.7 | 8.1 | 7.9 | 121.73 | 0.64 | 11 | 418 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.0 | 7.7 | 7.2 | 126.79 | 0.62 | 11 | 533 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.0 | 7.9 | 7.7 | 122.91 | 0.62 | 11 | 421 |

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

Category: **Particles**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `99.55`, min `41.88`, p50 `104.01`, p95 `130.89`, p99 `140.98`, 1%low `46.60`, 0.1%low `43.11`, std `97.64`

**Frame time (ms)**  avg `12.09`, p50 `9.61`, p95 `18.98`, p99 `20.39`, p99.9 `22.45`, max `23.88`

**Client tick (ms)**  avg `0.56`, p95 `0.88`, max `1.52`

**Memory**  start `665 MB`, end `716 MB`, peak `741 MB`, GC `3 events / 14 ms`

**FPS over sampling window (ASCII):**

```
200.5 |              █                                                                 
190.0 |              █                                                                 
179.4 |              █                                                                 
168.8 |              █                                                                 
158.2 |              █         █    █                                       █          
147.6 |              █         █    █     █                                ██  █       
137.0 |  █           █         █    █  █  █                                ██  █       
126.4 |  █           █         █    █  █  █                                ██  █       
115.9 | ███          █         █    █  █  █                                ██  █       
105.3 | ███          █         █    █  █  █                                ██  █       
 94.7 |█████████ ███████ █ █████ ████ ██ ████ █ █ ████ ████ ████ █ ██  █ ████ ███ █ ███
 84.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  9
   1 ms |   3
   2 ms |   1
   6 ms |   3
   7 ms | ████████████  164
   8 ms | ████████████████████████████████████████  526
   9 ms | ██████████  133
  10 ms | █  9
  11 ms |   1
  12 ms |   5
  13 ms | ██  25
  14 ms | ████████████████  205
  15 ms | ████████████████████  260
  16 ms | ██████████  137
  17 ms | ████  48
  18 ms | ███  42
  19 ms | ████  47
  20 ms | ██  25
  21 ms | █  8
  22 ms |   2
  23 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 206 | 101.7 | 20.26 |
| `dripping_water` | 240 | 206 | 100.9 | 19.45 |
| `dragon_breath` | 160 | 206 | 104.6 | 19.92 |
| `end_rod` | 240 | 206 | 101.9 | 20.33 |
| `portal` | 160 | 206 | 92.9 | 20.31 |
| `ALL_TOGETHER` | 1680 | 206 | 91.2 | 19.90 |
| `sculk_charge_pop` | 240 | 206 | 102.2 | 20.20 |
| `smoke` | 160 | 206 | 100.9 | 20.36 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `59.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `82.72`
- `fps_0p1pct_low` = `43.11`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `46.60`
- `particles_stage_smoke` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `99.69`, min `45.36`, p50 `107.00`, p95 `132.23`, p99 `378.43`, 1%low `47.48`, 0.1%low `45.70`, std `83.57`

**Frame time (ms)**  avg `12.02`, p50 `9.35`, p95 `18.75`, p99 `20.60`, p99.9 `21.48`, max `22.05`

**Client tick (ms)**  avg `0.64`, p95 `0.97`, max `1.36`

**Memory**  start `508 MB`, end `537 MB`, peak `828 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
152.6 |                                   █                                      █    █
146.4 |                                   █                                      █    █
140.2 |                                   █              █          █            █    █
134.0 |           █                       █              █          █            █    █
127.8 |        █ ██                       █              █          █            █    █
121.6 |█  █    █ ██   █                   █              █ █        █            █    █
115.3 |█  █    █ ██   █               █   █              █ █        █            █    █
109.1 |█ ██    ████   ██              █   █              █ █        █            █    █
102.9 |█ ██    ████   ██              █   █           █  █ █        █            █    █
 96.7 |█ ████  ██████ ███ █    █ █  █ █  ██ █ █ █  █  █ ████ ██ █   █  █   █   █ ██ ███
 90.5 |██████ ███████████████████████ █████████ █ █████ ████████████████ █████ ████████
 84.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms | █  11
   2 ms |   3
   5 ms |   2
   6 ms |   3
   7 ms | ███████████████  185
   8 ms | ████████████████████████████████████████  508
   9 ms | ████████████  148
  10 ms |   6
  11 ms |   3
  12 ms |   4
  13 ms | ███  32
  14 ms | ██████████████  177
  15 ms | ███████████████████  238
  16 ms | ███████████  143
  17 ms | ██████  71
  18 ms | ████  55
  19 ms | ███  34
  20 ms | ██  31
  21 ms |   5
  22 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `45.70`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `83.20`
- `preload_duration_ms` = `45.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `47.48`
- `preload_chunks` = `81.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23128 ms  |  Sample ticks: 400

**FPS**  avg `29.35`, min `19.69`, p50 `29.29`, p95 `45.46`, p99 `47.64`, 1%low `20.64`, 0.1%low `19.69`, std `6.68`

**Frame time (ms)**  avg `35.59`, p50 `34.15`, p95 `46.26`, p99 `47.72`, p99.9 `49.40`, max `50.78`

**Client tick (ms)**  avg `0.65`, p95 `0.92`, max `1.26`

**Memory**  start `558 MB`, end `624 MB`, peak `858 MB`, GC `3 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |  █                     █                                                       
 32.7 |  █       █             █             █                                         
 32.1 |  █   █   █             █          █  █                                         
 31.5 |  █   █   █        █    █        █ █  █                                         
 30.8 |  █   █   █   █  █ █    █ █      █ █  █  █            █      █        █         
 30.2 |  █   █ █ █  ██ ██ █    █ █    █ █ █  █  █          ███  █   █   █  █ █ █   █  █
 29.6 |  █ █ █████  ███████    █ █ █  █ █ █  █  █   █      ███  █   █ █ ████ █ █   █  █
 29.0 |  █ █ ██████ ████████ █ ████████ ███  ██ █ █ █      ███  █ █ █ █ ██████ █████  █
 28.4 |█ ███████████████████ █ ████████ ███  ██ █ ████  █ ████ ██ █ █ ████████ ████████
 27.8 |████████████████████████████████████████ █ █████ █████████ ████████████ ████████
 27.1 |██████████████████████████████████████████████████████████ ████████████ ████████
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  6
  21 ms | ████████  22
  22 ms | █████████  23
  23 ms | ████  10
  24 ms | ██  4
  25 ms |   1
  29 ms | █  2
  30 ms |   1
  31 ms | █████  12
  32 ms | █████████████████████████████  76
  33 ms | ████████████████████████████████████████  106
  34 ms | ██████████████████████████  70
  35 ms | ████████████  32
  36 ms | █████  14
  37 ms | █████  12
  38 ms | ██  5
  39 ms | █████  12
  40 ms | ███  8
  41 ms | ███  7
  42 ms | ███  7
  43 ms | █████  13
  44 ms | ██████████████████  47
  45 ms | ██████████████  38
  46 ms | ████████  20
  47 ms | ████  10
  48 ms | █  2
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.69`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.10`
- `preload_duration_ms` = `36.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.64`
- `preload_chunks` = `81.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23129 ms  |  Sample ticks: 400

**FPS**  avg `29.52`, min `20.43`, p50 `29.36`, p95 `45.21`, p99 `48.40`, 1%low `20.80`, 0.1%low `20.43`, std `6.68`

**Frame time (ms)**  avg `35.38`, p50 `34.07`, p95 `46.25`, p99 `47.82`, p99.9 `48.41`, max `48.94`

**Client tick (ms)**  avg `0.69`, p95 `0.89`, max `1.12`

**Memory**  start `645 MB`, end `696 MB`, peak `859 MB`, GC `4 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                                                  █                    █        
 32.7 |                                                  █                    █        
 32.1 |                      █                           █ █                  █    █   
 31.6 |                    █ █                           █ █                  ██   █   
 31.0 |  █   █ █         █ █ █              █       █ █  █ █   ██             ██   █   
 30.4 |  █   ███         █ █ █  █     █ ██  █       █ █  █ █   ██             ██ █ ██  
 29.9 |  █   ████ ██     █ █ ████     █ ██  █     █ █ █  █ █   ██ █████  ███  ██ ████  
 29.3 |  █   ████ ██ █  ██ █ ████     █ ██  █     █ ███ ██ █ █ ██ ██████ ███  ██ ████  
 28.7 |███ █ ████ ████████ █ ████  ████ ███ █ █ █ █████ ██ ███ █████████ ███  ████████ 
 28.1 |███ █ ██████████████████████████████ ███ ████████████████████████████  ████████ 
 27.6 |███████████████████████████████████████████████████████████████████████████████ 
 27.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ███  9
  21 ms | ██████  16
  22 ms | ████████████  31
  23 ms | ███  7
  24 ms | ██  6
  30 ms | ██  6
  31 ms | ████  12
  32 ms | ██████████████████████████████  79
  33 ms | ████████████████████████████████████████  107
  34 ms | █████████████████████████████  78
  35 ms | ████████████  31
  36 ms | █████  14
  37 ms | ████  10
  38 ms | ██  6
  39 ms | █  4
  40 ms | ███  8
  41 ms | ██  6
  42 ms | ███  9
  43 ms | ████████  21
  44 ms | ███████████  30
  45 ms | ████████████████  44
  46 ms | ██████  17
  47 ms | █████  14
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.43`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.26`
- `preload_duration_ms` = `32.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.80`
- `preload_chunks` = `81.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `29.17`, min `20.42`, p50 `29.30`, p95 `45.23`, p99 `47.16`, 1%low `20.72`, 0.1%low `20.42`, std `6.37`

**Frame time (ms)**  avg `35.70`, p50 `34.13`, p95 `46.13`, p99 `47.46`, p99.9 `48.94`, max `48.97`

**Client tick (ms)**  avg `0.66`, p95 `0.93`, max `1.23`

**Memory**  start `588 MB`, end `651 MB`, peak `856 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                                                                              █ 
 33.0 |                          █                       █                           █ 
 32.3 |                        █ █                       █ █ █                 █     █ 
 31.6 |                        █ █                       █ █ █             █   █     █ 
 30.9 |                   █    █ █              █        █ █ █ █           █   █     █ 
 30.2 | █      █          █    ███ █ █          █     █  █ █ █ █           █   █     █ 
 29.5 | ██    ██   █ █   ███ █ ███ █ █ █     █  ███   ██ █ ███ ███    █    █   █   █ █ 
 28.7 |████  ████  █ ██ ████ █████ █ ████   ███ ███  ███ █ ███ █████████████████████ █ 
 28.0 |█████████████ ███████ █████ ██████  ████ ███  ███ █ ███ ███████████████████████ 
 27.3 |█████████████████████ █████ ████████████ ████████ █████ ███████████████████████ 
 26.6 |███████████████████████████ ████████████████████████████████████████████████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  4
  21 ms | ███████  20
  22 ms | █████  16
  23 ms | ██████  17
  25 ms | █  2
  28 ms |   1
  29 ms |   1
  30 ms | █  3
  31 ms | ████  11
  32 ms | ████████████████████████  72
  33 ms | ████████████████████████████████████████  122
  34 ms | ███████████████████  58
  35 ms | ████████████  36
  36 ms | █████  15
  37 ms | ████  11
  38 ms | ███  9
  39 ms | ███  8
  40 ms | ██  7
  41 ms | ██  7
  42 ms | ████  12
  43 ms | ██████  17
  44 ms | ████████████  38
  45 ms | █████████████  40
  46 ms | ██████  18
  47 ms | ████  11
  48 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.42`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.01`
- `preload_duration_ms` = `31.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.72`
- `preload_chunks` = `81.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `28.95`, min `20.52`, p50 `29.37`, p95 `44.71`, p99 `47.31`, 1%low `20.75`, 0.1%low `20.52`, std `6.31`

**Frame time (ms)**  avg `35.95`, p50 `34.05`, p95 `45.62`, p99 `47.81`, p99.9 `48.65`, max `48.72`

**Client tick (ms)**  avg `0.49`, p95 `0.60`, max `0.84`

**Memory**  start `525 MB`, end `881 MB`, peak `881 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                    █                                                           
 32.3 |                    █                   █                                       
 31.6 |     █              █                   █      █                                
 30.9 | █   █ █     █      █  █  █    █ ██     █  █   █       █ █           █ █       █
 30.2 | █   █ █   ███     ██  █  █    █ ███    █  █   █       █ █  █ ██ █   ███       █
 29.5 | █   █ █   ███   █ ██  █  █  ███ ███ █  ██ ██  █ █  █  █ █  █ ██ ██  ███ █  ██ █
 28.8 | █   ███ █ ████  █ ██  █  █  ███ ███ █ ███ ██  █ █ ███ █ █ ██ ██ ███ ███ ██ ██ █
 28.1 |██ █ ███ █ ███████ ██  ████ ████ ████████████  █ █ ███ █████████ ███ ███████████
 27.4 |██████████████████ ████████ ██████████████████ ███████ █████████████ ███████████
 26.7 |███████████████████████████ ██████████████████ █████████████████████ ███████████
 26.0 |████████████████████████████████████████████████████████████████████ ███████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  5
  21 ms | ███  9
  22 ms | █████████  30
  23 ms | ███  10
  24 ms |   1
  30 ms | █  3
  31 ms | ███  8
  32 ms | ████████████████████████  77
  33 ms | ████████████████████████████████████████  128
  34 ms | ████████████████  51
  35 ms | ██████  18
  36 ms | ████████  25
  37 ms | ████  13
  38 ms | ██  5
  39 ms | ███  9
  40 ms | ██  6
  41 ms | ██  7
  42 ms | █████  15
  43 ms | █████████  29
  44 ms | ████████████████  50
  45 ms | ██████████  32
  46 ms | ███  9
  47 ms | ████  12
  48 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.52`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.82`
- `preload_duration_ms` = `53.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.75`
- `preload_chunks` = `81.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `29.49`, min `20.04`, p50 `29.39`, p95 `45.61`, p99 `48.46`, 1%low `20.71`, 0.1%low `20.04`, std `6.71`

**Frame time (ms)**  avg `35.43`, p50 `34.03`, p95 `46.61`, p99 `47.80`, p99.9 `48.99`, max `49.89`

**Client tick (ms)**  avg `0.68`, p95 `0.94`, max `1.30`

**Memory**  start `773 MB`, end `482 MB`, peak `887 MB`, GC `2 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |                                           █                                    
 32.9 |                                           █  █                                 
 32.2 |    █   █        █                         █  █   █   █       █    █            
 31.6 |    █   █  █   █ █         █               █  █   █   █       █    █            
 30.9 |    █   █  ██  █ █ █     █ █ █    █     █  █  █   █  ██  █   ██    █            
 30.3 |    █   █ ███  █ █ ███   █ █ █    █     █  █  █  ██ ███  █   ██ █  █  █    █    
 29.6 |  █ █   █ ██████ █ ███   ███ ███  █     █  █  █  ██ ███  █   ██ █  █  █    █    
 29.0 | ████   ████████ █ ███   ███████  ██    ██ █  █  █████████   ██ ██ █  ██ ████   
 28.3 | ████ ██████████ █████ █ ███████ ███████████  ████████████ ███████ █ ███ ████ ██
 27.7 |████████████████ ███████████████ ███████████  ████████████ █████████████ ███████
 27.0 |████████████████ ████████████████████████████ ████████████ █████████████████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ███  9
  21 ms | ████████  21
  22 ms | ████████  22
  23 ms | ████  11
  24 ms |   1
  28 ms |   1
  29 ms |   1
  30 ms | █  4
  31 ms | ████  10
  32 ms | ████████████████████████████████  88
  33 ms | ████████████████████████████████████████  110
  34 ms | █████████████████████████  69
  35 ms | ████████  21
  36 ms | ███████  20
  37 ms | ███  9
  38 ms | ███  7
  39 ms | ████  12
  40 ms | ██  5
  41 ms | ██  6
  42 ms | ███  8
  43 ms | ████████  22
  44 ms | ███████████████  42
  45 ms | █████████  24
  46 ms | ███████  18
  47 ms | ███████  19
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.04`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.22`
- `preload_duration_ms` = `36.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.71`
- `preload_chunks` = `81.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `29.59`, min `18.07`, p50 `29.29`, p95 `45.48`, p99 `47.97`, 1%low `20.04`, 0.1%low `18.07`, std `6.88`

**Frame time (ms)**  avg `35.40`, p50 `34.14`, p95 `46.27`, p99 `48.30`, p99.9 `51.84`, max `55.34`

**Client tick (ms)**  avg `1.07`, p95 `1.23`, max `5.40`

**Memory**  start `809 MB`, end `474 MB`, peak `909 MB`, GC `5 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 32.5 |                                █                                               
 32.0 |         █                      █                  █  █      █ █                
 31.4 |   █     █      █         █ █   █                  █  █      █ █    █      █    
 30.8 | █ █     █ █    █ ██   █  █ █   █                █ █ ██      █ ██   █      █  █ 
 30.3 | █ █     █ ███  █ ███████ █ █   █   █   █    █   █ █ ███     █ ██   █      ██ █ 
 29.7 | █ █   █ █ ██████ ███████ ████  ██  █ ███  █ █   █ █ ████ █  █ ██   █    █ ████ 
 29.1 | █ █   █ █ ██████ ███████ █████ ███ █████ ██ █  ██ █ ████ ██ █████  █ █  █ █████
 28.6 | ███████ █ ████████████████████ █████████ ██ █████ █ ████ ██████████████ █ █████
 28.0 | ███████ █ ████████████████████ ██████████████████ ██████ ████████████████ █████
 27.4 |████████ █████████████████████████████████████████ ███████████████████████ █████
 26.9 |████████ █████████████████████████████████████████ █████████████████████████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  20 ms | ███  7
  21 ms | ██████████  23
  22 ms | ████████  17
  23 ms | ████████  17
  24 ms | ████  10
  25 ms | █  3
  30 ms | ██  4
  31 ms | █████  12
  32 ms | ████████████████████████████████████████  90
  33 ms | ████████████████████████████████████████  89
  34 ms | ████████████████████████████████  71
  35 ms | █████████  21
  36 ms | ██████  14
  37 ms | ████  9
  38 ms | █████  12
  39 ms | ███  6
  40 ms | ██████  14
  41 ms | ███  7
  42 ms | ████  8
  43 ms | ██████████████  32
  44 ms | ███████████  25
  45 ms | ████████████████  36
  46 ms | ████████  18
  47 ms | ████  8
  48 ms | ████  8
  49 ms | █  2
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `18.07`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.25`
- `preload_duration_ms` = `34.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.04`
- `preload_chunks` = `81.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `31.16`, min `16.26`, p50 `29.46`, p95 `51.86`, p99 `57.16`, 1%low `16.71`, 0.1%low `16.26`, std `11.32`

**Frame time (ms)**  avg `35.55`, p50 `33.95`, p95 `53.23`, p99 `58.97`, p99.9 `60.73`, max `61.48`

**Client tick (ms)**  avg `2.95`, p95 `3.49`, max `5.23`

**Memory**  start `896 MB`, end `539 MB`, peak `921 MB`, GC `8 events / 24 ms`

**FPS over sampling window (ASCII):**

```
 40.9 |█                                          █                                    
 39.6 |█                                          █                                    
 38.4 |█                                          █                                    
 37.1 |█                                          █                                    
 35.8 |█                                          █           █       █                
 34.5 |█                                █  █      █         █ █       █     █     █    
 33.3 |█                        █   █   █  █   █  █     █   █ █ ██    █ ██  █     █    
 32.0 |█ █ █ █  █ █    █ ██   ███   █ █ █  █ █ █ ██     █   █ █ ██  █ ████  █     █    
 30.7 |█ █ █ ████ ████ ████ █ ███ █ ███ █  ████████ ██ ██ █ █ █ ███ █ ████  █     ████ 
 29.4 |███ ███████████ ██████████ █ ███ █ █████████ ███████████ ██████████ ██████ █████
 28.2 |████████████████████████████████████████████████████████ ███████████████████████
 26.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | ██  2
  16 ms | ██  2
  17 ms | ████  5
  18 ms | ████████  10
  19 ms | ███████████████████  23
  20 ms | █████  6
  21 ms | ██████████████████  21
  22 ms | █████████████████████  25
  23 ms | █████  6
  24 ms | ████████████  14
  25 ms | ██████████████  17
  26 ms | ███  4
  28 ms | █  1
  29 ms | ████████  10
  30 ms | ███████████████████████████████████████  47
  31 ms | ██████████████████  22
  32 ms | ████████████████  19
  33 ms | ████████████████████████████████████████  48
  34 ms | ████████████████  19
  35 ms | █████████████  15
  36 ms | ██████████████████████████████████  41
  37 ms | ████  5
  38 ms | █████  6
  39 ms | ███  4
  40 ms | ███  3
  41 ms | ████████  10
  42 ms | ████████  9
  43 ms | ███████████████  18
  44 ms | █████████████  15
  45 ms | ██████████████████  22
  46 ms | ████████████████  19
  47 ms | ████████████████  19
  48 ms | █████████████████  20
  49 ms | ████████  9
  50 ms | ████  5
  51 ms | ███████  8
  52 ms | ██  2
  53 ms | ██████  7
  54 ms | ██  2
  55 ms | ███  4
  56 ms | ████  5
  57 ms | ███  4
  58 ms | ████  5
  59 ms | ███  3
  60 ms | █  1
  61 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.26`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.13`
- `preload_duration_ms` = `33.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `16.71`
- `preload_chunks` = `81.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `31.85`, min `16.16`, p50 `29.77`, p95 `52.74`, p99 `74.89`, 1%low `16.44`, 0.1%low `16.16`, std `13.02`

**Frame time (ms)**  avg `35.47`, p50 `33.59`, p95 `54.61`, p99 `58.61`, p99.9 `61.71`, max `61.88`

**Client tick (ms)**  avg `3.83`, p95 `5.40`, max `6.63`

**Memory**  start `547 MB`, end `634 MB`, peak `927 MB`, GC `10 events / 22 ms`

**FPS over sampling window (ASCII):**

```
 47.2 |                                                       █                        
 45.5 |                                                       █                        
 43.7 |                                                       █                        
 41.9 |                   █                                   █                        
 40.1 |                   █ █                                 █                        
 38.3 |                   █ █             █   █               █                        
 36.5 |       █           █ █      █  █   █   █ █             █                        
 34.8 |       █           █ █      █  █   █   █ █           █ █       █                
 33.0 |    ██ █  █  █     █ █      █  █   █   █ ██    █ █ █ █ █   █ █ █  ███ █      ██ 
 31.2 |██ ██████ █  ██ ████ █ █  ████ ██  ██ █████ █ ██ █ █ █ █  ██ █ ███████████ █ ██ 
 29.4 |████████████ ███████ █████████████████████████████████ █ ███ ███████████████████
 27.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
   9 ms | ████  3
  10 ms | █  1
  11 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | ██████████████  10
  18 ms | █████████████████  12
  19 ms | ███████████████████  13
  20 ms | ████████████████  11
  21 ms | ███████████████████████████████  22
  22 ms | ██████████████████████████  18
  23 ms | █████████████████████████████  20
  24 ms | ███████████  8
  25 ms | ████████████████  11
  26 ms | ██████████████  10
  27 ms | ████████████████████  14
  28 ms | █████████████████████████████████  23
  29 ms | ██████████████████████████  18
  30 ms | ████████████████████████████████████████  28
  31 ms | ███████████████████████  16
  32 ms | ████████████████████████  17
  33 ms | ████████████████████████████████████  25
  34 ms | █████████████████████  15
  35 ms | ████████████████████  14
  36 ms | ███████████████████████  16
  37 ms | ███████████████████████████  19
  38 ms | ████████████████████  14
  39 ms | ██████████  7
  40 ms | █████████  6
  41 ms | ██████████████  10
  42 ms | ██████████  7
  43 ms | ██████████████  10
  44 ms | ███████████████████  13
  45 ms | ███████████████████  13
  46 ms | ███████████████████████  16
  47 ms | ███████████████████████████████  22
  48 ms | █████████████████████  15
  49 ms | ███████████████████████████  19
  50 ms | █████████████  9
  51 ms | ███████████  8
  52 ms | ███████████  8
  53 ms | █████████  6
  54 ms | ██████████  7
  55 ms | ███████████  8
  56 ms | █████████  6
  57 ms | ███████  5
  58 ms | ███  2
  60 ms | ███  2
  61 ms | ████  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `16.16`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `21.00`
- `fps_harmonic_avg` = `28.20`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `16.44`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `29.35`, min `17.10`, p50 `29.17`, p95 `44.43`, p99 `46.87`, 1%low `19.74`, 0.1%low `17.10`, std `6.05`

**Frame time (ms)**  avg `35.31`, p50 `34.28`, p95 `45.96`, p99 `48.29`, p99.9 `54.19`, max `58.48`

**Client tick (ms)**  avg `0.90`, p95 `1.06`, max `1.78`

**Memory**  start `670 MB`, end `508 MB`, peak `929 MB`, GC `5 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                  █                                                             
 33.0 |                  █                          █                                  
 32.3 |                  █                          █               █                  
 31.7 |                  █       █                  █     █         █                  
 31.0 | █      █         █       █                  █   █ █        ██                █ 
 30.3 | █     ██         █     █ █ ██ ███       █   ██  █ █        ██      ██    █   █ 
 29.7 | █   █ ██ █    █ ██     █ █ ██████       █   ██ ██ ██  █    ██      ███   █ █ █ 
 29.0 | ██ █████ █  ███████ █ ██ █████████ █    █ █ ████████ ███ █ ████  ██████  █ █ ██
 28.3 | ████████ ██ ████████████ █████████ ██████ █ ████████████ ██████ ████████ █ █ ██
 27.7 | ████████████████████████ ██████████████████ ████████████ ███████████████ ██████
 27.0 |█████████████████████████ ██████████████████████████████████████████████████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  19 ms |   1
  20 ms | █  3
  21 ms | ██████  14
  22 ms | █████████  21
  23 ms | ████  9
  24 ms | ███  7
  31 ms | ███████  16
  32 ms | ████████████████████████████████████  88
  33 ms | ████████████████████████████████████████  97
  34 ms | █████████████████████████████████████  90
  35 ms | ███████████████  37
  36 ms | █████████  21
  37 ms | █████████  21
  38 ms | █████  12
  39 ms | ████  9
  40 ms | ████  10
  41 ms | ██  5
  42 ms | █████  12
  43 ms | ███████  17
  44 ms | ████████  19
  45 ms | ████████████  29
  46 ms | █████  13
  47 ms | ███  7
  48 ms | ██  6
  50 ms |   1
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `52.00`
- `fps_1pct_low` = `19.74`
- `fps_harmonic_avg` = `28.32`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `17.10`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `29.21`, min `20.37`, p50 `29.49`, p95 `44.81`, p99 `46.56`, 1%low `20.77`, 0.1%low `20.37`, std `6.22`

**Frame time (ms)**  avg `35.57`, p50 `33.91`, p95 `45.95`, p99 `47.58`, p99.9 `48.56`, max `49.10`

**Client tick (ms)**  avg `0.48`, p95 `0.63`, max `0.76`

**Memory**  start `864 MB`, end `808 MB`, peak `916 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 32.0 |        █                                                                       
 31.6 |        █                           █                                           
 31.2 |        █                           █ █                                       █ 
 30.8 |        ██            ██            █ ██  █                   ██        █     █ 
 30.4 |        ██            ██   █      █ █ ██  █              █    ██        █     █ 
 29.9 | █    █ ██         ██ ██ █ █ █    █ █ ███ █       █   █ ██   ███     █  █     █ 
 29.5 | █    █ ██         ██ ██ ███ ████ █ █ ███ █  █    █  ██ ██  ████   █ █ ██     █ 
 29.1 | █    █ ██ █     █ ██ ██████ ████ █ █ ███ █  █   ██  █████ █████ ███ █ ███ ██ █ 
 28.7 | █  █ █ ██ █   ███ ██ ██████ ████ █ █ ███ ██ ██████  █████ █████ █████ ███ ██ █ 
 28.3 | █ █████████ █ ██████ ██████ ████████ ██████ ██████  █████ ███████████ ███ ██ █ 
 27.9 |████████████████████████████████████████████ █████████████ ████████████████████ 
 27.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms |   1
  21 ms | █████  21
  22 ms | █████  23
  23 ms | ██  11
  24 ms |   2
  29 ms |   1
  30 ms | █  5
  31 ms | ██  7
  32 ms | █████████  42
  33 ms | ████████████████████████████████████████  178
  34 ms | █████████  42
  35 ms | ███████  32
  36 ms | ███  15
  37 ms | ████  19
  38 ms | ████  17
  39 ms | ██  9
  40 ms | ██  9
  41 ms | █  5
  42 ms | █  5
  43 ms | ████  18
  44 ms | █████████  39
  45 ms | ████████  34
  46 ms | ███  15
  47 ms | ██  8
  48 ms |   2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `20.37`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `47.00`
- `fps_harmonic_avg` = `28.11`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `20.77`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `31.84`, min `16.08`, p50 `29.22`, p95 `51.54`, p99 `73.03`, 1%low `16.33`, 0.1%low `16.08`, std `13.35`

**Frame time (ms)**  avg `35.28`, p50 `34.22`, p95 `53.04`, p99 `59.20`, p99.9 `62.03`, max `62.19`

**Client tick (ms)**  avg `3.17`, p95 `4.94`, max `6.56`

**Memory**  start `767 MB`, end `783 MB`, peak `931 MB`, GC `5 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 43.8 |        █                                                                █      
 42.3 |        █                                     █                          █      
 40.7 |        █                                     █        █                 █      
 39.2 |        █                 █                   █        █                 █      
 37.7 |        █                 █                   █        █                 █      
 36.2 |    █   █                 █              █    █        █                ██      
 34.6 |█   ██  █  █   █ █ █      █              █    █        █                ██      
 33.1 |██  ██  █  █  ██ █ █ █  █ ██             ██   █      █ █    █    █    █ ██      
 31.6 |██████ ███ █████ █ ████ ████  █       █ ███ ███████ ████ █  █    █    █ ██ █    
 30.1 |██████████████████ ████ ███████ █  ███████████████████████████  ██████████ █   █
 28.5 |███████████████████████ ██████████████████████████████████████████████████ █████
 27.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
   7 ms | █  1
   9 ms | ██  2
  11 ms | ██  2
  15 ms | █  1
  16 ms | █████  5
  17 ms | ███████  7
  18 ms | ███████  7
  19 ms | ███████████████  15
  20 ms | ████████████  12
  21 ms | ███████████████████████  24
  22 ms | ████████████████████  21
  23 ms | █████████████  13
  24 ms | █████████████████  17
  25 ms | ██████  6
  26 ms | ████  4
  27 ms | ████  4
  28 ms | ██  2
  29 ms | █████████  9
  30 ms | ████████████████████████████████████████  41
  31 ms | █████████████████████████  26
  32 ms | ████████████████████  21
  33 ms | ████████████████████████████████████  37
  34 ms | ███████████████████████  24
  35 ms | ████████████████████  21
  36 ms | ████████████████████████████  29
  37 ms | ███████████  11
  38 ms | ████████████████  16
  39 ms | ████████████  12
  40 ms | ██  2
  41 ms | ████████  8
  42 ms | ████████  8
  43 ms | █████████  9
  44 ms | █████████████  13
  45 ms | ███████████████████  19
  46 ms | █████████████  13
  47 ms | ████████████████████  21
  48 ms | ████████████████  16
  49 ms | ████████████  12
  50 ms | ███████████  11
  51 ms | ███████  7
  52 ms | ███████  7
  53 ms | █████████  9
  54 ms | ███████  7
  55 ms | ██  2
  56 ms | █  1
  57 ms | ███  3
  59 ms | ███  3
  61 ms | ████  4
  62 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.18`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `16.08`
- `preset_long` = `0.00`
- `preload_duration_ms` = `154.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.34`
- `fps_1pct_low` = `16.33`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `30.73`, min `17.03`, p50 `28.89`, p95 `50.85`, p99 `56.79`, 1%low `17.55`, 0.1%low `17.03`, std `9.50`

**Frame time (ms)**  avg `35.32`, p50 `34.62`, p95 `51.23`, p99 `55.27`, p99.9 `58.46`, max `58.74`

**Client tick (ms)**  avg `2.64`, p95 `4.36`, max `5.92`

**Memory**  start `771 MB`, end `446 MB`, peak `994 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 38.6 |  █                                                                             
 37.5 |  █     █                                                                       
 36.4 |  █     █                                                                       
 35.3 |  █  █  █     █  █                                                              
 34.3 |  █  █  █     █  █                               █                              
 33.2 |███  █ ██     █  █  █                            █      █                █      
 32.1 |████ █ ███    █ ██ ██ █   █         █       █    █     ██         █     ██   █  
 31.0 |██████ ████████ █████ ███ █   █  █  █  █  █ █   ██ █ █ ██    █    ██ █  ██   █  
 29.9 |█████████████████████ ███ ███ █  █ ██  █  █ ███ ██ ███ ███ █ █  █ ████ ███   █ █
 28.8 |█████████████████████████████ ███████ ██ ████████████████████████ ████████████ █
 27.7 |█████████████████████████████ ██████████████████████████████████████████████████
 26.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  2
  17 ms | █████  8
  18 ms | ████████  12
  19 ms | █████  8
  20 ms | ███████  10
  21 ms | ███████████████████  28
  22 ms | ████████████  18
  23 ms | ███████████  16
  24 ms | ████  6
  25 ms | █████  7
  28 ms | ██  3
  29 ms | ██████  9
  30 ms | ████████  12
  31 ms | ███████████████████████  34
  32 ms | ███████████████████████  34
  33 ms | ████████████████████████████████████████  59
  34 ms | ██████████████████████  33
  35 ms | ███████████████████████████████████  51
  36 ms | █████████████████  25
  37 ms | █████████  14
  38 ms | ██████  9
  39 ms | ████  6
  40 ms | ████  6
  41 ms | ██  3
  42 ms | █████  8
  43 ms | ███████  10
  44 ms | ████████████  17
  45 ms | █████████████████  25
  46 ms | ██████████████  20
  47 ms | ████████  12
  48 ms | ████  6
  49 ms | █████████  14
  50 ms | ██████  9
  51 ms | ███████  10
  52 ms | ████  6
  53 ms | ███  4
  54 ms | ███  4
  55 ms | ███  4
  56 ms | █  1
  57 ms | █  1
  58 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.42`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `17.03`
- `preset_long` = `0.00`
- `preload_duration_ms` = `38.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.31`
- `fps_1pct_low` = `17.55`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23078 ms  |  Sample ticks: 400

**FPS**  avg `39.61`, min `12.78`, p50 `29.24`, p95 `106.56`, p99 `195.27`, 1%low `13.42`, 0.1%low `12.78`, std `33.21`

**Frame time (ms)**  avg `35.86`, p50 `34.20`, p95 `65.47`, p99 `71.39`, p99.9 `78.18`, max `78.23`

**Client tick (ms)**  avg `14.99`, p95 `20.83`, max `29.36`

**Memory**  start `528 MB`, end `423 MB`, peak `1056 MB`, GC `30 events / 100 ms`

**FPS over sampling window (ASCII):**

```
 73.2 |                        █                                                       
 69.1 |                        █                                                       
 65.1 |        █               █     █                                                 
 61.0 |        █           █   █     █   █      ██             █                       
 57.0 |       ██    █      █   █     █   █  █   ██             █     █                 
 52.9 |       ██    █      █   █ █   █   █  █   ██             █     █                 
 48.9 |       ██    █      █   █ █   █   █  █   ██        █    █     █                 
 44.8 |   █   ██ █  █      █   █ █   █   █  █   ███      ██    ██    ██   █         █  
 40.8 |   █   ██ █  █      █   █ █   █  ███ █   ███      ██    ██    ██   █         █  
 36.7 |  ██   ████████     █ ███████ █ ████████ ███ ███ ███    ██  █ ████ ██  ███  ███ 
 32.7 |████ ██████████ █████ ███████ ██████████████████ ███ █████ ██ ██████████████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ██  1
   4 ms | ████████  5
   5 ms | ██████  4
   6 ms | ████████  5
   7 ms | █████  3
   8 ms | ███████████████  10
   9 ms | █████  3
  10 ms | ███  2
  12 ms | █████████  6
  13 ms | █████████  6
  14 ms | ████████  5
  15 ms | ██████████████████  12
  16 ms | ██████████████████████████  17
  17 ms | █████████████████████████████  19
  18 ms | ████████████████████████████████████████  26
  19 ms | ███████████████████████  15
  20 ms | ████████████  8
  21 ms | ████████  5
  22 ms | ███████████████  10
  23 ms | █████  3
  24 ms | █████████████████  11
  25 ms | █████████  6
  26 ms | ██████████████████  12
  27 ms | ████████  5
  28 ms | █████████████████  11
  29 ms | ████████████  8
  30 ms | ██  1
  31 ms | ██████████████████  12
  32 ms | ██████████████████████████████████  22
  33 ms | ████████████████████████████████  21
  34 ms | █████████████████████████████  19
  35 ms | ████████████████████  13
  36 ms | ████████████████████  13
  37 ms | ████████████  8
  38 ms | █████████  6
  39 ms | ███████████  7
  40 ms | ████████████  8
  41 ms | ████████████  8
  42 ms | ███████████  7
  43 ms | █████████  6
  44 ms | ████████████  8
  45 ms | ███████████████  10
  46 ms | ██████  4
  47 ms | ██████████████  9
  48 ms | █████████████████  11
  49 ms | ██████████████  9
  50 ms | ██████████████████████  14
  51 ms | ███████████████  10
  52 ms | █████████████████  11
  53 ms | █████████████████████████  16
  54 ms | ████████  5
  55 ms | ██  1
  56 ms | ███████████  7
  57 ms | ██████  4
  58 ms | █████████  6
  59 ms | ███  2
  60 ms | ████████  5
  61 ms | ████████████  8
  62 ms | ████████  5
  63 ms | ████████  5
  64 ms | ████████████  8
  65 ms | ██████  4
  66 ms | ██████  4
  67 ms | ████████  5
  68 ms | █████████  6
  69 ms | ███  2
  70 ms | █████  3
  72 ms | █████  3
  73 ms | ██  1
  78 ms | ███  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `44.00`
- `falling_blocks_landed` = `22143.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.88`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.78`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4809.20`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.42`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `37.40`, min `13.40`, p50 `29.18`, p95 `88.95`, p99 `166.79`, 1%low `13.49`, 0.1%low `13.40`, std `29.34`

**Frame time (ms)**  avg `36.09`, p50 `34.28`, p95 `63.43`, p99 `72.61`, p99.9 `74.62`, max `74.64`

**Client tick (ms)**  avg `15.56`, p95 `21.35`, max `26.52`

**Memory**  start `950 MB`, end `858 MB`, peak `1099 MB`, GC `29 events / 95 ms`

**FPS over sampling window (ASCII):**

```
 70.5 |                                                                 █              
 66.3 |                                █                          █     █              
 62.1 |                                █                          █    ██              
 58.0 |                                █                          █    ██              
 53.8 |          █                     █                     █   ███   ██              
 49.6 |          █               ██    █         █          ██   ███   ██        █     
 45.4 |          █          █    ██    █         █          ██   ███   ██        █     
 41.3 |     █    █   █ █   ██    ██    █ █       █     █    ██   ███  ███        █  █  
 37.1 |     █ █  █ █ █ ██████ █████    █ ██ █ █  █   ████ █ ████ ███  ███ █      █ ██  
 32.9 | ███ ████████ █ ██████ █████ ███████ ████ █ ██████ ██████████  ██████ █ █ █ ████
 28.7 |████ ████████████████████████████████████ ██████████████████████████████████████
 24.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ██  1
   4 ms | ███  2
   5 ms | █████  3
   6 ms | █████  3
   7 ms | █████  3
   8 ms | ███████  4
   9 ms | ████████████  7
  10 ms | ███████  4
  11 ms | ████████  5
  12 ms | ███  2
  13 ms | ███  2
  14 ms | █████  3
  15 ms | ███████████████████████████████████  21
  16 ms | ████████████████████████████  17
  17 ms | ███████████████████████████  16
  18 ms | ███████████████████████████  16
  19 ms | ██  1
  20 ms | ██████████  6
  21 ms | █████████████  8
  22 ms | █████████████████  10
  23 ms | ██████████████████████  13
  24 ms | ████████  5
  25 ms | ███████████████  9
  26 ms | █████████████  8
  27 ms | ██████████████████████████████  18
  28 ms | ████████████  7
  29 ms | █████████████████  10
  30 ms | ████████████████████  12
  31 ms | ███████████████████████████  16
  32 ms | ████████████████████████████████████████  24
  33 ms | ██████████████████████████████  18
  34 ms | ██████████████████  11
  35 ms | ██████████  6
  36 ms | ███████████████  9
  37 ms | ███████████████████████████  16
  38 ms | █████████████████  10
  39 ms | ██████████████████  11
  40 ms | ██████████  6
  41 ms | ███████████████  9
  42 ms | ████████████  7
  43 ms | █████████████  8
  44 ms | █████████████████  10
  45 ms | ████████████  7
  46 ms | ████████████████████████████████  19
  47 ms | █████████████████  10
  48 ms | ██████████████████  11
  49 ms | ███████████████████████████  16
  50 ms | ██████████████████  11
  51 ms | ██████████████████████  13
  52 ms | ████████  5
  53 ms | ████████████  7
  54 ms | ███  2
  55 ms | ███████  4
  56 ms | █████████████  8
  57 ms | ███  2
  58 ms | ████████████  7
  59 ms | ███████████████  9
  60 ms | ██████████  6
  61 ms | ████████  5
  62 ms | ██████████  6
  63 ms | █████  3
  64 ms | ██████████  6
  65 ms | ███  2
  66 ms | █████  3
  67 ms | █████  3
  69 ms | ███  2
  70 ms | ██  1
  71 ms | ███  2
  72 ms | ███  2
  73 ms | ██  1
  74 ms | ███████  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `56.00`
- `falling_blocks_landed` = `28976.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.71`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.40`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4798.81`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.49`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `29.51`, min `17.54`, p50 `28.95`, p95 `45.62`, p99 `50.55`, 1%low `18.92`, 0.1%low `17.54`, std `7.06`

**Frame time (ms)**  avg `35.57`, p50 `34.55`, p95 `47.03`, p99 `50.20`, p99.9 `57.00`, max `57.01`

**Client tick (ms)**  avg `1.84`, p95 `2.54`, max `3.28`

**Memory**  start `602 MB`, end `800 MB`, peak `1092 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |              █                                                                 
 34.1 |              █                                                                 
 33.4 |              █                                                                 
 32.7 |         █    █ █                                                  █            
 31.9 |      █  █    █ █   █                █                             █           █
 31.2 |      █  █    █ █   █ █              █                █            █   █       █
 30.5 | █    █  █ █  ███   █ █              █ █    █       █ █  █         █ █ █ █ █   █
 29.8 | ██   ████ ██ ███ █ █ █   ██ ███   █ █ █ █  ███ █ █ ███  ██        ███ █ █ █ █ █
 29.1 | ██  ████████ ███ █ █ █ ████ ████ ██ █ █ █  ███ █ █ ███ ███   █ ██ ███ █ █ █████
 28.4 |████ ████████ ███████ ██████ ████ ██ █ █ ██ ███ █ █████ ███████ ████████████████
 27.7 |█████████████ ███████ ███████████ ██ ██████ ████████████████████████████████████
 27.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  18 ms | █  1
  19 ms | ███  6
  20 ms | █████  9
  21 ms | ███████  12
  22 ms | █████████  16
  23 ms | ███████  13
  24 ms | ███████  12
  25 ms | █  2
  29 ms | █  1
  30 ms | ███████  13
  31 ms | █████████████████████████████  53
  32 ms | ██████████████████████████  47
  33 ms | ████████████████████████████████████████  73
  34 ms | ██████████████████████  40
  35 ms | ███████████████████████████  49
  36 ms | █████████████  24
  37 ms | ███████████  20
  38 ms | ████  8
  39 ms | █████  10
  40 ms | ███████  12
  41 ms | ████  8
  42 ms | █████  9
  43 ms | ████████  14
  44 ms | ██████████████████  32
  45 ms | ██████████  19
  46 ms | ███████████████  28
  47 ms | █████████  16
  48 ms | ██  3
  49 ms | ██  4
  50 ms | ██  4
  51 ms | █  1
  56 ms | █  1
  57 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `55.00`
- `falling_blocks_landed` = `3626.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `28.11`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `17.54`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.24`
- `falling_blocks_alive_max` = `833.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `18.92`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `30.13`, min `16.91`, p50 `28.64`, p95 `47.58`, p99 `51.53`, 1%low `18.95`, 0.1%low `16.91`, std `9.27`

**Frame time (ms)**  avg `35.44`, p50 `34.91`, p95 `47.48`, p99 `49.70`, p99.9 `57.40`, max `59.12`

**Client tick (ms)**  avg `1.85`, p95 `2.49`, max `4.34`

**Memory**  start `723 MB`, end `952 MB`, peak `1111 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 41.9 |           █                                                                    
 40.4 |           █                                                                    
 39.0 |           █                                                                    
 37.5 |           █ █                                                                  
 36.1 |           █ █                                                                  
 34.6 |           █ █      █                                                           
 33.2 |           █ █      █      █              █ █                                 █ 
 31.7 | █  █   ██████      █      █  █  █    █   █ ██ █         █            █       █ 
 30.3 | █  █ ████████   ██ █ █  █ █  █ ███ █ █ █ █ ████ █     █ █    ███ █████ █ ███ █ 
 28.9 |██ ███████████ ██████ █  █ ██████████████ ███████████████████████████████████ ██
 27.4 |██ ████████████████████ ████████████████████████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms |   1
  10 ms |   1
  18 ms | █  3
  19 ms | ████  9
  20 ms | ███████  15
  21 ms | █████████████  27
  22 ms | ██████  13
  23 ms | █████  11
  24 ms | ████  8
  25 ms |   1
  26 ms |   1
  29 ms |   1
  30 ms | █████  10
  31 ms | █████████████████████  42
  32 ms | ████████████████  32
  33 ms | ████████████████████████████████████████  81
  34 ms | ██████████████  28
  35 ms | ████████████████████████████████  64
  36 ms | ███████████  22
  37 ms | ███████  15
  38 ms | █████  11
  39 ms | ████  9
  40 ms | █  3
  41 ms | ████  8
  42 ms | ████  8
  43 ms | █████████  18
  44 ms | ██████████████  29
  45 ms | █████████████  27
  46 ms | ███████████  23
  47 ms | ███████████  23
  48 ms | ██████  13
  49 ms | █  2
  50 ms | █  2
  51 ms |   1
  56 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `60.00`
- `falling_blocks_landed` = `3430.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `28.21`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `16.91`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `617.77`
- `falling_blocks_alive_max` = `833.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `18.95`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `28.13`, min `9.66`, p50 `29.12`, p95 `45.11`, p99 `48.31`, 1%low `9.77`, 0.1%low `9.66`, std `7.39`

**Frame time (ms)**  avg `39.23`, p50 `34.34`, p95 `99.74`, p99 `101.18`, p99.9 `103.02`, max `103.50`

**Client tick (ms)**  avg `0.63`, p95 `0.81`, max `1.36`

**Memory**  start `517 MB`, end `1001 MB`, peak `1001 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |                             █                         █                        
 32.2 |  █          █     █         █          █     █ █      █  █                     
 31.0 |█ █        █ █     █   ██    ██       █ █   █ █ █      █  █                 ██  
 29.7 |███       ██ █ █   ██  ██  █ ██     ███ █  ██ ███    █ █  █ █ █         ██████  
 28.4 |███ ███ █ ██████████████████ ████████████████ ████████ ████ ███████████████████ 
 27.2 |█████████████████████████████████████████████ █████████████████████████████████ 
 25.9 |███████████████████████████████████████████████████████████████████████████████ 
 24.7 |███████████████████████████████████████████████████████████████████████████████ 
 23.4 |███████████████████████████████████████████████████████████████████████████████ 
 22.1 |███████████████████████████████████████████████████████████████████████████████ 
 20.9 |███████████████████████████████████████████████████████████████████████████████ 
 19.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ██  6
  21 ms | █████  15
  22 ms | █████  14
  23 ms | ██  6
  31 ms | █  4
  32 ms | ███████████████████  55
  33 ms | ████████████████████████████████████████  118
  34 ms | ███████████████████████  69
  35 ms | █████████████  39
  36 ms | █████████  26
  37 ms | █████  15
  38 ms | ██  5
  39 ms | ████  12
  40 ms | ██  7
  41 ms | ███  9
  42 ms | █  3
  43 ms | █  2
  44 ms | ████  12
  45 ms | █████  16
  46 ms | ████████  23
  47 ms | ████  13
  48 ms | █  3
  49 ms | █  3
  50 ms |   1
  94 ms |   1
  98 ms |   1
  99 ms | █  3
 100 ms | ██████  18
 101 ms | █  4
 102 ms | █  2
 103 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `9.77`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `25.49`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `9.66`
- `seed` = `5099.00`
- `preload_duration_ms` = `33.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23142 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.72`, p50 `9.86`, p95 `10.05`, p99 `10.14`, 1%low `8.86`, 0.1%low `n/a`, std `0.26`

**Frame time (ms)**  avg `102.06`, p50 `101.44`, p95 `107.89`, p99 `110.23`, p99.9 `113.96`, max `114.69`

**Client tick (ms)**  avg `0.29`, p95 `0.42`, max `1.68`

**Memory**  start `554 MB`, end `666 MB`, peak `666 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |    █                                  █    █                                   
 10.0 |    ██             ████  ██            █ ██ ██ █              █      █          
  9.9 |   ███             ████ ████           █ ████████     █      ██      █████   █  
  9.9 |  █████            ████ ████   █       ███████████    █     ████     ██████ ██  
  9.8 |  █████     █  ██  ████ █████  █       ████████████ ███   █ ████  █████████ ██ █
  9.7 |███████     █ ███ ███████████  █       ████████████ ███   ███████ █████████ ██ █
  9.7 |███████ ███ █ ███████████████  ██ █    ████████████ █████ ██████████████████████
  9.6 |███████ █████ ███████████████████ █ █ █████████████ █████ ██████████████████████
  9.6 |███████ █████████████████████████ ███ ██████████████████████████████████████████
  9.5 |█████████████████████████████████ ██████████████████████████████████████████████
  9.4 |█████████████████████████████████ ██████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms | █  1
  98 ms | ██  3
  99 ms | █████████  14
 100 ms | ████████████████████████████████████████  62
 101 ms | ██████████████████████████  41
 102 ms | ██████████████████  28
 103 ms | ██████████  15
 104 ms | ███  5
 105 ms | ██████  9
 106 ms | ███  5
 107 ms | ███  4
 108 ms | █  2
 109 ms | ███  4
 110 ms | █  2
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.86`
- `fps_harmonic_avg` = `9.80`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23162 ms  |  Sample ticks: 400

**FPS**  avg `9.76`, min `8.96`, p50 `9.83`, p95 `10.04`, p99 `10.11`, 1%low `9.04`, 0.1%low `n/a`, std `0.24`

**Frame time (ms)**  avg `102.48`, p50 `101.75`, p95 `107.53`, p99 `109.41`, p99.9 `111.18`, max `111.57`

**Client tick (ms)**  avg `0.26`, p95 `0.38`, max `1.59`

**Memory**  start `535 MB`, end `668 MB`, peak `1103 MB`, GC `3 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                             █                                                  
 10.0 |                   ███       ███             █        ██ █               ██     
  9.9 |  ██      █  █     ████      ███            ████      ████  █ █          ███    
  9.8 |  ██ █   ██  █  ██ ████  ██ ████  █ █ ██ █  ████ █ █  █████ █ █   █  █  █████ ██
  9.7 |  ████  ███  █████ █████████████ ██ ███████ ████ █ ████████████  ██  █  █████ ██
  9.6 |  ████  ██████████ █████████████████████████████ ███████████████████ █ ██████ ██
  9.5 |  ████ ███████████ █████████████████████████████ ███████████████████ █ █████████
  9.4 |  ████████████████ ███████████████████████████████████████████████████ █████████
  9.3 |█ ████████████████████████████████████████████████████████████████████ █████████
  9.2 |█ ████████████████████████████████████████████████████████████████████ █████████
  9.2 |█ ██████████████████████████████████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | ███  3
  99 ms | █████████████████  19
 100 ms | ████████████████████████████████████████  45
 101 ms | ███████████████████████████████  35
 102 ms | ██████████████████████████  29
 103 ms | ██████████████████  20
 104 ms | ██████████  11
 105 ms | ████████  9
 106 ms | ████████  9
 107 ms | ██████  7
 108 ms | ████  5
 109 ms | ███  3
 111 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `n/a`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `9.76`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `9.04`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23064 ms  |  Sample ticks: 400

**FPS**  avg `9.69`, min `8.31`, p50 `9.74`, p95 `10.57`, p99 `11.39`, 1%low `8.36`, 0.1%low `n/a`, std `0.51`

**Frame time (ms)**  avg `103.50`, p50 `102.64`, p95 `113.67`, p99 `117.01`, p99.9 `120.02`, max `120.28`

**Client tick (ms)**  avg `0.28`, p95 `0.43`, max `1.50`

**Memory**  start `656 MB`, end `1092 MB`, peak `1092 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                    █                                           
 10.5 |                                    █                                           
 10.3 |                      █             █                                  █        
 10.2 |                      █             █   █  █                           █        
 10.0 |███   ██     █    █   █             █   █  █ █                         █  █     
  9.9 |███   ████   █  █ ██  █  █       ██ █   █  █ █                     ██ ███ █     
  9.7 |███   █████  █  █ ██  █ ██  ██   ██ █   █  ███ ███  ██ █  ███  ██  ██ ███ █ █   
  9.6 |███ █ █████████ ████  █ ███ ███████ █   █ █████████ █████████████████ ███ █ ███ 
  9.4 |█████ ███████████████ █ ███████████ █ ███ ███████████████████████████ █████ ███ 
  9.3 |█████ ███████████████ █████████████ █████ ██████████████████████████████████████
  9.1 |█████ █████████████████████████████ █████ ██████████████████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  87 ms | ███  2
  89 ms | ███  2
  91 ms | ███  2
  92 ms | █  1
  93 ms | ███  2
  95 ms | █  1
  96 ms | █  1
  97 ms | █  1
  98 ms | ███████  5
  99 ms | ████████████████████████  16
 100 ms | █████████████████████████  17
 101 ms | ████████████████████████████████████████  27
 102 ms | ██████████████████████████████████  23
 103 ms | ██████████████████  12
 104 ms | █████████████████████  14
 105 ms | ████████████████████████  16
 106 ms | █████████████  9
 107 ms | ████████████████████████  16
 108 ms | ███  2
 109 ms | ██████  4
 110 ms | ███  2
 111 ms | ███  2
 112 ms | ████  3
 113 ms | ███████  5
 114 ms | ████  3
 116 ms | ███  2
 118 ms | █  1
 120 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `8.36`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `9.66`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `4027.00`
- `preload_duration_ms` = `0.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23063 ms  |  Sample ticks: 400

**FPS**  avg `9.73`, min `8.67`, p50 `9.82`, p95 `10.10`, p99 `10.99`, 1%low `8.71`, 0.1%low `n/a`, std `0.42`

**Frame time (ms)**  avg `103.01`, p50 `101.83`, p95 `112.55`, p99 `114.07`, p99.9 `115.14`, max `115.38`

**Client tick (ms)**  avg `0.27`, p95 `0.37`, max `1.61`

**Memory**  start `673 MB`, end `777 MB`, peak `777 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                         █                                                      
 10.3 |                         █                                                      
 10.2 |                         █                                                      
 10.1 | █       █ ██ █          █                                 █  █      █   █      
  9.9 |██    █ ██████████  █   ██ █  █      █                  █  ████    ████  █ ██   
  9.8 |███ ███ ██████████  █ █ ██ █  █      █ █    █         █ █  ████   ██████ █ ██   
  9.7 |███ ██████████████ ██ █ ██ █  █  █████ ███  ██ █ █  █ █ █  ████ █ ██████ █ ██  █
  9.6 |██████████████████ ████ ████  ██ █████ ███ █████ ████ ███ █████ █ ██████ ███████
  9.4 |██████████████████ ████ ████  ███████████████████████ ██████████████████ ███████
  9.3 |██████████████████ ████ ████████████████████████████████████████████████████████
  9.2 |██████████████████ ████ ████████████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  89 ms | █  1
  91 ms | █  2
  93 ms | █  1
  94 ms | █  2
  95 ms | █  1
  98 ms | ██  3
  99 ms | █████████  12
 100 ms | ████████████████████████████████████████  55
 101 ms | ███████████████  21
 102 ms | ████████████  17
 103 ms | ███████  10
 104 ms | █████████  13
 105 ms | ████████████  17
 106 ms | ████  5
 107 ms | ████  6
 108 ms | ██████  8
 109 ms | █  2
 110 ms | █  2
 111 ms | ███  4
 112 ms | ███  4
 113 ms | ███  4
 114 ms | █  2
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `9.71`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `8.71`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `90.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `9.66`, min `7.69`, p50 `9.72`, p95 `10.97`, p99 `11.51`, 1%low `7.98`, 0.1%low `n/a`, std `0.67`

**Frame time (ms)**  avg `104.03`, p50 `102.91`, p95 `115.47`, p99 `120.13`, p99.9 `128.22`, max `130.06`

**Client tick (ms)**  avg `0.33`, p95 `0.78`, max `2.23`

**Memory**  start `512 MB`, end `1427 MB`, peak `1487 MB`, GC `48 events / 239 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |       █                                                                        
 10.5 |   █   █                                                                        
 10.3 |   █   █                                                                 █  █ █ 
 10.1 |   █   █ █                    ██  ███       █    █                    █  █  █ █ 
  9.9 |   █   ███   █     █   █ ███ ███  ███ █ █ █ █ █ ██ █  █   ██ █  █     █  █  █ █ 
  9.7 | █ ███ ████  █ █   █   █ ███ ████ ███ █████ ██████ ████  ███ █ ███  █ █  █  █ █ 
  9.5 | █ ███ █████ █ █████ ███████ ████ ████████████████ ████ ███████████ █ ██ ██ ███ 
  9.3 | █ ███████████ ███████████████████████████████████ ████████████████ █ ██ ██ ████
  9.0 | █ ██████████████████████████████████████████████████████████████████ ██ ███████
  8.8 |██ █████████████████████████████████████████████████████████████████████████████
  8.6 |██ █████████████████████████████████████████████████████████████████████████████
  8.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | ██  1
  86 ms | ███  2
  87 ms | ███████  4
  88 ms | ██  1
  89 ms | ██  1
  91 ms | ███  2
  92 ms | █████  3
  96 ms | ███  2
  97 ms | █████████  5
  98 ms | ███████████████████████  13
  99 ms | █████████████████████  12
 100 ms | ████████████████████████████████████████  23
 101 ms | ███████████████████  11
 102 ms | ██████████████████████████████  17
 103 ms | ████████████████  9
 104 ms | ███████████████████████  13
 105 ms | ████████████████  9
 106 ms | ███████  4
 107 ms | ██████████████  8
 108 ms | ███████  4
 109 ms | ████████████████  9
 110 ms | ██████████  6
 111 ms | █████████  5
 112 ms | ████████████  7
 113 ms | ██████████  6
 114 ms | █████  3
 115 ms | █████████  5
 116 ms | ██  1
 117 ms | ██  1
 119 ms | ███  2
 120 ms | ███  2
 130 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `entity_count_sample_end` = `26.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `15.00`
- `entity_count_sample_start` = `11.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `7.98`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.61`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7411.00`
- `preload_duration_ms` = `108.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23432 ms  |  Sample ticks: 400

**FPS**  avg `9.76`, min `7.57`, p50 `9.83`, p95 `11.19`, p99 `11.79`, 1%low `7.69`, 0.1%low `n/a`, std `0.77`

**Frame time (ms)**  avg `103.08`, p50 `101.70`, p95 `117.00`, p99 `124.74`, p99.9 `131.30`, max `132.04`

**Client tick (ms)**  avg `0.34`, p95 `0.86`, max `6.91`

**Memory**  start `1215 MB`, end `1030 MB`, peak `1853 MB`, GC `31 events / 215 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                 █                                                              
 10.8 |                 █                                                              
 10.6 |              █  █                                             █                
 10.4 |              █  █                                      █   █  █                
 10.2 |     █        █  █                                      █   █  █                
 10.0 |  ██ █ ███    █  ██       █       █          █   █      █   █  █   █   █  █ ███ 
  9.9 |█ ██ █ ███    █ █████    ████ █   █     █   ██ █ ██ ███ █   █  █   █   █████████
  9.7 |█ ██ █ ████   █ ████████ ██████   █ █   █   ██ █ ██████ ██  █  █   ███ █████████
  9.5 |█ ██ █ ██████ █ ████████ ██████  ██ █   ██  ██ █ ██████ ██  █  █ █ █████████████
  9.3 |████ █ ██████ █ ███████████████ ██████  ███ ████ ██████ ██ ███ █████████████████
  9.2 |███████████████ ████████████████████████████████ ██████ ████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  70 ms | ██  1
  79 ms | ██  1
  85 ms | ██  1
  86 ms | ██  1
  87 ms | ███  2
  88 ms | ███  2
  89 ms | █████  3
  90 ms | ██  1
  92 ms | ██  1
  93 ms | ███  2
  95 ms | ███  2
  96 ms | ███  2
  97 ms | ██████████  6
  98 ms | ███████████  7
  99 ms | ██████████████████████████████████████  24
 100 ms | ████████████████████████████████████████  25
 101 ms | ████████████████████████████████████████  25
 102 ms | ████████████████████████  15
 103 ms | █████████████  8
 104 ms | ████████████████  10
 105 ms | █████  3
 106 ms | ███████████  7
 107 ms | ███████████  7
 108 ms | ███  2
 109 ms | █████  3
 110 ms | ██████████  6
 111 ms | █████  3
 112 ms | █████  3
 113 ms | ██████  4
 114 ms | █████  3
 115 ms | ███  2
 116 ms | ███  2
 117 ms | ███  2
 118 ms | ███  2
 120 ms | ██  1
 121 ms | ██  1
 122 ms | ██  1
 124 ms | ██  1
 128 ms | ██  1
 132 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `entity_count_sample_end` = `7.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `2.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `7.69`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.70`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7417.00`
- `preload_duration_ms` = `316.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `9.71`, min `7.75`, p50 `9.77`, p95 `11.36`, p99 `11.80`, 1%low `7.85`, 0.1%low `n/a`, std `0.77`

**Frame time (ms)**  avg `103.69`, p50 `102.39`, p95 `118.73`, p99 `125.72`, p99.9 `128.40`, max `129.02`

**Client tick (ms)**  avg `0.34`, p95 `0.68`, max `4.66`

**Memory**  start `1019 MB`, end `2079 MB`, peak `2079 MB`, GC `22 events / 176 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                      █  █   █                  
 10.5 |                                          █           █  █   █                  
 10.4 |             █                            █           █  █   █            █  █  
 10.2 |             █                      █ █   █           █  █   █      █     █  █  
 10.0 |   ██    █ █ █    █ █ ███ █      █  █ ██  █ ██ ██     █ ██   █  █  ██  █  █  █  
  9.8 |██ ███ █ █ █ █  ███ █ █████  █   █ █████ ██ ██ ██ █ █ █ ██   █ ██ ███ ██  █  █  
  9.6 |██████ █ █ ████ ███ █ █████  ███ █ █████ ██ ██ ██ ███ █ ██ █ █ ██ ███ ██  █  █  
  9.4 |████████ ██████ ████████████████ █ █████ ██ ██ ██ ███ █ ██ █████████████ ██ ██  
  9.2 |███████████████ ██████████████████ █████ ██ █████ ███ █ ████████████████ ███████
  9.0 |████████████████████████████████████████ ██ ████████████████████████████████████
  8.8 |████████████████████████████████████████ ██ ████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  81 ms | ██  1
  84 ms | ███  2
  85 ms | █████  3
  87 ms | ███████  4
  88 ms | ██  1
  89 ms | ██  1
  91 ms | █████  3
  92 ms | ██  1
  93 ms | ███  2
  94 ms | ███  2
  95 ms | ██  1
  96 ms | ██  1
  97 ms | ████████  5
  98 ms | ████████████  7
  99 ms | ██████████████████████████████  18
 100 ms | ████████████████████████████████████████  24
 101 ms | ██████████████████████  13
 102 ms | ███████████████████████████  16
 103 ms | ██████████████████████  13
 104 ms | ██████████████████  11
 105 ms | █████████████  8
 106 ms | ███  2
 107 ms | ███  2
 108 ms | ████████████  7
 109 ms | ████████  5
 110 ms | ██████████  6
 111 ms | ██████████  6
 112 ms | ███  2
 113 ms | █████  3
 114 ms | ████████████  7
 115 ms | ███  2
 116 ms | ██  1
 117 ms | ██  1
 118 ms | █████  3
 119 ms | ███  2
 120 ms | ██  1
 122 ms | ██  1
 124 ms | ██  1
 125 ms | █████  3
 129 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.85`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `67.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.64`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7433.00`
- `preload_duration_ms` = `1.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23052 ms  |  Sample ticks: 400

**FPS**  avg `9.68`, min `7.29`, p50 `9.76`, p95 `10.34`, p99 `11.41`, 1%low `7.60`, 0.1%low `n/a`, std `0.58`

**Frame time (ms)**  avg `103.70`, p50 `102.41`, p95 `114.54`, p99 `122.85`, p99.9 `135.00`, max `137.16`

**Client tick (ms)**  avg `0.37`, p95 `1.00`, max `11.09`

**Memory**  start `1608 MB`, end `1309 MB`, peak `2171 MB`, GC `25 events / 187 ms`

**FPS over sampling window (ASCII):**

```
 11.1 |                                                        █                       
 10.9 |                                                        █                       
 10.6 |                                                        █      █  █             
 10.3 |                █    █                                  █      █  █             
 10.0 |  █    ███      █ █  █ █ █  ██    ██ █ █ ███  █    █  █ █  █ █ █  █         █ █ 
  9.7 |███  █████  █ █ █ ██ █ ███  ██████████ █████  ██   ████ █  █ █ █  █    ██ █ █ ██
  9.5 |███ ███████████ █ ██ ███████████████████████  ███ █████ ████ █ ██ ████ █████████
  9.2 |████████████████████ ██████████████████████████████████ █████████ ██████████████
  8.9 |████████████████████ ██████████████████████████████████ ████████████████████████
  8.6 |███████████████████████████████████████████████████████ ████████████████████████
  8.3 |███████████████████████████████████████████████████████ ████████████████████████
  8.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  86 ms | █  1
  87 ms | █  1
  88 ms | █  1
  90 ms | █  1
  91 ms | ███  2
  92 ms | █  1
  95 ms | █  1
  96 ms | █  1
  97 ms | ███  2
  98 ms | ███████████████████████  16
  99 ms | █████████████████████████████  20
 100 ms | ████████████████████████████████████████  28
 101 ms | █████████████████████  15
 102 ms | ███████████████████████  16
 103 ms | ███████████████████████  16
 104 ms | ██████████  7
 105 ms | █████████  6
 106 ms | ███████████  8
 107 ms | ████████████████  11
 108 ms | ██████  4
 109 ms | ███████  5
 110 ms | ███████████  8
 111 ms | ███  2
 112 ms | ████  3
 113 ms | ████  3
 114 ms | ██████  4
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
 119 ms | ███  2
 122 ms | █  1
 125 ms | █  1
 137 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.01`
- `fps_1pct_low` = `7.60`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.64`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7451.00`
- `preload_duration_ms` = `109.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23153 ms  |  Sample ticks: 400

**FPS**  avg `9.65`, min `7.51`, p50 `9.74`, p95 `10.85`, p99 `11.26`, 1%low `7.64`, 0.1%low `n/a`, std `0.68`

**Frame time (ms)**  avg `104.12`, p50 `102.65`, p95 `115.64`, p99 `121.81`, p99.9 `132.30`, max `133.17`

**Client tick (ms)**  avg `0.31`, p95 `0.59`, max `4.78`

**Memory**  start `1786 MB`, end `1500 MB`, peak `2181 MB`, GC `25 events / 192 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                                                               █
 10.4 |                                          █              █                     █
 10.2 |                                █         █  █           █          █          █
 10.1 |                            █   █  █      █  █           █   █      █          █
  9.9 | █ █          ██ █ █  █ █   ██  █  █      █ ██      █    █   █      █   █   █  █
  9.8 |██ █   █  ███ ██ █ █ ██ ██  ██  █ ███ █   █ ██ █  ███  █ █   █  ██  █   █   █  █
  9.7 |██ █  ██  ███ ██ ███ █████ ███  █ ███ ██ ██ ████  ███  █ █ █ █  ██  █  ████ █  █
  9.5 |████ ███  ██████ ███ █████ ███  █ ███ ██ ██ █████ ███ ██ █ █ █  ███ █ █████ █  █
  9.4 |█████████ ██████ ███ █████ ███  █████ ██ ██ █████ ██████████ ██ ███ █ ██████████
  9.2 |█████████ ██████ ███ █████ ██████████████████████ ██████████████████████████████
  9.1 |█████████████████████████████████████████████████ ██████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  73 ms | ██  1
  88 ms | ████  2
  89 ms | ████  2
  90 ms | ██  1
  91 ms | █████  3
  92 ms | ███████  4
  94 ms | ██  1
  96 ms | ██  1
  97 ms | █████  3
  98 ms | ███████████  6
  99 ms | ████████████████████████████████████████  22
 100 ms | █████████████████████████████████  18
 101 ms | ████████████████████████████████████████  22
 102 ms | ███████████████████████████  15
 103 ms | █████████████  7
 104 ms | ██████████████████  10
 105 ms | ██████████████████  10
 106 ms | █████████████  7
 107 ms | ████████████████████  11
 108 ms | ███████  4
 109 ms | ███████  4
 110 ms | ███████  4
 111 ms | █████████████  7
 112 ms | ██████████████████  10
 113 ms | ████  2
 114 ms | ████  2
 115 ms | ███████  4
 116 ms | ██  1
 117 ms | ██  1
 118 ms | █████  3
 120 ms | ██  1
 121 ms | ██  1
 128 ms | ██  1
 133 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-44.00`
- `entity_count_sample_start` = `45.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.64`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `63.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.60`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7457.00`
- `preload_duration_ms` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24624 ms  |  Sample ticks: 400

**FPS**  avg `9.71`, min `7.85`, p50 `9.81`, p95 `10.89`, p99 `11.74`, 1%low `8.00`, 0.1%low `n/a`, std `0.66`

**Frame time (ms)**  avg `103.44`, p50 `101.91`, p95 `115.99`, p99 `120.78`, p99.9 `126.48`, max `127.36`

**Client tick (ms)**  avg `0.30`, p95 `0.53`, max `1.69`

**Memory**  start `1937 MB`, end `1811 MB`, peak `2297 MB`, GC `22 events / 173 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                  █                   █                         
 10.5 |                  █               █      █            █      █                  
 10.3 |                  █               █      █            █  █  ██ █                
 10.1 |█                 █         █     ██     █  █      █  █  █  ██ █           █    
 10.0 |█ ██  █           █  █      █████ ██     █  ██  ████ ██  █  ██ █ █ ██      █  █ 
  9.8 |████ ██    ██  █  █  █   █ ██████ ██     █ ███  ████ ██ ██  ██ █ █ ██  █   ████ 
  9.6 |███████   ███  ██ ████   ████████ ██ █   █ ███ █████ ██ ██  ██ █ ███████  █████ 
  9.4 |█████████████████ ████████████████████████ ███ █████ ██ ██  ██ █ ███████████████
  9.2 |█████████████████ ████████████████████████ █████████ █████  ████████████████████
  9.1 |█████████████████ ████████████████████████ █████████ ██████ ████████████████████
  8.9 |█████████████████ ████████████████████████ █████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | ███  2
  85 ms | █  1
  86 ms | ███  2
  88 ms | █  1
  89 ms | █  1
  90 ms | █  1
  91 ms | ███  2
  92 ms | ███  2
  93 ms | █  1
  94 ms | ███  2
  95 ms | █  1
  96 ms | ███  2
  97 ms | ███  2
  98 ms | █████████████  9
  99 ms | ████████████████████████████████████████  28
 100 ms | ████████████████████████████████████  25
 101 ms | ██████████████████████████  18
 102 ms | ██████████████  10
 103 ms | █████████████████████  15
 104 ms | ███████████  8
 105 ms | ██████  4
 106 ms | █████████  6
 107 ms | ██████████  7
 108 ms | ███████  5
 109 ms | ████  3
 110 ms | ████  3
 111 ms | ██████████  7
 112 ms | ████  3
 113 ms | ███  2
 114 ms | ██████████  7
 115 ms | ████  3
 116 ms | ████  3
 118 ms | ████  3
 119 ms | █  1
 120 ms | █  1
 122 ms | █  1
 127 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.00`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.67`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7477.00`
- `preload_duration_ms` = `1545.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23139 ms  |  Sample ticks: 400

**FPS**  avg `9.74`, min `8.05`, p50 `9.82`, p95 `10.81`, p99 `11.45`, 1%low `8.12`, 0.1%low `n/a`, std `0.60`

**Frame time (ms)**  avg `103.01`, p50 `101.84`, p95 `113.23`, p99 `119.72`, p99.9 `123.85`, max `124.29`

**Client tick (ms)**  avg `0.34`, p95 `0.71`, max `4.66`

**Memory**  start `1323 MB`, end `1557 MB`, peak `2166 MB`, GC `24 events / 167 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                                        █       
 10.5 |      █                                                   █             █       
 10.3 |      █                                                   █             █       
 10.2 |      █  █      █     █   █        █                 █    █  █         ██       
 10.0 | ███  ██ █ █    █     █   █ █  ██  █         █  █ █  █    █  █    ██ █ ██  █    
  9.8 | ███  ██████    █ █   █   █ █  ██ ██     █  ██ ██ ██ ████ █ ██    ████ ███ █  █ 
  9.7 |█████ ██████  █ █ ███ ██  █ █████████ ████████ ██ ██ ████ █ █████ ████ ███ █ ██ 
  9.5 |█████ ██████  ██████████  █ █████████ ████████ ██ ██ ████ ████████████ ███ ████ 
  9.3 |█████ ███████ ██████████ ██ ██████████████████████████████████████████████ ████ 
  9.2 |█████ ██████████████████ ███████████████████████████████████████████████████████
  9.0 |█████ ██████████████████████████████████████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms | █  1
  86 ms | █  1
  87 ms | █████  4
  88 ms | █  1
  89 ms | ███  2
  91 ms | █  1
  92 ms | █  1
  93 ms | █  1
  94 ms | ███  2
  95 ms | █  1
  96 ms | ████  3
  97 ms | █  1
  98 ms | ██████████  8
  99 ms | █████████████████████████████  23
 100 ms | ████████████████████████████████████████  32
 101 ms | ████████████████████████  19
 102 ms | ███████████████████████  18
 103 ms | █████████████  10
 104 ms | ██████  5
 105 ms | █████████  7
 106 ms | ██████████  8
 107 ms | █████████████  10
 108 ms | ████  3
 109 ms | ████████  6
 110 ms | ████  3
 111 ms | ████  3
 112 ms | ██████████  8
 113 ms | ████████  6
 115 ms | ███  2
 116 ms | █  1
 118 ms | █  1
 119 ms | █  1
 122 ms | █  1
 124 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `entity_count_sample_end` = `3.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-2.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.12`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.71`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24723 ms  |  Sample ticks: 400

**FPS**  avg `9.69`, min `7.77`, p50 `9.71`, p95 `11.03`, p99 `11.45`, 1%low `7.78`, 0.1%low `n/a`, std `0.72`

**Frame time (ms)**  avg `103.81`, p50 `102.95`, p95 `116.27`, p99 `124.45`, p99.9 `128.67`, max `128.76`

**Client tick (ms)**  avg `0.32`, p95 `0.64`, max `1.68`

**Memory**  start `1113 MB`, end `1136 MB`, peak `2153 MB`, GC `25 events / 191 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                       █                                     █  
 10.4 |  █               █                    █                                     █  
 10.2 |  █               █                   ██                                     █  
 10.0 |  █  █      █     █   █ █   █    █    ██  █ ██  █   █      █    █  █   █     █  
  9.9 |  ██ █ █  █ █    ██   ████  █    █    ██ ██ ██  █  ███     █   ██  █   █     █  
  9.7 |█ █████████ █ █  ███  ████  █ █  █ ██ ██ ██ ██████████   █ █  ███  █   ██ █  █  
  9.6 |█ ███████████ █  ███  █████████ ██ ██ ██ ██ ███████████ ██ █ ████  █ █ ██ █  █  
  9.4 |█ ███████████ █ ████ █████████████ ██ ██ █████████████████ ██████  █ █ ████ ██  
  9.2 |█ ███████████ ███████████████████████ ███████████████████████████  ███ ████████ 
  9.1 |█████████████████████████████████████ ███████████████████████████ █████████████ 
  8.9 |█████████████████████████████████████ █████████████████████████████████████████ 
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  75 ms | ██  1
  86 ms | ██  1
  87 ms | ██████  3
  88 ms | ████  2
  89 ms | ██  1
  90 ms | ██████  3
  91 ms | ██████  3
  93 ms | ██  1
  94 ms | ████  2
  95 ms | ██████  3
  97 ms | ████████  4
  98 ms | ██████████████████  9
  99 ms | ████████████████████████████████████████  20
 100 ms | ██████████████████████████████████████  19
 101 ms | ██████████████████████████████  15
 102 ms | ██████████████████████  11
 103 ms | ████████████████████████████████  16
 104 ms | ████████████  6
 105 ms | ████████████████  8
 106 ms | ██████████████  7
 107 ms | ████████████████  8
 108 ms | ██████████  5
 109 ms | ██████████████  7
 110 ms | ████████████████  8
 111 ms | ██████████  5
 112 ms | ████████  4
 113 ms | ████████████  6
 114 ms | ████  2
 115 ms | ████  2
 116 ms | ██████  3
 117 ms | ██  1
 119 ms | ██  1
 120 ms | ██  1
 121 ms | ██  1
 123 ms | ██  1
 124 ms | ██  1
 128 ms | ████  2
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-27.00`
- `entity_count_sample_start` = `31.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `7.78`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.63`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `1739.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23150 ms  |  Sample ticks: 400

**FPS**  avg `9.68`, min `7.32`, p50 `9.75`, p95 `11.52`, p99 `12.23`, 1%low `7.32`, 0.1%low `n/a`, std `0.97`

**Frame time (ms)**  avg `104.30`, p50 `102.55`, p95 `123.67`, p99 `131.97`, p99.9 `136.63`, max `136.65`

**Client tick (ms)**  avg `0.38`, p95 `0.92`, max `4.00`

**Memory**  start `1326 MB`, end `1036 MB`, peak `2238 MB`, GC `23 events / 179 ms`

**FPS over sampling window (ASCII):**

```
 11.3 |                                                                      █         
 11.1 |                                                                      █         
 10.8 |                    █       █                                     █   █  █      
 10.5 |         █    █     █       █  █  █       █              █        █   █  █      
 10.3 |     █   █    ██    █    █  █  █  █   █   █   █          █  █     █   █  █     █
 10.0 |     ██ ██   ███    █  █ █  █  ██ █   █ █ █   █████ █    █  █     ██  █  ███ █ █
  9.7 | █ █ ██ ███  ███ █  ██ ███  █ ███ █   █ █ █ █ █████████  █  █ █   ██  █  ███ █ █
  9.4 | ███ ██ ███  ███ █  ██ ███  █ ███ ██ ██ █ █ ███████████ ██  ███ ████  █  █████ █
  9.2 |████ ██████  ███ ██ ██ ████ █ ███ ██ ████ █████████████ ████████████████ █████ █
  8.9 |████████████ ██████ █████████ ███ ██ ███████████████████████████████████ █████ █
  8.6 |███████████████████ █████████████ ██████████████████████████████████████████████
  8.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  78 ms | ██  1
  79 ms | ██  1
  81 ms | ██  1
  84 ms | ███  2
  85 ms | ██  1
  86 ms | ████████  5
  87 ms | ██████  4
  88 ms | ██  1
  89 ms | █████  3
  90 ms | ███  2
  91 ms | █████  3
  92 ms | ██  1
  93 ms | ███  2
  94 ms | █████  3
  95 ms | ██  1
  96 ms | █████  3
  97 ms | ███  2
  98 ms | ██████  4
  99 ms | ██████████████  9
 100 ms | ████████████████████████████████████████  26
 101 ms | ██████████████████████  14
 102 ms | █████████████████  11
 103 ms | █████  3
 104 ms | ██████████████  9
 105 ms | ███████████  7
 106 ms | █████████  6
 107 ms | ████████  5
 108 ms | ████████████  8
 109 ms | ███████████  7
 110 ms | █████  3
 111 ms | ██████  4
 112 ms | ██████  4
 113 ms | ████████  5
 114 ms | ███████████  7
 115 ms | █████  3
 116 ms | █████  3
 117 ms | ██  1
 118 ms | █████  3
 119 ms | ██  1
 122 ms | ██  1
 123 ms | █████  3
 124 ms | ██  1
 125 ms | ██  1
 126 ms | ███  2
 127 ms | ███  2
 131 ms | ██  1
 136 ms | ███  2
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-42.00`
- `entity_count_sample_start` = `46.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.32`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.59`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7499.00`
- `preload_duration_ms` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23386 ms  |  Sample ticks: 400

**FPS**  avg `9.63`, min `7.75`, p50 `9.64`, p95 `11.28`, p99 `11.74`, 1%low `7.76`, 0.1%low `n/a`, std `0.84`

**Frame time (ms)**  avg `104.60`, p50 `103.74`, p95 `117.85`, p99 `126.18`, p99.9 `129.01`, max `129.05`

**Client tick (ms)**  avg `0.29`, p95 `0.56`, max `1.69`

**Memory**  start `1860 MB`, end `2237 MB`, peak `2281 MB`, GC `24 events / 183 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |     █                                                                          
 10.7 |     █                    █                                    █           █    
 10.5 |     █                  █ █           █ █         █         █  █           █    
 10.3 |     █          █       █ █           █ █       █ █         █  █           █    
 10.0 |     █          █       █ █        █  █ █      ██ █ █     █ █  █  █    █  ██   █
  9.8 |     █ █        █    █  █ █  █   ████ █ █      ██ █ █ █   █ █  █  █    ██ ███  █
  9.6 |███  █ ██ ██    █ ██ ██ █ ████ ██████ █ █   ██ ██ █ ████ ██ █  █ ██    ██ ███  █
  9.4 |███  █ ██████  ██ █████ █ █████████████ █   █████ █ ███████ ██ █ ████  ██ ████ █
  9.2 |███  █ ██████████ ███████ ███████████████████████ █████████ ██ ██████████ ████ █
  9.0 |███ █████████████████████████████████████████████ █████████ ██████████████████ █
  8.8 |███████████████████████████████████████████████████████████ ████████████████████
  8.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | ██████  2
  85 ms | ██████  2
  86 ms | ████████████  4
  87 ms | ███  1
  88 ms | ██████  2
  89 ms | ████████████  4
  90 ms | ██████  2
  91 ms | █████████  3
  92 ms | ██████  2
  93 ms | ██████  2
  94 ms | ██████  2
  96 ms | ██████  2
  97 ms | █████████  3
  98 ms | █████████████████████████  8
  99 ms | ████████████████████████████  9
 100 ms | ████████████████████████████████████████  13
 101 ms | █████████████████████████████████████  12
 102 ms | ████████████████████████████████████████  13
 103 ms | █████████████████████████████████████  12
 104 ms | ████████████████████████████  9
 105 ms | █████████████████████████  8
 106 ms | ██████████████████████  7
 107 ms | ███████████████  5
 108 ms | ██████████████████████  7
 109 ms | ███████████████  5
 110 ms | ████████████  4
 111 ms | ██████████████████████  7
 112 ms | ████████████  4
 113 ms | ██████████████████████  7
 114 ms | ████████████  4
 115 ms | █████████████████████████  8
 116 ms | ████████████  4
 117 ms | ████████████  4
 118 ms | ██████  2
 119 ms | ██████  2
 121 ms | ███  1
 122 ms | ███  1
 125 ms | ██████  2
 128 ms | ███  1
 129 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `entity_count_sample_end` = `34.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `32.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `7.76`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.56`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7507.00`
- `preload_duration_ms` = `311.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23140 ms  |  Sample ticks: 400

**FPS**  avg `9.66`, min `7.77`, p50 `9.66`, p95 `11.49`, p99 `12.07`, 1%low `7.82`, 0.1%low `n/a`, std `0.87`

**Frame time (ms)**  avg `104.31`, p50 `103.47`, p95 `120.38`, p99 `127.06`, p99.9 `128.40`, max `128.69`

**Client tick (ms)**  avg `0.32`, p95 `0.76`, max `3.05`

**Memory**  start `2069 MB`, end `2240 MB`, peak `2291 MB`, GC `22 events / 193 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                                                                          █     
 10.7 |                                  █     █                █  █      █      █   █ 
 10.5 |                            █     █     █                █  █      █      █   █ 
 10.2 |                            █  █  █     █                █  █   █ ██      █   █ 
 10.0 |       █             ██ █   █  █  █   █ █   █       █    █  █   █ ██      █   █ 
  9.8 |█   █  █  █ █      ████ █  ██  ██ ██ ██ █   █   █ █ █  █ █  ██  █ ██  █  ██ █ █ 
  9.6 |█ █ █  █  ███  ██  ████ ██ ███ ██ ██ ██ █ █ █   █ █ █ ██ █  ██  █ ██  █ ███ █ █ 
  9.4 |█████ ██ ████  ████████ ██████ ██ ██ ██ █ █ █   ███ █ ██ █  ██ ██ ██ ██████ █ █ 
  9.2 |█████ █████████████████ █████████ ██ ██ ███ █████████ ████  ██ ██ ██ ██████ ███ 
  9.0 |█████████████████████████████████ █████ ███ ██████████████████ ██ █████████ ███ 
  8.8 |███████████████████████████████████████ ███ ███████████████████████████████████ 
  8.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  73 ms | ██  1
  82 ms | ████  2
  85 ms | ██████████  5
  86 ms | ████  2
  87 ms | ██  1
  88 ms | ██████  3
  89 ms | ██  1
  90 ms | ██  1
  91 ms | ████  2
  92 ms | ██  1
  93 ms | ██  1
  94 ms | ██  1
  95 ms | ██████  3
  96 ms | ██  1
  97 ms | ████████  4
  98 ms | ██████████  5
  99 ms | ████████████████████████████████████████  20
 100 ms | ██████████████████████  11
 101 ms | ████████████████████  10
 102 ms | ████████████████████████████████  16
 103 ms | ██████████████████████  11
 104 ms | ██████████████████████████  13
 105 ms | ████████████████  8
 106 ms | ██████████████  7
 107 ms | ██████  3
 108 ms | ██████████████  7
 109 ms | ████  2
 110 ms | ██████████████  7
 111 ms | ██████████████████  9
 112 ms | ██████████  5
 113 ms | ████████  4
 114 ms | ██████  3
 115 ms | ████  2
 116 ms | ████████  4
 117 ms | ██████  3
 118 ms | ██  1
 119 ms | ████  2
 121 ms | ██  1
 122 ms | ██████  3
 123 ms | ██  1
 124 ms | ████  2
 127 ms | ████  2
 128 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `entity_count_sample_end` = `21.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-22.00`
- `entity_count_sample_start` = `43.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.82`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.59`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7517.00`
- `preload_duration_ms` = `4.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `9.70`, min `7.86`, p50 `9.77`, p95 `11.18`, p99 `11.49`, 1%low `7.89`, 0.1%low `n/a`, std `0.74`

**Frame time (ms)**  avg `103.65`, p50 `102.38`, p95 `117.02`, p99 `124.74`, p99.9 `126.99`, max `127.18`

**Client tick (ms)**  avg `0.31`, p95 `0.99`, max `4.69`

**Memory**  start `1011 MB`, end `1975 MB`, peak `2232 MB`, GC `21 events / 164 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                   █                                                            
 10.7 |             █     █                                                            
 10.5 |             █     █                                                        █   
 10.3 |             █     ██                                                       █   
 10.2 |             █     ██        █                                     █     █  █   
 10.0 |  ███ ██     ██    ██  █     █ █ ██       █  █ ██           █    █ █     █  █   
  9.8 |  ██████  █ ███    ██  █    ██ ████    ██ ██ █ ██  █ ██  ██ ███ ████   █ █  ████
  9.6 |█ █████████ ███ █  █████ ██ ██ █████   ██ ██ █████ █ ██  ██ ████████   ████ ████
  9.4 |█ █████████ ███ ██ ███████████████████ █████ ███████ ███ ████████████  ████ ████
  9.3 |██████████████████ █████████████████████████ ██████████████████████████████ ████
  9.1 |██████████████████ ████████████████████████████████████████████████████████ ████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  77 ms | ██  1
  85 ms | ██  1
  87 ms | ████  2
  88 ms | █████  3
  89 ms | █████████  5
  90 ms | ████  2
  91 ms | ██  1
  92 ms | ████  2
  93 ms | ██  1
  94 ms | ██  1
  95 ms | ████  2
  96 ms | ██  1
  97 ms | ████  2
  98 ms | ██████████████████████  12
  99 ms | ███████████████████████████████████  19
 100 ms | █████████████████████████  14
 101 ms | ████████████████████████████████████████  22
 102 ms | ███████████████████████████████  17
 103 ms | ████████████████  9
 104 ms | ██████████████████  10
 105 ms | ███████████████  8
 106 ms | ███████  4
 107 ms | ████████████████  9
 108 ms | ████  2
 109 ms | ███████  4
 110 ms | ███████  4
 111 ms | ████  2
 112 ms | █████████  5
 113 ms | ████████████████  9
 114 ms | █████████  5
 115 ms | █████  3
 116 ms | ██  1
 117 ms | █████  3
 120 ms | ████  2
 121 ms | ██  1
 124 ms | ████  2
 126 ms | ██  1
 127 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-38.00`
- `entity_count_sample_start` = `39.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `7.89`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.65`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7523.00`
- `preload_duration_ms` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23148 ms  |  Sample ticks: 400

**FPS**  avg `9.92`, min `8.65`, p50 `9.97`, p95 `10.11`, p99 `10.89`, 1%low `8.70`, 0.1%low `n/a`, std `0.29`

**Frame time (ms)**  avg `100.94`, p50 `100.27`, p95 `106.29`, p99 `113.65`, p99.9 `115.35`, max `115.64`

**Client tick (ms)**  avg `0.25`, p95 `0.39`, max `1.67`

**Memory**  start `1644 MB`, end `1704 MB`, peak `1704 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                █                                                               
 10.2 |                █                                                               
 10.0 |               ██  ██      █           █               █         █     █        
  9.9 |     █     █   ███ ██  ██████ ███  █ ██████ █████████ ████ █████████████████████
  9.8 | ██ ███    █ █ ███ ██████████████ ████████████████████████ █████████████████████
  9.7 |███ ████████ █ ███ ███████████████████████████████████████ █████████████████████
  9.6 |████████████ █ ███ █████████████████████████████████████████████████████████████
  9.5 |██████████████ ███ █████████████████████████████████████████████████████████████
  9.4 |██████████████ ███ █████████████████████████████████████████████████████████████
  9.3 |██████████████████ █████████████████████████████████████████████████████████████
  9.2 |██████████████████ █████████████████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   1
  90 ms |   1
  91 ms |   1
  92 ms |   1
  98 ms | █████  11
  99 ms | █████████████████  37
 100 ms | ████████████████████████████████████████  88
 101 ms | ███████████  25
 102 ms | █████  11
 103 ms | █  3
 104 ms | █  3
 105 ms | ██  5
 106 ms | █  3
 107 ms |   1
 108 ms | █  2
 111 ms |   1
 113 ms | █  2
 114 ms |   1
 115 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `9.91`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.70`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23129 ms  |  Sample ticks: 400

**FPS**  avg `9.72`, min `8.06`, p50 `9.76`, p95 `10.21`, p99 `10.49`, 1%low `8.24`, 0.1%low `n/a`, std `0.44`

**Frame time (ms)**  avg `103.10`, p50 `102.46`, p95 `110.37`, p99 `117.64`, p99.9 `123.01`, max `124.03`

**Client tick (ms)**  avg `2.59`, p95 `3.01`, max `6.82`

**Memory**  start `1888 MB`, end `1995 MB`, peak `2292 MB`, GC `3 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                   █                                                            
 10.5 |                   █                                                            
 10.3 |                   █                                                            
 10.2 |                 █ █    █    █                                          █       
 10.1 |                 █ █ █  █    █     █                          █   █ █   █       
  9.9 |        ████     ████████    █ ███ █      █       █  █   █  ███   ███   ██  █  █
  9.8 | █  █ █ ████  █ ██████████   █ █████   █  █    ██ █ ██   █ ████   ███   ███ █  █
  9.6 |██  █ █████████ ███████████  █ █████   ████ ██ ████ ██████ ████  ████   ███ ██ █
  9.5 |█████ █████████ ███████████  ██████████████████████ ███████████  ████   ██████ █
  9.4 |███████████████ ███████████ ███████████████████████████████████ ██████  ████████
  9.2 |███████████████████████████████████████████████████████████████████████ ████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  75 ms | █  1
  94 ms | █  1
  95 ms | ███  3
  96 ms | ██  2
  97 ms | ███  3
  98 ms | ███  3
  99 ms | ███████████████  15
 100 ms | ████████████████████████████████████████  40
 101 ms | ████████████████████  20
 102 ms | █████████████████████████  25
 103 ms | █████████████████  17
 104 ms | ██████████████  14
 105 ms | ███████████  11
 106 ms | ████████  8
 107 ms | ██████████  10
 108 ms | █████  5
 109 ms | █████  5
 110 ms | ███  3
 111 ms | ███  3
 112 ms | █  1
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
 124 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.70`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `0.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `8.24`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `9.91`, min `9.26`, p50 `9.96`, p95 `10.08`, p99 `10.16`, 1%low `9.31`, 0.1%low `n/a`, std `0.16`

**Frame time (ms)**  avg `100.98`, p50 `100.36`, p95 `104.21`, p99 `106.43`, p99.9 `107.81`, max `108.04`

**Client tick (ms)**  avg `0.26`, p95 `0.41`, max `1.65`

**Memory**  start `2252 MB`, end `878 MB`, peak `2320 MB`, GC `1 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |█                                                                               
 10.2 |█                                                                               
 10.1 |█                                                                               
 10.1 |█                 █                        █         █         █    █           
 10.0 |█                 ████ █ █  ███            ██ █ ███  ████ ███  █ ██ ████ █ █    
  9.9 |█ █ █   █      ██ ████████ ████    █    ████████████████████████████████████    
  9.9 |█████ █ █     ███ ██████████████   █    █████████████████████████████████████   
  9.8 |█████ ███ █   ██████████████████   █ ██ █████████████████████████████████████ ██
  9.7 |█████ ███████ ██████████████████   █ ███████████████████████████████████████████
  9.7 |████████████████████████████████   █ ███████████████████████████████████████████
  9.6 |████████████████████████████████ █ █ ███████████████████████████████████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  94 ms |   1
  96 ms |   1
  98 ms | ██  4
  99 ms | █████████████  31
 100 ms | ████████████████████████████████████████  94
 101 ms | █████████  22
 102 ms | █████████  22
 103 ms | █████  12
 104 ms | ██  4
 105 ms | ██  4
 106 ms | █  2
 108 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `9.31`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3165.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.90`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `9043.00`
- `preload_duration_ms` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23136 ms  |  Sample ticks: 400

**FPS**  avg `9.88`, min `8.78`, p50 `9.97`, p95 `10.13`, p99 `10.26`, 1%low `8.83`, 0.1%low `n/a`, std `0.28`

**Frame time (ms)**  avg `101.31`, p50 `100.27`, p95 `108.02`, p99 `112.39`, p99.9 `113.61`, max `113.88`

**Client tick (ms)**  avg `0.27`, p95 `0.38`, max `1.71`

**Memory**  start `823 MB`, end `947 MB`, peak `947 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |   █                                                                  █    █    
 10.0 |   █   ██           ████  ██          █ █ ██ ███ █    ██ █    ██ ███  █ ██ █ █  
 10.0 |   █   ███        ███████████   █ █  █████████████    ████   █████████████ ███  
  9.9 |   █   ███████    ███████████   █ █ ██████████████   █████   █████████████████  
  9.8 |  ██   ███████    ████████████ ██ █ ████████████████ █████ █ █████████████████  
  9.7 |█ ███  ███████   ████████████████ ████████████████████████ ███████████████████  
  9.7 |█ ███  ███████   ████████████████ ████████████████████████████████████████████ █
  9.6 |█ ████ ████████  █████████████████████████████████████████████████████████████ █
  9.5 |██████ ████████  ███████████████████████████████████████████████████████████████
  9.5 |██████ ████████  ███████████████████████████████████████████████████████████████
  9.4 |███████████████ ████████████████████████████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   1
  93 ms |   1
  97 ms | ███  7
  98 ms | ██  5
  99 ms | ██████████  23
 100 ms | ████████████████████████████████████████  94
 101 ms | █████████  21
 102 ms | ███████  16
 103 ms | ███  7
 104 ms | █  2
 105 ms | ███  7
 106 ms |   1
 107 ms | █  2
 108 ms | █  3
 109 ms | █  2
 110 ms | █  2
 112 ms | █  3
 113 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.83`
- `fps_harmonic_avg` = `9.87`
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
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `9.92`, min `9.12`, p50 `9.98`, p95 `10.09`, p99 `10.10`, 1%low `9.12`, 0.1%low `n/a`, std `0.17`

**Frame time (ms)**  avg `100.86`, p50 `100.24`, p95 `104.65`, p99 `109.08`, p99.9 `109.68`, max `109.68`

**Client tick (ms)**  avg `0.26`, p95 `0.39`, max `1.43`

**Memory**  start `1152 MB`, end `1292 MB`, peak `1292 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |          █ █ █       █ ██      █  ███    █  ██ ███ ██ █ ██ █ ██     █  ███  ██ 
 10.0 |         █████████  █ ██████   ██  ████   █ ██████████████████████  ███████ ████
  9.9 |█      ███████████  ████████████████████ ██████████████████████████ ████████████
  9.8 |█      ███████████  ████████████████████ ███████████████████████████████████████
  9.8 |█      ████████████ ████████████████████████████████████████████████████████████
  9.7 |█      █████████████████████████████████████████████████████████████████████████
  9.6 |█      █████████████████████████████████████████████████████████████████████████
  9.6 |█     ██████████████████████████████████████████████████████████████████████████
  9.5 |█     ██████████████████████████████████████████████████████████████████████████
  9.4 |█   █ ██████████████████████████████████████████████████████████████████████████
  9.4 |█ ███ ██████████████████████████████████████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | █  3
  99 ms | ███████████  31
 100 ms | ████████████████████████████████████████  110
 101 ms | █████████  26
 102 ms | ████  12
 103 ms | █  4
 104 ms | █  2
 105 ms | ██  5
 106 ms |   1
 107 ms |   1
 109 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `9.12`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `9.92`
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
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23150 ms  |  Sample ticks: 400

**FPS**  avg `9.95`, min `9.33`, p50 `9.98`, p95 `10.09`, p99 `10.12`, 1%low `9.37`, 0.1%low `n/a`, std `0.11`

**Frame time (ms)**  avg `100.54`, p50 `100.21`, p95 `102.50`, p99 `105.92`, p99.9 `106.99`, max `107.14`

**Client tick (ms)**  avg `0.27`, p95 `0.42`, max `1.57`

**Memory**  start `764 MB`, end `904 MB`, peak `904 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.0 | █                                                                              
 10.0 | ██████████  █  █ █    ███ █   ████ █████ ███████████████  ██████████████████   
 10.0 |███████████  █  ███ █  █████   ██████████████████████████ ████████████████████  
  9.9 |████████████ █  ███ █  █████   ██████████████████████████ ████████████████████  
  9.9 |████████████ ██ █████  █████  ███████████████████████████ ████████████████████  
  9.8 |████████████ ██ █████  ██████ ███████████████████████████ ████████████████████  
  9.8 |████████████ █████████ ██████ ██████████████████████████████████████████████████
  9.7 |████████████ █████████ ██████ ██████████████████████████████████████████████████
  9.7 |████████████ ████████████████ ██████████████████████████████████████████████████
  9.7 |█████████████████████████████ ██████████████████████████████████████████████████
  9.6 |█████████████████████████████ ██████████████████████████████████████████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  98 ms | ███  7
  99 ms | █████████████  37
 100 ms | ████████████████████████████████████████  110
 101 ms | ██████████  27
 102 ms | ████  10
 103 ms | █  4
 104 ms |   1
 105 ms |   1
 106 ms |   1
 107 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `9.37`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.95`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `8053.00`
- `preload_duration_ms` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194790 ms  |  Sample ticks: 3600

**FPS**  avg `9.83`, min `7.62`, p50 `9.93`, p95 `10.29`, p99 `11.53`, 1%low `8.07`, 0.1%low `7.73`, std `0.56`

**Frame time (ms)**  avg `102.10`, p50 `100.68`, p95 `112.09`, p99 `121.01`, p99.9 `126.82`, max `131.28`

**Client tick (ms)**  avg `0.66`, p95 `1.08`, max `8.40`

**Memory**  start `937 MB`, end `1545 MB`, peak `2001 MB`, GC `14 events / 79 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                 █                                                              
 10.2 |                 █                                                              
 10.1 |      █          █                                   █                          
 10.0 |      █          █     ██ █ █ █  █             ██  ███    █   █  █ ███  ██  ███ 
  9.9 |      █         ██     ██ ██████ █  █   █ █    ███ ███    █   █  ██████ ███ ████
  9.8 |     ██       █ ███    ███████████████  ████  ████████ █  ██ ██  ███████████████
  9.8 |     ███ █ █  █ ███  █ ████████████████ ████  ████████ ██ ██ ███ ███████████████
  9.7 | █ █ ███ █ ██ █ ███ ██ ██████████████████████ ████████ ██ ██████████████████████
  9.6 |██ █ ███ █ ████ ███ █████████████████████████ ████████ ██ ██████████████████████
  9.5 |██ █ ███ ██████ █████████████████████████████ ██████████████████████████████████
  9.4 |████ ███ ███████████████████████████████████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  68 ms |   1
  69 ms |   1
  71 ms |   1
  72 ms |   1
  73 ms |   1
  75 ms |   1
  80 ms |   1
  81 ms |   1
  83 ms |   2
  85 ms |   2
  86 ms | █  8
  87 ms | █  6
  88 ms | █  15
  89 ms | █  8
  90 ms | █  13
  91 ms |   3
  92 ms | █  8
  93 ms |   2
  94 ms | █  6
  95 ms |   3
  96 ms |   4
  97 ms | █  12
  98 ms | █████  59
  99 ms | █████████████████████████████████  378
 100 ms | ████████████████████████████████████████  453
 101 ms | ████████████████  183
 102 ms | █████████  99
 103 ms | ███████  81
 104 ms | █████  51
 105 ms | ██████  66
 106 ms | ████  43
 107 ms | ███  36
 108 ms | ███  33
 109 ms | ███  33
 110 ms | ███  29
 111 ms | ██  28
 112 ms | ██  19
 113 ms | █  8
 114 ms | █  6
 115 ms |   4
 116 ms | █  8
 117 ms | █  8
 118 ms | █  6
 119 ms | █  7
 120 ms | █  7
 121 ms |   5
 122 ms |   3
 123 ms |   3
 124 ms |   2
 125 ms |   2
 126 ms |   1
 127 ms |   1
 131 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `entity_count_delta` = `22.00`
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
- `fps_0p1pct_low` = `7.73`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.79`
- `fps_1pct_low` = `8.07`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194537 ms  |  Sample ticks: 3600

**FPS**  avg `9.72`, min `7.85`, p50 `9.82`, p95 `10.63`, p99 `11.48`, 1%low `8.08`, 0.1%low `7.89`, std `0.59`

**Frame time (ms)**  avg `103.24`, p50 `101.79`, p95 `113.50`, p99 `121.73`, p99.9 `125.30`, max `127.42`

**Client tick (ms)**  avg `0.64`, p95 `1.05`, max `1.75`

**Memory**  start `1521 MB`, end `1146 MB`, peak `1940 MB`, GC `11 events / 62 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                              █                                                 
 10.0 |    █                         █                   █                             
 10.0 |█   █                   █   █ ██              █ ██████  ██ █ ██    █ █ █     █  
  9.9 |█   █          █        █   █ ██              █ ███████ ███████   ████ █ █   █  
  9.8 |█   █    █     █        █   █ ███    █        █████████████████ █ █████████  █  
  9.8 |██  █    █     █  █     █   █ ████   █        █████████████████ █ █████████  ██ 
  9.7 |██  █    █  █  █  █ █   █   █ ████   ██    █  ███████████████████ █████████  ██ 
  9.6 |██  █    █  █ ██  █ ██  █ █ █ ████   ██    █ ████████████████████ ██████████ ██ 
  9.6 |███ █    ██ █ ██  █ ██  █ █ █ ████  ████  ███████████████████████ ██████████ ███
  9.5 |███████ ███ ████  █ ██  ██████████ ██████████████████████████████ ██████████████
  9.4 |███████████████████████ ██████████ █████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  71 ms |   1
  72 ms |   1
  75 ms |   2
  77 ms |   1
  78 ms |   1
  79 ms |   1
  80 ms |   1
  81 ms |   1
  82 ms |   1
  83 ms |   3
  84 ms |   2
  86 ms |   2
  87 ms | █  7
  88 ms | ██  14
  89 ms | █  12
  90 ms | █  12
  91 ms | █  10
  92 ms | █  6
  93 ms | █  6
  94 ms | █  9
  95 ms |   2
  96 ms | █  6
  97 ms | █  7
  98 ms | ██████  47
  99 ms | ██████████████████████████████  245
 100 ms | ████████████████████████████████████████  329
 101 ms | ████████████████████  163
 102 ms | ███████████  87
 103 ms | ████████████  99
 104 ms | ████████████  99
 105 ms | █████████████  104
 106 ms | ███████████  89
 107 ms | ██████████  83
 108 ms | ████████  64
 109 ms | ██████  48
 110 ms | ██████  50
 111 ms | ███  23
 112 ms | ██  13
 113 ms | █  7
 114 ms | █  8
 115 ms |   4
 116 ms | █  6
 117 ms | █  6
 118 ms | █  9
 119 ms | █  8
 120 ms | ██  14
 121 ms | ██  14
 122 ms | █  5
 123 ms | █  5
 124 ms |   2
 125 ms |   2
 126 ms |   1
 127 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.89`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.69`
- `fps_1pct_low` = `8.08`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194044 ms  |  Sample ticks: 3600

**FPS**  avg `9.96`, min `7.09`, p50 `9.98`, p95 `11.34`, p99 `13.48`, 1%low `7.69`, 0.1%low `7.20`, std `0.82`

**Frame time (ms)**  avg `101.03`, p50 `100.21`, p95 `121.24`, p99 `126.79`, p99.9 `136.28`, max `140.98`

**Client tick (ms)**  avg `0.62`, p95 `1.05`, max `1.73`

**Memory**  start `1375 MB`, end `703 MB`, peak `1909 MB`, GC `11 events / 62 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                 █              █                                               
 10.1 |                 █              █                                               
 10.1 |                 █        █     █                      █  █                █    
 10.0 |         █ █ █   ██ █ █   █     ████  █ ██ █  █       ██  █ ███ ██         █  █ 
 10.0 |████ █████ ████  ██ █████ ████  █████ ██████  ███ ███ ██  █ ███████  ██   ██  █ 
  9.9 |██████████ ████ █████████ ████  █████ ██████  ███ ███ ██  █ ███████  ███████ ██ 
  9.9 |██████████ ████ ██████████████  ████████████  ██████████  █████████  ██████████ 
  9.8 |███████████████ ████████████████████████████  ██████████  █████████ ████████████
  9.8 |███████████████ ████████████████████████████ ███████████  █████████ ████████████
  9.7 |████████████████████████████████████████████████████████  ██████████████████████
  9.7 |█████████████████████████████████████████████████████████ ██████████████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  70 ms |   1
  71 ms |   1
  72 ms | █  10
  73 ms |   5
  74 ms |   7
  75 ms |   3
  76 ms |   2
  77 ms |   1
  81 ms |   1
  82 ms |   1
  83 ms |   2
  84 ms |   4
  85 ms | █  9
  86 ms | █  9
  87 ms | ██  26
  88 ms | ███  42
  89 ms | ██  36
  90 ms | █  13
  91 ms |   2
  92 ms |   2
  94 ms |   2
  95 ms |   1
  96 ms |   1
  97 ms | █  18
  98 ms | █████  79
  99 ms | ████████████████████████████  433
 100 ms | ████████████████████████████████████████  608
 101 ms | ██████████  151
 102 ms | ███  39
 103 ms | █  15
 104 ms | █  14
 105 ms |   7
 106 ms | █  9
 107 ms | █  15
 108 ms | █  11
 109 ms | █  19
 110 ms | ██  27
 111 ms | █  14
 112 ms | █  12
 113 ms |   7
 114 ms |   5
 115 ms |   3
 116 ms |   4
 117 ms |   1
 118 ms |   5
 119 ms |   6
 120 ms |   7
 121 ms | █  19
 122 ms | ██  24
 123 ms | █  9
 124 ms | █  8
 125 ms |   7
 126 ms | █  9
 127 ms |   6
 128 ms |   4
 129 ms |   1
 130 ms |   1
 135 ms |   1
 136 ms |   2
 140 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.20`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.90`
- `fps_1pct_low` = `7.69`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195058 ms  |  Sample ticks: 3600

**FPS**  avg `9.99`, min `7.62`, p50 `9.98`, p95 `10.40`, p99 `11.92`, 1%low `7.94`, 0.1%low `7.70`, std `0.53`

**Frame time (ms)**  avg `100.37`, p50 `100.21`, p95 `107.67`, p99 `122.91`, p99.9 `128.19`, max `131.19`

**Client tick (ms)**  avg `0.62`, p95 `1.03`, max `9.24`

**Memory**  start `1499 MB`, end `1447 MB`, peak `1920 MB`, GC `11 events / 59 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                      █          █                              
 10.1 |          █        █                  █          █                              
 10.1 | █        █  █ ██  █                █ █        █ █                              
 10.0 | ██     █ █  █ ██  ██   █        █ ██ █        █ █                              
 10.0 | ██     █ █  █ ██  ██  ██        █ ██ █        █ █                              
 10.0 | ██   █ █ ███████████  ██  ███  ███████    █   █ ██   ████  █    ██  ██         
 10.0 |███ ███ █ █████████████████████ ████████   ██  ████ ██████████   ███ ████  █   █
 10.0 |███ ███ █ ██████████████████████████████   ██  ████ ██████████ █████ ████  █ █ █
  9.9 |██████████████████████████████████████████ ██  ████ ██████████ █████ █████ ███ █
  9.9 |██████████████████████████████████████████ ███ ████ ██████████ ███████████ ███ █
  9.9 |██████████████████████████████████████████████ ███████████████████████████ ███ █
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  69 ms |   1
  70 ms |   1
  71 ms |   2
  72 ms |   1
  73 ms |   1
  74 ms |   3
  75 ms |   3
  76 ms |   1
  77 ms |   1
  79 ms |   1
  81 ms |   2
  83 ms |   3
  85 ms |   5
  86 ms |   4
  87 ms | █  12
  88 ms | █  10
  89 ms | █  16
  90 ms | █  10
  91 ms |   5
  92 ms |   2
  93 ms |   2
  94 ms |   3
  95 ms |   1
  96 ms |   4
  97 ms | █  14
  98 ms | █████  90
  99 ms | █████████████████████████████  505
 100 ms | ████████████████████████████████████████  698
 101 ms | ████████████  208
 102 ms | ███  56
 103 ms | █  19
 104 ms | █  11
 105 ms |   3
 106 ms |   3
 107 ms |   7
 108 ms |   4
 109 ms |   5
 110 ms | █  14
 111 ms | █  16
 112 ms | █  12
 113 ms |   2
 114 ms |   5
 115 ms |   1
 116 ms |   1
 117 ms |   1
 118 ms |   3
 120 ms |   1
 121 ms |   1
 122 ms |   3
 123 ms |   2
 124 ms |   2
 125 ms |   7
 126 ms |   1
 127 ms |   2
 128 ms |   2
 131 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.70`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.96`
- `fps_1pct_low` = `7.94`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`

