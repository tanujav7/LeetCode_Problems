class Solution {
    public void setZeroes(int[][] matrix) {
        
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
         for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}