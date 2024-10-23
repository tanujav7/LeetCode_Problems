class Solution {
    public boolean isValid(String s) {
        
        char arr[] = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch : arr){
            if(stack.isEmpty())
                stack.add(ch);
            
            else if(!stack.isEmpty()){
                if(ch==')' && stack.peek()=='(')
                    stack.pop();
                else if(ch==']' && stack.peek()=='[')
                    stack.pop();
                else if(ch=='}' && stack.peek()=='{')
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        
        return stack.isEmpty();
    }
}