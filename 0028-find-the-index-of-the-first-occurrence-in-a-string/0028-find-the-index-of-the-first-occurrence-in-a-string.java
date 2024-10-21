class Solution {
    public int strStr(String haystack, String needle) {
        
        
        
        int haystack_len = haystack.length();
        int needle_len = needle.length();
        
        for(int i=0; i<haystack_len-needle.length()+1; i++){
            String str = haystack.substring(i, i+needle.length());
            
            if(str.equals(needle))
                return i;
        }
        
        return -1;
    }
}