class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        int n = nums.length;
        long total_sum = 0;
        long left_sum = 0;
        for(int i : nums){
            total_sum += i;

        }
        for(int i = 0;i<n-1;i++){
            left_sum += nums[i];
            long right_sum = total_sum - left_sum;
            if(left_sum >= right_sum) count++;
        }

        return count;

    }
}