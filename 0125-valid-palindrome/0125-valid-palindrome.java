class Solution {
    public boolean isPalindrome(String s) {
        
        int n = s.length();
        int i = 0, j = n-1;
        
        s = s.toLowerCase();
        
        while(i<=j){
            
            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')))
                i++;
            
            while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') || (s.charAt(j)>='0' && s.charAt(j)<='9')))
                j--;
            
            if(s.charAt(i)!=s.charAt(j))
                return false;
            
            else{
                i++;
                j--;
            }
        }
        
        return true;
    }
}