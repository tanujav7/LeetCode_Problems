class Solution {
    public int arraySign(int[] nums) {
        
        int count_negatives = 0;
        
        for(int i=0; i<nums.length; i++){
           if(nums[i]==0)
               return 0;
            
          else if(nums[i]<0)
              count_negatives++;
        }
        
        return (count_negatives%2==0)?1:-1;
    }
}