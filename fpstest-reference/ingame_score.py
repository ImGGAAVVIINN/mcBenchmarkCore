import json, math
SCALE=10000.0
REFS={'GPU_RASTER':(161.918378,True),'GPU_SHADER':(36.714698,True),'GPU_PBR':(34.338078,True),'GPU_EFFECTS':(78.158965,True),
'CPU_SINGLE_THREAD':(821.652654,True),'CPU_SIMULATION':(390.357215,True),'CPU_WORLD':(605.9,False),'CPU_PARALLEL':(1.254,False),
'RAM_JVM_GC':(0.1631421761,False),'RAM_ALLOCATION':(5185.5083625793,False),'RAM_BANDWIDTH':(173.5560909651,True),'RAM_LATENCY':(34.6102440336,False)}
WEIGHTS={'GPU_RASTER':(0.35,'GPU'),'GPU_SHADER':(0.30,'GPU'),'GPU_PBR':(0.20,'GPU'),'GPU_EFFECTS':(0.15,'GPU'),
'CPU_SINGLE_THREAD':(0.30,'CPU'),'CPU_SIMULATION':(0.35,'CPU'),'CPU_WORLD':(0.20,'CPU'),'CPU_PARALLEL':(0.15,'CPU'),
'RAM_BANDWIDTH':(0.35,'RAM'),'RAM_LATENCY':(0.30,'RAM'),'RAM_ALLOCATION':(0.25,'RAM'),'RAM_JVM_GC':(0.10,'RAM')}
OW={'GPU':0.70,'CPU':0.20,'RAM':0.10}

def classify(p, e, se):
    wid=p['id']
    if wid=="base_fps_showcase" or wid=="static_dense_forest" or wid.startswith("chunk_"): return "GPU_RASTER"
    sh=se.get("shader_pack"); pb=se.get("resource_pack")
    if sh in ("lowEnd.zip","highEnd.zip"):
        return "GPU_PBR" if pb=="pbr.zip" else "GPU_SHADER"
    if wid in ("particle_cycle","particle_diversity_stress"): return "GPU_EFFECTS"
    if wid in ("redstone_clocks","redstone_dust_grid"): return "CPU_SINGLE_THREAD"
    if (wid.startswith("entity_") or wid=="villager_ai_village" or wid.startswith("falling_")
        or wid=="projectile_storm" or wid.startswith("tnt_field") or wid=="fluid_spread"
        or wid=="lighting_update" or wid=="hopper_grid" or wid=="comparator_storage" or wid=="piston_slime_array"):
        return "CPU_SIMULATION"
    return None

def measured(r, metric):
    if metric=="FPS":
        h=r['extras'].get('fps_harmonic_avg')
        if h is not None and math.isfinite(h) and h>0: return h
        return r['fps']['avg']
    if metric=="GC_TIME_MS": return r['gc_time_ms']
    if metric=="GC_MS_PER_MB":
        hd=(r['heap_peak']-r['heap_used_start'])/1048576.0
        return float('nan') if hd<=0 else r['gc_time_ms']/hd
    if metric=="HEAP_DELTA_MB": return (r['heap_peak']-r['heap_used_start'])/1048576.0
    if metric=="PRELOAD_MS":
        return float('nan') if r['extras'].get('preload_timed_out',0)>0 else r['extras'].get('preload_duration_ms',float('nan'))
    if metric=="TICK_TIME_MS": return r['tick_time_ms']['avg'] if r['tick_time_ms'] else float('nan')
    if metric=="ALLOC_RATE_MBPS": return (r['heap_peak']-r['heap_used_start'])/1048576.0/(r['duration_ms']/1000.0)
    if metric=="GC_PAUSE_MS": return float('nan') if r['gc_events']==0 else r['gc_time_ms']/r['gc_events']
    raise KeyError(metric)

METRIC={'GPU_RASTER':'FPS','GPU_SHADER':'FPS','GPU_PBR':'FPS','GPU_EFFECTS':'FPS','CPU_SINGLE_THREAD':'FPS','CPU_SIMULATION':'FPS','CPU_WORLD':'PRELOAD_MS','CPU_PARALLEL':'TICK_TIME_MS','RAM_JVM_GC':'GC_MS_PER_MB','RAM_ALLOCATION':'HEAP_DELTA_MB','RAM_BANDWIDTH':'ALLOC_RATE_MBPS','RAM_LATENCY':'GC_PAUSE_MS'}

def norm(meas, ref, hib):
    if meas is None or (isinstance(meas,float) and (math.isnan(meas) or math.isinf(meas))): return float('nan')
    if math.isnan(ref) or ref<=0: return float('nan')
    if hib:
        if meas<=0: return float('nan')
        return SCALE*(meas/ref)
    if meas<=0: return float('nan')
    return SCALE*(ref/meas)

