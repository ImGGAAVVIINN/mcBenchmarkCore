# MC Benchmark Core session — 2026-09-14T20:56:20.024675261+10:00

- MinecraftClient: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.2.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 140.9 | 32.8 | 18.1 | 22.08 | 1.09 | 0 | 432 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 163.7 | 40.5 | 27.5 | 18.97 | 1.11 | 1 | 636 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 144.6 | 28.4 | 25.9 | 34.58 | 1.07 | 4 | 188 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 160.2 | 46.1 | 33.2 | 19.28 | 1.10 | 2 | 543 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 165.5 | 39.3 | 30.1 | 19.36 | 1.14 | 1 | 192 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 30.0 | 28.8 | 28.7 | 34.66 | 0.90 | 0 | 364 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 15 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 16 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 17 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 18 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 21 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 22 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 23 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 24 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 25 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 26 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 27 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 28 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 29 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 31 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 32 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 33 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 34 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 35 | [Savanna flyby](#savanna-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 37 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 38 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 39 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 40 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 197.0 | 41.6 | 28.0 | 20.97 | 0.80 | 1 | 12 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 136.0 | 25.6 | 19.9 | 35.19 | 1.22 | 25 | 763 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 31.9 | 19.0 | 15.6 | 49.91 | 6.44 | 17 | 152 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 30.0 | 25.3 | 20.3 | 36.25 | 1.12 | 16 | 729 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 26.9 | 8.8 | 8.4 | 111.43 | 6.45 | 15 | 63 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Pigs ×250 ring](#pigs-250-ring)
- [Villagers ×100 ring](#villagers-100-ring)
- [Chickens ×300 ring](#chickens-300-ring)
- [Chickens ×300 ring](#chickens-300-ring)
- [XP orbs ×500 ring](#xp-orbs-500-ring)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Savanna flyby](#savanna-flyby)
- [Savanna flyby](#savanna-flyby)
- [Savanna flyby](#savanna-flyby)
- [Savanna flyby](#savanna-flyby)
- [Savanna flyby](#savanna-flyby)
- [Savanna flyby](#savanna-flyby)
- [Idle Baseline](#idle-baseline)
- [Idle Baseline](#idle-baseline)
- [Idle Baseline](#idle-baseline)
- [Idle Baseline](#idle-baseline)
- [Idle Baseline](#idle-baseline)
- [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators)
- [LowEnd Shader](#lowend-shader)
- [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures)
- [HighEnd Shader](#highend-shader)
- [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `140.93`, min `16.56`, p50 `118.31`, p95 `143.57`, p99 `1544.57`, 1%low `32.83`, 0.1%low `18.09`, std `282.88`

**Frame time (ms)**  avg `9.97`, p50 `8.45`, p95 `18.12`, p99 `22.08`, p99.9 `48.75`, max `60.38`

**Client tick (ms)**  avg `1.09`, p95 `1.41`, max `2.72`

**Memory**  start `1532 MB`, end `1964 MB`, peak `1964 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
388.4 |                                                           █                    
360.2 |                                                           █                    
332.1 |                    █                                      █                    
304.0 |               █    █                                      ██                   
275.8 |       █       █  █ █                                      ██                   
247.7 |       █       █  █ ██ █                                 █ ██                   
219.6 |    █  █ ██    █  ████ █                            █    █ ██                   
191.4 |  █ ████ ██   ██  ████ █                            █    █ ██                   
163.3 |  █ ████ ██   ██  ████ █                            █    █ ██          █        
135.2 |███ ████ ███ █████████ █         █                █████ ██ ██          █       █
107.0 |████████████████████████████████████████        ██████████████         ███   ███
 78.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  22
   1 ms |   9
   2 ms |   6
   3 ms |   7
   4 ms |   9
   5 ms |   6
   6 ms | ██  49
   7 ms | █████████  231
   8 ms | ████████████████████████████████████████  987
   9 ms | ███████████  276
  10 ms | █  26
  11 ms |   12
  12 ms |   8
  13 ms |   12
  14 ms | █  16
  15 ms | ██  53
  16 ms | ████  93
  17 ms | ███  80
  18 ms | █  36
  19 ms | █  26
  20 ms |   11
  21 ms |   10
  22 ms |   8
  23 ms |   3
  25 ms |   1
  26 ms |   1
  28 ms |   1
  31 ms |   1
  32 ms |   2
  45 ms |   1
  48 ms |   1
  50 ms |   1
  60 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `portal` | 160 | 250 | 181.6 | 19.23 |
| `ALL_TOGETHER` | 1680 | 250 | 183.7 | 16.53 |
| `sculk_charge_pop` | 240 | 250 | 164.1 | 18.25 |
| `smoke` | 160 | 250 | 117.4 | 18.02 |
| `flame` | 160 | 250 | 89.8 | 21.18 |
| `dripping_water` | 240 | 250 | 174.3 | 17.46 |
| `dragon_breath` | 160 | 250 | 109.6 | 23.26 |
| `end_rod` | 240 | 250 | 107.5 | 22.11 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `18.09`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `32.83`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `45.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `100.31`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `163.70`, min `27.41`, p50 `118.88`, p95 `192.61`, p99 `1838.20`, 1%low `40.47`, 0.1%low `27.48`, std `260.67`

**Frame time (ms)**  avg `8.59`, p50 `8.41`, p95 `12.98`, p99 `18.97`, p99.9 `31.46`, max `36.49`

**Client tick (ms)**  avg `1.11`, p95 `1.39`, max `1.64`

**Memory**  start `2126 MB`, end `1366 MB`, peak `2762 MB`, GC `1 events / 25 ms`

**FPS over sampling window (ASCII):**

```
350.7 |                                 █                                              
329.4 |                                 █                                              
308.1 |                                 █                                              
286.8 |                                 █                        █                     
265.5 |          █                      ██                       █            █        
244.2 |█         █                      ██          █            █ █          █        
222.9 |█         █ █               ██  ███          █            █ █   █      █        
201.6 |█         ███ █      █      ██  ███          █            █ █   █      █        
180.3 |█    █ █ ████ █     ██     ███ ████ █        █ ██ ██ █    █ █   █ █   ██ █  █ ██
159.0 |████████ ████ █     ██     ███ ████ █        █ ███████    █ █ ███ █   ██ █  █ ██
137.7 |█████████████ █     ██ █   ████████ █     █  ██████████  ██ █████ █  █████ ██ ██
116.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  62
   1 ms |   14
   2 ms |   6
   3 ms |   12
   4 ms | █  21
   5 ms | █  20
   6 ms | ██  51
   7 ms | █████████  302
   8 ms | ████████████████████████████████████████  1307
   9 ms | ███████████  353
  10 ms | █  30
  11 ms |   15
  12 ms | █  18
  13 ms |   10
  14 ms |   8
  15 ms | █  21
  16 ms | █  29
  17 ms | █  17
  18 ms |   7
  19 ms |   9
  20 ms |   2
  21 ms |   2
  23 ms |   1
  24 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   3
  30 ms |   1
  31 ms |   1
  36 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `40.47`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `27.48`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `116.35`
- `preload_duration_ms` = `57.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `144.55`, min `23.83`, p50 `118.36`, p95 `214.99`, p99 `1194.58`, 1%low `28.44`, 0.1%low `25.91`, std `179.78`

**Frame time (ms)**  avg `10.43`, p50 `8.45`, p95 `32.71`, p99 `34.58`, p99.9 `35.24`, max `41.96`

**Client tick (ms)**  avg `1.07`, p95 `1.30`, max `1.86`

**Memory**  start `1262 MB`, end `563 MB`, peak `1450 MB`, GC `4 events / 30 ms`

**FPS over sampling window (ASCII):**

```
226.0 |              █                                                                 
208.1 |          █  ██ █ █       █    █   ██        █     █         █       █          
190.3 |    █     █  ████ █       █   ██   ██  █     █    ██     █   █      ██          
172.5 |    █     █  ████ ███   █ █  ███   ██  █     █    ██    ██   █    █ ██   █      
154.7 |█   █ █ ███  ██████████████ ████ █ ██  █     ███  ██    ██   █    █ ███  █      
136.9 |█   █ █ ████ ██████████████ ████ █ ██  █     ███  ████  ██   █   ██████  █      
119.1 |█████████████████████████████████████████████████████████████████████████████   
101.3 |█████████████████████████████████████████████████████████████████████████████   
 83.4 |█████████████████████████████████████████████████████████████████████████████   
 65.6 |█████████████████████████████████████████████████████████████████████████████   
 47.8 |██████████████████████████████████████████████████████████████████████████████  
 30.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  44
   1 ms | █  21
   2 ms |   9
   3 ms | █  12
   4 ms | █  15
   5 ms | █  14
   6 ms | ██  46
   7 ms | ███████████  250
   8 ms | ████████████████████████████████████████  939
   9 ms | ███████████  254
  10 ms | █  32
  11 ms | █  16
  12 ms |   10
  13 ms | █  12
  14 ms | █  18
  15 ms | █  19
  16 ms | █  16
  17 ms | █  16
  18 ms | █  15
  19 ms |   6
  20 ms |   3
  21 ms |   1
  22 ms |   2
  26 ms |   1
  27 ms |   2
  30 ms |   1
  31 ms |   3
  32 ms | ██  47
  33 ms | ██  44
  34 ms | ██  42
  35 ms |   3
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `28.44`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `25.91`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `95.85`
- `preload_duration_ms` = `39.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `160.25`, min `32.90`, p50 `118.75`, p95 `306.09`, p99 `1147.02`, 1%low `46.11`, 0.1%low `33.18`, std `196.16`

**Frame time (ms)**  avg `8.67`, p50 `8.42`, p95 `16.02`, p99 `19.28`, p99.9 `28.01`, max `30.40`

**Client tick (ms)**  avg `1.10`, p95 `1.32`, max `1.51`

**Memory**  start `793 MB`, end `819 MB`, peak `1337 MB`, GC `2 events / 13 ms`

**FPS over sampling window (ASCII):**

```
225.1 |                                     █                                          
215.4 |                                     █                  █                       
205.8 |                                    ███                 █                       
196.1 |                 █                  ███  █         █    █              █        
186.5 |                 ██ █        ██     ███  ██     █ ██    █ █ █       █  █   █ ██ 
176.8 |      ██       ████ █        ██   █ ███  ███   ██ ██    █ ████  █   █  █   ████ 
167.2 |      ██       ████ █  █     ██   █ ███  ███   ██ ██ █  █ ████  █   █  █ █ ████ 
157.5 |  ██ ███ █ ██ █████ █ ████   ██ █ █ ███  ███   █████ █  █ ████ ██ ███  █ █ █████
147.8 |████ ███ █ ████████ ███████ ███ █ ██████ ███   █████ ██ █ ████ ██ ███  █ █ █████
138.2 |████ ███ █ ████████ ███████ ███ █ ██████ ███   █████ ████ ███████ ███  █ █ █████
128.5 |████ ███ █ ████████ ███████ ███ █ ██████ ███  ██████ ████ ███████ ███  █ █ █████
118.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  68
   1 ms | █  37
   2 ms |   9
   3 ms | █  21
   4 ms | █  31
   5 ms | █  19
   6 ms | ██  57
   7 ms | ███████████  312
   8 ms | ████████████████████████████████████████  1176
   9 ms | ███████████  330
  10 ms | █  39
  11 ms | █  18
  12 ms | █  18
  13 ms |   11
  14 ms | █  19
  15 ms | █  25
  16 ms | █  40
  17 ms | █  34
  18 ms | █  17
  19 ms |   11
  20 ms |   10
  21 ms |   1
  22 ms |   1
  24 ms |   1
  29 ms |   2
  30 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `46.11`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `33.18`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `115.40`
- `preload_duration_ms` = `51.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `165.49`, min `30.08`, p50 `118.84`, p95 `217.69`, p99 `1794.53`, 1%low `39.29`, 0.1%low `30.09`, std `266.06`

**Frame time (ms)**  avg `8.65`, p50 `8.41`, p95 `14.79`, p99 `19.36`, p99.9 `31.60`, max `33.24`

**Client tick (ms)**  avg `1.14`, p95 `1.38`, max `1.74`

**Memory**  start `1124 MB`, end `1293 MB`, peak `1316 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
257.8 |        █                                                                    █  
245.0 |        █              █                        █                         █  █  
232.2 |        █              █      █       █         ██                        █  █  
219.4 |        █  █        █  █      █       █         ██                  █   ███  █  
206.6 |        █  █       ██  █      █       █         ██                 ██  ████  █  
193.8 |  █     █  █       ██  █    █ █       █     █   ██          █      ██  ████  █  
181.0 |█ █    ██  █       ██  █   ██ █      ███  █ █  ███  █ █ █ █ █ ██   ██  ████ ██  
168.2 |█ █    ██  █   █   ██ ███  ██████    ██████ █ ████  █ █ █ █ █████  ██  ████ ██  
155.4 |█ █    ██  █   █   ██ ███  ██████    ██████ █ ████  █ █ █ █ █████  ██  ████ ██  
142.6 |█ █    ██  █   █   ██ ███  ██████    ██████ █ ████  █ █ █ █ █████  ██  ████ ██  
129.8 |█ █ █ ███  █  ██   ██ ███ ████████ █ ██████ ██████  ███ ███ █████  ██  ████ ██  
117.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  63
   1 ms |   9
   2 ms |   12
   3 ms |   15
   4 ms | █  36
   5 ms | █  19
   6 ms | ██  73
   7 ms | ████████  263
   8 ms | ████████████████████████████████████████  1280
   9 ms | ██████████  333
  10 ms | █  40
  11 ms | █  17
  12 ms |   9
  13 ms |   15
  14 ms | █  21
  15 ms | █  24
  16 ms | █  23
  17 ms | █  23
  18 ms |   10
  19 ms |   9
  20 ms |   5
  21 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   2
  29 ms |   1
  30 ms |   2
  31 ms |   3
  33 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `39.29`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `30.09`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `115.63`
- `preload_duration_ms` = `53.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `29.95`, min `28.75`, p50 `29.98`, p95 `30.88`, p99 `30.99`, 1%low `28.82`, 0.1%low `28.75`, std `0.67`

**Frame time (ms)**  avg `33.40`, p50 `33.35`, p95 `34.49`, p99 `34.66`, p99.9 `34.74`, max `34.78`

**Client tick (ms)**  avg `0.90`, p95 `1.01`, max `1.17`

**Memory**  start `611 MB`, end `975 MB`, peak `975 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 30.2 |                                                                   █            
 30.1 |                  █                        █              █        █            
 30.1 |            █     █  █           █     █   █           █  █  █     █     █      
 30.1 |     █   █  █  █  █  █  █  █  █  █  █  █   █  █  █  █  █  █  █  █  █  █  █  █   
 30.0 |  █  █   █  █  █  █  █  █  █ ██  █  █  █   █  █  █  █  █  █  █  █  █  █  █  █   
 30.0 | ██  █   █  █ ██  █  █ ██ ██ ██  █  █  █   █ ██  █  █  █  █  █  █  █  █  █  █   
 30.0 | ██ ███ ██ ██ ██  █ ██ ██ ██ ██ ██ ██ ██   █ ██ ██ ██ ██  █  █  █  █ ██  █ ███ █
 29.9 | ██ ███ ██ ██ ██  █ ██ ██ ██ ██ ██ ██ ██  ██ ██ ██ ██ ██  █ ██ ██  █ ██ ██ ███ █
 29.9 | ██ ███ ██ ██ ██ ██ ██ ██ ██ ██ ██ ██ ██ ███ ██ ██ ██ ██ ██ ██ ██ ██ ██ ██ ███ █
 29.9 |███████ ██ ██ █████ ██ ██ ██ ██ ██ ██ ██████ ██ ███████████ ██ ████████ ██ ███ █
 29.8 |█████████████████████████ ██ █████ █████████ ███████████████████████████████████
 29.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms |   1
  32 ms | ████████████████████████████████████████  203
  33 ms | ███████████████████████████████████████  198
  34 ms | ███████████████████████████████████████  196
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `28.82`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `28.75`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `68.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 15748 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 17934 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 1805 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 2051 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 3778 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 5201 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 6907 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 8702 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 10537 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 12183 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 13918 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 15650 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 17378 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 19182 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 20991 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 22650 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 24454 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 28871 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 32234 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 35269 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 37940 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 41049 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 44748 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 1365 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 4458 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 7481 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 10241 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 13216 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 16577 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 546 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 2416 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 4050 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 6111 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 8107 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `196.99`, min `23.98`, p50 `118.79`, p95 `213.32`, p99 `2932.18`, 1%low `41.62`, 0.1%low `27.99`, std `454.71`

**Frame time (ms)**  avg `8.88`, p50 `8.42`, p95 `17.02`, p99 `20.97`, p99.9 `27.95`, max `41.70`

**Client tick (ms)**  avg `0.80`, p95 `0.99`, max `2.88`

**Memory**  start `1542 MB`, end `1314 MB`, peak `1554 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
366.5 |                           █                                                    
340.6 |                        █  █                █         █ █           █           
314.8 |           █            █  █                █     █   █ █       █   █   █       
288.9 |         █ █    ██      █ ██                █    ██   █ █       █   █   █       
263.1 |         █ █    ██      █ ███         █   █ █  █ ██   █ █       █ █ █   █       
237.2 |      ██ █ ██   ███   █ █████         █   █ █  █ ███ ██ █    █  █ █ █   █    █  
211.4 |      ██ █ ████████   █ █████     ██  █   █ █  █ ███ ████    ██ █ █ █   █    █ █
185.5 |      ████ █████████  █ █████     ██  ██  █ █  █ ███ ████    ██ █ ███ █ █    █ █
159.7 |      ████ █████████ ██ █████  █  ██ ███  █ █  █ ███ ████    ██ █ ███ █ █    ███
133.8 |    ██████ █████████ ██ ██████ █ ███ ███ ██ █ ██████ █████  █████ ███ █ █ █ ████
108.0 |█   ████████████████████████████████████████████████████████████████████████████
 82.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  71
   1 ms |   9
   2 ms |   9
   3 ms |   12
   4 ms | █  22
   5 ms |   15
   6 ms | █  22
   7 ms | ██████████  311
   8 ms | ████████████████████████████████████████  1211
   9 ms | ██████████  314
  10 ms | █  33
  11 ms | █  21
  12 ms | █  17
  13 ms | █  19
  14 ms | █  18
  15 ms |   14
  16 ms | █  20
  17 ms | █  31
  18 ms | █  34
  19 ms |   13
  20 ms |   13
  21 ms |   11
  22 ms |   2
  23 ms |   2
  24 ms |   1
  25 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `112.56`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `27.99`
- `seed` = `8053.00`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `1152.00`
- `fps_1pct_low` = `41.62`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194876 ms  |  Sample ticks: 3600

**FPS**  avg `136.01`, min `17.02`, p50 `113.73`, p95 `257.44`, p99 `1458.66`, 1%low `25.60`, 0.1%low `19.92`, std `250.00`

**Frame time (ms)**  avg `15.23`, p50 `8.79`, p95 `34.34`, p99 `35.19`, p99.9 `43.69`, max `58.74`

**Client tick (ms)**  avg `1.22`, p95 `1.61`, max `7.55`

**Memory**  start `1142 MB`, end `1638 MB`, peak `1905 MB`, GC `25 events / 181 ms`

**FPS over sampling window (ASCII):**

```
306.0 |                                                                    █           
280.9 |                                                                    █           
255.8 |         █                                                          ██          
230.7 |         █ █                                                    █   ██          
205.6 |         ███                          █                        ███  ███         
180.5 |█        ████               ███ █ █   █   █ █      █████     █ ███  ███         
155.4 |██████ █ ████             █████████████████████████████████████████ ████        
130.3 |█████████████             ██████████████████████████████████████████████        
105.2 |█████████████            ███████████████████████████████████████████████        
 80.1 |██████████████           ███████████████████████████████████████████████        
 55.0 |██████████████           ███████████████████████████████████████████████        
 29.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  226
   1 ms | ██  196
   2 ms | █  92
   3 ms | █  93
   4 ms | █  122
   5 ms | ██  154
   6 ms | ███  313
   7 ms | ████████████  1113
   8 ms | ████████████████████████████████████████  3853
   9 ms | █████████████  1245
  10 ms | ███  282
  11 ms | ██  152
  12 ms | █  114
  13 ms | █  94
  14 ms | █  75
  15 ms | █  101
  16 ms | █  85
  17 ms | █  111
  18 ms | █  94
  19 ms | █  68
  20 ms |   38
  21 ms |   48
  22 ms |   23
  23 ms |   22
  24 ms |   24
  25 ms |   15
  26 ms |   11
  27 ms |   4
  28 ms |   15
  29 ms |   20
  30 ms |   29
  31 ms | █  108
  32 ms | ████████  818
  33 ms | ████████████  1152
  34 ms | ████████  762
  35 ms | █  66
  36 ms |   16
  37 ms |   13
  38 ms |   9
  39 ms |   7
  40 ms |   6
  41 ms |   8
  42 ms |   3
  43 ms |   8
  44 ms |   1
  46 ms |   1
  47 ms |   1
  48 ms |   1
  51 ms |   1
  52 ms |   1
  53 ms |   1
  54 ms |   1
  58 ms |   2
```

**Extras:**

- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `fps_0p1pct_low` = `19.92`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `65.66`
- `fps_1pct_low` = `25.60`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `20.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`
- `iris_present` = `0.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195797 ms  |  Sample ticks: 3600

**FPS**  avg `31.91`, min `12.95`, p50 `29.25`, p95 `50.50`, p99 `61.77`, 1%low `18.95`, 0.1%low `15.63`, std `9.20`

**Frame time (ms)**  avg `33.43`, p50 `34.19`, p95 `44.26`, p99 `49.91`, p99.9 `57.75`, max `77.22`

**Client tick (ms)**  avg `6.44`, p95 `7.60`, max `27.56`

**Memory**  start `1824 MB`, end `1515 MB`, peak `1977 MB`, GC `17 events / 68 ms`

**FPS over sampling window (ASCII):**

```
 36.1 |                                            █                                   
 35.6 |                                            █                                   
 35.2 |                                            █                                   
 34.7 |                                            █                                   
 34.3 |                                            █                                   
 33.8 |                                            █                                   
 33.3 |                                      █     ██                                  
 32.9 |                                  █   ██    ██          █                       
 32.4 | ██ ███                 █  ██  █  █ █ ████  ██          █                     █ 
 32.0 | ██████ ██       ██ ██████████ █ ████ ████████  █     ████   ██  █ █ ██ █     ██
 31.5 | █████████ █ ██████ █████████████████████████████ █████████ ███ ███████████   ██
 31.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms |   1
   8 ms |   2
   9 ms |   1
  10 ms |   1
  11 ms |   1
  12 ms |   3
  13 ms |   3
  14 ms | █  10
  15 ms | █  25
  16 ms | ██  42
  17 ms | ███  56
  18 ms | ████  64
  19 ms | ████  75
  20 ms | ████  71
  21 ms | █████  81
  22 ms | ██████  95
  23 ms | █████  85
  24 ms | ██████  99
  25 ms | ███████  125
  26 ms | ███████████████████████████  459
  27 ms | ████████████████████████  413
  28 ms | ██████████  165
  29 ms | █████  91
  30 ms | ███  55
  31 ms | ███████  121
  32 ms | █████████████  219
  33 ms | ████████████████  274
  34 ms | ██████████████  230
  35 ms | ██████████  168
  36 ms | ████████  130
  37 ms | ██████████  165
  38 ms | ████████████████  266
  39 ms | ████████████████████████████████████████  675
  40 ms | ████████████████████████████████  542
  41 ms | ████████  131
  42 ms | █████  84
  43 ms | ████  72
  44 ms | ███  58
  45 ms | ███  44
  46 ms | ██  38
  47 ms | ██  40
  48 ms | ██  34
  49 ms | █  20
  50 ms | █  18
  51 ms | █  14
  52 ms |   7
  53 ms |   4
  55 ms |   1
  57 ms |   2
  59 ms |   2
  60 ms |   1
  63 ms |   1
  77 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `fps_0p1pct_low` = `15.63`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `fps_1pct_low` = `18.95`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `73.00`
- `iris_present` = `0.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193096 ms  |  Sample ticks: 3600

**FPS**  avg `29.97`, min `18.21`, p50 `29.97`, p95 `31.13`, p99 `31.82`, 1%low `25.33`, 0.1%low `20.29`, std `1.30`

**Frame time (ms)**  avg `33.42`, p50 `33.37`, p95 `34.75`, p99 `36.25`, p99.9 `45.24`, max `54.91`

**Client tick (ms)**  avg `1.12`, p95 `1.39`, max `13.60`

**Memory**  start `1277 MB`, end `1062 MB`, peak `2006 MB`, GC `16 events / 57 ms`

**FPS over sampling window (ASCII):**

```
 30.7 |                 █                                                              
 30.6 |                 █                                                              
 30.6 |                 █                                                              
 30.5 |                 █                                                              
 30.4 |                 █                                                              
 30.3 |                 █                                                              
 30.2 |                 █                                                              
 30.2 |                 █                                                              
 30.1 |    █            █         █                  █                                 
 30.0 | █  ██           █         █      █       █   █  █ █ █    █   █    █ █ █        
 29.9 |█████████████████████████████████ █████ ████ ████████████ ██████████████████████
 29.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms |   1
  16 ms |   1
  19 ms |   1
  20 ms |   1
  21 ms |   1
  23 ms |   1
  24 ms |   1
  25 ms |   2
  26 ms |   3
  27 ms |   1
  28 ms |   2
  29 ms |   12
  30 ms |   14
  31 ms | ███  123
  32 ms | ██████████████████████████████████  1684
  33 ms | ████████████████████████████████████████  1958
  34 ms | █████████████████████████████  1428
  35 ms | ██  94
  36 ms |   19
  37 ms |   13
  38 ms |   8
  39 ms |   5
  40 ms |   2
  41 ms |   3
  42 ms |   2
  43 ms |   1
  46 ms |   2
  47 ms |   2
  49 ms |   1
  54 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `fps_0p1pct_low` = `20.29`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.92`
- `fps_1pct_low` = `25.33`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `0.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195250 ms  |  Sample ticks: 3600

**FPS**  avg `26.88`, min `8.18`, p50 `25.56`, p95 `48.70`, p99 `62.39`, 1%low `8.81`, 0.1%low `8.42`, std `12.95`

**Frame time (ms)**  avg `49.25`, p50 `39.12`, p95 `105.03`, p99 `111.43`, p99.9 `115.29`, max `122.23`

**Client tick (ms)**  avg `6.45`, p95 `7.78`, max `32.84`

**Memory**  start `1965 MB`, end `1871 MB`, peak `2029 MB`, GC `15 events / 61 ms`

**FPS over sampling window (ASCII):**

```
 34.9 |                                                   ██                           
 32.6 |███████████  ██ ████ ████ ███████████████████████  ██████████                   
 30.4 |██████████████████████████████████████████████████████████████                  
 28.1 |██████████████████████████████████████████████████████████████                  
 25.8 |██████████████████████████████████████████████████████████████                  
 23.6 |██████████████████████████████████████████████████████████████                  
 21.3 |██████████████████████████████████████████████████████████████                  
 19.0 |██████████████████████████████████████████████████████████████                  
 16.8 |██████████████████████████████████████████████████████████████                  
 14.5 |██████████████████████████████████████████████████████████████                  
 12.3 |██████████████████████████████████████████████████████████████                  
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   1
   8 ms |   1
  12 ms |   4
  13 ms | █  7
  14 ms | █  7
  15 ms | ██  16
  16 ms | ████  34
  17 ms | ███  26
  18 ms | ████  34
  19 ms | ████  35
  20 ms | ████  37
  21 ms | █████  47
  22 ms | ██████  52
  23 ms | ████  35
  24 ms | ███████  61
  25 ms | █████████  82
  26 ms | ████████████████████████████  247
  27 ms | █████████████████████  185
  28 ms | ████████  70
  29 ms | ███  30
  30 ms | ████  36
  31 ms | ███████  62
  32 ms | ███████████  100
  33 ms | ████████████████  144
  34 ms | ████████████  105
  35 ms | █████████  80
  36 ms | ██████  55
  37 ms | ██████████  92
  38 ms | ██████████████  126
  39 ms | ███████████████████████████████████  306
  40 ms | ████████████████████████████████████████  354
  41 ms | ███████████  96
  42 ms | █████  44
  43 ms | █████  40
  44 ms | ████  35
  45 ms | ███  23
  46 ms | ██  15
  47 ms | █  9
  48 ms | █  12
  49 ms | █  11
  50 ms | █  6
  51 ms | █  9
  52 ms | █  6
  53 ms |   4
  54 ms |   1
  55 ms |   1
  56 ms |   1
  59 ms |   1
  67 ms |   1
  68 ms |   1
  82 ms |   1
  83 ms |   2
  84 ms |   1
  85 ms |   2
  86 ms | █  8
  87 ms | █  8
  88 ms | █  11
  89 ms | █  11
  90 ms | ███  25
  91 ms | ██  19
  92 ms | ███  24
  93 ms | ███  28
  94 ms | ████  36
  95 ms | ████  39
  96 ms | ████  34
  97 ms | ██████  53
  98 ms | ███████  61
  99 ms | ███████  66
 100 ms | ████████  74
 101 ms | ███████  62
 102 ms | ██████  56
 103 ms | ███  28
 104 ms | ████  34
 105 ms | ███  24
 106 ms | ███  30
 107 ms | ██  22
 108 ms | ███  23
 109 ms | ██  20
 110 ms | ██  20
 111 ms | ██  20
 112 ms | █  6
 113 ms | █  9
 114 ms |   3
 115 ms | █  5
 121 ms |   1
 122 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `fps_0p1pct_low` = `8.42`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `20.30`
- `fps_1pct_low` = `8.81`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `72.00`
- `iris_present` = `0.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`

