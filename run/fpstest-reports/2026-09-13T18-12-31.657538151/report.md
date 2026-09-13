# FPS Test session — 2026-09-13T18:22:48.194740188+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 107.9 | 46.1 | 44.8 | 21.25 | 0.60 | 3 | 288 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 99.7 | 39.3 | 22.4 | 21.43 | 0.67 | 1 | 392 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 95.1 | 22.3 | 20.9 | 41.48 | 0.62 | 1 | 376 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.5 | 20.3 | 17.8 | 47.68 | 0.70 | 3 | 660 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 29.3 | 20.8 | 20.5 | 47.34 | 0.64 | 0 | 520 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.5 | 20.5 | 20.4 | 48.36 | 0.47 | 0 | 332 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 29.1 | 20.7 | 20.1 | 47.47 | 0.69 | 1 | 352 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 29.5 | 20.1 | 18.2 | 47.93 | 1.05 | 2 | 108 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 30.7 | 17.2 | 16.7 | 56.92 | 2.96 | 5 | 28 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 32.9 | 16.0 | 15.8 | 60.69 | 3.83 | 7 | 81 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 29.6 | 20.6 | 20.4 | 48.19 | 0.96 | 2 | 503 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 29.6 | 20.7 | 20.1 | 47.77 | 0.46 | 4 | 132 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 31.9 | 16.4 | 15.6 | 59.43 | 3.09 | 5 | 220 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.9 | 17.4 | 16.6 | 56.47 | 2.66 | 2 | 156 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 39.3 | 13.2 | 12.6 | 73.70 | 14.61 | 25 | 486 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 37.1 | 12.7 | 12.2 | 75.67 | 15.46 | 25 | 135 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 29.7 | 18.8 | 18.4 | 50.60 | 1.83 | 4 | 519 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 29.8 | 17.9 | 16.6 | 50.29 | 1.83 | 2 | 328 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 29.6 | 20.3 | 20.0 | 48.39 | 0.63 | 0 | 496 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

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

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `107.90`, min `44.78`, p50 `105.05`, p95 `133.10`, p99 `969.76`, 1%low `46.06`, 0.1%low `44.79`, std `124.48`

**Frame time (ms)**  avg `12.12`, p50 `9.52`, p95 `19.28`, p99 `21.25`, p99.9 `22.18`, max `22.33`

**Client tick (ms)**  avg `0.60`, p95 `1.01`, max `1.39`

**Memory**  start `515 MB`, end `516 MB`, peak `803 MB`, GC `3 events / 15 ms`

**FPS over sampling window (ASCII):**

```
203.4 |                                              █                                █
192.4 |                                              █                                █
181.5 |                                      █       █                                █
170.5 |    █                                 █       █                                █
159.6 |    █             █                   █   █   █                                █
148.6 |    █             █               █   █   █   █     █            █            ██
137.6 |    █        █    █   ██          █   █   █   █   █ █       █    █            ██
126.7 |    █       ██  █ █   ██         ██   █   █   █   █ █       █    █         █  ██
115.7 | ██ █   █   ██  █ █   ██ █       ██   █ █ █   █   █ █      ██    █  █      █  ██
104.8 | ██ █   █   ██  █ █ █ ██ █       ██   █ █ █   █   █ █      ██    █  ██     █  ██
 93.8 |█████████ ██████████████████ ██ ███████████████ █████ ██ ██████ ██████ ███ █  ██
 82.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  14
   1 ms | █  18
   2 ms |   2
   4 ms |   1
   6 ms |   6
   7 ms | ███████████  153
   8 ms | ████████████████████████████████████████  545
   9 ms | ████████  109
  10 ms | █  18
  11 ms |   4
  12 ms |   3
  13 ms | █  18
  14 ms | ███████  91
  15 ms | ██████████████████  250
  16 ms | ███████████████  209
  17 ms | ██████  81
  18 ms | ███  36
  19 ms | ██  29
  20 ms | ███  39
  21 ms | ██  22
  22 ms |   3
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `sculk_charge_pop` | 240 | 206 | 107.3 | 20.70 |
| `ALL_TOGETHER` | 1680 | 206 | 112.7 | 21.23 |
| `portal` | 160 | 206 | 100.9 | 20.58 |
| `end_rod` | 240 | 206 | 111.3 | 20.32 |
| `dragon_breath` | 160 | 206 | 114.5 | 20.93 |
| `dripping_water` | 240 | 206 | 105.3 | 20.92 |
| `flame` | 160 | 206 | 100.5 | 21.00 |
| `smoke` | 160 | 206 | 110.8 | 21.21 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `44.79`
- `fps_harmonic_avg` = `82.54`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `59.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `46.06`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `99.65`, min `16.83`, p50 `96.92`, p95 `132.71`, p99 `400.30`, 1%low `39.27`, 0.1%low `22.38`, std `94.28`

**Frame time (ms)**  avg `12.24`, p50 `10.32`, p95 `18.93`, p99 `21.43`, p99.9 `29.20`, max `59.43`

**Client tick (ms)**  avg `0.67`, p95 `0.93`, max `1.50`

