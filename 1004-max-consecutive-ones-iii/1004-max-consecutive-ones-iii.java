class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int zeroCount = 0;
        int left = 0;
        int longestOnes = 0;
        for(int right=0; right<nums.length; right++){
            zeroCount += (nums[right]==0) ? 1 : 0;
            
            while(zeroCount>k){
                zeroCount -= (nums[left]==0) ? 1 : 0;
                left++;
            }
            
            longestOnes = Math.max(longestOnes,right-left+1);
        }
        
        return longestOnes;
    }
}