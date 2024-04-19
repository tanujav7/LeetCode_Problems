class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        
        int pivot = findPivot(nums, 0, n-1);
        
        if(pivot==-1)
            return nums[0];
        
        return nums[pivot];
    }
    
    int findPivot(int nums[], int start, int end){
        if(start>end)
            return -1;
        
        int mid = start + (end - start)/2;
        
        if(mid<end && nums[mid+1]<nums[mid])
            return mid+1;
        
        else if(mid>start && nums[mid-1]>nums[mid])
            return mid;
        
        else if(nums[0]<=nums[mid])
            return findPivot(nums, mid+1, end);
        
        else
            return findPivot(nums, start, mid-1);
    }
}