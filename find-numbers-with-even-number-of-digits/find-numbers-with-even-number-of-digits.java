class Solution {
    public int findNumbers(int[] nums) {
        
        int countEvenDigits = 0;
        
        
        for(int i=0; i<nums.length; i++){

            int num = nums[i];
            int count = 0;
            
            while(num>0){
                count++;
                num = num/10;
            }
        
          if(count%2==0)
              countEvenDigits++;
        
        }
        
        return countEvenDigits;

    }
    
}