class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0;
        int n = prices.length;
        int right = 1;
        
        int maxProfit = 0;
        
        while(right<n){
            if(prices[right]>prices[left]){
                maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
                right++;
            }
            
            else{
                left = right;
                right++;
            }
        }
        
        return maxProfit;
    }
}