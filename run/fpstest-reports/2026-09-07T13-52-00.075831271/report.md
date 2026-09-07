# FPS Test session — 2026-09-07T14:26:15.328607679+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 303.3 | 45.5 | 44.1 | 21.49 | 0.61 | 0 | 424 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 328.3 | 44.2 | 34.3 | 21.46 | 0.59 | 1 | 512 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 30.9 | 21.2 | 21.1 | 46.63 | 0.59 | 0 | 388 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 31.0 | 21.1 | 20.2 | 46.56 | 0.65 | 1 | 576 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 31.1 | 21.3 | 21.0 | 46.44 | 0.58 | 0 | 432 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 31.0 | 21.1 | 20.5 | 46.62 | 0.44 | 0 | 260 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 31.0 | 21.3 | 21.1 | 46.81 | 0.57 | 0 | 428 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 31.2 | 21.2 | 20.9 | 46.84 | 1.01 | 3 | 160 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 31.6 | 20.2 | 19.7 | 48.27 | 2.86 | 2 | 738 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 32.0 | 20.0 | 19.6 | 48.88 | 3.66 | 6 | 417 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 31.0 | 20.9 | 20.4 | 47.04 | 0.83 | 1 | 583 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 31.0 | 21.5 | 21.3 | 46.24 | 0.43 | 1 | 604 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 31.5 | 20.1 | 19.8 | 48.90 | 3.20 | 4 | 232 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 31.4 | 20.3 | 19.4 | 47.85 | 2.60 | 2 | 276 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 49.9 | 14.6 | 13.7 | 65.80 | 15.14 | 24 | 483 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 44.5 | 14.0 | 12.8 | 66.39 | 15.72 | 25 | 251 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 31.0 | 20.7 | 20.5 | 47.73 | 1.76 | 2 | 144 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 31.4 | 20.8 | 20.5 | 47.63 | 1.76 | 4 | 681 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 29.1 | 9.1 | 8.9 | 107.37 | 0.56 | 1 | 404 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 10.0 | 8.8 | n/a | 113.06 | 0.26 | 0 | 84 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 10.0 | 8.8 | n/a | 113.38 | 0.26 | 1 | 456 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 10.0 | 8.8 | n/a | 113.63 | 0.27 | 1 | 240 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 10.0 | 8.8 | n/a | 112.96 | 0.28 | 0 | 124 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 10.0 | 8.2 | n/a | 118.73 | 0.41 | 45 | 791 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 10.0 | 8.3 | n/a | 119.34 | 0.32 | 35 | 1109 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 10.0 | 8.5 | n/a | 114.72 | 0.36 | 22 | 293 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 10.0 | 8.3 | n/a | 116.27 | 0.36 | 26 | 784 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 10.0 | 8.4 | n/a | 114.36 | 0.30 | 25 | 455 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 10.0 | 8.4 | n/a | 116.21 | 0.30 | 22 | 479 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 10.0 | 8.4 | n/a | 115.45 | 0.40 | 26 | 140 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 10.0 | 8.6 | n/a | 115.84 | 0.39 | 23 | 1318 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 10.0 | 8.3 | n/a | 117.04 | 0.38 | 20 | 556 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 10.0 | 8.2 | n/a | 120.83 | 0.28 | 17 | 226 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 10.0 | 8.2 | n/a | 117.88 | 0.34 | 22 | 248 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 10.0 | 8.2 | n/a | 115.94 | 0.29 | 22 | 976 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 10.0 | 8.8 | n/a | 113.21 | 0.24 | 0 | 84 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 10.0 | 8.8 | n/a | 113.26 | 2.60 | 1 | 660 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 10.0 | 8.7 | n/a | 113.55 | 0.25 | 0 | 216 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 10.0 | 8.7 | n/a | 113.69 | 0.25 | 0 | 136 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 10.0 | 8.8 | n/a | 112.49 | 0.27 | 0 | 156 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 10.0 | 8.8 | n/a | 112.73 | 0.27 | 0 | 160 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 10.0 | 8.1 | 7.6 | 120.27 | 0.66 | 11 | 1208 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 10.0 | 8.4 | 8.1 | 115.27 | 0.64 | 10 | 1068 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 10.0 | 8.5 | 8.3 | 115.57 | 0.63 | 11 | 269 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 10.0 | 8.1 | 7.8 | 121.41 | 0.63 | 10 | 788 |

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

Category: **Particles**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `303.34`, min `44.02`, p50 `118.68`, p95 `1507.28`, p99 `1960.03`, 1%low `45.46`, 0.1%low `44.07`, std `468.97`

**Frame time (ms)**  avg `8.90`, p50 `8.43`, p95 `19.98`, p99 `21.49`, p99.9 `22.40`, max `22.72`

**Client tick (ms)**  avg `0.61`, p95 `0.92`, max `1.30`

**Memory**  start `441 MB`, end `865 MB`, peak `865 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
465.1 |                                                    █       █        █          
440.5 |                                                    █ █     █   █    █          
415.9 |                                                    █ █     █   █    █          
391.2 |                 █                                  █ ██   ██ █ █    ██   █     
366.6 |                 █                                  █ ██   ██ █ █ ██ ██  ██    █
342.0 |                 █  █              █       █       █████   ████ ███████████    █
317.3 |               █ █  █  █       █   █ █     █       ██████  ████ ████████████  ██
292.7 |  █  █    █ █  ███  █  █   ██  █ █ ███    ██  █  █ ██████ █████ ████████████ ███
268.1 |  █ ██ ██ ███  ███ ██  █ █ ██ ██ █ █████ ███  ███████████ █████ ████████████ ███
243.4 | ██ █████ ████████ █████████████████████ ███████████████████████████████████ ███
218.8 | ████████ ██████████████████████████████████████████████████████████████████████
194.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████████  275
   1 ms | ████  89
   2 ms | ██  40
   3 ms |   11
   4 ms |   1
   6 ms |   4
   7 ms | ████████  196
   8 ms | ████████████████████████████████████████  1002
   9 ms | ████████  191
  10 ms |   1
  12 ms |   7
  13 ms | █  17
  14 ms | ██  56
  15 ms | ██  44
  16 ms | ██  43
  17 ms | ██  55
  18 ms | ██  42
  19 ms | ██  61
  20 ms | ███  64
  21 ms | █  35
  22 ms |   11
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `smoke` | 160 | 280 | 245.5 | 21.02 |
| `sculk_charge_pop` | 240 | 280 | 285.7 | 21.80 |
| `ALL_TOGETHER` | 1680 | 280 | 273.5 | 20.66 |
| `portal` | 160 | 280 | 284.7 | 21.12 |
| `end_rod` | 240 | 280 | 273.1 | 21.31 |
| `dragon_breath` | 160 | 280 | 347.9 | 21.64 |
| `dripping_water` | 240 | 280 | 377.7 | 21.73 |
| `flame` | 160 | 280 | 337.3 | 21.77 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `45.46`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `44.07`
- `fps_harmonic_avg` = `112.32`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`
- `preload_duration_ms` = `0.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23083 ms  |  Sample ticks: 400

**FPS**  avg `328.31`, min `28.32`, p50 `118.73`, p95 `1727.16`, p99 `1998.35`, 1%low `44.19`, 0.1%low `34.35`, std `522.35`

**Frame time (ms)**  avg `8.85`, p50 `8.42`, p95 `19.72`, p99 `21.46`, p99.9 `22.80`, max `35.31`

**Client tick (ms)**  avg `0.59`, p95 `0.87`, max `1.16`

**Memory**  start `717 MB`, end `644 MB`, peak `1229 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
453.7 |                        █                                           █    █      
432.1 |                        █         █                            █    █    █      
410.5 |                        █         █   █        █               ██   ██  ██  █  █
389.0 |                        ███       █   █        █        █   █ ███   ██  ██  █  █
367.4 |                    █   ███       █   █    █  ██ █      █   █████   ██ ███  █  █
345.8 |    █               █ █ ███  █ ██ ██  █    █  ████      █   █████ █ ██ ██████  █
324.3 | █ ██  █            ███ ████ ████ ██  █  █ █  ████    █ █  ██████ █ ██ ██████  █
302.7 | ████ ███ █    ███  ████████ ████████ █  █ █ ██████ █ ███  ████████ █████████ ██
281.1 |█████████ █ ██████ █████████ ████████ █  ██████████ █ ███  ██████████████████ ██
259.6 |██████████████████ ████████████████████ ███████████ █ ███ ██████████████████████
238.0 |██████████████████ ████████████████████████████████ █ ██████████████████████████
216.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████  302
   1 ms | ██  63
   2 ms | ██  45
   3 ms |   10
   4 ms |   1
   6 ms |   1
   7 ms | ███████  185
   8 ms | ████████████████████████████████████████  1020
   9 ms | ████████  195
  10 ms |   1
  11 ms |   1
  12 ms |   3
  13 ms | █  28
  14 ms | ██  56
  15 ms | ██  47
  16 ms | ██  41
  17 ms | ██  51
  18 ms | ██  50
  19 ms | ██  60
  20 ms | ██  59
  21 ms | █  28
  22 ms |   10
  35 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `60.00`
- `fps_harmonic_avg` = `112.97`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `34.35`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `44.19`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `30.91`, min `21.09`, p50 `29.96`, p95 `45.40`, p99 `49.64`, 1%low `21.17`, 0.1%low `21.09`, std `6.01`

**Frame time (ms)**  avg `33.40`, p50 `33.38`, p95 `44.03`, p99 `46.63`, p99.9 `47.35`, max `47.42`

**Client tick (ms)**  avg `0.59`, p95 `0.88`, max `1.29`

**Memory**  start `735 MB`, end `1123 MB`, peak `1123 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |                                                        █                       
 32.9 |     █                                                  █                       
 32.5 |  █  █ █     █            █                           █ █ █ █                   
 32.0 |  █  █ █     █            █       ██        █     █   █ █ █ █        █       █  
 31.6 |  ██ █ █ ███ █            █       ██     ██ █     ██  █ █ ███  █   █ █  █    ██ 
 31.1 |█ ██ █ █ ███ █   █  ████  █      █████   ██ █  ██ ██  █ █ ███  █   █ █ ██    ██ 
 30.7 |█ ██ █ █ ███ █  ██  █████ ██  █  █████ █ ██ ████████  █ █ ████ █   █ █████  ████
 30.2 |█ ██ █ █████ █ ████ █████████ ██ ███████ ██ █████████ █ █ ██████ █ █ ███████████
 29.8 |█ ██ █ ██████████████████████ ██████████ ██ █████████ █ ██████████ █████████████
 29.3 |█ █████████████████████████████████████████ █████████ █ ████████████████████████
 28.9 |███████████████████████████████████████████████████████ ████████████████████████
 28.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  4
  20 ms | ████  11
  21 ms | █████  14
  22 ms | ████  12
  23 ms | ████  12
  24 ms | ███  9
  25 ms | ████  10
  26 ms | ██  6
  27 ms | ██  7
  28 ms | ██████  16
  29 ms | ██  5
  30 ms | ████  10
  31 ms | ████  11
  32 ms | ████████████████████████████████████████  114
  33 ms | ████████████████████████████████████████  114
  34 ms | ████████████████████████████████████  102
  35 ms | ██████  16
  36 ms | █████  13
  37 ms | ████  12
  38 ms | ███████  19
  39 ms | ████  12
  40 ms | ███  9
  41 ms | ██  7
  42 ms | ████  11
  43 ms | ████  12
  44 ms | ████  10
  45 ms | ██  6
  46 ms | ███  8
  47 ms | ██  6
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `30.00`
- `fps_harmonic_avg` = `29.94`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `21.09`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.17`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `30.97`, min `20.23`, p50 `29.87`, p95 `45.37`, p99 `49.53`, 1%low `21.11`, 0.1%low `20.23`, std `6.13`

**Frame time (ms)**  avg `33.39`, p50 `33.48`, p95 `44.69`, p99 `46.56`, p99.9 `48.27`, max `49.43`

**Client tick (ms)**  avg `0.65`, p95 `0.83`, max `1.71`

**Memory**  start `658 MB`, end `602 MB`, peak `1234 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |           █                                                                    
 32.7 |           █                                               █                    
 32.4 |     █    ██                                       █     █ █                 █  
 32.0 |     █    ██    █ █                     █  █   █   █  █  █ █               █ █  
 31.6 | █   █    ███   █ █        █            █  █   ██ ██ ███ █ █       █       █ ██ 
 31.3 | █ █ ██   ███  ██ ██  █   ██ ██         █  ███ ██ ██ █████ █       █   █   █ ██ 
 30.9 | █ █ ██   ████ ██ ██ ██   ██ ███ █  ██ ███ ███ ██ ██ █████ █ █  █ ██ █ █   █ ██ 
 30.5 | ███████  ████ ██ ██ ███ ███████ █ ███████ ███ ██ ██ █████ █ ████ ██ █ █   █ ██ 
 30.2 |█████████ ████ ███████████████████ ███████ ██████ ████████ █████████ ████ █████ 
 29.8 |█████████ ████████████████████████████████████████████████ █████████████████████
 29.4 |██████████████████████████████████████████████████████████ █████████████████████
 29.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | █  2
  20 ms | █████  15
  21 ms | ████  10
  22 ms | ████  11
  23 ms | ██  6
  24 ms | █████  13
  25 ms | ██████  17
  26 ms | █████  14
  27 ms | ████  11
  28 ms | ███  9
  29 ms | ███  9
  30 ms | ████  10
  31 ms | █████  13
  32 ms | ██████████████████████████████████  98
  33 ms | ████████████████████████████████████████  114
  34 ms | █████████████████████████████████████  105
  35 ms | █████  13
  36 ms | ███  9
  37 ms | ████  10
  38 ms | ████  11
  39 ms | █████  15
  40 ms | ███████  21
  41 ms | ███  9
  42 ms | ███  9
  43 ms | ███  8
  44 ms | ████  10
  45 ms | ████  12
  46 ms | ████  11
  47 ms |   1
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `54.00`
- `fps_harmonic_avg` = `29.95`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `20.23`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.11`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23130 ms  |  Sample ticks: 400

**FPS**  avg `31.08`, min `21.02`, p50 `29.77`, p95 `46.86`, p99 `49.82`, 1%low `21.30`, 0.1%low `21.02`, std `6.56`

**Frame time (ms)**  avg `33.39`, p50 `33.59`, p95 `44.34`, p99 `46.44`, p99.9 `47.46`, max `47.58`

**Client tick (ms)**  avg `0.58`, p95 `0.87`, max `1.33`

