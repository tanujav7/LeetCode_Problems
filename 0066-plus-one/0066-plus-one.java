class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        
        int res[] = new int[len+1];
        
        int i = 0;
        
        int carry = 0;
        
        for(i=len-1; i>=0; --i){
            int currentNum = digits[i] + 1;
            if(currentNum<=9){
                digits[i] = currentNum;
                carry = 0;
                break;
            }
            
            else{
                res[i+1] = currentNum % 10;
                digits[i] = currentNum % 10;
                carry = currentNum / 10;
            }
        }
        
        res[0] = carry;
  
        
        if(carry==0)
        return digits;
        
        return res;
    }
}