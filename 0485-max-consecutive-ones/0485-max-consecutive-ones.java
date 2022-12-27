class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int oneCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
            //Reset the count_one to zero to start counting again if at next iteration the array element if one
                oneCount = 0;
            }
            else{
                oneCount++;
                if(oneCount>maxCount)
                maxCount = oneCount;
            }
        }
        
        return maxCount;
    }
}