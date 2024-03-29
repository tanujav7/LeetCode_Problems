class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        int n = rooms.size();
        
        boolean visited[] = new boolean[n];
        
        queue.add(0);
        
        visited[0] = true;
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            
            for(int ele : rooms.get(node)){
                if(visited[ele]==false){
                    queue.add(ele);
                    visited[ele] = true;
                }
            }
        }
        
        
        for(boolean v : visited){
            if(v==false)
                return false;
        }
        
        return true;
    }
}