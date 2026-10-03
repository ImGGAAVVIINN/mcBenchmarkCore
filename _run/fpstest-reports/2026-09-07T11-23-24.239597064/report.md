# FPS Test session — 2026-09-07T11:24:35.681337083+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 114.7 | 47.2 | 45.8 | 20.69 | 0.59 | 1 | 332 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 112.1 | 45.5 | 43.8 | 21.21 | 0.64 | 2 | 207 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `114.75`, min `45.57`, p50 `118.12`, p95 `132.37`, p99 `145.17`, 1%low `47.19`, 0.1%low `45.83`, std `96.60`

**Frame time (ms)**  avg `10.17`, p50 `8.47`, p95 `18.12`, p99 `20.69`, p99.9 `21.66`, max `21.95`

**Client tick (ms)**  avg `0.59`, p95 `0.91`, max `1.54`

**Memory**  start `500 MB`, end `474 MB`, peak `832 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
197.2 |                                                               █                
188.7 |                                                               █                
180.2 |                                 █                             █                
171.7 |                                 █                          █  █                
163.2 |                                 █                     █    █ ██                
154.7 |                   █             █                     █    █ ██                
146.2 |              █    █          █  █     █      █        █    █ ██             █  
137.7 |              █    █          █  █     █      █        █    █ ██             █  
129.2 | █            █    █         ██  █     █      █        █  █ █ ██             █  
120.8 | █      █     █    █         ██  █     █      █        █  █ █ ██             █  
112.3 |██ █  █ ██    █  █ ██    █  ███  █  █  █ █  █ █      ███ ██ █ ██ █  █  █  █  █  
103.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   11
   1 ms |   5
   2 ms |   1
   3 ms |   1
   6 ms |   4
   7 ms | ███████████  280
   8 ms | ████████████████████████████████████████  1053
   9 ms | ███████  180
  13 ms |   7
  14 ms | ██  46
  15 ms | ████  113
  16 ms | ████  109
  17 ms | ██  54
  18 ms | █  36
  19 ms | █  28
  20 ms | █  26
  21 ms |   12
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 245 | 111.0 | 20.08 |
| `dragon_breath` | 160 | 245 | 115.3 | 19.45 |
| `dripping_water` | 240 | 245 | 112.4 | 20.74 |
| `flame` | 160 | 245 | 117.4 | 19.43 |
| `smoke` | 160 | 245 | 110.3 | 19.45 |
| `sculk_charge_pop` | 240 | 245 | 120.4 | 21.07 |
| `ALL_TOGETHER` | 1680 | 245 | 121.3 | 20.99 |
| `portal` | 160 | 245 | 110.1 | 20.72 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `19.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `47.19`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `45.83`
- `fps_harmonic_avg` = `98.29`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `112.07`, min `43.75`, p50 `117.99`, p95 `131.76`, p99 `140.82`, 1%low `45.52`, 0.1%low `43.84`, std `77.90`

**Frame time (ms)**  avg `10.30`, p50 `8.48`, p95 `18.65`, p99 `21.21`, p99.9 `22.63`, max `22.86`

**Client tick (ms)**  avg `0.64`, p95 `0.93`, max `1.25`

**Memory**  start `655 MB`, end `685 MB`, peak `863 MB`, GC `2 events / 7 ms`

**FPS over sampling window (ASCII):**

```
168.9 |    █                                                                           
163.0 |    █                                                                           
157.0 |    █                                                  █                        
151.0 |    █                                █                 █       █         █      
145.0 |    █                                █      █          █       █        ██      
139.0 |    █                                █      █  █       █       █        ██      
133.0 |█   █  █        █                    █      █  █       █       █        ██      
127.1 |█   █  █        █                    █      █  █       █       █        ██      
121.1 |██  █  █  █ █   █                    █      █  █       █       █        ██      
115.1 |██  █  █  █ █   █                    █      █  █       █       █        ██      
109.1 |███ ██ ██ ███ █ ██  █ ██  █  █  █  █ ██  █  █  █  █  █ ██  ██  █ ██ █  █████ ██ 
103.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms |   8
   2 ms |   3
   4 ms |   1
   6 ms |   1
   7 ms | ███████████  277
   8 ms | ████████████████████████████████████████  1022
   9 ms | ████████  193
  13 ms |   3
  14 ms | █  30
  15 ms | ████  95
  16 ms | ████  104
  17 ms | ███  78
  18 ms | ██  40
  19 ms | █  31
  20 ms | █  26
  21 ms | █  17
  22 ms |   8
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `70.00`
- `fps_harmonic_avg` = `97.05`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `43.84`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `45.52`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 1739 ms  |  Sample ticks: 0

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
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed Shift+ESC`
- `part` = `1.00`

