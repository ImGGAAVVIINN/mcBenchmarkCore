# MC Benchmark Core session — 2026-09-22T09:35:59.211343524+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 114.1 | 18.7 | 14.3 | 48.71 | 1.16 | 99 | 2171 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 109.8 | 17.7 | 15.4 | 52.32 | 1.02 | 83 | 2723 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 30.0 | 12.4 | 10.6 | 72.09 | 0.97 | 88 | 2274 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 31.4 | 11.1 | 10.5 | 82.32 | 1.22 | 80 | 1917 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 30.4 | 11.2 | 8.9 | 76.16 | 1.02 | 74 | 2600 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.2 | 12.6 | 10.0 | 68.50 | 0.68 | 62 | 2788 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 31.5 | 11.5 | 11.2 | 79.73 | 1.17 | 62 | 611 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 31.5 | 11.3 | 10.0 | 83.02 | 1.68 | 53 | 2029 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 31.8 | 10.2 | 9.6 | 92.20 | 4.28 | 56 | 1498 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 34.8 | 10.6 | 10.5 | 90.91 | 5.35 | 45 | 276 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 32.9 | 11.7 | 10.5 | 78.63 | 1.35 | 53 | 982 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 33.4 | 12.7 | 11.1 | 74.89 | 0.69 | 51 | 28 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 37.2 | 11.2 | 10.6 | 84.05 | 5.27 | 58 | 2013 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 37.3 | 11.0 | 10.4 | 84.25 | 4.61 | 55 | 522 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 32.2 | 10.3 | n/a | 90.85 | 20.29 | 51 | 1594 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 31.0 | 9.9 | n/a | 92.28 | 20.34 | 51 | 2903 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 35.1 | 11.4 | 10.6 | 80.19 | 2.82 | 69 | 2823 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 33.2 | 11.8 | 11.0 | 77.38 | 2.71 | 69 | 2469 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 29.0 | 7.5 | n/a | 120.82 | 1.03 | 93 | 1756 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 9.7 | 2.3 | n/a | 130.46 | 0.53 | 126 | 2036 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 9.7 | 2.3 | n/a | 132.37 | 0.48 | 126 | 589 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 10.1 | 1.3 | n/a | 243.25 | 0.64 | 137 | 1169 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 9.4 | 1.4 | n/a | 715.30 | 0.44 | 215 | 552 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 9.9 | 2.0 | n/a | 134.91 | 0.58 | 77 | 554 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 10.5 | 1.2 | n/a | 795.77 | 0.54 | 76 | 336 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 95.7 | 1.4 | 1.4 | 684.79 | 0.53 | 78 | 414 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 109.0 | 1.4 | 1.3 | 689.83 | 0.51 | 73 | 459 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 31.4 | 1.7 | n/a | 73.42 | 0.48 | 84 | 587 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 32.8 | 1.4 | n/a | 716.82 | 0.56 | 74 | 363 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 32.7 | 1.4 | n/a | 707.72 | 0.60 | 79 | 172 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 31.6 | 1.3 | n/a | 767.32 | 0.42 | 76 | 439 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 31.9 | 1.3 | n/a | 763.98 | 0.51 | 74 | 378 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 30.4 | 1.3 | n/a | 756.38 | 0.35 | 77 | 233 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 36.7 | 1.3 | n/a | 720.44 | 0.46 | 78 | 58 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 35.1 | 1.3 | n/a | 753.86 | 2.10 | 81 | 330 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 92.4 | 1.3 | n/a | 750.20 | 0.52 | 198 | 496 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

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

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `114.14`, min `12.79`, p50 `114.01`, p95 `224.74`, p99 `497.92`, 1%low `18.74`, 0.1%low `14.31`, std `83.33`

**Frame time (ms)**  avg `12.62`, p50 `8.77`, p95 `27.92`, p99 `48.71`, p99.9 `57.89`, max `78.16`

**Client tick (ms)**  avg `1.16`, p95 `2.11`, max `22.41`

**Memory**  start `1561 MB`, end `2092 MB`, peak `3732 MB`, GC `99 events / 1539 ms`

**FPS over sampling window (ASCII):**

```
146.9 |                                                   █             █              
141.8 |                                         █  █      █           █ █              
136.8 |              █           █      █       █  █      █       █   █ █ █           █
131.8 |              █           ██     █    █  █  █      ██   █  █   █ ███          ██
126.7 |    ██        █           ██  █  █    █  █  █      ██   █  █   █ ███         ███
121.7 |█   ██        █          ████ █  █    █  █  █      ██   ██ █   █ ████        ███
116.7 |██  ██        █          ████ █  ██   █  █  █    █ ██ █ ██ █   █ █████    █  ███
111.6 |██ ███     ██ █ █        ████ █  ██  ██  █  █    █ ██ ████ █ ███ █████  ███ ████
106.6 |██████ ██  ██ ██████   ██████ █  ██ ██████  ██ █ █ ██ ██████ ███ █████  ███ ████
101.6 |██████████ ███████████ ██████ █  ██ ████████████ ████ ██████ ███ █████  ███ ████
 96.5 |███████████████████████████████ ████████████████████████████████ ██████ ████████
 91.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  16
   2 ms | ██  28
   3 ms | ██  26
   4 ms | █  16
   5 ms | ███  37
   6 ms | ██████  71
   7 ms | ███████████████  188
   8 ms | ████████████████████████████████████████  504
   9 ms | ███████████████  192
  10 ms | ████  48
  11 ms | █  17
  12 ms | █  7
  13 ms |   6
  14 ms |   6
  15 ms |   3
  16 ms |   1
  17 ms | ██  24
  18 ms | ██  27
  19 ms | ███  39
  20 ms | ███  37
  21 ms | ███  44
  22 ms | ████  50
  23 ms | ███  38
  24 ms | ██  28
  25 ms | ██  22
  26 ms | ██  20
  27 ms | █  12
  28 ms | █  14
  29 ms | █  7
  30 ms |   4
  31 ms |   3
  32 ms |   5
  33 ms |   2
  34 ms |   2
  35 ms |   2
  36 ms |   2
  37 ms |   1
  38 ms |   1
  39 ms |   1
  40 ms |   3
  41 ms |   1
  42 ms |   1
  43 ms |   2
  44 ms |   3
  45 ms |   2
  46 ms |   4
  47 ms |   1
  48 ms |   3
  49 ms |   4
  50 ms |   1
  51 ms |   3
  52 ms |   2
  54 ms |   1
  55 ms |   1
  61 ms |   1
  78 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 198 | 112.2 | 47.51 |
| `dragon_breath` | 160 | 198 | 109.8 | 38.55 |
| `end_rod` | 240 | 198 | 113.8 | 45.75 |
| `portal` | 160 | 198 | 113.4 | 48.69 |
| `ALL_TOGETHER` | 1680 | 198 | 111.7 | 42.56 |
| `sculk_charge_pop` | 240 | 198 | 115.5 | 48.80 |
| `smoke` | 160 | 198 | 119.1 | 45.70 |
| `flame` | 160 | 198 | 117.9 | 51.62 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `84.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `79.21`
- `fps_0p1pct_low` = `14.31`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `18.74`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `109.85`, min `14.49`, p50 `112.66`, p95 `201.42`, p99 `435.79`, 1%low `17.69`, 0.1%low `15.45`, std `70.43`

**Frame time (ms)**  avg `12.90`, p50 `8.88`, p95 `27.01`, p99 `52.32`, p99.9 `60.05`, max `69.00`

**Client tick (ms)**  avg `1.02`, p95 `1.87`, max `6.05`

**Memory**  start `2189 MB`, end `4374 MB`, peak `4913 MB`, GC `83 events / 1647 ms`

**FPS over sampling window (ASCII):**

```
143.7 |                   █                                                            
138.9 | █     █           █                                                            
134.0 |██     █           █                   █      █                                 
129.2 |██ █   █ █      ██ █            █      █      █                        █        
124.4 |██ █   █ █      ██ █     █      █  █   █      █                        █        
119.5 |██ █   █ █     ███ █     ██ █   █  █   █      █     █         █      █ █        
114.7 |████   █ ████  ███ █     ██ █   █ ███  █ ██   █     █         █ █    █ █        
109.8 |████   ███████ ███ █     ██ ██  █ ███  ████  ██    ██ █       █ █  █ █ █ ██     
105.0 |██████████████ ██████  █ █████ ██ ████ ████  ███  ███ █    █  ███  ███ ████    █
100.2 |██████████████ █████████ █████ ███████ ████ ████ ███████   ██████  ███ ████  █ █
 95.3 |████████████████████████ ██████████████████ █████████████ ██████████████████████
 90.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  7
   2 ms | ███  28
   3 ms | ███  26
   4 ms | ██  17
   5 ms | ██  24
   6 ms | ████████  77
   7 ms | ███████████████████████  231
   8 ms | ████████████████████████████████████████  409
   9 ms | ███████████████████  198
  10 ms | ██████  57
  11 ms | ██  22
  12 ms | █  12
  13 ms | █  7
  14 ms |   5
  15 ms |   5
  16 ms |   5
  17 ms | █  9
  18 ms | ██  22
  19 ms | ███  33
  20 ms | █████  47
  21 ms | ██████  58
  22 ms | █████  52
  23 ms | █████  50
  24 ms | ███  33
  25 ms | ██  24
  26 ms | █  14
  27 ms | █  10
  28 ms | █  6
  29 ms |   5
  30 ms |   5
  31 ms |   2
  32 ms |   5
  33 ms |   1
  34 ms |   2
  36 ms |   2
  37 ms |   2
  38 ms |   2
  41 ms |   1
  43 ms |   3
  44 ms |   1
  45 ms |   1
  46 ms |   3
  47 ms |   2
  49 ms |   4
  50 ms |   2
  51 ms |   2
  52 ms |   4
  53 ms |   2
  54 ms |   2
  55 ms |   2
  56 ms |   2
  58 ms |   1
  59 ms |   2
  60 ms |   1
  68 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `15.45`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `77.49`
- `preload_duration_ms` = `85.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.69`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23065 ms  |  Sample ticks: 400

**FPS**  avg `30.02`, min `10.64`, p50 `29.02`, p95 `48.59`, p99 `89.35`, 1%low `12.42`, 0.1%low `10.64`, std `19.35`

**Frame time (ms)**  avg `37.82`, p50 `34.46`, p95 `58.49`, p99 `72.09`, p99.9 `88.90`, max `93.96`

**Client tick (ms)**  avg `0.97`, p95 `1.70`, max `6.95`

**Memory**  start `2283 MB`, end `2637 MB`, peak `4557 MB`, GC `88 events / 1850 ms`

**FPS over sampling window (ASCII):**

```
 69.3 |                                                    █                           
 65.1 |                                                    █                           
 60.9 |                                  █                 █                           
 56.8 |                                  █                 █                           
 52.6 |█     █                           █                 █                           
 48.4 |█     █                           █                 █                           
 44.2 |█     █              █            █                 █                           
 40.1 |█     █              █            █ █              ██                           
 35.9 |█     █              █     █      █ █              ██                       █   
 31.7 |█   █ █    █ █       ███  ██ █  █ █ ██  █ █  █     ██  █        █ █  █  █   █ ██
 27.5 |█████ ██████████████████████ ████ ███████████████████████  █████████ ███████████
 23.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
   4 ms |   1
   5 ms |   1
   6 ms |   1
   9 ms |   1
  11 ms | █  2
  12 ms |   1
  13 ms |   1
  14 ms | █  2
  15 ms | █  3
  16 ms | █  2
  17 ms | ███  6
  18 ms | ██  4
  20 ms | █  2
  21 ms | ██  5
  22 ms |   1
  23 ms | ██  4
  24 ms |   1
  25 ms | █  3
  26 ms | █  2
  27 ms | █  2
  28 ms | ██  5
  29 ms | ██  4
  30 ms | ██████  14
  31 ms | ████████  19
  32 ms | ██████████████████████████  59
  33 ms | ████████████████████████████████████████  92
  34 ms | ████████████████████  46
  35 ms | █████████  21
  36 ms | ███████  16
  37 ms | ███████  16
  38 ms | ██  4
  39 ms | ███████  16
  40 ms | █████  12
  41 ms | ███  8
  42 ms | ███  8
  43 ms | █████  12
  44 ms | ███████  16
  45 ms | ████  10
  46 ms | ███  8
  47 ms | ████  9
  48 ms | ███████  15
  49 ms | ████  10
  50 ms | ███  7
  51 ms | ███  7
  52 ms | ███  8
  53 ms | ██  4
  54 ms | ██  5
  56 ms | █  2
  57 ms | █  3
  58 ms |   1
  59 ms | █  3
  60 ms | █  3
  61 ms | █  2
  62 ms | █  2
  63 ms | █  2
  64 ms |   1
  65 ms |   1
  66 ms |   1
  67 ms |   1
  68 ms | █  2
  70 ms |   1
  71 ms |   1
  72 ms | █  2
  73 ms |   1
  78 ms |   1
  84 ms |   1
  93 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `10.64`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.44`
- `preload_duration_ms` = `51.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `12.42`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `31.38`, min `10.48`, p50 `27.96`, p95 `62.97`, p99 `111.57`, 1%low `11.12`, 0.1%low `10.48`, std `23.21`

**Frame time (ms)**  avg `37.87`, p50 `35.76`, p95 `61.90`, p99 `82.32`, p99.9 `93.19`, max `95.46`

**Client tick (ms)**  avg `1.22`, p95 `1.77`, max `34.01`

**Memory**  start `2837 MB`, end `4501 MB`, peak `4755 MB`, GC `80 events / 1608 ms`

**FPS over sampling window (ASCII):**

```
 79.3 |           █                                                                    
 74.1 |           █                                                                    
 69.0 |           █                                                                    
 63.9 |           █                                                                    
 58.8 |           █                                                                    
 53.7 |           █          █                                             █           
 48.6 |           █          █       █                            █        █           
 43.4 |          ██          █       █                            █        █           
 38.3 |    █     ██          █       █      ██  █           █    ██       ██           
 33.2 |  █ ███ █ ██   ██ █ █ █     █ █  █   ██  █          ███ █ ██ █   █ ██  █  █  █  
 28.1 |███ █████ █████████████ ███ ████████ ███ ████████ █████ ██████████████ █████████
 23.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
   4 ms | █  1
   5 ms | █  1
   6 ms | █  2
   8 ms | █  1
   9 ms | █  2
  10 ms | █  2
  12 ms | █  2
  13 ms | ██  3
  14 ms | █████  7
  15 ms | ███  5
  16 ms | ███  4
  17 ms | ███  4
  18 ms | ███  5
  19 ms | █  1
  20 ms | █  2
  21 ms | █████  8
  22 ms | ██  3
  23 ms | █  1
  24 ms | ██  3
  26 ms | █████  7
  27 ms | ████  6
  28 ms | ███  4
  29 ms | ███████  10
  30 ms | ████████  12
  31 ms | █████████████  20
  32 ms | ████████████████████████████████████████  61
  33 ms | ████████████████████████  37
  34 ms | █████████████████████  32
  35 ms | █████████████  20
  36 ms | ███████████████  23
  37 ms | ████████████  19
  38 ms | ██████████  15
  39 ms | ████████████  18
  40 ms | ██████████  16
  41 ms | ████████  12
  42 ms | █████████  13
  43 ms | █████████  14
  44 ms | ██████  9
  45 ms | ████████████  18
  46 ms | ███████  11
  47 ms | ████  6
  48 ms | ████████  12
  49 ms | █████  8
  50 ms | ████████  12
  51 ms | ███  5
  52 ms | ███  5
  53 ms | ███  5
  54 ms | ████  6
  55 ms | █  1
  56 ms | █  2
  57 ms | █  2
  58 ms | █  1
  59 ms | █  2
  63 ms | █  1
  64 ms | ███  4
  65 ms | █  2
  66 ms | ███  4
  68 ms | █  1
  69 ms | █  1
  70 ms | █  2
  71 ms | ██  3
  73 ms | █  1
  77 ms | █  1
  78 ms | █  1
  83 ms | █  1
  84 ms | █  1
  88 ms | █  1
  90 ms | █  1
  91 ms | █  1
  95 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `10.48`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.41`