**Memory**  start `705 MB`, end `865 MB`, peak `1097 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
161.6 |                      █                         █                               
153.2 |  █                   █                         █           █                   
144.8 |  █                   █            █            █      █    █               █   
136.5 |  █    █              █ █          █            █      █    █          █    █   
128.1 |  █    █              █ █          █            █      █    █          █    █   
119.8 |  ██   █              █ █          █            █      █    █          █    █   
111.4 |  ███  ██            ██ █          █            █      ██   █          █    █   
103.1 |  ███  ██            ██ █  █       █            █      ██   █          █    █   
 94.7 |  ███ ████ █   █  █  ███████████████  ████ █ █ ██ █ █ ███████ █ ████ █ ███ ████ 
 86.3 |██████████████ █████████████████████████████████████████████████████████████████
 78.0 |██████████████ █████████████████████████████████████████████████████████████████
 69.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  7
   1 ms | █  10
   6 ms |   5
   7 ms | ███████████  153
   8 ms | ████████████████████████████████████████  535
   9 ms | ███████  100
  10 ms | █  20
  11 ms | █  15
  12 ms |   2
  13 ms | ██  32
  14 ms | ███████████  141
  15 ms | █████████████████  222
  16 ms | ████████████  167
  17 ms | ███████  95
  18 ms | ████  49
  19 ms | ███  40
  20 ms | ██  21
  21 ms | █  13
  22 ms |   2
  24 ms |   1
  25 ms |   1
  28 ms |   1
  29 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `109.00`
- `fps_harmonic_avg` = `81.68`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `22.38`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `39.27`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `95.09`, min `20.87`, p50 `70.92`, p95 `131.33`, p99 `181.76`, 1%low `22.33`, 0.1%low `20.87`, std `83.75`

**Frame time (ms)**  avg `13.43`, p50 `14.10`, p95 `22.01`, p99 `41.48`, p99.9 `45.73`, max `47.91`

**Client tick (ms)**  avg `0.62`, p95 `0.94`, max `1.39`

**Memory**  start `751 MB`, end `876 MB`, peak `1127 MB`, GC `1 events / 11 ms`

**FPS over sampling window (ASCII):**

```
147.9 |                                    █    █       █         █        █           
137.2 |        █          █         █      █    █ █     █         █        █           
126.4 |     █  █          █         █ █    █    █ █     █         █        █           
115.7 |    ██  █          █         █ █    ██   █ █     █         █     █  █           
104.9 |█   ██  █          █         █ █    ██   █ █     █         █     █  █           
 94.1 |█ █ ██  █  █      ████████████████████████ ██ ██████████ ████ ██████████ █████  
 83.4 |██████████████████████████████████████████████████████████████████████████████  
 72.6 |██████████████████████████████████████████████████████████████████████████████  
 61.9 |██████████████████████████████████████████████████████████████████████████████  
 51.1 |███████████████████████████████████████████████████████████████████████████████ 
 40.4 |███████████████████████████████████████████████████████████████████████████████ 
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | █  10
   2 ms |   2
   6 ms |   4
   7 ms | ██████████  119
   8 ms | ████████████████████████████████████████  471
   9 ms | ████████  94
  10 ms | █  11
  11 ms |   4
  13 ms | ██  20
  14 ms | ████████████  138
  15 ms | ██████████████████  215
  16 ms | ████████████  140
  17 ms | ██████  71
  18 ms | ███  34
  19 ms | ████  46
  20 ms | █  17
  21 ms | █  14
  22 ms |   3
  23 ms |   1
  31 ms |   2
  32 ms | █  9
  33 ms | █  14
  34 ms | █  12
  35 ms | █  9
  36 ms |   4
  37 ms |   2
  40 ms |   1
  41 ms |   3
  42 ms |   1
  43 ms |   2
  44 ms | █  6
  45 ms |   5
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `42.00`
- `fps_harmonic_avg` = `74.47`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `20.87`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `22.33`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23077 ms  |  Sample ticks: 400

**FPS**  avg `29.48`, min `17.76`, p50 `29.23`, p95 `45.94`, p99 `48.49`, 1%low `20.32`, 0.1%low `17.76`, std `6.86`

**Frame time (ms)**  avg `35.49`, p50 `34.21`, p95 `46.12`, p99 `47.68`, p99.9 `51.64`, max `56.32`

**Client tick (ms)**  avg `0.70`, p95 `0.89`, max `1.72`

**Memory**  start `473 MB`, end `738 MB`, peak `1133 MB`, GC `3 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                                       █         █                              
 32.6 |                          █            █         █         █        █           
 31.9 |           █              █            ██        █         █        █           
 31.2 |█   █      █           █ ██      █     ██        █   █  █  █        █           
 30.5 |█   █      █           █ ███   █ ██    ███     █ █   █  █  █  █ █  ██   █       
 29.8 |█   █    █ █   █  █    █ ████ ██ ██   ████     █ █   █  ███████ █ ████ ██  █ █  
 29.1 |█   ██ ███ █   █  █  █ █████████████ █████  █  █ █   █  ███████ ██████ ███ █ ███
 28.5 |██████ █████  ███ █████████████████████████ ██████ ████████████ ██████ ███ █████
 27.8 |████████████ ████ ████████████████████████████████ ███████████████████████ █████
 27.1 |█████████████████ ████████████████████████████████ ███████████████████████ █████
 26.4 |█████████████████ ██████████████████████████████████████████████████████████████
 25.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | █████  13
  21 ms | ████████  20
  22 ms | ████████  20
  23 ms | ████  11
  24 ms | ██  6
  28 ms |   1
  29 ms |   1
  30 ms | █  3
  31 ms | ██  4
  32 ms | ████████████████████████████████  80
  33 ms | ████████████████████████████████████████  101
  34 ms | █████████████████████████████  72
  35 ms | ███████████  27
  36 ms | ████████  19
  37 ms | ████  9
  38 ms | █████  13
  39 ms | ████  10
  40 ms | ███████  17
  41 ms | ██  6
  42 ms | ███  7
  43 ms | ████████  20
  44 ms | ████████████████  41
  45 ms | ████████████  30
  46 ms | ███████  17
  47 ms | ██████  14
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `66.00`
- `fps_harmonic_avg` = `28.18`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `152.00`
- `fps_0p1pct_low` = `17.76`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `152.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.32`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `29.30`, min `20.55`, p50 `29.24`, p95 `44.99`, p99 `47.14`, 1%low `20.81`, 0.1%low `20.55`, std `6.06`

**Frame time (ms)**  avg `35.38`, p50 `34.20`, p95 `45.82`, p99 `47.34`, p99.9 `48.57`, max `48.67`

**Client tick (ms)**  avg `0.64`, p95 `0.94`, max `1.24`

**Memory**  start `616 MB`, end `1136 MB`, peak `1136 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |            █                                                                   
 32.9 |            █                                                                   
 32.3 |            █                                        █                          
 31.6 |            █         █                              █                 █        
 31.0 |            █         █                              █ █ █   █ █    ██ █      █ 
 30.3 |            █ ██      █  █   █ █           █  █      █ █ █ █ █ █    ██ █  █ ███ 
 29.7 |            █ ██      █  █   █ ███     ██  █  █ █    ███████████  █ ████  █ ███ 
 29.1 |███ █  █ ██ █ ███     ████   █ ████ █████  █ ██ █  █ ███████████ ██ ████ ██ ███ 
 28.4 |███████████ █ █████████████████████████████████ ██ ████████████████ ████ ██ ████
 27.8 |███████████ █ █████████████████████████████████ ███████████████████ ████ ██ ████
 27.2 |███████████ █ ██████████████████████████████████████████████████████████ ███████
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ██  5
  21 ms | ██████  18
  22 ms | ███████  21
  23 ms | ████  12
  30 ms | █  2
  31 ms | ██  7
  32 ms | ████████████████████████  72
  33 ms | ████████████████████████████████████████  120
  34 ms | ██████████████████████████████  90
  35 ms | ████████████  37
  36 ms | ████████  24
  37 ms | ███  9
  38 ms | ████  12
  39 ms | ███  8
  40 ms | ████  12
  41 ms | ██  6
  42 ms | █  4
  43 ms | ██████  19
  44 ms | ███████████  34
  45 ms | ██████████  29
  46 ms | █████  16
  47 ms | ██  6
  48 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `35.00`
