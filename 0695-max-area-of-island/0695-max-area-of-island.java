class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1){
                    int getMax = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, getMax);
                }
            }
        }
        
        return maxArea;
    }
    
    int dfs(int grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==2 || grid[i][j]==0)
            return 0;
        
        
        grid[i][j] = 2;
        
        return 1 + dfs(grid, i+1, j) + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i, j-1);
    }
}