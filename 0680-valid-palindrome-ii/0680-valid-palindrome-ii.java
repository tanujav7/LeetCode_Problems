class Solution {
    public boolean validPalindrome(String s) {
        
        //Two pointers initialization
        
        int i=0, j=s.length()-1;
        
        while(i<j && (s.charAt(i)==s.charAt(j))){
                i++;
                j--;
            }
        
        
        return isPal(s,i+1,j) || isPal(s,i,j-1);
    }
    
    boolean isPal(String s, int i, int j){
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
    
        return true;
    }
}