# MC Benchmark Core session — 2026-09-19T17:11:23.939733021+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 107.9 | 17.3 | 14.3 | 50.64 | 0.96 | 60 | 3419 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 106.2 | 17.1 | 14.1 | 53.06 | 0.99 | 60 | 3471 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 108.7 | 17.4 | 14.1 | 50.64 | 1.37 | 80 | 2454 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 107.4 | 16.7 | 12.8 | 53.07 | 1.73 | 68 | 3134 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 104.4 | 17.2 | 15.5 | 52.49 | 0.46 | 45 | 3654 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 107.7 | 16.4 | 13.5 | 51.27 | 0.55 | 49 | 2686 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 31.7 | 10.1 | n/a | 92.02 | 0.51 | 47 | 1587 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 31.4 | 11.5 | 10.6 | 79.01 | 0.59 | 15 | 1892 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 31.1 | 11.0 | 9.7 | 83.84 | 0.57 | 15 | 901 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 30.0 | 13.6 | 13.3 | 70.84 | 0.50 | 20 | 161 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 32.1 | 12.0 | 11.4 | 78.01 | 0.49 | 18 | 919 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 30.3 | 11.3 | 9.6 | 74.95 | 0.56 | 21 | 609 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 30.2 | 10.9 | 9.1 | 73.02 | 0.48 | 20 | 1216 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 30.6 | 12.8 | 11.3 | 71.30 | 0.59 | 21 | 323 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 32.3 | 13.2 | 12.7 | 71.81 | 0.51 | 22 | 1746 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 31.4 | 12.9 | 12.0 | 74.35 | 0.62 | 22 | 827 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 31.0 | 14.1 | 13.6 | 69.62 | 0.44 | 26 | 620 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 31.1 | 11.7 | 9.5 | 74.89 | 0.54 | 23 | 1381 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 30.2 | 12.5 | 11.0 | 74.88 | 0.49 | 23 | 652 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 29.7 | 12.4 | 10.7 | 73.38 | 0.41 | 83 | 450 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 32.0 | 10.1 | n/a | 93.00 | 9.85 | 81 | 1917 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 26.6 | 7.7 | n/a | 124.68 | 0.49 | 109 | 1299 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 9.4 | 2.1 | n/a | 142.07 | 0.45 | 135 | 1963 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 9.4 | 1.4 | n/a | 264.55 | 0.42 | 134 | 1711 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 9.9 | 1.3 | n/a | 712.08 | 2.15 | 151 | 1565 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

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

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `107.94`, min `14.29`, p50 `107.31`, p95 `232.06`, p99 `513.48`, 1%low `17.29`, 0.1%low `14.29`, std `86.57`

**Frame time (ms)**  avg `13.89`, p50 `9.32`, p95 `26.14`, p99 `50.64`, p99.9 `66.19`, max `69.99`

**Client tick (ms)**  avg `0.96`, p95 `1.88`, max `6.46`

**Memory**  start `919 MB`, end `1880 MB`, peak `4338 MB`, GC `60 events / 1458 ms`

**FPS over sampling window (ASCII):**

```
154.4 |                                                     █       █                  
147.5 |                                                     █  █    █                  
140.6 |                                                     █  █    █                  
133.7 |            █          █             █               █  █    █                █ 
126.8 |            █          █             █               █ ██  █ █             █  █ 
119.9 |      █     ██   █     █     █  █  █ █  █   █  █     ████ ██ █      █      ██ ██
113.0 |   █  ███   ██ █ █     █  ██ █  ██ ████ █   █  █     ████ ██ █   █ ██      ██ ██
106.2 |█████ ███ ████ █ ██ ██ ██ ██ ██ ███████ █   █  █     ███████ █  █████  █   ██ ██
 99.3 |█████ ███ ██████ █████ ██ ██ ██ ███████ █  ██  █ █   ███████ █  ██████ █ ████ ██
 92.4 |█████████████████████████████████████████ ███  █████ █████████ ███████ █ ███████
 85.5 |██████████████████████████████████████████████ ███████████████ █████████████████
 78.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  17
   2 ms | ████  30
   3 ms | ███  22
   4 ms | ███  25
   5 ms | ███  23
   6 ms | ███████  57
   7 ms | ██████████████████  150
   8 ms | ████████████████████████████████████████  341
   9 ms | ████████████████  139
  10 ms | ██████  53
  11 ms | ████  31
  12 ms | ██  15
  13 ms |   4
  14 ms |   2
  15 ms | █  5
  16 ms | ██  13
  17 ms | ██  21
  18 ms | ███████  61
  19 ms | ████████  64
  20 ms | ███████  61
  21 ms | ████████  72
  22 ms | ███████  58
  23 ms | █████  43
  24 ms | ████  34
  25 ms | ███  25
  26 ms | █  11
  27 ms |   4
  28 ms |   1
  29 ms |   4
  30 ms |   1
  33 ms |   2
  34 ms |   3
  35 ms |   2
  36 ms |   2
  37 ms |   2
  38 ms |   1
  39 ms |   2
  40 ms |   2
  41 ms |   2
  42 ms |   3
  43 ms |   3
  44 ms |   1
  45 ms |   3
  46 ms |   1
  47 ms |   2
  48 ms |   1
  49 ms |   3
  50 ms | █  5
  51 ms |   1
  52 ms |   1
  53 ms |   1
  54 ms |   2
  55 ms |   1
  56 ms |   3
  58 ms |   2
  61 ms |   1
  69 ms |   2
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `end_rod` | 240 | 180 | 107.1 | 46.27 |
| `dragon_breath` | 160 | 180 | 107.7 | 53.57 |
| `dripping_water` | 240 | 180 | 108.6 | 58.34 |
| `flame` | 160 | 180 | 111.3 | 50.17 |
| `smoke` | 160 | 180 | 98.5 | 37.42 |
| `sculk_charge_pop` | 240 | 180 | 117.7 | 55.00 |
| `ALL_TOGETHER` | 1680 | 180 | 106.8 | 50.16 |
| `portal` | 160 | 180 | 106.1 | 49.55 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `72.02`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `143.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `17.29`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `14.29`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `106.24`, min `14.06`, p50 `105.06`, p95 `212.49`, p99 `467.62`, 1%low `17.10`, 0.1%low `14.06`, std `85.09`

**Frame time (ms)**  avg `14.14`, p50 `9.52`, p95 `26.29`, p99 `53.06`, p99.9 `68.58`, max `71.14`

**Client tick (ms)**  avg `0.99`, p95 `1.56`, max `6.48`

**Memory**  start `1226 MB`, end `1921 MB`, peak `4698 MB`, GC `60 events / 1534 ms`

**FPS over sampling window (ASCII):**

```
168.4 |                                 █                                              
159.9 |                                 █                                              
151.4 |                                 █                                              
142.9 |                          █    █ █                              █               
134.4 |                          █ █  █ █                         █    █           █   
125.9 |           █     █       ██ █  █ █     █ █ █               █    █           █   
117.4 |           █ █  ██  ██   ████  █ ██    █ █ ██              █ █  █  ██     █ █ ██
108.9 |        █ ██ █ ███  ██   ████  █ ██ █  ███████    ███      ███  ██ ████   █ █ ██
100.4 |█ █  █ ██ ██ █ ███  ███ █████  █ ██ ██ ████████  ████ ██   ███  ███████   █ █ ██
 92.0 |███████████████████ ███ █████ ████████ ████████ █████ ████ ████████████ ████████
 83.5 |███████████████████████ ████████████████████████████████████████████████████████
 75.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms | ██  11
   2 ms | █████  31
   3 ms | ███  21
   4 ms | ██  13
   5 ms | ███  18
   6 ms | ███████████  69
   7 ms | ██████████████████████████████  194
   8 ms | ████████████████████████████████████████  258
   9 ms | ███████████████████████████  174
  10 ms | ███████████  72
  11 ms | ████  24
  12 ms | █  7
  13 ms | █  6
  14 ms |   3
  15 ms |   1
  16 ms | █  5
  17 ms | ██  10
  18 ms | ████  23
  19 ms | ████████  50
  20 ms | ███████████  70
  21 ms | ████████████  79
  22 ms | ███████████  73
  23 ms | ██████████  63
  24 ms | ██████  40
  25 ms | ███  21
  26 ms | ██  10
  27 ms | █  5
  28 ms | █  5
  29 ms |   1
  30 ms |   1
  31 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms | █  4
  36 ms |   1
  38 ms |   3
  41 ms | █  5
  42 ms |   1
  43 ms |   2
  46 ms |   2
  48 ms |   2
  49 ms |   2
  50 ms | █  7
  51 ms | █  5
  52 ms |   2
  53 ms |   3
  54 ms |   3
  55 ms |   2
  56 ms |   1
  57 ms |   1
  58 ms |   1
  59 ms |   1
  67 ms |   1
  69 ms |   1
  71 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `70.00`
- `fps_harmonic_avg` = `70.72`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `14.06`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `17.10`
- `preset_long` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `108.68`, min `14.07`, p50 `109.27`, p95 `262.47`, p99 `490.07`, 1%low `17.39`, 0.1%low `14.07`, std `86.22`

**Frame time (ms)**  avg `14.14`, p50 `9.15`, p95 `29.07`, p99 `50.64`, p99.9 `65.99`, max `71.07`

**Client tick (ms)**  avg `1.37`, p95 `2.18`, max `27.43`

**Memory**  start `1689 MB`, end `1894 MB`, peak `4143 MB`, GC `80 events / 1674 ms`

**FPS over sampling window (ASCII):**

```
137.8 |                                                      █                         
131.9 |                       ██                             █      █      █   █       
126.1 | █                    ███    █      █    █        █   █      █ █    █   █       
120.3 | █     █        █     ████   █      █ █  ██       ██  █  █ █ █ █ █  █  ███      
114.5 | ██    █     █  █   █ ████   █    ███ █  ██   █   ██  ██ ███ █ █ █  █  ████   ██
108.7 |████ █ ██   ██  █   █ ████   █  █ ███ ██ ██   █  ███  ██ ███ █ █ █ ██ █████  ███
102.9 |████ ██████ ██ ██ ███ ██████ █  █ ███ ██████  ██████  ██████ ███ █ ██ ██████ ███
 97.1 |████ ██████ █████ ███ ██████ █  █ ███████████ ███████ ██████ ███ █ ██ ██████████
 91.3 |██████████████████████████████  █████████████ ██████████████ ████████ ██████████
 85.5 |█████████████████████████████████████████████ ███████████████████████ ██████████
 79.7 |█████████████████████████████████████████████ ██████████████████████████████████
 73.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  11
   2 ms | ████  34
   3 ms | ███  31
   4 ms | ███  26
   5 ms | ████  38
   6 ms | █████  46
   7 ms | ████████████████  144
   8 ms | ████████████████████████████████████████  359
   9 ms | ██████████  87
  10 ms | ████  37
  11 ms | ████  37
  12 ms | ██  20
  13 ms | █  11
  14 ms | █  9
  15 ms | █  6
  16 ms | █  7
  17 ms | ███  25
  18 ms | ██████  54
  19 ms | ██████  57
  20 ms | ██████  56
  21 ms | ██████  52
  22 ms | █████  46
  23 ms | ██████  50
  24 ms | ███  29
  25 ms | ███  26
  26 ms | ██  14
  27 ms | ██  17
  28 ms | █  11
  29 ms | █  8
  30 ms |   2
  31 ms |   3
  32 ms |   3
  33 ms |   1
  34 ms |   1
  35 ms |   2
  36 ms |   1
  38 ms |   1
  39 ms |   3
  40 ms |   1
  41 ms |   3
  42 ms |   3
  43 ms |   3
  44 ms | █  5
  45 ms |   3
  46 ms |   1
  47 ms | █  6
  48 ms |   4
  49 ms |   2
  50 ms |   1
  51 ms |   3
  53 ms |   1
  54 ms |   2
  56 ms |   3
  58 ms |   1
  59 ms |   1
  61 ms |   1
  69 ms |   1
  71 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `66.00`
