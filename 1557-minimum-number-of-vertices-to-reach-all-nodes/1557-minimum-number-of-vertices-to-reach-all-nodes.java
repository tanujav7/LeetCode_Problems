class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        List<Integer> list = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        
        for(List<Integer> edge : edges){
            int n1 = edge.get(0);
            int n2 = edge.get(1);
            
            if(!set.contains(n2)){
                set.add(n2);
            }
                
        }
        
        
        for(int i=0; i<n; i++){
            if(!set.contains(i))
                list.add(i);
        }
        
        return list;
    }
}