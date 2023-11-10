class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int j = 0;
        int n = nums.length;
        int maxLen = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            zeroCount += (nums[i]==0) ? 1 : 0;
            
            while(zeroCount>1){
                zeroCount -= (nums[j]==0) ? 1 : 0;
                j++;
            }
            
            maxLen = Math.max(maxLen, i-j);
        }
        
        return maxLen;
    }
}