class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<>();
        
        int n = temperatures.length;
        
        int res[] = new int[n];
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int pop = stack.peek();
                res[pop] = i-stack.pop();
            }
                
            stack.push(i);
        }
        
        return res;
    }
}