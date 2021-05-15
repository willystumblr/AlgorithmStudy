#백준 1475
room = input()
sixplusnine = 0
counts = []
for i in range(10):
    counts.append(room.count(str(i)))
    if i==6 or i==9:
        counts[i] = 0
        sixplusnine += room.count(str(i))

N = max(counts)
M = sixplusnine//2 if sixplusnine%2==0 else sixplusnine//2 +1

print(max(N, M))
    
