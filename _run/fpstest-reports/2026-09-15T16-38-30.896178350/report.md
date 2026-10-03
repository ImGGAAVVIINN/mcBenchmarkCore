# MC Benchmark Core session — 2026-09-15T17:09:41.01433779+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 109.9 | 46.6 | 44.7 | 20.95 | 0.48 | 0 | 408 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 3 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 4 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 5 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 7 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 131.8 | 29.3 | 26.9 | 31.33 | 3.04 | 5 | 302 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 134.7 | 27.7 | 26.0 | 34.88 | 3.94 | 16 | 154 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 28.5 | 20.2 | 17.9 | 47.58 | 0.99 | 2 | 476 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 28.4 | 20.2 | 17.3 | 47.13 | 0.53 | 4 | 204 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 31.0 | 16.6 | 16.4 | 59.62 | 3.18 | 2 | 316 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.6 | 16.4 | 16.1 | 59.32 | 2.74 | 2 | 516 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 36.8 | 13.4 | 12.7 | 72.02 | 14.98 | 24 | 440 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 35.9 | 12.7 | 12.1 | 72.47 | 15.57 | 24 | 462 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 28.8 | 19.9 | 17.8 | 48.20 | 1.88 | 2 | 420 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 28.7 | 19.0 | 17.6 | 48.05 | 1.87 | 4 | 276 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.5 | 20.9 | 20.6 | 47.37 | 0.65 | 0 | 536 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 28.1 | 20.8 | 20.6 | 47.25 | 0.28 | 0 | 192 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 28.1 | 20.9 | 20.7 | 47.20 | 0.25 | 1 | 444 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 28.1 | 20.6 | 20.3 | 47.06 | 0.29 | 1 | 264 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 28.2 | 20.7 | 20.3 | 47.24 | 0.28 | 0 | 184 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 28.7 | 16.9 | 15.4 | 50.76 | 0.35 | 38 | 1132 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 29.1 | 16.1 | 13.4 | 56.41 | 0.33 | 30 | 422 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 29.0 | 17.1 | 14.8 | 53.53 | 0.33 | 25 | 802 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 26.3 | 8.7 | n/a | 109.06 | 0.36 | 21 | 1036 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 9.8 | 7.8 | n/a | 121.98 | 0.37 | 22 | 1100 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 9.8 | 7.8 | n/a | 123.53 | 0.34 | 25 | 996 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 9.8 | 7.4 | n/a | 127.74 | 0.44 | 26 | 756 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 9.8 | 7.2 | n/a | 131.73 | 0.44 | 26 | 336 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 9.8 | 8.0 | n/a | 125.10 | 0.37 | 26 | 636 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 9.8 | 7.9 | n/a | 119.20 | 0.32 | 21 | 1374 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 9.8 | 7.8 | n/a | 125.99 | 0.33 | 22 | 694 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 9.8 | 7.6 | n/a | 127.68 | 0.34 | 23 | 160 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 9.8 | 8.7 | n/a | 114.07 | 0.27 | 0 | 88 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 9.8 | 8.2 | n/a | 119.93 | 2.42 | 1 | 1472 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 9.8 | 8.7 | n/a | 114.10 | 0.27 | 0 | 204 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 9.8 | 8.7 | n/a | 114.09 | 0.28 | 0 | 140 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 9.8 | 8.8 | n/a | 113.27 | 0.28 | 0 | 160 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 9.8 | 8.8 | n/a | 113.42 | 0.29 | 0 | 168 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 9.8 | 7.9 | 7.7 | 124.71 | 0.66 | 14 | 728 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 9.8 | 7.9 | 7.5 | 124.10 | 0.64 | 11 | 311 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 9.8 | 7.9 | 7.8 | 125.52 | 0.64 | 10 | 882 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 9.8 | 7.8 | 7.1 | 125.16 | 0.64 | 13 | 604 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [Cows ×200 ring](#cows-200-ring)
- [XP orbs ×500 ring](#xp-orbs-500-ring)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze)
- [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on)
- [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses)
- [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain)
- [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy)
- [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete)
- [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered)
- [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered)
- [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs)
- [Redstone clocks (6×6)](#redstone-clocks-66)
- [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps)
- [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t)
- [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world)
- [Desert flyby (single-biome world)](#desert-flyby-single-biome-world)
- [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world)
- [Snowy plains flyby](#snowy-plains-flyby)
- [Forest flyby](#forest-flyby)
- [Savanna flyby](#savanna-flyby)
- [Swamp flyby](#swamp-flyby)
- [Cherry grove flyby](#cherry-grove-flyby)
- [Badlands flyby](#badlands-flyby)
- [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy)
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

Category: **Particles**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `109.90`, min `44.35`, p50 `117.35`, p95 `129.93`, p99 `143.14`, 1%low `46.59`, 0.1%low `44.71`, std `128.22`

**Frame time (ms)**  avg `11.31`, p50 `8.52`, p95 `18.30`, p99 `20.95`, p99.9 `22.08`, max `22.55`

**Client tick (ms)**  avg `0.48`, p95 `0.68`, max `0.94`

**Memory**  start `685 MB`, end `1093 MB`, peak `1093 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
216.6 |         █                                                                      
205.5 |         █                                                                      
194.4 |         █                                                                      
183.3 |         █                                                                      
172.2 |         █     █                               █                   █            
161.1 |         █  █  █        █           █          █                   █            
150.0 |█     █  █  █  █        █ █         █     █    █     █             █            
138.9 |██    █  █  █  █    █   █ █         █     █    █     █             █            
127.8 |██    █  █  █  █  █ █   █ █         █     █    █     █             █            
116.7 |██    █  █  █  █  █ █   █ █         █     █    █     ██            █            
105.5 |██ █  ██ ██ ██ ██ ███ █ █ ██  █   █ █   █ ██  ██ █  ████  █  █  █  █  █ █   █  █
 94.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  15
   1 ms |   2
   6 ms |   1
   7 ms | ██████████  204
   8 ms | ████████████████████████████████████████  796
   9 ms | █████  107
  13 ms |   6
  14 ms | ██  49
  15 ms | ███████████  224
  16 ms | █████████  183
  17 ms | ████  80
  18 ms | ██  34
  19 ms | █  22
  20 ms | ██  31
  21 ms | █  13
  22 ms |   3
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dragon_breath` | 160 | 221 | 123.7 | 20.74 |
| `end_rod` | 240 | 221 | 119.5 | 21.01 |
| `portal` | 160 | 221 | 110.1 | 20.14 |
| `ALL_TOGETHER` | 1680 | 221 | 104.5 | 20.99 |
| `sculk_charge_pop` | 240 | 221 | 111.3 | 20.24 |
| `smoke` | 160 | 221 | 106.0 | 19.76 |
| `flame` | 160 | 221 | 105.8 | 20.73 |
| `dripping_water` | 240 | 221 | 98.6 | 20.63 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `54.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `88.44`
- `fps_0p1pct_low` = `44.71`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `46.59`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 696 ms  |  Sample ticks: 0

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
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 2848 ms  |  Sample ticks: 0

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
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 5046 ms  |  Sample ticks: 0

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
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 7142 ms  |  Sample ticks: 0

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
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 9339 ms  |  Sample ticks: 0

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
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 11524 ms  |  Sample ticks: 0

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
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 13567 ms  |  Sample ticks: 0

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
- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `part` = `1.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `131.82`, min `26.74`, p50 `117.93`, p95 `215.72`, p99 `1330.43`, 1%low `29.25`, 0.1%low `26.93`, std `178.57`

**Frame time (ms)**  avg `11.43`, p50 `8.48`, p95 `21.46`, p99 `31.33`, p99.9 `36.55`, max `37.40`

**Client tick (ms)**  avg `3.04`, p95 `3.66`, max `4.75`

**Memory**  start `896 MB`, end `822 MB`, peak `1199 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
231.6 |                                               █                                
219.6 |               █                               █                                
207.7 |               █         █                     █                                
195.7 |               █         █                     █   █                       █    
183.7 |               █         █                     █   █           █           █    
171.8 |█  █ █      ████       █ █         █  █    █   █   █           █     █   █ █    
159.8 |█  █ █    █ █████      ███         █  █    █ █ █ █ █           ██    █   █ ██   
147.9 |█  ███    █ █████      ███    █  █ █  █    █ █ █ █ █       █  ███    █   █ ██  █
135.9 |█  ███    █ █████      ███    █  █ █  █ █  █ █ █ █ █       █  ███    █   █ ██  █
124.0 |█  ███    █ █████      ███    █  █ █  █ █  █ █ █ ███       █  ███    █   █████ █
112.0 |█  ████ █ █ ██████ █ █████  ████ ██████ ████████ ████  █ ███  ████ ████  ███████
100.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  33
   1 ms |   3
   2 ms |   1
   3 ms | ██  27
   4 ms | ████  61
   5 ms | ███████████  177
   6 ms |   1
   7 ms |   4
   8 ms | ████████████████████████████████████████  672
   9 ms |   2
  10 ms |   3
  11 ms | █████████  155
  12 ms | ███  42
  13 ms | ███  57
  14 ms | ██  38
  15 ms | █████  92
  16 ms | ████  62
  17 ms | ██  38
  18 ms | ██████  94
  19 ms | ███  53
  20 ms | ██  40
  21 ms | █  19
  22 ms | █  15
  23 ms | █  12
  24 ms |   3
  28 ms |   2
  29 ms |   7
  30 ms | █  16
  31 ms |   6
  32 ms |   1
  33 ms |   5
  34 ms |   3
  35 ms |   3
  36 ms |   2
  37 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `87.52`
- `preload_duration_ms` = `57.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `29.25`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `26.93`
- `entity_count_sample_end` = `501.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `134.69`, min `25.89`, p50 `116.48`, p95 `340.86`, p99 `494.13`, 1%low `27.70`, 0.1%low `26.03`, std `102.59`

**Frame time (ms)**  avg `11.67`, p50 `8.58`, p95 `24.54`, p99 `34.88`, p99.9 `37.56`, max `38.62`

**Client tick (ms)**  avg `3.94`, p95 `5.57`, max `7.64`

**Memory**  start `1063 MB`, end `503 MB`, peak `1218 MB`, GC `16 events / 34 ms`

**FPS over sampling window (ASCII):**

```
168.3 |       █                                                                        
162.7 |       █                    █                                                   
157.1 |       █        █           █                                                   
151.6 |       █        █           █ █   █               █  █    █          █   █      
146.0 |   █   █        █           █ █   █       █    █  ██ ██ █ ██    █    █   █    █ 
140.5 |██ █   █  █  ██ █  █    █ ███ █ █ █  █ █  █   ██  ██ ██ █ ███   ██   █ ███    █ 
134.9 |██ █ █ █ ███ ██ █  █    █ ███ ███ █  █ ████ █ ██  ██ ██ █ ███ ████ ████████   ██
129.3 |██ ███ █ ███ ██ █  █  █ █ ███ ███ █  ██████ █ ███ ██ ██ █████ ████ █████████████
123.8 |████████████ ██ █  █ ██ █ ███████████████████ ███ █████ ████████████████████████
118.2 |███████████████ ████ ██ █████████████████████ █████████ ████████████████████████
112.7 |███████████████ ███████ █████████████████████ ██████████████████████████████████
107.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  16
   2 ms | ██████  80
   3 ms | █████████████  175
   4 ms | █████  65
   5 ms | ████  55
   6 ms | ██  29
   7 ms | ██  34
   8 ms | ████████████████████████████████████████  546
   9 ms | █  14
  10 ms | ██  23
  11 ms | ███  36
  12 ms | ███  41
  13 ms | ██  32
  14 ms | ██  25
  15 ms | █████  65
  16 ms | ████  57
  17 ms | ███  43
  18 ms | ████  59
  19 ms | █████  67
  20 ms | ████  60
  21 ms | ███  44
  22 ms | ██  29
  23 ms | ██  21
  24 ms | ██  22
  25 ms | █  8
  26 ms |   1
  27 ms |   4
  28 ms |   2
  29 ms |   5
  30 ms |   3
  31 ms | █  10
  32 ms | █  8
  33 ms | █  11
  34 ms | █  7
  35 ms | █  12
  36 ms |   2
  37 ms |   1
  38 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `26.03`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `49.00`
- `fps_harmonic_avg` = `85.71`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `27.70`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `28.50`, min `17.87`, p50 `28.97`, p95 `44.25`, p99 `48.10`, 1%low `20.23`, 0.1%low `17.87`, std `5.87`

**Frame time (ms)**  avg `36.34`, p50 `34.51`, p95 `45.82`, p99 `47.58`, p99.9 `51.79`, max `55.96`

**Client tick (ms)**  avg `0.99`, p95 `1.19`, max `1.70`

**Memory**  start `741 MB`, end `620 MB`, peak `1218 MB`, GC `2 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |                                              █                                 
 33.2 |                                              █                                 
 32.4 |                                              █            █                    
 31.7 |█                                  █       █  █            █        █       █   
 30.9 |█            █      █   █          █     █ █  █            █        █       █   
 30.1 |█    █       █  ██  █ █ █          █    ██ █  █ █          █        █       █   
 29.4 |█    ██      █  ██ ██ █ █     █ █  █    ██ █  █ █  █       █      █ █   █   █ █ 
 28.6 |█  █ ███ █ █ █  ██ ██ █ █   █████  ██ █ ██ ██ █ █ ██       █    █ █ █   █  ██ █ 
 27.8 |██ ███████ █ ██ ██ ██ ███ ████████ ████ ██ ██ █ █ ██ █ █   █ █  █ ████  ██ ██ █ 
 27.1 |████████████ █████████████████████ ████ █████ █ ████████ █ █ █ ████████ ██ ██ ██
 26.3 |██████████████████████████████████████████████████████████████ ████████ ████████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ███  6
  21 ms | ████  9
  22 ms | ██████  14
  23 ms | ███  6
  24 ms | █  3
  25 ms |   1
  26 ms | █  2
  27 ms |   1
  28 ms |   1
  30 ms |   1
  31 ms | ████  9
  32 ms | ████████████████████████████████████████  89
  33 ms | █████████████████████████████████████  83
  34 ms | ███████████████████████████████  69
  35 ms | █████████  19
  36 ms | ████████  18
  37 ms | ███████  15
  38 ms | ██████  14
  39 ms | █████████  21
  40 ms | █████  12
  41 ms | ██████████  22
  42 ms | ████████  17
  43 ms | █████████████  28
  44 ms | █████████████████  38
  45 ms | ████████████  27
  46 ms | ██████  14
  47 ms | ██  5
  48 ms | █  3
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `34.00`
- `fps_1pct_low` = `20.23`
- `fps_harmonic_avg` = `27.52`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `17.87`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `152.00`
- `entity_count_sample_start` = `152.00`
- `seed` = `6271.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `28.40`, min `17.25`, p50 `29.39`, p95 `35.59`, p99 `46.31`, 1%low `20.20`, 0.1%low `17.25`, std `5.03`

**Frame time (ms)**  avg `36.16`, p50 `34.03`, p95 `45.61`, p99 `47.13`, p99.9 `52.57`, max `57.97`

**Client tick (ms)**  avg `0.53`, p95 `0.66`, max `0.97`

**Memory**  start `1006 MB`, end `510 MB`, peak `1210 MB`, GC `4 events / 19 ms`

**FPS over sampling window (ASCII):**

```
 31.9 |                                                     █                          
 31.4 |                                                     █                          
 30.9 |                    █ █  █                        █  █               █          
 30.4 |                    █ █  █               █        ████               █  █       
 29.9 |     ██            ██ █  █        █      █     █  ████    █          █  █ █ █   
 29.3 |     ██  █   █     ██ █  █ █      █ █    █ █   █  ████    █          █  ███ █   
 28.8 |     ██ ██   █     ██ █  █ █ █    █ █    █ █   █  ████   ██          █  ███ █   
 28.3 |     ██ ██ █ ██    ██ ██ ███ █  █ █ ██ █ █ █   █ █████ █ ██     █    █  ███ █   
 27.8 |██  ███ ██ █ ██ █ ███ ██ █████  █ ████████ █   █ ███████ ██  █ ██   ██  █████ ██
 27.3 |███ ████████ ██ █ ███ ██ █████████████████ ██ ████████████████ ████ ████████████
 26.8 |███████████████ █████ ██ ███████████████████████████████████████████████████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  21 ms | ███  10
  22 ms | ████  14
  23 ms | █  2
  31 ms | █  3
  32 ms | ███████████████████████  88
  33 ms | ████████████████████████████████████████  152
  34 ms | ███████████  43
  35 ms | ██████  23
  36 ms | ██████  22
  37 ms | ████  16
  38 ms | ██████  22
  39 ms | ████  16
  40 ms | █████  19
  41 ms | ███  10
  42 ms | ███████  25
  43 ms | ██████  22
  44 ms | █████  18
  45 ms | ███████  25
  46 ms | ████  14
  47 ms | █  5
  48 ms |   1
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `17.25`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `27.00`
- `fps_harmonic_avg` = `27.65`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `20.20`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `31.05`, min `16.43`, p50 `28.75`, p95 `51.37`, p99 `56.72`, 1%low `16.62`, 0.1%low `16.43`, std `10.91`

**Frame time (ms)**  avg `36.16`, p50 `34.78`, p95 `56.02`, p99 `59.62`, p99.9 `60.76`, max `60.85`

**Client tick (ms)**  avg `3.18`, p95 `5.17`, max `8.43`

**Memory**  start `927 MB`, end `1010 MB`, peak `1243 MB`, GC `2 events / 3 ms`

**FPS over sampling window (ASCII):**

```
 36.1 |            █                                                                   
 35.3 |            █       █     █                █                   █                
 34.5 |            █    █  █  █  █                █    ██             █                
 33.7 |  █         █    █  ██ █  █               ██    ██             █                
 32.9 |  █     █ █ █    █  ██ █  █               ██    ██    █   █   ███          █    
 32.1 |  █  ██ █ █ █ █  ███████  █     █         ██    █████ █   █   ███          █  █ 
 31.3 |█ ██ ██ █ █ ███  ████████ █     █         ███ █ █████ ███ █   ████ ██ █  █ █  █ 
 30.5 |███████████ ████ ████████ ██ █  █ █ ██ ██ ███ ███████ ███ █ █ ████ ██ █ ██ █  █ 
 29.7 |███████████ ████ ████████ ███████ ███████████████████ █████ ██████ ██ █ ██ █  █ 
 28.9 |███████████ ████ ████████ ███████ ███████████████████ ████████████████████ ██ █ 
 28.1 |███████████ █████████████ ███████████████████████████████████████████████████ ██
 27.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | ██  2
  17 ms | ███████  7
  18 ms | ████████████  12
  19 ms | ████████████████████  20
  20 ms | █████████████  13
  21 ms | █████████████████████  22
  22 ms | ████████████████████████████████████████  41
  23 ms | ███████████████  15
  24 ms | ████████  8
  25 ms | ████  4
  26 ms | ██  2
  27 ms | ██  2
  28 ms | █  1
  29 ms | ███  3
  30 ms | ███████████████████████████████  32
  31 ms | ███████████████  15
  32 ms | ██████████████████████  23
  33 ms | █████████████████████████████████████  38
  34 ms | ███████████████████  19
  35 ms | ██████████████████████████  27
  36 ms | ██████████████████████████████████  35
  37 ms | █████████████  13
  38 ms | ████████████████  16
  39 ms | █████  5
  40 ms | ███████  7
  41 ms | ████████  8
  42 ms | ██████  6
  43 ms | ██████████  10
  44 ms | ███  3
  45 ms | ██████  6
  46 ms | ███████  7
  47 ms | █████████  9
  48 ms | █████  5
  49 ms | ███████  7
  50 ms | ███████████  11
  51 ms | ███████████████  15
  52 ms | ████████████  12
  53 ms | █████████████  13
  54 ms | ██████████████  14
  55 ms | █████████████████  17
  56 ms | ██████  6
  57 ms | █████████  9
  58 ms | ██████  6
  59 ms | ████  4
  60 ms | ███  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `16.43`
- `preset_long` = `0.00`
- `preload_duration_ms` = `51.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.66`
- `fps_1pct_low` = `16.62`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.28`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `30.59`, min `16.14`, p50 `28.41`, p95 `51.18`, p99 `57.20`, 1%low `16.44`, 0.1%low `16.14`, std `11.82`

**Frame time (ms)**  avg `36.22`, p50 `35.20`, p95 `55.41`, p99 `59.32`, p99.9 `61.58`, max `61.95`

**Client tick (ms)**  avg `2.74`, p95 `4.45`, max `6.23`

**Memory**  start `825 MB`, end `711 MB`, peak `1341 MB`, GC `2 events / 4 ms`

**FPS over sampling window (ASCII):**

```
 52.9 |                                               █                                
 50.4 |                                               █                                
 48.0 |                                               █                                
 45.6 |                                               █                                
 43.1 |                                               █                                
 40.7 |                                               █                                
 38.2 |             █                                 █                                
 35.8 |     █  █  █ █  █  █                           █   █  █  █                      
 33.3 |██ █ █  ██ █ █  █  █  ██  █                    █ ███ ███ ██ █     █             
 30.9 |██ █ █  ██ ███ ██  ██ ██ ██     █       ███ ████ ███████ ██ █ ██ ██    █ █      
 28.5 |████ █████ ███████████████████ ██ ███████████████████████████ █████ ███████████ 
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
  15 ms | █  1
  16 ms | █  2
  17 ms | ██  3
  18 ms | █████████  15
  19 ms | ██████████  16
  20 ms | ██████  10
  21 ms | ██████████████  23
  22 ms | █████████████  21
  23 ms | ██████  10
  24 ms | ████  6
  25 ms | ██  3
  26 ms | █  1
  28 ms | █  1
  29 ms | ██  3
  30 ms | █████████████  21
  31 ms | █████████████████████  33
  32 ms | ████████████████  25
  33 ms | ████████████████████████████████████████  64
  34 ms | ██████  10
  35 ms | ████████████████████  32
  36 ms | ███████████████████████  37
  37 ms | █████████████  20
  38 ms | ████████  12
  39 ms | ████  6
  40 ms | ██████  10
  41 ms | ██████  10
  42 ms | ██████  10
  43 ms | █████████████  21
  44 ms | ██████  9
  45 ms | ████████  12
  46 ms | ████  6
  47 ms | ████████  12
  48 ms | █████  8
  49 ms | ████  6
  50 ms | ███  5
  51 ms | █  2
  52 ms | ██████  10
  53 ms | ██████  10
  54 ms | ████████  13
  55 ms | █████  8
  56 ms | ████  6
  57 ms | ████  6
  58 ms | ████  6
  59 ms | █  1
  60 ms | ██  3
  61 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `16.14`
- `preset_long` = `0.00`
- `preload_duration_ms` = `33.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.61`
- `fps_1pct_low` = `16.44`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.52`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `36.84`, min `12.74`, p50 `29.00`, p95 `71.75`, p99 `176.07`, 1%low `13.40`, 0.1%low `12.74`, std `28.54`

**Frame time (ms)**  avg `36.56`, p50 `34.49`, p95 `64.61`, p99 `72.02`, p99.9 `77.79`, max `78.48`

**Client tick (ms)**  avg `14.98`, p95 `20.69`, max `24.92`

**Memory**  start `853 MB`, end `772 MB`, peak `1294 MB`, GC `24 events / 87 ms`

**FPS over sampling window (ASCII):**

```
 68.8 |                █                                                               
 65.0 |                █                          █                                    
 61.1 |        █       █                          █                                    
 57.3 |        █       █                          █           █                        
 53.4 |        █       █    █               █     █           █       █     █          
 49.6 |        █     █ █    █               █    ██           █       █     █          
 45.8 |        █  █  █ █    █               █    ██           █     █ █     █          
 41.9 |     █ ██  █  █ █    █    █       █  █ ██ ██      █  █ █     █ █     ██         
 38.1 |    █████  ████ █  █ █ █  █ █   █ █  █ ██ ██      █  █ █     ███   █ ██  █    █ 
 34.2 | █  █████ ████████ █ ███ ██ █ █ ████ █ █████ █ █ ██ ██ █ ███ █████ ████ ██ █  █ 
 30.4 |██████████████████ ████████ ████████████████████████████████ ██████████████████ 
 26.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   4 ms | █  1
   5 ms | ███████  5
   6 ms | ████  3
   7 ms | ███  2
   8 ms | ███████  5
   9 ms | ███  2
  11 ms | █  1
  12 ms | █  1
  13 ms | ████████████  9
  14 ms | ███████  5
  15 ms | █████████████████████  15
  16 ms | ███████████████  11
  17 ms | ███████████████████████  17
  18 ms | ████████████████████████████████████████  29
  19 ms | ██████████████████████  16
  20 ms | ████  3
  21 ms | ███████████████  11
  22 ms | ██████████  7
  23 ms | ███████████  8
  24 ms | ████████████  9
  25 ms | ██████████████████  13
  26 ms | ███████  5
  27 ms | ██████████████  10
  28 ms | ███████  5
  29 ms | ████████  6
  30 ms | ██████████████  10
  31 ms | ███████████████████████  17
  32 ms | ██████████████████████████████  22
  33 ms | ██████████████████████  16
  34 ms | █████████████████████  15
  35 ms | ██████████████  10
  36 ms | ████████████  9
  37 ms | ████  3
  38 ms | ████████  6
  39 ms | ██████████  7
  40 ms | ██████████  7
  41 ms | ████████████  9
  42 ms | ███████████████████  14
  43 ms | ███████  5
  44 ms | ███████████████████  14
  45 ms | █████████████████  12
  46 ms | ███████████████  11
  47 ms | ███████████████  11
  48 ms | ███████████████  11
  49 ms | ███████  5
  50 ms | ████████████  9
  51 ms | ███████  5
  52 ms | ██████████████  10
  53 ms | █████████████████████  15
  54 ms | ████████████  9
  55 ms | ██████████████  10
  56 ms | ██████████████  10
  57 ms | ██████████  7
  58 ms | ███████  5
  59 ms | ██████████  7
  60 ms | ████████  6
  61 ms | ███████  5
  62 ms | █  1
  63 ms | ██████  4
  64 ms | ███  2
  65 ms | ██████  4
  66 ms | ███  2
  67 ms | ████  3
  68 ms | ████  3
  69 ms | ███  2
  70 ms | ████  3
  71 ms | ██████  4
  72 ms | ██████  4
  77 ms | █  1
  78 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `48.00`
- `falling_blocks_landed` = `26999.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.35`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.74`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4801.81`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.40`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `35.88`, min `12.11`, p50 `26.56`, p95 `93.99`, p99 `147.23`, 1%low `12.69`, 0.1%low `12.11`, std `28.11`

**Frame time (ms)**  avg `37.15`, p50 `37.65`, p95 `62.10`, p99 `72.47`, p99.9 `82.10`, max `82.58`

**Client tick (ms)**  avg `15.57`, p95 `21.64`, max `30.42`

**Memory**  start `843 MB`, end `812 MB`, peak `1306 MB`, GC `24 events / 93 ms`

**FPS over sampling window (ASCII):**

```
 67.6 |          █                                                          █          
 63.8 |          █      █                                                   █          
 60.0 |          █      █                                                   █          
 56.2 |          █      █                                                   █          
 52.4 |          █      █                               █                ██ █          
 48.6 |          █   █  █       █   █         █     █   █                ██ █          
 44.7 |  █       █   █  █       █   █  █      █     █  ██           █    ████          
 40.9 |  █ █   ███   █  █   █   █   █  █      ████  █  ██           █    ████  █       
 37.1 |  █ █   ███   ██ █   █   █   █  █ █    ████  █  ██       █  ██   █████  █  ███  
 33.3 | ██ █   █████ ████ █████ █ █ █ ██ █████████ ██  ██   ██ ███ ██  ██████ ███ ███  
 29.5 |███ █████████ ██████████ ██████████████████████████████ ███ ████████████████████
 25.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ██  1
   4 ms | ██  1
   6 ms | ███████████  6
   7 ms | ██████████████████  10
   8 ms | █████  3
   9 ms | █████  3
  10 ms | █████████  5
  11 ms | ███████  4
  12 ms | ███████  4
  13 ms | ████  2
  14 ms | ██  1
  15 ms | ███████  4
  16 ms | ████████████████████  11
  17 ms | ███████████████████████████████████  19
  18 ms | ███████████████  8
  19 ms | ███████  4
  20 ms | █████████  5
  21 ms | ███████████  6
  22 ms | ████████████████████  11
  23 ms | ███████████████  8
  24 ms | ███████████████  8
  25 ms | ████████████████████  11
  26 ms | ███████████  6
  27 ms | ███████████████  8
  28 ms | ██████████████████████  12
  29 ms | ████████████████  9
  30 ms | ██████████████████████  12
  31 ms | ████████████████████  11
  32 ms | ████████████████████████████████████████  22
  33 ms | ███████████████████████████████  17
  34 ms | ███████████████████████████████████  19
  35 ms | █████████  5
  36 ms | █████████████  7
  37 ms | ████████████████████████  13
  38 ms | ██████████████████████  12
  39 ms | ██████████████████  10
  40 ms | ███████████████████████████  15
  41 ms | ███████████████████████████████████  19
  42 ms | ███████████████████████████████  17
  43 ms | ████████████████  9
  44 ms | ██████████████████████  12
  45 ms | ████████████████████████  13
  46 ms | ███████████  6
  47 ms | ███████████████████████████  15
  48 ms | ██████████████████████  12
  49 ms | ██████████████████  10
  50 ms | ██████████████████  10
  51 ms | ██████████████████  10
  52 ms | ████████████████  9
  53 ms | ████████████████  9
  54 ms | ███████████████  8
  55 ms | █████████████  7
  56 ms | ███████  4
  57 ms | █████████████  7
  58 ms | █████████  5
  59 ms | █████████████  7
  60 ms | █████████  5
  61 ms | █████  3
  62 ms | █████████  5
  63 ms | ██  1
  64 ms | ████  2
  65 ms | ████  2
  66 ms | ████  2
  67 ms | ██  1
  68 ms | █████  3
  69 ms | █████  3
  71 ms | █████  3
  72 ms | ██  1
  73 ms | ██  1
  75 ms | ██  1
  80 ms | ██  1
  81 ms | ██  1
  82 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `45.00`
- `falling_blocks_landed` = `24285.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `26.92`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.11`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4799.93`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.69`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `28.76`, min `17.78`, p50 `28.21`, p95 `45.55`, p99 `50.83`, 1%low `19.91`, 0.1%low `17.78`, std `6.59`

**Frame time (ms)**  avg `36.27`, p50 `35.45`, p95 `46.51`, p99 `48.20`, p99.9 `53.20`, max `56.25`

**Client tick (ms)**  avg `1.88`, p95 `2.57`, max `3.43`

**Memory**  start `810 MB`, end `862 MB`, peak `1230 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |               █       █                        █                               
 32.3 |            █  █ █     █   █  █ █               █               █               
 31.5 |            █  █ █  █  █   █  █ █       █       █  █            █               
 30.6 |█    ██    ██  █ █  █  █   █  █ █ █     █   ██  █  █  █         █  █            
 29.7 |█ █  ██    ██ ██ █ ██  █   █  █ ███ █   ██  ██  █  █  █         ██ █   █       █
 28.9 |███  ███  ███ ████ ██  █ █ █  █ ███ █ █ ██  ██  ██ █  █    █  ████ █   █    █  █
 28.0 |███  ███  ███ ████ ██████████ █████ ███████ ███ ██ ██ █ ██ █  ████ █   █ ██ ██ █
 27.2 |███  ████ ████████ ██████████ █████████████ ███ ██ ██ █ ████████████ █████████ █
 26.3 |██████████████████ ████████████████████████████ █████ ██████████████████████████
 25.5 |███████████████████████████████████████████████ ████████████████████████████████
 24.6 |███████████████████████████████████████████████ ████████████████████████████████
 23.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | ███  7
  20 ms | ████  9
  21 ms | █████  11
  22 ms | ███  7
  23 ms | █  3
  24 ms | ████  9
  26 ms | █  2
  27 ms |   1
  28 ms | █  2
  29 ms |   1
  30 ms | ██████████  21
  31 ms | ██████████████████████████  53
  32 ms | ███████████  22
  33 ms | ████████████████████████████████████████  82
  34 ms | █████████  18
  35 ms | ███████████████████████████  55
  36 ms | ████████  17
  37 ms | ██████████  20
  38 ms | ████████  17
  39 ms | █████████  19
  40 ms | █████████  19
  41 ms | █████████  19
  42 ms | ███████  15
  43 ms | ████████████████  33
  44 ms | ██████████████  28
  45 ms | ███████████  23
  46 ms | ████████  16
  47 ms | ██████  13
  48 ms | ██  5
  49 ms |   1
  50 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `55.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.57`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `17.78`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `618.87`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `19.91`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `28.67`, min `17.61`, p50 `28.24`, p95 `43.71`, p99 `50.46`, 1%low `18.97`, 0.1%low `17.61`, std `6.10`

**Frame time (ms)**  avg `36.19`, p50 `35.41`, p95 `45.84`, p99 `48.05`, p99.9 `56.66`, max `56.78`

**Client tick (ms)**  avg `1.87`, p95 `2.51`, max `2.99`

**Memory**  start `1022 MB`, end `1058 MB`, peak `1298 MB`, GC `4 events / 20 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                         █   █                                                  
 32.6 |            █            █   █                                                  
 31.9 |            █            █   █           █                                      
 31.2 |         █  █ █       █  █   █           █       █                         █    
 30.4 |   █ █   █  █ █    █  █  ██  ██          █       █     █    █              █    
 29.7 |   █ █   ██ █ █    █ ███ ██  ██ █  █ ██  █       █    ██    █            █ █  █ 
 29.0 |█  █ █ ████ █ █  ███ ███ ██  ██ █  █ ██ ██ █     █  █ ██    █  █     █  ████  █ 
 28.3 |██ ███ ████ ████████████ ███ ███████ ██ ██ █ █   ██ ████    █ ██ ██  █  ███████ 
 27.6 |██ ████████ ████████████ ███ ███████████████ ███ ██ ████ ██ █ ██ ██  ██████████ 
 26.9 |███████████ ████████████████ ███████████████████ ██████████ █ █████  ███████████
 26.2 |████████████████████████████ ███████████████████████████████████████ ███████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | ███  7
  20 ms | ███  6
  21 ms | ████  9
  22 ms | ███  6
  23 ms | ████  8
  24 ms | █  3
  25 ms | █  3
  26 ms |   1
  28 ms | █  2
  29 ms |   1
  30 ms | ██████  12
  31 ms | ███████████████████████████  59
  32 ms | ████████████  27
  33 ms | ████████████████████████████████████████  87
  34 ms | ███████████  25
  35 ms | ███████████████████████  51
  36 ms | ████████████  26
  37 ms | █████████  20
  38 ms | █████████  19
  39 ms | ████████  18
  40 ms | █████████  20
  41 ms | ██████████  22
  42 ms | ███████  15
  43 ms | ████████████  27
  44 ms | █████████████  29
  45 ms | ███████████  25
  46 ms | ████  9
  47 ms | ████  8
  48 ms | █  3
  52 ms |   1
  54 ms |   1
  56 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `57.00`
- `falling_blocks_landed` = `3136.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.63`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `17.61`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `18.97`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `28.48`, min `20.58`, p50 `29.26`, p95 `43.13`, p99 `48.11`, 1%low `20.92`, 0.1%low `20.58`, std `5.41`

**Frame time (ms)**  avg `36.17`, p50 `34.17`, p95 `45.80`, p99 `47.37`, p99.9 `48.41`, max `48.59`

**Client tick (ms)**  avg `0.65`, p95 `0.82`, max `0.97`

**Memory**  start `558 MB`, end `1094 MB`, peak `1094 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.6 |                                       █                                        
 32.9 |                                       █                                        
 32.1 |                                       █                 █  █                   
 31.4 |          █             █       █      █             █   █  █             █     
 30.7 |█       █ █             █ █     █      ██         █  █   █  █             █     
 30.0 |█       █ █             █ █     █      ██         █  █   █  █     █       █     
 29.2 |██      █ █  █  █       ███   █ █  █   ██ █ █     █  █  ██  █ █ █ ██  █   █   █ 
 28.5 |██  █   █ █  █  █  █  █ ███ █ ████ █   ██████  █ ███ ██ ██  █ █ ████  █  ██   ██
 27.8 |██ ███ ██ █ ██ █████ ██ ██████████ ███ █████████ █████████  █ ███████ ██ ████ ██
 27.0 |██ ███ ██ ████ █████ ██ ██████████████ ██████████████████████ ███████ ██ ████ ██
 26.3 |██████ ██████████████████████████████████████████████████████ ███████ ██████████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ███  9
  21 ms | ███  9
  22 ms | ██  7
  23 ms | █  3
  25 ms | █  2
  29 ms | █  2
  31 ms | █  3
  32 ms | ████████████████████████████  88
  33 ms | ████████████████████████████████████████  128
  34 ms | ███████████████████  60
  35 ms | ███████  22
  36 ms | ██████  19
  37 ms | █████  17
  38 ms | ██████  18
  39 ms | █████  15
  40 ms | ███  9
  41 ms | ████████  24
  42 ms | ██████  18
  43 ms | ████████  25
  44 ms | ████████  26
  45 ms | ███████  23
  46 ms | █████  15
  47 ms | ██  7
  48 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.92`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.65`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `20.58`
- `seed` = `5099.00`
- `preload_duration_ms` = `89.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `28.09`, min `20.64`, p50 `29.35`, p95 `30.86`, p99 `47.02`, 1%low `20.83`, 0.1%low `20.64`, std `4.82`

**Frame time (ms)**  avg `36.49`, p50 `34.07`, p95 `45.41`, p99 `47.25`, p99.9 `48.45`, max `48.45`

**Client tick (ms)**  avg `0.28`, p95 `0.34`, max `0.46`

**Memory**  start `567 MB`, end `759 MB`, peak `759 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 31.6 |                        █                                                       
 31.0 |  █                     █    █           █       █                              
 30.4 |  █                     █    █       █   █     █ █    █                         
 29.8 |  █     █        █      █    █       █   ██    ███ █  ██         █   █          
 29.2 |  █     █        █ █    █    █       █   ██    █████  ██         █  ██          
 28.6 |  █   ███ █   ██ █ █   ██  █ █ █ ██  █ █ ██    ██████ ██   ██    █  ██ ██  █    
 27.9 |  █   ███ █   ██ █ ██  ██ ██ █ ████  █ █ ██  █ ██████ ██  ███  █ █  ██████ █  █ 
 27.3 |█ ███ ██████ █████ ██████ ████ █████ █ █████ █ █████████ █████ █ ██ ████████ ██ 
 26.7 |██████████████████ ███████████████████ ███████ █████████ ███████████████████████
 26.1 |██████████████████ ███████████████████████████ █████████ ███████████████████████
 25.5 |██████████████████████████████████████████████ █████████████████████████████████
 24.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms |   1
  21 ms | ███  13
  22 ms | █  7
  29 ms |   1
  31 ms | █  3
  32 ms | ██████  33
  33 ms | ████████████████████████████████████████  205
  34 ms | ████████  40
  35 ms | ████  22
  36 ms | ████  21
  37 ms | ██  10
  38 ms | ███  17
  39 ms | ████  19
  40 ms | ███  15
  41 ms | ████  22
  42 ms | ████  23
  43 ms | ██████  32
  44 ms | ████  22
  45 ms | █████  25
  46 ms | ██  9
  47 ms | █  5
  48 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `20.64`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `45.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.83`
- `fps_harmonic_avg` = `27.40`
- `neighbour_updates` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `28.10`, min `20.68`, p50 `29.11`, p95 `31.15`, p99 `47.40`, 1%low `20.88`, 0.1%low `20.68`, std `4.79`

**Frame time (ms)**  avg `36.46`, p50 `34.35`, p95 `45.33`, p99 `47.20`, p99.9 `48.27`, max `48.35`

**Client tick (ms)**  avg `0.25`, p95 `0.30`, max `0.42`

**Memory**  start `820 MB`, end `877 MB`, peak `1264 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |      █                                                                         
 32.5 |      █                                                                         
 31.8 |      █                                █               █                        
 31.1 |      █               █                █               █     █                  
 30.4 |      ██              █         █      █             █ █     █              █   
 29.7 |█     ██    █         █       █ █   █  █       █    ██ █     █     █        █   
 29.0 |██    ██   ██ █     █ █   █   █ █   █  █       █   ███ █     █   █ █        ██  
 28.3 |██    ██   ██ ██  ███ █ █ ███ █ █   █  █      ██  ████ █  █ ███  █ ██ █     ██  
 27.7 |█████ ██   ██ ██  ███ █ █ ███ ████  █  █ █ █████ █████ █  █████ ██ ██ ██ █ ███  
 27.0 |██████████ █████ ████████████ ████  █ ██████████ ████████ █████ ██ ██ ██ ██████ 
 26.3 |█████████████████████████████ ██████████████████ ██████████████ ████████████████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  4
  21 ms | ██  9
  22 ms | █  6
  23 ms |   1
  29 ms |   1
  31 ms | █  3
  32 ms | █████████  41
  33 ms | ████████████████████████████████████████  187
  34 ms | ███████████  52
  35 ms | █████  24
  36 ms | ██  10
  37 ms | ████  20
  38 ms | ████  17
  39 ms | █████  22
  40 ms | ███  16
  41 ms | █████  22
  42 ms | █████  24
  43 ms | █████  23
  44 ms | ███████  32
  45 ms | ████  17
  46 ms | ██  9
  47 ms | █  5
  48 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `20.68`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `27.43`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.88`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2240.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `28.07`, min `20.26`, p50 `29.01`, p95 `32.13`, p99 `48.38`, 1%low `20.59`, 0.1%low `20.26`, std `4.87`

**Frame time (ms)**  avg `36.51`, p50 `34.47`, p95 `45.42`, p99 `47.06`, p99.9 `49.15`, max `49.36`

**Client tick (ms)**  avg `0.29`, p95 `0.39`, max `0.51`

**Memory**  start `1023 MB`, end `819 MB`, peak `1287 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 31.8 |   █              █                                                      █      
 31.2 |   █     █        █                             █                        █      
 30.6 |   █     █        █                        █    █             █          █      
 30.0 |   █     █        █                █  █    █    █         █  ██          █    █ 
 29.4 |   █ █ █ █    █   █                █  █    █    █     ██  █  ██        █ █ █  █ 
 28.8 |   █ █ █ █    █   █ █           ██ █  █    █ ██ █     ██  █ ███        ███ ██ █ 
 28.2 |█  █ █ █ █ █ ██   █ ██  █ ███   ██ █  █   █████ █     ███ █ ████ █  █  ███ ██ █ 
 27.6 |█ ██ ███ ███ ██ █ █████ ██████████ ██ █   █████ █   █████ █ ████ ██ █ ███████ █ 
 27.0 |████ ███ █████████████████████████ ██ ██ ██████ █ ███████ █ ████ ████ ███████ ██
 26.4 |████ ███ █████████████████████████ ██████████████████████████████████████████ ██
 25.8 |████ ███████████████████████████████████████████████████████████████████████████
 25.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  3
  20 ms | █  4
  21 ms | ██  6
  22 ms | █  3
  23 ms | █  2
  27 ms |   1
  28 ms |   1
  30 ms | █  5
  31 ms | ██████  24
  32 ms | █████████  34
  33 ms | ████████████████████████████████████████  151
  34 ms | ████████████████  61
  35 ms | ██████  21
  36 ms | █████  17
  37 ms | █████  17
  38 ms | █████  20
  39 ms | ██████  21
  40 ms | █████  18
  41 ms | ████████  32
  42 ms | █████  18
  43 ms | ███████  27
  44 ms | ██████  23
  45 ms | ██████  21
  46 ms | ███  11
  47 ms | █  2
  48 ms | █  3
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `20.59`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `27.39`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `20.26`
- `seed` = `4027.00`
- `preload_duration_ms` = `52.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `28.17`, min `20.34`, p50 `29.57`, p95 `30.49`, p99 `46.88`, 1%low `20.70`, 0.1%low `20.34`, std `4.68`

**Frame time (ms)**  avg `36.35`, p50 `33.82`, p95 `45.15`, p99 `47.24`, p99.9 `49.07`, max `49.15`

**Client tick (ms)**  avg `0.28`, p95 `0.34`, max `0.38`

**Memory**  start `909 MB`, end `1093 MB`, peak `1093 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 32.2 |                                 █                                              
 31.6 |                                 █                                              
 31.0 |       █                         █    █                 █                  █    
 30.4 |       █     █                   █    █                 █           █      █    
 29.8 |█      █     █       █  █ ██     █    █    █ █       █  █           █      █    
 29.2 |█  █   █     █       █  █ ██     █    █ █  █ ██     ██  █ █ █      ██    █ █    
 28.6 |█  █ █ █   █ █     █ ████ ██     █    █ █  █ ██    ████ █████  █   ██ █  █ █    
 28.0 |██ █ ███ █ █ █   █ █ ████ ███    █ ██ █ █  ████ █  ████ █████ ███████ █  █ ██ ██
 27.4 |██ █████ ███████████ ████ ███  █ █ ███████ ██████  ████ █████ ███████ ██ █ █████
 26.8 |██████████████████████████████████ ███████████████ ██████████ ███████ ████ █████
 26.2 |█████████████████████████████████████████████████████████████████████ ████ █████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms |   3
  21 ms | ██  10
  22 ms | █  7
  26 ms |   1
  28 ms |   1
  32 ms | ████  24
  33 ms | ████████████████████████████████████████  243
  34 ms | ██████  35
  35 ms | ███  16
  36 ms | ███  16
  37 ms | ██  11
  38 ms | ███  18
  39 ms | ███  18
  40 ms | ██  11
  41 ms | ███  18
  42 ms | ████  25
  43 ms | █████  31
  44 ms | █████  31
  45 ms | ███  16
  46 ms | █  7
  47 ms | █  4
  48 ms |   2
  49 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `27.51`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `20.70`
- `fps_0p1pct_low` = `20.34`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `64.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `28.70`, min `15.38`, p50 `28.81`, p95 `44.88`, p99 `50.91`, 1%low `16.86`, 0.1%low `15.38`, std `6.32`

**Frame time (ms)**  avg `36.20`, p50 `34.71`, p95 `46.23`, p99 `50.76`, p99.9 `64.02`, max `65.02`

**Client tick (ms)**  avg `0.35`, p95 `0.51`, max `8.13`

**Memory**  start `534 MB`, end `1664 MB`, peak `1666 MB`, GC `38 events / 215 ms`

**FPS over sampling window (ASCII):**

```
 33.8 |                    █                                                           
 33.1 |                 █  █                                 █                      █  
 32.3 |                 █  █          ██                     █                      █  
 31.5 |     █         █ █  █ █        ██                     █                      █  
 30.8 |  █  █     █ █ █ █  █ █     █  ██                     █             █   █    █  
 30.0 |  █  ██    █ █ █ █  █ █     █  ██        █       █    █  █  █       █   █    █ █
 29.2 |  █  ██    █ █ █ █ ██ █ █   █  ███    █  █    █  █    █  ██ █    █  █   █    █ █
 28.5 |█ █  ██    ███ █ █ ██ █ █ █ █  ████   █  █  █ █ ██   ██  ██ █   ██  █   ███ ██ █
 27.7 |████ ██  █ ███ █ ██████ ██████ █████ ███ ██ ██████ █ █████████████ ██ █ ███ ████
 26.9 |████████ ███████ ██████████████████████████ ████████████████████████████████████
 26.2 |████████████████ ██████████████████████████ ████████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  16 ms | █  2
  17 ms | █  2
  19 ms |   1
  20 ms | ██  5
  21 ms | ██████  16
  22 ms | ██  6
  23 ms | █  2
  24 ms | █  3
  25 ms |   1
  26 ms | █  2
  28 ms |   1
  29 ms | █  3
  30 ms |   1
  31 ms | ██████  16
  32 ms | ██████████████████████  57
  33 ms | ████████████████████████████████████████  106
  34 ms | ███████████████████████████  71
  35 ms | ████████████  32
  36 ms | ████████  22
  37 ms | ███████  19
  38 ms | █████████  24
  39 ms | ██████  17
  40 ms | ███  9
  41 ms | ████████  21
  42 ms | ████████  20
  43 ms | ████  11
  44 ms | █████████  25
  45 ms | ████████  20
  46 ms | ████████  20
  47 ms | █  3
  48 ms | █  3
  49 ms | █  2
  50 ms | █  3
  55 ms |   1
  59 ms |   1
  62 ms |   1
  63 ms |   1
  65 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `16.86`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `75.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.62`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.38`
- `seed` = `7411.00`
- `preload_duration_ms` = `67.00`
- `entity_count_sample_end` = `7.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `11.00`
- `x_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `29.11`, min `13.41`, p50 `28.85`, p95 `46.83`, p99 `55.40`, 1%low `16.15`, 0.1%low `13.41`, std `7.73`

**Frame time (ms)**  avg `36.16`, p50 `34.66`, p95 `47.02`, p99 `56.41`, p99.9 `69.52`, max `74.59`

**Client tick (ms)**  avg `0.33`, p95 `0.51`, max `0.79`

**Memory**  start `1560 MB`, end `1708 MB`, peak `1983 MB`, GC `30 events / 215 ms`

**FPS over sampling window (ASCII):**

```
 36.6 |                                                     █                          
 35.6 |                    █                                █                          
 34.5 |                █   █                                █                          
 33.4 |                █   █        █                       █                          
 32.3 |                █   █        █      █                █  █          █       █   █
 31.3 |      █       █ █   █        █    █ █   █            █  █      █ █ █   █   █  ██
 30.2 |  █   ██     ██ █   █    █   █    █ █   ██ █  █  █   █ ██  █   █ ████  █   █  ██
 29.1 |  ███ ███ █ ███ █   █    █   █ █  █ █ █ ██ █  █  ██  █ ██ ██   █ █████ █ █ ██ ██
 28.1 |█ ███████ █████ ██  █  ████ ████ ██████ ██ ██ ██ █████ █████████ █████████ ██ ██
 27.0 |███████████████ ███ █ ██████████████████████████ █████ ██████████████████████ ██
 25.9 |███████████████████ █ ██████████████████████████████████████████████████████████
 24.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  11 ms |   1
  13 ms |   1
  14 ms |   1
  15 ms |   1
  17 ms |   1
  18 ms | ██  4
  19 ms | ███  7
  20 ms | ██  5
  21 ms | ███████  17
  22 ms | ███  6
  23 ms | ██  4
  26 ms |   1
  27 ms | █  2
  30 ms | ██  5
  31 ms | ████████  18
  32 ms | ███████████████████████████████  71
  33 ms | ████████████████████████████████████████  91
  34 ms | █████████████████████████  56
  35 ms | ████████████████  37
  36 ms | ███████████  24
  37 ms | ███████  15
  38 ms | ██████  14
  39 ms | ███████  16
  40 ms | ███████  17
  41 ms | █████████  21
  42 ms | ████████  18
  43 ms | ██████  14
  44 ms | ███████  17
  45 ms | █████████  21
  46 ms | ████████  18
  47 ms | ████  9
  48 ms | ██  5
  49 ms | █  2
  51 ms |   1
  52 ms | █  2
  53 ms |   1
  54 ms |   1
  55 ms |   1
  56 ms | █  3
  58 ms |   1
  59 ms |   1
  65 ms |   1
  74 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `16.15`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.66`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.41`
- `seed` = `7417.00`
- `preload_duration_ms` = `77.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `29.02`, min `14.83`, p50 `28.95`, p95 `45.17`, p99 `50.18`, 1%low `17.12`, 0.1%low `14.83`, std `6.47`

**Frame time (ms)**  avg `35.90`, p50 `34.54`, p95 `47.25`, p99 `53.53`, p99.9 `62.88`, max `67.42`

**Client tick (ms)**  avg `0.33`, p95 `0.49`, max `1.46`

**Memory**  start `1363 MB`, end `2153 MB`, peak `2166 MB`, GC `25 events / 186 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |                                                            █                   
 32.8 |                  █                                         █                   
 32.1 |                  █                            █         █  █              █    
 31.4 | █      █         █                            █         █  █   █          █ █  
 30.7 | █      █      █  █            █               █         █  █ █ █         ██ █  
 30.0 | █    █ █      █  ██    █      █  █    ███  █  █   █     █  █ █ █ █      ███ ██ 
 29.3 |███   ███   █ ██  ██    █ █   ██  █    ███  █  ██  █  █  █ ██ █ █ █      ███ ██ 
 28.6 |████ ████  ██████ ██ ████ ███ ███ █   ████  █  ███ █  █  █ ██ █ ████     ███ ███
 27.9 |████ ████  ██████ ███████████ ███ █ █ █████ █ ██████████ █ ████ ████ ██  ███ ███
 27.3 |████ ████  ██████ █████████████████ ███████ █ ██████████ █ ████ ████ ███████████
 26.6 |███████████████████████████████████████████ █ ██████████████████████████████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms | █  2
  19 ms | █  4
  20 ms | ███  9
  21 ms | ████  10
  22 ms | █████  15
  23 ms | ███  7
  25 ms |   1
  28 ms | █  2
  29 ms |   1
  30 ms | █  4
  31 ms | ███  9
  32 ms | █████████████████████████  70
  33 ms | ████████████████████████████████████████  110
  34 ms | ██████████████████████  61
  35 ms | ████████████  34
  36 ms | ██████████  28
  37 ms | █████████  25
  38 ms | ████  12
  39 ms | █████  15
  40 ms | █████  14
  41 ms | ███████  18
  42 ms | ██████  16
  43 ms | █████  15
  44 ms | █████  15
  45 ms | ███████  19
  46 ms | ████  11
  47 ms | ███  9
  48 ms | ██  6
  49 ms |   1
  50 ms | ██  5
  51 ms |   1
  53 ms | █  2
  55 ms |   1
  56 ms |   1
  57 ms |   1
  59 ms |   1
  67 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `17.12`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `67.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.85`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.83`
- `seed` = `7433.00`
- `preload_duration_ms` = `34.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23141 ms  |  Sample ticks: 400

**FPS**  avg `26.31`, min `8.13`, p50 `28.24`, p95 `41.37`, p99 `48.35`, 1%low `8.66`, 0.1%low `n/a`, std `7.96`

**Frame time (ms)**  avg `43.91`, p50 `35.41`, p95 `100.98`, p99 `109.06`, p99.9 `121.93`, max `123.01`

**Client tick (ms)**  avg `0.36`, p95 `0.47`, max `10.93`

**Memory**  start `1266 MB`, end `1083 MB`, peak `2302 MB`, GC `21 events / 167 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                                               █                                
 32.9 |                                               █                                
 32.0 |    █                           █        █     █                             █  
 31.1 |   ██   █     █  █          █   █  █     █     █                  █          █  
 30.3 | █ ██   █  █  █  ██         █   █  █     █ █  ██        █      █  █  █       █  
 29.4 | ████   █  █  █  ███   █    █   █ ██     █ █  ██  █     ██     █  █  █      ██  
 28.5 | ████   █ ██  ██ ███ █ ██   ██  ██████   ████ ██  ██    ██ █  ██  █  █      ██  
 27.6 |██████  █ ███ ██ █████ ████████ ██████  █████ ██ ███ ███████ ██████ ████  █ ███ 
 26.8 |███████████████████████████████████████ ████████ ██████████████████ ████  ██████
 25.9 |███████████████████████████████████████ ████████████████████████████████████████
 25.0 |███████████████████████████████████████ ████████████████████████████████████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ██  5
  21 ms | ███  7
  22 ms | ███  7
  23 ms | █  2
  24 ms |   1
  25 ms |   1
  28 ms |   1
  31 ms | ████████  18
  32 ms | ██████████████████  39
  33 ms | ████████████████████████████████████████  86
  34 ms | █████████████████████  46
  35 ms | █████████████  29
  36 ms | ████████  17
  37 ms | ██████  12
  38 ms | ████  8
  39 ms | ███████  16
  40 ms | █████  11
  41 ms | ███████  15
  42 ms | ████████  17
  43 ms | ██████  12
  44 ms | ██████  12
  45 ms | ███████  15
  46 ms | ████  9
  47 ms | ██  4
  48 ms | ██  4
  49 ms |   1
  50 ms | █  3
  54 ms |   1
  57 ms |   1
  93 ms |   1
  94 ms |   1
  95 ms | █  2
  97 ms |   1
  98 ms | ██  5
  99 ms | █████  10
 100 ms | █████  11
 101 ms | ████  8
 102 ms | █  3
 105 ms | █  3
 106 ms |   1
 108 ms | █  2
 109 ms |   1
 111 ms |   1
 112 ms |   1
 120 ms |   1
 123 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.01`
- `fps_1pct_low` = `8.66`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `22.78`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7451.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-14.00`
- `entity_count_sample_start` = `16.00`
- `x_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23137 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `7.65`, p50 `9.94`, p95 `10.64`, p99 `11.25`, 1%low `7.77`, 0.1%low `n/a`, std `0.57`

**Frame time (ms)**  avg `102.28`, p50 `100.57`, p95 `113.48`, p99 `121.98`, p99.9 `129.91`, max `130.70`

**Client tick (ms)**  avg `0.37`, p95 `0.83`, max `2.85`

**Memory**  start `1263 MB`, end `1999 MB`, peak `2363 MB`, GC `22 events / 192 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                                        █                       
 10.4 |  █             █     █                                 █                       
 10.3 |  █             █     █               █   █             █                       
 10.1 |█ █         ██  █     █  █  ██   █ █  ██  █  █      █   ██    █   █ █   █ █  █  
  9.9 |█ █  ███ ██ ██  █ ██  ████  ███  ████ ███ █  ████  ███  ██   ████ ████  ███  ██ 
  9.7 |█ ██████ █████  ████  ████ ████  ████ ███ █ █████  ████ ███ █████ █████ ███  ██ 
  9.6 |█ ██████ █████  ████  ████ ████ █████ ███ ████████ ████ █████████ █████ ███ ███ 
  9.4 |████████ ██████ █████ ████ ██████████ █████████████████ █████████ █████ ███ ████
  9.2 |████████ ██████ █████████████████████ █████████████████ ███████████████ ████████
  9.1 |████████ ██████ █████████████████████ █████████████████████████████████ ████████
  8.9 |█████████████████████████████████████ ██████████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  87 ms | █  1
  88 ms | ██  2
  91 ms | ██  2
  92 ms | █  1
  93 ms | ███  3
  94 ms | ███  3
  95 ms | █  1
  96 ms | █  1
  97 ms | ███████  7
  98 ms | ████████████████████  19
  99 ms | ████████████████████████████████████████  38
 100 ms | ████████████████████████████████  30
 101 ms | ████████████████████  19
 102 ms | █████████████  12
 103 ms | ███████  7
 104 ms | █████  5
 105 ms | ███  3
 106 ms | ████  4
 107 ms | ████  4
 108 ms | █████  5
 109 ms | █████  5
 110 ms | █████  5
 111 ms | ████  4
 112 ms | ██  2
 113 ms | ███  3
 115 ms | █  1
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
 119 ms | █  1
 120 ms | █  1
 121 ms | █  1
 126 ms | █  1
 130 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.77`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `65.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.78`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7457.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `8.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-44.00`
- `entity_count_sample_start` = `52.00`
- `x_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24411 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `7.62`, p50 `9.92`, p95 `10.81`, p99 `11.25`, 1%low `7.80`, 0.1%low `n/a`, std `0.60`

**Frame time (ms)**  avg `102.38`, p50 `100.81`, p95 `113.86`, p99 `123.53`, p99.9 `130.00`, max `131.18`

**Client tick (ms)**  avg `0.34`, p95 `1.08`, max `3.76`

**Memory**  start `1231 MB`, end `1573 MB`, peak `2227 MB`, GC `25 events / 193 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                  █                                             
 10.4 |          █                       █                                    █        
 10.3 |          █           █         █ █           █         █              █  █     
 10.1 |  █   █   █ ██    ██  █     ██  █ ██     ██ █ █      █ ███   ██ █      █  █   █ 
  9.9 | ███  ██  █████   ██  ███   ███ █ ███  ████ █ ████ ███ ████  ████    █ █  ███ ██
  9.8 |████  ██  █████ ████  ███  ████ █ ███  ████ █ ████ ███ ████  █████  ██ █ ████ ██
  9.6 |████ ███ ██████ ████  ████ ████ █ ████ ████ █ ████ ███ █████ █████ ███ █ ████ ██
  9.4 |████ ███████████████  ████ ██████ █████████ █ ████ ███ █████ █████ █████ ████ ██
  9.3 |████████████████████ ████████████████████████ ████ ███ █████ ███████████ ████ ██
  9.1 |██████████████████████████████████████████████████ ███ █████ ████████████████ ██
  8.9 |████████████████████████████████████████████████████████████ ███████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  88 ms | ██  2
  89 ms | ██  2
  90 ms | █  1
  91 ms | ████  3
  92 ms | ██  2
  93 ms | ██  2
  94 ms | ██  2
  95 ms | ████  3
  96 ms | ██  2
  97 ms | ████████  7
  98 ms | █████████████████  14
  99 ms | ████████████████████████████████████████  33
 100 ms | ███████████████████████████████████████  32
 101 ms | ███████████████████████████  22
 102 ms | █████████████  11
 103 ms | ████████████  10
 104 ms | ██  2
 106 ms | █████  4
 107 ms | ██  2
 108 ms | █████  4
 109 ms | ██  2
 110 ms | ███████  6
 111 ms | ██████  5
 112 ms | ██████  5
 113 ms | ███████  6
 114 ms | █████  4
 115 ms | █  1
 117 ms | █  1
 122 ms | █  1
 123 ms | █  1
 125 ms | █  1
 131 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.80`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.77`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7477.00`
- `preload_duration_ms` = `1330.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23066 ms  |  Sample ticks: 400

**FPS**  avg `9.80`, min `7.16`, p50 `9.92`, p95 `10.85`, p99 `11.80`, 1%low `7.44`, 0.1%low `n/a`, std `0.73`

**Frame time (ms)**  avg `102.64`, p50 `100.83`, p95 `115.22`, p99 `127.74`, p99.9 `137.64`, max `139.69`

**Client tick (ms)**  avg `0.44`, p95 `0.86`, max `14.29`

**Memory**  start `1561 MB`, end `1020 MB`, peak `2318 MB`, GC `26 events / 204 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                         █                                                      
 10.7 |                         █               █                                      
 10.5 |                         █               █                       █              
 10.3 |               █         █            █  █                       █     █   █    
 10.1 |     █      █  █ ██   ██ ██  ███    █ █  █    ██     █ █  █████  ███   ███ █  █ 
  9.8 |   █ ██   ███  ████ █ ██ ███████ ██ █ ██ ███  ██  █ ██ █  ██████ ███  ████ █ ██ 
  9.6 |████████ █████ ████ ████ ███████████████ ███ ███████████  ██████ ███  ████ ████ 
  9.4 |██████████████ █████████ ███████████████ ███ ███████████████████ █████████ █████
  9.2 |████████████████████████ ███████████████ ███ ███████████████████ █████████ █████
  9.0 |████████████████████████████████████████████ █████████████████████████████ █████
  8.7 |████████████████████████████████████████████ ███████████████████████████████████
  8.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  76 ms | ██  2
  85 ms | █  1
  87 ms | ██  2
  88 ms | ██  2
  89 ms | █  1
  90 ms | ██  2
  92 ms | █  1
  93 ms | ███  3
  94 ms | █  1
  95 ms | █████  4
  96 ms | ███  3
  97 ms | █████  4
  98 ms | ██████████████  12
  99 ms | ████████████████████████████████████████  35
 100 ms | ██████████████████████████████████  30
 101 ms | ███████████████████████  20
 102 ms | ███████████  10
 103 ms | ██████  5
 104 ms | ██████  5
 105 ms | ██  2
 106 ms | ██████  5
 107 ms | ██████  5
 108 ms | ███  3
 109 ms | ████████  7
 110 ms | █  1
 111 ms | █████  4
 112 ms | ██████████  9
 113 ms | ██  2
 114 ms | ██  2
 115 ms | ██  2
 117 ms | ██  2
 118 ms | █  1
 121 ms | █  1
 123 ms | █  1
 124 ms | █  1
 127 ms | █  1
 129 ms | █  1
 139 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.44`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.74`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24465 ms  |  Sample ticks: 400

**FPS**  avg `9.79`, min `7.02`, p50 `9.93`, p95 `10.91`, p99 `11.69`, 1%low `7.22`, 0.1%low `n/a`, std `0.77`

**Frame time (ms)**  avg `102.80`, p50 `100.68`, p95 `116.68`, p99 `131.73`, p99.9 `140.98`, max `142.53`

**Client tick (ms)**  avg `0.44`, p95 `1.24`, max `9.50`

**Memory**  start `1959 MB`, end `1645 MB`, peak `2296 MB`, GC `26 events / 207 ms`

**FPS over sampling window (ASCII):**

```
 11.5 |                            █                                                   
 11.2 |                            █                                                   
 10.9 |  █                         █                                          █        
 10.6 |  █          █              ██                                         █        
 10.3 |  █      █   █          █   ██    █                                    █  █     
 10.0 |█ ███    ██ █████  ████ ███ ██  █ █ █  ████   ██  ████  ████ █ ██    █ █ ██  █ █
  9.7 |█ ████ ████ █████ █████ ███ ██ ██ ████ ████  ███ █████  ████ █████  ██ █ ██ ████
  9.4 |█ ████ ████ █████ █████ ███ █████ ████ ████████████████ ████ ██████ ██ █████████
  9.1 |█ █████████ ███████████ ███ ████████████████████████████████ █████████ █████████
  8.9 |█ █████████████████████████ ████████████████████████████████████████████████████
  8.6 |█ ██████████████████████████████████████████████████████████████████████████████
  8.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  69 ms | █  1
  81 ms | █  1
  85 ms | █  1
  86 ms | █  1
  88 ms | █  1
  89 ms | █  1
  90 ms | █  1
  91 ms | █████  5
  92 ms | █  1
  93 ms | ██  2
  94 ms | ██  2
  95 ms | ███  3
  96 ms | ███  3
  97 ms | ████  4
  98 ms | █████████  10
  99 ms | ███████████████████████████  29
 100 ms | ████████████████████████████████████████  43
 101 ms | ███████████████████  20
 102 ms | █████  5
 103 ms | ██████  6
 104 ms | ████  4
 105 ms | ██  2
 106 ms | ███  3
 107 ms | ███  3
 108 ms | ███  3
 109 ms | █████  5
 110 ms | ██████  6
 111 ms | ██  2
 112 ms | ███████  7
 113 ms | ████  4
 114 ms | ██  2
 115 ms | ██  2
 116 ms | ██  2
 117 ms | ██  2
 119 ms | █  1
 122 ms | █  1
 123 ms | █  1
 124 ms | █  1
 131 ms | █  1
 134 ms | █  1
 142 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `7.22`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.73`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `1434.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-54.00`
- `entity_count_sample_start` = `56.00`
- `x_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23163 ms  |  Sample ticks: 400

**FPS**  avg `9.76`, min `7.91`, p50 `9.91`, p95 `10.58`, p99 `10.90`, 1%low `7.95`, 0.1%low `n/a`, std `0.60`

**Frame time (ms)**  avg `102.90`, p50 `100.88`, p95 `115.00`, p99 `125.10`, p99.9 `126.14`, max `126.39`

**Client tick (ms)**  avg `0.37`, p95 `1.13`, max `2.66`

**Memory**  start `1677 MB`, end `1059 MB`, peak `2314 MB`, GC `26 events / 207 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |          █                                                                     
 10.4 |          █                                                           █         
 10.2 |          █     █  █                       █ █      █                 █         
 10.1 |     ██   █ █   █  █  █  ██ █  ██  █    ██ █ █ █    █ █ █  █ █   ███  ██     ██ 
  9.9 |█   ███   █ ██  █ ██  █████ █ ███  █ █  ██ █ █ █ █  █████  ████  ████ ███  ████ 
  9.7 |█  █████  ████  ████ ██████ █ ███  █ █  ████ █ ███  █████  ████  ████ ███ █████ 
  9.6 |█ ██████  ████  ████ ██████ █████ █████ ████ ██████ █████ █████ █████ ███ █████ 
  9.4 |████████ ███████████ ██████ █████ █████ ████ ████████████ █████ █████ ███ █████ 
  9.2 |████████████████████ ██████ █████ █████ █████████████████ █████ █████ ███ █████ 
  9.0 |███████████████████████████ ███████████ █████████████████████████████ █████████ 
  8.9 |███████████████████████████████████████████████████████████████████████████████ 
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  91 ms | ████  4
  92 ms | █  1
  93 ms | ███  3
  94 ms | ███  3
  95 ms | ██  2
  96 ms | ██  2
  97 ms | ██████████████  13
  98 ms | ███████████  10
  99 ms | ████████████████████████████████████████  37
 100 ms | ████████████████████████████  26
 101 ms | █████████████████████████  23
 102 ms | █████████  8
 103 ms | █████████  8
 104 ms | ████  4
 105 ms | ████  4
 106 ms | ███  3
 107 ms | ████  4
 108 ms | ███  3
 109 ms | ██  2
 110 ms | ██████  6
 111 ms | ██  2
 112 ms | ██████  6
 113 ms | ████  4
 114 ms | ██████  6
 115 ms | █  1
 117 ms | █  1
 118 ms | ██  2
 119 ms | █  1
 122 ms | █  1
 123 ms | █  1
 125 ms | ██  2
 126 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.95`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.72`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7499.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `5.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `8.00`
- `x_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23331 ms  |  Sample ticks: 400

**FPS**  avg `9.77`, min `7.71`, p50 `9.92`, p95 `10.75`, p99 `11.11`, 1%low `7.87`, 0.1%low `n/a`, std `0.58`

**Frame time (ms)**  avg `102.70`, p50 `100.78`, p95 `114.23`, p99 `119.20`, p99.9 `128.66`, max `129.62`

**Client tick (ms)**  avg `0.32`, p95 `1.20`, max `4.73`

**Memory**  start `987 MB`, end `1148 MB`, peak `2361 MB`, GC `21 events / 184 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                                   █                            
 10.6 |                                                   █               █            
 10.4 |                                             █     █    █          █            
 10.2 |                                             █     █    █          █            
 10.1 |  █         █ █   █      █  █  █   ██   ██   █ ██  ██   █ ██    █  █      █     
  9.9 |  ███  ██   ███   ███   ███ █ ██  ████  ███  █████ ███  ████ █ ██ ██ ██ █ █  █ █
  9.8 |  ███  ██   ███  ████ █ ███ █ ██  ████  ████ █████ ███  ████ ████ ██ ██ █ █  ███
  9.6 |█ ███  ██  ████ █████ █ ███ █████ ████ █████ █████ ███  ████ ████ █████ █ ██ ███
  9.4 |█████ ████ ██████████ ████████████████ █████ █████ ████ ████ ███████████████ ███
  9.3 |█████ ████████████████████████████████ █████ █████ ████ ████ ███████████████ ███
  9.1 |████████████████████████████████████████████ ██████████ ████ ███████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  88 ms | █  1
  90 ms | ██  2
  91 ms | ██  2
  92 ms | ████  4
  93 ms | ██  2
  96 ms | █████  5
  97 ms | ██████  6
  98 ms | ███████████████  14
  99 ms | ███████████████████████████  26
 100 ms | ████████████████████████████████████████  38
 101 ms | █████████████████████  20
 102 ms | █████████████  12
 103 ms | ████████████  11
 104 ms | ███  3
 105 ms | ██  2
 106 ms | ██  2
 107 ms | █████  5
 108 ms | █  1
 109 ms | ████  4
 110 ms | █████  5
 111 ms | ██████  6
 112 ms | ██████  6
 113 ms | █████  5
 114 ms | ████  4
 115 ms | █  1
 116 ms | █  1
 117 ms | ██  2
 118 ms | █  1
 124 ms | █  1
 129 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `7.87`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.74`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7507.00`
- `preload_duration_ms` = `319.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23177 ms  |  Sample ticks: 400

**FPS**  avg `9.80`, min `7.79`, p50 `9.94`, p95 `10.70`, p99 `11.71`, 1%low `7.84`, 0.1%low `n/a`, std `0.71`

**Frame time (ms)**  avg `102.62`, p50 `100.65`, p95 `117.16`, p99 `125.99`, p99.9 `128.10`, max `128.39`

**Client tick (ms)**  avg `0.33`, p95 `0.70`, max `1.79`

**Memory**  start `1612 MB`, end `1969 MB`, peak `2307 MB`, GC `22 events / 191 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                               █                                                
 10.8 |  █                            █                                                
 10.5 |  █                            █                   █                      █     
 10.3 |  █                            ██        █         ██           █  █  █   █     
 10.0 |  ██ █     ████      ███    ██ ███ █  ██ █   █  ██ ██ ███    ██ ██ █  ███ █  █  
  9.8 |  ██████ ██████  ██  ████  ███ █████ ███ █████ ███ ██ ███   ███ ██ █  ███ ████  
  9.6 |█ ██████ ███████████ ████ ████ █████ ███ █████ ███ ████████████ ████  ███ █████ 
  9.3 |█ ████████████████████████████ █████ ███ █████ ███ ████████████ █████ ███ █████ 
  9.1 |█ ████████████████████████████ █████████ █████████ ████████████ █████ ███ █████ 
  8.9 |██████████████████████████████ ████████████████████████████████ █████ ███ ██████
  8.6 |██████████████████████████████ ████████████████████████████████ ████████████████
  8.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  76 ms | █  1
  81 ms | █  1
  85 ms | █  1
  86 ms | █  1
  88 ms | ██  2
  90 ms | █  1
  92 ms | ██  2
  93 ms | ████  3
  95 ms | █████  4
  96 ms | █████  4
  97 ms | ██████████  8
  98 ms | ██████████████████████  18
  99 ms | ██████████████████████████████████████  31
 100 ms | ████████████████████████████████████████  33
 101 ms | █████████████████████████  21
 102 ms | █████████████  11
 103 ms | ████  3
 104 ms | ██  2
 105 ms | ██████  5
 106 ms | ██  2
 107 ms | ██  2
 108 ms | █████  4
 109 ms | █████  4
 110 ms | ███████  6
 112 ms | █████  4
 113 ms | ██████  5
 114 ms | ████  3
 115 ms | ██  2
 116 ms | █  1
 118 ms | █  1
 121 ms | █  1
 122 ms | █  1
 123 ms | ██  2
 124 ms | ██  2
 125 ms | █  1
 126 ms | █  1
 128 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.84`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.75`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7517.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `28.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `18.00`
- `entity_count_sample_start` = `10.00`
- `x_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `9.78`, min `7.50`, p50 `9.93`, p95 `10.73`, p99 `11.35`, 1%low `7.58`, 0.1%low `n/a`, std `0.64`

**Frame time (ms)**  avg `102.73`, p50 `100.66`, p95 `115.91`, p99 `127.68`, p99.9 `132.78`, max `133.30`

**Client tick (ms)**  avg `0.34`, p95 `1.20`, max `5.22`

**Memory**  start `2257 MB`, end `1150 MB`, peak `2418 MB`, GC `23 events / 203 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |     █                                   █              █                       
 10.5 |     █              █                    █           █  █                █      
 10.3 |     █         █    █       █            █           █  █                █      
 10.1 |     █ █    █  █    █   █ █ █   █     █  █   █  █    ██ █       █   █  █ █   █  
  9.9 |████ ████ █ █  █ █  ██  █████ ████   ██  █████  ███  ██ █      ███ █████ █ ███  
  9.7 |████ ████ █ █  █ █  ██  █████ █████  ██  █████  ███  ██ ██  ██ ███ █████ █ ███  
  9.5 |████ ████ ████ ███  ██  █████ ██████████ █████  ████ ██ ███ ██████ █████ █ ███ █
  9.4 |████ █████████ ████ ███ █████ ██████████ ██████ ████ ██ ██████████ ███████ █████
  9.2 |███████████████████ ███ ████████████████ ██████ ████ ██ ██████████ ███████ █████
  9.0 |███████████████████████ ███████████████████████ ███████ ██████████ ███████ █████
  8.8 |███████████████████████████████████████████████ ███████ ██████████ █████████████
  8.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | █  1
  87 ms | █  1
  88 ms | ██  2
  89 ms | ██  2
  90 ms | █  1
  92 ms | ███  3
  93 ms | █  1
  94 ms | ██  2
  95 ms | █  1
  96 ms | ████  4
  97 ms | ████  4
  98 ms | ███████████████████  18
  99 ms | ████████████████████████████████  30
 100 ms | ████████████████████████████████████████  37
 101 ms | ██████████████████████████  24
 102 ms | ██████████  9
 103 ms | ████  4
 104 ms | ███  3
 105 ms | ████  4
 106 ms | ████  4
 107 ms | ██  2
 109 ms | ███  3
 110 ms | ██████  6
 111 ms | █████████  8
 113 ms | ██  2
 114 ms | █████  5
 115 ms | ████  4
 116 ms | ████  4
 117 ms | █  1
 118 ms | ██  2
 127 ms | █  1
 130 ms | █  1
 133 ms | █  1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `7.58`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.73`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7523.00`
- `preload_duration_ms` = `98.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-35.00`
- `entity_count_sample_start` = `36.00`
- `x_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `9.80`, min `8.63`, p50 `9.97`, p95 `10.14`, p99 `10.88`, 1%low `8.67`, 0.1%low `n/a`, std `0.43`

**Frame time (ms)**  avg `102.23`, p50 `100.30`, p95 `111.92`, p99 `114.07`, p99.9 `115.65`, max `115.82`

**Client tick (ms)**  avg `0.27`, p95 `0.40`, max `1.68`

**Memory**  start `2324 MB`, end `2412 MB`, peak `2412 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |        █                                                                       
 10.3 |        █                                                                       
 10.2 |        █                                  █                                    
 10.0 |██  ██  ████  ████  ██  █ █  ███  █ █  ███ █ ██  ███  █ ██  ██  ███   ███   ██ █
  9.8 |██ ███  █████ █████ ██  ███ ████  ███  ███ █████ ███  ████ ███ ████  ████   ██ █
  9.7 |██ ████ █████ █████ ██  ███ ████ █████ ███ █████ ███ █████ ███ █████ █████████ █
  9.5 |██ ████ █████ █████████ ███ ████ █████ ███ █████ ███ █████ █████████████████████
  9.4 |███████ ███████████████████ ████ █████████████████████████ █████████████████████
  9.2 |███████ ████████████████████████████████████████████████████████████████████████
  9.1 |███████ ████████████████████████████████████████████████████████████████████████
  8.9 |███████ ████████████████████████████████████████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  90 ms | █  1
  92 ms | ██  3
  93 ms | █  1
  94 ms | █  1
  95 ms | █  1
  98 ms | █████████  14
  99 ms | ███████████████████  30
 100 ms | ████████████████████████████████████████  64
 101 ms | ██████████████  23
 102 ms | █  1
 103 ms | █  2
 104 ms | ██████  9
 105 ms | ███  5
 106 ms | ███  4
 107 ms | ███  5
 108 ms | ██████  9
 109 ms | █  2
 110 ms | ████  6
 111 ms | ███  5
 112 ms | ██  3
 113 ms | ██  3
 114 ms | █  2
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `9.78`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.67`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `99.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23161 ms  |  Sample ticks: 400

**FPS**  avg `9.78`, min `8.10`, p50 `9.97`, p95 `10.32`, p99 `10.75`, 1%low `8.19`, 0.1%low `n/a`, std `0.50`

**Frame time (ms)**  avg `102.52`, p50 `100.34`, p95 `112.62`, p99 `119.93`, p99.9 `122.92`, max `123.41`

**Client tick (ms)**  avg `2.42`, p95 `3.01`, max `9.19`

**Memory**  start `970 MB`, end `1002 MB`, peak `2442 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                      █                                                         
 10.4 |                      █                   █               █                  █  
 10.3 |             █        █                   █               █                  █  
 10.1 |   █  █  ██  █ █ ██   ███    ██   █   ██  █ █  ███    ██  ███    █  █    ██  ██ 
  9.9 |█  ████ ███  ███ ████ ███ █ ███  ██   ███ ███  ████  ███  ███  ███  ██  ███  ███
  9.7 |█  ████ ███ ████ ████ ███ █████ ███ █████ ███  ████  ███ ████ ████ ███ ████  ███
  9.5 |██ ████ ███ ████ ████ █████████ ███ █████ ████ █████ ███ ████ ████ █████████ ███
  9.4 |██ ████ ███ ████ ████ █████████ █████████ ██████████████ ████ ████ █████████ ███
  9.2 |███████ ███ ████ ████ ███████████████████ ███████████████████ ██████████████████
  9.0 |███████ ████████ ████ ███████████████████ ██████████████████████████████████████
  8.8 |███████ ████████ ████ ██████████████████████████████████████████████████████████
  8.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  91 ms | █  1
  92 ms | █  1
  93 ms | ████  4
  94 ms | █  1
  95 ms | ██  2
  96 ms | █  1
  97 ms | █████████  10
  98 ms | ████████████  14
  99 ms | ████████████████████████████████████  41
 100 ms | ████████████████████████████████████████  45
 101 ms | █████████████  15
 102 ms | ████  5
 103 ms | ████  4
 104 ms | █  1
 105 ms | ███  3
 106 ms | ████  5
 107 ms | ███████  8
 108 ms | ████  5
 109 ms | ██████  7
 110 ms | ███████  8
 111 ms | ██  2
 112 ms | ████  4
 113 ms | █  1
 118 ms | ███  3
 119 ms | ███  3
 120 ms | █  1
 123 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.75`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `0.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `8.19`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23079 ms  |  Sample ticks: 400

**FPS**  avg `9.76`, min `8.64`, p50 `9.97`, p95 `10.12`, p99 `10.82`, 1%low `8.65`, 0.1%low `n/a`, std `0.45`

**Frame time (ms)**  avg `102.69`, p50 `100.28`, p95 `111.99`, p99 `114.10`, p99.9 `115.69`, max `115.77`

**Client tick (ms)**  avg `0.27`, p95 `0.36`, max `1.72`

**Memory**  start `878 MB`, end `1082 MB`, peak `1082 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                                                            █   
 10.3 |                             █                                              █   
 10.1 |                             █                                              █   
 10.0 |  ███  ███   ██  ██  ██  ███ █ ██  ███  ███  ███   ███  ██  ██ █ ███ █ ██ █ ██  
  9.9 |  ███  ███  ███  ██  ██  ███ █ ██  ███  ███  ███   ███  ██  ██ █ ███ █ ██ █ ███ 
  9.8 |  ███  ███  ███  ██  ██  ███ █ ██  ███  ███  ███  ████  ███ ██ █ ███ █ ██ █ ████
  9.7 | █████ ███  ███  ██  ██  ███ ████ █████ ███  ███  ████  ███ ██ █ ███ █ ██ █ ████
  9.5 | █████ ███ █████ ██  ███ ███ ████ █████ ████ █████████  ███ ██ ███████ ████ ████
  9.4 | █████ █████████ ███ ███████ ██████████ ███████████████████ ██████████ ████ ████
  9.3 | █████ █████████ ███ ███████ ██████████ ███████████████████ ███████████████ ████
  9.2 | ███████████████ ██████████████████████████████████████████ ███████████████ ████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | █  2
  95 ms | █  1
  97 ms | █  2
  98 ms | ████  7
  99 ms | ████████████  24
 100 ms | ████████████████████████████████████████  80
 101 ms | ███████  14
 102 ms | ██  3
 103 ms | ██  4
 104 ms | █  2
 105 ms | ██  4
 106 ms | █  1
 107 ms | ████  8
 108 ms | ███  5
 109 ms | ██████  11
 110 ms | ████  7
 111 ms | ████  7
 112 ms | ███  6
 113 ms | █  1
 114 ms | █  1
 115 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.65`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3190.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.74`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `9043.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `9.81`, min `8.70`, p50 `9.97`, p95 `10.38`, p99 `11.42`, 1%low `8.72`, 0.1%low `n/a`, std `0.49`

**Frame time (ms)**  avg `102.24`, p50 `100.30`, p95 `112.44`, p99 `114.09`, p99.9 `114.79`, max `114.88`

**Client tick (ms)**  avg `0.28`, p95 `0.47`, max `1.64`

**Memory**  start `1069 MB`, end `1209 MB`, peak `1209 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |  █                                                                             
 10.2 |  █                                                         █                   
 10.0 |  ██  █    █    █      █    █    █ █  █    █ █  █ █  █  █ █ █    █   █ █ ██     
  9.9 |█ ██  █ █  ██   ██ ██ ██   ██ █ ██ █  █ █ ██ █  █ █  ██ █ ███ █ ██   █ █ ██ ██ █
  9.8 |█ ███ █ █ ███   █████ ██   ████ ██ █ ██ █ ██ █ ██ █  ██ █ █████ ██ █ ███ █████ █
  9.7 |█ ███████ ████ ██████ ██   ████ ██ █ ██ █ ██ █ ██ ██ ██ █ █████ ██ █████ ███████
  9.6 |█ ███████████████████ █████████ ████ ████ ██ ███████ ████ ████████ █████ ███████
  9.4 |█████████████████████ █████████ █████████ ██████████ ███████████████████████████
  9.3 |█████████████████████ █████████ ████████████████████████████████████████████████
  9.2 |█████████████████████ █████████ ████████████████████████████████████████████████
  9.1 |█████████████████████ ██████████████████████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | ██  3
  89 ms | █  2
  92 ms | █  2
  93 ms | █  1
  95 ms | █  2
  96 ms | █  1
  98 ms | ████████████  16
  99 ms | █████████████████████  29
 100 ms | ████████████████████████████████████████  55
 101 ms | ██████████████████  25
 102 ms | ████  5
 103 ms | █  2
 104 ms | ████  5
 105 ms | █  2
 106 ms | ███  4
 107 ms | ████  6
 108 ms | ████  6
 109 ms | ████████  11
 111 ms | ██  3
 112 ms | █████████  12
 113 ms | █  1
 114 ms | ██  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `0.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `8.72`
- `fps_harmonic_avg` = `9.78`
- `neighbour_updates` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23163 ms  |  Sample ticks: 400

**FPS**  avg `9.77`, min `8.76`, p50 `9.97`, p95 `10.17`, p99 `10.85`, 1%low `8.78`, 0.1%low `n/a`, std `0.45`

**Frame time (ms)**  avg `102.53`, p50 `100.26`, p95 `112.13`, p99 `113.27`, p99.9 `114.04`, max `114.13`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `1.68`

**Memory**  start `1529 MB`, end `1689 MB`, peak `1689 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                    █                                           
 10.2 |                                    █                                           
 10.1 |█    █       █ █              █     █   █    █    █    █           █            
  9.9 |█ █ █████  █ █ ███ █ ██ █ ███ ██ ██ ██ ██ █ █████ ██ █ ████  ██   ██ █ ██ █ ███ 
  9.8 |█ █ █████  █ █ ███ █ ██ █ ███ ██ ██ ██ ██ █ █████ ██ █ ████ ███ █ ██ █ ██ █ ███ 
  9.7 |███ █████  █ █ █████ ████ ███ ██ ██ ██ ██ █ █████ ██ █ ████ ███ ████ █ ██ █ ███ 
  9.6 |███ █████ ██ █ █████ ████████ ██ ██ ██ ██ █ █████ ██ █ ████ ██████████ ██ ██████
  9.5 |███ █████ ████ █████ ███████████ █████ ████ █████ ██ █ ███████████████ ██ ██████
  9.3 |██████████████ █████ ███████████ █████ ████ █████ ████ ███████████████ █████████
  9.2 |████████████████████ ██████████████████████ █████ ████ █████████████████████████
  9.1 |███████████████████████████████████████████ █████ ██████████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  2
  92 ms |   1
  94 ms | █  2
  95 ms | █  2
  97 ms |   1
  98 ms | █████  11
  99 ms | ████████████  24
 100 ms | ████████████████████████████████████████  81
 101 ms | ██████  13
 102 ms | ██  5
 103 ms | █  2
 104 ms | █  2
 105 ms |   1
 106 ms | █  3
 107 ms | ██  5
 108 ms | ███  6
 109 ms | ███  6
 110 ms | ██  5
 111 ms | █████  11
 112 ms | ███  6
 113 ms | ██  5
 114 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `8.78`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `9.75`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `9.79`, min `8.73`, p50 `9.98`, p95 `10.13`, p99 `10.66`, 1%low `8.77`, 0.1%low `n/a`, std `0.41`

**Frame time (ms)**  avg `102.32`, p50 `100.24`, p95 `112.08`, p99 `113.42`, p99.9 `114.33`, max `114.52`

**Client tick (ms)**  avg `0.29`, p95 `0.45`, max `1.74`

**Memory**  start `747 MB`, end `915 MB`, peak `915 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.2 |                                                  █                             
 10.1 |█                 █         █         █           █  █         █    █    █      
 10.0 |██ ██ █  ██  █    █ █  ██ █ ██ █  ██  █ ██ █ ██   ██ ██ █   █ ██ █  ██ █ █ ██ █ 
  9.9 |██ ██ ██ ██ ██    █ █  ██ █ ██ █  ██ ██ ██ █ ███  ██ ██ ██ ██ ██ █ ███ █ ████ █ 
  9.8 |██ ██ ██ ██ ████  █ █  ██ █ ████  ██ ██ ██ █ ███  ██ ██ █████ ██ █ ███ █ ██████ 
  9.6 |██ ██ █████ ████ ████  ██ █ ████ ██████ ██ █ ████ ██ ████████ ████████ █ ██████ 
  9.5 |██ ██ █████ ████ ██████████ ████ ██████ ██ █ ████ ██ ████████ ██████████████████
  9.4 |█████ █████████████████████ ███████████ ██ █ ████ ██████████████████████████████
  9.3 |█████ █████████████████████ ███████████ ████ ████ ██████████████████████████████
  9.2 |█████ █████████████████████ ███████████ ████ ████ ██████████████████████████████
  9.1 |███████████████████████████ ████████████████ ████ ██████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  90 ms | █  1
  94 ms | █  1
  95 ms | █  2
  98 ms | ████  8
  99 ms | ███████████████████  37
 100 ms | ████████████████████████████████████████  76
 101 ms | ██████  12
 102 ms | ███  5
 103 ms | █  1
 104 ms | █  2
 105 ms | ███  5
 106 ms | ████  8
 107 ms | ████  8
 108 ms | ██  4
 109 ms | ██  4
 110 ms | ███  6
 111 ms | ██  3
 112 ms | ███  6
 113 ms | ██  4
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.77`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.77`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `8053.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195062 ms  |  Sample ticks: 3600

**FPS**  avg `9.82`, min `7.69`, p50 `9.97`, p95 `10.72`, p99 `11.33`, 1%low `7.87`, 0.1%low `7.70`, std `0.63`

**Frame time (ms)**  avg `102.31`, p50 `100.29`, p95 `116.71`, p99 `124.71`, p99.9 `129.09`, max `130.08`

**Client tick (ms)**  avg `0.66`, p95 `1.15`, max `9.22`

**Memory**  start `1219 MB`, end `818 MB`, peak `1947 MB`, GC `14 events / 81 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                         █           █                                          
 10.0 |                         █           █                                          
 10.0 |                         █         █ █                                          
  9.9 |                         █         █ █       █                                  
  9.9 |          █        █  █  █         █ █  █ █ ██              █      █    █  █ █  
  9.9 |   ███ █  █   ██   ██ █  █         █ █  █ ████ ███ █ █ █    █    █ █    █  █ █  
  9.8 |█ ████ █  ██  ███ ███ █  █ █     █ █ █ ███████ ███████ █  █ █  █ █ ██  ██  █ ███
  9.8 |██████ ██ ██████████████ █ ██  ███ █ █ ███████ ███████ █ ██ █  █ █ ███████ █████
  9.7 |█████████ ██████████████ █ ███ █████ █ ███████ █████████████████ ███████████████
  9.7 |██████████████████████████████████████ ███████ █████████████████ ███████████████
  9.7 |████████████████████████████████████████████████████████████████ ███████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  76 ms |   1
  80 ms |   2
  81 ms |   1
  82 ms |   1
  85 ms |   2
  86 ms |   3
  87 ms |   3
  88 ms | █  15
  89 ms | █  12
  90 ms | █  9
  91 ms | █  15
  92 ms | ██  21
  93 ms | █  14
  94 ms | ██  22
  95 ms | ██  19
  96 ms | ██  29
  97 ms | ████  49
  98 ms | ████████  103
  99 ms | ██████████████████████████████  366
 100 ms | ████████████████████████████████████████  490
 101 ms | █████████  111
 102 ms | ███  40
 103 ms | ██  20
 104 ms | ██  21
 105 ms | ██  24
 106 ms | ██  26
 107 ms | ██  25
 108 ms | ██  28
 109 ms | ██  24
 110 ms | ██  29
 111 ms | ███  37
 112 ms | ████  48
 113 ms | ███  31
 114 ms | █  10
 115 ms | █  11
 116 ms | █  11
 117 ms | █  11
 118 ms |   4
 119 ms |   4
 120 ms | █  11
 121 ms |   5
 122 ms | █  14
 123 ms | █  11
 124 ms | █  9
 125 ms |   6
 126 ms |   3
 127 ms |   3
 128 ms |   3
 129 ms |   1
 130 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `68.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.70`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.77`
- `fps_1pct_low` = `7.87`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `22.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194369 ms  |  Sample ticks: 3600

**FPS**  avg `9.82`, min `7.33`, p50 `9.96`, p95 `10.76`, p99 `11.26`, 1%low `7.90`, 0.1%low `7.54`, std `0.61`

**Frame time (ms)**  avg `102.29`, p50 `100.36`, p95 `116.29`, p99 `124.10`, p99.9 `128.71`, max `136.46`

**Client tick (ms)**  avg `0.64`, p95 `1.05`, max `1.70`

**Memory**  start `1681 MB`, end `1433 MB`, peak `1993 MB`, GC `11 events / 60 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                                  █                                             
  9.9 |                                  █                                             
  9.9 |       █          █               █         ██                                  
  9.9 | █     ██  █      █  █         █  █  █   █  ██    █            █ █    █    █    
  9.8 |██ █ ████  █   █  █  ██  ██   ███ █  █  ██  ██   ██  █       █ █ █ ████    █    
  9.8 |█████████ ███ ███ █  ██████ █████ █  █ ███  ██ █ █████      ████ █ ████ █  █    
  9.8 |█████████ ███████ █████████ ███████  █████ ███████████ ███  ████ █ ██████  █████
  9.8 |█████████ ███████ █████████████████  █████ ███████████ ███ █████ ████████  █████
  9.7 |███████████████████████████████████  █████ █████████████████████ ███████████████
  9.7 |███████████████████████████████████ ████████████████████████████████████████████
  9.7 |███████████████████████████████████ ████████████████████████████████████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms |   3
  86 ms |   4
  87 ms |   5
  88 ms | █  8
  89 ms | █  9
  90 ms | █  11
  91 ms | ██  23
  92 ms | ██  27
  93 ms | ██  23
  94 ms | ██  23
  95 ms | ███  29
  96 ms | ███  30
  97 ms | ████  43
  98 ms | ████████  90
  99 ms | ███████████████████████████████████  381
 100 ms | ████████████████████████████████████████  436
 101 ms | ██████████  114
 102 ms | ████  47
 103 ms | ███  32
 104 ms | ██  25
 105 ms | ██  27
 106 ms | ██  21
 107 ms | ███  31
 108 ms | ███  29
 109 ms | ███  29
 110 ms | ████  46
 111 ms | ████  46
 112 ms | ███  32
 113 ms | ██  22
 114 ms | █  13
 115 ms | █  8
 116 ms | █  11
 117 ms | █  8
 118 ms |   5
 119 ms | █  6
 120 ms | █  11
 121 ms | █  11
 122 ms | █  11
 123 ms | █  9
 124 ms | █  10
 125 ms |   2
 126 ms |   4
 127 ms |   1
 128 ms |   3
 136 ms |   1
```

**Extras:**

- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.54`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.78`
- `fps_1pct_low` = `7.90`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193877 ms  |  Sample ticks: 3600

**FPS**  avg `9.85`, min `7.79`, p50 `9.98`, p95 `10.73`, p99 `11.39`, 1%low `7.88`, 0.1%low `7.80`, std `0.62`

**Frame time (ms)**  avg `102.00`, p50 `100.17`, p95 `115.86`, p99 `125.52`, p99.9 `128.13`, max `128.33`

**Client tick (ms)**  avg `0.64`, p95 `1.08`, max `1.75`

**Memory**  start `1055 MB`, end `1817 MB`, peak `1937 MB`, GC `10 events / 51 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |                   █                                                            
  9.9 |█                  █                                                            
  9.9 |██         █  █  █ ██                                        █                  
  9.9 |██      █  █  █  ████                     █  █               ██    █ █          
  9.9 |██ ██ █ █  █ ██  ████        ██         █ ██ █       █     █ ██    █ █    █     
  9.9 |██ ██ ███  █ ██  ████ █  █   ██         █ ██ █  █  █ ██   ██ ██    █ █    █    █
  9.8 |██ ██ ███  █ ███ ████ ██ █   ██   ██ █  █ ██ █ ███ ████ █ ██ ██ █ ██ █    █  █ █
  9.8 |██ ██ ████ █ ███ ███████ █   ██   ██ ██ ████ █ ███ ████ █ █████ █ ██ █    █  █ █
  9.8 |█████ ████ █ ███ ███████ █ █ ████ █████ ██████████ ██████████████ ██ █ █  ██ ███
  9.8 |██████████ █████ █████████ ██████ █████ ██████████ █████████████████ ████ ██████
  9.8 |██████████ ███████████████ █████████████████████████████████████████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  74 ms |   1
  75 ms |   1
  82 ms |   1
  83 ms |   1
  84 ms |   1
  85 ms |   1
  86 ms |   5
  87 ms | █  8
  88 ms | █  8
  89 ms |   5
  90 ms | █  16
  91 ms | █  15
  92 ms | ██  21
  93 ms | ███  32
  94 ms | ██  27
  95 ms | ███  32
  96 ms | ███  39
  97 ms | ███  37
  98 ms | █████████  101
  99 ms | ████████████████████████████████████  410
 100 ms | ████████████████████████████████████████  456
 101 ms | ██████████  112
 102 ms | ████  40
 103 ms | █  14
 104 ms | █  11
 105 ms | █  17
 106 ms | █  12
 107 ms | ██  18
 108 ms | █  15
 109 ms | ██  27
 110 ms | ████  48
 111 ms | █████  58
 112 ms | ███  37
 113 ms | ██  18
 114 ms | █  17
 115 ms | ██  18
 116 ms | █  11
 117 ms | █  12
 118 ms | █  7
 119 ms |   5
 120 ms | █  6
 121 ms | █  8
 122 ms |   5
 123 ms | █  6
 124 ms |   1
 125 ms | █  10
 126 ms | █  6
 127 ms |   4
 128 ms |   3
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.80`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.80`
- `fps_1pct_low` = `7.88`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194775 ms  |  Sample ticks: 3600

**FPS**  avg `9.81`, min `7.04`, p50 `9.96`, p95 `10.69`, p99 `11.52`, 1%low `7.76`, 0.1%low `7.07`, std `0.64`

**Frame time (ms)**  avg `102.42`, p50 `100.36`, p95 `117.23`, p99 `125.16`, p99.9 `137.13`, max `142.06`

**Client tick (ms)**  avg `0.64`, p95 `1.07`, max `1.80`

**Memory**  start `1389 MB`, end `1557 MB`, peak `1993 MB`, GC `13 events / 57 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |          █                                          █                          
  9.9 |          █                                          █                          
  9.9 |    █     █      █                                   █               █          
  9.9 |    █     █      █                 █ █               █               █        █ 
  9.9 |    ██    ██     █    ██           █████     █    █  █        █    █ █        █ 
  9.8 |  █ ██  █ ██   █ ██   ██         █ ██████    █    █ ██  ██    █    █ █ █     ██ 
  9.8 | █████ ██ ██   ████ ██████       █ ██████    █ █ ██ ██  ██ █ ██    █████  ██████
  9.8 | █████ ██ ██ ██████████████ ████ █ ██████ ████ ███████ ███ ████ █  █████████████
  9.8 |██████ ██ ██ ███████████████████ ████████ ████████████ ███████████ █████████████
  9.7 |█████████ ██ ███████████████████ █████████████████████ █████████████████████████
  9.7 |██████████████████████████████████████████████████████ █████████████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  72 ms |   1
  79 ms |   1
  80 ms |   1
  81 ms |   1
  82 ms |   2
  84 ms | █  6
  85 ms |   2
  86 ms | █  7
  87 ms |   3
  88 ms | █  8
  89 ms | █  7
  90 ms | █  7
  91 ms | █  10
  92 ms | ██  22
  93 ms | █  14
  94 ms | ██  18
  95 ms | ███  29
  96 ms | ███  38
  97 ms | ███  34
  98 ms | ██████████  114
  99 ms | ███████████████████████████████  341
 100 ms | ████████████████████████████████████████  439
 101 ms | █████████████  146
 102 ms | █████  56
 103 ms | ██  19
 104 ms | ███  29
 105 ms | ██  25
 106 ms | ███  31
 107 ms | ██  27
 108 ms | ███  29
 109 ms | ███  29
 110 ms | ████  43
 111 ms | ████  48
 112 ms | ███  28
 113 ms | █  16
 114 ms | █  12
 115 ms | █  15
 116 ms | █  9
 117 ms | █  11
 118 ms | █  6
 119 ms | █  13
 120 ms |   3
 121 ms | █  6
 122 ms | █  15
 123 ms | █  10
 124 ms | █  6
 125 ms | █  8
 126 ms |   2
 127 ms |   5
 128 ms |   2
 135 ms |   1
 140 ms |   1
 142 ms |   1
```

**Extras:**

- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.07`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.76`
- `fps_1pct_low` = `7.76`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`

