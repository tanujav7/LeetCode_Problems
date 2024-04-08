class Solution {
    public int strStr(String haystack, String needle) {
        
        int n1 = haystack.length();
        int n2 = needle.length();
        
        for(int i=0; i<n1-n2+1; i++){
            String comp = haystack.substring(i, i+n2);
            
            if(comp.equals(needle))
                return i;
        }
        
        return -1;
        
    }
}