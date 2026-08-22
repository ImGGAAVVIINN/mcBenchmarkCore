# DEPENDENCY GRAPH: fpstest 1.0 → Fabric 1.21.11

## Overview

This document maps the class dependency relationships in the original `fpstest-1.0.jar` and shows how the ported classes in `mcbenchmarkcore` relate to each other.

## Original JAR Dependency Structure

### Core Entry Point

```
FpsTestClient (com.fpstest.client.FpsTestClient)
  ├── implements ClientModInitializer
  ├── ↓ benchmarkRegistry.bootstrap()  [BenchmarkRegistry]
  ├── ↓ FPS = new FpsTracker()  [FpsTracker]
  ├── ↓ TICKS = new TickTracker()  [TickTracker]
  ├── ↓ MEMORY = new MemoryTracker()  [MemoryTracker]
  ├── ↓ RUNNER = new CinematicRunner()  [CinematicRunner - NOT PORTED]
  ├── ↓ HUD = new PerfHud()  [PerfHud - NOT PORTED]
  ├── ↓ ClientTickEvents.START_CLIENT_TICK.register(lambda onStartTick)  [ClientTickEvents]
  ├── ↓ ClientTickEvents.END_CLIENT_TICK.register(lambda onEndTick)  [ClientTickEvents]
  ├── ↓ HudRenderCallback.EVENT.register(lambda onHudRender)  [HudRenderCallback]
  ├── ↓ pollAbortKey(screen)  [abort key handling]
  └── ↓ escWasDown state management
```

### Benchmark Framework

```
BenchmarkRegistry (com.fpstest.client.bench.BenchmarkRegistry)
  ├── holds Map<String, Benchmark> benchmarks  [Benchmark map]
  ├── ↓ bootstrap()  [called by FpsTestClient]
  ├── ↓ all(): returns Map<String, Benchmark>  [Benchmark accessor]
  ├── ↓ lambda handlers for client tick events  [event handlers]
  └── ↓ individual Benchmark instances
     └─→ ↓ run(): execute benchmark logic  [Benchmark]
        └─→ ↓ produces BenchmarkResult  [BenchmarkResult]
           └─→ ↓ statistics collection  [FpsTracker, TickTracker, MemoryTracker]

Benchmark (com.fpstest.client.bench.Benchmark)
  ├── name: String  [benchmark name]
  ├── id: int  [benchmark ID]
  ├── ↓ run(): void  [benchmark execution]
  ├── ↓ shouldRun(): boolean  [run eligibility]
  └─→ ↓ BenchmarkResult on completion  [BenchmarkResult]

BenchContext (com.fpstest.client.bench.BenchContext)
  ├── benchmark: Benchmark  [which benchmark running]
  ├── currentPhase: BenchPhase  [current phase]
  ├── startTime: long  [execution start]
  ├── endTime: long  [execution end]
  ├── ↓ getDurationNanos(): long  [duration calculation]
  └─→ ↓ getDurationSeconds(): double  [duration in seconds]

BenchmarkResult (com.fpstest.client.bench.BenchmarkResult)
  ├── benchmarkName: String  [test name]
  ├── durationNanos: long  [execution duration]
  ├── framesTotal: int  [frame count]
  ├── avgFPS: double  [average FPS]
  ├── minFPS: long  [minimum FPS]
  ├── maxFPS: long  [maximum FPS]
  ├── p1FPS: double  [1% low FPS]
  ├── p01FPS: double  [0.1% low FPS]
  ├── tickAvg: double  [average tick time]
  ├── tickP95: double  [95th percentile tick]
  ├── tickP99: double  [99th percentile tick]
  ├── tickMax: double  [maximum tick]
  ├── heapPeak: double  [peak memory usage]
  ├── gcEvents: int  [garbage collection count]
  ├── ↓ Builder pattern  [BenchmarkResult.Builder]
  └─→ ↓ FrameStats inner class  [per-frame data]
     ├── frameTimeNanos: long
     ├── tickDurationNanos: long
     ├── fps: double
     └── tickCount: int

CinematicRunner (com.fpstest.client.bench.CinematicRunner) - NOT PORTED
  ├── busy(): boolean  [is cinematic active?]
  ├── ↓ abortAll(String)  [abort all cinematic actions]
  ├── ↓ abortCurrentRequested(String)  [abort current cinematic]
  ├── ↓ onClientTick(World)  [per-tick camera update]
  ├── CameraPath following  [CameraPath and implementations]
  └── CameraPose state management
```

