class Solution {
    public String removeStars(String s) {
        
   /*     Stack<Character> stack = new Stack<>();
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
        
        return str.reverse().toString();*/
        
        char arr[] = new char[s.length()];
        int j=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*')
                j--;
            else
                arr[j++] = s.charAt(i);
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<j; i++){
            str.append(arr[i]);
        }
        
        return str.toString();
    }
}