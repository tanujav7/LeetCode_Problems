class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        int maxIsland = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1){
                    maxIsland = Math.max(maxIsland, dfs(grid, i, j));
                }
            }
        }
        
        return maxIsland;
    }
    
    
    int dfs(int grid[][], int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || grid[i][j]==2)
            return 0;
        
        
        grid[i][j] = 2;
        
        return (1 + dfs(grid, i-1, j) + dfs(grid, i+1, j) + dfs(grid, i, j-1) + dfs(grid, i, j+1));
            
    }
}