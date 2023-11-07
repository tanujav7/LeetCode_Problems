class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int res[][] = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++)
                res[i][j] = matrix[j][i];
        }
        
        return res;
    }
}