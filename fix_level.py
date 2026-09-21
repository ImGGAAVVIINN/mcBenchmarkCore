import sys

files = [
    'src/main/java/com/fpstest/client/bench/CinematicRunner.java',
    'src/main/java/com/fpstest/client/bench/BenchContext.java',
    'src/main/java/com/fpstest/client/hud/PerfHud.java',
    'src/main/java/com/fpstest/client/FpsTestClient.java',
]

total = 0
for f in files:
    with open(f, encoding='utf-8') as fh:
        content = fh.read()
    before = content.count('mc.level') + content.count('client.level')
    content = content.replace('mc.level', 'mc.world').replace('client.level', 'client.world')
    content = content.replace('EXPERIENCE_ORB_PICKUP', 'ENTITY_EXPERIENCE_ORB_PICKUP')
    with open(f, 'w', encoding='utf-8') as fh:
        fh.write(content)
    total += before
    print(f'{f}: replaced {before}')

print(f'TOTAL replaced: {total}')