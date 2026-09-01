# FPS Test session — 2026-09-01T11:23:37.60095695+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 121.4 | 29.3 | 24.2 | 29.81 | 0.42 | 34 | 816 |

## Details

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `121.41`, min `23.53`, p50 `117.69`, p95 `237.77`, p99 `530.77`, 1%low `29.26`, 0.1%low `24.20`, std `83.42`

**Frame time (ms)**  avg `10.98`, p50 `8.50`, p95 `22.58`, p99 `29.81`, p99.9 `37.54`, max `42.50`

**Client tick (ms)**  avg `0.42`, p95 `0.61`, max `1.36`

**Memory**  start `973 MB`, end `1150 MB`, peak `1789 MB`, GC `34 events / 211 ms`

**FPS over sampling window (ASCII):**

```
161.5 |                                █                                               
156.3 |                                █     █                                         
151.0 | █                            █ █     █                                         
145.8 | █                            █ █     █           █                             
140.6 | █             █              █ █     █           █            █         █      
135.3 | █           █ █  █ █   █     █ █     █  █ █      █            █ █       █      
130.1 | █           █ █  ███   █     █ █     █  █ ██    ██ █      █   █ █       █     █
124.8 |██      █    ███  ███   █     █ █    ██  █ ███   ██ ██     █  ██ █    █  █  █  █
119.6 |██      █    ███  ███ ████    ███  █████ █ ████ ███ ████   █████ █ █  █ ██  ████
114.4 |████   ██ █  ████ ████████ █  ███  █████ ██████████ ████ ███████ █ █ ██████ ████
109.1 |██████████████████████████ ███████ █████████████████████████████████ ███████████
103.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  22
   2 ms | ██  26
   3 ms | ███  35
   4 ms | █████  64
   5 ms | ████  51
   6 ms | ███████  82
   7 ms | ████████████████████████████  345
   8 ms | ████████████████████████████████████████  500
   9 ms | ██████████  125
  10 ms | ███  42
  11 ms | █  18
  12 ms | ██  25
  13 ms | █  15
  14 ms | █  17
  15 ms | ███  37
  16 ms | █████  63
  17 ms | ████  47
  18 ms | █████  57
  19 ms | ████  52
  20 ms | █████  61
  21 ms | ███  36
  22 ms | ██  19
  23 ms | ██  23
  24 ms | █  9
  25 ms | █  9
  26 ms | █  7
  27 ms | █  10
  28 ms |   4
  29 ms |   4
  30 ms |   2
  31 ms |   1
  32 ms |   3
  33 ms |   4
  34 ms |   1
  35 ms |   2
  36 ms |   2
  40 ms |   1
  42 ms |   1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `surface_water_ratio` = `0.00`
- `entity_count_sample_start` = `47.00`
- `flyby_distance_blocks` = `720.00`
- `preset_long` = `0.00`
- `seed` = `7499.00`
- `preload_chunks` = `68.00`
- `fps_0p1pct_low` = `24.20`
- `fps_harmonic_avg` = `91.09`
- `fps_1pct_low` = `29.26`
- `x_offset_used` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `z_offset_used` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `-46.00`
- `stamped_blocks` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `preload_duration_ms` = `45.00`

