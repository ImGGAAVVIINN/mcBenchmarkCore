# MC Benchmark Core session — 2026-09-26T16:56:13.601698761+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `4096 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 103.6 | 34.8 | 19.9 | 23.98 | 0.70 | 15 | 1002 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 102.2 | 35.7 | 23.5 | 23.87 | 0.82 | 15 | 1771 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 28.5 | 19.4 | 17.2 | 48.94 | 0.75 | 5 | 1605 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 28.6 | 19.5 | 17.2 | 48.77 | 0.74 | 5 | 1836 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.3 | 19.8 | 18.3 | 47.62 | 0.73 | 5 | 1607 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 28.5 | 20.1 | 19.7 | 48.49 | 0.53 | 5 | 1572 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 28.5 | 20.3 | 19.7 | 48.39 | 0.75 | 5 | 1682 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 125.8 | 18.8 | 15.2 | 47.15 | 1.20 | 10 | 1584 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 266.6 | 25.8 | 21.7 | 31.72 | 3.16 | 16 | 1320 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 93.9 | 15.1 | 13.0 | 60.60 | 3.91 | 11 | 1184 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 105.9 | 33.2 | 22.6 | 24.18 | 1.07 | 16 | 277 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 103.1 | 23.3 | 20.7 | 37.29 | 0.52 | 11 | 1646 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 32.1 | 15.6 | 15.0 | 62.40 | 3.30 | 6 | 1637 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 30.3 | 15.9 | 14.7 | 60.31 | 2.64 | 4 | 1410 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 35.7 | 13.0 | 12.1 | 72.51 | 14.32 | 10 | 1080 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 35.1 | 13.7 | 13.0 | 71.41 | 14.86 | 10 | 774 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 28.9 | 16.9 | 16.2 | 56.36 | 1.87 | 6 | 1604 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 29.3 | 17.1 | 16.6 | 56.40 | 1.89 | 6 | 1184 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.4 | 20.4 | 19.7 | 48.30 | 0.67 | 5 | 1996 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 28.4 | 20.2 | 19.4 | 48.58 | 0.28 | 5 | 1950 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 28.2 | 20.3 | 19.7 | 48.04 | 0.28 | 5 | 1778 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 28.5 | 18.8 | 15.0 | 48.19 | 0.31 | 5 | 1836 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 28.3 | 18.3 | 17.1 | 49.45 | 0.29 | 6 | 1268 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 30.7 | 13.1 | 11.4 | 66.41 | 0.48 | 24 | 1564 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 30.6 | 12.3 | 10.5 | 70.09 | 0.44 | 32 | 776 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 30.7 | 12.7 | 11.5 | 68.27 | 0.39 | 27 | 519 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 30.6 | 13.7 | 13.3 | 67.14 | 0.43 | 31 | 171 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 31.0 | 13.6 | 12.3 | 68.11 | 0.44 | 35 | 136 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 9.7 | 7.4 | n/a | 129.64 | 0.51 | 41 | 85 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 9.8 | 7.2 | n/a | 134.20 | 0.52 | 47 | 18 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 9.8 | 7.3 | n/a | 129.65 | 0.51 | 52 | 809 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 9.7 | 7.4 | n/a | 130.40 | 0.64 | 73 | 346 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 9.8 | 7.1 | n/a | 134.48 | 0.43 | 78 | 64 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 9.8 | 3.4 | n/a | 148.38 | 0.57 | 106 | 372 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 9.7 | 2.2 | n/a | 181.54 | 0.54 | 125 | 323 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 9.8 | 8.7 | n/a | 114.38 | 0.31 | 4 | 366 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 9.8 | 7.7 | n/a | 123.28 | 2.81 | 6 | 470 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 9.8 | 8.7 | n/a | 113.85 | 0.31 | 2 | 486 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 9.8 | 8.1 | n/a | 116.10 | 0.31 | 2 | 629 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 9.8 | 8.7 | n/a | 114.34 | 0.31 | 2 | 604 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 9.8 | 8.7 | n/a | 114.58 | 0.32 | 2 | 466 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 9.8 | 7.7 | 7.2 | 127.60 | 0.73 | 202 | 390 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 9.9 | 7.6 | 7.1 | 126.26 | 0.71 | 249 | 463 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

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

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `103.60`, min `16.11`, p50 `113.20`, p95 `137.53`, p99 `505.35`, 1%low `34.84`, 0.1%low `19.87`, std `67.64`

**Frame time (ms)**  avg `12.05`, p50 `8.83`, p95 `20.93`, p99 `23.98`, p99.9 `35.00`, max `62.07`

**Client tick (ms)**  avg `0.70`, p95 `1.11`, max `1.88`

**Memory**  start `2018 MB`, end `995 MB`, peak `3021 MB`, GC `15 events / 173 ms`

**FPS over sampling window (ASCII):**

```
145.1 |                                           █                                    
139.6 |                                           █                        █           
134.2 |                                           █      █                 █           
128.7 |   █                    █               █  █      █                 █           
123.3 |   █ █                  ██              █  █      █                 █     █     
117.8 |█  █ █  ██         █ █  ██              █  █      █              █ ██     █     
112.4 |█  █ █  ██    █    █ █  ██       █   █  █  █      █              █ ██     █   █ 
106.9 |██ ███  ██    █    █ █  ██       █  ██  █  █      █              █ ██     █   █ 
101.5 |██████  ██ █  █ ██ █ █ ████   █  █  ███ ██ █ █ ██ █    █  █      █ ██     █ █ ██
 96.0 |██████████ █████████ █ ████ █ ██ ██ ███ ████ █ ██ ██ ████ █ █████████ ██ ██ ████
 90.6 |█████████████████████████████████████████████████ ███████████████████ ██████████
 85.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  20
   2 ms | █  11
   3 ms |   3
   5 ms |   3
   6 ms | █  19
   7 ms | █████████████  203
   8 ms | ████████████████████████████████████████  626
   9 ms | █████████  144
  10 ms | █  16
  11 ms |   6
  12 ms |   2
  13 ms |   1
  14 ms |   4
  15 ms | ███  41
  16 ms | ██████  93
  17 ms | █████████  145
  18 ms | ███████  110
  19 ms | █████  75
  20 ms | ████  58
  21 ms | ███  40
  22 ms | █  16
  23 ms |   7
  24 ms |   7
  25 ms |   5
  26 ms |   1
  28 ms |   1
  33 ms |   1
  38 ms |   1
  62 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dragon_breath` | 160 | 207 | 110.6 | 22.19 |
| `end_rod` | 240 | 207 | 100.8 | 21.34 |
| `portal` | 160 | 207 | 103.6 | 21.63 |
| `ALL_TOGETHER` | 1680 | 207 | 102.6 | 24.29 |
| `sculk_charge_pop` | 240 | 207 | 103.8 | 23.40 |
| `smoke` | 160 | 207 | 96.2 | 21.77 |
| `flame` | 160 | 207 | 103.5 | 24.03 |
| `dripping_water` | 240 | 207 | 108.1 | 24.50 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `127.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `82.98`
- `fps_0p1pct_low` = `19.87`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `34.84`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `102.16`, min `21.53`, p50 `112.59`, p95 `139.15`, p99 `509.03`, 1%low `35.67`, 0.1%low `23.50`, std `65.77`

**Frame time (ms)**  avg `12.33`, p50 `8.88`, p95 `21.72`, p99 `23.87`, p99.9 `35.59`, max `46.45`

**Client tick (ms)**  avg `0.82`, p95 `1.20`, max `1.71`

**Memory**  start `1168 MB`, end `1656 MB`, peak `2939 MB`, GC `15 events / 142 ms`

**FPS over sampling window (ASCII):**

```
136.9 |    █       █                                                                   
132.3 |    █       █                                                                   
127.7 |    █       █                                                                   
123.1 |    █       █                                       █                        █  
118.5 |    █       █       █                █ █       █   ██            █  █        █ █
113.9 |    █  █    █  ██   █  █   █   █     █ █ █     █ █ ███           █  █        █ █
109.3 |    █  █    █  ██   ██ █   █   █    ██ █ █     █ █████           █  █        █ █
104.7 |    █  █ █  █  ██   ██ █   █   █    ██ █ █    ██ █████           █  █        ███
100.1 |██  █  █ ██ █  ██ █ ██ █   █ █ ██   ████ ███  ██ ██████ █   █    █ ██   █   ████
 95.5 |███████████ █ ███ █ ████ █ █ █ ███  ████ ███ ██████████ █  █████ █ ██ █ █ █ ████
 91.0 |███████████ ████████████████ █ █████████ ███████████████████████████████████████
 86.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  18
   2 ms | █  12
   3 ms |   1
   4 ms |   1
   5 ms |   4
   6 ms | █  21
   7 ms | █████████████  198
   8 ms | ████████████████████████████████████████  589
   9 ms | ██████████  150
  10 ms | █  22
  11 ms |   7
  12 ms |   1
  14 ms |   2
  15 ms | █  12
  16 ms | █████  71
  17 ms | ███████  107
  18 ms | ████████  114
  19 ms | ███████  102
  20 ms | ████  61
  21 ms | ████  60
  22 ms | ███  46
  23 ms | █  8
  24 ms |   5
  25 ms |   6
  26 ms |   1
  29 ms |   1
  33 ms |   1
  38 ms |   1
  46 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `81.12`
- `preload_duration_ms` = `93.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `35.67`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `23.50`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `28.47`, min `17.24`, p50 `29.17`, p95 `42.31`, p99 `48.62`, 1%low `19.39`, 0.1%low `17.24`, std `5.93`

**Frame time (ms)**  avg `36.29`, p50 `34.28`, p95 `46.55`, p99 `48.94`, p99.9 `54.94`, max `57.99`

**Client tick (ms)**  avg `0.75`, p95 `0.99`, max `10.30`

**Memory**  start `1302 MB`, end `2161 MB`, peak `2907 MB`, GC `5 events / 37 ms`

**FPS over sampling window (ASCII):**

```
 38.2 |                                                                               █
 37.0 |                                                                               █
 35.9 |                                                                               █
 34.7 |                                                                               █
 33.6 |                                                                               █
 32.4 |      █                     █                                                  █
 31.2 |██    █       █             █       █                          █           █   █
 30.1 |██    █ █     █             █    █  █       █  █ █  █ ██       █           █   █
 28.9 |██ █  ████    █     ██ █ █  █ █  █  █    ████  █ █  █ ██  █   ██ █    █    █   █
 27.8 |█████ █████ █ ██  █ ██ ████████████ ██████████████  █ ██ ██ ██████  █████ ████ █
 26.6 |█████████████ ██ ███████████████████████████████████████████████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  11 ms |   1
  18 ms |   1
  19 ms | █  2
  20 ms | █  4
  21 ms | ████  13
  22 ms | ██  5
  23 ms | █  4
  25 ms |   1
  30 ms |   1
  31 ms | █  3
  32 ms | ██████████████████████████  80
  33 ms | ████████████████████████████████████████  122
  34 ms | ██████████████████████████  79
  35 ms | ███████  21
  36 ms | ████████  23
  37 ms | ████  11
  38 ms | █████  15
  39 ms | █████  14
  40 ms | ███████  20
  41 ms | ██████  17
  42 ms | ███████  22
  43 ms | █████  15
  44 ms | ███████  22
  45 ms | ██████  19
  46 ms | █████  15
  47 ms | ██  7
  48 ms | ███  8
  49 ms | █  3
  51 ms |   1
  52 ms |   1
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.56`
- `preload_duration_ms` = `71.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.39`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.24`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `28.64`, min `17.17`, p50 `29.09`, p95 `43.44`, p99 `49.66`, 1%low `19.50`, 0.1%low `17.17`, std `5.71`

**Frame time (ms)**  avg `36.07`, p50 `34.38`, p95 `46.05`, p99 `48.77`, p99.9 `54.12`, max `58.25`

**Client tick (ms)**  avg `0.74`, p95 `0.93`, max `1.54`

**Memory**  start `1101 MB`, end `2456 MB`, peak `2937 MB`, GC `5 events / 36 ms`

**FPS over sampling window (ASCII):**

```
 34.5 |                                                      █                         
 33.7 |                                                      █                         
 32.9 |                                                      █   █                     
 32.0 |                                  █                   █   █     █               
 31.2 |        █    █               █    █                   █   █     █               
 30.4 |  █     █    ██ ██   █  █    █    █           ██ █    █   █ █   █     █         
 29.6 |  █     █ ██ ██ ██   █  █    █    █ ██   █ █ ███ █    █   █ █   █   █ ██        
 28.8 |█ █    ██ ██ ██ ██ █ █  ███  █  █ █ ██   ███ ███ █ █ ██   █ █   █   █ ██  ██    
 28.0 |█ ██  ███ ██ ██ ██ █ ██ ████ ████ █████ ████████ ███ ████████ █ █  ██ ██  ██    
 27.2 |█ ███████████████████████████████ █████ ███████████████████████ ██ ███████████  
 26.4 |█████████████████████████████████ ████████████████████████████████████████████ █
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms |   1
  20 ms | ███  8
  21 ms | ███  9
  22 ms | ███  8
  23 ms | ██  7
  24 ms | █  3
  26 ms |   1
  30 ms | █  4
  31 ms | ██  5
  32 ms | ███████████████████████████  81
  33 ms | ████████████████████████████████████████  118
  34 ms | █████████████████████  62
  35 ms | ██████████  29
  36 ms | █████████  27
  37 ms | █████  14
  38 ms | ██  7
  39 ms | ██████  18
  40 ms | ███████  22
  41 ms | ███████  20
  42 ms | ██████  19
  43 ms | ███████  21
  44 ms | ██████  17
  45 ms | ████████  23
  46 ms | ██████  18
  47 ms | █  2
  48 ms | █  3
  49 ms | █  3
  50 ms | █  2
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `151.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.73`
- `preload_duration_ms` = `34.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.50`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `151.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.17`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `28.28`, min `18.32`, p50 `28.74`, p95 `44.62`, p99 `50.48`, 1%low `19.84`, 0.1%low `18.32`, std `6.04`

**Frame time (ms)**  avg `36.66`, p50 `34.79`, p95 `46.34`, p99 `47.62`, p99.9 `52.90`, max `54.57`

**Client tick (ms)**  avg `0.73`, p95 `1.06`, max `1.69`

**Memory**  start `1348 MB`, end `2425 MB`, peak `2955 MB`, GC `5 events / 39 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |         █                                                                      
 32.3 |         █                                                                     █
 31.6 |         █                  █                  █                               █
 30.8 |       █ █  ██  █       █   █                  █      █                        █
 30.1 |     █ █ █  ███ ██      █   █     █           ██  █   █                        █
 29.4 |     █ █ █  ███ ██      █   █     █      ██   ██  █   █          █         █   █
 28.7 |     █ ████ ███ ██ █   ██   █    ██   █ ███ █ ██  ██  █   █ █  █ █  █  █   █   █
 28.0 |█    █ ████████ ██ ██  ██   █  █ ██ █ █ ███ █ ███ █████   █ █  █ █ ██ ██   ██ ██
 27.2 |██   ██████████ ██ ██████ ███ ██ ██ █ █ ███ ████████████ ██ █  ███ ██ ██   █████
 26.5 |██ ████████████ █████████ ███████████ █ ███████████████████ █  ██████ ███  █████
 25.8 |███████████████ █████████████████████████████████████████████ ████████████ █████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms | █  2
  19 ms | █  3
  20 ms | ██  6
  21 ms | █████  12
  22 ms | ███  7
  23 ms | ██  5
  24 ms |   1
  29 ms |   1
  31 ms | █  3
  32 ms | ██████████████████████████████████  87
  33 ms | ████████████████████████████████████████  101
  34 ms | ███████████████████  48
  35 ms | ███████  17
  36 ms | ███████████  28
  37 ms | ██████  15
  38 ms | ██████  16
  39 ms | ███████  17
  40 ms | █████  13
  41 ms | ████████████  31
  42 ms | ███████  18
  43 ms | █████████  22
  44 ms | ██████████  24
  45 ms | █████████████  32
  46 ms | ████████  21
  47 ms | ████  9
  48 ms | █  3
  51 ms |   1
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.28`
- `preload_duration_ms` = `33.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `19.84`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `18.32`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `28.54`, min `19.67`, p50 `29.13`, p95 `44.84`, p99 `49.39`, 1%low `20.06`, 0.1%low `19.67`, std `6.03`

