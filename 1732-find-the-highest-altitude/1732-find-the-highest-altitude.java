class Solution {
    public int largestAltitude(int[] gain) {
        
        int res = 0;
        
        int n = gain.length;
        
        int arr[] = new int[n+1];
        
        int j = 0;
        
        arr[0] = 0;
        
        for(int i=1; i<n+1; i++){
            arr[i] = arr[i-1] + gain[j++];
        }
        
        for(int i=0; i<n+1; i++){
            res = Math.max(res, arr[i]);
        }
        
        return res;
    }
}