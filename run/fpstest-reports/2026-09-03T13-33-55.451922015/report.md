# FPS Test session — 2026-09-03T13:37:21.179661297+10:00

- Minecraft: `Fabric`
- OS: `Linux 6.8.0-60-generic (amd64)`
- CPU cores: `16`
- Java: `21.0.12` (OpenJDK 64-Bit Server VM)
- Max heap: `7808 MB`
- GPU: `NVIDIA GeForce RTX 4070 SUPER/PCIe/SSE2 / 3.3.0 NVIDIA 580.173.02`

## Summary

| # | Benchmark | Cat. | Avg FPS | 1% low | 0.1% low | p99 frame ms | Tick avg ms | GC | Heap Δ MB |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|
| 1 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 2 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 3 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 4 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 5 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 6 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 7 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 8 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 9 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 10 | [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together) | Particles | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 11 | [Zombies obstacle pathfinding (150 + pillar maze)](#zombies-obstacle-pathfinding-150--pillar-maze) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 12 | [Villager AI village (80, brain on)](#villager-ai-village-80-brain-on) | Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 13 | [TNT field (14×14 staggered fuses)](#tnt-field-1414-staggered-fuses) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 14 | [TNT field destructive (breaks terrain)](#tnt-field-destructive-breaks-terrain) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 15 | [Falling sand wall 40×40 (heavy)](#falling-sand-wall-4040-heavy) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 16 | [Falling gravel mixed heavy (sand+gravel+concrete)](#falling-gravel-mixed-heavy-sandgravelconcrete) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 17 | [Falling sand wall (lite, staggered)](#falling-sand-wall-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 18 | [Falling gravel mixed (lite, staggered)](#falling-gravel-mixed-lite-staggered) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 19 | [Projectile storm (arrows + snowballs)](#projectile-storm-arrows--snowballs) | Physics | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 20 | [Redstone clocks (6×6)](#redstone-clocks-66) | Redstone | 109.4 | 41.8 | 29.5 | 22.36 | 0.38 | 0 | 388 |
| 21 | [Redstone dust grid (16 trails ×32 + repeaters + lamps)](#redstone-dust-grid-16-trails-32--repeaters--lamps) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 22 | [Piston/slime array (8×8 toggled every 8t)](#pistonslime-array-88-toggled-every-8t) | Redstone | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 23 | [Static dense forest (orbit canopy, no worldgen)](#static-dense-forest-orbit-canopy-no-worldgen) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 24 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 25 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 26 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 27 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 28 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 29 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 30 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 31 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 32 | [Plains flyby (single-biome world)](#plains-flyby-single-biome-world) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 33 | [Cherry grove flyby](#cherry-grove-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 34 | [Badlands flyby](#badlands-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 35 | [Dark forest flyby (dense canopy)](#dark-forest-flyby-dense-canopy) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 36 | [Windswept hills flyby](#windswept-hills-flyby) | Chunks | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 37 | [Idle Baseline](#idle-baseline) | Baseline | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 38 | [Particle diversity stress (16 types simultaneously)](#particle-diversity-stress-16-types-simultaneously) | Stress | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 39 | [Fluid spread (water basin, 4-step periodic reset)](#fluid-spread-water-basin-4-step-periodic-reset) | Fluids | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 40 | [Lighting update (16×16 glowstone reveal/hide)](#lighting-update-1616-glowstone-revealhide) | Lighting | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 41 | [Hopper grid 20×20 (transfer storm)](#hopper-grid-2020-transfer-storm) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 42 | [Comparator storage (8×8 chests + comparators)](#comparator-storage-88-chests--comparators) | Block-Entities | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |
| 43 | [LowEnd Shader](#lowend-shader) | Showcase | 0.0 | 0.0 | 0.0 | 0.00 | 0.00 | 0 | 0 |

## Table of contents

- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
- [Particle cycle (7 types → all together)](#particle-cycle-7-types--all-together)
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
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
- [Plains flyby (single-biome world)](#plains-flyby-single-biome-world)
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

Category: **Particles**  |  Duration: 753 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 3161 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 5397 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 7567 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 10081 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 12381 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 14689 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 16692 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 18638 ms  |  Sample ticks: 0

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

### Particle cycle (7 types → all together) (`particle_cycle`)

Category: **Particles**  |  Duration: 20890 ms  |  Sample ticks: 0

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

### Zombies obstacle pathfinding (150 + pillar maze) (`entity_zombies_obstacle_pathfinding`)

Category: **Entities**  |  Duration: 1342 ms  |  Sample ticks: 0

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

Category: **Entities**  |  Duration: 3852 ms  |  Sample ticks: 0

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

### TNT field (14×14 staggered fuses) (`tnt_field`)

Category: **Physics**  |  Duration: 846 ms  |  Sample ticks: 0

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

Category: **Physics**  |  Duration: 387 ms  |  Sample ticks: 0

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

### Falling sand wall 40×40 (heavy) (`falling_sand`)

Category: **Physics**  |  Duration: 905 ms  |  Sample ticks: 0

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

### Falling gravel mixed heavy (sand+gravel+concrete) (`falling_gravel_mixed`)

Category: **Physics**  |  Duration: 848 ms  |  Sample ticks: 0

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

### Falling sand wall (lite, staggered) (`falling_sand_lite`)

Category: **Physics**  |  Duration: 400 ms  |  Sample ticks: 0

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

### Falling gravel mixed (lite, staggered) (`falling_gravel_mixed_lite`)

Category: **Physics**  |  Duration: 501 ms  |  Sample ticks: 0

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

### Projectile storm (arrows + snowballs) (`projectile_storm`)

Category: **Physics**  |  Duration: 695 ms  |  Sample ticks: 0

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

### Redstone clocks (6×6) (`redstone_clocks`)

Category: **Redstone**  |  Duration: 23116 ms  |  Sample ticks: 400

**FPS**  avg `109.38`, min `23.02`, p50 `118.10`, p95 `131.45`, p99 `225.25`, 1%low `41.83`, 0.1%low `29.49`, std `65.16`

**Frame time (ms)**  avg `10.73`, p50 `8.47`, p95 `21.02`, p99 `22.36`, p99.9 `23.66`, max `43.45`

**Client tick (ms)**  avg `0.38`, p95 `0.53`, max `1.56`

**Memory**  start `624 MB`, end `1012 MB`, peak `1012 MB`, GC `0 events / 0 ms`

**FPS over sampling window (ASCII):**

```
183.4 |                                        █                                       
175.8 |                                        █                                       
168.2 |                                        █                                       
160.6 |                                        █                                       
153.0 |                                     █  ██                                      
145.4 |                                     █  ██                                      
137.8 |                                     █  ██       █                              
130.2 |                                     █  ██  █    █                            █ 
122.6 |                                     █  ██  █    █                            █ 
115.0 |    █ █                    █         █  ██  █    █                 █   █ █    █ 
107.5 |██ ██ ████  ██████ ███ ██████████ █████ ██ ███ ███  █ █████   ██ ███████ ███ ██ 
 99.9 |████████████████████████████████████████████████████████████████████████████████
       --------------------------------------------------------------------------------
       start                                                                      end
```

**Frame-time histogram (ms bucket → count):**

```
   0 ms |   3
   1 ms |   4
   3 ms |   4
   4 ms | █  17
   5 ms |   3
   6 ms |   2
   7 ms | ███████████  288
   8 ms | ████████████████████████████████████████  1037
   9 ms | ███  68
  10 ms |   4
  13 ms |   1
  14 ms | █  18
  15 ms | █  23
  16 ms | ███  65
  17 ms | ██  59
  18 ms | ██  51
  19 ms | ██  54
  20 ms | ███  69
  21 ms | ██  60
  22 ms | █  28
  23 ms |   4
  24 ms |   1
  43 ms |   1
```

**Extras:**

- `part_label` = `Main Benchmark (no shaders)`
- `preset_full` = `0.00`
- `block_state_changes` = `0.00`
- `preset_quick` = `1.00`
- `entity_count_sample_end` = `1.00`
- `fps_1pct_low` = `41.83`
- `fps_harmonic_avg` = `93.19`
- `neighbour_updates` = `0.00`
- `fps_0p1pct_low` = `29.49`
- `preload_chunks` = `81.00`
- `seed` = `4001.00`
- `preset_long` = `0.00`
- `observers_placed` = `72.00`
- `clocks_built` = `36.00`
- `entity_count_sample_start` = `1.00`
- `scheduled_block_ticks` = `9612.00`
- `preload_duration_ms` = `50.00`
- `part` = `1.00`
- `entity_count_delta` = `0.00`

### Redstone dust grid (16 trails ×32 + repeaters + lamps) (`redstone_dust_grid`)

Category: **Redstone**  |  Duration: 5522 ms  |  Sample ticks: 0

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

### Piston/slime array (8×8 toggled every 8t) (`piston_slime_array`)

Category: **Redstone**  |  Duration: 1093 ms  |  Sample ticks: 0

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

### Static dense forest (orbit canopy, no worldgen) (`static_dense_forest`)

Category: **Chunks**  |  Duration: 746 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 451 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 596 ms  |  Sample ticks: 0

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
- `aborted_state` = `POST_RUN`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 3998 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 7035 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 10436 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 13331 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 16876 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 20473 ms  |  Sample ticks: 0

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

### Plains flyby (single-biome world) (`chunk_plains`)

Category: **Chunks**  |  Duration: 23724 ms  |  Sample ticks: 0

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

### Cherry grove flyby (`chunk_cherry`)

Category: **Chunks**  |  Duration: 58 ms  |  Sample ticks: 0

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

### Badlands flyby (`chunk_badlands`)

Category: **Chunks**  |  Duration: 1 ms  |  Sample ticks: 0

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
- `aborted_state` = `PREPARING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Dark forest flyby (dense canopy) (`chunk_dark_forest`)

Category: **Chunks**  |  Duration: 43 ms  |  Sample ticks: 0

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

### Windswept hills flyby (`chunk_mountain`)

Category: **Chunks**  |  Duration: 1 ms  |  Sample ticks: 0

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
- `aborted_state` = `PREPARING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Idle Baseline (`idle_baseline`)

Category: **Baseline**  |  Duration: 1259 ms  |  Sample ticks: 0

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

### Particle diversity stress (16 types simultaneously) (`particle_diversity_stress`)

Category: **Stress**  |  Duration: 16 ms  |  Sample ticks: 0

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
- `aborted_state` = `PREPARING`
- `status` = `failed`
- `fail_reason` = `user pressed ESC`
- `part` = `1.00`

### Fluid spread (water basin, 4-step periodic reset) (`fluid_spread`)

Category: **Fluids**  |  Duration: 810 ms  |  Sample ticks: 0

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

Category: **Lighting**  |  Duration: 550 ms  |  Sample ticks: 0

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

Category: **Block-Entities**  |  Duration: 15862 ms  |  Sample ticks: 0

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

### Comparator storage (8×8 chests + comparators) (`comparator_storage`)

Category: **Block-Entities**  |  Duration: 2120 ms  |  Sample ticks: 0

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

Category: **Showcase**  |  Duration: 12394 ms  |  Sample ticks: 0

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

- `part_label` = `LowEnd Shader`
- `aborted_state` = `WARMUP`
- `status` = `failed`
- `fail_reason` = `user pressed Shift+ESC`
- `part` = `2.00`

