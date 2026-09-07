# FPS Test session — 2026-09-07T16:20:55.6340647+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 244.9 | 46.3 | 44.5 | 21.02 | 0.60 | 1 | 144 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 243.3 | 45.5 | 43.0 | 21.38 | 0.66 | 5 | 175 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 31.1 | 20.3 | 17.3 | 46.49 | 0.70 | 2 | 24 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 31.2 | 21.1 | 20.5 | 46.47 | 0.70 | 5 | 103 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 245.5 | 44.1 | 35.7 | 21.76 | 0.66 | 5 | 141 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 246.9 | 45.3 | 39.3 | 21.06 | 0.48 | 4 | 278 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 153.3 | 21.2 | 19.4 | 45.91 | 0.64 | 4 | 40 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 169.9 | 41.3 | 28.6 | 21.62 | 1.02 | 9 | 330 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 267.4 | 40.6 | 33.0 | 23.23 | 2.90 | 8 | 209 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 109.5 | 16.9 | 16.0 | 56.03 | 3.88 | 14 | 363 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 31.5 | 20.7 | 20.3 | 47.18 | 0.96 | 5 | 169 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 30.9 | 21.0 | 20.5 | 46.80 | 0.47 | 2 | 92 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 35.0 | 16.9 | 15.9 | 56.46 | 3.16 | 5 | 163 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 33.5 | 16.9 | 16.2 | 56.87 | 2.76 | 4 | 362 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 44.3 | 12.9 | 12.0 | 73.39 | 16.02 | 29 | 616 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 43.4 | 13.8 | 13.1 | 69.45 | 16.65 | 29 | 291 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 31.2 | 20.6 | 19.8 | 47.34 | 1.90 | 2 | 248 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 31.3 | 20.6 | 20.2 | 47.88 | 1.90 | 2 | 376 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 31.2 | 21.0 | 20.9 | 46.95 | 0.69 | 0 | 500 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 30.9 | 21.4 | 21.2 | 46.25 | 0.28 | 0 | 156 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 30.7 | 21.3 | 21.0 | 46.16 | 0.24 | 3 | 508 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 31.1 | 20.9 | 20.5 | 46.80 | 0.30 | 1 | 372 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 31.0 | 21.1 | 21.0 | 46.90 | 0.28 | 0 | 184 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 31.9 | 18.9 | 16.1 | 49.70 | 0.37 | 44 | 354 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 31.6 | 19.5 | 17.4 | 48.43 | 0.36 | 33 | 458 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 31.6 | 19.2 | 16.7 | 48.58 | 0.36 | 25 | 1251 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 10.0 | 7.9 | n/a | 125.94 | 0.42 | 25 | 262 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 10.0 | 8.4 | n/a | 116.32 | 0.36 | 22 | 49 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 10.0 | 8.2 | n/a | 119.05 | 0.37 | 25 | 20 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 10.0 | 8.4 | n/a | 116.58 | 0.38 | 24 | 965 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 10.0 | 8.2 | n/a | 116.92 | 0.44 | 24 | 1301 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 162.1 | 8.7 | 8.5 | 113.13 | 0.39 | 25 | 1130 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 244.5 | 40.3 | 25.5 | 22.08 | 0.30 | 17 | 806 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 206.0 | 20.7 | 19.5 | 46.00 | 0.36 | 20 | 930 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 31.4 | 18.8 | 17.6 | 51.25 | 0.33 | 24 | 508 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 30.9 | 20.8 | 20.5 | 46.77 | 0.25 | 0 | 136 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 33.3 | 15.7 | 13.2 | 54.50 | 2.80 | 2 | 80 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 31.4 | 18.1 | 16.4 | 50.52 | 0.26 | 0 | 280 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 30.9 | 21.6 | 20.9 | 45.40 | 0.26 | 0 | 200 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 31.2 | 19.4 | 16.1 | 47.23 | 0.26 | 0 | 224 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 30.9 | 21.0 | 18.3 | 45.75 | 0.27 | 0 | 220 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 91.0 | 16.9 | 13.9 | 55.20 | 0.76 | 21 | 1196 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 34.8 | 16.8 | 15.2 | 57.54 | 0.70 | 18 | 193 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 35.5 | 16.1 | 13.4 | 58.88 | 0.71 | 16 | 660 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 25.2 | 8.4 | 7.5 | 114.08 | 0.68 | 14 | 1078 |

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

Category: **Particles**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `244.90`, min `44.05`, p50 `118.17`, p95 `1354.68`, p99 `1611.29`, 1%low `46.32`, 0.1%low `44.48`, std `381.90`

**Frame time (ms)**  avg `9.07`, p50 `8.46`, p95 `17.82`, p99 `21.02`, p99.9 `22.17`, max `22.70`

**Client tick (ms)**  avg `0.60`, p95 `0.88`, max `1.31`

**Memory**  start `655 MB`, end `720 MB`, peak `799 MB`, GC `1 events / 7 ms`

**FPS over sampling window (ASCII):**

```
360.2 |                                          █                                █    
340.0 |                                          █           █  █           ██    █    
319.9 |                     █                    █        █  █  █      █    ██    █    
299.7 |                     █              █     █        █  █  █      █ █ ███    █  █ 
279.5 |                █    █         █  █ █   █ █ █      █  █ ███   █ ███ ██████ █  █ 
259.4 |                █  █ ███   █  ██  █ █   █ ███    █ █  █ ███  ██ ███ ██████ █  █ 
239.2 |      █   █     ████████   ██ ██  ███ ███ ███ █  ███  █ ███ ███████ ██████ ████ 
219.0 | █    █  ████ █ ████████   ██ ██ ████ ███ ███ █ █████ █████████████ ██████ ████ 
198.9 |█████ █████████ ████████  ███ ███████████ ███ ████████████████████████████ █████
178.7 |█████████████████████████████ ███████████████ ████████████████████████████ █████
158.6 |█████████████████████████████ ██████████████████████████████████████████████████
138.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  199
   1 ms | ███  69
   2 ms | █  26
   3 ms |   2
   6 ms | █  14
   7 ms | █████████  232
   8 ms | ████████████████████████████████████████  1074
   9 ms | ██████  149
  10 ms |   7
  13 ms |   12
  14 ms | ██  52
  15 ms | ████  114
  16 ms | ████  94
  17 ms | ██  63
  18 ms | █  25
  19 ms | █  23
  20 ms | █  27
  21 ms | █  19
  22 ms |   4
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `sculk_charge_pop` | 240 | 275 | 203.0 | 20.80 |
| `smoke` | 160 | 275 | 234.9 | 21.26 |
| `flame` | 160 | 275 | 225.8 | 19.59 |
| `dripping_water` | 240 | 275 | 244.9 | 21.16 |
| `dragon_breath` | 160 | 275 | 239.1 | 18.28 |
| `end_rod` | 240 | 275 | 264.8 | 21.02 |
| `portal` | 160 | 275 | 286.6 | 21.16 |
| `ALL_TOGETHER` | 1680 | 275 | 258.4 | 20.93 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `particles_stage_sculk_charge_pop` = `240.00`
- `fps_1pct_low` = `46.32`
- `particles_stage_smoke` = `160.00`
- `particles_stage_flame` = `160.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `particles_stage_dripping_water` = `240.00`
- `particles_total` = `3040.00`
- `particle_stage_count` = `8.00`
- `entity_count_sample_start` = `1.00`
- `particles_stage_dragon_breath` = `160.00`
- `preload_duration_ms` = `36.00`
- `particle_stage_ticks` = `50.00`
- `preset_quick` = `1.00`
- `particles_stage_end_rod` = `240.00`
- `seed` = `2503.00`
- `fps_harmonic_avg` = `110.25`
- `fps_0p1pct_low` = `44.48`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_stage_portal` = `160.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `243.30`, min `42.76`, p50 `118.03`, p95 `1214.15`, p99 `1361.31`, 1%low `45.45`, 0.1%low `42.96`, std `347.50`

**Frame time (ms)**  avg `9.06`, p50 `8.47`, p95 `18.62`, p99 `21.38`, p99.9 `23.04`, max `23.39`

**Client tick (ms)**  avg `0.66`, p95 `0.92`, max `1.41`

**Memory**  start `656 MB`, end `443 MB`, peak `832 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
359.2 |                                                                              █ 
341.8 |                                                                       █      █ 
324.4 |                    █                                                  █      █ 
307.0 |                    █                                    █           █ ████ █ █ 
289.6 |                    █                 █   █              █      █ █  █ ████ ████
272.3 |   █     █          █            █ █  █   █     █   █    █  █   █ ████ █████████
254.9 |   █    ██          █     █      █ █  █ █ █   █ █   █    █  ██  █ ██████████████
237.5 |█  █  █ ██ ██     █ ██    █  █  ██ █  █ ███   ███ ███   ██  ██ █████████████████
220.1 |██ ████ ██ ██ █ █ █ ██ ██ █ ███ ██ ██ █████ █ ███ █████ ██  ████████████████████
202.7 |██████████ ██ █ █ █ ██ ████████ ██ ██████████ ██████████████████████████████████
185.4 |█████████████████ █ ████████████████████████████████████████████████████████████
168.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  202
   1 ms | ████  109
   2 ms | █  18
   3 ms |   4
   6 ms |   8
   7 ms | █████████  236
   8 ms | ████████████████████████████████████████  1018
   9 ms | ███████  180
  10 ms |   2
  13 ms |   9
  14 ms | █  37
  15 ms | ███  84
  16 ms | ███  86
  17 ms | ███  75
  18 ms | ██  43
  19 ms | █  31
  20 ms | █  29
  21 ms | █  29
  22 ms |   5
  23 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `45.45`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `42.96`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `110.38`
- `preload_duration_ms` = `46.00`
- `entities_spawned` = `200.00`
- `seed` = `6121.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `31.07`, min `17.29`, p50 `29.82`, p95 `46.53`, p99 `50.67`, 1%low `20.28`, 0.1%low `17.29`, std `6.55`

**Frame time (ms)**  avg `33.40`, p50 `33.54`, p95 `44.57`, p99 `46.49`, p99.9 `53.59`, max `57.82`

**Client tick (ms)**  avg `0.70`, p95 `0.98`, max `2.82`

**Memory**  start `832 MB`, end `458 MB`, peak `856 MB`, GC `2 events / 16 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |                                                                  █             
 33.4 |         █                                     █              █   █     █       
 32.9 |         █     █                 █             █        █    ██   █     █       
 32.4 |         █     █                 █      █      █ █      █    ██  ██     █    █  
 31.9 |     █ █ ██    █          █ █    █  █   █      █ █      █    ██  ██ █ █ ██   █  
 31.4 | █ █ █ █ ██ ██ █   █   ██ █ ██   █ ██ █ █   ██ █ ██   █ █    ██  ██ ███ ██ █ █  
 30.9 | █ █ █ █ ██ ██ █  ██  ███ █ ██  ██ ██ █ █  ███ █ ██ █ █ █    ██  ██ ██████ █ █ █
 30.4 |██ █ █ █ ██ ██ █████ ██████ ███ ██████████████ █ ██ █ █ ████ ██  █████████ █████
 29.9 |████ ███ █████████████████████████████████████ █ ███████████████ ███████████████
 29.4 |████ ███ ███████████████████████████████████████ ███████████████ ███████████████
 29.0 |████████ ███████████████████████████████████████████████████████ ███████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  18 ms |   1
  19 ms | ███  9
  20 ms | █████  14
  21 ms | ████  11
  22 ms | █████  14
  23 ms | ████  11
  24 ms | ██  6
  25 ms | ███  7
  26 ms | █████  12
  27 ms | █████  12
  28 ms | ███  7
  29 ms | ███  9
  30 ms | ██████  16
  31 ms | ████  11
  32 ms | █████████████████████████████████████  98
  33 ms | ████████████████████████████████████████  106
  34 ms | ███████████████████████████████████████  103
  35 ms | ██████  16
  36 ms | █████  14
  37 ms | ██████  15
  38 ms | ███  9
  39 ms | ████████  21
  40 ms | ████  11
  41 ms | ████  11
  42 ms | ██  4
  43 ms | ██████  15
  44 ms | ███  9
  45 ms | ██████  16
  46 ms | ███  8
  50 ms |   1
  57 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `20.28`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `17.29`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `41.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `31.22`, min `20.46`, p50 `29.90`, p95 `47.34`, p99 `51.60`, 1%low `21.12`, 0.1%low `20.46`, std `6.97`

**Frame time (ms)**  avg `33.40`, p50 `33.45`, p95 `45.09`, p99 `46.47`, p99.9 `48.03`, max `48.87`

**Client tick (ms)**  avg `0.70`, p95 `0.89`, max `1.12`

