class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>();
        for(int i = 0 ; i<s.length();i++){
          if(s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{'){
           parenthesis.push(s.charAt(i));
        }
        else{
        if(parenthesis.isEmpty()){
            return false;
        }
         char top = parenthesis.pop();
          if(s.charAt(i)==']' && top!='[')
            return false;
            
            if(s.charAt(i)==')' && top!='(')
            return false;
            
            if(s.charAt(i)=='}' && top!='{')
            return false;
            }
        }
        return parenthesis.isEmpty();
    }
}