**Frame time (ms)**  avg `36.31`, p50 `34.33`, p95 `46.44`, p99 `48.49`, p99.9 `50.72`, max `50.83`

**Client tick (ms)**  avg `0.53`, p95 `0.69`, max `1.18`

**Memory**  start `1398 MB`, end `1840 MB`, peak `2970 MB`, GC `5 events / 34 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |                                                             █                  
 32.5 |                                                             █          █       
 31.8 |                       █                                     █          █       
 31.0 |                       ██      █       █           █         █          █       
 30.3 |                 █     ██    █ █   █   █           █      █  █          █      █
 29.6 |      █ ██       █     ██   █████ ██   █ ██  ██    █ █    ██ █          █      █
 28.8 |   █  █ ███    █ █   █ ██   ████████  ██ ███ ██ █  █ █    ██ █     █    ██  ██ █
 28.1 |█  █ ██ ███    ███  ██████ ██████████ ██ ███ ██ ████ █  ████ █     █ █  ███ ████
 27.4 |████ ███████ █ ████ ████████████████████████ ██ ██████████████ █████ █  ████████
 26.6 |██████████████ ████████████████████████████████ ████████████████████████████████
 25.9 |███████████████████████████████████████████████ ████████████████████████████████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms |   1
  20 ms | ████  15
  21 ms | ██  7
  22 ms | ███  12
  25 ms |   1
  27 ms |   1
  31 ms | █  3
  32 ms | ██████████████████  67
  33 ms | ████████████████████████████████████████  145
  34 ms | ███████████  40
  35 ms | ██████████  35
  36 ms | █████  17
  37 ms | █████  17
  38 ms | ████  16
  39 ms | ████  16
  40 ms | █████  19
  41 ms | ████  14
  42 ms | ██████  20
  43 ms | █████  18
  44 ms | ██████  23
  45 ms | ███████  26
  46 ms | █████  18
  47 ms | ██  9
  48 ms | █  4
  49 ms | █  2
  50 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.54`
- `preload_duration_ms` = `32.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.06`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.67`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `28.54`, min `19.67`, p50 `29.20`, p95 `43.63`, p99 `48.27`, 1%low `20.35`, 0.1%low `19.67`, std `5.40`

**Frame time (ms)**  avg `36.10`, p50 `34.25`, p95 `46.78`, p99 `48.39`, p99.9 `49.98`, max `50.85`

**Client tick (ms)**  avg `0.75`, p95 `1.07`, max `1.94`

**Memory**  start `1285 MB`, end `1838 MB`, peak `2967 MB`, GC `5 events / 39 ms`

**FPS over sampling window (ASCII):**

```
 32.1 |                                                    █                           
 31.4 |                                 █ █       █        █         █                █
 30.8 |    █                 █          █ █       █        █         █           █    █
 30.2 |    ██        ██ █    ██        ██ █ █     █ █      █   █     ████      █ █    █
 29.6 |    ██        ██ █  █ ██  █     ██ █ █   █ █ █      █ █ █   █ ████      █ █    █
 29.0 |    ██        ██ █  █ ██  █     ██ █ █   █ █ █      █ █ █   █ ████ ██   █ ██ ███
 28.3 |   ███ █   █ ████████ ██  █     ██ ███   █████      █ █ ███ █ ████ ██ █ █ ██ ███
 27.7 |█ ████ █████ ████████ ██  ██  ████ █████ ███████ ██ █████████ ████ ██ ███ ██ ███
 27.1 |█ ███████████████████ ███ ████████ █████ ██████████ █████████ ███████ ███ ██ ███
 26.5 |██████████████████████████████████ █████ ██████████ ████████████████████████████
 25.9 |████████████████████████████████████████ ███████████████████████████████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | ██  6
  21 ms | ████  13
  22 ms | ██  8
  23 ms | █  4
  24 ms |   1
  31 ms | █  4
  32 ms | ██████████████████████  78
  33 ms | ████████████████████████████████████████  140
  34 ms | █████████████████  60
  35 ms | ████████  28
  36 ms | █████  18
  37 ms | █████  18
  38 ms | ██████  21
  39 ms | ████  13
  40 ms | ██████  22
  41 ms | ████  15
  42 ms | ██████  20
  43 ms | █████  17
  44 ms | █████  17
  45 ms | ████  13
  46 ms | ████  14
  47 ms | ████  13
  48 ms | ██  7
  49 ms | █  2
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.70`
- `preload_duration_ms` = `44.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.35`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.67`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `125.84`, min `15.16`, p50 `101.16`, p95 `433.22`, p99 `577.10`, 1%low `18.82`, 0.1%low `15.16`, std `128.36`

**Frame time (ms)**  avg `16.32`, p50 `9.88`, p95 `42.14`, p99 `47.15`, p99.9 `58.08`, max `65.96`

**Client tick (ms)**  avg `1.20`, p95 `1.54`, max `2.04`

**Memory**  start `1428 MB`, end `2084 MB`, peak `3012 MB`, GC `10 events / 91 ms`

**FPS over sampling window (ASCII):**

```
207.1 |                                      █                      █                  
190.8 |                        █             █   █  █  █            █      █ █         
174.4 |                       ██ █           █  ██  █  █           ██    ███ █ █       
158.1 |                     ███████ ███   █  ███████████         ████  █ ███ ███  █  █ 
141.7 |                     ████████████  ██████████████ ███ ██ █████ ███████████ ██ █ 
125.4 |                   ███████████████████████████████████████████ ███████████ █████
109.0 |                  ██████████████████████████████████████████████████████████████
 92.7 |                  ██████████████████████████████████████████████████████████████
 76.3 |                  ██████████████████████████████████████████████████████████████
 59.9 |                  ██████████████████████████████████████████████████████████████
 43.6 |                  ██████████████████████████████████████████████████████████████
 27.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███████  39
   2 ms | █████████████████  91
   3 ms | ███████  39
   4 ms | ███  14
   5 ms | █  7
   6 ms | ██████  31
   7 ms | ██████████████████  99
   8 ms | ████████████████████████████████████████  215
   9 ms | ████████████████  87
  10 ms | ████  22
  11 ms | █  6
  12 ms |   2
  13 ms | ██  12
  14 ms | ████  20
  15 ms | ████  20
  16 ms | ██████  32
  17 ms | █████████  49
  18 ms | █████████  51
  19 ms | ██████  30
  20 ms | ███████  37
  21 ms | █████  27
  22 ms | ████  24
  23 ms | ██  10
  24 ms | █  7
  25 ms | █  4
  31 ms | █  5
  32 ms | ███████  35
  33 ms | █████████  51
  34 ms | ██████  34
  35 ms | ███  15
  36 ms | █  7
  37 ms | ██  12
  38 ms | ██  9
  39 ms | █  3
  40 ms | █  7
  41 ms | ██  10
  42 ms | █  7
  43 ms | ██  9
  44 ms | ██  13
  45 ms | ██  11
  46 ms | ██  10
  47 ms | █  3
  48 ms |   2
  49 ms |   1
  52 ms |   2
  54 ms |   1
  55 ms |   2
  58 ms |   1
  65 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `61.29`
- `preload_duration_ms` = `26.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `18.82`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `15.16`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `266.63`, min `20.57`, p50 `116.85`, p95 `1108.48`, p99 `1503.49`, 1%low `25.76`, 0.1%low `21.72`, std `367.56`

**Frame time (ms)**  avg `10.52`, p50 `8.56`, p95 `22.86`, p99 `31.72`, p99.9 `42.29`, max `48.63`

**Client tick (ms)**  avg `3.16`, p95 `4.22`, max `15.62`

**Memory**  start `1750 MB`, end `1496 MB`, peak `3071 MB`, GC `16 events / 149 ms`

**FPS over sampling window (ASCII):**

```
401.8 |                                                                   █            
379.8 |                                           █                       █            
357.7 |                                           █   █ █                 █    █       
335.7 |                                       █   █   █ █ █             ███    █    █  
313.7 |                                 █ █   █   █  ██ █ █ █ █  █    █ ███   ██    █  
291.6 |          █               █  █   █ █   █   █  ██ █ █ █ █  █ █  █ ████ ███ █  █  
269.6 |  █       █             █ █ ███  █ █  ██ █ ██ ██ █████ █  ██████ ████ ███ █████ 
247.6 |  ██      █   █ ████ ████ █ ████████  ████ █████ █████ ████████████████████████ 
225.5 |█████  ████ ████████ ████ █ ██████████████ █████ ███████████████████████████████
203.5 |████████████████████ ██████ ████████████████████████████████████████████████████
181.5 |████████████████████ ███████████████████████████████████████████████████████████
159.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████  165
   1 ms | █████████████  190
   2 ms |   5
   3 ms | ██  26
   4 ms | ████  55
   5 ms | ██████  86
   6 ms |   5
   7 ms | ██  24
   8 ms | ████████████████████████████████████████  580
   9 ms | ███  37
  10 ms | █  9
  11 ms | ██████  94
  12 ms | ███  38
  13 ms | ██  22
  14 ms | ██  33
  15 ms | ███  38
  16 ms | ████  60
  17 ms | █████  67
  18 ms | ████  58
  19 ms | ████  65
  20 ms | ████  64
  21 ms | ███  48
  22 ms | ███  42
  23 ms | ██  26
  24 ms | █  19
  25 ms | █  13
  26 ms | █  9
  28 ms |   1
  30 ms |   1
  31 ms |   2
  34 ms |   2
  35 ms |   4
  36 ms |   1
  38 ms |   5
  40 ms |   2
  41 ms |   2
  42 ms |   1
  43 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `95.09`
- `preload_duration_ms` = `51.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `25.76`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `21.72`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23115 ms  |  Sample ticks: 400

**FPS**  avg `93.86`, min `13.02`, p50 `56.20`, p95 `323.10`, p99 `419.98`, 1%low `15.10`, 0.1%low `13.02`, std `93.11`

**Frame time (ms)**  avg `21.51`, p50 `17.79`, p95 `53.99`, p99 `60.60`, p99.9 `72.21`, max `76.82`

**Client tick (ms)**  avg `3.91`, p95 `6.55`, max `11.30`

**Memory**  start `1862 MB`, end `2064 MB`, peak `3046 MB`, GC `11 events / 79 ms`

**FPS over sampling window (ASCII):**

```
194.9 |                       █                                                        
179.9 |           █           █                                                        
165.0 |           █   █    █  █ █                                                      
150.0 |██ ███ █ █ █   ██  ██ ██████   █  █       █ ██                                  
135.1 |██████ ███ █  ███ ████████████ █  ██ ████ █ ██                                  
120.1 |█████████████████████████████████████████ ████                                  
105.2 |██████████████████████████████████████████████                                  
 90.2 |██████████████████████████████████████████████                                  
 75.2 |██████████████████████████████████████████████                                  
 60.3 |███████████████████████████████████████████████   █     █                       
 45.3 |███████████████████████████████████████████████   █ ██  █      ███  █  █   ████ 
 30.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   2 ms | ███████████████  40
   3 ms | ███████████████  40
   4 ms | ████████  23
   5 ms | ████████████  32
   6 ms | ██████  17
   7 ms | ██████████  27
   8 ms | ████████████████████████████████████████  109
   9 ms | ████████  22
  10 ms | ████████  21
  11 ms | ███████  20
  12 ms | ████  12
  13 ms | ████  12
  14 ms | ████████  23
  15 ms | ██████  16
  16 ms | ██████████  27
  17 ms | ███████████  29
  18 ms | ██████████████  38
  19 ms | ██████████  28
  20 ms | ███████████  29
  21 ms | ██████  16
  22 ms | ████  12
  23 ms | █████  13
  24 ms | ██████  15
  25 ms | ███  7
  26 ms | ████  12
  27 ms | ██  5
  28 ms | ██████  16
  29 ms | █████  14
  30 ms | ████  11
  31 ms | ██████  15
  32 ms | ██████  16
  33 ms | ████  12
  34 ms | ██  6
  35 ms | ███  8
  36 ms | █████  13
  37 ms | ██████  15
  38 ms | █████  13
  39 ms | █  3
  40 ms | ████  11
  41 ms | ███  9
  42 ms | █  2
  43 ms | ██  5
  44 ms | ███  7
  45 ms | █  2
  46 ms | ███  8
  47 ms | ███  9
  48 ms | ███  8
  49 ms | ████  10
  50 ms | ███  9
  51 ms | ██  5
  52 ms | █  4
  53 ms | ██  6
  54 ms | ██  5
  55 ms | █  3
  56 ms | ███  7
  57 ms | ██  6
  58 ms | ██  5
  59 ms | ███  8
  60 ms | █  4
  61 ms | █  2
  62 ms |   1
  63 ms |   1
  64 ms |   1
  65 ms |   1
  67 ms |   1
  71 ms |   1
  76 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `13.02`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `44.00`
- `fps_harmonic_avg` = `46.49`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `15.10`
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

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `105.87`, min `20.83`, p50 `111.95`, p95 `146.78`, p99 `445.44`, 1%low `33.23`, 0.1%low `22.63`, std `69.32`

**Frame time (ms)**  avg `12.27`, p50 `8.93`, p95 `21.83`, p99 `24.18`, p99.9 `39.95`, max `48.01`

**Client tick (ms)**  avg `1.07`, p95 `1.35`, max `1.94`

**Memory**  start `2792 MB`, end `2129 MB`, peak `3070 MB`, GC `16 events / 145 ms`

**FPS over sampling window (ASCII):**

```
129.3 |                                                  █ █                           
125.3 |         █  █                                   ███ █          █                
121.2 |        ██  █                                █  ███ █          █       █       █
117.2 |      █ ███ █          █     █ █             █  ███ █          █   █  ██       █
113.2 |  █   █ ███ ██        ██     █ █             █  ███ █          █  ██  ██  █    █
109.2 |  █  ██ ███ ██ █   ██ ██     █ █ █       █   ██ ███ █         ██  █████████  █ █
105.1 |█ █  ██ ███ ██ █   ██ ██   █████ █       █  ███ █████         ██  █████████  ███
101.1 |█ █  ██ ██████ █   ██████  █████ ██   ██ █  ███ █████    █  █ ██  █████████ ████
 97.1 |█ █ ██████████ ███ ██████ ██████ ██ █ ████  ██████████ █ ████ ███ █████████ ████
 93.1 |█ █ ██████████████ ██████ █████████ ██████ █████████████ ████ █████████████ ████
 89.1 |███████████████████████████████████ ████████████████████████████████████████████
 85.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   3
   2 ms | ████  46
   3 ms | █  9
   4 ms |   4
   5 ms |   4
   6 ms | ███  36
   7 ms | ████████████████████  248
   8 ms | ████████████████████████████████████████  493
   9 ms | █████████████  157
  10 ms | ██  24
  11 ms |   5
  12 ms |   4
  13 ms |   1
  14 ms |   2
  15 ms |   5
  16 ms | ████  55
  17 ms | ████████  100
  18 ms | ███████████  131
  19 ms | ███████  88
  20 ms | ███████  86
  21 ms | █████  57
  22 ms | ███  34
  23 ms | ██  19
  24 ms | █  8
  25 ms |   2
  26 ms |   2
  27 ms |   2
  29 ms |   1
  32 ms |   1
  33 ms |   1
  39 ms |   1
  40 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `pillars_built` = `48.00`
