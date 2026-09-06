# FPS Test session — 2026-09-06T10:17:47.958622057+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 119.0 | 103.0 | 100.1 | 9.55 | 0.60 | 0 | 460 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 119.3 | 99.5 | 73.8 | 9.59 | 0.64 | 2 | 12 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 4 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 5 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `119.05`, min `99.37`, p50 `118.67`, p95 `132.19`, p99 `137.06`, 1%low `102.98`, 0.1%low `100.08`, std `6.82`

**Frame time (ms)**  avg `8.43`, p50 `8.43`, p95 `9.30`, p99 `9.55`, p99.9 `9.87`, max `10.06`

**Client tick (ms)**  avg `0.60`, p95 `0.90`, max `1.22`

**Memory**  start `439 MB`, end `899 MB`, peak `899 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
119.8 | █      █                                                                       
119.6 |██      █                                                                       
119.5 |██   █  █               █          █                                            
119.4 |██ █ █  █ █      █      █          █                 █        █                 
119.3 |███████ █ ██     █      █ █        █        █        █        █                 
119.2 |███████ █ █████  █  █ █ █ █    █   █        █    █   █ █      █        █        
119.1 |███████ ███████  ████ █ █ ████ ██ ██  █  █  █ █  █   █ ██     █        █  █     
119.0 |███████ ███████  ██████ █ ████ ██ █████ ██  ████ ██ ████████ ██ ██ █   █  ██ █  
118.8 |███████ ████████ ██████ █ ███████ █████ ███████████ ████████ █████ ██ ████████ █
118.7 |███████ █████████████████████████ █████████████████ █████████████████ ██████████
118.6 |█████████████████████████████████ ███████████████████████████████████ ██████████
118.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   4
   7 ms | █████████  389
   8 ms | ████████████████████████████████████████  1651
   9 ms | ████████  328
  10 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 296 | 119.4 | 9.86 |
| `portal` | 160 | 296 | 119.1 | 9.53 |
| `ALL_TOGETHER` | 1680 | 296 | 119.1 | 9.52 |
| `sculk_charge_pop` | 240 | 296 | 119.0 | 9.35 |
| `smoke` | 160 | 296 | 119.0 | 9.40 |
| `flame` | 160 | 296 | 119.0 | 9.41 |
| `dripping_water` | 240 | 296 | 118.9 | 9.21 |
| `dragon_breath` | 160 | 296 | 118.9 | 9.26 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `0.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `118.66`
- `fps_0p1pct_low` = `100.08`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `102.98`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `119.34`, min `58.87`, p50 `118.72`, p95 `131.92`, p99 `137.29`, 1%low `99.50`, 0.1%low `73.83`, std `17.15`

**Frame time (ms)**  avg `8.43`, p50 `8.42`, p95 `9.28`, p99 `9.59`, p99.9 `9.94`, max `16.99`

**Client tick (ms)**  avg `0.64`, p95 `0.91`, max `8.09`

**Memory**  start `1010 MB`, end `934 MB`, peak `1022 MB`, GC `2 events / 15 ms`

**FPS over sampling window (ASCII):**

```
143.0 | █                                                                              
140.7 | █                                                                              
138.4 | █                                                                              
136.2 | █                                                                              
133.9 | █                                                                              
131.6 | █                                                                              
129.4 | █                                                                              
127.1 | █                                                                              
124.8 | █                                                                              
122.5 | █                                                                              
120.3 |███    ██   █    █  █     █       ████  █   █    █   █       █        █  █     █
118.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   6 ms |   7
   7 ms | ██████████  394
   8 ms | ████████████████████████████████████████  1606
   9 ms | █████████  363
  10 ms |   1
  16 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `118.65`
- `preload_duration_ms` = `66.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `99.50`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `73.83`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 1505 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 3706 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 5803 ms  |  Sample ticks: 0

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

- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 8104 ms  |  Sample ticks: 0

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
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

