class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int res = findMinimum(nums, 0, n-1);
        
        if(res==-1)
            return nums[0];
        
        return nums[res];
    }
    
    int findMinimum(int arr[], int start, int end){
        if(start>end)
            return -1;
        
        int mid = start+(end-start)/2;
        
        if(mid>start && arr[mid-1]>arr[mid])
            return mid;
        
        else if(mid<end && arr[mid+1]<arr[mid])
            return mid+1;
        
        else if(arr[0]<=arr[mid])
            return findMinimum(arr, mid+1, end);
        
        else
            return findMinimum(arr, start, mid-1);
        
    }
}