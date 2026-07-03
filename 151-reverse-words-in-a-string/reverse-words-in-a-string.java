class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for(int i = s1.length-1;i>=0;i--){
            if (!s1[i].equals("")) { 
            result.append(s1[i]).append(" ");
            }
        }
       
       return result.toString().trim();    
    }
}