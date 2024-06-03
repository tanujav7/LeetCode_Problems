class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        
        int res[] = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++){
            
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int num = stack.pop();
                res[num] = i - num;
            }
            
            stack.push(i);
        }
        
        return res;
    }
}