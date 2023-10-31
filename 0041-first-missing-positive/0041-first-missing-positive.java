class Solution {
    public int firstMissingPositive(int[] nums) {
        
        boolean onePresent = false;
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                onePresent = true;
                break;
            }
        }
        
        if(onePresent==false)
            return 1;
        
        for(int i=0; i<n; i++){
            if(nums[i]<=0 || nums[i]>n)
                nums[i] = 1;
        }
        
        for(int i=0; i<n; i++){
            int diff = Math.abs(nums[i])-1;
            nums[diff] = -1 * Math.abs(nums[diff]);
        }
        
        for(int i=0; i<n; i++){
            if(nums[i]>0)
                return i+1;
        }
        
        return n+1;
    }
}