class Solution {
    public int largestAltitude(int[] gain) {
        
        int max_sum = 0;
        int n = gain.length;
        int arr[] = new int[n+1];
        arr[0] = 0;
        
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + gain[i-1];
            max_sum = Math.max(max_sum,arr[i]);
        }
        
        return max_sum;
    }
}