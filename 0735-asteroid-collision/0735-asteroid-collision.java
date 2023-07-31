class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for(int asteroid : asteroids){
            boolean flag = true;
            while(!stack.isEmpty() && stack.peek() > 0 && asteroid < 0){
                if(Math.abs(stack.peek())<Math.abs(asteroid)){
                    stack.pop();
                    continue;
                }
                
                else if(Math.abs(stack.peek())==Math.abs(asteroid))
                    stack.pop();
                
                flag = false;
                break;
            }
            
            
            if(flag)
            stack.push(asteroid);
        }
        
        int res[] = new int[stack.size()];
    
        for(int i=stack.size()-1; i>=0; --i)
            res[i] = stack.pop();
        
        return res;
    }
}