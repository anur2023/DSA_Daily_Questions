class Solution {
    public int fib(int n) {
    
        if (n==1 || n==0) return n;

            int [] dp_array = new int [n+1];
            dp_array[0] = 0;
            dp_array[1] = 1;
        for(int i= 2;i<=n;i++){
            dp_array[i] = dp_array[i-1]+dp_array[i-2];
        }
        return dp_array[n];
    }
}