- `preload_duration_ms` = `66.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `11.12`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `30.42`, min `8.86`, p50 `28.44`, p95 `55.09`, p99 `104.33`, 1%low `11.24`, 0.1%low `8.86`, std `21.28`

**Frame time (ms)**  avg `37.97`, p50 `35.16`, p95 `57.07`, p99 `76.16`, p99.9 `100.12`, max `112.93`

**Client tick (ms)**  avg `1.02`, p95 `1.68`, max `30.57`

**Memory**  start `2780 MB`, end `4005 MB`, peak `5380 MB`, GC `74 events / 1663 ms`

**FPS over sampling window (ASCII):**

```
 74.1 |                                                                    █           
 69.2 |                                                                    █           
 64.4 |                                    █                               █           
 59.5 |                                    █                               █           
 54.6 |                                    █         █                     █           
 49.8 |                                    █         █                     █           
 44.9 |              █                     █         █                     █     █     
 40.1 |     █        █      █              █      █  █                     █     █     
 35.2 |     █    █ █ █      █   █    █     █      █  ██ █         █        █     █     
 30.3 |  █  ██████ █ █   █  ██  █  ███ ██████ ██████ ████ ████  █ █  ██   ██ █ ███  █ █
 25.5 |████ ███████████████████████████████████████████████████████████████████████████
 20.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  2
   5 ms | █  1
   7 ms | █  2
   9 ms | █  1
  10 ms | ██  3
  12 ms | █  1
  13 ms | █  1
  14 ms | █  1
  15 ms | ██  3
  16 ms | ████  6
  17 ms | ███  4
  18 ms | ████  7
  19 ms | █████  8
  20 ms | █  2
  21 ms | █  1
  22 ms | █  2
  23 ms | █  1
  24 ms | █  1
  27 ms | █  2
  29 ms | ██  3
  30 ms | ██████████  15
  31 ms | ██████████  16
  32 ms | █████████████████████████████████████  59
  33 ms | ████████████████████████████████████████  63
  34 ms | ██████████████████████████████████  54
  35 ms | ████████████████  25
  36 ms | ████████████  19
  37 ms | █████████  14
  38 ms | ███████  11
  39 ms | █████████  14
  40 ms | ██████████  15
  41 ms | ███████  11
  42 ms | ██████  9
  43 ms | ██████  9
  44 ms | ██████████  15
  45 ms | ██████████  16
  46 ms | ████████  13
  47 ms | ██████████  15
  48 ms | ██████████  16
  49 ms | ███████████  18
  50 ms | ██████  9
  51 ms | ██  3
  52 ms | ██  3
  53 ms | █  2
  54 ms | █  1
  55 ms | █  1
  56 ms | █  2
  57 ms | ██  3
  59 ms | ████  6
  60 ms | █  2
  62 ms | █  2
  65 ms | █  1
  66 ms | █  1
  68 ms | █  2
  69 ms | █  2
  71 ms | █  1
  75 ms | █  1
  76 ms | █  1
  78 ms | █  1
  81 ms | █  1
  83 ms | █  1
  88 ms | █  1
 112 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `8.86`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.34`
- `preload_duration_ms` = `66.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `11.24`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `29.21`, min `9.98`, p50 `28.13`, p95 `54.64`, p99 `73.48`, 1%low `12.61`, 0.1%low `9.98`, std `17.01`

**Frame time (ms)**  avg `38.28`, p50 `35.55`, p95 `54.96`, p99 `68.50`, p99.9 `88.54`, max `100.15`

**Client tick (ms)**  avg `0.68`, p95 `1.12`, max `2.09`

**Memory**  start `2583 MB`, end `4564 MB`, peak `5371 MB`, GC `62 events / 1410 ms`

**FPS over sampling window (ASCII):**

```
 66.3 |                                                      █                         
 62.4 |                                                      █                         
 58.5 |                                                      █                         
 54.5 |                                                      █ █                       
 50.6 |                                                      █ █                       
 46.7 |                                                      █ █                       
 42.8 |    █                                                 █ █                       
 38.9 |    █                                                 █ █      █                
 35.0 | █  █       █                      █            █     █ █      █                
 31.1 | █ ███    █ █      █     ██  ████ ██   █      █ █  ██ ███  █ █ █    █      █  █ 
 27.2 |██████  ████████████████████████████████████  ███████ ████████ ██ ██████████████
 23.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
   4 ms |   1
   8 ms |   1
  10 ms |   1
  13 ms | █  2
  14 ms | █  2
  15 ms | █  2
  16 ms | ████  9
  17 ms | ██  4
  18 ms | ███  8
  19 ms | ██  4
  21 ms | █  3
  25 ms |   1
  27 ms |   1
  29 ms | █  3
  30 ms | ████  10
  31 ms | █████  12
  32 ms | ███████████████████  45
  33 ms | ████████████████████████████████████████  93
  34 ms | ███████████████████  45
  35 ms | ██████████  24
  36 ms | █████████  20
  37 ms | ██████  14
  38 ms | ██████  14
  39 ms | ████  9
  40 ms | █████  11
  41 ms | ████████  18
  42 ms | ██████  14
  43 ms | ████  9
  44 ms | ██████  13
  45 ms | ██████  14
  46 ms | ████████  19
  47 ms | ██████  15
  48 ms | ████████  19
  49 ms | ██████  14
  50 ms | ███  7
  51 ms | ██  5
  52 ms | █  3
  53 ms |   1
  54 ms | ███  6
  55 ms | █  3
  57 ms | █  2
  59 ms | ██  4
  60 ms | █  2
  62 ms | █  2
  63 ms | █  2
  64 ms |   1
  65 ms | ██  4
  69 ms |   1
  70 ms |   1
  73 ms |   1
  74 ms |   1
  77 ms |   1
 100 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `9.98`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.12`
- `preload_duration_ms` = `89.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `12.61`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `31.51`, min `11.16`, p50 `28.23`, p95 `58.24`, p99 `123.42`, 1%low `11.54`, 0.1%low `11.16`, std `33.37`

**Frame time (ms)**  avg `38.09`, p50 `35.42`, p95 `58.17`, p99 `79.73`, p99.9 `89.14`, max `89.60`

**Client tick (ms)**  avg `1.17`, p95 `1.96`, max `34.18`

**Memory**  start `5249 MB`, end `4197 MB`, peak `5861 MB`, GC `62 events / 1360 ms`

**FPS over sampling window (ASCII):**

```
101.7 |                                                      █                         
 94.4 |                                                      █                         
 87.1 |                                                      █                         
 79.8 |                                                      █                         
 72.5 |                                                      █                         
 65.2 |                                                      █                    █    
 58.0 |                                                      █                    █    
 50.7 |                                      █               █                 █  █    
 43.4 |                                      █         █     █                 █  █    
 36.1 |        █       ██ █         █ █      █         █    ██     ███ █   █ █ ██ █    
 28.8 |█████████████████████ █████ ████████████ █████ ████████ ██████████████████ █████
 21.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   2 ms | █  1
   4 ms | █  1
   5 ms | █  1
   6 ms | █  1
   7 ms | █  1
   8 ms | █  1
  10 ms | █  2
  11 ms | █  1
  14 ms | █  1
  15 ms | ███  5
  16 ms | ██████  10
  17 ms | ██  3
  18 ms | ███  4
  19 ms | ██  3
  20 ms | ███  4
  21 ms | ███  4
  23 ms | █  2
  25 ms | █  2
  27 ms | █  1
  28 ms | █  2
  29 ms | ███  5
  30 ms | ██████  10
  31 ms | ██████████  15
  32 ms | ███████████████████████████████████  54
  33 ms | ████████████████████████████████████████  62
  34 ms | ███████████████████████████████  48
  35 ms | ████████████████████  31
  36 ms | ██████████████  21
  37 ms | ████████████  19
  38 ms | ███████████  17
  39 ms | ███████████  17
  40 ms | ██████  9
  41 ms | ████  6
  42 ms | ██████  9
  43 ms | ██████████  15
  44 ms | ███████  11
  45 ms | ████████  13
  46 ms | ████████  12
  47 ms | █████████████  20
  48 ms | ██████████████  21
  49 ms | ██████  10
  50 ms | █████  7
  51 ms | ███  5
  52 ms | █  1
  53 ms | ███  5
  54 ms | █  2
  57 ms | █  2
  58 ms | ██  3
  59 ms | █  1
  61 ms | █  1
  62 ms | █  2
  63 ms | █  1
  64 ms | █  1
  65 ms | ██  3
  66 ms | █  1
  70 ms | ██  3
  71 ms | █  1
  74 ms | █  2
  77 ms | █  1
  78 ms | █  1
  80 ms | █  1
  83 ms | █  1
  84 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `11.16`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.25`
- `preload_duration_ms` = `38.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `11.54`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `31.48`, min `10.00`, p50 `28.48`, p95 `64.14`, p99 `100.60`, 1%low `11.33`, 0.1%low `10.00`, std `18.05`

**Frame time (ms)**  avg `37.60`, p50 `35.11`, p95 `60.54`, p99 `83.02`, p99.9 `94.47`, max `100.03`

**Client tick (ms)**  avg `1.68`, p95 `2.50`, max `33.20`

**Memory**  start `4054 MB`, end `3936 MB`, peak `6083 MB`, GC `53 events / 1301 ms`

**FPS over sampling window (ASCII):**

```
 70.3 |   █                                                                            
 66.2 |   █                                                                            
 62.1 |   █                                                                            
 58.0 |   █                                                                            
 53.9 |   █                                                              █             
 49.8 |   █                                                              █             
 45.6 |   █                                                              █             
 41.5 |   █                                        █               █     █   █     █   
 37.4 |   █               █    █      █      ██    █               █ █   █   █     █  █
 33.3 |  ██      █  █  █  █ █  █  ██  █      ██    █   █   █    █ ██ ██ ██   ██   ██  █
 29.2 |████  ███ ██ █ ██ █████ █ ███████ ███████ ███████ ██████ ███████ ███████ █ █████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   6 ms | █  1
   7 ms | █  1
   9 ms | ███  3
  10 ms | ███  4
  11 ms | ███  3
  12 ms | ███  4
  13 ms | ███  3
  14 ms | ██  2
  15 ms | ████████  9
  16 ms | ███  4
  17 ms | ████  5
  18 ms | ███  3
  19 ms | █████  6
  20 ms | ███  4
  21 ms | ██████  7
  22 ms | ███  3
  23 ms | ███  3
  24 ms | ██████  7
  25 ms | ██████  7
  26 ms | ████  5
  27 ms | ███████  8
  28 ms | ████████  9
  29 ms | ████████  9
  30 ms | █████████████  16
  31 ms | ███████████████████████  27
  32 ms | ██████████████████  22
  33 ms | █████████████████████████████████  40
  34 ms | ████████████████████████████████████████  48
  35 ms | ████████████████████████  29
  36 ms | ██████████████████  22
  37 ms | ███████████  13
  38 ms | █████████████  16
  39 ms | ████████████  14
  40 ms | ████  5
  41 ms | ██████  7
  42 ms | ███  3
  43 ms | ██████  7
  44 ms | █████████████  16
  45 ms | ████████  10
  46 ms | ████████  10
  47 ms | ████████  10
  48 ms | █████████  11
  49 ms | ██████████  12
  50 ms | ███████  8
  51 ms | █████████  11
  52 ms | ████████  10
  53 ms | ███████  8
  54 ms | █  1
  55 ms | ██  2
  56 ms | ███  4
  57 ms | ███  3
  58 ms | █████  6
  59 ms | ██  2
  60 ms | █  1
  61 ms | ███  3
  62 ms | █  1
  64 ms | █  1
  66 ms | ██  2
  67 ms | ███  4
  68 ms | █  1
  69 ms | ███  3
  71 ms | ██  2
  76 ms | █  1
  78 ms | █  1
  81 ms | █  1
  82 ms | █  1
  83 ms | ███  3
  85 ms | █  1
  89 ms | █  1
 100 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `10.00`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.60`
- `preload_duration_ms` = `36.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `11.33`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `31.83`, min `9.59`, p50 `27.21`, p95 `65.60`, p99 `117.10`, 1%low `10.16`, 0.1%low `9.59`, std `22.54`

**Frame time (ms)**  avg `38.19`, p50 `36.75`, p95 `61.03`, p99 `92.20`, p99.9 `101.46`, max `104.28`

**Client tick (ms)**  avg `4.28`, p95 `5.72`, max `43.33`

**Memory**  start `4868 MB`, end `3780 MB`, peak `6366 MB`, GC `56 events / 1351 ms`

**FPS over sampling window (ASCII):**

```
 71.1 |                █                                                               
 66.5 |                █                                                               
 62.0 |                █                                                               
 57.5 |                █                                                               
 53.0 |           █    █                   █                 █                         
 48.5 |           █    █                   █             █   █                         
 44.0 |           █    █                   █     █       █   █                         
 39.5 |           █    █         █         █     █  █    █   █  █                    █ 
 35.0 | █  █     ██   ██ █       █         █     █  █ █  █   █  █    █    █   ███   ██ 
 30.5 | ██ █   ████ ████ ██ ████ ███ ██ █ ███ █ █████ █ ██  ██ ████ ██ ██ ███ ███   ███
 26.0 |██████████████████████████████████████████████ █████████████████████████████████
 21.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   5 ms | ████  3
   6 ms | █  1
   8 ms | █  1
   9 ms | ███  2
  10 ms | ███  2
  11 ms | █  1
  12 ms | █  1
  13 ms | █████  4
  14 ms | █████████████  10
  15 ms | █████████  7
  16 ms | ███████████  9
  17 ms | ██████████  8
  18 ms | ███████████  9
  19 ms | ████  3
  21 ms | ███  2
  22 ms | ████  3
  24 ms | █  1
  26 ms | █  1
  27 ms | ██████  5
  28 ms | ████████████████  13
  29 ms | ███████████████  12
  30 ms | ████████████████████████████████████████  32
  31 ms | █████████████████████████████████  26
  32 ms | ██████████████████████████████████████  30
  33 ms | █████████████████████████████  23
  34 ms | █████████████████████  17
  35 ms | ████████████████████████  19
  36 ms | ██████████████████████████  21
  37 ms | ████████████████████████  19
  38 ms | ████████████████  13
  39 ms | ██████████████████  14
  40 ms | █████████  7
  41 ms | ███████████████████████  18
  42 ms | ██████████████  11
  43 ms | ██████████████  11
  44 ms | ███████████████  12
  45 ms | █████████████████████████  20
  46 ms | ████████████████████  16
  47 ms | ███████████████████  15
  48 ms | ███████████████████  15
  49 ms | ███████████████████  15
  50 ms | █████████████  10
  51 ms | ████  3
  52 ms | █████████  7
  53 ms | ██████  5
  54 ms | █████████  7
  55 ms | █████  4
  56 ms | █████  4
  57 ms | █  1
  58 ms | █  1
  59 ms | █  1
  60 ms | █  1
  61 ms | █████  4
  62 ms | █  1
  63 ms | ███  2
  64 ms | ███  2
  65 ms | █  1
  67 ms | █  1
  68 ms | ███  2
  69 ms | █  1
  70 ms | █  1
  72 ms | █  1
  75 ms | ███  2
  77 ms | ███  2
  82 ms | █  1
  95 ms | █  1
  96 ms | ████  3
  98 ms | █  1
 104 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `9.59`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.19`
- `preload_duration_ms` = `31.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `10.16`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `34.85`, min `10.48`, p50 `26.52`, p95 `84.39`, p99 `140.41`, 1%low `10.60`, 0.1%low `10.48`, std `26.79`

