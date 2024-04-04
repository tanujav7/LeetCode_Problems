class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] = new boolean[n];
        
        int countComponents = 0;
        
        for(int i=0; i<n; i++){
            if(visited[i]==false){
                countComponents++;
                dfs(isConnected, visited, i, n);
            }
        }
        
        return countComponents;
    }
    
    void dfs(int isConnected[][], boolean visited[], int index, int n){
        visited[index] = true;
        
        for(int i=0; i<n; i++){
            if(visited[i]==false && isConnected[index][i]==1)
            dfs(isConnected, visited, i, n);
        }
    }
}