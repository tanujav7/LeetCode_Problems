class Solution {
    public int majorityElement(int[] nums) {
        
        //Moore's Voting Algorithms
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int midIndex = n/2;
        
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==nums[midIndex])
                count++;
        }
        
        if(count>midIndex)
            return nums[midIndex];
        
        
        return nums[0];
    }
}