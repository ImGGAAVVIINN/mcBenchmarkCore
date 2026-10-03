# FPS Test session — 2026-09-11T11:44:59.113885457+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 353.2 | 45.5 | 40.4 | 21.06 | 0.56 | 3 | 64 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 317.6 | 46.9 | 43.7 | 20.63 | 0.63 | 4 | 141 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 214.5 | 21.4 | 20.7 | 45.63 | 0.60 | 1 | 176 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 31.0 | 21.3 | 21.0 | 46.27 | 0.67 | 2 | 165 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 31.1 | 21.3 | 21.0 | 46.14 | 0.64 | 3 | 340 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 31.1 | 21.5 | 21.3 | 46.04 | 0.47 | 1 | 100 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 32.9 | 20.4 | 17.8 | 46.78 | 0.64 | 4 | 16 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 31.2 | 21.1 | 20.9 | 46.88 | 1.01 | 2 | 286 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 32.0 | 17.7 | 16.5 | 49.44 | 2.75 | 5 | 492 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 35.5 | 16.2 | 14.7 | 59.42 | 3.52 | 10 | 194 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 31.1 | 20.3 | 18.1 | 46.72 | 0.87 | 5 | 40 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 96.7 | 46.6 | 45.2 | 20.95 | 0.48 | 4 | 540 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 152.1 | 28.0 | 26.9 | 34.43 | 3.37 | 5 | 360 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.6 | 17.2 | 15.9 | 55.33 | 2.71 | 5 | 172 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 36.3 | 13.8 | 13.3 | 70.28 | 13.95 | 30 | 198 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 38.1 | 13.7 | 12.4 | 69.03 | 14.61 | 29 | 485 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 366.4 | 35.3 | 12.9 | 21.97 | 1.67 | 5 | 511 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 346.0 | 43.2 | 36.0 | 21.75 | 1.72 | 5 | 168 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 30.9 | 21.4 | 21.0 | 45.90 | 0.63 | 0 | 488 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 30.9 | 21.1 | 20.2 | 46.01 | 0.27 | 0 | 156 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 31.0 | 21.1 | 19.8 | 46.41 | 0.23 | 1 | 316 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 31.1 | 21.2 | 20.9 | 46.49 | 0.28 | 0 | 560 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 30.9 | 21.6 | 21.0 | 45.75 | 0.27 | 0 | 184 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 86.2 | 19.3 | 13.4 | 46.56 | 0.40 | 45 | 370 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 173.3 | 23.3 | 5.1 | 20.09 | 0.42 | 30 | 1003 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 128.9 | 48.3 | 30.1 | 16.70 | 0.33 | 26 | 1151 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 93.7 | 22.4 | 19.9 | 42.09 | 0.33 | 26 | 217 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 30.2 | 21.6 | 20.2 | 44.16 | 0.34 | 21 | 708 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 30.3 | 21.5 | 20.3 | 44.81 | 0.32 | 22 | 600 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 30.1 | 23.1 | 22.4 | 41.57 | 0.34 | 21 | 1109 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 119.9 | 52.3 | 38.0 | 15.95 | 0.34 | 26 | 967 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 119.9 | 53.1 | 46.6 | 16.98 | 0.38 | 25 | 720 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 126.3 | 57.2 | 44.1 | 14.04 | 0.30 | 23 | 651 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 125.1 | 26.4 | 22.8 | 34.56 | 0.33 | 29 | 0 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 30.1 | 23.1 | 21.6 | 41.54 | 0.33 | 20 | 1432 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 30.0 | 25.8 | 25.7 | 38.31 | 0.24 | 0 | 136 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 30.6 | 21.2 | 20.1 | 45.36 | 2.78 | 1 | 324 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 30.0 | 25.6 | 24.0 | 38.20 | 0.28 | 1 | 148 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 30.0 | 25.0 | 23.1 | 38.55 | 0.24 | 0 | 196 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 30.0 | 26.2 | 26.0 | 37.61 | 0.25 | 0 | 220 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 30.0 | 26.0 | 25.8 | 37.86 | 0.26 | 0 | 232 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 30.3 | 23.2 | 21.7 | 41.98 | 0.75 | 18 | 988 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 25.5 | 9.2 | 8.8 | 106.52 | 0.67 | 12 | 847 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.0 | 9.1 | 8.4 | 108.66 | 0.64 | 11 | 261 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.0 | 8.9 | 8.5 | 109.68 | 0.64 | 10 | 1092 |

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

Category: **Particles**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `353.15`, min `40.17`, p50 `117.25`, p95 `1468.88`, p99 `1827.35`, 1%low `45.50`, 0.1%low `40.41`, std `491.31`

**Frame time (ms)**  avg `9.60`, p50 `8.53`, p95 `18.64`, p99 `21.06`, p99.9 `24.07`, max `24.89`

**Client tick (ms)**  avg `0.56`, p95 `0.89`, max `1.28`

**Memory**  start `726 MB`, end `791 MB`, peak `791 MB`, GC `3 events / 15 ms`

**FPS over sampling window (ASCII):**

```
524.0 |                            █                                                   
493.3 |                            █                                                   
462.6 |                            █          █        █       █            █ █        
431.9 |              █           █ █ █      █ █       ██ █     █      █  █  █ █        
401.2 |           █  █  █    █ █ █ █ █  █   █ █ █     ██ ███   █      █  █ █████       
370.5 |           ██ █  █   ██ █ █ █ █ ██  ██ █ ██   ███ ███   █ █  █ █ ████████   ██  
339.8 |         █ ██ █████████████████ ██ █████ ██ █ ███ ███   █ ████ █ █████████  ████
309.1 |      ██ ██████████████████████ ██ ██████████ █████████ █ ████ ████████████ ████
278.4 | █ █ ████████████████████████████████████████ █████████ █ ████ ████████████ ████
247.7 |██████████████████████████████████████████████████████████████ █████████████████
217.0 |██████████████████████████████████████████████████████████████ █████████████████
186.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████  319
   1 ms | █████████████  165
   2 ms | █████  62
   3 ms | █  10
   4 ms |   3
   5 ms |   1
   6 ms |   3
   7 ms | ████████  110
   8 ms | ████████████████████████████████████████  528
   9 ms | ██████  81
  10 ms |   4
  11 ms |   1
  12 ms |   5
  13 ms | ███  34
  14 ms | █████████  113
  15 ms | ███████████████  194
  16 ms | ██████████████  181
  17 ms | █████████  118
  18 ms | █████  62
  19 ms | ██  29
  20 ms | ███  37
  21 ms | █  19
  22 ms |   2
  24 ms |   3
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 260 | 279.1 | 21.36 |
| `portal` | 160 | 260 | 360.6 | 20.22 |
| `ALL_TOGETHER` | 1680 | 260 | 382.3 | 21.01 |
| `sculk_charge_pop` | 240 | 260 | 367.5 | 20.36 |
| `smoke` | 160 | 260 | 354.3 | 21.38 |
| `flame` | 160 | 260 | 352.1 | 20.98 |
| `dripping_water` | 240 | 260 | 371.1 | 20.53 |
| `dragon_breath` | 160 | 260 | 354.9 | 20.93 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `104.19`
- `fps_0p1pct_low` = `40.41`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `45.50`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `64.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `317.62`, min `43.11`, p50 `117.59`, p95 `1322.75`, p99 `1476.96`, 1%low `46.88`, 0.1%low `43.74`, std `426.58`

**Frame time (ms)**  avg `9.43`, p50 `8.50`, p95 `18.01`, p99 `20.63`, p99.9 `22.03`, max `23.19`

**Client tick (ms)**  avg `0.63`, p95 `0.92`, max `1.23`

**Memory**  start `735 MB`, end `725 MB`, peak `877 MB`, GC `4 events / 14 ms`

**FPS over sampling window (ASCII):**

```
417.4 | █                                                     █                        
399.5 | █                  █              █                   █            █           
381.5 | █            █  █  █   █          ██                  █            █     █     
363.5 | █            █  █  █   █          ██ █                █        █ █ █    ██     
345.5 | █  █   █     ██ █  █  ██ █        ██ █      █      █  █    █████ █ █    ██ ██  
327.6 | █  █ █ ██    ██ █  █  ██ █        ████   █  ██     ████    █████ █ █   ███ ██  
309.6 |███ █ █ ███   █████ █ ██████  █   █████████  ██  █  ████ █  █████ █ ██  ██████  
291.6 |███ █ █ ███  ██████ ███████████ ███████████  ██ ████████ █ ██████ █ ██████████  
273.7 |███████ ███  ██████████████████ ███████████  ███████████ █ ██████ ████████████ █
255.7 |████████████ ███████████████████████████████ █████████████████████████████████ █
237.7 |████████████████████████████████████████████ █████████████████████████████████ █
219.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████  297
   1 ms | ████████████  159
   2 ms | ██████  81
   3 ms | █  16
   5 ms |   1
   6 ms |   2
   7 ms | ██████████  131
   8 ms | ████████████████████████████████████████  548
   9 ms | ███████  97
  11 ms |   1
  12 ms | █  7
  13 ms | ████  52
  14 ms | ███████████  155
  15 ms | ███████████████  205
  16 ms | █████████████  176
  17 ms | ██████  85
  18 ms | ███  36
  19 ms | ██  26
  20 ms | ██  34
  21 ms | █  8
  22 ms |   3
  23 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `106.04`
- `preload_duration_ms` = `55.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.88`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `43.74`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `214.54`, min `20.72`, p50 `65.01`, p95 `1236.41`, p99 `1376.61`, 1%low `21.42`, 0.1%low `20.72`, std `365.97`

**Frame time (ms)**  avg `17.96`, p50 `15.38`, p95 `41.19`, p99 `45.63`, p99.9 `47.46`, max `48.26`

**Client tick (ms)**  avg `0.60`, p95 `0.89`, max `1.13`

**Memory**  start `705 MB`, end `871 MB`, peak `881 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
490.0 |                                                   █                            
448.2 |                █                      █      █    █                            
406.3 |    █     █     █                      █      ██  ██                            
364.5 |█   █     █   █ ██   █    ██ █     █ ███      ██  ██                            
322.6 |█   █     ██ ██ ███ ██  █ ██ ███████ ████     ██ ████                           
280.8 |█ █ █  █ ██████████ ███ █████████████████████ ██ █████                          
238.9 |█████  ██████████████████████████████████████ ████████                          
197.1 |██████ ████████████████████████████████████████████████                         
155.2 |███████████████████████████████████████████████████████                         
113.4 |███████████████████████████████████████████████████████                         
 71.5 |███████████████████████████████████████████████████████                         
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████████  104
   1 ms | ██████████  49
   2 ms | ██████  29
   3 ms | █  6
   7 ms | ████████  38
   8 ms | ████████████████████████████████████████  198
   9 ms | █████  24
  13 ms | █████  26
  14 ms | ███████████  54
  15 ms | ███████████████  73
  16 ms | ███████████  53
  17 ms | ████  20
  18 ms | ████  18
  19 ms | ███  14
  20 ms | ███  13
  21 ms | ██  12
  22 ms | ███  14
  23 ms | ██  10
  24 ms | █  6
  25 ms | █  6
  26 ms | ██  8
  27 ms | █  5
  28 ms | ██  9
  29 ms | ██  11
  30 ms | ████  18
  31 ms | ████████  41
  32 ms | ███████████  54
  33 ms | ██████████  49
  34 ms | ████████  41
  35 ms | ██  11
  36 ms | ██  11
  37 ms | ██  8
  38 ms | █  6
  39 ms | ██  8
  40 ms | █  6
  41 ms | ██  8
  42 ms | █  7
  43 ms | ██  10
  44 ms | ██  12
  45 ms | ██  12
  46 ms | █  7
  47 ms |   2
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `55.67`
- `preload_duration_ms` = `42.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.42`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.72`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `31.00`, min `20.95`, p50 `30.33`, p95 `44.10`, p99 `48.57`, 1%low `21.26`, 0.1%low `20.95`, std `6.41`

**Frame time (ms)**  avg `33.41`, p50 `32.97`, p95 `44.85`, p99 `46.27`, p99.9 `47.50`, max `47.72`

**Client tick (ms)**  avg `0.67`, p95 `0.85`, max `1.18`

**Memory**  start `730 MB`, end `777 MB`, peak `896 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 39.6 |                                                     █                          
 38.7 |                                                     █                          
 37.7 |                                                     █                          
 36.7 |                                                     █                          
 35.7 |                                                     █                          
 34.7 |                                                     █                          
 33.8 |                                                     █                          
 32.8 |   █     █ █        █    █  █  █                █    ██   █           █         
 31.8 |   ██    █ █  █  █ ██  █ █  █  █ █       █   █ ██    ██  ███  █ █ █   █ █     █ 
 30.8 | █ ██  ███ █  █  █ ███ █ █  █  ████ ██ ████  ████  █ ██  ████ █ ███  █████ █ ███
 29.9 |██ ███████ █████████████████████████████████ ███████████████████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  10 ms | █  1
  18 ms | █  2
  19 ms | █  2
  20 ms | ██  4
  21 ms | █████  9
  22 ms | ████████  16
  23 ms | ███████  13
  24 ms | ██████  12
  25 ms | ████  7
  26 ms | █████  10
  27 ms | ████████  16
  28 ms | █████  10
  29 ms | ████████  15
  30 ms | █████████████████████  42
  31 ms | ███████████████████████████████  62
  32 ms | ████████████████████████████████████████  79
  33 ms | ████████████████████████████████████████  79
  34 ms | ████████████████████████████  55
  35 ms | ███████████  21
  36 ms | █████  9
  37 ms | ███████████  21
  38 ms | █████  10
  39 ms | ██████  11
  40 ms | ███████  14
  41 ms | ██████  11
  42 ms | ██████  12
  43 ms | █████  10
  44 ms | ██████████  20
  45 ms | █████████  17
  46 ms | ███  6
  47 ms | ██  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.93`
- `preload_duration_ms` = `90.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.26`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.95`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `31.07`, min `20.98`, p50 `30.17`, p95 `45.26`, p99 `49.18`, 1%low `21.28`, 0.1%low `20.98`, std `6.33`

