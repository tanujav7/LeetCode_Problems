class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        char arr[] = s.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            
            if(ch!='*')
                stack.push(ch);
            else
                stack.pop();
        }
        
        StringBuilder res = new StringBuilder();
        
        while(!stack.isEmpty())
            res.append(stack.pop());
        
        return res.reverse().toString();
    }
}