- `fps_harmonic_avg` = `70.70`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `14.07`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `17.39`
- `preset_long` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `107.44`, min `12.83`, p50 `107.78`, p95 `267.70`, p99 `423.25`, 1%low `16.67`, 0.1%low `12.83`, std `78.25`

**Frame time (ms)**  avg `14.39`, p50 `9.28`, p95 `28.84`, p99 `53.07`, p99.9 `72.59`, max `77.96`

**Client tick (ms)**  avg `1.73`, p95 `2.38`, max `35.76`

**Memory**  start `1329 MB`, end `2420 MB`, peak `4463 MB`, GC `68 events / 1499 ms`

**FPS over sampling window (ASCII):**

```
138.2 |      █                      █                        █                         
133.3 |      █                      █                        █                         
128.4 |      █                      █            █           █                         
123.5 |  █ ███         █           ██            █           █                        █
118.6 |  █ ███         █  █ █      ███ █         █  █        █  █    █     █          █
113.7 | ██ ███         █  █ █ █    █████   ██    ██ ██     █ █  █   ███   ███ █    ██ █
108.9 | ██ ███       █ ██ █ █ █    ██████ ███ █  ██ ██  █  █ █  █  ████ █ ███ █    ██ █
104.0 | ██ ███   █ ████████ ███   ███████ ██████ ██ ██  ██ █ █  ██ ██████ ███ █    ████
 99.1 | ██ ███████ █████████████  ███████ ██████ ██ ██  ██████  ██ ██████ ███████  ████
 94.2 |███████████ █████████████ ████████ █████████ ███████████ ██ ██████████████ █████
 89.3 |███████████ ████████████████████████████████████████████ ███████████████████████
 84.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  5
   2 ms | █████  36
   3 ms | █████  36
   4 ms | █████  35
   5 ms | ██████  46
   6 ms | ██████████  73
   7 ms | ███████████████████  139
   8 ms | ████████████████████████████████████████  293
   9 ms | ██████████  71
  10 ms | ██████  45
  11 ms | ██████  42
  12 ms | ███  19
  13 ms | ███  19
  14 ms | █  10
  15 ms | █  7
  16 ms | █  9
  17 ms | ██  18
  18 ms | ██████  41
  19 ms | ████████  55
  20 ms | ███████  53
  21 ms | ██████  42
  22 ms | ██████  43
  23 ms | ███████  50
  24 ms | ██████  46
  25 ms | ██  18
  26 ms | ████  29
  27 ms | ███  23
  28 ms | ███  19
  29 ms | █  6
  30 ms |   3
  31 ms | █  4
  32 ms |   1
  33 ms |   2
  34 ms |   1
  35 ms |   2
  36 ms |   1
  39 ms |   2
  40 ms |   3
  41 ms |   2
  42 ms |   3
  43 ms |   1
  44 ms |   1
  45 ms | █  4
  46 ms |   3
  47 ms | █  4
  48 ms | █  4
  49 ms |   1
  50 ms |   2
  51 ms |   1
  52 ms |   2
  53 ms |   3
  54 ms |   2
  55 ms | █  4
  56 ms |   1
  60 ms |   1
  62 ms |   1
  71 ms |   1
  73 ms |   1
  77 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `43.00`
- `fps_harmonic_avg` = `69.48`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `153.00`
- `fps_0p1pct_low` = `12.83`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `153.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `16.67`
- `preset_long` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 16044 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `SAMPLING`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 194 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 952 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 108 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 698 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 205 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 1299 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 612 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 852 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 849 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 248 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 11300 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `SAMPLING`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 1016 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 849 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 707 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 462 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `104.37`, min `15.46`, p50 `108.99`, p95 `151.05`, p99 `603.25`, 1%low `17.16`, 0.1%low `15.46`, std `102.23`

**Frame time (ms)**  avg `14.31`, p50 `9.18`, p95 `26.73`, p99 `52.49`, p99.9 `62.46`, max `64.68`

**Client tick (ms)**  avg `0.46`, p95 `0.85`, max `4.85`

**Memory**  start `2888 MB`, end `3922 MB`, peak `6542 MB`, GC `45 events / 1134 ms`

**FPS over sampling window (ASCII):**

