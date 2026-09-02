# FPS Test session — 2026-09-01T15:58:35.427786085+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Pack + Shader Benchmark (showcase)](#pack--shader-benchmark-showcase) | Showcase | 112.7 | 44.4 | 40.2 | 21.46 | 0.54 | 20 | 487 |

## Details

### Pack + Shader Benchmark (showcase) (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `112.70`, min `39.00`, p50 `118.56`, p95 `144.12`, p99 `259.10`, 1%low `44.36`, 0.1%low `40.25`, std `69.17`

**Frame time (ms)**  avg `10.31`, p50 `8.43`, p95 `19.79`, p99 `21.46`, p99.9 `23.81`, max `25.64`

**Client tick (ms)**  avg `0.54`, p95 `0.72`, max `7.10`

**Memory**  start `600 MB`, end `764 MB`, peak `1088 MB`, GC `20 events / 76 ms`

**FPS over sampling window (ASCII):**

```
171.3 |                                                                    █           
165.1 |                                                        █           █           
158.9 |                                                        █           █           
152.7 |                                                        █           █           
146.5 |                                    █                   █           █           
140.3 |                                    █                   █           █           
134.0 |                  █                 █                █  █           █  █      █ 
127.8 |         █        █                 █                █  █           █  █      █ 
121.6 |  █      █ █      █                 █                █  █  █        █  █      █ 
115.4 |██████ █ ███████ ██    █            █         █      █  █  █       ██  █     ██ 
109.2 |█████████████████████ ███ ███ █████ █ ██  █ █ ██ ██████ ██ ███ ██ ███ █████ ███ 
103.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms |   6
   2 ms |   5
   3 ms |   11
   4 ms | █  13
   5 ms | █  21
   6 ms | ██  43
   7 ms | █████████████  300
   8 ms | ████████████████████████████████████████  915
   9 ms | ███████  169
  10 ms |   10
  11 ms |   9
  12 ms |   1
  13 ms | █  20
  14 ms | ███  67
  15 ms | ██  46
  16 ms | ██  52
  17 ms | ██  53
  18 ms | ██  49
  19 ms | ███  66
  20 ms | ██  48
  21 ms | █  22
  22 ms |   9
  23 ms |   1
  24 ms |   1
  25 ms |   1
```

**Extras:**

- `fail_reason` = `resource pack 'fpstest_benchmark_pack' not found`
- `setup_status` = `FAILED`
- `resource_pack` = `fpstest_benchmark_pack`
- `status` = `failed`
- `shader_pack` = `highEnd`
- `fps_harmonic_avg` = `97.03`
- `entity_count_sample_end` = `1.00`
- `fps_0p1pct_low` = `40.25`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `27182.00`
- `fps_1pct_low` = `44.36`

