#데이터 입력
import sys
input = sys.stdin.readline

N = int(input())
solutions = list(map(int,input().split()))

#풀이 1
min = sys.maxsize
for i in range(N):
    start = i+1
    end = N-1

    while start<=end:
        mid = (start+end)//2
        sum = solutions[i] + solutions[mid]
        if abs(sum)<min:
            min = abs(sum)
            answer = [solutions[i],solutions[mid]]
        if min ==0: break
        if sum<0:
            start = mid+1
        else:
            end = mid-1
    if min==0:
        break

#풀이 2
left = 0
right = N-1
min = abs(solutions[left]+solutions[right])
answer = [solutions[left],solutions[right]]

while left<right:
    sum = solutions[left]+solutions[right]
    if abs(sum)<min:
        min = abs(sum)
        answer =[solutions[left],solutions[right]]
    if sum<0:
        left += 1
    else:
        right -= 1

#출력
print(answer[0],answer[1],sep=" ")
