class Solution {
    public boolean isPalindrome(String s) {
         if(s.isEmpty())         // if String s is empty return true
        return true; 

        String str = s.toLowerCase();// convert the whole string into lower case alphabet
     
    //remove non-alphanumeric characters
    // replace the given string with empty string except the pattern [^a-zA-Z0-9]
    str = str.replaceAll("[^a-zA-Z0-9]", "");
     
    //The reverse() method of StringBuilder is used to reverse the characters in the StringBuilder.
    StringBuilder revstr = new StringBuilder(str);
    revstr.reverse();
    String rstr = revstr.toString();
     
    if(str.equals(rstr))//if string and reversed string both are equal return true
        return true;
     
    return false;      
    }
}