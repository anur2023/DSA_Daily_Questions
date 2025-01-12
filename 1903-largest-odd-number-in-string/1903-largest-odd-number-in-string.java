class Solution {
    public String largestOddNumber(String num) {
        String s = "";
        int index  = -1;
        for(int i = num.length()-1;i>=0;i--){
            if((int)num.charAt(i)%2 != 0){
                
                index = i;
                break;
            }
        }
        for(int i = 0;i<=index;i++){
            
                s += num.charAt(i);
            
        }
        return s;


    }
}