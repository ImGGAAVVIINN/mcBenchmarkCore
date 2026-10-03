# MC Benchmark Core session — 2026-09-30T19:41:17.627460608+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `4096 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 272.2 | 35.6 | 19.5 | 23.19 | 0.74 | 15 | 1145 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 251.9 | 38.9 | 31.8 | 23.75 | 0.80 | 15 | 1300 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 4 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 5 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 7 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 100.8 | 37.7 | 32.1 | 23.98 | 0.45 | 16 | 953 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 104.0 | 36.9 | 24.2 | 23.32 | 0.44 | 15 | 686 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 28.6 | 16.1 | 15.5 | 58.49 | 0.48 | 20 | 917 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 29.7 | 14.9 | 13.6 | 61.36 | 0.49 | 20 | 431 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 28.5 | 14.6 | 12.8 | 59.70 | 0.44 | 20 | 451 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 28.5 | 15.2 | 13.1 | 57.44 | 0.48 | 19 | 1847 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 28.3 | 15.1 | 14.1 | 56.24 | 0.42 | 22 | 1303 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 28.4 | 15.3 | 14.2 | 55.62 | 0.44 | 23 | 1333 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 28.7 | 15.0 | 13.5 | 58.45 | 0.41 | 25 | 1594 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 28.9 | 14.3 | 13.0 | 61.80 | 0.42 | 31 | 715 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 29.6 | 13.9 | 12.9 | 68.23 | 0.48 | 33 | 251 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 28.7 | 14.1 | 13.4 | 57.19 | 0.33 | 36 | 480 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 29.2 | 15.2 | 14.4 | 62.69 | 0.45 | 39 | 796 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 28.3 | 16.0 | 12.1 | 54.19 | 0.39 | 41 | 438 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 28.4 | 20.0 | 19.3 | 48.96 | 0.26 | 12 | 548 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 32.2 | 14.8 | 14.3 | 62.84 | 3.02 | 11 | 534 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 28.4 | 20.4 | 19.9 | 48.36 | 0.28 | 11 | 784 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 28.5 | 19.6 | 19.1 | 49.61 | 0.27 | 11 | 644 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 103.2 | 9.3 | 8.8 | 100.42 | 0.30 | 24 | 628 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 103.7 | 39.8 | 36.1 | 23.69 | 0.31 | 32 | 484 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 87.3 | 12.1 | 3.9 | 61.65 | 0.90 | 389 | 188 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 38.4 | 14.8 | 12.6 | 63.85 | 0.86 | 439 | 106 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 54.0 | 14.5 | 11.2 | 63.70 | 0.92 | 567 | 633 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 77.8 | 17.3 | 14.1 | 54.35 | 0.74 | 90 | 209 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Villagers ×100 ring](#villagers-100-ring)
- [Villagers ×100 ring](#villagers-100-ring)
- [Item entities ×500](#item-entities-500)
- [XP orbs ×500 ring](#xp-orbs-500-ring)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
- [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable)
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

Category: **Particles**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `272.17`, min `18.56`, p50 `117.14`, p95 `1084.59`, p99 `1288.29`, 1%low `35.64`, 0.1%low `19.46`, std `349.92`

**Frame time (ms)**  avg `9.84`, p50 `8.54`, p95 `20.79`, p99 `23.19`, p99.9 `29.73`, max `53.89`

**Client tick (ms)**  avg `0.74`, p95 `1.24`, max `2.26`

**Memory**  start `1864 MB`, end `2189 MB`, peak `3009 MB`, GC `15 events / 156 ms`

**FPS over sampling window (ASCII):**

```
412.8 |                                                                       █        
390.1 |                                                                █  █ █ █        
367.5 |                                                █               █  █ █ █        
344.8 |                                              █ █               █  █ █ █      █ 
322.2 |                    █              █   █  █   █ ██  █ ██ █  █   █  █ █ █      █ 
299.5 |               █    █ █            █ █ █  ███ █ ██  █ ██ █  ███ █  █ █████ █  █ 
276.9 |               █  █ █ █ █  ██  █   █ █ ██ ███ █████ █ ████  ████████████████  █ 
254.3 |              █████ █ ███ ███  █  ████ ██████ ███████ ███████████████████████ █ 
231.6 |     █  ██ █ ████████████████████ ███████████ ███████████████████████████████ ██
209.0 |  █  ██ █████████████████████████ ██████████████████████████████████████████████
186.3 |███  ███████████████████████████████████████████████████████████████████████████
163.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  144
   1 ms | ███████████████████  275
   2 ms | ███  41
   3 ms | █  8
   4 ms |   1
   5 ms |   1
   6 ms | ██  26
   7 ms | ███████████  159
   8 ms | ████████████████████████████████████████  576
   9 ms | ████████████  176
  10 ms | █  12
  11 ms |   4
  13 ms |   1
  14 ms | █  17
  15 ms | ███  49
  16 ms | ████████  118
  17 ms | ████████  115
  18 ms | ██████  92
  19 ms | █████  73
  20 ms | ████  57
  21 ms | ███  42
  22 ms | █  20
  23 ms | █  9
  24 ms |   6
  25 ms |   4
  26 ms |   1
  27 ms |   1
  29 ms |   2
  48 ms |   1
  53 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `flame` | 160 | 254 | 195.5 | 22.51 |
| `dripping_water` | 240 | 254 | 248.2 | 21.93 |
| `dragon_breath` | 160 | 254 | 268.3 | 21.80 |
| `end_rod` | 240 | 254 | 257.9 | 23.88 |
| `portal` | 160 | 254 | 302.2 | 22.92 |
| `ALL_TOGETHER` | 1680 | 254 | 290.7 | 22.74 |
| `sculk_charge_pop` | 240 | 254 | 321.5 | 22.08 |
| `smoke` | 160 | 254 | 293.0 | 24.62 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `101.64`
- `fps_0p1pct_low` = `19.46`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `35.64`
- `particles_stage_smoke` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `251.90`, min `30.44`, p50 `116.97`, p95 `908.75`, p99 `1145.71`, 1%low `38.86`, 0.1%low `31.81`, std `304.78`

**Frame time (ms)**  avg `10.03`, p50 `8.55`, p95 `21.44`, p99 `23.75`, p99.9 `28.95`, max `32.85`

**Client tick (ms)**  avg `0.80`, p95 `1.14`, max `1.64`

**Memory**  start `1684 MB`, end `1754 MB`, peak `2984 MB`, GC `15 events / 147 ms`

**FPS over sampling window (ASCII):**

```
331.6 |                                                          █                     
318.8 |                                                     █    █     ██ █         █  
305.9 | █                                                   █ █  █     ██ █   █     █  
293.1 | █                                          █        █ █  █     ██ █   ███   ██ 
280.2 | █                 ███                      █ █      █ █  █   █ ██ █   ████  ██ 
267.4 |██          █      ███                      █ █      █ █ ██   █ ██ █   ████  ██ 
254.6 |██  █       █ █  █ ███ █  █   █     █  █ ████ █   █ ████ ███ ████████  ████  ██ 
241.7 |██ ██ █████ ███  █ ███ █  █   █ █████  █ ██████ █ ██████ ███ ████████  █████ ███
228.9 |██ ████████ ██████ ███ ██ █   █ ████████ ██████ █ ██████ ███ █████████ █████████
216.0 |██ ████████ ██████ ███ ██████ ██████████ ██████ █ ██████████ ███████████████████
203.2 |██████████████████████ █████████████████████████████████████ ███████████████████
190.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  52
   1 ms | █████████████████████████  376
   2 ms | ██  30
   3 ms | █  9
   4 ms |   4
   5 ms |   3
   6 ms | █  16
   7 ms | █████████  139
   8 ms | ████████████████████████████████████████  607
   9 ms | █████████  133
  10 ms | █  17
  11 ms |   4
  12 ms |   2
  13 ms |   1
  14 ms |   5
  15 ms | ███  45
  16 ms | █████  75
  17 ms | ██████  89
  18 ms | ███████  109
  19 ms | ██████  84
  20 ms | █████  74
  21 ms | ███  44
  22 ms | ██  34
  23 ms | ██  27
  24 ms |   7
  25 ms |   4
  26 ms |   1
  27 ms |   1
  28 ms |   1
  30 ms |   1
  32 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `31.81`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `99.69`
- `preload_duration_ms` = `102.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `38.86`
- `preload_chunks` = `81.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 3191 ms  |  Sample ticks: 0

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
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 6989 ms  |  Sample ticks: 0

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

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 9528 ms  |  Sample ticks: 0

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

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 893 ms  |  Sample ticks: 0

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

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 4800 ms  |  Sample ticks: 0

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

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 454 ms  |  Sample ticks: 0

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

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 708 ms  |  Sample ticks: 0

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

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 3943 ms  |  Sample ticks: 0

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
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 7809 ms  |  Sample ticks: 0

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

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 107 ms  |  Sample ticks: 0

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

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 954 ms  |  Sample ticks: 0

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

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 2161 ms  |  Sample ticks: 0

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

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 2152 ms  |  Sample ticks: 0

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

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 159 ms  |  Sample ticks: 0

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
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `part` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 1952 ms  |  Sample ticks: 0

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

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 1753 ms  |  Sample ticks: 0

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

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 1093 ms  |  Sample ticks: 0

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

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 761 ms  |  Sample ticks: 0

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

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 736 ms  |  Sample ticks: 0

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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `100.81`, min `31.40`, p50 `111.50`, p95 `134.98`, p99 `327.38`, 1%low `37.67`, 0.1%low `32.07`, std `65.33`

**Frame time (ms)**  avg `12.31`, p50 `8.97`, p95 `21.36`, p99 `23.98`, p99.9 `30.47`, max `31.84`

**Client tick (ms)**  avg `0.45`, p95 `0.61`, max `1.23`

**Memory**  start `2569 MB`, end `1234 MB`, peak `3522 MB`, GC `16 events / 150 ms`

**FPS over sampling window (ASCII):**

```
163.5 |                                                    █                           
156.6 |                                                    █                           
149.7 |                                                    █                           
142.9 |                                    █               █                           
136.0 |                                    █               █                           
129.2 |         █                    █     ██              █                     █     
122.3 |         █                    █     ██         █    █        █            █     
115.4 |         █    █               █     ██    █    █    █        █            █     
108.6 | █    █  █  █ █               █     ██  █ █    █    █  █   ███            █     
101.7 | █    █  ██ █ █ █    █ █  █   █  █  ██  █ █   ██ █  █████ █████           ██  █ 
 94.8 | ██████████████ █ ██ █ ████ ███████████ █ ███████████████ ██████ █  █████ ██████
 88.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  9
   2 ms |   7
   3 ms | █  12
   4 ms |   4
   5 ms | █  12
   6 ms | █  21
   7 ms | ██████████████  193
   8 ms | ████████████████████████████████████████  561
   9 ms | ███████████  159
  10 ms | █  18
  11 ms |   7
  12 ms |   2
  14 ms |   4
  15 ms | ██  27
  16 ms | ██████  84
  17 ms | ██████████  138
  18 ms | █████████  133
  19 ms | ████  61
  20 ms | █████  76
  21 ms | ███  36
  22 ms | ██  31
  23 ms | █  14
  24 ms |   4
  25 ms |   5
  26 ms |   3
  27 ms |   1
  30 ms |   2
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `24.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `37.67`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `81.26`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `32.07`
- `seed` = `4027.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `104.00`, min `20.95`, p50 `113.72`, p95 `130.97`, p99 `669.85`, 1%low `36.87`, 0.1%low `24.24`, std `90.27`

**Frame time (ms)**  avg `12.34`, p50 `8.79`, p95 `21.19`, p99 `23.32`, p99.9 `30.18`, max `47.73`

**Client tick (ms)**  avg `0.44`, p95 `0.54`, max `3.54`

**Memory**  start `2837 MB`, end `2894 MB`, peak `3523 MB`, GC `15 events / 140 ms`

**FPS over sampling window (ASCII):**

```
173.9 |                                           █                                    
165.9 |                               █           █                                    
157.9 |                               █           █                                    
149.9 |                           █   █           █                                    
141.9 |                           █   █           █              █       █             
133.9 | █ █                       █   █           █ █  █         █       █     █       
125.8 | █ █ █                     █   █       █   █ █  █         █    █  ██ █  █       
117.8 | █ █ █  █    █ █           █   █   █   █   █ ██ █         █    █  ██ █  █       
109.8 | █ █ █  █ █  █ █           █   █   █   █   █ ██ █         █    █  ██ █  █       
101.8 | █ █ █  █ ██ █ █           ██  ██  ██ ██   █ ██ █    █ █  █ █  ██ ████  ██ █  █ 
 93.8 |██ █ ██ ████ █ ████  ████████  ██ ███████████████ █████████ █████ ███████████ █ 
 85.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | █  20
   2 ms |   2
   3 ms |   1
   4 ms |   3
   5 ms |   1
   7 ms | ██████████  177
   8 ms | ████████████████████████████████████████  680
   9 ms | ██████  102
  10 ms | █  14
  11 ms |   2
  12 ms |   4
  14 ms |   2
  15 ms | █  13
  16 ms | ███  57
  17 ms | ███████  127
  18 ms | █████████  154
  19 ms | ██████  103
  20 ms | ████  64
  21 ms | ███  44
  22 ms | ██  26
  23 ms |   7
  24 ms |   7
  25 ms |   2
  26 ms |   3
  27 ms |   1
  34 ms |   1
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `81.02`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `36.87`
- `fps_0p1pct_low` = `24.24`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `59.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `28.64`, min `15.54`, p50 `28.80`, p95 `44.36`, p99 `55.57`, 1%low `16.14`, 0.1%low `15.54`, std `7.67`

**Frame time (ms)**  avg `36.64`, p50 `34.72`, p95 `48.87`, p99 `58.49`, p99.9 `63.39`, max `64.35`

**Client tick (ms)**  avg `0.48`, p95 `0.82`, max `3.65`

**Memory**  start `2947 MB`, end `1996 MB`, peak `3865 MB`, GC `20 events / 217 ms`

**FPS over sampling window (ASCII):**

```
 33.8 |                                                          █                     
 33.0 |             █                                ██          █                     
 32.2 |             █                      █         ██        █ █         █           
 31.4 |             █      █      █        █         ██        █ █ █       ██          
 30.6 | █ █   █     █  █   █  █   █        █   █ █   ██        █ █ █       ██          
 29.7 | █ █ █ █     █  █   █  █   █        █   █ █   ██        █ █ █   █   ██          
 28.9 | █ █ █ █  █  █  ██  ██ ██  █   ██   █ █ █ █  ██████   █ █ █ █   █ █ ██    █ ██  
 28.1 | █████ █  █  █ ███  ████████ █ ███  █ █ █ █  ██████   █ █ █ █  ██ █ ███████ ████
 27.3 |██████ █  █  ██████ ████████ ██████ █████ █  ██████  ████ ████ ████ ████████████
 26.5 |██████ ████████████ ███████████████████████  ███████ ████ ████ ████ ████████████
 25.7 |████████████████████████████████████████████ ████████████ ██████████████████████
 24.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | █  1
  13 ms | █  1
  17 ms | ██  4
  18 ms | █  2
  19 ms | █  2
  20 ms | ████  7
  21 ms | ████  7
  22 ms | ███  5
  23 ms | █  2
  24 ms | ██  4
  25 ms | █  2
  26 ms | █  1
  27 ms | █  1
  28 ms | █  2
  29 ms | █  1
  30 ms | ███  5
  31 ms | ██████████████  27
  32 ms | █████████████████████████████████  64
  33 ms | ████████████████████████████████████████  78
  34 ms | ████████████████████████████████████  71
  35 ms | ███████████████  29
  36 ms | █████████████  26
  37 ms | ██████████  20
  38 ms | ██████████  20
  39 ms | █████████  17
  40 ms | █████  10
  41 ms | ███████████  22
  42 ms | █████  9
  43 ms | ███████  14
  44 ms | █████████  17
  45 ms | █████████  17
  46 ms | █████  9
  47 ms | ████  8
  48 ms | ███████  14
  49 ms | ███  6
  50 ms | ██  3
  51 ms | █  2
  52 ms | █  1
  53 ms | ███  5
  55 ms | █  2
  56 ms | █  2
  59 ms | █  1
  60 ms | █  2
  62 ms | █  2
  64 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `preload_duration_ms` = `42.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-15.00`
- `entity_count_sample_start` = `17.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `16.14`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `66.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.29`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.54`
- `seed` = `7411.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23303 ms  |  Sample ticks: 400

**FPS**  avg `29.75`, min `13.61`, p50 `27.93`, p95 `47.67`, p99 `66.03`, 1%low `14.92`, 0.1%low `13.61`, std `17.92`

**Frame time (ms)**  avg `37.13`, p50 `35.80`, p95 `51.20`, p99 `61.36`, p99.9 `71.14`, max `73.49`

**Client tick (ms)**  avg `0.49`, p95 `0.77`, max `3.39`

**Memory**  start `3431 MB`, end `3088 MB`, peak `3863 MB`, GC `20 events / 215 ms`

**FPS over sampling window (ASCII):**

```
 69.7 |                            █                                  █                
 65.6 |                            █                                  █                
 61.6 |                            █                                  █                
 57.5 |                            █                                  █                
 53.5 |                            █                                  █                
 49.4 |                            █                                  █                
 45.4 |                            █                                  █                
 41.4 |                            █                                  █                
 37.3 |                            █                                  █                
 33.3 | █ █        █               █                                 ███       █     ██
 29.2 | █████████████  █████  █ ████ ███ ██ ███ ████ █ █ ██████ ███████████ █  ██  █ ██
 25.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  2
  11 ms | █  1
  14 ms | ██  3
  15 ms | ██  3
  16 ms | █  1
  17 ms | ██  3
  18 ms | ██  3
  19 ms | ███  4
  20 ms | ██████  8
  21 ms | █████████  12
  22 ms | ██████  8
  23 ms | ██████  8
  24 ms | ███  4
  25 ms | █  2
  27 ms | █  1
  29 ms | █████  7
  30 ms | ██████  8
  31 ms | ████████████████  22
  32 ms | ██████████████████████████████████████  53
  33 ms | ████████████████████████████████████████  56
  34 ms | █████████████████████████████  41
  35 ms | ████████████████████  28
  36 ms | █████████████  18
  37 ms | █████████████████  24
  38 ms | ██████████████  20
  39 ms | ██████  9
  40 ms | █████████████  18
  41 ms | ███████████  16
  42 ms | ███████████  15
  43 ms | █████████  12
  44 ms | ██████████████████  25
  45 ms | ██████████████  20
  46 ms | █████████  13
  47 ms | ██████  9
  48 ms | ███████████  15
  49 ms | ██████  9
  50 ms | ██████  9
  51 ms | █████  7
  52 ms | █  2
  54 ms | ███  4
  55 ms | ██  3
  57 ms | █  2
  58 ms | █  2
  59 ms | █  2
  60 ms | █  1
  61 ms | █  1
  62 ms | █  1
  63 ms | █  1
  66 ms | █  1
  69 ms | █  1
  73 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `preload_duration_ms` = `264.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `14.92`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.93`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.61`
- `seed` = `7417.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23119 ms  |  Sample ticks: 400

**FPS**  avg `28.52`, min `12.82`, p50 `28.28`, p95 `45.57`, p99 `52.22`, 1%low `14.63`, 0.1%low `12.82`, std `7.53`

**Frame time (ms)**  avg `36.90`, p50 `35.36`, p95 `48.63`, p99 `59.70`, p99.9 `74.58`, max `78.03`

**Client tick (ms)**  avg `0.44`, p95 `0.72`, max `3.30`

**Memory**  start `3422 MB`, end `3342 MB`, peak `3873 MB`, GC `20 events / 195 ms`

**FPS over sampling window (ASCII):**

```
 42.2 |                                                    █                           
 40.6 |                                                    █                           
 39.1 |                                                    █                           
 37.5 |                                                    █                           
 36.0 |                                                    █                           
 34.4 |█                                                   █                           
 32.9 |█                                                   █               █           
 31.3 |█   █      █ █                            █         █     █         █ █      █  
 29.8 |█ ███      █ █ █ █   █     █   █   ███   ██ █  ████ █   █ █  █  █   █ █ ██  ██  
 28.2 |█ █████ █  ███████   ███   ██  █  ██████ ██ ██ ████ █ ███ ██ █ ██ █ ███ ██ ███  
 26.7 |██████████████████████████████ █ ██████████████████ █ ███ ████████████████ █████
 25.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms |   1
  15 ms |   1
  18 ms | █  3
  19 ms | ████  9
  20 ms | ██  5
  21 ms | ████  9
  22 ms | ██  5
  23 ms | ██  5
  24 ms | █  3
  25 ms | █  2
  26 ms | █  2
  27 ms | █  2
  29 ms | █  2
  30 ms | ███  7
  31 ms | ██████████  22
  32 ms | ████████████████████████  50
  33 ms | ████████████████████████████████████████  85
  34 ms | ████████████████████  42
  35 ms | ████████████████  34
  36 ms | ████████████  26
  37 ms | ██████████████  30
  38 ms | ██████████  21
  39 ms | ████████  17
  40 ms | ████████  18
  41 ms | ████  8
  42 ms | ██████  13
  43 ms | ██████████  21
  44 ms | █████████  19
  45 ms | ███████  15
  46 ms | ████████  18
  47 ms | █████  11
  48 ms | █████  10
  49 ms | ██  4
  50 ms | ██  5
  51 ms | ██  4
  52 ms | █  3
  53 ms |   1
  54 ms |   1
  55 ms |   1
  59 ms | █  2
  61 ms |   1
  64 ms |   1
  66 ms |   1
  71 ms |   1
  78 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `preload_duration_ms` = `67.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `14.63`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.10`
- `part` = `1.00`
- `fps_0p1pct_low` = `12.82`
- `seed` = `7433.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `28.49`, min `13.06`, p50 `27.95`, p95 `45.32`, p99 `53.48`, 1%low `15.19`, 0.1%low `13.06`, std `9.82`

**Frame time (ms)**  avg `37.19`, p50 `35.78`, p95 `49.12`, p99 `57.44`, p99.9 `72.44`, max `76.58`

**Client tick (ms)**  avg `0.48`, p95 `0.61`, max `14.77`

**Memory**  start `2023 MB`, end `3541 MB`, peak `3870 MB`, GC `19 events / 195 ms`

**FPS over sampling window (ASCII):**

```
 50.3 |                                                █                               
 48.0 |                                                █                               
 45.7 |                                                █                               
 43.4 |                                                █                               
 41.0 |                                                █                               
 38.7 |                                                █                               
 36.4 |                                                █                █              
 34.1 |                                 █              █                █              
 31.7 |                    █           ██              ██     █         █ █    █ █     
 29.4 | ██ ██   █   █  █████   █    █  ███  ███  ██  █ ██   ███      █  █ ██  ████ ██ █
 27.1 |██████ ███████ █████████████████████████████████████████ █████████████████████ █
 24.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
  10 ms | █  1
  16 ms | █  1
  18 ms | ███  5
  19 ms | ██  3
  20 ms | ███  5
  21 ms | ██████  10
  22 ms | ██  4
  23 ms | ███  6
  24 ms | ██  3
  25 ms | █  1
  27 ms | █  2
  28 ms | ██  3
  29 ms | ██  3
  30 ms | ███  6
  31 ms | ███████████  19
  32 ms | ████████████████████████████████████  62
  33 ms | ████████████████████████████████████████  69
  34 ms | ███████████████████████████  46
  35 ms | █████████████████  29
  36 ms | ████████████████  27
  37 ms | ████████████  21
  38 ms | █████████  15
  39 ms | ██████████  17
  40 ms | ███████████  19
  41 ms | ████████████  20
  42 ms | █████  9
  43 ms | ████████████  20
  44 ms | ████████████  20
  45 ms | █████████  16
  46 ms | ██████████████  25
  47 ms | █████████  15
  48 ms | ████  7
  49 ms | █████  9
  50 ms | █  2
  51 ms | ██  3
  52 ms | ██  4
  53 ms | █  1
  54 ms | █  1
  55 ms | █  1
  56 ms | █  1
  57 ms | █  1
  59 ms | █  1
  61 ms | █  1
  63 ms | █  1
  68 ms | █  1
  76 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `preload_duration_ms` = `69.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-2.00`
- `entity_count_sample_start` = `3.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `15.19`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `61.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.89`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.06`
- `seed` = `7451.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `28.30`, min `14.08`, p50 `28.42`, p95 `39.63`, p99 `52.57`, 1%low `15.09`, 0.1%low `14.08`, std `8.08`

**Frame time (ms)**  avg `36.98`, p50 `35.19`, p95 `48.84`, p99 `56.24`, p99.9 `69.99`, max `71.01`

**Client tick (ms)**  avg `0.42`, p95 `0.71`, max `2.47`

**Memory**  start `2577 MB`, end `2943 MB`, peak `3881 MB`, GC `22 events / 217 ms`

**FPS over sampling window (ASCII):**

```
 45.2 |                                                            █                   
 43.3 |                                                            █                   
 41.3 |                                                            █                   
 39.4 |                                                            █                   
 37.5 |                                                            █                   
 35.5 |      █                                                     █                   
 33.6 |      █                                                     █                   
 31.6 |      █      █                          █  █           █    █                   
 29.7 |█ █   █    █ ██  ██   █           █ █   █  ███        ██    ███  ████           
 27.8 |████  ██████ ███████ █████  █ █ ███████ ███████ ███  ████ ███████████ ██ ████  █
 25.8 |█████████████████████████████ ███████████████████████████████████████████████ ██
 23.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   1
  12 ms |   1
  14 ms |   1
  17 ms | █  2
  18 ms |   1
  20 ms | ██  4
  21 ms | █████  10
  22 ms |   1
  23 ms |   1
  24 ms | ██  4
  25 ms | █  2
  27 ms |   1
  28 ms | █  2
  29 ms |   1
  30 ms | ████  8
  31 ms | ██████████  22
  32 ms | ███████████████████████████████  66
  33 ms | ████████████████████████████████████████  86
  34 ms | █████████████████████████  53
  35 ms | ████████████  26
  36 ms | ████████████  26
  37 ms | █████████████  28
  38 ms | ████████████  26
  39 ms | ███████  15
  40 ms | ███████████  24
  41 ms | ███████  16
  42 ms | █████  10
  43 ms | ███████  14
  44 ms | █████████  20
  45 ms | ██████  13
  46 ms | ██████  12
  47 ms | ████  8
  48 ms | ████  9
  49 ms | ██  4
  50 ms | ███  7
  51 ms | █  3
  52 ms | █  3
  53 ms |   1
  54 ms |   1
  55 ms | █  2
  56 ms |   1
  58 ms |   1
  65 ms |   1
  67 ms |   1
  69 ms |   1
  71 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `preload_duration_ms` = `37.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-42.00`
- `entity_count_sample_start` = `43.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `15.09`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.04`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.08`
- `seed` = `7457.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24698 ms  |  Sample ticks: 400

**FPS**  avg `28.37`, min `14.16`, p50 `28.48`, p95 `44.32`, p99 `53.38`, 1%low `15.31`, 0.1%low `14.16`, std `6.86`

**Frame time (ms)**  avg `36.95`, p50 `35.11`, p95 `49.12`, p99 `55.62`, p99.9 `69.84`, max `70.64`

**Client tick (ms)**  avg `0.44`, p95 `0.58`, max `2.06`

**Memory**  start `2546 MB`, end `3073 MB`, peak `3879 MB`, GC `23 events / 215 ms`

**FPS over sampling window (ASCII):**

```
 32.9 |                             █                 █       █              █         
 32.2 |      █                      █                 █       █     █        █         
 31.6 |      █                      █                 █       █     █ █      █       █ 
 30.9 |      █                      █          █ █    █       █  ██ █ █      █       █ 
 30.2 |  ██  █                      █   █      █ █    ██  █   █  ██ █ █      █     █ █ 
 29.6 |  ██  █          █           █  ██    █ █ █    ██  █ █ █  ██ █ █      █     █ █ 
 28.9 |█ ██  █     █    █           █  ██ █  █ █ ██   ██  █ █ █  ██ █ █   █  ██    █ █ 
 28.2 |█████ █     █   ███     █  ████ ██ █  ███ ██ █ ██  █ █ ██ ██ █ █   █  ██    ███ 
 27.6 |███████ ███ ██  ████    ███████ ████ ████ ██ ████  ██████ ██ █ █   █  ██  █ ███ 
 26.9 |███████████████ ████  █████████ ████ ████ ██ █████ █████████ ████  █████  █████ 
 26.2 |███████████████████████████████ ████████████ █████ █████████ ███████████ ██████ 
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | █  2
  16 ms | █  1
  17 ms | █  2
  18 ms | █  1
  19 ms | ██  3
  20 ms | ███  6
  21 ms | █████  10
  22 ms | ██  4
  23 ms | ████  7
  24 ms | █  2
  26 ms | █  2
  27 ms | █  1
  28 ms | ███  6
  29 ms | █  2
  30 ms | ███  5
  31 ms | ████████████  22
  32 ms | ███████████████████████████████  57
  33 ms | ████████████████████████████████████████  73
  34 ms | █████████████████████████████████  60
  35 ms | ████████████████████  36
  36 ms | ██████████  18
  37 ms | ████████████  22
  38 ms | █████████  16
  39 ms | █████████  17
  40 ms | ██████████  19
  41 ms | ██████████  19
  42 ms | ███████  13
  43 ms | █████  9
  44 ms | ████████  14
  45 ms | █████████  17
  46 ms | ████████████  22
  47 ms | █████████  16
  48 ms | ████  8
  49 ms | ██████  11
  50 ms | █  2
  51 ms | ██  4
  52 ms | ██  3
  53 ms | █  2
  55 ms | █  2
  57 ms | █  1
  60 ms | █  1
  69 ms | █  2
  70 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `preload_duration_ms` = `1663.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-2.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `15.31`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.06`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.16`
- `seed` = `7477.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `28.72`, min `13.54`, p50 `28.09`, p95 `46.83`, p99 `52.94`, 1%low `14.98`, 0.1%low `13.54`, std `9.14`

**Frame time (ms)**  avg `37.11`, p50 `35.60`, p95 `49.43`, p99 `58.45`, p99.9 `70.87`, max `73.85`

**Client tick (ms)**  avg `0.41`, p95 `0.79`, max `4.23`

**Memory**  start `2269 MB`, end `3126 MB`, peak `3863 MB`, GC `25 events / 227 ms`

**FPS over sampling window (ASCII):**

```
 46.3 |                                                   █                            
 44.4 |                                                   █                            
 42.4 |                                                   █                            
 40.5 |                                                   █                            
 38.6 |                                                   █                            
 36.6 |                                                   █                            
 34.7 |                                                   █                            
 32.8 |                          █          █    █        █     █                     █
 30.8 |               █  █       █          █   ██ █  █ █ █   █ █ █ █      █       █  █
 28.9 |█ ██    ██ ███ ████  ██████   ██    ██  ██████ █ █ █ █ █████ █  █   ███     █ ██
 27.0 |█ █████ ██ ███████████████████████████████████ ███ █ ███████ ██████ ████████████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
  16 ms | █  1
  17 ms | █  1
  18 ms | ███  4
  19 ms | ██████  9
  20 ms | ███████  11
  21 ms | ████  6
  22 ms | █████  8
  23 ms | █████  8
  24 ms | ███  5
  25 ms | ███  4
  26 ms | ███  4
  27 ms | █  2
  28 ms | █  1
  29 ms | █  1
  30 ms | ███  4
  31 ms | ████████████  19
  32 ms | ████████████████████████████████  49
  33 ms | ████████████████████████████████████████  61
  34 ms | █████████████████████████████████  50
  35 ms | ██████████████████████  34
  36 ms | ██████████████  22
  37 ms | ███████  10
  38 ms | ██████████  16
  39 ms | ████████████████  24
  40 ms | ██████████  15
  41 ms | ███████  11
  42 ms | ██████████  15
  43 ms | ████████████████  25
  44 ms | █████████  13
  45 ms | ████████████████  24
  46 ms | ██████████  16
  47 ms | ████████████  18
  48 ms | ██████████  16
  49 ms | █████  7
  50 ms | ██  3
  51 ms | ██  3
  52 ms | ██  3
  53 ms | ████  6
  54 ms | █  1
  55 ms | █  1
  57 ms | █  1
  58 ms | █  1
  59 ms | █  1
  65 ms | █  1
  66 ms | █  1
  68 ms | █  1
  73 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `preload_duration_ms` = `38.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `8.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `14.98`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.95`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.54`
- `seed` = `7481.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24971 ms  |  Sample ticks: 400

**FPS**  avg `28.87`, min `12.99`, p50 `28.45`, p95 `44.81`, p99 `54.10`, 1%low `14.25`, 0.1%low `12.99`, std `10.63`

**Frame time (ms)**  avg `37.06`, p50 `35.15`, p95 `50.72`, p99 `61.80`, p99.9 `74.66`, max `76.96`

**Client tick (ms)**  avg `0.42`, p95 `0.62`, max `11.70`

**Memory**  start `3170 MB`, end `3068 MB`, peak `3885 MB`, GC `31 events / 264 ms`

**FPS over sampling window (ASCII):**

```
 50.5 |                                                                     █          
 48.2 |                                                                     █          
 45.8 |                                                                     █          
 43.5 |                                                                     █          
 41.1 |                                            █                        █          
 38.8 |                                            █                        █          
 36.4 |                                            █                        █          
 34.1 |         █                                  █                        █          
 31.7 |         █               █         █     █  ██  █       ██       █   █   █      
 29.3 |█ ██ █████     █ ███     █   █     ████  ██ ██ ██ █  █ ███  ████████ █ █ █ ██ ██
 27.0 |██████████████████████ ████████████████████ ██ ███████████ ██████████████████ ██
 24.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   8 ms | █  1
  14 ms | █  2
  17 ms | █  1
  18 ms | ██  3
  19 ms | █  2
  20 ms | ████  7
  21 ms | █████  9
  22 ms | ███  6
  23 ms | ███  5
  24 ms | ████  7
  25 ms | ██  3
  27 ms | ███  5
  28 ms | ███  5
  29 ms | ██  4
  30 ms | ██████  11
  31 ms | ████████████  21
  32 ms | ███████████████████████████████  53
  33 ms | ████████████████████████████████████████  69
  34 ms | ██████████████████████████████  52
  35 ms | █████████████████████  36
  36 ms | ████████████  21
  37 ms | ██████████  17
  38 ms | █████████████  22
  39 ms | ██████  11
  40 ms | ████████  14
  41 ms | ████████  13
  42 ms | ████████  14
  43 ms | ████████  14
  44 ms | ████████  13
  45 ms | █████████████  23
  46 ms | ████████  14
  47 ms | ███████  12
  48 ms | ███  6
  49 ms | ████████  13
  50 ms | ██  3
  51 ms | ██  4
  52 ms | ███  5
  55 ms | █  1
  57 ms | █  1
  58 ms | ██  4
  59 ms | ██  3
  60 ms | █  2
  61 ms | █  2
  63 ms | █  1
  66 ms | █  1
  71 ms | █  1
  72 ms | █  1
  76 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `preload_duration_ms` = `1882.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-42.00`
- `entity_count_sample_start` = `43.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `14.25`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.98`
- `part` = `1.00`
- `fps_0p1pct_low` = `12.99`
- `seed` = `7487.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `29.63`, min `12.87`, p50 `28.09`, p95 `46.83`, p99 `57.51`, 1%low `13.94`, 0.1%low `12.87`, std `17.88`

**Frame time (ms)**  avg `36.77`, p50 `35.60`, p95 `49.01`, p99 `68.23`, p99.9 `74.96`, max `77.72`

**Client tick (ms)**  avg `0.48`, p95 `0.69`, max `4.73`

**Memory**  start `3627 MB`, end `3279 MB`, peak `3878 MB`, GC `33 events / 279 ms`

**FPS over sampling window (ASCII):**

```
 88.7 |                       █                                                        
 82.9 |                       █                                                        
 77.0 |                       █                                                        
 71.2 |                       █                                                        
 65.3 |                       █                                                        
 59.5 |                       █                                                        
 53.7 |                       █                                                        
 47.8 |                       █                                                        
 42.0 |                       █                                       █                
 36.1 |      █              █ █                                       █       █        
 30.3 |███ ████████ █ ███████████ █ ██ █ █ █ ██  █ █  ███ ██   ██  ██ ████  █████ ███ █
 24.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
   8 ms | █  1
   9 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | █  2
  18 ms | ██  4
  19 ms | ███  6
  20 ms | ███  6
  21 ms | ███████  12
  22 ms | ██████  10
  23 ms | ████  7
  24 ms | █  1
  25 ms | ██  3
  26 ms | █  1
  27 ms | ███  5
  28 ms | ██  3
  29 ms | █  2
  30 ms | █████  8
  31 ms | ██████  11
  32 ms | ███████████████████████████  48
  33 ms | ████████████████████████████████████████  71
  34 ms | ██████████████████████████  46
  35 ms | ███████████████████  33
  36 ms | █████████████████████  38
  37 ms | ████████████████  28
  38 ms | ██████████  17
  39 ms | ███████  13
  40 ms | ███████  12
  41 ms | ███████  13
  42 ms | ███████████  20
  43 ms | ████████  15
  44 ms | ████████  14
  45 ms | ████████  14
  46 ms | █████████  16
  47 ms | ███████████  20
  48 ms | ██████  11
  49 ms | ██  4
  50 ms | ██  4
  51 ms | ██  3
  52 ms | ██  4
  53 ms | ██  3
  58 ms | █  1
  59 ms | █  2
  68 ms | ██  4
  70 ms | █  1
  72 ms | █  1
  77 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `preload_duration_ms` = `67.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-30.00`
- `entity_count_sample_start` = `31.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `13.94`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.20`
- `part` = `1.00`
- `fps_0p1pct_low` = `12.87`
- `seed` = `7499.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23366 ms  |  Sample ticks: 400

**FPS**  avg `28.73`, min `13.39`, p50 `28.62`, p95 `43.56`, p99 `52.04`, 1%low `14.09`, 0.1%low `13.39`, std `14.72`

**Frame time (ms)**  avg `37.10`, p50 `34.94`, p95 `48.84`, p99 `57.19`, p99.9 `73.99`, max `74.71`

**Client tick (ms)**  avg `0.33`, p95 `0.46`, max `1.81`

**Memory**  start `3398 MB`, end `3184 MB`, peak `3878 MB`, GC `36 events / 282 ms`

**FPS over sampling window (ASCII):**

```
 75.8 |                                                                  █             
 71.0 |                                                                  █             
 66.3 |                                                                  █             
 61.5 |                                                                  █             
 56.7 |                                                                  █             
 51.9 |                                                                  █             
 47.1 |                                                                  █             
 42.4 |                                                                  █             
 37.6 |                                                                  ██            
 32.8 |       █              █              ██     ███  █  ██    █       ██   █     █  
 28.0 |██████████ ███████████████████████████████████████████ █ ████████████ ████   ███
 23.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   1
  11 ms |   1
  13 ms |   1
  18 ms | █  2
  19 ms | █  3
  20 ms | █  3
  21 ms | ████  9
  22 ms | ███  8
  23 ms | █  3
  25 ms |   1
  27 ms |   1
  29 ms | ███  7
  30 ms | ████  10
  31 ms | ████████  20
  32 ms | ███████████████████████████  63
  33 ms | ████████████████████████████████████████  95
  34 ms | ██████████████████  43
  35 ms | ███████████  25
  36 ms | ███████████  26
  37 ms | ███████  17
  38 ms | ███████  17
  39 ms | ███████  17
  40 ms | ████████  18
  41 ms | ██████  14
  42 ms | ███████  16
  43 ms | ███████  17
  44 ms | ██████  14
  45 ms | ██████  15
  46 ms | ██████████  24
  47 ms | ████  10
  48 ms | █████  13
  49 ms | ██  4
  50 ms | ██  5
  51 ms | █  3
  52 ms | █  2
  53 ms |   1
  55 ms | █  3
  56 ms |   1
  57 ms |   1
  62 ms |   1
  71 ms |   1
  73 ms | █  2
  74 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `preload_duration_ms` = `319.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `14.09`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `50.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.96`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.39`
- `seed` = `7507.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `29.17`, min `14.42`, p50 `28.05`, p95 `46.50`, p99 `68.31`, 1%low `15.23`, 0.1%low `14.42`, std `11.69`

**Frame time (ms)**  avg `37.13`, p50 `35.65`, p95 `51.49`, p99 `62.69`, p99.9 `67.47`, max `69.37`

**Client tick (ms)**  avg `0.45`, p95 `0.71`, max `7.31`

**Memory**  start `3084 MB`, end `3706 MB`, peak `3880 MB`, GC `39 events / 295 ms`

**FPS over sampling window (ASCII):**

```
 48.6 |                                                                    █           
 46.4 |                                                                    █           
 44.2 |                                                                    █           
 42.0 |                                                          █         █           
 39.7 |                                                          █      █  █           
 37.5 |                                                          █      █ ██           
 35.3 |                                                          █      █ ██     █     
 33.1 |        █        █   █        █               █           █      █ ██ █   █     
 30.9 |  ██    █  █     █  ██        █   █  █     █ ██ █       █ █ █ █ ██ ████   █  ███
 28.6 |████ ██ █  ██ ██ █  ████  ██  █ █ ████  ██ █ ████ █ ██  █████ ████ ████ █ ██████
 26.4 |███████████████████████████████████████ ██ ████████ █████████ ██████████████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   8 ms | █  1
   9 ms | ██  2
  13 ms | █  1
  14 ms | █  1
  15 ms | █  1
  16 ms | ██  2
  17 ms | █  1
  18 ms | █  1
  19 ms | █████  6
  20 ms | ████  5
  21 ms | ████████  11
  22 ms | █████  7
  23 ms | ██  3
  24 ms | █████  7
  25 ms | ██  2
  26 ms | █  1
  27 ms | ██  2
  28 ms | ███  4
  29 ms | ████  5
  30 ms | ████████████  15
  31 ms | ███████████████████████████████  40
  32 ms | ████████████████████████████████  42
  33 ms | ████████████████████████████████████████  52
  34 ms | ██████████████████████████  34
  35 ms | ██████████████████████  29
  36 ms | ███████████████  20
  37 ms | ███████████████████  25
  38 ms | █████████████████████  27
  39 ms | ██████████████  18
  40 ms | ████████████  15
  41 ms | █████████████  17
  42 ms | ███████████  14
  43 ms | █████████  12
  44 ms | ████████  11
  45 ms | ██████████████  18
  46 ms | ██████████  13
  47 ms | ████████  11
  48 ms | ███████  9
  49 ms | ████████  11
  50 ms | ████████  11
  51 ms | ████  5
  52 ms | ██  3
  53 ms | ███  4
  54 ms | █  1
  56 ms | ██  3
  57 ms | ██  3
  58 ms | ████  5
  61 ms | █  1
  63 ms | ██  2
  64 ms | █  1
  65 ms | ██  2
  69 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-35.00`
- `entity_count_sample_start` = `36.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `15.23`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.93`
- `part` = `1.00`
- `fps_0p1pct_low` = `14.42`
- `seed` = `7517.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `28.28`, min `12.10`, p50 `27.73`, p95 `46.13`, p99 `57.35`, 1%low `16.01`, 0.1%low `12.10`, std `7.51`

**Frame time (ms)**  avg `37.16`, p50 `36.06`, p95 `48.25`, p99 `54.19`, p99.9 `70.55`, max `82.63`

**Client tick (ms)**  avg `0.39`, p95 `0.56`, max `7.25`

**Memory**  start `3440 MB`, end `3484 MB`, peak `3878 MB`, GC `41 events / 273 ms`

**FPS over sampling window (ASCII):**

```
 34.9 |                                                                █               
 34.0 |                                                           █    █               
 33.1 |                                                           █    █               
 32.2 |                       █                      █            █    █               
 31.3 |      █                █               █    █ █   █        █    █           █   
 30.4 | █ █ ██                █               █    █ ██  █ █ █    █   ███          █ █ 
 29.5 | █ ████       █ █   █  █    █       █  ██   █ ██ ██ █ █    ██  ████ █       █ █ 
 28.6 |██ ████  █    █ █ ███  █   ██ █     █  ██   █ ██ ██ ███ ██ ██  ████ █       █ █ 
 27.7 |███████  █  █ █ █████  █   █████   ██  ███  █ ██ ██ ███ █████  ████ █    █  █ █ 
 26.8 |███████████ ████████████ █ █████   ██████████ ██ ████████████ █████ ████ ██ █ ██
 25.9 |████████████████████████████████ ████████████ ███████████████ ███████████████ ██
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  12 ms | █  2
  16 ms | █  1
  17 ms | █████  7
  18 ms | █  2
  19 ms | ███  4
  20 ms | ████  6
  21 ms | ████  6
  22 ms | ██  3
  23 ms | █  1
  24 ms | █  2
  25 ms | █  2
  26 ms | █  2
  27 ms | █  1
  28 ms | █  1
  29 ms | ██  3
  30 ms | ███  5
  31 ms | ████████████████  25
  32 ms | ███████████████████████████████  48
  33 ms | ████████████████████████████████████████  61
  34 ms | ████████████████████████████████  49
  35 ms | ████████████████████████  36
  36 ms | ██████████████████  28
  37 ms | ██████████████  22
  38 ms | ██████████████  21
  39 ms | ████████████  19
  40 ms | █████████████████  26
  41 ms | ██████████████  22
  42 ms | ██████████████  22
  43 ms | █████████  13
  44 ms | ███████████  17
  45 ms | ████████████  18
  46 ms | ██████████████  21
  47 ms | ████████  12
  48 ms | ████  6
  49 ms | ███  5
  50 ms | ███  5
  51 ms | ███  4
  53 ms | ██  3
  54 ms | ██  3
  56 ms | █  1
  57 ms | █  1
  60 ms | █  1
  82 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `21.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `4.00`
- `entity_count_sample_start` = `17.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `16.01`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.91`
- `part` = `1.00`
- `fps_0p1pct_low` = `12.10`
- `seed` = `7523.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `28.43`, min `19.29`, p50 `29.17`, p95 `45.45`, p99 `48.03`, 1%low `20.01`, 0.1%low `19.29`, std `5.83`

**Frame time (ms)**  avg `36.40`, p50 `34.29`, p95 `46.37`, p99 `48.96`, p99.9 `51.11`, max `51.84`

**Client tick (ms)**  avg `0.26`, p95 `0.34`, max `0.46`

**Memory**  start `3325 MB`, end `3019 MB`, peak `3873 MB`, GC `12 events / 80 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |       █                                                        █               
 32.7 |       █           █                                    █       █               
 32.0 |       █           █                                    █       █               
 31.3 |       █ █         █                                    █       █               
 30.6 |       █ █  █      █         ██     █                   █       █   █           
 29.9 |    █  █ █ ███ █   █         ██     █   █    █   █      █       █ █ █  █        
 29.2 |   ██  █ █ ███ █   █   █  █  ███    █   █    █   ██ █   █       █ █ ██ ██      █
 28.5 | █ ███ ███ ███ ██  █   █ ██ █████  ██ █ █    █   ██ █   █ █     █ █ ██ ██  █   █
 27.8 | █████ ███ ██████ ██ █ ██████████ ███████ █  ██ ███ █ █ ███     █ █ █████  █   █
 27.1 | █████ ███ ██████ ██ █ ████████████████████████████ █ █ ████ ██████ █████  █ ███
 26.4 |████████████████████████████████████████████████████████████ ██████ ████████ ███
 25.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  10
  21 ms | ███  17
  22 ms | █  6
  23 ms |   1
  24 ms |   2
  27 ms |   2
  32 ms | ████  22
  33 ms | ████████████████████████████████████████  203
  34 ms | ███████  34
  35 ms | █████  23
  36 ms | ████  22
  37 ms | ███  15
  38 ms | ██  11
  39 ms | ████  21
  40 ms | ████  21
  41 ms | ████  21
  42 ms | ███  17
  43 ms | ████  19
  44 ms | █████  25
  45 ms | ████  19
  46 ms | ███  16
  47 ms | ██  9
  48 ms | █  7
  49 ms | █  3
  50 ms |   2
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `78.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `19.29`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.48`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `20.01`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23073 ms  |  Sample ticks: 400

**FPS**  avg `32.22`, min `14.26`, p50 `28.49`, p95 `50.97`, p99 `85.68`, 1%low `14.79`, 0.1%low `14.26`, std `16.23`

**Frame time (ms)**  avg `36.24`, p50 `35.10`, p95 `57.31`, p99 `62.84`, p99.9 `69.86`, max `70.11`

**Client tick (ms)**  avg `3.02`, p95 `4.17`, max `8.65`

**Memory**  start `3336 MB`, end `3446 MB`, peak `3871 MB`, GC `11 events / 61 ms`

**FPS over sampling window (ASCII):**

```
 60.7 |                 █                                                              
 57.6 |                 █                                                              
 54.4 |                 █                                                              
 51.3 |                 █    █                                                         
 48.1 |                 █    █                                                         
 45.0 |                 █    █                                                         
 41.8 |      █          █ █  █                                                         
 38.7 |      █          █ █  █                                      █                █ 
 35.5 |    █ █  █      ████ ██           █  █         █            ██ █      █       █ 
 32.3 | █  ███ ███ ██  ████████  █ ██ ██ █  ██  ██ █  █ █ ████████ ██ ██ █ █ ██ ███ ██ 
 29.2 |███████████████████████████ █████ █████████████████████████ █████ ███ ██████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   6 ms | █  1
  10 ms | ███  3
  11 ms | █  1
  12 ms | █  1
  16 ms | ██  2
  17 ms | █████  5
  18 ms | ███████  7
  19 ms | ████████████████  15
  20 ms | █████████████████████████████  28
  21 ms | ████████████████████  19
  22 ms | █████████████████████████████  28
  23 ms | ████████████████████████████████████  34
  24 ms | ██████████████████  17
  25 ms | ████████████  11
  26 ms | ██████  6
  27 ms | ██  2
  28 ms | ███  3
  29 ms | ██████  6
  30 ms | ███████████████████████████████████  33
  31 ms | ███████  7
  32 ms | █████████  9
  33 ms | █████████████████████  20
  34 ms | ██████████████  13
  35 ms | ████████████████████████████████████████  38
  36 ms | ███████████████████  18
  37 ms | ██████████████  13
  38 ms | ███████████  10
  39 ms | ██████  6
  40 ms | ███████  7
  41 ms | ███████████  10
  42 ms | ██████  6
  43 ms | ████  4
  44 ms | ███  3
  45 ms | ████  4
  46 ms | ████████  8
  47 ms | ███████████  10
  48 ms | ███████  7
  49 ms | ███████████  10
  50 ms | ████████████████  15
  51 ms | ████████████████  15
  52 ms | █████████████  12
  53 ms | █████████████  12
  54 ms | ████████████████  15
  55 ms | █████████  9
  56 ms | ████████████████  15
  57 ms | ████████████  11
  58 ms | ███████  7
  59 ms | ███  3
  60 ms | ████  4
  62 ms | ██  2
  65 ms | █  1
  68 ms | █  1
  69 ms | ██  2
  70 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.59`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `30.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `14.79`
- `fps_0p1pct_low` = `14.26`
- `preload_chunks` = `81.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `28.37`, min `19.85`, p50 `29.25`, p95 `42.90`, p99 `48.10`, 1%low `20.41`, 0.1%low `19.85`, std `5.40`

**Frame time (ms)**  avg `36.30`, p50 `34.19`, p95 `46.65`, p99 `48.36`, p99.9 `49.69`, max `50.37`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `0.65`

**Memory**  start `3091 MB`, end `3182 MB`, peak `3875 MB`, GC `11 events / 58 ms`

**FPS over sampling window (ASCII):**

```
 33.6 |                                                                         █      
 32.9 |                                                                         █      
 32.2 |                               █                                         █      
 31.5 |    █                          █                   █                     █      
 30.8 |    █                        █ █ █   █     ██      █   █             █   █  █   
 30.1 |    █          █         █   █ █ █   █ █   ██      █   █             █   █  █   
 29.4 |    ██ █ █  █  █    █    █   █ █ █   █ █   ███     █   █             █   █ ██ █ 
 28.7 |  █ ██ █ █  █  █  ███    █   █ █ █   █ █   ███  █  █   █  █ █        ██  █ ████ 
 28.0 |  █ ████ █  ██ █  ███ █  █  ██ █ █████ █  ████ ██ ███  █ █████    ██ ███ ██████ 
 27.3 |█ █ ███████ ██ ██ █████ ██ █████ █████ █████████████████ █████  █ █████████████ 
 26.5 |███████████ ███████████████████████████████████████████████████████████████████ 
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  4
  20 ms |   2
  21 ms | ███  15
  22 ms | █  6
  23 ms |   2
  31 ms |   2
  32 ms | ██████████  47
  33 ms | ████████████████████████████████████████  181
  34 ms | █████████  41
  35 ms | ████████  34
  36 ms | ████  18
  37 ms | ████  19
  38 ms | █████  23
  39 ms | ██  10
  40 ms | █████  22
  41 ms | ██████  25
  42 ms | ███  15
  43 ms | ████  17
  44 ms | ██  10
  45 ms | █████  21
  46 ms | ███  13
  47 ms | ████  16
  48 ms | █  6
  49 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `68.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.41`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3177.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.55`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.85`
- `seed` = `9043.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `28.55`, min `19.13`, p50 `29.24`, p95 `45.10`, p99 `51.69`, 1%low `19.64`, 0.1%low `19.13`, std `5.88`

**Frame time (ms)**  avg `36.20`, p50 `34.20`, p95 `46.45`, p99 `49.61`, p99.9 `51.78`, max `52.27`

**Client tick (ms)**  avg `0.27`, p95 `0.35`, max `0.79`

**Memory**  start `3227 MB`, end `3214 MB`, peak `3872 MB`, GC `11 events / 55 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                  █                                                             
 32.3 |                  █                                                             
 31.7 |                  █             █      █                     █                  
 31.0 | █                █   ██        █      █              █      █        █         
 30.4 | █          █ ██  █ █ ██ █   ██ █      █ █     █   █  █    █ █ █      █         
 29.7 | █          █ ██  █ █ ██ █   ██ █      █ █     █   █  █    █ ████     █   █     
 29.1 | █          ████  █ █ ██ █   ██ █      █ █     ██  █  █    █ ████   █ █   █     
 28.4 | ██  █      ████ ██ █ ██ ██  ██ █      █ ██    ██  █  █    █ ████   █ ██ ██ █   
 27.8 |██████ ██ █ ████ ███████ ██  █████  █ ██ ██ ██ █████ ██  █ █ ████ █ ████ ██ █   
 27.1 |██████ █████████████████ ██ ██████  ███████ ███████████ ████ ████ █████████ █ █ 
 26.5 |███████████████████████████████████ ███████████████████ ████ ████████████████ █ 
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  17 ms |   1
  18 ms |   1
  19 ms | █  4
  20 ms | ██  10
  21 ms | ██  11
  22 ms |   1
  23 ms |   2
  26 ms |   1
  27 ms |   1
  30 ms |   1
  31 ms | █  3
  32 ms | ██████  29
  33 ms | ████████████████████████████████████████  202
  34 ms | ████████  39
  35 ms | █████  25
  36 ms | ████  21
  37 ms | ████  20
  38 ms | ████  21
  39 ms | ████  22
  40 ms | ███  15
  41 ms | ███  17
  42 ms | ████  21
  43 ms | ████  21
  44 ms | ██  9
  45 ms | ███  15
  46 ms | ████  18
  47 ms | █  7
  48 ms | █  5
  49 ms | █  3
  50 ms | █  4
  51 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `19.64`
- `fps_harmonic_avg` = `27.62`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `19.13`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `33.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `103.16`, min `8.79`, p50 `115.23`, p95 `127.61`, p99 `686.63`, 1%low `9.28`, 0.1%low `8.79`, std `92.04`

**Frame time (ms)**  avg `14.69`, p50 `8.68`, p95 `23.47`, p99 `100.42`, p99.9 `113.58`, max `113.71`

**Client tick (ms)**  avg `0.30`, p95 `0.39`, max `1.87`

**Memory**  start `3253 MB`, end `3509 MB`, peak `3882 MB`, GC `24 events / 128 ms`

**FPS over sampling window (ASCII):**

```
190.1 |   █                                                                            
173.7 |   █                                                                            
157.3 |   █                   █                                                        
140.9 |   ██ █      █         █       █          ██                         █       █  
124.5 |   ██ █ █ █ ██     █   █       █    ███   ██       █  ██             █     █ █  
108.1 |   ██ █ █ █ ██     █   █     █ █ █  ███   ██ █     █  ██             █     █ █  
 91.7 |   █████████████████████████████████████████████████████████████████ ███████████
 75.3 |   █████████████████████████████████████████████████████████████████████████████
 58.9 |   █████████████████████████████████████████████████████████████████████████████
 42.5 |  ██████████████████████████████████████████████████████████████████████████████
 26.1 |█ ██████████████████████████████████████████████████████████████████████████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | █  21
   2 ms |   3
   3 ms |   2
   4 ms |   3
   5 ms |   2
   6 ms |   1
   7 ms | █████  86
   8 ms | ████████████████████████████████████████  669
   9 ms | ██  30
  10 ms |   5
  11 ms |   3
  12 ms |   4
  13 ms |   3
  14 ms |   6
  15 ms | █  12
  16 ms | ██  40
  17 ms | ██████  108
  18 ms | ██████  102
  19 ms | ████  74
  20 ms | ███  49
  21 ms | ██  36
  22 ms | ██  28
  23 ms | █  13
  24 ms | █  9
  25 ms |   5
  26 ms |   1
  33 ms |   5
  34 ms |   1
  35 ms |   3
  39 ms |   1
  40 ms |   1
  44 ms |   1
  91 ms |   1
  97 ms |   1
  98 ms |   2
  99 ms |   5
 100 ms | █  13
 101 ms |   1
 102 ms |   1
 104 ms |   1
 106 ms |   1
 107 ms |   1
 109 ms |   1
 110 ms |   1
 112 ms |   2
 113 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `9.28`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `68.08`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `8.79`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `56.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `103.74`, min `36.01`, p50 `115.55`, p95 `126.61`, p99 `699.62`, 1%low `39.81`, 0.1%low `36.09`, std `86.84`

**Frame time (ms)**  avg `12.37`, p50 `8.65`, p95 `21.57`, p99 `23.69`, p99.9 `26.50`, max `27.77`

**Client tick (ms)**  avg `0.31`, p95 `0.40`, max `0.65`

**Memory**  start `3390 MB`, end `3329 MB`, peak `3875 MB`, GC `32 events / 185 ms`

**FPS over sampling window (ASCII):**

```
150.2 |          █                                                                     
144.1 |  █       █  █                                                                  
138.1 |  █       █  █                                                                  
132.1 |  █       █  █      █                      █                                  █ 
126.1 |  █       █  █      █ █   █                █            █  █        █         ██
120.1 |█ █       █  █     ██ █   █ █        █ █   ██ █        ██  █        █         ██
114.1 |█ █       █  █     ██ █   █ █     █  █ █   ██ █    ██  ██ ██     █  █         ██
108.1 |█ █    █  █  █     ██ █   █ █     █  █ █   ██ █    ██  ██ ██     █  █         ██
102.1 |█ █    █  █  █ █   ██ █   ████  █ █  █████ ████    ██  ██ ███    █  █         ██
 96.0 |████ █████████ █ █ ███████████  ██████████ █████ █████ ██ ███ ██ █ ██ ██    █ ██
 90.0 |███████████████████████████████ ██████████████████████ ███████████████████ █████
 84.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  25
   2 ms |   3
   4 ms |   1
   6 ms |   1
   7 ms | ████  86
   8 ms | ████████████████████████████████████████  822
   9 ms | ██  45
  10 ms |   9
  11 ms |   8
  12 ms |   1
  13 ms |   4
  14 ms |   4
  15 ms | █  15
  16 ms | ███  54
  17 ms | ███████  142
  18 ms | ███████  138
  19 ms | ████  89
  20 ms | ███  56
  21 ms | ██  50
  22 ms | ██  31
  23 ms | █  17
  24 ms |   9
  25 ms |   4
  27 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `39.81`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `80.84`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `36.09`
- `seed` = `8053.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195902 ms  |  Sample ticks: 3600

**FPS**  avg `87.28`, min `0.65`, p50 `49.87`, p95 `281.70`, p99 `412.08`, 1%low `12.07`, 0.1%low `3.91`, std `83.96`

**Frame time (ms)**  avg `22.33`, p50 `20.05`, p95 `55.45`, p99 `61.65`, p99.9 `68.92`, max `1529.12`

**Client tick (ms)**  avg `0.90`, p95 `1.27`, max `9.68`

**Memory**  start `3868 MB`, end `3358 MB`, peak `4056 MB`, GC `389 events / 2030 ms`

**FPS over sampling window (ASCII):**

```
171.3 |                                           █                    █               
158.4 |                                           █                    █               
145.6 |                                           █         █          ██  █           
132.7 |                                █         ███ █    ████████    ███████          
119.9 |                                █    ███████████████████████████████████    ██  
107.0 |                               ██   ██████████████████████████████████████████  
 94.2 |                               ████████████████████████████████████████████████ 
 81.3 |                               ████████████████████████████████████████████████ 
 68.5 |                               ████████████████████████████████████████████████ 
 55.6 |                              █████████████████████████████████████████████████ 
 42.8 |                              ██████████████████████████████████████████████████
 29.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  23
   2 ms | ██████  183
   3 ms | ███████████  328
   4 ms | ███████  189
   5 ms | ████  116
   6 ms | ██████  160
   7 ms | █████████████████  497
   8 ms | ████████████████████████████████████████  1145
   9 ms | ███████████████  443
  10 ms | ████  115
  11 ms | █  38
  12 ms | █  21
  13 ms |   11
  14 ms | █  15
  15 ms | ██  56
  16 ms | ███  81
  17 ms | ████  108
  18 ms | ███████  203
  19 ms | ███████████  306
  20 ms | █████████████  360
  21 ms | █████████████  366
  22 ms | █████████  256
  23 ms | ███████  208
  24 ms | ████████  217
  25 ms | ██████  177
  26 ms | ████  108
  27 ms | ███  77
  28 ms | ██  48
  29 ms | █  39
  30 ms | █  29
  31 ms | ███  85
  32 ms | ██████  177
  33 ms | ██████  178
  34 ms | █████  131
  35 ms | ███  83
  36 ms | ██  57
  37 ms | ██  58
  38 ms | ██  57
  39 ms | ██  51
  40 ms | ██  47
  41 ms | ██  47
  42 ms | ██  63
  43 ms | ██  60
  44 ms | ██  63
  45 ms | ██  68
  46 ms | ███  76
  47 ms | ██  68
  48 ms | ██  55
  49 ms | ██  52
  50 ms | █  34
  51 ms | ██  51
  52 ms | ██  53
  53 ms | ██  57
  54 ms | ██  71
  55 ms | ██  70
  56 ms | ███  78
  57 ms | ██  66
  58 ms | ██  48
  59 ms | █  41
  60 ms | ██  45
  61 ms | █  21
  62 ms | █  25
  63 ms |   11
  64 ms |   11
  65 ms |   7
  66 ms |   9
  67 ms |   1
  68 ms |   1
  69 ms |   1
  70 ms |   2
  71 ms |   1
  73 ms |   3
  85 ms |   1
1529 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
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
- `fps_0p1pct_low` = `3.91`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `155.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `44.78`
- `fps_1pct_low` = `12.07`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195761 ms  |  Sample ticks: 3600

**FPS**  avg `38.41`, min `11.08`, p50 `31.04`, p95 `90.01`, p99 `155.75`, 1%low `14.79`, 0.1%low `12.64`, std `27.66`

**Frame time (ms)**  avg `33.60`, p50 `32.22`, p95 `57.77`, p99 `63.85`, p99.9 `71.36`, max `90.29`

**Client tick (ms)**  avg `0.86`, p95 `1.22`, max `10.01`

**Memory**  start `3777 MB`, end `3764 MB`, peak `3884 MB`, GC `439 events / 2366 ms`

**FPS over sampling window (ASCII):**

```
 45.2 |                                       █                                        
 44.0 |                                    █  █                                        
 42.8 |                    █      █   █   ██  █ █    █           █                     
 41.6 | █     █   █       ███ █   █ ███ █ ██  █ █    █         █ █                 █   
 40.5 | █     █   █ ██   ████ █   █ █████ ██ ██ █  █ ██       ██ █                 █   
 39.3 | █ ██  █   █ ██ █ ██████ █ ██████████ ██ █  █████  █   ██ █          █      █   
 38.1 | █ ███ ███ █ ██ █ ██████ █████████████████  ██████ █ █ ██ █   █      █  █   ██  
 36.9 | █████ ███ ████ █ ████████████████████████  ██████ ███ ██ ██  █   █  █  █  ███  
 35.7 |██████████ ██████ ████████████████████████████████ ███ █████  █   █ ██  █  ████ 
 34.5 |█████████████████ ██████████████████████████████████████████  ██  █ ██  ████████
 33.3 |████████████████████████████████████████████████████████████████  ████ █████████
 32.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms | █  5
   4 ms | ███  18
   5 ms | ████  22
   6 ms | █████  28
   7 ms | ██████████  57
   8 ms | █████████  49
   9 ms | █████████  49
  10 ms | ██████  34
  11 ms | ███████  42
  12 ms | ████████  46
  13 ms | ████████  46
  14 ms | ██████  31
  15 ms | ███████  42
  16 ms | ██████████  54
  17 ms | ███████████  61
  18 ms | ████████████████  91
  19 ms | █████████████████  95
  20 ms | ███████████████████████████  154
  21 ms | ██████████████████████████████████  191
  22 ms | ██████████████████████████████████████  211
  23 ms | ████████████████████████████████████████  225
  24 ms | █████████████████████████████████  186
  25 ms | █████████████████████████████████████  207
  26 ms | ████████████████████████████  156
  27 ms | ████████████████████████  136
  28 ms | ██████████████████  102
  29 ms | ███████████████  87
  30 ms | ████████████████  89
  31 ms | ████████████████████████  134
  32 ms | █████████████████████████  143
  33 ms | ████████████████████████  134
  34 ms | ██████████████████████████  146
  35 ms | █████████████████████  118
  36 ms | ████████████████  91
  37 ms | ███████████████████  106
  38 ms | █████████████████  95
  39 ms | ████████████████  92
  40 ms | █████████████████  97
  41 ms | ██████████████  78
  42 ms | ███████████████  84
  43 ms | █████████████████  97
  44 ms | ██████████████████  100
  45 ms | ████████████████████████  135
  46 ms | █████████████████████████  141
  47 ms | ██████████████████████  124
  48 ms | ██████████████████  102
  49 ms | ██████████████  77
  50 ms | ██████████  56
  51 ms | ██████████  59
  52 ms | ██████████  55
  53 ms | ███████████  61
  54 ms | ██████████  58
  55 ms | ████████████  70
  56 ms | ██████████  54
  57 ms | ██████████████  76
  58 ms | ██████████  56
  59 ms | ████████  45
  60 ms | █████  29
  61 ms | █████  28
  62 ms | ██████  35
  63 ms | ██  14
  64 ms | ██  11
  65 ms | ██  13
  66 ms | █  6
  67 ms | █  7
  68 ms | █  5
  69 ms |   2
  70 ms |   1
  71 ms | █  3
  72 ms |   1
  75 ms |   1
  85 ms |   1
  90 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `entity_count_delta` = `13.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `72.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `12.64`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `155.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.76`
- `fps_1pct_low` = `14.79`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `85.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194194 ms  |  Sample ticks: 3600

**FPS**  avg `54.04`, min `7.99`, p50 `37.30`, p95 `133.75`, p99 `169.42`, 1%low `14.51`, 0.1%low `11.22`, std `39.05`

**Frame time (ms)**  avg `28.19`, p50 `26.81`, p95 `56.42`, p99 `63.70`, p99.9 `76.78`, max `125.12`

**Client tick (ms)**  avg `0.92`, p95 `1.33`, max `9.13`

**Memory**  start `3249 MB`, end `3453 MB`, peak `3883 MB`, GC `567 events / 2946 ms`

**FPS over sampling window (ASCII):**

```
 85.4 |                                                    █                           
 80.2 |                                            ██  █   █                           
 75.0 |                  ███ █  ███ █████  ██████████████████ █                        
 69.8 |                  ██████████████████████████████████████                        
 64.6 |                  ██████████████████████████████████████                        
 59.4 |                  ██████████████████████████████████████                        
 54.2 |                  ██████████████████████████████████████                        
 49.0 |                  ███████████████████████████████████████                       
 43.8 |  █  ██ █ █ █    ████████████████████████████████████████                       
 38.6 |█████████████████████████████████████████████████████████                       
 33.4 |████████████████████████████████████████████████████████████████████            
 28.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ██  12
   5 ms | ██████████  63
   6 ms | ████████████████████████  153
   7 ms | ████████████████████████████████████  232
   8 ms | ████████████████████████████████████████  258
   9 ms | ███████████████████████████████████████  250
  10 ms | █████████████████████████████████████  236
  11 ms | ███████████████████████████████████  228
  12 ms | ██████████████████████████████████████  245
  13 ms | ██████████████████████████  170
  14 ms | ███████████████  99
  15 ms | ██████████  64
  16 ms | █████████  55
  17 ms | ████████  54
  18 ms | █████████  59
  19 ms | ███████████████  98
  20 ms | ████████████  78
  21 ms | ████████████████  102
  22 ms | ████████████████████  131
  23 ms | ██████████████████  118
  24 ms | ███████████████████████████  171
  25 ms | █████████████████████████████  185
  26 ms | ██████████████████████████  166
  27 ms | ██████████████████████  140
  28 ms | ████████████████  105
  29 ms | ████████████████  104
  30 ms | ███████████████████  121
  31 ms | ████████████████████  131
  32 ms | ███████████████████████████████  203
  33 ms | ████████████████████████████████  207
  34 ms | ████████████████████████  158
  35 ms | █████████████  84
  36 ms | ███████  42
  37 ms | ████████  50
  38 ms | ██████████  66
  39 ms | ████████████  77
  40 ms | ███████████████  96
  41 ms | ███████████████  97
  42 ms | ███████████████  99
  43 ms | ████████████████  105
  44 ms | █████████████████  111
  45 ms | ████████████████████  130
  46 ms | █████████████████  108
  47 ms | ████████████████  106
  48 ms | ████████████  79
  49 ms | ███████████  68
  50 ms | ██████████  66
  51 ms | █████████  60
  52 ms | █████████  58
  53 ms | ███████  46
  54 ms | ████████  52
  55 ms | ████████  53
  56 ms | ███████  42
  57 ms | ████████  52
  58 ms | ██████████  63
  59 ms | ████  28
  60 ms | █████  35
  61 ms | ███  22
  62 ms | ███  18
  63 ms | ██  16
  64 ms | ██  11
  65 ms | ██  12
  66 ms | ██  15
  67 ms | █  5
  68 ms | █  4
  69 ms |   1
  70 ms |   1
  71 ms |   3
  72 ms |   1
  76 ms |   1
  77 ms |   2
  79 ms |   1
  82 ms |   1
  83 ms |   1
  86 ms |   1
 125 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `entity_count_delta` = `16.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `73.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `11.22`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `155.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `35.48`
- `fps_1pct_low` = `14.51`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195051 ms  |  Sample ticks: 3600

**FPS**  avg `77.79`, min `13.04`, p50 `45.73`, p95 `214.04`, p99 `279.99`, 1%low `17.32`, 0.1%low `14.07`, std `64.43`

**Frame time (ms)**  avg `22.80`, p50 `21.87`, p95 `50.49`, p99 `54.35`, p99.9 `62.56`, max `76.69`

**Client tick (ms)**  avg `0.74`, p95 `0.98`, max `3.51`

**Memory**  start `3675 MB`, end `3735 MB`, peak `3884 MB`, GC `90 events / 316 ms`

**FPS over sampling window (ASCII):**

```
105.0 |█                                                                               
 98.2 |█      █                                                            █ ██        
 91.3 |█     ██                                            ██          ██ ███████████  
 84.4 |██    ███ ██    █                    ████ ████    █████         ████████████████
 77.5 |███████████████████ ████     █  ████████████████████████        ████████████████
 70.6 |██████████████████████████  ████████████████████████████        ████████████████
 63.7 |████████████████████████████████████████████████████████        ████████████████
 56.8 |████████████████████████████████████████████████████████        ████████████████
 49.9 |█████████████████████████████████████████████████████████       ████████████████
 43.0 |█████████████████████████████████████████████████████████       ████████████████
 36.1 |█████████████████████████████████████████████████████████       ████████████████
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  17
   3 ms | ███████████████  178
   4 ms | █████████████████████████  305
   5 ms | ████████████████████████████  337
   6 ms | ████████████████████████████████████████  481
   7 ms | ███████████████████████████████  368
   8 ms | █████████████████████████  295
   9 ms | ██████████████████████  264
  10 ms | █████████████████  206
  11 ms | ███████████████████  227
  12 ms | ███████████████████████  281
  13 ms | ████████████████████  235
  14 ms | █████████████  158
  15 ms | ████████████  143
  16 ms | ████████  101
  17 ms | ████████  94
  18 ms | ███  40
  19 ms | ████  46
  20 ms | █████  64
  21 ms | ██████████  124
  22 ms | █████████████████  210
  23 ms | ███████████████████████  273
  24 ms | ████████████████████████  293
  25 ms | ████████████████████  236
  26 ms | ███████████████  180
  27 ms | ███████████  127
  28 ms | ███████  88
  29 ms | ███████  79
  30 ms | ████████  98
  31 ms | ███████████  136
  32 ms | █████████████  155
  33 ms | ████████████  144
  34 ms | ████████████  144
  35 ms | ██████  78
  36 ms | ██████  78
  37 ms | ████████  98
  38 ms | ██████  74
  39 ms | ██████  68
  40 ms | ████  54
  41 ms | ████  53
  42 ms | ██████  69
  43 ms | ██████  74
  44 ms | ████████  98
  45 ms | ██████████  126
  46 ms | ███████████  129
  47 ms | ██████████  119
  48 ms | ████████  101
  49 ms | █████████  113
  50 ms | ████████  100
  51 ms | █████████  110
  52 ms | ██████  67
  53 ms | ██████  67
  54 ms | ███  35
  55 ms | ██  20
  56 ms | █  14
  57 ms |   3
  58 ms | █  8
  59 ms |   3
  61 ms |   1
  62 ms |   1
  63 ms |   2
  67 ms |   1
  72 ms |   1
  74 ms |   2
  76 ms |   2
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `entity_count_delta` = `14.00`
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
- `fps_0p1pct_low` = `14.07`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `155.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `43.87`
- `fps_1pct_low` = `17.32`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `86.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`

