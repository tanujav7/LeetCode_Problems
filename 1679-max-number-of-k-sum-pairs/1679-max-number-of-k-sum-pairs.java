class Solution {
    public int maxOperations(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n-1;
        int count = 0;
        
        while(i<j){
            if(nums[i]+nums[j]==k){
                count++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]<k)
                i++;
            else
                j--;
        }
        
        return count;
    }
}