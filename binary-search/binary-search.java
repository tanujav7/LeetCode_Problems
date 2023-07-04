class Solution {
    public int search(int[] nums, int target) {
        
        int res = binarySearch(0,nums.length-1,nums,target);
        return res;
        
    }
     
    int binarySearch(int left, int right, int nums[], int target){
        
        if(left>right)
            return -1;
        
        
        else{
        int mid = left+(right-left)/2;
            
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
               return binarySearch(mid+1, right, nums, target);
            else
                return binarySearch(left, mid-1, nums, target);
            
        }
    }
        
   }
