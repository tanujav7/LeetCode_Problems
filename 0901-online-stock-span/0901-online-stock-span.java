class StockSpanner {

    Stack<int[]> stack;
    
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int res = 1;
        
        while(!stack.isEmpty() && stack.peek()[0]<=price)
            res = res + stack.pop()[1];
        
        stack.push(new int[] {price,res});
        
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */