class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
       return findKey(nums, 0, n-1, target);
    }
    
    int binarySearch(int nums[], int low, int high, int target){
        if(low>high)
            return -1;
        
        int mid = low + (high-low)/2;
        
        if(nums[mid]==target)
            return mid;
        
        else if(nums[mid]<target)
           return binarySearch(nums, mid+1, high, target);
        
        else
           return binarySearch(nums, low, mid-1, target);
    }
    
    
    int findPivot(int arr[], int start, int end){
        
        if(start>end)
            return -1;
        
        int mid = start + (end-start)/2;
        
        if(mid>start && arr[mid-1]>arr[mid])
            return mid;
        
        else if(mid<end && arr[mid+1]<arr[mid])
            return mid+1;
        
        else if(arr[0]<=arr[mid])
            return findPivot(arr, mid+1, end);
        
        return findPivot(arr, start, mid-1);
    }
    
    
    int findKey(int nums[], int low, int high, int target){
        if(low>high)
            return -1;
        
        int pivot = findPivot(nums, low, high);
        
        if(pivot==-1)
            return binarySearch(nums, low, high, target);
        
        if(nums[pivot]==target)
            return pivot;
        
       
        
        if(nums[0]<=target)
            return findKey(nums, low, pivot-1, target);
        
        return findKey(nums, pivot+1, high, target);
    }
}