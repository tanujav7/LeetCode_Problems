class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        resList = new ArrayList<>();
        int n = graph.length;
        int src = 0;
        int dest = n-1;
        
        boolean visited[] = new boolean[n];
        
        getPaths(graph, src, dest, visited, new ArrayList<>());
        return resList;
    }
    
    void getPaths(int graph[][], int src, int dest, boolean visited[], List<Integer> path){
        visited[src] = true;
        path.add(src);
        
        if(src==dest){
            resList.add(new ArrayList<>(path));
        }
        
        for(int ele : graph[src]){
            if(!visited[ele]){
                getPaths(graph, ele, dest, visited, path);
            }
        }
        
        visited[src] = false;
        path.remove(path.size()-1);
    }
}