```
176.8 |   █                                                                           █
167.7 |   █                                                                           █
158.6 |   █                                                          █                █
149.5 |   █                  █                                       █                █
140.4 |   █                  █                                       █       █        █
131.3 |   █                  ██                   █     █            █       █        █
122.2 | █ █      █   █    █  ██ ██ █      █       █     █    █  ██  ██   █   █        █
113.0 | █ █  █   ██  █    █ ███ ██ █ █    █       █     █    █  ██ ███ █ █   █   █    █
103.9 | █ █  ██  ██  ██   █ ███ ██ ███ █  █       █   █ █    █ ███ ███ █ █   █ █ █    █
 94.8 | █ █  ██████ ███████ ██████████ █ ██ █  █ ████ █ ██████████ █████████ ███ █ ██ █
 85.7 |██ ██████████████████████████████████████████████████████████████████ ███ ██████
 76.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | ██  22
   2 ms | █  10
   3 ms | █  11
   4 ms | █  6
   5 ms |   5
   6 ms | ███  31
   7 ms | ████████████████  164
   8 ms | ████████████████████████████████████████  413
   9 ms | ███████████  112
  10 ms | ███  36
  11 ms | ███  27
  12 ms | █  11
  13 ms | █  6
  14 ms |   5
  15 ms |   5
  16 ms | █  9
  17 ms | ██  17
  18 ms | ██  19
  19 ms | ██████  62
  20 ms | ██████  64
  21 ms | ███████  76
  22 ms | █████  56
  23 ms | ██████  61
  24 ms | ███  36
  25 ms | ███  35
  26 ms | ███  32
  27 ms | █  14
  28 ms | █  7
  29 ms |   4
  30 ms |   2
  31 ms |   2
  35 ms |   1
  36 ms |   1
  38 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   1
  42 ms |   3
  43 ms |   1
  45 ms |   1
  47 ms |   1
  48 ms |   2
  49 ms |   1
  50 ms |   1
  51 ms |   1
  52 ms |   2
  55 ms |   4
  56 ms |   2
  57 ms |   2
  58 ms |   2
  59 ms |   2
  64 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `0.00`
- `fps_harmonic_avg` = `69.86`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `15.46`
- `seed` = `4019.00`
- `preset_quick` = `1.00`
- `repeaters_placed` = `48.00`
- `dust_placed` = `464.00`
- `block_state_changes` = `0.00`
- `neighbour_updates` = `0.00`
- `scheduled_block_ticks` = `2240.00`
- `preload_chunks` = `81.00`
- `pulses_issued` = `45.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `17.16`
- `preset_long` = `0.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `107.70`, min `13.55`, p50 `108.54`, p95 `219.25`, p99 `572.44`, 1%low `16.40`, 0.1%low `13.55`, std `95.11`

**Frame time (ms)**  avg `14.13`, p50 `9.21`, p95 `26.81`, p99 `51.27`, p99.9 `69.10`, max `73.81`

**Client tick (ms)**  avg `0.55`, p95 `0.87`, max `5.16`

**Memory**  start `3892 MB`, end `6150 MB`, peak `6578 MB`, GC `49 events / 1183 ms`

**FPS over sampling window (ASCII):**

```
161.0 |                              █                                                 
153.1 |                              █ █                                               
145.3 |                              █ █                    █        █                 
137.5 |      █                    █  █ █               █    █        █    █            
129.6 |      █                    █  █ █               █    ██       █    █  █        █
121.8 | █   ██ █    █       █  █  █ ██ █  █        █   █    ██       █ █  █  █       ██
113.9 | █   ██ █    █     █ █  █  █ ██ ██ █      █ █   █ █  ██       █ █ ██  █     █ ██
106.1 |██   ████    █   █ ██████ ██ ██ ██ █  █ █ ███   █ █  ██   █  ██ █ ██  █ █ █ █ ██
 98.3 |██  ██████ █ ███ █ █████████ ███████  █ █████   ███ ███  ██████████████ █████ ██
 90.4 |███ ████████ ████████████████████████████████ █ ████████ ███████████████████████
 82.6 |█████████████████████████████████████████████ █ ████████████████████████████████
 74.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms | ███  22
   2 ms | ██  13
   3 ms | ███  25
   4 ms | ██  19
   5 ms | ███  26
   6 ms | ██████  47
   7 ms | █████████████████████  166
   8 ms | ████████████████████████████████████████  323
   9 ms | ████████████████████  162
  10 ms | ████████  68
  11 ms | ███  25
  12 ms | █  11
  13 ms |   4
  14 ms | █  6
  15 ms |   3
  16 ms |   4
  17 ms | █  6
  18 ms | █  11
  19 ms | ████  31
  20 ms | ██████  51
  21 ms | ████████  64
  22 ms | █████████  69
  23 ms | ████████  63
  24 ms | ████████  66
  25 ms | █████  37
  26 ms | ███  24
  27 ms | ██  16
  28 ms | █  9
  29 ms |   4
  30 ms |   2
  31 ms |   1
  34 ms |   1
  39 ms |   1
  40 ms |   1
  41 ms |   2
  42 ms |   2
  45 ms |   3
  47 ms |   1
  48 ms |   2
  49 ms |   2
  50 ms | █  7
  51 ms |   1
  52 ms |   1
  53 ms |   1
  55 ms |   2
  57 ms |   1
  58 ms |   1
  59 ms |   1
  60 ms |   1
  61 ms |   1
  63 ms |   1
  65 ms |   1
  66 ms |   1
  71 ms |   1
  73 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `16.40`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `24.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `13.55`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `70.77`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `31.65`, min `9.57`, p50 `27.22`, p95 `68.23`, p99 `158.81`, 1%low `10.11`, 0.1%low `n/a`, std `24.16`

**Frame time (ms)**  avg `40.37`, p50 `36.74`, p95 `71.98`, p99 `92.02`, p99.9 `103.51`, max `104.51`

**Client tick (ms)**  avg `0.51`, p95 `1.04`, max `4.05`

**Memory**  start `5621 MB`, end `7101 MB`, peak `7209 MB`, GC `47 events / 1229 ms`

**FPS over sampling window (ASCII):**

```
 62.5 |                                      █                                         
 59.0 |                                      █                                         
 55.5 |                     █                █                                         
 52.0 |                     █     █          █                                         
 48.5 |           █         █     █          █                   █                     
 45.0 |           █         █     █    █     █                   █       █ █           
 41.5 |           █   █     █     █    █  █  █        █          █       █ █        █  
 38.0 |           █   █     █     █    █  █  █        █  █       █       █ █        █  
 34.5 |           █   ██    █   █ █  █ █  █  █ █      █ ███  █  ███ █    █ █        █  
 30.9 |     █ █   ██  ████ ██   █ ██ █ █  █  ████  █  █████  █  █████    █ █ ██  █ ██  
 27.4 |████ ████████████████████████████ ███ ████████ █████ ███ ██████ █████ ██ ███████
 23.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   5 ms | ████  4
   6 ms | ██  2
   7 ms | █  1
   8 ms | ███  3
   9 ms | ██  2
  10 ms | █  1
  11 ms | ███  3
  12 ms | █████  6
  13 ms | ██  2
  14 ms | █  1
  15 ms | ███  3
  16 ms | █████  6
  17 ms | █  1
  18 ms | ███  3
  19 ms | ████  4
  20 ms | ███  3
  21 ms | █████  5
  22 ms | ██  2
  23 ms | ███  3
  24 ms | █████████  10
  25 ms | █████████  10
  26 ms | █████████████  14
  27 ms | █████████  10
  28 ms | ██████  7
  29 ms | ████  4
  30 ms | █████████  10
  31 ms | ██████████  11
  32 ms | ██████████████████████  24
  33 ms | ████████████████████████████████████████  44
  34 ms | █████████████████████  23
  35 ms | ██████████  11
  36 ms | ██████████████████  20
  37 ms | ██████████  11
  38 ms | ████████  9
  39 ms | ██████  7
  40 ms | ███████  8
  41 ms | ████  4
  42 ms | ███████  8
  43 ms | ███  3
  44 ms | ████████  9
  45 ms | ████████  9
  46 ms | ██████████  11
  47 ms | ███████████████  16
  48 ms | ███████████████████  21
  49 ms | ██████████████████  20
  50 ms | ███████  8
  51 ms | ██████████  11
  52 ms | ██████  7
  53 ms | ███  3
  54 ms | ██████  7
  55 ms | █████  6
  56 ms | ████  4
  57 ms | ███  3
  58 ms | ██  2
  59 ms | ███  3
  60 ms | ██  2
  61 ms | ████  4
  62 ms | █  1
  63 ms | ████  4
  65 ms | ██  2
  66 ms | █  1
  67 ms | █  1
  68 ms | ███  3
  69 ms | ███  3
  71 ms | █████  6
  72 ms | █  1
  74 ms | ██  2
  75 ms | ███  3
  78 ms | █  1
  79 ms | ██  2
  81 ms | █  1
  82 ms | █  1
  83 ms | ███  3
  85 ms | ███  3
  88 ms | █  1
  91 ms | ██  2
  92 ms | █  1
  95 ms | █  1
  99 ms | █  1
 102 ms | █  1
 104 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `24.77`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `63.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `10.11`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `31.45`, min `10.64`, p50 `27.66`, p95 `59.41`, p99 `131.40`, 1%low `11.45`, 0.1%low `10.64`, std `20.09`

**Frame time (ms)**  avg `38.25`, p50 `36.15`, p95 `64.78`, p99 `79.01`, p99.9 `93.23`, max `93.95`

**Client tick (ms)**  avg `0.59`, p95 `1.22`, max `7.26`

**Memory**  start `5481 MB`, end `6538 MB`, peak `7374 MB`, GC `15 events / 224 ms`

**FPS over sampling window (ASCII):**

```
 49.8 |                                █                                 █             
 47.5 |          █                     █                                 █             
 45.2 |          █                     █                                 █             
 42.9 |          █                     █                                 █             
 40.6 |      ██  █          ██  █      █                               █ █             
 38.3 |      ██  █          ██  █      █                               █ █             
 35.9 |      ██  █          ██  █      █          ██   █              ██ █         █   
 33.6 |█     ██  █    █     ██  ██     ██         ██   █  █   █  █    ██ █         █   
 31.3 |██  █ ███ █   ██  █  ███ ████ █ ██        ███   █  █   █  ███ ███ █         █ █ 
 29.0 |██ ████████   ███ █  ███ ████ █ ███     █████ █ █ ██████ ████ ███ █  █ ██  █████
 26.7 |████████████████████ ████████████████████████ ███████████████ ███ █ ████████████
 24.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   5 ms | ██  2
   6 ms | █  1
   7 ms | ██  2
   8 ms | █  1
  10 ms | █  1
  11 ms | █  1
  12 ms | ████  3
  13 ms | ████  3
  14 ms | █████  4
  15 ms | █████  4
  16 ms | ██████  5
  17 ms | ████████  7
  18 ms | ████████  7
  19 ms | ████████  7
  20 ms | ███████  6
  21 ms | █████  4
  22 ms | █████  4
  23 ms | ████████████  10
  24 ms | ███████  6
  25 ms | ████████  7
  26 ms | ███████████████  12
  27 ms | ██████████  8
  28 ms | ██████████  8
  29 ms | ████████████  10
  30 ms | ██████████████████████  18
  31 ms | ███████████████████████  19
  32 ms | ████████████████████████████████████████  33
  33 ms | ███████████████████████████████████  29
  34 ms | █████████████████████████  21
  35 ms | ███████████████████  16
  36 ms | ███████████████  12
  37 ms | ███████████████  12
  38 ms | ████████████  10
  39 ms | █████████████████████  17
  40 ms | ███████████████  12
  41 ms | ███████████████  12
  42 ms | ████████████████  13
  43 ms | ██████████████████████  18
  44 ms | █████████████████  14
  45 ms | █████████████  11
  46 ms | █████████████████████  17
  47 ms | ███████████  9
  48 ms | ███████████  9
  49 ms | ████████████  10
  50 ms | ███████  6
  51 ms | ██████████  8
  52 ms | ██████  5
  53 ms | ██████  5
  54 ms | ██████  5
  55 ms | ████████  7
  56 ms | ████████  7
  57 ms | █  1
  58 ms | █  1
  59 ms | ████  3
  60 ms | ████  3
  61 ms | ████  3
  62 ms | ██  2
  63 ms | ██  2
  64 ms | ████  3
  65 ms | ████  3
  66 ms | ██  2
  68 ms | █  1
  69 ms | ████  3
  70 ms | ████  3
  71 ms | ████  3
  73 ms | ██  2
  75 ms | █  1
  76 ms | █  1
  77 ms | █  1
  79 ms | █  1
  80 ms | █  1
  82 ms | █  1
  86 ms | █  1
  92 ms | █  1
  93 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `11.45`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `72.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `10.64`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.15`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23878 ms  |  Sample ticks: 400

**FPS**  avg `31.11`, min `9.67`, p50 `27.58`, p95 `60.45`, p99 `122.24`, 1%low `11.00`, 0.1%low `9.67`, std `19.72`

**Frame time (ms)**  avg `38.67`, p50 `36.25`, p95 `63.12`, p99 `83.84`, p99.9 `96.22`, max `103.37`

**Client tick (ms)**  avg `0.57`, p95 `1.10`, max `9.48`

**Memory**  start `6473 MB`, end `6245 MB`, peak `7375 MB`, GC `15 events / 224 ms`

**FPS over sampling window (ASCII):**

```
 58.8 |                     █                                                          
 55.5 |                     █                                                          
 52.2 |     █       █       █                             █                            
 48.9 |     █       █       █                             █                            
 45.6 |     █       █       █                          █  █                            
 42.3 |     █       █       █                          █  █   █ █                      
 39.0 |     █       █       █                   █      █  █   █ █                      
 35.7 |     █       █  ██   █                █  █      ██ █   █ ██ █              █    
 32.4 |    ██      ███ ██   █    ██      █   ██ █     ███ █ █ █ ██ █ █   ██       ██   
 29.0 | ██████████ ███ ███  █ ██████  ██ ███ ████ █ █ ███ ███ █ ██ █ ██████  █  █ ████ 
 25.7 |███████████████ ████ ████████ ██████████████ ███████████████████████████████████
 22.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   5 ms | █  1
   6 ms | ██  2
   7 ms | █  1
   8 ms | █  1
   9 ms | ██  2
  10 ms | █  1
  11 ms | ██  2
  12 ms | ███  3
  13 ms | ███  3
  14 ms | ███  3
  15 ms | ████  4
  16 ms | ██████  6
  17 ms | ███████  7
  18 ms | ██  2
  19 ms | ███████  7
  20 ms | ██  2
  21 ms | ███  3
  22 ms | ████  4
  23 ms | █████  5
  24 ms | ████████████  13
  25 ms | ████████  8
  26 ms | █████  5
  27 ms | ███████  7
  28 ms | █████████  9
  29 ms | ████████████  13
  30 ms | ██████████████  15
  31 ms | ██████████████████████  23
  32 ms | ████████████████████████████████████████  42
  33 ms | █████████████████████  22
  34 ms | ██████████████████  19
  35 ms | ██████████████████  19
  36 ms | ████████████  13
  37 ms | ██████████  11
  38 ms | ██████  6
  39 ms | ██████████████  15
  40 ms | ██████████  11
  41 ms | ██████████████  15
  42 ms | █████████████  14
  43 ms | ██████████████  15
  44 ms | ██████████  10
  45 ms | ██████████████  15
  46 ms | ███████████████  16
  47 ms | █████████  9
  48 ms | ████████  8
  49 ms | ████████  8
  50 ms | ██████  6
  51 ms | ██████████  10
  52 ms | ████████  8
  53 ms | █████  5
  54 ms | ███████  7
  55 ms | █  1
  56 ms | ████  4
  57 ms | ███████  7
  58 ms | ████  4
  59 ms | ██████  6
  60 ms | █████  5
  61 ms | █  1
  62 ms | █████  5
  63 ms | ██████  6
  64 ms | █  1
  65 ms | █  1
  66 ms | ██  2
  68 ms | █  1
  69 ms | ██  2
  70 ms | ███  3
  72 ms | █  1
  73 ms | █  1
  74 ms | ██  2
  78 ms | █  1
  84 ms | █  1
  85 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
 103 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `11.00`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `849.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `9.67`
- `part` = `1.00`
- `fps_harmonic_avg` = `25.86`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `29.99`, min `13.28`, p50 `27.47`, p95 `53.96`, p99 `70.76`, 1%low `13.64`, 0.1%low `13.28`, std `12.75`

**Frame time (ms)**  avg `38.02`, p50 `36.40`, p95 `61.28`, p99 `70.84`, p99.9 `74.97`, max `75.31`

