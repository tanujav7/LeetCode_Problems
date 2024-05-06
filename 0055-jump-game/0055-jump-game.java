class Solution {
    public boolean canJump(int[] nums) {
        
        int reach = 0;
        
        int n = nums.length;
        
        int i=0;
        
        for(i=0; i<n && i<=reach; i++){
            reach = Math.max(reach, nums[i]+i);
        }
        
        return i==n;
    }
}