# FPS Test session — 2026-09-07T12:29:48.289429503+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 110.3 | 47.8 | 46.4 | 20.46 | 0.62 | 1 | 240 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 111.9 | 46.5 | 45.2 | 20.95 | 0.64 | 2 | 161 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.4 | 20.9 | 20.2 | 46.90 | 0.69 | 1 | 352 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 28.4 | 21.0 | 20.4 | 46.45 | 0.68 | 5 | 120 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.5 | 20.9 | 20.1 | 46.80 | 0.62 | 1 | 336 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 28.4 | 20.8 | 20.5 | 47.33 | 0.45 | 1 | 284 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 28.3 | 20.8 | 20.6 | 47.10 | 0.65 | 3 | 284 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 28.4 | 20.0 | 16.9 | 47.03 | 1.07 | 5 | 114 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 28.7 | 17.5 | 17.0 | 54.72 | 2.89 | 5 | 422 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 30.3 | 16.3 | 15.9 | 59.89 | 3.61 | 10 | 263 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 28.4 | 21.0 | 20.7 | 47.01 | 0.94 | 5 | 173 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 28.2 | 21.2 | 21.0 | 46.70 | 0.48 | 4 | 184 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 30.4 | 16.4 | 15.9 | 59.26 | 3.43 | 5 | 377 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 29.1 | 17.0 | 16.5 | 57.62 | 2.45 | 4 | 537 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

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

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `110.26`, min `46.24`, p50 `118.15`, p95 `132.47`, p99 `142.80`, 1%low `47.79`, 0.1%low `46.42`, std `67.93`

**Frame time (ms)**  avg `10.21`, p50 `8.46`, p95 `18.11`, p99 `20.46`, p99.9 `21.39`, max `21.63`

**Client tick (ms)**  avg `0.62`, p95 `0.96`, max `1.69`

**Memory**  start `523 MB`, end `526 MB`, peak `763 MB`, GC `1 events / 4 ms`

**FPS over sampling window (ASCII):**

```
164.0 |                                                █                               
158.5 |                                                █        █                      
153.0 |                                                █   █    █                      
147.5 |                                                █   █    █                     █
142.0 |      █                                         █   █    █                     █
136.5 |      █                                         █   █    █                     █
130.9 |      █                           █             █   █    █                     █
125.4 |      █                           █       █     █   █    █                     █
119.9 |      █                           █       █     █   █    █                     █
114.4 |      █      █                    █       █     █   █    █                     █
108.9 | ██ ████  █  █  █  █  █ ██ ██ ██████  █  ███  █ ██ ██ ██ ██ ██  █  █ █  █  █ ███
103.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms |   3
   3 ms |   1
   5 ms |   1
   6 ms |   10
   7 ms | ███████████  282
   8 ms | ████████████████████████████████████████  1019
   9 ms | ████████  203
  10 ms |   4
  13 ms | █  13
  14 ms | ██  44
  15 ms | ████  109
  16 ms | ████  100
  17 ms | ██  61
  18 ms | ██  43
  19 ms | █  27
  20 ms | █  27
  21 ms |   8
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `sculk_charge_pop` | 240 | 244 | 111.0 | 20.21 |
| `ALL_TOGETHER` | 1680 | 244 | 106.8 | 21.33 |
| `portal` | 160 | 244 | 106.5 | 19.51 |
| `end_rod` | 240 | 244 | 109.2 | 19.39 |
| `dragon_breath` | 160 | 244 | 114.9 | 19.93 |
| `dripping_water` | 240 | 244 | 116.6 | 20.57 |
| `flame` | 160 | 244 | 106.5 | 19.73 |
| `smoke` | 160 | 244 | 110.7 | 19.86 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `47.79`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `46.42`
- `fps_harmonic_avg` = `97.96`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `0.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `111.93`, min `45.17`, p50 `118.03`, p95 `132.65`, p99 `143.62`, 1%low `46.50`, 0.1%low `45.20`, std `73.23`

**Frame time (ms)**  avg `10.27`, p50 `8.47`, p95 `18.28`, p99 `20.95`, p99.9 `22.00`, max `22.14`

**Client tick (ms)**  avg `0.64`, p95 `0.91`, max `1.26`

**Memory**  start `606 MB`, end `754 MB`, peak `768 MB`, GC `2 events / 6 ms`

**FPS over sampling window (ASCII):**

