# FPS Test session — 2026-09-03T07:40:20.327462187+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 228.0 | 41.9 | 32.6 | 22.00 | 0.62 | 1 | 396 |
| 2 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 228.0 | 41.9 | 32.6 | 22.00 | 0.62 | 1 | 396 |
| 3 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 228.0 | 41.9 | 32.6 | 22.00 | 0.62 | 1 | 396 |
| 4 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 228.0 | 41.9 | 32.6 | 22.00 | 0.62 | 1 | 396 |
| 5 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 228.0 | 41.9 | 32.6 | 22.00 | 0.62 | 1 | 396 |
| 6 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 228.0 | 41.9 | 32.6 | 22.00 | 0.62 | 1 | 396 |
| 7 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Sheep ×200 ring](#sheep-200-ring)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `228.03`, min `31.93`, p50 `118.78`, p95 `1299.64`, p99 `1657.43`, 1%low `41.91`, 0.1%low `32.55`, std `367.26`

**Frame time (ms)**  avg `9.37`, p50 `8.42`, p95 `18.40`, p99 `22.00`, p99.9 `28.77`, max `31.32`

**Client tick (ms)**  avg `0.62`, p95 `1.00`, max `1.54`

**Memory**  start `524 MB`, end `473 MB`, peak `920 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
371.5 |                                                                     █ █ █      
347.2 |                                             █               █       ███ █      
322.9 |                                          █  █ █   █    █ █  █       ███ █ █ █  
298.6 |                   █   █         █        █  █ ██  █ █  █ █  █  ██   ███ █ █ █  
274.2 |                   █ █ █         █        ██ █ ███ ███  █ █  ██ ██ █ ███ █ █ █ █
249.9 |                   █ █ █      ██ █ ███   ███ █████ ████ ███████ ████████ █ █ █ █
225.6 |                   █ █ █ █ ██ ██ █████ █████ █████ ████ ██████████████████████ █
201.3 |                 ███ ███ ███████ █████████████████ ███████████████████████████ █
177.0 |                 ███████████████ ███████████████████████████████████████████████
152.7 |                 ███████████████████████████████████████████████████████████████
128.4 |  █              ███████████████████████████████████████████████████████████████
104.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  172
   1 ms | ██  50
   2 ms | █  22
   3 ms |   4
   4 ms |   3
   5 ms |   5
   6 ms | █  17
   7 ms | ██████████  249
   8 ms | ████████████████████████████████████████  973
   9 ms | ████████  192
  10 ms |   7
  11 ms |   2
  12 ms |   4
  13 ms | █  17
  14 ms | █  29
  15 ms | ███  78
  16 ms | █████  113
  17 ms | ███  71
  18 ms | ██  38
  19 ms | █  19
  20 ms | █  21
  21 ms | █  26
  22 ms | █  13
  23 ms |   5
  25 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 266 | 109.4 | 21.28 |
| `flame` | 160 | 266 | 146.5 | 25.87 |
| `smoke` | 160 | 266 | 216.1 | 20.75 |
| `sculk_charge_pop` | 240 | 266 | 241.0 | 21.01 |
| `ALL_TOGETHER` | 1680 | 266 | 278.5 | 22.00 |
| `portal` | 160 | 266 | 273.0 | 21.72 |
| `end_rod` | 240 | 266 | 296.8 | 22.13 |
| `dragon_breath` | 160 | 266 | 264.0 | 21.10 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `41.91`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `32.55`
- `fps_harmonic_avg` = `106.71`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `75.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 24953 ms  |  Sample ticks: 400

**FPS**  avg `228.03`, min `31.93`, p50 `118.78`, p95 `1299.64`, p99 `1657.43`, 1%low `41.91`, 0.1%low `32.55`, std `367.26`

**Frame time (ms)**  avg `9.37`, p50 `8.42`, p95 `18.40`, p99 `22.00`, p99.9 `28.77`, max `31.32`

**Client tick (ms)**  avg `0.62`, p95 `1.00`, max `1.54`

**Memory**  start `524 MB`, end `473 MB`, peak `920 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
371.5 |                                                                     █ █ █      
347.2 |                                             █               █       ███ █      
322.9 |                                          █  █ █   █    █ █  █       ███ █ █ █  
298.6 |                   █   █         █        █  █ ██  █ █  █ █  █  ██   ███ █ █ █  
274.2 |                   █ █ █         █        ██ █ ███ ███  █ █  ██ ██ █ ███ █ █ █ █
249.9 |                   █ █ █      ██ █ ███   ███ █████ ████ ███████ ████████ █ █ █ █
225.6 |                   █ █ █ █ ██ ██ █████ █████ █████ ████ ██████████████████████ █
201.3 |                 ███ ███ ███████ █████████████████ ███████████████████████████ █
177.0 |                 ███████████████ ███████████████████████████████████████████████
152.7 |                 ███████████████████████████████████████████████████████████████
128.4 |  █              ███████████████████████████████████████████████████████████████
104.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  172
   1 ms | ██  50
   2 ms | █  22
   3 ms |   4
   4 ms |   3
   5 ms |   5
   6 ms | █  17
   7 ms | ██████████  249
   8 ms | ████████████████████████████████████████  973
   9 ms | ████████  192
  10 ms |   7
  11 ms |   2
  12 ms |   4
  13 ms | █  17
  14 ms | █  29
  15 ms | ███  78
  16 ms | █████  113
  17 ms | ███  71
  18 ms | ██  38
  19 ms | █  19
  20 ms | █  21
  21 ms | █  26
  22 ms | █  13
  23 ms |   5
  25 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 266 | 109.4 | 21.28 |
| `flame` | 160 | 266 | 146.5 | 25.87 |
| `smoke` | 160 | 266 | 216.1 | 20.75 |
| `sculk_charge_pop` | 240 | 266 | 241.0 | 21.01 |
| `ALL_TOGETHER` | 1680 | 266 | 278.5 | 22.00 |
| `portal` | 160 | 266 | 273.0 | 21.72 |
| `end_rod` | 240 | 266 | 296.8 | 22.13 |
| `dragon_breath` | 160 | 266 | 264.0 | 21.10 |

**Extras:**

- `status` = `failed`
- `aborted_state` = `DISCONNECTING`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `41.91`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `32.55`
- `fps_harmonic_avg` = `106.71`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `75.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 26347 ms  |  Sample ticks: 400

**FPS**  avg `228.03`, min `31.93`, p50 `118.78`, p95 `1299.64`, p99 `1657.43`, 1%low `41.91`, 0.1%low `32.55`, std `367.26`

**Frame time (ms)**  avg `9.37`, p50 `8.42`, p95 `18.40`, p99 `22.00`, p99.9 `28.77`, max `31.32`

**Client tick (ms)**  avg `0.62`, p95 `1.00`, max `1.54`

**Memory**  start `524 MB`, end `473 MB`, peak `920 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
371.5 |                                                                     █ █ █      
347.2 |                                             █               █       ███ █      
322.9 |                                          █  █ █   █    █ █  █       ███ █ █ █  
298.6 |                   █   █         █        █  █ ██  █ █  █ █  █  ██   ███ █ █ █  
274.2 |                   █ █ █         █        ██ █ ███ ███  █ █  ██ ██ █ ███ █ █ █ █
249.9 |                   █ █ █      ██ █ ███   ███ █████ ████ ███████ ████████ █ █ █ █
225.6 |                   █ █ █ █ ██ ██ █████ █████ █████ ████ ██████████████████████ █
201.3 |                 ███ ███ ███████ █████████████████ ███████████████████████████ █
177.0 |                 ███████████████ ███████████████████████████████████████████████
152.7 |                 ███████████████████████████████████████████████████████████████
128.4 |  █              ███████████████████████████████████████████████████████████████
104.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  172
   1 ms | ██  50
   2 ms | █  22
   3 ms |   4
   4 ms |   3
   5 ms |   5
   6 ms | █  17
   7 ms | ██████████  249
   8 ms | ████████████████████████████████████████  973
   9 ms | ████████  192
  10 ms |   7
  11 ms |   2
  12 ms |   4
  13 ms | █  17
  14 ms | █  29
  15 ms | ███  78
  16 ms | █████  113
  17 ms | ███  71
  18 ms | ██  38
  19 ms | █  19
  20 ms | █  21
  21 ms | █  26
  22 ms | █  13
  23 ms |   5
  25 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 266 | 109.4 | 21.28 |
| `flame` | 160 | 266 | 146.5 | 25.87 |
| `smoke` | 160 | 266 | 216.1 | 20.75 |
| `sculk_charge_pop` | 240 | 266 | 241.0 | 21.01 |
| `ALL_TOGETHER` | 1680 | 266 | 278.5 | 22.00 |
| `portal` | 160 | 266 | 273.0 | 21.72 |
| `end_rod` | 240 | 266 | 296.8 | 22.13 |
| `dragon_breath` | 160 | 266 | 264.0 | 21.10 |

**Extras:**

- `status` = `failed`
- `aborted_state` = `READY_WAIT`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `41.91`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `32.55`
- `fps_harmonic_avg` = `106.71`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `75.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 26547 ms  |  Sample ticks: 400

**FPS**  avg `228.03`, min `31.93`, p50 `118.78`, p95 `1299.64`, p99 `1657.43`, 1%low `41.91`, 0.1%low `32.55`, std `367.26`

**Frame time (ms)**  avg `9.37`, p50 `8.42`, p95 `18.40`, p99 `22.00`, p99.9 `28.77`, max `31.32`

**Client tick (ms)**  avg `0.62`, p95 `1.00`, max `1.54`

**Memory**  start `524 MB`, end `473 MB`, peak `920 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
371.5 |                                                                     █ █ █      
347.2 |                                             █               █       ███ █      
322.9 |                                          █  █ █   █    █ █  █       ███ █ █ █  
298.6 |                   █   █         █        █  █ ██  █ █  █ █  █  ██   ███ █ █ █  
274.2 |                   █ █ █         █        ██ █ ███ ███  █ █  ██ ██ █ ███ █ █ █ █
249.9 |                   █ █ █      ██ █ ███   ███ █████ ████ ███████ ████████ █ █ █ █
225.6 |                   █ █ █ █ ██ ██ █████ █████ █████ ████ ██████████████████████ █
201.3 |                 ███ ███ ███████ █████████████████ ███████████████████████████ █
177.0 |                 ███████████████ ███████████████████████████████████████████████
152.7 |                 ███████████████████████████████████████████████████████████████
128.4 |  █              ███████████████████████████████████████████████████████████████
104.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  172
   1 ms | ██  50
   2 ms | █  22
   3 ms |   4
   4 ms |   3
   5 ms |   5
   6 ms | █  17
   7 ms | ██████████  249
   8 ms | ████████████████████████████████████████  973
   9 ms | ████████  192
  10 ms |   7
  11 ms |   2
  12 ms |   4
  13 ms | █  17
  14 ms | █  29
  15 ms | ███  78
  16 ms | █████  113
  17 ms | ███  71
  18 ms | ██  38
  19 ms | █  19
  20 ms | █  21
  21 ms | █  26
  22 ms | █  13
  23 ms |   5
  25 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 266 | 109.4 | 21.28 |
| `flame` | 160 | 266 | 146.5 | 25.87 |
| `smoke` | 160 | 266 | 216.1 | 20.75 |
| `sculk_charge_pop` | 240 | 266 | 241.0 | 21.01 |
| `ALL_TOGETHER` | 1680 | 266 | 278.5 | 22.00 |
| `portal` | 160 | 266 | 273.0 | 21.72 |
| `end_rod` | 240 | 266 | 296.8 | 22.13 |
| `dragon_breath` | 160 | 266 | 264.0 | 21.10 |

**Extras:**

- `status` = `failed`
- `aborted_state` = `POST_RUN`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `41.91`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `32.55`
- `fps_harmonic_avg` = `106.71`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `75.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 26699 ms  |  Sample ticks: 400

**FPS**  avg `228.03`, min `31.93`, p50 `118.78`, p95 `1299.64`, p99 `1657.43`, 1%low `41.91`, 0.1%low `32.55`, std `367.26`

**Frame time (ms)**  avg `9.37`, p50 `8.42`, p95 `18.40`, p99 `22.00`, p99.9 `28.77`, max `31.32`

**Client tick (ms)**  avg `0.62`, p95 `1.00`, max `1.54`

**Memory**  start `524 MB`, end `473 MB`, peak `920 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
371.5 |                                                                     █ █ █      
347.2 |                                             █               █       ███ █      
322.9 |                                          █  █ █   █    █ █  █       ███ █ █ █  
298.6 |                   █   █         █        █  █ ██  █ █  █ █  █  ██   ███ █ █ █  
274.2 |                   █ █ █         █        ██ █ ███ ███  █ █  ██ ██ █ ███ █ █ █ █
249.9 |                   █ █ █      ██ █ ███   ███ █████ ████ ███████ ████████ █ █ █ █
225.6 |                   █ █ █ █ ██ ██ █████ █████ █████ ████ ██████████████████████ █
201.3 |                 ███ ███ ███████ █████████████████ ███████████████████████████ █
177.0 |                 ███████████████ ███████████████████████████████████████████████
152.7 |                 ███████████████████████████████████████████████████████████████
128.4 |  █              ███████████████████████████████████████████████████████████████
104.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  172
   1 ms | ██  50
   2 ms | █  22
   3 ms |   4
   4 ms |   3
   5 ms |   5
   6 ms | █  17
   7 ms | ██████████  249
   8 ms | ████████████████████████████████████████  973
   9 ms | ████████  192
  10 ms |   7
  11 ms |   2
  12 ms |   4
  13 ms | █  17
  14 ms | █  29
  15 ms | ███  78
  16 ms | █████  113
  17 ms | ███  71
  18 ms | ██  38
  19 ms | █  19
  20 ms | █  21
  21 ms | █  26
  22 ms | █  13
  23 ms |   5
  25 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 266 | 109.4 | 21.28 |
| `flame` | 160 | 266 | 146.5 | 25.87 |
| `smoke` | 160 | 266 | 216.1 | 20.75 |
| `sculk_charge_pop` | 240 | 266 | 241.0 | 21.01 |
| `ALL_TOGETHER` | 1680 | 266 | 278.5 | 22.00 |
| `portal` | 160 | 266 | 273.0 | 21.72 |
| `end_rod` | 240 | 266 | 296.8 | 22.13 |
| `dragon_breath` | 160 | 266 | 264.0 | 21.10 |

**Extras:**

- `status` = `failed`
- `aborted_state` = `POST_RUN`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `41.91`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `32.55`
- `fps_harmonic_avg` = `106.71`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `75.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 26898 ms  |  Sample ticks: 400

**FPS**  avg `228.03`, min `31.93`, p50 `118.78`, p95 `1299.64`, p99 `1657.43`, 1%low `41.91`, 0.1%low `32.55`, std `367.26`

**Frame time (ms)**  avg `9.37`, p50 `8.42`, p95 `18.40`, p99 `22.00`, p99.9 `28.77`, max `31.32`

**Client tick (ms)**  avg `0.62`, p95 `1.00`, max `1.54`

**Memory**  start `524 MB`, end `473 MB`, peak `920 MB`, GC `1 events / 3 ms`

**FPS over sampling window (ASCII):**

```
371.5 |                                                                     █ █ █      
347.2 |                                             █               █       ███ █      
322.9 |                                          █  █ █   █    █ █  █       ███ █ █ █  
298.6 |                   █   █         █        █  █ ██  █ █  █ █  █  ██   ███ █ █ █  
274.2 |                   █ █ █         █        ██ █ ███ ███  █ █  ██ ██ █ ███ █ █ █ █
249.9 |                   █ █ █      ██ █ ███   ███ █████ ████ ███████ ████████ █ █ █ █
225.6 |                   █ █ █ █ ██ ██ █████ █████ █████ ████ ██████████████████████ █
201.3 |                 ███ ███ ███████ █████████████████ ███████████████████████████ █
177.0 |                 ███████████████ ███████████████████████████████████████████████
152.7 |                 ███████████████████████████████████████████████████████████████
128.4 |  █              ███████████████████████████████████████████████████████████████
104.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  172
   1 ms | ██  50
   2 ms | █  22
   3 ms |   4
   4 ms |   3
   5 ms |   5
   6 ms | █  17
   7 ms | ██████████  249
   8 ms | ████████████████████████████████████████  973
   9 ms | ████████  192
  10 ms |   7
  11 ms |   2
  12 ms |   4
  13 ms | █  17
  14 ms | █  29
  15 ms | ███  78
  16 ms | █████  113
  17 ms | ███  71
  18 ms | ██  38
  19 ms | █  19
  20 ms | █  21
  21 ms | █  26
  22 ms | █  13
  23 ms |   5
  25 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 266 | 109.4 | 21.28 |
| `flame` | 160 | 266 | 146.5 | 25.87 |
| `smoke` | 160 | 266 | 216.1 | 20.75 |
| `sculk_charge_pop` | 240 | 266 | 241.0 | 21.01 |
| `ALL_TOGETHER` | 1680 | 266 | 278.5 | 22.00 |
| `portal` | 160 | 266 | 273.0 | 21.72 |
| `end_rod` | 240 | 266 | 296.8 | 22.13 |
| `dragon_breath` | 160 | 266 | 264.0 | 21.10 |

**Extras:**

- `status` = `failed`
- `aborted_state` = `POST_RUN`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `41.91`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `32.55`
- `fps_harmonic_avg` = `106.71`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `75.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 1007 ms  |  Sample ticks: 0

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

