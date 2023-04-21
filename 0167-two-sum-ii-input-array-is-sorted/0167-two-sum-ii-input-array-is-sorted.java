class Solution {
    public int[] twoSum(int[] numbers, int target) {
       
        //Two pointers initialization
  
        int left = 0;
        int right = numbers.length-1;
        
        while(left<right){

            if(numbers[left]+numbers[right]<target)
                left++;
            
            else if(numbers[left]+numbers[right]>target)
                right--;
            
            else
                return new int[] {left+1,right+1};

        }
        
        return null;
    }
}