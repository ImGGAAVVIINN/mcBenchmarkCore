# FPS Test session — 2026-09-02T10:30:50.2288667+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Base FPS + PBR pack + highEnd shader](#base-fps--pbr-pack--highend-shader) | Showcase | 51.8 | 19.9 | 14.0 | 46.87 | 0.82 | 54 | 504 |

## Details

### Base FPS + PBR pack + highEnd shader (`pack_shader_base_fps`)

Category: **Showcase**  |  Duration: 216209 ms  |  Sample ticks: 3600

**FPS**  avg `51.80`, min `9.65`, p50 `30.49`, p95 `143.80`, p99 `212.57`, 1%low `19.91`, 0.1%low `14.01`, std `44.06`

**Frame time (ms)**  avg `28.74`, p50 `32.80`, p95 `45.10`, p99 `46.87`, p99.9 `51.44`, max `103.66`

**Client tick (ms)**  avg `0.82`, p95 `1.12`, max `8.06`

**Memory**  start `782 MB`, end `907 MB`, peak `1287 MB`, GC `54 events / 207 ms`

**FPS over sampling window (ASCII):**

```
 96.1 |      █  ██  ██ █                                                    ██  █  ██  
 89.9 |█████████████████                                                    ██████████ 
 83.8 |█████████████████                                                    ███████████
 77.6 |█████████████████                                                    ███████████
 71.5 |█████████████████                                                    ███████████
 65.3 |█████████████████                                                    ███████████
 59.1 |█████████████████                                                    ███████████
 53.0 |█████████████████                                                    ███████████
 46.8 |██████████████████                                                   ███████████
 40.7 |██████████████████                                                  ████████████
 34.5 |██████████████████                                                  ████████████
 28.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █████  84
   5 ms | ██████  99
   6 ms | █████████  141
   7 ms | ███████████████████  310
   8 ms | ████████████████  256
   9 ms | ██████████  158
  10 ms | █████  78
  11 ms | ██████  99
  12 ms | ███████  106
  13 ms | ██  40
  14 ms | █  13
  15 ms |   6
  16 ms |   6
  17 ms | █  10
  18 ms | ██  33
  19 ms | ██████  98
  20 ms | ████████  129
  21 ms | ████████  123
  22 ms | ███████  120
  23 ms | █████  84
  24 ms | ████  67
  25 ms | ██  37
  26 ms | ██  33
  27 ms | ███  49
  28 ms | █████  77
  29 ms | █████  83
  30 ms | ████████  124
  31 ms | ███████████  185
  32 ms | ██████████████████████████████████████  623
  33 ms | ████████████████████████████████████████  649
  34 ms | ████████████████████████████  456
  35 ms | █████████  152
  36 ms | ████████  127
  37 ms | ███████  110
  38 ms | ██████  103
  39 ms | ████████  136
  40 ms | ████████  125
  41 ms | ███████████  182
  42 ms | ████████████  190
  43 ms | █████████████  212
  44 ms | █████████████  217
  45 ms | ███████████  184
  46 ms | ██████  95
  47 ms | ██  28
  48 ms | █  11
  49 ms |   1
  50 ms |   4
  51 ms |   3
  53 ms |   1
  54 ms |   1
  58 ms |   1
  63 ms |   1
  93 ms |   1
 103 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `resource_pack` = `pbr.zip`
- `shader_pack` = `highEnd.zip`
- `preset_quick` = `0.00`
- `fps_0p1pct_low` = `14.01`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `34.79`
- `blocks_placed` = `314075.00`
- `shader_active` = `1.00`
- `trees_built` = `173.00`
- `villagers_spawned` = `36.00`
- `fps_1pct_low` = `19.91`
- `other_entities_spawned` = `58.00`
- `entity_count_sample_start` = `83.00`
- `entity_count_sample_end` = `91.00`
- `preset_long` = `0.00`
- `resource_pack_available` = `0.00`
- `terrain_area_blocks` = `43473.00`
- `preset_full` = `0.00`
- `seed` = `27183.00`
- `segment_count` = `19.00`
- `entity_count_delta` = `8.00`

