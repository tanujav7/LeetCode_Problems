class Solution {
    public int findMin(int[] nums) {
        
        int n = nums.length;
       int res = findMin(nums, 0, n-1);
        
        if(res==-1)
            return nums[0];
        
        else
            return res;
    }
    
    int findMin(int nums[], int start, int end){
        if(start>end)
            return -1;
        
        int mid = start + (end-start)/2;
        
        if(mid<end && nums[mid]>nums[mid+1])
            return nums[mid+1];
        
        else if(mid>start && nums[mid-1]>nums[mid])
            return nums[mid];
        
        else if(nums[0]<=nums[mid])
            return findMin(nums, mid+1, end);
        
        else
            return findMin(nums, start, mid-1);
        
    }
}