class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
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