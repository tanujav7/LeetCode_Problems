class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        int n = nums.length;
        
        for(int i=0; i<k; i++)
            sum = sum + nums[i];
        
        double avg = sum/k;
        
        for(int i=k; i<n; i++){
            sum = sum + nums[i] - nums[i-k];
            if((sum/k)>avg)
                avg = sum/k;
        }
        
        return avg;
        
    }
}