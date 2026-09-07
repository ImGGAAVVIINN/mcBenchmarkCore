# FPS Test session — 2026-09-06T13:42:31.433194227+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 114.2 | 45.8 | 43.8 | 21.15 | 0.55 | 1 | 100 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 114.1 | 45.7 | 43.3 | 21.22 | 0.61 | 2 | 157 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.0 | 21.1 | 20.4 | 46.16 | 0.61 | 1 | 140 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.1 | 21.2 | 21.0 | 46.71 | 0.63 | 5 | 154 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.6 | 21.2 | 20.9 | 46.80 | 0.59 | 1 | 256 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 28.9 | 21.2 | 20.8 | 46.47 | 0.44 | 1 | 244 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 28.9 | 21.1 | 20.8 | 46.86 | 0.62 | 2 | 128 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 28.8 | 21.2 | 21.1 | 46.88 | 1.00 | 5 | 153 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 29.4 | 20.2 | 20.0 | 49.03 | 2.95 | 5 | 416 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 29.6 | 20.1 | 19.7 | 49.36 | 3.62 | 11 | 392 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 28.7 | 20.8 | 19.0 | 46.79 | 0.90 | 5 | 194 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 28.6 | 21.3 | 20.6 | 46.55 | 0.45 | 4 | 87 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 29.2 | 20.4 | 20.2 | 48.91 | 3.36 | 6 | 20 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 28.7 | 20.2 | 19.6 | 48.43 | 2.55 | 4 | 429 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 35.6 | 13.5 | 12.0 | 65.53 | 14.97 | 38 | 62 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 38.0 | 13.5 | 12.3 | 68.33 | 15.87 | 33 | 551 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 28.9 | 20.7 | 20.5 | 47.90 | 1.82 | 5 | 346 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 28.8 | 20.9 | 20.7 | 47.68 | 1.77 | 5 | 280 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 29.1 | 21.4 | 21.0 | 46.36 | 0.59 | 1 | 428 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 9.8 | 8.8 | n/a | 113.03 | 0.27 | 0 | 108 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 9.8 | 8.7 | n/a | 113.99 | 0.25 | 1 | 460 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 9.8 | 8.6 | n/a | 113.17 | 0.30 | 3 | 412 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 9.8 | 8.8 | n/a | 112.61 | 0.28 | 0 | 120 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 9.8 | 8.4 | n/a | 116.64 | 0.37 | 51 | 695 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 9.8 | 8.2 | n/a | 120.05 | 0.37 | 34 | 747 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 9.8 | 8.0 | n/a | 118.10 | 0.41 | 26 | 882 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 9.8 | 8.0 | n/a | 118.68 | 0.39 | 26 | 352 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 9.8 | 8.5 | n/a | 116.77 | 0.36 | 24 | 1079 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 9.8 | 8.5 | n/a | 114.22 | 0.34 | 25 | 339 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 9.9 | 8.5 | n/a | 116.55 | 0.43 | 21 | 1076 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 9.8 | 8.2 | n/a | 118.65 | 0.37 | 22 | 1228 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 9.8 | 8.3 | n/a | 118.43 | 0.42 | 20 | 835 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 9.8 | 8.1 | n/a | 121.59 | 0.33 | 23 | 196 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 9.8 | 8.2 | n/a | 119.41 | 0.35 | 23 | 402 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 9.8 | 8.1 | n/a | 117.75 | 0.30 | 16 | 1216 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 9.8 | 8.8 | n/a | 113.42 | 0.25 | 0 | 80 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 9.8 | 8.7 | n/a | 114.39 | 2.52 | 1 | 668 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 9.9 | 8.7 | n/a | 113.76 | 0.27 | 0 | 220 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 9.8 | 8.8 | n/a | 112.83 | 0.28 | 0 | 140 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 9.8 | 8.8 | n/a | 113.21 | 0.27 | 0 | 152 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 9.8 | 8.8 | n/a | 112.97 | 0.27 | 0 | 160 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 9.9 | 8.0 | 7.7 | 122.45 | 0.66 | 12 | 204 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 9.8 | 8.4 | 8.3 | 116.70 | 0.64 | 14 | 128 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 9.9 | 8.4 | 7.9 | 116.86 | 0.64 | 14 | 396 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 9.9 | 8.2 | 7.7 | 118.53 | 0.64 | 14 | 262 |

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

**FPS**  avg `114.23`, min `43.56`, p50 `118.43`, p95 `132.17`, p99 `151.11`, 1%low `45.81`, 0.1%low `43.78`, std `95.98`

**Frame time (ms)**  avg `10.25`, p50 `8.44`, p95 `17.99`, p99 `21.15`, p99.9 `22.65`, max `22.96`

**Client tick (ms)**  avg `0.55`, p95 `0.85`, max `1.38`

**Memory**  start `661 MB`, end `761 MB`, peak `761 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
189.2 |                                █                                               
181.4 |                                █                                  █            
173.5 |                                █                                  █            
165.7 |           █              █     █                                  █            
157.9 |           █              █     █    █                             █            
150.1 |      █    █ █            █     █    █                             █            
142.2 |      █    ███   █        █     █    █                             █         █  
134.4 | █    █    ███   █        █     █    █ █                      █    █         █  
126.6 | █    █    ███   █  █     █     █    █ █                      █    █         █  
118.8 |██    █    ███  ██  █     █     █    █ █                      █    █         █  
110.9 |██ █  █   ████  ██ ██ █ ███ █   █  █ █ █ █      █ █  █  ██  █ ██   █ █      ██ █
103.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   8
   1 ms |   8
   2 ms |   2
   3 ms |   1
   6 ms |   7
   7 ms | ██████████  273
   8 ms | ████████████████████████████████████████  1041
   9 ms | ███████  172
  10 ms |   1
  11 ms |   1
  13 ms |   8
  14 ms | █  36
  15 ms | ████  100
  16 ms | ████  97
  17 ms | ████  98
  18 ms | ██  40
  19 ms | █  14
  20 ms | █  19
  21 ms | █  16
  22 ms |   9
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `sculk_charge_pop` | 240 | 243 | 114.5 | 20.94 |
| `smoke` | 160 | 243 | 124.1 | 21.19 |
| `flame` | 160 | 243 | 115.3 | 20.48 |
| `dripping_water` | 240 | 243 | 121.8 | 22.17 |
| `dragon_breath` | 160 | 243 | 106.8 | 18.95 |
| `end_rod` | 240 | 243 | 105.7 | 20.61 |
| `portal` | 160 | 243 | 115.8 | 18.43 |
| `ALL_TOGETHER` | 1680 | 243 | 110.3 | 20.30 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `45.81`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `78.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `97.56`
- `fps_0p1pct_low` = `43.78`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `114.14`, min `42.87`, p50 `118.34`, p95 `132.30`, p99 `146.49`, 1%low `45.66`, 0.1%low `43.31`, std `90.87`

**Frame time (ms)**  avg `10.23`, p50 `8.45`, p95 `18.03`, p99 `21.22`, p99.9 `22.77`, max `23.33`

**Client tick (ms)**  avg `0.61`, p95 `0.92`, max `1.36`

**Memory**  start `615 MB`, end `772 MB`, peak `772 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
160.9 |                    ███                                               █         
155.6 |                    ███                                               █         
150.3 |                    ███                            █                  █         
145.0 |               █    ███                █           █        █         █    █ █  
139.6 |               █    ███                █           █        █         █    █ █  
134.3 |               █    ███           █   ██           █        █         █    █ █  
129.0 |          ██   █    ███           █   ██    █      █        █         █    █ █  
123.7 |          ██   █    ███           █  ███    █      █        █         █    █ █  
118.4 |          ██   █    ███           █  ███    █      █        █         █    █ █  
113.0 |          ██   █    ███         █ █  ███    █      █        █         █    ███  
107.7 | ████████ █████████ ██████ █ ██ ████ ████████ █ ██ ███████ ████ ████████ ███████
102.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   9
   1 ms |   9
   6 ms |   6
   7 ms | ███████████  288
   8 ms | ████████████████████████████████████████  1021
   9 ms | ███████  187
  10 ms |   1
  13 ms |   4
  14 ms | █  36
  15 ms | ████  100
  16 ms | ████  103
  17 ms | ████  92
  18 ms | ██  44
  19 ms | █  19
  20 ms |   11
  21 ms | █  20
  22 ms |   4
  23 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `45.66`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `43.31`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `97.75`
- `preload_duration_ms` = `108.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `27.98`, min `20.43`, p50 `29.46`, p95 `30.82`, p99 `46.38`, 1%low `21.13`, 0.1%low `20.43`, std `3.83`

**Frame time (ms)**  avg `36.37`, p50 `33.95`, p95 `44.16`, p99 `46.16`, p99.9 `48.42`, max `48.94`

**Client tick (ms)**  avg `0.61`, p95 `0.86`, max `1.36`

**Memory**  start `640 MB`, end `742 MB`, peak `780 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 31.0 |        █                                    █                                  
 30.6 |        █                      █        █    █                         █        
 30.2 |        █            █         █        █    █                         █        
 29.8 |        █            █         █        █    █                         █        
 29.3 |        █            █         █        █    █                         █        
 28.9 |        █            █         █  █     █    █                         █        
 28.5 |  █  █  █        █   █         █  █     █    █        █          █    ██  █ █   
 28.1 |█ █ ██ ██ █ ██   ██ ██ █ ██   █████ ██  █    █ █ ██ █████ █ ██ █ █  █ ██ ██ █ ██
 27.6 |█ █ ██ ██ █ ██ ███████ █ ██ ███████ ██ ██ █ ███████ █████ █ ██ █ ██ █ ██ ██ █ ██
 27.2 |█ ████ ██ █ ████████████ ██████████████████████████ ███████ ████ ██ ████ ████ ██
 26.8 |████████████████████████████████████████████████████████████████ ███████████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  2
  21 ms | █  4
  31 ms | █  2
  32 ms | ██████████████████████████████  119
  33 ms | ████████████████████████████████████████  157
  34 ms | ██████████████  54
  35 ms | █  2
  36 ms | █  3
  37 ms | █  5
  38 ms | ███  10
  39 ms | ███████  27
  40 ms | ████████  33
  41 ms | █████████  37
  42 ms | █████████  37
  43 ms | ██████  23
  44 ms | ███  13
  45 ms | ███  13
  46 ms | █  5
  47 ms |   1
  48 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.13`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.43`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.50`
- `preload_duration_ms` = `40.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `29.15`, min `21.02`, p50 `29.43`, p95 `45.31`, p99 `49.45`, 1%low `21.15`, 0.1%low `21.02`, std `5.54`

**Frame time (ms)**  avg `35.33`, p50 `33.98`, p95 `45.75`, p99 `46.71`, p99.9 `47.51`, max `47.57`

**Client tick (ms)**  avg `0.63`, p95 `0.81`, max `1.02`

**Memory**  start `647 MB`, end `455 MB`, peak `801 MB`, GC `5 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 32.1 |                                              █                  █      █       
 31.6 |          █                    █              █                  █      █       
 31.1 |          █               █    █              █                  █    █ █       
 30.6 |      █ █ █      █  █     █ █  █ █ ███        █                  ██   █ █      █
 30.1 |      █ █ ██     ██ █     █ █  █ █ ███  ██    ███       █   █    ██ ███ █ █    █
 29.6 |    █ █ █ ██     ██ █  █  █ █  █ █ ███  ██ █  ███       █   █    ██ ███ █ █    █
 29.1 |██  █ █ █ ████  ████████  █ █  ███ ███ ███ ██ ███       ██  ██   ██ ███ █ ██   █
 28.6 |███ █ █ █ ████  ███████████ ██ ███████ ███ ██ ████      ██ ███   ██████ █ ███ ██
 28.1 |███ █ █ █ ████ ███████████████ ███████ ███ ██ ████ █  █ ██ ███ █ ███████████████
 27.6 |█████ ███ ████ ███████████████████████████████████ ████ ██ ███ █ ███████████████
 27.1 |█████ ████████████████████████████████████████████ ████ ████████████████████████
 26.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  4
  20 ms | ███  11
  21 ms | ████  13
  22 ms | █  5
  23 ms |   1
  26 ms |   1
  28 ms |   1
  31 ms | ██  8
  32 ms | ███████████████████████████  99
  33 ms | ████████████████████████████████████████  145
  34 ms | ███████████████████████████  97
  35 ms | ████  14
  36 ms | ███  12
  37 ms | ██  9
  38 ms | ███  12
  39 ms | ████  13
  40 ms | ██████  20
  41 ms | ██  8
  42 ms | ████  14
  43 ms | ████  13
  44 ms | ██████  21
  45 ms | ███████  25
  46 ms | ████  15
  47 ms | █  5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.15`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.02`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.30`
- `preload_duration_ms` = `45.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `28.59`, min `20.88`, p50 `29.42`, p95 `30.85`, p99 `48.61`, 1%low `21.21`, 0.1%low `20.88`, std `4.76`

**Frame time (ms)**  avg `35.81`, p50 `33.99`, p95 `45.51`, p99 `46.80`, p99.9 `47.59`, max `47.90`

**Client tick (ms)**  avg `0.59`, p95 `0.80`, max `1.23`

**Memory**  start `546 MB`, end `695 MB`, peak `802 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                                                             █                  
 32.9 |             █                                               █                  
 32.1 |             █                                               █                  
 31.3 |             █                                               █                  
 30.6 | █         █ █       █                          █     ██  █  █                  
 29.8 | ██        █ █       ██           █ █    █ █    ██  █ ███ █  █           ██     
 29.0 | ██      █████ ██ █  ███          █ █    ███    ██  █████ █  █       █   ██  █  
 28.2 |███  ██████████████  ████ █   ██  █ ██  ███████████ ███████  █ █  █ ██ ████ ██ █
 27.5 |████████████████████ ██████ ████ ██████ ███████████████████  █ █  █ ████████████
 26.7 |███████████████████████████████████████████████████████████ ██ █ ███████████████
 25.9 |███████████████████████████████████████████████████████████ ██ █████████████████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  4
  20 ms | █  5
  21 ms | ███  10
  26 ms |   1
  32 ms | █████████████████████████████████  118
  33 ms | ████████████████████████████████████████  143
  34 ms | ████████████████████████  86
  35 ms | ███  9
  36 ms | ██  8
  37 ms | ████  13
  38 ms | █████  18
  39 ms | ██████  20
  40 ms | ████  14
  41 ms | ██████  20
  42 ms | ███  10
  43 ms | █████  19
  44 ms | █████  18
  45 ms | ██████  22
  46 ms | █████  17
  47 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.21`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.88`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.93`
