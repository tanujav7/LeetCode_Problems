class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            int num = nums[i];
            
            if(map.containsKey(num)){
                int index = map.get(num);
                int diff = Math.abs(i-index);
                
                if(diff<=k)
                    return true;
            }
                
                map.put(num, i);
        }
            
            return false;
    }
}