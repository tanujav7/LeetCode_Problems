class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int countSubarray = 0;

        int sum = 0;
        
        for(int i=0; i<k; i++){
            sum +=arr[i];
        }
        
         int average = 0;
        
          average = sum/k;
            if(average>=threshold)
                countSubarray++;
        
        for(int i=k; i<arr.length; i++){
             sum+=arr[i]-arr[i-k];
            average = sum/k;
            if(average>=threshold)
                countSubarray++;
         }
        
        return countSubarray;
    }
}