def hmean(vals):
    s=0.0;c=0
    for v in vals:
        if not math.isnan(v) and not math.isinf(v) and v>0: s+=1.0/v; c+=1
    return float('nan') if c==0 else c/s

def cat_score(cat, workloads):
    wsum=0.0; rsum=0.0
    for w,(weight,c) in WEIGHTS.items():
        if c!=cat: continue
        score=workloads.get(w)
        if score is not None and not math.isnan(score) and score>0:
            wsum+=weight; rsum+=weight/score
    return float('nan') if wsum==0 or rsum==0 else wsum/rsum

def calc(path, gpu_scale=1.0):
    d=json.load(open(path)); rs=d['results']
    by={w:[] for w in WEIGHTS}
    lod_run=any(r['extras'].get('lod_chunk_loading',0.0)>0 for r in rs)
    for r in rs:
        if not (r['fps'] and r['fps'].get('samples',0)>0 and not math.isnan(r['fps']['avg']) and not math.isinf(r['fps']['avg'])): continue
        prim=classify(r, r['extras'], r['string_extras'])
        if prim: by[prim].append(r)
        if r['id'].startswith('chunk_'):
            if not (r['extras'].get('lod_chunk_loading',0.0)>0): by['CPU_WORLD'].append(r)
        if prim=='CPU_SIMULATION' and not lod_run: by['CPU_PARALLEL'].append(r)
        if r['id']!='pack_shader_showcase':
            for w in ('RAM_ALLOCATION','RAM_JVM_GC','RAM_BANDWIDTH','RAM_LATENCY'): by[w].append(r)
    wl={}
    for w in WEIGHTS:
        ref,hib=REFS[w]
        if w.startswith('GPU'): ref=ref*gpu_scale
        pts=[]
        for r in by[w]:
            meas=measured(r, METRIC[w])
            p=norm(meas, ref, hib)
            if not math.isnan(p): pts.append(p)
        wl[w]=hmean(pts)
    gpu=cat_score('GPU',wl); cpu=cat_score('CPU',wl); ram=cat_score('RAM',wl)
    if math.isnan(gpu) or math.isnan(cpu) or math.isnan(ram) or gpu<=0 or cpu<=0 or ram<=0:
        ov=float('nan')
    else:
        ws=OW['GPU']+OW['CPU']+OW['RAM']; ov=ws/(OW['GPU']/gpu+OW['CPU']/cpu+OW['RAM']/ram)
    return ov,gpu,cpu,ram,wl

if __name__=='__main__':
    import sys
    args=sys.argv[1:]
    if args:
        runs=[(p.rsplit('/',2)[-2], p, 1.0) for p in args]
    else:
        runs=[('WIN 09:33 G1GC','/media/ascend/windows/Users/Ascend/AppData/Roaming/ElyPrismLauncher/instances/MC Benchmark/minecraft/fpstest-reports/2026-10-07T09-33-51.262275300/report.json',1.0),
              ('WIN 10:15 ZGC','/media/ascend/windows/Users/Ascend/AppData/Roaming/ElyPrismLauncher/instances/MC Benchmark/minecraft/fpstest-reports/2026-10-07T10-15-14.737271500/report.json',1.0),
              ('WIN 14:55 ZGC','/media/ascend/windows/Users/Ascend/AppData/Roaming/ElyPrismLauncher/instances/MC Benchmark/minecraft/fpstest-reports/2026-10-07T14-55-04.199070500/report.json',1.0),
              ('WIN 16:52 ZGC','/media/ascend/windows/Users/Ascend/AppData/Roaming/ElyPrismLauncher/instances/MC Benchmark/minecraft/fpstest-reports/2026-10-07T16-52-29.457663100/report.json',1.0),
              ('LIN FO','/home/ascend/.var/app/io.github.elyprismlauncher.ElyPrismLauncher/data/ElyPrismLauncher/instances/Fabulously Optimized/minecraft/fpstest-reports/2026-10-06T23-14-52.699855571/report.json',1.0),
              ('LIN CL','/home/ascend/.var/app/io.github.elyprismlauncher.ElyPrismLauncher/data/ElyPrismLauncher/instances/1.21.11/minecraft/fpstest-reports/2026-10-07T06-58-01.887914114/report.json',1.397516)]
    for tag,p,gs in runs:
        ov,gpu,cpu,ram,wl=calc(p,gs)
        print(f'== {tag} (gpu_scale={gs})')
        print(f'  Overall={ov:.0f} GPU={gpu:.0f} CPU={cpu:.0f} RAM={ram:.0f}')