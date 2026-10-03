# MC Benchmark Core session — 2026-09-25T07:42:34.023993818+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 118.1 | 11.8 | 9.2 | 67.09 | 2.47 | 65 | 1886 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 114.4 | 11.1 | 6.1 | 63.22 | 1.74 | 67 | 2653 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 106.5 | 12.9 | 8.7 | 62.47 | 1.80 | 57 | 2766 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 32.0 | 8.4 | 7.7 | 105.83 | 1.65 | 58 | 1475 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 31.4 | 8.2 | 7.1 | 106.24 | 1.96 | 47 | 2414 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 29.6 | 8.9 | 8.0 | 95.21 | 1.12 | 41 | 3284 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 30.3 | 8.4 | 7.3 | 104.32 | 1.78 | 34 | 1209 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 31.6 | 8.4 | 7.4 | 104.70 | 2.56 | 44 | 1245 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 34.9 | 8.3 | 7.7 | 104.92 | 5.75 | 25 | 3360 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 30.7 | 7.7 | n/a | 99.38 | 7.71 | 31 | 1353 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 31.5 | 8.0 | 6.1 | 99.63 | 2.04 | 27 | 1136 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 30.1 | 8.8 | 7.3 | 102.33 | 1.22 | 31 | 976 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 33.6 | 8.7 | 7.8 | 103.21 | 7.52 | 34 | 1238 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 33.3 | 8.3 | 7.8 | 108.49 | 7.26 | 36 | 527 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 25.2 | 5.5 | n/a | 177.84 | 28.11 | 30 | 1410 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 24.9 | 5.1 | n/a | 170.90 | 27.61 | 32 | 2264 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 30.7 | 8.5 | 7.6 | 105.44 | 4.38 | 33 | 643 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 33.6 | 7.1 | 4.7 | 111.76 | 4.69 | 34 | 1666 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 30.3 | 7.5 | 5.9 | 106.55 | 1.87 | 33 | 1958 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 21.0 | 5.5 | n/a | 163.04 | 0.76 | 34 | 948 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 10.1 | 5.4 | n/a | 180.08 | 1.04 | 29 | 2903 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 9.9 | 5.2 | n/a | 176.36 | 1.10 | 32 | 2058 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 10.0 | 3.8 | n/a | 211.30 | 0.82 | 35 | 1870 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 10.6 | 3.2 | n/a | 257.37 | 1.14 | 12 | 1464 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 11.6 | 2.0 | n/a | 439.71 | 1.34 | 10 | 985 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 10.9 | 3.5 | n/a | 227.52 | 1.16 | 12 | 1095 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 10.1 | 6.1 | n/a | 161.38 | 1.19 | 13 | 1479 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 12.0 | 0.8 | n/a | 1167.33 | 2.05 | 14 | 190 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 10.5 | 4.3 | n/a | 202.00 | 1.31 | 16 | 211 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 10.1 | 4.3 | n/a | 181.15 | 1.09 | 19 | 329 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 11.5 | 3.5 | n/a | 163.77 | 0.87 | 18 | 218 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 10.4 | 6.7 | n/a | 142.38 | 1.27 | 24 | 200 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 10.7 | 6.1 | n/a | 159.78 | 0.81 | 23 | 79 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 10.5 | 6.0 | n/a | 154.15 | 1.03 | 27 | 413 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 10.4 | 6.2 | n/a | 156.56 | 1.06 | 27 | 589 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 10.1 | 7.0 | n/a | 139.15 | 0.77 | 95 | 1258 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 11.0 | 1.6 | n/a | 184.22 | 14.77 | 85 | 774 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 10.1 | 1.8 | n/a | 150.01 | 0.86 | 89 | 1975 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 10.0 | 1.0 | n/a | 270.26 | 0.87 | 109 | 915 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 10.0 | 1.0 | n/a | 269.66 | 0.94 | 107 | 1017 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 10.0 | 1.0 | n/a | 248.52 | 1.00 | 125 | 1057 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 10.4 | 0.8 | 0.5 | 1103.10 | 2.60 | 1171 | 1207 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 10.8 | 0.9 | 0.8 | 1118.92 | 2.61 | 1180 | 620 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.2 | 3.2 | 0.9 | 146.23 | 1.27 | 341 | 657 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.2 | 6.9 | 6.4 | 139.45 | 1.16 | 215 | 68 |

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

Category: **Particles**  |  Duration: 23003 ms  |  Sample ticks: 400

**FPS**  avg `118.14`, min `9.23`, p50 `105.08`, p95 `281.34`, p99 `573.87`, 1%low `11.81`, 0.1%low `9.23`, std `100.65`

**Frame time (ms)**  avg `14.46`, p50 `9.52`, p95 `36.83`, p99 `67.09`, p99.9 `94.29`, max `108.39`

**Client tick (ms)**  avg `2.47`, p95 `6.79`, max `39.72`

**Memory**  start `990 MB`, end `1422 MB`, peak `2877 MB`, GC `65 events / 1591 ms`

**FPS over sampling window (ASCII):**

```
195.2 |                                                                               █
181.2 |                                                                               █
167.1 |                                                              ██   █           █
153.1 |                                              █          █ █  ██   █           █
139.1 |        █                    █ █              █   █      █ █  ██   █ █     █ █ █
125.1 |    █  ██   █ █  ██ █  ████  █ █   █ █ ██  █  ███ █  ███ ████ ██ ███ ██   ████ █
111.1 |    █  ██   ███ ███ ███████  █████ ██████████ █████  ████████████████████ ████ █
 97.1 |█████  ███ ████ ███████████ ███████████████████████  ███████████████████████████
 83.0 |█████  █████████████████████████████████████████████████████████████████████████
 69.0 |█████  █████████████████████████████████████████████████████████████████████████
 55.0 |█████ ██████████████████████████████████████████████████████████████████████████
 41.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████  22
   2 ms | ███████  34
   3 ms | ███████  33
   4 ms | ██████████  48
   5 ms | ████████████  60
   6 ms | ██████████████████  90
   7 ms | █████████████████████████  125
   8 ms | ████████████████████████████████████████  202
   9 ms | ██████████████████████████  131
  10 ms | ███████████████████  97
  11 ms | ███████████  57
  12 ms | █████████  44
  13 ms | ████████  38
  14 ms | ████  21
  15 ms | ███  17
  16 ms | ███  14
  17 ms | ██  9
  18 ms | ██  9
  19 ms | ██  10
  20 ms | ██  11
  21 ms | ███  15
  22 ms | ████  20
  23 ms | █████  24
  24 ms | ██████  29
  25 ms | █████  26
  26 ms | █████  27
  27 ms | █████  24
  28 ms | ████  20
  29 ms | ███  17
  30 ms | ███  16
  31 ms | ██  8
  32 ms | █  5
  33 ms | █  3
  34 ms |   2
  35 ms | █  4
  36 ms | █  3
  37 ms | █  4
  38 ms |   1
  39 ms |   2
  41 ms | █  3
  42 ms |   1
  43 ms |   1
  45 ms | █  3
  46 ms |   1
  47 ms | █  3
  48 ms |   2
  49 ms | █  4
  50 ms | █  5
  52 ms |   1
  53 ms |   2
  54 ms |   1
  55 ms |   2
  56 ms |   1
  57 ms | █  4
  58 ms |   1
  59 ms |   1
  60 ms |   2
  61 ms |   2
  62 ms |   1
  64 ms |   2
  65 ms |   1
  66 ms |   2
  67 ms |   2
  68 ms |   1
  72 ms |   1
  76 ms |   1
  80 ms |   1
  83 ms |   1
  84 ms |   1
  86 ms |   1
  88 ms |   1
  90 ms |   1
  91 ms |   2
  95 ms |   1
 108 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dripping_water` | 240 | 172 | 96.4 | 64.78 |
| `dragon_breath` | 160 | 172 | 109.7 | 66.98 |
| `end_rod` | 240 | 172 | 117.8 | 57.50 |
| `portal` | 160 | 172 | 117.7 | 53.98 |
| `ALL_TOGETHER` | 1680 | 172 | 122.5 | 61.89 |
| `sculk_charge_pop` | 240 | 172 | 120.0 | 57.77 |
| `smoke` | 160 | 172 | 132.6 | 50.74 |
| `flame` | 160 | 172 | 128.8 | 72.46 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `3.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `69.16`
- `fps_0p1pct_low` = `9.23`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `11.81`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `114.43`, min `6.06`, p50 `106.78`, p95 `275.01`, p99 `505.21`, 1%low `11.10`, 0.1%low `6.06`, std `86.40`

**Frame time (ms)**  avg `14.15`, p50 `9.36`, p95 `32.72`, p99 `63.22`, p99.9 `133.33`, max `165.08`

**Client tick (ms)**  avg `1.74`, p95 `4.54`, max `32.99`

**Memory**  start `717 MB`, end `2029 MB`, peak `3370 MB`, GC `67 events / 1593 ms`

**FPS over sampling window (ASCII):**

```
154.0 |          █                                  █                                  
146.3 |  █       █            █                     █                         █        
138.7 |  █       █            ██                    █          ██             █        
131.1 |  █  █    █   █    █   ███          █        █      █   ██     █       █        
123.5 |  ██ █    █   ██   ██  ███  █ █  █ ██ █  █   █  ██  █   ██     █      ██ █      
115.9 |  ██ █ ██ █ █ ████ ██████████ ██ ██████  █████ ███  ███ ████  █████  ███ ██ █  █
108.3 |  ██ █ ████ █ ████ ██████████ █████████  █████ ███  ███ █████ ██████████ ██ █  █
100.7 |  ████ ███████████ ██████████ █████████  █████ ███  █████████ ███████████████ ██
 93.1 |█ ████ ███████████ ██████████ █████████████████████ █████████ ██████████████████
 85.5 |█ ████████████████ ██████████████████████████████████████████ ██████████████████
 77.9 |█████████████████████████████████████████████████████████████ ██████████████████
 70.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███  16
   2 ms | █████  31
   3 ms | ██████  35
   4 ms | ██████  39
   5 ms | ██████  38
   6 ms | ████████████  78
   7 ms | ███████████████████████  148
   8 ms | ████████████████████████████████████████  254
   9 ms | ████████████████████████████  180
  10 ms | ████████████████  100
  11 ms | █████████  55
  12 ms | ██████  41
  13 ms | ███  22
  14 ms | ██  11
  15 ms | █  6
  16 ms | █  8
  17 ms | █  5
  18 ms | █  9
  19 ms | █  6
  20 ms | ██  12
  21 ms | ██  12
  22 ms | ███  17
  23 ms | ████  28
  24 ms | ███████  45
  25 ms | █████  31
  26 ms | █████  29
  27 ms | ██████  35
  28 ms | ███  18
  29 ms | ██  13
  30 ms | █  8
  31 ms | █  8
  32 ms | █  7
  33 ms | █  4
  34 ms |   2
  35 ms | █  5
  36 ms |   2
  37 ms |   1
  38 ms |   1
  39 ms | █  4
  41 ms |   1
  42 ms |   2
  43 ms |   1
  44 ms |   1
  45 ms |   2
  46 ms |   1
  47 ms |   1
  48 ms |   2
  49 ms |   3
  50 ms |   1
  51 ms |   2
  52 ms |   1
  53 ms |   1
  54 ms |   3
  55 ms | █  4
  57 ms |   3
  58 ms |   2
  60 ms |   2
  61 ms |   1
  62 ms |   2
  63 ms |   3
  64 ms |   1
  65 ms |   1
  73 ms |   1
  74 ms |   1
  78 ms |   1
  81 ms |   1
  85 ms |   1
  88 ms |   1
  99 ms |   1
 105 ms |   1
 153 ms |   1
 165 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `6.06`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `70.68`
- `preload_duration_ms` = `57.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `11.10`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23130 ms  |  Sample ticks: 400

**FPS**  avg `106.54`, min `8.71`, p50 `100.85`, p95 `253.21`, p99 `488.83`, 1%low `12.92`, 0.1%low `8.71`, std `86.27`

**Frame time (ms)**  avg `16.01`, p50 `9.92`, p95 `42.29`, p99 `62.47`, p99.9 `87.67`, max `114.76`

**Client tick (ms)**  avg `1.80`, p95 `4.39`, max `40.71`

**Memory**  start `859 MB`, end `1368 MB`, peak `3625 MB`, GC `57 events / 1553 ms`

**FPS over sampling window (ASCII):**

```
151.8 |                      █    █                                          █         
140.4 |     █                █    █                       █     ██         █ █         
129.1 |     ██           █   █    █  ██ █  █ █     █  ██  █     ██      ██ █ █   █     
117.7 | █ █████ ██    ████   █ ██ █  ██ ██████ ██ ██  ██ ██  █ ███ ██   ██ ███   ██    
106.3 | █ █████ ████  █████ █████ █ ███ ██████ █████  █████  █████ ████████████ ███    
 94.9 | ███████ ████ ██████ █████ █ ████████████████ ██████ ███████████████████ ███    
 83.5 |█████████████ ███████████████████████████████ ██████ ███████████████████████    
 72.2 |████████████████████████████████████████████████████████████████████████████    
 60.8 |████████████████████████████████████████████████████████████████████████████    
 49.4 |█████████████████████████████████████████████████████████████████████████████   
 38.0 |█████████████████████████████████████████████████████████████████████████████   
 26.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███  12
   2 ms | ██████  28
   3 ms | █████  25
   4 ms | █████  24
   5 ms | ████████  38
   6 ms | ██████████████  64
   7 ms | ████████████████████████████  128
   8 ms | ████████████████████████████████████████  183
   9 ms | ██████████████████████████████  136
  10 ms | ███████████████████  89
  11 ms | █████████  41
  12 ms | █████████  41
  13 ms | ██████  27
  14 ms | ██  9
  15 ms | ███  13
  16 ms | ██  10
  17 ms | ██  11
  18 ms | █  6
  19 ms | ██  7
  20 ms | ██  7
  21 ms | ███  14
  22 ms | ███  16
  23 ms | █████  24
  24 ms | █████  25
  25 ms | ███████  32
  26 ms | ████  17
  27 ms | █████  23
  28 ms | ███  13
  29 ms | ████  17
  30 ms | ███  13
  31 ms | ███  15
  32 ms | ████  17
  33 ms | ███  13
  34 ms | ██  8
  35 ms | ████  20
  36 ms |   2
  37 ms | ██  9
  38 ms |   1
  39 ms | ██  7
  40 ms |   1
  43 ms |   1
  44 ms |   1
  46 ms | █  3
  47 ms |   1
  48 ms | █  3
  49 ms | █  3
  50 ms | █  3
  51 ms | █  6
  52 ms |   2
  53 ms | █  4
  54 ms |   1
  55 ms | █  3
  56 ms | █  5
  57 ms | █  3
  58 ms | █  3
  59 ms |   2
  60 ms |   2
  61 ms |   2
  62 ms | █  3
  63 ms |   1
  65 ms |   1
  66 ms |   1
  67 ms |   1
  69 ms |   1
  74 ms |   1
  75 ms |   1
  77 ms |   1
  80 ms |   1
  84 ms |   1
  88 ms |   1
 114 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `8.71`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `62.48`
- `preload_duration_ms` = `41.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `12.92`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `31.99`, min `7.65`, p50 `28.57`, p95 `48.29`, p99 `168.90`, 1%low `8.41`, 0.1%low `7.65`, std `28.15`

**Frame time (ms)**  avg `39.32`, p50 `35.00`, p95 `73.13`, p99 `105.83`, p99.9 `129.39`, max `130.66`

**Client tick (ms)**  avg `1.65`, p95 `3.23`, max `33.61`

**Memory**  start `2398 MB`, end `2769 MB`, peak `3874 MB`, GC `58 events / 1532 ms`

**FPS over sampling window (ASCII):**

```
 79.4 |   █                                                                            
 74.2 |   █                                                                            
 69.1 |   █                                                                        █   
 63.9 |   █   █                         █                                          █   
 58.8 |   █   █                         █                                          █   
 53.6 |   █   █                         █                                          █   
 48.5 |   █   █                         █       █   ██                             █   
 43.3 |   █   █                         █       █   ██            █                █   
 38.1 |   █   █                 █  █    █       █   ██ █    █     █                █   
 33.0 |   █  ██  █          █  ██  █  █ █    █  █ █ ██ ███ ██     █ █ █     ██  █  █ █ 
 27.8 |███████████████  █████████ ███ ████ █ ████ ████ ███ ███████████████ ███  ███████
 22.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
   3 ms | █  1
   4 ms | ██  2
   5 ms | ██  2
   6 ms | ██  2
   7 ms | █  1
   8 ms | █  1
   9 ms | ██  2
  10 ms | █  1
  11 ms | ███  3
  12 ms | █  1
  13 ms | █  1
  15 ms | █  1
  16 ms | ██  2
  19 ms | ███  3
  20 ms | ██  2
  21 ms | ████  4
  22 ms | ███  3
  23 ms | ██  2
  24 ms | ██████████  11
  25 ms | █████████  10
  26 ms | ██████████  11
  27 ms | █████████  10
  28 ms | ███████████████  17
  29 ms | ████████████  13
  30 ms | ███████████████████  21
  31 ms | ███████████████████  21
  32 ms | ██████████████████████████████████  37
  33 ms | ██████████████████████████████████  37
  34 ms | ███████████████████████████  30
  35 ms | ████████████████████████████████████████  44
  36 ms | █████████████████  19
  37 ms | █████████████  14
  38 ms | ███████████  12
  39 ms | █████████  10
  40 ms | ███  3
  41 ms | █████  5
  42 ms | ██████  7
  43 ms | ██████  7
  44 ms | ███  3
  45 ms | █  1
  46 ms | █████████  10
  47 ms | █████  6
  48 ms | ██  2
  49 ms | █████████████  14
  50 ms | ███████  8
  51 ms | █████████████  14
  52 ms | █████████  10
  53 ms | █████  5
  54 ms | ██  2
  55 ms | █████  5
  56 ms | ██  2
  57 ms | ██  2
  58 ms | █  1
  59 ms | █  1
  60 ms | ██  2
  61 ms | █  1
  62 ms | ███  3
  64 ms | ██  2
  65 ms | ████  4
  66 ms | ██  2
  67 ms | ██  2
  68 ms | █  1
  69 ms | █  1
  70 ms | ███  3
  71 ms | █  1
  72 ms | █  1
  73 ms | ███  3
  74 ms | █  1
  75 ms | █  1
  76 ms | █  1
  77 ms | ███  3
  79 ms | █  1
  80 ms | ██  2
  82 ms | █  1
  83 ms | █  1
  86 ms | ████  4
  88 ms | █  1
 100 ms | █  1
 106 ms | █  1
 108 ms | █  1
 111 ms | █  1
 115 ms | █  1
 128 ms | █  1
 130 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `7.65`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `25.43`
- `preload_duration_ms` = `3.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.41`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `31.39`, min `7.13`, p50 `28.94`, p95 `44.98`, p99 `166.19`, 1%low `8.21`, 0.1%low `7.13`, std `33.58`

**Frame time (ms)**  avg `39.83`, p50 `34.56`, p95 `75.68`, p99 `106.24`, p99.9 `133.97`, max `140.22`

**Client tick (ms)**  avg `1.96`, p95 `4.29`, max `60.41`

**Memory**  start `1803 MB`, end `2684 MB`, peak `4218 MB`, GC `47 events / 1428 ms`

**FPS over sampling window (ASCII):**

```
105.4 |                  █                                                             
 97.8 |                  █                                                             
 90.2 |                  █                                                             
 82.6 |                  █                            █                                
 74.9 |                  █                            █                                
 67.3 |       █          █                            █                                
 59.7 |       █          █                            █                                
 52.1 |       █          █              █             █   █                            
 44.4 |       █          █              █    █        █   █                     █ █    
 36.8 |      ██          █     █        ██   █        █   █  █             █    █ █    
 29.2 |██ ████████████████ █████ ███  ████ █████ ████ ███ ██████ ████ ████ ████ ███ ███
 21.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   2 ms | █  1
   3 ms | █  1
   5 ms | ██  2
   6 ms | █  1
   8 ms | ███  3
  10 ms | █  1
  11 ms | █  1
  13 ms | █  1
  14 ms | █  1
  16 ms | █  1
  17 ms | ██  2
  18 ms | ██  2
  19 ms | █  1
  20 ms | ██  2
  21 ms | ███  3
  22 ms | ██  2
  23 ms | ██  2
  24 ms | █████  5
  25 ms | ████  4
  26 ms | ██████  6
  27 ms | ██████████  11
  28 ms | ███████  8
  29 ms | █████████████████████  23
  30 ms | ███████████████████████████  29
  31 ms | ████████████████████████████████  34
  32 ms | ████████████████████████████████████████  43
  33 ms | ███████████████████████████████████  38
  34 ms | ████████████████████████████████  34
  35 ms | █████████████████████████  27
  36 ms | ███████████████████  20
  37 ms | ████████████  13
  38 ms | ███████████  12
  39 ms | ███████  8
  40 ms | ████████  9
  41 ms | ████  4
  42 ms | █████  5
  43 ms | █████  5
  44 ms | █  1
  45 ms | ████  4
  46 ms | ██  2
  47 ms | ████  4
  48 ms | █████████  10
  49 ms | ███████  8
  50 ms | ████████████  13
  51 ms | ███████  8
  52 ms | ████████████████  17
  53 ms | ███████  8
  54 ms | ████████  9
  55 ms | ██████  6
  56 ms | ███  3
  57 ms | ███  3
  58 ms | ████  4
  59 ms | █  1
  61 ms | █  1
  62 ms | █  1
  65 ms | █  1
  66 ms | █  1
  68 ms | █  1
  70 ms | █  1
  71 ms | █  1
  72 ms | █  1
  74 ms | █  1
  75 ms | ██  2
  76 ms | █  1
  78 ms | █  1
  79 ms | █  1
  81 ms | ███  3
  82 ms | ██  2
  85 ms | █  1
  86 ms | ███  3
  90 ms | █  1
  91 ms | ██  2
  94 ms | █  1
 102 ms | █  1
 103 ms | █  1
 106 ms | ██  2
 112 ms | █  1
 121 ms | █  1
 127 ms | █  1
 140 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `7.13`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `25.11`
- `preload_duration_ms` = `108.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.21`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `29.57`, min `8.01`, p50 `28.97`, p95 `41.34`, p99 `95.08`, 1%low `8.88`, 0.1%low `8.01`, std `20.98`

**Frame time (ms)**  avg `39.53`, p50 `34.52`, p95 `69.43`, p99 `95.21`, p99.9 `124.16`, max `124.85`

**Client tick (ms)**  avg `1.12`, p95 `2.84`, max `6.86`

**Memory**  start `1475 MB`, end `2471 MB`, peak `4760 MB`, GC `41 events / 1332 ms`

**FPS over sampling window (ASCII):**

```
 74.5 |█                                                                               
 69.7 |██                                                                              
 64.8 |██                                                                              
 60.0 |██                                                                              
 55.2 |██         █                                                                    
 50.3 |██         █                                                                    
 45.5 |██         █                                                                    
 40.7 |██         █     █               █                                              
 35.8 |██         █     █   █       █   █                                              
 31.0 |███   █    ███   ██  ██    ███   ██   ██ █  █  █████   ██     █  █ █   █     █  
 26.2 |██████████ █████████████████████ ███████████████████████████████ ███████████████
 21.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ██  2
   5 ms | █  1
   9 ms | █  1
  10 ms | ██  3
  12 ms | █  1
  14 ms | ██  2
  16 ms | █  1
  17 ms | █  1
  19 ms | ███  4
  20 ms | █  1
  21 ms | █  1
  22 ms | █  1
  23 ms | ████  5
  24 ms | ████  5
  25 ms | ███  4
  26 ms | ███████  9
  27 ms | ███████  9
  28 ms | ████  5
  29 ms | ███████████  14
  30 ms | ████████████████████  25
  31 ms | ██████████████████████████████████  43
  32 ms | █████████████████████████████████  41
  33 ms | █████████████████████████████████████  46
  34 ms | ████████████████████████████████████████  50
  35 ms | █████████████████████████  31
  36 ms | █████████████████  21
  37 ms | ██████████  13
  38 ms | ██████████  12
  39 ms | ██████  7
  40 ms | ██  3
  41 ms | ██  3
  42 ms | █  1
  43 ms | ███  4
  45 ms | ████  5
  46 ms | ███  4
  47 ms | ████████  10
  48 ms | ██████████  12
  49 ms | ██████  8
  50 ms | ███████  9
  51 ms | ███  4
  52 ms | █████  6
  53 ms | ███████  9
  54 ms | ███████  9
  55 ms | ███████  9
  56 ms | █████  6
  57 ms | ████  5
  58 ms | ██  2
  59 ms | ██  3
  61 ms | █  1
  62 ms | ██  3
  63 ms | █  1
  64 ms | █  1
  65 ms | █  1
  66 ms | █  1
  68 ms | █  1
  69 ms | █  1
  70 ms | ██  2
  71 ms | █  1
  72 ms | █  1
  74 ms | ██  2
  75 ms | █  1
  76 ms | █  1
  79 ms | █  1
  80 ms | █  1
  82 ms | █  1
  84 ms | █  1
  85 ms | █  1
  87 ms | █  1
  88 ms | ██  2
  89 ms | █  1
  90 ms | █  1
  91 ms | █  1
  95 ms | █  1
 102 ms | █  1
 103 ms | █  1
 109 ms | █  1
 123 ms | █  1
 124 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `8.01`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `25.30`
