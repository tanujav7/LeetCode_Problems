class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i=0; i<numCourses; i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i=0; i<prerequisites.length; i++){
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        
        int visited[] = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            if(visited[i]==0){
                if(isCyclic(adjList, i, numCourses, visited))
                    return false;
            }
        }
        
        return true;
    }
    
    boolean isCyclic(List<List<Integer>> adjList, int u, int numCourses, int visited[]){
        
     if(visited[u]==2)
         return true;
        
        visited[u] = 2;
        
        for(int i=0; i<adjList.get(u).size(); i++){
            int v = adjList.get(u).get(i);
            if(visited[v]!=1 && isCyclic(adjList, v, numCourses, visited))
                return true;  
        }
        
        visited[u] = 1;
        
        return false;
        
    }
}