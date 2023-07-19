class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
       String str = s.replaceAll("[^0-9a-zA-Z]", "");
        
        StringBuilder revStr = new StringBuilder(str);
        revStr = revStr.reverse();
        String rev = revStr.toString();
        
        if(rev.equals(str))
            return true;
        
        else
            return false;
    }
}