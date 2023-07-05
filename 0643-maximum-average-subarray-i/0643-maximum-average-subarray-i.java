class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        
        double res = 0;
        
        res = (sum/k);
        
        double temp = 0;
        
        for(int i=k; i<nums.length; i++){
            sum = nums[i] - nums[i-k] + sum;
            temp = (sum/k);
            
            if(temp>res)
                res = temp;
        }
        
        return res;
    }
}