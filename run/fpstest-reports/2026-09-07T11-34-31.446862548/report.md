# FPS Test session — 2026-09-07T11:35:42.142835365+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 112.3 | 45.2 | 40.6 | 21.48 | 0.62 | 3 | 108 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 112.4 | 44.9 | 43.9 | 21.87 | 0.69 | 4 | 121 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `112.26`, min `37.53`, p50 `118.20`, p95 `136.14`, p99 `241.27`, 1%low `45.18`, 0.1%low `40.56`, std `74.57`

**Frame time (ms)**  avg `10.33`, p50 `8.46`, p95 `19.54`, p99 `21.48`, p99.9 `22.53`, max `26.65`

**Client tick (ms)**  avg `0.62`, p95 `0.97`, max `1.41`

**Memory**  start `600 MB`, end `703 MB`, peak `708 MB`, GC `3 events / 12 ms`

**FPS over sampling window (ASCII):**

```
177.8 |                                            █                                   
171.0 |                                            █                                   
164.2 |                                            █           █                       
157.4 |                                            █           █        █     █        
150.6 |                                █           █      █    █        █     █        
143.8 |                                █           █      █    █        █     █        
137.0 |              █                 █           █      █    █        █     █        
130.2 |              █                 █           █      █    █        █     █        
123.4 |              █                 █           █      █    █        █     █        
116.6 |     █  █   █ █                 █  █ ██     █  ██  █    █        █     █        
109.8 | ███ ██ ██ █████ █   █  ██  ███████████ █████████████ █ ██ ██ ██ █  █ ██ ██ ████
103.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   6
   1 ms |   2
   2 ms |   1
   3 ms |   7
   4 ms | █  12
   5 ms |   4
   6 ms | █  14
   7 ms | █████████████  317
   8 ms | ████████████████████████████████████████  954
   9 ms | ████████  184
  10 ms |   3
  13 ms | █  20
  14 ms | ██  48
  15 ms | ██  59
  16 ms | ██  58
  17 ms | ██  56
  18 ms | ███  61
  19 ms | ██  55
  20 ms | ██  44
  21 ms | █  27
  22 ms |   5
  26 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 242 | 109.5 | 20.67 |
| `flame` | 160 | 242 | 110.5 | 21.79 |
| `smoke` | 160 | 242 | 107.3 | 21.33 |
| `sculk_charge_pop` | 240 | 242 | 113.3 | 21.60 |
| `ALL_TOGETHER` | 1680 | 242 | 117.5 | 21.23 |
| `portal` | 160 | 242 | 116.6 | 21.02 |
| `end_rod` | 240 | 242 | 111.2 | 19.91 |
| `dragon_breath` | 160 | 242 | 112.2 | 20.43 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `45.18`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `40.56`
- `fps_harmonic_avg` = `96.85`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `0.00`
- `particles_stage_dragon_breath` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `112.39`, min `43.52`, p50 `117.91`, p95 `136.90`, p99 `299.99`, 1%low `44.86`, 0.1%low `43.91`, std `65.17`

**Frame time (ms)**  avg `10.38`, p50 `8.48`, p95 `20.15`, p99 `21.87`, p99.9 `22.52`, max `22.98`

**Client tick (ms)**  avg `0.69`, p95 `0.98`, max `1.51`

**Memory**  start `730 MB`, end `735 MB`, peak `851 MB`, GC `4 events / 12 ms`

**FPS over sampling window (ASCII):**

```
173.9 |                                                           █                    
167.5 |                                                           █                    
161.0 |                                                           █                    
154.6 |                                   █                       █                    
148.2 |                                   █                       █    ██              
141.8 |                                   █                       █    ██              
135.3 |                         █         █                       █    ██              
128.9 |                         █       █ █        █   █          █    ██              
122.5 |             █  █     █  █       █ █        █   █          █    ██              
116.0 |      █      ██ █     █  █     █ ███       ██  ██ █    █   █    ██             █
109.6 |████  ████ █ ██ ████ ██████ ██ ████████  ████████ ██ █ █ ██████ ██ ██  █████ ███
103.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms |   9
   2 ms |   3
   3 ms | █  13
   4 ms |   11
   5 ms |   3
   6 ms | █  13
   7 ms | ██████████████  314
   8 ms | ████████████████████████████████████████  926
   9 ms | ████████  193
  10 ms |   4
  12 ms |   1
  13 ms | █  14
  14 ms | ██  39
  15 ms | ███  66
  16 ms | ███  59
  17 ms | ██  38
  18 ms | ███  65
  19 ms | ██  47
  20 ms | ██  50
  21 ms | ██  40
  22 ms | █  15
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `43.91`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `44.86`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `55.00`
- `fps_harmonic_avg` = `96.31`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 1035 ms  |  Sample ticks: 0

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