- `neighbour_updates` = `0.00`
- `entity_count_delta` = `0.00`
- `zombies_spawned` = `150.00`
- `preload_duration_ms` = `78.00`
- `fps_1pct_low` = `33.23`
- `fps_harmonic_avg` = `81.49`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `22.63`
- `part` = `1.00`
- `preset_long` = `0.00`
- `preload_chunks` = `81.00`
- `entity_count_sample_end` = `151.00`
- `entity_count_sample_start` = `151.00`
- `seed` = `6271.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `103.15`, min `20.43`, p50 `112.56`, p95 `137.56`, p99 `479.43`, 1%low `23.35`, 0.1%low `20.65`, std `72.89`

**Frame time (ms)**  avg `13.02`, p50 `8.88`, p95 `23.23`, p99 `37.29`, p99.9 `47.31`, max `48.94`

**Client tick (ms)**  avg `0.52`, p95 `0.71`, max `1.32`

**Memory**  start `1447 MB`, end `3018 MB`, peak `3093 MB`, GC `11 events / 99 ms`

**FPS over sampling window (ASCII):**

```
137.1 |                                                              █                 
127.3 |          █  █              █         ███     █               █      █          
117.5 | ███ █    █ ██  █           █ █   █ █ ███     █   ██ █        █   █  █   ██     
107.7 |████ █    █ ███ █  █   ██   ███   ███ ███     █ ████ █ ██ █   █ █ ██ █ █ ██     
 97.9 |████ ████ █ ███ █████████ █ ███ ███████████ █ ██████ ████████ ████████ █ ███    
 88.1 |██████████████████████████████████████████████████████████████████████████████  
 78.3 |██████████████████████████████████████████████████████████████████████████████  
 68.5 |██████████████████████████████████████████████████████████████████████████████  
 58.7 |██████████████████████████████████████████████████████████████████████████████  
 48.9 |██████████████████████████████████████████████████████████████████████████████  
 39.1 |██████████████████████████████████████████████████████████████████████████████  
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  8
   2 ms | ███  43
   3 ms |   2
   4 ms |   1
   6 ms | █  10
   7 ms | ███████████  163
   8 ms | ████████████████████████████████████████  596
   9 ms | █████  80
  10 ms | █  17
  11 ms |   6
  12 ms |   1
  14 ms |   1
  15 ms | █  15
  16 ms | ████  57
  17 ms | █████████  131
  18 ms | █████████  132
  19 ms | █████  73
  20 ms | ████  53
  21 ms | ███  43
  22 ms | █  22
  23 ms | █  18
  24 ms |   7
  25 ms |   1
  29 ms |   1
  31 ms |   1
  32 ms | █  9
  33 ms | █  12
  34 ms |   6
  35 ms |   4
  36 ms |   5
  37 ms |   3
  38 ms |   1
  39 ms |   1
  40 ms |   2
  41 ms |   3
  42 ms |   2
  44 ms |   1
  46 ms |   2
  47 ms |   1
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `workstations_placed` = `40.00`
- `beds_placed` = `40.00`
- `fps_0p1pct_low` = `20.65`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `7.00`
- `fps_harmonic_avg` = `76.78`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `23.35`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `doors_placed` = `16.00`
- `seed` = `6299.00`
- `scheduled_block_ticks` = `0.00`
- `part` = `1.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `32.09`, min `14.99`, p50 `29.03`, p95 `54.31`, p99 `70.21`, 1%low `15.64`, 0.1%low `14.99`, std `15.00`

**Frame time (ms)**  avg `36.32`, p50 `34.45`, p95 `59.36`, p99 `62.40`, p99.9 `65.34`, max `66.70`

**Client tick (ms)**  avg `3.30`, p95 `5.10`, max `8.06`

**Memory**  start `1471 MB`, end `1996 MB`, peak `3108 MB`, GC `6 events / 52 ms`

**FPS over sampling window (ASCII):**

```
 52.9 |                          █                                                     
 50.5 |                          █                                               █     
 48.1 |                          █                                               █     
 45.7 |                          █                                               █     
 43.3 |                          █                                  █   █        █     
 40.9 |                          █                                  █   █        █     
 38.5 |                          █                                  █   █        █     
 36.1 |    █     ██          █  ██ █                           █    █   █        █     
 33.7 |    ██ ██ ██  █ █     █ ███ █   █      ██    ██  █    █ ███ ███  █  █     █   █ 
 31.3 |███ ██ ██ ██ ██ █ ███ █████ ██ ██ ███  ███   ██ ███████ ██████████  ███   █  ███
 28.9 |█████████ █████████████████ █████████ █████████████████████████████████████ ████
 26.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   7 ms | █  1
   9 ms | ██  2
  12 ms | █  1
  13 ms | █  1
  14 ms | █  1
  15 ms | █  1
  16 ms | ███  3
  17 ms | █████████  9
  18 ms | ███████████████████  19
  19 ms | ███████████  11
  20 ms | ██████████████████████████  26
  21 ms | █████████████████████████████  29
  22 ms | ████████████  12
  23 ms | ███████████████  15
  24 ms | █████████████  13
  25 ms | ███████  7
  26 ms | █  1
  27 ms | ██████  6
  28 ms | ██  2
  29 ms | ███████████  11
  30 ms | ████████████████████████████  28
  31 ms | ████████████████  16
  32 ms | █████████  9
  33 ms | ████████████████████████████████████████  40
  34 ms | ████████████████  16
  35 ms | ██████████████████  18
  36 ms | ██████████████████████████████  30
  37 ms | ████████████  12
  38 ms | █████████████  13
  39 ms | ████████  8
  40 ms | █████  5
  41 ms | ██████████  10
  42 ms | ████████  8
  43 ms | ██████████  10
  44 ms | █████████████  13
  45 ms | ████████  8
  46 ms | █████  5
  47 ms | █████████  9
  48 ms | ██████  6
  49 ms | ███████  7
  50 ms | ███  3
  51 ms | █████████  9
  52 ms | ███████████  11
  53 ms | ██████  6
  54 ms | ████████  8
  55 ms | ████████████  12
  56 ms | ████████  8
  57 ms | █████  5
  58 ms | ██████████████  14
  59 ms | ████████  8
  60 ms | ████████████  12
  61 ms | ███  3
  62 ms | █████  5
  63 ms | █  1
  64 ms | ██  2
  66 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p95` = `150.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `14.99`
- `preset_long` = `0.00`
- `preload_duration_ms` = `105.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.54`
- `fps_1pct_low` = `15.64`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.30`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `30.30`, min `14.68`, p50 `28.65`, p95 `51.04`, p99 `56.53`, 1%low `15.94`, 0.1%low `14.68`, std `9.77`

**Frame time (ms)**  avg `36.14`, p50 `34.90`, p95 `55.65`, p99 `60.31`, p99.9 `65.25`, max `68.10`

**Client tick (ms)**  avg `2.64`, p95 `4.41`, max `6.07`

**Memory**  start `1710 MB`, end `1985 MB`, peak `3120 MB`, GC `4 events / 45 ms`

**FPS over sampling window (ASCII):**

```
 37.5 |              █                                                                 
 36.5 |              █                                      █   █                      
 35.4 | █   █        █                                  █   █   █     █                
 34.3 | █   █        █       █                          █   ██  █     █                
 33.3 | █  ███   █   █      ██                   ██     █   ██  █     █     █         █
 32.2 | ██ ███  ████ ██     ███               █  ██     █   ███ █     █ █   █         █
 31.1 | ██ ███  ████████    ████              █ ███  █  █  ████ █  █  ███   █         █
 30.1 |███ ███ █████████  ████████      █  █  ██████ █  ███████ █  █  ███   █    █    █
 29.0 |██████████████████ ████████ █  █ █  ██ ██████ ██████████ █ ███ ███  ██    ██   █
 28.0 |██████████████████ ████████ ██ ███  ██ ███████████████████ ███████  █████ ███ ██
 26.9 |██████████████████████████████ ████████████████████████████████████ ████████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  2
  17 ms | █████  7
  18 ms | ███████  10
  19 ms | █████████  13
  20 ms | ██████████████  19
  21 ms | ████████████  17
  22 ms | █████████  13
  23 ms | █████████  13
  24 ms | ██████  9
  25 ms | ████  5
  26 ms | █  1
  28 ms | █  2
  29 ms | █████  7
  30 ms | ████████████  17
  31 ms | ████████████████████████  33
  32 ms | ██████████████  20
  33 ms | ████████████████████████████████████████  56
  34 ms | ██████████████████████████████  42
  35 ms | ██████████████████████████████  42
  36 ms | ██████████  14
  37 ms | █████████  12
  38 ms | █████  7
  39 ms | ███████  10
  40 ms | █████████  12
  41 ms | ████████  11
  42 ms | ███████████  15
  43 ms | ██████████████  19
  44 ms | ██████████  14
  45 ms | █████████  13
  46 ms | █████████  13
  47 ms | ████████  11
  48 ms | █████████  13
  49 ms | ██████  8
  50 ms | ██  3
  51 ms | ███  4
  52 ms | ███  4
  53 ms | ████  5
  54 ms | ████  5
  55 ms | ████  6
  56 ms | ████  6
  57 ms | ███  4
  58 ms | █████  7
  59 ms | █  1
  60 ms | ██  3
  61 ms | █  2
  62 ms | █  2
  68 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p95` = `148.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `14.68`
- `preset_long` = `0.00`
- `preload_duration_ms` = `72.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `27.67`
- `fps_1pct_low` = `15.94`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.82`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `35.73`, min `12.06`, p50 `29.14`, p95 `69.44`, p99 `149.28`, 1%low `13.00`, 0.1%low `12.06`, std `26.17`

**Frame time (ms)**  avg `36.64`, p50 `34.31`, p95 `62.43`, p99 `72.51`, p99.9 `79.56`, max `82.92`

**Client tick (ms)**  avg `14.32`, p95 `19.84`, max `34.03`

**Memory**  start `2039 MB`, end `1298 MB`, peak `3119 MB`, GC `10 events / 77 ms`

**FPS over sampling window (ASCII):**

```
 55.6 |                                                                            █   
 52.9 |                       █                █                     █             █   
 50.3 |                       █                █                     █        █    █   
 47.6 |                       █                █          █          █        █    █   
 44.9 |   █     █          █  █   █            █          █    █     █        █    █   
 42.2 |   █     █    █     █  █   █            █          █    █     █        █    █   
 39.6 |   █     █    █    ██  █   █            █  █    █  █    ██    ██       █    ██  
 36.9 | █ █  █  █    █    ██ ██  █████  █  █   █ ██    █  █    ██    ██   █  ██  █ ██  
 34.2 | █ █ ██████   █    ██ ██  ██████ ████   █ ██ █ ██  █   ███ █ ███ █ █  ██  █ ██  
 31.5 |██ █ ██████ █ ████ █████  ██████ ██████ █ ██ █ ██████ ████ █ ███ ███ ███ █████  
 28.8 |██ ███████████████████████████████████████████ █████████████████ ███████████████
 26.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ██  1
   5 ms | █████  3
   6 ms | ███████  4
   8 ms | █████████  5
   9 ms | █████  3
  10 ms | █████  3
  11 ms | ██  1
  12 ms | ███  2
  13 ms | █████████  5
  14 ms | █████████  5
  15 ms | █████████████████  10
  16 ms | ██████████████████████████  15
  17 ms | ███████████████████████████████████  20
  18 ms | ███████████████████  11
  19 ms | ████████████████████████  14
  20 ms | ████████████  7
  21 ms | ██████████████  8
  22 ms | █████████████████  10
  23 ms | ███████████████████████  13
  24 ms | █████████████████  10
  25 ms | ████████████  7
  26 ms | █████████  5
  27 ms | ██████████████  8
  28 ms | ███████████████████████  13
  29 ms | ██████████████  8
  30 ms | ██████████████████████████  15
  31 ms | ████████████████████████████████████████  23
  32 ms | █████████████████████████████████  19
  33 ms | █████████████████████████████████████  21
  34 ms | ████████████████████████████████████████  23
  35 ms | ███████  4
  36 ms | ████████████████  9
  37 ms | ████████████  7
  38 ms | ██████████████  8
  39 ms | ████████████████  9
  40 ms | █████████████████  10
  41 ms | █████████████████████  12
  42 ms | ███████  4
  43 ms | ██████████████████████████  15
  44 ms | ████████████  7
  45 ms | ████████████  7
  46 ms | ████████████████  9
  47 ms | ███████████████████  11
  48 ms | ███████████████████  11
  49 ms | ███████████████████  11
  50 ms | ████████████████  9
  51 ms | ████████████  7
  52 ms | ██████████████  8
  53 ms | ███████  4
  54 ms | ███████  4
  55 ms | █████████  5
  56 ms | ████████████  7
  57 ms | ██████████████  8
  58 ms | █████████████████  10
  59 ms | █████████████████  10
  60 ms | ███████████████████  11
  61 ms | █████████  5
  62 ms | ██████████  6
  63 ms | ███████  4
  64 ms | ██  1
  66 ms | █████  3
  67 ms | ██  1
  68 ms | ██  1
  70 ms | █████████  5
  71 ms | █████  3
  72 ms | ███████  4
  75 ms | ██  1
  76 ms | ███  2
  82 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `100.00`
- `falling_blocks_landed` = `26358.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.29`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.06`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4799.54`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `35.09`, min `13.01`, p50 `29.28`, p95 `69.23`, p99 `123.08`, 1%low `13.66`, 0.1%low `13.01`, std `23.65`

**Frame time (ms)**  avg `36.83`, p50 `34.16`, p95 `65.34`, p99 `71.41`, p99.9 `74.87`, max `76.86`

**Client tick (ms)**  avg `14.86`, p95 `20.74`, max `30.31`

**Memory**  start `2370 MB`, end `1885 MB`, peak `3144 MB`, GC `10 events / 73 ms`

**FPS over sampling window (ASCII):**

```
 72.1 |                                    █                                           
 68.0 |                                    █                                           
 63.9 |                                    █                                           
 59.8 |                                    █                                           
 55.7 |                                    █                                           
 51.6 |                █                   █                                    █      
 47.5 |                █                   █                                    █      
 43.4 |                █  █                █                       █ █          █     █
 39.3 | █    █     █  ██ ██  █   █ █ █   █ █      █ █    █ ██      ███          █  █  █
 35.2 | █ ██ ██ █  ████████ ████ █ █ █   █ █ █ █  █ ██ ███ ██ █ ██ ███ █ █ █ ██ █  █  █
 31.1 |██ ███████ █████████ ████████ █████ █ █████████ ███ ███████ █████████ ██ ████  █
 27.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   5 ms | █  1
   6 ms | █  1
   7 ms | ████  3
   8 ms | ███  2
   9 ms | ███  2
  10 ms | ██████████  7
  11 ms | ████  3
  12 ms | █  1
  13 ms | ████  3
  14 ms | ███████████  8
  15 ms | ███████  5
  16 ms | ████████████████████  14
  17 ms | ████████████████████████████████████████  28
  18 ms | ████████████████████  14
  19 ms | █████████████████  12
  20 ms | █████████  6
  21 ms | █████████  6
  22 ms | █████████████████  12
  23 ms | ███████████████████  13
  24 ms | ████████████████  11
  25 ms | ███████████  8
  26 ms | ██████████████████████████  18
  27 ms | █████████████████████  15
  28 ms | ██████████  7
  29 ms | █████████  6
  30 ms | ███████████████████  13
  31 ms | ████████████████████  14
  32 ms | ██████████████████████████  18
  33 ms | ███████████████████████  16
  34 ms | ████████████████  11
  35 ms | █████████  6
  36 ms | ████████████████  11
  37 ms | ████  3
  38 ms | ██████████  7
  39 ms | █████████████  9
  40 ms | ████████████████████  14
  41 ms | █████████  6
  42 ms | ██████████  7
  43 ms | ██████████████  10
  44 ms | █████████████████  12
  45 ms | █████████████  9
  46 ms | ███████████  8
  47 ms | ████████████████  11
  48 ms | ████████████████  11
  49 ms | █████████████████  12
  50 ms | ████████████████  11
  51 ms | ██████████████  10
  52 ms | █████████  6
  53 ms | ██████████████  10
  54 ms | ██████████  7
  55 ms | ████  3
  56 ms | █████████  6
  57 ms | ███████████  8
  58 ms | ██████████  7
  59 ms | ███████████  8
  60 ms | ██████████  7
  61 ms | █████████  6
  62 ms | ███  2
  63 ms | ██████████  7
  64 ms | ███  2
  65 ms | ████  3
  66 ms | ███████  5
  67 ms | ████  3
  68 ms | ████  3
  69 ms | ███████  5
  70 ms | █  1
  71 ms | ███████  5
  72 ms | █  1
  73 ms | █  1
  76 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `68.00`
