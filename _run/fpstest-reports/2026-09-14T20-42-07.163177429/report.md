# MC Benchmark Core session — 2026-09-14T20:58:15.982115712+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 297.8 | 31.7 | 18.4 | 26.83 | 0.83 | 1 | 180 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 3 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 4 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 5 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 7 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 10 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 16 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 17 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 18 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 21 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 22 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 23 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 24 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 26 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 27 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 29 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 30 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 31 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 34 | [Badlands flyby](#badlands-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 390.2 | 43.4 | 37.9 | 21.78 | 0.39 | 1 | 508 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 48.4 | 16.6 | 15.2 | 58.31 | 0.88 | 25 | 665 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 68.0 | 16.4 | 13.4 | 57.95 | 0.83 | 21 | 470 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 53.0 | 16.2 | 14.1 | 59.23 | 0.83 | 20 | 767 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 35.9 | 16.2 | 14.2 | 59.82 | 0.82 | 23 | 243 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze)
- [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze)
- [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze)
- [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world)
- [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world)
- [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Cherry grove flyby](#cherry-grove-flyby)
- [Badlands flyby](#badlands-flyby)
- [Badlands flyby](#badlands-flyby)
- [Windswept hills flyby](#windswept-hills-flyby)
- [Idle Baseline](#idle-baseline)
- [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously)
- [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset)
- [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide)
- [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm)
- [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators)
- [LowEnd Shader](#lowend-shader)
- [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures)
- [HighEnd Shader](#highend-shader)
- [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `297.77`, min `17.69`, p50 `117.36`, p95 `1194.19`, p99 `1396.59`, 1%low `31.68`, 0.1%low `18.37`, std `395.15`

**Frame time (ms)**  avg `10.07`, p50 `8.52`, p95 `21.26`, p99 `26.83`, p99.9 `34.18`, max `56.51`

**Client tick (ms)**  avg `0.83`, p95 `1.35`, max `8.33`

**Memory**  start `497 MB`, end `656 MB`, peak `677 MB`, GC `1 events / 4 ms`

**FPS over sampling window (ASCII):**

```
455.0 |                                                       █           █      █     
429.9 |                      █           █                    █           █  █   █     
404.8 |                      █           █                   ██           █  █   █     
379.7 |                      █           █ █                 ███     █    █  █   ██    
354.6 |                      █   █       █ █  █  █    █   █  ███     █   ██  █  ███    
329.5 |                      █   █ █   ███ ██ █  ██   █   █  ████  █ █   ██ ██ ████    
304.4 |            █    █    █   █ ███ ██████ █  ██ █ █ █ ██ ████ ██████ ██ ██ ████ █ █
279.3 |            █   ██    █  ██ ███ ██████████████ █ █ ██ ██████████████████████████
254.2 |           ███  ██ █████ ██ ███ ██████████████████ █████████████████████████████
229.1 |██    █  █████████ █████████████████████████████████████████████████████████████
204.0 |███  ██  ███████████████████████████████████████████████████████████████████████
178.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████  224
   1 ms | ███████████████  212
   2 ms | ██  23
   3 ms | █  9
   4 ms |   6
   5 ms |   4
   6 ms | █  14
   7 ms | ██████████  134
   8 ms | ████████████████████████████████████████  550
   9 ms | ██████████  138
  10 ms | █  18
  11 ms | █  11
  12 ms |   6
  13 ms |   1
  14 ms | █  10
  15 ms | █████  63
  16 ms | █████████  123
  17 ms | ███████████  150
  18 ms | ██████  89
  19 ms | ████  57
  20 ms | ███  38
  21 ms | ██  29
  22 ms | █  18
  23 ms | █  13
  24 ms | █  15
  25 ms |   5
  26 ms | █  8
  27 ms |   6
  28 ms |   3
  29 ms |   5
  31 ms |   1
  32 ms |   1
  33 ms |   1
  52 ms |   1
  56 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `portal` | 160 | 248 | 203.9 | 25.21 |
| `ALL_TOGETHER` | 1680 | 248 | 263.9 | 28.24 |
| `sculk_charge_pop` | 240 | 248 | 288.4 | 27.77 |
| `smoke` | 160 | 248 | 330.3 | 25.92 |
| `flame` | 160 | 248 | 301.2 | 27.57 |
| `dripping_water` | 240 | 248 | 327.7 | 22.45 |
| `dragon_breath` | 160 | 248 | 339.2 | 23.83 |
| `end_rod` | 240 | 248 | 325.7 | 21.26 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `31.68`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `82.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `99.33`
- `fps_0p1pct_low` = `18.37`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 789 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 3307 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 5515 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 7781 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 10066 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 12141 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 14281 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 16403 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 18548 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 62 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 2349 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 4466 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 6673 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 1 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `PREPARING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 2212 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 4412 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 6566 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 8996 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 11308 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 13475 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 15714 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 17919 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 21974 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 45 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 3231 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 6539 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 0 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `PREPARING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 3616 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 7003 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 10262 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 39 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 1802 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 5056 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 60 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 999 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 845 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 1 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `PREPARING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 753 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 1201 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `390.20`, min `36.25`, p50 `117.66`, p95 `1537.39`, p99 `1848.67`, 1%low `43.35`, 0.1%low `37.89`, std `545.72`

**Frame time (ms)**  avg `9.61`, p50 `8.50`, p95 `18.73`, p99 `21.78`, p99.9 `24.85`, max `27.58`

**Client tick (ms)**  avg `0.39`, p95 `0.49`, max `0.66`

**Memory**  start `670 MB`, end `490 MB`, peak `1178 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
598.6 |                                                            █                   
564.9 |                                                   █        █    █          █   
531.2 |                                                   █     █  █    █          █   
497.5 |                                     █  █          █     █  █    █    █   █ █   
463.7 |                                █    █  █   █  █ ███  █ ██  █   ██  ███  ██ █ ██
430.0 |          █  █              ██  █    █  █   █  █████  █ ██  █  ███  █████████ ██
396.3 |      ██  █  █  █           ███ █ █  ██ █ ███ ██████  █ ██  ███████ ████████████
362.6 |   ██ ██  █ ██  █       ██  ███ ███  ██ ███████████████████ ███████ ████████████
328.9 |   ██ █████ ███ ██    █ ███ ███ ███ ███ ███████████████████████████ ████████████
295.1 |██ ████████ ███████ ███████ ███ ████████████████████████████████████████████████
261.4 |██ ████████████████ ████████████████████████████████████████████████████████████
227.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████████  421
   1 ms | █████  81
   2 ms | ██  29
   3 ms |   4
   4 ms |   5
   5 ms |   2
   6 ms |   3
   7 ms | ██████  95
   8 ms | ████████████████████████████████████████  655
   9 ms | ███  47
  10 ms |   2
  11 ms |   3
  12 ms |   6
  13 ms | █  9
  14 ms | ██  36
  15 ms | ██████  102
  16 ms | █████████████  205
  17 ms | ████████████  198
  18 ms | █████  84
  19 ms | ██  30
  20 ms | ██  30
  21 ms | █  17
  22 ms | █  10
  23 ms |   5
  24 ms |   1
  25 ms |   1
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `104.09`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `37.89`
- `seed` = `8053.00`
- `preload_duration_ms` = `19.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `43.35`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195829 ms  |  Sample ticks: 3600

**FPS**  avg `48.41`, min `13.94`, p50 `30.39`, p95 `125.04`, p99 `306.53`, 1%low `16.55`, 0.1%low `15.20`, std `52.55`

**Frame time (ms)**  avg `29.62`, p50 `32.91`, p95 `51.17`, p99 `58.31`, p99.9 `62.13`, max `71.72`

**Client tick (ms)**  avg `0.88`, p95 `1.16`, max `3.14`

**Memory**  start `855 MB`, end `1123 MB`, peak `1520 MB`, GC `25 events / 136 ms`

**FPS over sampling window (ASCII):**

```
181.6 |             █                                                                  
167.9 |             █                                                                  
154.2 |            ██                                                                  
140.6 |█           ███                                                                 
126.9 |██          ███                                                                 
113.2 |███         ███                                                                 
 99.5 |███ █ █    ████                                                                 
 85.8 |███████████████                                                                 
 72.1 |███████████████                                                                 
 58.4 |███████████████                                                                 
 44.7 |████████████████ █ █     █                                                      
 31.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  14
   2 ms | ███  40
   3 ms | ██  22
   4 ms | █  9
   5 ms | ████  46
   6 ms | █████  58
   7 ms | █████████  116
   8 ms | ███████████████████  241
   9 ms | ███████  93
  10 ms | ██  29
  11 ms | █  13
  12 ms | █  15
  13 ms | ██  26
  14 ms | ███  32
  15 ms | ███  36
  16 ms | █████  65
  17 ms | ████████████  146
  18 ms | ████████████████  200
  19 ms | ███████████████  195
  20 ms | ███████████████████  244
  21 ms | ████████████████████  258
  22 ms | █████████████████  217
  23 ms | ████████████  155
  24 ms | ████████  99
  25 ms | ██████  73
  26 ms | █████  66
  27 ms | ████  56
  28 ms | ████  55
  29 ms | ████  55
  30 ms | █████  63
  31 ms | ███████  91
  32 ms | ██████████████████  232
  33 ms | ████████████████████████  306
  34 ms | ████████████████████████████████████████  505
  35 ms | █████████████████████████████████  418
  36 ms | ██████████████████████████████  375
  37 ms | █████████████████████  264
  38 ms | ██████████  132
  39 ms | ██████  78
  40 ms | ████  48
  41 ms | ███  44
  42 ms | █████  60
  43 ms | ████  52
  44 ms | ███████  83
  45 ms | ███████  93
  46 ms | ██████  74
  47 ms | █████  57
  48 ms | ███  39
  49 ms | ███  32
  50 ms | ████  46
  51 ms | ████  52
  52 ms | ███  34
  53 ms | ███  43
  54 ms | ██  28
  55 ms | ██  22
  56 ms | ██  24
  57 ms | ███  38
  58 ms | ██  22
  59 ms | ██  21
  60 ms | █  12
  61 ms | █  7
  62 ms |   5
  63 ms |   1
  66 ms |   1
  68 ms |   1
  71 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `116.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `33.77`
- `fps_1pct_low` = `16.55`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `72.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `15.20`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195129 ms  |  Sample ticks: 3600

**FPS**  avg `68.05`, min `10.38`, p50 `35.67`, p95 `212.29`, p99 `557.78`, 1%low `16.43`, 0.1%low `13.39`, std `89.62`

**Frame time (ms)**  avg `26.48`, p50 `28.03`, p95 `50.08`, p99 `57.95`, p99.9 `63.75`, max `96.31`

**Client tick (ms)**  avg `0.83`, p95 `1.10`, max `8.05`

**Memory**  start `1193 MB`, end `1053 MB`, peak `1663 MB`, GC `21 events / 128 ms`

**FPS over sampling window (ASCII):**

```
191.7 |                                                           ███  █               
177.1 |                                                        █ ███████               
162.5 |                                                        █ ████████              
147.9 |                                                       ███████████              
133.3 |                                                       ████████████             
118.7 |                                                       █████████████ ██  █    ██
104.1 |                                                       █████████████████████████
 89.5 |                                                       █████████████████████████
 74.9 |                                                       █████████████████████████
 60.3 |                                                      ██████████████████████████
 45.7 |                                                      ██████████████████████████
 31.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███████  104
   2 ms | █████  76
   3 ms | ███  47
   4 ms | ██████████  137
   5 ms | ███  44
   6 ms | ███  46
   7 ms | ████████████████  224
   8 ms | ████████████████████████████████████████  568
   9 ms | ████████████  176
  10 ms | ███  36
  11 ms | ██  25
  12 ms | ██  26
  13 ms | ███  37
  14 ms | █████  65
  15 ms | █████  67
  16 ms | ███████  106
  17 ms | ██████████████  194
  18 ms | ███████████████  219
  19 ms | ███████████████  211
  20 ms | ██████████████  201
  21 ms | █████████████  187
  22 ms | █████████████  181
  23 ms | ██████████  147
  24 ms | ████████  112
  25 ms | █████  67
  26 ms | ███  49
  27 ms | ███  45
  28 ms | █████  64
  29 ms | ██  35
  30 ms | █████  65
  31 ms | ████████  107
  32 ms | ████████████████████  288
  33 ms | ████████████████████████████  391
  34 ms | █████████████████████████████████  470
  35 ms | ███████████████████████████  382
  36 ms | █████████████████████  294
  37 ms | ██████████████  200
  38 ms | █████████  127
  39 ms | █████  71
  40 ms | ████  53
  41 ms | ████  50
  42 ms | ████  55
  43 ms | ███  47
  44 ms | ████  63
  45 ms | █████  65
  46 ms | █████  76
  47 ms | █████  75
  48 ms | ███  40
  49 ms | ███  42
  50 ms | ██  33
  51 ms | ██  32
  52 ms | ███  42
  53 ms | ██  30
  54 ms | ██  35
  55 ms | ██  33
  56 ms | ██  35
  57 ms | ███  39
  58 ms | ██  30
  59 ms | █  13
  60 ms |   6
  61 ms |   3
  62 ms |   2
  63 ms |   2
  64 ms |   2
  65 ms |   1
  67 ms |   1
  73 ms |   1
  91 ms |   1
  96 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `116.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `37.76`
- `fps_1pct_low` = `16.43`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `86.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `13.39`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194382 ms  |  Sample ticks: 3600

**FPS**  avg `53.00`, min `12.72`, p50 `35.44`, p95 `139.92`, p99 `272.31`, 1%low `16.21`, 0.1%low `14.07`, std `49.48`

**Frame time (ms)**  avg `28.57`, p50 `28.22`, p95 `53.64`, p99 `59.23`, p99.9 `64.21`, max `78.63`

**Client tick (ms)**  avg `0.83`, p95 `1.11`, max `8.60`

**Memory**  start `939 MB`, end `781 MB`, peak `1706 MB`, GC `20 events / 98 ms`

**FPS over sampling window (ASCII):**

```
122.9 | █                                                                              
114.6 |███       █ ██ ████                                                             
106.3 |█████  █ ██████████                                                             
 98.0 |███████████████████                                                             
 89.7 |███████████████████                                                             
 81.4 |███████████████████                                                             
 73.1 |███████████████████                                                             
 64.8 |███████████████████                                                             
 56.4 |████████████████████                                                            
 48.1 |████████████████████                                                            
 39.8 |█████████████████████  █  ███  ████ █ ██ ███     ███████    ██                  
 31.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   3
   3 ms | ███████████  95
   4 ms | █████████████  114
   5 ms | █████  40
   6 ms | ██████  50
   7 ms | ███████████████████  164
   8 ms | ██████████████████████████████████████  329
   9 ms | ███████████████  128
  10 ms | ████  35
  11 ms | ███  25
  12 ms | ██  15
  13 ms | ███  25
  14 ms | ██  15
  15 ms | ████  33
  16 ms | ████████  67
  17 ms | █████████████  110
  18 ms | ███████████████████  164
  19 ms | █████████████████████████████  258
  20 ms | ███████████████████████████████████████  343
  21 ms | ████████████████████████████████████████  350
  22 ms | ███████████████████████████████  273
  23 ms | ████████████████████████  206
  24 ms | █████████████  117
  25 ms | ██████████  84
  26 ms | ███████  60
  27 ms | █████  43
  28 ms | ███  28
  29 ms | ██████  54
  30 ms | █████  43
  31 ms | ████████  69
  32 ms | █████████████████████  180
  33 ms | █████████████████████████  216
  34 ms | ███████████████████████████████████  303
  35 ms | █████████████████████████████████  289
  36 ms | ████████████████████████████████  279
  37 ms | ███████████████████████████████  273
  38 ms | ███████████████████████  204
  39 ms | ██████████████  123
  40 ms | ████████  71
  41 ms | ██████  49
  42 ms | ██████  55
  43 ms | ███████  62
  44 ms | ███████  63
  45 ms | ████████  67
  46 ms | █████████  76
  47 ms | ██████  54
  48 ms | ████  38
  49 ms | ████  39
  50 ms | █████  44
  51 ms | ██████  51
  52 ms | ████████  69
  53 ms | ███████  58
  54 ms | ████████  66
  55 ms | ██████  53
  56 ms | ███  30
  57 ms | ████  38
  58 ms | █████  41
  59 ms | ███  28
  60 ms | ██  15
  61 ms | █  7
  62 ms | █  7
  63 ms |   4
  64 ms |   1
  66 ms |   1
  67 ms |   2
  70 ms |   1
  75 ms |   1
  78 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `116.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `35.00`
- `fps_1pct_low` = `16.21`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `21.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `14.07`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 196061 ms  |  Sample ticks: 3600

**FPS**  avg `35.87`, min `12.84`, p50 `29.10`, p95 `66.63`, p99 `133.89`, 1%low `16.17`, 0.1%low `14.23`, std `20.86`

**Frame time (ms)**  avg `33.49`, p50 `34.36`, p95 `55.69`, p99 `59.82`, p99.9 `63.15`, max `77.88`

**Client tick (ms)**  avg `0.82`, p95 `1.09`, max `1.79`

**Memory**  start `1488 MB`, end `707 MB`, peak `1732 MB`, GC `23 events / 112 ms`

**FPS over sampling window (ASCII):**

```
 41.2 |                                    █      █                                    
 40.4 |                                    █      █                                    
 39.6 |                       ██           █      █                                    
 38.8 |                    █ ███           █      █                          █    █    
 38.0 |                  █ █ ███ █         █    █ █   █  █    █              █    █    
 37.2 |        █         ███ ███ █         █   ██ █   █  █    █              ██   █    
 36.3 |        █    ██  ████ █████  █ █ █  █ █ ████ █ █  █ █ ██  ███         ██ █ █ ██ 
 35.5 |  █     █ █ ████████████████ █ █ ██ ███ ████ ████ █ ████  ████  █     ██ ███ ███
 34.7 |  ███   ███████████████████████████ ████████ ███████████ █████████    ██████ ███
 33.9 |███████ ███████████████████████████ ████████████████████ █████████    ██████████
 33.1 |████████████████████████████████████████████████████████ █████████ █████████████
 32.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   4
   5 ms | ██  16
   6 ms | ██  22
   7 ms | ████  32
   8 ms | ██  18
   9 ms | ███  29
  10 ms | ███  28
  11 ms | ███  31
  12 ms | ███  24
  13 ms | ███  24
  14 ms | ████  40
  15 ms | ███  29
  16 ms | ██████  51
  17 ms | ████████  73
  18 ms | ███████████  102
  19 ms | ████████████████  145
  20 ms | █████████████████  159
  21 ms | ███████████████████████  210
  22 ms | ████████████████████████████████  293
  23 ms | ████████████████████████  215
  24 ms | ████████████████  150
  25 ms | ███████████  100
  26 ms | ██████  59
  27 ms | ██████  51
  28 ms | █████  45
  29 ms | █████  43
  30 ms | ███████  61
  31 ms | ████████  74
  32 ms | ████████████████████  181
  33 ms | ████████████████████████████  252
  34 ms | ████████████████████████████████████████  365
  35 ms | ████████████████████████████████████  328
  36 ms | ████████████████████████████████  291
  37 ms | ████████████████████████████  252
  38 ms | ███████████████████████  208
  39 ms | ██████████  90
  40 ms | ██████  55
  41 ms | █████  47
  42 ms | ██████  53
  43 ms | ████████  74
  44 ms | ██████████  93
  45 ms | █████████  78
  46 ms | ██████  51
  47 ms | █████  50
  48 ms | █████  44
  49 ms | ███████  62
  50 ms | ███████  61
  51 ms | ███████  61
  52 ms | ████████  74
  53 ms | █████████  79
  54 ms | █████████  78
  55 ms | ████████  77
  56 ms | ██████  58
  57 ms | █████  47
  58 ms | ██████  54
  59 ms | ████  33
  60 ms | ███  27
  61 ms | ██  14
  62 ms |   3
  63 ms |   3
  65 ms |   1
  72 ms |   2
  77 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `116.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.86`
- `fps_1pct_low` = `16.17`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `72.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `14.23`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`

