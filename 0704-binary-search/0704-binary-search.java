class Solution {
    public int search(int[] nums, int target) {
        
       int left = 0;
       int right = nums.length-1;
       return binarySearch_Recursive(nums,left,right,target);
    }

    int binarySearch_Recursive(int nums[], int left, int right, int target){
      if(left>right)
         return -1;

      else{
        int mid = left+(right-left)/2;

        if(nums[mid]<target)
        return binarySearch_Recursive(nums, mid+1,right,target);
      
        else if(nums[mid]>target)
        return binarySearch_Recursive(nums,left, mid-1,target);

        else
         return mid;
      }
    }
}