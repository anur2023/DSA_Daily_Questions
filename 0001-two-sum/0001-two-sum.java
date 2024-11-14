class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            int a = nums[i];
            int more = target-a;
            if(map.containsKey(more)){
                int[] result = {map.get(more), i};
                return result;
            }
            map.put(a,i);
        }
        return new int[]{-1,-1};
    }
}