### Metrics Tracking Chain

```
FpsTracker (com.fpstest.client.metrics.FpsTracker)
  ├── ↓ onFrame(): called per render frame  [event handler]
  ├── ↓ getCurrentFPS(): double  [current FPS]
  ├── ↓ getMinFPS(): double  [minimum FPS]
  ├── ↓ getMaxFPS(): double  [maximum FPS]
  └─→ ↓ frame time sampling

TickTracker (com.fpstest.client.metrics.TickTracker)
  ├── ↓ onTickStart(): called at tick start
  ├── ↓ onTickEnd(): called at tick end
  ├── ↓ getTicksSinceStart(): long  [tick count]
  ├── ↓ getTotalTicksNanos(): long  [total tick duration]
  └─→ ↓ getAverageTickTimeMillis(): double  [avg tick time]

MemoryTracker (com.fpstest.client.metrics.MemoryTracker)
  ├── ↓ sample(): called to record memory  [metric collection]
  ├── ↓ getPeakMemory(): long  [peak memory]
  ├── ↓ getPeakMemoryMb(): double  [peak in MB]
  ├── ↓ getAverageMemoryMb(): double  [avg memory in MB]
  └─→ ↓ getSampleCount(): int  [sample count]

RingBuffer (com.fpstest.client.metrics.RingBuffer)
  ├── ↓ add(long value): circular buffer insertion
  ├── ↓ getAverage(): double  [mean of samples]
  ├── ↓ getLatest(): long  [most recent sample]
  ├── ↓ size(): int  [current sample count]
  └─→ ↓ isFull(): boolean  [buffer state]

Stats (com.fpstest.client.metrics.Stats)
  ├── ↓ start(): timing start
  ├── ↓ stop(): timing stop
  ├── ↓ onFrame(): frame counter increment
  ├── ↓ onTick(): tick counter increment
  ├── ↓ updateFPS(long fps): FPS update
  ├── ↓ getMinFPS(): long  [minimum FPS recorded]
  ├── ↓ getMaxFPS(): long  [maximum FPS recorded]
  ├── ↓ getTotalFrames(): long  [total frames counted]
  ├── ↓ getTotalTicks(): long  [total ticks counted]
  ├── ↓ getDurationSeconds(): double  [elapsed time]
  ├── ↓ getDurationMinutes(): double  [elapsed time in minutes]
  ├── ↓ getFPS(): double  [frames / duration]
  └─→ ↓ getTPS(): double  [ticks / duration]

CinematicState (com.fpstest.client.control.CinematicState) - NOT PORTED
  ├── cinematic state management
  ├── state transitions
  └─→ ↓ called by CinematicRunner
```

### GUI Dependency Chain

```
BenchmarkHub (com.fpstest.client.gui.BenchmarkHub) - STUB
  ├── ↓ main benchmark selection screen
  ├── ↓ preset selection (41 presets)
  ├── ↓ ↓ selectPreset(int)  [preset choice]
  ├── ↓ ↓ openConfirmation(String)  [confirmation dialog]
  ├── ↓ ↓ ↓ render()  [GUI rendering]
  ├── ↓ ↓ ↓ mouseClicked()  [mouse handling]
  ├── ↓ ↓ ↓ keyPressed()  [key handling]
  └─→ ↓ ↓ BenchmarkResultsScreen  [results display]
       ├── ↓ ↓ ↓ SysSpec display  [system specs]
       ├── ↓ ↓ ↓ compare sessions  [report comparison]
       └─→ ↓ ↓ ReportsScreen  [session history]
            └─→ ↓ SettingsScreen  [configuration]

FlatButton (com.fpstest.client.gui.FlatButton) - FUNCTIONAL
  ├── text: String  [button label]
  ├── x, y, width, height: int  [position/size]
  ├── ↓ isHovered(mouseX, mouseY): boolean  [hover detection]
  ├── ↓ onClick(): void  [click handling]
  └─→ ↓ render(): void  [button rendering]

ReportComparator (com.fpstest.client.gui.ReportComparator) - STUB
  ├── ↓ SortBy enum  [FPS_AVERAGE, FPS_MIN, FPS_MAX, DURATION]
  ├── ↓ compareFPSAverage(double, double): int  [FPS comparison]
  ├── ↓ compareMinFPS(long, long): int  [min FPS comparison]
  ├── ↓ compareMaxFPS(long, long): int  [max FPS comparison]
  └─→ ↓ compareDuration(long, long): int  [duration comparison]

I18n (com.fpstest.client.gui.I18n) - NOT PORTED
  ├── language key management
  └─→ ↓ localization of all UI strings

LangAssets (com.fpstest.client.gui.LangAssets) - NOT PORTED
  ├── language asset loading
  └─→ ↓ localization support

HubState (com.fpstest.client.gui.HubState) - NOT PORTED
  ├── HUD state management
```

