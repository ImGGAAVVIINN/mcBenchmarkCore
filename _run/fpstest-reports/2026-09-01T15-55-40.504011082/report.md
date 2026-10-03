# FPS Test session — 2026-09-01T15:56:13.554639644+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader Benchmark (showcase)](#pack--shader-benchmark-showcase) | Showcase | 110.5 | 39.5 | 28.7 | 21.04 | 0.52 | 15 | 175 |

## Details

### Pack + Shader Benchmark (showcase) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `110.54`, min `28.55`, p50 `118.42`, p95 `133.42`, p99 `174.87`, 1%low `39.48`, 0.1%low `28.70`, std `64.59`

**Frame time (ms)**  avg `10.27`, p50 `8.44`, p95 `18.43`, p99 `21.04`, p99.9 `34.64`, max `35.03`

**Client tick (ms)**  avg `0.52`, p95 `0.70`, max `1.26`

**Memory**  start `942 MB`, end `937 MB`, peak `1117 MB`, GC `15 events / 68 ms`

**FPS over sampling window (ASCII):**

```
162.8 |                                                                            █   
157.2 |                                                                 █          █   
151.7 |          █ █                   █                                █          █   
146.2 |          █ █                   █                                █          █   
140.7 |          █ █                   █                                █          █   
135.2 |        █ █ █                   █                                █          █   
129.7 |        █ █ █                   █                                █          █   
124.2 |        █ █ █                   █                                █          █   
118.7 |   █  █ █ █ █  █                █                                █          █   
113.2 |████  █ █ ████ ██               █ █                              █          █   
107.7 |████████████████████  ██ ████ ███ ████  █ ███ █  ██ █████████ ██████ █  █ ███ █ 
102.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms |   4
   2 ms |   4
   4 ms |   4
   5 ms |   6
   6 ms | █  34
   7 ms | ████████████  285
   8 ms | ████████████████████████████████████████  950
   9 ms | █████████  203
  10 ms | █  15
  11 ms |   2
  12 ms |   4
  13 ms |   5
  14 ms | ██  44
  15 ms | █████  116
  16 ms | ████  101
  17 ms | ███  60
  18 ms | █  31
  19 ms | █  27
  20 ms | █  28
  21 ms |   9
  22 ms |   3
  23 ms |   1
  24 ms |   1
  28 ms |   1
  30 ms |   2
  34 ms |   2
  35 ms |   1
```

**Extras:**

- `setup_status` = `FAILED`
- `fail_reason` = `resource pack 'fpstest_benchmark_pack' not found`
- `shader_pack` = `highEnd`
- `status` = `failed`
- `resource_pack` = `fpstest_benchmark_pack`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `28.70`
- `entity_count_sample_end` = `1.00`
- `fps_harmonic_avg` = `97.33`
- `fps_1pct_low` = `39.48`
- `seed` = `27182.00`
- `preset_quick` = `1.00`
- `preload_duration_ms` = `35.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`

