# Master-Score Calibration Fix — Category Aggregation

## TL;DR

The master report collapsed a low-end GPU to near its *weakest single
workload* because each category was aggregated with a **weighted harmonic
mean**, which is a "weakest-link" mean. When one GPU workload is many times
slower than the others (RX 6400: shader `504` pts, PBR `369` pts vs raster
`17511`), the harmonic mean drove the whole GPU category down to `853`.

The fix replaces the **category** aggregation with a **weighted geometric
mean** — the correct mean for combining independent, multiplicative
performance dimensions — while keeping the harmonic mean where it is
physically correct (within a workload, and for the overall weakest-link
combination). It is **parameter-free**: no fitted exponent, no per-machine
constant, no hardware detection, no reference change.

Effect on the reported low-end machine: **GPU 853 → 2564**, **Overall 1154 →
3170** (Time Spy: Graphics 3407, Overall 3472). High-end is preserved
(GPU 20605 → 20784, −0.9%).

## The defect, in numbers

Recorded RX 6400 / i7-4790 run, per-workload points (10000 = reference):

| workload | points | weight in its category |
|---|---:|---:|
| GPU_RASTER   | 17511 | 0.35 |
| GPU_SHADER   |   504 | 0.30 |
| GPU_PBR      |   369 | 0.20 |
| GPU_EFFECTS  |  9954 | 0.15 |
| CPU_SINGLE   |  5204 | 0.30 |
| CPU_SIM      |  8608 | 0.35 |

Weighted harmonic mean of the GPU workloads:

```
1 / (0.35/17511 + 0.30/504 + 0.20/369 + 0.15/9954) = 853
```

i.e. the category is pinned to roughly the two shader workloads. 3DMark Time
Spy reports this machine at Graphics **3407** — **4.0× higher**. Nothing was
mathematically wrong with the computation; the *choice of mean* was wrong for
heterogeneous workloads.

## Root cause

1. **Harmonic mean as a category aggregate.** The harmonic mean equals the
   total-time-over-total-work rate when workloads *add together in time*. GPU
   raster, shader and PBR rendering are separate scenes probing different
   bottlenecks (CPU/draw-call bound vs fragment/VRAM bound), not repeated
   samples of one quantity. For independent multiplicative dimensions the
   correct aggregate is the **geometric** mean: uniformly `k`-times-faster
   hardware must score exactly `k` times higher, and no single workload can
   floor the category.
2. **Workload heterogeneity (a real limitation, not a bug).** The GPU
   workloads do not scale proportionally across tiers:
   - `GPU_RASTER` is largely CPU/draw-call bound in Minecraft on this hardware
     (RX 6400 `17511` vs 4070S `19882`, ratio `0.88`) and barely discriminates
     GPUs.
   - `GPU_SHADER`/`GPU_PBR` run full deferred shader packs and are VRAM/bandwidth
     bound on the 4 GB, PCIe-3.0-x4 RX 6400 (`504`/`369` vs `23640`/`22437`,
     ratio `0.02`) — a much larger relative penalty than Time Spy's largely
     VRAM-light scenes (`0.16`).

   No monotone mean can perfectly reconcile probes that disagree by ~50×; the
   geometric mean is the principled best effort and leaves a documented
   residual (below).

## The fix

`BenchmarkScoreCalculator.categoryScore(...)` now returns the
**weight-renormalized geometric mean** of a category's present workload
scores:

```java
weightedLogSum += w.weight * Math.log(score);
...
return Math.exp(weightedLogSum / weightSum);
```

Unchanged by design:

- **Within a workload**: harmonic mean of its tests' points (the correct
  throughput average of repeated samples of one quantity).
- **Overall**: weighted harmonic mean of GPU/CPU/RAM, preserving the 3DMark
  weakest-link semantics (a weak category still limits the overall).
- **References, `SCALE`, weights, workload classification**: untouched.

No fitted constants were introduced; the change is a pure change of the
aggregation mean.

## Results (recorded machines; NOT fresh runs)