- `fps_harmonic_avg` = `28.27`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `20.55`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.81`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23131 ms  |  Sample ticks: 400

**FPS**  avg `29.46`, min `20.40`, p50 `29.42`, p95 `45.85`, p99 `47.98`, 1%low `20.54`, 0.1%low `20.40`, std `7.14`

**Frame time (ms)**  avg `35.68`, p50 `33.99`, p95 `46.97`, p99 `48.36`, p99.9 `48.97`, max `49.02`

**Client tick (ms)**  avg `0.47`, p95 `0.62`, max `0.78`

**Memory**  start `799 MB`, end `1131 MB`, peak `1131 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 32.7 |                                   █                                            
 32.1 |      █                 █          █   █              █         █               
 31.5 |    █ █  █ █     █      █          █   █              █     █   █    █    █     
 30.8 |    █ ██ █ █ █   █      █  █ █     █   █              ██    █   █    █    █     
 30.2 |    █ ██ █ █ █ █ █  █   ██ █ █     █   █       █ █ █  ██ █  ██  █  █ █ █  █     
 29.6 | ██ █ ██ █ █ █ █ █  █ █ ██ █ ████  ███ █  █ █ ████ █  ██ █ ███  █  █ █ █ ██ █   
 28.9 | ██ ██████ █ █ █ ██ █ █ ██ █ █████ ███ █ ██ █ ███████ ██ █████ █████ ███ ████  █
 28.3 | ██ ████████ ██████ █ ██████████████████ ██ █ ██████████ ███████████████ ████ ██
 27.7 | ███████████ ███████████████████████████████████████████████████████████ ███████
 27.0 | ███████████ ███████████████████████████████████████████████████████████████████
 26.4 |████████████ ███████████████████████████████████████████████████████████████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ███  8
  21 ms | █████████  27
  22 ms | █████████  27
  23 ms | ████  13
  26 ms |   1
  29 ms | █  3
  30 ms | ███  9
  31 ms | █  4
  32 ms | ██████████████████████████  74
  33 ms | ████████████████████████████████████████  116
  34 ms | ████████████  36
  35 ms | ██████████  29
  36 ms | ███████  20
  37 ms | ████  12
  38 ms | ███  10
  39 ms | ████  11
  40 ms | █  4
  41 ms | ███  8
  42 ms | ██  7
  43 ms | ████████  22
  44 ms | █████████████  37
  45 ms | ██████████  29
  46 ms | █████████  27
  47 ms | ██████  17
  48 ms | ███  9
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `24.00`
- `fps_harmonic_avg` = `28.03`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `20.40`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.54`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `29.10`, min `20.06`, p50 `29.30`, p95 `43.82`, p99 `47.23`, 1%low `20.74`, 0.1%low `20.06`, std `5.60`

**Frame time (ms)**  avg `35.47`, p50 `34.13`, p95 `45.54`, p99 `47.47`, p99.9 `49.24`, max `49.85`

**Client tick (ms)**  avg `0.69`, p95 `0.99`, max `1.33`

**Memory**  start `793 MB`, end `664 MB`, peak `1145 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |                                                     █                          
 32.3 |                                                     █                          
 31.7 |                                                     █ █                        
 31.2 |                                                     █ █         █              
 30.6 |                █   █      █               █     █   █ █ █       █              
 30.1 |  █  █    █     █   ██    ██ ██      █    ██ █   █   █ █ █       █    █ ███     
 29.5 | ██  █    █  █  █   ██ █  ██ ██  █   █ █  ██ █ █ ███ ██████  █   ██   █████     
 28.9 |████ █ █  █  █ ████ ████  ██ ███ █ ███ ██ ██ █ █ ███ ██████  █   ████ █████     
 28.4 |████████ ███████████████████ ███ █████████████ █ ███ █████████ ████████████     
 27.8 |████████████████████████████ ███ ███████████████ ██████████████████████████  █  
 27.3 |████████████████████████████ ███████████████████ ██████████████████████████████ 
 26.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  2
  21 ms | █████  14
  22 ms | █████  14
  23 ms | █████  14
  26 ms |   1
  29 ms |   1
  30 ms | █  4
  31 ms | ████  11
  32 ms | ██████████████████████████  80
  33 ms | ████████████████████████████████████████  124
  34 ms | ██████████████████████████  82
  35 ms | ████████████  36
  36 ms | █████  14
  37 ms | ██████  20
  38 ms | █████  14
  39 ms | ███  9
  40 ms | ████  11
  41 ms | ██  6
  42 ms | ██  7
  43 ms | ██████  20
  44 ms | ████████████  36
  45 ms | ██████  19
  46 ms | █████  14
  47 ms | ███  9
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `42.00`
- `fps_harmonic_avg` = `28.19`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `20.06`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.74`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `29.45`, min `18.18`, p50 `29.16`, p95 `45.34`, p99 `48.09`, 1%low `20.11`, 0.1%low `18.18`, std `6.67`

**Frame time (ms)**  avg `35.45`, p50 `34.29`, p95 `46.39`, p99 `47.93`, p99.9 `52.62`, max `55.00`

**Client tick (ms)**  avg `1.05`, p95 `1.25`, max `1.50`

**Memory**  start `1059 MB`, end `723 MB`, peak `1167 MB`, GC `2 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |                                                                 █              
 34.0 |                                                                 █              
 33.3 |                                                                 █          █   
 32.6 |                                                          █      █          █   
 31.9 |                █   █    █                                █      █ ██       █  █
 31.2 |    █       █   █  ██ █  █ █    █        █             █  █      █ ██       ██ █
 30.5 | █  █       █  ██  ██ █  █ ██ █ █   █    █       █   █ █  ██   █ █ ██       ████
 29.8 | █  █ █     █  ██  ██ █  █ ██ █ █   █ █  █       █  ██ █████   █ █ ██  ██   ████
 29.0 | █ ████    ██████ ███ █  █ ████ █  ██ █████  █  ███ ██ █████ █ █ █ ██  ███  ████
 28.3 |█████████ ███████ ███ ██ ████████ ███ █████████████ ██ ███████ ███ ███ ████ ████
 27.6 |█████████████████████ ██ █████████████████████████████████████████████ █████████
 26.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms |   1
  20 ms | ███  7
  21 ms | █████████  19
  22 ms | ███████████  24
  23 ms | ████  8
  24 ms | ██  5
  25 ms |   1
  29 ms | █  2
  30 ms |   1
  31 ms | █████  12
  32 ms | ███████████████████████████████████████  86
  33 ms | ████████████████████████████████████████  89
  34 ms | ████████████████████████████████████████  89
  35 ms | █████████████  29
  36 ms | ███████  16
  37 ms | ███  7
  38 ms | ██████  14
  39 ms | ████  10
  40 ms | ████  10
  41 ms | ███  6
  42 ms | █████  11
  43 ms | ████████  17
  44 ms | █████████████  29
  45 ms | ██████████████  32
  46 ms | ███████████  24
  47 ms | ████  9
  48 ms | ██  4
  50 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `31.00`
