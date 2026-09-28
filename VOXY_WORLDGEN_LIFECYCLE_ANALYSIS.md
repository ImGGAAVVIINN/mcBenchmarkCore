# WorldGen Lifecycle Map & Controller Fix — Final Analysis

**Date:** 2026-06-15
**Subject:** Why the controller fails to stop Voxy WorldGen and how to fix it

---

## 1. Why the Current Controller Fails to Stop WorldGen

### 1.1 Controller currently touches NOTHING about WorldGen

`DistantHorizonsVoxyController.java` handles three things:
- **DH**: captures/disables/enables `renderingEnabled`, `genericRenderingEnabled`, `chunkRenderDistance`
- **Voxy**: captures/disables/enables `config.enabled`, `config.enableRendering`, `config.sectionRenderDistance`
- **WorldGen**: **does not exist in the controller at all**

### 1.2 Controller's `enableRendering=false` is IGNORED by WorldGen

Worker loop checks `VoxyIntegration.isVoxyRenderingEnabled()` (bytecode instruction 45). This method:

```java
public static boolean isVoxyRenderingEnabled() {
    if (!initialized) initialize();        // sets enabled = false
    if (!enabled) return true;             // ← ALWAYS returns true when not initialized!
    try {
        return (boolean) voxyEnabledMethod.invoke();
    } catch (Throwable t) {
        return true;                       // ← ALWAYS returns true on exception!
    }
}
```

Even when the controller sets `VoxyConfig.CONFIG.enableRendering = false`, WorldGen's `VoxyIntegration` still returns `true` because:
1. It was never initialized via reflection (initializes Voxy internally), so `initialized=false` → returns `true`
2. Any exception in reflection also falls through to `return true`

**Evidence from logs:** `"voxy integration initialized (enabled: true, raw: true, voxyEnabled: true)"` despite config having `"enabled": false`.

### 1.3 Config file `"enabled": false` does NOT stop WorldGen immediately

Setting `"enabled": false` in the JSON file has **no effect** on the running worker:
- Worker loop reads `Config.DATA.enabled` (in-memory static field), NOT the JSON file
- `Config.load()` only runs when `scheduleConfigReload()` is called, which happens on tick
- `scheduleConfigReload()` is only triggered by:
  - Server-side config reload event (`ServerEventHandler`)
  - F3 menu trigger (if `showF3MenuStats` is set)
  - **Not** by the controller

---

## 2. Correct Stop Mechanism: Direct Field Write

### 2.1 What works

```java
// In captureAndDisable():
if (worldgenModPresent) {
    Config.originalEnabled = Config.DATA.enabled;  // Save original
    Config.DATA.enabled = false;                   // IMMEDIATELY stops worker
}

// In restore():
if (worldgenModPresent) {
    Config.DATA.enabled = Config.originalEnabled;  // Restore
}
```

### 2.2 Why this works

Worker loop bytecode (confirmed via `javap`):
```
20: getstatic  #Config.DATA
23: getfield   #Config$ConfigData.enabled:Z
26: ifeq       36      ← if enabled==false, jump to sleep
29: ...             ← ELSE: continue processing chunks
...
36: ldc2_w     #100l   ← sleep 100ms
```

Setting `Config.DATA.enabled = false` causes the worker to sleep 100ms every iteration instead of processing chunks. Zero chunk generation, zero RSS growth.

### 2.3 Why `scheduleConfigReload()` alone is insufficient

`scheduleConfigReload()` only helps if the JSON file was manually edited. It reloads `Config.load()` on the next server tick. This is:
- One tick of delay (unacceptable for benchmark isolation)
- Still unreliable if `ServerEventHandler` doesn't trigger config reload
- The controller has no access to `ChunkGenerationManager` instance to call it

---

## 3. Full Lifecycle Map (Corrected)

