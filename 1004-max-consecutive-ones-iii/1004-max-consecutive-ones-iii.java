class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_ones = 0;
        int zero_count = 0;
        int left = 0;
        
        for(int right=0; right<nums.length; right++){
            zero_count += (nums[right]==0) ? 1 : 0;
            while(zero_count>k){
                zero_count -= (nums[left]==0) ? 1 : 0;
                left++;
            }
            
            max_ones = Math.max(max_ones, right-left+1);
        }
        
        return max_ones;
    }
}