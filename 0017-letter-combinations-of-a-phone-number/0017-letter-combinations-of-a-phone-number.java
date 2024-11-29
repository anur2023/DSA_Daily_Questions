import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] PHONE_MAP = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.isEmpty()) return combinations;
        backtrack(0, digits, new StringBuilder(), combinations);
        return combinations;
    }
    
    private void backtrack(int index, String digits, StringBuilder path, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(path.toString());
            return;
        }
        
        String possibleLetters = PHONE_MAP[digits.charAt(index) - '0'];
        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(index + 1, digits, path, combinations);
            path.deleteCharAt(path.length() - 1); // Backtrack
        }
    }
}