**Frame time (ms)**  avg `33.40`, p50 `33.14`, p95 `45.11`, p99 `46.14`, p99.9 `47.63`, max `47.65`

**Client tick (ms)**  avg `0.64`, p95 `0.89`, max `1.33`

**Memory**  start `557 MB`, end `641 MB`, peak `897 MB`, GC `3 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 34.6 |     █                    █                                                     
 34.1 |     █                    █                                                    █
 33.6 |     █                    █                                                    █
 33.1 |     █              █     █                                              █     █
 32.6 |  █  █ █  ██  █   █ █     █    █                                         █     █
 32.1 |  █  █ █ ███  █   █ █     █  █ █      ██            █ █        █         █     █
 31.6 |  █  █ █ ███  █   █ █  █  █  █ █ █    ██    █     █ █ █   █    █    █    █     █
 31.1 | ██  █ █ ████ █  ██ ██ ██ █  ███ ██ █ ███   █  █ ██ █ █   █ █  █    ████ █ █  ██
 30.6 | ██  ███ ███████ ██ ██ ██ █  ███ ██ █████  ██  █ ██ █ █   ██████████████ █ █  ██
 30.1 | ███ ███ ████████████████ ████████████████ █████████████████████████████ ████ ██
 29.6 |████████ ████████████████ ██████████████████████████████████████████████████████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | █  3
  20 ms | ███  7
  21 ms | ████████  18
  22 ms | ██████  13
  23 ms | ████████  16
  24 ms | ████  9
  25 ms | ████  9
  26 ms | ███████  15
  27 ms | ████  9
  28 ms | █  3
  29 ms | ██████  13
  30 ms | ██████████████  30
  31 ms | ████████████████████████████  60
  32 ms | ████████████████████████████████████████  85
  33 ms | ██████████████████████████████████████  80
  34 ms | ███████████████████████████  58
  35 ms | ███████████  23
  36 ms | ████████  18
  37 ms | ██████  12
  38 ms | ██████  12
  39 ms | ████  8
  40 ms | █████  10
  41 ms | █████  10
  42 ms | ███████  15
  43 ms | ██████  12
  44 ms | ██████  12
  45 ms | █████████████  27
  46 ms | ███  7
  47 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `36.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.28`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.98`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `31.06`, min `21.30`, p50 `30.24`, p95 `45.40`, p99 `47.81`, 1%low `21.50`, 0.1%low `21.30`, std `6.27`

**Frame time (ms)**  avg `33.40`, p50 `33.07`, p95 `44.95`, p99 `46.04`, p99.9 `46.82`, max `46.96`

**Client tick (ms)**  avg `0.47`, p95 `0.59`, max `0.90`

**Memory**  start `827 MB`, end `724 MB`, peak `927 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 34.6 |    █                                                                           
 34.0 |    █   █  █                                                                    
 33.5 |    █   █  █                                                                    
 33.0 | █  █   █  █  █                                                                 
 32.5 | ██ █   █  █  █      █ █              █    █       █   █        █  █           █
 32.0 | ██ █   █  █ ██      █ █              █    █       █   █      ███  █           █
 31.5 | ██ █ █ █  █ ██ █    █ █  █  █        █    █ ██  █ █   ███ ██ ███  █       ██  █
 30.9 | ██ █ ████ █ ██ █ ██ █ █ ██  ██ █  ██ █   ██ ███ █ ███ ███ ██ ███  ██  █   ██  █
 30.4 |███ █ ████ █ ██ █ ██ █ █████ ███████████ ███ ███ █████ ██████ ███  ██████  ███ █
 29.9 |███ █ ████ ████ ██████ █████████████████████ ███ █████ ██████ ███ ████████████ █
 29.4 |███ ██████████████████ █████████████████████████████████████████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  3
  20 ms | ██  5
  21 ms | ██████████  22
  22 ms | ███████  17
  23 ms | ██████  13
  24 ms | ███  6
  25 ms | ████  8
  26 ms | ██████  14
  27 ms | █████  12
  28 ms | ███████  15
  29 ms | █████████  20
  30 ms | ████████████  28
  31 ms | ██████████████████████  49
  32 ms | ████████████████████████████████████  81
  33 ms | ████████████████████████████████████████  91
  34 ms | ██████████████████  42
  35 ms | ████████  18
  36 ms | ███████  17
  37 ms | ████████  19
  38 ms | ████  8
  39 ms | ██████  14
  40 ms | █████  12
  41 ms | █████  11
  42 ms | ████  10
  43 ms | ████  9
  44 ms | ████████████  27
  45 ms | █████████  21
  46 ms | ███  7
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `55.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.50`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.30`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `32.91`, min `17.83`, p50 `30.36`, p95 `46.51`, p99 `50.23`, 1%low `20.41`, 0.1%low `17.83`, std `42.27`

**Frame time (ms)**  avg `33.38`, p50 `32.94`, p95 `45.50`, p99 `46.78`, p99.9 `51.21`, max `56.10`

**Client tick (ms)**  avg `0.64`, p95 `0.92`, max `1.30`

**Memory**  start `918 MB`, end `459 MB`, peak `934 MB`, GC `4 events / 21 ms`

**FPS over sampling window (ASCII):**

```
173.3 |   █                                                                            
160.2 |   █                                                                            
147.1 |   █                                                                            
133.9 |   █                                                                            
120.8 |   █                                                                            
107.7 |   █                                                                            
 94.5 |   █                                                                            
 81.4 |   █                                                                            
 68.3 |   █                                                                            
 55.1 |   █                                                                            
 42.0 |   █                                                                            
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
  18 ms |   1
  19 ms | ██  5
  20 ms | ████  10
  21 ms | █████████  20
  22 ms | █████████  20
  23 ms | ████  10
  24 ms | ████  8
  25 ms | ██████  14
  26 ms | ███  7
  27 ms | ████  10
  28 ms | █████  11
  29 ms | ████████  18
  30 ms | ██████████████  32
  31 ms | ██████████████████████  48
  32 ms | ████████████████████████████████████████  89
  33 ms | ████████████████████████████████  71
  34 ms | ████████████████████████  53
  35 ms | ███████  16
  36 ms | ██████  14
  37 ms | ████  10
  38 ms | ██████  13
  39 ms | █████  12
  40 ms | ███████  16
  41 ms | ██  4
  42 ms | ████  8
  43 ms | ██████  14
  44 ms | █████████  21
  45 ms | ███████████  24
  46 ms | ██████  14
  47 ms | ██  4
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.96`
- `preload_duration_ms` = `32.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.41`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.83`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23072 ms  |  Sample ticks: 400

**FPS**  avg `31.16`, min `20.93`, p50 `30.42`, p95 `45.12`, p99 `50.35`, 1%low `21.14`, 0.1%low `20.93`, std `6.60`

**Frame time (ms)**  avg `33.41`, p50 `32.87`, p95 `44.90`, p99 `46.88`, p99.9 `47.67`, max `47.77`

**Client tick (ms)**  avg `1.01`, p95 `1.20`, max `1.37`

**Memory**  start `661 MB`, end `740 MB`, peak `948 MB`, GC `2 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                                         █                                  █   
 32.8 |      █                        █  █   █  █          █                    █  █   
 32.4 | █    █  █                     █  ██  █  █          █                    █ ██   
 32.0 | █    █  █ █          ██     █ █  ██  █ ██ █        █       █     ██     █ ██   
 31.7 | █    █  █ █          ███    █ ██ ██ ██ ██ ██  █   ██      ███    ██  █  █ ██ █ 
 31.3 | █ █ ██  █ █      █  ████    ████ ██ ██ ██ ██  █   ██    █ ████   ██  ████ ████ 
 30.9 | ███ ███ █ █ █    ████████   ████ █████ ██ ███ █ █████████ ████   ██  █████████ 
 30.5 |████ ███ █ ███ █  ██████████ ██████████ ██ ███ ███████████ ██████ ██ ██████████ 
 30.1 |████ █████ █████ ███████████ ██████████ ██ ███ ███████████ ██████ ██████████████
 29.8 |████ ███████████████████████ ██████████ ██████████████████ ██████ ██████████████
 29.4 |████████████████████████████ █████████████████████████████ █████████████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  19 ms | ███  6
  20 ms | ████  7
  21 ms | ████████  14
  22 ms | █████████  15
  23 ms | █████████  16
  24 ms | █████  9
  25 ms | ██████████  17
  26 ms | █████  9
  27 ms | █████████  16
  28 ms | ███████  13
  29 ms | ██████████  17
  30 ms | ███████████████████████  41
  31 ms | █████████████████████████████████  57
  32 ms | ████████████████████████████████████████  70
  33 ms | ███████████████████████████  48
  34 ms | ████████████████████████████████  56
  35 ms | █████████████  22
  36 ms | ████████  14
  37 ms | █████████  16
  38 ms | ██████  10
  39 ms | ███████  13
  40 ms | ███████  13
  41 ms | █████████  15
  42 ms | ███████████  19
  43 ms | ████████  14
  44 ms | █████████████  22
  45 ms | ███████  13
  46 ms | ██████  11
  47 ms | ██  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.93`
- `preload_duration_ms` = `42.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.14`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.93`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `31.95`, min `16.51`, p50 `30.60`, p95 `49.87`, p99 `56.18`, 1%low `17.66`, 0.1%low `16.51`, std `8.85`

**Frame time (ms)**  avg `33.41`, p50 `32.68`, p95 `47.07`, p99 `49.44`, p99.9 `60.22`, max `60.57`

**Client tick (ms)**  avg `2.75`, p95 `3.27`, max `8.84`

**Memory**  start `489 MB`, end `440 MB`, peak `982 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 39.5 |                                                                █               
 38.5 |                                                                █               
 37.6 |                                                                █               
 36.7 |                                                                █               
 35.8 |                                                          █     █               
 34.8 |            █             █                               █     █               
 33.9 |   █       ██        █ █  █            █ ██               █     █               
 33.0 |  ██    █  ██    █   █ █ ██  █        ██ ██  █  █         █ █   █  █   █  ██ ██ 
 32.0 |████   ██  ██    █   █ █ ██ ██ ██    ███ ███ █ ██  █ █    █ █   █  █   █  ██████
 31.1 |█████████ ███  ███████████████ ███ █████ ███ █████ ████████ █  ██████ ███ ██████
 30.2 |██████████████ ███████████████████████████████████████████████ █████████████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  10 ms | █  1
  16 ms | █  2
  17 ms | ███  5
  18 ms | █████  8
  19 ms | ████████  13
  20 ms | ████████  13
  21 ms | ████████████  19
  22 ms | ██████████  16
  23 ms | ██████  10
  24 ms | ██████████  16
  25 ms | ██████  10
  26 ms | ██████  9
  27 ms | ███  4
  28 ms | ██████████████  23
  29 ms | ███████████████  24
  30 ms | ████████████████████████████████████████  64
  31 ms | ███████████████████████  36
  32 ms | ████████████████████  32
  33 ms | ███████████████████████  36
  34 ms | ███████████████████  30
  35 ms | ███████████████████  31
  36 ms | █████████████████████  33
  37 ms | ████████  13
  38 ms | ████████  13
  39 ms | ██████  10
  40 ms | ██████  9
  41 ms | ██████  10
  42 ms | ████████  13
  43 ms | ██████  9
  44 ms | ███████████  17
  45 ms | █████████████  20
  46 ms | ██████████  16
  47 ms | ██████████  16
  48 ms | █████  8
  49 ms | ███  4
  51 ms | █  1
  58 ms | █  1
  59 ms | █  2
  60 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.93`
- `preload_duration_ms` = `72.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.66`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.51`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23128 ms  |  Sample ticks: 400

**FPS**  avg `35.49`, min `14.67`, p50 `31.15`, p95 `62.42`, p99 `102.60`, 1%low `16.18`, 0.1%low `14.67`, std `17.21`

**Frame time (ms)**  avg `33.40`, p50 `32.10`, p95 `56.28`, p99 `59.42`, p99.9 `64.51`, max `68.16`

**Client tick (ms)**  avg `3.52`, p95 `4.79`, max `6.36`

**Memory**  start `786 MB`, end `765 MB`, peak `980 MB`, GC `10 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 49.1 | █                                                                              
 47.3 | █                        █                                                     
 45.5 | █                        █         █                                  █        
 43.7 | █                        █         █    █                             ██       
 41.9 | █                        █         █    █                             ██  █  █ 
 40.1 | ██       █           █   █         █    █             █               ██  █  █ 
 38.3 | ██       █           █   █         █ █  █  █          █  █     █    █ ███ █  ██
 36.6 | ██       █  █        █  ██ ██     ██ █  █ ██         ██ ██     █  █ █ ███ █  ██
 34.8 | ██     ███  █        ████████  █ ██████ █ ██        ████████ █ █ ██ █████ █  ██
 33.0 | ███ █ ████  █     █  ████████ █████████ █ █████     ████████ █ █ ████████ ██ ██
 31.2 |████ █ █████ ██ █████████████████████████████████ ███████████ ██████████████████
 29.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | ███  2
   8 ms | █  1
   9 ms | ███████  5
  10 ms | ████████  6
  11 ms | ███  2
  12 ms | ████  3
  13 ms | ███████  5
  14 ms | ████  3
  15 ms | ████  3
  16 ms | ███████████  8
  17 ms | ███████████  8
  18 ms | ███████████████  11
  19 ms | ███████████████████████████████  23
  20 ms | ███████████████████████████████  23
  21 ms | █████████████████████████████████████  28
  22 ms | ███████████████████████████  20
  23 ms | ████████████████████████████████████████  30
  24 ms | ████████████████  12
  25 ms | ███████████████  11
  26 ms | █████████████  10
  27 ms | ████████████  9
  28 ms | ███████████████████  14
  29 ms | █████████████████████  16
  30 ms | █████████████████████████████████████  28
  31 ms | ████████████████████  15
  32 ms | █████████████████████████  19
  33 ms | ████████████████████████████████  24
  34 ms | ████████████████████████  18
  35 ms | █████████████████████████████  22
  36 ms | ███████████████████  14
  37 ms | █████████████████████  16
  38 ms | ████████  6
  39 ms | ████████████  9
  40 ms | ████████████  9
  41 ms | ███████  5
  42 ms | ███████████████  11
  43 ms | ████████████  9
  44 ms | █████████  7
  45 ms | ███████████████  11
  46 ms | █████████  7
  47 ms | ███████████████████████  17
  48 ms | ████████████████  12
  49 ms | ███████████████  11
  50 ms | ████████████  9
  51 ms | ████████  6
  52 ms | █████████████  10
  53 ms | █████████  7
  54 ms | ███████  5
  55 ms | █████████  7
  56 ms | █████████████  10
  57 ms | ███████████  8
  58 ms | ███████  5
  59 ms | ███████  5
  60 ms | ███  2
  62 ms | █  1
  68 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `14.67`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `34.00`