- `preload_duration_ms` = `69.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.88`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `30.27`, min `7.29`, p50 `28.60`, p95 `42.57`, p99 `112.34`, 1%low `8.37`, 0.1%low `7.29`, std `27.22`

**Frame time (ms)**  avg `39.71`, p50 `34.96`, p95 `69.19`, p99 `104.32`, p99.9 `130.24`, max `137.21`

**Client tick (ms)**  avg `1.78`, p95 `4.14`, max `62.55`

**Memory**  start `3498 MB`, end `2728 MB`, peak `4708 MB`, GC `34 events / 1353 ms`

**FPS over sampling window (ASCII):**

```
 87.5 |                                      █                                         
 81.4 |                                      █                                         
 75.3 |                          █           █                                         
 69.2 |                          █           █                                         
 63.0 |           █              █           █                                         
 56.9 |      █    █              █           █                                         
 50.8 |      █    █              █           █                                         
 44.7 |      █    █              █           █            █                            
 38.6 |█     █    █              █           █            █                            
 32.5 |█     █ ██ █     █ █ █ █ ██   █  █ ██ █ █  █ ███  ███   ██ █  █   ██ █  █       
 26.4 |████████████████████████████████████████████ █████████ █████████ █████ ███████ █
 20.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  2
   3 ms | █  1
   4 ms | █  1
   8 ms | ██  2
  13 ms | █  1
  14 ms | █  1
  16 ms | ██  2
  17 ms | █  1
  18 ms | ██  2
  20 ms | █  1
  21 ms | ███  3
  22 ms | ██████  6
  23 ms | ██████  6
  24 ms | ███  3
  25 ms | ████████  8
  26 ms | ███████████  11
  27 ms | ███████████  11
  28 ms | ██████████████  14
  29 ms | ██████████████████  18
  30 ms | ██████████████████  18
  31 ms | ███████████████████████████████  32
  32 ms | ████████████████████████████  29
  33 ms | ████████████████████████████████████████  41
  34 ms | ████████████████████████████████████████  41
  35 ms | ████████████████████████████████  33
  36 ms | ████████████████████████  25
  37 ms | █████████  9
  38 ms | ██████████████  14
  39 ms | █████████  9
  40 ms | ████████  8
  41 ms | ██  2
  42 ms | █████  5
  43 ms | ██  2
  44 ms | ████  4
  45 ms | ████████  8
  46 ms | ███████  7
  47 ms | ██████  6
  48 ms | █████████  9
  49 ms | ███████████  11
  50 ms | ███████████  11
  51 ms | ██  2
  52 ms | ████████████  12
  53 ms | ████████████  12
  54 ms | ████  4
  55 ms | ████████  8
  56 ms | ██████  6
  57 ms | ██████  6
  58 ms | ███  3
  60 ms | ██  2
  61 ms | █  1
  64 ms | █  1
  66 ms | ██  2
  68 ms | █  1
  69 ms | ██  2
  71 ms | █  1
  74 ms | █  1
  75 ms | █  1
  78 ms | ███  3
  79 ms | ██  2
  80 ms | ██  2
  81 ms | █  1
  86 ms | █  1
  90 ms | ██  2
  91 ms | █  1
  99 ms | █  1
 102 ms | █  1
 103 ms | █  1
 104 ms | ██  2
 115 ms | █  1
 116 ms | █  1
 123 ms | █  1
 137 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `7.29`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `25.18`
- `preload_duration_ms` = `70.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.37`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `31.56`, min `7.39`, p50 `28.77`, p95 `51.36`, p99 `166.50`, 1%low `8.44`, 0.1%low `7.39`, std `23.92`

**Frame time (ms)**  avg `39.68`, p50 `34.76`, p95 `79.30`, p99 `104.70`, p99.9 `126.55`, max `135.40`

**Client tick (ms)**  avg `2.56`, p95 `5.67`, max `49.47`

**Memory**  start `3887 MB`, end `3036 MB`, peak `5133 MB`, GC `44 events / 1396 ms`

**FPS over sampling window (ASCII):**

```
 59.7 |             █                         █                                        
 56.1 |             █  █                      █                                        
 52.5 |             █  █       █              █          █               █             
 48.9 |             █  █       █              █    █     █          █    █             
 45.3 |       █     █  █       █              █    █     █          █    █             
 41.6 |       █     █  █       █              █    █     █          █   ██             
 38.0 |       █     █ ██       █              █    █     █          █   ██  █          
 34.4 |       █  █  █ ██   █   █        █     ██  ██     ██         █   ██  █      █   
 30.8 |     ███  ██ █ ███  █ █ █ █    ███ ██  ██████  ██ ██ █ █ ██ ████ ███ █   ██ ██ █
 27.2 |██ █ ███████ █ ███ ████ ██████ ██████████████████ ██████████████ █████ █████████
 23.5 |█████████████████████████████████████████████████ ██████████████████████████████
 19.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ████  3
   5 ms | ████  3
   6 ms | █  1
   7 ms | ██  2
   8 ms | █  1
   9 ms | █  1
  10 ms | ██  2
  11 ms | ████  3
  12 ms | ████  3
  13 ms | █  1
  14 ms | █████  4
  16 ms | █  1
  19 ms | ██  2
  20 ms | ██  2
  22 ms | ████  3
  23 ms | ████  3
  24 ms | ███████  6
  25 ms | ████████  7
  26 ms | █████████████  11
  27 ms | █████████████████████  18
  28 ms | █████████████  11
  29 ms | ████████████████████████  20
  30 ms | ██████████████████████████  22
  31 ms | ████████████████████████████████████████  34
  32 ms | ███████████████████████████████████████  33
  33 ms | ███████████████████████████████████████  33
  34 ms | ████████████████████████████████████  31
  35 ms | ██████████████████████████████████  29
  36 ms | ███████████████████████████████  26
  37 ms | ██████████████  12
  38 ms | ███████████████  13
  39 ms | ████████████  10
  40 ms | ██  2
  41 ms | ████████  7
  42 ms | █████  4
  43 ms | █████  4
  44 ms | █████  4
  45 ms | ██  2
  46 ms | ██████  5
  47 ms | ███████████  9
  48 ms | ████████  7
  49 ms | █████████  8
  50 ms | █████████  8
  51 ms | ███████  6
  52 ms | ████████  7
  53 ms | █████████  8
  54 ms | ████████  7
  55 ms | ██████  5
  56 ms | ████████  7
  57 ms | ████  3
  58 ms | █  1
  59 ms | ████  3
  60 ms | ████  3
  61 ms | █  1
  63 ms | █  1
  66 ms | █  1
  67 ms | █  1
  69 ms | ████  3
  72 ms | █████  4
  73 ms | █  1
  74 ms | ██  2
  76 ms | █  1
  77 ms | █  1
  78 ms | █  1
  79 ms | ██  2
  80 ms | █  1
  81 ms | ██  2
  82 ms | █  1
  84 ms | █  1
  85 ms | ████  3
  86 ms | █  1
  87 ms | █  1
  88 ms | ██  2
  89 ms | █  1
  91 ms | █  1
  96 ms | █  1
  98 ms | ██  2
 103 ms | █  1
 104 ms | █  1
 110 ms | █  1
 113 ms | █  1
 115 ms | █  1
 117 ms | █  1
 135 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `7.39`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `25.20`
- `preload_duration_ms` = `59.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.44`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23079 ms  |  Sample ticks: 400

**FPS**  avg `34.89`, min `7.70`, p50 `28.51`, p95 `64.48`, p99 `242.54`, 1%low `8.28`, 0.1%low `7.70`, std `39.80`

**Frame time (ms)**  avg `39.26`, p50 `35.07`, p95 `73.50`, p99 `104.92`, p99.9 `125.13`, max `129.89`

**Client tick (ms)**  avg `5.75`, p95 `9.93`, max `65.81`

**Memory**  start `1734 MB`, end `4064 MB`, peak `5095 MB`, GC `25 events / 1225 ms`

**FPS over sampling window (ASCII):**

```
 84.1 |                                                                █               
 78.4 |            █                                                   █               
 72.7 |            █               █                                   █              █
 67.1 |            █               █                                   █              █
 61.4 |            █           █   █                                   █             ██
 55.8 |            █           █   █                                   █             ██
 50.1 |█           █           █   ██         █                        █             ██
 44.4 |█        █  █           █   ██    █    █              █         █             ██
 38.8 |█        █  █    █      █   ██    █    █    ██        █       █ █             ██
 33.1 |█   ███  █  █   ███ █ █ █ █ ██   ██ █  █ ██ ███   ███ █ █    ██ ███ █      ██ ██
 27.4 |██ ██████████████████████████████████████████████ ███████████████████ ██████████
 21.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███  2
   3 ms | ████  3
   4 ms | █  1
   5 ms | ███  2
   6 ms | ██████  5
   7 ms | ████  3
   8 ms | █  1
   9 ms | █  1
  10 ms | █  1
  11 ms | ███  2
  12 ms | ████  3
  13 ms | █  1
  15 ms | ███  2
  16 ms | █  1
  17 ms | ██████  5
  18 ms | ███  2
  20 ms | █████  4
  21 ms | █  1
  22 ms | ████████  6
  23 ms | ████  3
  24 ms | ██████  5
  25 ms | ██████  5
  26 ms | █████████████████████████  20
  27 ms | █████████████████████  17
  28 ms | ███████████████████████████████  25
  29 ms | ██████████████████████████████████████  30
  30 ms | ████████████████████████████████████████  32
  31 ms | █████████████████████████  20
  32 ms | █████████████████████████  20
  33 ms | ███████████████  12
  34 ms | ███████████████████████  18
  35 ms | ████████████████  13
  36 ms | █████████████  10
  37 ms | ██████████  8
  38 ms | ██████████████████████████████  24
  39 ms | ███████████████  12
  40 ms | ████████████████  13
  41 ms | ██████████  8
  42 ms | ███████████████████████  18
  43 ms | ████████  6
  44 ms | ████████  6
  45 ms | ████  3
  46 ms | ███████████  9
  47 ms | ████████  6
  48 ms | ██████  5
  49 ms | ███████████████████  15
  50 ms | ████  3
  51 ms | ██████████████████  14
  52 ms | ████████  6
  53 ms | ██████  5
  54 ms | ██████  5
  55 ms | ██████  5
  56 ms | ██████████████  11
  57 ms | █  1
  58 ms | █  1
  59 ms | ███  2
  60 ms | █  1
  61 ms | █  1
  62 ms | █  1
  63 ms | █  1
  64 ms | █  1
  65 ms | ██████  5
  67 ms | █  1
  69 ms | ████  3
  70 ms | █  1
  71 ms | ███  2
  72 ms | ████  3
  73 ms | █  1
  74 ms | █  1
  75 ms | █  1
  76 ms | ███  2
  79 ms | █  1
  82 ms | █  1
  84 ms | █  1
  86 ms | ███  2
  87 ms | █  1
  89 ms | ███  2
  91 ms | ███  2
  93 ms | ███  2
  95 ms | █  1
  99 ms | █  1
 102 ms | █  1
 105 ms | █  1
 116 ms | █  1
 117 ms | █  1
 119 ms | █  1
 120 ms | █  1
 129 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `7.70`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `25.47`
- `preload_duration_ms` = `61.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `8.28`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23175 ms  |  Sample ticks: 400

**FPS**  avg `30.70`, min `6.59`, p50 `27.54`, p95 `58.70`, p99 `112.05`, 1%low `7.74`, 0.1%low `n/a`, std `17.67`

**Frame time (ms)**  avg `40.42`, p50 `36.30`, p95 `76.77`, p99 `99.38`, p99.9 `146.05`, max `151.69`

**Client tick (ms)**  avg `7.71`, p95 `14.97`, max `59.87`

**Memory**  start `3901 MB`, end `2059 MB`, peak `5254 MB`, GC `31 events / 1022 ms`

**FPS over sampling window (ASCII):**

```
 50.7 |                                                                           █    
 48.0 |    █            █                                                         █    
 45.3 |    █            █                                                    █    █    
 42.6 |    █            █    █                                               █    █    
 39.9 |    █            █    █                                               █    █ █  
 37.2 |    █         █  ██   █    █        █ █                   █           █  █ █ █  
 34.6 |  █ █    █  █ █  ██ █ █    █        █ █    █  █          ██    █   █  █  █ █ █  
 31.9 |  █ █  █ █  █ █  ██ █ ████ █      █ █ █ █  █ ███   █     ██ █ ██   █  █ ██ █ █  
 29.2 |█ ████ █ ██ ███  ████ ██████ ██ █ █ █ █ ████████ █ █ █   ██ █ ███ ███ ██████ ███
 26.5 |██████ ████ ███ ████████████ ██ ███ ███ ███████████████  ██ █████ ███ ██████ ███
 23.8 |██████ ████ ███ ███████████████████ ████████████████████████████████████████████
 21.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | ██  1
   7 ms | █████  3
   8 ms | ████  2
   9 ms | ██  1
  11 ms | ████  2
  12 ms | ██  1
  13 ms | █████  3
  14 ms | █████████████  7
  15 ms | █████  3
  16 ms | ████  2
  17 ms | ███████  4
  18 ms | ███████████████  8
  19 ms | █████████████  7
  20 ms | ███████████  6
  21 ms | ███████  4
  22 ms | ███████  4
  23 ms | ███████  4
  24 ms | ███████████████  8
  25 ms | ███████████████████████████  15
  26 ms | ████████████████████  11
  27 ms | ███████████████████████████  15
  28 ms | ███████████████████████████  15
  29 ms | ████████████████████████████████████████  22
  30 ms | █████████████████████████  14
  31 ms | ████████████████████████████████████  20
  32 ms | █████████████████████████████████  18
  33 ms | ███████████████████████████  15
  34 ms | ██████████████████  10
  35 ms | ███████████████████████████████  17
  36 ms | ███████████████████████████████████  19
  37 ms | ████████████████████████  13
  38 ms | ████████████████████████  13
  39 ms | █████████████████████████  14
  40 ms | █████████████████████████████  16
  41 ms | ████████████████████████  13
  42 ms | ███████████  6
  43 ms | ███████████████  8
  44 ms | █████████████  7
  45 ms | █████  3
  46 ms | █████  3
  47 ms | ███████████  6
  48 ms | ████████████████████████  13
  49 ms | ███████████  6
  50 ms | █████████  5
  51 ms | ███████████  6
  52 ms | ███████████████  8
  53 ms | █████████  5
  54 ms | ███████████████  8
  55 ms | ███████████  6
  56 ms | ███████████  6
  57 ms | ████  2
  58 ms | ███████  4
  59 ms | █████  3
  60 ms | █████  3
  61 ms | ███████  4
  62 ms | █████  3
  63 ms | █████  3
  64 ms | ████  2
  66 ms | ██  1
  69 ms | █████  3
  70 ms | ████  2
  71 ms | ████  2
  72 ms | █████  3
  73 ms | █████  3
  74 ms | █████  3
  76 ms | █████  3
  77 ms | ████  2
  78 ms | ██  1
  81 ms | ██  1
  83 ms | ████  2
  84 ms | ██  1
  86 ms | ██  1
  87 ms | █████  3
  88 ms | ████  2
  89 ms | ██  1
  90 ms | ██  1
  91 ms | ██  1
  92 ms | ██  1
  94 ms | ██  1
  97 ms | ██  1
  99 ms | ██  1
 105 ms | ██  1
 108 ms | ██  1
 140 ms | ████  2
 151 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `18.00`
- `fps_harmonic_avg` = `24.74`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `7.74`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `31.49`, min `6.10`, p50 `28.68`, p95 `54.87`, p99 `122.74`, 1%low `7.98`, 0.1%low `6.10`, std `21.64`

**Frame time (ms)**  avg `39.30`, p50 `34.87`, p95 `72.87`, p99 `99.63`, p99.9 `149.10`, max `163.96`

**Client tick (ms)**  avg `2.04`, p95 `4.19`, max `13.72`

**Memory**  start `4253 MB`, end `3206 MB`, peak `5390 MB`, GC `27 events / 1285 ms`

**FPS over sampling window (ASCII):**

```
 60.7 |                           █                                                    
 57.1 |                           █                                                    
 53.5 |                           █                                                    
 50.0 |            █              █               █                         █          
 46.4 |            █              █               █        █  █             █          
 42.9 |            █              █               █        █  █             █          
 39.3 |            ██   █  █   █  █          █  █ █        █  █             █          
 35.7 |        █   ██   █  █   █  █          █  ███        █  █        ██   █          
 32.2 | █      █   ██   ████ █ █  █        █ █  ████     █ █  █    ██  ██ █ █  █  ██   
 28.6 | ████████   ███  ████ ████████   ████ ███████████████████ ████ ███████████ ███  
 25.1 | ██████████ █████████ ██████████████████████████████████████████████████████████
 21.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   5 ms | ██  2
   6 ms | ██  2
   8 ms | █████  4
   9 ms | █████  4
  10 ms | ██  2
  12 ms | ██████  5
  13 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | ██  2
  18 ms | ████  3
  20 ms | █████  4
  21 ms | █  1
  22 ms | ██████  5
  23 ms | ██████████  8
  24 ms | ████████  7
  25 ms | ██████  5
  26 ms | ████████████████  13
  27 ms | ██████████████████  15
  28 ms | █████████████████████  17
  29 ms | ███████████████████  16
  30 ms | ████████████████████████  20
  31 ms | ████████████████████████████████  26
  32 ms | ████████████████████████████████████████  33
  33 ms | ████████████████████████████████████  30
  34 ms | ██████████████████████████████████████  31
  35 ms | █████████████████████████████  24
  36 ms | ███████████████████████████████████  29
  37 ms | █████████████████████████  21
  38 ms | ████████████████████████  20
  39 ms | ███████████  9
  40 ms | ██████  5
  41 ms | █████  4
  42 ms | █████  4
  43 ms | ████  3
  44 ms | ██  2
  45 ms | ██  2
  46 ms | ██  2
  47 ms | ██████████  8
  48 ms | ██████████  8
  49 ms | ████████████  10
  50 ms | █████████████  11
  51 ms | ██████  5
  52 ms | █████  4
  53 ms | ███████████  9
  54 ms | █████████████  11
  55 ms | ███████  6
  56 ms | ██  2
  57 ms | ██  2
  58 ms | ██  2
  59 ms | ██  2
  60 ms | ████  3
  63 ms | █  1
  67 ms | █████  4
  68 ms | ██  2
  69 ms | █  1
  70 ms | ████  3
  71 ms | ████  3
  72 ms | ██  2
  73 ms | ██  2
  79 ms | █  1
  80 ms | ██  2
  83 ms | █████  4
  85 ms | █  1
  90 ms | █  1
  91 ms | █  1
  92 ms | █  1
  93 ms | █  1
  94 ms | █  1
  95 ms | ██  2
  96 ms | █  1
  97 ms | █  1
  98 ms | █  1
  99 ms | █  1
 100 ms | █  1
 108 ms | █  1
 118 ms | █  1
 134 ms | █  1
 163 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6271.00`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `131.00`
- `fps_1pct_low` = `7.98`
- `fps_harmonic_avg` = `25.45`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `6.10`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `30.09`, min `7.27`, p50 `28.59`, p95 `42.40`, p99 `139.89`, 1%low `8.83`, 0.1%low `7.27`, std `21.65`

**Frame time (ms)**  avg `39.21`, p50 `34.98`, p95 `62.89`, p99 `102.33`, p99.9 `124.84`, max `137.64`

**Client tick (ms)**  avg `1.22`, p95 `2.87`, max `50.60`

**Memory**  start `4498 MB`, end `4343 MB`, peak `5475 MB`, GC `31 events / 1150 ms`

**FPS over sampling window (ASCII):**

```
 64.8 |                   █                                                            
 60.8 |                   █                             █                              
 56.7 |                   █                             ██                             
 52.7 |             █     █                             ██              █              
 48.7 |             █     █                             ██              █              
 44.6 |             █     █                  █          ██              █              
 40.6 |             █     █    █             █          ██              █              
 36.5 |        █    █     █    █             █   █  █   ██              █            █ 
 32.5 |    █   █    █     █    █  █ █        █   █  █   ██              █           ███
 28.4 |██  ███ ████ ████  ███  ████ ██████████ ███  ███████████████ ███████ █ █ ██ ████
 24.4 |███████ ███████████████ ███████████████████  ███████████████████████ ███████████
 20.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   4 ms | █  1
   5 ms | ███  3
   7 ms | █  1
   9 ms | █  1
  10 ms | █  1
  15 ms | ██  2
  16 ms | █  1
  17 ms | ██  2
  19 ms | █  1
  20 ms | █  1
  21 ms | ███  3
  22 ms | ███  4
  23 ms | ████████  10
  24 ms | ████████  9
  25 ms | ███  4
  26 ms | ███████  8
  27 ms | ██████████  12
  28 ms | █████████  11
  29 ms | ████████████  14
  30 ms | ██████████████████  22
  31 ms | █████████████████████████  30
  32 ms | ████████████████████████████████████████  48
  33 ms | ███████████████████████████████  37
  34 ms | █████████████████████████  30
  35 ms | ██████████████████████  26
  36 ms | ████████████████  19
  37 ms | █████████████████  20
  38 ms | ████████  10
  39 ms | █████████  11
  40 ms | ████████  9
  41 ms | ███████  8
  42 ms | █████  6
  43 ms | ███  3
  44 ms | ████  5
  45 ms | █████  6
  46 ms | ████  5
  47 ms | █████████████  15
  48 ms | ███████████  13
  49 ms | ███████  8
  50 ms | ███████  8
  51 ms | █████  6
  52 ms | ██████████  12
  53 ms | ███████  8
  54 ms | ██████  7
  55 ms | █████  6
  56 ms | █████  6
  57 ms | ██  2
  58 ms | █  1
  59 ms | ███  3
  60 ms | ███  4
  64 ms | █  1
  66 ms | █  1
  67 ms | ██  2
  70 ms | █  1
  72 ms | ██  2
  74 ms | ██  2
  76 ms | ███  3
  79 ms | █  1
  80 ms | █  1
  83 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
  93 ms | █  1
  96 ms | █  1
 102 ms | █  1
 104 ms | █  1
 105 ms | █  1
 106 ms | █  1
 112 ms | █  1
 137 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `7.27`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `52.00`
