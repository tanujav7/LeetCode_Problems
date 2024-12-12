class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int res = findPivot(nums, 0, n-1);
        
        if(res==-1)
            return nums[0];
        
        return res;
    }
    
    int findPivot(int nums[], int start, int end){
        if(start>end)
            return -1;
        
        int mid = start + (end-start)/2;
        
        if(mid-1>=0 && nums[mid]<nums[mid-1])
            return nums[mid];
        
        else if(mid+1<=end && nums[mid+1]<nums[mid])
            return nums[mid+1];
        
        if(nums[0]<=nums[mid])
            return findPivot(nums, mid+1, end);
        
        else
            return findPivot(nums, start, mid-1);
        
    }
    
}