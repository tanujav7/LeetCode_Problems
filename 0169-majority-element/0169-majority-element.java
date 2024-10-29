class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int midElement = (n/2);
        
        int countMid = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==nums[midElement])
                countMid++;
        }
        
        if(countMid>=n/2)
            return nums[midElement];
        
        return 0;
    }
}