class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        
        int countProvinces = 0;
        
        int visited[] = new int[n];
        
        for(int i=0; i<n; i++){
            if(visited[i]==0){
                dfs(isConnected, visited, i, n);
                countProvinces++;
            }
        }
        
        return countProvinces;
    }
    
    void dfs(int graph[][], int visited[], int u, int n){
        
        visited[u] = 1;
        
        for(int i=0; i<n; i++){
            if(graph[u][i]==1 && visited[i]==0)
                dfs(graph, visited, i, n);
        }
    }
}