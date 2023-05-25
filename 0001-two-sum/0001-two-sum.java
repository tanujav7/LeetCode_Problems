class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++)
            map.put(nums[i],i);
        
        
        for(int i=0; i<n; i++){

            int diff = target-nums[i];
            
            if(map.containsKey(diff) && map.get(diff)!=i)
                return new int[] {i,map.get(diff)};
            
        }
        
        return null;
    }
}