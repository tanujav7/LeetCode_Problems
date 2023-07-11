class Solution {
    public int pivotIndex(int[] nums) {
        
        int left_sum = 0;
        int sum = 0;
       
        for(int n : nums)
            sum+=n;
        
        for(int i=0; i<nums.length; i++){
            if(left_sum==sum-left_sum-nums[i])
                return i;
            left_sum +=nums[i];
        }
        
        return -1;
    }
}