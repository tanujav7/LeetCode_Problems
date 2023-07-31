class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        
        for(int i=Math.min(n1,n2); i>=1; --i){
            if(checkGCD(str1,str2,i))
                return str1.substring(0,i);
        }
        
        return "";
    }
    
    boolean checkGCD(String s1, String s2, int k){
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1%k>0 || len2%k>0)
            return false;
        else{
            String s = s1.substring(0,k);
            return s1.replace(s,"").isEmpty() && s2.replace(s,"").isEmpty();
        }
    }
}