class Solution {
    public boolean validMountainArray(int[] arr) {
        //If arr.length<3, it cannot be a mountain array -> Given in the problem statement
        if(arr.length<3)
            return false;
       
        int n = arr.length;
        int i = 0;
        
        while(i+1<n && arr[i]<arr[i+1])
            i++;
        
        if(i==0 || i==n-1)
            return false;
        
        while(i+1<n && arr[i]>arr[i+1])
            i++;
        
        return i==n-1;
    }
}