- `preload_duration_ms` = `64.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `28.90`, min `20.82`, p50 `29.58`, p95 `30.70`, p99 `48.44`, 1%low `21.23`, 0.1%low `20.82`, std `4.56`

**Frame time (ms)**  avg `35.34`, p50 `33.81`, p95 `45.19`, p99 `46.47`, p99.9 `47.70`, max `48.03`

**Client tick (ms)**  avg `0.44`, p95 `0.56`, max `0.80`

**Memory**  start `545 MB`, end `549 MB`, peak `789 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |                               █                                                
 32.9 |                               █                                                
 32.2 |                               █                                                
 31.5 |                               █              █                  █              
 30.9 |                               █              █              █   █      █     █ 
 30.2 |   █            █        █     █         █    █ █       █   ██   ██     █     █ 
 29.5 |   █ █        ███ █      █     █         ███  █ ██      █   ████ ██  █  █   █ █ 
 28.8 | █ ███     █ ████ █    █████   █ ███  █  ███ ██ ████████████████ █████████  █ █ 
 28.2 | █ ███  █  ██████ ██ █ ██████  ████████ ████ ███████████████████ ██████████████ 
 27.5 | █████ ███████████████████████ █████████████████████████████████████████████████
 26.8 | █████ ███████████████████████ █████████████████████████████████████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   1
  20 ms | ██  9
  21 ms | █  8
  28 ms |   1
  31 ms |   1
  32 ms | █████████████████  96
  33 ms | ████████████████████████████████████████  229
  34 ms | ██████████  56
  35 ms | ██  14
  36 ms | ██  13
  37 ms | █  6
  38 ms | ██  12
  39 ms | ██  11
  40 ms | ███  17
  41 ms | ███  15
  42 ms | ██  9
  43 ms | ██  14
  44 ms | ███  18
  45 ms | ████  23
  46 ms | ██  10
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.23`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.82`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.30`
- `preload_duration_ms` = `44.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `28.93`, min `20.79`, p50 `29.47`, p95 `31.18`, p99 `49.45`, 1%low `21.11`, 0.1%low `20.79`, std `5.26`

**Frame time (ms)**  avg `35.50`, p50 `33.93`, p95 `45.64`, p99 `46.86`, p99.9 `47.71`, max `48.10`

**Client tick (ms)**  avg `0.62`, p95 `0.87`, max `1.18`

**Memory**  start `641 MB`, end `467 MB`, peak `770 MB`, GC `2 events / 5 ms`

**FPS over sampling window (ASCII):**

```
 33.6 |                                                                             █  
 32.9 |                                                                             █  
 32.2 |                              █                                       █      █  
 31.5 |                  █           █               █ █      █              █ ██   █  
 30.8 |                  █  █        █   ██ █        █ █      █ █        █   █ ██   █  
 30.2 |               █  █  █     █  ██ ███ █        █ █      ███        █   █ ██   █  
 29.5 |        █ █    █ ███ █     █  ██ ███ █ █   █  █ █      ███     █  █   █ ██   █  
 28.8 |█ █  █  █ █    ███████████ ██ ██████ █ █ █ ██ █ ██████ ███   █ █  ██  █ ██ █ ███
 28.1 |█ █ ███ █████ ██████████████████████ ███ █ ████████████████  █ █ ████ █ ████ ███
 27.4 |█ █ █████████ █████████████████████████████████████████████ ██ ██████ █ ████████
 26.7 |█ ████████████████████████████████████████████████████████████ █████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  4
  20 ms | ███  13
  21 ms | ██  9
  22 ms |   1
  31 ms |   1
  32 ms | ██████████████████████████████  115
  33 ms | ████████████████████████████████████████  152
  34 ms | ██████████████████████  82
  35 ms | ███  11
  36 ms | ███  12
  37 ms | ███  13
  38 ms | ██████  22
  39 ms | ████  16
  40 ms | ███  10
  41 ms | ███  11
  42 ms | ████  14
  43 ms | ████  14
  44 ms | ███  11
  45 ms | █████████  34
  46 ms | ███  13
  47 ms | █  4
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.11`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.79`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.17`
- `preload_duration_ms` = `39.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `28.76`, min `21.15`, p50 `29.04`, p95 `46.09`, p99 `49.63`, 1%low `21.25`, 0.1%low `21.15`, std `6.07`

**Frame time (ms)**  avg `36.02`, p50 `34.43`, p95 `45.93`, p99 `46.88`, p99.9 `47.25`, max `47.28`

**Client tick (ms)**  avg `1.00`, p95 `1.19`, max `1.47`

**Memory**  start `661 MB`, end `541 MB`, peak `814 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                                                                       █        
 33.1 |                                                                       █  █  █  
 32.3 |                                                                       █  █  █  
 31.5 |            █                █ █          █           █          █     █  █  █  
 30.6 |     █    █ █   ███  ██    █ █ █          █    █   █  █         ██     █  █  █  
 29.8 |     █    █ █   ███  ████  ███ █          █ █  █   ██ █         ██ █   █  █  █  
 28.9 |█ █  █    █ █   ████ █████ ██████      █ ██ █ ██   ████         ████  ███ █  ██ 
 28.1 |█ █████  ████████████████████████ █ ██ ████ ████ █ █████  ███ ███████████ █  ██ 
 27.3 |█ ██████████████████████████████████████████████ █ ██████████ ███████████ █ ███ 
 26.4 |████████████████████████████████████████████████ ███████████████████████████████
 25.6 |████████████████████████████████████████████████ ███████████████████████████████
 24.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | ██  5
  20 ms | █████  13
  21 ms | █████  14
  22 ms | ██  5
  23 ms |   1
  26 ms |   1
  27 ms |   1
  29 ms |   1
  31 ms | ███  7
  32 ms | ████████████████████████████████████████  102
  33 ms | ██████████████████████████████████  86
  34 ms | ███████████████████████████████████  89
  35 ms | ████  11
  36 ms | █████  13
  37 ms | ███████  17
  38 ms | ███████  17
  39 ms | █████  13
  40 ms | ████████  20
  41 ms | ███████  18
  42 ms | ███████  18
  43 ms | █████████  22
  44 ms | █████████████  32
  45 ms | █████████  23
  46 ms | █████████  23
  47 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.25`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.15`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.76`
- `preload_duration_ms` = `45.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `29.40`, min `19.95`, p50 `29.08`, p95 `44.14`, p99 `56.35`, 1%low `20.16`, 0.1%low `19.95`, std `6.36`

**Frame time (ms)**  avg `35.32`, p50 `34.39`, p95 `47.21`, p99 `49.03`, p99.9 `49.94`, max `50.12`

**Client tick (ms)**  avg `2.95`, p95 `3.64`, max `4.25`

**Memory**  start `429 MB`, end `698 MB`, peak `846 MB`, GC `5 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |           █                                                                    
 32.2 |           █                     █ █                   █     █                  
 31.7 |    █      █     █  █            █ █          █        █     █                  
 31.1 |    ██     █ █ █ █  █  █         █ █          █      █ █     █      █        █ █
 30.6 |    ███    █ ███ █  █  █         █ █ █    █ █ █      █ █     █      █        █ █
 30.0 |█   ███    █ ███ ██ █  ██        █ █ █    █ █ █     ██ █ █ █ █ █    ██       █ █
 29.5 |█   ███    █ ███ ████████      █ █ █ █    █ █ █ █   ██ █ █ █ █ █  █ ██       █ █
 28.9 |█ █ ██████ █ ███ ████████   █  █ █ █ █ █ ██ █ █ ███ ██ █ █ ████████████ ██████ █
 28.4 |███ ██████ █ ████████████ ███  █ █ █ █ ████ ██████████ █ █████████████████████ █
 27.8 |███ █████████████████████ ███  █ █ █ █ ███████████████ ███████████████████████ █
 27.3 |█████████████████████████████ ██ █ █████████████████████████████████████████████
 26.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  17 ms | ██  6
  18 ms |   1
  19 ms | ██  6
  20 ms | ██  5
  21 ms | ███  7
  22 ms | ██  4
  23 ms | █  2
  24 ms |   1
  29 ms | ████████  20
  30 ms | ██████████████████████████████████████  96
  31 ms | ████  11
  32 ms | ███████  19
  33 ms | ██████████████████████████████████████  96
  34 ms | ████████  20
  35 ms | ███████  18
  36 ms | ████████████████████████████████████████  102
  37 ms | ██████  16
  38 ms | █████  12
  39 ms | ████  9
  40 ms | ██  4
  41 ms | ████  10
  42 ms | ████  11
  43 ms | █████  12
  44 ms | █████  12
  45 ms | ████████  20
  46 ms | ██████  15
  47 ms | ████  9
  48 ms | █████  14
  49 ms | ██  6
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.16`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.95`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.31`
- `preload_duration_ms` = `43.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `29.64`, min `19.73`, p50 `27.09`, p95 `49.95`, p99 `58.01`, 1%low `20.07`, 0.1%low `19.73`, std `8.75`

**Frame time (ms)**  avg `36.03`, p50 `36.91`, p95 `47.00`, p99 `49.36`, p99.9 `50.26`, max `50.68`

**Client tick (ms)**  avg `3.62`, p95 `5.06`, max `6.16`

**Memory**  start `473 MB`, end `438 MB`, peak `865 MB`, GC `11 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |                        █                                                       
 33.8 |          █ █ █    █    █ █     █       █                                       
 32.8 |          █ █ █    █    █ █     █   █   █     █          █  █  █                
 31.8 |       █  █ █ █ ██ █    █ █ █   █   █   █     ██  █      █  █  █    █    █      
 30.8 |   █   ██ █ █ █ ██ █    █ █ █   █   █   █     ██  █  █   █  █  ██   █   ██  █   
 29.8 | █ █   ██ ███ █ ██ █    █ █ █   █  ██   █ ██  ██ ██  █   ██ █  ██   ██ ███  █   
 28.9 | ███   ██ ███ █ ██ █ █  ███ █  ██  ███  █ ██  ██ ███████ ██ █  ██   ██████  ███ 
 27.9 |███████████████ ██ ███  ███ ██ ██  ██████ ██  ██ █████████████ ████ ███████████ 
 26.9 |███████████████ ████████████████████████████████████████████████████████████████
 25.9 |███████████████ ████████████████████████████████████████████████████████████████
 24.9 |███████████████ ████████████████████████████████████████████████████████████████
 23.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | ██  2
  16 ms | ███  3
  17 ms | █████████  8
  18 ms | ████████  7
  19 ms | █████████  8
  20 ms | ████████  7
  21 ms | █████████████  12
  22 ms | ████████  7
  23 ms | █████████  8
  24 ms | ███████████  10
  25 ms | ████████  7
  26 ms | ███  3
  27 ms | █  1
  28 ms | ██████████████████  17
  29 ms | █████████████████████  19
  30 ms | █████████████████████████  23
  31 ms | ██████████████████  17
  32 ms | ██████████████  13
  33 ms | ████████████████████████████████████████  37
  34 ms | ██████████████████████  20
  35 ms | █████████████████████████████  27
  36 ms | █████████████████████████  23
  37 ms | ██████████████████████████████  28
  38 ms | ██████████████████████████████  28
  39 ms | █████████████████████  19
  40 ms | ███████████████████████  21
  41 ms | ████████████████████████████████  30
  42 ms | █████████████████████  19
  43 ms | █████████████████████████  23
  44 ms | █████████████████████████████  27
  45 ms | ███████████████████████████████  29
  46 ms | ██████████████████████████  24
  47 ms | ██████████  9
  48 ms | ████████████  11
  49 ms | ████████  7
  50 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_0p1pct_low` = `19.73`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `27.75`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `20.07`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `28.68`, min `19.02`, p50 `29.07`, p95 `46.28`, p99 `50.02`, 1%low `20.78`, 0.1%low `19.02`, std `6.68`

**Frame time (ms)**  avg `36.31`, p50 `34.39`, p95 `45.82`, p99 `46.79`, p99.9 `49.85`, max `52.58`

**Client tick (ms)**  avg `0.90`, p95 `1.09`, max `2.11`

**Memory**  start `671 MB`, end `609 MB`, peak `865 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 36.8 |              █                                                                 
 35.8 |              █                                                                 
 34.7 |              █                                                                 
 33.6 |              █                                                █           █    
 32.6 | █         █  █                                       █        █           █    
 31.5 | █         █  █     █                                 █        █           █    
 30.4 | █    █    █  █ █   █ █       █   █  █                █        █         █ █    
 29.4 | ██ ███    ████ █   ███      ██  ███ █       █ ███    █ █   █  █         █ █ █  
 28.3 | ██ ███ █  ████████ ███ █ █████████████ ███ ███████   █ █████  █   ██  █ █ ███ █
 27.2 | █████████ ████████████████████████████████████████████ ████████████████ █ █████
 26.2 | ██████████████████████████████████████████████████████ ████████████████ █ █████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms |   1
  19 ms | ██  5
  20 ms | ██████  16
  21 ms | █████  13
  22 ms | ██  6
  23 ms | █  3
  31 ms | ██  6
  32 ms | ███████████████████████████████  81
  33 ms | ████████████████████████████████████████  103
  34 ms | ██████████████████████████  68
  35 ms | ███  9
  36 ms | ███  7
  37 ms | ███████  17
  38 ms | █████████  22
  39 ms | ████████  21
  40 ms | ██████████  26
  41 ms | ██████  15
  42 ms | █████  14
  43 ms | ██████████  25
  44 ms | ████████████  30
  45 ms | ████████████████  40
  46 ms | ███████  18
  47 ms | █  3
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `19.02`
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
- `preload_duration_ms` = `101.00`
- `fps_1pct_low` = `20.78`
- `fps_harmonic_avg` = `27.54`
- `preset_full` = `0.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `28.57`, min `20.63`, p50 `29.54`, p95 `44.54`, p99 `48.72`, 1%low `21.28`, 0.1%low `20.63`, std `5.45`

**Frame time (ms)**  avg `36.03`, p50 `33.86`, p95 `45.63`, p99 `46.55`, p99.9 `47.56`, max `48.47`

**Client tick (ms)**  avg `0.45`, p95 `0.60`, max `0.70`

**Memory**  start `768 MB`, end `803 MB`, peak `856 MB`, GC `4 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |           █                                                                    
 32.9 |           █                                         █                          
 31.9 |   █       █                             █      █  █ █          █        █ █    
 30.9 |   █  █    █           ██         █    █ █      █  █ █  █       █        █ █    
 29.9 |   █  █    █           ██         █    █ ██     █  █ █  ██   █  █    █   █ █    
 28.9 |   █  █    █      █    ███        █    ████ █████  █ ██ ███ ██  █    █   ███  █ 
 27.9 |██ ████   ████ ████ ██ ████████   ██  ████████████ █ █████████  ████████ ███████
 26.9 |████████ █████████████ █████████████████████████████ █████████ █████████████████
 25.8 |██████████████████████ █████████████████████████████ ███████████████████████████
 24.8 |████████████████████████████████████████████████████ ███████████████████████████
 23.8 |████████████████████████████████████████████████████ ███████████████████████████
 22.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  20 ms | ██  13
  21 ms | ██  12
  22 ms | █  3
  32 ms | ████████  46
  33 ms | ████████████████████████████████████████  227
  34 ms | ██████  32
  35 ms | ██  14
  36 ms | █  6
  37 ms | ██  14
  38 ms | ████  21
  39 ms | ██  13
  40 ms | █████  30
  41 ms | ███  17
  42 ms | ████  23
  43 ms | ███  17
  44 ms | ████  21
  45 ms | █████  29
  46 ms | ███  15
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `20.63`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `27.75`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `21.28`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `29.18`, min `20.24`, p50 `27.33`, p95 `48.11`, p99 `57.67`, 1%low `20.37`, 0.1%low `20.24`, std `8.08`