**Client tick (ms)**  avg `0.50`, p95 `0.79`, max `9.55`

**Memory**  start `7194 MB`, end `6725 MB`, peak `7355 MB`, GC `20 events / 242 ms`

**FPS over sampling window (ASCII):**

```
 42.0 |                 █                                                              
 40.4 |                 █                     █                                        
 38.9 |                 █                     █                                 █      
 37.3 |                 █                     █    █                            █      
 35.8 |      █          █                     █    █           █                █      
 34.2 |    █ ██         █      █        █    ██    █  █     █  █                █ █   █
 32.7 |    █ ██         █   █  █        █    ██ █  █  █ █  ██  █              █ █ █   █
 31.1 |  ███ ██   █     ██  ██ █ ██     █ █  ██ █  ██ █ █  ██  █ ███   █ ███  █ █ █   █
 29.6 |  ███████  █ █  ███  ██ █ ██    ████  █████ ██ ███  ██  █ ████  █ ███  █ █ █  ██
 28.0 | ███████████ █  ███  ██ █ █████ ████  █████ ███████████ ███████ █ ███  █ █ █ ███
 26.5 |███████████████ ███████ ████████████  █████ ██████████████████████████ █████ ███
 24.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms | █  1
   9 ms | █  1
  10 ms | █  1
  12 ms | █  1
  13 ms | █  1
  14 ms | ██████  5
  15 ms | █████  4
  16 ms | ████████  7
  17 ms | ██  2
  18 ms | █████████  8
  19 ms | █████████  8
  20 ms | ███████████  10
  21 ms | ████████  7
  22 ms | ██████████  9
  23 ms | ███████  6
  24 ms | ███████████████  13
  25 ms | ████████  7
  26 ms | █████████████  11
  27 ms | ███████  6
  28 ms | ██████████  9
  29 ms | ██████████  9
  30 ms | █████████████████  15
  31 ms | ███████████████████  17
  32 ms | ███████████████████████████████  27
  33 ms | ████████████████████████████████████████  35
  34 ms | ███████████████████  17
  35 ms | ███████████████████████  20
  36 ms | █████████████████████  18
  37 ms | ███████████████████████  20
  38 ms | █████████████████  15
  39 ms | █████████  8
  40 ms | █████████████████████████  22
  41 ms | ██████████  9
  42 ms | █████████████  11
  43 ms | ██████████  9
  44 ms | ██████████████  12
  45 ms | █████████  8
  46 ms | ████████████████  14
  47 ms | ███████████████  13
  48 ms | ██████████████  12
  49 ms | ███████████  10
  50 ms | ██████████  9
  51 ms | ██████████  9
  52 ms | ███  3
  53 ms | ██████  5
  54 ms | ███████  6
  55 ms | █████  4
  56 ms | ██████  5
  57 ms | █████  4
  58 ms | ████████  7
  59 ms | ██  2
  60 ms | ██████  5
  61 ms | █████████  8
  62 ms | ██  2
  64 ms | █  1
  65 ms | █  1
  66 ms | ███  3
  67 ms | █  1
  68 ms | █████  4
  69 ms | ██  2
  70 ms | █  1
  71 ms | ███  3
  74 ms | ██  2
  75 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `13.64`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `38.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `13.28`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.30`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `32.08`, min `11.42`, p50 `27.63`, p95 `64.17`, p99 `133.86`, 1%low `12.00`, 0.1%low `11.42`, std `20.49`

**Frame time (ms)**  avg `38.12`, p50 `36.19`, p95 `64.58`, p99 `78.01`, p99.9 `85.96`, max `87.56`

**Client tick (ms)**  avg `0.49`, p95 `0.83`, max `3.49`

**Memory**  start `6460 MB`, end `6476 MB`, peak `7380 MB`, GC `18 events / 250 ms`

**FPS over sampling window (ASCII):**

```
 47.1 |                                                               █     █          
 44.9 |                            █               █                  █     █          
 42.8 |          █                 █               █                  █ █   █          
 40.6 |          █                 █            █  █   █              █ █   █          
 38.4 |      █   █      █          █            █  █   █           █  █ █   ██  █    █ 
 36.3 |      █   ██     █   █      █         ██ █  █ █ █    █      █  █ █   ██  ██   █ 
 34.1 |      █   ██     █   █  █   █       █ ████  █ █ █    █      █  ███   ██  ██   █ 
 31.9 |█     ██  ██    ███  █  █   █  █   ██ ████  █ █ █    █ █   ███ ███   ██  ██   ██
 29.7 |█  ██ ██  ██ █  ███ ██████████ ███ ██ ████  █ █ █ █  █ ██  ███ ███   ███ ███ ███
 27.6 |█████ █████████ ███ █████████████████ █████ ███ ██████ ███ ███ █████████ ███████
 25.4 |███████████████ ███████████████████████████ ████████████████████████████████████
 23.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   6 ms | ███  2
   7 ms | ██████  5
   9 ms | ██████  5
  10 ms | █████  4
  11 ms | █████  4
  12 ms | ███  2
  14 ms | ███  2
  15 ms | █████  4
  16 ms | █████  4
  17 ms | █████  4
  18 ms | █████████  7
  19 ms | █████████  7
  20 ms | █████  4
  21 ms | ██████  5
  22 ms | ████████  6
  23 ms | ██████████  8
  24 ms | ████████████  9
  25 ms | ██████████████  11
  26 ms | ████████  6
  27 ms | ████████████  9
  28 ms | ████████████  9
  29 ms | ██████████  8
  30 ms | ██████████████████████  17
  31 ms | ██████████████████  14
  32 ms | ████████████████████████████████████████  31
  33 ms | ████████████████████████████████████████  31
  34 ms | ███████████████████████████████  24
  35 ms | █████████████████████  16
  36 ms | █████████████████████  16
  37 ms | ███████████████████████  18
  38 ms | ███████████████████████████  21
  39 ms | ████████████  9
  40 ms | ██████████████████  14
  41 ms | ████████████  9
  42 ms | ████████  6
  43 ms | █████████████████  13
  44 ms | ████████████  9
  45 ms | █████████████  10
  46 ms | ███████████████████  15
  47 ms | ██████████████  11
  48 ms | ████████████  9
  49 ms | ██████████  8
  50 ms | ██████████████  11
  51 ms | ███████████████  12
  52 ms | █████████  7
  53 ms | ██████  5
  54 ms | ████  3
  55 ms | ██████████  8
  56 ms | ████  3
  57 ms | ███  2
  58 ms | █████  4
  59 ms | █  1
  60 ms | █████  4
  61 ms | █  1
  62 ms | █████  4
  63 ms | ████  3
  64 ms | ██████  5
  65 ms | ███  2
  66 ms | ████  3
  68 ms | ███  2
  70 ms | ████  3
  71 ms | █████  4
  72 ms | ███  2
  75 ms | █  1
  76 ms | █  1
  77 ms | █  1
  78 ms | █  1
  79 ms | █  1
  81 ms | █  1
  84 ms | ███  2
  87 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `12.00`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `75.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `11.42`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.24`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23250 ms  |  Sample ticks: 400

**FPS**  avg `30.33`, min `9.60`, p50 `27.79`, p95 `51.19`, p99 `94.86`, 1%low `11.31`, 0.1%low `9.60`, std `17.55`

**Frame time (ms)**  avg `38.70`, p50 `35.99`, p95 `64.38`, p99 `74.95`, p99.9 `98.54`, max `104.15`

**Client tick (ms)**  avg `0.56`, p95 `1.23`, max `8.86`

**Memory**  start `6764 MB`, end `5123 MB`, peak `7374 MB`, GC `21 events / 255 ms`

**FPS over sampling window (ASCII):**

```
 68.8 |                    █                                                           
 64.6 |                    █                                                           
 60.4 |                    █                                                           
 56.2 |                    █                                                           
 52.0 |                    █                                                           
 47.8 |█                   █                                                           
 43.6 |█                   █     █               █                                     
 39.4 |█                   █     █           █   █          █                          
 35.2 |█ █        █        █     █           █ █ █     █    █ █            █    █ █   █
 31.0 |█ █ █   █  ███   ████  █  ██    █   █ ███ █ █  ███ ███ █   ██ ███ █ ██ ███ ███ █
 26.8 |█ ███████ ████████████████████████████████████████████████████████████████ █████
 22.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   7 ms | ████  3
   8 ms | █  1
  10 ms | █  1
  11 ms | █  1
  12 ms | █  1
  14 ms | ███  2
  15 ms | ██████  4
  16 ms | █  1
  17 ms | ███  2
  18 ms | ███████████  8
  19 ms | ███████  5
  20 ms | ███████████  8
  21 ms | ████████████████  11
  22 ms | █████████████████  12
  23 ms | █████████████  9
  24 ms | █████████████  9
  25 ms | ███████████  8
  26 ms | █████████  6
  27 ms | █████████████████████  15
  28 ms | ████████████████  11
  29 ms | ████████████████████  14
  30 ms | ███████████  8
  31 ms | ██████████████████████████████████  24
  32 ms | ████████████████████████████████████████  28
  33 ms | ███████████████████████████████████████  27
  34 ms | ███████████████████████████████  22
  35 ms | ████████████████████████  17
  36 ms | █████████████████  12
  37 ms | ████████████████████████  17
  38 ms | ██████████████  10
  39 ms | ████████████████████  14
  40 ms | ███████████████████  13
  41 ms | █████████████████  12
  42 ms | █████████████  9
  43 ms | ███████████████████  13
  44 ms | ███████████  8
  45 ms | █████████████████  12
  46 ms | ██████████████  10
  47 ms | █████████████████  12
  48 ms | ████████████████  11
  49 ms | █████████  6
  50 ms | ████████████████  11
  51 ms | █████████████  9
  52 ms | ██████  4
  53 ms | ████  3
  54 ms | ███  2
  55 ms | ██████  4
  56 ms | ██████  4
  57 ms | ███  2
  58 ms | ████  3
  59 ms | ██████████████  10
  60 ms | █████████  6
  61 ms | █████████  6
  62 ms | ████  3
  63 ms | ██████  4
  64 ms | ███████  5
  65 ms | █  1
  66 ms | ███████  5
  67 ms | █  1
  68 ms | ███  2
  69 ms | ██████  4
  70 ms | ███  2
  72 ms | ███  2
  75 ms | ███  2
  78 ms | █  1
  90 ms | █  1
  93 ms | █  1
 104 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `11.31`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `14.00`
- `entity_count_delta` = `-13.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `210.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `9.60`
- `part` = `1.00`
- `fps_harmonic_avg` = `25.84`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24771 ms  |  Sample ticks: 400

**FPS**  avg `30.17`, min `9.08`, p50 `27.88`, p95 `52.05`, p99 `92.41`, 1%low `10.89`, 0.1%low `9.08`, std `17.12`

**Frame time (ms)**  avg `38.61`, p50 `35.86`, p95 `63.04`, p99 `73.02`, p99.9 `103.44`, max `110.18`

**Client tick (ms)**  avg `0.48`, p95 `0.83`, max `6.00`

**Memory**  start `6154 MB`, end `6680 MB`, peak `7370 MB`, GC `20 events / 252 ms`

**FPS over sampling window (ASCII):**

```
 62.8 |                                                                           █    
 59.3 |                                                                           █    
 55.8 |                                                                           █    
 52.3 |                                                                           █    
 48.8 |                                                                           █    
 45.3 |                                                                           █    
 41.8 |                                █                              █           █    
 38.3 |                                █                   █          █           █    
 34.8 |      █               █         █ █         █       █          █ █ █       █   █
 31.2 | ███  █      █ ███    █   ███  ████ █ ██    █ █     █     █    ███ █ █  █  ██  █
 27.7 |████ █████ ███████ ██ ███ ███ █████████████ ████ ██ █████ ██████████████████████
 24.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   7 ms | ██  2
   9 ms | █  1
  10 ms | ██  2
  11 ms | ███  3
  12 ms | ██  2
  13 ms | █  1
  14 ms | █  1
  15 ms | ███  3
  16 ms | █████  5
  17 ms | ████  4
  19 ms | ██████  6
  20 ms | █████  5
  21 ms | ███████████  11
  22 ms | ██████  6
  23 ms | █████████  9
  24 ms | █████  5
  25 ms | ███████  7
  26 ms | ███████████  11
  27 ms | ██████████  10
  28 ms | ███████  7
  29 ms | ███████████  11
  30 ms | ███████████  11
  31 ms | ████████████████  16
  32 ms | █████████████████████████████████  32
  33 ms | ████████████████████████████████████████  39
  34 ms | ████████████████████████████████  31
  35 ms | █████████████████████  20
  36 ms | ██████████████████  18
  37 ms | ██████████████  14
  38 ms | ████████  8
  39 ms | ███████████  11
  40 ms | ██████████  10
  41 ms | ████████████  12
  42 ms | █████████████████  17
  43 ms | █████████  9
  44 ms | ██████  6
  45 ms | ██████████████  14
  46 ms | ███████████████  15
  47 ms | ████████████  12
  48 ms | ████████  8
  49 ms | █████████████  13
  50 ms | ██████████  10
  51 ms | ███████████  11
  52 ms | █████  5
  53 ms | ███  3
  54 ms | ████  4
  55 ms | ████  4
  56 ms | ██  2
  57 ms | ████  4
  58 ms | ████  4
  59 ms | █████  5
  60 ms | █████  5
  61 ms | ███  3
  62 ms | ███  3
  63 ms | ███  3
  64 ms | ██████  6
  67 ms | █  1
  68 ms | ███  3
  69 ms | ██  2
  70 ms | ██  2
  71 ms | ██  2
  72 ms | █  1
  73 ms | █  1
  75 ms | █  1
  85 ms | █  1
  90 ms | █  1
  97 ms | █  1
 110 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `10.89`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-5.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1703.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `9.08`