- `fps_harmonic_avg` = `25.50`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `8.83`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `33.60`, min `7.82`, p50 `27.38`, p95 `60.51`, p99 `189.88`, 1%low `8.74`, 0.1%low `7.82`, std `37.45`

**Frame time (ms)**  avg `39.88`, p50 `36.53`, p95 `75.69`, p99 `103.21`, p99.9 `123.22`, max `127.81`

**Client tick (ms)**  avg `7.52`, p95 `16.13`, max `57.39`

**Memory**  start `4287 MB`, end `4134 MB`, peak `5525 MB`, GC `34 events / 1221 ms`

**FPS over sampling window (ASCII):**

```
100.6 |                                                 █      █                       
 93.3 |                                                 █      █                       
 86.0 |                                                 █      █                       
 78.6 |                                                 █      █                       
 71.3 |                                                 █      █                       
 64.0 |                                                 █    █ █                       
 56.7 |                           ██                    █    █ █                       
 49.4 |                           ██   █                █    █ █   █           █       
 42.1 |               █           ██   █ █              █    █ █  ██  █        █       
 34.8 |  ███    █   ███    █      ███ ████  █       ██  █  █ █ ██ █████   █    █  █ ██ 
 27.4 |█ ███████████████ ██████████████████████ ██ ███████████ ████████████████████████
 20.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ███  2
   3 ms | █████  3
   5 ms | ██  1
   6 ms | █████  3
   7 ms | ██  1
   8 ms | ██  1
   9 ms | ██  1
  10 ms | █████  3
  11 ms | ███  2
  13 ms | █████  3
  14 ms | █████  3
  15 ms | ██  1
  16 ms | ███  2
  17 ms | ███  2
  18 ms | ██  1
  19 ms | ██████  4
  20 ms | ████████  5
  21 ms | ████████  5
  22 ms | █████████████████  11
  23 ms | █████████████████  11
  24 ms | ████████  5
  25 ms | ██████████████████  12
  26 ms | ██████████████████████████  17
  27 ms | ████████████████████████████████████████  26
  28 ms | █████████████████  11
  29 ms | ██████████████  9
  30 ms | █████████████████  11
  31 ms | ███████████████████████  15
  32 ms | █████████████████████████████  19
  33 ms | ██████████████████████████  17
  34 ms | ███████████████████████████████████  23
  35 ms | ██████████████████████  14
  36 ms | ██████████████████████████  17
  37 ms | ████████████████████████████  18
  38 ms | ███████████████████████  15
  39 ms | ███████████████████████████████████  23
  40 ms | ███████████  7
  41 ms | ███████████  7
  42 ms | ██████████████████  12
  43 ms | █████  3
  44 ms | ████████████  8
  45 ms | ███  2
  46 ms | ███████████  7
  47 ms | ██████  4
  48 ms | ███████████████  10
  49 ms | █████████  6
  50 ms | ██████████████  9
  51 ms | ████████  5
  52 ms | ██████████████  9
  53 ms | ██████████████████  12
  54 ms | ███████████  7
  55 ms | █████████████████  11
  56 ms | █████████  6
  57 ms | ████████  5
  58 ms | █████  3
  59 ms | ███  2
  60 ms | █████  3
  61 ms | ███  2
  62 ms | ███  2
  63 ms | ██  1
  64 ms | ██  1
  65 ms | ██  1
  66 ms | ███  2
  67 ms | ██  1
  68 ms | █████  3
  69 ms | ██  1
  70 ms | ██  1
  71 ms | █████  3
  74 ms | ███  2
  75 ms | ███  2
  76 ms | ██  1
  77 ms | ███  2
  78 ms | ██  1
  84 ms | ███  2
  85 ms | ██  1
  87 ms | ██  1
  88 ms | ██  1
  89 ms | ███  2
  91 ms | ██  1
  93 ms | ███  2
  94 ms | ███  2
  96 ms | ██  1
  99 ms | ██  1
 103 ms | ██  1
 105 ms | ██  1
 106 ms | ██  1
 113 ms | ██  1
 118 ms | ██  1
 127 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_avg` = `36.26`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `7.82`
- `preset_long` = `0.00`
- `preload_duration_ms` = `73.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `25.08`
- `fps_1pct_low` = `8.74`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23129 ms  |  Sample ticks: 400

**FPS**  avg `33.29`, min `7.82`, p50 `27.94`, p95 `68.20`, p99 `178.47`, 1%low `8.33`, 0.1%low `7.82`, std `34.06`

**Frame time (ms)**  avg `39.91`, p50 `35.79`, p95 `72.67`, p99 `108.49`, p99.9 `123.71`, max `127.89`

**Client tick (ms)**  avg `7.26`, p95 `16.26`, max `83.07`

**Memory**  start `4980 MB`, end `5308 MB`, peak `5507 MB`, GC `36 events / 1256 ms`

**FPS over sampling window (ASCII):**

```
105.3 |                                                                           █    
 97.6 |                                                                           █    
 90.0 |                                                                           █    
 82.3 |                                                                           █    
 74.7 |                                                                           █    
 67.0 |                                     █    █                                █    
 59.4 |                                     █    █                                █    
 51.7 |          ██                 █       █    █                         █     ██  █ 
 44.1 |          ██          █      █       █    █ █   █   ██              █     ██  █ 
 36.4 | █     █  ███     █   ██     █     █ █ █  █ █   ██  ███ █ █ █   █   █     ██  █ 
 28.8 | ██   ███████████████ ███████████████████ ████ ██████████ ███████████ ███ ██████
 21.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
   3 ms | ███  2
   4 ms | █  1
   5 ms | ███  2
   6 ms | ███  2
   7 ms | ███  2
   8 ms | ████  3
   9 ms | ████  3
  11 ms | █  1
  12 ms | ████  3
  13 ms | ████  3
  14 ms | ███████  5
  15 ms | █  1
  16 ms | ███████  5
  17 ms | █  1
  18 ms | ███  2
  19 ms | ██████  4
  20 ms | █  1
  21 ms | █████████  6
  22 ms | ████  3
  23 ms | ███████  5
  24 ms | ███████  5
  25 ms | ████████████  8
  26 ms | ███████████████  10
  27 ms | █████████████████████  14
  28 ms | ██████████████████  12
  29 ms | ███████████████████████████  18
  30 ms | █████████████████████████████████████  25
  31 ms | ████████████████████████  16
  32 ms | ██████████████████████████████████  23
  33 ms | ████████████████████████████████████████  27
  34 ms | ████████████████████████████  19
  35 ms | ████████████████████████████  19
  36 ms | ███████████████████████████  18
  37 ms | █████████████████████████  17
  38 ms | ███████████████████████████  18
  39 ms | █████████████  9
  40 ms | ██████  4
  41 ms | ███████████████  10
  42 ms | █████████  6
  43 ms | ███████  5
  44 ms | ████████████████  11
  45 ms | █████████████  9
  46 ms | █████████  6
  47 ms | ██████████  7
  48 ms | ████████████  8
  49 ms | ██████████  7
  50 ms | ███████████████████  13
  51 ms | ███████████████  10
  52 ms | █████████████  9
  53 ms | ███████  5
  54 ms | ███████  5
  55 ms | █████████  6
  56 ms | █████████████  9
  57 ms | ███████  5
  58 ms | ███████  5
  59 ms | ███  2
  60 ms | ████  3
  61 ms | █  1
  62 ms | ████  3
  63 ms | ██████  4
  64 ms | █  1
  65 ms | ███  2
  66 ms | █  1
  67 ms | █  1
  68 ms | █  1
  70 ms | █  1
  71 ms | █  1
  72 ms | █  1
  73 ms | █  1
  74 ms | ███  2
  76 ms | █  1
  78 ms | █  1
  82 ms | █  1
  84 ms | █  1
  85 ms | █  1
  86 ms | █  1
  87 ms | █  1
  88 ms | █  1
  93 ms | █  1
  95 ms | █  1
  96 ms | ███  2
  98 ms | █  1
 103 ms | █  1
 104 ms | █  1
 107 ms | █  1
 108 ms | █  1
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
 119 ms | █  1
 127 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_avg` = `36.96`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `7.82`
- `preset_long` = `0.00`
- `preload_duration_ms` = `34.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `25.06`
- `fps_1pct_low` = `8.33`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `25.16`, min `5.43`, p50 `19.22`, p95 `61.81`, p99 `170.23`, 1%low `5.46`, 0.1%low `n/a`, std `28.22`

**Frame time (ms)**  avg `61.90`, p50 `52.04`, p95 `131.05`, p99 `177.84`, p99.9 `184.08`, max `184.14`

**Client tick (ms)**  avg `28.11`, p95 `46.07`, max `76.82`

**Memory**  start `4230 MB`, end `4909 MB`, peak `5640 MB`, GC `30 events / 753 ms`

**FPS over sampling window (ASCII):**

```
 83.9 |                                             █                                  
 76.9 |                                             █                                  
 70.0 |                                   █         ██                                 
 63.1 |                                   █         ██                                 
 56.2 |                                   █         ██      █                          
 49.2 |                                   █         ██    █ █                          
 42.3 |             █                 █   █         ██    █ █      ██  █       █ █     
 35.4 |             █             █   █   █ █       ██    █ █     ███  ███    ██ █   ██
 28.5 |    █        █            ██   █   █ ██      ██    █ █   █ ███ ████    ████ ████
 21.5 |██  ██  ██  ██    █ ███ ████  ███ █████  ██  ███  ████   █████ ██████ ██████████
 14.6 |██████  ███ ██    ██████████  ███ █████ ███ ████████████ ███████████████████████
  7.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █████  1
   4 ms | █████  1
   5 ms | ██████████  2
   7 ms | █████  1
   9 ms | ██████████  2
  10 ms | ███████████████  3
  11 ms | ██████████  2
  14 ms | █████  1
  15 ms | ███████████████  3
  16 ms | █████  1
  17 ms | ██████████  2
  18 ms | ██████████  2
  19 ms | ██████████  2
  21 ms | █████  1
  22 ms | █████  1
  23 ms | █████  1
  24 ms | █████  1
  25 ms | ██████████  2
  26 ms | ████████████████████  4
  27 ms | ██████████████████████████████  6
  28 ms | ████████████████████  4
  29 ms | ████████████████████  4
  30 ms | ██████████████████████████████  6
  31 ms | █████████████████████████  5
  32 ms | ███████████████████████████████████  7
  33 ms | ██████████  2
  34 ms | ████████████████████  4
  35 ms | ██████████████████████████████  6
  36 ms | ████████████████████████████████████████  8
  37 ms | █████████████████████████  5
  38 ms | ██████████  2
  39 ms | ████████████████████  4
  40 ms | ████████████████████  4
  41 ms | ████████████████████████████████████████  8
  42 ms | ████████████████████  4
  43 ms | █████████████████████████  5
  44 ms | ███████████████████████████████████  7
  45 ms | ████████████████████████████████████████  8
  46 ms | ██████████  2
  47 ms | ██████████████████████████████  6
  48 ms | ██████████████████████████████  6
  49 ms | ████████████████████  4
  50 ms | ██████████████████████████████  6
  51 ms | █████████████████████████  5
  52 ms | █████████████████████████  5
  53 ms | ██████████████████████████████  6
  54 ms | ██████████  2
  55 ms | ████████████████████  4
  56 ms | █████████████████████████  5
  57 ms | █████████████████████████  5
  58 ms | ███████████████  3
  59 ms | █████  1
  60 ms | ███████████████  3
  61 ms | ██████████  2
  62 ms | ███████████████████████████████████  7
  65 ms | ██████████  2
  66 ms | ███████████████  3
  67 ms | █████  1
  69 ms | ███████████████  3
  70 ms | ███████████████  3
  71 ms | ██████████  2
  72 ms | ████████████████████  4
  73 ms | ██████████  2
  74 ms | ██████████  2
  75 ms | █████  1
  76 ms | ███████████████  3
  77 ms | ███████████████  3
  78 ms | ██████████  2
  79 ms | ██████████  2
  80 ms | █████  1
  81 ms | ██████████████████████████████  6
  82 ms | █████████████████████████  5
  84 ms | ██████████  2
  85 ms | ██████████  2
  86 ms | █████  1
  87 ms | ████████████████████  4
  88 ms | ███████████████  3
  89 ms | █████  1
  90 ms | ██████████  2
  92 ms | ███████████████  3
  93 ms | █████  1
  94 ms | █████  1
  96 ms | ██████████  2
  97 ms | ██████████  2
  98 ms | ███████████████  3
  99 ms | ██████████  2
 100 ms | █████  1
 102 ms | █████  1
 103 ms | ██████████  2
 104 ms | ██████████  2
 105 ms | █████  1
 106 ms | ██████████  2
 107 ms | █████  1
 108 ms | █████  1
 109 ms | █████  1
 110 ms | █████  1
 111 ms | █████  1
 112 ms | █████  1
 113 ms | █████  1
 115 ms | ███████████████  3
 116 ms | █████  1
 117 ms | █████  1
 118 ms | █████  1
 121 ms | █████  1
 122 ms | █████  1
 125 ms | ██████████  2
 127 ms | █████  1
 130 ms | █████  1
 131 ms | █████  1
 138 ms | ███████████████  3
 141 ms | █████  1
 145 ms | █████  1
 151 ms | █████  1
 154 ms | █████  1
 165 ms | ██████████  2
 169 ms | ██████████  2
 171 ms | █████  1
 179 ms | █████  1
 181 ms | █████  1
 183 ms | █████  1
 184 ms | █████  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `129.00`
- `falling_blocks_landed` = `32293.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `16.15`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4814.17`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `5.46`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `24.93`, min `4.60`, p50 `18.02`, p95 `65.56`, p99 `105.59`, 1%low `5.08`, 0.1%low `n/a`, std `39.20`

**Frame time (ms)**  avg `63.46`, p50 `55.50`, p95 `128.24`, p99 `170.90`, p99.9 `208.44`, max `217.36`

**Client tick (ms)**  avg `27.61`, p95 `47.60`, max `85.53`

**Memory**  start `3450 MB`, end `3318 MB`, peak `5714 MB`, GC `32 events / 803 ms`

**FPS over sampling window (ASCII):**

```
211.9 |   █                                                                            
193.3 |   █                                                                            
174.6 |   █                                                                            
155.9 |   █                                                                            
137.3 |   █                                                                            
118.6 |   █                                                                            
100.0 |   █ █                                                                          
 81.3 |   █ █                                                                          
 62.7 |   █ █                                                                          
 44.0 |  ████   █     █          █                      ██       █            █        
 25.3 |██████  ██    ████        ███  ██ ████    ████  █████  ████    ██████ █████    █
  6.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████  1
   3 ms | ████  1
   6 ms | ████  1
   9 ms | ███████████  3
  10 ms | ████  1
  12 ms | ███████  2
  13 ms | ███████████  3
  14 ms | ███████████████  4
  15 ms | ███████  2
  16 ms | ████  1
  18 ms | ███████████████  4
  19 ms | ████  1
  23 ms | ████  1
  24 ms | ███████████  3
  25 ms | ███████████  3
  26 ms | ███████  2
  27 ms | ████  1
  28 ms | ████  1
  29 ms | ███████  2
  30 ms | ██████████████████  5
  31 ms | ██████████████████  5
  32 ms | ██████████████████████  6
  33 ms | ███████  2
  34 ms | ██████████████████  5
  35 ms | ███████████  3
  36 ms | █████████████████████████  7
  37 ms | ███████████████  4
  38 ms | ████  1
  39 ms | ███████████████  4
  40 ms | ███████  2
  41 ms | █████████████████████████████  8
  42 ms | ███████████████  4
  43 ms | ██████████████████  5
  44 ms | █████████████████████████  7
  45 ms | █████████████████████████████  8
  46 ms | ██████████████████████  6
  47 ms | ███████  2
  48 ms | ███████████████  4
  49 ms | ███████████████  4
  50 ms | █████████████████████████  7
  51 ms | ██████████████████  5
  52 ms | ███████████  3
  53 ms | ███████████████  4
  54 ms | ███████████████  4
  55 ms | ████████████████████████████████████████  11
  56 ms | ███████████████  4
  57 ms | █████████████████████████  7
  58 ms | ██████████████████████  6
  59 ms | ███████████████  4
  60 ms | ███████████  3
  61 ms | ████  1
  62 ms | ███████████  3
  63 ms | ████  1
  65 ms | ███████████████  4
  67 ms | ████  1
  68 ms | ██████████████████  5
  69 ms | ████  1
  70 ms | ███████  2
  71 ms | ██████████████████  5
  72 ms | ███████  2
  73 ms | ████  1
  74 ms | ███████████████  4
  75 ms | ████  1
  76 ms | ███████████  3
  77 ms | ████  1
  78 ms | ███████  2
  79 ms | ███████  2
  80 ms | ███████████  3
  81 ms | ███████████  3
  82 ms | ███████████████  4
  83 ms | ███████████  3
  84 ms | ████  1
  85 ms | ███████████████  4
  86 ms | ██████████████████████  6
  87 ms | ████  1
  89 ms | ███████████  3
  90 ms | ████  1
  91 ms | ███████  2
  92 ms | ████  1
  93 ms | ███████  2
  94 ms | ████  1
  95 ms | ████  1
  96 ms | ████  1
  98 ms | ████  1
  99 ms | ████  1
 100 ms | ███████████  3
 101 ms | ████  1
 102 ms | ███████  2
 103 ms | ████  1
 104 ms | ███████████  3
 105 ms | ███████████  3
 106 ms | ████  1
 107 ms | ███████  2
 108 ms | ███████████  3
 110 ms | ███████  2
 111 ms | ████  1
 112 ms | ████  1
 115 ms | ████  1
 119 ms | ████  1
 120 ms | ████  1
 121 ms | ████  1
 122 ms | ████  1
 123 ms | ████  1
 125 ms | ████  1
 126 ms | ███████  2
 127 ms | ███████  2
 129 ms | ███████  2
 130 ms | ████  1
 135 ms | ███████  2
 140 ms | ████  1
 142 ms | ████  1
 144 ms | ████  1
 149 ms | ████  1
 153 ms | ████  1
 155 ms | ████  1
 162 ms | ████  1
 172 ms | ████  1
 184 ms | ████  1
 188 ms | ████  1
 217 ms | ████  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `7.00`
- `falling_blocks_landed` = `32180.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `15.76`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4799.54`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `5.08`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `30.70`, min `7.59`, p50 `28.81`, p95 `49.97`, p99 `112.54`, 1%low `8.52`, 0.1%low `7.59`, std `17.71`

**Frame time (ms)**  avg `39.17`, p50 `34.71`, p95 `73.97`, p99 `105.44`, p99.9 `123.16`, max `131.74`

**Client tick (ms)**  avg `4.38`, p95 `8.37`, max `75.97`

**Memory**  start `5620 MB`, end `4021 MB`, peak `6263 MB`, GC `33 events / 1339 ms`

**FPS over sampling window (ASCII):**

```
 52.0 |                 █                             █                                
 48.9 |                 █                             █                                
 45.9 |                 █                             █                                
 42.8 |      ██     █   █              █ █            █                                
 39.7 |    █ ██     █   █              █ █      █    ██          ██         █          
 36.7 |    █ ██     █   █       █      █ █      █    ██   █    █ ██         █          
 33.6 |    █ ██   █ █   █       █   █  █ █ █    █    ██   █    █ ██  █      █          
 30.5 | ████ ██ █ █ ████████    ██  ██ █ █████  ██ █ ████ ██ █ █ ██  █ ██   ██   █ ██  
 27.4 | ████ ██████ ████████ ██ ███ ███████████ ██ ██████ ██████ ███ ████  ████ ██ ██ █
 24.4 |████████████████████████████ ███████████ ██████████████████████████ ████████████
 21.3 |████████████████████████████████████████ ███████████████████████████████████████
 18.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   6 ms | █  1
   8 ms | ██████  5
   9 ms | ██████  5
  10 ms | ███  3
  11 ms | ███  3
  13 ms | ██  2
  14 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | █  1
  18 ms | █  1
  19 ms | █  1
  20 ms | █  1
  21 ms | █████  4
  22 ms | ███  3
  23 ms | ████████  7
  24 ms | ███  3
  25 ms | ████████  7
  26 ms | █████████  8
  27 ms | ███████████  10
  28 ms | █████████████████████  18
  29 ms | █████████████████████████  22
  30 ms | ████████████████████████████████████████  35
  31 ms | ███████████████████████████████████  31
  32 ms | ██████████████████████████████  26
  33 ms | ████████████████████████████████████████  35
  34 ms | ██████████████████████████████  26
  35 ms | ██████████████████████  19
  36 ms | ██████████████████████████████  26
  37 ms | ███████████████████████  20
  38 ms | █████████████████  15
  39 ms | ████████  7
  40 ms | █████████████  11
  41 ms | ████████  7
  42 ms | ███████  6
  43 ms | ██████  5
  44 ms | ███████  6
  45 ms | █████  4
  46 ms | ███████  6
  47 ms | █████████  8
  48 ms | ███  3
  49 ms | ██████████  9
  50 ms | █████████  8
  51 ms | ██████████  9
  52 ms | █████████████  11
  53 ms | ██████████████  12
  54 ms | █████████  8
  55 ms | █  1
  56 ms | ██  2
  57 ms | █████  4
  58 ms | ███  3
  59 ms | █  1
  61 ms | ██  2
  62 ms | ██  2
  63 ms | █  1
  64 ms | █  1
  68 ms | █  1
  71 ms | ██  2
  72 ms | ██  2
  74 ms | █  1
  76 ms | █  1
  78 ms | █  1
  79 ms | █  1
  80 ms | █  1
  81 ms | █  1
  82 ms | █  1
  83 ms | █  1
  84 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
  91 ms | █  1
  92 ms | █  1
  94 ms | █  1
  96 ms | ██  2
  97 ms | █  1
 102 ms | ██  2
 105 ms | █  1
 112 ms | █  1
 113 ms | █  1
 114 ms | ██  2
 131 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `0.00`
- `falling_blocks_landed` = `3822.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `25.53`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `7.59`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `620.97`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `8.52`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `33.56`, min `4.66`, p50 `28.45`, p95 `72.99`, p99 `181.09`, 1%low `7.11`, 0.1%low `4.66`, std `31.38`

