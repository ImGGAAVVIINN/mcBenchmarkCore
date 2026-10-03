# FPS Test session — 2026-09-02T15:49:25.11001167+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader — lowEnd.zip](#pack--shader--lowendzip) | Showcase | 94.3 | 18.5 | 17.1 | 51.52 | 0.80 | 71 | 141 |
| 2 | [Pack + Shader — highEnd.zip](#pack--shader--highendzip) | Showcase | 31.2 | 17.2 | 16.5 | 56.69 | 0.74 | 40 | 482 |

## Details

### Pack + Shader — lowEnd.zip (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195327 ms  |  Sample ticks: 3600

**FPS**  avg `94.32`, min `16.40`, p50 `110.07`, p95 `152.39`, p99 `270.45`, 1%low `18.45`, 0.1%low `17.11`, std `49.42`

**Frame time (ms)**  avg `15.89`, p50 `9.09`, p95 `44.02`, p99 `51.52`, p99.9 `56.86`, max `60.96`

**Client tick (ms)**  avg `0.80`, p95 `1.07`, max `7.31`

**Memory**  start `1192 MB`, end `941 MB`, peak `1334 MB`, GC `71 events / 288 ms`

**FPS over sampling window (ASCII):**

```
118.9 |                                                        ██ █ ██  ████ █  █ █    
110.8 |█      ███        ████                ████████████ █████████████████████████    
102.7 |█    ████████████████████             ██████████████████████████████████████    
 94.6 |█████████████████████████             ██████████████████████████████████████    
 86.5 |██████████████████████████            ███████████████████████████████████████   
 78.3 |██████████████████████████           ████████████████████████████████████████   
 70.2 |██████████████████████████           ████████████████████████████████████████   
 62.1 |██████████████████████████           ████████████████████████████████████████   
 54.0 |██████████████████████████           ████████████████████████████████████████   
 45.9 |██████████████████████████           ████████████████████████████████████████   
 37.8 |██████████████████████████           ████████████████████████████████████████   
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   21
   3 ms | ██  121
   4 ms | █  50
   5 ms | █  102
   6 ms | █████████  686
   7 ms | ████████████████████  1513
   8 ms | ████████████████████████████████████████  2993
   9 ms | ██████████████████  1362
  10 ms | ████  309
  11 ms | █  62
  12 ms |   17
  13 ms |   20
  14 ms |   15
  15 ms | █  38
  16 ms | █  90
  17 ms | ██  170
  18 ms | ████  271
  19 ms | █████  343
  20 ms | █████  351
  21 ms | ████  266
  22 ms | ███  212
  23 ms | ██  153
  24 ms | █  73
  25 ms |   32
  26 ms |   37
  27 ms |   16
  28 ms |   23
  29 ms |   9
  30 ms |   24
  31 ms | █  109
  32 ms | ████  318
  33 ms | ████  317
  34 ms | ███  214
  35 ms | █  84
  36 ms | █  47
  37 ms |   32
  38 ms |   24
  39 ms |   24
  40 ms |   27
  41 ms |   35
  42 ms | █  63
  43 ms | █  88
  44 ms | █  98
  45 ms | █  77
  46 ms | █  62
  47 ms | █  59
  48 ms | █  46
  49 ms | █  40
  50 ms | █  45
  51 ms | █  42
  52 ms |   21
  53 ms |   27
  54 ms |   21
  55 ms |   12
  56 ms |   10
  57 ms |   3
  58 ms |   2
  59 ms |   2
  60 ms |   2
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `resource_pack` = `pbr.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `0.00`
- `entity_count_delta` = `15.00`
- `phase_count` = `2.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `18.45`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `91.00`
- `iris_present` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `76.00`
- `preload_chunks` = `81.00`
- `phase` = `0.00`
- `fps_harmonic_avg` = `62.95`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.11`

### Pack + Shader — highEnd.zip (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193483 ms  |  Sample ticks: 3600

**FPS**  avg `31.18`, min `16.21`, p50 `29.74`, p95 `47.91`, p99 `53.97`, 1%low `17.15`, 0.1%low `16.49`, std `11.46`

**Frame time (ms)**  avg `35.49`, p50 `33.63`, p95 `51.19`, p99 `56.69`, p99.9 `59.25`, max `61.70`

**Client tick (ms)**  avg `0.74`, p95 `1.01`, max `1.36`

**Memory**  start `987 MB`, end `939 MB`, peak `1470 MB`, GC `40 events / 161 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                                         █                                      
 33.6 |                █        █               ██ █                                   
 33.2 |                █        █          █    ██ █                                   
 32.8 |                █      █ █          █    ██ █                                   
 32.4 |             █  █  █   ███  █  █    █ █  ██ ██                                  
 32.0 |     ██      █ █████   ███  █  █    █ █  ██ ██ █      █                         
 31.6 |█    ██      █ █████   █████████    ███  ██ ██ █      █                        █
 31.2 |█    ██  █   ███████  ██████████ ██ ███  ██ ██ █      █     █                 ██
 30.8 |█   ██████   ████████ ██████████ █████████████ █     ███    ██               ███
 30.5 |█ ████████ ███████████████████████████████████ ███ █████ ██ ██   █ █ █ █ █ █████
 30.1 |███████████████████████████████████████████████████████████ ██████ █████ ███████
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms |   4
   8 ms |   5
   9 ms | █  10
  10 ms | █  14
  11 ms |   6
  12 ms |   1
  13 ms |   3
  15 ms |   1
  16 ms |   1
  17 ms |   1
  18 ms | █  13
  19 ms | ███  37
  20 ms | ██████████████  194
  21 ms | ████████████████████████  321
  22 ms | ███████████████████████  315
  23 ms | ██████████████  185
  24 ms | █████  73
  25 ms | ██  31
  26 ms | ███  36
  27 ms | ████  52
  28 ms | ████  59
  29 ms | ██████  86
  30 ms | ██████  83
  31 ms | ███████████  148
  32 ms | ████████████████████████████████████  479
  33 ms | ████████████████████████████████████████  538
  34 ms | ████████████████████████  328
  35 ms | ███████  89
  36 ms |   6
  37 ms | █  7
  38 ms |   5
  39 ms | █  7
  40 ms | ██  25
  41 ms | ███  46
  42 ms | ███████  93
  43 ms | █████████████  180
  44 ms | ██████████████████████  290
  45 ms | ██████████████████████  291
  46 ms | ████████████████████  263
  47 ms | █████████████  178
  48 ms | ███████████  147
  49 ms | ███████  90
  50 ms | █████  61
  51 ms | █████  64
  52 ms | ███  40
  53 ms | ███  42
  54 ms | ██  26
  55 ms | ██  26
  56 ms | ██  24
  57 ms | ██  22
  58 ms | █  17
  59 ms |   5
  60 ms |   2
  61 ms |   2
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `resource_pack` = `pbr.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `0.00`
- `entity_count_delta` = `17.00`
- `phase_count` = `2.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.15`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `89.00`
- `iris_present` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `72.00`
- `preload_chunks` = `81.00`
- `phase` = `1.00`
- `fps_harmonic_avg` = `28.18`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.49`

