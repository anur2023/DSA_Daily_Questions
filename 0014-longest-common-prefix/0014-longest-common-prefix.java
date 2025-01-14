class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        
        String commonPrefix = commonPrefix(strs[0], strs[1]);
        
        for (int i = 2; i < strs.length; i++) {
            commonPrefix = commonPrefix(commonPrefix, strs[i]);
            if (commonPrefix.isEmpty()) {
                break;
            }
        }
        
        return commonPrefix;
    }

    private String commonPrefix(String s1, String s2) {
        int i = 0;

        while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        return s1.substring(0, i);
    }
}