- `fps_harmonic_avg` = `28.21`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `18.18`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.11`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `30.66`, min `16.67`, p50 `29.55`, p95 `47.82`, p99 `54.18`, 1%low `17.21`, 0.1%low `16.67`, std `9.07`

**Frame time (ms)**  avg `35.34`, p50 `33.84`, p95 `53.15`, p99 `56.92`, p99.9 `59.07`, max `59.98`

**Client tick (ms)**  avg `2.96`, p95 `3.57`, max `4.19`

**Memory**  start `1159 MB`, end `582 MB`, peak `1187 MB`, GC `5 events / 20 ms`

**FPS over sampling window (ASCII):**

```
 35.9 |                                                                        █       
 35.1 |                   █ █                                        █         █       
 34.3 |               █   █ █             █                        █ █   █     █  █    
 33.5 |               █   █ █         █   █            █           █ █   █     █  █   █
 32.6 |█         █    █   █ █         █   █            █         █ █ █   ██    █  █   █
 31.8 |█         █    █   █ █       █ █   █            █   ██ █  █ █ █   ██    █  █   █
 31.0 |█        ██ █  ███ █ █       █ █   █     █ █  █ █ █ ██ █ ██ █ █ █ ██ █ ███ ███ █
 30.2 |██    █  ████ ████ █ █ ██ ██ █ █████     █ ██ ███ █████████ █ █ ██████ ███ ███ █
 29.4 |██ █  █  ████ ██████ ███████ █ █████ █   █ ██ ███ █████████ █ ████████ ███ █████
 28.6 |█████ ██████████████ ███████ █ ███████  █████ ███ ████████████████████████ █████
 27.8 |████████████████████ ███████████████████████████████████████████████████████████
 27.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | ██  3
  18 ms | ████  6
  19 ms | ███████████  15
  20 ms | ████  5
  21 ms | ██████████████████  25
  22 ms | ████████████████████  29
  23 ms | ███████  10
  24 ms | ████████  11
  25 ms | ███████████  15
  26 ms | ██  3
  27 ms | █  1
  29 ms | █████████  13
  30 ms | ████████████████████████████████████████  57
  31 ms | ████████████  17
  32 ms | ███████████████  22
  33 ms | █████████████████████████████████████  53
  34 ms | █████████████  19
  35 ms | ██████████  14
  36 ms | ██████████████████████████████████  49
  37 ms | ████████  12
  38 ms | ███████████  16
  39 ms | ████  5
  40 ms | ██  3
  41 ms | █████  7
  42 ms | ████████  11
  43 ms | █████████  13
  44 ms | ███████████████  21
  45 ms | ███████████████  21
  46 ms | █████  7
  47 ms | ███████████  16
  48 ms | ██████████  14
  49 ms | ███████  10
  50 ms | █  2
  51 ms | ████  6
  52 ms | ██  3
  53 ms | ██████  9
  54 ms | ███  4
  55 ms | █████  7
  56 ms | ████  6
  57 ms | █  2
  58 ms | █  2
  59 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `36.00`
- `fps_harmonic_avg` = `28.29`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `16.67`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `17.21`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `32.85`, min `15.84`, p50 `29.95`, p95 `54.11`, p99 `93.88`, 1%low `15.99`, 0.1%low `15.84`, std `16.50`

**Frame time (ms)**  avg `35.26`, p50 `33.39`, p95 `54.92`, p99 `60.69`, p99.9 `63.10`, max `63.12`

**Client tick (ms)**  avg `3.83`, p95 `5.21`, max `9.05`

**Memory**  start `1100 MB`, end `646 MB`, peak `1181 MB`, GC `7 events / 28 ms`

**FPS over sampling window (ASCII):**

```
 54.8 |                                                               █                
 52.3 |                                                               █                
 49.8 |                                                               █                
 47.3 |                                                    █          █                
 44.8 |                                                    █          █                
 42.3 |      █                                             █          █                
 39.8 | █    █ █                █      █                   █          █             █  
 37.3 | █    █ █                █    █ █                   █          █          █  █  
 34.8 | █    █ █       █  █     █   ██ █            █  █   ███        █  █ █ █ █ █  █  
 32.3 |██ ██ █ ██  ██ █████ ███ ███ ██ █ █ ██ ██  █ ██ █ █ ██████  ██ ██ █ █ █ █ ██ █  
 29.8 |█████ █ ██ █████████████████████████████████████████████████████████████████████
 27.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   6 ms | █  1
   8 ms | ███  2
   9 ms | █  1
  10 ms | ████  3
  11 ms | ████  3
  13 ms | █  1
  14 ms | █  1
  15 ms | █  1
  16 ms | ████  3
  17 ms | ████  3
  18 ms | ████████████████████████  17
  19 ms | █████████████  9
  20 ms | ███████████████████  13
  21 ms | ██████████████████████████  18
  22 ms | ████████████████████████████████████████  28
  23 ms | ██████████████████████████████  21
  24 ms | ███████████████████████████  19
  25 ms | ███████████  8
  26 ms | █████████  6
  27 ms | ███████  5
  28 ms | █████████████████████████████  20
  29 ms | ███████████████████████████████  22
  30 ms | ████████████████████████████████████████  28
  31 ms | ████████████████████████  17
  32 ms | █████████████████████████████  20
  33 ms | ███████████████████████████████████████  27
  34 ms | ██████████████  10
  35 ms | ████████████████████  14
  36 ms | ██████████████████████████  18
  37 ms | ███████████████████  13
  38 ms | ████████████████  11
  39 ms | ███████████  8
  40 ms | ███████  5
  41 ms | ███████████  8
  42 ms | ██████████████  10
  43 ms | █████████  6
  44 ms | █████████████████  12
  45 ms | █████████████  9
  46 ms | ██████████████████████████  18
  47 ms | █████████████████████████████████  23
  48 ms | ██████████████████████████  18
  49 ms | ███████████████████████  16
  50 ms | █████████████  9
  51 ms | ████████████████  11
  52 ms | ██████  4
  53 ms | █████████████  9
  54 ms | ████████████████  11
  55 ms | ███  2
  56 ms | ██████  4
  57 ms | █████████████  9
  58 ms | █  1
  59 ms | ███  2
  60 ms | ████  3
  61 ms | ███  2
  62 ms | █  1
  63 ms | ████  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_alive_p50` = `1240.00`
