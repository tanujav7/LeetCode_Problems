class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        int n = pushed.length;
        
        for(int x : pushed){
            stack.push(x);
            
            while(!stack.isEmpty() && j<n && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        
        }
        
        return stack.isEmpty();
    }
}