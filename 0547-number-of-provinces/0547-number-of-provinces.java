class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        
        int visited[] = new int[200];
        
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(visited[i]==0){
                count++;
                dfs(isConnected, i, visited, n);
            }
        }
        
        return count;
    }
    
    void dfs(int isConnected[][], int u, int visited[], int n){
        visited[u] = 1;
        
        for(int i=0; i<n; i++){
            if(isConnected[u][i]==1 && visited[i]==0)
                dfs(isConnected, i, visited, n);
        }
    }
}