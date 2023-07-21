class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
      /*  int n = temperatures.length;
        int res[] = new int[n];
        int k=0;
        for(int i=0; i<n; i++){
            int flag = 0;
            for(int j=i+1; j<n; j++){
                if(temperatures[j]>temperatures[i]){
                    res[k++] = j-i;
                    flag = 1;
                    break;
                    
                }
            }
            if(flag==0)
            res[i] = 0;
        }
        
        return res;*/
        int n = temperatures.length;
        int res[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
                res[stack.peek()] = i-stack.pop();
            stack.push(i);
        }
        
        return res;
    }
}