| machine | | Overall | GPU | CPU | RAM |
|---|---|---:|---:|---:|---:|
| RX 6400 / i7-4790 | before | 1154 | **853** | 6612 | 6605 |
| (Time Spy 3472 / GFX 3407 / CPU 3894) | after | 3170 | **2564** | 6824 | 7625 |
| RTX 4070S / 7700 (Linux) | before | 17847 | 20605 | 15571 | 10850 |
| (Time Spy ~19848 / GFX 20992 / CPU ~13900) | after | 18216 | **20784** | 15637 | 11867 |
| RTX 4070S / 7700 (Windows) | before | 17658 | 21284 | 14274 | 10276 |
| | after | 17978 | **21290** | 14475 | 11202 |

Errors vs Time Spy after the fix:

| | high-end | low-end |
|---|---:|---:|
| Overall | −8.2% | −8.7% (was −66.8%) |
| GPU | −1.0% | −24.7% (was −75.0%) |
| CPU | +12.5% | +75.2% (was +69.8%) |

High-end GPU/CPU are preserved to within 1% (GPU +0.9%, CPU +0.4%); the RAM
category shifts +9% purely because its own aggregation changed.

## Residuals and limitations (unverified beyond the two machines)

- **GPU low-end residual (−25%).** Caused by workload heterogeneity described
  above; the shader workloads are a genuinely harsher probe than Time Spy's
  scenes on a VRAM-starved 4 GB card. Confirmed genuine (the pack-shader
  showcase runs with Distant Horizons/Voxy disabled; the collapse is real
  rendering cost, not DH/Voxy contention).
- **CPU over-prediction (+75% low-end).** This is a **workload-design
  difference, not an aggregation defect** — aggregation is invariant here
  (CPU stays ~6.6–6.8k for every mean). The CPU score is effectively
  single-thread-weighted because `CPU_WORLD` (20%) and `CPU_PARALLEL` (15%)
  are excluded whenever the run has LOD active (`BenchmarkScoreCalculator`
  lines ~110–123), which is the normal full-benchmark configuration. A
  single-thread-heavy mix compresses cross-generation gaps relative to Time
  Spy's multicore-weighted CPU test. Masking this with a multiplier is
  explicitly out of scope; the correct remedy is a methodology change (a
  multicore-sensitive server-tick measurement that is not corrupted by LOD),
  which requires fresh runs to validate.
- **No intermediate-hardware data** exists; the model's behaviour between the
  two observed tiers is a smooth, monotone interpolation, but is **unverified**.
- **Fresh runs required.** All figures above are recomputed from *recorded*
  inputs on a deterministic scorer. Per the task rules they are **not** a
  substitute for fresh benchmark runs on both machines, which the user must
  execute with the deployed jar.

## Validation performed

- `fpstest-reference/test_scoring.py` — 10 tests, **PASS**: geometric scale
  invariance, no-cliff (geometric > 3× harmonic), missing-workload weight
  renormalization, NaN/empty/non-positive handling, synthetic low/mid/high
  ordering, historical-defect reproduction (853) and fix (2564), plus
  regression against the two recorded high-end reports.
- `src/test/java/.../ScoringAggregationSelfTest.java` — Java twin, **ALL
  PASSED**; agrees with Python to <1 point (20783.73 vs 20784; 2564.40 vs
  2564).
- `fpstest-reference/validate_calibration.py` — regenerates the before/after
  table above.

## Files changed

- `src/main/java/com/fpstest/client/bench/score/BenchmarkScoreCalculator.java`
  — `categoryScore` = weighted geometric mean; docs updated.
- `src/main/java/com/fpstest/client/bench/score/ScoreCategory.java` — doc.
- `fpstest-reference/ingame_score.py` — `cat_score` mirrors the change.
- `src/test/java/com/fpstest/client/bench/score/ScoringAggregationSelfTest.java`
  — new Java self-test.
- `fpstest-reference/test_scoring.py` — new Python test suite.
- `fpstest-reference/validate_calibration.py` — new validation harness.

## Deployed

- Jar `build/libs/mcbenchmarkcore-1.0.0.jar`, md5
  `aa644bce5d90e6648df33c16e57fe721` (previous: `c21cfea6…`), deployed to all
  five benchmark instances; each previous jar backed up as
  `mcbenchmarkcore-1.0.0.jar.bak-161015`.
- **Not committed to git.**
