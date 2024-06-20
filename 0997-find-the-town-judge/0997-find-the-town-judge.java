class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int adjList[] = new int[n+1];
        
        for(int node[] : trust){
            int n1 = node[0];
            int n2 = node[1];
            
            adjList[n1]--;
            adjList[n2]++;
        }
        
        
        for(int i=1; i<=n; i++){
            if(adjList[i]==n-1)
                return i;
        }
        
        return -1;
    }
}