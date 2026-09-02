# FPS Test session — 2026-09-02T16:16:54.267912458+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader — lowEnd.zip (no pack)](#pack--shader--lowendzip-no-pack) | Showcase | 78.7 | 17.6 | 16.4 | 54.55 | 0.80 | 56 | 355 |
| 2 | [Pack + Shader — lowEnd.zip + pbr.zip](#pack--shader--lowendzip--pbrzip) | Showcase | 83.3 | 17.7 | 16.3 | 53.99 | 0.73 | 43 | 106 |
| 3 | [Pack + Shader — highEnd.zip (no pack)](#pack--shader--highendzip-no-pack) | Showcase | 31.5 | 19.5 | 17.4 | 47.64 | 0.70 | 26 | 550 |
| 4 | [Pack + Shader — highEnd.zip + pbr.zip](#pack--shader--highendzip--pbrzip) | Showcase | 51.6 | 17.6 | 16.9 | 55.51 | 0.71 | 30 | 86 |

## Details

### Pack + Shader — lowEnd.zip (no pack) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193166 ms  |  Sample ticks: 3600

**FPS**  avg `78.67`, min `14.97`, p50 `48.34`, p95 `173.03`, p99 `259.91`, 1%low `17.61`, 0.1%low `16.42`, std `56.66`

**Frame time (ms)**  avg `21.10`, p50 `20.69`, p95 `45.24`, p99 `54.55`, p99.9 `59.41`, max `66.81`

**Client tick (ms)**  avg `0.80`, p95 `1.07`, max `7.62`

**Memory**  start `974 MB`, end `807 MB`, peak `1330 MB`, GC `56 events / 245 ms`

**FPS over sampling window (ASCII):**

```
136.3 |█         ██                                                                    
126.7 |██        ██              ████                                                  
117.1 |██       ███████   ████   █████ █       ████                                    
107.5 |███  █████████████████████████████ █████████                                    
 97.9 |████████████████████████████████████████████                                    
 88.3 |█████████████████████████████████████████████                                   
 78.7 |█████████████████████████████████████████████                                   
 69.2 |█████████████████████████████████████████████                                   
 59.6 |█████████████████████████████████████████████                                   
 50.0 |█████████████████████████████████████████████                                   
 40.4 |█████████████████████████████████████████████      █ ██ ██ █   ██               
 30.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   14
   3 ms | ███  81
   4 ms | █████  149
   5 ms | ████████  240
   6 ms | █████████████████  523
   7 ms | █████████████████████████  756
   8 ms | ████████████████████████████████████████  1208
   9 ms | ████████████████  483
  10 ms | █████  150
  11 ms | █  45
  12 ms | █  28
  13 ms | █  26
  14 ms | █  30
  15 ms | █  19
  16 ms | █  20
  17 ms | █  45
  18 ms | ███  104
  19 ms | ██████  182
  20 ms | █████████  272
  21 ms | █████████  277
  22 ms | █████████  285
  23 ms | █████████  278
  24 ms | ████████  252
  25 ms | █████  148
  26 ms | ████  117
  27 ms | ███  76
  28 ms | ██  60
  29 ms | ██  51
  30 ms | ██  75
  31 ms | ████  111
  32 ms | ████████████  352
  33 ms | ███████████  335
  34 ms | █████████████  378
  35 ms | ███  96
  36 ms | ██  53
  37 ms | ██  62
  38 ms | ██  68
  39 ms | ███  89
  40 ms | ████  111
  41 ms | ███  104
  42 ms | ████  114
  43 ms | ███  94
  44 ms | ████  120
  45 ms | ███  104
  46 ms | ██  63
  47 ms | █  38
  48 ms | █  38
  49 ms | █  26
  50 ms | █  25
  51 ms |   15
  52 ms | █  24
  53 ms | █  22
  54 ms | █  22
  55 ms | █  21
  56 ms | █  25
  57 ms |   11
  58 ms |   6
  59 ms |   6
  60 ms |   3
  61 ms |   1
  66 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `resource_pack` = `none`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `77.00`
- `preload_chunks` = `81.00`
- `phase` = `0.00`
- `fps_harmonic_avg` = `47.40`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.42`
- `preload_duration_ms` = `55.00`
- `entity_count_delta` = `13.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.61`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `90.00`
- `iris_present` = `1.00`

### Pack + Shader — lowEnd.zip + pbr.zip (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194896 ms  |  Sample ticks: 3600

**FPS**  avg `83.30`, min `13.22`, p50 `98.11`, p95 `153.88`, p99 `221.30`, 1%low `17.69`, 0.1%low `16.29`, std `51.11`

**Frame time (ms)**  avg `19.39`, p50 `10.19`, p95 `45.24`, p99 `53.99`, p99.9 `58.24`, max `75.63`

**Client tick (ms)**  avg `0.73`, p95 `0.96`, max `1.51`

**Memory**  start `1382 MB`, end `1174 MB`, peak `1488 MB`, GC `43 events / 145 ms`

**FPS over sampling window (ASCII):**

```
126.1 |                                           █                   ██               
117.5 |                                     █ ██ ███     ███████    ██████             
108.8 |                    ███████████████████████████████████████████████             
100.2 |                  █████████████████████████████████████████████████             
 91.5 |                  █████████████████████████████████████████████████             
 82.9 |                  █████████████████████████████████████████████████             
 74.2 |                  █████████████████████████████████████████████████             
 65.6 |                  ██████████████████████████████████████████████████            
 56.9 |                  ██████████████████████████████████████████████████            
 48.3 |                 ███████████████████████████████████████████████████            
 39.6 | █  ███ █  ██ █ ████████████████████████████████████████████████████            
 31.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   4
   3 ms | █  55
   4 ms | ██  77
   5 ms | ████  190
   6 ms | ████████  395
   7 ms | ███████████████████████  1141
   8 ms | ████████████████████████████████████████  2000
   9 ms | ███████████████  745
  10 ms | ██  95
  11 ms | █  38
  12 ms |   22
  13 ms | █  29
  14 ms | █  38
  15 ms | █  73
  16 ms | ██  105
  17 ms | ████  183
  18 ms | ███  163
  19 ms | ███  166
  20 ms | ████  198
  21 ms | ████  181
  22 ms | ███  155
  23 ms | ███  135
  24 ms | ███  129
  25 ms | ██  117
  26 ms | ██  115
  27 ms | ██  84
  28 ms | █  52
  29 ms | █  47
  30 ms | █  52
  31 ms | ██  93
  32 ms | ██████  306
  33 ms | ████████  397
  34 ms | ███████  332
  35 ms | ██  106
  36 ms | ██  84
  37 ms | █  51
  38 ms | █  38
  39 ms | █  51
  40 ms | █  69
  41 ms | ██  84
  42 ms | ███  141
  43 ms | ███  127
  44 ms | ███  127
  45 ms | ██  95
  46 ms | █  73
  47 ms | █  65
  48 ms | █  32
  49 ms | █  37
  50 ms |   23
  51 ms | █  27
  52 ms |   21
  53 ms | █  27
  54 ms |   21
  55 ms |   24
  56 ms |   22
  57 ms |   13
  58 ms |   8
  59 ms |   1
  60 ms |   1
  61 ms |   2
  75 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `resource_pack` = `pbr.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `77.00`
- `preload_chunks` = `81.00`
- `phase` = `1.00`
- `fps_harmonic_avg` = `51.57`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.29`
- `preload_duration_ms` = `55.00`
- `entity_count_delta` = `10.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.69`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `87.00`
- `iris_present` = `1.00`

### Pack + Shader — highEnd.zip (no pack) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194151 ms  |  Sample ticks: 3600

**FPS**  avg `31.54`, min `17.28`, p50 `29.74`, p95 `47.34`, p99 `53.58`, 1%low `19.47`, 0.1%low `17.41`, std `8.18`

**Frame time (ms)**  avg `33.40`, p50 `33.63`, p95 `44.82`, p99 `47.64`, p99.9 `56.35`, max `57.86`

**Client tick (ms)**  avg `0.70`, p95 `0.97`, max `8.86`

**Memory**  start `1060 MB`, end `1219 MB`, peak `1610 MB`, GC `26 events / 112 ms`

**FPS over sampling window (ASCII):**

```
 36.4 |                                                                             █  
 35.9 |                                                                             ██ 
 35.3 |                                                                             ██ 
 34.8 |                                                                             ██ 
 34.3 |                                                                             ███
 33.8 |                                                                             ███
 33.2 |                                                                             ███
 32.7 |                                                                             ███
 32.2 |                                   █ █                                      ████
 31.7 |██ █ █   █       █  █████    ██ ██ █ █     █  ███ █ ██  █   ██    █  █  █  █████
 31.1 |██████ ██████ █████████████████████████████████████████ ████████ █████ █████████
 30.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms |   1
   9 ms |   3
  10 ms |   2
  11 ms |   3
  12 ms |   5
  13 ms |   5
  14 ms |   7
  15 ms |   4
  16 ms |   3
  17 ms |   10
  18 ms | █  16
  19 ms | ██  62
  20 ms | █████  130
  21 ms | ███████  172
  22 ms | ███████  176
  23 ms | ███████  165
  24 ms | ████  110
  25 ms | ████  109
  26 ms | ███  77
  27 ms | ███  73
  28 ms | ██  49
  29 ms | ███  82
  30 ms | ████  91
  31 ms | █████  138
  32 ms | █████████████████████  537
  33 ms | ████████████████████████████████████████  1009
  34 ms | █████████████████████████  620
  35 ms | ████████  193
  36 ms | ██████  150
  37 ms | ██████  155
  38 ms | ██████  148
  39 ms | ██████  150
  40 ms | █████  117
  41 ms | ██████  148
  42 ms | ███████  166
  43 ms | █████  128
  44 ms | █████  131
  45 ms | █████  115
  46 ms | ██  58
  47 ms | █  25
  48 ms |   12
  49 ms |   7
  50 ms |   2
  51 ms |   4
  52 ms |   5
  53 ms |   6
  54 ms |   1
  55 ms |   3
  56 ms |   3
  57 ms |   4
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `resource_pack` = `none`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `76.00`
- `preload_chunks` = `81.00`
- `phase` = `2.00`
- `fps_harmonic_avg` = `29.94`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.41`
- `preload_duration_ms` = `55.00`
- `entity_count_delta` = `10.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.47`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `86.00`
- `iris_present` = `1.00`

### Pack + Shader — highEnd.zip + pbr.zip (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195575 ms  |  Sample ticks: 3600

**FPS**  avg `51.60`, min `16.59`, p50 `38.90`, p95 `144.75`, p99 `181.26`, 1%low `17.61`, 0.1%low `16.87`, std `38.39`

**Frame time (ms)**  avg `28.18`, p50 `25.71`, p95 `51.92`, p99 `55.51`, p99.9 `58.49`, max `60.27`

**Client tick (ms)**  avg `0.71`, p95 `0.97`, max `5.50`

**Memory**  start `1685 MB`, end `1087 MB`, peak `1771 MB`, GC `30 events / 119 ms`

**FPS over sampling window (ASCII):**

```
 88.5 |█                                                                               
 83.4 |█                                                                               
 78.2 |█      █ ████      ██                                                           
 73.1 |███ ████████████  █████     █ █                                                 
 67.9 |████████████████████████████████████                                            
 62.8 |████████████████████████████████████                                            
 57.6 |████████████████████████████████████                                            
 52.5 |████████████████████████████████████                                            
 47.3 |████████████████████████████████████                                            
 42.2 |████████████████████████████████████                                            
 37.0 |███████████████████████████████████████   █████████ ███ ███ ███████ ██ █ █ ██   
 31.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
   4 ms | ██  20
   5 ms | ███████████  96
   6 ms | █████████████████████████  225
   7 ms | ████████████████████████  216
   8 ms | ████████████  103
   9 ms | █████  43
  10 ms | ███████  60
  11 ms | ███████████  100
  12 ms | ████████████  104
  13 ms | █████████████  117
  14 ms | ██████████████████  157
  15 ms | ███████████████████████████████  276
  16 ms | ████████████████████████████████████████  354
  17 ms | ███████████████████████████████████  313
  18 ms | ██████████████  124
  19 ms | ██████████  90
  20 ms | ████████████  103
  21 ms | ████████████████  144
  22 ms | ███████████████  131
  23 ms | ███████████████████  168
  24 ms | ██████████████████  158
  25 ms | █████████████  115
  26 ms | ███████████  93
  27 ms | ██████████  85
  28 ms | ██████████  87
  29 ms | ██████████  85
  30 ms | ███████  61
  31 ms | ████████  68
  32 ms | ██████████████████████████  231
  33 ms | ███████████████████████████  236
  34 ms | █████████████████████████  223
  35 ms | ████████  67
  36 ms | ██████  49
  37 ms | █████  47
  38 ms | ████  39
  39 ms | ██████  50
  40 ms | ███████  65
  41 ms | ██████████  85
  42 ms | ███████████████  133
  43 ms | █████████████████  152
  44 ms | ████████████████  139
  45 ms | ███████████████████  171
  46 ms | ██████████████  124
  47 ms | ████████  73
  48 ms | ████████████  104
  49 ms | ██████████████  126
  50 ms | ████████████████  140
  51 ms | ██████████████  121
  52 ms | ████████████  108
  53 ms | ███████  63
  54 ms | ██████  57
  55 ms | █████  42
  56 ms | ██  22
  57 ms | █  10
  58 ms | █  8
  59 ms |   3
  60 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `resource_pack` = `pbr.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `77.00`
- `preload_chunks` = `81.00`
- `phase` = `3.00`
- `fps_harmonic_avg` = `35.48`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.87`
- `preload_duration_ms` = `55.00`
- `entity_count_delta` = `9.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.61`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `86.00`
- `iris_present` = `1.00`

