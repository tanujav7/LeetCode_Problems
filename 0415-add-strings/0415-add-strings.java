class Solution {
    public String addStrings(String num1, String num2) {
        
        String s1 = num1;
        String s2 = num2;
        
        if(s1.length()>s2.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        
        int n1 = s1.length();
        int n2 = s2.length();
        
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        
        int sum=0, carry=0;
        String res = "";
        
        for(int i=0; i<n1; i++){
            sum = (s1.charAt(i)-'0')+(s2.charAt(i)-'0')+carry;
            res = res.concat(String.valueOf((char)(sum%10+'0')));
            carry = sum/10;
        }
        
        for(int i=n1; i<n2; i++){
            sum = (s2.charAt(i)-'0')+carry;
            res = res.concat(String.valueOf((char)(sum%10+'0')));
            carry = sum/10;
        }
        
        if(carry>0)
            res = res.concat(String.valueOf((char)(carry%10+'0')));
        
        res = new StringBuilder(res).reverse().toString();
        
        return res;
    }
}