**Frame time (ms)**  avg `39.35`, p50 `35.15`, p95 `75.10`, p99 `111.76`, p99.9 `171.31`, max `214.77`

**Client tick (ms)**  avg `4.69`, p95 `10.88`, max `51.26`

**Memory**  start `4743 MB`, end `3565 MB`, peak `6409 MB`, GC `34 events / 1262 ms`

**FPS over sampling window (ASCII):**

```
 89.1 |                                               █                                
 83.1 |                                               █                                
 77.1 |                                               █                                
 71.1 |                                               █                                
 65.1 |            █                                  █                         █      
 59.1 |            █                       █          █    █                    █      
 53.1 |            █          █          █ █          █    █                    █      
 47.1 |            █          █     █    ███     █    ██   █                    █      
 41.2 |       █    █  █       █     █    ████    █    ██   █                    █      
 35.2 |█     ██  █ ████ █  ██ █     ██   █████   █ █  ██  ███     █      █      █      
 29.2 |████████████████ █ █████████████████████ ██ █████████████████████████ ████ ████ 
 23.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
   3 ms | █  1
   4 ms | █  1
   5 ms | ███  3
   6 ms | ████  4
   7 ms | █  1
   8 ms | ██  2
   9 ms | ███  3
  10 ms | ██  2
  11 ms | ███  3
  12 ms | ██  2
  13 ms | ███  3
  14 ms | █  1
  15 ms | ██  2
  16 ms | █  1
  17 ms | █  1
  18 ms | █  1
  19 ms | ████  4
  20 ms | ██████  6
  21 ms | █████  5
  22 ms | █████  5
  23 ms | █████  5
  24 ms | ████████  8
  25 ms | █████████████  14
  26 ms | █████████  9
  27 ms | ████████████  13
  28 ms | █████████████████  18
  29 ms | ██████████████████████  23
  30 ms | ███████████████████  20
  31 ms | █████████████  14
  32 ms | ██████████████  15
  33 ms | ██████████████████  19
  34 ms | ████████████████████████████████████████  42
  35 ms | ██████████████████████████  27
  36 ms | ██████████████  15
  37 ms | █████████████████████  22
  38 ms | █████████████████  18
  39 ms | ████████  8
  40 ms | █████████  9
  41 ms | ██████  6
  42 ms | ██████████  10
  43 ms | █  1
  44 ms | ████  4
  45 ms | █  1
  46 ms | █████  5
  47 ms | ███  3
  48 ms | ███████  7
  49 ms | ████████████  13
  50 ms | ████  4
  51 ms | ██████████  10
  52 ms | █████████  9
  53 ms | ███████  7
  54 ms | ██████  6
  55 ms | ██████████  10
  56 ms | █████  5
  57 ms | █████████  9
  58 ms | ███  3
  59 ms | ██████  6
  60 ms | ███  3
  62 ms | █  1
  65 ms | █  1
  66 ms | ██  2
  69 ms | ██  2
  71 ms | █  1
  73 ms | █  1
  74 ms | █  1
  75 ms | █  1
  77 ms | ████  4
  79 ms | █  1
  83 ms | █  1
  84 ms | █  1
  87 ms | █  1
  88 ms | █████  5
  93 ms | █  1
  95 ms | █  1
  98 ms | █  1
 101 ms | █  1
 107 ms | █  1
 109 ms | █  1
 111 ms | █  1
 113 ms | █  1
 117 ms | █  1
 128 ms | █  1
 129 ms | █  1
 214 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `38.00`
- `falling_blocks_landed` = `4018.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `25.41`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `4.66`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `620.37`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `7.11`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `30.26`, min `5.85`, p50 `28.69`, p95 `42.35`, p99 `146.79`, 1%low `7.50`, 0.1%low `5.85`, std `21.19`

**Frame time (ms)**  avg `39.48`, p50 `34.85`, p95 `60.99`, p99 `106.55`, p99.9 `155.00`, max `170.81`

**Client tick (ms)**  avg `1.87`, p95 `4.41`, max `70.75`

**Memory**  start `4607 MB`, end `6284 MB`, peak `6565 MB`, GC `33 events / 1237 ms`

**FPS over sampling window (ASCII):**

```
 70.4 |                                           █                                    
 66.0 |                                           █                                    
 61.5 |                                           █                                    
 57.0 |                                           █                      █             
 52.5 |                                           █                      █             
 48.0 |                                 █         █                      █     █       
 43.5 |                                 █         █                      █     █    █  
 39.0 |                                 █         █  █                   █     █    █  
 34.5 |██            █                  █         █  █                █  █     █    █  
 30.0 |██ █   ███  ████ ███   ██ █ ██ █ █████████ █ ████ ███  ████  ███  ████  ███ ██ █
 25.6 |██████████ █████████████████████ ███████████ ██████████████████████████ ███ ████
 21.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   4 ms | █  1
   5 ms | █  1
   6 ms | ███  3
   8 ms | █  1
   9 ms | ██  2
  13 ms | █  1
  14 ms | █  1
  15 ms | ██  2
  16 ms | ██  2
  17 ms | ██  2
  18 ms | ██  2
  20 ms | █  1
  22 ms | ████  4
  23 ms | ███  3
  24 ms | ███  3
  25 ms | ███████  7
  26 ms | ████████████  11
  27 ms | ██████████████████  17
  28 ms | ██████████████  13
  29 ms | ████████████████████  19
  30 ms | ██████████████████████████  25
  31 ms | █████████████████████████████████████  35
  32 ms | ████████████████████████████████████████  38
  33 ms | ████████████████████████████████████████  38
  34 ms | ███████████████████████████  26
  35 ms | ██████████████████████████  25
  36 ms | ████████████████████  19
  37 ms | ██████████████████████  21
  38 ms | ████████████████████  19
  39 ms | ████████  8
  40 ms | ██████  6
  41 ms | ████████  8
  42 ms | ███████  7
  43 ms | ██  2
  44 ms | ██████  6
  45 ms | ████  4
  46 ms | ███████  7
  47 ms | ███  3
  48 ms | █████████████  12
  49 ms | █████  5
  50 ms | █████████  9
  51 ms | ███████  7
  52 ms | ███████  7
  53 ms | ██████  6
  54 ms | ████████  8
  55 ms | ███████  7
  56 ms | ███████  7
  57 ms | ██████  6
  58 ms | █████  5
  59 ms | ██  2
  60 ms | █████  5
  61 ms | ██  2
  65 ms | ██  2
  67 ms | █  1
  75 ms | █  1
  78 ms | █  1
  79 ms | █  1
  81 ms | █  1
  84 ms | █  1
  85 ms | ██  2
  87 ms | █  1
  91 ms | █  1
  94 ms | █  1
  96 ms | █  1
  97 ms | █  1
  99 ms | █  1
 101 ms | █  1
 103 ms | █  1
 106 ms | █  1
 107 ms | █  1
 115 ms | █  1
 133 ms | █  1
 139 ms | █  1
 170 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `7.50`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `25.33`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `5.85`
- `seed` = `5099.00`
- `preload_duration_ms` = `90.00`
- `entity_count_sample_end` = `251.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23146 ms  |  Sample ticks: 400

**FPS**  avg `20.98`, min `5.18`, p50 `20.87`, p95 `34.82`, p99 `40.08`, 1%low `5.54`, 0.1%low `n/a`, std `10.31`

**Frame time (ms)**  avg `64.63`, p50 `47.91`, p95 `127.30`, p99 `163.04`, p99.9 `189.15`, max `192.96`

**Client tick (ms)**  avg `0.76`, p95 `2.40`, max `21.84`

**Memory**  start `5945 MB`, end `4819 MB`, peak `6893 MB`, GC `34 events / 1263 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |                                     █                                          
 32.4 |                                █    █ █                                        
 30.0 |█    █ █████   █ ██ █  █ █ ███  ██   █ █ ██ █      ███  ██   ███                
 27.6 |█ ████ █████   ████ █  ███ █████████ ██████ ██ ███ ████ ██ █ ███                
 25.2 |█ ██████████ █ ██████ ████ █████████ █████████ ████████ ████████                
 22.9 |██████████████ ███████████████████████████████ █████████████████                
 20.5 |██████████████ █████████████████████████████████████████████████                
 18.1 |████████████████████████████████████████████████████████████████                
 15.7 |█████████████████████████████████████████████████████████████████               
 13.4 |█████████████████████████████████████████████████████████████████               
 11.0 |██████████████████████████████████████████████████████████████████ █ ██   █ █ █ 
  8.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  1
  20 ms | █  1
  24 ms | ███  2
  25 ms | █  1
  26 ms | ████  3
  27 ms | █████  4
  28 ms | ████████  6
  29 ms | ████████████  9
  30 ms | ███████████████  11
  31 ms | ███████  5
  32 ms | ███████████████████████████████  23
  33 ms | ████████████████████████████████████████  30
  34 ms | ███████████████████████  17
  35 ms | █████████████████████  16
  36 ms | ███████  5
  37 ms | ███████  5
  38 ms | █████  4
  40 ms | █  1
  41 ms | █  1
  42 ms | █  1
  43 ms | █  1
  44 ms | █  1
  45 ms | █  1
  46 ms | █████  4
  47 ms | ████  3
  48 ms | █████  4
  49 ms | ████  3
  50 ms | █████  4
  51 ms | █  1
  52 ms | ████  3
  53 ms | ███  2
  54 ms | █████  4
  55 ms | ████  3
  56 ms | ███  2
  57 ms | █  1
  58 ms | ███  2
  59 ms | █  1
  60 ms | █  1
  62 ms | █  1
  67 ms | █  1
  70 ms | █  1
  73 ms | █  1
  79 ms | ███  2
  80 ms | █  1
  81 ms | ███  2
  84 ms | █  1
  86 ms | ████  3
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
  90 ms | ███  2
  92 ms | ███  2
  93 ms | █  1
  95 ms | █  1
  96 ms | ████████  6
  97 ms | ███  2
  98 ms | ███████  5
  99 ms | ███████  5
 100 ms | ███████████████████  14
 101 ms | █████  4
 102 ms | █████████  7
 103 ms | █  1
 104 ms | █████  4
 105 ms | █  1
 106 ms | █████████  7
 107 ms | █████  4
 108 ms | ███  2
 109 ms | █  1
 110 ms | ███  2
 112 ms | ███  2
 113 ms | ████  3
 114 ms | █  1
 115 ms | █  1
 117 ms | █████  4
 118 ms | ███  2
 119 ms | █  1
 120 ms | █  1
 121 ms | █  1
 122 ms | █  1
 124 ms | █  1
 126 ms | █  1
 128 ms | ███  2
 130 ms | █  1
 131 ms | ███  2
 133 ms | █  1
 135 ms | █  1
 136 ms | █  1
 137 ms | █  1
 143 ms | █  1
 148 ms | █  1
 151 ms | █  1
 164 ms | █  1
 167 ms | █  1
 180 ms | █  1
 192 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `15.47`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `79.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `5.54`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23064 ms  |  Sample ticks: 400

**FPS**  avg `10.10`, min `5.24`, p50 `9.73`, p95 `12.01`, p99 `28.62`, 1%low `5.36`, 0.1%low `n/a`, std `5.43`

**Frame time (ms)**  avg `106.94`, p50 `102.73`, p95 `146.29`, p99 `180.08`, p99.9 `189.42`, max `191.01`

**Client tick (ms)**  avg `1.04`, p95 `3.86`, max `93.51`

**Memory**  start `4076 MB`, end `4260 MB`, peak `6980 MB`, GC `29 events / 1208 ms`

**FPS over sampling window (ASCII):**

```
 39.2 |                                                 █                              
 36.3 |                                                 █                              
 33.4 |                                                 █                              
 30.5 |                                                 █                              
 27.6 |                                              █  █                              
 24.8 |                                              █  █                              
 21.9 |                                              █  █                              
 19.0 |                                              █  █                              
 16.1 |                                              █  █                              
 13.2 |    █                                         █  █                              
 10.3 |███ █████ ████ ████ █ █████ █████████ ██ ████ █  ████ ████████ ██████████ ███ ██
  7.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms | ███  1
  20 ms | ███  1
  39 ms | ███  1
  68 ms | ███  1
  76 ms | ███  1
  78 ms | ███  1
  79 ms | ███  1
  80 ms | ███  1
  81 ms | ███  1
  83 ms | ██████  2
  85 ms | ██████  2
  86 ms | ██████  2
  87 ms | ███  1
  88 ms | ██████  2
  89 ms | ██████  2
  90 ms | ███  1
  91 ms | ██████  2
  92 ms | ██████  2
  93 ms | ██████████████  5
  94 ms | ██████████████  5
  95 ms | █████████  3
  96 ms | ███████████  4
  97 ms | ██████████████████████████  9
  98 ms | ███████████  4
  99 ms | ███████████████████████████████  11
 100 ms | ████████████████████████████████████████  14
 101 ms | █████████████████████████████  10
 102 ms | ████████████████████  7
 103 ms | █████████████████████████████  10
 104 ms | ██████  2
 105 ms | ███████████████████████  8
 106 ms | █████████  3
 107 ms | █████████  3
 108 ms | █████████  3
 109 ms | ██████  2
 110 ms | ███  1
 111 ms | ███████████  4
 112 ms | ██████  2
 113 ms | ███  1
 114 ms | █████████  3
 115 ms | ██████████████  5
 116 ms | ███████████  4
 117 ms | █████████  3
 118 ms | ███  1
 119 ms | █████████  3
 120 ms | █████████  3
 121 ms | ███  1
 122 ms | ██████  2
 124 ms | █████████  3
 125 ms | ██████  2
 126 ms | ███  1
 129 ms | ███  1
 132 ms | ██████  2
 134 ms | ███  1
 136 ms | ███  1
 137 ms | ███  1
 140 ms | ███  1
 141 ms | ███  1
 143 ms | ██████  2
 147 ms | ███  1
 149 ms | ███  1
 156 ms | ███  1
 166 ms | ███  1
 169 ms | ███  1
 170 ms | ███  1
 175 ms | ███  1
 179 ms | ███  1
 182 ms | ███  1
 191 ms | ███  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `n/a`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `9.35`
- `preload_duration_ms` = `131.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `5.36`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2224.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23073 ms  |  Sample ticks: 400

**FPS**  avg `9.94`, min `4.85`, p50 `9.66`, p95 `12.61`, p99 `35.36`, 1%low `5.20`, 0.1%low `n/a`, std `4.00`

**Frame time (ms)**  avg `107.96`, p50 `103.49`, p95 `155.32`, p99 `176.36`, p99.9 `201.09`, max `206.15`

**Client tick (ms)**  avg `1.10`, p95 `4.10`, max `66.18`

**Memory**  start `4928 MB`, end `4970 MB`, peak `6986 MB`, GC `32 events / 1270 ms`

**FPS over sampling window (ASCII):**

```
 24.0 |  █                                                                             
 22.4 |  █                                                                             
 20.9 |  █                    █                                                        
 19.3 |  █                    █                                                        
 17.7 |  █                    █                                                        
 16.1 |  █                    █                      █                                 
 14.6 |  █                    █                      █                                 
 13.0 |  █                    █                      █                         █       
 11.4 |  █               █    █  █ █         █       █    █   █      █         █    █  
  9.8 |█ ████ █████ ███  ████ █ ██ ███  ████ ███ █   ████████ ██████ █ █ ██ █  ██████  
  8.3 |█ ██████████ ███████████████████████████████████████████████████████████████████
  6.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  24 ms | ████  1
  27 ms | ████  1
  28 ms | ████  1
  46 ms | ████  1
  67 ms | ████  1
  68 ms | ████  1
  74 ms | ███████  2
  78 ms | ███████  2
  81 ms | ████  1
  82 ms | ████  1
  83 ms | ███████  2
  84 ms | ███████████  3
  86 ms | ████  1
  87 ms | ███████  2
  88 ms | ██████████████████  5
  89 ms | ███████████  3
  91 ms | ████  1
  93 ms | ████  1
  94 ms | ███████  2
  95 ms | ██████████████████  5
  96 ms | ██████████████████  5
  97 ms | ████  1
  98 ms | █████████████████████████  7
  99 ms | █████████████████████████████  8
 100 ms | ████████████████████████████████████████  11
 101 ms | █████████████████████████████████  9
 102 ms | ████████████████████████████████████████  11
 103 ms | ████████████████████████████████████  10
 104 ms | ███████████  3
 105 ms | █████████████████████████  7
 106 ms | ███████████  3
 107 ms | ███████████  3
 108 ms | ████  1
 110 ms | ████  1
 111 ms | ███████████████  4
 112 ms | ████  1
 113 ms | ███████████████  4
 114 ms | ███████████████  4
 115 ms | ███████████  3
 116 ms | ██████████████████  5
 117 ms | ███████████  3
 118 ms | ███████  2
 119 ms | ██████████████████  5
 120 ms | ███████████████  4
 121 ms | ███████████  3
 122 ms | ████  1
 123 ms | ████  1
 125 ms | ████  1
 126 ms | ███████  2
 127 ms | ████  1
 128 ms | ████  1
 129 ms | ███████████  3
 132 ms | ████  1
 137 ms | ████  1
 139 ms | ███████  2
 142 ms | ███████  2
 144 ms | ████  1
 145 ms | ████  1
 147 ms | ████  1
 153 ms | ████  1
 155 ms | ████  1
 157 ms | ████  1
 161 ms | ████  1
 162 ms | ████  1
 168 ms | ████  1
 172 ms | ████  1
 175 ms | ███████  2
 178 ms | ████  1
 206 ms | ████  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `5.20`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `9.26`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `4027.00`
- `preload_duration_ms` = `71.00`
- `entity_count_sample_end` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23031 ms  |  Sample ticks: 400

**FPS**  avg `9.97`, min `3.42`, p50 `9.70`, p95 `13.93`, p99 `26.04`, 1%low `3.82`, 0.1%low `n/a`, std `3.04`

**Frame time (ms)**  avg `107.83`, p50 `103.08`, p95 `166.16`, p99 `211.30`, p99.9 `280.99`, max `292.29`

**Client tick (ms)**  avg `0.82`, p95 `3.14`, max `15.60`

**Memory**  start `5502 MB`, end `5895 MB`, peak `7373 MB`, GC `35 events / 1403 ms`

**FPS over sampling window (ASCII):**

```
 19.1 |                     █                                                          
 17.9 |               █     █                                                          
 16.7 |               █     █                                                          
 15.5 |             █ █     █                                                          
 14.3 |             █ █     █                                                          
 13.2 |             █ █     █                      █                                   
 12.0 |      █    █ █ █     █                      █     █            █  █  █      █   
 10.8 |    █ █    █ █ █  █  █   █ █   █ █     █    █     █    █     █ ██ █ ██      █ ██
  9.6 |██  ██████████ █████ █ █ █ █ █████    ███ █ ██  ████████████ █ ██ █ ███████ ████
  8.4 |██████████████ ████████████████████ █ ████████████████████████ █████████████████
  7.2 |██████████████ ████████████████████ ████████████████████████████████████████████
  6.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  37 ms | ████████  2
  38 ms | ████  1
  55 ms | ████  1
  57 ms | ████  1
  59 ms | ████  1
  60 ms | ████  1
  64 ms | ████  1
  71 ms | ████████  2
  73 ms | ████  1
  74 ms | ████████  2
  75 ms | ████████  2
  76 ms | ████  1
  77 ms | ████  1
  79 ms | ████  1
  80 ms | ████████████████  4
  81 ms | ████  1
  82 ms | ████  1
  83 ms | ████████  2
  84 ms | ████  1
  85 ms | ████████  2
  86 ms | ████  1
  88 ms | ████████  2
  89 ms | ████████  2
  90 ms | ████  1
  91 ms | ████████████  3
  93 ms | ████████████████████  5
  94 ms | ████████████  3
  95 ms | ████████████████████  5
  96 ms | ████████████████████████  6
  97 ms | ████████████████████████████  7
  98 ms | ████  1
  99 ms | ████████████████████████  6
 100 ms | ████████████████████████  6
 101 ms | ████████████████████  5
 102 ms | ████████████████████████████████████████  10
 103 ms | ████████████████████  5
 104 ms | ████████████████  4
 105 ms | ████████████████████████████  7
 106 ms | ████████████  3
 107 ms | ████████████  3
 108 ms | ████████████████████████  6
 109 ms | ████  1
 110 ms | ████████████████████████  6
 111 ms | ████████  2
 112 ms | ████  1
 113 ms | ████████████  3
 114 ms | ████████  2
 115 ms | ████████████  3
 116 ms | ████████  2
 117 ms | ████████████  3
 118 ms | ████  1
 119 ms | ████████████████  4
 121 ms | ████  1
 123 ms | ████  1
 124 ms | ████████  2
 125 ms | ████████  2
 126 ms | ████████████  3
 127 ms | ████  1
 128 ms | ████  1
 129 ms | ████████  2
 130 ms | ████████  2
 131 ms | ████  1
 132 ms | ████  1
 135 ms | ████  1
 136 ms | ████  1
 139 ms | ████  1
 141 ms | ████  1
 142 ms | ████  1
 144 ms | ████  1
 146 ms | ████  1
 152 ms | ████████  2
 157 ms | ████  1
 168 ms | ████  1
 173 ms | ████████  2
 174 ms | ████  1
 176 ms | ████  1
 183 ms | ████  1
 184 ms | ████  1
 207 ms | ████  1
 230 ms | ████  1
 292 ms | ████  1
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
- `fps_harmonic_avg` = `9.27`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `3.82`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `117.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23601 ms  |  Sample ticks: 400

**FPS**  avg `10.60`, min `3.19`, p50 `9.67`, p95 `17.00`, p99 `32.54`, 1%low `3.21`, 0.1%low `n/a`, std `5.13`

**Frame time (ms)**  avg `107.23`, p50 `103.36`, p95 `158.66`, p99 `257.37`, p99.9 `312.63`, max `313.21`

**Client tick (ms)**  avg `1.14`, p95 `4.60`, max `56.60`

**Memory**  start `5799 MB`, end `5399 MB`, peak `7264 MB`, GC `12 events / 270 ms`

**FPS over sampling window (ASCII):**

```
 28.1 |              █                                                                 
 26.1 |              █                                                                 
 24.2 |              █                                                                 
 22.2 |              █                                                                 
 20.3 |            █ █                                    █                   █        
 18.3 |            █ █                         █          █                   █        
 16.4 |            █ █                         █          █                   █        
 14.4 |   █        █ █                         █          █                   █        
 12.5 |   █  █     █ █   █    █         █      █    █     █            █      █   █    
 10.5 | █ █ ██ ███ █ ███ █  █████ █   █ █  ███ ██ █ █████ █ ███  █████ ███ █  ███ ██ ██
  8.6 |█████████████████ █ ███████████████████ ███████████████████████ ██████ █████████
  6.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ███████  1
  28 ms | ███████  1
  31 ms | ███████  1
  33 ms | ███████  1
  36 ms | ███████  1
  37 ms | ███████  1
  38 ms | ███████  1
  45 ms | ███████  1
  55 ms | ███████  1
  58 ms | ███████  1
  60 ms | ███████  1
  64 ms | ███████  1
  69 ms | ███████  1
  70 ms | ████████████████████  3
  71 ms | ███████  1
  72 ms | █████████████  2
  73 ms | █████████████  2
  74 ms | ███████  1
  76 ms | █████████████  2
  77 ms | ████████████████████  3
  79 ms | ███████  1
  80 ms | █████████████  2
  81 ms | ███████████████████████████  4
  82 ms | ███████  1
  83 ms | ████████████████████  3
  84 ms | █████████████  2
  86 ms | █████████████  2
  87 ms | ███████  1
  88 ms | █████████████  2
  89 ms | ███████  1
  90 ms | █████████████  2
  91 ms | █████████████████████████████████  5
  92 ms | ████████████████████  3
  93 ms | ████████████████████  3
  94 ms | ████████████████████████████████████████  6
  95 ms | █████████████  2
  96 ms | ███████  1
  97 ms | ████████████████████  3
  98 ms | ████████████████████████████████████████  6
  99 ms | ████████████████████  3
 100 ms | ████████████████████  3
 101 ms | █████████████████████████████████  5
 102 ms | ████████████████████  3
 103 ms | █████████████████████████████████  5
 104 ms | ████████████████████  3
 105 ms | ████████████████████████████████████████  6
 106 ms | █████████████  2
 107 ms | ███████  1
 108 ms | █████████████  2
 109 ms | █████████████  2
 111 ms | █████████████  2
 112 ms | █████████████  2
 113 ms | ███████████████████████████  4
 114 ms | ███████████████████████████  4
 115 ms | █████████████████████████████████  5
 116 ms | █████████████  2
 118 ms | ███████████████████████████  4
 119 ms | ███████████████████████████  4
 120 ms | █████████████  2
 121 ms | ███████  1
 122 ms | ████████████████████  3
 123 ms | ███████████████████████████  4
 125 ms | █████████████  2
 126 ms | ████████████████████  3
 127 ms | ███████  1
 128 ms | ███████  1
 129 ms | ███████  1
 130 ms | ███████  1
 131 ms | ███████  1
 132 ms | █████████████  2
 133 ms | ███████  1
 136 ms | ███████  1
 137 ms | ████████████████████  3
 138 ms | █████████████  2
 139 ms | █████████████  2
 140 ms | █████████████  2
 141 ms | ███████  1
 143 ms | ███████  1
 149 ms | ███████  1
 150 ms | ███████  1
 154 ms | ███████  1
 160 ms | ███████  1
 161 ms | ███████  1
 165 ms | ███████  1
 171 ms | ███████  1
 179 ms | ███████  1
 186 ms | ███████  1
 222 ms | ███████  1
 248 ms | ███████  1
 310 ms | ███████  1
 313 ms | ███████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `3.21`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.33`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7411.00`
