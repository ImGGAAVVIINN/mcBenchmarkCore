# MC Benchmark Core session — 2026-09-13T19:37:26.697489259+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 101.9 | 46.2 | 44.7 | 21.17 | 0.61 | 1 | 344 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 96.7 | 44.0 | 32.5 | 21.09 | 0.62 | 3 | 424 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 29.7 | 20.6 | 20.1 | 47.84 | 0.62 | 1 | 84 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 29.3 | 20.2 | 17.8 | 47.42 | 0.67 | 2 | 218 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 29.6 | 20.5 | 20.1 | 48.16 | 0.63 | 3 | 340 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Pigs ×250 ring](#pigs-250-ring)
- [Villagers ×100 ring](#villagers-100-ring)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `101.90`, min `44.57`, p50 `106.39`, p95 `133.02`, p99 `592.44`, 1%low `46.17`, 0.1%low `44.70`, std `107.23`

**Frame time (ms)**  avg `12.22`, p50 `9.40`, p95 `19.42`, p99 `21.17`, p99.9 `22.25`, max `22.44`

**Client tick (ms)**  avg `0.61`, p95 `0.94`, max `1.33`

**Memory**  start `481 MB`, end `474 MB`, peak `825 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
168.9 |          █                                                             █       
161.1 |          █                                             █    █          █       
153.3 |          █                                        █    █    █          █       
145.4 |          █    █                               █   █    █  █ █          █       
137.6 |          █    █                               █   █    █ ██ █          █       
129.8 |   █      █    █    █                          █   █    █ ██ █    █  █  █       
122.0 |   █      █    █    █             █            █   █    █ ██ █ █  █  █  █       
114.2 |   █      █    █    █     █       █            █   █    █ ██ █ █  █  █  █       
106.3 | █ █  █   █    █    █     █       █            █   █    █ ██ █ █  █  █  █       
 98.5 | █ █ ██ █ ██ █ █   ██     █   █  ██ █  █  █    █   █    █ ██ █ █  █  █ ██ █    █
 90.7 |█████████ ████████████ █  ███ ███████████████████████ ████████ ████████████ ████
 82.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  8
   1 ms | █  10
   2 ms |   2
   4 ms |   1
   6 ms |   6
   7 ms | ███████████  158
   8 ms | ████████████████████████████████████████  553
   9 ms | ████████  108
  10 ms | █  7
  11 ms |   2
  12 ms |   1
  13 ms | █  13
  14 ms | ████████  104
  15 ms | █████████████████  235
  16 ms | ██████████████  198
  17 ms | ██████  86
  18 ms | ███  48
  19 ms | ███  39
  20 ms | ███  39
  21 ms | █  15
  22 ms |   4
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `portal` | 160 | 204 | 99.1 | 20.33 |
| `ALL_TOGETHER` | 1680 | 204 | 105.3 | 20.76 |
| `sculk_charge_pop` | 240 | 204 | 93.9 | 20.89 |
| `smoke` | 160 | 204 | 95.3 | 20.46 |
| `flame` | 160 | 204 | 97.0 | 20.83 |
| `dripping_water` | 240 | 204 | 114.9 | 21.42 |
| `dragon_breath` | 160 | 204 | 108.7 | 20.71 |
| `end_rod` | 240 | 204 | 99.2 | 20.43 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `46.17`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `18.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `81.86`
- `fps_0p1pct_low` = `44.70`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `96.72`, min `25.44`, p50 `95.90`, p95 `131.09`, p99 `143.37`, 1%low `44.03`, 0.1%low `32.47`, std `80.69`

**Frame time (ms)**  avg `12.49`, p50 `10.43`, p95 `19.62`, p99 `21.09`, p99.9 `22.24`, max `39.31`

**Client tick (ms)**  avg `0.62`, p95 `0.94`, max `1.22`

**Memory**  start `442 MB`, end `814 MB`, peak `866 MB`, GC `3 events / 11 ms`

**FPS over sampling window (ASCII):**

```
151.5 |                                                                              █ 
145.1 |                                        █                                     █ 
138.7 |                                        █                                     █ 
132.3 |                            █      █    █           █                        ██ 
125.9 |          █                 █      █    █  █        █                        ██ 
119.4 |██        █                 █    █ █    █  █        █                        ██ 
113.0 |██        █                 █    █ █    █  █        █           █            ██ 
106.6 |██    █   █                 █    █ █    ██ █        █           █            ██ 
100.2 |██    █   ██          █     █    █ █    ██ █        █          ██            ██ 
 93.8 |███  ██   ██      ██ ██ ██ ██ █ ██████  ██ ██ █ █ ████ ██ █ █ ████ █   ███  ████
 87.4 |███ ████  ███████████████████ ████████████████████████████████████ █████████████
 81.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms | █  10
   2 ms |   1
   4 ms |   1
   6 ms |   1
   7 ms | ████████████  152
   8 ms | ████████████████████████████████████████  487
   9 ms | ███████████  133
  10 ms | ██  25
  11 ms |   4
  12 ms |   1
  13 ms |   5
  14 ms | ███████  87
  15 ms | █████████████████  213
  16 ms | ████████████████  198
  17 ms | ██████████  120
  18 ms | ████  54
  19 ms | ████  43
  20 ms | ████  45
  21 ms | █  14
  22 ms |   2
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `44.03`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `32.47`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `80.06`
- `preload_duration_ms` = `69.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `29.68`, min `20.06`, p50 `29.38`, p95 `45.99`, p99 `47.91`, 1%low `20.56`, 0.1%low `20.06`, std `6.55`

**Frame time (ms)**  avg `35.11`, p50 `34.04`, p95 `46.48`, p99 `47.84`, p99.9 `49.68`, max `49.84`

**Client tick (ms)**  avg `0.62`, p95 `0.89`, max `1.36`

**Memory**  start `791 MB`, end `809 MB`, peak `875 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                       █                                             █          
 33.0 | █                     █                               █             █          
 32.3 | █                     █               █             █ █             █          
 31.6 | █              █      █               █             █ █             █     █    
 30.9 | █ ██    █      █    █ █    █  █       █ ██  █       █ ██          █ █     ██ █ 
 30.2 |██ ███   █ █    █ █  █ █  ██████       █ █████ █  █  █ ███         █ █    ███ █ 
 29.4 |██ ███   ████   █ ██ ████ ███████      █ █████ █ █████████ ███     ████   ██████
 28.7 |██ █████ ██████ █████████████████ █ █  ███████ █ █████████████ █  ███████ ██████
 28.0 |██ █████████████████████████████████████████████ █████████████ ██████████ ██████
 27.3 |██ █████████████████████████████████████████████████████████████████████████████
 26.6 |██ █████████████████████████████████████████████████████████████████████████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  2
  20 ms | ██  5
  21 ms | █████████  27
  22 ms | █████  15
  23 ms | █████  17
  29 ms |   1
  30 ms |   1
  31 ms | ███  11
  32 ms | ███████████████████████  74
  33 ms | ████████████████████████████████████████  126
  34 ms | █████████████████████████  78
  35 ms | ██████████  33
  36 ms | ██████  19
  37 ms | █████  17
  38 ms | ██████  18
  39 ms | ██  6
  40 ms | ██  6
  41 ms | ███  8
  42 ms | ██  7
  43 ms | █  4
  44 ms | ███████  21
  45 ms | ██████████  33
  46 ms | ███████  22
  47 ms | ████  13
  48 ms | █  3
  49 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.56`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.06`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.49`
- `preload_duration_ms` = `48.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `29.27`, min `17.84`, p50 `29.36`, p95 `44.99`, p99 `47.49`, 1%low `20.23`, 0.1%low `17.84`, std `5.85`

**Frame time (ms)**  avg `35.34`, p50 `34.06`, p95 `46.31`, p99 `47.42`, p99.9 `52.12`, max `56.05`

**Client tick (ms)**  avg `0.67`, p95 `0.84`, max `1.11`

**Memory**  start `672 MB`, end `716 MB`, peak `891 MB`, GC `2 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 34.3 |                              █                                                 
 33.5 |                              █                                                 
 32.7 |                         █    █                 ██ █                            
 32.0 |                   █     █    █                 ██ █                  █         
 31.2 |             █     █     █    █         █       ██ █                  █         
 30.5 |           █ █   █ ██ ██ █    █         █       ██ █  █      █        █       █ 
 29.7 |    ██ █ ███ ███ █ █████████  █ █       █   █   ██ █  ███  ███        █    █████
 28.9 |█  █████████ ███ ████████████ █ █  █  █ ██  ███ ██ ██ ███ ████   ███  █  █ █████
 28.2 |█  █████████ ██████████████████ █ ███ █████ ███ █████████ █████ █████ █ ████████
 27.4 |████████████ ██████████████████████████████████████████████████ ████████████████
 26.6 |████████████ ███████████████████████████████████████████████████████████████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  4
  21 ms | █████  17
  22 ms | ████  13
  23 ms | ███  10
  24 ms | ██  5
  29 ms |   1
  30 ms | █  4
  31 ms | ███  10
  32 ms | ████████████████████████  77
  33 ms | ████████████████████████████████████████  131
  34 ms | █████████████████████████  82
  35 ms | █████████████  41
  36 ms | ███████  22
  37 ms | ████  12
  38 ms | ███  9
  39 ms | ████  12
  40 ms | ██  7
  41 ms | █  4
  42 ms | ██  7
  43 ms | ███  10
  44 ms | ████████  26
  45 ms | ████████  26
  46 ms | ███████  24
  47 ms | ██  7
  48 ms | █  2
  49 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.23`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `152.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.84`
- `entity_count_sample_end` = `152.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.29`
- `preload_duration_ms` = `83.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `29.58`, min `20.09`, p50 `29.28`, p95 `45.72`, p99 `47.72`, 1%low `20.51`, 0.1%low `20.09`, std `6.47`

**Frame time (ms)**  avg `35.19`, p50 `34.16`, p95 `46.82`, p99 `48.16`, p99.9 `49.17`, max `49.77`

**Client tick (ms)**  avg `0.63`, p95 `0.93`, max `1.67`

**Memory**  start `547 MB`, end `662 MB`, peak `887 MB`, GC `3 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                          █                                                     
 33.9 |                          █                                                     
 33.2 |                          █            █                                        
 32.5 |                          █  █         █                                        
 31.7 |           █          █   █  ███    █  █                      █                 
 31.0 |          ██       █  █   ██ ███  █ █  █           █ █ ██  █  █ █       █       
 30.2 |█ █  ███  ██       █  █   ██ ████ █ █  ███         █ █████ █  █ █       █ █     
 29.5 |█ █  ████ ██       █  █  ███ ██████ ██ ███      ██ █ █████ ████ ██      ██████  
 28.8 |█ ███████████ █  ██████ ██████████████ █████   ███ █ ██████████ ███   █ ██████  
 28.0 |████████████████ ████████████████████████████ █████████████████ ███████ ███████ 
 27.3 |█████████████████████████████████████████████ █████████████████ ███████████████ 
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  3
  20 ms | ██  6
  21 ms | █████████  25
  22 ms | ██████  16
  23 ms | █████  13
  29 ms |   1
  30 ms | █  3
  31 ms | ██  6
  32 ms | ██████████████████████████████  82
  33 ms | ████████████████████████████████████████  110
  34 ms | ████████████████████████████  78
  35 ms | ██████████████████  49
  36 ms | ███████  19
  37 ms | █████  14
  38 ms | █████  13
  39 ms | ████  12
  40 ms | ████  10
  41 ms | ██  6
  42 ms | ██  6
  43 ms | ███  8
  44 ms | ███████  18
  45 ms | ████████  22
  46 ms | ██████████  27
  47 ms | █████  14
  48 ms | ██  6
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.51`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.09`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.42`
- `preload_duration_ms` = `33.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 8483 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed Shift+ESC`
- `part` = `1.00`