- `entity_count_sample_end` = `1561.00`
- `entity_count_sample_start` = `681.00`
- `items_alive_max` = `1560.00`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `15.99`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `28.36`
- `preload_duration_ms` = `33.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `15.84`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`
- `items_alive_p95` = `1560.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `29.61`, min `20.37`, p50 `29.38`, p95 `45.05`, p99 `50.16`, 1%low `20.57`, 0.1%low `20.37`, std `6.81`

**Frame time (ms)**  avg `35.30`, p50 `34.04`, p95 `46.38`, p99 `48.19`, p99.9 `49.04`, max `49.09`

**Client tick (ms)**  avg `0.96`, p95 `1.16`, max `2.13`

**Memory**  start `686 MB`, end `561 MB`, peak `1190 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 32.9 |                                                          █                     
 32.4 |                                         █ ███            █    █                
 31.9 |                                         █ ███   █        █    █                
 31.3 |      █        █                         █ ███  ██        █    █                
 30.8 |   █  █  █     ██                        █ ████ ██    █   █ █  █        █       
 30.2 |█  █  █ ██ █  ███       ██     █     █   █ ████ ██ █  █   █ █  █ █      █   █  █
 29.7 |█  █  █ ████  ███  █    ██ █   ██   ████ ██████ ██ █  █  █████ █ █████  █   ██ █
 29.2 |█  █  █ ████  ███ ██ █ █████ █ ██   ████ ██████ ██ █ ███ ███████ █████  █  ███ █
 28.6 |█ ██ ███████  ███ ████ ███████ ███ █████ █████████ ███████████████████ ██  ███ █
 28.1 |█ ████████████████████████████ █████████ █████████████████████████████████ █████
 27.5 |██████████████████████████████ █████████ ███████████████████████████████████████
 27.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | ██  5
  20 ms | ████  10
  21 ms | ████  10
  22 ms | ███████  19
  23 ms | ███████  17
  24 ms | ███  8
  25 ms |   1
  30 ms | █  3
  31 ms | ███████  17
  32 ms | ████████████████████████████████  83
  33 ms | ████████████████████████████████████████  104
  34 ms | ██████████████████████████  67
  35 ms | ████████████  32
  36 ms | ███████  19
  37 ms | ███  7
  38 ms | ████  10
  39 ms | ████  10
  40 ms | █  3
  41 ms | ███  8
  42 ms | ████  11
  43 ms | ██████████  27
  44 ms | ███████████  28
  45 ms | ███████████  28
  46 ms | ███████  18
  47 ms | █████  13
  48 ms | ██  5
  49 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `20.37`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `28.33`
- `fps_1pct_low` = `20.57`
- `preload_duration_ms` = `103.00`
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

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `29.58`, min `20.13`, p50 `29.49`, p95 `45.92`, p99 `48.13`, 1%low `20.69`, 0.1%low `20.13`, std `6.83`

**Frame time (ms)**  avg `35.37`, p50 `33.91`, p95 `46.50`, p99 `47.77`, p99.9 `49.02`, max `49.68`

**Client tick (ms)**  avg `0.46`, p95 `0.62`, max `0.80`

**Memory**  start `1055 MB`, end `522 MB`, peak `1187 MB`, GC `4 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                                                       █                        
 32.6 |                                                       █                        
 32.0 |                █      █                 █             █                   █    
 31.4 |       █   █    █ █    █                 █       █     █     █             █  █ 
 30.7 |       █   █    █ █ █  █ ██   █          █    █  █ █   ██    █     █  █ █  ██ █ 
 30.1 |   █ █ █   █  █ █ █ █  ████   █        ████  ██  █ █   ██    █     █  █ █  ██ █ 
 29.5 | █ █ █ █ █ █  █ █ █ ██ ████  ██  █     ████ ████ █ ██████    █ ██ ██ ██ █  ██ █ 
 28.9 | ███████ ████ █ █ █ ██ █████ ██████ █ ██████████ ████████ ████ ██████████████ ██
 28.2 |███████████████ █ █ ██ ███████████████████████████████████████ █████████████████
 27.6 |██████████████████████████████████████████████████████████████ █████████████████
 27.0 |██████████████████████████████████████████████████████████████ █████████████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ███  11
  21 ms | ████████  28
  22 ms | █████  18
  23 ms | ███  12
  29 ms | █  3
  30 ms | ██  6
  31 ms | ██  9
  32 ms | ████████████████  59
  33 ms | ████████████████████████████████████████  146
  34 ms | ███████████████  56
  35 ms | ████████  30
  36 ms | ████  14
  37 ms | ███  11
  38 ms | ███  11
  39 ms | ██  6
  40 ms | ███  12
  41 ms | █  5
  42 ms | █  5
  43 ms | ██  8
  44 ms | █████████  34
  45 ms | ███████████  40
  46 ms | ███████  25
  47 ms | ████  13
  48 ms | █  2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.69`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `28.27`
- `preload_duration_ms` = `52.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.13`
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

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `31.91`, min `15.63`, p50 `29.62`, p95 `51.17`, p99 `66.70`, 1%low `16.41`, 0.1%low `15.63`, std `12.71`

**Frame time (ms)**  avg `35.27`, p50 `33.76`, p95 `54.52`, p99 `59.43`, p99.9 `62.64`, max `63.97`

**Client tick (ms)**  avg `3.09`, p95 `5.02`, max `6.08`

**Memory**  start `856 MB`, end `492 MB`, peak `1076 MB`, GC `5 events / 17 ms`

**FPS over sampling window (ASCII):**

