class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int j = 0;
        int n = nums.length;
        
        int sum = 0, minSubarray = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            
            while(sum>=target){
                sum = sum - nums[j];
                minSubarray = Math.min(minSubarray, i-j+1);
                j++;
            }
        }
        
        return minSubarray == Integer.MAX_VALUE ? 0 : minSubarray;
    }
}