- `part` = `1.00`
- `fps_harmonic_avg` = `25.90`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `60.00`
- `z_offset_used` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `30.60`, min `11.26`, p50 `27.39`, p95 `55.59`, p99 `96.69`, 1%low `12.80`, 0.1%low `11.26`, std `15.79`

**Frame time (ms)**  avg `37.98`, p50 `36.51`, p95 `61.97`, p99 `71.30`, p99.9 `86.83`, max `88.83`

**Client tick (ms)**  avg `0.59`, p95 `0.93`, max `17.83`

**Memory**  start `7053 MB`, end `6838 MB`, peak `7376 MB`, GC `21 events / 246 ms`

**FPS over sampling window (ASCII):**

```
 49.6 |                                                      █                         
 47.2 |                                                      █                         
 44.8 |                                                      █                         
 42.3 |                            █           █             █                         
 39.9 |                            █           █             █            █            
 37.5 |                      █     █           █           █ █            █            
 35.1 |    █  █   █    █     █     █          ██           █ █ █        █ █     █      
 32.7 |█   █  █   ██   █     ██   ██  █       ██           █ █ ██ █   █ █ █    ██   █  
 30.2 |█████  ██  ██   ██ ██████ ███████    █ ██ ███   █  ██ █ ██ █  ██ █ ███  ██   ██ 
 27.8 |█████████████ █ ██ ██████ ███████████████████ ████████████ █ ███ █ ████ ████ ██ 
 25.4 |███████████████████████████████████████████████████████████████████████ ████ ███
 23.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   7 ms | ███  2
   9 ms | █  1
  10 ms | ████  3
  11 ms | ████  3
  12 ms | ████  3
  13 ms | ███  2
  14 ms | ███  2
  15 ms | ███  2
  16 ms | ████  3
  17 ms | ██████  5
  18 ms | █████  4
  19 ms | ████████████  9
  20 ms | ███  2
  21 ms | █████████████  10
  22 ms | ███████████████  12
  23 ms | █████████  7
  24 ms | ██████  5
  25 ms | █████████████  10
  26 ms | ██████████  8
  27 ms | ██████████  8
  28 ms | █████████████████  13
  29 ms | ████████████  9
  30 ms | █████████████████  13
  31 ms | █████████████████  13
  32 ms | ███████████████████████████████████████  30
  33 ms | ████████████████████████████████████████  31
  34 ms | ██████████████████████████████████  26
  35 ms | ████████████████████████████  22
  36 ms | ██████████████████████  17
  37 ms | ████████████████████████████  22
  38 ms | █████████████████  13
  39 ms | ██████████████████  14
  40 ms | ████████████  9
  41 ms | ████████████  9
  42 ms | ██████████████  11
  43 ms | █████████████████  13
  44 ms | ███████████████████████  18
  45 ms | ████████████  9
  46 ms | ███████████████████  15
  47 ms | ██████████████  11
  48 ms | ██████████████████████  17
  49 ms | █████████  7
  50 ms | ██████  5
  51 ms | █████████  7
  52 ms | █████████████  10
  53 ms | ██████████  8
  54 ms | ████  3
  55 ms | █████  4
  56 ms | ██████  5
  58 ms | █████████  7
  59 ms | ███  2
  60 ms | ████  3
  61 ms | ███  2
  62 ms | ████  3
  63 ms | █████  4
  64 ms | ██████  5
  65 ms | ███  2
  67 ms | █  1
  68 ms | ███  2
  70 ms | ████  3
  71 ms | ████  3
  72 ms | ███  2
  85 ms | █  1
  88 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `12.80`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `4.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `11.26`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.33`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25301 ms  |  Sample ticks: 400

**FPS**  avg `32.26`, min `12.67`, p50 `27.83`, p95 `65.74`, p99 `147.08`, 1%low `13.25`, 0.1%low `12.67`, std `22.64`

**Frame time (ms)**  avg `38.02`, p50 `35.93`, p95 `63.30`, p99 `71.81`, p99.9 `77.66`, max `78.90`

**Client tick (ms)**  avg `0.51`, p95 `0.97`, max `4.44`

**Memory**  start `5634 MB`, end `5579 MB`, peak `7380 MB`, GC `22 events / 258 ms`

**FPS over sampling window (ASCII):**

```
 65.3 |                                                                           █    
 61.6 |                                                                           █    
 57.9 |                                                    █                      █    
 54.2 |                                                    █                   █  █    
 50.5 |          █                                         █                 █ █  █    
 46.8 |          █                                         █                 █ █  █    
 43.0 |          █                                      █  █                 █ █  █    
 39.3 |          █                   █                  █  ██                █ █ ██    
 35.6 |   █    █ █       █   █       █  █    ██         █  ██         █ █   ██ █ ██    
 31.9 |█  █ ██ █ █    █  ███ █    █  █  █    ███ █ █ █  █████ █ █   █ ███  █████ ██  █ 
 28.2 |██ ██████████████ ███████████ ██████ ███████████████████ ███████████████████████
 24.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | ██  2
   5 ms | █  1
   6 ms | ████  3
   7 ms | █  1
   8 ms | ██  2
   9 ms | █  1
  10 ms | ██  2
  11 ms | ██  2
  12 ms | █  1
  13 ms | ███████  6
  14 ms | ██████  5
  15 ms | █████  4
  16 ms | ██████████  8
  17 ms | ███████  6
  18 ms | ██  2
  19 ms | ████  3
  20 ms | ██  2
  21 ms | ████████  7
  22 ms | ████████████  10
  23 ms | ██████  5
  24 ms | ██████  5
  25 ms | █████████████  11
  26 ms | █████████████  11
  27 ms | ███████████████  12
  28 ms | ███████████████  12
  29 ms | ██████████████████  15
  30 ms | ███████████  9
  31 ms | █████████████████████  17
  32 ms | ████████████████████████████████████████  33
  33 ms | ██████████████████████████████████████  31
  34 ms | ██████████████████████  18
  35 ms | █████████████████████  17
  36 ms | ██████████████████  15
  37 ms | ███████████████████████  19
  38 ms | ████████████  10
  39 ms | ███████  6
  40 ms | ████████████  10
  41 ms | █████████████████  14
  42 ms | ██████████████████  15
  43 ms | ███████  6
  44 ms | █████████████  11
  45 ms | ████████████  10
  46 ms | █████████████████  14
  47 ms | █████████████  11
  48 ms | █████████████  11
  49 ms | █████████████████  14
  50 ms | ███████  6
  51 ms | ██████  5
  52 ms | ████████████  10
  53 ms | ████████  7
  54 ms | ███████  6
  55 ms | █████  4
  56 ms | ███████  6
  57 ms | ████  3
  58 ms | ████  3
  59 ms | ███████  6
  60 ms | ████████  7
  61 ms | ████  3
  62 ms | █████  4
  63 ms | ██  2
  64 ms | ██  2
  65 ms | █████  4
  66 ms | ████  3
  67 ms | ██  2
  68 ms | ████  3
  69 ms | █  1
  70 ms | ████  3
  71 ms | ██  2
  73 ms | ██  2
  74 ms | █  1
  76 ms | █  1
  78 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `13.25`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `43.00`
