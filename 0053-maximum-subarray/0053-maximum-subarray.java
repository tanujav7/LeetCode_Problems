class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(nums[i]>sum)
                sum = nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}