class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        
        int carry = 0;
        
        int newDigits[] = new int[n+1];
        
        for(int i=n-1; i>=0; --i){
            int currSum = digits[i] + 1;
            
            if(currSum>9){
                newDigits[i+1] = currSum % 10;
                digits[i] = currSum % 10;
                carry = 1;
            }
            
            else{
                newDigits[i+1] = currSum;
                digits[i] = currSum;
                carry = 0;
                break;
            }
        }
        
        
        if(carry==0)
            return digits;
        
        newDigits[0] = 1;
        
        return newDigits;
    }
    
}