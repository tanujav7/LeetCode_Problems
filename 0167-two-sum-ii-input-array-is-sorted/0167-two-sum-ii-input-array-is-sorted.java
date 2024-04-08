class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i = 0, j = nums.length-1;
        
        while(i<j){
            if(nums[i]+nums[j]<target)
               i++;
            else if(nums[i]+nums[j]>target)
                j--;
            else
                return new int[]{i+1, j+1};
        }
        
        return null;
    }
}