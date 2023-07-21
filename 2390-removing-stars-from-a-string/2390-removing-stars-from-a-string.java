class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        char arr[] = s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if(s.charAt(i)=='*')
               stack.pop();
            else
                stack.push(s.charAt(i));
        }
        
        while(!stack.isEmpty())
            str.append(stack.pop());
        
        return str.reverse().toString();
    }
}