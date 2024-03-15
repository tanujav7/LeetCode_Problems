class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int res[] = new int[n];
        res[0] = nums[0];
        
        for(int i=1; i<n; i++)
            res[i] = nums[i]*res[i-1];
        
        int product = nums[n-1];
        res[n-1] = res[n-2];
        
        for(int i=n-2; i>0; --i){

            res[i] = product*res[i-1];
            product = product*nums[i];
            
        }
        
        res[0] = product;
        
        return res;
    }
}