class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            boolean flag = true;
            while(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
                flag = false;
            }
            if(flag)
            stack.push(ch);
        }
        
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}