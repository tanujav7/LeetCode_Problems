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
        int l1 = s1.length();
        int l2 = s2.length();
        
        if(l1%k>0 || l2%k>0)
            return false;
        else{
            String base = s1.substring(0,k);
            return s1.replace(base,"").isEmpty() &&s2.replace(base,"").isEmpty();
        }
    }
}