class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while(left<right){
            int mid = left+(right-left)/2;
            
            if(nums[mid]==target)
               return mid;
            
            else if(nums[mid]<target)
                left = mid + 1;
            
            else
                right = mid;
        }
        
        if(target>nums[nums.length-1])
            return right+1;
        
        return right;
    }
}