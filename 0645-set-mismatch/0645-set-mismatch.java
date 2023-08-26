class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int duplicate = 0, missing = 0;
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0)
                duplicate = Math.abs(nums[i]);
            else
                nums[index] = -1 * nums[index];
        }
        
        for(int i=0; i<n; i++){
            if(nums[i]>0)
                missing = i+1;
        }
        
        return new int[]{duplicate, missing};
        
        
    }
}