class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length;
        int left = 0;
        int right = n-1;
        
        if(n==1)
            return nums[0];
        
        if(nums[right]!=nums[right-1])
            return nums[right];
        
        while(left<=right){
            
            int mid = left+(right-left)/2;
            
            if(mid==right || mid==left  ||( nums[mid]!=nums[mid+1] && mid>=left && nums[mid]!=nums[mid-1]))
                return nums[mid];
            
            else if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2!=0 && nums[mid-1]==nums[mid])
                left = mid+1;
            
            else
                right = mid-1;
            
        }
        
        return nums[0];
    }
}