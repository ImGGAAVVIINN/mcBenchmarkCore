# FPS Test session — 2026-09-06T11:47:43.314316251+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 307.5 | 39.1 | 17.3 | 21.38 | 0.65 | 1 | 252 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 295.2 | 43.6 | 32.3 | 21.18 | 0.66 | 2 | 225 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 304.8 | 45.0 | 41.5 | 21.12 | 0.66 | 5 | 165 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 5 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `307.46`, min `14.14`, p50 `118.17`, p95 `1454.75`, p99 `1752.41`, 1%low `39.11`, 0.1%low `17.34`, std `449.82`

**Frame time (ms)**  avg `9.24`, p50 `8.46`, p95 `18.60`, p99 `21.38`, p99.9 `25.28`, max `70.71`

**Client tick (ms)**  avg `0.65`, p95 `1.04`, max `7.64`

**Memory**  start `544 MB`, end `601 MB`, peak `796 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
498.5 |                                                                      █         
469.8 |                                                                      █         
441.1 |                                              █                       █         
412.4 |                                              █                █    █ █         
383.7 |                       █  █ █    █        █   █          █  █  █    █ █         
355.0 |              █      █ █  █ █    █        █  ██ █        █  █ ██    █ █      █  
326.3 |           ██ █ █  █ █ ██ █ ██ █ ██ █   ███  █████    █  █ ██ ███ █ █ ██  █  █ █
297.6 |       ██ ███ █ █  ███ ██ ████ █ ██ █  █████████████  ██ █ ██████████████ ██ █ █
268.9 |   █ █ ██ ███ ████████ █████████ ██ █ ██████████████ ███ █ █████████████████ ███
240.2 |█ ██████████████████████████████████████████████████ ███████████████████████ ███
211.5 |█ ██████████████████████████████████████████████████ ███████████████████████████
182.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████  264
   1 ms | ███████  122
   2 ms | ████  71
   3 ms | █  23
   4 ms |   5
   6 ms |   9
   7 ms | █████████  156
   8 ms | ████████████████████████████████████████  732
   9 ms | ████████  139
  10 ms |   4
  12 ms | █  16
  13 ms | ███  46
  14 ms | ██████  118
  15 ms | ████████  143
  16 ms | ██████  101
  17 ms | ████  75
  18 ms | ██  45
  19 ms | ██  33
  20 ms | ██  34
  21 ms | █  15
  22 ms |   7
  23 ms |   2
  24 ms |   1
  25 ms |   1
  44 ms |   1
  70 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 270 | 251.0 | 21.98 |
| `sculk_charge_pop` | 240 | 270 | 298.8 | 20.84 |
| `ALL_TOGETHER` | 1680 | 270 | 327.6 | 21.28 |
| `portal` | 160 | 270 | 291.5 | 20.99 |
| `end_rod` | 240 | 270 | 341.0 | 21.37 |
| `dragon_breath` | 160 | 270 | 284.6 | 20.64 |
| `dripping_water` | 240 | 270 | 341.5 | 21.58 |
| `flame` | 160 | 270 | 318.2 | 20.76 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `39.11`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `17.34`
- `fps_harmonic_avg` = `108.17`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `103.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `295.16`, min `29.86`, p50 `118.24`, p95 `1292.07`, p99 `1463.95`, 1%low `43.59`, 0.1%low `32.29`, std `411.03`

**Frame time (ms)**  avg `9.28`, p50 `8.46`, p95 `18.35`, p99 `21.18`, p99.9 `24.12`, max `33.49`

**Client tick (ms)**  avg `0.66`, p95 `0.95`, max `1.23`

**Memory**  start `631 MB`, end `725 MB`, peak `856 MB`, GC `2 events / 6 ms`

**FPS over sampling window (ASCII):**

