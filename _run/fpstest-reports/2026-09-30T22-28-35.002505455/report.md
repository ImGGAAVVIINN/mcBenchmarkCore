# MC Benchmark Core session — 2026-09-30T23:04:09.000147305+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `4096 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 106.6 | 37.1 | 23.8 | 23.48 | 0.77 | 15 | 822 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 104.9 | 36.3 | 23.2 | 24.02 | 0.78 | 15 | 1247 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 101.8 | 33.3 | 22.0 | 23.84 | 0.79 | 15 | 1304 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 104.7 | 34.0 | 22.9 | 24.26 | 0.78 | 16 | 762 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 105.1 | 36.7 | 26.7 | 24.13 | 0.73 | 15 | 1450 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 104.3 | 37.0 | 26.9 | 24.23 | 0.54 | 15 | 896 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 105.7 | 35.4 | 24.8 | 23.72 | 0.74 | 11 | 1441 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 104.9 | 37.7 | 28.3 | 23.78 | 1.18 | 10 | 298 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 126.9 | 24.7 | 20.0 | 36.00 | 3.22 | 10 | 1573 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 119.7 | 22.3 | 19.1 | 41.94 | 4.32 | 9 | 1517 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 106.3 | 35.0 | 28.8 | 24.54 | 1.04 | 11 | 330 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 104.8 | 39.3 | 29.0 | 23.32 | 0.51 | 9 | 114 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 130.7 | 25.4 | 22.9 | 37.30 | 3.80 | 8 | 1721 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 122.9 | 25.0 | 20.4 | 36.13 | 2.89 | 6 | 1728 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 137.5 | 17.1 | 13.4 | 51.49 | 15.66 | 6 | 1465 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 126.8 | 17.9 | 13.7 | 48.63 | 16.18 | 6 | 1546 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 109.6 | 29.5 | 21.3 | 27.05 | 1.93 | 10 | 1985 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 111.3 | 32.3 | 23.2 | 25.97 | 1.92 | 9 | 2092 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 104.3 | 39.8 | 37.5 | 23.70 | 0.66 | 9 | 2382 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 103.4 | 39.5 | 33.3 | 23.45 | 0.29 | 9 | 2382 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 100.3 | 40.3 | 34.7 | 22.99 | 0.26 | 9 | 1825 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 101.2 | 37.5 | 27.0 | 23.43 | 0.33 | 9 | 2012 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 107.0 | 37.2 | 24.2 | 23.56 | 0.30 | 11 | 1856 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 104.2 | 28.6 | 20.5 | 27.27 | 0.40 | 17 | 979 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 110.3 | 25.7 | 16.1 | 29.36 | 0.43 | 21 | 2342 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 106.6 | 28.3 | 18.2 | 27.33 | 0.39 | 18 | 1224 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 107.5 | 27.7 | 20.1 | 28.14 | 0.39 | 20 | 996 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 103.6 | 27.8 | 19.9 | 28.30 | 0.39 | 21 | 355 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 104.1 | 24.4 | 18.3 | 30.59 | 0.44 | 22 | 1831 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 113.6 | 28.7 | 18.1 | 27.74 | 0.42 | 21 | 1403 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 109.3 | 27.7 | 20.8 | 28.38 | 0.41 | 26 | 334 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 104.0 | 30.3 | 23.6 | 28.77 | 0.49 | 27 | 595 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 108.0 | 32.1 | 22.3 | 26.59 | 0.34 | 27 | 722 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 105.6 | 23.9 | 16.4 | 29.28 | 0.44 | 32 | 140 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 106.2 | 30.6 | 23.4 | 28.47 | 0.38 | 34 | 969 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 103.0 | 39.9 | 36.6 | 23.78 | 0.29 | 26 | 207 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 110.8 | 21.2 | 17.8 | 41.60 | 4.06 | 23 | 77 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 105.4 | 36.3 | 26.9 | 24.71 | 0.29 | 23 | 194 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 103.8 | 36.3 | 24.0 | 24.89 | 0.30 | 22 | 1028 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 107.1 | 39.6 | 38.0 | 24.56 | 0.32 | 22 | 162 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 104.9 | 39.5 | 36.4 | 24.00 | 0.34 | 21 | 1242 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 97.7 | 16.2 | 4.9 | 42.83 | 0.97 | 406 | 1177 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 100.2 | 20.9 | 14.5 | 43.04 | 0.98 | 551 | 639 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 95.2 | 19.7 | 12.0 | 45.94 | 0.70 | 71 | 736 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 62.9 | 14.1 | 5.8 | 58.24 | 0.76 | 64 | 877 |

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

Category: **Particles**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `106.60`, min `18.37`, p50 `112.84`, p95 `140.69`, p99 `556.84`, 1%low `37.10`, 0.1%low `23.80`, std `79.31`

**Frame time (ms)**  avg `12.06`, p50 `8.86`, p95 `21.07`, p99 `23.48`, p99.9 `28.44`, max `54.44`

**Client tick (ms)**  avg `0.77`, p95 `1.13`, max `15.57`

**Memory**  start `2224 MB`, end `2071 MB`, peak `3046 MB`, GC `15 events / 180 ms`

**FPS over sampling window (ASCII):**

```
151.0 |                                                                          █     
145.2 |                              █                      █                █   █     
139.4 | █                            █                      █                █   █     
133.6 | █                            █                      █         █      █   █     
127.9 | █     █                      █                      █         █   █  █ █ █     
122.1 | █     █      █     █     █ █ █  ██            █     █         ██  █  █ █ █     
116.3 | █   █ █ ██   █     █   █ █████  ██      █   █ █ █  ██      █  ██  █  █ █ █     
110.5 | █   █ █ ███  █     █  ██ █████  ██   █  █   █ █ █  ██      █  ██ ██  █ █ █     
104.7 |██ █ █ █ ███  █  █  █  ████████  ██  ██  █   ███ █  ██      █  █████ ██ █ █     
 98.9 |██ █ █ ██████ █ ███ █  ████████  ██████ ██  ████ █  ██  █ ████ █████ ██ █ █ █  █
 93.1 |███████████████████ █ █████████████████ ███████████████████████████████████ █ ██
 87.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  24
   2 ms | █  21
   3 ms |   2
   5 ms |   3
   6 ms | ██  24
   7 ms | ███████████████  219
   8 ms | ████████████████████████████████████████  572
   9 ms | ███████████  158
  10 ms | █  9
  11 ms |   4
  12 ms |   2
  14 ms |   2
  15 ms | ███  37
  16 ms | ███████  96
  17 ms | ███████████  152
  18 ms | █████████  122
  19 ms | █████  70
  20 ms | ████  56
  21 ms | ███  42
  22 ms | █  21
  23 ms | █  8
  24 ms |   5
  25 ms |   5
  26 ms |   1
  27 ms |   1
  29 ms |   1
  54 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 207 | 108.6 | 23.38 |
| `flame` | 160 | 207 | 105.0 | 21.62 |
| `dripping_water` | 240 | 207 | 113.0 | 22.35 |
| `dragon_breath` | 160 | 207 | 104.9 | 23.57 |
| `end_rod` | 240 | 207 | 102.8 | 21.95 |
| `portal` | 160 | 207 | 103.6 | 22.85 |
| `ALL_TOGETHER` | 1680 | 207 | 114.2 | 24.07 |
| `sculk_charge_pop` | 240 | 207 | 101.2 | 22.99 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `37.10`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `51.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `82.92`
- `fps_0p1pct_low` = `23.80`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `104.85`, min `21.97`, p50 `113.08`, p95 `142.50`, p99 `550.07`, 1%low `36.33`, 0.1%low `23.24`, std `73.21`

**Frame time (ms)**  avg `12.19`, p50 `8.84`, p95 `21.69`, p99 `24.02`, p99.9 `32.29`, max `45.53`

**Client tick (ms)**  avg `0.78`, p95 `1.15`, max `2.15`

**Memory**  start `1712 MB`, end `1867 MB`, peak `2959 MB`, GC `15 events / 138 ms`

**FPS over sampling window (ASCII):**

```
147.0 |                        █                                                       
141.7 |                        █                                                       
136.5 |                        █                                      █                
131.2 |                        █                                      █                
125.9 |                █       ██                  █     █            █                
120.6 |    █           █     █ ██               █  █    ███    █      █    █   █       
115.3 |█   ██          ██    █ ██ █  ██         █  █  █ ███   ██      █    █   █       
110.0 |█   ██          ██   █████ █  ██       █ █  █  █ ███   ███ █   █    █  ██     █ 
104.7 |█   ██          ██   █████ ██ ████  █  █ █  █  █ ███   ███ █ ███    █  ██     █ 
 99.4 |███ ███   █ █ █ ██  ██████ ██ █████ ██ ███  █ ██ █████ ███ █ ████ █ █ ███ ██ ██ 
 94.1 |███ ███ █████ █ ███ ██████ ████████ ██████ ███████████ █████████████████████ ███
 88.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  25
   2 ms | █  10
   3 ms |   4
   4 ms |   2
   5 ms |   5
   6 ms | ██  33
   7 ms | ███████████████  207
   8 ms | ████████████████████████████████████████  566
   9 ms | ███████████  154
  10 ms | █  21
  11 ms |   7
  12 ms |   3
  13 ms |   1
  14 ms |   1
  15 ms | ██  23
  16 ms | █████  76
  17 ms | ████████  113
  18 ms | █████████  124
  19 ms | ██████  87
  20 ms | █████  67
  21 ms | ███  49
  22 ms | ██  32
  23 ms | █  12
  24 ms | █  9
  25 ms |   5
  26 ms |   1
  27 ms |   1
  40 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `36.33`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `23.24`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `82.03`
- `preload_duration_ms` = `27.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `101.82`, min `20.76`, p50 `113.18`, p95 `139.93`, p99 `435.71`, 1%low `33.32`, 0.1%low `22.04`, std `61.78`

**Frame time (ms)**  avg `12.24`, p50 `8.84`, p95 `21.55`, p99 `23.84`, p99.9 `39.88`, max `48.16`

**Client tick (ms)**  avg `0.79`, p95 `1.07`, max `12.52`

**Memory**  start `1665 MB`, end `2883 MB`, peak `2969 MB`, GC `15 events / 134 ms`

**FPS over sampling window (ASCII):**

```
124.7 |   █                                       █                                    
121.2 |   █    █                             █    █                                    
117.8 |   █    █   █         █           █   █    █         █                █       █ 
114.3 |   █    █  ██ █       █           █ ███ █  █    █    █    █     █     █       █ 
110.9 |   █    ██ ██ █       █    █      █ ███ █  █ █  █    █    █     █     █       █ 
107.4 |   █  █ ██ ████   █   █    █      ███████  █ █  █    █    █     █     █   █   ██
104.0 |   █  █ ██ ████   █   █    █      ███████  █ █  █    █    ███   █     █   █   ██
100.5 |   █  █ ██ ████   █ █ █    █  ██  ███████  █ █ ██    █    ████  █ ██  █   █   ██
 97.1 |█  █ ██████████ █████ ███ ██  ███ ████████ █ ████    █ █ █████ ██ ██  █ ███ █ ██
 93.6 |█████████████████████ ██████  ███ ██████████ ████ ██ ████████████ ██  █ ███ █ ██
 90.2 |█████████████████████████████████████████████████ ██ ███████████████ ███████████
 86.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  10
   2 ms | █  19
   3 ms |   2
   4 ms |   1
   5 ms |   2
   6 ms | ██  29
   7 ms | █████████████  199
   8 ms | ████████████████████████████████████████  612
   9 ms | ████████  126
  10 ms | █  20
  11 ms |   4
  12 ms |   3
  15 ms | ██  33
  16 ms | ██████  94
  17 ms | ████████  129
  18 ms | ███████  110
  19 ms | █████  70
  20 ms | ████  61
  21 ms | ███  45
  22 ms | ██  36
  23 ms | █  14
  24 ms |   4
  25 ms |   2
  26 ms |   3
  27 ms |   1
  28 ms |   1
  30 ms |   1
  37 ms |   1
  38 ms |   1
  42 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `33.32`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `22.04`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `81.73`
- `preload_duration_ms` = `42.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `104.67`, min `21.83`, p50 `112.04`, p95 `146.45`, p99 `429.77`, 1%low `34.02`, 0.1%low `22.87`, std `66.47`

**Frame time (ms)**  avg `12.35`, p50 `8.93`, p95 `22.00`, p99 `24.26`, p99.9 `40.72`, max `45.80`

**Client tick (ms)**  avg `0.78`, p95 `1.01`, max `1.98`

**Memory**  start `2238 MB`, end `1720 MB`, peak `3000 MB`, GC `16 events / 149 ms`

**FPS over sampling window (ASCII):**

```
137.0 |                      █                          █                              
132.5 |                      █                   █      █       █                      
128.0 |                      █                   █      █ █     █                      
123.5 |       █ █            █                   █      █ █     █                      
119.0 |       █ █            █                   █      █ █     █       █              
114.5 |   █   █ █        █   █   █            █  █    █ █ █ █   ██     ██      █       
110.0 |   █   █ ██ █   █ █   █   █     █     ██  █    █ █ █ ██ ███     ██   ██ █    █ █
105.5 |   ██  █ ██████ █████ █   █     █     ██  ██   █ ███ ██ ███     ██   █████   ███
101.0 |█  ██ ███████████████ █ ███ █   █  █  ██  ██  ██ ███ ██ ████  █ ██  ██████ █████
 96.5 |█████████████████████ █ █████ ███ ██  ██ ███  ██ ███ ███████  █████ ████████████
 92.0 |████████████████████████████████████ ███ ███████ ███████████  ██████████████████
 87.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   3
   2 ms | ███  39
   3 ms | ██  21
   4 ms |   2
   5 ms |   4
   6 ms | ██  21
   7 ms | ████████████████  211
   8 ms | ████████████████████████████████████████  538
   9 ms | ███████████  151
  10 ms | █  17
  11 ms | █  8
  12 ms |   1
  13 ms |   1
  15 ms | █  12
  16 ms | ███  46
  17 ms | ██████████  129
  18 ms | ████████  114
  19 ms | ██████  79
  20 ms | ██████  76
  21 ms | █████  67
  22 ms | ███  47
  23 ms | █  13
  24 ms | █  10
  25 ms |   2
  26 ms |   5
  36 ms |   1
  40 ms |   1
  41 ms |   1
  45 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `34.02`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `22.87`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `80.98`
- `preload_duration_ms` = `32.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `105.12`, min `25.72`, p50 `113.39`, p95 `138.98`, p99 `598.97`, 1%low `36.70`, 0.1%low `26.68`, std `80.77`

**Frame time (ms)**  avg `12.24`, p50 `8.82`, p95 `21.46`, p99 `24.13`, p99.9 `31.07`, max `38.88`

**Client tick (ms)**  avg `0.73`, p95 `1.09`, max `1.75`

**Memory**  start `1580 MB`, end `2280 MB`, peak `3030 MB`, GC `15 events / 129 ms`

