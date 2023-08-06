class Solution {
    public int maximumWealth(int[][] accounts) {
        
     
        int max_sum = 0;
        
        for(int i=0; i<accounts.length; i++){
            
            int row_sum = 0;
            
            for(int j=0; j<accounts[0].length; j++){
                row_sum += accounts[i][j];
            }
            
            max_sum = Math.max(max_sum, row_sum);
        }
        
        return max_sum;
    }
}