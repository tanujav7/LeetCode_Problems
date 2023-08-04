class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        
        if(n==1)
            return nums[0];
        
        int low = 0;
        int high = n-1;
        
        if(nums[high]!=nums[high-1])
            return nums[high];
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(mid==high || mid==low || (nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]))
                return nums[mid];
            
            
            else if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2!=0 && nums[mid-1]==nums[mid])
                low = mid+1;
            
            else
                high = mid-1;
            
        }
        
        return nums[0];
    }
}