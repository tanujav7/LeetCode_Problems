class Solution {
    public int myAtoi(String s) {
        
  
        
        s = s.trim();
        
              if(s.equals(""))
            return 0;
        
        int sign = '+';
        
        int i = 0;
        
        int n = s.length();
        
         if(s.charAt(0)=='-'){
            sign = '-';
            i++;
         }
        
        else if(s.charAt(0)=='+'){
            sign = '+';
            i++;
        }
        
        double num = 0;
        
        while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            num = num*10 + s.charAt(i)-'0';
            i++;
        }
        
    //    num = num * sign;
        if(sign=='-')
            num = -num;
        
        if(num>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        if(num<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int)(num);
    }
}