**Memory**  start `723 MB`, end `544 MB`, peak `826 MB`, GC `5 events / 14 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                                         █                                      
 34.2 |                                         █                                      
 33.6 |     █                                 █ █         █                            
 33.1 |     █ █                               █ █         █                      █     
 32.5 |     █ █             █       █   █     █ █   █     █     █        █       ██ █  
 32.0 |█  █ █ █ ██ █   █    ██  █   █   █ █   █ █   █     █   █ █     █  █       ██ █  
 31.4 |█  █ █ ████ █████   ███  █ ███   █ █   █ █   █ ██  █   █ █████ ██ █  █  █ ██ █ █
 30.9 |██ ███ ████ █████ █ ███  █████ █ █ █ █ █ █   █ ███ ███ █ ████████ ████  █ ██ █ █
 30.3 |██ ██████████████ █ ██████████ █████ █ █ ███ ███████████ ███████████████████ ███
 29.8 |███████████████████ ██████████████████ █ ███ ███████████████████████████████████
 29.2 |███████████████████ ██████████████████ █ ███████████████████████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms | ██  5
  19 ms | ███  7
  20 ms | ███████  17
  21 ms | ████████  20
  22 ms | ████  10
  23 ms | ████  10
  24 ms | ████  9
  25 ms | ██  6
  26 ms | █████  14
  27 ms | █████  12
  28 ms | ██  4
  29 ms | ██████  15
  30 ms | ████  10
  31 ms | ██████  15
  32 ms | ██████████████████████████████████████  96
  33 ms | ████████████████████████████████  82
  34 ms | ████████████████████████████████████████  102
  35 ms | ███████  19
  36 ms | █████  14
  37 ms | █████  14
  38 ms | ██████  15
  39 ms | ████  10
  40 ms | ████  11
  41 ms | ███████  17
  42 ms | ███  8
  43 ms | ██  6
  44 ms | ███████  18
  45 ms | ███████  19
  46 ms | ████  10
  47 ms | █  3
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.12`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `152.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `20.46`
- `entity_count_sample_end` = `152.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `49.00`
- `entities_spawned` = `150.00`
- `seed` = `6151.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `245.55`, min `31.68`, p50 `118.50`, p95 `1284.59`, p99 `1433.06`, 1%low `44.10`, 0.1%low `35.69`, std `361.87`

**Frame time (ms)**  avg `9.05`, p50 `8.44`, p95 `17.82`, p99 `21.76`, p99.9 `23.02`, max `31.57`

**Client tick (ms)**  avg `0.66`, p95 `1.00`, max `1.98`

**Memory**  start `732 MB`, end `581 MB`, peak `874 MB`, GC `5 events / 15 ms`

**FPS over sampling window (ASCII):**

```
336.2 |                                          █                                     
319.1 |     █                                    █                                     
301.9 |     █                   █    █           █    █                      █      █  
284.7 |     █  █             █  █   ██  █ ██     █    █         █   ██   █   ██  █  █  
267.5 |  █ ██  █       █   ████ █   ██ ██ ██     █ ██ █         █   ██  ██   ██  █ ██  
250.3 |  █ ██  ███  █ ██  █████ █   ██ ██ ██ █  ██ ██ █  █  █ █ █   ██  ██   ███ █ ██ █
233.2 |███ ██  ████ █████ ███████   ██ █████ ████████ █ ██ ██ █ ██  ██  ██   █████ ██ █
216.0 |███ ██  ████ ██████████████  ██ █████ ████████ ███████ █ ███ ██████  █████████ █
198.8 |██████  █████████████████████████████ █████████████████████████████ ████████████
181.6 |███████ █████████████████████████████ ██████████████████████████████████████████
164.5 |███████ ████████████████████████████████████████████████████████████████████████
147.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  203
   1 ms | ████  94
   2 ms | █  23
   3 ms |   9
   4 ms |   1
   5 ms |   1
   6 ms |   11
   7 ms | ██████████  240
   8 ms | ████████████████████████████████████████  1008
   9 ms | ███████  168
  10 ms |   9
  13 ms | █  13
  14 ms | ██  40
  15 ms | ████  109
  16 ms | ████  109
  17 ms | ██  62
  18 ms | █  28
  19 ms | █  20
  20 ms | █  27
  21 ms | █  23
  22 ms |   8
  23 ms |   1
  24 ms |   1
  31 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `44.10`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `251.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `35.69`
- `entity_count_sample_end` = `251.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `110.44`
- `preload_duration_ms` = `42.00`
- `entities_spawned` = `250.00`
- `seed` = `6163.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `246.91`, min `37.66`, p50 `118.63`, p95 `1354.94`, p99 `1522.56`, 1%low `45.32`, 0.1%low `39.26`, std `380.88`

**Frame time (ms)**  avg `9.13`, p50 `8.43`, p95 `18.27`, p99 `21.06`, p99.9 `22.93`, max `26.55`

**Client tick (ms)**  avg `0.48`, p95 `0.59`, max `0.89`

**Memory**  start `611 MB`, end `607 MB`, peak `889 MB`, GC `4 events / 9 ms`

**FPS over sampling window (ASCII):**

```
355.1 | █                                           █                                  
338.4 | █       █                                   █        █                         
321.6 | █   █   █                                   █   █    █                █        
304.9 | █   █   █           █            █          █   █  █ █                █        
288.1 | █   █   █  ██   █   █  █      █ ██ █        █  ██  █ █     █   █      █        
271.4 | ██  █   █  ██   █   █  █ █    █ ██ █        █  ██  ███     █   █  █   █ █      
254.6 | ██  █████  ██ █ ██  █  █ █    ████ █  ██   ██  ██  ███    ██   █  █   █ █ █ █ █
237.9 |███  ██████ ██ █ ██  █  █ █    ████ █████   ██  ██ ████ █  ███  ██ █  ██ █ █ █ █
221.1 |███████████ ████ ██ █████ ██   ████ █████   ██  ██ ████ ██████  ██ ██ ██ █ █████
204.4 |███████████ █████████████ █████████ ██████ ████ ██ ████ ███████ ████████████████
187.7 |███████████ ███████████████████████ ██████████████ ████████████ ████████████████
170.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████  210
   1 ms | ██  65
   2 ms | █  19
   3 ms |   3
   4 ms |   1
   5 ms |   1
   6 ms |   2
   7 ms | █████████  245
   8 ms | ████████████████████████████████████████  1091
   9 ms | ████  116
  10 ms |   4
  12 ms |   1
  13 ms |   11
  14 ms | █  37
  15 ms | ███  91
  16 ms | ████  111
  17 ms | ██  67
  18 ms | █  37
  19 ms | █  16
  20 ms | █  39
  21 ms | █  18
  22 ms |   4
  24 ms |   1
  26 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `45.32`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `101.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `39.26`
- `entity_count_sample_end` = `101.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `109.56`
- `preload_duration_ms` = `37.00`
- `entities_spawned` = `100.00`
- `seed` = `6173.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23091 ms  |  Sample ticks: 400

**FPS**  avg `153.29`, min `19.42`, p50 `62.47`, p95 `1059.42`, p99 `1341.01`, 1%low `21.15`, 0.1%low `19.42`, std `286.08`

**Frame time (ms)**  avg `19.35`, p50 `16.01`, p95 `40.69`, p99 `45.91`, p99.9 `48.26`, max `51.50`

**Client tick (ms)**  avg `0.64`, p95 `0.94`, max `2.64`

**Memory**  start `869 MB`, end `682 MB`, peak `909 MB`, GC `4 events / 18 ms`

**FPS over sampling window (ASCII):**

```
368.4 |                                        █            █                          
337.6 |                                        █            █                          
306.7 |                                        ██  █        ██                   █     
275.9 |                                     ██████ █  █     ██  ██ █       █     ██    
245.1 |                                     ██████ ██ ██    ██ █████ █     █  █  ███   
214.3 |                                     ██████ ███████████ ████████████████  █████ 
183.5 |                                     ██████████████████ ████████████████ ███████
152.7 |                                     ███████████████████████████████████████████
121.9 |                                    ████████████████████████████████████████████
 91.1 |                                    ████████████████████████████████████████████
 60.3 |                                    ████████████████████████████████████████████
 29.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  59
   1 ms | ████  23
   2 ms | █  5
   4 ms |   2
   5 ms |   2
   6 ms |   3
   7 ms | ██████████  67
   8 ms | ████████████████████████████████████████  257
   9 ms | █████████  57
  10 ms |   2
  14 ms | ██  13
  15 ms | ████  27
  16 ms | █████  30
  17 ms | ██  15
  18 ms | █  9
  19 ms | ██  12
  20 ms | ████  24
  21 ms | ██  15
  22 ms | ██  12
  23 ms | █  6
  24 ms | █  7
  25 ms | ██  11
  26 ms | █  5
  27 ms | █  5
  28 ms | █  9
  29 ms | █  6
  30 ms | █  7
  31 ms | █  4
  32 ms | ███████████  73
  33 ms | ████████████  76
  34 ms | █████████████  86
  35 ms | █  6
  36 ms | █  9
  37 ms | ███  18
  38 ms | ██  10
  39 ms | █  8
  40 ms | █  6
  41 ms | █  8
  42 ms | ██  13
  43 ms | █  8
  44 ms | █  4
  45 ms | █  6
  46 ms | █  5
  47 ms |   3
  48 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.15`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `301.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.42`
- `entity_count_sample_end` = `301.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `51.67`
- `preload_duration_ms` = `59.00`
- `entities_spawned` = `300.00`
- `seed` = `6197.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `169.89`, min `27.36`, p50 `118.21`, p95 `641.06`, p99 `701.09`, 1%low `41.25`, 0.1%low `28.57`, std `170.34`

**Frame time (ms)**  avg `9.34`, p50 `8.46`, p95 `19.03`, p99 `21.62`, p99.9 `29.47`, max `36.55`

**Client tick (ms)**  avg `1.02`, p95 `1.23`, max `1.69`

**Memory**  start `603 MB`, end `490 MB`, peak `933 MB`, GC `9 events / 15 ms`

**FPS over sampling window (ASCII):**

```
204.5 |                                                                  █             
198.4 |      █ █                                     █                   █             
192.3 |      █ █          █    █   █         █ █     █         █  █      █             
186.2 |      █ █        █ █  █ █   █         █ █     █   █     █  █   ██ ██            
180.0 |      █ █    █   █ █  █ █   █   █   █ █ █ █  ██   █   █ █  █   ██ ██   █  █ █  █
173.9 |  █ █ █ █  █ █   █ █  █ ██  ██  █   █ ███ █  ██   █████ █  █ █ ██ ███  █  █ █  █
167.8 | ██ █ █ █  █ █   █ ██ █ ██  ███ ██  █████ █ ███ █ █████ █  █ █ ██ ████ █  █ █ ██
161.7 | ████████  █ █ █ █ ██ ████  ███████ ███████ ███ █ █████ █ ██ █ ██ ████ █  █ █ ██
155.5 |█████████  ██████████ ████ ██████████████████████ ██████████ ████ ████ ██ ███ ██
149.4 |█████████  █████████████████████████████████████████████████ ████ ████ █████████
143.3 |█████████ ██████████████████████████████████████████████████ ███████████████████
137.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ███████████  232
   2 ms | ██  46
   3 ms |   10
   5 ms |   3
   6 ms | █  22
   7 ms | █████████████  277
   8 ms | ████████████████████████████████████████  866
   9 ms | ███████████  228
  10 ms | █  13
  11 ms |   1
  12 ms |   6
  13 ms | █  21
  14 ms | ███  59
  15 ms | ████  87
  16 ms | ████  89
  17 ms | ██  37
  18 ms | ██  37
  19 ms | ██  38
  20 ms | ██  34
  21 ms | █  23
  22 ms |   6
  23 ms |   2
  25 ms |   1
  27 ms |   1
  29 ms |   1
  33 ms |   1
  36 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `41.25`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `28.57`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `107.11`
- `preload_duration_ms` = `50.00`
- `entities_spawned` = `500.00`
- `seed` = `6203.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `267.44`, min `32.43`, p50 `118.58`, p95 `1511.18`, p99 `1762.22`, 1%low `40.60`, 0.1%low `33.01`, std `429.21`

**Frame time (ms)**  avg `9.17`, p50 `8.43`, p95 `19.68`, p99 `23.23`, p99.9 `28.77`, max `30.83`

**Client tick (ms)**  avg `2.90`, p95 `3.49`, max `4.73`

**Memory**  start `742 MB`, end `663 MB`, peak `952 MB`, GC `8 events / 14 ms`

**FPS over sampling window (ASCII):**

```
381.4 |█                                                                               
362.4 |█                                             █                                 
343.5 |█     █     █                                 █                                 
324.6 |█     █     ██                 █  █           █   █   █    █ █       █       █  
305.7 |█     █   █ ██         █       █  █  █  █  █  █   █  ██    █ █       █ █  █  █ █
286.8 |██    █   █ ███        █   ██  ██ █  █ ██  █  █   █  ██    █ █       ███ ██  ███
267.9 |███ █ █   █ ████  █ █  █   ███ ██ █  ████  ██ █ ███ ████   ███    █  ███ ██  ███
248.9 |█████ ██ ██ ████  ████ █  █████████ ██████ ██ █ ███ ████   ████  ██  ███ ██ ████
230.0 |█████ ██ ███████  ████ ██ █████████████████████ ███████████████  ███ ███ ███████
211.1 |█████████████████ ████ ████████████████████████ ████████████████████████ ███████
192.2 |██████████████████████ █████████████████████████████████████████████████████████
173.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  222
   1 ms | ██  48
   2 ms | █  13
   3 ms |   11
   4 ms | ██  38
   5 ms | █████████  206
   6 ms |   8
   7 ms | █  12
   8 ms | ████████████████████████████████████████  950
   9 ms |   7
  10 ms | █  22
  11 ms | ████████  191
  12 ms | ██  53
  13 ms | █  35
  14 ms | ██  38
  15 ms | ██  55
  16 ms | ██  50
  17 ms | ██  44
  18 ms | ██  43
  19 ms | █  33
  20 ms | █  32
  21 ms | █  24
  22 ms | █  17
  23 ms | █  20
  24 ms |   5
  29 ms |   2
  30 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `fps_1pct_low` = `40.60`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `501.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `33.01`
- `entity_count_sample_end` = `501.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `109.00`
- `preload_duration_ms` = `58.00`
- `entities_spawned` = `500.00`
- `seed` = `6217.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `109.49`, min `16.04`, p50 `90.56`, p95 `433.49`, p99 `566.21`, 1%low `16.91`, 0.1%low `16.04`, std `113.30`

**Frame time (ms)**  avg `18.24`, p50 `11.04`, p95 `47.37`, p99 `56.03`, p99.9 `61.51`, max `62.35`

**Client tick (ms)**  avg `3.88`, p95 `5.42`, max `7.82`

**Memory**  start `597 MB`, end `673 MB`, peak `960 MB`, GC `14 events / 20 ms`

**FPS over sampling window (ASCII):**

```
195.2 |                           █                                                    
180.2 |               ██          █    ██                                              
165.3 |█ █  █ ███    ████ ███   █ █  █ ██  █       █     █  █                          
150.4 |█ █  █████ ███████████   ███  ████  █ ██  █ █    ██  █                          
135.4 |████████████████████████████  █████████████ ██ ████ ██                          
120.5 |████████████████████████████  ████████████████████████                          
105.6 |██████████████████████████████████████████████████████                          
 90.6 |██████████████████████████████████████████████████████                          
 75.7 |██████████████████████████████████████████████████████                          
 60.8 |██████████████████████████████████████████████████████                          
 45.8 |███████████████████████████████████████████████████████     █ █  ███   █    █  █
 30.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ████  31
   2 ms | █████  39
   3 ms | █  4
   4 ms | ███  20
   5 ms | ██████  46
   6 ms | ████  32
   7 ms | ███  23
   8 ms | ████████████████████████████████████████  298
   9 ms | ██  15
  10 ms | █████  37
  11 ms | █████  39
  12 ms | █  9
  13 ms | ██  12
  14 ms | ██  13
  15 ms | ███  20
  16 ms | ███  23
  17 ms | ██  18
  18 ms | ███  23
  19 ms | ███  23
  20 ms | ██  18
  21 ms | ██  12
  22 ms | ██  14
  23 ms |   3
  24 ms | █  9
  25 ms | █  10
  26 ms | █  6
  27 ms | █  8
  28 ms | ████  31
  29 ms | ██  13
  30 ms | █  10
  31 ms | █  10
  32 ms | ██  17
  33 ms | ██  14
  34 ms | █  6
  35 ms | █  9
  36 ms | ██  12
  37 ms | ███  25
  38 ms | ███  22
  39 ms | █  7
  40 ms | █  11
  41 ms | █  7
  42 ms | █  6
  43 ms | █  11
  44 ms | █  8
  45 ms | █  8
  46 ms | █  6
  47 ms | ██  12
  48 ms | █  8
  49 ms | █  8
  50 ms | █  6
  51 ms |   2
  52 ms |   2
  53 ms | █  4
  54 ms |   2
  55 ms |   2
  56 ms |   3
  57 ms |   2
  58 ms |   1
  59 ms |   2
  60 ms |   2
  61 ms |   1
  62 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `items_alive_p50` = `1240.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `items_alive_p95` = `1560.00`
- `seed` = `6287.00`
- `items_alive_avg` = `1230.00`
- `part` = `1.00`
- `entity_count_delta` = `880.00`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `16.04`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `54.82`
- `items_merged_estimate` = `0.00`
- `fps_1pct_low` = `16.91`
- `items_spawned` = `1560.00`
- `waves_spawned` = `12.00`
- `items_alive_max` = `1560.00`
- `entity_count_sample_start` = `681.00`
- `entity_count_sample_end` = `1561.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23106 ms  |  Sample ticks: 400

**FPS**  avg `31.51`, min `20.25`, p50 `29.91`, p95 `48.05`, p99 `51.97`, 1%low `20.72`, 0.1%low `20.25`, std `7.61`

**Frame time (ms)**  avg `33.40`, p50 `33.44`, p95 `45.93`, p99 `47.18`, p99.9 `48.77`, max `49.37`

**Client tick (ms)**  avg `0.96`, p95 `1.22`, max `2.01`

**Memory**  start `791 MB`, end `588 MB`, peak `961 MB`, GC `5 events / 13 ms`

**FPS over sampling window (ASCII):**

```
 35.4 |                                                             █                  
 34.8 |                                       █                     █           █      
 34.2 |         █                   █         █                     █           █   █  
 33.6 |  █  █   █     █             █   █     █      █              █           █   █  
 33.0 |  █  █   █     █             █   █     █      █   █ ██       █ █         █   █  
 32.5 | ██  ██  █ █   █  █   █   █ ██   █ █   █      █   █ ██       █ █     █   █   █  
 31.9 | ██  ██  █ █   █ ███  █   █ ██   █ ██  █ ██ █ █ █ █ ██   █   █ █     ██  █   █  
 31.3 | ██ ██████ █ █ █ ████ █ █ █ ████ █████ █ ████ █ █ █ ███  █ █ █ █ ██ ████ █   █  
 30.7 | ██ ██████ ███ ██████ ██████████ █████ █ ████████ █ ██████ █ ███████████ █   █ █
 30.1 | ██ █████████████████ ██████████ █████ ████████████ ████████ ███████████ ███ ███
 29.6 |████████████████████████████████ ██████████████████ ████████ ███████████ ███████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  1
  18 ms | ██  3
  19 ms | █████  9
  20 ms | ██████████  19
  21 ms | ████████████  22
  22 ms | ███████  14
  23 ms | ████████  15
  24 ms | ████  8
  25 ms | ████████  15
  26 ms | ██████  12
  27 ms | ██████  11
  28 ms | ██████  12
  29 ms | ████████  15
  30 ms | ███████████  21
  31 ms | ██████████  18
  32 ms | ███████████████████████████████████████  73
  33 ms | ███████████████████████████████████████  73
  34 ms | ████████████████████████████████████████  75
  35 ms | ████  8
  36 ms | ██████████  19
  37 ms | ██████  11
  38 ms | █████████  17
  39 ms | █████████  17
  40 ms | █████  10
  41 ms | ██████  12
  42 ms | █████  10
  43 ms | █████████  16
  44 ms | ██████  12
  45 ms | ███████████  21
  46 ms | ███████████  20
  47 ms | ███  6
  48 ms | ██  3
  49 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_0p1pct_low` = `20.25`
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
- `preload_duration_ms` = `95.00`
- `fps_1pct_low` = `20.72`
- `fps_harmonic_avg` = `29.94`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23129 ms  |  Sample ticks: 400

