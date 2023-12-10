class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("C"))
                stack.pop();
            
            else if(operations[i].equals("D")){
                stack.push(2 * stack.peek());
            }
            
            else if(operations[i].equals("+")){
                int temp = stack.pop();
                int sum = temp + stack.peek();
                stack.push(temp);
                stack.push(sum);
            }
            
            else{
                stack.push(Integer.valueOf(operations[i]));
            }
        }
        
        
        int sum = 0;
        
        while(!stack.isEmpty())
            sum += stack.pop();
        
        return sum;
    }
}