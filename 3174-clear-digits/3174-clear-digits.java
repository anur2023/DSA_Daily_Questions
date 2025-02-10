import java.util.Stack;

class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}
