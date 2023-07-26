class Solution {
    public String reverseOnlyLetters(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        int n = s.length();
        
        for(int i=0; i<n; i++){
            if(Character.isLetter(s.charAt(i)))
                stack.push(s.charAt(i));
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<n; i++){
            if(Character.isLetter(s.charAt(i)))
                str.append(stack.pop());
            else
                str.append(s.charAt(i));
        }
        
        return str.toString();
    }
}