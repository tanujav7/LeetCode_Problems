class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack();
        
        for(String operator : operations){
            if(operator.equals("C"))
                stack.pop();
            else if(operator.equals("D"))
                stack.push(2*stack.peek());
            else if(operator.equals("+")){
                int n1 = stack.pop();
                int n2 = stack.pop();
                int sum = n1+n2;
                stack.push(n2);
                stack.push(n1);
                stack.push(sum);
            }
            else
                stack.push(Integer.valueOf(operator));
        }
        
        
        int total = 0;
        
        while(!stack.isEmpty())
            total += stack.pop();
        
        return total;
    }
}