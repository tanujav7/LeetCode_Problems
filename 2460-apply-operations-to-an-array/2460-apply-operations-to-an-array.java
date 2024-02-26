class Solution {
    public int[] applyOperations(int[] nums) {
        
        int n = nums.length;
        
        int arr[] = new int[n];
        
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        
        int i=0, j=0;
        
        for(i=0; i<nums.length; i++){
            if(nums[i]!=0){
                swap(nums, i, j);
                j++;
            }
        }
        
        return nums;
    }
    
     void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}