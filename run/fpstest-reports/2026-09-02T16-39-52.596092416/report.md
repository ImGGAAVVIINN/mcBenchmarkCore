# FPS Test session — 2026-09-02T16:53:02.549666213+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader — lowEnd.zip (no pack)](#pack--shader--lowendzip-no-pack) | Showcase | 106.8 | 18.6 | 16.5 | 48.06 | 0.83 | 29 | 773 |
| 2 | [Pack + Shader — lowEnd.zip + pbr.zip](#pack--shader--lowendzip--pbrzip) | Showcase | 76.4 | 21.3 | 20.1 | 45.84 | 0.72 | 24 | 182 |
| 3 | [Pack + Shader — highEnd.zip (no pack)](#pack--shader--highendzip-no-pack) | Showcase | 46.1 | 17.6 | 16.0 | 53.92 | 0.69 | 19 | 348 |
| 4 | [Pack + Shader — highEnd.zip + pbr.zip](#pack--shader--highendzip--pbrzip) | Showcase | 69.8 | 17.4 | 16.3 | 55.40 | 0.73 | 20 | 403 |

## Details

### Pack + Shader — lowEnd.zip (no pack) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193167 ms  |  Sample ticks: 3600

**FPS**  avg `106.78`, min `15.82`, p50 `113.78`, p95 `239.91`, p99 `327.90`, 1%low `18.59`, 0.1%low `16.52`, std `64.90`

**Frame time (ms)**  avg `14.61`, p50 `8.79`, p95 `37.96`, p99 `48.06`, p99.9 `58.24`, max `63.20`

**Client tick (ms)**  avg `0.83`, p95 `1.12`, max `9.26`

**Memory**  start `1151 MB`, end `1633 MB`, peak `1925 MB`, GC `29 events / 187 ms`

**FPS over sampling window (ASCII):**

```
153.0 |                                                                    █  █        
141.9 |                                              ██               ███ █████        
130.8 |                                         █ █████     █████   ███████████        
119.7 |█      ████       ████              ████████████████████████████████████        
108.6 |████████████████████████████       █████████████████████████████████████        
 97.5 |████████████████████████████       ██████████████████████████████████████       
 86.5 |█████████████████████████████      ██████████████████████████████████████       
 75.4 |█████████████████████████████      ██████████████████████████████████████       
 64.3 |█████████████████████████████      ██████████████████████████████████████       
 53.2 |█████████████████████████████      ██████████████████████████████████████       
 42.1 |██████████████████████████████ █  ███████████████████████████████████████       
 31.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  109
   3 ms | ██████  455
   4 ms | ████  303
   5 ms | ██████  439
   6 ms | ██████████  741
   7 ms | ████████████████████  1506
   8 ms | ████████████████████████████████████████  3079
   9 ms | ████████████████  1196
  10 ms | ███  200
  11 ms | █  62
  12 ms |   15
  13 ms |   14
  14 ms |   13
  15 ms |   36
  16 ms | █  76
  17 ms | ██  170
  18 ms | ████  280
  19 ms | █████  366
  20 ms | █████  399
  21 ms | █████  371
  22 ms | ███  242
  23 ms | ██  161
  24 ms | ██  136
  25 ms | █  80
  26 ms | █  46
  27 ms |   38
  28 ms |   29
  29 ms |   37
  30 ms |   30
  31 ms | █  68
  32 ms | ███  214
  33 ms | ███  268
  34 ms | ████  292
  35 ms | █  113
  36 ms | █  66
  37 ms | █  60
  38 ms | █  48
  39 ms | █  45
  40 ms | █  43
  41 ms | █  60
  42 ms | █  62
  43 ms | █  63
  44 ms | █  57
  45 ms |   37
  46 ms | █  49
  47 ms |   23
  48 ms |   15
  49 ms |   11
  50 ms |   12
  51 ms |   12
  52 ms |   15
  53 ms |   11
  54 ms |   4
  55 ms |   11
  56 ms |   11
  57 ms |   8
  58 ms |   6
  59 ms |   6
  60 ms |   3
  61 ms |   1
  62 ms |   1
  63 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `resource_pack` = `none`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `entity_count_delta` = `14.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `18.59`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `91.00`
- `iris_present` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `77.00`
- `preload_chunks` = `81.00`
- `phase` = `0.00`
- `fps_harmonic_avg` = `68.47`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.52`
- `preload_duration_ms` = `32.00`

### Pack + Shader — lowEnd.zip + pbr.zip (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194842 ms  |  Sample ticks: 3600

**FPS**  avg `76.37`, min `19.30`, p50 `45.22`, p95 `161.95`, p99 `287.75`, 1%low `21.30`, 0.1%low `20.13`, std `57.79`

**Frame time (ms)**  avg `21.47`, p50 `22.12`, p95 `42.47`, p99 `45.84`, p99.9 `48.45`, max `51.82`

**Client tick (ms)**  avg `0.72`, p95 `1.00`, max `1.60`

**Memory**  start `1876 MB`, end `1585 MB`, peak `2059 MB`, GC `24 events / 113 ms`

**FPS over sampling window (ASCII):**

```
140.8 |█         ██                                                                    
130.8 |██        ██              ███                                                   
120.8 |██        ███             ████                                                  
110.8 |██    ████████████ ████████████████████████                                     
100.8 |████████████████████████████████████████████                                    
 90.8 |████████████████████████████████████████████                                    
 80.8 |████████████████████████████████████████████                                    
 70.9 |████████████████████████████████████████████                                    
 60.9 |████████████████████████████████████████████                                    
 50.9 |████████████████████████████████████████████                                    
 40.9 |████████████████████████████████████████████                                    
 30.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  44
   3 ms | ███  69
   4 ms | ███  66
   5 ms | ███████  179
   6 ms | █████████████████████  533
   7 ms | █████████████████████████████████████  923
   8 ms | ████████████████████████████████████████  1010
   9 ms | ██████████████████  453
  10 ms | █████  119
  11 ms | █  22
  12 ms |   9
  13 ms |   1
  14 ms |   2
  15 ms |   4
  16 ms |   4
  17 ms | █  19
  18 ms | ██  55
  19 ms | ██████  148
  20 ms | █████████  216
  21 ms | ███████████  277
  22 ms | █████████████  336
  23 ms | ███████████  272
  24 ms | █████████  226
  25 ms | ███████  172
  26 ms | █████  137
  27 ms | ███  77
  28 ms | ██  60
  29 ms | ██  56
  30 ms | ██  50
  31 ms | ████  112
  32 ms | █████████████████  422
  33 ms | ███████████████████  479
  34 ms | ████████████████████  496
  35 ms | ████████  203
  36 ms | █████  118
  37 ms | ████  105
  38 ms | ████  112
  39 ms | ████  102
  40 ms | █████  116
  41 ms | ████  109
  42 ms | █████  127
  43 ms | ████  104
  44 ms | ████  95
  45 ms | ███  73
  46 ms | ██  44
  47 ms | █  15
  48 ms |   8
  49 ms |   1
  50 ms |   1
  51 ms |   2
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `resource_pack` = `pbr.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `entity_count_delta` = `15.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.30`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `89.00`
- `iris_present` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `74.00`
- `preload_chunks` = `81.00`
- `phase` = `1.00`
- `fps_harmonic_avg` = `46.57`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.13`
- `preload_duration_ms` = `32.00`

### Pack + Shader — highEnd.zip (no pack) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193970 ms  |  Sample ticks: 3600

**FPS**  avg `46.07`, min `15.64`, p50 `30.62`, p95 `116.90`, p99 `217.36`, 1%low `17.56`, 0.1%low `15.97`, std `38.53`

**Frame time (ms)**  avg `29.47`, p50 `32.66`, p95 `45.78`, p99 `53.92`, p99.9 `61.50`, max `63.95`

**Client tick (ms)**  avg `0.69`, p95 `0.96`, max `1.32`

**Memory**  start `1757 MB`, end `1223 MB`, peak `2106 MB`, GC `19 events / 127 ms`

**FPS over sampling window (ASCII):**

```
104.7 |                                                                █               
 98.0 |                                                               █████            
 91.3 |                                                               █████████████████
 84.6 |                                                               █████████████████
 77.9 |                                                               █████████████████
 71.2 |                                                               █████████████████
 64.4 |                                                               █████████████████
 57.7 |                                                              ██████████████████
 51.0 |                                                              ██████████████████
 44.3 |                                                              ██████████████████
 37.6 |                                             █  ███████████ █ ██████████████████
 30.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  17
   4 ms | ███████  97
   5 ms | ██████  94
   6 ms | ██  27
   7 ms | ██  36
   8 ms | ████  60
   9 ms | ████  65
  10 ms | ██████  90
  11 ms | ████████████  175
  12 ms | ████████████████  236
  13 ms | █████████  135
  14 ms | ███  42
  15 ms | ██  25
  16 ms | █  17
  17 ms | █  18
  18 ms | ██  34
  19 ms | ████  56
  20 ms | ███████████  155
  21 ms | █████████████  193
  22 ms | ██████████  151
  23 ms | ██████████  142
  24 ms | ██████████  143
  25 ms | ████████  116
  26 ms | ██████  90
  27 ms | █████  70
  28 ms | ██████  88
  29 ms | ███████  97
  30 ms | ███████  109
  31 ms | ███████████  163
  32 ms | ████████████████████████████████████  536
  33 ms | ████████████████████████████████████████  590
  34 ms | ███████████████████████████████████  510
  35 ms | ███████████  167
  36 ms | ████████  120
  37 ms | ████████  115
  38 ms | ██████  90
  39 ms | ████████  124
  40 ms | █████████  126
  41 ms | ███████████  156
  42 ms | ██████████  141
  43 ms | ████████████  172
  44 ms | █████████  137
  45 ms | ██████  95
  46 ms | █████  81
  47 ms | ██  33
  48 ms | ██  26
  49 ms | █  22
  50 ms | █  18
  51 ms | █  21
  52 ms | █  19
  53 ms |   7
  54 ms | █  14
  55 ms | █  14
  56 ms | █  12
  57 ms |   7
  58 ms |   2
  59 ms |   3
  60 ms |   1
  61 ms |   3
  62 ms |   3
  63 ms |   2
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `resource_pack` = `none`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `entity_count_delta` = `13.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.56`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `90.00`
- `iris_present` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `77.00`
- `preload_chunks` = `81.00`
- `phase` = `2.00`
- `fps_harmonic_avg` = `33.93`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `15.97`
- `preload_duration_ms` = `32.00`

### Pack + Shader — highEnd.zip + pbr.zip (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195519 ms  |  Sample ticks: 3600

**FPS**  avg `69.84`, min `15.65`, p50 `57.31`, p95 `167.04`, p99 `218.22`, 1%low `17.41`, 0.1%low `16.29`, std `50.66`

**Frame time (ms)**  avg `23.13`, p50 `17.45`, p95 `50.68`, p99 `55.40`, p99.9 `59.58`, max `63.88`

**Client tick (ms)**  avg `0.73`, p95 `1.00`, max `1.70`

**Memory**  start `1844 MB`, end `1769 MB`, peak `2247 MB`, GC `20 events / 141 ms`

**FPS over sampling window (ASCII):**

```
 94.1 |                                                              ██ ██             
 88.4 |█                                      █                     ████████    █      
 82.7 |█     ████                             ███                █████████████████ █   
 77.0 |██ ████████                           ████████ █    ██████████████████████████  
 71.3 |███████████                █ █████████████████████████████████████████████████  
 65.7 |███████████               ████████████████████████████████████████████████████  
 60.0 |███████████              █████████████████████████████████████████████████████  
 54.3 |███████████              █████████████████████████████████████████████████████  
 48.6 |████████████             █████████████████████████████████████████████████████  
 42.9 |████████████             █████████████████████████████████████████████████████  
 37.2 |██████████████████████████████████████████████████████████████████████████████  
 31.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  20
   4 ms | ████████  113
   5 ms | ██████████████████  259
   6 ms | ████████████████████████████████████████  574
   7 ms | ███████████████████████████████████  508
   8 ms | ██████████████████  265
   9 ms | █████████  124
  10 ms | ████████  116
  11 ms | ██████████████  205
  12 ms | ███████████████████  267
  13 ms | ████████████████████  283
  14 ms | ███████████████████  266
  15 ms | ███████████████████████  323
  16 ms | ████████████████████████████  398
  17 ms | ███████████████████████  330
  18 ms | ████████  115
  19 ms | █████  74
  20 ms | ███  47
  21 ms | ██████  85
  22 ms | ██████  89
  23 ms | █████████  135
  24 ms | █████████  136
  25 ms | ██████  91
  26 ms | █████  74
  27 ms | ███  43
  28 ms | ███  46
  29 ms | ████  58
  30 ms | █████  78
  31 ms | █████████  126
  32 ms | ████████████  177
  33 ms | ███████████████  213
  34 ms | ████████████████  233
  35 ms | █████████████  184
  36 ms | █████████████  187
  37 ms | ██████████  144
  38 ms | ███████  104
  39 ms | █████  68
  40 ms | ████  55
  41 ms | ████  53
  42 ms | █████  67
  43 ms | ██████  90
  44 ms | ███████  98
  45 ms | ███████  104
  46 ms | ██████  85
  47 ms | █████  72
  48 ms | ████  62
  49 ms | ██████  93
  50 ms | ██████  88
  51 ms | ███████  95
  52 ms | █████  68
  53 ms | ████  54
  54 ms | ████  53
  55 ms | ██  29
  56 ms | ██  23
  57 ms | █  14
  58 ms |   7
  59 ms | █  9
  60 ms |   2
  61 ms |   3
  63 ms |   2
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `resource_pack` = `pbr.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `entity_count_delta` = `15.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `17.41`
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
- `phase` = `3.00`
- `fps_harmonic_avg` = `43.24`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.29`
- `preload_duration_ms` = `32.00`