- `fps_harmonic_avg` = `29.94`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `16.18`
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

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `31.07`, min `18.13`, p50 `30.24`, p95 `44.99`, p99 `51.08`, 1%low `20.35`, 0.1%low `18.13`, std `6.42`

**Frame time (ms)**  avg `33.44`, p50 `33.07`, p95 `45.44`, p99 `46.72`, p99.9 `52.14`, max `55.16`

**Client tick (ms)**  avg `0.87`, p95 `1.06`, max `1.35`

**Memory**  start `956 MB`, end `658 MB`, peak `997 MB`, GC `5 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |                                                                              █ 
 34.3 |                                                                              █ 
 33.8 |                █                            █                                █ 
 33.2 |  █            ██                            █                                █ 
 32.7 |  ██   █       ██                           ██      █  █  █   █               █ 
 32.1 |█ ██   █  █ █  ██                    ██     ██  █   █  █  █   █          █    █ 
 31.6 |█ ██   █  █ █  ██       ██ █     █   ██  █ ███ ██   █  █  █   ██ █   █   █  █ █ 
 31.1 |█ ██  ██  █ █████      ███ ███ █ █   ██  █ ██████ █ ██ ██ █  ███ █   █   ██ █ █ 
 30.5 |█ ██ ████ █ █████  ███ ███ ███ █ ██ ██████ ████████ ██ ██ ██ ███ █████  ███ █ █ 
 30.0 |█ ██ ████ █ ██████████████ ███ ███████████ █████████████████████ ██████ ████████
 29.5 |█ ████████████████████████ ███ ███████████ █████████████████████ ███████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | ███  7
  20 ms | ████  8
  21 ms | ██████  12
  22 ms | ████████  16
  23 ms | ██████  12
  24 ms | ████  8
  25 ms | █████  10
  26 ms | ███████  15
  27 ms | ██████  13
  28 ms | ████  8
  29 ms | ███████  15
  30 ms | ███████████████████  39
  31 ms | ████████████████████████  48
  32 ms | ████████████████████████████████████████  81
  33 ms | ████████████████████████████████  65
  34 ms | █████████████████████████████████  67
  35 ms | ██████████  21
  36 ms | █████████  18
  37 ms | █████████  18
  38 ms | ███████  15
  39 ms | ████  9
  40 ms | ████  9
  41 ms | ██████  13
  42 ms | ███  7
  43 ms | ███████  14
  44 ms | ██████  13
  45 ms | █████████  19
  46 ms | ███████  14
  47 ms |   1
  48 ms |   1
  50 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `36.00`
- `fps_1pct_low` = `20.35`
- `fps_harmonic_avg` = `29.90`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `18.13`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `96.70`, min `45.23`, p50 `93.40`, p95 `129.03`, p99 `476.76`, 1%low `46.63`, 0.1%low `45.24`, std `71.38`

**Frame time (ms)**  avg `12.46`, p50 `10.71`, p95 `18.85`, p99 `20.95`, p99.9 `22.01`, max `22.11`

**Client tick (ms)**  avg `0.48`, p95 `0.65`, max `0.82`

**Memory**  start `444 MB`, end `871 MB`, peak `984 MB`, GC `4 events / 8 ms`

**FPS over sampling window (ASCII):**

```
134.5 |                         █                               █                      
129.6 |                      █  █                               ██                     
124.7 |                   █  █  █                  █            ██                     
119.8 | █            █    ██ █  █                  █        █   ██        █       █    
114.9 | █       █    █    ██ █  ██            █    █        █   ██        █       █    
110.0 | █       █    █   ███ █ ███            █    █        █   ██        █       █   █
105.1 | █       █    █   ███ █ ███            █    █        █   ██        █       █   █
100.2 | █       █    █   ███ █ ███            █    █        █   ██        █       █   █
 95.3 | █      ██   ███ ████ ██████ █  █ █ █ ███ █ █        █ █ ██     █ ███   █  █ █ █
 90.4 | █  █ █ ████ ███ ███████████ ██ █ █ █ ███ █ ████   █ █ █ ██ ███ █ █████ ██████ █
 85.5 | █████████████████████████████████████████████████ ████████████ ████████████████
 80.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  15
   2 ms |   5
   5 ms |   1
   7 ms | ████████████  162
   8 ms | ████████████████████████████████████████  560
   9 ms | ████  50
  10 ms | █  14
  11 ms | █  7
  13 ms |   1
  14 ms | ████  49
  15 ms | ███████████████  212
  16 ms | ████████████████████  273
  17 ms | ███████  104
  18 ms | ██████  84
  19 ms | ██  30
  20 ms | ██  23
  21 ms | █  13
  22 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `45.24`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `56.00`
- `fps_harmonic_avg` = `80.29`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `46.63`
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

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `152.05`, min `26.60`, p50 `114.45`, p95 `641.56`, p99 `738.34`, 1%low `28.04`, 0.1%low `26.89`, std `171.90`

**Frame time (ms)**  avg `12.62`, p50 `8.74`, p95 `31.53`, p99 `34.43`, p99.9 `36.73`, max `37.59`

**Client tick (ms)**  avg `3.37`, p95 `5.08`, max `8.06`

**Memory**  start `691 MB`, end `782 MB`, peak `1051 MB`, GC `5 events / 12 ms`

**FPS over sampling window (ASCII):**

```
211.7 |        █                                                                       
200.6 |        █                     █                    █                 █     █    
189.6 |        █      █           █  █            ██      ██       █        █     █    
178.5 |        █      █  █ █    █ █  █   █        ██     ███   █  ██        █  █  █    
167.4 |        █ █    █  ███    ███  █   █      █ ██ █ █ ███   █  ██      █ █  █ ██   █
156.3 | █  ███ █ ████ █  ███ ██ ███  █  ████ ███████ ███████   █████      ███ ██ ██   █
145.2 |████████████████ ████ ██████  █  ████ ████████████████ ██████      ███ ██ ██   █
134.1 |█████████████████████ ███████ ███████ ████████████████ ██████     ██████████   █
123.1 |█████████████████████ █████████████████████████████████████████   ██████████   █
112.0 |█████████████████████ █████████████████████████████████████████   ██████████  ██
100.9 |███████████████████████████████████████████████████████████████   ███████████ ██
 89.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████████████  143
   2 ms | ███  30
   3 ms | ██  25
   4 ms | ████  46
   5 ms | ███████  82
   6 ms | █  15
   7 ms |   4
   8 ms | ████████████████████████████████████████  461
   9 ms | █  10
  10 ms | ███  36
  11 ms | ██████  64
  12 ms | ██  19
  13 ms | ███  29
  14 ms | █████  59
  15 ms | ███████  77
  16 ms | █████████  106
  17 ms | ████  51
  18 ms | ███  40
  19 ms | ██████  66
  20 ms | ███  35
  21 ms | █  12
  22 ms | █  10
  23 ms |   4
  24 ms | █  6
  25 ms |   3
  28 ms |   3
  29 ms | █  17
  30 ms | ███  34
  31 ms | ██  28
  32 ms | ██  28
  33 ms | █  16
  34 ms | █  14
  35 ms | █  6
  36 ms |   5
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `26.89`
- `preset_long` = `0.00`
- `preload_duration_ms` = `97.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `79.23`
- `fps_1pct_low` = `28.04`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.13`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `30.64`, min `15.94`, p50 `28.99`, p95 `48.87`, p99 `55.66`, 1%low `17.21`, 0.1%low `15.94`, std `9.11`

**Frame time (ms)**  avg `35.27`, p50 `34.50`, p95 `49.99`, p99 `55.33`, p99.9 `61.23`, max `62.73`

**Client tick (ms)**  avg `2.71`, p95 `4.41`, max `8.14`

**Memory**  start `948 MB`, end `496 MB`, peak `1120 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |       █                                                                  █     
 34.1 |       █ █     █                                                          █     
 33.4 |  █   ██ █   █ █                                  █   █ █                 █     
 32.7 |  █ █ ██ █ █ █ █                 █        █       █   █ █                 █     
 32.0 |  █ █ ████ ███ ██    █     █     █        ██  █   █   █ ███          █    █     
 31.2 |█ █ █ ████ ███ ██ ██ █     █  █  █ ██   █ ██ ██   █   █ ████         █    █     
 30.5 |███ ██████ ███ █████ ██    █  ██ █ ██ █ █ ██ ██ ███ ███ ████      █  ███  █   █ 
 29.8 |██████████████ █████ ██    ██ ██ █ ██ █ █ ██ ██ ███ ███ ████ █  ███████████ █ █ 
 29.1 |███████████████████████  █████████ ██ ███ ██ ██████████ ██████  ███████████ █ █ 
 28.4 |███████████████████████ ██████████ ██ ███ █████████████ ██████ ██████████████ ██
 27.7 |███████████████████████████████████████████████████████ ████████████████████████
 27.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  2
  17 ms | ████  6
  18 ms | ████  6
  19 ms | ███████  10
  20 ms | ███████████  15
  21 ms | ███████████  16
  22 ms | █████████████  18
  23 ms | █████████████  19
  24 ms | ██████████████  20
  25 ms | ██████  8
  26 ms | █  1
  27 ms | █  1
  28 ms | █  2
  29 ms | ████████  12
  30 ms | ███████████████  21
  31 ms | ████████████████  23
  32 ms | ████████████████████  28
  33 ms | ████████████████████████████████████████  57
  34 ms | █████████████████████████  35
  35 ms | █████████████████████████  35
  36 ms | ██████████████████████  32
  37 ms | █████████  13
  38 ms | ██████████████  20
  39 ms | ████  6
  40 ms | ██████  9
  41 ms | █  2
  42 ms | █  2
  43 ms | █████████  13
  44 ms | █████████████  19
  45 ms | ████████████████  23
  46 ms | ████████████████  23
  47 ms | ███████████  16
  48 ms | ███████████  15
  49 ms | ███████  10
  50 ms | ████  6
  51 ms | ████  6
  52 ms | ██  3
  53 ms | ███  4
  54 ms | ██  3
  55 ms | █  2
  56 ms | █  2
  57 ms | █  1
  60 ms | █  1
  62 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `15.94`
