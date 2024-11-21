class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int left = 0, right = 1;
        
        int maxProfit = 0;
        
        while(right<n){
            
            maxProfit = Math.max(prices[right]-prices[left], maxProfit);
            
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