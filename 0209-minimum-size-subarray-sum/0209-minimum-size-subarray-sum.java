class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min_subarray = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        
        for(int right=0; right<nums.length; right++){
            sum = sum + nums[right];
            while(sum>=target){
                min_subarray = Math.min(min_subarray, right-left+1);
                sum = sum - nums[left++];
            }
        }
        
        return (min_subarray == Integer.MAX_VALUE) ? 0 : min_subarray;
    }
}