class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        
        char flag = '+';
        int i=0;
        
        if(s.equals(""))
            return 0;
        
        if(s.charAt(0)=='+'){
            flag = '+';
            i++;
        }
        
       else if(s.charAt(0)=='-'){
            flag = '-';
            i++;
        }
        
        double res = 0;
        
        while(i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            res = res*10 + (s.charAt(i)-'0');
            i++;
        }
        
        if(flag=='-')
            res = -res;
        
        if(res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        if(res<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int)res;
    }
}