**Frame time (ms)**  avg `38.12`, p50 `37.71`, p95 `66.11`, p99 `90.91`, p99.9 `95.41`, max `95.46`

**Client tick (ms)**  avg `5.35`, p95 `8.30`, max `47.45`

**Memory**  start `6437 MB`, end `4687 MB`, peak `6713 MB`, GC `45 events / 1041 ms`

**FPS over sampling window (ASCII):**

```
 75.2 |            █                                                                   
 70.4 |            █                                                                   
 65.6 |            █                                                                █  
 60.8 |            █                                                                ██ 
 55.9 |            █                                                                ██ 
 51.1 |            █                                      █                         ██ 
 46.3 |            █                                   █  █                    █    ██ 
 41.5 |       █    █                             ██    ██ ██ █    █         █  █   ███ 
 36.7 | █  █  █ █ ██      █   █  █     █ █    █  ██  ████ ██████ ██  █ █ ██ █  ████████
 31.9 |██ ███ ███ ███    ██ █ █████  █ ███ █  █  ████████ ██████ █████ █ ████  ████████
 27.0 |██ ███ ███████ █████████████ ███████████ ███████████████████████████████████████
 22.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   5 ms | ██  1
   6 ms | ██████  3
   7 ms | ████  2
   8 ms | ██  1
   9 ms | █████████████  7
  10 ms | ███████████  6
  11 ms | █████████████████  9
  12 ms | ██████████  5
  13 ms | ███████████  6
  14 ms | █████████████  7
  15 ms | █████████████  7
  16 ms | ███████████████████  10
  17 ms | ██████████  5
  18 ms | ███████████████████  10
  19 ms | ██████████  5
  20 ms | ███████████████  8
  21 ms | █████████████  7
  22 ms | ██████████  5
  23 ms | ███████████  6
  24 ms | ███████████  6
  25 ms | ████████  4
  26 ms | ███████████████████████  12
  27 ms | █████████████████████████  13
  28 ms | █████████████████████  11
  29 ms | ███████████████████████████  14
  30 ms | ███████████████████  10
  31 ms | █████████████████████  11
  32 ms | █████████████████  9
  33 ms | █████████████████████  11
  34 ms | █████████████████████████  13
  35 ms | ████████████████████████████████████████  21
  36 ms | █████████████  7
  37 ms | ███████████████████████  12
  38 ms | ███████████████  8
  39 ms | ██████████████████████████████  16
  40 ms | █████████████████████  11
  41 ms | ███████████  6
  42 ms | █████████████████████████  13
  43 ms | █████████████████████████████  15
  44 ms | █████████████████████████  13
  45 ms | ███████████████████  10
  46 ms | █████████████████████████  13
  47 ms | ██████████████████████████████████  18
  48 ms | █████████████████  9
  49 ms | ███████████████████████  12
  50 ms | █████████████████████████  13
  51 ms | █████████████  7
  52 ms | █████████████████████████  13
  53 ms | ███████████████  8
  54 ms | █████████████  7
  55 ms | ███████████  6
  56 ms | ██████  3
  57 ms | ██████████  5
  58 ms | █████████████  7
  59 ms | ████  2
  60 ms | ██████  3
  61 ms | ████████  4
  62 ms | ████  2
  63 ms | ████  2
  64 ms | ████████  4
  65 ms | ██████  3
  66 ms | ██████  3
  67 ms | ████  2
  68 ms | ████  2
  69 ms | ██████████  5
  70 ms | ██  1
  71 ms | ██  1
  73 ms | ████  2
  76 ms | ██  1
  78 ms | ████  2
  84 ms | ██  1
  88 ms | ██  1
  91 ms | ██  1
  92 ms | ██  1
  93 ms | ██  1
  94 ms | ██  1
  95 ms | ████  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `10.48`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `40.00`
- `fps_harmonic_avg` = `26.23`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `10.60`
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

Category: **Entities**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `32.90`, min `10.45`, p50 `29.04`, p95 `63.78`, p99 `164.21`, 1%low `11.75`, 0.1%low `10.45`, std `27.36`

**Frame time (ms)**  avg `37.09`, p50 `34.43`, p95 `59.90`, p99 `78.63`, p99.9 `91.39`, max `95.69`

**Client tick (ms)**  avg `1.35`, p95 `2.02`, max `30.57`

**Memory**  start `5743 MB`, end `5215 MB`, peak `6726 MB`, GC `53 events / 1147 ms`

**FPS over sampling window (ASCII):**

```
 73.3 |             █                                                                  
 68.8 |             █    █                     █                                       
 64.3 |             █    █                     █        █                              
 59.8 |   █         █    █                     █        █                              
 55.3 |   █         █    █                     █        █                              
 50.8 |   █      █  █    █                     █        █                             █
 46.4 |   █      █  █    █                     █        █                     █       █
 41.9 |█  █      █  █    █                     █        █                     █       █
 37.4 |█  █    █ █  █    █  █     █         █  █  █    ██                █    █      ██
 32.9 |█  █    █ █  █  █ █ ██   █ █ █      ██  █ ██ █  ██   █ ██         ██ █ █   █ ███
 28.4 |███████ ███████ ██████████████████████ ███████████████ ████████ ████ █ █████████
 23.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ██  3
   4 ms | █  2
   6 ms | █  2
   7 ms | █  2
   8 ms | █  1
   9 ms | █  1
  10 ms | █  1
  11 ms | ██  3
  12 ms | █  2
  13 ms | ██  3
  14 ms | ██  3
  15 ms | ███  5
  16 ms | ██  3
  17 ms | ███  5
  18 ms | ██  3
  19 ms | ███  5
  20 ms | █  2
  21 ms | ███  5
  22 ms | █  2
  23 ms | ███  5
  24 ms | ██  4
  25 ms | ██  3
  26 ms | ██  4
  27 ms | ███  5
  28 ms | ████  7
  29 ms | ████  6
  30 ms | ██████████  17
  31 ms | ███████████████████████  38
  32 ms | ████████████████████████████████████████  65
  33 ms | ███████████████████████████  44
  34 ms | ██████████████████████████████  49
  35 ms | ████████████████  26
  36 ms | ██████████████  22
  37 ms | ███████  11
  38 ms | ███  5
  39 ms | ████  7
  40 ms | █████  8
  41 ms | ██████  10
  42 ms | ██████  9
  43 ms | ██████  10
  44 ms | ████  6
  45 ms | ███████  11
  46 ms | ████████  13
  47 ms | ██████  10
  48 ms | ███████  12
  49 ms | █████████  14
  50 ms | ██████  10
  51 ms | ████  7
  52 ms | ██  4
  53 ms | ██  4
  54 ms | █  1
  55 ms | █  1
  56 ms | █  2
  57 ms | ██  3
  58 ms | █  1
  59 ms | ███  5
  60 ms | █  1
  61 ms | █  1
  62 ms | █  1
  63 ms | █  2
  65 ms | █  2
  66 ms | █  1
  68 ms | █  1
  69 ms | █  2
  71 ms | █  1
  73 ms | █  2
  74 ms | ██  3
  76 ms | █  2
  77 ms | █  1
  78 ms | █  2
  80 ms | █  2
  81 ms | █  1
  87 ms | █  1
  95 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `84.00`
- `fps_1pct_low` = `11.75`
- `fps_harmonic_avg` = `26.96`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `10.45`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `33.35`, min `11.08`, p50 `29.24`, p95 `63.94`, p99 `190.95`, 1%low `12.66`, 0.1%low `11.08`, std `32.75`

**Frame time (ms)**  avg `37.21`, p50 `34.21`, p95 `61.73`, p99 `74.89`, p99.9 `83.41`, max `90.23`

**Client tick (ms)**  avg `0.69`, p95 `1.11`, max `3.98`

**Memory**  start `6828 MB`, end `4165 MB`, peak `6857 MB`, GC `51 events / 1246 ms`

**FPS over sampling window (ASCII):**

```
 79.3 |                                   █                                            
 74.3 |                                   █                                            
 69.3 |                                   █                                 █          
 64.3 |                                   █                    █            █          
 59.3 |                                   █                    █            █          
 54.3 |                                   █                 █  █            █          
 49.3 |                     █             █                 █  █            █          
 44.3 |       █             █             █                 █  █          █ █          
 39.3 |   █  ██             █             █                 █  █          █ █          
 34.3 | █ █  █████        ███   ██  █     █    ██  █     █  █ ██  █    █ ██ █    ███   
 29.2 |█████████████ █████████████████  ████ ████████████████████ ██████ ██ ███████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  2
   3 ms |   1
   4 ms | █  2
   5 ms | █  2
   8 ms | █  2
  10 ms |   1
  11 ms | █  2
  13 ms | ███  7
  14 ms | ██  4
  15 ms | ████  9
  16 ms | ██  4
  17 ms | █  3
  18 ms | ██  5
  19 ms | ████  8
  20 ms | ██  4
  21 ms | ██  4
  22 ms | █  2
  23 ms | █  3
  24 ms | █  2
  25 ms | █  3
  26 ms | █  3
  27 ms | █  2
  28 ms | █  2
  29 ms | ████  8
  30 ms | █████  10
  31 ms | ███████  15
  32 ms | ████████████████████████████  60
  33 ms | ████████████████████████████████████████  86
  34 ms | ██████████████████████  48
  35 ms | █████████  19
  36 ms | ███████  15
  37 ms | ██████  13
  38 ms | ███  6
  39 ms | ███  7
  40 ms | ███  7
  41 ms | ███  6
  42 ms | ██████  12
  43 ms | █████  10
  44 ms | ███  7
  45 ms | ████████  17
  46 ms | ████  8
  47 ms | ███  7
  48 ms | █████  11
  49 ms | ██████  12
  50 ms | █████  10
  51 ms | ████  8
  52 ms | ███  6
  53 ms | ██████  12
  54 ms | █  2
  55 ms | ██  4
  56 ms |   1
  58 ms |   1
  59 ms | ██  4
  61 ms |   1
  62 ms | █  2
  64 ms | █  2
  65 ms |   1
  66 ms | █  2
  67 ms | █  2
  68 ms | █  2
  69 ms | █  2
  70 ms | █  3
  71 ms | █  2
  73 ms |   1
  74 ms | █  2
  75 ms | █  3
  76 ms |   1
  77 ms |   1
  90 ms |   1
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
- `fps_0p1pct_low` = `11.08`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `39.00`
- `fps_harmonic_avg` = `26.88`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `12.66`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `37.16`, min `10.59`, p50 `29.69`, p95 `78.96`, p99 `183.79`, 1%low `11.16`, 0.1%low `10.59`, std `36.20`

**Frame time (ms)**  avg `37.64`, p50 `33.68`, p95 `66.99`, p99 `84.05`, p99.9 `93.47`, max `94.43`

**Client tick (ms)**  avg `5.27`, p95 `10.97`, max `36.96`

**Memory**  start `4900 MB`, end `4476 MB`, peak `6914 MB`, GC `58 events / 1369 ms`

**FPS over sampling window (ASCII):**

```
 82.0 |         █                     █                                                
 76.7 |         █        █            █                                                
 71.4 |         █        █            █                                                
 66.1 |         █        █            █                                                
 60.8 |         █        █            █                          █                     
 55.5 |         █        █            █                          █                █    
 50.2 |         █        █            █                   █      █                █    
 44.9 | █    █  █        █  █   █ █ █ █                   █ █    █            █   █    
 39.6 | █    █  █ █  █   █ ██   ███ ███          █        █ █    █       █    ██  █    
 34.3 |██ █  █ ████████  ████ █████ ███ █  ██  ████ █ █ ███ ████ ███ █ █ ██  ███████ █ 
 29.0 |██████████████████████████████████████████████ ██████████████████ ███████████ █ 
 23.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███  2
   3 ms | ██  1
   4 ms | ███  2
   5 ms | ██  1
   6 ms | ███  2
   7 ms | ███████  4
   8 ms | █████  3
   9 ms | ███  2
  10 ms | ███  2
  11 ms | ██████████  6
  12 ms | ████████  5
  13 ms | ██████████  6
  14 ms | ███████████████  9
  15 ms | ████████████████████  12
  16 ms | ██████████████████  11
  17 ms | ███████████████  9
  18 ms | ███████████████  9
  19 ms | █████████████████  10
  20 ms | ██████████  6
  21 ms | █████████████  8
  22 ms | ██████████  6
  23 ms | ███████  4
  24 ms | ███████████████  9
  25 ms | ███████████████  9
  26 ms | █████████████████  10
  27 ms | ████████████  7
  28 ms | █████████████████████████████████  20
  29 ms | ███████████████████████████████████  21
  30 ms | ███████████████████████████████████  21
  31 ms | ████████████████████████████████  19
  32 ms | ██████████████████████  13
  33 ms | ████████████████████████████████████████  24
  34 ms | ████████████████████  12
  35 ms | ████████  5
  36 ms | ███  2
  37 ms | ███████████████  9
  38 ms | ████████████  7
  39 ms | ███████  4
  40 ms | ███████  4
  41 ms | █████  3
  42 ms | ██████████  6
  43 ms | ████████  5
  44 ms | █████████████  8
  45 ms | ███████████████  9
  46 ms | ███████  4
  47 ms | ██████████  6
  48 ms | ███████████████████████  14
  49 ms | ███████████████  9
  50 ms | ██████████████████████  13
  51 ms | ███████████████████████  14
  52 ms | ████████████████████████████  17
  53 ms | ███████████████  9
  54 ms | █████████████████████████  15
  55 ms | ██████████  6
  56 ms | █████  3
  57 ms | ██████████████████  11
  58 ms | █████████████  8
  59 ms | ████████  5
  60 ms | ████████████  7
  62 ms | ███  2
  63 ms | █████  3
  64 ms | ███  2
  65 ms | ██████████  6
  66 ms | ███  2
  67 ms | █████  3
  68 ms | █████  3
  70 ms | █████  3
  72 ms | ██  1
  73 ms | ██  1
  75 ms | ██  1
  77 ms | ████████  5
  78 ms | ███  2
  81 ms | ███  2
  85 ms | ██  1
  86 ms | ███  2
  87 ms | ██  1
  92 ms | ██  1
  94 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_avg` = `36.71`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `10.59`
- `preset_long` = `0.00`
- `preload_duration_ms` = `37.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.57`
- `fps_1pct_low` = `11.16`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `37.31`, min `10.38`, p50 `28.01`, p95 `87.39`, p99 `209.45`, 1%low `10.96`, 0.1%low `10.38`, std `37.06`

**Frame time (ms)**  avg `37.74`, p50 `35.70`, p95 `67.24`, p99 `84.25`, p99.9 `94.23`, max `96.33`

**Client tick (ms)**  avg `4.61`, p95 `9.62`, max `50.75`

**Memory**  start `6434 MB`, end `6533 MB`, peak `6957 MB`, GC `55 events / 1299 ms`

**FPS over sampling window (ASCII):**

```
 78.7 |                                              █  █                              
 73.7 |                  █    █                      █  █                              
 68.6 |   █              █    █                      █  █                              
 63.6 |   █              █    █                  █   █  █                              
 58.6 |   █              █    █                  █   █  █          █                   
 53.6 |   █              █    █                  █ █ █  █          █                   
 48.5 |   █              █    █        █         █ █ █  █   █      █           █       
 43.5 |   █ ██   █ █     █    █      █ █         █ █ ██ █   ██  █  █       █   █       
 38.5 |  ██ ██   ████   ██ █  █      █ ████      █ █ ████   ██  █  █     █ █   █     █ 
 33.5 |  ███████ ████ █ █████ ██ █   ██████  █ █ █ █ █████ ███ ███ ██ ████ █ █ ███   ██
 28.4 |█████████████████████████████████████████ █████████████ ███████████████████ ████
 23.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   3 ms | ██████  4
   4 ms | ███  2
   5 ms | █████  3
   6 ms | █████  3
   7 ms | ███  2
   8 ms | █████  3
   9 ms | ███  2
  10 ms | █████  3
  11 ms | █████████████████  11
  12 ms | ███████████████  10
  13 ms | ██████  4
  14 ms | ████████  5
  15 ms | ██████  4
  16 ms | ███████████  7
  17 ms | ████████  5
  18 ms | ███  2
  19 ms | █████████  6
  20 ms | ██████  4
  21 ms | ████████████  8
  22 ms | ██████████████  9
  23 ms | █████  3
  24 ms | ████████  5
  25 ms | █████  3
  26 ms | ████████████  8
  27 ms | █████████████████  11
  28 ms | █████████████████  11
  29 ms | █████████████████████████████  19
  30 ms | ████████████████████████████████████████  26
  31 ms | ███████████████████████████████  20
  32 ms | ██████████████████  12
  33 ms | ███████████████████████████████  20
  34 ms | ██████████████████████  14
  35 ms | ███████████████████████████████  20
  36 ms | ███████████████████████████████  20
  37 ms | █████████████████████████  16
  38 ms | ███████████████████████  15
  39 ms | █████████████████████████  16
  40 ms | ██████████████  9
  41 ms | ███████████  7
  42 ms | ███████████  7
  43 ms | ███  2
  44 ms | ████████  5
  45 ms | ███████████████  10
  46 ms | █████████  6
  47 ms | █████████  6
  48 ms | ████████  5
  49 ms | █████████████████  11
  50 ms | ████████████  8
  51 ms | █████████  6
  52 ms | ███████████████  10
  53 ms | ████████████████████  13
  54 ms | ████████████  8
  55 ms | █████████████████  11
  56 ms | █████████  6
  57 ms | █████  3
  58 ms | ██████  4
  59 ms | ████████  5
  60 ms | ████████  5
  61 ms | ███  2
  62 ms | ███  2
  63 ms | █████  3
  64 ms | █████  3
  65 ms | ████████  5
  66 ms | ███  2
  67 ms | ████████  5
  69 ms | █████  3
  70 ms | ███  2
  71 ms | ███  2
  72 ms | ███  2
  76 ms | ██  1
  78 ms | ██  1
  80 ms | ██████  4
  81 ms | █████  3
  85 ms | ██  1
  86 ms | ██  1
  89 ms | ██  1
  92 ms | ███  2
  96 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_avg` = `37.07`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `148.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `10.38`
