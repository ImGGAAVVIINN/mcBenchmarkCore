# MC Benchmark Core session — 2026-10-01T10:53:28.931528802+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `4096 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 256.3 | 37.8 | 23.3 | 23.40 | 0.75 | 13 | 1805 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 230.6 | 21.6 | 18.9 | 42.84 | 0.73 | 12 | 1042 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 31.6 | 20.5 | 19.5 | 47.48 | 0.72 | 5 | 1704 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 31.5 | 20.2 | 18.1 | 46.83 | 0.72 | 6 | 981 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 31.4 | 20.1 | 17.5 | 47.52 | 0.72 | 5 | 1402 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 31.8 | 19.7 | 16.5 | 47.93 | 0.53 | 5 | 1317 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 32.1 | 19.2 | 16.9 | 49.51 | 0.75 | 5 | 1280 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 32.2 | 18.8 | 17.4 | 48.89 | 1.18 | 6 | 1837 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 37.4 | 15.7 | 15.1 | 60.51 | 3.17 | 6 | 1715 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 38.0 | 14.7 | 14.1 | 64.56 | 4.02 | 8 | 586 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 96.9 | 20.2 | 15.0 | 45.53 | 1.00 | 12 | 1020 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 105.6 | 36.3 | 26.0 | 24.25 | 0.56 | 13 | 1600 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 127.7 | 19.5 | 16.9 | 45.61 | 3.61 | 7 | 1774 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 31.4 | 15.8 | 15.2 | 61.03 | 2.63 | 6 | 812 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 37.3 | 12.7 | 11.7 | 74.94 | 15.75 | 10 | 868 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 35.7 | 12.4 | 11.2 | 73.53 | 16.58 | 10 | 262 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 29.0 | 16.3 | 15.6 | 58.49 | 1.93 | 6 | 1457 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 29.3 | 16.7 | 15.7 | 57.46 | 1.96 | 6 | 1356 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.5 | 20.5 | 20.1 | 47.77 | 0.67 | 5 | 1927 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 28.4 | 19.9 | 19.1 | 49.13 | 0.30 | 5 | 2044 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 28.6 | 19.9 | 19.1 | 48.90 | 0.27 | 5 | 1688 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 28.4 | 19.1 | 17.6 | 48.68 | 0.30 | 5 | 1843 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 28.5 | 18.6 | 13.5 | 49.01 | 0.29 | 5 | 1855 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 28.6 | 15.6 | 12.0 | 55.06 | 0.37 | 16 | 1309 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 28.8 | 14.3 | 13.5 | 63.35 | 0.38 | 22 | 957 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 28.7 | 14.9 | 14.0 | 59.08 | 0.36 | 19 | 1123 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 28.8 | 15.9 | 15.2 | 58.50 | 0.37 | 19 | 414 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 28.4 | 16.5 | 14.0 | 53.31 | 0.37 | 20 | 327 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 30.3 | 11.0 | 7.4 | 61.46 | 0.43 | 26 | 1239 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 16.5 | 7.1 | n/a | 126.34 | 0.37 | 23 | 1413 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 9.8 | 6.4 | n/a | 129.83 | 0.38 | 27 | 284 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 293.0 | 34.8 | 22.4 | 25.10 | 0.48 | 24 | 981 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 299.8 | 33.9 | 21.9 | 25.33 | 0.34 | 29 | 411 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 33.5 | 17.2 | 16.1 | 52.30 | 0.40 | 32 | 850 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 33.6 | 15.6 | 12.6 | 55.87 | 0.40 | 34 | 295 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 31.5 | 20.2 | 19.2 | 47.72 | 0.27 | 10 | 546 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 36.0 | 16.0 | 15.2 | 60.12 | 3.09 | 11 | 528 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 31.6 | 20.1 | 17.1 | 47.60 | 0.27 | 7 | 1056 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 31.2 | 21.0 | 20.9 | 47.04 | 0.29 | 7 | 697 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 31.4 | 21.0 | 20.7 | 47.09 | 0.29 | 10 | 240 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 31.5 | 20.9 | 20.4 | 47.25 | 0.30 | 10 | 331 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 37.1 | 10.4 | 2.4 | 61.76 | 0.85 | 252 | 1276 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 27.5 | 8.2 | 7.9 | 115.78 | 0.75 | 201 | 784 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.1 | 7.8 | 7.6 | 125.68 | 0.70 | 147 | 665 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.1 | 7.8 | 7.5 | 125.67 | 0.70 | 128 | 883 |

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

Category: **Particles**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `256.33`, min `18.45`, p50 `117.09`, p95 `999.87`, p99 `1246.28`, 1%low `37.75`, 0.1%low `23.29`, std `325.37`

**Frame time (ms)**  avg `9.85`, p50 `8.54`, p95 `20.92`, p99 `23.40`, p99.9 `30.89`, max `54.19`

**Client tick (ms)**  avg `0.75`, p95 `1.18`, max `4.35`

**Memory**  start `1943 MB`, end `919 MB`, peak `3749 MB`, GC `13 events / 125 ms`

**FPS over sampling window (ASCII):**

```
376.2 |                                                              █        █        
357.3 |                                                              █      █ █        
338.3 |                                                    █      █  █      █ █  █   █ 
319.4 |                   █                  █           █ █      █ ██   █  ███ ██   █ 
300.4 |                   █                  █          ██ █ █    █ ██   ██ ███ ██ █ █ 
281.5 |                █  █                  █          ██ █ █  █ ████   ██ ███ ██ █ █ 
262.5 |                █  █   █     █    ██ ██    ██ ██ ████ ██ █ ████ ████ ██████████ 
243.6 | █       █     ██ ███  █ █ ███    █████  ████ ██ ██████████████████████████████ 
224.6 | █ █  █  █ ██████ ██████ █ ████   ██████████████ ██████████████████████████████ 
205.7 |██ █  █ ██ ████████████████████ █ ██████████████████████████████████████████████
186.8 |████  █ ████████████████████████████████████████████████████████████████████████
167.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  102
   1 ms | ███████████████████  296
   2 ms | ███  43
   3 ms | █  10
   4 ms |   1
   5 ms |   2
   6 ms | █  17
   7 ms | ██████████  159
   8 ms | ████████████████████████████████████████  612
   9 ms | ███████████  163
  10 ms | █  13
  11 ms |   6
  12 ms |   2
  13 ms | █  9
  14 ms | █  22
  15 ms | █████  75
  16 ms | ████████  120
  17 ms | █████  79
  18 ms | █████  76
  19 ms | █████  70
  20 ms | ████  57
  21 ms | ███  40
  22 ms | ██  31
  23 ms | █  14
  24 ms |   7
  25 ms |   1
  26 ms |   1
  31 ms |   2
  54 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 253 | 205.2 | 23.47 |
| `portal` | 160 | 253 | 235.6 | 20.91 |
| `ALL_TOGETHER` | 1680 | 253 | 239.6 | 22.71 |
| `sculk_charge_pop` | 240 | 253 | 235.9 | 23.24 |
| `smoke` | 160 | 253 | 259.6 | 24.21 |
| `flame` | 160 | 253 | 283.5 | 21.85 |
| `dripping_water` | 240 | 253 | 296.4 | 22.40 |
| `dragon_breath` | 160 | 253 | 293.5 | 24.30 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `56.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `101.53`
- `fps_0p1pct_low` = `23.29`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `37.75`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `230.60`, min `17.10`, p50 `115.89`, p95 `905.04`, p99 `1095.08`, 1%low `21.59`, 0.1%low `18.87`, std `288.49`

**Frame time (ms)**  avg `11.17`, p50 `8.63`, p95 `24.81`, p99 `42.84`, p99.9 `47.42`, max `58.49`

**Client tick (ms)**  avg `0.73`, p95 `1.04`, max `1.64`

**Memory**  start `1897 MB`, end `2765 MB`, peak `2939 MB`, GC `12 events / 115 ms`

**FPS over sampling window (ASCII):**

```
320.4 |                                █    █     █   █           █               █    
294.2 |                                █    █     █   █         █ ██          █  ██    
267.9 |    █        █          █   █   █  █ ███   █ █ ██   █ ██ █ ██  ██   ████ ███    
241.6 |    ██       ██  █    █ ███ █ ███  █ ████████████ ██████ ████  ████ ████████    
215.3 |█   ██ █  █ ███████  ████████████ ███████████████████████████ ██████████████    
189.0 |████████████████████████████████████████████████████████████████████████████    
162.7 |█████████████████████████████████████████████████████████████████████████████   
136.5 |█████████████████████████████████████████████████████████████████████████████   
110.2 |█████████████████████████████████████████████████████████████████████████████   
 83.9 |█████████████████████████████████████████████████████████████████████████████   
 57.6 |█████████████████████████████████████████████████████████████████████████████   
 31.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████  49
   1 ms | ██████████████████████  285
   2 ms | ███  37
   3 ms | █  9
   4 ms |   1
   5 ms |   1
   6 ms | █  18
   7 ms | ██████████  127
   8 ms | ████████████████████████████████████████  511
   9 ms | ██████████  132
  10 ms | █  12
  11 ms |   4
  13 ms |   5
  14 ms | ██  29
  15 ms | ████  51
  16 ms | ███████  88
  17 ms | ██████  83
  18 ms | ███████  87
  19 ms | ████  50
  20 ms | ████  47
  21 ms | ███  33
  22 ms | ██  20
  23 ms | █  10
  24 ms | █  14
  25 ms |   5
  26 ms |   4
  27 ms |   2
  30 ms |   2
  31 ms |   5
  32 ms | █  15
  33 ms | █  12
  34 ms | █  8
  35 ms |   1
  36 ms |   1
  38 ms |   1
  39 ms |   3
  40 ms |   2
  41 ms |   5
  42 ms |   4
  43 ms |   1
  44 ms |   4
  45 ms |   4
  46 ms |   3
  47 ms |   4
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `89.53`
- `preload_duration_ms` = `78.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.59`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `18.87`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `31.58`, min `19.54`, p50 `29.74`, p95 `47.64`, p99 `50.77`, 1%low `20.51`, 0.1%low `19.54`, std `7.78`

**Frame time (ms)**  avg `33.43`, p50 `33.62`, p95 `45.63`, p99 `47.48`, p99.9 `49.95`, max `51.17`

**Client tick (ms)**  avg `0.72`, p95 `1.02`, max `1.41`

**Memory**  start `1235 MB`, end `2018 MB`, peak `2939 MB`, GC `5 events / 36 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |   █             █                                                   █          
 34.2 |   █             █     █                                        █    █          
 33.7 |   █             █     █             █ █   █    █  █        █   █    █          
 33.1 | █ █      █    █ █     █    █ █  █   █ █   █    █  █        █   █  █ █  █       
 32.6 | █ █ ██   █    █ █   █ █    █ █  █   █ █   █    █  █        █ █ █  █ █  █     █ 
 32.0 | █ █ ██ █ █    █ ██  █ █    █ █  █   █ █ █ █ █  █  █ █ █    █ █ █  █ █  █  █  █ 
 31.5 | █ █ ██ █ █ ██ █ ███ █ █  █ █ █  ███ █ █ █ █ █  █  █ █ ███████████ █ █  █  █  █ 
 30.9 | █ █ ████ █ ██ █ ███ █ █  █ █ █ ████ █ ███ ███████ █ █ ███████████ █ ████  █ ██ 
 30.4 | █ █████████████ ██████████ █ ██████ █ ███████████ █ ███████████████████████████
 29.8 |██ █████████████ ██████████ ████████ █ █████████████████████████████████████████
 29.3 |██ █████████████ █████████████████████ █████████████████████████████████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  1
  18 ms | ██  3
  19 ms | ███  6
  20 ms | ████████████  22
  21 ms | ███████████  19
  22 ms | █████████████  24
  23 ms | ██████  10
  24 ms | ████████████  21
  25 ms | ████████  14
  26 ms | █████████  16
  27 ms | ██████  10
  28 ms | ████████  14
  29 ms | ██████  11
  30 ms | ███████  13
  31 ms | ████████  14
  32 ms | ████████████████████████████████████████  72
  33 ms | ██████████████████████████████  54
  34 ms | █████████████████████████████  52
  35 ms | ████████████████  28
  36 ms | █████████████  24
  37 ms | █████████  16
  38 ms | ████████  14
  39 ms | ████████  15
  40 ms | █████████  16
  41 ms | █████████  16
  42 ms | ███████  12
  43 ms | ████████████  21
  44 ms | ██████████  18
  45 ms | █████████████  23
  46 ms | ██████  11
  47 ms | ██  4
  48 ms | █  2
  49 ms | █  1
  51 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.92`
- `preload_duration_ms` = `44.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.51`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.54`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `31.55`, min `18.09`, p50 `29.78`, p95 `47.37`, p99 `50.36`, 1%low `20.23`, 0.1%low `18.09`, std `7.66`

**Frame time (ms)**  avg `33.41`, p50 `33.58`, p95 `45.17`, p99 `46.83`, p99.9 `53.20`, max `55.29`

**Client tick (ms)**  avg `0.72`, p95 `0.91`, max `1.16`

**Memory**  start `1956 MB`, end `695 MB`, peak `2938 MB`, GC `6 events / 55 ms`

**FPS over sampling window (ASCII):**

```
 35.4 |                               █                                                
 34.8 |      █                        █                                                
 34.2 |      █                        █          █        █                            
 33.6 |      █   █                    █ █      █ █        █  █                █ █      
 33.1 |█     █   █                █   █ █      █ █        █  █          ███   █ █ █    
 32.5 |█ █   █   █     █ █        █ █ █ █      █ █        █  ██      █  ███  ██ █ █    
 31.9 |█ █   █ █ █   █ █ ██ █     █ █ █ █     ██ █    ███ █  ███  █  █  ███  ██ █ █    
 31.3 |█ ██  █ █ ██  █ █ ██ █ █   █ █ █ ████  ██ █ █ ████ ██ ███  █  █ ████ ███ █ █ ██ 
 30.7 |█████ █ █ █████ █ ██████████ █ █ ████  ████ ██████ ██ ████ █  █ ████ ███ █ █ ███
 30.1 |█████ █ ████████████████████████ ███████████████████████████████████████ ███████
 29.5 |███████ ████████████████████████████████████████████████████████████████ ███████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | ████  7
  20 ms | ██████████  17
  21 ms | █████████████  23
  22 ms | ████████████  21
  23 ms | █████████████  22
  24 ms | ████████  13
  25 ms | ██████████  18
  26 ms | ████  7
  27 ms | ███████  12
  28 ms | ██████  11
  29 ms | █████████  15
  30 ms | ██████  11
  31 ms | █████████████████  30
  32 ms | ████████████████████████████████  55
  33 ms | ████████████████████████████████████████  69
  34 ms | ███████████████████████████████  54
  35 ms | ██████████  17
  36 ms | ████████████  21
  37 ms | ████████  14
  38 ms | ██████████  17
  39 ms | ██████████  18
  40 ms | ████████████  20
  41 ms | ██████  11
  42 ms | █████████  16
  43 ms | █████████████  23
  44 ms | ███████████  19
  45 ms | ██████████  18
  46 ms | ███████  12
  47 ms | ██  3
  51 ms | █  1
  55 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.93`
- `preload_duration_ms` = `70.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.23`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `18.09`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `31.42`, min `17.55`, p50 `29.78`, p95 `47.31`, p99 `52.21`, 1%low `20.12`, 0.1%low `17.55`, std `7.55`

**Frame time (ms)**  avg `33.43`, p50 `33.58`, p95 `45.27`, p99 `47.52`, p99.9 `52.02`, max `56.98`

**Client tick (ms)**  avg `0.72`, p95 `1.02`, max `1.70`

**Memory**  start `1548 MB`, end `2899 MB`, peak `2950 MB`, GC `5 events / 40 ms`

**FPS over sampling window (ASCII):**

