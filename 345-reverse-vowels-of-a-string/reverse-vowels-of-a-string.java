class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length-1;
        
        while(i<j){
            if(validateChar(str[i])&&validateChar(str[j])){
                char temp = str[i];
                str[i]=str[j];
                str[j]=temp;
                i++;
                j--; 
            }
            else if(!validateChar(str[i])){
                i++;
            }
            else{
                j--;
            }
        }
        String a = new String(str);
        return a;
    }

    public static boolean validateChar(char c){
        c = Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
        return false;
    }
}