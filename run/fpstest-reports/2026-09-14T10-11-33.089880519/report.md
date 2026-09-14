# MC Benchmark Core session — 2026-09-14T10:12:43.73624007+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 110.7 | 46.5 | 43.7 | 20.69 | 0.56 | 4 | 33 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 109.3 | 46.3 | 43.9 | 20.94 | 0.65 | 4 | 170 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `110.68`, min `42.77`, p50 `116.90`, p95 `131.90`, p99 `583.00`, 1%low `46.53`, 0.1%low `43.69`, std `121.94`

**Frame time (ms)**  avg `11.16`, p50 `8.55`, p95 `18.57`, p99 `20.69`, p99.9 `22.02`, max `23.38`

**Client tick (ms)**  avg `0.56`, p95 `0.88`, max `1.51`

**Memory**  start `753 MB`, end `484 MB`, peak `787 MB`, GC `4 events / 22 ms`

**FPS over sampling window (ASCII):**

```
251.3 |                                                                        █   █   
237.0 |                                                                        █   █   
222.7 |                                                                        █   █   
208.3 |                                                                        █   █   
194.0 |                                                                        █   █  █
179.7 |        █                                                               █   █  █
165.4 |        █                                   █   █                    █  █   █  █
151.1 |        █       █          █                █   █                    █  █   █  █
136.7 |        ██      █          █                █   █          █         █  █   █  █
122.4 |█    █  ██      █          █                █   █          █         █  █   █  █
108.1 |██ █ ██ ██ █  █ ██ █  █  █ █      █ █  █  █ █   █ █  █     █  █ █  ████ █   █ ██
 93.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  13
   1 ms |   7
   2 ms |   1
   6 ms |   5
   7 ms | ███████████  210
   8 ms | ████████████████████████████████████████  776
   9 ms | ███████  133
  10 ms |   1
  12 ms |   4
  13 ms | █  24
  14 ms | ██████  122
  15 ms | ██████████  190
  16 ms | ██████  125
  17 ms | ███  62
  18 ms | ██  48
  19 ms | ██  34
  20 ms | █  24
  21 ms | █  10
  22 ms |   1
  23 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 223 | 116.3 | 21.45 |
| `dripping_water` | 240 | 223 | 104.4 | 19.95 |
| `dragon_breath` | 160 | 223 | 103.0 | 20.30 |
| `end_rod` | 240 | 223 | 98.8 | 18.92 |
| `portal` | 160 | 223 | 111.9 | 20.34 |
| `ALL_TOGETHER` | 1680 | 223 | 102.0 | 19.80 |
| `sculk_charge_pop` | 240 | 223 | 107.1 | 18.69 |
| `smoke` | 160 | 223 | 138.1 | 20.71 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `54.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `89.58`
- `fps_0p1pct_low` = `43.69`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `46.53`
- `particles_stage_smoke` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `109.32`, min `43.66`, p50 `116.70`, p95 `133.78`, p99 `559.16`, 1%low `46.32`, 0.1%low `43.87`, std `101.97`

**Frame time (ms)**  avg `11.16`, p50 `8.57`, p95 `18.74`, p99 `20.94`, p99.9 `22.26`, max `22.90`

**Client tick (ms)**  avg `0.65`, p95 `0.96`, max `1.34`

**Memory**  start `657 MB`, end `764 MB`, peak `827 MB`, GC `4 events / 12 ms`

**FPS over sampling window (ASCII):**

```
194.2 |                                                       █                        
185.0 |                                                       █                        
175.7 |                                                       █                        
166.4 |                      █                                █                        
157.1 |                      █                        █       █                        
147.9 |                 █   ██          █             █      ██       █                
138.6 |                 █  ███          █        █    █      ██  █    █               █
129.3 | █               █  ███          █        █    █  █   ██  █    █               █
120.1 | █   █           █  ███   █   █  █        █    █  █   ██  █    █    █          █
110.8 | █   █           █ ████   █   █  █        ██   █  █   ██  █    █ █  █          █
101.5 | █ █████  ██ █ █████████ ██ ██████ ████ █████████████ █████████████████   ██ ███
 92.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  11
   1 ms | █  12
   3 ms |   1
   6 ms |   6
   7 ms | ████████████  219
   8 ms | ████████████████████████████████████████  746
   9 ms | ████████  151
  10 ms |   1
  12 ms |   5
  13 ms | █  20
  14 ms | ████████  148
  15 ms | ████████  156
  16 ms | ███████  130
  17 ms | ████  73
  18 ms | ██  31
  19 ms | ██  34
  20 ms | ██  31
  21 ms | █  14
  22 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `43.87`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `89.60`
- `preload_duration_ms` = `57.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.32`
- `preload_chunks` = `81.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 1046 ms  |  Sample ticks: 0

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
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

