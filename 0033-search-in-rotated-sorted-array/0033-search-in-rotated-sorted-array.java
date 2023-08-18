class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        
        int res = findKey(nums, 0, n-1, target);
        
        return res;
    }
    
    int binarySearch(int arr[], int low, int high, int target){
        
        if(low>high)
            return -1;
        
        int mid = low+(high-low)/2;
        
        if(arr[mid]==target)
            return mid;
        
        else if(arr[mid]<target)
            return binarySearch(arr, mid+1, high, target);
        
        else
             return binarySearch(arr, low, mid-1, target);
        
     } 
    
    int findPivot(int arr[], int start, int end){
        if(start>end)
            return -1;
        
        int mid = start+(end-start)/2;
        
        if(mid>start && arr[mid-1]>arr[mid])
            return mid;
        
        else if(mid<end && arr[mid+1]<arr[mid])
            return mid+1;
        
        else if(arr[0]<=arr[mid])
            return findPivot(arr, mid+1, end);
        
        else
            return findPivot(arr, start, mid-1);
    }
    
    int findKey(int arr[], int low, int high, int target){
        if(low>high)
            return -1;
        
        int pivot = findPivot(arr, low, high);
        
        if(pivot==-1)
            return binarySearch(arr, low, high, target);
        
        else if(arr[pivot]==target)
            return pivot;
        
        else if(arr[0]<=target)
            return binarySearch(arr, low, pivot-1, target);
        
        else
             return binarySearch(arr, pivot+1, high, target);
    }
}