- `preset_long` = `0.00`
- `preload_duration_ms` = `33.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `26.50`
- `fps_1pct_low` = `10.96`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `32.19`, min `9.61`, p50 `26.23`, p95 `67.04`, p99 `125.88`, 1%low `10.33`, 0.1%low `n/a`, std `29.19`

**Frame time (ms)**  avg `42.02`, p50 `38.13`, p95 `75.35`, p99 `90.85`, p99.9 `101.16`, max `104.05`

**Client tick (ms)**  avg `20.29`, p95 `32.91`, max `54.45`

**Memory**  start `5501 MB`, end `4440 MB`, peak `7095 MB`, GC `51 events / 1020 ms`

**FPS over sampling window (ASCII):**

```
113.6 |                 █                                                              
104.9 |                 █                                                              
 96.2 |                 █                                                              
 87.5 |                 █                                                              
 78.8 |                 █                                         █                    
 70.1 |   █             █                                         █                    
 61.4 |   █             █                                         █                    
 52.7 |   █             █                                        ██                    
 44.0 |   █             █             █            █             ██   █  █        █    
 35.3 |██ ██ █    ███ █ ██   █ █ ██   █  █   ██    ███ █  █   █ ███ █ █  ███    ███ █ █
 26.6 |████████  ██████ ██ █████████ ████████████  █████ ██████ █████████████  ████████
 17.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   3 ms | ██  1
   4 ms | ██  1
   7 ms | ██████  3
   9 ms | ███████████████  7
  11 ms | ██████  3
  12 ms | ██████  3
  13 ms | ██  1
  14 ms | █████████████  6
  15 ms | █████████████████  8
  16 ms | ████████  4
  17 ms | █████████████████  8
  18 ms | ██████  3
  19 ms | ███████████████████████  11
  20 ms | ███████████████  7
  21 ms | ███████████  5
  22 ms | ███████████████  7
  23 ms | █████████████  6
  24 ms | ███████████████████  9
  25 ms | ████████  4
  26 ms | █████████████████  8
  27 ms | ███████████  5
  28 ms | █████████████████████████  12
  29 ms | ███████████████████████████  13
  30 ms | ███████████████████████  11
  31 ms | ███████████████████  9
  32 ms | ████████████████████████████████████████  19
  33 ms | ██████████████████████████████████████  18
  34 ms | █████████████████████████████  14
  35 ms | █████████████████  8
  36 ms | █████████████████████  10
  37 ms | █████████████████████  10
  38 ms | █████████████████████  10
  39 ms | █████████████████  8
  40 ms | █████████████  6
  41 ms | ███████████████  7
  42 ms | ████████  4
  43 ms | █████████████  6
  44 ms | █████████████████  8
  45 ms | ███████████  5
  46 ms | ███████████████  7
  47 ms | ███████████  5
  48 ms | █████████████  6
  49 ms | ███████████  5
  50 ms | ██████  3
  51 ms | █████████████████████████  12
  52 ms | █████████████████  8
  53 ms | ███████████████████████████  13
  54 ms | █████████████  6
  55 ms | ███████████████  7
  56 ms | ████████  4
  57 ms | ███████████████  7
  58 ms | ███████████████████  9
  59 ms | ███████████████  7
  60 ms | ███████████████  7
  61 ms | █████████████  6
  62 ms | ████████  4
  63 ms | ██████  3
  64 ms | ███████████████  7
  65 ms | ███████████████  7
  66 ms | ████  2
  67 ms | █████████████  6
  68 ms | ██████  3
  69 ms | ██████  3
  70 ms | ██████  3
  71 ms | ██████  3
  72 ms | ██  1
  73 ms | ████████  4
  74 ms | ████████  4
  75 ms | ██████  3
  76 ms | ████  2
  79 ms | ██████  3
  81 ms | ██  1
  82 ms | ████  2
  83 ms | ██  1
  84 ms | ████  2
  86 ms | ██████  3
  88 ms | ████  2
  90 ms | ████  2
  93 ms | ██  1
  97 ms | ████  2
 104 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `64.00`
- `falling_blocks_landed` = `24790.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `23.80`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4803.53`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `10.33`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `31.02`, min `9.10`, p50 `24.36`, p95 `69.27`, p99 `127.51`, 1%low `9.88`, 0.1%low `n/a`, std `28.69`

**Frame time (ms)**  avg `43.40`, p50 `41.04`, p95 `78.84`, p99 `92.28`, p99.9 `109.87`, max `109.90`

**Client tick (ms)**  avg `20.34`, p95 `31.47`, max `66.85`

**Memory**  start `4196 MB`, end `6387 MB`, peak `7099 MB`, GC `51 events / 980 ms`

**FPS over sampling window (ASCII):**

```
 83.0 |                                                              █                 
 77.0 |                                          █                   █                 
 71.0 |                                          █                   █               █ 
 64.9 |                                          █                   █               █ 
 58.9 |                                          █              █    █               █ 
 52.8 |  █                                       █              █    █               █ 
 46.8 |  █                                       █              █    █               █ 
 40.7 |  █                                 ██    ██    █ █      █    █      █  █     █ 
 34.7 | ██                █    █      ██ █ ██    ███  ██ █ █  ███    ██     ████    ███
 28.7 |███ ██   ████    ███   ███   ████ █ ██    ████ ████ █  ████████████  ████ ██████
 22.6 |███████████████  ██████████  ████ ██████  ████████████ ████████████ ████████████
 16.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ████████  3
   4 ms | ███  1
   7 ms | ███  1
   8 ms | ███  1
   9 ms | █████  2
  10 ms | ████████  3
  11 ms | █████  2
  12 ms | ██████████  4
  13 ms | ████████  3
  14 ms | ██████████████████  7
  15 ms | ██████████████████  7
  16 ms | ██████████  4
  17 ms | ██████████  4
  18 ms | ████████  3
  19 ms | ███████████████  6
  20 ms | █████  2
  21 ms | █████████████  5
  22 ms | ███████████████  6
  23 ms | ██████████  4
  24 ms | ██████████████████  7
  25 ms | █████████████  5
  26 ms | █████████████  5
  27 ms | ██████████████████  7
  28 ms | █████████████████████████████████  13
  29 ms | ████████████████████████████  11
  30 ms | █████████████████████████████████  13
  31 ms | ████████████████████  8
  32 ms | ███████████████████████  9
  33 ms | ███████████████████████████████████  14
  34 ms | ████████████████████████████  11
  35 ms | ████████████████████  8
  36 ms | ████████████████████  8
  37 ms | ██████████████████  7
  38 ms | ██████████████████████████████  12
  39 ms | ████████████████████████████████████████  16
  40 ms | ████████████████████  8
  41 ms | ████████████████████████████  11
  42 ms | ███████████████  6
  43 ms | ███████████████  6
  44 ms | ██████████████████  7
  45 ms | █████████████████████████  10
  46 ms | ███████████████████████  9
  47 ms | █████  2
  48 ms | ███████████████  6
  49 ms | ███████████████  6
  50 ms | ████████████████████████████  11
  51 ms | ██████████████████  7
  52 ms | ██████████████████  7
  53 ms | ██████████████████████████████████████  15
  54 ms | ████████████████████  8
  55 ms | ██████████████████  7
  56 ms | █████████████████████████  10
  57 ms | ███████████████  6
  58 ms | ███████████████  6
  59 ms | ██████████  4
  60 ms | ████████████████████  8
  61 ms | ███████████████  6
  62 ms | ██████████  4
  63 ms | ████████  3
  64 ms | ███████████████  6
  65 ms | ██████████  4
  66 ms | █████  2
  67 ms | █████████████  5
  68 ms | ████████  3
  69 ms | ███████████████  6
  70 ms | ██████████  4
  71 ms | ██████████  4
  72 ms | ███  1
  73 ms | █████  2
  75 ms | █████  2
  77 ms | ███  1
  78 ms | ██████████  4
  79 ms | █████████████  5
  80 ms | ███  1
  81 ms | ████████  3
  82 ms | ███  1
  84 ms | ███  1
  85 ms | ███  1
  87 ms | █████  2
  89 ms | ███  1
  90 ms | ███  1
  91 ms | ███  1
  93 ms | █████  2
  99 ms | ███  1
 109 ms | █████  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `65.00`
- `falling_blocks_landed` = `22400.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `23.04`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4802.30`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `9.88`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `35.08`, min `10.60`, p50 `28.59`, p95 `56.95`, p99 `169.43`, 1%low `11.40`, 0.1%low `10.60`, std `52.78`

**Frame time (ms)**  avg `37.83`, p50 `34.98`, p95 `63.44`, p99 `80.19`, p99.9 `92.09`, max `94.33`

**Client tick (ms)**  avg `2.82`, p95 `4.73`, max `39.44`

**Memory**  start `4558 MB`, end `6323 MB`, peak `7382 MB`, GC `69 events / 1478 ms`

**FPS over sampling window (ASCII):**

```
138.8 |                                                                  █             
128.4 |                                                                  █             
118.0 |                                                                  █             
107.6 |                            █                                     █             
 97.2 |                            █            █                        █             
 86.8 |                            █            █                        █             
 76.5 |                            █            ██                       █             
 66.1 |                            █            ██                       █             
 55.7 |                    █       █            ██                       █             
 45.3 |    █    █   █  █   █       █            ██  █      █             ██            
 34.9 | █  █    ██████ █   █  █ █ ██   █  ████  ███ █ ██   █  █ █    █   ██ █   █   █  
 24.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████  3
   2 ms | ██  2
   5 ms | █  1
   6 ms | █  1
   8 ms | █████  4
  11 ms | ██  2
  12 ms | ██  2
  14 ms | █████  4
  16 ms | █████  4
  17 ms | ███████  6
  18 ms | █████  4
  19 ms | █████████  8
  20 ms | █  1
  21 ms | █████████  8
  22 ms | █████  4
  23 ms | █████  4
  24 ms | ████  3
  25 ms | ███████  6
  26 ms | ██████████████  12
  27 ms | █████  4
  28 ms | ██████████████████  15
  29 ms | ████████████████████████  20
  30 ms | █████████████████████████  21
  31 ms | ████████████████████████████████  27
  32 ms | ███████████████████████████████████  30
  33 ms | ████████████████████████████████████████  34
  34 ms | ████████████████████████████████████████  34
  35 ms | ███████████████████████████████  26
  36 ms | ████████████████████████████  24
  37 ms | ████████████████████  17
  38 ms | ███████  6
  39 ms | ████████████  10
  40 ms | ████████  7
  41 ms | ███████████  9
  42 ms | ████████  7
  43 ms | ███████████████  13
  44 ms | ████████  7
  45 ms | ████████  7
  46 ms | ███████████████  13
  47 ms | ██████████████  12
  48 ms | ██████████████  12
  49 ms | ████████  7
  50 ms | ███████████████  13
  51 ms | ███████████  9
  52 ms | █████████  8
  53 ms | ████████  7
  54 ms | █  1
  55 ms | ████  3
  56 ms | █████  4
  57 ms | █  1
  58 ms | ██  2
  59 ms | █  1
  60 ms | ████  3
  61 ms | ███████  6
  62 ms | █  1
  63 ms | ██  2
  64 ms | █  1
  65 ms | ████  3
  66 ms | █  1
  67 ms | █████  4
  69 ms | █  1
  70 ms | █  1
  71 ms | █  1
  72 ms | █  1
  73 ms | █  1
  74 ms | ██  2
  75 ms | █  1
  77 ms | █  1
  79 ms | ██  2
  80 ms | █  1
  82 ms | █  1
  85 ms | █  1
  86 ms | █  1
  90 ms | █  1
  94 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `73.00`
- `falling_blocks_landed` = `3626.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `26.43`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `10.60`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.85`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `11.40`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `33.20`, min `11.03`, p50 `28.89`, p95 `70.78`, p99 `114.04`, 1%low `11.84`, 0.1%low `11.03`, std `31.16`

**Frame time (ms)**  avg `37.70`, p50 `34.62`, p95 `63.49`, p99 `77.38`, p99.9 `89.70`, max `90.65`

**Client tick (ms)**  avg `2.71`, p95 `4.20`, max `33.74`

**Memory**  start `4923 MB`, end `6244 MB`, peak `7393 MB`, GC `69 events / 1543 ms`

**FPS over sampling window (ASCII):**

