class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double res = 0;
        int sum = 0;
        
        for(int i=0; i<k; i++)
            sum+=nums[i];
        
        res = sum;
        
        for(int i=k; i<nums.length; i++){
            sum = sum-nums[i-k]+nums[i];
            res = Math.max(sum,res);
        }
        
        return res/k;
    }
}