- `preset_long` = `0.00`
- `preload_duration_ms` = `53.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.36`
- `fps_1pct_low` = `17.21`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.54`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `36.25`, min `13.28`, p50 `29.53`, p95 `64.14`, p99 `155.33`, 1%low `13.79`, 0.1%low `13.28`, std `25.54`

**Frame time (ms)**  avg `35.64`, p50 `33.86`, p95 `63.44`, p99 `70.28`, p99.9 `74.57`, max `75.30`

**Client tick (ms)**  avg `13.95`, p95 `19.61`, max `30.22`

**Memory**  start `897 MB`, end `824 MB`, peak `1095 MB`, GC `30 events / 107 ms`

**FPS over sampling window (ASCII):**

```
 76.8 |                             █                                                  
 72.1 |                             █                                                  
 67.5 |                             █                                                  
 62.9 |                  █    █     █                                                  
 58.2 |                  █    █     █ █                                                
 53.6 |       █          █    █     █ █                                                
 49.0 |       █          █    █     █ █     █                      █           █     █ 
 44.4 |      ██          █ █  █    ██ █     █           █          ██          █     █ 
 39.7 |      ██     ██   █ █  █    ██ ██  █ █   ██   █  █    █     ██          █     █ 
 35.1 |  ██  ██ █   ██  ██ █ ██ ██ ██ ██  █ ██  ██ █ █ ███   █████ ████ █ █    █ █ █ ██
 30.5 |███████████████████████████ ██ ████████████████████████████████████████████ ████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ███  2
   5 ms | ███  2
   6 ms | █████  4
   7 ms | ███  2
   8 ms | ███████████  8
   9 ms | ███  2
  11 ms | █  1
  12 ms | ███  2
  13 ms | ███  2
  15 ms | █████████████████  13
  16 ms | ███████████████████████  17
  17 ms | █████████████████████████  19
  18 ms | ███████████████  11
  19 ms | ███████████████  11
  20 ms | █████████████████████  16
  21 ms | ████████████████  12
  22 ms | █████████████████  13
  23 ms | ███████████████████  14
  24 ms | █████████████████  13
  25 ms | ████████  6
  26 ms | ████████████  9
  27 ms | ████████████  9
  28 ms | █████████  7
  29 ms | ███████  5
  30 ms | ████████████████  12
  31 ms | █████████████████████████████  22
  32 ms | ████████████████████████████████████████  30
  33 ms | ███████████████████████████  20
  34 ms | ████████████████████████████████  24
  35 ms | █████████████  10
  36 ms | ████████████  9
  37 ms | █████  4
  38 ms | ███████████████████  14
  39 ms | ███████████  8
  40 ms | █████████  7
  41 ms | ███████████  8
  42 ms | █████████████████████  16
  43 ms | █████████████████  13
  44 ms | ████  3
  45 ms | ████████  6
  46 ms | █████████  7
  47 ms | █████████████████  13
  48 ms | ████████████████████████  18
  49 ms | ████████████████  12
  50 ms | ███████████████████  14
  51 ms | ███████████████  11
  52 ms | █████████  7
  53 ms | ████████  6
  54 ms | ████  3
  55 ms | █████  4
  56 ms | ████  3
  57 ms | █████████  7
  58 ms | ███████  5
  59 ms | █████  4
  60 ms | █████  4
  61 ms | ███  2
  62 ms | ███████  5
  63 ms | ███████  5
  64 ms | ████  3
  65 ms | ███████  5
  66 ms | ███  2
  67 ms | ███  2
  68 ms | ████  3
  69 ms | ████  3
  70 ms | ████  3
  71 ms | █  1
  73 ms | ███  2
  75 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `falling_blocks_landed` = `29993.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `28.06`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.28`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4806.32`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.79`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `84.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `38.14`, min `12.39`, p50 `29.32`, p95 `71.60`, p99 `140.13`, 1%low `13.69`, 0.1%low `12.39`, std `40.14`

**Frame time (ms)**  avg `35.66`, p50 `34.10`, p95 `61.80`, p99 `69.03`, p99.9 `78.35`, max `80.69`

**Client tick (ms)**  avg `14.61`, p95 `20.06`, max `25.39`

**Memory**  start `630 MB`, end `909 MB`, peak `1116 MB`, GC `29 events / 94 ms`

**FPS over sampling window (ASCII):**

```
118.0 |                                            █                                   
109.6 |                                            █                                   
101.3 |                                            █                                   
 93.0 |                    █                       █                                   
 84.6 |                    █                       █                                   
 76.3 |                    █                       █                                   
 67.9 | █                  █                       █                                   
 59.6 | █                  █                       █                                   
 51.2 | █                  █                       █         █   █                    █
 42.9 | █      █    ██     █         █         █ ███   █  █  █ █ ██     █ █           █
 34.5 |██████████ ██████████████ █████████████ ███████████████████████ █████ █████ ████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   2 ms | █  1
   3 ms | █  1
   6 ms | ███  2
   7 ms | ███████  5
   8 ms | ████  3
   9 ms | ███  2
  10 ms | ███  2
  11 ms | ██████  4
  12 ms | █████████  6
  13 ms | █  1
  14 ms | ██████████  7
  15 ms | ██████████████████████████  18
  16 ms | ████████████████████████████████████████  28
  17 ms | █████████████████████████████  20
  18 ms | █████████████████████  15
  19 ms | ███████████████████  13
  20 ms | ██████████  7
  21 ms | ██████  4
  22 ms | ███████  5
  23 ms | █████████  6
  24 ms | ████████████████  11
  25 ms | █████████████  9
  26 ms | █████████████  9
  27 ms | ███████████  8
  28 ms | ███████████████████  13
  29 ms | ██████████  7
  30 ms | █████████████  9
  31 ms | █████████████████████  15
  32 ms | █████████████████████████████████  23
  33 ms | ██████████████████████████████  21
  34 ms | ██████████████████████████████  21
  35 ms | ████████████████  11
  36 ms | ███████████  8
  37 ms | █████████████  9
  38 ms | ████████████████  11
  39 ms | ████████████████████  14
  40 ms | ██████████████  10
  41 ms | ██████  4
  42 ms | █████████  6
  43 ms | ███████████  8
  44 ms | ██████████████  10
  45 ms | ████  3
  46 ms | ████████████████  11
  47 ms | ████████████████████  14
  48 ms | ███████████████████  13
  49 ms | ███████████████████████  16
  50 ms | ██████████████  10
  51 ms | ████████████████████  14
  52 ms | ██████████████  10
  53 ms | ██████  4
  54 ms | ██████  4
  55 ms | ██████████  7
  56 ms | ████  3
  57 ms | ███████████  8
  58 ms | ███  2
  59 ms | ███████  5
  60 ms | ███████████  8
  61 ms | █████████████████  12
  62 ms | █  1
  63 ms | ███████████  8
  64 ms | ████  3
  65 ms | ███  2
  66 ms | ██████  4
  67 ms | █  1
  68 ms | ████  3
  69 ms | █  1
  70 ms | ████  3
  76 ms | █  1
  80 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `falling_blocks_landed` = `27710.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `28.04`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.39`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4812.55`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.69`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `67.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `366.35`, min `8.04`, p50 `118.18`, p95 `1867.34`, p99 `2551.17`, 1%low `35.29`, 0.1%low `12.86`, std `590.68`

**Frame time (ms)**  avg `9.55`, p50 `8.46`, p95 `18.65`, p99 `21.97`, p99.9 `29.22`, max `124.45`

**Client tick (ms)**  avg `1.67`, p95 `2.32`, max `2.61`

**Memory**  start `607 MB`, end `458 MB`, peak `1119 MB`, GC `5 events / 12 ms`

**FPS over sampling window (ASCII):**

```
678.0 |  █                                                                             
638.0 |  █                                                                             
598.0 |  █                                                                             
558.0 |  █                                             █        █                      
518.1 |  █ █                                           █       ██ █           █        
478.1 |█ █ █                            █              █       ██ █         █ █        
438.1 |█ █ ██                           █             ██ ██    █████   █   ██ ██  ██   
398.1 |████████                         █        █   ███ ███   ██████ ███  █████  ██   
358.1 |████████                   █  ██ █   ████ ███ ███████   ██████████ ██████ ████  
318.1 |████████ █    █       █  ████ ██ █ █ ████████ ███████ ██████████████████████████
278.1 |████████ ███  ███  ██ ██████████████████████████████████████████████████████████
238.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████  296
   1 ms | ████████  115
   2 ms | ████  62
   3 ms | █  17
   4 ms |   7
   5 ms | █  12
   6 ms | ███████  100
   7 ms | █  20
   8 ms | ████████████████████████████████████████  582
   9 ms | ██  31
  10 ms | ██████  90
  11 ms | █  8
  12 ms | ██  29
  13 ms | ████████  114
  14 ms | ████████  115
  15 ms | ███████████  159
  16 ms | ████████  116
  17 ms | ██████  89
  18 ms | ███  37
  19 ms | ██  32
  20 ms | ██  24
  21 ms | █  20
  22 ms | █  14
  23 ms |   3
  26 ms |   1
  29 ms |   1
  31 ms |   1
 124 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `104.76`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `12.86`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `35.29`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `0.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `345.97`, min `35.48`, p50 `117.60`, p95 `1667.80`, p99 `2387.77`, 1%low `43.17`, 0.1%low `36.02`, std `537.81`

**Frame time (ms)**  avg `9.53`, p50 `8.50`, p95 `18.65`, p99 `21.75`, p99.9 `25.76`, max `28.19`

**Client tick (ms)**  avg `1.72`, p95 `2.35`, max `2.81`

**Memory**  start `963 MB`, end `846 MB`, peak `1131 MB`, GC `5 events / 21 ms`

**FPS over sampling window (ASCII):**

```
513.1 |   █                                             █                              
485.8 |   █                                             █    █         ██              
458.4 |  ███                                            ██   ██     █ ███              
431.1 |█ ███                        █           █       ██   ██    ██ ████ █     █    █
403.7 |█ ███                        █   █       █ █     ██   ██   ███ ████ █     ██   █
376.4 |█ ███                        █   █    █  █ █     ██  ███   ███████████   ████  █
349.1 |█████                        █   ██ █ █  ███   ██████████ ████████████ █ ████ ██
321.7 |██████ █                   █ █ ████ █ ██ ████████████████ ██████████████ ████ ██
294.4 |██████ █         █    ██  ██ █ █████████ ███████████████████████████████ ███████
267.0 |██████ █         █  █ ██████ █ █████████████████████████████████████████████████
239.7 |████████ █ ██  █ ███████████ █ █████████████████████████████████████████████████
212.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████  248
   1 ms | ██████████████  182
   2 ms | █████  60
   3 ms | ███  33
   4 ms |   6
   5 ms | █  15
   6 ms | ██████  80
   7 ms | ██  23
   8 ms | ████████████████████████████████████████  527
   9 ms | ██  21
  10 ms | ███████  95
  11 ms | █  10
  12 ms | ███  45
  13 ms | ██████████  128
  14 ms | ███████████  141
  15 ms | ████████████  152
  16 ms | ████████  103
  17 ms | ██████  79
  18 ms | █████  62
  19 ms | ███  34
  20 ms | █  19
  21 ms | █  17
  22 ms | █  15
  23 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `falling_blocks_landed` = `3871.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `104.96`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `36.02`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `43.17`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `49.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `30.87`, min `21.00`, p50 `30.26`, p95 `44.22`, p99 `48.81`, 1%low `21.40`, 0.1%low `21.00`, std `5.75`

**Frame time (ms)**  avg `33.42`, p50 `33.05`, p95 `44.58`, p99 `45.90`, p99.9 `47.40`, max `47.63`

**Client tick (ms)**  avg `0.63`, p95 `0.79`, max `1.01`

**Memory**  start `578 MB`, end `1066 MB`, peak `1066 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                                                                  █             
 33.3 |  █                                                              ██             
 32.9 |  █           █                                                  ██             
 32.5 | ██ █         █           █     █          █                   █ ██             
 32.0 | ██ █         █           █     █   █  █   █      █       █    █ ██  █       █  
 31.6 | ██ █      █  █ █    █    █     █   █  █   █     ██   █   █  █ █ ██  █ █     █  
 31.2 | ██ █   ██ █  █ █   ████  █  ██ █ █ ██ ██  █ █   ███  █ █ █  █ █ ██  █ ██    ██ 
 30.8 | ██ █  ███ █  █ ████████  █  ██ ███ ██ ███ ███   ████████ ██ █ █ ██  █ ██  █ ██ 
 30.3 | ████ ████ █ ███████████  █  ██ ███ ██████ ████  ████████ ████ ████  █ ███ █ ██ 
 29.9 | █████████ █ ███████████████ ██ ███ ██████ ████ █████████ ████ █████████████ ███
 29.5 | ███████████████████████████ ████████████████████████████ ████ █████████████████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | ██  4
  20 ms | ██  4
  21 ms | ████  11
  22 ms | ██████  15
  23 ms | ████  10
  24 ms | ███  7
  25 ms | ████  10
  26 ms | █████  12
  27 ms | ████  11
  28 ms | ██████  15
  29 ms | ███████  17
  30 ms | ███████████████████  47
  31 ms | ████████████████████  49
  32 ms | ████████████████████████████████  80
  33 ms | ████████████████████████████████████████  99
  34 ms | ███████████████  37
  35 ms | █████████  22
  36 ms | ███████  17
  37 ms | █████████  23
  38 ms | ████  11
  39 ms | █████  12
  40 ms | █████  13
  41 ms | █████  13
  42 ms | ███  8
  43 ms | █████  12
  44 ms | ███████  18
  45 ms | ██████  16
  46 ms | ██  4
  47 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `21.40`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.93`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `21.00`
- `seed` = `5099.00`
- `preload_duration_ms` = `45.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `30.89`, min `20.20`, p50 `29.96`, p95 `43.77`, p99 `47.67`, 1%low `21.10`, 0.1%low `20.20`, std `5.78`

**Frame time (ms)**  avg `33.40`, p50 `33.38`, p95 `44.26`, p99 `46.01`, p99.9 `49.34`, max `49.51`

**Client tick (ms)**  avg `0.27`, p95 `0.34`, max `0.64`

**Memory**  start `588 MB`, end `744 MB`, peak `744 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 34.4 |                                           █                                    
 33.9 |                                      █    █                                    
 33.4 |                                      █    █          █                         
 32.9 | █ █                                  █    █          █                         
 32.5 | █ █       █                     █    █    █          █                         
 32.0 | █ █   ██  █               █     █    █    █ █    █   █               █       ██
 31.5 | █ ██  ██  █  █    █ █     █ █  ██  █ █  ███ █    █   █ █          █  █       ██
 31.0 | █ ██  ██  ██ █ █  █ █  ██ ███  ██  █ █ ████ ███  █ █ █ █        █ ██ █   █   ██
 30.6 |██ ██  ██  ██ █ ██ █ ██ ██ ███ ███  █ █ ████ ████ █ █ █ ██  ████ ████████ ███ ██
 30.1 |██ ███████ ████ ██████████ ████████ █ ██████ ██████ █ ██████████ ███████████████
 29.6 |██ ███████ ███████████████ █████████████████████████████████████████████████████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  20 ms | █  6
  21 ms | ████  15
  22 ms | ██  9
  23 ms | ███  11
  24 ms | ███  12
  25 ms | ███  14
  26 ms | ████  16
  27 ms | ███  12
  28 ms | ████  17
  29 ms | ████  16
  30 ms | ███  14
  31 ms | █████████  37
  32 ms | ██████████████  57
  33 ms | ████████████████████████████████████████  166
  34 ms | ████████  32
  35 ms | ██████  23
  36 ms | ███  12
  37 ms | ███  13
  38 ms | ████  17
  39 ms | ████  16
  40 ms | ████  16
  41 ms | ███  14
  42 ms | ██  10
  43 ms | ██  10
  44 ms | ███  13
  45 ms | ███  12
  46 ms | █  5
  49 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9576.00`
- `preload_duration_ms` = `72.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `21.10`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `20.20`
- `preload_chunks` = `81.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `30.97`, min `19.79`, p50 `30.01`, p95 `43.43`, p99 `48.02`, 1%low `21.07`, 0.1%low `19.79`, std `5.96`

**Frame time (ms)**  avg `33.38`, p50 `33.32`, p95 `43.92`, p99 `46.41`, p99.9 `48.76`, max `50.54`

**Client tick (ms)**  avg `0.23`, p95 `0.28`, max `0.36`

**Memory**  start `793 MB`, end `831 MB`, peak `1109 MB`, GC `1 events / 5 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |                                   █                                            
 34.3 |█                                  █                                            
 33.8 |█                                  █     █                            █         
 33.3 |█                                  █     █                            █         
 32.8 |█   █          █   █               █     █          █                 █         
 32.3 |█ █ █  █       █   █ █             █     █          █       █      █  █         
 31.8 |█ ███  █ █  █  █   █ █ █  █        █     █     █    █       █    █ █  █         
 31.3 |█ ███ ██ █  █ ██   █ █ █  █    ██  █   █ █     █ █  █   █   █    █ █  █    ██ █ 
 30.8 |█ ███ ██ █ ██ ██   █ ███ ███ █ ███ █ █ █ █ ██  ███  █ █ ███ ██ █ ███ ████████ █ 
 30.3 |█ ███ ██ █ ███████ █ ███ █████████ █████ █████ ███ ██ █████ ██ █ ██████████████ 
 29.8 |█████ ██ ███████████████████████████████ ████████████ █████ ████ ██████████████ 
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  19 ms | █  2
  20 ms | █  4
  21 ms | ██  9
  22 ms | ████  14
  23 ms | ████  16
  24 ms | █████  20
  25 ms | ███  10
  26 ms | ███  13
  27 ms | ██  6
  28 ms | ███████  26
  29 ms | ███  12
  30 ms | ███████  28
  31 ms | ███████  29
  32 ms | ████████████  48
  33 ms | ████████████████████████████████████████  159
  34 ms | ████████  33
  35 ms | █████  21
  36 ms | ████  15
  37 ms | ███  12
  38 ms | ████  16
  39 ms | ████  14
  40 ms | ████  17
  41 ms | ███  11
  42 ms | █████  18
  43 ms | ████  16
  44 ms | ███  13
  45 ms | ██  7
  46 ms | ██  6
  47 ms | █  2
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `19.79`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `29.96`
- `preload_duration_ms` = `67.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.07`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `31.11`, min `20.93`, p50 `29.94`, p95 `45.26`, p99 `49.21`, 1%low `21.22`, 0.1%low `20.93`, std `6.50`

