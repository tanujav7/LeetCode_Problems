class Solution {
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        int n = graph.length;
        
        int src = 0;
        
        int dest = n-1;
        
        int visited[] = new int[100001];
        
        dfs(graph, src, dest, visited, n, new ArrayList<>());
        
        return resList;
    }
    
    void dfs(int graph[][], int src, int dest, int visited[], int n, List<Integer> list){
        
        visited[src] = 1;
        list.add(src);
        
        if(src==dest){
            resList.add(new ArrayList<>(list));
        }
        
        for(int ele : graph[src]){
            if(visited[ele]==0){
                dfs(graph, ele, dest, visited, n, list);
            }
        }
        
        visited[src] = 0;
        list.remove(list.size()-1);
    }
}