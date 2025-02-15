class Solution {
    public int punishmentNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(String.valueOf(square), i)) {
                count += square;
            }
        }
        return count;
    }

    private boolean canPartition(String str, int target) {
        return helper(str, target, 0, 0);
    }

    private boolean helper(String str, int target, int index, int sum) {
        if (index == str.length()) {
            return sum == target;
        }

        int currentSum = 0;
        for (int i = index; i < str.length(); i++) {
            currentSum = currentSum * 10 + (str.charAt(i) - '0');
            if (helper(str, target, i + 1, sum + currentSum)) {
                return true;
            }
        }
        return false;
    }
}