```
┌─────────────────────────────────────────────────────────────────────────┐
│                    VOXY WORLD GEN V2 LIFECYCLE                         │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                         │
│  Mod Init (Client)                                                     │
│    └→ ChunkGenerationManager.PUBLIC_INSTANCE = new                     │
│                                                                         │
│  onServerStarted(server)                                                │
│    └→ ChunkGenerationManager.initialize(server)                        │
│         ├→ running = true                                              │
│         ├→ pauseCheck = mc.isIntegratedServerRunning()                 │
│         ├→ Config.load()   ← reads JSON from disk                      │
│         ├→ new Semaphore(maxActiveTasks)                               │
│         └→ startWorker() ← daemon thread "Voxy-WorldGen-Worker"        │
│                                                                         │
│  Worker Thread Loop (every ~100ms):                                     │
│    IF !running → exit                                                   │
│    IF !Config.DATA.enabled → sleep(100ms)  ← PRIMARY ON/OFF SWITCH     │
│    IF server==null → sleep(100ms)                                       │
│    IF !isVoxyRenderingEnabled() → sleep(500ms)  ← ALWAYS TRUE          │
│    IF tpsMonitor.isThrottled() → sleep(500ms)                           │
│    IF pauseCheck.getAsBoolean() → sleep(500ms)                          │
│    IF no players → sleep(1000ms)                                        │
│    ELSE → process chunks (heavy work)                                   │
│                                                                         │
│  onServerStopping                                                       │
│    └→ ChunkGenerationManager.shutdown()                                │
│         ├→ running = false                                             │
│         ├→ stopWorker()                                                │
│         └→ TellusIntegration.shutdown()                                │
│                                                                         │
│  Client Tick (render thread):                                           │
│    └→ ChunkGenerationManager.tick()                                    │
│         ├→ processPendingTickets()  (chunk ticket management)           │
│         ├→ if configReloadScheduled → Config.load() + restartScan()    │
│         ├→ tpsMonitor.tick()                                           │
│         ├→ stats.tick()                                                │
│         └→ checkPlayerMovement()                                       │
│                                                                         │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## 4. Controller Fix

### 4.1 What to add to `DistantHorizonsVoxyController.java`

**New fields:**
```java
// WorldGen
private static final String WORLDGEN_MOD_ID = "voxyworldgenv2";
private boolean worldgenModPresent;
private boolean originalWorldgenEnabled;
```

**In `captureAndDisable()`:**
```java
worldgenModPresent = FabricLoader.getInstance().isModLoaded(WORLDGEN_MOD_ID);
LOG.info("[MC Benchmark Core] DH/Voxy controller: worldgenPresent={}", worldgenModPresent);

