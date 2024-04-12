class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        
        int res = binarySearch(nums, 0, n-1, target);
        
        return res;
    }
    
    int binarySearch(int nums[], int low, int high, int target){
        if(low>high)
            return -1;
        
        int mid = low+(high-low)/2;
        
        if(nums[mid]==target)
            return mid;
        
        else if(nums[mid]<target)
            return binarySearch(nums, mid+1, high, target);
        
        return binarySearch(nums, low, mid-1, target);
    }
}