```
119.4 |                                                                  █             
110.8 |                                                                  █             
102.1 |                                                                  █             
 93.5 |                                                                  █             
 84.8 |                                                                  █             
 76.2 |                                                                  █             
 67.5 |                                                                  █             
 58.9 |                                                          █       █             
 50.2 |           █                                █             █       █             
 41.6 |         █ ██   █         █   █   █         █  █    █     █       █   █  ███    
 32.9 |█ ██ █  █████████████ ██████████ █████ ████ █  ██ █ █  ██ █    ██ █   █ █████   
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   5 ms | ██  2
   6 ms | ██  2
   8 ms | ██  2
   9 ms | ██  2
  11 ms | ███  4
  12 ms | ████  5
  13 ms | ██████  8
  14 ms | ███  4
  15 ms | ██████  8
  16 ms | ████  5
  17 ms | █████  7
  18 ms | ███████  9
  19 ms | ████  5
  20 ms | ███  4
  21 ms | ██  3
  22 ms | ███  4
  23 ms | ██  3
  24 ms | ██  3
  25 ms | ██  3
  26 ms | █████  7
  27 ms | ███  4
  28 ms | █████  6
  29 ms | █████████  11
  30 ms | ██████████████████  23
  31 ms | ████████████████  21
  32 ms | ██████████████████████████████  38
  33 ms | ████████████████████████████████████████  51
  34 ms | █████████████████████  27
  35 ms | ███████████████████  24
  36 ms | ███████████  14
  37 ms | ███████  9
  38 ms | ██████  8
  39 ms | ███████  9
  40 ms | ████████  10
  41 ms | ██████  8
  42 ms | █████  6
  43 ms | ███  4
  44 ms | ███  4
  45 ms | ███████  9
  46 ms | █████  6
  47 ms | ███████████████  19
  48 ms | ████████████  15
  49 ms | █████████  11
  50 ms | ██████████████  18
  51 ms | ████████  10
  52 ms | █████  7
  53 ms | █████  7
  54 ms | ███  4
  55 ms | ██████  8
  56 ms | ██  3
  57 ms | ███  4
  58 ms | ██  3
  59 ms | ███  4
  60 ms | ██  2
  61 ms | ██  2
  62 ms | █  1
  63 ms | ████  5
  64 ms | █  1
  65 ms | ██  2
  66 ms | ██  2
  67 ms | █████  7
  69 ms | ██  2
  70 ms | █  1
  72 ms | █  1
  73 ms | █  1
  75 ms | █  1
  78 ms | ██  2
  81 ms | █  1
  82 ms | █  1
  88 ms | █  1
  90 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `63.00`
- `falling_blocks_landed` = `3528.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `26.53`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `11.03`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.58`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `11.84`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23156 ms  |  Sample ticks: 400

**FPS**  avg `29.00`, min `7.16`, p50 `27.93`, p95 `54.61`, p99 `133.75`, 1%low `7.50`, 0.1%low `n/a`, std `22.12`

**Frame time (ms)**  avg `45.35`, p50 `35.81`, p95 `101.10`, p99 `120.82`, p99.9 `136.83`, max `139.70`

**Client tick (ms)**  avg `1.03`, p95 `1.70`, max `25.13`

**Memory**  start `5629 MB`, end `6625 MB`, peak `7385 MB`, GC `93 events / 1769 ms`

**FPS over sampling window (ASCII):**

```
 73.5 |                          █                                                     
 67.7 |                          █                                                     
 61.8 |                          █                   █                     █           
 56.0 |                          █                   █                    ██           
 50.2 |                          █            █      █                    ██           
 44.4 |           █              █          █ █      █                    ██    █      
 38.6 |      █    █              █          █ █      █ ██                 ██ █  █  █   
 32.8 | ███  █ █ ██  █ █  ██     █      █ █ █ █    █ █ ██    █ █  █     █ ██ █  █  █   
 27.0 |████████████████████████████████████████████████████████████████████████ █████  
 21.2 |██████████████████████████████████████████████████████████████████████████████  
 15.3 |██████████████████████████████████████████████████████████████████████████████  
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   5 ms | █  2
   6 ms | █  2
   8 ms | █  2
   9 ms | █  1
  10 ms | █  1
  12 ms | █  2
  13 ms | █  1
  14 ms | █  2
  15 ms | ████  5
  17 ms | ██  3
  18 ms | █  2
  19 ms | █  2
  20 ms | █  2
  21 ms | █████  7
  22 ms | ██  3
  23 ms | █  1
  24 ms | █  2
  25 ms | ████  6
  27 ms | █  2
  28 ms | ██  3
  29 ms | ██  3
  30 ms | █████  7
  31 ms | ███████████████  21
  32 ms | ████████████████████████████  40
  33 ms | ████████████████████████████████████████  57
  34 ms | ██████████████████████  31
  35 ms | ████████  12
  36 ms | ███████████  15
  37 ms | ████████  12
  38 ms | ████  6
  39 ms | ██████  9
  40 ms | ████  5
  41 ms | ████  6
  42 ms | ████  5
  43 ms | ████  6
  44 ms | ██████  9
  45 ms | ██████  9
  46 ms | ████████  11
  47 ms | ██████  8
  48 ms | ███  4
  49 ms | ████  6
  50 ms | █  2
  51 ms | ██████  8
  52 ms | ███  4
  53 ms | ███  4
  54 ms | ██  3
  55 ms | ████  6
  56 ms | █  1
  57 ms | █  1
  58 ms | █  1
  59 ms | █  1
  60 ms | █  1
  61 ms | ██  3
  62 ms | ██  3
  63 ms | █  2
  65 ms | █  1
  66 ms | █  2
  67 ms | ██  3
  68 ms | █  1
  69 ms | █  2
  70 ms | █  2
  71 ms | █  1
  72 ms | █  1
  73 ms | █  1
  76 ms | █  2
  87 ms | █  1
  93 ms | █  1
  96 ms | ██  3
  97 ms | █  2
  98 ms | ██  3
  99 ms | ██████  9
 100 ms | ██████  9
 101 ms | ████  5
 102 ms | ███  4
 103 ms | ██  3
 105 ms | █  1
 106 ms | █  1
 112 ms | █  1
 113 ms | █  1
 115 ms | █  1
 116 ms | █  1
 123 ms | █  1
 127 ms | █  1
 133 ms | █  2
 139 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `7.50`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `22.05`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `5099.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23327 ms  |  Sample ticks: 400

**FPS**  avg `9.72`, min `1.39`, p50 `9.95`, p95 `10.79`, p99 `12.41`, 1%low `2.34`, 0.1%low `n/a`, std `1.03`

**Frame time (ms)**  avg `106.38`, p50 `100.49`, p95 `120.28`, p99 `130.46`, p99.9 `610.64`, max `721.52`

**Client tick (ms)**  avg `0.53`, p95 `1.55`, max `25.69`

**Memory**  start `5664 MB`, end `5971 MB`, peak `7700 MB`, GC `126 events / 2568 ms`

**FPS over sampling window (ASCII):**

```
 11.6 |                                                        █                       
 11.3 |                                                        █                       
 11.0 |                                                █       █                       
 10.7 |                                                █       █              █        
 10.4 |              █                                 █       █              █   █ █  
 10.1 | █  ██ █  █ █ █ █    █████  █      ███    █████ █  █ █  █   ██ █  █  █ █   █ ██ 
  9.8 | █████ █ ████ █ █  ███████  ███   ████ ████████ ███████ ██ ███ █  █  █ █   █ ██ 
  9.5 |████████ ████ ███ ████████  ████ █████ ████████ ███████ ██ █████ ███ ████ ██████
  9.2 |████████ ███████████████████████ █████ ████████ ███████ ██ █████ ████████ ██████
  8.9 |████████████████████████████████ █████ ████████████████ ████████████████████████
  8.5 |██████████████████████████████████████ ████████████████ ████████████████████████
  8.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  72 ms | █  1
  74 ms | █  1
  81 ms | █  1
  83 ms | █  1
  85 ms | █  1
  86 ms | █  1
  89 ms | ██  2
  90 ms | █  1
  92 ms | ██  2
  93 ms | ██  2
  94 ms | █  1
  95 ms | █  1
  96 ms | ██  2
  97 ms | █████████████  11
  98 ms | ████████████  10
  99 ms | ███████████████████████████████████████  32
 100 ms | ████████████████████████████████████████  33
 101 ms | ███████████████  12
 102 ms | █████████████████  14
 103 ms | ████████  7
 104 ms | ████  3
 105 ms | ██  2
 106 ms | █  1
 107 ms | ██  2
 108 ms | ████  3
 109 ms | ████  3
 110 ms | ██  2
 111 ms | ███████████  9
 112 ms | ██  2
 113 ms | ████  3
 114 ms | ███████  6
 115 ms | ████  3
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
 119 ms | █  1
 120 ms | ██  2
 122 ms | ██  2
 123 ms | █  1
 124 ms | █  1
 127 ms | █  1
 128 ms | █  1
 129 ms | █  1
 134 ms | █  1
 721 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.40`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9648.00`
- `preload_duration_ms` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `2.34`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23328 ms  |  Sample ticks: 400

**FPS**  avg `9.74`, min `1.39`, p50 `9.89`, p95 `11.09`, p99 `11.98`, 1%low `2.34`, 0.1%low `n/a`, std `1.01`

**Frame time (ms)**  avg `106.13`, p50 `101.12`, p95 `120.57`, p99 `132.37`, p99.9 `609.93`, max `721.11`

**Client tick (ms)**  avg `0.48`, p95 `1.09`, max `21.92`

**Memory**  start `6908 MB`, end `6774 MB`, peak `7497 MB`, GC `126 events / 2391 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                   █                █    █                    █                 
 10.2 |       █   █       █         █      ██   █ █     █   █    █ █ █   █   █         
  9.9 | █████ █████ █ █   ██ ██ █████ ███  ████ ██████  █   ██   █ █ █ █ ██ ██ █  █  ██
  9.6 |██████ █████ █ █   █████ █████ ███  ████ ██████ ██  ████  █████ ████ ██ ██ █ ███
  9.3 |██████ █████ █████████████████ ███ █████ ██████ ███████████████████████ ██ █ ███
  9.1 |██████ █████ █████████████████ █████████ █████████████████████████████████ █████
  8.8 |████████████████████████████████████████ █████████████████████████████████ █████
  8.5 |████████████████████████████████████████ █████████████████████████████████ █████
  8.2 |██████████████████████████████████████████████████████████████████████████ █████
  7.9 |██████████████████████████████████████████████████████████████████████████ █████
  7.6 |██████████████████████████████████████████████████████████████████████████ █████
  7.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  74 ms | █  1
  81 ms | █  1
  83 ms | █  1
  84 ms | █  1
  85 ms | █  1
  87 ms | ███  2
  89 ms | ████  3
  90 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | ████  3
  94 ms | ███████  5
  95 ms | █  1
  96 ms | ███  2
  97 ms | ███████████████  11
  98 ms | █████████████████████████  19
  99 ms | █████████████████████  16
 100 ms | █████████████████████████████  22
 101 ms | ████████████████████████████████████████  30
 102 ms | █████████████████  13
 103 ms | █████  4
 104 ms | █████  4
 106 ms | █  1
 108 ms | ███  2
 109 ms | ████  3
 110 ms | █████  4
 111 ms | ███  2
 112 ms | ████  3
 113 ms | ███████  5
 114 ms | ███████████  8
 115 ms | ████  3
 116 ms | █████  4
 119 ms | ███  2
 121 ms | ███  2
 122 ms | █████  4
 126 ms | █  1
 132 ms | ███  2
 721 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `n/a`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `9.42`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `2.34`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23536 ms  |  Sample ticks: 400

**FPS**  avg `10.08`, min `1.32`, p50 `9.92`, p95 `12.01`, p99 `17.20`, 1%low `1.33`, 0.1%low `n/a`, std `4.21`

**Frame time (ms)**  avg `109.57`, p50 `100.81`, p95 `135.11`, p99 `243.25`, p99.9 `756.36`, max `760.00`

**Client tick (ms)**  avg `0.64`, p95 `1.63`, max `20.98`

**Memory**  start `6557 MB`, end `6561 MB`, peak `7726 MB`, GC `137 events / 3165 ms`

**FPS over sampling window (ASCII):**

```
 15.2 |                                 █                                              
 14.3 |                                 █                                              
 13.5 |                                 █                                              
 12.6 |       █                         █                                              
 11.7 |       █                         █                          █      █            
 10.9 |  █    █             █           █             █ █      █   █      █            
 10.0 |█ ████ ███  █████ ██████ █████ █ █████ █████   █ █████ ███████ ███ █ █  ███ ███ 
  9.2 |██████ █████████████████ █████ █ █████ █████ █████████ ████████████████████████ 
  8.3 |██████ █████████████████████████████████████ ██████████████████████████████████ 
  7.4 |████████████████████████████████████████████ ██████████████████████████████████ 
  6.6 |████████████████████████████████████████████ ██████████████████████████████████ 
  5.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | ██  1
  49 ms | ██  1
  59 ms | ██  1
  65 ms | ██  1
  69 ms | ██  1
  76 ms | ███  2
  77 ms | ██  1
  80 ms | ██  1
  82 ms | ██  1
  84 ms | ██  1
  85 ms | ██  1
  86 ms | ██  1
  88 ms | ██  1
  90 ms | ██  1
  91 ms | ███  2
  92 ms | ██  1
  93 ms | █████  3
  94 ms | █████  3
  95 ms | ██████  4
  96 ms | ██████████  6
  97 ms | ███████████  7
  98 ms | ███████████████████████████  17
  99 ms | ████████████████████████  15
 100 ms | ████████████████████████████████████████  25
 101 ms | ████████████████████████  15
 102 ms | ████████████████████████  15
 103 ms | █████████████  8
 104 ms | ██████████  6
 105 ms | ████████  5
 106 ms | ███  2
 110 ms | ███  2
 111 ms | ██  1
 112 ms | ██  1
 113 ms | █████  3
 114 ms | ██████  4
 115 ms | ███  2
 116 ms | ███  2
 117 ms | ██  1
 119 ms | █████  3
 121 ms | ██  1
 124 ms | ██  1
 125 ms | ██  1
 126 ms | ██  1
 128 ms | ███  2
 131 ms | ███  2
 136 ms | ██  1
 137 ms | ██  1
 143 ms | ███  2
 145 ms | ██  1
 149 ms | ██  1
 155 ms | ███  2
 740 ms | ██  1
 760 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `1.33`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `10752.00`
- `fps_harmonic_avg` = `9.13`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `4027.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 24895 ms  |  Sample ticks: 400

**FPS**  avg `9.43`, min `1.33`, p50 `9.88`, p95 `11.03`, p99 `12.68`, 1%low `1.36`, 0.1%low `n/a`, std `2.11`

**Frame time (ms)**  avg `131.71`, p50 `101.22`, p95 `136.48`, p99 `715.30`, p99.9 `747.63`, max `752.51`

**Client tick (ms)**  avg `0.44`, p95 `0.72`, max `14.36`

**Memory**  start `7116 MB`, end `6762 MB`, peak `7669 MB`, GC `215 events / 6893 ms`

**FPS over sampling window (ASCII):**

```
 14.2 |                                                           █                    
 13.3 |                                                           █                    
 12.4 |                                                           █                    
 11.6 |                                                           █                    
 10.7 | █  █    █    ██     ██                    █     █         █    █ █   █  █   █  
  9.8 | ██ █ ███████ ██████ ██ █ █ ████  ████ ██  █████ █ ███████ ██████ ███ █████ ██ █
  8.9 |█████ ███████ █████████ ████████ ████████ ████████ ███████ ██████ ███ ████████ █
  8.0 |█████████████ █████████ ████████ ████████ ████████ ███████ ██████████ ████████ █
  7.1 |█████████████ █████████ ████████ ████████ ████████ ███████ ██████████ ████████ █
  6.2 |█████████████ █████████ █████████████████ ████████ ███████ ██████████ ████████ █
  5.4 |█████████████ ██████████████████████████████████████████████████████████████████
  4.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  54 ms | ██  1
  73 ms | ██  1
  82 ms | ████  2
  85 ms | ██  1
  86 ms | ██  1
  88 ms | ██  1
  89 ms | ██  1
  90 ms | ██  1
  91 ms | ████  2
  92 ms | ██████████  5
  93 ms | ██████  3
  94 ms | ██  1
  95 ms | ████████  4
  96 ms | ████████  4
  97 ms | ██████████████  7
  98 ms | ██████████████  7
  99 ms | ████████████████████████████████████████  20
 100 ms | ████████████████████████████████  16
 101 ms | ████████████████████████████  14
 102 ms | ████████████████  8
 103 ms | ██████████████████  9
 104 ms | ████████  4
 105 ms | ████  2
 106 ms | ██████  3
 107 ms | ████████  4
 108 ms | ██████████████  7
 109 ms | ████  2
 110 ms | ██████  3
 111 ms | ██  1
 112 ms | ████  2
 113 ms | ██  1
 114 ms | ██  1
 115 ms | ████  2
 116 ms | ████  2
 120 ms | ████  2
 122 ms | ████  2
 123 ms | ████  2
 125 ms | ████  2
 126 ms | ██  1
 127 ms | ██  1
 130 ms | ██  1
 134 ms | ██  1
 136 ms | ██  1
 655 ms | ██  1
 671 ms | ██  1
 672 ms | ██  1
 683 ms | ██  1
 709 ms | ██  1
 711 ms | ██  1
 722 ms | ██  1
 752 ms | ██  1
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
- `fps_harmonic_avg` = `7.59`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `1.36`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23466 ms  |  Sample ticks: 400

