class Solution {
    public int findPeakElement(int[] nums) {
        
        int n = nums.length;
        int left = 0, right = n-1;
        
        
        if(n==1)
            return 0;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(mid-1>=0 && mid+1<n && nums[mid]>=nums[mid-1] && nums[mid]>=nums[mid+1])
                return mid;
            
            else if(mid+1<n && nums[mid]<nums[mid+1])
                left = mid+1;
            
            else
                right = mid-1;
            
        }
        
        return left;
    }
}