**FPS**  avg `30.91`, min `20.54`, p50 `29.90`, p95 `46.20`, p99 `49.95`, 1%low `21.04`, 0.1%low `20.54`, std `6.11`

**Frame time (ms)**  avg `33.42`, p50 `33.44`, p95 `43.95`, p99 `46.80`, p99.9 `48.25`, max `48.68`

**Client tick (ms)**  avg `0.47`, p95 `0.62`, max `0.85`

**Memory**  start `858 MB`, end `778 MB`, peak `950 MB`, GC `2 events / 11 ms`

**FPS over sampling window (ASCII):**

```
 34.3 |                                                   █                            
 33.8 |                                                   █    █                       
 33.2 |                                                   █    █                       
 32.7 |         █       █     █                           █    █   █     █           █ 
 32.1 |         █ █     █ █   █             ██            █    █   █     █           █ 
 31.6 |         ███  █  █ █   █ █   ██  █ █ ██  █ █   █   █ █  █   █ █   █  █  █     █ 
 31.0 |         ████ █  █ ███ █ █  ███ ██ █ ███ █ █   █ █ █ █  ██ ██ █   ██ █  █ █   █ 
 30.5 |███ ████ ████ ████ ████████ ███ ████ ███ █ ███ █ █ ████ ██ ██ ██  ██ █ ██████ █ 
 29.9 |████████ █████████████████████████████████████████ ██████████████████████████ ██
 29.4 |████████ █████████████████████████████████████████ █████████████████████████████
 28.8 |██████████████████████████████████████████████████ █████████████████████████████
 28.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  18 ms |   2
  19 ms | █  3
  20 ms | ███  13
  21 ms | ████  17
  22 ms | ██  8
  23 ms | ██  7
  24 ms | █  6
  25 ms | ██  8
  26 ms | ███  13
  27 ms | ██  9
  28 ms | ███  11
  29 ms | ██  7
  30 ms | ███  11
  31 ms | ████  19
  32 ms | ██████████████████  80
  33 ms | ████████████████████████████████████████  174
  34 ms | █████████████  58
  35 ms | ██████  24
  36 ms | ███  13
  37 ms | ████  16
  38 ms | ████  19
  39 ms | ███  11
  40 ms | ███  12
  41 ms | ██  10
  42 ms | ██  7
  43 ms | ██  10
  44 ms | █  6
  45 ms | ███  11
  46 ms | ██  10
  47 ms |   2
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_0p1pct_low` = `20.54`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `26.00`
- `fps_harmonic_avg` = `29.92`
- `villagers_spawned` = `80.00`
- `neighbour_updates` = `0.00`
- `fps_1pct_low` = `21.04`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `81.00`
- `entity_count_sample_end` = `81.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `35.04`, min `15.92`, p50 `29.88`, p95 `59.40`, p99 `120.80`, 1%low `16.87`, 0.1%low `15.92`, std `22.35`

**Frame time (ms)**  avg `33.39`, p50 `33.46`, p95 `50.19`, p99 `56.46`, p99.9 `61.08`, max `62.83`

**Client tick (ms)**  avg `3.16`, p95 `4.83`, max `6.81`

**Memory**  start `794 MB`, end `784 MB`, peak `957 MB`, GC `5 events / 15 ms`

**FPS over sampling window (ASCII):**

```
 65.3 |     █  █                                                                       
 62.0 |     █  █    █                                                                  
 58.6 |     █  █    █                                                                  
 55.3 |     █  █    █                                                                  
 51.9 |     █  █    █                                                                  
 48.5 |     █  █    █                                                                  
 45.2 |     █ ██ █  █                                  █                               
 41.8 |█    █ ██ █ ██     █                            █     █      █                  
 38.5 |██   ████ █ ██ █  ██ █   █            █    █    █ █   █    █ █             █    
 35.1 |███  ████ █ ██ ██ ██ █   █        █   ██   █    ████  ███ █████            █ █  
 31.8 |█████████ ████████████████████ ██████████ ███████████████████████ ████████ █ ██ 
 28.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  2
   5 ms | █  1
   6 ms | █  2
   8 ms | ██  3
   9 ms | ███  4
  10 ms | ████  6
  11 ms | █  1
  13 ms | █  1
  15 ms | █████  7
  16 ms | ███  5
  17 ms | █████  8
  18 ms | ██████  9
  19 ms | ████████  12
  20 ms | █████████  14
  21 ms | ████████████  18
  22 ms | ██████████  15
  23 ms | █████  8
  24 ms | █████████  13
  25 ms | ███████  10
  26 ms | ███████  10
  27 ms | ████████  12
  28 ms | ███████  11
  29 ms | ██████████████████  27
  30 ms | ██████████████████████████  39
  31 ms | █████████████████  26
  32 ms | ██████████  16
  33 ms | ████████████████████  31
  34 ms | █████████  13
  35 ms | ██████████████████  28
  36 ms | ████████████████████████████████████████  61
  37 ms | █████████████  20
  38 ms | ███████████  17
  39 ms | ███  4
  40 ms | ████  6
  41 ms | ██████  9
  42 ms | ███████████  17
  43 ms | ████████  12
  44 ms | ███████  10
  45 ms | ██████████  16
  46 ms | █████  8
  47 ms | ███████████  17
  48 ms | ███████  11
  49 ms | █████  7
  50 ms | ███  4
  51 ms | ██  3
  52 ms | ████  6
  53 ms | ████  6
  54 ms | █  1
  55 ms | ██  3
  56 ms | ███  4
  57 ms | █  1
  59 ms | ██  3
  62 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `fps_1pct_low` = `16.87`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `205.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-187.00`
- `tnt_active_avg` = `36.51`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `403.00`
- `entity_count_sample_start` = `188.00`
- `tnt_active_p50` = `25.00`
- `seed` = `3539.00`
- `fps_0p1pct_low` = `15.92`
- `preset_long` = `0.00`
- `preload_duration_ms` = `132.00`
- `tnt_spawned` = `430.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `33.51`, min `16.24`, p50 `29.80`, p95 `52.27`, p99 `109.35`, 1%low `16.89`, 0.1%low `16.24`, std `17.58`

**Frame time (ms)**  avg `33.38`, p50 `33.55`, p95 `48.02`, p99 `56.87`, p99.9 `61.14`, max `61.57`

**Client tick (ms)**  avg `2.76`, p95 `4.42`, max `8.13`

**Memory**  start `659 MB`, end `975 MB`, peak `1022 MB`, GC `4 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 67.0 |     █                                                                          
 63.6 |     █                                                                          
 60.2 |     █                                                                          
 56.7 |     █                                                                          
 53.3 |     █                                                                          
 49.8 |     █                                                                          
 46.4 |     █       █                        █       █          █                      
 43.0 |     █       █                        █       █     █ █  █                      
 39.5 |     █       █     █                  █       ██    █ █  █  █                   
 36.1 | ██  ████  █ █     █   █   █          █       ██    █ █  █ ██                   
 32.6 |████ ████  █ █ █████ ███ █ █ █ █ ██ ███████ █ ██    █ ████ █████ ███ ██ █ ██ ███
 29.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █  1
   7 ms | ███  3
   8 ms | ██  2
   9 ms | ██  2
  12 ms | █  1
  13 ms | ███  4
  14 ms | ██  2
  15 ms | █  1
  16 ms | █  1
  17 ms | ████  5
  18 ms | ██████  7
  19 ms | █████████████  15
  20 ms | ████████████  14
  21 ms | █████████████  16
  22 ms | ████████████████  19
  23 ms | ████████  9
  24 ms | ████████████████  19
  25 ms | ███  4
  26 ms | ███████████  13
  27 ms | ████████  9
  28 ms | █████████████  15
  29 ms | ████████████████  19
  30 ms | ████████████████████████████  34
  31 ms | ███████████████████████████████  37
  32 ms | ██████████████████████  26
  33 ms | ███████████████████████████████  37
  34 ms | ███████████████████████  27
  35 ms | ████████████████████████████████████████  48
  36 ms | ██████████████████████████  31
  37 ms | █████████████████  20
  38 ms | ██████████  12
  39 ms | █████████  11
  40 ms | ███████████  13
  41 ms | █████████████  15
  42 ms | ██████████████  17
  43 ms | ███████████  13
  44 ms | ██████████  12
  45 ms | ███████████  13
  46 ms | ███████  8
  47 ms | ███████████  13
  48 ms | ████████  10
  49 ms | ████  5
  50 ms | █  1
  51 ms | ██  2
  53 ms | ██  2
  54 ms | ██  2
  56 ms | ███  3
  57 ms | ██  2
  58 ms | █  1
  60 ms | ██  2
  61 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.96`
- `fps_1pct_low` = `16.89`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `200.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.60`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `398.00`
- `entity_count_sample_start` = `189.00`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `16.24`
- `preset_long` = `0.00`
- `preload_duration_ms` = `80.00`
- `tnt_spawned` = `430.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `44.29`, min `12.02`, p50 `29.93`, p95 `151.49`, p99 `205.39`, 1%low `12.94`, 0.1%low `12.02`, std `41.16`

**Frame time (ms)**  avg `34.27`, p50 `33.42`, p95 `62.75`, p99 `73.39`, p99.9 `80.71`, max `83.18`

**Client tick (ms)**  avg `16.02`, p95 `22.32`, max `27.85`

**Memory**  start `469 MB`, end `906 MB`, peak `1086 MB`, GC `29 events / 105 ms`

**FPS over sampling window (ASCII):**

```
 82.1 |  █                                                                             
 77.3 |  █                                                                             
 72.4 |  █             █             █    █                                            
 67.6 |  █             █             █    █                                            
 62.8 |  █             █   █         █   ██           █             █  █               
 57.9 | ██             █   █         █   ██      █    █             █  █               
 53.1 | ██      █    █ █   █  █  ██  █   ███     █    █   █  █      █  █   █      █    
 48.3 | ██  █  ██ █  ███   █  █  ██  █ █ ███   █ █    ██ ██ ██     ██  █   █  █   █ █  
 43.4 | ██  █  █████████  ██  █  ██  █ █████ █ █ █ █  ██ ██ ██  █  ██ ███  █  █   █ █  
 38.6 | ████████████████  ██ ███ ██ ████████ █ █ █ ██ ████████  ██ ██ ███  ██ █ █ █ █ █
 33.8 |██████████████████ █████████████████████████████████████ █████████████ █████ █ █
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | █████  3
   4 ms | ████████  5
   5 ms | ██████████████████████████  16
   6 ms | █████████████  8
   7 ms | █████████████  8
   8 ms | ██████  4
   9 ms | ██  1
  10 ms | ████████  5
  11 ms | █████████████  8
  12 ms | ██████████████████████  14
  13 ms | ██████████  6
  14 ms | ██  1
  15 ms | █████  3
  16 ms | ██████████████████████  14
  17 ms | ███████████████████████████████████  22
  18 ms | ███████████████████████████  17
  19 ms | ███████████  7
  20 ms | ███████████  7
  21 ms | ███████████████████  12
  22 ms | █████████████  8
  23 ms | ████████  5
  24 ms | ███████████  7
  25 ms | ██████████████████  11
  26 ms | ██████████████████████████████████  21
  27 ms | ██████████████████████  14
  28 ms | █████████████████████  13
  29 ms | ██████████████████  11
  30 ms | █████████████  8
  31 ms | █████████████  8
  32 ms | ███████████████████  12
  33 ms | ████████████████████████████████████████  25
  34 ms | █████████████████████  13
  35 ms | ██████████████  9
  36 ms | ███████████  7
  37 ms | ██████████████████  11
  38 ms | ██████████████████  11
  39 ms | ████████████████  10
  40 ms | ███████████████████  12
  41 ms | ██████████████  9
  42 ms | ████████  5
  43 ms | ████████████████████████  15
  44 ms | ██████████████  9
  45 ms | ██████████████  9
  46 ms | ██████████████████  11
  47 ms | ████████████████  10
  48 ms | ███████████  7
  49 ms | ████████████████████████████████  20
  50 ms | ████████████████  10
  51 ms | ███████████  7
  52 ms | ███████████  7
  53 ms | █████████████████████  13
  54 ms | █████████████  8
  55 ms | ████████  5
  56 ms | ████████  5
  57 ms | ████████  5
  58 ms | ████████  5
  59 ms | ██████  4
  60 ms | █████  3
  61 ms | ██████  4
  62 ms | ██████████████  9
  63 ms | ███  2
  64 ms | █████  3
  65 ms | █████  3
  66 ms | ██  1
  67 ms | █████  3
  69 ms | ███  2
  70 ms | █████  3
  71 ms | ██  1
  73 ms | █████  3
  74 ms | ██  1
  75 ms | ██  1
  77 ms | ██  1
  78 ms | ██  1
  83 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.94`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `97.00`
- `falling_blocks_landed` = `23844.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.18`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `12.02`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4811.72`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23088 ms  |  Sample ticks: 400

**FPS**  avg `43.42`, min `13.12`, p50 `29.37`, p95 `127.91`, p99 `184.16`, 1%low `13.78`, 0.1%low `13.12`, std `40.97`

**Frame time (ms)**  avg `34.37`, p50 `34.05`, p95 `59.77`, p99 `69.45`, p99.9 `75.56`, max `76.22`

**Client tick (ms)**  avg `16.65`, p95 `22.83`, max `32.53`

**Memory**  start `815 MB`, end `441 MB`, peak `1106 MB`, GC `29 events / 107 ms`

**FPS over sampling window (ASCII):**

```
114.1 |   █                                                                            
106.4 |   █                                                                            
 98.7 |   █                                                                            
 90.9 |   █                                                                            
 83.2 |   █                                                                            
 75.4 |   █                                                                            
 67.7 |   █      █                                                █     █              
 59.9 | █ ██     █                                         █      █     █              
 52.2 | █ ██     █     █  █ █       █ █      █  ██   █     ██  █  ██ ██ █ █            
 44.5 | █ ███ █  █ ██  ████ █  ██ █████   ██ ██████  ███ █ ███ ██ ██ ████ ███ █        
 36.7 |██ ████████████ ███████ ██ █████ ████ ███████ ███ █ █████████ ██████████ █████ █
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms | ██  1
   3 ms | ██  1
   4 ms | ████  2
   5 ms | █████████████  7
   6 ms | █████████████  7
   7 ms | █████████████████████████  14
   8 ms | █████████████████████████████  16
   9 ms | ███████████  6
  10 ms | █████████  5
  11 ms | ████████████████  9
  12 ms | █████████  5
  13 ms | ███████████  6
  14 ms | █████████  5
  15 ms | █████████████  7
  16 ms | ████████████████  9
  17 ms | ████████████████████  11
  18 ms | ████████████████████  11
  19 ms | ████████████████  9
  20 ms | ███████  4
  21 ms | █████████████████████████  14
  22 ms | ████████████████  9
  23 ms | ██████████████████  10
  24 ms | ████████████████████████  13
  25 ms | ████████████████████  11
  26 ms | █████████████  7
  27 ms | █████████████  7
  28 ms | █████████████████████████████████  18
  29 ms | ██████████████████████  12
  30 ms | ████████████████████████████████████  20
  31 ms | █████████████  7
  32 ms | ████████████████  9
  33 ms | █████████████████████████████████  18
  34 ms | █████████████  7
  35 ms | ███████████████  8
  36 ms | ██████████████████  10
  37 ms | ████████████████  9
  38 ms | ███████████████████████████  15
  39 ms | ███████████████  8
  40 ms | ████████████████████████  13
  41 ms | ██████████████████████  12
  42 ms | ████████████████████████  13
  43 ms | ████████████████████  11
  44 ms | ███████████████████████████████  17
  45 ms | █████████████████████████████  16
  46 ms | █████  3
  47 ms | ███████████████  8
  48 ms | ████████████████  9
  49 ms | ████████████████████████████████████  20
  50 ms | ████████████████████████████████████████  22
  51 ms | ████████████████  9
  52 ms | █████████  5
  53 ms | ███████████████  8
  54 ms | ███████  4
  55 ms | ██████████████████  10
  56 ms | █████████  5
  57 ms | █████████████  7
  58 ms | █████████████  7
  59 ms | █████████████  7
  60 ms | ███████████  6
  61 ms | ███████  4
  62 ms | ████  2
  63 ms | ████  2
  64 ms | ██  1
  65 ms | ██  1
  66 ms | █████  3
  67 ms | ██  1
  68 ms | ██  1
  69 ms | ████  2
  70 ms | ██  1
  71 ms | ██  1
  72 ms | ██  1
  75 ms | ██  1
  76 ms | ██  1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `13.78`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `63.00`