- `entity_count_delta` = `-42.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `2264.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `12.67`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.30`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23502 ms  |  Sample ticks: 400

**FPS**  avg `31.40`, min `11.98`, p50 `27.86`, p95 `61.62`, p99 `118.50`, 1%low `12.87`, 0.1%low `11.98`, std `19.82`

**Frame time (ms)**  avg `38.26`, p50 `35.89`, p95 `62.20`, p99 `74.35`, p99.9 `80.95`, max `83.50`

**Client tick (ms)**  avg `0.62`, p95 `1.23`, max `5.03`

**Memory**  start `6549 MB`, end `6678 MB`, peak `7376 MB`, GC `22 events / 261 ms`

**FPS over sampling window (ASCII):**

```
 57.0 |                                  █                                             
 53.9 |                                  █             █                               
 50.9 |                                  █             █                               
 47.9 |                                  █             █                               
 44.9 |                                  █             █ █                           █ 
 41.9 |    █                             █             █ █      █                    █ 
 38.9 |    █  █                          █             █ █      ██            █      █ 
 35.9 |    █  ██          █      █       █             █ ██  █  ███    █    █ █      █ 
 32.9 |  █ █  ███         █ █  █ ██    █ █    █        █ ███ █  █████  █    █ █ █   ██ 
 29.9 |█ █ █  ████ █  █ █ █ █  █ ███  ██ ████ ██    ██ █████ ████████  █ █  █ █ ██████ 
 26.9 |██████████████████████████████████████ █████████████████████████████ ███ ███████
 23.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
   5 ms | █  1
   7 ms | ██  2
   8 ms | ████  3
   9 ms | ██  2
  10 ms | ████  3
  11 ms | █  1
  12 ms | █████  4
  13 ms | ██  2
  14 ms | ████  3
  15 ms | ████  3
  16 ms | ██████████  8
  17 ms | ██████  5
  18 ms | ████  3
  19 ms | ██  2
  20 ms | ████  3
  21 ms | ████  3
  22 ms | ███████████  9
  23 ms | ██████████  8
  24 ms | ████████████████  13
  25 ms | ████████  7
  26 ms | ███████████  9
  27 ms | ██████████████████  15
  28 ms | ██████████  8
  29 ms | ████████████  10
  30 ms | █████████████████  14
  31 ms | █████████████████████████████  24
  32 ms | ████████████████████████████  23
  33 ms | ████████████████████████████████  26
  34 ms | ████████████████████████████████████████  33
  35 ms | ██████████████████  15
  36 ms | ███████████████  12
  37 ms | ███████████████  12
  38 ms | █████████████  11
  39 ms | ███████████████  12
  40 ms | ████████████  10
  41 ms | █████████████  11
  42 ms | ███████████  9
  43 ms | ███████████████████  16
  44 ms | █████████████████████  17
  45 ms | ████████████████  13
  46 ms | ████████  7
  47 ms | ████████████████  13
  48 ms | ██████  5
  49 ms | ███████████  9
  50 ms | █████████████  11
  51 ms | ███████  6
  52 ms | ██████████  8
  53 ms | ███████████  9
  54 ms | ██████  5
  55 ms | ███████████  9
  56 ms | ███████  6
  57 ms | ███████  6
  58 ms | █████  4
  59 ms | █████  4
  60 ms | ████  3
  61 ms | ████  3
  62 ms | ███████  6
  63 ms | ██  2
  64 ms | █  1
  65 ms | ████  3
  67 ms | █  1
  68 ms | █████  4
  69 ms | ████  3
  71 ms | █  1
  73 ms | █  1
  74 ms | ████  3
  75 ms | █  1
  76 ms | █  1
  78 ms | █  1
  83 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `12.87`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `34.00`
- `entity_count_delta` = `-28.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `6.00`
- `preload_duration_ms` = `447.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `11.98`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.13`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23683 ms  |  Sample ticks: 400

**FPS**  avg `31.02`, min `13.58`, p50 `26.74`, p95 `57.05`, p99 `97.61`, 1%low `14.07`, 0.1%low `13.58`, std `25.59`

**Frame time (ms)**  avg `38.26`, p50 `37.39`, p95 `59.79`, p99 `69.62`, p99.9 `72.15`, max `73.61`

**Client tick (ms)**  avg `0.44`, p95 `0.64`, max `4.43`

**Memory**  start `6750 MB`, end `6408 MB`, peak `7371 MB`, GC `26 events / 282 ms`

**FPS over sampling window (ASCII):**

```
 99.9 |           █                                                                    
 93.0 |           █                                                                    
 86.1 |           █                                                                    
 79.1 |           █                                                                    
 72.2 |           █                                                                    
 65.3 |           █                                                                    
 58.3 |           █     █                                   █                          
 51.4 |           █     █           █                       █                          
 44.4 |           █  █  █           █                       █                          
 37.5 |           █  █  █    █      █           █  ██  █  █ █    █       █             
 30.6 |█████████ ██ ██  ███  ███████████ █████  ██ ██ ██ ██ ███  █████ ███████  ██ ██  
 23.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | █  1
   4 ms | ██  2
   5 ms | █  1
   8 ms | █  1
   9 ms | █  1
  11 ms | █  1
  12 ms | █  1
  13 ms | ████  4
  14 ms | ███  3
  15 ms | █████  5
  16 ms | █████  5
  17 ms | ████  4
  18 ms | ████  4
  19 ms | █  1
  20 ms | ███████  7
  21 ms | ███████  7
  22 ms | ████████  8
  23 ms | ███  3
  24 ms | ███████  7
  25 ms | ███████  7
  26 ms | █████████████  12
  27 ms | ████  4
  28 ms | ███████████  10
  29 ms | ███████  7
  30 ms | █████████████████  16
  31 ms | ████████████  11
  32 ms | ███████████████████████████  26
  33 ms | ████████████████████████████████████████  38
  34 ms | ███████████████████  18
  35 ms | ████████████████████  19
  36 ms | █████████████████  16
  37 ms | ████████████████████  19
  38 ms | ███████████████████████  22
  39 ms | ████████████████  15
  40 ms | █████████████████  16
  41 ms | █████████████  12
  42 ms | ████████████████  15
  43 ms | ████████████  11
  44 ms | █████████████████████  20
  45 ms | ██████████████████  17
  46 ms | █████████████████  16
  47 ms | ████████████  11
  48 ms | █████████  9
  49 ms | ███████████  10
  50 ms | ███████████  10
  51 ms | ███████  7
  52 ms | ███████████  10
  53 ms | ██████  6
  54 ms | █████  5
  55 ms | ██  2
  56 ms | ██  2
  57 ms | █████  5
  58 ms | ██  2
  59 ms | █████  5
  60 ms | ██  2
  61 ms | ███  3
  62 ms | ██  2
  63 ms | ██████  6
  64 ms | █  1
  65 ms | ████  4
  67 ms | █  1
  69 ms | ██  2
  70 ms | ████  4
  73 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `14.07`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `671.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `13.58`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.14`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `56.00`
- `z_offset_used` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `31.09`, min `9.51`, p50 `28.08`, p95 `60.39`, p99 `123.67`, 1%low `11.70`, 0.1%low `9.51`, std `18.13`

**Frame time (ms)**  avg `38.29`, p50 `35.61`, p95 `62.76`, p99 `74.89`, p99.9 `99.33`, max `105.12`

**Client tick (ms)**  avg `0.54`, p95 `0.86`, max `9.29`

**Memory**  start `5993 MB`, end `6891 MB`, peak `7374 MB`, GC `23 events / 273 ms`

**FPS over sampling window (ASCII):**

```
 66.2 |           █                                                                    
 62.2 |           █                                                                    
 58.2 |           █                                                                    
 54.2 |           █                                                                    
 50.2 |           █                                                                    
 46.3 |           █                             █                                      
 42.3 |         █ █                        █    █                                     █
 38.3 |         █ █    █                ██ █    ██                              █     █
 34.3 |         █ █   ███      ██  █    ██ █    ██               █  █   █       █   █ █
 30.3 |█ ███  ███████ ███ ████ ██████ ████ ███  ███   █ █ █  ██  █  █████ ██  █ ███ █ █
 26.3 |██████████████████████████████████████████████████████████████████ █████████ ███
 22.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   6 ms | █  1
   7 ms | █████  4
   8 ms | █  1
   9 ms | █  1
  10 ms | ██  2
  11 ms | ██  2
  12 ms | █  1
  13 ms | █████  4
  14 ms | █████  4
  15 ms | ██  2
  16 ms | █████  4
  17 ms | █████  4
  18 ms | ███████  6
  19 ms | ██████  5
  20 ms | ███  3
  21 ms | ███████████  10
  22 ms | ███████  6
  23 ms | ███████  6
  24 ms | █████  4
  25 ms | ███████████  10
  26 ms | ████████████████  14
  27 ms | ██████████  9
  28 ms | █████████████  11
  29 ms | █████████  8
  30 ms | █████████████████  15
  31 ms | █████████████████████████  22
  32 ms | ████████████████████████████████  28
  33 ms | ████████████████████████████████████████  35
  34 ms | ███████████████████████████  24
  35 ms | ██████████████████████  19
  36 ms | ██████████████████████  19
  37 ms | ██████████  9
  38 ms | ██████████████  12
  39 ms | ███████████████  13
  40 ms | ███████████  10
  41 ms | ██████  5
  42 ms | ██████████████████  16
  43 ms | ██████████████  12
  44 ms | █████████  8
  45 ms | ███████████████  13
  46 ms | ████████  7
  47 ms | █████████████  11
  48 ms | ██████████████  12
  49 ms | ███████  6
  50 ms | ███████████  10
  51 ms | ████████  7
  52 ms | ███████████  10
  53 ms | ██████████  9
  54 ms | ██████  5
  55 ms | █████████  8
  56 ms | ████████  7
  57 ms | ██████  5
  58 ms | ███████  6
  59 ms | █████  4
  60 ms | █  1
  61 ms | ██  2
  62 ms | █████  4
  63 ms | █████  4
  64 ms | ███  3
  65 ms | ██████  5
  66 ms | ██  2
  67 ms | █  1
  68 ms | █  1
  70 ms | █  1
  71 ms | █  1
  73 ms | ██  2
  75 ms | ███  3
  76 ms | █  1
  94 ms | █  1
 105 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `11.70`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `54.00`
- `entity_count_delta` = `-51.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `71.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `9.51`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.12`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `30.17`, min `11.03`, p50 `27.30`, p95 `57.41`, p99 `76.84`, 1%low `12.50`, 0.1%low `11.03`, std `13.75`

**Frame time (ms)**  avg `38.24`, p50 `36.63`, p95 `63.89`, p99 `74.88`, p99.9 `86.12`, max `90.65`

**Client tick (ms)**  avg `0.49`, p95 `0.73`, max `5.50`

**Memory**  start `6720 MB`, end `7249 MB`, peak `7373 MB`, GC `23 events / 254 ms`

**FPS over sampling window (ASCII):**

