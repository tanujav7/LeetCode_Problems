class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int size = rooms.size();
        boolean visited[] = new boolean[size];
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(0);
        
        visited[0] = true;
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            for(int adj : rooms.get(node)){
                if(visited[adj]==false){
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
        
        
        for(boolean pointer : visited){
            if(pointer==false)
                return false;
        }
        
        return true;
    }
}