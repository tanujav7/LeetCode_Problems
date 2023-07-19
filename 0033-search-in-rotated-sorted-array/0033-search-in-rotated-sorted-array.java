class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int res = findKey(nums, 0, n-1, target);
        return res;
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
            return binarySearch(arr, start, mid-1,target);
        
    }
    
    int findPivot(int nums[], int start, int end) {
        
         if(start>end)
            return -1;
        
        int mid = start+(end-start)/2;
        
            if(mid<end && nums[mid]>nums[mid+1])
                return mid+1;
            
            else if(mid>start && nums[mid-1]>nums[mid])
                return mid;
            
            else if(nums[0]<nums[mid])
                return findPivot(nums, mid+1, end);
                
            else
                return findPivot(nums, start, mid-1);
               
        }
    
    int findKey(int arr[], int start, int end, int target){
        if(start>end)
            return -1;
        
        int pivot = findPivot(arr, start, end);
        
        if(pivot==-1)
            return binarySearch(arr, start, end, target);
        
        if(arr[pivot]==target)
            return pivot;
        
        
        else if(arr[0]<=target)
            return binarySearch(arr, start, pivot-1, target);
        
        else
            return binarySearch(arr, pivot+1, end, target);
    }
        
        
    }
    
    