**Memory**  start `718 MB`, end `1150 MB`, peak `1150 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.6 |                          █                                                     
 33.2 |█                         █                                                     
 32.7 |█                         █  ██        █               █                        
 32.3 |█             █           █  ██ █   █  █  █            █     █      █       █   
 31.8 |█    █  █     █   █       █  ██ ██  █  █  █     █      █ █ █ █      █       █   
 31.4 |██   █  █ █   █   ██    █ █  █████  █  █  █   ████ ██ ██ ███ ██     █ ██  █ █   
 30.9 |███ ███ █ █  ██ █ ██ ████ █ ██████  ██ █ ███ ████████ ██████████    ████  ███   
 30.5 |███ █████ █ ███ █ ██ ████ █ ███████ ██ ██████████████ ██████████    █████████  █
 30.0 |███ █████████████████████ █ ██████████████████████████████████████ ███████████ █
 29.6 |███ █████████████████████ █ ████████████████████████████████████████████████████
 29.1 |███ █████████████████████ █ ████████████████████████████████████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | ██  5
  20 ms | ██████  18
  21 ms | ██████  18
  22 ms | ██████  16
  23 ms | ███  8
  24 ms | ███  8
  25 ms | ███  7
  26 ms | █████  13
  27 ms | ████  10
  28 ms | ███  7
  29 ms | ███  9
  30 ms | ██  6
  31 ms | ██  5
  32 ms | ██████████████████████████████████  95
  33 ms | ████████████████████████████████████  101
  34 ms | ████████████████████████████████████████  112
  35 ms | ████  11
  36 ms | ████████  22
  37 ms | ███████  20
  38 ms | ████  12
  39 ms | ██████  16
  40 ms | ██████  17
  41 ms | ███  8
  42 ms | █████  13
  43 ms | ███  9
  44 ms | ███  7
  45 ms | █████  15
  46 ms | ███  8
  47 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `33.00`
- `fps_harmonic_avg` = `29.95`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `21.02`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.30`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `30.95`, min `20.50`, p50 `29.86`, p95 `46.01`, p99 `50.83`, 1%low `21.11`, 0.1%low `20.50`, std `6.16`

**Frame time (ms)**  avg `33.39`, p50 `33.48`, p95 `43.94`, p99 `46.62`, p99.9 `48.01`, max `48.77`

**Client tick (ms)**  avg `0.44`, p95 `0.56`, max `0.72`

**Memory**  start `617 MB`, end `877 MB`, peak `877 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |                                       █                                        
 33.4 |                                       █                                    █   
 32.9 |                       █               █             █         █            █   
 32.4 |  █                    █               █             █         █            █   
 32.0 |  █      █  █      █   █          █   ██             █         █            █   
 31.5 |  █ █ ██ █ ██ █  █ ██  █    █████ ██  ██   █         █ █       █    █     █ █   
 31.0 |█ ███ ██ █ ██ ████████ █ █ █████████  ███ ██  █ █    █ █  █  █ █    █  █  █ ██  
 30.5 |█ ██████ █ ██ ████████████ █████████  ███ ██ ██ █ ██ █ ██ ██ █ ████ ██ ██ █ ███ 
 30.0 |██████████████████████████ ██████████ ████████████████████████ ████ ███████ ████
 29.5 |█████████████████████████████████████ ████████████████████████ ████ ███████ ████
 29.1 |██████████████████████████████████████████████████████████████ ████████████ ████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   2
  19 ms | ██  8
  20 ms | ███  12
  21 ms | ██  9
  22 ms | ██  11
  23 ms | ██  11
  24 ms | ███  12
  25 ms | █  4
  26 ms | ███  14
  27 ms | █  4
  28 ms | █  6
  29 ms | ██  11
  30 ms | ███  13
  31 ms | ███  15
  32 ms | ████████████████████  89
  33 ms | ████████████████████████████████████████  177
  34 ms | ██████████████  61
  35 ms | ████  19
  36 ms | ███  13
  37 ms | ██  11
  38 ms | ███  13
  39 ms | ███  12
  40 ms | ██  10
  41 ms | ██  11
  42 ms | ██  8
  43 ms | ███  13
  44 ms | ██  8
  45 ms | ██  10
  46 ms | ██  7
  47 ms | █  4
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `34.00`
- `fps_harmonic_avg` = `29.95`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `20.50`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.11`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `31.00`, min `21.10`, p50 `29.83`, p95 `46.33`, p99 `51.08`, 1%low `21.25`, 0.1%low `21.10`, std `6.29`

**Frame time (ms)**  avg `33.38`, p50 `33.53`, p95 `43.78`, p99 `46.81`, p99.9 `47.29`, max `47.39`

**Client tick (ms)**  avg `0.57`, p95 `0.81`, max `1.39`

**Memory**  start `621 MB`, end `1049 MB`, peak `1049 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                      █                                                         
 33.5 |                      █                                                         
 33.1 |█                     █                       █             █                   
 32.6 |█    █          █     █   █                   █             █               █   
 32.1 |█    █ █     █  █     █   █                   █             █    █          █   
 31.6 |█  █ █ █     █  █    ██████     █   █ ███     █  ██  █      █    █    █     █ █ 
 31.1 |█  █ █ █  █  ██ █    ██████ █   █ ████████  █ █  ██  █ █    ███ ██ █  ██ ██ █ ██
 30.6 |█ █████████ ███ ██ █ ██████████ ██████████ ██ ██ ███ █ ██ █ ██████ █ ███ ██ ████
 30.1 |████████████████████ ██████████ █████████████ ██████████████████████████ ██ ████
 29.6 |████████████████████ ██████████████████████████████████████████████████████ ████
 29.1 |████████████████████ ███████████████████████████████████████████████████████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | ███  9
  20 ms | █████  14
  21 ms | ████  11
  22 ms | ██  6
  23 ms | █████  14
  24 ms | ███  10
  25 ms | ███  8
  26 ms | ███  10
  27 ms | ███  9
  28 ms | ███  8
  29 ms | █████  15
  30 ms | ██  7
  31 ms | ███  10
  32 ms | ███████████████████████████████████  102
  33 ms | ████████████████████████████████████████  117
  34 ms | ███████████████████████████████  91
  35 ms | ██████  19
  36 ms | ████████  24
  37 ms | █████  16
  38 ms | █████  16
  39 ms | ███  10
  40 ms | ███  8
  41 ms | ████  11
  42 ms | ██████  17
  43 ms | ███  8
  44 ms | ███  8
  45 ms | ██  7
  46 ms | ███  9
  47 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `50.00`
- `fps_harmonic_avg` = `29.96`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `21.10`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.25`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `31.16`, min `20.91`, p50 `29.81`, p95 `47.17`, p99 `50.36`, 1%low `21.17`, 0.1%low `20.91`, std `6.78`

**Frame time (ms)**  avg `33.40`, p50 `33.55`, p95 `44.11`, p99 `46.84`, p99.9 `47.77`, max `47.82`

**Client tick (ms)**  avg `1.01`, p95 `1.22`, max `1.42`

**Memory**  start `1118 MB`, end `1131 MB`, peak `1278 MB`, GC `3 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |                    █                        █                                  
 33.1 |       █            █         █              █                                  
 32.6 |    █  █            █     █   █        █  █  █           █      █    █      █   
 32.2 |  █ █  ██           █     █   █  █     █  █  █  █        █      █    █      █   
 31.7 |  █ █  ██      █    █   █ ██  █  ██ █ ██  █  █  █ ██     █  █   █    █ █ █  ██ █
 31.2 |█ █ █ ███  █ █ █ █  █   █ ██  █  ██ ████  █  █  █████    ██ █  ███  ██████ ███ █
 30.8 |███ █ ████ █████ ██ ████████  █ ████████  ██ ████████ █  ████ ████  ██████ █████
 30.3 |███ █ █████████████ █████████ █ ████████████ ███████████ ████ █████ ██████ █████
 29.8 |███ ███████████████ █████████ █ ████████████ ███████████████████████████████████
 29.4 |███ ███████████████████████████ ████████████████████████████████████████████████
 28.9 |███ ████████████████████████████████████████████████████████████████████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | ███  8
  20 ms | ███████  17
  21 ms | ██████  15
  22 ms | ██████  15
  23 ms | ██████  14
  24 ms | ████  10
  25 ms | ████  10
  26 ms | ██  4
  27 ms | ████  10
  28 ms | ████  11
  29 ms | ███  8
  30 ms | ████  9
  31 ms | █████  12
  32 ms | ████████████████████████████████████████  97
  33 ms | █████████████████████████████████  82
  34 ms | ████████████████████████████████████████  98
  35 ms | ███████████  27
  36 ms | █████  13
  37 ms | ████████  20
  38 ms | ██████  14
  39 ms | ██████  14
  40 ms | █████  12
  41 ms | ███████  18
  42 ms | ██████  15
  43 ms | ████  10
  44 ms | ██████  14
  45 ms | ███  8
  46 ms | ███  8
  47 ms | █  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `63.00`
- `fps_harmonic_avg` = `29.94`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `20.91`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.17`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `31.61`, min `19.68`, p50 `29.77`, p95 `50.21`, p99 `55.54`, 1%low `20.21`, 0.1%low `19.68`, std `8.06`

**Frame time (ms)**  avg `33.37`, p50 `33.60`, p95 `44.86`, p99 `48.27`, p99.9 `50.43`, max `50.82`

**Client tick (ms)**  avg `2.86`, p95 `3.58`, max `4.69`

**Memory**  start `554 MB`, end `469 MB`, peak `1292 MB`, GC `2 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |                          █                                                     
 34.3 |█                         █                                                     
 33.7 |█                         █                     █                     █     █   
 33.2 |█    █    █            █  █   █                 █                     █     █   
 32.6 |█   ██    █            ██ █   █       █      █  █      █ █   █     █  █ █  ██   
 32.1 |█ █ ██ █  █  █    █ █  ██ █   █ ██    █  ██ ███ █    █ █ █ █████ █ █ ██ █  ██   
 31.5 |█ █ ████  ██ █  █████  ██ █   █ ██  █ █  ████████ █  █ █ ███████ ██████ █  ██ ██
 31.0 |█ ███████ ████  █████ ███ █ ██████ ████  ██████████ ████████████ ██████ █  █████
 30.4 |██████████████ ██████████ █████████████ ████████████████████████ ████████  █████
 29.9 |█████████████████████████ █████████████ ████████████████████████ ███████████████
 29.4 |█████████████████████████ █████████████ ████████████████████████████████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  17 ms | ██  5
  18 ms | ████  9
  19 ms | ███████  17
  20 ms | ████  10
  21 ms | █████  13
  22 ms | ██████  15
  23 ms | █████  13
  24 ms | ████  10
  25 ms | ████  10
  26 ms | ██  6
  27 ms | ███  7
  28 ms | ████  11
  29 ms | ████████  20
  30 ms | █████████████████████████████████  82
  31 ms | ██  4
  32 ms | ████████  20
  33 ms | ██████████████████████  55
  34 ms | █████████  22
  35 ms | ██████  15
  36 ms | ████████████████████████████████████████  100
  37 ms | █████████  22
  38 ms | ██████  16
  39 ms | █████  13
  40 ms | ██████████  26
  41 ms | ████  10
  42 ms | ████  9
  43 ms | █████  13
  44 ms | ███████  17
  45 ms | ███  7
  46 ms | ████  9
  47 ms | ██  5
  48 ms | █  3
  49 ms | █  2
  50 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `55.00`
- `fps_harmonic_avg` = `29.97`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `19.68`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.21`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `32.04`, min `19.58`, p50 `29.27`, p95 `52.92`, p99 `59.63`, 1%low `20.04`, 0.1%low `19.58`, std `9.28`

**Frame time (ms)**  avg `33.37`, p50 `34.17`, p95 `45.28`, p99 `48.88`, p99.9 `50.58`, max `51.08`

**Client tick (ms)**  avg `3.66`, p95 `5.18`, max `7.49`

**Memory**  start `869 MB`, end `762 MB`, peak `1286 MB`, GC `6 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 37.2 |                                                                     █          
 36.5 |                                                                     █          
 35.8 |                                                                     █    █     
 35.1 |                                                                     █    █     
 34.4 |                                                                     █  █ █     
 33.7 |█                                     █          █  █      ███     █ █  █ ███   
 33.0 |█           ██ █           █    █  █  █ ██       █  █ █  █ ███ █  ██ █  █ ███ █ 
 32.3 |█  █  ██  █ ██ █    █   █  █ █ ███ █  █ ██  █    █  █ █  █ █████  ██ █ ██ ██████
 31.6 |█  █ ███  ████ █  ███  ██ ██ █ ███ █  █ ██ ██  █ ██ ███  ███████████ █ █████████
 30.9 |█ ███████ ███████████ ██████████████  ████ ██  ████████  ███████████ ███████████
 30.2 |█ ███████████████████ ██████████████████████████████████████████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | ██  2
  16 ms | █████  6
  17 ms | ██████████  12
  18 ms | █████████  11
  19 ms | ███████████  14
  20 ms | ██████████  12
  21 ms | ████████  10
  22 ms | ██████████████  17
  23 ms | █████████  11
  24 ms | ███████████  13
  25 ms | ███████  8
  26 ms | ███████  9
  27 ms | ███████  8
  28 ms | ████████████████  20
  29 ms | █████████████████  21
  30 ms | ████████████████████████  29
  31 ms | ███████████████  18
  32 ms | █████████████████████  26
  33 ms | ████████████████████████████████████████  49
  34 ms | ██████████████████████  27
  35 ms | ███████████████████████████  33
  36 ms | ████████████████████████████████  39
  37 ms | ███████████████████████████████████  43
  38 ms | █████████████████████████████  35
  39 ms | ███████  9
  40 ms | ███████████  14
  41 ms | ██████████████  17
  42 ms | ██████████████████████████  32
  43 ms | ████████  10
  44 ms | ████████  10
  45 ms | █████████  11
  46 ms | ████  5
  47 ms | ███  4
  48 ms | ███████  9
  49 ms | ██  3
  50 ms | █  1
  51 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `items_alive_p50` = `1240.00`
- `entity_count_sample_end` = `1561.00`
- `entity_count_sample_start` = `681.00`
- `items_alive_max` = `1560.00`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `20.04`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `29.97`
- `preload_duration_ms` = `33.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.58`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`
- `items_alive_p95` = `1560.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `31.01`, min `20.42`, p50 `29.97`, p95 `45.93`, p99 `50.72`, 1%low `20.91`, 0.1%low `20.42`, std `6.25`

**Frame time (ms)**  avg `33.40`, p50 `33.37`, p95 `45.02`, p99 `47.04`, p99.9 `48.62`, max `48.96`

**Client tick (ms)**  avg `0.83`, p95 `0.98`, max `2.46`

**Memory**  start `634 MB`, end `1218 MB`, peak `1218 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                    █           █              █          █                     
 32.8 |             █      █ █         █              █          █                     
 32.4 |  █          █  █   █ █         █              █          █      █              
 32.0 |  █          █  █  ██ █      █  █   █      █   █    █     █   █  █            █ 
 31.6 |█ █     ██ █ █  █  ██ ██   █ ██ █ █ █  █   █   █    █     █   █  ██ █ ██     ██ 
 31.2 |████    ████ █ ██  ██ ██   █ ██ █ █ █  █  ██   █ ██ █     █   █  ██ █ ██ █ █ ██ 
 30.8 |█████   ████ █ ███ ██ ████ █ ████ █ ██ █ ███   ████ ██ ██ ██████ ██ ██████ █ ██ 
 30.4 |██████ █████ █████ ██ ████ ██████ █ ██ █████ █ ████ ██ ██ █████████ ████████ ██ 
 29.9 |█████████████████████ █████████████ ██ ███████ ████ █████ ██████████████████ ██ 
 29.5 |███████████████████████████████████ ██ ███████ ████ █████ ██████████████████ ██ 
 29.1 |██████████████████████████████████████ ███████ ████ █████ █████████████████████ 
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | ███  7
  20 ms | ████  12
  21 ms | █████  13
  22 ms | ████  10
  23 ms | ███  7
  24 ms | ███  8
  25 ms | ████  12
  26 ms | ███  8
  27 ms | █████  14
  28 ms | █████  13
  29 ms | █████  14
  30 ms | ███████  18
  31 ms | ███████████  29
  32 ms | ██████████████████████████████████  91
  33 ms | ██████████████████████████████████  91
  34 ms | ████████████████████████████████████████  108
  35 ms | █████  14
  36 ms | █████  14
  37 ms | █████  14
  38 ms | ███  8
  39 ms | ████  10
  40 ms | █████  13
  41 ms | ███  9
  42 ms | ██  6
  43 ms | ██  6
  44 ms | ██████  17
  45 ms | █████  13
  46 ms | ███  9
  47 ms | ███  7
  48 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `20.42`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `fps_1pct_low` = `20.91`