**FPS**  avg `9.89`, min `1.17`, p50 `9.90`, p95 `11.69`, p99 `13.19`, 1%low `2.01`, 0.1%low `n/a`, std `1.41`

**Frame time (ms)**  avg `106.10`, p50 `100.99`, p95 `125.02`, p99 `134.91`, p99.9 `720.99`, max `857.76`

**Client tick (ms)**  avg `0.58`, p95 `1.86`, max `13.75`

**Memory**  start `7166 MB`, end `7528 MB`, peak `7721 MB`, GC `77 events / 1096 ms`

**FPS over sampling window (ASCII):**

```
 14.0 |                                                                            █   
 13.3 |                                                                            █   
 12.6 |                                                                            █   
 11.9 |                              █                                             █   
 11.2 |           █             █    █                     █                       █   
 10.5 |  █      █ █   ███ █   █ █ ██ █     ███   █         █ █  █   █   █ ██ █     ██ █
  9.8 |███████ ██ █ █ █████ ███ █ ██ ███████████████ █████ ██████████ █ ███████ ██ ████
  9.1 |███████████████████████████████████████████████████ ███████████████████████ ████
  8.3 |███████████████████████████████████████████████████████████████████████████ ████
  7.6 |███████████████████████████████████████████████████████████████████████████ ████
  6.9 |███████████████████████████████████████████████████████████████████████████ ████
  6.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  56 ms | ███  1
  73 ms | ███  1
  76 ms | █████████  3
  77 ms | ███  1
  82 ms | ███  1
  84 ms | ███  1
  85 ms | ███████████  4
  86 ms | █████████████████  6
  87 ms | ███████████  4
  88 ms | ███████████  4
  89 ms | ███  1
  90 ms | █████████  3
  92 ms | ██████  2
  93 ms | ████████████████████  7
  94 ms | ██████████████████████████  9
  95 ms | █████████████████  6
  96 ms | ██████████████████████████  9
  97 ms | █████████  3
  98 ms | ████████████████████████████████████████  14
  99 ms | █████████████████  6
 100 ms | █████████████████████████████  10
 101 ms | ████████████████████████████████████████  14
 102 ms | █████████  3
 103 ms | ███████████  4
 104 ms | ██████████████████████████  9
 105 ms | ███████████  4
 106 ms | ████████████████████  7
 107 ms | █████████  3
 108 ms | ██████  2
 109 ms | ███  1
 110 ms | ██████  2
 111 ms | █████████████████  6
 112 ms | ██████████████  5
 113 ms | ██████████████  5
 115 ms | ██████████████  5
 116 ms | ██████  2
 117 ms | ██████  2
 118 ms | ███  1
 119 ms | ███  1
 120 ms | ██████  2
 121 ms | ███  1
 122 ms | ██████  2
 123 ms | ███  1
 124 ms | █████████  3
 125 ms | █████████  3
 126 ms | ███  1
 127 ms | ███  1
 128 ms | ███  1
 130 ms | ███  1
 134 ms | ███  1
 137 ms | ███  1
 857 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `2.01`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.42`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7411.00`
- `preload_duration_ms` = `197.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24879 ms  |  Sample ticks: 400

**FPS**  avg `10.55`, min `1.17`, p50 `9.97`, p95 `11.25`, p99 `28.85`, 1%low `1.19`, 0.1%low `n/a`, std `8.60`

**Frame time (ms)**  avg `117.37`, p50 `100.28`, p95 `124.91`, p99 `795.77`, p99.9 `851.05`, max `855.27`

**Client tick (ms)**  avg `0.54`, p95 `1.74`, max `5.98`

**Memory**  start `7432 MB`, end `7403 MB`, peak `7769 MB`, GC `76 events / 3119 ms`

**FPS over sampling window (ASCII):**

```
 50.2 |                                                              █                 
 46.1 |                                                              █                 
 42.0 |                                                              █                 
 37.9 |                                                              █                 
 33.8 |                                                              █                 
 29.8 |                                                              █                 
 25.7 |                                                              █                 
 21.6 |                                                              █                 
 17.5 |                                                              █                 
 13.4 |               █                                              █                 
  9.3 |██████████████ █████████████████████████████████████████████████████████████ ███
  5.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  10 ms | ███  1
  12 ms | ███  1
  68 ms | ███  1
  78 ms | ███  1
  80 ms | ███  1
  83 ms | ███  1
  86 ms | ███  1
  87 ms | ███  1
  88 ms | ██████████  3
  89 ms | ███  1
  90 ms | █████████████████  5
  91 ms | ███████  2
  92 ms | ██████████  3
  93 ms | ████████████████████  6
  94 ms | █████████████████  5
  95 ms | ████████████████████████████████████████  12
  96 ms | ███████████████████████████  8
  97 ms | ███████████████████████████  8
  98 ms | █████████████████████████████████  10
  99 ms | ████████████████████████████████████████  12
 100 ms | █████████████████████████████████  10
 101 ms | ███████████████████████████  8
 102 ms | █████████████████████████████████  10
 103 ms | ██████████  3
 104 ms | █████████████  4
 105 ms | █████████████  4
 106 ms | ███████████████████████  7
 107 ms | ██████████  3
 108 ms | █████████████████  5
 109 ms | █████████████████  5
 110 ms | ███████  2
 111 ms | ███████  2
 112 ms | █████████████████  5
 113 ms | ██████████  3
 114 ms | ███  1
 115 ms | ███████  2
 117 ms | ███████  2
 119 ms | ██████████  3
 121 ms | ██████████  3
 122 ms | ███  1
 123 ms | ███████  2
 124 ms | ███████  2
 126 ms | ███  1
 127 ms | ███  1
 129 ms | ███  1
 136 ms | ███  1
 139 ms | ███  1
 774 ms | ███  1
 785 ms | ███  1
 831 ms | ███  1
 855 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `entity_count_delta` = `3.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.06`
- `fps_1pct_low` = `1.19`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `8.52`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7417.00`
- `preload_duration_ms` = `923.00`
- `entity_count_sample_end` = `7.00`
- `preset_long` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 26071 ms  |  Sample ticks: 400

**FPS**  avg `95.68`, min `1.38`, p50 `104.15`, p95 `208.68`, p99 `284.85`, 1%low `1.41`, 0.1%low `1.38`, std `61.73`

**Frame time (ms)**  avg `34.39`, p50 `9.60`, p95 `105.26`, p99 `684.79`, p99.9 `717.70`, max `725.47`

**Client tick (ms)**  avg `0.53`, p95 `1.30`, max `6.69`

**Memory**  start `7344 MB`, end `7441 MB`, peak `7758 MB`, GC `78 events / 8293 ms`

**FPS over sampling window (ASCII):**

```
137.8 |                                            █           █                      █
126.2 |              █     █          █            █       █   █   █       █          █
114.5 |          █   █ █  ██  ██      █ █    █ ██  ███ ██  █ █ █  ██       █   █     ██
102.9 |          ██  ███████████     ██ ███ ██ ███████ █████████████ ██  ████ ███  █ ██
 91.2 |         ███████████████████████ ██████████████ ██████████████████████████  █ ██
 79.6 |         ███████████████████████ █████████████████████████████████████████ █████
 68.0 |         ███████████████████████████████████████████████████████████████████████
 56.3 |        ████████████████████████████████████████████████████████████████████████
 44.7 |        ████████████████████████████████████████████████████████████████████████
 33.0 |        ████████████████████████████████████████████████████████████████████████
 21.4 |        ████████████████████████████████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  4
   3 ms | ████  11
   4 ms | █████████  26
   5 ms | ███████  20
   6 ms | ████████████  35
   7 ms | ███████████████████████  67
   8 ms | ████████████████████████████████████████  115
   9 ms | ████████████████████████  70
  10 ms | ███████████  32
  11 ms | ████████  23
  12 ms | █████  15
  13 ms | ██  7
  14 ms | █  3
  15 ms | █  4
  16 ms |   1
  17 ms | █  4
  18 ms | ██  7
  19 ms | █████  13
  20 ms | █████  14
  21 ms | ██████  16
  22 ms | █████  15
  23 ms | ████  12
  24 ms | ███  10
  25 ms | ███  10
  26 ms | ███  9
  27 ms | ███  9
  28 ms | █  2
  29 ms | █  3
  30 ms | ██  5
  31 ms | █  3
  32 ms | █  2
  33 ms |   1
  35 ms |   1
  36 ms |   1
  37 ms |   1
  38 ms | █  2
  40 ms |   1
  43 ms | █  2
  46 ms |   1
  48 ms |   1
  53 ms |   1
  76 ms |   1
  81 ms |   1
  84 ms |   1
  85 ms |   1
  86 ms | █  2
  89 ms |   1
  91 ms |   1
  92 ms | █  2
  93 ms | █  2
  94 ms | █  3
  95 ms | █  3
  96 ms | █  3
  97 ms | ██  5
  98 ms |   1
  99 ms | █  2
 100 ms | ██  5
 101 ms | █  3
 102 ms | █  2
 103 ms | █  3
 104 ms | █  3
 105 ms | █  4
 106 ms | █  2
 107 ms |   1
 108 ms | █  3
 110 ms |   1
 111 ms | █  2
 112 ms |   1
 113 ms |   1
 114 ms |   1
 117 ms |   1
 119 ms |   1
 120 ms |   1
 121 ms | █  2
 124 ms |   1
 125 ms |   1
 154 ms |   1
 665 ms | █  2
 673 ms |   1
 675 ms |   1
 676 ms |   1
 696 ms |   1
 699 ms |   1
 703 ms |   1
 712 ms |   1
 713 ms | █  2
 725 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `1.41`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.08`
- `part` = `1.00`
- `fps_0p1pct_low` = `1.38`
- `seed` = `7433.00`
- `preload_duration_ms` = `99.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 26246 ms  |  Sample ticks: 400

**FPS**  avg `108.95`, min `1.32`, p50 `112.38`, p95 `209.36`, p99 `334.30`, 1%low `1.40`, 0.1%low `1.32`, std `57.59`

**Frame time (ms)**  avg `20.82`, p50 `8.90`, p95 `27.39`, p99 `689.83`, p99.9 `751.65`, max `754.78`

**Client tick (ms)**  avg `0.51`, p95 `0.96`, max `12.30`

**Memory**  start `7302 MB`, end `7447 MB`, peak `7762 MB`, GC `73 events / 9754 ms`

**FPS over sampling window (ASCII):**

```
133.6 |                                      █                 █                       
129.3 |   █                                  █                 █      █                
124.9 |   █       █                          █                 █  ██  █                
120.6 |   █ █     █ █ █          █       █   █ █     █  █      █  ███ █       █    █   
116.3 |█  █ █    ██ █ █  █     █ █       █   █ █     █  █    █ ██ ███ █  █  █ █  █ █   
112.0 |█  █ █    ██ █ █  █ █   █ █     █ █   █ █ █   █  █    █ ██ ███ █  █  ███ ██ █ ██
107.7 |█  ███ █  ██ █ █  █ ██  █ █ █   ███   █ █ █  ██  ███  █ ██ ███ ████  ███ ████ ██
103.3 |█ ██████  ██ ████ █ ███ █ ███  ████ █████ █  ████████ █ ██ ████████ ████ ████ ██
 99.0 |█ ██████████ ████ █ ███ ██████ █████████████ ████████ ████ █████████████████████
 94.7 |████████████ ██████ ██████████ ██████████████████████ ██████████████████████████
 90.4 |███████████████████ █████████████████████████████████ ██████████████████████████
 86.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  12
   3 ms | ███  20
   4 ms | ████  27
   5 ms | ██████  40
   6 ms | █████████  61
   7 ms | █████████████████████████  162
   8 ms | ████████████████████████████████████████  259
   9 ms | ████████████████████  127
  10 ms | ███████  43
  11 ms | ████  26
  12 ms | ███  18
  13 ms | ██  13
  14 ms | █  4
  15 ms |   2
  16 ms | █  8
  17 ms | ████  27
  18 ms | ███  22
  19 ms | ███  17
  20 ms | ████  26
  21 ms | ████  29
  22 ms | █████  30
  23 ms | ███  19
  24 ms | ███  18
  25 ms | ██  15
  26 ms | ██  14
  27 ms | ██  11
  28 ms | ██  11
  29 ms |   3
  30 ms |   3
  31 ms |   1
  32 ms |   3
  33 ms |   2
  34 ms |   3
  35 ms |   2
  36 ms |   1
  37 ms |   2
  41 ms |   1
  42 ms |   2
  43 ms |   1
 683 ms |   1
 688 ms |   1
 689 ms |   1
 690 ms |   1
 695 ms |   1
 697 ms |   1
 698 ms |   1
 700 ms |   1
 703 ms |   1
 712 ms |   1
 723 ms |   1
 732 ms |   1
 753 ms |   1
 754 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `entity_count_delta` = `-12.00`