**FPS over sampling window (ASCII):**

```
147.0 |                                                       █                        
141.3 |                                              █        █                        
135.7 |    █                                         █       ██                        
130.0 |    █                         █               █       ██                        
124.4 |    █           █             █    █          █   █   ██   █     █    █    █    
118.7 |    ██ █        █   █ █       ██  ██  █       █  ██   ██   █     █  █ █   ██    
113.1 |█   ██ █        █   █ █ █     ██  ██  █      ██  ██   ███  █     █  █ █ █ ███   
107.4 |█   ██ █    █   █   ███ █     ██  ██  █      ██  ███  ███  █   █ █  █ █ █ ███   
101.8 |█   ██ █    █  ███  ███ █     ██  ███ █  █   ██ ████ █████ █   ███  █ █ █ ███   
 96.1 |██ ██████ ███  ███ ████ █ █ █ ██ ████ █  █  ███ ██████████ █ █████ ██ ███████  █
 90.5 |█████████████████████████████ ████████████ ████ ████████████████████████████████
 84.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  26
   2 ms | █  12
   4 ms |   3
   5 ms |   2
   6 ms | █  16
   7 ms | █████████████  202
   8 ms | ████████████████████████████████████████  609
   9 ms | ████████  118
  10 ms | █  17
  11 ms |   4
  12 ms |   3
  15 ms | ██  30
  16 ms | ██████  93
  17 ms | ████████  128
  18 ms | ████████  126
  19 ms | █████  77
  20 ms | ████  56
  21 ms | ████  55
  22 ms | ██  26
  23 ms | █  11
  24 ms | █  8
  25 ms |   3
  26 ms |   1
  27 ms |   2
  28 ms |   2
  36 ms |   1
  38 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `36.70`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `26.68`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `81.68`
- `preload_duration_ms` = `57.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `104.26`, min `26.10`, p50 `113.07`, p95 `135.90`, p99 `586.80`, 1%low `36.98`, 0.1%low `26.86`, std `79.31`

**Frame time (ms)**  avg `12.37`, p50 `8.84`, p95 `21.79`, p99 `24.23`, p99.9 `32.42`, max `38.32`

**Client tick (ms)**  avg `0.54`, p95 `0.73`, max `1.29`

**Memory**  start `2128 MB`, end `2790 MB`, peak `3024 MB`, GC `15 events / 137 ms`

**FPS over sampling window (ASCII):**

```
155.7 |          █                                                                     
149.4 |          █                                                                     
143.2 |          █                                 █                                   
136.9 |          █                 █            █  █                                   
130.6 |          █                 █      █     █  █                                   
124.4 |          █            █    ██     █   ███  █         █                         
118.1 |          █          ███   ███     █   ███  █        ██ █ ██ █ █ █    █         
111.9 |   █   █  █          ███   ████    █   ███  █     █  ██ █ ██ █ █ █    █         
105.6 |█ ██   █  ██        ████  █████    █   ███  █    ██  ██ █ ██ █ █ █    █         
 99.3 |█ ██   █ ████  ██   ████  █████ █ ███  ███  ██  ███████ █ ██ █ █ █   ████   █ █ 
 93.1 |███████████████████████████████ ███████████████████████ █████████████████  █████
 86.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms | ██  23
   2 ms | █  9
   3 ms |   1
   4 ms |   5
   5 ms |   5
   6 ms | █  8
   7 ms | █████████████  200
   8 ms | ████████████████████████████████████████  594
   9 ms | █████████  140
  10 ms | █  15
  11 ms | █  10
  12 ms |   2
  13 ms |   1
  14 ms |   1
  15 ms | █  11
  16 ms | ███  45
  17 ms | ███████  110
  18 ms | ██████████  142
  19 ms | ██████  89
  20 ms | █████  78
  21 ms | ████  57
  22 ms | ███  44
  23 ms | █  8
  24 ms | █  9
  25 ms |   3
  26 ms |   3
  30 ms |   1
  36 ms |   1
  38 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `36.98`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `26.86`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `80.84`
- `preload_duration_ms` = `84.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `105.70`, min `24.09`, p50 `113.13`, p95 `139.76`, p99 `560.13`, 1%low `35.38`, 0.1%low `24.79`, std `77.83`

**Frame time (ms)**  avg `12.18`, p50 `8.84`, p95 `21.17`, p99 `23.72`, p99.9 `36.95`, max `41.51`

**Client tick (ms)**  avg `0.74`, p95 `1.00`, max `1.55`

**Memory**  start `1618 MB`, end `2811 MB`, peak `3059 MB`, GC `11 events / 125 ms`

**FPS over sampling window (ASCII):**

```
158.4 |          █                                                                     
152.0 |          █                                                                     
145.7 |          █                                                                     
139.4 |          █                                                                 █   
133.0 |          █      █     █               ██                                   █   
126.7 |   █      █      █     █               ██      █                            █   
120.3 |   █      █   █ ██ ██  █          █   ███  █  ██ █    █ █      █  █         █   
114.0 |   ██ █   █ █ █ ██ ██  █      █   █   ███ ███ ██ █    █ ██  █  █  █    █   ██   
107.6 |   ██ █   █ █ █ ██ ██  █      █   █   ███ ███ ██ █    █ ██  █ ██  █   ██   ██   
101.3 |  ███ ██  ███ █ ██ ██ ███ █ █ █   █   ██████████ ██ █ █ ███ █ ██  █   ██   ██ █ 
 94.9 |█ ███ ██ ████████████ ███ █ █ █████ █ █████████████ █ █ ███ ████ ████████ █████ 
 88.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  25
   2 ms | █  18
   3 ms |   1
   4 ms |   3
   5 ms |   1
   6 ms | █  14
   7 ms | █████████████  199
   8 ms | ████████████████████████████████████████  603
   9 ms | █████████  136
  10 ms | █  16
  11 ms |   6
  12 ms |   3
  13 ms |   2
  14 ms |   2
  15 ms | ██  37
  16 ms | ██████  84
  17 ms | █████████  129
  18 ms | ███████  113
  19 ms | █████  82
  20 ms | █████  74
  21 ms | ███  44
  22 ms | ██  28
  23 ms | █  8
  24 ms |   7
  26 ms |   1
  27 ms |   1
  31 ms |   2
  35 ms |   1
  39 ms |   1
  41 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `35.38`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `24.79`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `82.10`
- `preload_duration_ms` = `43.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `104.94`, min `28.20`, p50 `110.77`, p95 `160.98`, p99 `424.21`, 1%low `37.69`, 0.1%low `28.35`, std `65.47`

**Frame time (ms)**  avg `12.23`, p50 `9.03`, p95 `21.42`, p99 `23.78`, p99.9 `30.72`, max `35.46`

**Client tick (ms)**  avg `1.18`, p95 `1.57`, max `1.91`

**Memory**  start `2788 MB`, end `1617 MB`, peak `3087 MB`, GC `10 events / 128 ms`

**FPS over sampling window (ASCII):**

```
131.8 |                                                      █                         
127.7 |     █                                  █             █                █        
123.7 |     █                                  █             █                █ █      
119.7 |     █                      █         █ █     █      ██              █ █ █      
115.6 |     █ █      █            ██   █ █ █ █ █    ██      ██              ███ █      
111.6 |     █ █      █      █  █  ██   █ █ █ █ █    ██ █    ██      █       ███ ███ ██ 
107.6 |  █  █ █ █    █      ██ █  ██  ██ ███ ███    ██ █    ██      ██   █  ███████ ██ 
103.5 |  █  █ █ █    ██    ███ ██ ██  ██ ███ ███    ████ █  ██   █ ███ ████ ███████ ██ 
 99.5 |  ██ █████ █  ███   ███ ██ ██  ██ ███ ████ █ ████ █  ██ ███ ████████ ███████ ███
 95.4 |████ ████████ ███ █ ██████ ██ ███ ███ ██████ ████ █████████ ████████ ███████ ███
 91.4 |█████████████████ █████████████████████████████████████████ ████████ ███████████
 87.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ████  43
   3 ms | █  18
   4 ms |   4
   5 ms | █  9
   6 ms | ███████  80
   7 ms | ██████████████  170
   8 ms | ████████████████████████████████████████  490
   9 ms | ████████████  150
  10 ms | ███  37
  11 ms | █  8
  12 ms |   2
  14 ms |   2
  15 ms | ██  23
  16 ms | ███████  80
  17 ms | █████████  115
  18 ms | ██████████  128
  19 ms | ████████  98
  20 ms | ██████  75
  21 ms | ████  46
  22 ms | ██  29
  23 ms | █  13
  24 ms | █  7
  25 ms |   3
  26 ms |   2
  28 ms |   1
  35 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `37.69`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `28.35`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `81.75`
- `preload_duration_ms` = `36.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `126.85`, min `18.65`, p50 `115.00`, p95 `264.39`, p99 `739.56`, 1%low `24.74`, 0.1%low `20.01`, std `126.25`

**Frame time (ms)**  avg `12.29`, p50 `8.70`, p95 `24.46`, p99 `36.00`, p99.9 `45.20`, max `53.62`

**Client tick (ms)**  avg `3.22`, p95 `4.41`, max `15.69`

**Memory**  start `1572 MB`, end `1046 MB`, peak `3146 MB`, GC `10 events / 128 ms`

**FPS over sampling window (ASCII):**

```
175.5 |█        █                                                                      
167.9 |█        █                                                                      
160.3 |█        ██  █        █                          ██  █   █                      
152.6 |█  █     ██  █        █ █   █                   ███  █   █                      
145.0 |██ █     ██  ██       █ █   ██ █  █       █     ███  █   █ █                    
137.4 |██ █     ██ ███ █     █████ ██ █  █   █   █  █  ███  █   █ █   █             █ █
129.7 |██ █    ███ ███████   █████ ██ █  █  ██   ████ ████  █ █ █ ██  █  █        █ █ █
122.1 |██ █  █ ███ ███████ █ █████ ██ █  █  ██ █ ████ ████  █ █ █ ███ █ ██      ███ █ █
114.5 |██ █  █ ███ ███████ █ █████ ██ █  ██ ██ █ ████ ████  █ ███ ███ ████      ███ █ █
106.8 |███████████████████ ███████ ████ ███ █████████ ████  ███████████████ █   █████ █
 99.2 |████████████████████████████████████████████████████ █████████████████ █████████
 91.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms | ████  60
   2 ms |   3
   3 ms | ██  23
   4 ms | ███████  94
   5 ms | ████████  113
   6 ms | █  9
   7 ms | ██  27
   8 ms | ████████████████████████████████████████  553
   9 ms | █  13
  10 ms | █  13
  11 ms | ████████  110
  12 ms | ███  35
  13 ms | █  15
  14 ms | ███  37
  15 ms | ████  49
  16 ms | ████  60
  17 ms | ████  53
  18 ms | ████  49
  19 ms | ███  45
  20 ms | ████  57
  21 ms | █████  65
  22 ms | ██  32
  23 ms | ██  25
  24 ms | █  13
  25 ms |   6
  26 ms |   4
  27 ms |   5
  28 ms |   1
  29 ms |   2
  30 ms |   2
  31 ms |   4
  32 ms | █  7
  33 ms | █  13
  34 ms | █  7
  35 ms | █  7
  36 ms |   4
  37 ms |   2
  38 ms |   2
  39 ms |   3
  40 ms |   2
  41 ms |   1
  44 ms |   1
  46 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `24.74`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `499.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.01`
- `entity_count_sample_end` = `499.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `81.40`
- `preload_duration_ms` = `53.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `119.69`, min `17.51`, p50 `113.17`, p95 `276.14`, p99 `322.19`, 1%low `22.30`, 0.1%low `19.07`, std `75.45`

**Frame time (ms)**  avg `12.86`, p50 `8.84`, p95 `34.83`, p99 `41.94`, p99.9 `47.54`, max `57.12`

**Client tick (ms)**  avg `4.32`, p95 `6.65`, max `8.05`

**Memory**  start `1580 MB`, end `2049 MB`, peak `3097 MB`, GC `9 events / 95 ms`

**FPS over sampling window (ASCII):**

```
147.6 |                                                  █                             
143.2 |                                                  █                             
138.8 |          █                                       █   █                         
134.4 |          █                                       ███ █                        █
130.0 |     █ █  █           █              █ █        █ ███ █                    █   █
125.6 |     █ █  █ █  ███  █████ █          █ ██ █     █ ███ ██     █ █  █   █    ██  █
121.2 |█  █ █ ████ █ ████  █████ █          █ ██ █ █   ████████   ███ █  █ █ █    ██  █
116.8 |█ ██ █ ███████████ ████████ █   █  ███ ██ ███   ████████ █████ █  ███ █    █████
112.4 |█ ████ ██████████████████████ █ ██████ ███████ ███████████████ █ ████ ███  █████
108.0 |██████ █████████████████████████████████████████████████████████ ███████████████
103.6 |██████ █████████████████████████████████████████████████████████ ███████████████
 99.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  11
   3 ms | ████████████████  129
   4 ms | ████████████████  130
   5 ms | █████████  68
   6 ms | ██████  44
   7 ms | ██████████████  114
   8 ms | ████████████████████████████████████████  319
   9 ms | ████████████  98
  10 ms | ████  32
  11 ms | ████  30
  12 ms | ████  32
  13 ms | █████  37
  14 ms | ████  32
  15 ms | ████  28
  16 ms | ████  28
  17 ms | ████  34
  18 ms | █████  39
  19 ms | █████  37
  20 ms | ██████  47
  21 ms | ███████  57
  22 ms | ████  28
  23 ms | ███  22
  24 ms | █  8
  25 ms | ██  12
  26 ms | █  10
  27 ms |   3
  28 ms |   3
  30 ms |   1
  31 ms | █  11
  32 ms | █  4
  33 ms | █  9
  34 ms | ███  21
  35 ms | ██  19
  36 ms | █  10
  37 ms | █  10
  38 ms | █  9
  39 ms | █  6
  40 ms | █  5
  41 ms |   2
  42 ms | █  6
  43 ms | █  4
  44 ms |   1
  45 ms |   1
  46 ms |   1
  47 ms |   2
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `19.07`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `56.00`
- `fps_harmonic_avg` = `77.74`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `22.30`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `106.32`, min `28.64`, p50 `113.09`, p95 `152.45`, p99 `476.72`, 1%low `35.00`, 0.1%low `28.84`, std `70.67`

**Frame time (ms)**  avg `12.21`, p50 `8.84`, p95 `21.75`, p99 `24.54`, p99.9 `33.48`, max `34.92`

**Client tick (ms)**  avg `1.04`, p95 `1.34`, max `4.52`

**Memory**  start `2759 MB`, end `986 MB`, peak `3089 MB`, GC `11 events / 153 ms`

**FPS over sampling window (ASCII):**

