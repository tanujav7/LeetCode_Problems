class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        
        int countComponents = 0;
        
        boolean visited[] = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(visited[i]==false){
                countComponents++;
                bfs(isConnected, visited, i, n);
            } 
        }
        
        return countComponents;
    }
    
    void bfs(int adjMatrix[][], boolean visited[], int index, int n){
        visited[index] = true;
        
        for(int i=0; i<n; i++){
            if(adjMatrix[index][i]==1 && visited[i]==false)
                bfs(adjMatrix, visited, i, n);
        }
    }
}