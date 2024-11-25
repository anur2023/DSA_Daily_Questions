class Solution {
    public int majorityElement(int[] nums) {
        for(int i : nums){
            int count = 0;
            for(int j : nums){
                if (i==j) count++;
            }
            if(count > nums.length/2) return i;
        }
        return -1;
    }
}