```
139.1 |              █                                                                 
134.3 |              █  █                                                   █          
129.5 |         █  █ █  █                          █                        █          
124.7 | ███     █  █ █  █    █       █  █          █                        █          
119.9 | ███   █ █  █ █  █    █       █  █          █ █ ██        █          █   █      
115.1 | ███   █ █  █ █ ██    █  █    █  █      █   █ █ ██        █ █        █   █  █ █ 
110.2 | ███   █ █  ███ ██   ██  █ █  ████    █ █   █ █ ██    █   █ █       ███  █  █ █ 
105.4 | ███   █ █ ████ ██   ██  █ █  █████  ██ ██ ██ █ ███   █   █ █       ███  █  █ █ 
100.6 |████  ████ ████ ██ ████ ██ █ ██████ ███ ███████ ███ █ █ █ █ █ ██  █ ███  █  █ █ 
 95.8 |███████████████████████ ██ █ ██████ ███████████ ███ █ █ █ █ █ ██ ██████  █ ████ 
 91.0 |████████████████████████████ ███████████████████████████████████████████████████
 86.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  13
   2 ms | ██  30
   3 ms | █  15
   4 ms |   4
   5 ms |   6
   6 ms | ███  39
   7 ms | ████████████████████  242
   8 ms | ████████████████████████████████████████  494
   9 ms | ████████████  153
  10 ms | ██  30
  11 ms |   6
  12 ms |   1
  14 ms |   3
  15 ms | ██  23
  16 ms | █████  66
  17 ms | █████████  109
  18 ms | ████████  96
  19 ms | ████████  94
  20 ms | ███████  82
  21 ms | █████  64
  22 ms | ███  31
  23 ms | █  12
  24 ms | █  11
  25 ms |   3
  26 ms |   2
  27 ms |   1
  28 ms |   2
  30 ms |   2
  31 ms |   1
  32 ms |   1
  34 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `152.00`
- `entity_count_sample_start` = `152.00`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `48.00`
- `fps_1pct_low` = `35.00`
- `fps_harmonic_avg` = `81.92`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `28.84`
- `part` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `104.77`, min `23.34`, p50 `113.33`, p95 `137.91`, p99 `454.63`, 1%low `39.31`, 0.1%low `29.03`, std `68.17`

**Frame time (ms)**  avg `12.20`, p50 `8.82`, p95 `21.39`, p99 `23.32`, p99.9 `25.68`, max `42.85`

**Client tick (ms)**  avg `0.51`, p95 `0.67`, max `1.44`

**Memory**  start `3041 MB`, end `2839 MB`, peak `3155 MB`, GC `9 events / 119 ms`

**FPS over sampling window (ASCII):**

```
134.9 |                                                       █                        
130.7 |  █                                                    █                        
126.4 | ██                                                   ██ █  █                   
122.2 | ██                               █    █ █            ██ █  █          █        
117.9 | ██  █           █                █    █ █          █ ██ █  █          █   █    
113.7 | ██  █    █      ██          █   ██  █ █ █          █ ██ █  █          █   █    
109.4 |███  █ █  ██     ██     █ █  █   █████ █ █ █  █   █ █ ████ ██          ██  ██   
105.2 |███  █ █  ██   █ ███  ███ █  █   █████ ███ █  █   █ █ ████ ██     █    ██  ██   
100.9 |███  ████ ██   █ ███  ███ ████  ██████ ███ ██ █ ███ █ ████ ██     █  █ ██ ████  
 96.7 |███ █████ ██ █ █ ████████ ████  ██████ ██████ █ ███ █ ████ █████ █████ ██ ████ █
 92.4 |███ █████████████████████ █████ █████████████ ███████ ████ ███████████ █████████
 88.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   5
   2 ms | ███  42
   3 ms | █  9
   5 ms |   3
   6 ms | █  9
   7 ms | █████████████  201
   8 ms | ████████████████████████████████████████  619
   9 ms | ████████  121
  10 ms |   6
  11 ms |   4
  12 ms |   5
  13 ms |   1
  15 ms |   6
  16 ms | █████  71
  17 ms | ██████████  160
  18 ms | ████████  117
  19 ms | █████  81
  20 ms | █████  73
  21 ms | ███  49
  22 ms | ██  36
  23 ms | █  12
  24 ms |   6
  25 ms |   2
  26 ms |   1
  42 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `29.03`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `53.00`
- `fps_harmonic_avg` = `81.99`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `39.31`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `130.69`, min `22.54`, p50 `115.34`, p95 `404.29`, p99 `488.93`, 1%low `25.45`, 0.1%low `22.92`, std `106.63`

**Frame time (ms)**  avg `12.37`, p50 `8.67`, p95 `29.60`, p99 `37.30`, p99.9 `40.82`, max `44.36`

**Client tick (ms)**  avg `3.80`, p95 `5.62`, max `21.36`

**Memory**  start `1503 MB`, end `2159 MB`, peak `3225 MB`, GC `8 events / 106 ms`

**FPS over sampling window (ASCII):**

```
165.9 |   █                       █                                            █       
158.9 |   ██         █        █   █                                            █       
151.9 |   ██         █ █      █   █               █      █                     █       
144.9 |   ██ █       █ █      █   █             █ █   █ ██  █ █         ██ █   █       
137.9 |  ███ █████ █ █ █   █  █ █ ██    █  █ █  █ ██ ██ ███ ███   █     ██ █   █       
130.9 |  █████████ ███ █  ███████ ██ █ ██ ██ ████ █████ ███████  ██     ██ █  ██   █   
123.9 |███████████████ ██████████ ██ █ ██ ███████ █████ ███████  ██     ████  ███ ██   
116.9 |██████████████████████████ ██████████████████████████████ ██     ████ ████ ██   
109.9 |██████████████████████████ █████████████████████████████████  █  ████ ████ ██ █ 
102.9 |█████████████████████████████████████████████████████████████ █ █████████████ ██
 95.9 |███████████████████████████████████████████████████████████████ ████████████████
 88.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  13
   2 ms | █████████  110
   3 ms | ████  55
   4 ms | ██████  78
   5 ms | ███████  90
   6 ms | █  19
   7 ms | ███  38
   8 ms | ████████████████████████████████████████  514
   9 ms | ███  34
  10 ms | █  11
  11 ms | ████  52
  12 ms | ██  32
  13 ms | ██  27
  14 ms | █  15
  15 ms | ██  22
  16 ms | ████  48
  17 ms | █████  63
  18 ms | ████  47
  19 ms | ███  42
  20 ms | █████  61
  21 ms | ████  52
  22 ms | ███  35
  23 ms | ██  26
  24 ms | █  19
  25 ms | █  9
  26 ms | █  11
  27 ms | █  9
  28 ms |   2
  29 ms |   4
  30 ms |   1
  31 ms |   4
  32 ms |   4
  33 ms | █  19
  34 ms | █  10
  35 ms | █  11
  36 ms | █  10
  37 ms | █  7
  38 ms |   6
  39 ms |   5
  42 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.13`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `22.92`
- `preset_long` = `0.00`
- `preload_duration_ms` = `72.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `80.86`
- `fps_1pct_low` = `25.45`
- `block_state_changes` = `0.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `122.90`, min `19.64`, p50 `114.41`, p95 `356.03`, p99 `557.92`, 1%low `25.05`, 0.1%low `20.39`, std `101.28`

**Frame time (ms)**  avg `12.17`, p50 `8.74`, p95 `24.37`, p99 `36.13`, p99.9 `47.19`, max `50.91`

**Client tick (ms)**  avg `2.89`, p95 `4.67`, max `7.03`

**Memory**  start `1402 MB`, end `2320 MB`, peak `3130 MB`, GC `6 events / 84 ms`

**FPS over sampling window (ASCII):**

```
168.8 |                    █                                                           
161.4 |       █            █                                                           
154.0 |       █     █      █                             █          █                  
146.6 |    █  █ █  ██      █                            ██    █  █  █                  
139.2 |   █████ █  ██  █   █         █    █  ██ █   █ █ ██    █ ██ ██     █            
131.8 | ██████████████ █████         █    █  ██ █ █ █ ████ █  ████ ██     █        █ ██
124.3 | ██████████████ █████        ██    █  ██ █ █ █ ██████  ████ ███    █        █ ██
116.9 | ██████████████ █████  ██   ███    ███████ ███ ██████  ████ ███    █     █  █ ██
109.5 |███████████████ █████  ███  ███    ███████ ████████████████ ███  █ █     ██ █ ██
102.1 |██████████████████████████ █████ █████████ ███████████████████████ █ ██ ███ █ ██
 94.7 |██████████████████████████ ███████████████████████████████████████ █████████████
 87.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  27
   2 ms | █████  63
   3 ms | ██  33
   4 ms | ███  40
   5 ms | ███████  93
   6 ms | █████  67
   7 ms | ██  26
   8 ms | ████████████████████████████████████████  550
   9 ms | ███  45
  10 ms | ████  53
  11 ms | ████  51
  12 ms | █  20
  13 ms | █  14
  14 ms | █  20
  15 ms | ███  48
  16 ms | ████  57
  17 ms | █████  66
  18 ms | █████  64
  19 ms | ████  61
  20 ms | █████  67
  21 ms | ████  53
  22 ms | ██  24
  23 ms | █  13
  24 ms | █  13
  25 ms | █  9
  26 ms |   2
  27 ms |   1
  28 ms |   3
  29 ms |   1
  30 ms |   2
  31 ms |   1
  32 ms | █  10
  33 ms | █  11
  34 ms | █  9
  35 ms | █  8
  36 ms |   5
  37 ms |   6
  38 ms |   2
  39 ms |   1
  41 ms |   1
  47 ms |   2
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.53`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `20.39`
- `preset_long` = `0.00`
- `preload_duration_ms` = `55.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `82.17`
- `fps_1pct_low` = `25.05`
- `block_state_changes` = `0.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `137.45`, min `13.36`, p50 `108.44`, p95 `473.06`, p99 `944.18`, 1%low `17.14`, 0.1%low `13.36`, std `169.69`

**Frame time (ms)**  avg `16.04`, p50 `9.22`, p95 `39.75`, p99 `51.49`, p99.9 `68.21`, max `74.87`

**Client tick (ms)**  avg `15.66`, p95 `22.00`, max `33.62`

**Memory**  start `1692 MB`, end `1756 MB`, peak `3157 MB`, GC `6 events / 69 ms`

**FPS over sampling window (ASCII):**

```
320.7 |                                                       █           █            
297.8 |                                                       █           █            
274.8 |                               █                       █           █            
251.8 |                               █                 █     █           █            
228.9 |                         █     █                 █    ██     █     ██           
205.9 |█                   █    ██    █           ██    █    ██     ██    ██           
182.9 |██            █    ██    ██    █      █    ██    █    ███    ██    ███          
160.0 |███          ██    ██    ██    █      █    ██    ██   ███    ██    ████         
137.0 |█████   ██   ██    ██    ██    ███  ███    ███  ███   ████   ██    ████    ███  
114.0 |█████   ███  ███   ████  ███   ███  ████  ████  ███   ████  ███   ██████ ██████ 
 91.1 |██████ █████ ████ █████ ████████████████████████████████████████████████████████
 68.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  7
   1 ms | ████████  54
   2 ms | █████  33
   3 ms | ███████  50
   4 ms | ██████████  67
   5 ms | ██████████  67
   6 ms | ███  23
   7 ms | █████  36
   8 ms | ████████████████████████████████████████  275
   9 ms | ███  24
  10 ms | █  5
  11 ms |   2
  12 ms | █  6
  13 ms | ███  20
  14 ms | ███  23
  15 ms | █████  34
  16 ms | ██████  42
  17 ms | ████  28
  18 ms | ████  27
  19 ms | ████  28
  20 ms | ████  30
  21 ms | ████  30
  22 ms | ██  12
  23 ms | ████  29
  24 ms | ███  22
  25 ms | █  9
  26 ms | █  9
  27 ms | ██  16
  28 ms | ███  19
  29 ms | ███  23
  30 ms | ██  14
  31 ms | █  8
  32 ms | ██  17
  33 ms | ███  19
  34 ms | ███  22
  35 ms | ███  20
  36 ms | █  8
  37 ms | ██  15
  38 ms | █  6
  39 ms | █  7
  40 ms | █  6
  41 ms |   2
  42 ms | █  4
  43 ms |   3
  44 ms | █  5
  45 ms |   2
  46 ms |   3
  47 ms | █  4
  48 ms | █  5
  49 ms | █  4
  50 ms |   3
  51 ms | █  7
  52 ms |   3
  53 ms |   2
  54 ms |   1
  55 ms |   1
  56 ms |   1
  59 ms |   1
  63 ms |   1
  69 ms |   1
  74 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `17.14`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `73.00`
- `falling_blocks_landed` = `20800.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `62.33`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.36`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4809.52`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `126.82`, min `13.68`, p50 `64.10`, p95 `492.35`, p99 `993.69`, 1%low `17.93`, 0.1%low `13.68`, std `181.59`

**Frame time (ms)**  avg `17.87`, p50 `15.60`, p95 `42.67`, p99 `48.63`, p99.9 `57.61`, max `73.12`

**Client tick (ms)**  avg `16.18`, p95 `22.27`, max `33.27`

**Memory**  start `1618 MB`, end `2024 MB`, peak `3164 MB`, GC `6 events / 71 ms`

**FPS over sampling window (ASCII):**

```
304.7 |                                                         █            █         
281.8 |                                             █     █     █            █         
258.8 |                                             █     █     █            █         
235.9 |                                 █           █     █     ██    █     ██        █
212.9 | ██                 █            █           █    ██     ██    █     ██        █
190.0 |███                 █     ██     █    █      ██   ██     ██    ██    ██        █
167.0 |████          █     ██    ██    ██    ██    ███   ██     ██    ██    ███     ███
144.1 |████          ██    ██    ██    ██    ██    ███   ███   ███    ███   ████    ███
121.1 |████     █    ██    ██    ███   ██    ███   ███   ███   ████   ███   ████    ███
 98.1 |█████   ██ █  ███   ███   ███ █ ███   ████  ███   ████  ████  ████ █ ████    ███
 75.2 |███████ ████ ██████ ████ ███████████ █████ ████████████ █████ ██████████████████
 52.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  11
   1 ms | ██████████  45
   2 ms | ██████  28
   3 ms | ██████  28
   4 ms | ████  18
   5 ms | ████  18
   6 ms | █████████  41
   7 ms | ███████████████████  90
   8 ms | ████████████████████████████████████████  186
   9 ms | ██████  28
  10 ms | ██  9
  11 ms |   1
  12 ms | █  4
  13 ms | ██  9
  14 ms | ██████  29
  15 ms | ████  19
  16 ms | ████████  36
  17 ms | ██████████  48
  18 ms | ██████  29
  19 ms | ██████  28
  20 ms | ███████  31
  21 ms | ███  16
  22 ms | ████  18
  23 ms | ██████  27
  24 ms | ████  20
  25 ms | ██  9
  26 ms | ███  12
  27 ms | ████  20
  28 ms | ████  19
  29 ms | █████  22
  30 ms | ████  18
  31 ms | ██  9
  32 ms | ████  20
  33 ms | ████  19
  34 ms | ██  11
  35 ms | ███  15
  36 ms | ███  13
  37 ms | ████  18
  38 ms | █  5
  39 ms | ██  11
  40 ms | ███  12
  41 ms | ██  8
  42 ms | ██  11
  43 ms | ██  9
  44 ms | ██  8
  45 ms | █  6
  46 ms | █  6
  47 ms | █  6
  48 ms | █  4
  49 ms |   2
  51 ms |   1
  53 ms |   2
  55 ms |   1
  56 ms | █  3
  57 ms |   1
  73 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `17.93`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `48.00`
- `falling_blocks_landed` = `22400.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `55.97`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.68`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4803.02`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `109.63`, min `21.08`, p50 `113.47`, p95 `177.45`, p99 `634.72`, 1%low `29.50`, 0.1%low `21.27`, std `95.34`

