class Solution {
    public boolean isValid(String s) {
        
        if(s.length()%2!=0)
            return false;
        
        Stack<Character> stack = new Stack<>();
        char ch[] = s.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            
          if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
              stack.push(ch[i]);
            
          else if(!stack.isEmpty()){

           if(ch[i]=='}' && stack.peek()=='{')
              stack.pop();
              
          else if(ch[i]==')' && stack.peek()=='(')
              stack.pop();
          
          else if(ch[i]==']' && stack.peek()=='[')
              stack.pop();
              
          else
              stack.push(ch[i]);
          }
          
        else
        return false;
               
       }
        
        return stack.isEmpty();
    }
}
               