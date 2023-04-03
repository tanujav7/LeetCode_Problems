class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        if(nums[0] <= nums[nums.length-1]) {
            return nums[0];
        }

        int result = findMIN(nums,left,right);
        return result;
    }
    
    int findMIN(int arr[], int start, int end){

        if(start>end)
            return -1;
        
        int n = arr.length;
        int mid = start+(end-start)/2;
        
        if(mid<end && arr[mid]>arr[mid+1])
            return arr[mid+1];
        
        else if(mid>start && arr[mid-1]>arr[mid])
            return arr[mid];
        
        else if(arr[mid]<arr[0])
            return findMIN(arr,start,mid-1);
        
        return findMIN(arr,mid+1,end);
    
    }
}