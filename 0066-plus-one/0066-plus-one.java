class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        
        int newDigits[] = new int[n+1];
        
        int carry = 0;
        
        for(int i=n-1; i>=0; --i){
            int currentNum = digits[i] + 1;
            
            if(currentNum>9){
                newDigits[i+1] = currentNum % 10;
                digits[i] = currentNum % 10;
                carry = 1;
            }
            
            else{
                newDigits[i+1] = currentNum;
                digits[i] = currentNum;
                carry = 0;
                break;
            }
        }
        
        if(carry==0)
            return digits;
        
        else{
            newDigits[0] = 1;
            return newDigits;
        }
            
    }
}