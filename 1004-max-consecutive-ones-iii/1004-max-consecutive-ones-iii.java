class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int j = 0;
        
        int n = nums.length;
        
        int countZeros = 0;
        
        int maxLen = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            countZeros += (nums[i]==0) ? 1 : 0;
            
            while(countZeros>k){
                countZeros -= (nums[j]==0) ? 1 : 0;
                j++;
            }
             maxLen = Math.max(maxLen, i-j+1);
        }
        
        return maxLen;
    }
}