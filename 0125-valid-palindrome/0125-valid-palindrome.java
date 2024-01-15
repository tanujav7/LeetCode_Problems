class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        
        int n = s.length();
        
        int i = 0, j = n-1;
        
        while(i<j){
            
            while(i<j && !Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)))
                i++;
            while(i<j && !Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j)))
                j--;
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            
            else
            return false;
        }
        
        return true;
    }
}