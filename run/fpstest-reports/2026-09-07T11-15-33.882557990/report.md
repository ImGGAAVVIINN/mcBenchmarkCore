# FPS Test session — 2026-09-07T11:17:23.441865609+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 110.3 | 41.2 | 21.4 | 20.83 | 0.59 | 1 | 284 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 113.5 | 45.9 | 44.6 | 21.36 | 0.63 | 5 | 39 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.4 | 20.7 | 20.0 | 47.55 | 0.64 | 3 | 260 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `110.35`, min `17.89`, p50 `117.97`, p95 `132.96`, p99 `140.23`, 1%low `41.19`, 0.1%low `21.41`, std `73.04`

**Frame time (ms)**  avg `10.29`, p50 `8.48`, p95 `18.31`, p99 `20.83`, p99.9 `24.43`, max `55.91`

**Client tick (ms)**  avg `0.59`, p95 `0.91`, max `1.25`

**Memory**  start `457 MB`, end `492 MB`, peak `741 MB`, GC `1 events / 4 ms`

**FPS over sampling window (ASCII):**

```
167.2 |                                            █                                   
160.5 |                          █                 █                      █            
153.7 |                          █           █     █                      █            
147.0 |                  █     █ █           █     █                      █            
140.3 |                  █     █ █           █     █                      █            
133.6 |                  █     █ █           █     █                      █            
126.9 |                  █   █ █ █           █     █                      █            
120.2 |                  █   █ █ █           █     █                      █            
113.5 | █              █ █ █ █ █ █   █       █     █  █                   █            
106.8 |███████████████████████████████████████████████████ █████████  █████████ ██ ████
100.1 |██████████████████████████████████████████████████████████████ █████████████████
 93.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   6
   1 ms |   1
   2 ms |   1
   6 ms |   6
   7 ms | ███████████  284
   8 ms | ████████████████████████████████████████  996
   9 ms | █████████  214
  10 ms |   2
  13 ms |   7
  14 ms | ██  55
  15 ms | ████  102
  16 ms | ████  106
  17 ms | ██  55
  18 ms | █  34
  19 ms | █  27
  20 ms | █  30
  21 ms |   11
  22 ms |   3
  23 ms |   1
  37 ms |   1
  55 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 242 | 106.8 | 21.25 |
| `smoke` | 160 | 242 | 112.3 | 20.55 |
| `sculk_charge_pop` | 240 | 242 | 118.3 | 20.40 |
| `ALL_TOGETHER` | 1680 | 242 | 111.3 | 20.38 |
| `portal` | 160 | 242 | 112.2 | 20.51 |
| `end_rod` | 240 | 242 | 106.6 | 21.49 |
| `dragon_breath` | 160 | 242 | 109.2 | 20.03 |
| `dripping_water` | 240 | 242 | 105.9 | 20.41 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `41.19`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `21.41`
- `fps_harmonic_avg` = `97.21`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `63.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `113.47`, min `44.23`, p50 `117.93`, p95 `133.18`, p99 `143.59`, 1%low `45.93`, 0.1%low `44.58`, std `87.99`

**Frame time (ms)**  avg `10.30`, p50 `8.48`, p95 `18.53`, p99 `21.36`, p99.9 `22.20`, max `22.61`

**Client tick (ms)**  avg `0.63`, p95 `0.98`, max `1.37`

**Memory**  start `691 MB`, end `630 MB`, peak `731 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
164.5 |                                                             █                  
158.9 |                                  █                          █                 █
153.2 |                  █               █                          █     █           █
147.6 |                  █       █       █        █  █              █     █           █
141.9 |█          █      █       █       █        █  █  █     █     █     █       █   █
136.3 |█          █      █       █       █        █  █  █     █     █     █       █   █
130.7 |█          █      █       █       █        █  █  █     █     █     █       █   █
125.0 |█      █   █      █       █ █     █        █  █  █     █     █     █       █   █
119.4 |█      █   █      █       █ █     █        █  █  █     █     █     █       █   █
113.8 |█      █   █      █       █ █     █     █  █  █  █     █     █     █       █   █
108.1 |███  █ ██  █  █  ██ █████ █ ██ ██ █ ██  █ ██ ██ ██████ ██  █ ██ █  █  ██ ████  █
102.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   10
   1 ms |   7
   6 ms |   4
   7 ms | ████████████  294
   8 ms | ████████████████████████████████████████  991
   9 ms | ████████  203
  10 ms |   2
  11 ms |   1
  13 ms |   7
  14 ms | █  22
  15 ms | ███  78
  16 ms | █████  119
  17 ms | ███  82
  18 ms | ██  38
  19 ms | █  31
  20 ms | █  24
  21 ms | █  24
  22 ms |   5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `45.93`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `82.00`
- `fps_harmonic_avg` = `97.10`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `44.58`
- `preset_full` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `28.44`, min `20.04`, p50 `29.40`, p95 `31.16`, p99 `47.79`, 1%low `20.69`, 0.1%low `20.04`, std `4.90`

**Frame time (ms)**  avg `36.06`, p50 `34.01`, p95 `45.43`, p99 `47.55`, p99.9 `49.17`, max `49.90`

**Client tick (ms)**  avg `0.64`, p95 `0.89`, max `1.18`

**Memory**  start `501 MB`, end `632 MB`, peak `761 MB`, GC `3 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |       █                  █                                                     
 32.2 |       █                  █                                                     
 31.6 | █     █                  █                    █                                
 31.0 | █  █  █   █       █      █             █      █                    █       █   
 30.4 | █  █  █   █ █  █  █      █  █         ██  █   █                   ██       █   
 29.8 | █  █  █   █ █  █  █      █  █  █      ██  █   █       ██          ██       █   
 29.2 | █  █  █   █ █  █  █      █  █  █      ██  █   █       ██          ██      ██   
 28.6 | █  █  ██  █ █  █  █  █   █  █  █   █  ██  ███ █ █     ██      █   ██ █    ██   
 28.0 | ██ ██ ██ ██ ██ ██ ██ ██ ██ ██ ██ ████ ██  ███ █ ██ ██ ██ ████████ ██████ ████ █
 27.4 | ██ █████ █████ ██ ██ ██ ██ ██ ███████ ██ █████████ ██████████████ ███████████ █
 26.8 | █████████████████████████████████████ █████████████████████████████████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ██  8
  21 ms | ██  7
  22 ms | ██  7
  23 ms |   1
  27 ms |   1
  31 ms |   1
  32 ms | █████████████████████████████████  113
  33 ms | ████████████████████████████████████████  138
  34 ms | ████████████████████  70
  35 ms | █  5
  36 ms | ██  8
  37 ms | ███  11
  38 ms | ███  10
  39 ms | █████  18
  40 ms | ██████████  34
  41 ms | ████████  27
  42 ms | ██████  22
  43 ms | █████  18
  44 ms | ██████  19
  45 ms | ██████  19
  46 ms | ███  10
  47 ms | █  5
  48 ms | █  2
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.69`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `65.00`
- `fps_harmonic_avg` = `27.73`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `20.04`
- `preset_full` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 7752 ms  |  Sample ticks: 0

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

