class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(String operation : operations){
            
            if(operation.equals("C"))
                stack.pop();
            
            else if(operation.equals("D"))
                stack.push(2*stack.peek());
            
            else if(operation.equals("+")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                int sum = n1+n2;
                stack.push(n2);
                stack.push(n1);
                stack.push(sum);
            }
            
            else
                stack.push(Integer.valueOf(operation));
            
        }
        
        
        int sum = 0;
        
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        
        return sum;
    }
}