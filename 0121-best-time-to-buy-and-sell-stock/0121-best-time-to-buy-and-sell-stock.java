class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int left = 0, right = 1;
        int n = prices.length;
        
        while(right<n){
            maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
            
            if(prices[right]<prices[left]){
                left = right;
                right++;
            }
            
            else{
                right++;
            }
        }
        
        return maxProfit;
    }
}