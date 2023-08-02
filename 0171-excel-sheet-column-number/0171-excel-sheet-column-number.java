class Solution {
    public int titleToNumber(String columnTitle) {
        
        int res = 0;
        int n = columnTitle.length();
        int POW = n-1;
        
        for(int i = 0; i<n; i++){
            char ch = columnTitle.charAt(i);
            res += ((ch-'A')+1) * Math.pow(26,POW);
            POW--;
        }
        
        return res;
    }
}