class Solution {
    public int strStr(String haystack, String needle) {
        
        int m = haystack.length();
        int n = needle.length();
        
        for(int i=0; i<m-n+1; i++){
            String comp = haystack.substring(i, i+n);
            
            if(comp.equals(needle))
                return i;
        }
        
        return -1;
    }
}