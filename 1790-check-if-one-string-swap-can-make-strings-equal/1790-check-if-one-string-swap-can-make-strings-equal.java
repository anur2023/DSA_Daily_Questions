class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int temp1 = -1, temp2 = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (temp1 == -1) {
                    temp1 = i;
                } else if (temp2 == -1) {
                    temp2 = i;
                } else {
                    return false;
                }
            }
        }

        if (temp1 == -1) return true;

        if (temp2 == -1) return false;

        char[] s1Arr = s1.toCharArray();
        char temp = s1Arr[temp1];
        s1Arr[temp1] = s1Arr[temp2];
        s1Arr[temp2] = temp;

        return new String(s1Arr).equals(s2);
    }
}
