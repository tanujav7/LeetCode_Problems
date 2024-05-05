class Solution {
    public String longestCommonPrefix(String[] strs) {
        return longestCommonPrefix(strs, 0, strs.length-1);
    }
    
    String longestCommonPrefix(String strs[], int low, int high){
        if(low==high)
            return strs[low];
        
        int mid = low + (high-low)/2;
        
        String lcpLeft = longestCommonPrefix(strs, low, mid);
        String lcpRight = longestCommonPrefix(strs, mid+1, high);
        
        return lcp(lcpLeft, lcpRight);
    }
    
    String lcp(String left, String right){
        int min = Math.min(left.length(), right.length());
        
        for(int i=0; i<min; i++){
            if(left.charAt(i)!=right.charAt(i))
                return left.substring(0, i);
        }
        
        return left.substring(0, min);
    }
}