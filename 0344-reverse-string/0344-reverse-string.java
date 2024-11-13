class Solution {
    public void reverseString(char[] s) {
        int b = 0;
        int e = s.length - 1;
        s = fun(s, b, e);
    }

    private char[] fun(char[] s, int b, int e) {
        if (b >= e) return s; 
        char swp = s[b];     
        s[b] = s[e];
        s[e] = swp;
        return fun(s, b + 1, e - 1); 
    }
}
