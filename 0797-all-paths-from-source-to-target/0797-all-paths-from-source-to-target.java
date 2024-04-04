class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        resList = new ArrayList<>();
        int n = graph.length;
        boolean visited[] = new boolean[n];
        dfs(graph, new ArrayList<>(), visited, 0, n-1);
        return resList;
    }
    
    void dfs(int graph[][], List<Integer> path, boolean visited[], int src, int dest){
        visited[src] = true;
        path.add(src);
        
        if(src==dest){
            resList.add(new ArrayList<>(path));
            return;
        }
        
        else{
            for(int ele : graph[src]){
                dfs(graph, path, visited, ele, dest);
            
                visited[src] = false;
                path.remove(path.size()-1);
            }
        }
    }
}