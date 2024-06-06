class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int countIsland = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i, j);
                    countIsland++;
                }
            }
        }
        
        return countIsland;
    }
    
    void dfs(char grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0' || grid[i][j] == '2')
            return;
        
        grid[i][j] = '2';
        
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}