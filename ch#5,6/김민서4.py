#백준 2512
import sys
input = sys.stdin.readline

N = int(input())
request = list(map(int, input().split()))
M = int(input())

start = 0
end = max(request)

while(start <= end):
    budg = 0
    mid = (start + end)//2
    for req in request:
        budg += min(mid, req)
    if budg <= M: 
        start = mid + 1
    else: 
        end = mid - 1

print(end)
