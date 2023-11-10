class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int minSubarray = Integer.MAX_VALUE;
        int j = 0;
        
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            
            while(sum>=target){
                minSubarray = Math.min(minSubarray, i-j+1);
                sum -= nums[j];
                j++;
            }
        }
        
        
        
        
        return (minSubarray == Integer.MAX_VALUE) ? 0 : minSubarray;
    }
}