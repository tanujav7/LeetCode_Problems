class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int res[] = new int[n];
        
        int j = 0; 
        int k = n-1;
        
        for(int i=0; i<n; i++){
            if(nums[i]%2==0)
                res[j++] = nums[i];
            else
                res[k--] = nums[i];
        }
        
        return res;
    }
}