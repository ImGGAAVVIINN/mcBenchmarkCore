# FPS TEST - fpstest 1.0 → Fabric 1.21.11 Porting Inventory

## Phase 1: Original JAR Inventory (Authoritative Specification)

### Fabric Configuration (`fabric.mod.json`)
```json
{
  "schemaVersion": 1,
  "id": "fpstest",
  "version": "1.0",
  "name": "FPS TEST | Benchmark",
  "description": "Cinematic, automated FPS benchmark suite for Minecraft. Runs 41 scripted test scenarios — FPS, chunk loading, particles, entities, redstone, lighting, memory — and produces detailed JSON, Markdown and CSV reports.",
  "authors": ["randomfinder"],
  "license": "MIT",
  "icon": "assets/fpstest/icon.png",
  "environment": "client",
  "entrypoints": {
    "client": ["com.fpstest.client.FpsTestClient"]
  },
  "mixins": [
    {
      "config": "fpstest.client.mixins.json",
      "environment": "client"
    }
  ],
  "accessWidener": "fpstest.accesswidener",
  "depends": {
    "fabricloader": ">=0.16.0",
    "minecraft": "~1.21",
    "java": ">=21",
    "fabric-api": "*"
  }
}
```

### Complete Class Inventory (85 class files)

#### A. ORIGINAL MOD CLASSES (must be ported) - **CHECKLIST**

**1. Main Entrypoint**
- [ ] `com.fpstest.client.FpsTestClient` - Client entrypoint

**2. Benchmark Framework**
- [ ] `com.fpstest.client.bench.Benchmark` - Base benchmark class
- [ ] `com.fpstest.client.bench.BenchmarkRegistry` - Benchmark registry
- [ ] `com.fpstest.client.bench.BenchContext` - Benchmark context
- [ ] `com.fpstest.client.bench.BenchPhase` - Benchmark phase
- [ ] `com.fpstest.client.bench.BenchmarkResult` - Benchmark result data class
- [ ] `com.fpstest.client.bench.BenchmarkResult$Builder` - Builder for BenchmarkResult
- [ ] `com.fpstest.client.bench.BenchmarkResult$FrameStats` - Frame stats inner class
- [ ] `com.fpstest.client.bench.RunPlan` - Run plan class

**3. Camera System**
- [ ] `com.fpstest.client.bench.camera.CameraPath` - Camera path base
- [ ] `com.fpstest.client.bench.camera.CompositePath` - Composite camera path
- [ ] `com.fpstest.client.bench.camera.LinearPath` - Linear camera path
- [ ] `com.fpstest.client.bench.camera.MultiAnglePath` - Multi-angle camera path
- [ ] `com.fpstest.client.bench.camera.MultiAnglePath$Cut` - Cut segment inner class
- [ ] `com.fpstest.client.bench.camera.OrbitPath` - Orbit camera path
- [ ] `com.fpstest.client.bench.camera.Pose` - Camera pose class

**4. Instrumentation**
- [ ] `com.fpstest.client.bench.instrumentation.Instr` - Instrumentation class
- [ ] `com.fpstest.client.bench.instrumentation.IntSeries` - Integer series
- [ ] `com.fpstest.client.bench.instrumentation.Instr$Snapshot` - Snapshot inner class

**5. Scene/WORLD**
- [ ] `com.fpstest.client.bench.scene.Arena` - Arena class
- [ ] `com.fpstest.client.bench.world.EphemeralWorld` - Ephemeral world
- [ ] `com.fpstest.client.bench.world.EphemeralWorld$1` - World fragment 1
- [ ] `com.fpstest.client.bench.world.EphemeralWorld$2` - World fragment 2

