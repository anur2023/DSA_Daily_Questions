class Solution:
    def reverse(self, x: int) -> int:
        ans = 0
        on = x
        flag = 0
        if(on <0):
            on *= -1
            flag = 1
            
        while(on>0):
            digit = on%10
            ans = ans*10 +digit
            
            on //= 10
        if ans < -2**31 or ans > 2**31 - 1:
            return 0
        if(flag == 1):
            return ans*(-1)
        return ans


        
