class Solution {
    public int largestAltitude(int[] gain) {
        
        int n = gain.length;
        
        int arr[] = new int[n+1];
        
        arr[0] = 0;
        int max = 0;
        
        for(int i=1; i<n+1; i++){
            arr[i] = arr[i-1] + gain[i-1];
            max = Math.max(max, arr[i]);
        }
        
        return max;
    }
}