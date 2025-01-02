class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ns = new StringBuilder();
        s = s.toLowerCase();  
        for (char i : s.toCharArray()) { 
            if ((i >= 'a' && i <= 'z') || (i >= '0' && i <= '9')) {  
                ns.append(i);
            }
        }
        return fun(ns, 0, ns.length() - 1); 
    }

    private boolean fun(StringBuilder ns, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (ns.charAt(left) != ns.charAt(right)) {
            return false; 
        }
        return fun(ns, left + 1, right - 1);
    }
}
