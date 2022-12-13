class Solution {
    public void moveZeroes(int[] nums) {
    
        // In this problem, 'i' will be pointing to non-zero number
        //and 'j' will be pointing to zero.
        
       int n = nums.length;
       int j = 0;
       for(int i=0; i<n; i++){
           if(nums[i]!=0){
           swap(nums,i,j);
           j++;
           }
       }
    }
        static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}