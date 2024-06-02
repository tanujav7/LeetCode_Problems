class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        char arr[] = s.toCharArray();
        
        for(char ch : arr){
           if(!stack.isEmpty()){
                if(stack.peek()==ch)
                    stack.pop();
               else
                stack.push(ch);
           }
            
            else
                stack.push(ch);
        }
        
        String res = "";
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}