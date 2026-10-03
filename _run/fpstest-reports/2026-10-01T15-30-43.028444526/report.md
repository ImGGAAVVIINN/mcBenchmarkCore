# MC Benchmark Core session — 2026-10-01T16:06:08.226981288+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 249.1 | 33.7 | 24.9 | 24.55 | 0.79 | 91 | 399 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 104.5 | 37.9 | 29.1 | 23.90 | 0.79 | 63 | 184 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 100.1 | 21.3 | 19.5 | 44.47 | 0.75 | 43 | 557 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 28.5 | 18.9 | 17.2 | 48.62 | 0.71 | 14 | 747 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 28.2 | 20.5 | 19.9 | 47.62 | 0.69 | 15 | 592 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 28.6 | 20.2 | 19.6 | 48.40 | 0.50 | 15 | 531 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 28.8 | 20.2 | 18.7 | 48.29 | 0.69 | 16 | 163 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 28.8 | 19.2 | 17.7 | 49.08 | 1.09 | 16 | 699 |
| 9 | [XP orbs ×500 ring](#xp-orbs-500-ring) | Entities | 29.6 | 16.5 | 15.9 | 58.95 | 2.97 | 19 | 474 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 30.8 | 15.6 | 14.8 | 60.74 | 3.69 | 24 | 513 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 28.5 | 17.3 | 15.7 | 51.35 | 0.97 | 22 | 196 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 28.3 | 18.9 | 16.3 | 47.73 | 0.50 | 16 | 560 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 31.0 | 15.8 | 15.1 | 60.35 | 3.66 | 22 | 102 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 29.3 | 17.1 | 16.2 | 55.55 | 2.42 | 19 | 129 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 119.2 | 12.4 | 8.3 | 69.90 | 15.50 | 30 | 398 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 120.1 | 18.9 | 17.3 | 49.42 | 15.99 | 33 | 398 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 107.8 | 22.1 | 20.6 | 41.38 | 2.03 | 45 | 770 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 29.1 | 16.1 | 14.7 | 57.80 | 1.88 | 16 | 787 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 28.3 | 20.6 | 19.6 | 47.78 | 0.67 | 18 | 800 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 28.6 | 20.1 | 19.3 | 48.47 | 0.31 | 17 | 69 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 28.4 | 19.6 | 18.1 | 48.82 | 0.26 | 18 | 564 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 28.6 | 18.5 | 16.8 | 49.35 | 0.32 | 15 | 717 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 28.4 | 20.7 | 20.2 | 47.77 | 0.30 | 17 | 292 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 28.5 | 15.3 | 13.3 | 57.53 | 0.41 | 50 | 810 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 28.4 | 14.5 | 11.7 | 59.47 | 0.43 | 37 | 1216 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 107.4 | 28.9 | 21.3 | 27.65 | 0.37 | 25 | 531 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 109.4 | 32.6 | 24.8 | 27.13 | 0.36 | 25 | 66 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 97.6 | 18.1 | 13.9 | 46.25 | 0.39 | 28 | 475 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 28.2 | 16.4 | 15.4 | 54.89 | 0.37 | 23 | 1409 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 28.8 | 14.3 | 12.5 | 57.76 | 0.37 | 20 | 1533 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 28.9 | 14.3 | 13.5 | 63.57 | 0.36 | 22 | 1042 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 28.6 | 16.7 | 15.8 | 57.44 | 0.46 | 23 | 1709 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 28.7 | 17.3 | 16.3 | 54.78 | 0.33 | 19 | 147 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 28.5 | 14.0 | 12.1 | 63.78 | 0.38 | 19 | 2099 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 28.5 | 17.2 | 15.2 | 53.72 | 0.35 | 19 | 488 |
| 36 | [Idle Baseline](#idle-baseline) | Baseline | 28.5 | 20.5 | 19.9 | 47.94 | 0.27 | 5 | 804 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 31.1 | 15.3 | 13.5 | 60.64 | 3.14 | 8 | 764 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 28.6 | 19.8 | 18.6 | 48.93 | 0.28 | 5 | 916 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 28.4 | 20.1 | 19.3 | 48.32 | 0.28 | 5 | 2024 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 28.4 | 20.5 | 20.0 | 48.16 | 0.29 | 2 | 1932 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 28.5 | 20.2 | 19.9 | 48.73 | 0.28 | 4 | 2008 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 71.6 | 15.9 | 13.8 | 59.09 | 0.84 | 136 | 1520 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 67.0 | 15.4 | 13.3 | 60.69 | 0.84 | 165 | 1273 |
| 44 | [HighEnd Shader](#highend-shader) | Showcase | 31.9 | 14.3 | 12.1 | 65.02 | 0.83 | 137 | 24 |
| 45 | [HighEnd Shader + PBR Textures](#highend-shader--pbr-textures) | Showcase | 30.3 | 16.5 | 15.3 | 58.47 | 0.76 | 25 | 2130 |

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

Category: **Particles**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `249.10`, min `24.39`, p50 `116.93`, p95 `1006.10`, p99 `1239.03`, 1%low `33.69`, 0.1%low `24.90`, std `321.24`

**Frame time (ms)**  avg `10.08`, p50 `8.55`, p95 `21.12`, p99 `24.55`, p99.9 `37.29`, max `41.00`

**Client tick (ms)**  avg `0.79`, p95 `1.35`, max `4.37`

**Memory**  start `682 MB`, end `998 MB`, peak `1081 MB`, GC `91 events / 277 ms`

**FPS over sampling window (ASCII):**

```
415.5 |                                                               █                
390.5 |                                                               █                
365.5 |                                               █               █                
340.5 |                                               █       █       █    ██          
315.5 |                                               ██      █       █    ██          
290.5 |                █            █  █       █   █ ███     ██     ███  █ ██   █    █ 
265.5 |                █    ██      █  █  ████████ ████████  ███  █ ██████████ ██   ██ 
240.6 |     █       ██ █    ██ ████ █  ███████████ ████████ █████ █ ██████████████ ████
215.6 |   █ █ █ ██  ██████████ ███████████████████ ████████████████████████████████████
190.6 |   █████████ ██████████ ████████████████████████████████████████████████████████
165.6 | █ █████████████████████████████████████████████████████████████████████████████
140.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███████  105
   1 ms | ███████████████████  268
   2 ms | ██  35
   3 ms | █  19
   4 ms |   4
   5 ms | █  9
   6 ms | ██  31
   7 ms | ██████████  143
   8 ms | ████████████████████████████████████████  568
   9 ms | ███████████  160
  10 ms | ██  23
  11 ms | █  8
  12 ms |   4
  13 ms |   7
  14 ms | █  18
  15 ms | ████  53
  16 ms | ███████  104
  17 ms | ████████  117
  18 ms | █████  77
  19 ms | █████  78
  20 ms | ███  49
  21 ms | ███  45
  22 ms | ██  26
  23 ms | █  9
  24 ms |   7
  25 ms |   5
  26 ms |   2
  27 ms |   1
  28 ms |   2
  30 ms |   1
  33 ms |   1
  35 ms |   1
  37 ms |   2
  39 ms |   1
  40 ms |   1
```

**Per-particle stage breakdown:**

> _Approximate split: frames are bucketed evenly across stages by index, not aligned to the actual tick boundary. Use as a relative comparison, not an absolute per-stage measurement._

| Stage | Particles spawned | Frames captured | Avg FPS | p99 frame ms |
|---|---:|---:|---:|---:|
| `dragon_breath` | 160 | 248 | 190.6 | 23.73 |
| `dripping_water` | 240 | 248 | 225.3 | 25.68 |
| `flame` | 160 | 248 | 236.9 | 22.28 |
| `smoke` | 160 | 248 | 259.0 | 24.71 |
| `sculk_charge_pop` | 240 | 248 | 276.5 | 22.93 |
| `ALL_TOGETHER` | 1680 | 248 | 257.7 | 22.24 |
| `portal` | 160 | 248 | 295.5 | 22.18 |
| `end_rod` | 240 | 248 | 251.3 | 26.22 |

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `0.00`
- `particles_stage_dragon_breath` = `160.00`
- `entity_count_sample_start` = `1.00`
- `particle_stage_count` = `8.00`
- `particles_total` = `3040.00`
- `particles_stage_dripping_water` = `240.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `particles_stage_flame` = `160.00`
- `particles_stage_smoke` = `160.00`
- `fps_1pct_low` = `33.69`
- `particles_stage_sculk_charge_pop` = `240.00`
- `particles_stage_ALL_TOGETHER` = `1680.00`
- `particles_stage_portal` = `160.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `24.90`
- `fps_harmonic_avg` = `99.24`
- `seed` = `2503.00`
- `particles_stage_end_rod` = `240.00`
- `preset_quick` = `1.00`
- `particle_stage_ticks` = `50.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `104.47`, min `25.09`, p50 `113.15`, p95 `139.94`, p99 `528.79`, 1%low `37.88`, 0.1%low `29.11`, std `72.77`

**Frame time (ms)**  avg `12.20`, p50 `8.84`, p95 `21.65`, p99 `23.90`, p99.9 `28.03`, max `39.85`

**Client tick (ms)**  avg `0.79`, p95 `1.36`, max `1.96`

**Memory**  start `953 MB`, end `818 MB`, peak `1137 MB`, GC `63 events / 238 ms`

**FPS over sampling window (ASCII):**

```
157.4 |                             █                                                  
150.8 |                             █                                             █    
144.1 |                             █                                             █    
137.4 |                             █                                             █  █ 
130.8 |                           █ █                     █                       █  █ 
124.1 |                           █ █         ██       █  █      █      █        ██  █ 
117.5 |   █ ██     █         █    █ █         ██      ██  █      █      █    █ █ ██ ███
110.8 |   █ ██     █  █     ██    █ █ █  █    ██      ██  █   █  █      █ █  █ █ ██ ███
104.1 |█  ████ █   █  █ █   ██ ██ █ █ █  █  █ ██      ██  █  ██  █      █ █ ██ █ ██ ███
 97.5 |███████ █ █ █ █████ ██████ ██████ ██ █ ██  ██ ████ █  ██████ ██  █ █ ██ ████████
 90.8 |███████████████████ ██████████████████████████████████████████████ █████████████
 84.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | ██  22
   2 ms | █  15
   3 ms |   2
   4 ms |   1
   5 ms |   2
   6 ms | ██  27
   7 ms | ███████████████  214
   8 ms | ████████████████████████████████████████  583
   9 ms | ██████████  139
  10 ms | █  18
  11 ms | █  9
  12 ms |   3
  13 ms |   1
  14 ms |   3
  15 ms | ██  25
  16 ms | █████  75
  17 ms | █████████  126
  18 ms | ███████  109
  19 ms | ██████  92
  20 ms | ████  55
  21 ms | ████  52
  22 ms | ██  26
  23 ms | ██  27
  24 ms |   4
  25 ms |   3
  26 ms |   4
  27 ms |   1
  28 ms |   1
  39 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `29.11`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `37.88`
- `preset_long` = `0.00`
- `seed` = `6121.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `104.00`
- `fps_harmonic_avg` = `81.95`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23104 ms  |  Sample ticks: 400

**FPS**  avg `100.07`, min `19.46`, p50 `111.30`, p95 `140.29`, p99 `492.29`, 1%low `21.25`, 0.1%low `19.46`, std `71.53`

**Frame time (ms)**  avg `13.68`, p50 `8.98`, p95 `33.29`, p99 `44.47`, p99.9 `50.26`, max `51.40`

**Client tick (ms)**  avg `0.75`, p95 `1.16`, max `1.75`

**Memory**  start `847 MB`, end `1085 MB`, peak `1405 MB`, GC `43 events / 176 ms`

**FPS over sampling window (ASCII):**

```
150.3 |                                                  █                             
139.1 |             █                   █                █ █                           
128.0 |   █ █       █     █          █  ██        █      █ █        █                  
116.8 |  ██ █  █   ██   ███  █ █     █  ██   █    █   █  █ █    █   █ ██     █         
105.6 |█ █████ █   ██   ███ ████     █  ██   █    ███ ██ █ █    ██  █ ███   ██         
 94.5 |██████████████████████████ ██████████ ███ █████████████████████████████████     
 83.3 |███████████████████████████████████████████████████████████████████████████     
 72.1 |████████████████████████████████████████████████████████████████████████████    
 61.0 |████████████████████████████████████████████████████████████████████████████    
 49.8 |████████████████████████████████████████████████████████████████████████████    
 38.6 |████████████████████████████████████████████████████████████████████████████    
 27.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  13
   2 ms | ██  20
   3 ms |   2
   4 ms |   1
   5 ms |   3
   6 ms | ██  22
   7 ms | ██████████████  178
   8 ms | ████████████████████████████████████████  495
   9 ms | █████████  109
  10 ms | █  10
  11 ms | █  7
  12 ms |   2
  13 ms |   1
  14 ms | █  7
  15 ms | ██  30
  16 ms | ███████  90
  17 ms | █████████  111
  18 ms | ██████  71
  19 ms | █████  60
  20 ms | ████  51
  21 ms | ███  39
  22 ms | ██  19
  23 ms | █  15
  24 ms |   6
  25 ms |   3
  26 ms |   1
  27 ms |   1
  32 ms | █  14
  33 ms | ██  21
  34 ms | █  13
  35 ms | █  7
  36 ms |   3
  37 ms |   3
  38 ms |   4
  39 ms |   1
  40 ms |   2
  41 ms |   3
  42 ms |   2
  43 ms |   2
  44 ms | █  7
  45 ms |   3
  46 ms |   2
  47 ms |   3
  48 ms |   1
  49 ms |   1
  51 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `201.00`
- `fps_0p1pct_low` = `19.46`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `201.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `21.25`
- `preset_long` = `0.00`
- `seed` = `6133.00`
- `entities_spawned` = `200.00`
- `preload_duration_ms` = `38.00`
- `fps_harmonic_avg` = `73.12`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 23074 ms  |  Sample ticks: 400

**FPS**  avg `28.52`, min `17.15`, p50 `29.13`, p95 `43.27`, p99 `48.72`, 1%low `18.94`, 0.1%low `17.15`, std `5.53`

**Frame time (ms)**  avg `36.16`, p50 `34.33`, p95 `46.43`, p99 `48.62`, p99.9 `55.90`, max `58.30`

**Client tick (ms)**  avg `0.71`, p95 `0.89`, max `2.29`

**Memory**  start `649 MB`, end `1388 MB`, peak `1396 MB`, GC `14 events / 58 ms`

**FPS over sampling window (ASCII):**

```
 32.8 |               █        █   █                                                   
 32.2 |               █        █   █  █ █                     █                        
 31.6 |               █        █   █  █ █         █           █ █                      
 31.0 |               █        █   █  █ █ █       █           █ █                      
 30.3 |     █         █   █    █   ██ █ ███   █ █ █         █ █ █                █     
 29.7 |  █  █  █      █   █    █   ████ ███   █ █ █   █   █ █ █ █         █      █     
 29.1 |  █  █  █      █   █    ██  ████ ███   █ █ █   █  ██ █ █ █    ██   ██     █     
 28.5 |  ████  █      █   █    ███ ████ ███   █ █ █  ██  ██ █ █ █ █ ███   ██  █  ███  █
 27.8 |███████ ██ █████ █ ██  ████ ████ ███ ███ █ ██ ███ ██████ ███████   █████  ███ ██
 27.2 |███████ ████████ █████ █████████ ███ ███ █ ██ ██████████████████ ████████ ██████
 26.6 |██████████████████████ █████████ ███████ ███████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms | █  4
  20 ms | █  3
  21 ms | ███  8
  22 ms | ███  11
  23 ms | ██  5
  25 ms |   1
  31 ms | ██  5
  32 ms | ████████████████████████  78
  33 ms | ████████████████████████████████████████  128
  34 ms | ███████████████████████  74
  35 ms | ██████████  32
  36 ms | ███████  22
  37 ms | ███  11
  38 ms | ████  12
  39 ms | ████  13
  40 ms | ██████  18
  41 ms | ██████  19
  42 ms | ████  13
  43 ms | ███████  23
  44 ms | ██████  18
  45 ms | ███████  22
  46 ms | █████  15
  47 ms | ██  7
  48 ms | ██  5
  49 ms |   1
  52 ms |   1
  53 ms | █  2
  58 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `151.00`
- `fps_0p1pct_low` = `17.15`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `151.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `18.94`
- `preset_long` = `0.00`
- `seed` = `6151.00`
- `entities_spawned` = `150.00`
- `preload_duration_ms` = `33.00`
- `fps_harmonic_avg` = `27.65`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `28.21`, min `19.86`, p50 `29.05`, p95 `31.11`, p99 `47.03`, 1%low `20.55`, 0.1%low `19.86`, std `4.92`

**Frame time (ms)**  avg `36.37`, p50 `34.43`, p95 `46.12`, p99 `47.62`, p99.9 `49.47`, max `50.34`

**Client tick (ms)**  avg `0.69`, p95 `1.00`, max `1.57`

**Memory**  start `819 MB`, end `763 MB`, peak `1411 MB`, GC `15 events / 59 ms`

**FPS over sampling window (ASCII):**

```
 33.5 |                                                                           █    
 32.7 |                                                                           █    
 32.0 |                                                                           █    
 31.2 |                      █                     █                          █   █    
 30.5 |     █    █           █ █  █           █    ██                        ██   █    
 29.8 |  █  █    █         █ █ █  █           █    ██ █      █               ██  ██    
 29.0 | ██ ██   ██   █     █ ███  █   █  █    █    ██ █      █ █     █   █   ██  ██   █
 28.3 | █████  ███ █ █ █ ███ ███ ███  █  █ █  █ █  ████      ███ █   █  ██ █ ███ ████ █
 27.5 | ██████████ █ ███ ███ ████████ ████ ██ ████ █████████ ███ ███████████ ███ ██████
 26.8 |███████████ █████ ███ ████████ ████ ███████ █████████████████████████████ ██████
 26.1 |███████████████████████████████████ ████████████████████████████████████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms | █  3
  21 ms | ███  9
  22 ms | ██  8
  23 ms | █  2
  31 ms | █  4
  32 ms | ████████████████████████  79
  33 ms | ████████████████████████████████████████  133
  34 ms | █████████████████████  71
  35 ms | █████████  31
  36 ms | ███████  23
  37 ms | ██  8
  38 ms | ███  9
  39 ms | ██████  19
  40 ms | ███████  22
  41 ms | ██████  21
  42 ms | █████  18
  43 ms | ██████  20
  44 ms | ██████  19
  45 ms | ██████  19
  46 ms | █████  18
  47 ms | ███  9
  48 ms | █  3
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `251.00`
- `fps_0p1pct_low` = `19.86`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `251.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.55`
- `preset_long` = `0.00`
- `seed` = `6163.00`
- `entities_spawned` = `250.00`
- `preload_duration_ms` = `26.00`
- `fps_harmonic_avg` = `27.50`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `28.60`, min `19.62`, p50 `29.06`, p95 `46.09`, p99 `48.90`, 1%low `20.17`, 0.1%low `19.62`, std `5.94`

**Frame time (ms)**  avg `36.20`, p50 `34.41`, p95 `46.31`, p99 `48.40`, p99.9 `50.32`, max `50.98`

**Client tick (ms)**  avg `0.50`, p95 `0.64`, max `1.02`

**Memory**  start `836 MB`, end `1218 MB`, peak `1368 MB`, GC `15 events / 64 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |                             █       █                      █                   
 32.4 |                             █       █                      █         █         
 31.7 |             █            █  █       █    █                 █         █         
 31.0 |     █       ██           █  █    █  █    █       █       █ █         █         
 30.3 |   █ █       ██  ██       █  █ █  █  █    █       █   █  ██ █         ██      █ 
 29.6 |   █ █       ██  ██  ██  ██ ██ █  █  █ █  █       █   █  ██ █    ██  ███      █ 
 28.9 |   █ ██ █    ██  ██  ██  ██ ██ ██ █  █ ██ ██      █   █  ██ ██   ███ ████    ██ 
 28.1 | ███ ██ ███  ██  ██  ███ ██ ██ ██ █  ███████  █  ██ ████ ██ ██   ███ █████   ██ 
 27.4 | ███████████ ██ ███████████ ██ █████ ████████ ██████████ █████ ███████████  ███ 
 26.7 |████████████ ██ ███████████ ████████ ███████████████████ ███████████████████████
 26.0 |████████████ ███████████████████████ ███████████████████ ███████████████████████
 25.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms | █  2
  20 ms | ███  11
  21 ms | ██████  18
  22 ms | ██  6
  23 ms |   1
  27 ms | █  2
  28 ms |   1
  29 ms |   1
  30 ms |   1
  31 ms | █  2
  32 ms | ████████████████████  65
  33 ms | ████████████████████████████████████████  129
  34 ms | ████████████████  53
  35 ms | █████████  28
  36 ms | ██████  18
  37 ms | ███████  24
  38 ms | ████████  25
  39 ms | ██████  20
  40 ms | ██████  19
  41 ms | █████  15
  42 ms | ██████  18
  43 ms | ██████  19
  44 ms | █████  16
  45 ms | ████████  27
  46 ms | ████  12
  47 ms | ████  12
  48 ms | █  3
  49 ms | █  3
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `101.00`
- `fps_0p1pct_low` = `19.62`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `101.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.17`
- `preset_long` = `0.00`
- `seed` = `6173.00`
- `entities_spawned` = `100.00`
- `preload_duration_ms` = `98.00`
- `fps_harmonic_avg` = `27.63`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 23096 ms  |  Sample ticks: 400

**FPS**  avg `28.83`, min `18.72`, p50 `29.13`, p95 `46.27`, p99 `50.34`, 1%low `20.24`, 0.1%low `18.72`, std `6.53`

**Frame time (ms)**  avg `36.13`, p50 `34.33`, p95 `46.64`, p99 `48.29`, p99.9 `51.15`, max `53.41`

**Client tick (ms)**  avg `0.69`, p95 `0.95`, max `2.65`

**Memory**  start `1242 MB`, end `1201 MB`, peak `1405 MB`, GC `16 events / 63 ms`

**FPS over sampling window (ASCII):**

```
 33.2 |                             █                         █                        
 32.4 |                     █       █            █            █                        
 31.6 |   █                 █   █   █            █          █ █ █     █                
 30.8 |   █ ██       █      █   █   █         █  █     █ █  █ █ █     █                
 30.1 |   █ ███      ██     █  ██   █ █ █   ██████ ██ ██ ██ █ █ █     █        █       
 29.3 |   █ ████ █   ██ █   █ ███   █ █ ██  ██████ ██ ██ ██ █ █ █   █ █  █ █   █ █     
 28.5 | █ █ ████ █   ████   █████   █ █ ██  ██████ █████ ██ ███ █ █ █ █  █ ██ ██ █  █ █
 27.7 |████ ███████  ████ ███████ ███ ████  ██████ ████████ ███ █ █ █ ██ ████ ██ ██ █ █
 26.9 |████████████  █████████████████████ ███████ ████████████ █████████████ █████ ███
 26.2 |█████████████ █████████████████████ ███████ ██████████████████████████ █████ ███
 25.4 |███████████████████████████████████ ████████████████████████████████████████████
 24.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms | █  2
  19 ms | ██  6
  20 ms | ████  11
  21 ms | █████  15
  22 ms | ██  7
  23 ms | █  4
  26 ms |   1
  27 ms | █  2
  28 ms | █  2
  29 ms |   1
  31 ms | ██  7
  32 ms | ███████████████████████████  78
  33 ms | ████████████████████████████████████████  117
  34 ms | ██████████████████  53
  35 ms | ██████  18
  36 ms | ████  13
  37 ms | █████████  26
  38 ms | ████████  22
  39 ms | ███  10
  40 ms | ██████  17
  41 ms | ██  6
  42 ms | ████████  23
  43 ms | ██████  17
  44 ms | ████████  23
  45 ms | ███████████  32
  46 ms | ██████  17
  47 ms | █████  16
  48 ms | ██  5
  49 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `301.00`
- `fps_0p1pct_low` = `18.72`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `301.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `20.24`
- `preset_long` = `0.00`
- `seed` = `6197.00`
- `entities_spawned` = `300.00`
- `preload_duration_ms` = `42.00`
- `fps_harmonic_avg` = `27.68`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `28.85`, min `17.74`, p50 `28.67`, p95 `46.62`, p99 `51.63`, 1%low `19.18`, 0.1%low `17.74`, std `7.20`

**Frame time (ms)**  avg `36.33`, p50 `34.88`, p95 `46.49`, p99 `49.08`, p99.9 `56.25`, max `56.38`

**Client tick (ms)**  avg `1.09`, p95 `1.39`, max `5.24`

**Memory**  start `715 MB`, end `857 MB`, peak `1415 MB`, GC `16 events / 68 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                                    █                                           
 33.9 |                      █             █                                           
 33.1 |                     ██  █          █                            █        █   █ 
 32.3 |                     ██  █          █                            █        █   █ 
 31.5 |      █              ██  █          █                            █        █   ██
 30.7 |      █       █   █  ██  █          ██        █                  █        █   ██
 29.9 |   █  █       █ █ █  ██ ██    █    ████       █             █ █  ██       █ █ ██
 29.1 |   █  █   █  ██ ███  ██ ███   █  ██████ ██ █  ██     ██   █ █ █  ██  ████ █ █ ██
 28.4 |█ ██  █   █  ██ ███████ ████  █  █████████ █  ██    ███████ █ █  ███ ████ ███ ██
 27.6 |█ ██  █ ███████ █████████████ ██ █████████ █ ████ █ ███████ █ █  ███ ████ ███ ██
 26.8 |████ ███████████████████████████ ███████████ ████ █████████ ████ ███████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms | █  1
  14 ms | █  1
  16 ms | █  1
  18 ms | █  2
  19 ms | ██  4
  20 ms | ██████  11
  21 ms | ███████  13
  22 ms | ████  8
  23 ms | ████  7
  24 ms | ██  4
  25 ms | ██  4
  27 ms | █  1
  30 ms | █  1
  31 ms | ██████████  18
  32 ms | █████████████████████████████████████  66
  33 ms | ████████████████████████████████████████  72
  34 ms | █████████████████████████████████████  66
  35 ms | █████████████  24
  36 ms | ███████████  20
  37 ms | ██████████  18
  38 ms | ████████  15
  39 ms | ████████  15
  40 ms | ██████████  18
  41 ms | ███████████  20
  42 ms | █████████████  23
  43 ms | ████████████  21
  44 ms | ██████████████  25
  45 ms | ████████████████  29
  46 ms | █████████████  24
  47 ms | ██████  10
  48 ms | █  2
  49 ms | ██  3
  50 ms | █  2
  56 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `17.74`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `19.18`
- `preset_long` = `0.00`
- `seed` = `6203.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `25.00`
- `fps_harmonic_avg` = `27.52`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### XP orbs ×500 ring (`entity_xp`)

Category: **Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `29.57`, min `15.95`, p50 `27.65`, p95 `49.70`, p99 `57.75`, 1%low `16.46`, 0.1%low `15.95`, std `9.01`

**Frame time (ms)**  avg `36.37`, p50 `36.17`, p95 `51.03`, p99 `58.95`, p99.9 `62.15`, max `62.70`

**Client tick (ms)**  avg `2.97`, p95 `3.92`, max `7.11`

**Memory**  start `932 MB`, end `890 MB`, peak `1406 MB`, GC `19 events / 67 ms`

**FPS over sampling window (ASCII):**

```
 35.9 |                                                                     █          
 34.9 |                                                                     █          
 33.9 |           █               █                                 █   █   █          
 33.0 |█          █               █        █      █                 █   █   ██     █  █
 32.0 |█  █  █    █       █       █       ██  █   █                 █   █   ██  █  █  █
 31.0 |█  █  █    ██    █ █  ██   █ █  ██ ██  █ █ █ █      █   █ █  █   █   ██  █  █  █
 30.0 |█ ██ ██    ████  ███  ██   █ █  ██ ██  █ ███ █      █   ████ ██  █   ██  █  █  █
 29.1 |█ █████    █████ ███ ███  ████████ ██  █████ ██   █ █ █ ████ ██  █   ██  █  █  █
 28.1 |███████ █ ██████ ███████ █████████ █████████ ████ █ █ █ ███████  █ █ ██ ███ ██ █
 27.1 |███████ ███████████████████████████████████████████ ███████████████████ ███ ████
 26.1 |███████████████████████████████████████████████████ ███████████████████ ████████
 25.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms | █  1
  14 ms | █  1
  16 ms | ██  3
  17 ms | ████  6
  18 ms | ██████  9
  19 ms | ████  6
  20 ms | ███████████  15
  21 ms | ████████  12
  22 ms | ████  6
  23 ms | ██████  8
  24 ms | ███  4
  26 ms | ██  3
  27 ms | █  1
  28 ms | █  1
  29 ms | ████  6
  30 ms | ████████████████████████████████████████  57
  31 ms | ███████████  16
  32 ms | █████████████  19
  33 ms | █████████████████████████████████  47
  34 ms | ███████████████  21
  35 ms | ██████████████  20
  36 ms | █████████████████████████████████████  53
  37 ms | ████████████████████  28
  38 ms | ███████████  16
  39 ms | ████████  11
  40 ms | ████████████  17
  41 ms | █████████████  18
  42 ms | ███████  10
  43 ms | ███████████████  22
  44 ms | ███████████████  22
  45 ms | ███████████  16
  46 ms | ████████████  17
  47 ms | ████████  11
  48 ms | ██████  9
  49 ms | ████  5
  50 ms | ███  4
  51 ms | █████  7
  53 ms | ███  4
  54 ms | ██  3
  55 ms | █  2
  56 ms | ███  4
  57 ms | █  1
  58 ms | █  2
  59 ms | █  2
  60 ms | █  1
  61 ms | █  2
  62 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `part` = `1.00`
- `entity_count_sample_end` = `501.00`
- `fps_0p1pct_low` = `15.95`
- `preset_full` = `0.00`
- `entity_count_sample_start` = `501.00`
- `preload_chunks` = `81.00`
- `fps_1pct_low` = `16.46`
- `preset_long` = `0.00`
- `seed` = `6217.00`
- `entities_spawned` = `500.00`
- `preload_duration_ms` = `41.00`
- `fps_harmonic_avg` = `27.50`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 23094 ms  |  Sample ticks: 400

**FPS**  avg `30.80`, min `14.83`, p50 `27.53`, p95 `54.74`, p99 `64.61`, 1%low `15.58`, 0.1%low `14.83`, std `12.94`

**Frame time (ms)**  avg `36.49`, p50 `36.33`, p95 `55.13`, p99 `60.74`, p99.9 `66.84`, max `67.42`

**Client tick (ms)**  avg `3.69`, p95 `6.10`, max `10.38`

**Memory**  start `910 MB`, end `1227 MB`, peak `1424 MB`, GC `24 events / 87 ms`

**FPS over sampling window (ASCII):**

```
 41.5 |                                                        █                       
 40.0 |                                                        █ █                     
 38.5 |                                                        █ █                     
 37.0 |                           █                            █ █                     
 35.5 |                           █                            █ █      █      █       
 34.0 |         █              █  █        ███ █     █        ██ █      █      █  █    
 32.5 |██       ██           █ █  █        ███ ██  █ █    █ █ ██ █  █   █      ██ █    
 31.0 |██       ███     █  █ █ █  █ █ █    ███ ██  ███    ███ ██ █  ███ █      ██ █  █ 
 29.5 |██ █ █ ██████  █ █  █ █ █ ██ █ █ █ ████ ██  █████  ████████ ██████ ██   ████ ██ 
 28.0 |███████████████████ ██████████ ████████████ ███████████████ ████████████████████
 26.5 |███████████████████ ███████████████████████ ████████████████████████████████████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms | █  1
   9 ms | █  1
  11 ms | █  1
  12 ms | █  1
  15 ms | ████  3
  16 ms | ████████  6
  17 ms | ██████████████  11
  18 ms | ██████████████  11
  19 ms | ████████████████  13
  20 ms | ███████████  9
  21 ms | █████████████████████  17
  22 ms | ████████████████  13
  23 ms | █████████  7
  24 ms | █████████████  10
  25 ms | ████████  6
  26 ms | ██████  5
  27 ms | ███  2
  28 ms | █████████████  10
  29 ms | ████████████████████  16
  30 ms | █████████████████████  17
  31 ms | ████████████████████  16
  32 ms | ███████████████████████  18
  33 ms | ███████████████████████████████████  28
  34 ms | ██████████████████  14
  35 ms | ██████████████████████████████████  27
  36 ms | ████████████████████████████████████████  32
  37 ms | ████████████████████████  19
  38 ms | █████████████████████  17
  39 ms | ███████████████████████  18
  40 ms | █████████████  10
  41 ms | ███████████████████████  18
  42 ms | ██████████  8
  43 ms | ████████████████████  16
  44 ms | █████████████████████  17
  45 ms | ████████████████████████  19
  46 ms | ██████████████████  14
  47 ms | ███████████████████  15
  48 ms | ██████████  8
  49 ms | ████████████████  13
  50 ms | ███████████  9
  51 ms | ██████  5
  52 ms | ████████  6
  53 ms | ██████████████  11
  54 ms | █  1
  55 ms | ██████  5
  56 ms | ██████  5
  57 ms | ████████  6
  58 ms | ███  2
  59 ms | ████  3
  60 ms | █████  4
  61 ms | █  1
  64 ms | █  1
  66 ms | █  1
  67 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_quick` = `1.00`
- `entity_count_delta` = `880.00`
- `part` = `1.00`
- `items_alive_avg` = `1230.00`
- `seed` = `6287.00`
- `items_alive_p95` = `1560.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `items_alive_p50` = `1240.00`
- `entity_count_sample_end` = `1561.00`
- `entity_count_sample_start` = `681.00`
- `items_alive_max` = `1560.00`
- `waves_spawned` = `12.00`
- `items_spawned` = `1560.00`
- `fps_1pct_low` = `15.58`
- `items_merged_estimate` = `0.00`
- `fps_harmonic_avg` = `27.40`
- `preload_duration_ms` = `58.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `14.83`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 23124 ms  |  Sample ticks: 400

**FPS**  avg `28.45`, min `15.71`, p50 `28.99`, p95 `41.64`, p99 `50.00`, 1%low `17.32`, 0.1%low `15.71`, std `5.64`

**Frame time (ms)**  avg `36.33`, p50 `34.49`, p95 `46.38`, p99 `51.35`, p99.9 `62.89`, max `63.66`

**Client tick (ms)**  avg `0.97`, p95 `1.23`, max `1.69`

**Memory**  start `1235 MB`, end `821 MB`, peak `1432 MB`, GC `22 events / 101 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |                                                              █                 
 32.5 |                                                              █                 
 31.8 |                                       █                      █                 
 31.2 |          █                            █                      █               █ 
 30.5 |█  ██     █                 ██    █    █      █         █     █        █      █ 
 29.9 |█  ██     █   █           █ ██    █    █      █       █ █     █ █      ██     ██
 29.2 |█  ██ █   █  ██      █    █ ██ █  █   ██      █       █ █     █ █      ██     ██
 28.6 |██ ██ ███ █ ███      ██  ██ ██ █  ██  ███  █ ██  █    █ █     █ ████   ██     ██
 27.9 |██ ██ ███ ██████ █   ███ ██ ██ █████  ███  █████ ██   ███ ██  ██████  ███   █ ██
 27.3 |█████ ███ ██████████████ ██ █████████ ████ █████ ██ █████ █████████████████ █ ██
 26.6 |█████████ ██████████████████████████████████████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  16 ms |   1
  19 ms | ██  5
  20 ms | █  2
  21 ms | ███  8
  22 ms | ███  9
  23 ms | █  2
  24 ms | ███  7
  30 ms | █  2
  31 ms | ███  8
  32 ms | ████████████████████████████████████████  107
  33 ms | ██████████████████████████████  81
  34 ms | █████████████████████████████  77
  35 ms | ███████████  29
  36 ms | ██████  15
  37 ms | ███████  18
  38 ms | ██████  16
  39 ms | ██████  15
  40 ms | ██████  15
  41 ms | ██████  16
  42 ms | █████████  23
  43 ms | ███████  20
  44 ms | █████  14
  45 ms | █████████  25
  46 ms | █████  13
  47 ms | ████  11
  48 ms |   1
  49 ms | █  3
  50 ms |   1
  51 ms | █  2
  54 ms |   1
  55 ms |   1
  58 ms |   1
  62 ms |   1
  63 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `seed` = `6271.00`
- `entity_count_sample_start` = `151.00`
- `entity_count_sample_end` = `151.00`
- `preload_chunks` = `81.00`
- `preset_long` = `0.00`
- `part` = `1.00`
- `fps_0p1pct_low` = `15.71`
- `preset_quick` = `1.00`
- `preset_full` = `0.00`
- `fps_harmonic_avg` = `27.52`
- `fps_1pct_low` = `17.32`
- `preload_duration_ms` = `42.00`
- `zombies_spawned` = `150.00`
- `entity_count_delta` = `0.00`
- `neighbour_updates` = `0.00`
- `pillars_built` = `48.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `28.33`, min `16.34`, p50 `29.15`, p95 `31.09`, p99 `48.41`, 1%low `18.88`, 0.1%low `16.34`, std `5.31`

**Frame time (ms)**  avg `36.28`, p50 `34.31`, p95 `45.69`, p99 `47.73`, p99.9 `58.38`, max `61.21`

**Client tick (ms)**  avg `0.50`, p95 `0.64`, max `1.10`

**Memory**  start `899 MB`, end `1445 MB`, peak `1460 MB`, GC `16 events / 69 ms`

**FPS over sampling window (ASCII):**

```
 33.3 |             █                                                                  
 32.7 |             █                                                                  
 32.0 |             █          █                                                       
 31.3 |      █      █          █                        █                              
 30.7 |     ██      █         ██ █                 ██   █      ██                      
 30.0 | █   ███  █  █         ██ ██                ██   █      ██    █                 
 29.3 | █   ███  █  █      █  ██ ██            █   ██   █      ██    █    █       █    
 28.6 | █   ███  █ ██      █  ██ ██        █   ██  ██  ██   █  ██    █   ████    ██    
 28.0 | █  ████ ██ █████   █  █████    ██  ██  ██ ████ ███ ██████ █  ██  ████  █ ██  █ 
 27.3 | ██ ██████████████ ███ ████████ ██ ████ ███████ ██████████ ██ ██ ███████████████
 26.6 |██████████████████ ████████████████████ ████████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms |   1
  15 ms |   1
  18 ms |   1
  20 ms | ██  6
  21 ms | ██  9
  22 ms |   1
  23 ms | █  3
  24 ms | █  2
  31 ms | █  2
  32 ms | █████████████████  68
  33 ms | ████████████████████████████████████████  157
  34 ms | ██████████████  55
  35 ms | █████████  34
  36 ms | ███  13
  37 ms | ██████  22
  38 ms | █████  20
  39 ms | ████  17
  40 ms | █████  20
  41 ms | █████  21
  42 ms | ████  15
  43 ms | █████  20
  44 ms | █████  20
  45 ms | █████  20
  46 ms | ███  11
  47 ms | ██  7
  49 ms |   1
  51 ms | █  2
  56 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `workstations_placed` = `40.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `scheduled_block_ticks` = `0.00`
- `seed` = `6299.00`
- `doors_placed` = `16.00`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `81.00`
- `entity_count_sample_start` = `81.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `18.88`
- `neighbour_updates` = `0.00`
- `villagers_spawned` = `80.00`
- `fps_harmonic_avg` = `27.56`
- `preload_duration_ms` = `22.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `16.34`
- `beds_placed` = `40.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `30.96`, min `15.13`, p50 `27.84`, p95 `54.93`, p99 `60.64`, 1%low `15.83`, 0.1%low `15.13`, std `13.14`

**Frame time (ms)**  avg `36.19`, p50 `35.91`, p95 `56.54`, p99 `60.35`, p99.9 `65.18`, max `66.10`

**Client tick (ms)**  avg `3.66`, p95 `5.55`, max `20.33`

**Memory**  start `1348 MB`, end `1273 MB`, peak `1451 MB`, GC `22 events / 92 ms`

**FPS over sampling window (ASCII):**

```
 58.1 | █                                                                              
 55.1 | █                                                                              
 52.1 | █                                                                              
 49.1 | █                                                                              
 46.1 | █                                                                              
 43.1 | █                                                                              
 40.1 | █                                                                              
 37.1 | █ █     █             █                                   █                    
 34.1 | █ ███   █ █   ██   █  █     █      ██   █  █   █      ███ █   █      █         
 31.1 |████████ █████████ █████ ██ ██ █    ████ █  █ ████ ██  ███ ██  ██ █ █ █████  ███
 28.1 |██████████████████████████████████████████████████████████████ █████████████████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
  15 ms | ███  3
  16 ms | █████  5
  17 ms | ███████████████  15
  18 ms | ████████  8
  19 ms | ████████████  12
  20 ms | ██████████████  14
  21 ms | █████████████████  17
  22 ms | ██████████  10
  23 ms | ████████████  12
  24 ms | ████████  8
  25 ms | █████████  9
  26 ms | ███████  7
  27 ms | █████████  9
  28 ms | ██████  6
  29 ms | █████████████████  17
  30 ms | ████████████████████  21
  31 ms | ████████████  12
  32 ms | ███████████████  15
  33 ms | ████████████████████████████████████████  41
  34 ms | ██████████████████  18
  35 ms | ███████████████████  19
  36 ms | ███████████████████████████████████  36
  37 ms | ██████████████  14
  38 ms | ████████████████████  21
  39 ms | ██████████  10
  40 ms | ████████████  12
  41 ms | ███████████  11
  42 ms | ████████████████  16
  43 ms | █████████████  13
  44 ms | ██████████████  14
  45 ms | █████████████████████  22
  46 ms | ██████████  10
  47 ms | ████████████  12
  48 ms | ██████████████████  18
  49 ms | ███  3
  50 ms | ██████  6
  51 ms | ███████  7
  52 ms | █████  5
  53 ms | ███  3
  54 ms | ████  4
  55 ms | ███  3
  56 ms | █████████████  13
  57 ms | ██████████  10
  58 ms | ██  2
  59 ms | ███  3
  60 ms | █  1
  61 ms | █  1
  62 ms | ██  2
  64 ms | █  1
  66 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `explosions_count` = `403.00`
- `tnt_active_p95` = `150.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.18`
- `entity_count_delta` = `-187.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `205.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `15.83`
- `fps_harmonic_avg` = `27.64`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `139.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `15.13`
- `seed` = `3539.00`
- `tnt_active_p50` = `25.00`
- `entity_count_sample_start` = `188.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23127 ms  |  Sample ticks: 400

**FPS**  avg `29.32`, min `16.16`, p50 `28.21`, p95 `48.13`, p99 `54.02`, 1%low `17.09`, 0.1%low `16.16`, std `8.11`

**Frame time (ms)**  avg `36.23`, p50 `35.44`, p95 `48.91`, p99 `55.55`, p99.9 `61.56`, max `61.90`

**Client tick (ms)**  avg `2.42`, p95 `4.23`, max `6.85`

**Memory**  start `1396 MB`, end `1493 MB`, peak `1526 MB`, GC `19 events / 76 ms`

**FPS over sampling window (ASCII):**

```
 37.1 |                                                 █                              
 36.0 |                                                 █                              
 35.0 |                                                 █                              
 33.9 |           █ █                                   █                              
 32.9 |     █     █ █    █                              █                              
 31.8 |█    ██    █ █    █ █      █                     █          █    █   █          
 30.8 |████ ██    █ █ █  █ █      █  █       █          ██    █ █  ██   █   ██       █ 
 29.7 |████ ██ ██ █ █ █ ██ ████   ████  █    █  █   ██  ██    █ █  ██ █ █   ███   █  █ 
 28.7 |████ ██ ██ █ ███ ██ ████ █ █████ █   █████ █ ██  ██   ████ ███ ███  ████ █ █ ██ 
 27.6 |███████ ████ █████████████ █████████████████ ███ ███  ██████████████████████████
 26.6 |███████ ████████████████████████████████████ ████████ ██████████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms | █  1
  16 ms | █  2
  18 ms | ██████  9
  19 ms | ███████  10
  20 ms | ███████  11
  21 ms | ███████  11
  22 ms | ███████  11
  23 ms | ████  6
  24 ms | ██  3
  25 ms | █  1
  26 ms | ███  4
  27 ms | █  1
  28 ms | █  2
  29 ms | ██████  9
  30 ms | ███████████  16
  31 ms | █████████████████████████  38
  32 ms | ████████████████████  30
  33 ms | ████████████████████████████████████████  60
  34 ms | ███████████████████  28
  35 ms | █████████████████████████████  43
  36 ms | █████████████████  25
  37 ms | ████████████  18
  38 ms | ███████████  16
  39 ms | ████████████████  24
  40 ms | ██████████  15
  41 ms | █████████████  20
  42 ms | ██████████  15
  43 ms | ███████████████  22
  44 ms | ██████████████  21
  45 ms | █████████████  20
  46 ms | ████████████  18
  47 ms | ████████  12
  48 ms | █  2
  49 ms | ████  6
  50 ms | ███  4
  51 ms | █  2
  52 ms | ███  5
  53 ms | █  2
  54 ms | █  2
  55 ms | █  2
  56 ms | █  1
  57 ms | █  1
  58 ms | █  1
  61 ms | █  2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `explosions_count` = `404.00`
- `tnt_active_p95` = `149.00`
- `neighbour_updates` = `0.00`
- `part` = `1.00`
- `preload_chunks` = `81.00`
- `tnt_active_avg` = `36.75`
- `entity_count_delta` = `-188.00`
- `waves_spawned` = `13.00`
- `tnt_active_max` = `206.00`
- `preset_full` = `0.00`
- `section_rebuilds` = `0.00`
- `entity_count_sample_end` = `1.00`
- `block_state_changes` = `0.00`
- `fps_1pct_low` = `17.09`
- `fps_harmonic_avg` = `27.60`
- `preset_quick` = `1.00`
- `tnt_spawned` = `430.00`
- `preload_duration_ms` = `117.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `16.16`
- `seed` = `3541.00`
- `tnt_active_p50` = `26.00`
- `entity_count_sample_start` = `189.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23076 ms  |  Sample ticks: 400

**FPS**  avg `119.23`, min `8.32`, p50 `54.11`, p95 `551.78`, p99 `1000.11`, 1%low `12.35`, 0.1%low `8.32`, std `187.30`

**Frame time (ms)**  avg `23.22`, p50 `18.48`, p95 `57.14`, p99 `69.90`, p99.9 `102.38`, max `120.24`

**Client tick (ms)**  avg `15.50`, p95 `21.61`, max `29.20`

**Memory**  start `1146 MB`, end `1439 MB`, peak `1544 MB`, GC `30 events / 125 ms`

**FPS over sampling window (ASCII):**

```
413.7 |                                             █                                  
378.5 |                                             █         █                        
343.2 |                                            ██         █                        
308.0 |                                   ██       ███        █         ██             
272.7 |                                   ██       ████      ███       ███             
237.5 |                                   ██       ████      ████     ████        █    
202.2 |                                   ██       ████      ████     ████      █ ██   
167.0 |                                   ███      ████      ████     ████      █ ██ █ 
131.7 |                                   █████   ███████   ██████    █████     ██████ 
 96.5 |                                █ ██████████████████████████ ███████████████████
 61.2 |     █     █         █ █     █  ████████████████████████████████████████████████
 26.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ███  9
   1 ms | ███████████  36
   2 ms | ████  14
   3 ms | ███████  23
   4 ms | ███████  22
   5 ms | ███████████  35
   6 ms | ████  12
   7 ms | ███  11
   8 ms | ████████████████████████████████████████  132
   9 ms | ██████  19
  10 ms | ██  6
  11 ms | ██  5
  12 ms | ██  6
  13 ms | █████  15
  14 ms | ███  9
  15 ms | ███████  23
  16 ms | ████████  25
  17 ms | █████  18
  18 ms | ████████  25
  19 ms | ████  13
  20 ms | ██  8
  21 ms | ████  13
  22 ms | ████  12
  23 ms | █████  17
  24 ms | ███  11
  25 ms | ████  13
  26 ms | ████  12
  27 ms | ███  11
  28 ms | ███  10
  29 ms | ███  9
  30 ms | ███  11
  31 ms | ███  10
  32 ms | █████  17
  33 ms | ███  9
  34 ms | ████████  25
  35 ms | █████  16
  36 ms | ██████  19
  37 ms | ██  8
  38 ms | █  4
  39 ms | ███  10
  40 ms | █  2
  41 ms | ███  11
  42 ms | █  4
  43 ms | ███  9
  44 ms | ██  6
  45 ms | ██  8
  46 ms | ██  7
  47 ms | ███  9
  48 ms | █████  15
  49 ms | ██  7
  50 ms | ███  11
  51 ms | ██  6
  52 ms | █  4
  53 ms | █  3
  54 ms | ██  6
  55 ms | █  2
  56 ms | █  4
  57 ms | ██  8
  58 ms | █  2
  59 ms | █  2
  60 ms | █  2
  61 ms | █  4
  62 ms | █  3
  64 ms | █  3
  65 ms | █  2
  66 ms | █  4
  67 ms |   1
  68 ms | █  3
  69 ms | █  2
  70 ms | █  2
  71 ms |   1
  73 ms |   1
  76 ms |   1
  77 ms |   1
  99 ms |   1
 120 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `62.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `12.35`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4807.02`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `8.32`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `43.06`
- `block_state_changes` = `0.00`
- `seed` = `5077.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `25311.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23103 ms  |  Sample ticks: 400

**FPS**  avg `120.06`, min `17.28`, p50 `65.36`, p95 `407.54`, p99 `894.68`, 1%low `18.88`, 0.1%low `17.28`, std `165.42`

**Frame time (ms)**  avg `17.41`, p50 `15.30`, p95 `40.61`, p99 `49.42`, p99.9 `55.31`, max `57.86`

**Client tick (ms)**  avg `15.99`, p95 `21.95`, max `31.32`

**Memory**  start `1166 MB`, end `1079 MB`, peak `1564 MB`, GC `33 events / 132 ms`

**FPS over sampling window (ASCII):**

```
291.1 |                                                                   █            
269.2 |                                                      █     █      █            
247.3 | █                                              █     █     █     ██            
225.4 | █            █                                ██     █     █     ██            
203.5 | █            █          █          █          ██     █     ██    ██            
181.6 | █            █          █          ██         ██     █     ██    ██            
159.7 | ██           █    █     █     █    ██         ██    ███    ██    ███     █     
137.8 | ███          ██   ██    ██    █    ██   ██    ██    ███   ███    ███    ███    
115.9 |████     █    ██   ██    ██   ██   ███   ███   ███   ███   ███    ███    ████   
 94.0 |█████    ██   ██   ███   ███  ████ ████  ████  ████  ████  ████   █████ ████████
 72.1 |███████████████████████ ████████████████ █████ █████ ███████████████████████████
 50.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██  10
   1 ms | ██████  35
   2 ms | █████  29
   3 ms | ████  23
   4 ms | ███  18
   5 ms | ███  19
   6 ms | █████  29
   7 ms | ████████████████  92
   8 ms | ████████████████████████████████████████  231
   9 ms | █████  28
  10 ms | ██  14
  11 ms | █  5
  12 ms |   1
  13 ms | ███  17
  14 ms | ████  21
  15 ms | ████  23
  16 ms | █████████████  73
  17 ms | █████  28
  18 ms | ████  21
  19 ms | ████  24
  20 ms | ████  23
  21 ms | ███  15
  22 ms | ████  22
  23 ms | █████  27
  24 ms | ██████  33
  25 ms | ███  15
  26 ms | ███  15
  27 ms | ███  15
  28 ms | ██  14
  29 ms | ████  22
  30 ms | ███  16
  31 ms | ███  18
  32 ms | ███  19
  33 ms | ████  23
  34 ms | ███  16
  35 ms | ██  13
  36 ms | ██  12
  37 ms | ██  9
  38 ms | █  3
  39 ms | ██  14
  40 ms | ██  9
  41 ms | █  4
  42 ms | █  5
  43 ms | █  3
  44 ms | █  3
  45 ms | █  4
  46 ms | █  5
  47 ms | ██  11
  48 ms | █  4
  49 ms | █  6
  50 ms |   2
  51 ms |   1
  52 ms |   1
  53 ms | █  3
  54 ms |   1
  55 ms |   1
  57 ms |   1
```

**Extras:**

- `variant` = `heavy`
- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `19.00`
- `entity_count_sample_start` = `3201.00`
- `topup_blocks_per_wave` = `1600.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `18.88`
- `falling_blocks_alive_p50` = `4800.00`
- `waves_spawned` = `12.00`
- `wave_interval_ticks` = `30.00`
- `falling_blocks_alive_max` = `6400.00`
- `falling_blocks_alive_avg` = `4802.94`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-3200.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `17.28`
- `falling_blocks_alive_p95` = `6400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `57.44`
- `block_state_changes` = `0.00`
- `seed` = `5081.00`
- `sand_spawned` = `20800.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `31692.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `107.79`, min `20.13`, p50 `104.13`, p95 `182.99`, p99 `590.05`, 1%low `22.12`, 0.1%low `20.64`, std `94.69`

**Frame time (ms)**  avg `13.31`, p50 `9.60`, p95 `27.72`, p99 `41.38`, p99.9 `47.11`, max `49.67`

**Client tick (ms)**  avg `2.03`, p95 `3.01`, max `10.06`

**Memory**  start `826 MB`, end `1008 MB`, peak `1596 MB`, GC `45 events / 207 ms`

**FPS over sampling window (ASCII):**

```
172.1 |                                      █                                         
164.3 |                                      █                                         
156.4 |                                      █                               █         
148.5 |         █      █             █       █                       █       █         
140.6 |         █      █             █       █            █ █        █   █   █         
132.8 |         █      ██     █      █   █   █            █ █ █      ██  █   █     █   
124.9 |   █     █    █ ███    █      █   █   █ █████      █ █ █  █   ██  █   █     █  █
117.0 |   █     ██████ ████   █      ██  █   █ █████      █ █ █  █   ██  █   █   █ █  █
109.2 |█  █     ██████ ████   █      ██  █   █ █████    █ █ █ █  █   ██  █   █   █ █  █
101.3 |█  █   █ █████████████ ███ ██ ██ ██ █ ███████ ██ █ █████ ███ ███ ███ ██ ███ █ ██
 93.4 |█████████████████████████████████████████████ ██████████████ ██████████ ████████
 85.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   1
   1 ms | ██  22
   2 ms | █  16
   3 ms | █  8
   4 ms | █  8
   5 ms | ███████  75
   6 ms | ███████  84
   7 ms | ██████  66
   8 ms | ████████████████████████████████████████  453
   9 ms | ███  36
  10 ms | ███████  81
  11 ms | ████  44
  12 ms | █  8
  13 ms |   3
  14 ms | █  8
  15 ms | █████  56
  16 ms | ██████  65
  17 ms | ██████  69
  18 ms | █████  53
  19 ms | ████████  87
  20 ms | ██████  67
  21 ms | █████  51
  22 ms | ██  24
  23 ms | █  15
  24 ms | █  15
  25 ms | █  6
  26 ms |   3
  27 ms |   2
  28 ms |   2
  29 ms |   1
  31 ms |   3
  32 ms | █  7
  33 ms | ██  19
  34 ms | █  7
  35 ms | █  6
  36 ms | █  8
  37 ms |   2
  38 ms |   1
  39 ms |   1
  40 ms |   2
  41 ms |   1
  42 ms |   3
  43 ms |   1
  44 ms |   4
  45 ms |   1
  46 ms |   4
  47 ms |   1
  49 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `16.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `22.12`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `882.00`
- `falling_blocks_alive_avg` = `619.12`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.64`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `75.15`
- `block_state_changes` = `0.00`
- `seed` = `5101.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3087.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23081 ms  |  Sample ticks: 400

**FPS**  avg `29.13`, min `14.72`, p50 `28.52`, p95 `46.28`, p99 `55.23`, 1%low `16.10`, 0.1%low `14.72`, std `7.76`

**Frame time (ms)**  avg `36.38`, p50 `35.06`, p95 `51.35`, p99 `57.80`, p99.9 `64.84`, max `67.93`

**Client tick (ms)**  avg `1.88`, p95 `2.63`, max `6.24`

**Memory**  start `826 MB`, end `1525 MB`, peak `1613 MB`, GC `16 events / 63 ms`

**FPS over sampling window (ASCII):**

```
 35.7 |                    █                                                           
 34.7 |                    █              █                                            
 33.8 |                 █  ██             █        █    █                              
 32.9 |           ██  █ █  ██             █        █    █                      █       
 32.0 |         █ ██  █ █  ██           █ █ █      █    █                      █       
 31.0 | █   █   █ ██  █ ██ ██           ███ █      ███  █           █   █      █       
 30.1 | █   █ ███ ██ ██ █████   █  ███  ███ █      ███  █ █         █  ███     █       
 29.2 | ██ ██ ███ █████ ██████  █  ███  ███ █ █  █ ████ █ █ █  █    █  ███ █   █       
 28.3 | ██ ██ ███ █████████████ █  ███ ██████ █  █ ████ █ ███  █ █  ██ ███ ██ ███      
 27.3 | ███████████████████████ ██ ███ ████████ ███████ ████████ █████████ ███████ ████
 26.4 | ███████████████████████ ███████████████████████████████████████████████████████
 25.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  14 ms |   1
  17 ms | ██  4
  18 ms | ████  8
  19 ms | ██  4
  20 ms | ███  7
  21 ms | █████  10
  22 ms | ██████  12
  23 ms | ████  8
  24 ms | ████  8
  25 ms | █  2
  29 ms |   1
  30 ms | ████  8
  31 ms | ███████████████████████  48
  32 ms | █████████████  27
  33 ms | ████████████████████████████████████████  82
  34 ms | ████████████████████  41
  35 ms | ███████████████████████  47
  36 ms | █████████  19
  37 ms | ████████  17
  38 ms | ███████  15
  39 ms | ████████  16
  40 ms | █████████  18
  41 ms | ███████████  23
  42 ms | ██████  13
  43 ms | ███████  14
  44 ms | ███████████  22
  45 ms | ████████  17
  46 ms | ██████  12
  47 ms | ███  7
  48 ms | ██  4
  49 ms | █  2
  50 ms | █  3
  51 ms | █  3
  52 ms | █  2
  53 ms | █  3
  54 ms | █  2
  55 ms | █  2
  56 ms | ███  7
  57 ms | ██  5
  58 ms |   1
  59 ms |   1
  61 ms |   1
  62 ms |   1
  67 ms |   1
```

**Extras:**

- `variant` = `lite`
- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `47.00`
- `entity_count_sample_start` = `442.00`
- `topup_blocks_per_wave` = `49.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `16.10`
- `falling_blocks_alive_p50` = `686.00`
- `waves_spawned` = `63.00`
- `wave_interval_ticks` = `6.00`
- `falling_blocks_alive_max` = `833.00`
- `falling_blocks_alive_avg` = `619.80`
- `preset_full` = `0.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-441.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `14.72`
- `falling_blocks_alive_p95` = `833.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.49`
- `block_state_changes` = `0.00`
- `seed` = `5113.00`
- `sand_spawned` = `3087.00`
- `preset_quick` = `1.00`
- `falling_blocks_landed` = `3874.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `28.29`, min `19.57`, p50 `29.18`, p95 `31.14`, p99 `47.24`, 1%low `20.58`, 0.1%low `19.57`, std `4.88`

**Frame time (ms)**  avg `36.25`, p50 `34.27`, p95 `46.09`, p99 `47.78`, p99.9 `49.93`, max `51.09`

**Client tick (ms)**  avg `0.67`, p95 `0.90`, max `1.23`

**Memory**  start `816 MB`, end `1061 MB`, peak `1616 MB`, GC `18 events / 72 ms`

**FPS over sampling window (ASCII):**

```
 32.9 |    █                                                                           
 32.3 |    █                                                                           
 31.6 |    █                                                                           
 30.9 |    █   █             █     █                █    █                     █     █ 
 30.3 |    █   █       █     █     ███     █        █    █   █                 █     █ 
 29.6 |   ██   ██ █    █  █  █     ███  █  ██    █  █    █   █            █    █     █ 
 28.9 |   ██   ██ █    █  █  █     ███ ██  ██   ██  █    █   █            █  █ █     █ 
 28.3 | █ ███ ███ ████ ██ █  █   █ ███ ███ ██   ██  █  █ █  ███ █        ███ █ █  █  █ 
 27.6 | █ ███ ███ ████ █████ █  ██ ███ ███████████ ██  █ ██ ███ ██ █ █████████ █  ████ 
 27.0 |█████████████████████ █████ █████████████████████ ██ ██████████████████ ████████
 26.3 |███████████████████████████████████████████████████████████████████████ ████████
 25.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  19 ms |   1
  20 ms | █  3
  21 ms | ████  13
  22 ms | █  5
  24 ms |   1
  31 ms | █  4
  32 ms | ██████████████████████████████  99
  33 ms | ████████████████████████████████████████  134
  34 ms | █████████████  42
  35 ms | █████████  30
  36 ms | ██████████  33
  37 ms | ███  10
  38 ms | ██████  19
  39 ms | █████  16
  40 ms | ███████  22
  41 ms | ███████  22
  42 ms | ██████  19
  43 ms | █████  17
  44 ms | █████  17
  45 ms | ████  14
  46 ms | █████  17
  47 ms | ████  12
  48 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `projectiles_swept` = `270.00`
- `block_state_changes` = `0.00`
- `waves_spawned` = `40.00`
- `entity_count_sample_start` = `78.00`
- `entity_count_delta` = `173.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `251.00`
- `preload_duration_ms` = `33.00`
- `seed` = `5099.00`
- `fps_0p1pct_low` = `19.57`
- `max_in_flight_observed` = `250.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.59`
- `neighbour_updates` = `0.00`
- `projectiles_spawned` = `1000.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `20.58`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23080 ms  |  Sample ticks: 400

**FPS**  avg `28.55`, min `19.35`, p50 `29.29`, p95 `45.04`, p99 `48.84`, 1%low `20.13`, 0.1%low `19.35`, std `5.45`

**Frame time (ms)**  avg `36.07`, p50 `34.15`, p95 `46.21`, p99 `48.47`, p99.9 `50.90`, max `51.68`

**Client tick (ms)**  avg `0.31`, p95 `0.38`, max `3.24`

**Memory**  start `1536 MB`, end `1515 MB`, peak `1605 MB`, GC `17 events / 71 ms`

**FPS over sampling window (ASCII):**

```
 34.0 |          █                                                                     
 33.2 |          █                                                                     
 32.4 |    █     █                           █                           █   █         
 31.7 | █  █     █                           █                           █   █         
 30.9 | █  █     █              █        █   █              █            █   █ █       
 30.1 | █  █   █ █          █   █ █     ██   █             ██       █   ████ █ █    █  
 29.3 | █  ███ █ ██         █   █ █     ██   █      █      ██ █     █   ██████ █    █  
 28.6 | █  █████ ██    █   ███ ████    ███ █ ██   █ █ █ █  ██ █ █   ██  ██████ █  █ █  
 27.8 | ██ █████ ███  ████████ ████  █████ █ ███ ██████ ██ ██████ █████ ████████ ██ ██ 
 27.0 | ████████ ███ ███████████████████████ █████████████ ██████ █████ ███████████████
 26.2 | ████████████████████████████████████ ██████████████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   1
  20 ms | ██  8
  21 ms | ███  16
  22 ms | █  3
  23 ms |   2
  30 ms |   1
  31 ms |   1
  32 ms | ███████  36
  33 ms | ████████████████████████████████████████  198
  34 ms | ████████  41
  35 ms | ███████  37
  36 ms | █████  27
  37 ms | ████  19
  38 ms | ██  12
  39 ms | ███  15
  40 ms | ████  20
  41 ms | ████  21
  42 ms | ███  16
  43 ms | ██  11
  44 ms | ███  14
  45 ms | ████  21
  46 ms | ███  14
  47 ms | ██  10
  48 ms | █  5
  49 ms |   2
  50 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.35`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.72`
- `fps_1pct_low` = `20.13`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `75.00`
- `scheduled_block_ticks` = `9576.00`
- `entity_count_sample_start` = `1.00`
- `clocks_built` = `36.00`
- `observers_placed` = `72.00`
- `preset_long` = `0.00`
- `seed` = `4001.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23085 ms  |  Sample ticks: 400

**FPS**  avg `28.42`, min `18.07`, p50 `29.23`, p95 `32.72`, p99 `48.73`, 1%low `19.61`, 0.1%low `18.07`, std `5.28`

**Frame time (ms)**  avg `36.19`, p50 `34.21`, p95 `45.93`, p99 `48.82`, p99.9 `53.19`, max `55.35`

**Client tick (ms)**  avg `0.26`, p95 `0.33`, max `0.65`

**Memory**  start `1098 MB`, end `1121 MB`, peak `1662 MB`, GC `18 events / 86 ms`

**FPS over sampling window (ASCII):**

```
 34.7 |                                        █                                       
 33.9 |                                        █                                       
 33.2 |                                        █            █                          
 32.4 |                                        █            █                          
 31.7 |                                        █         █  █                          
 30.9 | █        █   █ █                   █   █       █ █  █             █            
 30.2 | █    █   ██  █ █  █      █         █   █       █ █  █         █   █        █   
 29.4 |███   ██  ██  █ █  █  █   █ █   █  ██   █       █ █  █       █ █   █        █   
 28.7 |█████ ██  ███ █ █  █  █   █ ██  ██ ███  █    ██ █ ██ █ █ ██  ███ █ █ █      █   
 27.9 |█████ █████████ ████ ██   █████ ██ ███  █ █  ████ ██ ███ ██  █████ ███ █  █ ██  
 27.2 |█████ █████████ █████████ ████████████  █ ███████ ██ █████████████████ ███████ █
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   2
  19 ms |   2
  20 ms | ██  8
  21 ms | ██  9
  22 ms | █  5
  24 ms |   1
  29 ms |   1
  31 ms | █  6
  32 ms | ███████  33
  33 ms | ████████████████████████████████████████  198
  34 ms | ████████  39
  35 ms | ███████  36
  36 ms | ████  20
  37 ms | █████  23
  38 ms | ████  19
  39 ms | ███  14
  40 ms | ████  18
  41 ms | ████  20
  42 ms | ███  17
  43 ms | ███  15
  44 ms | █████  24
  45 ms | ███  15
  46 ms | ██  10
  47 ms | █  6
  48 ms | █  6
  49 ms |   2
  50 ms |   1
  51 ms |   1
  55 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
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
- `fps_1pct_low` = `19.61`
- `preset_long` = `0.00`
- `preload_duration_ms` = `71.00`
- `fps_harmonic_avg` = `27.64`
- `trails_built` = `16.00`
- `fps_0p1pct_low` = `18.07`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23123 ms  |  Sample ticks: 400

**FPS**  avg `28.56`, min `16.84`, p50 `29.00`, p95 `43.39`, p99 `52.26`, 1%low `18.49`, 0.1%low `16.84`, std `5.89`

**Frame time (ms)**  avg `36.23`, p50 `34.48`, p95 `46.68`, p99 `49.35`, p99.9 `58.73`, max `59.37`

**Client tick (ms)**  avg `0.32`, p95 `0.46`, max `0.80`

**Memory**  start `964 MB`, end `1097 MB`, peak `1682 MB`, GC `15 events / 53 ms`

**FPS over sampling window (ASCII):**

```
 34.8 |                                                                      █         
 33.9 |                                                        █             █         
 33.0 |                                                      █ █             █         
 32.2 |         █ █                                          █ █     █    █  █         
 31.3 |         █ █      █      ██                           █ █     █    █  █      █  
 30.4 |       █ █ █      █    █ ██         █             █   █ █ █   █    █  █      █  
 29.5 |      ██ █ █  █   █    ████     ██  █  █          █   █ █ █ █ █    █  █      █  
 28.6 |  █ █ ██ █ █  ██  █   ██████ ██ ██ ██  ██    █    █   █ █ █ █ █  █ ██ █   █  █ █
 27.7 |█ █ ████ █ ██ ██ ██   ██████ █████ ███ ██ ██████ ██ █████ ███ █ █████ ███ █ ████
 26.8 |█ █ ██████ █████████ ████████████████████████████████████████ ███████ ██████████
 26.0 |██████████ █████████████████████████████████████████████████████████████████████
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms | ██  5
  19 ms | █  2
  20 ms | ██  6
  21 ms | ███  10
  22 ms | █  4
  23 ms | █  2
  24 ms | █  2
  25 ms | █  2
  30 ms | █  4
  31 ms | ███████  22
  32 ms | ████████████████  53
  33 ms | ████████████████████████████████████████  133
  34 ms | ███████████████  50
  35 ms | █████████████  43
  36 ms | ██████  19
  37 ms | ██████  20
  38 ms | ████  12
  39 ms | █████  17
  40 ms | █████  16
  41 ms | █████  18
  42 ms | ██████  20
  43 ms | █████  17
  44 ms | █████  16
  45 ms | ██████  20
  46 ms | ████  13
  47 ms | ████  12
  48 ms | ██  5
  49 ms | █  3
  50 ms |   1
  52 ms |   1
  54 ms |   1
  58 ms |   1
  59 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `pistons_built` = `64.00`
- `block_state_changes` = `0.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `41.00`
- `seed` = `4027.00`
- `fps_0p1pct_low` = `16.84`
- `slime_blocks` = `192.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.60`
- `neighbour_updates` = `11200.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `power_toggles` = `57.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `18.49`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23121 ms  |  Sample ticks: 400

**FPS**  avg `28.37`, min `20.16`, p50 `29.26`, p95 `44.93`, p99 `48.18`, 1%low `20.66`, 0.1%low `20.16`, std `5.45`

**Frame time (ms)**  avg `36.31`, p50 `34.18`, p95 `46.11`, p99 `47.77`, p99.9 `49.16`, max `49.62`

**Client tick (ms)**  avg `0.30`, p95 `0.38`, max `0.59`

**Memory**  start `1392 MB`, end `1295 MB`, peak `1684 MB`, GC `17 events / 66 ms`

**FPS over sampling window (ASCII):**

```
 32.6 |   █                                        █       █                           
 31.9 |   █               █                        █       █                           
 31.1 |   █            █  █    █         █       █ █       █                           
 30.3 |  ██       █   ██  █ █  █       █ █ █  █  █ █  █    █       ██                  
 29.5 |  ██ █     █   ██  █ ██ █       █ █ ██ █  █ █  ██   █       ██    █ █  █   █    
 28.8 |█ ████     █   ██  █ ██ ██ ███ ██ █ ██ █  █ █  ██   █       ██ ████ █  █   █   █
 28.0 |█ █████    █ █████ ███████ ███ ██ █ ██ █  ███ ███   █   █  ███ ████ ████  ██  ██
 27.2 |█ ██████  ████████████████ ███ ██ ████ ██ █████████ █   ██ █████████████  ██████
 26.4 |█ ██████ ████████████████████████████████ ██████████████████████████████  ██████
 25.7 |█████████████████████████████████████████████████████████████████████████ ██████
 24.9 |█████████████████████████████████████████████████████████████████████████ ██████
 24.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  19 ms |   1
  20 ms | █  7
  21 ms | ███  13
  22 ms | ██  8
  29 ms |   1
  31 ms |   2
  32 ms | ███████  33
  33 ms | ████████████████████████████████████████  202
  34 ms | ███████  36
  35 ms | █████  26
  36 ms | ███  16
  37 ms | ████  20
  38 ms | ███  14
  39 ms | █████  24
  40 ms | ███  17
  41 ms | █████  25
  42 ms | ███  13
  43 ms | ████  20
  44 ms | ████  21
  45 ms | ████  19
  46 ms | ████  18
  47 ms | ██  10
  48 ms | █  3
  49 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `seed` = `7039.00`
- `preset_full` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_delta` = `0.00`
- `leaf_blocks` = `7642.00`
- `log_blocks` = `320.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `33.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.16`
- `fps_1pct_low` = `20.66`
- `entity_count_sample_start` = `1.00`
- `fps_harmonic_avg` = `27.54`
- `trees_built` = `64.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23120 ms  |  Sample ticks: 400

**FPS**  avg `28.47`, min `13.34`, p50 `28.62`, p95 `45.45`, p99 `52.59`, 1%low `15.27`, 0.1%low `13.34`, std `7.11`

**Frame time (ms)**  avg `36.84`, p50 `34.95`, p95 `48.87`, p99 `57.53`, p99.9 `69.63`, max `74.94`

**Client tick (ms)**  avg `0.41`, p95 `0.72`, max `2.16`

**Memory**  start `1506 MB`, end `1982 MB`, peak `2316 MB`, GC `50 events / 271 ms`

**FPS over sampling window (ASCII):**

```
 35.4 |         █                                                                      
 34.5 |         █                                                                      
 33.5 |         █   █                                                                  
 32.5 |         █   █                                                      █           
 31.6 |         █   █          █     █        █                █           █           
 30.6 | █    █  █   █          █ ██  █  █     █    █     █     █      █    █           
 29.6 |██    █  █   █    █  █  █ ██  █  ██    ██   █  █  █     █   █  █  █ █           
 28.6 |██    █ ██   █  █ █  ██ █ ██  █  ██    ██ ███ ███ █    ███  █  ██ █ █        █  
 27.7 |████  ████   ██████ ████████  ██ ██ ██ ██ ███ ███ █ ██ ██████ █████████  ███ ██ 
 26.7 |████ ██████ ███████ ████████ █████████ ███████████████ ████████████████████████ 
 25.7 |██████████████████████████████████████ ████████████████████████████████████████ 
 24.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  13 ms |   1
  14 ms | █  2
  16 ms |   1
  18 ms | █  2
  19 ms | ██  4
  20 ms | ██  4
  21 ms | ██████  14
  22 ms | ██  4
  23 ms | █  3
  24 ms | █  2
  25 ms |   1
  26 ms |   1
  27 ms | █  3
  28 ms |   1
  30 ms | █████  11
  31 ms | █████  11
  32 ms | ██████████████████████  52
  33 ms | ████████████████████████████████████████  96
  34 ms | █████████████████████████  60
  35 ms | ██████████████  33
  36 ms | ████████████  28
  37 ms | ████████  20
  38 ms | ██████  14
  39 ms | ███████  16
  40 ms | ████████  18
  41 ms | ███  8
  42 ms | ██████  15
  43 ms | ████████  19
  44 ms | ███████  16
  45 ms | ████████  18
  46 ms | ███████  17
  47 ms | ██████  14
  48 ms | ████  9
  49 ms | ███  7
  50 ms | ██  4
  51 ms | ██  4
  52 ms |   1
  53 ms |   1
  55 ms |   1
  56 ms |   1
  58 ms |   1
  60 ms |   1
  63 ms | █  2
  65 ms |   1
  74 ms |   1
```

**Extras:**

- `biome` = `minecraft:plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `8.00`
- `entity_count_delta` = `-7.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `36.00`
- `seed` = `7411.00`
- `fps_0p1pct_low` = `13.34`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.15`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `60.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `15.27`
- `surface_water_ratio` = `0.02`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 23307 ms  |  Sample ticks: 400

**FPS**  avg `28.35`, min `11.71`, p50 `27.66`, p95 `43.97`, p99 `57.55`, 1%low `14.50`, 0.1%low `11.71`, std `11.09`

**Frame time (ms)**  avg `37.70`, p50 `36.15`, p95 `51.42`, p99 `59.47`, p99.9 `76.36`, max `85.40`

**Client tick (ms)**  avg `0.43`, p95 `0.70`, max `7.74`

**Memory**  start `1565 MB`, end `2220 MB`, peak `2781 MB`, GC `37 events / 293 ms`

**FPS over sampling window (ASCII):**

```
 35.4 |                                  █                                             
 34.4 |                                  █                                             
 33.3 |                                  █    █                                        
 32.3 |    █                   █         █    █                █                       
 31.2 |    █          █        █         █    █                █        █              
 30.2 |█   █   █      █        █         █    █ █   █      █   █ █   █ ██     █  ██    
 29.1 |█  ██   █     ██        █     █ ███    █ ██  █ █    ██  █ ███ █ ██  █  █  ██  █ 
 28.1 |█  ███  █  █  ██   █  ███  ████ ███  █ █ ██  █ ██ █ ███ ███████ ██  █  █  ██  ██
 27.0 |█  ████ █ ██  ██████ ██████████ ███  █ ███████ ██ █████ ██████████ ██  █  ███ ██
 26.0 |████████████  █████████████████ ██████ ███████████████████████████ ███ █████████
 24.9 |██████████████████████████████████████ ███████████████████████████████ █████████
 23.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms | █  1
  11 ms | █  1
  15 ms | █  1
  16 ms | ██  3
  18 ms | ███  4
  19 ms | █  2
  20 ms | ██  3
  21 ms | ████  6
  22 ms | █████  7
  23 ms | ██  3
  24 ms | ███  5
  25 ms | ███  5
  27 ms | ██  3
  28 ms | ██  3
  29 ms | ██████  9
  30 ms | ████████  12
  31 ms | ████████████  17
  32 ms | ███████████████████████████████████  51
  33 ms | ████████████████████████████████████████  59
  34 ms | █████████████████████████████████  49
  35 ms | █████████████  19
  36 ms | ███████████████████  28
  37 ms | ███████████████  22
  38 ms | ████████████  18
  39 ms | ███████████  16
  40 ms | ██████████  15
  41 ms | ████████████  17
  42 ms | █████████  13
  43 ms | ███████  11
  44 ms | ██████████████  21
  45 ms | ████████████  17
  46 ms | ██████████  15
  47 ms | ████████████  17
  48 ms | ████████  12
  49 ms | ███████  10
  50 ms | ███  4
  51 ms | ████  6
  52 ms | ███  5
  53 ms | █  2
  54 ms | █  1
  55 ms | █  2
  56 ms | █  1
  57 ms | █  1
  58 ms | ████  6
  59 ms | █  2
  62 ms | █  1
  64 ms | █  2
  68 ms | █  1
  85 ms | █  1
```

**Extras:**

- `biome` = `minecraft:jungle`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `4.00`
- `entity_count_delta` = `-3.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `275.00`
- `seed` = `7417.00`
- `fps_0p1pct_low` = `11.71`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.53`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `52.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `14.50`
- `surface_water_ratio` = `0.06`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `107.43`, min `20.76`, p50 `112.10`, p95 `152.13`, p99 `563.01`, 1%low `28.86`, 0.1%low `21.30`, std `90.84`

**Frame time (ms)**  avg `12.29`, p50 `8.92`, p95 `22.21`, p99 `27.65`, p99.9 `44.60`, max `48.17`

**Client tick (ms)**  avg `0.37`, p95 `0.62`, max `1.65`

**Memory**  start `2623 MB`, end `2533 MB`, peak `3155 MB`, GC `25 events / 215 ms`

**FPS over sampling window (ASCII):**

```
158.0 |                                              █                                 
151.7 |                                              █                                 
145.3 |  █      █                                    █     █                           
139.0 |  █     ██                   █                █     █                           
132.7 |  █  █  ██                   █                █   █ █                           
126.4 |  █  █  ██            █      █              █ █   █ █                           
120.1 |  █  █ █████    █     █      █  █  █  ██    █ █   █ █        █                █ 
113.7 | ██  █ █████    █   █ █      █  █  █  ███   ███   █ █  █     ██             █ █ 
107.4 |███  █ █████    ██  ███      █  █ ██ ████   ███ █ █ █  █     ██     █ █  █  █ ██
101.1 |███ █████████   ███ █████ █ ███ █████████ ███████ █ █  ██ ██ ██ █  ████  █ █████
 94.8 |█████████████ █████ ███████ ███████████████████████████████████ ██ █████████████
 88.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | ██  21
   2 ms | █  12
   3 ms |   6
   4 ms |   3
   5 ms | ██  20
   6 ms | █████  61
   7 ms | ██████████████  184
   8 ms | ████████████████████████████████████████  526
   9 ms | ██████████  134
  10 ms | ██  32
  11 ms | █  9
  12 ms |   3
  14 ms | █  10
  15 ms | ███  35
  16 ms | ████████  109
  17 ms | █████████  124
  18 ms | ████████  105
  19 ms | ████  54
  20 ms | ███  38
  21 ms | ███  40
  22 ms | ███  34
  23 ms | █  19
  24 ms | █  11
  25 ms | █  8
  26 ms |   4
  27 ms |   6
  28 ms |   3
  29 ms |   5
  32 ms |   2
  37 ms |   1
  40 ms |   2
  43 ms |   1
  45 ms |   1
  48 ms |   1
```

**Extras:**

- `biome` = `minecraft:desert`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-5.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `51.00`
- `seed` = `7433.00`
- `fps_0p1pct_low` = `21.30`
- `part` = `1.00`
- `fps_harmonic_avg` = `81.37`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `74.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `28.86`
- `surface_water_ratio` = `0.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 23105 ms  |  Sample ticks: 400

**FPS**  avg `109.38`, min `22.86`, p50 `112.80`, p95 `151.07`, p99 `636.98`, 1%low `32.59`, 0.1%low `24.83`, std `101.85`

**Frame time (ms)**  avg `12.39`, p50 `8.87`, p95 `22.80`, p99 `27.13`, p99.9 `36.45`, max `43.74`

**Client tick (ms)**  avg `0.36`, p95 `0.53`, max `0.94`

**Memory**  start `3194 MB`, end `2916 MB`, peak `3260 MB`, GC `25 events / 226 ms`

**FPS over sampling window (ASCII):**

```
178.7 |   █                                                                            
170.4 |   █                                 █                       █                  
162.2 |   █                                 █                       █                  
154.0 |   █                                 █           █           █       █          
145.8 |   █                                 █           █    █      █       █          
137.5 |   █ █                         █     █           █    █      █       █          
129.3 | █ ███  █  ██          █ █     █ █   ██          █   ██      █       █          
121.1 | █ ███  █  ██   █  █   █ █     █ █   ██ █        █   ██      █  █    █         █
112.9 | █ ███  █  ██   ██ ██  ███   █ █ █   ██ █        █   ██    █ ██ █   ██         █
104.6 |██ ███  █  ██ █ ██ ██ ████ █ █ █ █ █ ██ █ ██    ████ ███   █ ██ █   ██    █    █
 96.4 |███████ █████████████ ████ ███ █ ██████████████████████████████ ██████  █ ██ ███
 88.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   4
   1 ms | ██  24
   2 ms | █  12
   3 ms |   5
   4 ms | █  7
   5 ms | █  7
   6 ms | ████  48
   7 ms | ████████████████  209
   8 ms | ████████████████████████████████████████  536
   9 ms | ████████  108
  10 ms | ███  34
  11 ms | █  11
  12 ms |   5
  13 ms |   1
  14 ms | █  10
  15 ms | ██  29
  16 ms | ██████  74
  17 ms | ████████  102
  18 ms | ███████  90
  19 ms | █████  70
  20 ms | ████  49
  21 ms | █████  67
  22 ms | ██  33
  23 ms | ██  26
  24 ms | █  19
  25 ms | █  11
  26 ms |   4
  27 ms | █  8
  28 ms |   4
  29 ms |   2
  30 ms |   1
  32 ms |   1
  36 ms |   2
  43 ms |   1
```

**Extras:**

- `biome` = `minecraft:taiga`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `12.00`
- `entity_count_delta` = `-11.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `33.00`
- `seed` = `7451.00`
- `fps_0p1pct_low` = `24.83`
- `part` = `1.00`
- `fps_harmonic_avg` = `80.74`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `72.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `32.59`
- `surface_water_ratio` = `0.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 23111 ms  |  Sample ticks: 400

**FPS**  avg `97.60`, min `13.89`, p50 `106.05`, p95 `142.66`, p99 `503.80`, 1%low `18.11`, 0.1%low `13.89`, std `83.46`

**Frame time (ms)**  avg `14.74`, p50 `9.43`, p95 `34.54`, p99 `46.25`, p99.9 `67.23`, max `71.98`

**Client tick (ms)**  avg `0.39`, p95 `0.66`, max `2.75`

**Memory**  start `2903 MB`, end `3378 MB`, peak `3378 MB`, GC `28 events / 245 ms`

**FPS over sampling window (ASCII):**

```
166.0 |                      █                                    █                    
153.5 |  █                   █        █                           █                    
140.9 |  █ █                 █        █               █           █     █              
128.4 |  █ █                 █  █     █               █      █    █ █   █              
115.8 | ██ █ █ █ █           █  █     █             █ █    █ █    ███   █         █    
103.3 | ██ █ █ █ █ █  ███ █  ██ █  █ ███  █   ██  ███ █  █ █ █ ██ ████  █ ██      █    
 90.7 |███████████ ███████████████████████████████████████ █████████████████████████   
 78.2 |█████████████████████████████████████████████████████████████████████████████   
 65.6 |█████████████████████████████████████████████████████████████████████████████   
 53.1 |█████████████████████████████████████████████████████████████████████████████   
 40.5 |██████████████████████████████████████████████████████████████████████████████  
 28.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms | █  11
   2 ms | █  9
   3 ms | █  5
   4 ms | █  8
   5 ms | █  5
   6 ms | ███  27
   7 ms | ████████████████████████  204
   8 ms | ████████████████████████████████████████  343
   9 ms | █████████████  111
  10 ms | ██  16
  11 ms | █  12
  12 ms |   3
  13 ms |   1
  14 ms |   4
  15 ms | ██  18
  16 ms | ███████  60
  17 ms | ████████████  103
  18 ms | █████████  76
  19 ms | █████  46
  20 ms | ████  37
  21 ms | █████  40
  22 ms | ████  34
  23 ms | ██  19
  24 ms | ██  18
  25 ms | █  11
  26 ms | █  9
  27 ms |   4
  28 ms |   1
  29 ms |   3
  30 ms |   2
  31 ms | █  7
  32 ms | █  12
  33 ms | ██  17
  34 ms | ██  19
  35 ms | █  8
  36 ms | █  7
  37 ms |   4
  38 ms |   4
  39 ms |   1
  40 ms |   2
  41 ms | █  6
  42 ms |   4
  43 ms |   2
  44 ms |   3
  45 ms |   1
  46 ms |   3
  47 ms |   1
  48 ms |   2
  49 ms |   1
  52 ms |   1
  53 ms |   1
  56 ms |   1
  57 ms |   1
  61 ms |   2
  70 ms |   1
  71 ms |   1
```

**Extras:**

- `biome` = `minecraft:snowy_plains`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `24.00`
- `entity_count_delta` = `-23.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `46.00`
- `seed` = `7457.00`
- `fps_0p1pct_low` = `13.89`
- `part` = `1.00`
- `fps_harmonic_avg` = `67.82`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `18.11`
- `surface_water_ratio` = `0.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 24346 ms  |  Sample ticks: 400

**FPS**  avg `28.15`, min `15.41`, p50 `28.23`, p95 `43.29`, p99 `52.62`, 1%low `16.38`, 0.1%low `15.41`, std `6.59`

**Frame time (ms)**  avg `37.15`, p50 `35.42`, p95 `49.65`, p99 `54.89`, p99.9 `64.79`, max `64.91`

**Client tick (ms)**  avg `0.37`, p95 `0.52`, max `2.08`

**Memory**  start `2276 MB`, end `2929 MB`, peak `3685 MB`, GC `23 events / 221 ms`

**FPS over sampling window (ASCII):**

```
 33.4 |                                █                                               
 32.6 |                                █ █                                             
 31.8 |                            █   █ ██            █              █                
 30.9 |                 █       █  █  ██ ██ █          █   █          █  █             
 30.1 |           █     █       █  █  ██ ██ █    █     █  ██          █  █   ██ █      
 29.3 |          ██  █  █       █ ██  ██ ████    █     █ ███          █  █   ████     █
 28.4 |       █ ███ ██  █  █    █ ███ ███████    █   █ █ ███ █     █  █  █   █████    █
 27.6 |█  ██ ██ ██████ ██ ██ █ ██████ ███████ █  █████ █ ██████    █  █  █ █ ██████  ██
 26.8 |██ ██ █████████ ███████ █████████████████ ██████████████  ███████ █ ████████  ██
 25.9 |████████████████████████████████████████████████████████  ██████████████████  ██
 25.1 |████████████████████████████████████████████████████████  ███████████████████ ██
 24.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms | █  1
  18 ms | ███  5
  19 ms | ███  6
  20 ms | ███  6
  21 ms | ███  5
  22 ms | ██  3
  23 ms | ███  6
  24 ms | █  1
  25 ms | █  2
  26 ms | █  2
  27 ms | ██  3
  29 ms | ███  6
  30 ms | █████  9
  31 ms | █████████████████  30
  32 ms | ██████████████████████████  47
  33 ms | ████████████████████████████████████████  71
  34 ms | ███████████████████████████  48
  35 ms | █████████████████████  37
  36 ms | ██████████████  24
  37 ms | ████████  14
  38 ms | ██████████  17
  39 ms | ██████████████  24
  40 ms | █████████  16
  41 ms | ████████████  21
  42 ms | ██████████  18
  43 ms | ████████  15
  44 ms | ██████████  18
  45 ms | ████████████  21
  46 ms | █████  9
  47 ms | ██████  10
  48 ms | ███████  12
  49 ms | █████  9
  50 ms | ██  4
  51 ms | ███  6
  52 ms | █  1
  53 ms | █  1
  54 ms | ███  5
  55 ms | █  1
  57 ms | █  1
  58 ms | █  1
  60 ms | █  1
  64 ms | █  2
```

**Extras:**

- `biome` = `minecraft:forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `6.00`
- `entity_count_delta` = `-5.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1307.00`
- `seed` = `7477.00`
- `fps_0p1pct_low` = `15.41`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.92`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `51.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `16.38`
- `surface_water_ratio` = `0.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23113 ms  |  Sample ticks: 400

**FPS**  avg `28.84`, min `12.55`, p50 `28.45`, p95 `46.59`, p99 `52.36`, 1%low `14.34`, 0.1%low `12.55`, std `9.87`

**Frame time (ms)**  avg `36.83`, p50 `35.15`, p95 `48.57`, p99 `57.76`, p99.9 `75.15`, max `79.69`

**Client tick (ms)**  avg `0.37`, p95 `0.58`, max `1.47`

**Memory**  start `2356 MB`, end `3758 MB`, peak `3889 MB`, GC `20 events / 195 ms`

**FPS over sampling window (ASCII):**

```
 48.7 |                                        █                                       
 46.6 |                                        █                                       
 44.4 |                                        █                                       
 42.3 |                                        █                                       
 40.1 |                                        █                                       
 38.0 |                                   █    █          █                            
 35.8 |                                   █    █          █                            
 33.7 |                  █              █ █    █          █  █                         
 31.5 |                  █  █ █         ███ █  █          █  █   █  ██ ██        █ █   
 29.4 |     █        █   █  ███ █   █   ███ ██ ██  █████████ █   █  ██ ██ ███ █ ██ █  █
 27.2 |████████ ████████████████████████████████████████████ ██████ ██████████████ ██ █
 25.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   1
  10 ms |   1
  11 ms |   1
  17 ms |   1
  18 ms |   1
  19 ms | ██  5
  20 ms | ███  7
  21 ms | ███████  17
  22 ms | ██  5
  23 ms | █  2
  24 ms | ██  5
  25 ms |   1
  26 ms |   1
  27 ms |   1
  28 ms | █  2
  29 ms | █  2
  31 ms | █████████  20
  32 ms | ████████████████████  48
  33 ms | ████████████████████████████████████████  94
  34 ms | ██████████████████████  52
  35 ms | ████████████  28
  36 ms | █████████  21
  37 ms | █████████  20
  38 ms | ████████  19
  39 ms | ████████  19
  40 ms | ███████  17
  41 ms | ███████  17
  42 ms | ██████████  23
  43 ms | ██████  15
  44 ms | ██████  14
  45 ms | █████████  20
  46 ms | ███████  17
  47 ms | █████  12
  48 ms | █████  12
  49 ms | ██  5
  50 ms | ███  7
  51 ms |   1
  52 ms | █  2
  54 ms |   1
  60 ms |   1
  65 ms | █  2
  66 ms |   1
  71 ms |   1
  79 ms |   1
```

**Extras:**

- `biome` = `minecraft:savanna`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `4.00`
- `entity_count_delta` = `1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `5.00`
- `preload_duration_ms` = `68.00`
- `seed` = `7481.00`
- `fps_0p1pct_low` = `12.55`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.15`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `68.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `14.34`
- `surface_water_ratio` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 24823 ms  |  Sample ticks: 400

**FPS**  avg `28.93`, min `13.54`, p50 `28.51`, p95 `46.77`, p99 `56.03`, 1%low `14.29`, 0.1%low `13.54`, std `8.42`

**Frame time (ms)**  avg `36.72`, p50 `35.07`, p95 `48.40`, p99 `63.57`, p99.9 `72.65`, max `73.86`

**Client tick (ms)**  avg `0.36`, p95 `0.52`, max `3.29`

**Memory**  start `2947 MB`, end `3037 MB`, peak `3989 MB`, GC `22 events / 226 ms`

**FPS over sampling window (ASCII):**

```
 37.3 |                                                               █                
 36.1 |                                                               █                
 35.0 |                                                               █                
 33.8 |  █                    █                                       █            █   
 32.7 |  █                    █                                       █    █  █    █   
 31.6 |  █        █           █       █   █                 █         █    █  ██   █   
 30.4 |  █   █    █ ██      █ █      ██   █         ████  █ █ █  ██   █    █  ██   █  █
 29.3 | ███  █    █ ██  ██  ███    █ ██   █ █  █   █████  █ █ █  ███  █    █  ██   █  █
 28.2 |████ ███ █ █ ███████ ██████ ████ █████████  █████  █ ███ ████  █    █  ██   ██ █
 27.0 |████████ ███████████ ██████████████████████ ████████ ███ ████ ██  █ ██ ████ ████
 25.9 |███████████████████████████████████████████████████████████████████ ████████████
 24.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  10 ms |   1
  11 ms |   1
  13 ms | █  2
  16 ms |   1
  17 ms |   1
  18 ms | █  2
  19 ms | ██  4
  20 ms | ████  9
  21 ms | ███████  16
  22 ms | ██  5
  23 ms | ███  7
  24 ms | █  2
  25 ms | █  2
  26 ms | █  3
  28 ms |   1
  29 ms |   1
  30 ms | ███  6
  31 ms | ████████  18
  32 ms | █████████████████████████  56
  33 ms | ████████████████████████████████████████  91
  34 ms | ██████████████████  41
  35 ms | █████████████  30
  36 ms | ███████████  26
  37 ms | █████████  20
  38 ms | ███████  15
  39 ms | ██████████  23
  40 ms | ███████  15
  41 ms | ████  10
  42 ms | ██████  14
  43 ms | █████████  20
  44 ms | █████████  21
  45 ms | ███████  16
  46 ms | ██████  14
  47 ms | ███████  16
  48 ms | █████  12
  49 ms |   1
  50 ms | ██  5
  51 ms | █  3
  52 ms |   1
  54 ms |   1
  56 ms | █  2
  57 ms | █  2
  62 ms | █  2
  64 ms |   1
  65 ms |   1
  69 ms | █  2
  71 ms |   1
  73 ms |   1
```

**Extras:**

- `biome` = `minecraft:swamp`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `56.00`
- `entity_count_delta` = `-55.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `1761.00`
- `seed` = `7487.00`
- `fps_0p1pct_low` = `13.54`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.24`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `49.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `14.29`
- `surface_water_ratio` = `0.08`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `28.60`, min `15.84`, p50 `28.35`, p95 `44.52`, p99 `62.14`, 1%low `16.68`, 0.1%low `15.84`, std `9.03`

**Frame time (ms)**  avg `37.16`, p50 `35.27`, p95 `49.32`, p99 `57.44`, p99.9 `61.98`, max `63.13`

**Client tick (ms)**  avg `0.46`, p95 `0.64`, max `8.07`

**Memory**  start `2517 MB`, end `3556 MB`, peak `4226 MB`, GC `23 events / 221 ms`

**FPS over sampling window (ASCII):**

```
 34.3 |                                     █                                          
 33.4 |            █                        █                            █             
 32.5 |            ██        █              █   █                        █             
 31.5 |            ███       █         █    █   █        █               █             
 30.6 |  █       █ ███   █   ██   █    ██   █   █   █    █               █     █       
 29.7 |  █       █ ████  ███ ███  █    ██   █  ██   █    █   ██       █  ██    █       
 28.8 |  ███   █ ███████ ███ ███  █    ███  █████ █ █ █  █   ███      █  ███  ██   █   
 27.8 |  ███ ███ ███████████ ████ ██ █ ███  █████ █ █ █  ██  █████  █ █  ████ ██   █  █
 26.9 |█ ███████████████████ █████████████  █████ █ █ ██████ █████ ████  ███████ ███ ██
 26.0 |█████████████████████ ██████████████ ███████ █ ██████ ███████████████████████ ██
 25.1 |██████████████████████████████████████████████ █████████████████████████████████
 24.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   7 ms | █  1
  13 ms | █  2
  14 ms | █  2
  15 ms | █  1
  17 ms | █  1
  18 ms | █  1
  19 ms | ██  4
  20 ms | ███  5
  21 ms | ████  8
  22 ms | ████  8
  23 ms | ████  7
  24 ms | ███  5
  25 ms | ██  4
  26 ms | █  2
  27 ms | █  2
  28 ms | █  2
  29 ms | ██  4
  30 ms | ███  5
  31 ms | ████████  16
  32 ms | ██████████████████████████  50
  33 ms | ████████████████████████████████████████  78
  34 ms | █████████████████████████████  56
  35 ms | ██████████  20
  36 ms | ███████████  21
  37 ms | ██████████  19
  38 ms | ███████  13
  39 ms | ████████  16
  40 ms | ████████  16
  41 ms | ███████  14
  42 ms | ████████  15
  43 ms | ██████████  19
  44 ms | █████████  18
  45 ms | █████████  17
  46 ms | ███████  14
  47 ms | █████████████  26
  48 ms | ████████  15
  49 ms | ██████  12
  50 ms | ███  5
  51 ms | ██  4
  52 ms | █  2
  53 ms | █  1
  57 ms | ██  4
  58 ms | █  1
  59 ms | █  1
  61 ms | █  1
  63 ms | █  1
```

**Extras:**

- `biome` = `minecraft:cherry_grove`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `30.00`
- `entity_count_delta` = `-29.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `42.00`
- `seed` = `7499.00`
- `fps_0p1pct_low` = `15.84`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.91`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `68.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `16.68`
- `surface_water_ratio` = `0.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 23291 ms  |  Sample ticks: 400

**FPS**  avg `28.65`, min `16.31`, p50 `28.85`, p95 `44.98`, p99 `52.46`, 1%low `17.33`, 0.1%low `16.31`, std `8.72`

**Frame time (ms)**  avg `36.66`, p50 `34.66`, p95 `48.48`, p99 `54.78`, p99.9 `60.81`, max `61.30`

**Client tick (ms)**  avg `0.33`, p95 `0.49`, max `4.16`

**Memory**  start `4417 MB`, end `3493 MB`, peak `4564 MB`, GC `19 events / 196 ms`

**FPS over sampling window (ASCII):**

```
 50.1 |                                                                        █       
 47.8 |                                                                        █       
 45.5 |                                                                        █       
 43.2 |                                                                        █       
 41.0 |                                                                        █       
 38.7 |                                                                        █       
 36.4 |                                                                        █       
 34.1 |                                                                        █       
 31.8 |  █     █         █    █                   █           █          █ █ █ █ █     
 29.6 | ███   █████ ██   █    █  ██ ██       █ █  █  █  ██    ██  █ █ █  █ █ █ █ ███  █
 27.3 | ████████████████ ██████ ████████████ █████████ ████ ████████████████████ ██████
 25.0 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   6 ms |   1
  15 ms |   1
  17 ms |   1
  18 ms | █  2
  19 ms | ███  7
  20 ms | ███  7
  21 ms | ███  7
  22 ms | █  3
  23 ms |   1
  24 ms | █  2
  25 ms | ██  5
  26 ms | █  3
  27 ms |   1
  28 ms |   1
  29 ms | █  2
  30 ms |   1
  31 ms | ████████████  27
  32 ms | ████████████████████████████  62
  33 ms | ████████████████████████████████████████  88
  34 ms | ██████████████████████████████  67
  35 ms | ███████████  25
  36 ms | ██████████  21
  37 ms | ███████████  24
  38 ms | █████  12
  39 ms | ██████████  22
  40 ms | █████  11
  41 ms | ██████████  21
  42 ms | █████  12
  43 ms | █████  10
  44 ms | ████████  18
  45 ms | ██████  13
  46 ms | ████████  17
  47 ms | ██████  14
  48 ms | ███████  15
  49 ms | ███  7
  50 ms |   1
  51 ms |   1
  52 ms | █  3
  53 ms | █  3
  54 ms |   1
  55 ms | ██  4
  60 ms |   1
  61 ms |   1
```

**Extras:**

- `biome` = `minecraft:badlands`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `2.00`
- `entity_count_delta` = `-1.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `251.00`
- `seed` = `7507.00`
- `fps_0p1pct_low` = `16.31`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.28`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `48.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `17.33`
- `surface_water_ratio` = `0.07`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 23087 ms  |  Sample ticks: 400

**FPS**  avg `28.52`, min `12.08`, p50 `28.22`, p95 `44.70`, p99 `56.44`, 1%low `14.01`, 0.1%low `12.08`, std `8.57`

**Frame time (ms)**  avg `37.26`, p50 `35.43`, p95 `50.02`, p99 `63.78`, p99.9 `79.58`, max `82.76`

**Client tick (ms)**  avg `0.38`, p95 `0.49`, max `2.60`

**Memory**  start `2465 MB`, end `4311 MB`, peak `4564 MB`, GC `19 events / 198 ms`

**FPS over sampling window (ASCII):**

```
 38.9 |                                          █                                     
 37.6 |                                          █                                     
 36.3 |                                          █    █                                
 35.0 |                                          █    █         █                      
 33.7 |                                          █    █         █              █       
 32.5 |              █                           █    █   █     █              █   █   
 31.2 |              █              █        █   █    █   ██  █ █  █           █  ██   
 29.9 |          █ █ █              █ █     ██   █    ██ ███  █ █  █ █  █   █  ██ ██ █ 
 28.6 |   █  █   █ █ █  █ ███ █ ██  ███     ██ ███    ██ ████ █ █  █ █  █   █  ███████ 
 27.3 |█████ ███ █ █ ██ ███████ ███ ████████████████  ██ ████ ████ ███ ██  ██ ████████ 
 26.0 |█████████████ ██████████████ █████████████████ ████████████ ████████████████████
 24.7 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  10 ms | █  1
  11 ms | █  2
  12 ms | █  1
  13 ms | █  1
  17 ms | █  2
  18 ms | █  1
  19 ms | ████  7
  20 ms | ███  6
  21 ms | ███  5
  22 ms | ███  5
  23 ms | ███  6
  24 ms | ███  5
  25 ms | ██  3
  27 ms | █  2
  28 ms | █  2
  29 ms | █  2
  30 ms | ████  7
  31 ms | ███████████  21
  32 ms | ████████████████████████  45
  33 ms | ████████████████████████████████████████  76
  34 ms | ███████████████████████████  52
  35 ms | █████████████████  33
  36 ms | ████████████  23
  37 ms | ████████  16
  38 ms | █████████  17
  39 ms | █████████████  24
  40 ms | ███████████  20
  41 ms | ███████  13
  42 ms | █████  9
  43 ms | █████████  17
  44 ms | █████████  18
  45 ms | ███████████  20
  46 ms | ███████  14
  47 ms | ███████  13
  48 ms | █████  9
  49 ms | █████  10
  50 ms | ████  7
  51 ms | ██  3
  52 ms | ██  3
  53 ms | █  1
  54 ms | ██  4
  55 ms | █  1
  57 ms | █  1
  58 ms | █  1
  63 ms | █  2
  64 ms | █  2
  68 ms | █  1
  76 ms | █  1
  82 ms | █  1
```

**Extras:**

- `biome` = `minecraft:dark_forest`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `53.00`
- `entity_count_delta` = `-52.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `77.00`
- `seed` = `7517.00`
- `fps_0p1pct_low` = `12.08`
- `part` = `1.00`
- `fps_harmonic_avg` = `26.84`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `61.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `14.01`
- `surface_water_ratio` = `0.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 23101 ms  |  Sample ticks: 400

**FPS**  avg `28.54`, min `15.21`, p50 `28.43`, p95 `44.31`, p99 `52.66`, 1%low `17.20`, 0.1%low `15.21`, std `7.55`

**Frame time (ms)**  avg `36.65`, p50 `35.18`, p95 `48.72`, p99 `53.72`, p99.9 `61.50`, max `65.75`

**Client tick (ms)**  avg `0.35`, p95 `0.52`, max `3.30`

**Memory**  start `4351 MB`, end `4758 MB`, peak `4840 MB`, GC `19 events / 198 ms`

**FPS over sampling window (ASCII):**

```
 43.2 |                                                        █                       
 41.5 |                                                        █                       
 39.8 |                                                        █                       
 38.1 |                                                        █                       
 36.4 |                                                        █                       
 34.6 |                                                        █                       
 32.9 |                  █                  █                  █           █     █     
 31.2 |   ███         ██ █  █               █   █     █        █ █     █   █     █     
 29.5 | █ ███  █    ████ █  █ ██    █ █     █  ██ ██  █   █    ███  █  █   █  ██ █    █
 27.8 |███████ ███  ████ ██ █████  ██ █ ██  █ ██████  ███████████████ ██ ██████████  ██
 26.1 |██████████████████████████████ ███████ █████████████████████████████████████████
 24.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   8 ms |   1
  16 ms |   1
  17 ms | █  2
  18 ms | █  2
  19 ms | █  3
  20 ms | ███  7
  21 ms | ███  7
  22 ms | ███  7
  23 ms | ██  4
  24 ms | █  2
  25 ms |   1
  26 ms |   1
  27 ms | █  2
  28 ms | █  3
  29 ms | █  3
  30 ms | ██  5
  31 ms | ███████  15
  32 ms | ██████████████████████████  56
  33 ms | ████████████████████████████████████████  87
  34 ms | ██████████████████████████  56
  35 ms | ████████████████████  43
  36 ms | ███████████  24
  37 ms | █████████  20
  38 ms | █████████  20
  39 ms | ████████  18
  40 ms | ███████  15
  41 ms | ███████  16
  42 ms | █████████  20
  43 ms | █████████  20
  44 ms | ███████  15
  45 ms | ██████████  21
  46 ms | ██████  13
  47 ms | █  2
  48 ms | ███  7
  49 ms | ████  8
  50 ms | █  3
  51 ms | █  3
  52 ms | ██  4
  53 ms | █  3
  54 ms |   1
  55 ms |   1
  57 ms | █  2
  65 ms |   1
```

**Extras:**

- `biome` = `minecraft:windswept_hills`
- `part_label` = `Main Benchmark (no shaders)`
- `stamped_fallback` = `false`
- `scan_fallback` = `false`
- `flyby_blocks_per_tick` = `1.20`
- `x_offset_used` = `0.00`
- `entity_count_sample_start` = `35.00`
- `entity_count_delta` = `-20.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `15.00`
- `preload_duration_ms` = `33.00`
- `seed` = `7523.00`
- `fps_0p1pct_low` = `15.21`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.28`
- `stamped_blocks` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `74.00`
- `z_offset_used` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `preset_full` = `0.00`
- `fps_1pct_low` = `17.20`
- `surface_water_ratio` = `0.02`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 23084 ms  |  Sample ticks: 400

**FPS**  avg `28.51`, min `19.94`, p50 `29.44`, p95 `31.36`, p99 `47.49`, 1%low `20.46`, 0.1%low `19.94`, std `5.18`

**Frame time (ms)**  avg `36.02`, p50 `33.97`, p95 `45.79`, p99 `47.94`, p99.9 `49.54`, max `50.14`

**Client tick (ms)**  avg `0.27`, p95 `0.33`, max `0.88`

**Memory**  start `3968 MB`, end `3759 MB`, peak `4772 MB`, GC `5 events / 32 ms`

**FPS over sampling window (ASCII):**

```
 33.0 |                                                          █                     
 32.4 |                                                          █                     
 31.8 |                                                          █                     
 31.2 |     █        █                                           █           ██        
 30.6 |     █        █        █                █              ██ █           ██       █
 30.0 |   █ █        █ █      █        █ █     █      █   █   ██ █           ██       █
 29.4 |   █ █   █    █ █      █ █  █   █ ██  █ █      █   █ █ ██ █           ██       █
 28.8 |   █ █   █    █ █      █ █  █   █ ██  █ ██ █   █   █ █ ██ █     ██    ██       █
 28.2 |█  █ █   █ █ █████  █  █ █  █  ██████ █ ██ ██  ██ ██ ████ ██  █ █████ ██ ███ █ █
 27.6 |█  █ █ ████████████ ██ ██████ █████████ ██ ███ ██ ██ ████ ██████████████ █████ █
 27.0 |██ █ █████████████████████████████████████ ███ ██ ███████ ████████████████████ █
 26.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms |   1
  20 ms | █  3
  21 ms | ███  17
  22 ms | █  3
  24 ms |   1
  31 ms |   1
  32 ms | ███████  39
  33 ms | ████████████████████████████████████████  213
  34 ms | ██████  30
  35 ms | ███████  38
  36 ms | ████  19
  37 ms | ███  17
  38 ms | ████  21
  39 ms | ███  18
  40 ms | ████  22
  41 ms | █████  25
  42 ms | ██  11
  43 ms | ███  15
  44 ms | ███  14
  45 ms | ███  18
  46 ms | ██  13
  47 ms | ██  8
  48 ms | █  4
  49 ms |   1
  50 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `entity_count_sample_start` = `1.00`
- `preload_duration_ms` = `68.00`
- `preset_long` = `0.00`
- `seed` = `1923.00`
- `fps_1pct_low` = `20.46`
- `preset_full` = `0.00`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `entity_count_sample_end` = `1.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `27.76`
- `preset_quick` = `1.00`
- `fps_0p1pct_low` = `19.94`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 23099 ms  |  Sample ticks: 400

**FPS**  avg `31.07`, min `13.54`, p50 `28.05`, p95 `50.58`, p99 `60.03`, 1%low `15.30`, 0.1%low `13.54`, std `11.77`

**Frame time (ms)**  avg `36.29`, p50 `35.65`, p95 `56.85`, p99 `60.64`, p99.9 `69.86`, max `73.87`

**Client tick (ms)**  avg `3.14`, p95 `4.29`, max `15.99`

**Memory**  start `4083 MB`, end `3635 MB`, peak `4847 MB`, GC `8 events / 54 ms`

**FPS over sampling window (ASCII):**

```
 42.9 |                 █                                                              
 41.5 |                 █ █  █                                                         
 40.0 |                 █ █  █                                                         
 38.5 |                 █ █  █                                                         
 37.0 |                 █ █  █                                                         
 35.5 |              █  █ █  █                                  █                      
 34.0 |    █     █   █  █ ██ █        █          █        █ █   █    █                 
 32.5 | █  █     ██ ███ █ ██ ██  █    █ ██  █    ██   ██  █ █ █ █  █ █    █      █  █  
 31.0 |██  █  ██ ██ ███ █ ██ ██████   ██████████ ██ █ ██  █████ ████ ███  █     ███ █ █
 29.5 |█████ ███ ██ ███ █ █████████ █ ██████████ ████████ █████ ████ ████ █   █████ █ █
 28.0 |█████████████████████████████████████████████████████████████ ██████████████ █ █
 26.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   9 ms | █  1
  10 ms | █  1
  11 ms | █  1
  12 ms | █  1
  14 ms | █  1
  16 ms | ███  2
  17 ms | ███  2
  18 ms | ██████████  8
  19 ms | ██████████████████████  17
  20 ms | ████████████████████████████  22
  21 ms | ███████████████████████  18
  22 ms | ████████████████████████████████  25
  23 ms | ████████████████████████████████  25
  24 ms | ███████████████  12
  25 ms | █████████  7
  26 ms | ████████████  9
  27 ms | ██████  5
  28 ms | █████  4
  29 ms | ██████  5
  30 ms | ██████████████████████████████  23
  31 ms | ██████████████████  14
  32 ms | █████████████████  13
  33 ms | ████████████████████████████████  25
  34 ms | ███████████████████████  18
  35 ms | ████████████████████████████████████  28
  36 ms | ████████████████████████████████████████  31
  37 ms | ██████████████████  14
  38 ms | █████████████  10
  39 ms | █████  4
  40 ms | ███████████████  12
  41 ms | ████████  6
  42 ms | ██████████████  11
  43 ms | ██████████████████████████████  23
  44 ms | ██████████████████  14
  45 ms | █████████████████████  16
  46 ms | ████████████  9
  47 ms | █████████████████  13
  48 ms | ██████████████  11
  49 ms | ████████████  9
  50 ms | ██████████  8
  51 ms | ██████  5
  52 ms | █████████████  10
  53 ms | █████████  7
  54 ms | ███████████████  12
  55 ms | ██████████  8
  56 ms | ████████  6
  57 ms | █████████  7
  58 ms | █████  4
  59 ms | █████  4
  60 ms | ████████  6
  64 ms | █  1
  65 ms | █  1
  66 ms | █  1
  73 ms | █  1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `13.54`
- `fps_1pct_low` = `15.30`
- `entity_count_sample_start` = `1.00`
- `particle_types` = `16.00`
- `preload_duration_ms` = `73.00`
- `seed` = `2521.00`
- `entity_count_delta` = `0.00`
- `fps_harmonic_avg` = `27.56`
- `part` = `1.00`
- `particles_spawned` = `256000.00`
- `preset_full` = `0.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 23109 ms  |  Sample ticks: 400

**FPS**  avg `28.57`, min `18.64`, p50 `29.38`, p95 `45.23`, p99 `50.99`, 1%low `19.76`, 0.1%low `18.64`, std `6.18`

**Frame time (ms)**  avg `36.29`, p50 `34.04`, p95 `46.57`, p99 `48.93`, p99.9 `52.66`, max `53.64`

**Client tick (ms)**  avg `0.28`, p95 `0.35`, max `0.66`

**Memory**  start `3930 MB`, end `3440 MB`, peak `4846 MB`, GC `5 events / 33 ms`

**FPS over sampling window (ASCII):**

```
 39.1 |        █                                                                       
 37.9 |        █                                                                       
 36.6 |        █                                                                       
 35.4 |        █                                                                       
 34.2 |        █                                                                       
 33.0 |     █  █                                  █    █                               
 31.8 |     █  █    █                             █    █               █               
 30.6 |     █  █    █    █  ██        █   █      ██ █  █  █            █         █     
 29.4 |   █ █  █ ██ █ ██ ██ ██        ██  ██  █ ███ ██ █  █     █      ██  ██  ███  ██ 
 28.2 |   █ █  █ ██ █ █████ ██    █ █ ██  ███ █████ ██ ██ █    ███ ██████  ██  ████████
 27.0 | █ █ █  ████████████████ █████ ████████████████ ███████████ ██████████ █████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  15 ms |   1
  17 ms |   1
  18 ms | █  3
  19 ms |   2
  20 ms | ██  11
  21 ms | ██  9
  22 ms | █  7
  23 ms |   2
  32 ms | ████████  38
  33 ms | ████████████████████████████████████████  197
  34 ms | ███████  36
  35 ms | █████  25
  36 ms | ████  20
  37 ms | ████  20
  38 ms | ███  16
  39 ms | ██  10
  40 ms | ███  17
  41 ms | ████  21
  42 ms | ███  16
  43 ms | ███  15
  44 ms | ███  16
  45 ms | █████  24
  46 ms | ████  21
  47 ms | ██  11
  48 ms | ██  8
  50 ms |   2
  51 ms |   1
  53 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `waves_spawned` = `6.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `33.00`
- `seed` = `9043.00`
- `fps_0p1pct_low` = `18.64`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.56`
- `neighbour_updates` = `0.00`
- `sources_placed_total` = `54.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `scheduled_fluid_ticks` = `3190.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `0.00`
- `fps_1pct_low` = `19.76`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 23114 ms  |  Sample ticks: 400

**FPS**  avg `28.36`, min `19.25`, p50 `29.35`, p95 `31.50`, p99 `47.70`, 1%low `20.13`, 0.1%low `19.25`, std `5.20`

**Frame time (ms)**  avg `36.26`, p50 `34.07`, p95 `46.44`, p99 `48.32`, p99.9 `51.37`, max `51.94`

**Client tick (ms)**  avg `0.28`, p95 `0.34`, max `0.65`

**Memory**  start `2825 MB`, end `3117 MB`, peak `4849 MB`, GC `5 events / 36 ms`

**FPS over sampling window (ASCII):**

```
 31.5 |                              █                █                                
 31.0 |  █                        █  █      █         █      █                 █  █    
 30.4 |  █    █  █   █        █   █  █      █         █    █ █              █  █ ██    
 29.9 | ██    █  █   █        █   █  █      █         █    █ █ █            █  █ ██    
 29.4 | ██    █  █ █ █        █   █ ██    █ █         █    █ █ █    █   █   █  █ ██ █  
 28.9 | ██  █ █  █ █ █   █  █ █   █ ██    █ █    █    █    █ █ █  █ █   █   █  █ ██ █  
 28.4 | ██  █ █  █ █ █   █  █ █  ██ ██   ██ █   ██ █  ██   █ █ ██ █ █   █   █  █ █████ 
 27.8 | █████ █  ███ █ █ █  █ █ ██████ █ ██ ██ ███ █  ██  ██ █ ██ ███████   █ ██ ██████
 27.3 | █████ ██ ███ █████ ████ ██████ ███████ ███ █  ██  ████ ██ ████████  █ ██ ██████
 26.8 | ██████████████████████████████████████████ ██ ███████████ ████████ ██ █████████
 26.3 | █████████████████████████████████████████████████████████████████████ █████████
 25.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  19 ms |   1
  20 ms | █  6
  21 ms | ██  13
  22 ms | █  5
  23 ms |   1
  31 ms | █  3
  32 ms | █████  27
  33 ms | ████████████████████████████████████████  210
  34 ms | █████████  45
  35 ms | █████  28
  36 ms | █████  25
  37 ms | ██  12
  38 ms | ████  20
  39 ms | ███  18
  40 ms | ███  15
  41 ms | ████  21
  42 ms | ██  12
  43 ms | ███  15
  44 ms | ████  21
  45 ms | ███  17
  46 ms | ███  16
  47 ms | ██  9
  48 ms | ██  8
  49 ms |   1
  50 ms |   1
  51 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `19.25`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.58`
- `fps_1pct_low` = `20.13`
- `blocks_per_toggle` = `256.00`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `toggles` = `22.00`
- `preload_duration_ms` = `33.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `9007.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 23092 ms  |  Sample ticks: 400

**FPS**  avg `28.40`, min `20.01`, p50 `29.46`, p95 `43.57`, p99 `47.20`, 1%low `20.49`, 0.1%low `20.01`, std `5.34`

**Frame time (ms)**  avg `36.26`, p50 `33.95`, p95 `46.34`, p99 `48.16`, p99.9 `49.56`, max `49.97`

**Client tick (ms)**  avg `0.29`, p95 `0.36`, max `0.44`

**Memory**  start `2935 MB`, end `4567 MB`, peak `4867 MB`, GC `2 events / 18 ms`

**FPS over sampling window (ASCII):**

```
 32.6 |             █                                                                  
 32.0 |             █                                 █  █     █                       
 31.3 |             █               ██                █  █     █   █                   
 30.7 |             █     █         ██                █  █   █ █   █   █               
 30.0 |             █     █   █ █   ██         █      █  ██  █ █ █ █ █ █  █            
 29.3 |█   █        █   ███   █ ██  ██ ██      █      ██ ██ ██ █ █ █ █ █ ██   █        
 28.7 |█   █        ██ ████ █ █ ██  ██ ██      █  ██  ██ ██ ██ █ █ █ █ █████  █   █    
 28.0 |█ █ █     █  ██ ████ █ ████  ██ ██  ███ ██ ███ ██ █████ ███ █ █ █████  ██  █ █ █
 27.4 |███ ████ ██ ███ ████ █ ████ ███████████ ██ ███ ██ █████ █████ █ ██████████ ███ █
 26.7 |████████ ██████████████████ ███████████ ██████ ██ ███████████ █ ██████████ █████
 26.0 |████████ ██████████████████████████████ █████████████████████ ██████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  18 ms |   1
  20 ms |   2
  21 ms | ████  20
  22 ms | █  5
  23 ms |   1
  25 ms |   1
  27 ms |   1
  28 ms |   1
  29 ms |   2
  30 ms |   1
  32 ms | █████  29
  33 ms | ████████████████████████████████████████  218
  34 ms | █████  29
  35 ms | █████  26
  36 ms | ████  23
  37 ms | ███  14
  38 ms | ██  12
  39 ms | ██  13
  40 ms | ████  21
  41 ms | ████  23
  42 ms | ███  15
  43 ms | ███  19
  44 ms | ████  24
  45 ms | ███  16
  46 ms | ███  19
  47 ms | █  7
  48 ms | █  6
  49 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_chunks` = `81.00`
- `fps_0p1pct_low` = `20.01`
- `hoppers_built` = `400.00`
- `neighbour_updates` = `0.00`
- `fps_harmonic_avg` = `27.58`
- `restocks` = `20.00`
- `fps_1pct_low` = `20.49`
- `entity_count_sample_end` = `1.00`
- `preset_quick` = `1.00`
- `block_state_changes` = `0.00`
- `preset_full` = `0.00`
- `entity_count_delta` = `0.00`
- `part` = `1.00`
- `preload_duration_ms` = `45.00`
- `scheduled_block_ticks` = `0.00`
- `entity_count_sample_start` = `1.00`
- `preset_long` = `0.00`
- `seed` = `8011.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 23098 ms  |  Sample ticks: 400

**FPS**  avg `28.54`, min `19.89`, p50 `29.45`, p95 `44.12`, p99 `50.32`, 1%low `20.17`, 0.1%low `19.89`, std `5.73`

**Frame time (ms)**  avg `36.18`, p50 `33.95`, p95 `46.60`, p99 `48.73`, p99.9 `50.15`, max `50.29`

**Client tick (ms)**  avg `0.28`, p95 `0.36`, max `0.72`

**Memory**  start `2868 MB`, end `2886 MB`, peak `4876 MB`, GC `4 events / 32 ms`

**FPS over sampling window (ASCII):**

```
 33.1 |  █                                                   █                         
 32.4 |  █                                                   █                   █     
 31.7 |  █              █                     █              █     █             █     
 31.0 |  █        █     █                     █            █ █     █             █     
 30.3 |  █        █     █                 █   ██           █ █   █ █           █ █     
 29.6 |  █      █ ██    █                 █   ██           █ █  ████     ████  █ █ █   
 28.9 |  ██    ██ ██    █  █      ██    █ █ █ ██  █  █   █ █████████ █ ██████  █ █ █ █ 
 28.2 |  ██   ██████    █  █ █ █  ████ ██████ ██ ██  ███ █ █████████ █ ███████ ███ █ █ 
 27.5 | ███  ████████  ██ ████ ██ ███████████ ██ ███ █████████████████████████ ███ █ ██
 26.8 |██████████████████████████ ████████████████████████████████████████████ ███ █ ██
 26.1 |██████████████████████████ █████████████████████████████████████████████████████
 25.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
  17 ms |   1
  18 ms |   1
  19 ms | █  5
  20 ms | ██  10
  21 ms | █  8
  22 ms | █  5
  23 ms |   1
  29 ms |   1
  31 ms |   2
  32 ms | █████  28
  33 ms | ████████████████████████████████████████  218
  34 ms | ████████  41
  35 ms | █████  25
  36 ms | ███  17
  37 ms | ██  13
  38 ms | ██  13
  39 ms | ████  22
  40 ms | ███  18
  41 ms | ████  20
  42 ms | ██  11
  43 ms | ███  17
  44 ms | ███  17
  45 ms | ████  22
  46 ms | ████  22
  47 ms | █  7
  48 ms | █  3
  49 ms | █  3
  50 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `block_state_changes` = `0.00`
- `oscillations` = `20.00`
- `entity_count_sample_start` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_long` = `0.00`
- `entity_count_sample_end` = `1.00`
- `preload_duration_ms` = `45.00`
- `seed` = `8053.00`
- `fps_0p1pct_low` = `19.89`
- `chests_built` = `64.00`
- `part` = `1.00`
- `fps_harmonic_avg` = `27.64`
- `neighbour_updates` = `0.00`
- `preset_quick` = `1.00`
- `preload_chunks` = `81.00`
- `comparators_built` = `64.00`
- `preset_full` = `0.00`
- `scheduled_block_ticks` = `1152.00`
- `fps_1pct_low` = `20.17`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195847 ms  |  Sample ticks: 3600

**FPS**  avg `71.56`, min `12.31`, p50 `47.42`, p95 `157.59`, p99 `219.75`, 1%low `15.89`, 0.1%low `13.75`, std `50.53`

**Frame time (ms)**  avg `22.49`, p50 `21.09`, p95 `49.40`, p99 `59.09`, p99.9 `68.63`, max `81.25`

**Client tick (ms)**  avg `0.84`, p95 `1.15`, max `6.53`

**Memory**  start `3641 MB`, end `4187 MB`, peak `5162 MB`, GC `136 events / 1237 ms`

**FPS over sampling window (ASCII):**

```
117.6 |             ██                                 █                               
109.7 |            █████                              ███                              
101.7 |         █  ██████ █ █  █████ ██   █████      ████                              
 93.7 |       ████████████████████████████████████ ███████                             
 85.8 |      █████████████████████████████████████████████                             
 77.8 |      █████████████████████████████████████████████                             
 69.9 |      █████████████████████████████████████████████                             
 61.9 |      █████████████████████████████████████████████                             
 54.0 |      █████████████████████████████████████████████                             
 46.0 |      █████████████████████████████████████████████                             
 38.1 |     ██████████████████████████████████████████████████ ████████  █     █   ████
 30.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   3 ms | ██  39
   4 ms | ████  85
   5 ms | ████████  173
   6 ms | █████████████████  378
   7 ms | █████████████████████████████████  707
   8 ms | ████████████████████████████████████████  870
   9 ms | ███████████████████████  490
  10 ms | ████████  179
  11 ms | ███  64
  12 ms | █  26
  13 ms | █  28
  14 ms | █  13
  15 ms | █  17
  16 ms | █  25
  17 ms | ██  49
  18 ms | ███████  163
  19 ms | ██████████████  311
  20 ms | ████████████████  357
  21 ms | ████████████████  356
  22 ms | ████████████████  350
  23 ms | ███████████████  316
  24 ms | ██████████  212
  25 ms | ████████  164
  26 ms | ██████  133
  27 ms | ████  92
  28 ms | ███  71
  29 ms | ███  59
  30 ms | ███  56
  31 ms | ████  94
  32 ms | ███████  144
  33 ms | ████████  170
  34 ms | ██████  137
  35 ms | █████  99
  36 ms | █████  108
  37 ms | █████  114
  38 ms | █████  116
  39 ms | █████  101
  40 ms | ████  83
  41 ms | ████  85
  42 ms | ████  81
  43 ms | ████  93
  44 ms | █████  99
  45 ms | ████  88
  46 ms | ████  84
  47 ms | ███  64
  48 ms | ██  48
  49 ms | █  30
  50 ms | █  23
  51 ms | █  28
  52 ms | █  31
  53 ms | ██  38
  54 ms | ██  35
  55 ms | ██  40
  56 ms | ██  35
  57 ms | ██  36
  58 ms | ██  33
  59 ms | █  24
  60 ms | █  14
  61 ms | █  13
  62 ms |   7
  63 ms |   5
  64 ms |   4
  65 ms |   3
  66 ms |   3
  68 ms |   4
  70 ms |   2
  71 ms |   1
  72 ms |   2
  73 ms |   1
  81 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `part` = `2.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `19.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `15.89`
- `fps_harmonic_avg` = `44.47`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `134.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `13.75`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `69.00`
- `trees_built` = `173.00`
- `phase` = `0.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 194656 ms  |  Sample ticks: 3600

**FPS**  avg `66.96`, min `12.56`, p50 `45.29`, p95 `147.37`, p99 `193.23`, 1%low `15.44`, 0.1%low `13.31`, std `47.89`

**Frame time (ms)**  avg `24.35`, p50 `22.08`, p95 `54.09`, p99 `60.69`, p99.9 `69.42`, max `79.59`

**Client tick (ms)**  avg `0.84`, p95 `1.13`, max `18.00`

**Memory**  start `3892 MB`, end `4455 MB`, peak `5165 MB`, GC `165 events / 1647 ms`

**FPS over sampling window (ASCII):**

```
105.4 |                       ██                                                       
 98.4 |     █████████   █     ████ █   █ ████████                                      
 91.3 |  ███████████████████████████████████████████                                   
 84.2 | ████████████████████████████████████████████                                   
 77.1 |█████████████████████████████████████████████                                   
 70.1 |█████████████████████████████████████████████                                   
 63.0 |██████████████████████████████████████████████                                  
 55.9 |██████████████████████████████████████████████                                  
 48.8 |██████████████████████████████████████████████                                  
 41.7 |██████████████████████████████████████████████                                  
 34.7 |███████████████████████████████████████████████████  ██  ██   ██  █         ██  
 27.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   2 ms |   1
   3 ms | █  20
   4 ms | ██  43
   5 ms | █████  100
   6 ms | ███████████████  304
   7 ms | █████████████████████████████  590
   8 ms | ████████████████████████████████████████  816
   9 ms | ███████████████████████  475
  10 ms | ███████████  224
  11 ms | █████  96
  12 ms | ██  37
  13 ms | █  16
  14 ms |   8
  15 ms | █  11
  16 ms | █  16
  17 ms | ██  46
  18 ms | █████  112
  19 ms | ███████████  224
  20 ms | █████████████  260
  21 ms | ██████████████  280
  22 ms | ███████████  227
  23 ms | ███████████  230
  24 ms | ██████████  206
  25 ms | ███████  140
  26 ms | █████  97
  27 ms | ████  72
  28 ms | ██  35
  29 ms | █  24
  30 ms | ██  34
  31 ms | ██████  121
  32 ms | ████████████  235
  33 ms | ████████████  244
  34 ms | ██████████  199
  35 ms | ██████  113
  36 ms | █████  93
  37 ms | ████  83
  38 ms | █████  107
  39 ms | ██████  126
  40 ms | █████  97
  41 ms | ████  88
  42 ms | ████  83
  43 ms | ████  84
  44 ms | ████  83
  45 ms | █████  98
  46 ms | █████  97
  47 ms | ████  72
  48 ms | ███  56
  49 ms | ██  41
  50 ms | ██  37
  51 ms | █  26
  52 ms | ██  42
  53 ms | ██  48
  54 ms | ███  53
  55 ms | ██  42
  56 ms | ███  58
  57 ms | ██  44
  58 ms | ██  50
  59 ms | ██  35
  60 ms | █  24
  61 ms | █  20
  62 ms |   10
  63 ms |   6
  64 ms |   5
  65 ms |   6
  66 ms |   8
  67 ms |   4
  69 ms |   4
  72 ms |   1
  73 ms |   1
  74 ms |   1
  76 ms |   1
  78 ms |   1
  79 ms |   1
```

**Extras:**

- `part_label` = `LowEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `lowEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `part` = `3.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `14.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `88.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `15.44`
- `fps_harmonic_avg` = `41.07`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `134.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `13.31`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `74.00`
- `trees_built` = `173.00`
- `phase` = `1.00`

### HighEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 193851 ms  |  Sample ticks: 3600

**FPS**  avg `31.85`, min `10.81`, p50 `29.07`, p95 `55.12`, p99 `109.01`, 1%low `14.34`, 0.1%low `12.12`, std `17.28`

**Frame time (ms)**  avg `37.33`, p50 `34.40`, p95 `59.65`, p99 `65.02`, p99.9 `75.28`, max `92.48`

**Client tick (ms)**  avg `0.83`, p95 `1.17`, max `20.23`

**Memory**  start `5142 MB`, end `3921 MB`, peak `5167 MB`, GC `137 events / 1316 ms`

**FPS over sampling window (ASCII):**

```
 36.8 |                   █                                                            
 36.1 |                   ██                                                           
 35.3 |                   ██                 █          █                              
 34.5 | █     █         █ ██              █  ██   █ █   █                              
 33.8 | ██ █  █         █ ██         █  ███  ██   █ █ █ █            █                 
 33.0 | ██ █  █     █ ███ ██ █ █     █  ███  ██   █ ███ █    █ █     █                 
 32.2 | ██ █ ██ █   █████ ████ ██    ██ ███ ███   █ ███ █    █ ██ █  █                 
 31.5 | ██ █ ██ █  ██████ ████ ████████ ███ ███ █ █████ ███████████  █                 
 30.7 |███ ███████████████████ ████████ ███ ███ █ ████████████████████     ████  █   █ 
 30.0 |███████████████████████ ████████ ████████████████████████████████   █████ ██  ██
 29.2 |██████████████████████████████████████████████████████████████████ █████████████
 28.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   4 ms |   2
   5 ms |   3
   6 ms | █  11
   7 ms | ██  14
   8 ms | ██  16
   9 ms | ██  16
  10 ms | ██  17
  11 ms | ██  21
  12 ms | █  8
  13 ms | █  8
  14 ms | █  9
  15 ms | ███  23
  16 ms | ███  30
  17 ms | █████  47
  18 ms | ███████████  93
  19 ms | ████████████████  139
  20 ms | █████████████████████  185
  21 ms | ███████████████  129
  22 ms | █████████  79
  23 ms | ███████  64
  24 ms | ██████████  84
  25 ms | ████████████  100
  26 ms | ████████████████  136
  27 ms | █████████████  112
  28 ms | ██████████  83
  29 ms | ███████  62
  30 ms | ████████  66
  31 ms | █████████████  109
  32 ms | █████████████████████████████████  289
  33 ms | ████████████████████████████████████████  346
  34 ms | █████████████████████████  220
  35 ms | ████████  65
  36 ms | ████  37
  37 ms | ███████  60
  38 ms | ██████  52
  39 ms | ███████████  91
  40 ms | █████████████  112
  41 ms | █████████  78
  42 ms | ███████████  92
  43 ms | ██████████  87
  44 ms | ████████████  104
  45 ms | ███████████████  132
  46 ms | ████████████  108
  47 ms | ████████████  105
  48 ms | ██████████  83
  49 ms | ████████  73
  50 ms | ████████  70
  51 ms | ██████████  84
  52 ms | ████████  71
  53 ms | █████████  81
  54 ms | ████████████  108
  55 ms | ███████████  93
  56 ms | █████████  77
  57 ms | █████████  80
  58 ms | ████████  69
  59 ms | ████████  65
  60 ms | ███████  57
  61 ms | ██████  48
  62 ms | ████  33
  63 ms | ██  17
  64 ms | ██  20
  65 ms | ██  14
  66 ms | █  11
  67 ms |   2
  68 ms |   2
  69 ms |   2
  70 ms |   4
  71 ms |   3
  72 ms |   3
  73 ms |   2
  75 ms |   1
  76 ms |   1
  79 ms |   1
  80 ms |   1
  83 ms |   1
  92 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader`
- `resource_pack` = `none`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `part` = `4.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `16.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `89.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `14.34`
- `fps_harmonic_avg` = `26.78`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `134.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `12.12`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `73.00`
- `trees_built` = `173.00`
- `phase` = `2.00`

### HighEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195025 ms  |  Sample ticks: 3600

**FPS**  avg `30.27`, min `15.05`, p50 `27.53`, p95 `50.42`, p99 `59.45`, 1%low `16.52`, 0.1%low `15.29`, std `12.43`

**Frame time (ms)**  avg `36.69`, p50 `36.32`, p95 `51.19`, p99 `58.47`, p99.9 `63.57`, max `66.44`

**Client tick (ms)**  avg `0.76`, p95 `0.98`, max `13.62`

**Memory**  start `3032 MB`, end `4954 MB`, peak `5163 MB`, GC `25 events / 186 ms`

**FPS over sampling window (ASCII):**

```
 33.7 |                                             █                                  
 33.3 |                                             █                                  
 32.8 |            ██                █    █         █                                  
 32.3 | █          ██        █       █    █         █   █                              
 31.8 | █          ██        █       █    █         █ █ █                              
 31.3 | █  █    ██ ██        █ █     ██ █ ██       ██ █ █                              
 30.9 | █  █    ██████   █   ███  █  ██ ████ █     ██ █ █                        █     
 30.4 | █ ███   ██████████   ████ █ ███ ███████   ███ █ █   █ █  █  █            █    █
 29.9 | █████ ████████████   ████ ██████████████ ████████  ██ █  █ ██   █   █ █ ██  █ █
 29.4 |██████████████████████████████████████████████████ ███ ██ █ ██   █  ██ █ ██  █ █
 28.9 |██████████████████████████████████████████████████████ ████ ██ ███████ █████████
 28.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   5 ms |   3
   6 ms |   1
   7 ms | █  7
   8 ms | █  10
   9 ms |   4
  10 ms |   4
  11 ms |   1
  12 ms |   1
  13 ms |   3
  14 ms |   2
  15 ms |   3
  16 ms | ██  14
  17 ms | ███  22
  18 ms | ████████  67
  19 ms | ████████████████  138
  20 ms | ██████████████████████  186
  21 ms | █████████████████████████  215
  22 ms | ██████████████  122
  23 ms | ████  38
  24 ms | █████  41
  25 ms | ███████  59
  26 ms | ███████  63
  27 ms | ████████  66
  28 ms | ███████  56
  29 ms | ██████  52
  30 ms | █████  40
  31 ms | ██████████████  119
  32 ms | ██████████████████████████████████  288
  33 ms | ████████████████████████████████████  307
  34 ms | ████████████████████████████████████████  339
  35 ms | ██████████████████  152
  36 ms | ██████████  87
  37 ms | ████████  66
  38 ms | ████████  67
  39 ms | ████████  66
  40 ms | █████████████  108
  41 ms | ██████████████████  151
  42 ms | ██████████████████████  190
  43 ms | ███████████████████████████████  263
  44 ms | ███████████████████████████████████████  333
  45 ms | ████████████████████████████████████  306
  46 ms | ██████████████████████████████  252
  47 ms | █████████████████  143
  48 ms | █████████████  106
  49 ms | ██████  50
  50 ms | ████  37
  51 ms | ████  32
  52 ms | ██  21
  53 ms | ███  22
  54 ms | ███  27
  55 ms | ████  31
  56 ms | ████  35
  57 ms | ████  32
  58 ms | ██  20
  59 ms | ██  14
  60 ms | █  12
  61 ms | █  5
  62 ms |   1
  63 ms |   1
  64 ms |   1
  65 ms |   3
  66 ms |   1
```

**Extras:**

- `part_label` = `HighEnd Shader + PBR Textures`
- `resource_pack` = `pbr.zip`
- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `shader_pack` = `highEnd.zip`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `segment_count` = `19.00`
- `part` = `5.00`
- `preload_chunks` = `81.00`
- `shader_in_use` = `1.00`
- `terrain_area_blocks` = `43473.00`
- `entity_count_delta` = `16.00`
- `other_entities_spawned` = `58.00`
- `preset_full` = `0.00`
- `entity_count_sample_end` = `90.00`
- `blocks_placed` = `3096347.00`
- `fps_1pct_low` = `16.52`
- `fps_harmonic_avg` = `27.26`
- `preset_quick` = `0.00`
- `preload_duration_ms` = `134.00`
- `villagers_spawned` = `36.00`
- `preset_long` = `0.00`
- `fps_0p1pct_low` = `15.29`
- `phase_count` = `4.00`
- `seed` = `27182.00`
- `iris_present` = `1.00`
- `entity_count_sample_start` = `74.00`
- `trees_built` = `173.00`
- `phase` = `3.00`