**Frame time (ms)**  avg `12.30`, p50 `8.81`, p95 `22.62`, p99 `27.05`, p99.9 `40.52`, max `47.43`

**Client tick (ms)**  avg `1.93`, p95 `2.81`, max `3.43`

**Memory**  start `1260 MB`, end `1072 MB`, peak `3245 MB`, GC `10 events / 125 ms`

**FPS over sampling window (ASCII):**

```
208.9 |                                                           █                    
197.9 |                                                           █                    
187.0 |                                                           █                    
176.0 |                                                           █                    
165.1 |                                                          ██                    
154.1 |                             █ █                 █        ██         █          
143.2 |                 █           █ █                 █        ██         █       █  
132.2 |         █       █           █ █       █ █     █ █ █   █  ██ █   █   █       █  
121.3 |   █    ██   █  ██       █   █ █    █  █ █     █ █ █  ██  ██ █   █   █     █ █  
110.3 |   █    ██   █  ██       █ █ █ █ █  █ ██ █ ██  █ █ █  ███ ██ █   █   █     █ █  
 99.4 |  ███ █ ██████████████ █████ █ ████ █████████ ██ ████ ██████ █ ███ ███████ █ █ █
 88.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | ██  24
   2 ms | █  9
   3 ms |   4
   4 ms | █  13
   5 ms | █████  65
   6 ms | ███████  99
   7 ms | █████  72
   8 ms | ████████████████████████████████████████  554
   9 ms | ███  47
  10 ms | ███████  103
  11 ms | ██  31
  12 ms |   1
  13 ms |   1
  14 ms | █  13
  15 ms | ███  48
  16 ms | ████  62
  17 ms | ███████  99
  18 ms | ██████  83
  19 ms | ███████  95
  20 ms | ████  53
  21 ms | ███  48
  22 ms | ██  31
  23 ms | ██  33
  24 ms | █  11
  25 ms |   5
  26 ms |   4
  27 ms |   2
  28 ms |   2
  31 ms |   2
  32 ms | █  7
  35 ms |   1
  36 ms |   1
  46 ms |   1
  47 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `29.50`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `16.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `81.31`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `21.27`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.27`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `111.29`, min `20.95`, p50 `112.45`, p95 `186.11`, p99 `587.85`, 1%low `32.33`, 0.1%low `23.18`, std `99.84`

**Frame time (ms)**  avg `12.31`, p50 `8.89`, p95 `22.81`, p99 `25.97`, p99.9 `37.25`, max `47.72`

**Client tick (ms)**  avg `1.92`, p95 `2.87`, max `3.42`

**Memory**  start `1219 MB`, end `3240 MB`, peak `3311 MB`, GC `9 events / 120 ms`

**FPS over sampling window (ASCII):**

```
172.2 |                                                       █                        
164.5 |                                                       █                        
156.8 |                                                       █                     █  
149.1 |                                                       █               ██    █  
141.4 |                                                       █ █             ██    █  
133.8 |        █         █              █      █     █        █ █  █      █   ██    █  
126.1 |       ██       █ █   █   █      █   ██ █     █ █     ██ █  █ █    █  ███  █ █  
118.4 |       ██       █ █   █ █ █      █  ███ █    ██ ██    ██ █  █ █    █  ████ █ █  
110.7 |       ███ ██ ███ █ █████ ██   ███  ███ █    ██ ██    ██ █  █ █  █ █  ████ █ █  
103.0 |     █ ██████ ███ ██████████ ██████ ██████ █ ██ ████ █████  ███  ███  ████ █ █  
 95.4 |█ ██ ██████████████████████████████████████████████████████████ ████████████████
 87.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | ██  21
   2 ms | █  17
   3 ms | █  9
   4 ms | █  15
   5 ms | ██████  71
   6 ms | ███████  94
   7 ms | ███████  86
   8 ms | ████████████████████████████████████████  516
   9 ms | ███  42
  10 ms | ███████  86
  11 ms | ████  51
  12 ms | █  7
  13 ms |   4
  14 ms | █  10
  15 ms | ████  47
  16 ms | █████  61
  17 ms | ███████  92
  18 ms | ███████  87
  19 ms | ██████  82
  20 ms | █████  61
  21 ms | ███  44
  22 ms | ███  43
  23 ms | ██  25
  24 ms | ██  23
  25 ms | █  11
  26 ms |   4
  27 ms |   4
  28 ms |   1
  30 ms |   1
  31 ms |   1
  32 ms |   1
  35 ms |   1
  36 ms |   1
  38 ms |   1
  47 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `32.33`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `36.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `81.24`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `23.18`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.12`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `104.25`, min `37.47`, p50 `113.13`, p95 `135.86`, p99 `547.83`, 1%low `39.80`, 0.1%low `37.50`, std `75.16`

**Frame time (ms)**  avg `12.30`, p50 `8.84`, p95 `21.24`, p99 `23.70`, p99.9 `26.47`, max `26.68`

**Client tick (ms)**  avg `0.66`, p95 `0.88`, max `1.04`

**Memory**  start `950 MB`, end `1409 MB`, peak `3332 MB`, GC `9 events / 120 ms`

**FPS over sampling window (ASCII):**

```
140.3 |           █                                                                    
135.4 |           █                                                                    
130.5 |           █                               █                                    
125.5 |  █        █                               █                 █                  
120.6 |████       █             █ █         █  ██ █ █    █       █  █           ██  █  
115.7 |████     █ █      ██  █  █ █        ██  ██ █ █   ██     █ █  █       █ █ ██  █  
110.8 |████     █ █   █ ███  █  █ █        ██  ██ █ █   ██     █ █  █ █     █ █ ██  █  
105.9 |████     █ █   █ ███  █  █ █    █   ██  ██ █ █   ██     █ █  █████   █ █ ██  █  
101.0 |████  █  ███ █ █████  ██ █ █    █   ██  ██ █ █ █ ██ █ █ █ ██ ███████ ███ ██ ██  
 96.1 |███████ █████████████ ███████████ █ ██  ██ ███ █ ██ █ █ █ ██ ██████████████ ██  
 91.2 |███████████████████████████████████ ██████████ ████ ███████████████████████ ██  
 86.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  25
   2 ms | █  14
   3 ms |   3
   4 ms |   3
   5 ms |   3
   6 ms | █  10
   7 ms | ██████████████  207
   8 ms | ████████████████████████████████████████  597
   9 ms | ████████  120
  10 ms | █  16
  11 ms | █  10
  12 ms |   2
  14 ms |   1
  15 ms | █  9
  16 ms | ████  59
  17 ms | █████████  139
  18 ms | █████████  127
  19 ms | ███████  101
  20 ms | █████  74
  21 ms | ████  57
  22 ms | ██  23
  23 ms | █  11
  24 ms |   7
  25 ms |   4
  26 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `37.50`
- `seed` = `5099.00`
- `preload_duration_ms` = `35.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `39.80`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `81.28`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `103.45`, min `31.78`, p50 `115.71`, p95 `125.39`, p99 `664.21`, 1%low `39.47`, 0.1%low `33.25`, std `93.60`

**Frame time (ms)**  avg `12.32`, p50 `8.64`, p95 `21.22`, p99 `23.45`, p99.9 `27.94`, max `31.46`

**Client tick (ms)**  avg `0.29`, p95 `0.37`, max `0.51`

**Memory**  start `951 MB`, end `1441 MB`, peak `3333 MB`, GC `9 events / 120 ms`

**FPS over sampling window (ASCII):**

```
160.9 |               █          █                   █                                 
154.2 |               █          █                   █                                 
147.5 |               █          █                   █                                 
140.7 |               █          █                   █          █                      
134.0 |            █  █    █     █           █       █          █                 █    
127.3 |     ██     ██ █    █     █    █      █       █          █   █             █    
120.6 |     ██     ██ █    █     █    █  █   █      ██          ██  █             █    
113.9 |█  █ ██     ██ █    █     █ █  █  █   █    █ ██          ██  █             █    
107.1 |█  █ ██     ██ █    █     █ █  █  █   █    █ ██          ██  █             █  █ 
100.4 |█ ██ ██ █   ██ █    █    ██ ██ █  █ █ ██   █ ██ █   █  █ ██  █ █   █ █     █  █ 
 93.7 |█████████ ██████████████ ██ ██ █ ████ ██ █ ████ ███ █  █ █████████ ███ █████████
 87.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | █  19
   2 ms |   1
   3 ms |   1
   7 ms | ███  68
   8 ms | ████████████████████████████████████████  864
   9 ms | █  19
  10 ms |   10
  11 ms | █  12
  12 ms |   3
  14 ms |   7
  15 ms | █  23
  16 ms | ███  62
  17 ms | ████████  175
  18 ms | ██████  132
  19 ms | ████  81
  20 ms | ██  48
  21 ms | ██  46
  22 ms | █  26
  23 ms | █  11
  24 ms |   7
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms |   1
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `39.47`
- `fps_harmonic_avg` = `81.20`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `33.25`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9540.00`
- `preload_duration_ms` = `53.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `100.33`, min `32.00`, p50 `115.09`, p95 `127.21`, p99 `447.67`, 1%low `40.28`, 0.1%low `34.73`, std `75.77`

**Frame time (ms)**  avg `12.44`, p50 `8.69`, p95 `21.41`, p99 `22.99`, p99.9 `26.28`, max `31.25`

**Client tick (ms)**  avg `0.26`, p95 `0.34`, max `0.49`

**Memory**  start `1539 MB`, end `2102 MB`, peak `3364 MB`, GC `9 events / 109 ms`

**FPS over sampling window (ASCII):**

```
137.1 |                                                  █                             
132.3 |                █ █                  █          █ █                     █      █
127.4 |            █   █ █                  █          █ █         █           ██  █  █
122.6 |            █   █ █          █   █   █          █ █         █           ██  █  █
117.7 |            █  ██ █          █   █   █          █ █      █  █           ██  █  █
112.9 |            █  ██ █          █   █   █          █ █      █  █         █ ██  █  █
108.0 |            █  ██ █          █   █   █          █ █      █  █         █ ██  █  █
103.2 |        █   █  ██ █          █   █   █          █ █    █ █  █         █ ██  █  █
 98.4 | █   █ ██   █ ███ █ █     █ ██ █ █ █ ██  █    █ █ █  █ █ █  ██  █  █ ██ ██  ██ █
 93.5 |██ ███ ██████ ███ █ ████  ██████ ████████████ █ █ ██ █ ███████  ████ █████  ██ █
 88.7 |█████████████████████████ ███████████████████████ ██████████████████████████████
 83.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  16
   2 ms |   1
   6 ms |   7
   7 ms | █████  96
   8 ms | ████████████████████████████████████████  811
   9 ms | ██  39
  10 ms | █  12
  11 ms |   8
  12 ms |   5
  13 ms |   2
  14 ms |   3
  15 ms | █  19
  16 ms | ██  38
  17 ms | ██████  127
  18 ms | ███████  145
  19 ms | █████  103
  20 ms | ████  73
  21 ms | ███  58
  22 ms | █  30
  23 ms |   8
  24 ms |   3
  25 ms |   2
  26 ms |   2
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2236.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `34.73`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `80.41`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `40.28`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `101.15`, min `22.62`, p50 `113.38`, p95 `133.99`, p99 `347.77`, 1%low `37.52`, 0.1%low `26.98`, std `66.42`

**Frame time (ms)**  avg `12.28`, p50 `8.82`, p95 `21.12`, p99 `23.43`, p99.9 `28.71`, max `44.21`

**Client tick (ms)**  avg `0.33`, p95 `0.48`, max `0.67`

**Memory**  start `1330 MB`, end `1171 MB`, peak `3342 MB`, GC `9 events / 122 ms`

**FPS over sampling window (ASCII):**

