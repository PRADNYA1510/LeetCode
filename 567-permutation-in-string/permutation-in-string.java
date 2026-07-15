class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Step 1: Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        // Step 2: Frequency of first window
        for (int i = 0; i < s1.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        // Step 3: Compare first window
        if (Arrays.equals(freq1, freq2)) {
            return true;
        }

        // Step 4: Slide the window
        for (int right = s1.length(); right < s2.length(); right++) {

            // Character entering the window
            freq2[s2.charAt(right) - 'a']++;

            // Character leaving the window
            freq2[s2.charAt(right - s1.length()) - 'a']--;

            // Compare again
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}