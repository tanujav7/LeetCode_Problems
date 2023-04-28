class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 2;
        
        for(int j=2; j<nums.length; j++){

            if(nums[j]!=nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        
        return i;
    }
}