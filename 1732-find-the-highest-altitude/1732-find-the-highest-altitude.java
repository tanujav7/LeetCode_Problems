class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int arr[] = new int[n+1];
        
        arr[0] = 0;
        arr[1] = gain[0];
        int sum = 0;
        for(int i=1; i<n+1; i++){
            arr[i] = gain[i-1]+sum;
            sum+=gain[i-1];
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n+1; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        
        return max;
    }
}