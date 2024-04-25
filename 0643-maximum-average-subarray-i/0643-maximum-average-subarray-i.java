class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double res = 0;
        
        double sum = 0;
        
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        
        res = sum/k;
        
        int n = nums.length;
        
        for(int i=k; i<n; i++){
            sum = sum + nums[i] - nums[i-k];
            res = Math.max(res, sum/k);
        }
        
        return res;
    }
}