```
 50.3 |                                                                              █ 
 47.9 |                                                                              █ 
 45.4 |                                                                              █ 
 42.9 |                                                █                             █ 
 40.4 |   █ █                                          █                             █ 
 38.0 |   █ █           █                              █                             █ 
 35.5 | █ █ █           █                              █                           █ █ 
 33.0 | █ █ █  █ █      █ █ █     █ █ █ █   █     █    ██     █   █    ██    █     █ █ 
 30.5 | ███ █  █ █      █ █ █ █ █ █ █ ███  ██     █ ██ ██ ██████ ██ ██ ██   ██ ██ ██ █ 
 28.1 | █████  █ ████████████ █████ █ ████ █████  █ ██ █████████ ████████████████ ██ █ 
 25.6 |██████████████████████ ████████████████████████ █████████████████████████████ ██
 23.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | █  1
   9 ms | ████  3
  12 ms | ██  2
  13 ms | █████  4
  14 ms | ██████  5
  15 ms | ████  3
  16 ms | ███████  6
  17 ms | ████████  7
  18 ms | █████  4
  19 ms | ███████  6
  20 ms | █████████  8
  21 ms | ███████  6
  22 ms | █████████  8
  23 ms | ██████████████  12
  24 ms | ███████████  9
  25 ms | ████████  7
  26 ms | ███████  6
  27 ms | █████████  8
  28 ms | █████████  8
  29 ms | █████████  8
  30 ms | ███████████████  13
  31 ms | ███████████████████  16
  32 ms | ██████████████████████████████████  29
  33 ms | ████████████████████████████████████████  34
  34 ms | ██████████████████████████  22
  35 ms | ████████████████  14
  36 ms | ████████████████████  17
  37 ms | ██████████████████████  19
  38 ms | ██████████████████  15
  39 ms | ███████████████████  16
  40 ms | ███████████████  13
  41 ms | ████████████████████  17
  42 ms | ███████████████████  16
  43 ms | ███████████████  13
  44 ms | ███████████████  13
  45 ms | ███████████████  13
  46 ms | ███████████  9
  47 ms | █████████  8
  48 ms | █████████  8
  49 ms | ███████████████  13
  50 ms | ████████  7
  51 ms | ████  3
  52 ms | █████  4
  53 ms | ███████  6
  54 ms | ███████████  9
  55 ms | █████  4
  56 ms | █████  4
  57 ms | ██████  5
  58 ms | █  1
  59 ms | ████  3
  60 ms | ██  2
  61 ms | ████  3
  62 ms | █████  4
  63 ms | ████  3
  64 ms | ████  3
  65 ms | ██  2
  66 ms | ████  3
  67 ms | ██  2
  68 ms | ████  3
  70 ms | ██  2
  71 ms | ██  2
  73 ms | █  1
  74 ms | ████  3
  75 ms | ██  2
  76 ms | █  1
  81 ms | █  1
  90 ms | █  1
```

**Extras:**

- `scan_fallback` = `false`
- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `12.50`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `3.00`
- `entity_count_delta` = `11.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `14.00`
- `preload_duration_ms` = `70.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `11.03`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.15`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `57.00`
- `z_offset_used` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23093 ms  |  Sample ticks: 400

**FPS**  avg `29.68`, min `10.66`, p50 `27.01`, p95 `49.15`, p99 `81.25`, 1%low `12.37`, 0.1%low `10.66`, std `29.84`

**Frame time (ms)**  avg `39.70`, p50 `37.02`, p95 `58.38`, p99 `73.38`, p99.9 `87.46`, max `93.79`

**Client tick (ms)**  avg `0.41`, p95 `0.55`, max `20.54`

**Memory**  start `6929 MB`, end `6918 MB`, peak `7379 MB`, GC `83 events / 1575 ms`

**FPS over sampling window (ASCII):**

```
111.9 |                                     █                                          
103.8 |                                     █                                          
 95.6 |                                     █                                          
 87.5 |                                     █                                          
 79.3 |                                     █                                          
 71.2 |                                     █                                          
 63.0 |                                     █           █                █             
 54.9 |                                     █           █                █             
 46.7 |                                     █           ██               █             
 38.6 |                                    ██       █   ██               █             
 30.4 |█  ██████ █ ██ █ █  ███ █   ███  █ █████ ███ █  ████ ████  ████ ███████   ████ █
 22.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms |   1
   3 ms | █  2
   7 ms |   1
  12 ms | █  3
  13 ms |   1
  15 ms | █  3
  16 ms |   1
  17 ms | █  2
  18 ms | ███  6
  19 ms | ██  4
  20 ms | ███  7
  21 ms | █  2
  22 ms | █  3
  23 ms | ███  6
  24 ms | ██  5
  25 ms | █  3
  26 ms | █████  10
  27 ms | ██  4
  28 ms |   1
  30 ms | █  2
  31 ms | █  2
  32 ms | █████████████████████  43
  33 ms | ████████████████████████████████████████  82
  34 ms | █████████████████  35
  35 ms | ███████  15
  36 ms | ███  7
  37 ms | ██  5
  38 ms | █████  11
  39 ms | ██  5
  40 ms | ████  8
  41 ms | █████  10
  42 ms | █████  11
  43 ms | ███████████  23
  44 ms | ████████  17
  45 ms | ███████  14
  46 ms | ██████████  21
  47 ms | ███████  15
  48 ms | █████  11
  49 ms | ████████  16
  50 ms | ████████  16
  51 ms | █████  10
  52 ms | ████  9
  53 ms | ████  9
  54 ms | ███  6
  55 ms | █  3
  56 ms |   1
  57 ms | ██  4
  58 ms | █  3
  59 ms |   1
  62 ms | █  2
  63 ms |   1
  64 ms |   1
  66 ms |   1
  67 ms | ██  4
  69 ms | █  3
  70 ms |   1
  71 ms |   1
  72 ms | █  3
  73 ms |   1
  74 ms |   1
  76 ms |   1
  78 ms |   1
  81 ms |   1
  93 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `10.66`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `46.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `12.37`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `25.19`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23148 ms  |  Sample ticks: 400

**FPS**  avg `32.01`, min `8.57`, p50 `25.72`, p95 `67.92`, p99 `163.08`, 1%low `10.08`, 0.1%low `n/a`, std `24.59`

**Frame time (ms)**  avg `41.82`, p50 `38.87`, p95 `76.46`, p99 `93.00`, p99.9 `106.84`, max `116.73`

**Client tick (ms)**  avg `9.85`, p95 `17.69`, max `46.41`

**Memory**  start `5475 MB`, end `7374 MB`, peak `7393 MB`, GC `81 events / 1542 ms`

**FPS over sampling window (ASCII):**

```
 58.2 |                                                                      █    █    
 54.9 |                                                                     ██  █ █    
 51.7 |       █                                                             ██  █ █    
 48.4 |       █                                 █ █                         ██  █ █    
 45.1 |       █                           █     █ █                         ██  █ █    
 41.9 | █     █  █                        █     █ █   █    █                ██  █ █    
 38.6 | █     █  █         █             ██   █ █ █   █    █                ██  █ █    
 35.3 | █     █  █         █             ██  ██ █ █   █  █ ██           █   ██  ███ █  
 32.0 |██  ██ █ ██    █    █ █  █   █ █  ██  ██ ████  █ █████      ██  ██   ██  ███ █  
 28.8 |██  ██ █ ██ █  █  █ █ █  █ █ █ █████ ████████ ████████ ██ █ ███████  ██ ████ ██ 
 25.5 |█████████████████ ███ ████████████████████████████████ ████████████  ███████ ███
 22.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | ████████  4
   6 ms | ████████  4
   7 ms | ██  1
   8 ms | ██████  3
  10 ms | ████████  4
  11 ms | ██  1
  12 ms | ██████  3
  13 ms | ██████  3
  14 ms | ███████████  5
  15 ms | ████  2
  16 ms | ███████████████████  9
  17 ms | ██████  3
  18 ms | ███████████████  7
  19 ms | ████████  4
  20 ms | ███████████  5
  21 ms | ███████████████  7
  22 ms | ███████████  5
  23 ms | ███████████████████  9
  24 ms | ███████████████████  9
  25 ms | █████████████████  8
  26 ms | ███████████████████████████  13
  27 ms | ███████████████████  9
  28 ms | █████████████████  8
  29 ms | █████████████████████████  12
  30 ms | ████████████████████████████████████  17
  31 ms | ███████████████  7
  32 ms | ████████████████████████████████████████  19
  33 ms | █████████████████████████████  14
  34 ms | ██████████████████████████████████  16
  35 ms | █████████████  6
  36 ms | ███████████  5
  37 ms | █████████████████  8
  38 ms | ███████████████████████  11
  39 ms | ███████████  5
  40 ms | ███████████████████████  11
  41 ms | ███████████████████████  11
  42 ms | █████████████  6
  43 ms | ███████████████  7
  44 ms | █████████████  6
  45 ms | █████████████████████████  12
  46 ms | ███████████████  7
  47 ms | ███████████████  7
  48 ms | ████████  4
  49 ms | ███████████████████████  11
  50 ms | ███████████████  7
  51 ms | ███████████████  7
  52 ms | ███████████████  7
  53 ms | ██  1
  54 ms | ███████████  5
  55 ms | ████████████████████████████████  15
  56 ms | ███████████████████  9
  57 ms | ████████  4
  58 ms | █████████████████████  10
  59 ms | ███████████  5
  60 ms | ███████████████████  9
  61 ms | ███████████████  7
  62 ms | ████████  4
  63 ms | ██  1
  64 ms | ██████  3
  65 ms | ██  1
  66 ms | ████  2
  67 ms | ████████  4
  68 ms | ██████  3
  69 ms | ███████████  5
  70 ms | ██████  3
  71 ms | ████  2
  72 ms | ██████  3
  73 ms | ██████  3
  74 ms | ████  2
  75 ms | ████  2
  76 ms | ████  2
  77 ms | ████████  4
  78 ms | ██  1
  79 ms | ██  1
  82 ms | ████  2
  85 ms | ████  2
  87 ms | ██  1
  88 ms | ████████  4
  89 ms | ██  1
  90 ms | ██  1
  92 ms | ████  2
  93 ms | ██  1
  94 ms | ████  2
  95 ms | ██  1
 116 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `23.91`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `10.08`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `36.00`
