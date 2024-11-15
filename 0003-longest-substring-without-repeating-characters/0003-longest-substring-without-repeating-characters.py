class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        char_set = set()
        max_length = 0
        left = 0
        for right in range(len(s)):
            while(s[right] in char_set):
                char_set.remove(s[left])
                left +=1
            char_set.add(s[right])
            max_length = max(max_length,right -left +1)
        return max_length
        