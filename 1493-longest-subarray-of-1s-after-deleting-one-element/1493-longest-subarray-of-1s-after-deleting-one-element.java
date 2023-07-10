class Solution {
    public int longestSubarray(int[] nums) {
        
        int left = 0;
        int zeroCount = 0;
        int longestLength = 0;
        
        for(int right = 0; right<nums.length; right++){
            zeroCount +=(nums[right]==0) ? 1 : 0;
            
            if(zeroCount>1){
                zeroCount -=(nums[left]==0) ? 1 : 0;
                left++;
            }
            
            longestLength = Math.max(longestLength, right-left);
        }
        
        return longestLength;
    }
}