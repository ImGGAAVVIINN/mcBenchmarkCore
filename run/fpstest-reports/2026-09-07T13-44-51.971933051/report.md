# FPS Test session — 2026-09-07T13:47:24.657009922+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 112.1 | 46.3 | 41.5 | 20.41 | 0.62 | 3 | 136 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 112.3 | 46.1 | 43.8 | 20.77 | 0.64 | 4 | 369 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 111.6 | 46.4 | 44.5 | 20.87 | 0.64 | 2 | 180 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 109.1 | 22.7 | 21.1 | 41.17 | 0.66 | 7 | 195 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Pigs ×250 ring](#pigs-250-ring)
- [Villagers ×100 ring](#villagers-100-ring)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `112.09`, min `38.98`, p50 `118.16`, p95 `133.25`, p99 `142.47`, 1%low `46.33`, 0.1%low `41.49`, std `78.33`

**Frame time (ms)**  avg `10.18`, p50 `8.46`, p95 `17.73`, p99 `20.41`, p99.9 `22.20`, max `25.66`

**Client tick (ms)**  avg `0.62`, p95 `0.94`, max `7.59`

**Memory**  start `567 MB`, end `704 MB`, peak `704 MB`, GC `3 events / 14 ms`

**FPS over sampling window (ASCII):**

```
197.2 |                                          █                                     
188.7 |                                          █                                     
180.2 |                                          █                                     
171.7 |                                          █                                     
163.3 |                                          █                                     
154.8 |                                          █     █           █         █         
146.3 |                █                 █       █     █    █      █         █         
137.8 |                █  █              █       █     █    █      █         █         
129.3 |                █  █   █          █       █     █    █      █         █         
120.8 |                █  █   █          █       █     █    █      █         █         
112.4 |████  █  █  █   ██ █   ██  █  █   █ █  █  █  █  █  █ ██    ██ █  █  █ ██    █  █
103.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   8
   1 ms |   3
   4 ms |   1
   6 ms |   8
   7 ms | ███████████  287
   8 ms | ████████████████████████████████████████  1011
   9 ms | ████████  209
  10 ms |   1
  12 ms |   1
  13 ms |   11
  14 ms | ██  40
  15 ms | █████  121
  16 ms | █████  119
  17 ms | ██  55
  18 ms | █  36
  19 ms | █  27
  20 ms |   11
  21 ms |   11
  22 ms |   3
  25 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 245 | 107.8 | 19.76 |
| `portal` | 160 | 245 | 114.3 | 20.53 |
| `ALL_TOGETHER` | 1680 | 245 | 109.2 | 18.44 |
| `sculk_charge_pop` | 240 | 245 | 110.1 | 19.15 |
| `smoke` | 160 | 245 | 119.5 | 20.68 |
| `flame` | 160 | 245 | 115.5 | 21.12 |
| `dripping_water` | 240 | 245 | 111.1 | 19.76 |
| `dragon_breath` | 160 | 245 | 109.1 | 19.52 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `24.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `98.19`
- `fps_0p1pct_low` = `41.49`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `46.33`
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

**FPS**  avg `112.33`, min `43.61`, p50 `117.75`, p95 `133.43`, p99 `143.01`, 1%low `46.08`, 0.1%low `43.82`, std `79.55`

**Frame time (ms)**  avg `10.22`, p50 `8.49`, p95 `17.65`, p99 `20.77`, p99.9 `22.39`, max `22.93`

**Client tick (ms)**  avg `0.64`, p95 `1.01`, max `1.33`

**Memory**  start `456 MB`, end `525 MB`, peak `826 MB`, GC `4 events / 10 ms`

**FPS over sampling window (ASCII):**

```
196.0 |                                               █                                
187.6 |                                               █                                
179.1 |                                               █                                
170.7 |                                               █                                
162.2 |                                               █                                
153.8 |                              █                █                          █     
145.4 |                         █   ██        ██      █                   █      █     
136.9 |                         ██  ██        ██      █              █    █      █     
128.5 |                         ██  ██        ██      █              █    █      █     
120.0 |                         ██  ██        ██      █              █    █ █    █     
111.6 |  █  █  █   █  █  █ ██  ████ ██ ██ ██ ███   ██ █     ██ █   █ ██ █ ███ █  █     
103.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   8
   1 ms |   4
   2 ms |   1
   5 ms |   1
   6 ms |   6
   7 ms | ████████████  298
   8 ms | ████████████████████████████████████████  988
   9 ms | █████████  215
  13 ms |   5
  14 ms | █  34
  15 ms | █████  115
  16 ms | █████  113
  17 ms | ████  87
  18 ms | █  33
  19 ms |   12
  20 ms | █  20
  21 ms |   12
  22 ms |   5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `97.84`
- `preload_duration_ms` = `58.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.08`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `43.82`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `111.61`, min `44.01`, p50 `118.01`, p95 `132.91`, p99 `139.70`, 1%low `46.44`, 0.1%low `44.53`, std `74.60`

**Frame time (ms)**  avg `10.23`, p50 `8.47`, p95 `17.79`, p99 `20.87`, p99.9 `22.13`, max `22.72`

**Client tick (ms)**  avg `0.64`, p95 `0.90`, max `1.40`

**Memory**  start `654 MB`, end `804 MB`, peak `834 MB`, GC `2 events / 4 ms`

**FPS over sampling window (ASCII):**

```
148.5 |                    █      █    █         █      █                           █  
144.5 |                    █      █    █  █      █      █                           █  
140.4 |           █        █      █    █  █      █      █                           █  
136.3 |           █        █      █ █  █  █      █      █                           █  
132.2 |           █        █      █ █  █  █      █      █                           █  
128.1 |           █        █      █ █  █  █      █     ██                           █  
124.0 |   █       █        █  █   █ █  █  █      █     ██                           █  
119.9 |   █       █        █  █   █ █  █  █      █     ██                           █  
115.8 |   █       █        █  █   █ █  █  █      █     ██                           █  
111.7 |   ██  █   █ █  █  ██  █   █ █  █  █ █  █ ██  █ ██  █     █                █ ██ 
107.6 | ████  █  ██ █  █  ██ ██ ███████████ █  █ ██  █ ██  █  ██ █ ██   █  █████  █ ██ 
103.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   7
   1 ms |   5
   6 ms |   4
   7 ms | ████████████  294
   8 ms | ████████████████████████████████████████  1002
   9 ms | ████████  204
  10 ms |   2
  13 ms |   3
  14 ms | ██  42
  15 ms | ████  103
  16 ms | █████  128
  17 ms | ███  74
  18 ms | █  33
  19 ms | █  16
  20 ms | █  21
  21 ms |   12
  22 ms |   4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `97.71`
- `preload_duration_ms` = `57.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.44`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `44.53`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `109.11`, min `20.66`, p50 `117.47`, p95 `136.53`, p99 `148.83`, 1%low `22.74`, 0.1%low `21.12`, std `68.46`

**Frame time (ms)**  avg `11.29`, p50 `8.51`, p95 `21.03`, p99 `41.17`, p99.9 `46.13`, max `48.40`

**Client tick (ms)**  avg `0.66`, p95 `0.86`, max `1.02`

**Memory**  start `694 MB`, end `386 MB`, peak `890 MB`, GC `7 events / 17 ms`

**FPS over sampling window (ASCII):**

```
143.7 |                                  █          █                      █           
133.1 | █    ██   █              █      ██   █  █   █              █       ██          
122.6 | █ █  ██   █           █  █      ██ █ █  █   █              █       ██    █     
112.0 | ████ ███ ██ █ █ █ ██ ██ ████ █ ███████████ ███ █ █ █ ██ █ ███ ██ █ ███  ███    
101.5 |█████████████████████████████████████████████████████████████████████████████   
 90.9 |█████████████████████████████████████████████████████████████████████████████   
 80.3 |█████████████████████████████████████████████████████████████████████████████   
 69.8 |█████████████████████████████████████████████████████████████████████████████   
 59.2 |█████████████████████████████████████████████████████████████████████████████   
 48.7 |█████████████████████████████████████████████████████████████████████████████   
 38.1 |██████████████████████████████████████████████████████████████████████████████  
 27.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  16
   2 ms |   1
   6 ms | █  13
   7 ms | ████████████  254
   8 ms | ████████████████████████████████████████  836
   9 ms | █████████  196
  10 ms |   2
  13 ms |   4
  14 ms | ██  46
  15 ms | ████  93
  16 ms | ████  89
  17 ms | ███  60
  18 ms | █  29
  19 ms | █  18
  20 ms | █  23
  21 ms | █  14
  22 ms |   3
  23 ms |   1
  32 ms | █  16
  33 ms | █  14
  34 ms | █  14
  35 ms |   1
  36 ms |   1
  38 ms |   2
  40 ms |   4
  41 ms |   4
  42 ms |   1
  43 ms |   5
  44 ms |   5
  45 ms |   1
  46 ms |   2
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `88.57`
- `preload_duration_ms` = `51.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `22.74`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.12`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 15252 ms  |  Sample ticks: 0

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
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `part` = `1.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 995 ms  |  Sample ticks: 0

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

