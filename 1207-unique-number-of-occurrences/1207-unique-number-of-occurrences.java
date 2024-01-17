class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         Map<Integer, Integer> map = new HashMap<>();
        
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
         Set<Integer> set = new HashSet<>(map.values());
        
        return map.size()==set.size();
    }
}