- `falling_blocks_landed` = `28488.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.15`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.01`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4801.23`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.66`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `28.92`, min `16.24`, p50 `28.52`, p95 `45.65`, p99 `54.16`, 1%low `16.87`, 0.1%low `16.24`, std `6.93`

**Frame time (ms)**  avg `36.20`, p50 `35.07`, p95 `47.32`, p99 `56.36`, p99.9 `61.22`, max `61.59`

**Client tick (ms)**  avg `1.87`, p95 `2.61`, max `3.42`

**Memory**  start `1565 MB`, end `2040 MB`, peak `3169 MB`, GC `6 events / 46 ms`

**FPS over sampling window (ASCII):**

```
 35.8 |           █                                                                    
 34.9 |           █                                                                    
 34.0 |       █   █         █                                                          
 33.2 |       █   █         █                                                █         
 32.3 |       ██  █         █        █                           █    █ █    █         
 31.5 |       ██  █      █  █  █   ███                           █    █ █    █   █     
 30.6 |       ██  █      █  █  █  ████  █                        █    █ ██   █   █  █ █
 29.7 | █     ██ ███ ██  █  ████ █████  █ ██              █      █    █ ██   █   █  █ █
 28.9 | ██    ██ ███ ██  █  ███████████ █ ██       █      █  ██  █ █  █ ██   █   ██ █ █
 28.0 |███    ██ ███ █████ ████████████ ████  █ █  █  ██  ██████ ███ ██ ██  ██  ███ █ █
 27.1 |███████████████████ █████████████████ ██ █ ██████ ███████ ███ ██ ███████████ ███
 26.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  17 ms | ██  4
  18 ms | ███  6
  19 ms | █  3
  20 ms | ██  5
  21 ms | █████  11
  22 ms | ███  6
  23 ms | ████  8
  24 ms | █  2
  25 ms |   1
  28 ms |   1
  30 ms | ██████  12
  31 ms | ████████████████████████  50
  32 ms | █████████████████  36
  33 ms | ████████████████████████████████████████  84
  34 ms | ████████████████████  42
  35 ms | █████████████████████████████  60
  36 ms | ███████████  24
  37 ms | ████████  17
  38 ms | ██████  12
  39 ms | ███████  15
  40 ms | ███████  15
  41 ms | ████████  16
  42 ms | ███████  15
  43 ms | ███████  15
  44 ms | ████████  16
  45 ms | ████████████  26
  46 ms | ███████  15
  47 ms | ██████  12
  48 ms | ██  5
  49 ms | ██  4
  50 ms |   1
  51 ms | █  2
  52 ms |   1
  53 ms |   1
  55 ms | █  2
  56 ms |   1
  57 ms |   1
  58 ms |   1
  59 ms |   1
  60 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `65.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.62`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `16.24`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.36`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `16.87`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `29.32`, min `16.61`, p50 `28.15`, p95 `50.20`, p99 `56.08`, 1%low `17.08`, 0.1%low `16.61`, std `8.77`

**Frame time (ms)**  avg `36.49`, p50 `35.52`, p95 `48.29`, p99 `56.40`, p99.9 `59.93`, max `60.20`

**Client tick (ms)**  avg `1.89`, p95 `2.64`, max `3.81`

**Memory**  start `2058 MB`, end `1220 MB`, peak `3242 MB`, GC `6 events / 47 ms`

**FPS over sampling window (ASCII):**

```
 35.9 |            █                                                                   
 35.0 |            █                              █                                    
 34.0 |            █  █                   █    █ ██                                    
 33.0 |   █        █  █  █  █             █    █ ██    █ █          █                  
 32.1 |   █        █  █  █  █  ██       █ █    █ ██    █ █ █   █    █                  
 31.1 |   █        ██ ██ ██ █ ███   █   █ █    █ ██    █ █ █ █ █  █ █ █                
 30.2 |   █       ███ ██ ██ █ ███ █ █ █ █ █    █ ███   █ ███ █ █  █ ███   █     █      
 29.2 |   █ ███   ███ ██ ████████ █ █ ███ █   ██ ███ █ █ ███ ███ ██ ███   ██  ███ █ █  
 28.3 |█  █ ███ █ ███ ███████████ █ █ ███ █ █ ██ ███ █ █ ███████ ██ ████ ███  ███ █ █ █
 27.3 |██████████████ ███████████████ ███ ██████ █████ █ ███████ ███████ ████ █████████
 26.4 |███████████████████████████████████████████████ █████████ ██████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms | █  1
  15 ms | █  1
  16 ms | █  1
  17 ms | ███  6
  18 ms | █████  8
  19 ms | ███████  12
  20 ms | ███████  12
  21 ms | ████████  13
  22 ms | ██  4
  23 ms | ██████  10
  24 ms | █  2
  28 ms | ██  3
  29 ms | █  1
  30 ms | ██████  10
  31 ms | ███████████████████  33
  32 ms | █████████████████  30
  33 ms | ████████████████████████████████████████  69
  34 ms | ████████████████████  34
  35 ms | ██████████████████████  38
  36 ms | ████████████  21
  37 ms | ████████████  21
  38 ms | █████████  16
  39 ms | ██████████  18
  40 ms | ██████  10
  41 ms | ██████  11
  42 ms | █████████  15
  43 ms | █████████████  23
  44 ms | ███████████████  26
  45 ms | ██████████████  24
  46 ms | ██████████████  24
  47 ms | ███████████  19
  48 ms | █████  9
  49 ms | ████  7
  50 ms | ██  3
  51 ms | ██  3
  53 ms | █  2
  55 ms | █  2
  57 ms | ██  3
  58 ms | █  1
  59 ms | █  1
  60 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `33.00`
- `falling_blocks_landed` = `3724.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `27.40`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `16.61`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.48`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `17.08`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `28.45`, min `19.66`, p50 `29.18`, p95 `43.29`, p99 `48.71`, 1%low `20.39`, 0.1%low `19.66`, std `5.58`

**Frame time (ms)**  avg `36.27`, p50 `34.27`, p95 `46.41`, p99 `48.30`, p99.9 `50.05`, max `50.86`

**Client tick (ms)**  avg `0.67`, p95 `0.84`, max `1.03`

**Memory**  start `1234 MB`, end `1818 MB`, peak `3230 MB`, GC `5 events / 33 ms`

**FPS over sampling window (ASCII):**

```
 32.5 |        █              █                                                        
 31.9 |        █     █ █      █                                                        
 31.2 |        █     █ █      █                                             █          
 30.6 |        █     █ █ █    █      █ █                                  █ █          
 30.0 |     █  ██    █ ███    █   █  █ █            █    ██ █    █    █   █ █        █ 
 29.3 |     █  ██    █ ███ █  █   █  ███   █ █      █    ██ █    █    █   █ █ █     ██ 
 28.7 |█    █████  █ █ ███ ██ █   █  ███   ███      █    ██ █  █ █  █ ██  █ ████  ████ 
 28.1 |██   █████  █ █ ██████ █   █  ████ ████      █ ██ ██ ██ ███ ██ ██  █ █████ █████
 27.4 |██████████ ████ ██████ █████  ████ ██████ ██ ████ ██ ██ ██████████████████ █████
 26.8 |██████████ ████ ██████ █████  ███████████████████ ██████████████████████████████
 26.1 |█████████████████████████████ ███████████████████ ██████████████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  4
  20 ms | █  5
  21 ms | ████  12
  22 ms | █  5
  23 ms | █  5
  24 ms |   1
  30 ms |   1
  31 ms | █  4
  32 ms | ██████████████████████  73
  33 ms | ████████████████████████████████████████  135
  34 ms | █████████████████  59
  35 ms | █████████  30
  36 ms | ███████  22
  37 ms | █████  16
  38 ms | ███  11
  39 ms | ███  11
  40 ms | ██████  21
  41 ms | ███████  22
  42 ms | █████  18
  43 ms | █████  17
  44 ms | ███████  24
  45 ms | ████  14
  46 ms | ██████  21
  47 ms | ███  10
  48 ms | ██  7
  49 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `20.39`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.57`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `19.66`
- `seed` = `5099.00`
- `preload_duration_ms` = `63.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `28.41`, min `19.40`, p50 `29.42`, p95 `31.75`, p99 `47.49`, 1%low `20.22`, 0.1%low `19.40`, std `5.20`

**Frame time (ms)**  avg `36.18`, p50 `33.99`, p95 `46.22`, p99 `48.58`, p99.9 `50.51`, max `51.56`

**Client tick (ms)**  avg `0.28`, p95 `0.35`, max `0.70`

**Memory**  start `1276 MB`, end `2032 MB`, peak `3226 MB`, GC `5 events / 38 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |                                    █                                           
 32.7 |                                    █                                           
 32.0 |                                    █                                           
 31.2 |             █          █           █      █   █                      █         
 30.5 |█         █  █    █ █   █           █      █   █     █            █   █   █     
 29.8 |█    █  █ █  █    █ ██ ███       █  █      ██  █     █            █   █   █    █
 29.0 |█    ██ █ ██ █    ████████ █     ██ █      ██  ██    █   █        █   █   █ ██ █
 28.3 |█ █  ██ █ ██ █    ████████ ██    ██ ███ ██ ██  ██ █  ██ ██ █  █   █  ██ █ █ ██ █
 27.6 |█████████ ██ ██ █ ████████ ████  ██ ███ ██████ ██ ██ ██ ██ ████  ██ ███████ ████
 26.8 |████████████ ██ ████████████████ ██████ ███████████████████████████████████ ████
 26.1 |████████████████████████████████ ███████████████████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   2
  20 ms | █  3
  21 ms | ████  19
  22 ms | █  3
  31 ms |   2
  32 ms | ████████  41
  33 ms | ████████████████████████████████████████  208
  34 ms | ████████  42
  35 ms | █████  28
  36 ms | ████  19
  37 ms | ██  11
  38 ms | ████  19
  39 ms | ███  16
  40 ms | ████  19
  41 ms | ████  21
  42 ms | ███  16
  43 ms | ███  17
  44 ms | ███  16
  45 ms | ████  21
  46 ms | ██  12
  47 ms | ██  8
  48 ms | █  7
  49 ms |   2
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `19.40`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `33.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `20.22`
- `fps_harmonic_avg` = `27.64`
- `neighbour_updates` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `28.16`, min `19.67`, p50 `28.79`, p95 `31.45`, p99 `47.47`, 1%low `20.30`, 0.1%low `19.67`, std `4.91`

**Frame time (ms)**  avg `36.43`, p50 `34.74`, p95 `46.27`, p99 `48.04`, p99.9 `50.62`, max `50.84`

**Client tick (ms)**  avg `0.28`, p95 `0.35`, max `0.67`

**Memory**  start `1489 MB`, end `2698 MB`, peak `3267 MB`, GC `5 events / 38 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |                                                         █                      
 32.4 |                                                         █                      
 31.7 |                                                         █                  █   
 31.1 |                          █                              █                  █  █
 30.4 |                          █                █   █        ██             █    █  █
 29.7 |     █      █             █  █      █      ██  █        ██             █ █  █  █
 29.0 |     █    █ █        █    █  █      █      ██ ██     █  ██  █          █ █  █  █
 28.4 | █  ██    █ █   █  █ █ █  █  ██  █  ████ █ ██ ██     █  ██ ██  █   █   █ ██ ██ █
 27.7 | ██ ███  ████ █ █  █████ ██  ██  ██ █████████ ███ █  █  ██ ███ ██ ██  ██ ██ ████
 27.0 | ████████████ ████ ██████████████████████████████ ██ ███████████████████ ██ ████
 26.3 | ███████████████████████████████████████████████████ ███████████████████████████
 25.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  4
  21 ms | ███  14
  22 ms | █  3
  26 ms |   1
  31 ms | ██  8
  32 ms | █████████  39
  33 ms | ████████████████████████████████████████  170
  34 ms | ████████████  50
  35 ms | ████████  35
  36 ms | ██████  25
  37 ms | █████  20
  38 ms | █████  20
  39 ms | █████  22
  40 ms | ███  13
  41 ms | ████  18
  42 ms | ██████  26
  43 ms | ███  12
  44 ms | █████  20
  45 ms | ████  19
  46 ms | ███  12
  47 ms | ███  11
  48 ms | █  4
  50 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `19.67`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `27.45`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.30`
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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `28.51`, min `15.05`, p50 `28.88`, p95 `44.06`, p99 `48.39`, 1%low `18.79`, 0.1%low `15.05`, std `5.57`

**Frame time (ms)**  avg `36.20`, p50 `34.62`, p95 `45.89`, p99 `48.19`, p99.9 `61.50`, max `66.46`

**Client tick (ms)**  avg `0.31`, p95 `0.41`, max `0.69`

**Memory**  start `1426 MB`, end `2638 MB`, peak `3262 MB`, GC `5 events / 42 ms`

**FPS over sampling window (ASCII):**

```
 32.5 |                               █                                              █ 
 31.8 |       █                       █                                     █        █ 
 31.2 |       █                     █ █        █ █                  █   █   █        █ 
 30.6 |  █ █ ████             █     █ █ █    ███ █         █        █   ██  █      █ █ 
 29.9 |  █ █ ████             █    ██ █ █    ███ █         █        █   ██  █      █ █ 
 29.3 |  █ █ ████          █  █  █ ██ █ █    ███ █     █   █ █      █   ██  █  █  ██ █ 
 28.7 | ████ ████        ███  ██ █ ██ █ █    █████  █ ██   █ █    █ █   ██ ██  █  ██ █ 
 28.1 | █████████   █ █  ███  ██ █ ██ ███   ███████ █████  ███  █ █ ██  ██ ██  █  ██ █ 
 27.4 |████████████ █ ██████████ █ ██ ███   ███████████████████ █ █ ███ ██ █████████ ██
 26.8 |████████████ █ ████████████ ██ ████ ██████████████████████ █ ███ ██ ████████████
 26.2 |██████████████ █████████████████████████████████████████████████████████████████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  3
  20 ms | █  4
  21 ms | ████  16
  22 ms | ██  6
  23 ms | █  2
  29 ms |   1
  30 ms | ███  10
  31 ms | ███  12
  32 ms | ███████  28
  33 ms | ████████████████████████████████████████  151
  34 ms | ████████████████  61
  35 ms | ██████████  39
  36 ms | ████████  30
  37 ms | ████  16
  38 ms | ████  16
  39 ms | ████  16
  40 ms | ████  15
  41 ms | █████  18
  42 ms | █████  20
  43 ms | ████  16
  44 ms | █████  20
  45 ms | ██████  24
  46 ms | ██  7
  47 ms | ███  11
  48 ms | █  5
  49 ms | █  2
  57 ms |   1
  66 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `18.79`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `27.63`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `15.05`