```
 47.2 |                                                      █                         
 45.3 |                                                      █                         
 43.3 |                    █ █                               █                         
 41.4 |                    █ █                               █                         
 39.5 |                    █ █                               █                         
 37.5 |      █      █      █ █                               █                         
 35.6 |   █  █      █      █ █                           █   █      █                  
 33.7 | █ █  █     ██   █  █ █ ██ █   █         █   █    █  ██   ██ █         █ █      
 31.8 |██ ██ █ █ ██████ ██ ███ ██ █   ██  ██ █ ████ ███ ██████ ████ █   █  ████ █      
 29.8 |█████████ ██████ ██ ██████████ █████████████████████████████████ ███████ █ █████
 27.9 |████████████████████████████████████████████████████████████████ ███████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | █  1
   8 ms | ██  2
  10 ms | █  1
  11 ms | █  1
  12 ms | █  1
  16 ms | █  1
  17 ms | ████  4
  18 ms | █████████████  12
  19 ms | ██████████████████████████  24
  20 ms | ████████████████  15
  21 ms | ██████████████████  17
  22 ms | ██████████████████████████  24
  23 ms | ███████████████████  18
  24 ms | ███████████████  14
  25 ms | ████████  7
  26 ms | █████  5
  27 ms | ████████  7
  28 ms | ██████████  9
  29 ms | █████████████████  16
  30 ms | █████████████████████████████  27
  31 ms | ████████████████████████  22
  32 ms | ████████████████████████  22
  33 ms | ████████████████████████████████████████  37
  34 ms | ███████████████  14
  35 ms | ███████████████████████████████████  32
  36 ms | █████████████████████  19
  37 ms | ███████████████████  18
  38 ms | █████████  8
  39 ms | ████  4
  40 ms | █  1
  41 ms | ████  4
  42 ms | █████████  8
  43 ms | ███████████  10
  44 ms | █████████████████  16
  45 ms | ███████████████████  18
  46 ms | ██████████████████████  20
  47 ms | ██████████████████████  20
  48 ms | █████████████████████  19
  49 ms | ███████████████  14
  50 ms | █████  5
  51 ms | █████████  8
  52 ms | ████  4
  53 ms | ████████  7
  54 ms | █████  5
  55 ms | █████████  8
  56 ms | ██  2
  57 ms | ████████  7
  58 ms | ██  2
  59 ms | ███  3
  60 ms | ██  2
  61 ms | █  1
  63 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `28.35`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `163.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `15.63`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.43`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `16.41`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23128 ms  |  Sample ticks: 400

**FPS**  avg `30.91`, min `16.59`, p50 `28.74`, p95 `50.26`, p99 `56.10`, 1%low `17.43`, 0.1%low `16.59`, std `10.88`

**Frame time (ms)**  avg `35.26`, p50 `34.79`, p95 `51.45`, p99 `56.47`, p99.9 `58.56`, max `60.27`

**Client tick (ms)**  avg `2.66`, p95 `4.34`, max `10.68`

**Memory**  start `984 MB`, end `1076 MB`, peak `1140 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 43.0 |                                                        █                       
 41.4 |  █                                                     █                       
 39.9 |  █                                                     █                       
 38.3 |  █                                                     █                       
 36.7 |  █  █                                                  █                       
 35.2 |  █  █     █                        █                   ██   █                  
 33.6 |█ █  █  █  █        ██       █      █                 █ ██ █ █                  
 32.0 |█ █ ███ █ ████   ██ ██       █   █  ████    ███  █  █ █ ██ █ █ █    █       █   
 30.5 |█ ████████████ █ ███████  ██ █   █ █████   ████  █ ██ █ ██ █ █ █ █████    █ █   
 28.9 |███████████████████████████████ █████████████████████ █ ██ ███ █████████  █████ 
 27.4 |██████████████████████████████████████████████████████████████ ██████████ ██████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | █  1
   8 ms | █  1
  16 ms | █  1
  17 ms | ██  4
  18 ms | ████  6
  19 ms | ████████████  19
  20 ms | ██████████  17
  21 ms | ███████████  18
  22 ms | ██████████  17
  23 ms | ███████  11
  24 ms | ███████  11
  25 ms | ███  5
  26 ms | ██  3
  28 ms | ██  4
  29 ms | ██  4
  30 ms | ██████████  17
  31 ms | █████████████████████████  42
  32 ms | █████████████  21
  33 ms | ████████████████████████████████████████  66
  34 ms | ███████████████  24
  35 ms | ██████████████████████████████  49
  36 ms | █████████████████  28
  37 ms | ██████████  17
  38 ms | █████  9
  39 ms | ████████  13
  40 ms | ████  6
  41 ms | █████  9
  42 ms | ███████  12
  43 ms | ███████  11
  44 ms | ███████████  18
  45 ms | ██████████  16
  46 ms | ███████████  18
  47 ms | ██████████  16
  48 ms | █████  9
  49 ms | ████  7
  50 ms | ███  5
  51 ms | ████  7
  52 ms | ████  6
  53 ms | ████  6
  54 ms | ██  4
  56 ms | ████  7
  57 ms | █  1
  60 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `28.36`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `33.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `16.59`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.52`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `17.43`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `39.33`, min `12.64`, p50 `29.35`, p95 `79.37`, p99 `205.53`, 1%low `13.16`, 0.1%low `12.64`, std `38.18`

**Frame time (ms)**  avg `36.06`, p50 `34.07`, p95 `65.37`, p99 `73.70`, p99.9 `77.75`, max `79.10`

**Client tick (ms)**  avg `14.61`, p95 `20.05`, max `25.38`

**Memory**  start `689 MB`, end `799 MB`, peak `1175 MB`, GC `25 events / 89 ms`

**FPS over sampling window (ASCII):**

