class Solution {
    public boolean isValid(String s) {
        if(s ==null || s.length()<2)
            return false;
        
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
          char c =s.charAt(i);
          if(c =='[' || c =='{' || c == '('){
            stack.push(c);
          }
          if(c ==']' || c =='}' || c == ')'){
             if(stack.isEmpty()){
                return false;
            }
            Character sct= stack.peek();
           
            char sc=(char)sct;
           
            if((sc == '[' && c ==']')||( sc == '(' && c ==')' )|| (sc == '{' && c =='}')){
                stack.pop();
                continue;
            }
            else{
                return false;
            }
          }
        }
      
            return stack.isEmpty();
      
    }
}
