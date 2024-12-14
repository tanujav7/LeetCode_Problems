class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        return findKey(nums, 0, n-1, target);
    }
    
    int binarySearch(int nums[], int low, int high, int target){
        if(low>high)
            return -1;
        
        int mid = low + (high-low)/2;
        
        if(nums[mid]==target){
            return mid;
        }
        
        else if(nums[mid]<target){
            return binarySearch(nums, mid+1, high, target);
        }
        
        else
            return binarySearch(nums, low, mid-1, target);
    }
    
    int findPivot(int nums[], int start, int end){
        if(start>end)
            return -1;
        
        int mid = start + (end-start)/2;
        
        if(mid+1<end && nums[mid]>nums[mid+1])
            return mid+1;
        
        else if(mid-1>=0 && nums[mid]<nums[mid-1])
            return mid;
        
        else if(nums[0]<=nums[mid])
            return findPivot(nums, mid+1, end);
        
        else
            return findPivot(nums, start, mid-1);
    }
    int findKey(int nums[], int low, int high, int target){
        if(low>high)
            return -1;
        
        int pivot = findPivot(nums, low, high);
        
        if(pivot==-1)
            return binarySearch(nums, low, high, target);
        
        if(nums[pivot]==target)
            return pivot;
        
        if(nums[0]<=target){
            return binarySearch(nums, low, pivot-1, target);
        }
        
        else{
            return binarySearch(nums, pivot+1, high, target);
        }
    }
}