- `preload_duration_ms` = `74.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23074 ms  |  Sample ticks: 400

**FPS**  avg `30.97`, min `21.26`, p50 `29.81`, p95 `46.78`, p99 `49.90`, 1%low `21.47`, 0.1%low `21.26`, std `6.23`

**Frame time (ms)**  avg `33.39`, p50 `33.55`, p95 `43.34`, p99 `46.24`, p99.9 `46.86`, max `47.03`

**Client tick (ms)**  avg `0.43`, p95 `0.54`, max `0.75`

**Memory**  start `649 MB`, end `736 MB`, peak `1253 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |                                                                  █             
 33.0 |                                  █                               █             
 32.5 |        █  █                      █                 █             █ █           
 32.1 |█   █   █  █  █    █              █      █          █ █ █    █    █ █        █  
 31.7 |█  ███  █  █  █    █     █ █ ███  █   █  █          █ █ ██   ██   █ █        █  
 31.2 |█  ███  █  ██ █  █ █  █  █ █████  █ █ █  ██ █ ██    █ ████   ██   █ ███  █ █ █ █
 30.8 |██ ████ █  ██ ██ ███  █  ███████  █ █ █  ██ ██████  █ █████  ███ ██ ███ ████ █ █
 30.3 |███████ █  ██████████████████████ █ ████ ██ █████████ ██████████ ██ ██████████ █
 29.9 |███████ █████████████████████████ █ ████ ████████████ ██████████ ███████████████
 29.5 |███████ █████████████████████████ ██████ ███████████████████████ ███████████████
 29.0 |███████ █████████████████████████ ██████████████████████████████████████████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  4
  20 ms | ███  16
  21 ms | ███  16
  22 ms | █  5
  23 ms | ██  9
  24 ms | ██  11
  25 ms | ███  15
  26 ms | ██  13
  27 ms | ██  11
  28 ms | ██  11
  29 ms | █  8
  30 ms | █  4
  31 ms | █  7
  32 ms | ██████████  55
  33 ms | ████████████████████████████████████████  215
  34 ms | ████████  42
  35 ms | ███  14
  36 ms | ██  11
  37 ms | ███  18
  38 ms | ███  18
  39 ms | ███  14
  40 ms | ████  24
  41 ms | ███  17
  42 ms | █  7
  43 ms | █  8
  44 ms | █  6
  45 ms | ██  11
  46 ms | █  6
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `21.47`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `29.95`
- `preload_duration_ms` = `72.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `21.26`
- `beds_placed` = `40.00`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`
- `doors_placed` = `16.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `31.48`, min `19.78`, p50 `29.93`, p95 `48.44`, p99 `54.75`, 1%low `20.10`, 0.1%low `19.78`, std `7.74`

**Frame time (ms)**  avg `33.39`, p50 `33.41`, p95 `45.20`, p99 `48.90`, p99.9 `50.32`, max `50.55`

**Client tick (ms)**  avg `3.20`, p95 `5.13`, max `8.51`

**Memory**  start `1093 MB`, end `1029 MB`, peak `1325 MB`, GC `4 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 36.7 |          █                                                                     
 36.0 |   █      █                                                                     
 35.2 |   █      █                                                                     
 34.5 |   █      █        █   █                       █         █                      
 33.7 |█ ██      █  █     █   █     █            █    █         █               █      
 33.0 |█ ██      █  █     █   █     █  █         █    █     ██  █    █      █   █      
 32.2 |█ █████ █ █  █  █  ███ █     █  █     █   ██ █ █     ██  █    █      █ █ █  █   
 31.4 |█ ███████ █ ███ █  ███ █     █  █ █   █ █ ██ █ █ ██ ███  █ ██ █  ███ █ █ ████ █ 
 30.7 |█████████ █ ███ █  █████  █ ███ ███████ █ ████ ████████  █ █████ █████ █ ███████
 29.9 |█████████ █████ ███████████████ █████████ ████ █████████████████████████ ███████
 29.2 |███████████████ ██████████████████████████████ █████████████████████████████████
 28.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  12 ms | █  1
  16 ms | █  1
  17 ms | ██  4
  18 ms | ████  8
  19 ms | ███  6
  20 ms | ███████  14
  21 ms | ███████  13
  22 ms | █████  10
  23 ms | ████  8
  24 ms | █████████  16
  25 ms | ███████  14
  26 ms | █████  10
  27 ms | █████  9
  28 ms | ███████  14
  29 ms | ███████████  20
  30 ms | ███████████████████████████████████  65
  31 ms | ███████████████  28
  32 ms | ██████████  18
  33 ms | ████████████████████████████████████████  75
  34 ms | ██████  11
  35 ms | ███████████████████  35
  36 ms | ███████████████████████████████████  65
  37 ms | ████████████████  30
  38 ms | █████████  16
  39 ms | ███████  13
  40 ms | ███████  13
  41 ms | ██████  12
  42 ms | █████  9
  43 ms | █████████  16
  44 ms | ██████  11
  45 ms | ██████  11
  46 ms | ███  5
  47 ms | ██  3
  48 ms | █████  9
  49 ms | ██  4
  50 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.10`
- `fps_harmonic_avg` = `29.95`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `1.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.78`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`
- `explosions_count` = `396.00`
- `tnt_active_p95` = `142.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `35.90`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `198.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `31.43`, min `19.39`, p50 `29.75`, p95 `48.90`, p99 `54.68`, 1%low `20.30`, 0.1%low `19.39`, std `7.57`

**Frame time (ms)**  avg `33.38`, p50 `33.61`, p95 `44.91`, p99 `47.85`, p99.9 `50.47`, max `51.58`

**Client tick (ms)**  avg `2.60`, p95 `4.20`, max `12.36`

**Memory**  start `1067 MB`, end `791 MB`, peak `1343 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 34.9 |                                                                       █        
 34.3 |   █  █                                                                █        
 33.8 |   █  █             █  █                    █             █            █        
 33.2 |   █  █ █  █  █     █  █                    █             █            █        
 32.6 |   █  █ █  █  █     █  █   █                █ █           █   █      █ █   █    
 32.1 | █ █  ███  █  █   █ ████   █ █ █  █ █       █ ██      █   █ █ █      █ █   ████ 
 31.5 | ███ ████  █  █ ███ ████   █ █ █  █████   █ █ ██   ██ █   █ █████ █ ██ █  ██████
 31.0 |████ ███████ ██ ████████ █ █ █ █████████ ██ █ ██  ███ ███ █ █████ █ ██ ██ ██████
 30.4 |████ ███████████████████ █ █ █ ████████████ █ ███████████ ████████████ ██ ██████
 29.8 |██████████████████████████ █ █ ████████████ █ ███████████ ████████████ █████████
 29.3 |██████████████████████████████ ██████████████ ███████████ ████████████ █████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  2
  17 ms | █  2
  18 ms | ██████  10
  19 ms | █████  7
  20 ms | ███████████  17
  21 ms | ██████  10
  22 ms | ████████  12
  23 ms | ████████  13
  24 ms | ███████  11
  25 ms | █████  8
  26 ms | ███████  11
  27 ms | ███  5
  28 ms | ███████  11
  29 ms | ████████████  19
  30 ms | ██████████████████████████  41
  31 ms | █████████████████████████████████  51
  32 ms | █████████████████  26
  33 ms | ████████████████████████████████████████  62
  34 ms | █████████████████  26
  35 ms | ██████████████████████████████████████  59
  36 ms | ███████████████████████████████  48
  37 ms | ███████████████  24
  38 ms | ███████████  17
  39 ms | █████████████  20
  40 ms | █████████  14
  41 ms | ████████  12
  42 ms | ███████  11
  43 ms | ███████  11
  44 ms | ██████  10
  45 ms | ██████  9
  46 ms | █████  8
  47 ms | ████  6
  48 ms | ███  4
  49 ms | █  1
  51 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.30`
- `fps_harmonic_avg` = `29.96`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `121.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `19.39`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.52`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `49.93`, min `13.66`, p50 `29.14`, p95 `165.40`, p99 `262.10`, 1%low `14.55`, 0.1%low `13.66`, std `68.23`

**Frame time (ms)**  avg `33.68`, p50 `34.32`, p95 `58.48`, p99 `65.80`, p99.9 `71.20`, max `73.20`

**Client tick (ms)**  avg `15.14`, p95 `20.79`, max `27.43`

**Memory**  start `834 MB`, end `910 MB`, peak `1317 MB`, GC `24 events / 93 ms`

**FPS over sampling window (ASCII):**

```
200.2 |  █                                                                             
184.7 |  █                                                                             
169.1 |  █                                                                             
153.6 |  █                                                                             
138.0 |  █                                                                             
122.5 |  █                                                                             
106.9 |  █                                      █                                      
 91.4 |  █                                     ██                         █            
 75.8 |  █      █         █        █    ██     ██                      █  █            
 60.3 |  ██    ██ █ ███   ██  █ ██ █    ██    ███   █     █     █ █    █  █ █       █  
 44.8 | ███ █  █████████ ██████ ████████████  █████████ ████████████ █ ██ █████ ██  █  
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █  1
   1 ms | █  1
   2 ms | █  1
   3 ms | ███████  5
   4 ms | ██████████████████████  15
   5 ms | █████████  6
   6 ms | ███████████████  10
   7 ms | ███████  5
   8 ms | ██████████  7
   9 ms | ████████████  8
  10 ms | ████████████  8
  11 ms | █████████  6
  12 ms | ███████  5
  13 ms | ████████████████████████  16
  14 ms | █████████████  9
  15 ms | ██████████  7
  16 ms | ███████  5
  17 ms | █████████████  9
  18 ms | ███████████████████  13
  19 ms | ████████████████  11
  20 ms | ██████████  7
  21 ms | ████  3
  22 ms | ██████████  7
  23 ms | ████████████████████████  16
  24 ms | ████████████████████████  16
  25 ms | █████████████  9
  26 ms | █████████  6
  27 ms | ████████████████  11
  28 ms | ████████████████  11
  29 ms | █████████  6
  30 ms | ████████████  8
  31 ms | ████████████████████████████  19
  32 ms | ███████████████  10
  33 ms | ██████████████████████  15
  34 ms | ███████████████████  13
  35 ms | ████████████████  11
  36 ms | █████████  6
  37 ms | ██████████  7
  38 ms | ██████████████████████████████  20
  39 ms | ██████████████████████  15
  40 ms | ████████████████  11
  41 ms | ████████████████  11
  42 ms | ███████████████████  13
  43 ms | ████████████████████████  16
  44 ms | ████████████  8
  45 ms | ███████  5
  46 ms | █████████████  9
  47 ms | ███████████████████████████  18
  48 ms | ████████████████████████████████████████  27
  49 ms | ███████████████████  13
  50 ms | ████████████  8
  51 ms | █████████  6
  52 ms | ██████████  7
  53 ms | ████████████████████████  16
  54 ms | ███████████████  10
  55 ms | ████  3
  56 ms | ████████████  8
  57 ms | ██████████  7
  58 ms | ██████████  7
  59 ms | ███  2
  60 ms | ██████  4
  61 ms | ████  3
  63 ms | ███████  5
  64 ms | ███  2
  65 ms | ███████  5
  66 ms | ███  2
  68 ms | ███  2
  69 ms | █  1
  73 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `fps_1pct_low` = `14.55`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4811.27`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `13.66`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.69`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `26361.00`
- `preload_duration_ms` = `77.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `44.47`, min `12.80`, p50 `28.76`, p95 `142.26`, p99 `185.97`, 1%low `14.05`, 0.1%low `12.80`, std `39.93`

**Frame time (ms)**  avg `34.00`, p50 `34.77`, p95 `58.86`, p99 `66.39`, p99.9 `77.17`, max `78.09`

**Client tick (ms)**  avg `15.72`, p95 `21.84`, max `30.46`

**Memory**  start `981 MB`, end `892 MB`, peak `1232 MB`, GC `25 events / 86 ms`

**FPS over sampling window (ASCII):**

```
 66.3 |        █ █      █                  █              █      █                     
 63.0 |        █ █    █ █    █             █             ██      █                     
 59.7 |        █ █    █ █  █ █             █    █        ██      █                     
 56.4 |      █ █ █    █ █  █ █   █     █   ██   █   █    ██      █     █     █         
 53.1 |      █ █ ██ █ █ █  █ █   █   █ █   ██   █   █    ███  █ ██  █  ██    █         
 49.8 | █    █ █ ██ █ █ █  █ █   ██  █ █  ████  █   █    ██████ ██  █  ██    █         
 46.4 | █  █ █ █ ██ █ █ █  █ █   ██  █ █  ████  █   █    ██████ ██  ██ ██  █ █         
 43.1 | █ ██ █ █ ██ █ █ ██ █ █ █████ █ ██ ████  ██  █    ██████ ██  ██ ██  █ █         
 39.8 | █ ██ █ ████ █ ████ ███ █████ █ ██ ████ ████ ███  █████████  ██ ██ ██ █  █      
 36.5 | █ ██ █████████████ ███ ███████████████ █████████ █████████  ██ █████ ████ █    
 33.2 |██ ██ ████████████████████████████████████████████████████████████████████ ██ ██
 29.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ███  2
   4 ms | █████  3
   5 ms | ████████████████  10
   6 ms | ████████████████████████  15
   7 ms | ███████████  7
   8 ms | ██████████████████  11
   9 ms | ██████████  6
  10 ms | ██████████████████████  14
  11 ms | ██████████  6
  12 ms | █████████████████████  13
  13 ms | █████  3
  14 ms | ██████  4
  15 ms | ██████████████  9
  16 ms | ██████  4
  17 ms | ██████████████  9
  18 ms | ██████████████  9
  19 ms | ███████████████████  12
  20 ms | ██████████████  9
  21 ms | ██████████████  9
  22 ms | ██████████████████  11
  23 ms | ██████████████████████  14
  24 ms | ███████████████████  12
  25 ms | █████████████  8
  26 ms | ██████████████  9
  27 ms | ████████████████████████  15
  28 ms | ███████████  7
  29 ms | █████████████  8
  30 ms | ██████████████  9
  31 ms | ██████████  6
  32 ms | ████████████████  10
  33 ms | ██████████████████████████  16
  34 ms | ██████████████████████████  16
  35 ms | █████████████████████  13
  36 ms | ███████████  7
  37 ms | ██████████████████████  14
  38 ms | ████████████████████████████████  20
  39 ms | ██████████████████████████████  19
  40 ms | ███████████  7
  41 ms | ██████████████  9
  42 ms | ██████████████████████████  16
  43 ms | ███████████  7
  44 ms | ██████████  6
  45 ms | ████████  5
  46 ms | ███████████████████  12
  47 ms | ████████████████  10
  48 ms | ████████████████████████████████████████  25
  49 ms | ████████████████████████  15
  50 ms | ██████████████████  11
  51 ms | ███████████  7
  52 ms | ███████████████████  12
  53 ms | ████████████████  10
  54 ms | ███████████████████  12
  55 ms | ████████████████  10
  56 ms | ██████  4
  57 ms | ███████████  7
  58 ms | ████████  5
  59 ms | ██████████  6
  60 ms | ██████  4
  61 ms | ███  2
  62 ms | ███  2
  63 ms | ████████  5
  64 ms | ██  1
  65 ms | ██  1
  66 ms | ███  2
  67 ms | ███  2
  68 ms | ██  1
  69 ms | ██  1
  76 ms | ██  1
  78 ms | ██  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `fps_1pct_low` = `14.05`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4804.95`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `12.80`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.41`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `26055.00`
- `preload_duration_ms` = `46.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `30.99`, min `20.53`, p50 `29.98`, p95 `46.14`, p99 `50.65`, 1%low `20.73`, 0.1%low `20.53`, std `6.22`

