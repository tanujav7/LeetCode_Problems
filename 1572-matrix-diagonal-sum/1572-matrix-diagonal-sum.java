class Solution {
    public int diagonalSum(int[][] matrix) {
        
        int sum = 0;
        
        int n = matrix.length;
        
        for(int i=0; i<n; i++){
            //Add principal diagonal elements
            sum = sum + matrix[i][i];
            
            //Add secondary diagonal elements
            sum = sum + matrix[n-i-1][i];
        }
        
        if(n%2!=0)
            sum = sum - matrix[n/2][n/2];
        
        return sum;
    }
}