```
110.2 |                                                    █                           
102.6 |                                                    █                           
 94.9 |                                                    █                           
 87.3 |                                                    █    █                      
 79.7 |                                                    █    █                      
 72.1 |                                                    █    █             █        
 64.5 |  █                                █                █    █             █  █     
 56.9 |  █                                █   █   █        ███ ██             █  █     
 49.3 |  █      █            █    █       █   █   █     █  ███ ██             █ ███    
 41.7 |█ █    █ █          ███    █      ██   █ █ █    ██  ███ ██     █   █   █████    
 34.1 |█ ██████████████ █ ███████ ██ ██ ███ ███ ███ █ ████████ ███ █████ ██████████████
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  1
   3 ms | ███  2
   4 ms | █████████  5
   5 ms | █████  3
   6 ms | ██  1
   7 ms | ██████████  6
   8 ms | █████  3
   9 ms | ███  2
  10 ms | ███  2
  11 ms | ███  2
  12 ms | ███  2
  13 ms | █████  3
  14 ms | █████████████████  10
  15 ms | ██████████████████████████  15
  16 ms | █████████████████████████████████████  21
  17 ms | █████████████████████████████████  19
  18 ms | █████████████████████████████████████  21
  19 ms | █████████████████████  12
  20 ms | ████████████  7
  21 ms | ███████████████████  11
  22 ms | ██████████  6
  23 ms | ██████████████  8
  24 ms | ██████████████  8
  25 ms | ████████████████  9
  26 ms | ██████████  6
  27 ms | ████████████████  9
  28 ms | █████████  5
  29 ms | ██████████  6
  30 ms | ████████████████  9
  31 ms | ███████████████████████████████████  20
  32 ms | ████████████████████████████████████████  23
  33 ms | ███████████████████████████████  18
  34 ms | ██████████████████████████████  17
  35 ms | ████████████████████████  14
  36 ms | █████████████████  10
  37 ms | █████████  5
  38 ms | █████████  5
  39 ms | ██████████████  8
  40 ms | █████  3
  41 ms | ████████████  7
  42 ms | ████████████████  9
  43 ms | ███████████████████████  13
  44 ms | █████████  5
  45 ms | █████████████████████  12
  46 ms | ██████████  6
  47 ms | █████████████████████  12
  48 ms | ████████████████████████████  16
  49 ms | ████████████████████████  14
  50 ms | ███████████████████  11
  51 ms | ██████████  6
  52 ms | ████████████████████████  14
  53 ms | █████████  5
  54 ms | █████████████████████  12
  55 ms | ███████  4
  56 ms | █████  3
  57 ms | █████████  5
  58 ms | █████  3
  59 ms | ███████  4
  60 ms | ███████  4
  61 ms | ████████████████  9
  62 ms | █████  3
  63 ms | █████████  5
  64 ms | █████████  5
  65 ms | █████████  5
  66 ms | █████  3
  67 ms | ███████  4
  69 ms | █████  3
  70 ms | ███  2
  71 ms | ███████  4
  72 ms | ██  1
  73 ms | ███  2
  74 ms | █████  3
  76 ms | ███  2
  79 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4804.57`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `12.64`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.73`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `28789.00`
- `preload_duration_ms` = `72.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `13.16`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `37.09`, min `12.23`, p50 `28.96`, p95 `77.72`, p99 `144.74`, 1%low `12.68`, 0.1%low `12.23`, std `28.54`

**Frame time (ms)**  avg `36.48`, p50 `34.52`, p95 `64.45`, p99 `75.67`, p99.9 `80.49`, max `81.74`

**Client tick (ms)**  avg `15.46`, p95 `21.13`, max `25.46`

**Memory**  start `1049 MB`, end `1128 MB`, peak `1185 MB`, GC `25 events / 89 ms`

**FPS over sampling window (ASCII):**

```
 81.3 |                        █                                                       
 76.3 |                        █                                                       
 71.2 |          █             █                                                       
 66.1 |          █             █                     █                       █         
 61.1 |          █             █                     █                       █         
 56.0 |          █             █                     █          █            █         
 51.0 |          █       █     █                     █          █            █         
 45.9 | █   ██   █       █ █   █ █   █               █  █       █            █    █    
 40.9 | █   ██   █       █ ██  █ █   █  ██  █        █  █       █    ██      █    █    
 35.8 | █ ████ █ ███ ██ ██ ███ █ █   ██ ██  ██ ██  █ █████ ██ █ █ ██████  ██ ██ █ █  █ 
 30.7 |████████████████ ██████ █████████████████████ █████ ████████████████████████████
 25.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   5 ms | ████  3
   6 ms | ███  2
   7 ms | █████████  6
   8 ms | ███████████  8
   9 ms | ███  2
  10 ms | ███████  5
  12 ms | ███  2
  13 ms | ███████  5
  14 ms | ███████  5
  15 ms | ██████████████  10
  16 ms | █████████████████████████████  20
  17 ms | ████████████████████████████████████  25
  18 ms | ███████████████████  13
  19 ms | █████████████████  12
  20 ms | █████████████  9
  21 ms | ██████████  7
  22 ms | ████  3
  23 ms | █████████████  9
  24 ms | ██████████████  10
  25 ms | █████████████  9
  26 ms | ███████  5
  27 ms | ███████████  8
  28 ms | ████████████████  11
  29 ms | ██████████  7
  30 ms | ███████████████████  13
  31 ms | █████████████████  12
  32 ms | ████████████████████████████████████████  28
  33 ms | ███████████████████████  16
  34 ms | ███████████████████  13
  35 ms | ███████████████████  13
  36 ms | ███████  5
  37 ms | █████████████  9
  38 ms | ███████████████████████  16
  39 ms | ███████████  8
  40 ms | ████████████████████  14
  41 ms | █████████████  9
  42 ms | ████  3
  43 ms | █████████████  9
  44 ms | ███████████  8
  45 ms | █████████████  9
  46 ms | █████████  6
  47 ms | ██████████  7
  48 ms | ██████████████  10
  49 ms | ████████████████████████  17
  50 ms | █████████████████  12
  51 ms | █████████  6
  52 ms | ███████████  8
  53 ms | ████████████████████  14
  54 ms | ██████████  7
  55 ms | ███████  5
  56 ms | ██████  4
  57 ms | ██████  4
  58 ms | ███████████  8
  59 ms | █████████  6
  60 ms | █████████  6
  61 ms | █████████  6
  62 ms | ███████  5
  63 ms | █████████  6
  64 ms | ███  2
  65 ms | ████  3
  66 ms | ████  3
  67 ms | ████  3
  69 ms | ████  3
  70 ms | ████  3
  72 ms | ████  3
  73 ms | █  1
  74 ms | █  1
  75 ms | █  1
  76 ms | █  1
  77 ms | ███  2
  78 ms | █  1
  79 ms | █  1
  81 ms | █  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4812.11`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `12.23`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.41`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `25970.00`
- `preload_duration_ms` = `55.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `12.68`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `29.66`, min `18.44`, p50 `28.91`, p95 `46.63`, p99 `52.42`, 1%low `18.80`, 0.1%low `18.44`, std `7.19`

**Frame time (ms)**  avg `35.37`, p50 `34.59`, p95 `47.42`, p99 `50.60`, p99.9 `54.08`, max `54.22`

**Client tick (ms)**  avg `1.83`, p95 `2.56`, max `3.37`

