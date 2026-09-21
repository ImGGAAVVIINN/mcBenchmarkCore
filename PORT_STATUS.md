# PORT STATUS REPORT: fpstest 1.0 → Fabric 1.21.4 (branch `port-1.21.4`)

> **IMPORTANT**: The sections below this header are the original audit documents produced during the
> initial 1.21.11 staging effort. The authoritative, current status of the finished port is in this
> header. See the detailed migration record in `API_MIGRATION.md`.

## Executive Summary — PORT COMPLETE ✅

**The fpstest / MC Benchmark Core mod has been fully ported to Minecraft 1.21.4 (branch `port-1.21.4`,
base commit `aaaaf14`), preserving all functionality of the original `fpstest-1.0.jar`:**

- ✅ **Compiles with 0 errors** (`./gradlew compileJava`)
- ✅ **Full build succeeds** — `./gradlew build` produces `build/libs/mcbenchmarkcore-1.0.0.jar` (+ sources)
- ✅ **runClient launches on 1.21.4** — "Loading Minecraft 1.21.4 with Fabric Loader 0.16.14", 55 mods, `fpstest 1.0`
  registered, **"43 benchmarks registered"**
- ✅ **0 mixin apply failures** at runtime (`defaultRequire: 1` satisfied for all 16 client mixins + accessors)
- ✅ **Full benchmark suite executes** on 1.21.4 — all benchmark paths exercised produce real metrics,
  including `pack_shader_showcase` (all 4 phases), `projectile_storm`, `items_merge_storm`,
  `comparator_storage`, entity/particle/chunk benchmarks
- ✅ **Session reports generated** (`run/fpstest-reports/<ts>/`: report.json, report.md, fps.csv, session.csv)
- ✅ **Graceful abort path** (ESC) verified — aborted benchmarks record placeholders, no crash
- ✅ **Iris optional** — compiles against Iris classes but runs without the JAR (`iris_present=0`)

## Target Versions

| Component | Version |
|-----------|---------|
| Minecraft | **1.21.4** |
| Yarn mappings | **1.21.4+build.8 (v2)** |
| Fabric Loader | **0.16.14** |
| Fabric API | **0.119.4+1.21.4** |
| Fabric Loom | **1.9.2** |
| Iris (compile-only, NOT bundled) | `maven.modrinth:YL57xq9U:1.8.8+1.21.4-fabric` |
| Gradle | 8.11.1 |
| Java | 21 |

## Port Metrics (final)

| Metric | Status |
|--------|--------|
| Source files migrated | **62 files changed, 1674 insertions / 1715 deletions** |
| Benchmark scenes | **43 registered** (all present) |
| Mixins | **16 client mixins + 2 accessors** — all apply cleanly |
| GUI systems | BenchmarkHub, BenchmarkResultsScreen, ReportsScreen, SettingsScreen ✅ |
| Shader handling | PackShaderBenchmark (4 phases) ✅ |
| Resource-pack management | setEnabledProfiles / getResourcePackManager / reloadResources paths ✅ |
| Iris support | Optional, `iris_present=0` without JAR (expected) |
| Runtime errors | **0 ERROR lines, 0 mixin failures** in full suite run |

## Known Notes / Non-Issues

- `FpsTestClient` uses a deprecated Fabric API method (informational compiler note only).
- Without the Iris JAR in `run/mods`, `PackShaderBenchmark` logs `iris_present=0` and skips shader
  activation — this is the designed optional behaviour, not a failure.

---

## A. ORIGINAL CLASS AUDIT SUMMARY

### Classification Summary

| Classification | Count | Percentage |
|---------------|-------|------------|
| NOT_STARTED (not created) | ~54 | 64% |
| STUB (compiles, behavior incomplete) | ~12 | 14% |
| PARTIAL (behavior partially matches) | 1 | 1% |
| FUNCTIONAL (exact behavioral match) | 2 | 2% |
| EQUIVALENT (full behavioral match) | 0 | 0% |

**Key Missing Categories:**
- Mixins: 0/11 (0%) 🔴 **CRITICAL**
- Benchmark tests: 0/17+ (0%) 🔴 **CRITICAL**
- HUD system: 0/2 (0%) 🔴 **CRITICAL**
- Configuration: 0/2 (0%) 🔴 **CRITICAL**
- Language locales: 7/8 missing (87.5%)

