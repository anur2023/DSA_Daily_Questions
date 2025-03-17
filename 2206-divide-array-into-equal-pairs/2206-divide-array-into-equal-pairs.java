class Solution {
    public boolean divideArray(int[] nums) {
        int num = nums.length;
        if(num%2 != 0) return false;
        int pairs = num/2;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i=i+2){
            if(nums[i]!=nums[i+1]) return false;
        }
        return true;
    }
}