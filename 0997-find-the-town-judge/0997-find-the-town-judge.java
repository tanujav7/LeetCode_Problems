class Solution {
    public int findJudge(int n, int[][] trust) {
        int adjMatrix[] = new int[n+1];
        
        for(int node[] : trust){
            
            int n1 = node[0];
            int n2 = node[1];
            
            adjMatrix[n1]--;
            adjMatrix[n2]++;
        }
        
        
        for(int i=1; i<=n; i++){
            if(adjMatrix[i]==n-1)
                return i;
        }
        
        return -1;
    }
}