```
154.0 |                                                            █        █          
149.4 |                                                            █ █      █         █
144.9 |                                                            █ █      █         █
140.3 |                     █                                      █ █      █         █
135.7 |  █          █       █              █                  █    █ █      █         █
131.1 |  █       █  █       █              █                  █    █ █      █         █
126.5 |  ██      █  █       █       █      █                  █    ███      █         █
122.0 |█ ██      █  █       █       █      █                  █    ███     ██ █       █
117.4 |█ ██      █  █       █       █      █                  █    ███     ██ █       █
112.8 |█ ██      █  █       █       █      █                  █    ███     ██ █       █
108.2 |█ ██ █  ████ █  ██ ████  █  ██ █  █ ██ █  █   █ ██ █  ██ ██ █████ ████ ██  █  ██
103.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms |   11
   2 ms |   1
   6 ms |   4
   7 ms | ███████████  285
   8 ms | ████████████████████████████████████████  1019
   9 ms | ████████  194
  13 ms |   1
  14 ms | █  36
  15 ms | ███  84
  16 ms | ████  113
  17 ms | ███  85
  18 ms | █  38
  19 ms | █  32
  20 ms | █  23
  21 ms | █  17
  22 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `62.00`
- `fps_harmonic_avg` = `97.39`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `45.20`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `46.50`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23069 ms  |  Sample ticks: 400

**FPS**  avg `28.38`, min `20.16`, p50 `29.50`, p95 `30.94`, p99 `47.07`, 1%low `20.85`, 0.1%low `20.16`, std `4.46`

**Frame time (ms)**  avg `36.01`, p50 `33.89`, p95 `45.26`, p99 `46.90`, p99.9 `48.94`, max `49.60`

**Client tick (ms)**  avg `0.69`, p95 `0.94`, max `7.45`

**Memory**  start `447 MB`, end `497 MB`, peak `799 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 31.3 |                      █    █                        █                           
 30.8 |     █   █            █    █ █         █            █        █               █  
 30.4 |     █  ██ █          █    █ █      █  █            █        █       █       █  
 29.9 |     █  ██ █          █    █ █      █  █  █    █    █ █      █       █       █  
 29.5 |     █  ██ █          █    █ █ █    ██ █  █    █    █ █      █       █       █  
 29.1 |     █  ██ █          █    █ █ █    ██ █  █    █    █ ██     █ █  █ ██    █  █  
 28.6 |     █  ██ ██   █     ██  ██ █ █    ██ █  █    █    █ ██  █  █ █  █ ██   ██  █  
 28.2 |    ██ ███████  █  ██ ██ ███ ███ █  ██ █  ██ █ █    █ ██  ████ █ ██ ███ ████ █  
 27.8 | ██ ██ ██████████  ██ ██████ ██████ █████ ██ █ ███ ██ ██  ██████ ███████████ ██ 
 27.3 | ██ ██ ███████████ ██ █████████████ █████ ████████ █████ ███████████████████ ███
 26.9 |███ ██████████████ ██ ██████████████████████████████████████████████████████ ███
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms |   2
  21 ms | ██  9
  22 ms | █  6
  25 ms |   1
  26 ms |   1
  31 ms |   1
  32 ms | ██████████████████████████  107
  33 ms | ████████████████████████████████████████  162
  34 ms | █████████████████  69
  35 ms | ██  8
  36 ms | ██  8
  37 ms | ██  9
  38 ms | ███  12
  39 ms | ███  14
  40 ms | ███  13
  41 ms | ███████  29
  42 ms | ███████  28
  43 ms | █████  22
  44 ms | █████  20
  45 ms | █████  20
  46 ms | ██  8
  47 ms | █  4
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `37.00`
- `fps_harmonic_avg` = `27.77`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `20.16`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.85`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `28.36`, min `20.43`, p50 `29.45`, p95 `31.15`, p99 `47.74`, 1%low `20.97`, 0.1%low `20.43`, std `4.69`

**Frame time (ms)**  avg `36.10`, p50 `33.96`, p95 `44.74`, p99 `46.45`, p99.9 `48.45`, max `48.94`

**Client tick (ms)**  avg `0.68`, p95 `0.85`, max `1.09`

**Memory**  start `694 MB`, end `453 MB`, peak `814 MB`, GC `5 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |                                                   █                            
 32.2 |                                                   █                            
 31.7 |        █                                          █                            
 31.1 |        █     █             █    █          █      █              █             
 30.5 |█       █     █             █    █          █      █    █         █        █ █  
 29.9 |█       █     █  █          █    █          █      █   ██ █     █ █        ███  
 29.3 |██  ██  █     ██ █          █    █         ██      █   ██ █     █ █        ███  
 28.8 |███ ██  █ █   ██ ██         █  █ █         ██  █   █   ██ █   █ ███        ███ █
 28.2 |██████  ███  ███ ██    █ █ ███ █ ██ █    █████ ██ ███  ████ █ █████  █    ██████
 27.6 |██████ █████ ███ ██ █ ██ █ ███ █ ██ ██ █ █████ ██ ███ ██████████████ ██ █ ██████
 27.0 |████████████████████████████████████████ █████ ██ ███ █████████████████ ████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  6
  21 ms | █  5
  22 ms | █  2
  23 ms | █  4
  24 ms |   1
  25 ms |   1
  28 ms |   1
  30 ms |   1
  31 ms | █  4
  32 ms | ████████████████████████████  106
  33 ms | ████████████████████████████████████████  151
  34 ms | ██████████████████  67
  35 ms | ██  7
  36 ms | ██  7
  37 ms | ██  8
  38 ms | █  5
  39 ms | ███  13
  40 ms | ██████  21
  41 ms | █████████  33
  42 ms | ███████  28
  43 ms | ███████  28
  44 ms | █████████  33
  45 ms | ███  11
  46 ms | █  5
  47 ms | █  3
  48 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `62.00`