**6. Benchmark Tests (17 classes)**
- [ ] `com.fpstest.client.bench.tests.BaseFpsBenchmark` - Base FPS benchmark
- [ ] `com.fpstest.client.bench.tests.BaseFpsBenchmark$NamedSegment` - Named segment inner class
- [ ] `com.fpstest.client.bench.tests.ChunkFlybyBenchmark` - Chunk flyby test
- [ ] `com.fpstest.client.bench.tests.ComparatorStorageBenchmark` - Comparator storage test
- [ ] `com.fpstest.client.bench.tests.EntityRingBenchmark` - Entity ring test
- [ ] `com.fpstest.client.bench.tests.FallingSandBenchmark` - Falling sand test
- [ ] `com.fpstest.client.bench.tests.FluidSpreadBenchmark` - Fluid spread test
- [ ] `com.fpstest.client.bench.tests.HopperGridBenchmark` - Hopper grid test
- [ ] `com.fpstest.client.bench.tests.IdleBaselineBenchmark` - Idle baseline test
- [ ] `com.fpstest.client.bench.tests.ItemsMergeStormBenchmark` - Items merge storm test
- [ ] `com.fpstest.client.bench.tests.LightingUpdateBenchmark` - Lighting update test
- [ ] `com.fpstest.client.bench.tests.ParticleCycleBenchmark$Stage` - Particle cycle stage
- [ ] `com.fpstest.client.bench.tests.ParticleCycleBenchmark` - Particle cycle benchmark
- [ ] `com.fpstest.client.bench.tests.ParticleQuarryBenchmark` - Particle quarry benchmark
- [ ] `com.fpstest.client.bench.tests.PistonSlimeArrayBenchmark` - Piston/slime array test
- [ ] `com.fpstest.client.bench.tests.ProjectileStormBenchmark` - Projectile storm test
- [ ] `com.fpstest.client.bench.tests.RedstoneClockBenchmark` - Redstone clock test
- [ ] `com.fpstest.client.bench.tests.RedstoneDustGridBenchmark` - Redstone dust grid test
- [ ] `com.fpstest.client.bench.tests.StaticDenseForestBenchmark` - Static dense forest test
- [ ] `com.fpstest.client.bench.tests.TntFieldBenchmark` - TNT field test
- [ ] `com.fpstest.client.bench.tests.VillagerAiVillageBenchmark` - Villager AI village test
- [ ] `com.fpstest.client.bench.tests.ZombieMazeBenchmark` - Zombie maze test

**7. Configuration**
- [ ] `com.fpstest.client.config.FpsTestConfig$HudAnchor` - HUD anchor enum/class
- [ ] `com.fpstest.client.config.FpsTestConfig` - Main configuration class

**8. Cinematic Control**
- [ ] `com.fpstest.client.control.CinematicState` - Cinematic state management

**9. GUI System**
- [ ] `com.fpstest.client.gui.BenchmarkHub$Preset` - Benchmark preset inner class
- [ ] `com.fpstest.client.gui.BenchmarkHub$Tab` - Tab inner class
- [ ] `com.fpstest.client.gui.BenchmarkHub` - Main benchmark hub GUI
- [ ] `com.fpstest.client.gui.BenchmarkResultsScreen$SysSpec` - System spec inner class
- [ ] `com.fpstest.client.gui.BenchmarkResultsScreen` - Results screen GUI
- [ ] `com.fpstest.client.gui.FlatButton$Builder` - Flat button builder
- [ ] `com.fpstest.client.gui.FlatButton` - Flat button GUI
- [ ] `com.fpstest.client.gui.HubState` - Hub state class
- [ ] `com.fpstest.client.gui.I18n` - Internationalization
- [ ] `com.fpstest.client.gui.LangAssets` - Language assets
- [ ] `com.fpstest.client.gui.ReportComparator` - Report comparison
- [ ] `com.fpstest.client.gui.ReportsScreen` - Reports screen
- [ ] `com.fpstest.client.gui.SettingsScreen` - Settings screen

**10. HUD**
- [ ] `com.fpstest.client.hud.PerfHud$1` - HUD fragment 1
- [ ] `com.fpstest.client.hud.PerfHud` - Performance HUD

**11. Metrics Tracking**
- [ ] `com.fpstest.client.metrics.FpsTracker` - FPS tracking
- [ ] `com.fpstest.client.metrics.MemoryTracker` - Memory tracking
- [ ] `com.fpstest.client.metrics.RingBuffer` - Ring buffer class
- [ ] `com.fpstest.client.metrics.Stats` - Statistics class
- [ ] `com.fpstest.client.metrics.TickTracker` - Tick tracking

**12. Mixins (11 client-side mixins)**
- [ ] `com.fpstest.client.mixin.CameraAccessor` - Camera accessor
- [ ] `com.fpstest.client.mixin.CameraMixin` - Camera mixin
- [ ] `com.fpstest.client.mixin.ExplosionMixin` - Explosion mixin
- [ ] `com.fpstest.client.mixin.FallingBlockEntityMixin` - Falling block entity mixin
- [ ] `com.fpstest.client.mixin.KeyboardInputMixin` - Keyboard input mixin
- [ ] `com.fpstest.client.mixin.MouseHandlerMixin` - Mouse handler mixin
- [ ] `com.fpstest.client.mixin.PauseMenuSuppressMixin` - Pause menu suppressor
- [ ] `com.fpstest.client.mixin.SectionBuilderMixin` - Section builder mixin
- [ ] `com.fpstest.client.mixin.ServerWorldTickBlockMixin` - Server world tick block mixin
- [ ] `com.fpstest.client.mixin.TitleScreenMixin` - Title screen mixin
- [ ] `com.fpstest.client.mixin.WorldSetBlockStateMixin` - World block state mixin

