class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(String operation : operations){
            if(operation.equals("C"))
                stack.pop();
            else if(operation.equals("D"))
                stack.push(2*stack.peek());
            else if(operation.equals("+")){
                int op1 = stack.pop();
                int op2 = stack.peek();
                int sum = op1+op2;
                stack.push(op1);
                stack.push(sum);
            }
            else{
                stack.push(Integer.valueOf(operation));
            }
        }
        
        int total = 0;
        
        while(!stack.isEmpty()){
            total +=stack.pop();
        }
        
        return total;
    }
}