class Solution {
    public int longestSubarray(int[] nums) {
        
        int max_subarray = 0;
        int zero_count = 0;
        int left = 0;
        
        for(int right=0; right<nums.length; right++){
            zero_count += (nums[right]==0) ? 1 : 0;
            if(zero_count>1){
                zero_count -= (nums[left]==0) ? 1 : 0;
                left++;
            }
            
            max_subarray = Math.max(max_subarray, right-left);
        }
        
        return max_subarray;
    }
}