- `seed` = `4027.00`
- `preload_duration_ms` = `42.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `28.29`, min `17.09`, p50 `28.14`, p95 `42.42`, p99 `49.95`, 1%low `18.28`, 0.1%low `17.09`, std `5.76`

**Frame time (ms)**  avg `36.49`, p50 `35.53`, p95 `46.19`, p99 `49.45`, p99.9 `57.51`, max `58.53`

**Client tick (ms)**  avg `0.29`, p95 `0.37`, max `0.56`

**Memory**  start `2576 MB`, end `2806 MB`, peak `3844 MB`, GC `6 events / 73 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |█                                                                               
 32.2 |█                                                                               
 31.6 |█                                                      █                        
 30.9 |██          █               █                          █               █        
 30.3 |███   █ █   █               █     █                    █  █  █         █        
 29.7 |███ █ █ █ █ █               █   █ █     █              █  █  █         █       █
 29.0 |███ █ █ █ █ ██    █  █  █   █  ██ ██    █  █  █  █     █  ██ █  █  █   █  █    █
 28.4 |███ █ █ █ █ ████  █  █ ██   █  ██ ██    █  █  █  █ █   █  ██ ███████   █  █    █
 27.8 |███ ███ █ █ ████ ██  ████ █ █ ███ ███ ███  █  ██ ████ ██ ███ ████████  █ ██  █ █
 27.2 |███ █████████████████████ █ █████ ███ ██████ ████████ ██ ███ █████████ █ ██ ██ █
 26.5 |███ █████████████████████ ███████████████████████████ ██ █████████████ ████ ██ █
 25.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  17 ms | █  4
  19 ms |   1
  20 ms | █  4
  21 ms | ██  7
  22 ms | ██  5
  23 ms | ███  9
  25 ms |   1
  26 ms |   1
  30 ms |   1
  31 ms | █  2
  32 ms | █████████████████  58
  33 ms | ████████████████████████████████████████  133
  34 ms | ██████████  33
  35 ms | ████████  27
  36 ms | ███████████████  49
  37 ms | █████████  29
  38 ms | ██████  20
  39 ms | █████  17
  40 ms | █████  15
  41 ms | ███████  24
  42 ms | ██████  20
  43 ms | ████████  25
  44 ms | █████  16
  45 ms | ████  14
  46 ms | ████  13
  47 ms | ███  10
  48 ms |   1
  49 ms | █  4
  53 ms |   1
  55 ms |   1
  56 ms |   1
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `7039.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `trees_built` = `64.00`
- `fps_harmonic_avg` = `27.40`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `18.28`
- `fps_0p1pct_low` = `17.09`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `47.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`
- `leaf_blocks` = `7642.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23130 ms  |  Sample ticks: 400

**FPS**  avg `30.72`, min `11.42`, p50 `28.07`, p95 `56.39`, p99 `89.05`, 1%low `13.13`, 0.1%low `11.42`, std `14.80`

**Frame time (ms)**  avg `37.27`, p50 `35.63`, p95 `59.46`, p99 `66.41`, p99.9 `83.69`, max `87.55`

**Client tick (ms)**  avg `0.48`, p95 `0.74`, max `8.08`

**Memory**  start `2302 MB`, end `2827 MB`, peak `3866 MB`, GC `24 events / 223 ms`

**FPS over sampling window (ASCII):**

```
 47.7 |                                         █                                      
 45.6 |                                         █                                      
 43.4 |       █                    █            █                                      
 41.3 |       █       █            █            █                                      
 39.1 |       █       █  █         █            █                                      
 36.9 |       █   █   █  █         █            █                                      
 34.8 |       █ █ █   █ ██         █  █       █ █ █            █                       
 32.6 |   ██  █ █ █ █ █ ██         █  █       ███ █    ██  █   ███ ███         █     ██
 30.5 | █ ███ █ ███ ███ ██    █   ██  ██ █    ███ █    ██  ███ ███ ████    █████  █  ██
 28.3 | ███████████████ █████████ ██  ████ ██ █████ █ ████████ ████████  ████████ ██ ██
 26.2 |█████████████████████████████████████████████████████████████████████████████ ██
 24.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  1
   7 ms | █  1
   8 ms | █  1
   9 ms | ██  2
  10 ms | █  1
  12 ms | █  1
  13 ms | █████  5
  15 ms | █████  5
  16 ms | █  1
  17 ms | █████████████  12
  18 ms | ███  3
  19 ms | ██████  6
  20 ms | ████  4
  21 ms | ██████████  9
  22 ms | █████████████  12
  23 ms | ████████████  11
  24 ms | ████████████████  15
  25 ms | █████  5
  26 ms | ███  3
  27 ms | █████████  8
  28 ms | ███████████  10
  29 ms | ████████████  11
  30 ms | █████████████  12
  31 ms | █████████████████  16
  32 ms | ██████████████████████████████  28
  33 ms | ████████████████████████████████████████  37
  34 ms | ████████████████████████████████████████  37
  35 ms | ██████████████████████  20
  36 ms | ██████████████████████████  24
  37 ms | ██████████████  13
  38 ms | ██████████████  13
  39 ms | ███████████  10
  40 ms | ███████████████████████  21
  41 ms | ███████████████  14
  42 ms | █████████  8
  43 ms | █████████████  12
  44 ms | ████████████████  15
  45 ms | ███████████████  14
  46 ms | █████████████████████  19
  47 ms | █████████████  12
  48 ms | ██████  6
  49 ms | ████  4
  50 ms | ███  3
  51 ms | ████  4
  52 ms | ████  4
  53 ms | ████████  7
  54 ms | ████████  7
  55 ms | ██████  6
  56 ms | ███  3
  57 ms | ██████  6
  58 ms | ████████  7
  59 ms | ███  3
  60 ms | ███  3
  61 ms | ████████  7
  62 ms | █  1
  63 ms | ████  4
  64 ms | █  1
  65 ms | ██  2
  66 ms | ██  2
  67 ms | █  1
  71 ms | █  1
  74 ms | █  1
  80 ms | █  1
  87 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `13.13`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `66.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `11.42`
- `seed` = `7411.00`
- `preload_duration_ms` = `18.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-14.00`
- `entity_count_sample_start` = `15.00`
- `x_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23503 ms  |  Sample ticks: 400

**FPS**  avg `30.62`, min `10.52`, p50 `28.26`, p95 `56.56`, p99 `75.84`, 1%low `12.30`, 0.1%low `10.52`, std `13.66`

**Frame time (ms)**  avg `37.79`, p50 `35.39`, p95 `62.17`, p99 `70.09`, p99.9 `87.79`, max `95.02`

**Client tick (ms)**  avg `0.44`, p95 `0.73`, max `2.44`

**Memory**  start `3098 MB`, end `2832 MB`, peak `3875 MB`, GC `32 events / 283 ms`

**FPS over sampling window (ASCII):**

```
 44.0 |                           █                                                    
 42.1 |                           █                █                                   
 40.2 |                           █ █              █  █                                
 38.3 |                           █ █              █  █                     █          
 36.3 |█                          █ █   █          █  █               █     █          
 34.4 |█           █   █          █ █   █   █      █  █       █   █   █     █      █ █ 
 32.5 |█        █  █ █ ██    █  █ █ █   █ █ █ █    █  █  █ █  █   █   ██    █      █ █ 
 30.6 |█     █  █  █ ████  ███ ██ █ █ █ █ █████ ██ █ ███ █ █  █  ████ ██ █████ ██  █ █ 
 28.7 |██ █████ █ ██ █████ ████████ ███ ██████████ █ ███ █ █ ███ ████ ██ █████ █████ █ 
 26.8 |████████ ██████████████████████████████████████████ █████ ████ ████████ █████ ██
 24.8 |████████ █████████████████████████████████████████████████████ █████████████████
 22.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | █  1
   9 ms | ██  2
  10 ms | █  1
  12 ms | ██  2
  14 ms | ███████  6
  15 ms | █████  4
  16 ms | ████████  7
  17 ms | ██████  5
  18 ms | █████████  8
  19 ms | ███████  6
  20 ms | █████████████  11
  21 ms | ███████████  9
  22 ms | ████████████  10
  23 ms | ██████████████████  15
  24 ms | █████████  8
  25 ms | ████████████████  14
  26 ms | ████████  7
  27 ms | █████████  8
  28 ms | █████████  8
  29 ms | █████████  8
  30 ms | ██████████████████  15
  31 ms | ████████████████████████  20
  32 ms | ███████████████████████████████  26
  33 ms | ███████████████████████████  23
  34 ms | ████████████████████████████████████████  34
  35 ms | ████████████████████████  20
  36 ms | ██████████████████  15
  37 ms | ███████████████  13
  38 ms | ██████████████  12
  39 ms | ████████████  10
  40 ms | ██████████████  12
  41 ms | ████████████  10
  42 ms | █████████████  11
  43 ms | ████████████  10
  44 ms | █████████████  11
  45 ms | ████████████  10
  46 ms | ████████  7
  47 ms | █████  4
  48 ms | ████████████  10
  49 ms | █████████████  11
  50 ms | ███████████  9
  51 ms | ██████  5
  52 ms | ██████████████  12
  53 ms | ██████████████  12
  54 ms | ███████  6
  55 ms | ███████  6
  56 ms | ██████  5
  57 ms | █████  4
  58 ms | ██████  5
  59 ms | █████  4
  60 ms | ███████  6
  61 ms | ██  2
  62 ms | ██████  5
  63 ms | ██████  5
  64 ms | ██  2
  65 ms | █████████  8
  69 ms | ██  2
  70 ms | █  1
  74 ms | █  1
  77 ms | ██  2
  81 ms | █  1
  95 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:jungle`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `12.30`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.46`
- `part` = `1.00`
- `fps_0p1pct_low` = `10.52`
- `seed` = `7417.00`
- `preload_duration_ms` = `437.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `30.66`, min `11.48`, p50 `28.14`, p95 `54.06`, p99 `71.80`, 1%low `12.72`, 0.1%low `11.48`, std `13.70`

**Frame time (ms)**  avg `37.40`, p50 `35.54`, p95 `59.37`, p99 `68.27`, p99.9 `84.54`, max `87.12`

**Client tick (ms)**  avg `0.39`, p95 `0.65`, max `2.50`

**Memory**  start `3353 MB`, end `3576 MB`, peak `3872 MB`, GC `27 events / 235 ms`

**FPS over sampling window (ASCII):**

```
 46.7 |                                                                              █ 
 44.7 |                            █                                                 █ 
 42.8 |                            █                                                 █ 
 40.8 |                            █                                                 █ 
 38.8 |                            █      █                                          █ 
 36.8 |                   █        █      █     █               █                    █ 
 34.9 |█                  █ █      █ █    █     █               █    █               █ 
 32.9 |█     █        █   █ █  ██ ██ ██   █   █ █     █  ██   █ ██   █       █       █ 
 30.9 |██    █        █   █ █  █████ ██   █ █ █ █  █  █ ███   ████ █ ██ █  █████     ██
 29.0 |██ ██ █  ██ ██ ██ ██ █  █████ ███ ██ █ ████ █  █ ███ ██████ █ ████  ████████ ███
 27.0 |██ ████████ █████ ████ █████████████████████████████████████████████████████████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | ███  2
  11 ms | █  1
  12 ms | ███  2
  13 ms | █  1
  14 ms | ███  2
  15 ms | ██████  5
  16 ms | ██████████  8
  17 ms | █████  4
  18 ms | █████  4
  19 ms | ███████████████  12
  20 ms | █████████████████  13
  21 ms | ███████████████  12
  22 ms | ████████  6
  23 ms | ███████████████████  15
  24 ms | ███████████████  12
  25 ms | ██████████████████  14
  26 ms | █████  4
  27 ms | █████████  7
  28 ms | ██████  5
  29 ms | █████████████  10
  30 ms | █████████████  10
  31 ms | ██████████████████████████████  23
  32 ms | ████████████████████████████████████  28
  33 ms | ████████████████████████████████████████  31
  34 ms | ██████████████████████████████  23
  35 ms | ██████████████████████████████  23
  36 ms | ███████████████████████  18
  37 ms | █████████████████  13
  38 ms | ██████████████████████  17
  39 ms | █████████████  10
  40 ms | ████████████  9
  41 ms | ████████████  9
  42 ms | ██████████████  11
  43 ms | ██████████████████  14
  44 ms | ████████████  9
  45 ms | █████████████████████████  19
  46 ms | ███████████████████████  18
  47 ms | ███████████████  12
  48 ms | ██████  5
  49 ms | █████████  7
  50 ms | ██████  5
  51 ms | █████  4
  52 ms | ███  2
  53 ms | ██████████  8
  54 ms | ██████████  8
  55 ms | ████████  6
  56 ms | ██████  5
  57 ms | ████████  6
  58 ms | ███████████████  12
  59 ms | █████████  7
  60 ms | ██████  5
  61 ms | █████  4
  63 ms | ███  2
  64 ms | █  1
  65 ms | ███  2
  67 ms | ████  3
  68 ms | █  1
  74 ms | ████  3
  82 ms | █  1
  87 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:desert`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `12.72`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.74`
- `part` = `1.00`
- `fps_0p1pct_low` = `11.48`
- `seed` = `7433.00`
- `preload_duration_ms` = `36.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `30.62`, min `13.33`, p50 `28.30`, p95 `50.24`, p99 `91.46`, 1%low `13.67`, 0.1%low `13.33`, std `16.72`

**Frame time (ms)**  avg `37.45`, p50 `35.33`, p95 `58.34`, p99 `67.14`, p99.9 `74.96`, max `75.01`

**Client tick (ms)**  avg `0.43`, p95 `0.61`, max `4.18`

**Memory**  start `3710 MB`, end `3698 MB`, peak `3881 MB`, GC `31 events / 265 ms`

**FPS over sampling window (ASCII):**

```
 60.9 |   █                                                                            
 57.6 |   █                                                                            
 54.3 |   █                                                                            
 50.9 |   █                                                                            
 47.6 |   █                  █                                                 █      █
 44.3 |   █                  █                                                 █      █
 40.9 |   █                  █                       █                         █      █
 37.6 |   █                  █                       █                      █ ██      █
 34.2 |   █  █         █  █  █                       █                  █  ██ ██  █   █
 30.9 |   █ ███ █ █ █  ████  █  █ █ ███████    █ ██ ██ █  ██ █ █ ██ ██  ██ ██ █████ █ █
 27.6 |█ ██████ █████ ███████████████████████████████████ █████████████████████████ ███
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   6 ms | █  1
   7 ms | ███  3
  10 ms | █  1
  12 ms | █  1
  14 ms | ██  2
  15 ms | ███  3
  16 ms | █████  5
  17 ms | ███  3
  18 ms | █  1
  19 ms | ███████  7
  20 ms | ████████████  13
  21 ms | █████  5
  22 ms | █████████████████  18
  23 ms | █████████████  14
  24 ms | ███████  8
  25 ms | ██████  6
  26 ms | ██████  6
  27 ms | █████  5
  28 ms | █████████  10
  29 ms | ██████  6
  30 ms | ████████  9
  31 ms | ███████████████████████████  29
  32 ms | █████████████████████████████  31
  33 ms | ████████████████████████████████████████  43
  34 ms | █████████████████████████  27
  35 ms | ███████████████████  20
  36 ms | ████████████  13
  37 ms | █████████  10
  38 ms | ██████████████  15
  39 ms | █████████████  14
  40 ms | ██████████████  15
  41 ms | █████████  10
  42 ms | ██████████████  15
  43 ms | █████████████████  18
  44 ms | ███████  8
  45 ms | ████████  9
  46 ms | ██████████████████  19
  47 ms | ███████████  12
  48 ms | █████████████████  18
  49 ms | ██████  6
  50 ms | ██  2
  51 ms | ██████████  11
  52 ms | ███████  8
  53 ms | ███████  7
  54 ms | ████  4
  55 ms | █  1
  56 ms | ███████  7
  57 ms | █████  5
  58 ms | ███  3
  59 ms | █████  5
  60 ms | ██  2
  61 ms | ███  3
  62 ms | ███  3
  63 ms | ██  2
  64 ms | ██  2
  65 ms | ██  2
  66 ms | █  1
  67 ms | █  1
  69 ms | █  1
  71 ms | █  1
  74 ms | ██  2
  75 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:taiga`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `13.67`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `74.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.70`
- `part` = `1.00`
- `fps_0p1pct_low` = `13.33`
- `seed` = `7451.00`
- `preload_duration_ms` = `62.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-11.00`
- `entity_count_sample_start` = `12.00`
- `x_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `30.97`, min `12.29`, p50 `28.12`, p95 `52.84`, p99 `85.49`, 1%low `13.64`, 0.1%low `12.29`, std `15.83`