- `fps_harmonic_avg` = `27.70`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `20.43`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.97`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23070 ms  |  Sample ticks: 400

**FPS**  avg `28.50`, min `20.06`, p50 `29.47`, p95 `31.12`, p99 `48.62`, 1%low `20.91`, 0.1%low `20.06`, std `4.93`

**Frame time (ms)**  avg `35.98`, p50 `33.93`, p95 `45.17`, p99 `46.80`, p99.9 `49.20`, max `49.85`

**Client tick (ms)**  avg `0.62`, p95 `0.86`, max `1.46`

**Memory**  start `484 MB`, end `571 MB`, peak `820 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 31.2 | █                         █        █             █                     █       
 30.8 |██          █          █   █ █      █ █        █  █                █    █  █    
 30.3 |██ █        ██         █  ██ ██     █ █        █  ██ █     █       █   ██  ██   
 29.9 |██ █        ██         █  ██ ██     █ █        █  ██ █     █       █   ██  ██   
 29.4 |██ █        ███        █  ██ ██     █ █    █   █  ██ █     █       █   ██  ██   
 29.0 |██ █        ███        █  ██ ██     █ █    █   ██ ██ █     █       █   ██  ██   
 28.5 |██ █     ██ ███  █  █  █  ██ ██     █ ██ █ █   ██ ██ █     ██      █  ███  ██   
 28.0 |██ ██ █  ██ ████ ██ █ ███████████ ███ ██ █████ ██ █████  █ ██ ██ █ ██ ███  ███  
 27.6 |█████ ██ ██ █████████████████████ ████████████ █████████ █ ██ ██ █ ██ ███ █████ 
 27.1 |███████████ ██████████████████████████████████ ███████████ ██ ██ █ ██████ ██████
 26.7 |██████████████████████████████████████████████████████████ █████████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  6
  21 ms | ██  9
  22 ms | █  5
  23 ms |   1
  24 ms |   1
  31 ms | █  3
  32 ms | ██████████████████████████████  112
  33 ms | ████████████████████████████████████████  150
  34 ms | ███████████████████  71
  35 ms | ██  6
  36 ms | █  5
  37 ms | █  4
  38 ms | ███  12
  39 ms | ███  13
  40 ms | ███████  26
  41 ms | ██████  22
  42 ms | ███████  27
  43 ms | ███████  28
  44 ms | ██████  21
  45 ms | █████  17
  46 ms | ███  11
  47 ms | █  2
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `34.00`
- `fps_harmonic_avg` = `27.79`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `20.06`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.91`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `28.43`, min `20.52`, p50 `29.60`, p95 `30.63`, p99 `47.49`, 1%low `20.78`, 0.1%low `20.52`, std `4.56`

**Frame time (ms)**  avg `35.98`, p50 `33.79`, p95 `45.30`, p99 `47.33`, p99.9 `48.55`, max `48.74`

**Client tick (ms)**  avg `0.45`, p95 `0.56`, max `0.80`

**Memory**  start `529 MB`, end `484 MB`, peak `813 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                                                                             █  
 32.7 |                                                                             █  
 32.0 |                                                     █                       █  
 31.4 |                                                     █      █                █  
 30.8 |           █              █              █           █      █                █  
 30.1 | █         █     █      ███              █ █ █       █ █  █ █                █ █
 29.5 |██         █     █      ███              █ █ █ █     █ █  █ █    █          ██ █
 28.8 |██  █      █   █ █   ██ ████   ██       ██ █ █ █     █ █  █ ██   █ █      █ ██ █
 28.2 |██  █ █ █████ ██████████████ █████   █  ██ ██████ ██ █ █ ██ ██   ███    █ █ ████
 27.6 |██ █████████████████████████ ███████ ██ ██ ██████ ██ ███████████████ ██ █ ██████
 26.9 |███████████████████████████████████████ █████████████████████████████████ ██████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | █  5
  21 ms | ██  10
  22 ms | █  3
  23 ms |   1
  32 ms | ██████████████████████  106
  33 ms | ████████████████████████████████████████  196
  34 ms | ███████  36
  35 ms | ███  15
  36 ms | █  7
  37 ms | █  6
  38 ms | █  5
  39 ms | ███  17
  40 ms | ███  16
  41 ms | ███████  35
  42 ms | ██████  30
  43 ms | █████  24
  44 ms | ██  11
  45 ms | ███  15
  46 ms | ██  10
  47 ms | █  4
  48 ms | █  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `34.00`
