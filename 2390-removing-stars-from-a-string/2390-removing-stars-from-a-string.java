class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        int n = s.length();
        
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='*')
                stack.pop();
            
            else
                stack.push(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
 
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        String res = new String(sb.reverse());
        
        return res;
        
    }
}