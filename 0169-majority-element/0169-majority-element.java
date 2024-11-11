class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        
        int count = 0, majorityElement = nums[0];
        
        for(int num : nums){
            if(count==0){
               majorityElement = num;
            }
            
            if(num==majorityElement)
                count++;
            
            else
                count--;
        }
        
        return majorityElement;
    }
}