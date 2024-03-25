class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n = isConnected.length;
        int numberofComponents = 0;
        boolean visited[] = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(visited[i]==false){
               numberofComponents++;
                dfs(i, isConnected, visited, n);
            }
        }
        
        return numberofComponents;
    }
    
    void dfs(int index, int isConnected[][], boolean visited[], int n){
        visited[index] = true;
        
        for(int i=0; i<n; i++){
            if(isConnected[index][i]==1 && visited[i]==false)
                dfs(i, isConnected, visited, n);
        }
    }
}