```
 38.9 |                                          █                                     
 37.9 |                                          █                                     
 37.0 |                                          █                                     
 36.1 |                                          █                                     
 35.2 |                                          █                                     
 34.2 |  █                                       █            █ █               █      
 33.3 |  █   █              █              █  █  █ █          █ █               █    █ 
 32.4 |  █   █   █   ██    ██ █   █ █ █    █ ██  █ █ █  █ ██  █ █    █   █ █ █  █    █ 
 31.4 | ███  ███ █   ██ █  ██ █  ██ █ █    █ ██  █ █ █  █ ███ ████ █ █ █ █ █ █  ██ ███ 
 30.5 | ████████ ██ ███████████████ █ █ ████ ███ ███ ████████ ████ ███ ████████ ██ ████
 29.6 |██████████████████████████████ ██████████ ████████████ █████████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  12 ms | █  1
  17 ms | █  2
  18 ms | █  2
  19 ms | ████  7
  20 ms | █████████  17
  21 ms | █████████  18
  22 ms | ██████  11
  23 ms | ██████  11
  24 ms | █████████  17
  25 ms | █████████  18
  26 ms | ██████  11
  27 ms | ███████  14
  28 ms | █████████  18
  29 ms | ███████  13
  30 ms | ██████  11
  31 ms | ████████████  23
  32 ms | ████████████████████████████████████████  76
  33 ms | ████████████████████████████████  60
  34 ms | █████████████████████████████  55
  35 ms | ████████████████████  38
  36 ms | ████████  15
  37 ms | ████████  15
  38 ms | ███████████  21
  39 ms | ███████  14
  40 ms | ████████  16
  41 ms | ██████  12
  42 ms | ████████  16
  43 ms | █████████  18
  44 ms | ██████  12
  45 ms | ████████  16
  46 ms | ████  8
  47 ms | ████  8
  48 ms | ██  3
  56 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `39.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.12`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.55`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `31.82`, min `16.51`, p50 `29.72`, p95 `48.66`, p99 `52.46`, 1%low `19.73`, 0.1%low `16.51`, std `9.77`

**Frame time (ms)**  avg `33.42`, p50 `33.65`, p95 `46.08`, p99 `47.93`, p99.9 `54.03`, max `60.56`

**Client tick (ms)**  avg `0.53`, p95 `0.69`, max `1.09`

**Memory**  start `1660 MB`, end `2699 MB`, peak `2977 MB`, GC `5 events / 36 ms`

**FPS over sampling window (ASCII):**

```
 50.6 |         █                                                                      
 48.7 |         █                                                                      
 46.7 |         █                                                                      
 44.8 |         █                                                                      
 42.8 |         █                                                                      
 40.9 |         █                                                                      
 38.9 |         █                                                                      
 37.0 |         █                                                                      
 35.0 |         █                            █      █                    █           █ 
 33.0 |   █ █ ███ █          █ █ █  ██ █ █   █  █   █  █  █ █     █ █    █ █   █  ██ █ 
 31.1 |██████ █████ ███  ███████████████████████████████ ██ █████ █ ████████████████ ██
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   1
  16 ms |   1
  18 ms | ██  4
  19 ms | ████  9
  20 ms | ██████████  25
  21 ms | █████████  21
  22 ms | ██████  14
  23 ms | ███████  16
  24 ms | ███████  16
  25 ms | ████  9
  26 ms | ████  10
  27 ms | ██████  14
  28 ms | ██████  14
  29 ms | █████  12
  30 ms | ███  8
  31 ms | ██████  15
  32 ms | ███████████████████████  56
  33 ms | ████████████████████████████████████████  96
  34 ms | ████████████████████████  57
  35 ms | ████████  19
  36 ms | ██████  14
  37 ms | ████████  19
  38 ms | ███████  17
  39 ms | ██████  14
  40 ms | ██████  14
  41 ms | ██████  15
  42 ms | █████  11
  43 ms | ████  10
  44 ms | ███████  16
  45 ms | ████████  18
  46 ms | ████████  20
  47 ms | ███  8
  48 ms | ██  4
  49 ms |   1
  60 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.92`
- `preload_duration_ms` = `21.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.73`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.51`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `32.14`, min `16.89`, p50 `29.53`, p95 `47.74`, p99 `55.02`, 1%low `19.18`, 0.1%low `16.89`, std `15.90`

**Frame time (ms)**  avg `33.41`, p50 `33.86`, p95 `45.29`, p99 `49.51`, p99.9 `54.67`, max `59.21`

**Client tick (ms)**  avg `0.75`, p95 `1.06`, max `1.33`

**Memory**  start `1721 MB`, end `2685 MB`, peak `3001 MB`, GC `5 events / 35 ms`

**FPS over sampling window (ASCII):**

```
 78.0 |                                                                 █              
 73.5 |                                                                 █              
 69.0 |                                                                 █              
 64.6 |                                                                 █              
 60.1 |                                                                 █              
 55.6 |                                                                 █              
 51.1 |                                                                 █              
 46.6 |                                                                 █              
 42.2 |                                                                 █              
 37.7 |     █                         █   █                             █              
 33.2 |████ ██ ██ █ █ █  ██ █ █ █     ██████ █   ███ █ ███████ ██ ██ ██ █ ████ █ ██ ███
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
  15 ms | █  1
  17 ms | ███  4
  18 ms | ██  3
  19 ms | █████  8
  20 ms | ██████████  15
  21 ms | ██████████████  22
  22 ms | ████████████  19
  23 ms | ████████████  18
  24 ms | █████████  14
  25 ms | ███████  11
  26 ms | █████████  14
  27 ms | █████████  14
  28 ms | ███  5
  29 ms | ███████████  17
  30 ms | ██████████  16
  31 ms | █████████  14
  32 ms | ████████████████████████████████████████  62
  33 ms | ██████████████████████████████████████  59
  34 ms | ██████████████████████████████████████  59
  35 ms | █████████████████  26
  36 ms | ████████████  18
  37 ms | ██████████████  21
  38 ms | ██████████████  21
  39 ms | ████████████  19
  40 ms | █████████  14
  41 ms | ██████████  15
  42 ms | ███████████  17
  43 ms | █████████████  20
  44 ms | ████████  12
  45 ms | █████████████  20
  46 ms | █████  8
  47 ms | █  2
  48 ms | █  1
  49 ms | ██  3
  50 ms | █  2
  51 ms | █  2
  59 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.93`
- `preload_duration_ms` = `56.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.18`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.89`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `32.18`, min `17.36`, p50 `29.62`, p95 `49.57`, p99 `54.02`, 1%low `18.76`, 0.1%low `17.36`, std `10.35`

**Frame time (ms)**  avg `33.38`, p50 `33.76`, p95 `46.43`, p99 `48.89`, p99.9 `57.50`, max `57.61`

**Client tick (ms)**  avg `1.18`, p95 `1.52`, max `2.31`

**Memory**  start `1182 MB`, end `1337 MB`, peak `3019 MB`, GC `6 events / 52 ms`

**FPS over sampling window (ASCII):**

```
 57.0 |                                                             █                  
 54.4 |                                                             █                  
 51.8 |                                                             █                  
 49.3 |                                                             █                  
 46.7 |                                                             █                  
 44.2 |                                                             █                  
 41.6 |                                                             █                  
 39.0 |                                                             █                  
 36.5 |                     █          █                      █     █               █  
 33.9 |     █       █ █ ██  █    █ █ █ ██ █   █      █        █     █ █  █   █   █  █  
 31.3 |████████████████ ████████████ ████ ███ ████ ██████████ █████ ███ █████████████ █
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | ██  2
  12 ms | █  1
  15 ms | █  1
  17 ms | █  1
  18 ms | █████  7
  19 ms | ███████████  14
  20 ms | ██████████  13
  21 ms | ████████████  15
  22 ms | ████████████████████  25
  23 ms | ████████████████████  25
  24 ms | ███████████████  19
  25 ms | █████████████  16
  26 ms | ██████  8
  27 ms | ███████████  14
  28 ms | █████  7
  29 ms | █████████████  16
  30 ms | █████████  12
  31 ms | ██████████████████  23
  32 ms | ████████████████████████████████████████  51
  33 ms | ██████████████████████████████  38
  34 ms | ████████████████████████████████████████  51
  35 ms | ██████████████████████████  33
  36 ms | █████████████  17
  37 ms | ███████████████████  24
  38 ms | ████████████████  20
  39 ms | █████████  12
  40 ms | █████████████  16
  41 ms | ████████████████  21
  42 ms | █████████  11
  43 ms | ██████████████  18
  44 ms | ██████████████  18
  45 ms | ████████████  15
  46 ms | ████████  10
  47 ms | ███████  9
  48 ms | ███████  9
  49 ms | █  1
  50 ms | █  1
  51 ms | █  1
  52 ms | █  1
  57 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.96`
- `preload_duration_ms` = `43.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `18.76`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.36`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `37.43`, min `15.06`, p50 `29.79`, p95 `65.43`, p99 `168.35`, 1%low `15.68`, 0.1%low `15.06`, std `34.53`

**Frame time (ms)**  avg `33.44`, p50 `33.57`, p95 `53.76`, p99 `60.51`, p99.9 `65.66`, max `66.38`

**Client tick (ms)**  avg `3.17`, p95 `4.14`, max `5.39`

**Memory**  start `1318 MB`, end `1538 MB`, peak `3033 MB`, GC `6 events / 50 ms`

**FPS over sampling window (ASCII):**

```
110.1 |                                                                       █        
102.7 |                                                                       █        
 95.2 |                                                                       █        
 87.8 |                                                                       █        
 80.3 |                                                                       █        
 72.9 |                █                                               █      █        
 65.4 |                █       █                                       █      █        
 58.0 |                █       █         █                             █      █        
 50.5 |                █       █         █       █             █ █     █      █     █  
 43.1 |        ███     █       ██        █    █  █        █    ███     █ █    █     █  
 35.6 |██  ██ ████████████ ██████ ███ █ ████  █ ██ ███ ████    ███ █   ████ █ █ ██ ████
 28.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   3 ms | ██  2
   4 ms | █  1
   5 ms | ███  3
   6 ms | ████  4
   7 ms | █  1
   8 ms | ███  3
   9 ms | ████  4
  10 ms | ██  2
  11 ms | ███  3
  12 ms | █  1
  13 ms | █  1
  14 ms | ███  3
  15 ms | ████  4
  16 ms | ███  3
  17 ms | █████████████  15
  18 ms | ████████████  14
  19 ms | ██████████  11
  20 ms | ███████████████  17
  21 ms | ███████████████  17
  22 ms | ███████████████  17
  23 ms | ██████████  11
  24 ms | ██████████████  16
  25 ms | ████████████  14
  26 ms | ██████████████  16
  27 ms | █████  6
  28 ms | ████████████  13
  29 ms | ████████████  14
  30 ms | ███████████████████████████████  35
  31 ms | ████████████████████  23
  32 ms | ██████████  11
  33 ms | ████████████████████  22
  34 ms | ████████████████  18
  35 ms | ████████████  14
  36 ms | ████████████████████████████████████████  45
  37 ms | █████████████████  19
  38 ms | ███████████████████  21
  39 ms | ██████████  11
  40 ms | ████████████  14
  41 ms | ███████████████  17
  42 ms | ████████  9
  43 ms | ████████  9
  44 ms | ████████████  14
  45 ms | ██████  7
  46 ms | ██████  7
  47 ms | ████████  9
  48 ms | ███████  8
  49 ms | ████████████  14
  50 ms | ████  4
  51 ms | █████  6
  52 ms | ████████  9
  53 ms | █████  6
  54 ms | ███  3
  55 ms | ████  5
  56 ms | ████  4
  57 ms | ██████  7
  59 ms | █  1
  60 ms | ███  3
  61 ms | █  1
  62 ms | ██  2
  64 ms | █  1
  65 ms | █  1
  66 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.91`
- `preload_duration_ms` = `37.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `15.68`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `499.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `15.06`
- `entity_count_sample_end` = `499.00`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `37.95`, min `14.13`, p50 `32.24`, p95 `74.43`, p99 `144.73`, 1%low `14.71`, 0.1%low `14.13`, std `26.84`

**Frame time (ms)**  avg `33.66`, p50 `31.02`, p95 `57.10`, p99 `64.56`, p99.9 `69.98`, max `70.75`

**Client tick (ms)**  avg `4.02`, p95 `5.55`, max `6.90`

**Memory**  start `2457 MB`, end `1754 MB`, peak `3043 MB`, GC `8 events / 59 ms`

**FPS over sampling window (ASCII):**

```
 63.4 |                                                                   █            
 60.4 |                                                               █   █    █       
 57.4 |                                                               █   █    █       
 54.4 |                                                          █    █   █    █       
 51.4 |                                                    █     █    █   █    █       
 48.4 |                  █                █               ██     █    █   █    █       
 45.4 |                  █                █         █    ███     █    █   █    █       
 42.3 |           █     ██   █     █      █         █    ████ █  █ █  █   █    █ █   █ 
 39.3 | █         █   █ ██   █     ██     █    █    █ █  ████ █  █ █ ███  ██   █ █   █ 
 36.3 |██    █ ██ █   █ ██ █ █     ████ █ █  █ █ █  ███  ████ █  █ █ ███  ██ █ █ ██████
 33.3 |██ █████████████████████  ███████████ █ █ ██████ █████ █ ██ ████████████████████
 30.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ███  2
   4 ms | ███  2
   5 ms | █  1
   6 ms | ████  3
   7 ms | ████  3
   8 ms | ███████  5
   9 ms | ████  3
  10 ms | ██████  4
  11 ms | ██████  4
  12 ms | ███  2
  13 ms | ███  2
  14 ms | ███████  5
  15 ms | ██████  4
  16 ms | █████████████  9
  17 ms | ███████████████  10
  18 ms | ████████████████████████████  19
  19 ms | ███████████████████████████████  21
  20 ms | █████████████████████████████████  22
  21 ms | █████████████████████████████████  22
  22 ms | █████████████████████████████████  22
  23 ms | ███████████████████████████  18
  24 ms | ███████████████████████████  18
  25 ms | ████████████████  11
  26 ms | ███████████████  10
  27 ms | ████████████████████████  16
  28 ms | █████████████████████████████████████  25
  29 ms | ██████████  7
  30 ms | ████████████████████████████████████████  27
  31 ms | █████████████████████  14
  32 ms | ███████████████████  13
  33 ms | ███████████████  10
  34 ms | ██████████████████  12
  35 ms | ████████████  8
  36 ms | █████████████  9
  37 ms | ██████████████████████  15
  38 ms | █████████████████████  14
  39 ms | ██████████████████  12
  40 ms | █████████████  9
  41 ms | ██████████████████  12
  42 ms | ████████████  8
  43 ms | █████████  6
  44 ms | ████████████  8
  45 ms | █  1
  46 ms | ██████████  7
  47 ms | ███████████████  10
  48 ms | █████████████████████████  17
  49 ms | ████████████████  11
  50 ms | ████████████  8
  51 ms | ████████████████  11
  52 ms | ██████████████████  12
  53 ms | ██████████  7
  54 ms | ████████████  8
  55 ms | ███████████████  10
  56 ms | █████████████████████  14
  57 ms | ███████  5
  58 ms | ██████████  7
  59 ms | ████  3
  60 ms | ███████  5
  61 ms | ████  3
  62 ms | █  1
  64 ms | █  1
  65 ms | █  1
  66 ms | ███  2
  68 ms | █  1
  69 ms | █  1
  70 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `14.13`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `25.00`
- `fps_harmonic_avg` = `29.71`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `14.71`
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

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `96.87`, min `15.04`, p50 `104.60`, p95 `150.96`, p99 `473.55`, 1%low `20.16`, 0.1%low `15.04`, std `65.58`

**Frame time (ms)**  avg `14.26`, p50 `9.56`, p95 `33.28`, p99 `45.53`, p99.9 `56.24`, max `66.50`

**Client tick (ms)**  avg `1.00`, p95 `1.29`, max `3.63`

**Memory**  start `2081 MB`, end `2936 MB`, peak `3102 MB`, GC `12 events / 111 ms`

**FPS over sampling window (ASCII):**

```
143.7 |                                     █                                          
133.4 |                                     █                                          
123.1 |              ██        █ █          █   █        ██ █                   █      
112.7 |          █  ███     █  █ ██         █  ██ █     ███ █ ██     █      █   █      
102.4 |        █ █  ████ █ ██  ██████  ███ ██ █████ ███ ███ ██████  ███ █   █   █  █  █
 92.1 |        ████████████████████████████████████████████████████████████████████████
 81.8 |        ████████████████████████████████████████████████████████████████████████
 71.5 |       █████████████████████████████████████████████████████████████████████████
 61.2 |       █████████████████████████████████████████████████████████████████████████
 50.8 |       █████████████████████████████████████████████████████████████████████████
 40.5 |       █████████████████████████████████████████████████████████████████████████
 30.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  10
   2 ms | █  14
   3 ms | █  6
   4 ms |   4
   5 ms | █  7
   6 ms | █████████  88
   7 ms | ███████████  104
   8 ms | ████████████████████████████████████████  394
   9 ms | ████████████  119
  10 ms | ████  40
  11 ms | █  6
  12 ms |   3
  15 ms | ███  26
  16 ms | ███████  69
  17 ms | ████████  75
  18 ms | █████████  93
  19 ms | ████████  77
  20 ms | ██████  62
  21 ms | ████  43
  22 ms | ███  27
  23 ms | █  14
  24 ms | █  10
  25 ms | █  8
  26 ms |   1
  27 ms | █  7
  28 ms |   3
  29 ms |   1
  30 ms |   4
  31 ms |   2
  32 ms | █  14
  33 ms | █  6
  34 ms | █  9
  35 ms | █  10
  36 ms | █  8
  37 ms | █  6
  38 ms |   3
  39 ms |   3
  40 ms |   3
  41 ms |   4
  43 ms |   1
  44 ms |   3
  45 ms | █  5
  46 ms |   3
  47 ms | █  5
  48 ms |   1
  50 ms |   1
  60 ms |   1
  66 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `82.00`
