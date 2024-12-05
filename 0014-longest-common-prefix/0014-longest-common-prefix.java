class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
       return longestCommonPrefix(strs, 0, n-1);
    }
    
    String longestCommonPrefix(String strs[], int l, int r){
        if(l==r)
            return strs[l];
        
        int mid = l+(r-l)/2;
        String lcpLeft = longestCommonPrefix(strs, l, mid);
        String lcpRight = longestCommonPrefix(strs, mid+1, r);
        return getCommon(lcpLeft, lcpRight);
    }
    
    String getCommon(String left, String right){
        int min = Math.min(left.length(), right.length());
        
        for(int i=0; i<min; i++){
            if(left.charAt(i)!=right.charAt(i))
                return left.substring(0, i);
        }
        
        return left.substring(0, min);
    }
}