class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j = 0;
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(nums[i]!=val){
                swap(nums, i, j);
                j++;
            }
        }
        
        return j;
    }
    
    void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}