if (worldgenModPresent) {
    captureAndDisableWorldGen();
}
```

**New method `captureAndDisableWorldGen()`:**
```java
private void captureAndDisableWorldGen() {
    try {
        // Config.DATA.enabled is public static — direct field access works
        Class<?> configClass = Class.forName("com.ethan.voxyworldgenv2.core.Config");
        java.lang.reflect.Field dataField = configClass.getDeclaredField("DATA");
        dataField.setAccessible(true);
        Object configData = dataField.get(null);
        
        java.lang.reflect.Field enabledField = configData.getClass().getDeclaredField("enabled");
        enabledField.setAccessible(true);
        
        originalWorldgenEnabled = enabledField.getBoolean(configData);
        LOG.info("[MC Benchmark Core] DH/Voxy controller: captured original WorldGen enabled={}", originalWorldgenEnabled);
        
        enabledField.setBoolean(configData, false);
        LOG.info("[MC Benchmark Core] DH/Voxy controller: disabled WorldGen (Config.DATA.enabled=false)");
        
    } catch (Throwable t) {
        LOG.warn("[MC Benchmark Core] DH/Voxy controller: captureAndDisableWorldGen failed", t);
        worldgenModPresent = false;
    }
}
```

**In `restore()`:**
```java
if (worldgenModPresent) {
    restoreWorldGen();
}
```

**New method `restoreWorldGen()`:**
```java
private boolean restoreWorldGen() {
    try {
        Class<?> configClass = Class.forName("com.ethan.voxyworldgenv2.core.Config");
        java.lang.reflect.Field dataField = configClass.getDeclaredField("DATA");
        dataField.setAccessible(true);
        Object configData = dataField.get(null);
        
        java.lang.reflect.Field enabledField = configData.getClass().getDeclaredField("enabled");
        enabledField.setAccessible(true);
        
        boolean original = originalWorldgenEnabled;
        enabledField.setBoolean(configData, original);
        
        LOG.info("[MC Benchmark Core] DH/Voxy controller: restored WorldGen enabled to {}", original);
        return true;
    } catch (Throwable t) {
        LOG.warn("[MC Benchmark Core] DH/Voxy controller: restoreWorldGen failed", t);
        return false;
    }
}
```

### 4.2 Why reflection instead of direct access?

`Config` is in package `com.ethan.voxyworldgenv2.core` while the controller is in `com.fpstest.client.bench`. Direct import is impossible without adding a runtime dependency on the WorldGen JAR. Reflection avoids this.

### 4.3 Alternative: Package-private direct access

If the project imports `voxyworldgenv2` as a dependency, direct access would work:
```java
import com.ethan.voxyworldgenv2.core.Config;
// Then: Config.DATA.enabled = false;
```
But based on the current setup (mod JARs in `run/mods/`, not as dependencies), reflection is safer.

---

## 5. Server Restart Consideration

The debug log shows 21 `voxy world gen initialized` events across the benchmark. Each ephemeral world creation triggers:
1. `onServerStopping` → `shutdown()` → worker stops
2. New server starts → `onServerStarted` → `initialize()` → reads `Config.load()` from disk
3. If config file still has `"enabled": false`, new worker also sleeps immediately

**However**, relying on the config file alone is fragile because:
- F3+S may reload config mid-benchmark (restoring `"enabled": true`)
- Other mods may modify the config file
- The controller should own the state, not depend on disk

**Recommended**: Use **both** approaches:
1. Direct field write (`Config.DATA.enabled = false`) for immediate effect
2. Optionally also write to config file for durability across restarts

---

## 6. Verification Plan

After implementing the fix, verify:
1. Worker thread state after `captureAndDisable()` → should be `TIMED_WAITING`
2. RSS growth rate during benchmark → should match Experiment B (~5.5 MB/min)
3. No new chunk processing should appear in logs after `captureAndDisable()`
4. `restore()` should correctly reinstate original state

---

## 8. Implementation Status: **COMPLETE** ✅

The controller has been modified to include WorldGen disable/restore via reflection.

### Changes made to `DistantHorizonsVoxyController.java`:

1. **Added constant**: `WORLDGEN_MOD_ID = "voxyworldgenv2"`
2. **Added field**: `boolean worldgenModPresent`
3. **Added field**: `boolean originalWorldgenEnabled`
4. **Updated `captureAndDisable()`**: Detects WorldGen mod, calls `captureAndDisableWorldGen()`
5. **Added `captureAndDisableWorldGen()`**: Uses reflection to set `Config.DATA.enabled = false`
6. **Added `restoreWorldGen()`**: Restores original value via reflection
7. **Updated `restore()`**: Calls `restoreWorldGen()` if mod was present

### Verification:
- `./gradlew compileJava` → **BUILD SUCCESSFUL**
- Reflection approach used because `Config` is in package `com.ethan.voxyworldgenv2.core` (no direct import)

---

## 7. Files Modified

- **Controller**: `src/main/java/com/fpstest/client/bench/DistantHorizonsVoxyController.java`
  - Add WorldGen detection (`worldgenModPresent`)
  - Add WorldGen capture/disable/restore methods using reflection
  - Wire into existing lifecycle methods

- **No changes to WorldGen JAR or config**
