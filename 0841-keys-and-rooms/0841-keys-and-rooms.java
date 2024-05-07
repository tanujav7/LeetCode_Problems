class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adjList) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(0);
        
        int visited[] = new int[adjList.size()];
        
        visited[0] = 1;
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            
            for(int ele : adjList.get(node)){
                if(visited[ele]==0){
                    visited[ele] = 1;
                    queue.add(ele);
                }
            }
        }
        
        
        for(int k : visited){
            if(k==0)
                return false;
        }
        
        return true;
    }
}