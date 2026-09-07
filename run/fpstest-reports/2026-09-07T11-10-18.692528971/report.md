# FPS Test session — 2026-09-07T11:11:30.970434832+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 111.7 | 45.2 | 38.9 | 21.17 | 0.60 | 1 | 0 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 113.9 | 46.3 | 44.1 | 20.94 | 0.61 | 2 | 137 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `111.73`, min `35.06`, p50 `118.45`, p95 `132.20`, p99 `138.81`, 1%low `45.21`, 0.1%low `38.89`, std `80.44`

**Frame time (ms)**  avg `10.34`, p50 `8.44`, p95 `18.42`, p99 `21.17`, p99.9 `22.27`, max `28.52`

**Client tick (ms)**  avg `0.60`, p95 `0.90`, max `11.12`

**Memory**  start `800 MB`, end `793 MB`, peak `800 MB`, GC `1 events / 10 ms`

**FPS over sampling window (ASCII):**

```
178.2 |                                                           █                    
171.4 |                                                           █                    
164.5 |                                                         █ █                    
157.7 |                   █                                     █ █                    
150.8 |                   █   █   █                             █ █                    
144.0 |                   █   █   █                           █ █ █                    
137.1 |█                  █   █   █                           █ █ █                    
130.3 |██              █  █   █   █                           ███ █                    
123.5 |██    █         █  █   █   █                           ███ █                 █  
116.6 |██    █         █  █   █   █                           ███ █                 █  
109.8 |████ ██  █  █  ██████  █  ███  ██  █   █  █  █  █  █  ████ █ █ ██ ██ ██ ██ ████ 
102.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   6
   1 ms |   7
   6 ms |   4
   7 ms | ██████████  267
   8 ms | ████████████████████████████████████████  1024
   9 ms | ████████  195
  13 ms |   4
  14 ms | █  29
  15 ms | ██  54
  16 ms | █████  125
  17 ms | ████  91
  18 ms | ██  58
  19 ms | █  24
  20 ms | █  24
  21 ms | █  18
  22 ms |   4
  28 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `sculk_charge_pop` | 240 | 241 | 113.8 | 21.16 |
| `smoke` | 160 | 241 | 114.4 | 21.39 |
| `flame` | 160 | 241 | 114.9 | 20.30 |
| `dripping_water` | 240 | 241 | 105.2 | 20.91 |
| `dragon_breath` | 160 | 241 | 105.7 | 21.17 |
| `end_rod` | 240 | 241 | 126.5 | 21.04 |
| `portal` | 160 | 241 | 105.7 | 20.66 |
| `ALL_TOGETHER` | 1680 | 241 | 108.0 | 19.56 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `45.21`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `24.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `96.71`
- `fps_0p1pct_low` = `38.89`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `113.87`, min `43.72`, p50 `118.23`, p95 `132.22`, p99 `144.78`, 1%low `46.32`, 0.1%low `44.14`, std `91.94`

**Frame time (ms)**  avg `10.30`, p50 `8.46`, p95 `18.58`, p99 `20.94`, p99.9 `22.17`, max `22.87`

**Client tick (ms)**  avg `0.61`, p95 `0.86`, max `1.24`

**Memory**  start `685 MB`, end `722 MB`, peak `822 MB`, GC `2 events / 6 ms`

**FPS over sampling window (ASCII):**

```
177.3 |                                                                            █   
170.5 |                                                                            █   
163.8 |                    █                                                       █   
157.0 |                    █      █                                █               █   
150.3 |                  █ █      █                                █             █ █   
143.6 |               █  █ █      █                                █       ██    █ █   
136.8 | █             █  █ █      █                                █       ██    █ █   
130.1 | █     █  █    ██ █ █    █ █                                █       ██    █ █   
123.3 | █     █  █    ██ █ █    █ █                                █       ██    █ █   
116.6 | █     █  █    ██ █ █    █ █                                █       ██    █ █   
109.8 | █ █  █████ █  ██ █ █  █ ███ █ ██ ██ ██ █ ██ █  █ ██  █  █  ██  █ █████ ███ █  █
103.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   10
   1 ms |   6
   3 ms |   1
   4 ms |   1
   5 ms |   1
   6 ms |   3
   7 ms | ████████████  295
   8 ms | ████████████████████████████████████████  988
   9 ms | ████████  205
  11 ms |   1
  13 ms |   5
  14 ms | █  27
  15 ms | ███  70
  16 ms | █████  114
  17 ms | ███  86
  18 ms | ██  55
  19 ms | █  32
  20 ms | █  24
  21 ms | █  16
  22 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.32`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `44.14`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `97.13`
- `preload_duration_ms` = `60.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 2862 ms  |  Sample ticks: 0

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

- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed Shift+ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

