class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }
        
        Set<Integer> set = new HashSet<>(map.values());
        
        return set.size()==map.size();
        
    }
}