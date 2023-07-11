class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxConsecutiveOnes = 0;
        
        for(int right = 0; right<nums.length; right++){
            zeroCount +=(nums[right]==0) ? 1 : 0;
            
            if(zeroCount>k){
                zeroCount -=(nums[left]==0) ? 1 : 0;
                left++;
            }
            
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, right-left+1);
        }
        
        return maxConsecutiveOnes;
    }
}