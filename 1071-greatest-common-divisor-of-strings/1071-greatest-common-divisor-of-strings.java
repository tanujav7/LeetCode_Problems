class Solution {
    public String gcdOfStrings(String s1, String s2) {
        
        if(!(s1+s2).equals(s2+s1))
            return "";
        
        int s1_len = s1.length();
        
        int s2_len = s2.length();
        
        int gcdLen = getGCD(s1_len, s2_len);
        
        return s1.substring(0, gcdLen);
    }
    
    int getGCD(int x, int y){
        if(y==0)
            return x;
        
        return getGCD(y, x%y);
    }
}