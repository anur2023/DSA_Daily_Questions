class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max_d = 1;
        int max_i = 1;
        int inc = 1;
        int dec = 1;

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                inc += 1;
            }
            else{
                inc = 1;
            }
            if(inc > max_i){
                max_i = inc;
            }
        }
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                dec += 1;
            }
            else{
                dec = 1;
            }
            if(dec > max_d){
                max_d = dec;
            }
        }
        return Math.max(max_d,max_i);
    }
}