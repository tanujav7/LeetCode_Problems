class Solution {
    public int numEnclaves(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
         //For first row & last row
        for(int j=0; j<col; j++){
            if(grid[0][j]==1)
            dfs(grid, 0, j);
            
            if(grid[row-1][j]==1)
            dfs(grid, row-1, j);
        }
        
        //For first column & last column
        for(int j=0; j<row; j++){
            if(grid[j][0]==1)
            dfs(grid, j, 0);
            
            if(grid[j][col-1]==1)
            dfs(grid, j, col-1);
        }
        
        int count = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        
        return count;
    }
    
     void dfs(int grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||  grid[i][j]==0 || grid[i][j]==2)
            return;
        
        grid[i][j] = 2;
        
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
    }
}