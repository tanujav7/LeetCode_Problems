class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = nums.length;
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            
            if(!map.containsKey(sum%k))
                map.put(sum%k, i);
            
            else if(i-map.get(sum%k)>=2)
                return true;
            
        }
        
        return false;
    }
}