- `fps_1pct_low` = `20.16`
- `fps_harmonic_avg` = `70.13`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `15.04`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `105.57`, min `25.64`, p50 `114.57`, p95 `139.77`, p99 `451.00`, 1%low `36.32`, 0.1%low `26.00`, std `70.44`

**Frame time (ms)**  avg `12.16`, p50 `8.73`, p95 `21.77`, p99 `24.25`, p99.9 `36.08`, max `39.00`

**Client tick (ms)**  avg `0.56`, p95 `0.75`, max `1.67`

**Memory**  start `1529 MB`, end `926 MB`, peak `3129 MB`, GC `13 events / 128 ms`

**FPS over sampling window (ASCII):**

```
133.6 |                       █                      █                                 
129.1 |                       █                █  █  █                                 
124.6 |   █                   █                █ ██  █       █                         
120.0 |██ █   █               █    █           █ ██  █  █    █                         
115.5 |██ █   █  █   █        █ █  █    █ █    ████ ███ █    █         ██            █ 
111.0 |██ █   █  █   █  █     █ █  █    ███  █ ████ ███ █ ██ █ █    █  ██  ██        █ 
106.5 |██ █   █  █   █ ██  █  █ █  ██   ███  █ ████ ███ █ ██ █ █    █  ███ ██    █ █ █ 
102.0 |██ ██ ███ █   █ ██  █  █ ██ ██   ██████ ████ ███ ████ █ █  █ █  ███ ██    █ █ ██
 97.4 |█████ ███ ██ ██████ ██ █ ██ ████████████████████ █████████ █ █ ████ ███ █ █ █ ██
 92.9 |█████████ ██████████████ █████████████████████████████████ █ ██████████ ███ ████
 88.4 |████████████████████████████████████████████████████████████ ██████████████ ████
 83.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  9
   2 ms | ██  38
   3 ms |   4
   4 ms |   1
   5 ms |   5
   6 ms | █  20
   7 ms | ███████████████  227
   8 ms | ████████████████████████████████████████  626
   9 ms | ██████  88
  10 ms | █  10
  11 ms |   4
  12 ms |   7
  14 ms |   1
  15 ms | █  20
  16 ms | ████  67
  17 ms | ████████  121
  18 ms | ████████  129
  19 ms | █████  78
  20 ms | ████  65
  21 ms | ████  57
  22 ms | ██  28
  23 ms | █  20
  24 ms | █  12
  25 ms |   3
  31 ms |   1
  35 ms |   1
  37 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `26.00`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `29.00`
- `fps_harmonic_avg` = `82.22`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `36.32`
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

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `127.70`, min `16.89`, p50 `115.15`, p95 `399.31`, p99 `548.45`, 1%low `19.47`, 0.1%low `16.89`, std `110.16`

**Frame time (ms)**  avg `13.46`, p50 `8.68`, p95 `36.07`, p99 `45.61`, p99.9 `56.71`, max `59.21`

**Client tick (ms)**  avg `3.61`, p95 `5.90`, max `9.29`

**Memory**  start `1389 MB`, end `2271 MB`, peak `3163 MB`, GC `7 events / 59 ms`

**FPS over sampling window (ASCII):**

```
164.0 |                 █       █         █                      █    █                
151.9 |           █   █ ██  █ █ █         █     █          █    ██    █  █  █    █     
139.7 |██    █  ███   █████ █ ███   █  █  █ ██  █ █    █████    █████ █  ██ █    █     
127.6 |██ █████ ████ ████████ ████ ████████ ██ ██ █   ██████ ████████ █  ████ █  ██    
115.4 |████████████████████████████████████ █████ █████████████████████ █████ █████ █  
103.2 |████████████████████████████████████████████████████████████████████████████ █  
 91.1 |██████████████████████████████████████████████████████████████████████████████  
 78.9 |██████████████████████████████████████████████████████████████████████████████  
 66.7 |███████████████████████████████████████████████████████████████████████████████ 
 54.6 |███████████████████████████████████████████████████████████████████████████████ 
 42.4 |███████████████████████████████████████████████████████████████████████████████ 
 30.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  25
   2 ms | ██████  77
   3 ms | ████  47
   4 ms | █████  61
   5 ms | ████████  91
   6 ms | █  12
   7 ms | ██  28
   8 ms | ████████████████████████████████████████  478
   9 ms | ███  33
  10 ms | ██  21
  11 ms | █████  63
  12 ms | ██  24
  13 ms | █  10
  14 ms | ██  22
  15 ms | ███  35
  16 ms | ████  44
  17 ms | ████  49
  18 ms | ████  42
  19 ms | ██  26
  20 ms | ███  37
  21 ms | ███  41
  22 ms | █  17
  23 ms | █  10
  24 ms | █  14
  25 ms | █  7
  26 ms |   3
  27 ms |   2
  28 ms |   1
  29 ms |   3
  30 ms | █  12
  31 ms |   5
  32 ms | █  14
  33 ms | ██  22
  34 ms | █  16
  35 ms | ██  19
  36 ms | ██  23
  37 ms | █  6
  38 ms | █  9
  39 ms |   3
  40 ms |   4
  41 ms |   4
  42 ms |   2
  43 ms |   4
  44 ms |   1
  45 ms |   5
  46 ms |   3
  47 ms |   2
  49 ms |   1
  50 ms |   1
  52 ms |   1
  54 ms |   1
  55 ms |   2
  56 ms |   2
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `16.89`
- `preset_long` = `0.00`
- `preload_duration_ms` = `191.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `74.29`
- `fps_1pct_low` = `19.47`
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
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `31.41`, min `15.18`, p50 `28.42`, p95 `53.34`, p99 `70.75`, 1%low `15.81`, 0.1%low `15.18`, std `14.29`

**Frame time (ms)**  avg `36.18`, p50 `35.19`, p95 `56.02`, p99 `61.03`, p99.9 `65.59`, max `65.86`

**Client tick (ms)**  avg `2.63`, p95 `4.20`, max `4.87`

**Memory**  start `2392 MB`, end `1904 MB`, peak `3204 MB`, GC `6 events / 51 ms`

**FPS over sampling window (ASCII):**

```
 52.9 |                █                                                               
 50.5 |                █                                                               
 48.2 |                █                                                               
 45.9 |                █                                                               
 43.6 |                █   █                                                           
 41.2 |            █   █   █                                   █              █        
 38.9 |            █   █   █                                   █              █        
 36.6 |  █      █  █   █   █                                   █          █   █        
 34.2 |  █ ███  █  ██  █ █ ██   █  █          █           █   ████  ██ █  █   █        
 31.9 | ██ ███ ██ ██████ █████  ██ █   █      █ █ ██  █   █ ██████  █████ █ █ █       █
 29.6 |█████████████████ █████████ █  ██   █ ███████ ██ █████████████████ ███ █  █    █
 27.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   7 ms | █  1
   8 ms | ██  2
   9 ms | █  1
  12 ms | █  1
  15 ms | █  1
  16 ms | ██  2
  17 ms | ███  4
  18 ms | █████████████████  20
  19 ms | ███████  8
  20 ms | █████████████████  20
  21 ms | ███████████████████████  28
  22 ms | ██████████  12
  23 ms | ███████  8
  24 ms | ████████  9
  25 ms | ██  2
  26 ms | ██  2
  27 ms | █  1
  28 ms | ████  5
  29 ms | ████████  10
  30 ms | ██████████████  17
  31 ms | █████████████████████████  30
  32 ms | ████████████  14
  33 ms | ████████████████████████████████████████  48
  34 ms | ████████████████████  24
  35 ms | ███████████████████████████████  37
  36 ms | █████████████████████  25
  37 ms | ███████████  13
  38 ms | ███████████████  18
  39 ms | ████████  9
  40 ms | ████████  9
  41 ms | ██████████  12
  42 ms | ██████████  12
  43 ms | █████████  11
  44 ms | ██████████  12
  45 ms | ███████  8
  46 ms | ████████  10
  47 ms | █████  6
  48 ms | ███████  8
  49 ms | ███████  8
  50 ms | ██████  7
  51 ms | ███  4
  52 ms | █████████  11
  53 ms | ████████  10
  54 ms | ███████████  13
  55 ms | ████████  10
  56 ms | █████  6
  57 ms | ████  5
  58 ms | █████  6
  59 ms | ███  4
  60 ms | ██  2
  61 ms | ███  3
  64 ms | █  1
  65 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `15.18`
- `preset_long` = `0.00`
- `preload_duration_ms` = `36.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.64`
- `fps_1pct_low` = `15.81`
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

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `37.30`, min `11.71`, p50 `29.29`, p95 `75.09`, p99 `171.70`, 1%low `12.70`, 0.1%low `11.71`, std `40.44`

**Frame time (ms)**  avg `36.92`, p50 `34.14`, p95 `65.52`, p99 `74.94`, p99.9 `81.30`, max `85.41`

**Client tick (ms)**  avg `15.75`, p95 `21.42`, max `32.31`

**Memory**  start `2318 MB`, end `1673 MB`, peak `3186 MB`, GC `10 events / 72 ms`

**FPS over sampling window (ASCII):**

```
126.5 | █                                                                              
117.4 | █                                                                              
108.3 | █                                                                              
 99.2 | █                                                                              
 90.0 | ██                                                                             
 80.9 | ██       █                                                                     
 71.8 | ██       █                                                                     
 62.7 | ██       █                           █                                         
 53.6 | ██       █                           █         █      █                        
 44.5 | ██  █  █ █    █   █  █      █      █ █         ██     █    █     █ █      █    
 35.3 |███ ██  █ ██ ███ █████████ ████ █ █ █████████  ███  ████ ██████ █ █ ███ ██ ██  █
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   2 ms | ███  2
   4 ms | ███  2
   5 ms | █  1
   7 ms | ███  2
   8 ms | ██████  4
   9 ms | ███  2
  10 ms | █  1
  11 ms | █  1
  12 ms | ████████████  8
  13 ms | ██████████  7
  14 ms | ███  2
  15 ms | ██████████  7
  16 ms | ██████████████████████████████  20
  17 ms | ███████████████████████████████  21
  18 ms | ████████████████████████  16
  19 ms | ████████████  8
  20 ms | ██████████  7
  21 ms | █████████  6
  22 ms | ████████████████  11
  23 ms | ████████████████  11
  24 ms | ██████████████████  12
  25 ms | ███████████████████  13
  26 ms | █████████████████████  14
  27 ms | ████████████  8
  28 ms | ██████████  7
  29 ms | ███████████████  10
  30 ms | ███████  5
  31 ms | █████████████████████████  17
  32 ms | ███████████████████████████  18
  33 ms | ████████████████████████████████████████  27
  34 ms | ████████████  8
  35 ms | █████████████████████  14
  36 ms | ████████████  8
  37 ms | ██████████  7
  38 ms | ██████████  7
  39 ms | ██████████████████  12
  40 ms | █████████████  9
  41 ms | ██████████  7
  42 ms | ████████████████  11
  43 ms | ████████████████  11
  44 ms | ██████  4
  45 ms | █████████  6
  46 ms | ████████████  8
  47 ms | ███  2
  48 ms | ███████████████  10
  49 ms | ██████████████████  12
  50 ms | ████████████  8
  51 ms | █████████████  9
  52 ms | ████████████████  11
  53 ms | ████  3
  54 ms | ████  3
  55 ms | █████████  6
  56 ms | ████████████████████████  16
  57 ms | ██████████████████  12
  58 ms | ████  3
  59 ms | ██████████████████  12
  60 ms | ███████  5
  61 ms | ███████  5
  62 ms | ███  2
  63 ms | ███████  5
  64 ms | ████  3
  65 ms | █████████  6
  66 ms | █████████  6
  67 ms | ███  2
  68 ms | ███████  5
  70 ms | ███  2
  71 ms | ███  2
  73 ms | ███  2
  74 ms | █  1
  75 ms | █  1
  76 ms | ███  2
  77 ms | ███  2
  85 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `preload_duration_ms` = `80.00`
- `falling_blocks_landed` = `23234.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.09`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `11.71`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4811.02`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.70`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `35.70`, min `11.23`, p50 `26.79`, p95 `96.95`, p99 `144.70`, 1%low `12.42`, 0.1%low `11.23`, std `30.95`

**Frame time (ms)**  avg `37.70`, p50 `37.32`, p95 `63.07`, p99 `73.53`, p99.9 `84.94`, max `89.07`

**Client tick (ms)**  avg `16.58`, p95 `23.15`, max `27.73`

**Memory**  start `2927 MB`, end `2114 MB`, peak `3189 MB`, GC `10 events / 75 ms`

**FPS over sampling window (ASCII):**

```
 77.6 |█                                                                               
 72.7 |█                                                                               
 67.7 |█                                                       █           █           
 62.8 |█                                       █    █          █           █           
 57.9 |█                                       █    █          █           █           
 53.0 |██   █        █     █         █         █    █          █           █     █     
 48.0 |██   █        █     █         █         █    █     █    █           █     █     
 43.1 |██   █     █  █ █   █         █         █    █     █    █     █   ███     █     
 38.2 |██   █     █  █ █   ██ █  █   █         ██   ██  █ █   ███    █   ████  █ █   █ 
 33.2 |██ █ █  █████ █ ███ █████ █████ █ █ ███ ██████████ █   ████  ██ █ ████  █ ██  █ 
 28.3 |██ ████ █████ █████ ██████████████████████████████ ████████ ███ ████████████████
 23.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   3 ms | ██  1
   4 ms | ██  1
   6 ms | ████████  4
   7 ms | ███████████████  8
   8 ms | ███████████  6
   9 ms | ████████  4
  10 ms | ██████████  5
  11 ms | ██████  3
  12 ms | ██  1
  13 ms | ████  2
  14 ms | ██  1
  15 ms | ██████████  5
  16 ms | ████████████████████████████████████  19
  17 ms | ███████████████████  10
  18 ms | ██  1
  19 ms | ███████████  6
  20 ms | █████████████  7
  21 ms | ████████  4
  22 ms | ██████████  5
  23 ms | ██████████  5
  24 ms | █████████████  7
  25 ms | ███████████████████  10
  26 ms | ███████████████████████  12
  27 ms | █████████████████████████████  15
  28 ms | █████████████████  9
  29 ms | █████████████████  9
  30 ms | █████████████████████  11
  31 ms | █████████████  7
  32 ms | ████████████████████████████████████████  21
  33 ms | ██████████████████████████████████  18
  34 ms | ██████████████████████████████████████  20
  35 ms | ███████████████████  10
  36 ms | ███████████████████████████  14
  37 ms | █████████████████████  11
  38 ms | ███████████████  8
  39 ms | ███████████████████████████  14
  40 ms | ███████████████████████  12
  41 ms | ██████████████████████████████  16
  42 ms | █████████████████  9
  43 ms | ██████████████████████████████████  18
  44 ms | █████████████████████████████  15
  45 ms | ███████████████████████  12
  46 ms | █████████████████  9
  47 ms | ███████████████  8
  48 ms | █████████████████████████  13
  49 ms | █████████████████████  11
  50 ms | ███████████████████████████  14
  51 ms | ████████  4
  52 ms | ██████  3
  53 ms | ███████████  6
  54 ms | █████████████████████  11
  55 ms | ███████████████  8
  56 ms | █████████████  7
  57 ms | ███████████  6
  58 ms | ██████  3
  59 ms | ███████████  6
  60 ms | █████████████  7
  61 ms | ██████  3
  62 ms | ██████████  5
  63 ms | ███████████  6
  64 ms | ██████  3
  66 ms | ████████  4
  67 ms | ████  2
  68 ms | ██  1
  69 ms | ████  2
  70 ms | ████  2
  71 ms | ████  2
  73 ms | ██████  3
  77 ms | ██  1
  80 ms | ██  1
  81 ms | ██  1
  89 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `preload_duration_ms` = `64.00`
