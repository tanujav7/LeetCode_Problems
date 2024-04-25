class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;
        
        int sum = 0, subArray = Integer.MAX_VALUE;
        
        int j = 0;
        
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            
            while(sum>=target){
                sum = sum - nums[j];
                subArray = Math.min(subArray, i-j+1);
                j++;
            }
        }
        
       return subArray==Integer.MAX_VALUE ? 0 : subArray;
    }
}