**Frame time (ms)**  avg `33.40`, p50 `33.35`, p95 `44.58`, p99 `47.73`, p99.9 `48.50`, max `48.70`

**Client tick (ms)**  avg `1.76`, p95 `2.49`, max `3.17`

**Memory**  start `1054 MB`, end `1156 MB`, peak `1198 MB`, GC `2 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                                      █                                         
 33.5 |                                      █                                 █       
 33.0 |               █                      █ █   █      █       █            █  █    
 32.5 | █  █     █    █       █ █  █         █ █   █      █   █   █            █  █    
 32.0 | █  █     █ █  █  █    █ █  █   ██  █ █ █ █ █  █   █ █ ██  █    █       █  █    
 31.5 | █  █     █ ██ █  █    █ █  █ █ ███ █ █ █ █ █  █ █ █ ████  ██   █       █  █    
 31.0 | █  ██    █ ██ █  ███  █ █ ██████████ █ █ █ █  █ ████████  ██ █ █  █    █  █ ██ 
 30.5 | █ █████ ██ ██ █████████ █ ██████████ █ █ ███  █ █████████ ██ █ ███████ ██ █ ███
 30.0 | █ █████ ██ ██ █████████ █ ████████████ █ ████ ███████████ ████████████ ██ █ ███
 29.5 |███████████ ████████████ █████████████████████████████████ ████████████ ██ █ ███
 29.0 |████████████████████████ ███████████████████████████████████████████████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | █  2
  19 ms | ███  7
  20 ms | █████  13
  21 ms | █████  12
  22 ms | ████  9
  23 ms | ████  9
  24 ms | ████  9
  25 ms | ████  9
  26 ms | ████  9
  27 ms | █████  12
  28 ms | ████  9
  29 ms | ███  8
  30 ms | ██████████  24
  31 ms | ███████████████████████████████████  83
  32 ms | ██████████████  34
  33 ms | ████████████████████████████████████████  96
  34 ms | █████████████████  40
  35 ms | ██████████████████████████████████████  90
  36 ms | █████  13
  37 ms | ███████  16
  38 ms | █████  12
  39 ms | ███  6
  40 ms | █████  12
  41 ms | ███  8
  42 ms | ████  9
  43 ms | █████  12
  44 ms | ████  10
  45 ms | ████  9
  46 ms | ███  6
  47 ms | ███  6
  48 ms | ██  5
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `fps_1pct_low` = `20.73`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.37`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.53`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3577.00`
- `preload_duration_ms` = `47.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `31.37`, min `20.50`, p50 `29.82`, p95 `49.26`, p99 `53.90`, 1%low `20.77`, 0.1%low `20.50`, std `7.50`

**Frame time (ms)**  avg `33.40`, p50 `33.54`, p95 `45.41`, p99 `47.63`, p99.9 `48.74`, max `48.78`

**Client tick (ms)**  avg `1.76`, p95 `2.44`, max `2.94`

**Memory**  start `552 MB`, end `659 MB`, peak `1233 MB`, GC `4 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 34.2 |                 █        █                                                     
 33.7 |  █   █          █        █                        █                            
 33.2 |  █ █ ██         █      █ █  █                     █                            
 32.7 |  █ █ ██         █  ██  █ █  █         █  █ █  ██  █       █       █            
 32.2 |  █ █ ██  █ ██ █ █  ██  █ █  █         █  █ █ ███  ██      █  █    █    █       
 31.7 |  █ █ ██ █████ █ █ ████ █ █  █ █ █  █  █  █ ██████ ██  █   ██ █    █ █  █ ██    
 31.2 |  █ █ ██ █████ █ █ ████ █ █  █████  █  █  █ ██████ ██  ██ █████ █  ███  ██████  
 30.6 |█ █ █ ██ ███████ █ ██████ █ ██████ ██ ██  ███████████  ██ ███████ █████████████ 
 30.1 |█ █ █ ██ ████████████████ █ █████████████████████████████ ███████ ██████████████
 29.6 |█ █ ████ ████████████████ █ █████████████████████████████ ███████ ██████████████
 29.1 |█ ███████████████████████ █ ████████████████████████████████████████████████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  2
  18 ms | ███████  14
  19 ms | █████  11
  20 ms | ██████  12
  21 ms | ██████  13
  22 ms | ████  9
  23 ms | █████  10
  24 ms | ████  9
  25 ms | █████  11
  26 ms | █████  11
  27 ms | ██  4
  28 ms | ████  8
  29 ms | ████  9
  30 ms | ███████  14
  31 ms | ██████████████████████████████████  70
  32 ms | ████████████████  33
  33 ms | ████████████████████████████████████████  81
  34 ms | ████████████████  32
  35 ms | ████████████████████████████████████████  82
  36 ms | ███████████████  30
  37 ms | ███████  14
  38 ms | ████████  17
  39 ms | ████████  16
  40 ms | █████████  19
  41 ms | ███  6
  42 ms | ███████  14
  43 ms | ████  8
  44 ms | ████  8
  45 ms | ████  8
  46 ms | ███████  14
  47 ms | ████  8
  48 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `fps_1pct_low` = `20.77`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.12`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.50`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3332.00`
- `preload_duration_ms` = `39.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `29.11`, min `8.85`, p50 `29.84`, p95 `45.41`, p99 `49.46`, 1%low `9.07`, 0.1%low `8.85`, std `8.03`

**Frame time (ms)**  avg `39.01`, p50 `33.51`, p95 `99.78`, p99 `107.37`, p99.9 `112.78`, max `112.96`

**Client tick (ms)**  avg `0.56`, p95 `0.73`, max `1.41`

**Memory**  start `782 MB`, end `523 MB`, peak `1186 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                                                                 █              
 32.5 | █          █ █      █   █ █ █ ███ █    █   █    ██ █     █ █  █ █ █ █     ██   
 30.2 | ██████████ ████████████████ █ ████████ ███████████ ██████████████████████████  
 28.0 |██████████████████████████████████████████████████████████████████████████████  
 25.7 |██████████████████████████████████████████████████████████████████████████████  
 23.5 |██████████████████████████████████████████████████████████████████████████████  
 21.2 |██████████████████████████████████████████████████████████████████████████████  
 19.0 |██████████████████████████████████████████████████████████████████████████████  
 16.7 |██████████████████████████████████████████████████████████████████████████████  
 14.5 |██████████████████████████████████████████████████████████████████████████████  
 12.2 |██████████████████████████████████████████████████████████████████████████████  
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  5
  20 ms | ██  7
  21 ms | ████  13
  22 ms | ██  8
  23 ms | ██  6
  24 ms | █  2
  25 ms | █  4
  26 ms | ████  13
  27 ms | ██  8
  28 ms | ██  8
  29 ms | ███  9
  30 ms | ███  9
  31 ms | ███  9
  32 ms | ███████████████████████  80
  33 ms | ████████████████████████████████████████  138
  34 ms | █████████████  46
  35 ms | ██  7
  36 ms | ████  15
  37 ms | ██  7
  38 ms | ████  13
  39 ms | ██  6
  40 ms | █  5
  41 ms | ███  12
  42 ms | ██  6
  43 ms | █  5
  44 ms | ██  7
  45 ms | ███  10
  46 ms | ██  8
  47 ms | █  2
  90 ms |   1
  91 ms |   1
  92 ms |   1
  93 ms | █  3
  94 ms | █  2
  96 ms |   1
  98 ms | █  3
  99 ms | ███  10
 100 ms | ███  11
 101 ms | █  3
 106 ms |   1
 107 ms | █  3
 110 ms |   1
 112 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `8.85`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `25.63`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `9.07`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `33.00`
- `seed` = `5099.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.84`, p50 `9.99`, p95 `10.93`, p99 `11.16`, 1%low `8.84`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `100.11`, p50 `100.07`, p95 `111.64`, p99 `113.06`, p99.9 `113.14`, max `113.15`

**Client tick (ms)**  avg `0.26`, p95 `0.39`, max `1.48`

**Memory**  start `598 MB`, end `682 MB`, peak `682 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                               █        █                                    █  
 10.6 |  █           █     █          █  █     █                                 █  █  
 10.5 |  █           █     █          █  █     █     █                           █  █  
 10.4 |  █           █     █     █    █  █     █     █          █              █ █  █  
 10.2 |  █           █     █     █    █  █     █  █  █          █     █        █ █  █  
 10.1 |  █           █  █  █ █   █    █  █   █ █  █  █       █  █     █        █ █  █  
 10.0 |  ███████████ █ ███ █████ ████ ██ █████ ██ ██ ██████████ █████ ████████ █ ██ ██ 
  9.9 |█ ███████████ █████ █████ ████ ██ █████ █████ ██████████ ██████████████ █ ██ ██ 
  9.8 |█ ███████████ █████ ██████████ ██ █████ █████ ██████████ ██████████████ █ ██ ██ 
  9.7 |█ ███████████ █████ ██████████ ██ █████ █████ ███████████████████████████ ██ ██ 
  9.5 |███████████████████ ██████████ ████████ █████████████████████████████████ ██ ██ 
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  89 ms | ███  5
  90 ms | ██  3
  91 ms | ██  3
  92 ms | ████  8
  93 ms | ███  6
  94 ms | █████  9
  95 ms | ██  4
  96 ms | ██  4
  97 ms | ██  4
  98 ms | ████████  14
  99 ms | █████████████  24
 100 ms | ████████████████████████████████████████  73
 101 ms | █████  9
 104 ms | █  1
 105 ms | █  2
 106 ms | ██  4
 107 ms | █  2
 109 ms | ██  4
 111 ms | ██████  11
 112 ms | ███  6
 113 ms | ██  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `100.00`
- `scheduled_block_ticks` = `9612.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `8.84`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.77`, p50 `10.00`, p95 `10.96`, p99 `11.25`, 1%low `8.77`, 0.1%low `n/a`, std `0.56`

**Frame time (ms)**  avg `100.11`, p50 `100.01`, p95 `112.31`, p99 `113.38`, p99.9 `114.01`, max `114.01`

**Client tick (ms)**  avg `0.26`, p95 `0.44`, max `1.71`

**Memory**  start `712 MB`, end `765 MB`, peak `1168 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |    █        █          █                                                       
 10.6 |    █  █  █  █          █              █                                        
 10.5 |    █  █  █  █          █              █     █        █       █                 
 10.4 |    █  █  █  █          █              █     █        █     █ █     █           
 10.3 |  █ █  █  █  █  █       █   █     █ █  █     █  █  █  █     █ █     █           
 10.1 |  █ █  █  █  █  █ █     █   █     █ █  █  █  █  █  █  █   █ █ ██  █ █     █   █ 
 10.0 |█ █ ██ ██ █  ██ █ ███ █ ██  ███ █ █ ██ ██ ██ ██ ██ █  █████ █ ███ █ █████████ █ 
  9.9 |█ █ ██ ██ ██ ██ ███████ █████████ █ ██ █████ ██ █████ █████ █ █████████████████ 
  9.8 |█ █ ██ ██ ██ ██████████ ██████████████ █████ ████████ █████ █ ██████████████████
  9.6 |███ ██ ██ ██ ██████████ ██████████████ █████ ████████████████ ██████████████████
  9.5 |██████ █████ ███████████████████████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  87 ms | █  1
  88 ms | ██  2
  89 ms | ██  2
  90 ms | ████  4
  91 ms | ████  4
  92 ms | █████████  9
  93 ms | █████  5
  94 ms | █████  5
  95 ms | ████████  8
  96 ms | ███████  7
  97 ms | ████  4
  98 ms | ███████████████████  18
  99 ms | █████████████████████████████  28
 100 ms | ████████████████████████████████████████  38
 101 ms | ███████████████████████████  26
 102 ms | ███  3
 103 ms | ████  4
 105 ms | ███  3
 106 ms | █  1
 107 ms | ██  2
 108 ms | ██  2
 109 ms | ██  2
 110 ms | █████  5
 111 ms | █████  5
 112 ms | █████  5
 113 ms | ████  4
 114 ms | ██  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `scheduled_block_ticks` = `2224.00`
- `preload_chunks` = `81.00`
- `pulses_issued` = `45.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_start` = `1.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.77`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `4019.00`
- `preset_quick` = `1.00`
- `repeaters_placed` = `48.00`
- `dust_placed` = `464.00`
- `block_state_changes` = `0.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.75`, p50 `10.02`, p95 `11.04`, p99 `11.16`, 1%low `8.77`, 0.1%low `n/a`, std `0.59`

**Frame time (ms)**  avg `100.11`, p50 `99.85`, p95 `112.30`, p99 `113.63`, p99.9 `114.18`, max `114.29`

**Client tick (ms)**  avg `0.27`, p95 `0.39`, max `1.80`

**Memory**  start `962 MB`, end `684 MB`, peak `1202 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                           █                              █  █                  
 10.6 |             █          █  █       █  █        █          █  █                  
 10.5 |       █   █ █          █  █     █ █  █        █          █  █                  
 10.3 |       █   █ █          █  █     █ █  █     █  █          █  █                  
 10.2 |       █   █ █  █     █ █  █     █ █  █  █  █  █          █  █  █          █  █ 
 10.1 |  █  █ █   █ █  █  █  █ █  █ █   █ █  ██ █  █  █ █ █   █  █  █  ██ █    █  █  █ 
 10.0 |██████ ███ █ ██ █████ █ ██ █ ███ █ ██ ██ ██ ██ ███████ ██ ██ ██ ███████ ██ ██ ██
  9.9 |██████ ███ █ ██ █████ █ ██ █████ █ ██ █████ ██ ██████████ ██ ██ █████████████ ██
  9.8 |██████ ███ █ ██████████ ██ █████ █ ██ ████████ ██████████ ██ ███████████████████
  9.7 |████████████ ██████████ ██ ██████████ ████████ ██████████ ██ ███████████████████
  9.5 |██████████████████████████ ██████████ ██████████████████████ ███████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  89 ms | █████  4
  90 ms | ██████████  8
  91 ms | ██████████  8
  92 ms | ████████  7
  93 ms | ██████  5
  94 ms | ████  3
  95 ms | ███████  6
  96 ms | ███████  6
  97 ms | ████████████  10
  98 ms | ████████████████████████  20
  99 ms | ████████████████████████████████████  30
 100 ms | ████████████████████████████████████████  33
 101 ms | ████████████████████████████  23
 102 ms | █  1
 105 ms | █  1
 106 ms | █  1
 107 ms | █  1
 108 ms | ████████  7
 109 ms | ██  2
 110 ms | ██████  5
 111 ms | ███████  6
 112 ms | ███████  6
 113 ms | ██████  5
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `8.77`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `4027.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23125 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.83`, p50 `9.99`, p95 `10.89`, p99 `11.01`, 1%low `8.84`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `100.12`, p50 `100.07`, p95 `111.49`, p99 `112.96`, p99.9 `113.21`, max `113.27`

