class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.isEmpty())
            return true;
        
        s = s.toLowerCase();
        
        s = s.replaceAll("[^0-9a-zA-Z]","");
        
        StringBuilder rev = new StringBuilder(s);
        
        rev = rev.reverse();
        
        String revStr = rev.toString();
        
        if(s.equals(revStr))
            return true;
        
        return false;
    }
}