- `entity_count_sample_start` = `14.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `1.40`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `57.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `48.02`
- `part` = `1.00`
- `fps_0p1pct_low` = `1.32`
- `seed` = `7451.00`
- `preload_duration_ms` = `54.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 24246 ms  |  Sample ticks: 400

**FPS**  avg `31.38`, min `1.36`, p50 `28.71`, p95 `59.79`, p99 `77.56`, 1%low `1.72`, 0.1%low `n/a`, std `14.20`

**Frame time (ms)**  avg `41.65`, p50 `34.84`, p95 `57.64`, p99 `73.42`, p99.9 `726.38`, max `735.87`

**Client tick (ms)**  avg `0.48`, p95 `0.95`, max `5.17`

**Memory**  start `7174 MB`, end `7394 MB`, peak `7761 MB`, GC `84 events / 2916 ms`

**FPS over sampling window (ASCII):**

```
 43.4 |                   █                                                            
 41.8 |                   █                                                            
 40.1 |     █             █  █                                                         
 38.4 |     █     █       █  █                                            █            
 36.8 |     █     █       █  █     █                          █        █  █     █      
 35.1 |   █ █     █    █  █  █     █          ███ █        █  █        █  █  █  █      
 33.4 |   █ █  ██ █ █  █  █ ██   █ ██         ███ █     █  █  █        █  ██ ██ █      
 31.8 |   █ █  ██ █ █  █  █ ██   █ ██  ██ ██ ████████   █ ███ ██ █     █  ██ ██ █  █ █ 
 30.1 | █ █ █  ██ █ █  ██ █ ███  █ ██ ███████████████   █████ ███████ ███████████  ███ 
 28.4 |██████ ███ ████ ██ █ █████████████████████████  ██████████████████████████  ███ 
 26.8 |████████████████████ █████████████████████████████████████████████████████ █████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms | ███  3
  11 ms | ██  2
  12 ms | █  1
  13 ms | █████  5
  14 ms | ███████  7
  15 ms | ████  4
  16 ms | ██████  6
  17 ms | █████████  10
  18 ms | ██████████  11
  19 ms | ███████  8
  20 ms | ███████  7
  21 ms | ██████  6
  22 ms | █████  5
  23 ms | ████████  9
  24 ms | █████  5
  25 ms | █  1
  26 ms | ███  3
  27 ms | ███████  8
  28 ms | ████████  9
  29 ms | ██████████  11
  30 ms | ████████████████████  21
  31 ms | █████████████  14
  32 ms | ████████████████████████████████  34
  33 ms | ████████████████████████████████████████  43
  34 ms | ████████████████████  22
  35 ms | ████████████████████  21
  36 ms | ████████  9
  37 ms | █████████  10
  38 ms | ███████████  12
  39 ms | ███████████████  16
  40 ms | ███████  8
  41 ms | ██████████████  15
  42 ms | ███████  8
  43 ms | ███████  8
  44 ms | ██████████  11
  45 ms | ██████████  11
  46 ms | ████████████████  17
  47 ms | ███████  7
  48 ms | ███████████  12
  49 ms | ████████████  13
  50 ms | ██████  6
  51 ms | █████  5
  52 ms | ██████  6
  53 ms | ███  3
  54 ms | ████████  9
  55 ms | ████  4
  56 ms | ████  4
  57 ms | ████  4
  58 ms | ████  4
  59 ms | ████  4
  60 ms | █  1
  61 ms | ██  2
  62 ms | █  1
  63 ms | ██  2
  64 ms | ██  2
  65 ms | ██  2
  73 ms | ██  2
 678 ms | █  1
 696 ms | █  1
 716 ms | █  1
 735 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `entity_count_delta` = `-10.00`
- `entity_count_sample_start` = `11.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `1.72`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `24.01`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7457.00`
- `preload_duration_ms` = `235.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 28000 ms  |  Sample ticks: 400

**FPS**  avg `32.75`, min `1.35`, p50 `28.96`, p95 `64.89`, p99 `123.60`, 1%low `1.36`, 0.1%low `n/a`, std `20.53`

**Frame time (ms)**  avg `58.53`, p50 `34.53`, p95 `62.67`, p99 `716.82`, p99.9 `739.24`, max `740.61`

**Client tick (ms)**  avg `0.56`, p95 `1.20`, max `18.56`

**Memory**  start `7406 MB`, end `7413 MB`, peak `7769 MB`, GC `74 events / 8807 ms`

**FPS over sampling window (ASCII):**

```
 59.8 |                                                              █                 
 56.5 |                                                              █                 
 53.1 | █                                                            █             █   
 49.8 | █                                             █              █             █   
 46.5 | █                                             █              █            ██   
 43.2 | █                    █        █               █              █           ███   
 39.9 | █              █     █        █           █   █ █          █ █           ███   
 36.6 | █         █    █     █     █ ██        ██ █   ███       █  █ █  █        ███ █ 
 33.3 |██    █ █  █ █  █     █     █ ██    █   █████  ███  █ █  █  █ ██ █   █ █  ███ ██
 30.0 |█████████ █████ █   ███  █  █ ███ ███ █ █████  ████ ███ ██  ████████ ███  ███ ██
 26.7 |████████████████████████████████████████████████████████████████████ ████ ██████
 23.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
   7 ms | ███  3
   8 ms | ██  2
   9 ms | █  1
  10 ms | ███  3
  11 ms | █  1
  12 ms | █  1
  13 ms | █████  5
  14 ms | █  1
  15 ms | ███████  7
  16 ms | ███████  7
  17 ms | ███████  7
  18 ms | █████  5
  19 ms | ██████████  10
  20 ms | ███████  7
  21 ms | ███  3
  22 ms | ████  4
  23 ms | ███  3
  24 ms | ███  3
  25 ms | █████  5
  26 ms | ████  4
  27 ms | ████  4
  28 ms | ████  4
  29 ms | ██████████  10
  30 ms | ███████  7
  31 ms | █████████████  13
  32 ms | ████████████████████████  23
  33 ms | ████████████████████████████████████████  39
  34 ms | ██████████████████████  21
  35 ms | ███████████  11
  36 ms | ███████████  11
  37 ms | █████████  9
  38 ms | ████████  8
  39 ms | ████████  8
  40 ms | █████  5
  41 ms | █████████  9
  42 ms | ███  3
  43 ms | ███  3
  44 ms | ███  3
  45 ms | ████████  8
  46 ms | ██████████  10
  47 ms | ██████  6
  48 ms | ███████  7
  49 ms | ██████  6
  50 ms | █████  5
  51 ms | ████████  8
  52 ms | ███  3
  53 ms | ███  3
  54 ms | ████  4
  55 ms | ███████  7
  56 ms | █████  5
  57 ms | ███  3
  58 ms | █████  5
  59 ms | ██  2
  60 ms | ██  2
  61 ms | █  1
  62 ms | █████  5
  64 ms | █  1
  65 ms | ██  2
  68 ms | █  1
  73 ms | █  1
  84 ms | █  1
 661 ms | █  1
 675 ms | █  1
 677 ms | █  1
 679 ms | █  1
 691 ms | █  1
 697 ms | █  1
 700 ms | █  1
 708 ms | █  1
 713 ms | █  1
 733 ms | █  1
 734 ms | █  1
 737 ms | █  1
 740 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `17.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `1.36`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `17.08`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7477.00`
- `preload_duration_ms` = `2574.00`
- `entity_count_sample_end` = `6.00`
- `preset_long` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 25909 ms  |  Sample ticks: 400

**FPS**  avg `32.66`, min `1.31`, p50 `28.90`, p95 `71.07`, p99 `116.10`, 1%low `1.36`, 0.1%low `n/a`, std `21.91`

**Frame time (ms)**  avg `63.53`, p50 `34.60`, p95 `68.63`, p99 `707.72`, p99.9 `757.07`, max `764.97`

**Client tick (ms)**  avg `0.60`, p95 `1.30`, max `13.12`

**Memory**  start `7578 MB`, end `7497 MB`, peak `7750 MB`, GC `79 events / 10054 ms`

**FPS over sampling window (ASCII):**

```
 74.3 |                                      █                                         
 69.4 |                                      █                                         
 64.6 |                                      █                                         
 59.7 |                                      █                                         
 54.9 |                                      █                                         
 50.0 |              █                       █          █                           ██ 
 45.1 |   █          █                       █          █  █         █  █           ██ 
 40.3 |   █          █       █ █   █         █         ██  █      ██ █  █        █  ██ 
 35.4 |█ ██ █        █   █ █ █ █ █ █ █   █ █ ██ █      ███ ██  █  ████ ██    █   ██ ██ 
 30.6 |████ ██  █ ████████ █ █ █ █ █ █ ███ ████ ██  █ ████ ██  █  █████████  ███ ██ ███
 25.7 |████ ██ ███████████████████████████ ███████████████ █████████████████████ ██ ███
 20.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   6 ms | █  1
   8 ms | ████  3
   9 ms | ██  2
  10 ms | ████  3
  11 ms | ███████  6
  12 ms | █  1
  14 ms | █████  4
  15 ms | ██  2
  16 ms | █████████  8
  17 ms | █████████  8
  18 ms | █  1
  19 ms | █████  4
  20 ms | ███████  6
  21 ms | ████  3
  22 ms | ████  3
  23 ms | ████  3
  24 ms | ████████████  10
  25 ms | ████  3
  26 ms | ████  3
  27 ms | ████  3
  28 ms | █████  4
  29 ms | ████████  7
  30 ms | ████████  7
  31 ms | ██████████████  12
  32 ms | ████████████████████████████  24
  33 ms | ████████████████████████████████████████  34
  34 ms | █████████████████████████  21
  35 ms | ██████████████  12
  36 ms | ████████  7
  37 ms | █████████  8
  38 ms | ████████████████  14
  39 ms | ███████████  9
  40 ms | ██████  5
  41 ms | ████  3
  42 ms | ████████████  10
  43 ms | ██████  5
  44 ms | ████████  7
  45 ms | ████████  7
  46 ms | ███████  6
  47 ms | ████████████  10
  48 ms | ███████  6
  49 ms | █  1
  50 ms | ██████  5
  51 ms | ██████  5
  52 ms | ██  2
  53 ms | █████  4
  54 ms | ██████  5
  55 ms | █████  4
  56 ms | █  1
  57 ms | ██  2
  58 ms | █  1
  59 ms | █  1
  60 ms | ██  2
  61 ms | ████  3
  62 ms | █  1
  63 ms | █  1
  64 ms | ██  2
  66 ms | █  1
  67 ms | █  1
  68 ms | ████  3
  69 ms | █  1
  70 ms | █  1
  74 ms | █  1
 668 ms | █  1
 674 ms | █  1
 677 ms | █  1
 681 ms | █  1
 687 ms | █  1
 688 ms | █  1
 696 ms | █  1
 700 ms | █  1
 701 ms | █  1
 702 ms | █  1
 705 ms | █  1
 710 ms | █  1
 714 ms | █  1
 742 ms | █  1
 764 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `entity_count_delta` = `27.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `1.36`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `15.74`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `66.00`
- `entity_count_sample_end` = `28.00`
- `preset_long` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 32344 ms  |  Sample ticks: 400

**FPS**  avg `31.59`, min `1.22`, p50 `29.18`, p95 `67.09`, p99 `133.48`, 1%low `1.26`, 0.1%low `n/a`, std `22.38`

**Frame time (ms)**  avg `101.86`, p50 `34.27`, p95 `725.69`, p99 `767.32`, p99.9 `806.71`, max `817.62`

**Client tick (ms)**  avg `0.42`, p95 `0.96`, max `4.95`

**Memory**  start `7332 MB`, end `7439 MB`, peak `7772 MB`, GC `76 events / 16647 ms`

**FPS over sampling window (ASCII):**

```
 62.8 |      █                                                             █           
 58.2 |      █                                                             █        █  
 53.6 |      █                                        █    █   █           █        █  
 49.0 |      █                           █            █    █   █           █        █  
 44.4 |      █                      █    █            █    █  ██           █        █  
 39.8 |   █  █  ██             █   ██    █ █    █     █  █ █ ███           █        █  
 35.2 |█  █  █ ███  █  █ █  █  █   ██    █ ██   █ █ █ █  █ █ ███   █       █ █      █  
 30.6 |█  ██ █ ████ ████ ████  █ █ ███ █ █ ███  █ ███ ████ █ █████ █  █ ██ █ ██     █  
 26.0 |███████ ███████████████ ███████ █ █████  █████ ████ █ ██████████ ██ █ ██ █  ██ █
 21.4 |████████████████████████████████████████ ████████████ ██████████ ██ █ ████ █████
 16.8 |████████████████████████████████████████████████████████████████ ████ ████ █████
 12.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | ███  1
   7 ms | █████████  3
   8 ms | ███  1
  10 ms | ███  1
  11 ms | ███  1
  12 ms | ███  1
  13 ms | ██████  2
  14 ms | █████████  3
  15 ms | ████████████  4
  16 ms | █████████████████████████  8
  18 ms | ██████  2
  19 ms | █████████  3
  20 ms | █████████  3
  21 ms | █████████  3
  22 ms | ██████  2
  23 ms | ██████████████████  6
  24 ms | ███████████████  5
  25 ms | █████████████████████████  8
  26 ms | ███  1
  27 ms | ██████████████████  6
  28 ms | ███████████████  5
  29 ms | ██████████████████  6
  30 ms | ██████████████████████  7
  31 ms | ████████████████████████████████████████  13
  32 ms | ██████████████████████████████████  11
  33 ms | ████████████████████████████████████████  13
  34 ms | ██████████████████  6
  35 ms | ███████████████  5
  36 ms | ████████████  4
  37 ms | ███  1
  38 ms | ███  1
  39 ms | █████████  3
  40 ms | ███  1
  41 ms | ████████████  4
  42 ms | ██████████████████████  7
  43 ms | ███████████████  5
  44 ms | ███████████████  5
  45 ms | ███████████████  5
  46 ms | ████████████████████████████  9
  47 ms | ███████████████  5
  48 ms | ███████████████  5
  49 ms | ███  1
  50 ms | ██████  2
  51 ms | ██████  2
  52 ms | █████████  3
  53 ms | ████████████  4
  54 ms | ████████████  4
  55 ms | █████████  3
  56 ms | ██████  2
  57 ms | ███  1
  58 ms | ██████  2
  60 ms | ██████  2
  61 ms | ██████  2
  62 ms | ███  1
  65 ms | ███  1
  67 ms | ███  1
  69 ms | ███  1
  74 ms | ███  1
  76 ms | ███  1
  81 ms | ███  1
 681 ms | ███  1
 686 ms | ███  1
 700 ms | ███  1
 702 ms | ███  1
 708 ms | ███  1
 711 ms | ██████  2
 720 ms | ███  1
 722 ms | ███  1
 724 ms | ███  1
 725 ms | ███  1
 737 ms | ███  1
 739 ms | ███  1
 745 ms | ███  1
 750 ms | ███  1
 751 ms | ███  1
 757 ms | ███  1
 759 ms | ███  1
 761 ms | ███  1
 766 ms | ███  1
 768 ms | ███  1
 772 ms | ███  1
 817 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `entity_count_delta` = `-8.00`
- `entity_count_sample_start` = `19.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `1.26`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `3326.00`
- `entity_count_sample_end` = `11.00`
- `preset_long` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 28945 ms  |  Sample ticks: 400

**FPS**  avg `31.93`, min `1.29`, p50 `28.11`, p95 `66.56`, p99 `131.53`, 1%low `1.29`, 0.1%low `n/a`, std `25.43`

**Frame time (ms)**  avg `109.51`, p50 `35.58`, p95 `709.89`, p99 `763.98`, p99.9 `775.34`, max `776.48`

**Client tick (ms)**  avg `0.51`, p95 `1.04`, max `6.31`

**Memory**  start `7398 MB`, end `7459 MB`, peak `7776 MB`, GC `74 events / 17541 ms`

**FPS over sampling window (ASCII):**

