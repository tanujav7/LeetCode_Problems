class Solution {
    public String reverseOnlyLetters(String s) {
        
        StringBuilder str = new StringBuilder();
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<n; i++){
            if(!Character.isLetter(s.charAt(i)))
                continue;
            else
                stack.push(s.charAt(i));
        }
        
        for(int i=0; i<n; i++){
            if(!Character.isLetter(s.charAt(i)))
                str.append(s.charAt(i));
            else
                str.append(stack.pop());
        }
        
        return str.toString();
    }
}