**Frame time (ms)**  avg `37.07`, p50 `35.56`, p95 `58.63`, p99 `68.11`, p99.9 `77.00`, max `81.36`

**Client tick (ms)**  avg `0.44`, p95 `0.65`, max `6.98`

**Memory**  start `3741 MB`, end `3711 MB`, peak `3877 MB`, GC `35 events / 265 ms`

**FPS over sampling window (ASCII):**

```
 50.3 |                                           █                                    
 47.8 |                                           █                                    
 45.4 |                                           █                     █              
 42.9 |                                           █                     █              
 40.5 |                                           █                     █              
 38.0 |                            █              █                     █           █  
 35.6 |          █                 █  █           █                 █  ██           ██ 
 33.1 |█       █ █  █              ██ █  █ █    █ █ ██         █ ████  ███         ███ 
 30.7 |█ █ ██  █ ████ █  █  ██  ██ ██ █  █ █    █ █████    █ ████████  ███ █  ███  ████
 28.2 |█████████ ████ ████████████ ██ ██████████████████ █████████████████ ████████████
 25.8 |█████████ ██████████████████████████████████████████████████████████████████████
 23.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | ██  2
   6 ms | █  1
   7 ms | █  1
   8 ms | █  1
  11 ms | █  1
  12 ms | █  1
  14 ms | ███  3
  15 ms | ██  2
  16 ms | ██████  6
  17 ms | ██████  6
  18 ms | ████  4
  19 ms | █████████████████  17
  20 ms | ███████████  11
  21 ms | ███████  7
  22 ms | ███████████  11
  23 ms | ████████████  12
  24 ms | ██████████  10
  25 ms | █████  5
  26 ms | ███████  7
  27 ms | █████  5
  28 ms | ███  3
  29 ms | █████  5
  30 ms | ██████████████  14
  31 ms | █████████████████████████  25
  32 ms | █████████████████████████  25
  33 ms | ████████████████████████████████████████  40
  34 ms | ██████████████████████████████  30
  35 ms | ████████████████████  20
  36 ms | ████████████████████████  24
  37 ms | ███████████  11
  38 ms | ███████████████  15
  39 ms | █████████████████  17
  40 ms | ██████████████  14
  41 ms | ███████████████  15
  42 ms | ███████████████  15
  43 ms | █████████████  13
  44 ms | ███████████████  15
  45 ms | ███████████████  15
  46 ms | ████████████████  16
  47 ms | ███████████  11
  48 ms | ███████  7
  49 ms | █████  5
  50 ms | ████  4
  51 ms | ██  2
  52 ms | █████  5
  53 ms | ████████  8
  54 ms | ██████  6
  55 ms | ████  4
  56 ms | █████  5
  57 ms | █████████  9
  58 ms | ████  4
  59 ms | ██████  6
  60 ms | ████  4
  61 ms | █  1
  62 ms | ███  3
  64 ms | ███  3
  66 ms | █  1
  67 ms | █  1
  68 ms | █  1
  69 ms | █  1
  71 ms | ██  2
  73 ms | █  1
  81 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:snowy_plains`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `13.64`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `26.98`
- `part` = `1.00`
- `fps_0p1pct_low` = `12.29`
- `seed` = `7457.00`
- `preload_duration_ms` = `58.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-14.00`
- `entity_count_sample_start` = `15.00`
- `x_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24393 ms  |  Sample ticks: 400

**FPS**  avg `9.74`, min `7.36`, p50 `9.76`, p95 `11.50`, p99 `12.83`, 1%low `7.40`, 0.1%low `n/a`, std `1.04`

**Frame time (ms)**  avg `103.81`, p50 `102.43`, p95 `122.06`, p99 `129.64`, p99.9 `135.60`, max `135.87`

**Client tick (ms)**  avg `0.51`, p95 `1.85`, max `9.17`

**Memory**  start `3785 MB`, end `3573 MB`, peak `3870 MB`, GC `41 events / 293 ms`

**FPS over sampling window (ASCII):**

```
 11.3 |                                                                              █ 
 11.1 |  █                                                                           █ 
 10.8 |  █                                                                 █         █ 
 10.5 |  █         █         █        █                █                   █         █ 
 10.3 |  █    ██   █  █      █     █  ██ █     █    █  █   █ █ ██         ██  █      █ 
 10.0 | █████████  █████  █  █     █  ██ █████ ███  █  ██  █ █ ███    █   ██  █ ██   █ 
  9.7 | ██████████ ██████ █  █ █ ███ ███ █████ ███  █  ███ █ █ ███   ██   ██  █ ███  █ 
  9.5 | ██████████ ████████  ███ ███ █████████████  ██ ███ █ █ ███  ████  ███ ██████ ██
  9.2 | ██████████ ████████ ████ █████████████████ ███ ███████ ██████████ ███ ██████ ██
  8.9 | ██████████ █████████████ █████████████████ ███████████ ██████████ ███ ██████ ██
  8.7 |███████████ ████████████████████████████████████████████████████████████████████
  8.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  71 ms | ███  1
  77 ms | ██████  2
  80 ms | ██████  2
  81 ms | ███  1
  82 ms | ███  1
  84 ms | ███  1
  85 ms | ███  1
  86 ms | ███  1
  87 ms | ██████  2
  88 ms | ██████  2
  89 ms | ███████████  4
  90 ms | █████████  3
  91 ms | ██████  2
  92 ms | ██████  2
  93 ms | ███████████  4
  94 ms | ██████  2
  95 ms | ███████████  4
  96 ms | █████████████████  6
  97 ms | ████████████████████  7
  98 ms | ████████████████████  7
  99 ms | █████████████████████████████  10
 100 ms | ███████████████████████████████  11
 101 ms | ████████████████████████████████████████  14
 102 ms | █████████████████████████████  10
 103 ms | ████████████████████████████████████████  14
 104 ms | ███████████  4
 105 ms | ██████████████  5
 106 ms | █████████  3
 107 ms | ██████████████  5
 108 ms | ██████████████  5
 109 ms | ████████████████████  7
 110 ms | █████████  3
 111 ms | ██████████████  5
 112 ms | ███████████████████████  8
 113 ms | █████████  3
 114 ms | ███  1
 115 ms | █████████  3
 116 ms | █████████  3
 117 ms | ██████  2
 118 ms | █████████  3
 119 ms | █████████████████  6
 121 ms | ███  1
 122 ms | █████████  3
 123 ms | ███  1
 124 ms | ███  1
 126 ms | ███  1
 128 ms | ███  1
 129 ms | ██████  2
 134 ms | ███  1
 135 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:forest`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.40`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.63`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7477.00`
- `preload_duration_ms` = `1377.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23037 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `7.08`, p50 `9.92`, p95 `11.48`, p99 `13.14`, 1%low `7.15`, 0.1%low `n/a`, std `1.00`

**Frame time (ms)**  avg `102.78`, p50 `100.81`, p95 `123.88`, p99 `134.20`, p99.9 `140.67`, max `141.22`

**Client tick (ms)**  avg `0.52`, p95 `1.46`, max `5.75`

**Memory**  start `3856 MB`, end `3353 MB`, peak `3875 MB`, GC `47 events / 294 ms`

**FPS over sampling window (ASCII):**

```
 11.6 |      █                                                                         
 11.3 |      █                                                                         
 10.9 |      █               █                                         █ █  █          
 10.6 |      █  █            █                          █              █ █  █          
 10.3 |      █  █            █     █      █      █  █   █        █     █ █  █      █   
 10.0 |█ ██  █  █████ █   █  █████ █    █ ██████ ██ █████ █ █ █ ██  ██ █ ████ ██  ████ 
  9.7 |████ ██ ████████  ███ █████ ███ ████████████ █████ █████████ ██ █ ███████  ████ 
  9.4 |████ ██ █████████ ██████████████████████████ █████ █████████ ██ █ █████████████ 
  9.0 |███████ ████████████████████████████████████ █████ █████████ ██ █ █████████████ 
  8.7 |████████████████████████████████████████████ ██████████████████ █ █████████████ 
  8.4 |████████████████████████████████████████████ ███████████████████████████████████
  8.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  67 ms | ██  1
  73 ms | ██  1
  76 ms | ██  1
  80 ms | ██  1
  82 ms | ████  2
  83 ms | ██  1
  84 ms | ██  1
  85 ms | ██  1
  86 ms | ██  1
  87 ms | ██  1
  89 ms | ██  1
  90 ms | ██  1
  91 ms | ██  1
  92 ms | ████  2
  93 ms | ███████████  5
  94 ms | █████████████  6
  95 ms | ██  1
  96 ms | ████████████████████████  11
  97 ms | ██████████████████████  10
  98 ms | ██████████████████████████████████████  17
  99 ms | ████████████████████████████████████████  18
 100 ms | ████████████████████████████████████  16
 101 ms | ████████████████████████  11
 102 ms | ██████████████████████  10
 103 ms | ████████████████████  9
 104 ms | ████████████████  7
 105 ms | █████████  4
 106 ms | ███████████  5
 107 ms | ██████████████████  8
 108 ms | ███████  3
 109 ms | ███████████  5
 110 ms | ████  2
 111 ms | ████  2
 112 ms | ████  2
 113 ms | ██  1
 114 ms | ███████  3
 115 ms | ██  1
 116 ms | ██  1
 117 ms | ███████  3
 118 ms | ███████  3
 120 ms | ██  1
 122 ms | ██  1
 123 ms | ███████  3
 125 ms | ██  1
 126 ms | ████  2
 128 ms | ██  1
 129 ms | ██  1
 131 ms | ██  1
 133 ms | ██  1
 138 ms | ██  1
 141 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.15`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `68.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.73`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `97.00`
- `entity_count_sample_end` = `19.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `14.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25232 ms  |  Sample ticks: 400

**FPS**  avg `9.83`, min `6.94`, p50 `9.86`, p95 `11.30`, p99 `13.51`, 1%low `7.28`, 0.1%low `n/a`, std `1.67`

**Frame time (ms)**  avg `103.38`, p50 `101.42`, p95 `124.33`, p99 `129.65`, p99.9 `141.48`, max `144.10`

**Client tick (ms)**  avg `0.51`, p95 `1.38`, max `9.09`

**Memory**  start `3033 MB`, end `3694 MB`, peak `3843 MB`, GC `52 events / 286 ms`

**FPS over sampling window (ASCII):**

```
 17.8 |                                                                      █         
 17.0 |                                                                      █         
 16.1 |                                                                      █         
 15.3 |                                                                      █         
 14.5 |                                                                      █         
 13.6 |                                                                      █         
 12.8 |                                                                      █         
 11.9 |                                                          █           █         
 11.1 |                                                          █           █        █
 10.2 | ████████  ██ █ █ █ █ ███  ████ ███ █ ██ ██    ██ █ █   █ ██  █  █    ██ █     █
  9.4 |█████████████████████████████████████████████████ ███ ███ ██ ██████████████ ████
  8.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  34 ms | ██  1
  73 ms | ██  1
  74 ms | ██  1
  82 ms | ██  1
  83 ms | ██  1
  84 ms | █████  2
  85 ms | █████  2
  87 ms | ██  1
  89 ms | ███████  3
  90 ms | █████  2
  91 ms | ███████  3
  93 ms | ███████  3
  94 ms | █████████  4
  95 ms | ████████████████  7
  96 ms | ████████████████████████  10
  97 ms | █████████  4
  98 ms | ███████████████████████████████  13
  99 ms | ███████████████████████████████  13
 100 ms | ████████████████████████████████████████  17
 101 ms | ██████████████████████████  11
 102 ms | ██████████████  6
 103 ms | ██████████████████████████  11
 104 ms | ████████████████  7
 105 ms | ████████████  5
 106 ms | ████████████  5
 107 ms | █████████  4
 108 ms | ███████████████████  8
 109 ms | ████████████  5
 110 ms | ███████  3
 111 ms | ███████  3
 112 ms | █████████  4
 113 ms | ████████████  5
 114 ms | ██  1
 115 ms | ████████████  5
 116 ms | ███████  3
 117 ms | ██  1
 119 ms | ██  1
 120 ms | ██  1
 121 ms | ██  1
 122 ms | █████  2
 123 ms | ██  1
 124 ms | █████████  4
 126 ms | █████  2
 127 ms | █████  2
 129 ms | ██  1
 130 ms | ██  1
 144 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.14`
- `fps_1pct_low` = `7.28`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.67`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `2294.00`
- `entity_count_sample_end` = `25.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-6.00`
- `entity_count_sample_start` = `31.00`
- `x_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23062 ms  |  Sample ticks: 400

**FPS**  avg `9.72`, min `7.24`, p50 `9.70`, p95 `11.15`, p99 `12.27`, 1%low `7.36`, 0.1%low `n/a`, std `0.88`

**Frame time (ms)**  avg `103.74`, p50 `103.04`, p95 `118.12`, p99 `130.40`, p99.9 `137.25`, max `138.10`

**Client tick (ms)**  avg `0.64`, p95 `2.09`, max `10.14`

**Memory**  start `3495 MB`, end `3804 MB`, peak `3841 MB`, GC `73 events / 329 ms`

**FPS over sampling window (ASCII):**

```
 11.6 |                       █                                                        
 11.3 |                       █                                                        
 11.0 |                       █                                                        
 10.7 |             █         █                                           █       █    
 10.4 |       █ █   █         █  █                                        ██      █    
 10.1 |  ██ █ █ █   █   █     █ ██  █     █ ██      █     █   █  █        ██    █ █  █ 
  9.8 |█ ██████ █   ██ ███    █ ███████  ███████  ██████  ██  █  █      █ ███ █ █ █  █ 
  9.5 |███████████ ████████   █ ███████  ███████  ██████  █████  █ █ █ ██ █████ █ █████
  9.3 |███████████ █████████  █ ████████████████ ███████ █████████ █ ████ █████████████
  9.0 |██████████████████████ █ ████████████████████████ █████████ ████████████████████
  8.7 |█████████████████████████████████████████████████ ██████████████████████████████
  8.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  74 ms | ███  1
  77 ms | ███  1
  81 ms | ███  1
  82 ms | ██████  2
  83 ms | ███  1
  86 ms | ██████  2
  88 ms | ██████  2
  90 ms | ██████  2
  91 ms | █████████  3
  92 ms | ███  1
  93 ms | ███████████  4
  94 ms | ███████████  4
  95 ms | ██████  2
  96 ms | ████████████████████  7
  97 ms | ███████████████████████  8
  98 ms | ███████████████████████████████  11
  99 ms | █████████████████████████████  10
 100 ms | ████████████████████████████████████████  14
 101 ms | ██████████████████████████  9
 102 ms | ███████████████████████████████  11
 103 ms | ██████████████████████████  9
 104 ms | █████████████████████████████████████  13
 105 ms | ███████████████████████  8
 106 ms | █████████████████  6
 107 ms | █████████████████████████████  10
 108 ms | ███████████████████████  8
 109 ms | █████████  3
 110 ms | ███████████  4
 111 ms | █████████████████  6
 112 ms | █████████  3
 113 ms | █████████  3
 114 ms | ███████████  4
 115 ms | ███████████  4
 116 ms | █████████  3
 117 ms | ██████  2
 118 ms | ██████  2
 120 ms | ███  1
 121 ms | ███  1
 123 ms | ███  1
 124 ms | ██████  2
 126 ms | ███  1
 130 ms | ███  1
 133 ms | ███  1
 138 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:cherry_grove`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.36`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `61.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.64`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7499.00`
- `preload_duration_ms` = `99.00`
- `entity_count_sample_end` = `7.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-25.00`
- `entity_count_sample_start` = `32.00`
- `x_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23658 ms  |  Sample ticks: 400

