class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        int newDigits[] = new int[n+1];
        int carry = 0;
        
        for(int i=n-1; i>=0; --i){
            int current_sum = digits[i]+1;
            
            if(current_sum>9){
                digits[i] = current_sum%10;
                newDigits[i+1] = digits[i];
                carry = 1;
            }
            
            else{
                carry = 0;
                digits[i] = current_sum;
                newDigits[i+1] = digits[i];
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