**Frame time (ms)**  avg `33.42`, p50 `33.40`, p95 `44.94`, p99 `46.49`, p99.9 `47.62`, max `47.77`

**Client tick (ms)**  avg `0.28`, p95 `0.40`, max `0.53`

**Memory**  start `500 MB`, end `1060 MB`, peak `1060 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.8 |               █                                                       █        
 33.4 |               █               █                █     █                █      █ 
 33.0 |       █       █               █                █     █              █ █    █ █ 
 32.5 |   █   █ █     █ █ █           █                █     █       █ █ █  █ █  █ █ █ 
 32.1 |   █   █ █     █ █ █     █     █     █   █ █    █ █ █ █       █ ███  █ █  █ █ █ 
 31.7 |   █   █ █     █ █ █ █   █     █ █   █   █ █    █ █ █ █       █ ███ ██ █  █ █ █ 
 31.3 | █ █ █ ███   █ █ █ █ █   █     █ █ █ █   █ █ █  ███ █ █ █ █   █████ ████  █ █ █ 
 30.8 | █ ███ ████  █ █ █ █ █   █     █ █ ███ █ ███ ██ ███ █ █ █ ███ █████ ████  █ █ ██
 30.4 |██████ ████  █ █ █ █ █████ ███ █ █████ █ ██████████ █ █ █ █████████ ████ ██ ████
 30.0 |██████ ███████ █ █ █ █████████ █ ████████████████████████ █████████ ████████████
 29.6 |██████ █████████ █████████████ ████████████████████████████████████ ████████████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | █  4
  20 ms | ███  11
  21 ms | ████  13
  22 ms | ████  14
  23 ms | ████  15
  24 ms | ███  12
  25 ms | ███  10
  26 ms | ████  15
  27 ms | █████  19
  28 ms | ████  14
  29 ms | ███  12
  30 ms | █████  19
  31 ms | ███████████  38
  32 ms | █████████████  45
  33 ms | ████████████████████████████████████████  140
  34 ms | █████████████  45
  35 ms | ████  14
  36 ms | ████  14
  37 ms | ████  13
  38 ms | ████  15
  39 ms | ████  13
  40 ms | █████  16
  41 ms | ████  13
  42 ms | ████  13
  43 ms | ███  12
  44 ms | █████  18
  45 ms | █████  19
  46 ms | ██  8
  47 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `21.22`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `29.92`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `20.93`
- `seed` = `4027.00`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `30.88`, min `21.03`, p50 `29.94`, p95 `43.70`, p99 `47.40`, 1%low `21.56`, 0.1%low `21.03`, std `5.76`

**Frame time (ms)**  avg `33.42`, p50 `33.40`, p95 `44.22`, p99 `45.75`, p99.9 `47.02`, max `47.56`

**Client tick (ms)**  avg `0.27`, p95 `0.34`, max `0.42`

**Memory**  start `692 MB`, end `876 MB`, peak `876 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                                          █         █                           
 32.8 |               █                          █         █     █                  █  
 32.5 |         █     █ █              █         █         █     █     █            █  
 32.1 |   █     █   █ █ █            █ █     █   █         █     █ █   █  █         █  
 31.7 |   █ █   █  ██ █ █ █          █ █     █ █ █         █     █ █   █  █       █ █  
 31.3 |   █ █ █ █ ███ █ █ █ █        █ █ █ ███ █ █  ███    █   █ █ █   █  █ █ █   █ █  
 31.0 | █ █ █ ███ ███ █ █████   █    █ █ █ ███ █ █  ███ █  █   █ █ █ █ █  █ █ ██  █ █  
 30.6 | ███ █ ███ ███ █ ███████ █ █  █ █ █ ███ █ ██████ █  █   █ █ ███ █ ██ █ ███ █ █ █
 30.2 |████ █ ███████ █ ███████ ████ ███ █ ███ ██████████  █████ █ ███ ████ █ ███ █ ███
 29.8 |████ █████████ █████████ ████████ ███████████████████████ █ ████████ ███████ ███
 29.5 |█████████████████████████████████████████████████████████ █ ████████ ███████████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  3
  21 ms | ███  14
  22 ms | ███  15
  23 ms | ███  14
  24 ms | ████  16
  25 ms | █  6
  26 ms | ███  12
  27 ms | ████  18
  28 ms | ███  13
  29 ms | ██  11
  30 ms | ███████  33
  31 ms | ██████  28
  32 ms | ██████████  45
  33 ms | ████████████████████████████████████████  177
  34 ms | ███████  30
  35 ms | ███  14
  36 ms | ████  16
  37 ms | ████  16
  38 ms | ███  12
  39 ms | ████  19
  40 ms | ████  16
  41 ms | ██  11
  42 ms | ███  13
  43 ms | ██  11
  44 ms | ███  14
  45 ms | ████  17
  46 ms |   2
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `29.92`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `21.56`
- `fps_0p1pct_low` = `21.03`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `67.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `86.24`, min `13.42`, p50 `39.18`, p95 `143.22`, p99 `1014.12`, 1%low `19.27`, 0.1%low `13.42`, std `173.51`

**Frame time (ms)**  avg `24.48`, p50 `25.53`, p95 `44.49`, p99 `46.56`, p99.9 `56.16`, max `74.49`

**Client tick (ms)**  avg `0.40`, p95 `0.61`, max `13.86`

**Memory**  start `1069 MB`, end `1260 MB`, peak `1439 MB`, GC `45 events / 231 ms`

**FPS over sampling window (ASCII):**

```
406.9 |                                                                       █        
372.6 |                                                                       █   █    
338.3 |                                                                    █  █   █    
304.0 |                                                                    ██ █   █    
269.7 |                                                                    ████   █    
235.4 |                                                                    █████  ██  █
201.1 |                                                                    █████  ███ █
166.8 |                                                                   ███████ ███ █
132.5 |                                                             █     █████████████
 98.2 |                                                ████████████████████████████████
 63.9 |    █                                           ████████████████████████████████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████  9
   1 ms | ███████  17
   2 ms | ██  4
   4 ms | █  2
   5 ms | █  3
   6 ms | ███  7
   7 ms | ███████████████  37
   8 ms | ████████████████████████████████████████  99
   9 ms | ████████  21
  10 ms | ████  11
  11 ms | █  2
  12 ms |   1
  13 ms |   1
  14 ms | ████  10
  15 ms | ███████████  28
  16 ms | █████████  23
  17 ms | ████████  21
  18 ms | ████  11
  19 ms | ██████  15
  20 ms | █████████  22
  21 ms | ██████  15
  22 ms | ███████  18
  23 ms | ██████  15
  24 ms | █████  12
  25 ms | ████  11
  26 ms | █████  13
  27 ms | ████  11
  28 ms | ██  5
  29 ms | ███  8
  30 ms | ███████  18
  31 ms | █████████  22
  32 ms | ███████████████████  47
  33 ms | ██████████████████████  55
  34 ms | █████████████████████  53
  35 ms | ███████  17
  36 ms | █████  13
  37 ms | ██████  16
  38 ms | █████  12
  39 ms | ██████  16
  40 ms | ████  11
  41 ms | ████  10
  42 ms | █████  12
  43 ms | █████  13
  44 ms | ██████  16
  45 ms | ██████  15
  46 ms | █████  13
  47 ms | █  2
  48 ms |   1
  51 ms |   1
  52 ms |   1
  74 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `19.27`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `40.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.42`
- `seed` = `7411.00`
- `preload_duration_ms` = `25.00`
- `entity_count_sample_end` = `7.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-6.00`
- `entity_count_sample_start` = `13.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23503 ms  |  Sample ticks: 400

**FPS**  avg `173.29`, min `5.06`, p50 `119.93`, p95 `413.22`, p99 `1558.17`, 1%low `23.31`, 0.1%low `5.07`, std `252.24`

**Frame time (ms)**  avg `8.90`, p50 `8.34`, p95 `16.14`, p99 `20.09`, p99.9 `54.38`, max `197.81`

**Client tick (ms)**  avg `0.42`, p95 `0.52`, max `37.28`

**Memory**  start `827 MB`, end `1748 MB`, peak `1831 MB`, GC `30 events / 193 ms`

**FPS over sampling window (ASCII):**

```
525.1 |       █                                                                      █ 
488.2 |       █                                                                      █ 
451.3 |  █ █  █                                                                      █ 
414.4 | ██ ██ █                                                                      █ 
377.5 |███ ████                                                                      █ 
340.6 |███ ████                                                                      █ 
303.7 |███ ████                                                                     ███
266.8 |████████                                                                     ███
229.8 |████████                                             █                       ███
192.9 |█████████                                            █                     █████
156.0 |██████████       █ █  █  █    █   █    █         █ █ █     ██       ███   ██████
119.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  79
   1 ms | █  32
   2 ms | █  14
   3 ms | █  16
   4 ms | █  24
   5 ms | ██  52
   6 ms | ████████  179
   7 ms | ███████████████  343
   8 ms | ████████████████████████████████████████  932
   9 ms | ███████  174
  10 ms | ███  74
  11 ms | ███  61
  12 ms | ███  79
  13 ms | █  32
  14 ms | █  17
  15 ms | █  20
  16 ms | █  34
  17 ms | █  34
  18 ms | █  13
  19 ms | █  13
  20 ms |   7
  21 ms |   6
  22 ms |   1
  25 ms |   1
  31 ms |   2
  32 ms |   2
  35 ms |   1
  52 ms |   1
  55 ms |   1
 196 ms |   1
 197 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `23.31`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `112.38`
- `part` = `1.00`
- `fps_0p1pct_low` = `5.07`
- `seed` = `7417.00`
- `preload_duration_ms` = `450.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `128.88`, min `24.00`, p50 `119.44`, p95 `169.42`, p99 `389.89`, 1%low `48.34`, 0.1%low `30.11`, std `86.88`

**Frame time (ms)**  avg `8.54`, p50 `8.37`, p95 `12.53`, p99 `16.70`, p99.9 `23.97`, max `41.67`

**Client tick (ms)**  avg `0.33`, p95 `0.53`, max `1.12`

**Memory**  start `967 MB`, end `1341 MB`, peak `2118 MB`, GC `26 events / 195 ms`

**FPS over sampling window (ASCII):**

```
194.9 |                                                                          █     
188.0 |          █                                                               █     
181.0 |          █                                                               █     
174.0 |  █       █       █                                                       █     
167.0 |  █       █       █         █                                             █     
160.0 |  █       █       █         █                                             █     
153.0 |  █       █       █         █                                             █     
146.0 |  █       █       █  █      █                         █                   █     
139.0 |  ██      █       █  █  █  ██            █            █       █         █ █   █ 
132.1 |  ██      █  █    █  █  ██ ██            █            █   █   █  █    ███ ██  █ 
125.1 | ███ █ █ ███ ██ ████ █████████ █  ██ █████ ████ ██ ██ ██ ████ ████ ██████ ███ █ 
118.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms |   12
   2 ms |   10
   3 ms | █  23
   4 ms | █  29
   5 ms | ██  47
   6 ms | █████  152
   7 ms | ██████████████  406
   8 ms | ████████████████████████████████████████  1178
   9 ms | ██████  187
  10 ms | ███  88
  11 ms | ██  52
  12 ms | ███  80
  13 ms | █  34
  14 ms |   11
  15 ms |   3
  16 ms |   2
  17 ms |   2
  18 ms |   8
  19 ms |   6
  20 ms |   2
  21 ms |   1
  23 ms |   1
  24 ms |   2
  41 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `48.34`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `117.10`
