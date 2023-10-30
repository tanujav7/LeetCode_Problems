class Solution {
    public boolean isMonotonic(int[] nums) {
        
        return (isIncreasing(nums)) || (isDecreasing(nums));
        
    }
    
    boolean isIncreasing(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1])
                return false;
        }
        
        return true;
    }
    
     boolean isDecreasing(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1])
                return false;
        }
        
        return true;
    }
}