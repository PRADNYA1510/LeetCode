class Solution {
    public boolean hasMatch(String s, String p) {
        String[] str = p.split("\\*");
        
        if(str.length==2){
        int sstr1 = s.indexOf(str[0]);
        int sstr2 = s.indexOf(str[1], sstr1 + str[0].length());
        if(sstr1!=-1 && sstr2!=-1){
            
                return true;
            
            
        }
        }
        else if(str.length==0){
            return true;
        }
        else{
           if(s.indexOf(str[0])!=-1){
            return true;
           }
        }
      return false;

    }
}