"""Validate the category-aggregation fix against recorded machines.

Produces a before/after comparison of the master scores versus the user's
3DMark Time Spy reference points.

- High-end machines are scored end-to-end from their report.json via the
  authoritative Python port (``ingame_score.calc``).
- The low-end machine only has its per-workload/per-test points preserved in
  ``/tmp/rx6400_log_scores.json`` (the RX 6400 report.json was never copied to
  this machine), so its category scores are recomputed directly from those
  recorded workload points.

Run:  python3 fpstest-reference/validate_calibration.py
"""
import json
import math
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import ingame_score as s

LIN = ("/home/ascend/.var/app/io.github.elyprismlauncher.ElyPrismLauncher/data/"
       "ElyPrismLauncher/instances/Fabulously Optimized/minecraft/fpstest-reports/"
       "2026-10-08T22-47-02.517927938/report.json")
WIN = ("/media/ascend/windows/Users/Ascend/AppData/Roaming/ElyPrismLauncher/"
       "instances/MC Benchmark - Copy/minecraft/fpstest-reports/"
       "2026-10-08T22-00-15.879720700/report.json")
RX = "/tmp/rx6400_log_scores.json"

CATS = {"GPU": ["GPU_RASTER", "GPU_SHADER", "GPU_PBR", "GPU_EFFECTS"],
        "CPU": ["CPU_SINGLE_THREAD", "CPU_SIMULATION", "CPU_WORLD", "CPU_PARALLEL"],
        "RAM": ["RAM_BANDWIDTH", "RAM_LATENCY", "RAM_ALLOCATION", "RAM_JVM_GC"]}


def old_cat(cat, wl):
    wsum = rsum = 0.0
    for w in CATS[cat]:
        v = wl.get(w)
        if v and not math.isnan(v) and v > 0:
            wsum += s.WEIGHTS[w][0]; rsum += s.WEIGHTS[w][0] / v
    return float("nan") if wsum == 0 or rsum == 0 else wsum / rsum


def new_cat(cat, wl):
    return s.cat_score(cat, wl)


def overall(g, c, r):
    if any(math.isnan(x) or x <= 0 for x in (g, c, r)):
        return float("nan")
    ws = sum(s.OW.values())
    return ws / (s.OW['GPU'] / g + s.OW['CPU'] / c + s.OW['RAM'] / r)


def low_end():
    rx = json.load(open(RX))
    wl = {w: (len(v) / sum(1.0 / t[1] for t in v) if v else float("nan")) for w, v in rx.items()}
    old = {k: old_cat(k, wl) for k in CATS}
    new = {k: new_cat(k, wl) for k in CATS}
    return old, new


def row(name, olds, news, ts):
    def f(d):
        return (overall(d['GPU'], d['CPU'], d['RAM']), d['GPU'], d['CPU'], d['RAM'])
    o = f(olds); n = f(news)
    print(f"\n== {name}   (Time Spy {ts})")
    print(f"   {'':8} {'Overall':>10} {'GPU':>10} {'CPU':>10} {'RAM':>10}")
    print(f"   {'BEFORE':8} {o[0]:10.0f} {o[1]:10.0f} {o[2]:10.0f} {o[3]:10.0f}")
    print(f"   {'AFTER':8} {n[0]:10.0f} {n[1]:10.0f} {n[2]:10.0f} {n[3]:10.0f}")


if __name__ == "__main__":
    lo_old, lo_new = low_end()
    row("RX 6400 / i7-4790 (low-end)", lo_old, lo_new, "OV 3472 / GFX 3407 / CPU 3894")
    for name, path, ts in (("RTX 4070S / Ryzen 7 7700 (Linux high-end)", LIN, "OV 19848 / GFX 20992 / CPU ~13900"),
                           ("RTX 4070S / Ryzen 7 7700 (Windows high-end)", WIN, "OV 19848 / GFX 20992 / CPU ~13900")):
        if not os.path.exists(path):
            print(f"\n== {name}: report missing, skipped")
            continue
        ov, g, c, r, wl = s.calc(path)
        olds = {k: old_cat(k, wl) for k in CATS}
        news = {k: new_cat(k, wl) for k in CATS}
        row(name, olds, dict(GPU=g, CPU=c, RAM=r), ts)
