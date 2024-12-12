class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        return findKey(nums, 0, n-1, target);
    }
    
    int binarySearch(int nums[], int left, int right, int target){
        if(left>right)
            return -1;
        
        int mid = left + (right-left)/2;
        
        if(nums[mid]==target)
            return mid;
        
        else if(nums[mid]<target)
            return binarySearch(nums, mid+1, right, target);
        
        else
            return binarySearch(nums, left, mid-1, target);
    }
    
    int findPivot(int nums[], int start, int end){
        if(start>end)
            return -1;
        
        int mid = start + (end-start)/2;
        
        if(mid+1<=end && nums[mid+1]<nums[mid])
            return mid+1;
        
        if(mid-1>=start && nums[mid-1]>nums[mid])
            return mid;
        
        if(nums[0]<=nums[mid])
            return findPivot(nums, mid+1, end);
            
        else
            return findPivot(nums, start, mid-1);
    }
    
    
    int findKey(int nums[], int left, int right, int target){
        if(left>right)
            return -1;
        
        int pivot = findPivot(nums, left, right);
        
        if(pivot==-1)
            return binarySearch(nums, left, right, target);
        
        if(nums[pivot]==target)
            return pivot;
        
        if(nums[0]<=target)
            return binarySearch(nums, left, pivot, target);
        
        else
            return binarySearch(nums, pivot+1, right, target);
    }
}