class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        return lcp(strs, 0, n-1);
    }
    
    String lcp(String strs[], int left, int right){
        if(left==right){
            return strs[left];
        }
        
        int mid = left + (right-left)/2;
        
        String lcpLeft = lcp(strs, left, mid);
        
        String lcpRight = lcp(strs, mid+1, right);
        
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