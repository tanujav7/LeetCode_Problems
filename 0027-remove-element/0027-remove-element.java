class Solution {
    public int removeElement(int[] nums, int val) {
        
        int n = nums.length;
        
        int i = 0;
        
        for(int j=0; j<n; j++){
            if(nums[j]!=val){
                swap(nums, i, j);
                i++;
            }
        }
        
        return i;
    }
    
    void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}