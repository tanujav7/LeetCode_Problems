class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(mid<end && nums[mid]>nums[mid+1])
                return nums[mid+1];
            
            else if(mid>start && nums[mid-1]>nums[mid])
                return nums[mid];
            
            else if(nums[0]<nums[mid])
                start = mid+1;
                
            else
                end = mid-1;
               
        }
        
        return nums[0];
        
    }
}