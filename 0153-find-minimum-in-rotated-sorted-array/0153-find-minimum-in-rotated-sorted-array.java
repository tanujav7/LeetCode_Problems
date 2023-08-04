class Solution {
    public int findMin(int[] nums) {
        
        int res = findPivot(nums,0, nums.length-1);
        
        if(res==-1)
            return nums[0];
        
        return nums[res];
        
    }
    
    int findPivot(int arr[], int start, int end){
        
        if(start>end)
            return -1;
        
        int mid = start+(end-start)/2;
        
        if(mid<end && arr[mid]>arr[mid+1])
            return mid+1;
        
        else if(mid>start && arr[mid]<arr[mid-1])
            return mid;
        
        else if(arr[0]<arr[mid])
            return findPivot(arr, mid+1, end);
        
        return findPivot(arr, start, mid-1);
        
    }
}