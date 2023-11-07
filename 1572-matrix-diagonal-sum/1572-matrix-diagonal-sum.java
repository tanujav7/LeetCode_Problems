class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        int n = mat.length;
        int m = mat[0].length;
        
        int j = 0;
        
        for(int i=0; i<n; i++){
            sum += mat[i][j++];
            sum += mat[n-i-1][i];
        }
        
        if(n%2==0)
            return sum;
        
        else
            return (sum-mat[n/2][n/2]);
    }
}