**Client tick (ms)**  avg `0.28`, p95 `0.41`, max `1.60`

**Memory**  start `821 MB`, end `945 MB`, peak `945 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |              █                █         █                                      
 10.6 |              █                █         █                  █   █     █         
 10.4 | █            █     █     █    █         █       █          █   █     █     █   
 10.3 | █          █ █     █     █    █   █     █ █     █   █      █   █ █   █     █   
 10.2 | █          █ █     █     █  █ █   █     █ █   █ █   █      █   █ █   █     █   
 10.1 | █ █   █ █  █ █   █ █  █  █  █ █   █   █ █ █   █ █   ██     █   █ █   █ █   ██  
 10.0 | ██████████ █ █████ ██ ██ ██ █ ███ █████ █ ███ █ ███ ██████ ███ █ ███ █ ███ ████
  9.9 | ██████████ █ █████ █████ ████ █████████ █ █████ ███ ██████ ███ █ ███ █████ ████
  9.8 | ██████████ ███████ █████ ████ █████████ █ █████ ███ ██████ ███ █████ █████ ████
  9.6 |███████████ ██████████████████ █████████ ██████████████████ ███ █████ █████ ████
  9.5 |███████████ ██████████████████ █████████ ███████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | ██  4
  91 ms | ████  7
  92 ms | ██████  11
  93 ms | █████  9
  94 ms | ███  5
  95 ms | ██  3
  96 ms | █████  8
  97 ms | ████  7
  98 ms | █████  8
  99 ms | ███████████████  26
 100 ms | ████████████████████████████████████████  71
 101 ms | ███  6
 102 ms | █  2
 105 ms | █  1
 107 ms | ██  4
 108 ms | █  2
 109 ms | ███  5
 110 ms | █████  8
 111 ms | ██  4
 112 ms | █████  8
 113 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `8.84`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23170 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.14`, p50 `10.02`, p95 `11.31`, p99 `11.67`, 1%low `8.17`, 0.1%low `n/a`, std `0.69`

**Frame time (ms)**  avg `100.32`, p50 `99.79`, p95 `114.12`, p99 `118.73`, p99.9 `122.64`, max `122.80`

**Client tick (ms)**  avg `0.41`, p95 `1.14`, max `12.50`

**Memory**  start `838 MB`, end `1629 MB`, peak `1629 MB`, GC `45 events / 239 ms`

**FPS over sampling window (ASCII):**

```
 11.3 |                       █                                                        
 11.1 |                       █                                                        
 10.9 |                       █                             █              █      █    
 10.7 |   █ █                 █           █   █             █   █          █      █    
 10.5 |   █ █   █       █     █           █   █     █       █   █       █  █      █  █ 
 10.3 |   █ █   █ █ █   █     █   █ █     ██  █     █  █  █ █   █       █  █      █  █ 
 10.1 |█  █ ██  █ █ █   ██ █  █ ███ ██    ██  █████ █  ██ █ ██  █ ███ █ ██ ██████ ██ ██
  9.9 |██ █ ███ █ █ ███ █████ ███████████ ███ █████ ██ ██ █ ██  ███████ ██ ██████ ██ ██
  9.7 |██ █ ███ ███████ █████ ███████████ ███ █████ ███████ ███████████ ██ ██████ ██ ██
  9.5 |████████ █████████████ ███████████ ███ █████████████ ███████████ ██ ████████████
  9.3 |██████████████████████ █████████████████████████████████████████ ███████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | ███  3
  86 ms | ██  2
  87 ms | ████  4
  88 ms | ██████  5
  90 ms | ██  2
  91 ms | ██████  5
  92 ms | ██████  5
  93 ms | ███████  6
  94 ms | ███████  6
  95 ms | ███████  6
  96 ms | ████████  7
  97 ms | ████████  7
  98 ms | ██████████████████  16
  99 ms | ████████████████████████████████████████  36
 100 ms | ████████████████████████  22
 101 ms | ████████████████████  18
 102 ms | ████████  7
 103 ms | ████  4
 104 ms | ██  2
 105 ms | ██  2
 106 ms | ███  3
 107 ms | ██  2
 108 ms | ████  4
 109 ms | ██  2
 110 ms | ██  2
 111 ms | ███████  6
 112 ms | ██  2
 113 ms | ███  3
 114 ms | ██  2
 115 ms | █  1
 116 ms | ███  3
 117 ms | ██  2
 118 ms | █  1
 122 ms | ██  2
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.17`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `15.00`
- `entity_count_delta` = `-10.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `5.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7411.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23460 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.16`, p50 `10.07`, p95 `11.05`, p99 `11.85`, 1%low `8.27`, 0.1%low `n/a`, std `0.67`

**Frame time (ms)**  avg `100.28`, p50 `99.27`, p95 `113.71`, p99 `119.34`, p99.9 `121.96`, max `122.60`

**Client tick (ms)**  avg `0.32`, p95 `0.70`, max `1.71`

**Memory**  start `853 MB`, end `973 MB`, peak `1963 MB`, GC `35 events / 239 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                              █                      █                          
 10.8 |                              █          █      █    █                          
 10.6 |                      █       █     █    █      █    █           █  █  █        
 10.4 |       █     █        █  █  █ █   █ █    █      █    █           █  █  █        
 10.3 | ██  █ █  █  █   █ █  █ ██  █ █  ██ █    █      █  █ ██  █  █    █  █  █   █ █  
 10.1 | ██  █ █  █  █  ██ ██ █ ██  █ ██ ██ █    █ ██ █ █  █ ███ █  ████ ██ ██ ██  █ █  
  9.9 | ███ █ ██ ██ █████ ██ █ ██  █ ██ ██ ██ █ ██████ ██ █ ███ ███████ ██ ██ ████████ 
  9.7 | ████████████████████ █ █████ ██ ██ ████ ██████ ████ ███████████ ██ ██ ████████ 
  9.5 |█████████████████████ ███████ ██████████████████████ ███████████ ██ ████████████
  9.3 |████████████████████████████████████████████████████ ███████████████████████████
  9.2 |████████████████████████████████████████████████████ ███████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms | ███  2
  84 ms | ██  1
  88 ms | ██  1
  89 ms | ██████  4
  90 ms | ████████  5
  91 ms | ██████  4
  92 ms | █████████████  8
  93 ms | ████████  5
  94 ms | ███████████  7
  95 ms | ██████████  6
  96 ms | ██████████  6
  97 ms | ████████████████████████████████  20
  98 ms | ██████████████████████████████████████  24
  99 ms | ██████████████████████████  16
 100 ms | ████████████████████████████████████████  25
 101 ms | ██████████████████████  14
 102 ms | ██████  4
 103 ms | ██████████  6
 104 ms | ████████  5
 105 ms | ██  1
 106 ms | ██████  4
 107 ms | ██  1
 108 ms | ███  2
 109 ms | ██  1
 110 ms | ██████████  6
 111 ms | █████  3
 112 ms | ██████  4
 113 ms | ████████  5
 114 ms | █████  3
 115 ms | ███  2
 116 ms | ██  1
 119 ms | ███  2
 122 ms | ██  1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.27`
- `surface_water_ratio` = `0.03`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `3.00`
- `entity_count_delta` = `1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preload_duration_ms` = `400.00`
- `seed` = `7417.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23145 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.38`, p50 `10.02`, p95 `11.04`, p99 `11.60`, 1%low `8.54`, 0.1%low `n/a`, std `0.66`

**Frame time (ms)**  avg `100.21`, p50 `99.83`, p95 `113.17`, p99 `114.72`, p99.9 `118.46`, max `119.34`

**Client tick (ms)**  avg `0.36`, p95 `0.67`, max `13.49`

**Memory**  start `1888 MB`, end `1922 MB`, peak `2182 MB`, GC `22 events / 178 ms`

**FPS over sampling window (ASCII):**

```
 11.1 |                                                                       █        
 10.9 |                   █           █                                       █        
 10.7 |           █ █   █ █           █          █   █                        █        
 10.6 |           █ █   █ █  █        █          █   █  █   █  █     █  █     █        
 10.4 | █         █ █   █ █  █     █  █        █ █   █ ██   █  █     █  █ █   █  █     
 10.2 | █   █   █ █ █   █ █  █  █  █  █  █     █ █   █ ██   █  █  █  █  █ █   █  █  █  
 10.0 | ███ ██ ██ █ █ █ █ ██ ██ ██ ██ █  █ ██  █ █ █ █ ██ █ █  ██ █  ██ █ ███ █  ██ ██ 
  9.9 | █████████ █ ███ █ ██ █████ ██ ████████ █ ███ █ ████ ██ █████ ██ █ ███ ██ ██ ██ 
  9.7 | █████████ █ ███ █ ██ ████████ ██████████ ███ █ ████ ██ █████ ██ █ ███ ██ █████ 
  9.5 |██████████ █ █████ ██ ████████ ██████████ ███ █ ████████████████ █ ███ █████████
  9.4 |██████████████████████████████████████████████████████████████████████ █████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | █  1
  85 ms | █  1
  86 ms | ████  3
  87 ms | ████  3
  88 ms | █  1
  89 ms | █  1
  90 ms | █████  4
  91 ms | ███████████  8
  92 ms | ███████  5
  93 ms | █████  4
  94 ms | ████████████  9
  95 ms | ████████  6
  96 ms | ███████████  8
  97 ms | ███████  5
  98 ms | ████████████████████  15
  99 ms | ████████████████████████████████████████  30
 100 ms | ████████████████████████████████████████  30
 101 ms | █████████████████████  16
 102 ms | █████████████  10
 103 ms | ███  2
 104 ms | █  1
 105 ms | ███  2
 106 ms | ███  2
 107 ms | ███  2
 108 ms | ███  2
 109 ms | ████  3
 110 ms | ███████  5
 111 ms | ████  3
 112 ms | █████████  7
 113 ms | █████████  7
 114 ms | ████  3
 119 ms | █  1
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `67.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.54`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-5.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7433.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23171 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.14`, p50 `10.01`, p95 `11.05`, p99 `11.71`, 1%low `8.33`, 0.1%low `n/a`, std `0.65`

**Frame time (ms)**  avg `100.34`, p50 `99.85`, p95 `113.11`, p99 `116.27`, p99.9 `121.76`, max `122.91`

**Client tick (ms)**  avg `0.36`, p95 `0.69`, max `12.08`

**Memory**  start `1434 MB`, end `1608 MB`, peak `2218 MB`, GC `26 events / 210 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                █                            █                  
 10.7 |               █           █    █                            █                  
 10.5 |    █          █           █    █   █     █  █        █      █  █        █      
 10.4 |    █          █    █      █  █ █ █ █     █  █ █      █      █  █        █  █ █ 
 10.3 |    █       █  █    █ █    █  █ █ █ █   █ █  █ █      █   ██ █  █        █  █ █ 
 10.1 |█   █ █    ██  █ █  █ █ █  █  █ █ █ █   █ █  █ █ █    █ █ ██ █  ██    █  █  █ █ 
 10.0 |█ █ █ ████ ███ ███  ██████ ██ █ █ █ █ █ █ ██ █ █ ████ █ █ ██ ██ ███████  █  █ ██
  9.8 |███ ██████ ███ ████ ██████ ██ █ █ █ █████ ██ █ █ ████ ███ ██ ██ ████████ █  █ ██
  9.7 |███ ██████ ███ ████ ██████ ████ ███ █████ ██ ████████ ███ ██ ██ ████████ ███████
  9.6 |███ ██████████ ███████████ ████ ████████████ ████████████ ██ ██ ████████████████
  9.4 |███ ██████████████████████ ████ █████████████████████████ ██ ███████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █████  3
  86 ms | ███  2
  88 ms | ██████  4
  90 ms | ██████  4
  91 ms | ██████████  6
  92 ms | █████  3
  93 ms | ████████  5
  94 ms | ██████████████████  11
  95 ms | ██████████████  9
  96 ms | █████████████  8
  97 ms | ███████████  7
  98 ms | █████████████████████████████  18
  99 ms | ████████████████████████████████████████  25
 100 ms | ███████████████████████████  17
 101 ms | ██████████████████████████████████  21
 102 ms | ████████████████  10
 103 ms | ██████████  6
 104 ms | █████  3
 105 ms | █████  3
 106 ms | ██  1
 107 ms | ████████  5
 108 ms | █████  3
 109 ms | ████████  5
 110 ms | █████  3
 111 ms | ███  2
 112 ms | ████████  5
 113 ms | █████  3
 114 ms | ███  2
 115 ms | ███  2
 116 ms | ███  2
 117 ms | ██  1
 122 ms | ██  1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.97`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.33`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `7.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `13.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7451.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23243 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.17`, p50 `10.02`, p95 `11.08`, p99 `11.59`, 1%low `8.41`, 0.1%low `n/a`, std `0.65`

**Frame time (ms)**  avg `100.18`, p50 `99.81`, p95 `112.14`, p99 `114.36`, p99.9 `120.98`, max `122.34`

**Client tick (ms)**  avg `0.30`, p95 `1.06`, max `5.23`

**Memory**  start `1858 MB`, end `1640 MB`, peak `2314 MB`, GC `25 events / 210 ms`

**FPS over sampling window (ASCII):**

```
 11.2 |                                █                                               
 11.0 |                                █                                               
 10.8 |                █               █             █                                 
 10.6 |       █        █               █     █       █            █           █        
 10.5 |       █        █      █  █     █     █     █ █     █    █ █     █ █   █       █
 10.3 | █     █  █     █   █  █  ██    █     █ █   █ █     █    █ █     █ █   █  █   ██
 10.1 | ██  █ █  █ ██  █   ██ █  ████  █ ███ █ ██  █ █  ██ █    █ █ █ █ █ ██  █  █ █ ██
  9.9 | ██ ████  █████ ███ ██ ██ █████ █████ █ ███ █ █████ ███  █ █████ █ ███ ██████ ██
  9.8 |███ ████ ██████ ██████ ██ █████ █████ █ ███ █ ██████████ █ █████ █ ███ ██████ ██
  9.6 |█████████████████████████ █████ █████ ███████ ████████████ ███████████ ██████ ██
  9.4 |███████████████████████████████ ████████████████████████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  81 ms | █  1
  83 ms | █  1
  86 ms | ███  2
  87 ms | █  1
  89 ms | ██████  4
  90 ms | ███████  5
  91 ms | ████████████████  11
  92 ms | ██████  4
  93 ms | █  1
  94 ms | ██████████  7
  95 ms | ██████  4
  96 ms | ██████████  7
  97 ms | ███████████████████  13
  98 ms | ███████████████████████████████  21
  99 ms | █████████████████████████████████  22
 100 ms | ████████████████████████████████████████  27
 101 ms | ████████████████████████  16
 102 ms | ██████████  7
 103 ms | ██████████  7
 104 ms | ███  2
 106 ms | ███  2
 107 ms | █  1
 108 ms | ████████████  8
 109 ms | ████████████  8
 110 ms | ███████  5
 111 ms | ███  2
 112 ms | ████  3
 113 ms | ██████  4
 114 ms | ███  2
 115 ms | █  1
 122 ms | █  1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.41`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `55.00`
- `entity_count_delta` = `-54.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `105.00`
- `seed` = `7457.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24527 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.28`, p50 `10.01`, p95 `11.13`, p99 `11.35`, 1%low `8.40`, 0.1%low `n/a`, std `0.63`

