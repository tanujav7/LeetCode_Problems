class Solution {
    public boolean isMonotonic(int[] nums) {
        
        boolean increasing = true;
        boolean decreasing = true;
        
        int n = nums.length;
        
        for(int i=1; i<n; i++){
            if(nums[i-1]>nums[i])
                increasing = false;
        }
        
        for(int i=n-1; i>0; --i){
            if(nums[i]>nums[i-1])
                decreasing = false;
        }
        
        return (increasing || decreasing);
    }
}