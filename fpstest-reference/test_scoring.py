"""Automated tests for the master-report scoring aggregation.

Run:  python3 fpstest-reference/test_scoring.py

These tests target the *model* change that fixes the low-end calibration
defect: a category's heterogeneous workloads are aggregated with a weighted
GEOMETRIC mean instead of a weighted harmonic mean, which removed the score
cliff that collapsed the low-end RX 6400 GPU score toward its weakest workload.

They are pure-function tests (no Minecraft, no GPU) plus a guarded regression
check against two recorded machines when their report files are present.
"""
import math
import os
import sys
import unittest

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import ingame_score as s

REPORT_HIGH_END_LIN = (
    "/home/ascend/.var/app/io.github.elyprismlauncher.ElyPrismLauncher/data/"
    "ElyPrismLauncher/instances/Fabulously Optimized/minecraft/fpstest-reports/"
    "2026-10-08T22-47-02.517927938/report.json"
)
REPORT_HIGH_END_WIN = (
    "/media/ascend/windows/Users/Ascend/AppData/Roaming/ElyPrismLauncher/"
    "instances/MC Benchmark - Copy/minecraft/fpstest-reports/"
    "2026-10-08T22-00-15.879720700/report.json"
)

GPU = ["GPU_RASTER", "GPU_SHADER", "GPU_PBR", "GPU_EFFECTS"]
CPU = ["CPU_SINGLE_THREAD", "CPU_SIMULATION", "CPU_WORLD", "CPU_PARALLEL"]
RAM = ["RAM_BANDWIDTH", "RAM_LATENCY", "RAM_ALLOCATION", "RAM_JVM_GC"]


def hmean(values):
    v = [x for x in values if x and x > 0]
    return float("nan") if not v else len(v) / sum(1.0 / x for x in v)


def weighted_geometric(scores, weights):
    wsum = sum(weights[w] for w in scores)
    lsum = sum(weights[w] * math.log(scores[w]) for w in scores)
    return math.exp(lsum / wsum)


class GeometricAggregationTests(unittest.TestCase):
    def test_scale_invariance(self):
        """Uniformly k-times-faster hardware scores exactly k times higher."""
        for k in (0.05, 0.5, 1.0, 3.7, 25.0):
            wl = {w: 10000.0 * k for w in GPU}
            got = s.cat_score("GPU", wl)
            self.assertAlmostEqual(got, 10000.0 * k, places=6)

    def test_within_min_max_and_above_harmonic(self):
        wl = {"GPU_RASTER": 20000.0, "GPU_SHADER": 500.0,
              "GPU_PBR": 370.0, "GPU_EFFECTS": 16000.0}
        geo = s.cat_score("GPU", wl)
        har = len(wl) / sum(1.0 / v for v in wl.values())  # unweighted, just a bound
        self.assertGreaterEqual(geo, min(wl.values()) - 1e-9)
        self.assertLessEqual(geo, max(wl.values()) + 1e-9)
        self.assertGreater(geo, har)

    def test_no_cliff_beats_harmonic(self):
        """A single weak workload must not collapse the category (the old defect)."""
        wl = {"GPU_RASTER": 20000.0, "GPU_SHADER": 500.0,
              "GPU_PBR": 370.0, "GPU_EFFECTS": 16000.0}
        wsum = sum(s.WEIGHTS[w][0] for w in wl)
        rsum = sum(s.WEIGHTS[w][0] / wl[w] for w in wl)
        old_harmonic = wsum / rsum
        new_geometric = s.cat_score("GPU", wl)
        self.assertAlmostEqual(new_geometric,
                               weighted_geometric(wl, {w: s.WEIGHTS[w][0] for w in wl}),
                               places=6)
        self.assertGreater(new_geometric, 3.0 * old_harmonic)

    def test_missing_workloads_renormalize_weights(self):
        wl = {"GPU_RASTER": 20000.0, "GPU_EFFECTS": 8000.0}
        expected = math.exp((0.35 * math.log(20000.0) + 0.15 * math.log(8000.0)) / 0.50)
        self.assertAlmostEqual(s.cat_score("GPU", wl), expected, places=6)

    def test_all_missing_is_nan(self):
        self.assertTrue(math.isnan(s.cat_score("GPU", {})))
        self.assertTrue(math.isnan(s.cat_score("GPU", {"GPU_RASTER": float("nan")})))

    def test_non_positive_scores_ignored(self):
        wl = {"GPU_RASTER": 0.0, "GPU_EFFECTS": -5.0}
        self.assertTrue(math.isnan(s.cat_score("GPU", wl)))


class SyntheticMachineTests(unittest.TestCase):
    """Synthetic low / intermediate / high machines: monotone, no cliff."""

    def _gpu(self, raster, shader, pbr, effects):
        return {"GPU_RASTER": raster, "GPU_SHADER": shader,
                "GPU_PBR": pbr, "GPU_EFFECTS": effects}

    def test_ordering_and_monotonicity(self):
        high = self._gpu(19882, 23640, 22437, 16088)
        mid = self._gpu(19000, 8000, 7500, 14000)
        low = self._gpu(17511, 504, 369, 9953)
        gh, gm, gl = (s.cat_score("GPU", m) for m in (high, mid, low))
        self.assertGreater(gh, gm)
        self.assertGreater(gm, gl)
        # The weakly-scaled low-end machine must still be reported well above
        # its weakest workload (no collapse toward ~370).
        self.assertGreater(gl, 2000.0)
        # Ordering preserved vs an arithmetic rescale.
        self.assertLess(gh / gl, 20.0)

    def test_low_end_no_longer_collapses(self):
        low = self._gpu(17511, 504, 369, 9953)
        wsum = sum(s.WEIGHTS[w][0] for w in low)
        rsum = sum(s.WEIGHTS[w][0] / low[w] for w in low)
        old = wsum / rsum
        new = s.cat_score("GPU", low)
        self.assertAlmostEqual(old, 853.0, delta=2.0)      # reproduced historical defect
        self.assertGreater(new, 2400.0)                     # fixed
        self.assertLess(new, 2700.0)


class RecordedMachineRegressionTests(unittest.TestCase):
    def _check(self, path, gpu, cpu, ram, overall):
        if not os.path.exists(path):
            self.skipTest("recorded report not present: " + path)
        ov, g, c, r, _ = s.calc(path)
        self.assertAlmostEqual(g, gpu, delta=1.0)
        self.assertAlmostEqual(c, cpu, delta=1.0)
        self.assertAlmostEqual(r, ram, delta=1.0)
        self.assertAlmostEqual(ov, overall, delta=1.0)

    def test_high_end_linux(self):
        self._check(REPORT_HIGH_END_LIN, 20784, 15637, 11867, 18216)

    def test_high_end_windows(self):
        self._check(REPORT_HIGH_END_WIN, 21290, 14475, 11202, 17978)


if __name__ == "__main__":
    unittest.main(verbosity=2)