**Frame time (ms)**  avg `36.31`, p50 `36.60`, p95 `47.13`, p99 `48.91`, p99.9 `49.28`, max `49.40`

**Client tick (ms)**  avg `3.36`, p95 `5.19`, max `11.10`

**Memory**  start `890 MB`, end `510 MB`, peak `910 MB`, GC `6 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |           █                                             █                      
 33.7 |           █                   █          █    █  █      █                    █ 
 32.7 |           █    █       █      █   █      █    █  █      █                    █ 
 31.8 |     █     █  █ █    █  █      █   █      █    █  █   █  █               ██ █ █ 
 30.8 |     ██    █  █ ██   █  █      █   █      █    █  █   █  █          █    ██ █ █ 
 29.8 | █   ██    █  █ ██ █ █  █ █    █ █ █ █ █  █    █  █   █  ██ █      ██    ██ █ ██
 28.8 | █   ██  ███  █ ██ ███ ██ ██ ███ █ ███ █  ████ ██ █  ███ ██ █ █  █ ███ ██████ ██
 27.9 |██  ███ ████ ██ ██████ ██ ██████ █ █████ █████ ██ ██ ███ ██ ████ ████████████ ██
 26.9 |████████████ ████████████████████████████████████████████████████████████████ ██
 25.9 |████████████ ████████████████████████████████████████████████████████████████ ██
 24.9 |█████████████████████████████████████████████████████████████████████████████ ██
 23.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | ██  2
  17 ms | █████  6
  18 ms | █████  6
  19 ms | ███████  9
  20 ms | ████████  10
  21 ms | ████████  10
  22 ms | ████  5
  23 ms | ██████  8
  24 ms | ██  2
  25 ms | ███  4
  26 ms | █  1
  27 ms | ██  2
  28 ms | █████  7
  29 ms | ██████████  13
  30 ms | ███████████████████████████████  39
  31 ms | ███████████████████  24
  32 ms | ██████████  13
  33 ms | ████████████████████████████████████████  51
  34 ms | █████  7
  35 ms | █████████████████████  27
  36 ms | ████████████████████████████████████  46
  37 ms | ████████████████████  25
  38 ms | ███████████████████████  29
  39 ms | ███████████  14
  40 ms | ███████████  14
  41 ms | ██████████████  18
  42 ms | ████████████████████  26
  43 ms | ███████████████████  24
  44 ms | █████████████████████████  32
  45 ms | ███████████████████████  29
  46 ms | ███████████████  19
  47 ms | ████████  10
  48 ms | ████████████  15
  49 ms | ███  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.54`
- `fps_1pct_low` = `20.37`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
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
- `fps_0p1pct_low` = `20.24`
- `preset_long` = `0.00`
- `preload_duration_ms` = `87.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `28.71`, min `19.58`, p50 `28.12`, p95 `44.46`, p99 `52.26`, 1%low `20.21`, 0.1%low `19.58`, std `6.21`

**Frame time (ms)**  avg `36.14`, p50 `35.56`, p95 `46.19`, p99 `48.43`, p99.9 `50.47`, max `51.07`

**Client tick (ms)**  avg `2.55`, p95 `4.35`, max `6.41`

**Memory**  start `460 MB`, end `849 MB`, peak `890 MB`, GC `4 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 33.8 |                                  █                                             
 33.1 |                                  █                                           █ 
 32.5 |                        █         █                         █                 █ 
 31.8 |                        █         █                      █  █                 █ 
 31.1 |      █                 █         █              █       █  █               █ █ 
 30.5 |█     █                 █     ██  █     █        █   █   █  █     █         █ █ 
 29.8 |█     █   ██            █   █ ██  █     █        █   █   █  █     █   █     █ █ 
 29.1 |█ █  ██  ███ █          █   ████  ██    █   █ █  █   █  ██  ██    █   ██    █ ██
 28.5 |█ █ ████ ███ █ ██   █   █   ████  ██    █ █ ███ ██ ███ ███ ███ █  █   ████ █████
 27.8 |███ ████ █████ ███ ██ █ █ ██████  ████  ███ ███ ██ ███████ ██████ ███ ██████████
 27.1 |███████████████████████ ████████  ███████████████████████████████ ██████████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  18 ms | ██  4
  19 ms | ████  7
  20 ms | ██  4
  21 ms | ████  8
  22 ms | ███  5
  23 ms | █  2
  24 ms | █  1
  25 ms | █  1
  26 ms | █  1
  28 ms | █  2
  29 ms | ██████████  18
  30 ms | ██████████████  26
  31 ms | █████████████████████████  47
  32 ms | ███████████████  27
  33 ms | ████████████████████████████████████████  74
  34 ms | █████████████  24
  35 ms | █████████████████████████████  54
  36 ms | █████████████████  31
  37 ms | █████████  17
  38 ms | ███████████  20
  39 ms | █████████████  24
  40 ms | ██████████  19
  41 ms | ████████  15
  42 ms | ██████████  19
  43 ms | ████████████  22
  44 ms | █████████████████  32
  45 ms | █████████  17
  46 ms | ████████  14
  47 ms | █████  9
  48 ms | ██  4
  49 ms | ██  3
  51 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.67`
- `fps_1pct_low` = `20.21`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.69`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `19.58`
- `preset_long` = `0.00`
- `preload_duration_ms` = `33.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `35.60`, min `12.01`, p50 `25.62`, p95 `92.71`, p99 `161.98`, 1%low `13.48`, 0.1%low `12.01`, std `27.25`

**Frame time (ms)**  avg `36.83`, p50 `39.03`, p95 `58.73`, p99 `65.53`, p99.9 `79.77`, max `83.29`

**Client tick (ms)**  avg `14.97`, p95 `20.79`, max `28.22`

**Memory**  start `889 MB`, end `641 MB`, peak `951 MB`, GC `38 events / 118 ms`

**FPS over sampling window (ASCII):**

```
 77.7 |                                         █                                      
 72.9 |                                         █                                      
 68.1 |                                         █                                      
 63.3 |                                         █       █            █                 
 58.5 |                                         █       █            █                 
 53.6 |                                         █      ██            █                 
 48.8 |        █               █                █      ██            █                 
 44.0 |  █ █  ███         █ █  █    █    █      █     ███  █    █    █       █    █    
 39.2 |  █ █ ████  ██     █ █  █ █  █  █ █ ██ █ ██    ███  █   ██    █    █  █ █  █    
 34.4 |█ █ █ █████ ████ █ █ █  █ █  ██ ███ ██ █ █████ ███ ██  ████ █ █  █ ██ ███  █    
 29.6 |██████████████████████ █████ ███████████ ██████████████████████ ████████████████
 24.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | ████████  5
   6 ms | ███  2
   7 ms | █████████  6
   8 ms | ████████  5
   9 ms | ███████████  7
  10 ms | █████  3
  11 ms | █████████  6
  12 ms | █████████  6
  14 ms | █████████  6
  15 ms | █████  3
  16 ms | █████████  6
  17 ms | ████████  5
  18 ms | ███████████████████████  15
  19 ms | ████████████  8
  20 ms | ██████████████  9
  21 ms | ███████████  7
  22 ms | ███████████  7
  23 ms | ███████████████  10
  24 ms | ██████████████████  12
  25 ms | ██████████████  9
  26 ms | ████████████  8
  27 ms | ██████████████  9
  28 ms | █████████  6
  29 ms | ██████████████  9
  30 ms | ███████████████  10
  31 ms | █████  3
  32 ms | ███████████  7
  33 ms | ██████████████████████████████████  22
  34 ms | ████████████████████  13
  35 ms | █████████████████  11
  36 ms | ███████████  7
  37 ms | ██████████████████  12
  38 ms | ██████████████████████████  17
  39 ms | ██████████████████████████████████  22
  40 ms | ████████████████████████████████████████  26
  41 ms | █████████████████  11
  42 ms | ████████████████████  13
  43 ms | █████████████████████████████  19
  44 ms | ████████████████████████████████  21
  45 ms | ███████████████████████  15
  46 ms | █████████████████████████  16
  47 ms | █████████████████  11
  48 ms | ███████████████████████  15
  49 ms | ███████████████  10
  50 ms | ███████████  7
  51 ms | █████████  6
  52 ms | ████████  5
  53 ms | ██████████████████████████  17
  54 ms | █████████  6
  55 ms | █████████  6
  56 ms | █████████████████  11
  57 ms | █████████  6
  58 ms | ███  2
  59 ms | ██████████████  9
  60 ms | ███  2
  61 ms | ███  2
  62 ms | ███  2
  63 ms | ██████  4
  64 ms | ███  2
  66 ms | ██  1
  67 ms | ██  1
  68 ms | ██  1
  75 ms | ██  1
  76 ms | ██  1
  83 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.48`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `35.00`
- `falling_blocks_landed` = `21210.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.15`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.01`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4799.01`
- `falling_blocks_alive_max` = `6400.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `38.00`, min `12.30`, p50 `28.10`, p95 `99.53`, p99 `141.24`, 1%low `13.45`, 0.1%low `12.30`, std `35.36`

**Frame time (ms)**  avg `35.79`, p50 `35.59`, p95 `59.00`, p99 `68.33`, p99.9 `78.55`, max `81.30`

**Client tick (ms)**  avg `15.87`, p95 `22.29`, max `28.39`

**Memory**  start `459 MB`, end `763 MB`, peak `1011 MB`, GC `33 events / 105 ms`

**FPS over sampling window (ASCII):**

```
135.3 |                                                                █               
125.1 |                                                                █               
114.9 |                                                                █               
104.8 |                                                                █               
 94.6 |                                                                █               
 84.4 |                                                                █               
 74.3 |                                                                █               
 64.1 |                                     █                          █               
 53.9 |                       █    █      █ █     █       █     █    █ █               
 43.8 |█       █ █ █ ███ ███ ██    █ █  ███ █     █ █   █ █    ██    █ ██  █  █     █  
 33.6 |████  ███ ███████████████████ ██████████ ████████████████████ █████ ██████ █████
 23.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  1
   4 ms | ██  1
   5 ms | ██  1
   6 ms | ████  2
   7 ms | ███████████████  8
   8 ms | ███████████  6
   9 ms | █████████████  7
  10 ms | ████████████████████  11
  11 ms | ███████████  6
  12 ms | ███████████  6
  13 ms | ███████████████  8
  14 ms | █████  3
  15 ms | █████  3
  16 ms | █████████  5
  17 ms | █████████████████████████  14
  18 ms | ███████████████████████████  15
  19 ms | ███████████  6
  20 ms | █████████  5
  21 ms | ███████████  6
  22 ms | █████████████  7
  23 ms | ████████████████  9
  24 ms | ███████████  6
  25 ms | ███████████████████████████  15
  26 ms | ███████████  6
  27 ms | ████████████████████████  13
  28 ms | █████████████████████████████  16
  29 ms | ██████████████████████  12
  30 ms | ████████████████████████  13
  31 ms | ███████████████  8
  32 ms | ███████████████████████████  15
  33 ms | █████████████████████████████████  18
  34 ms | █████████████████████████████████  18
  35 ms | ██████████████████████  12
  36 ms | ███████████████  8
  37 ms | ████████████████████  11
  38 ms | ████████████████████████  13
  39 ms | ████████████████████████████████████████  22
  40 ms | ████████████████  9
  41 ms | ████████████████  9
  42 ms | █████████████  7
  43 ms | ████████████████████████████████████  20
  44 ms | ██████████████████████  12
  45 ms | ████████████████████████  13
  46 ms | ██████████████████  10
  47 ms | ████████████████  9
  48 ms | ██████████████████████  12
  49 ms | █████████████████████████████  16
  50 ms | ██████████████████  10
  51 ms | ████████████████████  11
  52 ms | █████  3
  53 ms | ██████████████████████  12
  54 ms | ████████████████████████  13
  55 ms | ██████████████████  10
  56 ms | ███████████████  8
  57 ms | █████████  5
  58 ms | █████████  5
  59 ms | ███████████  6
  60 ms | █████████  5
  61 ms | ███████  4
  62 ms | ██  1
  63 ms | ██  1
  64 ms | ██  1
  65 ms | █████  3
  67 ms | ██  1
  69 ms | ██  1
  71 ms | ██  1
  73 ms | ████  2
  76 ms | ██  1
  81 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.45`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `74.00`
