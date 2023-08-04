class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int sum = 0;
        
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        
        int avg = sum/k;
        
        int subarrays = 0;
        
        if(avg>=threshold)
            subarrays++;
        
        int n = arr.length;
        for(int i=k; i<n; i++){
            sum = sum + arr[i] - arr[i-k];
            avg = sum/k;
            if(avg>=threshold)
            subarrays++;
        }
        
        return subarrays;
    }
}