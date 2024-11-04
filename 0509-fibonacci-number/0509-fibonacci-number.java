class Solution {
    public int fib(int n) {
        // By Using the dynamic programming
        int [] memo= new int[n+1];
        for(int i = 0;i<=n;i++){
            memo[i] = -1;
        }
        return fibhelper(n,memo);
        
    }
    private int fibhelper(int n, int[] memo){
        if (n<=1) return n;
        if (memo[n] != -1) return memo[n];
        memo[n] = fibhelper(n-1,memo) + fibhelper(n-2,memo);
        return memo[n];
     }
}