#### B. Minecraft/DEPENDENCY CLASSES (present in JAR but not mod code)
- Various `net/minecraft/*` classes referenced in method signatures and mixins
- Access widener references to `net/minecraft/class_1297`
- Mixin references to `class_1927`, `class_1540`, `class_743`, `class_312`, `class_310`, `class_442`, `class_9810`, `class_1937`

#### C. Generated/Bridge Artifacts
- `client-fpstest-refmap.json` - Mixin reference map (generated by Mixin API)
- `fpstest.accesswidener` - Access widening configuration (generated from accessors)

### Resource Inventory

**Assets:**
- [ ] `assets/fpstest/icon.png` - Mod icon

**Language Files (8 locales):**
- [ ] `assets/fpstest/lang/de_de.json` - German
- [ ] `assets/fpstest/lang/en_us.json` - English
- [ ] `assets/fpstest/lang/es_es.json` - Spanish
- [ ] `assets/fpstest/lang/fr_fr.json` - French
- [ ] `assets/fpstest/lang/ja_jp.json` - Japanese
- [ ] `assets/fpstest/lang/ru_ru.json` - Russian
- [ ] `assets/fpstest/lang/uk_ua.json` - Ukrainian
- [ ] `assets/fpstest/lang/zh_cn.json` - Chinese (Simplified)

**Localization scope**: Extensive UI strings covering:
- Benchmark selection and confirmation dialogs
- Results display (FPS stats, timing, system specs)
- HUD anchor positions
- Graphics settings
- Report generation and comparison
- And many more UI strings

**Mixin Configuration:**
- [ ] `fpstest.client.mixins.json` - 11 client-side mixins with Java 21 compatibility
- [ ] `client-fpstest-refmap.json` - Mixin refmap for runtime mixin execution

### Entry Points (from fabric.mod.json)
- [ ] `com.fpstest.client.FpsTestClient` - Client initialization entrypoint

### Key Functional Areas to Verify Post-Port

**1. Benchmark Selection & Registration**
- Benchmark categories and presets
- Test selection UI
- Heavy test warnings

**2. Benchmark Execution**
- Individual benchmark running
- Progress tracking
- Timeout handling

**3. FPS/Timing Statistics**
- Average FPS calculation
- Min/Max FPS measurement
- Percentile calculations (1%, 0.1%, p95, p99, p99.9)
- Frame timing data
- Tick counting

**4. HUD Display**
- FPS overlay
- Configuration anchoring
- Position selection (corners, edges)

**5. Cinematic Camera System**
- Camera path following
- Multi-angle switching
- Pose transitions
- Cinematic state management

**6. GUI Functionality**
- Benchmark hub interface
- Results screen with system specs
- Report comparison
- Session management
- Settings dialog

**7. Configuration System**
- FpsTestConfig management
- HudAnchor selection
- Persistence and loading

**8. Metrics Tracking**
- FPS tracking over time
- Memory usage monitoring
- Tick tracking
- Stats accumulation and reporting

**9. World/Arena Setup**
- Ephemeral world creation
- Arena configuration
- Test environment setup

**10. Report Generation**
- JSON, Markdown, and CSV output
- Report comparison functionality
- Session history

**11. Commands/Keybinds**
- (Need to verify from decompilation if commands/keybinds exist)

**12. Mixin Loading**
- All 11 client mixins must load successfully
- Mixin compatibility with Java 21 and Fabric 1.21.11

---

## Phase 2: Baseline 1.21.11 Project

The current workspace `mcbenchmarkcore` is a **known-good** Fabric 1.21.11 project with:
- Gradle version: (to be verified)
- Loom version: 1.17-SNAPSHOT
- Minecraft version: 1.21.11
- Fabric Loader: 0.19.3
- Fabric API: 0.141.6+1.21.11
- Java 21 source/target compatibility
- Source layout: `src/main/java`, `src/client/java`
- Resource layout: Standard Fabric resource loading

**Do NOT change** Gradle versions, Loom versions, mappings, Java versions, or Fabric versions just because they differ from the original mod. The existing project is already known-good.