- `preload_duration_ms` = `515.00`
- `entity_count_sample_end` = `1.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 24598 ms  |  Sample ticks: 400

**FPS**  avg `11.57`, min `1.92`, p50 `9.64`, p95 `21.14`, p99 `71.23`, 1%low `2.03`, 0.1%low `n/a`, std `12.92`

**Frame time (ms)**  avg `121.91`, p50 `103.71`, p95 `283.15`, p99 `439.71`, p99.9 `511.50`, max `520.68`

**Client tick (ms)**  avg `1.34`, p95 `4.89`, max `47.75`

**Memory**  start `6366 MB`, end `6829 MB`, peak `7352 MB`, GC `10 events / 486 ms`

**FPS over sampling window (ASCII):**

```
 70.5 |                    █                                                           
 64.3 |                    █                                                           
 58.2 |                    █                                                           
 52.0 |                    █                                                           
 45.9 |                    █                                                           
 39.8 |                    █                         █                          █      
 33.6 |                    █                         █                          █      
 27.5 |                    █                         █                          █      
 21.3 |                    █                         █                       █  █      
 15.2 |                    █                     ███ █         █ █           █  █   █  
  9.0 |████████████████████████████████ ████████████ █████████████████████████ ████ ███
  2.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | ██████  1
  12 ms | ██████  1
  14 ms | ██████  1
  18 ms | ██████  1
  28 ms | ██████  1
  38 ms | ██████  1
  39 ms | ██████  1
  40 ms | ██████  1
  46 ms | ██████  1
  51 ms | ██████  1
  53 ms | ██████  1
  56 ms | ██████  1
  58 ms | ██████  1
  59 ms | ██████  1
  63 ms | ██████  1
  70 ms | ███████████  2
  71 ms | ██████  1
  72 ms | ██████  1
  74 ms | ███████████  2
  81 ms | █████████████████  3
  83 ms | █████████████████████████████  5
  84 ms | ███████████  2
  87 ms | █████████████████  3
  88 ms | ███████████  2
  89 ms | ███████████████████████  4
  90 ms | ███████████  2
  92 ms | █████████████████  3
  93 ms | ██████  1
  94 ms | ███████████  2
  95 ms | ███████████  2
  96 ms | █████████████████  3
  97 ms | █████████████████████████████  5
  98 ms | ████████████████████████████████████████  7
  99 ms | ███████████████████████  4
 100 ms | █████████████████  3
 101 ms | ███████████████████████  4
 102 ms | █████████████████████████████  5
 103 ms | ███████████████████████  4
 104 ms | ███████████████████████  4
 105 ms | ███████████████████████  4
 106 ms | ██████  1
 107 ms | ██████  1
 109 ms | ███████████  2
 110 ms | ███████████████████████  4
 111 ms | █████████████████████████████  5
 112 ms | ███████████  2
 113 ms | ███████████  2
 114 ms | █████████████████  3
 115 ms | ███████████  2
 117 ms | ██████  1
 119 ms | █████████████████  3
 120 ms | ██████  1
 121 ms | ██████  1
 122 ms | ██████  1
 124 ms | ██████  1
 125 ms | ███████████  2
 127 ms | ███████████████████████  4
 129 ms | ██████  1
 131 ms | ██████  1
 132 ms | ██████  1
 134 ms | ██████  1
 137 ms | ██████  1
 140 ms | ███████████  2
 141 ms | ██████  1
 142 ms | ██████  1
 150 ms | ██████  1
 155 ms | ███████████  2
 156 ms | ██████  1
 169 ms | ██████  1
 175 ms | ██████  1
 177 ms | ██████  1
 180 ms | ██████  1
 205 ms | ██████  1
 207 ms | ██████  1
 214 ms | ██████  1
 215 ms | ██████  1
 228 ms | ██████  1
 232 ms | ██████  1
 239 ms | ██████  1
 267 ms | ██████  1
 268 ms | ██████  1
 285 ms | ██████  1
 289 ms | ██████  1
 292 ms | ██████  1
 296 ms | ██████  1
 316 ms | ██████  1
 360 ms | ██████  1
 425 ms | ██████  1
 464 ms | ██████  1
 520 ms | ██████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.01`
- `fps_1pct_low` = `2.03`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `8.20`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7417.00`
- `preload_duration_ms` = `1497.00`
- `entity_count_sample_end` = `1.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `10.90`, min `3.29`, p50 `9.52`, p95 `14.85`, p99 `48.89`, 1%low `3.47`, 0.1%low `n/a`, std `9.07`

**Frame time (ms)**  avg `108.67`, p50 `105.07`, p95 `174.11`, p99 `227.52`, p99.9 `298.41`, max `304.33`

**Client tick (ms)**  avg `1.16`, p95 `5.17`, max `30.28`

**Memory**  start `6282 MB`, end `6412 MB`, peak `7378 MB`, GC `12 events / 316 ms`

**FPS over sampling window (ASCII):**

```
 57.5 |         █                                                                      
 52.8 |         █                                                                      
 48.1 |         █                                                                      
 43.4 |         █                                                                      
 38.7 |         █                                                                      
 33.9 |         █                                                                      
 29.2 |         █                                          █   █                       
 24.5 |         █                                          █  ██                       
 19.8 |         █                                          █  ██                       
 15.1 |         █       █                      █      █    █  ██                   █   
 10.4 |█████ ██████ ███ ███████████████████ ██████ ██ ████ ██ ██████████ ███████ ██████
  5.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms | █████  1
  20 ms | ██████████  2
  24 ms | █████  1
  47 ms | █████  1
  59 ms | █████  1
  61 ms | █████  1
  62 ms | █████  1
  65 ms | █████  1
  67 ms | ██████████  2
  69 ms | ███████████████  3
  71 ms | ██████████  2
  72 ms | ███████████████  3
  73 ms | █████  1
  74 ms | █████  1
  75 ms | ██████████  2
  77 ms | ██████████  2
  79 ms | ███████████████  3
  80 ms | ███████████████  3
  81 ms | █████  1
  82 ms | ██████████  2
  84 ms | █████  1
  85 ms | ██████████  2
  86 ms | ███████████████  3
  87 ms | ███████████████  3
  88 ms | ██████████  2
  89 ms | █████  1
  90 ms | ██████████  2
  92 ms | █████  1
  93 ms | ████████████████████  4
  94 ms | █████████████████████████  5
  95 ms | ███████████████  3
  96 ms | ████████████████████  4
  97 ms | ███████████████  3
  98 ms | ████████████████████  4
 100 ms | ██████████████████████████████  6
 101 ms | ████████████████████  4
 102 ms | ████████████████████  4
 103 ms | █████  1
 104 ms | ████████████████████  4
 105 ms | ████████████████████████████████████████  8
 106 ms | ███████████████  3
 107 ms | ███████████████████████████████████  7
 108 ms | ███████████████  3
 109 ms | █████████████████████████  5
 110 ms | ████████████████████  4
 111 ms | ████████████████████  4
 112 ms | ████████████████████  4
 113 ms | █████████████████████████  5
 114 ms | █████████████████████████  5
 116 ms | ████████████████████  4
 120 ms | ██████████  2
 121 ms | █████  1
 122 ms | █████  1
 124 ms | █████  1
 125 ms | ██████████  2
 126 ms | █████  1
 128 ms | █████  1
 129 ms | █████  1
 135 ms | █████  1
 136 ms | ██████████  2
 138 ms | █████  1
 139 ms | █████  1
 141 ms | ██████████  2
 143 ms | █████  1
 144 ms | █████  1
 148 ms | █████  1
 149 ms | █████  1
 150 ms | █████  1
 152 ms | █████  1
 154 ms | █████  1
 158 ms | █████  1
 160 ms | █████  1
 161 ms | █████  1
 166 ms | █████  1
 167 ms | ██████████  2
 172 ms | █████  1
 174 ms | █████  1
 177 ms | █████  1
 188 ms | █████  1
 190 ms | █████  1
 192 ms | █████  1
 208 ms | █████  1
 210 ms | █████  1
 218 ms | █████  1
 271 ms | █████  1
 304 ms | █████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `preset_long` = `0.00`
- `entity_count_delta` = `48.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `3.47`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.20`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7433.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `49.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23130 ms  |  Sample ticks: 400

**FPS**  avg `10.08`, min `5.96`, p50 `9.72`, p95 `14.70`, p99 `19.32`, 1%low `6.07`, 0.1%low `n/a`, std `2.96`

**Frame time (ms)**  avg `105.41`, p50 `102.84`, p95 `149.83`, p99 `161.38`, p99.9 `166.55`, max `167.67`

**Client tick (ms)**  avg `1.19`, p95 `5.09`, max `23.21`

**Memory**  start `5868 MB`, end `7328 MB`, peak `7348 MB`, GC `13 events / 289 ms`

**FPS over sampling window (ASCII):**

```
 20.1 |               █                                                                
 18.9 |               █                                                                
 17.8 |               █                                                                
 16.6 |               █                                                                
 15.4 |               █                                                                
 14.3 |               █                                                                
 13.1 | █             █                 █                 █      █    █                
 12.0 | █ █  █        █                 █        █        █  █ █ █    █                
 10.8 | █ █  █  ██    █  █ █ ██   █   █ █  █ █  ██  █  █  ██ █ █ █ █  █ █   █  █  ██ █ 
  9.6 | █ ██ █ ███ ██ ████ █ ████ █ ███ ██ ███  █████ ███ ██ █ ███ ██ ███  ██████ █████
  8.5 |█████████████████████████████████████████████████████ █ ██████████████████ █████
  7.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  30 ms | ██████  1
  50 ms | ██████  1
  51 ms | ██████  1
  52 ms | ██████  1
  56 ms | ███████████  2
  60 ms | ██████  1
  64 ms | ██████  1
  65 ms | ██████  1
  66 ms | ██████  1
  69 ms | ██████  1
  70 ms | ██████  1
  71 ms | ██████  1
  73 ms | █████████████████  3
  74 ms | ██████  1
  75 ms | ██████  1
  76 ms | ██████  1
  77 ms | ██████  1
  79 ms | █████████████████  3
  81 ms | ███████████████████████  4
  82 ms | ███████████  2
  83 ms | ███████████  2
  84 ms | ███████████  2
  86 ms | ███████████  2
  87 ms | █████████████████  3
  89 ms | ██████████████████████████████████  6
  90 ms | ███████████████████████  4
  91 ms | █████████████████  3
  93 ms | █████████████████████████████  5
  94 ms | ██████  1
  95 ms | █████████████████  3
  96 ms | █████████████████  3
  97 ms | ███████████  2
  98 ms | ██████████████████████████████████  6
  99 ms | ██████████████████████████████████  6
 100 ms | ████████████████████████████████████████  7
 101 ms | █████████████████████████████  5
 102 ms | ████████████████████████████████████████  7
 103 ms | ██████  1
 104 ms | █████████████████  3
 105 ms | ██████████████████████████████████  6
 106 ms | █████████████████████████████  5
 107 ms | █████████████████████████████  5
 108 ms | ███████████████████████  4
 109 ms | ██████████████████████████████████  6
 110 ms | ███████████  2
 111 ms | █████████████████  3
 112 ms | ███████████  2
 113 ms | ███████████  2
 114 ms | ██████  1
 115 ms | ██████  1
 116 ms | ███████████████████████  4
 117 ms | ██████  1
 119 ms | ███████████  2
 121 ms | █████████████████  3
 122 ms | ███████████  2
 123 ms | ███████████  2
 124 ms | █████████████████  3
 125 ms | ██████  1
 126 ms | ███████████  2
 127 ms | ██████  1
 128 ms | ██████  1
 129 ms | ██████  1
 130 ms | ██████  1
 131 ms | ███████████  2
 132 ms | ███████████  2
 133 ms | ██████  1
 134 ms | ██████  1
 135 ms | ██████  1
 136 ms | ███████████  2
 140 ms | ███████████  2
 143 ms | ██████  1
 144 ms | █████████████████  3
 145 ms | ██████  1
 146 ms | ██████  1
 148 ms | ██████  1
 149 ms | ██████  1
 150 ms | ███████████  2
 152 ms | ██████  1
 154 ms | ██████  1
 155 ms | ███████████  2
 158 ms | ██████  1
 161 ms | ███████████  2
 167 ms | ██████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `preset_long` = `0.00`
- `entity_count_delta` = `2.00`
- `entity_count_sample_start` = `7.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `6.07`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.49`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7451.00`
- `preload_duration_ms` = `2.00`
- `entity_count_sample_end` = `9.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 24158 ms  |  Sample ticks: 400

**FPS**  avg `12.05`, min `0.77`, p50 `9.58`, p95 `21.75`, p99 `71.67`, 1%low `0.78`, 0.1%low `n/a`, std `15.53`

**Frame time (ms)**  avg `131.84`, p50 `104.41`, p95 `243.51`, p99 `1167.33`, p99.9 `1288.34`, max `1290.91`

**Client tick (ms)**  avg `2.05`, p95 `4.78`, max `191.52`

**Memory**  start `7183 MB`, end `5753 MB`, peak `7373 MB`, GC `14 events / 437 ms`

**FPS over sampling window (ASCII):**

```
 89.3 | █                                                                              
 81.3 | █                                                                              
 73.3 | █                                                                              
 65.4 | █                                                                              
 57.4 | █                                                                              
 49.4 | █                                                                              
 41.4 | █                                                             █                
 33.5 | █     █                                                       █                
 25.5 | █     █     █   █                                             █     █          
 17.5 | █     █     █   █ █       █                            █      █   █ █          
  9.5 |█████████████████████████████████████████████████████████████  █ ███████████████
  1.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | ██████  1
  13 ms | ██████  1
  14 ms | ██████  1
  20 ms | ██████  1
  22 ms | ██████  1
  27 ms | ██████  1
  35 ms | ██████  1
  42 ms | ██████  1
  45 ms | ██████  1
  46 ms | ██████  1
  55 ms | ██████  1
  58 ms | ██████  1
  62 ms | ██████  1
  63 ms | ██████  1
  66 ms | ██████  1
  69 ms | ██████  1
  71 ms | ██████  1
  74 ms | ███████████  2
  75 ms | ███████████  2
  77 ms | ██████  1
  78 ms | ██████  1
  79 ms | ██████  1
  80 ms | ███████████  2
  81 ms | ███████████  2
  82 ms | ██████  1
  84 ms | █████████████████  3
  86 ms | ██████  1
  87 ms | ███████████  2
  88 ms | ███████████  2
  89 ms | ██████  1
  90 ms | ██████  1
  91 ms | ████████████████████████████████████████  7
  92 ms | █████████████████  3
  93 ms | █████████████████  3
  94 ms | ██████  1
  96 ms | ███████████████████████  4
  97 ms | ██████████████████████████████████  6
  98 ms | ███████████████████████  4
  99 ms | ██████  1
 100 ms | █████████████████  3
 101 ms | ███████████  2
 102 ms | ███████████  2
 103 ms | ███████████████████████  4
 104 ms | █████████████████████████████  5
 105 ms | ███████████  2
 106 ms | ██████████████████████████████████  6
 107 ms | ██████  1
 108 ms | ███████████  2
 109 ms | ███████████████████████  4
 110 ms | ███████████  2
 111 ms | ██████  1
 112 ms | █████████████████  3
 113 ms | █████████████████  3
 114 ms | █████████████████████████████  5
 115 ms | ██████  1
 116 ms | ██████  1
 118 ms | ███████████  2
 121 ms | ███████████  2
 122 ms | ██████  1
 123 ms | █████████████████  3
 127 ms | ███████████  2
 128 ms | █████████████████████████████  5
 129 ms | ███████████  2
 131 ms | ███████████  2
 132 ms | ██████  1
 133 ms | ██████  1
 134 ms | ██████  1
 135 ms | ██████  1
 139 ms | ██████  1
 141 ms | ██████  1
 144 ms | ██████  1
 146 ms | ██████  1
 149 ms | ██████  1
 152 ms | ██████  1
 155 ms | ██████  1
 157 ms | ██████  1
 158 ms | ██████  1
 161 ms | ██████  1
 162 ms | ██████  1
 164 ms | ██████  1
 181 ms | ██████  1
 195 ms | ██████  1
 232 ms | ██████  1
 239 ms | ██████  1
 243 ms | ██████  1
 275 ms | ██████  1
 276 ms | ██████  1
 279 ms | ██████  1
 343 ms | ██████  1
 424 ms | ██████  1
1101 ms | ██████  1
1275 ms | ██████  1
1290 ms | ██████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3.00`
- `entity_count_sample_start` = `11.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `0.78`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `65.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `7.59`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7457.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `8.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 26204 ms  |  Sample ticks: 400

**FPS**  avg `10.53`, min `4.19`, p50 `9.72`, p95 `19.01`, p99 `25.58`, 1%low `4.32`, 0.1%low `n/a`, std `4.10`

**Frame time (ms)**  avg `105.74`, p50 `102.91`, p95 `161.33`, p99 `202.00`, p99.9 `236.03`, max `238.73`

**Client tick (ms)**  avg `1.31`, p95 `6.15`, max `22.43`

**Memory**  start `7153 MB`, end `6200 MB`, peak `7365 MB`, GC `16 events / 366 ms`

**FPS over sampling window (ASCII):**

```
 21.2 |                                                    █                           
 19.9 |                                                    █                           
 18.5 |                                     █              █                           
 17.2 |                                     █              █       █                   
 15.8 |            █                        █            █ █       █   █               
 14.5 |      █     █               █        █            █ █       █ █ █           █   
 13.1 |      █     █               █        █            █ █    █  █ █ █    █      █   
 11.8 |      █     █            █  █   █    █ █   █      █ █    █  █ █ █    █   █  ██  
 10.4 |█ █ █ ██   ██ █ ██ █ ██  ██ █   █ ██ █ ██ ██ █ ██ █ █   ██  █ █ █ █ ██ █ ██ ██  
  9.1 |████████████████████████ ████ ██████ ████████████ █ ███████ █ ████████ ████████ 
  7.7 |████████████████████████████████████ ████████████ ███████████ ██████████████████
  6.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  33 ms | ███████  1
  35 ms | ███████  1
  39 ms | █████████████  2
  41 ms | ███████  1
  42 ms | ███████  1
  43 ms | ███████  1
  50 ms | █████████████  2
  52 ms | █████████████  2
  54 ms | ████████████████████  3
  57 ms | █████████████  2
  61 ms | ███████  1
  65 ms | ███████  1
  69 ms | ███████  1
  71 ms | ████████████████████  3
  72 ms | ███████  1
  74 ms | ███████  1
  75 ms | █████████████  2
  77 ms | ███████  1
  78 ms | ███████  1
  79 ms | ███████  1
  80 ms | █████████████  2
  81 ms | ████████████████████  3
  82 ms | █████████████  2
  83 ms | ███████  1
  84 ms | █████████████  2
  86 ms | ███████  1
  87 ms | █████████████████████████████████  5
  88 ms | ███████  1
  89 ms | █████████████  2
  90 ms | ████████████████████████████████████████  6
  91 ms | ███████  1
  92 ms | █████████████  2
  93 ms | █████████████████████████████████  5
  94 ms | ███████  1
  95 ms | ███████████████████████████  4
  96 ms | ███████████████████████████  4
  97 ms | █████████████████████████████████  5
  98 ms | █████████████████████████████████  5
  99 ms | ████████████████████  3
 100 ms | █████████████  2
 101 ms | ████████████████████  3
 102 ms | ████████████████████████████████████████  6
 103 ms | ███████████████████████████  4
 104 ms | ████████████████████████████████████████  6
 105 ms | ███████████████████████████  4
 108 ms | ███████████████████████████  4
 109 ms | ████████████████████  3
 110 ms | ████████████████████  3
 111 ms | ████████████████████████████████████████  6
 112 ms | █████████████  2
 113 ms | ███████  1
 114 ms | ████████████████████  3
 115 ms | ███████  1
 116 ms | █████████████  2
 117 ms | █████████████  2
 118 ms | ████████████████████  3
 119 ms | █████████████  2
 120 ms | ████████████████████  3
 121 ms | ████████████████████  3
 122 ms | ███████  1
 124 ms | ████████████████████  3
 126 ms | █████████████  2
 127 ms | ████████████████████  3
 128 ms | ███████  1
 129 ms | ███████  1
 131 ms | ███████  1
 132 ms | ███████  1
 133 ms | ████████████████████  3
 134 ms | █████████████  2
 135 ms | █████████████  2
 136 ms | █████████████  2
 139 ms | █████████████  2
 146 ms | ███████  1
 147 ms | █████████████  2
 149 ms | ███████  1
 150 ms | ███████  1
 152 ms | ███████  1
 153 ms | ███████  1
 154 ms | ███████  1
 160 ms | ███████  1
 161 ms | ███████  1
 171 ms | ███████  1
 172 ms | █████████████  2
 180 ms | ███████  1
 190 ms | ███████  1
 195 ms | ███████  1
 199 ms | ███████  1
 224 ms | ███████  1
 238 ms | ███████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `preset_long` = `0.00`