```
126.6 |                                    █                                           
116.0 |                                    █                                           
105.3 |                                    █                                           
 94.7 |                                    █                                           
 84.1 |                                    █                                           
 73.5 |                                    █   █                                       
 62.9 |                                    █   █      █   █               █      █     
 52.3 |                █                   █   █      █   █               █   █  █     
 41.7 |        █    █  █            █      █  ██   █  █   ██  █  █  ██ ██ █   ██ █   █ 
 31.1 |███  ██ ███  ██ ███ █  █  ██ ███ ██ ██ ████ █  ███ ██ ███ ██ ██ ██ ███ ██████ ██
 20.4 |████████████████████████████ █████████████████████ ██ ███ ██ █████████ ██████ ██
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ███  1
   6 ms | ███  1
   7 ms | ███  1
   8 ms | █████  2
   9 ms | █████  2
  11 ms | ███  1
  13 ms | ███  1
  14 ms | ████████  3
  15 ms | █████████████  5
  16 ms | ███████████  4
  17 ms | ████████  3
  18 ms | ████████████████  6
  19 ms | █████████████  5
  21 ms | ████████  3
  22 ms | █████████████  5
  23 ms | ███  1
  24 ms | █████  2
  25 ms | ███████████  4
  27 ms | █████  2
  28 ms | ███  1
  29 ms | █████  2
  30 ms | ███████████████████  7
  31 ms | ███████████████████████████  10
  32 ms | ████████████████████████████████  12
  33 ms | ████████████████████████████████████████  15
  34 ms | █████████████████████████████  11
  35 ms | █████████████████████  8
  36 ms | ████████████████████████  9
  37 ms | ███████████  4
  38 ms | ████████████████  6
  39 ms | █████  2
  40 ms | ████████  3
  41 ms | █████████████  5
  42 ms | █████  2
  43 ms | ████████████████  6
  44 ms | ████████  3
  45 ms | ███████████  4
  46 ms | █████████████  5
  47 ms | ███████████  4
  48 ms | ████████  3
  49 ms | █████  2
  50 ms | █████████████  5
  51 ms | ███  1
  52 ms | ████████  3
  53 ms | ███  1
  54 ms | ███  1
  55 ms | ████████  3
  56 ms | █████  2
  57 ms | █████  2
  58 ms | ███  1
  59 ms | ███  1
  60 ms | ███  1
  61 ms | ███  1
  62 ms | ███  1
  64 ms | ███  1
  69 ms | ███  1
  75 ms | ███  1
 653 ms | ███  1
 672 ms | ███  1
 677 ms | ███  1
 686 ms | ███  1
 689 ms | ███  1
 691 ms | ███  1
 692 ms | █████  2
 694 ms | ███  1
 696 ms | ███  1
 699 ms | ███  1
 703 ms | ███  1
 709 ms | █████  2
 714 ms | ███  1
 719 ms | ███  1
 722 ms | ███  1
 724 ms | ███  1
 728 ms | ███  1
 741 ms | ███  1
 742 ms | ███  1
 743 ms | ███  1
 771 ms | █████  2
 776 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `entity_count_delta` = `-23.00`
- `entity_count_sample_start` = `24.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `1.29`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.13`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7499.00`
- `preload_duration_ms` = `59.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 30428 ms  |  Sample ticks: 400

**FPS**  avg `30.39`, min `1.26`, p50 `28.47`, p95 `71.01`, p99 `117.89`, 1%low `1.28`, 0.1%low `n/a`, std `22.40`

**Frame time (ms)**  avg `141.05`, p50 `35.12`, p95 `742.35`, p99 `756.38`, p99.9 `788.89`, max `794.88`

**Client tick (ms)**  avg `0.35`, p95 `0.75`, max `5.37`

**Memory**  start `7529 MB`, end `7467 MB`, peak `7763 MB`, GC `77 events / 19969 ms`

**FPS over sampling window (ASCII):**

```
 75.6 |                            █                                                   
 69.4 |                            █         █                                    █    
 63.1 |                            █         █      █                        █    █    
 56.8 |                            █  █      █      █                        █  █ █    
 50.6 |        █                   █  █      █      █                     █  █  █ █    
 44.3 |        █        █     █    █  █      █      █  █                  █  █  █ █    
 38.0 | █   █  █  █     █     █    █  █   █  ██     ██ █  █               █  █  █ █    
 31.7 | ██  ██ █  █ █  ███ █  █ █  █  ██  █  ██     ██ █  ██ █         ██ █  █  █ █  ██
 25.5 |████ ██ ████ ██ ███ ███████ ██ ███ ██ ███ ██ █████ ██ ██ ██ ██ ███ ██ ██ ███████
 19.2 |████ ██ ███████ ███ ██████████ ███ ██ ██████ █████████████████ ███ ██ ██████████
 12.9 |███████████████ █████████████████████ ██████████████████████████████████████████
  6.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | ███  1
   8 ms | ██████  2
   9 ms | ███  1
  10 ms | ███  1
  11 ms | ██████  2
  12 ms | ██████  2
  14 ms | ██████  2
  15 ms | ████████████  4
  16 ms | ███  1
  17 ms | ██████  2
  19 ms | ███  1
  20 ms | ██████  2
  21 ms | ████████████  4
  22 ms | ███  1
  23 ms | ████████████  4
  24 ms | █████████  3
  25 ms | ████████████  4
  26 ms | ██████  2
  28 ms | ██████  2
  29 ms | █████████  3
  30 ms | █████████  3
  31 ms | ████████████████████████████████████████  13
  32 ms | █████████████████████████████████████  12
  33 ms | █████████████████████████████████████  12
  34 ms | ███████████████  5
  35 ms | █████████████████████████  8
  36 ms | █████████  3
  37 ms | ██████████████████████  7
  38 ms | ██████  2
  39 ms | ████████████  4
  40 ms | ███████████████  5
  41 ms | ███  1
  42 ms | ██████████████████  6
  43 ms | ██████  2
  44 ms | █████████  3
  45 ms | ███████████████  5
  46 ms | ███████████████  5
  47 ms | █████████  3
  48 ms | ███  1
  49 ms | ██████  2
  50 ms | ███  1
  51 ms | ███  1
  52 ms | ██████  2
  57 ms | ███  1
  58 ms | ███  1
  83 ms | ███  1
 686 ms | ███  1
 688 ms | ███  1
 692 ms | ███  1
 696 ms | ██████  2
 699 ms | ███  1
 715 ms | ███  1
 716 ms | ███  1
 718 ms | ███  1
 722 ms | ███  1
 723 ms | ███  1
 726 ms | ███  1
 727 ms | ███  1
 730 ms | ███  1
 731 ms | ███  1
 733 ms | ███  1
 734 ms | ███  1
 736 ms | ███  1
 742 ms | ██████  2
 743 ms | ███  1
 747 ms | ███  1
 748 ms | ███  1
 754 ms | ██████  2
 755 ms | ███  1
 761 ms | ███  1
 794 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `entity_count_delta` = `6.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `1.28`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `56.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `7.09`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7507.00`
- `preload_duration_ms` = `721.00`
- `entity_count_sample_end` = `8.00`
- `preset_long` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 29613 ms  |  Sample ticks: 400

**FPS**  avg `36.68`, min `1.33`, p50 `28.00`, p95 `100.86`, p99 `280.20`, 1%low `1.35`, 0.1%low `n/a`, std `49.04`

**Frame time (ms)**  avg `147.33`, p50 `35.71`, p95 `706.52`, p99 `720.44`, p99.9 `749.11`, max `752.38`

**Client tick (ms)**  avg `0.46`, p95 `0.94`, max `6.83`

**Memory**  start `7711 MB`, end `7690 MB`, peak `7769 MB`, GC `78 events / 19907 ms`

**FPS over sampling window (ASCII):**

```
192.9 |                                              █                                 
176.3 |                                              █                                 
159.7 |                                   █          █                                 
143.1 |                                   █          █                                 
126.5 |                                   █          █                                 
109.9 |                      █        █   █   █      █                                 
 93.4 |                      █        █   █   █      █                              █  
 76.8 | █                    █        █   █   █      █               █              █  
 60.2 | █                    █        █   █   █      █               █       █      █  
 43.6 | █   █                █      █ █   █   █ █ █  █  █       █  ███       █ █ ██ █  
 27.0 | ███ ██████ ██████ ██ ██████ █████████ ██████ ██ ██ ██ ████ ████ ██ █ █ ████ █ █
 10.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███  1
   3 ms | █████  2
   4 ms | ███  1
   5 ms | █████  2
   6 ms | █████  2
   7 ms | ███  1
  11 ms | ███  1
  12 ms | ████████  3
  14 ms | ███  1
  15 ms | ███  1
  16 ms | █████  2
  17 ms | █████  2
  18 ms | █████████████  5
  19 ms | █████  2
  21 ms | █████  2
  22 ms | ███  1
  23 ms | ███  1
  24 ms | █████  2
  25 ms | ███  1
  26 ms | ███  1
  27 ms | ████████  3
  28 ms | ████████  3
  29 ms | █████  2
  30 ms | ███  1
  31 ms | ██████████  4
  32 ms | ████████████████████████████  11
  33 ms | ████████████████████████████████████████  16
  34 ms | ██████████████████  7
  35 ms | ██████████████████  7
  36 ms | █████████████  5
  37 ms | ██████████  4
  38 ms | ███████████████  6
  39 ms | █████  2
  40 ms | █████  2
  41 ms | ██████████  4
  42 ms | ██████████  4
  43 ms | █████████████  5
  44 ms | ██████████  4
  46 ms | ████████  3
  47 ms | █████  2
  48 ms | ██████████  4
  49 ms | ██████████  4
  50 ms | █████  2
  51 ms | █████  2
  54 ms | █████  2
  55 ms | ███  1
  58 ms | ███  1
 660 ms | ███  1
 667 ms | ███  1
 669 ms | ███  1
 680 ms | █████  2
 684 ms | ███  1
 685 ms | ███  1
 687 ms | █████  2
 697 ms | ███  1
 699 ms | █████  2
 700 ms | ███  1
 701 ms | █████  2
 702 ms | █████  2
 704 ms | ███  1
 705 ms | █████  2
 706 ms | ███  1
 707 ms | █████  2
 708 ms | ███  1
 710 ms | ███  1
 713 ms | ███  1
 715 ms | █████  2
 733 ms | ███  1
 752 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `entity_count_delta` = `3.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `1.35`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `50.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `6.79`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7517.00`
- `preload_duration_ms` = `50.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 30224 ms  |  Sample ticks: 400

**FPS**  avg `35.09`, min `1.30`, p50 `28.79`, p95 `75.04`, p99 `285.26`, 1%low `1.31`, 0.1%low `n/a`, std `46.23`

**Frame time (ms)**  avg `164.91`, p50 `34.73`, p95 `728.85`, p99 `753.86`, p99.9 `766.68`, max `768.02`

**Client tick (ms)**  avg `2.10`, p95 `1.06`, max `675.33`

**Memory**  start `7432 MB`, end `7550 MB`, peak `7763 MB`, GC `81 events / 20800 ms`

**FPS over sampling window (ASCII):**

```
319.7 |                                    █                                           
290.7 |                                    █                                           
261.8 |                                    █                                           
232.8 |                                    █                                           
203.9 |                                    █                                           
174.9 |                                    █                                           
146.0 |                                    █                 █                         
117.1 | █                                  █                 █                         
 88.1 | █        █                         █                 █                         
 59.2 | █        █           █     █ █     █  █  █       █   █      █    █       █  █  
 30.2 | ███████ ██████ █████ ███████ █████ █████ █████ █████ ██████ ████ ███████ █████ 
  1.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   3 ms | ████  2
   4 ms | ██  1
   7 ms | ████  2
  10 ms | ██  1
  12 ms | ██  1
  13 ms | ████  2
  14 ms | ████  2
  15 ms | ██████  3
  17 ms | ██  1
  18 ms | ████  2
  19 ms | ██████████████  7
  20 ms | ██  1
  21 ms | ██████  3
  24 ms | ████  2
  25 ms | ████  2
  28 ms | ██  1
  29 ms | ██  1
  30 ms | ██████████  5
  31 ms | ██████  3
  32 ms | ██████████████████████  11
  33 ms | ████████████████████████████████████████  20
  34 ms | ██████████████  7
  35 ms | ████  2
  36 ms | ██████████  5
  37 ms | ██████████████████  9
  38 ms | ██████  3
  39 ms | ██████  3
  40 ms | ████  2
  41 ms | ██  1
  42 ms | ██████  3
  43 ms | ████  2
  44 ms | ██████  3
  45 ms | ██████████  5
  46 ms | ██████  3
  48 ms | ██  1
  49 ms | ████  2
  51 ms | ██  1
  52 ms | ██  1
  56 ms | ██  1
 672 ms | ██  1
 675 ms | ██  1
 678 ms | ██  1
 683 ms | ██  1
 684 ms | ██  1
 686 ms | ██  1
 691 ms | ██  1
 693 ms | ██  1
 694 ms | ██  1
 695 ms | ██  1
 698 ms | ██  1
 707 ms | ██  1
 709 ms | ██  1
 710 ms | ██  1
 717 ms | ██  1
 718 ms | ████  2
 719 ms | ████  2
 722 ms | ██  1
 726 ms | ██  1
 728 ms | ████  2
 729 ms | ██  1
 735 ms | ████  2
 737 ms | ██  1
 746 ms | ██  1
 749 ms | ██  1
 759 ms | ██  1
 768 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `entity_count_delta` = `32.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.01`
- `fps_1pct_low` = `1.31`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `57.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `6.06`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7523.00`
- `preload_duration_ms` = `62.00`
- `entity_count_sample_end` = `33.00`
- `preset_long` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 26632 ms  |  Sample ticks: 400

**FPS**  avg `92.37`, min `1.29`, p50 `30.92`, p95 `399.22`, p99 `949.87`, 1%low `1.30`, 0.1%low `n/a`, std `172.86`

**Frame time (ms)**  avg `48.82`, p50 `32.34`, p95 `55.64`, p99 `750.20`, p99.9 `776.28`, max `776.58`

**Client tick (ms)**  avg `0.52`, p95 `0.78`, max `53.05`

**Memory**  start `7264 MB`, end `7269 MB`, peak `7760 MB`, GC `198 events / 12114 ms`

**FPS over sampling window (ASCII):**

```
369.9 |                                                                          █     
338.2 |                                                                          █     
306.5 |                                                                     █ █  █     
274.8 |                                                               █    ██ ██ ██    
243.1 |                                                          █    █ █  ██ ██ ██ ██ 
211.4 |                                                         ██    █ █  ██ ██ ██ ██ 
179.7 |                                              █          ██   ██ █ ███ ██ ██ ██ 
148.0 |                                              █   █     ███  ███ █ ███ ██ ██ ███
116.3 |   █                                          █   █ █ █ ███  ███ █████ █████████
 84.6 |   █                                          ███████ ██████ ███████████████████
 52.9 |  ██                           ██           █ ██████████████████████████████████
 21.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  5
   1 ms | █████████  14
   2 ms | █████  7
   3 ms | ██  3
   5 ms | ███  4
   6 ms | ███  5
   7 ms | ██████████████  21
   8 ms | ████████████████████████████████████████  62
   9 ms | ██████████  16
  10 ms | ████  6
  11 ms | ███  4
  12 ms | █  2
  13 ms | ██  3
  14 ms | █  1
  15 ms | ██  3
  16 ms | █████  7
  17 ms | ████  6
  18 ms | ██  3
  19 ms | █████  7
  20 ms | ███████  11
  21 ms | █████  7
  22 ms | ████  6
  23 ms | ███  4
  24 ms | █████  8
  25 ms | ██  3
  26 ms | ██  3
  27 ms | ███  4
  28 ms | █  2
  29 ms | ██  3
  30 ms | ██  3
  31 ms | █████  8
  32 ms | ███████████████  24
  33 ms | ██████████████████████████████████  53
  34 ms | █████████████  20
  35 ms | █████  8
  36 ms | ███████  11
  37 ms | ████  6
  38 ms | ██  3
  39 ms | ███  5
  40 ms | ███  5
  41 ms | ██████  10
  42 ms | █████  8
  43 ms | ███  5
  44 ms | █████  7
  45 ms | ███  4
  46 ms | ██████  9
  47 ms | ████  6
  48 ms | ███  5
  49 ms | ███  5
  50 ms | ████  6
  51 ms | ███  5
  52 ms | ███  5
  53 ms | ██  3
  54 ms | ██  3
  55 ms | █  2
  56 ms | █  1
  57 ms | █  1
  58 ms | █  1
  59 ms | █  1
  62 ms | █  1
  63 ms | █  1
  64 ms | █  1
  72 ms | █  1
  73 ms | █  1
 729 ms | █  1
 736 ms | █  1
 738 ms | █  1
 741 ms | █  1
 742 ms | █  1
 744 ms | █  2
 746 ms | █  2
 748 ms | █  1
 758 ms | █  1
 766 ms | █  1
 774 ms | █  1
 775 ms | █  1
 776 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preload_duration_ms` = `72.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `20.48`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `1.30`
- `seed` = `1923.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 15566 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed Shift+ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `part` = `1.00`