```
134.7 |                                   █                                            
129.9 |                                   █         █                       █          
125.1 |                            █      █         ██                      █          
120.3 |       █                    █      █         ███ █                   █          
115.4 |      ██                    █      █       █ ███ █  █             █  █          
110.6 |      ██    █       █       █      █       █ ███ █  █             █  █        █ 
105.8 |      ██    █  █    █ █ █   █      █      ██ ███ █  █             █ ██        █ 
100.9 |    █ ████ ██  █    █ ███ █ ██ ██  █  █   ██ ███ ██ █    ██  █ █  █ ███     █ █ 
 96.1 |███ █ ███████ ███ █ █████ █ █████ █████ ████ ██████ █ ██████ ████ █ ███  ██ ███ 
 91.3 |███████████████████████████████████████████████████████████████████ ███  ██████ 
 86.5 |███████████████████████████████████████████████████████████████████████████████ 
 81.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  10
   2 ms | █  10
   3 ms | █  11
   4 ms |   2
   5 ms | █  11
   6 ms | █  18
   7 ms | █████████  148
   8 ms | ████████████████████████████████████████  678
   9 ms | ██████  100
  10 ms | █  16
  11 ms |   3
  12 ms |   5
  13 ms |   2
  14 ms |   4
  15 ms | ██  27
  16 ms | ████  63
  17 ms | ███████  125
  18 ms | █████████  150
  19 ms | █████  80
  20 ms | █████  79
  21 ms | ██  42
  22 ms | █  15
  23 ms | █  16
  24 ms |   5
  25 ms |   2
  27 ms |   3
  29 ms |   1
  44 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `26.98`
- `seed` = `4027.00`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `37.52`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `81.41`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `107.03`, min `24.01`, p50 `115.74`, p95 `126.64`, p99 `765.35`, 1%low `37.16`, 0.1%low `24.19`, std `107.38`

**Frame time (ms)**  avg `12.22`, p50 `8.64`, p95 `21.06`, p99 `23.56`, p99.9 `34.06`, max `41.65`

**Client tick (ms)**  avg `0.30`, p95 `0.38`, max `0.55`

**Memory**  start `1594 MB`, end `2873 MB`, peak `3451 MB`, GC `11 events / 113 ms`

**FPS over sampling window (ASCII):**

```
218.3 |                             █                                                  
206.4 |                             █                                                  
194.5 |                             █                                                  
182.6 |                             █                                                  
170.7 |                            ██                           █                      
158.8 |                            ██                           █                      
146.9 |                            ██                           █                 █    
135.0 |                      ██    ██       █         ██     █  █       █    █    █    
123.1 |     ██  █     █    █ ██   ███       █ █       ██     ██ ██   █ ██    █    █    
111.2 |     ██  █     █ ██ █ ██   ███       █ █       ██   █ ██ ██   █ ██    █    █    
 99.3 |█ ██ ██████ █ █████ ████████████ █ ██████  █ ████  █████ ███ ██ ██ █ ███ █ █  ██
 87.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | █  25
   2 ms |   1
   3 ms |   1
   4 ms |   3
   7 ms | ████  90
   8 ms | ████████████████████████████████████████  843
   9 ms | █  31
  10 ms | █  17
  11 ms |   2
  12 ms |   2
  13 ms |   2
  14 ms |   6
  15 ms | █  14
  16 ms | ████  85
  17 ms | ███████  157
  18 ms | ███████  138
  19 ms | ███  70
  20 ms | ███  60
  21 ms | ██  40
  22 ms | █  21
  23 ms | █  14
  24 ms |   5
  25 ms |   4
  30 ms |   1
  41 ms |   2
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
- `fps_harmonic_avg` = `81.83`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `37.16`
- `fps_0p1pct_low` = `24.19`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `64.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `104.20`, min `20.25`, p50 `111.24`, p95 `144.76`, p99 `524.40`, 1%low `28.61`, 0.1%low `20.52`, std `82.60`

**Frame time (ms)**  avg `12.50`, p50 `8.99`, p95 `22.72`, p99 `27.27`, p99.9 `47.41`, max `49.38`

**Client tick (ms)**  avg `0.40`, p95 `0.67`, max `3.36`

**Memory**  start `2770 MB`, end `1895 MB`, peak `3749 MB`, GC `17 events / 205 ms`

**FPS over sampling window (ASCII):**

```
145.9 |                      █                                         █               
140.2 |            █         █        █           █                    █               
134.5 |  ██        █         █        █ █         █                    █               
128.7 |  ██        █         █    █   █ █      █  █                    █               
123.0 |  ██        █         █  █ █   █ █     ██  █                    █               
117.3 | ████       █         █  █ █   █ █     ██  █                    █        █      
111.6 | ████       █         █  █ ██  █ █     ███ █        █        █ ██     █  █      
105.8 | ████   ██  █        ██  ████  █ █    ████ █ █      ██       █████    █  ██     
100.1 | █████  ███ █    █   ███ █████ █ ███ █████ █ █  ██ ████  █ █ █████  █ ██ ██     
 94.4 |███████ ████████ █████████████ █████ █████ ███ ████████  █ ████████ █ ██ ██  ███
 88.7 |███████████████████████████████████████████████████████████████████████████ ████
 82.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | █  16
   2 ms | █  12
   3 ms |   6
   4 ms |   3
   5 ms | █  8
   6 ms | ███  36
   7 ms | ██████████████████  226
   8 ms | ████████████████████████████████████████  496
   9 ms | ███████████  137
  10 ms | ███  31
  11 ms | █  14
  12 ms |   1
  13 ms |   4
  14 ms |   6
  15 ms | ██  23
  16 ms | ███████  91
  17 ms | ██████████  128
  18 ms | ███████  85
  19 ms | █████  65
  20 ms | ████  54
  21 ms | ████  54
  22 ms | ██  30
  23 ms | ██  27
  24 ms | █  16
  25 ms |   5
  26 ms |   6
  27 ms | █  8
  28 ms |   3
  34 ms |   1
  39 ms |   1
  43 ms |   1
  44 ms |   1
  46 ms |   1
  48 ms |   1
  49 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.52`
- `seed` = `7411.00`
- `preload_duration_ms` = `43.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `15.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `28.61`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `79.98`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23552 ms  |  Sample ticks: 400

**FPS**  avg `110.33`, min `14.18`, p50 `110.91`, p95 `179.24`, p99 `757.55`, 1%low `25.67`, 0.1%low `16.05`, std `107.60`

**Frame time (ms)**  avg `12.90`, p50 `9.02`, p95 `24.23`, p99 `29.36`, p99.9 `50.14`, max `70.51`

**Client tick (ms)**  avg `0.43`, p95 `0.67`, max `2.11`

**Memory**  start `1444 MB`, end `2344 MB`, peak `3787 MB`, GC `21 events / 226 ms`

**FPS over sampling window (ASCII):**

```
177.4 |                   █                                                            
169.1 |                   █                                                            
160.7 |                   █             █                   █                          
152.4 |█                  █             █                   █                          
144.1 |█                █ █  █   █      █                   █                      ██  
135.7 |█                █ █  █   █ █    █       ██       █  █        █             ██ █
127.4 |█        █     █ █ █  █   █ █    █      ███       █  █        █ █   █ █     ██ █
119.0 |█     █  ██ █  █ █ █  █  ██ █    █      ███       ██ █        █ █  ████  █  ██ █
110.7 |█     █  ██ █  █ █ █  █  ████    ██     ███   █   ██ █      ███ █ █████  █  ██ █
102.3 |█   █ █ ███ █ ██ ███  ██ ████   ███ █ ██████ ██ ██████      ███ █ █████  ██ ██ █
 94.0 |█████ █████ ████████  ██ ████████████ █████████████████ █████████ ██████████████
 85.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms | ███  31
   2 ms | █  12
   3 ms | █  11
   4 ms | █  10
   5 ms | ██  23
   6 ms | ████  49
   7 ms | ██████████████  163
   8 ms | ████████████████████████████████████████  469
   9 ms | █████████  110
  10 ms | ███  39
  11 ms | ██  19
  12 ms | █  12
  13 ms |   4
  14 ms | █  6
  15 ms | ██  19
  16 ms | ██████  66
  17 ms | ███████  82
  18 ms | █████  61
  19 ms | ███████  81
  20 ms | ██████  65
  21 ms | ████  49
  22 ms | ███  40
  23 ms | ███  41
  24 ms | ███  32
  25 ms | █  17
  26 ms | █  9
  27 ms | █  8
  28 ms | █  6
  29 ms |   2
  30 ms |   1
  31 ms |   2
  32 ms |   1
  33 ms |   3
  35 ms |   1
  41 ms |   1
  42 ms |   1
  46 ms |   2
  54 ms |   1
  70 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.05`
- `seed` = `7417.00`
- `preload_duration_ms` = `500.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `25.67`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `56.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `77.54`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `106.55`, min `15.97`, p50 `111.18`, p95 `153.43`, p99 `556.21`, 1%low `28.33`, 0.1%low `18.15`, std `92.74`

**Frame time (ms)**  avg `12.52`, p50 `8.99`, p95 `23.03`, p99 `27.33`, p99.9 `43.55`, max `62.61`

**Client tick (ms)**  avg `0.39`, p95 `0.58`, max `2.53`

**Memory**  start `2636 MB`, end `2081 MB`, peak `3861 MB`, GC `18 events / 208 ms`

**FPS over sampling window (ASCII):**

```
157.6 |       █                                                                 █      
151.4 | █     █                         █                 █                     █      
145.2 | █     █                         █                 █                     █      
139.0 | █     █                         █               █ █                     █      
132.8 | █     █                         █      █        █ █                     █      
126.6 | █     █                        ██  █   █ █      █ █                     █ █    
120.4 | █    ██                        ██ ██  ██ █      █ █  █       █      █   ███    
114.3 | █    ██      █        █    █   ██████ ██ ██     █ █  █     █ ██     █   ███  █ 
108.1 | █    ██      █        ██   █   ██████ ██ ██     █ █  █     █ ██     ██  ███  █ 
101.9 | ██   ██     ██  █  █ ███ █ █   ██████ ██ ██   █ ███ ██ █   ████ █   ██  ████ █ 
 95.7 | █████████ █ ██████████████ █ █ ████████████ █████████████ █████████████████████
 89.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | ██  19
   2 ms | █  12
   3 ms |   4
   4 ms | █  9
   5 ms | █  13
   6 ms | █████  60
   7 ms | ███████████████████  222
   8 ms | ████████████████████████████████████████  459
   9 ms | ██████████  117
  10 ms | ███  34
  11 ms | ██  21
  12 ms |   5
  13 ms | █  9
  14 ms | █  11
  15 ms | ███  32
  16 ms | ████████  88
  17 ms | ████████████  140
  18 ms | █████  63
  19 ms | ██████  66
  20 ms | ████  51
  21 ms | ████  45
  22 ms | ███  34
  23 ms | ██  24
  24 ms | █  17
  25 ms | █  11
  26 ms | █  10
  27 ms |   5
  28 ms |   2
  29 ms |   4
  32 ms |   1
  33 ms |   1
  36 ms |   1
  40 ms |   3
  47 ms |   1
  62 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.15`
- `seed` = `7433.00`
- `preload_duration_ms` = `41.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `28.33`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `79.89`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `107.51`, min `19.23`, p50 `110.23`, p95 `146.56`, p99 `578.85`, 1%low `27.73`, 0.1%low `20.06`, std `96.78`

**Frame time (ms)**  avg `12.55`, p50 `9.07`, p95 `22.85`, p99 `28.14`, p99.9 `46.75`, max `52.01`

**Client tick (ms)**  avg `0.39`, p95 `0.54`, max `3.36`

**Memory**  start `2850 MB`, end `3408 MB`, peak `3846 MB`, GC `20 events / 214 ms`

**FPS over sampling window (ASCII):**

```
173.4 |                       █                                                        
165.6 |                       █                                                        
157.9 |                     █ █            █                                           
150.1 |                     █ █            █                                           
142.3 |                   █ █ █    █       █                     █                     
134.5 |         █    █    █ █ █    █       █  █                  █    █          █     
126.8 |  █      █    █   ██ █ █    █       █  █            █     █    █          █     
119.0 |  █ █    █    █   ████ █    █       █  █            █     █    █  █  █    █     
111.2 | ██ █    █    █ █ ████ █    █   █   █  ██          ██    ██    █  █  █    ██    
103.4 |███ ██   █    █ █ ████ █  ███ █ █   █  ██  ██   █  ██  █ ██ █ █████  █   ███ █  
 95.6 |███████████ ████████████████████████████████████████████ ████ █████████████████ 
 87.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | ██  24
   2 ms | █  13
   3 ms |   4
   4 ms |   5
   5 ms | █  9
   6 ms | ███  36
   7 ms | █████████████████████████  261
   8 ms | ████████████████████████████████████████  422
   9 ms | ███████████████  154
  10 ms | █████  48
  11 ms | █  12
  12 ms |   4
  13 ms |   1
  14 ms |   5
  15 ms | ██  20
  16 ms | ███████  71
  17 ms | ██████████  103
  18 ms | ██████████  101
  19 ms | ███████  72
  20 ms | █████  52
  21 ms | █████  57
  22 ms | ████  42
  23 ms | ███  29
  24 ms | █  13
  25 ms | █  8
  26 ms | █  6
  27 ms |   2
  28 ms |   3
  29 ms |   3
  30 ms |   1
  31 ms |   1
  32 ms |   1
  34 ms |   3
  43 ms |   1
  44 ms |   1
  46 ms |   1
  47 ms |   1
  52 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.06`
- `seed` = `7451.00`
- `preload_duration_ms` = `31.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-9.00`
- `entity_count_sample_start` = `10.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `27.73`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `79.66`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23200 ms  |  Sample ticks: 400

**FPS**  avg `103.61`, min `17.80`, p50 `109.90`, p95 `145.85`, p99 `518.05`, 1%low `27.83`, 0.1%low `19.92`, std `81.66`

**Frame time (ms)**  avg `12.65`, p50 `9.10`, p95 `23.38`, p99 `28.30`, p99.9 `42.44`, max `56.17`

**Client tick (ms)**  avg `0.39`, p95 `0.60`, max `2.96`

**Memory**  start `3504 MB`, end `3469 MB`, peak `3860 MB`, GC `21 events / 219 ms`

**FPS over sampling window (ASCII):**

```
152.0 |                         █                █                                     
145.8 |                         █                █                                     
139.5 | █                       █                █                            █        
133.2 | █ █     █               █                █                            █        
127.0 | █ █     █              ██                █      █                     █        
120.7 | █ █     █              ██                █     ██    ██               ██  █    
114.4 | █ █     █              ██                █     ██    ██ ██ █   ██     ██  █    
108.1 | █ █     █        █     ██            █   █  ██ ██   ███ ██ █   ███ █  ██ ██    
101.9 | █ ██    █       ██     █████ █      ██   ████████   ███ ████   █████  ██ ██    
 95.6 |██████ ███ ██ █  ███ █ ██████ ███  ████ ██████████████████████ ██████ ██████████
 89.3 |█████████████ ██████████████████████████████████████████████████████████████████
 83.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | █  15
   2 ms | █  13
   3 ms | █  6
   4 ms |   5
   5 ms | █  10
   6 ms | ████  44
   7 ms | ████████████████████████  252
   8 ms | ████████████████████████████████████████  415
   9 ms | █████████████  140
  10 ms | ████  41
  11 ms | ██  19
  12 ms | █  11
  13 ms |   3
  14 ms | █  7
  15 ms | ██  21
  16 ms | ██████████  103
  17 ms | ███████████  111
  18 ms | ████████  84
  19 ms | ██████  61
  20 ms | █████  57
  21 ms | ███  36
  22 ms | ████  37
  23 ms | ███  28
  24 ms | █  12
  25 ms | ██  18
  26 ms | █  12
  27 ms |   2
  28 ms |   3
  29 ms |   2
  30 ms |   2
  31 ms |   1
  33 ms |   1
  36 ms |   1
  38 ms |   3
  40 ms |   1
  41 ms |   1
  44 ms |   1
  56 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.92`
- `seed` = `7457.00`
- `preload_duration_ms` = `151.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-15.00`
- `entity_count_sample_start` = `16.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `27.83`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `79.07`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24646 ms  |  Sample ticks: 400

**FPS**  avg `104.09`, min `16.88`, p50 `111.13`, p95 `155.66`, p99 `473.18`, 1%low `24.41`, 0.1%low `18.29`, std `78.76`

**Frame time (ms)**  avg `12.80`, p50 `9.00`, p95 `24.02`, p99 `30.59`, p99.9 `49.86`, max `59.23`

**Client tick (ms)**  avg `0.44`, p95 `0.58`, max `8.93`

**Memory**  start `2051 MB`, end `3752 MB`, peak `3883 MB`, GC `22 events / 201 ms`

**FPS over sampling window (ASCII):**

