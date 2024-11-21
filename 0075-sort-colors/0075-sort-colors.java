class Solution {
    public void sortColors(int[] nums) {
        ArrayList<Integer> zeroarr = new ArrayList<>();
         ArrayList<Integer> onearr = new ArrayList<>();
          ArrayList<Integer> twoarr = new ArrayList<>();
        int index = 0;
        for(int i : nums){
            if(i==0){
                zeroarr.add(0);
            }
            else if(i==1){
                onearr.add(1);
            }
            else{
                twoarr.add(2);
            }
        }
        int zero = zeroarr.size();
        int one = onearr.size();
        int two = twoarr.size();
        for(int i = 0;i<zero;i++){
            nums[index] = 0;
            index++;
        }
        for(int i = 0;i<one;i++){
            nums[index] = 1;
            index++;
        }
        for(int i = 0;i<two;i++){
            nums[index] = 2;
            index++;
        }
    }
}