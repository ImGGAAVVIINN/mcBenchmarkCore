# FPS Test session — 2026-09-01T16:29:51.375959323+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader Benchmark (showcase)](#pack--shader-benchmark-showcase) | Showcase | 113.0 | 44.8 | 31.3 | 20.64 | 0.52 | 19 | 391 |

## Details

### Pack + Shader Benchmark (showcase) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `113.05`, min `25.09`, p50 `118.27`, p95 `132.84`, p99 `221.43`, 1%low `44.82`, 0.1%low `31.31`, std `87.11`

**Frame time (ms)**  avg `10.21`, p50 `8.46`, p95 `18.09`, p99 `20.64`, p99.9 `23.45`, max `39.85`

**Client tick (ms)**  avg `0.52`, p95 `0.74`, max `1.28`

**Memory**  start `694 MB`, end `793 MB`, peak `1085 MB`, GC `19 events / 78 ms`

**FPS over sampling window (ASCII):**

```
174.6 |                                            █                                   
168.1 |                                            █               █                   
161.6 |                                            █             █ █                   
155.1 |              █          █                  █             █ █                   
148.6 |              █          █                  █     █       █ █                   
142.1 |              █          █                  █     █       █ █                   
135.6 | █ █          █          █                  █     █       █ █                   
129.1 | █ █  █       █          █          █       █     █       █ █                   
122.6 | █ █  █       █          █          █       █     █       █ █                   
116.1 |████  █    █  █          █          █       █     █       █ █                   
109.6 |████ ████████████ █  █  ████ █  █ █████ ██ ██ █  ████ ██ ██ █  █  █  █  █ █  █  
103.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   7
   1 ms |   3
   2 ms |   2
   3 ms |   4
   4 ms |   9
   5 ms |   4
   6 ms | █  27
   7 ms | ████████████  294
   8 ms | ████████████████████████████████████████  975
   9 ms | ███████  172
  10 ms | █  13
  11 ms |   8
  12 ms |   3
  13 ms |   3
  14 ms | ██  54
  15 ms | █████  130
  16 ms | ████  90
  17 ms | ██  60
  18 ms | ██  39
  19 ms | █  31
  20 ms | █  22
  21 ms |   6
  22 ms |   1
  23 ms |   1
  24 ms |   1
  39 ms |   1
```

**Extras:**

- `fail_reason` = `resource pack 'pbr' not found`
- `setup_status` = `FAILED`
- `resource_pack` = `pbr`
- `status` = `failed`
- `shader_pack` = `highEnd`
- `fps_harmonic_avg` = `97.97`
- `entity_count_sample_end` = `1.00`
- `fps_0p1pct_low` = `31.31`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `50.00`
- `preset_quick` = `1.00`
- `seed` = `27182.00`
- `fps_1pct_low` = `44.82`

