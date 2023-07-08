class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int res = 0;
        int row_sum = 0;
        
        for(int i=0; i<accounts.length; i++){
            row_sum = 0;
            for(int j=0; j<accounts[0].length; j++){
                row_sum += accounts[i][j];
            }
            
            res = Math.max(res,row_sum);
        }
        
        return res;
    }
}