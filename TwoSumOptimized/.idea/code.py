nums = [0,1,4,2,0]
target = 5

map = {}
l = nums.__len__()

for i in range(0, l):
    complement = target - nums[i]
    if nums[i] in map.keys() and nums[i] ==complement:
            #print "[%s,%s]" %(i,map[nums[i]])
            ret = [map[nums[i]],i]
            break
    else:
        if complement in map.keys():
            #print "[%s,%s]" %(i,map[complement])
            ret = [map[complement],i]
            break
        else:
            map[nums[i]] = i

