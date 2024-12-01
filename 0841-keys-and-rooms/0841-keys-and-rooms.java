class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(0);
        
        int size = rooms.size();
        
        int visited[] = new int[size];
        
        visited[0] = 1;
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            for(int adj : rooms.get(node)){
                if(visited[adj]==0){
                    queue.add(adj);
                    visited[adj] = 1;
                }
                
            }
        }
        
        for(int visit : visited){
            if(visit==0)
             return false;
        }
        
        return true;
    }
}