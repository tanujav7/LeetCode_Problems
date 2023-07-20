class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for(String ops : operations){
            if(ops.equals("C"))
                stack.pop();
            else if(ops.equals("D"))
                stack.add(2*stack.peek());
            else if(ops.equals("+")){
                int top = stack.pop();
                int topNext = stack.pop();
                int sum = top+topNext;
                stack.push(topNext);
                stack.push(top);
                stack.push(sum);
            }
            else{
                stack.add(Integer.valueOf(ops));
            }
        }
        
        
        int sum = 0;
        
        while(!stack.isEmpty())
            sum +=stack.pop();
        
        return sum;
    }
}