- `fps_harmonic_avg` = `27.80`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `20.52`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.78`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `28.32`, min `20.61`, p50 `29.46`, p95 `30.98`, p99 `48.13`, 1%low `20.84`, 0.1%low `20.61`, std `4.55`

**Frame time (ms)**  avg `36.11`, p50 `33.95`, p95 `45.25`, p99 `47.10`, p99.9 `48.49`, max `48.53`

**Client tick (ms)**  avg `0.65`, p95 `0.91`, max `1.41`

**Memory**  start `561 MB`, end `654 MB`, peak `845 MB`, GC `3 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 34.4 |                                                                     █          
 33.6 |                                                █                    █          
 32.9 |                                                █                    █          
 32.2 |                      █                         █                    █          
 31.5 |                      █                         █                    █          
 30.7 |                      █  █                   █  █         █          █     █    
 30.0 |   █                  █  █  █    █           █  █         █   █      █     ██   
 29.3 |   █         █     █  █  █  █  █ █           ██ █         █   █  █   █ █   ███ █
 28.5 |   █   █ ██  █  █  ██ ██ █  ██ █ █ █         ██ ██        █   █  ██  ███   ███ █
 27.8 | █████ █ ██ ██ ██ █████████ ██ █████ ███████ ██ ██  █ █  ███████████ ███ █ ███ █
 27.1 |████████ ██ ███████████████████████████████████ ████████████████████ ███ ███████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  6
  21 ms | ██  6
  22 ms | █  3
  23 ms |   1
  31 ms | █  2
  32 ms | █████████████████████████████  111
  33 ms | ████████████████████████████████████████  155
  34 ms | █████████████████  66
  35 ms | █  5
  36 ms | ██  9
  37 ms | ███  10
  38 ms | ███  12
  39 ms | █████  20
  40 ms | █████  18
  41 ms | ██████  24
  42 ms | ████████  30
  43 ms | ███████  27
  44 ms | ████  17
  45 ms | ███  12
  46 ms | ███  10
  47 ms | ██  6
  48 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `32.00`
