class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int index = 0;
        int max = 0;
        while(index<n){
            int count0 = 0;
            int  count1 = 0;
            for(int i = 0;i<=index;i++){
                if(s.charAt(i) == '0'){
                    count0 += 1;
                }
            }
            for(int i = index+1;i<n;i++){
                if(s.charAt(i) == '1'){
                    count1 += 1;
                }
            }
            if(max<= (count0+count1)){
                max = count0+count1;
            }
            index++;
        }
        return max;
    }
}