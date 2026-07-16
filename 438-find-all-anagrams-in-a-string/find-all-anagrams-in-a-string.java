class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        else{
        for (int i = 0; i < p.length(); i++) {
            freq1[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            freq2[s.charAt(i) - 'a']++;
        }
  
        if (Arrays.equals(freq1, freq2)) {
            list.add(0);
        }
        for (int right = p.length(); right < s.length(); right++) {
 
            freq2[s.charAt(right) - 'a']++;
  
            freq2[s.charAt(right - p.length()) - 'a']--;
   
            if (Arrays.equals(freq1, freq2)) {
                list.add(right - p.length() + 1);
            }
        }
        }
        return list;
    }
}