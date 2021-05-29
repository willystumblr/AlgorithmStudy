#백준 2805

import sys
input = sys.stdin.readline

N, M = map(int, input().split())
trees = list(map(int, input().split()))

start = 0
end = max(trees)

H = 0

while(start <= end):
    total = 0
    mid = (start + end)//2

    for tree in trees:
        if tree> mid:
            total+= tree-mid
    if total < M:
        end = mid - 1
    else:
        H = mid
        start = mid + 1

print(H)
