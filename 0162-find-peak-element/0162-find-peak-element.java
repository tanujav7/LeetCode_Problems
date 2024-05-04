class Solution {
    public int findPeakElement(int[] nums) {
        
        
        int n = nums.length;
        
        if(n==1)
            return 0;
        
        int low = 0;
        int high = n-1;
        
        while(low<high){
            int mid = low + (high-low)/2;
            
            if(mid>low && mid<high && nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid])
                return mid;
            
            else if(nums[mid]<nums[mid+1])
                low = mid+1;
            
            else
                high = mid-1;
        }
        
        return low;
    }
}