```
166.9 |                                                      █                         
159.6 |                                                      █                         
152.2 |                        █                             █                         
144.9 |                        █                             █              █          
137.6 |                        █       █                     █              █          
130.2 |                        █       █      █              █              █          
122.9 |                  █  █  █       █      █         █ █  █   █  █       █    █     
115.6 |              █   █  █  █     █ █      ██        █ ██ █   █  █     █ █    ██    
108.2 |              █ ███  █  █ █   █ █   █  ██ ██     █ ██ █   █  █   █ ███ ██ ██  █ 
100.9 |    ██   █    █ ████ ██ █ ███ ████  █  ██ ██ █   ████ █  ██ ██ █ █ ███ ██ ██  ██
 93.6 | ██ ███████  ████████████████████████████████████████ ██████████████████████████
 86.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | █  13
   2 ms | █  16
   3 ms | █  10
   4 ms | █  7
   5 ms | █  17
   6 ms | ████  51
   7 ms | ████████████████  187
   8 ms | ████████████████████████████████████████  479
   9 ms | ██████████  116
  10 ms | ████  42
  11 ms | ██  21
  12 ms | █  12
  13 ms |   2
  14 ms | █  9
  15 ms | ██  26
  16 ms | ██████  67
  17 ms | ███████  78
  18 ms | ██████  67
  19 ms | ███████  80
  20 ms | █████  60
  21 ms | █████  56
  22 ms | ███  37
  23 ms | ██  29
  24 ms | ██  25
  25 ms | ██  18
  26 ms | █  10
  27 ms |   2
  28 ms |   4
  29 ms |   4
  31 ms |   1
  32 ms |   3
  33 ms |   2
  36 ms |   1
  38 ms |   1
  42 ms |   2
  43 ms |   1
  47 ms |   1
  48 ms |   1
  49 ms |   1
  50 ms |   1
  59 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.29`
- `seed` = `7477.00`
- `preload_duration_ms` = `1600.00`
- `entity_count_sample_end` = `3.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `24.41`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `78.13`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `113.56`, min `17.39`, p50 `112.11`, p95 `165.91`, p99 `736.46`, 1%low `28.70`, 0.1%low `18.08`, std `118.76`

**Frame time (ms)**  avg `12.51`, p50 `8.92`, p95 `23.14`, p99 `27.74`, p99.9 `52.39`, max `57.50`

**Client tick (ms)**  avg `0.42`, p95 `0.65`, max `5.45`

**Memory**  start `2479 MB`, end `2637 MB`, peak `3882 MB`, GC `21 events / 203 ms`

**FPS over sampling window (ASCII):**

```
175.7 |                        █                                                       
167.3 |                        █     █                                                 
159.0 |       █                █    ███    █    █  █                                   
150.6 |       █                █    ███    █    █  █                                   
142.3 |   █   █        █ █     █    ███  █ █    █  █     █               █             
133.9 |   █   █        █ █     █   ████  █ █    █  ██    █    █          █     █       
125.6 |   █   █        █ █     █   █████ █ █    ██ ██    ██   █  █ █     █ ██ ██ █     
117.2 | █ █   █   █   ██ █ █   █   █████ █ █ █  ██ ██    ██   ██ ███     █ ██ ██ ██  █ 
108.9 | █ █   █   █   ██ █ █ █ █   █████ ███ █  ██ ██  ████   ██ ███ █   █ ██ ██ ██ ██ 
100.5 |██ █  ████ █   ██ █ █ █ ██  █████ █████ ███ ███ ████   ██████ █  ██ ██ ██ █████ 
 92.2 |██████████ ███████████████ ████████████████████ ████████████████████████████████
 83.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  8
   1 ms | ██  27
   2 ms | █  16
   3 ms | █  7
   4 ms | █  7
   5 ms | █  14
   6 ms | ████  50
   7 ms | █████████████████  205
   8 ms | ████████████████████████████████████████  474
   9 ms | █████████  110
  10 ms | ████  49
  11 ms | █  16
  12 ms |   3
  13 ms |   1
  14 ms |   3
  15 ms | ███  30
  16 ms | ████████  89
  17 ms | █████████  103
  18 ms | ███████  78
  19 ms | ██████  67
  20 ms | █████  60
  21 ms | ████  51
  22 ms | ████  42
  23 ms | ██  27
  24 ms | ██  21
  25 ms | █  15
  26 ms | █  6
  27 ms |   5
  28 ms |   1
  29 ms |   1
  30 ms | █  6
  32 ms |   1
  39 ms |   1
  51 ms |   1
  53 ms |   1
  57 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `part` = `1.00`
- `fps_0p1pct_low` = `18.08`
- `seed` = `7481.00`
- `preload_duration_ms` = `51.00`
- `entity_count_sample_end` = `3.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-15.00`
- `entity_count_sample_start` = `18.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `28.70`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `61.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `79.91`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25101 ms  |  Sample ticks: 400

**FPS**  avg `109.27`, min `20.19`, p50 `111.28`, p95 `159.78`, p99 `642.45`, 1%low `27.74`, 0.1%low `20.85`, std `98.94`

**Frame time (ms)**  avg `12.48`, p50 `8.99`, p95 `23.06`, p99 `28.38`, p99.9 `45.29`, max `49.54`

**Client tick (ms)**  avg `0.41`, p95 `0.66`, max `2.08`

**Memory**  start `3551 MB`, end `2648 MB`, peak `3886 MB`, GC `26 events / 257 ms`

**FPS over sampling window (ASCII):**

```
151.8 |           █                                                                    
146.1 |           ██           █    ██   █                                             
140.5 |           ██           █    ██   █                                             
134.8 |  █        ██           █   ███  ██   █                  █                      
129.2 |  █        ██           █   ███  ██   █                  █                      
123.5 | ██    █   ██           █   ███  ██   █                  █        █ █      █    
117.8 | ██    █   ██ █     █   █   ████ ████ ██  █              ███      █ █      █    
112.2 | ██ ██ █   ██ █     █   █  █████ ████ ██  █     █        ███   █  █ ██     █    
106.5 | ██ ██ ██  ████     █   █  ██████████ ███ ███ ███        ███ █ █  █ ██ █   █    
100.9 |██████ ██ █████  █  █   █ ███████████ ███ ███ ███ ███    ███ █ ████ ██████ █    
 95.2 |██████ █████████ ██ █████ ███████████████ ███ ███████████████████████████████  █
 89.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms | ██  19
   2 ms | █  18
   3 ms | █  8
   4 ms | █  11
   5 ms | █  14
   6 ms | ████  52
   7 ms | ████████████████  191
   8 ms | ████████████████████████████████████████  485
   9 ms | ██████████  122
  10 ms | ████  51
  11 ms | ██  22
  12 ms | █  7
  13 ms |   2
  14 ms |   5
  15 ms | ██  26
  16 ms | ██████  72
  17 ms | █████████  107
  18 ms | ████████  97
  19 ms | █████  60
  20 ms | ████  54
  21 ms | █████  57
  22 ms | ███  34
  23 ms | ██  24
  24 ms | ██  19
  25 ms | █  8
  26 ms | █  7
  27 ms |   6
  28 ms |   5
  29 ms |   2
  31 ms |   2
  32 ms |   1
  33 ms |   2
  34 ms |   1
  38 ms |   1
  41 ms |   1
  42 ms |   1
  44 ms |   1
  46 ms |   1
  49 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.85`
- `seed` = `7487.00`
- `preload_duration_ms` = `2046.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `27.74`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `80.11`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `104.05`, min `20.64`, p50 `109.68`, p95 `149.83`, p99 `530.01`, 1%low `30.27`, 0.1%low `23.60`, std `88.88`

**Frame time (ms)**  avg `12.78`, p50 `9.12`, p95 `23.74`, p99 `28.77`, p99.9 `35.72`, max `48.44`

**Client tick (ms)**  avg `0.49`, p95 `0.77`, max `3.53`

**Memory**  start `3283 MB`, end `3224 MB`, peak `3878 MB`, GC `27 events / 258 ms`

**FPS over sampling window (ASCII):**

```
181.3 | █                                                         █                    
172.4 | █                                                         █                    
163.4 | █                                                         █                    
154.5 | █                                                         █                    
145.5 | █      █                                                  █  █                 
136.6 | █      █                                                  █  █                 
127.6 | █      █ ██ █                   █                         █  █    █            
118.7 | █      █ ██ █             █  █  █          █        ██  █ █  █  █ █      █     
109.8 | █      █ ██ █         █   ██ █  █   █  █ █ ██   ██  ██  █ █  █  █ █  █   █     
100.8 |██ █ █  ████████       █  ███ █  █ █ ██ █ ████   ██  ██ ██ ████ █████ █████    █
 91.9 |██████████████████ ███ ██████ █████████████████████████████████ ████████████████
 82.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | ██  16
   2 ms | █  10
   3 ms | █  12
   4 ms | █  10
   5 ms | █  12
   6 ms | ███  34
   7 ms | ██████████████████████  236
   8 ms | ████████████████████████████████████████  425
   9 ms | ████████████  124
  10 ms | █████  49
  11 ms | ██  16
  12 ms | █  6
  13 ms |   4
  14 ms | █  7
  15 ms | ██  26
  16 ms | █████  56
  17 ms | ███████████  119
  18 ms | ████████  86
  19 ms | ███████  77
  20 ms | █████  56
  21 ms | █████  52
  22 ms | ███  33
  23 ms | ██  26
  24 ms | ██  20
  25 ms | ██  17
  26 ms | █  12
  27 ms |   5
  28 ms |   4
  29 ms |   3
  30 ms |   1
  31 ms |   2
  32 ms |   1
  33 ms |   2
  34 ms |   1
  35 ms |   2
  36 ms |   1
  48 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `part` = `1.00`
- `fps_0p1pct_low` = `23.60`
- `seed` = `7499.00`
- `preload_duration_ms` = `57.00`
- `entity_count_sample_end` = `3.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-27.00`
- `entity_count_sample_start` = `30.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `30.27`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `53.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `78.27`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `107.97`, min `22.08`, p50 `111.87`, p95 `139.87`, p99 `733.89`, 1%low `32.12`, 0.1%low `22.33`, std `111.06`

**Frame time (ms)**  avg `12.48`, p50 `8.94`, p95 `22.80`, p99 `26.59`, p99.9 `39.32`, max `45.28`

**Client tick (ms)**  avg `0.34`, p95 `0.46`, max `1.90`

**Memory**  start `3164 MB`, end `3868 MB`, peak `3887 MB`, GC `27 events / 222 ms`

**FPS over sampling window (ASCII):**

```
170.7 |                                             █                                  
163.1 |      █                █                     █                                  
155.5 |      █                █        █            █                                  
147.9 |      █             █  █        █            █                              █   
140.3 |      █             █  █        █            █    █                    █    █   
132.7 |      █             █  █ █    ███     █      █    █     █          █   █    █  █
125.1 |      █    █        █  █ █    ███ █   █      █    █  █  █   █      █ █ █    █  █
117.5 |      █    █        █  █ ██   ███ █   █      █    █  █  █  ██      █ █ █    █  █
109.9 |      █  █ █        █  █ ██ █ ███ █   █      █ █  █  █  █  ██      █ ████   █  █
102.3 |      █  █ █  █ █   ██ █ ████ █████  ███ █ ███ ██ █  █  ██ ██  █   ██████ ███  █
 94.7 | █████████ ████ ████████████████████ ████████████ ██ █████ █████████████████████
 87.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  7
   1 ms | ██  21
   2 ms |   5
   3 ms |   5
   4 ms |   2
   5 ms |   5
   6 ms | ██  26
   7 ms | ███████████████  197
   8 ms | ████████████████████████████████████████  541
   9 ms | █████████  125
  10 ms | ██  31
  11 ms | █  10
  12 ms |   3
  13 ms |   5
  14 ms | █  11
  15 ms | ███  37
  16 ms | █████████  116
  17 ms | ███████  101
  18 ms | ██████  86
  19 ms | █████  71
  20 ms | ████  53
  21 ms | ███  39
  22 ms | ██  33
  23 ms | ██  29
  24 ms | █  11
  25 ms | █  14
  26 ms | █  7
  27 ms |   3
  28 ms |   3
  30 ms |   1
  32 ms |   1
  33 ms |   1
  36 ms |   1
  44 ms |   1
  45 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `part` = `1.00`
- `fps_0p1pct_low` = `22.33`
- `seed` = `7507.00`
- `preload_duration_ms` = `43.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`
- `fps_1pct_low` = `32.12`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `80.15`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `105.58`, min `14.72`, p50 `110.38`, p95 `148.76`, p99 `553.99`, 1%low `23.85`, 0.1%low `16.35`, std `93.63`

**Frame time (ms)**  avg `12.85`, p50 `9.06`, p95 `23.70`, p99 `29.28`, p99.9 `53.31`, max `67.96`

**Client tick (ms)**  avg `0.44`, p95 `0.69`, max `4.12`

**Memory**  start `3731 MB`, end `3771 MB`, peak `3871 MB`, GC `32 events / 284 ms`

**FPS over sampling window (ASCII):**

```
153.1 |                                                              █            █    
146.5 |        █      █                                   █          █            █    
139.9 |        █      █      █                            █          █            █ █  
133.4 |        █      █      █                            █          █            █ █  
126.8 |        █      █      █           ██  █            █    █  █  █        █   █ █ █
120.2 |       ███ █   █   █  █           ██  █   █        █    █  █  █   █    █   █ █ █
113.7 |       ███ █   █   █  █    █ █    ██  █   █        █    █  █  █   █    █   █ █ █
107.1 |  █   ████ █   █   █  █    █ █    ██  ██  █   █    █   ██  █  █   █  █ ██  █ █ █
100.5 |███  ███████ █ ███ ██ ██   █ █ █  ██  ███ █ █ █ █ ██   ███ █ ██   █  █ ██ ████ █
 94.0 |████████████ █ █████████ ███ █ ██ ███████████ ███ ████ ███ █ ███ ██  █████████ █
 87.4 |██████████████ █████████████████████████████████████████████████████████████████
 80.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms | ██  18
   2 ms |   5
   3 ms | █  11
   4 ms | █  15
   5 ms | █  8
   6 ms | ███  34
   7 ms | ████████████████████████  249
   8 ms | ████████████████████████████████████████  413
   9 ms | █████████████  130
  10 ms | ███  35
  11 ms | ███  28
  12 ms | █  12
  13 ms |   5
  14 ms | █  7
  15 ms | ██  17
  16 ms | ██████  58
  17 ms | █████████  90
  18 ms | ████████  86
  19 ms | ██████  67
  20 ms | ██████  57
  21 ms | █████  49
  22 ms | █████  50
  23 ms | ████  41
  24 ms | █  14
  25 ms | █  13
  26 ms | █  11
  27 ms |   4
  28 ms | █  6
  29 ms |   3
  30 ms |   1
  32 ms |   1
  33 ms |   1
  35 ms |   2
  36 ms |   1
  44 ms |   2
  47 ms |   2
  49 ms |   1
  52 ms |   1
  54 ms |   1
  67 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.35`
- `seed` = `7517.00`
- `preload_duration_ms` = `43.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-53.00`
- `entity_count_sample_start` = `54.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `23.85`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `55.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `77.79`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `106.22`, min `23.03`, p50 `111.13`, p95 `150.36`, p99 `682.52`, 1%low `30.63`, 0.1%low `23.41`, std `103.33`

**Frame time (ms)**  avg `12.84`, p50 `9.00`, p95 `23.69`, p99 `28.47`, p99.9 `38.74`, max `43.42`

**Client tick (ms)**  avg `0.38`, p95 `0.55`, max `3.91`

**Memory**  start `2916 MB`, end `3768 MB`, peak `3885 MB`, GC `34 events / 266 ms`

**FPS over sampling window (ASCII):**

```
179.6 |   █                                                                            
170.9 |   █                                                           █                
162.3 |   █                                          █                █        █       
153.6 |   █                                          █                █        █       
145.0 |   █                    █       █             █                █        █       
136.3 |   █     █              █       █         █   █ █              █        █       
127.6 |   █     █         █    █       █ █   ██  █   █ █              █  █     █       
119.0 |   ██    █      █  █    █       █ █ █ ███ █   █ █   █          █  █     ██      
110.3 |   ██   ██ █    █  █    █       █ █ █ ███ █   ███  ██          ██ █ █   ██      
101.7 |   ███  ████   ██  █ █  █     ███████ ███ █ █ ███  ███ █      ███ █ █ ████  █ ██
 93.0 |██ ███████████ ████████████ █████████████ ████████████ ██ ███████████████████ ██
 84.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms | ██  18
   2 ms | █  7
   3 ms | █  11
   4 ms | █  10
   5 ms | █  9
   6 ms | ███  37
   7 ms | █████████████████  205
   8 ms | ████████████████████████████████████████  478
   9 ms | ████████  101
  10 ms | ███  38
  11 ms | █  14
  12 ms | █  7
  13 ms |   4
  14 ms |   3
  15 ms | ███  30
  16 ms | █████  61
  17 ms | █████████  103
  18 ms | ████████  96
  19 ms | █████  64
  20 ms | █████  61
  21 ms | ████  47
  22 ms | ████  45
  23 ms | ███  35
  24 ms | ██  18
  25 ms | █  17
  26 ms | █  11
  27 ms | █  6
  28 ms | █  6
  29 ms |   2
  30 ms |   1
  31 ms |   1
  32 ms |   2
  33 ms |   2
  34 ms |   1
  36 ms |   1
  42 ms |   1
  43 ms |   1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `part` = `1.00`
