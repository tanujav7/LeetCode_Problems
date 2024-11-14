class Solution {
    public int[] countBits(int n) {
        
        int res[] = new int[n+1];
        
        for(int i=0; i<=n; i++){
           res[i] = countOnes(i);
        }
        
        return res;
    }
    
    int countOnes(int n){
        int binary[] = new int[10000];
        int i=0;
        
        while(n!=0){
            binary[i++] = n % 2;
            n = n/2;
        }
        
        int count = 0;
        
        for(int j=0; j<binary.length; j++){
            if(binary[j]==1)
                count++;
        }
        
        return count;
    }
}