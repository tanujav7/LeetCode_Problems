class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        resList = new ArrayList<>();
        int n = graph.length;
        int src = 0;
        int dest = n-1;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        
        getPaths(graph, src, dest, path);
        return resList;
    }
    
    void getPaths(int graph[][], int src, int dest, List<Integer> path){
       
        if(src==dest){
            resList.add(new ArrayList<>(path));
            return;
        }
        
        else{
              for(int ele : graph[src]){
                  path.add(ele);
                  getPaths(graph, ele, dest, path);
                  path.remove(path.size()-1);
              }
        }
       
    }
}