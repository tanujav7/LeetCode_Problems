class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                if(Math.abs(i-index)<=k)
                    return true;
                map.put(nums[i], i);
            }
            
            else{
                map.put(nums[i], i);
            }
        }
        
        return false;
    }
}