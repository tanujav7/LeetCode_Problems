class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        
        for(int right=0; right<nums.length; right++){
            sum = sum + nums[right];
            
            while(sum>=target){
                sum -=nums[left];
                minLength = Math.min(minLength, right-left+1);
                left++;
            }
            
        }
        
        return (minLength==Integer.MAX_VALUE) ? 0 : minLength;
    }
}