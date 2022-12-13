class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        
        /* In this count the total number of negative number 
         If it is divisible by 2 which means it is positive
        If at any point if the element is 0 simply return 0
        Else return -1.*/
        
        for(int i=0; i<nums.length; i++){
               if(nums[i]==0)
                   return 0;
            
                else if(nums[i]<0)
                    count++;
        }
        
       
     return (count%2==0)?1:-1;
    }
}