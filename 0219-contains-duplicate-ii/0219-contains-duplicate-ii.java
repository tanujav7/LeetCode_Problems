class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i]))
            map.put(nums[i], i);
            
            else{
                int index = map.get(nums[i]);
                int res = Math.abs(i-index);
                if(res<=k)
                    return true;
                map.put(nums[i], i);
            }
            
        }
        
        return false;
    }
}