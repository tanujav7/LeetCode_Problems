class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
         
        int left = 0, right = 1;
        
        int profit = 0;
        
        while(right<n){
            if(prices[right]>prices[left]){
                profit = Math.max(profit, prices[right] - prices[left]);
                right++;
            }
            
            else{
                left = right;
                right++;
            }
        }
        
        return profit;
    }
}