class Solution {
    public int[] sortedSquares(int[] nums) {
        
        
        int n = nums.length;
        int i = 0;
        int j = n-1;
        
        int res[] = new int[n];
        int k = n-1;
        
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                res[k--] = nums[i]*nums[i];
                i++;
            }
            else{
                res[k--] = nums[j]*nums[j];
                j--;
            }
        }
        
        return res;
    }
}