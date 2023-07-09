class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        //Two pointers
        int left = 0;
        
        //left will help in shrinking the window
        //right will go through the array
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        
        for(int right = 0; right<nums.length; right++){
            currentSum +=nums[right];
            
           while(currentSum>=target){
                currentSum = currentSum - nums[left];
                minLength = Math.min(minLength, right-left+1);
                left++;
            }
        }
      
        return minLength==Integer.MAX_VALUE ? 0 : minLength;
    }
}