- `part` = `1.00`
- `fps_0p1pct_low` = `30.11`
- `seed` = `7433.00`
- `preload_duration_ms` = `50.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `93.66`, min `19.93`, p50 `111.27`, p95 `155.21`, p99 `275.28`, 1%low `22.42`, 0.1%low `19.93`, std `89.84`

**Frame time (ms)**  avg `17.51`, p50 `8.99`, p95 `37.02`, p99 `42.09`, p99.9 `48.22`, max `50.18`

**Client tick (ms)**  avg `0.33`, p95 `0.45`, max `0.80`

**Memory**  start `1994 MB`, end `1354 MB`, peak `2212 MB`, GC `26 events / 202 ms`

**FPS over sampling window (ASCII):**

```
223.7 |  █                                                                             
206.0 |  █          █                                                                  
188.4 |  █          █                       █                                          
170.7 |  █          █                       █                                          
153.1 |  █          █                       ██                                         
135.4 |  █     █    █ ██ █        ██   █    ██   █   █ █ █                             
117.8 |████████████████████████████████████████████████████                            
100.1 |████████████████████████████████████████████████████                            
 82.5 |████████████████████████████████████████████████████                            
 64.8 |████████████████████████████████████████████████████                            
 47.2 |█████████████████████████████████████████████████████                           
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms |   1
   2 ms |   3
   3 ms | █  7
   4 ms | █  8
   5 ms | ██  21
   6 ms | █████  45
   7 ms | █████████████████  144
   8 ms | ████████████████████████████████████████  341
   9 ms | ████████  66
  10 ms | ███  29
  11 ms | ██  18
  12 ms | ███  26
  13 ms | █  8
  14 ms |   3
  15 ms |   2
  16 ms |   3
  17 ms |   1
  18 ms |   1
  20 ms |   3
  23 ms |   3
  24 ms |   3
  25 ms |   4
  26 ms | █  7
  27 ms | █  8
  28 ms | ██  14
  29 ms | ██  18
  30 ms | █  10
  31 ms | ██  13
  32 ms | ██████  54
  33 ms | ██████████████████  150
  34 ms | █████  40
  35 ms | ██  15
  36 ms | █  12
  37 ms | ██  17
  38 ms | █  12
  39 ms | █  10
  40 ms |   3
  41 ms |   4
  42 ms |   4
  43 ms |   4
  44 ms |   1
  45 ms |   1
  48 ms |   1
  50 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `22.42`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `57.12`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.93`
- `seed` = `7451.00`
- `preload_duration_ms` = `54.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-14.00`
- `entity_count_sample_start` = `15.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23205 ms  |  Sample ticks: 400

**FPS**  avg `30.19`, min `20.21`, p50 `29.86`, p95 `36.16`, p99 `42.80`, 1%low `21.56`, 0.1%low `20.21`, std `3.34`

**Frame time (ms)**  avg `33.50`, p50 `33.48`, p95 `39.20`, p99 `44.16`, p99.9 `48.75`, max `49.48`

**Client tick (ms)**  avg `0.34`, p95 `0.57`, max `0.99`

**Memory**  start `1612 MB`, end `2242 MB`, peak `2320 MB`, GC `21 events / 167 ms`

**FPS over sampling window (ASCII):**

```
 32.4 |                                                  █                             
 32.0 |                                     █            █                      █      
 31.7 |                                     █            █           █          █      
 31.3 |                                     █            █           █          █ █    
 31.0 |               █      █        █  █  █          █ █           █      █   █ █    
 30.7 |  █            █  █   █        █  █  █      █ ███ █     ██  █ ██     █   █ ██   
 30.3 |  █ █ █  █   █ █  █   █      █ ██ ██ █   █  █ ███ ██ █ ███  █ ██   █ █ █ █ ██   
 30.0 |██████████ █ ████ ██████ █████ █████ ███ ██ █████ ██ ████████ ██████ █ █ █ ████ 
 29.6 |██████████ █████████████ █████ ████████████ █████ ██ ████████ ██████████ █ ████ 
 29.3 |████████████████████████ ████████████████████████ ███████████ ████████████ █████
 29.0 |█████████████████████████████████████████████████ ██████████████████████████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  20 ms |   1
  22 ms | █  2
  23 ms | █  5
  24 ms | █  3
  25 ms | █  4
  26 ms | ██  7
  27 ms | ███  12
  28 ms | ███  11
  29 ms | ████  15
  30 ms | ███████  23
  31 ms | ██████████████  50
  32 ms | █████████████████████████████  102
  33 ms | ████████████████████████████████████████  141
  34 ms | ███████████████████████████  95
  35 ms | ███████████  39
  36 ms | █████  18
  37 ms | ██████  21
  38 ms | ████  13
  39 ms | ███  10
  40 ms | ██  8
  41 ms | █  4
  42 ms |   1
  43 ms | █  3
  44 ms | █  4
  45 ms | █  2
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `21.56`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.85`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.21`
- `seed` = `7457.00`
- `preload_duration_ms` = `166.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-50.00`
- `entity_count_sample_start` = `51.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24349 ms  |  Sample ticks: 400

**FPS**  avg `30.31`, min `20.33`, p50 `29.81`, p95 `37.80`, p99 `43.58`, 1%low `21.54`, 0.1%low `20.33`, std `3.99`

**Frame time (ms)**  avg `33.50`, p50 `33.55`, p95 `40.79`, p99 `44.81`, p99.9 `48.34`, max `49.20`

**Client tick (ms)**  avg `0.32`, p95 `0.44`, max `1.66`

**Memory**  start `1749 MB`, end `1590 MB`, peak `2349 MB`, GC `22 events / 182 ms`

**FPS over sampling window (ASCII):**

```
 32.6 |                    █                                             █             
 32.3 |                    █                                             █             
 31.9 |                    █                                             █             
 31.6 |                    █ █                            █              █  █          
 31.2 |              █     █ █              █             █        █  █  █  █ █        
 30.9 |              █  ████ █        █     █  █  █       █        █  █  █  █ ██   █   
 30.5 |    █  ██  █  █ █████ █      ███  ██ ██ █ ██  █    █  █   █ █  ██ █  █ ███  █ █ 
 30.2 | █  ██████ ██ █ ████████████ ███  ██ ██ █ ██  █  █ ██ █████ █ ███ ██ █ ████ █ ██
 29.8 |██ ███████ ██ █ ████████████ ████████████ ██████ █ ████████ ████████ █ █████████
 29.5 |█████████████ ██████████████████████████████████ ██████████ ████████ █ █████████
 29.1 |████████████████████████████████████████████████ ██████████ ████████████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  2
  21 ms | █  2
  22 ms | █  3
  23 ms | ██  7
  24 ms | ██  6
  25 ms | ██  5
  26 ms | ███  11
  27 ms | ███  11
  28 ms | ██████  18
  29 ms | ██████  19
  30 ms | ██████  20
  31 ms | ███████████  35
  32 ms | █████████████████████████████████  104
  33 ms | ████████████████████████████████████████  126
  34 ms | ████████████████████████████  87
  35 ms | ███████████  34
  36 ms | ████████  25
  37 ms | █████  17
  38 ms | ██████  19
  39 ms | ███  10
  40 ms | ███  9
  41 ms | ██  5
  42 ms | ██  7
  43 ms | ██  6
  44 ms | █  4
  45 ms | █  3
  47 ms |   1
  49 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `21.54`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.85`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.33`
- `seed` = `7477.00`
- `preload_duration_ms` = `1308.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `1.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `30.13`, min `22.42`, p50 `29.96`, p95 `35.59`, p99 `41.63`, 1%low `23.13`, 0.1%low `22.42`, std `2.96`

**Frame time (ms)**  avg `33.48`, p50 `33.38`, p95 `38.68`, p99 `41.57`, p99.9 `44.44`, max `44.60`

**Client tick (ms)**  avg `0.34`, p95 `0.57`, max `1.95`

**Memory**  start `1129 MB`, end `1912 MB`, peak `2238 MB`, GC `21 events / 155 ms`

**FPS over sampling window (ASCII):**

```
 31.4 |                                                    █                       █   
 31.1 |   █                 █              █               █                █  █   █   
 30.8 |   █        █        █ █        █   █        █      █          █ █   █  █ █ █   
 30.5 | █ █      █ █ █   █  █ █ █      █ █ █      █ █      █   █      █ █ █ █ ██ █ █   
 30.2 | █ █ █ ██ █ █ ██ ███ █ ███    █ ███████  █ █ █    █ █ █ █ █ ██ █ █ █ █ ██ █ ████
 29.9 | █ ███ ████ █ ██████ █ ██████ █ ████████ ██████████ ███ ██████ █ ██████████ ████
 29.6 |██ ████████ █ ██████ ██████████████████████████████ ██████████ ████████████ ████
 29.3 |████████████████████ ██████████████████████████████████████████████████████ ████
 28.9 |████████████████████ ██████████████████████████████████████████████████████ ████
 28.6 |████████████████████ ██████████████████████████████████████████████████████ ████
 28.3 |███████████████████████████████████████████████████████████████████████████ ████
 28.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  22 ms | █  4
  23 ms |   2
  24 ms |   2
  25 ms | █  5
  26 ms | █  3
  27 ms | ███  11
  28 ms | ████  15
  29 ms | █████  23
  30 ms | █████  22
  31 ms | ██████  24
  32 ms | ██████████████████████████  113
  33 ms | ████████████████████████████████████████  171
  34 ms | ██████████████████  76
  35 ms | ███████  31
  36 ms | █████  20
  37 ms | ████████  33
  38 ms | ████  16
  39 ms | ██  10
  40 ms | ██  7
  41 ms | █  5
  43 ms |   2
  44 ms |   2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `23.13`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.87`
- `part` = `1.00`
- `fps_0p1pct_low` = `22.42`
- `seed` = `7481.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `6.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-12.00`
- `entity_count_sample_start` = `18.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24744 ms  |  Sample ticks: 400

**FPS**  avg `119.89`, min `37.52`, p50 `118.70`, p95 `146.90`, p99 `283.29`, 1%low `52.26`, 0.1%low `38.04`, std `43.27`

**Frame time (ms)**  avg `8.89`, p50 `8.42`, p95 `13.13`, p99 `15.95`, p99.9 `22.35`, max `26.65`

**Client tick (ms)**  avg `0.34`, p95 `0.48`, max `3.13`

**Memory**  start `1272 MB`, end `1471 MB`, peak `2239 MB`, GC `26 events / 197 ms`

**FPS over sampling window (ASCII):**

```
155.8 |                               █                                                
151.8 |                               █                                                
147.7 |                               █                                                
143.7 |                               █                                                
139.7 |                               █                                                
135.6 |                               █                                                
131.6 |               █               █                                              █ 
127.6 |            █  █     █         █               █       █                      █ 
123.5 |   █     ██ █  █ ██  █  █     ███   ███    ███ █  █  █ █       █  █        █  █ 
119.5 |█  █   █ ██ ████ █████  █  █ ████ █ ███ █ ████ █ ██ ██ ██   ███████  ███ █ █ ███
115.5 |███████████████████████████████████ █████ ██████ ██ ███████ ██████████████ █████
111.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms |   2
   2 ms |   8
   3 ms | █  26
   4 ms | █  43
   5 ms |   6
   6 ms | █  42
   7 ms | ██████████████  394
   8 ms | ████████████████████████████████████████  1162
   9 ms | ███████  210
  10 ms | ██  57
  11 ms | ██  48
  12 ms | ████  115
  13 ms | ███  82
  14 ms | █  22
  15 ms |   8
  16 ms |   6
  17 ms |   3
  18 ms |   5
  19 ms |   4
  21 ms |   1
  22 ms |   2
  25 ms |   1
  26 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.08`
- `fps_1pct_low` = `52.26`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `112.46`
- `part` = `1.00`
- `fps_0p1pct_low` = `38.04`
- `seed` = `7487.00`
- `preload_duration_ms` = `1699.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-67.00`
- `entity_count_sample_start` = `68.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `119.89`, min `46.31`, p50 `118.54`, p95 `145.21`, p99 `289.26`, 1%low `53.10`, 0.1%low `46.64`, std `50.88`

**Frame time (ms)**  avg `8.92`, p50 `8.44`, p95 `13.08`, p99 `16.98`, p99.9 `20.59`, max `21.59`

**Client tick (ms)**  avg `0.38`, p95 `0.55`, max `1.04`

**Memory**  start `1653 MB`, end `1950 MB`, peak `2373 MB`, GC `25 events / 188 ms`

**FPS over sampling window (ASCII):**

```
156.5 |                           █                                                    
152.5 |                           █                                       █            
148.4 |                           █                                       █            
144.3 |            █              █                                       █            
140.2 |            █              █                                       █            
136.1 |            █              █              █                        █            
132.1 |  █  █      █              █              █                        █         █  
128.0 |  █  █      █              █    █         █                      █ █        ██  
123.9 |  █  █    █ █       ███    ██ █ █  █      █      █  █            █ █ █  █   ██  
119.8 |  █ ████  █ █ ██    ██████ ██ █ █  █  █   █ █    ██ █  ██     █  █ ████ █ ████  
115.7 |███ █████ ███ █████ ████████████████ ████ █ ██ ████████████ ████████████████████
111.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms |   2
   2 ms |   12
   3 ms | █  19
   4 ms | █  29
   5 ms |   8
   6 ms | ██  48
   7 ms | ████████████  354
   8 ms | ████████████████████████████████████████  1207
   9 ms | ███████  206
  10 ms | ██  67
  11 ms | ██  49
  12 ms | ████  117
  13 ms | ██  73
  14 ms | █  17
  15 ms |   6
  16 ms |   4
  17 ms |   9
  18 ms |   6
  19 ms |   4
  20 ms |   2
  21 ms |   2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `53.10`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `112.15`
- `part` = `1.00`
- `fps_0p1pct_low` = `46.64`
- `seed` = `7499.00`
- `preload_duration_ms` = `46.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-20.00`
- `entity_count_sample_start` = `24.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `126.32`, min `43.66`, p50 `119.46`, p95 `163.31`, p99 `243.58`, 1%low `57.15`, 0.1%low `44.08`, std `73.76`

