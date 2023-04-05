class Solution {
    public int maxProduct(int[] nums) {
        
        int maxVal = nums[0];
        int minVal = nums[0];
        int maxProduct = nums[0];
        
        for(int i=1; i<nums.length; i++){
            //We know that minimum negative is stored in minVal. -*-=+
            if(nums[i]<0){
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }
    //We always compare whether the current number is greater or lesser than that of maxVal and minVal.
            maxVal = Math.max(nums[i], maxVal*nums[i]);
            minVal = Math.min(nums[i], minVal*nums[i]);
            
            maxProduct = Math.max(maxProduct, maxVal);
        }
        
        return maxProduct;
    }
}