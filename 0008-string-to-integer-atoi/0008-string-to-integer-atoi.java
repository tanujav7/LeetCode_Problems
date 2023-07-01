class Solution {
    public int myAtoi(String s) {
      
      
        s = s.trim();
        
          if(s==null || s.equals(""))
            return 0;
        
        
        char flag = '+';
        int i=0;
        
        if(s.charAt(i)=='+'){
            flag = '+';
            i++;
        }
        
        else if(s.charAt(i)=='-'){
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
        
        if(res<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        if(res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        return (int)res;
    }
}