**Frame time (ms)**  avg `100.11`, p50 `99.88`, p95 `113.13`, p99 `116.21`, p99.9 `120.11`, max `120.83`

**Client tick (ms)**  avg `0.30`, p95 `0.56`, max `1.57`

**Memory**  start `1778 MB`, end `2102 MB`, peak `2258 MB`, GC `22 events / 180 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                          █                                                     
 10.9 |                          █                 █     █                             
 10.7 |                      █   █                 █     █                             
 10.5 |                █     █   █  █  █           █     █  █                █  █      
 10.4 |                █     █   █  █  █           █     █  █                █  █  █  █
 10.2 |         █      █     █   █  █  █  █   █    █  █  █  █   █            █  █  ██ █
 10.1 |█ ██ ███ █ ████ █  ██ ███ █  ██ ██ ██  ███  ██ ██ █  ██ ██ ███ ██  █  █  █  ██ █
  9.9 |███████████████ █████ ███ ██ ██ ███████████ █████ ██ ████████████████ ██ ██ ██ █
  9.7 |███████████████ █████ ███ ██ ██ ███████████ █████ ███████████████████ █████ ████
  9.6 |█████████████████████ ███ █████ ███████████ █████ ██████████████████████████████
  9.4 |█████████████████████████ ██████████████████████████████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  86 ms | █  1
  88 ms | ███████  6
  89 ms | █████  4
  90 ms | ██████  5
  91 ms | ███  3
  92 ms | █████  4
  93 ms | ████████  7
  94 ms | ████████  7
  95 ms | ███████  6
  96 ms | █████  4
  97 ms | ███████  6
  98 ms | ███████████████████████████████  27
  99 ms | █████████████████████████████  25
 100 ms | ████████████████████████████████████████  35
 101 ms | ██████████████████  16
 102 ms | ████████  7
 103 ms | ██  2
 104 ms | ██  2
 105 ms | █  1
 107 ms | █████  4
 108 ms | █  1
 109 ms | ██  2
 110 ms | ██████  5
 111 ms | █████  4
 112 ms | █████  4
 113 ms | █████  4
 114 ms | ██  2
 115 ms | █  1
 116 ms | ██  2
 117 ms | █  1
 120 ms | █  1
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.40`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `10.00`
- `entity_count_delta` = `-9.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1403.00`
- `seed` = `7477.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.34`, p50 `10.05`, p95 `11.00`, p99 `11.36`, 1%low `8.44`, 0.1%low `n/a`, std `0.64`

**Frame time (ms)**  avg `100.09`, p50 `99.53`, p95 `113.93`, p99 `115.45`, p99.9 `119.34`, max `119.91`

**Client tick (ms)**  avg `0.40`, p95 `1.11`, max `7.62`

**Memory**  start `2098 MB`, end `1655 MB`, peak `2238 MB`, GC `26 events / 195 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                             █                                  
 10.7 |         █                                   █         █          █             
 10.6 |█        █                                 █ █         █ █        █  █      █  █
 10.4 |█      █ █   █             █               █ █         █ █        █  █      █  █
 10.3 |█      █ █ █ █  █     █    █   █ █         █ █    █    █ █        █  █   █  █  █
 10.2 |█ █    █ █ █ █  █  █  █  █ █ █ █ █         █ █    █    █ █  █  █  █  ██  █  █  █
 10.0 |████ █ █ █ █ █  ██ ██ ██ █ █ █ █ █████████ █ █ ██ ████ █ ████████ █  ██ ███ █  █
  9.9 |██████ █ █ █ ██ █████ ████ ███ █ █████████ █ ████ ████ █ ████████ ██ ██████ ██ █
  9.7 |██████ █ █████████████████████████████████ █ █████████ █ ████████ ██ ██████ ████
  9.6 |████████ ███████████████████████████████████ █████████ ██████████ ██ ██████ ████
  9.5 |████████ ███████████████████████████████████ █████████ █████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  87 ms | █  1
  88 ms | ██████  4
  89 ms | ███  2
  90 ms | ████  3
  91 ms | ███████  5
  92 ms | ████████████████  11
  93 ms | █████████  6
  94 ms | ██████████  7
  95 ms | █████████████████  12
  96 ms | ██████████  7
  97 ms | ████████████████  11
  98 ms | ██████████████████████████  18
  99 ms | ████████████████████████████████████████  28
 100 ms | ██████████████████████████████████  24
 101 ms | ████████████████████  14
 102 ms | █████████████  9
 103 ms | █  1
 104 ms | ███  2
 106 ms | █  1
 107 ms | ███  2
 109 ms | ███  2
 110 ms | ███  2
 111 ms | █████████████  9
 112 ms | █████████  6
 113 ms | ███  2
 114 ms | ██████████  7
 115 ms | █  1
 117 ms | █  1
 119 ms | █  1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `74.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.44`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `5.00`
- `entity_count_delta` = `8.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `13.00`
- `preload_duration_ms` = `93.00`
- `seed` = `7481.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24654 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.51`, p50 `10.03`, p95 `11.03`, p99 `11.48`, 1%low `8.57`, 0.1%low `n/a`, std `0.64`

**Frame time (ms)**  avg `100.22`, p50 `99.74`, p95 `113.64`, p99 `115.84`, p99.9 `117.14`, max `117.45`

**Client tick (ms)**  avg `0.39`, p95 `0.73`, max `1.86`

**Memory**  start `881 MB`, end `1929 MB`, peak `2200 MB`, GC `23 events / 192 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |                                    █                █                 █        
 10.7 |         █                          █      █     █   █ █               █  █     
 10.5 |         █  █   █ █   █             █      █     █   █ █               █  █     
 10.4 |      █  █  █   █ █   █             █      █     █   █ █               █  █     
 10.3 |█     █  █  █  ██ █   █ █         █ █   █  █     █   █ █   █  █        █  █   █ 
 10.1 |█  █  █ ██  █  ██ █   █ █    █    █ █   █  █   █ █   █ █   █  █  █     █  █ █ █ 
 10.0 |██ ██ █ ███ ██ ██ ██  █ ████ ███  █ █ █ ██ ███ █ ███ █ ███ ██ ██ ███ █ ██ █ █ █ 
  9.9 |██ ██ █ ███ ██ ██ ███ ███████████ █ ███ ██ █████ ███ █ ██████ ████████ ██ █████ 
  9.7 |█████ █ ███ ██ ██ ███ █████████████ ██████ █████ ███ █ ██████ ████████ ██ █████ 
  9.6 |███████ ██████ ██ █████████████████ ██████ █████ ███ █ ███████████████ ██ █████ 
  9.5 |███████ █████████████████████████████████████████████████████████████████ █████ 
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms | █  1
  86 ms | █  1
  87 ms | ██  2
  88 ms | █  1
  89 ms | ████  4
  90 ms | ███  3
  91 ms | █████████  8
  92 ms | ██████  5
  93 ms | ████  4
  94 ms | ███████  6
  95 ms | ██████████  9
  96 ms | ██████████  9
  97 ms | ████████  7
  98 ms | ██████████████  13
  99 ms | ████████████████████████████████████████  36
 100 ms | ████████████████████████████████████  32
 101 ms | █████████████  12
 102 ms | ███  3
 103 ms | ████  4
 104 ms | ██  2
 105 ms | ████  4
 106 ms | ██  2
 107 ms | ██████  5
 108 ms | █  1
 110 ms | ███  3
 111 ms | ███  3
 112 ms | ██████  5
 113 ms | ████  4
 114 ms | ███████  6
 115 ms | ███  3
 117 ms | █  1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.57`
- `surface_water_ratio` = `0.14`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `68.00`
- `entity_count_delta` = `-37.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `31.00`
- `preload_duration_ms` = `1606.00`
- `seed` = `7487.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23145 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.01`, p50 `10.04`, p95 `11.08`, p99 `11.32`, 1%low `8.26`, 0.1%low `n/a`, std `0.67`

**Frame time (ms)**  avg `100.19`, p50 `99.60`, p95 `114.00`, p99 `117.04`, p99.9 `123.37`, max `124.89`

**Client tick (ms)**  avg `0.38`, p95 `0.79`, max `2.59`

**Memory**  start `1679 MB`, end `1679 MB`, peak `2235 MB`, GC `20 events / 175 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                                                                  █             
 10.8 |                             █                              █  █  █  █  █       
 10.6 |                 █        █  █            █     █ █     █   █  █  █  █  █       
 10.5 |    █  █         █ █      █  █      █     █     █ █     █   █  █  █  █  █       
 10.3 |    █  █   █ █   █ █   █  █  █  █   █ █   █     █ █     █   █  █  █  █  █     █ 
 10.2 | █  ██ █   █ ██  █ ███ █  █  █  █   █ █   █   █ █ ██    █   █  █  █  █  █   █ █ 
 10.0 |███ ██ █  ██ ██  █ ███ ██ ██ ██ █ █ █ ███ ███ █ █ █████ ███ ██ ██ ██ ██ ██ ██ ██
  9.8 |███ ██ █████ ███ █ ███ ██ ██ ██████ █ ███ █████ █ █████ ███ ██ ██ ██ ██ ████████
  9.7 |███ ██ █████ ███ █ ██████ ██ ██████ █████ █████ █ █████ ███ ██ ██ ██ ██ ████████
  9.5 |███ ██████████████ █████████ ████████████████████ ████████████ ██ ██ ██ ████████
  9.3 |██████████████████ ██████████████████████████████████████████████ ██████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | █  1
  85 ms | █  1
  88 ms | ████  3
  89 ms | ██████  4
  90 ms | ██████  4
  91 ms | ██████████  7
  92 ms | ███████████████  10
  93 ms | ███████  5
  94 ms | █████████████  9
  95 ms | █████████  6
  96 ms | ██████████  7
  97 ms | █████████████  9
  98 ms | ████████████████████████████  19
  99 ms | █████████████████████████████████  22
 100 ms | ████████████████████████████████████████  27
 101 ms | ██████████████████████████████  20
 102 ms | ██████  4
 103 ms | ███  2
 104 ms | ███  2
 105 ms | ███  2
 106 ms | ████  3
 107 ms | ███  2
 108 ms | ████  3
 109 ms | ██████  4
 110 ms | █  1
 111 ms | ████  3
 112 ms | ██████  4
 113 ms | █████████  6
 114 ms | ███████  5
 115 ms | █  1
 116 ms | █  1
 117 ms | ███  2
 124 ms | █  1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `64.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.26`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `21.00`
