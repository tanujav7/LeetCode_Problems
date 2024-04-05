class Solution {
    public int numIslands(char[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        int numIsland = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]=='1'){
                    numIsland++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return numIsland;
    }
    
    
    void dfs(char grid[][], int i, int j){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]=='2' || grid[i][j]=='0')
            return;
        
        grid[i][j] = '2';
        
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}