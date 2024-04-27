class Solution {
    public int[] countBits(int n) {
        
        int arr[] = new int[n+1];
        
        for(int i=0; i<=n; i++){
            int oneCount = getOneCount(i);
            arr[i] = oneCount;
        }
        
        return arr;
    }
    
    int getOneCount(int n){
        int res[] = new int[10005];
        int i = 0;
        
        while(n>0){
            res[i++] = n % 2;
            n = n/2;
        }
        
        int count = 0;
        
        for(int k : res){
            if(k==1)
                count++;
        }
        
        return count;
    }
}