**FPS**  avg `9.80`, min `7.06`, p50 `9.86`, p95 `11.05`, p99 `13.01`, 1%low `7.08`, 0.1%low `n/a`, std `0.89`

**Frame time (ms)**  avg `102.89`, p50 `101.46`, p95 `121.74`, p99 `134.48`, p99.9 `141.50`, max `141.68`

**Client tick (ms)**  avg `0.43`, p95 `0.87`, max `4.74`

**Memory**  start `3771 MB`, end `3822 MB`, peak `3836 MB`, GC `78 events / 313 ms`

**FPS over sampling window (ASCII):**

```
 11.2 |                                                           █            █       
 10.9 |                                                           █       █    █       
 10.6 |                                                           █ █     █    █       
 10.4 |    █                 █   █                                █ █   █ █    █       
 10.1 |█ █ ████ █ ██      █  ██  █  █        ██ █ █  █ ██ █    █  █ █   █ █    █     █ 
  9.8 |███ ████ ████   ██ ██ ███ █ ███ ██ ██ ████████████ █ █  █  █ ██ ██ ██   █     ██
  9.5 |███████████████ ███████████████ █████ ████████████ ███ ██  ████ ██ ██ █ █    ███
  9.3 |██████████████████████████████████████████████████ ███ ██ █████ ██ ██████ ██ ███
  9.0 |██████████████████████████████████████████████████ ██████ ████████ █████████████
  8.7 |██████████████████████████████████████████████████ █████████████████████████████
  8.5 |██████████████████████████████████████████████████ █████████████████████████████
  8.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  75 ms | ██  1
  76 ms | ████  2
  79 ms | ██  1
  84 ms | ████  2
  85 ms | ██  1
  86 ms | ██  1
  88 ms | ████  2
  91 ms | ████  2
  92 ms | ████  2
  93 ms | █████  3
  94 ms | █████  3
  95 ms | ███████████████  8
  96 ms | █████  3
  97 ms | ██████████████████  10
  98 ms | █████████████████████████████  16
  99 ms | ████████████████████████████████████████  22
 100 ms | ████████████████████████  13
 101 ms | █████████████████████████  14
 102 ms | ███████████████████████████  15
 103 ms | ████████████████████████  13
 104 ms | ███████  4
 105 ms | ███████  4
 106 ms | █████████  5
 107 ms | ██████████████████  10
 108 ms | ███████  4
 109 ms | ███████  4
 110 ms | ████  2
 111 ms | ███████  4
 112 ms | ███████  4
 113 ms | ████  2
 114 ms | ████  2
 117 ms | ███████  4
 119 ms | ██  1
 121 ms | ██  1
 122 ms | ████  2
 124 ms | ██  1
 127 ms | ████  2
 128 ms | ██  1
 131 ms | ██  1
 134 ms | ██  1
 140 ms | ██  1
 141 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:badlands`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `7.08`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `58.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.72`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7507.00`
- `preload_duration_ms` = `616.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23039 ms  |  Sample ticks: 400

**FPS**  avg `9.75`, min `2.29`, p50 `9.77`, p95 `11.83`, p99 `13.36`, 1%low `3.42`, 0.1%low `n/a`, std `1.28`

**Frame time (ms)**  avg `105.24`, p50 `102.34`, p95 `122.42`, p99 `148.38`, p99.9 `382.19`, max `436.51`

**Client tick (ms)**  avg `0.57`, p95 `1.43`, max `10.56`

**Memory**  start `3582 MB`, end `3812 MB`, peak `3955 MB`, GC `106 events / 673 ms`

**FPS over sampling window (ASCII):**

```
 11.1 |█                                                                  █            
 10.8 |█                               █                                  █            
 10.6 |█                        █      █                             █    █            
 10.3 |█                █       █      █        ██               █   █    █     █      
 10.1 |██ █    █ █     ██ █ ███ █ █ █  █ ██     ██     █  █   █  █   █    █     █ █ █ █
  9.8 |██ ██  ████ █   ████████ █████  █ ███  █ ██  ████████  █  █   █ █  █  █  ███ █ █
  9.6 |█████  ██████   ████████ █████  █ ████ █ ████████████  █ ███  █ █  █  █  ███ █ █
  9.3 |█████████████   ██████████████  ██████ █████████████████ ████ █ ████  █  █████ █
  9.1 |███████████████████████████████ ████████████████████████ ████ █ ████ ██ ████████
  8.8 |███████████████████████████████ █████████████████████████████ █ ███████ ████████
  8.6 |███████████████████████████████ ███████████████████████████████ ████████████████
  8.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  61 ms | ██  1
  73 ms | ██  1
  75 ms | ██  1
  77 ms | ████  2
  81 ms | ████  2
  83 ms | ████  2
  84 ms | ████  2
  86 ms | ██  1
  87 ms | ████  2
  88 ms | ███████  3
  89 ms | ████  2
  91 ms | ████  2
  92 ms | ███████  3
  93 ms | ██  1
  94 ms | ███████████  5
  95 ms | ███████████  5
  96 ms | ███████████  5
  97 ms | ███████████  5
  98 ms | ███████████████████████████  12
  99 ms | ███████████  5
 100 ms | █████████████████████████████  13
 101 ms | ████████████████████████████████████████  18
 102 ms | ████████████████  7
 103 ms | █████████████████████████████████  15
 104 ms | █████████████  6
 105 ms | ████████████████████  9
 106 ms | ███████  3
 107 ms | █████████  4
 108 ms | █████████  4
 109 ms | █████████  4
 110 ms | █████████  4
 111 ms | ████  2
 112 ms | ███████  3
 113 ms | ███████████  5
 114 ms | █████████  4
 115 ms | █████████  4
 116 ms | ██  1
 117 ms | █████████  4
 118 ms | ████  2
 119 ms | ████  2
 120 ms | ███████  3
 122 ms | ████  2
 123 ms | ██  1
 124 ms | ████  2
 129 ms | ██  1
 131 ms | ██  1
 140 ms | ██  1
 148 ms | ██  1
 149 ms | ██  1
 436 ms | ██  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:dark_forest`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `3.42`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `59.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.50`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7517.00`
- `preload_duration_ms` = `100.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-40.00`
- `entity_count_sample_start` = `44.00`
- `x_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `9.69`, min `1.92`, p50 `9.74`, p95 `11.42`, p99 `13.34`, 1%low `2.19`, 0.1%low `n/a`, std `1.31`

**Frame time (ms)**  avg `107.33`, p50 `102.69`, p95 `124.42`, p99 `181.54`, p99.9 `496.51`, max `520.45`

**Client tick (ms)**  avg `0.54`, p95 `2.00`, max `7.39`

**Memory**  start `3681 MB`, end `3901 MB`, peak `4005 MB`, GC `125 events / 1035 ms`

**FPS over sampling window (ASCII):**

```
 11.6 |                                       █                                        
 11.1 |                                       █                                        
 10.6 |        █          █  █                █      █        █       █       █        
 10.2 |██  █ █ █ ██ ██ ██ █  ██  █  ██   ██   █ █  █ █ █      █ ██ █  ██     ██      █ 
  9.7 |███ ███ ██████████ █  ██████████████ █ ████ ██████ ██  █ ██ █  ████   ██ █    ██
  9.2 |██████████████████████████████████████ ███████████████ ████ █  ██████ ██████████
  8.8 |██████████████████████████████████████████████████████ ████ ██ █████████████████
  8.3 |███████████████████████████████████████████████████████████ ████████████████████
  7.8 |███████████████████████████████████████████████████████████ ████████████████████
  7.4 |███████████████████████████████████████████████████████████ ████████████████████
  6.9 |███████████████████████████████████████████████████████████ ████████████████████
  6.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  67 ms | ███  1
  70 ms | ███  1
  75 ms | ███  1
  76 ms | ███  1
  84 ms | █████  2
  85 ms | ███  1
  86 ms | ███  1
  87 ms | █████  2
  88 ms | ███████████  4
  89 ms | █████  2
  90 ms | █████  2
  91 ms | █████  2
  92 ms | █████  2
  93 ms | ████████  3
  94 ms | █████  2
  96 ms | █████████████████████  8
  97 ms | ████████████████████████  9
  98 ms | ████████████████████████████████  12
  99 ms | ███████████████████████████  10
 100 ms | █████████████████████  8
 101 ms | ███████████████████████████  10
 102 ms | ████████████████████████████████  12
 103 ms | █████████████████████  8
 104 ms | ████████████████████████████████████████  15
 105 ms | █████████████  5
 106 ms | ███████████████████████████  10
 107 ms | █████  2
 108 ms | █████  2
 109 ms | ████████████████  6
 110 ms | ████████  3
 111 ms | ████████████████████████  9
 112 ms | █████  2
 113 ms | ███  1
 114 ms | ███  1
 115 ms | █████████████  5
 116 ms | ████████  3
 117 ms | ████████  3
 118 ms | ███  1
 119 ms | ███  1
 121 ms | █████  2
 123 ms | ███  1
 124 ms | ███  1
 125 ms | ███  1
 126 ms | ███  1
 133 ms | ███  1
 134 ms | █████  2
 142 ms | ███  1
 144 ms | ███  1
 391 ms | ███  1
 520 ms | ███  1
```

**Extras:**

- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:windswept_hills`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `2.19`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `9.32`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7523.00`
- `preload_duration_ms` = `115.00`
- `entity_count_sample_end` = `29.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `8.00`
- `entity_count_sample_start` = `21.00`
- `x_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `9.77`, min `8.59`, p50 `9.97`, p95 `10.20`, p99 `10.82`, 1%low `8.65`, 0.1%low `n/a`, std `0.47`

**Frame time (ms)**  avg `102.57`, p50 `100.30`, p95 `112.56`, p99 `114.38`, p99.9 `116.13`, max `116.46`

**Client tick (ms)**  avg `0.31`, p95 `0.55`, max `2.43`

**Memory**  start `3360 MB`, end `3544 MB`, peak `3726 MB`, GC `4 events / 20 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                                   █                                            
 10.5 |                                   █                                    █       
 10.3 |                                   █                                    █       
 10.1 | █    █    █    █       █ █    █   ██         █  █ █    █    █          █   █   
 10.0 |██  ███  ███  ███  ██   ███   ███  ████   ██  ██ █ ███  ███  ████  ███  █████  █
  9.8 |██  ███  ███  ███  ██ █ ████  ███  █████ ███  ██ █████  ███  ████  ███  █████ ██
  9.6 |██  ███  ███  ███  ████ ████  ███  █████ ███ ███ █████ ████  ████  ███  ████████
  9.5 |████████ ███  ███ █████ ██████████ █████ ███ ███████████████ ████ █████ ████████
  9.3 |█████████████████ ████████████████ █████ ███ ███████████████ ████ █████ ████████
  9.1 |█████████████████ ████████████████ ████████████████████████████████████ ████████
  9.0 |██████████████████████████████████ █████████████████████████████████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  2
  92 ms | █  2
  94 ms | ██  3
  95 ms | █  1
  97 ms | █  2
  98 ms | ██████████  18
  99 ms | ██████████████  24
 100 ms | ████████████████████████████████████████  69
 101 ms | ███████  12
 102 ms | ███  6
 103 ms | ███  5
 104 ms | █  2
 105 ms | █  2
 106 ms | ██  3
 107 ms | ███  6
 108 ms | ███  5
 109 ms | ██  3
 110 ms | ███  5
 111 ms | █████  9
 112 ms | ████  7
 113 ms | ███  5
 114 ms | ██  3
 116 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `9.75`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.65`
- `seed` = `1923.00`
- `preset_long` = `0.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23082 ms  |  Sample ticks: 400

**FPS**  avg `9.78`, min `7.53`, p50 `9.97`, p95 `10.53`, p99 `10.80`, 1%low `7.71`, 0.1%low `n/a`, std `0.56`

**Frame time (ms)**  avg `102.62`, p50 `100.25`, p95 `113.67`, p99 `123.28`, p99.9 `131.58`, max `132.80`

**Client tick (ms)**  avg `2.81`, p95 `3.50`, max `11.35`

**Memory**  start `3400 MB`, end `2973 MB`, peak `3870 MB`, GC `6 events / 25 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |                  █                                                             
 10.4 |                  █                                                          █  
 10.3 |             █    █    █   █                    █        █                   █  
 10.1 |  ██ █  █ █  ███  █ █ ███  █ █   ███  █     █ █ ██    █  ██     █  ██    █   ██ 
  9.9 |█ ████ ████  ███  ███ ███  ████  ███  ██ ████ █ ███ ███  ██   ███  ██ █ ██ █ ███
  9.7 |█ ████ ████  ███  ███ ███  ████  ███ ███ ████ █ ███ ███  ████ ███  ██ ████ █ ███
  9.5 |█ ████ ████  ███  ███ ████ ████ ████ ███ ██████ ███ ████ ████████  █████████████
  9.3 |█ ████ ████ ████ ████ ████ ████████████████████ ███ ████ █████████ █████████████
  9.2 |█ ███████████████████ ████ ████████████████████████ ████ ███████████████████████
  9.0 |█ ███████████████████ ██████████████████████████████████ ███████████████████████
  8.8 |█ ███████████████████ ██████████████████████████████████████████████████████████
  8.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  89 ms | █  1
  92 ms | █  1
  93 ms | ███  4
  94 ms | ███  4
  95 ms | █  1
  96 ms | ████  5
  97 ms | ████  5
  98 ms | ███████  9
  99 ms | ███████████████████████████████  40
 100 ms | ████████████████████████████████████████  52
 101 ms | ████████  11
 102 ms | ███  4
 103 ms | ██████  8
 104 ms | ██  2
 107 ms | █████  7
 108 ms | ████  5
 109 ms | ███  4
 110 ms | █████  7
 111 ms | ███  4
 112 ms | ████  5
 113 ms | ███████  9
 115 ms | █  1
 117 ms | ██  2
 123 ms | █  1
 126 ms | █  1
 132 ms | █  1
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
- `fps_1pct_low` = `7.71`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23062 ms  |  Sample ticks: 400

