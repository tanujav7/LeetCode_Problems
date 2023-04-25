class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       
        
      List<Integer> res = new ArrayList<>();
        
        int row_Begin = 0;
        int row_End = matrix.length-1;
        int col_Begin = 0;
        int col_End = matrix[0].length-1;
        
        while(row_Begin<=row_End && col_Begin<=col_End){

        for(int i=col_Begin; i<=col_End; i++)
            res.add(matrix[row_Begin][i]);
            
        row_Begin++;
            
            
        for(int i=row_Begin; i<=row_End; i++)
            res.add(matrix[i][col_End]);
            
        col_End--;
            
        if(row_Begin<=row_End){
            for(int i=col_End; i>=col_Begin; --i)
                res.add(matrix[row_End][i]);
        }
            row_End--;
            
        if(col_Begin<=col_End){
            for(int i=row_End; i>=row_Begin; --i)
                res.add(matrix[i][col_Begin]);
        }
        
            col_Begin++;
        }
        
        return res;
    }
}