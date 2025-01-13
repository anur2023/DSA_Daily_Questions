import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (int value : count.values()) {
            if (value != 0) return false;
        }
        return true;
    }
}