class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        int maximum_end_here = 0;
        int maximum_so_far = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            
            maximum_end_here = nums[i]+maximum_end_here;
            
            if(nums[i]> maximum_end_here)
                maximum_end_here = nums[i];
            
            if(maximum_end_here>maximum_so_far)
                maximum_so_far = maximum_end_here;
        }
        
        return maximum_so_far;
    }
}