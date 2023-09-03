n = int(input())
arr = list(map(int,input().split(" ")))
unq = sorted(list(set(arr)))
m1, m2 =unq[-1],unq[-2]
m1 = arr.count(m1)
m2 = arr.count(m2)
ans =(m1-1) + (m2-1)
print(ans)