### Configuration Dependency

```
FpsTestConfig (com.fpstest.client.config.FpsTestConfig) - NOT PORTED
  ├── HudAnchor positions  [HUD position configuration]
  ├── graphics settings  [render distance, particles, etc.]
  ├── ↓ save/load persistence  [config file I/O]
  ├── ↓ ↓ getHudAnchor(): HudAnchor  [HUD position]
  ├── ↓ ↓ getRenderDistance(): int  [render distance]
  ├── ↓ ↓ getParticles(): boolean  [particles on/off]
  ├── ↓ ↓ getClouds(): boolean  [clouds on/off]
  └─→ ↓ ↓ [other graphics settings]
```

### Mixin Dependency (CRITICAL)

All 11 mixins depend on:
- Target Minecraft method identification in 1.21.11 mappings
- @Inject/@Redirect/@ModifyArg annotation mappings
- Mixin compatibility level JAVA_21 (already configured ✅)
- Refmap regeneration for new mappings
- Fields/accessors from original JAR bytecode analysis

### Resource Dependency

```
Language Locales (8 total, 1 ported ✅, 7 missing 🔴)
  ├── assets/fpstest/lang/en_us.json  ✅ created
  ├── assets/fpstest/lang/de_de.json  🔴 missing
  ├── assets/fpstest/lang/es_es.json  🔴 missing
  ├── assets/fpstest/lang/fr_fr.json  🔴 missing
  ├── assets/fpstest/lang/ja_jp.json  🔴 missing
  ├── assets/fpstest/lang/ru_ru.json  🔴 missing
  ├── assets/fpstest/lang/uk_ua.json  🔴 missing
  └─→ ↓ ↓ assets/fpstest/lang/zh_cn.json  🔴 missing

Mod Assets:
  ├── assets/fpstest/icon.png  ✅ created/referenced
  └─→ ↓ other asset files  🔴 verification needed
```

### Event Registration Dependency

```
FpsTestClient.onInitializeClient()
  ├── ↓ benchmarkRegistry.bootstrap()  [BenchmarkRegistry]
  ├── ↓ ClientTickEvents.START_CLIENT_TICK.register  [ClientTickEvents - v1]
  ├── ↓ ClientTickEvents.END_CLIENT_TICK.register  [ClientTickEvents - v1]
  ├── ↓ HudRenderCallback.EVENT.register  [HudRenderCallback - v1]
  ├── ↓ pollAbortKey(screen)  [key handling - uses class_310]
  └─→ ↓ runs during Minecraft client initialization
```

## Port Status Mapping

| Dependency | Original | Ported | Status | Blocking? |
|------------|----------|--------|--------|-----------|
| FpsTestClient entrypoint | 1 class | 1 class (STUB) | ⚠️ Stubs only | Yes (event registrations missing) |
| Mixin implementations | 11 classes | 0 classes | 🔴 None | **YES - primary blocker** |
| Metric trackers (Fps/Tick/Memory) | 3 classes | 3 classes (STUB) | ⚠️ Stubs only | Yes (not connected to events) |
| Benchmark Registry | 1 class | 1 class (STUB) | ⚠️ Stubs only | Yes (no benchmark management) |
| Benchmark tests | 17+ classes | 0 classes | 🔴 None | **YES - mod has no purpose** |
| PerfHud / HUD | 2 classes | 0 classes | 🔴 None | **YES - primary user feature** |
| Configuration (FpsTestConfig) | 2 classes | 0 classes | 🔴 None | Yes (no user settings) |
| GUI system | 13 classes | 3 classes (STUB/FUNC) | ⚠️ Partial | Yes (no full UI) |
| Language locales | 8 locales | 1 locale | ⚠️ 1 of 8 | Yes (localization incomplete) |
| Cinematic/camera | 7 classes | 0 classes | 🔴 None | Yes (feature missing) |
| Entry points | 1 configuration | 1 configuration | ✅ Complete | No |
| Access widener | 1 configuration | 1 configuration | ✅ Correct format | No |
| Mod metadata | 5 elements | 5 elements | ✅ Complete | No |