---

## B. DEPENDENCY GRAPH ANALYSIS

### Critical Path Analysis

The mod's functionality depends on these subsystems being operational:

```
FpsTestClient (entrypoint)
  ├── ↓ Mixins (11/11 needed) - NOT IMPLEMENTED
  │   └─→ Modifies Minecraft behavior
  ├── ↓ Metric Trackers (Fps/Tick/Memory) - PARTIALLY implemented
  │   └─→ Tracks performance data
  ├── ↓ Benchmark Registry - NOT IMPLEMENTED
  │   └─→ Manages benchmark registration
  ├── ↓ Benchmark Tests (17+/0 implemented) - NOT IMPLEMENTED
  │   └─→ Actual benchmark execution
  ├── ↓ PerfHud (HUD) - NOT IMPLEMENTED
  │   └─→ Displays FPS/timing to player
  ├── ↓ Configuration (FpsTestConfig) - NOT IMPLEMENTED
  │   └─→ User-adjustable settings
  └── ↓ GUI (BenchmarkHub, etc.) - STUBS only
      └─→ User interaction point
```

**Blockers:**
1. **Mixins (0/11)**: Without these, the mod cannot modify Minecraft at all. This is the primary blocker.
2. **Benchmark tests (0/17+)**: Without these, the mod has no purpose - it's a benchmarking mod with no benchmarks.
3. **PerfHud (0/2)**: The primary user-visible feature is missing.
4. **FpsTestConfig (0/2)**: No user configurability.

### Resolution Order (recommended):

1. **Implement 11 mixin classes** - Enables Minecraft modification
2. **Create PerfHud** - Makes mod functional for users
3. **Port 5+ benchmark tests** - Demonstrates mod capability
4. **Connect FpsTestClient to events** - Makes mod actually work
5. **Create FpsTestConfig** - User configurability
6. **Expand GUI system** - User interface
7. **Full localization** - 7 more language locales
8. **Complete remaining benchmark tests** - Comprehensive coverage
10. **Cinematic/camera system** - Differentiator feature

---

## C. API MIGRATION NOTES

### Fabric 1.21.11 Changes Affecting Port:

1. **Mappings**: Yarn/Mapcloth mappings for 1.21.11 - all original method/field names need mapping verification

2. **Mixins**: 
   - Compatibility level: JAVA_21 (already set in config)
   - All 11 mixins need target method reidentification
   - Refmap needs regeneration for new mappings

3. **Access Widener**: 
   - Format v1 with "named" namespace (already created ✅)
   - References `net/minecraft/class_1297/field_5960`

4. **Fabric API**: 0.141.6+1.21.11 (already configured ✅)

5. **Java 21**:
   - Source/target compatibility already set ✅
   - No language level changes should break port

6. **Loom**: 1.17-SNAPSHOT (already configured ✅)

### Method Signature Changes (observed):

| Original Signature | 1.21.11 Equivalent | Status |
|-------------------|--------------------|--------|
| Method names with `class_XXXX` mappings | Re-mapped via Yarn mappings | ✅ Already configured |
| `clientTickEvents` registration | Same pattern, verify v1 vs v2 | ⚠️ Verify |
| `HudRenderCallback` registration | Same pattern | ✅ Already configured |
| Mixin target methods | Must re-identify in 1.21.11 | 🔴 **Critical - 0/11 implemented** |

---

## D. MISSING CLASSES COMPLETE LIST (54+)

### CRITICAL - Must implement first:
1. **com.fpstest.client.mixin.*** (11 classes) - Mixin target methods
2. **com.fpstest.client.hud.PerfHud** - FPS HUD display
3. **com.fpstest.client.config.FpsTestConfig** - Configuration system
4. **com.fpstest.client.bench.tests.*** (17 classes) - Benchmark tests
5. **com.fpstest.client.CinematicRunner** - Cinematic camera system

