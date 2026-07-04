class Solution {
    public String longestCommonPrefix(String[] strs) {
      int minLength = strs[0].length();
      StringBuilder stringResult = new StringBuilder();
      for(int i = 1; i < strs.length; i++) {
         minLength = Math.min(minLength, strs[i].length());
       }
      
       for(int i = 0;i<minLength;i++){
        for(int j = 0 ;j<strs.length;j++){
            if(strs[0].charAt(i)==strs[j].charAt(i)){
            }
            else{
                return strs[0].substring(0,i);
            }
        }
        stringResult.append(strs[0].charAt(i));
          
       }
       return stringResult.toString();
    }
}