- `falling_blocks_landed` = `22355.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.94`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.30`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4807.75`
- `falling_blocks_alive_max` = `6400.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `28.92`, min `20.47`, p50 `28.75`, p95 `45.71`, p99 `52.57`, 1%low `20.71`, 0.1%low `20.47`, std `6.06`

**Frame time (ms)**  avg `35.79`, p50 `34.78`, p95 `45.83`, p99 `47.90`, p99.9 `48.56`, max `48.84`

**Client tick (ms)**  avg `1.82`, p95 `2.49`, max `9.44`

**Memory**  start `686 MB`, end `416 MB`, peak `1032 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 34.2 |                 █                █                                             
 33.4 |                 █                █                                             
 32.6 |                 █      █         █                  █ █                        
 31.7 |                 █  █   █ █       █    █     █       █ █                        
 30.9 |         █     █ █  █   █ █       █  █ █     █       █ █     █                  
 30.1 |   █     █  █ ██ █  █   █ █ █ █   █  █ █     █       █ ███   █   █  █    █  █   
 29.3 |   █   █ █  ████ █  █  ████ ███   █  █ █   █ █    █  █████   █   ██ █  █ █  █   
 28.5 | █ █ █ █████████ ██ █  ████ ███  ██  █ ██  █ ██ ███████████████  ████ ████  █  █
 27.7 |██ ███ █████████ ██ ██ ████████  ███████████ ███████████████████ ████████████  █
 26.9 |████████████████ ███████████████████████████ ███████████████████ ███████████████
 26.1 |████████████████████████████████████████████████████████████████ ███████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | ██  6
  19 ms | ███  7
  20 ms | ███  8
  21 ms | ███  8
  23 ms | █  3
  25 ms |   1
  28 ms |   1
  30 ms | ██████  14
  31 ms | ██████████████████████████████  74
  32 ms | █████████████  31
  33 ms | ████████████████████████████████████████  99
  34 ms | ████████████████  40
  35 ms | ███████████████████████████  68
  36 ms | ████  11
  37 ms | ████  9
  38 ms | ██████  16
  39 ms | ██████  16
  40 ms | █████  13
  41 ms | ██████████  25
  42 ms | ████████  21
  43 ms | ████████  20
  44 ms | ████████  19
  45 ms | ██████████  25
  46 ms | ████  10
  47 ms | ████  9
  48 ms | ██  5
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `20.71`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `0.00`
- `falling_blocks_landed` = `3724.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.94`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `20.47`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.61`
- `falling_blocks_alive_max` = `882.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `28.78`, min `20.70`, p50 `29.19`, p95 `32.54`, p99 `50.51`, 1%low `20.86`, 0.1%low `20.70`, std `5.38`

**Frame time (ms)**  avg `35.76`, p50 `34.26`, p95 `45.62`, p99 `47.68`, p99.9 `48.31`, max `48.32`

**Client tick (ms)**  avg `1.77`, p95 `2.36`, max `2.87`

**Memory**  start `737 MB`, end `550 MB`, peak `1017 MB`, GC `5 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 32.5 |                                         █  █                                   
 31.9 |         █     █                         █  █          ██                       
 31.4 |         █     █ █                     █ █  █          ██                       
 30.8 | █    █  █     █ █          █          █ █  █          ██                       
 30.3 | █    █  █ █   ███          █        █ ███  █   █      ██                       
 29.7 | █    ██ █ █   ███ █   █    █        █ ███  █   █ █    ██  █ █                ██
 29.2 |██    ██ █ █   █████  ██    █       ██ ████ █ █ █ ███  ███ █ ██               ██
 28.6 |██    ██ █ █   █████████    █   ██████ ████ █████ ███ ██████ ██   █ █  █ █  █ ██
 28.1 |██ █ ███ ███ █ ██████████  ██  ███████ ████ █████ ██████████ ██   █ █  █ █  █ ██
 27.5 |████ ███ ███ █ ██████████  ██ █████████████ ███████████████████   ███  ███  ████
 27.0 |████████ ██████████████████████████████████████████████████████ █ ██████████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms | █  2
  19 ms | █  4
  20 ms | ██  7
  21 ms | █  4
  22 ms | ██  5
  23 ms |   1
  30 ms | ███  8
  31 ms | █████████████████████████████  89
  32 ms | █████████  28
  33 ms | ████████████████████████████████████████  121
  34 ms | █████████  28
  35 ms | ███████████████████████  70
  36 ms | █████  15
  37 ms | ████  12
  38 ms | ████  13
  39 ms | ██████  19
  40 ms | █████  14
  41 ms | █████  16
  42 ms | ███████  22
  43 ms | █████  14
  44 ms | ██████  19
  45 ms | ███████  22
  46 ms | ████  12
  47 ms | ████  11
  48 ms | █  2
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `20.86`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `32.00`
- `falling_blocks_landed` = `3920.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.96`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `20.70`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `620.32`
- `falling_blocks_alive_max` = `833.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `29.12`, min `21.00`, p50 `29.66`, p95 `31.07`, p99 `49.21`, 1%low `21.36`, 0.1%low `21.00`, std `4.58`

**Frame time (ms)**  avg `35.07`, p50 `33.71`, p95 `45.04`, p99 `46.36`, p99.9 `47.46`, max `47.63`

**Client tick (ms)**  avg `0.59`, p95 `0.73`, max `6.51`

**Memory**  start `586 MB`, end `513 MB`, peak `1014 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 32.3 |                                  █                                             
 31.7 |                         █        █          █                                  
 31.2 |  █                      █      █ █          █          █           █           
 30.7 |█ █                 █    █      █ █     █ █  █  █    █  ██          █       █   
 30.1 |█ █                 █    ██     █ █     █ █  █  █    ██ ██      █   █      ██   
 29.6 |█ █                 █  █ ██     █ █     █ ██ █  █    ██ ██  █   █  ██      ██ █ 
 29.1 |█ █       █     █   ████ ██ █   █ █ █   ████ ██ ███████ ██████  ███████ █ █████ 
 28.5 |█ █ █  █ ██     ██ █████ ██████ █ ██████████ ██████████ ███████████████████████ 
 28.0 |███ █  █ ███ █ ████████████████ ███████████████████████████████████████████████ 
 27.5 |████████ ███ ███████████████████████████████████████████████████████████████████
 26.9 |████████ ███ ███████████████████████████████████████████████████████████████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  3
  20 ms | ██  8
  21 ms | ██  8
  22 ms |   2
  28 ms |   1
  31 ms | █  3
  32 ms | █████████████████████  107
  33 ms | ████████████████████████████████████████  203
  34 ms | ████████████████  83
  35 ms | ███  16
  36 ms | ██  9
  37 ms | ██  8
  38 ms | █  7
  39 ms | ███  16
  40 ms | ███  13
  41 ms | ███  14
  42 ms | ██  12
  43 ms | ██  10
  44 ms | ███  17
  45 ms | ███  15
  46 ms | ███  13
  47 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `28.52`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `21.00`
- `seed` = `5099.00`
- `preload_duration_ms` = `90.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `21.36`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23153 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.71`, p50 `9.98`, p95 `10.12`, p99 `10.83`, 1%low `8.77`, 0.1%low `n/a`, std `0.40`

**Frame time (ms)**  avg `101.93`, p50 `100.20`, p95 `112.18`, p99 `113.03`, p99.9 `114.51`, max `114.85`

**Client tick (ms)**  avg `0.27`, p95 `0.40`, max `1.73`

**Memory**  start `899 MB`, end `1007 MB`, peak `1007 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                                            █                   
 10.3 |                                                            █                   
 10.2 |                                                            █                   
 10.1 |                                                            █                   
 10.0 |█ █      █            █                 █         █         █    █    █ █       
  9.9 |█ █ ██  ██   ███ ███  ████ ██ █ █ █ █ █ ██ █ █ █ ██ █ █ █ █ ██ █ █ ██ █ █ █ ██ █
  9.9 |█ █ ██ ███ █ ███ ███  ████ ██ █ █ █ ███ ██ █ █ █ ████ █ █ █ ██ █ █ ██ █ █ █ ██ █
  9.8 |█ █ ██ ███ █ ███ ████ ███████ █ █ █ ███ ████ █ █ ████ █ █ █ ██ █ █ ██ █ █ █ ████
  9.7 |█ █ ██ ███ █ ███ ████ ███████ ███ █ ███ ████ █ █ ████ █ █ █ ██ ████████ █ ██████
  9.6 |█ ████████ █████ ████ ███████ ███ ████████████ █ ██████ ███ ███████████ █ ██████
  9.5 |█ ███████████████████████████████ ██████████████ ███████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms |   1
  91 ms |   1
  92 ms | █  2
  98 ms | ██████  14
  99 ms | ████████████  28
 100 ms | ████████████████████████████████████████  90
 101 ms | ████████  18
 102 ms |   1
 103 ms | █  2
 104 ms | █  2
 105 ms | █  3
 106 ms | █  3
 107 ms | █  2
 108 ms | ██  5
 109 ms | ██  5
 110 ms | ██  4
 111 ms | ██  4
 112 ms | ████  8
 113 ms | █  2
 114 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `8.77`
- `fps_harmonic_avg` = `9.81`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9540.00`
- `preload_duration_ms` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `9.79`, min `8.66`, p50 `9.98`, p95 `10.17`, p99 `10.88`, 1%low `8.71`, 0.1%low `n/a`, std `0.46`

**Frame time (ms)**  avg `102.33`, p50 `100.25`, p95 `112.60`, p99 `113.99`, p99.9 `115.25`, max `115.53`

**Client tick (ms)**  avg `0.25`, p95 `0.33`, max `1.81`

**Memory**  start `526 MB`, end `721 MB`, peak `986 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                                                  █             
 10.7 |                                                                  █             
 10.5 |                        █                                         █             
 10.4 |                        █                                         █             
 10.3 |                        █      █                                  █             
 10.1 |    █         █         █      █                          █       █         █   
 10.0 |  █ █ █     █ █ █ █   █ █  █ █ ██ █ █ █ █ █ █    █ █ █  █ █     █ ██ █  █ █ █ █ 
  9.9 |█ █ █ █ █ █ █ █ █ █ █ █ ██ ███ ██ █ █ █ █ █ ██ █ █ █ █ ██ █ █ █ █ ██ ██ █ █ ███ 
  9.7 |█ ███ █ █ █ █ █ █ █ █ █ ██ ███ ██ █ █ █ █ █ ████ █ █ █ ██ ███ █ █ ██ ██ █ █ ███ 
  9.6 |███████ █████ █ █ █ ███ ██ ███ ██ █ █ ███ ██████ █ █ ████████ ███ █████████ ███ 
  9.5 |███████████████ █ ███████████████████████ ███████████████████████ █████████ ████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  90 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | █  1
  97 ms | ██  2
  98 ms | █████████████  17
  99 ms | █████████████████████████████  39
 100 ms | ████████████████████████████████████████  53
 101 ms | ███████████████████████  30
 102 ms | ████  5
 104 ms | █  1
 105 ms | █  1
 107 ms | ██  3
 108 ms | █████  6
 109 ms | ███  4
 110 ms | ███████  9
 111 ms | ████  5
 112 ms | ██████  8
 113 ms | ████  5
 114 ms | █  1
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_0p1pct_low` = `n/a`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `9.77`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.71`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23137 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.56`, p50 `9.95`, p95 `10.31`, p99 `10.80`, 1%low `8.64`, 0.1%low `n/a`, std `0.44`

**Frame time (ms)**  avg `101.88`, p50 `100.49`, p95 `112.01`, p99 `113.17`, p99.9 `116.36`, max `116.79`

**Client tick (ms)**  avg `0.30`, p95 `0.57`, max `1.78`

**Memory**  start `582 MB`, end `504 MB`, peak `994 MB`, GC `3 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                    █                                           
 10.5 |                                    █                                           
 10.3 |                           █        █    █                          █ █         
 10.2 |              █            █        █  █ █            █             █ █         
 10.1 | █    █       █        █   ██   █   █  █ ██     █   █ █ █         █ █ █     █   
 10.0 | █ █ ██ █   █ █  █ █ █ █   ██ █ █   █  █ ██    ██  ██ █ ██  ███   █ █ ██ █  █  █
  9.9 | █ █ ██ █ █ █ ██ █ █ █ █ █ ██ █ ██  ██ █ ████████  ██ █ ██  ███ ███ █ ██ █ ██  █
  9.7 | ███ ██ █ █ █ ██ █ █ █ █ █ ██ █ ███ ██ █ ████████████ █ ██  ███ ███ █ ██ █ ██ ██
  9.6 | ███ ████████ ██ █ █ ███ ██████ ███ ██ █ ████████████ █ ███ ███████ █ ██ █ ██ ██
  9.5 |███████████████████████████████████ █████████████████ █████ ███████ █ ██████████
  9.4 |███████████████████████████████████ ████████████████████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | ██  2
  92 ms | ██  2
  93 ms | ██  2
  94 ms | █  1
  95 ms | ██  2
  96 ms | █  1
  97 ms | ████  5
  98 ms | ████████████████████  22
  99 ms | ████████████████████████████████████████  45
 100 ms | ███████████████████████████████████  39
 101 ms | ██████████████████████  25
 102 ms | ████████  9
 103 ms | █  1
 104 ms | ███  3
 105 ms | █  1
 106 ms | ██  2
 107 ms | ████  5
 108 ms | ██  2
 109 ms | ████  5
 110 ms | ████  4
 111 ms | ████████  9
 112 ms | █████  6
 113 ms | ██  2
 114 ms | █  1
 116 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `4027.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `8.64`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23148 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `8.65`, p50 `9.98`, p95 `10.13`, p99 `10.79`, 1%low `8.76`, 0.1%low `n/a`, std `0.40`

**Frame time (ms)**  avg `101.96`, p50 `100.21`, p95 `111.28`, p99 `112.61`, p99.9 `115.06`, max `115.61`

**Client tick (ms)**  avg `0.28`, p95 `0.40`, max `1.67`

**Memory**  start `605 MB`, end `725 MB`, peak `725 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |       █                             █                                          
 10.3 |       █                             █                   █                      
 10.2 |       █                             █                   █                      
 10.1 |       █                             █                   █                      
 10.0 | █  █  █ █ █  █ █   █ █  █ █ ██   █  █  █ █ ██ █ █     █ █  █ █  █ █  █ █ ██   █
  9.9 | █ ██  ███ █ ██ █ █ █ ██ █ █ ██  ██  ██ █ █ ██ █ █ █ ███ ██ █ ██ █ ██ █ █ ██ █ █
  9.8 | █ ██  ███ █ ████ █ █ ██ ███ ██  ██  ██ █ █ ██ █ █ █ ███ ██ █ ████ ████ █ ██ █ █
  9.7 | █ ██  ███ █ ████ █ █ ██ ███ ██  ██  ████ █ ██ █ █ █ ███ ████ ████ █████████ ███
  9.6 | █ ███ ███ █ ████ ██████ ██████  ██  ████ █ ████ █ █ ███ ████ ██████████████ ███
  9.5 | █████ ████████████████████████ ███  ████ ██████ ███ ███ ███████████████████████
  9.4 |████████████████████████████████████ ███████████████████████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms |   1
  92 ms | █  3
  94 ms |   1
  98 ms | █████  12
  99 ms | █████████  23
 100 ms | ████████████████████████████████████████  100
 101 ms | █████  12
 102 ms | █  2
 103 ms | █  3
 104 ms | █  2
 105 ms | █  2
 106 ms |   1
 107 ms | ██  4
 108 ms | ██  4
 109 ms | ██  5
 110 ms | ███  8
 111 ms | ██  5
 112 ms | ███  7
 115 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `9.81`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `8.76`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `9.78`, min `8.22`, p50 `9.92`, p95 `10.59`, p99 `10.93`, 1%low `8.38`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `102.54`, p50 `100.78`, p95 `113.50`, p99 `116.64`, p99.9 `120.76`, max `121.68`

