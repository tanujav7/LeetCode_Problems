class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        
        int res = findKey(nums, 0, n-1, target);
        
        return res;
    }
    
    int findKey(int arr[], int start, int end, int key){
        
        int pivot = findPivot(arr, start, end);
        
        if(pivot==-1)
            return binarySearch(arr, start, end, key);
        
        if(arr[pivot]==key)
            return pivot;
        
        else if(arr[0]<=key)
            return binarySearch(arr, start, pivot-1, key);
        
        else
            return binarySearch(arr, pivot+1, end, key);
    }
    
    int binarySearch(int arr[], int start, int end, int target){
        
        if(start>end)
            return -1;
        
        int mid = start+(end-start)/2;
        
        if(arr[mid]==target)
            return mid;
        
        else if(arr[mid]<target)
            return binarySearch(arr, mid+1, end, target);
        
        else
            return binarySearch(arr, start, mid-1, target);
        
    }
    
    int findPivot(int arr[], int start, int end){
        
        if(start>end)
            return -1;
        
        int mid = start+(end-start)/2;
        
        if(mid<end && arr[mid+1]<arr[mid])
            return mid+1;
        
        else if(mid>start && arr[mid-1]>arr[mid])
            return mid;
        
        else if(arr[0]<=arr[mid])
            return findPivot(arr, mid+1, end);
        
        return findPivot(arr, start, mid-1);
        
    }
}