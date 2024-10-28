class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        if (n == 2) return "11";
        String s = "11";
        while (n - 2 > 0) {
            String t = "";
            s = s + "&";
            int count = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    t += count + "" + s.charAt(i - 1);
                    count = 1;
                }
            }
            s = t;
            n--;
        }
        return s;
    }
}
