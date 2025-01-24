import java.util.HashMap;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                mp.put(num, mp.getOrDefault(num, 0) + 1);
            }
        }

        int maxFrequency = -1;
        int mostFrequentEven = -1;

        for (int key : mp.keySet()) {
            int val = mp.get(key);
            if (val > maxFrequency || (val == maxFrequency && key < mostFrequentEven)) {
                maxFrequency = val;
                mostFrequentEven = key;
            }
        }

        return mostFrequentEven;
    }
}
