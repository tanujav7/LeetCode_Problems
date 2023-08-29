class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        
        Stack<Integer> stack = new Stack<>();
        
        int j = 0;
        int i = 0;
        
        int n = pushed.length;
        
        while(i<n){
            stack.push(pushed[i]);
            
            while(!stack.isEmpty() && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
            
            i++;
        }
        
        return stack.isEmpty();
    }
}