**Memory**  start `670 MB`, end `762 MB`, peak `1189 MB`, GC `4 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 34.4 |          █                      █                                              
 33.6 |          █        █  █ █        █                                              
 32.8 |          █        █  █ █        █                   █  █                      █
 32.1 |          █ █    ███  █ █        █                 █ █  █                      █
 31.3 |        █ █ █ █  ███ ██ █  █     █    █            █ █  █                      █
 30.5 | █      █ █████ ████ ██ ██ █   █ ██   █      █     █ ██ █ █       █            █
 29.7 |██  █   ███████ ████ █████ █ █ █ ██   █      █ ██  █ ████ █    █  █  █   █  █  █
 28.9 |█████  ████████ ██████████ ███ █ ██   █      █ ███ █ ██████ ██████████   █  ████
 28.2 |██████████████████████████ █████ ███████ ██ ██████ ████████████████████  █  ████
 27.4 |██████████████████████████ █████ ██████████████████████████████████████ ███ ████
 26.6 |████████████████████████████████ ███████████████████████████████████████████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  3
  18 ms | █  2
  19 ms | ███  7
  20 ms | ████  8
  21 ms | ████████  17
  22 ms | ██████  13
  23 ms | ████  8
  24 ms | ████  9
  25 ms |   1
  29 ms |   1
  30 ms | ████  8
  31 ms | ██████████████████████  48
  32 ms | ██████████████████  39
  33 ms | ████████████████████████████████████████  89
  34 ms | ████████████████████  44
  35 ms | ███████████████████████████  59
  36 ms | ███████████████  34
  37 ms | █████████  19
  38 ms | ███████  16
  39 ms | ██  4
  40 ms | █████  11
  41 ms | ██████  14
  42 ms | ███  7
  43 ms | ███████  16
  44 ms | ██████████  22
  45 ms | █████████  19
  46 ms | ██████  13
  47 ms | █████  12
  48 ms | ████  10
  49 ms | █  3
  50 ms | █  3
  51 ms |   1
  52 ms |   1
  53 ms | █  3
  54 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.37`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `18.44`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `28.28`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3724.00`
- `preload_duration_ms` = `49.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `18.80`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `29.77`, min `16.56`, p50 `28.97`, p95 `45.89`, p99 `50.93`, 1%low `17.95`, 0.1%low `16.56`, std `7.49`

**Frame time (ms)**  avg `35.25`, p50 `34.52`, p95 `47.27`, p99 `50.29`, p99.9 `58.43`, max `60.39`

**Client tick (ms)**  avg `1.83`, p95 `2.50`, max `8.42`

**Memory**  start `796 MB`, end `1009 MB`, peak `1124 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 41.1 |             █                                                                  
 39.8 |             █                                                                  
 38.5 |             █                                                                  
 37.2 |             █                                                                  
 35.9 |             █                                                                  
 34.6 |             █                                                              █   
 33.3 |             █ █    █              █                                   █    █   
 32.0 | █  █ █      █ █    █              █         █        █                ██   █   
 30.7 | █ ████ ████ █ ██   █ █  █  █    █ ██    █   █  ███  ██         █   █  ██   █ █ 
 29.4 |██ ███████████ ████ ████ █  █    ██████  ███ █ ████████        ██ ████ ████████ 
 28.1 |██████████████ ████ ████████████████████████ ████████████████████ ██████████████
 26.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms |   1
  17 ms |   1
  18 ms |   1
  19 ms | ███  6
  20 ms | ██  5
  21 ms | ██████████  21
  22 ms | █████  11
  23 ms | ███████  14
  24 ms | ███  6
  25 ms |   1
  30 ms | ███████  15
  31 ms | ████████████████████████  52
  32 ms | ███████████████████  40
  33 ms | ████████████████████████████████████████  86
  34 ms | ████████████████████████  52
  35 ms | ████████████████████████████  60
  36 ms | █████████████  27
  37 ms | █████████  19
  38 ms | █████████  20
  39 ms | ██████  12
  40 ms | ███  6
  41 ms | ██  4
  42 ms | ███  6
  43 ms | █████  11
  44 ms | ███████  14
  45 ms | █████████  19
  46 ms | █████████  20
  47 ms | █████████  19
  48 ms | ████  8
  49 ms | █  3
  50 ms | █  2
  55 ms | █  2
  56 ms | █  2
  60 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `618.99`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `16.56`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `28.37`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3087.00`
- `preload_duration_ms` = `65.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `17.95`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `29.61`, min `19.99`, p50 `29.26`, p95 `45.64`, p99 `48.23`, 1%low `20.34`, 0.1%low `19.99`, std `6.97`

**Frame time (ms)**  avg `35.39`, p50 `34.17`, p95 `46.95`, p99 `48.39`, p99.9 `49.71`, max `50.01`

**Client tick (ms)**  avg `0.63`, p95 `0.80`, max `0.99`

**Memory**  start `468 MB`, end `964 MB`, peak `964 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.8 |                                                  █                       █     
 33.1 |                                                  █                       █   █ 
 32.4 |                                   █              █ █             █     █ █   █ 
 31.7 |                █    █             █    █      █  █ █       █     █     █ █   █ 
 31.1 |   ██        █  █    █             █    █      █  █ █       █   █ █  █  █ █ █ █ 
 30.4 |   ██        █  █    █       ██    █ █  █    █ ██ █ ██      █   █ ██ █  █ █ █ ██
 29.7 |   ██  ██ █ ███ █  ███  ███  ██    █ ██ █    █ ██ █ ████    █   ██████  █ █ █ ██
 29.0 |   ███ ██ █████████████████████  █ █ ██████  ██████ ████  █ █  ████████ █ █ █ ██
 28.4 |█  ███ ██ █████████████████████ ██ █ ███████ ███████████ ████  ████████ █ █ █ ██
 27.7 |██████ ██ █████████████████████ ████████████ █████████████████ ██████████ █ █ ██
 27.0 |██████ ███████████████████████████████████████████████████████ █████████████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ████  10
  21 ms | ███████  19
  22 ms | ████████████  33
  23 ms | ████  11
  30 ms | █  2
  31 ms | ██  5
  32 ms | █████████████████████████████  78
  33 ms | ████████████████████████████████████████  106
  34 ms | ██████████████████████████  70
  35 ms | ███████████████  39
  36 ms | ██████  16
  37 ms | ██████  15
  38 ms | ███  9
  39 ms | ████  11
  40 ms | ██  6
  41 ms | ████  10
  42 ms | ████  11
  43 ms | ██  5
  44 ms | ████████  20
  45 ms | █████████████  34
  46 ms | ███████████  28
  47 ms | ██████  15
  48 ms | ███  8
  49 ms | █  2
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `20.34`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `72.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `19.99`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `28.26`
- `neighbour_updates` = `0.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 1539 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

