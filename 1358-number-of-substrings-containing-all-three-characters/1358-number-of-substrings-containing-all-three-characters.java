class Solution {
    public int numberOfSubstrings(String s) { 
    int[] count = new int[3]; 
        int left = 0; 
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;

            
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += s.length() - i; 
                count[s.charAt(left) - 'a']--;
                left++; 
            }
        }
        return result; 
    }
}