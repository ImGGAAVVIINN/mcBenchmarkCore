# FPS Test session — 2026-09-06T19:43:48.404740068+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 113.7 | 45.5 | 43.1 | 21.39 | 0.61 | 1 | 132 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 109.8 | 45.9 | 43.6 | 21.17 | 0.60 | 2 | 176 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `113.74`, min `43.09`, p50 `117.89`, p95 `133.25`, p99 `272.92`, 1%low `45.45`, 0.1%low `43.13`, std `86.55`

**Frame time (ms)**  avg `10.28`, p50 `8.48`, p95 `18.51`, p99 `21.39`, p99.9 `22.56`, max `23.21`

**Client tick (ms)**  avg `0.61`, p95 `0.93`, max `1.33`

**Memory**  start `673 MB`, end `704 MB`, peak `805 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
159.2 |                                                 █                              
154.1 |                                                 █      █                       
149.0 |                             █      █ █    █     █   █  █                       
143.8 |                   █    █    █      █ █    █ █   █   █  █                       
138.7 |   █               █    █    █      █ █    █ █   █   █  █                       
133.5 |   █               █    █    █      █ █    █ █   █   █  █                       
128.4 |   █               █    █    █     ██ █    █ █   █   █  █                       
123.3 |   █               █    █    █   █ ██ █    █ █   █   █  █                █      
118.1 | █ ██         █    █    █    █   █ ██ █    █ █   █   █  █                █      
113.0 | █ ██    █    ██   █    █  █ █   █ ██ █    █ █   █  ██  █                █      
107.8 |████████ █ ██ ██  ████ ██ ████  ██ ██ █ ██ █████ █  ██ ██ █ ██ ██ █ ██  ██ █ ██ 
102.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   10
   1 ms |   5
   2 ms |   3
   3 ms |   3
   4 ms |   1
   6 ms |   4
   7 ms | ███████████  281
   8 ms | ████████████████████████████████████████  988
   9 ms | █████████  218
  10 ms |   3
  13 ms |   7
  14 ms | █  29
  15 ms | ███  85
  16 ms | █████  115
  17 ms | ███  76
  18 ms | █  37
  19 ms | █  28
  20 ms | █  28
  21 ms | █  20
  22 ms |   4
  23 ms |   2
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 243 | 112.5 | 21.72 |
| `smoke` | 160 | 243 | 111.9 | 20.62 |
| `sculk_charge_pop` | 240 | 243 | 114.7 | 20.77 |
| `ALL_TOGETHER` | 1680 | 243 | 118.5 | 20.90 |
| `portal` | 160 | 243 | 119.0 | 21.51 |
| `end_rod` | 240 | 243 | 115.6 | 21.22 |
| `dragon_breath` | 160 | 243 | 106.2 | 19.76 |
| `dripping_water` | 240 | 243 | 112.1 | 20.78 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `45.45`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `43.13`
- `fps_harmonic_avg` = `97.28`
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

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `109.80`, min `42.77`, p50 `117.93`, p95 `132.81`, p99 `140.96`, 1%low `45.85`, 0.1%low `43.57`, std `58.49`

**Frame time (ms)**  avg `10.30`, p50 `8.48`, p95 `18.50`, p99 `21.17`, p99.9 `22.48`, max `23.38`

**Client tick (ms)**  avg `0.60`, p95 `0.84`, max `1.23`

**Memory**  start `670 MB`, end `710 MB`, peak `846 MB`, GC `2 events / 7 ms`

**FPS over sampling window (ASCII):**

```
173.7 |                    █                                                           
167.3 |                    █                                                           
160.8 |             █      █                                                           
154.3 |             █      █                                                           
147.8 |             █      █             █                                             
141.3 |             █      █             █                                             
134.8 |         █   █ █    █  █          █                                 █           
128.3 |         █   █ █    █  █          █                                 █           
121.8 |         █   █ █    █  █          █                   █             █           
115.3 |         █   █ █    █  █          █                   █             █           
108.9 |█  ██  █ ██ ██ ██  ██ ████ █  ██ ██ ████ █  █  ██ █████ █  █  █  █  █ ██ ██  █ █
102.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms |   8
   4 ms |   1
   6 ms |   5
   7 ms | ████████████  285
   8 ms | ████████████████████████████████████████  984
   9 ms | █████████  224
  10 ms |   1
  11 ms |   1
  13 ms |   4
  14 ms | █  26
  15 ms | ████  94
  16 ms | █████  114
  17 ms | ███  69
  18 ms | ██  47
  19 ms | █  28
  20 ms | █  18
  21 ms | █  23
  22 ms |   5
  23 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `45.85`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `60.00`
- `fps_harmonic_avg` = `97.05`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `43.57`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 17271 ms  |  Sample ticks: 0

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
- `aborted_state` = `SAMPLING`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed Shift+ESC`
- `part` = `1.00`

