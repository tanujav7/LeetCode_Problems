class Solution {
    public boolean isValid(String s) {
        
        if(s.length()%2!=0)
            return false;
       
         char arr[] = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
                char ch = arr[i];
            
            if(ch=='(' || ch=='[' || ch=='{')
                stack.push(ch);
            
            else if(!stack.isEmpty()){
                
            if(ch==')' && stack.peek()=='(')
                stack.pop();
            
            else if(ch=='}' && stack.peek()=='{')
                stack.pop();
            
            else if(ch==']' && stack.peek()=='[')
                stack.pop();
                
            else
                stack.push(ch);
            
            }
            else
                stack.push(ch);
        }
        
        return stack.isEmpty();
    }
}
               