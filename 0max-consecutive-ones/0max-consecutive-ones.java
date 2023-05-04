class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      
        int countOnes = 0;
        int maxCount = 0;
        
        for(int i=0; i<nums.length; i++){

            if(nums[i]==1)
                countOnes++;
            
            else {
                maxCount = Math.max(countOnes, maxCount);
                countOnes = 0;
            }
        }
        
        return Math.max(maxCount,countOnes);

    }
}