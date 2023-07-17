class Solution {
    public int search(int[] nums, int target) {
        
        int res = binarySearch(nums, 0, nums.length-1, target);
        return res;
    }
    
    int binarySearch(int arr[], int left, int right, int target){
        
        if(left>right)
            return -1;
        
        int mid = left+(right-left)/2;
        
        if(arr[mid]==target)
            return mid;
        
        else if(arr[mid]>target)
            return binarySearch(arr, left, mid-1, target);
        
        else
             return binarySearch(arr, mid+1, right, target);
        
    }
}