- `falling_blocks_landed` = `26609.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.09`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `13.12`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4817.72`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `31.24`, min `19.83`, p50 `29.71`, p95 `48.20`, p99 `54.58`, 1%low `20.64`, 0.1%low `19.83`, std `7.23`

**Frame time (ms)**  avg `33.43`, p50 `33.66`, p95 `45.13`, p99 `47.34`, p99.9 `49.28`, max `50.44`

**Client tick (ms)**  avg `1.90`, p95 `2.67`, max `3.70`

**Memory**  start `876 MB`, end `1095 MB`, peak `1124 MB`, GC `2 events / 10 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |           █  █                                                                 
 33.5 |           █  █                               █            █                    
 33.1 |       █   █  █ █     █   █                   █            █    █               
 32.6 |       █   █  █ █     █   ██          █       █            █    █               
 32.1 |       ███ █ ██ █    ██  ███     █    █     █ █ ██        ██ █  █  █  █         
 31.7 |  █   ████ █ ██ █    ██ ████   █ █ █  ███   █ █ ██     ██ ██ ██ █  ██ █  █ █    
 31.2 |  █   ████ ████ █ █  ██ ████ █ █ █ █  ███ █ █ █ ██  █ ███ ██ ██ █  ██ ██ █ █    
 30.7 | ██  █████ ████ █ █ ███ ████ ███ █ █ ████ █ █ █ ██  █ ███ ██ ██ ██ ███████ ███ █
 30.3 | ███ █████ ████████ ███ ███████████████████ ██████  █ ███ ██ ██ ██ ███████ ███ █
 29.8 |████ █████ ███████████████████████████████████████████████████████ █████████████
 29.4 |██████████ ███████████████████████████████████████████████████████ █████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms | █  2
  17 ms | █  2
  18 ms | ████  8
  19 ms | █████  12
  20 ms | █████  11
  21 ms | █████  12
  22 ms | ████  8
  23 ms | ████  10
  24 ms | ███  7
  25 ms | █████  11
  26 ms | ██  5
  27 ms | ████  10
  28 ms | ███  6
  29 ms | ███  6
  30 ms | ███████████████  33
  31 ms | ███████████████████████████  60
  32 ms | ████████████████  36
  33 ms | ███████████████████████████████████████  86
  34 ms | ██████████████████  39
  35 ms | ████████████████████████████████████████  89
  36 ms | █████████████  29
  37 ms | ██████  13
  38 ms | ███████  15
  39 ms | ████  9
  40 ms | ████  8
  41 ms | ██  4
  42 ms | ██████  13
  43 ms | █████  12
  44 ms | █████  11
  45 ms | █████  11
  46 ms | █████  12
  47 ms | ██  4
  48 ms | █  3
  50 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `20.64`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `32.00`
- `falling_blocks_landed` = `3675.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.92`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `19.83`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `618.99`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23090 ms  |  Sample ticks: 400

**FPS**  avg `31.27`, min `20.21`, p50 `29.77`, p95 `48.52`, p99 `53.03`, 1%low `20.64`, 0.1%low `20.21`, std `7.14`

**Frame time (ms)**  avg `33.40`, p50 `33.59`, p95 `45.05`, p99 `47.88`, p99.9 `48.90`, max `49.49`

**Client tick (ms)**  avg `1.90`, p95 `2.73`, max `4.70`

**Memory**  start `734 MB`, end `1007 MB`, peak `1110 MB`, GC `2 events / 4 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |                                                █                               
 33.5 |                                       █        █                               
 33.0 |         █ █                    █      █        █  █        █                   
 32.5 |       █ █ █  █  █              █      █        █ ██  █ █  ██                █  
 32.0 | █     █ █ █  █ ██     █        █      █     █  █ ██  █ █  ██  █   █ █       █ █
 31.6 | █   █ █ █ █  █ ███  ███    █   ███    ██    █ ██ ███ █ █  ██  █ ██████      █ █
 31.1 | ██ ████████  █ ███  ████   █   ███    ██    █ ██ ███ ███  ██ █████████      █ █
 30.6 | ██ ████████ ██████ ██████ ██ ████████ ███ █ █ ██████ ████ ███████████████████ █
 30.1 | ███████████ █████████████████████████████████ █████████████████████████████████
 29.6 | █████████████████████████████████████████████ █████████████████████████████████
 29.1 |██████████████████████████████████████████████ █████████████████████████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  2
  18 ms | ███  6
  19 ms | ██████  13
  20 ms | ███████  14
  21 ms | ██  5
  22 ms | █████████  18
  23 ms | █████  11
  24 ms | ███  7
  25 ms | ██████  12
  26 ms | ████  8
  27 ms | ███  7
  28 ms | ████  9
  29 ms | ███  6
  30 ms | ████████████  25
  31 ms | ███████████████████████████████████  72
  32 ms | ████████████████  34
  33 ms | ███████████████████████████████████████  80
  34 ms | ████████████████  33
  35 ms | ████████████████████████████████████████  83
  36 ms | ███████████  22
  37 ms | ████████  17
  38 ms | ████████  17
  39 ms | ███████  15
  40 ms | █████  10
  41 ms | █████  11
  42 ms | ██████  13
  43 ms | █████  11
  44 ms | ███  6
  45 ms | █████  10
  46 ms | █████  10
  47 ms | ███  6
  48 ms | ██  4
  49 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `20.64`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `70.00`
- `falling_blocks_landed` = `3561.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `20.21`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.39`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `31.22`, min `20.87`, p50 `29.77`, p95 `48.29`, p99 `51.33`, 1%low `21.04`, 0.1%low `20.87`, std `7.02`

**Frame time (ms)**  avg `33.40`, p50 `33.59`, p95 `44.28`, p99 `46.95`, p99.9 `47.75`, max `47.92`

**Client tick (ms)**  avg `0.69`, p95 `0.95`, max `1.28`

**Memory**  start `513 MB`, end `1013 MB`, peak `1013 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.6 |                                                   █    █     █                 
 33.1 |                      █       █         █      █   █    █     █  █              
 32.7 |                  █   █       █ █       █      █   █    █ █   █  █              
 32.2 |                  █   █       █ █  █ █  █      █  ███   █ █   ██ █  █   █       
 31.7 |    █             █   █    █  █ █  ███  █      █  ███   █ █   ██ █  ██ ███  █   
 31.3 |   ██    █    ███ ██  █ █████ █ █ ████  █      █ ████ █ █ █ █ ██ ██ ██ ███ ███  
 30.8 |   █████ ██ █ ███████ █ █████ █ ███████ █ █ ██ ████████ ███ █ ██ ██ ██ ████████ 
 30.4 |   ████████████████████ ███████ ███████ █ █ ███████████████ █ ██ █████ ████████ 
 29.9 |███████████████████████████████ ███████████████████████████ ████ █████ █████████
 29.4 |███████████████████████████████ ███████████████████████████ ████████████████████
 29.0 |███████████████████████████████ ████████████████████████████████████████████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms | ██████  17
  20 ms | ██████  18
  21 ms | ████  13
  22 ms | ████  11
  23 ms | ███  8
  24 ms | ███  9
  25 ms | █████  16
  26 ms | █  4
  27 ms | ██  6
  28 ms | ████  12
  29 ms | ████  11
  30 ms | ██  6
  31 ms | ███  10
  32 ms | ████████████████████████████  86
  33 ms | ████████████████████████████████████████  121
  34 ms | ██████████████████████████  79
  35 ms | █████  16
  36 ms | ██████  18
  37 ms | ██████  19
  38 ms | ██████  18
  39 ms | ████  11
  40 ms | █████  16
  41 ms | ████  12
  42 ms | ████  12
  43 ms | ████  12
  44 ms | ███  9
  45 ms | ███  9
  46 ms | ████  12
  47 ms | ██  6
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `part` = `1.00`
- `max_in_flight_observed` = `250.00`
- `fps_0p1pct_low` = `20.87`
- `seed` = `5099.00`
- `preload_duration_ms` = `48.00`
- `entity_count_sample_end` = `251.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `173.00`
- `entity_count_sample_start` = `78.00`
- `waves_spawned` = `40.00`
- `block_state_changes` = `0.00`
- `projectiles_swept` = `270.00`
- `fps_1pct_low` = `21.04`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `projectiles_spawned` = `1000.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `30.87`, min `21.20`, p50 `29.86`, p95 `45.26`, p99 `49.79`, 1%low `21.40`, 0.1%low `21.20`, std `5.86`

**Frame time (ms)**  avg `33.38`, p50 `33.49`, p95 `42.92`, p99 `46.25`, p99.9 `47.02`, max `47.16`

**Client tick (ms)**  avg `0.28`, p95 `0.33`, max `0.48`

**Memory**  start `601 MB`, end `757 MB`, peak `757 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |                                                   █                            
 32.7 |                                                   █                            
 32.3 |█    █  █          █                               █     █                      
 31.9 |█    █  █      █  ██                               █     █   ██      █      █   
 31.6 |█  █ ██ █ █    █  ██    █    █  █  █      █  █     █  █  █ █ ██      █      ██  
 31.2 |█  █ ██ █ ██ █ █  ████ ██   ███ ████      █  █ █   █  ██ █ █ ██    █ █ █ █  ██  
 30.8 |█  █ ██ █ ██ █ ██ ███████ █████ ████ █ █  ██ █ █ █ █ ███ █ ████ █ ██ █ █ █  ███ 
 30.4 |██ █ ██ █ ██ █ █████████████████████ ████ ██ █████ █ ███ █ ████ █ ██ █ █ ██ ███ 
 30.0 |████ ██ ████ █ ███████████████████████████████████ █ ███ █ ████████████████ ███ 
 29.6 |████ ██ ██████████████████████████████████████████ █████ █ ████████████████ ███ 
 29.3 |████████████████████████████████████████████████████████ ██████████████████ ████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  6
  20 ms | ██  15
  21 ms | █  8
  22 ms | █  6
  23 ms | █  9
  24 ms | ██  16
  25 ms | █  7
  26 ms | ██  15
  27 ms | █  7
  28 ms | █  6
  29 ms | ██  13
  30 ms | █  9
  31 ms | ██  13
  32 ms | ██████  39
  33 ms | ████████████████████████████████████████  261
  34 ms | ███  22
  35 ms | ███  21
  36 ms | ██  16
  37 ms | ██  15
  38 ms | ██  10
  39 ms | ██  16
  40 ms | ██  14
  41 ms | ██  13
  42 ms | ██  13
  43 ms | █  5
  44 ms | █  7
  45 ms | █  8
  46 ms | █  8
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `21.40`
- `fps_harmonic_avg` = `29.95`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `21.20`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `41.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23108 ms  |  Sample ticks: 400

**FPS**  avg `30.71`, min `21.04`, p50 `29.91`, p95 `42.56`, p99 `49.07`, 1%low `21.32`, 0.1%low `21.04`, std `5.34`

**Frame time (ms)**  avg `33.40`, p50 `33.44`, p95 `42.62`, p99 `46.16`, p99.9 `47.50`, max `47.53`

**Client tick (ms)**  avg `0.24`, p95 `0.32`, max `0.42`

**Memory**  start `623 MB`, end `815 MB`, peak `1131 MB`, GC `3 events / 9 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                         █                                       █              
 32.6 |                         █                          █            █       █      
 32.2 |     █                   █              █  █        █        █   █ █ █ █ █      
 31.8 |  █  █          █      █ █ █     █ █    █  █        █       ██   █ █ █ █ █   █ █
 31.4 |  ██ █   █ █    █  █   █ █ █     █ █  █ █  █        █       ██   █ ███ █ █   █ █
 31.0 |  ██ █   █ █    ██ █   █ █ █     █ █  █ █  █   █ █  █  █ █  ██   █ ███ █ █  ██ █
 30.6 |█ ██ █   █ ████ ████ █ █ █ █ ██  █ █  █ █ ████ █ ██ █ ██ █  ███  █ ███ █ █  ██ █
 30.2 |████ ██  █ ███████████ █ █ █ ██ ██ ████ █ ████ ████ ████ ██ ████ █ ███ █ █  ██ █
 29.8 |████ █████ █████████████ ██████████████ █ ██████████████ ██ ████ █ ███ ████ ████
 29.4 |████ █████ █████████████ ██████████████ ███████████████████ ██████ █████████████
 29.0 |████ ███████████████████ ██████████████████████████████████ ████████████████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   3
  19 ms |   2
  20 ms | █  6
  21 ms | █  8
  22 ms | █  7
  23 ms | ██  10
  24 ms | █  9
  25 ms | ██  11
  26 ms | ██  14
  27 ms | █  9
  28 ms | █  7
  29 ms | █  9
  30 ms | ██  14
  31 ms | ███  20
  32 ms | ██████████  58
  33 ms | ████████████████████████████████████████  244
  34 ms | ████  26
  35 ms | ████  23
  36 ms | ████  22
  37 ms | █  9
  38 ms | ██  13
  39 ms | ██  15
  40 ms | █  9
  41 ms | ██  11
  42 ms | ██  11
  43 ms | █  6
  44 ms | █  9
  45 ms | █  6
  46 ms | █  4
  47 ms |   3
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pulses_issued` = `45.00`
- `preload_chunks` = `81.00`
- `scheduled_block_ticks` = `2240.00`
- `neighbour_updates` = `0.00`
- `block_state_changes` = `0.00`
- `dust_placed` = `464.00`
- `repeaters_placed` = `48.00`
- `preset_quick` = `1.00`
- `seed` = `4019.00`
- `fps_0p1pct_low` = `21.04`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `29.94`
- `preload_duration_ms` = `0.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `21.32`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `1.00`
- `lamps_placed` = `128.00`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `31.13`, min `20.52`, p50 `29.78`, p95 `47.82`, p99 `51.21`, 1%low `20.94`, 0.1%low `20.52`, std `6.77`

**Frame time (ms)**  avg `33.40`, p50 `33.58`, p95 `44.33`, p99 `46.80`, p99.9 `48.29`, max `48.73`

**Client tick (ms)**  avg `0.30`, p95 `0.42`, max `0.59`

**Memory**  start `766 MB`, end `677 MB`, peak `1138 MB`, GC `1 events / 6 ms`

**FPS over sampling window (ASCII):**

```
 33.9 |                                  █     █                                       
 33.4 |                                  █  █  █                           █ █         
 32.9 |  █                               █  █  ██                      █   █ █         
 32.5 |  ██               █              █  █  ███ █           █  █    █   █ █  █      
 32.0 |█ ██               █              ██ █  ███ ██ █ █ █ █  █  █    █   █ █  █ █    
 31.5 |█ ██      ██  █  █ █     ██  █  █ ██ █  ███ ██ █ ███ █  █  █    █   █ █  █ █   █
 31.0 |█ ██  ██ ████ █ ██ █ ██  ██  █  █ ██ ██ ██████ ████████ █  █   ███  █ █  █ ██  █
 30.6 |█ ██  ██ ██████ ██ █ ███████ █  █ ██ ██ ██████ ██████████  ██ █████ █ █  █ ███ █
 30.1 |█████████████████████████████████ ██ ██ █████████████████████████████ ████ █████
 29.6 |█████████████████████████████████ ██ ██ █████████████████████████████ ██████████
 29.1 |█████████████████████████████████ █████ █████████████████████████████ ██████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  18 ms | █  3
  19 ms | ██  10
  20 ms | ████  20
  21 ms | ███  12
  22 ms | ██  7
  23 ms | ██  9
  24 ms | █  6
  25 ms | ███  12
  26 ms | ██  8
  27 ms | ██  9
  28 ms | ██  8
  29 ms | █  6
  30 ms | ███  12
  31 ms | ███████  30
  32 ms | ███████████  50
  33 ms | ████████████████████████████████████████  180
  34 ms | ███████████████  67
  35 ms | ███  12
  36 ms | ████  19
  37 ms | ██  11
  38 ms | ██  11
  39 ms | ██  7
  40 ms | ███  15
  41 ms | ███  15
  42 ms | ███  13
  43 ms | ██  10
  44 ms | ██  9
  45 ms | ███  14
  46 ms | ██  7
  47 ms | █  5
  48 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `29.94`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `20.52`
