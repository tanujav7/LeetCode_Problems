class Solution {
    List<List<Integer>> resList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int len = graph.length;
        List<Integer> path = new ArrayList<>();
        resList = new ArrayList<>();
        boolean visited[] = new boolean[len];
        dfs(graph, 0, len-1, visited, path);
        return resList;
    }
      void dfs(int graph[][], int src, int dest, boolean visited[], List<Integer> path) {
        visited[src] = true;
        path.add(src);

        if (src == dest) {
            resList.add(new ArrayList<>(path));
        }

        for (int ele : graph[src]) {
            if (!visited[ele]) 
                dfs(graph, ele, dest, visited, path);
        }

        path.remove(path.size() - 1);
        visited[src] = false;
    }
}