---

## Phase 3: Porting Strategy

### Decompilation Reference
Use **Vineflower** explicitly for decompilation reference, but:
- Do NOT copy Minecraft classes from decompilation into `src/main/java`
- Only reconstruct classes identified as **A: original mod code** during inventory
- Preserve original package structure where possible
- Identify Minecraft/Fabric API dependencies for each class
- Port to mappings/API used by the working 1.21.11 project

### Porting Order (as per Phase 5 guidelines):

1. **Mod metadata/resources** - fabric.mod.json, mixin configs, language files, assets
2. **Main entrypoint** - FpsTestClient
3. **Core interfaces/data classes** - Benchmark, BenchmarkRegistry, BenchmarkResult
4. **Benchmark framework** - BenchContext, BenchPhase, RunPlan
5. **Individual benchmark implementations** - All 17+ test classes
6. **Metrics/FPS tracking** - FpsTracker, MemoryTracker, Stats, TickTracker
7. **GUI** - All GUI classes
8. **HUD** - PerfHud
9. **Configuration** - FpsTestConfig
10. **Cinematic/camera system** - Camera paths and runner
11. **Mixins** - All 11 client mixins
12. **Commands/keybinds/etc.** - Verify from decompilation
13. **Remaining resources** - Full localization, assets

### Post-Build Verification (Phase 6)

After `./gradlew build` succeeds, must verify:

**Entry points**: Every original entrypoint from `fabric.mod.json` exists and is registered.

**Mixins**: Compare original mixin configuration against the new one. Every original mixin should have a corresponding 1.21.11 implementation unless documented as no longer required.

**Classes**: Compare original mod-class inventory against the final source tree. If an original class is absent, investigate it. **DO NOT assume** "It wasn't needed because the build succeeded."

**Resources**: Compare assets, language files, configs, mixin JSON, metadata, textures against the original JAR.

**Functionality**: Trace major user-visible functions:
- Benchmark selection ✓
- Benchmark registration ✓
- Benchmark execution ✓
- Benchmark results ✓
- FPS measurement ✓
- Tick measurement ✓
- Memory measurement ✓
- HUD ✓
- GUI ✓
- Configuration ✓
- Cinematic camera ✓
- Commands/keybinds - to verify
- World/arena setup ✓
- Report generation/comparison ✓

---

## Phase 4: Migration Checklist Template

| Original class/function | Original status | 1.21.11 implementation | Status |
|------------------------|----------------|------------------------|--------|
| `FpsTestClient` | Client entrypoint | TBD | TODO |
| `BenchmarkRegistry` | Registers benchmarks | TBD | TODO |
| `BaseFpsBenchmark` | Base class for all benchmarks | TBD | TODO |
| `Benchmark` | Individual benchmark | TBD | TODO |
| `FpsTracker` | FPS measurement | TBD | TODO |
| `PerfHud` | FPS display HUD | TBD | TODO |
| `FpsTestClient$HudAnchor` | HUD anchor config | TBD | TODO |
| `CinematicRunner` | Camera cinematic system | TBD | TODO |
| `BenchmarkHub` | Main GUI screen | TBD | TODO |
| ... | ... | ... | ... |

**Every original mod-specific class/function must have an entry.**

Do not consider the port complete until every entry is either:
- implemented,
- intentionally replaced with an equivalent 1.21.11 implementation,
- or explicitly documented as impossible/incompatible.

Never silently omit a feature.

---

## Phase 5: Incremental Porting

Do NOT attempt to blindly compile the entire decompilation.

Port in logical groups, building and testing after each:

1. **Mod metadata/resources** - fabric.mod.json, mixin configs, language files (8 locales), icon asset
2. **Main entrypoint** - FpsTestClient class
3. **Core interfaces/data classes** - Benchmark, BenchmarkRegistry, BenchmarkResult
4. **Benchmark framework** - BenchContext, BenchPhase, RunPlan
5. **Individual benchmark implementations** - Start with simple ones (IdleBaselineBenchmark, etc.)
6. **Metrics/FPS tracking** - FpsTracker, MemoryTracker, Stats, TickTracker
7. **GUI** - BenchmarkHub, BenchmarkResultsScreen, SettingsScreen
8. **HUD** - PerfHud
9. **Configuration** - FpsTestConfig
10. **Cinematic/camera system** - CameraPath, CompositePath, CinematicRunner
11. **Mixins** - All 11 client mixins with proper mappings
12. **Commands/keybinds** - If any exist
13. **Remaining resources** - Full localization, remaining assets

