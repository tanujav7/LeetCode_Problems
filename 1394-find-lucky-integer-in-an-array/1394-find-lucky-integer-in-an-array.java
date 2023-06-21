class Solution {
    public int findLucky(int[] arr) {
        
        int count = -1;
        
        int freq[] = new int[501];
        
        for(int i=0; i<arr.length; i++)
            freq[arr[i]]++;
        
        for(int i=1; i<freq.length; i++){
            if(i==freq[i])
                count=i;
        }
        
        return count;
    }
}