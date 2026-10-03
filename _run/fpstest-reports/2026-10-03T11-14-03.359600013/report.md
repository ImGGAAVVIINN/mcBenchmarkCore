# MC Benchmark Core session — 2026-10-03T11:30:21.916394368+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12.1` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.178.04`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 2 | [Cows ×200 ring](#cows-200-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 3 | [Sheep ×200 ring](#sheep-200-ring) | Entities | 493.6 | 29.7 | 19.0 | 24.94 | 1.37 | 66 | 1897 |
| 4 | [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 5 | [Pigs ×250 ring](#pigs-250-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Villagers ×100 ring](#villagers-100-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 7 | [Chickens ×300 ring](#chickens-300-ring) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Item entities ×500](#item-entities-500) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [Item entities ×500](#item-entities-500) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 10 | [Item merge storm (cobblestone, mergeable)](#item-merge-storm-cobblestone-mergeable) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 846.0 | 31.0 | 20.0 | 23.98 | 4.11 | 19 | 546 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 1146.3 | 14.7 | 10.8 | 56.79 | 19.18 | 17 | 608 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 1182.6 | 12.0 | 8.4 | 62.20 | 18.13 | 24 | 803 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 1084.2 | 33.2 | 22.6 | 23.34 | 2.79 | 60 | 303 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 1108.1 | 32.5 | 20.9 | 23.93 | 3.06 | 40 | 3380 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 1413.2 | 38.0 | 21.4 | 21.05 | 0.60 | 55 | 1849 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 1414.6 | 37.8 | 21.0 | 21.37 | 0.50 | 55 | 1745 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 1242.7 | 34.3 | 20.3 | 23.46 | 0.59 | 42 | 2975 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 1348.9 | 38.8 | 22.0 | 20.67 | 0.48 | 35 | 1635 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 703.1 | 43.7 | 30.4 | 19.51 | 0.49 | 19 | 907 |
| 25 | [Jungle flyby (single-biome world)](#jungle-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 26 | [Desert flyby (single-biome world)](#desert-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 27 | [Taiga flyby (single-biome world)](#taiga-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 28 | [Snowy plains flyby](#snowy-plains-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 29 | [Forest flyby](#forest-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 30 | [Savanna flyby](#savanna-flyby) | Chunks | 752.0 | 45.9 | 31.5 | 18.17 | 0.42 | 14 | 1765 |
| 31 | [Swamp flyby](#swamp-flyby) | Chunks | 658.6 | 40.8 | 24.0 | 19.27 | 0.41 | 16 | 1013 |
| 32 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 33 | [Badlands flyby](#badlands-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 34 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 35 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 36 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 37 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 38 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 39 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 40 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 41 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 42 | [LowEnd Shader](#lowend-shader) | Showcase | 204.4 | 17.9 | 6.5 | 37.49 | 1.06 | 159 | 1160 |
| 43 | [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures) | Showcase | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Cows ×200 ring](#cows-200-ring)
- [Sheep ×200 ring](#sheep-200-ring)
- [Zombies ×150 ring (AI on)](#zombies-150-ring-ai-on)
- [Pigs ×250 ring](#pigs-250-ring)
- [Villagers ×100 ring](#villagers-100-ring)
- [Chickens ×300 ring](#chickens-300-ring)
- [Item entities ×500](#item-entities-500)
- [Item entities ×500](#item-entities-500)
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
- [Windswept hills flyby](#windswept-hills-flyby)
- [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously)
- [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset)
- [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide)
- [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm)
- [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators)
- [LowEnd Shader](#lowend-shader)
- [LowEnd Shader + PBR Textures](#lowend-shader--pbr-textures)

## Details

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 601 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Cows ×200 ring (`entity_cows`)

Category: **Entities**  |  Duration: 77 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `CHUNK_PRELOAD`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Sheep ×200 ring (`entity_sheep`)

Category: **Entities**  |  Duration: 23100 ms  |  Sample ticks: 400

**FPS**  avg `493.58`, min `14.97`, p50 `533.52`, p95 `757.45`, p99 `827.49`, 1%low `29.67`, 0.1%low `19.04`, std `199.06`

**Frame time (ms)**  avg `3.61`, p50 `1.87`, p95 `18.68`, p99 `24.94`, p99.9 `47.07`, max `66.79`

**Client tick (ms)**  avg `1.37`, p95 `2.60`, max `11.44`

**Memory**  start `1002 MB`, end `2322 MB`, peak `2899 MB`, GC `66 events / 624 ms`

**FPS over sampling window (ASCII):**

```
610.8 |                                        █         █                       █ █   
584.8 |                                        █         █       █    ██     █  ██ █   
558.8 |                              █    █ █  █         █       █   ████  █ █ ███ █  █
532.8 |                     █      █ █    ███  █   █   █ █      ██   ████ ██████████ ██
506.8 |                █ █  █  █  ████  █████  ██  █   ███   █ ███  ███████████████████
480.9 |     █  █   █  ████  █  █  ███████████ ███  █  ████   █████ ████████████████████
454.9 |     █  ██ ███ ████  ██ █ ████████████ ████ █ █████ ████████████████████████████
428.9 |    ██  ██ ████████  ███████████████████████████████████████████████████████████
402.9 |  █ ██ ███ ████████ ████████████████████████████████████████████████████████████
376.9 |█ █ ███████████████ ████████████████████████████████████████████████████████████
350.9 |█ ██████████████████████████████████████████████████████████████████████████████
324.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   7
   1 ms | ████████████████████████████████████████  3198
   2 ms | ████████████████  1245
   3 ms | ████  317
   4 ms | ██  142
   5 ms | █  108
   6 ms | █  66
   7 ms |   25
   8 ms |   12
   9 ms |   9
  10 ms |   6
  11 ms |   4
  12 ms |   3
  13 ms |   1
  14 ms |   3
  15 ms |   10
  16 ms |   31
  17 ms | █  46
  18 ms | █  41
  19 ms | █  45
  20 ms | █  53
  21 ms | █  41
  22 ms |   38
  23 ms |   19
  24 ms |   13
  25 ms |   11
  26 ms |   6
  27 ms |   5
  28 ms |   3
  29 ms |   1
  30 ms |   3
  31 ms |   3
  32 ms |   1
  33 ms |   2
  34 ms |   2
  35 ms |   1
  37 ms |   1
  38 ms |   3
  39 ms |   1
  40 ms |   1
  43 ms |   2
  44 ms |   1
  45 ms |   1
  46 ms |   1
  48 ms |   2
  50 ms |   2
  51 ms |   1
  66 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preload_duration_ms` = `56.00`
- `entities_spawned` = `200.00`
- `seed` = `6133.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `29.67`
- `preload_chunks` = `81.00`
- `entity_count_sample_start` = `201.00`
- `preset_full` = `0.00`
- `fps_0p1pct_low` = `19.04`
- `entity_count_sample_end` = `201.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `277.09`

### Zombies ×150 ring (AI on) (`entity_zombies`)

Category: **Entities**  |  Duration: 18006 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Pigs ×250 ring (`entity_pigs`)

Category: **Entities**  |  Duration: 487 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Villagers ×100 ring (`entity_villagers`)

Category: **Entities**  |  Duration: 261 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Chickens ×300 ring (`entity_chickens`)

Category: **Entities**  |  Duration: 813 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 1352 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item entities ×500 (`entity_items`)

Category: **Entities**  |  Duration: 4807 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Item merge storm (cobblestone, mergeable) (`entity_items_merge_storm`)

Category: **Entities**  |  Duration: 7107 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 1116 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Villager AI village (80, brain on) (`villager_ai_village`)

Category: **Entities**  |  Duration: 801 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 2541 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### TNT field destructive (breaks terrain) (`tnt_field_destructive`)

Category: **Physics**  |  Duration: 23137 ms  |  Sample ticks: 400

**FPS**  avg `845.99`, min `16.34`, p50 `923.96`, p95 `1376.16`, p99 `1556.81`, 1%low `31.04`, 0.1%low `20.00`, std `389.37`

**Frame time (ms)**  avg `2.48`, p50 `1.08`, p95 `13.05`, p99 `23.98`, p99.9 `43.25`, max `61.20`

**Client tick (ms)**  avg `4.11`, p95 `8.61`, max `27.99`

**Memory**  start `3396 MB`, end `1473 MB`, peak `3943 MB`, GC `19 events / 286 ms`

**FPS over sampling window (ASCII):**

```
1399.1 |                                                                             ███
1295.1 |                                                                           █████
1191.0 |                ███████ █                                                 ██████
1087.0 |                ███████████                            █     ███        ████████
982.9 |                █████████████             █     █    ███     ████ ███ ██████████
878.9 |                ██████████████  █        ██    ██████████   ████████████████████
774.8 |               ██████████████████        ████████████████   ████████████████████
670.8 |            █  ██████████████████        █████████████████  ████████████████████
566.7 |      █  █████████████████████████  █   ██████████████████  ████████████████████
462.7 |      ██ ███████████████████████████████████████████████████████████████████████
358.6 |   █ ███████████████████████████████████████████████████████████████████████████
254.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  3423
   1 ms | ███████████████████████████████████  2962
   2 ms | ███████  613
   3 ms | ███  286
   4 ms | █  116
   5 ms | █  67
   6 ms | █  48
   7 ms |   27
   8 ms |   9
   9 ms |   16
  10 ms |   17
  11 ms |   13
  12 ms |   36
  13 ms | █  57
  14 ms | █  51
  15 ms |   40
  16 ms |   24
  17 ms |   26
  18 ms |   30
  19 ms |   23
  20 ms |   22
  21 ms |   21
  22 ms |   23
  23 ms |   6
  24 ms |   7
  25 ms |   9
  26 ms |   7
  27 ms |   5
  28 ms |   8
  29 ms |   7
  30 ms |   4
  31 ms |   6
  32 ms |   2
  33 ms |   3
  34 ms |   3
  35 ms |   3
  36 ms |   2
  37 ms |   2
  39 ms |   1
  41 ms |   1
  42 ms |   1
  43 ms |   3
  44 ms |   1
  46 ms |   1
  47 ms |   1
  49 ms |   2
  58 ms |   1
  61 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `tnt_active_p50` = `26.00`
- `seed` = `3541.00`
- `fps_0p1pct_low` = `20.00`
- `preset_long` = `0.00`
- `preload_duration_ms` = `51.00`
- `tnt_spawned` = `430.00`
- `preset_quick` = `1.00`
- `fps_harmonic_avg` = `402.64`
- `fps_1pct_low` = `31.04`
- `block_state_changes` = `0.00`
- `entity_count_sample_end` = `1.00`
- `section_rebuilds` = `0.00`
- `preset_full` = `0.00`
- `tnt_active_max` = `206.00`
- `waves_spawned` = `13.00`
- `entity_count_delta` = `-188.00`
- `tnt_active_avg` = `36.72`
- `preload_chunks` = `81.00`
- `part` = `1.00`
- `neighbour_updates` = `0.00`
- `tnt_active_p95` = `149.00`
- `explosions_count` = `404.00`
- `entity_count_sample_start` = `189.00`

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 23086 ms  |  Sample ticks: 400

**FPS**  avg `1146.33`, min `9.64`, p50 `1066.56`, p95 `2481.01`, p99 `3082.73`, 1%low `14.72`, 0.1%low `10.84`, std `916.83`

**Frame time (ms)**  avg `5.99`, p50 `0.94`, p95 `33.42`, p99 `56.79`, p99.9 `81.83`, max `103.73`

**Client tick (ms)**  avg `19.18`, p95 `32.59`, max `53.44`

**Memory**  start `2605 MB`, end `2137 MB`, peak `3214 MB`, GC `17 events / 132 ms`

**FPS over sampling window (ASCII):**

```
2755.9 |                                                                              ██
2509.5 |                                                                   █         ███
2263.2 |                                                              █ ██ ██        ███
2016.9 |                             █          █        █ █        █ █████████      ███
1770.5 |                    █       █████       █        █ ██      ████████████      ███
1524.2 |                    █ ██    ██████    ███       █████      ████████████      ███
1277.9 |              ██    ████    ███████   █████    ████████    ████████████     ████
1031.5 |             ███    ████    ███████   ██████   █████████   █████████████    ████
785.2 |             ████   █████   ███████   ██████   █████████   ██████████████   ████
538.9 |██           ████   ██████  ████████  ███████  █████████   ██████████████   ████
292.5 |██  █ █ █ ██ █████ ██████████████████ ████████ ███████████ █████████████████████
 46.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1758
   1 ms | ████████  341
   2 ms | ███  131
   3 ms | ███  115
   4 ms | ████  184
   5 ms | █████  213
   6 ms | █  29
   7 ms |   9
   8 ms |   13
   9 ms |   8
  10 ms |   12
  11 ms |   8
  12 ms |   8
  13 ms | █  27
  14 ms | █  27
  15 ms | █  36
  16 ms | █  37
  17 ms | █  27
  18 ms | █  23
  19 ms |   20
  20 ms |   9
  21 ms |   13
  22 ms |   12
  23 ms |   11
  24 ms |   17
  25 ms |   17
  26 ms |   3
  27 ms |   8
  28 ms |   12
  29 ms |   13
  30 ms |   8
  31 ms |   9
  32 ms |   9
  33 ms |   7
  34 ms |   11
  35 ms |   9
  36 ms |   2
  37 ms |   5
  38 ms |   4
  39 ms |   4
  40 ms |   11
  41 ms |   13
  42 ms |   5
  43 ms |   5
  44 ms |   7
  45 ms |   7
  46 ms |   9
  47 ms |   6
  48 ms |   6
  50 ms |   2
  51 ms |   6
  52 ms |   5
  53 ms |   5
  54 ms |   2
  55 ms |   3
  56 ms |   3
  57 ms |   4
  58 ms |   2
  60 ms |   2
  61 ms |   6
  62 ms |   2
  63 ms |   2
  64 ms |   2
  66 ms |   1
  67 ms |   1
  70 ms |   1
  71 ms |   1
  73 ms |   1
  77 ms |   2
  78 ms |   1
  80 ms |   1
  82 ms |   1
  85 ms |   1
  88 ms |   1
 103 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `seed` = `5077.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `166.85`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `10.84`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4798.29`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `14.72`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `5.00`
- `falling_blocks_landed` = `24121.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 23095 ms  |  Sample ticks: 400

**FPS**  avg `1182.61`, min `8.06`, p50 `1218.75`, p95 `2563.24`, p99 `3088.23`, 1%low `12.01`, 0.1%low `8.36`, std `925.12`

**Frame time (ms)**  avg `6.34`, p50 `0.82`, p95 `34.55`, p99 `62.20`, p99.9 `105.82`, max `124.10`

**Client tick (ms)**  avg `18.13`, p95 `32.11`, max `50.04`

**Memory**  start `2221 MB`, end `1487 MB`, peak `3025 MB`, GC `24 events / 134 ms`

**FPS over sampling window (ASCII):**

```
2633.2 |                                                                           ███ █
2396.8 |                                                              █   █        █████
2160.5 |                                                   █        █ ██████       █████
1924.2 |                                 █     █         ████       █ ██████       █████
1687.8 |                 █     ██      █ ██    ███ █    ███████     █████████      █████
1451.5 |         █ █     █     ████    ████    █████    ███████     ██████████     █████
1215.1 |         ████    ██    ████   █████    ██████   ███████     ███████████    █████
978.8 |         ████    ███   ████   █████    ██████   ████████    ███████████   ██████
742.4 |█        █████  ████   ████   ██████  ████████  █████████   ███████████   ██████
506.1 |██       █████  █████  █████  ██████  ████████  █████████  █████████████  ██████
269.7 |███      ██████ █████ ███████ ███████ ████████  ██████████ ██████████████ ██████
 33.4 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  1726
   1 ms | ███████  313
   2 ms | ███  130
   3 ms | ██  72
   4 ms | █  54
   5 ms | █  48
   6 ms | ███  126
   7 ms | ███  121
   8 ms |   15
   9 ms |   9
  10 ms |   10
  11 ms |   7
  12 ms |   21
  13 ms | █  31
  14 ms | █  37
  15 ms | █  42
  16 ms | █  26
  17 ms |   18
  18 ms | █  27
  19 ms |   20
  20 ms |   16
  21 ms |   13
  22 ms |   16
  23 ms |   10
  24 ms |   15
  25 ms |   16
  26 ms |   15
  27 ms |   12
  28 ms |   4
  29 ms |   3
  30 ms |   5
  31 ms |   8
  32 ms |   2
  33 ms |   6
  34 ms |   8
  35 ms |   7
  36 ms |   8
  37 ms |   9
  38 ms |   5
  39 ms |   7
  40 ms |   6
  41 ms |   7
  42 ms |   9
  43 ms |   9
  44 ms |   7
  45 ms |   5
  46 ms |   4
  47 ms |   3
  48 ms |   3
  49 ms |   3
  50 ms |   4
  51 ms |   7
  52 ms |   4
  54 ms |   1
  55 ms |   4
  56 ms |   2
  59 ms |   3
  60 ms |   2
  61 ms |   2
  62 ms |   1
  64 ms |   4
  68 ms |   1
  69 ms |   3
  73 ms |   1
  75 ms |   4
  78 ms |   1
  79 ms |   1
  81 ms |   2
  83 ms |   1
  84 ms |   1
  88 ms |   3
  90 ms |   1
  93 ms |   2
  94 ms |   1
  97 ms |   1
 107 ms |   1
 116 ms |   1
 117 ms |   1
 124 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `heavy`
- `seed` = `5081.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `157.75`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `6400.00`
- `fps_0p1pct_low` = `8.36`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-3200.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `4791.48`
- `falling_blocks_alive_max` = `6400.00`
- `wave_interval_ticks` = `30.00`
- `waves_spawned` = `12.00`
- `falling_blocks_alive_p50` = `4800.00`
- `fps_1pct_low` = `12.01`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `1600.00`
- `entity_count_sample_start` = `3201.00`
- `preload_duration_ms` = `5.00`
- `falling_blocks_landed` = `30647.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `20800.00`

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 23110 ms  |  Sample ticks: 400

**FPS**  avg `1084.18`, min `18.42`, p50 `1115.51`, p95 `1805.15`, p99 `2053.36`, 1%low `33.15`, 0.1%low `22.58`, std `514.50`

**Frame time (ms)**  avg `2.04`, p50 `0.90`, p95 `5.96`, p99 `23.34`, p99.9 `40.38`, max `54.30`

**Client tick (ms)**  avg `2.79`, p95 `4.41`, max `14.00`

**Memory**  start `3020 MB`, end `2644 MB`, peak `3324 MB`, GC `60 events / 664 ms`

**FPS over sampling window (ASCII):**

```
1551.3 |   █                                                                   █     █  
1452.6 |   ██                                                      █     ███   ██   ████
1353.9 |  ████                                       ██ █  █  ███████   █████ ██████████
1255.1 |███████                               █  ██  █████ █  ████████  ████████████████
1156.4 |███████                               █  ██ ██████████████████ █████████████████
1057.6 |███████                               █████ ████████████████████████████████████
958.9 |████████                        ██  ████████████████████████████████████████████
860.1 |█████████                   ██████ █████████████████████████████████████████████
761.4 |█████████                 ██████████████████████████████████████████████████████
662.6 |█████████           █ ██████████████████████████████████████████████████████████
563.9 |██████████    ███ ██████████████████████████████████████████████████████████████
465.2 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5482
   1 ms | ██████████████████████  3008
   2 ms | ███  406
   3 ms | █  154
   4 ms | █  158
   5 ms | █  100
   6 ms |   52
   7 ms |   14
   8 ms |   15
   9 ms |   4
  10 ms |   2
  11 ms |   2
  12 ms |   1
  13 ms |   3
  14 ms |   4
  15 ms |   22
  16 ms |   32
  17 ms |   61
  18 ms |   68
  19 ms |   38
  20 ms |   23
  21 ms |   23
  22 ms |   19
  23 ms |   14
  24 ms |   11
  25 ms |   21
  26 ms |   7
  27 ms |   5
  28 ms |   8
  29 ms |   7
  30 ms |   1
  31 ms |   2
  32 ms |   3
  33 ms |   4
  34 ms |   1
  35 ms |   3
  36 ms |   2
  38 ms |   1
  39 ms |   5
  40 ms |   2
  41 ms |   1
  42 ms |   4
  44 ms |   1
  45 ms |   1
  46 ms |   1
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `seed` = `5101.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `489.84`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `22.58`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `619.31`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `33.15`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `0.00`
- `falling_blocks_landed` = `3136.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 23102 ms  |  Sample ticks: 400

**FPS**  avg `1108.05`, min `17.61`, p50 `1228.91`, p95 `1799.72`, p99 `2033.43`, 1%low `32.54`, 0.1%low `20.89`, std `540.80`

**Frame time (ms)**  avg `2.14`, p50 `0.81`, p95 `6.67`, p99 `23.93`, p99.9 `41.33`, max `56.78`

**Client tick (ms)**  avg `3.06`, p95 `5.76`, max `25.03`

**Memory**  start `1328 MB`, end `3630 MB`, peak `4709 MB`, GC `40 events / 579 ms`

**FPS over sampling window (ASCII):**

```
1538.1 |                                                          █      █ █      ██    
1427.9 |█ █                                     ██ ██  █       ██ █ ██ ███ ██████ ████ █
1317.6 |█████                            █  █ █ ██ ██████ ██ █████████ █████████████████
1207.4 |███████                          █  ████████████████ ███████████████████████████
1097.2 |███████                          ██ ████████████████ ███████████████████████████
986.9 |███████                        █████████████████████████████████████████████████
876.7 |███████                █   ██  █████████████████████████████████████████████████
766.5 |████████               ██  █████████████████████████████████████████████████████
656.2 |████████             ███████████████████████████████████████████████████████████
546.0 |█████████        ███████████████████████████████████████████████████████████████
435.8 |█████████  █  ██ ███████████████████████████████████████████████████████████████
325.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  5566
   1 ms | ███████████████  2119
   2 ms | █████  726
   3 ms | █  205
   4 ms | █  143
   5 ms | █  94
   6 ms |   57
   7 ms |   22
   8 ms |   9
   9 ms |   6
  10 ms |   6
  11 ms |   1
  12 ms |   3
  13 ms |   2
  14 ms |   3
  15 ms |   18
  16 ms |   41
  17 ms |   42
  18 ms |   61
  19 ms |   43
  20 ms |   29
  21 ms |   18
  22 ms |   28
  23 ms |   28
  24 ms |   11
  25 ms |   13
  26 ms |   13
  27 ms |   15
  28 ms |   8
  29 ms |   2
  30 ms |   2
  31 ms |   2
  32 ms |   2
  33 ms |   2
  34 ms |   1
  35 ms |   1
  38 ms |   3
  39 ms |   2
  40 ms |   5
  41 ms |   1
  43 ms |   1
  44 ms |   1
  46 ms |   1
  47 ms |   3
  48 ms |   2
  56 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `variant` = `lite`
- `seed` = `5113.00`
- `block_state_changes` = `0.00`
- `fps_harmonic_avg` = `468.09`
- `neighbour_updates` = `0.00`
- `falling_blocks_alive_p95` = `833.00`
- `fps_0p1pct_low` = `20.89`
- `preload_chunks` = `81.00`
- `entity_count_delta` = `-441.00`
- `preset_long` = `0.00`
- `preset_full` = `0.00`
- `falling_blocks_alive_avg` = `618.99`
- `falling_blocks_alive_max` = `882.00`
- `wave_interval_ticks` = `6.00`
- `waves_spawned` = `63.00`
- `falling_blocks_alive_p50` = `686.00`
- `fps_1pct_low` = `32.54`
- `entity_count_sample_end` = `1.00`
- `part` = `1.00`
- `topup_blocks_per_wave` = `49.00`
- `entity_count_sample_start` = `442.00`
- `preload_duration_ms` = `0.00`
- `falling_blocks_landed` = `3087.00`
- `preset_quick` = `1.00`
- `sand_spawned` = `3087.00`

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 13902 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23097 ms  |  Sample ticks: 400

**FPS**  avg `1413.16`, min `18.50`, p50 `1539.97`, p95 `1923.50`, p99 `2263.81`, 1%low `38.04`, 0.1%low `21.40`, std `470.87`

**Frame time (ms)**  avg `1.42`, p50 `0.65`, p95 `3.11`, p99 `21.05`, p99.9 `41.02`, max `54.07`

**Client tick (ms)**  avg `0.60`, p95 `1.16`, max `16.81`

**Memory**  start `1513 MB`, end `1911 MB`, peak `3362 MB`, GC `55 events / 634 ms`

**FPS over sampling window (ASCII):**

```
1805.5 |                             █                                                  
1753.9 |                             █                                                  
1702.3 |                             █                                   █              
1650.7 |                             █                                   █    █         
1599.1 |                             █                                   █    █         
1547.5 |                      █      █ █                                 █    █         
1495.9 | █     █      █     █ █      ███        █              █ ██    ███  █████   █ ██
1444.3 |██   █ █    █ ██    █ ██     ███    █ █ █        ██    █ ███  ████  ██████  █ ██
1392.6 |██  ████   ██ ██  █ █ ██  ████████  ███ █    ██ ████ ███████  ████  ██████  ████
1341.0 |██  ████████████  ███████ ████████  █████ █ ███ ████ ███████ ██████ ██████ █████
1289.4 |███████████████████████████████████ ████████████████ ███████████████████████████
1237.8 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11726
   1 ms | █████  1394
   2 ms | █  203
   3 ms |   83
   4 ms |   104
   5 ms |   78
   6 ms |   19
   7 ms |   9
   8 ms |   4
   9 ms |   4
  10 ms |   3
  12 ms |   2
  14 ms |   4
  15 ms |   19
  16 ms |   29
  17 ms |   61
  18 ms |   70
  19 ms |   42
  20 ms |   38
  21 ms |   35
  22 ms |   33
  23 ms |   21
  24 ms |   13
  25 ms |   10
  26 ms |   4
  27 ms |   1
  28 ms |   2
  30 ms |   2
  31 ms |   1
  32 ms |   1
  33 ms |   3
  38 ms |   1
  39 ms |   1
  41 ms |   2
  42 ms |   1
  43 ms |   2
  44 ms |   3
  45 ms |   1
  46 ms |   1
  49 ms |   1
  50 ms |   2
  52 ms |   1
  54 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `61.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `38.04`
- `fps_harmonic_avg` = `701.90`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `21.40`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 23143 ms  |  Sample ticks: 400

**FPS**  avg `1414.59`, min `14.98`, p50 `1546.60`, p95 `1897.28`, p99 `2141.29`, 1%low `37.85`, 0.1%low `20.97`, std `454.46`

**Frame time (ms)**  avg `1.42`, p50 `0.65`, p95 `3.19`, p99 `21.37`, p99.9 `36.70`, max `66.75`

**Client tick (ms)**  avg `0.50`, p95 `0.88`, max `14.72`

**Memory**  start `1799 MB`, end `1924 MB`, peak `3545 MB`, GC `55 events / 646 ms`

**FPS over sampling window (ASCII):**

```
1619.0 |                                                                  █             
1585.4 |                                                                  █             
1551.8 |       █                                                          ██            
1518.2 |       █     █ █             █ █           █                   █  ███           
1484.7 | █   █ █    ████      █  █   ███         ███    ██ █           █ ████       █   
1451.1 |██  ████    ████     ██  █ █ ███         ███    ██ █      █    █ █████    █ █   
1417.5 |██  █████ █ ████     ███████████   █   ███████ █████   ████    █ █████ ██ █ █   
1383.9 |██ █████████████   █ ███████████ ███ █ ███████ █████   ████    █ █████ ██████   
1350.3 |██ ██████████████ ██████████████ █████ ███████ ██████  ██████  ███████ ███████  
1316.7 |██ ██████████████ ████████████████████ ██████████████  ██████  ███████████████ █
1283.1 |██ ███████████████████████████████████ ██████████████████████  █████████████████
1249.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  11861
   1 ms | ████  1276
   2 ms | █  179
   3 ms |   94
   4 ms |   97
   5 ms |   74
   6 ms |   29
   7 ms |   8
   8 ms |   8
  13 ms |   1
  14 ms |   7
  15 ms |   19
  16 ms |   38
  17 ms |   51
  18 ms |   55
  19 ms |   54
  20 ms |   28
  21 ms |   46
  22 ms |   35
  23 ms |   18
  24 ms |   15
  25 ms |   12
  26 ms |   5
  27 ms |   5
  28 ms |   1
  29 ms |   1
  31 ms |   1
  32 ms |   1
  33 ms |   1
  34 ms |   1
  35 ms |   1
  36 ms |   2
  38 ms |   1
  40 ms |   1
  42 ms |   2
  43 ms |   3
  47 ms |   2
  48 ms |   1
  49 ms |   1
  51 ms |   1
  62 ms |   1
  66 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `trails_built` = `16.00`
- `fps_harmonic_avg` = `701.94`
- `preload_duration_ms` = `99.00`
- `preset_long` = `0.00`
- `fps_1pct_low` = `37.85`
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
- `seed` = `4019.00`
- `fps_0p1pct_low` = `20.97`

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 23107 ms  |  Sample ticks: 400

**FPS**  avg `1242.66`, min `15.42`, p50 `1439.36`, p95 `1845.04`, p99 `2068.10`, 1%low `34.26`, 0.1%low `20.31`, std `554.11`

**Frame time (ms)**  avg `1.97`, p50 `0.69`, p95 `5.35`, p99 `23.46`, p99.9 `42.24`, max `64.85`

**Client tick (ms)**  avg `0.59`, p95 `1.13`, max `4.80`

**Memory**  start `1364 MB`, end `3759 MB`, peak `4340 MB`, GC `42 events / 582 ms`

**FPS over sampling window (ASCII):**

```
1481.5 |  █                   █        █ █                █           █                 
1428.3 |█ █                   █        █ █          █     █           █  █              
1375.2 |█ █  █ █  █     █     █  █  █  █ █     █    ███ █ ██      █ █ █  ██             
1322.1 |█ █  █ █  █     █     █  █  █  █ █  █  █ █  ███ █ ████ █  █ █ █  ███  █         
1269.0 |█ █  ███  ██  █ █  █  █  █  █  █ █  █  █ █  ███ █ ██████  █ █ █  ███  █ ██     █
1215.8 |█ █  ███  ██  ███ ██  █ ███ █ █████ █  █ █  ███ ████████ ███████████  █ ██ ██  █
1162.7 |████ ███ ███ ████ ██  █████ ███████ █ ██ ███████████████ ███████████  █ ██ ██  █
1109.6 |████████ ███ ████ ██  █████ █████████ ██ ███████████████ █████████████████ ██ ██
1056.4 |████████████ ██████████████ ████████████ ████████████████████████████████████ ██
1003.3 |████████████ ██████████████ █████████████████████████████████████████████████ ██
950.2 |███████████████████████████ ████████████████████████████████████████████████████
897.1 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  7411
   1 ms | █████  923
   2 ms | ██  440
   3 ms | ███  624
   4 ms | █  183
   5 ms |   84
   6 ms |   30
   7 ms |   22
   8 ms |   16
   9 ms |   6
  11 ms |   4
  12 ms |   1
  13 ms |   1
  14 ms |   2
  15 ms |   8
  16 ms |   19
  17 ms |   47
  18 ms |   47
  19 ms |   40
  20 ms |   32
  21 ms |   41
  22 ms |   40
  23 ms |   34
  24 ms |   19
  25 ms |   14
  26 ms |   8
  27 ms |   6
  28 ms |   3
  29 ms |   5
  30 ms |   4
  31 ms |   4
  32 ms |   3
  33 ms |   1
  34 ms |   1
  37 ms |   1
  41 ms |   2
  42 ms |   2
  43 ms |   2
  45 ms |   1
  48 ms |   1
  49 ms |   3
  54 ms |   1
  64 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_1pct_low` = `34.26`
- `scheduled_block_ticks` = `0.00`
- `preset_full` = `0.00`
- `power_toggles` = `57.00`
- `preload_chunks` = `81.00`
- `preset_quick` = `1.00`
- `neighbour_updates` = `11200.00`
- `fps_harmonic_avg` = `507.12`
- `part` = `1.00`
- `slime_blocks` = `192.00`
- `fps_0p1pct_low` = `20.31`
- `seed` = `4027.00`
- `preload_duration_ms` = `80.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `block_state_changes` = `0.00`
- `pistons_built` = `64.00`

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 23089 ms  |  Sample ticks: 400

**FPS**  avg `1348.86`, min `19.78`, p50 `1442.00`, p95 `1817.41`, p99 `2142.60`, 1%low `38.82`, 0.1%low `22.02`, std `414.32`

**Frame time (ms)**  avg `1.40`, p50 `0.69`, p95 `2.41`, p99 `20.67`, p99.9 `39.86`, max `50.56`

**Client tick (ms)**  avg `0.48`, p95 `0.75`, max `3.90`

**Memory**  start `2887 MB`, end `3383 MB`, peak `4523 MB`, GC `35 events / 583 ms`

**FPS over sampling window (ASCII):**

```
1810.0 |█                                                                               
1752.3 |█                                                                               
1694.5 |█                                                                               
1636.7 |█                                                                               
1578.9 |█                                                                               
1521.2 |█                               ███  █ █                                        
1463.4 |██                 █        ██  ████ ███      █                 █               
1405.6 |██  █             ██  █   █ ██  ████████   █ ██       ██ █      ███             
1347.9 |██ ██ ██        █ ███████ ████ ██████████  █████ █ ██ ██ ██    ███████   ██  ██ 
1290.1 |████████  █ █ ████████████████ ██████████  █████ █ █████████  ██████████ ██  ██ 
1232.3 |███████████ █████████████████████████████████████████████████ ██████████████████
1174.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████████████████████████████████████████  12139
   1 ms | ████  1352
   2 ms |   149
   3 ms |   67
   4 ms |   110
   5 ms |   50
   6 ms |   14
   7 ms |   3
   8 ms |   5
  13 ms |   4
  14 ms |   6
  15 ms |   22
  16 ms |   31
  17 ms |   60
  18 ms |   59
  19 ms |   52
  20 ms |   36
  21 ms |   45
  22 ms |   30
  23 ms |   15
  24 ms |   5
  25 ms |   6
  26 ms |   1
  27 ms |   5
  28 ms |   1
  29 ms |   1
  31 ms |   2
  32 ms |   2
  34 ms |   1
  35 ms |   2
  37 ms |   1
  38 ms |   1
  40 ms |   2
  41 ms |   2
  42 ms |   1
  43 ms |   1
  44 ms |   2
  45 ms |   1
  47 ms |   1
  48 ms |   3
  50 ms |   2
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `fps_harmonic_avg` = `714.60`
- `entity_count_sample_start` = `1.00`
- `fps_1pct_low` = `38.82`
- `fps_0p1pct_low` = `22.02`
- `preload_chunks` = `81.00`
- `preload_duration_ms` = `45.00`
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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23026 ms  |  Sample ticks: 400

**FPS**  avg `703.09`, min `25.60`, p50 `743.10`, p95 `1077.61`, p99 `1135.40`, 1%low `43.70`, 0.1%low `30.38`, std `284.48`

**Frame time (ms)**  avg `2.48`, p50 `1.35`, p95 `14.22`, p99 `19.51`, p99.9 `26.61`, max `39.06`

**Client tick (ms)**  avg `0.49`, p95 `0.77`, max `8.03`

**Memory**  start `3316 MB`, end `2617 MB`, peak `4223 MB`, GC `19 events / 224 ms`

**FPS over sampling window (ASCII):**

```
870.0 |                   █       █                                                    
836.3 |  █          █   █ █  █    █                                                    
802.6 |  █      █   ██  █ █ ██    █               █                            █       
768.9 |  █  █   ██  ██ ████ ██ ██ ██ █  █  █  █   █     █                      █       
735.2 | ███ █   ██  ███████ ██ ██ ██ █ ██  █ ████ █     █    █    █  █ ██      █ █   █ 
701.6 | █████   ██  ███████ ██ ███████ ██████████ █  █ ██    ███  █  ████      ████  █ 
667.9 |██████   ███████████ ██████████ ██████████ █  █ ██    ███  █ █████ ██   ████  ██
634.2 |████████ ██████████████████████ ██████████ █  ████  █████████████████ █ ████ ███
600.5 |████████ █████████████████████████████████ █ ██████████████████████████ ████████
566.8 |████████ █████████████████████████████████ █ ███████████████████████████████████
533.2 |██████████████████████████████████████████ █ ███████████████████████████████████
499.5 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████  1232
   1 ms | ████████████████████████████████████████  5006
   2 ms | ███████  899
   3 ms | ██  223
   4 ms | █  121
   5 ms | █  74
   6 ms |   36
   7 ms |   25
   8 ms |   10
   9 ms |   1
  10 ms |   3
  11 ms |   4
  12 ms |   2
  13 ms |   24
  14 ms | █  78
  15 ms | █  106
  16 ms |   60
  17 ms |   48
  18 ms |   28
  19 ms |   33
  20 ms |   18
  21 ms |   15
  23 ms |   10
  24 ms |   3
  25 ms |   7
  26 ms |   3
  27 ms |   1
  29 ms |   2
  31 ms |   2
  37 ms |   1
  38 ms |   1
  39 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:plains`
- `scan_fallback` = `false`
- `fps_1pct_low` = `43.70`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `51.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `403.81`
- `part` = `1.00`
- `fps_0p1pct_low` = `30.38`
- `seed` = `7411.00`
- `preload_duration_ms` = `1.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `-1.00`
- `entity_count_sample_start` = `2.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.02`

### Jungle flyby (single-biome world) (`chunk_jungle`)

Category: **Chunks**  |  Duration: 22817 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Desert flyby (single-biome world) (`chunk_desert`)

Category: **Chunks**  |  Duration: 2229 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Taiga flyby (single-biome world) (`chunk_taiga`)

Category: **Chunks**  |  Duration: 1410 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Snowy plains flyby (`chunk_snowy`)

Category: **Chunks**  |  Duration: 980 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Forest flyby (`chunk_forest`)

Category: **Chunks**  |  Duration: 1953 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Savanna flyby (`chunk_savanna`)

Category: **Chunks**  |  Duration: 23122 ms  |  Sample ticks: 400

**FPS**  avg `752.03`, min `24.55`, p50 `816.46`, p95 `1122.77`, p99 `1188.00`, 1%low `45.92`, 0.1%low `31.53`, std `285.90`

**Frame time (ms)**  avg `2.24`, p50 `1.22`, p95 `11.09`, p99 `18.17`, p99.9 `26.00`, max `40.73`

**Client tick (ms)**  avg `0.42`, p95 `0.71`, max `1.41`

**Memory**  start `3386 MB`, end `4939 MB`, peak `5152 MB`, GC `14 events / 162 ms`

**FPS over sampling window (ASCII):**

```
881.9 | █     █   █          █                                                         
848.2 | █   █ ██  █ █    █   █  █                 █                                    
814.5 | █ ██████ ██ █ █  █   ██ ██  █ █   █       █   █                                
780.8 | ████████ ██████ ███  █████ ████ █ █       █   █                   █            
747.1 |█████████████████████████████████████ █  ████  █████  ██ ███     ████ █ █      █
713.4 |███████████████████████████████████████ ██████ █████  ██████    █████ █ █    ███
679.7 |████████████████████████████████████████████████████  ██████ ████████ █ ██   ███
646.0 |████████████████████████████████████████████████████  ███████████████ █ ██ █ ███
612.3 |██████████████████████████████████████████████████████████████████████████ █ ███
578.6 |████████████████████████████████████████████████████████████████████████████ ███
544.9 |████████████████████████████████████████████████████████████████████████████ ███
511.3 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ██████████████  1847
   1 ms | ████████████████████████████████████████  5468
   2 ms | █████  711
   3 ms | ██  218
   4 ms | █  104
   5 ms |   61
   6 ms |   29
   7 ms |   10
   8 ms |   8
   9 ms |   5
  10 ms |   2
  11 ms |   1
  13 ms |   43
  14 ms | █  125
  15 ms | █  102
  16 ms |   53
  17 ms |   28
  18 ms |   26
  19 ms |   19
  20 ms |   11
  21 ms |   9
  22 ms |   5
  23 ms |   6
  24 ms |   6
  25 ms |   3
  26 ms |   3
  27 ms |   1
  28 ms |   1
  30 ms |   1
  39 ms |   1
  40 ms |   2
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:savanna`
- `scan_fallback` = `false`
- `fps_1pct_low` = `45.92`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `445.45`
- `part` = `1.00`
- `fps_0p1pct_low` = `31.53`
- `seed` = `7481.00`
- `preload_duration_ms` = `58.00`
- `entity_count_sample_end` = `2.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `1.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.00`

### Swamp flyby (`chunk_swamp`)

Category: **Chunks**  |  Duration: 25735 ms  |  Sample ticks: 400

**FPS**  avg `658.60`, min `17.84`, p50 `709.41`, p95 `1011.55`, p99 `1087.64`, 1%low `40.80`, 0.1%low `23.99`, std `266.41`

**Frame time (ms)**  avg `2.63`, p50 `1.41`, p95 `14.54`, p99 `19.27`, p99.9 `31.62`, max `56.06`

**Client tick (ms)**  avg `0.41`, p95 `0.68`, max `4.10`

**Memory**  start `4585 MB`, end `3806 MB`, peak `5599 MB`, GC `16 events / 212 ms`

**FPS over sampling window (ASCII):**

```
834.8 |█                                                                               
796.2 |█ █   ██                                                                        
757.6 |████████ ██   █                        █                                        
719.1 |████████ ██ █ █       █ █     █   █  █ █    █             █        █            
680.5 |███████████████  █ ████████ █ █ █ ██ █ █  █ █  █  █   █   █  █ █   █            
642.0 |███████████████████████████ ███ █ ████ █ ██ █  █  █   █ ████ ███ █ █████       █
603.4 |███████████████████████████ █████ ████ ████████████   ██████████████████ █ █████
564.8 |███████████████████████████ █████ ████ ████████████ ██████████████████████ █████
526.3 |██████████████████████████████████████████████████████████████████████████ █████
487.7 |██████████████████████████████████████████████████████████████████████████ █████
449.2 |██████████████████████████████████████████████████████████████████████████ █████
410.6 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms | ████  458
   1 ms | ████████████████████████████████████████  5161
   2 ms | ████████  1008
   3 ms | ██  253
   4 ms | █  136
   5 ms |   59
   6 ms |   53
   7 ms |   20
   8 ms |   9
   9 ms |   3
  10 ms |   5
  11 ms |   4
  12 ms |   2
  13 ms |   23
  14 ms | █  92
  15 ms | █  100
  16 ms |   62
  17 ms |   48
  18 ms |   33
  19 ms |   19
  20 ms |   17
  21 ms |   8
  22 ms |   8
  23 ms |   2
  24 ms |   7
  25 ms |   7
  26 ms |   2
  27 ms |   1
  28 ms |   1
  29 ms |   1
  30 ms |   2
  32 ms |   2
  38 ms |   3
  46 ms |   1
  49 ms |   1
  56 ms |   1
```

**Extras:**

- `stamped_fallback` = `false`
- `part_label` = `Main Benchmark (no shaders)`
- `biome` = `minecraft:swamp`
- `scan_fallback` = `false`
- `fps_1pct_low` = `40.80`
- `preset_full` = `0.00`
- `flyby_distance_blocks` = `720.00`
- `z_offset_used` = `0.00`
- `preload_chunks` = `49.00`
- `preset_quick` = `1.00`
- `stamped_blocks` = `0.00`
- `fps_harmonic_avg` = `380.74`
- `part` = `1.00`
- `fps_0p1pct_low` = `23.99`
- `seed` = `7487.00`
- `preload_duration_ms` = `2702.00`
- `entity_count_sample_end` = `1.00`
- `preset_long` = `0.00`
- `entity_count_delta` = `0.00`
- `entity_count_sample_start` = `1.00`
- `x_offset_used` = `0.00`
- `flyby_blocks_per_tick` = `1.20`
- `surface_water_ratio` = `0.10`

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 17635 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 10768 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 948 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 1167 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 6482 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `READY_WAIT`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 6897 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 1792 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Lighting update (16×16 glowstone reveal/hide) (`lighting_update`)

Category: **Lighting**  |  Duration: 900 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Hopper grid 20×20 (transfer storm) (`hopper_grid`)

Category: **Block-Entities**  |  Duration: 1159 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 1001 ms  |  Sample ticks: 0

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

- `part_label` = `Main Benchmark (no shaders)`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### LowEnd Shader (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 195190 ms  |  Sample ticks: 3600

**FPS**  avg `204.42`, min `0.57`, p50 `213.88`, p95 `373.52`, p99 `497.58`, 1%low `17.91`, 0.1%low `6.51`, std `106.50`

**Frame time (ms)**  avg `8.10`, p50 `4.68`, p95 `24.39`, p99 `37.49`, p99.9 `59.69`, max `1744.44`

**Client tick (ms)**  avg `1.06`, p95 `2.00`, max `30.02`

**Memory**  start `5271 MB`, end `5046 MB`, peak `6432 MB`, GC `159 events / 2484 ms`

**FPS over sampling window (ASCII):**

```
277.6 | █ █                                                   ███████     ██           
260.4 |████                                     █  █    ██  ██████████  ██████         
243.1 |████                                 █   █  █    ██  ███████████ ████████       
225.9 |████                           █     █   █  █   ███ ████████████████████████████
208.6 |████                       ██ ██  █ ██   ██ █   ████████████████████████████████
191.4 |████ █        █            ██ ███ ████  ███ █  █████████████████████████████████
174.1 |██████ █    ███        █   ██ ███ ████  █████  █████████████████████████████████
156.9 |████████ █ ████   █    █   ██ █████████ █████ ██████████████████████████████████
139.7 |███████████████   ██   █  █████████████ █████ ██████████████████████████████████
122.4 |███████████████   ██   ██ █████████████ █████ ██████████████████████████████████
105.2 |███████████████ ████ ████ ███████████████████ ██████████████████████████████████
 87.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   1 ms | █  220
   2 ms | ████████████  1712
   3 ms | ████████████████████████████████████████  5867
   4 ms | ███████████████████████████████  4523
   5 ms | ████████████████  2316
   6 ms | ████████  1197
   7 ms | ██████  818
   8 ms | █████  770
   9 ms | ███  487
  10 ms | ██  318
  11 ms | █  161
  12 ms | █  126
  13 ms | █  82
  14 ms |   68
  15 ms | █  209
  16 ms | █  207
  17 ms | ██  262
  18 ms | ██  347
  19 ms | ██  344
  20 ms | ███  386
  21 ms | ██  348
  22 ms | ██  230
  23 ms | █  204
  24 ms | █  140
  25 ms | █  165
  26 ms | █  158
  27 ms | █  112
  28 ms | █  78
  29 ms |   54
  30 ms |   49
  31 ms |   36
  32 ms |   34
  33 ms |   33
  34 ms |   19
  35 ms |   24
  36 ms |   30
  37 ms |   30
  38 ms |   23
  39 ms |   14
  40 ms |   17
  41 ms |   7
  42 ms |   12
  43 ms |   9
  44 ms |   13
  45 ms |   10
  46 ms |   19
  47 ms |   9
  48 ms |   8
  49 ms |   8
  50 ms |   8
  51 ms |   7
  52 ms |   3
  53 ms |   5
  54 ms |   4
  55 ms |   2
  56 ms |   3
  57 ms |   5
  58 ms |   2
  59 ms |   3
  60 ms |   1
  62 ms |   1
  63 ms |   1
  64 ms |   1
  66 ms |   1
  67 ms |   1
  68 ms |   2
  69 ms |   1
  70 ms |   1
  71 ms |   1
  74 ms |   2
  75 ms |   1
  78 ms |   1
  79 ms |   1
  80 ms |   1
  83 ms |   1
  90 ms |   1
 104 ms |   1
 163 ms |   1
1744 ms |   1
```

**Extras:**

- `segment_plan` = `intro,plaza_orbit,forest_fly,forest_orbit,base_fly,base_orbit,village_fly,village,combat_in,combat_orbit,redstone,cave_fly,cave_inside,cave_pull,nether_fly,nether_orbit,end_fly,end_orbit,final`
- `resource_pack` = `none`
- `part_label` = `LowEnd Shader`
- `segment_windows` = `intro=0-160,plaza_orbit=160-280,forest_fly=280-480,forest_orbit=480-680,base_fly=680-860,base_orbit=860-1080,village_fly=1080-1220,village=1220-1420,combat_in=1420-1520,combat_orbit=1520-1780,redstone=1780-1980,cave_fly=1980-2090,cave_inside=2090-2290,cave_pull=2290-2440,nether_fly=2440-2600,nether_orbit=2600-2840,end_fly=2840-3000,end_orbit=3000-3340,final=3340-3600`
- `shader_pack` = `lowEnd.zip`
- `iris_present` = `1.00`
- `seed` = `27182.00`
- `phase_count` = `4.00`
- `fps_0p1pct_low` = `6.51`
- `preset_long` = `0.00`
- `villagers_spawned` = `36.00`
- `preload_duration_ms` = `0.00`
- `preset_quick` = `0.00`
- `fps_harmonic_avg` = `123.46`
- `fps_1pct_low` = `17.91`
- `blocks_placed` = `3096347.00`
- `entity_count_sample_end` = `86.00`
- `preset_full` = `0.00`
- `other_entities_spawned` = `58.00`
- `entity_count_delta` = `85.00`
- `terrain_area_blocks` = `43473.00`
- `shader_in_use` = `1.00`
- `preload_chunks` = `81.00`
- `part` = `2.00`
- `segment_count` = `19.00`
- `phase` = `0.00`
- `trees_built` = `173.00`
- `entity_count_sample_start` = `1.00`

### LowEnd Shader + PBR Textures (`pack_shader_showcase`)

Category: **Showcase**  |  Duration: 92695 ms  |  Sample ticks: 0

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

- `part_label` = `LowEnd Shader + PBR Textures`
- `aborted_state` = `SAMPLING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `3.00`