- `seed` = `2521.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23162 ms  |  Sample ticks: 400

**FPS**  avg `26.61`, min `7.33`, p50 `22.76`, p95 `42.62`, p99 `69.57`, 1%low `7.67`, 0.1%low `n/a`, std `41.12`

**Frame time (ms)**  avg `53.09`, p50 `43.94`, p95 `112.18`, p99 `124.68`, p99.9 `134.90`, max `136.50`

**Client tick (ms)**  avg `0.49`, p95 `1.01`, max `18.93`

**Memory**  start `6090 MB`, end `7209 MB`, peak `7390 MB`, GC `109 events / 1813 ms`

**FPS over sampling window (ASCII):**

```
177.5 |                                                                █               
162.2 |                                                                █               
146.9 |                          █                                     █               
131.6 |                          █                                     █               
116.3 |                          █                                     █               
101.0 |                          █                                     █               
 85.7 |                          █                                     █               
 70.4 |                          █                                     █               
 55.1 |                          █                             █       █               
 39.7 |      █                   █      █      █       █       █       █               
 24.4 |████████████████████████████████████████████████████████████████████████████    
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  1
   2 ms | █  1
   7 ms | █  1
  12 ms | █  1
  14 ms | █  1
  17 ms | ███  2
  18 ms | ███  2
  20 ms | ███  2
  21 ms | █████  4
  22 ms | █████  4
  23 ms | ███  2
  24 ms | ███  2
  25 ms | █████  4
  26 ms | █████  4
  27 ms | ████████  6
  28 ms | ███  2
  29 ms | ███  2
  30 ms | ███████  5
  31 ms | █████████████  10
  32 ms | ████████████████████████████████████  27
  33 ms | ████████████████████████████████████████  30
  34 ms | ████████████████████  15
  35 ms | ███████████  8
  36 ms | ████████  6
  37 ms | ████████  6
  38 ms | ███████  5
  39 ms | ████████  6
  40 ms | █████████  7
  41 ms | ████████  6
  42 ms | █████  4
  43 ms | ████████████████████  15
  44 ms | █████████████  10
  45 ms | ███████████  8
  46 ms | ████████████  9
  47 ms | ███████████████  11
  48 ms | ████████████  9
  49 ms | █████████  7
  50 ms | ███████████  8
  51 ms | ███████████  8
  52 ms | ███████████  8
  53 ms | ███████████  8
  54 ms | ███  2
  55 ms | ███████  5
  56 ms | █  1
  57 ms | █  1
  60 ms | █████  4
  61 ms | ███  2
  63 ms | █  1
  65 ms | █  1
  66 ms | ███  2
  67 ms | █  1
  71 ms | █  1
  72 ms | █  1
  77 ms | █  1
  82 ms | █  1
  83 ms | ███  2
  85 ms | ███  2
  86 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | █  1
  91 ms | ████  3
  96 ms | ████  3
  98 ms | ███  2
  99 ms | █████████████  10
 100 ms | █████  4
 101 ms | ████  3
 102 ms | █  1
 103 ms | ███  2
 104 ms | ███  2
 105 ms | ███  2
 106 ms | ████  3
 107 ms | ███  2
 108 ms | ███  2
 109 ms | ███████  5
 110 ms | ████  3
 111 ms | ███  2
 113 ms | █  1
 114 ms | ███████  5
 115 ms | █  1
 116 ms | ███  2
 117 ms | █  1
 120 ms | ███  2
 121 ms | █  1
 122 ms | █  1
 124 ms | █  1
 126 ms | ███  2
 132 ms | █  1
 136 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `scheduled_fluid_ticks` = `3166.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `7.67`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `48.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `18.84`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23381 ms  |  Sample ticks: 400

**FPS**  avg `9.39`, min `1.24`, p50 `9.33`, p95 `11.16`, p99 `12.51`, 1%low `2.10`, 0.1%low `n/a`, std `1.28`

**Frame time (ms)**  avg `111.22`, p50 `107.21`, p95 `123.65`, p99 `142.07`, p99.9 `687.87`, max `807.96`

**Client tick (ms)**  avg `0.45`, p95 `1.05`, max `21.79`

**Memory**  start `5703 MB`, end `7157 MB`, peak `7667 MB`, GC `135 events / 2576 ms`

**FPS over sampling window (ASCII):**

```
 13.2 |      █                                                                         
 12.7 |      █                                                                         
 12.1 |      █                                                                         
 11.6 |      █                                                                         
 11.0 |      █                                              ██               █         
 10.4 |      █        █     █                               ██               █      █  
  9.9 |██    █    █   █  ██ ██    █  █   █ █  █ █   █    █  ███  █ █         █ █ █  █ █
  9.3 |█████ ██  ████ █  ██ ██ ████  ███████ █████  █ █ ██  ███  █ ██ █ ██  ████ █ ████
  8.8 |█████ ████████ █████ ███████████████████████ ████████████ █████████ █████ ██████
  8.2 |█████████████████████████████████████████████████████████ ██████████████████████
  7.7 |█████████████████████████████████████████████████████████ ██████████████████████
  7.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  58 ms | ████  1
  77 ms | ████  1
  80 ms | ████  1
  82 ms | ████  1
  83 ms | ████  1
  84 ms | ████  1
  85 ms | ████  1
  86 ms | ████  1
  87 ms | ████  1
  89 ms | ███████  2
  90 ms | ████  1
  91 ms | ███████  2
  92 ms | ████  1
  93 ms | ███████████████  4
  94 ms | ███████  2
  96 ms | ████  1
  98 ms | █████████████████████████████  8
  99 ms | ████████████████████████████████████  10
 100 ms | █████████████████████████████████  9
 101 ms | █████████████████████████████████  9
 102 ms | █████████████████████████████  8
 103 ms | █████████████████████████████████  9
 104 ms | ██████████████████  5
 105 ms | ████  1
 106 ms | █████████████████████████  7
 107 ms | ████████████████████████████████████████  11
 108 ms | ███████████████  4
 109 ms | ███████████  3
 110 ms | ███████████  3
 111 ms | ██████████████████████  6
 112 ms | ██████████████████████  6
 113 ms | ████████████████████████████████████████  11
 114 ms | █████████████████████████  7
 115 ms | ██████████████████  5
 116 ms | ██████████████████████  6
 117 ms | ██████████████████  5
 118 ms | ██████████████████  5
 119 ms | ███████████  3
 120 ms | ██████████████████  5
 121 ms | ███████  2
 122 ms | ███████  2
 123 ms | ███████  2
 125 ms | ████  1
 127 ms | ████  1
 128 ms | ████  1
 141 ms | ███████████  3
 144 ms | ████  1
 807 ms | ████  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `toggles` = `22.00`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `8.99`
- `fps_1pct_low` = `2.10`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23477 ms  |  Sample ticks: 400

**FPS**  avg `9.40`, min `1.38`, p50 `9.48`, p95 `11.67`, p99 `12.74`, 1%low `1.40`, 0.1%low `n/a`, std `1.37`

**Frame time (ms)**  avg `113.44`, p50 `105.44`, p95 `129.11`, p99 `264.55`, p99.9 `721.41`, max `726.33`

**Client tick (ms)**  avg `0.42`, p95 `1.60`, max `4.24`

**Memory**  start `6062 MB`, end `6570 MB`, peak `7774 MB`, GC `134 events / 3192 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                                                        █                       
 10.5 | █  █                              █                    █                       
 10.0 |██  █     █           █   █  ███   ██ █   █     █     █ █          ██        █  
  9.6 |██  ███  ███   █     ██ ████ ████  ██ █ ███  █  ██   ██ █ █     █ ███  ██ █  █  
  9.1 |███████ ██████ █ █ ████ █████████████ █████ ██ █████ ██ ██████ █████████████ ██ 
  8.7 |██████████████████████████████████████████████ █████ █████████ ████████████████ 
  8.2 |████████████████████████████████████████████████████ ██████████████████████████ 
  7.7 |████████████████████████████████████████████████████ ██████████████████████████ 
  7.3 |███████████████████████████████████████████████████████████████████████████████ 
  6.8 |███████████████████████████████████████████████████████████████████████████████ 
  6.4 |███████████████████████████████████████████████████████████████████████████████ 
  5.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  77 ms | ████  2
  78 ms | ██  1
  82 ms | ██  1
  84 ms | ████  2
  85 ms | ███████████  5
  87 ms | ██████  3
  88 ms | ████  2
  90 ms | ██  1
  92 ms | ██  1
  94 ms | ██████  3
  95 ms | ██████  3
  96 ms | ██████  3
  97 ms | ██  1
  98 ms | ████  2
  99 ms | █████████████████████████████  14
 100 ms | ████████████████████████████████████████  19
 101 ms | ███████████████  7
 102 ms | ██████  3
 103 ms | █████████████████  8
 104 ms | █████████████  6
 105 ms | █████████████████  8
 106 ms | ██████  3
 107 ms | ████████  4
 108 ms | ███████████  5
 109 ms | ████████  4
 110 ms | ███████████████  7
 111 ms | ████  2
 112 ms | ████████  4
 113 ms | ███████████████████████  11
 114 ms | ███████████  5
 115 ms | ██████  3
 116 ms | ██████  3
 117 ms | ████████  4
 118 ms | ███████████  5
 119 ms | ███████████  5
 120 ms | ████  2
 121 ms | ██  1
 122 ms | ████  2
 123 ms | ██  1
 125 ms | ████  2
 126 ms | ██  1
 128 ms | ████  2
 131 ms | ████  2
 132 ms | ████  2
 138 ms | ██  1
 143 ms | ██  1
 149 ms | ██  1
 698 ms | ██  1
 726 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `8.82`
- `restocks` = `20.00`
- `fps_1pct_low` = `1.40`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23712 ms  |  Sample ticks: 400

**FPS**  avg `9.86`, min `1.24`, p50 `9.66`, p95 `11.57`, p99 `18.66`, 1%low `1.28`, 0.1%low `n/a`, std `5.05`

**Frame time (ms)**  avg `116.43`, p50 `103.48`, p95 `129.63`, p99 `712.08`, p99.9 `797.34`, max `805.67`

**Client tick (ms)**  avg `2.15`, p95 `1.47`, max `676.49`

**Memory**  start `6109 MB`, end `6696 MB`, peak `7674 MB`, GC `151 events / 3864 ms`

**FPS over sampling window (ASCII):**

```
 24.8 |                              █                                                 
 23.0 |                              █                                                 
 21.3 |                              █                                                 
 19.5 |                              █                                                 
 17.8 |                              █                                                 
 16.0 |                              █                                                 
 14.3 |                              █                                                 
 12.5 |                              █                                                 
 10.8 |  ██  █ █    █ █    █      █  █████       █ █  █     █    █   █     ██        ██
  9.0 |█████████████████████████████ ███████████ ██████████████████ ████████████████ ██
  7.3 |█████████████████████████████ ██████████████████████████████ ███████████████████
  5.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms | ██  1
  27 ms | ██  1
  76 ms | ██  1
  80 ms | ████  2
  82 ms | ██  1
  83 ms | ██  1
  84 ms | ██  1
  85 ms | ██  1
  86 ms | ██  1
  88 ms | ██  1
  89 ms | ██  1
  90 ms | ██  1
  91 ms | ████  2
  93 ms | ██  1
  94 ms | ████████  4
  95 ms | ██  1
  96 ms | ██████████  5
  97 ms | ██  1
  98 ms | ███████████  6
  99 ms | ████████████████████████████████████████  21
 100 ms | ███████████████████████████  14
 101 ms | █████████████████████  11
 102 ms | ███████████  6
 103 ms | █████████████  7
 104 ms | ████████  4
 105 ms | ██████  3
 106 ms | ██████████  5
 107 ms | ██████████  5
 108 ms | ██  1
 109 ms | █████████████  7
 110 ms | ████████  4
 111 ms | ██████████  5
 112 ms | ████████  4
 113 ms | █████████████████  9
 114 ms | ████  2
 115 ms | ██████████  5
 116 ms | ██  1
 117 ms | ████  2
 118 ms | ██████████  5
 119 ms | ██████  3
 120 ms | ██████  3
 121 ms | ██  1
 122 ms | ██  1
 125 ms | ████  2
 126 ms | ██████  3
 129 ms | ████  2
 131 ms | ██  1
 135 ms | ██  1
 140 ms | ████  2
 197 ms | ██  1
 697 ms | ██  1
 758 ms | ██  1
 805 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `1.28`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `n/a`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `8.59`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 14553 ms  |  Sample ticks: 0

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
- `status` = `failed`
- `aborted_state` = `WARMUP`
- `part_label` = `LowEnd Shader`
- `part` = `2.00`

