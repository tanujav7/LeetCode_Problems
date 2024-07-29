class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0, j = 0;
        
        int s_len = s.length();
        
        int t_len = t.length();
        
        while(i<s_len && j<t_len){
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        
        return i==s_len;
    }
}