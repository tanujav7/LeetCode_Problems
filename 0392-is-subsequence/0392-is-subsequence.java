class Solution {
    public boolean isSubsequence(String s, String t) {
        
        //Using two pointers
        int i=0;//Pointing to 's' string
        int j=0;//Pointing to 't' string
        
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        
        return i==s.length();

    }
}