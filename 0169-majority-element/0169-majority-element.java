class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = -1;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                count++;
                ans = nums[i];

            }
            else if(ans == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return ans;
    }
}