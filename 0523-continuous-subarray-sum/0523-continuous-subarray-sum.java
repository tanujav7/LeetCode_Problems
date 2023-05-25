class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>(Map.of(0, 0));
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum+=nums[i];
            
            if(!map.containsKey(sum%k))
                map.put(sum%k, i+1);
            
            else if(map.get(sum%k) < i)
                return true;
        }
        
        return false;
    }
}