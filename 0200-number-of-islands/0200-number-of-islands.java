class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int numberofIslands = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    dfs(i, j, grid);
                    numberofIslands++;
                }
            }
        }
        
        return numberofIslands;
    }
    
    
    void dfs(int i, int j, char grid[][]){
        if(i<0 || j<0 || j >= grid[0].length || i >= grid.length || grid[i][j]=='0' || grid[i][j]=='2')
            return;
        
        grid[i][j] = '2';
        
        dfs(i-1, j, grid);
        dfs(i, j-1, grid);
        dfs(i+1, j, grid);
        dfs(i, j+1, grid);

        
    }
}