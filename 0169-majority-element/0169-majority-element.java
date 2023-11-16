class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        
        int countMajority = 0;
        
        Arrays.sort(nums);
        
       int majorityElement = nums[n/2];
        
        for(int i=0; i<n; i++){
            if(nums[i]==majorityElement)
                countMajority++;
        }
        
        if(countMajority>n/2)
            return majorityElement;
        
        return nums[0];
    }
}