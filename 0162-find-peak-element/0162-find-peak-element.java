class Solution {
    public int findPeakElement(int[] nums) {
        
        int n = nums.length;
        
        int low = 0, high = n-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(mid-1>=0 && mid+1<n && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])
                return mid;
            
            else if(mid+1<n && nums[mid]<nums[mid+1])
                low = mid+1;
            
            else
                high = mid-1;
        }
        
        return low;
    }
}