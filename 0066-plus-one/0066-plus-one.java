class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        int newDigits[] = new int[n+1];
        
        int carry = 0;
        for(int i=n-1; i>=0; --i){
            int currentSum = digits[i] + 1;
            
            if(currentSum>9){
                carry = 1;
                newDigits[i+1] = currentSum%10;
                digits[i] = currentSum%10;
            }
            
            else{
                carry = 0;
                newDigits[i+1] = currentSum;
                digits[i] = currentSum;
                break;
            }
        }
        
        if(carry==1){
            newDigits[0] = 1;
            return newDigits;
        }
        
        return digits;
    }
}