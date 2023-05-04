class Solution {
    public int removeElement(int[] nums, int val) {
      
        int left = 0;
        
        //In this left pointer will be pointing to the Non value(val) element whereas right pointer will traverse through the array.
        
         for(int right=0; right<nums.length; right++){
                if(nums[right]!=val){
                    nums[left] = nums[right];
                    left++;
                }
         }
        
        return left;
    }
}