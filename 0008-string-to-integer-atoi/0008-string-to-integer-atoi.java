class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        
        if(s.isEmpty())
            return 0;
        
        char flag = '+';
        int n = s.length();
        int i = 0;
        
        if(s.charAt(0)=='+'){
            flag = '+';
            i++;
        }
        
       else if(s.charAt(0)=='-'){
            flag = '-';
            i++;
        }
        
        double res = 0;
        
        while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            res = res*10 + s.charAt(i)-'0';
            i++;
        }
        
        if(flag=='-')
            res = -res;
        
        if(res<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        if(res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        return (int)(res);
    }
}