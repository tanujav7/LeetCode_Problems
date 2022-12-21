class Solution {
    public int[] twoSum(int[] numbers, int target) {
       //Two pointer initializations
        int left = 0;
        int right = numbers.length-1;
        
        // Result array of size 2
        int res[] = new int[2];
        
        while(left<right){
            
            if(numbers[left]+numbers[right]==target){
                    res[0] = left+1;
                    res[1] = right+1;
                break;
            }
            
            else if(numbers[left]+numbers[right]<target)
                left++;
            
            else
                right--; 
        }
        
        return res;
    }
}