- `entity_count_delta` = `-18.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `3.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7499.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23341 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.11`, p50 `10.02`, p95 `11.17`, p99 `11.69`, 1%low `8.17`, 0.1%low `n/a`, std `0.71`

**Frame time (ms)**  avg `100.21`, p50 `99.83`, p95 `113.12`, p99 `120.83`, p99.9 `122.94`, max `123.27`

**Client tick (ms)**  avg `0.28`, p95 `1.09`, max `1.76`

**Memory**  start `2117 MB`, end `1655 MB`, peak `2343 MB`, GC `17 events / 161 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                                                   █  █                         
 10.8 |                                   █   █           █  █                         
 10.6 |       █  █                        █   █        █  █  █    █  █                 
 10.4 |    █  █  █  █   █      █          █   █        █  █  █    █  █        █        
 10.3 |  █ █  █  █  █   █      █ █     █  █   █  █     █  █  █  █ █  █      █ ██       
 10.1 |  █ █  █ ██  █   █ █    █ █ ██  ██ ██  █  █     █  ██ █  █ █  ██ █   █ ██  █  █ 
 10.0 |█ █ ██ █ ██  ███ █████ ███████████ ███ ██ █████ ██ ██ ██ █ ██ ██ ███ █ ██████ █ 
  9.8 |███ ██ █ ██  ███ █████ ███████████ ███ ██ █████ ██ ██ ████ ██ ████████ ████████ 
  9.7 |███ ████ █████████████████████████ ███ ████████ ██ ██ ███████ ██████████████████
  9.5 |██████████████████████████████████ ███ ███████████ ██ ███████ ██████████████████
  9.3 |██████████████████████████████████████████████████ █████████████████████████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  76 ms | █  1
  81 ms | █  1
  85 ms | █  1
  86 ms | ██  2
  87 ms | █  1
  88 ms | █████  4
  89 ms | ██  2
  90 ms | █████  4
  91 ms | ██████  5
  92 ms | █████████  8
  93 ms | ██████  5
  94 ms | ██  2
  95 ms | ███████  6
  96 ms | ███████  6
  97 ms | ██████████████  12
  98 ms | ███████████████████  16
  99 ms | ████████████████████████████████████████  34
 100 ms | ███████████████████████████████████  30
 101 ms | ██████████████████  15
 102 ms | ███████  6
 103 ms | █  1
 104 ms | █  1
 106 ms | ██  2
 107 ms | ██  2
 108 ms | ██████  5
 109 ms | ████  3
 110 ms | ████  3
 111 ms | █████  4
 112 ms | ██████  5
 113 ms | █████  4
 114 ms | █  1
 115 ms | █  1
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
 120 ms | █  1
 121 ms | █  1
 123 ms | █  1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.17`
- `surface_water_ratio` = `0.07`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `289.00`
- `seed` = `7507.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23150 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.02`, p50 `10.03`, p95 `11.19`, p99 `11.52`, 1%low `8.24`, 0.1%low `n/a`, std `0.75`

**Frame time (ms)**  avg `100.22`, p50 `99.68`, p95 `115.34`, p99 `117.88`, p99.9 `123.37`, max `124.67`

**Client tick (ms)**  avg `0.34`, p95 `0.66`, max `3.52`

**Memory**  start `2147 MB`, end `2141 MB`, peak `2395 MB`, GC `22 events / 188 ms`

**FPS over sampling window (ASCII):**

```
 11.3 |         █                                                                      
 11.1 |         █                                                                      
 10.9 |         █            █            █                       █                    
 10.6 |         █            █  █   █     █        █  █        █  █       █           █
 10.4 |    █    ██ █         █  █   █ █   █        █  █  █     █  █  █    █  █  █     █
 10.2 | █  █    ██ ██  █   █ █  █   █ █ █ █      █ █  █  █   █ █  █  █  █ █  █  █  █  █
 10.0 | ██ ████ ██ ███ ██ ██ ██ ██  █ █ █ ██████ █ ██ ██ █ █ █ █  ██ ██ █ █  ██ █████ █
  9.8 |████████ ██ ██████ ██ ██ ███ █ ███ ████████ ██ ██ █████ ██ ██ ██ █ ███████████ █
  9.6 |████████ ██ █████████ ██ █████████ ███████████ ███████████ █████ █████████████ █
  9.4 |████████ ███████████████████████████████████████████████████████████████████████
  9.2 |████████ ███████████████████████████████████████████████████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  76 ms | ███  2
  86 ms | █  1
  87 ms | █  1
  88 ms | ██████  5
  89 ms | ██████████  8
  90 ms | ███  2
  91 ms | ████████  6
  92 ms | █  1
  93 ms | ███████████  9
  94 ms | ████████  6
  95 ms | ██████  5
  96 ms | ███████████  9
  97 ms | ██████████████  11
  98 ms | ████████████████████  16
  99 ms | ████████████████████████████████████████  32
 100 ms | █████████████████████████████████  26
 101 ms | ███████████  9
 102 ms | ███████████  9
 103 ms | ███  2
 104 ms | ███  2
 105 ms | ███  2
 106 ms | ███  2
 108 ms | ███  2
 109 ms | █████  4
 110 ms | █████  4
 111 ms | █████  4
 112 ms | ███  2
 113 ms | ██████  5
 114 ms | ███  2
 115 ms | ████  3
 116 ms | █████  4
 117 ms | ███  2
 118 ms | █  1
 124 ms | █  1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.98`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `67.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.24`
- `surface_water_ratio` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `35.00`
- `entity_count_delta` = `-30.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `5.00`
- `preload_duration_ms` = `0.00`
- `seed` = `7517.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23054 ms  |  Sample ticks: 400

**FPS**  avg `10.04`, min `7.87`, p50 `10.03`, p95 `11.16`, p99 `11.65`, 1%low `8.21`, 0.1%low `n/a`, std `0.72`

**Frame time (ms)**  avg `100.12`, p50 `99.66`, p95 `114.30`, p99 `115.94`, p99.9 `125.04`, max `127.12`

**Client tick (ms)**  avg `0.29`, p95 `0.75`, max `2.34`

**Memory**  start `1353 MB`, end `1406 MB`, peak `2329 MB`, GC `22 events / 174 ms`

**FPS over sampling window (ASCII):**

```
 11.0 |                                          █                             █       
 10.8 |█                                         █                       █     █       
 10.7 |█                █  █                     █  █                    █ █   █     █ 
 10.5 |█ █           █  █  █                  █  █  █       █   █        █ █   █  █  █ 
 10.3 |█ █   █     █ █  █  █                  █  █  █  █    █   █     █  █ █   █  █  █ 
 10.2 |█ █   █ █   █ █  █  █   █     █ █      █  █  █  █ ██ ██  ██ ██ █  █ ██  █  █  █ 
 10.0 |█ █ █ ████ ██ ██ ██ ███ ███████ ███ ██ █  ██ ██ ████ ███ ██ ██ █  █ ███ ██ ██ ██
  9.8 |█ ███ ████ ██ ██ ██ ██████████████████ ██ ██ ██ ████████ ██ █████ █ ███ ██ ██ ██
  9.7 |█ ███████████ ██ ██ █████████████████████ ██ ██ ████████ ██ █████ █ ███ ██ ██ ██
  9.5 |█████████████████████████████████████████ ██ ██████████████ █████ █ ███ ████████
  9.3 |███████████████████████████████████████████████████████████████████████ ████████
  9.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  75 ms | █  1
  85 ms | ██  2
  86 ms | █  1
  87 ms | ██  2
  88 ms | ███  3
  89 ms | ██  2
  90 ms | ██████  5
  91 ms | ███████████  10
  92 ms | ███████  6
  93 ms | ███████  6
  94 ms | ██████  5
  95 ms | ██████  5
  96 ms | ███████  6
  97 ms | █████  4
  98 ms | ███████████████  13
  99 ms | ████████████████████████████████████████  35
 100 ms | ███████████████████████████████████  31
 101 ms | ███████████████████  17
 102 ms | █████████  8
 103 ms | █  1
 105 ms | ██  2
 107 ms | ██  2
 108 ms | █████  4
 109 ms | ██  2
 110 ms | ██  2
 111 ms | ███  3
 112 ms | ███████  6
 113 ms | █████  4
 114 ms | ███  3
 115 ms | ███████  6
 116 ms | █  1
 127 ms | █  1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `8.21`
- `surface_water_ratio` = `0.02`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `40.00`
- `entity_count_delta` = `-15.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `25.00`
- `preload_duration_ms` = `99.00`
- `seed` = `7523.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.79`, p50 `9.99`, p95 `10.98`, p99 `11.25`, 1%low `8.80`, 0.1%low `n/a`, std `0.57`

**Frame time (ms)**  avg `100.08`, p50 `100.10`, p95 `112.17`, p99 `113.21`, p99.9 `113.72`, max `113.79`

**Client tick (ms)**  avg `0.24`, p95 `0.29`, max `1.57`

**Memory**  start `1200 MB`, end `1284 MB`, peak `1284 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |  █                █                  █           █                             
 10.6 |  █                █       █          █           █     █                       
 10.5 |█ █     █          █  █    █          █           █     █                 █     
 10.3 |█ █     █          █  █    █          █     █     █     █              █  █  █  
 10.2 |█ █   █ █  █       █  █  █ █     █  █ █     █     █     █              █  █  █  
 10.1 |█ █   █ █  █  █ █  █  █  █ █     █  █ █   █ █  █  █  █  █   █ █  █     ██ █  █ █
 10.0 |█ ███ █ ██ ██ ████ ██ ██ █ █████ ██ █ █████ ██ ██ █ ███ ██████████████ ██ ██ ███
  9.9 |█ █████ ██ ███████ ██ ██ █ ████████ █ █████ █████ █████ ██████████████ ██ ██ ███
  9.8 |█ █████ ██████████ ██ ████ ██████████ ███████████ █████ ██████████████ ██ ██ ███
  9.6 |█ ████████████████ ██ ████ ██████████ ███████████ █████ ██████████████ █████████
  9.5 |█ ████████████████ ███████ ██████████ ███████████ █████ ████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | ██  3
  89 ms | █  1
  90 ms | ████  6
  91 ms | ██████  11
  92 ms | █████  9
  93 ms | ██  4
  94 ms | █  1
  95 ms | █████  9
  96 ms | █  2
  97 ms | ████  6
  98 ms | ███  5
  99 ms | ██████████████████  30
 100 ms | ████████████████████████████████████████  68
 101 ms | █████  9
 102 ms | █  1
 103 ms | █  1
 105 ms | █  2
 106 ms | █  1
 107 ms | █  2
 108 ms | ███  5
 109 ms | ████  6
 110 ms | █  1
 111 ms | ███  5
 112 ms | █████  9
 113 ms | ██  3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `8.80`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.70`, p50 `10.04`, p95 `10.80`, p99 `11.32`, 1%low `8.75`, 0.1%low `n/a`, std `0.56`

**Frame time (ms)**  avg `100.05`, p50 `99.61`, p95 `111.47`, p99 `113.26`, p99.9 `114.67`, max `114.94`

**Client tick (ms)**  avg `2.60`, p95 `3.07`, max `3.77`

**Memory**  start `1584 MB`, end `1703 MB`, peak `2244 MB`, GC `1 events / 8 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                          █                                            █     █  
 10.6 |      █             █     █      █           █                    █    █   █ █  
 10.4 |   █  █    █  █  █  █ █   █ █    █           █   █           █ █  █    █   █ █  
 10.3 |█  █  █    █  █  █  █ █   █ █  █ █     █     █   █     █  █ ██ █  █  █ █   █ █  
 10.2 |█  █  █  █ ██ █  █  █ ██  █ █  █ █  █  █     █   █ ██  █  █ ██ █  █  █ █   █ █  
 10.1 |██ ██ █  █ ██ ██ █  █ ██  █ █  █ ██ █  ███ █ █   █ ██  █  █ ██ ██ █  █ █   █ ██ 
 10.0 |██ ██ ██ █ ██ ██ ██ █ ███ █ ██ █ ██ █  ███ █ ███ █ ███ ██ █ ██ ██ ██ █ ███ █ ██ 
  9.8 |██ ██ ████ ██ ██ ██ █ ███ █ ██ █ ████ ████ █████ █ ██████ █ ██ ██ ██ █ ███ █ ██ 
  9.7 |██ ██ ████ ██ ██ ██ █ ███ ████ █████████████████ ██████████ ██ ██ ████ ███ █ ██ 
  9.6 |██ ██ ████ ██ █████ █ ███ ████ ████████████████████████████ ██ ██ ████ █████ ██ 
  9.5 |███████████████████████████████████████████████████████████████████████████████ 
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  85 ms | █  1
  87 ms | █  1
  88 ms | █  1
  89 ms | ███  3
  90 ms | █  1
  91 ms | █  1
  92 ms | ██████████  9
  93 ms | ██████  6
  94 ms | ██████████  9
  95 ms | █████████████  12
  96 ms | ████████████  11
  97 ms | ███████████████  14
  98 ms | ████████████  11
  99 ms | ████████████████████████████████████████  37
 100 ms | ██████████████████████████████████████  35
 101 ms | ██████████  9
 102 ms | ██  2
 103 ms | ██  2
 106 ms | █  1
 107 ms | ███  3
 108 ms | ██  2
 109 ms | ████  4
 110 ms | ████████████  11
 111 ms | ██████  6
 112 ms | ████  4
 113 ms | ███  3
 114 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `fps_1pct_low` = `8.75`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `0.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `10.00`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23132 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.67`, p50 `9.99`, p95 `10.94`, p99 `11.14`, 1%low `8.73`, 0.1%low `n/a`, std `0.56`

**Frame time (ms)**  avg `100.10`, p50 `100.07`, p95 `112.65`, p99 `113.55`, p99.9 `115.04`, max `115.34`

**Client tick (ms)**  avg `0.25`, p95 `0.33`, max `1.47`

**Memory**  start `1781 MB`, end `1997 MB`, peak `1997 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |                                      █       █  █                         █    
 10.6 | █         █                       █  █       █  █  █        █  █          █    
 10.5 | █         █        █            █ █  █       █  █  █        █  █  █       █    
 10.4 | █   █  █  █     █  █            █ █  █     █ █  █  █        █  █  █       █    
 10.2 | █   █  █  █     █  █   █        █ █  █     █ █  █  █   █    █  █  █  █    █    
 10.1 | █   █  █  █  █  █  █   █  █    ██ █  █     █ █  █  █   █  █ █  █  █  █  █ █    
 10.0 | ███ ██ ██ █████ ██ ██ ████████ ██ ██ █████ █ ██ ██ ███ ████ ██ ██ ██ ████ █████
  9.9 | ███ ██ ██ █████ ██ ███████████ ██ ██ █████ █ ██ ██ ████████ ██ ██ ███████ █████
  9.7 | ███ ██ ██ ████████ ███████████ ██ ██ ███████ ██ ██ ████████ ██ ██ ███████ █████
  9.6 | █████████ ████████ ███████████ ██ ██ ███████ ██ ██ ████████ ██ ██████████ █████
  9.5 |██████████████████████████████████ ██ ███████ ██ █████████████████████████ █████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  1
  89 ms | █  2
  90 ms | ██  4
  91 ms | ████  7
  92 ms | ████  7
  93 ms | ███  6
  94 ms | ██████  10
  95 ms | █████  9
  96 ms | ███  6
  97 ms | ███  5
  98 ms | ██████  11
  99 ms | ███████████  19
 100 ms | ████████████████████████████████████████  70
 101 ms | █████  8
 102 ms | █  1
 104 ms | █  2
 105 ms | █  1
 107 ms | █  2
 108 ms | ██  4
 109 ms | ██  3
 110 ms | ████  7
 111 ms | ██  3
 112 ms | ██  4
 113 ms | ████  7
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3191.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `8.73`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `0.00`
- `seed` = `9043.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23126 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.68`, p50 `9.99`, p95 `10.98`, p99 `11.27`, 1%low `8.74`, 0.1%low `n/a`, std `0.53`

**Frame time (ms)**  avg `100.09`, p50 `100.09`, p95 `111.36`, p99 `113.69`, p99.9 `114.94`, max `115.24`

**Client tick (ms)**  avg `0.25`, p95 `0.29`, max `1.53`

**Memory**  start `890 MB`, end `1026 MB`, peak `1026 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |    █      █                                            █                       
 10.6 |    █      █                                 █          █                       
 10.5 |    █      █          █                █     █          █                       
 10.3 |    █      █          █                █     █     █    █      █                
 10.2 |    █ █    █    █     █     █     █   ██     █     █    █      █                
 10.1 |██  █ █    █    ██    █     █  █  █ █ ██ █   ██    █   ███     █  ██   █ ██ █ █ 
 10.0 |███ █ ████ ████ ████ ████ ████ ██ █ █ █████  █████ ███ ███████ ████████████ ████
  9.9 |███ ██████ ████ ████ ████████████████ █████ ██████ ███ █████████████████████████
  9.7 |███ ██████ ██████████████████████████ █████ ██████████ █████████████████████████
  9.6 |███ ██████ ██████████████████████████ ████████████████ █████████████████████████
  9.5 |███ ██████ ███████████████████████████████████████████ █████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  87 ms | █  1
  88 ms | █  2
  89 ms | ██  3
  90 ms | ██  3
  91 ms | ████  6
  92 ms | ███  5
  93 ms | ███  5
  94 ms | █████  8
  95 ms | ███  5
  96 ms | ████  6
  97 ms | ███  4
  98 ms | ████████  12
  99 ms | ████████████████  25
 100 ms | ████████████████████████████████████████  62
 101 ms | ████████████  18
 103 ms | █  2
 104 ms | █  1
 105 ms | █  1
 106 ms | █  2
 107 ms | ████  6
 108 ms | ████  6
 109 ms | ██  3
 110 ms | █  2
 111 ms | ███  4
 112 ms | ██  3
 113 ms | ███  4
 115 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `fps_1pct_low` = `8.74`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.83`, p50 `9.99`, p95 `10.88`, p99 `11.16`, 1%low `8.84`, 0.1%low `n/a`, std `0.47`

**Frame time (ms)**  avg `100.15`, p50 `100.09`, p95 `109.77`, p99 `112.49`, p99.9 `113.15`, max `113.21`

**Client tick (ms)**  avg `0.27`, p95 `0.42`, max `1.66`

**Memory**  start `778 MB`, end `934 MB`, peak `934 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.7 |         █     █                                                                
 10.6 |   █     █     █         █                        █          █                  
 10.5 |   █     █     █         █                        █     █    █          █     █ 
 10.3 |   █     █     █         █                        █     █    █          █     █ 
 10.2 |   █     █     █     █   █       █    █      █    █     █    █          █     █ 
 10.1 |   █     █     █    ██   ██      █    █    █ █    █    ██   ██     █    █ █   █ 
 10.0 |██ ████  █████ ████ ████ ██████ █████ ██████ ███  ███  ███  █████ ██ ██ █ ██  ██
  9.9 |██ ████ ██████ ████ ████ ████████████████████████ ████ ████ ███████████ ████  ██
  9.8 |██ ████ ██████ █████████ ████████████████████████ ████ ████ ███████████ ████████
  9.6 |██ ████ ██████ █████████ ████████████████████████ █████████ ███████████ ████████
  9.5 |██████████████ █████████ ███████████████████████████████████████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  88 ms | █  2
  89 ms | █  2
  90 ms | ██  3
  91 ms | ███  5
  92 ms | ███  5
  93 ms | ███  5
  94 ms | ███  5
  95 ms | ███  6
  96 ms | ███  5
  97 ms | █  1
  98 ms | ██████  11
  99 ms | ███████████████  28
 100 ms | ████████████████████████████████████████  73
 101 ms | ██████  11
 102 ms | ██  3
 103 ms | █  1
 104 ms | ██  3
 105 ms | ████  7
 106 ms | ███  5
 107 ms | █  2
 108 ms | ██  4
 109 ms | ██  4
 110 ms | █  2
 111 ms | ██  3
 112 ms | ██  3
 113 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `n/a`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `9.99`
