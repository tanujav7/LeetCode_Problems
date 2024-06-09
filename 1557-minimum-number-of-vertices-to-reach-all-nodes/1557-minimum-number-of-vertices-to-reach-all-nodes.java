class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        Set<Integer> set = new HashSet<>();
        
        List<Integer> list = new ArrayList<>();
        
        for(List<Integer> adjList : edges){
            int node = adjList.get(1);
            set.add(node);
        }
        
        
        for(int i=0; i<n; i++){
            if(!set.contains(i))
                list.add(i);
        }
        
        return list;
    }
}