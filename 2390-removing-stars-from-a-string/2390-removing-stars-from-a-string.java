class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        
        return res.reverse().toString();
    }
}