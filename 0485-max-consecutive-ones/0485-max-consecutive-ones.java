class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int longestOnes = 0;
        int n = nums.length;
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==1)
                count++;
            else{
                longestOnes = Math.max(longestOnes, count);
                count = 0;
            }
        }
        
        return Math.max(longestOnes, count);
    }
}