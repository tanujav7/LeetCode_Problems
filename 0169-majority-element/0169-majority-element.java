class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int majorityElement = nums[n/2];
        
        int countMajor = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==majorityElement)
                countMajor++;
        }
        
        
        if(countMajor>(n/2))
            return majorityElement;
        
        return -1;
    }
}