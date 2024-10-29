class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int majorityElement = nums[n/2];
        
        int countMajority = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==majorityElement)
                countMajority++;
        }
        
        if(countMajority>(n/2))
            return majorityElement;
        
        return 0;
        
    }
}