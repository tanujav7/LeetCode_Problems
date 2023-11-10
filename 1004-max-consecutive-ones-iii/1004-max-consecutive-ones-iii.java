class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int zeroCount = 0;
        int j = 0;
        int n = nums.length;
        int maxLen = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            zeroCount += (nums[i]==0) ? 1 : 0;
            
            while(zeroCount>k){
                zeroCount -= (nums[j]==0) ? 1 : 0;
                j++;
            }
            
            maxLen = Math.max(maxLen, i-j+1);
        }
        
        return maxLen;
    }
}