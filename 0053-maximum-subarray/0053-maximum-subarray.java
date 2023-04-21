class Solution {
    public int maxSubArray(int[] nums) {
      //Kadane's Algorithm
        
        int maximum_ending_here = 0;
        int maximum_so_far = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){

            maximum_ending_here = maximum_ending_here+nums[i];
            
            if(nums[i]>maximum_ending_here)
                maximum_ending_here = nums[i];
            
            if(maximum_ending_here>maximum_so_far)
                maximum_so_far = maximum_ending_here;
        }
        
        return maximum_so_far;
    }
}