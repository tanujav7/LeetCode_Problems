class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        resList = new ArrayList<>();
        int src = 0;
        int n = graph.length;
        int dest = graph.length-1;
        
        
        List<Integer> path = new ArrayList<>();
        
        path.add(0);
        
        dfs(graph, n, src, dest, path);
        
        return resList;
    }
    
    void dfs(int graph[][], int n, int src, int dest, List<Integer> path){

        if(src==dest){
            resList.add(new ArrayList<>(path));
        }
        
        for(int ele : graph[src]){
             path.add(ele);
             dfs(graph, n, ele, dest, path);
             path.remove(path.size()-1);
        }
     
        
    }
}