- `fps_harmonic_avg` = `27.69`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `20.61`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.84`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `28.41`, min `16.93`, p50 `29.22`, p95 `31.39`, p99 `47.07`, 1%low `20.02`, 0.1%low `16.93`, std `5.03`

**Frame time (ms)**  avg `36.13`, p50 `34.22`, p95 `45.28`, p99 `47.03`, p99.9 `54.07`, max `59.08`

**Client tick (ms)**  avg `1.07`, p95 `1.31`, max `7.93`

**Memory**  start `753 MB`, end `427 MB`, peak `868 MB`, GC `5 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |        █                                                                       
 33.3 |        █                                                            █          
 32.6 |        █                                                            █          
 31.9 |        █                                                            █          
 31.2 |        █   █    █  █        █             █                         █         █
 30.5 |   █    █   █    ██ █        █ █   █       █         █             █ █         █
 29.8 |█  █    █   █    ██ █        █ █   █       █         █             █ █         █
 29.1 |█  ██   █   █    ██ █        ███   ██      █         █  █        ███ █ █       █
 28.4 |█ ████  █  ██ █ ███ ██       ███  ███ █  █ ██  █  █  █ ██   █  █████ ███ █  █  █
 27.7 |███████ ██ ██ █ ███ ██ ████ █████ ███ ████ █████ ██ ██ ██ █ ████████ ██████ ██ █
 27.0 |██████████ ██ █████ █████████████ █████████████████████████ ██████████████████ █
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms |   1
  20 ms | ██  5
  21 ms | ██  7
  22 ms | ██  5
  23 ms | █  3
  24 ms |   1
  31 ms | ████  11
  32 ms | ██████████████████████████████████████  112
  33 ms | ████████████████████████████████████████  117
  34 ms | ████████████████████████████  83
  35 ms | ███  9
  36 ms | ███  8
  37 ms | ██  6
  38 ms | ████  13
  39 ms | █████  16
  40 ms | ███████  21
  41 ms | ████████  24
  42 ms | █████████  26
  43 ms | █████████  26
  44 ms | █████████  25
  45 ms | █████  15
  46 ms | ████  12
  47 ms | █  4
  49 ms |   1
  50 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `45.00`
- `fps_harmonic_avg` = `27.68`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `16.93`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.02`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `28.75`, min `17.04`, p50 `27.89`, p95 `41.45`, p99 `55.40`, 1%low `17.54`, 0.1%low `17.04`, std `6.48`

**Frame time (ms)**  avg `36.24`, p50 `35.86`, p95 `47.36`, p99 `54.72`, p99.9 `58.44`, max `58.68`

**Client tick (ms)**  avg `2.89`, p95 `3.59`, max `4.69`

**Memory**  start `461 MB`, end `602 MB`, peak `884 MB`, GC `5 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |             █                   █                                █             
 32.2 |             █                   █                                █             
 31.6 |         █   █  █                █                                █             
 31.0 |  █      █   █  █    █           █                      █      █  █             
 30.4 |  █      █   █  █    █           ██                    ██      █  █             
 29.8 |█ █      █   █  █    █     █ █   ██           █        ██  ██  █  ██    █ ██ █  
 29.2 |█ █ █    █   █  █    ██  █ █ █   ██    █      █     █  ██  ███ █  ██    ████ █  
 28.6 |█ █ ██ █ ██  █  █    ██  █ ███   ██    █      █ █   █  ███ ███ █  ██  █ ████ █  
 28.0 |███ ██ █ ██  █  █  █ ███ █████ █ ██ ██ ██ █ ██████████████ ███ ██ ██  █ ██████  
 27.4 |███ ██ ████████ ████ ███████████ █████ ██ ████████████████████ ██ █████ ██████ █
 26.8 |███ ████████████████ ███████████ ███████████████████████████████████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  3
  17 ms | █  2
  18 ms | █  3
  19 ms |   1
  20 ms | ██  5
  21 ms | ███  7
  22 ms | ██  4
  23 ms | █  3
  24 ms | ██  4
  25 ms | █  2
  29 ms | █████  11
  30 ms | ██████████████████████████████████  81
  31 ms | ███  7
  32 ms | ███████████  26
  33 ms | ████████████████████████████████████████  95
  34 ms | ██████  14
  35 ms | ████████  18
  36 ms | ███████████████████████████  64
  37 ms | █████  13
  38 ms | ██████  14
  39 ms | █████  11
  40 ms | ███████  16
  41 ms | ███████████  25
  42 ms | ██████████  23
  43 ms | ███████████  25
  44 ms | ██████  15
  45 ms | ████████  20
  46 ms | ████  10
  47 ms | ███  8
  48 ms | ███  7
  49 ms | █  3
  50 ms |   1
  53 ms | █  3
  54 ms | █  3
  55 ms |   1
  56 ms |   1
  58 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `38.00`
- `fps_harmonic_avg` = `27.59`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `17.04`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `17.54`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `30.34`, min `15.88`, p50 `28.66`, p95 `50.55`, p99 `58.83`, 1%low `16.27`, 0.1%low `15.88`, std `10.06`

**Frame time (ms)**  avg `36.32`, p50 `34.90`, p95 `56.37`, p99 `59.89`, p99.9 `62.76`, max `62.96`

**Client tick (ms)**  avg `3.61`, p95 `4.94`, max `6.52`

