class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;
        int res[] = new int[n];
        
        res[n-1] = -1;
        
        for(int i=n-2; i>=0; --i){
            res[i] = Math.max(arr[i+1],res[i+1]);
        }
        
        return res;
    }
}