class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        
        int visited[] = new int[n];
        
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(visited[i]==0){
              dfs(isConnected, i, visited, n);
              count++;
            }
        }
        
        return count;
    }
    
    void dfs(int grid[][], int u, int visited[], int n){
        
        visited[u] = 1;
        
        for(int i=0; i<n; i++){
            if(grid[u][i]==1 && visited[i]==0)
                dfs(grid, i, visited, n);
        }
    }
}