class Solution {
    public String addStrings(String num1, String num2) {
        
        if(num2.length()<num1.length()){
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        int n1 = num1.length();
        int n2 = num2.length();
        
        
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        
        String res = "";
        
        int carry = 0;
        
        for(int i=0; i<n1; i++){
        
            int sum = ((num1.charAt(i)-'0') + (num2.charAt(i)-'0') + carry);
            res = res.concat(String.valueOf((char)(sum%10+'0')));
            carry = sum/10;

        }
        
        for(int i=n1; i<n2; i++){
            
            int sum = (num2.charAt(i)-'0')+carry;
            res = res.concat(String.valueOf((char)(sum%10+'0')));
            carry = sum/10;
            
        }
        
        if(carry>0)
            res = res.concat(String.valueOf((char)(carry%10+'0')));
        
       res = new StringBuilder(res).reverse().toString();
        
        return res;
    }
}