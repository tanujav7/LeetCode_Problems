class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0;
        int right = nums.length-1;
        int n = nums.length;
        
        int res[] = new int[n];
        int k = n-1;
        
        while(left<=right){

            if(nums[left]*nums[left]<nums[right]*nums[right]){
                    res[k--] = nums[right]*nums[right];
                    right--;
            }
        
            else{
                res[k--] = nums[left]*nums[left];
                left++;
            }
        }
        
        return res;
    }
}