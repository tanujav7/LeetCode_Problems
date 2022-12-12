class Solution {
    public int largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        int max = 0;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]+nums[i+1]>nums[i+2])
                max = Math.max(max, nums[i] + nums[i+1] + nums[i+2]);
        }
        return max;
    }
}