class Solution {
    public int diagonalSum(int[][] mat) {
        
  
        int n = mat.length;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            //Add Primary Diagnals
            sum = sum + mat[i][i];
            
            //Add Secondary Diagonals
            sum = sum + mat[n-i-1][i];
        }
        
        if(n%2!=0)
            sum = sum - mat[n/2][n/2];
        
        
        return sum;

            
    }
    
}