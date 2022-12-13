class Solution {
    public int[] productExceptSelf(int[] nums) {
              int product = nums[nums.length-1];
        int res[] = nums.clone();
        //Left traversal
        
        for(int i=1; i<nums.length; i++){
            res[i] = res[i]*res[i-1];
        }
        
  
        res[nums.length-1] = res[nums.length-2];
        
        // Right traversal
        for(int i=res.length-2; i>0; --i){
            res[i] = res[i-1]*product;
                product = product*nums[i];
        }
        
        res[0] = product;
        return res;
    }
}