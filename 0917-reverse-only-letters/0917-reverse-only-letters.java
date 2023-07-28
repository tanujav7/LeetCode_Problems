class Solution {
    public String reverseOnlyLetters(String s) {
        
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                stack.push(ch);
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                str.append(stack.pop());
            else
                str.append(ch);
        }
        
        return str.toString();
        
    }
}