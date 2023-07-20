class Solution {
    public int longestSubarray(int[] nums) {
        
        int zeroCount = 0;
        int longestSubarray = 0;
        int n = nums.length;
        int left = 0;
        
        for(int right=0; right<n; right++){
            zeroCount += (nums[right]==0) ? 1 : 0;
            
            while(zeroCount>1){
                zeroCount -= (nums[left]==0) ? 1 : 0;
                left++;
            }
            
            longestSubarray = Math.max(longestSubarray, right-left);
        }
        
        
        return longestSubarray;
        
        
    }
}