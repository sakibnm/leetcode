def lengthOfLongestSubstring(s):
    """
    :type s: str
    :rtype: int
    """
    len = s.__len__()
    map = {}
    first = 0
    count = 0
    for i in range(0, len):
        if (map.__contains__(s[i])):
            if(first<=map[s[i]] ):first = map[s[i]] + 1
            l = i - first
            if (l > count): count = l
            if map[s[i]] == (i - 1):
                # print "true"
                map.clear()
                # print map
                map[s[i]] = i
                first = i
            map[s[i]] = i
        else:
            map[s[i]] = i
            l = i - first
            if (l > count): count = l
    if (len > 0):
        return count + 1
    else:
        return count

res = lengthOfLongestSubstring("wobgrovsw")

print res