- `seed` = `4027.00`
- `preload_duration_ms` = `80.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`
- `fps_1pct_low` = `20.94`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23112 ms  |  Sample ticks: 400

**FPS**  avg `31.03`, min `20.95`, p50 `29.89`, p95 `46.63`, p99 `50.92`, 1%low `21.10`, 0.1%low `20.95`, std `6.42`

**Frame time (ms)**  avg `33.40`, p50 `33.46`, p95 `44.66`, p99 `46.90`, p99.9 `47.67`, max `47.73`

**Client tick (ms)**  avg `0.28`, p95 `0.37`, max `0.87`

**Memory**  start `918 MB`, end `1102 MB`, peak `1102 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |     █                 █     █                                                  
 32.7 |  █  █ █               █     █           █        █             █ █             
 32.3 |  █  █ █            █  █ █   █  █ ██     █        █       █     █ █        █    
 31.9 |█ █  █ █        █   ██ █ █   █  █ ██     █   █    █    █  █     █ ██       █ ██ 
 31.5 |█ ██ █ █    █   █   ██ █ █   █  █ ██ █ █ █   █ █  █    █ ████   █ ██  ██   ████ 
 31.1 |█ ██ █ █  █ █   █   ██ █ █   █  █ ██ █ ████  █ █  █ ██ █ ████   █ ██  ███ ██████
 30.8 |█ ██ █ ██ ████ ██   ██ █ █   █  ████ █ ████  █ █  █ ██ █ ████ ███ ███ ██████████
 30.4 |█ ██ █ ███████ ██ ████ █ █ █ █  ████ █ █████ ███  █ ████ ████████ ███ ██████████
 30.0 |█ ██ ███████████████████████ █  ████ █ █████ ███  █ ████████████████████████████
 29.6 |████ █████████████████████████████████ █████ ██████ ████████████████████████████
 29.2 |████ ███████████████████████████████████████ ███████████████████████████████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   3
  19 ms | █  10
  20 ms | ██  14
  21 ms | █  10
  22 ms | █  9
  23 ms | █  8
  24 ms | █  10
  25 ms | █  9
  26 ms | ██  16
  27 ms | █  9
  28 ms | █  8
  29 ms | █  8
  30 ms | █  9
  31 ms | █  6
  32 ms | █████  36
  33 ms | ████████████████████████████████████████  270
  34 ms | ████  24
  35 ms | ██  12
  36 ms | ██  11
  37 ms | ██  13
  38 ms | ██  12
  39 ms | █  10
  40 ms | ███  18
  41 ms | █  9
  42 ms | █  6
  43 ms | █  7
  44 ms | ██  16
  45 ms | █  10
  46 ms | ██  11
  47 ms | █  5
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
- `fps_harmonic_avg` = `29.94`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `21.10`
- `fps_0p1pct_low` = `20.95`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `34.00`
- `preset_long` = `0.00`
- `log_blocks` = `320.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `31.89`, min `16.11`, p50 `29.74`, p95 `49.13`, p99 `54.09`, 1%low `18.93`, 0.1%low `16.11`, std `11.37`

**Frame time (ms)**  avg `33.49`, p50 `33.63`, p95 `46.56`, p99 `49.70`, p99.9 `56.44`, max `62.08`

**Client tick (ms)**  avg `0.37`, p95 `0.58`, max `8.27`

**Memory**  start `1099 MB`, end `885 MB`, peak `1454 MB`, GC `44 events / 239 ms`

**FPS over sampling window (ASCII):**

```
 54.9 |    █                                                                           
 52.5 |    █                                                                           
 50.1 |    █                                                                           
 47.7 |    █                                                                           
 45.3 |    █                                                                           
 43.0 |    █                                                                           
 40.6 |    █                                                                           
 38.2 |    █                                                                           
 35.8 |   ██                                             █               █             
 33.4 |   ███ █  ██ █ █ █ █    █ █   █   ██ ██ █ █ █ █   █     █   █ █   █   █ ██  █  █
 31.0 |████████████████ █ ████ ███ █████████████████ █████ ███ █ ███ █████ ████████████
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
  14 ms | █  1
  16 ms | █  1
  18 ms | █████  10
  19 ms | █████  10
  20 ms | █████████  18
  21 ms | █████████  18
  22 ms | ███████  14
  23 ms | ████  8
  24 ms | ████████  16
  25 ms | ███████  13
  26 ms | ███████  13
  27 ms | ████  8
  28 ms | ███████  13
  29 ms | ████████  16
  30 ms | ███████  13
  31 ms | █████████████  26
  32 ms | ██████████████████████████████  59
  33 ms | ████████████████████████████████████████  78
  34 ms | ███████████████████████████████  60
  35 ms | ████████████  23
  36 ms | ███████████  22
  37 ms | █████  9
  38 ms | █████████  17
  39 ms | ████  7
  40 ms | ███████  14
  41 ms | ██████████  20
  42 ms | ██████  11
  43 ms | ██████  11
  44 ms | ██████  12
  45 ms | █████████  17
  46 ms | ███████  14
  47 ms | █████  9
  48 ms | ███  5
  49 ms | ██  4
  50 ms | ██  4
  52 ms | █  1
  62 ms | █  1
```

**Extras:**

- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.86`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.11`
- `seed` = `7411.00`
- `preload_duration_ms` = `63.00`
- `entity_count_sample_end` = `3.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-10.00`
- `entity_count_sample_start` = `13.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `18.93`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `75.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23532 ms  |  Sample ticks: 400

**FPS**  avg `31.57`, min `17.41`, p50 `29.93`, p95 `47.19`, p99 `54.87`, 1%low `19.47`, 0.1%low `17.41`, std `8.36`

**Frame time (ms)**  avg `33.47`, p50 `33.41`, p95 `45.90`, p99 `48.43`, p99.9 `54.25`, max `57.45`

**Client tick (ms)**  avg `0.36`, p95 `0.63`, max `3.20`

**Memory**  start `1358 MB`, end `1345 MB`, peak `1817 MB`, GC `33 events / 224 ms`

**FPS over sampling window (ASCII):**

```
 40.4 |                                  █                                             
 39.3 |                                  █                                             
 38.3 |                                  █                                             
 37.2 |                                  █                                             
 36.1 |                                  █                                             
 35.1 |                                  █                  █ █                        
 34.0 |                    █   █     █   █        █ █   █   █ █                 █      
 32.9 | █     █      █     █ █ █     █   █        █ █   █ █ █ █    ██         █ ███    
 31.9 | █   █ █ ██ █ ██ ██ █ ███ █   █   █  █ █   █ █ █ █ ███ █   ███ █  █  █ █ ██████ 
 30.8 | █  ███████ █ ██ ████ █████ █ █ ████████████ ███ █ ███ ███████ █ ██████████████ 
 29.8 |████████████████████████████████████████████ ██████████████████████████████████ 
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms |   1
  16 ms |   1
  17 ms | ██  4
  18 ms | █  2
  19 ms | ███  7
  20 ms | ██████  13
  21 ms | ██████  13
  22 ms | ██████████  21
  23 ms | ███████  14
  24 ms | █████  11
  25 ms | ██████  12
  26 ms | ███████████  23
  27 ms | ████████  17
  28 ms | ██████  13
  29 ms | ██████  13
  30 ms | █████████  18
  31 ms | █████████████  27
  32 ms | ██████████████████████████  53
  33 ms | ████████████████████████████████████████  81
  34 ms | ████████████████████████  49
  35 ms | ██████████  20
  36 ms | ██████████  21
  37 ms | █████  10
  38 ms | ███████  14
  39 ms | ███████████  22
  40 ms | ████████  17
  41 ms | ███████  15
  42 ms | █████  11
  43 ms | ███████  15
  44 ms | ██████████  20
  45 ms | █████  10
  46 ms | ██████  13
  47 ms | ██  5
  48 ms | ███  7
  49 ms | █  2
  50 ms |   1
  52 ms |   1
  57 ms |   1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.87`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.41`
- `seed` = `7417.00`
- `preload_duration_ms` = `468.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.04`
- `fps_1pct_low` = `19.47`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `56.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `31.57`, min `16.71`, p50 `29.93`, p95 `47.91`, p99 `52.49`, 1%low `19.17`, 0.1%low `16.71`, std `8.02`

**Frame time (ms)**  avg `33.52`, p50 `33.41`, p95 `46.27`, p99 `48.58`, p99.9 `54.94`, max `59.85`

**Client tick (ms)**  avg `0.36`, p95 `0.51`, max `2.21`

**Memory**  start `839 MB`, end `1421 MB`, peak `2091 MB`, GC `25 events / 191 ms`

**FPS over sampling window (ASCII):**

```
 36.5 |                                                              █                 
 35.8 |                             █                                █           █     
 35.2 |                       █     █                                █    █      █     
 34.5 |                 █     █     █                            █   █    █      █   █ 
 33.9 |                 █     █     █                            █   █    █      █   █ 
 33.2 |                 █ █   █     █       █                █   █   █  █ █ ██   █   █ 
 32.5 |   █       █ █   █ █   █     █    █  █     █ ██       █ █ █   █  █ █ ██   █   █ 
 31.9 |   █  █    █ █  ██ ██  █ █   █ █  █  █   █ █ ██   █ █ █ ███   █  █ █ ██   █   █ 
 31.2 |██ █ ███ █ █ █████ ███ ███ █ ████ █  █ █ █ █ ███ ████ █ ███   ████ █ ██ █ ██  █ 
 30.6 |██ █ █████ ███████████ ███ █ ███████ █ █████████ ████ █ ██████████ █ ████ ██████
 29.9 |██████████ █████████████████████████████████████████████████████████ ███████████
 29.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | █  2
  17 ms | █  1
  18 ms | ██  3
  19 ms | ███████  13
  20 ms | ██████  12
  21 ms | ████████████  22
  22 ms | ███████████  21
  23 ms | ███████  13
  24 ms | █████  10
  25 ms | ██████████  19
  26 ms | ████  7
  27 ms | ███████  13
  28 ms | ██████████  18
  29 ms | ███████  13
  30 ms | ███████  14
  31 ms | ██████████  18
  32 ms | ████████████████████████████████████  67
  33 ms | ████████████████████████████████████████  75
  34 ms | ████████████████████████████  52
  35 ms | ███████████████  28
  36 ms | ███████  14
  37 ms | █████  9
  38 ms | ██████  11
  39 ms | ███████████  20
  40 ms | ███  6
  41 ms | █████  9
  42 ms | ██████████  18
  43 ms | █████████  16
  44 ms | ███████████  20
  45 ms | ██████████  18
  46 ms | ██████████  19
  47 ms | █████  9
  48 ms | █  1
  49 ms | █  2
  50 ms | █  1
  51 ms | █  2
  59 ms | █  1
```

**Extras:**

- `biome` = `minecraft:desert`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.71`
- `seed` = `7433.00`
- `preload_duration_ms` = `60.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-5.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `19.17`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `72.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23064 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `7.82`, p50 `9.98`, p95 `11.26`, p99 `12.59`, 1%low `7.87`, 0.1%low `n/a`, std `0.76`

**Frame time (ms)**  avg `100.29`, p50 `100.19`, p95 `112.81`, p99 `125.94`, p99.9 `127.55`, max `127.89`

**Client tick (ms)**  avg `0.42`, p95 `1.14`, max `15.71`

**Memory**  start `1984 MB`, end `2087 MB`, peak `2246 MB`, GC `25 events / 228 ms`

**FPS over sampling window (ASCII):**

```
 11.7 |                                   █          █                                 
 11.4 |                                   █          █                                 
 11.2 |               █                   █          █                                 
 10.9 |               █               █   █      █   █       █                         
 10.6 |   █    ██     █               █   █      █   █       █                         
 10.4 |   █    ██     █ █             █   █      █   █ ██    █           █     █     █ 
 10.1 |█  █  █ ███ █  ███  █ ██ ██ ██ █   ███ ██ █   █ ██  █ █  ████ █  ██ █ █ █    ███
  9.9 |██ ████ ██████ ████████████ ██ ███ ██████ █ █ █ ███ ███████████ ████████████ ███
  9.6 |███████ ██████ ████████████ ██ ███ ██████ ███ █████ ████████████████████████████
  9.3 |███████ ██████ ███████████████████ ██████████ ██████████████████████████████████
  9.1 |█████████████████████████████████████████████ ██████████████████████████████████
  8.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  74 ms | ███  2
  79 ms | █  1
  80 ms | █  1
  84 ms | ███  2
  85 ms | ███  2
  86 ms | █  1
  88 ms | ███  2
  89 ms | █  1
  90 ms | █  1
  91 ms | ████████  6
  93 ms | ██████  5
  94 ms | ██████  5
  95 ms | █████████  7
  96 ms | █████████  7
  97 ms | ██████████  8
  98 ms | ██████████████████████████  21
  99 ms | ████████████████████████  19
 100 ms | ████████████████████████████████████████  32
 101 ms | █████████████████████████████  23
 102 ms | ███████████████  12
 103 ms | █████  4
 104 ms | ████████  6
 105 ms | ████  3
 106 ms | ███  2
 107 ms | ████  3
 108 ms | ██████  5
 109 ms | █  1
 110 ms | ████  3
 111 ms | ████  3
 112 ms | █  1
 113 ms | ████  3
 115 ms | █  1
 116 ms | █  1
 118 ms | █  1
 125 ms | ███  2
 126 ms | █  1
 127 ms | █  1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7451.00`
- `preload_duration_ms` = `98.00`
- `entity_count_sample_end` = `66.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `58.00`
- `entity_count_sample_start` = `8.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `7.87`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `64.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23152 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `8.33`, p50 `10.00`, p95 `11.13`, p99 `11.54`, 1%low `8.45`, 0.1%low `n/a`, std `0.62`

**Frame time (ms)**  avg `100.24`, p50 `99.99`, p95 `112.91`, p99 `116.32`, p99.9 `119.41`, max `120.08`

**Client tick (ms)**  avg `0.36`, p95 `0.67`, max `2.78`

**Memory**  start `2196 MB`, end `1934 MB`, peak `2245 MB`, GC `22 events / 201 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |                                                        █                       
 10.8 |            █          █                                █         █     █      █
 10.6 |            █     █    █        █      █           █    █         █     █      █
 10.4 |     █      █     ██   █  █     █      █           █    █         █     █      █
 10.3 |     ██     █     ██   █  █  █  █   █  █    █ █    █    █         █ █   █      █
 10.1 |  █  ██ █   ██  █ ██ █ █ ██  █  ██  ██ █  █ █ █    ██   ██   █ █  █ █   ██ ██  █
  9.9 |███  ██████ █████ ████ █ █████  ███ ██ ██████████ █████ ██████ ████ ██  █████  █
  9.7 |███████████ █████ ████ ███████████████ ██████████ █████ ███████████ ██████████ █
  9.6 |█████████████████ ████ ████████████████████████████████ ██████████████████████ █
  9.4 |█████████████████ ████ ████████████████████████████████ ████████████████████████
  9.2 |██████████████████████ █████████████████████████████████████████████████████████
  9.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  83 ms | █  1
  85 ms | █  1
  86 ms | █  1
  87 ms | █  1
  88 ms | █████  4
  89 ms | ████  3
  90 ms | ████  3
  91 ms | █████  4
  92 ms | ████  3
  93 ms | ████████  6
  94 ms | ████████████  9
  95 ms | ███████  5
  96 ms | ████████  6
  97 ms | ███████████████  11
  98 ms | ███████████████████  14
  99 ms | █████████████████████████████████████  28
 100 ms | ████████████████████████████████████████  30
 101 ms | ███████████████████████████████  23
 102 ms | █████████████  10
 103 ms | █  1
 104 ms | █  1
 105 ms | █  1
 106 ms | ███████  5
 107 ms | ████  3
 108 ms | █████  4
 109 ms | ███  2
 110 ms | ███  2
 111 ms | █████  4
 112 ms | █████  4
 113 ms | ████  3
 114 ms | █  1
 115 ms | ████  3
 116 ms | ███  2
 120 ms | █  1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.98`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7457.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `9.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-7.00`
- `entity_count_sample_start` = `16.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.45`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24650 ms  |  Sample ticks: 400

**FPS**  avg `10.02`, min `8.11`, p50 `10.02`, p95 `11.15`, p99 `12.34`, 1%low `8.17`, 0.1%low `n/a`, std `0.70`

**Frame time (ms)**  avg `100.26`, p50 `99.79`, p95 `113.82`, p99 `119.05`, p99.9 `122.96`, max `123.36`

