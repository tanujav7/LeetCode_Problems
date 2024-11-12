class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length;
        
        int res[] = new int[n+1];
        
        res[0] = 0;
        
        for(int i=1; i<n+1; i++){
            res[i] = gain[i-1] + res[i-1];
        }
        
        int max = 0;
        
        for(int i=0; i<res.length; i++){
            max = Math.max(res[i], max);
        }
        
        return max;
    }
}