- `falling_blocks_landed` = `26016.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `26.52`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `11.23`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4804.11`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.42`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `28.96`, min `15.64`, p50 `28.34`, p95 `47.33`, p99 `54.38`, 1%low `16.27`, 0.1%low `15.64`, std `7.76`

**Frame time (ms)**  avg `36.62`, p50 `35.28`, p95 `49.62`, p99 `58.49`, p99.9 `63.58`, max `63.92`

**Client tick (ms)**  avg `1.93`, p95 `2.58`, max `3.41`

**Memory**  start `1721 MB`, end `862 MB`, peak `3179 MB`, GC `6 events / 41 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                          █                                                     
 33.9 |            █             █                                                     
 33.0 |            ██        ██  █                       █                             
 32.2 |            ██        ██  █                       █                             
 31.4 |         █  ██  █     ██  █                 █ █   █                █    █       
 30.5 | █       █ ███ ██  █  ██  █ █ █        █    █ █   █         █  █   █    █       
 29.7 | █      ██ ██████ ██  ██ ██ █ █ █  █   █    █ █   █  ██ ██  ██ ██  ██   █       
 28.9 | ██  █  ██ ██████ ██ ███ ██ █ ████ █  ██ █  █ █  ██  █████  ██ ██  ██ █ █ █ █   
 28.0 | ██ █████████████ ██ █████████████ ██ ██ ██ █ █ ███ ██████████ ██ ███ █ █ █ ██  
 27.2 | ██ ████████████████ █████████████ █████ ██ █ █████ █████████████████████ █ ██  
 26.3 |███████████████████████████████████████████ ███████ ████████████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  2
  17 ms | █  2
  18 ms | ███  5
  19 ms | ████  7
  20 ms | █████  10
  21 ms | ██████  12
  22 ms | ████  7
  23 ms | █████  10
  24 ms | ███  6
  25 ms | █  1
  28 ms | █  1
  29 ms | █  1
  30 ms | █████  10
  31 ms | █████████████████████  41
  32 ms | ████████████████  30
  33 ms | ████████████████████████████████████████  77
  34 ms | ██████████████████  35
  35 ms | ██████████████████████████  51
  36 ms | ██████████████  27
  37 ms | ██████████  20
  38 ms | ██████  11
  39 ms | ████  7
  40 ms | ███████  14
  41 ms | ███████  13
  42 ms | ██████  12
  43 ms | █████████  18
  44 ms | ██████████████  26
  45 ms | ██████████  20
  46 ms | ████████  15
  47 ms | ████████  15
  48 ms | █████  9
  49 ms | ███  6
  50 ms | █  1
  51 ms | ███  5
  52 ms | █  1
  54 ms | █  1
  55 ms | ███  5
  56 ms | █  2
  57 ms | ██  4
  58 ms | █  2
  60 ms | █  2
  63 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `preload_duration_ms` = `57.00`
- `falling_blocks_landed` = `3724.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.30`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `15.64`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `620.31`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `16.27`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `29.34`, min `15.73`, p50 `28.35`, p95 `46.77`, p99 `53.96`, 1%low `16.67`, 0.1%low `15.73`, std `9.65`

**Frame time (ms)**  avg `36.20`, p50 `35.27`, p95 `49.06`, p99 `57.46`, p99.9 `61.62`, max `63.59`

**Client tick (ms)**  avg `1.96`, p95 `2.61`, max `13.76`

**Memory**  start `1856 MB`, end `2360 MB`, peak `3212 MB`, GC `6 events / 49 ms`

**FPS over sampling window (ASCII):**

```
 52.4 |                                    █                                           
 49.9 |                                    █                                           
 47.5 |                                    █                                           
 45.0 |                                    █                                           
 42.6 |                                    █                                           
 40.2 |                                    █                                           
 37.7 |                                    █                                           
 35.3 |             █                      █                                           
 32.9 |      █      █        █   █    █    █ █                                         
 30.4 | █    █  ███ ████     ███ ██  ██  █████ █ ███ ███ █   █   █ █ ██ █ ██      █    
 28.0 |███ █ ██████ ████████████ █████████████ █████ ███████████████ ████ ███████ ██ ██
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
  16 ms | █  1
  17 ms | █  2
  18 ms | ██  3
  19 ms | █████  8
  20 ms | ██████  11
  21 ms | █████  9
  22 ms | ██████  11
  23 ms | ███  6
  24 ms | ███  5
  25 ms | ██  3
  26 ms | █  1
  27 ms | █  1
  28 ms | █  1
  29 ms | █  2
  30 ms | ████████  15
  31 ms | ████████████████████████  42
  32 ms | ████████████████  29
  33 ms | ████████████████████████████████████████  71
  34 ms | ██████████████████████  39
  35 ms | ███████████████████████████████  55
  36 ms | ██████████████████  32
  37 ms | █████████  16
  38 ms | ████████  14
  39 ms | ██████████  17
  40 ms | ███████  13
  41 ms | ██████████  17
  42 ms | ██████████  18
  43 ms | █████████  16
  44 ms | █████████  16
  45 ms | ██████████████  24
  46 ms | ████████  15
  47 ms | ███  6
  48 ms | ███  5
  49 ms | ███  5
  50 ms | ███  5
  51 ms | █  1
  52 ms | █  2
  53 ms | ██  3
  54 ms | █  1
  55 ms | █  2
  56 ms | █  2
  57 ms | █  2
  58 ms | █  1
  59 ms | █  2
  60 ms | █  1
  63 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `preload_duration_ms` = `57.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.63`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `15.73`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.36`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `16.67`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `28.52`, min `20.12`, p50 `29.05`, p95 `44.87`, p99 `49.15`, 1%low `20.46`, 0.1%low `20.12`, std `5.88`

**Frame time (ms)**  avg `36.27`, p50 `34.42`, p95 `46.30`, p99 `47.77`, p99.9 `49.65`, max `49.71`

**Client tick (ms)**  avg `0.67`, p95 `0.88`, max `1.15`

**Memory**  start `1281 MB`, end `2659 MB`, peak `3208 MB`, GC `5 events / 34 ms`

**FPS over sampling window (ASCII):**

```
 32.5 |                           █             █                                      
 31.8 |                           █    █        █                                      
 31.1 |    █  █               █   █    █        █            █             █           
 30.4 |  █ █  █ █         █   █   █    █        █      █     █             █         █ 
 29.6 |  █ █  █ █    █   ██   █   █ █  ██      ██  ██ ██     █   ███ █ █   █  ██     █ 
 28.9 |  █ █ ██ █    █   ██  ██ █ █ █ ███    █████ ██ ██     █  ████ █ ██  █  ██     █ 
 28.2 |███ █ ████ █ ██   ██  ████ █ █████ ██████████████  █  █  █████████  █  ███   ██ 
 27.5 |███ █ ██████ ████ ███ ██████ █████ ██████████████  █  █ ███████████ █ ████  ████
 26.8 |████████████ ███████████████ █████ ██████████████  ████ ███████████ ████████████
 26.1 |████████████████████████████ ███████████████████████████████████████████████████
 25.3 |████████████████████████████ ███████████████████████████████████████████████████
 24.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  4
  20 ms | ███  9
  21 ms | ████  12
  22 ms | ██  6
  23 ms | █  3
  25 ms |   1
  26 ms |   1
  28 ms |   1
  29 ms | █  2
  30 ms |   1
  31 ms | █  3
  32 ms | █████████████████████  66
  33 ms | ████████████████████████████████████████  123
  34 ms | ██████████████████████  68
  35 ms | ████████  25
  36 ms | ███████  23
  37 ms | ██████  17
  38 ms | █████  14
  39 ms | █████  15
  40 ms | ███████  21
  41 ms | ██████  18
  42 ms | █████  15
  43 ms | ████████  24
  44 ms | ███  10
  45 ms | █████████  27
  46 ms | █████████  28
  47 ms | ███  8
  48 ms | █  3
  49 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.46`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.57`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `20.12`
- `seed` = `5099.00`
- `preload_duration_ms` = `44.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `28.37`, min `19.14`, p50 `29.32`, p95 `30.69`, p99 `48.62`, 1%low `19.91`, 0.1%low `19.14`, std `5.27`

**Frame time (ms)**  avg `36.24`, p50 `34.10`, p95 `46.11`, p99 `49.13`, p99.9 `51.68`, max `52.25`

**Client tick (ms)**  avg `0.30`, p95 `0.37`, max `0.47`

**Memory**  start `1172 MB`, end `1812 MB`, peak `3216 MB`, GC `5 events / 40 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                             █                     █                            
 32.5 |                             █                     █                            
 31.8 |                             █                     █        █                   
 31.2 |                   █         █                     █        ██        █         
 30.5 |                   █         █    █    █    ██     █        ██   █    █        █
 29.9 |         █        ███  █     █    █    █    ██     ██ █     ██   █    █    █  ██
 29.2 |    █    █        ███  █     █    █    █  █ ██     ██ █     ██   █ █  █    █  ██
 28.5 |    ██ █ █ █  █  █████ █     █   ██    █  ████ █   ██ ██  █ ██ █ █ █  █    █  ██
 27.9 | █ ███ █ █ █  █  ███████████ █ █ ███ ███  ██████ ████████ █ ██ █ ████ ███  █ ███
 27.2 |██████ ███ █ ██ ████████████████████████ ██████████████████ █████████ ██████████
 26.5 |██████ ████████████████████████████████████████████████████ ████████████████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms |   2
  20 ms | █  6
  21 ms | ███  13
  22 ms | █  4
  23 ms |   1
  32 ms | ████████  40
  33 ms | ████████████████████████████████████████  201
  34 ms | ███████  33
  35 ms | ██████  31
  36 ms | █████  25
  37 ms | ███  17
  38 ms | ████  22
  39 ms | ████  21
  40 ms | ████  20
  41 ms | ████  18
  42 ms | ███  14
  43 ms | ████  20
  44 ms | ███  17
  45 ms | ███  16
  46 ms | ███  13
  47 ms | █  6
  48 ms | █  4
  49 ms | █  4
  50 ms |   1
  51 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9576.00`
- `preload_duration_ms` = `67.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `19.91`
- `fps_harmonic_avg` = `27.59`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `19.14`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `28.59`, min `19.08`, p50 `28.98`, p95 `45.89`, p99 `49.38`, 1%low `19.93`, 0.1%low `19.08`, std `5.94`

**Frame time (ms)**  avg `36.21`, p50 `34.50`, p95 `46.56`, p99 `48.90`, p99.9 `51.34`, max `52.42`

**Client tick (ms)**  avg `0.27`, p95 `0.34`, max `0.54`

**Memory**  start `1566 MB`, end `2601 MB`, peak `3254 MB`, GC `5 events / 32 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |           █                            █                        █              
 32.6 |           █                            █                        █              
 31.9 |           █               █            █          █             █       █      
 31.2 |           █               █            █      █   █    █        █       █     █
 30.5 |█    █     █          █    █      █  █  █     ██   █    █      █ █   █   █     █
 29.8 |█    █ █   █          █    █     ██  █  █  █  ██   █    █ █    █ █   █ █ █     █
 29.0 |█    █ █   █          █    ██    ██  ██ █  █  ██   █  █ █ ██   █ █   █ █ █  █  █
 28.3 |█  █ ███   █      ██ ██ █  ██  █ ██  ██ █  █ ████ ██  █ █ ███  ███   ███ █  ████
 27.6 |████████ █ █  ██ ███ ██ ██ ██ █████████ ██ █ ██████████ ██████ ████ ████ █  ████
 26.9 |██████████ █ ██████████ █████ █████████ ███████████████ ███████████ ████████████
 26.2 |███████████████████████ ████████████████████████████████████████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  4
  20 ms | ███  13
  21 ms | ███  13
  22 ms | █  4
  23 ms | █  3
  31 ms | █  4
  32 ms | █████████  39
  33 ms | ████████████████████████████████████████  178
  34 ms | ██████████  44
  35 ms | ███████  31
  36 ms | █████  24
  37 ms | ███  15
  38 ms | ████  16
  39 ms | ████  18
  40 ms | ████  20
  41 ms | ████  16
  42 ms | ████  16
  43 ms | ████  18
  44 ms | ████  20
  45 ms | ███  13
  46 ms | █████  24
  47 ms | ██  7
  48 ms | ██  8
  49 ms | █  3
  50 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `19.08`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `27.62`
- `preload_duration_ms` = `72.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.93`
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

Category: **Redstone**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `28.43`, min `17.56`, p50 `28.97`, p95 `44.23`, p99 `50.04`, 1%low `19.13`, 0.1%low `17.56`, std `6.00`

**Frame time (ms)**  avg `36.46`, p50 `34.52`, p95 `46.60`, p99 `48.68`, p99.9 `56.14`, max `56.94`

**Client tick (ms)**  avg `0.30`, p95 `0.41`, max `0.63`

**Memory**  start `1429 MB`, end `2206 MB`, peak `3272 MB`, GC `5 events / 39 ms`

**FPS over sampling window (ASCII):**

```
 34.9 |  █                                                                             
 34.1 |  █                                                                             
 33.2 |  █  █                                                                          
 32.4 |  █  █                                                          █ █             
 31.5 |  █  █ █        █          █       █                    █ █     █ █        █    
 30.7 |  █  █ █   ██   ██         █   █   █                    █ ██    █ █  █    ██    
 29.8 |  █  █ █   ██  ███    █ █  █  ███  █           █    █   █ ██    █ █  █    ██    
 29.0 |  ██ █ █   ██  ███    █ █  █  ███  █  █  █     █    █  ██ ███   █ ██ █    ██ █  
 28.2 |█ ██ █ █   ██ ████ █  ██████  ███  ██ ████ ██  █   ██  ██ ███   █ ████  ████ ██ 
 27.3 |█ ██████ ███████████  ██████  ████ ██ ████ ██ ████ ██  ██ ███████ ████  ███████ 
 26.5 |█ ██████ ████████████ ███████████████ ███████████████████ ██████████████████████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms | █  3
  19 ms | █  2
  20 ms | █  5
  21 ms | ███  11
  22 ms | ███  9
  23 ms | █  3
  24 ms | █  2
  27 ms |   1
  29 ms |   1
  30 ms | ███  10
  31 ms | ████  14
  32 ms | ██████████  35
  33 ms | ████████████████████████████████████████  140
  34 ms | █████████████████  58
  35 ms | ███████  26
  36 ms | █████  16
  37 ms | ██████  21
  38 ms | ███  10
  39 ms | █████  18
  40 ms | █████  18
  41 ms | ██████  20
  42 ms | ███  12
  43 ms | ███████  25
  44 ms | █████  17
  45 ms | ████████  28
  46 ms | ███████  25
  47 ms | ███  9
  48 ms | █  4
  49 ms | █  2
  50 ms |   1
  55 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `19.13`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `27.43`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `17.56`
- `seed` = `4027.00`
- `preload_duration_ms` = `48.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `28.55`, min `13.53`, p50 `29.31`, p95 `46.56`, p99 `49.24`, 1%low `18.64`, 0.1%low `13.53`, std `6.26`

**Frame time (ms)**  avg `36.39`, p50 `34.11`, p95 `46.86`, p99 `49.01`, p99.9 `60.75`, max `73.92`

**Client tick (ms)**  avg `0.29`, p95 `0.36`, max `0.77`

