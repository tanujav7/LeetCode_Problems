class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int sum = 0;
        int minSubArray = Integer.MAX_VALUE;
        
        
        for(int right=0; right<nums.length; right++){
            sum = sum + nums[right];
            
            while(sum>=target){
                sum = sum - nums[left];
                minSubArray = Math.min(minSubArray,right-left+1);
                left++;
            }
            
        }
        
        
        return (minSubArray == Integer.MAX_VALUE) ? 0 : minSubArray;
    }
}