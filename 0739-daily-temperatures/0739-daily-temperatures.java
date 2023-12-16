class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        
        Stack<Integer> stack = new Stack<>();
        
        int res[] = new int[n];
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int pop = stack.pop();
                res[pop] = i-pop;
            }
            stack.push(i);
        }
        
        return res;
    }
}