**Client tick (ms)**  avg `0.37`, p95 `0.80`, max `3.22`

**Memory**  start `2163 MB`, end `947 MB`, peak `2184 MB`, GC `25 events / 215 ms`

**FPS over sampling window (ASCII):**

```
 10.9 |         █                          █                                           
 10.7 |         █                          █                     █                     
 10.6 |         █  █      █                █                   █ █     █   █       █   
 10.4 |    █    █  █  █   █                █                  ██ █     █   █   █   █   
 10.3 | █  █    █  █  █   █ █ █    █       █       █      █   ██ █   █ █   █   █   █  █
 10.1 | ██ █    █  █  ██  █ █ █    █       █   █ █ █   ██ █ █ ██ █  ██ █   █ █ █   █  █
 10.0 | ██ ████ ██ ██ ███ ███ ████ ██████  ███ █ █ ███ ██ ███ ██ ██ ██ █ █ ███ ██  ██ █
  9.8 | ██ ████ ██ ██ ███ ███████████████  ███████ ██████ ███ ██ █████ █ █ ███ ██ █████
  9.7 | ███████ ██ ██ ███ ███████████████ ███████████████████ ██ ███████ █ ████████████
  9.6 |████████ █████████████████████████████████████████████ ██ ██████████████████████
  9.4 |████████ █████████████████████████████████████████████ █████████████████████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  78 ms | █  1
  80 ms | █  1
  81 ms | █  1
  85 ms | ████  3
  86 ms | █  1
  89 ms | ██████  5
  90 ms | █  1
  91 ms | ████████  6
  92 ms | ████  3
  93 ms | █████  4
  94 ms | ████████████  9
  95 ms | ██████  5
  96 ms | ████████  6
  97 ms | ██████████████████  14
  98 ms | ███████████████████████  18
  99 ms | ████████████████████████████████████████  31
 100 ms | ████████████████████████████████████  28
 101 ms | █████████████████  13
 102 ms | ████████████  9
 103 ms | ████  3
 104 ms | ███  2
 105 ms | ███  2
 106 ms | █  1
 107 ms | █████  4
 108 ms | █  1
 109 ms | █████  4
 110 ms | ████  3
 111 ms | █████  4
 112 ms | █████  4
 113 ms | ████  3
 114 ms | ███  2
 115 ms | ███  2
 116 ms | █  1
 117 ms | █  1
 118 ms | █  1
 121 ms | █  1
 123 ms | █  1
```

**Extras:**

- `biome` = `minecraft:forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7477.00`
- `preload_duration_ms` = `1608.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-4.00`
- `entity_count_sample_start` = `6.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.17`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `54.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23066 ms  |  Sample ticks: 400

**FPS**  avg `10.03`, min `8.24`, p50 `10.02`, p95 `11.07`, p99 `11.80`, 1%low `8.40`, 0.1%low `n/a`, std `0.66`

**Frame time (ms)**  avg `100.19`, p50 `99.81`, p95 `114.57`, p99 `116.58`, p99.9 `120.43`, max `121.32`

**Client tick (ms)**  avg `0.38`, p95 `1.05`, max `2.83`

**Memory**  start `1111 MB`, end `1761 MB`, peak `2077 MB`, GC `24 events / 180 ms`

**FPS over sampling window (ASCII):**

```
 11.1 |              █                    █                       █                    
 10.9 |              █                    █           █           █                    
 10.7 |█        █    █    █           █   █       █   █           █                    
 10.5 |█    █   █    █    █           █   █   █   █   █           █                  █ 
 10.3 |█    █ █ █    █    █      ██   █   █   █   █   █        █  █    █   █ █    █  █ 
 10.2 |█    █ █ █  █ ██   █   █  ██   █   █   ██  █   █ ██     █  █    ██  ███  █ █  █ 
 10.0 |███ ██ ████ █ ████ ██  ██ ████ ██  ███ ███ ███ ████████ █  ████ ███ ████ █ ██ ██
  9.8 |███ ██ ████ █ ████ ██████ ████ ██ ████ ███ ███ ██████████ █████ ███ █████████ ██
  9.6 |█████████████ ████ ███████████ ██ ████ ███████ ██████████ █████████ ████████████
  9.4 |█████████████ ████ ██████████████ ████ ████████████████████████████ ████████████
  9.3 |█████████████ ██████████████████████████████████████████████████████████████████
  9.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  82 ms | ██  2
  84 ms | █  1
  85 ms | ████  4
  86 ms | █  1
  89 ms | ██  2
  90 ms | ████  4
  91 ms | ██  2
  92 ms | ████████  7
  93 ms | █████  5
  94 ms | █████  5
  95 ms | ███  3
  96 ms | ██████  6
  97 ms | ███████████████  14
  98 ms | ██████████████████  17
  99 ms | ████████████████████████████████████████  37
 100 ms | ███████████████████████████████  29
 101 ms | █████████████████  16
 102 ms | ████████  7
 103 ms | ██████  6
 104 ms | █  1
 105 ms | ██  2
 106 ms | █  1
 107 ms | ████  4
 110 ms | █  1
 111 ms | ██  2
 112 ms | ██  2
 113 ms | ████  4
 114 ms | ██████  6
 115 ms | █████  5
 116 ms | ██  2
 121 ms | █  1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.98`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7481.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `9.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `4.00`
- `entity_count_sample_start` = `5.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.40`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `68.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24672 ms  |  Sample ticks: 400

**FPS**  avg `10.01`, min `7.92`, p50 `10.04`, p95 `11.19`, p99 `11.47`, 1%low `8.21`, 0.1%low `n/a`, std `0.64`

**Frame time (ms)**  avg `100.32`, p50 `99.57`, p95 `113.10`, p99 `116.92`, p99.9 `124.49`, max `126.23`

**Client tick (ms)**  avg `0.44`, p95 `1.46`, max `12.52`

**Memory**  start `907 MB`, end `1403 MB`, peak `2209 MB`, GC `24 events / 190 ms`

**FPS over sampling window (ASCII):**

```
 10.8 |               █                                         █                      
 10.7 |       █       █  █       █                           █  █      █               
 10.6 |       █       █  █       █    █      █          █    █  █      █   █           
 10.4 |       █       █  █       █  █ █      █          █    █  █   █  █   █  █   ██   
 10.3 | █  █  █       █  █   █   █  █ █      █   █      ██   █  █   █  █   █  █   ██   
 10.1 | █  ██ █       █  █   ██  █  █ ███ ██ ██  █ █ █  ██   █ ███  █  █ █ ██ █ █ ██   
 10.0 | ██ ██ ███████ ██ ██  ██ ███ █ ███ ██ ███ █ █ ██ ████ █ ████ ██ ███ ██ ███ ██ █ 
  9.8 |███ ██ ███████ ██ ███ ██ ███ ████████ █████ ████ ████ █ ████ ██ ███ ██ ███ ████ 
  9.7 |██████ ███████ ██ ███ ██ ███ ████████ ██████████ ████ █ ███████ ███ ██ ███ ████ 
  9.6 |██████████████ ██ ██████ ███ ████████ ██████████ ████ █ ███████ ███ ██ ███ █████
  9.4 |██████████████ █████████████ ██████████████████████████ ██████████████ █████████
  9.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  84 ms | █  1
  85 ms | █  1
  87 ms | ████  3
  88 ms | ██████  4
  89 ms | ██████  4
  90 ms | ████  3
  91 ms | █  1
  92 ms | ██████  4
  93 ms | ████  3
  94 ms | ████  3
  95 ms | ██████████  7
  96 ms | █████████████████  12
  97 ms | █████████████  9
  98 ms | ███████████████████████████████████████  27
  99 ms | ████████████████████████████████████████  28
 100 ms | ███████████████████████████████████████  27
 101 ms | ████████████████████████  17
 102 ms | ███████████  8
 103 ms | ████  3
 104 ms | ██████  4
 106 ms | █  1
 107 ms | ███  2
 108 ms | ██████  4
 109 ms | █  1
 110 ms | █  1
 111 ms | ███  2
 112 ms | ███████████  8
 113 ms | ███████  5
 116 ms | ███████  5
 117 ms | █  1
 126 ms | █  1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `9.97`
- `part` = `1.00`
- `fps_0p1pct_low` = `n/a`
- `seed` = `7487.00`
- `preload_duration_ms` = `1601.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-55.00`
- `entity_count_sample_start` = `56.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.08`
- `fps_1pct_low` = `8.21`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23054 ms  |  Sample ticks: 400

**FPS**  avg `162.13`, min `8.48`, p50 `107.09`, p95 `978.70`, p99 `1588.66`, 1%low `8.72`, 0.1%low `8.48`, std `315.74`

**Frame time (ms)**  avg `37.74`, p50 `9.34`, p95 `106.71`, p99 `113.13`, p99.9 `116.33`, max `117.98`

**Client tick (ms)**  avg `0.39`, p95 `0.71`, max `4.90`

**Memory**  start `1109 MB`, end `2066 MB`, peak `2239 MB`, GC `25 events / 200 ms`

**FPS over sampling window (ASCII):**

```
476.1 |                                                                               █
433.7 |                                    █                               █          █
391.3 |                                    ██       █                      █          █
348.9 |                                    ██       █   ██  ███ █ █        ██     █   █
306.5 |                               ██   ██      ██   ██  ███ █ █   █  █ ██     █   █
264.1 |                               ███  ██      ██  ███  ███ █ █   █  █ ██     █ █ █
221.8 |                               ███ ███      ██  ███ ████ █ █   █  █ ██  █  █ ███
179.4 |                               ███ ████ █   ██ ████ ██████ █ █ █  █ ██ ██  █ ███
137.0 |                             █████████████████ █████████████ ████ █ ██ █████████
 94.6 |                            ████████████████████████████████████████████████████
 52.2 |                           █████████████████████████████████████████████████████
  9.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  26
   1 ms | ████  14
   2 ms | ██  9
   3 ms | █  4
   4 ms |   1
   5 ms | █  2
   6 ms | ██  8
   7 ms | ██████████  36
   8 ms | ████████████████████████████████████████  145
   9 ms | ██████████  37
  10 ms | █  4
  11 ms |   1
  12 ms |   1
  13 ms | ██  6
  14 ms | ███  10
  15 ms | ████  13
  16 ms | ██  8
  17 ms | ███  12
  18 ms | ██  8
  19 ms | ██  7
  20 ms | █  5
  21 ms |   1
  23 ms | █  4
  24 ms |   1
  26 ms |   1
  31 ms |   1
  83 ms |   1
  87 ms |   1
  88 ms | █  4
  89 ms | ██  6
  90 ms | █  5
  91 ms | █  4
  92 ms | █  2
  93 ms |   1
  94 ms | █  5
  95 ms | █  5
  96 ms | █  5
  97 ms | ██  7
  98 ms | ████  16
  99 ms | ███████  25
 100 ms | █████  19
 101 ms | █████  18
 102 ms | █  5
 103 ms | █  3
 104 ms | █  4
 105 ms |   1
 106 ms | █  4
 107 ms | █  2
 108 ms | █  3
 109 ms | █  2
 110 ms |   1
 111 ms | █  3
 112 ms | ██  8
 113 ms | █  4
 114 ms |   1
 117 ms |   1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `26.50`
- `part` = `1.00`
- `fps_0p1pct_low` = `8.48`
- `seed` = `7499.00`
- `preload_duration_ms` = `0.00`
- `entity_count_sample_end` = `4.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-24.00`
- `entity_count_sample_start` = `28.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `8.72`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `68.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23313 ms  |  Sample ticks: 400

**FPS**  avg `244.51`, min `24.63`, p50 `118.65`, p95 `1230.13`, p99 `1660.94`, 1%low `40.28`, 0.1%low `25.48`, std `371.24`

**Frame time (ms)**  avg `9.27`, p50 `8.43`, p95 `19.59`, p99 `22.08`, p99.9 `26.88`, max `40.60`

**Client tick (ms)**  avg `0.30`, p95 `0.38`, max `0.68`

**Memory**  start `1421 MB`, end `1609 MB`, peak `2228 MB`, GC `17 events / 160 ms`

**FPS over sampling window (ASCII):**

```
426.5 |   █                                                                            
401.5 |   █                                                                            
376.4 |   █           █                                                                
351.4 |  ██   █     █ █      █                                                         
326.4 |  ██   █     █ █  █   █                                        █                
301.4 |  ██   █     █ █  ██  █    █                       █           █  █             
276.4 |████  ██ █  ██ █████  █ ████                █      █ █      ██ █  █         █   
251.3 |████ ███ ██ ████████  ███████ █   ██    ██  █      █ █      ██ █ ███        █ █ 
226.3 |███████████ █████████████████ ██ ██████ ██  ████ ██████  █ ███ █ ███   █  █ █ █ 
201.3 |███████████ ████████████████████ ███████████████ ███████████████ ████  █ ██ ████
176.3 |█████████████████████████████████████████████████████████████████████ █████ ████
151.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  173
   1 ms | █████  119
   2 ms | █  23
   3 ms |   3
   4 ms |   4
   5 ms |   3
   6 ms |   6
   7 ms | █████████  220
   8 ms | ████████████████████████████████████████  1011
   9 ms | █████  128
  10 ms | █  21
  11 ms |   6
  12 ms |   5
  13 ms |   7
  14 ms | █  34
  15 ms | ██  59
  16 ms | ████  95
  17 ms | ███  68
  18 ms | ██  47
  19 ms | █  33
  20 ms | █  37
  21 ms | █  31
  22 ms | █  15
  23 ms |   2
  24 ms |   2
  25 ms |   1
  26 ms |   2
  37 ms |   1
  40 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `107.85`
- `part` = `1.00`
- `fps_0p1pct_low` = `25.48`
- `seed` = `7507.00`
- `preload_duration_ms` = `248.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.07`
- `fps_1pct_low` = `40.28`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `48.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `205.99`, min `19.47`, p50 `115.41`, p95 `1207.00`, p99 `1641.55`, 1%low `20.67`, 0.1%low `19.47`, std `361.12`

**Frame time (ms)**  avg `14.08`, p50 `8.66`, p95 `37.56`, p99 `46.00`, p99.9 `50.93`, max `51.37`

**Client tick (ms)**  avg `0.36`, p95 `0.45`, max `12.88`

**Memory**  start `1414 MB`, end `1365 MB`, peak `2345 MB`, GC `20 events / 181 ms`

**FPS over sampling window (ASCII):**

```
369.3 |        █     █                                                                 
338.5 |█    █  █     █   █  █   █         █        █   █                               
307.7 |█ ████  ██    ██  █  █  ███        █        █   █   █                           
276.8 |█ █████ ███   ██ ██  █  ███    █   ██       ██  █   █ █  █   █                  
246.0 |█ █████ ████████ ██  ██ ███   ███████  ██   ██  ██  █ █ ███  █                  
215.2 |███████ ████████ ██ ███ ████ ████████  ██  ████ ██  █ █████  █ █ ██             
184.4 |███████ ████████ ██ ████████ █████████ ████████ ███████████ ██ ████             
153.5 |███████████████████ ████████ ██████████████████████████████████████             
122.7 |███████████████████████████████████████████████████████████████████             
 91.9 |████████████████████████████████████████████████████████████████████            
 61.1 |████████████████████████████████████████████████████████████████████            
 30.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | █████████  99
   1 ms | ████  43
   2 ms | █  12
   3 ms |   4
   4 ms |   4
   6 ms | ██  17
   7 ms | ██████████████  161
   8 ms | ████████████████████████████████████████  453
   9 ms | ████████  92
  10 ms | ██  21
  11 ms |   5
  13 ms |   3
  14 ms | █  13
  15 ms | ██  21
  16 ms | ████  41
  17 ms | ████  49
  18 ms | ███  30
  19 ms | ██  25
  20 ms | ███  34
  21 ms | ██  21
  22 ms | █  15
  23 ms | █  8
  24 ms | █  6
  25 ms | █  10
  26 ms | █  7
  27 ms |   5
  28 ms | █  8
  29 ms | █  9
  30 ms | █  9
  31 ms | █  13
  32 ms | ███  33
  33 ms | ███  32
  34 ms | ██  24
  35 ms | █  7
  36 ms | █  9
  37 ms | █  6
  38 ms |   5
  39 ms | █  9
  40 ms | █  14
  41 ms | █  6
  42 ms | █  6
  43 ms |   5
  44 ms |   3
  45 ms | █  7
  46 ms |   5
  47 ms |   1
  48 ms | █  6
  50 ms |   1
  51 ms |   2
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `71.02`
- `part` = `1.00`
- `fps_0p1pct_low` = `19.47`
- `seed` = `7517.00`
- `preload_duration_ms` = `44.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-19.00`
- `entity_count_sample_start` = `20.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`
- `fps_1pct_low` = `20.67`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `71.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `31.44`, min `17.59`, p50 `29.86`, p95 `48.15`, p99 `53.13`, 1%low `18.83`, 0.1%low `17.59`, std `7.93`

**Frame time (ms)**  avg `33.52`, p50 `33.49`, p95 `46.07`, p99 `51.25`, p99.9 `54.59`, max `56.83`

**Client tick (ms)**  avg `0.33`, p95 `0.51`, max `0.82`

**Memory**  start `1933 MB`, end `1662 MB`, peak `2441 MB`, GC `24 events / 180 ms`

**FPS over sampling window (ASCII):**

```
 39.1 |                                                            █                   
 38.1 |                                                            █                   
 37.1 |                                                            █                   
 36.1 |                 █                                          █                   
 35.1 |                 █                                      █   █           █       
 34.1 |                 ██                                █    █   █           █     █ 
 33.1 |    █     █      ██             █  █               █   ██ █ █ █         █     █ 
 32.1 |    █ █   █   █  ██  █   █      █ ██ █     ██ █   ██ █ ████ █ █ █ █ █   █  █  █ 
 31.0 |██  █ ███ █ ███  ██ ██  ██  █ ██████████ █ ██ ██████ █ ████ █ █████ ███ █ ██  ██
 30.0 |██ █████████████ ██ ██████████████████████████████████ ████████████ █████████ ██
 29.0 |█████████████████████████████████████████████████████████████████████████████ ██
 28.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  12 ms |   1
  13 ms |   1
  15 ms |   1
  17 ms |   1
  18 ms | █  3
  19 ms | ███  8
  20 ms | ████████  19
  21 ms | ██████  15
  22 ms | ██████  16
  23 ms | ████  10
  24 ms | ████  11
  25 ms | ████  9
  26 ms | ████  11
  27 ms | ████  10
  28 ms | ██████  14
  29 ms | ███████  17
  30 ms | ██████  16
  31 ms | ██████████████  35
  32 ms | ██████████████████████  54
  33 ms | ████████████████████████████████████████  99
  34 ms | ██████████████████████  54
  35 ms | █████████  23
  36 ms | ███████  17
  37 ms | ███████  18
  38 ms | ████████  19
  39 ms | ████  11
  40 ms | ███  7
  41 ms | █████  13
  42 ms | █████  12
  43 ms | █████  12
  44 ms | ████  11
  45 ms | ██████  16
  46 ms | ██████  15
  47 ms | ████  9
  48 ms |   1
  49 ms |   1
  51 ms | █  3
  52 ms | █  2
  53 ms |   1
  56 ms |   1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `scan_fallback` = `false`
- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `29.83`
- `part` = `1.00`
- `fps_0p1pct_low` = `17.59`
- `seed` = `7523.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_end` = `13.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-22.00`
- `entity_count_sample_start` = `35.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`
- `fps_1pct_low` = `18.83`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `69.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23117 ms  |  Sample ticks: 400

**FPS**  avg `30.95`, min `20.47`, p50 `29.93`, p95 `44.34`, p99 `49.73`, 1%low `20.83`, 0.1%low `20.47`, std `6.17`

**Frame time (ms)**  avg `33.40`, p50 `33.41`, p95 `43.85`, p99 `46.77`, p99.9 `48.54`, max `48.85`

**Client tick (ms)**  avg `0.25`, p95 `0.30`, max `0.35`

**Memory**  start `1676 MB`, end `1812 MB`, peak `1812 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                                                                    █           
 34.2 |                                                                    █           
 33.7 |                                                                    █           
 33.2 |                            █                                       █           
 32.7 |   █        █         █ █   █                █          █  █        █           
 32.2 |   █        █   █     █ █   █      █         █          █  █      █ █           
 31.6 |   █   █ █  █ █ ██  ███ █   █  █   █   █     █    █  █  █ ██      █ █ █      █ █
 31.1 | █ █ █ █ █ ██ █ ██  ███ █   █ ██ █ █   █ █   █ █  █  █  ████████ ██ ███  █   █ █
 30.6 | █ █ ████████ ████  ███ ███ ████ █ ███ █ █   █ ████  ██ ████████ ██ ████ █ █ █ █
 30.1 | █ █ ██████████████████ ███ ██████████ █ ███ ███████ ███████████████████████████
 29.6 |███████████████████████ ████████████████████████████ ███████████████████████████
 29.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms |   1
  18 ms |   1
  19 ms |   3
  20 ms | █  9
  21 ms | ██  10
  22 ms | ██  11
  23 ms | ██  14
  24 ms | ██  13
  25 ms | █  8
  26 ms | ██  13
  27 ms | ██  12
  28 ms | █  9
  29 ms | ██  14
  30 ms | ██  12
  31 ms | ██  16
  32 ms | ████  27
  33 ms | ████████████████████████████████████████  261
  34 ms | ██  16
  35 ms | ███  17
  36 ms | ██  13
  37 ms | ██  15
  38 ms | ██  14
  39 ms | ██  12
  40 ms | ██  13
  41 ms | ██  10
  42 ms | ██  16
  43 ms | ██  10
  44 ms | █  8
  45 ms | █  5
  46 ms | ██  11
  47 ms |   1
  48 ms | █  4
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `20.83`
- `seed` = `1923.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `33.00`
- `entity_count_sample_start` = `1.00`
- `fps_0p1pct_low` = `20.47`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `29.94`
- `entity_count_delta` = `0.00`
- `entity_count_sample_end` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `33.27`, min `13.21`, p50 `29.07`, p95 `53.31`, p99 `95.95`, 1%low `15.73`, 0.1%low `13.21`, std `15.31`

**Frame time (ms)**  avg `33.49`, p50 `34.40`, p95 `47.08`, p99 `54.50`, p99.9 `69.62`, max `75.69`

**Client tick (ms)**  avg `2.80`, p95 `3.33`, max `3.83`

**Memory**  start `2183 MB`, end `879 MB`, peak `2263 MB`, GC `2 events / 22 ms`

**FPS over sampling window (ASCII):**

```
 47.8 |                                           █                                  █ 
 45.9 |                                           █                                  █ 
 44.1 |    █             █                        █                                  █ 
 42.3 |    █             █                        █         █                        █ 
 40.5 |    █           █ █                        █         █                        █ 
 38.7 | █  █           █ █         █              █         █                        █ 
 36.9 | █  █           █ █       █ █              █         █       █                █ 
 35.1 | █  █         █ █ █ █     █ █    █  █      █         █       █                █ 
 33.3 | █  ██ █  █ █ █ █ █ █    ████    █  ██ █   █ █ █ █   ██ █ ██ ██  █      █ █ ████
 31.5 | ██ ███████████████████████████ ███ ██ ███████ █ ███ ███████████████ ██ █ ██████
 29.7 | ███████████████████████████████████████████████████████████████████████████████
 27.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms | █  2
   7 ms | ██  3
   9 ms | █  1
  10 ms | ███  4
  12 ms | █  1
  13 ms | █  1
  14 ms | ██  3
  15 ms | █  1
  17 ms | ██████  8
  18 ms | ██████  9
  19 ms | ██████████████  20
  20 ms | ████████  11
  21 ms | ███████  10
  22 ms | ██████████████  19
  23 ms | ██████████  14
  24 ms | ███████  10
  25 ms | ██████  9
  26 ms | ███████  10
  27 ms | ██████  9
  28 ms | ██████  9
  29 ms | ███████████  15
  30 ms | ████████████████████████████  39
  31 ms | █████████████  18
  32 ms | ███████████  16
  33 ms | ██████████████████████████████████  47
  34 ms | ████████████████  22
  35 ms | ███████████████████████████████████████  55
  36 ms | ████████████████████████████████████████  56
  37 ms | ████████████████  23
  38 ms | ███████████  16
  39 ms | ████████  11
  40 ms | █████████  12
  41 ms | █████████  12
  42 ms | ████████████  17
  43 ms | ████████████  17
  44 ms | ████████  11
  45 ms | ██████████  14
  46 ms | ████████  11
  47 ms | ██████  8
  48 ms | ████  6
  49 ms | █  1
  50 ms | ██  3
  51 ms | ██  3
  53 ms | █  2
  54 ms | █  2
  57 ms | █  1
  58 ms | █  1
  61 ms | █  1
  62 ms | █  1
  65 ms | █  1
  75 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `15.73`
- `fps_0p1pct_low` = `13.21`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `particles_spawned` = `256000.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `29.86`
- `entity_count_delta` = `0.00`
- `seed` = `2521.00`
- `preload_duration_ms` = `33.00`
- `particle_types` = `16.00`
- `entity_count_sample_start` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `31.44`, min `16.44`, p50 `29.92`, p95 `46.99`, p99 `55.73`, 1%low `18.06`, 0.1%low `16.44`, std `9.69`

**Frame time (ms)**  avg `33.41`, p50 `33.42`, p95 `45.04`, p99 `50.52`, p99.9 `58.41`, max `60.81`

**Client tick (ms)**  avg `0.26`, p95 `0.31`, max `0.67`

**Memory**  start `1145 MB`, end `1425 MB`, peak `1425 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 51.3 |                          █                                                     
 49.3 |                          █                                                     
 47.2 |                          █                                                     
 45.2 |                          █                                                     
 43.1 |                          █                                                     
 41.1 |                          █                                                     
 39.0 |                          █                                                     
 37.0 |                          █          █                                          
 34.9 |        █    ██           █       █  █                                          
 32.9 |  █   █ █ █  ██ █ █ █ █ █ █     █ █ ███     █   █        █      █ █             
 30.8 |█████ ███████████████ ███ █████ █ █ ██████████████████████████ ██ ██████████████
 28.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   1
  10 ms |   1
  12 ms |   1
  14 ms |   2
  16 ms |   1
  17 ms |   1
  18 ms |   2
  19 ms |   3
  20 ms | ██  14
  21 ms | ██  13
  22 ms | ██  10
  23 ms | █  7
  24 ms | █  8
  25 ms | ██  14
  26 ms | █  9
  27 ms | █  6
  28 ms | █  7
  29 ms | ██  10
  30 ms | ██  10
  31 ms | ██  13
  32 ms | ████████  52
  33 ms | ████████████████████████████████████████  246
  34 ms | ████  25
  35 ms | ██  14
  36 ms | ██  14
  37 ms | ██  15
  38 ms | ██  10
  39 ms | ██  13
  40 ms | ██  11
  41 ms | ██  11
  42 ms | ██  10
  43 ms | █  5
  44 ms | █  9
  45 ms | █  6
  46 ms | ██  15
  47 ms |   1
  48 ms |   2
  50 ms |   2
  53 ms |   1
  54 ms |   1
  55 ms |   1
  56 ms |   1
  60 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `sources_placed_total` = `54.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `part` = `1.00`
- `fps_0p1pct_low` = `16.44`
- `seed` = `9043.00`
- `preload_duration_ms` = `35.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `waves_spawned` = `6.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `18.06`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `scheduled_fluid_ticks` = `3166.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `30.91`, min `20.91`, p50 `29.87`, p95 `45.18`, p99 `48.76`, 1%low `21.65`, 0.1%low `20.91`, std `5.99`

**Frame time (ms)**  avg `33.40`, p50 `33.48`, p95 `42.95`, p99 `45.40`, p99.9 `47.10`, max `47.82`

**Client tick (ms)**  avg `0.26`, p95 `0.31`, max `0.37`

**Memory**  start `1660 MB`, end `1860 MB`, peak `1860 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                                           █   █                                
 32.8 |        █                                  █   █                  █ █  █        
 32.4 |        █          █                       █   █                █ █ █  █        
 31.9 |    █   █          █  █                    █ █ █    █           █ █ █ ██  █  █  
 31.5 |    █   █       █  █ ██   █  ██   ██   █   █ █ █ █  █      █    █ █ █ ██  █  █  
 31.1 |    █   █████   █  █ ████ █  ██   ██   ██  █ █ █ █  █  █ █ ████ ███ █ ██  █  █  
 30.7 |█   █  ██████   █  ██████ █ █████ ███  ██  █ █ █ █ ██  █ ██████ ███ █ ██ ███████
 30.2 |███████████████ █ ███████ █ ██████████████ ███ █ █ ███ ████████ ███ █ ██ ███████
 29.8 |███████████████ █ ███████ ████████████████ █████ █ ████████████ █████ ██████████
 29.4 |██████████████████████████████████████████ █████ ██████████████ █████ ██████████
 29.0 |██████████████████████████████████████████ ██████████████████████████ ██████████
 28.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  4
  20 ms | █  9
  21 ms | ██  16
  22 ms | █  8
  23 ms | ██  13
  24 ms | ██  11
  25 ms | ███  18
  26 ms | ██  13
  27 ms | █  9
  28 ms | █  7
  29 ms | █  7
  30 ms | █  7
  31 ms | ██  14
  32 ms | ████  25
  33 ms | ████████████████████████████████████████  258
  34 ms | ███  22
  35 ms | ███  18
  36 ms | ██  11
  37 ms | ███  17
  38 ms | ██  11
  39 ms | ███  22
  40 ms | ███  19
  41 ms | ██  15
  42 ms | ██  14
  43 ms | ██  13
  44 ms | █  4
  45 ms | ██  11
  46 ms |   1
  47 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `blocks_per_toggle` = `256.00`
- `fps_1pct_low` = `21.65`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `20.91`
- `preload_chunks` = `81.00`
- `seed` = `9007.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `66.00`
- `toggles` = `22.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `31.20`, min `16.13`, p50 `29.86`, p95 `46.25`, p99 `50.13`, 1%low `19.35`, 0.1%low `16.13`, std `7.78`

**Frame time (ms)**  avg `33.41`, p50 `33.49`, p95 `44.38`, p99 `47.23`, p99.9 `57.46`, max `61.99`

**Client tick (ms)**  avg `0.26`, p95 `0.31`, max `0.35`

**Memory**  start `884 MB`, end `1108 MB`, peak `1108 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 43.2 |                                                                 █              
 41.9 |                                                                 █              
 40.6 |                                                                 █              
 39.3 |                                                                 █              
 38.0 |                                                                 █              
 36.7 |                                                                 █              
 35.4 |                                                                 █         █    
 34.1 |                                                                 █         █    
 32.8 |           █      █                    █                  █      █   █    ██    
 31.5 |█     █  ████  ██ █ █ █ █  ██ ██  █   ██ █ ███ █ ██  ████ █ █  █████ ██ ████ █  
 30.2 |███████ ████████████████████████████████ ███████████████████████████ ███████████
 28.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms |   1
  12 ms |   1
  13 ms |   1
  18 ms |   1
  19 ms | █  4
  20 ms | █  10
  21 ms | ███  17
  22 ms | █  10
  23 ms | ██  13
  24 ms | █  10
  25 ms | █  10
  26 ms | █  6
  27 ms | ██  15
  28 ms | █  10
  29 ms | █  8
  30 ms | █  6
  31 ms | ██  13
  32 ms | ███  22
  33 ms | ████████████████████████████████████████  270
  34 ms | ██  14
  35 ms | ███  18
  36 ms | █  10
  37 ms | ███  20
  38 ms | ██  15
  39 ms | ███  21
  40 ms | ██  13
  41 ms | ██  11
  42 ms | █  10
  43 ms | █  7
  44 ms | █  9
  45 ms | ██  11
  46 ms | █  5
  47 ms |   3
  48 ms |   1
  50 ms |   1
  54 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `19.35`
- `restocks` = `20.00`
- `fps_harmonic_avg` = `29.94`
- `neighbour_updates` = `0.00`
- `hoppers_built` = `400.00`
- `fps_0p1pct_low` = `16.13`
- `preload_chunks` = `81.00`
- `seed` = `8011.00`
- `preset_long` = `0.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `preload_duration_ms` = `33.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `30.87`, min `18.26`, p50 `29.86`, p95 `45.91`, p99 `49.59`, 1%low `20.99`, 0.1%low `18.26`, std `5.93`

**Frame time (ms)**  avg `33.40`, p50 `33.48`, p95 `43.33`, p99 `45.75`, p99.9 `50.07`, max `54.77`

**Client tick (ms)**  avg `0.27`, p95 `0.32`, max `0.58`