**Memory**  start `1426 MB`, end `1604 MB`, peak `3281 MB`, GC `5 events / 39 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |        █                                                                    █  
 32.5 |        █            █          █  █                                         █  
 31.7 |    █   █  █         █          █  █                                       █ █  
 30.9 |█   █   █  █     ██  ██         █  █  █  █  █                █             █ █  
 30.1 |█  ███  ██ █     ██  ██     █   █  █  █  █  █       █        █             █ █  
 29.3 |█  ███  ██ █ █   ███ ██     ██ ██  █  ██ ██ █       █  ██    █        ██ █ █ █  
 28.5 |█  ████ ██ █ █ █ ███ ██  █  ██ ██  █  ██ ██ █ █     ██ ██ █ ██    ██  ████ ███  
 27.7 |█ █████ ██ █ █ █ ███████ █ ███ ███ █  ███████ █ █   ███████ ██  █ ██  ████████  
 26.9 |███████ ██ █ █ █████████ █████████ ██████████████ █████████ ███ ██████████████  
 26.0 |█████████████████████████████████████████████████ █████████ ██████████████████ █
 25.2 |█████████████████████████████████████████████████ ██████████████████████████████
 24.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  19 ms | █  4
  20 ms | ██  10
  21 ms | ████  20
  22 ms | █  3
  26 ms |   1
  31 ms | █  3
  32 ms | ███████  32
  33 ms | ████████████████████████████████████████  194
  34 ms | ███████  35
  35 ms | ████  21
  36 ms | ███  16
  37 ms | █████  22
  38 ms | ███  15
  39 ms | ████  20
  40 ms | ███  16
  41 ms | ████  17
  42 ms | ████  17
  43 ms | ████  17
  44 ms | ████  18
  45 ms | ██████  27
  46 ms | ███  14
  47 ms | ███  13
  48 ms | ██  8
  49 ms | █  5
  73 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `27.48`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `18.64`
- `fps_0p1pct_low` = `13.53`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `34.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `28.55`, min `11.98`, p50 `28.83`, p95 `43.46`, p99 `51.86`, 1%low `15.64`, 0.1%low `11.98`, std `6.46`

**Frame time (ms)**  avg `36.48`, p50 `34.68`, p95 `48.34`, p99 `55.06`, p99.9 `72.84`, max `83.46`

**Client tick (ms)**  avg `0.37`, p95 `0.59`, max `1.84`

**Memory**  start `2417 MB`, end `2560 MB`, peak `3727 MB`, GC `16 events / 180 ms`

**FPS over sampling window (ASCII):**

```
 39.0 |                                                                      █         
 37.7 |                                                                      █         
 36.4 |                                                                      █         
 35.1 |                                                                      █         
 33.8 |                  █   █                                               █         
 32.5 |                  █   █                                               █         
 31.2 |█  █   █     █    █   █                        █ █          █         █   █    █
 29.9 |█ ██   █ █   █ ██ █   █  █       █             █ █     █    █ ██      █  ██    █
 28.6 |█ ███  █ █ ██████ █   █  ███ ██  ██ ███   █ █  █ █   █ █ ██ ████   ██ ██ ███   █
 27.3 |██████ █████████████████████████ ██ ███ ██████████ █ ███ ██ █████████ ██████ █ █
 26.0 |███████████████████████████████████████ ███████████████████ ████████████████████
 24.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  12 ms |   1
  16 ms |   1
  18 ms |   1
  19 ms | ██  5
  20 ms | ██  4
  21 ms | ████  9
  22 ms | ███  7
  23 ms | █  2
  24 ms | █  3
  25 ms | ██  4
  27 ms | █  3
  28 ms |   1
  29 ms | █  3
  30 ms | ██  5
  31 ms | █████████  22
  32 ms | ██████████████████████████  64
  33 ms | ████████████████████████████████████████  98
  34 ms | ████████████████████████  58
  35 ms | ██████████  25
  36 ms | ██████████  25
  37 ms | ███████████  27
  38 ms | ███████  16
  39 ms | ██████████  25
  40 ms | ████  9
  41 ms | ███████  16
  42 ms | ██████  15
  43 ms | ███████  16
  44 ms | ███████  17
  45 ms | █████  12
  46 ms | ██████  15
  47 ms | ███  8
  48 ms | ████  9
  49 ms | ██  4
  50 ms | ███  7
  51 ms | █  2
  52 ms |   1
  53 ms |   1
  54 ms |   1
  55 ms |   1
  56 ms |   1
  57 ms |   1
  58 ms |   1
  64 ms |   1
  83 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `15.64`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.41`
- `part` = `1.00`
- `fps_0p1pct_low` = `11.98`
- `seed` = `7411.00`
- `preload_duration_ms` = `71.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-14.00`
- `entity_count_sample_start` = `15.00`
- `x_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23297 ms  |  Sample ticks: 400

**FPS**  avg `28.77`, min `13.51`, p50 `28.18`, p95 `46.15`, p99 `58.58`, 1%low `14.30`, 0.1%low `13.51`, std `8.82`

**Frame time (ms)**  avg `36.94`, p50 `35.49`, p95 `50.13`, p99 `63.35`, p99.9 `72.15`, max `74.01`

**Client tick (ms)**  avg `0.38`, p95 `0.63`, max `1.70`

**Memory**  start `2906 MB`, end `2257 MB`, peak `3864 MB`, GC `22 events / 230 ms`

**FPS over sampling window (ASCII):**

```
 44.7 |                █                                                               
 42.9 |                █                                                               
 41.1 |                █                                                               
 39.3 |                █                                                               
 37.5 |                █                                                               
 35.7 |                █                                                    █          
 33.9 |          █     █    █                               █               █     █    
 32.1 |          █     █    █                               █              ███    █    
 30.3 |█ ██ █    █     ██   █       █     █  █           █  █ ██ █   █ ██  ███   ██    
 28.5 |████ █ █  ████████ █ █ ██    ████ ██████   █ █ ████  █ ████   █ ███ ███ █ ██████
 26.8 |████ ███ ███████████ ████ ███████████████████████████████████ █ ███████ ████████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | █  1
  11 ms | █  1
  13 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | ███  5
  18 ms | ██  4
  19 ms | ████  6
  20 ms | ███  5
  21 ms | ████  7
  22 ms | ███  5
  23 ms | █  2
  24 ms | █  1
  25 ms | █  2
  27 ms | ██  4
  28 ms | ██  4
  29 ms | █  2
  30 ms | ████  7
  31 ms | ███████████████  25
  32 ms | ███████████████████████████████  52
  33 ms | ████████████████████████████████████████  67
  34 ms | ██████████████████████████████  50
  35 ms | █████████████████████  36
  36 ms | ███████████████  25
  37 ms | ███████████████  25
  38 ms | █████████████  21
  39 ms | ██████████████  23
  40 ms | ███████████  19
  41 ms | ████████  14
  42 ms | ██████████  16
  43 ms | ████████  14
  44 ms | ██████████  16
  45 ms | ██████████  16
  46 ms | ████████████  20
  47 ms | █████  9
  48 ms | █  2
  49 ms | ██  4
  50 ms | ████  6
  51 ms | ██  3
  52 ms | █  1
  53 ms | █  1
  54 ms | ████  7
  57 ms | █  1
  58 ms | █  1
  61 ms | █  2
  62 ms | █  1
  63 ms | █  1
  66 ms | █  1
  69 ms | █  2
  70 ms | █  1
  74 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `14.30`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.07`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.51`
- `seed` = `7417.00`
- `preload_duration_ms` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `28.71`, min `14.03`, p50 `28.46`, p95 `46.32`, p99 `55.00`, 1%low `14.86`, 0.1%low `14.03`, std `7.64`

**Frame time (ms)**  avg `36.67`, p50 `35.13`, p95 `48.45`, p99 `59.08`, p99.9 `70.23`, max `71.26`

**Client tick (ms)**  avg `0.36`, p95 `0.59`, max `3.98`

**Memory**  start `2723 MB`, end `2367 MB`, peak `3846 MB`, GC `19 events / 191 ms`

**FPS over sampling window (ASCII):**

```
 41.0 |                                                  █                             
 39.4 |                                                  █                             
 37.8 |                                                  █                             
 36.3 |                                                  █                             
 34.7 |                      █                           █                             
 33.1 |                      █                         █ █    █                        
 31.5 |  █     █             █     █             █   █ █ █    █     █     █     █  █ █ 
 29.9 |  █     █ █     █    ██    ██        █ ██ ██  █ █ █ █  █   █ █ █ ███  █  █  █ █ 
 28.3 | ████   █ ███ ███ █  ███ █ ███ ███ █ █ ██ ██ ██ █████ ██ █ █ █ █████ ██  ██ █ █ 
 26.8 |███████ ███████████ ██████████████ █████████ ███████████████████████████ ██ ████
 25.2 |████████████████████████████████████████████████████████████████████████ ███████
 23.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms |   1
  17 ms | ██  4
  18 ms | █  3
  19 ms | ██  4
  20 ms | █████  11
  21 ms | ███  8
  22 ms | ████  10
  23 ms | █  3
  25 ms | █  2
  27 ms |   1
  29 ms | █  3
  30 ms | ██  4
  31 ms | ██████  13
  32 ms | ████████████████████████  56
  33 ms | ████████████████████████████████████████  92
  34 ms | ██████████████████████  51
  35 ms | ████████████████  37
  36 ms | ███████████  25
  37 ms | ███████████  25
  38 ms | █████  12
  39 ms | ███████  17
  40 ms | █████████  20
  41 ms | █████████  21
  42 ms | ███████  16
  43 ms | ███████  17
  44 ms | █████████  20
  45 ms | ███████  15
  46 ms | ████  9
  47 ms | █████  11
  48 ms | █████  11
  49 ms | ██  4
  50 ms | █  2
  51 ms | █  3
  52 ms | █  3
  53 ms | █  3
  55 ms |   1
  58 ms |   1
  59 ms |   1
  60 ms |   1
  66 ms |   1
  68 ms |   1
  69 ms |   1
  71 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `14.86`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.27`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.03`
- `seed` = `7433.00`
- `preload_duration_ms` = `34.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `28.82`, min `15.25`, p50 `28.64`, p95 `46.88`, p99 `55.75`, 1%low `15.89`, 0.1%low `15.25`, std `7.80`

**Frame time (ms)**  avg `36.66`, p50 `34.92`, p95 `49.39`, p99 `58.50`, p99.9 `64.84`, max `65.57`

**Client tick (ms)**  avg `0.37`, p95 `0.50`, max `3.33`

**Memory**  start `3433 MB`, end `3167 MB`, peak `3848 MB`, GC `19 events / 194 ms`

**FPS over sampling window (ASCII):**

```
 36.0 |                                 █                                              
 35.0 |                                 █                                              
 34.1 |                                 █                                              
 33.1 |                                 █                            █                 
 32.2 | ██                              █   █ █                     ██    █            
 31.2 | ██               █         █ █  █ █ █ █             █       ██  █ █            
 30.2 | ███  ██          █         █ █  ███ █ █ █ █        ██   █   ██  ████      █  █ 
 29.3 | ███  ██ █   █    █         █ █  ███ █ █ █ █     █  ██   █   ███ ████   █ ██  ██
 28.3 | ███ ███ █   █  ███ █  █    █ █  ███ ███ ██████ ██  ██  ███  ███ ████   ████ ███
 27.4 | ███ ███ █ ███  ███ █  ██ █ ████████ █████████████  ████████ ███ ████  █████ ███
 26.4 | ██████████████████ █ ██████████████████████████████████████████ ███████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  11 ms |   1
  13 ms |   1
  16 ms |   1
  17 ms | ██  4
  18 ms |   1
  19 ms | ███  7
  20 ms | ████  9
  21 ms | █████  10
  22 ms | ███  6
  23 ms | ██  4
  24 ms | ██  4
  25 ms | █  2
  26 ms | █  2
  27 ms |   1
  28 ms |   1
  29 ms | █  2
  30 ms | ███  6
  31 ms | ████████████  25
  32 ms | ██████████████████████  46
  33 ms | ████████████████████████████████████████  83
  34 ms | █████████████████████████████  60
  35 ms | ████████████  25
  36 ms | ██████████  20
  37 ms | ████████████  24
  38 ms | ███████████  23
  39 ms | ████████████  24
  40 ms | ███████  14
  41 ms | ███████  14
  42 ms | ████████  17
  43 ms | ████  9
  44 ms | █████  11
  45 ms | ███████  15
  46 ms | █████████  18
  47 ms | ███████  14
  48 ms | █████  11
  49 ms | ████  9
  50 ms | ███  6
  51 ms |   1
  52 ms |   1
  53 ms | █  2
  54 ms | █  3
  56 ms | █  2
  57 ms |   1
  59 ms |   1
  61 ms | █  2
  62 ms |   1
  64 ms |   1
  65 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `15.89`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.28`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.25`
- `seed` = `7451.00`
- `preload_duration_ms` = `75.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `28.44`, min `14.03`, p50 `28.52`, p95 `44.71`, p99 `53.52`, 1%low `16.47`, 0.1%low `14.03`, std `6.77`

**Frame time (ms)**  avg `36.75`, p50 `35.07`, p95 `48.40`, p99 `53.31`, p99.9 `65.35`, max `71.29`

**Client tick (ms)**  avg `0.37`, p95 `0.63`, max `3.91`

**Memory**  start `3542 MB`, end `2865 MB`, peak `3870 MB`, GC `20 events / 198 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |             █                        █                                         
 32.1 |             █                      █ █                              █    █     
 31.3 |        █    █       █              █ █                              █    █  █  
 30.6 |  █ █   █   ██       █         █    ███           █                  █    █  █  
 29.9 |  █ █   █   ██   █   █    █    █ █  ███           █ █  █           █ █    █ ██  
 29.2 |  █ █   █   ██  ██  ██   ██   ██ █  ███          ██ █  █ ██    █ █ █ █    █ ██  
 28.4 |█ █ █   █   ██  ██  ███  ██   ██ █  ███  ███   █ ██ █  █ ███   █ █ █ █  █ █ ████
 27.7 |█ █ ███ █ █ ██████ ████████  ██████ ████ ████  █ ██ ██ █████   █ █ ███ ██ ██████
 27.0 |█ █ ███ █ ████████ ████████ ██████████████████████████ █████ █████████ ██ ██████
 26.3 |█ █████ ██████████ █████████████████████████████████████████ █████████ ██ ██████
 25.5 |███████ ████████████████████████████████████████████████████ ████████████ ██████
 24.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms |   1
  16 ms |   1
  18 ms | ███  7
  19 ms | ██  5
  20 ms | ██  4
  21 ms | ███  7
  22 ms | ██  5
  23 ms | ███  6
  24 ms |   1
  25 ms |   1
  26 ms | █  2
  27 ms | █  2
  28 ms | █  2
  29 ms |   1
  30 ms | ██  4
  31 ms | ████████  17
  32 ms | ███████████████████████  52
  33 ms | ████████████████████████████████████████  90
  34 ms | ███████████████████████████  61
  35 ms | ██████████████  32
  36 ms | ███████████████  33
  37 ms | ██████  14
  38 ms | █████████  20
  39 ms | ████████  18
  40 ms | █████████  21
  41 ms | ████  8
  42 ms | ███████  16
  43 ms | █████████  20
  44 ms | ████████  19
  45 ms | ████████  17
  46 ms | ████████  17
  47 ms | ████  10
  48 ms | ████  8
  49 ms | ███  6
  50 ms | ███  7
  51 ms |   1
  52 ms | █  3
  53 ms |   1
  54 ms |   1
  57 ms |   1
  59 ms |   1
  60 ms |   1
  71 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `16.47`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `63.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.21`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.03`
