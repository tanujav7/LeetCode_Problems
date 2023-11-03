class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        
        for(int i=0; i<n; i++)
            sum = sum + nums[i];
        
        int leftSum = 0;
        
        for(int i=0; i<n; i++){
            if(leftSum==sum-nums[i]-leftSum)
                return i;
            leftSum += nums[i];
        }
        
        return -1;
        
    }
}