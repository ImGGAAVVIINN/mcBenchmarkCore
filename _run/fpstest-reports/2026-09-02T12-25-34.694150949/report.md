# FPS Test session — 2026-09-02T12:29:01.940389422+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [PBR + Shader Showcase](#pbr--shader-showcase) | Showcase | 64.7 | 17.6 | 16.5 | 53.90 | 0.83 | 55 | 444 |

## Details

### PBR + Shader Showcase (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195627 ms  |  Sample ticks: 3600

**FPS**  avg `64.70`, min `16.07`, p50 `46.14`, p95 `177.39`, p99 `212.15`, 1%low `17.60`, 0.1%low `16.52`, std `48.32`

**Frame time (ms)**  avg `23.43`, p50 `21.67`, p95 `45.49`, p99 `53.90`, p99.9 `59.72`, max `62.23`

**Client tick (ms)**  avg `0.83`, p95 `1.11`, max `6.08`

**Memory**  start `922 MB`, end `835 MB`, peak `1367 MB`, GC `55 events / 241 ms`

**FPS over sampling window (ASCII):**

```
 83.5 |█       █        █                                                              
 78.6 |█     █████  █   ████     █      █        █ █  █ █  ██     █                    
 73.7 |████████████████████████████████████████████████████████ ███                    
 68.8 |████████████████████████████████████████████████████████████                    
 63.9 |█████████████████████████████████████████████████████████████                   
 59.0 |█████████████████████████████████████████████████████████████                   
 54.1 |█████████████████████████████████████████████████████████████                   
 49.2 |█████████████████████████████████████████████████████████████                   
 44.3 |█████████████████████████████████████████████████████████████                   
 39.5 |█████████████████████████████████████████████████████████████                   
 34.6 |█████████████████████████████████████████████████████████████               █  █
 29.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ██████████  152
   5 ms | ███████████████████████  351
   6 ms | ███████████████████  298
   7 ms | ██████████████  210
   8 ms | ████████████  179
   9 ms | ███████████  171
  10 ms | ███████████████  240
  11 ms | ██████████████████████  341
  12 ms | ██████████████████████████  402
  13 ms | █████████████  207
  14 ms | █████  78
  15 ms | █  21
  16 ms |   6
  17 ms | █  12
  18 ms | ██  26
  19 ms | ██████████  158
  20 ms | ███████████████████████████████████  548
  21 ms | ████████████████████████████████████████  622
  22 ms | ██████████████████████  335
  23 ms | ████████████████  243
  24 ms | █████████████████  266
  25 ms | █████████████  197
  26 ms | ███████  108
  27 ms | █████  77
  28 ms | ███████  103
  29 ms | ██████  92
  30 ms | ███████  112
  31 ms | ████  55
  32 ms | █████  78
  33 ms | ██████  96
  34 ms | █████  81
  35 ms | █████████  144
  36 ms | ███████████  178
  37 ms | ██████████  149
  38 ms | ███████  104
  39 ms | ████  63
  40 ms | █████  79
  41 ms | ██████  99
  42 ms | ████████████  183
  43 ms | ██████████████  213
  44 ms | ██████████  162
  45 ms | ██████  92
  46 ms | ████  68
  47 ms | ██  26
  48 ms | █  12
  49 ms | ██  26
  50 ms | ██  32
  51 ms | ███  46
  52 ms | ███  40
  53 ms | ██  27
  54 ms | █  18
  55 ms | █  11
  56 ms | █  8
  57 ms | █  9
  58 ms | █  12
  59 ms | █  9
  60 ms |   4
  61 ms |   1
  62 ms |   1
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `resource_pack` = `pbr.zip`
- `seed` = `27182.00`
- `segment_count` = `19.00`
- `entity_count_delta` = `14.00`
- `preset_quick` = `0.00`
- `iris_present` = `1.00`
- `fps_0p1pct_low` = `16.52`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `527.00`
- `fps_harmonic_avg` = `42.68`
- `blocks_placed` = `314075.00`
- `trees_built` = `173.00`
- `villagers_spawned` = `36.00`
- `fps_1pct_low` = `17.60`
- `other_entities_spawned` = `58.00`
- `shader_in_use` = `1.00`
- `entity_count_sample_start` = `76.00`
- `entity_count_sample_end` = `90.00`
- `preset_long` = `0.00`
- `terrain_area_blocks` = `43473.00`
- `preset_full` = `0.00`

