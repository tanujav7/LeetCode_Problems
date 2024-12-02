class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        
        int visited[] = new int[10001];
        
        int src = 0;
        
        int dest = n-1;
        
        getPaths(graph, src, dest, visited, n);
        
        return resList;
    }
    
    void getPaths(int graph[][], int src, int dest, int visited[], int n){
        list.add(src);
        visited[src] = 1;
        
        if(src==dest)
            resList.add(new ArrayList<>(list));
        
        for(int adj : graph[src]){
            if(visited[adj]==0)
                getPaths(graph, adj, dest, visited, n);
        }
        
        visited[src] = 0;
        
        list.remove(list.size()-1);
    }
}