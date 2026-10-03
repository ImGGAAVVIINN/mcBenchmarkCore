# FPS Test session — 2026-09-02T10:39:40.652968935+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Base FPS + PBR pack + highEnd shader](#base-fps--pbr-pack--highend-shader) | Showcase | 64.8 | 17.2 | 15.5 | 55.74 | 0.79 | 49 | 437 |

## Details

### Base FPS + PBR pack + highEnd shader (`pack_shader_base_fps`)

Category: **Showcase**  |  Duration: 209250 ms  |  Sample ticks: 3600

**FPS**  avg `64.75`, min `13.76`, p50 `45.22`, p95 `178.29`, p99 `227.38`, 1%low `17.18`, 0.1%low `15.47`, std `48.84`

**Frame time (ms)**  avg `24.00`, p50 `22.12`, p95 `46.95`, p99 `55.74`, p99.9 `61.32`, max `72.67`

**Client tick (ms)**  avg `0.79`, p95 `1.08`, max `9.01`

**Memory**  start `958 MB`, end `1374 MB`, peak `1396 MB`, GC `49 events / 214 ms`

**FPS over sampling window (ASCII):**

```
106.1 |                                                                   ██   █       
 99.2 |                                                                   ████ ████ ██ 
 92.4 |  █       ██ ██                                                    █████████████
 85.6 | ████████████████████████████                                      █████████████
 78.7 |█████████████████████████████                                      █████████████
 71.9 |█████████████████████████████                                      █████████████
 65.1 |██████████████████████████████                                     █████████████
 58.2 |██████████████████████████████                                     █████████████
 51.4 |██████████████████████████████                                     █████████████
 44.6 |██████████████████████████████                                     █████████████
 37.7 |██████████████████████████████████████ ███ ████████ ████  ██ █    ██████████████
 30.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  17
   4 ms | ████████████  177
   5 ms | ███████████████████  281
   6 ms | ████████████  183
   7 ms | █████████████  191
   8 ms | ██████████████████  268
   9 ms | █████████████  195
  10 ms | ████████████  180
  11 ms | ██████████████████████████  389
  12 ms | ████████████████████████████████████████  603
  13 ms | ██████████████████████████  388
  14 ms | ██████  90
  15 ms | ███  43
  16 ms | ███  40
  17 ms | ███  48
  18 ms | ███████  100
  19 ms | ████████  124
  20 ms | ███████████  164
  21 ms | ████████████████  240
  22 ms | █████████████  192
  23 ms | █████████  138
  24 ms | █████████  141
  25 ms | ███████████  172
  26 ms | ████████  123
  27 ms | ██████  97
  28 ms | ███████  103
  29 ms | █████████  131
  30 ms | ████████  118
  31 ms | ████████  122
  32 ms | ██████████████████  269
  33 ms | ███████████████████  287
  34 ms | █████████████████  258
  35 ms | █████  76
  36 ms | ██  29
  37 ms | ██  34
  38 ms | ███  50
  39 ms | ██████  88
  40 ms | █████  74
  41 ms | ███████████  168
  42 ms | ███████████  171
  43 ms | ████████████  180
  44 ms | ███████████  163
  45 ms | ████████  125
  46 ms | ██████  97
  47 ms | ███  47
  48 ms | ███  49
  49 ms | ██  25
  50 ms | ██  31
  51 ms | ██  31
  52 ms | ██  31
  53 ms | ██  30
  54 ms | ██  31
  55 ms | ██  34
  56 ms | █  19
  57 ms | █  18
  58 ms | █  10
  59 ms | █  9
  60 ms |   1
  62 ms |   1
  63 ms |   5
  64 ms |   1
  72 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `entity_count_sample_start` = `83.00`
- `entity_count_sample_end` = `87.00`
- `preset_long` = `0.00`
- `resource_pack_available` = `0.00`
- `terrain_area_blocks` = `43473.00`
- `preset_full` = `0.00`
- `seed` = `27183.00`
- `segment_count` = `19.00`
- `entity_count_delta` = `4.00`
- `preset_quick` = `0.00`
- `fps_0p1pct_low` = `15.47`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `10.00`
- `fps_harmonic_avg` = `41.67`
- `blocks_placed` = `314075.00`
- `shader_active` = `1.00`
- `trees_built` = `173.00`
- `villagers_spawned` = `36.00`
- `fps_1pct_low` = `17.18`
- `other_entities_spawned` = `58.00`

