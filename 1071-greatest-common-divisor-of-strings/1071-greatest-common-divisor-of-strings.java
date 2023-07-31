class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        
        if(!((str1+str2).equals(str2+str1)))
            return "";
        
        int k = gcdOfLength(n1,n2);
        return str1.substring(0,k);
        
    }
    
    int gcdOfLength(int x, int y){
        if(y==0)
            return x;
        else
            return gcdOfLength(y,x%y);
    }
}