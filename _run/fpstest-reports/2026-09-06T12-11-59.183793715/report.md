# FPS Test session — 2026-09-06T12:13:16.648238937+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 111.2 | 47.3 | 45.8 | 20.34 | 0.60 | 1 | 76 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 115.0 | 45.2 | 40.0 | 21.33 | 0.62 | 2 | 285 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `111.17`, min `45.56`, p50 `117.85`, p95 `133.17`, p99 `142.09`, 1%low `47.29`, 0.1%low `45.80`, std `73.77`

**Frame time (ms)**  avg `10.21`, p50 `8.49`, p95 `17.63`, p99 `20.34`, p99.9 `21.67`, max `21.95`

**Client tick (ms)**  avg `0.60`, p95 `0.98`, max `1.12`

**Memory**  start `662 MB`, end `739 MB`, peak `739 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
193.8 |                                                                         █      
185.6 |                                                                         █      
177.3 |                                                                         █      
169.0 |                                                                         █      
160.8 |                                                                         █      
152.5 |                                                     █   █ █             █      
144.2 |            █                                        █   █ █             █      
136.0 |            █       █                                █   █ █          █  █      
127.7 |            █       █                                █   █ ██         █  █      
119.4 |      █     █       █                                █   █ ██         █  █      
111.2 | █  █ ██  █ ██ ██  ██  █  █  █  █ ██ ██  █  █ █  █  ██ █ █████  █ █  ██ ██    █ 
102.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms |   4
   2 ms |   1
   4 ms |   1
   6 ms |   6
   7 ms | ███████████  286
   8 ms | ████████████████████████████████████████  998
   9 ms | █████████  224
  13 ms |   4
  14 ms | █  36
  15 ms | █████  123
  16 ms | █████  120
  17 ms | ███  68
  18 ms | █  33
  19 ms | █  19
  20 ms | █  19
  21 ms |   12
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dragon_breath` | 160 | 244 | 108.6 | 20.68 |
| `end_rod` | 240 | 244 | 114.3 | 20.36 |
| `portal` | 160 | 244 | 105.5 | 20.75 |
| `ALL_TOGETHER` | 1680 | 244 | 106.7 | 19.09 |
| `sculk_charge_pop` | 240 | 244 | 106.6 | 19.35 |
| `smoke` | 160 | 244 | 122.9 | 20.14 |
| `flame` | 160 | 244 | 110.0 | 19.15 |
| `dripping_water` | 240 | 244 | 115.0 | 20.03 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `71.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `97.96`
- `fps_0p1pct_low` = `45.80`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `47.29`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `114.96`, min `37.12`, p50 `118.15`, p95 `134.91`, p99 `293.30`, 1%low `45.21`, 0.1%low `39.96`, std `88.09`

**Frame time (ms)**  avg `10.34`, p50 `8.46`, p95 `19.86`, p99 `21.33`, p99.9 `22.25`, max `26.94`

**Client tick (ms)**  avg `0.62`, p95 `0.87`, max `1.54`

**Memory**  start `665 MB`, end `510 MB`, peak `951 MB`, GC `2 events / 7 ms`

**FPS over sampling window (ASCII):**

```
182.0 |                            █                                                   
174.9 |                            █                                                   
167.7 |                            █                                                   
160.6 |                            █                                                   
153.5 |                            █                                                   
146.4 |          █               █ █                    █ ██ █     █ █        █        
139.3 |          █     █         █ █   █                █ ██ █     █ █        █        
132.1 |          █     █       █ █ █   █           █    █ ██ █   █ █ █        █        
125.0 |          █     █       █ █ █   █       █   █    █ ██ █  ██ █ █      █ █        
117.9 |          █     █       █ █ █   █       █   █    █ ██ █  ██ █ █      █ █        
110.8 |██████    █ ███ ███ █ █ █████ █ ███ ██  █ ████ ███ █████ ████ ██ █  ██ ███      
103.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   10
   1 ms |   9
   3 ms |   4
   4 ms |   7
   5 ms |   2
   6 ms |   11
   7 ms | ██████████████  319
   8 ms | ████████████████████████████████████████  932
   9 ms | █████████  204
  10 ms |   4
  11 ms |   1
  13 ms | █  20
  14 ms | ██  44
  15 ms | ██  53
  16 ms | ██  58
  17 ms | ███  59
  18 ms | ██  50
  19 ms | ██  58
  20 ms | ██  58
  21 ms | █  26
  22 ms |   4
  23 ms |   1
  26 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `96.73`
- `preload_duration_ms` = `89.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `45.21`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `39.96`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 7642 ms  |  Sample ticks: 0

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