**Memory**  start `1346 MB`, end `1566 MB`, peak `1566 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                            █                                                   
 32.8 |             █     █        █ █                                                 
 32.4 |           █ █     █        █ █        █                                        
 32.0 |         █ █ █     █        ███        █       █                     █          
 31.6 |     ██  █ █ █     █  █     ███    █   █ █   █ █  █        █  █      █     █    
 31.2 |   █ ██  ███ █ ██ ██  ██    ███ █  █ █ █ █   █ ████ █ █    █ ███   █ █ █   ███  
 30.8 |█  ████  ███ █ ██ ██  ██    ███ █ ██ █ █ █  ██ ████ █ █  ███ ████  █ ███   ███  
 30.4 |█  ████ ████ ████████ ██ ██ ███ █ ████ ████ ███████ ████████ █████ █ ███  █████ 
 30.0 |██ █████████ ██████████████ ███████████████ ███████████████████████████████████ 
 29.5 |███████████████████████████ ███████████████ ███████████████████████████████████ 
 29.1 |███████████████████████████████████████████████████████████████████████████████ 
 28.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  19 ms | █  4
  20 ms | ██  13
  21 ms | ██  15
  22 ms | █  7
  23 ms | █  6
  24 ms | ██  11
  25 ms | ██  11
  26 ms | █  9
  27 ms | █  6
  28 ms | ██  12
  29 ms | ██  12
  30 ms | ██  14
  31 ms | ██  15
  32 ms | ███  23
  33 ms | ████████████████████████████████████████  273
  34 ms | ███  22
  35 ms | ███  23
  36 ms | ██  13
  37 ms | ██  12
  38 ms | ██  16
  39 ms | ██  11
  40 ms | ██  11
  41 ms | █  10
  42 ms | ██  14
  43 ms | █  10
  44 ms | ██  12
  45 ms | █  9
  46 ms |   3
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `29.94`
- `part` = `1.00`
- `chests_built` = `64.00`
- `fps_0p1pct_low` = `18.26`
- `seed` = `8053.00`
- `preload_duration_ms` = `44.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `oscillations` = `20.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `20.99`
- `scheduled_block_ticks` = `1152.00`
- `preset_full` = `0.00`
- `comparators_built` = `64.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195062 ms  |  Sample ticks: 3600

**FPS**  avg `90.95`, min `11.12`, p50 `65.39`, p95 `237.44`, p99 `422.83`, 1%low `16.90`, 0.1%low `13.92`, std `78.39`

**Frame time (ms)**  avg `19.46`, p50 `15.29`, p95 `44.97`, p99 `55.20`, p99.9 `63.59`, max `89.90`

**Client tick (ms)**  avg `0.76`, p95 `0.97`, max `9.82`

**Memory**  start `842 MB`, end `1363 MB`, peak `2038 MB`, GC `21 events / 124 ms`

**FPS over sampling window (ASCII):**

```
153.5 |                                                 ██                             
142.4 |                                            █   ███           ██                
131.3 |                              ████████ █████████████     ███████                
120.1 |                ███████ ███████████████████████████████ ████████                
109.0 |               █████████████████████████████████████████████████                
 97.9 |               █████████████████████████████████████████████████                
 86.8 |               █████████████████████████████████████████████████                
 75.7 |               ██████████████████████████████████████████████████               
 64.6 |               ██████████████████████████████████████████████████               
 53.5 |               ██████████████████████████████████████████████████               
 42.4 |       █  ██ █ ██████████████████████████████████████████████████               
 31.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  29
   2 ms | ████  212
   3 ms | ████  187
   4 ms | ███  155
   5 ms | █  69
   6 ms | ██  120
   7 ms | ██████████████████  919
   8 ms | ████████████████████████████████████████  2071
   9 ms | ████████████  639
  10 ms | █  56
  11 ms | █  28
  12 ms |   18
  13 ms |   21
  14 ms | █  61
  15 ms | ███  133
  16 ms | ██  99
  17 ms | ███  155
  18 ms | ████  182
  19 ms | ████  204
  20 ms | █████  243
  21 ms | █████  254
  22 ms | ████  197
  23 ms | ███  133
  24 ms | ██  111
  25 ms | ██  95
  26 ms | ██  113
  27 ms | ██  90
  28 ms | █  71
  29 ms | ██  81
  30 ms | █  63
  31 ms | █  66
  32 ms | ██████  286
  33 ms | ████████  424
  34 ms | ██████  316
  35 ms | █  62
  36 ms | █  71
  37 ms | ██  84
  38 ms | ██  94
  39 ms | ██  87
  40 ms | ██  94
  41 ms | ██  91
  42 ms | █  63
  43 ms | ██  98
  44 ms | ███  145
  45 ms | ██  125
  46 ms | █  70
  47 ms | █  41
  48 ms |   21
  49 ms |   23
  50 ms |   20
  51 ms |   12
  52 ms |   16
  53 ms |   18
  54 ms |   20
  55 ms |   17
  56 ms |   14
  57 ms |   17
  58 ms |   21
  59 ms |   6
  60 ms |   5
  61 ms |   2
  62 ms |   1
  63 ms |   2
  64 ms |   1
  65 ms |   1
  66 ms |   1
  67 ms |   1
  71 ms |   1
  72 ms |   1
  73 ms |   2
  89 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `51.39`
- `fps_1pct_low` = `16.90`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `88.00`
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
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `13.92`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `117.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194356 ms  |  Sample ticks: 3600

**FPS**  avg `34.78`, min `14.79`, p50 `30.04`, p95 `69.39`, p99 `107.73`, 1%low `16.77`, 0.1%low `15.20`, std `17.68`

**Frame time (ms)**  avg `33.41`, p50 `33.29`, p95 `52.36`, p99 `57.54`, p99.9 `63.86`, max `67.63`

**Client tick (ms)**  avg `0.70`, p95 `0.92`, max `1.27`

**Memory**  start `1692 MB`, end `1358 MB`, peak `1885 MB`, GC `18 events / 89 ms`

**FPS over sampling window (ASCII):**

```
 37.7 |   █                    █                       ██                        █     
 37.1 |   █  █                 █ █                   ████   █  █                 █     
 36.5 | █ █  █   █      █   █  ███ █  ██   █         ████   █  █                 █     
 35.9 | █ █  █ █ ██ █   █  ███████ █  ██   █  █      ████   █  ██                ██   █
 35.3 | ███  █ ██████  ██ ████████ ████████████  █   ████   █  ██               ███   █
 34.6 | ████ █ ██████  ██ █████████████████████  █   ████   ██ ██               ███████
 34.0 | █████████████  ████████████████████████████  ████████████          █    ███████
 33.4 | █████████████ █████████████████████████████ █████████████          █   ████████
 32.8 | █████████████ █████████████████████████████ █████████████          ██  ████████
 32.2 | █████████████ ████████████████████████████████████████████ █    █████  ████████
 31.5 |██████████████ ████████████████████████████████████████████ ████ █████  ████████
 30.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   2
   5 ms |   2
   6 ms |   5
   7 ms | █  16
   8 ms | ██  21
   9 ms | ███  39
  10 ms | ███  37
  11 ms | ████  41
  12 ms | █████  53
  13 ms | ████  42
  14 ms | ██  27
  15 ms | ████  44
  16 ms | ████  46
  17 ms | ███  39
  18 ms | ████  40
  19 ms | ██████  66
  20 ms | ██████████  114
  21 ms | ███████████████  173
  22 ms | ██████████████  160
  23 ms | ██████████████████  202
  24 ms | ████████████████  177
  25 ms | ██████████████  159
  26 ms | ███████████  124
  27 ms | ██████████  111
  28 ms | ████████  87
  29 ms | █████████  97
  30 ms | ██████  72
  31 ms | ████████████  135
  32 ms | █████████████████████████████████████  420
  33 ms | █████████████████████████████████████  418
  34 ms | ████████████████████████████████████████  449
  35 ms | ███████  83
  36 ms | ████  48
  37 ms | ██████  70
  38 ms | ███████  79
  39 ms | █████████  100
  40 ms | █████████████  141
  41 ms | ██████████  112
  42 ms | ████████████  140
  43 ms | ███████████████  169
  44 ms | ████████████████  176
  45 ms | ████████████████  180
  46 ms | ████████████  131
  47 ms | ██████  65
  48 ms | █████  52
  49 ms | ████  50
  50 ms | ███  38
  51 ms | █████  54
  52 ms | ███  36
  53 ms | ███  37
  54 ms | █████  55
  55 ms | ███  36
  56 ms | ████  40
  57 ms | ███  31
  58 ms | ██  26
  59 ms | █  8
  60 ms |   5
  61 ms |   1
  62 ms |   1
  64 ms |   2
  65 ms |   3
  67 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.93`
- `fps_1pct_low` = `16.77`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
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
- `fps_0p1pct_low` = `15.20`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `117.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194244 ms  |  Sample ticks: 3600

**FPS**  avg `35.52`, min `12.57`, p50 `30.05`, p95 `75.53`, p99 `122.49`, 1%low `16.11`, 0.1%low `13.37`, std `20.26`

**Frame time (ms)**  avg `33.43`, p50 `33.27`, p95 `53.69`, p99 `58.88`, p99.9 `67.56`, max `79.54`

**Client tick (ms)**  avg `0.71`, p95 `0.92`, max `8.52`

**Memory**  start `1204 MB`, end `797 MB`, peak `1864 MB`, GC `16 events / 78 ms`

**FPS over sampling window (ASCII):**

```
 39.1 |                 █                                                              
 38.4 |                 █         █  █                             █                   
 37.7 | █               █     █   █  █      █  █    █ █            █                   
 37.0 | ██ █        █   █     █ █ █  ██     █  █    ████    █      █              █    
 36.3 | ██ █     █ ██   █  █  █ █ ██████ █ ██  ██  █████  █ █      █             ██ █  
 35.7 | ██ █ █  ██ ███ █████  █ █ ███████████████  ██████ ████   █ █        ███  ██ █ █
 35.0 | ████ █  ██████ █████ ████ ███████████████ █████████████ ██ █        ███  ██ ███
 34.3 | ████ █ ███████████████████████████████████████████████████ █ █      ███████ ███
 33.6 |███████ ███████████████████████████████████████████████████ █ █    █ ███████████
 32.9 |███████ █████████████████████████████████████████████████████ █    █ ███████████
 32.2 |█████████████████████████████████████████████████████████████████ ██ ███████████
 31.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms |   2
   4 ms |   3
   5 ms |   3
   6 ms | █  11
   7 ms | ███  29
   8 ms | ███  36
   9 ms | ████  46
  10 ms | ███  36
  11 ms | ████  47
  12 ms | ████  46
  13 ms | ███  32
  14 ms | ███  29
  15 ms | ████  39
  16 ms | █████  50
  17 ms | ████  44
  18 ms | ██████  62
  19 ms | █████  56
  20 ms | ██████  64
  21 ms | ████████████  133
  22 ms | ███████████████  161
  23 ms | ██████████████████████  247
  24 ms | █████████████████████  228
  25 ms | ███████████████████  207
  26 ms | ████████████  133
  27 ms | ██████████  106
  28 ms | ████████  92
  29 ms | ██████  62
  30 ms | ███████  78
  31 ms | █████████  97
  32 ms | █████████████████████████████████████  405
  33 ms | ████████████████████████████████████████  441
  34 ms | ████████████████████████████████████  393
  35 ms | █████  56
  36 ms | ███  36
  37 ms | ██  23
  38 ms | █████  52
  39 ms | ████████  83
  40 ms | █████████████  138
  41 ms | ██████████████  157
  42 ms | █████████████████  182
  43 ms | █████████████████  192
  44 ms | ████████████████  179
  45 ms | ██████████████  155
  46 ms | ███████████  116
  47 ms | ████████  85
  48 ms | █████  52
  49 ms | ████  42
  50 ms | ████  39
  51 ms | ███  37
  52 ms | ████  40
  53 ms | ████  43
  54 ms | ████  49
  55 ms | ████  39
  56 ms | ████  42
  57 ms | ████  49
  58 ms | ███  29
  59 ms | ██  23
  60 ms | █  10
  61 ms |   3
  62 ms |   4
  63 ms |   2
  64 ms |   2
  67 ms |   2
  70 ms |   1
  73 ms |   1
  74 ms |   1
  76 ms |   1
  79 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `29.91`
- `fps_1pct_low` = `16.11`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `90.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `4.00`
- `segment_count` = `19.00`
- `phase` = `2.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `71.00`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `13.37`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `117.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195143 ms  |  Sample ticks: 3600

**FPS**  avg `25.22`, min `7.31`, p50 `26.27`, p95 `48.13`, p99 `60.73`, 1%low `8.39`, 0.1%low `7.46`, std `14.08`

**Frame time (ms)**  avg `54.92`, p50 `38.06`, p95 `108.13`, p99 `114.08`, p99.9 `127.82`, max `136.71`

**Client tick (ms)**  avg `0.68`, p95 `0.94`, max `1.96`

**Memory**  start `819 MB`, end `1452 MB`, peak `1897 MB`, GC `14 events / 59 ms`

**FPS over sampling window (ASCII):**

```
 38.0 |      ██                                                                        
 35.5 | █████████                                                                      
 32.9 |███████████  ██ ████ █ ██ █     █ ███ █ ██████ ████ ██                          
 30.4 |███████████████████████████████████████████████████████                         
 27.8 |███████████████████████████████████████████████████████                         
 25.3 |███████████████████████████████████████████████████████                         
 22.7 |███████████████████████████████████████████████████████                         
 20.2 |████████████████████████████████████████████████████████                        
 17.6 |████████████████████████████████████████████████████████                        
 15.1 |████████████████████████████████████████████████████████                        
 12.5 |████████████████████████████████████████████████████████                        
 10.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   1
   6 ms |   1
   7 ms |   3
   8 ms |   2
  10 ms |   2
  11 ms |   2
  12 ms | █  6
  13 ms |   1
  14 ms | █  9
  15 ms |   3
  16 ms | █  8
  17 ms | ███  22
  18 ms | ███  24
  19 ms | █████  33
  20 ms | ██████████  69
  21 ms | ███████████  75
  22 ms | ████████████  88
  23 ms | █████████  64
  24 ms | ██████  42
  25 ms | █████  35
  26 ms | █████  37
  27 ms | ████  27
  28 ms | █████  34
  29 ms | ███  23
  30 ms | ████  25
  31 ms | ███████  51
  32 ms | ██████████████████████████████  214
  33 ms | ████████████████████████████████████████  284
  34 ms | ███████████████████████████████████  252
  35 ms | ████████████  84
  36 ms | ████████  54
  37 ms | ████████  60
  38 ms | ███████  48
  39 ms | ████████  60
  40 ms | ██████  45
  41 ms | ████████  54
  42 ms | ███████  48
  43 ms | ████████  60
  44 ms | ██████████  73
  45 ms | █████████  64
  46 ms | ██████  43
  47 ms | ████  26
  48 ms | ███  20
  49 ms | █  7
  50 ms | █  6
  51 ms | █  6
  52 ms | █  4
  53 ms |   3
  54 ms | █  6
  55 ms | █  5
  56 ms |   1
  58 ms |   2
  59 ms |   1
  60 ms |   1
  61 ms |   2
  62 ms |   1
  67 ms |   1
  74 ms |   1
  77 ms |   1
  79 ms |   1
  80 ms |   1
  82 ms |   2
  83 ms |   1
  84 ms |   1
  85 ms |   1
  86 ms |   1
  88 ms | ██  12
  89 ms | ██  11
  90 ms | ██  17
  91 ms | █████  32
  92 ms | ███  20
  93 ms | ██████  40
  94 ms | ███████  50
  95 ms | █████  39
  96 ms | ███████  50
  97 ms | ███████  52
  98 ms | ███████████  80
  99 ms | ███████████████████████████  189
 100 ms | █████████████████████████████  207
 101 ms | ███████  53
 102 ms | █  10
 103 ms | █  7
 104 ms |   3
 105 ms | █  4
 107 ms |   3
 108 ms | █  8
 109 ms | ███  18
 110 ms | ████  27
 111 ms | █████  34
 112 ms | █████  33
 113 ms | ██  12
 114 ms | █  8
 115 ms | █  5
 116 ms |   2
 117 ms | █  6
 118 ms | █  5
 120 ms |   1
 122 ms |   1
 124 ms |   1
 125 ms |   1
 128 ms |   1
 129 ms |   1
 136 ms |   2
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `highEnd.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `pbr.zip`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `18.21`
- `fps_1pct_low` = `8.39`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `89.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `19.00`
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
- `fps_0p1pct_low` = `7.46`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `117.00`

