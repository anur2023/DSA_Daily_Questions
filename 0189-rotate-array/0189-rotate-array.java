class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        nums = reverse(nums,0,nums.length-k-1);
        nums = reverse(nums,nums.length-k,nums.length-1);
        nums = reverse(nums,0,nums.length-1);
        
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