**Frame time (ms)**  avg `8.48`, p50 `8.37`, p95 `12.18`, p99 `14.04`, p99.9 `21.70`, max `22.91`

**Client tick (ms)**  avg `0.30`, p95 `0.39`, max `0.59`

**Memory**  start `1664 MB`, end `1191 MB`, peak `2316 MB`, GC `23 events / 158 ms`

**FPS over sampling window (ASCII):**

```
169.5 |                                   █                                            
164.9 |                                   █               █          █    █        █   
160.2 |                                   █               █          █    █        █   
155.6 |                                   █               █       █  █    █        █   
151.0 |          █                        █               █       █  █    █        █   
146.4 |          █                        █        █      █       █  █    █        █   
141.8 |          █                        █        █      █       █  █    █        █   
137.1 |          █                        █   █    █      █       █  █    █        █   
132.5 |          █                        █   █    █      █       █  █    █        █   
127.9 | █        █                        █   █    █      █ █     █  █    █    █ █ █   
123.3 |███ ███  ███ ██ ██ █████ ████ █  █ █ ███ █  █████ ██ ███████ ███ █ █ █ █████████
118.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   6
   1 ms |   5
   2 ms |   3
   3 ms |   9
   4 ms | █  27
   5 ms | █  47
   6 ms | █████  171
   7 ms | ████████  301
   8 ms | ████████████████████████████████████████  1436
   9 ms | ████  127
  10 ms | █  31
  11 ms | ██  61
  12 ms | ██  84
  13 ms | █  25
  14 ms |   10
  15 ms |   2
  16 ms |   1
  17 ms |   1
  18 ms |   2
  19 ms |   3
  21 ms |   4
  22 ms |   2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `57.15`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `117.90`
- `part` = `1.00`
- `fps_0p1pct_low` = `44.08`
- `seed` = `7507.00`
- `preload_duration_ms` = `50.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `125.09`, min `21.51`, p50 `119.38`, p95 `164.19`, p99 `326.06`, 1%low `26.44`, 0.1%low `22.76`, std `86.47`

**Frame time (ms)**  avg `9.55`, p50 `8.38`, p95 `16.37`, p99 `34.56`, p99.9 `41.05`, max `46.49`

**Client tick (ms)**  avg `0.33`, p95 `0.47`, max `1.01`

**Memory**  start `2211 MB`, end `1450 MB`, peak `2211 MB`, GC `29 events / 214 ms`

**FPS over sampling window (ASCII):**

```
186.7 |       █                                                                        
172.5 |       █                                       █                                
158.3 |       █                           █           ██    █  █     █ █               
144.0 |       █            █     █        █ ██    █   ██    █  █     █ █    █    █     
129.8 |  █ ████ █  █    ██ █████ █ █ ██ █ █████   ███ ███ ███  █   █████  █ █   ████   
115.6 |█████████████████████████████████████████████████████████████████████████████   
101.4 |█████████████████████████████████████████████████████████████████████████████   
 87.1 |█████████████████████████████████████████████████████████████████████████████   
 72.9 |█████████████████████████████████████████████████████████████████████████████   
 58.7 |█████████████████████████████████████████████████████████████████████████████   
 44.4 |██████████████████████████████████████████████████████████████████████████████  
 30.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   7
   1 ms |   9
   2 ms |   5
   3 ms | █  16
   4 ms | █  22
   5 ms | ██  38
   6 ms | ██████  142
   7 ms | ██████████████████  408
   8 ms | ████████████████████████████████████████  925
   9 ms | ████████  195
  10 ms | ███  78
  11 ms | ██  45
  12 ms | ███  61
  13 ms | █  24
  14 ms |   7
  15 ms |   5
  16 ms |   5
  17 ms |   5
  18 ms |   4
  20 ms |   1
  21 ms |   1
  22 ms |   2
  24 ms |   1
  25 ms |   2
  26 ms |   3
  27 ms |   2
  28 ms |   1
  29 ms |   3
  30 ms |   3
  31 ms |   2
  32 ms | █  16
  33 ms | █  30
  34 ms |   9
  35 ms |   2
  36 ms |   3
  37 ms |   4
  38 ms |   2
  39 ms |   2
  40 ms |   1
  41 ms |   2
  46 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `26.44`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `104.69`
- `part` = `1.00`
- `fps_0p1pct_low` = `22.76`
- `seed` = `7517.00`
- `preload_duration_ms` = `50.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-17.00`
- `entity_count_sample_start` = `21.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `30.06`, min `21.63`, p50 `29.86`, p95 `34.78`, p99 `37.90`, 1%low `23.15`, 0.1%low `21.63`, std `2.61`

**Frame time (ms)**  avg `33.51`, p50 `33.49`, p95 `38.21`, p99 `41.54`, p99.9 `44.35`, max `46.24`

**Client tick (ms)**  avg `0.33`, p95 `0.52`, max `0.88`

**Memory**  start `1024 MB`, end `1898 MB`, peak `2456 MB`, GC `20 events / 156 ms`

**FPS over sampling window (ASCII):**

```
 31.3 |     █                                                                          
 31.1 |     █                                                                       █  
 30.9 |     █                                                                       █  
 30.7 |     █                        █                             █       █        █  
 30.4 |     █      █         █       █                █            █   █   █ █  █ █ █ █
 30.2 | █   █      █      █  █ █    ██ █  █         █ █  ███     █ █ █ █   ████ █ █ █ █
 30.0 | █ █████  █ █ ██████  █ ███ ███ █  █████ ███ █ ██████    ██ ███ ████████ █ █ █ █
 29.8 | ████████████ █████████ ████████████████████ █ ████████ ███ ███ ████████ █ █ █ █
 29.6 |█████████████ █████████████████████████████████████████ ██████████████████ ███ █
 29.4 |█████████████ █████████████████████████████████████████ ██████████████████ █████
 29.2 |█████████████ █████████████████████████████████████████ ████████████████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  21 ms |   1
  23 ms |   2
  24 ms | █  3
  26 ms | █  3
  27 ms | █  7
  28 ms | █████  24
  29 ms | ████  18
  30 ms | ████  17
  31 ms | ████████  38
  32 ms | █████████████████████  102
  33 ms | ████████████████████████████████████████  191
  34 ms | ████████████████  76
  35 ms | ██████  29
  36 ms | █████  24
  37 ms | ██████  28
  38 ms | ███  15
  39 ms | ██  8
  40 ms | █  4
  41 ms |   1
  42 ms | █  4
  43 ms |   1
  46 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `23.15`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `75.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.84`
- `part` = `1.00`
- `fps_0p1pct_low` = `21.63`
- `seed` = `7523.00`
- `preload_duration_ms` = `66.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-63.00`
- `entity_count_sample_start` = `64.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `30.04`, min `25.70`, p50 `29.97`, p95 `33.76`, p99 `35.04`, 1%low `25.82`, 0.1%low `25.70`, std `1.69`

**Frame time (ms)**  avg `33.40`, p50 `33.37`, p95 `37.30`, p99 `38.31`, p99.9 `38.89`, max `38.91`

**Client tick (ms)**  avg `0.24`, p95 `0.28`, max `0.35`

**Memory**  start `1787 MB`, end `1923 MB`, peak `1923 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 31.1 |                                             █                                  
 31.0 |                                             █                                  
 30.8 |                                             █                                  
 30.6 |                                             █   █                              
 30.5 |             █       █      █ █              █   █ █              █             
 30.3 |             █       █      █ █     █        █   █ █    █         █          █  
 30.2 |      █ ██ █ █ █     █ █    █ █    ██ ██     █   █████  █ █ █     █ █        █  
 30.0 |████████████ █ █████ ██████ █ ██████████████ ███ ██████ ███ █████ ██████████ ███
 29.8 |████████████ ██████████████ █ ██████████████ ███ ██████ █████████ ██████████ ███
 29.7 |████████████ ██████████████ ████████████████ ███ ████████████████ ██████████████
 29.5 |████████████████████████████████████████████ ███ ███████████████████████████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  27 ms |   1
  28 ms | ██  19
  29 ms | ██  18
  30 ms | ██  23
  31 ms | ██  17
  32 ms | ████  35
  33 ms | ████████████████████████████████████████  384
  34 ms | ███  26
  35 ms | ██  21
  36 ms | ██  21
  37 ms | ███  25
  38 ms | █  9
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `25.70`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `25.82`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `66.00`
- `entity_count_sample_start` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `30.60`, min `20.05`, p50 `29.91`, p95 `39.73`, p99 `46.80`, 1%low `21.19`, 0.1%low `20.05`, std `4.84`

**Frame time (ms)**  avg `33.38`, p50 `33.43`, p95 `41.61`, p99 `45.36`, p99.9 `48.51`, max `49.87`

**Client tick (ms)**  avg `2.78`, p95 `3.33`, max `13.72`

**Memory**  start `2147 MB`, end `2263 MB`, peak `2471 MB`, GC `1 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 34.4 |                 █                                                              
 33.9 |                 █                                                              
 33.4 |                 █                                                █             
 32.9 |                 █                                                █ █        █  
 32.4 |    █            █           █        █                           █ █        █  
 31.9 |    █ █ █        █     █     █        █  █               █        █ █   █    █  
 31.4 |█   █ █ █     █  █     █     █   ██   █  █         █     █        █ █   █    █  
 30.9 |█   █ █ █     █  █ █   ██   ██  ███   █  █         █ █  ██  █ █ █ █ █  ██    ███
 30.4 |██  █ █ ███████  █ █   ███ ███  ████  █ ████ █  █  █ █ ███  █ █ █ █ █ ██████ ███
 29.9 |███ █ ████████████████ █████████████████████████████ ████████ █ █ █ ████████████
 29.4 |███ █████████████████████████████████████████████████████████████ █ ████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms |   1
  19 ms | █  2
  20 ms | █  2
  21 ms | ██  5
  22 ms | ███  8
  23 ms | █  2
  24 ms | ███  8
  25 ms | ███  8
  26 ms | ██████  17
  27 ms | ███  8
  28 ms | ███  9
  29 ms | ███████  18
  30 ms | ██████████████████████████████████  88
  31 ms | ███████████████████  49
  32 ms | █████████  24
  33 ms | ████████████████████████████████████████  105
  34 ms | █████████████  34
  35 ms | ██████████████████████████████  79
  36 ms | ████████████████  43
  37 ms | █████  12
  38 ms | ████████  22
  39 ms | ████  11
  40 ms | ███  8
  41 ms | ███  9
  42 ms | ██  5
  43 ms | ███  9
  44 ms | ██  5
  45 ms | █  3
  46 ms | █  2
  47 ms | █  2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.96`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `32.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `21.19`
- `fps_0p1pct_low` = `20.05`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `30.03`, min `23.95`, p50 `29.94`, p95 `33.57`, p99 `35.08`, 1%low `25.57`, 0.1%low `23.95`, std `1.68`

**Frame time (ms)**  avg `33.40`, p50 `33.40`, p95 `37.07`, p99 `38.20`, p99.9 `40.09`, max `41.75`

**Client tick (ms)**  avg `0.28`, p95 `0.31`, max `8.50`

**Memory**  start `2175 MB`, end `901 MB`, peak `2323 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 31.0 |                                                                  █             
 30.8 |                                                     █            █             
 30.7 |                                                 █   █            █             
 30.6 |           █                               █     █   █            █             
 30.4 |           █                               █     █ █ █            █       █     
 30.3 |         █ █         █            █   █    █     █ █ █            █       █   █ 
 30.1 |    █    █ █    █ █  █ █  █ █     █   ██ █ ██    █ █ ██     █     █     █ ███ █ 
 30.0 |██ ██ ██ █ ████████ ████  █ ███ █ ██  ██ █ █████ █ █ ████████ ██  █ ██  █ █████ 
 29.9 |████████ █ ██████████████████████ ██████████████ █ █ ████████████ ███████ ██████
 29.7 |██████████ ██████████████████████ ██████████████ █ █ ████████████ ██████████████
 29.6 |██████████ █████████████████████████████████████ ███████████████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  24 ms |   1
  28 ms | ██  14
  29 ms | ██  17
  30 ms | ███  23
  31 ms | ██  18
  32 ms | ████████  74
  33 ms | ████████████████████████████████████████  350
  34 ms | ████  31
  35 ms | ███  24
  36 ms | ██  16
  37 ms | ██  19
  38 ms | █  11
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `25.57`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `part` = `1.00`
- `fps_0p1pct_low` = `23.95`
- `seed` = `9043.00`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `30.04`, min `23.11`, p50 `29.95`, p95 `33.38`, p99 `35.31`, 1%low `25.03`, 0.1%low `23.11`, std `1.75`

**Frame time (ms)**  avg `33.40`, p50 `33.39`, p95 `36.70`, p99 `38.55`, p99.9 `42.26`, max `43.27`

**Client tick (ms)**  avg `0.24`, p95 `0.30`, max `0.41`

**Memory**  start `956 MB`, end `1152 MB`, peak `1152 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 30.8 |                          █   █                                                 
 30.7 |       █                  █   █      █                      █              █    
 30.6 |█      █                  █   █      █       █              █              █    
 30.4 |█      █                  █   █      █       █     █ █      █              █    
 30.3 |█    █ █                  █   █      █ █     █     █ █  █   █              █ █  
 30.2 |█    █ █  █ █  █ █        ██  █      █ █ █ █ █ █   █ █  █ █ █    █ █       █ █  
 30.0 |█ ██ █ █  ████ █ █  █ █ █ ███ █ █ ██ █ █ █ █ █ ██  █ █  █ █ █ ████████ ██  █ ██ 
 29.9 |████ █ ████████████████ █ ██████████ █ █████ █ ███ █ ██ █ █ ██████████████ █ ███
 29.8 |██████ ██████████████████ ██████████ █ █████ █████ █ ██████ ██████████████ █ ███
 29.7 |██████ ██████████████████ ██████████ ███████ ███████ ██████ ██████████████ █████
 29.5 |██████ █████████████████████████████ ██████████████████████ ██████████████ █████
 29.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  23 ms |   1
  24 ms |   1
  27 ms |   1
  28 ms | █  12
  29 ms | ██  17
  30 ms | ██  22
  31 ms | ██  22
  32 ms | █████  44
  33 ms | ████████████████████████████████████████  373
  34 ms | ███  32
  35 ms | ███  29
  36 ms | ██  21
  37 ms | █  12
  38 ms | █  9
  39 ms |   1
  41 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `34.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `25.03`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `23.11`
- `preload_chunks` = `81.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `30.00`, min `25.97`, p50 `29.96`, p95 `33.00`, p99 `34.62`, 1%low `26.24`, 0.1%low `25.97`, std `1.39`

