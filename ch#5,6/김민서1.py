#백준 1699
N = int(input())

d = [0]*(N+1)
power = [i**2 for i in range(1, 317)]
for i in range(1, N+1):
    comb = []
    for pow in power:
        if pow>i: break
        comb.append(d[i-pow])
    d[i] = min(comb) + 1

print(d[N])
