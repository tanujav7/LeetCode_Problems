class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int sum = 0;
        int countAvg = 0;
        
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        
        int avg = sum/k;
        
         if(avg>=threshold)
                countAvg++;
        
         for(int i=k; i<arr.length; i++){
            sum+=arr[i]-arr[i-k];
            avg = sum/k;
            if(avg>=threshold)
                countAvg++;
        }
        
        return countAvg;
        
    }
}