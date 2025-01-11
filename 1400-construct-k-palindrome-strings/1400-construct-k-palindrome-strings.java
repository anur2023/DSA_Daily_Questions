class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;
        if (s.length() == k)
            return true;

        int odd = 0;

        for (char chr : s.toCharArray())
            odd ^= 1 << (chr - 'a');

        return Integer.bitCount(odd) <= k;
    }
}