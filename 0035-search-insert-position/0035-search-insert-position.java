class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int result = nums.length;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(nums[mid] ==target){
                return mid;
            }
            else if(nums[mid]>target){
                right = mid-1;
                result = mid;
            }
            else{
                left = mid+1;
            }
        }
        return result;
    }
}