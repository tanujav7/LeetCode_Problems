class Solution {
    public int closedIsland(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        int count = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==0 && dfs(grid, i, j)){
                    count++;
                }
            }
        }
        
        return count;
    }
    
    boolean dfs(int grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
            return false;
        
        if(grid[i][j]==1 || grid[i][j]==2)
            return true;
        
        grid[i][j] = 2;
        
        boolean top = dfs(grid, i+1, j);
        boolean down = dfs(grid, i-1, j);
        boolean left = dfs(grid, i, j-1);
        boolean right = dfs(grid, i, j+1);
        
        return (top && down && left && right);
    }
}