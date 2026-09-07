# FPS Test session — 2026-09-06T12:26:48.217370205+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 110.8 | 46.8 | 41.4 | 20.52 | 0.59 | 3 | 64 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 110.8 | 47.2 | 44.9 | 20.07 | 0.64 | 1 | 464 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `110.77`, min `38.33`, p50 `118.36`, p95 `131.47`, p99 `139.76`, 1%low `46.81`, 0.1%low `41.36`, std `78.13`

**Frame time (ms)**  avg `10.19`, p50 `8.45`, p95 `17.70`, p99 `20.52`, p99.9 `22.21`, max `26.09`

**Client tick (ms)**  avg `0.59`, p95 `0.89`, max `9.24`

**Memory**  start `780 MB`, end `790 MB`, peak `844 MB`, GC `3 events / 19 ms`

**FPS over sampling window (ASCII):**

```
177.8 |                                                                         █      
170.7 |                             █  █                                        █      
163.7 |                             █  █                                        █      
156.7 |                             █  █                                     █  █      
149.6 |                             █  █                                     █  █      
142.6 |                             █  █                              █      █  █      
135.6 |            █        █       █  █                              █      █  █      
128.5 |            █        █       █  █                              █      █  █      
121.5 |            █        █       █  █                              █      █  █      
114.5 | █          █        █       █  █                              █   █  █  █      
107.4 |███████████████████ ██████ ████████████████████ █████████████████████████████ ██
100.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms |   3
   3 ms |   2
   6 ms |   3
   7 ms | ███████████  281
   8 ms | ████████████████████████████████████████  1049
   9 ms | ███████  182
  12 ms |   2
  13 ms |   9
  14 ms | ██  62
  15 ms | ████  114
  16 ms | ████  113
  17 ms | ██  48
  18 ms | ██  40
  19 ms | █  23
  20 ms | █  17
  21 ms |   7
  22 ms |   2
  26 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 245 | 107.7 | 20.77 |
| `dragon_breath` | 160 | 245 | 109.1 | 20.77 |
| `dripping_water` | 240 | 245 | 114.5 | 20.02 |
| `flame` | 160 | 245 | 112.4 | 19.59 |
| `smoke` | 160 | 245 | 106.7 | 20.37 |
| `sculk_charge_pop` | 240 | 245 | 106.5 | 18.77 |
| `ALL_TOGETHER` | 1680 | 245 | 115.8 | 19.61 |
| `portal` | 160 | 245 | 113.6 | 18.80 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `46.81`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `41.36`
- `fps_harmonic_avg` = `98.16`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `110.80`, min `44.48`, p50 `118.28`, p95 `132.58`, p99 `139.60`, 1%low `47.22`, 0.1%low `44.91`, std `68.16`

**Frame time (ms)**  avg `10.18`, p50 `8.45`, p95 `17.66`, p99 `20.07`, p99.9 `21.96`, max `22.48`

**Client tick (ms)**  avg `0.64`, p95 `0.94`, max `1.37`

**Memory**  start `692 MB`, end `886 MB`, peak `1156 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
159.0 |                                                                  █       █     
154.0 |                                                                  █       █  █  
149.0 |                                                                  █       █  █  
143.9 |       █        █                                                 █       █  █  
138.9 |       █        █                                            █    █       █  █  
133.9 |       █  █     █                                            █    █       █  █  
128.9 |       █  █     █                         █                  █    █       █  █  
123.9 |       █  █     █                         █          █       █    █       █  █  
118.9 |       █  █     █                         █          █       █    █       █  █  
113.9 |       █  █     █                         █          █       █    █       █  █  
108.9 | ███ █ ██ ██  █ ██ ██ █  █  █  █  █  █ ██ ██ ██ ██ █ ██  █ █ ██ ████  █  ███ ██ 
103.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms |   5
   2 ms |   1
   3 ms |   1
   6 ms |   4
   7 ms | ████████████  297
   8 ms | ████████████████████████████████████████  993
   9 ms | █████████  223
  10 ms |   2
  13 ms |   9
  14 ms | ██  48
  15 ms | ████  109
  16 ms | █████  131
  17 ms | ██  50
  18 ms | ██  47
  19 ms | █  21
  20 ms |   8
  21 ms |   10
  22 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `84.00`
- `fps_harmonic_avg` = `98.28`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `44.91`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `47.22`
- `preset_long` = `0.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 558 ms  |  Sample ticks: 0

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

