# FPS Test session — 2026-09-02T17:06:31.286849887+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [LowEnd Shader](#lowend-shader) | Showcase | 110.6 | 22.0 | 19.7 | 42.96 | 0.84 | 76 | 277 |
| 2 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Details

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193220 ms  |  Sample ticks: 3600

**FPS**  avg `110.58`, min `15.48`, p50 `116.91`, p95 `217.79`, p99 `291.46`, 1%low `21.97`, 0.1%low `19.65`, std `58.47`

**Frame time (ms)**  avg `13.09`, p50 `8.55`, p95 `34.01`, p99 `42.96`, p99.9 `47.03`, max `64.58`

**Client tick (ms)**  avg `0.84`, p95 `1.16`, max `6.24`

**Memory**  start `961 MB`, end `1208 MB`, peak `1239 MB`, GC `76 events / 302 ms`

**FPS over sampling window (ASCII):**

```
139.6 |                                                    █                ████       
129.7 |                                                 █████    ████   ████████       
119.9 |█     ██        ███         █    ██  █ ███████████████   █████  █████████       
110.0 |██ ██████████████████████████████████████████████████████████████████████       
100.2 |█████████████████████████████████████████████████████████████████████████       
 90.3 |█████████████████████████████████████████████████████████████████████████       
 80.5 |█████████████████████████████████████████████████████████████████████████       
 70.6 |█████████████████████████████████████████████████████████████████████████       
 60.8 |█████████████████████████████████████████████████████████████████████████       
 50.9 |█████████████████████████████████████████████████████████████████████████       
 41.0 |█████████████████████████████████████████████████████████████████████████       
 31.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   24
   3 ms | █████  391
   4 ms | ███████  501
   5 ms | ███████████  793
   6 ms | ██████████████  1060
   7 ms | ████████████████████████████  2107
   8 ms | ████████████████████████████████████████  3019
   9 ms | █████████████████  1277
  10 ms | ████  310
  11 ms | █  75
  12 ms |   26
  13 ms |   14
  14 ms |   9
  15 ms |   11
  16 ms | █  44
  17 ms | █  108
  18 ms | ███  200
  19 ms | █████  354
  20 ms | ██████  485
  21 ms | ███████  506
  22 ms | ██████  443
  23 ms | ████  314
  24 ms | ███  222
  25 ms | ██  138
  26 ms | █  86
  27 ms |   30
  28 ms |   34
  29 ms |   24
  30 ms |   24
  31 ms | █  40
  32 ms | ██  174
  33 ms | ███  216
  34 ms | ███  204
  35 ms | █  91
  36 ms | █  60
  37 ms | █  44
  38 ms | █  42
  39 ms |   27
  40 ms |   31
  41 ms |   28
  42 ms |   29
  43 ms |   32
  44 ms |   34
  45 ms |   23
  46 ms |   30
  47 ms |   7
  48 ms |   3
  49 ms |   2
  50 ms |   2
  55 ms |   1
  57 ms |   1
  64 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `resource_pack` = `none`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `entity_count_delta` = `16.00`
- `phase_count` = `4.00`
- `preset_quick` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.97`
- `blocks_placed` = `314075.00`
- `seed` = `27182.00`
- `entity_count_sample_end` = `90.00`
- `iris_present` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `villagers_spawned` = `36.00`
- `trees_built` = `173.00`
- `segment_count` = `19.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `74.00`
- `preload_chunks` = `81.00`
- `phase` = `0.00`
- `fps_harmonic_avg` = `76.40`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.65`
- `preload_duration_ms` = `34.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 79917 ms  |  Sample ticks: 0

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

- `status` = `failed`
- `aborted_state` = `SAMPLING`
- `fail_reason` = `user pressed ESC`