```
401.6 |                                                                         █      
382.9 |                                                                         █      
364.1 |           █                                                  █          █   █  
345.3 |           █      ███        █                 █ █            █          █   █  
326.5 |      █    ██     ███      █ █ █   ███ █       █ █   █   ██  ██  ███  █  █   ██ 
307.7 |   █  █ █████ ███ ███   █  █ █ █ █ ███ █ █     █ █   █  ███████  ███  ██ █ █ ██ 
288.9 | █ █  █ █████ ███ ███  ███ █ █ ███████ █ █    ██ █ █ █ ████████  ████ ██ █ ████ 
270.1 | ████ █ █████████ ███ ████ █ █ █████████ █ █  ██ █████ █████████ ████ ██ ███████
251.3 |█████ █ █████████████ ██████ ███████████ █ ██████████████████████████ ██ ███████
232.6 |████████████████████████████ ████████████████████████████████████████ ██████████
213.8 |████████████████████████████ ███████████████████████████████████████████████████
195.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████  289
   1 ms | ██████  114
   2 ms | ███  55
   3 ms |   9
   4 ms |   1
   5 ms |   1
   6 ms |   5
   7 ms | █████████  161
   8 ms | ████████████████████████████████████████  737
   9 ms | ████████  139
  10 ms |   2
  12 ms |   5
  13 ms | ██  36
  14 ms | █████  100
  15 ms | █████████  165
  16 ms | ███████  122
  17 ms | █████  86
  18 ms | ██  38
  19 ms | ██  34
  20 ms | ██  31
  21 ms | █  14
  22 ms |   5
  23 ms |   3
  24 ms |   1
  28 ms |   1
  33 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `43.59`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `45.00`
- `fps_harmonic_avg` = `107.77`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `32.29`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `304.84`, min `40.22`, p50 `118.15`, p95 `1308.13`, p99 `1547.41`, 1%low `44.95`, 0.1%low `41.46`, std `424.66`

**Frame time (ms)**  avg `9.25`, p50 `8.46`, p95 `18.48`, p99 `21.12`, p99.9 `23.13`, max `24.86`

**Client tick (ms)**  avg `0.66`, p95 `0.95`, max `1.50`

**Memory**  start `697 MB`, end `433 MB`, peak `863 MB`, GC `5 events / 15 ms`

**FPS over sampling window (ASCII):**

```
416.2 |                                       █   █                                █   
395.1 |      █                            █   █   █         █                      █ █ 
374.0 |      █                            █   █ █ █         █    █            █    █ █ 
352.9 |      █ ██     █           █       █   █ █ ██        █    █            █    █ █ 
331.8 |   █  █ ██  ██ █   █       █    █  █ █ ███ ███       █    █           ██    █ █ 
310.7 |████  █ ██  ██ ███ █   ██  █  ██████ █ ███████  █ █  ██   █       █ █ ████  █ █ 
289.6 |████  █ ██████ ███ █   ██  █  ██████ █ ███████  ███ ████ ██ ██    █ ██████ █████
268.5 |████  █ ██████████ ██ ███  █ ███████ ██████████ ███████████████ █ █ ████████████
247.4 |████ ██ ██████████ ██ ██████████████ ██████████ ███████████████████ ████████████
226.3 |██████████████████ █████████████████ ███████████████████████████████████████████
205.2 |██████████████████ █████████████████████████████████████████████████████████████
184.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████  305
   1 ms | ██████  118
   2 ms | ██  45
   3 ms | █  12
   4 ms |   1
   5 ms |   1
   6 ms |   5
   7 ms | █████████  158
   8 ms | ████████████████████████████████████████  741
   9 ms | ███████  133
  10 ms |   1
  11 ms |   1
  12 ms |   5
  13 ms | ██  30
  14 ms | █████  93
  15 ms | ████████  155
  16 ms | ███████  137
  17 ms | ████  83
  18 ms | ███  54
  19 ms | ██  38
  20 ms | █  21
  21 ms | █  14
  22 ms |   8
  23 ms |   3
  24 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `44.95`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `23.00`
- `fps_harmonic_avg` = `108.12`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `41.46`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 9594 ms  |  Sample ticks: 0

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

- `aborted_state` = `SAMPLING`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed ESC`
- `status` = `failed`
- `part` = `1.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 12036 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `part_label` = `Main Benchmark (no shaders)`
- `fail_reason` = `user pressed Shift+ESC`
- `status` = `failed`
- `part` = `1.00`

