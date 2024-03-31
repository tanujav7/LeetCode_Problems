class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int count = 0;
        
        int n = isConnected.length;
        
        boolean visited[] = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(visited[i]==false){
                dfs(isConnected, visited, i, n);
                count++;
            }
        }
        
        return count;
    }
    
    void dfs(int isConnected[][], boolean visited[], int ind, int n){
        visited[ind] = true;
        
        for(int j=0; j<n; j++){
            if(isConnected[ind][j]==1 && visited[j]==false)
               dfs(isConnected, visited, j, n);
        }
        
       // visited[ind] = false;
    }
}