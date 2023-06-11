class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        
        if(s==null ||s.equals(" ")||s.length()==0)
            return 0;
        
        char flag = '+';
        
        double res = 0;
        
        int i = 0;
        
        if(s.charAt(0)=='+'){
            flag = '+';
            i++;
        }
        
        else if(s.charAt(0)=='-'){
            flag = '-';
            i++;
        }
        
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            res = res*10 + (s.charAt(i)-'0');
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