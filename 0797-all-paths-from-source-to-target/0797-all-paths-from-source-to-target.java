class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        resList = new ArrayList<>();
        int src = 0;
        int n = graph.length;
        int dest = graph.length-1;
        
        int visited[] = new int[10005];
        
        dfs(graph, n, src, dest, visited, new ArrayList<>());
        
        return resList;
    }
    
    void dfs(int graph[][], int n, int src, int dest, int visited[], List<Integer> path){
        path.add(src);
        visited[src] = 1;
        
        if(src==dest){
            resList.add(new ArrayList<>(path));
            //return;
        }
        
        for(int ele : graph[src]){
          if(visited[ele]==0)
             dfs(graph, n, ele, dest, visited, path);
        }
               
        
        path.remove(path.size()-1);
        visited[src] = 0;
    }
}