- `restocks` = `20.00`
- `fps_1pct_low` = `8.84`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.81`, p50 `9.99`, p95 `10.87`, p99 `11.03`, 1%low `8.81`, 0.1%low `n/a`, std `0.47`

**Frame time (ms)**  avg `100.11`, p50 `100.09`, p95 `109.01`, p99 `112.73`, p99.9 `113.51`, max `113.53`

**Client tick (ms)**  avg `0.27`, p95 `0.43`, max `1.60`

**Memory**  start `1193 MB`, end `1353 MB`, peak `1353 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 10.6 |       █                                                 █                      
 10.5 |       █                      █                          █     █                
 10.4 |  █    █                      █                          █     █     █          
 10.3 |  █    █     █                █               █     █    █     █     █          
 10.2 |  █    █     █    █           █    █    █    ██    ██    █     █     █    █     
 10.1 | ██   ██     █    █   █ █  █  █ █  █ █  ███  ███   ██    █    ██     █    ██   █
 10.0 | ████ █████ ████████████████ █████ ████ ████ █████ █████ ████ █████  ████ ████ █
  9.9 | ████ ██████████████████████ ███████████████ █████ █████ ████ █████ ██████████ █
  9.8 | ████ ██████████████████████ ███████████████ █████ █████ ████ ████████████████ █
  9.6 |█████ ██████████████████████████████████████ ███████████ ████ ████████████████ █
  9.5 |█████ ██████████████████████████████████████████████████ ███████████████████████
  9.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  90 ms | █  3
  91 ms | ███  7
  92 ms | ████  9
  93 ms | ████  8
  94 ms | ██  4
  95 ms | ███  6
  96 ms | █  2
  97 ms |   1
  98 ms | ████  8
  99 ms | ████████████  24
 100 ms | ████████████████████████████████████████  83
 101 ms | ████  9
 103 ms | █  2
 104 ms | ██  4
 105 ms | ██  5
 106 ms | █  3
 107 ms | ████  8
 108 ms | ██  4
 109 ms | █  2
 110 ms |   1
 111 ms | █  3
 112 ms | █  2
 113 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `n/a`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `9.99`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1088.00`
- `fps_1pct_low` = `8.81`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1.00`
- `seed` = `8053.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195164 ms  |  Sample ticks: 3600

**FPS**  avg `10.03`, min `7.60`, p50 `10.01`, p95 `10.94`, p99 `11.22`, 1%low `8.08`, 0.1%low `7.60`, std `0.59`

**Frame time (ms)**  avg `100.10`, p50 `99.89`, p95 `112.25`, p99 `120.27`, p99.9 `128.37`, max `131.52`

**Client tick (ms)**  avg `0.66`, p95 `1.08`, max `2.80`

**Memory**  start `773 MB`, end `626 MB`, peak `1981 MB`, GC `11 events / 67 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |      █                                                                         
 10.1 |      █                                                                         
 10.1 |      █                                                                         
 10.1 |      █         █      █               █    █   █  █   █                   █    
 10.1 | █    █ █       █  █   █  █   █        █    █   █  █   █  █         █      █    
 10.1 | █  █ █ █    █  █  █   █  █   █  █     █    █   █  █   █  █         █      █    
 10.0 | █  █ █ █    ██ █ ███  ██ ██  ██ ███   █ █  █   ██ █   █  █  █ █    █      █    
 10.0 |█████ ██████ ██ █████ ███ ███ ██ █████ ███  ██  ██ ██  ██ ████ ███  █████  █ ███
 10.0 |█████ ██████ ████████ ███ ███ ██ █████ ███  ███ ██ ██  ██ ████ ████ █████  █████
 10.0 |█████ ██████ ████████ ███████ ████████ ████ ███ ██ ██████ ███████████████ ██████
 10.0 |█████ ██████ ████████████████ █████████████ ███ ██ ██████ ██████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  79 ms |   1
  80 ms |   2
  81 ms |   1
  85 ms |   1
  86 ms |   1
  87 ms |   1
  88 ms | █  11
  89 ms | ██  19
  90 ms | ███  34
  91 ms | ████  50
  92 ms | ██████  67
  93 ms | ███████  77
  94 ms | ██████  72
  95 ms | ██████  66
  96 ms | ██████  67
  97 ms | █████  55
  98 ms | ████████  96
  99 ms | ██████████████████████████████  347
 100 ms | ████████████████████████████████████████  458
 101 ms | ██████  65
 102 ms | █  12
 103 ms | █  8
 104 ms |   5
 105 ms | █  8
 106 ms | █  11
 107 ms | █  12
 108 ms | █  17
 109 ms | ██  22
 110 ms | ████  46
 111 ms | █████  59
 112 ms | ████  44
 113 ms | ██  24
 114 ms | █  10
 115 ms |   3
 116 ms |   2
 117 ms |   1
 118 ms |   1
 119 ms |   3
 120 ms |   4
 121 ms |   5
 122 ms |   3
 123 ms |   1
 124 ms |   1
 125 ms |   2
 127 ms |   1
 131 ms |   2
```

**Extras:**

- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `8.08`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.60`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `67.00`
- `trees_built` = `173.00`
- `phase` = `0.00`
- `segment_count` = `19.00`
- `part` = `2.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `22.00`
- `other_entities_spawned` = `58.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194441 ms  |  Sample ticks: 3600

**FPS**  avg `10.03`, min `7.94`, p50 `10.02`, p95 `10.93`, p99 `11.19`, 1%low `8.43`, 0.1%low `8.10`, std `0.59`

**Frame time (ms)**  avg `100.11`, p50 `99.81`, p95 `112.39`, p99 `115.27`, p99.9 `120.83`, max `125.92`

**Client tick (ms)**  avg `0.64`, p95 `1.06`, max `10.53`

**Memory**  start `864 MB`, end `1331 MB`, peak `1932 MB`, GC `10 events / 60 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |    █              █    █      █                                            █   
 10.1 | █  █    █   █     █    █      █    █                                █      █   
 10.1 | █  █    █   █     █    █      █    █        █                █      █      █   
 10.0 | █  █    █   █     █    █ █    █    █        █ █     █        █ █    █      █   
 10.0 | █  █    █   █     █    █ █    ██   █   █  █ █ ████  ██ █  █  █ █    █      █   
 10.0 | █  ██   ███ ███   █    ███  ████   ██ ██  █ ██████  ██ █  █  █ ██ █ ███ █  █ █ 
 10.0 | █  ██   ████████ ██  █████ ███████ ██ ███ █ ███████ ███████  █ ████ ██████ ███ 
 10.0 | █ ███ ██████████ █████████ ████████████████ ███████ ████████ █ ████ ██████ ███ 
 10.0 | █ ██████████████ █████████ ████████████████ ███████ ██████████ ████ ██████ ███ 
 10.0 | █ ██████████████ █████████ ████████████████ ███████ ██████████ ████ ██████ ███ 
 10.0 | ███████████████████████████████████████████████████ ██████████████████████ ████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms |   1
  83 ms |   1
  84 ms |   1
  85 ms |   1
  86 ms |   3
  87 ms |   4
  88 ms | █  6
  89 ms | █  13
  90 ms | ████  34
  91 ms | ██████  54
  92 ms | ████████  78
  93 ms | █████████  83
  94 ms | ████████  80
  95 ms | ████████  74
  96 ms | ███████  65
  97 ms | ██████  62
  98 ms | ██████████  92
  99 ms | █████████████████████████████████████  360
 100 ms | ████████████████████████████████████████  386
 101 ms | ████████  75
 102 ms | █  13
 103 ms |   2
 104 ms |   4
 105 ms |   3
 106 ms |   4
 107 ms | █  10
 108 ms | ██  23
 109 ms | ███  29
 110 ms | ██████  59
 111 ms | ███████  68
 112 ms | ██████  58
 113 ms | ██  20
 114 ms | █  13
 115 ms |   3
 116 ms |   4
 117 ms |   2
 118 ms | █  5
 119 ms |   2
 120 ms |   3
 125 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `LowEnd Shader + PBR Textures`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `91.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `8.43`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `8.10`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `71.00`
- `trees_built` = `173.00`
- `phase` = `1.00`
- `segment_count` = `19.00`
- `part` = `3.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `20.00`
- `other_entities_spawned` = `58.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194156 ms  |  Sample ticks: 3600

**FPS**  avg `10.03`, min `8.18`, p50 `10.01`, p95 `10.93`, p99 `11.18`, 1%low `8.54`, 0.1%low `8.31`, std `0.59`

**Frame time (ms)**  avg `100.10`, p50 `99.85`, p95 `112.19`, p99 `115.57`, p99.9 `117.76`, max `122.23`

**Client tick (ms)**  avg `0.63`, p95 `1.04`, max `1.63`

**Memory**  start `1653 MB`, end `1627 MB`, peak `1923 MB`, GC `11 events / 66 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |               █                     █                                █         
 10.1 |               █   █             █   █                       █        █   █     
 10.1 |  █            █   █        █    █   █   █                   █        █   █     
 10.0 |  █            █   █  █ █   █    █   █   █ █        █  █     █        █   █   █ 
 10.0 | ██ █ ███     ██   ██ █ █   █ ██ ███ █   █ █     █  ██ █     ███ █    █   █   █ 
 10.0 | ████ ███████ ███  ██ ███  █████ ███ ███ █ ██ █ ███ ██ ██ ██ ███ █ █  ██  ███ ██
 10.0 |█████ ███████ ████ ██ ████ █████ ███ ███ ██████████ █████ ██ ███ ███  ███ ███ ██
 10.0 |█████ ███████ ████ ██ ████ █████ ███ ███ ███████████████████ ████████ ███ ███ ██
 10.0 |█████ ███████ ████ █████████████ ███ ███ ███████████████████ ████████████ ███ ██
 10.0 |█████████████ ████ █████████████████ ███████████████████████ ███████████████████
 10.0 |█████████████ ██████████████████████████████████████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  86 ms |   3
  87 ms |   4
  88 ms | █  8
  89 ms | █  13
  90 ms | ████  36
  91 ms | █████  54
  92 ms | ███████  69
  93 ms | ████████  84
  94 ms | █████████  94
  95 ms | ████████  78
  96 ms | █████  56
  97 ms | ███████  73
  98 ms | ████████  78
  99 ms | █████████████████████████████████  337
 100 ms | ████████████████████████████████████████  411
 101 ms | ███████  72
 102 ms | ██  20
 104 ms |   2
 105 ms |   1
 106 ms | █  6
 107 ms | █  15
 108 ms | █  11
 109 ms | ███  27
 110 ms | █████  56
 111 ms | █████████  88
 112 ms | █████  48
 113 ms | ██  18
 114 ms | █  12
 115 ms | █  10
 116 ms |   5
 117 ms | █  7
 118 ms |   1
 122 ms |   1
```

**Extras:**

- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `90.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `8.54`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `8.31`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `70.00`
- `trees_built` = `173.00`
- `phase` = `2.00`
- `segment_count` = `19.00`
- `part` = `4.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `20.00`
- `other_entities_spawned` = `58.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194810 ms  |  Sample ticks: 3600

**FPS**  avg `10.03`, min `7.71`, p50 `10.01`, p95 `10.96`, p99 `11.25`, 1%low `8.05`, 0.1%low `7.78`, std `0.60`

**Frame time (ms)**  avg `100.10`, p50 `99.85`, p95 `112.42`, p99 `121.41`, p99.9 `127.21`, max `129.76`

**Client tick (ms)**  avg `0.63`, p95 `1.09`, max `6.14`

**Memory**  start `1145 MB`, end `1744 MB`, peak `1934 MB`, GC `10 events / 42 ms`

**FPS over sampling window (ASCII):**

```
 10.1 |    █                                                                           
 10.1 |    █                              █                              █   █         
 10.1 |    █                ██            █       █ █  █   █   █   █     █   █      █  
 10.1 |   ██ █     █  █     ██            █  █    █ █  █   █   █   █     █   █      █  
 10.0 |   ██ █ █   ██ █     ██    █    █  █  █    █ █  █   █   █   █     █   █      ██ 
 10.0 | █ ██ ███   ██ █    ███ █  █ ████ ███ ██ █ █ █  █   █  ██ █ █ ██  █   ██     ███
 10.0 | █ ██ ███   ██ █    ██████ ██████ ███ ████ ███ ███ ██  ████ ████  █   █████ ████
 10.0 | █ ██████ █ ██ █ ████████████████ ███ ████ ███ ███ ██ ███████████ ███ █████ ████
 10.0 |██████████████ ██████████████████ ███ ████ ███ ███ ██████████████ ███ █████ ████
 10.0 |██████████████ ██████████████████ ████████ ███ ██████████████████████ ██████████
 10.0 |█████████████████████████████████ ████████ █████████████████████████████████████
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  80 ms |   1
  83 ms |   1
  85 ms |   1
  86 ms |   5
  87 ms |   4
  88 ms | █  9
  89 ms | ███  28
  90 ms | ███  29
  91 ms | ██████  57
  92 ms | ███████  73
  93 ms | ████  42
  94 ms | ████████  76
  95 ms | ██████  65
  96 ms | ██████  64
  97 ms | ███████  67
  98 ms | ███████████  116
  99 ms | ███████████████████████████████████  354
 100 ms | ████████████████████████████████████████  405
 101 ms | ██████████  98
 102 ms | ██  16
 103 ms |   4
 104 ms |   5
 105 ms | █  14
 106 ms | █  10
 107 ms | █  10
 108 ms | █  11
 109 ms | ███  30
 110 ms | ████  42
 111 ms | █████  55
 112 ms | ████  43
 113 ms | █  13
 114 ms |   5
 115 ms | █  9
 116 ms | █  6
 117 ms |   4
 118 ms |   2
 120 ms |   4
 121 ms |   5
 122 ms | █  6
 123 ms |   2
 124 ms |   1
 125 ms |   3
 126 ms |   1
 127 ms |   2
 129 ms |   1
```

**Extras:**

- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `part_label` = `HighEnd Shader + PBR Textures`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `90.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `8.05`
- `fps_harmonic_avg` = `9.99`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `0.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `7.78`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `70.00`
- `trees_built` = `173.00`
- `phase` = `3.00`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `20.00`
- `other_entities_spawned` = `58.00`

