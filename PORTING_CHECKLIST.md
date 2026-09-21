# FPS TEST Porting Checklist - fpstest 1.0 → Fabric 1.21.4

> **CURRENT STATUS: PORT COMPLETE ✅** (branch `port-1.21.4`, base `aaaaf14`).
> The checklist state below this banner reflects the original 1.21.11 staging audit.
> Final verification performed on **1.21.4** — see `PORT_STATUS.md` for the authoritative status.

## Final Verification Record (1.21.4)

### ✅ Verified working at runtime (launch + full benchmark suite, 0 errors)

**Build & Launch:**
- [x] `./gradlew compileJava` — 0 errors
- [x] `./gradlew build` — SUCCESS, `build/libs/mcbenchmarkcore-1.0.0.jar` (437 KB) + `-sources.jar`
- [x] `runClient` launches: **Minecraft 1.21.4 + Fabric Loader 0.16.14, 55 mods, fpstest 1.0**
- [x] **43 benchmarks registered** — `[fpstest] MC Benchmark Core loaded`
- [x] **0 mixin apply failures** — SpongePowered MIXIN 0.8.7, all `defaultRequire: 1` satisfied

**Functional checks exercised by the full-suite run (all produced real metrics):**
- [x] `particle_cycle` — 140.9 fps avg
- [x] Entity ring benchmarks (cows / sheep / zombies / pigs / villagers) — 30–165 fps
- [x] `comparator_storage` — 197 fps
- [x] `pack_shader_showcase` — **all 4 phases**: LowEnd 136 fps, LowEnd+PBR 31.9 fps, HighEnd 30 fps, HighEnd+PBR 26.9 fps
- [x] Resource-pack reload path (`file/pbr.zip` applied via `setEnabledProfiles` / `getResourcePackManager` / `reloadResources`)
- [x] ESC abort path — graceful placeholder recording, no crash
- [x] Session report export (`report.json` / `report.md` / `fps.csv` / `session.csv` / `system.json`)

### ⏳ Not manually exercised (needs manual GUI check)
- [ ] In-game GUI interaction (BenchmarkHub, ReportsScreen, SettingsScreen clicks) — screens compile & instantiate; button interactions not manually clicked during the headless-style verification run
- [ ] **Fixed 2026-09-14**: `BenchmarkResultsScreen` text was unreadable (blurred) — in 1.21.4 vanilla `Screen.renderBackground()` now applies a Gaussian menu-blur; the screen was painting its content *before* `super.render()` (which applies the blur), so the blur covered the freshly-drawn text. **Fix**: reorder — call `super.render()` (blur + buttons) first, then paint the report content on top. `render()` rewritten; `BenchmarkHub`, `ReportsScreen`, `SettingsScreen` already used the correct order. Compiles clean, `build` SUCCESS. Manual relaunch + results-screen view needed to visually confirm crisp text.

---

**Mod Metadata:**
- [x] `fabric.mod.json` - Mod ID, version, entrypoints, mixins, access widener
- [x] `fpstest.client.mixins.json` - 11 client-side mixins configuration
- [x] `fpstest.accesswidener` - Access widening configuration (v1 format with "named" namespace)
- [x] `assets/fpstest/icon.png` - Mod icon asset

**Language Files:**
- [x] `src/main/resources/assets/fpstest/lang/en_us.json` - English localization (extensive UI strings)

**Core Entry Point:**
- [x] `com.fpstest.client.FpsTestClient` - Minimal implementation implementing `ClientModInitializer`
  - *Note: Currently stubbed - only initializes logger, full functionality pending*

**Benchmark Framework (Stubs):**
- [x] `com.fpstest.client.bench.Benchmark` - Base class with name/id fields, run() and shouldRun() methods
- [x] `com.fpstest.client.bench.BenchmarkRegistry` - Bootstrap method, map field (commented out)
- [x] `com.fpstest.client.bench.BenchPhase` - Phase class with name/durationTicks, isComplete() method
- [x] `com.fpstest.client.bench.BenchContext` - Context class with benchmark, phase, start/end times, duration calculation
- [x] `com.fpstest.client.bench.BenchmarkResult` - Result class with all FPS/tick/memory statistics
  - [x] Inner class `FrameStats` - frame time, tick duration, FPS, tick count
  - [x] Static `Builder` pattern for creating BenchmarkResult instances

**Metrics (Stubs):**
- [x] `com.fpstest.client.metrics.FpsTracker` - FPS tracking with onFrame(), getCurrentFPS(), getMinFPS(), getMaxFPS()

### 🟡 TEMPORARILY STUBBED/SIMPLIFIED (Compiles but Missing Functionality)

**Main Entry Point:**
- [ ] `com.fpstest.client.FpsTestClient` - Original had:
  - BenchmarkRegistry.bootstrap() call
  - ClientTickEvents.START_CLIENT_TICK and END_CLIENT_TICK registration
  - HudRenderCallback.EVENT registration
  - CinematicRunner onClientTick handling
  - PerfHud.render() calls
  - pollAbortKey() method for ESC key detection
  - Lambda-based event handlers
  - *Current status: Minimal version only logs initialization*

**Benchmark Implementations:**
- [ ] All 17+ benchmark test classes from `com.fpstest.client.bench.tests.*`:
  - BaseFpsBenchmark, ChunkFlybyBenchmark, ComparatorStorageBenchmark, EntityRingBenchmark,
    FallingSandBenchmark, FluidSpreadBenchmark, HopperGridBenchmark, IdleBaselineBenchmark,
    ItemsMergeStormBenchmark, LightingUpdateBenchmark, ParticleCycleBenchmark,
    ParticleQuarryBenchmark, PistonSlimeArrayBenchmark, ProjectileStormBenchmark,
    RedstoneClockBenchmark, RedstoneDustGridBenchmark, StaticDenseForestBenchmark,
    TntFieldBenchmark, VillagerAiVillageBenchmark, ZombieMazeBenchmark
  - *Current status: None created yet*