**Memory**  start `648 MB`, end `838 MB`, peak `911 MB`, GC `10 events / 20 ms`

**FPS over sampling window (ASCII):**

```
 37.1 |                                                                      █         
 36.0 |                                                                      █         
 35.0 |                                         █                      █     █        █
 33.9 |             █                        █  █                      █  █  █        █
 32.9 |         █   █     █    █  █          █  █              █       █  █  █ █      █
 31.8 |         █   █     █    █  █     █    █  ██       ███   █  █  █ █  █  █ █      █
 30.8 |  █ ██ █ ███ █  ██ █    █  █ ██  ██   █  ██       ███   █  █  █ ██ █  █ █ ██   █
 29.8 | ██ ██ █ ███ █████ ██ █ ██ █████ ██ █ ██ ██ ████ ████████  █  ████ ██ █ ██████ █
 28.7 |██████ █████ █████ ██ █ ██ ████████████████ ██████████████████████ ██ ██████████
 27.7 |██████████████████ ████ ██ ████████████████ ████████████████████████████████████
 26.6 |██████████████████ ████ ██ █████████████████████████████████████████████████████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | ███  3
  16 ms | ███  3
  17 ms | ██████  7
  18 ms | ████████  10
  19 ms | ███████  8
  20 ms | █████████  11
  21 ms | ██████████████████  21
  22 ms | ████████████████  19
  23 ms | ████████  10
  24 ms | ███  4
  25 ms | ██████  7
  26 ms | █  1
  27 ms | █████  6
  28 ms | ███████████  13
  29 ms | █████████████████████  25
  30 ms | ████████████████████████  29
  31 ms | ██████████  12
  32 ms | ██████████████████  21
  33 ms | ████████████████████████████████████████  48
  34 ms | ██████████████████  21
  35 ms | █████████████  15
  36 ms | ████████████████████  24
  37 ms | █████████████████████████  30
  38 ms | █████████████  16
  39 ms | ████████  10
  40 ms | ██████████  12
  41 ms | █████████  11
  42 ms | ███████████  13
  43 ms | ███████  8
  44 ms | ████████  9
  45 ms | ██████████  12
  46 ms | ██████  7
  47 ms | █████████████  15
  48 ms | ███████  8
  49 ms | ████  5
  50 ms | ███████  8
  51 ms | █████  6
  52 ms | ██  2
  53 ms | █████████████  15
  54 ms | ███  3
  55 ms | ██████████  12
  56 ms | █████████  11
  57 ms | ██████  7
  58 ms | ████  5
  59 ms | ██  2
  60 ms | ██  2
  61 ms | ██  2
  62 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `items_alive_p50` = `1240.00`
- `entity_count_sample_end` = `1561.00`
- `entity_count_sample_start` = `681.00`
- `items_alive_max` = `1560.00`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `16.27`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `27.53`
- `preload_duration_ms` = `75.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `15.88`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`
- `items_alive_p95` = `1560.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `28.38`, min `20.70`, p50 `29.41`, p95 `31.39`, p99 `46.38`, 1%low `20.99`, 0.1%low `20.70`, std `4.54`

**Frame time (ms)**  avg `36.04`, p50 `34.00`, p95 `45.34`, p99 `47.01`, p99.9 `48.23`, max `48.31`

**Client tick (ms)**  avg `0.94`, p95 `1.14`, max `2.18`

**Memory**  start `696 MB`, end `648 MB`, peak `869 MB`, GC `5 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |               █                                                                
 32.8 |               █                                                                
 32.1 |               █                                                     █          
 31.5 |█              █                                    █                █          
 30.8 |██       █     █                  █                 █                █     █    
 30.1 |██       █     █                  ██            █   █                █     █  █ 
 29.5 |██       █     █   █              ██    █       █   █  █  █          █     █  ██
 28.8 |██  █    ██ █  █   █    █   █     ████ ██     █ █   █  █  ██         █  █  ██ ██
 28.2 |██  ████ ██ ██ ██ ██ ██ ██ ██ █ █████████  ██ █ ██ ██ ██ ███  █ █ ██ ██ █  ██ ██
 27.5 |███████████ ██ ██ ██ █████████████████████ ██ █ ██ ██ ██ ███ ██ ███████ ██ ██ ██
 26.9 |███████████ █████ ██ █████████████████████ ███████ █████ ███████████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | █  4
  21 ms | ███  9
  22 ms | █  4
  23 ms |   1
  25 ms |   1
  30 ms |   1
  31 ms | ██████  20
  32 ms | ██████████████████████████████  101
  33 ms | ████████████████████████████████████████  134
  34 ms | ██████████████████████  74
  35 ms | ███  11
  36 ms | ███  10
  37 ms | ███  9
  38 ms | ████  12
  39 ms | ████  14
  40 ms | █████  18
  41 ms | ████████  26
  42 ms | █████████  29
  43 ms | ██████  20
  44 ms | ███████  23
  45 ms | ██████  19
  46 ms | ███  9
  47 ms | █  4
  48 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.70`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `27.75`