- `seed` = `7457.00`
- `preload_duration_ms` = `49.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-46.00`
- `entity_count_sample_start` = `47.00`
- `x_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24611 ms  |  Sample ticks: 400

**FPS**  avg `30.28`, min `7.36`, p50 `28.27`, p95 `47.09`, p99 `61.28`, 1%low `11.03`, 0.1%low `7.36`, std `32.72`

**Frame time (ms)**  avg `37.07`, p50 `35.38`, p95 `50.45`, p99 `61.46`, p99.9 `120.52`, max `135.96`

**Client tick (ms)**  avg `0.43`, p95 `0.56`, max `13.28`

**Memory**  start `2631 MB`, end `2548 MB`, peak `3870 MB`, GC `26 events / 237 ms`

**FPS over sampling window (ASCII):**

```
175.6 |             █                                                                  
161.9 |             █                                                                  
148.1 |             █                                                                  
134.4 |             █                                                                  
120.7 |             █                                                                  
107.0 |             █                                                                  
 93.3 |             █                                                                  
 79.5 |             █                                                                  
 65.8 |             █                                                                  
 52.1 |             █                                                                  
 38.4 |             ██                        █         █    █        █                
 24.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   4 ms | █  1
  12 ms | █  2
  15 ms | █  1
  16 ms | ██  3
  17 ms | █  2
  18 ms | █  2
  19 ms | ████  6
  20 ms | █████  8
  21 ms | █████  8
  22 ms | ██  3
  23 ms | ████  6
  24 ms | █  2
  25 ms | ██  3
  26 ms | █  1
  27 ms | █  2
  28 ms | █  1
  29 ms | █  2
  30 ms | ████  6
  31 ms | ██████████████  23
  32 ms | ██████████████████████████████████████  63
  33 ms | ████████████████████████████████████████  66
  34 ms | █████████████████████████████  48
  35 ms | ███████████████  24
  36 ms | ███████████████████  32
  37 ms | █████████  15
  38 ms | ██████████  16
  39 ms | ████████████████  26
  40 ms | ████████  13
  41 ms | ███████████████  25
  42 ms | ████████  14
  43 ms | ██████████  17
  44 ms | █████████████  22
  45 ms | ███████  12
  46 ms | ███████  11
  47 ms | █████  9
  48 ms | ██████  10
  49 ms | ██  4
  50 ms | ██  3
  51 ms | ██  4
  52 ms | █  2
  53 ms | ██  4
  55 ms | ██  4
  56 ms | █  2
  58 ms | █  1
  59 ms | █  1
  60 ms | █  1
  61 ms | █  2
  65 ms | █  1
  69 ms | █  1
  75 ms | █  1
 107 ms | █  1
 135 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `11.03`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `7.36`
- `seed` = `7477.00`
- `preload_duration_ms` = `1579.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `13.00`
- `x_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23145 ms  |  Sample ticks: 400

**FPS**  avg `16.47`, min `6.08`, p50 `10.12`, p95 `31.11`, p99 `46.43`, 1%low `7.15`, 0.1%low `n/a`, std `9.81`

**Frame time (ms)**  avg `79.32`, p50 `98.77`, p95 `115.57`, p99 `126.34`, p99.9 `155.23`, max `164.44`

**Client tick (ms)**  avg `0.37`, p95 `0.76`, max `3.43`

**Memory**  start `2457 MB`, end `3123 MB`, peak `3870 MB`, GC `23 events / 204 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                   █     █                                                      
 32.3 |           █ █     █ █   █                                                      
 30.0 |  █  █ █  ██ █    ██ █   █  █                                                   
 27.6 |████████████ ███  ██████ █ ██                                                   
 25.3 |█████████████████████████████                                                   
 22.9 |█████████████████████████████                                                   
 20.6 |█████████████████████████████                                                   
 18.2 |█████████████████████████████                                                   
 15.9 |██████████████████████████████                                                  
 13.5 |██████████████████████████████              █                                   
 11.2 |██████████████████████████████  █  █    █   █     █ ██   ██  ██ █   █      █    
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | ██  1
  21 ms | █████  3
  22 ms | ████  2
  23 ms | ██  1
  24 ms | ██  1
  30 ms | ████  2
  31 ms | █████  3
  32 ms | ███████████████  8
  33 ms | ████████████████████████  13
  34 ms | █████████████████████████  14
  35 ms | █████  3
  36 ms | ███████████  6
  37 ms | ██  1
  38 ms | █████████  5
  39 ms | ██  1
  40 ms | ██  1
  41 ms | █████  3
  42 ms | ███████  4
  43 ms | ████  2
  44 ms | ██  1
  45 ms | ███████████  6
  46 ms | ████  2
  47 ms | ████  2
  48 ms | ██  1
  49 ms | ████  2
  55 ms | ██  1
  71 ms | ██  1
  82 ms | ██  1
  85 ms | ██  1
  87 ms | ████  2
  89 ms | ██  1
  90 ms | ██  1
  91 ms | ██  1
  92 ms | █████  3
  93 ms | ██  1
  94 ms | ███████  4
  95 ms | ██  1
  96 ms | ███████  4
  97 ms | ██████████████████  10
  98 ms | ████████████████  9
  99 ms | ████████████████████████████████████████  22
 100 ms | ██████████████████████████████████████  21
 101 ms | ██████████████████████████████████████  21
 102 ms | ████████████████████  11
 103 ms | █████████████  7
 104 ms | ███████████  6
 105 ms | ███████  4
 107 ms | ██  1
 108 ms | ██  1
 109 ms | █████  3
 110 ms | ████  2
 111 ms | █████  3
 112 ms | ████  2
 113 ms | █████  3
 114 ms | ████  2
 115 ms | █████  3
 117 ms | ██  1
 118 ms | ██  1
 122 ms | ██  1
 123 ms | ██  1
 124 ms | █████  3
 125 ms | ██  1
 127 ms | ████  2
 164 ms | ██  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.15`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `12.61`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `76.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-7.00`
- `entity_count_sample_start` = `8.00`
- `x_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24751 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `5.59`, p50 `9.91`, p95 `10.76`, p99 `12.66`, 1%low `6.44`, 0.1%low `n/a`, std `1.50`

**Frame time (ms)**  avg `103.00`, p50 `100.93`, p95 `120.59`, p99 `129.83`, p99.9 `169.60`, max `178.74`

**Client tick (ms)**  avg `0.38`, p95 `1.23`, max `3.31`

**Memory**  start `3597 MB`, end `2708 MB`, peak `3881 MB`, GC `27 events / 234 ms`

**FPS over sampling window (ASCII):**

```
 17.9 |                                                   █                            
 17.0 |                                                   █                            
 16.0 |                                                   █                            
 15.1 |                                                   █                            
 14.2 |                                                   █                            
 13.3 |                                                   █                            
 12.4 |                               █                   █                            
 11.4 |                               █                   █                            
 10.5 |  █      █ █       █    █ █    █      █   █      █ ██      █  █   █    █        
  9.6 |████ █████ ██████████ ████████ ██████ ████████████ ██████ ██████████████████ ██ 
  8.7 |██████████████████████████████ ███████████████████ █████████████████████████████
  7.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  36 ms | █  1
  67 ms | █  1
  79 ms | █  1
  81 ms | █  1
  88 ms | ██  2
  90 ms | ██  2
  91 ms | ██  2
  93 ms | ██  2
  94 ms | █  1
  95 ms | █████  4
  96 ms | █  1
  97 ms | █████████████████  14
  98 ms | █████████████████████  17
  99 ms | ██████████████████████  18
 100 ms | ████████████████████████████████████████  33
 101 ms | █████████████████████████  21
 102 ms | ███████████  9
 103 ms | ███████████  9
 104 ms | ██████  5
 105 ms | ██████  5
 106 ms | ███████  6
 107 ms | ██  2
 108 ms | █  1
 109 ms | ██████  5
 110 ms | ██  2
 111 ms | ██  2
 112 ms | ██  2
 113 ms | ███████  6
 114 ms | ███████  6
 115 ms | █  1
 116 ms | █  1
 118 ms | █  1
 120 ms | █  1
 121 ms | █  1
 123 ms | █  1
 124 ms | ██  2
 125 ms | █  1
 127 ms | █  1
 128 ms | █  1
 129 ms | █  1
 131 ms | █  1
 178 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `6.44`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.71`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `1635.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-30.00`
- `entity_count_sample_start` = `31.00`
- `x_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `293.05`, min `22.33`, p50 `117.55`, p95 `1269.05`, p99 `1581.80`, 1%low `34.82`, 0.1%low `22.37`, std `415.55`

**Frame time (ms)**  avg `10.21`, p50 `8.51`, p95 `21.92`, p99 `25.10`, p99.9 `30.96`, max `44.78`

**Client tick (ms)**  avg `0.48`, p95 `0.73`, max `4.26`

**Memory**  start `2898 MB`, end `2938 MB`, peak `3880 MB`, GC `24 events / 206 ms`

**FPS over sampling window (ASCII):**

```
436.2 |       █                                                                        
412.8 |       █                                                                        
389.4 |       █   █                                          █                         
366.0 |      ██   █                                 █        █        █      █         
342.6 |  █   ██   █          █       ██    █ █      █ █      █        █      █         
319.2 |█ █  ███   ███       ██    █  ███ █ █ ██  █  ███      █    ██ ██   █  ██  █     
295.8 |█ █  █████████ █  █ ███    █  ███ ███ ███ █  ███   █  █    █████   ██ ██  █    █
272.4 |█████████████████ ██████ █ ████████████████  ███ ███  █    █████ ████ █████ █  █
248.9 |█████████████████ ████████ █████████████████ ███ ████ ████ ██████████ █████ █  █
225.5 |████████████████████████████████████████████ ███ ████ ████ ███████████████████ █
202.1 |█████████████████████████████████████████████████████ ████ █████████████████████
178.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████  222
   1 ms | █████████████  163
   2 ms | ██  29
   3 ms |   5
   4 ms |   5
   5 ms |   3
   6 ms | ██  19
   7 ms | ████████████████  203
   8 ms | ████████████████████████████████████████  499
   9 ms | ████████████  150
  10 ms | ███  34
  11 ms | █  16
  12 ms |   5
  13 ms |   6
  14 ms | █  10
  15 ms | ███  41
  16 ms | ████████  97
  17 ms | █████████  118
  18 ms | ██████  78
  19 ms | ████  53
  20 ms | █████  63
  21 ms | ████  48
  22 ms | ███  36
  23 ms | ██  23
  24 ms | █  13
  25 ms | █  9
  26 ms |   1
  27 ms |   5
  28 ms |   3
  30 ms |   1
  44 ms |   2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `34.82`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `68.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `97.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `22.37`
- `seed` = `7499.00`
- `preload_duration_ms` = `51.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-43.00`
- `entity_count_sample_start` = `47.00`
- `x_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23321 ms  |  Sample ticks: 400

**FPS**  avg `299.82`, min `19.04`, p50 `116.92`, p95 `1346.81`, p99 `1675.40`, 1%low `33.94`, 0.1%low `21.86`, std `431.56`

**Frame time (ms)**  avg `10.24`, p50 `8.55`, p95 `21.88`, p99 `25.33`, p99.9 `32.74`, max `52.51`

**Client tick (ms)**  avg `0.34`, p95 `0.50`, max `1.32`

**Memory**  start `3463 MB`, end `3463 MB`, peak `3874 MB`, GC `29 events / 246 ms`

**FPS over sampling window (ASCII):**

```
494.6 |█                                                                               
466.6 |█                                                                               
438.7 |█        █                                                                      
410.8 |█        █ ██                                                                   
382.9 |█  █    ██████    █                                                             
354.9 |█  ██ █ ██████    █ █ █ █       █         █   █    █                            
327.0 |█ █████████████ █ █ █ ███  ██  ██   █    ██ █ █    █    ██          █      █    
299.1 |█ █████████████ ███ █ ███  ██  ██ █ █ █  ██ █████  █ █  ██          █  ██  █   █
271.2 |█ █████████████ █████ ███ ███  ██ █ █ ███████████ ██ █ ████  ███   ██ ███ ██   █
243.2 |█████████████████████████████ ███ ███ ███████████ ██ █ █████████  ███████ ████ █
215.3 |█████████████████████████████ ██████████████████████ █ ██████████████████ ████ █
187.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████████████  234
   1 ms | ███████████  156
   2 ms | ██  23
   3 ms |   2
   4 ms |   2
   5 ms |   1
   6 ms | █  15
   7 ms | ██████████████  194
   8 ms | ████████████████████████████████████████  555
   9 ms | ██████████  132
  10 ms | ██  23
  11 ms | █  10
  12 ms |   2
  13 ms |   1
  14 ms | █  9
  15 ms | ██  28
  16 ms | ███████  96
  17 ms | █████████  121
  18 ms | ███████  98
  19 ms | ████  60
  20 ms | ████  54
  21 ms | ███  42
  22 ms | ██  28
  23 ms | ██  25
  24 ms | █  15
  25 ms | █  11
  26 ms |   4
  27 ms |   5
  28 ms |   2
  30 ms |   1
  32 ms |   2
  38 ms |   1
  52 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `33.94`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `97.66`
- `part` = `1.00`
- `fps_0p1pct_low` = `21.86`
- `seed` = `7507.00`
- `preload_duration_ms` = `254.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `33.46`, min `16.14`, p50 `29.52`, p95 `51.67`, p99 `77.44`, 1%low `17.24`, 0.1%low `16.14`, std `19.19`

**Frame time (ms)**  avg `33.64`, p50 `33.87`, p95 `48.31`, p99 `52.30`, p99.9 `61.69`, max `61.96`

**Client tick (ms)**  avg `0.40`, p95 `0.55`, max `7.46`

**Memory**  start `3029 MB`, end `3706 MB`, peak `3879 MB`, GC `32 events / 277 ms`

**FPS over sampling window (ASCII):**

```
 64.7 |                         █                                                      
 61.5 |                         █                                                      
 58.2 |                         █                               █                      
 54.9 |          █              █                          █    █                      
 51.7 |          █              █                          █    █                      
 48.4 |          █              █                          █    █                      
 45.2 |          █              █                          █    █                      
 41.9 |          █              █                          █    █                      
 38.6 |          █              █                          █    █        █          █  
 35.4 |   █      █   █          █   █ █ ██     █    █ █   ██   ██   █    █    █   █ █ █
 32.1 |██ ██ ██████ ██ ████ █████████ █████ ██████ ██████████████ ██████ ███  ██  █████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   4 ms | ██  2
   5 ms | █  1
   9 ms | █  1
  10 ms | █  1
  13 ms | ██  2
  14 ms | █  1
  15 ms | ████  4
  16 ms | ███  3
  17 ms | ████  4
  18 ms | ██████  7
  19 ms | █████████████  15
  20 ms | ████████████  13
  21 ms | ███████████  12
  22 ms | ████████████████████  22
  23 ms | ████████████  14
  24 ms | █████████████████  19
  25 ms | ██████████████  16
  26 ms | █████████████████  19
  27 ms | ████████████  14
  28 ms | ██████████  11
  29 ms | █████████████  15
  30 ms | ████████████  13
  31 ms | █████████████████  19
  32 ms | ██████████████████████████████████  38
  33 ms | ██████████████████████████████  34
  34 ms | ████████████████████████████████████████  45
  35 ms | ████████████████████  23
  36 ms | ██████████████████████  25
  37 ms | ██████████████████  20
  38 ms | █████████████  15
  39 ms | ██████████  11
  40 ms | █████████████████  19
  41 ms | ████████████  14
  42 ms | ████████████  13
  43 ms | █████████████  15
  44 ms | ████████████████████  22
  45 ms | ██████████████  16
  46 ms | ██████  7
  47 ms | ██████████████  16
  48 ms | ██████  7
  49 ms | ███████  8
  50 ms | █████  6
  51 ms | ████  5
  52 ms | ██  2
  54 ms | █  1
  56 ms | █  1
  61 ms | ███  3
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `17.24`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.73`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.14`
- `seed` = `7517.00`
- `preload_duration_ms` = `40.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-54.00`
- `entity_count_sample_start` = `55.00`
- `x_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `33.58`, min `12.62`, p50 `29.61`, p95 `51.92`, p99 `82.02`, 1%low `15.65`, 0.1%low `12.62`, std `21.30`

**Frame time (ms)**  avg `33.65`, p50 `33.78`, p95 `47.88`, p99 `55.87`, p99.9 `70.38`, max `79.22`

**Client tick (ms)**  avg `0.40`, p95 `0.63`, max `7.15`

**Memory**  start `3579 MB`, end `3649 MB`, peak `3875 MB`, GC `34 events / 267 ms`

**FPS over sampling window (ASCII):**