**Client tick (ms)**  avg `0.37`, p95 `1.14`, max `5.21`

**Memory**  start `670 MB`, end `1067 MB`, peak `1365 MB`, GC `51 events / 234 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                               █                                                
 10.5 |                               █                                                
 10.3 |                               █                   █                   █        
 10.2 |                               █            █      █                   █        
 10.1 |               █   █     █ █ █ █        █   ██ █   █  █      █  █      █     ██ 
 10.0 | █ █    █ ██ █ █ █ █ █ █ █ █ █ █  █ █ █ ██  ██ █ █ █ ██   ██ ██ █ █  █ █ █ █ ██ 
  9.8 | █ ██ █ █ ██ █ █ █ █ █ ███ █ █ ██ █ █ ████  ██ █ █ █ ██ █ ██ ████ █  █ ███ █ ██ 
  9.7 | ████████ ██ █ █ █ █ █ ███ █ █ ██ █ █ ████  ██ █ █ █ ████ ███████ █  ███████ ██ 
  9.6 |█████████ ████ ███ ███ ███ █ █ ██ █ █ ████  ██ █ █ █ ████ █████████  ███████ ██ 
  9.4 |██████████████ ███ ███ ███████ ██ ████████ ███ ███ ████████████████ ████████████
  9.3 |██████████████ ███████████████ ███████████████████ █████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | ██  2
  91 ms | █  1
  92 ms | █  1
  93 ms | ████  4
  94 ms | ████  4
  96 ms | ███  3
  97 ms | ██████  6
  98 ms | ██████████████  13
  99 ms | ██████████████████████████████████████  35
 100 ms | ████████████████████████████████████████  37
 101 ms | ██████████████████████████  24
 102 ms | █████████████  12
 103 ms | ███  3
 104 ms | █  1
 105 ms | ██████  6
 106 ms | ██  2
 107 ms | █  1
 108 ms | ██████  6
 109 ms | ███  3
 110 ms | ███  3
 111 ms | ████████  7
 112 ms | █████████  8
 113 ms | ████  4
 114 ms | ██  2
 115 ms | ███  3
 116 ms | ███  3
 121 ms | █  1
```

**Extras:**

- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.75`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7411.00`
- `preload_duration_ms` = `98.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-20.00`
- `entity_count_sample_start` = `21.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `8.38`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23455 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.24`, p50 `9.97`, p95 `10.60`, p99 `11.06`, 1%low `8.24`, 0.1%low `n/a`, std `0.58`

**Frame time (ms)**  avg `101.93`, p50 `100.35`, p95 `113.75`, p99 `120.05`, p99.9 `121.39`, max `121.41`

**Client tick (ms)**  avg `0.37`, p95 `1.25`, max `5.11`

**Memory**  start `1047 MB`, end `1580 MB`, peak `1794 MB`, GC `34 events / 223 ms`

**FPS over sampling window (ASCII):**

```
 11.2 |                          █                                                     
 11.0 |                          █                                                     
 10.8 |                          █                                                     
 10.6 |                          █                                                     
 10.4 |               █       █  █                                                     
 10.3 |               ██      █  █                      █    █      █  █        █  ██  
 10.1 |    █    █  █  ██  █ █ █  █  █      █ █   ██ █   █  █ ██ █ █ ██ ██ █ █ █ ██ ██ █
  9.9 | ██ █   ██ ██  █████ █ ██ ██ ██  ██ █ █ █ ██ █ █ ██ █ ██ █ █ ██ ██ █ █ █ ██ ██ █
  9.7 |█████ ████ ██  █████ █ ██ █████  ████ █ ██████ █ ████ ██ █ █ ██ ██ █ █ █ ██ ████
  9.5 |█████████████ ███████████ ██████████████████████ ██████████████ ████████████████
  9.3 |█████████████ ██████████████████████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  80 ms | █  1
  89 ms | █  1
  90 ms | █  1
  91 ms | ████  3
  92 ms | █  1
  93 ms | █  1
  94 ms | ███████  6
  95 ms | █████  4
  96 ms | █████  4
  97 ms | ████████████  10
  98 ms | █████████████████████████████  25
  99 ms | ████████████████████████████████████████  34
 100 ms | ██████████████████████████████████████  32
 101 ms | ████████████████████  17
 102 ms | █████████  8
 103 ms | █  1
 104 ms | ██  2
 105 ms | █████  4
 106 ms | █  1
 107 ms | █████  4
 108 ms | █  1
 109 ms | ██████  5
 110 ms | █  1
 111 ms | ████████  7
 112 ms | █████████  8
 113 ms | ███████  6
 114 ms | █████  4
 116 ms | █  1
 119 ms | █  1
 121 ms | ██  2
```

**Extras:**

- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.81`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7417.00`
- `preload_duration_ms` = `509.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-8.00`
- `entity_count_sample_start` = `9.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `8.24`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23063 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `7.55`, p50 `9.96`, p95 `10.66`, p99 `11.29`, 1%low `7.96`, 0.1%low `n/a`, std `0.60`

**Frame time (ms)**  avg `102.10`, p50 `100.36`, p95 `114.72`, p99 `118.10`, p99.9 `129.74`, max `132.40`

**Client tick (ms)**  avg `0.41`, p95 `1.33`, max `13.52`

**Memory**  start `1212 MB`, end `1546 MB`, peak `2094 MB`, GC `26 events / 195 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                                                               █                
 10.7 |                                                               █                
 10.5 |     █             █                                           █                
 10.4 |     █             █              █                            █    █           
 10.2 |     █             █              █ █                          █    █           
 10.1 |   █ ██ █ █ ██     █  █ █ █ █     █ █  █  █ █ █  █ █    █  █   █    █  █   █ █ █
  9.9 | █ █ ██ █ █ ██ █ █ ██ █ █ █████ █ ████ ██ █ █ ██ █ ██ █ ██ █ █ ██ █ █ ██ █ █ █ █
  9.7 | █ █ ██ █ █ ██ █ █ ██ █ █████████ ████ ████ █████████ ██████ █ ██ █ █ ██ ███ █ █
  9.6 |████ ██████ ███████████ █████████ ████ ███████████████████████ ████ █ ██ ███████
  9.4 |███████████████████████ ██████████████████████████████████████ █████████ ███████
  9.2 |███████████████████████ ████████████████████████████████████████████████ ███████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  79 ms | █  1
  85 ms | █  1
  88 ms | █  1
  91 ms | ███  3
  92 ms | █  1
  93 ms | ████  4
  94 ms | ███  3
  95 ms | ████  4
  96 ms | ███  3
  97 ms | ███████████████  14
  98 ms | ████████████  11
  99 ms | █████████████████████████████████████  34
 100 ms | ████████████████████████████████████████  37
 101 ms | ███████████████████  18
 102 ms | ███████████  10
 103 ms | █████  5
 104 ms | ██  2
 105 ms | ██  2
 106 ms | ████  4
 107 ms | █  1
 108 ms | ██  2
 109 ms | ████  4
 110 ms | █████  5
 111 ms | ██████  6
 112 ms | ████  4
 113 ms | ████  4
 114 ms | ███  3
 115 ms | ████  4
 117 ms | █  1
 118 ms | ███  3
 132 ms | █  1
```

**Extras:**

- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.79`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7433.00`
- `preload_duration_ms` = `107.00`
- `entity_count_sample_end` = `46.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `45.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `7.96`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23160 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `7.69`, p50 `9.98`, p95 `10.95`, p99 `11.41`, 1%low `7.96`, 0.1%low `n/a`, std `0.65`

**Frame time (ms)**  avg `102.05`, p50 `100.21`, p95 `115.94`, p99 `118.68`, p99.9 `128.25`, max `129.97`

**Client tick (ms)**  avg `0.39`, p95 `0.83`, max `10.89`

**Memory**  start `1896 MB`, end `1444 MB`, peak `2248 MB`, GC `26 events / 208 ms`

**FPS over sampling window (ASCII):**

```
 11.5 |                                   █                                            
 11.2 |                                   █                                            
 11.0 |                                   █                                            
 10.8 |                                   █    █                                       
 10.5 | █                          █      █    █             █                         
 10.3 | █  █                       █      █    █             ██             █          
 10.1 | ██ █  █   ██   █   █    █  █  █   ██ █ ██   █ ██ █ █ ██ █  █ █ ██   ██ ██  █ █ 
  9.8 | ██ ████ █ ██ █ █ █ ██ ███  ██ █ █ ██ █ ██ █ █ ██ █ █ ██ █ ██ █ ████ ██████ █ ██
  9.6 | ██ ████ █████████████ ████ ██ █ █ ████ ██████ ██ █ █ ██ ██████ ████ ██████ ████
  9.4 |██████████████████████ ████ ██████ ████ ████████████████████████████████████████
  9.1 |██████████████████████████████████ █████████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  79 ms | █  1
  87 ms | ██  2
  88 ms | ███  3
  90 ms | ████  4
  91 ms | ██  2
  92 ms | █  1
  93 ms | ███  3
  94 ms | █  1
  96 ms | ██  2
  97 ms | ████████  8
  98 ms | ████████████████████████  23
  99 ms | ████████████████████████████████████████  39
 100 ms | █████████████████████████████  28
 101 ms | █████████████████████████  24
 102 ms | ███████  7
 103 ms | █████  5
 104 ms | █  1
 105 ms | █  1
 106 ms | ██  2
 108 ms | ███  3
 109 ms | ██  2
 110 ms | ████  4
 111 ms | █████  5
 112 ms | █████  5
 113 ms | ██████  6
 114 ms | ███  3
 115 ms | █  1
 116 ms | ████  4
 117 ms | ███  3
 118 ms | █  1
 121 ms | █  1
 129 ms | █  1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7451.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.96`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23147 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.39`, p50 `9.95`, p95 `10.75`, p99 `11.31`, 1%low `8.45`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `101.93`, p50 `100.48`, p95 `113.37`, p99 `116.77`, p99.9 `118.85`, max `119.20`

**Client tick (ms)**  avg `0.36`, p95 `1.16`, max `2.12`

