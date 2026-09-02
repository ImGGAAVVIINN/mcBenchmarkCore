# FPS Test session — 2026-09-01T15:09:00.828668794+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader Benchmark (showcase)](#pack--shader-benchmark-showcase) | Showcase | 116.4 | 36.4 | 15.7 | 21.10 | 0.54 | 19 | 255 |

## Details

### Pack + Shader Benchmark (showcase) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `116.37`, min `11.00`, p50 `118.02`, p95 `139.04`, p99 `334.29`, 1%low `36.38`, 0.1%low `15.67`, std `100.61`

**Frame time (ms)**  avg `10.24`, p50 `8.47`, p95 `18.72`, p99 `21.10`, p99.9 `35.31`, max `90.89`

**Client tick (ms)**  avg `0.54`, p95 `0.72`, max `1.25`

**Memory**  start `786 MB`, end `1041 MB`, peak `1041 MB`, GC `19 events / 84 ms`

**FPS over sampling window (ASCII):**

```
181.8 |                                     █                                          
174.6 |                                     █                                          
167.4 |                                     █                        █                 
160.2 |                                     █                      █ █           █ █   
152.9 |                                     █            █         █ █     █     █ ██  
145.7 |                           █         █        █   █         █ █     █  █  █ ██  
138.5 |          █    █           █         █        █   █         █ █     █  █  █ ██  
131.3 |          █    █         █ █         █        █   █         █ █     █  █  █ ██  
124.1 |  █       █  █ █         █ █    █    █        █   █         ███     █  █  █ ██  
116.9 | ██  █ ██ █  █ █         █ █    █    █        █   █         ███     █  █  █ ███ 
109.7 | ███████████████████ █ █ ████  ██ █ ██ █ ██ █ ██ ██ █ ██ █  ███  █ ██ ██ ██████ 
102.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   11
   1 ms |   6
   2 ms |   3
   3 ms |   4
   4 ms |   4
   5 ms | █  16
   6 ms | ██  40
   7 ms | ███████████  261
   8 ms | ████████████████████████████████████████  963
   9 ms | ████████  192
  10 ms | █  16
  11 ms |   5
  12 ms |   2
  13 ms | █  15
  14 ms | ██  43
  15 ms | █████  125
  16 ms | ███  69
  17 ms | ██  49
  18 ms | ██  43
  19 ms | ██  40
  20 ms | █  24
  21 ms |   12
  22 ms |   2
  23 ms |   3
  26 ms |   1
  30 ms |   1
  35 ms |   1
  36 ms |   1
  90 ms |   1
```

**Extras:**

- `status` = `failed`
- `resource_pack` = `fpstest_benchmark_pack`
- `setup_status` = `FAILED`
- `fail_reason` = `resource pack 'fpstest_benchmark_pack' not found`
- `shader_pack` = `highEnd`
- `seed` = `27182.00`
- `preset_quick` = `1.00`
- `preload_duration_ms` = `51.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `15.67`
- `entity_count_sample_end` = `1.00`
- `fps_harmonic_avg` = `97.68`
- `fps_1pct_low` = `36.38`