After each major group:
```
./gradlew build
```
If the build fails:
1. Read the **first meaningful error**
2. Determine whether it is:
   - mapping/API change
   - missing class
   - incorrect package
   - missing dependency
   - mixin problem
   - Java incompatibility
   - genuinely missing source
3. Fix it
4. Run the build again
**Never declare something fixed without actually running `./gradlew build` afterward.**

---

## Phase 6: Detect Accidentally Missing Functionality

Compilation is NOT sufficient to declare the port complete.

After the project builds, compare the final project against the original JAR inventory.

Specifically verify:

### Entry points
Check that every original entrypoint from `fabric.mod.json` exists and is registered.

### Mixins
Compare the original mixin configuration against the new one.
Every original mixin should have a corresponding 1.21.11 implementation unless there is a documented reason it is no longer required.

### Classes
Compare the original mod-class inventory against the final source tree.
If an original class is absent, investigate it.
**DO NOT assume**: "It wasn't needed because the build succeeded."

### Resources
Compare:
- assets
- language files
- configs
- mixin JSON
- metadata
- textures
- other resources
against the original JAR.

### Functionality
Trace the major user-visible functions of the original mod:
- benchmark selection ✓
- benchmark registration ✓
- benchmark execution ✓
- benchmark results ✓
- FPS measurement ✓
- tick measurement ✓
- memory measurement ✓
- HUD ✓
- GUI ✓
- configuration ✓
- cinematic camera ✓
- commands/keybinds - to verify
- world/arena setup ✓
- report generation/comparison ✓
- any other functionality discovered during the inventory

Make sure each exists in the 1.21.11 implementation.

---

## Phase 7: Runtime Verification

Once `./gradlew build` succeeds, **do not stop**.

Launch the resulting mod in Minecraft 1.21.11.

Test the major functionality against the original mod.

At minimum verify:
- Minecraft starts with the mod ✓
- mod initializes without exceptions ✓
- main UI opens ✓
- benchmarks appear ✓
- a benchmark can actually start ✓
- benchmark can complete ✓
- FPS/timing statistics are recorded ✓
- HUD works ✓
- configuration works ✓
- cinematic functionality works ✓
- benchmark results/reporting works ✓
- mixins load successfully ✓

Check:
```
logs/latest.log
```
for:
- mixin failures
- missing classes
- initialization exceptions
- failed registrations
- resource errors
- runtime crashes

---

## Extremely Important Rules

### DO NOT
- [x] blindly decompile the entire JAR into `src/main/java`
- [x] copy Minecraft classes from the JAR into the project
- [x] remove classes merely because they cause duplicate-class errors
- [x] remove benchmark classes merely because they appear to resemble Minecraft classes
- [x] rewrite functionality just to make compilation easier
- [x] downgrade Gradle arbitrarily
- [x] change Loom arbitrarily
- [x] replace working 1.21.11 build configuration without justification
- [x] declare success because compilation succeeded
- [x] stop after fixing one error without rebuilding
- [x] assume missing functionality is acceptable
- [x] silently omit classes that you cannot immediately understand

### DO
- [x] preserve the working 1.21.11 toolchain
- [x] use the original JAR as the functional reference
- [x] use Vineflower explicitly for Java decompilation/reference
- [x] inventory the original JAR before making changes
- [x] distinguish mod classes from Minecraft/dependency classes using evidence
- [x] maintain a complete porting checklist
- [x] port all original mod functionality
- [x] adapt changed Minecraft/Fabric APIs to 1.21.11
- [x] build repeatedly during the port
- [x] launch Minecraft after building
- [x] compare the final project against the original inventory
- [x] investigate every missing original mod class
- [x] verify functionality at runtime

---

## Definition of DONE

Do **not** tell me the port is complete merely because:

```
./gradlew build
```

passes successfully.

The port is complete only when **all three** are true:

### 1. Build
```
./gradlew build
```
passes successfully.

### 2. Runtime
Minecraft 1.21.11 launches with the mod and the major mod functionality works.

### 3. Parity
The final source/resources have been compared against the original JAR inventory and there are **no unexplained missing mod-specific classes, mixins, resources, entrypoints, or features**.

If something from the original cannot be ported, explicitly identify:
- what is missing
- why it cannot currently be ported
- what replaced it, if anything
- whether it affects functionality

Do not hide the omission.

**Most importantly: maintain the inventory/checklist throughout the entire task. It is the safeguard against producing a project that builds successfully but is secretly missing half of the original mod.**