**Memory**  start `1130 MB`, end `1866 MB`, peak `2210 MB`, GC `24 events / 181 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                  █                             
 10.6 |     █                                            █                    █        
 10.4 |     █                          █                 █                    █        
 10.3 |     █                          █  █              █                    █        
 10.2 |     █         █          █     █  █  █      █    █                    █   █    
 10.0 |  ██ █    █ ██ █ █    █ █ █     █  ██ █ █    █  █ ██ █    █   █ ██   █ ██  █    
  9.9 | ███ █  █ █ ██ █ ██   █ █ █ █   ██ ██ █ ████ █ ██ ██ ███  █   █ ██ █ █ ██ ██ ██ 
  9.8 | ███ ██████ ██ ██████ █ █ █ ███ ██ ██ █ ████ █ ██ ██ ████ █ ███ ████ █ ██ █████ 
  9.6 |████ ██████ ██ ████████ █ █ ███ ██ ████ ████ ████ ██ ████ █ ████████ █ ██ ██████
  9.5 |████ ████████████████████ ████████ ████ █████████████████ ████████████ ██ ██████
  9.3 |████ █████████████████████████████ ███████████████████████████████████ █████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | ██  2
  88 ms | █  1
  90 ms | ███  3
  91 ms | █  1
  92 ms | ███  3
  93 ms | █  1
  96 ms | ███  4
  97 ms | ████████  9
  98 ms | ███████████████  17
  99 ms | █████████████████████████████  33
 100 ms | ████████████████████████████████████████  46
 101 ms | █████████████████  20
 102 ms | ██████  7
 103 ms | █████  6
 104 ms | ███  4
 105 ms | ███  3
 106 ms | ███  3
 107 ms | ██  2
 108 ms | ███  4
 111 ms | ███  4
 112 ms | ███████  8
 113 ms | █████████  10
 114 ms | ██  2
 116 ms | █  1
 117 ms | █  1
 119 ms | █  1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.81`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7457.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-40.00`
- `entity_count_sample_start` = `42.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.45`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `63.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24243 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.29`, p50 `9.94`, p95 `10.37`, p99 `11.30`, 1%low `8.47`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `102.24`, p50 `100.63`, p95 `113.15`, p99 `114.22`, p99.9 `119.63`, max `120.62`

**Client tick (ms)**  avg `0.34`, p95 `0.76`, max `4.50`

**Memory**  start `1908 MB`, end `2042 MB`, peak `2248 MB`, GC `25 events / 199 ms`

**FPS over sampling window (ASCII):**

```
 11.1 |                                                             █                  
 10.9 |                                                             █                  
 10.8 |                                                             █                  
 10.6 |                  █                                          █                  
 10.4 |                  █         █                           █  █ █  █               
 10.2 |                  ██   █    █                           █  █ █  █    █          
 10.0 |██  █ █  ███  ██  ███  ███  ██ █ ██   █ █ ██ █   ██ █   ██ █ ██ █ █  █ ██  ██ █ 
  9.8 |██  ███  ███  ██  ███  ███  ██ █ ████ █ █ ██ ██████ ██  ██ █ ██ █ ██ █ ██  ██ █ 
  9.6 |██ ████  ████████ ████ ████ ██ ████████ ████ ██████ ██████ █ ██ █ ████ ██ ███ █ 
  9.4 |████████ ██████████████████████████████ ████████████████████ ████████████ ██████
  9.2 |███████████████████████████████████████ ████████████████████ ███████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  81 ms | █  1
  87 ms | █  1
  88 ms | ██  2
  91 ms | █  1
  92 ms | █  1
  93 ms | █  1
  94 ms | █  1
  95 ms | ██  2
  96 ms | ██  2
  97 ms | █████████  9
  98 ms | █████████████████  18
  99 ms | ███████████████████████████  28
 100 ms | ████████████████████████████████████████  42
 101 ms | ████████████████████  21
 102 ms | ████████████  13
 103 ms | ██████  6
 104 ms | ███  3
 105 ms | ██  2
 106 ms | ██  2
 107 ms | ██  2
 108 ms | ██████  6
 109 ms | ███  3
 110 ms | ██████  6
 111 ms | ██████  6
 112 ms | ██████  6
 113 ms | ██████  6
 114 ms | ███  3
 115 ms | █  1
 120 ms | █  1
```

**Extras:**

- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.78`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7477.00`
- `preload_duration_ms` = `1127.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-2.00`
- `entity_count_sample_start` = `3.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.47`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.46`, p50 `9.97`, p95 `10.77`, p99 `11.40`, 1%low `8.48`, 0.1%low `n/a`, std `0.56`

**Frame time (ms)**  avg `101.85`, p50 `100.30`, p95 `113.42`, p99 `116.55`, p99.9 `118.05`, max `118.16`

**Client tick (ms)**  avg `0.43`, p95 `1.11`, max `13.72`

**Memory**  start `1083 MB`, end `1769 MB`, peak `2159 MB`, GC `21 events / 159 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                      █                                         
 10.6 |           █                          █                                         
 10.4 |   █  █    █              █           █                                         
 10.3 |   █  █    █              █        █  █                                         
 10.2 |   █  █    █    █         █  █   █ ██ ██     █    █                         █   
 10.0 |   █  ██ █ █  █ █  █  █ █ ██ █ █ █ ██ ██ █   ██ █ █ ██  █    ██   █    █   ████ 
  9.9 |█  ██ ██ █ ██ █ █████ █ █ ██ █ █ █ ██ ██ ██  ██ █ █ ██  ██ █ ██   ██  ██ █ ████ 
  9.8 |█  ██ ██ █ ████ █████ █ █ ██ █ █ █ ██ █████  ██ █ █ ██  ██ █ ██ ████  ██ ██████ 
  9.6 |██ ███████ ████ █████████ ████ █ █ ██ █████  ██ █ ████ ████████ ████  ██████████
  9.5 |██ ███████ ██████████████ ████ ███ ██ █████ ███ █ ██████████████████████████████
  9.3 |███████████████████████████████████████████ █████ ██████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  86 ms | █  1
  87 ms | █  1
  88 ms | ██  2
  90 ms | ██  2
  91 ms | █  1
  92 ms | ███  3
  93 ms | █  1
  95 ms | █  1
  96 ms | █████  5
  97 ms | ██████  6
  98 ms | ███████████████████████████  25
  99 ms | ████████████████████████████████████████  37
 100 ms | ██████████████████████████████████████  35
 101 ms | ██████████████████████  20
 102 ms | █████████  8
 103 ms | ██████  6
 104 ms | ██  2
 105 ms | █  1
 108 ms | █████  5
 109 ms | ██████  6
 110 ms | █████  5
 111 ms | █████  5
 112 ms | ██████  6
 113 ms | ███  3
 114 ms | ████  4
 115 ms | ██  2
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-6.00`
- `entity_count_sample_start` = `8.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.48`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24711 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.05`, p50 `9.95`, p95 `10.90`, p99 `11.37`, 1%low `8.18`, 0.1%low `n/a`, std `0.61`

**Frame time (ms)**  avg `101.98`, p50 `100.46`, p95 `114.39`, p99 `118.65`, p99.9 `123.46`, max `124.24`

**Client tick (ms)**  avg `0.37`, p95 `1.19`, max `11.51`

**Memory**  start `1043 MB`, end `1053 MB`, peak `2272 MB`, GC `22 events / 174 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                              █                                                 
 10.7 |                              █                           █                     
 10.5 |                █    █   █    █                 █         █             █       
 10.3 |              █ █    █   █    █            █    █      █  █             █  █    
 10.2 |   █          █ █    █   █    █   █     █  █    █      █  █             █  █    
 10.0 |   ██   ███   █ █ █  ███ █  █ █ █ ██ █  █  ██ █ ██ ██  ██ █████  █  █ █ ██ ██ ██
  9.8 |  ███  ████ █ █ ███  ███ █ ██ █ █ ██ █ ██  ██ █ ██ ██  ██ ████████ ██ █ ██ ██ ██
  9.7 | ████  ████ █ █ ████ ███ ████ █ █ ██ ████  ████ ██ ███ ██ █████████████ ██ ██ ██
  9.5 | ████  █████████████ ████████ ███████████ █████ ██████ ██ █████████████ ████████
  9.3 |█████████████████████████████ ███████████ ██████████████████████████████████████
  9.1 |█████████████████████████████ ██████████████████████████████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  87 ms | ██  2
  88 ms | ██  2
  89 ms | ███  3
  90 ms | ██  2
  92 ms | ██  2
  93 ms | ██  2
  94 ms | █████  5
  95 ms | █  1
  96 ms | ██  2
  97 ms | ██  2
  98 ms | ████████████████████  22
  99 ms | █████████████████████████████  31
 100 ms | ████████████████████████████████████████  43
 101 ms | ██████████████████  19
 102 ms | ██████  6
 103 ms | ████  4
 104 ms | ████  4
 105 ms | ███  3
 106 ms | ██  2
 107 ms | ███  3
 108 ms | ███  3
 109 ms | ██  2
 110 ms | ██  2
 111 ms | █████  5
 112 ms | ███████  7
 113 ms | █████  5
 114 ms | ██  2
 116 ms | ████  4
 117 ms | ██  2
 118 ms | █  1
 120 ms | █  1
 124 ms | █  1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.81`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `1636.00`
- `entity_count_sample_end` = `10.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-46.00`
- `entity_count_sample_start` = `56.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `8.18`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23061 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.24`, p50 `9.95`, p95 `10.64`, p99 `11.01`, 1%low `8.28`, 0.1%low `n/a`, std `0.57`

**Frame time (ms)**  avg `102.07`, p50 `100.46`, p95 `113.55`, p99 `118.43`, p99.9 `121.17`, max `121.41`

**Client tick (ms)**  avg `0.42`, p95 `1.21`, max `6.72`

**Memory**  start `1492 MB`, end `1755 MB`, peak `2327 MB`, GC `20 events / 179 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                          █                                                     
 10.7 |                          █                                                     
 10.5 |                          █                                                     
 10.4 |█                         █                                           █  █      
 10.2 |█            █            █         █               █            █  █ █  █  █   
 10.0 |█ ██  ██ █ ████    ██  █  ██     █  █        ██ █   █  █ █  █ █  █  █ ██ ██ ██ █
  9.9 |█ ██  ██ █ █████ ███████  ██ █ ███ ██ █ ██ █ ██ █ █ ██ ████ █ █ ██  █ ██ ██ ██ █
  9.7 |█ ██ ███ █ █████ ███████  ██ █ ██████ █ ██ █ ████ █ ██ ████ █ ████  █ ██ ██ ██ █
  9.6 |████ ███ █ █████ ███████  ██ █ ██████ ████ █ ██████ ██ ██████ ████ ██ ██ ███████
  9.4 |█████████████████████████ ████ ███████████████████████████████████ ██ ██████████
  9.2 |██████████████████████████████ ██████████████████████████████████████ ██████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | █  1
  89 ms | █  1
  90 ms | █  1
  91 ms | ███  3
  92 ms | ██  2
  93 ms | ██  2
  94 ms | ███  3
  95 ms | █████  5
  96 ms | ███  3
  97 ms | ████████  8
  98 ms | ███████████████████████████  26
  99 ms | ████████████████████████████  27
 100 ms | ████████████████████████████████████████  38
 101 ms | ██████████████████████  21
 102 ms | ██████  6
 103 ms | █  1
 104 ms | ███  3
 105 ms | █  1
 106 ms | ████  4
 107 ms | ██  2
 108 ms | ██  2
 109 ms | ██  2
 110 ms | ████  4
 111 ms | █████████  9
 112 ms | ██████  6
 113 ms | ███████  7
 114 ms | ██  2
 115 ms | █  1
 116 ms | ██  2
 118 ms | █  1
 120 ms | █  1
 121 ms | █  1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7499.00`
- `preload_duration_ms` = `99.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-21.00`
- `entity_count_sample_start` = `25.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.28`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `9.84`, min `8.05`, p50 `9.95`, p95 `10.70`, p99 `11.70`, 1%low `8.07`, 0.1%low `n/a`, std `0.62`

**Frame time (ms)**  avg `102.03`, p50 `100.51`, p95 `114.55`, p99 `121.59`, p99.9 `124.07`, max `124.16`

**Client tick (ms)**  avg `0.33`, p95 `1.24`, max `8.11`

**Memory**  start `2223 MB`, end `1370 MB`, peak `2419 MB`, GC `23 events / 189 ms`

**FPS over sampling window (ASCII):**

```
 11.3 |                                           █                                    
 11.1 |                                           █                                    
 10.9 |  █                                        █                                   █
 10.7 |  █                                        █                                   █
 10.5 |  █                                        █                           █       █
 10.2 |  █                                        █                           █   █   █
 10.0 |█ ██ ████ █     ██ █ █ █   ██      █ █ █ █ █  █ ██ █  █   ████   █ █ █ ██ ██ █ █
  9.8 |█ ██ ████ █ █ █ ██ █ █ █ █ ████ ██ ███ █ █ ██ █ ██ █ ████ ████ █ █ █ █ ██ ████ █
  9.6 |█ █████████ ███ ████ █████████████████ ███ ████ █████████ ████ ███████ ███████ █
  9.4 |█ ████████████████████████████████████████ ███████████████████████████████████ █
  9.2 |█ ██████████████████████████████████████████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  78 ms | █  1
  85 ms | ██  2
  87 ms | █  1
  88 ms | ██  2
  90 ms | ██  2
  92 ms | ██  2
  93 ms | ██  2
  94 ms | ███  3
  96 ms | █  1
  97 ms | ██████  7
  98 ms | █████████████  15
  99 ms | ██████████████████████████  31
 100 ms | ████████████████████████████████████████  48
 101 ms | █████████████████████  25
 102 ms | ██████  7
 104 ms | ████  5
 106 ms | █████  6
 107 ms | ███  3
 108 ms | ███  3
 109 ms | ███  3
 110 ms | █  1
 111 ms | ███  4
 112 ms | █████  6
 113 ms | ████  5
 114 ms | ██  2
 115 ms | ███  3
 116 ms | ██  2
 118 ms | █  1
 121 ms | █  1
 123 ms | █  1
 124 ms | █  1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7507.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-2.00`
- `entity_count_sample_start` = `3.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `8.07`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `8.17`, p50 `9.94`, p95 `10.57`, p99 `11.25`, 1%low `8.24`, 0.1%low `n/a`, std `0.57`

**Frame time (ms)**  avg `102.15`, p50 `100.59`, p95 `113.89`, p99 `119.41`, p99.9 `121.97`, max `122.33`

**Client tick (ms)**  avg `0.35`, p95 `0.74`, max `7.04`