- `entity_count_delta` = `-45.00`
- `entity_count_sample_start` = `52.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `4.32`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `56.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.46`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7477.00`
- `preload_duration_ms` = `3106.00`
- `entity_count_sample_end` = `7.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23807 ms  |  Sample ticks: 400

**FPS**  avg `10.07`, min `3.93`, p50 `9.66`, p95 `14.28`, p99 `22.35`, 1%low `4.27`, 0.1%low `n/a`, std `3.82`

**Frame time (ms)**  avg `106.85`, p50 `103.57`, p95 `153.07`, p99 `181.15`, p99.9 `246.81`, max `254.43`

**Client tick (ms)**  avg `1.09`, p95 `4.36`, max `22.45`

**Memory**  start `7040 MB`, end `6577 MB`, peak `7369 MB`, GC `19 events / 356 ms`

**FPS over sampling window (ASCII):**

```
 29.1 |                                                          █                     
 27.0 |                                                          █                     
 24.9 |                                                          █                     
 22.8 |                                                          █                     
 20.7 |                                                          █                     
 18.5 |                                                          █                     
 16.4 |                                                          █                    █
 14.3 |                                                          █              █     █
 12.2 |  █                         █ █   █   █                 █ █  █   █    █  █   █ █
 10.1 |████ ███ █ ████ ████ ████ ███ ██████  ██████ ██ █ ████ ██ ██ █ █ ██   █  ███ ███
  7.9 |█████████████████████████████████████████████████████████ ██████████████████████
  5.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  20 ms | ██████  1
  35 ms | ██████  1
  46 ms | ██████  1
  60 ms | ██████  1
  62 ms | ██████  1
  66 ms | ███████████  2
  67 ms | ███████████  2
  68 ms | ██████  1
  72 ms | ███████████  2
  73 ms | ██████  1
  74 ms | ██████  1
  75 ms | ██████  1
  76 ms | ██████  1
  77 ms | ██████  1
  79 ms | ██████  1
  80 ms | ██████  1
  81 ms | █████████████████████████████  5
  83 ms | ███████████  2
  85 ms | ███████████  2
  86 ms | ███████████  2
  87 ms | █████████████████████████████  5
  88 ms | █████████████████  3
  89 ms | ███████████  2
  90 ms | ███████████████████████  4
  91 ms | ███████████████████████  4
  92 ms | ███████████  2
  93 ms | ███████████████████████  4
  94 ms | █████████████████  3
  95 ms | █████████████████████████████  5
  96 ms | ███████████████████████  4
  97 ms | ███████████  2
  98 ms | ███████████  2
  99 ms | █████████████████  3
 100 ms | █████████████████████████████  5
 101 ms | ████████████████████████████████████████  7
 102 ms | ███████████████████████  4
 103 ms | ██████████████████████████████████  6
 104 ms | ███████████████████████  4
 105 ms | ███████████████████████  4
 106 ms | ███████████████████████  4
 107 ms | █████████████████████████████  5
 108 ms | ███████████████████████  4
 109 ms | ███████████  2
 110 ms | ███████████████████████  4
 111 ms | █████████████████  3
 112 ms | ███████████  2
 113 ms | ██████  1
 115 ms | █████████████████████████████  5
 116 ms | █████████████████  3
 117 ms | ███████████  2
 118 ms | ███████████  2
 119 ms | █████████████████  3
 120 ms | █████████████████  3
 121 ms | ███████████  2
 122 ms | █████████████████  3
 123 ms | ██████  1
 124 ms | █████████████████  3
 125 ms | ███████████  2
 127 ms | ██████  1
 128 ms | ██████  1
 129 ms | ███████████████████████  4
 130 ms | ███████████  2
 131 ms | ███████████  2
 133 ms | █████████████████  3
 135 ms | ███████████  2
 138 ms | ██████  1
 142 ms | ██████  1
 143 ms | ██████  1
 147 ms | ██████  1
 149 ms | ██████  1
 152 ms | ██████  1
 153 ms | ██████  1
 154 ms | ██████  1
 159 ms | ██████  1
 161 ms | ██████  1
 163 ms | ██████  1
 165 ms | ██████  1
 176 ms | ███████████  2
 213 ms | ██████  1
 254 ms | ██████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `preset_long` = `0.00`
- `entity_count_delta` = `14.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `4.27`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `65.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.36`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `852.00`
- `entity_count_sample_end` = `15.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 222861 ms  |  Sample ticks: 400

**FPS**  avg `11.54`, min `2.83`, p50 `9.96`, p95 `15.77`, p99 `23.05`, 1%low `3.48`, 0.1%low `n/a`, std `14.93`

**Frame time (ms)**  avg `101.84`, p50 `100.37`, p95 `138.32`, p99 `163.77`, p99.9 `327.43`, max `353.13`

**Client tick (ms)**  avg `0.87`, p95 `3.22`, max `19.44`

**Memory**  start `7164 MB`, end `6472 MB`, peak `7383 MB`, GC `18 events / 224 ms`

**FPS over sampling window (ASCII):**

```
111.4 |                                                     █                          
101.9 |                                                     █                          
 92.3 |                                                     █                          
 82.8 |                                                     █                          
 73.3 |                                                     █                          
 63.7 |                                                     █                          
 54.2 |                                                     █                          
 44.7 |                                                     █                          
 35.1 |                                                     █                          
 25.6 |                                    █                █                          
 16.1 | █    █         █ █             █   █      █         █ █    █ █   ███  █ █    █ 
  6.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ████  1
  25 ms | ████  1
  45 ms | ████  1
  51 ms | ████  1
  55 ms | ████████  2
  57 ms | ████  1
  60 ms | ████  1
  61 ms | ████  1
  62 ms | ████  1
  63 ms | ████████  2
  64 ms | ████████  2
  68 ms | ████  1
  69 ms | ████████  2
  71 ms | ████████  2
  73 ms | ████  1
  74 ms | ████████  2
  75 ms | ████████  2
  76 ms | ████████████  3
  77 ms | ████  1
  78 ms | ████████  2
  79 ms | ████████████  3
  80 ms | ████  1
  81 ms | ████████████████  4
  82 ms | ████████  2
  83 ms | ████████  2
  84 ms | ████████  2
  86 ms | ████████████████████  5
  87 ms | ████████  2
  88 ms | ████████████  3
  89 ms | ████████████  3
  90 ms | ████████  2
  91 ms | ████████████████████████  6
  92 ms | ████  1
  93 ms | ████  1
  94 ms | ████████████████████  5
  95 ms | ████████  2
  96 ms | ████████████████  4
  97 ms | ████████████████████  5
  98 ms | ████████████████████  5
  99 ms | ████████████████████████  6
 100 ms | ████████████████████████████████  8
 101 ms | ████████████  3
 102 ms | ████████████████████████████████  8
 103 ms | ████████████████████████████████████████  10
 104 ms | ████████  2
 105 ms | ████████  2
 106 ms | ████████████  3
 107 ms | ████████████████  4
 108 ms | ████████████████  4
 109 ms | ████████  2
 110 ms | ████████  2
 111 ms | ████  1
 112 ms | ████████████████  4
 113 ms | ████  1
 114 ms | ████  1
 115 ms | ████  1
 116 ms | ████████████  3
 117 ms | ████  1
 118 ms | ████  1
 119 ms | ████████████  3
 120 ms | ████████████████  4
 121 ms | ████  1
 122 ms | ████████  2
 123 ms | ████  1
 125 ms | ████████  2
 126 ms | ████████████████  4
 127 ms | ████████████  3
 129 ms | ████████  2
 130 ms | ████  1
 131 ms | ████████  2
 134 ms | ████████  2
 135 ms | ████  1
 136 ms | ████  1
 137 ms | ████  1
 138 ms | ████████  2
 141 ms | ████  1
 143 ms | ████  1
 149 ms | ████  1
 153 ms | ████████  2
 155 ms | ████  1
 160 ms | ████  1
 221 ms | ████  1
 353 ms | ████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `preset_long` = `0.00`
- `entity_count_delta` = `82.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `3.48`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `512.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.82`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `199734.00`
- `entity_count_sample_end` = `83.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23699 ms  |  Sample ticks: 400

**FPS**  avg `10.36`, min `6.65`, p50 `9.98`, p95 `14.46`, p99 `19.87`, 1%low `6.74`, 0.1%low `n/a`, std `2.71`

**Frame time (ms)**  avg `100.91`, p50 `100.23`, p95 `134.78`, p99 `142.38`, p99.9 `149.56`, max `150.36`

**Client tick (ms)**  avg `1.27`, p95 `4.76`, max `16.16`

**Memory**  start `7165 MB`, end `6554 MB`, peak `7366 MB`, GC `24 events / 313 ms`

**FPS over sampling window (ASCII):**

```
 20.7 |       █                                                                        
 19.6 |       █                                                                        
 18.5 |       █                                                                        
 17.4 |       █                                                                        
 16.4 |       █                                                                        
 15.3 |       █                                 █                                      
 14.2 |       █    █                            █                                      
 13.1 |       █    █                            █                      █               
 12.0 |   █   █    █                            █                      █     ██        
 10.9 |   █   █ █  █ █    ██   ██   █  █ █ █ █  █     █  █ █  █  ██    ██  █ ██  █ ███ 
  9.8 |██████ ████ █ ███ █████████ ███████████  ██████████ █████ ████ ████ █ ██████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  29 ms | ████  1
  48 ms | ████  1
  50 ms | ████  1
  52 ms | ████  1
  60 ms | ████  1
  65 ms | ███████  2
  66 ms | ███████  2
  67 ms | ████  1
  69 ms | ███████  2
  70 ms | ████  1
  72 ms | ████  1
  73 ms | ████  1
  74 ms | ████  1
  78 ms | ███████  2
  79 ms | ███████████  3
  80 ms | ████  1
  81 ms | ███████  2
  82 ms | ███████████  3
  83 ms | ██████████████████  5
  84 ms | ████  1
  85 ms | ████  1
  86 ms | ██████████████████████  6
  87 ms | ███████████  3
  88 ms | ███████████  3
  89 ms | ████  1
  90 ms | ████  1
  91 ms | ██████████████████████  6
  92 ms | ████  1
  93 ms | █████████████████████████  7
  94 ms | ████████████████████████████████████████  11
  95 ms | ██████████████████████  6
  96 ms | ███████████████  4
  97 ms | ███████████████  4
  98 ms | █████████████████████████████  8
  99 ms | ███████████████  4
 100 ms | █████████████████████████████  8
 101 ms | ██████████████████  5
 102 ms | ██████████████████████  6
 103 ms | ████  1
 104 ms | ███████████████  4
 105 ms | ███████████  3
 106 ms | ██████████████████████  6
 107 ms | ████  1
 108 ms | ███████████████  4
 109 ms | ███████████████  4
 110 ms | ███████████████  4
 111 ms | ███████████  3
 112 ms | ███████████████  4
 113 ms | ███████  2
 114 ms | ███████████████  4
 115 ms | ███████████████  4
 116 ms | ███████████████  4
 117 ms | ███████████████  4
 119 ms | ████  1
 121 ms | ████  1
 123 ms | ████  1
 124 ms | ███████  2
 125 ms | ███████  2
 126 ms | ████  1
 127 ms | ███████  2
 128 ms | ████  1
 129 ms | ███████  2
 130 ms | ███████████████  4
 131 ms | ████  1
 134 ms | ████  1
 135 ms | ███████  2
 136 ms | ███████  2
 138 ms | ███████  2
 140 ms | ████  1
 142 ms | ████  1
 146 ms | ████  1
 150 ms | ████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `preset_long` = `0.00`
- `entity_count_delta` = `-18.00`
- `entity_count_sample_start` = `23.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `6.74`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.91`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7499.00`
- `preload_duration_ms` = `709.00`
- `entity_count_sample_end` = `5.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 24151 ms  |  Sample ticks: 400

**FPS**  avg `10.72`, min `6.12`, p50 `9.85`, p95 `13.37`, p99 `15.77`, 1%low `6.14`, 0.1%low `n/a`, std `7.95`

**Frame time (ms)**  avg `101.03`, p50 `101.55`, p95 `130.95`, p99 `159.78`, p99.9 `163.23`, max `163.41`

**Client tick (ms)**  avg `0.81`, p95 `3.73`, max `18.18`

**Memory**  start `7366 MB`, end `6632 MB`, peak `7446 MB`, GC `23 events / 304 ms`

**FPS over sampling window (ASCII):**

```
 64.4 |                                                                    █           
 59.2 |                                                                    █           
 53.9 |                                                                    █           
 48.6 |                                                                    █           
 43.4 |                                                                    █           
 38.1 |                                                                    █           
 32.8 |                                                                    █           
 27.6 |                                                                    █           
 22.3 |                                                                    █           
 17.0 |                                                                    █           
 11.8 |████████ ██████ ██████ ████████████████████████████ ████ ███ ██████ █ █ ███████ 
  6.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | ███  1
  55 ms | ███  1
  63 ms | ███  1
  64 ms | ███  1
  68 ms | ██████  2
  70 ms | ███  1
  72 ms | ███  1
  73 ms | ███  1
  74 ms | ██████  2
  75 ms | ███  1
  76 ms | █████████  3
  77 ms | ██████  2
  78 ms | ███  1
  79 ms | ██████████████████  6
  80 ms | ██████████████████  6
  81 ms | ██████  2
  82 ms | ████████████  4
  83 ms | █████████  3
  84 ms | █████████  3
  85 ms | ██████  2
  86 ms | ███  1
  87 ms | ███  1
  88 ms | ██████  2
  89 ms | ██████  2
  90 ms | ████████████  4
  91 ms | █████████  3
  92 ms | █████████  3
  93 ms | ██████  2
  94 ms | ██████  2
  95 ms | ██████  2
  96 ms | ████████████  4
  97 ms | █████████  3
  98 ms | ███████████████████████████████  10
  99 ms | ███████████████  5
 100 ms | ██████████████████  6
 101 ms | ██████████████████  6
 102 ms | ████████████████████████████  9
 103 ms | ██████████████████  6
 104 ms | ████████████████████████████████████████  13
 105 ms | ██████  2
 106 ms | ██████  2
 107 ms | ████████████████████████████  9
 108 ms | ████████████  4
 109 ms | ███  1
 110 ms | █████████  3
 111 ms | ████████████  4
 113 ms | ███████████████  5
 116 ms | █████████  3
 117 ms | ██████████████████  6
 118 ms | █████████  3
 119 ms | ███  1
 120 ms | █████████  3
 121 ms | █████████  3
 122 ms | ██████  2
 123 ms | ███████████████  5
 129 ms | ██████  2
 130 ms | ███  1
 133 ms | ███  1
 134 ms | ███  1
 136 ms | ███  1
 139 ms | ███  1
 146 ms | ██████  2
 148 ms | ███  1
 159 ms | ███  1
 162 ms | ███  1
 163 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.09`
- `fps_1pct_low` = `6.14`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `57.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.90`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7507.00`
- `preload_duration_ms` = `1111.00`
- `entity_count_sample_end` = `1.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23477 ms  |  Sample ticks: 400

**FPS**  avg `10.46`, min `5.95`, p50 `9.96`, p95 `16.14`, p99 `18.96`, 1%low `6.05`, 0.1%low `n/a`, std `2.56`

**Frame time (ms)**  avg `100.68`, p50 `100.42`, p95 `140.73`, p99 `154.15`, p99.9 `167.06`, max `168.21`

**Client tick (ms)**  avg `1.03`, p95 `4.03`, max `12.33`

**Memory**  start `6976 MB`, end `6606 MB`, peak `7390 MB`, GC `27 events / 323 ms`

**FPS over sampling window (ASCII):**

```
 15.5 |                                       █                                        
 14.7 |  █                                    █                                        
 14.0 |  █   █                 █              █                              █         
 13.3 |  █   █      █          █              █                              █     █   
 12.6 |  █   █     ██          █              █     █   █                    █ █   █  █
 11.9 |█ █   █ █   ██          █              █     █ █ █                    █ █   ██ █
 11.2 |█ █   █ █   ██   █      █     █     █  █     █ █ █      ██ █   █      █ █   ██ █
 10.5 |█ ██  █ █   ██   ███  █ █  ████ ███ █  █ ██  ███ ██ ██  ██ █   █ ████ █ █ █ ██ █
  9.8 |█ ███ █ ███ ████ ████ █ ███████ ███ ██ ████  ███ █████████ █████ ████ █ ███ ██ █
  9.1 |█ ███ █ ███ ██████████████████████████ █████ ███ ██████████████████████ ███ ████
  8.4 |█ ███ ████████████████████████████████ ████████████████████████████████████ ████
  7.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  51 ms | ████  1
  52 ms | █████████████  3
  54 ms | ████  1
  57 ms | ████  1
  58 ms | ████  1
  59 ms | ████  1
  61 ms | █████████████  3
  63 ms | ████  1
  64 ms | ████  1
  66 ms | █████████████  3
  68 ms | ████  1
  69 ms | ████  1
  70 ms | ████  1
  71 ms | ████  1
  72 ms | ████  1
  73 ms | █████████  2
  74 ms | ████  1
  75 ms | ████  1
  76 ms | █████████████  3
  78 ms | ████  1
  80 ms | █████████████  3
  82 ms | █████████  2
  83 ms | ██████████████████████  5
  84 ms | █████████  2
  85 ms | █████████████  3
  86 ms | █████████  2
  87 ms | ████  1
  88 ms | ██████████████████  4
  89 ms | █████████  2
  90 ms | ██████████████████  4
  91 ms | █████████  2
  92 ms | ████████████████████████████████████████  9
  93 ms | ██████████████████  4
  94 ms | ██████████████████  4
  95 ms | ██████████████████████  5
  97 ms | █████████████  3
  98 ms | ███████████████████████████████  7
  99 ms | ███████████████████████████  6
 100 ms | ██████████████████  4
 101 ms | ███████████████████████████  6
 102 ms | ██████████████████  4
 103 ms | ████████████████████████████████████████  9
 104 ms | ██████████████████  4
 105 ms | ███████████████████████████  6
 106 ms | █████████████  3
 107 ms | ██████████████████  4
 108 ms | ██████████████████  4
 109 ms | ████  1
 110 ms | ████  1
 111 ms | █████████████  3
 112 ms | █████████████  3
 114 ms | ██████████████████  4
 115 ms | ██████████████████████  5
 116 ms | █████████  2
 117 ms | █████████████  3
 118 ms | █████████████  3
 119 ms | █████████████  3
 120 ms | █████████████  3
 121 ms | █████████████  3
 122 ms | ████  1
 123 ms | ████  1
 125 ms | ████  1
 126 ms | ████  1
 128 ms | ████  1
 129 ms | ████  1
 132 ms | ████  1
 134 ms | █████████  2
 135 ms | ████  1
 136 ms | ████  1
 137 ms | ████  1
 138 ms | ████  1
 140 ms | ████  1
 142 ms | █████████  2
 143 ms | ████  1
 146 ms | █████████  2
 151 ms | ████  1
 152 ms | ████  1
 153 ms | ████  1
 162 ms | ████  1
 168 ms | ████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `preset_long` = `0.00`
- `entity_count_delta` = `-53.00`
- `entity_count_sample_start` = `54.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `6.05`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `52.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.93`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7517.00`
- `preload_duration_ms` = `487.00`
- `entity_count_sample_end` = `1.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23071 ms  |  Sample ticks: 400

**FPS**  avg `10.41`, min `6.14`, p50 `10.15`, p95 `16.36`, p99 `19.51`, 1%low `6.23`, 0.1%low `n/a`, std `2.55`

**Frame time (ms)**  avg `100.86`, p50 `98.50`, p95 `137.88`, p99 `156.56`, p99.9 `161.96`, max `162.91`

**Client tick (ms)**  avg `1.06`, p95 `4.28`, max `26.51`

**Memory**  start `6787 MB`, end `6991 MB`, peak `7376 MB`, GC `27 events / 298 ms`

**FPS over sampling window (ASCII):**

