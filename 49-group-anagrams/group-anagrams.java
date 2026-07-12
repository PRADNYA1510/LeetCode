class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i = 0 ;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String result = String.valueOf(chars);
            hm.computeIfAbsent(result,key -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}