class Solution {
    public int myAtoi(String s) {
       s = s.trim();
        
        if(s == null || s.length() == 0 || s.equals(" ")) {
            return 0;
        }
        
     
        
        //To check the signs : To determine whether the number is positive or negative
        char flag = '+';
        
        int i = 0;
        
        if(s.charAt(0) == '+'){
        flag = '+';
        i++;
        }
        
       else if(s.charAt(0) == '-'){
        flag = '-';
        i++;
        }
        
       double res = 0;
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            res = res*10 +(s.charAt(i)-'0');
            i++;
        }
        
        
          if(flag=='-')
             res = -res;
        
       if(res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        //handle overflow
        if(res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
      
        
        return (int)res;
    }
}