class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        resList = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, path, 0, graph.length-1);
        return resList;
    }
    
    void dfs(int graph[][], List<Integer> path, int src, int dest){
        if(src==dest){
            resList.add(new ArrayList<>(path));
            return;
        }
        
        else{
            
            for(int ele : graph[src]){
                path.add(ele);
                dfs(graph, path, ele, dest);
                path.remove(path.size()-1);
            }
            
        }
    }
}