class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int maxOnes = 0;
        int countZeroes = 0;
        int left = 0;
        
        for(int right=0; right<nums.length; right++){
            countZeroes += (nums[right]==0) ? 1 : 0;
            
            while(countZeroes>k){
                countZeroes -= (nums[left]==0) ? 1 : 0;
                left++;
            }
            
             maxOnes = Math.max(maxOnes, right-left+1);
        }
        
        return maxOnes;
    }
}