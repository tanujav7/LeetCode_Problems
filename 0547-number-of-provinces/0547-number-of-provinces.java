class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int count = 0;
        
        int n = isConnected.length;
        
        int visited[] = new int[300];
        
        
        for(int i=0; i<n; i++){
            if(visited[i]==0){
                count++;
                dfs(isConnected, n, visited, i);
            }
        }
        
        return count;
    }
    
    void dfs(int graph[][], int n, int visited[], int u){
        visited[u] = 1;
        
        for(int i=0; i<n; i++){
            if(graph[u][i]==1 && visited[i]==0)
                dfs(graph, n, visited, i);
        }
    }
}