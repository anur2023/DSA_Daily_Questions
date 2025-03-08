class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        int max = 0;
       
        int n = blocks.length();
        for(int i = 0;i<=n-k;i++){
            for(int j = i;j<k+i;j++){
                if(blocks.charAt(j)=='B'){
                    count++;
                }
                
            }
            if(count>=k){
                return 0;
            }
            max = Max_val(count , max);
            count = 0;

        }
        return k- max;
    }
    int Max_val(int a, int b){
        if(a>=b){
            return a;
        }
        else{
            return b;
        }
    }
}