class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int indegree[] = new int[n+1];
        
        for(int node[] : trust){
            int n1 = node[0];
            int n2 = node[1];
            
            indegree[n1]--;
            indegree[n2]++;
        }
        
        
        for(int i=1; i<=n; i++){
            if(indegree[i]==n-1)
                return i;
        }
        
        
        return -1;
    }
}