```
 70.5 |                    █                                                           
 66.6 |                    █                                                           
 62.8 |                    █                                                           
 58.9 | █                  █                                                   █       
 55.1 | █                  █                                                   █       
 51.2 | █                  ██                                                  █       
 47.3 | █         █        ██                                                  █       
 43.5 | █         █        ██                                                  █       
 39.6 | █         █        ██                                      █           █       
 35.8 | █      █  █      █ ██     █ █         █  █          █      █  █  █    ██  █    
 31.9 |███████ █ ████ ██ ████ ███████████████ ███████████ ████████████████ ██ ███ █████
 28.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ███  3
   5 ms | █  1
   7 ms | █  1
   8 ms | █  1
  12 ms | █  1
  14 ms | █  1
  15 ms | ███  4
  16 ms | ███  3
  17 ms | ███  3
  18 ms | █████████  10
  19 ms | ████████  9
  20 ms | ████████████  14
  21 ms | ███████  8
  22 ms | ███████████████████  22
  23 ms | █████████  10
  24 ms | ████████████████  18
  25 ms | ███████████████████  22
  26 ms | ████████████  14
  27 ms | █████████████████████  24
  28 ms | █████████  10
  29 ms | █████████████  15
  30 ms | ███████████████  17
  31 ms | ███████████  13
  32 ms | █████████████████████████████████  38
  33 ms | ████████████████████████████████████████  46
  34 ms | ██████████████████████████████████  39
  35 ms | ████████████████████████  28
  36 ms | █████████████████  20
  37 ms | █████████████  15
  38 ms | ███████████████  17
  39 ms | ███████████████████████  26
  40 ms | ██████████████████  21
  41 ms | █████████████████  19
  42 ms | ██████████  11
  43 ms | ██████████  12
  44 ms | ██████████  11
  45 ms | ██████████████  16
  46 ms | ███████████████  17
  47 ms | ████  5
  48 ms | ███  4
  49 ms | ███  3
  50 ms | █████  6
  51 ms | ██  2
  52 ms | ███  3
  53 ms | █  1
  54 ms | █  1
  55 ms | ███  3
  56 ms | █  1
  60 ms | █  1
  61 ms | █  1
  62 ms | █  1
  64 ms | █  1
  79 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `15.65`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.71`
- `part` = `1.00`
- `fps_0p1pct_low` = `12.62`
- `seed` = `7523.00`
- `preload_duration_ms` = `71.00`
- `entity_count_sample_end` = `12.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-15.00`
- `entity_count_sample_start` = `27.00`
- `x_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `31.53`, min `19.21`, p50 `29.88`, p95 `47.93`, p99 `51.09`, 1%low `20.24`, 0.1%low `19.21`, std `7.70`

**Frame time (ms)**  avg `33.39`, p50 `33.47`, p95 `46.15`, p99 `47.72`, p99.9 `50.80`, max `52.07`

**Client tick (ms)**  avg `0.27`, p95 `0.34`, max `0.53`

**Memory**  start `3324 MB`, end `3083 MB`, peak `3871 MB`, GC `10 events / 54 ms`

**FPS over sampling window (ASCII):**

```
 37.4 |                      █                                                         
 36.6 |                      █                                                         
 35.8 |                      █                                                         
 35.1 |                      █      █                                                  
 34.3 |                 █    █      █                        █ █               █       
 33.5 |                 █   ██      █        █     █         █ █               █       
 32.7 |     █ █ █       █   ██   █  █  █     ██  █ █   █     █ █  █   █ █      █       
 31.9 |  █  █ █████  █  ███ ██ █ █ ███ █  █  ██  █ █   ██    ██████ █ █ ██ █   █    █  
 31.1 |███  █ █████  █  ███ ██ ███ ███ ██ █████  █ ███ ██ █ ███████ █ █ ██ █ █ ██  ██  
 30.4 |████ █ █████████ ██████████ ███ █████████ █████ ███████████████████████ ███ ████
 29.6 |████████████████ ██████████ ████████████████████████████████████████████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms |   1
  16 ms |   1
  17 ms |   1
  18 ms | █  2
  19 ms | █  5
  20 ms | ██████  24
  21 ms | ████  15
  22 ms | █████  18
  23 ms | ███  11
  24 ms | ████  17
  25 ms | ████  15
  26 ms | ██  9
  27 ms | ███  10
  28 ms | █████  18
  29 ms | ████  16
  30 ms | ████  16
  31 ms | ████  15
  32 ms | ███████  25
  33 ms | ████████████████████████████████████████  153
  34 ms | ███████  25
  35 ms | ███████  27
  36 ms | ████  17
  37 ms | ████  15
  38 ms | ████  17
  39 ms | ████  14
  40 ms | ████  15
  41 ms | ███  11
  42 ms | █████  18
  43 ms | ███  10
  44 ms | ███  11
  45 ms | ████  15
  46 ms | ██████  23
  47 ms | █  4
  48 ms |   1
  49 ms | █  3
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `19.21`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.95`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `20.24`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_start` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `35.97`, min `15.21`, p50 `29.60`, p95 `70.30`, p99 `122.67`, 1%low `15.98`, 0.1%low `15.21`, std `21.29`

**Frame time (ms)**  avg `33.44`, p50 `33.78`, p95 `52.61`, p99 `60.12`, p99.9 `64.21`, max `65.75`

**Client tick (ms)**  avg `3.09`, p95 `4.17`, max `10.70`

**Memory**  start `3352 MB`, end `3212 MB`, peak `3880 MB`, GC `11 events / 66 ms`

**FPS over sampling window (ASCII):**

```
 59.2 |            █                                                                   
 56.6 |            █                                                                   
 53.9 |            █                                                        █          
 51.3 |            █                      █                                 █          
 48.6 |  █         █                  █   █                                 █          
 46.0 |  █         █                  █   █                                 █          
 43.3 |  █         █   █              █   █      █                  █       █  █       
 40.7 |  █         █   █       █ █    █   █   █  ██              █  █    █  ██ █       
 38.1 | ██         ██  █ ██    █ █    ██  █ █ █  ██  █          ███ █    █  ██ █ █     
 35.4 |███ █       ██  █████   █ ██████████ ███  ███ █ █     █  ███ █    █  ████ █  █ █
 32.8 |██████ █  ███████████████████████████████████ █████   ██ ███ █ █ ███████████████
 30.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   5 ms | █  1
   6 ms | █  1
   7 ms | ███  2
   8 ms | ███████  5
   9 ms | ███  2
  10 ms | ███████  5
  11 ms | ██████████  7
  12 ms | ██████  4
  13 ms | ███  2
  14 ms | ██████  4
  15 ms | █████████  6
  16 ms | ███████  5
  17 ms | █████████████  9
  18 ms | ███████████████████████  16
  19 ms | ███████████████████  13
  20 ms | ████████████████████████  17
  21 ms | ████████████████████████  17
  22 ms | ██████████████████████████  18
  23 ms | ██████████████████████████  18
  24 ms | ████████████████  11
  25 ms | █████████████████████  15
  26 ms | ███████████████████████████  19
  27 ms | ████████████████  11
  28 ms | ███████  5
  29 ms | ███████████████████████  16
  30 ms | ████████████████████████████████████████  28
  31 ms | █████████████████████  15
  32 ms | ████████████████████████  17
  33 ms | ███████████████████████  16
  34 ms | ███████████████████  13
  35 ms | █████████████████████████████  20
  36 ms | ████████████████████████  17
  37 ms | ███████████████████████  16
  38 ms | ██████████████  10
  39 ms | ███████████████████  13
  40 ms | ██████████████████████████████  21
  41 ms | ███████████████████████████████  22
  42 ms | █████████████████████████████  20
  43 ms | ██████████████████████████  18
  44 ms | ███████████████████████████████  22
  45 ms | █████████████████  12
  46 ms | ████████████████████  14
  47 ms | ██████████████  10
  48 ms | ████████████████████  14
  49 ms | █████████  6
  50 ms | ████  3
  51 ms | ███████  5
  52 ms | █████████  6
  53 ms | ████  3
  54 ms | ███████  5
  55 ms | █████████  6
  56 ms | ███  2
  57 ms | ██████  4
  58 ms | ███  2
  60 ms | ████  3
  62 ms | ███  2
  63 ms | █  1
  65 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.90`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `66.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `15.98`
- `fps_0p1pct_low` = `15.21`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `31.61`, min `17.11`, p50 `29.78`, p95 `47.79`, p99 `52.79`, 1%low `20.05`, 0.1%low `17.11`, std `7.90`

**Frame time (ms)**  avg `33.40`, p50 `33.58`, p95 `45.52`, p99 `47.60`, p99.9 `52.46`, max `58.46`

**Client tick (ms)**  avg `0.27`, p95 `0.36`, max `0.45`

**Memory**  start `2819 MB`, end `3851 MB`, peak `3876 MB`, GC `7 events / 43 ms`

**FPS over sampling window (ASCII):**

```
 36.0 |           █                                                                    
 35.3 |           █                                                                    
 34.7 |           █        █                  █                                        
 34.0 |  █   █    █        █                  █     █                   █         █    
 33.4 |  █ █ █    █        █         █   █    █  █  █          █    █   █         █   █
 32.7 |  █ █ █   ██   █    █ █       █   █    █ ██  █   █      █  █ █   █         █ █ █
 32.1 | ██ █ ██  ██   ██   █ █       █ ███    █ ██  █   █      █  █ █   █   █ █   █ █ █
 31.4 | ██ █ ██ ███ ████ ███ █ █   █ ████████ █ ███ █ ███ █ █  ██ █ ██  █   █████ █ █ █
 30.8 | ███████ ████████ █████ █ █ █ ████████ ███████ █████ ██ ██ █ ███ ██ ██████████ █
 30.1 |████████ ████████████████████ █████████████████████████ ████ ███ █████████████ █
 29.5 |███████████████████████████████████████████████████████ ████████ ███████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  17 ms | █  3
  18 ms | ██  4
  19 ms | ███  9
  20 ms | ██████  15
  21 ms | █████████  24
  22 ms | █████  14
  23 ms | ██████  17
  24 ms | ██████  15
  25 ms | ██████  16
  26 ms | █████  14
  27 ms | ████  11
  28 ms | ████  10
  29 ms | ██████  15
  30 ms | █████  14
  31 ms | █████  12
  32 ms | ██████████████████  48
  33 ms | ████████████████████████████████████████  106
  34 ms | ███████████████  39
  35 ms | █████████  24
  36 ms | ███████  19
  37 ms | ████████  21
  38 ms | █████  14
  39 ms | ████  11
  40 ms | █████  14
  41 ms | ███████  19
  42 ms | █████  14
  43 ms | █████████  23
  44 ms | ██████  15
  45 ms | █████  14
  46 ms | ████  11
  47 ms | ███  9
  48 ms | █  3
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.05`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.11`
- `seed` = `9043.00`
- `preload_duration_ms` = `62.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23072 ms  |  Sample ticks: 400

**FPS**  avg `31.21`, min `20.88`, p50 `29.87`, p95 `46.63`, p99 `50.96`, 1%low `21.02`, 0.1%low `20.88`, std `6.84`

**Frame time (ms)**  avg `33.40`, p50 `33.47`, p95 `45.07`, p99 `47.04`, p99.9 `47.87`, max `47.88`

**Client tick (ms)**  avg `0.29`, p95 `0.37`, max `0.53`

**Memory**  start `3176 MB`, end `3761 MB`, peak `3873 MB`, GC `7 events / 45 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |     █                                                              █     █     
 34.3 |     █                                              █               █     █  ██ 
 33.7 |     █   █   █                                      █               █     █  ██ 
 33.1 |     █   █   █    █             █  █          ██    █               █     █  ██ 
 32.6 |     █   █   █ █  █             █  █    █   █ ██    █               █  █  █  ██ 
 32.0 |     █   █   █ █  █ █     █     █  █    █ █ █ ██    █  █       █ █  █  █  █  ██ 
 31.5 |  █  █   █ █ █ █  █ █ █   █     ██ █ █  █ █ █ ██  █ ██ ██    █ █ ██ █  ██ █ ███ 
 30.9 |  █  ███ █ █ █ █  █ █ █ ███    █████ ██ █ ███ █████ ██ ██  █ █ ████ █ ███ █ ███ 
 30.3 |████ █████ ██████ ███ █ ████████████ ██ █████ █████ ██ ███████ ████ █████ █ ████
 29.8 |████ ████████████ ███ █ ███████████████████████████ ██ ████████████ ████████████
 29.2 |████ ███████████████████████████████████████████████████████████████████████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  18 ms | █  3
  19 ms | █  4
  20 ms | ███  10
  21 ms | █████  21
  22 ms | ████  15
  23 ms | ███  13
  24 ms | ███  11
  25 ms | █  5
  26 ms | ████  16
  27 ms | ███  13
  28 ms | ████  15
  29 ms | ████  14
  30 ms | ██  8
  31 ms | ██████  24
  32 ms | ███████████  45
  33 ms | ████████████████████████████████████████  160
  34 ms | ███████████  42
  35 ms | ███████  29
  36 ms | ████  14
  37 ms | ████  14
  38 ms | ████  14
  39 ms | ███  10
  40 ms | ████  14
  41 ms | ██  9
  42 ms | ███  13
  43 ms | ███  12
  44 ms | █████  18
  45 ms | ████  16
  46 ms | ██  8
  47 ms | ██  7
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `67.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `21.02`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `20.88`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `31.38`, min `20.74`, p50 `29.76`, p95 `46.72`, p99 `50.05`, 1%low `20.99`, 0.1%low `20.74`, std `7.21`

**Frame time (ms)**  avg `33.38`, p50 `33.60`, p95 `44.97`, p99 `47.09`, p99.9 `47.95`, max `48.22`

**Client tick (ms)**  avg `0.29`, p95 `0.36`, max `0.65`

**Memory**  start `3628 MB`, end `3228 MB`, peak `3868 MB`, GC `10 events / 54 ms`

**FPS over sampling window (ASCII):**

```
 35.6 |        █                                                                       
 35.0 |        █                                                                       
 34.4 |        █                                                                       
 33.8 |        █    █                   █                            █    █            
 33.2 |   █  █ █    █   █   █           █      █ █   █   █           █    █            
 32.6 |█  █  █ █    █   █   █ █      ██ █ █ █  █ █   █ █ █   █       █   ██ █ █  ██    
 31.9 |█  █ ██ █    █  ██ █ █ █    █ ██ █ █ █  █ █   █ █ █   █       █ █ ██ ███  ██  █ 
 31.3 |█  █ ██ █  █ █  ██ █ █ █  ███ ██ █ █ █  █ ███ ███ █ █ █ ██    █ █ ██ ███████  ██
 30.7 |██ █ ██ ██ █ █ ███ █████  ███ ██ █ █ ██ █ ███ ███ █ ███ █████ █ ████ ████████ ██
 30.1 |████████████ █ █████████████████████ ██ █ ███████ █ ████████████████ ████████ ██
 29.5 |████████████ ████████████████████████████ ███████████████████████████████████ ██
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  18 ms |   1
  19 ms | █  5
  20 ms | ███  13
  21 ms | ██████  24
  22 ms | █████  20
  23 ms | ████  14
  24 ms | ███  13
  25 ms | ████  15
  26 ms | ███  10
  27 ms | ███  13
  28 ms | ███  12
  29 ms | ████  16
  30 ms | ███  11
  31 ms | ███  10
  32 ms | █████████  35
  33 ms | ████████████████████████████████████████  157
  34 ms | ████████  33
  35 ms | ██████  22
  36 ms | █████  20
  37 ms | ████  17
  38 ms | ██████  23
  39 ms | ██  8
  40 ms | ███  10
  41 ms | █████  18
  42 ms | █████  18
  43 ms | ████  17
  44 ms | ███  12
  45 ms | ███  13
  46 ms | ███  10
  47 ms | ██  6
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
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
- `fps_1pct_low` = `20.99`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `29.96`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `20.74`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `31.54`, min `20.36`, p50 `29.87`, p95 `48.11`, p99 `50.64`, 1%low `20.90`, 0.1%low `20.36`, std `7.71`

**Frame time (ms)**  avg `33.42`, p50 `33.47`, p95 `45.62`, p99 `47.25`, p99.9 `48.62`, max `49.12`

**Client tick (ms)**  avg `0.30`, p95 `0.37`, max `2.54`

**Memory**  start `3538 MB`, end `3562 MB`, peak `3869 MB`, GC `10 events / 53 ms`

**FPS over sampling window (ASCII):**

