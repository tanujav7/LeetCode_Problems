class Solution {
    public int maximumWealth(int[][] accounts) {
        int row_sum = 0;
        int row_max = 0;
        
        for(int i=0; i<accounts.length; i++){
            row_sum = 0;
            for(int j=0; j<accounts[0].length; j++){
                row_sum += accounts[i][j];
                row_max = Math.max(row_sum, row_max);
            }
        }
        
        return row_max;
    }
}