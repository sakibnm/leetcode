nums = [3,2,4]
target = 6
ret =[]
l = nums.__len__()
for i in range(0, l):
    for j in range(i+1, l):
        if (nums[i]+nums[j]) == target:
            ret.append(i)
            ret.append(j)
            break
print ret

