# FPS Test session — 2026-09-02T12:42:04.945218432+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [PBR + Shader Showcase](#pbr--shader-showcase) | Showcase | 41.6 | 16.4 | 14.2 | 58.73 | 0.79 | 19 | 386 |

## Details

### PBR + Shader Showcase (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194487 ms  |  Sample ticks: 3600

**FPS**  avg `41.56`, min `13.39`, p50 `29.24`, p95 `136.64`, p99 `205.34`, 1%low `16.39`, 0.1%low `14.16`, std `37.79`

**Frame time (ms)**  avg `34.02`, p50 `34.20`, p95 `56.12`, p99 `58.73`, p99.9 `64.75`, max `74.66`

**Client tick (ms)**  avg `0.79`, p95 `1.07`, max `2.89`

**Memory**  start `2298 MB`, end `1212 MB`, peak `2684 MB`, GC `19 events / 124 ms`

**FPS over sampling window (ASCII):**

```
 78.8 |█                                                                               
 74.2 |█         ██                                                                    
 69.5 |█     ████████       ██                                                         
 64.8 |██ █  ████████████  ██████                                                      
 60.2 |███████████████████████████                                                     
 55.5 |███████████████████████████                                                     
 50.8 |███████████████████████████                                                     
 46.2 |███████████████████████████                                                     
 41.5 |███████████████████████████                                                     
 36.8 |███████████████████████████                                                     
 32.2 |████████████████████████████ █       █                 █     █         █        
 27.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  10
   4 ms | ███████  53
   5 ms | ████████████  94
   6 ms | ██████████  77
   7 ms | ███████████  89
   8 ms | █████  44
   9 ms | ███  28
  10 ms | ███  21
  11 ms | █████  39
  12 ms | █████  42
  13 ms | █████  44
  14 ms | ████  36
  15 ms | ██████  49
  16 ms | ███████  55
  17 ms | █████  40
  18 ms | ██  20
  19 ms | ██  13
  20 ms | ███  24
  21 ms | ██████████  80
  22 ms | █████████████████████████  199
  23 ms | ████████████████████████████████████████  321
  24 ms | ████████████████████████  192
  25 ms | ███████████████  119
  26 ms | ██████████████  115
  27 ms | ████████████████████████  190
  28 ms | ██████████████████████████  205
  29 ms | ███████████████████████  181
  30 ms | ███████████████  117
  31 ms | █████████  69
  32 ms | █████  38
  33 ms | ████  36
  34 ms | ███  23
  35 ms | █████  43
  36 ms | ██████████  82
  37 ms | ███████████████████████  182
  38 ms | █████████████████████████████  234
  39 ms | █████████████████████████  202
  40 ms | ████████████████████████  196
  41 ms | █████████████████████  168
  42 ms | ███████████████  119
  43 ms | ████████████  96
  44 ms | ███████  53
  45 ms | ██████  50
  46 ms | █████  42
  47 ms | █████  43
  48 ms | ████████  62
  49 ms | ██████  51
  50 ms | ██████  50
  51 ms | ████████  67
  52 ms | ██████████████  116
  53 ms | ██████████████████████  174
  54 ms | ████████████████████████  190
  55 ms | ████████████████  131
  56 ms | ████████████████  126
  57 ms | ████████  64
  58 ms | █████  44
  59 ms | ███  22
  60 ms | █  9
  61 ms |   4
  62 ms |   2
  64 ms |   2
  65 ms |   1
  67 ms |   1
  72 ms |   2
  74 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `resource_pack` = `pbr.zip`
- `entity_count_sample_end` = `90.00`
- `entity_count_sample_start` = `74.00`
- `shader_in_use` = `1.00`
- `other_entities_spawned` = `58.00`
- `fps_1pct_low` = `16.39`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `blocks_placed` = `314075.00`
- `fps_harmonic_avg` = `29.40`
- `preload_duration_ms` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `14.16`
- `iris_present` = `1.00`
- `preset_quick` = `0.00`
- `entity_count_delta` = `16.00`
- `segment_count` = `19.00`
- `seed` = `27182.00`
- `preset_full` = `0.00`
- `terrain_area_blocks` = `43473.00`
- `preset_long` = `0.00`

