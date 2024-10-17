class Solution:
    def isPalindrome(self, x: int) -> bool:
        
        # a = str(x)
        
        # p = a[::-1]
        
        # if a == p:
        #     return True
        # else:
        #     return False
        a = str(x)
        p = a[::-1]
        if(a == p):
            return True
        else:
            return False