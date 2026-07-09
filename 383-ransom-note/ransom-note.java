class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterFrequency = new int[26];
      
        // Count the frequency of each letter in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            char currentChar = magazine.charAt(i);
            // Convert character to index (0-25) by subtracting 'a'
            int charIndex = currentChar - 'a';
            letterFrequency[charIndex]++;
        }
      
        // Check if ransom note can be constructed by consuming letters from magazine
        for (int i = 0; i < ransomNote.length(); i++) {
            char currentChar = ransomNote.charAt(i);
            // Convert character to index (0-25) by subtracting 'a'
            int charIndex = currentChar - 'a';
          
            // Decrement the count for this letter and check if it goes negative
            letterFrequency[charIndex]--;
            if (letterFrequency[charIndex] < 0) {
                // Not enough of this letter in magazine to construct ransom note
                return false;
            }
        }
      
        // All letters in ransom note can be constructed from magazine
        return true;
    }
}