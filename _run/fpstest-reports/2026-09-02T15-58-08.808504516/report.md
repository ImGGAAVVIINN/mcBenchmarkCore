# FPS Test session — 2026-09-02T16:02:50.162935388+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader — lowEnd.zip (no pack)](#pack--shader--lowendzip-no-pack) | Showcase | 92.6 | 17.9 | 16.7 | 53.74 | 0.86 | 76 | 409 |
| 2 | [Pack + Shader — lowEnd.zip + pbr.zip](#pack--shader--lowendzip--pbrzip) | Showcase | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### Pack + Shader — lowEnd.zip (no pack) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193279 ms  |  Sample ticks: 3600

**FPS**  avg `92.58`, min `15.70`, p50 `111.79`, p95 `149.97`, p99 `193.39`, 1%low `17.94`, 0.1%low `16.71`, std `46.73`

**Frame time (ms)**  avg `16.53`, p50 `8.95`, p95 `43.62`, p99 `53.74`, p99.9 `57.93`, max `63.71`

**Client tick (ms)**  avg `0.86`, p95 `1.16`, max `3.00`

**Memory**  start `821 MB`, end `807 MB`, peak `1231 MB`, GC `76 events / 287 ms`

**FPS over sampling window (ASCII):**

```
118.6 |          █         █                                                           
110.5 |█       ████████████████ █ █████████  █████████████████████████                 
102.4 |███████████████████████████████████████████████████████████████                 
 94.3 |███████████████████████████████████████████████████████████████                 
 86.1 |███████████████████████████████████████████████████████████████                 
 78.0 |███████████████████████████████████████████████████████████████                 
 69.9 |███████████████████████████████████████████████████████████████                 
 61.7 |███████████████████████████████████████████████████████████████                 
 53.6 |████████████████████████████████████████████████████████████████                
 45.5 |████████████████████████████████████████████████████████████████                
 37.4 |████████████████████████████████████████████████████████████████                
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms |   29
   4 ms | █  59
   5 ms | ███  197
   6 ms | ████████  553
   7 ms | ██████████████████████████  1834
   8 ms | ████████████████████████████████████████  2873
   9 ms | ███████████████  1107
  10 ms | ██  174
  11 ms | █  43
  12 ms |   11
  13 ms |   12
  14 ms |   6
  15 ms |   14
  16 ms | █  53
  17 ms | ██  170
  18 ms | ███  184
  19 ms | ███  216
  20 ms | ████  310
  21 ms | █████  328
  22 ms | ███  237
  23 ms | █  100
  24 ms | █  62
  25 ms |   35
  26 ms |   24
  27 ms |   8
  28 ms |   6
  29 ms |   6
  30 ms |   4
  31 ms | █  63
  32 ms | ████  289
  33 ms | ██████  434
  34 ms | ████  290
  35 ms | ██  111
  36 ms | █  94
  37 ms |   32
  38 ms |   26
  39 ms |   29
  40 ms | █  47
  41 ms | █  82
  42 ms | ██  113
  43 ms | █  104
  44 ms | █  69
  45 ms | █  52
  46 ms | █  43
  47 ms |   28
  48 ms |   29
  49 ms | █  41
  50 ms |   26
  51 ms | █  40
  52 ms | █  49
  53 ms | █  39
  54 ms | █  36
  55 ms |   29
  56 ms |   18
  57 ms |   7
  58 ms |   2
  59 ms |   4
  60 ms |   2
  61 ms |   1
  63 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `seed` = `27182.00`
- `blocks_placed` = `314075.00`
- `fps_1pct_low` = `17.94`
- `preset_long` = `0.00`
- `preset_quick` = `0.00`
- `phase_count` = `4.00`
- `entity_count_delta` = `17.00`
- `preload_duration_ms` = `44.00`
- `fps_0p1pct_low` = `16.71`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `fps_harmonic_avg` = `60.48`
- `phase` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `75.00`
- `shader_in_use` = `1.00`
- `segment_count` = `19.00`
- `trees_built` = `173.00`
- `villagers_spawned` = `36.00`
- `terrain_area_blocks` = `43473.00`
- `iris_present` = `1.00`
- `entity_count_sample_end` = `92.00`

### Pack + Shader — lowEnd.zip + pbr.zip (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 84337 ms  |  Sample ticks: 0

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
- `aborted_state` = `SAMPLING`
- `status` = `failed`

