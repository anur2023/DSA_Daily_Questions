class Solution {
    public int findLengthOfLCIS(int[] nums) {
         if (nums.length == 0) return 0;
        int max = 1;
        int count = 1;
        for(int i = 0;i<nums.length-1;i++){
            
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{
                if(count>=max){
                    max = count;
                    

                }
                count = 1;
            }
        }
        if(count>=max){
                    max = count;
                    

                }

        return max;
    }
}