class Solution {
    public int missingNumber(int[] nums) {
        long sum = 0;
        int n = nums.length;
        long total = n*(n+1)/2;
        
        for(int i=0; i<n; i++)
            sum+=nums[i];
        
        return (int)(total-sum);
    }
}