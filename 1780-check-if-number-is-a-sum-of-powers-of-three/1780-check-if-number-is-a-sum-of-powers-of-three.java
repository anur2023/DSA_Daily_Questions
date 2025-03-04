class Solution {
    public boolean checkPowersOfThree(int n) {
        int sum = 0;

    while(n>0){
        if(n%3==2) return false;
        n = n/3;
    }
    return true;
    }
}