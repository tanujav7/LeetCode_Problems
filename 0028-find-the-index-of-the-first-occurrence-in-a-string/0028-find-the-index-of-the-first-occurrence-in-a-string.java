class Solution {
    public int strStr(String haystack, String needle) {
        
        int haystack_len = haystack.length();
        int needle_len = needle.length();
        
        for(int i=0; i<haystack_len-needle_len+1; i++){
            String str = haystack.substring(i, i+needle_len);
            
            if(str.equals(needle))
                return i;
        }
        
        return -1;
    }
}