class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int ans = 0;
        int n = x;
        while(x>0){
            int digit = x%10;
            ans = ans*10+digit;
        x = x/10;
        }
        if (ans == n) return true;
        return false;
    }
}