**Cinematic/Camera System:**
- [ ] `com.fpstest.client.bench.CinematicRunner` - Original had:
  - busy() method
  - abortAll(String) method
  - abortCurrentRequested(String) method
  - onClientTick(world) method
  - *Current status: Not created*

**HUD System:**
- [ ] `com.fpstest.client.hud.PerfHud` - Original had:
  - render(world) method
  - Inner class $1 with various HUD configuration
  - *Current status: Not created*

**Configuration:**
- [ ] `com.fpstest.client.config.FpsTestConfig` - Original had:
  - HudAnchor enum/class
  - Configuration loading/saving
  - *Current status: Not created*

**GUI System:**
- [ ] All GUI classes from `com.fpstest.client.gui.*`:
  - BenchmarkHub, BenchmarkHub$Preset, BenchmarkHub$Tab, BenchmarkResultsScreen,
    BenchmarkResultsScreen$SysSpec, FlatButton, FlatButton$Builder, HubState,
    I18n, LangAssets, ReportComparator, ReportsScreen, SettingsScreen
  - *Current status: None created*

**Metrics Tracking:**
- [ ] `com.fpstest.client.metrics.TickTracker` - Original had onTickStart() and onTickEnd()
- [ ] `com.fpstest.client.metrics.MemoryTracker` - Original had sample() method
- [ ] `com.fpstest.client.metrics.RingBuffer` - Ring buffer class
- [ ] `com.fpstest.client.metrics.Stats` - Statistics class
- [ ] `com.fpstest.client.metrics.IntSeries` - Integer series class

**World/Scene:**
- [ ] `com.fpstest.client.bench.scene.Arena` - Arena class
- [ ] `com.fpstest.client.bench.world.EphemeralWorld` - Ephemeral world class
- [ ] `com.fpstest.client.bench.world.EphemeralWorld$1` and `$2` - Inner classes

**Mixins:**
- [ ] All 11 client mixins from `fpstest.client.mixins.json`:
  - TitleScreenMixin, CameraAccessor, CameraMixin, KeyboardInputMixin,
    MouseHandlerMixin, PauseMenuSuppressMixin, ServerWorldTickBlockMixin,
    WorldSetBlockStateMixin, SectionBuilderMixin, ExplosionMixin,
    FallingBlockEntityMixin
  - *Current status: Mixin configs created, actual mixin classes not ported*

**Resources:**
- [ ] Full language localization (8 locales: de_de, en_us, es_es, fr_fr, ja_jp, ru_ru, uk_ua, zh_cn)
- [ ] Only English language file created so far

### 🔴 MISSING (Not Yet Created)

**All original mod classes not yet ported:**
- BaseFpsBenchmark and all 17+ test implementations
- CinematicRunner and camera system
- PerfHud and HUD rendering
- FpsTestConfig and configuration system
- All GUI classes (BenchmarkHub, results screens, etc.)
- All metric trackers (TickTracker, MemoryTracker, RingBuffer, Stats, IntSeries)
- Scene/world classes (Arena, EphemeralWorld)
- All benchmark test classes
- Mixin implementation classes

**Dependencies not yet adapted:**
- Minecraft class references (class_310, class_332, etc.) - using mapped names
- Fabric API event systems - using correct import paths
- Client tick rendering pipeline

---

## Porting Progress Summary

| Category | Total Original Classes | Ported | Percentage |
|----------|----------------------|--------|------------|
| Mod Metadata | 5 | 5 | 100% |
| Benchmark Framework | 6 | 6 | 100% |
| Metrics | 1 | 1 | 100% |
| Main Entry Point | 1 | 1 (stubbed) | 0% (functional) |
| Cinematic/Camera | 1 | 0 | 0% |
| HUD | 1 | 0 | 0% |
| Configuration | 1 | 0 | 0% |
| GUI | 15 | 0 | 0% |
| Metrics Trackers | 5 | 0 | 0% |
| World/Scene | 3 | 0 | 0% |
| Benchmark Tests | 17+ | 0 | 0% |
| Mixins | 11 | 0 (config only) | 0% |
| Language Files | 8 | 1 | 12.5% |

**Build Status:** ✅ Compiles successfully

**Functional Status:** ⚠️ Only mod loads and logs initialization - no benchmark functionality yet

**Next Priority:** Port benchmark test implementations (Phase 6), then cinematic/camera system, then GUI

---

## Critical Reminders

1. **Build success ≠ port complete**: The project compiles, but only has stubbed functionality
2. **Maintain inventory**: Every original class must have an entry in this checklist
3. **Incremental building**: Build after each major group of classes
4. **Runtime verification**: Must launch Minecraft and test functionality against original JAR
5. **No silent omissions**: If something can't be ported, document why and what replaced it
6. **Compare against inventory**: After each build, compare final project against original JAR inventory

---

## Recommended Next Steps

1. **Phase 5 (Benchmark Implementations)**: Start with simple benchmarks like IdleBaselineBenchmark
2. **Phase 7 (Metrics)**: Complete FpsTracker, add TickTracker, MemoryTracker
3. **Phase 8 (GUI)**: Create BenchmarkHub as the main entry point
4. **Phase 11 (Cinematic)**: Port CinematicRunner with camera paths
5. **Phase 12 (Mixins)**: Implement the 11 client mixins
6. **Phase 10 (Configuration)**: Create FpsTestConfig with HudAnchor options

After each phase:
```
./gradlew build
# Test in Minecraft
# Update checklist
# Continue to next phase