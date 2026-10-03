# FPS Test session — 2026-09-01T11:22:17.669927829+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Base FPS Benchmark (showcase)](#base-fps-benchmark-showcase) | Showcase | 103.4 | 21.6 | 19.8 | 45.11 | 0.77 | 63 | 551 |

## Details

### Base FPS Benchmark (showcase) (`base_fps_showcase`)

Category: **Showcase**  |  Duration: 192117 ms  |  Sample ticks: 3600

**FPS**  avg `103.42`, min `13.96`, p50 `116.50`, p95 `152.91`, p99 `479.24`, 1%low `21.61`, 0.1%low `19.80`, std `76.48`

**Frame time (ms)**  avg `14.52`, p50 `8.58`, p95 `35.66`, p99 `45.11`, p99.9 `47.14`, max `71.62`

**Client tick (ms)**  avg `0.77`, p95 `1.06`, max `2.67`

**Memory**  start `834 MB`, end `1257 MB`, peak `1385 MB`, GC `63 events / 245 ms`

**FPS over sampling window (ASCII):**

```
209.3 |                                       █                                        
192.8 |                                       ██                                       
176.4 |                                       ██                                       
160.0 |                                       ████                                     
143.6 |                                       ████                                     
127.2 |      █           █ █     █            ████    █               █      █         
110.8 |████████████████████████████           █████████████████████████████████████    
 94.4 |█████████████████████████████         ███████████████████████████████████████   
 78.0 |█████████████████████████████         ███████████████████████████████████████   
 61.6 |█████████████████████████████         ███████████████████████████████████████   
 45.2 |█████████████████████████████         ███████████████████████████████████████   
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms | █  114
   2 ms | █  106
   3 ms | █  59
   4 ms | █  160
   5 ms | █  125
   6 ms | █  151
   7 ms | █████████████████  1823
   8 ms | ████████████████████████████████████████  4297
   9 ms | ██████████  1069
  10 ms |   46
  11 ms |   21
  12 ms |   9
  13 ms |   19
  14 ms |   48
  15 ms | ██  264
  16 ms | ████  393
  17 ms | ███  371
  18 ms | ███  316
  19 ms | ████  396
  20 ms | ███  360
  21 ms | ██  191
  22 ms | █  64
  23 ms |   23
  24 ms |   4
  25 ms |   3
  26 ms |   1
  27 ms |   5
  28 ms |   7
  29 ms |   3
  30 ms |   19
  31 ms |   33
  32 ms | ████  394
  33 ms | █████  545
  34 ms | ███  290
  35 ms | █  65
  36 ms |   43
  37 ms |   32
  38 ms |   39
  39 ms |   32
  40 ms |   52
  41 ms | █  62
  42 ms |   52
  43 ms | █  67
  44 ms | █  91
  45 ms | █  85
  46 ms |   34
  47 ms |   8
  48 ms |   1
  49 ms |   3
  50 ms |   2
  71 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `entity_count_sample_start` = `75.00`
- `preset_long` = `0.00`
- `seed` = `27182.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.80`
- `terrain_area_blocks` = `43473.00`
- `other_entities_spawned` = `58.00`
- `blocks_placed` = `314075.00`
- `fps_harmonic_avg` = `68.89`
- `segment_count` = `19.00`
- `fps_1pct_low` = `21.61`
- `villagers_spawned` = `36.00`
- `entity_count_sample_end` = `87.00`
- `preset_quick` = `0.00`
- `preset_full` = `0.00`
- `trees_built` = `173.00`
- `entity_count_delta` = `12.00`
- `preload_duration_ms` = `49.00`

