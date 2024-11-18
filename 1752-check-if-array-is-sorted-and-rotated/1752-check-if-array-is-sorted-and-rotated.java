class Solution {
    public boolean check(int[] nums) {
        if(nums.length==0)return true;
        int min = nums[0];
        int k = 0;
        for(int i  = 1;i<nums.length;i++){
            if(nums[i] < min ){
                min = nums[i];
                k = i;
            }
        }
        nums = reverse(nums,0,k-1);
        nums = reverse(nums,k,nums.length-1);
        nums = reverse(nums,0,nums.length-1);
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;


    }
    private int [] reverse(int [] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
        return arr;
    }
}