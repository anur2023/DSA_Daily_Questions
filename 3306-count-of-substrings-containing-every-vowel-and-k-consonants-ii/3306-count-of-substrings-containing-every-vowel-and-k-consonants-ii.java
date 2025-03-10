class Solution {
    public long countOfSubstrings(String word, int k) {
        String vowels = "aeiou";  
        int left = 0, mid = 0;   
        int uniqueVowelCount = 0; 
        int[] frequency = new int[6];
        int[] tempFrequency = new int[6]; 
        long totalSubstrings = 0;
        for (int right = 0; right < word.length(); right++) {
            int vowelIndex = vowels.indexOf(word.charAt(right)) + 1;
            frequency[vowelIndex]++;
            if (vowelIndex > 0 && frequency[vowelIndex] == 1) {
                uniqueVowelCount++;
            }
            while (frequency[0] > k) {
                int leftVowelIndex = vowels.indexOf(word.charAt(left)) + 1;
                frequency[leftVowelIndex]--; 
                if (leftVowelIndex > 0 && frequency[leftVowelIndex] == 0) {
                    uniqueVowelCount--;
                }

                left++; // Move left pointer to shrink window
            }

            // Check if the window has all vowels and exactly k consonants
            if (uniqueVowelCount == 5 && frequency[0] == k) {
                if (mid < left) {
                    mid = left;
                    Arrays.fill(tempFrequency, 0); // Reset frequency tracker
                }

                // Expand the mid pointer to count valid substrings
                while (true) {
                    int midVowelIndex = vowels.indexOf(word.charAt(mid)) + 1;
                    
                    // Stop expanding if we hit a consonant or a necessary vowel count is exhausted
                    if (midVowelIndex == 0 || frequency[midVowelIndex] - tempFrequency[midVowelIndex] == 1) {
                        break;
                    }
                    
                    tempFrequency[midVowelIndex]++; // Track vowels in temp window
                    mid++;
                }

                // Add all valid substrings in the range [left, mid]
                totalSubstrings += mid - left + 1;
            }
        }

        return totalSubstrings;
    }
}