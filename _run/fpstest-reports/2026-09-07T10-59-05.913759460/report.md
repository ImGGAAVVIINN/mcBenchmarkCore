# FPS Test session — 2026-09-07T11:00:52.701019329+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 115.1 | 45.6 | 43.1 | 21.32 | 0.55 | 1 | 84 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 121.0 | 46.1 | 44.5 | 21.27 | 0.63 | 2 | 178 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.7 | 21.3 | 21.1 | 46.62 | 0.64 | 1 | 260 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `115.14`, min `42.87`, p50 `118.49`, p95 `133.24`, p99 `269.46`, 1%low `45.63`, 0.1%low `43.05`, std `100.06`

**Frame time (ms)**  avg `10.29`, p50 `8.44`, p95 `19.66`, p99 `21.32`, p99.9 `22.33`, max `23.32`

**Client tick (ms)**  avg `0.55`, p95 `0.85`, max `1.28`

**Memory**  start `759 MB`, end `722 MB`, peak `843 MB`, GC `1 events / 9 ms`

**FPS over sampling window (ASCII):**

```
175.7 |                                                           █                    
169.1 |                          █                                ██                   
162.6 |                          █                             █  ██          █        
156.0 |                 ██       █         █                   █  ██   █      █        
149.4 |                 ██       █         █                   █  ██   █      █        
142.9 |                 ██ █     █         █       █           █  ██   █      █        
136.3 |                 ██ █     █         █       █           █  ██   █      █        
129.8 |                 ██ █     █         █       █           █  ██   █      █        
123.2 |                 ██ █     █         █       █           █  ██   █      █        
116.6 |   █    ██    █  ██ █     █         █       ██          █  ██   █      █      █ 
110.1 |█ ████████████████████  █ ███ ██ ██ █  ██ █████ ██ ██ ████ ███  ██ █ █████   ██ 
103.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   10
   1 ms |   2
   2 ms |   1
   3 ms |   10
   4 ms |   10
   6 ms |   6
   7 ms | ████████████  306
   8 ms | ████████████████████████████████████████  1017
   9 ms | ██████  146
  10 ms |   1
  11 ms |   1
  12 ms |   3
  13 ms | █  37
  14 ms | ██  50
  15 ms | ██  47
  16 ms | ██  51
  17 ms | ██  53
  18 ms | ██  52
  19 ms | ███  70
  20 ms | ██  44
  21 ms | █  21
  22 ms |   4
  23 ms |   2
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 243 | 111.7 | 22.26 |
| `flame` | 160 | 243 | 119.1 | 21.00 |
| `dripping_water` | 240 | 243 | 116.7 | 20.68 |
| `dragon_breath` | 160 | 243 | 112.5 | 20.68 |
| `end_rod` | 240 | 243 | 111.3 | 21.13 |
| `portal` | 160 | 243 | 125.7 | 20.76 |
| `ALL_TOGETHER` | 1680 | 243 | 111.4 | 21.03 |
| `sculk_charge_pop` | 240 | 243 | 112.8 | 20.95 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `45.63`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `55.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `97.21`
- `fps_0p1pct_low` = `43.05`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `120.96`, min `43.90`, p50 `118.42`, p95 `135.10`, p99 `818.03`, 1%low `46.14`, 0.1%low `44.46`, std `121.16`

**Frame time (ms)**  avg `10.28`, p50 `8.44`, p95 `19.91`, p99 `21.27`, p99.9 `22.07`, max `22.78`

**Client tick (ms)**  avg `0.63`, p95 `0.88`, max `1.37`

**Memory**  start `689 MB`, end `652 MB`, peak `868 MB`, GC `2 events / 4 ms`

**FPS over sampling window (ASCII):**

```
233.4 |                                            █                                   
221.5 |                                            █                                   
209.5 |                                            █   █                               
197.6 |                                            █   █                               
185.7 |                                            █   █                               
173.8 |                                            █   █               █               
161.8 |                                            █   ██              █        ██ █   
149.9 |                  █              █    ██  █ █   ██ █  █ █       █   █    ██ █   
138.0 |                  ██ █           █    ██  ███   ██ █  █ █       █   █    ██ ██  
126.1 |  █          █  █ ██ █ █         █   ███  ███   ██ █  █ █       █   █    ██ ██  
114.1 |█ ██  █  █ ███  █ ██ █ █     ██  ███ ███  ███  ██████ █ ███  █  █   █ █  ██ ██  
102.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  15
   1 ms | █  14
   2 ms |   1
   3 ms |   4
   4 ms |   6
   5 ms |   2
   6 ms |   7
   7 ms | █████████████  319
   8 ms | ████████████████████████████████████████  969
   9 ms | ███████  173
  10 ms |   1
  12 ms |   1
  13 ms | █  26
  14 ms | ██  49
  15 ms | ██  52
  16 ms | ██  50
  17 ms | ███  61
  18 ms | ██  50
  19 ms | ██  52
  20 ms | ██  60
  21 ms | █  30
  22 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `46.14`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `44.46`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `97.27`
- `preload_duration_ms` = `99.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `28.66`, min `21.15`, p50 `29.43`, p95 `31.01`, p99 `47.75`, 1%low `21.31`, 0.1%low `21.15`, std `4.70`

**Frame time (ms)**  avg `35.70`, p50 `33.97`, p95 `45.05`, p99 `46.62`, p99.9 `47.19`, max `47.29`

**Client tick (ms)**  avg `0.64`, p95 `0.97`, max `1.48`

**Memory**  start `604 MB`, end `618 MB`, peak `864 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |                                                         █                      
 32.1 |                                                         █                      
 31.4 |                              █                          █  █                   
 30.8 |                           █  █ █         █  █           █  ██                  
 30.1 |                    █      █  ███         █  █   █     █ █  ██                  
 29.5 |                    █      █  ███         █ ██   █   █ █ █  ██   █  ██     █ █ █
 28.8 |█████     █ ██  █ █ █  ███████████  █ ██ ██ ███████  █ ████ ██   █  ███    █ ███
 28.1 |██████    █ ███ ███ ███████████████ ████ ██ ████████ █ ████ ██ ████ ████ █ █ ███
 27.5 |██████   ██ ██████████████████████████████████████████ ███████ ███████████ █████
 26.8 |██████ ████ ██████████████████████████████████████████████████ █████████████████
 26.1 |██████ █████████████████████████████████████████████████████████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ██  7
  21 ms | ███  12
  22 ms | █  2
  26 ms |   1
  31 ms | █  3
  32 ms | ██████████████████████████████  112
  33 ms | ████████████████████████████████████████  150
  34 ms | █████████████████████  80
  35 ms | ███  11
  36 ms | ██  9
  37 ms | ███  13
  38 ms | █████  17
  39 ms | ██████  24
  40 ms | █████  19
  41 ms | ██  9
  42 ms | ███  13
  43 ms | █████  18
  44 ms | ████████  29
  45 ms | █████  20
  46 ms | ██  9
  47 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `21.31`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.15`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.01`
- `preload_duration_ms` = `2.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 4942 ms  |  Sample ticks: 0

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

- `status` = `failed`
- `fail_reason` = `user pressed Shift+ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `part` = `1.00`

