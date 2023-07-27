class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        
        int gcdLength = findGCD(str1.length(),str2.length());
        return str1.substring(0,gcdLength);
        
    }
    
    int findGCD(int x, int y){
        if(y==0)
            return x;
        return findGCD(y, x%y);
    }
}