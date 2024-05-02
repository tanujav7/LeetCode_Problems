class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        return findKey(nums, 0, n-1, target);
    }
    
    int binarySearch(int nums[], int low, int high, int target){
        if(low>high)
            return -1;
        
        int mid = low+(high-low)/2;
        
        if(nums[mid]==target)
            return mid;

        else if(nums[mid]>target)
            return binarySearch(nums, low, mid-1, target);
        
        else
             return binarySearch(nums, mid+1, high, target);
    }
    
    
    int findPivot(int nums[], int start, int end){
        if(start>end)
            return -1;
        
        int mid = start + (end-start)/2;
        
        if(mid>start && nums[mid]<nums[mid-1])
            return mid;
        
        if(mid<end && nums[mid+1]<nums[mid])
            return mid+1;
        
        if(nums[0]<=nums[mid])
            return findPivot(nums, mid+1, end);
        
        else
            return findPivot(nums, start, mid-1);
    }
    
    
    int findKey(int nums[], int start, int end, int target){
        if(start>end)
            return -1;
        
        int pivot = findPivot(nums, start, end);
        
        if(pivot==-1)
            return binarySearch(nums, start, end, target);
        
        if(nums[pivot]==target)
            return pivot;
        
        if(nums[0]<=target)
            return binarySearch(nums, start, pivot, target);
        
        else
            return binarySearch(nums, pivot+1, end, target);
    }
}