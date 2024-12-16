class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int index = 0;
            int min = Integer.MAX_VALUE;
           
            for(int i = 0;i<nums.length;i++){
                if(nums[i]<min){
                    index = i;
                    min = nums[i];
                }
            }
            nums[index] = min * multiplier;
            k--;
        }
        return nums;
    }
}