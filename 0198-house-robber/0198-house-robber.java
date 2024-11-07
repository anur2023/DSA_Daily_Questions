class Solution {
    public int rob(int[] nums) {
        int dp [] = new int [nums.length];
         for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int ans =  cal(nums,nums.length-1,dp);
        return ans;
        
    }
    private int cal(int [] arr , int index,int[] dp){
        if(index ==0) return arr[index];
        if(index<0) return 0;
        if(dp[index] != -1) return dp[index];
        int left = arr[index] + cal(arr , index-2,dp);
        int right = cal(arr,index-1,dp);
        return dp[index] =  Math.max(left,right);
    }
}