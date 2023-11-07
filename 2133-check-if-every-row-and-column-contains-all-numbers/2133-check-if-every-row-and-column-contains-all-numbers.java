class Solution {
    public boolean checkValid(int[][] matrix) {
        
        int n = matrix.length;
        
        for(int i=0; i<n; i++){
            Set<Integer> row_set = new HashSet<>();
             Set<Integer> col_set = new HashSet<>();
            for(int j=0; j<n; j++){
                row_set.add(matrix[i][j]);
                col_set.add(matrix[j][i]);
            }
            if(row_set.size()!=n || col_set.size()!=n)
                return false;
        }
        
       
        return true;
    }
}