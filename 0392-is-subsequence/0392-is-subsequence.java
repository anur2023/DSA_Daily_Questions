class Solution {
    public boolean isSubsequence(String s, String t) {
        return helper(s,t,0,0);
    }
    private boolean helper(String s, String t, int i, int j){
        if(s.length()==i) return true;
        if(t.length()==j) return false;
        if(s.charAt(i)==t.charAt(j)){
          return  helper(s,t,i+1,j+1);
        }
        else{
            return helper(s,t,i,j+1);
        }


    }
}