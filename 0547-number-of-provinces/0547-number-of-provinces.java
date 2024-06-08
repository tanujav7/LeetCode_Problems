class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        
        int visited[] = new int[n];
        
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(visited[i]==0){
                dfs(isConnected, visited, i, n);
                count++;
            }
        }
        
        return count;
    }
    
    void dfs(int isConnected[][], int visited[], int u, int n){
        visited[u] = 1;
        
         for(int i=0; i<n; i++){
            if(isConnected[u][i]==1 && visited[i]==0)
             dfs(isConnected, visited, i, n);
         }
    }
}