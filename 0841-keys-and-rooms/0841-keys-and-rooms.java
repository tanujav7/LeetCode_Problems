class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        
        int n = rooms.size();
        
        int visited[] = new int[n];
        visited[0] = 1;
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            for(int adj:rooms.get(node)){
                if(visited[adj]==0){
                    visited[adj] = 1;
                    queue.add(adj);
                }
            }
        }
        
        for(int visit:visited){
            if(visit==0)
                return false;
        }
        
        return true;
    }
}