**Memory**  start `1915 MB`, end `1013 MB`, peak `2317 MB`, GC `23 events / 207 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                                                     █                          
 10.9 |                                                     █                          
 10.7 |█                                                    █       █                  
 10.5 |█          █                                         █       █    █             
 10.3 |█ █        █    █        █                           █       █    █             
 10.1 |█ ██  █    █    █  █  █  ██   █     █  █ █     █     █ █  █  █    █           █ 
 10.0 |█ ██  █    ██ █ ██ █ ██  ███  ████ ██  █ █  █  █ █   █ █  ██ █ ██ █ █  █ ██  ██ 
  9.8 |█ █████    ██ █ ██ █ ██  ███  ████ ██  ███  ██ █ ███ █ █  ██ █ ██ █ ████████ ██ 
  9.6 |█ ██████ █ ██ █ ██ ████  ████ ████████ █████████████ ███████ ████ ██████████ ██ 
  9.4 |███████████████ ██ █████ ███████████████████████████ ███████ ████ ██████████████
  9.2 |████████████████████████████████████████████████████ ███████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | ████  3
  94 ms | ████  3
  95 ms | ████  3
  96 ms | █████████  8
  97 ms | ███████  6
  98 ms | ██████████████████  15
  99 ms | ████████████████████████████████████████  34
 100 ms | ████████████████████████████████████████  34
 101 ms | ████████████████████████████  24
 102 ms | █████████  8
 103 ms | ███████  6
 104 ms | ████  3
 105 ms | ██  2
 106 ms | ██  2
 107 ms | ████  3
 108 ms | █  1
 109 ms | ██████  5
 110 ms | ██████  5
 111 ms | ████████  7
 112 ms | █████  4
 113 ms | █████  4
 114 ms | ██  2
 115 ms | █████  4
 118 ms | █  1
 119 ms | █  1
 120 ms | █  1
 122 ms | █  1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.79`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7517.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-13.00`
- `entity_count_sample_start` = `14.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.24`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `7.97`, p50 `9.96`, p95 `10.71`, p99 `11.01`, 1%low `8.10`, 0.1%low `n/a`, std `0.57`

**Frame time (ms)**  avg `102.15`, p50 `100.41`, p95 `113.58`, p99 `117.75`, p99.9 `124.65`, max `125.42`

**Client tick (ms)**  avg `0.30`, p95 `1.25`, max `1.77`

**Memory**  start `1294 MB`, end `2411 MB`, peak `2510 MB`, GC `16 events / 157 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                          █                                     
 10.6 |                                          █                      █              
 10.5 |      █                  █                █                      █              
 10.3 |      █                █ █  █             █                      █              
 10.2 |      █                █ █  █  █          █      █               █              
 10.1 |      █         █  █   █ ██ █  █ █ ██     █  █   █ ██     █  █   █ █    █ █ █   
 10.0 | ███  ███ █ ██  ██ █ █ █ ██ █  █ █ ██ █ █ ██ █   █ ██  █  ██ █   █ ██  ██ █ █   
  9.8 | ████ ███ █ ██  ██ █ █ █ ██ █  █ █ ██ █ █ ██ █ █ █ █████  ████ █ █ ██  ██ █ █ ██
  9.7 |█████ ████████  ██ █ █ █ ██ █ ██ █ ██ ███ ██ █ █ █ █████  ██████ █ ██ ███ ███ ██
  9.6 |█████ ████████  ████ █ █ ██ ████ █ ██ ███ ██ █ █ █ ██████ ██████ █ ██████ ███ ██
  9.5 |███████████████ ████ ██████ ██████ ██████ ███████████████████████████████████ ██
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  88 ms | █  1
  90 ms | █  1
  91 ms | █  1
  92 ms | ██████  5
  93 ms | ██████  5
  94 ms | ███  3
  95 ms | █  1
  96 ms | ███  3
  97 ms | ██████  5
  98 ms | ███████████████████████  21
  99 ms | ██████████████████████████████████████  34
 100 ms | ████████████████████████████████████████  36
 101 ms | ██████████████████████████  23
 102 ms | █████████  8
 103 ms | ██  2
 104 ms | █  1
 105 ms | ██  2
 106 ms | █  1
 107 ms | ██  2
 108 ms | ███  3
 109 ms | ████  4
 110 ms | ███  3
 111 ms | ██████  5
 112 ms | ███████████  10
 113 ms | ███████████  10
 115 ms | ██  2
 117 ms | █  1
 121 ms | █  1
 125 ms | █  1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.79`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7523.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-33.00`
- `entity_count_sample_start` = `37.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `8.10`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23137 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.77`, p50 `9.98`, p95 `10.13`, p99 `10.83`, 1%low `8.79`, 0.1%low `n/a`, std `0.41`

**Frame time (ms)**  avg `101.90`, p50 `100.18`, p95 `111.28`, p99 `113.42`, p99.9 `113.92`, max `114.01`

**Client tick (ms)**  avg `0.25`, p95 `0.31`, max `1.70`

**Memory**  start `1756 MB`, end `1836 MB`, peak `1836 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                  █                             
 10.5 |                                                  █                             
 10.4 |               █                               █  █                             
 10.3 |               █                               █  █                             
 10.2 |               █                               █  █                             
 10.1 |█ █  █         █ █  █    █    █ █  █           ██ █    █ █   █   █    █    ██   
  9.9 |█ ██ █ ██  ██  ███  ██ █ ██  ██ █ ██  ████ ██  ██ █ ██ █ █ █ ██  ██ █ ██  ███  █
  9.8 |█ ██ █ ██  ██  ███  ██ █ ██  ██ █ ██  ████ ██  ██ █ ██ █ █ ████  ████ ██  ███  █
  9.7 |█ ██ ████  ██  ███ ███ █ ███ ████ ███ ████ ██  ██ █ ██ █ █ ████  ████ ██  ███  █
  9.6 |█ ███████████  ███████ █ ███ ████████ ████████ ██ ████ ███ ████  ███████████████
  9.5 |██████████████ ██████████████████████████████████ ████ █████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   1
  92 ms | █  3
  93 ms | █  2
  98 ms | ████  9
  99 ms | ██████████████  32
 100 ms | ████████████████████████████████████████  91
 101 ms | ███████  15
 103 ms | █  2
 105 ms | ██  4
 106 ms | ██  4
 107 ms | █  2
 108 ms | ███  7
 109 ms | ███  6
 110 ms | ███  7
 111 ms | ██  4
 112 ms | ██  4
 113 ms | █  2
 114 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.79`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23152 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.60`, p50 `9.99`, p95 `10.42`, p99 `10.69`, 1%low `8.67`, 0.1%low `n/a`, std `0.48`

**Frame time (ms)**  avg `101.95`, p50 `100.06`, p95 `112.29`, p99 `114.39`, p99.9 `115.87`, max `116.22`

**Client tick (ms)**  avg `2.52`, p95 `2.89`, max `13.52`

**Memory**  start `1818 MB`, end `1748 MB`, peak `2486 MB`, GC `1 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                           █                                    
 10.5 |                          █                █                                  █ 
 10.4 | █                        █                █                                  █ 
 10.3 | █                        █                █                  █               █ 
 10.2 | █  █            █  █   █ █                █                  █  █            █ 
 10.1 | █  █          █ ██ █   █ █      █    █    █ █ █ █      █     █  █     █    █ ██
  9.9 | ██ ██ █   █ █ █ ██ █ █ █ ██ ██  ██ █ ██   █ █ █ █ ██ █ █ ██  ██ █ ██  ██  ██ ██
  9.8 | ██ ██ █ █ █ █ █ ██ █ █ █ ██ ██  ██ █ ██   █ █ █ █ ██ █ █ ██  ██ █ ██  ██  ██ ██
  9.7 |███ ██ █ █ █ █ █ ██ █ █ █ █████  ██ ████   █ █ █ █ ████ █ ██  ██ ████  ███ ██ ██
  9.6 |███ ████ ███ ███ ████ █ █ ██████ ██ ████ █████ █ ████████ ██  ███████  ███ ██ ██
  9.5 |████████████████ ██████████████████ ██████████ ██████████ ███ ███████████████ ██
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  92 ms | █  1
  93 ms | █  1
  94 ms | ██  2
  95 ms | █████  6
  96 ms | ████  5
  97 ms | ███████  9
  98 ms | ██████████████  18
  99 ms | ████████████████████████████████████████  51
 100 ms | ███████████████████████████████████  45
 101 ms | ██████  8
 102 ms | ██  3
 103 ms | ██  2
 106 ms | █  1
 107 ms | ██  2
 108 ms | ████  5
 109 ms | ████  5
 110 ms | ██████  8
 111 ms | ████████  10
 112 ms | ████  5
 113 ms | ████  5
 114 ms | ██  2
 116 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `8.67`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.81`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `0.00`
- `particle_types` = `16.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `9.85`, min `8.72`, p50 `9.98`, p95 `10.32`, p99 `11.04`, 1%low `8.74`, 0.1%low `n/a`, std `0.44`

**Frame time (ms)**  avg `101.72`, p50 `100.19`, p95 `112.44`, p99 `113.76`, p99.9 `114.58`, max `114.67`

**Client tick (ms)**  avg `0.27`, p95 `0.38`, max `1.71`

**Memory**  start `1831 MB`, end `2051 MB`, peak `2051 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |█                                                                               
 10.6 |█                                                                               
 10.4 |█                            █                  █             █                 
 10.3 |█                            █                  █             █                 
 10.2 |█                            █       █          █             █                 
 10.1 |█  █    █    █    █          █   █   ██     █ █ █    █    █   ██ █  █     █     
  9.9 |██ █ ██ █ █ ██ █ ██  ██  ██  ██ ██ █ ██ █ █ █ █ ██ █ ██ █ ██  ██ █ ██ ███ ██ █ █
  9.8 |██ █ ██ ███ ██ █ ██  ██  ██  ██ ████ ██ █ █ █ █ ██ █ ██ █ ██  ██ █ ██ ███ ██ █ █
  9.7 |██ ████████ ████ ███ ██  ██  ██ ████ ██████ █ █ ████ ████ ███ ██ ████ ███ ██ █ █
  9.6 |███████████████████████ ███  ███████ ██████ █ █ ████ ████████ ██ ████████ ██████
  9.5 |█████████████████████████████████████████████ █ ████ ███████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms |   1
  90 ms | █  2
  91 ms | █  2
  92 ms | █  2
  93 ms |   1
  94 ms |   1
  95 ms |   1
  97 ms |   1
  98 ms | █████  11
  99 ms | ████████████████  34
 100 ms | ████████████████████████████████████████  83
 101 ms | ███████  15
 104 ms | █  3
 105 ms |   1
 106 ms | █  3
 107 ms | ███  7
 108 ms | ████  8
 109 ms | █  2
 110 ms | █  3
 111 ms | ██  4
 112 ms | ██  5
 113 ms | ██  4
 114 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.83`
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
- `fps_1pct_low` = `8.74`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3115.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23129 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.79`, p50 `9.98`, p95 `10.14`, p99 `10.91`, 1%low `8.80`, 0.1%low `n/a`, std `0.40`

**Frame time (ms)**  avg `101.87`, p50 `100.18`, p95 `111.79`, p99 `112.83`, p99.9 `113.73`, max `113.79`

**Client tick (ms)**  avg `0.28`, p95 `0.33`, max `1.87`

**Memory**  start `2017 MB`, end `2157 MB`, peak `2157 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |                              █    █              █    █    █                   
 10.0 |  █    █   █     ██   ██ █ █  █    █     █    █ █ █  █ ██   █ █ ██  █   █  █ █  
 10.0 |  ██   █   █ ██  ██ █ ██ █ █  █ █  █ █   ██   █ █ ██ ████ █ █ █ ██  ██  ██ █ ██ 
  9.9 |██████ █ █ █ ██  ██ █ ██ █ █  █ █ ██ █ █ ██ █ █ █ ██ ████ █ █ █ ██  ██  ██ █ ██ 
  9.8 |██████ █ █ █ ██  ██ █ ██ █ █ ██ █ ██ █ ████ █ █ ████ ████ █ █ █ ██  ██  ██ █ ██ 
  9.8 |██████ █ █ █ ██  ██ █ ██ █ █ ████ ██ █ ████ █ █ ████ ████ █ █ █ ██  ██  ██ █ ██ 
  9.7 |██████ █ █ █ ██  ██ █ ██ ███ ███████ █ ████ ███ █████████ █ █ ████  ██  ██ █ ██ 
  9.7 |██████ █ █ █ ██  ███████ ███ ███████ █ ████ ███ █████████ █ █ ████  ██  ██ █ ██ 
  9.6 |██████ █ ███ ██  █████████████████████ ████ ███ █████████ ███ ████  ███ ██ █ ███
  9.6 |████████ ███ ███ ██████████████████████████ █████████████████ ████  ███ ████████
  9.5 |████████████████ ██████████████████████████ ██████████████████████ ████ ████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  1
  91 ms | █  2
  92 ms | █  1
  95 ms | █  1
  98 ms | ███████████████  25
  99 ms | ███████████████  25
 100 ms | ████████████████████████████████████████  68
 101 ms | ██████████████████  30
 103 ms | █  1
 104 ms | ██  4
 105 ms | █  1
 106 ms | █████  9
 107 ms | █  2
 108 ms | ██  4
 109 ms | ███  5
 110 ms | ██  3
 111 ms | ████  7
 112 ms | ███  5
 113 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `8.80`
- `fps_harmonic_avg` = `9.82`
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

Category: **Block-Entities**  |  Duration: 23152 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `8.81`, p50 `9.98`, p95 `10.13`, p99 `10.42`, 1%low `8.82`, 0.1%low `n/a`, std `0.36`

**Frame time (ms)**  avg `101.92`, p50 `100.19`, p95 `111.61`, p99 `113.21`, p99.9 `113.42`, max `113.46`

**Client tick (ms)**  avg `0.27`, p95 `0.44`, max `1.59`

