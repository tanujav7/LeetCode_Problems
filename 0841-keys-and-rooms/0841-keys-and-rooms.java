class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(0);
        
        int n = rooms.size();
        
        boolean visited[] = new boolean[n];
        
        visited[0] = true;
        
        while(!queue.isEmpty()){
            int node = queue.remove();
            for(int ele : rooms.get(node)){
                if(visited[ele]==false){
                    visited[ele] = true;
                    queue.add(ele);
                }
            }
        }
        
        
        for(boolean vis : visited){
            if(vis==false)
                return false;
        }
        
        return true;
    }
}