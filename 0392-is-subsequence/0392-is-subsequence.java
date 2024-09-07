class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int s_len = s.length();
        int t_len = t.length();
        
        int i = 0, j = 0;
        
        while(i<s_len && j<t_len){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            
            else{
                j++;
            }
        }
        
        return i==s_len;
    }
}