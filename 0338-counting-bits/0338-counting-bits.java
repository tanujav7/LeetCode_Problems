class Solution {
    public int[] countBits(int n) {
        
        int len = n+1;
        int arr[] = new int[len];
        
        for(int i=0; i<=n; i++){
            arr[i] = binary(i);
        }
        
        return arr;
    }
    
    int binary(int num){
        int bin[] = new int[35];
        int index = 0;
        int count = 0;
        
        while(num!=0){
            bin[index++] = num%2;
            num = num/2;
        }
        
        for(int i=0; i<35; i++){
            if(bin[i]==1)
                count++;
        }
        
        return count;
    }
}