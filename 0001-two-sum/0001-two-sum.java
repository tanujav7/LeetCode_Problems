class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            int num = nums[i];
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        
        return null;
    }
}