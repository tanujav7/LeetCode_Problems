class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min_subarray = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        int left = 0;
        
        for(int right=0; right<n; right++){
            sum += nums[right];
            
            while(sum>=target){
                sum -= nums[left];
                min_subarray = Math.min(min_subarray, right-left+1);
                left++;
            }
            
        }
        
        return (min_subarray == Integer.MAX_VALUE) ? 0 : min_subarray; 
    }
}