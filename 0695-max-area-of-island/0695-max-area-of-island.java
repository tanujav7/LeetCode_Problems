class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        int maxCount = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1){
                    maxCount = Math.max(maxCount, maxArea(grid, i, j));
                }
            }
        }
        
        return maxCount;
    }
     
    int count = 0;
    
    int maxArea(int grid[][], int x, int y){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==2 || grid[x][y]==0)
            return 0;
        
        grid[x][y] = 2;
       
        return (1 + maxArea(grid, x, y+1) + maxArea(grid, x, y-1) + maxArea(grid, x+1, y) + maxArea(grid, x-1, y));
    }
}