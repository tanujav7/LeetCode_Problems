class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        resList = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int src = 0;
        int dest = graph.length-1;
        path.add(0);
        dfs(graph, src, dest, path);
        return resList;
    }
    
    void dfs(int graph[][], int src, int dest, List<Integer>path){
        if(src==dest){
            resList.add(new ArrayList<>(path));
            return;
        }
        
        else{
            for(int ele : graph[src]){
                path.add(ele);
                dfs(graph, ele, dest, path);
                path.remove(path.size()-1);
            }
        }
    }
}