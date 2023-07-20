class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if(k<=1)
            return 0;
        
        int product = 1;
        int left = 0;
        int res = 0;
        
        for(int right=0; right<nums.length; right++){
            product = product*nums[right];
            
            while(product>=k){
                product = product/nums[left++];
            }
            
            res +=right-left+1;
        }
        
        return res;
    }
}