class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int longest = 0;
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                longest = Math.max(longest,count);
                count = 0;
            }
            else{
                count++;
            }
        }
        
        return Math.max(longest,count);
    }
}