```
 15.9 |                                                                               █
 15.2 |                                                                               █
 14.4 |                                                                █              █
 13.7 | █                                                    █    █    █              █
 13.0 | █      █                             █             █ █    █    █      █       █
 12.3 | █      █                             █             █ █    █    █      █       █
 11.6 | █      █          █                  █  █       █  █ █    █    █ █    ██  █   █
 10.8 | ██ █   █ █  ███   █ █  ██    █ █    ██  █   █ █ █  █ █    ██   █ ██   ██  ██  █
 10.1 | ████  ██ ██ ████  █ ██ █████ █████ ████ ███ █ █ ██ █ ███  ██   █ ███  ██  ██ ██
  9.4 | ███████████ █████ ████ ███████████ ████ ███ ██████ █ ████ ████ █ ████ ███ ██ ██
  8.7 | ████████████████████████████████████████████████████ █████████ █████████████ ██
  7.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  42 ms | ████  1
  49 ms | ████  1
  51 ms | ████  1
  56 ms | ████  1
  57 ms | ███████████  3
  58 ms | ████  1
  59 ms | ████  1
  60 ms | ████  1
  61 ms | ████  1
  62 ms | ████  1
  66 ms | ████  1
  67 ms | ████  1
  71 ms | ███████  2
  73 ms | ███████  2
  77 ms | ████  1
  78 ms | ████  1
  79 ms | ███████████  3
  80 ms | ███████  2
  81 ms | ██████████████████  5
  82 ms | ████  1
  83 ms | ███████████████  4
  84 ms | ███████████  3
  85 ms | ████  1
  86 ms | ███████████████  4
  87 ms | ███████  2
  88 ms | ███████████████  4
  89 ms | ███████  2
  90 ms | ███████  2
  91 ms | ███████████  3
  92 ms | █████████████████████████████  8
  93 ms | ███████████  3
  94 ms | ████████████████████████████████████████  11
  95 ms | █████████████████████████████  8
  96 ms | ██████████████████  5
  97 ms | ███████████████  4
  98 ms | ██████████████████  5
  99 ms | █████████████████████████████████  9
 100 ms | ███████████  3
 101 ms | ███████████████  4
 102 ms | ████  1
 103 ms | ██████████████████████  6
 104 ms | ███████  2
 105 ms | ████  1
 106 ms | ███████  2
 107 ms | ███████  2
 108 ms | ███████████████  4
 110 ms | ███████████████  4
 111 ms | ███████  2
 112 ms | ██████████████████  5
 113 ms | ██████████████████████  6
 114 ms | █████████████████████████  7
 116 ms | ████  1
 117 ms | ███████████████  4
 118 ms | ███████████  3
 120 ms | ███████  2
 121 ms | ███████████  3
 122 ms | ████  1
 123 ms | ████  1
 124 ms | ████  1
 125 ms | ███████  2
 127 ms | ███████████████  4
 128 ms | ████  1
 129 ms | ████  1
 132 ms | ███████  2
 134 ms | ████  1
 135 ms | ████  1
 136 ms | ████  1
 137 ms | ███████  2
 138 ms | ████  1
 140 ms | ████  1
 143 ms | ████  1
 148 ms | ████  1
 150 ms | ████  1
 152 ms | ████  1
 156 ms | ████  1
 158 ms | ████  1
 162 ms | ████  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `preset_long` = `0.00`
- `entity_count_delta` = `40.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `6.23`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.91`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7523.00`
- `preload_duration_ms` = `99.00`
- `entity_count_sample_end` = `41.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `10.08`, min `6.83`, p50 `9.94`, p95 `12.71`, p99 `16.66`, 1%low `6.95`, 0.1%low `n/a`, std `1.65`

**Frame time (ms)**  avg `101.46`, p50 `100.58`, p95 `126.49`, p99 `139.15`, p99.9 `145.42`, max `146.44`

**Client tick (ms)**  avg `0.77`, p95 `2.46`, max `14.44`

**Memory**  start `6250 MB`, end `7106 MB`, peak `7508 MB`, GC `95 events / 1874 ms`

**FPS over sampling window (ASCII):**

```
 13.3 |██                                                                              
 12.8 |██                                                                              
 12.4 |██                                               █                              
 12.0 |██                                               █    █                    █    
 11.5 |██                                               █    █                █   █    
 11.1 |██                █        █         █           ██   █ █    █         █   █    
 10.7 |██                █      █ █   █     █           ██   █ █    █   █  █  █   █    
 10.2 |███   █ █ █   █ █ ███    █ █ █ ██    █  █   ██   ██   █ █    ██  █  █  █   █ ██ 
  9.8 |█████ █ █████ ███ █████ ██ ███ ███  ██████ ████  ████ █ ██ █ ██ ██████ █ ██████ 
  9.4 |██████████████████████████ ███████ ███████ ████  ██████ ████ ██████████████████ 
  9.0 |███████████████████████████████████████████████  ███████████ ██████████████████ 
  8.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  51 ms | ██  1
  55 ms | ██  1
  60 ms | ██  1
  62 ms | ██  1
  63 ms | ██  1
  70 ms | ██  1
  75 ms | ████  2
  77 ms | ██  1
  78 ms | ████  2
  80 ms | ██  1
  81 ms | ████  2
  83 ms | ██████████  5
  84 ms | ██  1
  85 ms | ██████  3
  86 ms | ████  2
  87 ms | ██  1
  88 ms | ████████  4
  89 ms | ████  2
  90 ms | ██████  3
  91 ms | ██  1
  92 ms | ████  2
  93 ms | ██  1
  94 ms | ██████  3
  95 ms | ██████  3
  96 ms | ████████  4
  97 ms | ██████████████████████  11
  98 ms | ████████████████████████████  14
  99 ms | ██████████████████████  11
 100 ms | ████████████████████████████████████████  20
 101 ms | ██████████████████  9
 102 ms | ██████████████████████  11
 103 ms | ██████████████████████  11
 104 ms | ████████  4
 105 ms | ██████  3
 106 ms | ████████████  6
 107 ms | ██████  3
 108 ms | ████████  4
 109 ms | ██  1
 110 ms | ██████  3
 111 ms | ████████  4
 112 ms | ██  1
 113 ms | ████  2
 114 ms | ████  2
 115 ms | ████  2
 116 ms | ████  2
 117 ms | ████  2
 118 ms | ████  2
 119 ms | ██  1
 120 ms | ████  2
 121 ms | ████  2
 122 ms | ████  2
 123 ms | ██  1
 124 ms | ██  1
 125 ms | ██  1
 129 ms | ██  1
 130 ms | ██  1
 132 ms | ██  1
 133 ms | ██  1
 136 ms | ██  1
 137 ms | ██  1
 138 ms | ██  1
 139 ms | ██  1
 141 ms | ██  1
 146 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `9.86`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `6.95`
- `seed` = `1923.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23606 ms  |  Sample ticks: 400

**FPS**  avg `10.96`, min `0.95`, p50 `9.83`, p95 `19.78`, p99 `26.03`, 1%low `1.59`, 0.1%low `n/a`, std `4.87`

**Frame time (ms)**  avg `108.30`, p50 `101.72`, p95 `164.41`, p99 `184.22`, p99.9 `894.90`, max `1054.48`

**Client tick (ms)**  avg `14.77`, p95 `35.51`, max `68.41`

**Memory**  start `7010 MB`, end `7330 MB`, peak `7784 MB`, GC `85 events / 2843 ms`

**FPS over sampling window (ASCII):**

```
 24.9 |                              █                                                 
 23.2 |                              █                                                 
 21.5 |                              █                                                 
 19.8 |                              █                                                 
 18.1 |                              █           █                 █      █            
 16.4 |   █                          █           ██                █      █     █      
 14.7 |   █       █       █        █ █           ██     █     █    █      █     █      
 13.0 | █ █   █ █ █     █ █        █ █     █     ██ █   █     █    █      ██    █      
 11.3 | █ █  ██ █ ██  █ █ █   █   ██ █     ██  ████ █   ███   █ ██ █ █ █  ██ ██ █ ██   
  9.6 |██ ███████ █████ █ ██ ███ ████████ ████ ██████ ██████ █████ ██████ ███████ ███  
  7.9 |██ ████████████████████████████████████████████████████████ ████████████████████
  6.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  23 ms | ██████  1
  35 ms | ██████  1
  38 ms | ██████  1
  39 ms | ██████  1
  40 ms | ██████  1
  41 ms | ██████  1
  42 ms | ██████  1
  44 ms | ██████  1
  47 ms | ██████  1
  49 ms | ██████  1
  51 ms | ██████  1
  53 ms | ██████  1
  54 ms | █████████████████  3
  55 ms | ███████████  2
  56 ms | ███████████  2
  58 ms | ███████████  2
  60 ms | █████████████████  3
  62 ms | ██████  1
  63 ms | ██████  1
  66 ms | ██████  1
  67 ms | ██████  1
  69 ms | ██████  1
  71 ms | ███████████  2
  72 ms | ███████████  2
  73 ms | ██████  1
  74 ms | ██████  1
  77 ms | ██████  1
  78 ms | ██████  1
  79 ms | ██████  1
  80 ms | ██████  1
  81 ms | ███████████  2
  82 ms | ███████████████████████  4
  83 ms | █████████████████  3
  84 ms | █████████████████  3
  85 ms | ██████  1
  86 ms | █████████████████  3
  87 ms | ███████████  2
  88 ms | █████████████████  3
  89 ms | ██████  1
  90 ms | ██████  1
  91 ms | ██████  1
  92 ms | ███████████  2
  93 ms | ███████████████████████  4
  94 ms | ████████████████████████████████████████  7
  95 ms | ████████████████████████████████████████  7
  96 ms | ███████████  2
  97 ms | █████████████████  3
  98 ms | ██████  1
  99 ms | █████████████████  3
 100 ms | ██████  1
 101 ms | █████████████████  3
 102 ms | ███████████████████████  4
 103 ms | ███████████  2
 104 ms | █████████████████████████████  5
 105 ms | ██████  1
 106 ms | ██████  1
 107 ms | ███████████████████████  4
 108 ms | ██████████████████████████████████  6
 110 ms | ███████████  2
 111 ms | ███████████  2
 112 ms | ███████████████████████  4
 114 ms | ██████  1
 115 ms | ██████  1
 116 ms | ██████  1
 117 ms | ██████  1
 118 ms | █████████████████  3
 119 ms | ██████  1
 122 ms | ███████████  2
 125 ms | ███████████████████████  4
 126 ms | █████████████████████████████  5
 127 ms | ██████  1
 128 ms | ███████████  2
 129 ms | ██████  1
 130 ms | ███████████  2
 132 ms | ███████████  2
 133 ms | ██████  1
 134 ms | █████████████████  3
 135 ms | ██████  1
 136 ms | ██████  1
 137 ms | ███████████  2
 138 ms | ██████  1
 139 ms | ███████████  2
 141 ms | ██████  1
 142 ms | ██████  1
 143 ms | ███████████  2
 144 ms | ██████  1
 150 ms | ██████  1
 151 ms | ██████  1
 152 ms | ██████  1
 153 ms | ██████  1
 156 ms | ██████  1
 157 ms | ██████  1
 158 ms | ██████  1
 160 ms | ██████  1
 163 ms | ██████  1
 165 ms | ██████  1
 168 ms | ██████  1
 171 ms | ██████  1
 174 ms | ██████  1
 175 ms | ██████  1
 179 ms | ██████  1
 180 ms | ██████  1
 181 ms | ██████  1
 205 ms | ██████  1
1054 ms | ██████  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `255360.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.23`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `0.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `1.59`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23511 ms  |  Sample ticks: 400

**FPS**  avg `10.11`, min `1.06`, p50 `9.91`, p95 `12.56`, p99 `15.98`, 1%low `1.81`, 0.1%low `n/a`, std `2.24`

**Frame time (ms)**  avg `105.61`, p50 `100.96`, p95 `128.36`, p99 `150.01`, p99.9 `792.02`, max `940.83`

**Client tick (ms)**  avg `0.86`, p95 `3.50`, max `26.55`

**Memory**  start `5809 MB`, end `6790 MB`, peak `7784 MB`, GC `89 events / 2801 ms`

**FPS over sampling window (ASCII):**

```
 12.9 |                                █                                   █           
 12.3 |                          █     █                                   █           
 11.6 |                          █     █   █   █                █          █           
 10.9 |    █       █      █      █   █ █   █   █         █      █          █          █
 10.3 |██  ████ █ ███████ █ █ █  ██  █ █ █ █ █ ██████ █  ███    ██     █ █ ████  █ █  █
  9.6 |███ ████████████████ ███ ████ █ ███ ███ ███████████████████████████ █████ ██████
  8.9 |███████████████████████████████ ███ ███ ███████████████████████████ █████ ██████
  8.2 |█████████████████████████████████████████████████████████████████████████ ██████
  7.6 |█████████████████████████████████████████████████████████████████████████ ██████
  6.9 |█████████████████████████████████████████████████████████████████████████ ██████
  6.2 |█████████████████████████████████████████████████████████████████████████ ██████
  5.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  31 ms | ███  1
  60 ms | ███  1
  62 ms | ███  1
  66 ms | ███  1
  68 ms | ███  1
  71 ms | ███  1
  73 ms | ███  1
  76 ms | ███  1
  78 ms | ███  1
  79 ms | ██████  2
  80 ms | █████████  3
  81 ms | ██████  2
  82 ms | ███  1
  83 ms | ████████████  4
  84 ms | ██████  2
  85 ms | ████████████  4
  86 ms | ██████  2
  87 ms | ██████  2
  88 ms | ███  1
  89 ms | █████████  3
  90 ms | ██████████████████  6
  91 ms | █████████  3
  92 ms | ██████  2
  93 ms | █████████  3
  94 ms | █████████  3
  95 ms | ███████████████  5
  96 ms | ██████████████████████  7
  97 ms | ██████  2
  98 ms | ████████████████████████████  9
  99 ms | █████████████████████████████████████  12
 100 ms | ██████████████████████████████████  11
 101 ms | ████████████████████████████████████████  13
 102 ms | ███████████████  5
 103 ms | ████████████████████████████  9
 104 ms | ██████  2
 105 ms | ████████████  4
 106 ms | ██████████████████  6
 107 ms | █████████████████████████  8
 108 ms | ███  1
 109 ms | ██████  2
 110 ms | █████████  3
 111 ms | ████████████  4
 112 ms | █████████  3
 113 ms | ██████████████████  6
 114 ms | █████████  3
 115 ms | ███  1
 116 ms | ██████  2
 117 ms | ███  1
 118 ms | ███  1
 119 ms | ██████  2
 120 ms | ██████  2
 121 ms | ███  1
 123 ms | ██████  2
 124 ms | ███  1
 125 ms | ███  1
 126 ms | ███  1
 127 ms | ███  1
 129 ms | ██████  2
 131 ms | ██████  2
 136 ms | ██████  2
 142 ms | ███  1
 148 ms | ███  1
 165 ms | ███  1
 940 ms | ███  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `1.81`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3390.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.47`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `9043.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 24066 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `0.97`, p50 `9.86`, p95 `13.07`, p99 `16.86`, 1%low `1.03`, 0.1%low `n/a`, std `2.09`

**Frame time (ms)**  avg `111.44`, p50 `101.37`, p95 `134.75`, p99 `270.26`, p99.9 `1008.56`, max `1031.31`

**Client tick (ms)**  avg `0.87`, p95 `3.69`, max `15.80`

**Memory**  start `6798 MB`, end `6685 MB`, peak `7713 MB`, GC `109 events / 3677 ms`

**FPS over sampling window (ASCII):**

```
 13.4 |                                                                           █    
 12.7 |                        █                                         █        █    
 12.0 |                        █                  █                      █        █    
 11.3 |        █     █   █     █    █             █    █                 █        █    
 10.6 | ██   █ █     █   █     █ █  █ █ █ █   █   █    █ █ █      █ ██   ████   █ █ █  
 10.0 | ████ █████ █ ███ ███████ ████ █ █ █  ███  ████ █ █ ██  █ ██ ███████████ █ █ █  
  9.3 |█████████████ █████████████████████████████████████ ███ ████████████████ █ █████
  8.6 |█████████████ █████████████████████████████████████ ████████████████████████████
  7.9 |███████████████████████████████████████████████████ ████████████████████████████
  7.3 |███████████████████████████████████████████████████ ████████████████████████████
  6.6 |███████████████████████████████████████████████████ ████████████████████████████
  5.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  52 ms | ████  1
  54 ms | ████  1
  60 ms | ████  1
  61 ms | ████  1
  63 ms | ████  1
  64 ms | ████  1
  67 ms | ████  1
  68 ms | ████  1
  72 ms | ████  1
  75 ms | ████  1
  78 ms | ████  1
  79 ms | ███████  2
  80 ms | ████  1
  81 ms | ███████████████  4
  83 ms | ███████  2
  84 ms | ███████  2
  85 ms | ███████████████  4
  87 ms | ██████████████████████  6
  88 ms | ████  1
  89 ms | ███████████  3
  90 ms | ████  1
  91 ms | ███████  2
  92 ms | ██████████████████████  6
  94 ms | ████  1
  95 ms | ███████████████  4
  96 ms | ███████  2
  97 ms | █████████████████████████████████  9
  98 ms | ████████████████████████████████████████  11
  99 ms | █████████████████████████████  8
 100 ms | ████████████████████████████████████  10
 101 ms | ████████████████████████████████████  10
 102 ms | █████████████████████████  7
 103 ms | █████████████████████████████  8
 104 ms | ██████████████████████  6
 105 ms | ██████████████████  5
 106 ms | ███████████  3
 107 ms | ███████████  3
 108 ms | ███████████  3
 109 ms | ███████████████  4
 110 ms | ██████████████████  5
 111 ms | ███████████████  4
 112 ms | ████  1
 113 ms | ██████████████████  5
 114 ms | ███████████████  4
 115 ms | ███████████  3
 116 ms | ███████  2
 117 ms | ███████  2
 118 ms | ███████████  3
 119 ms | ███████  2
 123 ms | ████  1
 125 ms | ████  1
 127 ms | ████  1
 128 ms | ████  1
 129 ms | ████  1
 130 ms | ████  1
 131 ms | ████  1
 133 ms | ████  1
 135 ms | ████  1
 143 ms | ████  1
 144 ms | ████  1
 147 ms | ███████  2
 148 ms | ████  1
 165 ms | ████  1
 174 ms | ████  1
 909 ms | ████  1
1031 ms | ████  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `8.97`
- `neighbour_updates` = `0.00`
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
- `fps_1pct_low` = `1.03`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 24056 ms  |  Sample ticks: 400

**FPS**  avg `9.99`, min `0.93`, p50 `9.87`, p95 `12.27`, p99 `15.47`, 1%low `0.96`, 0.1%low `n/a`, std `1.97`

**Frame time (ms)**  avg `111.45`, p50 `101.34`, p95 `127.08`, p99 `269.66`, p99.9 `1061.48`, max `1074.35`

**Client tick (ms)**  avg `0.94`, p95 `4.16`, max `20.14`

**Memory**  start `6707 MB`, end `6596 MB`, peak `7725 MB`, GC `107 events / 3930 ms`

**FPS over sampling window (ASCII):**

```
 15.1 |     █                                                                          
 14.1 |     █                                                                          
 13.2 |     █                                                                          
 12.3 |     █                                  █                                       
 11.4 |     █       █                    █     █     ██       █         █        █     
 10.5 | ██ ██ █ █   █ █ █  ███   ███     █     ██    ██    █  █ ██ █ ██ ██ ███   ██████
  9.6 |████████████ ████████████ █████████████████████████ ████ ███████ ████████ ██████
  8.7 |███████████████████████████████████████████████████ ████████████████████████████
  7.7 |███████████████████████████████████████████████████ ████████████████████████████
  6.8 |███████████████████████████████████████████████████ ████████████████████████████
  5.9 |███████████████████████████████████████████████████ ████████████████████████████
  5.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  41 ms | ███  1
  56 ms | ███  1
  66 ms | ███  1
  72 ms | ███  1
  73 ms | ███  1
  77 ms | ███  1
  79 ms | █████  2
  81 ms | ███████████  4
  82 ms | ████████  3
  84 ms | ████████  3
  85 ms | █████████████  5
  86 ms | ███████████  4
  87 ms | ███  1
  88 ms | ███████████  4
  89 ms | ████████████████  6
  90 ms | ████████  3
  91 ms | ███  1
  92 ms | █████████████  5
  93 ms | █████  2
  94 ms | █████████████  5
  95 ms | ███  1
  96 ms | ███████████  4
  97 ms | █████████████  5
  98 ms | ████████████████  6
  99 ms | ███████████████████████████  10
 100 ms | ███████████████████████████████████  13
 101 ms | ███████████  4
 102 ms | ████████████████████████████████████████  15
 103 ms | █████████████████████  8
 104 ms | ████████████████  6
 105 ms | █████████████  5
 106 ms | █████  2
 107 ms | ████████  3
 108 ms | ████████  3
 109 ms | ████████  3
 110 ms | ███████████  4
 111 ms | ████████████████  6
 112 ms | ███████████  4
 113 ms | ███████████  4
 114 ms | ███  1
 115 ms | █████  2
 116 ms | ███  1
 117 ms | █████  2
 119 ms | ████████  3
 120 ms | ███  1
 121 ms | █████  2
 122 ms | ███  1
 123 ms | ███████████  4
 125 ms | ███  1
 127 ms | ███  1
 128 ms | ███  1
 129 ms | ███  1
 133 ms | ███  1
 136 ms | ███  1
 141 ms | ███  1
 151 ms | ███  1
 159 ms | ███  1
1005 ms | ███  1
1074 ms | ███  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `8.97`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `77.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `0.96`
- `restocks` = `20.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 25114 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `0.95`, p50 `9.82`, p95 `13.53`, p99 `17.93`, 1%low `0.97`, 0.1%low `n/a`, std `2.16`

**Frame time (ms)**  avg `111.53`, p50 `101.86`, p95 `133.69`, p99 `248.52`, p99.9 `1048.92`, max `1057.21`

**Client tick (ms)**  avg `1.00`, p95 `3.64`, max `25.60`

**Memory**  start `6615 MB`, end `6376 MB`, peak `7673 MB`, GC `125 events / 4924 ms`

**FPS over sampling window (ASCII):**