- `fps_0p1pct_low` = `23.41`
- `seed` = `7523.00`
- `preload_duration_ms` = `35.00`
- `entity_count_sample_end` = `12.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-16.00`
- `entity_count_sample_start` = `28.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `30.63`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `77.87`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `102.99`, min `35.97`, p50 `115.33`, p95 `126.19`, p99 `692.06`, 1%low `39.86`, 0.1%low `36.60`, std `90.28`

**Frame time (ms)**  avg `12.30`, p50 `8.67`, p95 `21.74`, p99 `23.78`, p99.9 `26.54`, max `27.80`

**Client tick (ms)**  avg `0.29`, p95 `0.38`, max `0.68`

**Memory**  start `3672 MB`, end `3023 MB`, peak `3879 MB`, GC `26 events / 164 ms`

**FPS over sampling window (ASCII):**

```
152.7 |                              █                            █                    
146.4 |                              █                         █  █                    
140.1 |                █   █         █                         █  █ █                  
133.8 |         █      █   █ █       █                         █  █ █          █       
127.4 |      ██ █      █   █ █    █  ██  █                    ██  █ █         ██       
121.1 |      ██ █   █  █   ███    █  ██  █                    ██  █ █         ██       
114.8 |      ██ █   █  █   ███    █  ██  █                    ██  █ █         ██       
108.5 |      ██ █   █  █   ███    █  ██  █                    ██  █ █         ██       
102.2 |      ██ █ █ █  █   ████   █  ██  █    █ █   █         ██  █ ██        ███ ██   
 95.9 |█ ██████ █ ██████ █ ████ ███ ███ █████ █ ███ █ █ █ ██████ █████ ██ ██ ████ ██ ██
 89.6 |██████████████████████████████████████████████ ████████████████ ██ ██████████ ██
 83.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms | █  14
   5 ms |   1
   6 ms |   3
   7 ms | ████  89
   8 ms | ████████████████████████████████████████  854
   9 ms | ██  37
  10 ms | █  12
  11 ms |   9
  12 ms |   4
  13 ms |   1
  14 ms |   4
  15 ms | █  21
  16 ms | ██  53
  17 ms | ███████  142
  18 ms | █████  116
  19 ms | ████  82
  20 ms | ███  59
  21 ms | ███  54
  22 ms | █  32
  23 ms | █  20
  24 ms |   7
  25 ms |   4
  26 ms |   2
  27 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_1pct_low` = `39.86`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `39.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `36.60`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `81.29`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `110.79`, min `16.34`, p50 `112.12`, p95 `242.69`, p99 `270.19`, 1%low `21.21`, 0.1%low `17.77`, std `63.29`

**Frame time (ms)**  avg `13.20`, p50 `8.92`, p95 `33.04`, p99 `41.60`, p99.9 `51.21`, max `61.20`

**Client tick (ms)**  avg `4.06`, p95 `10.58`, max `18.29`

**Memory**  start `3799 MB`, end `2713 MB`, peak `3877 MB`, GC `23 events / 143 ms`

**FPS over sampling window (ASCII):**

```
137.2 |                                                                     █          
132.2 |                                                                     █          
127.1 |                                                 █             █     █          
122.1 | █             █           ██        █       ██  ██            █ █  ██         █
117.1 | ██ ██    ██   █        █ ███  ██ █  █      ███  ██ █       █  ███ ███   █   ███
112.0 | █████    ██   █     ████ ███ ███ ████      ████ ████   █   █  ███ ████  ██ ████
107.0 |██████ █ ███   █  █ █████████ ████████    ███████████  ██  ██ █████████ ███ ████
102.0 |████████████████  █ ██████████████████  ██████████████ ██████ ██████████████████
 96.9 |█████████████████ ████████████████████  ████████████████████████████████████████
 91.9 |██████████████████████████████████████  ████████████████████████████████████████
 86.9 |███████████████████████████████████████ ████████████████████████████████████████
 81.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █████████  62
   4 ms | ████████████████  111
   5 ms | ████████████████  111
   6 ms | █████████  62
   7 ms | ██████████████████████  150
   8 ms | ████████████████████████████████████████  271
   9 ms | █████████████  90
  10 ms | ██████  38
  11 ms | ████████  57
  12 ms | ████  28
  13 ms | █  10
  14 ms | █  7
  15 ms | ██  14
  16 ms | ████  26
  17 ms | ████████  53
  18 ms | █████████  59
  19 ms | ███████  48
  20 ms | ███████  48
  21 ms | ███████  50
  22 ms | █████  33
  23 ms | ████  24
  24 ms | ██  14
  25 ms | ██  15
  26 ms | ██  11
  27 ms |   3
  28 ms | █  8
  29 ms | █  4
  30 ms | █  6
  31 ms | █  6
  32 ms | ███  20
  33 ms | ██  13
  34 ms | ██  14
  35 ms | ██  12
  36 ms | █  6
  37 ms | █  6
  38 ms | █  4
  39 ms |   2
  40 ms |   3
  41 ms |   2
  42 ms |   3
  43 ms |   1
  44 ms |   1
  45 ms |   2
  47 ms |   2
  48 ms |   1
  50 ms |   1
  51 ms |   2
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `17.77`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `75.74`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `55.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `21.21`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `105.45`, min `24.65`, p50 `115.01`, p95 `128.39`, p99 `697.43`, 1%low `36.30`, 0.1%low `26.88`, std `105.00`

**Frame time (ms)**  avg `12.46`, p50 `8.69`, p95 `21.85`, p99 `24.71`, p99.9 `30.12`, max `40.57`

**Client tick (ms)**  avg `0.29`, p95 `0.38`, max `0.87`

**Memory**  start `3671 MB`, end `2628 MB`, peak `3865 MB`, GC `23 events / 147 ms`

**FPS over sampling window (ASCII):**

```
167.2 |                               █                                                
159.7 |                               █                                                
152.2 |                               █      █             █           █               
144.7 |█                              █      █             █           █               
137.2 |█                              █      █    █    █   █           █               
129.7 |██    █             █  █       █ █    █    █    ██  █           █               
122.2 |██    █           █ █  █       █ █    █    █    ██  █ █  █ █    █ █          █  
114.7 |██    █           █ █ ██      ██ █    █    █ █  ██ ██ █  █ █    █ █       █  █  
107.2 |██    █           █ █ ██      ██ █    █    █ █  ██ ██ █  █ █    █ ██   █  █  █  
 99.7 |██ █ ██ █ █    █  █ █ ██  █  ███ █ █ ████  █ █ ███ ██ █  █ ██   █ ██ █ █ ███ █ █
 92.2 |██████████████████████████████████████████████████████████████████████ █ ███ ███
 84.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms | █  19
   2 ms |   3
   3 ms |   1
   4 ms |   1
   6 ms |   2
   7 ms | ███████  132
   8 ms | ████████████████████████████████████████  759
   9 ms | ███  59
  10 ms | █  11
  11 ms |   6
  12 ms |   4
  13 ms |   3
  14 ms |   2
  15 ms | █  10
  16 ms | ███  50
  17 ms | ██████  119
  18 ms | ███████  126
  19 ms | ████  85
  20 ms | ████  75
  21 ms | ███  62
  22 ms | █  28
  23 ms | █  17
  24 ms | █  11
  25 ms |   3
  26 ms |   8
  27 ms |   2
  33 ms |   1
  40 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `fps_0p1pct_low` = `26.88`
- `seed` = `9043.00`
- `preload_duration_ms` = `44.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `36.30`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3190.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `80.26`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `103.81`, min `17.76`, p50 `114.91`, p95 `126.94`, p99 `722.26`, 1%low `36.30`, 0.1%low `23.98`, std `95.84`

**Frame time (ms)**  avg `12.59`, p50 `8.70`, p95 `22.07`, p99 `24.89`, p99.9 `26.90`, max `56.29`

**Client tick (ms)**  avg `0.30`, p95 `0.39`, max `0.69`

**Memory**  start `2850 MB`, end `3836 MB`, peak `3878 MB`, GC `22 events / 146 ms`

**FPS over sampling window (ASCII):**

```
147.3 |                         █           █             █                            
141.3 |                █        █           █             █  █                  █   █  
135.4 |             █  █        █      █    █   █  █      █  █                  █   ██ 
129.4 |   █         █  █       ██      █    ██ ██  █  █   █  █                  █   ██ 
123.4 |   █ █  █  █ █  █       ██      █    ██ ██  █  █   █  █     █            █   ██ 
117.4 |   █ █  ██ █ █  █       ██      █    ██ ██  █  █   █  █     █            ██  ██ 
111.4 |   ███  ██ █ █  █       ██      █    ██ ██  █  █   █  █     █            ██  ██ 
105.5 |   ███  ██ █ █  █       ██      █    ██ ██  █  █   █  █     █            ██  ██ 
 99.5 |   ███  ██ █ █  █  █ █  ██     ██ █  █████  █ ██ █ █  █ ██  █    ██    █ ███ ██ 
 93.5 |██ █████████ █  ███████ ████ █ ██ ███████████ ████ ████ ███████  ██ ██ █████ ██ 
 87.5 |███████████████████████ ████████████████████████████████████████████████████████
 81.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | █  23
   3 ms |   2
   6 ms |   6
   7 ms | █████  89
   8 ms | ████████████████████████████████████████  791
   9 ms | ██  39
  10 ms | █  15
  11 ms |   9
  12 ms |   6
  14 ms |   4
  15 ms |   9
  16 ms | ██  40
  17 ms | █████  102
  18 ms | ███████  134
  19 ms | ██████  113
  20 ms | ████  82
  21 ms | ██  42
  22 ms | ██  43
  23 ms | █  19
  24 ms |   7
  25 ms |   9
  26 ms |   2
  27 ms |   1
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `36.30`
- `fps_harmonic_avg` = `79.44`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `23.98`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `38.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `107.09`, min `37.90`, p50 `115.34`, p95 `126.88`, p99 `727.72`, 1%low `39.59`, 0.1%low `37.98`, std `108.87`

**Frame time (ms)**  avg `12.50`, p50 `8.67`, p95 `22.14`, p99 `24.56`, p99.9 `26.01`, max `26.38`

**Client tick (ms)**  avg `0.32`, p95 `0.39`, max `8.52`

**Memory**  start `3708 MB`, end `3868 MB`, peak `3871 MB`, GC `22 events / 137 ms`

**FPS over sampling window (ASCII):**

```
158.7 |                               █               █                  █             
151.3 |                             █ █               █                  █             
143.9 | █               █           █ █               █                  █  █          
136.5 | █               ██          █ █             █ █                  █  █          
129.1 | █     █ █       ███     █   █ █    █    █   █ █            ███ █ █  █     █    
121.7 |██     █ █       ███     █   █ █    ██   █   █ ██    █      ███ █ █ ██     █    
114.3 |██     ███       ███     █   █ █    ██   █   █ ██    █      ███ █ █ ███    █  █ 
106.9 |██     ███       ███     █   █ █    ██ ███   █ ██    █      ███ █ █ ███    █  █ 
 99.5 |██  █  ████ █  █ ████  █ ██ ████    ██ ████ ██████   █     ██████ █████ █  █  ██
 92.1 |███████████ ██ ███████████████████  ██ █████████████████   ██████ ██████████████
 84.7 |███████████████████████████████████ ████████████████████████████████████████████
 77.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   5
   1 ms | █  27
   2 ms |   1
   3 ms |   1
   4 ms |   2
   6 ms |   1
   7 ms | ████  89
   8 ms | ████████████████████████████████████████  803
   9 ms | ██  31
  10 ms | █  14
  11 ms | █  11
  12 ms |   5
  13 ms |   2
  14 ms |   3
  15 ms |   8
  16 ms | ██  50
  17 ms | ██████  123
  18 ms | ██████  123
  19 ms | █████  91
  20 ms | ███  64
  21 ms | ███  57
  22 ms | ██  42
  23 ms | █  23
  24 ms | █  14
  25 ms |   8
  26 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `39.59`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `80.01`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `37.98`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `60.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `104.89`, min `34.98`, p50 `115.15`, p95 `127.73`, p99 `665.83`, 1%low `39.55`, 0.1%low `36.39`, std `93.70`

**Frame time (ms)**  avg `12.49`, p50 `8.68`, p95 `21.90`, p99 `24.00`, p99.9 `26.18`, max `28.59`

**Client tick (ms)**  avg `0.34`, p95 `0.43`, max `8.14`

**Memory**  start `2627 MB`, end `3592 MB`, peak `3869 MB`, GC `21 events / 123 ms`