**Frame time (ms)**  avg `33.40`, p50 `33.37`, p95 `36.29`, p99 `37.61`, p99.9 `38.48`, max `38.51`

**Client tick (ms)**  avg `0.25`, p95 `0.31`, max `0.35`

**Memory**  start `1333 MB`, end `1553 MB`, peak `1553 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 30.6 |                                                   █                            
 30.5 |                                                   █         █      █           
 30.4 |                █                                  █       █ █      █           
 30.3 |                █              █                   █       █ █      █           
 30.2 |                █              █   █ █        █    █     █ █ █      █ █  █      
 30.1 | █  █    █      █       █  █   ███████    █   ██   ██    █ █ █    █ ███ ██  █   
 30.0 |██████ █ ██████ ███ ██ ██ ██ █ ███████ █ ████ ████ ████  █ █ █ ██ █ ████████████
 29.9 |███████████████ ██████████████ ██████████████ ████ ███████ █ ██████ ████████████
 29.8 |███████████████ ██████████████ ██████████████ ████ ███████ █ ██████ ████████████
 29.7 |███████████████ ██████████████████████████████████ ███████ █ ██████ ████████████
 29.6 |██████████████████████████████████████████████████ ████████████████ ████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  28 ms | █  7
  29 ms | █  14
  30 ms | ██  23
  31 ms | ██  21
  32 ms | █████  49
  33 ms | ████████████████████████████████████████  397
  34 ms | ██  23
  35 ms | ██  24
  36 ms | ██  24
  37 ms | █  13
  38 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `64.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `26.24`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `25.97`
- `preload_chunks` = `81.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `30.01`, min `25.77`, p50 `29.95`, p95 `33.34`, p99 `34.99`, 1%low `26.05`, 0.1%low `25.77`, std `1.45`

**Frame time (ms)**  avg `33.40`, p50 `33.39`, p95 `36.43`, p99 `37.86`, p99.9 `38.64`, max `38.80`

**Client tick (ms)**  avg `0.26`, p95 `0.32`, max `0.42`

**Memory**  start `756 MB`, end `988 MB`, peak `988 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 30.8 |                      █                                                         
 30.7 |                      █                                                      █  
 30.5 |                      █                                                      █  
 30.4 |       █              █                                                      █  
 30.3 |       █              ██                                                     █  
 30.1 |  █  █ █   █  ██      ██ █    █  █               █    █  █  █ █ █    ██ █  █ █  
 30.0 |██████ ██ ██ ████████ █████ ████ █ ██ █████ █ ██████ ██ ██  █ ████████████ █ ███
 29.9 |██████ █████ ████████ ███████████████████████ █████████████ ████████████████ ███
 29.7 |██████ ██████████████ ██████████████████████████████████████████████████████ ███
 29.6 |██████ ██████████████ ██████████████████████████████████████████████████████ ███
 29.5 |█████████████████████ ██████████████████████████████████████████████████████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  27 ms |   1
  28 ms | █  12
  29 ms | ██  18
  30 ms | █  12
  31 ms | ██  18
  32 ms | ████  40
  33 ms | ████████████████████████████████████████  415
  34 ms | ███  26
  35 ms | ██  20
  36 ms | █  14
  37 ms | ██  17
  38 ms | █  6
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `26.05`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `25.77`
- `seed` = `8053.00`
- `preload_duration_ms` = `45.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195066 ms  |  Sample ticks: 3600

**FPS**  avg `30.28`, min `21.08`, p50 `29.94`, p95 `36.89`, p99 `40.18`, 1%low `23.21`, 0.1%low `21.74`, std `3.32`

**Frame time (ms)**  avg `33.40`, p50 `33.40`, p95 `39.72`, p99 `41.98`, p99.9 `44.63`, max `47.43`

**Client tick (ms)**  avg `0.75`, p95 `0.98`, max `1.56`

**Memory**  start `1020 MB`, end `845 MB`, peak `2008 MB`, GC `18 events / 90 ms`

**FPS over sampling window (ASCII):**

```
 30.6 |                                                          █                     
 30.5 |                                                          █                     
 30.5 |                                             █ █          █                     
 30.4 |                    █           █            █ █          █                     
 30.4 |  █   █             ██          █      █     █ ██  ██     █  ██                 
 30.3 |  █   █   █ █  █    ██  █       █      █     █ ██  ██    ██ ███     █   █       
 30.3 |  ██  █   █ █  █    ██████ ██   █     ██ █  █████ ███   ███ ███  █  █   ██    ██
 30.3 |  ██  █ █ ███ ██ █████████ ███  █    ███ ██ █████ ███ █ ██████████  █ █ ██    ██
 30.2 |█ ███████ █████████████████████ ██ ████████████████████ ███████████ ██████ ██ ██
 30.2 |█ ███████ █████████████████████ ███████████████████████ ███████████ ████████████
 30.1 |███████████████████████████████ ███████████████████████ ███████████ ████████████
 30.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   2
  20 ms |   4
  21 ms |   2
  22 ms |   3
  23 ms |   12
  24 ms | █  39
  25 ms | ███  79
  26 ms | ████  113
  27 ms | ██████  156
  28 ms | ███████  187
  29 ms | ████████  222
  30 ms | ███████  197
  31 ms | █████████  260
  32 ms | ███████████████████████████████████  971
  33 ms | ████████████████████████████████████████  1117
  34 ms | ██████████████████████████████  837
  35 ms | ███████  197
  36 ms | ████████  219
  37 ms | ████████  213
  38 ms | ███████  187
  39 ms | █████  144
  40 ms | ████  110
  41 ms | ██  66
  42 ms | █  31
  43 ms |   11
  44 ms |   7
  46 ms |   2
  47 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `67.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `21.74`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `105.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `fps_1pct_low` = `23.21`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `21.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194282 ms  |  Sample ticks: 3600

**FPS**  avg `25.50`, min `8.72`, p50 `29.36`, p95 `35.48`, p99 `39.34`, 1%low `9.15`, 0.1%low `8.80`, std `8.99`

**Frame time (ms)**  avg `49.03`, p50 `34.06`, p95 `100.83`, p99 `106.52`, p99.9 `112.80`, max `114.66`

**Client tick (ms)**  avg `0.67`, p95 `0.92`, max `1.65`

**Memory**  start `1067 MB`, end `1110 MB`, peak `1915 MB`, GC `12 events / 68 ms`

**FPS over sampling window (ASCII):**

```
 30.9 |██████████████████████████████████████████████████████████████                  
 29.0 |██████████████████████████████████████████████████████████████                  
 27.1 |██████████████████████████████████████████████████████████████                  
 25.2 |██████████████████████████████████████████████████████████████                  
 23.3 |██████████████████████████████████████████████████████████████                  
 21.4 |██████████████████████████████████████████████████████████████                  
 19.5 |███████████████████████████████████████████████████████████████                 
 17.6 |███████████████████████████████████████████████████████████████                 
 15.7 |███████████████████████████████████████████████████████████████                 
 13.8 |███████████████████████████████████████████████████████████████                 
 11.9 |███████████████████████████████████████████████████████████████                 
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms |   1
  22 ms |   6
  23 ms |   6
  24 ms | █  16
  25 ms | ██  28
  26 ms | ███  55
  27 ms | ███  57
  28 ms | █████  81
  29 ms | ████████  123
  30 ms | ████████  124
  31 ms | ██████████  163
  32 ms | ██████████████████████████████  486
  33 ms | ████████████████████████████████████████  654
  34 ms | █████████████████████████  402
  35 ms | ████████  132
  36 ms | ███████  122
  37 ms | ████████  123
  38 ms | █████  79
  39 ms | ███  48
  40 ms | ███  54
  41 ms | █  21
  42 ms | █  18
  43 ms | █  10
  44 ms |   2
  88 ms |   2
  89 ms |   1
  90 ms |   2
  91 ms |   5
  92 ms |   5
  93 ms |   8
  94 ms | █  13
  95 ms | █  20
  96 ms | ██  26
  97 ms | ██  38
  98 ms | ████  61
  99 ms | ██████████████  235
 100 ms | ██████████████████  292
 101 ms | ███  49
 102 ms | █  17
 103 ms | █  15
 104 ms | █  17
 105 ms | █  9
 106 ms | █  13
 107 ms | █  9
 108 ms | █  9
 109 ms |   3
 110 ms |   2
 111 ms |   3
 112 ms |   3
 113 ms |   2
 114 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `73.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `8.80`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `105.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `20.40`
- `fps_1pct_low` = `9.15`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `16.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193706 ms  |  Sample ticks: 3600

**FPS**  avg `10.00`, min `8.11`, p50 `10.00`, p95 `10.46`, p99 `10.70`, 1%low `9.05`, 0.1%low `8.42`, std `0.28`

**Frame time (ms)**  avg `100.11`, p50 `100.03`, p95 `105.37`, p99 `108.66`, p99.9 `111.89`, max `123.34`

**Client tick (ms)**  avg `0.64`, p95 `1.09`, max `1.89`

**Memory**  start `1623 MB`, end `1014 MB`, peak `1884 MB`, GC `11 events / 66 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                █                                                               
 10.1 |                █                                                               
 10.0 |                █                                                               
 10.0 |       █    █   █               █              █          █                     
 10.0 |       █    █   █    █          █       █   █  █          █    █                
 10.0 |   █   █    █ █ █    █ █ █   █  █  █  █ █   █  █ ██  █    ██   ███  █     ██    
 10.0 |  ███  ████ ███ ████ ███ █████  █████ █ ███ ██ ██████████ ████ ████ █████ ██████
 10.0 |██████ ████ ███ ████ ██████████ ███████ █████████████████ ██████████████████████
 10.0 |███████████████ █████████████████████████████████████████ ██████████████████████
 10.0 |███████████████ ████████████████████████████████████████████████████████████████
  9.9 |███████████████ ████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms |   1
  87 ms |   1
  88 ms |   1
  89 ms |   1
  92 ms | █  7
  93 ms | ██  22
  94 ms | ██  31
  95 ms | ████  57
  96 ms | ██████  79
  97 ms | ███████  94
  98 ms | ███████████  138
  99 ms | ███████████████████████████████████  445
 100 ms | ████████████████████████████████████████  509
 101 ms | ████████████  147
 102 ms | ████  54
 103 ms | █████  60
 104 ms | ████  53
 105 ms | ██  20
 106 ms | ██  20
 107 ms | ██  26
 108 ms | █  19
 109 ms | █  7
 110 ms |   3
 111 ms |   1
 114 ms |   1
 123 ms |   1
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `8.42`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `105.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `9.05`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `20.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194791 ms  |  Sample ticks: 3600

**FPS**  avg `10.00`, min `8.36`, p50 `10.00`, p95 `10.47`, p99 `10.80`, 1%low `8.95`, 0.1%low `8.46`, std `0.30`

**Frame time (ms)**  avg `100.11`, p50 `100.00`, p95 `105.41`, p99 `109.68`, p99.9 `112.91`, max `119.63`

**Client tick (ms)**  avg `0.64`, p95 `1.09`, max `5.86`

**Memory**  start `815 MB`, end `1814 MB`, peak `1907 MB`, GC `10 events / 41 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                                                               █       █        
 10.0 |                                                           █   █       █        
 10.0 |                        █  █                               █   █       █        
 10.0 |                        █  █    █                 █        █   █       █        
 10.0 |         █      █       █  █    █   █          █  █        █   █       █   █    
 10.0 | █  █ █  █      █   █   █  ██ █ █   █     █ █  ██ ██  █    █   ███     █   ██ █ 
 10.0 | ██ █ █  ████ █ ██ ██ █ ██ ██ █████ █ ██  ████ ██ ███ ████ ██  ██████  ███ █████
 10.0 |█████ ██ ██████ ██████████ ██████████████ ████ ██ ███ ████ ██  ███████ ███ █████
 10.0 |███████████████ ██████████ ██████████████████████ ████████ ███ ███████ ███ █████
 10.0 |██████████████████████████ ██████████████████████ ████████ ███ ███████ █████████
 10.0 |██████████████████████████████████████████████████████████████ ███████ █████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms |   1
  88 ms |   2
  90 ms | █  6
  91 ms |   4
  92 ms | █  11
  93 ms | ██  23
  94 ms | ██  22
  95 ms | █████  48
  96 ms | █████████  95
  97 ms | ███████████  113
  98 ms | █████████████████  179
  99 ms | ██████████████████████████████████████  397
 100 ms | ████████████████████████████████████████  420
 101 ms | ████████████████  164
 102 ms | ████████  84
 103 ms | ██████  65
 104 ms | ██████  64
 105 ms | ██  18
 106 ms | ██  17
 107 ms | ███  28
 108 ms | █  10
 109 ms | █  11
 110 ms |   5
 111 ms | █  9
 116 ms |   1
 119 ms |   1
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `8.46`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `105.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `8.95`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`