- `fps_1pct_low` = `20.99`
- `preload_duration_ms` = `72.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `28.20`, min `20.95`, p50 `29.57`, p95 `30.68`, p99 `46.96`, 1%low `21.18`, 0.1%low `20.95`, std `4.25`

**Frame time (ms)**  avg `36.19`, p50 `33.82`, p95 `44.90`, p99 `46.70`, p99.9 `47.62`, max `47.72`

**Client tick (ms)**  avg `0.48`, p95 `0.61`, max `0.77`

**Memory**  start `696 MB`, end `654 MB`, peak `881 MB`, GC `4 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 32.4 |                                                        █                       
 31.9 |                                                        █                       
 31.3 |                        █                               █                  █    
 30.8 |        █               █                               █                  █    
 30.2 |       ██       █       █               █    █   █  █   █                  █    
 29.7 |       ██       █       █      █        █    █   █  █   █        █         █    
 29.1 | █     ██       █       █      █        █    █   █  █   █        █         █    
 28.6 | █    ███      ██       █      █   █    ██  ██   █ ██   ██ █     █  █      █    
 28.0 | ██  ████  █ █ ███ █ █  ██ █ █ ██  █  █████ ██ █ ████ █ █████  █ ██ ███ █ ██    
 27.5 | ██ ████████ █ ███ █ ██ ██ █ █████ █ █████████ ████████ ███████████████ █ ██ ██ 
 26.9 |████████████ █ ███████████████████ █████████████████████████████████████████ ███
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | █  4
  21 ms | █  8
  22 ms |   1
  23 ms |   1
  31 ms |   1
  32 ms | ████████████  70
  33 ms | ████████████████████████████████████████  228
  34 ms | ███████  40
  35 ms | █  5
  36 ms | █  3
  37 ms | █  4
  38 ms | ██  14
  39 ms | ██  14
  40 ms | ██████  33
  41 ms | █████  27
  42 ms | █████  31
  43 ms | ████  23
  44 ms | ███  18
  45 ms | ███  16
  46 ms | █  7
  47 ms | █  5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `21.18`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `27.63`
- `preload_duration_ms` = `49.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.95`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`
- `doors_placed` = `16.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `30.42`, min `15.90`, p50 `28.00`, p95 `51.81`, p99 `56.63`, 1%low `16.45`, 0.1%low `15.90`, std `9.86`

**Frame time (ms)**  avg `36.01`, p50 `35.71`, p95 `55.37`, p99 `59.26`, p99.9 `62.41`, max `62.88`

**Client tick (ms)**  avg `3.43`, p95 `5.25`, max `11.09`

