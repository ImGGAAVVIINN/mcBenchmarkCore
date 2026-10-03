# FPS Test session — 2026-09-06T12:18:04.765531296+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 109.7 | 47.3 | 43.3 | 20.06 | 0.57 | 1 | 100 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 111.1 | 48.3 | 45.5 | 20.03 | 0.59 | 2 | 292 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.1 | 21.1 | 20.5 | 46.66 | 0.62 | 1 | 368 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 28.2 | 20.1 | 16.7 | 46.45 | 0.66 | 4 | 265 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.1 | 21.1 | 20.6 | 46.32 | 0.60 | 1 | 356 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 27.9 | 21.5 | 21.3 | 46.05 | 0.46 | 1 | 252 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Pigs ×250 ring](#pigs-250-ring)
- [Villagers ×100 ring](#villagers-100-ring)
- [Chickens ×300 ring](#chickens-300-ring)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `109.69`, min `42.95`, p50 `118.32`, p95 `131.60`, p99 `139.37`, 1%low `47.27`, 0.1%low `43.29`, std `58.72`

**Frame time (ms)**  avg `10.16`, p50 `8.45`, p95 `17.69`, p99 `20.06`, p99.9 `22.57`, max `23.28`

**Client tick (ms)**  avg `0.57`, p95 `0.90`, max `1.33`

**Memory**  start `655 MB`, end `739 MB`, peak `755 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
153.4 |                              █  █                                              
148.9 |                              █  █                                              
144.4 |                  █           █  █      █                                       
139.9 |█                 █           █  █      █                                       
135.4 |█    █            █           █  █      █                                       
130.8 |█    █            █           █  █      █                                       
126.3 |█    █            █           █  █      █                                       
121.8 |█    █            █ █         █  █      █                                       
117.3 |█    █            █ █         █  █      █                                       
112.8 |█    █           ██ █         █  █ █    █               █                 █    █
108.3 |███ ██ █ ██  ██  ████ █  █ ██ █ ██ █  █ ███ ██ ██ █  █  █  █  █  █  █ ██  █ █  █
103.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms |   2
   2 ms |   1
   6 ms |   4
   7 ms | ███████████  281
   8 ms | ████████████████████████████████████████  1053
   9 ms | ███████  186
  10 ms |   1
  12 ms |   1
  13 ms |   13
  14 ms | ███  79
  15 ms | ████  107
  16 ms | ████  98
  17 ms | ██  56
  18 ms | █  38
  19 ms | █  23
  20 ms |   12
  21 ms |   7
  22 ms |   2
  23 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `ALL_TOGETHER` | 1680 | 246 | 113.1 | 20.06 |
| `portal` | 160 | 246 | 110.5 | 20.67 |
| `end_rod` | 240 | 246 | 112.4 | 19.27 |
| `dragon_breath` | 160 | 246 | 115.0 | 20.36 |
| `dripping_water` | 240 | 246 | 106.9 | 19.19 |
| `flame` | 160 | 246 | 106.6 | 20.17 |
| `smoke` | 160 | 246 | 106.5 | 19.07 |
| `sculk_charge_pop` | 240 | 246 | 106.7 | 19.11 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `43.29`
- `fps_harmonic_avg` = `98.43`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `18.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `47.27`
- `particles_stage_sculk_charge_pop` = `240.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `111.12`, min `45.13`, p50 `118.16`, p95 `131.61`, p99 `137.97`, 1%low `48.30`, 0.1%low `45.55`, std `75.21`

**Frame time (ms)**  avg `10.15`, p50 `8.46`, p95 `17.57`, p99 `20.03`, p99.9 `21.73`, max `22.16`

**Client tick (ms)**  avg `0.59`, p95 `0.85`, max `1.62`

**Memory**  start `661 MB`, end `501 MB`, peak `954 MB`, GC `2 events / 7 ms`

**FPS over sampling window (ASCII):**

```
160.5 |                                █                      █                        
155.3 |      █  █                      █                      ██                       
150.1 |      █  █                      █                      ██    █                  
144.9 |      █  █                      █                      ██    █                  
139.6 |      █  █    █                 █                      ██    █                  
134.4 |      █  █    █                 █                      ██    █                  
129.2 |      █  █    █                 █                      ██    █                  
124.0 |  █   █  █    █                 █                      ██    █                  
118.8 |  ██  █  █    █                 █                      ██    █                  
113.6 |  ██  █  █    █                 █                      ██    █                  
108.3 |  █████████  ██ ██ █  █ ██  ███ ██ ██ █  █ ██ ██ ██ ██ ████ █████ ██ █  ██ ██ ██
103.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   7
   2 ms |   2
   6 ms |   3
   7 ms | ███████████  294
   8 ms | ████████████████████████████████████████  1033
   9 ms | ████████  195
  10 ms |   1
  12 ms |   2
  13 ms |   9
  14 ms | ███  66
  15 ms | █████  119
  16 ms | ████  95
  17 ms | ███  65
  18 ms | █  34
  19 ms | █  25
  20 ms | █  16
  21 ms |   4
  22 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `72.00`
- `fps_harmonic_avg` = `98.54`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `45.55`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `48.30`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `28.13`, min `20.47`, p50 `29.49`, p95 `30.89`, p99 `46.94`, 1%low `21.12`, 0.1%low `20.47`, std `4.01`

**Frame time (ms)**  avg `36.22`, p50 `33.91`, p95 `44.21`, p99 `46.66`, p99.9 `48.03`, max `48.85`

**Client tick (ms)**  avg `0.62`, p95 `0.91`, max `1.19`

**Memory**  start `605 MB`, end `548 MB`, peak `973 MB`, GC `1 events / 2 ms`

**FPS over sampling window (ASCII):**

```
 31.8 |                                    █                                           
 31.3 |                █                   █                                           
 30.9 |             █  █   █               █                                           
 30.4 |  █         ██  █   █               █              █      █         █         █ 
 29.9 |  █       █ ██  █   █               █              █      █         █         █ 
 29.5 |  █       █ ██  █   █               █              █      █         █         █ 
 29.0 |  █       █ ██  █   █  █    █       █              ██    ██         █         █ 
 28.5 |  ██      █ ███ ██  █  █    █ █  █  █            █ ██    ██    █ █  █         █ 
 28.0 |  ██   ██ █████ ██ ██ ██ █  █ █████ ██   ██ █ ██ █ ██ ██ ██ ██ ███  ██ ██ █ ████
 27.6 |████ █ ██ █████ ██ ██ ██ ██ █ █████ ██ █ ██ █ ██ █ ██ ██ ██ ██ ███████ ██ █ ████
 27.1 |███████████████████████████ █ █████ █████████████████ ████████ █████████████████
 26.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  3
  21 ms | █  4
  22 ms | █  2
  31 ms |   1
  32 ms | ███████████████████████████████  121
  33 ms | ████████████████████████████████████████  158
  34 ms | ██████████████  55
  35 ms | █  4
  36 ms | ███  10
  37 ms | ██  7
  38 ms | ███  11
  39 ms | █████  18
  40 ms | ███████  27
  41 ms | ███████  29
  42 ms | ████████  33
  43 ms | █████████  36
  44 ms | ████  14
  45 ms | ██  7
  46 ms | ██  9
  47 ms | █  2
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `27.61`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `20.47`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.12`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `28.24`, min `16.70`, p50 `29.48`, p95 `31.09`, p99 `48.04`, 1%low `20.14`, 0.1%low `16.70`, std `4.81`

**Frame time (ms)**  avg `36.27`, p50 `33.92`, p95 `44.84`, p99 `46.45`, p99.9 `53.58`, max `59.88`

**Client tick (ms)**  avg `0.66`, p95 `0.83`, max `1.01`

**Memory**  start `706 MB`, end `526 MB`, peak `971 MB`, GC `4 events / 12 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                 █                                                              
 33.3 |                 █       █                                                      
 32.6 |                 █       █                                                      
 31.9 |                 █       █                                           █        █ 
 31.2 |                 █       █                              █            █        █ 
 30.5 |                 █       ██           █                 █           ██ █      █ 
 29.8 |             █   █       ██           █          █  █   █           ██ █      █ 
 29.1 |             █   █       ██  █   █    █          █  █   █           ██ █      █ 
 28.4 |  █ █  █     █   ██ █  █ ██ ███  ██  ██ █ █      █  ██  ██ █  █   █ ██ █   █  █ 
 27.7 | ██ █  █ █ █████ ██ █ ██ ███████████ ██ █ ██ █ ████████ ██ █ ██ █ ████████ ██ ██
 27.1 |████████ ███████ ██ ███████████████████████████████████ ██ ███████████████ ██ ██
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms |   1
  19 ms | █  2
  20 ms | █  4
  21 ms | █  4
  22 ms | █  5
  31 ms | ██  7
  32 ms | ███████████████████████████████  116
  33 ms | ████████████████████████████████████████  151
  34 ms | █████████████  48
  35 ms | ██  8
  36 ms | █  3
  37 ms | ███  10
  38 ms | ██  8
  39 ms | ████  16
  40 ms | ███████  26
  41 ms | █████████  33
  42 ms | ██████████  37
  43 ms | █████████  33
  44 ms | ████  16
  45 ms | ███  12
  46 ms | ██  7
  47 ms | █  2
  48 ms | █  2
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `48.00`
- `fps_harmonic_avg` = `27.57`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `16.70`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.14`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `28.10`, min `20.56`, p50 `29.48`, p95 `30.86`, p99 `46.99`, 1%low `21.14`, 0.1%low `20.56`, std `4.23`

**Frame time (ms)**  avg `36.32`, p50 `33.92`, p95 `44.40`, p99 `46.32`, p99.9 `48.18`, max `48.64`

**Client tick (ms)**  avg `0.60`, p95 `0.90`, max `1.15`

**Memory**  start `605 MB`, end `626 MB`, peak `961 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 31.6 |                                  █                             █               
 31.1 |                                  █               █             █       █       
 30.6 |          █                  █    █               █            ██       █       
 30.2 |    █     █            █     █    █               █            ██       █       
 29.7 |    █   █ █            █     █    █               █            ██       █       
 29.2 |    █   █ █            █     █    █               █          █ ██       █       
 28.7 |    ██  █ █     █      █   █ █    █   █    █      █          █ ██       █       
 28.3 | █  ██ ██ ██ █ ██ █ ██ ██ ██ ██   █   █   ██      ██ ██   ██ █ ██    █  █       
 27.8 | ██ ██ ██ ██ █ ██ █ ██ ██ ██ ██ █ ██ ██ █ █████ █ ██ ██ █ ██ █ ███ █ ██ ██ ████ 
 27.3 | ████████ █████████ █████ █████ █ ██ ██ ███████ ████ ██ ████ ███████ ██ ███████ 
 26.8 | ███████████████████████████████████████████████████████████ ███████ ███████████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms |   1
  21 ms | ██  8
  22 ms | █  2
  26 ms |   1
  31 ms | █  3
  32 ms | ██████████████████████████████  114
  33 ms | ████████████████████████████████████████  154
  34 ms | ██████████████  54
  35 ms | ██  7
  36 ms | █  3
  37 ms | █  5
  38 ms | ████  14
  39 ms | ███  12
  40 ms | ████████  30
  41 ms | █████████  33
  42 ms | ██████████  39
  43 ms | ██████████  37
  44 ms | ███  13
  45 ms | ███  12
  46 ms | █  5
  47 ms | █  2
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `46.00`
- `fps_harmonic_avg` = `27.54`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `20.56`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.14`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `27.93`, min `21.27`, p50 `29.57`, p95 `30.66`, p99 `44.59`, 1%low `21.46`, 0.1%low `21.27`, std `3.76`

**Frame time (ms)**  avg `36.42`, p50 `33.82`, p95 `44.45`, p99 `46.05`, p99.9 `46.90`, max `47.01`

**Client tick (ms)**  avg `0.46`, p95 `0.60`, max `0.69`

**Memory**  start `709 MB`, end `521 MB`, peak `961 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 31.3 |                               █                                                
 30.8 |         █              █      █                                                
 30.4 |     █   █              █      █                     ██                         
 30.0 |     █   █              █      █                     ██    █                    
 29.5 |     █   █              █      █                     ██    █                    
 29.1 |     █   █              █      █                     ██    ██                   
 28.6 |█  █ █   █        █     █      █        █            ██    ██        ██         
 28.2 |█ ██ ██  █ █ █  █ █  █ ██ █    ██ ████  ██   ██ █  █ ██ ██ ██ █  █ █ ██  █ █  █ 
 27.7 |█ ██ ██ ██ █ ██ █ ██ █ ██ ████ ██ █████ ██ █ █████ █ ██ ██ ██ █ ██ █ ██ ██ █ ██ 
 27.3 |█ █████ ██ █ ██ █ ██ █ ██ ████ ██ █████ ████ █████ █ ██ ██ █████████ ██ ██ █ ██ 
 26.9 |█ ██████████ █████████ ███████ ██ ████████████████████████████████████████ █████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms |   1
  21 ms | █  3
  22 ms | █  4
  31 ms |   1
  32 ms | ███████████████████  96
  33 ms | ████████████████████████████████████████  207
  34 ms | ████  23
  35 ms | █  3
  36 ms | █  4
  37 ms | ██  9
  38 ms | ██  12
  39 ms | █████  24
  40 ms | █████  27
  41 ms | ██████  32
  42 ms | ███████  35
  43 ms | ███████  34
  44 ms | ███  17
  45 ms | ██  11
  46 ms | █  5
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `21.00`
- `fps_harmonic_avg` = `27.46`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `21.27`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.46`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 160 ms  |  Sample ticks: 0

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

