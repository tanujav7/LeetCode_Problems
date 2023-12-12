class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int n1 = nums[n-1];
        int n2 = nums[n-2];
        
        
        return (n1-1) * (n2-1);
    }
}