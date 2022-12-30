class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
	   int max_Length = 1;
	   int current_Length = 1;
	   for(int i=1; i<nums.length; i++){
	      
	      
	        if(nums[i]>nums[i-1]){
	           current_Length++;
	        }
	      
	      else{
	            current_Length = 1;
	      }
	       max_Length = Math.max(max_Length, current_Length);
	       
	   }
	   
	   return max_Length;
    }
}