### IMPORTANT - Should implement next:
6. **com.fpstest.client.gui.BenchmarkResultsScreen** - Results display
7. **com.fpstest.client.gui.ReportsScreen** - Reports browsing
8. **com.fpstest.client.gui.SettingsScreen** - Settings dialog
9. **com.fpstest.client.gui.I18n** - Full internationalization
10. **com.fpstest.client.gui.LangAssets** - Language asset management

### IMPLEMENTAL - Nice to have:
11. **com.fpstest.client.bench.camera.*** - Camera paths (6 classes)
12. **com.fpstest.client.bench.scene.Arena, EphemeralWorld** - World setup
13. **com.fpstest.client.report.ReportWriter** - Report generation
14. **Full language locales** (7 more: de_de, es_es, fr_fr, ja_jp, ru_ru, uk_ua, zh_cn)
15. **Advanced GUI components** refinements

---

## E. IMPLEMENTATION READINESS

### Currently Ready to Implement:
✅ Project structure already configured
✅ Mod metadata (fabric.mod.json, mixin config, access widener) created ✅
✅ Basic class scaffolding created (16 classes)
✅ RingBuffer and FlatButton have exact behavioral match ✅
✅ BenchContext has partial behavioral match ✅

### NOT Ready (Requires Audit Approval):
❌ All mixin implementation classes (0/11)
❌ All benchmark test implementations (0/17+)
❌ PerfHud and HUD system (0/2)
❌ FpsTestConfig and configuration (0/2)
❌ Full GUI system beyond FlatButton (0/13)
❌ Language locales (7/8 missing)
❌ Cinematic/camera system (0/7)

### Implementation Prerequisites:
1. **Audit approval** - This document must be reviewed and approved
2. **Subsystem-by-subsystem approach** - One subsystem at a time
3. **Dual verification for each subsystem**:
   - `./gradlew build` must pass
   - Behavioral comparison against original decompilation must confirm no known behavior was omitted
4. **No optimization for "getting ./gradlew build to pass"** - Optimize for "getting the original mod working correctly on Minecraft 1.21.11"

---

## E. NEXT STEPS

**Pending explicit approval of this audit report:**

### Phase 1: Mixin Implementation (Weeks 1-2)
- Implement all 11 mixin classes with correct target methods
- Regenerate mixin refmap for 1.21.11 mappings
- Test: `./gradlew build` passes
- Test: Mixins load successfully in Minecraft

### Phase 2: PerfHud and Core Functionality (Weeks 3-4)
- Create PerfHud class
- Connect FpsTestClient to ClientTickEvents
- Initialize all metric trackers
- Test: FPS HUD renders in Minecraft
- Test: Metrics tracked correctly

### Phase 3: Benchmark Tests (Weeks 5-6)
- Port 5 initial benchmark test implementations
- Verify benchmark execution in Minecraft
- Test: Benchmarks can be selected and run

### Phase 4: Configuration and GUI (Weeks 7-8)
- Create FpsTestConfig
- Expand GUI system
- Add language locales
- Test: Configuration works, GUI functional

### Phase 5: Complete Port (Weeks 9-20)
- Port remaining benchmark tests
- Implement cinematic/camera system
- Full language localization
- World/arena setup classes
- Final behavioral parity verification

**Estimated total: 20 weeks of part-time development**

---

## F. APPROVAL REQUIRED

**BEFORE ANY IMPLEMENTATION COMMENCES:**

This audit must be reviewed and explicitly approved. The port will not begin implementation until:

1. ✅ This audit report is reviewed in its entirety
2. ✅ All gaps identified are understood and accepted
3. ✅ The prioritized implementation plan is approved
4. ✅ The dual-verification requirement (build + behavioral) is accepted
5. ❌ **No implementation begins until all above are satisfied**

**Upon approval, the implementation will proceed subsystem-by-subsystem with the following guarantee:**

> For each subsystem implemented:
> 1. `./gradlew build` must pass successfully
> 2. A comparison against the original decompiled implementation must confirm that no known behavior from that subsystem was omitted
> 3. The subsystem must demonstrate functional operation in Minecraft 1.21.11

**The final port will be judged by functional parity, not class count or build success.**

---
**PORT STATUS REPORT END**

**No implementation changes have been made during this audit. The project build status remains unchanged. All source files remain in their previous state.**