class Solution {
    public int findPeakElement(int[] nums) {
        
        int n = nums.length;
        
        if(n==1)
            return 0;
        
        int left = 0;
        int right = n-1;
        
        while(left<right){
            
            int mid = left+(right-left)/2;
            
            if(mid>left && nums[mid]>nums[mid-1] && mid<right && nums[mid]>nums[mid+1])
                return mid;
            
            else if(nums[mid]<nums[mid+1])
                left = mid+1;
            
            else
                right = mid-1;
            
        }
        
        return left;
    }
}