# FPS Test session — 2026-09-01T15:17:36.595779566+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader Benchmark (showcase)](#pack--shader-benchmark-showcase) | Showcase | 113.9 | 44.2 | 38.9 | 21.16 | 0.53 | 18 | 123 |

## Details

### Pack + Shader Benchmark (showcase) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `113.92`, min `38.67`, p50 `118.63`, p95 `141.52`, p99 `279.12`, 1%low `44.25`, 0.1%low `38.89`, std `88.21`

**Frame time (ms)**  avg `10.28`, p50 `8.43`, p95 `19.25`, p99 `21.16`, p99.9 `25.04`, max `25.86`

**Client tick (ms)**  avg `0.53`, p95 `0.71`, max `11.23`

**Memory**  start `931 MB`, end `865 MB`, peak `1055 MB`, GC `18 events / 87 ms`

**FPS over sampling window (ASCII):**

```
174.2 |                                                       █   █                    
167.8 |                                                       █   █    █         █     
161.4 |                                         █             █   █    █         █     
155.1 |                                         █             █   █    █         █     
148.7 |                                         █             █   █    █         █     
142.3 |█                                        ██            █   █    █         █     
136.0 |█                                        ██            █   █    █         █     
129.6 |█                                        ██            █   █    █         █     
123.2 |█ █   █     █ █    ██                    ██            █   █    █         █     
116.9 |█ █ █ ██   ████ █  ██                    ██       █    █   █    █   █     █     
110.5 |██████████████████ ███ █  █  █  █  █ █ █ ██████ █ ██ █ █   ██   █   █ ██████    
104.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms |   2
   2 ms |   6
   3 ms |   10
   4 ms | █  12
   5 ms | █  16
   6 ms | ██  42
   7 ms | █████████████  299
   8 ms | ████████████████████████████████████████  936
   9 ms | ███████  163
  10 ms | █  16
  11 ms |   2
  12 ms |   2
  13 ms | █  14
  14 ms | ███  59
  15 ms | ██  58
  16 ms | ███  61
  17 ms | ███  59
  18 ms | ███  68
  19 ms | ██  50
  20 ms | ██  37
  21 ms | █  19
  22 ms |   5
  23 ms |   2
  25 ms |   3
```

**Extras:**

- `shader_pack` = `highEnd`
- `fail_reason` = `resource pack 'fpstest_benchmark_pack' not found`
- `setup_status` = `FAILED`
- `resource_pack` = `fpstest_benchmark_pack`
- `status` = `failed`
- `preset_quick` = `1.00`
- `seed` = `27182.00`
- `fps_1pct_low` = `44.25`
- `fps_harmonic_avg` = `97.30`
- `entity_count_sample_end` = `1.00`
- `fps_0p1pct_low` = `38.89`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `50.00`

