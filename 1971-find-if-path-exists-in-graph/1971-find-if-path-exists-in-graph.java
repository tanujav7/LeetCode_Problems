class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(src);
        
        boolean visited[] = new boolean[n];
        
        visited[src] = true;
        
        
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
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            
            if(node==dest)
                return true;
            
            for(int ele : adjList.get(node)){
                if(visited[ele]==false){
                    visited[ele] = true;
                    queue.add(ele);
                }
            }
        }
        
        return false;
    }
}