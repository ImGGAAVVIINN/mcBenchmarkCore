# FPS Test session — 2026-09-02T23:38:05.849869064+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 144.6 | 39.9 | 27.7 | 21.77 | 0.59 | 16 | 339 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 162.3 | 37.3 | 23.4 | 22.09 | 0.63 | 5 | 1000 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 117.6 | 41.4 | 25.9 | 22.04 | 0.65 | 5 | 1180 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 99.6 | 21.7 | 21.1 | 45.43 | 0.68 | 5 | 896 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.9 | 20.1 | 17.3 | 47.55 | 0.64 | 5 | 1098 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.5 | 19.9 | 17.0 | 47.19 | 0.50 | 7 | 1288 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 29.2 | 20.7 | 20.4 | 47.31 | 0.64 | 5 | 1160 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 28.9 | 20.4 | 20.0 | 48.09 | 1.08 | 5 | 860 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 29.4 | 19.4 | 16.9 | 49.34 | 2.99 | 6 | 792 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 29.9 | 19.1 | 18.5 | 50.72 | 4.02 | 9 | 772 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 29.1 | 20.2 | 18.4 | 47.31 | 0.90 | 5 | 1177 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 29.2 | 18.5 | 14.7 | 47.81 | 0.50 | 6 | 176 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 29.7 | 18.8 | 17.7 | 50.92 | 3.27 | 8 | 788 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 29.6 | 18.5 | 15.0 | 49.27 | 2.84 | 6 | 0 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 37.3 | 12.7 | 11.5 | 70.32 | 15.42 | 19 | 240 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 37.4 | 12.6 | 12.0 | 74.67 | 16.79 | 19 | 758 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 29.2 | 18.3 | 15.8 | 47.73 | 1.85 | 6 | 247 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 29.9 | 17.3 | 17.1 | 57.49 | 1.84 | 6 | 776 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.9 | 16.2 | 15.1 | 57.08 | 0.63 | 5 | 228 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 29.4 | 20.0 | 16.0 | 47.15 | 0.27 | 4 | 1249 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 168.5 | 9.9 | 9.2 | 88.06 | 0.25 | 5 | 1256 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 164.2 | 36.2 | 24.1 | 21.72 | 0.29 | 5 | 200 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 163.4 | 40.6 | 25.4 | 21.30 | 0.28 | 5 | 1236 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 31.2 | 19.9 | 19.5 | 48.81 | 0.36 | 25 | 60 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 31.6 | 18.8 | 18.0 | 50.60 | 0.35 | 25 | 126 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 31.3 | 19.4 | 19.0 | 49.88 | 0.34 | 22 | 752 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 32.4 | 17.0 | 13.2 | 50.64 | 0.36 | 23 | 872 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 232.4 | 33.7 | 18.6 | 23.25 | 0.32 | 25 | 154 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 147.1 | 38.0 | 33.5 | 23.89 | 0.32 | 24 | 1284 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 227.7 | 38.3 | 29.5 | 23.27 | 0.36 | 25 | 84 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 113.3 | 38.2 | 32.8 | 23.82 | 0.32 | 25 | 0 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 114.1 | 40.1 | 34.2 | 23.32 | 0.41 | 24 | 281 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 108.9 | 21.2 | 19.3 | 43.01 | 0.31 | 22 | 78 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 28.3 | 16.4 | 15.3 | 56.13 | 0.33 | 22 | 300 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 28.3 | 19.0 | 17.6 | 50.16 | 0.32 | 21 | 848 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 28.2 | 18.3 | 16.3 | 47.01 | 0.26 | 5 | 308 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 30.5 | 15.7 | 12.4 | 58.40 | 3.00 | 6 | 49 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 29.1 | 18.2 | 11.8 | 46.71 | 0.27 | 4 | 1146 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 28.9 | 19.2 | 16.0 | 47.68 | 0.27 | 5 | 154 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 28.7 | 20.3 | 19.1 | 46.96 | 0.25 | 4 | 1020 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 29.6 | 18.8 | 14.9 | 48.16 | 0.28 | 5 | 328 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 30.1 | 17.1 | 16.1 | 57.10 | 0.77 | 16 | 1177 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 87.3 | 8.9 | 8.1 | 106.42 | 0.72 | 15 | 1366 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 30.4 | 17.0 | 16.0 | 57.43 | 0.74 | 15 | 1021 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 31.3 | 16.9 | 15.7 | 57.67 | 0.76 | 15 | 1292 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Pigs ×250 ring](#pigs-250-ring)
- [Villagers ×100 ring](#villagers-100-ring)
- [Chickens ×300 ring](#chickens-300-ring)
- [Item entities ×500](#item-entities-500)
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

Category: **Particles**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `144.59`, min `27.51`, p50 `118.41`, p95 `555.64`, p99 `731.62`, 1%low `39.92`, 0.1%low `27.69`, std `139.07`

**Frame time (ms)**  avg `9.92`, p50 `8.45`, p95 `19.96`, p99 `21.77`, p99.9 `33.07`, max `36.35`

**Client tick (ms)**  avg `0.59`, p95 `0.99`, max `1.25`

**Memory**  start `696 MB`, end `768 MB`, peak `1036 MB`, GC `16 events / 84 ms`

**FPS over sampling window (ASCII):**

```
224.6 |                                                                █        ██    █
213.7 |                                                               ██ █  ██ ███ █ ██
202.7 |                                                    █    █ ██  ██ █  ██████ █ ██
191.8 |                                                    ██ █ ████  █████ ████████ ██
180.9 |                                                    ████████████████ ███████████
170.0 |                                                   █████████████████████████████
159.1 |                                                   █████████████████████████████
148.2 |                                                  ██████████████████████████████
137.3 |                                                  ██████████████████████████████
126.4 |   █ ███                   █           █  █       ██████████████████████████████
115.5 | █ █████     █    ███ ██  ██ █ █  █   █████  ██   ██████████████████████████████
104.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █████  124
   2 ms | █  27
   3 ms | █  14
   4 ms |   9
   5 ms | █  15
   6 ms | ██  37
   7 ms | ████████████  267
   8 ms | ████████████████████████████████████████  911
   9 ms | ██████  140
  10 ms | █  23
  11 ms |   9
  12 ms |   3
  13 ms |   3
  14 ms | █  22
  15 ms | ███  64
  16 ms | ████  88
  17 ms | ███  69
  18 ms | ██  55
  19 ms | ██  36
  20 ms | ██  55
  21 ms | █  27
  22 ms |   7
  23 ms |   5
  24 ms |   1
  25 ms |   1
  29 ms |   1
  33 ms |   1
  35 ms |   1
  36 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `portal` | 160 | 252 | 114.8 | 22.74 |
| `ALL_TOGETHER` | 1680 | 252 | 110.3 | 24.17 |
| `sculk_charge_pop` | 240 | 252 | 112.9 | 22.30 |
| `smoke` | 160 | 252 | 111.7 | 21.24 |
| `flame` | 160 | 252 | 111.2 | 21.12 |
| `dripping_water` | 240 | 252 | 189.5 | 21.51 |
| `dragon_breath` | 160 | 252 | 198.8 | 21.32 |
| `end_rod` | 240 | 252 | 207.5 | 20.57 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `39.92`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `33.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `100.83`
- `fps_0p1pct_low` = `27.69`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `162.33`, min `22.15`, p50 `118.92`, p95 `454.37`, p99 `608.90`, 1%low `37.26`, 0.1%low `23.35`, std `132.53`

**Frame time (ms)**  avg `9.51`, p50 `8.41`, p95 `20.39`, p99 `22.09`, p99.9 `39.48`, max `45.15`

**Client tick (ms)**  avg `0.63`, p95 `0.93`, max `1.34`

**Memory**  start `1597 MB`, end `1004 MB`, peak `2597 MB`, GC `5 events / 63 ms`

**FPS over sampling window (ASCII):**

```
210.1 |                                                          █                     
203.1 |                                                          █     █    █         █
196.2 |                                                          █     █   ██         █
189.3 |                                                          █     █   ███  █     █
182.4 |                                                          █  █  ██  ███  █     █
175.4 |                                             █            █ ██  ███ ██████████ █
168.5 |█                   █       █  █       █    ██  █         █ ██ ███████████████ █
161.6 |██        █     █   █ █ █ █ █  █    █  █  █ ██  █  ███ █  ████ █████████████████
154.7 |███   █████     █  ██ █ ███ █████  ██ ██ ██ ████████████ █████ █████████████████
147.7 |████  █████ ██ ████████ █████████████ ██████████████████████████████████████████
140.8 |████ █████████ █████████████████████████████████████████████████████████████████
133.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███  69
   2 ms | █████████████  257
   3 ms | ███  67
   4 ms | █  16
   5 ms |   6
   6 ms | █  26
   7 ms | ████████████  229
   8 ms | ████████████████████████████████████████  789
   9 ms | ██████████  188
  10 ms | █  16
  11 ms |   5
  12 ms |   1
  13 ms |   4
  14 ms | █  11
  15 ms | █  20
  16 ms | ██  47
  17 ms | ██  47
  18 ms | ████  76
  19 ms | ████  87
  20 ms | ████  80
  21 ms | ██  40
  22 ms | █  10
  23 ms |   3
  24 ms |   2
  25 ms |   1
  30 ms |   2
  31 ms |   1
  40 ms |   2
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `37.26`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `23.35`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `105.19`
- `preload_duration_ms` = `79.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `117.60`, min `24.40`, p50 `119.14`, p95 `169.98`, p99 `493.99`, 1%low `41.36`, 0.1%low `25.93`, std `68.92`

**Frame time (ms)**  avg `10.46`, p50 `8.39`, p95 `20.75`, p99 `22.04`, p99.9 `24.39`, max `40.99`

**Client tick (ms)**  avg `0.65`, p95 `0.87`, max `15.88`

**Memory**  start `1264 MB`, end `1262 MB`, peak `2444 MB`, GC `5 events / 56 ms`

**FPS over sampling window (ASCII):**

```
164.1 |                                                                      █         
158.6 |                                                    █                 █         
153.1 |                                                    █                 █         
147.5 |                                                    █                 █         
142.0 |                                                    █            █    █         
136.4 |                                              █     █            █    █         
130.9 |                           █             █    █    ██ █          █    █         
125.3 | █ █      █                █    █        █  █ ████ ██ █  ██     ██   ███ █ █    
119.8 | █ █     ██     █    █     █   ██   ██   █  █ ████ ██ ██ ██  █  ███ ████ ████  █
114.3 | █ ██ █  ██ ██  █  █ █ █ ███   ██   ██  ██  █ ████ ██ █████  █  ███ ████ ████  █
108.7 |███████████ █████████████████████  ████ █████████████ ██████ ███████████ ███████
103.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  18
   2 ms | ██  31
   3 ms | █  11
   4 ms | █  13
   5 ms | █  26
   6 ms | ██  46
   7 ms | ████████████████  332
   8 ms | ████████████████████████████████████████  809
   9 ms | █████████  182
  10 ms |   9
  11 ms |   1
  12 ms |   1
  15 ms | █  29
  16 ms | ███  66
  17 ms | ███  52
  18 ms | ███  64
  19 ms | ████  71
  20 ms | ████  82
  21 ms | ██  48
  22 ms | █  17
  23 ms |   2
  36 ms |   1
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `41.36`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `25.93`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `95.56`
- `preload_duration_ms` = `47.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23118 ms  |  Sample ticks: 400

**FPS**  avg `99.58`, min `21.12`, p50 `112.45`, p95 `179.45`, p99 `349.62`, 1%low `21.73`, 0.1%low `21.12`, std `60.98`

**Frame time (ms)**  avg `15.39`, p50 `8.89`, p95 `40.11`, p99 `45.43`, p99.9 `46.95`, max `47.34`

**Client tick (ms)**  avg `0.68`, p95 `0.88`, max `1.05`

**Memory**  start `1375 MB`, end `2116 MB`, peak `2271 MB`, GC `5 events / 69 ms`

**FPS over sampling window (ASCII):**

```
138.5 |         █                                           █       █                  
128.4 |       █ █   █ █  █     █   █  █ █    █      █       ██      █ █ █              
118.2 |  ███  █ █ █ █ ██ █   █ █ █ █  ███    ██   █ ██████████ ████ █ █ █              
108.1 |████████████████████████████████████ ████ ████████████████████████              
 98.0 |██████████████████████████████████████████████████████████████████              
 87.8 |██████████████████████████████████████████████████████████████████              
 77.7 |██████████████████████████████████████████████████████████████████              
 67.6 |██████████████████████████████████████████████████████████████████              
 57.5 |██████████████████████████████████████████████████████████████████              
 47.3 |██████████████████████████████████████████████████████████████████              
 37.2 |███████████████████████████████████████████████████████████████████             
 27.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  17
   3 ms | ███  21
   4 ms | █  7
   5 ms | ████  29
   6 ms | ████████  69
   7 ms | ████████████████████████  199
   8 ms | ████████████████████████████████████████  327
   9 ms | ███████████████  124
  10 ms | ██  14
  11 ms |   2
  12 ms |   1
  13 ms |   1
  15 ms |   2
  16 ms | ██  13
  17 ms | ███  23
  18 ms | █████  37
  19 ms | ██████  53
  20 ms | ████████  65
  21 ms | █████  41
  22 ms | ██  18
  23 ms | █  7
  24 ms |   2
  25 ms |   2
  31 ms |   2
  32 ms | █████  43
  33 ms | ██████  52
  34 ms | ███  27
  35 ms | █  7
  36 ms | █  5
  37 ms | █  6
  38 ms | █  7
  39 ms | █  9
  40 ms | █  10
  41 ms | ██  13
  42 ms | █  7
  43 ms | █  10
  44 ms | █  8
  45 ms | ██  15
  46 ms |   3
  47 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.73`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.12`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `64.98`
- `preload_duration_ms` = `41.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `28.88`, min `17.32`, p50 `29.33`, p95 `46.46`, p99 `50.15`, 1%low `20.13`, 0.1%low `17.32`, std `6.71`

**Frame time (ms)**  avg `36.13`, p50 `34.10`, p95 `46.04`, p99 `47.55`, p99.9 `52.81`, max `57.74`

**Client tick (ms)**  avg `0.64`, p95 `0.97`, max `1.50`

**Memory**  start `1149 MB`, end `1134 MB`, peak `2247 MB`, GC `5 events / 58 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |            █                                                                   
 32.4 |            █                             █            █            █           
 31.7 |  █  █      █                █            █         █  █            █           
 31.0 |  █  ██     █     █ █        █      █  █  █         █  █            █      █    
 30.3 |  █  ██     █ █   ███        █  █   ██ █  █         █  ██           █ █    █ █  
 29.5 |█ █  ██     ███   ███  █  ██ █  █   ██ █  ██ █      █  ██ █   █ █ █ █ ██   █ █  
 28.8 |████ ██     ███   ████ █  █████ █   ██ █  ████      █  ██ █  ████ █ █ ██   █ █  
 28.1 |████ ██ █   █████ ███████████████   ██ ██ █████ ██  ██ ██████████████ ██  ██████
 27.3 |███████ █   █████ ███████████████   ██ ██ █████ ██ ███ ██████████████████ ██████
 26.6 |██████████ ██████ ████████████████████ ████████ ████████████████████████████████
 25.9 |███████████████████████████████████████████████ ████████████████████████████████
 25.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  2
  18 ms |   1
  19 ms | █  4
  20 ms | ████  13
  21 ms | ████  12
  22 ms | █████  15
  23 ms | █  4
  31 ms |   1
  32 ms | █████████████████████████  81
  33 ms | ████████████████████████████████████████  130
  34 ms | ███████████████  50
  35 ms | ███  10
  36 ms | ██  7
  37 ms | ██████  18
  38 ms | ███████  24
  39 ms | █████  17
  40 ms | █████  17
  41 ms | ████  13
  42 ms | █████  17
  43 ms | ███████  23
  44 ms | ████████████  38
  45 ms | █████████  28
  46 ms | ██████  18
  47 ms | ██  8
  48 ms | █  2
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.13`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.32`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.68`
- `preload_duration_ms` = `64.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `29.47`, min `17.04`, p50 `29.48`, p95 `46.63`, p99 `50.86`, 1%low `19.93`, 0.1%low `17.04`, std `10.52`

**Frame time (ms)**  avg `35.69`, p50 `33.92`, p95 `46.12`, p99 `47.19`, p99.9 `53.83`, max `58.68`

**Client tick (ms)**  avg `0.50`, p95 `0.63`, max `0.88`

**Memory**  start `934 MB`, end `1266 MB`, peak `2222 MB`, GC `7 events / 54 ms`

**FPS over sampling window (ASCII):**

```
 56.9 |█                                                                               
 54.1 |█                                                                               
 51.3 |█                                                                               
 48.4 |█                                                                               
 45.6 |█                                                                               
 42.8 |█                                                                               
 39.9 |█                                                                               
 37.1 |█                                                                               
 34.2 |█                                                                               
 31.4 |█  █ ██  ███ █  █  █  █        ██   ███  ████   ████ ██    █ █      █  █   █ █ █
 28.6 |███████ ████ ████  ████ ██ ███ ███████████████████████████ █████████████ ███ █ █
 25.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   1
  19 ms | ██  6
  20 ms | ████  16
  21 ms | ████  16
  22 ms | ██  9
  23 ms |   1
  27 ms |   1
  29 ms | █  2
  30 ms | █  2
  31 ms | ███  11
  32 ms | █████████████████████  77
  33 ms | ████████████████████████████████████████  145
  34 ms | █████████████  48
  35 ms | ███████  24
  36 ms | ██  8
  37 ms | ███  11
  38 ms | ███  12
  39 ms | ████  14
  40 ms | ██████  21
  41 ms | ██████  20
  42 ms | ██  9
  43 ms | ██████  21
  44 ms | ███████  24
  45 ms | ████████  28
  46 ms | ███████  24
  47 ms | █  5
  48 ms | █  2
  50 ms |   1
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.93`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.04`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.02`
- `preload_duration_ms` = `21.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `29.23`, min `20.41`, p50 `29.51`, p95 `44.82`, p99 `50.01`, 1%low `20.73`, 0.1%low `20.41`, std `5.66`

**Frame time (ms)**  avg `35.27`, p50 `33.89`, p95 `45.36`, p99 `47.31`, p99.9 `48.77`, max `48.99`

**Client tick (ms)**  avg `0.64`, p95 `0.94`, max `1.22`

**Memory**  start `1003 MB`, end `1290 MB`, peak `2163 MB`, GC `5 events / 58 ms`

**FPS over sampling window (ASCII):**

```
 32.3 |      █                                          █                              
 31.8 | █  █ █           █                              █                              
 31.3 | █  █ █    █      █        █ █                   █     █     █      █  █        
 30.7 |██  █ █ █ ██  █   █        █ █         █         █     █ ██  █    █ █  █        
 30.2 |██  █ █ █ ██  █ █ █      █ █ █ █    ████ █       █   █ █ ██  █   ██ █  █        
 29.7 |██  █ █ █ ██  █ █ █      █ █ ████   ████ █   █   █   █ █ ██  █   ██ █  █        
 29.2 |███ █ ███ ██  ███ █  █   █ █ ████  █████ █   █ █ █   █ █ ██  █   ██ █  █        
 28.6 |███ █ ███ ██ ████ ██████████ █████ █████ █   █ █ ███████ ██ ███  ██ █  █ █   █  
 28.1 |███ █ ███ ██ ████ ████████████████ ███████ █ █ █ ███████ ██ ███  ██ █  █ ██████ 
 27.6 |█████ ███ ████████████████████████ █████████ █████████████████████████ █ ███████
 27.0 |█████████ ████████████████████████ █████████ ███████████████████████████████████
 26.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | █  4
  20 ms | ██  7
  21 ms | ███  12
  22 ms | ███  9
  23 ms | █  2
  26 ms |   1
  29 ms | █  2
  30 ms | █  2
  31 ms | ████  14
  32 ms | █████████████████████████████  101
  33 ms | ████████████████████████████████████████  139
  34 ms | ██████████████████████████  90
  35 ms | ██████  21
  36 ms | ██  8
  37 ms | ███  9
  38 ms | ██  8
  39 ms | ████  13
  40 ms | ███  10
  41 ms | ████  15
  42 ms | ████  13
  43 ms | █████  18
  44 ms | ████████  27
  45 ms | ██████  22
  46 ms | ███  10
  47 ms | █  4
  48 ms | █  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.73`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.41`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.35`
- `preload_duration_ms` = `50.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `28.91`, min `20.03`, p50 `28.91`, p95 `46.17`, p99 `49.72`, 1%low `20.43`, 0.1%low `20.03`, std `6.81`

**Frame time (ms)**  avg `36.16`, p50 `34.59`, p95 `45.79`, p99 `48.09`, p99.9 `49.92`, max `49.94`

**Client tick (ms)**  avg `1.08`, p95 `1.29`, max `3.76`

**Memory**  start `1398 MB`, end `1537 MB`, peak `2258 MB`, GC `5 events / 64 ms`

**FPS over sampling window (ASCII):**

```
 33.8 |                    █                                                           
 32.8 |                    █                          █               █                
 31.7 |                    █ █ █    █   █       █     █               █          █     
 30.6 | █ ██ █        █    █ █ █    ██  █  █    █     █   █       █   █        █ █  ███
 29.6 | █ ██ █  █  █  █ █  █ █ █  ████  █  █    █ █ █ █   █       █   ██ ██  █ █ █  ███
 28.5 | ██████  ████ █████ █ ███ █████  ████   ██████ █████     █ ██ ███ ██  █ █ ██████
 27.4 |████████ ██████████ ███████████  █████████████ █████ ██ █████████ ███████ ██████
 26.4 |███████████████████ ████████████ █████████████ █████████████████████████████████
 25.3 |████████████████████████████████ █████████████ █████████████████████████████████
 24.2 |████████████████████████████████ █████████████ █████████████████████████████████
 23.2 |████████████████████████████████ ███████████████████████████████████████████████
 22.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | █  3
  20 ms | ██████  13
  21 ms | ████████  17
  22 ms | █████  11
  23 ms | ███  7
  24 ms | █  2
  25 ms | █  2
  26 ms |   1
  29 ms | █  2
  30 ms | ██  4
  31 ms | ██████████  21
  32 ms | ████████████████████████████  62
  33 ms | ████████████████████████████████████████  88
  34 ms | ██████████████████████████████  67
  35 ms | ██████  13
  36 ms | ██████  14
  37 ms | █████  12
  38 ms | ████  8
  39 ms | ███████  15
  40 ms | ██████████  21
  41 ms | ██████████  22
  42 ms | █████████  19
  43 ms | ███████████████  34
  44 ms | ███████████████  33
  45 ms | ████████████████  36
  46 ms | █████  12
  47 ms | ██  5
  48 ms | ██  5
  49 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.43`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.03`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.65`
- `preload_duration_ms` = `68.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `29.37`, min `16.91`, p50 `27.47`, p95 `48.53`, p99 `55.08`, 1%low `19.44`, 0.1%low `16.91`, std `8.08`

**Frame time (ms)**  avg `36.09`, p50 `36.41`, p95 `46.91`, p99 `49.34`, p99.9 `54.79`, max `59.15`

**Client tick (ms)**  avg `2.99`, p95 `3.62`, max `17.91`

**Memory**  start `1517 MB`, end `806 MB`, peak `2309 MB`, GC `6 events / 76 ms`

**FPS over sampling window (ASCII):**

```
 34.1 |           █                                                         █   █      
 33.4 |           █                                                         █ █ █      
 32.7 |        █  █                        █                      █         █ █ █      
 32.0 |        █  █       █          █     █                   █  █         █ █ █      
 31.3 |      █ █  █     █ █   █    █ █     █ █          █      █  █   █     █ █ █    █ 
 30.7 |    █ █ █  █     █ ███ █    █ █     █ █          █      █  █   █     █ █ ██   ██
 30.0 |█   █ █ █  █     █ ███ ██   █ █     █ █  █ ██    ██    ██  █  ██  █  █ █ ██   ██
 29.3 |█  ██ ███  █   █ █████ ███  █ █     █ █  █████   ███   ██  █  ██ ██  █ ████   ██
 28.6 |█  ██ ███ ██ █ █ █████ ███  █ █   █ █ █  █████ █ ████ ███  █████████ █ ████   ██
 27.9 |█████ ██████ ██████████████████ █ ███ █  ████████████████ █████████████████  ███
 27.2 |████████████ ████████████████████████████████████████████ ██████████████████████
 26.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | ███  4
  18 ms | ███████  10
  19 ms | ████  6
  20 ms | ███████████  15
  21 ms | █████  7
  22 ms | █████████  12
  23 ms | ████  5
  24 ms | ████  5
  25 ms | █  2
  26 ms | █  1
  27 ms | █  2
  28 ms | █  2
  29 ms | ██████████  14
  30 ms | ███████████████████████████████████████  55
  31 ms | ████████  11
  32 ms | ███████████████  21
  33 ms | ███████████████████████████████  44
  34 ms | ████████  11
  35 ms | ██████████████  20
  36 ms | ████████████████████████████████████████  56
  37 ms | ████████████████████████  33
  38 ms | ███████  10
  39 ms | ███████████  16
  40 ms | ███████████  15
  41 ms | ████████████████  23
  42 ms | ████████████████████████  34
  43 ms | ██████████████  20
  44 ms | ████████████████████  28
  45 ms | ███████████████████  27
  46 ms | ███████████  16
  47 ms | █████████  12
  48 ms | █████  7
  49 ms | █████  7
  51 ms | █  1
  59 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.44`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `16.91`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.71`
- `preload_duration_ms` = `88.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `18.49`, p50 `26.18`, p95 `50.58`, p99 `62.55`, 1%low `19.07`, 0.1%low `18.49`, std `10.30`

**Frame time (ms)**  avg `36.28`, p50 `38.20`, p95 `48.63`, p99 `50.72`, p99.9 `53.91`, max `54.08`

**Client tick (ms)**  avg `4.02`, p95 `5.59`, max `10.16`

**Memory**  start `1489 MB`, end `1386 MB`, peak `2261 MB`, GC `9 events / 75 ms`

**FPS over sampling window (ASCII):**

```
 41.5 |                          █                                                     
 40.0 |                          █                                                     
 38.4 |                          █                                                     
 36.8 |                          █                                 █   █               
 35.3 |     █                    █                                 █   █               
 33.7 |     █        █           █  █                      █    █  █  ██            █  
 32.1 | █   ██       █ █    █    █  █       █          █   █    █  █  ██  █ █  █    █ █
 30.5 | ███ ██  █   ██ ██   █ █  █  █ █ █   ██ █       █   █  █ █  █  ███ █ █ ████ ████
 29.0 | ██████  ██████ ██ █ ███ ██  ███ █ ████ ██ █   ██   █ ██ █ ███████ ████████ ████
 27.4 | ███████████████████ ██████  ██████████ ████████████████████████████████████████
 25.8 |████████████████████████████ ███████████████████████████████████████████████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms | █  1
  11 ms | █  1
  13 ms | █  1
  14 ms | █  1
  15 ms | ██  2
  16 ms | ██████  5
  17 ms | ████████████  10
  18 ms | ██████  5
  19 ms | ██████  5
  20 ms | ████████  7
  21 ms | ███████████████  12
  22 ms | ████████████████  13
  23 ms | ███████████  9
  24 ms | ████████  7
  25 ms | ██████  5
  26 ms | █████  4
  27 ms | ██████████  8
  28 ms | ██████████████████████  18
  29 ms | ██████████████████████  18
  30 ms | ██████████████████  15
  31 ms | ████████████  10
  32 ms | ██████████████████████  18
  33 ms | ███████████████████████████████████████  32
  34 ms | ███████████████████  16
  35 ms | ███████████████████  16
  36 ms | █████████████████  14
  37 ms | ███████████████████████  19
  38 ms | ████████████████████████████████  26
  39 ms | ████████████████████████████  23
  40 ms | ████████████████████████████████████████  33
  41 ms | █████████████████████████████████  27
  42 ms | ███████████████████████████████████  29
  43 ms | ██████████████████████████████████████  31
  44 ms | █████████████████████████████  24
  45 ms | ███████████████████████████  22
  46 ms | █████████████████  14
  47 ms | ██████████████████████  18
  48 ms | █████████████  11
  49 ms | ███████  6
  50 ms | ████████████  10
  51 ms | █  1
  52 ms | ██  2
  53 ms | █  1
  54 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `18.49`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `33.00`
- `fps_harmonic_avg` = `27.56`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `19.07`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `29.08`, min `18.38`, p50 `29.10`, p95 `46.72`, p99 `51.76`, 1%low `20.24`, 0.1%low `18.38`, std `6.62`

**Frame time (ms)**  avg `35.80`, p50 `34.37`, p95 `45.53`, p99 `47.31`, p99.9 `51.91`, max `54.40`

**Client tick (ms)**  avg `0.90`, p95 `1.09`, max `1.29`

**Memory**  start `1052 MB`, end `1927 MB`, peak `2229 MB`, GC `5 events / 54 ms`

**FPS over sampling window (ASCII):**

```
 34.1 |                █                                                               
 33.3 |        █       █                                                               
 32.6 |        █       █                  █                                            
 31.9 |   █    █       █     █            █                                 █ █        
 31.2 |   █  █ █  █ █  █     █ █ █ █   █  █            ██ ██   █          █ █ █        
 30.4 | █ █  █ █  █ ██ █     █ █ █ █  ██  █      █   █ ██ ██   █          █ █ █        
 29.7 | █ █  █ █  ████ █     ███████  ██  █      █ █ █ ██ ███  █  ██      █ █ █   █    
 29.0 | █ █ ████  ████ █    █████████ ██ ██      ███ █ ██ ███  █  ██      █ █ █   ██   
 28.3 | ████████ █████ ██ █ ████████████████ █ █ █████ ██ ███  █████ █ █  █ █ █   ██ █ 
 27.5 |███████████████ █████████████████████ ███ █████ ███████ █████ ███ ██████████████
 26.8 |███████████████████████████████████████████████ ████████████████████████████████
 26.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  18 ms | █  2
  19 ms | ████  9
  20 ms | █████  12
  21 ms | ██████  14
  22 ms | ██  6
  23 ms | █  2
  28 ms |   1
  30 ms | █  3
  31 ms | ██████  16
  32 ms | ███████████████████████████████████  86
  33 ms | ████████████████████████████████████████  99
  34 ms | ███████████████████████████████  77
  35 ms | ██████  14
  36 ms | █████  12
  37 ms | ██████  14
  38 ms | ██████  16
  39 ms | ██████  16
  40 ms | █████████  22
  41 ms | █████████  23
  42 ms | ████████  21
  43 ms | ████████  20
  44 ms | ███████████  26
  45 ms | ███████████  26
  46 ms | ██████  15
  47 ms | █  2
  48 ms | █  2
  49 ms |   1
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `18.38`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `34.00`
- `fps_1pct_low` = `20.24`
- `fps_harmonic_avg` = `27.94`
- `preset_full` = `0.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `29.18`, min `14.71`, p50 `29.35`, p95 `47.19`, p99 `50.70`, 1%low `18.52`, 0.1%low `14.71`, std `7.09`

**Frame time (ms)**  avg `35.91`, p50 `34.07`, p95 `45.80`, p99 `47.81`, p99.9 `63.67`, max `67.98`

**Client tick (ms)**  avg `0.50`, p95 `0.64`, max `1.14`

**Memory**  start `2096 MB`, end `1308 MB`, peak `2273 MB`, GC `6 events / 79 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                                                           █                    
 32.5 |                                 █   █                     █                    
 31.6 |   █      █  █  █    █           █   ██        █        █  █     █          █ █ 
 30.7 |   █      █  █  █    █           █   ██  █     █ █      █  █     █       ██ ███ 
 29.8 |   █    █ █ ██  ██  ██           █  ███ ██  █  ███  █   █  █     █  █ █  ██ ███ 
 29.0 |█  █ █ ██ ████ ███  ████   ███  ██  ███ █████ ████  █   █ ██     ██ █ █  ██ ████
 28.1 |█ ███████████████████████  ████████ ███████████████ ███ █ ████ █ ██████████ ████
 27.2 |██████████████████████████ ████████████████████████ ███ ████████ ███████████████
 26.4 |███████████████████████████████████████████████████ ████████████████████████████
 25.5 |███████████████████████████████████████████████████ ████████████████████████████
 24.6 |███████████████████████████████████████████████████ ████████████████████████████
 23.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  3
  19 ms | █  4
  20 ms | █████  17
  21 ms | ███████  23
  22 ms | ███  9
  23 ms | █  2
  26 ms |   1
  29 ms | █  2
  30 ms | █  4
  31 ms | █  4
  32 ms | █████████████████  59
  33 ms | ████████████████████████████████████████  141
  34 ms | ██████████████  48
  35 ms | ███  12
  36 ms | ███  10
  37 ms | ███  12
  38 ms | █████  17
  39 ms | █████  17
  40 ms | ██████  20
  41 ms | ███████  23
  42 ms | ████  13
  43 ms | ██████████  34
  44 ms | ███████  24
  45 ms | █████████  32
  46 ms | █████  17
  47 ms | █  3
  48 ms | █  3
  50 ms |   1
  60 ms |   1
  67 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `14.71`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `27.85`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `18.52`
- `block_state_changes` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `29.73`, min `17.74`, p50 `28.16`, p95 `49.47`, p99 `59.10`, 1%low `18.78`, 0.1%low `17.74`, std `8.13`

**Frame time (ms)**  avg `35.57`, p50 `35.51`, p95 `47.26`, p99 `50.92`, p99.9 `56.03`, max `56.37`

**Client tick (ms)**  avg `3.27`, p95 `4.95`, max `6.56`

**Memory**  start `1487 MB`, end `1854 MB`, peak `2275 MB`, GC `8 events / 80 ms`

**FPS over sampling window (ASCII):**

```
 35.5 | █  █                                                                           
 34.6 | █  █                                                                           
 33.7 | █  █  █      █                                                                 
 32.9 | █  █  █  █   █  █   █                                                          
 32.0 | █  ████  █ █ █  █   █ ██ █  █          █        █                            █ 
 31.1 | █  ████  █ █ █  █ █ █ ██ █  ██ █    ██ █ █    █ █    █    █     ███  █       █ 
 30.3 | █  ████  █ █ █ ██ █ █ ██ █  ██ █ █  ██ ███    ███    █ █  █     ███ ██     █ █ 
 29.4 | ██ ████ ██ █ █ ██ ███ ████  ██ █ █  ██ ███ █ ████    █ ██ ██    ███ ███    ████
 28.5 | ██ ████ ████ █ ██ ███ █████ ██ █ █████ ██████████    █ █████ █  ███ ███ █  ████
 27.7 | ██████████████ ██████ █████ ████ ████████████████ ██ █ ████████████ ██████ ████
 26.8 |████████████████████████████ ███████████████████████████████████████████████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms | █  1
  15 ms | █  1
  16 ms | ███  5
  17 ms | █████  7
  18 ms | █████  7
  19 ms | ███  5
  20 ms | █████  7
  21 ms | ██████  10
  22 ms | ██  3
  23 ms | ███  4
  25 ms | ██  3
  26 ms | █  2
  27 ms | ███  5
  28 ms | ███  5
  29 ms | ██████████  15
  30 ms | ██████████████████████████████████  52
  31 ms | █████████████████████  33
  32 ms | █████████████████  26
  33 ms | ████████████████████████████████████████  62
  34 ms | ████████████  18
  35 ms | █████████████████  27
  36 ms | ████████████████████████████████  50
  37 ms | █████████████  20
  38 ms | █████████████  20
  39 ms | ██████████  16
  40 ms | ██████████  16
  41 ms | █████████████  20
  42 ms | ██████████████  21
  43 ms | ████████████  18
  44 ms | ██████████  15
  45 ms | █████████  14
  46 ms | █████████████  20
  47 ms | ████████  13
  48 ms | █████  8
  49 ms | ███  4
  50 ms | ███  4
  51 ms | █  2
  53 ms | █  1
  55 ms | █  1
  56 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `129.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `28.11`
- `fps_1pct_low` = `18.78`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.34`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `17.74`
- `preset_long` = `0.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `29.58`, min `15.00`, p50 `27.95`, p95 `48.53`, p99 `55.79`, 1%low `18.47`, 0.1%low `15.00`, std `9.29`

**Frame time (ms)**  avg `36.00`, p50 `35.78`, p95 `46.84`, p99 `49.27`, p99.9 `59.68`, max `66.65`

**Client tick (ms)**  avg `2.84`, p95 `4.59`, max `34.41`

**Memory**  start `2386 MB`, end `1429 MB`, peak `2386 MB`, GC `6 events / 87 ms`

**FPS over sampling window (ASCII):**

```
 48.1 |           █                                                                    
 46.2 |           █                                                                    
 44.2 |           █                                                                    
 42.2 |           █                                                                    
 40.2 |           █                                                                    
 38.2 |           █                                                                    
 36.3 |█          █                                                                    
 34.3 |█     █    █                    █             █                                 
 32.3 |█  █  █  █ █    █  █     █   █  █          █  █    █          █  █  █    █  █   
 30.3 |█  █  █  █ █ █  ██ █ ███ █ █ ██ █          █  █ ██ ██  █  █ █ █ ██  █    ██ █   
 28.3 |████████████ ██████████████████ ███  █████ ███████████ ██ █████ ███ ███  ██ ████
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | █  1
  11 ms | █  1
  17 ms | ███  4
  18 ms | ███████  9
  19 ms | ██████  8
  20 ms | ███████  9
  21 ms | ███████  9
  22 ms | ███████  9
  23 ms | ██████  8
  24 ms | ████  5
  25 ms | ██  3
  26 ms | ████  5
  27 ms | █  1
  28 ms | █████  6
  29 ms | ████████  10
  30 ms | ████████████████  21
  31 ms | ███████████████████████████  35
  32 ms | ██████████████  18
  33 ms | ████████████████████████████████████████  51
  34 ms | ███████████████████████████  34
  35 ms | ███████████████████████████████  39
  36 ms | ███████████████████████  29
  37 ms | ████████████████  21
  38 ms | ████████████████  21
  39 ms | ██████████  13
  40 ms | ███████████████████  24
  41 ms | █████████████  17
  42 ms | ████████████████  20
  43 ms | ████████████████████  25
  44 ms | ██████████████████████  28
  45 ms | ████████████████████  25
  46 ms | ███████████████  19
  47 ms | █████████████  16
  48 ms | ██  3
  49 ms | ███  4
  52 ms | █  1
  53 ms | █  1
  54 ms | █  1
  66 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `94.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.78`
- `fps_1pct_low` = `18.47`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.41`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `15.00`
- `preset_long` = `0.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `37.33`, min `11.48`, p50 `26.52`, p95 `99.58`, p99 `172.48`, 1%low `12.69`, 0.1%low `11.48`, std `30.55`

**Frame time (ms)**  avg `36.41`, p50 `37.71`, p95 `59.88`, p99 `70.32`, p99.9 `84.82`, max `87.12`

**Client tick (ms)**  avg `15.42`, p95 `21.73`, max `33.64`

**Memory**  start `2045 MB`, end `1888 MB`, peak `2285 MB`, GC `19 events / 160 ms`

**FPS over sampling window (ASCII):**

```
 62.1 | █                                                                              
 58.6 | █                                           █                       █          
 55.2 | █    █                        █         █  ██     █         █       █          
 51.7 | █    █     █                  █         █  ██   ███         █       █          
 48.3 | █    █     █ █                █         ██ ██   ███ █       █       █  █       
 44.9 | █    █     █ █  █    █    █   █ █       ██ ██   ███ █       █       █  █       
 41.4 | █    █   █ █ █  █    █  █ ██  █ █       ██ ██   ███ ██ █    █    █  █  █     █ 
 38.0 | ██   █   █ █ ████  █ █  █ ██  █ █     █ ██ ██  ████ ██ █    █ ██ █  ██ █ █   █ 
 34.5 | ██ █ █ ███ ██████  █ █  █ ██  ████  █ █ █████  ███████ ███  █ ██ █  ██████   █ 
 31.1 | ██████ ███ █████████ ████ ██ █████  █████████████████████████ ██ ███████████ █ 
 27.6 | ██████ ████████████████████████████████████████████████████████████████████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █████  3
   5 ms | █████  3
   6 ms | ███████  4
   7 ms | █████████████  8
   8 ms | ████████  5
   9 ms | ███████  4
  10 ms | ████████████████████  12
  11 ms | ████████  5
  12 ms | ██████████  6
  13 ms | ███████  4
  14 ms | ███  2
  15 ms | ████████████  7
  16 ms | ███████  4
  17 ms | ███████████████  9
  18 ms | █████████████████  10
  19 ms | █████  3
  20 ms | █████  3
  21 ms | ███  2
  22 ms | ███████████████  9
  23 ms | █████████████████  10
  24 ms | ██████████████████████  13
  25 ms | ████████████████████  12
  26 ms | ███████████████████████  14
  27 ms | █████████████████  10
  28 ms | █████████████████  10
  29 ms | █████████████████  10
  30 ms | ████████  5
  31 ms | ██████████████████  11
  32 ms | ████████████████████  12
  33 ms | ██████████████████████████████  18
  34 ms | ███████████████████████  14
  35 ms | ██████████████████  11
  36 ms | ███████████████████████  14
  37 ms | ██████████████████  11
  38 ms | ████████████████████████████████████████  24
  39 ms | ███████████████████████  14
  40 ms | ███████████████  9
  41 ms | █████████████████████████████████  20
  42 ms | ██████████████████████████████  18
  43 ms | ███████████████████████  14
  44 ms | ██████████████████████  13
  45 ms | ████████████████████  12
  46 ms | ███████████████████████  14
  47 ms | ████████████████████  12
  48 ms | █████████████████  10
  49 ms | ████████████████████  12
  50 ms | █████████████████  10
  51 ms | ██████████  6
  52 ms | ████████████  7
  53 ms | ████████████████████  12
  54 ms | ████████████  7
  55 ms | ████████████  7
  56 ms | ██████████  6
  57 ms | █████████████████  10
  58 ms | █████  3
  59 ms | █████  3
  60 ms | ██████████  6
  61 ms | █████  3
  62 ms | ██  1
  63 ms | █████  3
  64 ms | ██  1
  65 ms | ███  2
  66 ms | ███  2
  67 ms | ███  2
  69 ms | ███  2
  70 ms | ███  2
  76 ms | ██  1
  77 ms | ██  1
  82 ms | ██  1
  87 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4807.72`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.69`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `33.00`
- `falling_blocks_landed` = `23454.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.47`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `11.48`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `37.44`, min `12.01`, p50 `27.31`, p95 `102.75`, p99 `151.23`, 1%low `12.65`, 0.1%low `12.01`, std `29.76`

**Frame time (ms)**  avg `36.71`, p50 `36.62`, p95 `61.14`, p99 `74.67`, p99.9 `81.23`, max `83.24`

**Client tick (ms)**  avg `16.79`, p95 `23.46`, max `51.23`

**Memory**  start `1507 MB`, end `1525 MB`, peak `2266 MB`, GC `19 events / 181 ms`

**FPS over sampling window (ASCII):**

```
 71.3 |                                                                        █       
 66.7 |          █                                                             █       
 62.0 |          █                           █                                 █       
 57.4 |          █                           █            █                    █       
 52.8 |          █      █                    █  █         █                    █       
 48.1 |  █  █    █      █  █               █ █  █  █    █ █ █    █   █         █       
 43.5 |  █  █    █    █ █  █       ███     █ █  █  █    ███ █    █   █ █    █  █     █ 
 38.8 |  █  █    █  ███ █  █     █████ █ ███ █  ██ █    ██████ ████ ██ █  █ █  █   █ █ 
 34.2 |█ ██ ███  ██ ██████ █ █   █████ █████ ██ ██████ ████████████ ████  █ █ ██  ████ 
 29.6 |█ ███████ ███████████ ██████████████████ ██████ ████████████████████ ███████████
 24.9 |█████████████████████ ██████████████████████████████████████████████████████████
 20.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ████  2
   5 ms | ██████  3
   6 ms | ██████  3
   7 ms | ██  1
   8 ms | ██████████████████████  11
   9 ms | ████████████████████████  12
  10 ms | ████████████████  8
  11 ms | ██████████████████  9
  12 ms | ████████████  6
  13 ms | ████████  4
  14 ms | ████  2
  15 ms | ██████████████████  9
  16 ms | ██████████████████████  11
  17 ms | ██████████  5
  18 ms | ██████████████  7
  19 ms | ██████████████  7
  20 ms | ██  1
  21 ms | ████████████  6
  22 ms | ████████████  6
  23 ms | ████████████████████  10
  24 ms | ██████████████████████  11
  25 ms | ██████████████  7
  26 ms | ████████  4
  27 ms | ████████████████████████████████  16
  28 ms | ██████████  5
  29 ms | ██████████████████████  11
  30 ms | ██████████████████████████  13
  31 ms | ██████████████████████████  13
  32 ms | ██████████████████████████████  15
  33 ms | ████████████████████████████  14
  34 ms | ██████████████████████████  13
  35 ms | ██████████████████████████████  15
  36 ms | ██████████████████████████████  15
  37 ms | ████████████████  8
  38 ms | ██████████████████  9
  39 ms | ████████████████████████████  14
  40 ms | ████████████████████████████████  16
  41 ms | ██████████████████████  11
  42 ms | ████████████████████████████████  16
  43 ms | ████████████████████████████████████████  20
  44 ms | ██████████████████████████  13
  45 ms | ██████████████████  9
  46 ms | ████████████████████████  12
  47 ms | ██████████████  7
  48 ms | ████████████████  8
  49 ms | ██████████████████████  11
  50 ms | ████████████████████  10
  51 ms | ████████████████████████████  14
  52 ms | ████████████████  8
  53 ms | ██████████████████  9
  54 ms | ████████████████  8
  55 ms | ████████  4
  56 ms | ██████████████  7
  57 ms | ████████████████  8
  58 ms | ██████  3
  59 ms | ██████████████████  9
  60 ms | ████████████  6
  61 ms | ██████  3
  62 ms | ████  2
  63 ms | ██████  3
  64 ms | ██  1
  65 ms | ████  2
  66 ms | ████████  4
  67 ms | ██  1
  69 ms | ██  1
  70 ms | ████████  4
  71 ms | ██  1
  72 ms | ██  1
  73 ms | ██  1
  75 ms | ██  1
  77 ms | ████  2
  78 ms | ██  1
  79 ms | ██  1
  83 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4811.36`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.65`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `104.00`
- `falling_blocks_landed` = `23844.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.24`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.01`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `29.20`, min `15.78`, p50 `28.17`, p95 `47.00`, p99 `52.30`, 1%low `18.35`, 0.1%low `15.78`, std `7.74`

**Frame time (ms)**  avg `36.09`, p50 `35.49`, p95 `45.92`, p99 `47.73`, p99.9 `62.04`, max `63.37`

**Client tick (ms)**  avg `1.85`, p95 `2.56`, max `3.03`

**Memory**  start `2023 MB`, end `1642 MB`, peak `2270 MB`, GC `6 events / 80 ms`

**FPS over sampling window (ASCII):**

```
 36.3 |                                            █                                   
 35.3 |              █                             █       █                           
 34.4 |              █                             █       █                           
 33.5 |              █                             █       █                          █
 32.6 |              █    █                        █       █                          █
 31.6 |      █  █    █  █ █   █                   ██       █                 █        █
 30.7 |      █  ██   █  █ █  ██      █ █        █ ██  █    █  █    █       █ █        █
 29.8 |  ██  ██ ██   █  █ █  ██    █ █ █   █ █  █ ██  █    █  █    █     █ █ ██       █
 28.9 |  ██  █████ █ ██ █ ██ ████  █ █ █   █ █  █████ █ █  █ ████  █ █  ███████   █ █ █
 27.9 |  ██ ████████████████████████ █████ ███ ██████████ █████████████ ███████████████
 27.0 | ██████████████████████████████████████ ████████████████████████████████████████
 26.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  11 ms | █  1
  17 ms | █  2
  18 ms | █  2
  19 ms | ████  7
  20 ms | ███████  13
  21 ms | ████████  14
  22 ms | ███████  13
  23 ms | █████  8
  24 ms | █  2
  26 ms | █  2
  28 ms | █  1
  30 ms | ████████████  21
  31 ms | █████████████████████  38
  32 ms | █████████████████  31
  33 ms | ████████████████████████████████████████  71
  34 ms | ███████████████  26
  35 ms | █████████████████████████████  51
  36 ms | ████████  15
  37 ms | █████████  16
  38 ms | ████████  15
  39 ms | ███████████  19
  40 ms | ████████████  21
  41 ms | ██████████  17
  42 ms | ███████████████  27
  43 ms | ████████████████  28
  44 ms | ███████████████████  34
  45 ms | ██████████████████  32
  46 ms | ████████  15
  47 ms | ████  7
  49 ms | █  2
  56 ms | █  1
  60 ms | █  1
  63 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.90`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `18.35`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `33.00`
- `falling_blocks_landed` = `3920.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.71`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `15.78`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `29.91`, min `17.05`, p50 `28.90`, p95 `49.85`, p99 `53.50`, 1%low `17.26`, 0.1%low `17.05`, std `9.20`

**Frame time (ms)**  avg `36.28`, p50 `34.61`, p95 `54.20`, p99 `57.49`, p99.9 `58.42`, max `58.65`

**Client tick (ms)**  avg `1.84`, p95 `2.47`, max `8.34`

**Memory**  start `1487 MB`, end `904 MB`, peak `2263 MB`, GC `6 events / 71 ms`

**FPS over sampling window (ASCII):**

```
 34.6 |                        █                                                       
 33.8 |                        █          █               █                            
 33.1 |                     █  █    █     █               █       █       █       █    
 32.3 |             █  █  █ █  ██   █ █ █ █               █       █       █       █    
 31.5 |             █  █  █ █  ██   █ █ █ █           █   █       █    █  █       █    
 30.7 |     █  ██ █ █  █  █ █  ██   █ █ █ ██       █  █   █   █ █ ██ █ █  ██      █   █
 29.9 | ██████ ██ ███  ██ █ ██ ████ █████ █████ ██ ██ █ █ ███ █ █ ██ █ ██ ██ ██   █   █
 29.2 | ██████████████ ██ █ ██ ████ █████ ███████████████ ███ █ █ ████ ██ ██████  █   █
 28.4 | ██████████████ ██ █ █████████████████████████████████ █ █ ████ ██████████ ███ █
 27.6 |██████████████████ █████████████████████████████████████ ███████████████████████
 26.8 |██████████████████ █████████████████████████████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  1
  17 ms | █  2
  18 ms | ███  6
  19 ms | ██████████  18
  20 ms | ███████  13
  21 ms | ██████████████  25
  22 ms | ███████████  20
  23 ms | ██  4
  24 ms | █  2
  25 ms | █  1
  27 ms | █  2
  29 ms | ██  3
  30 ms | ██████  11
  31 ms | █████████████████████████████  50
  32 ms | ██████████████████  31
  33 ms | ████████████████████████████████████████  70
  34 ms | ██████████████████  32
  35 ms | █████████████████████  36
  36 ms | ██████  10
  37 ms | ███  6
  38 ms | ██████  11
  39 ms | ██████  11
  40 ms | █████████  16
  41 ms | ██████████  18
  42 ms | ███████  13
  43 ms | ██████████  17
  44 ms | █████████████  23
  45 ms | █████  8
  46 ms | ██████  11
  47 ms | ███  5
  48 ms | ██  4
  49 ms | ████  7
  50 ms | ███  6
  51 ms | ██  4
  52 ms | ███  6
  53 ms | ███████████  19
  54 ms | ███████  12
  55 ms | ███  6
  56 ms | ██  4
  57 ms | ███  5
  58 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `618.99`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `17.26`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `33.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.56`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `17.05`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23079 ms  |  Sample ticks: 400

**FPS**  avg `28.88`, min `15.07`, p50 `29.58`, p95 `44.44`, p99 `52.18`, 1%low `16.20`, 0.1%low `15.07`, std `9.65`

**Frame time (ms)**  avg `36.32`, p50 `33.80`, p95 `46.67`, p99 `57.08`, p99.9 `64.90`, max `66.34`

**Client tick (ms)**  avg `0.63`, p95 `0.79`, max `0.99`

**Memory**  start `2055 MB`, end `2083 MB`, peak `2283 MB`, GC `5 events / 63 ms`

**FPS over sampling window (ASCII):**

```
 54.4 |                              █                                                 
 51.9 |                              █                                                 
 49.3 |                              █                                                 
 46.8 |                              █                                                 
 44.2 |                              █                                                 
 41.7 |                              █                                                 
 39.1 |                              █                                                 
 36.6 |                              █                                                 
 34.0 |         █                    █                                                 
 31.5 |   █ █   █       ██  █ █      ███    █       █  █     █ █           █           
 28.9 |██ ███ █ █████ ███████ ██ █  ███████ ██  █ ████ ██ █  █ ██ ██ █ ██ ██ ██ █ ██ █ 
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   1
  15 ms |   1
  18 ms | █  4
  19 ms | █  3
  20 ms | █  5
  21 ms | ███  10
  22 ms | ██  7
  24 ms |   1
  26 ms |   1
  28 ms |   1
  29 ms |   1
  30 ms | █  2
  31 ms | ███  11
  32 ms | ████████████████████████████████  110
  33 ms | ████████████████████████████████████████  136
  34 ms | ████████████  40
  35 ms | ██  8
  36 ms | █  5
  37 ms | ██  6
  38 ms | ███  11
  39 ms | ██████  22
  40 ms | ████  14
  41 ms | ██████  20
  42 ms | █████████  32
  43 ms | █████████  30
  44 ms | ███████  24
  45 ms | ████  12
  46 ms | ███  10
  47 ms | █  5
  48 ms | █  3
  50 ms | █  2
  52 ms |   1
  54 ms | █  4
  56 ms |   1
  57 ms | █  2
  62 ms |   1
  63 ms | █  2
  66 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.54`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `15.07`
- `seed` = `5099.00`
- `preload_duration_ms` = `45.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `16.20`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `29.39`, min `16.02`, p50 `29.64`, p95 `45.87`, p99 `49.40`, 1%low `20.02`, 0.1%low `16.02`, std `9.87`

**Frame time (ms)**  avg `35.46`, p50 `33.74`, p95 `45.57`, p99 `47.15`, p99.9 `54.17`, max `62.43`

**Client tick (ms)**  avg `0.27`, p95 `0.33`, max `0.49`

**Memory**  start `1002 MB`, end `2095 MB`, peak `2252 MB`, GC `4 events / 43 ms`

**FPS over sampling window (ASCII):**

```
 55.1 |                    █                                                           
 52.5 |                    █                                                           
 49.8 |                    █                                                           
 47.1 |                    █                                                           
 44.5 |                    █                                                           
 41.8 |                    █                                                           
 39.2 |                    █                                                           
 36.5 |                    █                                                           
 33.9 |        █           █                                                           
 31.2 |     █  █ █ ██ ███  █ █  █ █  █  ██ █  █ █ █  ██       ██ █ █ █       █ █  █    
 28.5 | █████  ███ ████████████████████████████ █ ██ ██ █ ██████████████████ █ ████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   1
  18 ms |   2
  19 ms |   2
  20 ms | ██  9
  21 ms | ███  18
  22 ms | █  4
  23 ms |   1
  27 ms |   1
  28 ms |   2
  30 ms |   1
  31 ms | █  4
  32 ms | ██████████  57
  33 ms | ████████████████████████████████████████  226
  34 ms | ███████  37
  35 ms | ██  12
  36 ms | ███  16
  37 ms | ██  12
  38 ms | ███  16
  39 ms | ██  12
  40 ms | ████  20
  41 ms | ████  21
  42 ms | ██  12
  43 ms | ███  15
  44 ms | ████  23
  45 ms | ████  22
  46 ms | ██  10
  47 ms | █  8
  62 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.02`
- `fps_harmonic_avg` = `28.20`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `16.02`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `43.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `168.48`, min `9.15`, p50 `116.54`, p95 `853.13`, p99 `1119.33`, 1%low `9.87`, 0.1%low `9.15`, std `241.90`

**Frame time (ms)**  avg `14.97`, p50 `8.58`, p95 `41.69`, p99 `88.06`, p99.9 `104.30`, max `109.25`

**Client tick (ms)**  avg `0.25`, p95 `0.31`, max `1.64`

**Memory**  start `1001 MB`, end `1853 MB`, peak `2257 MB`, GC `5 events / 57 ms`

**FPS over sampling window (ASCII):**

```
447.1 |                                            █                                   
408.1 |                                            █                                   
369.1 |                                            █                                   
330.0 |                                            ██ █            █           █       
291.0 |                                            ██ █  █ █  █    █  █ █   █  █       
252.0 |                                           █████ ██ ██ ██   █  █ █ ████ █ █    █
213.0 |                                           ████████████████████████████ █ ██████
174.0 |                       █            █ █   ██████████████████████████████████████
135.0 |                       ██        ██ █ █ █ ██████████████████████████████████████
 95.9 |             ███████████████████████████████████████████████████████████████████
 56.9 |    █        ███████████████████████████████████████████████████████████████████
 17.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  36
   1 ms | ██████  83
   2 ms | ██  30
   3 ms | █  19
   4 ms | █  14
   5 ms |   4
   6 ms |   2
   7 ms | █████  59
   8 ms | ████████████████████████████████████████  523
   9 ms | █  7
  10 ms |   1
  11 ms |   1
  12 ms | █  15
  13 ms | ████  49
  14 ms | ██████  77
  15 ms | ████  56
  16 ms | ██  27
  17 ms | █  14
  18 ms | █  16
  19 ms | ███  42
  20 ms | ██  23
  21 ms | █  9
  22 ms |   2
  23 ms |   3
  24 ms |   1
  25 ms |   1
  26 ms |   1
  27 ms |   6
  29 ms |   2
  30 ms |   3
  31 ms | █  7
  32 ms | █  18
  33 ms | █████  63
  34 ms | █  12
  35 ms | █  11
  36 ms | █  7
  37 ms |   1
  38 ms |   6
  39 ms |   4
  40 ms | █  7
  41 ms | █  9
  42 ms |   5
  43 ms | █  10
  44 ms | █  11
  45 ms | █  8
  46 ms |   6
  47 ms |   2
  48 ms |   1
  49 ms |   1
  50 ms |   1
  52 ms |   1
  58 ms |   1
  61 ms |   1
  62 ms |   1
  63 ms |   1
  69 ms |   1
  98 ms |   1
  99 ms |   5
 100 ms |   6
 106 ms |   1
 109 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `0.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `9.15`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `66.80`
- `preload_duration_ms` = `57.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `9.87`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `164.19`, min `20.76`, p50 `118.63`, p95 `599.24`, p99 `924.47`, 1%low `36.17`, 0.1%low `24.07`, std `174.04`

**Frame time (ms)**  avg `9.38`, p50 `8.43`, p95 `18.85`, p99 `21.72`, p99.9 `33.91`, max `48.17`

**Client tick (ms)**  avg `0.29`, p95 `0.40`, max `0.51`

**Memory**  start `2096 MB`, end `2065 MB`, peak `2296 MB`, GC `5 events / 77 ms`

**FPS over sampling window (ASCII):**

```
227.3 |                                                            █                   
218.2 |                                                            █                   
209.1 |        █                                       █           █              █    
200.0 |        █                                       █         █ █           █  █    
190.9 |    ██  █                            █          █      █ ██ █      █    █  █    
181.8 | █  ██  █                          █ █ █        █      █ ██ █ ██   █    █  █ ██ 
172.7 |██  ██  █ █        █      █      ███ █ █    █   ███ █ ██ ██ █ ██ █ █ █  █ ██ ██ 
163.5 |██ ███  █ █  ██ █  █      ██ █   ███ █ █    █ █████ █ ██ ██ █ ████ █ █ ██ ██ ██ 
154.4 |██████  █ █ █████  ██ █   ██ ██ ███████████ ███████ █ █████ █ ████ ███ █████ ███
145.3 |█████████ █ ██████ █████████ ██ ███████████████████████████ █ ████ █████████████
136.2 |█████████ ██████████████████ █████████████████████████████████████ █████████████
127.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   9
   1 ms | █████  131
   2 ms | ████  95
   3 ms | █  29
   4 ms |   7
   5 ms | █  14
   6 ms | █  33
   7 ms | ███████  191
   8 ms | ████████████████████████████████████████  1038
   9 ms | █████  134
  10 ms | █  18
  11 ms |   2
  12 ms |   6
  13 ms | █  28
  14 ms | ██  61
  15 ms | ███  76
  16 ms | ███  67
  17 ms | ██  53
  18 ms | █  36
  19 ms | █  33
  20 ms | █  34
  21 ms | █  21
  22 ms |   4
  23 ms |   1
  25 ms |   1
  31 ms |   3
  33 ms |   4
  34 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `106.56`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `24.07`
- `seed` = `4027.00`
- `preload_duration_ms` = `27.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `36.17`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `163.37`, min `24.99`, p50 `119.00`, p95 `594.59`, p99 `755.27`, 1%low `40.60`, 0.1%low `25.37`, std `163.31`

**Frame time (ms)**  avg `9.38`, p50 `8.40`, p95 `18.67`, p99 `21.30`, p99.9 `36.04`, max `40.02`

**Client tick (ms)**  avg `0.28`, p95 `0.34`, max `7.11`

**Memory**  start `1043 MB`, end `1022 MB`, peak `2279 MB`, GC `5 events / 59 ms`

**FPS over sampling window (ASCII):**

```
209.8 |                                     █                            █       █     
202.4 |                                     █                            █       █     
195.0 |        █               █            █      █    █                █       █     
187.7 |    █   █  █ █         ██        █   █      █    █               ██       █     
180.3 |    █   █  █ █     █   ██    █   █ █ █  █   █    █   █         █ ██       █ █   
172.9 |    █  ██  █ █     █   ██    █   █ █ █  █   █    ██  █         ████ █  █  █ █   
165.6 | █  █  ██  █ █   █ █ █ ██ ██ █   █ █ █  █   █ █  ██ ██  █ █   ████████ █  █ ██ █
158.2 | ████  ██  █ █  ██ █ █ ██ █████ ████ █████  █ █ ██████ ████ █ ██████████  ████ █
150.8 |██████ ███ █ █  ██ █ █ ██ █████ ████ ████████ █ ███████████ ████████████  ████ █
143.4 |██████████ ███  ██ ████████████ ████ ████████ █ █████████████████████████ ██████
136.1 |███████████████ ████████████████████████████████████████████████████████████████
128.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms | ██████  179
   2 ms | ██  71
   3 ms |   5
   4 ms |   3
   5 ms |   5
   6 ms | █  15
   7 ms | ██████  173
   8 ms | ████████████████████████████████████████  1168
   9 ms | ██  58
  10 ms |   9
  11 ms |   6
  12 ms |   1
  13 ms |   13
  14 ms | █  41
  15 ms | ████  103
  16 ms | ███  92
  17 ms | ██  61
  18 ms | █  23
  19 ms | █  32
  20 ms | █  40
  21 ms |   13
  22 ms |   9
  23 ms |   3
  37 ms |   1
  38 ms |   1
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `106.59`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `40.60`
- `fps_0p1pct_low` = `25.37`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `54.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `31.22`, min `19.54`, p50 `29.89`, p95 `48.49`, p99 `55.88`, 1%low `19.94`, 0.1%low `19.54`, std `7.41`

**Frame time (ms)**  avg `33.53`, p50 `33.45`, p95 `45.61`, p99 `48.81`, p99.9 `50.88`, max `51.17`

**Client tick (ms)**  avg `0.36`, p95 `0.61`, max `1.05`

**Memory**  start `2080 MB`, end `1437 MB`, peak `2140 MB`, GC `25 events / 186 ms`

**FPS over sampling window (ASCII):**

```
 35.2 |        █                                                                       
 34.6 |        █                 █                                                     
 34.0 | █      █                 █                                                     
 33.4 | █ █    █                 █                 █                █                 █
 32.8 | █ █    █  █         █    █                 █  █ █           █            █    █
 32.2 | █ ██   █  █    █ ██ █  █ ██      █         █  █ █      █ █  █  █  █     ██    █
 31.6 | █ ██ █ █  █    █ ██ █  █ ██ ██   ██   █  █ █  █ █      █ █ ██  ██ █     ██    █
 31.0 | █ ██ █ █ ██  █ █ ██ ████ ██ ██  ███   ██ █ █ ██ █     ████████ ████   █ ██ █  █
 30.4 | ██████ ████ ██ ████ ████ ██ ██ █████████ █ ████ █ █████████████████ █ █ ██ █ ██
 29.7 |███████████████████████████████████████████ ██████████████████████████ ██████ ██
 29.1 |███████████████████████████████████████████ ████████████████████████████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | █  2
  16 ms |   1
  17 ms | █  4
  18 ms | █  5
  19 ms | ████  12
  20 ms | ███  11
  21 ms | ████  12
  22 ms | ██  6
  23 ms | ██  8
  24 ms | ███  9
  25 ms | ███  10
  26 ms | ███  11
  27 ms | █████  17
  28 ms | ██  7
  29 ms | ████  13
  30 ms | ███  9
  31 ms | ████  15
  32 ms | ████████████████████████  80
  33 ms | ████████████████████████████████████████  134
  34 ms | █████████████████  57
  35 ms | █████  18
  36 ms | █████  16
  37 ms | ████  14
  38 ms | ███████  22
  39 ms | ████  13
  40 ms | █████  16
  41 ms | ██  6
  42 ms | ███  10
  43 ms | ███  11
  44 ms | ███  10
  45 ms | ████  14
  46 ms | ██  8
  47 ms | ██  6
  48 ms | █  3
  49 ms | █  3
  50 ms | █  2
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.54`
- `seed` = `7411.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `3.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-8.00`
- `entity_count_sample_start` = `11.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `19.94`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23513 ms  |  Sample ticks: 400

**FPS**  avg `31.63`, min `17.96`, p50 `29.77`, p95 `48.08`, p99 `58.40`, 1%low `18.76`, 0.1%low `17.96`, std `10.78`

**Frame time (ms)**  avg `33.51`, p50 `33.59`, p95 `45.49`, p99 `50.60`, p99.9 `55.48`, max `55.68`

**Client tick (ms)**  avg `0.35`, p95 `0.51`, max `1.06`

**Memory**  start `1892 MB`, end `1810 MB`, peak `2018 MB`, GC `25 events / 196 ms`

**FPS over sampling window (ASCII):**

```
 53.5 |                                █                                               
 51.3 |                                █                                               
 49.0 |                                █                                               
 46.7 |                                █                                               
 44.4 |                                █                                               
 42.2 |                                █                                               
 39.9 |                                █                                               
 37.6 |                                █                                               
 35.4 |                                █                                             █ 
 33.1 |          █  █ ██ █ █ █        ███    █  █  ██        █  █ ██ █   █      █ █ ██ 
 30.8 | ██████████████████ █ ██████████████████████████████████ █ █████ ███████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   1
  11 ms |   1
  16 ms | █  4
  17 ms | █  2
  18 ms | ██  7
  19 ms | ███  8
  20 ms | ████  12
  21 ms | █████  16
  22 ms | ███  8
  23 ms | ███  9
  24 ms | ███  9
  25 ms | █████  14
  26 ms | ████  13
  27 ms | ███  10
  28 ms | ███  8
  29 ms | █████  14
  30 ms | █  4
  31 ms | ██████  17
  32 ms | ██████████████████████  67
  33 ms | ████████████████████████████████████████  123
  34 ms | ██████████████████████  67
  35 ms | ██████  18
  36 ms | ████████  24
  37 ms | ████  12
  38 ms | ██████  18
  39 ms | ████  11
  40 ms | █████  15
  41 ms | █████  16
  42 ms | ████  11
  43 ms | ████  12
  44 ms | ███  9
  45 ms | ██████  19
  46 ms | ██  5
  47 ms | █  4
  48 ms |   1
  49 ms |   1
  50 ms |   1
  51 ms | █  2
  52 ms |   1
  53 ms |   1
  55 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.84`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.96`
- `seed` = `7417.00`
- `preload_duration_ms` = `459.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `4.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `18.76`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `31.27`, min `18.97`, p50 `29.76`, p95 `48.86`, p99 `58.64`, 1%low `19.43`, 0.1%low `18.97`, std `7.79`

**Frame time (ms)**  avg `33.54`, p50 `33.60`, p95 `45.13`, p99 `49.88`, p99.9 `52.22`, max `52.70`

**Client tick (ms)**  avg `0.34`, p95 `0.50`, max `2.20`

**Memory**  start `1439 MB`, end `956 MB`, peak `2191 MB`, GC `22 events / 179 ms`

**FPS over sampling window (ASCII):**

```
 37.3 |                                                                    █           
 36.5 |                                                                    █           
 35.7 |                                                                    █           
 34.9 |                           █                                        █     █     
 34.1 |                           █              █           █             █     █   █ 
 33.3 |                █          █              █ ██        █ █         ███    ██   █ 
 32.5 |            █   █       █  ██        █ █  █ ██   █    █ █         ███ █  ██   █ 
 31.7 |█ █         ██  █     █ █ ████ ██    █ █  █ ██ █ █    █ ███    ██ ███ ██ ███  ██
 30.9 |█ █ ███   █████ ███ █ █ █ ████ ██ █ ██████████ ███ █  █ ███   ███ ███ ██ ████ ██
 30.1 |█████████████████████ █ █ ████████████████████████ █ ██ █████████ ██████ ████ ██
 29.3 |███████████████████████ █████████████████████████████████████████ ███████████ ██
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms |   1
  14 ms |   1
  15 ms | █  3
  16 ms |   1
  17 ms | █  3
  18 ms | █  3
  19 ms | ████  10
  20 ms | ██████  15
  21 ms | █████  12
  22 ms | ███  6
  23 ms | ████  10
  24 ms | █████  11
  25 ms | ██  5
  26 ms | ███  7
  27 ms | ████  10
  28 ms | ███  6
  29 ms | ███  6
  30 ms | ██████  14
  31 ms | ███████████████  36
  32 ms | ████████████████████████████████  76
  33 ms | ████████████████████████████████████████  95
  34 ms | ███████████████████████████████  74
  35 ms | ███████████████  35
  36 ms | ███████████  26
  37 ms | ████████  19
  38 ms | ███████  16
  39 ms | ███  8
  40 ms | █████  12
  41 ms | █████  12
  42 ms | ██████  15
  43 ms | ████  10
  44 ms | ███  6
  45 ms | ███  8
  46 ms | ██  5
  47 ms | ███  8
  48 ms | █  2
  49 ms | █  3
  50 ms | █  2
  51 ms | █  3
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.97`
- `seed` = `7433.00`
- `preload_duration_ms` = `32.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `19.43`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `32.42`, min `13.18`, p50 `29.69`, p95 `49.38`, p99 `57.76`, 1%low `17.04`, 0.1%low `13.18`, std `20.41`

**Frame time (ms)**  avg `33.54`, p50 `33.68`, p95 `46.45`, p99 `50.64`, p99.9 `69.78`, max `75.86`

**Client tick (ms)**  avg `0.36`, p95 `0.46`, max `7.60`

**Memory**  start `1386 MB`, end `950 MB`, peak `2258 MB`, GC `23 events / 191 ms`

**FPS over sampling window (ASCII):**

```
 96.8 |                   █                                                            
 90.6 |                   █                                                            
 84.4 |                   █                                                            
 78.2 |                   █                                                            
 72.0 |                   █                                                            
 65.8 |                   █                                                            
 59.6 |                   █                                                            
 53.4 |                   █                                                            
 47.2 |                   █                                                            
 41.0 |                   █                                                            
 34.8 |██  █ █     █ █ ██ █  ███  █ █ █ █  ███       █  ██  █ █ █ ██ █  ██ ██ █ █ █ █ █
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
  15 ms | █  2
  16 ms | ██  3
  17 ms | █  2
  18 ms | ███  6
  19 ms | ███████  12
  20 ms | ███████  13
  21 ms | ███████  13
  22 ms | █████████  15
  23 ms | ██████████  17
  24 ms | ██████████  18
  25 ms | ███████  12
  26 ms | █████████  16
  27 ms | ██████  11
  28 ms | █████████  16
  29 ms | ██████████  18
  30 ms | ███████  13
  31 ms | █████████████████  29
  32 ms | ████████████████████  35
  33 ms | ████████████████████████████████████████  70
  34 ms | █████████████████████████████████████  65
  35 ms | ██████████████  25
  36 ms | ███████████  19
  37 ms | █████  8
  38 ms | ██████████  18
  39 ms | ████████  14
  40 ms | ██████  11
  41 ms | ██████████  17
  42 ms | ███████  13
  43 ms | ███████  13
  44 ms | ███████████  19
  45 ms | ███████  12
  46 ms | █████████  16
  47 ms | ██████  11
  48 ms | ███  5
  49 ms | █  1
  50 ms | █  1
  51 ms | █  1
  52 ms | █  1
  53 ms | █  2
  65 ms | █  1
  75 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `29.81`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.18`
- `seed` = `7451.00`
- `preload_duration_ms` = `65.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-16.00`
- `entity_count_sample_start` = `17.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `17.04`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `232.39`, min `17.19`, p50 `119.09`, p95 `1137.22`, p99 `1492.70`, 1%low `33.69`, 0.1%low `18.64`, std `337.73`

**Frame time (ms)**  avg `9.48`, p50 `8.40`, p95 `20.13`, p99 `23.25`, p99.9 `41.29`, max `58.17`

**Client tick (ms)**  avg `0.32`, p95 `0.48`, max `2.49`

**Memory**  start `2041 MB`, end `1390 MB`, peak `2195 MB`, GC `25 events / 193 ms`

**FPS over sampling window (ASCII):**

```
338.4 | █                               █                                              
320.7 | █                               █                                              
303.0 | █         █         █           █      █                           █           
285.3 | █         █ █       █  █        █      █                        █  █           
267.6 | █ █  ██   █ ██ █    █ ██     █  █ █    █                        █  █           
249.9 |██ ██ ██   █ ████ ██ ████  █  █  █ ██   ██       ██     ██   █   █  █    █      
232.2 |██ █████   █ ████ ███████  █ ██ ██████████      ███   █ ██████   ██ █ █ ██   █  
214.5 |████████ █ ██████ ███████ ██ █████████████    █████   █ ██████   ██ █ ████ █ █ █
196.7 |█████████████████ ███████ ████████████████ ██ █████████ ██████  ████████████ ███
179.0 |██████████████████████████████████████████ █████████████████████████████████████
161.3 |██████████████████████████████████████████ █████████████████████████████████████
143.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  151
   1 ms | ██████  131
   2 ms | █  24
   3 ms |   3
   4 ms |   5
   5 ms |   4
   6 ms | █  30
   7 ms | █████████████  267
   8 ms | ████████████████████████████████████████  834
   9 ms | ███████  153
  10 ms | ██  44
  11 ms | █  13
  12 ms |   6
  13 ms |   3
  14 ms | █  25
  15 ms | ███  54
  16 ms | █████  99
  17 ms | ███  61
  18 ms | ██  49
  19 ms | ██  45
  20 ms | ██  50
  21 ms | █  27
  22 ms |   9
  23 ms |   7
  24 ms |   3
  25 ms |   4
  27 ms |   2
  28 ms |   1
  29 ms |   1
  30 ms |   1
  37 ms |   1
  41 ms |   1
  49 ms |   1
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `105.48`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.64`
- `seed` = `7457.00`
- `preload_duration_ms` = `55.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-44.00`
- `entity_count_sample_start` = `45.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `33.69`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24488 ms  |  Sample ticks: 400

**FPS**  avg `147.09`, min `33.42`, p50 `118.47`, p95 `164.41`, p99 `1425.32`, 1%low `38.03`, 0.1%low `33.52`, std `220.19`

**Frame time (ms)**  avg `10.43`, p50 `8.44`, p95 `20.64`, p99 `23.89`, p99.9 `28.28`, max `29.92`

**Client tick (ms)**  avg `0.32`, p95 `0.43`, max `1.07`

**Memory**  start `1028 MB`, end `1339 MB`, peak `2312 MB`, GC `24 events / 173 ms`

**FPS over sampling window (ASCII):**

```
387.7 |  █                                                                             
361.5 |  █                                                                             
335.3 |  █                                                                             
309.0 |█ █     █  █  █                                                                 
282.8 |█ █  ██ █ █████                                                                 
256.6 |███ ███ █ █████                                                                 
230.4 |███████████████                                                                 
204.2 |███████████████    █                                                            
177.9 |███████████████    █  █                                                         
151.7 |███████████████    █  █    █ █                    █  █  █             █ █       
125.5 |███████████████    █  █    ███     █  █ █         █  ██ █ █ ██ ██   █ █ █    █  
 99.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  45
   1 ms | █  24
   2 ms | █  13
   3 ms |   7
   4 ms |   2
   5 ms |   4
   6 ms | ██  51
   7 ms | ██████████████  280
   8 ms | ████████████████████████████████████████  819
   9 ms | ████████  171
  10 ms | ██  49
  11 ms |   10
  12 ms |   2
  13 ms |   1
  14 ms | █  15
  15 ms | ██  37
  16 ms | ████  77
  17 ms | ████  73
  18 ms | ███  65
  19 ms | ██  43
  20 ms | ██  43
  21 ms | ██  35
  22 ms | █  24
  23 ms |   8
  24 ms |   6
  25 ms |   4
  26 ms |   3
  27 ms |   2
  28 ms |   2
  29 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `95.91`
- `part` = `1.00`
- `fps_0p1pct_low` = `33.52`
- `seed` = `7477.00`
- `preload_duration_ms` = `1456.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `38.03`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `227.65`, min `27.32`, p50 `118.91`, p95 `1149.66`, p99 `1475.04`, 1%low `38.26`, 0.1%low `29.51`, std `334.22`

**Frame time (ms)**  avg `9.50`, p50 `8.41`, p95 `20.09`, p99 `23.27`, p99.9 `29.47`, max `36.60`

**Client tick (ms)**  avg `0.36`, p95 `0.57`, max `4.80`

**Memory**  start `2136 MB`, end `1939 MB`, peak `2220 MB`, GC `25 events / 200 ms`

**FPS over sampling window (ASCII):**

```
349.9 |              █                                                                 
330.6 |     █        █         █          █                                            
311.3 |     █     █  █ █ █     █          █                                            
292.0 |     █     █  █ █ █     █          █                                           █
272.7 |   ████    █  █ ████    █   █     ██  █                                        █
253.3 |   ████   ███ █ █████   █ ███ █   ██  █     █     █    █                       █
234.0 |  █████ █ ███ ████████  █ ███ █ █ ██ ██ █   █   ███  █ █    █ █       █      █ █
214.7 |███████ █████ ███████████ █████ █ █████ ██ ██   ███  █ █ ██ █ █   ██  █  █   █ █
195.4 |█████████████ ███████████ ████████████████ ████████  ███ ██ █████ ████████ █ █ █
176.1 |█████████████ ███████████ ████████████████ █████████████ ████████ ██████████ ███
156.8 |█████████████ ██████████████████████████████████████████ ███████████████████████
137.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  151
   1 ms | ██████  113
   2 ms | █  22
   3 ms |   6
   4 ms |   2
   5 ms |   3
   6 ms | █  22
   7 ms | ████████████████  322
   8 ms | ████████████████████████████████████████  812
   9 ms | ████████  159
  10 ms | ██  32
  11 ms | █  12
  12 ms |   6
  13 ms |   5
  14 ms | █  19
  15 ms | ███  56
  16 ms | ████  80
  17 ms | ████  85
  18 ms | ███  55
  19 ms | ██  34
  20 ms | ██  43
  21 ms | █  28
  22 ms | █  12
  23 ms |   10
  24 ms |   4
  25 ms |   6
  26 ms |   2
  27 ms |   2
  29 ms |   1
  31 ms |   1
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `105.29`
- `part` = `1.00`
- `fps_0p1pct_low` = `29.51`
- `seed` = `7481.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `5.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-17.00`
- `entity_count_sample_start` = `22.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `38.26`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24701 ms  |  Sample ticks: 400

**FPS**  avg `113.31`, min `32.02`, p50 `118.50`, p95 `141.96`, p99 `407.64`, 1%low `38.15`, 0.1%low `32.85`, std `81.55`

**Frame time (ms)**  avg `10.69`, p50 `8.44`, p95 `20.58`, p99 `23.82`, p99.9 `29.17`, max `31.23`

**Client tick (ms)**  avg `0.32`, p95 `0.46`, max `1.55`

**Memory**  start `2358 MB`, end `1378 MB`, peak `2358 MB`, GC `25 events / 203 ms`

**FPS over sampling window (ASCII):**

```
159.7 |                                                                         █      
154.3 |    █                                                 █                  █      
148.8 |    █                               █                 █                  █      
143.4 |    █            █           █      █                 █            █     █      
138.0 |    ██           █       █   █      █                 █          █ █     █      
132.6 |  █ ██           █       █   █      █                 █          █ █     █      
127.2 |  █ ██           █       █   █      █        █        █          █ █     █      
121.8 |  █ ██    █      █  █    █   █      █   █  █ █        █          █ ██    █      
116.4 |  █ ██    █  █   █  █    █   █     ██   █  █ █        █ ██       █ ██    █     █
110.9 |  ████ █  █ ██ █ █  █ █  █ █ ██ █  ██   █ ██ ██  █  █ █ ██ █   █ ████    █     █
105.5 |████████ █████████ ████ ███████████████ ███████  ██████████████████████ ██████ █
100.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms |   9
   2 ms | █  12
   3 ms |   3
   4 ms |   4
   5 ms |   5
   6 ms | ██  47
   7 ms | ██████████████████  347
   8 ms | ████████████████████████████████████████  763
   9 ms | ████████  157
  10 ms | ███  62
  11 ms | █  14
  12 ms |   2
  13 ms |   2
  14 ms | █  14
  15 ms | ██  29
  16 ms | ████  83
  17 ms | ████  78
  18 ms | ████  77
  19 ms | ██  47
  20 ms | ██  32
  21 ms | █  24
  22 ms | █  25
  23 ms | █  11
  24 ms |   7
  25 ms |   3
  26 ms |   3
  28 ms |   1
  29 ms |   3
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `93.55`
- `part` = `1.00`
- `fps_0p1pct_low` = `32.85`
- `seed` = `7487.00`
- `preload_duration_ms` = `1649.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-79.00`
- `entity_count_sample_start` = `80.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `38.15`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `114.05`, min `32.24`, p50 `117.95`, p95 `136.24`, p99 `611.29`, 1%low `40.13`, 0.1%low `34.22`, std `85.83`

**Frame time (ms)**  avg `10.58`, p50 `8.48`, p95 `19.87`, p99 `23.32`, p99.9 `26.51`, max `31.02`

**Client tick (ms)**  avg `0.41`, p95 `0.60`, max `0.94`

**Memory**  start `2055 MB`, end `1650 MB`, peak `2336 MB`, GC `24 events / 171 ms`

**FPS over sampling window (ASCII):**

```
165.5 |                                                    █                           
159.5 |                                                    █                           
153.5 |       █                             █              █                           
147.5 | █     █                             █              █       █                   
141.5 | █     █       █                   █ █        █     █       █                   
135.5 | █     █       █                   █ █        █     █       █   █ █             
129.5 | █     █       █  █   █  █         █ █      █ █     █       █   █ █   █         
123.5 | █     █       █  █   ██ █         █ █      █ █  █  █       █   █ ███ █         
117.5 | ██    █       █ ██   ██ █       █ █ █      █ █  █  █       █   █ ███ █         
111.5 |███ █  █    █  █████  ████    █  █ █ █      █ █  █ ██    █  █   █ ███ ██   █ █  
105.5 |████████████████████████████  ███████████ █ ███████████  █ ███████████████████ █
 99.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms | █  19
   3 ms |   3
   4 ms |   2
   5 ms |   2
   6 ms | █  18
   7 ms | ██████████████  309
   8 ms | ████████████████████████████████████████  906
   9 ms | ████████  170
  10 ms |   10
  11 ms |   5
  12 ms |   2
  13 ms |   4
  14 ms | █  13
  15 ms | ██  44
  16 ms | ███  74
  17 ms | ████  101
  18 ms | ███  69
  19 ms | ██  44
  20 ms | █  26
  21 ms | █  24
  22 ms | █  17
  23 ms |   10
  24 ms |   8
  25 ms |   2
  26 ms |   1
  27 ms |   1
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `94.51`
- `part` = `1.00`
- `fps_0p1pct_low` = `34.22`
- `seed` = `7499.00`
- `preload_duration_ms` = `52.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-26.00`
- `entity_count_sample_start` = `30.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `40.13`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23323 ms  |  Sample ticks: 400

**FPS**  avg `108.87`, min `19.09`, p50 `116.44`, p95 `133.18`, p99 `610.08`, 1%low `21.17`, 0.1%low `19.30`, std `97.97`

**Frame time (ms)**  avg `12.55`, p50 `8.59`, p95 `33.42`, p99 `43.01`, p99.9 `50.78`, max `52.38`

**Client tick (ms)**  avg `0.31`, p95 `0.41`, max `1.01`

**Memory**  start `2225 MB`, end `2303 MB`, peak `2303 MB`, GC `22 events / 178 ms`

**FPS over sampling window (ASCII):**

```
175.6 |█     █                                                                         
162.2 |█     █                     █ █          █                                      
148.9 |█    ██               █  █  █ █    █     █           █                          
135.5 |█    ██ ██            █  █  █ █    █  █  █   █       █ █            █       █   
122.1 |█    ██ ██       █    █  █  █ █    █  █  ██  █       █ █        █   █       █   
108.8 |███████████████ ████ ███████████████ ██████████ ████ ████████████████████████   
 95.4 |█████████████████████████████████████████████████████████████████████████████   
 82.1 |█████████████████████████████████████████████████████████████████████████████   
 68.7 |█████████████████████████████████████████████████████████████████████████████   
 55.4 |██████████████████████████████████████████████████████████████████████████████  
 42.0 |██████████████████████████████████████████████████████████████████████████████  
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms | █  15
   2 ms |   1
   3 ms |   1
   5 ms |   4
   6 ms | █  12
   7 ms | ██████████████  246
   8 ms | ████████████████████████████████████████  719
   9 ms | ██████  109
  10 ms | █  11
  11 ms |   6
  12 ms |   2
  13 ms |   2
  14 ms | █  11
  15 ms | ██  35
  16 ms | ████  67
  17 ms | ████  80
  18 ms | ██  41
  19 ms | █  26
  20 ms | ██  28
  21 ms | ██  28
  22 ms | █  12
  23 ms |   5
  24 ms |   1
  25 ms |   2
  26 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   1
  31 ms |   3
  32 ms | █  20
  33 ms | ██  36
  34 ms | █  13
  35 ms |   3
  36 ms |   4
  38 ms |   8
  39 ms |   3
  40 ms |   2
  41 ms |   7
  42 ms |   5
  43 ms |   2
  44 ms |   1
  45 ms |   3
  46 ms |   2
  47 ms |   2
  48 ms |   1
  49 ms |   2
  50 ms |   1
  51 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `79.67`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.30`
- `seed` = `7507.00`
- `preload_duration_ms` = `258.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.09`
- `fps_1pct_low` = `21.17`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `28.35`, min `15.31`, p50 `29.26`, p95 `31.69`, p99 `57.08`, 1%low `16.36`, 0.1%low `15.31`, std `6.01`

**Frame time (ms)**  avg `36.51`, p50 `34.18`, p95 `46.25`, p99 `56.13`, p99.9 `64.60`, max `65.33`

**Client tick (ms)**  avg `0.33`, p95 `0.46`, max `1.48`

**Memory**  start `2043 MB`, end `2304 MB`, peak `2343 MB`, GC `22 events / 182 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |                                                              █                 
 32.4 |                                          █                   █                █
 31.8 |                                  █       █                   █        █    █  █
 31.1 |                        █         █       █                   █        █ █  █  █
 30.5 |              ██      █ ██        █       █                   █       ██ █  █  █
 29.8 |              ██      █ ███       █       █             █     █ █     ██ █  █  █
 29.2 |              ██ █    █ ███      ██       █ █           █     █ █     ██ █  █  █
 28.5 |█   █  █ █    ██ █  █ █ ███      ██ █     █ █    █    █ █ █   █ █   █ ██ █  █  █
 27.8 |█   ██ █ ████ ██ ██ █ █████  ██  ████  █ ██ █ █  █ █ ██████ █ ████ ██ ██ █ ███ █
 27.2 |█ ████ ██████████████████████████████████████ ████ ██████████ ███████ ████████ █
 26.5 |█████████████████████████████████████████████ ███████████████ ██████████████████
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | █  2
  16 ms | █  3
  17 ms |   1
  18 ms | █  2
  19 ms | █  4
  20 ms | █  3
  21 ms | █  3
  22 ms |   1
  30 ms | █  3
  31 ms | █████████  28
  32 ms | █████████████████████████████  87
  33 ms | ████████████████████████████████████████  118
  34 ms | ███████████████████  57
  35 ms | ███████  21
  36 ms | ████  13
  37 ms | █████  15
  38 ms | ████  13
  39 ms | ███████  21
  40 ms | █████  16
  41 ms | ████████  23
  42 ms | ████████  23
  43 ms | ████████  23
  44 ms | ███████  20
  45 ms | ██████  19
  46 ms | █  4
  47 ms | ██  7
  48 ms | █  3
  49 ms | █  3
  50 ms |   1
  51 ms |   1
  52 ms |   1
  53 ms | █  2
  54 ms |   1
  57 ms | █  2
  58 ms |   1
  59 ms |   1
  64 ms |   1
  65 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.39`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.31`
- `seed` = `7517.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-20.00`
- `entity_count_sample_start` = `21.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `16.36`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `28.35`, min `17.62`, p50 `29.41`, p95 `31.83`, p99 `48.11`, 1%low `19.01`, 0.1%low `17.62`, std `5.04`

**Frame time (ms)**  avg `36.25`, p50 `34.00`, p95 `46.27`, p99 `50.16`, p99.9 `54.81`, max `56.74`

**Client tick (ms)**  avg `0.32`, p95 `0.47`, max `0.78`

**Memory**  start `1492 MB`, end `2050 MB`, peak `2340 MB`, GC `21 events / 167 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |       █                           █                                            
 32.8 |       █                           █                                            
 32.2 |       █                           █                                            
 31.5 |       █                           █                                            
 30.9 |       █        █        █      █  █ █  █ █          █        █                 
 30.2 |       █        █        ██     █  █ █  █ █    █     █        █              █  
 29.5 |       █        █        ██     █  █ █  █ █    █     █        ██    █        █ █
 28.9 |       ██       █    █   ██     █  █ █  █ ██   █     █ █    █ ██ █  █    ██  █ █
 28.2 |█ █  █ ██ ██    █  █ ██ ███ █ █ █  ████ █ ██ █ ██  █ █ ██   ████ █  █ ██ ██ ████
 27.6 |███ ██ ██ ██████████ ██ █████ ████ █████████ █████ █ █ ███ █████ █ █████ ███████
 26.9 |█████████████████████████████ ██████████████████████████████████ █ █████████████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  3
  20 ms | █  3
  21 ms | ███  9
  22 ms | █  3
  23 ms |   1
  24 ms |   1
  29 ms |   1
  30 ms | █  2
  31 ms | ███████  22
  32 ms | ██████████████████████████████  98
  33 ms | ████████████████████████████████████████  132
  34 ms | ██████████████  47
  35 ms | ████████  25
  36 ms | ███  9
  37 ms | ████  14
  38 ms | ███  11
  39 ms | ███████  22
  40 ms | ██████  20
  41 ms | █████████  29
  42 ms | █████  18
  43 ms | ████  12
  44 ms | ████  14
  45 ms | ███████  23
  46 ms | ███  11
  47 ms | ███  11
  48 ms | █  2
  49 ms |   1
  50 ms | █  3
  51 ms |   1
  53 ms | █  2
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `27.59`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.62`
- `seed` = `7523.00`
- `preload_duration_ms` = `73.00`
- `entity_count_sample_end` = `13.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-22.00`
- `entity_count_sample_start` = `35.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `19.01`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `28.22`, min `16.32`, p50 `29.66`, p95 `31.29`, p99 `47.33`, 1%low `18.30`, 0.1%low `16.32`, std `4.61`

**Frame time (ms)**  avg `36.27`, p50 `33.71`, p95 `44.51`, p99 `47.01`, p99.9 `61.00`, max `61.29`

**Client tick (ms)**  avg `0.26`, p95 `0.32`, max `0.58`

**Memory**  start `1991 MB`, end `1623 MB`, peak `2299 MB`, GC `5 events / 68 ms`

**FPS over sampling window (ASCII):**

```
 34.2 |       █                                                                        
 33.4 |       █                                                                       █
 32.6 |       █                                                                       █
 31.8 |       █                                   █                                   █
 31.0 |       █           █    █                  █                                   █
 30.2 | █     ██          █    █  █           █   █       █     █                █    █
 29.4 | █     ██  █     █ █    █  █           █   █       █     █                █    █
 28.6 | ██    ██  █ █  ██ █  █ █  ██   █  █   █ █ ██     ██     ██  █   ██       █    █
 27.8 |███  █ ████████ ████ ██ ██ ██ █ █████ ████ ███ █ █████ █ ██ ██ █ ██ ██ █ █████ █
 27.0 |██████ ████████ ████████████████████████████████████████████████████████ █████ █
 26.2 |██████ ████████ ████████████████████████████████████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  20 ms |   2
  21 ms | █  5
  22 ms | █  5
  23 ms | █  3
  28 ms |   1
  30 ms |   1
  31 ms | ██  9
  32 ms | ████████████  68
  33 ms | ████████████████████████████████████████  218
  34 ms | ████  20
  35 ms | █  8
  36 ms | █  5
  37 ms | ██  9
  38 ms | ██  11
  39 ms | ████  20
  40 ms | █████  25
  41 ms | ████████  43
  42 ms | ██████  34
  43 ms | ████  24
  44 ms | ███  15
  45 ms | █  7
  46 ms | ██  10
  47 ms |   1
  48 ms |   1
  53 ms |   1
  56 ms |   1
  60 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `18.30`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `69.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `16.32`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.57`
- `entity_count_delta` = `0.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `30.54`, min `12.39`, p50 `28.96`, p95 `50.59`, p99 `66.45`, 1%low `15.68`, 0.1%low `12.39`, std `11.09`

**Frame time (ms)**  avg `36.38`, p50 `34.54`, p95 `54.68`, p99 `58.40`, p99.9 `71.10`, max `80.71`

**Client tick (ms)**  avg `3.00`, p95 `3.68`, max `11.83`

**Memory**  start `2290 MB`, end `1169 MB`, peak `2339 MB`, GC `6 events / 79 ms`

**FPS over sampling window (ASCII):**

```
 43.3 |                                              █                                 
 41.8 |                                              █                                 
 40.3 |                  █                           █                                 
 38.7 |  █               █                           █                                 
 37.2 |  █               █                           █                                 
 35.6 |  █               █                           █                                 
 34.1 |█ █  █            █  ██         █     █  █    █          █                      
 32.5 |█ ██ █    █   █   ██ ██ █    █  ██    ██ █    █          █      █        █  █  █
 31.0 |████ ██   ███ ██  ██ ██ █  █ ██ ███ █ ██ █   ████   █    █  █   █   █   ██  █  █
 29.4 |████ ███████████████ █████ ████ █████ ██ ████████ █ ██ ███████ ████ ██ ████ ██ █
 27.9 |████ ██████████████████████████████████████████████████████████████████████ ████
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | █  1
  12 ms | █  1
  13 ms | █  1
  14 ms | ██  3
  15 ms | █  1
  16 ms | █  1
  17 ms | █████  7
  18 ms | █████  7
  19 ms | ███████  9
  20 ms | █████████  12
  21 ms | █████████████  17
  22 ms | ███████  9
  23 ms | ████████████  16
  24 ms | ██████████████████  24
  25 ms | ██████  8
  26 ms | ████  5
  27 ms | █████  6
  28 ms | ██  2
  29 ms | ████████  11
  30 ms | ██████████████████████████████  39
  31 ms | ████████████  16
  32 ms | █████████████  17
  33 ms | ████████████████████████████████████████  52
  34 ms | ███████████  14
  35 ms | █████████████████  22
  36 ms | ██████████████████  23
  37 ms | █████████  12
  38 ms | ██  3
  39 ms | █████  6
  40 ms | ███████████  14
  41 ms | ███████  9
  42 ms | ████████████  16
  43 ms | █████████████  17
  44 ms | ████  5
  45 ms | ███████████████  19
  46 ms | █████████████  17
  47 ms | ████████████  15
  48 ms | █████  7
  49 ms | ████████  11
  50 ms | ████████  10
  51 ms | ████████████  16
  52 ms | ██  3
  53 ms | ████████  10
  54 ms | ███████  9
  55 ms | █████  6
  56 ms | █████  7
  57 ms | ███  4
  58 ms | █████  6
  60 ms | █  1
  61 ms | █  1
  63 ms | █  1
  80 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `15.68`
- `fps_0p1pct_low` = `12.39`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.48`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `70.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23071 ms  |  Sample ticks: 400

**FPS**  avg `29.14`, min `11.80`, p50 `29.60`, p95 `47.27`, p99 `49.30`, 1%low `18.19`, 0.1%low `11.80`, std `7.24`

**Frame time (ms)**  avg `35.81`, p50 `33.78`, p95 `45.86`, p99 `46.71`, p99.9 `68.60`, max `84.76`

**Client tick (ms)**  avg `0.27`, p95 `0.32`, max `0.39`

**Memory**  start `1247 MB`, end `2013 MB`, peak `2394 MB`, GC `4 events / 47 ms`

**FPS over sampling window (ASCII):**

```
 37.9 |         █                 █                                                    
 36.7 |         █                 █                                                    
 35.6 |         █                 █                                                    
 34.4 |         █                 █                               █                    
 33.3 |         █                 █     █                         █                    
 32.1 |         █ █               █     █                      █  █  █  █              
 30.9 |  █    ███ █               █     █         █         █  █  █  █  █  █          █
 29.8 |  █ ██ ███ █ ██           ██     █  █   █  ██      █ █  ██ █  █  ██ █    █ █   █
 28.6 |███ ██████ ████ ████     ████ █  █  █ █ ████████ ██████ ██ ██ ██ ██ ██   ███  ██
 27.5 |██████████████████████ █████████ ██ ███ ███████████████ ██ █████ ███████ ███████
 26.3 |████████████████████████████████████████████████████████████████████████ ███████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  10 ms |   1
  11 ms |   1
  19 ms |   1
  20 ms | ████  21
  21 ms | ███  17
  22 ms |   1
  28 ms |   1
  30 ms |   2
  31 ms | █  7
  32 ms | ████████  41
  33 ms | ████████████████████████████████████████  216
  34 ms | █████  27
  35 ms | ███  16
  36 ms | ██  10
  37 ms | ███  15
  38 ms | ███  18
  39 ms | ███  16
  40 ms | ████  19
  41 ms | ██  13
  42 ms | ████  19
  43 ms | ███  15
  44 ms | █████  28
  45 ms | ██████  32
  46 ms | ███  17
  47 ms |   1
  48 ms |   1
  55 ms |   1
  84 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.92`
- `part` = `1.00`
- `fps_0p1pct_low` = `11.80`
- `seed` = `9043.00`
- `preload_duration_ms` = `67.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `18.19`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3145.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `28.88`, min `16.04`, p50 `29.69`, p95 `36.46`, p99 `48.92`, 1%low `19.16`, 0.1%low `16.04`, std `5.45`

**Frame time (ms)**  avg `35.65`, p50 `33.68`, p95 `45.94`, p99 `47.68`, p99.9 `59.01`, max `62.35`

**Client tick (ms)**  avg `0.27`, p95 `0.33`, max `0.64`

**Memory**  start `2225 MB`, end `1517 MB`, peak `2380 MB`, GC `5 events / 70 ms`

**FPS over sampling window (ASCII):**

```
 34.1 |        █                                                                       
 33.4 |        █                                                                       
 32.6 |        █                                      █                                
 31.9 |        █                                      █                         █      
 31.1 |        █  █   █                               █           █             █      
 30.4 |        █  █████ █               █   ██        █           █        ██   █  █ █ 
 29.6 |   █    █  █████ █  █     █   █ ██   ██   ██ █ █      █  █ █        ██   ██ █ ██
 28.8 | ███    █  █████████████████  █ ██ ████  ███ █ █      █  █ █        ████ ███████
 28.1 |███████ █  █████████████████████████████ ███ █ █ █  █ █ ████ █  ████████ ███████
 27.3 |███████ █  █████████████████████████████████ █ █ ████ ██████ ███████████████████
 26.6 |███████ ████████████████████████████████████████████████████████████████████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  18 ms |   1
  19 ms |   1
  20 ms | ██  12
  21 ms | █  7
  22 ms | █  4
  25 ms |   1
  26 ms |   1
  27 ms |   1
  29 ms |   2
  30 ms | █  5
  31 ms | ██  11
  32 ms | ████████  48
  33 ms | ████████████████████████████████████████  241
  34 ms | ████  27
  35 ms | ███  20
  36 ms | ██  10
  37 ms | █  9
  38 ms | ██  13
  39 ms | ███  16
  40 ms | ███  19
  41 ms | ███  16
  42 ms | ███  17
  43 ms | ███  17
  44 ms | ███  17
  45 ms | ███  17
  46 ms | ██  15
  47 ms | █  7
  48 ms |   2
  50 ms |   1
  56 ms |   1
  62 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `19.16`
- `fps_harmonic_avg` = `28.05`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `16.04`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `75.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `28.74`, min `19.08`, p50 `29.71`, p95 `31.30`, p99 `49.37`, 1%low `20.34`, 0.1%low `19.08`, std `4.60`

**Frame time (ms)**  avg `35.56`, p50 `33.66`, p95 `45.69`, p99 `46.96`, p99.9 `51.44`, max `52.41`

**Client tick (ms)**  avg `0.25`, p95 `0.30`, max `0.63`

**Memory**  start `1348 MB`, end `1717 MB`, peak `2368 MB`, GC `4 events / 47 ms`

**FPS over sampling window (ASCII):**

```
 32.2 |                    █                                                           
 31.6 |           █        █          █                          █                     
 31.0 |█          █        █          █          █               █                     
 30.3 |█       █  █  █     ██       █ █     █   ██ █             █                     
 29.7 |██      █  ██ █     ██    █ ██ █   █ █   ██ █             █                   █ 
 29.1 |██      █  ██ █  █  ██ █ ██ ██ █████ █ █ ██████████  █  ████████             ███
 28.4 |██  █   █  ██ █  █  ████ ██ ██ ███████████████████████  ████████████   ██ ██ ███
 27.8 |██ ██   ██ ██ █ ███ ████ ██ ██████████████████████████ █████████████  ██████ ███
 27.2 |█████  ███ ██ ██████████████████████████████████████████████████████ ███████████
 26.6 |██████ ███ █████████████████████████████████████████████████████████████████████
 25.9 |██████████ █████████████████████████████████████████████████████████████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   2
  20 ms | █  7
  21 ms | █  6
  22 ms |   1
  29 ms |   1
  30 ms |   2
  31 ms | █  9
  32 ms | ███████  46
  33 ms | ████████████████████████████████████████  279
  34 ms | █████  38
  35 ms | ██  11
  36 ms | ██  11
  37 ms | ██  15
  38 ms | █  7
  39 ms | ██  15
  40 ms | ██  12
  41 ms | ██  16
  42 ms | ██  11
  43 ms | ██  13
  44 ms | ██  15
  45 ms | ███  23
  46 ms | ██  15
  47 ms |   2
  48 ms |   2
  50 ms |   1
  52 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.34`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `28.12`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `0.00`
- `fps_0p1pct_low` = `19.08`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `31.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `29.58`, min `14.90`, p50 `29.63`, p95 `46.31`, p99 `52.14`, 1%low `18.82`, 0.1%low `14.90`, std `18.28`

**Frame time (ms)**  avg `35.81`, p50 `33.74`, p95 `46.02`, p99 `48.16`, p99.9 `59.82`, max `67.13`

**Client tick (ms)**  avg `0.28`, p95 `0.35`, max `3.29`

**Memory**  start `2041 MB`, end `1799 MB`, peak `2369 MB`, GC `5 events / 70 ms`

**FPS over sampling window (ASCII):**

```
 94.6 |                █                                                               
 88.1 |                █                                                               
 81.7 |                █                                                               
 75.3 |                █                                                               
 68.9 |                █                                                               
 62.4 |                █                                                               
 56.0 |                █                                                               
 49.6 |                █                                                               
 43.2 |                █                                                               
 36.8 |  █             █                                                               
 30.3 |█ ███████████ ████ ██████ ███████████ ██ ███ █████████ █████████████ ██████████ 
 23.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
  14 ms |   1
  16 ms |   2
  18 ms |   2
  19 ms | █  6
  20 ms | ██  8
  21 ms | ██  10
  29 ms |   2
  30 ms |   2
  31 ms | █  6
  32 ms | █████████████  66
  33 ms | ████████████████████████████████████████  210
  34 ms | ████████  41
  35 ms | ██  12
  36 ms | ██  12
  37 ms | ███  16
  38 ms | ██  13
  39 ms | ██  11
  40 ms | ██  12
  41 ms | ██  11
  42 ms | ███  16
  43 ms | ████  20
  44 ms | ████  21
  45 ms | █████  28
  46 ms | ███  14
  47 ms | █  7
  48 ms | █  4
  49 ms |   1
  52 ms |   1
  54 ms |   1
  67 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.92`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `14.90`
- `seed` = `8053.00`
- `preload_duration_ms` = `74.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `18.82`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194346 ms  |  Sample ticks: 3600

**FPS**  avg `30.08`, min `15.77`, p50 `29.53`, p95 `47.92`, p99 `53.24`, 1%low `17.12`, 0.1%low `16.14`, std `9.91`

**Frame time (ms)**  avg `36.31`, p50 `33.87`, p95 `54.18`, p99 `57.10`, p99.9 `59.67`, max `63.42`

**Client tick (ms)**  avg `0.77`, p95 `1.04`, max `5.26`

**Memory**  start `1135 MB`, end `2055 MB`, peak `2313 MB`, GC `16 events / 108 ms`

**FPS over sampling window (ASCII):**

```
 32.4 |          █                                                                     
 32.1 |          █                                                                     
 31.8 |          █                 █  █                  █                             
 31.4 |          █                 ██ █                  █                             
 31.1 |          █ █        █      ██ █                  █                           █ 
 30.8 |       █  █ █        █      ██ █          █       █                           █ 
 30.5 |       ██ █ █        █  █   ██ ██  █      █       █                       █   ██
 30.1 |  ███  ████ █  █ █████  █  ███ █████ █ █████ ██  ██   █                   █ ████
 29.8 |█████ █████ ███████████ █ █████████████████████████████████ █       ███   █ ████
 29.5 |███████████ ██████████████████████████████████████████████████ ████ ███ ████████
 29.2 |███████████████████████████████████████████████████████████████████ ████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms |   2
   8 ms |   3
   9 ms |   5
  10 ms |   1
  14 ms |   1
  15 ms |   2
  16 ms |   4
  17 ms | █  11
  18 ms | ██  31
  19 ms | ████  70
  20 ms | ████████  146
  21 ms | ███████████████  276
  22 ms | █████████████  243
  23 ms | █████  90
  24 ms | ██  33
  25 ms | ██  38
  26 ms | █  16
  27 ms | █  11
  28 ms |   1
  29 ms | █  10
  30 ms | █  17
  31 ms | ███████  128
  32 ms | █████████████████████████████████████  688
  33 ms | ████████████████████████████████████████  738
  34 ms | █████████████████████  388
  35 ms | ██  44
  36 ms | █  18
  37 ms | █  14
  38 ms | █  12
  39 ms | ██  40
  40 ms | ██████  112
  41 ms | ████████████  228
  42 ms | ██████████████  261
  43 ms | █████████  168
  44 ms | ███████  132
  45 ms | █████  89
  46 ms | ████  73
  47 ms | ███  47
  48 ms | ███  54
  49 ms | ████  70
  50 ms | █████  88
  51 ms | █████  89
  52 ms | ████  82
  53 ms | ███████  125
  54 ms | █████  87
  55 ms | ████  68
  56 ms | ███  50
  57 ms | ██  28
  58 ms | █  15
  59 ms |   6
  60 ms |   1
  61 ms |   1
  62 ms |   2
  63 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `125.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `27.54`
- `fps_1pct_low` = `17.12`
- `blocks_placed` = `314075.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `13.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `76.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `16.14`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194383 ms  |  Sample ticks: 3600

**FPS**  avg `87.30`, min `7.88`, p50 `108.21`, p95 `150.80`, p99 `305.95`, 1%low `8.86`, 0.1%low `8.09`, std `57.89`

**Frame time (ms)**  avg `22.65`, p50 `9.24`, p95 `99.06`, p99 `106.42`, p99.9 `121.88`, max `126.83`

**Client tick (ms)**  avg `0.72`, p95 `0.97`, max `1.88`

**Memory**  start `1054 MB`, end `1893 MB`, peak `2420 MB`, GC `15 events / 115 ms`

**FPS over sampling window (ASCII):**

```
122.3 |                         ███                   ██ █  ███  █ █      █ █          
112.1 |                      ███████████████████████████████████████████████████████   
101.9 |                      ███████████████████████████████████████████████████████   
 91.7 |                      ████████████████████████████████████████████████████████  
 81.4 |                      ████████████████████████████████████████████████████████  
 71.2 |                      ████████████████████████████████████████████████████████  
 61.0 |                      ████████████████████████████████████████████████████████  
 50.7 |                      ████████████████████████████████████████████████████████  
 40.5 |                      ████████████████████████████████████████████████████████  
 30.3 |████████████████      ██████████████████████████████████████████████████████████
 20.1 |█████████████████    ███████████████████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  54
   3 ms | ██  81
   4 ms | █  57
   5 ms | ██  81
   6 ms | ██████  306
   7 ms | ██████████████████  986
   8 ms | ████████████████████████████████████████  2136
   9 ms | ████████████  655
  10 ms | █  56
  11 ms |   14
  12 ms |   1
  13 ms |   4
  14 ms |   3
  15 ms |   19
  16 ms | █  69
  17 ms | ██  87
  18 ms | ███  162
  19 ms | █████  265
  20 ms | ████  233
  21 ms | ███  153
  22 ms | ███  135
  23 ms | ██  113
  24 ms | █  49
  25 ms | █  28
  26 ms |   12
  27 ms |   8
  28 ms |   5
  29 ms |   4
  30 ms |   11
  31 ms | █  67
  32 ms | █████  272
  33 ms | ██████  328
  34 ms | ███  175
  35 ms | █  39
  36 ms |   16
  37 ms |   14
  38 ms |   12
  39 ms |   14
  40 ms |   22
  41 ms | █  66
  42 ms | ██  100
  43 ms | ██  83
  44 ms | █  47
  45 ms | █  45
  46 ms | █  35
  47 ms |   23
  48 ms | █  30
  49 ms | █  39
  50 ms | █  35
  51 ms | █  46
  52 ms | █  41
  53 ms | █  40
  54 ms | █  30
  55 ms |   18
  56 ms |   10
  57 ms |   3
  58 ms |   4
  60 ms |   1
  62 ms |   1
  69 ms |   1
  89 ms |   2
  90 ms |   3
  91 ms |   6
  93 ms |   3
  94 ms |   3
  95 ms |   7
  96 ms |   11
  97 ms |   15
  98 ms | █  45
  99 ms | ██  121
 100 ms | ██  121
 101 ms | █  56
 102 ms |   9
 103 ms |   9
 104 ms |   4
 105 ms |   4
 106 ms |   13
 107 ms |   9
 108 ms |   6
 109 ms |   5
 110 ms |   7
 111 ms |   5
 112 ms |   5
 113 ms |   7
 114 ms |   3
 115 ms |   1
 116 ms |   4
 118 ms |   1
 119 ms |   2
 120 ms |   3
 121 ms |   3
 122 ms |   4
 123 ms |   2
 124 ms |   1
 126 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `125.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `44.14`
- `fps_1pct_low` = `8.86`
- `blocks_placed` = `314075.00`
- `entity_count_sample_end` = `92.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `16.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `76.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `8.09`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194156 ms  |  Sample ticks: 3600

**FPS**  avg `30.38`, min `15.52`, p50 `29.58`, p95 `48.66`, p99 `52.72`, 1%low `17.00`, 0.1%low `15.95`, std `10.76`

**Frame time (ms)**  avg `36.29`, p50 `33.80`, p95 `54.64`, p99 `57.43`, p99.9 `60.39`, max `64.43`

**Client tick (ms)**  avg `0.74`, p95 `1.02`, max `2.09`

**Memory**  start `1419 MB`, end `1136 MB`, peak `2440 MB`, GC `15 events / 145 ms`

**FPS over sampling window (ASCII):**

```
 32.2 |                                          █                                     
 31.9 |          █                               █     █                               
 31.7 |          █       █     █                 █     █                               
 31.4 |   █  █ █ █       █     █                 █     █                               
 31.2 |   █  █ █ █       █     █                 █     █                               
 30.9 |   █  █ █ █      ██     █     █   █      ██   █ █     █    █ █                  
 30.6 |   █  █ █ █  █   ██ ██  █     ██  █   █  ██   █ █     █   ██ ██      ███     █  
 30.4 | █ █ ██ ███  ██ ███ ██ ██ █   ██ ██  ███ ██  ██ █     █   █████ █    ████  █ █ █
 30.1 |██ █ ██████ ███████ ██ ██ ██ ██████  ██████  ██ ████ ██ █ █████ █ ██ ████ ██ ███
 29.9 |███████████████████ █████ ██ ███████████████ ██ ████ ██ ████████████████████ ███
 29.6 |████████████████████████████████████████████████████ ██ ████████████████████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   1
   7 ms |   2
   8 ms |   6
   9 ms |   4
  10 ms |   3
  12 ms |   1
  13 ms |   2
  14 ms |   3
  15 ms |   2
  16 ms |   6
  17 ms |   7
  18 ms | █  18
  19 ms | █████  96
  20 ms | ██████████  197
  21 ms | ████████████████  317
  22 ms | ███████████  211
  23 ms | ████  75
  24 ms | ██  38
  25 ms | ██  48
  26 ms | ██  40
  27 ms | █  11
  28 ms |   2
  29 ms |   4
  30 ms | █  14
  31 ms | █████  87
  32 ms | █████████████████████████████████  633
  33 ms | ████████████████████████████████████████  769
  34 ms | ██████████████████  346
  35 ms | ███  60
  36 ms | █  11
  37 ms |   6
  38 ms | █  11
  39 ms | █  19
  40 ms | ███  55
  41 ms | █████████  165
  42 ms | ████████████  234
  43 ms | ████████████  226
  44 ms | █████████  164
  45 ms | ██████  117
  46 ms | ████  82
  47 ms | ████  82
  48 ms | ████  70
  49 ms | ████  68
  50 ms | ████  69
  51 ms | █████  88
  52 ms | ████  81
  53 ms | █████  97
  54 ms | █████  95
  55 ms | █████  90
  56 ms | ███  62
  57 ms | ██  36
  58 ms | █  16
  59 ms |   6
  60 ms |   3
  61 ms |   2
  62 ms |   1
  63 ms |   1
  64 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `125.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `27.56`
- `fps_1pct_low` = `17.00`
- `blocks_placed` = `314075.00`
- `entity_count_sample_end` = `93.00`
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
- `entity_count_sample_start` = `72.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `15.95`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194723 ms  |  Sample ticks: 3600

**FPS**  avg `31.34`, min `15.15`, p50 `29.79`, p95 `48.30`, p99 `55.43`, 1%low `16.90`, 0.1%low `15.68`, std `12.31`

**Frame time (ms)**  avg `35.51`, p50 `33.57`, p95 `51.53`, p99 `57.67`, p99.9 `60.81`, max `66.01`

**Client tick (ms)**  avg `0.76`, p95 `1.00`, max `2.86`

**Memory**  start `1166 MB`, end `2143 MB`, peak `2459 MB`, GC `15 events / 91 ms`

**FPS over sampling window (ASCII):**

```
 37.3 |                       █                                                        
 36.6 |                       █                                                        
 35.9 |                       █                                                        
 35.2 |                       █                                                        
 34.5 |                       █                                                        
 33.8 |                       █              █               █                         
 33.1 |      ██             █ █ ██          ██ ██   █        █                         
 32.4 |      ███     ████   █ █ ███ █  █  █ ██ ██   █ █      █  █                      
 31.7 |      ████ ██ ████   ███████ ██ ██ █ ██ ██   █ █     ██  █      █     █         
 31.0 |  █  ██████████████████████████████████ ████ ███   ████ ██ █   ██ █ █ █         
 30.3 |█████████████████████████████████████████████████  ███████ ██████ █████ █ ██████
 29.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   1
   7 ms | █  9
   8 ms | █  12
   9 ms | █  12
  10 ms |   5
  11 ms |   6
  12 ms |   1
  16 ms |   1
  17 ms |   3
  18 ms | █  18
  19 ms | ████  55
  20 ms | █████████████  202
  21 ms | ███████████████████  296
  22 ms | ███████████████████  298
  23 ms | ████████████  180
  24 ms | █████  82
  25 ms | ████  58
  26 ms | ███  41
  27 ms | ███  48
  28 ms | ████  58
  29 ms | ████  66
  30 ms | █████  81
  31 ms | ████████  117
  32 ms | ███████████████████████████████  490
  33 ms | ████████████████████████████████████████  624
  34 ms | ███████████████████  298
  35 ms | ███  52
  36 ms | █  9
  37 ms |   2
  38 ms |   3
  39 ms | █  10
  40 ms | ██  24
  41 ms | ███  53
  42 ms | █████  73
  43 ms | ███████████  170
  44 ms | █████████████████  270
  45 ms | ███████████████████  300
  46 ms | █████████████████  264
  47 ms | █████████████  195
  48 ms | █████████  140
  49 ms | ██████  98
  50 ms | ████  56
  51 ms | ███  53
  52 ms | ███  44
  53 ms | ██  34
  54 ms | ██  27
  55 ms | ██  35
  56 ms | ██  26
  57 ms | ██  31
  58 ms | █  20
  59 ms | █  12
  60 ms |   2
  62 ms |   2
  63 ms |   1
  64 ms |   1
  66 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `preload_duration_ms` = `125.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `28.16`
- `fps_1pct_low` = `16.90`
- `blocks_placed` = `314075.00`
- `entity_count_sample_end` = `91.00`
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
- `entity_count_sample_start` = `76.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `15.68`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`

