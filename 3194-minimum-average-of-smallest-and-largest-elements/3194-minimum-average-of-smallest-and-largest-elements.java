class Solution {
    public double minimumAverage(int[] nums) {
        double [] temp = new double[nums.length/2];
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int index = 0;
        while(start<=end){
            double avg = (nums[start]+nums[end])/2.0;
            temp[index] = avg;
            index++;
            start++;
            end--;
        }
        double min = temp[0];
        for(int i = 1;i<temp.length;i++ ){
            if(temp[i]<min){
                min = temp[i];
            }
        }
        return min;
    }
}