**FPS over sampling window (ASCII):**

```
151.5 |         █         █                                                    █       
145.6 |         █         █                               █             █      █       
139.7 |         █         █           █                   █  █          █      █       
133.9 |         █         █           █                   █  █          █      █       
128.0 |         █        ██           █                 █ ██ █  █       █  █   █   █   
122.1 |         █        ██ █         █    █            █ ██ █  ██ █    █  █   █   █   
116.3 |         █        ██ ██      █ █    █        █   █ ██ █  ██ █ █  █  █   █   █   
110.4 |       █ █  █     █████      █ █    █  ██    █   █ ██ █  ██ █ █  █  █   █   █   
104.5 |       ███  █     █████      █ █    █  ██    █   █ ██ █  ██ █ █  █  █ █ █   █   
 98.7 | █  █  ███ ███ █  ██████   █ ███    ██ ██   ██ █ █ █████ ██ ███ ███ █ ████ ██ █ 
 92.8 | █████████████████████████ ████████████████ ██ ███ █████ ██████ ███ ███████████ 
 86.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   2
   1 ms | █  28
   2 ms |   2
   4 ms |   1
   5 ms |   1
   6 ms |   1
   7 ms | ██████  114
   8 ms | ████████████████████████████████████████  781
   9 ms | ██  48
  10 ms |   9
  11 ms |   5
  12 ms |   3
  13 ms |   1
  15 ms |   9
  16 ms | █  28
  17 ms | ██████  115
  18 ms | ███████  141
  19 ms | █████  105
  20 ms | ███  67
  21 ms | ███  64
  22 ms | ██  36
  23 ms | █  23
  24 ms |   9
  25 ms |   5
  26 ms |   2
  28 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `36.39`
- `seed` = `8053.00`
- `preload_duration_ms` = `25.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `39.55`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `80.04`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 196052 ms  |  Sample ticks: 3600

**FPS**  avg `97.74`, min `0.58`, p50 `107.54`, p95 `180.43`, p99 `278.90`, 1%low `16.22`, 0.1%low `4.87`, std `52.52`

**Frame time (ms)**  avg `14.31`, p50 `9.30`, p95 `32.97`, p99 `42.83`, p99.9 `56.13`, max `1739.00`

**Client tick (ms)**  avg `0.97`, p95 `1.34`, max `15.75`

**Memory**  start `2781 MB`, end `3053 MB`, peak `3958 MB`, GC `406 events / 3095 ms`

**FPS over sampling window (ASCII):**

```
110.0 |                                                                      █         
106.9 |                                        ████     █          █        ██      ██ 
103.7 |                                  ███   ████     █    █ █   █     █████    █ ███
100.5 |█                                ███████████   ████   ███████    ███████████████
 97.3 |█   ███      ███    █            ███████████   ████ ████████████████████████████
 94.1 |█  █████   █ ███    █ ██  ██     █████████████ ████ ████████████████████████████
 90.9 |█  ██████████████ ██████  ██████████████████████████████████████████████████████
 87.7 |█ ███████████████ ███████ ██████████████████████████████████████████████████████
 84.6 |█ ██████████████████████████████████████████████████████████████████████████████
 81.4 |█ ██████████████████████████████████████████████████████████████████████████████
 78.2 |█ ██████████████████████████████████████████████████████████████████████████████
 75.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   34
   3 ms | ███  207
   4 ms | ████  273
   5 ms | ███  213
   6 ms | ████████  583
   7 ms | ██████████████████████  1578
   8 ms | ████████████████████████████████████████  2907
   9 ms | ████████████████████  1445
  10 ms | ███████  477
  11 ms | ███  197
  12 ms | █  99
  13 ms | █  59
  14 ms |   25
  15 ms |   21
  16 ms |   34
  17 ms | █  63
  18 ms | ███  253
  19 ms | ███████  479
  20 ms | ████████  577
  21 ms | ████████  613
  22 ms | ███████  527
  23 ms | ██████  442
  24 ms | █████  368
  25 ms | ███  223
  26 ms | ██  128
  27 ms | █  88
  28 ms | █  52
  29 ms |   30
  30 ms |   23
  31 ms |   4
  32 ms |   12
  33 ms |   24
  34 ms | █  43
  35 ms | █  64
  36 ms | █  68
  37 ms | █  69
  38 ms | █  64
  39 ms | █  60
  40 ms | █  64
  41 ms |   28
  42 ms |   31
  43 ms |   35
  44 ms |   23
  45 ms |   17
  46 ms |   10
  47 ms |   7
  48 ms |   5
  49 ms |   1
  50 ms |   2
  51 ms |   2
  52 ms |   1
  53 ms |   1
  55 ms |   1
  58 ms |   1
  63 ms |   1
  65 ms |   1
  67 ms |   1
  68 ms |   1
  74 ms |   1
  75 ms |   1
  78 ms |   2
  84 ms |   1
  95 ms |   1
 118 ms |   1
1738 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `86.00`
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
- `fps_0p1pct_low` = `4.87`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `69.89`
- `fps_1pct_low` = `16.22`
- `blocks_placed` = `3096347.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195528 ms  |  Sample ticks: 3600

**FPS**  avg `100.24`, min `8.44`, p50 `106.52`, p95 `194.49`, p99 `291.31`, 1%low `20.94`, 0.1%low `14.55`, std `56.20`

**Frame time (ms)**  avg `14.13`, p50 `9.39`, p95 `34.79`, p99 `43.04`, p99.9 `50.21`, max `118.43`

**Client tick (ms)**  avg `0.98`, p95 `1.36`, max `11.42`

**Memory**  start `3244 MB`, end `3246 MB`, peak `3884 MB`, GC `551 events / 3847 ms`

**FPS over sampling window (ASCII):**

```
111.5 |                                     █  █                                       
109.5 |                                     █  █       █      █ █          █         █ 
107.4 |                                     █ ███ █    █ █   ██ █       █  █    ██   ██
105.4 |                                     █████ █    ███   █████ █   ██ ████████ █ ██
103.3 |              █                  ███████████    ███   █████ █   ███████████ ████
101.3 |      █       ██                 ████████████   ███   ████████ █████████████████
 99.2 |█    ██       ██           █     ████████████   ████ ███████████████████████████
 97.2 |█    ███     ███    ██     █     ████████████   ████ ███████████████████████████
 95.1 |█ █ ████   █ ███   ████   ██     ████████████   ████ ███████████████████████████
 93.1 |█ █ █████ ██ ████ ███████ ██   ███████████████ █████████████████████████████████
 91.0 |██████████████████████████████ █████████████████████████████████████████████████
 89.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   2 ms | █  50
   3 ms | ████  241
   4 ms | █████  300
   5 ms | ███████  400
   6 ms | ██████████████  864
   7 ms | █████████████████████████  1536
   8 ms | ████████████████████████████████████████  2444
   9 ms | ███████████████████  1190
  10 ms | ███████████  663
  11 ms | ████  270
  12 ms | ██  98
  13 ms | █  66
  14 ms | █  57
  15 ms | █  31
  16 ms | █  54
  17 ms | ██  151
  18 ms | ████  267
  19 ms | ███████  436
  20 ms | █████████  539
  21 ms | ████████  505
  22 ms | ████████  505
  23 ms | ███████  432
  24 ms | █████  307
  25 ms | ████  248
  26 ms | ███  156
  27 ms | ██  101
  28 ms | █  54
  29 ms |   29
  30 ms |   16
  31 ms |   11
  32 ms |   17
  33 ms |   28
  34 ms | █  51
  35 ms | █  60
  36 ms | █  52
  37 ms | █  76
  38 ms | █  69
  39 ms | █  73
  40 ms | █  68
  41 ms | █  45
  42 ms | █  48
  43 ms |   24
  44 ms | █  37
  45 ms |   21
  46 ms |   11
  47 ms |   12
  48 ms |   7
  49 ms |   3
  50 ms |   2
  51 ms |   2
  53 ms |   1
  57 ms |   1
  63 ms |   1
  65 ms |   1
  74 ms |   1
  78 ms |   1
  85 ms |   1
  91 ms |   1
 118 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `entity_count_sample_end` = `87.00`
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
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `14.55`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `70.76`
- `fps_1pct_low` = `20.94`
- `blocks_placed` = `3096347.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194200 ms  |  Sample ticks: 3600

**FPS**  avg `95.21`, min `2.63`, p50 `94.80`, p95 `227.42`, p99 `303.82`, 1%low `19.68`, 0.1%low `11.97`, std `63.88`

**Frame time (ms)**  avg `16.85`, p50 `10.55`, p95 `42.56`, p99 `45.94`, p99.9 `48.85`, max `380.31`

**Client tick (ms)**  avg `0.70`, p95 `0.92`, max `5.20`

**Memory**  start `3147 MB`, end `3484 MB`, peak `3884 MB`, GC `71 events / 213 ms`

**FPS over sampling window (ASCII):**

```
115.4 |                                                                      █         
112.6 |                                                                      █         
109.7 |                                                                      █         
106.9 |                                               █        █             █      █  
104.0 |                                               █        █        █    ██     ██ 
101.2 |       █                                       █       ███       █  █ ███ ██ ██ 
 98.3 |     ███                                 █ █   ███     ███ █    ████████████████
 95.5 |█  █ ███      █     █    █  ██     ███ █ █ █  ████   ███████   █████████████████
 92.6 |█████████ █  ███    ██████████     █████████  ████   █████████ █████████████████
 89.8 |████████████ ████   ██████████    ████████████████ █████████████████████████████
 87.0 |██████████████████ ███████████  ████████████████████████████████████████████████
 84.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  51
   3 ms | ████████  308
   4 ms | █████████  361
   5 ms | ████████  292
   6 ms | ██████████████  545
   7 ms | ███████████████████████████████████  1348
   8 ms | ████████████████████████████████████████  1530
   9 ms | ███████████████████  730
  10 ms | ████████  317
  11 ms | ████████  311
  12 ms | ████████  295
  13 ms | ███  114
  14 ms | █  22
  15 ms |   8
  16 ms |   7
  17 ms |   6
  18 ms | ██  58
  19 ms | ████  143
  20 ms | ████████  323
  21 ms | ███████████  429
  22 ms | ██████████  364
  23 ms | ██████  244
  24 ms | ██████  248
  25 ms | ██████  223
  26 ms | █████  206
  27 ms | ██████  214
  28 ms | █████  193
  29 ms | █████  209
  30 ms | ██████  243
  31 ms | █████  176
  32 ms | ███  113
  33 ms | █  50
  34 ms | █  32
  35 ms | █  30
  36 ms | █  54
  37 ms | ██  59
  38 ms | █  36
  39 ms | ██  60
  40 ms | ██  64
  41 ms | ██  75
  42 ms | ███  119
  43 ms | ████  146
  44 ms | ███  133
  45 ms | ██  90
  46 ms | █  46
  47 ms | █  32
  48 ms |   16
  49 ms |   4
  50 ms |   1
  51 ms |   2
  59 ms |   1
  79 ms |   1
 380 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `entity_count_sample_end` = `87.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
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
- `fps_0p1pct_low` = `11.97`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `59.35`
- `fps_1pct_low` = `19.68`
- `blocks_placed` = `3096347.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 196511 ms  |  Sample ticks: 3600

**FPS**  avg `62.86`, min `1.69`, p50 `38.55`, p95 `208.50`, p99 `270.07`, 1%low `14.11`, 0.1%low `5.75`, std `60.20`

**Frame time (ms)**  avg `27.95`, p50 `25.94`, p95 `54.00`, p99 `58.24`, p99.9 `65.60`, max `591.03`

**Client tick (ms)**  avg `0.76`, p95 `1.02`, max `6.35`

**Memory**  start `3006 MB`, end `3383 MB`, peak `3884 MB`, GC `64 events / 297 ms`

**FPS over sampling window (ASCII):**

```
104.2 |         █                                                                      
 97.3 |       ███                                                                      
 90.5 |       ████ ████                                   █                            
 83.6 |      ██████████████      █   █   █       █ ██████ █                            
 76.7 |    ████████████████████████████  █ █ █ ████████████                            
 69.8 | ███████████████████████████████████████████████████                            
 63.0 |█████████████████████████████████████████████████████                           
 56.1 |█████████████████████████████████████████████████████                           
 49.2 |█████████████████████████████████████████████████████                           
 42.4 |█████████████████████████████████████████████████████                           
 35.5 |█████████████████████████████████████████████████████    █  ██                  
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   2
   3 ms | █████████████████████  124
   4 ms | ████████████████████████████████████████  237
   5 ms | ████████████████████████████████████  214
   6 ms | █████████████████████████████████  196
   7 ms | ███████████████████████  136
   8 ms | ██████████████████  107
   9 ms | ████████████████████  117
  10 ms | ███████████████████  113
  11 ms | ███████████████████████  135
  12 ms | ██████████████████████████  156
  13 ms | ████████████████████████  141
  14 ms | ████████████████████  121
  15 ms | ████████████████████████  140
  16 ms | ████████████████████  120
  17 ms | ██████████████  82
  18 ms | █████████████  75
  19 ms | █████████████  78
  20 ms | ██████████████████  109
  21 ms | ███████████████████████  135
  22 ms | ██████████████████████████  154
  23 ms | ██████████████████████████  152
  24 ms | ██████████████████████████████  175
  25 ms | █████████████████████████████████████  219
  26 ms | █████████████████████████████  170
  27 ms | ████████████████████████  144
  28 ms | ████████████  70
  29 ms | ████████  48
  30 ms | ████  25
  31 ms | ██████████████  83
  32 ms | ███████████████████████████  162
  33 ms | ██████████████████████████  155
  34 ms | ███████████████████████████  158
  35 ms | ██████████████  83
  36 ms | ████████████  74
  37 ms | ██████████████  81
  38 ms | █████████████████  100
  39 ms | ████████████████  95
  40 ms | ██████████████  82
  41 ms | ███████████████  89
  42 ms | ███████████████  88
  43 ms | █████████████████  99
  44 ms | ███████████████████████  136
  45 ms | ██████████████████  104
  46 ms | █████████████████  102
  47 ms | █████████████████  98
  48 ms | ███████████████  86
  49 ms | ███████████████████  113
  50 ms | ███████████████████  110
  51 ms | ███████████████████  111
  52 ms | ████████████████████  116
  53 ms | █████████████████  101
  54 ms | █████████████  75
  55 ms | ████████████  70
  56 ms | ███████████  68
  57 ms | ██████  35
  58 ms | █████  29
  59 ms | ███  19
  60 ms | █  8
  61 ms | █  4
  62 ms |   2
  63 ms | █  3
  64 ms |   2
  65 ms | █  3
  67 ms |   1
  80 ms |   1
 111 ms |   1
 127 ms |   1
 591 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `20.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `68.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `5.75`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `35.78`
- `fps_1pct_low` = `14.11`
- `blocks_placed` = `3096347.00`