**Memory**  start `870 MB`, end `1022 MB`, peak `1022 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                           █               █                    
 10.4 |                                           █               █                    
 10.3 |                                           █               █                    
 10.2 |                                           █             █ █                    
 10.1 | █    █    █    █                          █  █    █     █ █                █   
 10.0 | ██   █ █  █ █  █ █   █ █  █ █ █ █   █ █   ██ ██ █ █ █   █ █       █ █   ██ █ ██
  9.9 |███  ██ █ ██ █ ██ █ █ █ ██ █ █ █ █ █ ████  ██ ██ █ █ █ █ █ ██ █ ██ █ ██  ██ █ ██
  9.8 |███  ██ ████ █ ██ █ █ █ ██ █ █ █ █ █ ████  ██ ██ █ █ █ █ █ ██ █ ███████  ██ █ ██
  9.7 |█████████████████ █ ████████ █ █ █ █ ████  █████ █ █ █ █ █ ████ ███████ ████████
  9.6 |█████████████████ ██████████ █ █ █ █ ████  █████ █ █ ███ █ █████████████████████
  9.5 |████████████████████████████ █ █ ████████  ███████████████ █████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms | █  2
  96 ms |   1
  98 ms | █████  12
  99 ms | ████████████  27
 100 ms | ████████████████████████████████████████  92
 101 ms | ███████  17
 102 ms | █  3
 103 ms |   1
 104 ms | █  3
 106 ms | ████  9
 107 ms | ███  6
 108 ms | ██  5
 109 ms | █  3
 110 ms |   1
 111 ms | ███  6
 112 ms | ██  5
 113 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `8.82`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `9.81`
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

Category: **Block-Entities**  |  Duration: 23152 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `8.73`, p50 `9.98`, p95 `10.14`, p99 `10.85`, 1%low `8.78`, 0.1%low `n/a`, std `0.42`

**Frame time (ms)**  avg `101.98`, p50 `100.17`, p95 `111.88`, p99 `112.97`, p99.9 `114.28`, max `114.52`

**Client tick (ms)**  avg `0.27`, p95 `0.47`, max `1.69`

**Memory**  start `1187 MB`, end `1347 MB`, peak `1347 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 | █    █                                                                         
 10.3 | █    █                                                                         
 10.2 | █    █                                                                       █ 
 10.2 | █    █                                                                       █ 
 10.1 | █    █                                                                       █ 
 10.0 | ██ █ ██ █ █ ██ █ █ ██  ██ █ ██ █ █ ██ █ █ █ █ █ █ ██ █ ██  ███ ███ █ ██  ██  ██
  9.9 | ██ █ ██ █ █ ██ █ █ ██  ██ █ ██ █ █ ██ █ █ █ █ █ █ ██ █ ██ ████ ███ █ ██  ██  ██
  9.8 | ██ █ ██ ███ ██ █ ████  ██ ████ ███ ██ █ █ █ █ █ █ ██ █ ██ ████ ███ █ ██  ██  ██
  9.7 | ██ █ ██ ███ ██ █ ████  ██████████████ ███ █ █ █ █ ██ ████ ████████ ████  ██  ██
  9.6 | ████ ██ ███ ████ ████  ██████████████ ███ █ █ ███ ████████████████ ████  ██  ██
  9.5 | ████ █████████████████ ██████████████ ██████████████████████████████████████ ██
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms | █  2
  92 ms | █  2
  93 ms | █  2
  95 ms |   1
  96 ms |   1
  98 ms | ████  10
  99 ms | ████████████  27
 100 ms | ████████████████████████████████████████  89
 101 ms | ████████  18
 102 ms |   1
 104 ms |   1
 105 ms | ██  4
 106 ms | █  2
 107 ms | ██  5
 108 ms | ██  4
 109 ms | ██  5
 110 ms | ███  7
 111 ms | ███  6
 112 ms | ███  7
 113 ms |   1
 114 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.81`
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
- `fps_1pct_low` = `8.78`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195108 ms  |  Sample ticks: 3600

**FPS**  avg `9.86`, min `7.59`, p50 `9.98`, p95 `10.64`, p99 `11.09`, 1%low `7.98`, 0.1%low `7.66`, std `0.54`

**Frame time (ms)**  avg `101.80`, p50 `100.18`, p95 `112.96`, p99 `122.45`, p99.9 `129.12`, max `131.77`

**Client tick (ms)**  avg `0.66`, p95 `1.24`, max `2.96`

**Memory**  start `2089 MB`, end `904 MB`, peak `2293 MB`, GC `12 events / 76 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                             █                                                 █
 10.0 |               █             █                                                 █
  9.9 |  █       █    █             █                                                ██
  9.9 |  █  █    █    █    █     █  █ █                                    █         ██
  9.9 |  ██ █    █ █  █  ███     █  █ █           █   █      █   █         █   █    ███
  9.9 |  ██ ██  ██ ██ ██ ███ █   ████ █  █        █   ██   █ █  ██     █  ██   █ ██ ███
  9.9 |█ ██ ██ ███ ██ ██ ███ █ ██████ ██ █   █    █  ███ ███ █████     █  ███  █ ██████
  9.8 |█ ██ ██ ███ ██ ████████ ██████ █████  █ █  █  ███ ███ ██████  ███  ████ █ ██████
  9.8 |████ ██ ██████ ████████ ██████ █████ ██ ████ ████████ ███████ ███ █████ ████████
  9.8 |██████████████ ██████████████████████████████████████ ███████████ █████ ████████
  9.8 |██████████████ ██████████████████████████████████████ ██████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms |   2
  86 ms |   2
  87 ms |   4
  88 ms |   2
  89 ms | █  7
  90 ms | █  10
  91 ms | █  13
  92 ms | ██  21
  93 ms | ██  28
  94 ms | ███  31
  95 ms | ███  31
  96 ms | ██  30
  97 ms | ███  33
  98 ms | ██████████  119
  99 ms | ███████████████████████████████████  428
 100 ms | ████████████████████████████████████████  496
 101 ms | ███████████  131
 102 ms | ██  25
 103 ms | █  8
 104 ms |   6
 105 ms | █  11
 106 ms | █  8
 107 ms | █  14
 108 ms | █  12
 109 ms | ███  32
 110 ms | ████  51
 111 ms | ██████  76
 112 ms | ████  50
 113 ms | ██  24
 114 ms | █  12
 115 ms | █  7
 116 ms |   1
 117 ms |   6
 118 ms |   4
 119 ms |   2
 120 ms |   6
 121 ms |   5
 122 ms |   6
 123 ms |   4
 124 ms |   4
 125 ms |   2
 126 ms |   1
 128 ms |   1
 129 ms |   2
 131 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `fps_1pct_low` = `7.98`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
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
- `fps_0p1pct_low` = `7.66`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194435 ms  |  Sample ticks: 3600

**FPS**  avg `9.84`, min `8.23`, p50 `9.98`, p95 `10.59`, p99 `10.99`, 1%low `8.44`, 0.1%low `8.27`, std `0.52`

**Frame time (ms)**  avg `101.87`, p50 `100.19`, p95 `112.36`, p99 `116.70`, p99.9 `120.28`, max `121.44`

**Client tick (ms)**  avg `0.64`, p95 `1.14`, max `1.83`

**Memory**  start `1784 MB`, end `781 MB`, peak `1912 MB`, GC `14 events / 70 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |         █                                                                      
 10.0 |         █                                                                      
  9.9 | █       █                                                █                     
  9.9 | █       █      █             █         █   █             ██         █    █     
  9.9 | █   █   ██  █  █    █ █ █    █      ██ █   █    █        ██         █    █     
  9.9 | █   █   ██  █  █  █ █ █ █    █      ██ █   █  ███ █   █  ██ █   █   █ █  █    █
  9.8 | █   █  ████ ██ █  █ █ █ █    █ █    ██ █  ██ ███████ ██  ████  ██ █ █ █  █ █  █
  9.8 | ██████ ███████ ██████ █ ████ ██████ █████████████████████████ █████ █ █ ███████
  9.8 | █████████████████████ █ ███████████ ███████████████████████████████ ███████████
  9.8 | █████████████████████ █ ███████████ ███████████████████████████████████████████
  9.8 | ███████████████████████████████████████████████████████████████████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms |   1
  88 ms |   2
  89 ms |   5
  90 ms | █  10
  91 ms | █  17
  92 ms | █  17
  93 ms | ██  21
  94 ms | ██  25
  95 ms | ████  49
  96 ms | ████  44
  97 ms | █████  54
  98 ms | ██████████  116
  99 ms | ███████████████████████████████████  401
 100 ms | ████████████████████████████████████████  460
 101 ms | ██████████  120
 102 ms | ██  28
 103 ms | █  9
 104 ms |   3
 105 ms | █  8
 106 ms |   3
 107 ms | █  13
 108 ms | ██  21
 109 ms | ███  37
 110 ms | ██████  74
 111 ms | █████████  108
 112 ms | █████  63
 113 ms | ██  23
 114 ms | █  10
 115 ms |   5
 116 ms |   5
 117 ms | █  6
 118 ms |   2
 119 ms |   3
 120 ms |   3
 121 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `fps_1pct_low` = `8.44`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `91.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `20.00`
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
- `fps_0p1pct_low` = `8.27`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193715 ms  |  Sample ticks: 3600

**FPS**  avg `9.85`, min `7.92`, p50 `9.99`, p95 `10.68`, p99 `11.04`, 1%low `8.41`, 0.1%low `7.92`, std `0.55`

**Frame time (ms)**  avg `101.82`, p50 `100.15`, p95 `112.73`, p99 `116.86`, p99.9 `123.76`, max `126.29`

**Client tick (ms)**  avg `0.64`, p95 `1.16`, max `7.34`

**Memory**  start `1465 MB`, end `790 MB`, peak `1861 MB`, GC `14 events / 72 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |           █                                                                    
  9.9 |           █                                                                    
  9.9 |           █            █          █     █                       █              
  9.9 |        █  █         █  █ █    █   █     █                    ██ █     █        
  9.9 |  ███   █  █ █  █   ███ █ █    ██  █ █   █ █   █      █       ██ █     █   █    
  9.9 |  ███   █  █ █ ██  ██████ █    ██  █ █   █ █  ███     █  ███  ████  █  █   ███  
  9.8 |█ ███   █  ███ ██  ██████ ███ ███ ██ █   █ █ ████  █  █  ███  ████  █  █   ████ 
  9.8 |███████ ██ ██████  ██████ ███ ███ ██ █ █ ███ ████ ██  ██ ████ ████ ██ ███ █████ 
  9.8 |██████████ ███████ ██████████ ████████ █ ███████████ ████████ █████████████████ 
  9.8 |█████████████████████████████ ███████████████████████████████ ██████████████████
  9.8 |█████████████████████████████████████████████████████████████ ██████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  77 ms |   1
  80 ms |   1
  82 ms |   1
  86 ms |   1
  89 ms | █  8
  90 ms | █  10
  91 ms | ██  25
  92 ms | ██  27
  93 ms | ███  37
  94 ms | ██  23
  95 ms | ███  38
  96 ms | ███  33
  97 ms | ███  32
  98 ms | █████████  112
  99 ms | ████████████████████████████████████  425
 100 ms | ████████████████████████████████████████  473
 101 ms | ██████████  116
 102 ms | █  14
 103 ms | █  10
 104 ms |   1
 105 ms |   3
 106 ms |   1
 107 ms |   5
 108 ms | ██  26
 109 ms | ███  41
 110 ms | ██████  69
 111 ms | ███████  84
 112 ms | ██████  73
 113 ms | ██  19
 114 ms | ██  18
 115 ms | █  12
 116 ms | █  12
 117 ms | █  12
 118 ms |   1
 119 ms |   1
 123 ms |   1
 126 ms |   2
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `fps_1pct_low` = `8.41`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `91.00`
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
- `entity_count_sample_start` = `70.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.92`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194765 ms  |  Sample ticks: 3600

**FPS**  avg `9.87`, min `7.60`, p50 `9.99`, p95 `10.69`, p99 `11.06`, 1%low `8.25`, 0.1%low `7.66`, std `0.56`

**Frame time (ms)**  avg `101.70`, p50 `100.10`, p95 `112.88`, p99 `118.53`, p99.9 `127.17`, max `131.50`

**Client tick (ms)**  avg `0.64`, p95 `1.09`, max `1.76`

**Memory**  start `1668 MB`, end `729 MB`, peak `1930 MB`, GC `14 events / 63 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |             █                                                                  
 10.0 |             █                                                                  
 10.0 |             █                                                                  
  9.9 |           █ █           █          █                      █                    
  9.9 |           █ █        █  █ █ █      █      █  ██ █         █            █    █  
  9.9 | █         █ ██  █   ██  █ █ █   █  █   █  █  ██ █  █    ███ █        █ █   ██  
  9.9 | █        ██ ██  █  ███  █ █ █  ███ █   █  █  ██ █  █  █ ███ █  █ █   █ █   ██  
  9.9 | ██ █  █████ █████  ███  █ █ █ ███████  █ ███ ████  ██ █████ █  █ █   █ █   ██ █
  9.8 | ██████████████████ ███ ██ █ █ ████████ █ ███ ████████ █████ ██████ ███ ██  ██ █
  9.8 | ██████████████████ ██████ ██████████████ ██████████████████████████████████████
  9.8 |███████████████████ ██████ █████████████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  78 ms |   1
  82 ms |   2
  84 ms |   1
  87 ms |   2
  88 ms |   3
  89 ms | █  8
  90 ms | █  12
  91 ms | ██  19
  92 ms | ██  25
  93 ms | ███  31
  94 ms | ███  35
  95 ms | ████  45
  96 ms | ████  45
  97 ms | ██████  60
  98 ms | ███████████  116
  99 ms | ██████████████████████████████████████  412
 100 ms | ████████████████████████████████████████  429
 101 ms | ████████████  124
 102 ms | ██  21
 103 ms |   3
 104 ms |   3
 105 ms |   1
 106 ms |   3
 107 ms | █  7
 108 ms | ██  17
 109 ms | ████  48
 110 ms | ███████  80
 111 ms | ███████  72
 112 ms | ██████  61
 113 ms | ██  26
 114 ms | █  12
 115 ms | █  9
 116 ms | █  8
 117 ms | █  8
 118 ms | █  8
 119 ms | █  6
 120 ms |   2
 121 ms |   2
 126 ms |   1
 129 ms |   1
 131 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.83`
- `fps_1pct_low` = `8.25`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `15.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `74.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.66`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`