```
 13.8 |                   █         █                                                  
 13.1 |                   █         █                                                  
 12.5 |      █            █         █ █                                                
 11.9 |      █            █         █ █                                               █
 11.3 |      █     █      █   █     █ █                 █       █                 █   █
 10.7 |      ██    █      █   █     █ █ █ █ █     █     █ █     █     █    █   █  █   █
 10.1 |   ██ ███ █ ██     ███ ████  █ █ █ █ ███ █ █   █ █ ████  ███ █ ████ ██  █  ██  █
  9.5 |██ ██ █████ ██████ ███ █████ █ █ ███ ███████ ███ █ ████████████████ ██ ██  ███ █
  8.9 |██████████████████████ █████ █ █████████████ ███████████████████████████████████
  8.3 |████████████████████████████████████████████ ███████████████████████████████████
  7.7 |████████████████████████████████████████████ ███████████████████████████████████
  7.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  54 ms | ███  1
  55 ms | ███████  2
  56 ms | ███  1
  57 ms | ███  1
  58 ms | ███  1
  66 ms | ███  1
  70 ms | ███  1
  71 ms | ███  1
  73 ms | ███  1
  75 ms | ███  1
  76 ms | ██████████  3
  77 ms | ███  1
  78 ms | ███████  2
  80 ms | ███  1
  81 ms | ███  1
  82 ms | █████████████  4
  84 ms | ███  1
  85 ms | ███  1
  86 ms | ███  1
  87 ms | ███  1
  88 ms | ███  1
  89 ms | ███  1
  90 ms | █████████████  4
  91 ms | █████████████  4
  92 ms | █████████████  4
  93 ms | ███████  2
  94 ms | ███████  2
  95 ms | █████████████  4
  96 ms | ██████████  3
  97 ms | ███████████████████████  7
  98 ms | █████████████████████████████████  10
  99 ms | ████████████████████████████████████████  12
 100 ms | ██████████████████████████████  9
 101 ms | ███████████████████████  7
 102 ms | █████████████████  5
 103 ms | ███████████████████████████  8
 104 ms | ██████████  3
 105 ms | █████████████████  5
 106 ms | █████████████████████████████████  10
 107 ms | ███████████████████████  7
 108 ms | ██████████  3
 109 ms | ███████  2
 110 ms | █████████████  4
 111 ms | █████████████████  5
 112 ms | ███████  2
 113 ms | ██████████  3
 114 ms | ████████████████████  6
 115 ms | ███████  2
 116 ms | ██████████  3
 118 ms | ██████████  3
 119 ms | ███  1
 120 ms | ███  1
 121 ms | ███  1
 123 ms | ███  1
 126 ms | ███████  2
 127 ms | ██████████  3
 130 ms | ███  1
 132 ms | ███  1
 134 ms | ███████  2
 135 ms | ███████  2
 136 ms | ███████  2
 140 ms | ███  1
 144 ms | ███  1
1013 ms | ███  1
1057 ms | ███  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `0.97`
- `scheduled_block_ticks` = `1088.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `8.97`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `8053.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 224480 ms  |  Sample ticks: 3600

**FPS**  avg `10.43`, min `0.38`, p50 `9.87`, p95 `16.24`, p99 `25.83`, 1%low `0.81`, 0.1%low `0.51`, std `4.93`

**Frame time (ms)**  avg `128.36`, p50 `101.32`, p95 `152.69`, p99 `1103.10`, p99.9 `1206.95`, max `2633.64`

**Client tick (ms)**  avg `2.60`, p95 `5.60`, max `1055.84`

**Memory**  start `6559 MB`, end `7386 MB`, peak `7766 MB`, GC `1171 events / 58734 ms`

**FPS over sampling window (ASCII):**

```
 14.6 |                                                         █                      
 14.1 |                                                         █                      
 13.7 |                                                         █                      
 13.2 |                                                         █                      
 12.7 |                                                         █                      
 12.3 |                             █                           █    █         █       
 11.8 |                             █                           █    █         █       
 11.4 | █      █                    █  █            █           █    █   █     █     █ 
 10.9 | █      █     █ █    █ █ █   ██ █        █   ██ █        █    █   █     █     █ 
 10.4 | ██  █  ██  █ █ █ ████ ███ ████ █        █ █████████ ███ ██   ██ ██   █ █     ██
 10.0 | ████████████ █ ███████████████ ████████████████████████████████ ███████████████
  9.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | █  1
  14 ms | █  1
  16 ms | █  1
  19 ms | █  1
  23 ms | █  1
  24 ms | █  1
  30 ms | █  1
  31 ms | ██  3
  32 ms | ██  2
  33 ms | █  1
  35 ms | █  1
  36 ms | ██  2
  38 ms | ██  2
  39 ms | ██  3
  42 ms | █  1
  43 ms | ██  2
  47 ms | ██  2
  48 ms | █  1
  49 ms | ██  2
  50 ms | ██  2
  51 ms | █████  6
  52 ms | █████  6
  53 ms | ██  3
  54 ms | ██  2
  55 ms | ███  4
  56 ms | ███  4
  57 ms | ███  4
  58 ms | █  1
  59 ms | ██████  8
  60 ms | ██████  8
  61 ms | █████████  12
  62 ms | ██  3
  63 ms | █████  7
  64 ms | █████  7
  65 ms | ██████  8
  66 ms | █████  7
  67 ms | ██████  8
  68 ms | ███  4
  69 ms | █████  6
  70 ms | ██████  8
  71 ms | █████  6
  72 ms | ██████  8
  73 ms | █████  6
  74 ms | ███  4
  75 ms | █████████  12
  76 ms | ████████  10
  77 ms | █████████  12
  78 ms | █████████  12
  79 ms | █████████████████  22
  80 ms | █████████  12
  81 ms | ███████████  14
  82 ms | █████████████████  22
  83 ms | █████████████████  22
  84 ms | ████████████  15
  85 ms | ███████████████  20
  86 ms | ████████████  16
  87 ms | ███████████████████  25
  88 ms | ███████████████████  25
  89 ms | ████████████████  21
  90 ms | ███████████████  20
  91 ms | ███████████████  20
  92 ms | ██████████████████  23
  93 ms | █████████████████████  27
  94 ms | ████████████████████████  31
  95 ms | ████████████████████████  31
  96 ms | ████████████████████████  31
  97 ms | █████████████████████████████████  43
  98 ms | ████████████████████████████  36
  99 ms | ██████████████████████████████████  44
 100 ms | ████████████████████████████████████████  52
 101 ms | ██████████████████████████████  39
 102 ms | █████████████████████████  32
 103 ms | ██████████████████████  29
 104 ms | ████████████████████████████████  41
 105 ms | ████████████████████  26
 106 ms | ████████████████████████████  36
 107 ms | █████████████████████  27
 108 ms | ██████████████████████  29
 109 ms | ██████████████  18
 110 ms | ███████████████████████  30
 111 ms | ██████████████████████  28
 112 ms | ██████████████████████  29
 113 ms | ██████████████████████  29
 114 ms | ████████████  15
 115 ms | ██████████████  18
 116 ms | █████████████████  22
 117 ms | █████████████  17
 118 ms | ████████████  16
 119 ms | ████████  11
 120 ms | ███████████████  19
 121 ms | ████████████  15
 122 ms | ███████  9
 123 ms | ███████  9
 124 ms | ████████  11
 125 ms | ████████████  15
 126 ms | ██████████████  18
 127 ms | ██████  8
 128 ms | █████████  12
 129 ms | █████████  12
 130 ms | █████  7
 131 ms | ████  5
 132 ms | ████████████  15
 133 ms | ████████████  15
 134 ms | █████  7
 135 ms | █████  7
 136 ms | ████████  11
 137 ms | █████  6
 138 ms | ██  3
 139 ms | █████  6
 140 ms | ████  5
 141 ms | ██  2
 142 ms | █████  6
 143 ms | █  1
 144 ms | ██  2
 145 ms | ██  3
 146 ms | ██  2
 147 ms | █  1
 148 ms | ██  3
 149 ms | █  1
 150 ms | █  1
 151 ms | ██  2
 152 ms | ██  3
 153 ms | █  1
 154 ms | █  1
 155 ms | ██  3
 156 ms | █  1
 157 ms | ██  2
 158 ms | ███  4
 159 ms | ███  4
 160 ms | █  1
 161 ms | ██  2
 163 ms | █  1
 166 ms | ██  2
 171 ms | █  1
 172 ms | █  1
 173 ms | █  1
 181 ms | █  1
 183 ms | █  1
 186 ms | █  1
 188 ms | █  1
 194 ms | █  1
 199 ms | █  1
 208 ms | █  1
 216 ms | █  1
 217 ms | █  1
 221 ms | █  1
 239 ms | █  1
1015 ms | █  1
1026 ms | █  1
1029 ms | █  1
1033 ms | █  1
1050 ms | █  1
1064 ms | █  1
1067 ms | █  1
1069 ms | █  1
1070 ms | █  1
1073 ms | █  1
1074 ms | ██  2
1075 ms | █  1
1077 ms | █  1
1079 ms | ██  2
1085 ms | █  1
1089 ms | █  1
1090 ms | █  1
1092 ms | ██  2
1096 ms | ██  2
1097 ms | █  1
1099 ms | █  1
1103 ms | █  1
1104 ms | ██  2
1108 ms | █  1
1116 ms | █  1
1123 ms | █  1
1126 ms | ██  2
1128 ms | █  1
1135 ms | █  1
1138 ms | █  1
1152 ms | █  1
1161 ms | █  1
1165 ms | █  1
1173 ms | █  1
1256 ms | █  1
2633 ms | █  1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
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
- `fps_0p1pct_low` = `0.51`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `7.79`
- `fps_1pct_low` = `0.81`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `87.00`
- `terrain_area_blocks` = `43473.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 230057 ms  |  Sample ticks: 3600

**FPS**  avg `10.78`, min `0.78`, p50 `9.84`, p95 `16.98`, p99 `39.08`, 1%low `0.85`, 0.1%low `0.79`, std `7.44`

**Frame time (ms)**  avg `133.24`, p50 `101.64`, p95 `162.90`, p99 `1118.92`, p99.9 `1239.16`, max `1276.37`

**Client tick (ms)**  avg `2.61`, p95 `4.93`, max `1061.67`

**Memory**  start `7147 MB`, end `7424 MB`, peak `7768 MB`, GC `1180 events / 68573 ms`

**FPS over sampling window (ASCII):**

```
 16.5 |                                                                        █       
 15.8 |                                                                        █       
 15.2 |              █                                                         █       
 14.5 |              █                                                         █       
 13.8 |              █                        █                        █       █       
 13.2 |   █          █                        █                    █   ██      █       
 12.5 |   █          █                 █      █             ██    ██   ██      █       
 11.8 |   █          █            █    █      █          █  ██    ██   ██      █       
 11.2 |   █       █  █    ███   █ █  █ █    █ █   █      █  ██  █ ██   ██    █ █    █ █
 10.5 | ███   █ █ █ ██ ██████████ ██████ ██ █ █  ██ █ ██ █ ████ ██████ ███   ███    ███
  9.9 |█████ ███████████████████████████████████ ██████████████ ██████████  ███████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
   9 ms | █  1
  11 ms | █  1
  12 ms | █  1
  13 ms | █  1
  14 ms | █  1
  16 ms | ███  3
  17 ms | █  1
  18 ms | █  1
  20 ms | █  1
  22 ms | █  1
  23 ms | █  1
  24 ms | █  1
  25 ms | ██  2
  26 ms | ██  2
  27 ms | █  1
  28 ms | █  1
  29 ms | █  1
  30 ms | ██  2
  32 ms | ██  2
  33 ms | ██  2
  37 ms | ███  4
  39 ms | █  1
  41 ms | █  1
  42 ms | █  1
  43 ms | █  1
  44 ms | ██  2
  45 ms | █  1
  46 ms | █  1
  47 ms | ███  3
  48 ms | ██  2
  50 ms | ████  5
  51 ms | █  1
  52 ms | ████  5
  53 ms | ██  2
  54 ms | ███  4
  55 ms | ██████  7
  56 ms | ███  3
  57 ms | ██  2
  58 ms | ██████  7
  59 ms | ███  4
  60 ms | ███  4
  61 ms | ███  3
  62 ms | ████████  10
  63 ms | ██████  7
  64 ms | ████  5
  65 ms | ███  3
  66 ms | ███  3
  67 ms | ███  4
  68 ms | ███  4
  69 ms | █████  6
  70 ms | ███  4
  71 ms | ███  4
  72 ms | █████  6
  73 ms | ████  5
  74 ms | ██████████  12
  75 ms | ████████  9
  76 ms | ███████  8
  77 ms | ███████  8
  78 ms | █████████  11
  79 ms | █████████████  16
  80 ms | ███████████████  18
  81 ms | ███████████████  18
  82 ms | ██████████████  17
  83 ms | ████████████  14
  84 ms | ██████████████  17
  85 ms | ███████████████  18
  86 ms | ████████████████  19
  87 ms | ███████████████████  23
  88 ms | ██████████████  17
  89 ms | ████████████████  19
  90 ms | █████████████████████████████████  40
  91 ms | █████████████████████████  30
  92 ms | █████████████████████  25
  93 ms | ███████████████████  23
  94 ms | ██████████████████  22
  95 ms | ██████████████████████████  31
  96 ms | ████████████████████████████████████████  48
  97 ms | ███████████████████████████  32
  98 ms | ██████████████████████  26
  99 ms | ████████████████████████████████████  43
 100 ms | █████████████████████████████  35
 101 ms | ██████████████████████████████████  41
 102 ms | ███████████████████████  27
 103 ms | ████████████████████████████████████  43
 104 ms | █████████████████████████  30
 105 ms | ████████████████████████████  33
 106 ms | ██████████████████████████  31
 107 ms | ████████████████████████████  33
 108 ms | ███████████████████████████████  37
 109 ms | █████████████████████████████  35
 110 ms | ████████████████  19
 111 ms | █████████████  16
 112 ms | ███████████████████████  28
 113 ms | ███████████████████████  27
 114 ms | █████████████████████  25
 115 ms | █████████████  15
 116 ms | ██████████████████  21
 117 ms | █████████████  15
 118 ms | █████████████████  20
 119 ms | ██████████████  17
 120 ms | ██████████  12
 121 ms | ██████████  12
 122 ms | ███████  8
 123 ms | ████████  9
 124 ms | ███████████  13
 125 ms | ██████████  12
 126 ms | ████████  10
 127 ms | ████████  10
 128 ms | █████████  11
 129 ms | ██████████  12
 130 ms | ███████  8
 131 ms | ████  5
 132 ms | ████  5
 133 ms | ██████████  12
 134 ms | ███  3
 135 ms | ███████  8
 136 ms | ██████  7
 137 ms | █████  6
 138 ms | ███  3
 139 ms | ███  4
 140 ms | ███  3
 141 ms | █████  6
 142 ms | ███  4
 143 ms | ███  4
 144 ms | ███  3
 145 ms | ███  4
 146 ms | ██  2
 147 ms | ██  2
 148 ms | █  1
 149 ms | ███  3
 150 ms | ██  2
 151 ms | █  1
 153 ms | ████  5
 154 ms | █  1
 155 ms | █  1
 156 ms | █  1
 157 ms | █  1
 158 ms | █  1
 159 ms | █  1
 161 ms | █  1
 162 ms | ██  2
 164 ms | █  1
 170 ms | █  1
 172 ms | █  1
 175 ms | █  1
 177 ms | █  1
 179 ms | █  1
 181 ms | █  1
 188 ms | █  1
 192 ms | █  1
 194 ms | █  1
 200 ms | ██  2
 201 ms | █  1
 207 ms | █  1
 212 ms | █  1
 213 ms | █  1
 221 ms | █  1
 226 ms | █  1
 230 ms | █  1
 235 ms | █  1
 239 ms | █  1
 242 ms | █  1
 244 ms | █  1
 245 ms | █  1
 248 ms | █  1
 261 ms | █  1
 282 ms | █  1
 296 ms | █  1
 313 ms | █  1
1006 ms | █  1
1016 ms | █  1
1047 ms | █  1
1050 ms | █  1
1053 ms | █  1
1055 ms | █  1
1056 ms | █  1
1057 ms | █  1
1058 ms | █  1
1060 ms | █  1
1064 ms | █  1
1067 ms | █  1
1069 ms | █  1
1071 ms | █  1
1073 ms | █  1
1074 ms | █  1
1075 ms | █  1
1082 ms | █  1
1086 ms | █  1
1087 ms | █  1
1090 ms | █  1
1096 ms | ██  2
1098 ms | █  1
1099 ms | █  1
1107 ms | ██  2
1111 ms | █  1
1112 ms | █  1
1114 ms | ██  2
1118 ms | ██  2
1119 ms | █  1
1121 ms | █  1
1122 ms | █  1
1133 ms | █  1
1134 ms | █  1
1152 ms | █  1
1154 ms | █  1
1155 ms | █  1
1165 ms | █  1
1169 ms | ██  2
1179 ms | █  1
1215 ms | █  1
1225 ms | █  1
1256 ms | █  1
1276 ms | █  1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
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
- `fps_0p1pct_low` = `0.79`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `7.51`
- `fps_1pct_low` = `0.85`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 210813 ms  |  Sample ticks: 3600

**FPS**  avg `10.24`, min `0.86`, p50 `9.99`, p95 `13.40`, p99 `16.78`, 1%low `3.19`, 0.1%low `0.89`, std `2.00`

**Frame time (ms)**  avg `102.08`, p50 `100.12`, p95 `126.70`, p99 `146.23`, p99.9 `1054.30`, max `1165.11`

**Client tick (ms)**  avg `1.27`, p95 `3.35`, max `30.46`

**Memory**  start `7017 MB`, end `7047 MB`, peak `7675 MB`, GC `341 events / 6376 ms`

**FPS over sampling window (ASCII):**

```
 11.4 |                                      █                                         
 11.2 |                                      █                                         
 11.1 |                                      █                   █                     
 10.9 |                                      █                   █                     
 10.8 |                                      █                   █          █          
 10.6 |                                      █           █       █          █         █
 10.5 |█                                   █ █  █ █    █ █ █     █      █   █ █       █
 10.3 |█  ██  ██  █ ██        █ █      █   █ ██ ███ █  █ █ █████ ██ █   █   █ █    █  █
 10.2 |█████████ ██████ █ █ █ ████  █ ██████ █████████ ███ █████ █████████  █ ██ █ ████
 10.0 |████████████████████████████████████████████████████████████████████ ███████████
  9.9 |████████████████████████████████████████████████████████████████████ ███████████
  9.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  27 ms |   1
  36 ms |   1
  41 ms |   1
  46 ms |   1
  49 ms |   1
  52 ms |   1
  53 ms | █  3
  54 ms |   1
  55 ms | █  2
  56 ms |   1
  57 ms | ██  4
  58 ms |   1
  59 ms |   1
  60 ms | ██  5
  61 ms | ██  4
  62 ms | █  2
  63 ms | █  2
  64 ms |   1
  65 ms | ██  4
  66 ms | ███  6
  67 ms | ███  6
  68 ms | ██  5
  69 ms | █  2
  70 ms | ██  4
  71 ms | ██  4
  72 ms | ██  5
  73 ms | ███████  15
  74 ms | ████████  16
  75 ms | ███████  14
  76 ms | ███████  15
  77 ms | █████████  19
  78 ms | ███████  14
  79 ms | ███████  14
  80 ms | ███████  15
  81 ms | ██████████  20
  82 ms | █████████  18
  83 ms | ████████████  25
  84 ms | ████████████████  33
  85 ms | ███████████  23
  86 ms | ██████████████  29
  87 ms | ████████████  25
  88 ms | ████████  16
  89 ms | █████████████  28
  90 ms | ███████████████  32
  91 ms | █████████████  28
  92 ms | █████████████████  35
  93 ms | ██████████████  29
  94 ms | ███████████████  32
  95 ms | █████████████████████  43
  96 ms | ███████████████████████████  56
  97 ms | ███████████████████████████  56
  98 ms | ███████████████████████████████████  72
  99 ms | ███████████████████████████████████████  81
 100 ms | ████████████████████████████████████████  83
 101 ms | ███████████████████████████████████  72
 102 ms | ████████████████████████████  58
 103 ms | █████████████████████████████████  68
 104 ms | █████████████████████  44
 105 ms | ██████████████████  37
 106 ms | ██████████████  29
 107 ms | ███████████████  31
 108 ms | ████████████████  34
 109 ms | █████████████  28
 110 ms | █████████  19
 111 ms | ███████████  22
 112 ms | █████████████  28
 113 ms | █████████████  28
 114 ms | ██████████  21
 115 ms | ██████████  21
 116 ms | ████████████  24
 117 ms | ███████████  23
 118 ms | ██████████  20
 119 ms | ████████████  24
 120 ms | ████████  16
 121 ms | ███████  15
 122 ms | █████████  18
 123 ms | █████████  18
 124 ms | ██████  13
 125 ms | █████  10
 126 ms | █████████  19
 127 ms | ████  8
 128 ms | ███  7
 129 ms | ██  5
 130 ms | ██  4
 131 ms | ████  9
 132 ms | █  3
 133 ms | ██  5
 135 ms | ██  5
 136 ms | █  2
 137 ms | █  3
 138 ms |   1
 139 ms | █  3
 140 ms | █  3
 141 ms | █  2
 142 ms |   1
 143 ms | █  3
 144 ms | █  2
 145 ms |   1
 146 ms | █  2
 148 ms |   1
 149 ms |   1
 150 ms |   1
 151 ms |   1
 152 ms |   1
 154 ms | █  2
 155 ms |   1
 156 ms | █  2
 164 ms |   1
 165 ms |   1
 168 ms |   1
 169 ms |   1
1047 ms |   1
1079 ms |   1
1165 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `HighEnd Shader`
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
- `fps_0p1pct_low` = `0.89`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.80`
- `fps_1pct_low` = `3.19`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 198873 ms  |  Sample ticks: 3600

**FPS**  avg `10.22`, min `6.31`, p50 `9.99`, p95 `13.47`, p99 `15.90`, 1%low `6.89`, 0.1%low `6.39`, std `1.72`

**Frame time (ms)**  avg `100.33`, p50 `100.09`, p95 `127.90`, p99 `139.45`, p99.9 `154.03`, max `158.59`

**Client tick (ms)**  avg `1.16`, p95 `2.94`, max `18.14`

**Memory**  start `7329 MB`, end `7343 MB`, peak `7398 MB`, GC `215 events / 1807 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |                                      █                █            █           
 10.5 |                              █       █                █            █         █ 
 10.4 |            █          █      █       █                █            █         █ 
 10.4 |            █          █      █       █                █            █      █  █ 
 10.3 |       ██   █  █       █     ████     █      █   █     █ ██         █      █  █ 
 10.3 |   █   ██ █ █  █    █  █     ████     █ ██ ███ █ █  █  █ ███   █ █  ████  ██  █ 
 10.2 |   █   ██ ████ █ ██ █  ███   ████ ██ █████ ████████ ██ █ █████ █ ███████  ███ ██
 10.2 |  ███ ███ █████████ █ ████   █████████████ ███████████ █ █████ █ ███████  ██████
 10.1 |█ ███ ███ █████████ █ █████  █████████████████████████████████ █ ███████████████
 10.0 |█████████ ██████████████████ ███████████████████████████████████████████████████
 10.0 |█████████ ██████████████████████████████████████████████████████████████████████
  9.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  53 ms | █  2
  54 ms | █  2
  56 ms | █  2
  57 ms | █  2
  58 ms | ██  4
  59 ms |   1
  61 ms |   1
  62 ms | ███  7
  63 ms | █  3
  64 ms | ██  5
  65 ms | █  2
  66 ms | ██  5
  67 ms | ███  7
  68 ms | ███  8
  69 ms | ███  7
  70 ms | ███  7
  71 ms | █  2
  72 ms | █████  12
  73 ms | ████  10
  74 ms | ██  5
  75 ms | ████  11
  76 ms | ██████  16
  77 ms | ██████  16
  78 ms | ████████  20
  79 ms | ██████  15
  80 ms | ████  10
  81 ms | ██████  16
  82 ms | ███████████  28
  83 ms | █████████  24
  84 ms | █████████  22
  85 ms | ██████  16
  86 ms | ███████████  27
  87 ms | █████████  23
  88 ms | ███████████  27
  89 ms | ████████████  31
  90 ms | █████████  24
  91 ms | ███████████████  38
  92 ms | ███████████  27
  93 ms | █████████████████  43
  94 ms | ███████████████  38
  95 ms | ███████████████████████  58
  96 ms | ███████████████████  49
  97 ms | ████████████████████  50
  98 ms | ██████████████████████████  67
  99 ms | ████████████████████████████████████████  102
 100 ms | ███████████████████████████████████  90
 101 ms | █████████████████████████████  73
 102 ms | ████████████████████████  61
 103 ms | ██████████████████████  57
 104 ms | ████████████████  42
 105 ms | ████████████████████  50
 106 ms | ██████████████  35
 107 ms | ██████████████  35
 108 ms | ████████████  31
 109 ms | ██████  16
 110 ms | ██████████  25
 111 ms | █████████  22
 112 ms | █████████  22
 113 ms | ████████████  30
 114 ms | ████████  21
 115 ms | ████████  20
 116 ms | ████████  20
 117 ms | ████████  21
 118 ms | ███████  18
 119 ms | ████████  21
 120 ms | ███████  18
 121 ms | ███████  18
 122 ms | █████  14
 123 ms | ██████  16
 124 ms | ████  10
 125 ms | █████  12
 126 ms | ███  7
 127 ms | ███  8
 128 ms | ██████  15
 129 ms | ████  10
 130 ms | ████  9
 131 ms | ████  11
 132 ms | ██  5
 133 ms | ██  5
 134 ms | ██  4
 135 ms | █  3
 136 ms | ██  4
 137 ms |   1
 138 ms | █  3
 139 ms | ██  4
 140 ms | █  3
 141 ms |   1
 142 ms | █  2
 143 ms |   1
 144 ms |   1
 146 ms |   1
 147 ms | █  2
 149 ms |   1
 153 ms |   1
 154 ms |   1
 158 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `HighEnd Shader + PBR Textures`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `5.00`
- `segment_count` = `19.00`
- `phase` = `3.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `6.39`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.97`
- `fps_1pct_low` = `6.89`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `17.00`
- `terrain_area_blocks` = `43473.00`