**FPS**  avg `9.82`, min `8.63`, p50 `9.97`, p95 `10.31`, p99 `11.17`, 1%low `8.71`, 0.1%low `n/a`, std `0.45`

**Frame time (ms)**  avg `102.05`, p50 `100.28`, p95 `112.57`, p99 `113.85`, p99.9 `115.48`, max `115.88`

**Client tick (ms)**  avg `0.31`, p95 `0.49`, max `2.15`

**Memory**  start `3363 MB`, end `3595 MB`, peak `3849 MB`, GC `2 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                                              █            █    
 10.3 |                                                              █            █    
 10.2 |  █                                █                          █            █    
 10.1 |  █                                █          █       █       █            █    
 10.0 |█ ███ █      ███     █████   ███   ████   ███ █  ███ ██  ████ ██   █████   █ ███
  9.9 |█ █████ █    ███    ██████   ███   ████  ████ █  ███ ██  ████ ██  ██████ █ █ ███
  9.7 |█ ███████   ████  █ ██████   ███   ████  ████ █  ███ ██ █████ ██  ██████ █ █ ███
  9.6 |█ ████████  ████  ████████  █████ █████  ████ ██████ ████████ ██ ███████ █ █ ███
  9.5 |█ ████████  ████  ████████ ██████ ██████ ████████████████████ ██ ███████ █ █████
  9.4 |███████████ ██████████████ █████████████ ███████████████████████████████████████
  9.3 |████████████████████████████████████████ ███████████████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
  92 ms | █  1
  95 ms | █  2
  96 ms | ███  5
  97 ms | █  1
  98 ms | ████████  15
  99 ms | ███████████  22
 100 ms | ████████████████████████████████████████  78
 101 ms | ████████  16
 102 ms | ████  8
 103 ms | ███  6
 105 ms | █  1
 106 ms | ███  5
 107 ms | █  2
 108 ms | ██  3
 109 ms | ██  3
 110 ms | ███  5
 111 ms | ███  5
 112 ms | █████  9
 113 ms | ███  5
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.71`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3177.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.80`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `9043.00`
- `preload_duration_ms` = `101.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23143 ms  |  Sample ticks: 400

**FPS**  avg `9.80`, min `7.68`, p50 `9.97`, p95 `10.54`, p99 `11.05`, 1%low `8.12`, 0.1%low `n/a`, std `0.59`

**Frame time (ms)**  avg `102.35`, p50 `100.28`, p95 `113.63`, p99 `116.10`, p99.9 `127.50`, max `130.25`

**Client tick (ms)**  avg `0.31`, p95 `0.37`, max `2.29`

**Memory**  start `3220 MB`, end `3706 MB`, peak `3849 MB`, GC `2 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                                           █                    
 10.6 |      █                                                    █                    
 10.4 |      █     █                                              █                    
 10.3 | █    █     █                               █              █                    
 10.1 | █    █     █               █      █    █   ██    █        █                   █
  9.9 | ███  ███   ███  ███ █ ███  ███  ████  ████ ████  ██  ████ █ ██   ████  ███  ███
  9.8 | ███  ███  ████  █████ ███  ███  ████ █████ ████  ██  ████ ████ █ █████ ███  ███
  9.6 | ████ ████ ████ ██████ ███  ███ █████ █████ ████ ███ ██████████ ███████ ████ ███
  9.4 | ████ ████ ████ ██████ ███  ███ ███████████ ███████████████████ ███████ ████ ███
  9.3 | ████ ████ ████████████████ ███ ███████████ ████████████████████████████████ ███
  9.1 | ████ █████████████████████████ ████████████████████████████████████████████████
  8.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  72 ms | █  1
  90 ms | ██  3
  91 ms | █  1
  92 ms | █  2
  93 ms | █  2
  94 ms | █  1
  95 ms | ██  3
  96 ms | ██  3
  97 ms | ██  3
  98 ms | ██████  11
  99 ms | ███████████  19
 100 ms | ████████████████████████████████████████  71
 101 ms | █████  9
 102 ms | ██████  10
 103 ms | ███  5
 104 ms | ██  3
 105 ms | ██  4
 106 ms | ███  5
 107 ms | ███  6
 108 ms | ███  6
 109 ms | ██  4
 110 ms | ██  3
 111 ms | █  1
 112 ms | ███  6
 113 ms | ███  6
 114 ms | ██  3
 115 ms | █  1
 116 ms | ██  3
 130 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `107.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `8.12`
- `fps_harmonic_avg` = `9.77`
- `neighbour_updates` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23070 ms  |  Sample ticks: 400

**FPS**  avg `9.78`, min `8.74`, p50 `9.97`, p95 `10.30`, p99 `11.00`, 1%low `8.74`, 0.1%low `n/a`, std `0.47`

**Frame time (ms)**  avg `102.46`, p50 `100.27`, p95 `113.39`, p99 `114.34`, p99.9 `114.45`, max `114.46`

**Client tick (ms)**  avg `0.31`, p95 `0.56`, max `2.31`

**Memory**  start `3290 MB`, end `3300 MB`, peak `3894 MB`, GC `2 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 10.4 |                                  █                                             
 10.2 |                       █          █            █                                
 10.1 |                       █          █   █    █   ██    █   █                      
 10.0 |█ █ ███  ███  ███  ███ █ ███  ███ █ ████  ███  ████ ████ ██ ███  ██   ██   ██ ██
  9.8 |█ █████  ███  ████ ███ █ ███  ███ █ ████  ███  ████ ████ ██████  ███  ██  ███ ██
  9.7 |█ █████  ███  ████ ███ █████ ████ █ ████ ████  ████ ████ ██████  ███  ██  ███ ██
  9.5 |█ █████ ████ █████ ███ █████ ██████ ████ █████ ████ ████ ██████ ████  ██  ███ ██
  9.4 |█ █████ ██████████ █████████ ███████████ █████ ████ █████████████████████ ███ ██
  9.2 |█ █████ ███████████████████████████████████████████ █████████████████████████ ██
  9.1 |█ █████ ███████████████████████████████████████████ █████████████████████████ ██
  8.9 |███████ ███████████████████████████████████████████ █████████████████████████ ██
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  89 ms |   1
  90 ms | █  2
  92 ms | █  2
  93 ms | █  2
  94 ms |   1
  95 ms | █  2
  97 ms |   1
  98 ms | ██  5
  99 ms | ██████████████  29
 100 ms | ████████████████████████████████████████  84
 101 ms | ██  5
 102 ms | ████  8
 103 ms | █  3
 104 ms | ██  4
 105 ms | █  2
 106 ms | ██  4
 107 ms | ██  5
 108 ms | ███  7
 109 ms | █  2
 110 ms | ██  4
 111 ms | ██  5
 112 ms | █  3
 113 ms | ████  8
 114 ms | ███  6
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `hoppers_built` = `400.00`
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
- `fps_1pct_low` = `8.74`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `9.76`
- `neighbour_updates` = `0.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `9.77`, min `8.65`, p50 `9.97`, p95 `10.40`, p99 `11.15`, 1%low `8.68`, 0.1%low `n/a`, std `0.51`

**Frame time (ms)**  avg `102.64`, p50 `100.29`, p95 `112.96`, p99 `114.58`, p99.9 `115.47`, max `115.64`

**Client tick (ms)**  avg `0.32`, p95 `0.43`, max `2.39`

**Memory**  start `3423 MB`, end `3196 MB`, peak `3889 MB`, GC `2 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 10.3 |                                                                           █    
 10.2 |          █       █                █                               █       █    
 10.0 |███  ██   ███  ██ █ ██   ███  ███  ███   ███ █ ██   ██    █   ██   ██   █  █ ██ 
  9.9 |███  ██   ███  ██ ████  ████  ███  ███  ████ █ ██ █ ███  ███  ████ ███  ██ █ ███
  9.8 |███  ██ █ ███  ██ ████  ████  ███  ████ ████ █ ██ █████ ████  ████ ███  ██ █ ███
  9.6 |███  ██ █████  ██ ████  ████  ███  █████████ █ ████████ ████  ████ ████ ██ █ ███
  9.5 |████ ██ █████  ██ ████ █████  ███  █████████ █ ████████ ██████████ ███████ █████
  9.4 |█████████████ ███ ████ █████  █████████████████████████ ██████████ █████████████
  9.2 |█████████████████ ████ █████ █████████████████████████████████████ █████████████
  9.1 |█████████████████ ████████████████████████████████████████████████ █████████████
  9.0 |█████████████████ ████████████████████████████████████████████████ █████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms | █  1
  88 ms | █  1
  89 ms | █  1
  90 ms | █  2
  91 ms | █  2
  94 ms | █  1
  95 ms | █  1
  96 ms | █  2
  97 ms | █  1
  98 ms | ████  8
  99 ms | █████████████  25
 100 ms | ████████████████████████████████████████  75
 101 ms | ██████  12
 102 ms | ████  8
 103 ms | █  1
 104 ms | ██  3
 105 ms | █  2
 106 ms | █  1
 107 ms | ███  5
 108 ms | ███  5
 109 ms | ███  5
 110 ms | ███  5
 111 ms | ██████  12
 112 ms | ███  6
 113 ms | ███  6
 114 ms | ██  3
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `8.68`
- `scheduled_block_ticks` = `1088.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.74`
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

Category: **Showcase**  |  Duration: 196311 ms  |  Sample ticks: 3600

**FPS**  avg `9.82`, min `6.99`, p50 `9.97`, p95 `10.69`, p99 `11.77`, 1%low `7.67`, 0.1%low `7.21`, std `0.76`

**Frame time (ms)**  avg `102.39`, p50 `100.35`, p95 `116.49`, p99 `127.60`, p99.9 `133.70`, max `143.10`

**Client tick (ms)**  avg `0.73`, p95 `1.70`, max `6.77`

**Memory**  start `3506 MB`, end `3765 MB`, peak `3896 MB`, GC `202 events / 755 ms`

**FPS over sampling window (ASCII):**

```
 10.5 |█                                                                               
 10.4 |█                                                                               
 10.3 |█                                                                               
 10.3 |█                                                                               
 10.2 |█                                                                               
 10.1 |█                                                                               
 10.0 |█                                                                  █            
 10.0 |█    █                        ██      █           █            █   █      █     
  9.9 |██  ██  █ █  █ █   █   ██ █ █ ██  █ █ █   ███  █  █ █  █    █  █   ██ █ ███ ██  
  9.8 |███ █████ ██ ███ █ ████████ ████  ███ █  ████ ███████ ████████ █   ██ █████ ████
  9.7 |█████████████████████████████████████ ██ ████████████ ██████████ █ █████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  41 ms |   1
  72 ms |   1
  76 ms |   1
  79 ms |   2
  80 ms |   2
  81 ms |   2
  82 ms |   2
  83 ms |   2
  84 ms | █  5
  85 ms |   4
  86 ms | █  6
  87 ms |   3
  88 ms | █  8
  89 ms | █  6
  90 ms | █  10
  91 ms | █  11
  92 ms | █  9
  93 ms | ███  22
  94 ms | ██  20
  95 ms | ████  31
  96 ms | █████  45
  97 ms | ██████████  80
  98 ms | ██████████████████  149
  99 ms | █████████████████████████████████████  307
 100 ms | ████████████████████████████████████████  334
 101 ms | ███████████████████  159
 102 ms | █████████  76
 103 ms | ████  36
 104 ms | ████  32
 105 ms | ███  24
 106 ms | ███  28
 107 ms | ██  15
 108 ms | ██  15
 109 ms | ███  24
 110 ms | ████  32
 111 ms | ████  34
 112 ms | ███  28
 113 ms | █████  41
 114 ms | ████  31
 115 ms | ███  21
 116 ms | ██  16
 117 ms | ██  14
 118 ms |   3
 119 ms |   3
 120 ms | █  8
 121 ms | █  6
 122 ms |   4
 123 ms |   2
 124 ms | █  6
 125 ms | █  7
 126 ms | █  5
 127 ms | █  10
 128 ms | █  5
 129 ms |   2
 130 ms |   2
 131 ms |   1
 132 ms |   1
 133 ms |   1
 134 ms |   1
 143 ms |   1
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `69.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.21`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.77`
- `fps_1pct_low` = `7.67`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `20.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195550 ms  |  Sample ticks: 3600

**FPS**  avg `9.85`, min `7.12`, p50 `9.96`, p95 `10.96`, p99 `11.91`, 1%low `7.64`, 0.1%low `7.13`, std `0.74`

**Frame time (ms)**  avg `102.10`, p50 `100.41`, p95 `116.44`, p99 `126.26`, p99.9 `135.68`, max `140.40`

**Client tick (ms)**  avg `0.71`, p95 `1.47`, max `5.93`

**Memory**  start `3416 MB`, end `3760 MB`, peak `3880 MB`, GC `249 events / 885 ms`

**FPS over sampling window (ASCII):**

```
 10.0 |      █                            █                                         █  
 10.0 |   █  █                     █     ██                                         █  
 10.0 |   █  █                     ██    ██    █ █    █      █  █                   █  
  9.9 | █ █  ██       █        █ █ ██    ██    █ █   ██ █    █  █                  ██ █
  9.9 | █ █  ██ █     █   █  █ ███ ██  █ ██   ██ █ █ ██ █  █ ██ █   █      █     █ ████
  9.8 |██ ██ ██ █  █  █   █  █ ███ ███ ████ █ ██ █ █ █████ ████ █ ██████   █ ██  █ ████
  9.8 |████████ ██ ██ ██  ████████ ███ ████ █ ██ █ █ ██████████ █ ██████   █ ███ ██████
  9.8 |████████ ██ ██ ████████████ ████████ ██████ █ ██████████ ████████ █ █████ ██████
  9.7 |████████ ██████████████████ ████████ ████████ █████████████████████ ████████████
  9.7 |████████ ██████████████████ ████████ ████████ ██████████████████████████████████
  9.7 |████████ ██████████████████ █████████████████ ██████████████████████████████████
  9.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  70 ms |   2
  71 ms |   1
  72 ms |   2
  74 ms |   1
  76 ms |   1
  79 ms |   1
  80 ms |   2
  81 ms |   2
  82 ms |   2
  83 ms |   4
  84 ms | █  9
  85 ms | █  11
  86 ms | █  6
  87 ms | ██  13
  88 ms | █  11
  89 ms | █  5
  90 ms | ██  15
  91 ms | ██  17
  92 ms | █  10
  93 ms | ██  15
  94 ms | ████  38
  95 ms | ████  38
  96 ms | █████  45
  97 ms | ███████  57
  98 ms | █████████████████  148
  99 ms | ██████████████████████████████  254
 100 ms | ████████████████████████████████████████  344
 101 ms | ███████████████  128
 102 ms | ███████████  92
 103 ms | ██████  48
 104 ms | ████  31
 105 ms | ████  32
 106 ms | ████  31
 107 ms | ███  25
 108 ms | ████  32
 109 ms | ███  27
 110 ms | ████  31
 111 ms | ███  30
 112 ms | ███  27
 113 ms | ████  31
 114 ms | ████  31
 115 ms | ██  18
 116 ms | ██  16
 117 ms | █  9
 118 ms | █  7
 119 ms | █  6
 120 ms |   2
 121 ms | █  9
 122 ms | █  6
 123 ms |   3
 124 ms | █  9
 125 ms | █  7
 126 ms | █  7
 128 ms |   3
 129 ms |   2
 130 ms |   4
 133 ms |   2
 134 ms |   1
 140 ms |   2
```

**Extras:**

- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_count` = `19.00`
- `phase` = `1.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `72.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `7.13`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `9.79`
- `fps_1pct_low` = `7.64`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `18.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `3.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 76269 ms  |  Sample ticks: 0

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
- `part_label` = `HighEnd Shader`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `part` = `4.00`

