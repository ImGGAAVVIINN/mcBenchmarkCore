# MC Benchmark Core session — 2026-10-02T07:32:11.598504931+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 1250.3 | 40.7 | 26.3 | 20.70 | 1.40 | 96 | 1235 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 934.7 | 42.6 | 31.1 | 20.53 | 1.18 | 57 | 1723 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 5 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 7 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 15 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1604.3 | 43.3 | 27.6 | 19.55 | 0.67 | 42 | 2631 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 713.2 | 43.5 | 24.1 | 18.84 | 0.55 | 24 | 890 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 669.4 | 45.5 | 31.5 | 19.27 | 0.47 | 17 | 1381 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 786.8 | 48.5 | 33.3 | 18.05 | 0.46 | 19 | 1618 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 713.0 | 46.2 | 29.9 | 18.59 | 0.45 | 16 | 776 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 731.9 | 46.0 | 28.4 | 18.29 | 0.48 | 15 | 462 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 611.5 | 36.1 | 20.5 | 22.54 | 0.53 | 14 | 1009 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 793.1 | 46.3 | 30.4 | 18.43 | 0.45 | 14 | 785 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 652.4 | 41.6 | 24.7 | 19.98 | 0.48 | 14 | 1314 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 722.6 | 44.1 | 25.8 | 18.66 | 0.51 | 12 | 1273 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 736.9 | 41.7 | 28.1 | 20.55 | 0.35 | 14 | 754 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 675.2 | 40.1 | 24.2 | 20.05 | 0.37 | 14 | 1238 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 717.5 | 41.6 | 29.8 | 20.71 | 0.42 | 15 | 1827 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 1433.1 | 39.2 | 24.2 | 22.16 | 0.42 | 29 | 2723 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 125.5 | 17.6 | 14.6 | 50.77 | 6.64 | 23 | 1511 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 1331.1 | 38.0 | 24.6 | 22.85 | 0.47 | 26 | 754 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 1296.9 | 37.3 | 22.6 | 23.40 | 0.50 | 23 | 2709 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 1142.0 | 37.8 | 26.2 | 23.51 | 0.44 | 26 | 1263 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 991.2 | 34.6 | 19.8 | 24.21 | 0.51 | 24 | 2111 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 188.1 | 18.5 | 6.4 | 36.22 | 1.14 | 159 | 546 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 199.0 | 26.3 | 21.7 | 36.11 | 0.78 | 24 | 2368 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 103.9 | 21.1 | 19.3 | 46.02 | 0.78 | 20 | 2971 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 88.4 | 18.5 | 17.6 | 52.46 | 0.80 | 20 | 476 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Item entities ×500](#item-entities-500)
- [XP orbs ×500 ring](#xp-orbs-500-ring)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete)
- [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered)
- [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered)
- [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs)
- [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs)
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

Category: **Particles**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `1250.33`, min `20.78`, p50 `1342.48`, p95 `2056.12`, p99 `2256.90`, 1%low `40.68`, 0.1%low `26.33`, std `546.04`

**Frame time (ms)**  avg `1.84`, p50 `0.74`, p95 `6.25`, p99 `20.70`, p99.9 `29.12`, max `48.12`

**Client tick (ms)**  avg `1.40`, p95 `3.89`, max `10.50`

**Memory**  start `823 MB`, end `1754 MB`, peak `2058 MB`, GC `96 events / 672 ms`

**FPS over sampling window (ASCII):**

```
1955.1 |                                                                      █         
1817.5 |                                                                  █  ██         
1679.9 |                                                          ██  █████████         
1542.2 |                                                █  █    ████████████████        
1404.6 |                                           ██   █████ ███████████████████ ███   
1267.0 |                   █              █ ███ █████████████ ████████████████████████ █
1129.4 |         █       █ ███████ ██  █ ███████████████████████████████████████████████
991.8 |      ██ ████ ████████████ █████████████████████████████████████████████████████
854.1 | █   ███████████████████████████████████████████████████████████████████████████
716.5 | █ █████████████████████████████████████████████████████████████████████████████
578.9 | ███████████████████████████████████████████████████████████████████████████████
441.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7909
   1 ms | ████████  1527
   2 ms | ██  414
   3 ms | █  255
   4 ms | █  130
   5 ms |   56
   6 ms |   28
   7 ms |   21
   8 ms |   19
   9 ms |   8
  10 ms |   8
  11 ms |   4
  12 ms |   6
  13 ms |   1
  14 ms |   3
  15 ms |   18
  16 ms |   35
  17 ms |   96
  18 ms |   94
  19 ms |   64
  20 ms |   53
  21 ms |   32
  22 ms |   12
  23 ms |   11
  24 ms |   9
  25 ms |   3
  26 ms |   6
  27 ms |   4
  28 ms |   5
  30 ms |   2
  32 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   1
  39 ms |   1
  43 ms |   1
  44 ms |   1
  45 ms |   1
  48 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `sculk_charge_pop` | 240 | 1355 | 819.7 | 21.81 |
| `smoke` | 160 | 1355 | 1026.7 | 20.95 |
| `flame` | 160 | 1355 | 1093.2 | 20.52 |
| `dripping_water` | 240 | 1355 | 1157.1 | 20.67 |
| `dragon_breath` | 160 | 1355 | 1341.8 | 20.25 |
| `end_rod` | 240 | 1355 | 1493.5 | 20.07 |
| `portal` | 160 | 1355 | 1681.6 | 19.82 |
| `ALL_TOGETHER` | 1680 | 1355 | 1389.2 | 20.26 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `40.68`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `80.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `542.22`
- `fps_0p1pct_low` = `26.33`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `934.66`, min `20.40`, p50 `1043.07`, p95 `1277.73`, p99 `1549.73`, 1%low `42.57`, 0.1%low `31.11`, std `344.83`

**Frame time (ms)**  avg `2.13`, p50 `0.96`, p95 `14.94`, p99 `20.53`, p99.9 `26.88`, max `49.02`

**Client tick (ms)**  avg `1.18`, p95 `2.06`, max `20.50`

**Memory**  start `1688 MB`, end `1717 MB`, peak `3412 MB`, GC `57 events / 644 ms`

**FPS over sampling window (ASCII):**

```
1107.1 |     █                                                                          
1061.3 |     █                                    █ █    ██         █   █   █   █ █     
1015.4 |     █           ██  █     █              █ █    ███  █   ███ █ █ █ █   █ ███   
969.6 |█   ██        █  ███ █     █  █     █     ███ █  ███ ██ █ █████ ███ █ ███ ███ ██
923.8 |██ ███ ██ ██ ██ ████ ██   ██  █ █  ██  ██ ██████ ██████ █ █████ █████ ███████ ██
877.9 |██ ███ █████ ███████ ██  ███  █ █████ ██████████ ████████ ███████████ ██████████
832.1 |██ █████████ ██████████  ████████████ ███████████████████ ███████████ ██████████
786.3 |██ ████████████████████  ███████████████████████████████████████████████████████
740.4 |████████████████████████ ███████████████████████████████████████████████████████
694.6 |████████████████████████ ███████████████████████████████████████████████████████
648.7 |████████████████████████ ███████████████████████████████████████████████████████
602.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5246
   1 ms | ██████████████████████  2834
   2 ms | ███  384
   3 ms | ██  235
   4 ms | █  117
   5 ms |   50
   6 ms |   21
   7 ms |   6
   8 ms |   8
   9 ms |   5
  11 ms |   1
  12 ms |   1
  13 ms |   4
  14 ms |   8
  15 ms |   26
  16 ms |   54
  17 ms | █  109
  18 ms | █  100
  19 ms |   64
  20 ms |   40
  21 ms |   23
  22 ms |   12
  23 ms |   11
  24 ms |   9
  25 ms |   8
  26 ms |   2
  27 ms |   3
  30 ms |   4
  31 ms |   1
  32 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `42.57`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `31.11`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `469.38`
- `preload_duration_ms` = `42.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

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

- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 244 ms  |  Sample ticks: 0

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

- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 2479 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 5331 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 12880 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 1149 ms  |  Sample ticks: 0

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

- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 150 ms  |  Sample ticks: 0

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

- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

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

- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 2692 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 5442 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 8349 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 11161 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 13836 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 1255 ms  |  Sample ticks: 0

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

- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 315 ms  |  Sample ticks: 0

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

- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 13907 ms  |  Sample ticks: 0

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

- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 45 ms  |  Sample ticks: 0

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

- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 2645 ms  |  Sample ticks: 0

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

- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 36 ms  |  Sample ticks: 0

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

- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 2700 ms  |  Sample ticks: 0

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

- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `1604.33`, min `19.67`, p50 `1702.56`, p95 `2249.31`, p99 `2665.49`, 1%low `43.31`, 0.1%low `27.58`, std `542.50`

**Frame time (ms)**  avg `1.31`, p50 `0.59`, p95 `2.53`, p99 `19.55`, p99.9 `25.20`, max `50.83`

**Client tick (ms)**  avg `0.67`, p95 `1.17`, max `15.44`

**Memory**  start `2249 MB`, end `1983 MB`, peak `4880 MB`, GC `42 events / 589 ms`

**FPS over sampling window (ASCII):**

```
2012.3 |                                                               █               █
1919.2 |                                                      █  █ ██  ██ █  █      █ ██
1826.1 |█                                                    █████ ███████████    █ █ ██
1733.0 |█                            █    █         █      █ ██████████████████ █████ ██
1639.9 |█                     █   █████ █ ███ █    ███   █ █████████████████████████████
1546.8 |██                   ██  ████████ ███████ ████ █████████████████████████████████
1453.7 |██ ██                ██ ██████████████████████ █████████████████████████████████
1360.5 |██ ███   █   ██    █████████████████████████████████████████████████████████████
1267.4 |███████ ████████  ██████████████████████████████████████████████████████████████
1174.3 |█████████████████ ██████████████████████████████████████████████████████████████
1081.2 |█████████████████ ██████████████████████████████████████████████████████████████
988.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  13307
   1 ms | ███  1015
   2 ms | █  218
   3 ms |   77
   4 ms |   62
   5 ms |   34
   6 ms |   16
   7 ms |   2
   8 ms |   3
   9 ms |   2
  10 ms |   1
  11 ms |   1
  13 ms |   3
  14 ms |   9
  15 ms |   35
  16 ms |   69
  17 ms |   98
  18 ms |   86
  19 ms |   52
  20 ms |   44
  21 ms |   25
  22 ms |   17
  23 ms |   21
  24 ms |   10
  25 ms |   4
  26 ms |   1
  27 ms |   1
  28 ms |   2
  29 ms |   1
  32 ms |   1
  33 ms |   1
  36 ms |   1
  42 ms |   2
  45 ms |   1
  46 ms |   1
  49 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `760.94`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `43.31`
- `fps_0p1pct_low` = `27.58`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `53.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `713.20`, min `19.53`, p50 `757.60`, p95 `1118.92`, p99 `1179.56`, 1%low `43.49`, 0.1%low `24.08`, std `310.39`

**Frame time (ms)**  avg `2.71`, p50 `1.32`, p95 `14.88`, p99 `18.84`, p99.9 `31.09`, max `51.20`

**Client tick (ms)**  avg `0.55`, p95 `0.84`, max `12.12`

**Memory**  start `3259 MB`, end `2621 MB`, peak `4150 MB`, GC `24 events / 247 ms`

**FPS over sampling window (ASCII):**

```
871.6 |  █                            █                                                
834.0 |  █                            █  █   █ █                                      █
796.5 | ██ █       █ █               ██  ██  █ █           █                  █       █
758.9 |███ ██      █ ██████     █   ███ ███  ███   ███  █  █          █  █ █ ██      ██
721.4 |███ ██  █  ██ ████████ █ █   ███ ███ ████   ███  ██ ███      █ █  █ █ ██     ███
683.8 |███ ██  █ ████████████ ███ █████ ███ ████  ████  ██ ████ ██  ██████ ███████  ███
646.2 |███ ██ ██████████████████████████████████  █████ ██ ███████ ███████████████ ████
608.7 |███ ██ ██████████████████████████████████  ████████████████ ████████████████████
571.1 |██████ ██████████████████████████████████  ████████████████ ████████████████████
533.6 |██████ ███████████████████████████████████ █████████████████████████████████████
496.0 |██████████████████████████████████████████ █████████████████████████████████████
458.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████  1593
   1 ms | ████████████████████████████████████████  3981
   2 ms | █████████  855
   3 ms | ██  214
   4 ms | █  89
   5 ms |   28
   6 ms |   8
   7 ms |   7
   8 ms |   3
   9 ms |   3
  10 ms |   2
  11 ms |   3
  12 ms |   4
  13 ms | █  74
  14 ms | ██  161
  15 ms | █  111
  16 ms | █  72
  17 ms | █  51
  18 ms |   43
  19 ms |   28
  20 ms |   13
  21 ms |   6
  22 ms |   1
  23 ms |   6
  24 ms |   1
  25 ms |   3
  26 ms |   2
  30 ms |   1
  31 ms |   1
  33 ms |   1
  35 ms |   1
  38 ms |   1
  42 ms |   1
  43 ms |   1
  46 ms |   1
  51 ms |   1
```

**Extras:**

- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `368.51`
- `part` = `1.00`
- `fps_0p1pct_low` = `24.08`
- `seed` = `7411.00`
- `preload_duration_ms` = `61.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `43.49`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `58.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24556 ms  |  Sample ticks: 400

**FPS**  avg `669.36`, min `24.10`, p50 `715.92`, p95 `1038.80`, p99 `1140.03`, 1%low `45.50`, 0.1%low `31.52`, std `267.60`

**Frame time (ms)**  avg `2.78`, p50 `1.40`, p95 `15.49`, p99 `19.27`, p99.9 `26.70`, max `41.50`

**Client tick (ms)**  avg `0.47`, p95 `0.75`, max `2.36`

**Memory**  start `3225 MB`, end `3846 MB`, peak `4606 MB`, GC `17 events / 207 ms`

**FPS over sampling window (ASCII):**

```
813.8 |   █                                                                            
787.9 |█  █          █                                                                 
761.9 |█ ██   █    █ █                          █                                      
736.0 |████   █ ██ ████                 █       █                                      
710.1 |████ █ █████████      █     █  █ █       █         █                 █          
684.1 |████████████████ █  █ █ ██  █  ████ █    ██   ████ █  █       █      █          
658.2 |███████████████████ █ █ ██  █ ███████  ████  █████ █  █ ██    █ █    ██ █ █     
632.2 |█████████████████████ ████████████████ ████  █████ ███████  ██████ █ ██ ███ █  █
606.3 |███████████████████████████████████████████  █████████████████████ ████ █████  █
580.3 |████████████████████████████████████████████ █████████████████████ ██████████  █
554.4 |████████████████████████████████████████████ █████████████████████████████████ █
528.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████  568
   1 ms | ████████████████████████████████████████  5090
   2 ms | █████  670
   3 ms | █  174
   4 ms | █  75
   5 ms |   29
   6 ms |   8
   7 ms |   7
   8 ms |   2
   9 ms |   1
  11 ms |   1
  12 ms |   1
  13 ms |   25
  14 ms | █  114
  15 ms | █  137
  16 ms | █  101
  17 ms | █  64
  18 ms |   48
  19 ms |   40
  20 ms |   15
  21 ms |   11
  22 ms |   8
  23 ms |   3
  24 ms |   1
  25 ms |   1
  27 ms |   2
  28 ms |   2
  29 ms |   2
  38 ms |   1
  41 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `360.02`
- `part` = `1.00`
- `fps_0p1pct_low` = `31.52`
- `seed` = `7417.00`
- `preload_duration_ms` = `1490.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.01`
- `fps_1pct_low` = `45.50`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `56.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `786.78`, min `22.28`, p50 `849.96`, p95 `1191.33`, p99 `1250.67`, 1%low `48.50`, 0.1%low `33.30`, std `313.91`

**Frame time (ms)**  avg `2.39`, p50 `1.18`, p95 `14.26`, p99 `18.05`, p99.9 `22.57`, max `44.89`

**Client tick (ms)**  avg `0.46`, p95 `0.69`, max `1.23`

**Memory**  start `3405 MB`, end `3798 MB`, peak `5024 MB`, GC `19 events / 198 ms`

**FPS over sampling window (ASCII):**

```
973.5 |  █ █     █                                                                     
934.9 |  ███     █                                                                     
896.4 |  ████  █ █ ██  █  █           █     █                                          
857.9 |███████ █ ███████████ █  █  ██ █    ██        █      █                          
819.4 |███████ █████████████ ██ █  ██ █  ████  █     █  ███ █                          
780.9 |███████ ████████████████ █ ██████ █████ █  █  ██ ███ █    ██       █   █   █    
742.4 |████████████████████████ ████████ █████ █  █ ██████████  ████ ██ █ █  ██   ███  
703.9 |█████████████████████████████████████████  █ ███████████ ████████████ ██   ███ █
665.3 |████████████████████████████████████████████ ███████████ ████████████████  ███ █
626.8 |████████████████████████████████████████████████████████ ████████████████ ████ █
588.3 |█████████████████████████████████████████████████████████████████████████ ██████
549.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████████████  2417
   1 ms | ████████████████████████████████████████  4468
   2 ms | █████  569
   3 ms | ██  201
   4 ms | █  77
   5 ms |   15
   6 ms |   2
   7 ms |   6
   8 ms |   3
   9 ms |   3
  10 ms |   1
  12 ms |   5
  13 ms | █  120
  14 ms | ██  169
  15 ms | █  93
  16 ms | █  65
  17 ms | █  58
  18 ms |   33
  19 ms |   21
  20 ms |   9
  21 ms |   4
  22 ms |   11
  23 ms |   1
  24 ms |   1
  26 ms |   1
  34 ms |   1
  40 ms |   1
  44 ms |   1
```

**Extras:**

- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `417.73`
- `part` = `1.00`
- `fps_0p1pct_low` = `33.30`
- `seed` = `7433.00`
- `preload_duration_ms` = `72.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `48.50`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `712.98`, min `18.21`, p50 `759.06`, p95 `1109.77`, p99 `1183.27`, 1%low `46.16`, 0.1%low `29.88`, std `297.68`

**Frame time (ms)**  avg `2.66`, p50 `1.32`, p95 `14.85`, p99 `18.59`, p99.9 `24.08`, max `54.90`

**Client tick (ms)**  avg `0.45`, p95 `0.62`, max `3.11`

**Memory**  start `4626 MB`, end `3906 MB`, peak `5402 MB`, GC `16 events / 213 ms`

**FPS over sampling window (ASCII):**

```
870.2 |       █                                                                        
841.8 |  ████ █ █      █                                                               
813.5 |  ████ ██████  ██                                                       █       
785.2 |██████ ██████ ███       █                                               █       
756.8 |██████ ██████ ███ █    ██     ██       █ █       █         █            █       
728.5 |█████████████ ██████   █████  ██       █ █ ██    ██     ██ █            █    █  
700.2 |█████████████ ██████  ███████ ████     █ █ ██    ██ █   ████ █ █        █ ██ █ █
671.8 |█████████████████████ ███████ ██████  ███████    ██ █ ██████ █ █ █  ██  ████ ███
643.5 |█████████████████████ ███████ ███████ ███████ █  ██ █ ██████ ███ █ █████████████
615.2 |█████████████████████████████████████ ███████ ███████ ████████████ █████████████
586.9 |█████████████████████████████████████████████ ██████████████████████████████████
558.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████  1338
   1 ms | ████████████████████████████████████████  4517
   2 ms | ███████  742
   3 ms | ██  203
   4 ms | █  69
   5 ms |   22
   6 ms |   9
   7 ms |   10
   8 ms |   4
   9 ms |   3
  12 ms |   1
  13 ms | █  73
  14 ms | ██  181
  15 ms | █  109
  16 ms | █  85
  17 ms |   49
  18 ms |   40
  19 ms |   17
  20 ms |   16
  21 ms |   3
  22 ms |   9
  23 ms |   3
  24 ms |   3
  26 ms |   2
  31 ms |   1
  33 ms |   1
  45 ms |   1
  54 ms |   1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `375.55`
- `part` = `1.00`
- `fps_0p1pct_low` = `29.88`
- `seed` = `7451.00`
- `preload_duration_ms` = `48.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-9.00`
- `entity_count_sample_start` = `10.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `46.16`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `731.93`, min `14.21`, p50 `767.99`, p95 `1161.64`, p99 `1228.27`, 1%low `46.05`, 0.1%low `28.43`, std `308.48`

**Frame time (ms)**  avg `2.57`, p50 `1.30`, p95 `14.55`, p99 `18.29`, p99.9 `26.76`, max `70.38`

**Client tick (ms)**  avg `0.48`, p95 `0.79`, max `3.37`

**Memory**  start `5274 MB`, end `5280 MB`, peak `5736 MB`, GC `15 events / 199 ms`

**FPS over sampling window (ASCII):**

```
924.2 |    █              █                                                            
886.2 |    █  █           █       █                                                    
848.1 |  ████ █ █   ██    █ ██ ██ █                                                    
810.1 |  ██████ █   █████ █ ██ ██ █  █ █    █                                          
772.0 |█ █████████  ███████████████ ██ █   ██           █      █                       
734.0 |█ █████████  ██████████████████ ██ ████    █   █ █      █ █████   █ █ █         
695.9 |█ █████████  █████████████████████ █████   █ ████████ ███ █████████ █ ██   █ █  
657.9 |█ █████████ ██████████████████████ █████   ██████████ █████████████ █ ███  █ █  
619.8 |████████████████████████████████████████   ██████████ ███████████████████ ████ █
581.7 |████████████████████████████████████████  ███████████ ████████████████████████ █
543.7 |██████████████████████████████████████████████████████████████████████████████ █
505.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████  1724
   1 ms | ████████████████████████████████████████  4416
   2 ms | ███████  757
   3 ms | ██  190
   4 ms | █  63
   5 ms |   25
   6 ms |   11
   7 ms |   5
   8 ms |   1
   9 ms |   5
  10 ms |   2
  11 ms |   4
  12 ms |   4
  13 ms | █  95
  14 ms | █  161
  15 ms | █  116
  16 ms | █  62
  17 ms |   53
  18 ms |   33
  19 ms |   23
  20 ms |   7
  21 ms |   5
  22 ms |   4
  23 ms |   4
  24 ms |   2
  25 ms |   1
  26 ms |   1
  27 ms |   2
  28 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms |   1
  37 ms |   1
  70 ms |   1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `389.15`
- `part` = `1.00`
- `fps_0p1pct_low` = `28.43`
- `seed` = `7457.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-10.00`
- `entity_count_sample_start` = `11.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `46.05`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 25387 ms  |  Sample ticks: 400

**FPS**  avg `611.50`, min `16.70`, p50 `590.25`, p95 `1107.77`, p99 `1157.26`, 1%low `36.06`, 0.1%low `20.53`, std `309.57`

**Frame time (ms)**  avg `3.38`, p50 `1.69`, p95 `16.93`, p99 `22.54`, p99.9 `36.75`, max `59.89`

**Client tick (ms)**  avg `0.53`, p95 `0.80`, max `3.83`

**Memory**  start `5050 MB`, end `3931 MB`, peak `6059 MB`, GC `14 events / 222 ms`

**FPS over sampling window (ASCII):**

```
886.0 |                                         █                                      
834.4 |                                         █          █  █                        
782.9 |                                         ████  █  █ █  █      █  █ ███    ██    
731.3 |        █                              █ ████ ███ █ █  █ ███  █  █████    ██    
679.7 |        █     █  █         █           █ ████████████ ██ ████ ██ █████   ███ █  
628.1 |      █ █     █  ███   █   █ █         ██████████████ █████████████████  █████  
576.5 |      █████ █ ██ ███   █   ███         ██████████████ ████████████████████████  
524.9 |      █████ █ ██ █████ █ █ ████     █  ██████████████ ████████████████████████ █
473.3 |██    ███████ ██ █████ ███ ████   █ █ ██████████████████████████████████████████
421.7 |██████████████████████ ████████   ██████████████████████████████████████████████
370.1 |█████████████████████████████████ ██████████████████████████████████████████████
318.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████  852
   1 ms | ████████████████████████████████████████  2864
   2 ms | ████████████████  1141
   3 ms | ████  259
   4 ms | █  102
   5 ms | █  67
   6 ms |   31
   7 ms |   23
   8 ms |   10
   9 ms |   6
  10 ms |   8
  11 ms |   5
  12 ms |   4
  13 ms |   33
  14 ms | █  74
  15 ms | █  67
  16 ms | █  76
  17 ms | █  68
  18 ms | █  48
  19 ms | █  39
  20 ms | █  37
  21 ms |   33
  22 ms |   18
  23 ms |   17
  24 ms |   7
  25 ms |   5
  26 ms |   6
  27 ms |   1
  28 ms |   2
  30 ms |   3
  31 ms |   1
  36 ms |   2
  38 ms |   1
  42 ms |   1
  49 ms |   1
  50 ms |   1
  51 ms |   1
  59 ms |   1
```

**Extras:**

- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `295.74`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.53`
- `seed` = `7477.00`
- `preload_duration_ms` = `2352.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `36.06`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `53.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `793.11`, min `22.62`, p50 `847.43`, p95 `1230.55`, p99 `1304.23`, 1%low `46.30`, 0.1%low `30.42`, std `323.50`

**Frame time (ms)**  avg `2.43`, p50 `1.18`, p95 `14.16`, p99 `18.43`, p99.9 `24.70`, max `44.21`

**Client tick (ms)**  avg `0.45`, p95 `0.75`, max `1.86`

**Memory**  start `5615 MB`, end `5760 MB`, peak `6401 MB`, GC `14 events / 179 ms`

**FPS over sampling window (ASCII):**

```
1015.4 |  █                                                                             
980.7 |█ █     ██                                                                      
946.0 |█ █  ██ ██                                                                      
911.3 |███████ ██ █         █                                                          
876.6 |██████████ █      █  █                                                          
841.9 |██████████ █ █  ██████    █  █     ██  █   ██                                   
807.2 |███████████████ ██████  █ █  █     ██████  ██  █ ██  █      █                   
772.5 |██████████████████████  ████ ███ ████████████ ██████ ███ █ ██  █   █  █         
737.7 |█████████████████████████████████████████████ ██████ ████████  █  ███ ██      █ 
703.0 |█████████████████████████████████████████████ ███████████████████████ ███     █ 
668.3 |█████████████████████████████████████████████████████████████████████████   ████
633.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████████  2463
   1 ms | ████████████████████████████████████████  4321
   2 ms | █████  536
   3 ms | ██  176
   4 ms | █  65
   5 ms |   20
   6 ms |   12
   7 ms |   4
   8 ms |   3
   9 ms |   1
  10 ms |   2
  12 ms |   19
  13 ms | █  151
  14 ms | █  146
  15 ms | █  99
  16 ms | █  56
  17 ms |   44
  18 ms |   36
  19 ms |   18
  20 ms |   15
  21 ms |   5
  22 ms |   6
  23 ms |   7
  24 ms |   3
  26 ms |   1
  32 ms |   3
  33 ms |   1
  36 ms |   1
  44 ms |   1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `411.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `30.42`
- `seed` = `7481.00`
- `preload_duration_ms` = `47.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `1.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `46.30`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25351 ms  |  Sample ticks: 400

**FPS**  avg `652.39`, min `19.51`, p50 `685.43`, p95 `1080.28`, p99 `1169.37`, 1%low `41.62`, 0.1%low `24.70`, std `296.98`

**Frame time (ms)**  avg `2.99`, p50 `1.46`, p95 `15.75`, p99 `19.98`, p99.9 `29.15`, max `51.27`

**Client tick (ms)**  avg `0.48`, p95 `0.72`, max `5.95`

**Memory**  start `5274 MB`, end `5262 MB`, peak `6588 MB`, GC `14 events / 200 ms`

**FPS over sampling window (ASCII):**

```
814.5 |  █   █    █ █  █                                                               
777.9 | ██ █ █    █ █  █              █  █  █                                          
741.3 |█████ █    ███  ██      █      █  █  █                                          
704.7 |█████ █  █ ████ ██ █  ███   █  █  █  █      █  █                 █        █   ██
668.1 |███████ ███████ ██ █ ████ ████ █ ██  █ █  █ ██ █ █    █ █     █  █ █      █  ███
631.5 |████████████████████ ████ ████ █████ █ █  █ ████ █   ██ █     █ ████     ███ ███
594.9 |█████████████████████████ ████ █████████  █ ████ ███ ██ █   █ ██████  █ ████████
558.3 |██████████████████████████████ ██████████ ██████ ████████   █████████ ██████████
521.7 |█████████████████████████████████████████ ██████████████████████████████████████
485.2 |█████████████████████████████████████████ ██████████████████████████████████████
448.6 |█████████████████████████████████████████ ██████████████████████████████████████
412.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  794
   1 ms | ████████████████████████████████████████  3871
   2 ms | ██████████  997
   3 ms | ███  291
   4 ms | █  91
   5 ms |   34
   6 ms |   25
   7 ms |   10
   8 ms |   3
   9 ms |   2
  10 ms |   1
  12 ms |   1
  13 ms |   32
  14 ms | █  111
  15 ms | █  118
  16 ms | █  86
  17 ms | █  53
  18 ms | █  59
  19 ms |   39
  20 ms |   29
  21 ms |   6
  22 ms |   9
  23 ms |   7
  24 ms |   1
  25 ms |   2
  26 ms |   2
  27 ms |   2
  28 ms |   2
  29 ms |   1
  35 ms |   1
  36 ms |   1
  38 ms |   1
  44 ms |   1
  47 ms |   1
  51 ms |   1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `334.36`
- `part` = `1.00`
- `fps_0p1pct_low` = `24.70`
- `seed` = `7487.00`
- `preload_duration_ms` = `2303.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-55.00`
- `entity_count_sample_start` = `56.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `41.62`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `722.60`, min `20.94`, p50 `778.14`, p95 `1138.12`, p99 `1247.21`, 1%low `44.06`, 0.1%low `25.78`, std `305.68`

**Frame time (ms)**  avg `2.67`, p50 `1.29`, p95 `14.75`, p99 `18.66`, p99.9 `29.94`, max `47.77`

**Client tick (ms)**  avg `0.51`, p95 `0.80`, max `4.75`

**Memory**  start `5604 MB`, end `4338 MB`, peak `6878 MB`, GC `12 events / 196 ms`

**FPS over sampling window (ASCII):**

```
918.9 |█  █                                                                            
881.9 |█ ██ █    █                                                                     
845.0 |███████   █                                                                     
808.0 |███████  ███   █                             █                         █        
771.0 |████████ ███████       ████       █ █  ██ █  █       █       █         █        
734.1 |████████████████   ███ █████ █    █ █ ███ ██ █      ██  ██   █   █     █        
697.1 |████████████████   █████████ █████████████████    █ ███████  █   ███ █ █  █   ██
660.2 |████████████████  ██████████ ██████████████████   █ ████████ ███████████████  ██
623.2 |███████████████████████████████████████████████ █ ██████████████████████████████
586.2 |███████████████████████████████████████████████ █ ██████████████████████████████
549.3 |███████████████████████████████████████████████ ████████████████████████████████
512.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████  1383
   1 ms | ████████████████████████████████████████  4497
   2 ms | ██████  663
   3 ms | ██  210
   4 ms | █  86
   5 ms |   31
   6 ms |   17
   7 ms |   10
   8 ms |   6
   9 ms |   4
  10 ms |   1
  12 ms |   10
  13 ms | █  103
  14 ms | █  131
  15 ms | █  109
  16 ms | █  96
  17 ms |   45
  18 ms |   34
  19 ms |   22
  20 ms |   9
  21 ms |   8
  22 ms |   4
  23 ms |   6
  25 ms |   3
  26 ms |   1
  27 ms |   1
  28 ms |   1
  31 ms |   2
  33 ms |   1
  35 ms |   1
  37 ms |   2
  47 ms |   2
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `375.15`
- `part` = `1.00`
- `fps_0p1pct_low` = `25.78`
- `seed` = `7499.00`
- `preload_duration_ms` = `50.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-19.00`
- `entity_count_sample_start` = `21.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `44.06`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 24120 ms  |  Sample ticks: 400

**FPS**  avg `736.90`, min `20.44`, p50 `798.16`, p95 `1147.49`, p99 `1217.15`, 1%low `41.69`, 0.1%low `28.11`, std `324.77`

**Frame time (ms)**  avg `2.85`, p50 `1.25`, p95 `16.35`, p99 `20.55`, p99.9 `27.88`, max `48.92`

**Client tick (ms)**  avg `0.35`, p95 `0.49`, max `1.23`

**Memory**  start `6360 MB`, end `6093 MB`, peak `7115 MB`, GC `14 events / 192 ms`

**FPS over sampling window (ASCII):**

```
914.3 |█    █  █                                                                       
871.4 |█ ██ █  █  ██       █       █                                                   
828.5 |██████ ███████    █ █ █     █          █               █     █                  
785.6 |██████ ████████   █ █ █████ ██ ██ █ █ ██        █      █ █   █  █  ██  █        
742.8 |████████████████  █ ███████ ██ ██ █ █ ██ █  █ █ █ ██   █ ██  █  █  ██  █        
699.9 |████████████████ ████████████████████ ██ █  ████████ █ █ ███ █  █ ████ ██       
657.0 |████████████████ █████████████████████████ █████████ █████████ ██ ████████   ███
614.1 |████████████████ ███████████████████████████████████ █████████ ███████████   ███
571.3 |████████████████████████████████████████████████████ █████████ ███████████   ███
528.4 |████████████████████████████████████████████████████ ██████████████████████  ███
485.5 |████████████████████████████████████████████████████ ██████████████████████ ████
442.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████  1820
   1 ms | ████████████████████████████████████████  3638
   2 ms | ██████  584
   3 ms | ██  160
   4 ms | █  100
   5 ms | █  76
   6 ms |   24
   7 ms |   17
   8 ms |   3
   9 ms |   2
  10 ms |   2
  12 ms |   1
  13 ms |   7
  14 ms | █  74
  15 ms | █  112
  16 ms | █  130
  17 ms | █  81
  18 ms | █  62
  19 ms |   38
  20 ms |   26
  21 ms |   18
  22 ms |   9
  23 ms |   9
  24 ms |   5
  25 ms |   6
  26 ms |   1
  27 ms |   3
  29 ms |   1
  32 ms |   1
  34 ms |   1
  37 ms |   1
  38 ms |   1
  48 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `350.44`
- `part` = `1.00`
- `fps_0p1pct_low` = `28.11`
- `seed` = `7507.00`
- `preload_duration_ms` = `1090.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `41.69`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `675.22`, min `20.49`, p50 `725.78`, p95 `1090.20`, p99 `1193.83`, 1%low `40.07`, 0.1%low `24.21`, std `304.88`

**Frame time (ms)**  avg `3.02`, p50 `1.38`, p95 `15.92`, p99 `20.05`, p99.9 `31.25`, max `48.81`

**Client tick (ms)**  avg `0.37`, p95 `0.53`, max `2.10`

**Memory**  start `6138 MB`, end `6195 MB`, peak `7377 MB`, GC `14 events / 188 ms`

**FPS over sampling window (ASCII):**

```
841.3 |   █                                                                            
809.4 |█  ███ █    █  █                  █                                             
777.4 |█████████   █  █     █   █        █                                             
745.5 |███████████ █ ███    █   █  ██    █  █  █                                       
713.5 |█████████████ ███ █ ██ █ ██ ██ █  ████  █            █              █    █      
681.5 |█████████████████ █ ██ ████ █████████████   █ █    █ █   ██         █  █ █      
649.6 |███████████████████ ██ ████ █████████████   ███    █ █ █ ██   █ █ █ █ ██ █      
617.6 |███████████████████ █████████████████████   ███    █ █ █ ███ ██████ █ ████ █    
585.6 |███████████████████ ███████████████████████████ ██ ███████████████████████ █   █
553.7 |██████████████████████████████████████████████████ ███████████████████████ █ ███
521.7 |██████████████████████████████████████████████████████████████████████████ █ ███
489.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  925
   1 ms | ████████████████████████████████████████  3965
   2 ms | ███████  724
   3 ms | ██  219
   4 ms | █  107
   5 ms | █  52
   6 ms |   25
   7 ms |   9
   8 ms |   2
   9 ms |   7
  10 ms |   1
  11 ms |   1
  13 ms |   19
  14 ms | █  97
  15 ms | ██  156
  16 ms | █  113
  17 ms | █  69
  18 ms |   45
  19 ms |   26
  20 ms |   16
  21 ms |   12
  22 ms |   8
  23 ms |   11
  24 ms |   1
  25 ms |   5
  26 ms |   2
  27 ms |   1
  28 ms |   1
  29 ms |   3
  30 ms |   1
  32 ms |   1
  36 ms |   1
  38 ms |   1
  40 ms |   1
  44 ms |   1
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `331.62`
- `part` = `1.00`
- `fps_0p1pct_low` = `24.21`
- `seed` = `7517.00`
- `preload_duration_ms` = `60.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `40.07`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23069 ms  |  Sample ticks: 400

**FPS**  avg `717.52`, min `23.59`, p50 `776.96`, p95 `1134.90`, p99 `1198.65`, 1%low `41.60`, 0.1%low `29.76`, std `328.41`

**Frame time (ms)**  avg `2.95`, p50 `1.29`, p95 `16.12`, p99 `20.71`, p99.9 `28.13`, max `42.38`

**Client tick (ms)**  avg `0.42`, p95 `0.62`, max `5.43`

**Memory**  start `5554 MB`, end `6478 MB`, peak `7381 MB`, GC `15 events / 197 ms`

**FPS over sampling window (ASCII):**

```
884.8 |     █    █                                                                     
846.7 |█ ██ █   ██  █       █ █                                    █                   
808.6 |██████ █ ███ █  █   ████       █    █       █        █      █                   
770.5 |████████ ███ █ ██   ████       █    █ █ █  ███   █   █      ██    █             
732.4 |██████████████████  ████    █  ███  ███ ██ ████  █   █      ██ █  █       █     
694.2 |██████████████████  ███████ ██ ████████████████  ███ ██   ████ ████     █ █     
656.1 |███████████████████ ███████ ████████████████████ ██████   ████ █████  █ ███     
618.0 |████████████████████████████████████████████████ ██████ █ ████ █████ ██████ █   
579.9 |████████████████████████████████████████████████ █████████████ █████ ████████  █
541.8 |████████████████████████████████████████████████████████████████████ ████████ ██
503.7 |████████████████████████████████████████████████████████████████████ ███████████
465.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████████████  1611
   1 ms | ████████████████████████████████████████  3469
   2 ms | ████████  676
   3 ms | ██  187
   4 ms | █  110
   5 ms | █  76
   6 ms |   37
   7 ms |   19
   8 ms |   4
   9 ms |   1
  10 ms |   1
  11 ms |   1
  13 ms |   18
  14 ms | █  82
  15 ms | ██  139
  16 ms | █  110
  17 ms | █  61
  18 ms | █  58
  19 ms |   30
  20 ms |   36
  21 ms |   16
  22 ms |   11
  23 ms |   4
  24 ms |   9
  25 ms |   4
  26 ms |   3
  27 ms |   2
  28 ms |   3
  29 ms |   1
  30 ms |   1
  37 ms |   1
  38 ms |   1
  42 ms |   1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `338.96`
- `part` = `1.00`
- `fps_0p1pct_low` = `29.76`
- `seed` = `7523.00`
- `preload_duration_ms` = `46.00`
- `entity_count_sample_end` = `19.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `13.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `41.60`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `50.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `1433.07`, min `16.34`, p50 `1570.16`, p95 `2029.86`, p99 `2494.10`, 1%low `39.23`, 0.1%low `24.25`, std `524.93`

**Frame time (ms)**  avg `1.64`, p50 `0.64`, p95 `5.10`, p99 `22.16`, p99.9 `28.43`, max `61.19`

**Client tick (ms)**  avg `0.42`, p95 `0.61`, max `4.77`

**Memory**  start `4659 MB`, end `3942 MB`, peak `7383 MB`, GC `29 events / 435 ms`

**FPS over sampling window (ASCII):**

```
1734.6 |                                            █                                   
1689.9 |    █                                       █                                   
1645.3 |    █      █         █               █      █                                   
1600.6 |    █ █    █         █  █            █      █              █                 █  
1556.0 |   ████    █         █  █            █      █              ██                █  
1511.4 |   ████  █ █      █  ████     █      █      █         █    ██            █ █ █  
1466.7 |  █████  █ ██     █  █████    █    █ ██    ██        ██    ██         ██ █ █ █ █
1422.1 |  █████  █ ██     █  █████  █ █ █ ██ ███   ██    █ █ ███ ████     ███ ████ █ █ █
1377.4 | ██████ █████   ██████████ ██████ ██ █████████████ ██████████  █ █████████ █ ███
1332.8 | █████████████████████████ █████████ ████████████████████████ ██ █████████ █████
1288.2 | ███████████████████████████████████████████████████████████████████████████████
1243.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  10070
   1 ms | █████  1143
   2 ms | █  193
   3 ms |   65
   4 ms |   96
   5 ms |   74
   6 ms |   32
   7 ms |   10
   8 ms |   5
   9 ms |   1
  13 ms |   1
  14 ms |   8
  15 ms |   17
  16 ms |   25
  17 ms |   54
  18 ms |   72
  19 ms |   64
  20 ms |   60
  21 ms |   60
  22 ms |   51
  23 ms |   36
  24 ms |   16
  25 ms |   11
  26 ms |   4
  27 ms |   1
  28 ms |   4
  31 ms |   1
  35 ms |   2
  36 ms |   2
  42 ms |   1
  44 ms |   2
  47 ms |   1
  50 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `39.23`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `56.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `24.25`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `609.69`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `125.46`, min `14.32`, p50 `145.45`, p95 `202.04`, p99 `232.62`, 1%low `17.56`, 0.1%low `14.64`, std `65.37`

**Frame time (ms)**  avg `12.85`, p50 `6.88`, p95 `37.21`, p99 `50.77`, p99.9 `62.97`, max `69.82`

**Client tick (ms)**  avg `6.64`, p95 `16.96`, max `34.00`

**Memory**  start `5874 MB`, end `5087 MB`, peak `7386 MB`, GC `23 events / 427 ms`

**FPS over sampling window (ASCII):**

```
199.0 |                  █                                                             
186.1 |                  █                                                             
173.2 |                  █                                                             
160.3 |                  █                                                             
147.4 | █ ██   ██  █     █       █     █    █       █            █   █        █        
134.4 | █ ██ █████ ██    █   █   █     █ █████  █  ██    █    █████ ██        ██ █ █ ██
121.5 |██████████████    ███████ █ █   █ █████████████   █████████████  █ █  ██████████
108.6 |██████████████   ███████████████████████████████████████████████████████████████
 95.7 |██████████████   ███████████████████████████████████████████████████████████████
 82.8 |███████████████ ████████████████████████████████████████████████████████████████
 69.9 |███████████████ ████████████████████████████████████████████████████████████████
 56.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   5
   3 ms | █  8
   4 ms | ███████  87
   5 ms | ████████████████████████████████████████  531
   6 ms | ████████████  155
   7 ms | █████  60
   8 ms | ████  57
   9 ms | ██████  74
  10 ms | █████  60
  11 ms | ██  27
  12 ms | █  19
  13 ms | █  9
  14 ms |   5
  15 ms |   5
  16 ms | █  14
  17 ms | █  14
  18 ms | ██  28
  19 ms | ██  23
  20 ms | ██  32
  21 ms | ███  36
  22 ms | ███  41
  23 ms | ██  30
  24 ms | ██  33
  25 ms | ██  29
  26 ms | █  11
  27 ms | █  15
  28 ms | █  13
  29 ms | █  9
  30 ms | █  12
  31 ms |   6
  32 ms | █  7
  33 ms | █  8
  34 ms |   3
  35 ms |   3
  36 ms |   5
  37 ms | █  7
  38 ms |   3
  39 ms | █  7
  40 ms | █  10
  41 ms |   4
  42 ms |   4
  43 ms |   4
  44 ms |   6
  45 ms |   2
  46 ms |   2
  47 ms |   6
  48 ms | █  7
  49 ms |   1
  50 ms |   2
  51 ms |   2
  52 ms |   2
  53 ms |   2
  54 ms |   1
  55 ms |   1
  56 ms |   1
  57 ms |   2
  58 ms |   2
  59 ms |   1
  66 ms |   1
  69 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `17.56`
- `fps_0p1pct_low` = `14.64`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `77.80`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `38.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1331.10`, min `19.05`, p50 `1481.18`, p95 `1833.12`, p99 `2064.60`, 1%low `38.02`, 0.1%low `24.61`, std `480.45`

**Frame time (ms)**  avg `1.77`, p50 `0.68`, p95 `5.71`, p99 `22.85`, p99.9 `30.64`, max `52.49`

**Client tick (ms)**  avg `0.47`, p95 `0.89`, max `3.89`

**Memory**  start `6640 MB`, end `5090 MB`, peak `7395 MB`, GC `26 events / 443 ms`

**FPS over sampling window (ASCII):**

```
1501.6 |█                               █                                               
1472.4 |█  █                            █                 █               █             
1443.3 |█  █                            █                 █ █             █             
1414.1 |█  ██    █                    █ ██                ███             █  █          
1385.0 |█  ██ █ ██                █  ██████               ███  █          ██ █          
1355.8 |█  ██ █ ██     ██  █ ██  ██  ██████  ██ █   █     ████ ██  █      ████ █    █   
1326.7 |█████ ██████   ██ ██ ██████  ██████████ █   █  █  ████████ █ █  █ ████ ██   █   
1297.5 |█████ ██████ █ █████ ██████  ██████████ ███ █  █  ████████ █ █ ██████████ ███   
1268.4 |████████████ ███████ ██████████████████ ███ █████ ████████ █ █ ██████████████   
1239.2 |████████████████████ █████████████████████████████████████ █ █████████████████  
1210.1 |██████████████████████████████████████████████████████████ █████████████████████
1180.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  9036
   1 ms | ██████  1268
   2 ms | █  188
   3 ms |   81
   4 ms |   76
   5 ms |   85
   6 ms |   42
   7 ms |   12
   8 ms |   2
   9 ms |   1
  14 ms |   1
  15 ms |   6
  16 ms |   24
  17 ms |   41
  18 ms |   52
  19 ms |   77
  20 ms |   58
  21 ms |   61
  22 ms |   60
  23 ms |   31
  24 ms |   25
  25 ms |   17
  26 ms |   14
  27 ms |   4
  28 ms |   1
  29 ms |   1
  31 ms |   2
  34 ms |   1
  35 ms |   2
  36 ms |   1
  37 ms |   1
  42 ms |   1
  44 ms |   2
  50 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `563.81`
- `part` = `1.00`
- `fps_0p1pct_low` = `24.61`
- `seed` = `9043.00`
- `preload_duration_ms` = `53.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `38.02`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3177.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `1296.95`, min `15.55`, p50 `1437.64`, p95 `1801.90`, p99 `2110.00`, 1%low `37.30`, 0.1%low `22.56`, std `477.20`

**Frame time (ms)**  avg `1.78`, p50 `0.70`, p95 `5.27`, p99 `23.40`, p99.9 `29.56`, max `64.31`

**Client tick (ms)**  avg `0.50`, p95 `1.06`, max `8.03`

**Memory**  start `4671 MB`, end `4956 MB`, peak `7381 MB`, GC `23 events / 402 ms`

**FPS over sampling window (ASCII):**

```
1531.3 | █                                                   █                          
1489.8 | █    █              █                               █ █                        
1448.3 | █ █  █ █            █                █ █            █ █                        
1406.8 | ███ █████           ██               █ █            █ █      █              █ █
1365.2 | █████████   █       ███  █          ██ █  █         █ █    █ █      █      ██ █
1323.7 | █████████   ██     ████  █          ██ █████      █ █ █ █  █ █   ████  ██ ███ █
1282.2 | █████████   ██    █████ ██  █       ██████████  █ ███ █ █  █ █   ████  ██ ███ █
1240.7 |██████████ █ ██  █ ███████████    █ ███████████ ██ █████ █  █ █ █ ██████████████
1199.2 |████████████████ █████████████   ██ ███████████ ██ █████ ████ ██████████████████
1157.6 |██████████████████████████████   ██████████████ ████████████████████████████████
1116.1 |███████████████████████████████  ███████████████████████████████████████████████
1074.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  8899
   1 ms | ██████  1319
   2 ms | █  235
   3 ms |   105
   4 ms |   106
   5 ms |   74
   6 ms |   30
   7 ms |   15
   8 ms |   6
   9 ms |   1
  10 ms |   2
  13 ms |   2
  14 ms |   1
  15 ms |   7
  16 ms |   17
  17 ms |   38
  18 ms |   41
  19 ms |   55
  20 ms |   50
  21 ms |   66
  22 ms |   47
  23 ms |   59
  24 ms |   28
  25 ms |   16
  26 ms |   7
  27 ms |   8
  28 ms |   3
  29 ms |   2
  32 ms |   2
  35 ms |   1
  36 ms |   1
  44 ms |   1
  45 ms |   2
  47 ms |   1
  48 ms |   1
  54 ms |   1
  64 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `37.30`
- `fps_harmonic_avg` = `562.97`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `22.56`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `61.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `1142.01`, min `18.04`, p50 `1272.05`, p95 `1642.02`, p99 `1946.47`, 1%low `37.82`, 0.1%low `26.24`, std `457.31`

**Frame time (ms)**  avg `2.03`, p50 `0.79`, p95 `7.13`, p99 `23.51`, p99.9 `28.76`, max `55.42`

**Client tick (ms)**  avg `0.44`, p95 `0.97`, max `2.86`

**Memory**  start `6115 MB`, end `6424 MB`, peak `7378 MB`, GC `26 events / 415 ms`

**FPS over sampling window (ASCII):**

```
1728.7 |  █                                                                             
1643.5 |  █                                                                             
1558.3 |  █                                                                             
1473.1 |  █                                                                             
1387.8 |  █                                                                             
1302.6 | ██                █   ██     █  █               █                              
1217.4 |████ ██ █        █████████ █ ██  ██ ███         ██ █ ██ █      █ █ █            
1132.2 |████ ███████    ██████████ ████ ██████████    ████████████   █ ███████ █   █   █
1047.0 |██████████████████████████████████████████  ██████████████ █████████████   █ ███
961.8 |███████████████████████████████████████████ ████████████████████████████████ ███
876.6 |███████████████████████████████████████████ ████████████████████████████████████
791.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7006
   1 ms | █████████  1631
   2 ms | ██  350
   3 ms | █  142
   4 ms | █  100
   5 ms | █  89
   6 ms |   30
   7 ms |   18
   8 ms |   7
   9 ms |   3
  11 ms |   1
  13 ms |   1
  14 ms |   6
  15 ms |   6
  16 ms |   19
  17 ms |   43
  18 ms |   46
  19 ms |   53
  20 ms |   57
  21 ms |   62
  22 ms |   51
  23 ms |   43
  24 ms |   35
  25 ms |   13
  26 ms |   11
  27 ms |   5
  28 ms |   6
  31 ms |   1
  33 ms |   2
  34 ms |   1
  35 ms |   1
  36 ms |   1
  38 ms |   1
  52 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `37.82`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `492.19`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `26.24`
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

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `991.18`, min `14.12`, p50 `1077.67`, p95 `1459.09`, p99 `1999.03`, 1%low `34.64`, 0.1%low `19.80`, std `405.10`

**Frame time (ms)**  avg `2.30`, p50 `0.93`, p95 `16.75`, p99 `24.21`, p99.9 `40.18`, max `70.82`

**Client tick (ms)**  avg `0.51`, p95 `1.01`, max `4.61`

**Memory**  start `5273 MB`, end `6826 MB`, peak `7385 MB`, GC `24 events / 427 ms`

**FPS over sampling window (ASCII):**

```
1363.9 |                                              █                                 
1311.6 | █                                            ██                                
1259.3 | █                                            ██                                
1207.1 | █  █       █                                 ██                                
1154.8 | █  █       █                                 ██                            █   
1102.5 | █ ██     █ █         █  █                    ██                █   █       █   
1050.2 | █ ███    █ █       ████ █          █ █       ██ ██ ██   ██    ██   █ █     █   
997.9 | █████    ████    ██████ ███ ███    ███       █████████ ████   ██ ███ █     █   
945.6 | ████████ ████ █████████████ ███    ████ █ █  ██████████████   ██ ███ ██   █████
893.3 |█████████ ████ █████████████████ ███████ ███████████████████ █████████████ █████
841.0 |████████████████████████████████████████ ███████████████████ ███████████████████
788.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5158
   1 ms | ██████████████████  2364
   2 ms | ███  386
   3 ms | █  113
   4 ms | █  70
   5 ms | █  91
   6 ms |   47
   7 ms |   13
   8 ms |   9
   9 ms |   5
  10 ms |   2
  11 ms |   2
  14 ms |   2
  15 ms |   7
  16 ms |   16
  17 ms |   36
  18 ms |   28
  19 ms |   52
  20 ms |   59
  21 ms |   51
  22 ms |   57
  23 ms |   52
  24 ms |   35
  25 ms |   19
  26 ms |   18
  27 ms |   3
  28 ms |   4
  29 ms |   3
  34 ms |   1
  37 ms |   1
  38 ms |   1
  40 ms |   3
  42 ms |   1
  45 ms |   1
  47 ms |   1
  51 ms |   1
  55 ms |   1
  59 ms |   1
  70 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `435.70`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `19.80`
- `seed` = `8053.00`
- `preload_duration_ms` = `64.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `34.64`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 196193 ms  |  Sample ticks: 3600

**FPS**  avg `188.09`, min `0.55`, p50 `196.16`, p95 `360.23`, p99 `469.76`, 1%low `18.50`, 0.1%low `6.43`, std `108.29`

**Frame time (ms)**  avg `9.22`, p50 `5.10`, p95 `24.86`, p99 `36.22`, p99.9 `55.16`, max `1818.87`

**Client tick (ms)**  avg `1.14`, p95 `2.12`, max `32.30`

**Memory**  start `6971 MB`, end `6425 MB`, peak `7517 MB`, GC `159 events / 2316 ms`

**FPS over sampling window (ASCII):**

```
279.9 |██                                                                              
262.9 |████                                          █      █             █  █         
246.0 |████                                  █       █    ████  █    █    █  ██        
229.0 |████                                  █    █  █  █ ████ ██ █  ███  █████      █ 
212.0 |████        █                      █ ███   █ ██  █████████ ██ ███  █████   █████
195.0 |████        █                █     █ ███   █ ██  ███████████████████████  ██████
178.0 |████        ██               █ █   █████   █ ██  ███████████████████████ ███████
161.1 |████ █ █    ███     █        ███ ███████   █████ ███████████████████████████████
144.1 |████ ███    ████    █  █    ████████████ █ █████ ███████████████████████████████
127.1 |████████ ██ ████ █ ██ ██ ██ ████████████████████ ███████████████████████████████
110.1 |██████████████████ █████████████████████████████ ███████████████████████████████
 93.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  126
   2 ms | ████████████  1349
   3 ms | ████████████████████████████████████████  4382
   4 ms | ██████████████████████████████████  3702
   5 ms | ███████████████████  2056
   6 ms | ██████████  1046
   7 ms | ███████  758
   8 ms | █████  587
   9 ms | ███  381
  10 ms | ██  225
  11 ms | █  154
  12 ms | █  116
  13 ms | █  71
  14 ms |   45
  15 ms | ██  174
  16 ms | ███  288
  17 ms | ███  337
  18 ms | █████  543
  19 ms | ████  454
  20 ms | █████  542
  21 ms | ████  479
  22 ms | ███  351
  23 ms | ███  299
  24 ms | ██  242
  25 ms | ██  224
  26 ms | █  131
  27 ms | █  121
  28 ms | █  81
  29 ms |   42
  30 ms |   41
  31 ms |   33
  32 ms |   18
  33 ms |   12
  34 ms |   16
  35 ms |   29
  36 ms |   29
  37 ms |   15
  38 ms |   21
  39 ms |   14
  40 ms |   8
  41 ms |   10
  42 ms |   9
  43 ms |   14
  44 ms |   5
  45 ms |   8
  46 ms |   7
  47 ms |   9
  48 ms |   10
  49 ms |   3
  50 ms |   5
  51 ms |   3
  52 ms |   5
  53 ms |   1
  54 ms |   5
  55 ms |   1
  57 ms |   4
  58 ms |   3
  61 ms |   2
  65 ms |   1
  66 ms |   1
  70 ms |   1
  73 ms |   1
  77 ms |   1
  78 ms |   1
  81 ms |   1
  92 ms |   1
 101 ms |   1
1818 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `108.42`
- `fps_1pct_low` = `18.50`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `87.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `1.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `6.43`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `155.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195378 ms  |  Sample ticks: 3600

**FPS**  avg `198.99`, min `14.02`, p50 `209.23`, p95 `393.02`, p99 `517.39`, 1%low `26.25`, 0.1%low `21.73`, std `115.80`

**Frame time (ms)**  avg `8.79`, p50 `4.78`, p95 `21.81`, p99 `36.11`, p99.9 `38.74`, max `71.32`

**Client tick (ms)**  avg `0.78`, p95 `1.00`, max `2.08`

**Memory**  start `5029 MB`, end `7242 MB`, peak `7398 MB`, GC `24 events / 207 ms`

**FPS over sampling window (ASCII):**

```
257.6 |                                         █               █ █          █         
246.3 |█                                       ██           ████████ ████  ████        
234.9 |█    █                                  ██   ████   ██████████████  █████       
223.6 |█    █                                 ███   ████   ███████████████ █████       
212.3 |█    █                                ████   ████  ███████████████████████    █ 
201.0 |█    █       █                   █████████   ████  █████████████████████████████
189.7 |█    ██      ██               ████████████   ████  █████████████████████████████
178.4 |█    ██      ██               ████████████  █████  █████████████████████████████
167.1 |██  ███     ███    ██         ████████████  █████  █████████████████████████████
155.7 |████████    ███  ████   ██    ██████████████████████████████████████████████████
144.4 |███████████████████████ ████████████████████████████████████████████████████████
133.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  268
   2 ms | ███████████████  1763
   3 ms | ████████████████████████████████████████  4564
   4 ms | ███████████████████████████████████████  4454
   5 ms | ████████████████████  2269
   6 ms | █████████  1025
   7 ms | ███  306
   8 ms | █  103
   9 ms |   31
  10 ms |   12
  11 ms |   7
  12 ms |   9
  13 ms |   2
  14 ms | █  77
  15 ms | ████  439
  16 ms | █████  585
  17 ms | ███████  776
  18 ms | ████████  954
  19 ms | ███████  767
  20 ms | ██████  639
  21 ms | ████  477
  22 ms | ██  242
  23 ms | █  102
  24 ms |   27
  25 ms |   12
  26 ms |   6
  27 ms |   2
  28 ms |   2
  29 ms |   5
  30 ms |   4
  31 ms |   11
  32 ms |   45
  33 ms | █  92
  34 ms | █  102
  35 ms | █  94
  36 ms | █  90
  37 ms | █  69
  38 ms |   36
  39 ms |   6
  40 ms |   1
  41 ms |   2
  44 ms |   1
  45 ms |   2
  46 ms |   1
  48 ms |   1
  57 ms |   1
  61 ms |   2
  71 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `113.82`
- `fps_1pct_low` = `26.25`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `21.73`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `155.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194250 ms  |  Sample ticks: 3600

**FPS**  avg `103.91`, min `14.30`, p50 `99.14`, p95 `260.36`, p99 `341.77`, 1%low `21.14`, 0.1%low `19.28`, std `74.30`

**Frame time (ms)**  avg `16.05`, p50 `10.09`, p95 `41.84`, p99 `46.02`, p99.9 `48.58`, max `69.91`

**Client tick (ms)**  avg `0.78`, p95 `1.01`, max `12.64`

**Memory**  start `4426 MB`, end `6518 MB`, peak `7398 MB`, GC `20 events / 180 ms`

**FPS over sampling window (ASCII):**

```
137.9 |                                                              ██    █           
133.1 |                                                              ██ █  █           
128.3 |                                                        ███ █ ████  █           
123.5 |                                                       ████ ███████████         
118.7 |                                                       ██████████████████  █    
113.9 |                                          █            ██████████████████ ██  █ 
109.1 |█     █                                   █    █ █     ████████████████████████ 
104.3 |█     █                                  ██   ████  ████████████████████████████
 99.5 |█     █   █  █                      █    ██   ████  ████████████████████████████
 94.7 |████████████████  ███            █████  ███  ███████████████████████████████████
 89.9 |█████████████████ ███     ██    ████████████ ███████████████████████████████████
 85.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █████  138
   3 ms | ██████████████████  538
   4 ms | ████████████████████  597
   5 ms | █████████████████  503
   6 ms | █████████████████████  619
   7 ms | ██████████████████████████████  882
   8 ms | ████████████████████████████████████████  1194
   9 ms | ████████████████████████████████████  1063
  10 ms | █████████████████████  634
  11 ms | ████████  251
  12 ms | ██  74
  13 ms |   9
  14 ms |   6
  15 ms |   2
  16 ms |   2
  17 ms |   13
  18 ms | ███  82
  19 ms | ██████████  295
  20 ms | ███████████████  447
  21 ms | ████████████████████  586
  22 ms | ██████████████████  542
  23 ms | ███████████  315
  24 ms | ███████  197
  25 ms | ███████  207
  26 ms | ████████  226
  27 ms | ███████  214
  28 ms | ███████  196
  29 ms | █████  161
  30 ms | ██  74
  31 ms | █  34
  32 ms |   10
  33 ms |   6
  34 ms |   6
  35 ms | █  33
  36 ms | ██  60
  37 ms | ███  86
  38 ms | ███  92
  39 ms | ███  85
  40 ms | ███  86
  41 ms | ████  110
  42 ms | ████  125
  43 ms | ████  123
  44 ms | ███  100
  45 ms | ███  76
  46 ms | ██  71
  47 ms | █  24
  48 ms |   11
  49 ms |   3
  50 ms |   2
  51 ms |   1
  53 ms |   1
  69 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `62.29`
- `fps_1pct_low` = `21.14`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `19.28`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `155.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195248 ms  |  Sample ticks: 3600

**FPS**  avg `88.41`, min `16.74`, p50 `67.92`, p95 `256.55`, p99 `342.88`, 1%low `18.53`, 0.1%low `17.57`, std `76.00`

**Frame time (ms)**  avg `20.03`, p50 `14.72`, p95 `48.55`, p99 `52.46`, p99.9 `55.72`, max `59.74`

**Client tick (ms)**  avg `0.80`, p95 `1.02`, max `13.33`

**Memory**  start `6924 MB`, end `5639 MB`, peak `7400 MB`, GC `20 events / 184 ms`

**FPS over sampling window (ASCII):**

```
132.5 |                                                                 █              
126.7 |                                                             █ ████             
120.9 |                                                          █████████ █           
115.1 |                                                         ████████████           
109.3 |                                                        █████████████           
103.5 |█                                                       ████████████████        
 97.7 |█                                                █     ██████████████████       
 91.9 |█                                         █     ██   ████████████████████ ██ █  
 86.1 |█    █                                   ██    ███  ████████████████████████████
 80.2 |████████  █ ████    █           ███████ ███   ██████████████████████████████████
 74.4 |██████████████████████  █ ██   ████████████ ████████████████████████████████████
 68.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ████████  101
   3 ms | ███████████████████████████████  411
   4 ms | ████████████████████████████████████████  528
   5 ms | ████████████████████████  324
   6 ms | █████████████████  233
   7 ms | ███████████████  204
   8 ms | █████████████████  220
   9 ms | ██████████████████████████  344
  10 ms | ████████████████████████████████████████  532
  11 ms | ████████████████████████████████████████  533
  12 ms | ███████████████████████████████████████  517
  13 ms | ████████████████████████████  369
  14 ms | ████████████████  218
  15 ms | ████████  106
  16 ms | ██  22
  17 ms |   5
  18 ms | █  16
  19 ms | ██  25
  20 ms | ██████  80
  21 ms | ███████████████  201
  22 ms | ██████████████████████████  345
  23 ms | ████████████████████████████████  427
  24 ms | ███████████████████████████████████  467
  25 ms | ████████████████████████████  368
  26 ms | ██████████████████  234
  27 ms | ████████████  157
  28 ms | █████████  114
  29 ms | ██████  79
  30 ms | ██████  79
  31 ms | ███████  88
  32 ms | █████████  126
  33 ms | ████████  110
  34 ms | ████████  105
  35 ms | █████  69
  36 ms | ███  46
  37 ms | ███  35
  38 ms | ███  37
  39 ms | ██  32
  40 ms | ███  41
  41 ms | ████  52
  42 ms | ███  38
  43 ms | ████  48
  44 ms | █████  63
  45 ms | ██████  84
  46 ms | █████████  119
  47 ms | █████████  122
  48 ms | ████████  113
  49 ms | ████████  110
  50 ms | ████████  103
  51 ms | █████  72
  52 ms | ████  49
  53 ms | ██  29
  54 ms | █  18
  55 ms | █  9
  56 ms | █  7
  57 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `49.91`
- `fps_1pct_low` = `18.53`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `85.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `15.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `70.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `17.57`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `155.00`