**Memory**  start `573 MB`, end `611 MB`, peak `951 MB`, GC `5 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 34.9 |                 █    █                                                         
 34.1 |█             █  █    █                                                         
 33.4 |█      █    █ █  █    █  █  █           █                     █          █ █    
 32.6 |█ █    █    ███  █    █  ██ █  █        █     ██              █          █ █    
 31.8 |█ █    █ █  ███  █    █  ██ █  █        █     ███        █  █ █  █    ██ █ █    
 31.1 |█ █   ██ █ ████  █  █ █  ██ █  ██  ██   █     ███     █  █ ██ █  ██   ██ █ █ █  
 30.3 |█ ██ ███ █ ████  █  ███  ██ █ ████ ██   ██ █  ███  █  █ ██ ██ ██ ██   ██ █ █ ██ 
 29.6 |████████ ██████  █ █████ ██ █ ████ ██   ████  █████████ ██ ██ █████   ██ █ █ ███
 28.8 |████████████████ ███████ ██ █ ███████ █ ████ █████████████ █████████  ████ █ ███
 28.0 |████████████████████████ ██ █████████ █ ██████████████████ █████████████████ ███
 27.3 |████████████████████████ ██ █████████ █ ████████████████████████████████████ ███
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | ██  3
  17 ms | ███  5
  18 ms | █████████  13
  19 ms | ███████████  17
  20 ms | █████████  14
  21 ms | ██████████████  21
  22 ms | █████████  13
  23 ms | ███  5
  24 ms | ████  6
  25 ms | ██  3
  26 ms | ███  5
  27 ms | █  2
  28 ms | █████  7
  29 ms | ██████████  15
  30 ms | ████████████████████████  36
  31 ms | ██████████  15
  32 ms | █████████████  19
  33 ms | ████████████████████████████████████████  60
  34 ms | ████████  12
  35 ms | █████████████  19
  36 ms | ████████████████████████████████  48
  37 ms | █████████  14
  38 ms | █████████████  19
  39 ms | █████  8
  40 ms | █████████  13
  41 ms | ███████  10
  42 ms | ██████████  15
  43 ms | ███████████████  22
  44 ms | ███████████  16
  45 ms | ███████  11
  46 ms | █████  7
  47 ms | ███████  11
  48 ms | █████  7
  49 ms | █  1
  50 ms | █  2
  51 ms | ████  6
  52 ms | ███████  11
  53 ms | ████████  12
  54 ms | ███  4
  55 ms | ███  4
  56 ms | ██████  9
  57 ms | █████  7
  58 ms | █  2
  59 ms | ███  4
  61 ms | █  1
  62 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `16.45`
- `fps_harmonic_avg` = `27.77`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `95.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `15.90`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `145.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.17`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `29.14`, min `16.53`, p50 `28.61`, p95 `46.75`, p99 `53.46`, 1%low `17.00`, 0.1%low `16.53`, std `7.25`

**Frame time (ms)**  avg `36.13`, p50 `34.96`, p95 `49.05`, p99 `57.62`, p99.9 `59.72`, max `60.51`

**Client tick (ms)**  avg `2.45`, p95 `4.12`, max `5.24`

**Memory**  start `491 MB`, end `667 MB`, peak `1028 MB`, GC `4 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 35.1 |  █                                                                             
 34.3 |  █       █                                                                     
 33.5 |  █       █     █                                                               
 32.7 |  █       █     █                                        █      █               
 31.9 |  █  █    ██ █  █   █                                    █      █          █    
 31.1 |  █  █    ██ ██ ██  ██      █ █                          █  █   ██ █       █   █
 30.3 |  ██ ██ █ ██ ██ ███ ██  █   █ █            █    █ █    █ █  ██  ██ █   █   ██ ██
 29.5 |  ██ ██ █ ██ ██ ███ ██  ██  █ █            █    █ █   ██ █  ███ ██ █   █   ██ ██
 28.7 | ████████ ██ ██ ██████  ██  ███ █   █   █ ███   █ ██  ████  ██████ █   █   ██ ██
 27.9 | ████████ ██ █████████████ ████ ██ ██ ███████ █ ██████████ ███████ ██ ████ ██ ██
 27.1 |█████████ ████████████████████████████████████████████████████████ ██ ██████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  17 ms | █  3
  18 ms | █  3
  19 ms | ████  8
  20 ms | █████  10
  21 ms | ████  8
  22 ms | ████  8
  23 ms | ██  4
  24 ms | ██  4
  25 ms | █  2
  28 ms |   1
  29 ms | ██████  12
  30 ms | ███████████  23
  31 ms | ████████████████████████████  61
  32 ms | ████████████  26
  33 ms | ████████████████████████████████████████  87
  34 ms | ████████  17
  35 ms | ███████████████████████  49
  36 ms | ███████████  25
  37 ms | ██████  14
  38 ms | ████  9
  39 ms | █████  10
  40 ms | ██████████  22
  41 ms | ██████████  22
  42 ms | █████████  20
  43 ms | ████████  17
  44 ms | ███████  15
  45 ms | ███████████  25
  46 ms | █████  10
  47 ms | ███  6
  48 ms | █  2
  49 ms | ██  4
  51 ms | █  3
  52 ms |   1
  53 ms | █  3
  54 ms | █  3
  55 ms | █  2
  56 ms | ███  6
  57 ms | █  2
  58 ms | █  3
  59 ms |   1
  60 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `17.00`
- `fps_harmonic_avg` = `27.68`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `33.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `16.53`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.76`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 8609 ms  |  Sample ticks: 0

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

- `aborted_state` = `SAMPLING`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed Shift+ESC`
- `status` = `failed`
- `part` = `1.00`

