class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String result = "";
        
        for(int i = s1.length-1;i>=0;i--){
            if (!s1[i].equals("")) { 
            result += s1[i]+" ";
            }
        }
        result = result.trim();
       return result;    
    }
}