class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        //Two pointers
        int left = 0;
        
        //left will help in shrinking the window
        //right will go through the array
       
        int currentWindowSum = 0;
        int res = Integer.MAX_VALUE;
        
        for(int right = 0; right<nums.length; right++){
            currentWindowSum +=nums[right];
            
            while(currentWindowSum>=target){
                currentWindowSum = currentWindowSum - nums[left];
                res = Math.min(res,right-left+1);
                left++;
            }
        }
        
        return res==Integer.MAX_VALUE ? 0 : res;
    }
}