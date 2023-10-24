class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
         Set<Integer> set = new HashSet<>(map.values());
        
         return set.size()==map.size();
    }
}