```
 35.4 |                                             █                                  
 34.8 |                                             █                                █ 
 34.2 |          █                                  █            █                   █ 
 33.6 |          █         █                        █            █                █  █ 
 33.0 |    █     █         █ █                  █   █       █    █  █  █  █     █ █  █ 
 32.4 | █  █ █   █         █ █   █     ████     █   ███  █  █    █  █  █  █     █ ██ █ 
 31.8 | ██ █ ██  █       █ █ █   █ █ █ ████   █ █ █ ███ ██  █    █  █  █  ███   █ ██ █ 
 31.2 |███ █ ██  ██  █  ██ █ ███ █ █ █ ████████ █ █████ ██  █ ██ ██ █  ██ ███ █ █ ██ █ 
 30.6 |████████  ███ █████ █ ███████ █ ████████ ███████ ████████ ██ █ ███████ █ ████ █ 
 30.0 |█████████ █████████ █████████ ███████████████████████████████████████████████ █ 
 29.5 |█████████ █████████ ████████████████████████████████████████████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | ██  8
  20 ms | ███████  26
  21 ms | ████  16
  22 ms | █████  18
  23 ms | ████  17
  24 ms | ████  16
  25 ms | ███  11
  26 ms | ███  11
  27 ms | ███  13
  28 ms | ████  14
  29 ms | ███  13
  30 ms | ██  9
  31 ms | ████  17
  32 ms | ████████  32
  33 ms | ████████████████████████████████████████  154
  34 ms | ███████  28
  35 ms | ███  13
  36 ms | ████  14
  37 ms | █████  19
  38 ms | ████  15
  39 ms | ███  12
  40 ms | ███  12
  41 ms | ███  12
  42 ms | █████  18
  43 ms | ███  11
  44 ms | █████  19
  45 ms | ██████  24
  46 ms | ████  16
  47 ms | ██  6
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.90`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.92`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `20.36`
- `seed` = `8053.00`
- `preload_duration_ms` = `35.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195717 ms  |  Sample ticks: 3600

**FPS**  avg `37.12`, min `0.58`, p50 `30.63`, p95 `81.78`, p99 `136.24`, 1%low `10.35`, 0.1%low `2.41`, std `23.19`

**Frame time (ms)**  avg `33.85`, p50 `32.65`, p95 `57.05`, p99 `61.76`, p99.9 `74.58`, max `1726.89`

**Client tick (ms)**  avg `0.85`, p95 `1.20`, max `15.49`

**Memory**  start `2789 MB`, end `3300 MB`, peak `4066 MB`, GC `252 events / 1365 ms`

**FPS over sampling window (ASCII):**

```
 44.9 |                            █                                                   
 43.7 |                     █  █   █                                                   
 42.4 |                 █   █  █   █ █         █  █                                    
 41.2 |                 █   █  █   █ █  █      █  █  █                            █    
 40.0 |   █    █ █     ███  █ ██   █ ██ ██     █ ██  █        █                   █    
 38.8 |   █    █ █ █   ████ █ ███  ████████    █ ██  █  █ █ ███             █     █   █
 37.6 |  ███   █ ███   ████ ███████████████  ██████  ██ █ █ ███             █     █   █
 36.4 |  ███ ███████   ████████████████████ ████████ ████ █ ███             █     ██  █
 35.2 |█████ ████████ ██████████████████████████████ ███████████        █   █     ██  █
 33.9 |█████ ███████████████████████████████████████ ███████████ █ █ █  █  ██ ██  █████
 32.7 |███████████████████████████████████████████████████████████ ████ ██ ██ █████████
 31.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   2
   4 ms |   2
   5 ms | ██  13
   6 ms | ████  25
   7 ms | ████████  46
   8 ms | ████████  47
   9 ms | █████████  50
  10 ms | ████████  44
  11 ms | ██████  35
  12 ms | █████  27
  13 ms | █████████  54
  14 ms | ██████  37
  15 ms | █████  30
  16 ms | █████████  51
  17 ms | ████████████  71
  18 ms | ███████████  60
  19 ms | ███████████████  84
  20 ms | ████████████████████████████  161
  21 ms | ████████████████████████████████████  208
  22 ms | ██████████████████████████████████████  216
  23 ms | ████████████████████████████████████████  228
  24 ms | ████████████████████████████████████████  228
  25 ms | ████████████████████████████████████  205
  26 ms | ███████████████████████████  155
  27 ms | █████████████████████  122
  28 ms | ███████████████████  106
  29 ms | ███████████████  88
  30 ms | ███████████  64
  31 ms | ██████████████████  104
  32 ms | ██████████████████████████████  173
  33 ms | █████████████████████████████████  188
  34 ms | ███████████████████████████████████  200
  35 ms | ██████████████████████  126
  36 ms | ████████████████  93
  37 ms | ██████████████████  102
  38 ms | ████████████████████  113
  39 ms | ██████████████████  100
  40 ms | █████████████  75
  41 ms | █████████████  75
  42 ms | ███████████████  84
  43 ms | ██████████████████  101
  44 ms | ███████████████████████  130
  45 ms | █████████████████████  120
  46 ms | ███████████████████████  131
  47 ms | ██████████████████  103
  48 ms | ███████████████  84
  49 ms | ███████████  65
  50 ms | ████████████  68
  51 ms | ██████████  57
  52 ms | ██████████  56
  53 ms | ███████████  62
  54 ms | ███████████  61
  55 ms | ██████████████  80
  56 ms | ████████████  68
  57 ms | ██████████████  82
  58 ms | ████████  48
  59 ms | ████████  43
  60 ms | █████  31
  61 ms | █████  26
  62 ms | ███  17
  63 ms | █  7
  64 ms | █  6
  65 ms |   2
  67 ms |   2
  70 ms | █  3
  73 ms |   1
  75 ms |   1
  83 ms |   1
  85 ms |   1
  86 ms |   1
  93 ms |   1
1726 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `44.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `2.41`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.54`
- `fps_1pct_low` = `10.35`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `44.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195347 ms  |  Sample ticks: 3600

**FPS**  avg `27.52`, min `7.73`, p50 `19.61`, p95 `72.50`, p99 `134.35`, 1%low `8.24`, 0.1%low `7.86`, std `24.50`

**Frame time (ms)**  avg `59.80`, p50 `51.00`, p95 `108.21`, p99 `115.78`, p99.9 `125.10`, max `129.41`

**Client tick (ms)**  avg `0.75`, p95 `1.16`, max `4.21`

**Memory**  start `3098 MB`, end `3333 MB`, peak `3883 MB`, GC `201 events / 1050 ms`

**FPS over sampling window (ASCII):**

```
 47.2 |                           █        █                                           
 43.8 |    █        █   █    █    █  █     ██   █                                      
 40.5 |  ███        █ █ █   ████  █ ██ ██ ███████   ███                                
 37.1 |  ████████  ██ ███ ██████  █ ████████████████████                               
 33.7 | █████████████████████████ ██████████████████████                               
 30.3 |█████████████████████████████████████████████████                               
 26.9 |█████████████████████████████████████████████████                               
 23.5 |█████████████████████████████████████████████████                               
 20.1 |█████████████████████████████████████████████████                               
 16.8 |██████████████████████████████████████████████████                              
 13.4 |██████████████████████████████████████████████████                              
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  5
   6 ms | ███  16
   7 ms | ████  20
   8 ms | ███  16
   9 ms | ███████  33
  10 ms | ███  15
  11 ms | ████  21
  12 ms | ███  13
  13 ms | ███  13
  14 ms | ████  18
  15 ms | ███  17
  16 ms | ████  19
  17 ms | █████  23
  18 ms | ███████  34
  19 ms | █████████  44
  20 ms | ███████████  56
  21 ms | ██████████  51
  22 ms | █████████████  65
  23 ms | █████████████████  84
  24 ms | ███████████████████  94
  25 ms | ███████████████  74
  26 ms | ████████████  59
  27 ms | ██████████  51
  28 ms | ██████  29
  29 ms | ████  19
  30 ms | █████  23
  31 ms | █████  27
  32 ms | █████████  46
  33 ms | █████████  43
  34 ms | ███████  35
  35 ms | ██████  31
  36 ms | █████  26
  37 ms | █████  26
  38 ms | ████  18
  39 ms | ████████  38
  40 ms | ███  15
  41 ms | ███  13
  42 ms | ████  20
  43 ms | ██████  31
  44 ms | ████████  38
  45 ms | ███████  37
  46 ms | ███████  34
  47 ms | ████████  42
  48 ms | ██████  30
  49 ms | █████  23
  50 ms | ████  19
  51 ms | ███████  36
  52 ms | █████  25
  53 ms | █████  26
  54 ms | ████  22
  55 ms | █████████  43
  56 ms | ██████  28
  57 ms | ███████  37
  58 ms | ██████  29
  59 ms | █████  25
  60 ms | ███  17
  61 ms | █  6
  62 ms | ██  8
  63 ms | █  4
  64 ms | █  3
  65 ms |   1
  66 ms | █  3
  67 ms |   1
  68 ms | █  3
  69 ms |   1
  71 ms |   1
  72 ms | █  3
  73 ms |   2
  74 ms | █  3
  75 ms |   1
  77 ms | █  3
  78 ms |   1
  79 ms | █  3
  80 ms | █  3
  82 ms | █  3
  83 ms | █  4
  84 ms | █  4
  85 ms | ██  10
  86 ms | █  7
  87 ms | ███  13
  88 ms | ███  17
  89 ms | ███  15
  90 ms | ███  17
  91 ms | ████  18
  92 ms | █████  24
  93 ms | ██████  28
  94 ms | ███████  35
  95 ms | █████  26
  96 ms | ████████  40
  97 ms | ███████████  53
  98 ms | ██████████████████  87
  99 ms | ████████████████████████████████████████  198
 100 ms | █████████████████████████████████████  184
 101 ms | ██████████████████  89
 102 ms | ████████  42
 103 ms | ████  18
 104 ms | █████  24
 105 ms | ████  18
 106 ms | ████  18
 107 ms | ████  21
 108 ms | ███  16
 109 ms | ███  13
 110 ms | ███  17
 111 ms | ████  21
 112 ms | ████  20
 113 ms | ████  19
 114 ms | ██  11
 115 ms | █  7
 116 ms | █  4
 117 ms | █  5
 118 ms |   1
 119 ms |   2
 120 ms |   2
 121 ms |   1
 122 ms | █  3
 123 ms | █  4
 124 ms | █  4
 125 ms |   2
 126 ms |   1
 129 ms |   1
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
- `fps_0p1pct_low` = `7.86`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `16.72`
- `fps_1pct_low` = `8.24`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `15.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194295 ms  |  Sample ticks: 3600

**FPS**  avg `10.06`, min `7.61`, p50 `10.00`, p95 `11.60`, p99 `13.07`, 1%low `7.83`, 0.1%low `7.63`, std `0.86`

**Frame time (ms)**  avg `100.10`, p50 `99.97`, p95 `114.44`, p99 `125.68`, p99.9 `129.53`, max `131.46`

**Client tick (ms)**  avg `0.70`, p95 `1.24`, max `3.12`

**Memory**  start `3216 MB`, end `3396 MB`, peak `3881 MB`, GC `147 events / 691 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                   █                                            
 10.3 |                                   █                                            
 10.3 |                                   █                                            
 10.2 |               █                   █                                            
 10.2 |               █         █         █                █                           
 10.2 |   █    █ █ █  █         █         █       █        █          █             █  
 10.1 | █ █    █ ███ ███ █      █       █ █   █   █  █ █   █  █ █  █  █ █  █    █   █ █
 10.1 |██ ██   █ ███ ███ █   █  ███ █ █ █ █  ██ █ █  █ █   █  █ ██ █  █ █ ██   ██  ██ █
 10.0 |██ ██████ ███ █████ ████ ███ █████ █████ ███ ██ ███ ██ █ ██ ██ █ █ ████████ ██ █
 10.0 |██ ████████████████ ████ █████████ ████████████ ████████ █████ █ ██████████ ██ █
 10.0 |████████████████████████ ███████████████████████████████ ███████ ██████████ ██ █
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  66 ms |   1
  70 ms |   3
  71 ms |   2
  72 ms |   2
  74 ms | █  5
  75 ms | █  4
  76 ms | █  5
  77 ms |   3
  78 ms | █  4
  79 ms |   3
  80 ms | █  4
  81 ms | █  4
  82 ms | █  8
  83 ms | ██  14
  84 ms | ██  11
  85 ms | ██  15
  86 ms | ██  15
  87 ms | ███  23
  88 ms | ███  21
  89 ms | ███  23
  90 ms | ████  30
  91 ms | ████  26
  92 ms | █████  34
  93 ms | ███  25
  94 ms | ██████  44
  95 ms | ███████  53
  96 ms | ███████  51
  97 ms | ███████████  81
  98 ms | █████████████████  126
  99 ms | █████████████████████████████████████  271
 100 ms | ████████████████████████████████████████  292
 101 ms | ██████████████████  129
 102 ms | █████████  64
 103 ms | █████  39
 104 ms | ███  25
 105 ms | █████  33
 106 ms | ████  28
 107 ms | ██  16
 108 ms | ███  21
 109 ms | ████  26
 110 ms | ████  30
 111 ms | ████  32
 112 ms | ███  24
 113 ms | ███  25
 114 ms | ███  20
 115 ms | ███  19
 116 ms | ██  16
 117 ms |   2
 118 ms | █  5
 119 ms | █  4
 120 ms | █  4
 121 ms |   2
 122 ms |   3
 123 ms |   2
 124 ms | █  5
 125 ms | █  5
 126 ms | █  4
 127 ms | █  5
 128 ms |   3
 129 ms |   2
 130 ms |   1
 131 ms |   1
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
- `fps_0p1pct_low` = `7.63`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `7.83`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195258 ms  |  Sample ticks: 3600

**FPS**  avg `10.05`, min `7.45`, p50 `10.00`, p95 `11.46`, p99 `12.83`, 1%low `7.80`, 0.1%low `7.45`, std `0.83`

**Frame time (ms)**  avg `100.11`, p50 `99.97`, p95 `114.33`, p99 `125.67`, p99.9 `132.20`, max `134.32`

**Client tick (ms)**  avg `0.70`, p95 `1.18`, max `6.65`

**Memory**  start `2999 MB`, end `3878 MB`, peak `3883 MB`, GC `128 events / 561 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                              █                                 
 10.3 |                                              █                          █      
 10.2 |                                              █        █                 █      
 10.2 |                   █                          █        █                 █  █   
 10.2 |   ██            █ █     █  █     █           █        █                 █  ██  
 10.1 |   ██            █ █   █ █  █   █ ██          █     █  █        █        █  ███ 
 10.1 | █ ██   █ █  █   █ █   █ █  ██  █ ███    ████ █ ███ █ ██ █  █   ██ █  ██ ██ ████
 10.0 |██ ███ ████████  █ ██  █ █  █████ ███    ████ █ █████ ██ █████ ██████ ██ ██ ████
 10.0 |██ █████████████ █ █████ ██ █████ ██████ ████████████ ████████ █████████ ██ ████
  9.9 |████████████████ ████████████████ ██████████████████████████████████████ ███████
  9.9 |████████████████████████████████████████████████████████████████████████ ███████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  55 ms |   1
  64 ms |   1
  66 ms |   1
  68 ms |   2
  69 ms |   1
  70 ms |   2
  73 ms |   3
  75 ms |   1
  76 ms | █  4
  77 ms |   3
  78 ms |   1
  79 ms |   2
  80 ms | █  4
  81 ms | █  4
  82 ms | █  6
  83 ms | █  5
  84 ms | █  11
  85 ms | ██  12
  86 ms | ███  21
  87 ms | ███  22
  88 ms | ███  26
  89 ms | ██  17
  90 ms | ███  21
  91 ms | ███  21
  92 ms | █████  37
  93 ms | ████  34
  94 ms | ██████  50
  95 ms | ██████  45
  96 ms | ███████  57
  97 ms | ████████  67
  98 ms | ██████████████████  141
  99 ms | ████████████████████████████████████  287
 100 ms | ████████████████████████████████████████  318
 101 ms | ██████████████████  141
 102 ms | ██████████  78
 103 ms | ███████  58
 104 ms | ███  25
 105 ms | ██  19
 106 ms | ██  17
 107 ms | ██  17
 108 ms | █  11
 109 ms | ██  13
 110 ms | ██  19
 111 ms | ████  31
 112 ms | ██  19
 113 ms | ███  27
 114 ms | ██  14
 115 ms | █  8
 116 ms | █  11
 117 ms | █  4
 118 ms | █  4
 119 ms | █  5
 120 ms |   3
 121 ms | █  6
 122 ms | █  7
 123 ms | █  7
 124 ms | █  5
 125 ms | █  7
 126 ms |   3
 127 ms | █  5
 128 ms |   1
 130 ms |   2
 131 ms |   1
 134 ms |   2
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `68.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.45`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `7.80`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`

