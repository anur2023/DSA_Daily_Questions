class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len * (len+1)/2;
        int sum_arr = 0;
        for(int Sum : nums){
            sum_arr += Sum;
        }
        return sum - sum_arr;
    }
}