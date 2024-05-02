class Solution {
    public int findMaxK(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int k : nums)
            set.add(k);
        
        int maxVal = -1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>maxVal && set.contains(-1*nums[i])){
                maxVal = nums[i];
            }
        }
        
        return maxVal;
    }
}