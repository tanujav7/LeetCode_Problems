class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;
        
        for(int right=0; right<nums.length; right++){
            if(nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
        }
    }
    
    void swap(int arr[], int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}