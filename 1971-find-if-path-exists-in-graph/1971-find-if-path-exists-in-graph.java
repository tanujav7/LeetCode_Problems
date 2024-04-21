class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        
        List<List<Integer>> adjList = new ArrayList<>();
        
        
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        int visited[] = new int[1000005];
        
        visited[src] = 1;
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            
            if(node==dest)
                return true;
            
            for(int adjNode : adjList.get(node)){
                if(visited[adjNode]==0){
                    queue.add(adjNode);
                    visited[adjNode]=1;
                }
            }
        }
        
        return false;
    }
}