**Blocking dependencies (must be fixed first):**
1. Mixins (0/11) - PRIMARY blocker
2. Benchmark tests (0/17+) - MOD PURPOSE blocker
3. PerfHud (0/2) - PRIMARY user feature blocker
4. FpsTestConfig (0/2) - User configurability blocker

**Non-blocking (can wait):**
- Language locales (7/8 missing) - can add later
- Cinematic/camera system (0/7) - differentiator feature, can add later
- Full GUI beyond FlatButton (3/13 implemented) - can add later
- ReportComparator enhancements - can add later

---

## F. CLASS RELATIONSHIP VERIFICATION

### Verified Relationships (from original JAR bytecode):

1. **FpsTestClient → BenchmarkRegistry**: 
   - FpsTestClient.onInitializeClient() calls benchmarkRegistry.bootstrap()
   - Verified in bytecode: `invokestatic #50 // Method com/fpstest/client/bench/BenchmarkRegistry.bootstrap:()V`

2. **FpsTestClient → FpsTracker, TickTracker, MemoryTracker**:
   - FpsTestClient.onInitializeClient() creates new instances
   - Verified: `new #43`, `new #44`, `new #45` (FpsTracker, TickTracker, MemoryTracker class references)

3. **FpsTestClient → CinematicRunner, PerfHud**:
   - FpsTestClient.onInitializeClient() creates instances
   - Verified: `new #46`, `new #47` (CinematicRunner, PerfHud class references)

4. **BenchmarkRegistry → Benchmark map**:
   - Holds map of registered benchmarks
   - Provides all(): Map<String, Benchmark>

5. **Benchmark → BenchmarkResult**:
   - Benchmark.run() produces BenchmarkResult
   - Verified through result construction in bytecode

6. **FpsTracker → onFrame()**:
   - Called per render frame for FPS calculation
   - Verified through bytecode: `invokevirtual #199 // Method com/fpstest/client/metrics/FpsTracker.onFrame:()V`

7. **TickTracker → onTickStart/onTickEnd**:
   - Called per client tick
   - Verified through bytecode

8. **MemoryTracker → sample()**:
   - Called to record memory usage
   - Verified through bytecode

9. **RingBuffer → add/getAverage/getLatest**:
   - Circular buffer operations
   - Verified through bytecode match ✅

10. **FlatButton UI operations**:
    - Constructor, isHovered, onClick, render
    - Verified through bytecode match ✅

### Relationships NOT Yet Verified (classes not ported):

All relationships involving classes not yet in the source tree cannot be verified until those classes are created and compared. The dependency graph will be updated as classes are ported.

---

## G. MIGRATION TIMELINE ESTIMATE

| Phase | Focus | Classes | Estimated Time | Blocking? |
|-------|-------|---------|----------------|-----------|
| 1 | Mixin implementations | 11 classes | 2 weeks | **YES** |
| 2 | PerfHud + FpsTestClient connection | 3 classes | 2 weeks | **YES** |
| 3 | 5 benchmark test implementations | 5 classes | 2 weeks | **YES** (mod purpose) |
| 4 | FpsTestConfig + GUI expansion | 4 classes | 2 weeks | Yes |
| 5 | Full localization | 7 language files | 1 week | No |
| 5 | Remaining benchmark tests | 12+ classes | 3 weeks | Yes |
| 6 | Cinematic/camera system | 7 classes | 2 weeks | No |
| 7 | World/arena setup | 3 classes | 1 week | No |
| 8 | Final verification and polish | - | 1 week | Yes |

**Total estimated: ~16-20 weeks part-time**

---

## H. VERIFICATION CHECKLIST

For each subsystem implemented, verify:

- [ ] `./gradlew build` passes successfully
- [ ] All original class fields have equivalents in ported class
- [ ] All original methods have equivalents with matching signatures
- [ ] Behavioral control flow matches original decompilation
- [ ] Minecraft/Fabric API calls adapted correctly for 1.21.11
- [ ] No known behavior from original was omitted
- [ ] Class demonstrates functional operation in Minecraft 1.21.11
- [ ] Mixin configurations (if applicable) updated for new mappings
- [ ] Language locales updated if subsystem affects UI text

**Final port judgment criteria:**
1. `./gradlew build` passes
2. Behavioral comparison confirms no known omission from original
3. Subsystem operates correctly in Minecraft 1.21.11
4. Overall parity assessed against original JAR inventory

---
**DEPENDENCY GRAPH DOCUMENT END**

**No implementation changes made during this audit. Graph based on original JAR bytecode analysis and current source inventory.**